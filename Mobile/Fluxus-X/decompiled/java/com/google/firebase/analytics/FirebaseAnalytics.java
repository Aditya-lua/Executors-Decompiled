package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import bg.g;
import com.google.android.gms.internal.measurement.j2;
import com.google.android.gms.internal.measurement.z3;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o9.s;
import ob.wa;
import tb.m;

/* JADX INFO: loaded from: classes2.dex */
public final class FirebaseAnalytics {
    public static volatile FirebaseAnalytics b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z3 f8587a;

    public enum a {
        GRANTED,
        DENIED
    }

    public enum b {
        AD_STORAGE,
        ANALYTICS_STORAGE,
        AD_USER_DATA,
        AD_PERSONALIZATION
    }

    public FirebaseAnalytics(z3 z3Var) {
        s.l(z3Var);
        this.f8587a = z3Var;
    }

    @NonNull
    @Keep
    public static FirebaseAnalytics getInstance(@NonNull Context context) {
        if (b == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (b == null) {
                        b = new FirebaseAnalytics(z3.r(context, null));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return b;
    }

    @Keep
    public static wa getScionFrontendApiImplementation(Context context, Bundle bundle) {
        z3 z3VarR = z3.r(context, bundle);
        if (z3VarR == null) {
            return null;
        }
        return new jf.a(z3VarR);
    }

    public void a(boolean z10) {
        this.f8587a.E(Boolean.valueOf(z10));
    }

    public void b(@NonNull Map<b, a> map) {
        Bundle bundle = new Bundle();
        a aVar = map.get(b.AD_STORAGE);
        if (aVar != null) {
            int iOrdinal = aVar.ordinal();
            if (iOrdinal == 0) {
                bundle.putString("ad_storage", "granted");
            } else if (iOrdinal == 1) {
                bundle.putString("ad_storage", "denied");
            }
        }
        a aVar2 = map.get(b.ANALYTICS_STORAGE);
        if (aVar2 != null) {
            int iOrdinal2 = aVar2.ordinal();
            if (iOrdinal2 == 0) {
                bundle.putString("analytics_storage", "granted");
            } else if (iOrdinal2 == 1) {
                bundle.putString("analytics_storage", "denied");
            }
        }
        a aVar3 = map.get(b.AD_USER_DATA);
        if (aVar3 != null) {
            int iOrdinal3 = aVar3.ordinal();
            if (iOrdinal3 == 0) {
                bundle.putString("ad_user_data", "granted");
            } else if (iOrdinal3 == 1) {
                bundle.putString("ad_user_data", "denied");
            }
        }
        a aVar4 = map.get(b.AD_PERSONALIZATION);
        if (aVar4 != null) {
            int iOrdinal4 = aVar4.ordinal();
            if (iOrdinal4 == 0) {
                bundle.putString("ad_personalization", "granted");
            } else if (iOrdinal4 == 1) {
                bundle.putString("ad_personalization", "denied");
            }
        }
        this.f8587a.F(bundle);
    }

    @NonNull
    @Keep
    public String getFirebaseInstanceId() {
        try {
            return (String) m.b(g.p().getId(), 30000L, TimeUnit.MILLISECONDS);
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
        this.f8587a.D(j2.a(activity), str, str2);
    }
}
