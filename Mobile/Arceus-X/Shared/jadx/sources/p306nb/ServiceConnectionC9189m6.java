package p306nb;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.measurement.AbstractBinderC2292s0;
import com.google.android.gms.internal.measurement.InterfaceC2310t0;
import java.util.Objects;

/* JADX INFO: renamed from: nb.m6 */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC9189m6 implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    public final String f33203a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C9205n6 f33204b;

    public ServiceConnectionC9189m6(C9205n6 c9205n6, String str) {
        Objects.requireNonNull(c9205n6);
        this.f33204b = c9205n6;
        this.f33203a = str;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String m36478a() {
        return this.f33203a;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.f33204b.f33261a.mo36321a().m37006r().m36911a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            InterfaceC2310t0 interfaceC2310t0M10672s2 = AbstractBinderC2292s0.m10672s2(iBinder);
            if (interfaceC2310t0M10672s2 == null) {
                this.f33204b.f33261a.mo36321a().m37006r().m36911a("Install Referrer Service implementation was not found");
                return;
            }
            C9094g7 c9094g7 = this.f33204b.f33261a;
            c9094g7.mo36321a().m37011w().m36911a("Install Referrer Service connected");
            c9094g7.mo36322b().m36263t(new RunnableC9173l6(this, interfaceC2310t0M10672s2, this));
        } catch (RuntimeException e10) {
            this.f33204b.f33261a.mo36321a().m37006r().m36912b("Exception occurred while calling Install Referrer API", e10);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f33204b.f33261a.mo36321a().m37011w().m36911a("Install Referrer Service disconnected");
    }
}
