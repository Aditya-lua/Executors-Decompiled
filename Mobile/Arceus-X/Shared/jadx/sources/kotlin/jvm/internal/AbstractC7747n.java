package kotlin.jvm.internal;

import hu.InterfaceC6566b;
import hu.InterfaceC6572h;
import hu.InterfaceC6574j;

/* JADX INFO: renamed from: kotlin.jvm.internal.n */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7747n extends AbstractC7749p implements InterfaceC6572h {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC7747n() {
    }

    @Override // hu.InterfaceC6574j
    /* JADX INFO: renamed from: c */
    public InterfaceC6574j.a mo28429c() {
        ((InterfaceC6572h) getReflected()).mo28429c();
        return null;
    }

    @Override // kotlin.jvm.internal.AbstractC7730d
    public InterfaceC6566b computeReflected() {
        return C7731d0.m32004d(this);
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return get(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public AbstractC7747n(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }
}
