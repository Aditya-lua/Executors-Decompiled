package p416rl;

import android.app.Application;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.provider.Settings;
import android.util.Log;
import com.roblox.universalapp.messagebus.MessageBus;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
import p311nm.C9494a;

/* JADX INFO: renamed from: rl.q */
/* JADX INFO: loaded from: classes2.dex */
public class C10909q {

    /* JADX INFO: renamed from: a */
    public final NsdManager f38681a;

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap<String, NsdServiceInfo> f38682b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c */
    public C10908p.b f38683c = C10908p.b.INACTIVE;

    /* JADX INFO: renamed from: d */
    public NsdManager.DiscoveryListener f38684d;

    /* JADX INFO: renamed from: e */
    public final WeakReference<Application> f38685e;

    /* JADX INFO: renamed from: rl.q$a */
    public class a implements NsdManager.DiscoveryListener {

        /* JADX INFO: renamed from: rl.q$a$a, reason: collision with other inner class name */
        public class C14237a implements NsdManager.ResolveListener {
            public C14237a() {
            }

            @Override // android.net.nsd.NsdManager.ResolveListener
            public void onResolveFailed(NsdServiceInfo nsdServiceInfo, int i10) {
                Log.e("MagicLoginNsdHelperClient", "Resolve failed: " + i10);
            }

            @Override // android.net.nsd.NsdManager.ResolveListener
            public void onServiceResolved(NsdServiceInfo nsdServiceInfo) {
                C10909q.this.m41486e(nsdServiceInfo);
            }
        }

        public a() {
        }

        @Override // android.net.nsd.NsdManager.DiscoveryListener
        public void onDiscoveryStarted(String str) {
            C10909q.this.m41490i(C10908p.b.ACTIVE);
        }

        @Override // android.net.nsd.NsdManager.DiscoveryListener
        public void onDiscoveryStopped(String str) {
            C10909q c10909q = C10909q.this;
            if (c10909q.f38683c == C10908p.b.ACTIVE) {
                c10909q.m41490i(C10908p.b.INACTIVE);
            }
        }

        @Override // android.net.nsd.NsdManager.DiscoveryListener
        public void onServiceFound(NsdServiceInfo nsdServiceInfo) {
            if (!nsdServiceInfo.getServiceType().equals("_scpi-raw._tcp.")) {
                Log.i("MagicLoginNsdHelperClient", "onServiceFound, but service type is mismatch (possibly an unrelated device): " + nsdServiceInfo.toString());
                return;
            }
            if (nsdServiceInfo.getServiceName().contains("Roblox-Magic-Login")) {
                C10909q.this.f38681a.resolveService(nsdServiceInfo, new C14237a());
            } else {
                Log.i("MagicLoginNsdHelperClient", "onServiceFound, but service name is mismatch (possibly an unrelated device): " + nsdServiceInfo.toString());
            }
        }

        @Override // android.net.nsd.NsdManager.DiscoveryListener
        public void onServiceLost(NsdServiceInfo nsdServiceInfo) {
            C10909q.this.m41485d(nsdServiceInfo);
        }

        @Override // android.net.nsd.NsdManager.DiscoveryListener
        public void onStartDiscoveryFailed(String str, int i10) {
            Log.e("MagicLoginNsdHelperClient", "Fail when StartDiscovery: " + i10);
            C10909q.this.f38681a.stopServiceDiscovery(this);
        }

        @Override // android.net.nsd.NsdManager.DiscoveryListener
        public void onStopDiscoveryFailed(String str, int i10) {
            Log.e("MagicLoginNsdHelperClient", "Fail when StopDiscovery: " + i10);
            C10909q.this.f38681a.stopServiceDiscovery(this);
        }
    }

    public C10909q(Application application) {
        this.f38681a = (NsdManager) application.getSystemService("servicediscovery");
        this.f38685e = new WeakReference<>(application);
    }

    /* JADX INFO: renamed from: c */
    public final void m41484c() {
        this.f38684d = new a();
    }

