package yv;

import com.github.luben.zstd.BuildConfig;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import mv.e0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.text.Charsets;
import p001kotlin.text.x;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000  2\u00020\u0001:\u0001\bB\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0013\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0004\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019R\u001c\u0010\u001c\u001a\n \u001b*\u0004\u0018\u00010\u00180\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0019R\u001c\u0010\u001d\u001a\n \u001b*\u0004\u0018\u00010\u00180\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0019R\u001c\u0010\u001f\u001a\n \u001b*\u0004\u0018\u00010\u00180\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019¨\u0006!"}, d2 = {"Lyv/f;", "Lyv/j;", "Ljava/lang/Class;", "Ljavax/net/ssl/SSLSocket;", "sslSocketClass", "<init>", "(Ljava/lang/Class;)V", BuildConfig.FLAVOR, "a", "()Z", "sslSocket", "b", "(Ljavax/net/ssl/SSLSocket;)Z", BuildConfig.FLAVOR, "hostname", BuildConfig.FLAVOR, "Lmv/e0;", "protocols", BuildConfig.FLAVOR, "d", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "c", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "Ljava/lang/Class;", "Ljava/lang/reflect/Method;", "Ljava/lang/reflect/Method;", "setUseSessionTickets", "kotlin.jvm.PlatformType", "setHostname", "getAlpnSelectedProtocol", "e", "setAlpnProtocols", "f", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class f implements j {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final i.a f38209g;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Class<? super SSLSocket> sslSocketClass;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Method setUseSessionTickets;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final Method setHostname;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final Method getAlpnSelectedProtocol;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final Method setAlpnProtocols;

    /* JADX INFO: renamed from: yv.f$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0000\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lyv/f$a;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "packageName", "Lyv/i$a;", "c", "(Ljava/lang/String;)Lyv/i$a;", "Ljava/lang/Class;", "Ljavax/net/ssl/SSLSocket;", "actualSSLSocketClass", "Lyv/f;", "b", "(Ljava/lang/Class;)Lyv/f;", "playProviderFactory", "Lyv/i$a;", "d", "()Lyv/i$a;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: yv.f$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"yv/f$a$a", "Lyv/i$a;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", BuildConfig.FLAVOR, "b", "(Ljavax/net/ssl/SSLSocket;)Z", "Lyv/j;", "c", "(Ljavax/net/ssl/SSLSocket;)Lyv/j;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class C0777a implements i.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f38214a;

            public C0777a(String str) {
                this.f38214a = str;
            }

            @Override // yv.i.a
            public boolean b(SSLSocket sslSocket) {
                Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
                String name = sslSocket.getClass().getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                return x.T(name, this.f38214a + '.', false, 2, null);
            }

            @Override // yv.i.a
            public j c(SSLSocket sslSocket) {
                Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
                return f.INSTANCE.b(sslSocket.getClass());
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f b(Class<? super SSLSocket> actualSSLSocketClass) {
            Class<? super SSLSocket> superclass = actualSSLSocketClass;
            while (superclass != null && !Intrinsics.c(superclass.getSimpleName(), "OpenSSLSocketImpl")) {
                superclass = superclass.getSuperclass();
                if (superclass == null) {
                    throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + actualSSLSocketClass);
                }
            }
            Intrinsics.checkNotNull(superclass);
            return new f(superclass);
        }

        @NotNull
        public final i.a c(@NotNull String packageName) {
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            return new C0777a(packageName);
        }

        @NotNull
        public final i.a d() {
            return f.f38209g;
        }

        public Companion() {
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        f38209g = companion.c("com.google.android.gms.org.conscrypt");
    }

    public f(@NotNull Class<? super SSLSocket> sslSocketClass) throws NoSuchMethodException {
        Intrinsics.checkNotNullParameter(sslSocketClass, "sslSocketClass");
        this.sslSocketClass = sslSocketClass;
        Method declaredMethod = sslSocketClass.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        Intrinsics.checkNotNullExpressionValue(declaredMethod, "getDeclaredMethod(...)");
        this.setUseSessionTickets = declaredMethod;
        this.setHostname = sslSocketClass.getMethod("setHostname", String.class);
        this.getAlpnSelectedProtocol = sslSocketClass.getMethod("getAlpnSelectedProtocol", null);
        this.setAlpnProtocols = sslSocketClass.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // yv.j
    public boolean a() {
        return okhttp3.internal.platform.b.INSTANCE.c();
    }

    @Override // yv.j
    public boolean b(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return this.sslSocketClass.isInstance(sslSocket);
    }

    @Override // yv.j
    @Nullable
    public String c(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (!b(sslSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.getAlpnSelectedProtocol.invoke(sslSocket, null);
            if (bArr != null) {
                return new String(bArr, Charsets.UTF_8);
            }
            return null;
        } catch (IllegalAccessException e10) {
            throw new AssertionError(e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if ((cause instanceof NullPointerException) && Intrinsics.c(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e11);
        }
    }

    @Override // yv.j
    public void d(@NotNull SSLSocket sslSocket, @Nullable String hostname, @NotNull List<? extends e0> protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (b(sslSocket)) {
            try {
                this.setUseSessionTickets.invoke(sslSocket, Boolean.TRUE);
                this.setAlpnProtocols.invoke(sslSocket, okhttp3.internal.platform.c.INSTANCE.c(protocols));
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InvocationTargetException e11) {
                throw new AssertionError(e11);
            }
        }
    }
}
