package bw;

import com.github.luben.zstd.BuildConfig;
import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.X509TrustManager;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b&\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lbw/c;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "Ljava/security/cert/Certificate;", "chain", BuildConfig.FLAVOR, "hostname", "a", "(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: bw.c$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lbw/c$a;", BuildConfig.FLAVOR, "<init>", "()V", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Lbw/c;", "a", "(Ljavax/net/ssl/X509TrustManager;)Lbw/c;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final c a(@NotNull X509TrustManager trustManager) {
            Intrinsics.checkNotNullParameter(trustManager, "trustManager");
            return okhttp3.internal.platform.c.INSTANCE.e().e(trustManager);
        }

        public Companion() {
        }
    }

    @NotNull
    public abstract List<Certificate> a(@NotNull List<? extends Certificate> chain, @NotNull String hostname);
}
