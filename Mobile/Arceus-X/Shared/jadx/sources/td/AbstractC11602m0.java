package td;

import ee.AbstractRunnableC5098u0;
import ee.C5069g;
import sb.C11264k;

/* JADX INFO: renamed from: td.m0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC11602m0 extends AbstractRunnableC5098u0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C11605n0 f40986b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC11602m0(C11605n0 c11605n0, C11264k c11264k) {
        super(c11264k);
        this.f40986b = c11605n0;
    }

    @Override // ee.AbstractRunnableC5098u0
    /* JADX INFO: renamed from: a */
    public final void mo23843a(Exception exc) {
        if (!(exc instanceof C5069g)) {
            super.mo23843a(exc);
        } else if (C11605n0.m43275j(this.f40986b)) {
            super.mo23843a(new C11568b(-2, exc));
        } else {
            super.mo23843a(new C11568b(-9, exc));
        }
    }
}
