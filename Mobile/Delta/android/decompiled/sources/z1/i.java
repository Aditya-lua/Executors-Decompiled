package z1;

import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class i implements Comparable<i> {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static int f37791r = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f37792a;
    public String b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f37796f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a f37800j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f37793c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f37794d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f37795e = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f37797g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float[] f37798h = new float[9];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float[] f37799i = new float[9];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b[] f37801k = new b[16];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f37802l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f37803m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f37804n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f37805o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f37806p = 0.0f;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public HashSet<b> f37807q = null;

    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public i(a aVar, String str) {
        this.f37800j = aVar;
    }

    public static void c() {
        f37791r++;
    }

    public final void a(b bVar) {
        int i10 = 0;
        while (true) {
            int i11 = this.f37802l;
            if (i10 >= i11) {
                b[] bVarArr = this.f37801k;
                if (i11 >= bVarArr.length) {
                    this.f37801k = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f37801k;
                int i12 = this.f37802l;
                bVarArr2[i12] = bVar;
                this.f37802l = i12 + 1;
                return;
            }
            if (this.f37801k[i10] == bVar) {
                return;
            } else {
                i10++;
            }
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(i iVar) {
        return this.f37793c - iVar.f37793c;
    }

    public final void d(b bVar) {
        int i10 = this.f37802l;
        int i11 = 0;
        while (i11 < i10) {
            if (this.f37801k[i11] == bVar) {
                while (i11 < i10 - 1) {
                    b[] bVarArr = this.f37801k;
                    int i12 = i11 + 1;
                    bVarArr[i11] = bVarArr[i12];
                    i11 = i12;
                }
                this.f37802l--;
                return;
            }
            i11++;
        }
    }

    public void e() {
        this.b = null;
        this.f37800j = a.UNKNOWN;
        this.f37795e = 0;
        this.f37793c = -1;
        this.f37794d = -1;
        this.f37796f = 0.0f;
        this.f37797g = false;
        this.f37804n = false;
        this.f37805o = -1;
        this.f37806p = 0.0f;
        int i10 = this.f37802l;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f37801k[i11] = null;
        }
        this.f37802l = 0;
        this.f37803m = 0;
        this.f37792a = false;
        Arrays.fill(this.f37799i, 0.0f);
    }

    public void h(d dVar, float f10) {
        this.f37796f = f10;
        this.f37797g = true;
        this.f37804n = false;
        this.f37805o = -1;
        this.f37806p = 0.0f;
        int i10 = this.f37802l;
        this.f37794d = -1;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f37801k[i11].A(dVar, this, false);
        }
        this.f37802l = 0;
    }

    public void j(a aVar, String str) {
        this.f37800j = aVar;
    }

    public final void l(d dVar, b bVar) {
        int i10 = this.f37802l;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f37801k[i11].B(dVar, bVar, false);
        }
        this.f37802l = 0;
    }

    public String toString() {
        if (this.b != null) {
            return "" + this.b;
        }
        return "" + this.f37793c;
    }
}
