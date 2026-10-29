package androidx.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes4.dex */
@Target({ElementType.METHOD, ElementType.PARAMETER, ElementType.FIELD, ElementType.LOCAL_VARIABLE, ElementType.ANNOTATION_TYPE})
@Documented
@Retention(RetentionPolicy.CLASS)
public @interface Dimension {

    /* JADX INFO: renamed from: DP */
    public static final int f993DP = 0;

    /* JADX INFO: renamed from: PX */
    public static final int f994PX = 1;

    /* JADX INFO: renamed from: SP */
    public static final int f995SP = 2;

    int unit() default 1;
}
