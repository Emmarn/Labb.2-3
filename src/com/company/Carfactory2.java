package com.company;

import static com.company.Cartype.BROKEN;
import static com.company.Cartype.WORKING;

public class Carfactory2 {

    public Car createCar(Cartype cartype){
      return switch(cartype){
          case WORKING -> new Volvo();
          case BROKEN -> new Saab();
      };
  }

}
