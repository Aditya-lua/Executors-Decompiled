package com.roblox.client.startup;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import ci.n;
import com.roblox.universalapp.logging.LoggingProtocol;
import ek.q;
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
import nb.qe;
import ne.e0;
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
import p1.t;
import rg.a1;
import yj.d0;
import yj.k2;
import yj.x;

/* JADX INFO: loaded from: classes2.dex */
public class b {
    public static Cache b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static X509TrustManager f9555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static SSLSocketFactory f9556d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f9557e;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static OkHttpClient f9562j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d0 f9554a = new d0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f9558f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f9559g = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f9560h = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static boolean f9561i = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final AtomicReference<String> f9563k = new AtomicReference<>(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final e0<Boolean> f9564l = e0.H();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f9565m = new a();

    public static class a extends d0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Set<String> f9566c = qe.a(new Object[]{"dnsStart", "dnsEnd", "connectStart", "secureConnectStart", "secureConnectEnd", "connectEnd"});

        @Override // okhttp3.EventListener
        public void connectFailed(@NonNull Call call, @NonNull InetSocketAddress inetSocketAddress, @NonNull Proxy proxy, Protocol protocol, @NonNull IOException iOException) {
            b.f9564l.D(Boolean.FALSE);
        }

        @Override // yj.d0, okhttp3.EventListener
        public void connectionAcquired(@NonNull Call call, @NonNull Connection connection) {
            if (connection.getProtocol() == Protocol.HTTP_2) {
                b.f9564l.D(Boolean.TRUE);
            }
        }

        @Override // yj.d0, okhttp3.EventListener
        public void connectionReleased(@NonNull Call call, @NonNull Connection connection) {
            b.f9564l.D(Boolean.TRUE);
        }

        @Override // yj.d0
        public void k(Pair<String, Long> pair) {
            if (f9566c.contains(pair.first)) {
                super.k(pair);
            }
        }

        public a() {
        }
    }

    public static C0152b b(Context context) {
        X509TrustManager x509TrustManager;
        Cache cacheG = g(context);
        j();
        OkHttpClient.Builder builderNewBuilder = h().newBuilder();
        d0 d0Var = f9554a;
        OkHttpClient.Builder builderCache = builderNewBuilder.eventListener(d0Var).cache(cacheG);
        f(builderCache);
        SSLSocketFactory sSLSocketFactory = f9556d;
        if (sSLSocketFactory != null && (x509TrustManager = f9555c) != null) {
            builderCache.sslSocketFactory(sSLSocketFactory, x509TrustManager);
        }
        OkHttpClient okHttpClientBuild = builderCache.build();
        n();
        C0152b c0152bK = k(okHttpClientBuild);
        d0Var.j();
        e();
        return c0152bK;
    }

    public static String c(Response response) {
        ResponseBody responseBodyBody;
        return (response == null || (responseBodyBody = response.body()) == null) ? "" : responseBodyBody.string();
    }

    public static Request d(String str) {
        Request.Builder builderUrl = new Request.Builder().url(str);
        builderUrl.addHeader("Pragma", "akamai-x-cache-on");
        return builderUrl.build();
    }

    public static void e() {
        synchronized (f9560h) {
            f9556d = null;
            f9555c = null;
        }
    }

    public static void f(OkHttpClient.Builder builder) {
        f9561i = false;
        if (x.m().H(k2.ZSTD)) {
            builder.addInterceptor(new di.b());
            builder.addInterceptor(new di.a());
            f9561i = true;
        }
        builder.dns(n.c());
    }

