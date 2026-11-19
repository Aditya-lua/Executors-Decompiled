package ib;

import android.location.Location;

/* JADX INFO: loaded from: classes.dex */
public final class l extends mb.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m9.k<mb.e> f19315a;

    @Override // mb.r
    public final synchronized void t(Location location) {
        this.f19315a.c(new k(this, location));
    }
}
