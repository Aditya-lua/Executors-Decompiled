package kotlin.jvm.internal;

import hu.InterfaceC6566b;
import hu.InterfaceC6573i;

/* JADX INFO: renamed from: kotlin.jvm.internal.r */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7751r extends AbstractC7757x implements InterfaceC6573i {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC7751r() {
    }

    @Override // kotlin.jvm.internal.AbstractC7730d
    public InterfaceC6566b computeReflected() {
        return C7731d0.m32006f(this);
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return get();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public AbstractC7751r(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }
}
