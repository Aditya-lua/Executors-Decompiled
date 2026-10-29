package p120f6;

import androidx.work.C1116b;
import hu.InterfaceC6567c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7699p;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nu.InterfaceC9575h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p041c5.C1525a;
import p041c5.C1533i;
import p041c5.C1534j;
import p119f5.InterfaceC5359b;
import p119f5.InterfaceC5361d;
import p146g6.NetworkRequestCompat;
import p535x4.AbstractC12658e;
import p535x4.AbstractC12660f;
import p535x4.AbstractC12682u;
import p536x5.C12694d;
import p536x5.C12717o0;
import p536x5.EnumC12688a;
import p536x5.EnumC12699f0;
import p536x5.EnumC12734x;
import p594z4.C13711k;

/* JADX INFO: renamed from: f6.n1 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 -2\u00020\u0001:\u00014B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00112\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0019\u0010\u0014J\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u00112\u0006\u0010\u001a\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001b\u0010\u0014J\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u00112\u0006\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001c\u0010\u0014J\u0015\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\u00112\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u0015\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011H\u0016¢\u0006\u0004\b%\u0010&J\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00060\u00112\u0006\u0010'\u001a\u00020!H\u0016¢\u0006\u0004\b(\u0010$J\u0015\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011H\u0016¢\u0006\u0004\b)\u0010&J\u0015\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011H\u0016¢\u0006\u0004\b*\u0010&J\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00060\u00112\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020!H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b1\u00102J\u001f\u00104\u001a\u00020!2\u0006\u00103\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020!2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b8\u00102J\u001f\u0010:\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u00109\u001a\u00020\u0018H\u0016¢\u0006\u0004\b:\u0010;J\u001f\u0010=\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010<\u001a\u00020+H\u0016¢\u0006\u0004\b=\u0010>J\u0017\u0010?\u001a\u00020!2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b?\u00107J\u0017\u0010@\u001a\u00020!2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b@\u00107J\u001f\u0010B\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010A\u001a\u00020!H\u0016¢\u0006\u0004\bB\u0010CJ\u001f\u0010E\u001a\u00020!2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010D\u001a\u00020+H\u0016¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020!H\u0016¢\u0006\u0004\bG\u00100J\u001f\u0010I\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010H\u001a\u00020!H\u0016¢\u0006\u0004\bI\u0010CR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010JR\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00060K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010LR\u001a\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00060N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010O¨\u0006Q"}, m31665d2 = {"Lf6/n1;", "Lf6/k0;", "Lx4/u;", "__db", "<init>", "(Lx4/u;)V", "Lf6/j0;", "workSpec", "", "h", "(Lf6/j0;)V", "g", "", "id", "k", "(Ljava/lang/String;)Lf6/j0;", "name", "", "Lf6/j0$b;", "r", "(Ljava/lang/String;)Ljava/util/List;", "Lx5/o0$c;", "j", "(Ljava/lang/String;)Lx5/o0$c;", "Landroidx/work/b;", "n", "tag", "m", "i", "Lnu/h;", "", "s", "()Lnu/h;", "", "schedulerLimit", "t", "(I)Ljava/util/List;", "x", "()Ljava/util/List;", "maxLimit", "o", "f", "w", "", "startingAt", "d", "(J)Ljava/util/List;", "A", "()I", "a", "(Ljava/lang/String;)V", "state", "c", "(Lx5/o0$c;Ljava/lang/String;)I", "l", "(Ljava/lang/String;)I", "b", "output", "u", "(Ljava/lang/String;Landroidx/work/b;)V", "enqueueTime", "v", "(Ljava/lang/String;J)V", "z", "y", "overrideGeneration", "B", "(Ljava/lang/String;I)V", "startTime", "q", "(Ljava/lang/String;J)I", "p", "stopReason", "e", "Lx4/u;", "Lx4/f;", "Lx4/f;", "__insertAdapterOfWorkSpec", "Lx4/e;", "Lx4/e;", "__updateAdapterOfWorkSpec", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C5403n1 implements InterfaceC5393k0 {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final AbstractC12682u __db;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final AbstractC12660f<C5390j0> __insertAdapterOfWorkSpec;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final AbstractC12658e<C5390j0> __updateAdapterOfWorkSpec;

    /* JADX INFO: renamed from: f6.n1$a */
    @Metadata(m31664d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m31665d2 = {"f6/n1$a", "Lx4/f;", "Lf6/j0;", "", "b", "()Ljava/lang/String;", "Lf5/d;", "statement", "entity", "", "g", "(Lf5/d;Lf6/j0;)V", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class a extends AbstractC12660f<C5390j0> {
        @Override // p535x4.AbstractC12660f
        /* JADX INFO: renamed from: b */
        public String mo15958b() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`trace_tag`,`backoff_on_system_interruptions`,`required_network_type`,`required_network_request`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* JADX DEBUG: Method merged with bridge method: a(Lf5/d;Ljava/lang/Object;)V */
        @Override // p535x4.AbstractC12660f
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void mo15957a(InterfaceC5361d statement, C5390j0 entity) {
            Intrinsics.checkNotNullParameter(statement, "statement");
            Intrinsics.checkNotNullParameter(entity, "entity");
            statement.mo24705k0(1, entity.id);
            statement.mo24706z(2, C5427v1.m24913k(entity.state));
            statement.mo24705k0(3, entity.workerClassName);
            statement.mo24705k0(4, entity.inputMergerClassName);
            C1116b.Companion companion = C1116b.INSTANCE;
            statement.mo24699A(5, companion.m6337e(entity.input));
            statement.mo24699A(6, companion.m6337e(entity.output));
            statement.mo24706z(7, entity.initialDelay);
            statement.mo24706z(8, entity.intervalDuration);
            statement.mo24706z(9, entity.flexDuration);
            statement.mo24706z(10, entity.runAttemptCount);
            statement.mo24706z(11, C5427v1.m24903a(entity.backoffPolicy));
            statement.mo24706z(12, entity.backoffDelayDuration);
            statement.mo24706z(13, entity.lastEnqueueTime);
            statement.mo24706z(14, entity.minimumRetentionDuration);
            statement.mo24706z(15, entity.scheduleRequestedAt);
            statement.mo24706z(16, entity.expedited ? 1L : 0L);
            statement.mo24706z(17, C5427v1.m24911i(entity.outOfQuotaPolicy));
            statement.mo24706z(18, entity.getPeriodCount());
            statement.mo24706z(19, entity.getGeneration());
            statement.mo24706z(20, entity.getNextScheduleTimeOverride());
            statement.mo24706z(21, entity.getNextScheduleTimeOverrideGeneration());
            statement.mo24706z(22, entity.getStopReason());
            String traceTag = entity.getTraceTag();
            if (traceTag == null) {
                statement.mo24700C(23);
            } else {
                statement.mo24705k0(23, traceTag);
            }
            Boolean backOffOnSystemInterruptions = entity.getBackOffOnSystemInterruptions();
            Integer numValueOf = backOffOnSystemInterruptions != null ? Integer.valueOf(backOffOnSystemInterruptions.booleanValue() ? 1 : 0) : null;
            if (numValueOf == null) {
                statement.mo24700C(24);
            } else {
                statement.mo24706z(24, numValueOf.intValue());
            }
            C12694d c12694d = entity.constraints;
            statement.mo24706z(25, C5427v1.m24910h(c12694d.getRequiredNetworkType()));
            statement.mo24699A(26, C5427v1.m24905c(c12694d.getRequiredNetworkRequestCompat()));
            statement.mo24706z(27, c12694d.getRequiresCharging() ? 1L : 0L);
            statement.mo24706z(28, c12694d.getRequiresDeviceIdle() ? 1L : 0L);
            statement.mo24706z(29, c12694d.getRequiresBatteryNotLow() ? 1L : 0L);
            statement.mo24706z(30, c12694d.getRequiresStorageNotLow() ? 1L : 0L);
            statement.mo24706z(31, c12694d.getContentTriggerUpdateDelayMillis());
            statement.mo24706z(32, c12694d.getContentTriggerMaxDelayMillis());
            statement.mo24699A(33, C5427v1.m24912j(c12694d.m47336c()));
        }
    }

    /* JADX INFO: renamed from: f6.n1$b */
    @Metadata(m31664d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m31665d2 = {"f6/n1$b", "Lx4/e;", "Lf6/j0;", "", "b", "()Ljava/lang/String;", "Lf5/d;", "statement", "entity", "", "e", "(Lf5/d;Lf6/j0;)V", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class b extends AbstractC12658e<C5390j0> {
        @Override // p535x4.AbstractC12658e
        /* JADX INFO: renamed from: b */
        public String mo24868b() {
            return "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`next_schedule_time_override` = ?,`next_schedule_time_override_generation` = ?,`stop_reason` = ?,`trace_tag` = ?,`backoff_on_system_interruptions` = ?,`required_network_type` = ?,`required_network_request` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
        }

        /* JADX DEBUG: Method merged with bridge method: a(Lf5/d;Ljava/lang/Object;)V */
        @Override // p535x4.AbstractC12658e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo24867a(InterfaceC5361d statement, C5390j0 entity) {
            Intrinsics.checkNotNullParameter(statement, "statement");
            Intrinsics.checkNotNullParameter(entity, "entity");
            statement.mo24705k0(1, entity.id);
            statement.mo24706z(2, C5427v1.m24913k(entity.state));
            statement.mo24705k0(3, entity.workerClassName);
            statement.mo24705k0(4, entity.inputMergerClassName);
            C1116b.Companion companion = C1116b.INSTANCE;
            statement.mo24699A(5, companion.m6337e(entity.input));
            statement.mo24699A(6, companion.m6337e(entity.output));
            statement.mo24706z(7, entity.initialDelay);
            statement.mo24706z(8, entity.intervalDuration);
            statement.mo24706z(9, entity.flexDuration);
            statement.mo24706z(10, entity.runAttemptCount);
            statement.mo24706z(11, C5427v1.m24903a(entity.backoffPolicy));
            statement.mo24706z(12, entity.backoffDelayDuration);
            statement.mo24706z(13, entity.lastEnqueueTime);
            statement.mo24706z(14, entity.minimumRetentionDuration);
            statement.mo24706z(15, entity.scheduleRequestedAt);
            statement.mo24706z(16, entity.expedited ? 1L : 0L);
            statement.mo24706z(17, C5427v1.m24911i(entity.outOfQuotaPolicy));
            statement.mo24706z(18, entity.getPeriodCount());
            statement.mo24706z(19, entity.getGeneration());
            statement.mo24706z(20, entity.getNextScheduleTimeOverride());
            statement.mo24706z(21, entity.getNextScheduleTimeOverrideGeneration());
            statement.mo24706z(22, entity.getStopReason());
            String traceTag = entity.getTraceTag();
            if (traceTag == null) {
                statement.mo24700C(23);
            } else {
                statement.mo24705k0(23, traceTag);
            }
            Boolean backOffOnSystemInterruptions = entity.getBackOffOnSystemInterruptions();
            Integer numValueOf = backOffOnSystemInterruptions != null ? Integer.valueOf(backOffOnSystemInterruptions.booleanValue() ? 1 : 0) : null;
            if (numValueOf == null) {
                statement.mo24700C(24);
            } else {
                statement.mo24706z(24, numValueOf.intValue());
            }
            C12694d c12694d = entity.constraints;
            statement.mo24706z(25, C5427v1.m24910h(c12694d.getRequiredNetworkType()));
            statement.mo24699A(26, C5427v1.m24905c(c12694d.getRequiredNetworkRequestCompat()));
            statement.mo24706z(27, c12694d.getRequiresCharging() ? 1L : 0L);
            statement.mo24706z(28, c12694d.getRequiresDeviceIdle() ? 1L : 0L);
            statement.mo24706z(29, c12694d.getRequiresBatteryNotLow() ? 1L : 0L);
            statement.mo24706z(30, c12694d.getRequiresStorageNotLow() ? 1L : 0L);
            statement.mo24706z(31, c12694d.getContentTriggerUpdateDelayMillis());
            statement.mo24706z(32, c12694d.getContentTriggerMaxDelayMillis());
            statement.mo24699A(33, C5427v1.m24912j(c12694d.m47336c()));
            statement.mo24705k0(34, entity.id);
        }
    }

    /* JADX INFO: renamed from: f6.n1$c, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31665d2 = {"Lf6/n1$c;", "", "<init>", "()V", "", "Lhu/c;", "a", "()Ljava/util/List;", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: f6.n1.c.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final List<InterfaceC6567c<?>> m24870a() {
            return C7699p.m31892k();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    public C5403n1(@NotNull AbstractC12682u __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.__db = __db;
        this.__insertAdapterOfWorkSpec = new a();
        this.__updateAdapterOfWorkSpec = new b();
    }

    /* JADX INFO: renamed from: A0 */
    public static final int m24810A0(String str, String str2, InterfaceC5359b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        InterfaceC5361d interfaceC5361dMo24696r3 = _connection.mo24696r3(str);
        try {
            interfaceC5361dMo24696r3.mo24705k0(1, str2);
            interfaceC5361dMo24696r3.mo24704g3();
            return C1533i.m8096b(_connection);
        } finally {
            interfaceC5361dMo24696r3.close();
        }
    }

    /* JADX INFO: renamed from: B0 */
    public static final Unit m24811B0(String str, long j10, String str2, InterfaceC5359b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        InterfaceC5361d interfaceC5361dMo24696r3 = _connection.mo24696r3(str);
        try {
            interfaceC5361dMo24696r3.mo24706z(1, j10);
            interfaceC5361dMo24696r3.mo24705k0(2, str2);
            interfaceC5361dMo24696r3.mo24704g3();
            return Unit.f29331a;
        } finally {
            interfaceC5361dMo24696r3.close();
        }
    }

    /* JADX INFO: renamed from: C0 */
    public static final Unit m24813C0(String str, C1116b c1116b, String str2, InterfaceC5359b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        InterfaceC5361d interfaceC5361dMo24696r3 = _connection.mo24696r3(str);
        try {
            interfaceC5361dMo24696r3.mo24699A(1, C1116b.INSTANCE.m6337e(c1116b));
            interfaceC5361dMo24696r3.mo24705k0(2, str2);
            interfaceC5361dMo24696r3.mo24704g3();
            return Unit.f29331a;
        } finally {
            interfaceC5361dMo24696r3.close();
        }
    }

    /* JADX INFO: renamed from: D0 */
    public static final int m24815D0(String str, C12717o0.c cVar, String str2, InterfaceC5359b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        InterfaceC5361d interfaceC5361dMo24696r3 = _connection.mo24696r3(str);
        try {
            interfaceC5361dMo24696r3.mo24706z(1, C5427v1.m24913k(cVar));
            interfaceC5361dMo24696r3.mo24705k0(2, str2);
            interfaceC5361dMo24696r3.mo24704g3();
            return C1533i.m8096b(_connection);
        } finally {
            interfaceC5361dMo24696r3.close();
        }
    }

    /* JADX INFO: renamed from: E0 */
    public static final Unit m24817E0(String str, int i10, String str2, InterfaceC5359b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        InterfaceC5361d interfaceC5361dMo24696r3 = _connection.mo24696r3(str);
        try {
            interfaceC5361dMo24696r3.mo24706z(1, i10);
            interfaceC5361dMo24696r3.mo24705k0(2, str2);
            interfaceC5361dMo24696r3.mo24704g3();
            return Unit.f29331a;
        } finally {
            interfaceC5361dMo24696r3.close();
        }
    }

    /* JADX INFO: renamed from: F0 */
    public static final Unit m24819F0(C5403n1 c5403n1, C5390j0 c5390j0, InterfaceC5359b _connection) throws Exception {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        c5403n1.__updateAdapterOfWorkSpec.m47165c(_connection, c5390j0);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: e0 */
    public static final int m24844e0(String str, InterfaceC5359b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        InterfaceC5361d interfaceC5361dMo24696r3 = _connection.mo24696r3(str);
        try {
            return interfaceC5361dMo24696r3.mo24704g3() ? (int) interfaceC5361dMo24696r3.getLong(0) : 0;
        } finally {
            interfaceC5361dMo24696r3.close();
        }
    }

    /* JADX INFO: renamed from: f0 */
    public static final Unit m24845f0(String str, String str2, InterfaceC5359b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        InterfaceC5361d interfaceC5361dMo24696r3 = _connection.mo24696r3(str);
        try {
            interfaceC5361dMo24696r3.mo24705k0(1, str2);
            interfaceC5361dMo24696r3.mo24704g3();
            return Unit.f29331a;
        } finally {
            interfaceC5361dMo24696r3.close();
        }
    }

    /* JADX INFO: renamed from: g0 */
    public static final List m24846g0(String str, int i10, InterfaceC5359b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        InterfaceC5361d interfaceC5361dMo24696r3 = _connection.mo24696r3(str);
        try {
            interfaceC5361dMo24696r3.mo24706z(1, i10);
            int iM8099c = C1534j.m8099c(interfaceC5361dMo24696r3, "id");
            int iM8099c2 = C1534j.m8099c(interfaceC5361dMo24696r3, "state");
            int iM8099c3 = C1534j.m8099c(interfaceC5361dMo24696r3, "worker_class_name");
            int iM8099c4 = C1534j.m8099c(interfaceC5361dMo24696r3, "input_merger_class_name");
            int iM8099c5 = C1534j.m8099c(interfaceC5361dMo24696r3, "input");
            int iM8099c6 = C1534j.m8099c(interfaceC5361dMo24696r3, "output");
            int iM8099c7 = C1534j.m8099c(interfaceC5361dMo24696r3, "initial_delay");
            int iM8099c8 = C1534j.m8099c(interfaceC5361dMo24696r3, "interval_duration");
            int iM8099c9 = C1534j.m8099c(interfaceC5361dMo24696r3, "flex_duration");
            int iM8099c10 = C1534j.m8099c(interfaceC5361dMo24696r3, "run_attempt_count");
            int iM8099c11 = C1534j.m8099c(interfaceC5361dMo24696r3, "backoff_policy");
            int iM8099c12 = C1534j.m8099c(interfaceC5361dMo24696r3, "backoff_delay_duration");
            int iM8099c13 = C1534j.m8099c(interfaceC5361dMo24696r3, "last_enqueue_time");
            int iM8099c14 = C1534j.m8099c(interfaceC5361dMo24696r3, "minimum_retention_duration");
            int iM8099c15 = C1534j.m8099c(interfaceC5361dMo24696r3, "schedule_requested_at");
            int iM8099c16 = C1534j.m8099c(interfaceC5361dMo24696r3, "run_in_foreground");
            int iM8099c17 = C1534j.m8099c(interfaceC5361dMo24696r3, "out_of_quota_policy");
            int iM8099c18 = C1534j.m8099c(interfaceC5361dMo24696r3, "period_count");
            int iM8099c19 = C1534j.m8099c(interfaceC5361dMo24696r3, "generation");
            int iM8099c20 = C1534j.m8099c(interfaceC5361dMo24696r3, "next_schedule_time_override");
            int iM8099c21 = C1534j.m8099c(interfaceC5361dMo24696r3, "next_schedule_time_override_generation");
            int iM8099c22 = C1534j.m8099c(interfaceC5361dMo24696r3, "stop_reason");
            int iM8099c23 = C1534j.m8099c(interfaceC5361dMo24696r3, "trace_tag");
            int iM8099c24 = C1534j.m8099c(interfaceC5361dMo24696r3, "backoff_on_system_interruptions");
            int iM8099c25 = C1534j.m8099c(interfaceC5361dMo24696r3, "required_network_type");
            int iM8099c26 = C1534j.m8099c(interfaceC5361dMo24696r3, "required_network_request");
            int iM8099c27 = C1534j.m8099c(interfaceC5361dMo24696r3, "requires_charging");
            int iM8099c28 = C1534j.m8099c(interfaceC5361dMo24696r3, "requires_device_idle");
            int iM8099c29 = C1534j.m8099c(interfaceC5361dMo24696r3, "requires_battery_not_low");
            int iM8099c30 = C1534j.m8099c(interfaceC5361dMo24696r3, "requires_storage_not_low");
            int iM8099c31 = C1534j.m8099c(interfaceC5361dMo24696r3, "trigger_content_update_delay");
            int iM8099c32 = C1534j.m8099c(interfaceC5361dMo24696r3, "trigger_max_content_delay");
            int iM8099c33 = C1534j.m8099c(interfaceC5361dMo24696r3, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (interfaceC5361dMo24696r3.mo24704g3()) {
                String strMo24702E2 = interfaceC5361dMo24696r3.mo24702E2(iM8099c);
                int i11 = iM8099c13;
                int i12 = iM8099c14;
                C12717o0.c cVarM24909g = C5427v1.m24909g((int) interfaceC5361dMo24696r3.getLong(iM8099c2));
                String strMo24702E3 = interfaceC5361dMo24696r3.mo24702E2(iM8099c3);
                String strMo24702E4 = interfaceC5361dMo24696r3.mo24702E2(iM8099c4);
                byte[] blob = interfaceC5361dMo24696r3.getBlob(iM8099c5);
                C1116b.Companion companion = C1116b.INSTANCE;
                C1116b c1116bM6336a = companion.m6336a(blob);
                C1116b c1116bM6336a2 = companion.m6336a(interfaceC5361dMo24696r3.getBlob(iM8099c6));
                long j10 = interfaceC5361dMo24696r3.getLong(iM8099c7);
                long j11 = interfaceC5361dMo24696r3.getLong(iM8099c8);
                long j12 = interfaceC5361dMo24696r3.getLong(iM8099c9);
                int i13 = (int) interfaceC5361dMo24696r3.getLong(iM8099c10);
                int i14 = iM8099c;
                int i15 = iM8099c2;
                EnumC12688a enumC12688aM24906d = C5427v1.m24906d((int) interfaceC5361dMo24696r3.getLong(iM8099c11));
                long j13 = interfaceC5361dMo24696r3.getLong(iM8099c12);
                long j14 = interfaceC5361dMo24696r3.getLong(i11);
                long j15 = interfaceC5361dMo24696r3.getLong(i12);
                int i16 = iM8099c15;
                long j16 = interfaceC5361dMo24696r3.getLong(i16);
                iM8099c15 = i16;
                int i17 = iM8099c16;
                int i18 = iM8099c3;
                boolean z10 = ((int) interfaceC5361dMo24696r3.getLong(i17)) != 0;
                int i19 = iM8099c17;
                int i20 = iM8099c4;
                EnumC12699f0 enumC12699f0M24908f = C5427v1.m24908f((int) interfaceC5361dMo24696r3.getLong(i19));
                int i21 = iM8099c18;
                int i22 = (int) interfaceC5361dMo24696r3.getLong(i21);
                int i23 = iM8099c19;
                int i24 = (int) interfaceC5361dMo24696r3.getLong(i23);
                int i25 = iM8099c20;
                long j17 = interfaceC5361dMo24696r3.getLong(i25);
                int i26 = iM8099c21;
                int i27 = (int) interfaceC5361dMo24696r3.getLong(i26);
                iM8099c21 = i26;
                iM8099c22 = iM8099c22;
                int i28 = (int) interfaceC5361dMo24696r3.getLong(iM8099c22);
                int i29 = iM8099c23;
                Boolean boolValueOf = null;
                String strMo24702E5 = interfaceC5361dMo24696r3.isNull(i29) ? null : interfaceC5361dMo24696r3.mo24702E2(i29);
                int i30 = iM8099c24;
                Integer numValueOf = interfaceC5361dMo24696r3.isNull(i30) ? null : Integer.valueOf((int) interfaceC5361dMo24696r3.getLong(i30));
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                Boolean bool = boolValueOf;
                int i31 = iM8099c25;
                EnumC12734x enumC12734xM24907e = C5427v1.m24907e((int) interfaceC5361dMo24696r3.getLong(i31));
                int i32 = iM8099c26;
                NetworkRequestCompat networkRequestCompatM24914l = C5427v1.m24914l(interfaceC5361dMo24696r3.getBlob(i32));
                int i33 = iM8099c27;
                boolean z11 = ((int) interfaceC5361dMo24696r3.getLong(i33)) != 0;
                int i34 = iM8099c28;
                boolean z12 = ((int) interfaceC5361dMo24696r3.getLong(i34)) != 0;
                int i35 = iM8099c29;
                boolean z13 = ((int) interfaceC5361dMo24696r3.getLong(i35)) != 0;
                iM8099c29 = i35;
                int i36 = iM8099c30;
                int i37 = iM8099c31;
                int i38 = iM8099c32;
                iM8099c31 = i37;
                int i39 = iM8099c33;
                arrayList.add(new C5390j0(strMo24702E2, cVarM24909g, strMo24702E3, strMo24702E4, c1116bM6336a, c1116bM6336a2, j10, j11, j12, new C12694d(networkRequestCompatM24914l, enumC12734xM24907e, z11, z12, z13, ((int) interfaceC5361dMo24696r3.getLong(i36)) != 0, interfaceC5361dMo24696r3.getLong(i37), interfaceC5361dMo24696r3.getLong(i38), C5427v1.m24904b(interfaceC5361dMo24696r3.getBlob(i39))), i13, enumC12688aM24906d, j13, j14, j15, j16, z10, enumC12699f0M24908f, i22, i24, j17, i27, i28, strMo24702E5, bool));
                iM8099c28 = i34;
                iM8099c4 = i20;
                iM8099c17 = i19;
                iM8099c18 = i21;
                iM8099c19 = i23;
                iM8099c20 = i25;
                iM8099c23 = i29;
                iM8099c24 = i30;
                iM8099c25 = i31;
                iM8099c26 = i32;
                iM8099c27 = i33;
                iM8099c33 = i39;
                iM8099c32 = i38;
                iM8099c30 = i36;
                iM8099c = i14;
                iM8099c13 = i11;
                iM8099c14 = i12;
                iM8099c2 = i15;
                iM8099c3 = i18;
                iM8099c16 = i17;
            }
            return arrayList;
        } finally {
            interfaceC5361dMo24696r3.close();
        }
    }

    /* JADX INFO: renamed from: h0 */
    public static final List m24847h0(String str, int i10, InterfaceC5359b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        InterfaceC5361d interfaceC5361dMo24696r3 = _connection.mo24696r3(str);
        try {
            interfaceC5361dMo24696r3.mo24706z(1, i10);
            int iM8099c = C1534j.m8099c(interfaceC5361dMo24696r3, "id");
            int iM8099c2 = C1534j.m8099c(interfaceC5361dMo24696r3, "state");
            int iM8099c3 = C1534j.m8099c(interfaceC5361dMo24696r3, "worker_class_name");
            int iM8099c4 = C1534j.m8099c(interfaceC5361dMo24696r3, "input_merger_class_name");
            int iM8099c5 = C1534j.m8099c(interfaceC5361dMo24696r3, "input");
            int iM8099c6 = C1534j.m8099c(interfaceC5361dMo24696r3, "output");
            int iM8099c7 = C1534j.m8099c(interfaceC5361dMo24696r3, "initial_delay");
            int iM8099c8 = C1534j.m8099c(interfaceC5361dMo24696r3, "interval_duration");
            int iM8099c9 = C1534j.m8099c(interfaceC5361dMo24696r3, "flex_duration");
            int iM8099c10 = C1534j.m8099c(interfaceC5361dMo24696r3, "run_attempt_count");
            int iM8099c11 = C1534j.m8099c(interfaceC5361dMo24696r3, "backoff_policy");
            int iM8099c12 = C1534j.m8099c(interfaceC5361dMo24696r3, "backoff_delay_duration");
            int iM8099c13 = C1534j.m8099c(interfaceC5361dMo24696r3, "last_enqueue_time");
            int iM8099c14 = C1534j.m8099c(interfaceC5361dMo24696r3, "minimum_retention_duration");
            int iM8099c15 = C1534j.m8099c(interfaceC5361dMo24696r3, "schedule_requested_at");
            int iM8099c16 = C1534j.m8099c(interfaceC5361dMo24696r3, "run_in_foreground");
            int iM8099c17 = C1534j.m8099c(interfaceC5361dMo24696r3, "out_of_quota_policy");
            int iM8099c18 = C1534j.m8099c(interfaceC5361dMo24696r3, "period_count");
            int iM8099c19 = C1534j.m8099c(interfaceC5361dMo24696r3, "generation");
            int iM8099c20 = C1534j.m8099c(interfaceC5361dMo24696r3, "next_schedule_time_override");
            int iM8099c21 = C1534j.m8099c(interfaceC5361dMo24696r3, "next_schedule_time_override_generation");
            int iM8099c22 = C1534j.m8099c(interfaceC5361dMo24696r3, "stop_reason");
            int iM8099c23 = C1534j.m8099c(interfaceC5361dMo24696r3, "trace_tag");
            int iM8099c24 = C1534j.m8099c(interfaceC5361dMo24696r3, "backoff_on_system_interruptions");
            int iM8099c25 = C1534j.m8099c(interfaceC5361dMo24696r3, "required_network_type");
            int iM8099c26 = C1534j.m8099c(interfaceC5361dMo24696r3, "required_network_request");
            int iM8099c27 = C1534j.m8099c(interfaceC5361dMo24696r3, "requires_charging");
            int iM8099c28 = C1534j.m8099c(interfaceC5361dMo24696r3, "requires_device_idle");
            int iM8099c29 = C1534j.m8099c(interfaceC5361dMo24696r3, "requires_battery_not_low");
            int iM8099c30 = C1534j.m8099c(interfaceC5361dMo24696r3, "requires_storage_not_low");
            int iM8099c31 = C1534j.m8099c(interfaceC5361dMo24696r3, "trigger_content_update_delay");
            int iM8099c32 = C1534j.m8099c(interfaceC5361dMo24696r3, "trigger_max_content_delay");
            int iM8099c33 = C1534j.m8099c(interfaceC5361dMo24696r3, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (interfaceC5361dMo24696r3.mo24704g3()) {
                String strMo24702E2 = interfaceC5361dMo24696r3.mo24702E2(iM8099c);
                int i11 = iM8099c13;
                int i12 = iM8099c14;
                C12717o0.c cVarM24909g = C5427v1.m24909g((int) interfaceC5361dMo24696r3.getLong(iM8099c2));
                String strMo24702E3 = interfaceC5361dMo24696r3.mo24702E2(iM8099c3);
                String strMo24702E4 = interfaceC5361dMo24696r3.mo24702E2(iM8099c4);
                byte[] blob = interfaceC5361dMo24696r3.getBlob(iM8099c5);
                C1116b.Companion companion = C1116b.INSTANCE;
                C1116b c1116bM6336a = companion.m6336a(blob);
                C1116b c1116bM6336a2 = companion.m6336a(interfaceC5361dMo24696r3.getBlob(iM8099c6));
                long j10 = interfaceC5361dMo24696r3.getLong(iM8099c7);
                long j11 = interfaceC5361dMo24696r3.getLong(iM8099c8);
                long j12 = interfaceC5361dMo24696r3.getLong(iM8099c9);
                int i13 = (int) interfaceC5361dMo24696r3.getLong(iM8099c10);
                int i14 = iM8099c;
                int i15 = iM8099c2;
                EnumC12688a enumC12688aM24906d = C5427v1.m24906d((int) interfaceC5361dMo24696r3.getLong(iM8099c11));
                long j13 = interfaceC5361dMo24696r3.getLong(iM8099c12);
                long j14 = interfaceC5361dMo24696r3.getLong(i11);
                long j15 = interfaceC5361dMo24696r3.getLong(i12);
                int i16 = iM8099c15;
                long j16 = interfaceC5361dMo24696r3.getLong(i16);
                iM8099c15 = i16;
                int i17 = iM8099c16;
                int i18 = iM8099c3;
                boolean z10 = ((int) interfaceC5361dMo24696r3.getLong(i17)) != 0;
                int i19 = iM8099c17;
                int i20 = iM8099c4;
                EnumC12699f0 enumC12699f0M24908f = C5427v1.m24908f((int) interfaceC5361dMo24696r3.getLong(i19));
                int i21 = iM8099c18;
                int i22 = (int) interfaceC5361dMo24696r3.getLong(i21);
                int i23 = iM8099c19;
                int i24 = (int) interfaceC5361dMo24696r3.getLong(i23);
                int i25 = iM8099c20;
                long j17 = interfaceC5361dMo24696r3.getLong(i25);
                int i26 = iM8099c21;
                int i27 = (int) interfaceC5361dMo24696r3.getLong(i26);
                iM8099c21 = i26;
                iM8099c22 = iM8099c22;
                int i28 = (int) interfaceC5361dMo24696r3.getLong(iM8099c22);
                int i29 = iM8099c23;
                Boolean boolValueOf = null;
                String strMo24702E5 = interfaceC5361dMo24696r3.isNull(i29) ? null : interfaceC5361dMo24696r3.mo24702E2(i29);
                int i30 = iM8099c24;
                Integer numValueOf = interfaceC5361dMo24696r3.isNull(i30) ? null : Integer.valueOf((int) interfaceC5361dMo24696r3.getLong(i30));
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                Boolean bool = boolValueOf;
                int i31 = iM8099c25;
                EnumC12734x enumC12734xM24907e = C5427v1.m24907e((int) interfaceC5361dMo24696r3.getLong(i31));
                int i32 = iM8099c26;
                NetworkRequestCompat networkRequestCompatM24914l = C5427v1.m24914l(interfaceC5361dMo24696r3.getBlob(i32));
                int i33 = iM8099c27;
                boolean z11 = ((int) interfaceC5361dMo24696r3.getLong(i33)) != 0;
                int i34 = iM8099c28;
                boolean z12 = ((int) interfaceC5361dMo24696r3.getLong(i34)) != 0;
                int i35 = iM8099c29;
                boolean z13 = ((int) interfaceC5361dMo24696r3.getLong(i35)) != 0;
                iM8099c29 = i35;
                int i36 = iM8099c30;
                int i37 = iM8099c31;
                int i38 = iM8099c32;
                iM8099c31 = i37;
                int i39 = iM8099c33;
                arrayList.add(new C5390j0(strMo24702E2, cVarM24909g, strMo24702E3, strMo24702E4, c1116bM6336a, c1116bM6336a2, j10, j11, j12, new C12694d(networkRequestCompatM24914l, enumC12734xM24907e, z11, z12, z13, ((int) interfaceC5361dMo24696r3.getLong(i36)) != 0, interfaceC5361dMo24696r3.getLong(i37), interfaceC5361dMo24696r3.getLong(i38), C5427v1.m24904b(interfaceC5361dMo24696r3.getBlob(i39))), i13, enumC12688aM24906d, j13, j14, j15, j16, z10, enumC12699f0M24908f, i22, i24, j17, i27, i28, strMo24702E5, bool));
                iM8099c28 = i34;
                iM8099c4 = i20;
                iM8099c17 = i19;
                iM8099c18 = i21;
                iM8099c19 = i23;
                iM8099c20 = i25;
                iM8099c23 = i29;
                iM8099c24 = i30;
                iM8099c25 = i31;
                iM8099c26 = i32;
                iM8099c27 = i33;
                iM8099c33 = i39;
                iM8099c32 = i38;
                iM8099c30 = i36;
                iM8099c = i14;
                iM8099c13 = i11;
                iM8099c14 = i12;
                iM8099c2 = i15;
                iM8099c3 = i18;
                iM8099c16 = i17;
            }
            return arrayList;
        } finally {
            interfaceC5361dMo24696r3.close();
        }
    }

    /* JADX INFO: renamed from: i0 */
    public static final List m24848i0(String str, InterfaceC5359b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        InterfaceC5361d interfaceC5361dMo24696r3 = _connection.mo24696r3(str);
        try {
            int iM8099c = C1534j.m8099c(interfaceC5361dMo24696r3, "id");
            int iM8099c2 = C1534j.m8099c(interfaceC5361dMo24696r3, "state");
            int iM8099c3 = C1534j.m8099c(interfaceC5361dMo24696r3, "worker_class_name");
            int iM8099c4 = C1534j.m8099c(interfaceC5361dMo24696r3, "input_merger_class_name");
            int iM8099c5 = C1534j.m8099c(interfaceC5361dMo24696r3, "input");
            int iM8099c6 = C1534j.m8099c(interfaceC5361dMo24696r3, "output");
            int iM8099c7 = C1534j.m8099c(interfaceC5361dMo24696r3, "initial_delay");
            int iM8099c8 = C1534j.m8099c(interfaceC5361dMo24696r3, "interval_duration");
            int iM8099c9 = C1534j.m8099c(interfaceC5361dMo24696r3, "flex_duration");
            int iM8099c10 = C1534j.m8099c(interfaceC5361dMo24696r3, "run_attempt_count");
            int iM8099c11 = C1534j.m8099c(interfaceC5361dMo24696r3, "backoff_policy");
            int iM8099c12 = C1534j.m8099c(interfaceC5361dMo24696r3, "backoff_delay_duration");
            int iM8099c13 = C1534j.m8099c(interfaceC5361dMo24696r3, "last_enqueue_time");
            int iM8099c14 = C1534j.m8099c(interfaceC5361dMo24696r3, "minimum_retention_duration");
            int iM8099c15 = C1534j.m8099c(interfaceC5361dMo24696r3, "schedule_requested_at");
            int iM8099c16 = C1534j.m8099c(interfaceC5361dMo24696r3, "run_in_foreground");
            int iM8099c17 = C1534j.m8099c(interfaceC5361dMo24696r3, "out_of_quota_policy");
            int iM8099c18 = C1534j.m8099c(interfaceC5361dMo24696r3, "period_count");
            int iM8099c19 = C1534j.m8099c(interfaceC5361dMo24696r3, "generation");
            int iM8099c20 = C1534j.m8099c(interfaceC5361dMo24696r3, "next_schedule_time_override");
            int iM8099c21 = C1534j.m8099c(interfaceC5361dMo24696r3, "next_schedule_time_override_generation");
            int iM8099c22 = C1534j.m8099c(interfaceC5361dMo24696r3, "stop_reason");
            int iM8099c23 = C1534j.m8099c(interfaceC5361dMo24696r3, "trace_tag");
            int iM8099c24 = C1534j.m8099c(interfaceC5361dMo24696r3, "backoff_on_system_interruptions");
            int iM8099c25 = C1534j.m8099c(interfaceC5361dMo24696r3, "required_network_type");
            int iM8099c26 = C1534j.m8099c(interfaceC5361dMo24696r3, "required_network_request");
            int iM8099c27 = C1534j.m8099c(interfaceC5361dMo24696r3, "requires_charging");
            int iM8099c28 = C1534j.m8099c(interfaceC5361dMo24696r3, "requires_device_idle");
            int iM8099c29 = C1534j.m8099c(interfaceC5361dMo24696r3, "requires_battery_not_low");
            int iM8099c30 = C1534j.m8099c(interfaceC5361dMo24696r3, "requires_storage_not_low");
            int iM8099c31 = C1534j.m8099c(interfaceC5361dMo24696r3, "trigger_content_update_delay");
            int iM8099c32 = C1534j.m8099c(interfaceC5361dMo24696r3, "trigger_max_content_delay");
            int iM8099c33 = C1534j.m8099c(interfaceC5361dMo24696r3, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (interfaceC5361dMo24696r3.mo24704g3()) {
                String strMo24702E2 = interfaceC5361dMo24696r3.mo24702E2(iM8099c);
                int i10 = iM8099c14;
                ArrayList arrayList2 = arrayList;
                C12717o0.c cVarM24909g = C5427v1.m24909g((int) interfaceC5361dMo24696r3.getLong(iM8099c2));
                String strMo24702E3 = interfaceC5361dMo24696r3.mo24702E2(iM8099c3);
                String strMo24702E4 = interfaceC5361dMo24696r3.mo24702E2(iM8099c4);
                byte[] blob = interfaceC5361dMo24696r3.getBlob(iM8099c5);
                C1116b.Companion companion = C1116b.INSTANCE;
                C1116b c1116bM6336a = companion.m6336a(blob);
                C1116b c1116bM6336a2 = companion.m6336a(interfaceC5361dMo24696r3.getBlob(iM8099c6));
                long j10 = interfaceC5361dMo24696r3.getLong(iM8099c7);
                long j11 = interfaceC5361dMo24696r3.getLong(iM8099c8);
                long j12 = interfaceC5361dMo24696r3.getLong(iM8099c9);
                int i11 = (int) interfaceC5361dMo24696r3.getLong(iM8099c10);
                int i12 = iM8099c2;
                int i13 = iM8099c3;
                EnumC12688a enumC12688aM24906d = C5427v1.m24906d((int) interfaceC5361dMo24696r3.getLong(iM8099c11));
                long j13 = interfaceC5361dMo24696r3.getLong(iM8099c12);
                long j14 = interfaceC5361dMo24696r3.getLong(iM8099c13);
                long j15 = interfaceC5361dMo24696r3.getLong(i10);
                int i14 = iM8099c15;
                long j16 = interfaceC5361dMo24696r3.getLong(i14);
                int i15 = iM8099c;
                int i16 = iM8099c16;
                boolean z10 = ((int) interfaceC5361dMo24696r3.getLong(i16)) != 0;
                int i17 = iM8099c17;
                int i18 = iM8099c4;
                EnumC12699f0 enumC12699f0M24908f = C5427v1.m24908f((int) interfaceC5361dMo24696r3.getLong(i17));
                int i19 = iM8099c18;
                int i20 = iM8099c5;
                int i21 = (int) interfaceC5361dMo24696r3.getLong(i19);
                int i22 = iM8099c19;
                int i23 = (int) interfaceC5361dMo24696r3.getLong(i22);
                int i24 = iM8099c20;
                long j17 = interfaceC5361dMo24696r3.getLong(i24);
                int i25 = iM8099c21;
                int i26 = (int) interfaceC5361dMo24696r3.getLong(i25);
                int i27 = iM8099c22;
                int i28 = (int) interfaceC5361dMo24696r3.getLong(i27);
                int i29 = iM8099c23;
                Boolean boolValueOf = null;
                String strMo24702E5 = interfaceC5361dMo24696r3.isNull(i29) ? null : interfaceC5361dMo24696r3.mo24702E2(i29);
                int i30 = iM8099c24;
                Integer numValueOf = interfaceC5361dMo24696r3.isNull(i30) ? null : Integer.valueOf((int) interfaceC5361dMo24696r3.getLong(i30));
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                int i31 = iM8099c25;
                Boolean bool = boolValueOf;
                EnumC12734x enumC12734xM24907e = C5427v1.m24907e((int) interfaceC5361dMo24696r3.getLong(i31));
                int i32 = iM8099c26;
                NetworkRequestCompat networkRequestCompatM24914l = C5427v1.m24914l(interfaceC5361dMo24696r3.getBlob(i32));
                iM8099c25 = i31;
                iM8099c26 = i32;
                int i33 = iM8099c27;
                boolean z11 = ((int) interfaceC5361dMo24696r3.getLong(i33)) != 0;
                iM8099c27 = i33;
                int i34 = iM8099c28;
                boolean z12 = ((int) interfaceC5361dMo24696r3.getLong(i34)) != 0;
                int i35 = iM8099c29;
                boolean z13 = ((int) interfaceC5361dMo24696r3.getLong(i35)) != 0;
                iM8099c29 = i35;
                int i36 = iM8099c30;
                int i37 = iM8099c31;
                int i38 = iM8099c32;
                int i39 = iM8099c33;
                iM8099c33 = i39;
                arrayList2.add(new C5390j0(strMo24702E2, cVarM24909g, strMo24702E3, strMo24702E4, c1116bM6336a, c1116bM6336a2, j10, j11, j12, new C12694d(networkRequestCompatM24914l, enumC12734xM24907e, z11, z12, z13, ((int) interfaceC5361dMo24696r3.getLong(i36)) != 0, interfaceC5361dMo24696r3.getLong(i37), interfaceC5361dMo24696r3.getLong(i38), C5427v1.m24904b(interfaceC5361dMo24696r3.getBlob(i39))), i11, enumC12688aM24906d, j13, j14, j15, j16, z10, enumC12699f0M24908f, i21, i23, j17, i26, i28, strMo24702E5, bool));
                iM8099c30 = i36;
                iM8099c4 = i18;
                iM8099c17 = i17;
                iM8099c19 = i22;
                iM8099c22 = i27;
                iM8099c24 = i30;
                iM8099c31 = i37;
                iM8099c32 = i38;
                iM8099c2 = i12;
                iM8099c14 = i10;
                iM8099c3 = i13;
                arrayList = arrayList2;
                iM8099c = i15;
                iM8099c15 = i14;
                iM8099c16 = i16;
                iM8099c20 = i24;
                iM8099c21 = i25;
                iM8099c23 = i29;
                iM8099c28 = i34;
                iM8099c5 = i20;
                iM8099c18 = i19;
            }
            return arrayList;
        } finally {
            interfaceC5361dMo24696r3.close();
        }
    }

    /* JADX INFO: renamed from: j0 */
    public static final List m24849j0(String str, String str2, InterfaceC5359b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        InterfaceC5361d interfaceC5361dMo24696r3 = _connection.mo24696r3(str);
        try {
            interfaceC5361dMo24696r3.mo24705k0(1, str2);
            ArrayList arrayList = new ArrayList();
            while (interfaceC5361dMo24696r3.mo24704g3()) {
                arrayList.add(C1116b.INSTANCE.m6336a(interfaceC5361dMo24696r3.getBlob(0)));
            }
            interfaceC5361dMo24696r3.close();
            return arrayList;
        } catch (Throwable th2) {
            interfaceC5361dMo24696r3.close();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: k0 */
    public static final List m24850k0(String str, long j10, InterfaceC5359b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        InterfaceC5361d interfaceC5361dMo24696r3 = _connection.mo24696r3(str);
        try {
            interfaceC5361dMo24696r3.mo24706z(1, j10);
            int iM8099c = C1534j.m8099c(interfaceC5361dMo24696r3, "id");
            int iM8099c2 = C1534j.m8099c(interfaceC5361dMo24696r3, "state");
            int iM8099c3 = C1534j.m8099c(interfaceC5361dMo24696r3, "worker_class_name");
            int iM8099c4 = C1534j.m8099c(interfaceC5361dMo24696r3, "input_merger_class_name");
            int iM8099c5 = C1534j.m8099c(interfaceC5361dMo24696r3, "input");
            int iM8099c6 = C1534j.m8099c(interfaceC5361dMo24696r3, "output");
            int iM8099c7 = C1534j.m8099c(interfaceC5361dMo24696r3, "initial_delay");
            int iM8099c8 = C1534j.m8099c(interfaceC5361dMo24696r3, "interval_duration");
            int iM8099c9 = C1534j.m8099c(interfaceC5361dMo24696r3, "flex_duration");
            int iM8099c10 = C1534j.m8099c(interfaceC5361dMo24696r3, "run_attempt_count");
            int iM8099c11 = C1534j.m8099c(interfaceC5361dMo24696r3, "backoff_policy");
            int iM8099c12 = C1534j.m8099c(interfaceC5361dMo24696r3, "backoff_delay_duration");
            int iM8099c13 = C1534j.m8099c(interfaceC5361dMo24696r3, "last_enqueue_time");
            int iM8099c14 = C1534j.m8099c(interfaceC5361dMo24696r3, "minimum_retention_duration");
            int iM8099c15 = C1534j.m8099c(interfaceC5361dMo24696r3, "schedule_requested_at");
            int iM8099c16 = C1534j.m8099c(interfaceC5361dMo24696r3, "run_in_foreground");
            int iM8099c17 = C1534j.m8099c(interfaceC5361dMo24696r3, "out_of_quota_policy");
            int iM8099c18 = C1534j.m8099c(interfaceC5361dMo24696r3, "period_count");
            int iM8099c19 = C1534j.m8099c(interfaceC5361dMo24696r3, "generation");
            int iM8099c20 = C1534j.m8099c(interfaceC5361dMo24696r3, "next_schedule_time_override");
            int iM8099c21 = C1534j.m8099c(interfaceC5361dMo24696r3, "next_schedule_time_override_generation");
            int iM8099c22 = C1534j.m8099c(interfaceC5361dMo24696r3, "stop_reason");
            int iM8099c23 = C1534j.m8099c(interfaceC5361dMo24696r3, "trace_tag");
            int iM8099c24 = C1534j.m8099c(interfaceC5361dMo24696r3, "backoff_on_system_interruptions");
            int iM8099c25 = C1534j.m8099c(interfaceC5361dMo24696r3, "required_network_type");
            int iM8099c26 = C1534j.m8099c(interfaceC5361dMo24696r3, "required_network_request");
            int iM8099c27 = C1534j.m8099c(interfaceC5361dMo24696r3, "requires_charging");
            int iM8099c28 = C1534j.m8099c(interfaceC5361dMo24696r3, "requires_device_idle");
            int iM8099c29 = C1534j.m8099c(interfaceC5361dMo24696r3, "requires_battery_not_low");
            int iM8099c30 = C1534j.m8099c(interfaceC5361dMo24696r3, "requires_storage_not_low");
            int iM8099c31 = C1534j.m8099c(interfaceC5361dMo24696r3, "trigger_content_update_delay");
            int iM8099c32 = C1534j.m8099c(interfaceC5361dMo24696r3, "trigger_max_content_delay");
            int iM8099c33 = C1534j.m8099c(interfaceC5361dMo24696r3, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (interfaceC5361dMo24696r3.mo24704g3()) {
                String strMo24702E2 = interfaceC5361dMo24696r3.mo24702E2(iM8099c);
                int i10 = iM8099c13;
                int i11 = iM8099c14;
                C12717o0.c cVarM24909g = C5427v1.m24909g((int) interfaceC5361dMo24696r3.getLong(iM8099c2));
                String strMo24702E3 = interfaceC5361dMo24696r3.mo24702E2(iM8099c3);
                String strMo24702E4 = interfaceC5361dMo24696r3.mo24702E2(iM8099c4);
                byte[] blob = interfaceC5361dMo24696r3.getBlob(iM8099c5);
                C1116b.Companion companion = C1116b.INSTANCE;
                C1116b c1116bM6336a = companion.m6336a(blob);
                C1116b c1116bM6336a2 = companion.m6336a(interfaceC5361dMo24696r3.getBlob(iM8099c6));
                long j11 = interfaceC5361dMo24696r3.getLong(iM8099c7);
                long j12 = interfaceC5361dMo24696r3.getLong(iM8099c8);
                long j13 = interfaceC5361dMo24696r3.getLong(iM8099c9);
                int i12 = (int) interfaceC5361dMo24696r3.getLong(iM8099c10);
                int i13 = iM8099c;
                int i14 = iM8099c2;
                EnumC12688a enumC12688aM24906d = C5427v1.m24906d((int) interfaceC5361dMo24696r3.getLong(iM8099c11));
                long j14 = interfaceC5361dMo24696r3.getLong(iM8099c12);
                long j15 = interfaceC5361dMo24696r3.getLong(i10);
                long j16 = interfaceC5361dMo24696r3.getLong(i11);
                int i15 = iM8099c15;
                long j17 = interfaceC5361dMo24696r3.getLong(i15);
                iM8099c15 = i15;
                int i16 = iM8099c16;
                int i17 = iM8099c3;
                boolean z10 = ((int) interfaceC5361dMo24696r3.getLong(i16)) != 0;
                int i18 = iM8099c17;
                int i19 = iM8099c4;
                EnumC12699f0 enumC12699f0M24908f = C5427v1.m24908f((int) interfaceC5361dMo24696r3.getLong(i18));
                int i20 = iM8099c18;
                int i21 = (int) interfaceC5361dMo24696r3.getLong(i20);
                int i22 = iM8099c19;
                int i23 = (int) interfaceC5361dMo24696r3.getLong(i22);
                int i24 = iM8099c20;
                long j18 = interfaceC5361dMo24696r3.getLong(i24);
                int i25 = iM8099c21;
                int i26 = (int) interfaceC5361dMo24696r3.getLong(i25);
                iM8099c21 = i25;
                iM8099c22 = iM8099c22;
                int i27 = (int) interfaceC5361dMo24696r3.getLong(iM8099c22);
                int i28 = iM8099c23;
                Boolean boolValueOf = null;
                String strMo24702E5 = interfaceC5361dMo24696r3.isNull(i28) ? null : interfaceC5361dMo24696r3.mo24702E2(i28);
                int i29 = iM8099c24;
                Integer numValueOf = interfaceC5361dMo24696r3.isNull(i29) ? null : Integer.valueOf((int) interfaceC5361dMo24696r3.getLong(i29));
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                Boolean bool = boolValueOf;
                int i30 = iM8099c25;
                EnumC12734x enumC12734xM24907e = C5427v1.m24907e((int) interfaceC5361dMo24696r3.getLong(i30));
                int i31 = iM8099c26;
                NetworkRequestCompat networkRequestCompatM24914l = C5427v1.m24914l(interfaceC5361dMo24696r3.getBlob(i31));
                int i32 = iM8099c27;
                boolean z11 = ((int) interfaceC5361dMo24696r3.getLong(i32)) != 0;
                int i33 = iM8099c28;
                boolean z12 = ((int) interfaceC5361dMo24696r3.getLong(i33)) != 0;
                int i34 = iM8099c29;
                boolean z13 = ((int) interfaceC5361dMo24696r3.getLong(i34)) != 0;
                iM8099c29 = i34;
                int i35 = iM8099c30;
                int i36 = iM8099c31;
                int i37 = iM8099c32;
                iM8099c31 = i36;
                int i38 = iM8099c33;
                arrayList.add(new C5390j0(strMo24702E2, cVarM24909g, strMo24702E3, strMo24702E4, c1116bM6336a, c1116bM6336a2, j11, j12, j13, new C12694d(networkRequestCompatM24914l, enumC12734xM24907e, z11, z12, z13, ((int) interfaceC5361dMo24696r3.getLong(i35)) != 0, interfaceC5361dMo24696r3.getLong(i36), interfaceC5361dMo24696r3.getLong(i37), C5427v1.m24904b(interfaceC5361dMo24696r3.getBlob(i38))), i12, enumC12688aM24906d, j14, j15, j16, j17, z10, enumC12699f0M24908f, i21, i23, j18, i26, i27, strMo24702E5, bool));
                iM8099c4 = i19;
                iM8099c17 = i18;
                iM8099c18 = i20;
                iM8099c19 = i22;
                iM8099c20 = i24;
                iM8099c23 = i28;
                iM8099c24 = i29;
                iM8099c25 = i30;
                iM8099c26 = i31;
                iM8099c27 = i32;
                iM8099c28 = i33;
                iM8099c33 = i38;
                iM8099c32 = i37;
                iM8099c30 = i35;
                iM8099c = i13;
                iM8099c13 = i10;
                iM8099c14 = i11;
                iM8099c2 = i14;
                iM8099c3 = i17;
                iM8099c16 = i16;
            }
            return arrayList;
        } finally {
            interfaceC5361dMo24696r3.close();
        }
    }

    /* JADX INFO: renamed from: l0 */
    public static final List m24851l0(String str, InterfaceC5359b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        InterfaceC5361d interfaceC5361dMo24696r3 = _connection.mo24696r3(str);
        try {
            int iM8099c = C1534j.m8099c(interfaceC5361dMo24696r3, "id");
            int iM8099c2 = C1534j.m8099c(interfaceC5361dMo24696r3, "state");
            int iM8099c3 = C1534j.m8099c(interfaceC5361dMo24696r3, "worker_class_name");
            int iM8099c4 = C1534j.m8099c(interfaceC5361dMo24696r3, "input_merger_class_name");
            int iM8099c5 = C1534j.m8099c(interfaceC5361dMo24696r3, "input");
            int iM8099c6 = C1534j.m8099c(interfaceC5361dMo24696r3, "output");
            int iM8099c7 = C1534j.m8099c(interfaceC5361dMo24696r3, "initial_delay");
            int iM8099c8 = C1534j.m8099c(interfaceC5361dMo24696r3, "interval_duration");
            int iM8099c9 = C1534j.m8099c(interfaceC5361dMo24696r3, "flex_duration");
            int iM8099c10 = C1534j.m8099c(interfaceC5361dMo24696r3, "run_attempt_count");
            int iM8099c11 = C1534j.m8099c(interfaceC5361dMo24696r3, "backoff_policy");
            int iM8099c12 = C1534j.m8099c(interfaceC5361dMo24696r3, "backoff_delay_duration");
            int iM8099c13 = C1534j.m8099c(interfaceC5361dMo24696r3, "last_enqueue_time");
            int iM8099c14 = C1534j.m8099c(interfaceC5361dMo24696r3, "minimum_retention_duration");
            int iM8099c15 = C1534j.m8099c(interfaceC5361dMo24696r3, "schedule_requested_at");
            int iM8099c16 = C1534j.m8099c(interfaceC5361dMo24696r3, "run_in_foreground");
            int iM8099c17 = C1534j.m8099c(interfaceC5361dMo24696r3, "out_of_quota_policy");
            int iM8099c18 = C1534j.m8099c(interfaceC5361dMo24696r3, "period_count");
            int iM8099c19 = C1534j.m8099c(interfaceC5361dMo24696r3, "generation");
            int iM8099c20 = C1534j.m8099c(interfaceC5361dMo24696r3, "next_schedule_time_override");
            int iM8099c21 = C1534j.m8099c(interfaceC5361dMo24696r3, "next_schedule_time_override_generation");
            int iM8099c22 = C1534j.m8099c(interfaceC5361dMo24696r3, "stop_reason");
            int iM8099c23 = C1534j.m8099c(interfaceC5361dMo24696r3, "trace_tag");
            int iM8099c24 = C1534j.m8099c(interfaceC5361dMo24696r3, "backoff_on_system_interruptions");
            int iM8099c25 = C1534j.m8099c(interfaceC5361dMo24696r3, "required_network_type");
            int iM8099c26 = C1534j.m8099c(interfaceC5361dMo24696r3, "required_network_request");
            int iM8099c27 = C1534j.m8099c(interfaceC5361dMo24696r3, "requires_charging");
            int iM8099c28 = C1534j.m8099c(interfaceC5361dMo24696r3, "requires_device_idle");
            int iM8099c29 = C1534j.m8099c(interfaceC5361dMo24696r3, "requires_battery_not_low");
            int iM8099c30 = C1534j.m8099c(interfaceC5361dMo24696r3, "requires_storage_not_low");
            int iM8099c31 = C1534j.m8099c(interfaceC5361dMo24696r3, "trigger_content_update_delay");
            int iM8099c32 = C1534j.m8099c(interfaceC5361dMo24696r3, "trigger_max_content_delay");
            int iM8099c33 = C1534j.m8099c(interfaceC5361dMo24696r3, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (interfaceC5361dMo24696r3.mo24704g3()) {
                String strMo24702E2 = interfaceC5361dMo24696r3.mo24702E2(iM8099c);
                int i10 = iM8099c14;
                ArrayList arrayList2 = arrayList;
                C12717o0.c cVarM24909g = C5427v1.m24909g((int) interfaceC5361dMo24696r3.getLong(iM8099c2));
                String strMo24702E3 = interfaceC5361dMo24696r3.mo24702E2(iM8099c3);
                String strMo24702E4 = interfaceC5361dMo24696r3.mo24702E2(iM8099c4);
                byte[] blob = interfaceC5361dMo24696r3.getBlob(iM8099c5);
                C1116b.Companion companion = C1116b.INSTANCE;
                C1116b c1116bM6336a = companion.m6336a(blob);
                C1116b c1116bM6336a2 = companion.m6336a(interfaceC5361dMo24696r3.getBlob(iM8099c6));
                long j10 = interfaceC5361dMo24696r3.getLong(iM8099c7);
                long j11 = interfaceC5361dMo24696r3.getLong(iM8099c8);
                long j12 = interfaceC5361dMo24696r3.getLong(iM8099c9);
                int i11 = (int) interfaceC5361dMo24696r3.getLong(iM8099c10);
                int i12 = iM8099c2;
                int i13 = iM8099c3;
                EnumC12688a enumC12688aM24906d = C5427v1.m24906d((int) interfaceC5361dMo24696r3.getLong(iM8099c11));
                long j13 = interfaceC5361dMo24696r3.getLong(iM8099c12);
                long j14 = interfaceC5361dMo24696r3.getLong(iM8099c13);
                long j15 = interfaceC5361dMo24696r3.getLong(i10);
                int i14 = iM8099c15;
                long j16 = interfaceC5361dMo24696r3.getLong(i14);
                int i15 = iM8099c;
                int i16 = iM8099c16;
                boolean z10 = ((int) interfaceC5361dMo24696r3.getLong(i16)) != 0;
                int i17 = iM8099c17;
                int i18 = iM8099c4;
                EnumC12699f0 enumC12699f0M24908f = C5427v1.m24908f((int) interfaceC5361dMo24696r3.getLong(i17));
                int i19 = iM8099c18;
                int i20 = iM8099c5;
                int i21 = (int) interfaceC5361dMo24696r3.getLong(i19);
                int i22 = iM8099c19;
                int i23 = (int) interfaceC5361dMo24696r3.getLong(i22);
                int i24 = iM8099c20;
                long j17 = interfaceC5361dMo24696r3.getLong(i24);
                int i25 = iM8099c21;
                int i26 = (int) interfaceC5361dMo24696r3.getLong(i25);
                int i27 = iM8099c22;
                int i28 = (int) interfaceC5361dMo24696r3.getLong(i27);
                int i29 = iM8099c23;
                Boolean boolValueOf = null;
                String strMo24702E5 = interfaceC5361dMo24696r3.isNull(i29) ? null : interfaceC5361dMo24696r3.mo24702E2(i29);
                int i30 = iM8099c24;
                Integer numValueOf = interfaceC5361dMo24696r3.isNull(i30) ? null : Integer.valueOf((int) interfaceC5361dMo24696r3.getLong(i30));
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                int i31 = iM8099c25;
                Boolean bool = boolValueOf;
                EnumC12734x enumC12734xM24907e = C5427v1.m24907e((int) interfaceC5361dMo24696r3.getLong(i31));
                int i32 = iM8099c26;
                NetworkRequestCompat networkRequestCompatM24914l = C5427v1.m24914l(interfaceC5361dMo24696r3.getBlob(i32));
                iM8099c25 = i31;
                iM8099c26 = i32;
                int i33 = iM8099c27;
                boolean z11 = ((int) interfaceC5361dMo24696r3.getLong(i33)) != 0;
                iM8099c27 = i33;
                int i34 = iM8099c28;
                boolean z12 = ((int) interfaceC5361dMo24696r3.getLong(i34)) != 0;
                int i35 = iM8099c29;
                boolean z13 = ((int) interfaceC5361dMo24696r3.getLong(i35)) != 0;
                iM8099c29 = i35;
                int i36 = iM8099c30;
                int i37 = iM8099c31;
                int i38 = iM8099c32;
                int i39 = iM8099c33;
                iM8099c33 = i39;
                arrayList2.add(new C5390j0(strMo24702E2, cVarM24909g, strMo24702E3, strMo24702E4, c1116bM6336a, c1116bM6336a2, j10, j11, j12, new C12694d(networkRequestCompatM24914l, enumC12734xM24907e, z11, z12, z13, ((int) interfaceC5361dMo24696r3.getLong(i36)) != 0, interfaceC5361dMo24696r3.getLong(i37), interfaceC5361dMo24696r3.getLong(i38), C5427v1.m24904b(interfaceC5361dMo24696r3.getBlob(i39))), i11, enumC12688aM24906d, j13, j14, j15, j16, z10, enumC12699f0M24908f, i21, i23, j17, i26, i28, strMo24702E5, bool));
                iM8099c30 = i36;
                iM8099c4 = i18;
                iM8099c17 = i17;
                iM8099c19 = i22;
                iM8099c22 = i27;
                iM8099c24 = i30;
                iM8099c31 = i37;
                iM8099c32 = i38;
                iM8099c2 = i12;
                iM8099c14 = i10;
                iM8099c3 = i13;
                arrayList = arrayList2;
                iM8099c = i15;
                iM8099c15 = i14;
                iM8099c16 = i16;
                iM8099c20 = i24;
                iM8099c21 = i25;
                iM8099c23 = i29;
                iM8099c28 = i34;
                iM8099c5 = i20;
                iM8099c18 = i19;
            }
            return arrayList;
        } finally {
            interfaceC5361dMo24696r3.close();
        }
    }

    /* JADX INFO: renamed from: m0 */
    public static final List m24852m0(String str, InterfaceC5359b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        InterfaceC5361d interfaceC5361dMo24696r3 = _connection.mo24696r3(str);
        try {
            int iM8099c = C1534j.m8099c(interfaceC5361dMo24696r3, "id");
            int iM8099c2 = C1534j.m8099c(interfaceC5361dMo24696r3, "state");
            int iM8099c3 = C1534j.m8099c(interfaceC5361dMo24696r3, "worker_class_name");
            int iM8099c4 = C1534j.m8099c(interfaceC5361dMo24696r3, "input_merger_class_name");
            int iM8099c5 = C1534j.m8099c(interfaceC5361dMo24696r3, "input");
            int iM8099c6 = C1534j.m8099c(interfaceC5361dMo24696r3, "output");
            int iM8099c7 = C1534j.m8099c(interfaceC5361dMo24696r3, "initial_delay");
            int iM8099c8 = C1534j.m8099c(interfaceC5361dMo24696r3, "interval_duration");
            int iM8099c9 = C1534j.m8099c(interfaceC5361dMo24696r3, "flex_duration");
            int iM8099c10 = C1534j.m8099c(interfaceC5361dMo24696r3, "run_attempt_count");
            int iM8099c11 = C1534j.m8099c(interfaceC5361dMo24696r3, "backoff_policy");
            int iM8099c12 = C1534j.m8099c(interfaceC5361dMo24696r3, "backoff_delay_duration");
            int iM8099c13 = C1534j.m8099c(interfaceC5361dMo24696r3, "last_enqueue_time");
            int iM8099c14 = C1534j.m8099c(interfaceC5361dMo24696r3, "minimum_retention_duration");
            int iM8099c15 = C1534j.m8099c(interfaceC5361dMo24696r3, "schedule_requested_at");
            int iM8099c16 = C1534j.m8099c(interfaceC5361dMo24696r3, "run_in_foreground");
            int iM8099c17 = C1534j.m8099c(interfaceC5361dMo24696r3, "out_of_quota_policy");
            int iM8099c18 = C1534j.m8099c(interfaceC5361dMo24696r3, "period_count");
            int iM8099c19 = C1534j.m8099c(interfaceC5361dMo24696r3, "generation");
            int iM8099c20 = C1534j.m8099c(interfaceC5361dMo24696r3, "next_schedule_time_override");
            int iM8099c21 = C1534j.m8099c(interfaceC5361dMo24696r3, "next_schedule_time_override_generation");
            int iM8099c22 = C1534j.m8099c(interfaceC5361dMo24696r3, "stop_reason");
            int iM8099c23 = C1534j.m8099c(interfaceC5361dMo24696r3, "trace_tag");
            int iM8099c24 = C1534j.m8099c(interfaceC5361dMo24696r3, "backoff_on_system_interruptions");
            int iM8099c25 = C1534j.m8099c(interfaceC5361dMo24696r3, "required_network_type");
            int iM8099c26 = C1534j.m8099c(interfaceC5361dMo24696r3, "required_network_request");
            int iM8099c27 = C1534j.m8099c(interfaceC5361dMo24696r3, "requires_charging");
            int iM8099c28 = C1534j.m8099c(interfaceC5361dMo24696r3, "requires_device_idle");
            int iM8099c29 = C1534j.m8099c(interfaceC5361dMo24696r3, "requires_battery_not_low");
            int iM8099c30 = C1534j.m8099c(interfaceC5361dMo24696r3, "requires_storage_not_low");
            int iM8099c31 = C1534j.m8099c(interfaceC5361dMo24696r3, "trigger_content_update_delay");
            int iM8099c32 = C1534j.m8099c(interfaceC5361dMo24696r3, "trigger_max_content_delay");
            int iM8099c33 = C1534j.m8099c(interfaceC5361dMo24696r3, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (interfaceC5361dMo24696r3.mo24704g3()) {
                String strMo24702E2 = interfaceC5361dMo24696r3.mo24702E2(iM8099c);
                int i10 = iM8099c14;
                ArrayList arrayList2 = arrayList;
                C12717o0.c cVarM24909g = C5427v1.m24909g((int) interfaceC5361dMo24696r3.getLong(iM8099c2));
                String strMo24702E3 = interfaceC5361dMo24696r3.mo24702E2(iM8099c3);
                String strMo24702E4 = interfaceC5361dMo24696r3.mo24702E2(iM8099c4);
                byte[] blob = interfaceC5361dMo24696r3.getBlob(iM8099c5);
                C1116b.Companion companion = C1116b.INSTANCE;
                C1116b c1116bM6336a = companion.m6336a(blob);
                C1116b c1116bM6336a2 = companion.m6336a(interfaceC5361dMo24696r3.getBlob(iM8099c6));
                long j10 = interfaceC5361dMo24696r3.getLong(iM8099c7);
                long j11 = interfaceC5361dMo24696r3.getLong(iM8099c8);
                long j12 = interfaceC5361dMo24696r3.getLong(iM8099c9);
                int i11 = (int) interfaceC5361dMo24696r3.getLong(iM8099c10);
                int i12 = iM8099c2;
                int i13 = iM8099c3;
                EnumC12688a enumC12688aM24906d = C5427v1.m24906d((int) interfaceC5361dMo24696r3.getLong(iM8099c11));
                long j13 = interfaceC5361dMo24696r3.getLong(iM8099c12);
                long j14 = interfaceC5361dMo24696r3.getLong(iM8099c13);
                long j15 = interfaceC5361dMo24696r3.getLong(i10);
                int i14 = iM8099c15;
                long j16 = interfaceC5361dMo24696r3.getLong(i14);
                int i15 = iM8099c;
                int i16 = iM8099c16;
                boolean z10 = ((int) interfaceC5361dMo24696r3.getLong(i16)) != 0;
                int i17 = iM8099c17;
                int i18 = iM8099c4;
                EnumC12699f0 enumC12699f0M24908f = C5427v1.m24908f((int) interfaceC5361dMo24696r3.getLong(i17));
                int i19 = iM8099c18;
                int i20 = iM8099c5;
                int i21 = (int) interfaceC5361dMo24696r3.getLong(i19);
                int i22 = iM8099c19;
                int i23 = (int) interfaceC5361dMo24696r3.getLong(i22);
                int i24 = iM8099c20;
                long j17 = interfaceC5361dMo24696r3.getLong(i24);
                int i25 = iM8099c21;
                int i26 = (int) interfaceC5361dMo24696r3.getLong(i25);
                int i27 = iM8099c22;
                int i28 = (int) interfaceC5361dMo24696r3.getLong(i27);
                int i29 = iM8099c23;
                Boolean boolValueOf = null;
                String strMo24702E5 = interfaceC5361dMo24696r3.isNull(i29) ? null : interfaceC5361dMo24696r3.mo24702E2(i29);
                int i30 = iM8099c24;
                Integer numValueOf = interfaceC5361dMo24696r3.isNull(i30) ? null : Integer.valueOf((int) interfaceC5361dMo24696r3.getLong(i30));
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                int i31 = iM8099c25;
                Boolean bool = boolValueOf;
                EnumC12734x enumC12734xM24907e = C5427v1.m24907e((int) interfaceC5361dMo24696r3.getLong(i31));
                int i32 = iM8099c26;
                NetworkRequestCompat networkRequestCompatM24914l = C5427v1.m24914l(interfaceC5361dMo24696r3.getBlob(i32));
                iM8099c25 = i31;
                iM8099c26 = i32;
                int i33 = iM8099c27;
                boolean z11 = ((int) interfaceC5361dMo24696r3.getLong(i33)) != 0;
                iM8099c27 = i33;
                int i34 = iM8099c28;
                boolean z12 = ((int) interfaceC5361dMo24696r3.getLong(i34)) != 0;
                int i35 = iM8099c29;
                boolean z13 = ((int) interfaceC5361dMo24696r3.getLong(i35)) != 0;
                iM8099c29 = i35;
                int i36 = iM8099c30;
                int i37 = iM8099c31;
                int i38 = iM8099c32;
                int i39 = iM8099c33;
                iM8099c33 = i39;
                arrayList2.add(new C5390j0(strMo24702E2, cVarM24909g, strMo24702E3, strMo24702E4, c1116bM6336a, c1116bM6336a2, j10, j11, j12, new C12694d(networkRequestCompatM24914l, enumC12734xM24907e, z11, z12, z13, ((int) interfaceC5361dMo24696r3.getLong(i36)) != 0, interfaceC5361dMo24696r3.getLong(i37), interfaceC5361dMo24696r3.getLong(i38), C5427v1.m24904b(interfaceC5361dMo24696r3.getBlob(i39))), i11, enumC12688aM24906d, j13, j14, j15, j16, z10, enumC12699f0M24908f, i21, i23, j17, i26, i28, strMo24702E5, bool));
                iM8099c30 = i36;
                iM8099c4 = i18;
                iM8099c17 = i17;
                iM8099c19 = i22;
                iM8099c22 = i27;
                iM8099c24 = i30;
                iM8099c31 = i37;
                iM8099c32 = i38;
                iM8099c2 = i12;
                iM8099c14 = i10;
                iM8099c3 = i13;
                arrayList = arrayList2;
                iM8099c = i15;
                iM8099c15 = i14;
                iM8099c16 = i16;
                iM8099c20 = i24;
                iM8099c21 = i25;
                iM8099c23 = i29;
                iM8099c28 = i34;
                iM8099c5 = i20;
                iM8099c18 = i19;
            }
            return arrayList;
        } finally {
            interfaceC5361dMo24696r3.close();
        }
    }

    /* JADX INFO: renamed from: n0 */
    public static final C12717o0.c m24853n0(String str, String str2, InterfaceC5359b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        InterfaceC5361d interfaceC5361dMo24696r3 = _connection.mo24696r3(str);
        try {
            interfaceC5361dMo24696r3.mo24705k0(1, str2);
            C12717o0.c cVarM24909g = null;
            if (interfaceC5361dMo24696r3.mo24704g3()) {
                Integer numValueOf = interfaceC5361dMo24696r3.isNull(0) ? null : Integer.valueOf((int) interfaceC5361dMo24696r3.getLong(0));
                if (numValueOf != null) {
                    cVarM24909g = C5427v1.m24909g(numValueOf.intValue());
                }
            }
            return cVarM24909g;
        } finally {
            interfaceC5361dMo24696r3.close();
        }
    }

    /* JADX INFO: renamed from: o0 */
    public static final List m24854o0(String str, String str2, InterfaceC5359b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        InterfaceC5361d interfaceC5361dMo24696r3 = _connection.mo24696r3(str);
        try {
            interfaceC5361dMo24696r3.mo24705k0(1, str2);
            ArrayList arrayList = new ArrayList();
            while (interfaceC5361dMo24696r3.mo24704g3()) {
                arrayList.add(interfaceC5361dMo24696r3.mo24702E2(0));
            }
            interfaceC5361dMo24696r3.close();
            return arrayList;
        } catch (Throwable th2) {
            interfaceC5361dMo24696r3.close();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: p0 */
    public static final List m24855p0(String str, String str2, InterfaceC5359b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        InterfaceC5361d interfaceC5361dMo24696r3 = _connection.mo24696r3(str);
        try {
            interfaceC5361dMo24696r3.mo24705k0(1, str2);
            ArrayList arrayList = new ArrayList();
            while (interfaceC5361dMo24696r3.mo24704g3()) {
                arrayList.add(interfaceC5361dMo24696r3.mo24702E2(0));
            }
            interfaceC5361dMo24696r3.close();
            return arrayList;
        } catch (Throwable th2) {
            interfaceC5361dMo24696r3.close();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: q0 */
    public static final C5390j0 m24856q0(String str, String str2, InterfaceC5359b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        InterfaceC5361d interfaceC5361dMo24696r3 = _connection.mo24696r3(str);
        try {
            interfaceC5361dMo24696r3.mo24705k0(1, str2);
            int iM8099c = C1534j.m8099c(interfaceC5361dMo24696r3, "id");
            int iM8099c2 = C1534j.m8099c(interfaceC5361dMo24696r3, "state");
            int iM8099c3 = C1534j.m8099c(interfaceC5361dMo24696r3, "worker_class_name");
            int iM8099c4 = C1534j.m8099c(interfaceC5361dMo24696r3, "input_merger_class_name");
            int iM8099c5 = C1534j.m8099c(interfaceC5361dMo24696r3, "input");
            int iM8099c6 = C1534j.m8099c(interfaceC5361dMo24696r3, "output");
            int iM8099c7 = C1534j.m8099c(interfaceC5361dMo24696r3, "initial_delay");
            int iM8099c8 = C1534j.m8099c(interfaceC5361dMo24696r3, "interval_duration");
            int iM8099c9 = C1534j.m8099c(interfaceC5361dMo24696r3, "flex_duration");
            int iM8099c10 = C1534j.m8099c(interfaceC5361dMo24696r3, "run_attempt_count");
            int iM8099c11 = C1534j.m8099c(interfaceC5361dMo24696r3, "backoff_policy");
            int iM8099c12 = C1534j.m8099c(interfaceC5361dMo24696r3, "backoff_delay_duration");
            int iM8099c13 = C1534j.m8099c(interfaceC5361dMo24696r3, "last_enqueue_time");
            int iM8099c14 = C1534j.m8099c(interfaceC5361dMo24696r3, "minimum_retention_duration");
            int iM8099c15 = C1534j.m8099c(interfaceC5361dMo24696r3, "schedule_requested_at");
            int iM8099c16 = C1534j.m8099c(interfaceC5361dMo24696r3, "run_in_foreground");
            int iM8099c17 = C1534j.m8099c(interfaceC5361dMo24696r3, "out_of_quota_policy");
            int iM8099c18 = C1534j.m8099c(interfaceC5361dMo24696r3, "period_count");
            int iM8099c19 = C1534j.m8099c(interfaceC5361dMo24696r3, "generation");
            int iM8099c20 = C1534j.m8099c(interfaceC5361dMo24696r3, "next_schedule_time_override");
            int iM8099c21 = C1534j.m8099c(interfaceC5361dMo24696r3, "next_schedule_time_override_generation");
            int iM8099c22 = C1534j.m8099c(interfaceC5361dMo24696r3, "stop_reason");
            int iM8099c23 = C1534j.m8099c(interfaceC5361dMo24696r3, "trace_tag");
            int iM8099c24 = C1534j.m8099c(interfaceC5361dMo24696r3, "backoff_on_system_interruptions");
            int iM8099c25 = C1534j.m8099c(interfaceC5361dMo24696r3, "required_network_type");
            int iM8099c26 = C1534j.m8099c(interfaceC5361dMo24696r3, "required_network_request");
            int iM8099c27 = C1534j.m8099c(interfaceC5361dMo24696r3, "requires_charging");
            int iM8099c28 = C1534j.m8099c(interfaceC5361dMo24696r3, "requires_device_idle");
            int iM8099c29 = C1534j.m8099c(interfaceC5361dMo24696r3, "requires_battery_not_low");
            int iM8099c30 = C1534j.m8099c(interfaceC5361dMo24696r3, "requires_storage_not_low");
            int iM8099c31 = C1534j.m8099c(interfaceC5361dMo24696r3, "trigger_content_update_delay");
            int iM8099c32 = C1534j.m8099c(interfaceC5361dMo24696r3, "trigger_max_content_delay");
            int iM8099c33 = C1534j.m8099c(interfaceC5361dMo24696r3, "content_uri_triggers");
            C5390j0 c5390j0 = null;
            Boolean boolValueOf = null;
            if (interfaceC5361dMo24696r3.mo24704g3()) {
                String strMo24702E2 = interfaceC5361dMo24696r3.mo24702E2(iM8099c);
                C12717o0.c cVarM24909g = C5427v1.m24909g((int) interfaceC5361dMo24696r3.getLong(iM8099c2));
                String strMo24702E3 = interfaceC5361dMo24696r3.mo24702E2(iM8099c3);
                String strMo24702E4 = interfaceC5361dMo24696r3.mo24702E2(iM8099c4);
                byte[] blob = interfaceC5361dMo24696r3.getBlob(iM8099c5);
                C1116b.Companion companion = C1116b.INSTANCE;
                C1116b c1116bM6336a = companion.m6336a(blob);
                C1116b c1116bM6336a2 = companion.m6336a(interfaceC5361dMo24696r3.getBlob(iM8099c6));
                long j10 = interfaceC5361dMo24696r3.getLong(iM8099c7);
                long j11 = interfaceC5361dMo24696r3.getLong(iM8099c8);
                long j12 = interfaceC5361dMo24696r3.getLong(iM8099c9);
                int i10 = (int) interfaceC5361dMo24696r3.getLong(iM8099c10);
                EnumC12688a enumC12688aM24906d = C5427v1.m24906d((int) interfaceC5361dMo24696r3.getLong(iM8099c11));
                long j13 = interfaceC5361dMo24696r3.getLong(iM8099c12);
                long j14 = interfaceC5361dMo24696r3.getLong(iM8099c13);
                long j15 = interfaceC5361dMo24696r3.getLong(iM8099c14);
                long j16 = interfaceC5361dMo24696r3.getLong(iM8099c15);
                boolean z10 = ((int) interfaceC5361dMo24696r3.getLong(iM8099c16)) != 0;
                EnumC12699f0 enumC12699f0M24908f = C5427v1.m24908f((int) interfaceC5361dMo24696r3.getLong(iM8099c17));
                int i11 = (int) interfaceC5361dMo24696r3.getLong(iM8099c18);
                int i12 = (int) interfaceC5361dMo24696r3.getLong(iM8099c19);
                long j17 = interfaceC5361dMo24696r3.getLong(iM8099c20);
                int i13 = (int) interfaceC5361dMo24696r3.getLong(iM8099c21);
                int i14 = (int) interfaceC5361dMo24696r3.getLong(iM8099c22);
                String strMo24702E5 = interfaceC5361dMo24696r3.isNull(iM8099c23) ? null : interfaceC5361dMo24696r3.mo24702E2(iM8099c23);
                Integer numValueOf = interfaceC5361dMo24696r3.isNull(iM8099c24) ? null : Integer.valueOf((int) interfaceC5361dMo24696r3.getLong(iM8099c24));
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                c5390j0 = new C5390j0(strMo24702E2, cVarM24909g, strMo24702E3, strMo24702E4, c1116bM6336a, c1116bM6336a2, j10, j11, j12, new C12694d(C5427v1.m24914l(interfaceC5361dMo24696r3.getBlob(iM8099c26)), C5427v1.m24907e((int) interfaceC5361dMo24696r3.getLong(iM8099c25)), ((int) interfaceC5361dMo24696r3.getLong(iM8099c27)) != 0, ((int) interfaceC5361dMo24696r3.getLong(iM8099c28)) != 0, ((int) interfaceC5361dMo24696r3.getLong(iM8099c29)) != 0, ((int) interfaceC5361dMo24696r3.getLong(iM8099c30)) != 0, interfaceC5361dMo24696r3.getLong(iM8099c31), interfaceC5361dMo24696r3.getLong(iM8099c32), C5427v1.m24904b(interfaceC5361dMo24696r3.getBlob(iM8099c33))), i10, enumC12688aM24906d, j13, j14, j15, j16, z10, enumC12699f0M24908f, i11, i12, j17, i13, i14, strMo24702E5, boolValueOf);
            }
            return c5390j0;
        } finally {
            interfaceC5361dMo24696r3.close();
        }
    }

    /* JADX INFO: renamed from: r0 */
    public static final List m24857r0(String str, String str2, InterfaceC5359b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        InterfaceC5361d interfaceC5361dMo24696r3 = _connection.mo24696r3(str);
        try {
            interfaceC5361dMo24696r3.mo24705k0(1, str2);
            ArrayList arrayList = new ArrayList();
            while (interfaceC5361dMo24696r3.mo24704g3()) {
                arrayList.add(new C5390j0.IdAndState(interfaceC5361dMo24696r3.mo24702E2(0), C5427v1.m24909g((int) interfaceC5361dMo24696r3.getLong(1))));
            }
            interfaceC5361dMo24696r3.close();
            return arrayList;
        } catch (Throwable th2) {
            interfaceC5361dMo24696r3.close();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: s0 */
    public static final boolean m24858s0(String str, InterfaceC5359b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        InterfaceC5361d interfaceC5361dMo24696r3 = _connection.mo24696r3(str);
        try {
            boolean z10 = false;
            if (interfaceC5361dMo24696r3.mo24704g3() && ((int) interfaceC5361dMo24696r3.getLong(0)) != 0) {
                z10 = true;
            }
            return z10;
        } finally {
            interfaceC5361dMo24696r3.close();
        }
    }

    /* JADX INFO: renamed from: t0 */
    public static final Unit m24859t0(String str, String str2, InterfaceC5359b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        InterfaceC5361d interfaceC5361dMo24696r3 = _connection.mo24696r3(str);
        try {
            interfaceC5361dMo24696r3.mo24705k0(1, str2);
            interfaceC5361dMo24696r3.mo24704g3();
            return Unit.f29331a;
        } finally {
            interfaceC5361dMo24696r3.close();
        }
    }

    /* JADX INFO: renamed from: u0 */
    public static final int m24860u0(String str, String str2, InterfaceC5359b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        InterfaceC5361d interfaceC5361dMo24696r3 = _connection.mo24696r3(str);
        try {
            interfaceC5361dMo24696r3.mo24705k0(1, str2);
            interfaceC5361dMo24696r3.mo24704g3();
            return C1533i.m8096b(_connection);
        } finally {
            interfaceC5361dMo24696r3.close();
        }
    }

    /* JADX INFO: renamed from: v0 */
    public static final Unit m24861v0(C5403n1 c5403n1, C5390j0 c5390j0, InterfaceC5359b _connection) throws Exception {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        c5403n1.__insertAdapterOfWorkSpec.m47171d(_connection, c5390j0);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: w0 */
    public static final int m24862w0(String str, long j10, String str2, InterfaceC5359b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        InterfaceC5361d interfaceC5361dMo24696r3 = _connection.mo24696r3(str);
        try {
            interfaceC5361dMo24696r3.mo24706z(1, j10);
            interfaceC5361dMo24696r3.mo24705k0(2, str2);
            interfaceC5361dMo24696r3.mo24704g3();
            return C1533i.m8096b(_connection);
        } finally {
            interfaceC5361dMo24696r3.close();
        }
    }

    /* JADX INFO: renamed from: x0 */
    public static final int m24863x0(String str, InterfaceC5359b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        InterfaceC5361d interfaceC5361dMo24696r3 = _connection.mo24696r3(str);
        try {
            interfaceC5361dMo24696r3.mo24704g3();
            return C1533i.m8096b(_connection);
        } finally {
            interfaceC5361dMo24696r3.close();
        }
    }

    /* JADX INFO: renamed from: y0 */
    public static final Unit m24864y0(String str, String str2, int i10, InterfaceC5359b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        InterfaceC5361d interfaceC5361dMo24696r3 = _connection.mo24696r3(str);
        try {
            interfaceC5361dMo24696r3.mo24705k0(1, str2);
            interfaceC5361dMo24696r3.mo24706z(2, i10);
            interfaceC5361dMo24696r3.mo24704g3();
            return Unit.f29331a;
        } finally {
            interfaceC5361dMo24696r3.close();
        }
    }

    /* JADX INFO: renamed from: z0 */
    public static final int m24865z0(String str, String str2, InterfaceC5359b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        InterfaceC5361d interfaceC5361dMo24696r3 = _connection.mo24696r3(str);
        try {
            interfaceC5361dMo24696r3.mo24705k0(1, str2);
            interfaceC5361dMo24696r3.mo24704g3();
            return C1533i.m8096b(_connection);
        } finally {
            interfaceC5361dMo24696r3.close();
        }
    }

    @Override // p120f6.InterfaceC5393k0
    /* JADX INFO: renamed from: A */
    public int mo24775A() {
        final String str = "Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)";
        return ((Number) C1525a.m8065c(this.__db, true, false, new Function1() { // from class: f6.h1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(C5403n1.m24844e0(str, (InterfaceC5359b) obj));
            }
        })).intValue();
    }

    @Override // p120f6.InterfaceC5393k0
    /* JADX INFO: renamed from: B */
    public void mo24776B(@NotNull final String id2, final int overrideGeneration) {
        Intrinsics.checkNotNullParameter(id2, "id");
        final String str = "UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)";
        C1525a.m8065c(this.__db, false, true, new Function1() { // from class: f6.y0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C5403n1.m24864y0(str, id2, overrideGeneration, (InterfaceC5359b) obj);
            }
        });
    }

    @Override // p120f6.InterfaceC5393k0
    /* JADX INFO: renamed from: a */
    public void mo24777a(@NotNull final String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        final String str = "DELETE FROM workspec WHERE id=?";
        C1525a.m8065c(this.__db, false, true, new Function1() { // from class: f6.i1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C5403n1.m24845f0(str, id2, (InterfaceC5359b) obj);
            }
        });
    }

    @Override // p120f6.InterfaceC5393k0
    /* JADX INFO: renamed from: b */
    public void mo24778b(@NotNull final String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        final String str = "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
        C1525a.m8065c(this.__db, false, true, new Function1() { // from class: f6.a1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C5403n1.m24859t0(str, id2, (InterfaceC5359b) obj);
            }
        });
    }

    @Override // p120f6.InterfaceC5393k0
    /* JADX INFO: renamed from: c */
    public int mo24779c(@NotNull final C12717o0.c state, @NotNull final String id2) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(id2, "id");
        final String str = "UPDATE workspec SET state=? WHERE id=?";
        return ((Number) C1525a.m8065c(this.__db, false, true, new Function1() { // from class: f6.r0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(C5403n1.m24815D0(str, state, id2, (InterfaceC5359b) obj));
            }
        })).intValue();
    }

    @Override // p120f6.InterfaceC5393k0
    @NotNull
    /* JADX INFO: renamed from: d */
    public List<C5390j0> mo24780d(final long startingAt) {
        final String str = "SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC";
        return (List) C1525a.m8065c(this.__db, true, false, new Function1() { // from class: f6.m0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C5403n1.m24850k0(str, startingAt, (InterfaceC5359b) obj);
            }
        });
    }

    @Override // p120f6.InterfaceC5393k0
    /* JADX INFO: renamed from: e */
    public void mo24781e(@NotNull final String id2, final int stopReason) {
        Intrinsics.checkNotNullParameter(id2, "id");
        final String str = "UPDATE workspec SET stop_reason=? WHERE id=?";
        C1525a.m8065c(this.__db, false, true, new Function1() { // from class: f6.g1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C5403n1.m24817E0(str, stopReason, id2, (InterfaceC5359b) obj);
            }
        });
    }

    @Override // p120f6.InterfaceC5393k0
    @NotNull
    /* JADX INFO: renamed from: f */
    public List<C5390j0> mo24782f() {
        final String str = "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1";
        return (List) C1525a.m8065c(this.__db, true, false, new Function1() { // from class: f6.n0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C5403n1.m24852m0(str, (InterfaceC5359b) obj);
            }
        });
    }

    @Override // p120f6.InterfaceC5393k0
    /* JADX INFO: renamed from: g */
    public void mo24783g(@NotNull final C5390j0 workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        C1525a.m8065c(this.__db, false, true, new Function1() { // from class: f6.c1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C5403n1.m24819F0(this.f20854a, workSpec, (InterfaceC5359b) obj);
            }
        });
    }

    @Override // p120f6.InterfaceC5393k0
    /* JADX INFO: renamed from: h */
    public void mo24784h(@NotNull final C5390j0 workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        C1525a.m8065c(this.__db, false, true, new Function1() { // from class: f6.w0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C5403n1.m24861v0(this.f21007a, workSpec, (InterfaceC5359b) obj);
            }
        });
    }

    @Override // p120f6.InterfaceC5393k0
    @NotNull
    /* JADX INFO: renamed from: i */
    public List<String> mo24785i(@NotNull final String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        final String str = "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)";
        return (List) C1525a.m8065c(this.__db, true, false, new Function1() { // from class: f6.t0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C5403n1.m24854o0(str, name, (InterfaceC5359b) obj);
            }
        });
    }

    @Override // p120f6.InterfaceC5393k0
    @Nullable
    /* JADX INFO: renamed from: j */
    public C12717o0.c mo24786j(@NotNull final String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        final String str = "SELECT state FROM workspec WHERE id=?";
        return (C12717o0.c) C1525a.m8065c(this.__db, true, false, new Function1() { // from class: f6.s0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C5403n1.m24853n0(str, id2, (InterfaceC5359b) obj);
            }
        });
    }

    @Override // p120f6.InterfaceC5393k0
    @Nullable
    /* JADX INFO: renamed from: k */
    public C5390j0 mo24787k(@NotNull final String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        final String str = "SELECT * FROM workspec WHERE id=?";
        return (C5390j0) C1525a.m8065c(this.__db, true, false, new Function1() { // from class: f6.l0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C5403n1.m24856q0(str, id2, (InterfaceC5359b) obj);
            }
        });
    }

    @Override // p120f6.InterfaceC5393k0
    /* JADX INFO: renamed from: l */
    public int mo24788l(@NotNull final String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        final String str = "UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?";
        return ((Number) C1525a.m8065c(this.__db, false, true, new Function1() { // from class: f6.u0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(C5403n1.m24810A0(str, id2, (InterfaceC5359b) obj));
            }
        })).intValue();
    }

    @Override // p120f6.InterfaceC5393k0
    @NotNull
    /* JADX INFO: renamed from: m */
    public List<String> mo24789m(@NotNull final String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        final String str = "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)";
        return (List) C1525a.m8065c(this.__db, true, false, new Function1() { // from class: f6.b1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C5403n1.m24855p0(str, tag, (InterfaceC5359b) obj);
            }
        });
    }

    @Override // p120f6.InterfaceC5393k0
    @NotNull
    /* JADX INFO: renamed from: n */
    public List<C1116b> mo24790n(@NotNull final String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        final String str = "SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)";
        return (List) C1525a.m8065c(this.__db, true, false, new Function1() { // from class: f6.d1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C5403n1.m24849j0(str, id2, (InterfaceC5359b) obj);
            }
        });
    }

    @Override // p120f6.InterfaceC5393k0
    @NotNull
    /* JADX INFO: renamed from: o */
    public List<C5390j0> mo24791o(final int maxLimit) {
        final String str = "SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?";
        return (List) C1525a.m8065c(this.__db, true, false, new Function1() { // from class: f6.k1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C5403n1.m24846g0(str, maxLimit, (InterfaceC5359b) obj);
            }
        });
    }

    @Override // p120f6.InterfaceC5393k0
    /* JADX INFO: renamed from: p */
    public int mo24792p() {
        final String str = "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        return ((Number) C1525a.m8065c(this.__db, false, true, new Function1() { // from class: f6.l1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(C5403n1.m24863x0(str, (InterfaceC5359b) obj));
            }
        })).intValue();
    }

    @Override // p120f6.InterfaceC5393k0
    /* JADX INFO: renamed from: q */
    public int mo24793q(@NotNull final String id2, final long startTime) {
        Intrinsics.checkNotNullParameter(id2, "id");
        final String str = "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        return ((Number) C1525a.m8065c(this.__db, false, true, new Function1() { // from class: f6.p0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(C5403n1.m24862w0(str, startTime, id2, (InterfaceC5359b) obj));
            }
        })).intValue();
    }

    @Override // p120f6.InterfaceC5393k0
    @NotNull
    /* JADX INFO: renamed from: r */
    public List<C5390j0.IdAndState> mo24794r(@NotNull final String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        final String str = "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)";
        return (List) C1525a.m8065c(this.__db, true, false, new Function1() { // from class: f6.m1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C5403n1.m24857r0(str, name, (InterfaceC5359b) obj);
            }
        });
    }

    @Override // p120f6.InterfaceC5393k0
    @NotNull
    /* JADX INFO: renamed from: s */
    public InterfaceC9575h<Boolean> mo24795s() {
        final String str = "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1";
        return C13711k.m50083a(this.__db, false, new String[]{"workspec"}, new Function1() { // from class: f6.j1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(C5403n1.m24858s0(str, (InterfaceC5359b) obj));
            }
        });
    }

    @Override // p120f6.InterfaceC5393k0
    @NotNull
    /* JADX INFO: renamed from: t */
    public List<C5390j0> mo24796t(final int schedulerLimit) {
        final String str = "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))";
        return (List) C1525a.m8065c(this.__db, true, false, new Function1() { // from class: f6.o0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C5403n1.m24847h0(str, schedulerLimit, (InterfaceC5359b) obj);
            }
        });
    }

    @Override // p120f6.InterfaceC5393k0
    /* JADX INFO: renamed from: u */
    public void mo24797u(@NotNull final String id2, @NotNull final C1116b output) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(output, "output");
        final String str = "UPDATE workspec SET output=? WHERE id=?";
        C1525a.m8065c(this.__db, false, true, new Function1() { // from class: f6.v0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C5403n1.m24813C0(str, output, id2, (InterfaceC5359b) obj);
            }
        });
    }

    @Override // p120f6.InterfaceC5393k0
    /* JADX INFO: renamed from: v */
    public void mo24798v(@NotNull final String id2, final long enqueueTime) {
        Intrinsics.checkNotNullParameter(id2, "id");
        final String str = "UPDATE workspec SET last_enqueue_time=? WHERE id=?";
        C1525a.m8065c(this.__db, false, true, new Function1() { // from class: f6.x0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C5403n1.m24811B0(str, enqueueTime, id2, (InterfaceC5359b) obj);
            }
        });
    }

    @Override // p120f6.InterfaceC5393k0
    @NotNull
    /* JADX INFO: renamed from: w */
    public List<C5390j0> mo24799w() {
        final String str = "SELECT * FROM workspec WHERE state=1";
        return (List) C1525a.m8065c(this.__db, true, false, new Function1() { // from class: f6.q0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C5403n1.m24851l0(str, (InterfaceC5359b) obj);
            }
        });
    }

    @Override // p120f6.InterfaceC5393k0
    @NotNull
    /* JADX INFO: renamed from: x */
    public List<C5390j0> mo24800x() {
        final String str = "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time";
        return (List) C1525a.m8065c(this.__db, true, false, new Function1() { // from class: f6.f1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C5403n1.m24848i0(str, (InterfaceC5359b) obj);
            }
        });
    }

    @Override // p120f6.InterfaceC5393k0
    /* JADX INFO: renamed from: y */
    public int mo24801y(@NotNull final String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        final String str = "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        return ((Number) C1525a.m8065c(this.__db, false, true, new Function1() { // from class: f6.z0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(C5403n1.m24865z0(str, id2, (InterfaceC5359b) obj));
            }
        })).intValue();
    }

    @Override // p120f6.InterfaceC5393k0
    /* JADX INFO: renamed from: z */
    public int mo24802z(@NotNull final String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        final String str = "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        return ((Number) C1525a.m8065c(this.__db, false, true, new Function1() { // from class: f6.e1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(C5403n1.m24860u0(str, id2, (InterfaceC5359b) obj));
            }
        })).intValue();
    }
}
