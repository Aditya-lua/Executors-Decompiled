package s7;

import u2.o;

/* JADX INFO: loaded from: classes3.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f30499a = new String[5];
    public final long[] b = new long[5];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f30500c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f30501d = 0;

    public void a(String str) {
        int i10 = this.f30500c;
        if (i10 == 5) {
            this.f30501d++;
            return;
        }
        this.f30499a[i10] = str;
        this.b[i10] = System.nanoTime();
        o.a(str);
        this.f30500c++;
    }

    public float b(String str) {
        int i10 = this.f30501d;
        if (i10 > 0) {
            this.f30501d = i10 - 1;
            return 0.0f;
        }
        int i11 = this.f30500c - 1;
        this.f30500c = i11;
        if (i11 == -1) {
            throw new IllegalStateException("Can't end trace section. There are none.");
        }
        if (str.equals(this.f30499a[i11])) {
            o.b();
            return (System.nanoTime() - this.b[this.f30500c]) / 1000000.0f;
        }
        throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + this.f30499a[this.f30500c] + ".");
    }
}
