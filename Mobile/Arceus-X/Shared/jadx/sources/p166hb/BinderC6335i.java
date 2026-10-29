package p166hb;

import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import lb.AbstractBinderC8111n;
import lb.AbstractC8101d;
import p268l9.C8048k;

/* JADX INFO: renamed from: hb.i */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC6335i extends AbstractBinderC8111n {

    /* JADX INFO: renamed from: a */
    public final C8048k<AbstractC8101d> f24074a;

    @Override // lb.InterfaceC8112o
    /* JADX INFO: renamed from: N */
    public final void mo27643N(LocationAvailability locationAvailability) {
        this.f24074a.m33230c(new C6334h(this, locationAvailability));
    }

    @Override // lb.InterfaceC8112o
    /* JADX INFO: renamed from: P0 */
    public final void mo27644P0(LocationResult locationResult) {
        this.f24074a.m33230c(new C6333g(this, locationResult));
    }
}
