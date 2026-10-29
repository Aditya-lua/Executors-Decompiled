package z1;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public class h extends z1.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f37087g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public i[] f37088h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public i[] f37089i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f37090j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b f37091k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c f37092l;

    public class a implements Comparator<i> {
        public a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(i iVar, i iVar2) {
            return iVar.f37098c - iVar2.f37098c;
        }
    }

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public i f37094a;
        public h b;

        public b(h hVar) {
            this.b = hVar;
        }

        public boolean a(i iVar, float f10) {
            boolean z10 = true;
            if (!this.f37094a.f37097a) {
                for (int i10 = 0; i10 < 9; i10++) {
                    float f11 = iVar.f37104i[i10];
                    if (f11 != 0.0f) {
                        float f12 = f11 * f10;
                        if (Math.abs(f12) < 1.0E-4f) {
                            f12 = 0.0f;
                        }
                        this.f37094a.f37104i[i10] = f12;
                    } else {
                        this.f37094a.f37104i[i10] = 0.0f;
                    }
                }
                return true;
            }
            for (int i11 = 0; i11 < 9; i11++) {
                float[] fArr = this.f37094a.f37104i;
                float f13 = fArr[i11] + (iVar.f37104i[i11] * f10);
                fArr[i11] = f13;
                if (Math.abs(f13) < 1.0E-4f) {
                    this.f37094a.f37104i[i11] = 0.0f;
                } else {
                    z10 = false;
                }
            }
            if (z10) {
                h.this.G(this.f37094a);
            }
            return false;
        }

        public void b(i iVar) {
            this.f37094a = iVar;
        }

        public final boolean c() {
            for (int i10 = 8; i10 >= 0; i10--) {
                float f10 = this.f37094a.f37104i[i10];
                if (f10 > 0.0f) {
                    return false;
                }
                if (f10 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        public final boolean d(i iVar) {
            for (int i10 = 8; i10 >= 0; i10--) {
                float f10 = iVar.f37104i[i10];
                float f11 = this.f37094a.f37104i[i10];
                if (f11 != f10) {
                    if (f11 < f10) {
                        return true;
                    }
                }
            }
            return false;
        }

        public void e() {
            Arrays.fill(this.f37094a.f37104i, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.f37094a != null) {
                for (int i10 = 0; i10 < 9; i10++) {
                    str = str + this.f37094a.f37104i[i10] + " ";
                }
            }
            return str + "] " + this.f37094a;
        }
    }

    public h(c cVar) {
        super(cVar);
        this.f37087g = 128;
        this.f37088h = new i[128];
        this.f37089i = new i[128];
        this.f37090j = 0;
        this.f37091k = new b(this);
        this.f37092l = cVar;
    }

    @Override // z1.b
    public void B(d dVar, z1.b bVar, boolean z10) {
        i iVar = bVar.f37054a;
        if (iVar == null) {
            return;
        }
        z1.b.a aVar = bVar.f37057e;
        int iH = aVar.h();
        for (int i10 = 0; i10 < iH; i10++) {
            i iVarB = aVar.b(i10);
            float fI = aVar.i(i10);
            this.f37091k.b(iVarB);
            if (this.f37091k.a(iVar, fI)) {
                F(iVarB);
            }
            this.b += bVar.b * fI;
        }
        G(iVar);
    }

    public final void F(i iVar) {
        int i10;
        int i11 = this.f37090j + 1;
        i[] iVarArr = this.f37088h;
        if (i11 > iVarArr.length) {
            i[] iVarArr2 = (i[]) Arrays.copyOf(iVarArr, iVarArr.length * 2);
            this.f37088h = iVarArr2;
            this.f37089i = (i[]) Arrays.copyOf(iVarArr2, iVarArr2.length * 2);
        }
        i[] iVarArr3 = this.f37088h;
        int i12 = this.f37090j;
        iVarArr3[i12] = iVar;
        int i13 = i12 + 1;
        this.f37090j = i13;
        if (i13 > 1 && iVarArr3[i12].f37098c > iVar.f37098c) {
            int i14 = 0;
            while (true) {
                i10 = this.f37090j;
                if (i14 >= i10) {
                    break;
                }
                this.f37089i[i14] = this.f37088h[i14];
                i14++;
            }
            Arrays.sort(this.f37089i, 0, i10, new a());
            for (int i15 = 0; i15 < this.f37090j; i15++) {
                this.f37088h[i15] = this.f37089i[i15];
            }
        }
        iVar.f37097a = true;
        iVar.a(this);
    }

    public final void G(i iVar) {
        int i10 = 0;
        while (i10 < this.f37090j) {
            if (this.f37088h[i10] == iVar) {
                while (true) {
                    int i11 = this.f37090j;
                    if (i10 >= i11 - 1) {
                        this.f37090j = i11 - 1;
                        iVar.f37097a = false;
                        return;
                    } else {
                        i[] iVarArr = this.f37088h;
                        int i12 = i10 + 1;
                        iVarArr[i10] = iVarArr[i12];
                        i10 = i12;
                    }
                }
            } else {
                i10++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002e  */
    @Override // z1.b, z1.d.a
    public i a(d dVar, boolean[] zArr) {
        int i10 = -1;
        for (int i11 = 0; i11 < this.f37090j; i11++) {
            i iVar = this.f37088h[i11];
            if (!zArr[iVar.f37098c]) {
                this.f37091k.b(iVar);
                if (i10 == -1) {
                    if (this.f37091k.c()) {
                        i10 = i11;
                    }
                } else if (this.f37091k.d(this.f37088h[i10])) {
                    i10 = i11;
                }
            }
        }
        if (i10 == -1) {
            return null;
        }
        return this.f37088h[i10];
    }

    @Override // z1.b, z1.d.a
    public void b(i iVar) {
        this.f37091k.b(iVar);
        this.f37091k.e();
        iVar.f37104i[iVar.f37100e] = 1.0f;
        F(iVar);
    }

    @Override // z1.b, z1.d.a
    public void clear() {
        this.f37090j = 0;
        this.b = 0.0f;
    }

    @Override // z1.b, z1.d.a
    public boolean isEmpty() {
        return this.f37090j == 0;
    }

    @Override // z1.b
    public String toString() {
        String str = " goal -> (" + this.b + ") : ";
        for (int i10 = 0; i10 < this.f37090j; i10++) {
            this.f37091k.b(this.f37088h[i10]);
            str = str + this.f37091k + " ";
        }
        return str;
    }
}
