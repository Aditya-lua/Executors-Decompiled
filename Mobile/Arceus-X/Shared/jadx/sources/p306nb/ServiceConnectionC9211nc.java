package p306nb;

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
import p305n9.AbstractC8923c;
import p305n9.C8953m;
import p445t9.C11555a;

/* JADX INFO: renamed from: nb.nc */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC9211nc implements ServiceConnection, AbstractC8923c.a, AbstractC8923c.b {

    /* JADX INFO: renamed from: a */
    public volatile boolean f33279a;

    /* JADX INFO: renamed from: b */
    public volatile C9252q5 f33280b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C9307tc f33281c;

    public ServiceConnectionC9211nc(C9307tc c9307tc) {
        Objects.requireNonNull(c9307tc);
        this.f33281c = c9307tc;
    }

    /* JADX INFO: renamed from: a */
    public final void m36594a(Intent intent) {
        C9307tc c9307tc = this.f33281c;
        c9307tc.mo36088h();
        Context contextMo36324d = c9307tc.f33067a.mo36324d();
        C11555a c11555aM43201b = C11555a.m43201b();
        synchronized (this) {
            try {
                if (this.f33279a) {
                    this.f33281c.f33067a.mo36321a().m37011w().m36911a("Connection attempt already in progress");
                    return;
                }
                C9307tc c9307tc2 = this.f33281c;
                c9307tc2.f33067a.mo36321a().m37011w().m36911a("Using local app measurement service");
                this.f33279a = true;
                c11555aM43201b.m43205a(contextMo36324d, intent, c9307tc2.m36872M(), 129);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m36595b() {
        if (this.f33280b != null && (this.f33280b.isConnected() || this.f33280b.isConnecting())) {
            this.f33280b.disconnect();
        }
        this.f33280b = null;
    }

    /* JADX INFO: renamed from: c */
    public final void m36596c() {
        C9307tc c9307tc = this.f33281c;
        c9307tc.mo36088h();
        Context contextMo36324d = c9307tc.f33067a.mo36324d();
        synchronized (this) {
            try {
                if (this.f33279a) {
                    this.f33281c.f33067a.mo36321a().m37011w().m36911a("Connection attempt already in progress");
                    return;
                }
                if (this.f33280b != null && (this.f33280b.isConnecting() || this.f33280b.isConnected())) {
                    this.f33281c.f33067a.mo36321a().m37011w().m36911a("Already awaiting connection attempt");
                    return;
                }
                this.f33280b = new C9252q5(contextMo36324d, Looper.getMainLooper(), this, this);
                this.f33281c.f33067a.mo36321a().m37011w().m36911a("Connecting to remote service");
                this.f33279a = true;
                C8953m.m36047l(this.f33280b);
                this.f33280b.checkAvailabilityAndConnect();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m36597d(boolean z10) {
        this.f33279a = false;
    }

    @Override // p305n9.AbstractC8923c.a
    public final void onConnected(Bundle bundle) {
        this.f33281c.f33067a.mo36322b().m36258o();
        synchronized (this) {
            try {
                C8953m.m36047l(this.f33280b);
                this.f33281c.f33067a.mo36322b().m36263t(new RunnableC9131ic(this, (InterfaceC9042d5) this.f33280b.getService()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f33280b = null;
                this.f33279a = false;
            }
        }
    }

    @Override // p305n9.AbstractC8923c.b
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        C9307tc c9307tc = this.f33281c;
        c9307tc.f33067a.mo36322b().m36258o();
        C9348w5 c9348w5M36340y = c9307tc.f33067a.m36340y();
        if (c9348w5M36340y != null) {
            c9348w5M36340y.m37011w().m36912b("Service connection failed", connectionResult);
        }
        synchronized (this) {
            this.f33279a = false;
            this.f33280b = null;
        }
        this.f33281c.f33067a.mo36322b().m36263t(new RunnableC9195mc(this, connectionResult));
    }

    @Override // p305n9.AbstractC8923c.a
    public final void onConnectionSuspended(int i10) {
        C9094g7 c9094g7 = this.f33281c.f33067a;
        c9094g7.mo36322b().m36258o();
        c9094g7.mo36321a().m37010v().m36911a("Service connection suspended");
        c9094g7.mo36322b().m36263t(new RunnableC9147jc(this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f33281c.f33067a.mo36322b().m36258o();
        synchronized (this) {
            if (iBinder == null) {
                this.f33279a = false;
                this.f33281c.f33067a.mo36321a().m37003o().m36911a("Service connected with null binder");
                return;
            }
            InterfaceC9042d5 c8991a5 = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    c8991a5 = iInterfaceQueryLocalInterface instanceof InterfaceC9042d5 ? (InterfaceC9042d5) iInterfaceQueryLocalInterface : new C8991a5(iBinder);
                    this.f33281c.f33067a.mo36321a().m37011w().m36911a("Bound to IMeasurementService interface");
                } else {
                    this.f33281c.f33067a.mo36321a().m37003o().m36912b("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.f33281c.f33067a.mo36321a().m37003o().m36911a("Service connect failed to get IMeasurementService");
            }
            if (c8991a5 == null) {
                this.f33279a = false;
                try {
                    C11555a c11555aM43201b = C11555a.m43201b();
                    C9307tc c9307tc = this.f33281c;
                    c11555aM43201b.m43206c(c9307tc.f33067a.mo36324d(), c9307tc.m36872M());
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.f33281c.f33067a.mo36322b().m36263t(new RunnableC9083fc(this, c8991a5));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C9094g7 c9094g7 = this.f33281c.f33067a;
        c9094g7.mo36322b().m36258o();
        c9094g7.mo36321a().m37010v().m36911a("Service disconnected");
        c9094g7.mo36322b().m36263t(new RunnableC9099gc(this, componentName));
    }
}
