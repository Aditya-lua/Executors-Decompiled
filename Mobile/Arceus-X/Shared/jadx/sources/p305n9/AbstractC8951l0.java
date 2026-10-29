package p305n9;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.Objects;

/* JADX INFO: renamed from: n9.l0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8951l0 extends AbstractC8974v0 {

    /* JADX INFO: renamed from: d */
    public final int f32620d;

    /* JADX INFO: renamed from: e */
    public final Bundle f32621e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AbstractC8923c f32622f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC8951l0(AbstractC8923c abstractC8923c, int i10, Bundle bundle) {
        super(abstractC8923c, Boolean.TRUE);
        Objects.requireNonNull(abstractC8923c);
        this.f32622f = abstractC8923c;
        this.f32620d = i10;
        this.f32621e = bundle;
    }

    @Override // p305n9.AbstractC8974v0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo36032a(Object obj) {
        int i10 = this.f32620d;
        if (i10 != 0) {
            this.f32622f.zzd(1, null);
            Bundle bundle = this.f32621e;
            mo36034f(new ConnectionResult(i10, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null));
        } else {
            if (mo36033e()) {
                return;
            }
            this.f32622f.zzd(1, null);
            mo36034f(new ConnectionResult(8, null));
        }
    }

    /* JADX INFO: renamed from: e */
    public abstract boolean mo36033e();

    /* JADX INFO: renamed from: f */
    public abstract void mo36034f(ConnectionResult connectionResult);
}
