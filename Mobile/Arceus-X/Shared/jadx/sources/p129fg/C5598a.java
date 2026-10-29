package p129fg;

import p466uf.InterfaceC11847c;
import p466uf.InterfaceC11848d;

/* JADX INFO: renamed from: fg.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C5598a {

    /* JADX INFO: renamed from: p */
    public static final C5598a f21419p = new a().m25306a();

    /* JADX INFO: renamed from: a */
    public final long f21420a;

    /* JADX INFO: renamed from: b */
    public final String f21421b;

    /* JADX INFO: renamed from: c */
    public final String f21422c;

    /* JADX INFO: renamed from: d */
    public final c f21423d;

    /* JADX INFO: renamed from: e */
    public final d f21424e;

    /* JADX INFO: renamed from: f */
    public final String f21425f;

    /* JADX INFO: renamed from: g */
    public final String f21426g;

    /* JADX INFO: renamed from: h */
    public final int f21427h;

    /* JADX INFO: renamed from: i */
    public final int f21428i;

    /* JADX INFO: renamed from: j */
    public final String f21429j;

    /* JADX INFO: renamed from: k */
    public final long f21430k;

    /* JADX INFO: renamed from: l */
    public final b f21431l;

    /* JADX INFO: renamed from: m */
    public final String f21432m;

    /* JADX INFO: renamed from: n */
    public final long f21433n;

    /* JADX INFO: renamed from: o */
    public final String f21434o;

    /* JADX INFO: renamed from: fg.a$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public long f21435a = 0;

        /* JADX INFO: renamed from: b */
        public String f21436b = "";

        /* JADX INFO: renamed from: c */
        public String f21437c = "";

        /* JADX INFO: renamed from: d */
        public c f21438d = c.UNKNOWN;

        /* JADX INFO: renamed from: e */
        public d f21439e = d.UNKNOWN_OS;

        /* JADX INFO: renamed from: f */
        public String f21440f = "";

        /* JADX INFO: renamed from: g */
        public String f21441g = "";

        /* JADX INFO: renamed from: h */
        public int f21442h = 0;

        /* JADX INFO: renamed from: i */
        public int f21443i = 0;

        /* JADX INFO: renamed from: j */
        public String f21444j = "";

        /* JADX INFO: renamed from: k */
        public long f21445k = 0;

        /* JADX INFO: renamed from: l */
        public b f21446l = b.UNKNOWN_EVENT;

        /* JADX INFO: renamed from: m */
        public String f21447m = "";

        /* JADX INFO: renamed from: n */
        public long f21448n = 0;

        /* JADX INFO: renamed from: o */
        public String f21449o = "";

        /* JADX INFO: renamed from: a */
        public C5598a m25306a() {
            return new C5598a(this.f21435a, this.f21436b, this.f21437c, this.f21438d, this.f21439e, this.f21440f, this.f21441g, this.f21442h, this.f21443i, this.f21444j, this.f21445k, this.f21446l, this.f21447m, this.f21448n, this.f21449o);
        }

        /* JADX INFO: renamed from: b */
        public a m25307b(String str) {
            this.f21447m = str;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public a m25308c(String str) {
            this.f21441g = str;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public a m25309d(String str) {
            this.f21449o = str;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public a m25310e(b bVar) {
            this.f21446l = bVar;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public a m25311f(String str) {
            this.f21437c = str;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public a m25312g(String str) {
            this.f21436b = str;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public a m25313h(c cVar) {
            this.f21438d = cVar;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public a m25314i(String str) {
            this.f21440f = str;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public a m25315j(int i10) {
            this.f21442h = i10;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public a m25316k(long j10) {
            this.f21435a = j10;
            return this;
        }

        /* JADX INFO: renamed from: l */
        public a m25317l(d dVar) {
            this.f21439e = dVar;
            return this;
        }

        /* JADX INFO: renamed from: m */
        public a m25318m(String str) {
            this.f21444j = str;
            return this;
        }

        /* JADX INFO: renamed from: n */
        public a m25319n(int i10) {
            this.f21443i = i10;
            return this;
        }
    }

    /* JADX INFO: renamed from: fg.a$b */
    public enum b implements InterfaceC11847c {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);


        /* JADX INFO: renamed from: a */
        public final int f21454a;

        b(int i10) {
            this.f21454a = i10;
        }

        @Override // p466uf.InterfaceC11847c
        public int getNumber() {
            return this.f21454a;
        }
    }

    /* JADX INFO: renamed from: fg.a$c */
    public enum c implements InterfaceC11847c {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);


        /* JADX INFO: renamed from: a */
        public final int f21460a;

        c(int i10) {
            this.f21460a = i10;
        }

        @Override // p466uf.InterfaceC11847c
        public int getNumber() {
            return this.f21460a;
        }
    }

    /* JADX INFO: renamed from: fg.a$d */
    public enum d implements InterfaceC11847c {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);


        /* JADX INFO: renamed from: a */
        public final int f21466a;

        d(int i10) {
            this.f21466a = i10;
        }

        @Override // p466uf.InterfaceC11847c
        public int getNumber() {
            return this.f21466a;
        }
    }

    public C5598a(long j10, String str, String str2, c cVar, d dVar, String str3, String str4, int i10, int i11, String str5, long j11, b bVar, String str6, long j12, String str7) {
        this.f21420a = j10;
        this.f21421b = str;
        this.f21422c = str2;
        this.f21423d = cVar;
        this.f21424e = dVar;
        this.f21425f = str3;
        this.f21426g = str4;
        this.f21427h = i10;
        this.f21428i = i11;
        this.f21429j = str5;
        this.f21430k = j11;
        this.f21431l = bVar;
        this.f21432m = str6;
        this.f21433n = j12;
        this.f21434o = str7;
    }

    /* JADX INFO: renamed from: p */
    public static a m25290p() {
        return new a();
    }

    @InterfaceC11848d(tag = 13)
    /* JADX INFO: renamed from: a */
    public String m25291a() {
        return this.f21432m;
    }

    @InterfaceC11848d(tag = 11)
    /* JADX INFO: renamed from: b */
    public long m25292b() {
        return this.f21430k;
    }

    @InterfaceC11848d(tag = 14)
    /* JADX INFO: renamed from: c */
    public long m25293c() {
        return this.f21433n;
    }

    @InterfaceC11848d(tag = 7)
    /* JADX INFO: renamed from: d */
    public String m25294d() {
        return this.f21426g;
    }

    @InterfaceC11848d(tag = 15)
    /* JADX INFO: renamed from: e */
    public String m25295e() {
        return this.f21434o;
    }

    @InterfaceC11848d(tag = 12)
    /* JADX INFO: renamed from: f */
    public b m25296f() {
        return this.f21431l;
    }

    @InterfaceC11848d(tag = 3)
    /* JADX INFO: renamed from: g */
    public String m25297g() {
        return this.f21422c;
    }

    @InterfaceC11848d(tag = 2)
    /* JADX INFO: renamed from: h */
    public String m25298h() {
        return this.f21421b;
    }

    @InterfaceC11848d(tag = 4)
    /* JADX INFO: renamed from: i */
    public c m25299i() {
        return this.f21423d;
    }

    @InterfaceC11848d(tag = 6)
    /* JADX INFO: renamed from: j */
    public String m25300j() {
        return this.f21425f;
    }

    @InterfaceC11848d(tag = 8)
    /* JADX INFO: renamed from: k */
    public int m25301k() {
        return this.f21427h;
    }

    @InterfaceC11848d(tag = 1)
    /* JADX INFO: renamed from: l */
    public long m25302l() {
        return this.f21420a;
    }

    @InterfaceC11848d(tag = 5)
    /* JADX INFO: renamed from: m */
    public d m25303m() {
        return this.f21424e;
    }

    @InterfaceC11848d(tag = 10)
    /* JADX INFO: renamed from: n */
    public String m25304n() {
        return this.f21429j;
    }

    @InterfaceC11848d(tag = 9)
    /* JADX INFO: renamed from: o */
    public int m25305o() {
        return this.f21428i;
    }
}
