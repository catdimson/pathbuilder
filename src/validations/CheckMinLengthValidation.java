package validations;

public class CheckMinLengthValidation extends AbstractValidation {

    @Override
    boolean isValid() {
        //todo Проверить значение validatedValue на валидность. validatedValue доступен в этом классе, т.к. он в родительском protected
        return true;
    }
}
