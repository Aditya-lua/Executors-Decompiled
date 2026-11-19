package gb;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class h1 extends i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f17625a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f17626c;

    public h1(int i10) {
        g1.a(i10, "initialCapacity");
        this.f17625a = new Object[i10];
        this.b = 0;
    }

    public final h1 b(Object obj) {
        obj.getClass();
        c(1);
        Object[] objArr = this.f17625a;
        int i10 = this.b;
        this.b = i10 + 1;
        objArr[i10] = obj;
        return this;
    }

    public final void c(int i10) {
        int length = this.f17625a.length;
        int iA = i1.a(length, this.b + i10);
        if (iA > length || this.f17626c) {
            this.f17625a = Arrays.copyOf(this.f17625a, iA);
            this.f17626c = false;
        }
    }
}
