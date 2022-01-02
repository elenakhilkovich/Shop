package com.basket.model;

import java.util.Objects;



    public class Bye {
        private final String byeName;
        private final int byeId;

        public Bye(String byeName, int byeId) {
            this.byeName = byeName;
            this.byeId = byeId;
        }

        public String getByeName() {
            return byeName;
        }

        public int getByeId() {
            return byeId;
        }

        @Override
        public String toString() {
            return byeId + " " + byeName;
        }

        @Override
        public boolean equals(Object other) {
            if (this.getClass() != other.getClass()) {
                return false;
            }
            Bye employee1 = (Bye) other;
            return byeName.equals(employee1.byeName);
        }
        @Override
        public int hashCode() {
            return Objects.hash(byeName);
        }
    }

