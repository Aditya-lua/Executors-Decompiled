package b8;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    public static abstract class a {
        public abstract n a();

        public abstract a b(y7.c cVar);

        public abstract a c(y7.d<?> dVar);

        public abstract a d(y7.g<?, byte[]> gVar);

        public abstract a e(o oVar);

        public abstract a f(String str);
    }

    public static a a() {
        return new c.b();
    }

    public abstract y7.c b();

    public abstract y7.d<?> c();

    public byte[] d() {
        return e().apply(c().b());
    }

    public abstract y7.g<?, byte[]> e();

    public abstract o f();

    public abstract String g();
}
