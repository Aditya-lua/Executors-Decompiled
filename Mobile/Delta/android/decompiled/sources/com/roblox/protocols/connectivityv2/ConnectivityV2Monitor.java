package com.roblox.protocols.connectivityv2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.LinkAddress;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import androidx.annotation.Keep;
import com.roblox.protocols.connectivityv2.ConnectivityV2Monitor;
import com.roblox.protocols.connectivityv2platforminterface.generated.IConnectivityV2CoreListener;
import com.roblox.protocols.connectivityv2platforminterface.generated.IPlatformConnectivityV2;
import com.roblox.protocols.connectivityv2platforminterface.generated.NetworkChangeReport;
import com.roblox.protocols.connectivityv2platforminterface.generated.NetworkChangeReportV2;
import com.roblox.protocols.connectivityv2platforminterface.generated.NetworkInterfaceType;
import com.roblox.protocols.connectivityv2platforminterface.generated.NetworkValidationState;
import ek.q;
import gt.o;
import gt.s;
import iu.j;
import iu.p0;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nt.f;
import nt.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rh.h;
import su.g;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002JKB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0003J3\u0010\u0019\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001c\u001a\u00020\u001b*\u00020\u0012H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u0016*\u00020\u0012H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010!\u001a\u00020\u0016*\u00020 H\u0002¢\u0006\u0004\b!\u0010\"J\u001b\u0010%\u001a\u0004\u0018\u00010$*\b\u0012\u0004\u0012\u00020$0#H\u0002¢\u0006\u0004\b%\u0010&J\u001b\u0010'\u001a\u0004\u0018\u00010$*\b\u0012\u0004\u0012\u00020$0#H\u0002¢\u0006\u0004\b'\u0010&J\u0013\u0010)\u001a\u00020\u0016*\u00020(H\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u000bH\u0016¢\u0006\u0004\b+\u0010\u0003J\u000f\u0010,\u001a\u00020\u000bH\u0016¢\u0006\u0004\b,\u0010\u0003J#\u00100\u001a\u00020-2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0001¢\u0006\u0004\b.\u0010/J-\u00104\u001a\u0002012\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b2\u00103R\u0014\u00106\u001a\u0002058\u0002X\u0082T¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010;\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010=\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010@\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010C\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010F\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010H\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010I¨\u0006L"}, d2 = {"Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;", "Lcom/roblox/protocols/connectivityv2platforminterface/generated/IPlatformConnectivityV2;", "<init>", "()V", "T", "Lkotlin/Function0;", "action", "withMonitorLock", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Landroid/content/Context;", "context", "", "setup", "(Landroid/content/Context;)V", "registerDataSaverReceiver", "unregisterDataSaverReceiver", "reportCurrentNetwork", "reportNoNetwork", "Landroid/net/NetworkCapabilities;", "capabilities", "Landroid/net/LinkProperties;", "linkProperties", "", "dataSaverEnabled", "meteringEnabled", "reportNetwork", "(Landroid/net/NetworkCapabilities;Landroid/net/LinkProperties;ZZ)V", "Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkInterfaceType;", "interfaceType", "(Landroid/net/NetworkCapabilities;)Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkInterfaceType;", "isMetered", "(Landroid/net/NetworkCapabilities;)Z", "Landroid/net/ConnectivityManager;", "isDataSaverEnabled", "(Landroid/net/ConnectivityManager;)Z", "", "Landroid/net/LinkAddress;", "firstUsableIpv4", "(Ljava/util/List;)Landroid/net/LinkAddress;", "firstUsableIpv6", "Ljava/net/InetAddress;", "isUsableAddress", "(Ljava/net/InetAddress;)Z", "startMonitoring", "stopMonitoring", "Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkChangeReport;", "buildReportLegacy$universalapp_googleProdRelease", "(Landroid/net/NetworkCapabilities;Landroid/net/LinkProperties;)Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkChangeReport;", "buildReportLegacy", "Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkChangeReportV2;", "buildReportV2$universalapp_googleProdRelease", "(Landroid/net/NetworkCapabilities;Landroid/net/LinkProperties;Z)Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkChangeReportV2;", "buildReportV2", "", "TAG", "Ljava/lang/String;", "Lsu/a;", "monitorMutex", "Lsu/a;", "applicationContext", "Landroid/content/Context;", "connectivityManager", "Landroid/net/ConnectivityManager;", "Landroid/net/ConnectivityManager$NetworkCallback;", "networkCallback", "Landroid/net/ConnectivityManager$NetworkCallback;", "Landroid/content/BroadcastReceiver;", "dataSaverReceiver", "Landroid/content/BroadcastReceiver;", "Lcom/roblox/protocols/connectivityv2platforminterface/generated/IConnectivityV2CoreListener;", "coreListener", "Lcom/roblox/protocols/connectivityv2platforminterface/generated/IConnectivityV2CoreListener;", "setupInProgress", "Z", "b", "a", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ConnectivityV2Monitor extends IPlatformConnectivityV2 {

    @NotNull
    private static final String TAG = "ConnectivityV2Monitor";

    @Nullable
    private static Context applicationContext;

    @Nullable
    private static ConnectivityManager connectivityManager;

    @Nullable
    private static IConnectivityV2CoreListener coreListener;

    @Nullable
    private static BroadcastReceiver dataSaverReceiver;

    @Nullable
    private static ConnectivityManager.NetworkCallback networkCallback;
    private static boolean setupInProgress;

    @NotNull
    public static final ConnectivityV2Monitor INSTANCE = new ConnectivityV2Monitor();

    @NotNull
    private static final su.a monitorMutex = g.b(false, 1, null);

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor$a;", "Landroid/content/BroadcastReceiver;", "Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;", "monitor", "<init>", "(Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;)V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "a", "Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final ConnectivityV2Monitor monitor;

        public a(@NotNull ConnectivityV2Monitor monitor) {
            Intrinsics.checkNotNullParameter(monitor, "monitor");
            this.monitor = monitor;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(@Nullable Context context, @Nullable Intent intent) {
            this.monitor.reportCurrentNetwork();
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u001f\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor$b;", "Landroid/net/ConnectivityManager$NetworkCallback;", "Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;", "monitor", "<init>", "(Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;)V", "Landroid/net/Network;", "network", "", "onAvailable", "(Landroid/net/Network;)V", "onLost", "Landroid/net/NetworkCapabilities;", "networkCapabilities", "onCapabilitiesChanged", "(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V", "Landroid/net/LinkProperties;", "linkProperties", "onLinkPropertiesChanged", "(Landroid/net/Network;Landroid/net/LinkProperties;)V", "a", "Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b extends ConnectivityManager.NetworkCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final ConnectivityV2Monitor monitor;

        public b(@NotNull ConnectivityV2Monitor monitor) {
            Intrinsics.checkNotNullParameter(monitor, "monitor");
            this.monitor = monitor;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(@NotNull Network network) {
            Intrinsics.checkNotNullParameter(network, "network");
            this.monitor.reportCurrentNetwork();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(@NotNull Network network, @NotNull NetworkCapabilities networkCapabilities) {
            Intrinsics.checkNotNullParameter(network, "network");
            Intrinsics.checkNotNullParameter(networkCapabilities, "networkCapabilities");
            this.monitor.reportCurrentNetwork();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLinkPropertiesChanged(@NotNull Network network, @NotNull LinkProperties linkProperties) {
            Intrinsics.checkNotNullParameter(network, "network");
            Intrinsics.checkNotNullParameter(linkProperties, "linkProperties");
            this.monitor.reportCurrentNetwork();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(@NotNull Network network) {
            Intrinsics.checkNotNullParameter(network, "network");
            this.monitor.reportNoNetwork();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @f(c = "com.roblox.protocols.connectivityv2.ConnectivityV2Monitor$withMonitorLock$1", f = "ConnectivityV2Monitor.kt", l = {343}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Liu/p0;", "<anonymous>"}, k = 3, mv = {2, 2, 0})
    public static final class c<T> extends m implements Function2<p0, lt.b<? super T>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f9768t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f9769u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f9770v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f9771w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ Function0<T> f9772x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Function0<? extends T> function0, lt.b<? super c> bVar) {
            super(2, bVar);
            this.f9772x = function0;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return new c(this.f9772x, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super T> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            su.a aVar;
            Function0<T> function0;
            Object objE = mt.c.e();
            int i10 = this.f9771w;
            if (i10 == 0) {
                o.b(obj);
                aVar = ConnectivityV2Monitor.monitorMutex;
                Function0<T> function1 = this.f9772x;
                this.f9768t = aVar;
                this.f9769u = function1;
                this.f9770v = 0;
                this.f9771w = 1;
                if (aVar.b(null, this) == objE) {
                    return objE;
                }
                function0 = function1;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function0 = (Function0) this.f9769u;
                aVar = (su.a) this.f9768t;
                o.b(obj);
            }
            try {
                return function0.invoke();
            } finally {
                aVar.f(null);
            }
        }
    }

    private ConnectivityV2Monitor() {
    }

    public static /* synthetic */ NetworkChangeReportV2 buildReportV2$universalapp_googleProdRelease$default(ConnectivityV2Monitor connectivityV2Monitor, NetworkCapabilities networkCapabilities, LinkProperties linkProperties, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return connectivityV2Monitor.buildReportV2$universalapp_googleProdRelease(networkCapabilities, linkProperties, z10);
    }

    private final LinkAddress firstUsableIpv4(List<? extends LinkAddress> list) {
        Object next;
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            next = it.next();
            InetAddress address = ((LinkAddress) next).getAddress();
            if ((address instanceof Inet4Address) && INSTANCE.isUsableAddress(address)) {
                return (LinkAddress) next;
            }
        }
        next = null;
        return (LinkAddress) next;
    }

    private final LinkAddress firstUsableIpv6(List<? extends LinkAddress> list) {
        Object next;
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            next = it.next();
            InetAddress address = ((LinkAddress) next).getAddress();
            if ((address instanceof Inet6Address) && INSTANCE.isUsableAddress(address)) {
                return (LinkAddress) next;
            }
        }
        next = null;
        return (LinkAddress) next;
    }

    private final NetworkInterfaceType interfaceType(NetworkCapabilities networkCapabilities) {
        if (networkCapabilities.hasTransport(1)) {
            return NetworkInterfaceType.WIFI;
        }
        if (networkCapabilities.hasTransport(0)) {
            return NetworkInterfaceType.CELLULAR;
        }
        return networkCapabilities.hasTransport(3) ? NetworkInterfaceType.WIRED : NetworkInterfaceType.UNKNOWN;
    }

    private final boolean isDataSaverEnabled(ConnectivityManager connectivityManager2) {
        return connectivityManager2.getRestrictBackgroundStatus() == 3;
    }

    private final boolean isMetered(NetworkCapabilities networkCapabilities) {
        if (networkCapabilities.hasCapability(11)) {
            return false;
        }
        return Build.VERSION.SDK_INT < 30 || !networkCapabilities.hasCapability(25);
    }

    private final boolean isUsableAddress(InetAddress inetAddress) {
        return (inetAddress.isAnyLocalAddress() || inetAddress.isLinkLocalAddress() || inetAddress.isLoopbackAddress()) ? false : true;
    }

    private final void registerDataSaverReceiver() {
        Pair pair = (Pair) withMonitorLock(new Function0() { // from class: fl.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ConnectivityV2Monitor.registerDataSaverReceiver$lambda$0();
            }
        });
        if (pair == null) {
            return;
        }
        Context context = (Context) pair.a();
        final a aVar = (a) pair.b();
        try {
            l2.b.m(context, aVar, new IntentFilter("android.net.conn.RESTRICT_BACKGROUND_CHANGED"), 4);
        } catch (RuntimeException e10) {
            withMonitorLock(new Function0() { // from class: fl.f
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ConnectivityV2Monitor.registerDataSaverReceiver$lambda$1(aVar);
                }
            });
            q.f(TAG, "Unable to register Data Saver receiver", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair registerDataSaverReceiver$lambda$0() {
        Context context = applicationContext;
        if (context == null || dataSaverReceiver != null) {
            return null;
        }
        a aVar = new a(INSTANCE);
        dataSaverReceiver = aVar;
        return s.a(context, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit registerDataSaverReceiver$lambda$1(a aVar) {
        if (dataSaverReceiver == aVar) {
            dataSaverReceiver = null;
        }
        return Unit.f22938a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reportCurrentNetwork() {
        ConnectivityManager connectivityManager2 = (ConnectivityManager) withMonitorLock(new Function0() { // from class: fl.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ConnectivityV2Monitor.connectivityManager;
            }
        });
        if (connectivityManager2 == null) {
            return;
        }
        Network activeNetwork = connectivityManager2.getActiveNetwork();
        NetworkCapabilities networkCapabilities = activeNetwork != null ? connectivityManager2.getNetworkCapabilities(activeNetwork) : null;
        LinkProperties linkProperties = activeNetwork != null ? connectivityManager2.getLinkProperties(activeNetwork) : null;
        boolean z10 = h.a().z();
        reportNetwork(networkCapabilities, linkProperties, z10 && isDataSaverEnabled(connectivityManager2), z10);
    }

    private final void reportNetwork(NetworkCapabilities capabilities, LinkProperties linkProperties, boolean dataSaverEnabled, boolean meteringEnabled) {
        if (meteringEnabled) {
            IConnectivityV2CoreListener iConnectivityV2CoreListener = coreListener;
            if (iConnectivityV2CoreListener != null) {
                iConnectivityV2CoreListener.reportNetworkChangedV2(buildReportV2$universalapp_googleProdRelease(capabilities, linkProperties, dataSaverEnabled));
                return;
            }
            return;
        }
        IConnectivityV2CoreListener iConnectivityV2CoreListener2 = coreListener;
        if (iConnectivityV2CoreListener2 != null) {
            iConnectivityV2CoreListener2.reportNetworkChanged(buildReportLegacy$universalapp_googleProdRelease(capabilities, linkProperties));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reportNoNetwork() {
        reportNetwork(null, null, false, h.a().z());
    }

    public static final void setup(@NotNull final Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ConnectivityV2Monitor connectivityV2Monitor = INSTANCE;
        if (((Boolean) connectivityV2Monitor.withMonitorLock(new Function0() { // from class: fl.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(ConnectivityV2Monitor.setup$lambda$0(context));
            }
        })).booleanValue()) {
            try {
                final IConnectivityV2CoreListener platformImpl = IConnectivityV2CoreListener.setPlatformImpl(connectivityV2Monitor);
                connectivityV2Monitor.withMonitorLock(new Function0() { // from class: fl.c
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ConnectivityV2Monitor.setup$lambda$2(platformImpl);
                    }
                });
                connectivityV2Monitor.startMonitoring();
            } catch (RuntimeException e10) {
                INSTANCE.withMonitorLock(new Function0() { // from class: fl.b
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ConnectivityV2Monitor.setup$lambda$1();
                    }
                });
                throw e10;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setup$lambda$0(Context context) {
        if (coreListener != null || setupInProgress) {
            return false;
        }
        setupInProgress = true;
        applicationContext = context.getApplicationContext();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setup$lambda$1() {
        setupInProgress = false;
        return Unit.f22938a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setup$lambda$2(IConnectivityV2CoreListener iConnectivityV2CoreListener) {
        setupInProgress = false;
        coreListener = iConnectivityV2CoreListener;
        return Unit.f22938a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair startMonitoring$lambda$0() {
        if (networkCallback != null) {
            return null;
        }
        Context context = applicationContext;
        ConnectivityManager connectivityManager2 = context != null ? (ConnectivityManager) context.getSystemService(ConnectivityManager.class) : null;
        if (connectivityManager2 == null) {
            q.k(TAG, "ConnectivityManager unavailable");
            return null;
        }
        b bVar = new b(INSTANCE);
        connectivityManager = connectivityManager2;
        networkCallback = bVar;
        return s.a(connectivityManager2, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startMonitoring$lambda$1(b bVar) {
        if (networkCallback == bVar) {
            networkCallback = null;
            connectivityManager = null;
        }
        return Unit.f22938a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair stopMonitoring$lambda$0() {
        ConnectivityManager connectivityManager2 = connectivityManager;
        ConnectivityManager.NetworkCallback networkCallback2 = networkCallback;
        if (connectivityManager2 == null || networkCallback2 == null) {
            return null;
        }
        connectivityManager = null;
        networkCallback = null;
        return s.a(connectivityManager2, networkCallback2);
    }

    private final void unregisterDataSaverReceiver() {
        Pair pair = (Pair) withMonitorLock(new Function0() { // from class: fl.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ConnectivityV2Monitor.unregisterDataSaverReceiver$lambda$0();
            }
        });
        if (pair == null) {
            return;
        }
        try {
            ((Context) pair.a()).unregisterReceiver((BroadcastReceiver) pair.b());
        } catch (IllegalArgumentException unused) {
            q.k(TAG, "Data Saver receiver was already unregistered");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair unregisterDataSaverReceiver$lambda$0() {
        Context context = applicationContext;
        BroadcastReceiver broadcastReceiver = dataSaverReceiver;
        if (context == null || broadcastReceiver == null) {
            return null;
        }
        dataSaverReceiver = null;
        return s.a(context, broadcastReceiver);
    }

    private final <T> T withMonitorLock(Function0<? extends T> action) {
        return (T) j.b(null, new c(action, null), 1, null);
    }

    @NotNull
    public final NetworkChangeReport buildReportLegacy$universalapp_googleProdRelease(@Nullable NetworkCapabilities capabilities, @Nullable LinkProperties linkProperties) {
        byte[] address;
        byte[] address2;
        InetAddress address3;
        InetAddress address4;
        List<LinkAddress> linkAddresses;
        List<LinkAddress> linkAddresses2;
        if (capabilities == null || !capabilities.hasCapability(12)) {
            return new NetworkChangeReport(NetworkInterfaceType.NONE, new byte[0], new byte[0], 0, false, NetworkValidationState.UNKNOWN);
        }
        LinkAddress linkAddressFirstUsableIpv6 = null;
        LinkAddress linkAddressFirstUsableIpv4 = (linkProperties == null || (linkAddresses2 = linkProperties.getLinkAddresses()) == null) ? null : firstUsableIpv4(linkAddresses2);
        if (linkProperties != null && (linkAddresses = linkProperties.getLinkAddresses()) != null) {
            linkAddressFirstUsableIpv6 = firstUsableIpv6(linkAddresses);
        }
        NetworkInterfaceType networkInterfaceTypeInterfaceType = interfaceType(capabilities);
        if (linkAddressFirstUsableIpv4 == null || (address4 = linkAddressFirstUsableIpv4.getAddress()) == null || (address = address4.getAddress()) == null) {
            address = new byte[0];
        }
        byte[] bArr = address;
        if (linkAddressFirstUsableIpv6 == null || (address3 = linkAddressFirstUsableIpv6.getAddress()) == null || (address2 = address3.getAddress()) == null) {
            address2 = new byte[0];
        }
        return new NetworkChangeReport(networkInterfaceTypeInterfaceType, bArr, address2, linkAddressFirstUsableIpv6 != null ? linkAddressFirstUsableIpv6.getPrefixLength() : 0, true, capabilities.hasCapability(16) ? NetworkValidationState.VALIDATED : NetworkValidationState.NOTVALIDATED);
    }

    @NotNull
    public final NetworkChangeReportV2 buildReportV2$universalapp_googleProdRelease(@Nullable NetworkCapabilities capabilities, @Nullable LinkProperties linkProperties, boolean dataSaverEnabled) {
        NetworkChangeReport networkChangeReportBuildReportLegacy$universalapp_googleProdRelease = buildReportLegacy$universalapp_googleProdRelease(capabilities, linkProperties);
        NetworkInterfaceType interfaceType = networkChangeReportBuildReportLegacy$universalapp_googleProdRelease.getInterfaceType();
        byte[] ipv4 = networkChangeReportBuildReportLegacy$universalapp_googleProdRelease.getIpv4();
        byte[] ipv6 = networkChangeReportBuildReportLegacy$universalapp_googleProdRelease.getIpv6();
        int ipv6PrefixLength = networkChangeReportBuildReportLegacy$universalapp_googleProdRelease.getIpv6PrefixLength();
        boolean pathSatisfied = networkChangeReportBuildReportLegacy$universalapp_googleProdRelease.getPathSatisfied();
        NetworkValidationState validation = networkChangeReportBuildReportLegacy$universalapp_googleProdRelease.getValidation();
        boolean z10 = false;
        boolean z11 = networkChangeReportBuildReportLegacy$universalapp_googleProdRelease.getPathSatisfied() && capabilities != null && isMetered(capabilities);
        if (networkChangeReportBuildReportLegacy$universalapp_googleProdRelease.getPathSatisfied() && dataSaverEnabled) {
            z10 = true;
        }
        return new NetworkChangeReportV2(interfaceType, ipv4, ipv6, ipv6PrefixLength, pathSatisfied, validation, z11, z10);
    }

    @Override // com.roblox.protocols.connectivityv2platforminterface.generated.IPlatformConnectivityV2
    public void startMonitoring() {
        Pair pair = (Pair) withMonitorLock(new Function0() { // from class: fl.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ConnectivityV2Monitor.startMonitoring$lambda$0();
            }
        });
        if (pair == null) {
            return;
        }
        ConnectivityManager connectivityManager2 = (ConnectivityManager) pair.a();
        final b bVar = (b) pair.b();
        try {
            connectivityManager2.registerDefaultNetworkCallback(bVar);
            if (h.a().z()) {
                registerDataSaverReceiver();
            }
            reportCurrentNetwork();
        } catch (SecurityException e10) {
            withMonitorLock(new Function0() { // from class: fl.i
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ConnectivityV2Monitor.startMonitoring$lambda$1(bVar);
                }
            });
            q.f(TAG, "Unable to register default network callback", e10);
        }
    }

    @Override // com.roblox.protocols.connectivityv2platforminterface.generated.IPlatformConnectivityV2
    public void stopMonitoring() {
        if (h.a().z()) {
            unregisterDataSaverReceiver();
        }
        Pair pair = (Pair) withMonitorLock(new Function0() { // from class: fl.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ConnectivityV2Monitor.stopMonitoring$lambda$0();
            }
        });
        if (pair == null) {
            return;
        }
        try {
            ((ConnectivityManager) pair.a()).unregisterNetworkCallback((ConnectivityManager.NetworkCallback) pair.b());
        } catch (IllegalArgumentException unused) {
            q.k(TAG, "Default network callback was already unregistered");
        }
    }
}
