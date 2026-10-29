package yl;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.util.Log;
import androidx.annotation.NonNull;
import com.roblox.universalapp.messagebus.MessageBus;
import gk.r;
import java.lang.ref.WeakReference;
import java.util.Optional;
import mm.i;
import mm.l;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MessageBus f35902a;
    public final Object b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile b f35903c = new b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Optional<C0660c> f35904d = Optional.empty();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public WeakReference<Context> f35905e = new WeakReference<>(null);

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f35906a = new c(MessageBus.f());
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f35907a = 0;
    }

    /* JADX INFO: renamed from: yl.c$c, reason: collision with other inner class name */
    public class C0660c extends ConnectivityManager.NetworkCallback {
        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(@NonNull Network network) {
            c.this.g(1);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(@NonNull Network network, @NonNull NetworkCapabilities networkCapabilities) {
            c.this.g(r.b(networkCapabilities) ? 1 : 2);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(@NonNull Network network) {
            c.this.g(2);
        }

        public C0660c() {
        }
    }

    public c(MessageBus messageBus) {
        this.f35902a = messageBus;
    }

    public static /* synthetic */ l b(JSONObject jSONObject) {
        l lVar = new l();
        try {
            lVar.f24430a.put("isNetworkStatusAvailable", true);
            return lVar;
        } catch (JSONException e10) {
            Log.e("ConnectivityProtocol", "JSON exception on onIsNetworkStatusAvailable: ", e10);
            return lVar;
        }
    }

    public static JSONObject d(b bVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("networkStatus", bVar.f35907a);
            return jSONObject;
        } catch (JSONException e10) {
            Log.e("ConnectivityProtocol", "JSON exception on get network status: ", e10);
            return jSONObject;
        }
    }

    public static void h(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        connectivityManager.registerDefaultNetworkCallback(networkCallback);
    }

    public static c i() {
        return a.f35906a;
    }

    public static void l(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        connectivityManager.unregisterNetworkCallback(networkCallback);
    }

    public void e() {
        this.f35902a.p("ConnectivityProtocol", "GetNetworkStatus", new i() { // from class: yl.a
            @Override // mm.i
            public final l a(JSONObject jSONObject) {
                return this.f35901a.f(jSONObject);
            }
        });
        this.f35902a.p("ConnectivityProtocol", "IsNetworkStatusAvailable", new i() { // from class: yl.b
            @Override // mm.i
            public final l a(JSONObject jSONObject) {
                return c.b(jSONObject);
            }
        });
    }

    public final /* synthetic */ l f(JSONObject jSONObject) {
        b bVar;
        synchronized (this.b) {
            try {
                Context context = this.f35905e.get();
                if (this.f35903c.f35907a == 0 && context != null) {
                    this.f35903c.f35907a = r.a(context) ? 1 : 2;
                }
                bVar = this.f35903c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        l lVar = new l();
        lVar.f24430a = d(bVar);
        return lVar;
    }

    public final void g(int i10) {
        synchronized (this.b) {
            try {
                if (this.f35903c.f35907a == i10) {
                    return;
                }
                this.f35903c.f35907a = i10;
                b bVar = this.f35903c;
                Log.d("ConnectivityProtocol", "Published network status change with new status: " + bVar.f35907a);
                this.f35902a.l("ConnectivityProtocol.NetworkStatusChanged.Broadcast", d(bVar));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void j(Context context) {
        this.f35905e = new WeakReference<>(context);
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            Log.d("ConnectivityProtocol", "ConnectivityManager unavailable for monitoring");
            g(2);
        } else {
            Optional<C0660c> optionalOf = Optional.of(new C0660c());
            this.f35904d = optionalOf;
            h(connectivityManager, optionalOf.get());
        }
    }

    public void k(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                Log.d("ConnectivityProtocol", "ConnectivityManager unavailable for monitoring clean up");
                synchronized (this.b) {
                    this.f35905e = new WeakReference<>(null);
                    this.f35904d = Optional.empty();
                    this.f35903c = new b();
                }
                return;
            }
            if (this.f35904d.isPresent()) {
                l(connectivityManager, this.f35904d.get());
            }
            synchronized (this.b) {
                this.f35905e = new WeakReference<>(null);
                this.f35904d = Optional.empty();
                this.f35903c = new b();
            }
        } catch (Throwable th2) {
            synchronized (this.b) {
                this.f35905e = new WeakReference<>(null);
                this.f35904d = Optional.empty();
                this.f35903c = new b();
                throw th2;
            }
        }
    }
}
