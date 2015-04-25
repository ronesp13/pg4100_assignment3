package no.woact.pg4100.assignment3.ronesp13.models;

import org.apache.commons.math3.primes.Primes;

public class PrimeHandler {

    private boolean isInteger;
    private boolean isPrime;

    public PrimeHandler(String value) {
        if (!isInteger(value)) {
            return;
        }
        isPrime = Primes.isPrime(Integer.parseInt(value));
    }

    private boolean isInteger(String value) {
        try {
            Integer.parseInt(value);
            return isInteger = true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public boolean isInteger() {
        return isInteger;
    }

    public boolean isPrime() {
        return isPrime;
    }
}
