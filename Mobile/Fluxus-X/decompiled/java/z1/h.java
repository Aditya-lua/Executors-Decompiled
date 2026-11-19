package z1;

import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public class h extends z1.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f38887g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public i[] f38888h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public i[] f38889i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f38890j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b f38891k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c f38892l;

    public class a implements Comparator<i> {
        public a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(i iVar, i iVar2) {
            return iVar.f38898c - iVar2.f38898c;
        }
    }

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public i f38894a;
        public h b;

        public b(h hVar) {
            this.b = hVar;
        }

        public boolean a(i iVar, float f10) {
            boolean z10 = true;
            if (!this.f38894a.f38897a) {
                for (int i10 = 0; i10 < 9; i10++) {
                    float f11 = iVar.f38904i[i10];
                    if (f11 != 0.0f) {
                        float f12 = f11 * f10;
                        if (Math.abs(f12) < 1.0E-4f) {
                            f12 = 0.0f;
                        }
                        this.f38894a.f38904i[i10] = f12;
                    } else {
                        this.f38894a.f38904i[i10] = 0.0f;
                    }
                }
                return true;
            }
            for (int i11 = 0; i11 < 9; i11++) {
                float[] fArr = this.f38894a.f38904i;
                float f13 = fArr[i11] + (iVar.f38904i[i11] * f10);
                fArr[i11] = f13;
                if (Math.abs(f13) < 1.0E-4f) {
                    this.f38894a.f38904i[i11] = 0.0f;
                } else {
                    z10 = false;
                }
            }
            if (z10) {
                h.this.G(this.f38894a);
            }
            return false;
        }

        public void b(i iVar) {
            this.f38894a = iVar;
        }

        public final boolean c() {
            for (int i10 = 8; i10 >= 0; i10--) {
                float f10 = this.f38894a.f38904i[i10];
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
                float f10 = iVar.f38904i[i10];
                float f11 = this.f38894a.f38904i[i10];
                if (f11 != f10) {
                    if (f11 < f10) {
                        return true;
                    }
                }
            }
            return false;
        }

        public void e() {
            Arrays.fill(this.f38894a.f38904i, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.f38894a != null) {
                for (int i10 = 0; i10 < 9; i10++) {
                    str = str + this.f38894a.f38904i[i10] + " ";
                }
            }
            return str + "] " + this.f38894a;
        }
    }

    public h(c cVar) {
        super(cVar);
        this.f38887g = Barcode.FORMAT_ITF;
        this.f38888h = new i[Barcode.FORMAT_ITF];
        this.f38889i = new i[Barcode.FORMAT_ITF];
        this.f38890j = 0;
        this.f38891k = new b(this);
        this.f38892l = cVar;
    }

    @Override // z1.b
    public void B(d dVar, z1.b bVar, boolean z10) {
        i iVar = bVar.f38854a;
        if (iVar == null) {
            return;
        }
        z1.b.a aVar = bVar.f38857e;
        int iH = aVar.h();
        for (int i10 = 0; i10 < iH; i10++) {
            i iVarB = aVar.b(i10);
            float fI = aVar.i(i10);
            this.f38891k.b(iVarB);
            if (this.f38891k.a(iVar, fI)) {
                F(iVarB);
            }
            this.b += bVar.b * fI;
        }
        G(iVar);
    }

    public final void F(i iVar) {
        int i10;
        int i11 = this.f38890j + 1;
        i[] iVarArr = this.f38888h;
        if (i11 > iVarArr.length) {
            i[] iVarArr2 = (i[]) Arrays.copyOf(iVarArr, iVarArr.length * 2);
            this.f38888h = iVarArr2;
            this.f38889i = (i[]) Arrays.copyOf(iVarArr2, iVarArr2.length * 2);
        }
        i[] iVarArr3 = this.f38888h;
        int i12 = this.f38890j;
        iVarArr3[i12] = iVar;
        int i13 = i12 + 1;
        this.f38890j = i13;
        if (i13 > 1 && iVarArr3[i12].f38898c > iVar.f38898c) {
            int i14 = 0;
            while (true) {
                i10 = this.f38890j;
                if (i14 >= i10) {
                    break;
                }
                this.f38889i[i14] = this.f38888h[i14];
                i14++;
            }
            Arrays.sort(this.f38889i, 0, i10, new a());
            for (int i15 = 0; i15 < this.f38890j; i15++) {
                this.f38888h[i15] = this.f38889i[i15];
            }
        }
        iVar.f38897a = true;
        iVar.a(this);
    }

    public final void G(i iVar) {
        int i10 = 0;
        while (i10 < this.f38890j) {
            if (this.f38888h[i10] == iVar) {
                while (true) {
                    int i11 = this.f38890j;
                    if (i10 >= i11 - 1) {
                        this.f38890j = i11 - 1;
                        iVar.f38897a = false;
                        return;
                    } else {
                        i[] iVarArr = this.f38888h;
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
        for (int i11 = 0; i11 < this.f38890j; i11++) {
            i iVar = this.f38888h[i11];
            if (!zArr[iVar.f38898c]) {
                this.f38891k.b(iVar);
                if (i10 == -1) {
                    if (this.f38891k.c()) {
                        i10 = i11;
                    }
                } else if (this.f38891k.d(this.f38888h[i10])) {
                    i10 = i11;
                }
            }
        }
        if (i10 == -1) {
            return null;
        }
        return this.f38888h[i10];
    }

    @Override // z1.b, z1.d.a
    public void b(i iVar) {
        this.f38891k.b(iVar);
        this.f38891k.e();
        iVar.f38904i[iVar.f38900e] = 1.0f;
        F(iVar);
    }

    @Override // z1.b, z1.d.a
    public void clear() {
        this.f38890j = 0;
        this.b = 0.0f;
    }

    @Override // z1.b, z1.d.a
    public boolean isEmpty() {
        return this.f38890j == 0;
    }

    @Override // z1.b
    public String toString() {
        String str = BuildConfig.FLAVOR + " goal -> (" + this.b + ") : ";
        for (int i10 = 0; i10 < this.f38890j; i10++) {
            this.f38891k.b(this.f38888h[i10]);
            str = str + this.f38891k + " ";
        }
        return str;
    }
}
