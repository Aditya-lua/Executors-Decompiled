package hb;

import android.location.Location;

/* JADX INFO: loaded from: classes.dex */
public final class k implements l9.k.b<lb.e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Location f18753a;

    public k(l lVar, Location location) {
        this.f18753a = location;
    }

    @Override // l9.k.b
    public final /* bridge */ /* synthetic */ void a(lb.e eVar) {
        eVar.onLocationChanged(this.f18753a);
    }

    @Override // l9.k.b
    public final void b() {
    }
}
