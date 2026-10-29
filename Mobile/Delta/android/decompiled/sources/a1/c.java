package a1;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a1.a f71a;
    public final d b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f72c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f73d;

    public c(a1.a aVar, d dVar, b bVar, int i10) {
        this.f71a = aVar;
        this.b = dVar;
        this.f72c = bVar;
        this.f73d = i10;
    }

    public int a() {
        return this.f73d;
    }

    public a1.a b() {
        return this.f71a;
    }

    public b c() {
        return this.f72c;
    }

    public d d() {
        return this.b;
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public a1.a f74a;
        public d b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public b f75c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f76d;

        public a() {
            this.f74a = a1.a.f68c;
            this.b = null;
            this.f75c = null;
            this.f76d = 0;
        }

        public static a b(c cVar) {
            return new a(cVar);
        }

        public c a() {
            return new c(this.f74a, this.b, this.f75c, this.f76d);
        }

        public a c(int i10) {
            this.f76d = i10;
            return this;
        }

        public a d(a1.a aVar) {
            this.f74a = aVar;
            return this;
        }

        public a e(b bVar) {
            this.f75c = bVar;
            return this;
        }

        public a f(d dVar) {
            this.b = dVar;
            return this;
        }

        public a(c cVar) {
            this.f74a = a1.a.f68c;
            this.b = null;
            this.f75c = null;
            this.f76d = 0;
            this.f74a = cVar.b();
            this.b = cVar.d();
            this.f75c = cVar.c();
            this.f76d = cVar.a();
        }
    }
}
