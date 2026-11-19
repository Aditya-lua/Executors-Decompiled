package ob;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class r6 implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27762a;
    public final /* synthetic */ s6 b;

    public r6(s6 s6Var, String str) {
        Objects.requireNonNull(s6Var);
        this.b = s6Var;
        this.f27762a = str;
    }

    public final /* synthetic */ String a() {
        return this.f27762a;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.b.f27787a.a().r().a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            com.google.android.gms.internal.measurement.t0 t0VarS2 = com.google.android.gms.internal.measurement.s0.s2(iBinder);
            if (t0VarS2 == null) {
                this.b.f27787a.a().r().a("Install Referrer Service implementation was not found");
                return;
            }
            l7 l7Var = this.b.f27787a;
            l7Var.a().w().a("Install Referrer Service connected");
            l7Var.b().t(new q6(this, t0VarS2, this));
        } catch (RuntimeException e10) {
            this.b.f27787a.a().r().b("Exception occurred while calling Install Referrer API", e10);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.b.f27787a.a().w().a("Install Referrer Service disconnected");
    }
}
