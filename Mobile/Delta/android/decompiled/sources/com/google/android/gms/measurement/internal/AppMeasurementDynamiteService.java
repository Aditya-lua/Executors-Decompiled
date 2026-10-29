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
import com.google.android.gms.internal.measurement.t1;
import com.google.android.gms.internal.measurement.x1;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.internal.measurement.zzdf;
import java.util.Map;
import n9.m;
import nb.d7;
import nb.d9;
import nb.da;
import nb.e8;
import nb.f9;
import nb.fa;
import nb.fe;
import nb.g7;
import nb.g9;
import nb.hb;
import nb.hc;
import nb.qa;
import nb.r9;
import nb.v8;
import nb.ve;
import nb.we;
import w1.a;
import y9.b;

/* JADX INFO: loaded from: classes.dex */
@DynamiteApi
public class AppMeasurementDynamiteService extends t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g7 f7405a = null;
    public final Map b = new a();

    @Override // com.google.android.gms.internal.measurement.u1
    public void beginAdUnitExposure(@NonNull String str, long j10) {
        s2();
        this.f7405a.M().i(str, j10);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void clearConditionalUserProperty(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle) {
        s2();
        this.f7405a.B().O(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void clearMeasurementEnabled(long j10) {
        s2();
        this.f7405a.B().n0(null);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void endAdUnitExposure(@NonNull String str, long j10) {
        s2();
        this.f7405a.M().j(str, j10);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void generateEventId(x1 x1Var) {
        s2();
        long jP0 = this.f7405a.C().p0();
        s2();
        this.f7405a.C().b0(x1Var, jP0);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void getAppInstanceId(x1 x1Var) {
        s2();
        this.f7405a.b().t(new d7(this, x1Var));
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void getCachedAppInstanceId(x1 x1Var) {
        s2();
        t2(x1Var, this.f7405a.B().D());
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void getConditionalUserProperties(String str, String str2, x1 x1Var) {
        s2();
        this.f7405a.b().t(new hb(this, x1Var, str, str2));
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void getCurrentScreenClass(x1 x1Var) {
        s2();
        t2(x1Var, this.f7405a.B().R());
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void getCurrentScreenName(x1 x1Var) {
        s2();
        t2(x1Var, this.f7405a.B().Q());
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void getGmpAppId(x1 x1Var) {
        s2();
        t2(x1Var, this.f7405a.B().S());
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void getMaxUserProperties(String str, x1 x1Var) {
        s2();
        this.f7405a.B().L(str);
        s2();
        this.f7405a.C().c0(x1Var, 25);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void getSessionId(x1 x1Var) {
        s2();
        qa qaVarB = this.f7405a.B();
        qaVarB.f25625a.b().t(new r9(qaVarB, x1Var));
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void getTestFlag(x1 x1Var, int i10) {
        s2();
        if (i10 == 0) {
            this.f7405a.C().a0(x1Var, this.f7405a.B().j0());
            return;
        }
        if (i10 == 1) {
            this.f7405a.C().b0(x1Var, this.f7405a.B().k0().longValue());
            return;
        }
        if (i10 != 2) {
            if (i10 == 3) {
                this.f7405a.C().c0(x1Var, this.f7405a.B().l0().intValue());
                return;
            } else {
                if (i10 != 4) {
                    return;
                }
                this.f7405a.C().e0(x1Var, this.f7405a.B().i0().booleanValue());
                return;
            }
        }
        ve veVarC = this.f7405a.C();
        double dDoubleValue = this.f7405a.B().m0().doubleValue();
        Bundle bundle = new Bundle();
        bundle.putDouble("r", dDoubleValue);
        try {
            x1Var.l(bundle);
        } catch (RemoteException e10) {
            veVarC.f25625a.a().r().b("Error returning double value to wrapper", e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void getUserProperties(String str, String str2, boolean z10, x1 x1Var) {
        s2();
        this.f7405a.b().t(new f9(this, x1Var, str, str2, z10));
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void initForTests(@NonNull Map map) {
        s2();
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void initialize(y9.a aVar, zzdd zzddVar, long j10) {
        g7 g7Var = this.f7405a;
        if (g7Var == null) {
            this.f7405a = g7.O((Context) m.l((Context) b.t2(aVar)), zzddVar, Long.valueOf(j10));
        } else {
            g7Var.a().r().a("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void isDataCollectionEnabled(x1 x1Var) {
        s2();
        this.f7405a.b().t(new hc(this, x1Var));
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void logEvent(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle, boolean z10, boolean z11, long j10) {
        s2();
        this.f7405a.B().q(str, str2, bundle, z10, z11, j10);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void logEventAndBundle(String str, String str2, Bundle bundle, x1 x1Var, long j10) {
        s2();
        m.f(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", Payload.TYPE_APP);
        this.f7405a.b().t(new e8(this, x1Var, new zzbg(str2, new zzbe(bundle), Payload.TYPE_APP, j10), str));
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void logHealthData(int i10, @NonNull String str, @NonNull y9.a aVar, @NonNull y9.a aVar2, @NonNull y9.a aVar3) {
        s2();
        this.f7405a.a().y(i10, true, false, str, aVar == null ? null : b.t2(aVar), aVar2 == null ? null : b.t2(aVar2), aVar3 != null ? b.t2(aVar3) : null);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void onActivityCreated(@NonNull y9.a aVar, @NonNull Bundle bundle, long j10) {
        s2();
        onActivityCreatedByScionActivityInfo(zzdf.a((Activity) m.l((Activity) b.t2(aVar))), bundle, j10);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void onActivityCreatedByScionActivityInfo(zzdf zzdfVar, Bundle bundle, long j10) {
        s2();
        da daVar = this.f7405a.B().f25891c;
        if (daVar != null) {
            this.f7405a.B().h0();
            daVar.e(zzdfVar, bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void onActivityDestroyed(@NonNull y9.a aVar, long j10) {
        s2();
        onActivityDestroyedByScionActivityInfo(zzdf.a((Activity) m.l((Activity) b.t2(aVar))), j10);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void onActivityDestroyedByScionActivityInfo(zzdf zzdfVar, long j10) {
        s2();
        da daVar = this.f7405a.B().f25891c;
        if (daVar != null) {
            this.f7405a.B().h0();
            daVar.b(zzdfVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void onActivityPaused(@NonNull y9.a aVar, long j10) {
        s2();
        onActivityPausedByScionActivityInfo(zzdf.a((Activity) m.l((Activity) b.t2(aVar))), j10);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void onActivityPausedByScionActivityInfo(zzdf zzdfVar, long j10) {
        s2();
        da daVar = this.f7405a.B().f25891c;
        if (daVar != null) {
            this.f7405a.B().h0();
            daVar.a(zzdfVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void onActivityResumed(@NonNull y9.a aVar, long j10) {
        s2();
        onActivityResumedByScionActivityInfo(zzdf.a((Activity) m.l((Activity) b.t2(aVar))), j10);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void onActivityResumedByScionActivityInfo(zzdf zzdfVar, long j10) {
        s2();
        da daVar = this.f7405a.B().f25891c;
        if (daVar != null) {
            this.f7405a.B().h0();
            daVar.d(zzdfVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void onActivitySaveInstanceState(y9.a aVar, x1 x1Var, long j10) {
        s2();
        onActivitySaveInstanceStateByScionActivityInfo(zzdf.a((Activity) m.l((Activity) b.t2(aVar))), x1Var, j10);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void onActivitySaveInstanceStateByScionActivityInfo(zzdf zzdfVar, x1 x1Var, long j10) {
        s2();
        da daVar = this.f7405a.B().f25891c;
        Bundle bundle = new Bundle();
        if (daVar != null) {
            this.f7405a.B().h0();
            daVar.c(zzdfVar, bundle);
        }
        try {
            x1Var.l(bundle);
        } catch (RemoteException e10) {
            this.f7405a.a().r().b("Error returning bundle value to wrapper", e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void onActivityStarted(@NonNull y9.a aVar, long j10) {
        s2();
        onActivityStartedByScionActivityInfo(zzdf.a((Activity) m.l((Activity) b.t2(aVar))), j10);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void onActivityStartedByScionActivityInfo(zzdf zzdfVar, long j10) {
        s2();
        if (this.f7405a.B().f25891c != null) {
            this.f7405a.B().h0();
        }
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void onActivityStopped(@NonNull y9.a aVar, long j10) {
        s2();
        onActivityStoppedByScionActivityInfo(zzdf.a((Activity) m.l((Activity) b.t2(aVar))), j10);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void onActivityStoppedByScionActivityInfo(zzdf zzdfVar, long j10) {
        s2();
        if (this.f7405a.B().f25891c != null) {
            this.f7405a.B().h0();
        }
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void performAction(Bundle bundle, x1 x1Var, long j10) {
        s2();
        x1Var.l(null);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void registerOnMeasurementEventListener(e2 e2Var) {
        v8 weVar;
        s2();
        Map map = this.b;
        synchronized (map) {
            try {
                weVar = (v8) map.get(Integer.valueOf(e2Var.zzf()));
                if (weVar == null) {
                    weVar = new we(this, e2Var);
                    map.put(Integer.valueOf(e2Var.zzf()), weVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f7405a.B().J(weVar);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void resetAnalyticsData(long j10) {
        s2();
        this.f7405a.B().G(j10);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void retrieveAndUploadBatches(final a2 a2Var) {
        s2();
        this.f7405a.B().r0(new Runnable() { // from class: nb.id
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                try {
                    a2Var.zze();
                } catch (RemoteException e10) {
                    ((g7) n9.m.l(this.f25611a.f7405a)).a().r().b("Failed to call IDynamiteUploadBatchesCallback", e10);
                }
            }
        });
    }

    public final void s2() {
        if (this.f7405a == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void setConditionalUserProperty(@NonNull Bundle bundle, long j10) {
        s2();
        if (bundle == null) {
            this.f7405a.a().o().a("Conditional user property must not be null");
        } else {
            this.f7405a.B().N(bundle, j10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void setConsent(@NonNull Bundle bundle, long j10) {
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void setConsentThirdParty(@NonNull Bundle bundle, long j10) {
        s2();
        this.f7405a.B().o0(bundle, -20, j10);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void setCurrentScreen(@NonNull y9.a aVar, @NonNull String str, @NonNull String str2, long j10) {
        s2();
        setCurrentScreenByScionActivityInfo(zzdf.a((Activity) m.l((Activity) b.t2(aVar))), str, str2, j10);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void setCurrentScreenByScionActivityInfo(zzdf zzdfVar, String str, String str2, long j10) {
        s2();
        this.f7405a.I().t(zzdfVar, str, str2);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void setDataCollectionEnabled(boolean z10) {
        s2();
        qa qaVarB = this.f7405a.B();
        qaVarB.j();
        qaVarB.f25625a.b().t(new d9(qaVarB, z10));
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void setDefaultEventParameters(@NonNull Bundle bundle) {
        s2();
        final qa qaVarB = this.f7405a.B();
        final Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        qaVarB.f25625a.b().t(new Runnable() { // from class: nb.la
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                qaVarB.U(bundle2);
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void setEventInterceptor(e2 e2Var) {
        s2();
        fe feVar = new fe(this, e2Var);
        if (this.f7405a.b().p()) {
            this.f7405a.B().I(feVar);
        } else {
            this.f7405a.b().t(new fa(this, feVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void setInstanceIdProvider(g2 g2Var) {
        s2();
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void setMeasurementEnabled(boolean z10, long j10) {
        s2();
        this.f7405a.B().n0(Boolean.valueOf(z10));
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void setMinimumSessionDuration(long j10) {
        s2();
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void setSessionTimeoutDuration(long j10) {
        s2();
        qa qaVarB = this.f7405a.B();
        qaVarB.f25625a.b().t(new g9(qaVarB, j10));
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void setSgtmDebugInfo(@NonNull Intent intent) {
        s2();
        qa qaVarB = this.f7405a.B();
        Uri data = intent.getData();
        if (data == null) {
            qaVarB.f25625a.a().u().a("Activity intent has no data. Preview Mode was not enabled.");
            return;
        }
        String queryParameter = data.getQueryParameter("sgtm_debug_enable");
        if (queryParameter == null || !queryParameter.equals("1")) {
            g7 g7Var = qaVarB.f25625a;
            g7Var.a().u().a("[sgtm] Preview Mode was not enabled.");
            g7Var.w().Q(null);
        } else {
            String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
            if (TextUtils.isEmpty(queryParameter2)) {
                return;
            }
            g7 g7Var2 = qaVarB.f25625a;
            g7Var2.a().u().b("[sgtm] Preview Mode was enabled. Using the sgtmPreviewKey: ", queryParameter2);
            g7Var2.w().Q(queryParameter2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void setUserId(@NonNull final String str, long j10) {
        s2();
        final qa qaVarB = this.f7405a.B();
        if (str != null && TextUtils.isEmpty(str)) {
            qaVarB.f25625a.a().r().a("User ID must be non-empty or null");
        } else {
            qaVarB.f25625a.b().t(new Runnable() { // from class: nb.ma
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    g7 g7Var = qaVarB.f25625a;
                    if (g7Var.L().x(str)) {
                        g7Var.L().p();
                    }
                }
            });
            qaVarB.z(null, "_id", str, true, j10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void setUserProperty(@NonNull String str, @NonNull String str2, @NonNull y9.a aVar, boolean z10, long j10) {
        s2();
        this.f7405a.B().z(str, str2, b.t2(aVar), z10, j10);
    }

    public final void t2(x1 x1Var, String str) {
        s2();
        this.f7405a.C().a0(x1Var, str);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void unregisterOnMeasurementEventListener(e2 e2Var) {
        v8 weVar;
        s2();
        Map map = this.b;
        synchronized (map) {
            weVar = (v8) map.remove(Integer.valueOf(e2Var.zzf()));
        }
        if (weVar == null) {
            weVar = new we(this, e2Var);
        }
        this.f7405a.B().K(weVar);
    }
}
