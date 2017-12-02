package info.wecode.activities;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import info.wecode.MainActivity;
import info.wecode.R;

/**
 * Created by alexabaldwin on 12/2/17.
 */

public class FAQActivity extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LayoutInflater inflater = (LayoutInflater) this
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View contentView = inflater.inflate(R.layout.faq_main, null, false);
        mDrawer.addView(contentView, 0);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView question1 = findViewById(R.id.questionTV2);
        question1.setText("Why is donor milk important?");
        TextView answer1 = findViewById(R.id.answerTV2);
        answer1.setText("Breastmilk is the ideal food for the human infant. Breastmilk has a wealth of easily digestible nutrients, which are vital for premature, ill, and otherwise fragile babies.  When a mother’s own milk is not available, milk donated by a screened donor is an infant’s next best choice. Breastmilk offers numerous long-term health benefits for infants, and can lower risk of illness and various developmental disorders.");

        TextView question2 = findViewById(R.id.questionTV14);
        question2.setText("Where is donor milk available for Northwest families?");
        TextView answer2 = findViewById(R.id.answerTV14);
        answer2.setText("Northwest Mothers Milk Bank is located in Portland, Oregon, and dispenses pasteurized donor human milk to hospitals and families throughout Oregon, Washington, Idaho, and Alaska.");

        TextView question3 = findViewById(R.id.questionTV13);
        question3.setText("Who will benefit from my milk?");
        TextView answer3 = findViewById(R.id.answerTV13);
        answer3.setText("The highest priority recipients are preterm and ill, hospitalized infants. All infants who have a medical need for human milk can obtain donor breastmilk by prescription.");

        TextView question4 = findViewById(R.id.questionTV12);
        question4.setText("Who donates breastmilk to the milk bank?");
        TextView answer4 = findViewById(R.id.answerTV12);
        answer4.setText("Healthy, non-smoking women who are able to express more milk than their babies need donate to the milk bank. Donor moms have hearts of gold--they are willing to go through a brief screening process and submit a blood sample before donating to help improve the health of infants in their communities.");

        TextView question5 = findViewById(R.id.questionTV11);
        question5.setText("Is there a need for pasteurized donor milk?");
        TextView answer5 = findViewById(R.id.answerTV11);
        answer5.setText("Yes! Currently the need for pasteurized donor milk far exceeds the available supply. Donated milk is vital for preterm and hospitalized infants in need.");

        TextView question6 = findViewById(R.id.questionTV10);
        question6.setText("Where does my milk go?");
        TextView answer6 = findViewById(R.id.answerTV10);
        answer6.setText("Your milk is distributed locally to babies in need. NWMMB provides donated pasteurized milk to every Level 3 NICU in Oregon and hospitals across Washington, Alaska, and Idaho. Since our opening, over 260,000 ounces of donated pasteurized breastmilk was distributed to fragile and premature infants in over 50 hospitals across the Pacific Northwest.");

        TextView question7 = findViewById(R.id.questionTV9);
        question7.setText("Is donor milk safe?");
        TextView answer7 = findViewById(R.id.answerTV9);
        answer7.setText("Yes. The Northwest Mothers Milk Bank follows strict screening, processing, and dispensing guidelines established by the Human Milk Banking Association of North America (HMBANA) to ensure the safety of donor breastmilk. These guidelines have been established with the advisement of the Centers for Disease Control, the Food and Drug Administration, and the blood and tissue industries. Potential milk donors provide complete medical and lifestyle histories and undergo blood tests similar to the screening process used at blood banks. Donated milk is then pasteurized to kill any bacteria or viruses. Before the pasteurized milk is dispensed, bacteriological testing is performed at the Oregon State Public Health Lab to ensure its safety.");

        TextView question8 = findViewById(R.id.questionTV8);
        question8.setText("What are the different types of pasteurization processes?");
        TextView answer8 = findViewById(R.id.answerTV8);
        answer8.setText("We process our donated breastmilk through the only proven safe pasteurization process, called the Holder Method. Milk is gently heated in a shaking water bath, killing bacteria and viruses but retaining the majority of nutritional components. Supported by the Human Milk Banking Association of North America (HMBANA), the World Health Organization, and the Centers for Disease Control, our pasteurization processes adheres to the highest safety methods established in the milk banking community. After pasteurization, breastmilk must be frozen within 48 hours and tested for safety.\n" +
                " \n" +
                "Some for-profit breastmilk laboratories use a process called Ultra-High Temperature (UHT), in which the milk is heated to above 280 degrees Fahrenheit. While this process kills bacteria, it also reduces nutritional values; UHT-treated milk has lower levels of folate, thiamin, and vitamins B12 and C than traditionally pasteurized milk. UHT is not FDA approved for breastmilk and there is little to no medical research into the efficacy and safety of the method.\n" +
                " \n" +
                "Because our donors are thoroughly screened and the milk is carefully pasteurized and tested, we know it is the best and safest option for infants who are unable to get their mother's own milk.");

        TextView question9 = findViewById(R.id.questionTV7);
        question9.setText("Why do hospitals and outpatients pay a processing fee for human donor milk?");
        TextView answer9 = findViewById(R.id.answerTV7);
        answer9.setText("Donated milk is vital for premature infants and is a true donation. The processing fee covers the cost of pasteurizing, packaging, and delivering breast milk. It helps offsets costs to the families who receive the breastmilk. When possible, the fees fund our charitable care foundation, which ensures that all babies with medical needs are able to access this life-saving resource.");

        TextView question10 = findViewById(R.id.questionTV6);
        question10.setText("Why is the screening process necessary?");
        TextView answer10 = findViewById(R.id.answerTV6);
        answer10.setText("The screening process ensures the safety of both donors and recipients. Before donating milk, donor moms undergo a medical history and blood test, at no cost to them. This ensures that the donors are healthy and their milk is safe to be processed and distributed.\n" +
                "\n" +
                "It is extremely important for us to know that we are not taking away breastmilk from one infant to give it to another. This is why we require a signed release from every infant’s physician before their mother can donate her milk. This way, we always know that every infant’s health and nutrition requirements are being met.");

        TextView question11 = findViewById(R.id.questionTV5);
        question11.setText("How is donor milk dispensed?");
        TextView answer11 = findViewById(R.id.answerTV5);
        answer11.setText("Donor milk is dispensed by prescription only.");

        TextView question12 = findViewById(R.id.questionTV4);
        question12.setText("Are you a not-for-profit or for-profit milk bank?");
        TextView answer12 = findViewById(R.id.answerTV4);
        answer12.setText("The Northwest Mothers Milk Bank is a not-for-profit milk bank, which means any surplus revenue is directed back towards processing and distributing more donor milk.  Our sole motivation is to save the lives of babies throughout the Pacific Northwest, and are sustained through our volunteers, tireless staff, healthcare partners, community foundations, passionate Board of Directors, and YOU.\n" +
                " \n" +
                "For-profit milk banks are privately owned by individuals through stock options and are aimed at increasing profits for the owners.");

        TextView question13 = findViewById(R.id.questionTV3);
        question13.setText("What does it mean to be a not-for-profit milk bank?");
        TextView answer13 = findViewById(R.id.answerTV3);
        answer13.setText("Our sole motivation is to save the lives of babies throughout the Pacific Northwest, and any surplus revenue we receive is directed back towards identifying milk donors, processing, and distributing more donor milk to infants who need it the most. Our organization is sustained through our volunteers, tireless staff, healthcare partners, community foundations, hundreds of donors, and a passionate Board of Directors.\n" +
                " \n" +
                "NWMMB is a member of the Human Milk Banking Association of North America, the leading professional organization of not-for-profit milk banks in Mexico, Canada, and the United States. For-profit milk banks are privately owned by individuals through stock options, are aimed at increasing profits for the owners, and most often sell their pasteurized breastmilk to mothers across the nation and large corporations.");
    }

}
