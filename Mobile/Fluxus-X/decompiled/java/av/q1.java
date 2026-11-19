package av;

import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006*\u001e\b\u0002\u0010\f\u001a\u0004\b\u0000\u0010\n\"\b\u0012\u0004\u0012\u00028\u00000\u000b2\b\u0012\u0004\u0012\u00028\u00000\u000b¨\u0006\r"}, d2 = {BuildConfig.FLAVOR, "timeMillis", "c", "(J)J", "Lgv/e0;", "a", "Lgv/e0;", "DISPOSED_TASK", "b", "CLOSED_EMPTY", "T", "Lgv/r;", "Queue", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final gv.e0 f3473a = new gv.e0("REMOVED_TASK");

    @NotNull
    public static final gv.e0 b = new gv.e0("CLOSED_EMPTY");

    public static final long c(long j10) {
        if (j10 <= 0) {
            return 0L;
        }
        if (j10 >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return j10 * 1000000;
    }
}
