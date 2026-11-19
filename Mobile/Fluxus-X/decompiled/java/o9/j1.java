package o9;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class j1 extends v0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d f26991g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(d dVar, int i10, Bundle bundle) {
        super(dVar, i10, bundle);
        Objects.requireNonNull(dVar);
        this.f26991g = dVar;
    }

    @Override // o9.v0
    public final boolean e() {
        this.f26991g.zzc.c(k9.b.f21215k);
        return true;
    }

    @Override // o9.v0
    public final void f(k9.b bVar) {
        d dVar = this.f26991g;
        if (dVar.enableLocalFallback() && dVar.zzg()) {
            dVar.zzf(16);
        } else {
            dVar.zzc.c(bVar);
            dVar.onConnectionFailed(bVar);
        }
    }
}
