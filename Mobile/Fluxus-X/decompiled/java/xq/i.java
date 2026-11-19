package xq;

import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lf4/o;", "Lf4/k0;", "fm", BuildConfig.FLAVOR, "tag", BuildConfig.FLAVOR, "a", "(Lf4/o;Lf4/k0;Ljava/lang/String;)V", "shared_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class i {
    public static final void a(@NotNull f4.o oVar, @NotNull f4.k0 fm2, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        Intrinsics.checkNotNullParameter(fm2, "fm");
        Intrinsics.checkNotNullParameter(tag, "tag");
        try {
            oVar.t2(fm2, tag);
        } catch (IllegalStateException unused) {
        }
    }
}
