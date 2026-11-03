package e8;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final b b = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f15840a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public e f15841a = null;

        public b a() {
            return new b(this.f15841a);
        }

        public a b(e eVar) {
            this.f15841a = eVar;
            return this;
        }
    }

    public b(e eVar) {
        this.f15840a = eVar;
    }

    public static a b() {
        return new a();
    }

    @uf.d(tag = 1)
    public e a() {
        return this.f15840a;
    }
}
