package validations;

public class CheckDublicateValidation extends AbstractValidation {

    @Override
    boolean isValid() {
        //todo Проверить значение validatedValue на валидность. validatedValue доступен в этом классе, т.к. он в родительском protected
        return true;
    }
}
