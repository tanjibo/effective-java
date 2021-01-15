package cn.medbanks.posts;

/**
 * The type Nutrition facts.
 *
 * @author weaving
 * @since 2021 /1/15 16:04
 */
public class NutritionFacts {


    private final int servingSize;

    private final int servings;

    private final int calories;

    private final int fat;

    private final int sodium;

    private final int carbohydrate;


    /**
     * Instantiates a new Nutrition facts.
     *
     * @param servingSize the serving size
     * @param servings    the servings
     */
    public NutritionFacts(int servingSize, int servings) {
        this(servingSize, servings, 0);
    }

    /**
     * Instantiates a new Nutrition facts.
     *
     * @param servingSize the serving size
     * @param servings    the servings
     * @param calories    the calories
     */
    public NutritionFacts(int servingSize, int servings, int calories) {
        this(servingSize, servings, calories, 0);
    }

    /**
     * Instantiates a new Nutrition facts.
     *
     * @param servingSize the serving size
     * @param servings    the servings
     * @param calories    the calories
     * @param fat         the fat
     */
    public NutritionFacts(int servingSize, int servings, int calories, int fat) {
        this(servingSize, servings, calories, fat, 0);
    }

    /**
     * Instantiates a new Nutrition facts.
     *
     * @param servingSize the serving size
     * @param servings    the servings
     * @param calories    the calories
     * @param fat         the fat
     * @param sodium      the sodium
     */
    public NutritionFacts(int servingSize, int servings, int calories, int fat, int sodium) {
        this(servingSize, servings, calories, fat, sodium, 0);
    }

    /**
     * Instantiates a new Nutrition facts.
     *
     * @param servingSize  the serving size
     * @param servings     the servings
     * @param calories     the calories
     * @param fat          the fat
     * @param sodium       the sodium
     * @param carbohydrate the carbohydrate
     */
    public NutritionFacts(int servingSize, int servings, int calories, int fat, int sodium, int carbohydrate) {
        this.servingSize = servingSize;
        this.servings = servings;
        this.calories = calories;
        this.fat = fat;
        this.sodium = sodium;
        this.carbohydrate = carbohydrate;
    }

    public static void main(String[] args) {
        NutritionFacts nutritionFacts = new NutritionFacts(0, 0);
        NutritionFacts nutritionFacts1 = new NutritionFacts(0, 0, 1123);

        System.out.println(nutritionFacts);
    }

}
