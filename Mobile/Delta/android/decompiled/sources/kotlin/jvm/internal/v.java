package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes2.dex */
public abstract class v extends x implements hu.k {
    public v() {
    }

    @Override // hu.k
    public hu.k.a c() {
        ((hu.k) getReflected()).c();
        return null;
    }

    @Override // kotlin.jvm.internal.d
    public hu.b computeReflected() {
        return d0.h(this);
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(Object obj, Object obj2) {
        return m(obj, obj2);
    }

    public v(Class cls, String str, String str2, int i10) {
        super(d.NO_RECEIVER, cls, str, str2, i10);
    }
}
