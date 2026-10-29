package p305n9;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.Objects;

/* JADX INFO: renamed from: n9.z0 */
/* JADX INFO: loaded from: classes.dex */
public final class C8982z0 extends AbstractC8951l0 {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ AbstractC8923c f32656g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8982z0(AbstractC8923c abstractC8923c, int i10, Bundle bundle) {
        super(abstractC8923c, i10, bundle);
        Objects.requireNonNull(abstractC8923c);
        this.f32656g = abstractC8923c;
    }

    @Override // p305n9.AbstractC8951l0
    /* JADX INFO: renamed from: e */
    public final boolean mo36033e() {
        this.f32656g.zzc.mo33245a(ConnectionResult.f7373k);
        return true;
    }

    @Override // p305n9.AbstractC8951l0
    /* JADX INFO: renamed from: f */
    public final void mo36034f(ConnectionResult connectionResult) {
        AbstractC8923c abstractC8923c = this.f32656g;
        if (abstractC8923c.enableLocalFallback() && abstractC8923c.zzg()) {
            abstractC8923c.zzf(16);
        } else {
            abstractC8923c.zzc.mo33245a(connectionResult);
            abstractC8923c.onConnectionFailed(connectionResult);
        }
    }
}
