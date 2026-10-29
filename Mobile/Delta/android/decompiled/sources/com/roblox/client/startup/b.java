package com.roblox.client.startup;

import ak.d0;
import ak.k2;
import ak.x;
import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import com.roblox.universalapp.logging.LoggingProtocol;
import ei.n;
import gk.p;
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
import me.e0;
import nb.qe;
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
import sg.a1;

/* JADX INFO: loaded from: classes2.dex */
public class b {
    public static Cache b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static X509TrustManager f9476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static SSLSocketFactory f9477d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f9478e;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static OkHttpClient f9483j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d0 f9475a = new d0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f9479f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f9480g = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f9481h = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static boolean f9482i = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final AtomicReference<String> f9484k = new AtomicReference<>(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final e0<Boolean> f9485l = e0.H();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f9486m = new a();

    public static class a extends d0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Set<String> f9487c = qe.a(new Object[]{"dnsStart", "dnsEnd", "connectStart", "secureConnectStart", "secureConnectEnd", "connectEnd"});

        @Override // okhttp3.EventListener
        public void connectFailed(@NonNull Call call, @NonNull InetSocketAddress inetSocketAddress, @NonNull Proxy proxy, Protocol protocol, @NonNull IOException iOException) {
            b.f9485l.D(Boolean.FALSE);
        }

        @Override // ak.d0, okhttp3.EventListener
        public void connectionAcquired(@NonNull Call call, @NonNull Connection connection) {
            if (connection.getProtocol() == Protocol.HTTP_2) {
                b.f9485l.D(Boolean.TRUE);
            }
        }

        @Override // ak.d0, okhttp3.EventListener
        public void connectionReleased(@NonNull Call call, @NonNull Connection connection) {
            b.f9485l.D(Boolean.TRUE);
        }

        @Override // ak.d0
        public void k(Pair<String, Long> pair) {
            if (f9487c.contains(pair.first)) {
                super.k(pair);
            }
        }

        public a() {
        }
    }

    public static C0149b b(Context context) {
        X509TrustManager x509TrustManager;
        Cache cacheG = g(context);
        j();
        OkHttpClient.Builder builderNewBuilder = h().newBuilder();
        d0 d0Var = f9475a;
        OkHttpClient.Builder builderCache = builderNewBuilder.eventListener(d0Var).cache(cacheG);
        f(builderCache);
        SSLSocketFactory sSLSocketFactory = f9477d;
        if (sSLSocketFactory != null && (x509TrustManager = f9476c) != null) {
            builderCache.sslSocketFactory(sSLSocketFactory, x509TrustManager);
        }
        OkHttpClient okHttpClientBuild = builderCache.build();
        n();
        C0149b c0149bK = k(okHttpClientBuild);
        d0Var.j();
        e();
        return c0149bK;
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
        synchronized (f9481h) {
            f9477d = null;
            f9476c = null;
        }
    }

    public static void f(OkHttpClient.Builder builder) {
        f9482i = false;
        if (x.m().H(k2.ZSTD)) {
            builder.addInterceptor(new fi.b());
            builder.addInterceptor(new fi.a());
            f9482i = true;
        }
        builder.dns(n.c());
    }

