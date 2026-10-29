package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.measurement.C2349v3;
import com.google.android.gms.internal.measurement.zzdf;
import gf.C6092a;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p305n9.C8953m;
import p306nb.InterfaceC9273ra;
import p603zf.C13800g;
import sb.C11268m;

/* JADX INFO: loaded from: classes2.dex */
public final class FirebaseAnalytics {

    /* JADX INFO: renamed from: b */
    public static volatile FirebaseAnalytics f11159b;

    /* JADX INFO: renamed from: a */
    public final C2349v3 f11160a;

    public FirebaseAnalytics(C2349v3 c2349v3) {
        C8953m.m36047l(c2349v3);
        this.f11160a = c2349v3;
    }

    @NonNull
    @Keep
    public static FirebaseAnalytics getInstance(@NonNull Context context) {
        if (f11159b == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (f11159b == null) {
                        f11159b = new FirebaseAnalytics(C2349v3.m10791r(context, null));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f11159b;
    }

    @Keep
    public static InterfaceC9273ra getScionFrontendApiImplementation(Context context, Bundle bundle) {
        C2349v3 c2349v3M10791r = C2349v3.m10791r(context, bundle);
        if (c2349v3M10791r == null) {
            return null;
        }
        return new C6092a(c2349v3M10791r);
    }

    @NonNull
    @Keep
    public String getFirebaseInstanceId() {
        try {
            return (String) C11268m.m42332b(C13800g.m50252p().getId(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            throw new IllegalStateException(e10);
        } catch (ExecutionException e11) {
            throw new IllegalStateException(e11.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Keep
    @Deprecated
    public void setCurrentScreen(@NonNull Activity activity, String str, String str2) {
        this.f11160a.m10795D(zzdf.m11161a(activity), str, str2);
    }
}
