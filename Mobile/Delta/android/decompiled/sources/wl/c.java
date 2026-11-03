package wl;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.util.Log;
import androidx.annotation.NonNull;
import com.roblox.universalapp.messagebus.MessageBus;
import ek.s;
import java.lang.ref.WeakReference;
import java.util.Optional;
import km.i;
import km.l;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MessageBus f34531a;
    public final Object b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile b f34532c = new b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Optional<C0635c> f34533d = Optional.empty();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public WeakReference<Context> f34534e = new WeakReference<>(null);

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f34535a = new c(MessageBus.f());
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f34536a = 0;
    }

    /* JADX INFO: renamed from: wl.c$c, reason: collision with other inner class name */
    public class C0635c extends ConnectivityManager.NetworkCallback {
        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(@NonNull Network network) {
            c.this.g(1);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(@NonNull Network network, @NonNull NetworkCapabilities networkCapabilities) {
            c.this.g(s.b(networkCapabilities) ? 1 : 2);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(@NonNull Network network) {
            c.this.g(2);
        }

        public C0635c() {
        }
    }

    public c(MessageBus messageBus) {
        this.f34531a = messageBus;
    }

    public static /* synthetic */ l b(JSONObject jSONObject) {
        l lVar = new l();
        try {
            lVar.f22909a.put("isNetworkStatusAvailable", true);
            return lVar;
        } catch (JSONException e10) {
            Log.e("ConnectivityProtocol", "JSON exception on onIsNetworkStatusAvailable: ", e10);
            return lVar;
        }
    }

    public static JSONObject d(b bVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("networkStatus", bVar.f34536a);
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
        return a.f34535a;
    }

    public static void l(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        connectivityManager.unregisterNetworkCallback(networkCallback);
    }

    public void e() {
        this.f34531a.p("ConnectivityProtocol", "GetNetworkStatus", new i() { // from class: wl.a
            @Override // km.i
            public final l a(JSONObject jSONObject) {
                return this.f34530a.f(jSONObject);
            }
        });
        this.f34531a.p("ConnectivityProtocol", "IsNetworkStatusAvailable", new i() { // from class: wl.b
            @Override // km.i
            public final l a(JSONObject jSONObject) {
                return c.b(jSONObject);
            }
        });
    }

    public final /* synthetic */ l f(JSONObject jSONObject) {
        b bVar;
        synchronized (this.b) {
            try {
                Context context = this.f34534e.get();
                if (this.f34532c.f34536a == 0 && context != null) {
                    this.f34532c.f34536a = s.a(context) ? 1 : 2;
                }
                bVar = this.f34532c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        l lVar = new l();
        lVar.f22909a = d(bVar);
        return lVar;
    }

    public final void g(int i10) {
        synchronized (this.b) {
            try {
                if (this.f34532c.f34536a == i10) {
                    return;
                }
                this.f34532c.f34536a = i10;
                b bVar = this.f34532c;
                Log.d("ConnectivityProtocol", "Published network status change with new status: " + bVar.f34536a);
                this.f34531a.l("ConnectivityProtocol.NetworkStatusChanged.Broadcast", d(bVar));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void j(Context context) {
        this.f34534e = new WeakReference<>(context);
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            Log.d("ConnectivityProtocol", "ConnectivityManager unavailable for monitoring");
            g(2);
        } else {
            Optional<C0635c> optionalOf = Optional.of(new C0635c());
            this.f34533d = optionalOf;
            h(connectivityManager, optionalOf.get());
        }
    }

    public void k(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                Log.d("ConnectivityProtocol", "ConnectivityManager unavailable for monitoring clean up");
                synchronized (this.b) {
                    this.f34534e = new WeakReference<>(null);
                    this.f34533d = Optional.empty();
                    this.f34532c = new b();
                }
                return;
            }
            if (this.f34533d.isPresent()) {
                l(connectivityManager, this.f34533d.get());
            }
            synchronized (this.b) {
                this.f34534e = new WeakReference<>(null);
                this.f34533d = Optional.empty();
                this.f34532c = new b();
            }
        } catch (Throwable th2) {
            synchronized (this.b) {
                this.f34534e = new WeakReference<>(null);
                this.f34533d = Optional.empty();
                this.f34532c = new b();
                throw th2;
            }
        }
    }
}
