package sm;

import vu.r0;
import vu.s0;

/* JADX INFO: loaded from: classes2.dex */
public final class r implements r0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final vu.h f31621h = vu.h.e("[]{}\"'/#");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final vu.h f31622i = vu.h.e("'\\");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final vu.h f31623j = vu.h.e("\"\\");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final vu.h f31624k = vu.h.e("\r\n");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final vu.h f31625l = vu.h.e("*");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final vu.h f31626m = vu.h.f33665e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vu.g f31627a;
    public final vu.e b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vu.e f31628c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public vu.h f31629d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f31630e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f31631f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f31632g = false;

    public r(vu.g gVar, vu.e eVar, vu.h hVar, int i10) {
        this.f31627a = gVar;
        this.b = gVar.k();
        this.f31628c = eVar;
        this.f31629d = hVar;
        this.f31630e = i10;
    }

    public final void a(long j10) {
        while (true) {
            long j11 = this.f31631f;
            if (j11 >= j10) {
                return;
            }
            vu.h hVar = this.f31629d;
            vu.h hVar2 = f31626m;
            if (hVar == hVar2) {
                return;
            }
            if (j11 == this.b.getSize()) {
                if (this.f31631f > 0) {
                    return;
                } else {
                    this.f31627a.u1(1L);
                }
            }
            long jQ = this.b.q(this.f31629d, this.f31631f);
            if (jQ == -1) {
                this.f31631f = this.b.getSize();
            } else {
                byte bJ = this.b.j(jQ);
                vu.h hVar3 = this.f31629d;
                vu.h hVar4 = f31621h;
                if (hVar3 == hVar4) {
                    if (bJ == 34) {
                        this.f31629d = f31623j;
                        this.f31631f = jQ + 1;
                    } else if (bJ == 35) {
                        this.f31629d = f31624k;
                        this.f31631f = jQ + 1;
                    } else if (bJ == 39) {
                        this.f31629d = f31622i;
                        this.f31631f = jQ + 1;
                    } else if (bJ != 47) {
                        if (bJ != 91) {
                            if (bJ != 93) {
                                if (bJ != 123) {
                                    if (bJ != 125) {
                                    }
                                }
                            }
                            int i10 = this.f31630e - 1;
                            this.f31630e = i10;
                            if (i10 == 0) {
                                this.f31629d = hVar2;
                            }
                            this.f31631f = jQ + 1;
                        }
                        this.f31630e++;
                        this.f31631f = jQ + 1;
                    } else {
                        long j12 = 2 + jQ;
                        this.f31627a.u1(j12);
                        long j13 = jQ + 1;
                        byte bJ2 = this.b.j(j13);
                        if (bJ2 == 47) {
                            this.f31629d = f31624k;
                            this.f31631f = j12;
                        } else if (bJ2 == 42) {
                            this.f31629d = f31625l;
                            this.f31631f = j12;
                        } else {
                            this.f31631f = j13;
                        }
                    }
                } else if (hVar3 == f31622i || hVar3 == f31623j) {
                    if (bJ == 92) {
                        long j14 = jQ + 2;
                        this.f31627a.u1(j14);
                        this.f31631f = j14;
                    } else {
                        if (this.f31630e > 0) {
                            hVar2 = hVar4;
                        }
                        this.f31629d = hVar2;
                        this.f31631f = jQ + 1;
                    }
                } else if (hVar3 == f31625l) {
                    long j15 = 2 + jQ;
                    this.f31627a.u1(j15);
                    long j16 = jQ + 1;
                    if (this.b.j(j16) == 47) {
                        this.f31631f = j15;
                        this.f31629d = hVar4;
                    } else {
                        this.f31631f = j16;
                    }
                } else {
                    if (hVar3 != f31624k) {
                        throw new AssertionError();
                    }
                    this.f31631f = jQ + 1;
                    this.f31629d = hVar4;
                }
            }
        }
    }

    public void b() {
        this.f31632g = true;
        while (this.f31629d != f31626m) {
            a(8192L);
            this.f31627a.skip(this.f31631f);
        }
    }

    @Override // vu.r0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f31632g = true;
    }

    @Override // vu.r0
    public long read(vu.e eVar, long j10) {
        if (this.f31632g) {
            throw new IllegalStateException("closed");
        }
        if (j10 == 0) {
            return 0L;
        }
        if (!this.f31628c.a2()) {
            long j11 = this.f31628c.read(eVar, j10);
            long j12 = j10 - j11;
            if (!this.b.a2()) {
                long j13 = read(eVar, j12);
                if (j13 != -1) {
                    return j13 + j11;
                }
            }
            return j11;
        }
        a(j10);
        long j14 = this.f31631f;
        if (j14 == 0) {
            if (this.f31629d == f31626m) {
                return -1L;
            }
            throw new AssertionError();
        }
        long jMin = Math.min(j10, j14);
        eVar.write(this.b, jMin);
        this.f31631f -= jMin;
        return jMin;
    }

    @Override // vu.r0
    /* JADX INFO: renamed from: timeout */
    public s0 getTimeout() {
        return this.f31627a.getTimeout();
    }
}
