package com.nougust3.weather.DI.Qualifiers;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Qualifier;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Qualifier
@Retention(RUNTIME)
public @interface OkHttpNetworkInterceptors {
}