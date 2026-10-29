package p471um;

import p560xu.C12924e;
import p560xu.C12930h;
import p560xu.C12953s0;
import p560xu.InterfaceC12928g;
import p560xu.InterfaceC12951r0;

/* JADX INFO: renamed from: um.r */
/* JADX INFO: loaded from: classes2.dex */
public final class C11883r implements InterfaceC12951r0 {

    /* JADX INFO: renamed from: h */
    public static final C12930h f42150h = C12930h.m48080e("[]{}\"'/#");

    /* JADX INFO: renamed from: i */
    public static final C12930h f42151i = C12930h.m48080e("'\\");

    /* JADX INFO: renamed from: j */
    public static final C12930h f42152j = C12930h.m48080e("\"\\");

    /* JADX INFO: renamed from: k */
    public static final C12930h f42153k = C12930h.m48080e("\r\n");

    /* JADX INFO: renamed from: l */
    public static final C12930h f42154l = C12930h.m48080e("*");

    /* JADX INFO: renamed from: m */
    public static final C12930h f42155m = C12930h.f45830e;

    /* JADX INFO: renamed from: a */
    public final InterfaceC12928g f42156a;

    /* JADX INFO: renamed from: b */
    public final C12924e f42157b;

    /* JADX INFO: renamed from: c */
    public final C12924e f42158c;

    /* JADX INFO: renamed from: d */
    public C12930h f42159d;

    /* JADX INFO: renamed from: e */
    public int f42160e;

    /* JADX INFO: renamed from: f */
    public long f42161f = 0;

    /* JADX INFO: renamed from: g */
    public boolean f42162g = false;

    public C11883r(InterfaceC12928g interfaceC12928g, C12924e c12924e, C12930h c12930h, int i10) {
        this.f42156a = interfaceC12928g;
        this.f42157b = interfaceC12928g.mo48036k();
        this.f42158c = c12924e;
        this.f42159d = c12930h;
        this.f42160e = i10;
    }

    /* JADX INFO: renamed from: a */
    public final void m44388a(long j10) {
        while (true) {
            long j11 = this.f42161f;
            if (j11 >= j10) {
                return;
            }
            C12930h c12930h = this.f42159d;
            C12930h c12930h2 = f42155m;
            if (c12930h == c12930h2) {
                return;
            }
            if (j11 == this.f42157b.getSize()) {
                if (this.f42161f > 0) {
                    return;
                } else {
                    this.f42156a.mo48054w1(1L);
                }
            }
            long jM48046q = this.f42157b.m48046q(this.f42159d, this.f42161f);
            if (jM48046q == -1) {
                this.f42161f = this.f42157b.getSize();
            } else {
                byte bM48033j = this.f42157b.m48033j(jM48046q);
                C12930h c12930h3 = this.f42159d;
                C12930h c12930h4 = f42150h;
                if (c12930h3 == c12930h4) {
                    if (bM48033j == 34) {
                        this.f42159d = f42152j;
                        this.f42161f = jM48046q + 1;
                    } else if (bM48033j == 35) {
                        this.f42159d = f42153k;
                        this.f42161f = jM48046q + 1;
                    } else if (bM48033j == 39) {
                        this.f42159d = f42151i;
                        this.f42161f = jM48046q + 1;
                    } else if (bM48033j != 47) {
                        if (bM48033j != 91) {
                            if (bM48033j != 93) {
                                if (bM48033j != 123) {
                                    if (bM48033j != 125) {
                                    }
                                }
                            }
                            int i10 = this.f42160e - 1;
                            this.f42160e = i10;
                            if (i10 == 0) {
                                this.f42159d = c12930h2;
                            }
                            this.f42161f = jM48046q + 1;
                        }
                        this.f42160e++;
                        this.f42161f = jM48046q + 1;
                    } else {
                        long j12 = 2 + jM48046q;
                        this.f42156a.mo48054w1(j12);
                        long j13 = jM48046q + 1;
                        byte bM48033j2 = this.f42157b.m48033j(j13);
                        if (bM48033j2 == 47) {
                            this.f42159d = f42153k;
                            this.f42161f = j12;
                        } else if (bM48033j2 == 42) {
                            this.f42159d = f42154l;
                            this.f42161f = j12;
                        } else {
                            this.f42161f = j13;
                        }
                    }
                } else if (c12930h3 == f42151i || c12930h3 == f42152j) {
                    if (bM48033j == 92) {
                        long j14 = jM48046q + 2;
                        this.f42156a.mo48054w1(j14);
                        this.f42161f = j14;
                    } else {
                        if (this.f42160e > 0) {
                            c12930h2 = c12930h4;
                        }
                        this.f42159d = c12930h2;
                        this.f42161f = jM48046q + 1;
                    }
                } else if (c12930h3 == f42154l) {
                    long j15 = 2 + jM48046q;
                    this.f42156a.mo48054w1(j15);
                    long j16 = jM48046q + 1;
                    if (this.f42157b.m48033j(j16) == 47) {
                        this.f42161f = j15;
                        this.f42159d = c12930h4;
                    } else {
                        this.f42161f = j16;
                    }
                } else {
                    if (c12930h3 != f42153k) {
                        throw new AssertionError();
                    }
                    this.f42161f = jM48046q + 1;
                    this.f42159d = c12930h4;
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m44389b() {
        this.f42162g = true;
        while (this.f42159d != f42155m) {
            m44388a(8192L);
            this.f42156a.skip(this.f42161f);
        }
    }

    @Override // p560xu.InterfaceC12951r0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f42162g = true;
    }

    @Override // p560xu.InterfaceC12951r0
    public long read(C12924e c12924e, long j10) {
        if (this.f42162g) {
            throw new IllegalStateException("closed");
        }
        if (j10 == 0) {
            return 0L;
        }
        if (!this.f42158c.mo48016Z1()) {
            long j11 = this.f42158c.read(c12924e, j10);
            long j12 = j10 - j11;
            if (!this.f42157b.mo48016Z1()) {
                long j13 = read(c12924e, j12);
                if (j13 != -1) {
                    return j13 + j11;
                }
            }
            return j11;
        }
        m44388a(j10);
        long j14 = this.f42161f;
        if (j14 == 0) {
            if (this.f42159d == f42155m) {
                return -1L;
            }
            throw new AssertionError();
        }
        long jMin = Math.min(j10, j14);
        c12924e.write(this.f42157b, jMin);
        this.f42161f -= jMin;
        return jMin;
    }

    @Override // p560xu.InterfaceC12951r0
    /* JADX INFO: renamed from: timeout */
    public C12953s0 getTimeout() {
        return this.f42156a.getTimeout();
    }
}
