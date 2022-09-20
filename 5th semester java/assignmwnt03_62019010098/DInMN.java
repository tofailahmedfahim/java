package com.company;

//class for calculate days in a month
public class DInMN {
    private  int month;
    private int year;


    public int getNumberOfDays(){
        int numberOfDays = 0;
        switch (month){
            //jan
            case 1:
                numberOfDays =31;
                break;
            //feb
            case 2:
                //checking for leap year
                if(year % 100 == 0){
                    if(year % 400 == 0){
                        numberOfDays = 29;
                    }
                    else if(year % 4 == 0) {
                        numberOfDays = 29;
                    }
                    else {
                        numberOfDays = 28;
                    }
                }

                break;
            //mar
            case 3:
                numberOfDays = 31;
                break;
            //apr
            case 4:
                numberOfDays = 30;
                break;
            //may
            case 5:
                numberOfDays = 31;
                break;
            //jun
            case 6:
                numberOfDays = 30;
                break;
            //july
            case 7:
                numberOfDays = 31;
                break;
            //aug
            case 8:
                numberOfDays = 31;
                break;
            //sep
            case 9:
                numberOfDays = 30;
                break;
            //oct
            case 10:
                numberOfDays = 31;
                break;
            //nov
            case 11:
                numberOfDays = 30;
                break;
            //dec
            case 12:
                numberOfDays = 31;
                break;
        }
        return numberOfDays;
    }
    public DInMN (int monthGiven,int yearGiven){
        month = monthGiven ;
        year = yearGiven;
    }


}
