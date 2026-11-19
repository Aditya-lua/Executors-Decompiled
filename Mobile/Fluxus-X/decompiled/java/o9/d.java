package o9;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class d<T extends IInterface> {
    private volatile String zzA;
    private k9.b zzC;
    private boolean zzD;
    private volatile l1 zzE;
    u1 zza;
    final Handler zzb;

    @NonNull
    protected c zzc;

    @NonNull
    protected AtomicInteger zzd;
    private int zzf;
    private long zzg;
    private long zzh;
    private int zzi;
    private long zzj;
    private volatile String zzk;
    private final Context zzl;
    private final Looper zzm;
    private final j zzn;
    private final k9.f zzo;
    private final Object zzp;
    private final Object zzq;
    private n zzr;
    private IInterface zzs;
    private final ArrayList zzt;
    private h1 zzu;
    private int zzv;
    private final a zzw;
    private final b zzx;
    private final int zzy;
    private final String zzz;
    private static final k9.d[] zze = new k9.d[0];

    @NonNull
    public static final String[] GOOGLE_PLUS_REQUIRED_FEATURES = {"service_esmobile", "service_googleme"};

    public interface a {
        void onConnected(Bundle bundle);

        void onConnectionSuspended(int i10);
    }

    public interface b {
        void onConnectionFailed(@NonNull k9.b bVar);
    }

    public interface c {
        void c(@NonNull k9.b bVar);
    }

    /* JADX INFO: renamed from: o9.d$d, reason: collision with other inner class name */
    public class C0542d implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f26933a;

        public C0542d(d dVar) {
            Objects.requireNonNull(dVar);
            this.f26933a = dVar;
        }

        @Override // o9.d.c
        public final void c(@NonNull k9.b bVar) {
            if (bVar.F3()) {
                d dVar = this.f26933a;
                dVar.getRemoteService(null, dVar.getScopes());
            } else {
                d dVar2 = this.f26933a;
                if (dVar2.zzl() != null) {
                    dVar2.zzl().onConnectionFailed(bVar);
                }
            }
        }
    }

    public interface e {
        void a();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public d(@NonNull Context context, @NonNull Looper looper, int i10, a aVar, b bVar, String str) {
        j jVarA = j.a(context);
        k9.f fVarF = k9.f.f();
        s.l(aVar);
        s.l(bVar);
        this(context, looper, jVarA, fVarF, i10, aVar, bVar, str);
    }

    private final void zzp(int i10, IInterface iInterface) {
        u1 u1Var;
        s.a((i10 == 4) == (iInterface != null));
        synchronized (this.zzp) {
            try {
                this.zzv = i10;
                this.zzs = iInterface;
                Bundle bundle = null;
                if (i10 == 1) {
                    h1 h1Var = this.zzu;
                    if (h1Var != null) {
                        j jVar = this.zzn;
                        String strA = this.zza.a();
                        s.l(strA);
                        jVar.d(strA, this.zza.b(), 4225, h1Var, zza(), this.zza.c());
                        this.zzu = null;
                    }
                } else if (i10 == 2 || i10 == 3) {
                    h1 h1Var2 = this.zzu;
                    if (h1Var2 != null && (u1Var = this.zza) != null) {
                        String strA2 = u1Var.a();
                        String strB = u1Var.b();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(strA2).length() + 70 + String.valueOf(strB).length());
                        sb2.append("Calling connect() while still connected, missing disconnect() for ");
                        sb2.append(strA2);
                        sb2.append(" on ");
                        sb2.append(strB);
                        Log.e("GmsClient", sb2.toString());
                        j jVar2 = this.zzn;
                        String strA3 = this.zza.a();
                        s.l(strA3);
                        jVar2.d(strA3, this.zza.b(), 4225, h1Var2, zza(), this.zza.c());
                        this.zzd.incrementAndGet();
                    }
                    h1 h1Var3 = new h1(this, this.zzd.get());
                    this.zzu = h1Var3;
                    u1 u1Var2 = (this.zzv != 3 || getLocalStartServiceAction() == null) ? new u1(getStartServicePackage(), getStartServiceAction(), false, 4225, getUseDynamicLookup()) : new u1(getContext().getPackageName(), getLocalStartServiceAction(), true, 4225, false);
                    this.zza = u1Var2;
                    if (u1Var2.c() && getMinApkVersion() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.zza.a())));
                    }
                    j jVar3 = this.zzn;
                    String strA4 = this.zza.a();
                    s.l(strA4);
                    k9.b bVarC = jVar3.c(new p1(strA4, this.zza.b(), 4225, this.zza.c()), h1Var3, zza(), getBindServiceExecutor());
                    if (!bVarC.F3()) {
                        String strA5 = this.zza.a();
                        String strB2 = this.zza.b();
                        StringBuilder sb3 = new StringBuilder(String.valueOf(strA5).length() + 34 + String.valueOf(strB2).length());
                        sb3.append("unable to connect to service: ");
                        sb3.append(strA5);
                        sb3.append(" on ");
                        sb3.append(strB2);
                        Log.w("GmsClient", sb3.toString());
                        int iB3 = bVarC.B3() == -1 ? 16 : bVarC.B3();
                        if (bVarC.D3() != null) {
                            bundle = new Bundle();
                            bundle.putParcelable("pendingIntent", bVarC.D3());
                        }
                        zzb(iB3, bundle, this.zzd.get());
                    }
                } else if (i10 == 4) {
                    s.l(iInterface);
                    onConnectedLocked(iInterface);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void checkAvailabilityAndConnect() {
        int iH = this.zzo.h(this.zzl, getMinApkVersion());
        if (iH == 0) {
            connect(new C0542d(this));
        } else {
            zzp(1, null);
            triggerNotAvailable(new C0542d(this), iH, null);
        }
    }

    public final void checkConnected() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public void connect(@NonNull c cVar) {
        s.m(cVar, "Connection progress callbacks cannot be null.");
        this.zzc = cVar;
        zzp(2, null);
    }

    public abstract T createServiceInterface(@NonNull IBinder iBinder);

    public void disconnect() {
        this.zzd.incrementAndGet();
        ArrayList arrayList = this.zzt;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((f1) arrayList.get(i10)).d();
                }
                arrayList.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (this.zzq) {
            this.zzr = null;
        }
        zzp(1, null);
    }

    public boolean enableLocalFallback() {
        return false;
    }

    public Account getAccount() {
        return null;
    }

    @NonNull
    public k9.d[] getApiFeatures() {
        return zze;
    }

    public final k9.d[] getAvailableFeatures() {
        l1 l1Var = this.zzE;
        if (l1Var == null) {
            return null;
        }
        return l1Var.f26996g;
    }

    public Executor getBindServiceExecutor() {
        return null;
    }

    public Bundle getConnectionHint() {
        return null;
    }

    @NonNull
    public final Context getContext() {
        return this.zzl;
    }

    @NonNull
    public String getEndpointPackageName() {
        u1 u1Var;
        if (!isConnected() || (u1Var = this.zza) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return u1Var.b();
    }

    public int getGCoreServiceId() {
        return this.zzy;
    }

    @NonNull
    public Bundle getGetServiceRequestExtraArgs() {
        return new Bundle();
    }

    public String getLastDisconnectMessage() {
        return this.zzk;
    }

    public String getLocalStartServiceAction() {
        return null;
    }

    public int getMinApkVersion() {
        return k9.f.f21244a;
    }

    public void getRemoteService(l lVar, @NonNull Set<Scope> set) {
        Bundle getServiceRequestExtraArgs = getGetServiceRequestExtraArgs();
        String str = Build.VERSION.SDK_INT < 31 ? this.zzA : this.zzA;
        int i10 = this.zzy;
        int i11 = k9.f.f21244a;
        Scope[] scopeArr = h.f26963t;
        Bundle bundle = new Bundle();
        k9.d[] dVarArr = h.f26964u;
        h hVar = new h(6, i10, i11, null, null, scopeArr, bundle, null, dVarArr, dVarArr, true, 0, false, str);
        hVar.f26968i = this.zzl.getPackageName();
        hVar.f26971l = getServiceRequestExtraArgs;
        if (set != null) {
            hVar.f26970k = (Scope[]) set.toArray(new Scope[0]);
        }
        if (requiresSignIn()) {
            Account account = getAccount();
            if (account == null) {
                account = new Account("<<default account>>", "com.google");
            }
            hVar.f26972m = account;
            if (lVar != null) {
                hVar.f26969j = lVar.asBinder();
            }
        } else if (requiresAccount()) {
            hVar.f26972m = getAccount();
        }
        hVar.f26973n = zze;
        hVar.f26974o = getApiFeatures();
        if (usesClientTelemetry()) {
            hVar.f26977r = true;
        }
        try {
            synchronized (this.zzq) {
                try {
                    n nVar = this.zzr;
                    if (nVar != null) {
                        nVar.h1(new g1(this, this.zzd.get()), hVar);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (DeadObjectException e10) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e10);
            triggerConnectionSuspended(3);
        } catch (RemoteException e11) {
            e = e11;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            onPostInitHandler(8, null, null, this.zzd.get());
        } catch (SecurityException e12) {
            throw e12;
        } catch (RuntimeException e13) {
            e = e13;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            onPostInitHandler(8, null, null, this.zzd.get());
        }
    }

    @NonNull
    public Set<Scope> getScopes() {
        return Collections.EMPTY_SET;
    }

    @NonNull
    public final T getService() {
        T t8;
        synchronized (this.zzp) {
            try {
                if (this.zzv == 5) {
                    throw new DeadObjectException();
                }
                checkConnected();
                IInterface iInterface = this.zzs;
                s.m(iInterface, "Client is connected but service is null");
                t8 = (T) iInterface;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t8;
    }

    @NonNull
    public abstract String getServiceDescriptor();

    @NonNull
    public abstract String getStartServiceAction();

    @NonNull
    public String getStartServicePackage() {
        return "com.google.android.gms";
    }

    public g getTelemetryConfiguration() {
        l1 l1Var = this.zzE;
        if (l1Var == null) {
            return null;
        }
        return l1Var.f26998i;
    }

    public boolean getUseDynamicLookup() {
        return getMinApkVersion() >= 211700000;
    }

    public boolean hasConnectionInfo() {
        return this.zzE != null;
    }

    public boolean isConnected() {
        boolean z10;
        synchronized (this.zzp) {
            z10 = this.zzv == 4;
        }
        return z10;
    }

    public boolean isConnecting() {
        boolean z10;
        synchronized (this.zzp) {
            int i10 = this.zzv;
            z10 = true;
            if (i10 != 2 && i10 != 3) {
                z10 = false;
            }
        }
        return z10;
    }

    public void onConnectedLocked(@NonNull T t8) {
        this.zzh = System.currentTimeMillis();
    }

    public void onConnectionFailed(@NonNull k9.b bVar) {
        this.zzi = bVar.B3();
        this.zzj = System.currentTimeMillis();
    }

    public void onConnectionSuspended(int i10) {
        this.zzf = i10;
        this.zzg = System.currentTimeMillis();
    }

    public void onPostInitHandler(int i10, IBinder iBinder, Bundle bundle, int i11) {
        i1 i1Var = new i1(this, i10, iBinder, bundle);
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(1, i11, -1, i1Var));
    }

    public void onUserSignOut(@NonNull e eVar) {
        eVar.a();
    }

    public boolean requiresAccount() {
        return false;
    }

    public boolean requiresGooglePlayServices() {
        return true;
    }

    public boolean requiresSignIn() {
        return false;
    }

    public void setAttributionTag(@NonNull String str) {
        this.zzA = str;
    }

    public void triggerConnectionSuspended(int i10) {
        int i11 = this.zzd.get();
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(6, i11, i10));
    }

    public void triggerNotAvailable(@NonNull c cVar, int i10, PendingIntent pendingIntent) {
        s.m(cVar, "Connection progress callbacks cannot be null.");
        this.zzc = cVar;
        int i11 = this.zzd.get();
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(3, i11, i10, pendingIntent));
    }

    public boolean usesClientTelemetry() {
        return false;
    }

    @NonNull
    public final String zza() {
        String str = this.zzz;
        return str == null ? this.zzl.getClass().getName() : str;
    }

    public final void zzb(int i10, Bundle bundle, int i11) {
        j1 j1Var = new j1(this, i10, bundle);
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(7, i11, -1, j1Var));
    }

    public final /* synthetic */ void zzc(l1 l1Var) {
        this.zzE = l1Var;
        if (usesClientTelemetry()) {
            g gVar = l1Var.f26998i;
            t.b().c(gVar == null ? null : gVar.F3());
        }
    }

    public final /* synthetic */ void zzd(int i10, IInterface iInterface) {
        zzp(i10, null);
    }

    public final /* synthetic */ boolean zze(int i10, int i11, IInterface iInterface) {
        synchronized (this.zzp) {
            try {
                if (this.zzv != i10) {
                    return false;
                }
                zzp(i11, iInterface);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final /* synthetic */ void zzf(int i10) {
        int i11;
        int i12;
        synchronized (this.zzp) {
            i11 = this.zzv;
        }
        if (i11 == 3) {
            this.zzD = true;
            i12 = 5;
        } else {
            i12 = 4;
        }
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(i12, this.zzd.get(), 16));
    }

    public final /* synthetic */ boolean zzg() {
        if (this.zzD || TextUtils.isEmpty(getServiceDescriptor()) || TextUtils.isEmpty(getLocalStartServiceAction())) {
            return false;
        }
        try {
            Class.forName(getServiceDescriptor());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final /* synthetic */ Object zzh() {
        return this.zzq;
    }

    public final /* synthetic */ void zzi(n nVar) {
        this.zzr = nVar;
    }

    public final /* synthetic */ ArrayList zzj() {
        return this.zzt;
    }

    public final /* synthetic */ a zzk() {
        return this.zzw;
    }

    public final /* synthetic */ b zzl() {
        return this.zzx;
    }

    public final /* synthetic */ k9.b zzm() {
        return this.zzC;
    }

    public final /* synthetic */ void zzn(k9.b bVar) {
        this.zzC = bVar;
    }

    public final /* synthetic */ boolean zzo() {
        return this.zzD;
    }

    public d(@NonNull Context context, @NonNull Looper looper, @NonNull j jVar, @NonNull k9.f fVar, int i10, a aVar, b bVar, String str) {
        this.zzk = null;
        this.zzp = new Object();
        this.zzq = new Object();
        this.zzt = new ArrayList();
        this.zzv = 1;
        this.zzC = null;
        this.zzD = false;
        this.zzE = null;
        this.zzd = new AtomicInteger(0);
        s.m(context, "Context must not be null");
        this.zzl = context;
        s.m(looper, "Looper must not be null");
        this.zzm = looper;
        s.m(jVar, "Supervisor must not be null");
        this.zzn = jVar;
        s.m(fVar, "API availability must not be null");
        this.zzo = fVar;
        this.zzb = new e1(this, looper);
        this.zzy = i10;
        this.zzw = aVar;
        this.zzx = bVar;
        this.zzz = str;
    }

    public void disconnect(@NonNull String str) {
        this.zzk = str;
        disconnect();
    }
}
