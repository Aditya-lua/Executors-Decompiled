package p296n0;

import android.util.Range;
import ne.InterfaceFutureC9440x;
import p140g0.C5910m0;
import p140g0.C5914n0;
import p347p0.C10108x;
import p397r0.C10773n;

/* JADX INFO: renamed from: n0.c */
/* JADX INFO: loaded from: classes.dex */
public class C8730c extends C8733c2 {

    /* JADX INFO: renamed from: c */
    public final InterfaceC8784l0 f31773c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC8812q3 f31774d;

    public C8730c(InterfaceC8784l0 interfaceC8784l0, InterfaceC8812q3 interfaceC8812q3) {
        super(interfaceC8784l0);
        this.f31773c = interfaceC8784l0;
        this.f31774d = interfaceC8812q3;
    }

    @Override // p296n0.C8733c2, p140g0.InterfaceC5909m
    /* JADX INFO: renamed from: c */
    public InterfaceFutureC9440x<Void> mo26524c(boolean z10) {
        return !C10108x.m39006b(this.f31774d, 6) ? C10773n.m40991n(new IllegalStateException("Torch is not supported")) : this.f31773c.mo26524c(z10);
    }

    @Override // p296n0.C8733c2, p140g0.InterfaceC5909m
    /* JADX INFO: renamed from: e */
    public InterfaceFutureC9440x<Void> mo26525e(float f10) {
        Range<Float> rangeM35384j;
        if (!C10108x.m39006b(this.f31774d, 0)) {
            return C10773n.m40991n(new IllegalStateException("Zoom is not supported"));
        }
        InterfaceC8812q3 interfaceC8812q3 = this.f31774d;
        if (interfaceC8812q3 != null && (rangeM35384j = interfaceC8812q3.m35384j()) != null) {
            if (f10 <= 1.0f && f10 >= 0.0f) {
                return this.f31773c.mo26526g(C8742e.m35067F(f10, ((Float) rangeM35384j.getLower()).floatValue(), ((Float) rangeM35384j.getUpper()).floatValue()));
            }
            return C10773n.m40991n(new IllegalArgumentException("Requested linearZoom " + f10 + " is not within valid range [0..1]"));
        }
        return this.f31773c.mo26525e(f10);
    }

    @Override // p296n0.C8733c2, p140g0.InterfaceC5909m
    /* JADX INFO: renamed from: g */
    public InterfaceFutureC9440x<Void> mo26526g(float f10) {
        Range<Float> rangeM35384j;
        if (!C10108x.m39006b(this.f31774d, 0)) {
            return C10773n.m40991n(new IllegalStateException("Zoom is not supported"));
        }
        InterfaceC8812q3 interfaceC8812q3 = this.f31774d;
        if (interfaceC8812q3 == null || (rangeM35384j = interfaceC8812q3.m35384j()) == null || (f10 >= ((Float) rangeM35384j.getLower()).floatValue() && f10 <= ((Float) rangeM35384j.getUpper()).floatValue())) {
            return this.f31773c.mo26526g(f10);
        }
        return C10773n.m40991n(new IllegalArgumentException("Requested zoomRatio " + f10 + " is not within valid range [" + rangeM35384j.getLower() + " , " + rangeM35384j.getUpper() + "]"));
    }

    @Override // p296n0.C8733c2, p140g0.InterfaceC5909m
    /* JADX INFO: renamed from: o */
    public InterfaceFutureC9440x<C5914n0> mo26527o(C5910m0 c5910m0) {
        C5910m0 c5910m0M39005a = C10108x.m39005a(this.f31774d, c5910m0);
        return c5910m0M39005a == null ? C10773n.m40991n(new IllegalStateException("FocusMetering is not supported")) : this.f31773c.mo26527o(c5910m0M39005a);
    }
}
