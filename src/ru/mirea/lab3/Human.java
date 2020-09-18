package ru.mirea.lab3;
public class Human {
    public class Hand {
         String length="Две";
        Hand(String length) {
            this.length = length;
        }
        public String getLength() {
            return length;
        }
        public void setLength(String length) {
            this.length = length;
        }
    }
    public class Head {
         String size = "Big";
          String  hairColor = "Blue";
        Head(String size, String hair, String hairColor) {
            this.size = size;
            this.hairColor = hairColor;
        }
        public void setHairColor(String hairColor) {
            this.hairColor = hairColor;
        }
        public void setSize(String size) {
            this.size = size;
        }
        public String getHairColor() {
            return hairColor;
        }
        public String getSize() {
            return size;
        }
    }
    public class Leg {
        int size =4;
        Leg(int size) {
            this.size = size;
        }
        public void setSize(int size) {
            this.size = size;
        }
        public int getSize() {
            return size;
        }
    }

    @Override
    public String toString() {
        return "Human{}";
    }
}
