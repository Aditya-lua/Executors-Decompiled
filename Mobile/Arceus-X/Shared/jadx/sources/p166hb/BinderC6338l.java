package p166hb;

import android.location.Location;
import lb.AbstractBinderC8114q;
import lb.InterfaceC8102e;
import p268l9.C8048k;

/* JADX INFO: renamed from: hb.l */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC6338l extends AbstractBinderC8114q {

    /* JADX INFO: renamed from: a */
    public final C8048k<InterfaceC8102e> f24076a;

    @Override // lb.InterfaceC8115r
    /* JADX INFO: renamed from: s */
    public final synchronized void mo27645s(Location location) {
        this.f24076a.m33230c(new C6337k(this, location));
    }
}
