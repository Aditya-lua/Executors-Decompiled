package p001kotlin.jvm.internal;

import xu.b;
import xu.h;
import xu.j;

/* JADX INFO: loaded from: classes2.dex */
public abstract class n extends p implements h {
    public n() {
    }

    @Override // xu.j
    public j.a c() {
        ((h) getReflected()).c();
        return null;
    }

    @Override // p001kotlin.jvm.internal.d
    public b computeReflected() {
        return d0.d(this);
    }

    @Override // p001kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return get(obj);
    }

    public n(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }
}
