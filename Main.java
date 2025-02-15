// Code by Lymeng date:15/02/25

// Tax calculator system

class Main {
    
    public static void main(String[] args) {
        float salary = 3000;
        float tax = taxCalculator(salary);
        System.out.println("salary:"+salary+"$"+"->taxCalculator:"+tax+"$");
    }
    
    //calcualte tax
    private static float taxCalculator(float salary){
        if(salary < 1000f){
            return 100f;
        }else if(salary < 2000f){
            return 100f+extraTaxCalculator(salary);
        }else{
            return 150f+extraTaxCalculator(salary);
        }
    }
    
    //calculate excessSalary
    private static float extraTaxCalculator(float salary){
        if(salary < 2000f){
            float excessSalary = salary - 1000f;
            return (excessSalary * 20f)/100f;
        }else{
            float excessSalary = salary - 2000f;
            return (excessSalary * 30f)/100f;
        }
    }
}
