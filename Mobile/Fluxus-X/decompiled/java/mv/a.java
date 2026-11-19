package mv;

import com.github.luben.zstd.BuildConfig;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0004H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u0000H\u0000¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0002H\u0016¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\t\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007¢\u0006\f\n\u0004\b*\u00100\u001a\u0004\b1\u00102R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0007¢\u0006\f\n\u0004\b$\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0007¢\u0006\f\n\u0004\b4\u00106\u001a\u0004\b(\u00107R\u0017\u0010\u0011\u001a\u00020\u00108\u0007¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0007¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b<\u0010>R\u0017\u0010\u001a\u001a\u00020\u00198\u0007¢\u0006\f\n\u0004\b:\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010F\u001a\u00020B8\u0007¢\u0006\f\n\u0004\b@\u0010C\u001a\u0004\bD\u0010ER\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0007¢\u0006\f\n\u0004\b.\u0010G\u001a\u0004\b8\u0010HR\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00148\u0007¢\u0006\f\n\u0004\b1\u0010G\u001a\u0004\b,\u0010H¨\u0006I"}, d2 = {"Lmv/a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "uriHost", BuildConfig.FLAVOR, "uriPort", "Lmv/r;", "dns", "Ljavax/net/SocketFactory;", "socketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "Ljavax/net/ssl/HostnameVerifier;", "hostnameVerifier", "Lmv/h;", "certificatePinner", "Lmv/b;", "proxyAuthenticator", "Ljava/net/Proxy;", "proxy", BuildConfig.FLAVOR, "Lmv/e0;", "protocols", "Lmv/m;", "connectionSpecs", "Ljava/net/ProxySelector;", "proxySelector", "<init>", "(Ljava/lang/String;ILmv/r;Ljavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/HostnameVerifier;Lmv/h;Lmv/b;Ljava/net/Proxy;Ljava/util/List;Ljava/util/List;Ljava/net/ProxySelector;)V", "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "that", "d", "(Lmv/a;)Z", "toString", "()Ljava/lang/String;", "a", "Lmv/r;", "c", "()Lmv/r;", "b", "Ljavax/net/SocketFactory;", "j", "()Ljavax/net/SocketFactory;", "Ljavax/net/ssl/SSLSocketFactory;", "k", "()Ljavax/net/ssl/SSLSocketFactory;", "Ljavax/net/ssl/HostnameVerifier;", "e", "()Ljavax/net/ssl/HostnameVerifier;", "Lmv/h;", "()Lmv/h;", "f", "Lmv/b;", "h", "()Lmv/b;", "g", "Ljava/net/Proxy;", "()Ljava/net/Proxy;", "Ljava/net/ProxySelector;", "i", "()Ljava/net/ProxySelector;", "Lmv/z;", "Lmv/z;", "l", "()Lmv/z;", "url", "Ljava/util/List;", "()Ljava/util/List;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final r dns;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final SocketFactory socketFactory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final SSLSocketFactory sslSocketFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final HostnameVerifier hostnameVerifier;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final h certificatePinner;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final b proxyAuthenticator;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Proxy proxy;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ProxySelector proxySelector;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final z url;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<e0> protocols;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<m> connectionSpecs;

    public a(@NotNull String uriHost, int i10, @NotNull r dns, @NotNull SocketFactory socketFactory, @Nullable SSLSocketFactory sSLSocketFactory, @Nullable HostnameVerifier hostnameVerifier, @Nullable h hVar, @NotNull b proxyAuthenticator, @Nullable Proxy proxy, @NotNull List<? extends e0> protocols, @NotNull List<m> connectionSpecs, @NotNull ProxySelector proxySelector) {
        Intrinsics.checkNotNullParameter(uriHost, "uriHost");
        Intrinsics.checkNotNullParameter(dns, "dns");
        Intrinsics.checkNotNullParameter(socketFactory, "socketFactory");
        Intrinsics.checkNotNullParameter(proxyAuthenticator, "proxyAuthenticator");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        Intrinsics.checkNotNullParameter(proxySelector, "proxySelector");
        this.dns = dns;
        this.socketFactory = socketFactory;
        this.sslSocketFactory = sSLSocketFactory;
        this.hostnameVerifier = hostnameVerifier;
        this.certificatePinner = hVar;
        this.proxyAuthenticator = proxyAuthenticator;
        this.proxy = proxy;
        this.proxySelector = proxySelector;
        this.url = new z.a().t(sSLSocketFactory != null ? "https" : "http").g(uriHost).n(i10).c();
        this.protocols = nv.q.v(protocols);
        this.connectionSpecs = nv.q.v(connectionSpecs);
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final h getCertificatePinner() {
        return this.certificatePinner;
    }

    @NotNull
    public final List<m> b() {
        return this.connectionSpecs;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final r getDns() {
        return this.dns;
    }

    public final boolean d(@NotNull a that) {
        Intrinsics.checkNotNullParameter(that, "that");
        return Intrinsics.c(this.dns, that.dns) && Intrinsics.c(this.proxyAuthenticator, that.proxyAuthenticator) && Intrinsics.c(this.protocols, that.protocols) && Intrinsics.c(this.connectionSpecs, that.connectionSpecs) && Intrinsics.c(this.proxySelector, that.proxySelector) && Intrinsics.c(this.proxy, that.proxy) && Intrinsics.c(this.sslSocketFactory, that.sslSocketFactory) && Intrinsics.c(this.hostnameVerifier, that.hostnameVerifier) && Intrinsics.c(this.certificatePinner, that.certificatePinner) && this.url.getPort() == that.url.getPort();
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final HostnameVerifier getHostnameVerifier() {
        return this.hostnameVerifier;
    }

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof a)) {
            return false;
        }
        a aVar = (a) other;
        return Intrinsics.c(this.url, aVar.url) && d(aVar);
    }

    @NotNull
    public final List<e0> f() {
        return this.protocols;
    }

    @Nullable
    /* JADX INFO: renamed from: g, reason: from getter */
    public final Proxy getProxy() {
        return this.proxy;
    }

    @NotNull
    /* JADX INFO: renamed from: h, reason: from getter */
    public final b getProxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.url.hashCode()) * 31) + this.dns.hashCode()) * 31) + this.proxyAuthenticator.hashCode()) * 31) + this.protocols.hashCode()) * 31) + this.connectionSpecs.hashCode()) * 31) + this.proxySelector.hashCode()) * 31) + Objects.hashCode(this.proxy)) * 31) + Objects.hashCode(this.sslSocketFactory)) * 31) + Objects.hashCode(this.hostnameVerifier)) * 31) + Objects.hashCode(this.certificatePinner);
    }

    @NotNull
    /* JADX INFO: renamed from: i, reason: from getter */
    public final ProxySelector getProxySelector() {
        return this.proxySelector;
    }

    @NotNull
    /* JADX INFO: renamed from: j, reason: from getter */
    public final SocketFactory getSocketFactory() {
        return this.socketFactory;
    }

    @Nullable
    /* JADX INFO: renamed from: k, reason: from getter */
    public final SSLSocketFactory getSslSocketFactory() {
        return this.sslSocketFactory;
    }

    @NotNull
    /* JADX INFO: renamed from: l, reason: from getter */
    public final z getUrl() {
        return this.url;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2;
        Object obj;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Address{");
        sb3.append(this.url.getHost());
        sb3.append(':');
        sb3.append(this.url.getPort());
        sb3.append(", ");
        if (this.proxy != null) {
            sb2 = new StringBuilder();
            sb2.append("proxy=");
            obj = this.proxy;
        } else {
            sb2 = new StringBuilder();
            sb2.append("proxySelector=");
            obj = this.proxySelector;
        }
        sb2.append(obj);
        sb3.append(sb2.toString());
        sb3.append('}');
        return sb3.toString();
    }
}
