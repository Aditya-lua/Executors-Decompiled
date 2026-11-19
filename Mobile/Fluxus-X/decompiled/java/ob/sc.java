package ob;

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
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class sc implements ServiceConnection, o9.d.a, o9.d.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile boolean f27801a;
    public volatile v5 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yc f27802c;

    public sc(yc ycVar) {
        Objects.requireNonNull(ycVar);
        this.f27802c = ycVar;
    }

    public final void a(Intent intent) {
        yc ycVar = this.f27802c;
        ycVar.h();
        Context contextD = ycVar.f27641a.d();
        u9.a aVarB = u9.a.b();
        synchronized (this) {
            try {
                if (this.f27801a) {
                    this.f27802c.f27641a.a().w().a("Connection attempt already in progress");
                    return;
                }
                yc ycVar2 = this.f27802c;
                ycVar2.f27641a.a().w().a("Using local app measurement service");
                this.f27801a = true;
                aVarB.a(contextD, intent, ycVar2.M(), 129);
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
        yc ycVar = this.f27802c;
        ycVar.h();
        Context contextD = ycVar.f27641a.d();
        synchronized (this) {
            try {
                if (this.f27801a) {
                    this.f27802c.f27641a.a().w().a("Connection attempt already in progress");
                    return;
                }
                if (this.b != null && (this.b.isConnecting() || this.b.isConnected())) {
                    this.f27802c.f27641a.a().w().a("Already awaiting connection attempt");
                    return;
                }
                this.b = new v5(contextD, Looper.getMainLooper(), this, this);
                this.f27802c.f27641a.a().w().a("Connecting to remote service");
                this.f27801a = true;
                o9.s.l(this.b);
                this.b.checkAvailabilityAndConnect();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final /* synthetic */ void d(boolean z10) {
        this.f27801a = false;
    }

    @Override // o9.d.a
    public final void onConnected(Bundle bundle) {
        this.f27802c.f27641a.b().o();
        synchronized (this) {
            try {
                o9.s.l(this.b);
                this.f27802c.f27641a.b().t(new nc(this, (i5) this.b.getService()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.b = null;
                this.f27801a = false;
            }
        }
    }

    @Override // o9.d.b
    public final void onConnectionFailed(@NonNull k9.b bVar) {
        yc ycVar = this.f27802c;
        ycVar.f27641a.b().o();
        b6 b6VarY = ycVar.f27641a.y();
        if (b6VarY != null) {
            b6VarY.w().b("Service connection failed", bVar);
        }
        synchronized (this) {
            this.f27801a = false;
            this.b = null;
        }
        this.f27802c.f27641a.b().t(new rc(this, bVar));
    }

    @Override // o9.d.a
    public final void onConnectionSuspended(int i10) {
        l7 l7Var = this.f27802c.f27641a;
        l7Var.b().o();
        l7Var.a().v().a("Service connection suspended");
        l7Var.b().t(new oc(this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f27802c.f27641a.b().o();
        synchronized (this) {
            if (iBinder == null) {
                this.f27801a = false;
                this.f27802c.f27641a.a().o().a("Service connected with null binder");
                return;
            }
            i5 f5Var = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    f5Var = iInterfaceQueryLocalInterface instanceof i5 ? (i5) iInterfaceQueryLocalInterface : new f5(iBinder);
                    this.f27802c.f27641a.a().w().a("Bound to IMeasurementService interface");
                } else {
                    this.f27802c.f27641a.a().o().b("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.f27802c.f27641a.a().o().a("Service connect failed to get IMeasurementService");
            }
            if (f5Var == null) {
                this.f27801a = false;
                try {
                    u9.a aVarB = u9.a.b();
                    yc ycVar = this.f27802c;
                    aVarB.c(ycVar.f27641a.d(), ycVar.M());
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.f27802c.f27641a.b().t(new kc(this, f5Var));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        l7 l7Var = this.f27802c.f27641a;
        l7Var.b().o();
        l7Var.a().v().a("Service disconnected");
        l7Var.b().t(new lc(this, componentName));
    }
}
