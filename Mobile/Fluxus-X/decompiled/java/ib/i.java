package ib;

import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

/* JADX INFO: loaded from: classes.dex */
public final class i extends mb.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m9.k<mb.d> f19313a;

    @Override // mb.o
    public final void N(LocationAvailability locationAvailability) {
        this.f19313a.c(new h(this, locationAvailability));
    }

    @Override // mb.o
    public final void W0(LocationResult locationResult) {
        this.f19313a.c(new g(this, locationResult));
    }
}
