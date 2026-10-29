package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.measurement.v3;
import com.google.android.gms.internal.measurement.zzdf;
import ff.a;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import n9.m;
import nb.ra;
import yf.g;

/* JADX INFO: loaded from: classes2.dex */
public final class FirebaseAnalytics {
    public static volatile FirebaseAnalytics b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v3 f8673a;

    public FirebaseAnalytics(v3 v3Var) {
        m.l(v3Var);
        this.f8673a = v3Var;
    }

    @NonNull
    @Keep
    public static FirebaseAnalytics getInstance(@NonNull Context context) {
        if (b == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (b == null) {
                        b = new FirebaseAnalytics(v3.r(context, null));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return b;
    }

    @Keep
    public static ra getScionFrontendApiImplementation(Context context, Bundle bundle) {
        v3 v3VarR = v3.r(context, bundle);
        if (v3VarR == null) {
            return null;
        }
        return new a(v3VarR);
    }

    @NonNull
    @Keep
    public String getFirebaseInstanceId() {
        try {
            return (String) sb.m.b(g.p().getId(), 30000L, TimeUnit.MILLISECONDS);
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
        this.f8673a.D(zzdf.a(activity), str, str2);
    }
}
