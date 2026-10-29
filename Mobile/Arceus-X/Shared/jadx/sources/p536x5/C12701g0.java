package p536x5;

import androidx.work.AbstractC1117c;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p146g6.C6029i;

/* JADX INFO: renamed from: x5.g0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00062\u00020\u0001:\u0002\u0007\bB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, m31665d2 = {"Lx5/g0;", "Lx5/q0;", "Lx5/g0$a;", "builder", "<init>", "(Lx5/g0$a;)V", "e", "a", "b", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C12701g0 extends AbstractC12721q0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12701g0(@NotNull a builder) {
        super(builder.getId(), builder.getWorkSpec(), builder.m47412f());
        Intrinsics.checkNotNullParameter(builder, "builder");
    }

    /* JADX INFO: renamed from: x5.g0$a */
    @Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001B!\b\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB;\b\u0016\u0012\u0010\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\b\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00008PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m31665d2 = {"Lx5/g0$a;", "Lx5/q0$a;", "Lx5/g0;", "Ljava/lang/Class;", "Landroidx/work/c;", "workerClass", "Ljava/time/Duration;", "repeatInterval", "<init>", "(Ljava/lang/Class;Ljava/time/Duration;)V", "", "Ljava/util/concurrent/TimeUnit;", "repeatIntervalTimeUnit", "flexInterval", "flexIntervalTimeUnit", "(Ljava/lang/Class;JLjava/util/concurrent/TimeUnit;JLjava/util/concurrent/TimeUnit;)V", "q", "()Lx5/g0;", "r", "()Lx5/g0$a;", "thisObject", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class a extends AbstractC12721q0.a<a, C12701g0> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull Class<? extends AbstractC1117c> workerClass, @NotNull Duration repeatInterval) {
            super(workerClass);
            Intrinsics.checkNotNullParameter(workerClass, "workerClass");
            Intrinsics.checkNotNullParameter(repeatInterval, "repeatInterval");
            getWorkSpec().m24766s(C6029i.m26824a(repeatInterval));
        }

        /* JADX DEBUG: Method merged with bridge method: c()Lx5/q0; */
        @Override // p536x5.AbstractC12721q0.a
        @NotNull
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public C12701g0 mo47374c() {
            if (getBackoffCriteriaSet() && getWorkSpec().constraints.getRequiresDeviceIdle()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            if (getWorkSpec().expedited) {
                throw new IllegalArgumentException("PeriodicWorkRequests cannot be expedited");
            }
            return new C12701g0(this);
        }

        /* JADX DEBUG: Method merged with bridge method: g()Lx5/q0$a; */
        @Override // p536x5.AbstractC12721q0.a
        @NotNull
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public a mo47375g() {
            return this;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull Class<? extends AbstractC1117c> workerClass, long j10, @NotNull TimeUnit repeatIntervalTimeUnit, long j11, @NotNull TimeUnit flexIntervalTimeUnit) {
            super(workerClass);
            Intrinsics.checkNotNullParameter(workerClass, "workerClass");
            Intrinsics.checkNotNullParameter(repeatIntervalTimeUnit, "repeatIntervalTimeUnit");
            Intrinsics.checkNotNullParameter(flexIntervalTimeUnit, "flexIntervalTimeUnit");
            getWorkSpec().m24767t(repeatIntervalTimeUnit.toMillis(j10), flexIntervalTimeUnit.toMillis(j11));
        }
    }
}
