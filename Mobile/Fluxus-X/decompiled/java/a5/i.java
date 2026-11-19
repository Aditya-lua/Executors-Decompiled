package a5;

import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a9\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lg5/c;", "driver", BuildConfig.FLAVOR, "fileName", BuildConfig.FLAVOR, "preparedStatementCacheSize", "La5/c;", "b", "(Lg5/c;Ljava/lang/String;I)La5/c;", "maxNumOfReaders", "maxNumOfWriters", "a", "(Lg5/c;Ljava/lang/String;III)La5/c;", "room-runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class i {
    @NotNull
    public static final c a(@NotNull g5.c driver, @NotNull String fileName, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(driver, "driver");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        return new h(driver, fileName, i10, i11, i12);
    }

    @NotNull
    public static final c b(@NotNull g5.c driver, @NotNull String fileName, int i10) {
        Intrinsics.checkNotNullParameter(driver, "driver");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        return new h(driver, fileName, i10);
    }
}
