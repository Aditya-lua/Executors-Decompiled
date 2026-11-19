package mm;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.util.Log;
import androidx.annotation.NonNull;
import com.roblox.universalapp.messagebus.MessageBus;
import com.roblox.universalapp.messagebus.RequestHandler;
import com.roblox.universalapp.messagebus.Response;
import java.lang.ref.WeakReference;
import java.util.Optional;
import ok.s;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MessageBus f23322a;
    public final Object b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile b f23323c = new b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Optional<C0455c> f23324d = Optional.empty();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public WeakReference<Context> f23325e = new WeakReference<>(null);

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f23326a = new c(MessageBus.getInstance());
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f23327a = 0;
    }

    /* JADX INFO: renamed from: mm.c$c, reason: collision with other inner class name */
    public class C0455c extends ConnectivityManager.NetworkCallback {
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

        public C0455c() {
        }
    }

    public c(MessageBus messageBus) {
        this.f23322a = messageBus;
    }

    public static /* synthetic */ Response b(JSONObject jSONObject) {
        Response response = new Response();
        try {
            response.params.put("isNetworkStatusAvailable", true);
            return response;
        } catch (JSONException e10) {
            Log.e("ConnectivityProtocol", "JSON exception on onIsNetworkStatusAvailable: ", e10);
            return response;
        }
    }

    public static JSONObject d(b bVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("networkStatus", bVar.f23327a);
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
        return a.f23326a;
    }

    public static void l(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        connectivityManager.unregisterNetworkCallback(networkCallback);
    }

    public void e() {
        this.f23322a.setRequestHandler("ConnectivityProtocol", "GetNetworkStatus", new RequestHandler() { // from class: mm.a
            @Override // com.roblox.universalapp.messagebus.RequestHandler
            public final Response run(JSONObject jSONObject) {
                return this.f23321a.f(jSONObject);
            }
        });
        this.f23322a.setRequestHandler("ConnectivityProtocol", "IsNetworkStatusAvailable", new RequestHandler() { // from class: mm.b
            @Override // com.roblox.universalapp.messagebus.RequestHandler
            public final Response run(JSONObject jSONObject) {
                return c.b(jSONObject);
            }
        });
    }

    public final /* synthetic */ Response f(JSONObject jSONObject) {
        b bVar;
        synchronized (this.b) {
            try {
                Context context = this.f23325e.get();
                if (this.f23323c.f23327a == 0 && context != null) {
                    this.f23323c.f23327a = s.a(context) ? 1 : 2;
                }
                bVar = this.f23323c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Response response = new Response();
        response.params = d(bVar);
        return response;
    }

    public final void g(int i10) {
        synchronized (this.b) {
            try {
                if (this.f23323c.f23327a == i10) {
                    return;
                }
                this.f23323c.f23327a = i10;
                b bVar = this.f23323c;
                Log.d("ConnectivityProtocol", "Published network status change with new status: " + bVar.f23327a);
                this.f23322a.publish("ConnectivityProtocol.NetworkStatusChanged.Broadcast", d(bVar));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void j(Context context) {
        this.f23325e = new WeakReference<>(context);
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            Log.d("ConnectivityProtocol", "ConnectivityManager unavailable for monitoring");
            g(2);
        } else {
            Optional<C0455c> optionalOf = Optional.of(new C0455c());
            this.f23324d = optionalOf;
            h(connectivityManager, optionalOf.get());
        }
    }

    public void k(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                Log.d("ConnectivityProtocol", "ConnectivityManager unavailable for monitoring clean up");
                synchronized (this.b) {
                    this.f23325e = new WeakReference<>(null);
                    this.f23324d = Optional.empty();
                    this.f23323c = new b();
                }
                return;
            }
            if (this.f23324d.isPresent()) {
                l(connectivityManager, this.f23324d.get());
            }
            synchronized (this.b) {
                this.f23325e = new WeakReference<>(null);
                this.f23324d = Optional.empty();
                this.f23323c = new b();
            }
        } catch (Throwable th2) {
            synchronized (this.b) {
                this.f23325e = new WeakReference<>(null);
                this.f23324d = Optional.empty();
                this.f23323c = new b();
                throw th2;
            }
        }
    }
}
