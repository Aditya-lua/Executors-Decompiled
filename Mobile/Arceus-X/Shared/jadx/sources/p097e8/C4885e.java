package p097e8;

import p466uf.InterfaceC11848d;

/* JADX INFO: renamed from: e8.e */
/* JADX INFO: loaded from: classes.dex */
public final class C4885e {

    /* JADX INFO: renamed from: c */
    public static final C4885e f19613c = new a().m23534a();

    /* JADX INFO: renamed from: a */
    public final long f19614a;

    /* JADX INFO: renamed from: b */
    public final long f19615b;

    /* JADX INFO: renamed from: e8.e$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public long f19616a = 0;

        /* JADX INFO: renamed from: b */
        public long f19617b = 0;

        /* JADX INFO: renamed from: a */
        public C4885e m23534a() {
            return new C4885e(this.f19616a, this.f19617b);
        }

        /* JADX INFO: renamed from: b */
        public a m23535b(long j10) {
            this.f19616a = j10;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public a m23536c(long j10) {
            this.f19617b = j10;
            return this;
        }
    }

    public C4885e(long j10, long j11) {
        this.f19614a = j10;
        this.f19615b = j11;
    }

    /* JADX INFO: renamed from: c */
    public static a m23531c() {
        return new a();
    }

    @InterfaceC11848d(tag = 1)
    /* JADX INFO: renamed from: a */
    public long m23532a() {
        return this.f19614a;
    }

    @InterfaceC11848d(tag = 2)
    /* JADX INFO: renamed from: b */
    public long m23533b() {
        return this.f19615b;
    }
}
