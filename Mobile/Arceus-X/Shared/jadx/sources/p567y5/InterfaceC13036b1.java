package p567y5;

import androidx.work.WorkerParameters;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: y5.b1 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\u0006J\u001f\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, m31665d2 = {"Ly5/b1;", "", "Ly5/y;", "workSpecId", "", "d", "(Ly5/y;)V", "Landroidx/work/WorkerParameters$a;", "runtimeExtras", "e", "(Ly5/y;Landroidx/work/WorkerParameters$a;)V", "a", "", "reason", "b", "(Ly5/y;I)V", "c", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public interface InterfaceC13036b1 {
    /* JADX INFO: renamed from: a */
    default void m48550a(@NotNull C13098y workSpecId) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        mo48551b(workSpecId, -512);
    }

    /* JADX INFO: renamed from: b */
    void mo48551b(@NotNull C13098y workSpecId, int reason);

    /* JADX INFO: renamed from: c */
    default void m48552c(@NotNull C13098y workSpecId, int reason) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        mo48551b(workSpecId, reason);
    }

    /* JADX INFO: renamed from: d */
    default void m48553d(@NotNull C13098y workSpecId) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        mo48554e(workSpecId, null);
    }

    /* JADX INFO: renamed from: e */
    void mo48554e(@NotNull C13098y workSpecId, @Nullable WorkerParameters.C1114a runtimeExtras);
}
