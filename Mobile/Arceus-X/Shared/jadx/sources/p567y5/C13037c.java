package p567y5;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p145g5.InterfaceC6008c;
import p535x4.AbstractC12682u;
import p536x5.InterfaceC12690b;

/* JADX INFO: renamed from: y5.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m31665d2 = {"Ly5/c;", "Lx4/u$b;", "Lx5/b;", "clock", "<init>", "(Lx5/b;)V", "Lg5/c;", "db", "", "f", "(Lg5/c;)V", "a", "Lx5/b;", "getClock", "()Lx5/b;", "", "h", "()Ljava/lang/String;", "pruneSQL", "", "g", "()J", "pruneDate", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C13037c extends AbstractC12682u.b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC12690b clock;

    public C13037c(@NotNull InterfaceC12690b clock) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.clock = clock;
    }

    @Override // p535x4.AbstractC12682u.b
    /* JADX INFO: renamed from: f */
    public void mo47239f(@NotNull InterfaceC6008c db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        super.mo47239f(db2);
        db2.mo6895G();
        try {
            db2.mo6899R(m48556h());
            db2.mo6905q0();
        } finally {
            db2.mo6896G0();
        }
    }

    /* JADX INFO: renamed from: g */
    public final long m48555g() {
        return this.clock.mo47323a() - C13053h0.f46213a;
    }

    /* JADX INFO: renamed from: h */
    public final String m48556h() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < " + m48555g() + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }
}
