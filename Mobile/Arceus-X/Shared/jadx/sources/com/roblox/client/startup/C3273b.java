package com.roblox.client.startup;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import com.roblox.universalapp.logging.LoggingProtocol;
import fi.C5610a;
import fi.C5611b;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import ne.C9418e0;
import okhttp3.Cache;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONException;
import org.json.JSONObject;
import p015ak.C0277d0;
import p015ak.C0347x;
import p015ak.EnumC0307k2;
import p104ei.C5124b;
import p104ei.C5136n;
import p151gk.C6124q;
import p306nb.C9261qe;
import p348p1.C10146t;
import sg.C11295a1;

/* JADX INFO: renamed from: com.roblox.client.startup.b */
/* JADX INFO: loaded from: classes2.dex */
public class C3273b {

    /* JADX INFO: renamed from: b */
    public static Cache f12353b;

    /* JADX INFO: renamed from: c */
    public static X509TrustManager f12354c;

    /* JADX INFO: renamed from: d */
    public static SSLSocketFactory f12355d;

    /* JADX INFO: renamed from: e */
    public static boolean f12356e;

    /* JADX INFO: renamed from: j */
    public static OkHttpClient f12361j;

    /* JADX INFO: renamed from: a */
    public static final C0277d0 f12352a = new C0277d0();

    /* JADX INFO: renamed from: f */
    public static final Object f12357f = new Object();

    /* JADX INFO: renamed from: g */
    public static final Object f12358g = new Object();

    /* JADX INFO: renamed from: h */
    public static final Object f12359h = new Object();

    /* JADX INFO: renamed from: i */
    public static boolean f12360i = false;

    /* JADX INFO: renamed from: k */
    public static final AtomicReference<String> f12362k = new AtomicReference<>(null);

    /* JADX INFO: renamed from: l */
    public static final C9418e0<Boolean> f12363l = C9418e0.m37204H();

    /* JADX INFO: renamed from: m */
    public static final a f12364m = new a();

    /* JADX INFO: renamed from: com.roblox.client.startup.b$a */
    public static class a extends C0277d0 {

        /* JADX INFO: renamed from: c */
        public static final Set<String> f12365c = C9261qe.m36724a(new Object[]{"dnsStart", "dnsEnd", "connectStart", "secureConnectStart", "secureConnectEnd", "connectEnd"});

        @Override // okhttp3.EventListener
        public void connectFailed(@NonNull Call call, @NonNull InetSocketAddress inetSocketAddress, @NonNull Proxy proxy, Protocol protocol, @NonNull IOException iOException) {
            C3273b.f12363l.mo37169D(Boolean.FALSE);
        }

        @Override // p015ak.C0277d0, okhttp3.EventListener
        public void connectionAcquired(@NonNull Call call, @NonNull Connection connection) {
            if (connection.getProtocol() == Protocol.HTTP_2) {
                C3273b.f12363l.mo37169D(Boolean.TRUE);
            }
        }

        @Override // p015ak.C0277d0, okhttp3.EventListener
        public void connectionReleased(@NonNull Call call, @NonNull Connection connection) {
            C3273b.f12363l.mo37169D(Boolean.TRUE);
        }

