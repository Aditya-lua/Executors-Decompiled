package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes2.dex */
public abstract class t extends x implements fu.j {
    public t() {
    }

    @Override // fu.j
    public fu.j.a c() {
        ((fu.j) getReflected()).c();
        return null;
    }

    @Override // kotlin.jvm.internal.d
    public fu.b computeReflected() {
        return d0.g(this);
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return get(obj);
    }

    public t(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }
}
