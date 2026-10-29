package z1;

import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class i implements Comparable<i> {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static int f37096r = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f37097a;
    public String b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f37101f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a f37105j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f37098c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f37099d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f37100e = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f37102g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float[] f37103h = new float[9];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float[] f37104i = new float[9];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b[] f37106k = new b[16];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f37107l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f37108m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f37109n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f37110o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f37111p = 0.0f;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public HashSet<b> f37112q = null;

    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public i(a aVar, String str) {
        this.f37105j = aVar;
    }

    public static void c() {
        f37096r++;
    }

    public final void a(b bVar) {
        int i10 = 0;
        while (true) {
            int i11 = this.f37107l;
            if (i10 >= i11) {
                b[] bVarArr = this.f37106k;
                if (i11 >= bVarArr.length) {
                    this.f37106k = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f37106k;
                int i12 = this.f37107l;
                bVarArr2[i12] = bVar;
                this.f37107l = i12 + 1;
                return;
            }
            if (this.f37106k[i10] == bVar) {
                return;
            } else {
                i10++;
            }
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(i iVar) {
        return this.f37098c - iVar.f37098c;
    }

    public final void d(b bVar) {
        int i10 = this.f37107l;
        int i11 = 0;
        while (i11 < i10) {
            if (this.f37106k[i11] == bVar) {
                while (i11 < i10 - 1) {
                    b[] bVarArr = this.f37106k;
                    int i12 = i11 + 1;
                    bVarArr[i11] = bVarArr[i12];
                    i11 = i12;
                }
                this.f37107l--;
                return;
            }
            i11++;
        }
    }

    public void e() {
        this.b = null;
        this.f37105j = a.UNKNOWN;
        this.f37100e = 0;
        this.f37098c = -1;
        this.f37099d = -1;
        this.f37101f = 0.0f;
        this.f37102g = false;
        this.f37109n = false;
        this.f37110o = -1;
        this.f37111p = 0.0f;
        int i10 = this.f37107l;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f37106k[i11] = null;
        }
        this.f37107l = 0;
        this.f37108m = 0;
        this.f37097a = false;
        Arrays.fill(this.f37104i, 0.0f);
    }

    public void h(d dVar, float f10) {
        this.f37101f = f10;
        this.f37102g = true;
        this.f37109n = false;
        this.f37110o = -1;
        this.f37111p = 0.0f;
        int i10 = this.f37107l;
        this.f37099d = -1;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f37106k[i11].A(dVar, this, false);
        }
        this.f37107l = 0;
    }

    public void j(a aVar, String str) {
        this.f37105j = aVar;
    }

    public final void l(d dVar, b bVar) {
        int i10 = this.f37107l;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f37106k[i11].B(dVar, bVar, false);
        }
        this.f37107l = 0;
    }

    public String toString() {
        if (this.b != null) {
            return "" + this.b;
        }
        return "" + this.f37098c;
    }
}
