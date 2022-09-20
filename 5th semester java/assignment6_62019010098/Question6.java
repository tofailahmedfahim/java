package com.company;

public class Question6 {
        /**
         * Main method
         */
        public static void main(String[] args) {
            //creating object and calling method
            shabik a1 = new shabik();
            System.out.println("1st object " +a1.walk());
            lion a2 = new lion();
            System.out.println("2nd object " +a2.cry());
            tiger a3 = new tiger();
            System.out.println("3rd object " +a3.cry());
            lion c1 = new lion();
            System.out.println("4th object " +c1.walk());
            tiger d1 =new tiger();
            System.out.println("5th object " +d1.walk());
        }
        //create class that have two method
        static class shabik{
            String walk(){
                return null;
            }
            String cry(){
                return null;
            }
        }
        //Cass lion inherited from class shabik()
        static class lion extends shabik{
            //overriding method
            String walk(){
                return null;
            }
            String cry(){
                return null;
            }
        }
    //Cass tiger inherited from class shabik()
    static class tiger extends shabik{
        //overriding method
        String walk(){
            return null;
        }
        String cry(){
            return null;
        }
    }
}