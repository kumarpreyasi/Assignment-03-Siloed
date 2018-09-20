public class Main {

    public static void main(String[] args) {

        //calculate volume of each tower
        //add all tower volumes together to find total available water
        //calculate normal water usage in 28 days
        //calculate the water difference
        //find water each person needs to save per day

        float pi = 3.14f;

        float h1 = 72.0f; float d1 = 22.0f;   //h = height of water tower, d = diameter of water tower
        float h2 = 19.0f; float d2 = 18.0f;
        float h3 = 50.0f; float d3 = 13.0f;
        float h4 = 67.0f; float d4 = 16.0f;
        float h5 = 16.0f; float d5 = 14.0f;
        float h6 = 53.0f; float d6 = 23.0f;
        float h7 = 69.0f; float d7 = 22.0f;
        float h8 = 30.0f; float d8 = 22.0f;
        float h9 = 52.0f; float d9 = 23.0f;
        float h10 = 40.0f; float d10 = 16.0f;
        float h11 = 31.0f; float d11 = 18.0f;
        float h12 = 75.0f; float d12 = 23.0f;

        float v1 = pi*(d1/2)*(d1/2)*h1;    // v = volume of water tower aka amount of water in water tower, calculated with v = pi*(d/2)*(d/2)*h
        float v2 = pi*(d2/2)*(d2/2)*h2;
        float v3 = pi*(d3/2)*(d3/2)*h3;
        float v4 = pi*(d4/2)*(d4/2)*h4;
        float v5 = pi*(d5/2)*(d5/2)*h5;
        float v6 = pi*(d6/2)*(d6/2)*h6;
        float v7 = pi*(d7/2)*(d7/2)*h7;
        float v8 = pi*(d8/2)*(d8/2)*h8;
        float v9 = pi*(d9/2)*(d9/2)*h9;
        float v10 = pi*(d10/2)*(d10/2)*h10;
        float v11 = pi*(d11/2)*(d11/2)*h11;
        float v12 = pi*(d12/2)*(d12/2)*h12;

        float totalWater = v1+v2+v3+v4+v5+v6+v7+v8+v9+v10+v11+v12;  //totalWater = sum of volumes of water towers, this is the amount of water available in keane

        System.out.println("There is a total of " + totalWater + " cubic meters of water available in the water towers in Keane, Utah.");

        int pop = 37640;
        float avgWatperday = 0.246f;
        float avgWat = 28*pop*avgWatperday;

        System.out.println("On average, " + avgWat + " cubic meters of water would be used by the people of Keane in 28 days.");

        float watDiff = avgWat - totalWater;

        float save = (watDiff/28)/pop; //save = amount each person needs to save in cubic meters per day, .246 cubic meters of water = 65 gallons of water, use ratio .246:65 to convert 'save' cubic meters to gallons of water

        System.out.println("Each person will need to save " + save + " cubic meters or " + ((save*65)/.246) + " gallons of water per day.");

    }
}
