package z1;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class b implements d.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f37057e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i f37054a = null;
    public float b = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f37055c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList<i> f37056d = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f37058f = false;

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
        if (iVar == null || !iVar.f37102g) {
            return;
        }
        this.b += iVar.f37101f * this.f37057e.a(iVar);
        this.f37057e.j(iVar, z10);
        if (z10) {
            iVar.d(this);
        }
        if (d.f37064u && this.f37057e.h() == 0) {
            this.f37058f = true;
            dVar.b = true;
        }
    }

    public void B(d dVar, b bVar, boolean z10) {
        this.b += bVar.b * this.f37057e.e(bVar, z10);
        if (z10) {
            bVar.f37054a.d(this);
        }
        if (d.f37064u && this.f37054a != null && this.f37057e.h() == 0) {
            this.f37058f = true;
            dVar.b = true;
        }
    }

    public void C(d dVar, i iVar, boolean z10) {
        if (iVar == null || !iVar.f37109n) {
            return;
        }
        float fA = this.f37057e.a(iVar);
        this.b += iVar.f37111p * fA;
        this.f37057e.j(iVar, z10);
        if (z10) {
            iVar.d(this);
        }
        this.f37057e.f(dVar.f37082o.f37061d[iVar.f37110o], fA, z10);
        if (d.f37064u && this.f37057e.h() == 0) {
            this.f37058f = true;
            dVar.b = true;
        }
    }

    public void D(d dVar) {
        if (dVar.f37075h.length == 0) {
            return;
        }
        boolean z10 = false;
        while (!z10) {
            int iH = this.f37057e.h();
            for (int i10 = 0; i10 < iH; i10++) {
                i iVarB = this.f37057e.b(i10);
                if (iVarB.f37099d != -1 || iVarB.f37102g || iVarB.f37109n) {
                    this.f37056d.add(iVarB);
                }
            }
            int size = this.f37056d.size();
            if (size > 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    i iVar = this.f37056d.get(i11);
                    if (iVar.f37102g) {
                        A(dVar, iVar, true);
                    } else if (iVar.f37109n) {
                        C(dVar, iVar, true);
                    } else {
                        B(dVar, dVar.f37075h[iVar.f37099d], true);
                    }
                }
                this.f37056d.clear();
            } else {
                z10 = true;
            }
        }
        if (d.f37064u && this.f37054a != null && this.f37057e.h() == 0) {
            this.f37058f = true;
            dVar.b = true;
        }
    }

    @Override // z1.d.a
    public i a(d dVar, boolean[] zArr) {
        return w(zArr, null);
    }

    @Override // z1.d.a
    public void b(i iVar) {
        int i10 = iVar.f37100e;
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
        this.f37057e.c(iVar, f10);
    }

    @Override // z1.d.a
    public void c(d.a aVar) {
        if (aVar instanceof b) {
            b bVar = (b) aVar;
            this.f37054a = null;
            this.f37057e.clear();
            for (int i10 = 0; i10 < bVar.f37057e.h(); i10++) {
                this.f37057e.f(bVar.f37057e.b(i10), bVar.f37057e.i(i10), true);
            }
        }
    }

    @Override // z1.d.a
    public void clear() {
        this.f37057e.clear();
        this.f37054a = null;
        this.b = 0.0f;
    }

    public b d(d dVar, int i10) {
        this.f37057e.c(dVar.o(i10, "ep"), 1.0f);
        this.f37057e.c(dVar.o(i10, "em"), -1.0f);
        return this;
    }

    public b e(i iVar, int i10) {
        this.f37057e.c(iVar, i10);
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
        if (this.f37057e.h() == 0) {
            this.f37058f = true;
        }
        return z10;
    }

    public i g(d dVar) {
        int iH = this.f37057e.h();
        i iVar = null;
        float f10 = 0.0f;
        float f11 = 0.0f;
        boolean z10 = false;
        boolean z11 = false;
        i iVar2 = null;
        for (int i10 = 0; i10 < iH; i10++) {
            float fI = this.f37057e.i(i10);
            i iVarB = this.f37057e.b(i10);
            if (iVarB.f37105j == i.a.UNRESTRICTED) {
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
        return this.f37054a;
    }

    public b h(i iVar, i iVar2, int i10, float f10, i iVar3, i iVar4, int i11) {
        if (iVar2 == iVar3) {
            this.f37057e.c(iVar, 1.0f);
            this.f37057e.c(iVar4, 1.0f);
            this.f37057e.c(iVar2, -2.0f);
            return this;
        }
        if (f10 == 0.5f) {
            this.f37057e.c(iVar, 1.0f);
            this.f37057e.c(iVar2, -1.0f);
            this.f37057e.c(iVar3, -1.0f);
            this.f37057e.c(iVar4, 1.0f);
            if (i10 > 0 || i11 > 0) {
                this.b = (-i10) + i11;
                return this;
            }
        } else {
            if (f10 <= 0.0f) {
                this.f37057e.c(iVar, -1.0f);
                this.f37057e.c(iVar2, 1.0f);
                this.b = i10;
                return this;
            }
            if (f10 >= 1.0f) {
                this.f37057e.c(iVar4, -1.0f);
                this.f37057e.c(iVar3, 1.0f);
                this.b = -i11;
                return this;
            }
            float f11 = 1.0f - f10;
            this.f37057e.c(iVar, f11 * 1.0f);
            this.f37057e.c(iVar2, f11 * (-1.0f));
            this.f37057e.c(iVar3, (-1.0f) * f10);
            this.f37057e.c(iVar4, 1.0f * f10);
            if (i10 > 0 || i11 > 0) {
                this.b = ((-i10) * f11) + (i11 * f10);
                return this;
            }
        }
        return this;
    }

    public b i(i iVar, int i10) {
        this.f37054a = iVar;
        float f10 = i10;
        iVar.f37101f = f10;
        this.b = f10;
        this.f37058f = true;
        return this;
    }

    @Override // z1.d.a
    public boolean isEmpty() {
        return this.f37054a == null && this.b == 0.0f && this.f37057e.h() == 0;
    }

    public b j(i iVar, i iVar2, float f10) {
        this.f37057e.c(iVar, -1.0f);
        this.f37057e.c(iVar2, f10);
        return this;
    }

    public b k(i iVar, i iVar2, i iVar3, i iVar4, float f10) {
        this.f37057e.c(iVar, -1.0f);
        this.f37057e.c(iVar2, 1.0f);
        this.f37057e.c(iVar3, f10);
        this.f37057e.c(iVar4, -f10);
        return this;
    }

    public b l(float f10, float f11, float f12, i iVar, i iVar2, i iVar3, i iVar4) {
        this.b = 0.0f;
        if (f11 == 0.0f || f10 == f12) {
            this.f37057e.c(iVar, 1.0f);
            this.f37057e.c(iVar2, -1.0f);
            this.f37057e.c(iVar4, 1.0f);
            this.f37057e.c(iVar3, -1.0f);
            return this;
        }
        if (f10 == 0.0f) {
            this.f37057e.c(iVar, 1.0f);
            this.f37057e.c(iVar2, -1.0f);
            return this;
        }
        if (f12 == 0.0f) {
            this.f37057e.c(iVar3, 1.0f);
            this.f37057e.c(iVar4, -1.0f);
            return this;
        }
        float f13 = (f10 / f11) / (f12 / f11);
        this.f37057e.c(iVar, 1.0f);
        this.f37057e.c(iVar2, -1.0f);
        this.f37057e.c(iVar4, f13);
        this.f37057e.c(iVar3, -f13);
        return this;
    }

    public b m(i iVar, int i10) {
        if (i10 < 0) {
            this.b = i10 * (-1);
            this.f37057e.c(iVar, 1.0f);
            return this;
        }
        this.b = i10;
        this.f37057e.c(iVar, -1.0f);
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
            this.f37057e.c(iVar, 1.0f);
            this.f37057e.c(iVar2, -1.0f);
            return this;
        }
        this.f37057e.c(iVar, -1.0f);
        this.f37057e.c(iVar2, 1.0f);
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
            this.f37057e.c(iVar, 1.0f);
            this.f37057e.c(iVar2, -1.0f);
            this.f37057e.c(iVar3, -1.0f);
            return this;
        }
        this.f37057e.c(iVar, -1.0f);
        this.f37057e.c(iVar2, 1.0f);
        this.f37057e.c(iVar3, 1.0f);
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
            this.f37057e.c(iVar, 1.0f);
            this.f37057e.c(iVar2, -1.0f);
            this.f37057e.c(iVar3, 1.0f);
            return this;
        }
        this.f37057e.c(iVar, -1.0f);
        this.f37057e.c(iVar2, 1.0f);
        this.f37057e.c(iVar3, -1.0f);
        return this;
    }

    public b q(i iVar, i iVar2, i iVar3, i iVar4, float f10) {
        this.f37057e.c(iVar3, 0.5f);
        this.f37057e.c(iVar4, 0.5f);
        this.f37057e.c(iVar, -0.5f);
        this.f37057e.c(iVar2, -0.5f);
        this.b = -f10;
        return this;
    }

    public void r() {
        float f10 = this.b;
        if (f10 < 0.0f) {
            this.b = f10 * (-1.0f);
            this.f37057e.d();
        }
    }

    public boolean s() {
        i iVar = this.f37054a;
        if (iVar != null) {
            return iVar.f37105j == i.a.UNRESTRICTED || this.b >= 0.0f;
        }
        return false;
    }

    public boolean t(i iVar) {
        return this.f37057e.g(iVar);
    }

    public String toString() {
        return z();
    }

    public final boolean u(i iVar, d dVar) {
        return iVar.f37108m <= 1;
    }

    public i v(i iVar) {
        return w(null, iVar);
    }

    public final i w(boolean[] zArr, i iVar) {
        i.a aVar;
        int iH = this.f37057e.h();
        i iVar2 = null;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < iH; i10++) {
            float fI = this.f37057e.i(i10);
            if (fI < 0.0f) {
                i iVarB = this.f37057e.b(i10);
                if ((zArr == null || !zArr[iVarB.f37098c]) && iVarB != iVar && (((aVar = iVarB.f37105j) == i.a.SLACK || aVar == i.a.ERROR) && fI < f10)) {
                    f10 = fI;
                    iVar2 = iVarB;
                }
            }
        }
        return iVar2;
    }

    public void x(i iVar) {
        i iVar2 = this.f37054a;
        if (iVar2 != null) {
            this.f37057e.c(iVar2, -1.0f);
            this.f37054a.f37099d = -1;
            this.f37054a = null;
        }
        float fJ = this.f37057e.j(iVar, true) * (-1.0f);
        this.f37054a = iVar;
        if (fJ == 1.0f) {
            return;
        }
        this.b /= fJ;
        this.f37057e.k(fJ);
    }

    public void y() {
        this.f37054a = null;
        this.f37057e.clear();
        this.b = 0.0f;
        this.f37058f = false;
    }

    public String z() {
        boolean z10;
        String str = (this.f37054a == null ? "0" : "" + this.f37054a) + " = ";
        if (this.b != 0.0f) {
            str = str + this.b;
            z10 = true;
        } else {
            z10 = false;
        }
        int iH = this.f37057e.h();
        for (int i10 = 0; i10 < iH; i10++) {
            i iVarB = this.f37057e.b(i10);
            if (iVarB != null) {
                float fI = this.f37057e.i(i10);
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
        this.f37057e = new z1.a(this, cVar);
    }
}
