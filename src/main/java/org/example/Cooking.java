package org.example;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
//@Getter
//@Setter
//@AllArgsConstructor

    public class Cooking {
        private int id;
        private String ingredient;
        private int time;
        private String difficulty;
        private String foodtype;
        private String instruction;
        private String calories;
        private String tips;
        private String caution;

        Cooking(int id, String ingredient, int time, String difficulty, String foodtype, String instruction, String calories, String tips
        , String caution){
            this.id = id;
            this.ingredient =ingredient;
            this.time =time;
            this.difficulty =difficulty;
            this.foodtype =foodtype;
            this.instruction = instruction;
            this.calories =calories;
            this.tips =tips;
            this.caution =caution;
        }

        public int getId(){
            return this.id;
        }
        public String getIngredient(){
            return this.getIngredient();
        }
        public int getTime(){
            return this.time;
        }
        public String getDifficulty(){
            return this.difficulty;
        }
        public String getFoodtype(){
            return this.foodtype;
        }
        public String getInstruction(){
            return this.instruction;
        }
        public String getCalories(){
            return this.calories;
        }
        public String getTips(){
            return this.tips;
        }
        public String getCaution(){
            return this.caution;
        }
    }
