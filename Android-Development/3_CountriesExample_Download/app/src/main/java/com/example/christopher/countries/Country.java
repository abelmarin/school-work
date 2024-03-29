package com.example.christopher.countries;

import java.io.Serializable;

class Country implements Comparable<Country>, Serializable {
    // Serializable needed to add as extra to intent

    private final String name;
    private final String capital;
    private final int population;
    private final String region;
    private final String subRegion;
    private final int area;
    private final String citizen;
    private final String callingCodes;
    private final String borders;

    Country(String nm, String cap, int pop, String reg, String sReg,
                   int ar, String cit, String cc, String bord) {
        name = nm;
        capital = cap;
        population = pop;
        region = reg;
        subRegion = sReg;
        area = ar;
        citizen = cit;
        callingCodes = cc;
        borders = bord;
    }

    String getBorders() {
        return borders;
    }

    String getCallingCodes() {
        return callingCodes;
    }

    int getArea() {
        return area;
    }

    String getCitizen() {
        return citizen;
    }

    String getName() {
        return name;
    }

    String getCapital() {
        return capital;
    }

    int getPopulation() {
        return population;
    }

    String getRegion() {
        return region;
    }

    String getSubRegion() {
        return subRegion;
    }

    @Override
    public int compareTo(Country country) {
        return name.compareTo(country.name);
    }
}