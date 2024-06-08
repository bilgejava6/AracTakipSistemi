package com.muhammet.exception;

import lombok.Getter;

/**
 *Bir sınıfın Exception sınıfı olarak görev yapabilmesi için Exception ya da RunetimeException dan miras
 * alması gerekir.
 * Eğer hata mesajını fırlatmak ve iletmek istiyorsanız miras aldığınız sınıfın
 * constructor una (super) hata ile ilgili mesajınızı iletiyorsunuz.
 */
@Getter
public class AracTakipException extends RuntimeException{
     private ErrorType errorType;
    public AracTakipException(ErrorType errorType){
        super(errorType.getMessage());
        this.errorType = errorType;
    }
}
