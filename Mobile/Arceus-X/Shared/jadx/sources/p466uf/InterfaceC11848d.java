package p466uf;

/* JADX INFO: renamed from: uf.d */
/* JADX INFO: loaded from: classes2.dex */
public @interface InterfaceC11848d {

    /* JADX INFO: renamed from: uf.d$a */
    public enum a {
        DEFAULT,
        SIGNED,
        FIXED
    }

    a intEncoding() default a.DEFAULT;

    int tag();
}
