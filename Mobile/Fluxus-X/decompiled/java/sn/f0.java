package sn;

import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lsn/f0;", "Lsn/k;", BuildConfig.FLAVOR, "message", BuildConfig.FLAVOR, "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f0 extends k {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(@NotNull String message, @Nullable Throwable th2) {
        super(message, th2, null);
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
