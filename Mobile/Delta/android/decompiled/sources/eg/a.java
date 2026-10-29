package eg;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f15470p = new C0284a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15471a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15472c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f15473d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f15474e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f15475f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f15476g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f15477h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f15478i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f15479j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f15480k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b f15481l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f15482m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f15483n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f15484o;

    /* JADX INFO: renamed from: eg.a$a, reason: collision with other inner class name */
    public static final class C0284a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f15485a = 0;
        public String b = "";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f15486c = "";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public c f15487d = c.UNKNOWN;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public d f15488e = d.UNKNOWN_OS;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f15489f = "";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f15490g = "";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f15491h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f15492i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public String f15493j = "";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public long f15494k = 0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public b f15495l = b.UNKNOWN_EVENT;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public String f15496m = "";

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public long f15497n = 0;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public String f15498o = "";

        public a a() {
            return new a(this.f15485a, this.b, this.f15486c, this.f15487d, this.f15488e, this.f15489f, this.f15490g, this.f15491h, this.f15492i, this.f15493j, this.f15494k, this.f15495l, this.f15496m, this.f15497n, this.f15498o);
        }

        public C0284a b(String str) {
            this.f15496m = str;
            return this;
        }

        public C0284a c(String str) {
            this.f15490g = str;
            return this;
        }

        public C0284a d(String str) {
            this.f15498o = str;
            return this;
        }

        public C0284a e(b bVar) {
            this.f15495l = bVar;
            return this;
        }

        public C0284a f(String str) {
            this.f15486c = str;
            return this;
        }

        public C0284a g(String str) {
            this.b = str;
            return this;
        }

        public C0284a h(c cVar) {
            this.f15487d = cVar;
            return this;
        }

        public C0284a i(String str) {
            this.f15489f = str;
            return this;
        }

        public C0284a j(int i10) {
            this.f15491h = i10;
            return this;
        }

        public C0284a k(long j10) {
            this.f15485a = j10;
            return this;
        }

        public C0284a l(d dVar) {
            this.f15488e = dVar;
            return this;
        }

        public C0284a m(String str) {
            this.f15493j = str;
            return this;
        }

        public C0284a n(int i10) {
            this.f15492i = i10;
            return this;
        }
    }

    public enum b implements tf.c {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f15502a;

        b(int i10) {
            this.f15502a = i10;
        }

        @Override // tf.c
        public int getNumber() {
            return this.f15502a;
        }
    }

    public enum c implements tf.c {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f15507a;

        c(int i10) {
            this.f15507a = i10;
        }

        @Override // tf.c
        public int getNumber() {
            return this.f15507a;
        }
    }

    public enum d implements tf.c {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f15512a;

        d(int i10) {
            this.f15512a = i10;
        }

        @Override // tf.c
        public int getNumber() {
            return this.f15512a;
        }
    }

    public a(long j10, String str, String str2, c cVar, d dVar, String str3, String str4, int i10, int i11, String str5, long j11, b bVar, String str6, long j12, String str7) {
        this.f15471a = j10;
        this.b = str;
        this.f15472c = str2;
        this.f15473d = cVar;
        this.f15474e = dVar;
        this.f15475f = str3;
        this.f15476g = str4;
        this.f15477h = i10;
        this.f15478i = i11;
        this.f15479j = str5;
        this.f15480k = j11;
        this.f15481l = bVar;
        this.f15482m = str6;
        this.f15483n = j12;
        this.f15484o = str7;
    }

    public static C0284a p() {
        return new C0284a();
    }

    @tf.d(tag = 13)
    public String a() {
        return this.f15482m;
    }

    @tf.d(tag = 11)
    public long b() {
        return this.f15480k;
    }

    @tf.d(tag = 14)
    public long c() {
        return this.f15483n;
    }

    @tf.d(tag = 7)
    public String d() {
        return this.f15476g;
    }

    @tf.d(tag = 15)
    public String e() {
        return this.f15484o;
    }

    @tf.d(tag = 12)
    public b f() {
        return this.f15481l;
    }

    @tf.d(tag = 3)
    public String g() {
        return this.f15472c;
    }

    @tf.d(tag = 2)
    public String h() {
        return this.b;
    }

    @tf.d(tag = 4)
    public c i() {
        return this.f15473d;
    }

    @tf.d(tag = 6)
    public String j() {
        return this.f15475f;
    }

    @tf.d(tag = 8)
    public int k() {
        return this.f15477h;
    }

    @tf.d(tag = 1)
    public long l() {
        return this.f15471a;
    }

    @tf.d(tag = 5)
    public d m() {
        return this.f15474e;
    }

    @tf.d(tag = 10)
    public String n() {
        return this.f15479j;
    }

    @tf.d(tag = 9)
    public int o() {
        return this.f15478i;
    }
}
