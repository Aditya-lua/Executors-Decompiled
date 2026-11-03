package n9;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class l0 extends v0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f26107d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bundle f26108e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c f26109f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(c cVar, int i10, Bundle bundle) {
        super(cVar, Boolean.TRUE);
        Objects.requireNonNull(cVar);
        this.f26109f = cVar;
        this.f26107d = i10;
        this.f26108e = bundle;
    }

    @Override // n9.v0
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        int i10 = this.f26107d;
        if (i10 != 0) {
            this.f26109f.zzd(1, null);
            Bundle bundle = this.f26108e;
            f(new ConnectionResult(i10, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null));
        } else {
            if (e()) {
                return;
            }
            this.f26109f.zzd(1, null);
            f(new ConnectionResult(8, null));
        }
    }

    public abstract boolean e();

    public abstract void f(ConnectionResult connectionResult);
}
