package okhttp3.internal.platform;

import android.content.Context;
import android.os.Build;
import android.os.StrictMode;
import android.security.NetworkSecurityPolicy;
import android.util.Log;
import bw.e;
import com.github.luben.zstd.BuildConfig;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import mv.e0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.collections.p;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import yv.f;
import yv.g;
import yv.h;
import yv.i;
import yv.j;
import yv.k;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 %2\u00020\u00012\u00020\u0002:\u000202B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020$2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b%\u0010&J)\u0010+\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020\u00132\u0006\u0010(\u001a\u00020\t2\b\u0010*\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b+\u0010,R$\u00104\u001a\u0004\u0018\u00010-8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001a\u00107\u001a\b\u0012\u0004\u0012\u0002050\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u00106¨\u00068"}, d2 = {"Lokhttp3/internal/platform/b;", "Lokhttp3/internal/platform/c;", "Lxv/c;", "<init>", "()V", "Ljava/net/Socket;", "socket", "Ljava/net/InetSocketAddress;", "address", BuildConfig.FLAVOR, "connectTimeout", BuildConfig.FLAVOR, "h", "(Ljava/net/Socket;Ljava/net/InetSocketAddress;I)V", "Ljavax/net/ssl/SSLContext;", "o", "()Ljavax/net/ssl/SSLContext;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", BuildConfig.FLAVOR, "hostname", BuildConfig.FLAVOR, "Lmv/e0;", "protocols", "g", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "j", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", BuildConfig.FLAVOR, "l", "(Ljava/lang/String;)Z", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Lbw/c;", "e", "(Ljavax/net/ssl/X509TrustManager;)Lbw/c;", "Lbw/e;", "f", "(Ljavax/net/ssl/X509TrustManager;)Lbw/e;", "message", "level", BuildConfig.FLAVOR, "t", "m", "(Ljava/lang/String;ILjava/lang/Throwable;)V", "Landroid/content/Context;", "d", "Landroid/content/Context;", "b", "()Landroid/content/Context;", "a", "(Landroid/content/Context;)V", "applicationContext", "Lyv/j;", "Ljava/util/List;", "socketAdapters", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b extends c implements xv.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final String f28262g = "OkHttp";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final boolean f28263h;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Context applicationContext;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<j> socketAdapters;

    /* JADX INFO: renamed from: okhttp3.internal.platform.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0086D¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lokhttp3/internal/platform/b$a;", BuildConfig.FLAVOR, "<init>", "()V", "Lokhttp3/internal/platform/c;", "a", "()Lokhttp3/internal/platform/c;", BuildConfig.FLAVOR, "Tag", "Ljava/lang/String;", "b", "()Ljava/lang/String;", BuildConfig.FLAVOR, "isSupported", "Z", "c", "()Z", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final c a() {
            if (c()) {
                return new b();
            }
            return null;
        }

        @NotNull
        public final String b() {
            return b.f28262g;
        }

        public final boolean c() {
            return b.f28263h;
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.platform.b$b, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lokhttp3/internal/platform/b$b;", "Lbw/e;", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Ljava/lang/reflect/Method;", "findByIssuerAndSignatureMethod", "<init>", "(Ljavax/net/ssl/X509TrustManager;Ljava/lang/reflect/Method;)V", "Ljava/security/cert/X509Certificate;", "cert", "a", "(Ljava/security/cert/X509Certificate;)Ljava/security/cert/X509Certificate;", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "Ljavax/net/ssl/X509TrustManager;", "b", "Ljava/lang/reflect/Method;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CustomTrustRootIndex implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final X509TrustManager trustManager;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final Method findByIssuerAndSignatureMethod;

        public CustomTrustRootIndex(@NotNull X509TrustManager trustManager, @NotNull Method findByIssuerAndSignatureMethod) {
            Intrinsics.checkNotNullParameter(trustManager, "trustManager");
            Intrinsics.checkNotNullParameter(findByIssuerAndSignatureMethod, "findByIssuerAndSignatureMethod");
            this.trustManager = trustManager;
            this.findByIssuerAndSignatureMethod = findByIssuerAndSignatureMethod;
        }

        @Override // bw.e
        @Nullable
        public X509Certificate a(@NotNull X509Certificate cert) {
            Intrinsics.checkNotNullParameter(cert, "cert");
            try {
                Object objInvoke = this.findByIssuerAndSignatureMethod.invoke(this.trustManager, cert);
                Intrinsics.d(objInvoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
                return ((TrustAnchor) objInvoke).getTrustedCert();
            } catch (IllegalAccessException e10) {
                throw new AssertionError("unable to get issues and signature", e10);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CustomTrustRootIndex)) {
                return false;
            }
            CustomTrustRootIndex customTrustRootIndex = (CustomTrustRootIndex) other;
            return Intrinsics.c(this.trustManager, customTrustRootIndex.trustManager) && Intrinsics.c(this.findByIssuerAndSignatureMethod, customTrustRootIndex.findByIssuerAndSignatureMethod);
        }

        public int hashCode() {
            return (this.trustManager.hashCode() * 31) + this.findByIssuerAndSignatureMethod.hashCode();
        }

        @NotNull
        public String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.trustManager + ", findByIssuerAndSignatureMethod=" + this.findByIssuerAndSignatureMethod + ')';
        }
    }

    static {
        f28263h = c.INSTANCE.f() && Build.VERSION.SDK_INT < 29;
    }

    public b() {
        List listO = p.o(k.Companion.b(k.INSTANCE, null, 1, null), new i(f.INSTANCE.d()), new i(h.INSTANCE.b()), new i(g.INSTANCE.a()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listO) {
            if (((j) obj).a()) {
                arrayList.add(obj);
            }
        }
        this.socketAdapters = arrayList;
    }

    @Override // xv.c
    public void a(@Nullable Context context) {
        this.applicationContext = context;
    }

    @Override // xv.c
    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public Context getApplicationContext() {
        return this.applicationContext;
    }

    @Override // okhttp3.internal.platform.c
    @NotNull
    public bw.c e(@NotNull X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        yv.b bVarA = yv.b.INSTANCE.a(trustManager);
        return bVarA != null ? bVarA : super.e(trustManager);
    }

    @Override // okhttp3.internal.platform.c
    @NotNull
    public e f(@NotNull X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        try {
            StrictMode.noteSlowCall("buildTrustRootIndex");
            Method declaredMethod = trustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            Intrinsics.checkNotNull(declaredMethod);
            return new CustomTrustRootIndex(trustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.f(trustManager);
        }
    }

    @Override // okhttp3.internal.platform.c
    public void g(@NotNull SSLSocket sslSocket, @Nullable String hostname, @NotNull List<e0> protocols) {
        Object next;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Iterator<T> it = this.socketAdapters.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((j) next).b(sslSocket));
        j jVar = (j) next;
        if (jVar != null) {
            jVar.d(sslSocket, hostname, protocols);
        }
    }

    @Override // okhttp3.internal.platform.c
    public void h(@NotNull Socket socket, @NotNull InetSocketAddress address, int connectTimeout) throws IOException {
        Intrinsics.checkNotNullParameter(socket, "socket");
        Intrinsics.checkNotNullParameter(address, "address");
        try {
            socket.connect(address, connectTimeout);
        } catch (ClassCastException e10) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e10;
            }
            throw new IOException("Exception in connect", e10);
        }
    }

    @Override // okhttp3.internal.platform.c
    @Nullable
    public String j(@NotNull SSLSocket sslSocket) {
        Object next;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Iterator<T> it = this.socketAdapters.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((j) next).b(sslSocket));
        j jVar = (j) next;
        if (jVar != null) {
            return jVar.c(sslSocket);
        }
        return null;
    }

    @Override // okhttp3.internal.platform.c
    public boolean l(@NotNull String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }

    @Override // okhttp3.internal.platform.c
    public void m(@NotNull String message, int level, @Nullable Throwable t8) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (level == 5) {
            Log.w(f28262g, message, t8);
        } else {
            Log.i(f28262g, message, t8);
        }
    }

    @Override // okhttp3.internal.platform.c
    @NotNull
    public SSLContext o() {
        StrictMode.noteSlowCall("newSSLContext");
        return super.o();
    }
}
