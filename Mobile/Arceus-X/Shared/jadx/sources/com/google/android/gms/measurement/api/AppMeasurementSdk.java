package com.google.android.gms.measurement.api;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.measurement.C2349v3;
import com.google.android.gms.internal.measurement.zzdf;
import java.util.List;
import java.util.Map;
import p306nb.InterfaceC9319u8;
import p306nb.InterfaceC9335v8;

/* JADX INFO: loaded from: classes.dex */
public class AppMeasurementSdk {

    /* JADX INFO: renamed from: a */
    public final C2349v3 f9483a;

    /* JADX INFO: renamed from: com.google.android.gms.measurement.api.AppMeasurementSdk$a */
    public interface InterfaceC2725a extends InterfaceC9319u8 {
    }

    /* JADX INFO: renamed from: com.google.android.gms.measurement.api.AppMeasurementSdk$b */
    public interface InterfaceC2726b extends InterfaceC9335v8 {
    }

    public AppMeasurementSdk(C2349v3 c2349v3) {
        this.f9483a = c2349v3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @NonNull
    public static AppMeasurementSdk getInstance(@NonNull Context context) {
        return C2349v3.m10791r(context, null).m10819s();
    }

    public void beginAdUnitExposure(@NonNull String str) {
        this.f9483a.m10796E(str);
    }

    public void clearConditionalUserProperty(@NonNull String str, String str2, Bundle bundle) {
        this.f9483a.m10793B(str, str2, bundle);
    }

    public void endAdUnitExposure(@NonNull String str) {
        this.f9483a.m10797F(str);
    }

    public long generateEventId() {
        return this.f9483a.m10801J();
    }

    public String getAppIdOrigin() {
        return this.f9483a.m10808g();
    }

    public String getAppInstanceId() {
        return this.f9483a.m10800I();
    }

    @NonNull
    public List<Bundle> getConditionalUserProperties(String str, String str2) {
        return this.f9483a.m10794C(str, str2);
    }

    public String getCurrentScreenClass() {
        return this.f9483a.m10803b();
    }

    public String getCurrentScreenName() {
        return this.f9483a.m10802a();
    }

    public String getGmpAppId() {
        return this.f9483a.m10799H();
    }

    public int getMaxUserProperties(@NonNull String str) {
        return this.f9483a.m10807f(str);
    }

    @NonNull
    public Map<String, Object> getUserProperties(String str, String str2, boolean z10) {
        return this.f9483a.m10804c(str, str2, z10);
    }

    public void logEvent(@NonNull String str, @NonNull String str2, Bundle bundle) {
        this.f9483a.m10824x(str, str2, bundle);
    }

    public void logEventNoInterceptor(@NonNull String str, @NonNull String str2, Bundle bundle, long j10) {
        this.f9483a.m10825y(str, str2, bundle, j10);
    }

    public void performAction(@NonNull Bundle bundle) {
        this.f9483a.m10806e(bundle, false);
    }

    public Bundle performActionWithResponse(@NonNull Bundle bundle) {
        return this.f9483a.m10806e(bundle, true);
    }

    public void registerOnMeasurementEventListener(@NonNull InterfaceC2726b interfaceC2726b) {
        this.f9483a.m10822v(interfaceC2726b);
    }

    public void setConditionalUserProperty(@NonNull Bundle bundle) {
        this.f9483a.m10792A(bundle);
    }

    @Deprecated
    public void setConsent(@NonNull Bundle bundle) {
    }

    public void setCurrentScreen(@NonNull Activity activity, String str, String str2) {
        this.f9483a.m10795D(zzdf.m11161a(activity), str, str2);
    }

    public void setEventInterceptor(@NonNull InterfaceC2725a interfaceC2725a) {
        this.f9483a.m10821u(interfaceC2725a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public void setMeasurementEnabled(Boolean bool) {
    }

    public void setUserProperty(@NonNull String str, @NonNull String str2, @NonNull Object obj) {
        this.f9483a.m10826z(str, str2, obj, true);
    }

    public void unregisterOnMeasurementEventListener(@NonNull InterfaceC2726b interfaceC2726b) {
        this.f9483a.m10823w(interfaceC2726b);
    }

    public final void zza(boolean z10) {
        this.f9483a.m10809h(z10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Deprecated
    public void setMeasurementEnabled(boolean z10) {
    }

    @NonNull
    @Deprecated
    public static AppMeasurementSdk getInstance(@NonNull Context context, @NonNull String str, @NonNull String str2, String str3, @NonNull Bundle bundle) {
        return C2349v3.m10791r(context, bundle).m10819s();
    }
}
