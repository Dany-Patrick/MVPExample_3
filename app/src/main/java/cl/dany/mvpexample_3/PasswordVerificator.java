package cl.dany.mvpexample_3;

public class PasswordVerificator {
    private PasswordCallback callback;

    public PasswordVerificator(PasswordCallback callback) {
        this.callback = callback;
    }

    public void checkPassString(String value)
    {
        if(value.trim().length() > 0)
        {
            if(value.trim().length() > 8)
            {
                callback.checkPass("Password cumple la normativa");
            }else
            {
                callback.checkPass("Password debe tener mas de 8 caracteres");
            }

        }else
        {
            callback.blankInput();
        }
    }
}
