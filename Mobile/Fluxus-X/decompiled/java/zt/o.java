package zt;

import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u0006*\u0006\u0012\u0002\b\u00030\u0005H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {BuildConfig.FLAVOR, "exception", BuildConfig.FLAVOR, "a", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "Lzt/n;", BuildConfig.FLAVOR, "b", "(Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class o {
    @NotNull
    public static final Object a(@NotNull Throwable exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        return new n.Failure(exception);
    }

    public static final void b(@NotNull Object obj) {
        if (obj instanceof n.Failure) {
            throw ((n.Failure) obj).exception;
        }
    }
}
