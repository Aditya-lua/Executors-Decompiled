package wh;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import com.roblox.engine.jni.NativeGLInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0018B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u001b\u0010\r\u001a\u00020\u0006*\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\u0004\u0018\u00010\n*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lwh/u0;", "Landroidx/lifecycle/f;", "<init>", "()V", "Landroidx/lifecycle/s;", "owner", "", "onCreate", "(Landroidx/lifecycle/s;)V", "onDestroy", "Landroid/net/ConnectivityManager;", "Lwh/u0$a;", "status", "e", "(Landroid/net/ConnectivityManager;Lwh/u0$a;)V", "d", "(Landroid/net/ConnectivityManager;)Lwh/u0$a;", "Landroid/net/ConnectivityManager$NetworkCallback;", "b", "Landroid/net/ConnectivityManager$NetworkCallback;", "networkCallback", "c", "(Landroidx/lifecycle/s;)Landroid/net/ConnectivityManager;", "connectivityManager", "a", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class u0 implements androidx.p000lifecycle.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final u0 f34384a = new u0();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static ConnectivityManager.NetworkCallback networkCallback;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lwh/u0$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum a {
        NONE,
        WIFI,
        CELLULAR,
        OTHER;


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ qt.a f34389f = qt.b.a(a());
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"wh/u0$b", "Landroid/net/ConnectivityManager$NetworkCallback;", "Landroid/net/Network;", "network", "", "onAvailable", "(Landroid/net/Network;)V", "onLost", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b extends ConnectivityManager.NetworkCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ConnectivityManager f34390a;

        public b(ConnectivityManager connectivityManager) {
            this.f34390a = connectivityManager;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            Intrinsics.checkNotNullParameter(network, "network");
            u0 u0Var = u0.f34384a;
            ConnectivityManager connectivityManager = this.f34390a;
            u0Var.e(connectivityManager, u0Var.d(connectivityManager));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            Intrinsics.checkNotNullParameter(network, "network");
            u0.f34384a.e(this.f34390a, a.NONE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ConnectivityManager c(androidx.p000lifecycle.s sVar) {
        Context context = sVar instanceof Context ? (Context) sVar : null;
        if (context != null) {
            return (ConnectivityManager) l2.b.k(context, ConnectivityManager.class);
        }
        return null;
    }

    public final a d(ConnectivityManager connectivityManager) {
        NetworkCapabilities networkCapabilities;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) {
            if (networkCapabilities.hasTransport(1)) {
                return a.WIFI;
            }
            return networkCapabilities.hasTransport(0) ? a.CELLULAR : a.OTHER;
        }
        return a.NONE;
    }

    public final void e(ConnectivityManager connectivityManager, a aVar) {
        NativeGLInterface.reportNetworkStateChanged(aVar.ordinal());
    }

    @Override // androidx.p000lifecycle.f
    public void onCreate(@NotNull androidx.p000lifecycle.s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        ConnectivityManager connectivityManagerC = c(owner);
        if (connectivityManagerC == null) {
            return;
        }
        e(connectivityManagerC, d(connectivityManagerC));
        networkCallback = new b(connectivityManagerC);
        NetworkRequest networkRequestBuild = new NetworkRequest.Builder().build();
        ConnectivityManager.NetworkCallback networkCallback2 = networkCallback;
        if (networkCallback2 == null) {
            Intrinsics.u("networkCallback");
            networkCallback2 = null;
        }
        connectivityManagerC.registerNetworkCallback(networkRequestBuild, networkCallback2);
    }

    @Override // androidx.p000lifecycle.f
    public void onDestroy(@NotNull androidx.p000lifecycle.s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        ConnectivityManager connectivityManagerC = c(owner);
        if (connectivityManagerC != null) {
            ConnectivityManager.NetworkCallback networkCallback2 = networkCallback;
            if (networkCallback2 == null) {
                Intrinsics.u("networkCallback");
                networkCallback2 = null;
            }
            connectivityManagerC.unregisterNetworkCallback(networkCallback2);
        }
    }

    @Override // androidx.p000lifecycle.f
    public /* bridge */ void onPause(@NotNull androidx.p000lifecycle.s sVar) {
        super.onPause(sVar);
    }

    @Override // androidx.p000lifecycle.f
    public /* bridge */ void onResume(@NotNull androidx.p000lifecycle.s sVar) {
        super.onResume(sVar);
    }

    @Override // androidx.p000lifecycle.f
    public /* bridge */ void onStart(@NotNull androidx.p000lifecycle.s sVar) {
        super.onStart(sVar);
    }

    @Override // androidx.p000lifecycle.f
    public /* bridge */ void onStop(@NotNull androidx.p000lifecycle.s sVar) {
        super.onStop(sVar);
    }
}
