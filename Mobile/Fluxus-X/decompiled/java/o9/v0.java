package o9;

import android.app.PendingIntent;
import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class v0 extends f1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f27053d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bundle f27054e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d f27055f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(d dVar, int i10, Bundle bundle) {
        super(dVar, Boolean.TRUE);
        Objects.requireNonNull(dVar);
        this.f27055f = dVar;
        this.f27053d = i10;
        this.f27054e = bundle;
    }

    @Override // o9.f1
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        int i10 = this.f27053d;
        if (i10 != 0) {
            this.f27055f.zzd(1, null);
            Bundle bundle = this.f27054e;
            f(new k9.b(i10, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null));
        } else {
            if (e()) {
                return;
            }
            this.f27055f.zzd(1, null);
            f(new k9.b(8, null));
        }
    }

    public abstract boolean e();

    public abstract void f(k9.b bVar);
}
