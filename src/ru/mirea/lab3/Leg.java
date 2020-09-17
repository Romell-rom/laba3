package ru.mirea.lab3;
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
        @Override
        public String toString() {
            return "Leg{" +
                    "size=" + size +
                    '}';
        }
    }