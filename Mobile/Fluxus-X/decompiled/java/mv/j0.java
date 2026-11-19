package mv;

import com.github.luben.zstd.BuildConfig;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lmv/j0;", BuildConfig.FLAVOR, "Lmv/a;", "address", "Ljava/net/Proxy;", "proxy", "Ljava/net/InetSocketAddress;", "socketAddress", "<init>", "(Lmv/a;Ljava/net/Proxy;Ljava/net/InetSocketAddress;)V", BuildConfig.FLAVOR, "c", "()Z", "other", "equals", "(Ljava/lang/Object;)Z", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "a", "Lmv/a;", "()Lmv/a;", "b", "Ljava/net/Proxy;", "()Ljava/net/Proxy;", "Ljava/net/InetSocketAddress;", "d", "()Ljava/net/InetSocketAddress;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final a address;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Proxy proxy;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final InetSocketAddress socketAddress;

    public j0(@NotNull a address, @NotNull Proxy proxy, @NotNull InetSocketAddress socketAddress) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(socketAddress, "socketAddress");
        this.address = address;
        this.proxy = proxy;
        this.socketAddress = socketAddress;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getAddress() {
        return this.address;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Proxy getProxy() {
        return this.proxy;
    }

    public final boolean c() {
        if (this.proxy.type() != Proxy.Type.HTTP) {
            return false;
        }
        return this.address.getSslSocketFactory() != null || this.address.f().contains(e0.H2_PRIOR_KNOWLEDGE);
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final InetSocketAddress getSocketAddress() {
        return this.socketAddress;
    }

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) other;
        return Intrinsics.c(j0Var.address, this.address) && Intrinsics.c(j0Var.proxy, this.proxy) && Intrinsics.c(j0Var.socketAddress, this.socketAddress);
    }

    public int hashCode() {
        return ((((527 + this.address.hashCode()) * 31) + this.proxy.hashCode()) * 31) + this.socketAddress.hashCode();
    }

    @NotNull
    public String toString() {
        String hostAddress;
        StringBuilder sb2 = new StringBuilder();
        String host = this.address.getUrl().getHost();
        InetAddress address = this.socketAddress.getAddress();
        String strK = (address == null || (hostAddress = address.getHostAddress()) == null) ? null : nv.l.k(hostAddress);
        if (StringsKt.Z(host, ':', false, 2, null)) {
            sb2.append("[");
            sb2.append(host);
            sb2.append("]");
        } else {
            sb2.append(host);
        }
        if (this.address.getUrl().getPort() != this.socketAddress.getPort() || Intrinsics.c(host, strK)) {
            sb2.append(":");
            sb2.append(this.address.getUrl().getPort());
        }
        if (!Intrinsics.c(host, strK)) {
            if (Intrinsics.c(this.proxy, Proxy.NO_PROXY)) {
                sb2.append(" at ");
            } else {
                sb2.append(" via proxy ");
            }
            if (strK == null) {
                sb2.append("<unresolved>");
            } else if (StringsKt.Z(strK, ':', false, 2, null)) {
                sb2.append("[");
                sb2.append(strK);
                sb2.append("]");
            } else {
                sb2.append(strK);
            }
            sb2.append(":");
            sb2.append(this.socketAddress.getPort());
        }
        return sb2.toString();
    }
}
