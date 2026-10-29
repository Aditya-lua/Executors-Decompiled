package tf;

/* JADX INFO: loaded from: classes2.dex */
public @interface d {

    public enum a {
        DEFAULT,
        SIGNED,
        FIXED
    }

    a intEncoding() default a.DEFAULT;

    int tag();
}
