package o9;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class j0 implements d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m9.e f26990a;

    public j0(m9.e eVar) {
        this.f26990a = eVar;
    }

    @Override // o9.d.a
    public final void onConnected(Bundle bundle) {
        this.f26990a.onConnected(bundle);
    }

    @Override // o9.d.a
    public final void onConnectionSuspended(int i10) {
        this.f26990a.onConnectionSuspended(i10);
    }
}
