interface Bank{  
    float rateOfInterest(); 
    int a =5;

    }  
    class SBI implements Bank{  
    public float rateOfInterest(){return 9.15f;}  
    }  
    class PNB implements Bank{  
    public float rateOfInterest(){return 9.7f;}  
    }  
    class TestInterface2{  
    public static void main(String[] args){  
    Bank b=new SBI();  
    System.out.println("ROI SBI: "+b.rateOfInterest());  
    }}