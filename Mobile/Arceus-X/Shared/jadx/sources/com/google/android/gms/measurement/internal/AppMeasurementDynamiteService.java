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
import com.google.android.gms.internal.measurement.AbstractBinderC2311t1;
import com.google.android.gms.internal.measurement.InterfaceC1963a2;
import com.google.android.gms.internal.measurement.InterfaceC2039e2;
import com.google.android.gms.internal.measurement.InterfaceC2077g2;
import com.google.android.gms.internal.measurement.InterfaceC2383x1;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.internal.measurement.zzdf;
import java.util.Map;
import p305n9.C8953m;
import p306nb.C9047da;
import p306nb.C9085fe;
import p306nb.C9094g7;
import p306nb.C9257qa;
import p306nb.C9341ve;
import p306nb.C9357we;
import p306nb.InterfaceC9335v8;
import p306nb.RunnableC9044d7;
import p306nb.RunnableC9046d9;
import p306nb.RunnableC9062e8;
import p306nb.RunnableC9080f9;
import p306nb.RunnableC9081fa;
import p306nb.RunnableC9096g9;
import p306nb.RunnableC9114hb;
import p306nb.RunnableC9115hc;
import p306nb.RunnableC9272r9;
import p504w1.C12277a;
import p571y9.BinderC13134b;
import p571y9.InterfaceC13133a;

/* JADX INFO: loaded from: classes.dex */
@DynamiteApi
public class AppMeasurementDynamiteService extends AbstractBinderC2311t1 {

    /* JADX INFO: renamed from: a */
    public C9094g7 f9484a = null;

