package p002a1;

/* JADX INFO: renamed from: a1.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0054c {

    /* JADX INFO: renamed from: a */
    public final C0052a f102a;

    /* JADX INFO: renamed from: b */
    public final C0055d f103b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0053b f104c;

    /* JADX INFO: renamed from: d */
    public final int f105d;

    public C0054c(C0052a c0052a, C0055d c0055d, InterfaceC0053b interfaceC0053b, int i10) {
        this.f102a = c0052a;
        this.f103b = c0055d;
        this.f104c = interfaceC0053b;
        this.f105d = i10;
    }

    /* JADX INFO: renamed from: a */
    public int m111a() {
        return this.f105d;
    }

    /* JADX INFO: renamed from: b */
    public C0052a m112b() {
        return this.f102a;
    }

    /* JADX INFO: renamed from: c */
    public InterfaceC0053b m113c() {
        return this.f104c;
    }

    /* JADX INFO: renamed from: d */
    public C0055d m114d() {
        return this.f103b;
    }

    /* JADX INFO: renamed from: a1.c$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public C0052a f106a;

        /* JADX INFO: renamed from: b */
        public C0055d f107b;

        /* JADX INFO: renamed from: c */
        public InterfaceC0053b f108c;

        /* JADX INFO: renamed from: d */
        public int f109d;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public a() {
            this.f106a = C0052a.f98c;
            this.f107b = null;
            this.f108c = null;
            this.f109d = 0;
        }

        /* JADX INFO: renamed from: b */
        public static a m115b(C0054c c0054c) {
            return new a(c0054c);
        }

        /* JADX INFO: renamed from: a */
        public C0054c m116a() {
            return new C0054c(this.f106a, this.f107b, this.f108c, this.f109d);
        }

        /* JADX INFO: renamed from: c */
        public a m117c(int i10) {
            this.f109d = i10;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public a m118d(C0052a c0052a) {
            this.f106a = c0052a;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public a m119e(InterfaceC0053b interfaceC0053b) {
            this.f108c = interfaceC0053b;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public a m120f(C0055d c0055d) {
            this.f107b = c0055d;
            return this;
        }

        public a(C0054c c0054c) {
            this.f106a = C0052a.f98c;
            this.f107b = null;
            this.f108c = null;
            this.f109d = 0;
            this.f106a = c0054c.m112b();
            this.f107b = c0054c.m114d();
            this.f108c = c0054c.m113c();
            this.f109d = c0054c.m111a();
        }
    }
}
