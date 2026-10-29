package fb;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class g1 extends h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f16531a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f16532c;

    public g1(int i10) {
        f1.a(i10, "initialCapacity");
        this.f16531a = new Object[i10];
        this.b = 0;
    }

    public final g1 b(Object obj) {
        obj.getClass();
        c(1);
        Object[] objArr = this.f16531a;
        int i10 = this.b;
        this.b = i10 + 1;
        objArr[i10] = obj;
        return this;
    }

    public final void c(int i10) {
        int length = this.f16531a.length;
        int iA = h1.a(length, this.b + i10);
        if (iA > length || this.f16532c) {
            this.f16531a = Arrays.copyOf(this.f16531a, iA);
            this.f16532c = false;
        }
    }
}