    /* JADX INFO: renamed from: d */
    public void m41485d(NsdServiceInfo nsdServiceInfo) {
        this.f38682b.remove(nsdServiceInfo.getServiceName());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C9494a.m37399l(), C9494a.m37395h());
            jSONObject.put(C9494a.m37394g(), nsdServiceInfo.getServiceName());
            MessageBus messageBusM16016f = MessageBus.m16016f();
            if (messageBusM16016f != null) {
                messageBusM16016f.m16024l(C9494a.m37400m(), jSONObject);
            } else {
                Log.e("MagicLoginNsdHelperClient", "Magic Login could not find message bus on EndpointLost");
            }
        } catch (JSONException e10) {
            Log.e("MagicLoginNsdHelperClient", "JSONException while onServiceLost: " + e10.toString());
        }
    }

    /* JADX INFO: renamed from: e */
    public void m41486e(NsdServiceInfo nsdServiceInfo) {
        this.f38682b.put(nsdServiceInfo.getServiceName(), nsdServiceInfo);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C9494a.m37399l(), C9494a.m37393f());
            jSONObject.put(C9494a.m37394g(), nsdServiceInfo.getServiceName());
            String strM37396i = C9494a.m37396i();
            byte[] bArr = nsdServiceInfo.getAttributes().get(C9494a.m37396i());
            Charset charset = StandardCharsets.UTF_8;
            jSONObject.put(strM37396i, new String(bArr, charset));
            jSONObject.put(C9494a.m37397j(), new String(nsdServiceInfo.getAttributes().get(C9494a.m37397j()), charset));
            MessageBus messageBusM16016f = MessageBus.m16016f();
            if (messageBusM16016f != null) {
                messageBusM16016f.m16024l(C9494a.m37400m(), jSONObject);
            } else {
                Log.e("MagicLoginNsdHelperClient", "Magic Login could not find message bus on EndpointFound");
            }
        } catch (IllegalArgumentException e10) {
            Log.e("MagicLoginNsdHelperClient", "IllegalArgumentException while sending EndpointFound: " + e10.toString());
        } catch (JSONException e11) {
            Log.e("MagicLoginNsdHelperClient", "JSONException while sending EndpointFound: " + e11.toString());
        }
    }

    /* JADX INFO: renamed from: f */
    public synchronized void m41487f() {
        if (this.f38683c == C10908p.b.ACTIVE) {
            m41492k();
            this.f38683c = C10908p.b.PAUSED;
        }
    }

    /* JADX INFO: renamed from: g */
    public synchronized void m41488g(String str, String str2, String str3) {
        try {
            try {
                NsdServiceInfo nsdServiceInfo = this.f38682b.get(str);
                if (nsdServiceInfo == null) {
                    Log.e("MagicLoginNsdHelperClient", "Service info not found for endpoint: " + str);
                    return;
                }
                int port = nsdServiceInfo.getPort();
                String hostAddress = nsdServiceInfo.getHost().getHostAddress();
                String string = "";
                if (this.f38685e.get() != null) {
                    string = Settings.Secure.getString(this.f38685e.get().getContentResolver(), "bluetooth_name");
                } else {
                    Log.e("MagicLoginNsdHelperClient", "weakApplication is null");
                }
                C10911s.m41502a(hostAddress, port, str2, str3, string);
            } catch (IllegalStateException e10) {
                Log.e("MagicLoginNsdHelperClient", "IllegalStateException in requestConnection: " + e10.toString());
            }
        } catch (IllegalArgumentException e11) {
            Log.e("MagicLoginNsdHelperClient", "IllegalArgumentException in requestConnection: " + e11.toString());
        }
    }

    /* JADX INFO: renamed from: h */
    public synchronized void m41489h() {
        try {
            if (this.f38683c == C10908p.b.PAUSED) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(C9494a.m37399l(), C9494a.m37389b());
                    MessageBus messageBusM16016f = MessageBus.m16016f();
                    if (messageBusM16016f != null) {
                        messageBusM16016f.m16024l(C9494a.m37400m(), jSONObject);
                    } else {
                        Log.e("MagicLoginNsdHelperClient", "Magic Login could not find message bus on clearDeviceList");
                    }
                } catch (JSONException e10) {
                    Log.e("MagicLoginNsdHelperClient", "JSONException while resumeDiscovery: " + e10.toString());
                }
                m41491j();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: i */
    public final synchronized void m41490i(C10908p.b bVar) {
        this.f38683c = bVar;
    }

    /* JADX INFO: renamed from: j */
    public synchronized void m41491j() {
        try {
            if (this.f38683c != C10908p.b.ACTIVE) {
                this.f38682b.clear();
                try {
                    try {
                        if (this.f38684d == null) {
                            m41484c();
                        }
                        this.f38681a.discoverServices("_scpi-raw._tcp.", 1, this.f38684d);
                    } catch (IllegalStateException e10) {
                        Log.e("MagicLoginNsdHelperClient", "IllegalStateException while starting discovery: " + e10.toString());
                    }
                } catch (IllegalArgumentException e11) {
                    Log.e("MagicLoginNsdHelperClient", "IllegalArgumentException while starting discovery: " + e11.toString());
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: k */
    public synchronized void m41492k() {
        NsdManager.DiscoveryListener discoveryListener;
        if (this.f38683c == C10908p.b.ACTIVE && (discoveryListener = this.f38684d) != null) {
            try {
                try {
                    this.f38681a.stopServiceDiscovery(discoveryListener);
                } catch (IllegalArgumentException e10) {
                    Log.e("MagicLoginNsdHelperClient", "IllegalArgumentException while stopping discovery: " + e10.toString());
                }
            } catch (IllegalStateException e11) {
                Log.e("MagicLoginNsdHelperClient", "IllegalStateException while stopping discovery: " + e11.toString());
            }
        }
    }
}
