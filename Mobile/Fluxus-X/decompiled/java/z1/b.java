package z1;

import com.github.luben.zstd.BuildConfig;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class b implements d.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f38857e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i f38854a = null;
    public float b = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f38855c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList<i> f38856d = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f38858f = false;

    public interface a {
        float a(i iVar);

        i b(int i10);

        void c(i iVar, float f10);

        void clear();

        void d();

        float e(b bVar, boolean z10);

        void f(i iVar, float f10, boolean z10);

        boolean g(i iVar);

        int h();

        float i(int i10);

        float j(i iVar, boolean z10);

        void k(float f10);
    }

    public b() {
    }

    public void A(d dVar, i iVar, boolean z10) {
        if (iVar == null || !iVar.f38902g) {
            return;
        }
        this.b += iVar.f38901f * this.f38857e.a(iVar);
        this.f38857e.j(iVar, z10);
        if (z10) {
            iVar.d(this);
        }
        if (d.f38864u && this.f38857e.h() == 0) {
            this.f38858f = true;
            dVar.b = true;
        }
    }

    public void B(d dVar, b bVar, boolean z10) {
        this.b += bVar.b * this.f38857e.e(bVar, z10);
        if (z10) {
            bVar.f38854a.d(this);
        }
        if (d.f38864u && this.f38854a != null && this.f38857e.h() == 0) {
            this.f38858f = true;
            dVar.b = true;
        }
    }

    public void C(d dVar, i iVar, boolean z10) {
        if (iVar == null || !iVar.f38909n) {
            return;
        }
        float fA = this.f38857e.a(iVar);
        this.b += iVar.f38911p * fA;
        this.f38857e.j(iVar, z10);
        if (z10) {
            iVar.d(this);
        }
        this.f38857e.f(dVar.f38882o.f38861d[iVar.f38910o], fA, z10);
        if (d.f38864u && this.f38857e.h() == 0) {
            this.f38858f = true;
            dVar.b = true;
        }
    }

    public void D(d dVar) {
        if (dVar.f38875h.length == 0) {
            return;
        }
        boolean z10 = false;
        while (!z10) {
            int iH = this.f38857e.h();
            for (int i10 = 0; i10 < iH; i10++) {
                i iVarB = this.f38857e.b(i10);
                if (iVarB.f38899d != -1 || iVarB.f38902g || iVarB.f38909n) {
                    this.f38856d.add(iVarB);
                }
            }
            int size = this.f38856d.size();
            if (size > 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    i iVar = this.f38856d.get(i11);
                    if (iVar.f38902g) {
                        A(dVar, iVar, true);
                    } else if (iVar.f38909n) {
                        C(dVar, iVar, true);
                    } else {
                        B(dVar, dVar.f38875h[iVar.f38899d], true);
                    }
                }
                this.f38856d.clear();
            } else {
                z10 = true;
            }
        }
        if (d.f38864u && this.f38854a != null && this.f38857e.h() == 0) {
            this.f38858f = true;
            dVar.b = true;
        }
    }

    @Override // z1.d.a
    public i a(d dVar, boolean[] zArr) {
        return w(zArr, null);
    }

    @Override // z1.d.a
    public void b(i iVar) {
        int i10 = iVar.f38900e;
        float f10 = 1.0f;
        if (i10 != 1) {
            if (i10 == 2) {
                f10 = 1000.0f;
            } else if (i10 == 3) {
                f10 = 1000000.0f;
            } else if (i10 == 4) {
                f10 = 1.0E9f;
            } else if (i10 == 5) {
                f10 = 1.0E12f;
            }
        }
        this.f38857e.c(iVar, f10);
    }

    @Override // z1.d.a
    public void c(d.a aVar) {
        if (aVar instanceof b) {
            b bVar = (b) aVar;
            this.f38854a = null;
            this.f38857e.clear();
            for (int i10 = 0; i10 < bVar.f38857e.h(); i10++) {
                this.f38857e.f(bVar.f38857e.b(i10), bVar.f38857e.i(i10), true);
            }
        }
    }

    @Override // z1.d.a
    public void clear() {
        this.f38857e.clear();
        this.f38854a = null;
        this.b = 0.0f;
    }

    public b d(d dVar, int i10) {
        this.f38857e.c(dVar.o(i10, "ep"), 1.0f);
        this.f38857e.c(dVar.o(i10, "em"), -1.0f);
        return this;
    }

    public b e(i iVar, int i10) {
        this.f38857e.c(iVar, i10);
        return this;
    }

    public boolean f(d dVar) {
        boolean z10;
        i iVarG = g(dVar);
        if (iVarG == null) {
            z10 = true;
        } else {
            x(iVarG);
            z10 = false;
        }
        if (this.f38857e.h() == 0) {
            this.f38858f = true;
        }
        return z10;
    }

    public i g(d dVar) {
        int iH = this.f38857e.h();
        i iVar = null;
        float f10 = 0.0f;
        float f11 = 0.0f;
        boolean z10 = false;
        boolean z11 = false;
        i iVar2 = null;
        for (int i10 = 0; i10 < iH; i10++) {
            float fI = this.f38857e.i(i10);
            i iVarB = this.f38857e.b(i10);
            if (iVarB.f38905j == i.a.UNRESTRICTED) {
                if (iVar == null || f10 > fI) {
                    boolean zU = u(iVarB, dVar);
                    z10 = zU;
                    f10 = fI;
                    iVar = iVarB;
                } else if (!z10 && u(iVarB, dVar)) {
                    f10 = fI;
                    iVar = iVarB;
                    z10 = true;
                }
            } else if (iVar == null && fI < 0.0f) {
                if (iVar2 == null || f11 > fI) {
                    boolean zU2 = u(iVarB, dVar);
                    z11 = zU2;
                    f11 = fI;
                    iVar2 = iVarB;
                } else if (!z11 && u(iVarB, dVar)) {
                    f11 = fI;
                    iVar2 = iVarB;
                    z11 = true;
                }
            }
        }
        return iVar != null ? iVar : iVar2;
    }

    @Override // z1.d.a
    public i getKey() {
        return this.f38854a;
    }

    public b h(i iVar, i iVar2, int i10, float f10, i iVar3, i iVar4, int i11) {
        if (iVar2 == iVar3) {
            this.f38857e.c(iVar, 1.0f);
            this.f38857e.c(iVar4, 1.0f);
            this.f38857e.c(iVar2, -2.0f);
            return this;
        }
        if (f10 == 0.5f) {
            this.f38857e.c(iVar, 1.0f);
            this.f38857e.c(iVar2, -1.0f);
            this.f38857e.c(iVar3, -1.0f);
            this.f38857e.c(iVar4, 1.0f);
            if (i10 > 0 || i11 > 0) {
                this.b = (-i10) + i11;
                return this;
            }
        } else {
            if (f10 <= 0.0f) {
                this.f38857e.c(iVar, -1.0f);
                this.f38857e.c(iVar2, 1.0f);
                this.b = i10;
                return this;
            }
            if (f10 >= 1.0f) {
                this.f38857e.c(iVar4, -1.0f);
                this.f38857e.c(iVar3, 1.0f);
                this.b = -i11;
                return this;
            }
            float f11 = 1.0f - f10;
            this.f38857e.c(iVar, f11 * 1.0f);
            this.f38857e.c(iVar2, f11 * (-1.0f));
            this.f38857e.c(iVar3, (-1.0f) * f10);
            this.f38857e.c(iVar4, 1.0f * f10);
            if (i10 > 0 || i11 > 0) {
                this.b = ((-i10) * f11) + (i11 * f10);
                return this;
            }
        }
        return this;
    }

    public b i(i iVar, int i10) {
        this.f38854a = iVar;
        float f10 = i10;
        iVar.f38901f = f10;
        this.b = f10;
        this.f38858f = true;
        return this;
    }

    @Override // z1.d.a
    public boolean isEmpty() {
        return this.f38854a == null && this.b == 0.0f && this.f38857e.h() == 0;
    }

    public b j(i iVar, i iVar2, float f10) {
        this.f38857e.c(iVar, -1.0f);
        this.f38857e.c(iVar2, f10);
        return this;
    }

    public b k(i iVar, i iVar2, i iVar3, i iVar4, float f10) {
        this.f38857e.c(iVar, -1.0f);
        this.f38857e.c(iVar2, 1.0f);
        this.f38857e.c(iVar3, f10);
        this.f38857e.c(iVar4, -f10);
        return this;
    }

    public b l(float f10, float f11, float f12, i iVar, i iVar2, i iVar3, i iVar4) {
        this.b = 0.0f;
        if (f11 == 0.0f || f10 == f12) {
            this.f38857e.c(iVar, 1.0f);
            this.f38857e.c(iVar2, -1.0f);
            this.f38857e.c(iVar4, 1.0f);
            this.f38857e.c(iVar3, -1.0f);
            return this;
        }
        if (f10 == 0.0f) {
            this.f38857e.c(iVar, 1.0f);
            this.f38857e.c(iVar2, -1.0f);
            return this;
        }
        if (f12 == 0.0f) {
            this.f38857e.c(iVar3, 1.0f);
            this.f38857e.c(iVar4, -1.0f);
            return this;
        }
        float f13 = (f10 / f11) / (f12 / f11);
        this.f38857e.c(iVar, 1.0f);
        this.f38857e.c(iVar2, -1.0f);
        this.f38857e.c(iVar4, f13);
        this.f38857e.c(iVar3, -f13);
        return this;
    }

    public b m(i iVar, int i10) {
        if (i10 < 0) {
            this.b = i10 * (-1);
            this.f38857e.c(iVar, 1.0f);
            return this;
        }
        this.b = i10;
        this.f38857e.c(iVar, -1.0f);
        return this;
    }

    public b n(i iVar, i iVar2, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.b = i10;
        }
        if (z10) {
            this.f38857e.c(iVar, 1.0f);
            this.f38857e.c(iVar2, -1.0f);
            return this;
        }
        this.f38857e.c(iVar, -1.0f);
        this.f38857e.c(iVar2, 1.0f);
        return this;
    }

    public b o(i iVar, i iVar2, i iVar3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.b = i10;
        }
        if (z10) {
            this.f38857e.c(iVar, 1.0f);
            this.f38857e.c(iVar2, -1.0f);
            this.f38857e.c(iVar3, -1.0f);
            return this;
        }
        this.f38857e.c(iVar, -1.0f);
        this.f38857e.c(iVar2, 1.0f);
        this.f38857e.c(iVar3, 1.0f);
        return this;
    }

    public b p(i iVar, i iVar2, i iVar3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.b = i10;
        }
        if (z10) {
            this.f38857e.c(iVar, 1.0f);
            this.f38857e.c(iVar2, -1.0f);
            this.f38857e.c(iVar3, 1.0f);
            return this;
        }
        this.f38857e.c(iVar, -1.0f);
        this.f38857e.c(iVar2, 1.0f);
        this.f38857e.c(iVar3, -1.0f);
        return this;
    }

    public b q(i iVar, i iVar2, i iVar3, i iVar4, float f10) {
        this.f38857e.c(iVar3, 0.5f);
        this.f38857e.c(iVar4, 0.5f);
        this.f38857e.c(iVar, -0.5f);
        this.f38857e.c(iVar2, -0.5f);
        this.b = -f10;
        return this;
    }

    public void r() {
        float f10 = this.b;
        if (f10 < 0.0f) {
            this.b = f10 * (-1.0f);
            this.f38857e.d();
        }
    }

    public boolean s() {
        i iVar = this.f38854a;
        if (iVar != null) {
            return iVar.f38905j == i.a.UNRESTRICTED || this.b >= 0.0f;
        }
        return false;
    }

    public boolean t(i iVar) {
        return this.f38857e.g(iVar);
    }

    public String toString() {
        return z();
    }

    public final boolean u(i iVar, d dVar) {
        return iVar.f38908m <= 1;
    }

    public i v(i iVar) {
        return w(null, iVar);
    }

    public final i w(boolean[] zArr, i iVar) {
        i.a aVar;
        int iH = this.f38857e.h();
        i iVar2 = null;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < iH; i10++) {
            float fI = this.f38857e.i(i10);
            if (fI < 0.0f) {
                i iVarB = this.f38857e.b(i10);
                if ((zArr == null || !zArr[iVarB.f38898c]) && iVarB != iVar && (((aVar = iVarB.f38905j) == i.a.SLACK || aVar == i.a.ERROR) && fI < f10)) {
                    f10 = fI;
                    iVar2 = iVarB;
                }
            }
        }
        return iVar2;
    }

    public void x(i iVar) {
        i iVar2 = this.f38854a;
        if (iVar2 != null) {
            this.f38857e.c(iVar2, -1.0f);
            this.f38854a.f38899d = -1;
            this.f38854a = null;
        }
        float fJ = this.f38857e.j(iVar, true) * (-1.0f);
        this.f38854a = iVar;
        if (fJ == 1.0f) {
            return;
        }
        this.b /= fJ;
        this.f38857e.k(fJ);
    }

    public void y() {
        this.f38854a = null;
        this.f38857e.clear();
        this.b = 0.0f;
        this.f38858f = false;
    }

    public String z() {
        boolean z10;
        String str = (this.f38854a == null ? BuildConfig.FLAVOR + "0" : BuildConfig.FLAVOR + this.f38854a) + " = ";
        if (this.b != 0.0f) {
            str = str + this.b;
            z10 = true;
        } else {
            z10 = false;
        }
        int iH = this.f38857e.h();
        for (int i10 = 0; i10 < iH; i10++) {
            i iVarB = this.f38857e.b(i10);
            if (iVarB != null) {
                float fI = this.f38857e.i(i10);
                if (fI != 0.0f) {
                    String string = iVarB.toString();
                    if (z10) {
                        if (fI > 0.0f) {
                            str = str + " + ";
                        } else {
                            str = str + " - ";
                            fI *= -1.0f;
                        }
                    } else if (fI < 0.0f) {
                        str = str + "- ";
                        fI *= -1.0f;
                    }
                    str = fI == 1.0f ? str + string : str + fI + " " + string;
                    z10 = true;
                }
            }
        }
        if (z10) {
            return str;
        }
        return str + "0.0";
    }

    public b(c cVar) {
        this.f38857e = new z1.a(this, cVar);
    }
}
