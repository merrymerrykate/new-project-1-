package LAB1;

public class Countries {


        private String name;
        private int squer;
        private int population;
        private String capital;
        private int capital_population;

        public Countries(String name, int squer, int capital_population){
            setName(name);
            setSquar(squer);
            setPopulation(population);
        }

        public Countries(String name, int squer, int population, String capital, int capital_population){
            this (name, squer, population);
            setCapital(capital);
            setCapital_population(capital_population);
        }



/*
методы возвращающие значения
 */

        public String getName(){
            return name;
        }
        public float getSquer(){
            return squer;
        }
        public float getPopulation(){
            return population;
        }
        public String getCapital(){
            return capital;
        }
        public float getCapital_population(){
            return capital_population;
        }


        /*
        метод возвращающий плотность населения страны
         */
        public float getPopulationDensity(){
            return ((float)population)/squer;

        }

    /*
    методы устанавливающие значения атрибутов
     */

        public void setName(String newname){
            if (newname == null)
                throw new IllegalArgumentException("Не может быть пустой ссылкой!");
            else
                name = newname;

        }

        public void setSquar(int newSquer){
            if (newSquer < 0)
                throw new IllegalArgumentException("Не может быть меньше нуля!");
            else
                squer = newSquer;


        }

        public void setPopulation(int newPopulation){
            if (newPopulation < 0)
                throw new IllegalArgumentException("Не может быть меньше нуля!");
            else
                population = newPopulation;

        }

        public void setCapital(String newCapital){
            if (newCapital == null)
                throw new IllegalArgumentException("Не может быть пустой ссылкой!");
            else
                capital = newCapital;
        }

        public void setCapital_population(int newCapital_population){
            if (newCapital_population < 0)
                throw new IllegalArgumentException("Не может быть меньше нуля!");
            else
                capital_population = newCapital_population;
        }

    /*
    метод print
     */

        public void print(){
            System.out.println (name+" "+"Площадь страны"+squer +" Население страны"+population+" ");
            if (capital != null)
                System.out.println(capital + " " + capital_population);

        }


        public static void printAll(Countries[] array){
         for (Countries mass: array )
         mass.print();
}



    }


