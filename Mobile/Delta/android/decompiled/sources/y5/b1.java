package y5;

import androidx.work.WorkerParameters;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\u0006J\u001f\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Ly5/b1;", "", "Ly5/y;", "workSpecId", "", "d", "(Ly5/y;)V", "Landroidx/work/WorkerParameters$a;", "runtimeExtras", "e", "(Ly5/y;Landroidx/work/WorkerParameters$a;)V", "a", "", "reason", "b", "(Ly5/y;I)V", "c", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface b1 {
    default void a(@NotNull y workSpecId) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        b(workSpecId, -512);
    }

    void b(@NotNull y workSpecId, int reason);

    default void c(@NotNull y workSpecId, int reason) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        b(workSpecId, reason);
    }

    default void d(@NotNull y workSpecId) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        e(workSpecId, null);
    }

    void e(@NotNull y workSpecId, @Nullable WorkerParameters.a runtimeExtras);
}
