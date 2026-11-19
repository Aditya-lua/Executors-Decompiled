package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.measurement.a2;
import com.google.android.gms.internal.measurement.e2;
import com.google.android.gms.internal.measurement.g2;
import com.google.android.gms.internal.measurement.h2;
import com.google.android.gms.internal.measurement.j2;
import com.google.android.gms.internal.measurement.t1;
import com.google.android.gms.internal.measurement.x1;
import java.util.Map;
import o9.s;
import ob.a9;
import ob.ff;
import ob.g0;
import ob.gf;
import ob.i0;
import ob.i7;
import ob.i9;
import ob.ia;
import ob.j8;
import ob.k9;
import ob.ka;
import ob.l7;
import ob.l9;
import ob.mb;
import ob.mc;
import ob.oe;
import ob.va;
import ob.w9;
import w1.a;
import z9.b;

/* JADX INFO: loaded from: classes.dex */
@DynamiteApi
public class AppMeasurementDynamiteService extends t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l7 f7393a = null;
    public final Map b = new a();

    @Override // com.google.android.gms.internal.measurement.u1
    public void beginAdUnitExposure(@NonNull String str, long j10) {
        s2();
        this.f7393a.M().i(str, j10);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void clearConditionalUserProperty(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle) {
        s2();
        this.f7393a.B().O(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void clearMeasurementEnabled(long j10) {
        s2();
        this.f7393a.B().n0(null);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void endAdUnitExposure(@NonNull String str, long j10) {
        s2();
        this.f7393a.M().j(str, j10);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void generateEventId(x1 x1Var) {
        s2();
        long jP0 = this.f7393a.C().p0();
        s2();
        this.f7393a.C().b0(x1Var, jP0);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void getAppInstanceId(x1 x1Var) {
        s2();
        this.f7393a.b().t(new i7(this, x1Var));
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void getCachedAppInstanceId(x1 x1Var) {
        s2();
        t2(x1Var, this.f7393a.B().D());
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void getConditionalUserProperties(String str, String str2, x1 x1Var) {
        s2();
        this.f7393a.b().t(new mb(this, x1Var, str, str2));
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void getCurrentScreenClass(x1 x1Var) {
        s2();
        t2(x1Var, this.f7393a.B().R());
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void getCurrentScreenName(x1 x1Var) {
        s2();
        t2(x1Var, this.f7393a.B().Q());
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void getGmpAppId(x1 x1Var) {
        s2();
        t2(x1Var, this.f7393a.B().S());
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void getMaxUserProperties(String str, x1 x1Var) {
        s2();
        this.f7393a.B().L(str);
        s2();
        this.f7393a.C().c0(x1Var, 25);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void getSessionId(x1 x1Var) {
        s2();
        va vaVarB = this.f7393a.B();
        vaVarB.f27641a.b().t(new w9(vaVarB, x1Var));
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void getTestFlag(x1 x1Var, int i10) {
        s2();
        if (i10 == 0) {
            this.f7393a.C().a0(x1Var, this.f7393a.B().j0());
            return;
        }
        if (i10 == 1) {
            this.f7393a.C().b0(x1Var, this.f7393a.B().k0().longValue());
            return;
        }
        if (i10 != 2) {
            if (i10 == 3) {
                this.f7393a.C().c0(x1Var, this.f7393a.B().l0().intValue());
                return;
            } else {
                if (i10 != 4) {
                    return;
                }
                this.f7393a.C().e0(x1Var, this.f7393a.B().i0().booleanValue());
                return;
            }
        }
        ff ffVarC = this.f7393a.C();
        double dDoubleValue = this.f7393a.B().m0().doubleValue();
        Bundle bundle = new Bundle();
        bundle.putDouble("r", dDoubleValue);
        try {
            x1Var.l(bundle);
        } catch (RemoteException e10) {
            ffVarC.f27641a.a().r().b("Error returning double value to wrapper", e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void getUserProperties(String str, String str2, boolean z10, x1 x1Var) {
        s2();
        this.f7393a.b().t(new k9(this, x1Var, str, str2, z10));
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void initForTests(@NonNull Map map) {
        s2();
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void initialize(z9.a aVar, h2 h2Var, long j10) {
        l7 l7Var = this.f7393a;
        if (l7Var == null) {
            this.f7393a = l7.O((Context) s.l((Context) b.t2(aVar)), h2Var, Long.valueOf(j10));
        } else {
            l7Var.a().r().a("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void isDataCollectionEnabled(x1 x1Var) {
        s2();
        this.f7393a.b().t(new mc(this, x1Var));
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void logEvent(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle, boolean z10, boolean z11, long j10) {
        s2();
        this.f7393a.B().q(str, str2, bundle, z10, z11, j10);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void logEventAndBundle(String str, String str2, Bundle bundle, x1 x1Var, long j10) {
        s2();
        s.f(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", Payload.TYPE_APP);
        this.f7393a.b().t(new j8(this, x1Var, new i0(str2, new g0(bundle), Payload.TYPE_APP, j10), str));
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void logHealthData(int i10, @NonNull String str, @NonNull z9.a aVar, @NonNull z9.a aVar2, @NonNull z9.a aVar3) {
        s2();
        this.f7393a.a().y(i10, true, false, str, aVar == null ? null : b.t2(aVar), aVar2 == null ? null : b.t2(aVar2), aVar3 != null ? b.t2(aVar3) : null);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void onActivityCreated(@NonNull z9.a aVar, @NonNull Bundle bundle, long j10) {
        s2();
        onActivityCreatedByScionActivityInfo(j2.a((Activity) s.l((Activity) b.t2(aVar))), bundle, j10);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void onActivityCreatedByScionActivityInfo(j2 j2Var, Bundle bundle, long j10) {
        s2();
        ia iaVar = this.f7393a.B().f27874c;
        if (iaVar != null) {
            this.f7393a.B().h0();
            iaVar.e(j2Var, bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void onActivityDestroyed(@NonNull z9.a aVar, long j10) {
        s2();
        onActivityDestroyedByScionActivityInfo(j2.a((Activity) s.l((Activity) b.t2(aVar))), j10);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void onActivityDestroyedByScionActivityInfo(j2 j2Var, long j10) {
        s2();
        ia iaVar = this.f7393a.B().f27874c;
        if (iaVar != null) {
            this.f7393a.B().h0();
            iaVar.b(j2Var);
        }
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void onActivityPaused(@NonNull z9.a aVar, long j10) {
        s2();
        onActivityPausedByScionActivityInfo(j2.a((Activity) s.l((Activity) b.t2(aVar))), j10);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void onActivityPausedByScionActivityInfo(j2 j2Var, long j10) {
        s2();
        ia iaVar = this.f7393a.B().f27874c;
        if (iaVar != null) {
            this.f7393a.B().h0();
            iaVar.a(j2Var);
        }
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void onActivityResumed(@NonNull z9.a aVar, long j10) {
        s2();
        onActivityResumedByScionActivityInfo(j2.a((Activity) s.l((Activity) b.t2(aVar))), j10);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void onActivityResumedByScionActivityInfo(j2 j2Var, long j10) {
        s2();
        ia iaVar = this.f7393a.B().f27874c;
        if (iaVar != null) {
            this.f7393a.B().h0();
            iaVar.d(j2Var);
        }
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void onActivitySaveInstanceState(z9.a aVar, x1 x1Var, long j10) {
        s2();
        onActivitySaveInstanceStateByScionActivityInfo(j2.a((Activity) s.l((Activity) b.t2(aVar))), x1Var, j10);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void onActivitySaveInstanceStateByScionActivityInfo(j2 j2Var, x1 x1Var, long j10) {
        s2();
        ia iaVar = this.f7393a.B().f27874c;
        Bundle bundle = new Bundle();
        if (iaVar != null) {
            this.f7393a.B().h0();
            iaVar.c(j2Var, bundle);
        }
        try {
            x1Var.l(bundle);
        } catch (RemoteException e10) {
            this.f7393a.a().r().b("Error returning bundle value to wrapper", e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void onActivityStarted(@NonNull z9.a aVar, long j10) {
        s2();
        onActivityStartedByScionActivityInfo(j2.a((Activity) s.l((Activity) b.t2(aVar))), j10);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void onActivityStartedByScionActivityInfo(j2 j2Var, long j10) {
        s2();
        if (this.f7393a.B().f27874c != null) {
            this.f7393a.B().h0();
        }
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void onActivityStopped(@NonNull z9.a aVar, long j10) {
        s2();
        onActivityStoppedByScionActivityInfo(j2.a((Activity) s.l((Activity) b.t2(aVar))), j10);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void onActivityStoppedByScionActivityInfo(j2 j2Var, long j10) {
        s2();
        if (this.f7393a.B().f27874c != null) {
            this.f7393a.B().h0();
        }
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void performAction(Bundle bundle, x1 x1Var, long j10) {
        s2();
        x1Var.l(null);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void registerOnMeasurementEventListener(e2 e2Var) {
        a9 gfVar;
        s2();
        Map map = this.b;
        synchronized (map) {
            try {
                gfVar = (a9) map.get(Integer.valueOf(e2Var.zzf()));
                if (gfVar == null) {
                    gfVar = new gf(this, e2Var);
                    map.put(Integer.valueOf(e2Var.zzf()), gfVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f7393a.B().J(gfVar);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void resetAnalyticsData(long j10) {
        s2();
        this.f7393a.B().G(j10);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void retrieveAndUploadBatches(final a2 a2Var) {
        s2();
        this.f7393a.B().r0(new Runnable() { // from class: ob.nd
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                try {
                    a2Var.zze();
                } catch (RemoteException e10) {
                    ((l7) o9.s.l(this.f27628a.f7393a)).a().r().b("Failed to call IDynamiteUploadBatchesCallback", e10);
                }
            }
        });
    }

    public final void s2() {
        if (this.f7393a == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void setConditionalUserProperty(@NonNull Bundle bundle, long j10) {
        s2();
        if (bundle == null) {
            this.f7393a.a().o().a("Conditional user property must not be null");
        } else {
            this.f7393a.B().N(bundle, j10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void setConsent(@NonNull Bundle bundle, long j10) {
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void setConsentThirdParty(@NonNull Bundle bundle, long j10) {
        s2();
        this.f7393a.B().o0(bundle, -20, j10);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void setCurrentScreen(@NonNull z9.a aVar, @NonNull String str, @NonNull String str2, long j10) {
        s2();
        setCurrentScreenByScionActivityInfo(j2.a((Activity) s.l((Activity) b.t2(aVar))), str, str2, j10);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void setCurrentScreenByScionActivityInfo(j2 j2Var, String str, String str2, long j10) {
        s2();
        this.f7393a.I().t(j2Var, str, str2);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void setDataCollectionEnabled(boolean z10) {
        s2();
        va vaVarB = this.f7393a.B();
        vaVarB.j();
        vaVarB.f27641a.b().t(new i9(vaVarB, z10));
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void setDefaultEventParameters(@NonNull Bundle bundle) {
        s2();
        final va vaVarB = this.f7393a.B();
        final Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        vaVarB.f27641a.b().t(new Runnable() { // from class: ob.qa
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                vaVarB.U(bundle2);
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void setEventInterceptor(e2 e2Var) {
        s2();
        oe oeVar = new oe(this, e2Var);
        if (this.f7393a.b().p()) {
            this.f7393a.B().I(oeVar);
        } else {
            this.f7393a.b().t(new ka(this, oeVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void setInstanceIdProvider(g2 g2Var) {
        s2();
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void setMeasurementEnabled(boolean z10, long j10) {
        s2();
        this.f7393a.B().n0(Boolean.valueOf(z10));
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void setMinimumSessionDuration(long j10) {
        s2();
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void setSessionTimeoutDuration(long j10) {
        s2();
        va vaVarB = this.f7393a.B();
        vaVarB.f27641a.b().t(new l9(vaVarB, j10));
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void setSgtmDebugInfo(@NonNull Intent intent) {
        s2();
        va vaVarB = this.f7393a.B();
        Uri data = intent.getData();
        if (data == null) {
            vaVarB.f27641a.a().u().a("Activity intent has no data. Preview Mode was not enabled.");
            return;
        }
        String queryParameter = data.getQueryParameter("sgtm_debug_enable");
        if (queryParameter == null || !queryParameter.equals("1")) {
            l7 l7Var = vaVarB.f27641a;
            l7Var.a().u().a("[sgtm] Preview Mode was not enabled.");
            l7Var.w().Q(null);
        } else {
            String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
            if (TextUtils.isEmpty(queryParameter2)) {
                return;
            }
            l7 l7Var2 = vaVarB.f27641a;
            l7Var2.a().u().b("[sgtm] Preview Mode was enabled. Using the sgtmPreviewKey: ", queryParameter2);
            l7Var2.w().Q(queryParameter2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void setUserId(@NonNull final String str, long j10) {
        s2();
        final va vaVarB = this.f7393a.B();
        if (str != null && TextUtils.isEmpty(str)) {
            vaVarB.f27641a.a().r().a("User ID must be non-empty or null");
        } else {
            vaVarB.f27641a.b().t(new Runnable() { // from class: ob.ra
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    l7 l7Var = vaVarB.f27641a;
                    if (l7Var.L().x(str)) {
                        l7Var.L().p();
                    }
                }
            });
            vaVarB.z(null, "_id", str, true, j10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void setUserProperty(@NonNull String str, @NonNull String str2, @NonNull z9.a aVar, boolean z10, long j10) {
        s2();
        this.f7393a.B().z(str, str2, b.t2(aVar), z10, j10);
    }

    public final void t2(x1 x1Var, String str) {
        s2();
        this.f7393a.C().a0(x1Var, str);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void unregisterOnMeasurementEventListener(e2 e2Var) {
        a9 gfVar;
        s2();
        Map map = this.b;
        synchronized (map) {
            gfVar = (a9) map.remove(Integer.valueOf(e2Var.zzf()));
        }
        if (gfVar == null) {
            gfVar = new gf(this, e2Var);
        }
        this.f7393a.B().K(gfVar);
    }
}
