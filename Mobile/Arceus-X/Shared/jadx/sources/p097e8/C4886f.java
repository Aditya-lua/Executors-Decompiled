package p097e8;

import p466uf.InterfaceC11848d;

/* JADX INFO: renamed from: e8.f */
/* JADX INFO: loaded from: classes.dex */
public final class C4886f {

    /* JADX INFO: renamed from: c */
    public static final C4886f f19618c = new a().m23540a();

    /* JADX INFO: renamed from: a */
    public final long f19619a;

    /* JADX INFO: renamed from: b */
    public final long f19620b;

    /* JADX INFO: renamed from: e8.f$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public long f19621a = 0;

        /* JADX INFO: renamed from: b */
        public long f19622b = 0;

        /* JADX INFO: renamed from: a */
        public C4886f m23540a() {
            return new C4886f(this.f19621a, this.f19622b);
        }

        /* JADX INFO: renamed from: b */
        public a m23541b(long j10) {
            this.f19622b = j10;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public a m23542c(long j10) {
            this.f19621a = j10;
            return this;
        }
    }

    public C4886f(long j10, long j11) {
        this.f19619a = j10;
        this.f19620b = j11;
    }

    /* JADX INFO: renamed from: c */
    public static a m23537c() {
        return new a();
    }

    @InterfaceC11848d(tag = 2)
    /* JADX INFO: renamed from: a */
    public long m23538a() {
        return this.f19620b;
    }

    @InterfaceC11848d(tag = 1)
    /* JADX INFO: renamed from: b */
    public long m23539b() {
        return this.f19619a;
    }
}
