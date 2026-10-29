package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes2.dex */
public abstract class r extends x implements hu.i {
    public r() {
    }

    @Override // kotlin.jvm.internal.d
    public hu.b computeReflected() {
        return d0.f(this);
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return get();
    }

    public r(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }
}
