package p125fb;

import java.util.Arrays;

/* JADX INFO: renamed from: fb.g1 */
/* JADX INFO: loaded from: classes.dex */
public class C5522g1 extends C5526h1 {

    /* JADX INFO: renamed from: a */
    public Object[] f21296a;

    /* JADX INFO: renamed from: b */
    public int f21297b;

    /* JADX INFO: renamed from: c */
    public boolean f21298c;

    public C5522g1(int i10) {
        C5518f1.m25176a(i10, "initialCapacity");
        this.f21296a = new Object[i10];
        this.f21297b = 0;
    }

    /* JADX INFO: renamed from: b */
    public final C5522g1 m25184b(Object obj) {
        obj.getClass();
        m25185c(1);
        Object[] objArr = this.f21296a;
        int i10 = this.f21297b;
        this.f21297b = i10 + 1;
        objArr[i10] = obj;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final void m25185c(int i10) {
        int length = this.f21296a.length;
        int iM25192a = C5526h1.m25192a(length, this.f21297b + i10);
        if (iM25192a > length || this.f21298c) {
            this.f21296a = Arrays.copyOf(this.f21296a, iM25192a);
            this.f21298c = false;
        }
    }
}
