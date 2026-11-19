package com.roblox.client.startup;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import bh.a1;
import com.github.luben.zstd.BuildConfig;
import com.roblox.universalapp.logging.LoggingProtocol;
import ik.q2;
import ik.x;
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
import mi.n;
import mv.d0;
import mv.e;
import mv.f0;
import mv.h0;
import mv.i0;
import mv.k;
import ob.ze;
import ok.q;
import org.json.JSONException;
import org.json.JSONObject;
import p1.t;
import pe.e0;

/* JADX INFO: loaded from: classes2.dex */
public class b {
    public static mv.c b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static X509TrustManager f9377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static SSLSocketFactory f9378d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f9379e;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static d0 f9384j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ik.d0 f9376a = new ik.d0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f9380f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f9381g = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f9382h = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static boolean f9383i = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final AtomicReference<String> f9385k = new AtomicReference<>(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final e0<Boolean> f9386l = e0.H();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f9387m = new a();

    public static class a extends ik.d0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Set<String> f9388c = ze.a(new Object[]{"dnsStart", "dnsEnd", "connectStart", "secureConnectStart", "secureConnectEnd", "connectEnd"});

        @Override // mv.s
        public void connectFailed(@NonNull e eVar, @NonNull InetSocketAddress inetSocketAddress, @NonNull Proxy proxy, mv.e0 e0Var, @NonNull IOException iOException) {
            b.f9386l.D(Boolean.FALSE);
        }

        @Override // ik.d0, mv.s
        public void connectionAcquired(@NonNull e eVar, @NonNull k kVar) {
            if (kVar.getProtocol() == mv.e0.HTTP_2) {
                b.f9386l.D(Boolean.TRUE);
            }
        }

        @Override // ik.d0, mv.s
        public void connectionReleased(@NonNull e eVar, @NonNull k kVar) {
            b.f9386l.D(Boolean.TRUE);
        }

        @Override // ik.d0
        public void k(Pair<String, Long> pair) {
            if (f9388c.contains(pair.first)) {
                super.k(pair);
            }
        }

        public a() {
        }
    }

    public static C0155b b(Context context) {
        X509TrustManager x509TrustManager;
        mv.c cVarG = g(context);
        j();
        d0.a aVarA = h().A();
        ik.d0 d0Var = f9376a;
        d0.a aVarD = aVarA.k(d0Var).d(cVarG);
        f(aVarD);
        SSLSocketFactory sSLSocketFactory = f9378d;
        if (sSLSocketFactory != null && (x509TrustManager = f9377c) != null) {
            aVarD.V(sSLSocketFactory, x509TrustManager);
        }
        d0 d0VarC = aVarD.c();
        n();
        C0155b c0155bK = k(d0VarC);
        d0Var.j();
        e();
        return c0155bK;
    }

    public static String c(h0 h0Var) {
        i0 body;
        return (h0Var == null || (body = h0Var.getBody()) == null) ? BuildConfig.FLAVOR : body.h();
    }

    public static f0 d(String str) {
        f0.a aVarT = new f0.a().t(str);
        aVarT.a("Pragma", "akamai-x-cache-on");
        return aVarT.b();
    }

    public static void e() {
        synchronized (f9382h) {
            f9378d = null;
            f9377c = null;
        }
    }

    public static void f(d0.a aVar) {
        f9383i = false;
        if (x.m().H(q2.ZSTD)) {
            aVar.a(new ni.b());
            aVar.a(new ni.a());
            f9383i = true;
        }
        aVar.j(n.d());
    }

