package ru.mirea.lab3;
import java.util.Arrays;
public class Human {
    public class Hand {
        private String length;
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
        private String size, hair, hairColor;
        Head(String size, String hair, String hairColor) {
            this.size = size;
            this.hair = hair;
            this.hairColor = hairColor;
        }
        public void setHair(String hair) {
            this.hair = hair;
        }
        public void setHairColor(String hairColor) {
            this.hairColor = hairColor;
        }
        public void setSize(String size) {
            this.size = size;
        }
        public String getHair() {
            return hair;
        }
        public String getHairColor() {
            return hairColor;
        }
        public String getSize() {
            return size;
        }
    }
    public class Leg {
        private int size;
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
}