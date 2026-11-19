package c8;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    public static abstract class a {
        public abstract n a();

        public abstract a b(z7.c cVar);

        public abstract a c(z7.d<?> dVar);

        public abstract a d(z7.g<?, byte[]> gVar);

        public abstract a e(o oVar);

        public abstract a f(String str);
    }

    public static a a() {
        return new c.b();
    }

    public abstract z7.c b();

    public abstract z7.d<?> c();

    public byte[] d() {
        return e().apply(c().b());
    }

    public abstract z7.g<?, byte[]> e();

    public abstract o f();

    public abstract String g();
}
