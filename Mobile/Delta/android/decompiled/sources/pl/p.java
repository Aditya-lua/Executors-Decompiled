package pl;

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

/* JADX INFO: loaded from: classes2.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q f28746a;
    public r b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Connection f28747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Connection f28748d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Application.ActivityLifecycleCallbacks f28749e;

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
            p.this.f();
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

    public enum b {
        ACTIVE,
        INACTIVE,
        PAUSED
    }

    public p(MessageBus messageBus) {
        this.f28747c = messageBus.t(lm.a.n(), new Callback() { // from class: pl.n
            @Override // com.roblox.universalapp.messagebus.Callback
            public final void a(JSONObject jSONObject) {
                this.f28744a.d(jSONObject);
            }
        });
        this.f28748d = messageBus.t("ConnectivityProtocol.NetworkStatusChanged.Broadcast", new Callback() { // from class: pl.o
            @Override // com.roblox.universalapp.messagebus.Callback
            public final void a(JSONObject jSONObject) {
                this.f28745a.e(jSONObject);
            }
        });
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final /* synthetic */ void d(JSONObject jSONObject) {
        try {
            String string = jSONObject.getString(lm.a.l());
            switch (string.hashCode()) {
                case -2132901938:
                    if (string.equals("stopDiscovery")) {
                        this.f28746a.k();
                    }
                    break;
                case -688395069:
                    if (string.equals("startAdvertisement")) {
                        this.b.h();
                    }
                    break;
                case -475549842:
                    if (string.equals("startDiscovery")) {
                        this.f28746a.j();
                    }
                    break;
                case 488548045:
                    if (string.equals("requestConnection")) {
                        this.f28746a.g(jSONObject.getString(lm.a.g()), jSONObject.getString(lm.a.c()), jSONObject.getString(lm.a.a()));
                    }
                    break;
                case 1636797731:
                    if (string.equals("stopAdvertisement")) {
                        this.b.i();
                    }
                    break;
                default:
                    break;
            }
        } catch (JSONException e10) {
            Log.e("MagicLoginManager", "JSONException while handling MagicLogin request: " + e10.toString());
        }
    }

    public final /* synthetic */ void e(JSONObject jSONObject) {
        try {
            int i10 = jSONObject.getInt("networkStatus");
            if (i10 != 1) {
                if (i10 != 2) {
                    return;
                }
                f();
                return;
            }
            q qVar = this.f28746a;
            if (qVar != null) {
                qVar.h();
            }
            r rVar = this.b;
            if (rVar != null) {
                rVar.f();
            }
        } catch (JSONException e10) {
            Log.e("MagicLoginManager", "JSONException while handling MagicLoginNetwork request: " + e10.toString());
        }
    }

    public final void f() {
        q qVar = this.f28746a;
        if (qVar != null) {
            qVar.f();
        }
        r rVar = this.b;
        if (rVar != null) {
            rVar.d();
        }
    }

    public final void g(Application application) {
        a aVar = new a();
        this.f28749e = aVar;
        application.registerActivityLifecycleCallbacks(aVar);
    }

    public void h(Application application) {
        if (this.f28746a == null) {
            this.f28746a = new q(application);
        }
        if (this.b == null) {
            this.b = new r(application);
        }
        if (this.f28749e == null) {
            g(application);
        }
    }
}
