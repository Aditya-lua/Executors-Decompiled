package p120f6;

import androidx.core.app.NotificationCompat;
import androidx.work.C1116b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: f6.c0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000e"}, m31665d2 = {"Lf6/c0;", "", "", "workSpecId", "Landroidx/work/b;", NotificationCompat.CATEGORY_PROGRESS, "<init>", "(Ljava/lang/String;Landroidx/work/b;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Landroidx/work/b;", "()Landroidx/work/b;", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C5369c0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String workSpecId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C1116b progress;

    public C5369c0(@NotNull String workSpecId, @NotNull C1116b progress) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        Intrinsics.checkNotNullParameter(progress, "progress");
        this.workSpecId = workSpecId;
        this.progress = progress;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final C1116b getProgress() {
        return this.progress;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getWorkSpecId() {
        return this.workSpecId;
    }
}
