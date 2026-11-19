package okhttp3.internal.platform;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.StrictMode;
import android.security.NetworkSecurityPolicy;
import android.util.CloseGuard;
import android.util.Log;
import bw.e;
import com.github.luben.zstd.BuildConfig;
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

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000b2\u00020\u00012\u00020\u0002:\u00012B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0019\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u000f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020!2\u0006\u0010\u0010\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020$2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b%\u0010&J)\u0010+\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020'2\b\u0010*\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b+\u0010,R$\u00104\u001a\u0004\u0018\u00010-8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001a\u00107\u001a\b\u0012\u0004\u0012\u0002050\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u00106¨\u00068"}, d2 = {"Lokhttp3/internal/platform/a;", "Lokhttp3/internal/platform/c;", "Lxv/c;", "<init>", "()V", "Ljavax/net/ssl/SSLContext;", "o", "()Ljavax/net/ssl/SSLContext;", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Lbw/e;", "f", "(Ljavax/net/ssl/X509TrustManager;)Lbw/e;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", BuildConfig.FLAVOR, "hostname", BuildConfig.FLAVOR, "Lmv/e0;", "protocols", BuildConfig.FLAVOR, "g", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "j", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "closer", BuildConfig.FLAVOR, "k", "(Ljava/lang/String;)Ljava/lang/Object;", "message", "stackTrace", "n", "(Ljava/lang/String;Ljava/lang/Object;)V", BuildConfig.FLAVOR, "l", "(Ljava/lang/String;)Z", "Lbw/c;", "e", "(Ljavax/net/ssl/X509TrustManager;)Lbw/c;", BuildConfig.FLAVOR, "level", BuildConfig.FLAVOR, "t", "m", "(Ljava/lang/String;ILjava/lang/Throwable;)V", "Landroid/content/Context;", "d", "Landroid/content/Context;", "b", "()Landroid/content/Context;", "a", "(Landroid/content/Context;)V", "applicationContext", "Lyv/j;", "Ljava/util/List;", "socketAdapters", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a extends c implements xv.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f28258g;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Context applicationContext;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<j> socketAdapters;

    /* JADX INFO: renamed from: okhttp3.internal.platform.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lokhttp3/internal/platform/a$a;", BuildConfig.FLAVOR, "<init>", "()V", "Lokhttp3/internal/platform/c;", "a", "()Lokhttp3/internal/platform/c;", BuildConfig.FLAVOR, "isSupported", "Z", "b", "()Z", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final c a() {
            if (b()) {
                return new a();
            }
            return null;
        }

        public final boolean b() {
            return a.f28258g;
        }

        public Companion() {
        }
    }

    static {
        f28258g = c.INSTANCE.f() && Build.VERSION.SDK_INT >= 29;
    }

    public a() {
        List listO = p.o(yv.a.INSTANCE.a(), new i(f.INSTANCE.d()), new i(h.INSTANCE.b()), new i(g.INSTANCE.a()));
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
        StrictMode.noteSlowCall("buildTrustRootIndex");
        return super.f(trustManager);
    }

    @Override // okhttp3.internal.platform.c
    public void g(@NotNull SSLSocket sslSocket, @Nullable String hostname, @NotNull List<? extends e0> protocols) {
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
    @Nullable
    public Object k(@NotNull String closer) {
        Intrinsics.checkNotNullParameter(closer, "closer");
        if (Build.VERSION.SDK_INT < 30) {
            return super.k(closer);
        }
        CloseGuard closeGuardA = xv.a.a();
        closeGuardA.open(closer);
        return closeGuardA;
    }

    @Override // okhttp3.internal.platform.c
    @SuppressLint({"NewApi"})
    public boolean l(@NotNull String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }

    @Override // okhttp3.internal.platform.c
    public void m(@NotNull String message, int level, @Nullable Throwable t8) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (level == 5) {
            Log.w(b.INSTANCE.b(), message, t8);
        } else {
            Log.i(b.INSTANCE.b(), message, t8);
        }
    }

    @Override // okhttp3.internal.platform.c
    public void n(@NotNull String message, @Nullable Object stackTrace) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (Build.VERSION.SDK_INT < 30) {
            super.n(message, stackTrace);
        } else {
            Intrinsics.d(stackTrace, "null cannot be cast to non-null type android.util.CloseGuard");
            xv.b.a(stackTrace).warnIfOpen();
        }
    }

    @Override // okhttp3.internal.platform.c
    @NotNull
    public SSLContext o() {
        StrictMode.noteSlowCall("newSSLContext");
        return super.o();
    }
}
