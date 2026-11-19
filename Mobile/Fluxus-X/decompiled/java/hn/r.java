package hn;

import ew.l0;
import ew.m0;

/* JADX INFO: loaded from: classes2.dex */
public final class r implements l0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ew.h f18376h = ew.h.e("[]{}\"'/#");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ew.h f18377i = ew.h.e("'\\");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ew.h f18378j = ew.h.e("\"\\");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final ew.h f18379k = ew.h.e("\r\n");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final ew.h f18380l = ew.h.e("*");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final ew.h f18381m = ew.h.f14806e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ew.g f18382a;
    public final ew.e b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ew.e f18383c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ew.h f18384d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18385e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f18386f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f18387g = false;

    public r(ew.g gVar, ew.e eVar, ew.h hVar, int i10) {
        this.f18382a = gVar;
        this.b = gVar.l();
        this.f18383c = eVar;
        this.f18384d = hVar;
        this.f18385e = i10;
    }

    public final void a(long j10) {
        while (true) {
            long j11 = this.f18386f;
            if (j11 >= j10) {
                return;
            }
            ew.h hVar = this.f18384d;
            ew.h hVar2 = f18381m;
            if (hVar == hVar2) {
                return;
            }
            if (j11 == this.b.getSize()) {
                if (this.f18386f > 0) {
                    return;
                } else {
                    this.f18382a.w1(1L);
                }
            }
            long jS = this.b.s(this.f18384d, this.f18386f);
            if (jS == -1) {
                this.f18386f = this.b.getSize();
            } else {
                byte bO = this.b.o(jS);
                ew.h hVar3 = this.f18384d;
                ew.h hVar4 = f18376h;
                if (hVar3 == hVar4) {
                    if (bO == 34) {
                        this.f18384d = f18378j;
                        this.f18386f = jS + 1;
                    } else if (bO == 35) {
                        this.f18384d = f18379k;
                        this.f18386f = jS + 1;
                    } else if (bO == 39) {
                        this.f18384d = f18377i;
                        this.f18386f = jS + 1;
                    } else if (bO != 47) {
                        if (bO != 91) {
                            if (bO != 93) {
                                if (bO != 123) {
                                    if (bO != 125) {
                                    }
                                }
                            }
                            int i10 = this.f18385e - 1;
                            this.f18385e = i10;
                            if (i10 == 0) {
                                this.f18384d = hVar2;
                            }
                            this.f18386f = jS + 1;
                        }
                        this.f18385e++;
                        this.f18386f = jS + 1;
                    } else {
                        long j12 = 2 + jS;
                        this.f18382a.w1(j12);
                        long j13 = jS + 1;
                        byte bO2 = this.b.o(j13);
                        if (bO2 == 47) {
                            this.f18384d = f18379k;
                            this.f18386f = j12;
                        } else if (bO2 == 42) {
                            this.f18384d = f18380l;
                            this.f18386f = j12;
                        } else {
                            this.f18386f = j13;
                        }
                    }
                } else if (hVar3 == f18377i || hVar3 == f18378j) {
                    if (bO == 92) {
                        long j14 = jS + 2;
                        this.f18382a.w1(j14);
                        this.f18386f = j14;
                    } else {
                        if (this.f18385e > 0) {
                            hVar2 = hVar4;
                        }
                        this.f18384d = hVar2;
                        this.f18386f = jS + 1;
                    }
                } else if (hVar3 == f18380l) {
                    long j15 = 2 + jS;
                    this.f18382a.w1(j15);
                    long j16 = jS + 1;
                    if (this.b.o(j16) == 47) {
                        this.f18386f = j15;
                        this.f18384d = hVar4;
                    } else {
                        this.f18386f = j16;
                    }
                } else {
                    if (hVar3 != f18379k) {
                        throw new AssertionError();
                    }
                    this.f18386f = jS + 1;
                    this.f18384d = hVar4;
                }
            }
        }
    }

    public void b() {
        this.f18387g = true;
        while (this.f18384d != f18381m) {
            a(8192L);
            this.f18382a.skip(this.f18386f);
        }
    }

    @Override // ew.l0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f18387g = true;
    }

    @Override // ew.l0
    public long f3(ew.e eVar, long j10) {
        if (this.f18387g) {
            throw new IllegalStateException("closed");
        }
        if (j10 == 0) {
            return 0L;
        }
        if (!this.f18383c.c2()) {
            long jF3 = this.f18383c.f3(eVar, j10);
            long j11 = j10 - jF3;
            if (!this.b.c2()) {
                long jF4 = f3(eVar, j11);
                if (jF4 != -1) {
                    return jF4 + jF3;
                }
            }
            return jF3;
        }
        a(j10);
        long j12 = this.f18386f;
        if (j12 == 0) {
            if (this.f18384d == f18381m) {
                return -1L;
            }
            throw new AssertionError();
        }
        long jMin = Math.min(j10, j12);
        eVar.R2(this.b, jMin);
        this.f18386f -= jMin;
        return jMin;
    }

    @Override // ew.l0
    /* JADX INFO: renamed from: t */
    public m0 getTimeout() {
        return this.f18382a.getTimeout();
    }
}
