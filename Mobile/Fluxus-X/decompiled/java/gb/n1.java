package gb;

import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class n1 extends o1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient int f17649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f17650d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o1 f17651e;

    public n1(o1 o1Var, int i10, int i11) {
        Objects.requireNonNull(o1Var);
        this.f17651e = o1Var;
        this.f17649c = i10;
        this.f17650d = i11;
    }

    @Override // gb.j1
    public final Object[] a() {
        return this.f17651e.a();
    }

    @Override // gb.j1
    public final int b() {
        return this.f17651e.b() + this.f17649c;
    }

    @Override // gb.j1
    public final int c() {
        return this.f17651e.b() + this.f17649c + this.f17650d;
    }

    @Override // gb.o1
    /* JADX INFO: renamed from: e */
    public final o1 subList(int i10, int i11) {
        a1.c(i10, i11, this.f17650d);
        int i12 = this.f17649c;
        return this.f17651e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.List
    public final Object get(int i10) {
        a1.a(i10, this.f17650d, "index");
        return this.f17651e.get(i10 + this.f17649c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f17650d;
    }

    @Override // gb.o1, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
