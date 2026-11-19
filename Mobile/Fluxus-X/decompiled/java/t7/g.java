package t7;

import u2.o;

/* JADX INFO: loaded from: classes3.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f32152a = new String[5];
    public final long[] b = new long[5];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f32153c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f32154d = 0;

    public void a(String str) {
        int i10 = this.f32153c;
        if (i10 == 5) {
            this.f32154d++;
            return;
        }
        this.f32152a[i10] = str;
        this.b[i10] = System.nanoTime();
        o.a(str);
        this.f32153c++;
    }

    public float b(String str) {
        int i10 = this.f32154d;
        if (i10 > 0) {
            this.f32154d = i10 - 1;
            return 0.0f;
        }
        int i11 = this.f32153c - 1;
        this.f32153c = i11;
        if (i11 == -1) {
            throw new IllegalStateException("Can't end trace section. There are none.");
        }
        if (str.equals(this.f32152a[i11])) {
            o.b();
            return (System.nanoTime() - this.b[this.f32153c]) / 1000000.0f;
        }
        throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + this.f32152a[this.f32153c] + ".");
    }
}
