package nj;

import com.github.luben.zstd.BuildConfig;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.collections.CollectionsKt;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lnj/l0;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "Lw7/k;", "purchases", BuildConfig.FLAVOR, "b", "(Ljava/util/List;)Ljava/lang/String;", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final l0 f25728a = new l0();

    @NotNull
    public static final String b(@NotNull List<? extends w7.k> purchases) {
        Intrinsics.checkNotNullParameter(purchases, "purchases");
        return CollectionsKt.m0(purchases, "; ", null, null, 0, null, new Function1() { // from class: nj.k0
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l0.c((w7.k) obj);
            }
        }, 30, null);
    }

    public static final CharSequence c(w7.k it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String strK = b.k(it);
        return strK != null ? strK : BuildConfig.FLAVOR;
    }
}
