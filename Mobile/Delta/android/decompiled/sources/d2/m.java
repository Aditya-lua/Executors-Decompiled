package d2;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class m {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f14333h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p f14335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p f14336d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f14338f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f14339g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14334a = 0;
    public boolean b = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList<p> f14337e = new ArrayList<>();

    public m(p pVar, int i10) {
        this.f14335c = null;
        this.f14336d = null;
        int i11 = f14333h;
        this.f14338f = i11;
        f14333h = i11 + 1;
        this.f14335c = pVar;
        this.f14336d = pVar;
        this.f14339g = i10;
    }

    public void a(p pVar) {
        this.f14337e.add(pVar);
        this.f14336d = pVar;
    }

    public long b(c2.f fVar, int i10) {
        long j10;
        int i11;
        p pVar = this.f14335c;
        if (pVar instanceof c) {
            if (((c) pVar).f14359f != i10) {
                return 0L;
            }
        } else if (i10 == 0) {
            if (!(pVar instanceof l)) {
                return 0L;
            }
        } else if (!(pVar instanceof n)) {
            return 0L;
        }
        f fVar2 = (i10 == 0 ? fVar.f4533e : fVar.f4535f).f14361h;
        f fVar3 = (i10 == 0 ? fVar.f4533e : fVar.f4535f).f14362i;
        boolean zContains = pVar.f14361h.f14319l.contains(fVar2);
        boolean zContains2 = this.f14335c.f14362i.f14319l.contains(fVar3);
        long j11 = this.f14335c.j();
        if (zContains && zContains2) {
            long jD = d(this.f14335c.f14361h, 0L);
            long jC = c(this.f14335c.f14362i, 0L);
            long j12 = jD - j11;
            p pVar2 = this.f14335c;
            int i12 = pVar2.f14362i.f14313f;
            if (j12 >= (-i12)) {
                j12 += (long) i12;
            }
            int i13 = pVar2.f14361h.f14313f;
            long j13 = ((-jC) - j11) - ((long) i13);
            if (j13 >= i13) {
                j13 -= (long) i13;
            }
            float fQ = pVar2.b.q(i10);
            float f10 = fQ > 0.0f ? (long) ((j13 / fQ) + (j12 / (1.0f - fQ))) : 0L;
            long j14 = ((long) ((f10 * fQ) + 0.5f)) + j11 + ((long) ((f10 * (1.0f - fQ)) + 0.5f));
            p pVar3 = this.f14335c;
            j10 = ((long) pVar3.f14361h.f14313f) + j14;
            i11 = pVar3.f14362i.f14313f;
        } else {
            if (zContains) {
                f fVar4 = this.f14335c.f14361h;
                return Math.max(d(fVar4, fVar4.f14313f), ((long) this.f14335c.f14361h.f14313f) + j11);
            }
            if (zContains2) {
                f fVar5 = this.f14335c.f14362i;
                return Math.max(-c(fVar5, fVar5.f14313f), ((long) (-this.f14335c.f14362i.f14313f)) + j11);
            }
            p pVar4 = this.f14335c;
            j10 = ((long) pVar4.f14361h.f14313f) + pVar4.j();
            i11 = this.f14335c.f14362i.f14313f;
        }
        return j10 - ((long) i11);
    }

    public final long c(f fVar, long j10) {
        p pVar = fVar.f14311d;
        if (pVar instanceof k) {
            return j10;
        }
        int size = fVar.f14318k.size();
        long jMin = j10;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = fVar.f14318k.get(i10);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f14311d != pVar) {
                    jMin = Math.min(jMin, c(fVar2, ((long) fVar2.f14313f) + j10));
                }
            }
        }
        if (fVar != pVar.f14362i) {
            return jMin;
        }
        long j11 = j10 - pVar.j();
        return Math.min(Math.min(jMin, c(pVar.f14361h, j11)), j11 - ((long) pVar.f14361h.f14313f));
    }

    public final long d(f fVar, long j10) {
        p pVar = fVar.f14311d;
        if (pVar instanceof k) {
            return j10;
        }
        int size = fVar.f14318k.size();
        long jMax = j10;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = fVar.f14318k.get(i10);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f14311d != pVar) {
                    jMax = Math.max(jMax, d(fVar2, ((long) fVar2.f14313f) + j10));
                }
            }
        }
        if (fVar != pVar.f14361h) {
            return jMax;
        }
        long j11 = j10 + pVar.j();
        return Math.max(Math.max(jMax, d(pVar.f14362i, j11)), j11 - ((long) pVar.f14362i.f14313f));
    }
}
