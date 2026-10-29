package p256ku;

import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ku.f2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0011\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\n\u0010\tR\u001a\u0010\u000e\u001a\u00020\u00078\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\tR\u0014\u0010\u0010\u001a\u00020\u00078PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\t¨\u0006\u0011"}, m31665d2 = {"Lku/f2;", "Lku/j2;", "Lku/a0;", "Lku/d2;", "parent", "<init>", "(Lku/d2;)V", "", "e", "()Z", "T0", "c", "Z", "g0", "handlesException", "h0", "onCancelComplete", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public class C7860f2 extends C7880j2 implements InterfaceC7833a0 {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final boolean handlesException;

    public C7860f2(@Nullable InterfaceC7850d2 interfaceC7850d2) {
        super(true);
        m32752q0(interfaceC7850d2);
        this.handlesException = m32638T0();
    }

    /* JADX INFO: renamed from: T0 */
    public final boolean m32638T0() {
        C7880j2 c7880j2M32687v;
        InterfaceC7925u interfaceC7925uM32749k0 = m32749k0();
        C7929v c7929v = interfaceC7925uM32749k0 instanceof C7929v ? (C7929v) interfaceC7925uM32749k0 : null;
        if (c7929v != null && (c7880j2M32687v = c7929v.m32687v()) != null) {
            while (!c7880j2M32687v.getHandlesException()) {
                InterfaceC7925u interfaceC7925uM32749k1 = c7880j2M32687v.m32749k0();
                C7929v c7929v2 = interfaceC7925uM32749k1 instanceof C7929v ? (C7929v) interfaceC7925uM32749k1 : null;
                if (c7929v2 == null || (c7880j2M32687v = c7929v2.m32687v()) == null) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // p256ku.InterfaceC7833a0
    /* JADX INFO: renamed from: e */
    public boolean mo32559e() {
        return m32758w0(Unit.f29331a);
    }

    @Override // p256ku.C7880j2
    /* JADX INFO: renamed from: g0, reason: from getter */
    public boolean getHandlesException() {
        return this.handlesException;
    }

    @Override // p256ku.C7880j2
    /* JADX INFO: renamed from: h0 */
    public boolean mo32640h0() {
        return true;
    }
}
