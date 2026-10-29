package n9;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class b0 implements c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l9.e f25233a;

    public b0(l9.e eVar) {
        this.f25233a = eVar;
    }

    @Override // n9.c.a
    public final void onConnected(Bundle bundle) {
        this.f25233a.onConnected(bundle);
    }

    @Override // n9.c.a
    public final void onConnectionSuspended(int i10) {
        this.f25233a.onConnectionSuspended(i10);
    }
}
