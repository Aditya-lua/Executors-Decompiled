package p001kotlin.jvm.internal;

import xu.b;
import xu.i;

/* JADX INFO: loaded from: classes2.dex */
public abstract class r extends x implements i {
    public r() {
    }

    @Override // p001kotlin.jvm.internal.d
    public b computeReflected() {
        return d0.f(this);
    }

    @Override // p001kotlin.jvm.functions.Function0
    public Object invoke() {
        return get();
    }

    public r(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }
}
