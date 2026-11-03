package androidx.p000lifecycle;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class i0 implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f2628a;
    public final d.a b;

    public i0(Object obj) {
        this.f2628a = obj;
        this.b = d.f2609c.c(obj.getClass());
    }

    @Override // androidx.p000lifecycle.p
    public void f(s sVar, l.a aVar) {
        this.b.a(sVar, aVar, this.f2628a);
    }
}
