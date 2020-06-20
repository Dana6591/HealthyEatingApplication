package com.example.healthyapplication;

import java.util.ArrayList;
import java.util.List;

public class Fooddetail {
    private static final String[]food={"Strawberry","Banana","Lettuce","Coffee","Beef","Egg"};
    private static final String[]NOfood={"Potato,Cherry","Yam,Potato","Mint,Honey","Tea,Black fungus",
            "Orange,Brown Sugar,White spirit","Soy milk,Potato,Pineapple"};
    private static final int[]resId ={R.mipmap.ic_strawberry,R.mipmap.ic_banana,R.mipmap.ic_lettuce,
    R.mipmap.ic_coffee,R.mipmap.ic_beef,R.mipmap.ic_egg};
    private static final String[]foofinfo={"One serving (100 g; see Table) of strawberries contains approximately 33 kilocalories,is an excellent source of vitamin C, a good source of manganese,and provides several other vitamins and dietary minerals in lesser amounts",
            " Raw bananas (not including the peel) are 75% water, 23% carbohydrates, 1% protein, and contain negligible fat. A 100-gram reference serving supplies 89 Calories, 31% of the US recommended Daily Value (DV) of vitamin B6, and moderate amounts of vitamin C, manganese and dietary fiber, with no other micronutrients in significant content (see table). ",
            "  Depending on the variety, lettuce is an excellent source (20% of the Daily Value, DV, or higher) of vitamin K (97% DV) and vitamin A (21% DV) (table), with higher concentrations of the provitamin A compound, beta-carotene, found in darker green lettuces, such as romaine.[32] With the exception of the iceberg variety, lettuce is also a good source (10–19% DV) of folate and iron (table). ",
            " A 2017 review of clinical trials found that drinking coffee is generally safe within usual levels of intake and is more likely to improve health outcomes than to cause harm at doses of 3 or 4 cups of coffee daily. Exceptions include possible increased risk in women having bone fractures, and a possible increased risk in pregnant women of fetal loss or decreased birth weight.[4] Results were complicated by poor study quality, and differences in age, gender, health status, and serving size.[4]   ",
            "  Beef is a source of complete protein and it is a rich source (20% or more of the Daily Value, DV) of Niacin, Vitamin B12, iron and zinc.[70] Red meat is the most significant dietary source of carnitine and, like any other meat (pork, fish, veal, lamb etc.), is a source of creatine. Creatine is converted to creatinine during cooking  ",
            "The egg is the organic vessel containing the zygote in which an embryo develops until it can survive on its own, at which point the animal hatches. An egg results from fertilization of an egg cell. Most arthropods, vertebrates (excluding live-bearing mammals), and mollusks lay eggs, although some, such as scorpions, do not.Reptile eggs, bird eggs, and monotreme eggs are laid out of water and are surrounded by a protective shell, either flexible or inflexible. Eggs laid on land or in nests are usually kept within a warm and favorable temperature range while the embryo grows. When the embryo is adequately developed it hatches, i.e., breaks out of the egg's shell. Some embryos have a temporary egg tooth they use to crack, pip, or break the eggshell or covering.   "};

public static List<Foodbean>getAllFoodList(){
    List<Foodbean>list =new ArrayList<>();
    for (int i = 0; i < food.length; i++) {
        Foodbean bean = new Foodbean(food[i],NOfood[i],foofinfo[i],resId[i]);
        list.add(bean);
    }
    return list;
}
}
