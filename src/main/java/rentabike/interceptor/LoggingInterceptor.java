package rentabike.interceptor;

import rentabike.exceptions.RentException;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
public class LoggingInterceptor {

    @AroundInvoke
    public Object intercept(
            InvocationContext ctx) throws RentException {
        try {
            Object result = ctx.proceed();
            return result;
        }
        catch (Exception ex){
            throw new RentException();
        }

    }
}