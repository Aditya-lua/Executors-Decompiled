package n9;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class l0 extends v0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f25286d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bundle f25287e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c f25288f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(c cVar, int i10, Bundle bundle) {
        super(cVar, Boolean.TRUE);
        Objects.requireNonNull(cVar);
        this.f25288f = cVar;
        this.f25286d = i10;
        this.f25287e = bundle;
    }

    @Override // n9.v0
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        int i10 = this.f25286d;
        if (i10 != 0) {
            this.f25288f.zzd(1, null);
            Bundle bundle = this.f25287e;
            f(new ConnectionResult(i10, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null));
        } else {
            if (e()) {
                return;
            }
            this.f25288f.zzd(1, null);
            f(new ConnectionResult(8, null));
        }
    }

    public abstract boolean e();

    public abstract void f(ConnectionResult connectionResult);
}