    public static mv.c g(Context context) {
        mv.c cVar;
        synchronized (f9380f) {
            try {
                if (b == null) {
                    b = new mv.c(context.getCacheDir(), 2097152L);
                }
                cVar = b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }

    public static d0 h() {
        X509TrustManager x509TrustManager;
        synchronized (f9381g) {
            try {
                if (f9384j == null) {
                    a aVar = f9387m;
                    aVar.i();
                    d0.a aVarK = new d0.a().k(aVar);
                    aVarK.j(n.d());
                    SSLSocketFactory sSLSocketFactory = f9378d;
                    if (sSLSocketFactory != null && (x509TrustManager = f9377c) != null) {
                        aVarK.V(sSLSocketFactory, x509TrustManager);
                    }
                    f9384j = aVarK.c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f9384j;
    }

    public static String i() {
        AtomicReference<String> atomicReference = f9385k;
        t.a(atomicReference, null, a1.d(false));
        return atomicReference.get();
    }

    public static void j() {
        synchronized (f9382h) {
            try {
                try {
                    if (!f9379e && (f9378d == null || f9377c == null)) {
                        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                        trustManagerFactory.init((KeyStore) null);
                        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                        for (TrustManager trustManager : trustManagers) {
                            if (trustManagers[0] instanceof X509TrustManager) {
                                f9377c = (X509TrustManager) trustManager;
                                break;
                            }
                        }
                        if (f9377c == null) {
                            throw new IllegalStateException("Could not find X509TrustManager in TrustManagerFactory");
                        }
                        SSLContext sSLContext = SSLContext.getInstance("TLS");
                        sSLContext.init(null, new TrustManager[]{f9377c}, null);
                        f9378d = sSLContext.getSocketFactory();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            } catch (IllegalStateException e10) {
                e = e10;
                q.f("ClientSettingsRequest", "Error initializing the SSL Socket Factory: " + e.getLocalizedMessage(), e);
                f9379e = true;
                f9378d = null;
                f9377c = null;
            } catch (KeyManagementException e11) {
                e = e11;
                q.f("ClientSettingsRequest", "Error initializing the SSL Socket Factory: " + e.getLocalizedMessage(), e);
                f9379e = true;
                f9378d = null;
                f9377c = null;
            } catch (KeyStoreException e12) {
                e = e12;
                q.f("ClientSettingsRequest", "Error initializing the SSL Socket Factory: " + e.getLocalizedMessage(), e);
                f9379e = true;
                f9378d = null;
                f9377c = null;
            } catch (NoSuchAlgorithmException e13) {
                e = e13;
                q.f("ClientSettingsRequest", "Error initializing the SSL Socket Factory: " + e.getLocalizedMessage(), e);
                f9379e = true;
                f9378d = null;
                f9377c = null;
            }
        }
    }

    public static C0155b k(d0 d0Var) {
        C0155b c0155b;
        try {
            try {
                h0 h0VarM = m(d0Var.a(d(a1.d(f9383i))).j());
                try {
                    if (!f9383i || (h0VarM != null && h0VarM.getIsSuccessful())) {
                        c0155b = new C0155b(c(h0VarM), h0VarM.m("X-Signature-Ed25519", BuildConfig.FLAVOR));
                        h0VarM.close();
                        mi.b.b().c();
                        return c0155b;
                    }
                    f9376a.i();
                    h0 h0VarM2 = m(d0Var.a(d(a1.d(false))).j());
                    try {
                        C0155b c0155b2 = new C0155b(c(h0VarM2), h0VarM2.m("X-Signature-Ed25519", BuildConfig.FLAVOR));
                        h0VarM2.close();
                        if (h0VarM != null) {
                            h0VarM.close();
                        }
                        mi.b.b().c();
                        return c0155b2;
                    } catch (Throwable th2) {
                        if (h0VarM2 != null) {
                            try {
                                h0VarM2.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                        }
                        throw th2;
                    }
                } catch (Throwable th4) {
                    if (h0VarM != null) {
                        try {
                            h0VarM.close();
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                    }
                    throw th4;
                }
            } catch (Throwable th6) {
                mi.b.b().c();
                throw th6;
            }
        } catch (IOException unused) {
            c0155b = new C0155b(BuildConfig.FLAVOR, BuildConfig.FLAVOR);
        }
    }

    public static void l() {
        q.h("ClientSettingsRequest", "Pre-warm connection failed");
        f9386l.D(Boolean.FALSE);
    }

    public static h0 m(h0 h0Var) {
        if (h0Var == null) {
            return null;
        }
        if (h0Var.getCacheResponse() != null && h0Var.getNetworkResponse() != null && h0Var.getNetworkResponse().getCode() == 304) {
            f9376a.a();
        } else if (h0Var.getCacheResponse() != null && h0Var.getNetworkResponse() == null) {
            f9376a.b();
        } else if (h0Var.getNetworkResponse() != null && h0Var.getIsSuccessful()) {
            f9376a.c();
        }
        String strK = h0Var.k("Content-Encoding");
        if ("dcz".equals(strK)) {
            f9376a.l();
        } else if ("zst".equals(strK)) {
            f9376a.m();
        }
        if (h0Var.getNetworkResponse() != null) {
            String strK2 = h0Var.getNetworkResponse().k("X-Cache");
            if (!TextUtils.isEmpty(strK2)) {
                String lowerCase = strK2.toLowerCase();
                if (lowerCase.startsWith("tcp_hit") || lowerCase.startsWith("tcp_ims_hit") || lowerCase.startsWith("tcm_mem_hit") || lowerCase.startsWith("hit from cloudfront")) {
                    f9376a.e();
                } else if (lowerCase.startsWith("tcp_refresh_hit") || lowerCase.startsWith("refreshhit from cloudfront")) {
                    f9376a.g();
                } else if (lowerCase.startsWith("tcp_miss") || lowerCase.startsWith("tcp_refresh_miss") || lowerCase.startsWith("miss from cloudfront")) {
                    f9376a.f();
                }
                if (lowerCase.contains("cloudfront")) {
                    f9376a.h();
                    return h0Var;
                }
                if (lowerCase.startsWith("tcp")) {
                    f9376a.d();
                }
            }
        }
        return h0Var;
    }

    public static void n() {
        try {
            try {
                String str = f9385k.get();
                if (str != null && str.startsWith(a1.c())) {
                    ik.d0 d0Var = f9376a;
                    d0Var.n();
                    if (f9386l.get(2147483647L, TimeUnit.MILLISECONDS).booleanValue()) {
                        LoggingProtocol.k("tlsPreWarmSuccess");
                        f9387m.j();
                    }
                    d0Var.o();
                    return;
                }
                q.h("ClientSettingsRequest", "Not waiting for connection, as flag URL has changed: " + a1.c());
            } catch (Throwable th2) {
                f9376a.o();
                throw th2;
            }
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            q.k("ClientSettingsRequest", "Timed out waiting to establish connection: " + e10);
        }
        f9376a.o();
    }

    /* JADX INFO: renamed from: com.roblox.client.startup.b$b, reason: collision with other inner class name */
    public static class C0155b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f9389a;
        public JSONObject b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f9390c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f9391d;

        public C0155b(String str, String str2, long j10) {
            this.f9389a = str;
            this.f9390c = str2;
            this.f9391d = j10;
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
            return this.f9391d;
        }

        public JSONObject c() {
            if (this.b == null) {
                this.b = a(d());
            }
            return this.b;
        }

        public String d() {
            return this.f9389a;
        }

        public String e() {
            return this.f9390c;
        }

        public C0155b(String str, String str2) {
            this(str, str2, 0L);
        }
    }
}
