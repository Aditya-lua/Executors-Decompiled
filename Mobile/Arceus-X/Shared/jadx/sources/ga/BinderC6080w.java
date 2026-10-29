package ga;

import com.google.android.gms.common.data.DataHolder;
import p073da.C4498b;
import p073da.C4502f;
import p099ea.C4892a;
import sb.C11264k;

/* JADX INFO: renamed from: ga.w */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC6080w extends BinderC6058a {

    /* JADX INFO: renamed from: a */
    public final C11264k f23380a;

    public BinderC6080w(C11264k c11264k) {
        this.f23380a = c11264k;
    }

    @Override // ga.BinderC6058a, ga.InterfaceC6062e
    /* JADX INFO: renamed from: z0 */
    public final void mo26898z0(DataHolder dataHolder) {
        int iM9198y3 = dataHolder.m9198y3();
        if (iM9198y3 == 0 || iM9198y3 == 3) {
            this.f23380a.m42328c(new C4498b(new C4892a(dataHolder), iM9198y3 == 3));
        } else {
            C4502f.m22464b(this.f23380a, iM9198y3);
            dataHolder.close();
        }
    }
}
