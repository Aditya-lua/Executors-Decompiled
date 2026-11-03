package fg;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f17224p = new C0307a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17225a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f17227d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f17228e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f17229f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f17230g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f17231h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f17232i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f17233j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f17234k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b f17235l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f17236m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f17237n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f17238o;

    /* JADX INFO: renamed from: fg.a$a, reason: collision with other inner class name */
    public static final class C0307a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f17239a = 0;
        public String b = "";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f17240c = "";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public c f17241d = c.UNKNOWN;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public d f17242e = d.UNKNOWN_OS;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f17243f = "";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f17244g = "";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f17245h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f17246i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public String f17247j = "";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public long f17248k = 0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public b f17249l = b.UNKNOWN_EVENT;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public String f17250m = "";

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public long f17251n = 0;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public String f17252o = "";

        public a a() {
            return new a(this.f17239a, this.b, this.f17240c, this.f17241d, this.f17242e, this.f17243f, this.f17244g, this.f17245h, this.f17246i, this.f17247j, this.f17248k, this.f17249l, this.f17250m, this.f17251n, this.f17252o);
        }

        public C0307a b(String str) {
            this.f17250m = str;
            return this;
        }

        public C0307a c(String str) {
            this.f17244g = str;
            return this;
        }

        public C0307a d(String str) {
            this.f17252o = str;
            return this;
        }

        public C0307a e(b bVar) {
            this.f17249l = bVar;
            return this;
        }

        public C0307a f(String str) {
            this.f17240c = str;
            return this;
        }

        public C0307a g(String str) {
            this.b = str;
            return this;
        }

        public C0307a h(c cVar) {
            this.f17241d = cVar;
            return this;
        }

        public C0307a i(String str) {
            this.f17243f = str;
            return this;
        }

        public C0307a j(int i10) {
            this.f17245h = i10;
            return this;
        }

        public C0307a k(long j10) {
            this.f17239a = j10;
            return this;
        }

        public C0307a l(d dVar) {
            this.f17242e = dVar;
            return this;
        }

        public C0307a m(String str) {
            this.f17247j = str;
            return this;
        }

        public C0307a n(int i10) {
            this.f17246i = i10;
            return this;
        }
    }

    public enum b implements uf.c {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f17256a;

        b(int i10) {
            this.f17256a = i10;
        }

        @Override // uf.c
        public int getNumber() {
            return this.f17256a;
        }
    }

    public enum c implements uf.c {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f17261a;

        c(int i10) {
            this.f17261a = i10;
        }

        @Override // uf.c
        public int getNumber() {
            return this.f17261a;
        }
    }

    public enum d implements uf.c {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f17266a;

        d(int i10) {
            this.f17266a = i10;
        }

        @Override // uf.c
        public int getNumber() {
            return this.f17266a;
        }
    }

    public a(long j10, String str, String str2, c cVar, d dVar, String str3, String str4, int i10, int i11, String str5, long j11, b bVar, String str6, long j12, String str7) {
        this.f17225a = j10;
        this.b = str;
        this.f17226c = str2;
        this.f17227d = cVar;
        this.f17228e = dVar;
        this.f17229f = str3;
        this.f17230g = str4;
        this.f17231h = i10;
        this.f17232i = i11;
        this.f17233j = str5;
        this.f17234k = j11;
        this.f17235l = bVar;
        this.f17236m = str6;
        this.f17237n = j12;
        this.f17238o = str7;
    }

    public static C0307a p() {
        return new C0307a();
    }

    @uf.d(tag = 13)
    public String a() {
        return this.f17236m;
    }

    @uf.d(tag = 11)
    public long b() {
        return this.f17234k;
    }

    @uf.d(tag = 14)
    public long c() {
        return this.f17237n;
    }

    @uf.d(tag = 7)
    public String d() {
        return this.f17230g;
    }

    @uf.d(tag = 15)
    public String e() {
        return this.f17238o;
    }

    @uf.d(tag = 12)
    public b f() {
        return this.f17235l;
    }

    @uf.d(tag = 3)
    public String g() {
        return this.f17226c;
    }

    @uf.d(tag = 2)
    public String h() {
        return this.b;
    }

    @uf.d(tag = 4)
    public c i() {
        return this.f17227d;
    }

    @uf.d(tag = 6)
    public String j() {
        return this.f17229f;
    }

    @uf.d(tag = 8)
    public int k() {
        return this.f17231h;
    }

    @uf.d(tag = 1)
    public long l() {
        return this.f17225a;
    }

    @uf.d(tag = 5)
    public d m() {
        return this.f17228e;
    }

    @uf.d(tag = 10)
    public String n() {
        return this.f17233j;
    }

    @uf.d(tag = 9)
    public int o() {
        return this.f17232i;
    }
}
