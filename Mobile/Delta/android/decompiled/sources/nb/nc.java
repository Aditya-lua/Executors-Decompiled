package nb;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class nc implements ServiceConnection, n9.c.a, n9.c.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile boolean f25800a;
    public volatile q5 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ tc f25801c;

    public nc(tc tcVar) {
        Objects.requireNonNull(tcVar);
        this.f25801c = tcVar;
    }

    public final void a(Intent intent) {
        tc tcVar = this.f25801c;
        tcVar.h();
        Context contextD = tcVar.f25625a.d();
        t9.a aVarB = t9.a.b();
        synchronized (this) {
            try {
                if (this.f25800a) {
                    this.f25801c.f25625a.a().w().a("Connection attempt already in progress");
                    return;
                }
                tc tcVar2 = this.f25801c;
                tcVar2.f25625a.a().w().a("Using local app measurement service");
                this.f25800a = true;
                aVarB.a(contextD, intent, tcVar2.M(), 129);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b() {
        if (this.b != null && (this.b.isConnected() || this.b.isConnecting())) {
            this.b.disconnect();
        }
        this.b = null;
    }

    public final void c() {
        tc tcVar = this.f25801c;
        tcVar.h();
        Context contextD = tcVar.f25625a.d();
        synchronized (this) {
            try {
                if (this.f25800a) {
                    this.f25801c.f25625a.a().w().a("Connection attempt already in progress");
                    return;
                }
                if (this.b != null && (this.b.isConnecting() || this.b.isConnected())) {
                    this.f25801c.f25625a.a().w().a("Already awaiting connection attempt");
                    return;
                }
                this.b = new q5(contextD, Looper.getMainLooper(), this, this);
                this.f25801c.f25625a.a().w().a("Connecting to remote service");
                this.f25800a = true;
                n9.m.l(this.b);
                this.b.checkAvailabilityAndConnect();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final /* synthetic */ void d(boolean z10) {
        this.f25800a = false;
    }

    @Override // n9.c.a
    public final void onConnected(Bundle bundle) {
        this.f25801c.f25625a.b().o();
        synchronized (this) {
            try {
                n9.m.l(this.b);
                this.f25801c.f25625a.b().t(new ic(this, (d5) this.b.getService()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.b = null;
                this.f25800a = false;
            }
        }
    }

    @Override // n9.c.b
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        tc tcVar = this.f25801c;
        tcVar.f25625a.b().o();
        w5 w5VarY = tcVar.f25625a.y();
        if (w5VarY != null) {
            w5VarY.w().b("Service connection failed", connectionResult);
        }
        synchronized (this) {
            this.f25800a = false;
            this.b = null;
        }
        this.f25801c.f25625a.b().t(new mc(this, connectionResult));
    }

    @Override // n9.c.a
    public final void onConnectionSuspended(int i10) {
        g7 g7Var = this.f25801c.f25625a;
        g7Var.b().o();
        g7Var.a().v().a("Service connection suspended");
        g7Var.b().t(new jc(this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f25801c.f25625a.b().o();
        synchronized (this) {
            if (iBinder == null) {
                this.f25800a = false;
                this.f25801c.f25625a.a().o().a("Service connected with null binder");
                return;
            }
            d5 a5Var = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    a5Var = iInterfaceQueryLocalInterface instanceof d5 ? (d5) iInterfaceQueryLocalInterface : new a5(iBinder);
                    this.f25801c.f25625a.a().w().a("Bound to IMeasurementService interface");
                } else {
                    this.f25801c.f25625a.a().o().b("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.f25801c.f25625a.a().o().a("Service connect failed to get IMeasurementService");
            }
            if (a5Var == null) {
                this.f25800a = false;
                try {
                    t9.a aVarB = t9.a.b();
                    tc tcVar = this.f25801c;
                    aVarB.c(tcVar.f25625a.d(), tcVar.M());
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.f25801c.f25625a.b().t(new fc(this, a5Var));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        g7 g7Var = this.f25801c.f25625a;
        g7Var.b().o();
        g7Var.a().v().a("Service disconnected");
        g7Var.b().t(new gc(this, componentName));
    }
}
