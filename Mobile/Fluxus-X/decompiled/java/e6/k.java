package e6;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import c6.NetworkState;
import com.github.luben.zstd.BuildConfig;
import h6.p;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.internal.Intrinsics;
import y5.w;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000A\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\b\u0004*\u0001\u001b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001c¨\u0006\u001e"}, d2 = {"Le6/k;", "Le6/h;", "Lc6/h;", "Landroid/content/Context;", "context", "Li6/b;", "taskExecutor", "<init>", "(Landroid/content/Context;Li6/b;)V", "o", "()Lc6/h;", BuildConfig.FLAVOR, "i", "()V", "j", "Landroid/net/ConnectivityManager;", "f", "Landroid/net/ConnectivityManager;", "connectivityManager", BuildConfig.FLAVOR, "g", "Ljava/lang/Object;", "lock", BuildConfig.FLAVOR, "h", "Z", "isBlocked", "e6/k$a", "Le6/k$a;", "networkCallback", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k extends h<NetworkState> {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ConnectivityManager connectivityManager;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Object lock;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public volatile boolean isBlocked;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final a networkCallback;

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"e6/k$a", "Landroid/net/ConnectivityManager$NetworkCallback;", "Landroid/net/Network;", "network", "Landroid/net/NetworkCapabilities;", "capabilities", BuildConfig.FLAVOR, "onCapabilitiesChanged", "(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V", "onLost", "(Landroid/net/Network;)V", BuildConfig.FLAVOR, "blocked", "onBlockedStatusChanged", "(Landroid/net/Network;Z)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends ConnectivityManager.NetworkCallback {
        public a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onBlockedStatusChanged(Network network, boolean blocked) {
            Intrinsics.checkNotNullParameter(network, "network");
            if (Intrinsics.c(network, k.this.connectivityManager.getActiveNetwork())) {
                w.e().a(j.f13203a, "Network blocked status changed: " + blocked);
                NetworkState networkStateE = k.this.e();
                Object obj = k.this.lock;
                k kVar = k.this;
                synchronized (obj) {
                    if (kVar.isBlocked == blocked) {
                        return;
                    }
                    kVar.isBlocked = blocked;
                    Unit unit = Unit.f21506a;
                    k.this.h(NetworkState.b(networkStateE, false, false, false, false, blocked, 15, null));
                }
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities capabilities) {
            Intrinsics.checkNotNullParameter(network, "network");
            Intrinsics.checkNotNullParameter(capabilities, "capabilities");
            w.e().a(j.f13203a, "Network capabilities changed: " + capabilities);
            k kVar = k.this;
            kVar.h(j.c(kVar.connectivityManager, k.this.isBlocked));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            Intrinsics.checkNotNullParameter(network, "network");
            w.e().a(j.f13203a, "Network connection lost");
            k.this.h(new NetworkState(false, false, false, false, false));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(@NotNull Context context, @NotNull i6.b taskExecutor) {
        super(context, taskExecutor);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        Object systemService = getAppContext().getSystemService("connectivity");
        Intrinsics.d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.connectivityManager = (ConnectivityManager) systemService;
        this.lock = new Object();
        this.networkCallback = new a();
    }

    @Override // e6.h
    public void i() {
        try {
            w.e().a(j.f13203a, "Registering network callback");
            p.a(this.connectivityManager, this.networkCallback);
        } catch (IllegalArgumentException e10) {
            w.e().d(j.f13203a, "Received exception while registering network callback", e10);
        } catch (SecurityException e11) {
            w.e().d(j.f13203a, "Received exception while registering network callback", e11);
        }
    }

    @Override // e6.h
    public void j() {
        try {
            w.e().a(j.f13203a, "Unregistering network callback");
            this.connectivityManager.unregisterNetworkCallback(this.networkCallback);
        } catch (IllegalArgumentException e10) {
            w.e().d(j.f13203a, "Received exception while unregistering network callback", e10);
        } catch (SecurityException e11) {
            w.e().d(j.f13203a, "Received exception while unregistering network callback", e11);
        }
    }

    @Override // e6.h
    @NotNull
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public NetworkState f() {
        return j.c(this.connectivityManager, this.isBlocked);
    }
}
