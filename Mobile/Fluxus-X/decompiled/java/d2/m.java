package d2;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class m {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f11718h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p f11720c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p f11721d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f11723f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f11724g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11719a = 0;
    public boolean b = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList<p> f11722e = new ArrayList<>();

    public m(p pVar, int i10) {
        this.f11720c = null;
        this.f11721d = null;
        int i11 = f11718h;
        this.f11723f = i11;
        f11718h = i11 + 1;
        this.f11720c = pVar;
        this.f11721d = pVar;
        this.f11724g = i10;
    }

    public void a(p pVar) {
        this.f11722e.add(pVar);
        this.f11721d = pVar;
    }

    public long b(c2.f fVar, int i10) {
        long j10;
        int i11;
        p pVar = this.f11720c;
        if (pVar instanceof c) {
            if (((c) pVar).f11744f != i10) {
                return 0L;
            }
        } else if (i10 == 0) {
            if (!(pVar instanceof l)) {
                return 0L;
            }
        } else if (!(pVar instanceof n)) {
            return 0L;
        }
        f fVar2 = (i10 == 0 ? fVar.f4660e : fVar.f4662f).f11746h;
        f fVar3 = (i10 == 0 ? fVar.f4660e : fVar.f4662f).f11747i;
        boolean zContains = pVar.f11746h.f11704l.contains(fVar2);
        boolean zContains2 = this.f11720c.f11747i.f11704l.contains(fVar3);
        long j11 = this.f11720c.j();
        if (zContains && zContains2) {
            long jD = d(this.f11720c.f11746h, 0L);
            long jC = c(this.f11720c.f11747i, 0L);
            long j12 = jD - j11;
            p pVar2 = this.f11720c;
            int i12 = pVar2.f11747i.f11698f;
            if (j12 >= (-i12)) {
                j12 += (long) i12;
            }
            int i13 = pVar2.f11746h.f11698f;
            long j13 = ((-jC) - j11) - ((long) i13);
            if (j13 >= i13) {
                j13 -= (long) i13;
            }
            float fQ = pVar2.b.q(i10);
            float f10 = fQ > 0.0f ? (long) ((j13 / fQ) + (j12 / (1.0f - fQ))) : 0L;
            long j14 = ((long) ((f10 * fQ) + 0.5f)) + j11 + ((long) ((f10 * (1.0f - fQ)) + 0.5f));
            p pVar3 = this.f11720c;
            j10 = ((long) pVar3.f11746h.f11698f) + j14;
            i11 = pVar3.f11747i.f11698f;
        } else {
            if (zContains) {
                f fVar4 = this.f11720c.f11746h;
                return Math.max(d(fVar4, fVar4.f11698f), ((long) this.f11720c.f11746h.f11698f) + j11);
            }
            if (zContains2) {
                f fVar5 = this.f11720c.f11747i;
                return Math.max(-c(fVar5, fVar5.f11698f), ((long) (-this.f11720c.f11747i.f11698f)) + j11);
            }
            p pVar4 = this.f11720c;
            j10 = ((long) pVar4.f11746h.f11698f) + pVar4.j();
            i11 = this.f11720c.f11747i.f11698f;
        }
        return j10 - ((long) i11);
    }

    public final long c(f fVar, long j10) {
        p pVar = fVar.f11696d;
        if (pVar instanceof k) {
            return j10;
        }
        int size = fVar.f11703k.size();
        long jMin = j10;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = fVar.f11703k.get(i10);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f11696d != pVar) {
                    jMin = Math.min(jMin, c(fVar2, ((long) fVar2.f11698f) + j10));
                }
            }
        }
        if (fVar != pVar.f11747i) {
            return jMin;
        }
        long j11 = j10 - pVar.j();
        return Math.min(Math.min(jMin, c(pVar.f11746h, j11)), j11 - ((long) pVar.f11746h.f11698f));
    }

    public final long d(f fVar, long j10) {
        p pVar = fVar.f11696d;
        if (pVar instanceof k) {
            return j10;
        }
        int size = fVar.f11703k.size();
        long jMax = j10;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = fVar.f11703k.get(i10);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f11696d != pVar) {
                    jMax = Math.max(jMax, d(fVar2, ((long) fVar2.f11698f) + j10));
                }
            }
        }
        if (fVar != pVar.f11746h) {
            return jMax;
        }
        long j11 = j10 + pVar.j();
        return Math.max(Math.max(jMax, d(pVar.f11747i, j11)), j11 - ((long) pVar.f11747i.f11698f));
    }
}
