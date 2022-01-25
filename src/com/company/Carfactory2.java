package com.company;

import static com.company.cartype.BROKEN;
import static com.company.cartype.WORKING;

public class Carfactory2 {

    public Car createCar(cartype cartype){
      return switch(cartype){
          case WORKING -> new Volvo();
          case BROKEN -> new Saab();
      };
  }

}
