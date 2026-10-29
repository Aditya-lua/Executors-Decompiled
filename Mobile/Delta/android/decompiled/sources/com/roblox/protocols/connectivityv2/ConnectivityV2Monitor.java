package com.roblox.protocols.connectivityv2;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkAddress;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import androidx.annotation.Keep;
import com.roblox.protocols.connectivityv2.ConnectivityV2Monitor;
import com.roblox.protocols.connectivityv2platforminterface.generated.IConnectivityV2CoreListener;
import com.roblox.protocols.connectivityv2platforminterface.generated.IPlatformConnectivityV2;
import com.roblox.protocols.connectivityv2platforminterface.generated.NetworkChangeReport;
import com.roblox.protocols.connectivityv2platforminterface.generated.NetworkInterfaceType;
import com.roblox.protocols.connectivityv2platforminterface.generated.NetworkValidationState;
import gk.p;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.Iterator;
import java.util.List;
import jt.o;
import jt.s;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ku.j;
import ku.p0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.c;
import pt.f;
import pt.m;
import uu.g;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001<B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0003J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u001a\u001a\u0004\u0018\u00010\u0019*\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001c\u001a\u0004\u0018\u00010\u0019*\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ\u0013\u0010\u001f\u001a\u00020\u001e*\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u000bH\u0016¢\u0006\u0004\b!\u0010\u0003J\u000f\u0010\"\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\"\u0010\u0003J#\u0010(\u001a\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010\u00142\b\u0010%\u001a\u0004\u0018\u00010$H\u0001¢\u0006\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020)8\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u0010/\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00102\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00105\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u00108\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010:\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006="}, d2 = {"Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;", "Lcom/roblox/protocols/connectivityv2platforminterface/generated/IPlatformConnectivityV2;", "<init>", "()V", "T", "Lkotlin/Function0;", "action", "withMonitorLock", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Landroid/content/Context;", "context", "", "setup", "(Landroid/content/Context;)V", "reportCurrentNetwork", "reportNoNetwork", "Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkChangeReport;", "report", "reportNetwork", "(Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkChangeReport;)V", "Landroid/net/NetworkCapabilities;", "Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkInterfaceType;", "interfaceType", "(Landroid/net/NetworkCapabilities;)Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkInterfaceType;", "", "Landroid/net/LinkAddress;", "firstUsableIpv4", "(Ljava/util/List;)Landroid/net/LinkAddress;", "firstUsableIpv6", "Ljava/net/InetAddress;", "", "isUsableAddress", "(Ljava/net/InetAddress;)Z", "startMonitoring", "stopMonitoring", "capabilities", "Landroid/net/LinkProperties;", "linkProperties", "buildReport$universalapp_googleProdRelease", "(Landroid/net/NetworkCapabilities;Landroid/net/LinkProperties;)Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkChangeReport;", "buildReport", "", "TAG", "Ljava/lang/String;", "Luu/a;", "monitorMutex", "Luu/a;", "applicationContext", "Landroid/content/Context;", "Landroid/net/ConnectivityManager;", "connectivityManager", "Landroid/net/ConnectivityManager;", "Landroid/net/ConnectivityManager$NetworkCallback;", "networkCallback", "Landroid/net/ConnectivityManager$NetworkCallback;", "Lcom/roblox/protocols/connectivityv2platforminterface/generated/IConnectivityV2CoreListener;", "coreListener", "Lcom/roblox/protocols/connectivityv2platforminterface/generated/IConnectivityV2CoreListener;", "setupInProgress", "Z", "a", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
    private static ConnectivityManager.NetworkCallback networkCallback;
    private static boolean setupInProgress;

    @NotNull
    public static final ConnectivityV2Monitor INSTANCE = new ConnectivityV2Monitor();

    @NotNull
    private static final uu.a monitorMutex = g.b(false, 1, null);

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u001f\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor$a;", "Landroid/net/ConnectivityManager$NetworkCallback;", "Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;", "monitor", "<init>", "(Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;)V", "Landroid/net/Network;", "network", "", "onAvailable", "(Landroid/net/Network;)V", "onLost", "Landroid/net/NetworkCapabilities;", "networkCapabilities", "onCapabilitiesChanged", "(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V", "Landroid/net/LinkProperties;", "linkProperties", "onLinkPropertiesChanged", "(Landroid/net/Network;Landroid/net/LinkProperties;)V", "a", "Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a extends ConnectivityManager.NetworkCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final ConnectivityV2Monitor monitor;

        public a(@NotNull ConnectivityV2Monitor monitor) {
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
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Lku/p0;", "<anonymous>"}, k = 3, mv = {2, 2, 0})
    @f(c = "com.roblox.protocols.connectivityv2.ConnectivityV2Monitor$withMonitorLock$1", f = "ConnectivityV2Monitor.kt", l = {219}, m = "invokeSuspend", v = 1)
    public static final class b<T> extends m implements Function2<p0, nt.b<? super T>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f9687t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f9688u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f9689v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f9690w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ Function0<T> f9691x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function0<? extends T> function0, nt.b<? super b> bVar) {
            super(2, bVar);
            this.f9691x = function0;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new b(this.f9691x, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            uu.a aVar;
            Function0<T> function0;
            Object objE = c.e();
            int i10 = this.f9690w;
            if (i10 == 0) {
                o.b(obj);
                aVar = ConnectivityV2Monitor.monitorMutex;
                Function0<T> function1 = this.f9691x;
                this.f9687t = aVar;
                this.f9688u = function1;
                this.f9689v = 0;
                this.f9690w = 1;
                if (aVar.f(null, this) == objE) {
                    return objE;
                }
                function0 = function1;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function0 = (Function0) this.f9688u;
                aVar = (uu.a) this.f9687t;
                o.b(obj);
            }
            try {
                return function0.invoke();
            } finally {
                aVar.e(null);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super T> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    private ConnectivityV2Monitor() {
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

    private final boolean isUsableAddress(InetAddress inetAddress) {
        return (inetAddress.isAnyLocalAddress() || inetAddress.isLinkLocalAddress() || inetAddress.isLoopbackAddress()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reportCurrentNetwork() {
        ConnectivityManager connectivityManager2 = (ConnectivityManager) withMonitorLock(new Function0() { // from class: hl.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ConnectivityV2Monitor.connectivityManager;
            }
        });
        if (connectivityManager2 == null) {
            return;
        }
        Network activeNetwork = connectivityManager2.getActiveNetwork();
        reportNetwork(buildReport$universalapp_googleProdRelease(activeNetwork != null ? connectivityManager2.getNetworkCapabilities(activeNetwork) : null, activeNetwork != null ? connectivityManager2.getLinkProperties(activeNetwork) : null));
    }

    private final void reportNetwork(NetworkChangeReport report) {
        IConnectivityV2CoreListener iConnectivityV2CoreListener = coreListener;
        if (iConnectivityV2CoreListener != null) {
            iConnectivityV2CoreListener.reportNetworkChanged(report);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reportNoNetwork() {
        reportNetwork(buildReport$universalapp_googleProdRelease(null, null));
    }

    public static final void setup(@NotNull final Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ConnectivityV2Monitor connectivityV2Monitor = INSTANCE;
        if (((Boolean) connectivityV2Monitor.withMonitorLock(new Function0() { // from class: hl.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(ConnectivityV2Monitor.setup$lambda$0(context));
            }
        })).booleanValue()) {
            try {
                final IConnectivityV2CoreListener platformImpl = IConnectivityV2CoreListener.setPlatformImpl(connectivityV2Monitor);
                connectivityV2Monitor.withMonitorLock(new Function0() { // from class: hl.c
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ConnectivityV2Monitor.setup$lambda$2(platformImpl);
                    }
                });
                connectivityV2Monitor.startMonitoring();
            } catch (RuntimeException e10) {
                INSTANCE.withMonitorLock(new Function0() { // from class: hl.b
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
        return Unit.f22483a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setup$lambda$2(IConnectivityV2CoreListener iConnectivityV2CoreListener) {
        setupInProgress = false;
        coreListener = iConnectivityV2CoreListener;
        return Unit.f22483a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair startMonitoring$lambda$0() {
        if (networkCallback != null) {
            return null;
        }
        Context context = applicationContext;
        ConnectivityManager connectivityManager2 = context != null ? (ConnectivityManager) context.getSystemService(ConnectivityManager.class) : null;
        if (connectivityManager2 == null) {
            p.k(TAG, "ConnectivityManager unavailable");
            return null;
        }
        a aVar = new a(INSTANCE);
        connectivityManager = connectivityManager2;
        networkCallback = aVar;
        return s.a(connectivityManager2, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startMonitoring$lambda$1(a aVar) {
        if (networkCallback == aVar) {
            networkCallback = null;
            connectivityManager = null;
        }
        return Unit.f22483a;
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

    private final <T> T withMonitorLock(Function0<? extends T> action) {
        return (T) j.b(null, new b(action, null), 1, null);
    }

    @NotNull
    public final NetworkChangeReport buildReport$universalapp_googleProdRelease(@Nullable NetworkCapabilities capabilities, @Nullable LinkProperties linkProperties) {
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

    @Override // com.roblox.protocols.connectivityv2platforminterface.generated.IPlatformConnectivityV2
    public void startMonitoring() {
        Pair pair = (Pair) withMonitorLock(new Function0() { // from class: hl.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ConnectivityV2Monitor.startMonitoring$lambda$0();
            }
        });
        if (pair == null) {
            return;
        }
        ConnectivityManager connectivityManager2 = (ConnectivityManager) pair.a();
        final a aVar = (a) pair.b();
        try {
            connectivityManager2.registerDefaultNetworkCallback(aVar);
            reportCurrentNetwork();
        } catch (SecurityException e10) {
            withMonitorLock(new Function0() { // from class: hl.f
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ConnectivityV2Monitor.startMonitoring$lambda$1(aVar);
                }
            });
            p.f(TAG, "Unable to register default network callback", e10);
        }
    }

    @Override // com.roblox.protocols.connectivityv2platforminterface.generated.IPlatformConnectivityV2
    public void stopMonitoring() {
        Pair pair = (Pair) withMonitorLock(new Function0() { // from class: hl.g
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
            p.k(TAG, "Default network callback was already unregistered");
        }
    }
}
