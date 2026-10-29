package p120f6;

import androidx.core.app.NotificationCompat;
import androidx.work.C1116b;
import androidx.work.OverwritingInputMerger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.C7701q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C7764d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p436t.InterfaceC11464a;
import p536x5.AbstractC12732w;
import p536x5.C12694d;
import p536x5.C12717o0;
import p536x5.EnumC12688a;
import p536x5.EnumC12699f0;

/* JADX INFO: renamed from: f6.j0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b8\b\u0087\b\u0018\u0000 b2\u00020\u0001:\u0003?1=B\u0081\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0003\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u000b\u0012\b\b\u0002\u0010 \u001a\u00020\u0011\u0012\b\b\u0002\u0010!\u001a\u00020\u0011\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b$\u0010%B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010&\u001a\u00020\u0002¢\u0006\u0004\b$\u0010'B\u0019\b\u0016\u0012\u0006\u0010(\u001a\u00020\u0002\u0012\u0006\u0010)\u001a\u00020\u0000¢\u0006\u0004\b$\u0010*J\u0015\u0010,\u001a\u00020+2\u0006\u0010\u0015\u001a\u00020\u000b¢\u0006\u0004\b,\u0010-J\u0015\u0010.\u001a\u00020+2\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b.\u0010-J\u001d\u0010/\u001a\u00020+2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\u000b¢\u0006\u0004\b1\u00102J\r\u00103\u001a\u00020\u0019¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0002H\u0016¢\u0006\u0004\b5\u00106J\u008e\u0002\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0003\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u00112\b\b\u0002\u0010\u001e\u001a\u00020\u00112\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u00112\b\b\u0002\u0010!\u001a\u00020\u00112\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0019HÆ\u0001¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b9\u0010:J\u001a\u0010;\u001a\u00020\u00192\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b;\u0010<R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b1\u0010>R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b7\u0010>R\u0016\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010\n\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bC\u0010BR\u0016\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010\r\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bF\u0010ER\u0016\u0010\u000e\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bG\u0010ER\u0016\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010\u0015\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b3\u0010ER\u0016\u0010\u0016\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bN\u0010ER\u0016\u0010\u0017\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bO\u0010ER\u0016\u0010\u0018\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b,\u0010ER\u0016\u0010\u001a\u001a\u00020\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010\u001c\u001a\u00020\u001b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\"\u0010\u001d\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b.\u0010K\u001a\u0004\bH\u0010:\"\u0004\bT\u0010UR\u001a\u0010\u001e\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010K\u001a\u0004\bD\u0010:R\"\u0010\u001f\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bV\u0010E\u001a\u0004\bF\u00102\"\u0004\bP\u0010-R\"\u0010 \u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bW\u0010K\u001a\u0004\bG\u0010:\"\u0004\bR\u0010UR\u001a\u0010!\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\bX\u0010K\u001a\u0004\bJ\u0010:R$\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bY\u0010>\u001a\u0004\bL\u00106\"\u0004\bV\u0010ZR$\u0010#\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\bC\u0010]\"\u0004\b^\u0010_R\u0011\u0010`\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bO\u00104R\u0011\u0010a\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bN\u00104¨\u0006c"}, m31665d2 = {"Lf6/j0;", "", "", "id", "Lx5/o0$c;", "state", "workerClassName", "inputMergerClassName", "Landroidx/work/b;", "input", "output", "", "initialDelay", "intervalDuration", "flexDuration", "Lx5/d;", "constraints", "", "runAttemptCount", "Lx5/a;", "backoffPolicy", "backoffDelayDuration", "lastEnqueueTime", "minimumRetentionDuration", "scheduleRequestedAt", "", "expedited", "Lx5/f0;", "outOfQuotaPolicy", "periodCount", "generation", "nextScheduleTimeOverride", "nextScheduleTimeOverrideGeneration", "stopReason", "traceTag", "backOffOnSystemInterruptions", "<init>", "(Ljava/lang/String;Lx5/o0$c;Ljava/lang/String;Ljava/lang/String;Landroidx/work/b;Landroidx/work/b;JJJLx5/d;ILx5/a;JJJJZLx5/f0;IIJIILjava/lang/String;Ljava/lang/Boolean;)V", "workerClassName_", "(Ljava/lang/String;Ljava/lang/String;)V", "newId", "other", "(Ljava/lang/String;Lf6/j0;)V", "", "p", "(J)V", "s", "t", "(JJ)V", "c", "()J", "m", "()Z", "toString", "()Ljava/lang/String;", "d", "(Ljava/lang/String;Lx5/o0$c;Ljava/lang/String;Ljava/lang/String;Landroidx/work/b;Landroidx/work/b;JJJLx5/d;ILx5/a;JJJJZLx5/f0;IIJIILjava/lang/String;Ljava/lang/Boolean;)Lf6/j0;", "hashCode", "()I", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lx5/o0$c;", "e", "Landroidx/work/b;", "f", "g", "J", "h", "i", "j", "Lx5/d;", "k", "I", "l", "Lx5/a;", "n", "o", "q", "Z", "r", "Lx5/f0;", "setPeriodCount", "(I)V", "u", "v", "w", "x", "(Ljava/lang/String;)V", "y", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "setBackOffOnSystemInterruptions", "(Ljava/lang/Boolean;)V", "isPeriodic", "isBackedOff", "z", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final /* data */ class C5390j0 {

    /* JADX INFO: renamed from: A */
    @NotNull
    public static final String f20888A;

    /* JADX INFO: renamed from: B */
    @NotNull
    public static final InterfaceC11464a<List<WorkInfoPojo>, List<C12717o0>> f20889B;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public C12717o0.c state;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public String workerClassName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public String inputMergerClassName;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public C1116b input;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public C1116b output;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public long initialDelay;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public long intervalDuration;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public long flexDuration;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public C12694d constraints;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public int runAttemptCount;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public EnumC12688a backoffPolicy;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public long backoffDelayDuration;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public long lastEnqueueTime;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public long minimumRetentionDuration;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public long scheduleRequestedAt;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public boolean expedited;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    public EnumC12699f0 outOfQuotaPolicy;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public int periodCount;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public final int generation;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public long nextScheduleTimeOverride;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public int nextScheduleTimeOverrideGeneration;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public final int stopReason;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @Nullable
    public String traceTag;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @Nullable
    public Boolean backOffOnSystemInterruptions;

    /* JADX INFO: renamed from: f6.j0$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Je\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R,\u0010\u001e\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001b0\u001a8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, m31665d2 = {"Lf6/j0$a;", "", "<init>", "()V", "", "isBackedOff", "", "runAttemptCount", "Lx5/a;", "backoffPolicy", "", "backoffDelayDuration", "lastEnqueueTime", "periodCount", "isPeriodic", "initialDelay", "flexDuration", "intervalDuration", "nextScheduleTimeOverride", "a", "(ZILx5/a;JJIZJJJJ)J", "", "TAG", "Ljava/lang/String;", "SCHEDULE_NOT_REQUESTED_YET", "J", "Lt/a;", "", "Lf6/j0$c;", "Lx5/o0;", "WORK_INFO_MAPPER", "Lt/a;", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: f6.j0.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final long m24769a(boolean isBackedOff, int runAttemptCount, @NotNull EnumC12688a backoffPolicy, long backoffDelayDuration, long lastEnqueueTime, int periodCount, boolean isPeriodic, long initialDelay, long flexDuration, long intervalDuration, long nextScheduleTimeOverride) {
            Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
            if (nextScheduleTimeOverride != Long.MAX_VALUE && isPeriodic) {
                return periodCount == 0 ? nextScheduleTimeOverride : C7764d.m32079d(nextScheduleTimeOverride, 900000 + lastEnqueueTime);
            }
            if (isBackedOff) {
                return C7764d.m32082g(backoffPolicy == EnumC12688a.LINEAR ? backoffDelayDuration * ((long) runAttemptCount) : (long) Math.scalb(backoffDelayDuration, runAttemptCount - 1), 18000000L) + lastEnqueueTime;
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

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    /* JADX INFO: renamed from: f6.j0$b, reason: from toString */
    @Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m31665d2 = {"Lf6/j0$b;", "", "", "id", "Lx5/o0$c;", "state", "<init>", "(Ljava/lang/String;Lx5/o0$c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lx5/o0$c;", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final /* data */ class IdAndState {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public String id;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public C12717o0.c state;

        public IdAndState(@NotNull String id2, @NotNull C12717o0.c state) {
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
            return Intrinsics.m31980c(this.id, idAndState.id) && this.state == idAndState.state;
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
    @Metadata(m31664d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010 \n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0017\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\rR\u001a\u0010\u001c\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\"\u001a\u00020\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010&\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0007R\u001a\u0010(\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b'\u0010\u0007R\u001a\u0010+\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b*\u0010\u0007R\u001a\u00101\u001a\u00020,8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001a\u00105\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u0010\u0010R\"\u0010=\u001a\u0002068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010B\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b>\u0010$\u001a\u0004\b?\u0010\u0007\"\u0004\b@\u0010AR\"\u0010F\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bC\u0010$\u001a\u0004\bD\u0010\u0007\"\u0004\bE\u0010AR\"\u0010K\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bG\u00103\u001a\u0004\bH\u0010\u0010\"\u0004\bI\u0010JR\u001a\u0010N\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bL\u00103\u001a\u0004\bM\u0010\u0010R\u001a\u0010Q\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\bO\u0010$\u001a\u0004\bP\u0010\u0007R\u001a\u0010T\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bR\u00103\u001a\u0004\bS\u0010\u0010R \u0010Z\u001a\b\u0012\u0004\u0012\u00020\u000b0U8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR \u0010]\u001a\b\u0012\u0004\u0012\u00020\u001d0U8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b[\u0010W\u001a\u0004\b\\\u0010YR\u0011\u0010_\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b#\u0010^R\u0011\u0010`\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u001e\u0010^¨\u0006a"}, m31665d2 = {"Lf6/j0$c;", "", "Lx5/o0$b;", "b", "()Lx5/o0$b;", "", "a", "()J", "Lx5/o0;", "e", "()Lx5/o0;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "id", "Lx5/o0$c;", "Lx5/o0$c;", "getState", "()Lx5/o0$c;", "state", "Landroidx/work/b;", "c", "Landroidx/work/b;", "getOutput", "()Landroidx/work/b;", "output", "d", "J", "getInitialDelay", "initialDelay", "getIntervalDuration", "intervalDuration", "f", "getFlexDuration", "flexDuration", "Lx5/d;", "g", "Lx5/d;", "getConstraints", "()Lx5/d;", "constraints", "h", "I", "getRunAttemptCount", "runAttemptCount", "Lx5/a;", "i", "Lx5/a;", "getBackoffPolicy", "()Lx5/a;", "setBackoffPolicy", "(Lx5/a;)V", "backoffPolicy", "j", "getBackoffDelayDuration", "setBackoffDelayDuration", "(J)V", "backoffDelayDuration", "k", "getLastEnqueueTime", "setLastEnqueueTime", "lastEnqueueTime", "l", "getPeriodCount", "setPeriodCount", "(I)V", "periodCount", "m", "getGeneration", "generation", "n", "getNextScheduleTimeOverride", "nextScheduleTimeOverride", "o", "getStopReason", "stopReason", "", "p", "Ljava/util/List;", "getTags", "()Ljava/util/List;", "tags", "q", "getProgress", NotificationCompat.CATEGORY_PROGRESS, "()Z", "isPeriodic", "isBackedOff", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final /* data */ class WorkInfoPojo {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final String id;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final C12717o0.c state;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        @NotNull
        public final C1116b output;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
        public final long initialDelay;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
        public final long intervalDuration;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
        public final long flexDuration;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
        @NotNull
        public final C12694d constraints;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
        public final int runAttemptCount;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
        @NotNull
        public EnumC12688a backoffPolicy;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
        public long backoffDelayDuration;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
        public long lastEnqueueTime;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata and from toString */
        public int periodCount;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata and from toString */
        public final int generation;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata and from toString */
        public final long nextScheduleTimeOverride;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata and from toString */
        public final int stopReason;

        /* JADX INFO: renamed from: p, reason: from kotlin metadata and from toString */
        @NotNull
        public final List<String> tags;

        /* JADX INFO: renamed from: q, reason: from kotlin metadata and from toString */
        @NotNull
        public final List<C1116b> progress;

        /* JADX INFO: renamed from: a */
        public final long m24770a() {
            if (this.state == C12717o0.c.ENQUEUED) {
                return C5390j0.INSTANCE.m24769a(m24772c(), this.runAttemptCount, this.backoffPolicy, this.backoffDelayDuration, this.lastEnqueueTime, this.periodCount, m24773d(), this.initialDelay, this.flexDuration, this.intervalDuration, this.nextScheduleTimeOverride);
            }
            return Long.MAX_VALUE;
        }

        /* JADX INFO: renamed from: b */
        public final C12717o0.b m24771b() {
            long j10 = this.intervalDuration;
            if (j10 != 0) {
                return new C12717o0.b(j10, this.flexDuration);
            }
            return null;
        }

        /* JADX INFO: renamed from: c */
        public final boolean m24772c() {
            return this.state == C12717o0.c.ENQUEUED && this.runAttemptCount > 0;
        }

        /* JADX INFO: renamed from: d */
        public final boolean m24773d() {
            return this.intervalDuration != 0;
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public final C12717o0 m24774e() {
            C1116b c1116b = !this.progress.isEmpty() ? this.progress.get(0) : C1116b.f4581c;
            UUID uuidFromString = UUID.fromString(this.id);
            Intrinsics.checkNotNullExpressionValue(uuidFromString, "fromString(...)");
            return new C12717o0(uuidFromString, this.state, new HashSet(this.tags), this.output, c1116b, this.runAttemptCount, this.generation, this.constraints, this.initialDelay, m24771b(), m24770a(), this.stopReason);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WorkInfoPojo)) {
                return false;
            }
            WorkInfoPojo workInfoPojo = (WorkInfoPojo) other;
            return Intrinsics.m31980c(this.id, workInfoPojo.id) && this.state == workInfoPojo.state && Intrinsics.m31980c(this.output, workInfoPojo.output) && this.initialDelay == workInfoPojo.initialDelay && this.intervalDuration == workInfoPojo.intervalDuration && this.flexDuration == workInfoPojo.flexDuration && Intrinsics.m31980c(this.constraints, workInfoPojo.constraints) && this.runAttemptCount == workInfoPojo.runAttemptCount && this.backoffPolicy == workInfoPojo.backoffPolicy && this.backoffDelayDuration == workInfoPojo.backoffDelayDuration && this.lastEnqueueTime == workInfoPojo.lastEnqueueTime && this.periodCount == workInfoPojo.periodCount && this.generation == workInfoPojo.generation && this.nextScheduleTimeOverride == workInfoPojo.nextScheduleTimeOverride && this.stopReason == workInfoPojo.stopReason && Intrinsics.m31980c(this.tags, workInfoPojo.tags) && Intrinsics.m31980c(this.progress, workInfoPojo.progress);
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
        String strM47443i = AbstractC12732w.m47443i("WorkSpec");
        Intrinsics.checkNotNullExpressionValue(strM47443i, "tagWithPrefix(...)");
        f20888A = strM47443i;
        f20889B = new InterfaceC11464a() { // from class: f6.i0
            @Override // p436t.InterfaceC11464a
            public final Object apply(Object obj) {
                return C5390j0.m24749b((List) obj);
            }
        };
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5390j0(@NotNull String id2, @NotNull C12717o0.c state, @NotNull String workerClassName, @NotNull String inputMergerClassName, @NotNull C1116b input, @NotNull C1116b output, long j10, long j11, long j12, @NotNull C12694d constraints, int i10, @NotNull EnumC12688a backoffPolicy, long j13, long j14, long j15, long j16, boolean z10, @NotNull EnumC12699f0 outOfQuotaPolicy, int i11, int i12, long j17, int i13, int i14, @Nullable String str, @Nullable Boolean bool) {
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

    /* JADX INFO: renamed from: b */
    public static final List m24749b(List list) {
        if (list == null) {
            return null;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(C7701q.m31905u(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((WorkInfoPojo) it.next()).m24774e());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ C5390j0 m24750e(C5390j0 c5390j0, String str, C12717o0.c cVar, String str2, String str3, C1116b c1116b, C1116b c1116b2, long j10, long j11, long j12, C12694d c12694d, int i10, EnumC12688a enumC12688a, long j13, long j14, long j15, long j16, boolean z10, EnumC12699f0 enumC12699f0, int i11, int i12, long j17, int i13, int i14, String str4, Boolean bool, int i15, Object obj) {
        Boolean bool2;
        String str5;
        String str6 = (i15 & 1) != 0 ? c5390j0.id : str;
        C12717o0.c cVar2 = (i15 & 2) != 0 ? c5390j0.state : cVar;
        String str7 = (i15 & 4) != 0 ? c5390j0.workerClassName : str2;
        String str8 = (i15 & 8) != 0 ? c5390j0.inputMergerClassName : str3;
        C1116b c1116b3 = (i15 & 16) != 0 ? c5390j0.input : c1116b;
        C1116b c1116b4 = (i15 & 32) != 0 ? c5390j0.output : c1116b2;
        long j18 = (i15 & 64) != 0 ? c5390j0.initialDelay : j10;
        long j19 = (i15 & 128) != 0 ? c5390j0.intervalDuration : j11;
        long j20 = (i15 & 256) != 0 ? c5390j0.flexDuration : j12;
        C12694d c12694d2 = (i15 & 512) != 0 ? c5390j0.constraints : c12694d;
        int i16 = (i15 & 1024) != 0 ? c5390j0.runAttemptCount : i10;
        String str9 = str6;
        EnumC12688a enumC12688a2 = (i15 & 2048) != 0 ? c5390j0.backoffPolicy : enumC12688a;
        C12717o0.c cVar3 = cVar2;
        long j21 = (i15 & 4096) != 0 ? c5390j0.backoffDelayDuration : j13;
        long j22 = (i15 & 8192) != 0 ? c5390j0.lastEnqueueTime : j14;
        long j23 = (i15 & 16384) != 0 ? c5390j0.minimumRetentionDuration : j15;
        long j24 = (i15 & 32768) != 0 ? c5390j0.scheduleRequestedAt : j16;
        boolean z11 = (i15 & 65536) != 0 ? c5390j0.expedited : z10;
        long j25 = j24;
        EnumC12699f0 enumC12699f1 = (i15 & 131072) != 0 ? c5390j0.outOfQuotaPolicy : enumC12699f0;
        int i17 = (i15 & 262144) != 0 ? c5390j0.periodCount : i11;
        EnumC12699f0 enumC12699f2 = enumC12699f1;
        int i18 = (i15 & 524288) != 0 ? c5390j0.generation : i12;
        int i19 = i17;
        long j26 = (i15 & 1048576) != 0 ? c5390j0.nextScheduleTimeOverride : j17;
        int i20 = (i15 & 2097152) != 0 ? c5390j0.nextScheduleTimeOverrideGeneration : i13;
        int i21 = (i15 & 4194304) != 0 ? c5390j0.stopReason : i14;
        int i22 = i20;
        String str10 = (i15 & 8388608) != 0 ? c5390j0.traceTag : str4;
        if ((i15 & 16777216) != 0) {
            str5 = str10;
            bool2 = c5390j0.backOffOnSystemInterruptions;
        } else {
            bool2 = bool;
            str5 = str10;
        }
        return c5390j0.m24752d(str9, cVar3, str7, str8, c1116b3, c1116b4, j18, j19, j20, c12694d2, i16, enumC12688a2, j21, j22, j23, j25, z11, enumC12699f2, i19, i18, j26, i22, i21, str5, bool2);
    }

    /* JADX INFO: renamed from: c */
    public final long m24751c() {
        return INSTANCE.m24769a(m24761n(), this.runAttemptCount, this.backoffPolicy, this.backoffDelayDuration, this.lastEnqueueTime, this.periodCount, m24762o(), this.initialDelay, this.flexDuration, this.intervalDuration, this.nextScheduleTimeOverride);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final C5390j0 m24752d(@NotNull String id2, @NotNull C12717o0.c state, @NotNull String workerClassName, @NotNull String inputMergerClassName, @NotNull C1116b input, @NotNull C1116b output, long initialDelay, long intervalDuration, long flexDuration, @NotNull C12694d constraints, int runAttemptCount, @NotNull EnumC12688a backoffPolicy, long backoffDelayDuration, long lastEnqueueTime, long minimumRetentionDuration, long scheduleRequestedAt, boolean expedited, @NotNull EnumC12699f0 outOfQuotaPolicy, int periodCount, int generation, long nextScheduleTimeOverride, int nextScheduleTimeOverrideGeneration, int stopReason, @Nullable String traceTag, @Nullable Boolean backOffOnSystemInterruptions) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(workerClassName, "workerClassName");
        Intrinsics.checkNotNullParameter(inputMergerClassName, "inputMergerClassName");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(constraints, "constraints");
        Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
        Intrinsics.checkNotNullParameter(outOfQuotaPolicy, "outOfQuotaPolicy");
        return new C5390j0(id2, state, workerClassName, inputMergerClassName, input, output, initialDelay, intervalDuration, flexDuration, constraints, runAttemptCount, backoffPolicy, backoffDelayDuration, lastEnqueueTime, minimumRetentionDuration, scheduleRequestedAt, expedited, outOfQuotaPolicy, periodCount, generation, nextScheduleTimeOverride, nextScheduleTimeOverrideGeneration, stopReason, traceTag, backOffOnSystemInterruptions);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C5390j0)) {
            return false;
        }
        C5390j0 c5390j0 = (C5390j0) other;
        return Intrinsics.m31980c(this.id, c5390j0.id) && this.state == c5390j0.state && Intrinsics.m31980c(this.workerClassName, c5390j0.workerClassName) && Intrinsics.m31980c(this.inputMergerClassName, c5390j0.inputMergerClassName) && Intrinsics.m31980c(this.input, c5390j0.input) && Intrinsics.m31980c(this.output, c5390j0.output) && this.initialDelay == c5390j0.initialDelay && this.intervalDuration == c5390j0.intervalDuration && this.flexDuration == c5390j0.flexDuration && Intrinsics.m31980c(this.constraints, c5390j0.constraints) && this.runAttemptCount == c5390j0.runAttemptCount && this.backoffPolicy == c5390j0.backoffPolicy && this.backoffDelayDuration == c5390j0.backoffDelayDuration && this.lastEnqueueTime == c5390j0.lastEnqueueTime && this.minimumRetentionDuration == c5390j0.minimumRetentionDuration && this.scheduleRequestedAt == c5390j0.scheduleRequestedAt && this.expedited == c5390j0.expedited && this.outOfQuotaPolicy == c5390j0.outOfQuotaPolicy && this.periodCount == c5390j0.periodCount && this.generation == c5390j0.generation && this.nextScheduleTimeOverride == c5390j0.nextScheduleTimeOverride && this.nextScheduleTimeOverrideGeneration == c5390j0.nextScheduleTimeOverrideGeneration && this.stopReason == c5390j0.stopReason && Intrinsics.m31980c(this.traceTag, c5390j0.traceTag) && Intrinsics.m31980c(this.backOffOnSystemInterruptions, c5390j0.backOffOnSystemInterruptions);
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

    /* JADX INFO: renamed from: m */
    public final boolean m24760m() {
        return !Intrinsics.m31980c(C12694d.f45224k, this.constraints);
    }

    /* JADX INFO: renamed from: n */
    public final boolean m24761n() {
        return this.state == C12717o0.c.ENQUEUED && this.runAttemptCount > 0;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m24762o() {
        return this.intervalDuration != 0;
    }

    /* JADX INFO: renamed from: p */
    public final void m24763p(long backoffDelayDuration) {
        if (backoffDelayDuration > 18000000) {
            AbstractC12732w.m47441e().mo47451k(f20888A, "Backoff delay duration exceeds maximum value");
        }
        if (backoffDelayDuration < 10000) {
            AbstractC12732w.m47441e().mo47451k(f20888A, "Backoff delay duration less than minimum value");
        }
        this.backoffDelayDuration = C7764d.m32086k(backoffDelayDuration, 10000L, 18000000L);
    }

    /* JADX INFO: renamed from: q */
    public final void m24764q(long j10) {
        this.nextScheduleTimeOverride = j10;
    }

    /* JADX INFO: renamed from: r */
    public final void m24765r(int i10) {
        this.nextScheduleTimeOverrideGeneration = i10;
    }

    /* JADX INFO: renamed from: s */
    public final void m24766s(long intervalDuration) {
        if (intervalDuration < 900000) {
            AbstractC12732w.m47441e().mo47451k(f20888A, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        m24767t(C7764d.m32079d(intervalDuration, 900000L), C7764d.m32079d(intervalDuration, 900000L));
    }

    /* JADX INFO: renamed from: t */
    public final void m24767t(long intervalDuration, long flexDuration) {
        if (intervalDuration < 900000) {
            AbstractC12732w.m47441e().mo47451k(f20888A, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        this.intervalDuration = C7764d.m32079d(intervalDuration, 900000L);
        if (flexDuration < 300000) {
            AbstractC12732w.m47441e().mo47451k(f20888A, "Flex duration lesser than minimum allowed value; Changed to 300000");
        }
        if (flexDuration > this.intervalDuration) {
            AbstractC12732w.m47441e().mo47451k(f20888A, "Flex duration greater than interval duration; Changed to " + intervalDuration);
        }
        this.flexDuration = C7764d.m32086k(flexDuration, 300000L, this.intervalDuration);
    }

    @NotNull
    public String toString() {
        return "{WorkSpec: " + this.id + '}';
    }

    /* JADX INFO: renamed from: u */
    public final void m24768u(@Nullable String str) {
        this.traceTag = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C5390j0(String str, C12717o0.c cVar, String str2, String str3, C1116b c1116b, C1116b c1116b2, long j10, long j11, long j12, C12694d c12694d, int i10, EnumC12688a enumC12688a, long j13, long j14, long j15, long j16, boolean z10, EnumC12699f0 enumC12699f0, int i11, int i12, long j17, int i13, int i14, String str4, Boolean bool, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        String str5;
        C12717o0.c cVar2 = (i15 & 2) != 0 ? C12717o0.c.ENQUEUED : cVar;
        if ((i15 & 8) != 0) {
            String name = OverwritingInputMerger.class.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            str5 = name;
        } else {
            str5 = str3;
        }
        this(str, cVar2, str2, str5, (i15 & 16) != 0 ? C1116b.f4581c : c1116b, (i15 & 32) != 0 ? C1116b.f4581c : c1116b2, (i15 & 64) != 0 ? 0L : j10, (i15 & 128) != 0 ? 0L : j11, (i15 & 256) != 0 ? 0L : j12, (i15 & 512) != 0 ? C12694d.f45224k : c12694d, (i15 & 1024) != 0 ? 0 : i10, (i15 & 2048) != 0 ? EnumC12688a.EXPONENTIAL : enumC12688a, (i15 & 4096) != 0 ? 30000L : j13, (i15 & 8192) != 0 ? -1L : j14, (i15 & 16384) == 0 ? j15 : 0L, (32768 & i15) != 0 ? -1L : j16, (65536 & i15) != 0 ? false : z10, (131072 & i15) != 0 ? EnumC12699f0.RUN_AS_NON_EXPEDITED_WORK_REQUEST : enumC12699f0, (262144 & i15) != 0 ? 0 : i11, (524288 & i15) != 0 ? 0 : i12, (1048576 & i15) != 0 ? Long.MAX_VALUE : j17, (2097152 & i15) != 0 ? 0 : i13, (4194304 & i15) != 0 ? -256 : i14, (8388608 & i15) != 0 ? null : str4, (i15 & 16777216) != 0 ? Boolean.FALSE : bool);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5390j0(@NotNull String id2, @NotNull String workerClassName_) {
        this(id2, null, workerClassName_, null, null, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 0L, 0, 0, null, null, 33554426, null);
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(workerClassName_, "workerClassName_");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5390j0(@NotNull String newId, @NotNull C5390j0 other) {
        this(newId, other.state, other.workerClassName, other.inputMergerClassName, new C1116b(other.input), new C1116b(other.output), other.initialDelay, other.intervalDuration, other.flexDuration, new C12694d(other.constraints), other.runAttemptCount, other.backoffPolicy, other.backoffDelayDuration, other.lastEnqueueTime, other.minimumRetentionDuration, other.scheduleRequestedAt, other.expedited, other.outOfQuotaPolicy, other.periodCount, 0, other.nextScheduleTimeOverride, other.nextScheduleTimeOverrideGeneration, other.stopReason, other.traceTag, other.backOffOnSystemInterruptions, 524288, null);
        Intrinsics.checkNotNullParameter(newId, "newId");
        Intrinsics.checkNotNullParameter(other, "other");
    }
}