    /* JADX INFO: renamed from: b */
    public final Map f9485b = new C12277a();

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329u1
    public void beginAdUnitExposure(@NonNull String str, long j10) {
        m11876s2();
        this.f9484a.m36318M().m37069i(str, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329u1
    public void clearConditionalUserProperty(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle) {
        m11876s2();
        this.f9484a.m36307B().m36676O(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329u1
    public void clearMeasurementEnabled(long j10) {
        m11876s2();
        this.f9484a.m36307B().m36701n0(null);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329u1
    public void endAdUnitExposure(@NonNull String str, long j10) {
        m11876s2();
        this.f9484a.m36318M().m37070j(str, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329u1
    public void generateEventId(InterfaceC2383x1 interfaceC2383x1) {
        m11876s2();
        long jM36970p0 = this.f9484a.m36308C().m36970p0();
        m11876s2();
        this.f9484a.m36308C().m36958b0(interfaceC2383x1, jM36970p0);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329u1
    public void getAppInstanceId(InterfaceC2383x1 interfaceC2383x1) {
        m11876s2();
        this.f9484a.mo36322b().m36263t(new RunnableC9044d7(this, interfaceC2383x1));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329u1
    public void getCachedAppInstanceId(InterfaceC2383x1 interfaceC2383x1) {
        m11876s2();
        m11877t2(interfaceC2383x1, this.f9484a.m36307B().m36665D());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329u1
    public void getConditionalUserProperties(String str, String str2, InterfaceC2383x1 interfaceC2383x1) {
        m11876s2();
        this.f9484a.mo36322b().m36263t(new RunnableC9114hb(this, interfaceC2383x1, str, str2));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329u1
    public void getCurrentScreenClass(InterfaceC2383x1 interfaceC2383x1) {
        m11876s2();
        m11877t2(interfaceC2383x1, this.f9484a.m36307B().m36679R());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329u1
    public void getCurrentScreenName(InterfaceC2383x1 interfaceC2383x1) {
        m11876s2();
        m11877t2(interfaceC2383x1, this.f9484a.m36307B().m36678Q());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329u1
    public void getGmpAppId(InterfaceC2383x1 interfaceC2383x1) {
        m11876s2();
        m11877t2(interfaceC2383x1, this.f9484a.m36307B().m36680S());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329u1
    public void getMaxUserProperties(String str, InterfaceC2383x1 interfaceC2383x1) {
        m11876s2();
        this.f9484a.m36307B().m36673L(str);
        m11876s2();
        this.f9484a.m36308C().m36959c0(interfaceC2383x1, 25);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329u1
    public void getSessionId(InterfaceC2383x1 interfaceC2383x1) {
        m11876s2();
        C9257qa c9257qaM36307B = this.f9484a.m36307B();
        c9257qaM36307B.f33067a.mo36322b().m36263t(new RunnableC9272r9(c9257qaM36307B, interfaceC2383x1));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329u1
    public void getTestFlag(InterfaceC2383x1 interfaceC2383x1, int i10) {
        m11876s2();
        if (i10 == 0) {
            this.f9484a.m36308C().m36957a0(interfaceC2383x1, this.f9484a.m36307B().m36697j0());
            return;
        }
        if (i10 == 1) {
            this.f9484a.m36308C().m36958b0(interfaceC2383x1, this.f9484a.m36307B().m36698k0().longValue());
            return;
        }
        if (i10 != 2) {
            if (i10 == 3) {
                this.f9484a.m36308C().m36959c0(interfaceC2383x1, this.f9484a.m36307B().m36699l0().intValue());
                return;
            } else {
                if (i10 != 4) {
                    return;
                }
                this.f9484a.m36308C().m36961e0(interfaceC2383x1, this.f9484a.m36307B().m36696i0().booleanValue());
                return;
            }
        }
        C9341ve c9341veM36308C = this.f9484a.m36308C();
        double dDoubleValue = this.f9484a.m36307B().m36700m0().doubleValue();
        Bundle bundle = new Bundle();
        bundle.putDouble("r", dDoubleValue);
        try {
            interfaceC2383x1.mo10588l(bundle);
        } catch (RemoteException e10) {
            c9341veM36308C.f33067a.mo36321a().m37006r().m36912b("Error returning double value to wrapper", e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329u1
    public void getUserProperties(String str, String str2, boolean z10, InterfaceC2383x1 interfaceC2383x1) {
        m11876s2();
        this.f9484a.mo36322b().m36263t(new RunnableC9080f9(this, interfaceC2383x1, str, str2, z10));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329u1
    public void initForTests(@NonNull Map map) {
        m11876s2();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329u1
    public void initialize(InterfaceC13133a interfaceC13133a, zzdd zzddVar, long j10) {
        C9094g7 c9094g7 = this.f9484a;
        if (c9094g7 == null) {
            this.f9484a = C9094g7.m36300O((Context) C8953m.m36047l((Context) BinderC13134b.m48742t2(interfaceC13133a)), zzddVar, Long.valueOf(j10));
        } else {
            c9094g7.mo36321a().m37006r().m36911a("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329u1
    public void isDataCollectionEnabled(InterfaceC2383x1 interfaceC2383x1) {
        m11876s2();
        this.f9484a.mo36322b().m36263t(new RunnableC9115hc(this, interfaceC2383x1));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329u1
    public void logEvent(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle, boolean z10, boolean z11, long j10) {
        m11876s2();
        this.f9484a.m36307B().m36706q(str, str2, bundle, z10, z11, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329u1
    public void logEventAndBundle(String str, String str2, Bundle bundle, InterfaceC2383x1 interfaceC2383x1, long j10) {
        m11876s2();
        C8953m.m36041f(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", Payload.TYPE_APP);
        this.f9484a.mo36322b().m36263t(new RunnableC9062e8(this, interfaceC2383x1, new zzbg(str2, new zzbe(bundle), Payload.TYPE_APP, j10), str));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329u1
    public void logHealthData(int i10, @NonNull String str, @NonNull InterfaceC13133a interfaceC13133a, @NonNull InterfaceC13133a interfaceC13133a2, @NonNull InterfaceC13133a interfaceC13133a3) {
        m11876s2();
        this.f9484a.mo36321a().m37012y(i10, true, false, str, interfaceC13133a == null ? null : BinderC13134b.m48742t2(interfaceC13133a), interfaceC13133a2 == null ? null : BinderC13134b.m48742t2(interfaceC13133a2), interfaceC13133a3 != null ? BinderC13134b.m48742t2(interfaceC13133a3) : null);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329u1
    public void onActivityCreated(@NonNull InterfaceC13133a interfaceC13133a, @NonNull Bundle bundle, long j10) {
        m11876s2();
        onActivityCreatedByScionActivityInfo(zzdf.m11161a((Activity) C8953m.m36047l((Activity) BinderC13134b.m48742t2(interfaceC13133a))), bundle, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329u1
    public void onActivityCreatedByScionActivityInfo(zzdf zzdfVar, Bundle bundle, long j10) {
        m11876s2();
        C9047da c9047da = this.f9484a.m36307B().f33392c;
        if (c9047da != null) {
            this.f9484a.m36307B().m36695h0();
            c9047da.mo36138e(zzdfVar, bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329u1
    public void onActivityDestroyed(@NonNull InterfaceC13133a interfaceC13133a, long j10) {
        m11876s2();
        onActivityDestroyedByScionActivityInfo(zzdf.m11161a((Activity) C8953m.m36047l((Activity) BinderC13134b.m48742t2(interfaceC13133a))), j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329u1
    public void onActivityDestroyedByScionActivityInfo(zzdf zzdfVar, long j10) {
        m11876s2();
        C9047da c9047da = this.f9484a.m36307B().f33392c;
        if (c9047da != null) {
            this.f9484a.m36307B().m36695h0();
            c9047da.mo36135b(zzdfVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329u1
    public void onActivityPaused(@NonNull InterfaceC13133a interfaceC13133a, long j10) {
        m11876s2();
        onActivityPausedByScionActivityInfo(zzdf.m11161a((Activity) C8953m.m36047l((Activity) BinderC13134b.m48742t2(interfaceC13133a))), j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329u1
    public void onActivityPausedByScionActivityInfo(zzdf zzdfVar, long j10) {
        m11876s2();
        C9047da c9047da = this.f9484a.m36307B().f33392c;
        if (c9047da != null) {
            this.f9484a.m36307B().m36695h0();
            c9047da.mo36134a(zzdfVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329u1
    public void onActivityResumed(@NonNull InterfaceC13133a interfaceC13133a, long j10) {
        m11876s2();
        onActivityResumedByScionActivityInfo(zzdf.m11161a((Activity) C8953m.m36047l((Activity) BinderC13134b.m48742t2(interfaceC13133a))), j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329u1
    public void onActivityResumedByScionActivityInfo(zzdf zzdfVar, long j10) {
        m11876s2();
        C9047da c9047da = this.f9484a.m36307B().f33392c;
        if (c9047da != null) {
            this.f9484a.m36307B().m36695h0();
            c9047da.mo36137d(zzdfVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329u1
    public void onActivitySaveInstanceState(InterfaceC13133a interfaceC13133a, InterfaceC2383x1 interfaceC2383x1, long j10) {
        m11876s2();
        onActivitySaveInstanceStateByScionActivityInfo(zzdf.m11161a((Activity) C8953m.m36047l((Activity) BinderC13134b.m48742t2(interfaceC13133a))), interfaceC2383x1, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329u1
    public void onActivitySaveInstanceStateByScionActivityInfo(zzdf zzdfVar, InterfaceC2383x1 interfaceC2383x1, long j10) {
        m11876s2();
        C9047da c9047da = this.f9484a.m36307B().f33392c;
        Bundle bundle = new Bundle();
        if (c9047da != null) {
            this.f9484a.m36307B().m36695h0();
            c9047da.mo36136c(zzdfVar, bundle);
        }
        try {
            interfaceC2383x1.mo10588l(bundle);
        } catch (RemoteException e10) {
            this.f9484a.mo36321a().m37006r().m36912b("Error returning bundle value to wrapper", e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329u1
    public void onActivityStarted(@NonNull InterfaceC13133a interfaceC13133a, long j10) {
        m11876s2();
        onActivityStartedByScionActivityInfo(zzdf.m11161a((Activity) C8953m.m36047l((Activity) BinderC13134b.m48742t2(interfaceC13133a))), j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329u1
    public void onActivityStartedByScionActivityInfo(zzdf zzdfVar, long j10) {
        m11876s2();
        if (this.f9484a.m36307B().f33392c != null) {
            this.f9484a.m36307B().m36695h0();
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329u1
    public void onActivityStopped(@NonNull InterfaceC13133a interfaceC13133a, long j10) {
        m11876s2();
        onActivityStoppedByScionActivityInfo(zzdf.m11161a((Activity) C8953m.m36047l((Activity) BinderC13134b.m48742t2(interfaceC13133a))), j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329u1
    public void onActivityStoppedByScionActivityInfo(zzdf zzdfVar, long j10) {
        m11876s2();
        if (this.f9484a.m36307B().f33392c != null) {
            this.f9484a.m36307B().m36695h0();
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329u1
    public void performAction(Bundle bundle, InterfaceC2383x1 interfaceC2383x1, long j10) {
        m11876s2();
        interfaceC2383x1.mo10588l(null);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329u1
    public void registerOnMeasurementEventListener(InterfaceC2039e2 interfaceC2039e2) {
        InterfaceC9335v8 c9357we;
        m11876s2();
        Map map = this.f9485b;
        synchronized (map) {
            try {
                c9357we = (InterfaceC9335v8) map.get(Integer.valueOf(interfaceC2039e2.zzf()));
                if (c9357we == null) {
                    c9357we = new C9357we(this, interfaceC2039e2);
                    map.put(Integer.valueOf(interfaceC2039e2.zzf()), c9357we);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f9484a.m36307B().m36671J(c9357we);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329u1
    public void resetAnalyticsData(long j10) {
        m11876s2();
        this.f9484a.m36307B().m36668G(j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329u1
    public void retrieveAndUploadBatches(final InterfaceC1963a2 interfaceC1963a2) {
        m11876s2();
        this.f9484a.m36307B().m36709r0(new Runnable() { // from class: nb.id
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                try {
                    interfaceC1963a2.zze();
                } catch (RemoteException e10) {
                    ((C9094g7) C8953m.m36047l(this.f33049a.f9484a)).mo36321a().m37006r().m36912b("Failed to call IDynamiteUploadBatchesCallback", e10);
                }
            }
        });
    }

    /* JADX INFO: renamed from: s2 */
    public final void m11876s2() {
        if (this.f9484a == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329u1
    public void setConditionalUserProperty(@NonNull Bundle bundle, long j10) {
        m11876s2();
        if (bundle == null) {
            this.f9484a.mo36321a().m37003o().m36911a("Conditional user property must not be null");
        } else {
            this.f9484a.m36307B().m36675N(bundle, j10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329u1
    public void setConsent(@NonNull Bundle bundle, long j10) {
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329u1
    public void setConsentThirdParty(@NonNull Bundle bundle, long j10) {
        m11876s2();
        this.f9484a.m36307B().m36703o0(bundle, -20, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329u1
    public void setCurrentScreen(@NonNull InterfaceC13133a interfaceC13133a, @NonNull String str, @NonNull String str2, long j10) {
        m11876s2();
        setCurrentScreenByScionActivityInfo(zzdf.m11161a((Activity) C8953m.m36047l((Activity) BinderC13134b.m48742t2(interfaceC13133a))), str, str2, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329u1
    public void setCurrentScreenByScionActivityInfo(zzdf zzdfVar, String str, String str2, long j10) {
        m11876s2();
        this.f9484a.m36314I().m36383t(zzdfVar, str, str2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329u1
    public void setDataCollectionEnabled(boolean z10) {
        m11876s2();
        C9257qa c9257qaM36307B = this.f9484a.m36307B();
        c9257qaM36307B.m36121j();
        c9257qaM36307B.f33067a.mo36322b().m36263t(new RunnableC9046d9(c9257qaM36307B, z10));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329u1
    public void setDefaultEventParameters(@NonNull Bundle bundle) {
        m11876s2();
        final C9257qa c9257qaM36307B = this.f9484a.m36307B();
        final Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        c9257qaM36307B.f33067a.mo36322b().m36263t(new Runnable() { // from class: nb.la
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                c9257qaM36307B.m36682U(bundle2);
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329u1
    public void setEventInterceptor(InterfaceC2039e2 interfaceC2039e2) {
        m11876s2();
        C9085fe c9085fe = new C9085fe(this, interfaceC2039e2);
        if (this.f9484a.mo36322b().m36259p()) {
            this.f9484a.m36307B().m36670I(c9085fe);
        } else {
            this.f9484a.mo36322b().m36263t(new RunnableC9081fa(this, c9085fe));
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329u1
    public void setInstanceIdProvider(InterfaceC2077g2 interfaceC2077g2) {
        m11876s2();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329u1
    public void setMeasurementEnabled(boolean z10, long j10) {
        m11876s2();
        this.f9484a.m36307B().m36701n0(Boolean.valueOf(z10));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329u1
    public void setMinimumSessionDuration(long j10) {
        m11876s2();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329u1
    public void setSessionTimeoutDuration(long j10) {
        m11876s2();
        C9257qa c9257qaM36307B = this.f9484a.m36307B();
        c9257qaM36307B.f33067a.mo36322b().m36263t(new RunnableC9096g9(c9257qaM36307B, j10));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329u1
    public void setSgtmDebugInfo(@NonNull Intent intent) {
        m11876s2();
        C9257qa c9257qaM36307B = this.f9484a.m36307B();
        Uri data = intent.getData();
        if (data == null) {
            c9257qaM36307B.f33067a.mo36321a().m37009u().m36911a("Activity intent has no data. Preview Mode was not enabled.");
            return;
        }
        String queryParameter = data.getQueryParameter("sgtm_debug_enable");
        if (queryParameter == null || !queryParameter.equals("1")) {
            C9094g7 c9094g7 = c9257qaM36307B.f33067a;
            c9094g7.mo36321a().m37009u().m36911a("[sgtm] Preview Mode was not enabled.");
            c9094g7.m36338w().m36415Q(null);
        } else {
            String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
            if (TextUtils.isEmpty(queryParameter2)) {
                return;
            }
            C9094g7 c9094g8 = c9257qaM36307B.f33067a;
            c9094g8.mo36321a().m37009u().m36912b("[sgtm] Preview Mode was enabled. Using the sgtmPreviewKey: ", queryParameter2);
            c9094g8.m36338w().m36415Q(queryParameter2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329u1
    public void setUserId(@NonNull final String str, long j10) {
        m11876s2();
        final C9257qa c9257qaM36307B = this.f9484a.m36307B();
        if (str != null && TextUtils.isEmpty(str)) {
            c9257qaM36307B.f33067a.mo36321a().m37006r().m36911a("User ID must be non-empty or null");
        } else {
            c9257qaM36307B.f33067a.mo36322b().m36263t(new Runnable() { // from class: nb.ma
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    C9094g7 c9094g7 = c9257qaM36307B.f33067a;
                    if (c9094g7.m36317L().m36439x(str)) {
                        c9094g7.m36317L().m36431p();
                    }
                }
            });
            c9257qaM36307B.m36723z(null, "_id", str, true, j10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329u1
    public void setUserProperty(@NonNull String str, @NonNull String str2, @NonNull InterfaceC13133a interfaceC13133a, boolean z10, long j10) {
        m11876s2();
        this.f9484a.m36307B().m36723z(str, str2, BinderC13134b.m48742t2(interfaceC13133a), z10, j10);
    }

    /* JADX INFO: renamed from: t2 */
    public final void m11877t2(InterfaceC2383x1 interfaceC2383x1, String str) {
        m11876s2();
        this.f9484a.m36308C().m36957a0(interfaceC2383x1, str);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329u1
    public void unregisterOnMeasurementEventListener(InterfaceC2039e2 interfaceC2039e2) {
        InterfaceC9335v8 c9357we;
        m11876s2();
        Map map = this.f9485b;
        synchronized (map) {
            c9357we = (InterfaceC9335v8) map.remove(Integer.valueOf(interfaceC2039e2.zzf()));
        }
        if (c9357we == null) {
            c9357we = new C9357we(this, interfaceC2039e2);
        }
        this.f9484a.m36307B().m36672K(c9357we);
    }
}
