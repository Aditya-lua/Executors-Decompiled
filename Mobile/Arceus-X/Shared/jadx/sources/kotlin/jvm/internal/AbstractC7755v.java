package kotlin.jvm.internal;

import hu.InterfaceC6566b;
import hu.InterfaceC6575k;

/* JADX INFO: renamed from: kotlin.jvm.internal.v */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7755v extends AbstractC7757x implements InterfaceC6575k {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC7755v() {
    }

    @Override // hu.InterfaceC6575k
    /* JADX INFO: renamed from: c */
    public InterfaceC6575k.a mo28430c() {
        ((InterfaceC6575k) getReflected()).mo28430c();
        return null;
    }

    @Override // kotlin.jvm.internal.AbstractC7730d
    public InterfaceC6566b computeReflected() {
        return C7731d0.m32008h(this);
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(Object obj, Object obj2) {
        return mo28431m(obj, obj2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public AbstractC7755v(Class cls, String str, String str2, int i10) {
        super(AbstractC7730d.NO_RECEIVER, cls, str, str2, i10);
    }
}
