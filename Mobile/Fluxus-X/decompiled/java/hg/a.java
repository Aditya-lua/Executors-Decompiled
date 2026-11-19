package hg;

import com.github.luben.zstd.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f18210p = new C0347a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18211a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18212c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f18213d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f18214e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f18215f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f18216g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f18217h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f18218i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f18219j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f18220k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b f18221l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f18222m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f18223n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f18224o;

    /* JADX INFO: renamed from: hg.a$a, reason: collision with other inner class name */
    public static final class C0347a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f18225a = 0;
        public String b = BuildConfig.FLAVOR;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f18226c = BuildConfig.FLAVOR;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public c f18227d = c.UNKNOWN;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public d f18228e = d.UNKNOWN_OS;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f18229f = BuildConfig.FLAVOR;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f18230g = BuildConfig.FLAVOR;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f18231h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f18232i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public String f18233j = BuildConfig.FLAVOR;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public long f18234k = 0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public b f18235l = b.UNKNOWN_EVENT;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public String f18236m = BuildConfig.FLAVOR;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public long f18237n = 0;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public String f18238o = BuildConfig.FLAVOR;

        public a a() {
            return new a(this.f18225a, this.b, this.f18226c, this.f18227d, this.f18228e, this.f18229f, this.f18230g, this.f18231h, this.f18232i, this.f18233j, this.f18234k, this.f18235l, this.f18236m, this.f18237n, this.f18238o);
        }

        public C0347a b(String str) {
            this.f18236m = str;
            return this;
        }

        public C0347a c(String str) {
            this.f18230g = str;
            return this;
        }

        public C0347a d(String str) {
            this.f18238o = str;
            return this;
        }

        public C0347a e(b bVar) {
            this.f18235l = bVar;
            return this;
        }

        public C0347a f(String str) {
            this.f18226c = str;
            return this;
        }

        public C0347a g(String str) {
            this.b = str;
            return this;
        }

        public C0347a h(c cVar) {
            this.f18227d = cVar;
            return this;
        }

        public C0347a i(String str) {
            this.f18229f = str;
            return this;
        }

        public C0347a j(int i10) {
            this.f18231h = i10;
            return this;
        }

        public C0347a k(long j10) {
            this.f18225a = j10;
            return this;
        }

        public C0347a l(d dVar) {
            this.f18228e = dVar;
            return this;
        }

        public C0347a m(String str) {
            this.f18233j = str;
            return this;
        }

        public C0347a n(int i10) {
            this.f18232i = i10;
            return this;
        }
    }

    public enum b implements wf.c {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f18242a;

        b(int i10) {
            this.f18242a = i10;
        }

        @Override // wf.c
        public int getNumber() {
            return this.f18242a;
        }
    }

    public enum c implements wf.c {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f18247a;

        c(int i10) {
            this.f18247a = i10;
        }

        @Override // wf.c
        public int getNumber() {
            return this.f18247a;
        }
    }

    public enum d implements wf.c {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f18252a;

        d(int i10) {
            this.f18252a = i10;
        }

        @Override // wf.c
        public int getNumber() {
            return this.f18252a;
        }
    }

    public a(long j10, String str, String str2, c cVar, d dVar, String str3, String str4, int i10, int i11, String str5, long j11, b bVar, String str6, long j12, String str7) {
        this.f18211a = j10;
        this.b = str;
        this.f18212c = str2;
        this.f18213d = cVar;
        this.f18214e = dVar;
        this.f18215f = str3;
        this.f18216g = str4;
        this.f18217h = i10;
        this.f18218i = i11;
        this.f18219j = str5;
        this.f18220k = j11;
        this.f18221l = bVar;
        this.f18222m = str6;
        this.f18223n = j12;
        this.f18224o = str7;
    }

    public static C0347a p() {
        return new C0347a();
    }

    @wf.d(tag = 13)
    public String a() {
        return this.f18222m;
    }

    @wf.d(tag = 11)
    public long b() {
        return this.f18220k;
    }

    @wf.d(tag = 14)
    public long c() {
        return this.f18223n;
    }

    @wf.d(tag = 7)
    public String d() {
        return this.f18216g;
    }

    @wf.d(tag = 15)
    public String e() {
        return this.f18224o;
    }

    @wf.d(tag = 12)
    public b f() {
        return this.f18221l;
    }

    @wf.d(tag = 3)
    public String g() {
        return this.f18212c;
    }

    @wf.d(tag = 2)
    public String h() {
        return this.b;
    }

    @wf.d(tag = 4)
    public c i() {
        return this.f18213d;
    }

    @wf.d(tag = 6)
    public String j() {
        return this.f18215f;
    }

    @wf.d(tag = 8)
    public int k() {
        return this.f18217h;
    }

    @wf.d(tag = 1)
    public long l() {
        return this.f18211a;
    }

    @wf.d(tag = 5)
    public d m() {
        return this.f18214e;
    }

    @wf.d(tag = 10)
    public String n() {
        return this.f18219j;
    }

    @wf.d(tag = 9)
    public int o() {
        return this.f18218i;
    }
}
