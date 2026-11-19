package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.measurement.h2;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import nb.a;
import nb.b;
import nb.c;
import o9.s;
import ob.l7;
import ob.r8;
import ob.wa;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class AppMeasurement {
    public static volatile AppMeasurement b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f7388a;

    public static class ConditionalUserProperty {

        @Keep
        public boolean mActive;

        @NonNull
        @Keep
        public String mAppId;

        @Keep
        public long mCreationTimestamp;

        @NonNull
        @Keep
        public String mExpiredEventName;

        @NonNull
        @Keep
        public Bundle mExpiredEventParams;

        @NonNull
        @Keep
        public String mName;

        @NonNull
        @Keep
        public String mOrigin;

        @Keep
        public long mTimeToLive;

        @NonNull
        @Keep
        public String mTimedOutEventName;

        @NonNull
        @Keep
        public Bundle mTimedOutEventParams;

        @NonNull
        @Keep
        public String mTriggerEventName;

        @Keep
        public long mTriggerTimeout;

        @NonNull
        @Keep
        public String mTriggeredEventName;

        @NonNull
        @Keep
        public Bundle mTriggeredEventParams;

        @Keep
        public long mTriggeredTimestamp;

        @NonNull
        @Keep
        public Object mValue;

        public ConditionalUserProperty() {
        }

        public ConditionalUserProperty(@NonNull Bundle bundle) {
            s.l(bundle);
            this.mAppId = (String) r8.b(bundle, "app_id", String.class, null);
            this.mOrigin = (String) r8.b(bundle, "origin", String.class, null);
            this.mName = (String) r8.b(bundle, "name", String.class, null);
            this.mValue = r8.b(bundle, "value", Object.class, null);
            this.mTriggerEventName = (String) r8.b(bundle, "trigger_event_name", String.class, null);
            this.mTriggerTimeout = ((Long) r8.b(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            this.mTimedOutEventName = (String) r8.b(bundle, "timed_out_event_name", String.class, null);
            this.mTimedOutEventParams = (Bundle) r8.b(bundle, "timed_out_event_params", Bundle.class, null);
            this.mTriggeredEventName = (String) r8.b(bundle, "triggered_event_name", String.class, null);
            this.mTriggeredEventParams = (Bundle) r8.b(bundle, "triggered_event_params", Bundle.class, null);
            this.mTimeToLive = ((Long) r8.b(bundle, "time_to_live", Long.class, 0L)).longValue();
            this.mExpiredEventName = (String) r8.b(bundle, "expired_event_name", String.class, null);
            this.mExpiredEventParams = (Bundle) r8.b(bundle, "expired_event_params", Bundle.class, null);
            this.mActive = ((Boolean) r8.b(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            this.mCreationTimestamp = ((Long) r8.b(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) r8.b(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
        }
    }

    public AppMeasurement(l7 l7Var) {
        this.f7388a = new a(l7Var);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @NonNull
    @Keep
    @Deprecated
    public static AppMeasurement getInstance(@NonNull Context context) {
        if (b == null) {
            synchronized (AppMeasurement.class) {
                if (b == null) {
                    wa waVar = (wa) FirebaseAnalytics.class.getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
                    if (waVar != null) {
                        b = new AppMeasurement(waVar);
                    } else {
                        b = new AppMeasurement(l7.O(context, new h2(0L, 0L, true, null, null), null));
                    }
                }
            }
        }
        return b;
    }

    @Keep
    public void beginAdUnitExposure(@NonNull String str) {
        this.f7388a.h(str);
    }

    @Keep
    public void clearConditionalUserProperty(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle) {
        this.f7388a.k(str, str2, bundle);
    }

    @Keep
    public void endAdUnitExposure(@NonNull String str) {
        this.f7388a.c(str);
    }

    @Keep
    public long generateEventId() {
        return this.f7388a.f();
    }

    @NonNull
    @Keep
    public String getAppInstanceId() {
        return this.f7388a.e();
    }

    @NonNull
    @Keep
    public List<ConditionalUserProperty> getConditionalUserProperties(@NonNull String str, @NonNull String str2) {
        List listL = this.f7388a.l(str, str2);
        ArrayList arrayList = new ArrayList(listL == null ? 0 : listL.size());
        Iterator it = listL.iterator();
        while (it.hasNext()) {
            arrayList.add(new ConditionalUserProperty((Bundle) it.next()));
        }
        return arrayList;
    }

    @NonNull
    @Keep
    public String getCurrentScreenClass() {
        return this.f7388a.d();
    }

    @NonNull
    @Keep
    public String getCurrentScreenName() {
        return this.f7388a.zzh();
    }

    @NonNull
    @Keep
    public String getGmpAppId() {
        return this.f7388a.g();
    }

    @Keep
    public int getMaxUserProperties(@NonNull String str) {
        return this.f7388a.i(str);
    }

    @NonNull
    @Keep
    public Map<String, Object> getUserProperties(@NonNull String str, @NonNull String str2, boolean z10) {
        return this.f7388a.j(str, str2, z10);
    }

    @Keep
    public void logEventInternal(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle) {
        this.f7388a.a(str, str2, bundle);
    }

    @Keep
    public void setConditionalUserProperty(@NonNull ConditionalUserProperty conditionalUserProperty) {
        s.l(conditionalUserProperty);
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString("origin", str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString("name", str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            r8.a(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString("trigger_event_name", str4);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString("timed_out_event_name", str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString("triggered_event_name", str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString("expired_event_name", str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        c cVar = this.f7388a;
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean("active", conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        cVar.b(bundle);
    }

    public AppMeasurement(wa waVar) {
        this.f7388a = new b(waVar);
    }
}
