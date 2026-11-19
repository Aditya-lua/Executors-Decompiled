package okhttp3.internal.platform;

import com.github.luben.zstd.BuildConfig;
import ew.e;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import mv.d0;
import mv.e0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.collections.q;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 <2\u00020\u0001:\u0001<B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010 \u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J-\u0010&\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u00042\b\b\u0002\u0010#\u001a\u00020\u001e2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020(2\u0006\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b)\u0010*J\u0019\u0010,\u001a\u0004\u0018\u00010\u00012\u0006\u0010+\u001a\u00020\u0004H\u0016¢\u0006\u0004\b,\u0010-J!\u0010/\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u00042\b\u0010.\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u0002022\u0006\u00101\u001a\u00020\nH\u0016¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u0002052\u0006\u00101\u001a\u00020\nH\u0016¢\u0006\u0004\b6\u00107J\u0017\u00109\u001a\u0002082\u0006\u00101\u001a\u00020\nH\u0016¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u0004H\u0016¢\u0006\u0004\b;\u0010\u0006¨\u0006="}, d2 = {"Lokhttp3/internal/platform/c;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "i", "()Ljava/lang/String;", "Ljavax/net/ssl/SSLContext;", "o", "()Ljavax/net/ssl/SSLContext;", "Ljavax/net/ssl/X509TrustManager;", "q", "()Ljavax/net/ssl/X509TrustManager;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "hostname", BuildConfig.FLAVOR, "Lmv/e0;", "protocols", BuildConfig.FLAVOR, "g", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "d", "(Ljavax/net/ssl/SSLSocket;)V", "j", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "Ljava/net/Socket;", "socket", "Ljava/net/InetSocketAddress;", "address", BuildConfig.FLAVOR, "connectTimeout", "h", "(Ljava/net/Socket;Ljava/net/InetSocketAddress;I)V", "message", "level", BuildConfig.FLAVOR, "t", "m", "(Ljava/lang/String;ILjava/lang/Throwable;)V", BuildConfig.FLAVOR, "l", "(Ljava/lang/String;)Z", "closer", "k", "(Ljava/lang/String;)Ljava/lang/Object;", "stackTrace", "n", "(Ljava/lang/String;Ljava/lang/Object;)V", "trustManager", "Lbw/c;", "e", "(Ljavax/net/ssl/X509TrustManager;)Lbw/c;", "Lbw/e;", "f", "(Ljavax/net/ssl/X509TrustManager;)Lbw/e;", "Ljavax/net/ssl/SSLSocketFactory;", "p", "(Ljavax/net/ssl/X509TrustManager;)Ljavax/net/ssl/SSLSocketFactory;", "toString", "a", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    public static volatile c b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f28268c;

    /* JADX INFO: renamed from: okhttp3.internal.platform.c$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000e\u001a\u00020\r2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0006R\u0011\u0010\u0014\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001d\u001a\n \u001c*\u0004\u0018\u00010\u001b0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lokhttp3/internal/platform/c$a;", BuildConfig.FLAVOR, "<init>", "()V", "Lokhttp3/internal/platform/c;", "e", "()Lokhttp3/internal/platform/c;", BuildConfig.FLAVOR, "Lmv/e0;", "protocols", BuildConfig.FLAVOR, "b", "(Ljava/util/List;)Ljava/util/List;", BuildConfig.FLAVOR, "c", "(Ljava/util/List;)[B", "d", BuildConfig.FLAVOR, "f", "()Z", "isAndroid", "platform", "Lokhttp3/internal/platform/c;", BuildConfig.FLAVOR, "INFO", "I", "WARN", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "logger", "Ljava/util/logging/Logger;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<String> b(@NotNull List<? extends e0> protocols) {
            Intrinsics.checkNotNullParameter(protocols, "protocols");
            ArrayList arrayList = new ArrayList();
            for (Object obj : protocols) {
                if (((e0) obj) != e0.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(q.u(arrayList, 10));
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj2 = arrayList.get(i10);
                i10++;
                arrayList2.add(((e0) obj2).getProtocol());
            }
            return arrayList2;
        }

        @NotNull
        public final byte[] c(@NotNull List<? extends e0> protocols) {
            Intrinsics.checkNotNullParameter(protocols, "protocols");
            e eVar = new e();
            for (String str : b(protocols)) {
                eVar.writeByte(str.length());
                eVar.D0(str);
            }
            return eVar.a2();
        }

        public final c d() {
            return d.f28269a.a();
        }

        @NotNull
        public final c e() {
            return c.b;
        }

        public final boolean f() {
            return d.f28269a.c();
        }

        public Companion() {
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        b = companion.d();
        f28268c = Logger.getLogger(d0.class.getName());
    }

    public void d(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
    }

    @NotNull
    public bw.c e(@NotNull X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        return new bw.a(f(trustManager));
    }

    @NotNull
    public bw.e f(@NotNull X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        X509Certificate[] acceptedIssuers = trustManager.getAcceptedIssuers();
        return new bw.b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void g(@NotNull SSLSocket sslSocket, @Nullable String hostname, @NotNull List<e0> protocols) {
        throw null;
    }

    public void h(@NotNull Socket socket, @NotNull InetSocketAddress address, int connectTimeout) throws IOException {
        Intrinsics.checkNotNullParameter(socket, "socket");
        Intrinsics.checkNotNullParameter(address, "address");
        socket.connect(address, connectTimeout);
    }

    @NotNull
    public final String i() {
        return "OkHttp";
    }

    @Nullable
    public String j(@NotNull SSLSocket sslSocket) {
        throw null;
    }

    @Nullable
    public Object k(@NotNull String closer) {
        Intrinsics.checkNotNullParameter(closer, "closer");
        if (f28268c.isLoggable(Level.FINE)) {
            return new Throwable(closer);
        }
        return null;
    }

    public boolean l(@NotNull String hostname) {
        throw null;
    }

    public void m(@NotNull String message, int level, @Nullable Throwable t8) {
        throw null;
    }

    public void n(@NotNull String message, @Nullable Object stackTrace) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (stackTrace == null) {
            message = message + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        m(message, 5, (Throwable) stackTrace);
    }

    @NotNull
    public SSLContext o() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        Intrinsics.checkNotNullExpressionValue(sSLContext, "getInstance(...)");
        return sSLContext;
    }

    @NotNull
    public SSLSocketFactory p(@NotNull X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        try {
            SSLContext sSLContextO = o();
            sSLContextO.init(null, new TrustManager[]{trustManager}, null);
            SSLSocketFactory socketFactory = sSLContextO.getSocketFactory();
            Intrinsics.checkNotNullExpressionValue(socketFactory, "getSocketFactory(...)");
            return socketFactory;
        } catch (GeneralSecurityException e10) {
            throw new AssertionError("No System TLS: " + e10, e10);
        }
    }

    @NotNull
    public X509TrustManager q() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        Intrinsics.checkNotNull(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                Intrinsics.d(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                return (X509TrustManager) trustManager;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Unexpected default trust managers: ");
        String string = Arrays.toString(trustManagers);
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        sb2.append(string);
        throw new IllegalStateException(sb2.toString().toString());
    }

    @NotNull
    public String toString() {
        String simpleName = getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        return simpleName;
    }
}
