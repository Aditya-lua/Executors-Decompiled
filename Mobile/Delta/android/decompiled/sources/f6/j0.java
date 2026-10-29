package f6;

import androidx.work.OverwritingInputMerger;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b8\b\u0087\b\u0018\u0000 b2\u00020\u0001:\u0003?1=B\u0081\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0003\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u000b\u0012\b\b\u0002\u0010 \u001a\u00020\u0011\u0012\b\b\u0002\u0010!\u001a\u00020\u0011\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b$\u0010%B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010&\u001a\u00020\u0002¢\u0006\u0004\b$\u0010'B\u0019\b\u0016\u0012\u0006\u0010(\u001a\u00020\u0002\u0012\u0006\u0010)\u001a\u00020\u0000¢\u0006\u0004\b$\u0010*J\u0015\u0010,\u001a\u00020+2\u0006\u0010\u0015\u001a\u00020\u000b¢\u0006\u0004\b,\u0010-J\u0015\u0010.\u001a\u00020+2\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b.\u0010-J\u001d\u0010/\u001a\u00020+2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\u000b¢\u0006\u0004\b1\u00102J\r\u00103\u001a\u00020\u0019¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0002H\u0016¢\u0006\u0004\b5\u00106J\u008e\u0002\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0003\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u00112\b\b\u0002\u0010\u001e\u001a\u00020\u00112\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u00112\b\b\u0002\u0010!\u001a\u00020\u00112\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0019HÆ\u0001¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b9\u0010:J\u001a\u0010;\u001a\u00020\u00192\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b;\u0010<R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b1\u0010>R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b7\u0010>R\u0016\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010\n\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bC\u0010BR\u0016\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010\r\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bF\u0010ER\u0016\u0010\u000e\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bG\u0010ER\u0016\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010\u0015\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b3\u0010ER\u0016\u0010\u0016\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bN\u0010ER\u0016\u0010\u0017\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bO\u0010ER\u0016\u0010\u0018\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b,\u0010ER\u0016\u0010\u001a\u001a\u00020\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010\u001c\u001a\u00020\u001b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\"\u0010\u001d\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b.\u0010K\u001a\u0004\bH\u0010:\"\u0004\bT\u0010UR\u001a\u0010\u001e\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010K\u001a\u0004\bD\u0010:R\"\u0010\u001f\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bV\u0010E\u001a\u0004\bF\u00102\"\u0004\bP\u0010-R\"\u0010 \u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bW\u0010K\u001a\u0004\bG\u0010:\"\u0004\bR\u0010UR\u001a\u0010!\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\bX\u0010K\u001a\u0004\bJ\u0010:R$\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bY\u0010>\u001a\u0004\bL\u00106\"\u0004\bV\u0010ZR$\u0010#\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\bC\u0010]\"\u0004\b^\u0010_R\u0011\u0010`\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bO\u00104R\u0011\u0010a\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bN\u00104¨\u0006c"}, d2 = {"Lf6/j0;", "", "", "id", "Lx5/o0$c;", "state", "workerClassName", "inputMergerClassName", "Landroidx/work/b;", "input", "output", "", "initialDelay", "intervalDuration", "flexDuration", "Lx5/d;", "constraints", "", "runAttemptCount", "Lx5/a;", "backoffPolicy", "backoffDelayDuration", "lastEnqueueTime", "minimumRetentionDuration", "scheduleRequestedAt", "", "expedited", "Lx5/f0;", "outOfQuotaPolicy", "periodCount", "generation", "nextScheduleTimeOverride", "nextScheduleTimeOverrideGeneration", "stopReason", "traceTag", "backOffOnSystemInterruptions", "<init>", "(Ljava/lang/String;Lx5/o0$c;Ljava/lang/String;Ljava/lang/String;Landroidx/work/b;Landroidx/work/b;JJJLx5/d;ILx5/a;JJJJZLx5/f0;IIJIILjava/lang/String;Ljava/lang/Boolean;)V", "workerClassName_", "(Ljava/lang/String;Ljava/lang/String;)V", "newId", "other", "(Ljava/lang/String;Lf6/j0;)V", "", "p", "(J)V", "s", "t", "(JJ)V", "c", "()J", "m", "()Z", "toString", "()Ljava/lang/String;", "d", "(Ljava/lang/String;Lx5/o0$c;Ljava/lang/String;Ljava/lang/String;Landroidx/work/b;Landroidx/work/b;JJJLx5/d;ILx5/a;JJJJZLx5/f0;IIJIILjava/lang/String;Ljava/lang/Boolean;)Lf6/j0;", "hashCode", "()I", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lx5/o0$c;", "e", "Landroidx/work/b;", "f", "g", "J", "h", "i", "j", "Lx5/d;", "k", "I", "l", "Lx5/a;", "n", "o", "q", "Z", "r", "Lx5/f0;", "setPeriodCount", "(I)V", "u", "v", "w", "x", "(Ljava/lang/String;)V", "y", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "setBackOffOnSystemInterruptions", "(Ljava/lang/Boolean;)V", "isPeriodic", "isBackedOff", "z", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class j0 {

    @NotNull
    public static final String A;

    @NotNull
    public static final t.a<List<WorkInfoPojo>, List<x5.o0>> B;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public x5.o0.c state;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String workerClassName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String inputMergerClassName;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public androidx.work.b input;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public androidx.work.b output;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public long initialDelay;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public long intervalDuration;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public long flexDuration;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public x5.d constraints;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public int runAttemptCount;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public x5.a backoffPolicy;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public long backoffDelayDuration;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public long lastEnqueueTime;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public long minimumRetentionDuration;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public long scheduleRequestedAt;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public boolean expedited;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public x5.f0 outOfQuotaPolicy;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    public int periodCount;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public final int generation;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    public long nextScheduleTimeOverride;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    public int nextScheduleTimeOverrideGeneration;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    public final int stopReason;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public String traceTag;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Boolean backOffOnSystemInterruptions;

    /* JADX INFO: renamed from: f6.j0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Je\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R,\u0010\u001e\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001b0\u001a8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lf6/j0$a;", "", "<init>", "()V", "", "isBackedOff", "", "runAttemptCount", "Lx5/a;", "backoffPolicy", "", "backoffDelayDuration", "lastEnqueueTime", "periodCount", "isPeriodic", "initialDelay", "flexDuration", "intervalDuration", "nextScheduleTimeOverride", "a", "(ZILx5/a;JJIZJJJJ)J", "", "TAG", "Ljava/lang/String;", "SCHEDULE_NOT_REQUESTED_YET", "J", "Lt/a;", "", "Lf6/j0$c;", "Lx5/o0;", "WORK_INFO_MAPPER", "Lt/a;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a(boolean isBackedOff, int runAttemptCount, @NotNull x5.a backoffPolicy, long backoffDelayDuration, long lastEnqueueTime, int periodCount, boolean isPeriodic, long initialDelay, long flexDuration, long intervalDuration, long nextScheduleTimeOverride) {
            Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
            if (nextScheduleTimeOverride != Long.MAX_VALUE && isPeriodic) {
                return periodCount == 0 ? nextScheduleTimeOverride : kotlin.ranges.d.d(nextScheduleTimeOverride, 900000 + lastEnqueueTime);
            }
            if (isBackedOff) {
                return kotlin.ranges.d.g(backoffPolicy == x5.a.LINEAR ? backoffDelayDuration * ((long) runAttemptCount) : (long) Math.scalb(backoffDelayDuration, runAttemptCount - 1), 18000000L) + lastEnqueueTime;
            }
            if (isPeriodic) {
                long j10 = periodCount == 0 ? lastEnqueueTime + initialDelay : lastEnqueueTime + intervalDuration;
                return (flexDuration == intervalDuration || periodCount != 0) ? j10 : j10 + (intervalDuration - flexDuration);
            }
            if (lastEnqueueTime == -1) {
                return Long.MAX_VALUE;
            }
            return lastEnqueueTime + initialDelay;
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: f6.j0$b, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lf6/j0$b;", "", "", "id", "Lx5/o0$c;", "state", "<init>", "(Ljava/lang/String;Lx5/o0$c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lx5/o0$c;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class IdAndState {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public String id;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public x5.o0.c state;

        public IdAndState(@NotNull String id2, @NotNull x5.o0.c state) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(state, "state");
            this.id = id2;
            this.state = state;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IdAndState)) {
                return false;
            }
            IdAndState idAndState = (IdAndState) other;
            return Intrinsics.c(this.id, idAndState.id) && this.state == idAndState.state;
        }

        public int hashCode() {
            return (this.id.hashCode() * 31) + this.state.hashCode();
        }

        @NotNull
        public String toString() {
            return "IdAndState(id=" + this.id + ", state=" + this.state + ')';
        }
    }

    /* JADX INFO: renamed from: f6.j0$c, reason: from toString */
    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010 \n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0017\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\rR\u001a\u0010\u001c\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\"\u001a\u00020\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010&\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0007R\u001a\u0010(\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b'\u0010\u0007R\u001a\u0010+\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b*\u0010\u0007R\u001a\u00101\u001a\u00020,8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001a\u00105\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u0010\u0010R\"\u0010=\u001a\u0002068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010B\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b>\u0010$\u001a\u0004\b?\u0010\u0007\"\u0004\b@\u0010AR\"\u0010F\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bC\u0010$\u001a\u0004\bD\u0010\u0007\"\u0004\bE\u0010AR\"\u0010K\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bG\u00103\u001a\u0004\bH\u0010\u0010\"\u0004\bI\u0010JR\u001a\u0010N\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bL\u00103\u001a\u0004\bM\u0010\u0010R\u001a\u0010Q\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\bO\u0010$\u001a\u0004\bP\u0010\u0007R\u001a\u0010T\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bR\u00103\u001a\u0004\bS\u0010\u0010R \u0010Z\u001a\b\u0012\u0004\u0012\u00020\u000b0U8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR \u0010]\u001a\b\u0012\u0004\u0012\u00020\u001d0U8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b[\u0010W\u001a\u0004\b\\\u0010YR\u0011\u0010_\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b#\u0010^R\u0011\u0010`\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u001e\u0010^¨\u0006a"}, d2 = {"Lf6/j0$c;", "", "Lx5/o0$b;", "b", "()Lx5/o0$b;", "", "a", "()J", "Lx5/o0;", "e", "()Lx5/o0;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "id", "Lx5/o0$c;", "Lx5/o0$c;", "getState", "()Lx5/o0$c;", "state", "Landroidx/work/b;", "c", "Landroidx/work/b;", "getOutput", "()Landroidx/work/b;", "output", "d", "J", "getInitialDelay", "initialDelay", "getIntervalDuration", "intervalDuration", "f", "getFlexDuration", "flexDuration", "Lx5/d;", "g", "Lx5/d;", "getConstraints", "()Lx5/d;", "constraints", "h", "I", "getRunAttemptCount", "runAttemptCount", "Lx5/a;", "i", "Lx5/a;", "getBackoffPolicy", "()Lx5/a;", "setBackoffPolicy", "(Lx5/a;)V", "backoffPolicy", "j", "getBackoffDelayDuration", "setBackoffDelayDuration", "(J)V", "backoffDelayDuration", "k", "getLastEnqueueTime", "setLastEnqueueTime", "lastEnqueueTime", "l", "getPeriodCount", "setPeriodCount", "(I)V", "periodCount", "m", "getGeneration", "generation", "n", "getNextScheduleTimeOverride", "nextScheduleTimeOverride", "o", "getStopReason", "stopReason", "", "p", "Ljava/util/List;", "getTags", "()Ljava/util/List;", "tags", "q", "getProgress", "progress", "()Z", "isPeriodic", "isBackedOff", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class WorkInfoPojo {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String id;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final x5.o0.c state;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final androidx.work.b output;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        public final long initialDelay;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        public final long intervalDuration;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        public final long flexDuration;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final x5.d constraints;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        public final int runAttemptCount;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public x5.a backoffPolicy;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        public long backoffDelayDuration;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        public long lastEnqueueTime;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        public int periodCount;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        public final int generation;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        public final long nextScheduleTimeOverride;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        public final int stopReason;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<String> tags;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<androidx.work.b> progress;

        public final long a() {
            if (this.state == x5.o0.c.ENQUEUED) {
                return j0.INSTANCE.a(c(), this.runAttemptCount, this.backoffPolicy, this.backoffDelayDuration, this.lastEnqueueTime, this.periodCount, d(), this.initialDelay, this.flexDuration, this.intervalDuration, this.nextScheduleTimeOverride);
            }
            return Long.MAX_VALUE;
        }

        public final x5.o0.b b() {
            long j10 = this.intervalDuration;
            if (j10 != 0) {
                return new x5.o0.b(j10, this.flexDuration);
            }
            return null;
        }

        public final boolean c() {
            return this.state == x5.o0.c.ENQUEUED && this.runAttemptCount > 0;
        }

        public final boolean d() {
            return this.intervalDuration != 0;
        }

        @NotNull
        public final x5.o0 e() {
            androidx.work.b bVar = !this.progress.isEmpty() ? this.progress.get(0) : androidx.work.b.f3500c;
            UUID uuidFromString = UUID.fromString(this.id);
            Intrinsics.checkNotNullExpressionValue(uuidFromString, "fromString(...)");
            return new x5.o0(uuidFromString, this.state, new HashSet(this.tags), this.output, bVar, this.runAttemptCount, this.generation, this.constraints, this.initialDelay, b(), a(), this.stopReason);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WorkInfoPojo)) {
                return false;
            }
            WorkInfoPojo workInfoPojo = (WorkInfoPojo) other;
            return Intrinsics.c(this.id, workInfoPojo.id) && this.state == workInfoPojo.state && Intrinsics.c(this.output, workInfoPojo.output) && this.initialDelay == workInfoPojo.initialDelay && this.intervalDuration == workInfoPojo.intervalDuration && this.flexDuration == workInfoPojo.flexDuration && Intrinsics.c(this.constraints, workInfoPojo.constraints) && this.runAttemptCount == workInfoPojo.runAttemptCount && this.backoffPolicy == workInfoPojo.backoffPolicy && this.backoffDelayDuration == workInfoPojo.backoffDelayDuration && this.lastEnqueueTime == workInfoPojo.lastEnqueueTime && this.periodCount == workInfoPojo.periodCount && this.generation == workInfoPojo.generation && this.nextScheduleTimeOverride == workInfoPojo.nextScheduleTimeOverride && this.stopReason == workInfoPojo.stopReason && Intrinsics.c(this.tags, workInfoPojo.tags) && Intrinsics.c(this.progress, workInfoPojo.progress);
        }

        public int hashCode() {
            return (((((((((((((((((((((((((((((((this.id.hashCode() * 31) + this.state.hashCode()) * 31) + this.output.hashCode()) * 31) + Long.hashCode(this.initialDelay)) * 31) + Long.hashCode(this.intervalDuration)) * 31) + Long.hashCode(this.flexDuration)) * 31) + this.constraints.hashCode()) * 31) + Integer.hashCode(this.runAttemptCount)) * 31) + this.backoffPolicy.hashCode()) * 31) + Long.hashCode(this.backoffDelayDuration)) * 31) + Long.hashCode(this.lastEnqueueTime)) * 31) + Integer.hashCode(this.periodCount)) * 31) + Integer.hashCode(this.generation)) * 31) + Long.hashCode(this.nextScheduleTimeOverride)) * 31) + Integer.hashCode(this.stopReason)) * 31) + this.tags.hashCode()) * 31) + this.progress.hashCode();
        }

        @NotNull
        public String toString() {
            return "WorkInfoPojo(id=" + this.id + ", state=" + this.state + ", output=" + this.output + ", initialDelay=" + this.initialDelay + ", intervalDuration=" + this.intervalDuration + ", flexDuration=" + this.flexDuration + ", constraints=" + this.constraints + ", runAttemptCount=" + this.runAttemptCount + ", backoffPolicy=" + this.backoffPolicy + ", backoffDelayDuration=" + this.backoffDelayDuration + ", lastEnqueueTime=" + this.lastEnqueueTime + ", periodCount=" + this.periodCount + ", generation=" + this.generation + ", nextScheduleTimeOverride=" + this.nextScheduleTimeOverride + ", stopReason=" + this.stopReason + ", tags=" + this.tags + ", progress=" + this.progress + ')';
        }
    }

    static {
        String strI = x5.w.i("WorkSpec");
        Intrinsics.checkNotNullExpressionValue(strI, "tagWithPrefix(...)");
        A = strI;
        B = new t.a() { // from class: f6.i0
            @Override // t.a
            public final Object apply(Object obj) {
                return j0.b((List) obj);
            }
        };
    }

    public j0(@NotNull String id2, @NotNull x5.o0.c state, @NotNull String workerClassName, @NotNull String inputMergerClassName, @NotNull androidx.work.b input, @NotNull androidx.work.b output, long j10, long j11, long j12, @NotNull x5.d constraints, int i10, @NotNull x5.a backoffPolicy, long j13, long j14, long j15, long j16, boolean z10, @NotNull x5.f0 outOfQuotaPolicy, int i11, int i12, long j17, int i13, int i14, @Nullable String str, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(workerClassName, "workerClassName");
        Intrinsics.checkNotNullParameter(inputMergerClassName, "inputMergerClassName");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(constraints, "constraints");
        Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
        Intrinsics.checkNotNullParameter(outOfQuotaPolicy, "outOfQuotaPolicy");
        this.id = id2;
        this.state = state;
        this.workerClassName = workerClassName;
        this.inputMergerClassName = inputMergerClassName;
        this.input = input;
        this.output = output;
        this.initialDelay = j10;
        this.intervalDuration = j11;
        this.flexDuration = j12;
        this.constraints = constraints;
        this.runAttemptCount = i10;
        this.backoffPolicy = backoffPolicy;
        this.backoffDelayDuration = j13;
        this.lastEnqueueTime = j14;
        this.minimumRetentionDuration = j15;
        this.scheduleRequestedAt = j16;
        this.expedited = z10;
        this.outOfQuotaPolicy = outOfQuotaPolicy;
        this.periodCount = i11;
        this.generation = i12;
        this.nextScheduleTimeOverride = j17;
        this.nextScheduleTimeOverrideGeneration = i13;
        this.stopReason = i14;
        this.traceTag = str;
        this.backOffOnSystemInterruptions = bool;
    }

    public static final List b(List list) {
        if (list == null) {
            return null;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(kotlin.collections.q.u(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((WorkInfoPojo) it.next()).e());
        }
        return arrayList;
    }

    public static /* synthetic */ j0 e(j0 j0Var, String str, x5.o0.c cVar, String str2, String str3, androidx.work.b bVar, androidx.work.b bVar2, long j10, long j11, long j12, x5.d dVar, int i10, x5.a aVar, long j13, long j14, long j15, long j16, boolean z10, x5.f0 f0Var, int i11, int i12, long j17, int i13, int i14, String str4, Boolean bool, int i15, Object obj) {
        Boolean bool2;
        String str5;
        String str6 = (i15 & 1) != 0 ? j0Var.id : str;
        x5.o0.c cVar2 = (i15 & 2) != 0 ? j0Var.state : cVar;
        String str7 = (i15 & 4) != 0 ? j0Var.workerClassName : str2;
        String str8 = (i15 & 8) != 0 ? j0Var.inputMergerClassName : str3;
        androidx.work.b bVar3 = (i15 & 16) != 0 ? j0Var.input : bVar;
        androidx.work.b bVar4 = (i15 & 32) != 0 ? j0Var.output : bVar2;
        long j18 = (i15 & 64) != 0 ? j0Var.initialDelay : j10;
        long j19 = (i15 & 128) != 0 ? j0Var.intervalDuration : j11;
        long j20 = (i15 & Barcode.FORMAT_QR_CODE) != 0 ? j0Var.flexDuration : j12;
        x5.d dVar2 = (i15 & Barcode.FORMAT_UPC_A) != 0 ? j0Var.constraints : dVar;
        int i16 = (i15 & Barcode.FORMAT_UPC_E) != 0 ? j0Var.runAttemptCount : i10;
        String str9 = str6;
        x5.a aVar2 = (i15 & Barcode.FORMAT_PDF417) != 0 ? j0Var.backoffPolicy : aVar;
        x5.o0.c cVar3 = cVar2;
        long j21 = (i15 & Barcode.FORMAT_AZTEC) != 0 ? j0Var.backoffDelayDuration : j13;
        long j22 = (i15 & 8192) != 0 ? j0Var.lastEnqueueTime : j14;
        long j23 = (i15 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? j0Var.minimumRetentionDuration : j15;
        long j24 = (i15 & 32768) != 0 ? j0Var.scheduleRequestedAt : j16;
        boolean z11 = (i15 & 65536) != 0 ? j0Var.expedited : z10;
        long j25 = j24;
        x5.f0 f0Var2 = (i15 & 131072) != 0 ? j0Var.outOfQuotaPolicy : f0Var;
        int i17 = (i15 & 262144) != 0 ? j0Var.periodCount : i11;
        x5.f0 f0Var3 = f0Var2;
        int i18 = (i15 & 524288) != 0 ? j0Var.generation : i12;
        int i19 = i17;
        long j26 = (i15 & 1048576) != 0 ? j0Var.nextScheduleTimeOverride : j17;
        int i20 = (i15 & 2097152) != 0 ? j0Var.nextScheduleTimeOverrideGeneration : i13;
        int i21 = (i15 & 4194304) != 0 ? j0Var.stopReason : i14;
        int i22 = i20;
        String str10 = (i15 & 8388608) != 0 ? j0Var.traceTag : str4;
        if ((i15 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0) {
            str5 = str10;
            bool2 = j0Var.backOffOnSystemInterruptions;
        } else {
            bool2 = bool;
            str5 = str10;
        }
        return j0Var.d(str9, cVar3, str7, str8, bVar3, bVar4, j18, j19, j20, dVar2, i16, aVar2, j21, j22, j23, j25, z11, f0Var3, i19, i18, j26, i22, i21, str5, bool2);
    }

    public final long c() {
        return INSTANCE.a(n(), this.runAttemptCount, this.backoffPolicy, this.backoffDelayDuration, this.lastEnqueueTime, this.periodCount, o(), this.initialDelay, this.flexDuration, this.intervalDuration, this.nextScheduleTimeOverride);
    }

    @NotNull
    public final j0 d(@NotNull String id2, @NotNull x5.o0.c state, @NotNull String workerClassName, @NotNull String inputMergerClassName, @NotNull androidx.work.b input, @NotNull androidx.work.b output, long initialDelay, long intervalDuration, long flexDuration, @NotNull x5.d constraints, int runAttemptCount, @NotNull x5.a backoffPolicy, long backoffDelayDuration, long lastEnqueueTime, long minimumRetentionDuration, long scheduleRequestedAt, boolean expedited, @NotNull x5.f0 outOfQuotaPolicy, int periodCount, int generation, long nextScheduleTimeOverride, int nextScheduleTimeOverrideGeneration, int stopReason, @Nullable String traceTag, @Nullable Boolean backOffOnSystemInterruptions) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(workerClassName, "workerClassName");
        Intrinsics.checkNotNullParameter(inputMergerClassName, "inputMergerClassName");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(constraints, "constraints");
        Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
        Intrinsics.checkNotNullParameter(outOfQuotaPolicy, "outOfQuotaPolicy");
        return new j0(id2, state, workerClassName, inputMergerClassName, input, output, initialDelay, intervalDuration, flexDuration, constraints, runAttemptCount, backoffPolicy, backoffDelayDuration, lastEnqueueTime, minimumRetentionDuration, scheduleRequestedAt, expedited, outOfQuotaPolicy, periodCount, generation, nextScheduleTimeOverride, nextScheduleTimeOverrideGeneration, stopReason, traceTag, backOffOnSystemInterruptions);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) other;
        return Intrinsics.c(this.id, j0Var.id) && this.state == j0Var.state && Intrinsics.c(this.workerClassName, j0Var.workerClassName) && Intrinsics.c(this.inputMergerClassName, j0Var.inputMergerClassName) && Intrinsics.c(this.input, j0Var.input) && Intrinsics.c(this.output, j0Var.output) && this.initialDelay == j0Var.initialDelay && this.intervalDuration == j0Var.intervalDuration && this.flexDuration == j0Var.flexDuration && Intrinsics.c(this.constraints, j0Var.constraints) && this.runAttemptCount == j0Var.runAttemptCount && this.backoffPolicy == j0Var.backoffPolicy && this.backoffDelayDuration == j0Var.backoffDelayDuration && this.lastEnqueueTime == j0Var.lastEnqueueTime && this.minimumRetentionDuration == j0Var.minimumRetentionDuration && this.scheduleRequestedAt == j0Var.scheduleRequestedAt && this.expedited == j0Var.expedited && this.outOfQuotaPolicy == j0Var.outOfQuotaPolicy && this.periodCount == j0Var.periodCount && this.generation == j0Var.generation && this.nextScheduleTimeOverride == j0Var.nextScheduleTimeOverride && this.nextScheduleTimeOverrideGeneration == j0Var.nextScheduleTimeOverrideGeneration && this.stopReason == j0Var.stopReason && Intrinsics.c(this.traceTag, j0Var.traceTag) && Intrinsics.c(this.backOffOnSystemInterruptions, j0Var.backOffOnSystemInterruptions);
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public final Boolean getBackOffOnSystemInterruptions() {
        return this.backOffOnSystemInterruptions;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getGeneration() {
        return this.generation;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final long getNextScheduleTimeOverride() {
        return this.nextScheduleTimeOverride;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((((((((((((((((((((this.id.hashCode() * 31) + this.state.hashCode()) * 31) + this.workerClassName.hashCode()) * 31) + this.inputMergerClassName.hashCode()) * 31) + this.input.hashCode()) * 31) + this.output.hashCode()) * 31) + Long.hashCode(this.initialDelay)) * 31) + Long.hashCode(this.intervalDuration)) * 31) + Long.hashCode(this.flexDuration)) * 31) + this.constraints.hashCode()) * 31) + Integer.hashCode(this.runAttemptCount)) * 31) + this.backoffPolicy.hashCode()) * 31) + Long.hashCode(this.backoffDelayDuration)) * 31) + Long.hashCode(this.lastEnqueueTime)) * 31) + Long.hashCode(this.minimumRetentionDuration)) * 31) + Long.hashCode(this.scheduleRequestedAt)) * 31) + Boolean.hashCode(this.expedited)) * 31) + this.outOfQuotaPolicy.hashCode()) * 31) + Integer.hashCode(this.periodCount)) * 31) + Integer.hashCode(this.generation)) * 31) + Long.hashCode(this.nextScheduleTimeOverride)) * 31) + Integer.hashCode(this.nextScheduleTimeOverrideGeneration)) * 31) + Integer.hashCode(this.stopReason)) * 31;
        String str = this.traceTag;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.backOffOnSystemInterruptions;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getNextScheduleTimeOverrideGeneration() {
        return this.nextScheduleTimeOverrideGeneration;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getPeriodCount() {
        return this.periodCount;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getStopReason() {
        return this.stopReason;
    }

    @Nullable
    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getTraceTag() {
        return this.traceTag;
    }

    public final boolean m() {
        return !Intrinsics.c(x5.d.f34916k, this.constraints);
    }

    public final boolean n() {
        return this.state == x5.o0.c.ENQUEUED && this.runAttemptCount > 0;
    }

    public final boolean o() {
        return this.intervalDuration != 0;
    }

    public final void p(long backoffDelayDuration) {
        if (backoffDelayDuration > 18000000) {
            x5.w.e().k(A, "Backoff delay duration exceeds maximum value");
        }
        if (backoffDelayDuration < 10000) {
            x5.w.e().k(A, "Backoff delay duration less than minimum value");
        }
        this.backoffDelayDuration = kotlin.ranges.d.k(backoffDelayDuration, 10000L, 18000000L);
    }

    public final void q(long j10) {
        this.nextScheduleTimeOverride = j10;
    }

    public final void r(int i10) {
        this.nextScheduleTimeOverrideGeneration = i10;
    }

    public final void s(long intervalDuration) {
        if (intervalDuration < 900000) {
            x5.w.e().k(A, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        t(kotlin.ranges.d.d(intervalDuration, 900000L), kotlin.ranges.d.d(intervalDuration, 900000L));
    }

    public final void t(long intervalDuration, long flexDuration) {
        if (intervalDuration < 900000) {
            x5.w.e().k(A, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        this.intervalDuration = kotlin.ranges.d.d(intervalDuration, 900000L);
        if (flexDuration < 300000) {
            x5.w.e().k(A, "Flex duration lesser than minimum allowed value; Changed to 300000");
        }
        if (flexDuration > this.intervalDuration) {
            x5.w.e().k(A, "Flex duration greater than interval duration; Changed to " + intervalDuration);
        }
        this.flexDuration = kotlin.ranges.d.k(flexDuration, 300000L, this.intervalDuration);
    }

    @NotNull
    public String toString() {
        return "{WorkSpec: " + this.id + '}';
    }

    public final void u(@Nullable String str) {
        this.traceTag = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ j0(String str, x5.o0.c cVar, String str2, String str3, androidx.work.b bVar, androidx.work.b bVar2, long j10, long j11, long j12, x5.d dVar, int i10, x5.a aVar, long j13, long j14, long j15, long j16, boolean z10, x5.f0 f0Var, int i11, int i12, long j17, int i13, int i14, String str4, Boolean bool, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        String str5;
        x5.o0.c cVar2 = (i15 & 2) != 0 ? x5.o0.c.ENQUEUED : cVar;
        if ((i15 & 8) != 0) {
            String name = OverwritingInputMerger.class.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            str5 = name;
        } else {
            str5 = str3;
        }
        this(str, cVar2, str2, str5, (i15 & 16) != 0 ? androidx.work.b.f3500c : bVar, (i15 & 32) != 0 ? androidx.work.b.f3500c : bVar2, (i15 & 64) != 0 ? 0L : j10, (i15 & 128) != 0 ? 0L : j11, (i15 & Barcode.FORMAT_QR_CODE) != 0 ? 0L : j12, (i15 & Barcode.FORMAT_UPC_A) != 0 ? x5.d.f34916k : dVar, (i15 & Barcode.FORMAT_UPC_E) != 0 ? 0 : i10, (i15 & Barcode.FORMAT_PDF417) != 0 ? x5.a.EXPONENTIAL : aVar, (i15 & Barcode.FORMAT_AZTEC) != 0 ? 30000L : j13, (i15 & 8192) != 0 ? -1L : j14, (i15 & Http2.INITIAL_MAX_FRAME_SIZE) == 0 ? j15 : 0L, (32768 & i15) != 0 ? -1L : j16, (65536 & i15) != 0 ? false : z10, (131072 & i15) != 0 ? x5.f0.RUN_AS_NON_EXPEDITED_WORK_REQUEST : f0Var, (262144 & i15) != 0 ? 0 : i11, (524288 & i15) != 0 ? 0 : i12, (1048576 & i15) != 0 ? Long.MAX_VALUE : j17, (2097152 & i15) != 0 ? 0 : i13, (4194304 & i15) != 0 ? -256 : i14, (8388608 & i15) != 0 ? null : str4, (i15 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? Boolean.FALSE : bool);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j0(@NotNull String id2, @NotNull String workerClassName_) {
        this(id2, null, workerClassName_, null, null, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 0L, 0, 0, null, null, 33554426, null);
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(workerClassName_, "workerClassName_");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j0(@NotNull String newId, @NotNull j0 other) {
        this(newId, other.state, other.workerClassName, other.inputMergerClassName, new androidx.work.b(other.input), new androidx.work.b(other.output), other.initialDelay, other.intervalDuration, other.flexDuration, new x5.d(other.constraints), other.runAttemptCount, other.backoffPolicy, other.backoffDelayDuration, other.lastEnqueueTime, other.minimumRetentionDuration, other.scheduleRequestedAt, other.expedited, other.outOfQuotaPolicy, other.periodCount, 0, other.nextScheduleTimeOverride, other.nextScheduleTimeOverrideGeneration, other.stopReason, other.traceTag, other.backOffOnSystemInterruptions, 524288, null);
        Intrinsics.checkNotNullParameter(newId, "newId");
        Intrinsics.checkNotNullParameter(other, "other");
    }
}
