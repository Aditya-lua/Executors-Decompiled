package p146g6;

import androidx.work.impl.WorkDatabase;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: g6.n */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, m31665d2 = {"Lg6/n;", "", "Landroidx/work/impl/WorkDatabase;", "workDatabase", "<init>", "(Landroidx/work/impl/WorkDatabase;)V", "", "minInclusive", "maxInclusive", "b", "(II)I", "a", "Landroidx/work/impl/WorkDatabase;", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C6034n {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final WorkDatabase workDatabase;

    public C6034n(@NotNull WorkDatabase workDatabase) {
        Intrinsics.checkNotNullParameter(workDatabase, "workDatabase");
        this.workDatabase = workDatabase;
    }

    /* JADX INFO: renamed from: c */
    public static final Integer m26836c(C6034n c6034n, int i10, int i11) {
        int iM26841d = C6035o.m26841d(c6034n.workDatabase, "next_job_scheduler_id");
        if (i10 > iM26841d || iM26841d > i11) {
            C6035o.m26842e(c6034n.workDatabase, "next_job_scheduler_id", i10 + 1);
        } else {
            i10 = iM26841d;
        }
        return Integer.valueOf(i10);
    }

    /* JADX INFO: renamed from: b */
    public final int m26837b(final int minInclusive, final int maxInclusive) {
        Object objM47264P = this.workDatabase.m47264P(new Callable() { // from class: g6.m
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C6034n.m26836c(this.f23311a, minInclusive, maxInclusive);
            }
        });
        Intrinsics.checkNotNullExpressionValue(objM47264P, "runInTransaction(...)");
        return ((Number) objM47264P).intValue();
    }
}
