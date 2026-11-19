package com.google.android.gms.measurement.api;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.measurement.j2;
import com.google.android.gms.internal.measurement.z3;
import java.util.List;
import java.util.Map;
import ob.a9;
import ob.z8;

/* JADX INFO: loaded from: classes.dex */
public class AppMeasurementSdk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z3 f7392a;

    public interface a extends z8 {
    }

    public interface b extends a9 {
    }

    public AppMeasurementSdk(z3 z3Var) {
        this.f7392a = z3Var;
    }

    @NonNull
    public static AppMeasurementSdk getInstance(@NonNull Context context) {
        return z3.r(context, null).s();
    }

    public void beginAdUnitExposure(@NonNull String str) {
        this.f7392a.G(str);
    }

    public void clearConditionalUserProperty(@NonNull String str, String str2, Bundle bundle) {
        this.f7392a.B(str, str2, bundle);
    }

    public void endAdUnitExposure(@NonNull String str) {
        this.f7392a.H(str);
    }

    public long generateEventId() {
        return this.f7392a.L();
    }

    public String getAppIdOrigin() {
        return this.f7392a.g();
    }

    public String getAppInstanceId() {
        return this.f7392a.K();
    }

    @NonNull
    public List<Bundle> getConditionalUserProperties(String str, String str2) {
        return this.f7392a.C(str, str2);
    }

    public String getCurrentScreenClass() {
        return this.f7392a.b();
    }

    public String getCurrentScreenName() {
        return this.f7392a.a();
    }

    public String getGmpAppId() {
        return this.f7392a.J();
    }

    public int getMaxUserProperties(@NonNull String str) {
        return this.f7392a.f(str);
    }

    @NonNull
    public Map<String, Object> getUserProperties(String str, String str2, boolean z10) {
        return this.f7392a.c(str, str2, z10);
    }

    public void logEvent(@NonNull String str, @NonNull String str2, Bundle bundle) {
        this.f7392a.x(str, str2, bundle);
    }

    public void logEventNoInterceptor(@NonNull String str, @NonNull String str2, Bundle bundle, long j10) {
        this.f7392a.y(str, str2, bundle, j10);
    }

    public void performAction(@NonNull Bundle bundle) {
        this.f7392a.e(bundle, false);
    }

    public Bundle performActionWithResponse(@NonNull Bundle bundle) {
        return this.f7392a.e(bundle, true);
    }

    public void registerOnMeasurementEventListener(@NonNull b bVar) {
        this.f7392a.v(bVar);
    }

    public void setConditionalUserProperty(@NonNull Bundle bundle) {
        this.f7392a.A(bundle);
    }

    @Deprecated
    public void setConsent(@NonNull Bundle bundle) {
    }

    public void setCurrentScreen(@NonNull Activity activity, String str, String str2) {
        this.f7392a.D(j2.a(activity), str, str2);
    }

    public void setEventInterceptor(@NonNull a aVar) {
        this.f7392a.u(aVar);
    }

    @Deprecated
    public void setMeasurementEnabled(Boolean bool) {
    }

    public void setUserProperty(@NonNull String str, @NonNull String str2, @NonNull Object obj) {
        this.f7392a.z(str, str2, obj, true);
    }

    public void unregisterOnMeasurementEventListener(@NonNull b bVar) {
        this.f7392a.w(bVar);
    }

    public final void zza(boolean z10) {
        this.f7392a.h(z10);
    }

    @Deprecated
    public void setMeasurementEnabled(boolean z10) {
    }

    @NonNull
    @Deprecated
    public static AppMeasurementSdk getInstance(@NonNull Context context, @NonNull String str, @NonNull String str2, String str3, @NonNull Bundle bundle) {
        return z3.r(context, bundle).s();
    }
}
