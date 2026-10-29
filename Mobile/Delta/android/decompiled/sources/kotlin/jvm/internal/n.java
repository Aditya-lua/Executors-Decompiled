package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes2.dex */
public abstract class n extends p implements hu.h {
    public n() {
    }

    @Override // hu.j
    public hu.j.a c() {
        ((hu.h) getReflected()).c();
        return null;
    }

    @Override // kotlin.jvm.internal.d
    public hu.b computeReflected() {
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
