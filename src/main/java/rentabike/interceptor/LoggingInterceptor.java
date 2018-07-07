package rentabike.interceptor;

import rentabike.exceptions.RentException;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
public class LoggingInterceptor {

    /**
     *
     * @param ctx
     * @return The result for the invoked method
     * @throws RentException
     * @author  Juan Pablo Lucero
     * This method intercepts all methods calls with the purpose to centrilize all the execptions and custom them.
     */

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