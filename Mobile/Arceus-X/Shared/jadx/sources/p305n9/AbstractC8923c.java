package p305n9;

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
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.common.internal.InterfaceC1903b;
import com.google.android.gms.common.internal.zzj;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p213j9.C7091d;

/* JADX INFO: renamed from: n9.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8923c<T extends IInterface> {
    private volatile String zzA;
    private ConnectionResult zzC;
    private boolean zzD;
    private volatile zzj zzE;
    C8946j1 zza;
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
    private final AbstractC8932f zzn;
    private final C7091d zzo;
    private final Object zzp;
    private final Object zzq;
    private InterfaceC8941i zzr;
    private IInterface zzs;
    private final ArrayList zzt;
    private ServiceConnectionC8978x0 zzu;
    private int zzv;
    private final a zzw;
    private final b zzx;
    private final int zzy;
    private final String zzz;
    private static final Feature[] zze = new Feature[0];

    @NonNull
    public static final String[] GOOGLE_PLUS_REQUIRED_FEATURES = {"service_esmobile", "service_googleme"};

    /* JADX INFO: renamed from: n9.c$a */
    public interface a {
        void onConnected(Bundle bundle);

        void onConnectionSuspended(int i10);
    }

    /* JADX INFO: renamed from: n9.c$b */
    public interface b {
        void onConnectionFailed(@NonNull ConnectionResult connectionResult);
    }

    /* JADX INFO: renamed from: n9.c$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo33245a(@NonNull ConnectionResult connectionResult);
    }

    /* JADX INFO: renamed from: n9.c$d */
    public class d implements c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC8923c f32556a;

        public d(AbstractC8923c abstractC8923c) {
            Objects.requireNonNull(abstractC8923c);
            this.f32556a = abstractC8923c;
        }

        @Override // p305n9.AbstractC8923c.c
        /* JADX INFO: renamed from: a */
        public final void mo33245a(@NonNull ConnectionResult connectionResult) {
            if (connectionResult.m9138A3()) {
                AbstractC8923c abstractC8923c = this.f32556a;
                abstractC8923c.getRemoteService(null, abstractC8923c.getScopes());
            } else {
                AbstractC8923c abstractC8923c2 = this.f32556a;
                if (abstractC8923c2.zzl() != null) {
                    abstractC8923c2.zzl().onConnectionFailed(connectionResult);
                }
            }
        }
    }

    /* JADX INFO: renamed from: n9.c$e */
    public interface e {
        /* JADX INFO: renamed from: a */
        void mo33183a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC8923c(@NonNull Context context, @NonNull Looper looper, int i10, a aVar, b bVar, String str) {
        AbstractC8932f abstractC8932fM35986a = AbstractC8932f.m35986a(context);
        C7091d c7091dM29876f = C7091d.m29876f();
        C8953m.m36047l(aVar);
        C8953m.m36047l(bVar);
        this(context, looper, abstractC8932fM35986a, c7091dM29876f, i10, aVar, bVar, str);
    }

    private final void zzp(int i10, IInterface iInterface) {
        C8946j1 c8946j1;
        C8953m.m36036a((i10 == 4) == (iInterface != null));
        synchronized (this.zzp) {
            try {
                this.zzv = i10;
                this.zzs = iInterface;
                Bundle bundle = null;
                if (i10 == 1) {
                    ServiceConnectionC8978x0 serviceConnectionC8978x0 = this.zzu;
                    if (serviceConnectionC8978x0 != null) {
                        AbstractC8932f abstractC8932f = this.zzn;
                        String strM36022a = this.zza.m36022a();
                        C8953m.m36047l(strM36022a);
                        abstractC8932f.m35989d(strM36022a, this.zza.m36023b(), 4225, serviceConnectionC8978x0, zza(), this.zza.m36024c());
                        this.zzu = null;
                    }
                } else if (i10 == 2 || i10 == 3) {
                    ServiceConnectionC8978x0 serviceConnectionC8978x1 = this.zzu;
                    if (serviceConnectionC8978x1 != null && (c8946j1 = this.zza) != null) {
                        String strM36022a2 = c8946j1.m36022a();
                        String strM36023b = c8946j1.m36023b();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(strM36022a2).length() + 70 + String.valueOf(strM36023b).length());
                        sb2.append("Calling connect() while still connected, missing disconnect() for ");
                        sb2.append(strM36022a2);
                        sb2.append(" on ");
                        sb2.append(strM36023b);
                        Log.e("GmsClient", sb2.toString());
                        AbstractC8932f abstractC8932f2 = this.zzn;
                        String strM36022a3 = this.zza.m36022a();
                        C8953m.m36047l(strM36022a3);
                        abstractC8932f2.m35989d(strM36022a3, this.zza.m36023b(), 4225, serviceConnectionC8978x1, zza(), this.zza.m36024c());
                        this.zzd.incrementAndGet();
                    }
                    ServiceConnectionC8978x0 serviceConnectionC8978x2 = new ServiceConnectionC8978x0(this, this.zzd.get());
                    this.zzu = serviceConnectionC8978x2;
                    C8946j1 c8946j2 = (this.zzv != 3 || getLocalStartServiceAction() == null) ? new C8946j1(getStartServicePackage(), getStartServiceAction(), false, 4225, getUseDynamicLookup()) : new C8946j1(getContext().getPackageName(), getLocalStartServiceAction(), true, 4225, false);
                    this.zza = c8946j2;
                    if (c8946j2.m36024c() && getMinApkVersion() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.zza.m36022a())));
                    }
                    AbstractC8932f abstractC8932f3 = this.zzn;
                    String strM36022a4 = this.zza.m36022a();
                    C8953m.m36047l(strM36022a4);
                    ConnectionResult connectionResultMo35988c = abstractC8932f3.mo35988c(new C8931e1(strM36022a4, this.zza.m36023b(), 4225, this.zza.m36024c()), serviceConnectionC8978x2, zza(), getBindServiceExecutor());
                    if (!connectionResultMo35988c.m9138A3()) {
                        String strM36022a5 = this.zza.m36022a();
                        String strM36023b2 = this.zza.m36023b();
                        StringBuilder sb3 = new StringBuilder(String.valueOf(strM36022a5).length() + 34 + String.valueOf(strM36023b2).length());
                        sb3.append("unable to connect to service: ");
                        sb3.append(strM36022a5);
                        sb3.append(" on ");
                        sb3.append(strM36023b2);
                        Log.w("GmsClient", sb3.toString());
                        int iM9140w3 = connectionResultMo35988c.m9140w3() == -1 ? 16 : connectionResultMo35988c.m9140w3();
                        if (connectionResultMo35988c.m9142y3() != null) {
                            bundle = new Bundle();
                            bundle.putParcelable("pendingIntent", connectionResultMo35988c.m9142y3());
                        }
                        zzb(iM9140w3, bundle, this.zzd.get());
                    }
                } else if (i10 == 4) {
                    C8953m.m36047l(iInterface);
                    onConnectedLocked(iInterface);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void checkAvailabilityAndConnect() {
        int iMo29855h = this.zzo.mo29855h(this.zzl, getMinApkVersion());
        if (iMo29855h == 0) {
            connect(new d(this));
        } else {
            zzp(1, null);
            triggerNotAvailable(new d(this), iMo29855h, null);
        }
    }

    public final void checkConnected() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public void connect(@NonNull c cVar) {
        C8953m.m36048m(cVar, "Connection progress callbacks cannot be null.");
        this.zzc = cVar;
        zzp(2, null);
    }

    public abstract T createServiceInterface(@NonNull IBinder iBinder);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void disconnect() {
        this.zzd.incrementAndGet();
        ArrayList arrayList = this.zzt;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((AbstractC8974v0) arrayList.get(i10)).m36077d();
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
    public Feature[] getApiFeatures() {
        return zze;
    }

    public final Feature[] getAvailableFeatures() {
        zzj zzjVar = this.zzE;
        if (zzjVar == null) {
            return null;
        }
        return zzjVar.f7505g;
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
        C8946j1 c8946j1;
        if (!isConnected() || (c8946j1 = this.zza) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return c8946j1.m36023b();
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
        return C7091d.f27704a;
    }

    public void getRemoteService(InterfaceC1903b interfaceC1903b, @NonNull Set<Scope> set) {
        Bundle getServiceRequestExtraArgs = getGetServiceRequestExtraArgs();
        String str = Build.VERSION.SDK_INT < 31 ? this.zzA : this.zzA;
        int i10 = this.zzy;
        int i11 = C7091d.f27704a;
        Scope[] scopeArr = GetServiceRequest.f7463t;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.f7464u;
        GetServiceRequest getServiceRequest = new GetServiceRequest(6, i10, i11, null, null, scopeArr, bundle, null, featureArr, featureArr, true, 0, false, str);
        getServiceRequest.f7468i = this.zzl.getPackageName();
        getServiceRequest.f7471l = getServiceRequestExtraArgs;
        if (set != null) {
            getServiceRequest.f7470k = (Scope[]) set.toArray(new Scope[0]);
        }
        if (requiresSignIn()) {
            Account account = getAccount();
            if (account == null) {
                account = new Account("<<default account>>", "com.google");
            }
            getServiceRequest.f7472m = account;
            if (interfaceC1903b != null) {
                getServiceRequest.f7469j = interfaceC1903b.asBinder();
            }
        } else if (requiresAccount()) {
            getServiceRequest.f7472m = getAccount();
        }
        getServiceRequest.f7473n = zze;
        getServiceRequest.f7474o = getApiFeatures();
        if (usesClientTelemetry()) {
            getServiceRequest.f7477r = true;
        }
        try {
            synchronized (this.zzq) {
                try {
                    InterfaceC8941i interfaceC8941i = this.zzr;
                    if (interfaceC8941i != null) {
                        interfaceC8941i.mo36019R(new BinderC8976w0(this, this.zzd.get()), getServiceRequest);
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
                C8953m.m36048m(iInterface, "Client is connected but service is null");
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

    public ConnectionTelemetryConfiguration getTelemetryConfiguration() {
        zzj zzjVar = this.zzE;
        if (zzjVar == null) {
            return null;
        }
        return zzjVar.f7507i;
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

    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        this.zzi = connectionResult.m9140w3();
        this.zzj = System.currentTimeMillis();
    }

    public void onConnectionSuspended(int i10) {
        this.zzf = i10;
        this.zzg = System.currentTimeMillis();
    }

    public void onPostInitHandler(int i10, IBinder iBinder, Bundle bundle, int i11) {
        C8980y0 c8980y0 = new C8980y0(this, i10, iBinder, bundle);
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(1, i11, -1, c8980y0));
    }

    public void onUserSignOut(@NonNull e eVar) {
        eVar.mo33183a();
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
        C8953m.m36048m(cVar, "Connection progress callbacks cannot be null.");
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
        C8982z0 c8982z0 = new C8982z0(this, i10, bundle);
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(7, i11, -1, c8982z0));
    }

    public final /* synthetic */ void zzc(zzj zzjVar) {
        this.zzE = zzjVar;
        if (usesClientTelemetry()) {
            ConnectionTelemetryConfiguration connectionTelemetryConfiguration = zzjVar.f7507i;
            C8956n.m36054b().m36056c(connectionTelemetryConfiguration == null ? null : connectionTelemetryConfiguration.m9200A3());
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

    public final /* synthetic */ void zzi(InterfaceC8941i interfaceC8941i) {
        this.zzr = interfaceC8941i;
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

    public final /* synthetic */ ConnectionResult zzm() {
        return this.zzC;
    }

    public final /* synthetic */ void zzn(ConnectionResult connectionResult) {
        this.zzC = connectionResult;
    }

    public final /* synthetic */ boolean zzo() {
        return this.zzD;
    }

    public AbstractC8923c(@NonNull Context context, @NonNull Looper looper, @NonNull AbstractC8932f abstractC8932f, @NonNull C7091d c7091d, int i10, a aVar, b bVar, String str) {
        this.zzk = null;
        this.zzp = new Object();
        this.zzq = new Object();
        this.zzt = new ArrayList();
        this.zzv = 1;
        this.zzC = null;
        this.zzD = false;
        this.zzE = null;
        this.zzd = new AtomicInteger(0);
        C8953m.m36048m(context, "Context must not be null");
        this.zzl = context;
        C8953m.m36048m(looper, "Looper must not be null");
        this.zzm = looper;
        C8953m.m36048m(abstractC8932f, "Supervisor must not be null");
        this.zzn = abstractC8932f;
        C8953m.m36048m(c7091d, "API availability must not be null");
        this.zzo = c7091d;
        this.zzb = new HandlerC8972u0(this, looper);
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
