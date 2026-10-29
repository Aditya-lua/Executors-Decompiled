package p069d6;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p026b6.NetworkState;
import p146g6.C6036p;
import p161h6.InterfaceC6292b;
import p536x5.AbstractC12732w;

/* JADX INFO: renamed from: d6.k */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000A\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\b\u0004*\u0001\u001b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001c¨\u0006\u001e"}, m31665d2 = {"Ld6/k;", "Ld6/h;", "Lb6/h;", "Landroid/content/Context;", "context", "Lh6/b;", "taskExecutor", "<init>", "(Landroid/content/Context;Lh6/b;)V", "o", "()Lb6/h;", "", "i", "()V", "j", "Landroid/net/ConnectivityManager;", "f", "Landroid/net/ConnectivityManager;", "connectivityManager", "", "g", "Ljava/lang/Object;", "lock", "", "h", "Z", "isBlocked", "d6/k$a", "Ld6/k$a;", "networkCallback", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C4460k extends AbstractC4457h<NetworkState> {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final ConnectivityManager connectivityManager;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final Object lock;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public volatile boolean isBlocked;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final a networkCallback;

    /* JADX INFO: renamed from: d6.k$a */
    @Metadata(m31664d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"d6/k$a", "Landroid/net/ConnectivityManager$NetworkCallback;", "Landroid/net/Network;", "network", "Landroid/net/NetworkCapabilities;", "capabilities", "", "onCapabilitiesChanged", "(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V", "onLost", "(Landroid/net/Network;)V", "", "blocked", "onBlockedStatusChanged", "(Landroid/net/Network;Z)V", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class a extends ConnectivityManager.NetworkCallback {
        public a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onBlockedStatusChanged(Network network, boolean blocked) {
            Intrinsics.checkNotNullParameter(network, "network");
            if (Intrinsics.m31980c(network, C4460k.this.connectivityManager.getActiveNetwork())) {
                AbstractC12732w.m47441e().mo47444a(C4459j.f18470a, "Network blocked status changed: " + blocked);
                NetworkState networkStateM22389e = C4460k.this.m22389e();
                Object obj = C4460k.this.lock;
                C4460k c4460k = C4460k.this;
                synchronized (obj) {
                    if (c4460k.isBlocked == blocked) {
                        return;
                    }
                    c4460k.isBlocked = blocked;
                    Unit unit = Unit.f29331a;
                    C4460k.this.m22391h(NetworkState.m6946b(networkStateM22389e, false, false, false, false, blocked, 15, null));
                }
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities capabilities) {
            Intrinsics.checkNotNullParameter(network, "network");
            Intrinsics.checkNotNullParameter(capabilities, "capabilities");
            AbstractC12732w.m47441e().mo47444a(C4459j.f18470a, "Network capabilities changed: " + capabilities);
            C4460k c4460k = C4460k.this;
            c4460k.m22391h(C4459j.m22395c(c4460k.connectivityManager, C4460k.this.isBlocked));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            Intrinsics.checkNotNullParameter(network, "network");
            AbstractC12732w.m47441e().mo47444a(C4459j.f18470a, "Network connection lost");
            C4460k.this.m22391h(new NetworkState(false, false, false, false, false));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4460k(@NotNull Context context, @NotNull InterfaceC6292b taskExecutor) {
        super(context, taskExecutor);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        Object systemService = getAppContext().getSystemService("connectivity");
        Intrinsics.m31981d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.connectivityManager = (ConnectivityManager) systemService;
        this.lock = new Object();
        this.networkCallback = new a();
    }

    @Override // p069d6.AbstractC4457h
    /* JADX INFO: renamed from: i */
    public void mo22382i() {
        try {
            AbstractC12732w.m47441e().mo47444a(C4459j.f18470a, "Registering network callback");
            C6036p.m26843a(this.connectivityManager, this.networkCallback);
        } catch (IllegalArgumentException e10) {
            AbstractC12732w.m47441e().mo47447d(C4459j.f18470a, "Received exception while registering network callback", e10);
        } catch (SecurityException e11) {
            AbstractC12732w.m47441e().mo47447d(C4459j.f18470a, "Received exception while registering network callback", e11);
        }
    }

    @Override // p069d6.AbstractC4457h
    /* JADX INFO: renamed from: j */
    public void mo22383j() {
        try {
            AbstractC12732w.m47441e().mo47444a(C4459j.f18470a, "Unregistering network callback");
            this.connectivityManager.unregisterNetworkCallback(this.networkCallback);
        } catch (IllegalArgumentException e10) {
            AbstractC12732w.m47441e().mo47447d(C4459j.f18470a, "Received exception while unregistering network callback", e10);
        } catch (SecurityException e11) {
            AbstractC12732w.m47441e().mo47447d(C4459j.f18470a, "Received exception while unregistering network callback", e11);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: f()Ljava/lang/Object; */
    @Override // p069d6.AbstractC4457h
    @NotNull
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public NetworkState mo22374f() {
        return C4459j.m22395c(this.connectivityManager, this.isBlocked);
    }
}
