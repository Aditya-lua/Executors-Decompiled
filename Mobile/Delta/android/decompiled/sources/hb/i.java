package hb;

import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

/* JADX INFO: loaded from: classes.dex */
public final class i extends lb.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l9.k<lb.d> f19239a;

    @Override // lb.o
    public final void N(LocationAvailability locationAvailability) {
        this.f19239a.c(new h(this, locationAvailability));
    }

    @Override // lb.o
    public final void P0(LocationResult locationResult) {
        this.f19239a.c(new g(this, locationResult));
    }
}
