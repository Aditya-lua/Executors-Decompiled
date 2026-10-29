package p416rl;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import com.roblox.universalapp.messagebus.Callback;
import com.roblox.universalapp.messagebus.Connection;
import com.roblox.universalapp.messagebus.MessageBus;
import org.json.JSONException;
import org.json.JSONObject;
import p311nm.C9494a;

/* JADX INFO: renamed from: rl.p */
/* JADX INFO: loaded from: classes2.dex */
public class C10908p {

    /* JADX INFO: renamed from: a */
    public C10909q f38671a;

    /* JADX INFO: renamed from: b */
    public C10910r f38672b;

    /* JADX INFO: renamed from: c */
    public Connection f38673c;

    /* JADX INFO: renamed from: d */
    public Connection f38674d;

    /* JADX INFO: renamed from: e */
    public Application.ActivityLifecycleCallbacks f38675e;

    /* JADX INFO: renamed from: rl.p$a */
    public class a implements Application.ActivityLifecycleCallbacks {
        public a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@NonNull Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@NonNull Activity activity) {
            C10908p.this.m41478f();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@NonNull Activity activity) {
        }
    }

    /* JADX INFO: renamed from: rl.p$b */
    public enum b {
        ACTIVE,
        INACTIVE,
        PAUSED
    }

    public C10908p(MessageBus messageBus) {
        this.f38673c = messageBus.m16030t(C9494a.m37401n(), new Callback() { // from class: rl.n
            @Override // com.roblox.universalapp.messagebus.Callback
            /* JADX INFO: renamed from: a */
            public final void mo7492a(JSONObject jSONObject) {
                this.f38669a.m41476d(jSONObject);
            }
        });
        this.f38674d = messageBus.m16030t("ConnectivityProtocol.NetworkStatusChanged.Broadcast", new Callback() { // from class: rl.o
            @Override // com.roblox.universalapp.messagebus.Callback
            /* JADX INFO: renamed from: a */
            public final void mo7492a(JSONObject jSONObject) {
                this.f38670a.m41477e(jSONObject);
            }
        });
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m41476d(JSONObject jSONObject) {
        try {
            String string = jSONObject.getString(C9494a.m37399l());
            switch (string.hashCode()) {
                case -2132901938:
                    if (string.equals("stopDiscovery")) {
                        this.f38671a.m41492k();
                    }
                    break;
                case -688395069:
                    if (string.equals("startAdvertisement")) {
                        this.f38672b.m41500h();
                    }
                    break;
                case -475549842:
                    if (string.equals("startDiscovery")) {
                        this.f38671a.m41491j();
                    }
                    break;
                case 488548045:
                    if (string.equals("requestConnection")) {
                        this.f38671a.m41488g(jSONObject.getString(C9494a.m37394g()), jSONObject.getString(C9494a.m37390c()), jSONObject.getString(C9494a.m37388a()));
                    }
                    break;
                case 1636797731:
                    if (string.equals("stopAdvertisement")) {
                        this.f38672b.m41501i();
                    }
                    break;
                default:
                    break;
            }
        } catch (JSONException e10) {
            Log.e("MagicLoginManager", "JSONException while handling MagicLogin request: " + e10.toString());
        }
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m41477e(JSONObject jSONObject) {
        try {
            int i10 = jSONObject.getInt("networkStatus");
            if (i10 != 1) {
                if (i10 != 2) {
                    return;
                }
                m41478f();
                return;
            }
            C10909q c10909q = this.f38671a;
            if (c10909q != null) {
                c10909q.m41489h();
            }
            C10910r c10910r = this.f38672b;
            if (c10910r != null) {
                c10910r.m41498f();
            }
        } catch (JSONException e10) {
            Log.e("MagicLoginManager", "JSONException while handling MagicLoginNetwork request: " + e10.toString());
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m41478f() {
        C10909q c10909q = this.f38671a;
        if (c10909q != null) {
            c10909q.m41487f();
        }
        C10910r c10910r = this.f38672b;
        if (c10910r != null) {
            c10910r.m41496d();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m41479g(Application application) {
        a aVar = new a();
        this.f38675e = aVar;
        application.registerActivityLifecycleCallbacks(aVar);
    }

    /* JADX INFO: renamed from: h */
    public void m41480h(Application application) {
        if (this.f38671a == null) {
            this.f38671a = new C10909q(application);
        }
        if (this.f38672b == null) {
            this.f38672b = new C10910r(application);
        }
        if (this.f38675e == null) {
            m41479g(application);
        }
    }
}
