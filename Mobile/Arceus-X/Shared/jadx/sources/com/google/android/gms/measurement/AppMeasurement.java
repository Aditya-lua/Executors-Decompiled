package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p291mb.AbstractC8483c;
import p291mb.C8481a;
import p291mb.C8482b;
import p305n9.C8953m;
import p306nb.C9094g7;
import p306nb.C9191m8;
import p306nb.InterfaceC9273ra;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class AppMeasurement {

    /* JADX INFO: renamed from: b */
    public static volatile AppMeasurement f9478b;

    /* JADX INFO: renamed from: a */
    public final AbstractC8483c f9479a;

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

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public ConditionalUserProperty() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public ConditionalUserProperty(@NonNull Bundle bundle) {
            C8953m.m36047l(bundle);
            this.mAppId = (String) C9191m8.m36480b(bundle, "app_id", String.class, null);
            this.mOrigin = (String) C9191m8.m36480b(bundle, "origin", String.class, null);
            this.mName = (String) C9191m8.m36480b(bundle, "name", String.class, null);
            this.mValue = C9191m8.m36480b(bundle, "value", Object.class, null);
            this.mTriggerEventName = (String) C9191m8.m36480b(bundle, "trigger_event_name", String.class, null);
            this.mTriggerTimeout = ((Long) C9191m8.m36480b(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            this.mTimedOutEventName = (String) C9191m8.m36480b(bundle, "timed_out_event_name", String.class, null);
            this.mTimedOutEventParams = (Bundle) C9191m8.m36480b(bundle, "timed_out_event_params", Bundle.class, null);
            this.mTriggeredEventName = (String) C9191m8.m36480b(bundle, "triggered_event_name", String.class, null);
            this.mTriggeredEventParams = (Bundle) C9191m8.m36480b(bundle, "triggered_event_params", Bundle.class, null);
            this.mTimeToLive = ((Long) C9191m8.m36480b(bundle, "time_to_live", Long.class, 0L)).longValue();
            this.mExpiredEventName = (String) C9191m8.m36480b(bundle, "expired_event_name", String.class, null);
            this.mExpiredEventParams = (Bundle) C9191m8.m36480b(bundle, "expired_event_params", Bundle.class, null);
            this.mActive = ((Boolean) C9191m8.m36480b(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            this.mCreationTimestamp = ((Long) C9191m8.m36480b(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) C9191m8.m36480b(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AppMeasurement(C9094g7 c9094g7) {
        this.f9479a = new C8481a(c9094g7);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @NonNull
    @Keep
    @Deprecated
    public static AppMeasurement getInstance(@NonNull Context context) {
        if (f9478b == null) {
            synchronized (AppMeasurement.class) {
                if (f9478b == null) {
                    InterfaceC9273ra interfaceC9273ra = (InterfaceC9273ra) FirebaseAnalytics.class.getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
                    if (interfaceC9273ra != null) {
                        f9478b = new AppMeasurement(interfaceC9273ra);
                    } else {
                        f9478b = new AppMeasurement(C9094g7.m36300O(context, new zzdd(0L, 0L, true, null, null), null));
                    }
                }
            }
        }
        return f9478b;
    }

    @Keep
    public void beginAdUnitExposure(@NonNull String str) {
        this.f9479a.mo26965h(str);
    }

    @Keep
    public void clearConditionalUserProperty(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle) {
        this.f9479a.mo26968k(str, str2, bundle);
    }

    @Keep
    public void endAdUnitExposure(@NonNull String str) {
        this.f9479a.mo26960c(str);
    }

    @Keep
    public long generateEventId() {
        return this.f9479a.mo26963f();
    }

    @NonNull
    @Keep
    public String getAppInstanceId() {
        return this.f9479a.mo26962e();
    }

    @NonNull
    @Keep
    public List<ConditionalUserProperty> getConditionalUserProperties(@NonNull String str, @NonNull String str2) {
        List listMo26969l = this.f9479a.mo26969l(str, str2);
        ArrayList arrayList = new ArrayList(listMo26969l == null ? 0 : listMo26969l.size());
        Iterator it = listMo26969l.iterator();
        while (it.hasNext()) {
            arrayList.add(new ConditionalUserProperty((Bundle) it.next()));
        }
        return arrayList;
    }

    @NonNull
    @Keep
    public String getCurrentScreenClass() {
        return this.f9479a.mo26961d();
    }

    @NonNull
    @Keep
    public String getCurrentScreenName() {
        return this.f9479a.zzh();
    }

    @NonNull
    @Keep
    public String getGmpAppId() {
        return this.f9479a.mo26964g();
    }

    @Keep
    public int getMaxUserProperties(@NonNull String str) {
        return this.f9479a.mo26966i(str);
    }

    @NonNull
    @Keep
    public Map<String, Object> getUserProperties(@NonNull String str, @NonNull String str2, boolean z10) {
        return this.f9479a.mo26967j(str, str2, z10);
    }

    @Keep
    public void logEventInternal(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle) {
        this.f9479a.mo26958a(str, str2, bundle);
    }

    @Keep
    public void setConditionalUserProperty(@NonNull ConditionalUserProperty conditionalUserProperty) {
        C8953m.m36047l(conditionalUserProperty);
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
            C9191m8.m36479a(bundle, obj);
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
        AbstractC8483c abstractC8483c = this.f9479a;
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean("active", conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        abstractC8483c.mo26959b(bundle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public AppMeasurement(InterfaceC9273ra interfaceC9273ra) {
        this.f9479a = new C8482b(interfaceC9273ra);
    }
}
