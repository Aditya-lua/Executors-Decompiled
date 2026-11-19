package p001kotlin.jvm.internal;

import xu.b;
import xu.k;

/* JADX INFO: loaded from: classes2.dex */
public abstract class v extends x implements k {
    public v() {
    }

    @Override // xu.k
    public k.a c() {
        ((k) getReflected()).c();
        return null;
    }

    @Override // p001kotlin.jvm.internal.d
    public b computeReflected() {
        return d0.h(this);
    }

    @Override // p001kotlin.jvm.functions.Function2
    public Object invoke(Object obj, Object obj2) {
        return o(obj, obj2);
    }

    public v(Class cls, String str, String str2, int i10) {
        super(d.NO_RECEIVER, cls, str, str2, i10);
    }
}