    public static Cache g(Context context) {
        Cache cache;
        synchronized (f9479f) {
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
        synchronized (f9480g) {
            try {
                if (f9483j == null) {
                    a aVar = f9486m;
                    aVar.i();
                    OkHttpClient.Builder builderEventListener = new OkHttpClient.Builder().eventListener(aVar);
                    builderEventListener.dns(n.c());
                    SSLSocketFactory sSLSocketFactory = f9477d;
                    if (sSLSocketFactory != null && (x509TrustManager = f9476c) != null) {
                        builderEventListener.sslSocketFactory(sSLSocketFactory, x509TrustManager);
                    }
                    f9483j = builderEventListener.build();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f9483j;
    }

    public static String i() {
        AtomicReference<String> atomicReference = f9484k;
        t.a(atomicReference, null, a1.d(false));
        return atomicReference.get();
    }

    public static void j() {
        synchronized (f9481h) {
            try {
                try {
                    if (!f9478e && (f9477d == null || f9476c == null)) {
                        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                        trustManagerFactory.init((KeyStore) null);
                        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                        for (TrustManager trustManager : trustManagers) {
                            if (trustManagers[0] instanceof X509TrustManager) {
                                f9476c = (X509TrustManager) trustManager;
                                break;
                            }
                        }
                        if (f9476c == null) {
                            throw new IllegalStateException("Could not find X509TrustManager in TrustManagerFactory");
                        }
                        SSLContext sSLContext = SSLContext.getInstance("TLS");
                        sSLContext.init(null, new TrustManager[]{f9476c}, null);
                        f9477d = sSLContext.getSocketFactory();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            } catch (IllegalStateException e10) {
                e = e10;
                p.f("ClientSettingsRequest", "Error initializing the SSL Socket Factory: " + e.getLocalizedMessage(), e);
                f9478e = true;
                f9477d = null;
                f9476c = null;
            } catch (KeyManagementException e11) {
                e = e11;
                p.f("ClientSettingsRequest", "Error initializing the SSL Socket Factory: " + e.getLocalizedMessage(), e);
                f9478e = true;
                f9477d = null;
                f9476c = null;
            } catch (KeyStoreException e12) {
                e = e12;
                p.f("ClientSettingsRequest", "Error initializing the SSL Socket Factory: " + e.getLocalizedMessage(), e);
                f9478e = true;
                f9477d = null;
                f9476c = null;
            } catch (NoSuchAlgorithmException e13) {
                e = e13;
                p.f("ClientSettingsRequest", "Error initializing the SSL Socket Factory: " + e.getLocalizedMessage(), e);
                f9478e = true;
                f9477d = null;
                f9476c = null;
            }
        }
    }

    public static C0149b k(OkHttpClient okHttpClient) {
        C0149b c0149b;
        try {
            try {
                Response responseM = m(okHttpClient.newCall(d(a1.d(f9482i))).execute());
                try {
                    if (!f9482i || (responseM != null && responseM.getIsSuccessful())) {
                        c0149b = new C0149b(c(responseM), responseM.header("X-Signature-Ed25519", ""));
                        responseM.close();
                        ei.b.b().c();
                        return c0149b;
                    }
                    f9475a.i();
                    Response responseM2 = m(okHttpClient.newCall(d(a1.d(false))).execute());
                    try {
                        C0149b c0149b2 = new C0149b(c(responseM2), responseM2.header("X-Signature-Ed25519", ""));
                        responseM2.close();
                        if (responseM != null) {
                            responseM.close();
                        }
                        ei.b.b().c();
                        return c0149b2;
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
                ei.b.b().c();
                throw th6;
            }
        } catch (IOException unused) {
            c0149b = new C0149b("", "");
        }
    }

    public static void l() {
        p.h("ClientSettingsRequest", "Pre-warm connection failed");
        f9485l.D(Boolean.FALSE);
    }

    public static Response m(Response response) {
        if (response == null) {
            return null;
        }
        if (response.cacheResponse() != null && response.networkResponse() != null && response.networkResponse().code() == 304) {
            f9475a.a();
        } else if (response.cacheResponse() != null && response.networkResponse() == null) {
            f9475a.b();
        } else if (response.networkResponse() != null && response.getIsSuccessful()) {
            f9475a.c();
        }
        String strHeader = response.header("Content-Encoding");
        if ("dcz".equals(strHeader)) {
            f9475a.l();
        } else if ("zst".equals(strHeader)) {
            f9475a.m();
        }
        if (response.networkResponse() != null) {
            String strHeader2 = response.networkResponse().header("X-Cache");
            if (!TextUtils.isEmpty(strHeader2)) {
                String lowerCase = strHeader2.toLowerCase();
                if (lowerCase.startsWith("tcp_hit") || lowerCase.startsWith("tcp_ims_hit") || lowerCase.startsWith("tcm_mem_hit") || lowerCase.startsWith("hit from cloudfront")) {
                    f9475a.e();
                } else if (lowerCase.startsWith("tcp_refresh_hit") || lowerCase.startsWith("refreshhit from cloudfront")) {
                    f9475a.g();
                } else if (lowerCase.startsWith("tcp_miss") || lowerCase.startsWith("tcp_refresh_miss") || lowerCase.startsWith("miss from cloudfront")) {
                    f9475a.f();
                }
                if (lowerCase.contains("cloudfront")) {
                    f9475a.h();
                    return response;
                }
                if (lowerCase.startsWith("tcp")) {
                    f9475a.d();
                }
            }
        }
        return response;
    }

    public static void n() {
        try {
            try {
                String str = f9484k.get();
                if (str != null && str.startsWith(a1.c())) {
                    d0 d0Var = f9475a;
                    d0Var.n();
                    if (f9485l.get(2147483647L, TimeUnit.MILLISECONDS).booleanValue()) {
                        LoggingProtocol.k("tlsPreWarmSuccess");
                        f9486m.j();
                    }
                    d0Var.o();
                    return;
                }
                p.h("ClientSettingsRequest", "Not waiting for connection, as flag URL has changed: " + a1.c());
            } catch (Throwable th2) {
                f9475a.o();
                throw th2;
            }
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            p.k("ClientSettingsRequest", "Timed out waiting to establish connection: " + e10);
        }
        f9475a.o();
    }

    /* JADX INFO: renamed from: com.roblox.client.startup.b$b, reason: collision with other inner class name */
    public static class C0149b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte[] f9488a;
        public final String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public JSONObject f9489c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f9490d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f9491e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f9492f;

        public C0149b(byte[] bArr, String str, long j10) {
            this.f9488a = bArr;
            this.b = null;
            this.f9490d = str;
            this.f9491e = j10;
            this.f9492f = true;
        }

        public static JSONObject a(String str) {
            JSONObject jSONObject;
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
                p.k("ClientSettingsRequest", "can't parse flag json.");
                jSONObject = null;
            }
            if (jSONObject == null || !jSONObject.has("applicationSettings")) {
                return null;
            }
            return jSONObject.optJSONObject("applicationSettings");
        }

        public long b() {
            return this.f9491e;
        }

        public JSONObject c() {
            if (this.f9489c == null && !this.f9492f) {
                this.f9489c = a(d());
            }
            return this.f9489c;
        }

        public String d() {
            return this.b;
        }

        public String e() {
            return this.f9490d;
        }

        public boolean f() {
            return this.f9492f;
        }

        public C0149b(String str, String str2, long j10) {
            this.f9488a = null;
            this.b = str;
            this.f9490d = str2;
            this.f9491e = j10;
            this.f9492f = false;
        }

        public C0149b(String str, String str2) {
            this(str, str2, 0L);
        }
    }
}
