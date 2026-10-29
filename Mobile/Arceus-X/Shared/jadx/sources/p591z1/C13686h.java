package p591z1;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: renamed from: z1.h */
/* JADX INFO: loaded from: classes.dex */
public class C13686h extends C13680b {

    /* JADX INFO: renamed from: g */
    public int f48017g;

    /* JADX INFO: renamed from: h */
    public C13687i[] f48018h;

    /* JADX INFO: renamed from: i */
    public C13687i[] f48019i;

    /* JADX INFO: renamed from: j */
    public int f48020j;

    /* JADX INFO: renamed from: k */
    public b f48021k;

    /* JADX INFO: renamed from: l */
    public C13681c f48022l;

    /* JADX INFO: renamed from: z1.h$a */
    public class a implements Comparator<C13687i> {
        public a() {
        }

        /* JADX DEBUG: Method merged with bridge method: compare(Ljava/lang/Object;Ljava/lang/Object;)I */
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C13687i c13687i, C13687i c13687i2) {
            return c13687i.f48030c - c13687i2.f48030c;
        }
    }

    /* JADX INFO: renamed from: z1.h$b */
    public class b {

        /* JADX INFO: renamed from: a */
        public C13687i f48024a;

        /* JADX INFO: renamed from: b */
        public C13686h f48025b;

        public b(C13686h c13686h) {
            this.f48025b = c13686h;
        }

        /* JADX INFO: renamed from: a */
        public boolean m49986a(C13687i c13687i, float f10) {
            boolean z10 = true;
            if (!this.f48024a.f48028a) {
                for (int i10 = 0; i10 < 9; i10++) {
                    float f11 = c13687i.f48036i[i10];
                    if (f11 != 0.0f) {
                        float f12 = f11 * f10;
                        if (Math.abs(f12) < 1.0E-4f) {
                            f12 = 0.0f;
                        }
                        this.f48024a.f48036i[i10] = f12;
                    } else {
                        this.f48024a.f48036i[i10] = 0.0f;
                    }
                }
                return true;
            }
            for (int i11 = 0; i11 < 9; i11++) {
                float[] fArr = this.f48024a.f48036i;
                float f13 = fArr[i11] + (c13687i.f48036i[i11] * f10);
                fArr[i11] = f13;
                if (Math.abs(f13) < 1.0E-4f) {
                    this.f48024a.f48036i[i11] = 0.0f;
                } else {
                    z10 = false;
                }
            }
            if (z10) {
                C13686h.this.m49984G(this.f48024a);
            }
            return false;
        }

        /* JADX INFO: renamed from: b */
        public void m49987b(C13687i c13687i) {
            this.f48024a = c13687i;
        }

        /* JADX INFO: renamed from: c */
        public final boolean m49988c() {
            for (int i10 = 8; i10 >= 0; i10--) {
                float f10 = this.f48024a.f48036i[i10];
                if (f10 > 0.0f) {
                    return false;
                }
                if (f10 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: d */
        public final boolean m49989d(C13687i c13687i) {
            for (int i10 = 8; i10 >= 0; i10--) {
                float f10 = c13687i.f48036i[i10];
                float f11 = this.f48024a.f48036i[i10];
                if (f11 != f10) {
                    if (f11 < f10) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: e */
        public void m49990e() {
            Arrays.fill(this.f48024a.f48036i, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.f48024a != null) {
                for (int i10 = 0; i10 < 9; i10++) {
                    str = str + this.f48024a.f48036i[i10] + " ";
                }
            }
            return str + "] " + this.f48024a;
        }
    }

    public C13686h(C13681c c13681c) {
        super(c13681c);
        this.f48017g = 128;
        this.f48018h = new C13687i[128];
        this.f48019i = new C13687i[128];
        this.f48020j = 0;
        this.f48021k = new b(this);
        this.f48022l = c13681c;
    }

    @Override // p591z1.C13680b
    /* JADX INFO: renamed from: B */
    public void mo49919B(C13682d c13682d, C13680b c13680b, boolean z10) {
        C13687i c13687i = c13680b.f47980a;
        if (c13687i == null) {
            return;
        }
        C13680b.a aVar = c13680b.f47984e;
        int iMo49914h = aVar.mo49914h();
        for (int i10 = 0; i10 < iMo49914h; i10++) {
            C13687i c13687iMo49908b = aVar.mo49908b(i10);
            float fMo49915i = aVar.mo49915i(i10);
            this.f48021k.m49987b(c13687iMo49908b);
            if (this.f48021k.m49986a(c13687i, fMo49915i)) {
                m49983F(c13687iMo49908b);
            }
            this.f47981b += c13680b.f47981b * fMo49915i;
        }
        m49984G(c13687i);
    }

    /* JADX INFO: renamed from: F */
    public final void m49983F(C13687i c13687i) {
        int i10;
        int i11 = this.f48020j + 1;
        C13687i[] c13687iArr = this.f48018h;
        if (i11 > c13687iArr.length) {
            C13687i[] c13687iArr2 = (C13687i[]) Arrays.copyOf(c13687iArr, c13687iArr.length * 2);
            this.f48018h = c13687iArr2;
            this.f48019i = (C13687i[]) Arrays.copyOf(c13687iArr2, c13687iArr2.length * 2);
        }
        C13687i[] c13687iArr3 = this.f48018h;
        int i12 = this.f48020j;
        c13687iArr3[i12] = c13687i;
        int i13 = i12 + 1;
        this.f48020j = i13;
        if (i13 > 1 && c13687iArr3[i12].f48030c > c13687i.f48030c) {
            int i14 = 0;
            while (true) {
                i10 = this.f48020j;
                if (i14 >= i10) {
                    break;
                }
                this.f48019i[i14] = this.f48018h[i14];
                i14++;
            }
            Arrays.sort(this.f48019i, 0, i10, new a());
            for (int i15 = 0; i15 < this.f48020j; i15++) {
                this.f48018h[i15] = this.f48019i[i15];
            }
        }
        c13687i.f48028a = true;
        c13687i.m49992a(this);
    }

    /* JADX INFO: renamed from: G */
    public final void m49984G(C13687i c13687i) {
        int i10 = 0;
        while (i10 < this.f48020j) {
            if (this.f48018h[i10] == c13687i) {
                while (true) {
                    int i11 = this.f48020j;
                    if (i10 >= i11 - 1) {
                        this.f48020j = i11 - 1;
                        c13687i.f48028a = false;
                        return;
                    } else {
                        C13687i[] c13687iArr = this.f48018h;
                        int i12 = i10 + 1;
                        c13687iArr[i10] = c13687iArr[i12];
                        i10 = i12;
                    }
                }
            } else {
                i10++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002e  */
    @Override // p591z1.C13680b, p591z1.C13682d.a
    /* JADX INFO: renamed from: a */
    public C13687i mo49922a(C13682d c13682d, boolean[] zArr) {
        int i10 = -1;
        for (int i11 = 0; i11 < this.f48020j; i11++) {
            C13687i c13687i = this.f48018h[i11];
            if (!zArr[c13687i.f48030c]) {
                this.f48021k.m49987b(c13687i);
                if (i10 == -1) {
                    if (this.f48021k.m49988c()) {
                        i10 = i11;
                    }
                } else if (this.f48021k.m49989d(this.f48018h[i10])) {
                    i10 = i11;
                }
            }
        }
        if (i10 == -1) {
            return null;
        }
        return this.f48018h[i10];
    }

    @Override // p591z1.C13680b, p591z1.C13682d.a
    /* JADX INFO: renamed from: b */
    public void mo49923b(C13687i c13687i) {
        this.f48021k.m49987b(c13687i);
        this.f48021k.m49990e();
        c13687i.f48036i[c13687i.f48032e] = 1.0f;
        m49983F(c13687i);
    }

    @Override // p591z1.C13680b, p591z1.C13682d.a
    public void clear() {
        this.f48020j = 0;
        this.f47981b = 0.0f;
    }

    @Override // p591z1.C13680b, p591z1.C13682d.a
    public boolean isEmpty() {
        return this.f48020j == 0;
    }

    @Override // p591z1.C13680b
    public String toString() {
        String str = " goal -> (" + this.f47981b + ") : ";
        for (int i10 = 0; i10 < this.f48020j; i10++) {
            this.f48021k.m49987b(this.f48018h[i10]);
            str = str + this.f48021k + " ";
        }
        return str;
    }
}
