package um;

import xu.r0;
import xu.s0;

/* JADX INFO: loaded from: classes2.dex */
public final class r implements r0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final xu.h f32431h = xu.h.e("[]{}\"'/#");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final xu.h f32432i = xu.h.e("'\\");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final xu.h f32433j = xu.h.e("\"\\");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final xu.h f32434k = xu.h.e("\r\n");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final xu.h f32435l = xu.h.e("*");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final xu.h f32436m = xu.h.f35343e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xu.g f32437a;
    public final xu.e b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xu.e f32438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public xu.h f32439d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f32440e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f32441f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f32442g = false;

    public r(xu.g gVar, xu.e eVar, xu.h hVar, int i10) {
        this.f32437a = gVar;
        this.b = gVar.k();
        this.f32438c = eVar;
        this.f32439d = hVar;
        this.f32440e = i10;
    }

    public final void a(long j10) {
        while (true) {
            long j11 = this.f32441f;
            if (j11 >= j10) {
                return;
            }
            xu.h hVar = this.f32439d;
            xu.h hVar2 = f32436m;
            if (hVar == hVar2) {
                return;
            }
            if (j11 == this.b.getSize()) {
                if (this.f32441f > 0) {
                    return;
                } else {
                    this.f32437a.w1(1L);
                }
            }
            long jQ = this.b.q(this.f32439d, this.f32441f);
            if (jQ == -1) {
                this.f32441f = this.b.getSize();
            } else {
                byte bJ = this.b.j(jQ);
                xu.h hVar3 = this.f32439d;
                xu.h hVar4 = f32431h;
                if (hVar3 == hVar4) {
                    if (bJ == 34) {
                        this.f32439d = f32433j;
                        this.f32441f = jQ + 1;
                    } else if (bJ == 35) {
                        this.f32439d = f32434k;
                        this.f32441f = jQ + 1;
                    } else if (bJ == 39) {
                        this.f32439d = f32432i;
                        this.f32441f = jQ + 1;
                    } else if (bJ != 47) {
                        if (bJ != 91) {
                            if (bJ != 93) {
                                if (bJ != 123) {
                                    if (bJ != 125) {
                                    }
                                }
                            }
                            int i10 = this.f32440e - 1;
                            this.f32440e = i10;
                            if (i10 == 0) {
                                this.f32439d = hVar2;
                            }
                            this.f32441f = jQ + 1;
                        }
                        this.f32440e++;
                        this.f32441f = jQ + 1;
                    } else {
                        long j12 = 2 + jQ;
                        this.f32437a.w1(j12);
                        long j13 = jQ + 1;
                        byte bJ2 = this.b.j(j13);
                        if (bJ2 == 47) {
                            this.f32439d = f32434k;
                            this.f32441f = j12;
                        } else if (bJ2 == 42) {
                            this.f32439d = f32435l;
                            this.f32441f = j12;
                        } else {
                            this.f32441f = j13;
                        }
                    }
                } else if (hVar3 == f32432i || hVar3 == f32433j) {
                    if (bJ == 92) {
                        long j14 = jQ + 2;
                        this.f32437a.w1(j14);
                        this.f32441f = j14;
                    } else {
                        if (this.f32440e > 0) {
                            hVar2 = hVar4;
                        }
                        this.f32439d = hVar2;
                        this.f32441f = jQ + 1;
                    }
                } else if (hVar3 == f32435l) {
                    long j15 = 2 + jQ;
                    this.f32437a.w1(j15);
                    long j16 = jQ + 1;
                    if (this.b.j(j16) == 47) {
                        this.f32441f = j15;
                        this.f32439d = hVar4;
                    } else {
                        this.f32441f = j16;
                    }
                } else {
                    if (hVar3 != f32434k) {
                        throw new AssertionError();
                    }
                    this.f32441f = jQ + 1;
                    this.f32439d = hVar4;
                }
            }
        }
    }

    public void b() {
        this.f32442g = true;
        while (this.f32439d != f32436m) {
            a(8192L);
            this.f32437a.skip(this.f32441f);
        }
    }

    @Override // xu.r0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f32442g = true;
    }

    @Override // xu.r0
    public long read(xu.e eVar, long j10) {
        if (this.f32442g) {
            throw new IllegalStateException("closed");
        }
        if (j10 == 0) {
            return 0L;
        }
        if (!this.f32438c.Z1()) {
            long j11 = this.f32438c.read(eVar, j10);
            long j12 = j10 - j11;
            if (!this.b.Z1()) {
                long j13 = read(eVar, j12);
                if (j13 != -1) {
                    return j13 + j11;
                }
            }
            return j11;
        }
        a(j10);
        long j14 = this.f32441f;
        if (j14 == 0) {
            if (this.f32439d == f32436m) {
                return -1L;
            }
            throw new AssertionError();
        }
        long jMin = Math.min(j10, j14);
        eVar.write(this.b, jMin);
        this.f32441f -= jMin;
        return jMin;
    }

    @Override // xu.r0
    /* JADX INFO: renamed from: timeout */
    public s0 getTimeout() {
        return this.f32437a.getTimeout();
    }
}
