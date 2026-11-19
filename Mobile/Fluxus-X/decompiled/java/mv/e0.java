package mv;

import com.github.luben.zstd.BuildConfig;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lmv/e0;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "protocol", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "c", "d", "e", "f", "g", "h", "i", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public enum e0 {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic"),
    HTTP_3("h3");


    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String protocol;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ hu.a f24586k = hu.b.a(a());

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: mv.e0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lmv/e0$a;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "protocol", "Lmv/e0;", "a", "(Ljava/lang/String;)Lmv/e0;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final e0 a(@NotNull String protocol) throws IOException {
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            e0 e0Var = e0.HTTP_1_0;
            if (Intrinsics.c(protocol, e0Var.protocol)) {
                return e0Var;
            }
            e0 e0Var2 = e0.HTTP_1_1;
            if (Intrinsics.c(protocol, e0Var2.protocol)) {
                return e0Var2;
            }
            e0 e0Var3 = e0.H2_PRIOR_KNOWLEDGE;
            if (Intrinsics.c(protocol, e0Var3.protocol)) {
                return e0Var3;
            }
            e0 e0Var4 = e0.HTTP_2;
            if (Intrinsics.c(protocol, e0Var4.protocol)) {
                return e0Var4;
            }
            e0 e0Var5 = e0.SPDY_3;
            if (Intrinsics.c(protocol, e0Var5.protocol)) {
                return e0Var5;
            }
            e0 e0Var6 = e0.QUIC;
            if (Intrinsics.c(protocol, e0Var6.protocol)) {
                return e0Var6;
            }
            e0 e0Var7 = e0.HTTP_3;
            if (p001kotlin.text.x.T(protocol, e0Var7.protocol, false, 2, null)) {
                return e0Var7;
            }
            throw new IOException("Unexpected protocol: " + protocol);
        }

        public Companion() {
        }
    }

    e0(String str) {
        this.protocol = str;
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        return this.protocol;
    }
}
