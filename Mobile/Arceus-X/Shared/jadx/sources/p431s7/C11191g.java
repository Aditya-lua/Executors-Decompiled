package p431s7;

import p456u2.C11786o;

/* JADX INFO: renamed from: s7.g */
/* JADX INFO: loaded from: classes3.dex */
public class C11191g {

    /* JADX INFO: renamed from: a */
    public final String[] f39469a = new String[5];

    /* JADX INFO: renamed from: b */
    public final long[] f39470b = new long[5];

    /* JADX INFO: renamed from: c */
    public int f39471c = 0;

    /* JADX INFO: renamed from: d */
    public int f39472d = 0;

    /* JADX INFO: renamed from: a */
    public void m42155a(String str) {
        int i10 = this.f39471c;
        if (i10 == 5) {
            this.f39472d++;
            return;
        }
        this.f39469a[i10] = str;
        this.f39470b[i10] = System.nanoTime();
        C11786o.m44081a(str);
        this.f39471c++;
    }

    /* JADX INFO: renamed from: b */
    public float m42156b(String str) {
        int i10 = this.f39472d;
        if (i10 > 0) {
            this.f39472d = i10 - 1;
            return 0.0f;
        }
        int i11 = this.f39471c - 1;
        this.f39471c = i11;
        if (i11 == -1) {
            throw new IllegalStateException("Can't end trace section. There are none.");
        }
        if (str.equals(this.f39469a[i11])) {
            C11786o.m44082b();
            return (System.nanoTime() - this.f39470b[this.f39471c]) / 1000000.0f;
        }
        throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + this.f39469a[this.f39471c] + ".");
    }
}
