package yv;

import com.github.luben.zstd.BuildConfig;
import java.util.List;
import javax.net.ssl.SSLSocket;
import mv.e0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0013\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00012\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001a¨\u0006\u001c"}, d2 = {"Lyv/i;", "Lyv/j;", "Lyv/i$a;", "socketAdapterFactory", "<init>", "(Lyv/i$a;)V", BuildConfig.FLAVOR, "a", "()Z", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "b", "(Ljavax/net/ssl/SSLSocket;)Z", BuildConfig.FLAVOR, "hostname", BuildConfig.FLAVOR, "Lmv/e0;", "protocols", BuildConfig.FLAVOR, "d", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "c", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "e", "(Ljavax/net/ssl/SSLSocket;)Lyv/j;", "Lyv/i$a;", "Lyv/j;", "delegate", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final a socketAdapterFactory;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public j delegate;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lyv/i$a;", BuildConfig.FLAVOR, "Ljavax/net/ssl/SSLSocket;", "sslSocket", BuildConfig.FLAVOR, "b", "(Ljavax/net/ssl/SSLSocket;)Z", "Lyv/j;", "c", "(Ljavax/net/ssl/SSLSocket;)Lyv/j;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        boolean b(@NotNull SSLSocket sslSocket);

        @NotNull
        j c(@NotNull SSLSocket sslSocket);
    }

    public i(@NotNull a socketAdapterFactory) {
        Intrinsics.checkNotNullParameter(socketAdapterFactory, "socketAdapterFactory");
        this.socketAdapterFactory = socketAdapterFactory;
    }

    @Override // yv.j
    public boolean a() {
        return true;
    }

    @Override // yv.j
    public boolean b(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return this.socketAdapterFactory.b(sslSocket);
    }

    @Override // yv.j
    @Nullable
    public String c(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        j jVarE = e(sslSocket);
        if (jVarE != null) {
            return jVarE.c(sslSocket);
        }
        return null;
    }

    @Override // yv.j
    public void d(@NotNull SSLSocket sslSocket, @Nullable String hostname, @NotNull List<? extends e0> protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        j jVarE = e(sslSocket);
        if (jVarE != null) {
            jVarE.d(sslSocket, hostname, protocols);
        }
    }

    public final synchronized j e(SSLSocket sslSocket) {
        try {
            if (this.delegate == null && this.socketAdapterFactory.b(sslSocket)) {
                this.delegate = this.socketAdapterFactory.c(sslSocket);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.delegate;
    }
}
