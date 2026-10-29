package p536x5;

import androidx.core.app.NotificationCompat;
import androidx.work.C1116b;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p394qt.C10708b;
import p394qt.InterfaceC10707a;

/* JADX INFO: renamed from: x5.o0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b/\u0018\u0000 H2\u00020\u0001:\u0003)%!B\u0083\u0001\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0016\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b1\u0010.\u001a\u0004\b2\u00100R\u0017\u0010\r\u001a\u00020\f8G¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u0010\u001eR\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b6\u00104\u001a\u0004\b7\u0010\u001eR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0017\u0010\u0015\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bD\u0010=\u001a\u0004\bE\u0010?R\u0017\u0010\u0016\u001a\u00020\f8G¢\u0006\f\n\u0004\bF\u00104\u001a\u0004\bG\u0010\u001e¨\u0006I"}, m31665d2 = {"Lx5/o0;", "", "Ljava/util/UUID;", "id", "Lx5/o0$c;", "state", "", "", "tags", "Landroidx/work/b;", "outputData", NotificationCompat.CATEGORY_PROGRESS, "", "runAttemptCount", "generation", "Lx5/d;", "constraints", "", "initialDelayMillis", "Lx5/o0$b;", "periodicityInfo", "nextScheduleTimeMillis", "stopReason", "<init>", "(Ljava/util/UUID;Lx5/o0$c;Ljava/util/Set;Landroidx/work/b;Landroidx/work/b;IILx5/d;JLx5/o0$b;JI)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/util/UUID;", "getId", "()Ljava/util/UUID;", "b", "Lx5/o0$c;", "getState", "()Lx5/o0$c;", "c", "Ljava/util/Set;", "getTags", "()Ljava/util/Set;", "d", "Landroidx/work/b;", "getOutputData", "()Landroidx/work/b;", "e", "getProgress", "f", "I", "getRunAttemptCount", "g", "getGeneration", "h", "Lx5/d;", "getConstraints", "()Lx5/d;", "i", "J", "getInitialDelayMillis", "()J", "j", "Lx5/o0$b;", "getPeriodicityInfo", "()Lx5/o0$b;", "k", "getNextScheduleTimeMillis", "l", "getStopReason", "m", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C12717o0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final UUID id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final c state;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    public final Set<String> tags;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    public final C1116b outputData;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @NotNull
    public final C1116b progress;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    public final int runAttemptCount;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    public final int generation;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @NotNull
    public final C12694d constraints;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    public final long initialDelayMillis;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    @Nullable
    public final b periodicityInfo;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    public final long nextScheduleTimeMillis;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata and from toString */
    public final int stopReason;

    /* JADX INFO: renamed from: x5.o0$b */
    @Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, m31665d2 = {"Lx5/o0$b;", "", "", "repeatIntervalMillis", "flexIntervalMillis", "<init>", "(JJ)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "J", "getRepeatIntervalMillis", "()J", "b", "getFlexIntervalMillis", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final long repeatIntervalMillis;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public final long flexIntervalMillis;

        public b(long j10, long j11) {
            this.repeatIntervalMillis = j10;
            this.flexIntervalMillis = j11;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (other != null && Intrinsics.m31980c(b.class, other.getClass())) {
                b bVar = (b) other;
                if (bVar.repeatIntervalMillis == this.repeatIntervalMillis && bVar.flexIntervalMillis == this.flexIntervalMillis) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (Long.hashCode(this.repeatIntervalMillis) * 31) + Long.hashCode(this.flexIntervalMillis);
        }

        @NotNull
        public String toString() {
            return "PeriodicityInfo{repeatIntervalMillis=" + this.repeatIntervalMillis + ", flexIntervalMillis=" + this.flexIntervalMillis + '}';
        }
    }

    /* JADX INFO: renamed from: x5.o0$c */
    @Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\u0005j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, m31665d2 = {"Lx5/o0$c;", "", "<init>", "(Ljava/lang/String;I)V", "", "b", "()Z", "isFinished", "a", "c", "d", "e", "f", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public enum c {
        ENQUEUED,
        RUNNING,
        SUCCEEDED,
        FAILED,
        BLOCKED,
        CANCELLED;


        /* JADX INFO: renamed from: h */
        public static final /* synthetic */ InterfaceC10707a f45299h = C10708b.m40805a(m47390a());

        /* JADX INFO: renamed from: b */
        public final boolean m47391b() {
            return this == SUCCEEDED || this == FAILED || this == CANCELLED;
        }
    }

    public C12717o0(@NotNull UUID id2, @NotNull c state, @NotNull Set<String> tags, @NotNull C1116b outputData, @NotNull C1116b progress, int i10, int i11, @NotNull C12694d constraints, long j10, @Nullable b bVar, long j11, int i12) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(outputData, "outputData");
        Intrinsics.checkNotNullParameter(progress, "progress");
        Intrinsics.checkNotNullParameter(constraints, "constraints");
        this.id = id2;
        this.state = state;
        this.tags = tags;
        this.outputData = outputData;
        this.progress = progress;
        this.runAttemptCount = i10;
        this.generation = i11;
        this.constraints = constraints;
        this.initialDelayMillis = j10;
        this.periodicityInfo = bVar;
        this.nextScheduleTimeMillis = j11;
        this.stopReason = i12;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !Intrinsics.m31980c(C12717o0.class, other.getClass())) {
            return false;
        }
        C12717o0 c12717o0 = (C12717o0) other;
        if (this.runAttemptCount == c12717o0.runAttemptCount && this.generation == c12717o0.generation && Intrinsics.m31980c(this.id, c12717o0.id) && this.state == c12717o0.state && Intrinsics.m31980c(this.outputData, c12717o0.outputData) && Intrinsics.m31980c(this.constraints, c12717o0.constraints) && this.initialDelayMillis == c12717o0.initialDelayMillis && Intrinsics.m31980c(this.periodicityInfo, c12717o0.periodicityInfo) && this.nextScheduleTimeMillis == c12717o0.nextScheduleTimeMillis && this.stopReason == c12717o0.stopReason && Intrinsics.m31980c(this.tags, c12717o0.tags)) {
            return Intrinsics.m31980c(this.progress, c12717o0.progress);
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((this.id.hashCode() * 31) + this.state.hashCode()) * 31) + this.outputData.hashCode()) * 31) + this.tags.hashCode()) * 31) + this.progress.hashCode()) * 31) + this.runAttemptCount) * 31) + this.generation) * 31) + this.constraints.hashCode()) * 31) + Long.hashCode(this.initialDelayMillis)) * 31;
        b bVar = this.periodicityInfo;
        return ((((iHashCode + (bVar != null ? bVar.hashCode() : 0)) * 31) + Long.hashCode(this.nextScheduleTimeMillis)) * 31) + Integer.hashCode(this.stopReason);
    }

    @NotNull
    public String toString() {
        return "WorkInfo{id='" + this.id + "', state=" + this.state + ", outputData=" + this.outputData + ", tags=" + this.tags + ", progress=" + this.progress + ", runAttemptCount=" + this.runAttemptCount + ", generation=" + this.generation + ", constraints=" + this.constraints + ", initialDelayMillis=" + this.initialDelayMillis + ", periodicityInfo=" + this.periodicityInfo + ", nextScheduleTimeMillis=" + this.nextScheduleTimeMillis + "}, stopReason=" + this.stopReason;
    }
}
