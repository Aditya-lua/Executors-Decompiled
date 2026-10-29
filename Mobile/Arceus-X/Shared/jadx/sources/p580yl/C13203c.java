package p580yl;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.util.Log;
import androidx.annotation.NonNull;
import com.roblox.universalapp.messagebus.MessageBus;
import java.lang.ref.WeakReference;
import java.util.Optional;
import mm.C8595l;
import mm.InterfaceC8592i;
import org.json.JSONException;
import org.json.JSONObject;
import p151gk.C6126s;

/* JADX INFO: renamed from: yl.c */
/* JADX INFO: loaded from: classes2.dex */
public class C13203c {

    /* JADX INFO: renamed from: a */
    public final MessageBus f46477a;

    /* JADX INFO: renamed from: b */
    public final Object f46478b = new Object();

    /* JADX INFO: renamed from: c */
    public volatile b f46479c = new b();

    /* JADX INFO: renamed from: d */
    public Optional<c> f46480d = Optional.empty();

    /* JADX INFO: renamed from: e */
    public WeakReference<Context> f46481e = new WeakReference<>(null);

    /* JADX INFO: renamed from: yl.c$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public static final C13203c f46482a = new C13203c(MessageBus.m16016f());
    }

    /* JADX INFO: renamed from: yl.c$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public int f46483a = 0;
    }

    /* JADX INFO: renamed from: yl.c$c */
    public class c extends ConnectivityManager.NetworkCallback {
        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(@NonNull Network network) {
            C13203c.this.m48831g(1);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(@NonNull Network network, @NonNull NetworkCapabilities networkCapabilities) {
            C13203c.this.m48831g(C6126s.m27084b(networkCapabilities) ? 1 : 2);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(@NonNull Network network) {
            C13203c.this.m48831g(2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public c() {
        }
    }

    public C13203c(MessageBus messageBus) {
        this.f46477a = messageBus;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C8595l m48823b(JSONObject jSONObject) {
        C8595l c8595l = new C8595l();
        try {
            c8595l.f31556a.put("isNetworkStatusAvailable", true);
            return c8595l;
        } catch (JSONException e10) {
            Log.e("ConnectivityProtocol", "JSON exception on onIsNetworkStatusAvailable: ", e10);
            return c8595l;
        }
    }

    /* JADX INFO: renamed from: d */
    public static JSONObject m48825d(b bVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("networkStatus", bVar.f46483a);
            return jSONObject;
        } catch (JSONException e10) {
            Log.e("ConnectivityProtocol", "JSON exception on get network status: ", e10);
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m48826h(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        connectivityManager.registerDefaultNetworkCallback(networkCallback);
    }

    /* JADX INFO: renamed from: i */
    public static C13203c m48827i() {
        return a.f46482a;
    }

    /* JADX INFO: renamed from: l */
    public static void m48828l(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        connectivityManager.unregisterNetworkCallback(networkCallback);
    }

    /* JADX INFO: renamed from: e */
    public void m48829e() {
        this.f46477a.m16026p("ConnectivityProtocol", "GetNetworkStatus", new InterfaceC8592i() { // from class: yl.a
            @Override // mm.InterfaceC8592i
            /* JADX INFO: renamed from: a */
            public final C8595l mo15880a(JSONObject jSONObject) {
                return this.f46476a.m48830f(jSONObject);
            }
        });
        this.f46477a.m16026p("ConnectivityProtocol", "IsNetworkStatusAvailable", new InterfaceC8592i() { // from class: yl.b
            @Override // mm.InterfaceC8592i
            /* JADX INFO: renamed from: a */
            public final C8595l mo15880a(JSONObject jSONObject) {
                return C13203c.m48823b(jSONObject);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C8595l m48830f(JSONObject jSONObject) {
        b bVar;
        synchronized (this.f46478b) {
            try {
                Context context = this.f46481e.get();
                if (this.f46479c.f46483a == 0 && context != null) {
                    this.f46479c.f46483a = C6126s.m27083a(context) ? 1 : 2;
                }
                bVar = this.f46479c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        C8595l c8595l = new C8595l();
        c8595l.f31556a = m48825d(bVar);
        return c8595l;
    }

    /* JADX INFO: renamed from: g */
    public final void m48831g(int i10) {
        synchronized (this.f46478b) {
            try {
                if (this.f46479c.f46483a == i10) {
                    return;
                }
                this.f46479c.f46483a = i10;
                b bVar = this.f46479c;
                Log.d("ConnectivityProtocol", "Published network status change with new status: " + bVar.f46483a);
                this.f46477a.m16024l("ConnectivityProtocol.NetworkStatusChanged.Broadcast", m48825d(bVar));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public void m48832j(Context context) {
        this.f46481e = new WeakReference<>(context);
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            Log.d("ConnectivityProtocol", "ConnectivityManager unavailable for monitoring");
            m48831g(2);
        } else {
            Optional<c> optionalOf = Optional.of(new c());
            this.f46480d = optionalOf;
            m48826h(connectivityManager, optionalOf.get());
        }
    }

    /* JADX INFO: renamed from: k */
    public void m48833k(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                Log.d("ConnectivityProtocol", "ConnectivityManager unavailable for monitoring clean up");
                synchronized (this.f46478b) {
                    this.f46481e = new WeakReference<>(null);
                    this.f46480d = Optional.empty();
                    this.f46479c = new b();
                }
                return;
            }
            if (this.f46480d.isPresent()) {
                m48828l(connectivityManager, this.f46480d.get());
            }
            synchronized (this.f46478b) {
                this.f46481e = new WeakReference<>(null);
                this.f46480d = Optional.empty();
                this.f46479c = new b();
            }
        } catch (Throwable th2) {
            synchronized (this.f46478b) {
                this.f46481e = new WeakReference<>(null);
                this.f46480d = Optional.empty();
                this.f46479c = new b();
                throw th2;
            }
        }
    }
}
