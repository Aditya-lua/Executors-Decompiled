package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes2.dex */
public abstract class n extends p implements fu.h {
    public n() {
    }

    @Override // fu.j
    public fu.j.a c() {
        ((fu.h) getReflected()).c();
        return null;
    }

    @Override // kotlin.jvm.internal.d
    public fu.b computeReflected() {
        return d0.d(this);
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return get(obj);
    }

    public n(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }
}
