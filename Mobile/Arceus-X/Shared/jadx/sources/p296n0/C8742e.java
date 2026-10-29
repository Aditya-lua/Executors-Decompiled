package p296n0;

import android.util.Range;
import androidx.p616lifecycle.AbstractC0940a0;
import androidx.p616lifecycle.C0949d0;
import p140g0.InterfaceC5964z2;
import p347p0.C10097m;
import p347p0.C10108x;
import p424s0.AbstractC11147h;
import p426s2.C11162a;
import p436t.InterfaceC11464a;

/* JADX INFO: renamed from: n0.e */
/* JADX INFO: loaded from: classes.dex */
public class C8742e extends C8739d2 {

    /* JADX INFO: renamed from: b */
    public final InterfaceC8799o0 f31802b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC8812q3 f31803c;

    /* JADX INFO: renamed from: d */
    public boolean f31804d;

    /* JADX INFO: renamed from: e */
    public boolean f31805e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC8761h0 f31806f;

    /* JADX INFO: renamed from: g */
    public AbstractC0940a0<InterfaceC5964z2> f31807g;

    public C8742e(InterfaceC8799o0 interfaceC8799o0, InterfaceC8761h0 interfaceC8761h0) {
        super(interfaceC8799o0);
        this.f31804d = false;
        this.f31805e = false;
        this.f31807g = null;
        this.f31802b = interfaceC8799o0;
        this.f31806f = interfaceC8761h0;
        this.f31803c = interfaceC8761h0.m35139w(null);
        m35071H(interfaceC8761h0.m35134U());
        m35070G(interfaceC8761h0.m35136c0());
    }

    /* JADX INFO: renamed from: D */
    public static float m35066D(float f10, float f11, float f12) {
        if (f12 == f11) {
            return 0.0f;
        }
        if (f10 == f12) {
            return 1.0f;
        }
        if (f10 == f11) {
            return 0.0f;
        }
        float f13 = 1.0f / f11;
        return ((1.0f / f10) - f13) / ((1.0f / f12) - f13);
    }

    /* JADX INFO: renamed from: F */
    public static float m35067F(float f10, float f11, float f12) {
        if (f10 == 1.0f) {
            return f12;
        }
        if (f10 == 0.0f) {
            return f11;
        }
        double d10 = 1.0f / f11;
        return (float) C11162a.m42058a(1.0d / (d10 + ((((double) (1.0f / f12)) - d10) * ((double) f10))), f11, f12);
    }

    /* JADX INFO: renamed from: C */
    public InterfaceC8761h0 m35068C() {
        return this.f31806f;
    }

    /* JADX INFO: renamed from: E */
    public InterfaceC8812q3 m35069E() {
        return this.f31803c;
    }

    /* JADX INFO: renamed from: G */
    public void m35070G(boolean z10) {
        this.f31805e = z10;
    }

    /* JADX INFO: renamed from: H */
    public void m35071H(boolean z10) {
        this.f31804d = z10;
    }

    @Override // p296n0.C8739d2, p296n0.InterfaceC8799o0
    /* JADX INFO: renamed from: o */
    public boolean mo35052o() {
        int[] iArrM35387m;
        InterfaceC8812q3 interfaceC8812q3 = this.f31803c;
        if (interfaceC8812q3 == null || (iArrM35387m = interfaceC8812q3.m35387m()) == null) {
            return super.mo35052o();
        }
        for (int i10 : iArrM35387m) {
            if (i10 == 1) {
                return true;
            }
        }
        return false;
    }

    @Override // p296n0.C8739d2, p140g0.InterfaceC5937t
    /* JADX INFO: renamed from: p */
    public AbstractC0940a0<Integer> mo26584p() {
        return !C10108x.m39006b(this.f31803c, 6) ? new C0949d0(0) : this.f31802b.mo26584p();
    }

    @Override // p296n0.C8739d2, p296n0.InterfaceC8799o0
    /* JADX INFO: renamed from: q */
    public InterfaceC8799o0 mo35053q() {
        return this.f31802b;
    }

    @Override // p296n0.C8739d2, p140g0.InterfaceC5937t
    /* JADX INFO: renamed from: z */
    public AbstractC0940a0<InterfaceC5964z2> mo26586z() {
        if (!C10108x.m39006b(this.f31803c, 0)) {
            return new C0949d0(AbstractC11147h.m42003e(1.0f, 1.0f, 1.0f, 0.0f));
        }
        if (this.f31803c != null) {
            InterfaceC5964z2 interfaceC5964z2Mo4854f = this.f31802b.mo26586z().mo4854f();
            final Range<Float> rangeM35384j = this.f31803c.m35384j();
            if (rangeM35384j != null && (((Float) rangeM35384j.getLower()).floatValue() != interfaceC5964z2Mo4854f.mo26762c() || ((Float) rangeM35384j.getUpper()).floatValue() != interfaceC5964z2Mo4854f.mo26760a())) {
                if (this.f31807g == null) {
                    this.f31807g = C10097m.m38987a(this.f31802b.mo26586z(), new InterfaceC11464a() { // from class: n0.d
                        @Override // p436t.InterfaceC11464a
                        public final Object apply(Object obj) {
                            Range range = rangeM35384j;
                            InterfaceC5964z2 interfaceC5964z2 = (InterfaceC5964z2) obj;
                            return AbstractC11147h.m42003e(interfaceC5964z2.mo26763d(), ((Float) range.getUpper()).floatValue(), ((Float) range.getLower()).floatValue(), C8742e.m35066D(interfaceC5964z2.mo26763d(), ((Float) range.getLower()).floatValue(), ((Float) range.getUpper()).floatValue()));
                        }
                    });
                }
                return this.f31807g;
            }
        }
        return this.f31802b.mo26586z();
    }
}
