package no.woact.pg4100.assignment3.ronesp13.models;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.commons.math3.primes.Primes;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PrimeHandler {

    private static final Logger logger = LogManager.getLogger(PrimeHandler.class.getName());

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
            logger.error(ExceptionUtils.getStackTrace(e));
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
