package td;

import android.content.Context;
import ee.AbstractRunnableC5098u0;
import ee.C5075j;
import sb.C11264k;

/* JADX INFO: renamed from: td.f0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C11581f0 extends AbstractRunnableC5098u0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f40944b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C11605n0 f40945c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11581f0(C11605n0 c11605n0, C11264k c11264k, Context context) {
        super(c11264k);
        this.f40944b = context;
        this.f40945c = c11605n0;
    }

    @Override // ee.AbstractRunnableC5098u0
    /* JADX INFO: renamed from: b */
    public final void mo23771b() {
        this.f40945c.f40990c.m42330e(Integer.valueOf(C5075j.m23808a(this.f40944b)));
    }
}
