package androidx.p000lifecycle;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class i0 implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f2783a;
    public final d.a b;

    public i0(Object obj) {
        this.f2783a = obj;
        this.b = d.f2764c.c(obj.getClass());
    }

    @Override // androidx.p000lifecycle.p
    public void g(s sVar, l.a aVar) {
        this.b.a(sVar, aVar, this.f2783a);
    }
}
