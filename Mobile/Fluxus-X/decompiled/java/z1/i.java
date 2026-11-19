package z1;

import com.github.luben.zstd.BuildConfig;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class i implements Comparable<i> {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static int f38896r = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f38897a;
    public String b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f38901f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a f38905j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f38898c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f38899d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f38900e = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f38902g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float[] f38903h = new float[9];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float[] f38904i = new float[9];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b[] f38906k = new b[16];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f38907l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f38908m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f38909n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f38910o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f38911p = 0.0f;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public HashSet<b> f38912q = null;

    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public i(a aVar, String str) {
        this.f38905j = aVar;
    }

    public static void c() {
        f38896r++;
    }

    public final void a(b bVar) {
        int i10 = 0;
        while (true) {
            int i11 = this.f38907l;
            if (i10 >= i11) {
                b[] bVarArr = this.f38906k;
                if (i11 >= bVarArr.length) {
                    this.f38906k = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f38906k;
                int i12 = this.f38907l;
                bVarArr2[i12] = bVar;
                this.f38907l = i12 + 1;
                return;
            }
            if (this.f38906k[i10] == bVar) {
                return;
            } else {
                i10++;
            }
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(i iVar) {
        return this.f38898c - iVar.f38898c;
    }

    public final void d(b bVar) {
        int i10 = this.f38907l;
        int i11 = 0;
        while (i11 < i10) {
            if (this.f38906k[i11] == bVar) {
                while (i11 < i10 - 1) {
                    b[] bVarArr = this.f38906k;
                    int i12 = i11 + 1;
                    bVarArr[i11] = bVarArr[i12];
                    i11 = i12;
                }
                this.f38907l--;
                return;
            }
            i11++;
        }
    }

    public void e() {
        this.b = null;
        this.f38905j = a.UNKNOWN;
        this.f38900e = 0;
        this.f38898c = -1;
        this.f38899d = -1;
        this.f38901f = 0.0f;
        this.f38902g = false;
        this.f38909n = false;
        this.f38910o = -1;
        this.f38911p = 0.0f;
        int i10 = this.f38907l;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f38906k[i11] = null;
        }
        this.f38907l = 0;
        this.f38908m = 0;
        this.f38897a = false;
        Arrays.fill(this.f38904i, 0.0f);
    }

    public void h(d dVar, float f10) {
        this.f38901f = f10;
        this.f38902g = true;
        this.f38909n = false;
        this.f38910o = -1;
        this.f38911p = 0.0f;
        int i10 = this.f38907l;
        this.f38899d = -1;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f38906k[i11].A(dVar, this, false);
        }
        this.f38907l = 0;
    }

    public void k(a aVar, String str) {
        this.f38905j = aVar;
    }

    public final void m(d dVar, b bVar) {
        int i10 = this.f38907l;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f38906k[i11].B(dVar, bVar, false);
        }
        this.f38907l = 0;
    }

    public String toString() {
        if (this.b != null) {
            return BuildConfig.FLAVOR + this.b;
        }
        return BuildConfig.FLAVOR + this.f38898c;
    }
}
