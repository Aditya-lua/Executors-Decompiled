package fb;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class g1 extends h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f17127a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f17128c;

    public g1(int i10) {
        f1.a(i10, "initialCapacity");
        this.f17127a = new Object[i10];
        this.b = 0;
    }

    public final g1 b(Object obj) {
        obj.getClass();
        c(1);
        Object[] objArr = this.f17127a;
        int i10 = this.b;
        this.b = i10 + 1;
        objArr[i10] = obj;
        return this;
    }

    public final void c(int i10) {
        int length = this.f17127a.length;
        int iA = h1.a(length, this.b + i10);
        if (iA > length || this.f17128c) {
            this.f17127a = Arrays.copyOf(this.f17127a, iA);
            this.f17128c = false;
        }
    }
}
