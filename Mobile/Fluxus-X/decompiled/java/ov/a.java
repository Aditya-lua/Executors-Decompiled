package ov;

import com.appsflyer.sdk_base.referrer.Payload;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.SocketAddress;
import java.util.List;
import mv.b;
import mv.f0;
import mv.h0;
import mv.i;
import mv.j0;
import mv.p;
import mv.r;
import mv.z;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.collections.CollectionsKt;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.text.x;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0012\u001a\u00020\u0011*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lov/a;", "Lmv/b;", "Lmv/r;", "defaultDns", "<init>", "(Lmv/r;)V", "Lmv/j0;", "route", "Lmv/h0;", Payload.RESPONSE, "Lmv/f0;", "a", "(Lmv/j0;Lmv/h0;)Lmv/f0;", "Ljava/net/Proxy;", "Lmv/z;", "url", "dns", "Ljava/net/InetAddress;", "b", "(Ljava/net/Proxy;Lmv/z;Lmv/r;)Ljava/net/InetAddress;", "d", "Lmv/r;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements b {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final r defaultDns;

    /* JADX INFO: renamed from: ov.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C0550a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28552a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f28552a = iArr;
        }
    }

    public a(@NotNull r defaultDns) {
        Intrinsics.checkNotNullParameter(defaultDns, "defaultDns");
        this.defaultDns = defaultDns;
    }

    @Override // mv.b
    @Nullable
    public f0 a(@Nullable j0 route, @NotNull h0 response) {
        Proxy proxy;
        r dns;
        PasswordAuthentication passwordAuthenticationRequestPasswordAuthentication;
        mv.a address;
        Intrinsics.checkNotNullParameter(response, "response");
        List<i> listE = response.e();
        f0 request = response.getRequest();
        z url = request.getUrl();
        boolean z10 = response.getCode() == 407;
        if (route == null || (proxy = route.getProxy()) == null) {
            proxy = Proxy.NO_PROXY;
        }
        for (i iVar : listE) {
            if (x.E("Basic", iVar.getScheme(), true)) {
                if (route == null || (address = route.getAddress()) == null || (dns = address.getDns()) == null) {
                    dns = this.defaultDns;
                }
                if (z10) {
                    SocketAddress socketAddressAddress = proxy.address();
                    Intrinsics.d(socketAddressAddress, "null cannot be cast to non-null type java.net.InetSocketAddress");
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                    String hostName = inetSocketAddress.getHostName();
                    Intrinsics.checkNotNull(proxy);
                    passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(hostName, b(proxy, url, dns), inetSocketAddress.getPort(), url.getScheme(), iVar.b(), iVar.getScheme(), url.v(), Authenticator.RequestorType.PROXY);
                } else {
                    String host = url.getHost();
                    Intrinsics.checkNotNull(proxy);
                    passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(host, b(proxy, url, dns), url.getPort(), url.getScheme(), iVar.b(), iVar.getScheme(), url.v(), Authenticator.RequestorType.SERVER);
                }
                if (passwordAuthenticationRequestPasswordAuthentication != null) {
                    String str = z10 ? "Proxy-Authorization" : "Authorization";
                    String userName = passwordAuthenticationRequestPasswordAuthentication.getUserName();
                    Intrinsics.checkNotNullExpressionValue(userName, "getUserName(...)");
                    char[] password = passwordAuthenticationRequestPasswordAuthentication.getPassword();
                    Intrinsics.checkNotNullExpressionValue(password, "getPassword(...)");
                    return request.j().m(str, p.a(userName, new String(password), iVar.a())).b();
                }
            }
        }
        return null;
    }

    public final InetAddress b(Proxy proxy, z zVar, r rVar) {
        Proxy.Type type = proxy.type();
        if ((type == null ? -1 : C0550a.f28552a[type.ordinal()]) == 1) {
            return (InetAddress) CollectionsKt.d0(rVar.a(zVar.getHost()));
        }
        SocketAddress socketAddressAddress = proxy.address();
        Intrinsics.d(socketAddressAddress, "null cannot be cast to non-null type java.net.InetSocketAddress");
        InetAddress address = ((InetSocketAddress) socketAddressAddress).getAddress();
        Intrinsics.checkNotNullExpressionValue(address, "getAddress(...)");
        return address;
    }

    public /* synthetic */ a(r rVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? r.b : rVar);
    }
}
