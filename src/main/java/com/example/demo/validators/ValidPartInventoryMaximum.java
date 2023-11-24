package com.example.demo.validators;

import javax.validation.Constraint;
import javax.validation.Payload; // This is the missing import
import java.lang.annotation.*;


@Documented
@Constraint(validatedBy = PartInventoryMaximumValidator.class)
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidPartInventoryMaximum {
    String message() default "ERROR: Inventory exceeds maximum limit. Please try again.";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}

