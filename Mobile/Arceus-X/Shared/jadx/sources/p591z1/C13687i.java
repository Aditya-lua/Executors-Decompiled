package p591z1;

import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: renamed from: z1.i */
/* JADX INFO: loaded from: classes.dex */
public class C13687i implements Comparable<C13687i> {

    /* JADX INFO: renamed from: r */
    public static int f48027r = 1;

    /* JADX INFO: renamed from: a */
    public boolean f48028a;

    /* JADX INFO: renamed from: b */
    public String f48029b;

    /* JADX INFO: renamed from: f */
    public float f48033f;

    /* JADX INFO: renamed from: j */
    public a f48037j;

    /* JADX INFO: renamed from: c */
    public int f48030c = -1;

    /* JADX INFO: renamed from: d */
    public int f48031d = -1;

    /* JADX INFO: renamed from: e */
    public int f48032e = 0;

    /* JADX INFO: renamed from: g */
    public boolean f48034g = false;

    /* JADX INFO: renamed from: h */
    public float[] f48035h = new float[9];

    /* JADX INFO: renamed from: i */
    public float[] f48036i = new float[9];

    /* JADX INFO: renamed from: k */
    public C13680b[] f48038k = new C13680b[16];

    /* JADX INFO: renamed from: l */
    public int f48039l = 0;

    /* JADX INFO: renamed from: m */
    public int f48040m = 0;

    /* JADX INFO: renamed from: n */
    public boolean f48041n = false;

    /* JADX INFO: renamed from: o */
    public int f48042o = -1;

    /* JADX INFO: renamed from: p */
    public float f48043p = 0.0f;

    /* JADX INFO: renamed from: q */
    public HashSet<C13680b> f48044q = null;

    /* JADX INFO: renamed from: z1.i$a */
    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public C13687i(a aVar, String str) {
        this.f48037j = aVar;
    }

    /* JADX INFO: renamed from: c */
    public static void m49991c() {
        f48027r++;
    }

    /* JADX INFO: renamed from: a */
    public final void m49992a(C13680b c13680b) {
        int i10 = 0;
        while (true) {
            int i11 = this.f48039l;
            if (i10 >= i11) {
                C13680b[] c13680bArr = this.f48038k;
                if (i11 >= c13680bArr.length) {
                    this.f48038k = (C13680b[]) Arrays.copyOf(c13680bArr, c13680bArr.length * 2);
                }
                C13680b[] c13680bArr2 = this.f48038k;
                int i12 = this.f48039l;
                c13680bArr2[i12] = c13680b;
                this.f48039l = i12 + 1;
                return;
            }
            if (this.f48038k[i10] == c13680b) {
                return;
            } else {
                i10++;
            }
        }
    }

    /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(C13687i c13687i) {
        return this.f48030c - c13687i.f48030c;
    }

    /* JADX INFO: renamed from: d */
    public final void m49994d(C13680b c13680b) {
        int i10 = this.f48039l;
        int i11 = 0;
        while (i11 < i10) {
            if (this.f48038k[i11] == c13680b) {
                while (i11 < i10 - 1) {
                    C13680b[] c13680bArr = this.f48038k;
                    int i12 = i11 + 1;
                    c13680bArr[i11] = c13680bArr[i12];
                    i11 = i12;
                }
                this.f48039l--;
                return;
            }
            i11++;
        }
    }

    /* JADX INFO: renamed from: e */
    public void m49995e() {
        this.f48029b = null;
        this.f48037j = a.UNKNOWN;
        this.f48032e = 0;
        this.f48030c = -1;
        this.f48031d = -1;
        this.f48033f = 0.0f;
        this.f48034g = false;
        this.f48041n = false;
        this.f48042o = -1;
        this.f48043p = 0.0f;
        int i10 = this.f48039l;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f48038k[i11] = null;
        }
        this.f48039l = 0;
        this.f48040m = 0;
        this.f48028a = false;
        Arrays.fill(this.f48036i, 0.0f);
    }

    /* JADX INFO: renamed from: h */
    public void m49996h(C13682d c13682d, float f10) {
        this.f48033f = f10;
        this.f48034g = true;
        this.f48041n = false;
        this.f48042o = -1;
        this.f48043p = 0.0f;
        int i10 = this.f48039l;
        this.f48031d = -1;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f48038k[i11].m49918A(c13682d, this, false);
        }
        this.f48039l = 0;
    }

    /* JADX INFO: renamed from: j */
    public void m49997j(a aVar, String str) {
        this.f48037j = aVar;
    }

    /* JADX INFO: renamed from: l */
    public final void m49998l(C13682d c13682d, C13680b c13680b) {
        int i10 = this.f48039l;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f48038k[i11].mo49919B(c13682d, c13680b, false);
        }
        this.f48039l = 0;
    }

    public String toString() {
        if (this.f48029b != null) {
            return "" + this.f48029b;
        }
        return "" + this.f48030c;
    }
}
