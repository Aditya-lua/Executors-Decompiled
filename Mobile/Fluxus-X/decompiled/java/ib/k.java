package ib;

import android.location.Location;

/* JADX INFO: loaded from: classes.dex */
public final class k implements m9.k.b<mb.e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Location f19314a;

    public k(l lVar, Location location) {
        this.f19314a = location;
    }

    @Override // m9.k.b
    public final /* bridge */ /* synthetic */ void a(mb.e eVar) {
        eVar.onLocationChanged(this.f19314a);
    }

    @Override // m9.k.b
    public final void b() {
    }
}
