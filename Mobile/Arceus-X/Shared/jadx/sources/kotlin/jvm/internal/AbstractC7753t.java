package kotlin.jvm.internal;

import hu.InterfaceC6566b;
import hu.InterfaceC6574j;

/* JADX INFO: renamed from: kotlin.jvm.internal.t */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7753t extends AbstractC7757x implements InterfaceC6574j {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC7753t() {
    }

    @Override // hu.InterfaceC6574j
    /* JADX INFO: renamed from: c */
    public InterfaceC6574j.a mo28429c() {
        ((InterfaceC6574j) getReflected()).mo28429c();
        return null;
    }

    @Override // kotlin.jvm.internal.AbstractC7730d
    public InterfaceC6566b computeReflected() {
        return C7731d0.m32007g(this);
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return get(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public AbstractC7753t(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }
}
