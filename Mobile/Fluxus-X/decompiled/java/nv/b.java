package nv;

import com.github.luben.zstd.BuildConfig;
import java.nio.charset.Charset;
import mv.b0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Pair;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.text.Charsets;
import zt.s;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a'\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a#\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0007*\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0015\u0010\u000b\u001a\u00020\b*\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lmv/m;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "socketEnabledCipherSuites", "c", "(Lmv/m;[Ljava/lang/String;)[Ljava/lang/String;", "Lmv/b0;", "Lkotlin/Pair;", "Ljava/nio/charset/Charset;", "b", "(Lmv/b0;)Lkotlin/Pair;", "a", "(Lmv/b0;)Ljava/nio/charset/Charset;", "okhttp"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {
    @NotNull
    public static final Charset a(@Nullable b0 b0Var) {
        Charset charsetD;
        return (b0Var == null || (charsetD = b0.d(b0Var, null, 1, null)) == null) ? Charsets.UTF_8 : charsetD;
    }

    @NotNull
    public static final Pair<Charset, b0> b(@Nullable b0 b0Var) {
        Charset charset = Charsets.UTF_8;
        if (b0Var != null) {
            Charset charsetD = b0.d(b0Var, null, 1, null);
            if (charsetD == null) {
                b0Var = b0.INSTANCE.b(b0Var + "; charset=utf-8");
            } else {
                charset = charsetD;
            }
        }
        return s.a(charset, b0Var);
    }

    @NotNull
    public static final String[] c(@NotNull mv.m mVar, @NotNull String[] socketEnabledCipherSuites) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(socketEnabledCipherSuites, "socketEnabledCipherSuites");
        return mVar.getCipherSuitesAsString() != null ? n.w(mVar.getCipherSuitesAsString(), socketEnabledCipherSuites, mv.j.INSTANCE.c()) : socketEnabledCipherSuites;
    }
}
