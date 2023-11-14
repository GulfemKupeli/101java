package problem02;
import java.util.Scanner;
public class problem02 {
	public static void main(String[] args) {
		
		/**
   	 Program description: I developed a nutrition calculator for a fitness app. This calculator helps users determine how many servings of a specific food item they should consume to meet their daily nutritional goals.
   	 Author: Gülfem Küpeli
   	 E-mail address: 210401024@ogr.ikcu.edu.tr
   	 Homework Number: 01
   	 Last Changed: 20/10/2023
   	 */

        System.out.println("Welcome to the Nutritional Goals Calculator!\nPlease provide the nutritional content per serving of the food item:");
        //In this section we get the serving weight informations from user.
        System.out.println("\nCalories per serving:");
        Scanner cal = new Scanner(System.in);
        int cal_serving = cal.nextInt();
        System.out.println("\nProtein per serving(grams): ");
        Scanner pro = new Scanner(System.in);
        int pro_serving = pro.nextInt();
        System.out.println("\nCarbohydrates per serving(grams): ");
        Scanner carb = new Scanner(System.in);
        int carb_serving = carb.nextInt();
        System.out.println("\nFat per serving(grams): ");
        Scanner fat = new Scanner(System.in);
        int fat_serving = fat.nextInt();

        System.out.println("\nNow, enter your daily nutritional goals:");
        //Here we take the daily goals from user.
        System.out.println("\nDaily calorie goal: ");
        Scanner day_cal = new Scanner(System.in);
        int day_calorie = day_cal.nextInt();
        System.out.println("\nDaily protein goal(grams): ");
        Scanner day_pro = new Scanner(System.in);
        int day_protein = day_pro.nextInt();
        System.out.println("\nDaily carbohydrates goal(grams): ");
        Scanner day_carb = new Scanner(System.in);
        int day_carbohydrates = day_carb.nextInt();
        System.out.println("\nDaily fat goal(grams): ");
        Scanner day_f = new Scanner(System.in);
        int day_fat = day_f.nextInt();

        float calorie_per = day_calorie / cal_serving ;
        int calorie_per_int = (int) calorie_per;

        float protein_per = day_protein / pro_serving ;
        int protein_per_int = (int) protein_per;

        float carbohydrates_per = day_carbohydrates / carb_serving;
        int carbohydrates_per_int = (int) carbohydrates_per;

        float fat_per = day_fat / fat_serving;
        int fat_per_int = (int) fat_per;

        System.out.println("\nCalculating Nutritional Goals...\n");
        System.out.println("\nTo meet your daily calorie goal of " + day_calorie + " calories, you should consume " + calorie_per_int + " servings of the food item.");
        System.out.println("\nTo meet your daily protein goal of " + day_protein  + " grams, you should consume " + protein_per_int + " servings of the food item.");
        System.out.println("\nTo meet your daily carbohydrates goal of " + day_carbohydrates + " grams, you should consume " + carbohydrates_per_int + " servings of the food item.");
        System.out.println("\nTo meet your daily fat goal of " + day_fat  + " grams, you should consume " + fat_per_int  + " servings of the food item.");















    }
	

}