    public static Cache g(Context context) {
        Cache cache;
        synchronized (f9558f) {
            try {
                if (b == null) {
                    b = new Cache(context.getCacheDir(), 2097152L);
                }
                cache = b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cache;
    }

    public static OkHttpClient h() {
        X509TrustManager x509TrustManager;
        synchronized (f9559g) {
            try {
                if (f9562j == null) {
                    a aVar = f9565m;
                    aVar.i();
                    OkHttpClient.Builder builderEventListener = new OkHttpClient.Builder().eventListener(aVar);
                    builderEventListener.dns(n.c());
                    SSLSocketFactory sSLSocketFactory = f9556d;
                    if (sSLSocketFactory != null && (x509TrustManager = f9555c) != null) {
                        builderEventListener.sslSocketFactory(sSLSocketFactory, x509TrustManager);
                    }
                    f9562j = builderEventListener.build();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f9562j;
    }

    public static String i() {
        AtomicReference<String> atomicReference = f9563k;
        t.a(atomicReference, null, a1.d(false));
        return atomicReference.get();
    }

    public static void j() {
        synchronized (f9560h) {
            try {
                try {
                    if (!f9557e && (f9556d == null || f9555c == null)) {
                        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                        trustManagerFactory.init((KeyStore) null);
                        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                        for (TrustManager trustManager : trustManagers) {
                            if (trustManagers[0] instanceof X509TrustManager) {
                                f9555c = (X509TrustManager) trustManager;
                                break;
                            }
                        }
                        if (f9555c == null) {
                            throw new IllegalStateException("Could not find X509TrustManager in TrustManagerFactory");
                        }
                        SSLContext sSLContext = SSLContext.getInstance("TLS");
                        sSLContext.init(null, new TrustManager[]{f9555c}, null);
                        f9556d = sSLContext.getSocketFactory();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            } catch (IllegalStateException e10) {
                e = e10;
                q.f("ClientSettingsRequest", "Error initializing the SSL Socket Factory: " + e.getLocalizedMessage(), e);
                f9557e = true;
                f9556d = null;
                f9555c = null;
            } catch (KeyManagementException e11) {
                e = e11;
                q.f("ClientSettingsRequest", "Error initializing the SSL Socket Factory: " + e.getLocalizedMessage(), e);
                f9557e = true;
                f9556d = null;
                f9555c = null;
            } catch (KeyStoreException e12) {
                e = e12;
                q.f("ClientSettingsRequest", "Error initializing the SSL Socket Factory: " + e.getLocalizedMessage(), e);
                f9557e = true;
                f9556d = null;
                f9555c = null;
            } catch (NoSuchAlgorithmException e13) {
                e = e13;
                q.f("ClientSettingsRequest", "Error initializing the SSL Socket Factory: " + e.getLocalizedMessage(), e);
                f9557e = true;
                f9556d = null;
                f9555c = null;
            }
        }
    }

    public static C0152b k(OkHttpClient okHttpClient) {
        C0152b c0152b;
        try {
            try {
                Response responseM = m(okHttpClient.newCall(d(a1.d(f9561i))).execute());
                try {
                    if (!f9561i || (responseM != null && responseM.getIsSuccessful())) {
                        c0152b = new C0152b(c(responseM), responseM.header("X-Signature-Ed25519", ""));
                        responseM.close();
                        ci.b.b().c();
                        return c0152b;
                    }
                    f9554a.i();
                    Response responseM2 = m(okHttpClient.newCall(d(a1.d(false))).execute());
                    try {
                        C0152b c0152b2 = new C0152b(c(responseM2), responseM2.header("X-Signature-Ed25519", ""));
                        responseM2.close();
                        if (responseM != null) {
                            responseM.close();
                        }
                        ci.b.b().c();
                        return c0152b2;
                    } catch (Throwable th2) {
                        if (responseM2 != null) {
                            try {
                                responseM2.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                        }
                        throw th2;
                    }
                } catch (Throwable th4) {
                    if (responseM != null) {
                        try {
                            responseM.close();
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                    }
                    throw th4;
                }
            } catch (Throwable th6) {
                ci.b.b().c();
                throw th6;
            }
        } catch (IOException unused) {
            c0152b = new C0152b("", "");
        }
    }

    public static void l() {
        q.h("ClientSettingsRequest", "Pre-warm connection failed");
        f9564l.D(Boolean.FALSE);
    }

    public static Response m(Response response) {
        if (response == null) {
            return null;
        }
        if (response.cacheResponse() != null && response.networkResponse() != null && response.networkResponse().code() == 304) {
            f9554a.a();
        } else if (response.cacheResponse() != null && response.networkResponse() == null) {
            f9554a.b();
        } else if (response.networkResponse() != null && response.getIsSuccessful()) {
            f9554a.c();
        }
        String strHeader = response.header("Content-Encoding");
        if ("dcz".equals(strHeader)) {
            f9554a.l();
        } else if ("zst".equals(strHeader)) {
            f9554a.m();
        }
        if (response.networkResponse() != null) {
            String strHeader2 = response.networkResponse().header("X-Cache");
            if (!TextUtils.isEmpty(strHeader2)) {
                String lowerCase = strHeader2.toLowerCase();
                if (lowerCase.startsWith("tcp_hit") || lowerCase.startsWith("tcp_ims_hit") || lowerCase.startsWith("tcm_mem_hit") || lowerCase.startsWith("hit from cloudfront")) {
                    f9554a.e();
                } else if (lowerCase.startsWith("tcp_refresh_hit") || lowerCase.startsWith("refreshhit from cloudfront")) {
                    f9554a.g();
                } else if (lowerCase.startsWith("tcp_miss") || lowerCase.startsWith("tcp_refresh_miss") || lowerCase.startsWith("miss from cloudfront")) {
                    f9554a.f();
                }
                if (lowerCase.contains("cloudfront")) {
                    f9554a.h();
                    return response;
                }
                if (lowerCase.startsWith("tcp")) {
                    f9554a.d();
                }
            }
        }
        return response;
    }

    public static void n() {
        try {
            try {
                String str = f9563k.get();
                if (str != null && str.startsWith(a1.c())) {
                    d0 d0Var = f9554a;
                    d0Var.n();
                    if (f9564l.get(2147483647L, TimeUnit.MILLISECONDS).booleanValue()) {
                        LoggingProtocol.k("tlsPreWarmSuccess");
                        f9565m.j();
                    }
                    d0Var.o();
                    return;
                }
                q.h("ClientSettingsRequest", "Not waiting for connection, as flag URL has changed: " + a1.c());
            } catch (Throwable th2) {
                f9554a.o();
                throw th2;
            }
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            q.k("ClientSettingsRequest", "Timed out waiting to establish connection: " + e10);
        }
        f9554a.o();
    }

    /* JADX INFO: renamed from: com.roblox.client.startup.b$b, reason: collision with other inner class name */
    public static class C0152b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f9567a;
        public JSONObject b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f9568c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f9569d;

        public C0152b(String str, String str2, long j10) {
            this.f9567a = str;
            this.f9568c = str2;
            this.f9569d = j10;
        }

        public static JSONObject a(String str) {
            JSONObject jSONObject;
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
                q.k("ClientSettingsRequest", "can't parse flag json.");
                jSONObject = null;
            }
            if (jSONObject == null || !jSONObject.has("applicationSettings")) {
                return null;
            }
            return jSONObject.optJSONObject("applicationSettings");
        }

        public long b() {
            return this.f9569d;
        }

        public JSONObject c() {
            if (this.b == null) {
                this.b = a(d());
            }
            return this.b;
        }

        public String d() {
            return this.f9567a;
        }

        public String e() {
            return this.f9568c;
        }

        public C0152b(String str, String str2) {
            this(str, str2, 0L);
        }
    }
}
