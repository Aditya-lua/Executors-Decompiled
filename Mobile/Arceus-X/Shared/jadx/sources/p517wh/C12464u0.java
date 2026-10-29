package p517wh;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import androidx.core.app.NotificationCompat;
import androidx.p616lifecycle.InterfaceC0954f;
import androidx.p616lifecycle.InterfaceC0980s;
import com.roblox.engine.jni.NativeGLInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p261l2.C7975b;
import p394qt.C10708b;
import p394qt.InterfaceC10707a;

/* JADX INFO: renamed from: wh.u0 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0018B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u001b\u0010\r\u001a\u00020\u0006*\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\u0004\u0018\u00010\n*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, m31665d2 = {"Lwh/u0;", "Landroidx/lifecycle/f;", "<init>", "()V", "Landroidx/lifecycle/s;", "owner", "", "onCreate", "(Landroidx/lifecycle/s;)V", "onDestroy", "Landroid/net/ConnectivityManager;", "Lwh/u0$a;", NotificationCompat.CATEGORY_STATUS, "e", "(Landroid/net/ConnectivityManager;Lwh/u0$a;)V", "d", "(Landroid/net/ConnectivityManager;)Lwh/u0$a;", "Landroid/net/ConnectivityManager$NetworkCallback;", "b", "Landroid/net/ConnectivityManager$NetworkCallback;", "networkCallback", "c", "(Landroidx/lifecycle/s;)Landroid/net/ConnectivityManager;", "connectivityManager", "a", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C12464u0 implements InterfaceC0954f {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C12464u0 f44579a = new C12464u0();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static ConnectivityManager.NetworkCallback networkCallback;

    /* JADX INFO: renamed from: wh.u0$a */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m31665d2 = {"Lwh/u0$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public enum a {
        NONE,
        WIFI,
        CELLULAR,
        OTHER;


        /* JADX INFO: renamed from: f */
        public static final /* synthetic */ InterfaceC10707a f44586f = C10708b.m40805a(m46710a());
    }

    /* JADX INFO: renamed from: wh.u0$b */
    @Metadata(m31664d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, m31665d2 = {"wh/u0$b", "Landroid/net/ConnectivityManager$NetworkCallback;", "Landroid/net/Network;", "network", "", "onAvailable", "(Landroid/net/Network;)V", "onLost", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class b extends ConnectivityManager.NetworkCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ConnectivityManager f44587a;

        public b(ConnectivityManager connectivityManager) {
            this.f44587a = connectivityManager;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            Intrinsics.checkNotNullParameter(network, "network");
            C12464u0 c12464u0 = C12464u0.f44579a;
            ConnectivityManager connectivityManager = this.f44587a;
            c12464u0.m46709e(connectivityManager, c12464u0.m46708d(connectivityManager));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            Intrinsics.checkNotNullParameter(network, "network");
            C12464u0.f44579a.m46709e(this.f44587a, a.NONE);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: androidx.lifecycle.s */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public final ConnectivityManager m46707c(InterfaceC0980s interfaceC0980s) {
        Context context = interfaceC0980s instanceof Context ? (Context) interfaceC0980s : null;
        if (context != null) {
            return (ConnectivityManager) C7975b.m33013k(context, ConnectivityManager.class);
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final a m46708d(ConnectivityManager connectivityManager) {
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

    /* JADX INFO: renamed from: e */
    public final void m46709e(ConnectivityManager connectivityManager, a aVar) {
        NativeGLInterface.reportNetworkStateChanged(aVar.ordinal());
    }

    @Override // androidx.p616lifecycle.InterfaceC0954f
    public void onCreate(@NotNull InterfaceC0980s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        ConnectivityManager connectivityManagerM46707c = m46707c(owner);
        if (connectivityManagerM46707c == null) {
            return;
        }
        m46709e(connectivityManagerM46707c, m46708d(connectivityManagerM46707c));
        networkCallback = new b(connectivityManagerM46707c);
        NetworkRequest networkRequestBuild = new NetworkRequest.Builder().build();
        ConnectivityManager.NetworkCallback networkCallback2 = networkCallback;
        if (networkCallback2 == null) {
            Intrinsics.m31998u("networkCallback");
            networkCallback2 = null;
        }
        connectivityManagerM46707c.registerNetworkCallback(networkRequestBuild, networkCallback2);
    }

    @Override // androidx.p616lifecycle.InterfaceC0954f
    public void onDestroy(@NotNull InterfaceC0980s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        ConnectivityManager connectivityManagerM46707c = m46707c(owner);
        if (connectivityManagerM46707c != null) {
            ConnectivityManager.NetworkCallback networkCallback2 = networkCallback;
            if (networkCallback2 == null) {
                Intrinsics.m31998u("networkCallback");
                networkCallback2 = null;
            }
            connectivityManagerM46707c.unregisterNetworkCallback(networkCallback2);
        }
    }

    @Override // androidx.p616lifecycle.InterfaceC0954f
    public /* bridge */ void onPause(@NotNull InterfaceC0980s interfaceC0980s) {
        super.onPause(interfaceC0980s);
    }

    @Override // androidx.p616lifecycle.InterfaceC0954f
    public /* bridge */ void onResume(@NotNull InterfaceC0980s interfaceC0980s) {
        super.onResume(interfaceC0980s);
    }

    @Override // androidx.p616lifecycle.InterfaceC0954f
    public /* bridge */ void onStart(@NotNull InterfaceC0980s interfaceC0980s) {
        super.onStart(interfaceC0980s);
    }

    @Override // androidx.p616lifecycle.InterfaceC0954f
    public /* bridge */ void onStop(@NotNull InterfaceC0980s interfaceC0980s) {
        super.onStop(interfaceC0980s);
    }
}
