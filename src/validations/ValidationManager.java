package validations;

import java.util.Arrays;
import java.util.List;

public class ValidationManager {

    private List<AbstractValidation> validations;

    public ValidationManager() {
        this.validations = Arrays.asList(
                new CheckLimitCitiesValidation(),
                new CheckSymbolsValidation(),
                new CheckMinLengthValidation(),
                new CheckDublicateValidation()
        );
    }

    public boolean isValid(String validatedValue) {
        for (AbstractValidation validation: validations) {
            validation.setValidateValue(validatedValue);

            if (!validation.isValid()) {
                return false;
            }
        }

        return true;
    }

}
