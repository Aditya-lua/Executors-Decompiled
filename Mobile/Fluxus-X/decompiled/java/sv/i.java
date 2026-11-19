package sv;

import com.github.luben.zstd.BuildConfig;
import java.net.Proxy;
import mv.f0;
import mv.z;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lsv/i;", BuildConfig.FLAVOR, "<init>", "()V", "Lmv/f0;", "request", "Ljava/net/Proxy$Type;", "proxyType", BuildConfig.FLAVOR, "a", "(Lmv/f0;Ljava/net/Proxy$Type;)Ljava/lang/String;", "Lmv/z;", "url", "c", "(Lmv/z;)Ljava/lang/String;", BuildConfig.FLAVOR, "b", "(Lmv/f0;Ljava/net/Proxy$Type;)Z", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final i f31928a = new i();

    @NotNull
    public final String a(@NotNull f0 request, @NotNull Proxy.Type proxyType) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(proxyType, "proxyType");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(request.getMethod());
        sb2.append(' ');
        i iVar = f31928a;
        if (iVar.b(request, proxyType)) {
            sb2.append(request.getUrl());
        } else {
            sb2.append(iVar.c(request.getUrl()));
        }
        sb2.append(" HTTP/1.1");
        return sb2.toString();
    }

    public final boolean b(f0 request, Proxy.Type proxyType) {
        return !request.h() && proxyType == Proxy.Type.HTTP;
    }

    @NotNull
    public final String c(@NotNull z url) {
        Intrinsics.checkNotNullParameter(url, "url");
        String strC = url.c();
        String strE = url.e();
        if (strE == null) {
            return strC;
        }
        return strC + '?' + strE;
    }
}
