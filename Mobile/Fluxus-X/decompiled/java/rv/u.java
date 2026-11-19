package rv;

import com.github.luben.zstd.BuildConfig;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import mv.j0;
import mv.z;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 .2\u00020\u0001:\u0002\u0018\fB)\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\bH\u0086\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0086\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0018\u0010\rJ\u000f\u0010\u0019\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010 R\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00130!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\"R\u0016\u0010&\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010%R\u001c\u0010)\u001a\b\u0012\u0004\u0012\u00020'0!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010\"R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020+0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\"¨\u0006/"}, d2 = {"Lrv/u;", BuildConfig.FLAVOR, "Lmv/a;", "address", "Lrv/s;", "routeDatabase", "Lrv/m;", "call", BuildConfig.FLAVOR, "fastFallback", "<init>", "(Lmv/a;Lrv/s;Lrv/m;Z)V", "a", "()Z", "Lrv/u$b;", "c", "()Lrv/u$b;", "Lmv/z;", "url", "Ljava/net/Proxy;", "proxy", BuildConfig.FLAVOR, "f", "(Lmv/z;Ljava/net/Proxy;)V", "b", "d", "()Ljava/net/Proxy;", "e", "(Ljava/net/Proxy;)V", "Lmv/a;", "Lrv/s;", "Lrv/m;", "Z", BuildConfig.FLAVOR, "Ljava/util/List;", "proxies", BuildConfig.FLAVOR, "I", "nextProxyIndex", "Ljava/net/InetSocketAddress;", "g", "inetSocketAddresses", BuildConfig.FLAVOR, "Lmv/j0;", "h", "postponedRoutes", "i", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class u {

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final mv.a address;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final s routeDatabase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final m call;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final boolean fastFallback;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public List<? extends Proxy> proxies;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public int nextProxyIndex;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public List<? extends InetSocketAddress> inetSocketAddresses;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<j0> postponedRoutes;

    /* JADX INFO: renamed from: rv.u$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0015\u0010\b\u001a\u00020\u0005*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lrv/u$a;", BuildConfig.FLAVOR, "<init>", "()V", "Ljava/net/InetSocketAddress;", BuildConfig.FLAVOR, "a", "(Ljava/net/InetSocketAddress;)Ljava/lang/String;", "socketHost", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String a(@NotNull InetSocketAddress inetSocketAddress) {
            Intrinsics.checkNotNullParameter(inetSocketAddress, "<this>");
            InetAddress address = inetSocketAddress.getAddress();
            if (address == null) {
                String hostName = inetSocketAddress.getHostName();
                Intrinsics.checkNotNullExpressionValue(hostName, "getHostName(...)");
                return hostName;
            }
            String hostAddress = address.getHostAddress();
            Intrinsics.checkNotNullExpressionValue(hostAddress, "getHostAddress(...)");
            return hostAddress;
        }

        public Companion() {
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0086\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0010¨\u0006\u0012"}, d2 = {"Lrv/u$b;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "Lmv/j0;", "routes", "<init>", "(Ljava/util/List;)V", BuildConfig.FLAVOR, "b", "()Z", "c", "()Lmv/j0;", "a", "Ljava/util/List;", "()Ljava/util/List;", BuildConfig.FLAVOR, "I", "nextRouteIndex", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<j0> routes;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public int nextRouteIndex;

        public b(@NotNull List<j0> routes) {
            Intrinsics.checkNotNullParameter(routes, "routes");
            this.routes = routes;
        }

        @NotNull
        public final List<j0> a() {
            return this.routes;
        }

        public final boolean b() {
            return this.nextRouteIndex < this.routes.size();
        }

        @NotNull
        public final j0 c() {
            if (!b()) {
                throw new NoSuchElementException();
            }
            List<j0> list = this.routes;
            int i10 = this.nextRouteIndex;
            this.nextRouteIndex = i10 + 1;
            return list.get(i10);
        }
    }

    public u(@NotNull mv.a address, @NotNull s routeDatabase, @NotNull m call, boolean z10) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(routeDatabase, "routeDatabase");
        Intrinsics.checkNotNullParameter(call, "call");
        this.address = address;
        this.routeDatabase = routeDatabase;
        this.call = call;
        this.fastFallback = z10;
        this.proxies = p001kotlin.collections.p.k();
        this.inetSocketAddresses = p001kotlin.collections.p.k();
        this.postponedRoutes = new ArrayList();
        f(address.getUrl(), address.getProxy());
    }

    public static final List<Proxy> g(Proxy proxy, z zVar, u uVar) {
        if (proxy != null) {
            return p001kotlin.collections.o.d(proxy);
        }
        URI uriU = zVar.u();
        if (uriU.getHost() == null) {
            return nv.q.l(Proxy.NO_PROXY);
        }
        List<Proxy> listSelect = uVar.address.getProxySelector().select(uriU);
        List<Proxy> list = listSelect;
        return (list == null || list.isEmpty()) ? nv.q.l(Proxy.NO_PROXY) : nv.q.v(listSelect);
    }

    public final boolean a() {
        return b() || !this.postponedRoutes.isEmpty();
    }

    public final boolean b() {
        return this.nextProxyIndex < this.proxies.size();
    }

    @NotNull
    public final b c() {
        if (!a()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (b()) {
            Proxy proxyD = d();
            Iterator<? extends InetSocketAddress> it = this.inetSocketAddresses.iterator();
            while (it.hasNext()) {
                j0 j0Var = new j0(this.address, proxyD, it.next());
                if (this.routeDatabase.c(j0Var)) {
                    this.postponedRoutes.add(j0Var);
                } else {
                    arrayList.add(j0Var);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            p001kotlin.collections.u.z(arrayList, this.postponedRoutes);
            this.postponedRoutes.clear();
        }
        return new b(arrayList);
    }

    public final Proxy d() throws SocketException, UnknownHostException {
        if (b()) {
            List<? extends Proxy> list = this.proxies;
            int i10 = this.nextProxyIndex;
            this.nextProxyIndex = i10 + 1;
            Proxy proxy = list.get(i10);
            e(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.address.getUrl().getHost() + "; exhausted proxy configurations: " + this.proxies);
    }

    public final void e(Proxy proxy) throws SocketException, UnknownHostException {
        String host;
        int port;
        List<InetAddress> listA;
        ArrayList arrayList = new ArrayList();
        this.inetSocketAddresses = arrayList;
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            host = this.address.getUrl().getHost();
            port = this.address.getUrl().getPort();
        } else {
            SocketAddress socketAddressAddress = proxy.address();
            if (!(socketAddressAddress instanceof InetSocketAddress)) {
                throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + socketAddressAddress.getClass()).toString());
            }
            InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
            host = INSTANCE.a(inetSocketAddress);
            port = inetSocketAddress.getPort();
        }
        if (1 > port || port >= 65536) {
            throw new SocketException("No route to " + host + ':' + port + "; port is out of range");
        }
        if (proxy.type() == Proxy.Type.SOCKS) {
            arrayList.add(InetSocketAddress.createUnresolved(host, port));
            return;
        }
        if (nv.l.a(host)) {
            listA = p001kotlin.collections.o.d(InetAddress.getByName(host));
        } else {
            this.call.getEventListener().dnsStart(this.call, host);
            listA = this.address.getDns().a(host);
            if (listA.isEmpty()) {
                throw new UnknownHostException(this.address.getDns() + " returned no addresses for " + host);
            }
            this.call.getEventListener().dnsEnd(this.call, host, listA);
        }
        if (this.fastFallback) {
            listA = l.a(listA);
        }
        Iterator<InetAddress> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(new InetSocketAddress(it.next(), port));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(z url, Proxy proxy) {
        this.call.getEventListener().proxySelectStart(this.call, url);
        this.proxies = g(proxy, url, this);
        this.nextProxyIndex = 0;
        this.call.getEventListener().proxySelectEnd(this.call, url, this.proxies);
    }
}