        @Override // p015ak.C0277d0
        /* JADX INFO: renamed from: k */
        public void mo1242k(Pair<String, Long> pair) {
            if (f12365c.contains(pair.first)) {
                super.mo1242k(pair);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public a() {
        }
    }

    /* JADX INFO: renamed from: b */
    public static b m15723b(Context context) {
        X509TrustManager x509TrustManager;
        Cache cacheM15728g = m15728g(context);
        m15731j();
        OkHttpClient.Builder builderNewBuilder = m15729h().newBuilder();
        C0277d0 c0277d0 = f12352a;
        OkHttpClient.Builder builderCache = builderNewBuilder.eventListener(c0277d0).cache(cacheM15728g);
        m15727f(builderCache);
        SSLSocketFactory sSLSocketFactory = f12355d;
        if (sSLSocketFactory != null && (x509TrustManager = f12354c) != null) {
            builderCache.sslSocketFactory(sSLSocketFactory, x509TrustManager);
        }
        OkHttpClient okHttpClientBuild = builderCache.build();
        m15735n();
        b bVarM15732k = m15732k(okHttpClientBuild);
        c0277d0.m1241j();
        m15726e();
        return bVarM15732k;
    }

    /* JADX INFO: renamed from: c */
    public static String m15724c(Response response) {
        ResponseBody responseBodyBody;
        return (response == null || (responseBodyBody = response.body()) == null) ? "" : responseBodyBody.string();
    }

    /* JADX INFO: renamed from: d */
    public static Request m15725d(String str) {
        Request.Builder builderUrl = new Request.Builder().url(str);
        builderUrl.addHeader("Pragma", "akamai-x-cache-on");
        return builderUrl.build();
    }

    /* JADX INFO: renamed from: e */
    public static void m15726e() {
        synchronized (f12359h) {
            f12355d = null;
            f12354c = null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m15727f(OkHttpClient.Builder builder) {
        f12360i = false;
        if (C0347x.m1349m().m1357H(EnumC0307k2.ZSTD)) {
            builder.addInterceptor(new C5611b());
            builder.addInterceptor(new C5610a());
            f12360i = true;
        }
        builder.dns(C5136n.m23943c());
    }

    /* JADX INFO: renamed from: g */
    public static Cache m15728g(Context context) {
        Cache cache;
        synchronized (f12357f) {
            try {
                if (f12353b == null) {
                    f12353b = new Cache(context.getCacheDir(), 2097152L);
                }
                cache = f12353b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cache;
    }

    /* JADX INFO: renamed from: h */
    public static OkHttpClient m15729h() {
        X509TrustManager x509TrustManager;
        synchronized (f12358g) {
            try {
                if (f12361j == null) {
                    a aVar = f12364m;
                    aVar.m1240i();
                    OkHttpClient.Builder builderEventListener = new OkHttpClient.Builder().eventListener(aVar);
                    builderEventListener.dns(C5136n.m23943c());
                    SSLSocketFactory sSLSocketFactory = f12355d;
                    if (sSLSocketFactory != null && (x509TrustManager = f12354c) != null) {
                        builderEventListener.sslSocketFactory(sSLSocketFactory, x509TrustManager);
                    }
                    f12361j = builderEventListener.build();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f12361j;
    }

    /* JADX INFO: renamed from: i */
    public static String m15730i() {
        AtomicReference<String> atomicReference = f12362k;
        C10146t.m39085a(atomicReference, null, C11295a1.m42443d(false));
        return atomicReference.get();
    }

    /* JADX INFO: renamed from: j */
    public static void m15731j() {
        synchronized (f12359h) {
            try {
                try {
                    if (!f12356e && (f12355d == null || f12354c == null)) {
                        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                        trustManagerFactory.init((KeyStore) null);
                        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                        for (TrustManager trustManager : trustManagers) {
                            if (trustManagers[0] instanceof X509TrustManager) {
                                f12354c = (X509TrustManager) trustManager;
                                break;
                            }
                        }
                        if (f12354c == null) {
                            throw new IllegalStateException("Could not find X509TrustManager in TrustManagerFactory");
                        }
                        SSLContext sSLContext = SSLContext.getInstance("TLS");
                        sSLContext.init(null, new TrustManager[]{f12354c}, null);
                        f12355d = sSLContext.getSocketFactory();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            } catch (IllegalStateException e10) {
                e = e10;
                C6124q.m27061f("ClientSettingsRequest", "Error initializing the SSL Socket Factory: " + e.getLocalizedMessage(), e);
                f12356e = true;
                f12355d = null;
                f12354c = null;
            } catch (KeyManagementException e11) {
                e = e11;
                C6124q.m27061f("ClientSettingsRequest", "Error initializing the SSL Socket Factory: " + e.getLocalizedMessage(), e);
                f12356e = true;
                f12355d = null;
                f12354c = null;
            } catch (KeyStoreException e12) {
                e = e12;
                C6124q.m27061f("ClientSettingsRequest", "Error initializing the SSL Socket Factory: " + e.getLocalizedMessage(), e);
                f12356e = true;
                f12355d = null;
                f12354c = null;
            } catch (NoSuchAlgorithmException e13) {
                e = e13;
                C6124q.m27061f("ClientSettingsRequest", "Error initializing the SSL Socket Factory: " + e.getLocalizedMessage(), e);
                f12356e = true;
                f12355d = null;
                f12354c = null;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public static b m15732k(OkHttpClient okHttpClient) {
        b bVar;
        try {
            try {
                Response responseM15734m = m15734m(okHttpClient.newCall(m15725d(C11295a1.m42443d(f12360i))).execute());
                try {
                    if (!f12360i || (responseM15734m != null && responseM15734m.getIsSuccessful())) {
                        bVar = new b(m15724c(responseM15734m), responseM15734m.header("X-Signature-Ed25519", ""));
                        responseM15734m.close();
                        C5124b.m23913b().m23915c();
                        return bVar;
                    }
                    f12352a.m1240i();
                    Response responseM15734m2 = m15734m(okHttpClient.newCall(m15725d(C11295a1.m42443d(false))).execute());
                    try {
                        b bVar2 = new b(m15724c(responseM15734m2), responseM15734m2.header("X-Signature-Ed25519", ""));
                        responseM15734m2.close();
                        if (responseM15734m != null) {
                            responseM15734m.close();
                        }
                        C5124b.m23913b().m23915c();
                        return bVar2;
                    } catch (Throwable th2) {
                        if (responseM15734m2 != null) {
                            try {
                                responseM15734m2.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                        }
                        throw th2;
                    }
                } catch (Throwable th4) {
                    if (responseM15734m != null) {
                        try {
                            responseM15734m.close();
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                    }
                    throw th4;
                }
            } catch (Throwable th6) {
                C5124b.m23913b().m23915c();
                throw th6;
            }
        } catch (IOException unused) {
            bVar = new b("", "");
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m15733l() {
        C6124q.m27063h("ClientSettingsRequest", "Pre-warm connection failed");
        f12363l.mo37169D(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: m */
    public static Response m15734m(Response response) {
        if (response == null) {
            return null;
        }
        if (response.cacheResponse() != null && response.networkResponse() != null && response.networkResponse().code() == 304) {
            f12352a.m1232a();
        } else if (response.cacheResponse() != null && response.networkResponse() == null) {
            f12352a.m1233b();
        } else if (response.networkResponse() != null && response.getIsSuccessful()) {
            f12352a.m1234c();
        }
        String strHeader = response.header("Content-Encoding");
        if ("dcz".equals(strHeader)) {
            f12352a.m1243l();
        } else if ("zst".equals(strHeader)) {
            f12352a.m1244m();
        }
        if (response.networkResponse() != null) {
            String strHeader2 = response.networkResponse().header("X-Cache");
            if (!TextUtils.isEmpty(strHeader2)) {
                String lowerCase = strHeader2.toLowerCase();
                if (lowerCase.startsWith("tcp_hit") || lowerCase.startsWith("tcp_ims_hit") || lowerCase.startsWith("tcm_mem_hit") || lowerCase.startsWith("hit from cloudfront")) {
                    f12352a.m1236e();
                } else if (lowerCase.startsWith("tcp_refresh_hit") || lowerCase.startsWith("refreshhit from cloudfront")) {
                    f12352a.m1238g();
                } else if (lowerCase.startsWith("tcp_miss") || lowerCase.startsWith("tcp_refresh_miss") || lowerCase.startsWith("miss from cloudfront")) {
                    f12352a.m1237f();
                }
                if (lowerCase.contains("cloudfront")) {
                    f12352a.m1239h();
                    return response;
                }
                if (lowerCase.startsWith("tcp")) {
                    f12352a.m1235d();
                }
            }
        }
        return response;
    }

    /* JADX INFO: renamed from: n */
    public static void m15735n() {
        try {
            try {
                String str = f12362k.get();
                if (str != null && str.startsWith(C11295a1.m42440c())) {
                    C0277d0 c0277d0 = f12352a;
                    c0277d0.m1245n();
                    if (f12363l.get(2147483647L, TimeUnit.MILLISECONDS).booleanValue()) {
                        LoggingProtocol.m15998k("tlsPreWarmSuccess");
                        f12364m.m1241j();
                    }
                    c0277d0.m1246o();
                    return;
                }
                C6124q.m27063h("ClientSettingsRequest", "Not waiting for connection, as flag URL has changed: " + C11295a1.m42440c());
            } catch (Throwable th2) {
                f12352a.m1246o();
                throw th2;
            }
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            C6124q.m27066k("ClientSettingsRequest", "Timed out waiting to establish connection: " + e10);
        }
        f12352a.m1246o();
    }

    /* JADX INFO: renamed from: com.roblox.client.startup.b$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final String f12366a;

        /* JADX INFO: renamed from: b */
        public JSONObject f12367b;

        /* JADX INFO: renamed from: c */
        public final String f12368c;

        /* JADX INFO: renamed from: d */
        public final long f12369d;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public b(String str, String str2, long j10) {
            this.f12366a = str;
            this.f12368c = str2;
            this.f12369d = j10;
        }

        /* JADX INFO: renamed from: a */
        public static JSONObject m15736a(String str) {
            JSONObject jSONObject;
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
                C6124q.m27066k("ClientSettingsRequest", "can't parse flag json.");
                jSONObject = null;
            }
            if (jSONObject == null || !jSONObject.has("applicationSettings")) {
                return null;
            }
            return jSONObject.optJSONObject("applicationSettings");
        }

        /* JADX INFO: renamed from: b */
        public long m15737b() {
            return this.f12369d;
        }

        /* JADX INFO: renamed from: c */
        public JSONObject m15738c() {
            if (this.f12367b == null) {
                this.f12367b = m15736a(m15739d());
            }
            return this.f12367b;
        }

        /* JADX INFO: renamed from: d */
        public String m15739d() {
            return this.f12366a;
        }

        /* JADX INFO: renamed from: e */
        public String m15740e() {
            return this.f12368c;
        }

        public b(String str, String str2) {
            this(str, str2, 0L);
        }
    }
}
