package f6;

import g6.NetworkRequestCompat;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 -2\u00020\u0001:\u00014B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00112\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0019\u0010\u0014J\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u00112\u0006\u0010\u001a\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001b\u0010\u0014J\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u00112\u0006\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001c\u0010\u0014J\u0015\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\u00112\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u0015\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011H\u0016¢\u0006\u0004\b%\u0010&J\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00060\u00112\u0006\u0010'\u001a\u00020!H\u0016¢\u0006\u0004\b(\u0010$J\u0015\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011H\u0016¢\u0006\u0004\b)\u0010&J\u0015\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011H\u0016¢\u0006\u0004\b*\u0010&J\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00060\u00112\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020!H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b1\u00102J\u001f\u00104\u001a\u00020!2\u0006\u00103\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020!2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b8\u00102J\u001f\u0010:\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u00109\u001a\u00020\u0018H\u0016¢\u0006\u0004\b:\u0010;J\u001f\u0010=\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010<\u001a\u00020+H\u0016¢\u0006\u0004\b=\u0010>J\u0017\u0010?\u001a\u00020!2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b?\u00107J\u0017\u0010@\u001a\u00020!2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b@\u00107J\u001f\u0010B\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010A\u001a\u00020!H\u0016¢\u0006\u0004\bB\u0010CJ\u001f\u0010E\u001a\u00020!2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010D\u001a\u00020+H\u0016¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020!H\u0016¢\u0006\u0004\bG\u00100J\u001f\u0010I\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010H\u001a\u00020!H\u0016¢\u0006\u0004\bI\u0010CR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010JR\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00060K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010LR\u001a\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00060N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010O¨\u0006Q"}, d2 = {"Lf6/n1;", "Lf6/k0;", "Lx4/u;", "__db", "<init>", "(Lx4/u;)V", "Lf6/j0;", "workSpec", "", "h", "(Lf6/j0;)V", "g", "", "id", "k", "(Ljava/lang/String;)Lf6/j0;", "name", "", "Lf6/j0$b;", "r", "(Ljava/lang/String;)Ljava/util/List;", "Lx5/o0$c;", "j", "(Ljava/lang/String;)Lx5/o0$c;", "Landroidx/work/b;", "n", "tag", "m", "i", "Lnu/h;", "", "s", "()Lnu/h;", "", "schedulerLimit", "t", "(I)Ljava/util/List;", "x", "()Ljava/util/List;", "maxLimit", "o", "f", "w", "", "startingAt", "d", "(J)Ljava/util/List;", "A", "()I", "a", "(Ljava/lang/String;)V", "state", "c", "(Lx5/o0$c;Ljava/lang/String;)I", "l", "(Ljava/lang/String;)I", "b", "output", "u", "(Ljava/lang/String;Landroidx/work/b;)V", "enqueueTime", "v", "(Ljava/lang/String;J)V", "z", "y", "overrideGeneration", "B", "(Ljava/lang/String;I)V", "startTime", "q", "(Ljava/lang/String;J)I", "p", "stopReason", "e", "Lx4/u;", "Lx4/f;", "Lx4/f;", "__insertAdapterOfWorkSpec", "Lx4/e;", "Lx4/e;", "__updateAdapterOfWorkSpec", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n1 implements k0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final x4.u __db;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final x4.f<j0> __insertAdapterOfWorkSpec;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final x4.e<j0> __updateAdapterOfWorkSpec;

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"f6/n1$a", "Lx4/f;", "Lf6/j0;", "", "b", "()Ljava/lang/String;", "Lf5/d;", "statement", "entity", "", "g", "(Lf5/d;Lf6/j0;)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends x4.f<j0> {
        @Override // x4.f
        public String b() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`trace_tag`,`backoff_on_system_interruptions`,`required_network_type`,`required_network_request`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // x4.f
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void a(f5.d statement, j0 entity) {
            Intrinsics.checkNotNullParameter(statement, "statement");
            Intrinsics.checkNotNullParameter(entity, "entity");
            statement.k0(1, entity.id);
            statement.z(2, v1.k(entity.state));
            statement.k0(3, entity.workerClassName);
            statement.k0(4, entity.inputMergerClassName);
            androidx.work.b.Companion companion = androidx.work.b.INSTANCE;
            statement.A(5, companion.e(entity.input));
            statement.A(6, companion.e(entity.output));
            statement.z(7, entity.initialDelay);
            statement.z(8, entity.intervalDuration);
            statement.z(9, entity.flexDuration);
            statement.z(10, entity.runAttemptCount);
            statement.z(11, v1.a(entity.backoffPolicy));
            statement.z(12, entity.backoffDelayDuration);
            statement.z(13, entity.lastEnqueueTime);
            statement.z(14, entity.minimumRetentionDuration);
            statement.z(15, entity.scheduleRequestedAt);
            statement.z(16, entity.expedited ? 1L : 0L);
            statement.z(17, v1.i(entity.outOfQuotaPolicy));
            statement.z(18, entity.getPeriodCount());
            statement.z(19, entity.getGeneration());
            statement.z(20, entity.getNextScheduleTimeOverride());
            statement.z(21, entity.getNextScheduleTimeOverrideGeneration());
            statement.z(22, entity.getStopReason());
            String traceTag = entity.getTraceTag();
            if (traceTag == null) {
                statement.C(23);
            } else {
                statement.k0(23, traceTag);
            }
            Boolean backOffOnSystemInterruptions = entity.getBackOffOnSystemInterruptions();
            Integer numValueOf = backOffOnSystemInterruptions != null ? Integer.valueOf(backOffOnSystemInterruptions.booleanValue() ? 1 : 0) : null;
            if (numValueOf == null) {
                statement.C(24);
            } else {
                statement.z(24, numValueOf.intValue());
            }
            x5.d dVar = entity.constraints;
            statement.z(25, v1.h(dVar.getRequiredNetworkType()));
            statement.A(26, v1.c(dVar.getRequiredNetworkRequestCompat()));
            statement.z(27, dVar.getRequiresCharging() ? 1L : 0L);
            statement.z(28, dVar.getRequiresDeviceIdle() ? 1L : 0L);
            statement.z(29, dVar.getRequiresBatteryNotLow() ? 1L : 0L);
            statement.z(30, dVar.getRequiresStorageNotLow() ? 1L : 0L);
            statement.z(31, dVar.getContentTriggerUpdateDelayMillis());
            statement.z(32, dVar.getContentTriggerMaxDelayMillis());
            statement.A(33, v1.j(dVar.c()));
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"f6/n1$b", "Lx4/e;", "Lf6/j0;", "", "b", "()Ljava/lang/String;", "Lf5/d;", "statement", "entity", "", "e", "(Lf5/d;Lf6/j0;)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends x4.e<j0> {
        @Override // x4.e
        public String b() {
            return "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`next_schedule_time_override` = ?,`next_schedule_time_override_generation` = ?,`stop_reason` = ?,`trace_tag` = ?,`backoff_on_system_interruptions` = ?,`required_network_type` = ?,`required_network_request` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
        }

        @Override // x4.e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void a(f5.d statement, j0 entity) {
            Intrinsics.checkNotNullParameter(statement, "statement");
            Intrinsics.checkNotNullParameter(entity, "entity");
            statement.k0(1, entity.id);
            statement.z(2, v1.k(entity.state));
            statement.k0(3, entity.workerClassName);
            statement.k0(4, entity.inputMergerClassName);
            androidx.work.b.Companion companion = androidx.work.b.INSTANCE;
            statement.A(5, companion.e(entity.input));
            statement.A(6, companion.e(entity.output));
            statement.z(7, entity.initialDelay);
            statement.z(8, entity.intervalDuration);
            statement.z(9, entity.flexDuration);
            statement.z(10, entity.runAttemptCount);
            statement.z(11, v1.a(entity.backoffPolicy));
            statement.z(12, entity.backoffDelayDuration);
            statement.z(13, entity.lastEnqueueTime);
            statement.z(14, entity.minimumRetentionDuration);
            statement.z(15, entity.scheduleRequestedAt);
            statement.z(16, entity.expedited ? 1L : 0L);
            statement.z(17, v1.i(entity.outOfQuotaPolicy));
            statement.z(18, entity.getPeriodCount());
            statement.z(19, entity.getGeneration());
            statement.z(20, entity.getNextScheduleTimeOverride());
            statement.z(21, entity.getNextScheduleTimeOverrideGeneration());
            statement.z(22, entity.getStopReason());
            String traceTag = entity.getTraceTag();
            if (traceTag == null) {
                statement.C(23);
            } else {
                statement.k0(23, traceTag);
            }
            Boolean backOffOnSystemInterruptions = entity.getBackOffOnSystemInterruptions();
            Integer numValueOf = backOffOnSystemInterruptions != null ? Integer.valueOf(backOffOnSystemInterruptions.booleanValue() ? 1 : 0) : null;
            if (numValueOf == null) {
                statement.C(24);
            } else {
                statement.z(24, numValueOf.intValue());
            }
            x5.d dVar = entity.constraints;
            statement.z(25, v1.h(dVar.getRequiredNetworkType()));
            statement.A(26, v1.c(dVar.getRequiredNetworkRequestCompat()));
            statement.z(27, dVar.getRequiresCharging() ? 1L : 0L);
            statement.z(28, dVar.getRequiresDeviceIdle() ? 1L : 0L);
            statement.z(29, dVar.getRequiresBatteryNotLow() ? 1L : 0L);
            statement.z(30, dVar.getRequiresStorageNotLow() ? 1L : 0L);
            statement.z(31, dVar.getContentTriggerUpdateDelayMillis());
            statement.z(32, dVar.getContentTriggerMaxDelayMillis());
            statement.A(33, v1.j(dVar.c()));
            statement.k0(34, entity.id);
        }
    }

    /* JADX INFO: renamed from: f6.n1$c, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lf6/n1$c;", "", "<init>", "()V", "", "Lhu/c;", "a", "()Ljava/util/List;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<hu.c<?>> a() {
            return kotlin.collections.p.k();
        }

        public Companion() {
        }
    }

    public n1(@NotNull x4.u __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.__db = __db;
        this.__insertAdapterOfWorkSpec = new a();
        this.__updateAdapterOfWorkSpec = new b();
    }

    public static final int A0(String str, String str2, f5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        f5.d dVarR3 = _connection.r3(str);
        try {
            dVarR3.k0(1, str2);
            dVarR3.g3();
            return c5.i.b(_connection);
        } finally {
            dVarR3.close();
        }
    }

    public static final Unit B0(String str, long j10, String str2, f5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        f5.d dVarR3 = _connection.r3(str);
        try {
            dVarR3.z(1, j10);
            dVarR3.k0(2, str2);
            dVarR3.g3();
            return Unit.f22483a;
        } finally {
            dVarR3.close();
        }
    }

    public static final Unit C0(String str, androidx.work.b bVar, String str2, f5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        f5.d dVarR3 = _connection.r3(str);
        try {
            dVarR3.A(1, androidx.work.b.INSTANCE.e(bVar));
            dVarR3.k0(2, str2);
            dVarR3.g3();
            return Unit.f22483a;
        } finally {
            dVarR3.close();
        }
    }

    public static final int D0(String str, x5.o0.c cVar, String str2, f5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        f5.d dVarR3 = _connection.r3(str);
        try {
            dVarR3.z(1, v1.k(cVar));
            dVarR3.k0(2, str2);
            dVarR3.g3();
            return c5.i.b(_connection);
        } finally {
            dVarR3.close();
        }
    }

    public static final Unit E0(String str, int i10, String str2, f5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        f5.d dVarR3 = _connection.r3(str);
        try {
            dVarR3.z(1, i10);
            dVarR3.k0(2, str2);
            dVarR3.g3();
            return Unit.f22483a;
        } finally {
            dVarR3.close();
        }
    }

    public static final Unit F0(n1 n1Var, j0 j0Var, f5.b _connection) throws Exception {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        n1Var.__updateAdapterOfWorkSpec.c(_connection, j0Var);
        return Unit.f22483a;
    }

    public static final int e0(String str, f5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        f5.d dVarR3 = _connection.r3(str);
        try {
            return dVarR3.g3() ? (int) dVarR3.getLong(0) : 0;
        } finally {
            dVarR3.close();
        }
    }

    public static final Unit f0(String str, String str2, f5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        f5.d dVarR3 = _connection.r3(str);
        try {
            dVarR3.k0(1, str2);
            dVarR3.g3();
            return Unit.f22483a;
        } finally {
            dVarR3.close();
        }
    }

    public static final List g0(String str, int i10, f5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        f5.d dVarR3 = _connection.r3(str);
        try {
            dVarR3.z(1, i10);
            int iC = c5.j.c(dVarR3, "id");
            int iC2 = c5.j.c(dVarR3, "state");
            int iC3 = c5.j.c(dVarR3, "worker_class_name");
            int iC4 = c5.j.c(dVarR3, "input_merger_class_name");
            int iC5 = c5.j.c(dVarR3, "input");
            int iC6 = c5.j.c(dVarR3, "output");
            int iC7 = c5.j.c(dVarR3, "initial_delay");
            int iC8 = c5.j.c(dVarR3, "interval_duration");
            int iC9 = c5.j.c(dVarR3, "flex_duration");
            int iC10 = c5.j.c(dVarR3, "run_attempt_count");
            int iC11 = c5.j.c(dVarR3, "backoff_policy");
            int iC12 = c5.j.c(dVarR3, "backoff_delay_duration");
            int iC13 = c5.j.c(dVarR3, "last_enqueue_time");
            int iC14 = c5.j.c(dVarR3, "minimum_retention_duration");
            int iC15 = c5.j.c(dVarR3, "schedule_requested_at");
            int iC16 = c5.j.c(dVarR3, "run_in_foreground");
            int iC17 = c5.j.c(dVarR3, "out_of_quota_policy");
            int iC18 = c5.j.c(dVarR3, "period_count");
            int iC19 = c5.j.c(dVarR3, "generation");
            int iC20 = c5.j.c(dVarR3, "next_schedule_time_override");
            int iC21 = c5.j.c(dVarR3, "next_schedule_time_override_generation");
            int iC22 = c5.j.c(dVarR3, "stop_reason");
            int iC23 = c5.j.c(dVarR3, "trace_tag");
            int iC24 = c5.j.c(dVarR3, "backoff_on_system_interruptions");
            int iC25 = c5.j.c(dVarR3, "required_network_type");
            int iC26 = c5.j.c(dVarR3, "required_network_request");
            int iC27 = c5.j.c(dVarR3, "requires_charging");
            int iC28 = c5.j.c(dVarR3, "requires_device_idle");
            int iC29 = c5.j.c(dVarR3, "requires_battery_not_low");
            int iC30 = c5.j.c(dVarR3, "requires_storage_not_low");
            int iC31 = c5.j.c(dVarR3, "trigger_content_update_delay");
            int iC32 = c5.j.c(dVarR3, "trigger_max_content_delay");
            int iC33 = c5.j.c(dVarR3, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (dVarR3.g3()) {
                String strE2 = dVarR3.E2(iC);
                int i11 = iC13;
                int i12 = iC14;
                x5.o0.c cVarG = v1.g((int) dVarR3.getLong(iC2));
                String strE3 = dVarR3.E2(iC3);
                String strE4 = dVarR3.E2(iC4);
                byte[] blob = dVarR3.getBlob(iC5);
                androidx.work.b.Companion companion = androidx.work.b.INSTANCE;
                androidx.work.b bVarA = companion.a(blob);
                androidx.work.b bVarA2 = companion.a(dVarR3.getBlob(iC6));
                long j10 = dVarR3.getLong(iC7);
                long j11 = dVarR3.getLong(iC8);
                long j12 = dVarR3.getLong(iC9);
                int i13 = (int) dVarR3.getLong(iC10);
                int i14 = iC;
                int i15 = iC2;
                x5.a aVarD = v1.d((int) dVarR3.getLong(iC11));
                long j13 = dVarR3.getLong(iC12);
                long j14 = dVarR3.getLong(i11);
                long j15 = dVarR3.getLong(i12);
                int i16 = iC15;
                long j16 = dVarR3.getLong(i16);
                iC15 = i16;
                int i17 = iC16;
                int i18 = iC3;
                boolean z10 = ((int) dVarR3.getLong(i17)) != 0;
                int i19 = iC17;
                int i20 = iC4;
                x5.f0 f0VarF = v1.f((int) dVarR3.getLong(i19));
                int i21 = iC18;
                int i22 = (int) dVarR3.getLong(i21);
                int i23 = iC19;
                int i24 = (int) dVarR3.getLong(i23);
                int i25 = iC20;
                long j17 = dVarR3.getLong(i25);
                int i26 = iC21;
                int i27 = (int) dVarR3.getLong(i26);
                iC21 = i26;
                iC22 = iC22;
                int i28 = (int) dVarR3.getLong(iC22);
                int i29 = iC23;
                Boolean boolValueOf = null;
                String strE5 = dVarR3.isNull(i29) ? null : dVarR3.E2(i29);
                int i30 = iC24;
                Integer numValueOf = dVarR3.isNull(i30) ? null : Integer.valueOf((int) dVarR3.getLong(i30));
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                Boolean bool = boolValueOf;
                int i31 = iC25;
                x5.x xVarE = v1.e((int) dVarR3.getLong(i31));
                int i32 = iC26;
                NetworkRequestCompat networkRequestCompatL = v1.l(dVarR3.getBlob(i32));
                int i33 = iC27;
                boolean z11 = ((int) dVarR3.getLong(i33)) != 0;
                int i34 = iC28;
                boolean z12 = ((int) dVarR3.getLong(i34)) != 0;
                int i35 = iC29;
                boolean z13 = ((int) dVarR3.getLong(i35)) != 0;
                iC29 = i35;
                int i36 = iC30;
                int i37 = iC31;
                int i38 = iC32;
                iC31 = i37;
                int i39 = iC33;
                arrayList.add(new j0(strE2, cVarG, strE3, strE4, bVarA, bVarA2, j10, j11, j12, new x5.d(networkRequestCompatL, xVarE, z11, z12, z13, ((int) dVarR3.getLong(i36)) != 0, dVarR3.getLong(i37), dVarR3.getLong(i38), v1.b(dVarR3.getBlob(i39))), i13, aVarD, j13, j14, j15, j16, z10, f0VarF, i22, i24, j17, i27, i28, strE5, bool));
                iC28 = i34;
                iC4 = i20;
                iC17 = i19;
                iC18 = i21;
                iC19 = i23;
                iC20 = i25;
                iC23 = i29;
                iC24 = i30;
                iC25 = i31;
                iC26 = i32;
                iC27 = i33;
                iC33 = i39;
                iC32 = i38;
                iC30 = i36;
                iC = i14;
                iC13 = i11;
                iC14 = i12;
                iC2 = i15;
                iC3 = i18;
                iC16 = i17;
            }
            return arrayList;
        } finally {
            dVarR3.close();
        }
    }

    public static final List h0(String str, int i10, f5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        f5.d dVarR3 = _connection.r3(str);
        try {
            dVarR3.z(1, i10);
            int iC = c5.j.c(dVarR3, "id");
            int iC2 = c5.j.c(dVarR3, "state");
            int iC3 = c5.j.c(dVarR3, "worker_class_name");
            int iC4 = c5.j.c(dVarR3, "input_merger_class_name");
            int iC5 = c5.j.c(dVarR3, "input");
            int iC6 = c5.j.c(dVarR3, "output");
            int iC7 = c5.j.c(dVarR3, "initial_delay");
            int iC8 = c5.j.c(dVarR3, "interval_duration");
            int iC9 = c5.j.c(dVarR3, "flex_duration");
            int iC10 = c5.j.c(dVarR3, "run_attempt_count");
            int iC11 = c5.j.c(dVarR3, "backoff_policy");
            int iC12 = c5.j.c(dVarR3, "backoff_delay_duration");
            int iC13 = c5.j.c(dVarR3, "last_enqueue_time");
            int iC14 = c5.j.c(dVarR3, "minimum_retention_duration");
            int iC15 = c5.j.c(dVarR3, "schedule_requested_at");
            int iC16 = c5.j.c(dVarR3, "run_in_foreground");
            int iC17 = c5.j.c(dVarR3, "out_of_quota_policy");
            int iC18 = c5.j.c(dVarR3, "period_count");
            int iC19 = c5.j.c(dVarR3, "generation");
            int iC20 = c5.j.c(dVarR3, "next_schedule_time_override");
            int iC21 = c5.j.c(dVarR3, "next_schedule_time_override_generation");
            int iC22 = c5.j.c(dVarR3, "stop_reason");
            int iC23 = c5.j.c(dVarR3, "trace_tag");
            int iC24 = c5.j.c(dVarR3, "backoff_on_system_interruptions");
            int iC25 = c5.j.c(dVarR3, "required_network_type");
            int iC26 = c5.j.c(dVarR3, "required_network_request");
            int iC27 = c5.j.c(dVarR3, "requires_charging");
            int iC28 = c5.j.c(dVarR3, "requires_device_idle");
            int iC29 = c5.j.c(dVarR3, "requires_battery_not_low");
            int iC30 = c5.j.c(dVarR3, "requires_storage_not_low");
            int iC31 = c5.j.c(dVarR3, "trigger_content_update_delay");
            int iC32 = c5.j.c(dVarR3, "trigger_max_content_delay");
            int iC33 = c5.j.c(dVarR3, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (dVarR3.g3()) {
                String strE2 = dVarR3.E2(iC);
                int i11 = iC13;
                int i12 = iC14;
                x5.o0.c cVarG = v1.g((int) dVarR3.getLong(iC2));
                String strE3 = dVarR3.E2(iC3);
                String strE4 = dVarR3.E2(iC4);
                byte[] blob = dVarR3.getBlob(iC5);
                androidx.work.b.Companion companion = androidx.work.b.INSTANCE;
                androidx.work.b bVarA = companion.a(blob);
                androidx.work.b bVarA2 = companion.a(dVarR3.getBlob(iC6));
                long j10 = dVarR3.getLong(iC7);
                long j11 = dVarR3.getLong(iC8);
                long j12 = dVarR3.getLong(iC9);
                int i13 = (int) dVarR3.getLong(iC10);
                int i14 = iC;
                int i15 = iC2;
                x5.a aVarD = v1.d((int) dVarR3.getLong(iC11));
                long j13 = dVarR3.getLong(iC12);
                long j14 = dVarR3.getLong(i11);
                long j15 = dVarR3.getLong(i12);
                int i16 = iC15;
                long j16 = dVarR3.getLong(i16);
                iC15 = i16;
                int i17 = iC16;
                int i18 = iC3;
                boolean z10 = ((int) dVarR3.getLong(i17)) != 0;
                int i19 = iC17;
                int i20 = iC4;
                x5.f0 f0VarF = v1.f((int) dVarR3.getLong(i19));
                int i21 = iC18;
                int i22 = (int) dVarR3.getLong(i21);
                int i23 = iC19;
                int i24 = (int) dVarR3.getLong(i23);
                int i25 = iC20;
                long j17 = dVarR3.getLong(i25);
                int i26 = iC21;
                int i27 = (int) dVarR3.getLong(i26);
                iC21 = i26;
                iC22 = iC22;
                int i28 = (int) dVarR3.getLong(iC22);
                int i29 = iC23;
                Boolean boolValueOf = null;
                String strE5 = dVarR3.isNull(i29) ? null : dVarR3.E2(i29);
                int i30 = iC24;
                Integer numValueOf = dVarR3.isNull(i30) ? null : Integer.valueOf((int) dVarR3.getLong(i30));
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                Boolean bool = boolValueOf;
                int i31 = iC25;
                x5.x xVarE = v1.e((int) dVarR3.getLong(i31));
                int i32 = iC26;
                NetworkRequestCompat networkRequestCompatL = v1.l(dVarR3.getBlob(i32));
                int i33 = iC27;
                boolean z11 = ((int) dVarR3.getLong(i33)) != 0;
                int i34 = iC28;
                boolean z12 = ((int) dVarR3.getLong(i34)) != 0;
                int i35 = iC29;
                boolean z13 = ((int) dVarR3.getLong(i35)) != 0;
                iC29 = i35;
                int i36 = iC30;
                int i37 = iC31;
                int i38 = iC32;
                iC31 = i37;
                int i39 = iC33;
                arrayList.add(new j0(strE2, cVarG, strE3, strE4, bVarA, bVarA2, j10, j11, j12, new x5.d(networkRequestCompatL, xVarE, z11, z12, z13, ((int) dVarR3.getLong(i36)) != 0, dVarR3.getLong(i37), dVarR3.getLong(i38), v1.b(dVarR3.getBlob(i39))), i13, aVarD, j13, j14, j15, j16, z10, f0VarF, i22, i24, j17, i27, i28, strE5, bool));
                iC28 = i34;
                iC4 = i20;
                iC17 = i19;
                iC18 = i21;
                iC19 = i23;
                iC20 = i25;
                iC23 = i29;
                iC24 = i30;
                iC25 = i31;
                iC26 = i32;
                iC27 = i33;
                iC33 = i39;
                iC32 = i38;
                iC30 = i36;
                iC = i14;
                iC13 = i11;
                iC14 = i12;
                iC2 = i15;
                iC3 = i18;
                iC16 = i17;
            }
            return arrayList;
        } finally {
            dVarR3.close();
        }
    }

    public static final List i0(String str, f5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        f5.d dVarR3 = _connection.r3(str);
        try {
            int iC = c5.j.c(dVarR3, "id");
            int iC2 = c5.j.c(dVarR3, "state");
            int iC3 = c5.j.c(dVarR3, "worker_class_name");
            int iC4 = c5.j.c(dVarR3, "input_merger_class_name");
            int iC5 = c5.j.c(dVarR3, "input");
            int iC6 = c5.j.c(dVarR3, "output");
            int iC7 = c5.j.c(dVarR3, "initial_delay");
            int iC8 = c5.j.c(dVarR3, "interval_duration");
            int iC9 = c5.j.c(dVarR3, "flex_duration");
            int iC10 = c5.j.c(dVarR3, "run_attempt_count");
            int iC11 = c5.j.c(dVarR3, "backoff_policy");
            int iC12 = c5.j.c(dVarR3, "backoff_delay_duration");
            int iC13 = c5.j.c(dVarR3, "last_enqueue_time");
            int iC14 = c5.j.c(dVarR3, "minimum_retention_duration");
            int iC15 = c5.j.c(dVarR3, "schedule_requested_at");
            int iC16 = c5.j.c(dVarR3, "run_in_foreground");
            int iC17 = c5.j.c(dVarR3, "out_of_quota_policy");
            int iC18 = c5.j.c(dVarR3, "period_count");
            int iC19 = c5.j.c(dVarR3, "generation");
            int iC20 = c5.j.c(dVarR3, "next_schedule_time_override");
            int iC21 = c5.j.c(dVarR3, "next_schedule_time_override_generation");
            int iC22 = c5.j.c(dVarR3, "stop_reason");
            int iC23 = c5.j.c(dVarR3, "trace_tag");
            int iC24 = c5.j.c(dVarR3, "backoff_on_system_interruptions");
            int iC25 = c5.j.c(dVarR3, "required_network_type");
            int iC26 = c5.j.c(dVarR3, "required_network_request");
            int iC27 = c5.j.c(dVarR3, "requires_charging");
            int iC28 = c5.j.c(dVarR3, "requires_device_idle");
            int iC29 = c5.j.c(dVarR3, "requires_battery_not_low");
            int iC30 = c5.j.c(dVarR3, "requires_storage_not_low");
            int iC31 = c5.j.c(dVarR3, "trigger_content_update_delay");
            int iC32 = c5.j.c(dVarR3, "trigger_max_content_delay");
            int iC33 = c5.j.c(dVarR3, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (dVarR3.g3()) {
                String strE2 = dVarR3.E2(iC);
                int i10 = iC14;
                ArrayList arrayList2 = arrayList;
                x5.o0.c cVarG = v1.g((int) dVarR3.getLong(iC2));
                String strE3 = dVarR3.E2(iC3);
                String strE4 = dVarR3.E2(iC4);
                byte[] blob = dVarR3.getBlob(iC5);
                androidx.work.b.Companion companion = androidx.work.b.INSTANCE;
                androidx.work.b bVarA = companion.a(blob);
                androidx.work.b bVarA2 = companion.a(dVarR3.getBlob(iC6));
                long j10 = dVarR3.getLong(iC7);
                long j11 = dVarR3.getLong(iC8);
                long j12 = dVarR3.getLong(iC9);
                int i11 = (int) dVarR3.getLong(iC10);
                int i12 = iC2;
                int i13 = iC3;
                x5.a aVarD = v1.d((int) dVarR3.getLong(iC11));
                long j13 = dVarR3.getLong(iC12);
                long j14 = dVarR3.getLong(iC13);
                long j15 = dVarR3.getLong(i10);
                int i14 = iC15;
                long j16 = dVarR3.getLong(i14);
                int i15 = iC;
                int i16 = iC16;
                boolean z10 = ((int) dVarR3.getLong(i16)) != 0;
                int i17 = iC17;
                int i18 = iC4;
                x5.f0 f0VarF = v1.f((int) dVarR3.getLong(i17));
                int i19 = iC18;
                int i20 = iC5;
                int i21 = (int) dVarR3.getLong(i19);
                int i22 = iC19;
                int i23 = (int) dVarR3.getLong(i22);
                int i24 = iC20;
                long j17 = dVarR3.getLong(i24);
                int i25 = iC21;
                int i26 = (int) dVarR3.getLong(i25);
                int i27 = iC22;
                int i28 = (int) dVarR3.getLong(i27);
                int i29 = iC23;
                Boolean boolValueOf = null;
                String strE5 = dVarR3.isNull(i29) ? null : dVarR3.E2(i29);
                int i30 = iC24;
                Integer numValueOf = dVarR3.isNull(i30) ? null : Integer.valueOf((int) dVarR3.getLong(i30));
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                int i31 = iC25;
                Boolean bool = boolValueOf;
                x5.x xVarE = v1.e((int) dVarR3.getLong(i31));
                int i32 = iC26;
                NetworkRequestCompat networkRequestCompatL = v1.l(dVarR3.getBlob(i32));
                iC25 = i31;
                iC26 = i32;
                int i33 = iC27;
                boolean z11 = ((int) dVarR3.getLong(i33)) != 0;
                iC27 = i33;
                int i34 = iC28;
                boolean z12 = ((int) dVarR3.getLong(i34)) != 0;
                int i35 = iC29;
                boolean z13 = ((int) dVarR3.getLong(i35)) != 0;
                iC29 = i35;
                int i36 = iC30;
                int i37 = iC31;
                int i38 = iC32;
                int i39 = iC33;
                iC33 = i39;
                arrayList2.add(new j0(strE2, cVarG, strE3, strE4, bVarA, bVarA2, j10, j11, j12, new x5.d(networkRequestCompatL, xVarE, z11, z12, z13, ((int) dVarR3.getLong(i36)) != 0, dVarR3.getLong(i37), dVarR3.getLong(i38), v1.b(dVarR3.getBlob(i39))), i11, aVarD, j13, j14, j15, j16, z10, f0VarF, i21, i23, j17, i26, i28, strE5, bool));
                iC30 = i36;
                iC4 = i18;
                iC17 = i17;
                iC19 = i22;
                iC22 = i27;
                iC24 = i30;
                iC31 = i37;
                iC32 = i38;
                iC2 = i12;
                iC14 = i10;
                iC3 = i13;
                arrayList = arrayList2;
                iC = i15;
                iC15 = i14;
                iC16 = i16;
                iC20 = i24;
                iC21 = i25;
                iC23 = i29;
                iC28 = i34;
                iC5 = i20;
                iC18 = i19;
            }
            return arrayList;
        } finally {
            dVarR3.close();
        }
    }

    public static final List j0(String str, String str2, f5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        f5.d dVarR3 = _connection.r3(str);
        try {
            dVarR3.k0(1, str2);
            ArrayList arrayList = new ArrayList();
            while (dVarR3.g3()) {
                arrayList.add(androidx.work.b.INSTANCE.a(dVarR3.getBlob(0)));
            }
            dVarR3.close();
            return arrayList;
        } catch (Throwable th2) {
            dVarR3.close();
            throw th2;
        }
    }

    public static final List k0(String str, long j10, f5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        f5.d dVarR3 = _connection.r3(str);
        try {
            dVarR3.z(1, j10);
            int iC = c5.j.c(dVarR3, "id");
            int iC2 = c5.j.c(dVarR3, "state");
            int iC3 = c5.j.c(dVarR3, "worker_class_name");
            int iC4 = c5.j.c(dVarR3, "input_merger_class_name");
            int iC5 = c5.j.c(dVarR3, "input");
            int iC6 = c5.j.c(dVarR3, "output");
            int iC7 = c5.j.c(dVarR3, "initial_delay");
            int iC8 = c5.j.c(dVarR3, "interval_duration");
            int iC9 = c5.j.c(dVarR3, "flex_duration");
            int iC10 = c5.j.c(dVarR3, "run_attempt_count");
            int iC11 = c5.j.c(dVarR3, "backoff_policy");
            int iC12 = c5.j.c(dVarR3, "backoff_delay_duration");
            int iC13 = c5.j.c(dVarR3, "last_enqueue_time");
            int iC14 = c5.j.c(dVarR3, "minimum_retention_duration");
            int iC15 = c5.j.c(dVarR3, "schedule_requested_at");
            int iC16 = c5.j.c(dVarR3, "run_in_foreground");
            int iC17 = c5.j.c(dVarR3, "out_of_quota_policy");
            int iC18 = c5.j.c(dVarR3, "period_count");
            int iC19 = c5.j.c(dVarR3, "generation");
            int iC20 = c5.j.c(dVarR3, "next_schedule_time_override");
            int iC21 = c5.j.c(dVarR3, "next_schedule_time_override_generation");
            int iC22 = c5.j.c(dVarR3, "stop_reason");
            int iC23 = c5.j.c(dVarR3, "trace_tag");
            int iC24 = c5.j.c(dVarR3, "backoff_on_system_interruptions");
            int iC25 = c5.j.c(dVarR3, "required_network_type");
            int iC26 = c5.j.c(dVarR3, "required_network_request");
            int iC27 = c5.j.c(dVarR3, "requires_charging");
            int iC28 = c5.j.c(dVarR3, "requires_device_idle");
            int iC29 = c5.j.c(dVarR3, "requires_battery_not_low");
            int iC30 = c5.j.c(dVarR3, "requires_storage_not_low");
            int iC31 = c5.j.c(dVarR3, "trigger_content_update_delay");
            int iC32 = c5.j.c(dVarR3, "trigger_max_content_delay");
            int iC33 = c5.j.c(dVarR3, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (dVarR3.g3()) {
                String strE2 = dVarR3.E2(iC);
                int i10 = iC13;
                int i11 = iC14;
                x5.o0.c cVarG = v1.g((int) dVarR3.getLong(iC2));
                String strE3 = dVarR3.E2(iC3);
                String strE4 = dVarR3.E2(iC4);
                byte[] blob = dVarR3.getBlob(iC5);
                androidx.work.b.Companion companion = androidx.work.b.INSTANCE;
                androidx.work.b bVarA = companion.a(blob);
                androidx.work.b bVarA2 = companion.a(dVarR3.getBlob(iC6));
                long j11 = dVarR3.getLong(iC7);
                long j12 = dVarR3.getLong(iC8);
                long j13 = dVarR3.getLong(iC9);
                int i12 = (int) dVarR3.getLong(iC10);
                int i13 = iC;
                int i14 = iC2;
                x5.a aVarD = v1.d((int) dVarR3.getLong(iC11));
                long j14 = dVarR3.getLong(iC12);
                long j15 = dVarR3.getLong(i10);
                long j16 = dVarR3.getLong(i11);
                int i15 = iC15;
                long j17 = dVarR3.getLong(i15);
                iC15 = i15;
                int i16 = iC16;
                int i17 = iC3;
                boolean z10 = ((int) dVarR3.getLong(i16)) != 0;
                int i18 = iC17;
                int i19 = iC4;
                x5.f0 f0VarF = v1.f((int) dVarR3.getLong(i18));
                int i20 = iC18;
                int i21 = (int) dVarR3.getLong(i20);
                int i22 = iC19;
                int i23 = (int) dVarR3.getLong(i22);
                int i24 = iC20;
                long j18 = dVarR3.getLong(i24);
                int i25 = iC21;
                int i26 = (int) dVarR3.getLong(i25);
                iC21 = i25;
                iC22 = iC22;
                int i27 = (int) dVarR3.getLong(iC22);
                int i28 = iC23;
                Boolean boolValueOf = null;
                String strE5 = dVarR3.isNull(i28) ? null : dVarR3.E2(i28);
                int i29 = iC24;
                Integer numValueOf = dVarR3.isNull(i29) ? null : Integer.valueOf((int) dVarR3.getLong(i29));
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                Boolean bool = boolValueOf;
                int i30 = iC25;
                x5.x xVarE = v1.e((int) dVarR3.getLong(i30));
                int i31 = iC26;
                NetworkRequestCompat networkRequestCompatL = v1.l(dVarR3.getBlob(i31));
                int i32 = iC27;
                boolean z11 = ((int) dVarR3.getLong(i32)) != 0;
                int i33 = iC28;
                boolean z12 = ((int) dVarR3.getLong(i33)) != 0;
                int i34 = iC29;
                boolean z13 = ((int) dVarR3.getLong(i34)) != 0;
                iC29 = i34;
                int i35 = iC30;
                int i36 = iC31;
                int i37 = iC32;
                iC31 = i36;
                int i38 = iC33;
                arrayList.add(new j0(strE2, cVarG, strE3, strE4, bVarA, bVarA2, j11, j12, j13, new x5.d(networkRequestCompatL, xVarE, z11, z12, z13, ((int) dVarR3.getLong(i35)) != 0, dVarR3.getLong(i36), dVarR3.getLong(i37), v1.b(dVarR3.getBlob(i38))), i12, aVarD, j14, j15, j16, j17, z10, f0VarF, i21, i23, j18, i26, i27, strE5, bool));
                iC4 = i19;
                iC17 = i18;
                iC18 = i20;
                iC19 = i22;
                iC20 = i24;
                iC23 = i28;
                iC24 = i29;
                iC25 = i30;
                iC26 = i31;
                iC27 = i32;
                iC28 = i33;
                iC33 = i38;
                iC32 = i37;
                iC30 = i35;
                iC = i13;
                iC13 = i10;
                iC14 = i11;
                iC2 = i14;
                iC3 = i17;
                iC16 = i16;
            }
            return arrayList;
        } finally {
            dVarR3.close();
        }
    }

    public static final List l0(String str, f5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        f5.d dVarR3 = _connection.r3(str);
        try {
            int iC = c5.j.c(dVarR3, "id");
            int iC2 = c5.j.c(dVarR3, "state");
            int iC3 = c5.j.c(dVarR3, "worker_class_name");
            int iC4 = c5.j.c(dVarR3, "input_merger_class_name");
            int iC5 = c5.j.c(dVarR3, "input");
            int iC6 = c5.j.c(dVarR3, "output");
            int iC7 = c5.j.c(dVarR3, "initial_delay");
            int iC8 = c5.j.c(dVarR3, "interval_duration");
            int iC9 = c5.j.c(dVarR3, "flex_duration");
            int iC10 = c5.j.c(dVarR3, "run_attempt_count");
            int iC11 = c5.j.c(dVarR3, "backoff_policy");
            int iC12 = c5.j.c(dVarR3, "backoff_delay_duration");
            int iC13 = c5.j.c(dVarR3, "last_enqueue_time");
            int iC14 = c5.j.c(dVarR3, "minimum_retention_duration");
            int iC15 = c5.j.c(dVarR3, "schedule_requested_at");
            int iC16 = c5.j.c(dVarR3, "run_in_foreground");
            int iC17 = c5.j.c(dVarR3, "out_of_quota_policy");
            int iC18 = c5.j.c(dVarR3, "period_count");
            int iC19 = c5.j.c(dVarR3, "generation");
            int iC20 = c5.j.c(dVarR3, "next_schedule_time_override");
            int iC21 = c5.j.c(dVarR3, "next_schedule_time_override_generation");
            int iC22 = c5.j.c(dVarR3, "stop_reason");
            int iC23 = c5.j.c(dVarR3, "trace_tag");
            int iC24 = c5.j.c(dVarR3, "backoff_on_system_interruptions");
            int iC25 = c5.j.c(dVarR3, "required_network_type");
            int iC26 = c5.j.c(dVarR3, "required_network_request");
            int iC27 = c5.j.c(dVarR3, "requires_charging");
            int iC28 = c5.j.c(dVarR3, "requires_device_idle");
            int iC29 = c5.j.c(dVarR3, "requires_battery_not_low");
            int iC30 = c5.j.c(dVarR3, "requires_storage_not_low");
            int iC31 = c5.j.c(dVarR3, "trigger_content_update_delay");
            int iC32 = c5.j.c(dVarR3, "trigger_max_content_delay");
            int iC33 = c5.j.c(dVarR3, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (dVarR3.g3()) {
                String strE2 = dVarR3.E2(iC);
                int i10 = iC14;
                ArrayList arrayList2 = arrayList;
                x5.o0.c cVarG = v1.g((int) dVarR3.getLong(iC2));
                String strE3 = dVarR3.E2(iC3);
                String strE4 = dVarR3.E2(iC4);
                byte[] blob = dVarR3.getBlob(iC5);
                androidx.work.b.Companion companion = androidx.work.b.INSTANCE;
                androidx.work.b bVarA = companion.a(blob);
                androidx.work.b bVarA2 = companion.a(dVarR3.getBlob(iC6));
                long j10 = dVarR3.getLong(iC7);
                long j11 = dVarR3.getLong(iC8);
                long j12 = dVarR3.getLong(iC9);
                int i11 = (int) dVarR3.getLong(iC10);
                int i12 = iC2;
                int i13 = iC3;
                x5.a aVarD = v1.d((int) dVarR3.getLong(iC11));
                long j13 = dVarR3.getLong(iC12);
                long j14 = dVarR3.getLong(iC13);
                long j15 = dVarR3.getLong(i10);
                int i14 = iC15;
                long j16 = dVarR3.getLong(i14);
                int i15 = iC;
                int i16 = iC16;
                boolean z10 = ((int) dVarR3.getLong(i16)) != 0;
                int i17 = iC17;
                int i18 = iC4;
                x5.f0 f0VarF = v1.f((int) dVarR3.getLong(i17));
                int i19 = iC18;
                int i20 = iC5;
                int i21 = (int) dVarR3.getLong(i19);
                int i22 = iC19;
                int i23 = (int) dVarR3.getLong(i22);
                int i24 = iC20;
                long j17 = dVarR3.getLong(i24);
                int i25 = iC21;
                int i26 = (int) dVarR3.getLong(i25);
                int i27 = iC22;
                int i28 = (int) dVarR3.getLong(i27);
                int i29 = iC23;
                Boolean boolValueOf = null;
                String strE5 = dVarR3.isNull(i29) ? null : dVarR3.E2(i29);
                int i30 = iC24;
                Integer numValueOf = dVarR3.isNull(i30) ? null : Integer.valueOf((int) dVarR3.getLong(i30));
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                int i31 = iC25;
                Boolean bool = boolValueOf;
                x5.x xVarE = v1.e((int) dVarR3.getLong(i31));
                int i32 = iC26;
                NetworkRequestCompat networkRequestCompatL = v1.l(dVarR3.getBlob(i32));
                iC25 = i31;
                iC26 = i32;
                int i33 = iC27;
                boolean z11 = ((int) dVarR3.getLong(i33)) != 0;
                iC27 = i33;
                int i34 = iC28;
                boolean z12 = ((int) dVarR3.getLong(i34)) != 0;
                int i35 = iC29;
                boolean z13 = ((int) dVarR3.getLong(i35)) != 0;
                iC29 = i35;
                int i36 = iC30;
                int i37 = iC31;
                int i38 = iC32;
                int i39 = iC33;
                iC33 = i39;
                arrayList2.add(new j0(strE2, cVarG, strE3, strE4, bVarA, bVarA2, j10, j11, j12, new x5.d(networkRequestCompatL, xVarE, z11, z12, z13, ((int) dVarR3.getLong(i36)) != 0, dVarR3.getLong(i37), dVarR3.getLong(i38), v1.b(dVarR3.getBlob(i39))), i11, aVarD, j13, j14, j15, j16, z10, f0VarF, i21, i23, j17, i26, i28, strE5, bool));
                iC30 = i36;
                iC4 = i18;
                iC17 = i17;
                iC19 = i22;
                iC22 = i27;
                iC24 = i30;
                iC31 = i37;
                iC32 = i38;
                iC2 = i12;
                iC14 = i10;
                iC3 = i13;
                arrayList = arrayList2;
                iC = i15;
                iC15 = i14;
                iC16 = i16;
                iC20 = i24;
                iC21 = i25;
                iC23 = i29;
                iC28 = i34;
                iC5 = i20;
                iC18 = i19;
            }
            return arrayList;
        } finally {
            dVarR3.close();
        }
    }

    public static final List m0(String str, f5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        f5.d dVarR3 = _connection.r3(str);
        try {
            int iC = c5.j.c(dVarR3, "id");
            int iC2 = c5.j.c(dVarR3, "state");
            int iC3 = c5.j.c(dVarR3, "worker_class_name");
            int iC4 = c5.j.c(dVarR3, "input_merger_class_name");
            int iC5 = c5.j.c(dVarR3, "input");
            int iC6 = c5.j.c(dVarR3, "output");
            int iC7 = c5.j.c(dVarR3, "initial_delay");
            int iC8 = c5.j.c(dVarR3, "interval_duration");
            int iC9 = c5.j.c(dVarR3, "flex_duration");
            int iC10 = c5.j.c(dVarR3, "run_attempt_count");
            int iC11 = c5.j.c(dVarR3, "backoff_policy");
            int iC12 = c5.j.c(dVarR3, "backoff_delay_duration");
            int iC13 = c5.j.c(dVarR3, "last_enqueue_time");
            int iC14 = c5.j.c(dVarR3, "minimum_retention_duration");
            int iC15 = c5.j.c(dVarR3, "schedule_requested_at");
            int iC16 = c5.j.c(dVarR3, "run_in_foreground");
            int iC17 = c5.j.c(dVarR3, "out_of_quota_policy");
            int iC18 = c5.j.c(dVarR3, "period_count");
            int iC19 = c5.j.c(dVarR3, "generation");
            int iC20 = c5.j.c(dVarR3, "next_schedule_time_override");
            int iC21 = c5.j.c(dVarR3, "next_schedule_time_override_generation");
            int iC22 = c5.j.c(dVarR3, "stop_reason");
            int iC23 = c5.j.c(dVarR3, "trace_tag");
            int iC24 = c5.j.c(dVarR3, "backoff_on_system_interruptions");
            int iC25 = c5.j.c(dVarR3, "required_network_type");
            int iC26 = c5.j.c(dVarR3, "required_network_request");
            int iC27 = c5.j.c(dVarR3, "requires_charging");
            int iC28 = c5.j.c(dVarR3, "requires_device_idle");
            int iC29 = c5.j.c(dVarR3, "requires_battery_not_low");
            int iC30 = c5.j.c(dVarR3, "requires_storage_not_low");
            int iC31 = c5.j.c(dVarR3, "trigger_content_update_delay");
            int iC32 = c5.j.c(dVarR3, "trigger_max_content_delay");
            int iC33 = c5.j.c(dVarR3, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (dVarR3.g3()) {
                String strE2 = dVarR3.E2(iC);
                int i10 = iC14;
                ArrayList arrayList2 = arrayList;
                x5.o0.c cVarG = v1.g((int) dVarR3.getLong(iC2));
                String strE3 = dVarR3.E2(iC3);
                String strE4 = dVarR3.E2(iC4);
                byte[] blob = dVarR3.getBlob(iC5);
                androidx.work.b.Companion companion = androidx.work.b.INSTANCE;
                androidx.work.b bVarA = companion.a(blob);
                androidx.work.b bVarA2 = companion.a(dVarR3.getBlob(iC6));
                long j10 = dVarR3.getLong(iC7);
                long j11 = dVarR3.getLong(iC8);
                long j12 = dVarR3.getLong(iC9);
                int i11 = (int) dVarR3.getLong(iC10);
                int i12 = iC2;
                int i13 = iC3;
                x5.a aVarD = v1.d((int) dVarR3.getLong(iC11));
                long j13 = dVarR3.getLong(iC12);
                long j14 = dVarR3.getLong(iC13);
                long j15 = dVarR3.getLong(i10);
                int i14 = iC15;
                long j16 = dVarR3.getLong(i14);
                int i15 = iC;
                int i16 = iC16;
                boolean z10 = ((int) dVarR3.getLong(i16)) != 0;
                int i17 = iC17;
                int i18 = iC4;
                x5.f0 f0VarF = v1.f((int) dVarR3.getLong(i17));
                int i19 = iC18;
                int i20 = iC5;
                int i21 = (int) dVarR3.getLong(i19);
                int i22 = iC19;
                int i23 = (int) dVarR3.getLong(i22);
                int i24 = iC20;
                long j17 = dVarR3.getLong(i24);
                int i25 = iC21;
                int i26 = (int) dVarR3.getLong(i25);
                int i27 = iC22;
                int i28 = (int) dVarR3.getLong(i27);
                int i29 = iC23;
                Boolean boolValueOf = null;
                String strE5 = dVarR3.isNull(i29) ? null : dVarR3.E2(i29);
                int i30 = iC24;
                Integer numValueOf = dVarR3.isNull(i30) ? null : Integer.valueOf((int) dVarR3.getLong(i30));
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                int i31 = iC25;
                Boolean bool = boolValueOf;
                x5.x xVarE = v1.e((int) dVarR3.getLong(i31));
                int i32 = iC26;
                NetworkRequestCompat networkRequestCompatL = v1.l(dVarR3.getBlob(i32));
                iC25 = i31;
                iC26 = i32;
                int i33 = iC27;
                boolean z11 = ((int) dVarR3.getLong(i33)) != 0;
                iC27 = i33;
                int i34 = iC28;
                boolean z12 = ((int) dVarR3.getLong(i34)) != 0;
                int i35 = iC29;
                boolean z13 = ((int) dVarR3.getLong(i35)) != 0;
                iC29 = i35;
                int i36 = iC30;
                int i37 = iC31;
                int i38 = iC32;
                int i39 = iC33;
                iC33 = i39;
                arrayList2.add(new j0(strE2, cVarG, strE3, strE4, bVarA, bVarA2, j10, j11, j12, new x5.d(networkRequestCompatL, xVarE, z11, z12, z13, ((int) dVarR3.getLong(i36)) != 0, dVarR3.getLong(i37), dVarR3.getLong(i38), v1.b(dVarR3.getBlob(i39))), i11, aVarD, j13, j14, j15, j16, z10, f0VarF, i21, i23, j17, i26, i28, strE5, bool));
                iC30 = i36;
                iC4 = i18;
                iC17 = i17;
                iC19 = i22;
                iC22 = i27;
                iC24 = i30;
                iC31 = i37;
                iC32 = i38;
                iC2 = i12;
                iC14 = i10;
                iC3 = i13;
                arrayList = arrayList2;
                iC = i15;
                iC15 = i14;
                iC16 = i16;
                iC20 = i24;
                iC21 = i25;
                iC23 = i29;
                iC28 = i34;
                iC5 = i20;
                iC18 = i19;
            }
            return arrayList;
        } finally {
            dVarR3.close();
        }
    }

    public static final x5.o0.c n0(String str, String str2, f5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        f5.d dVarR3 = _connection.r3(str);
        try {
            dVarR3.k0(1, str2);
            x5.o0.c cVarG = null;
            if (dVarR3.g3()) {
                Integer numValueOf = dVarR3.isNull(0) ? null : Integer.valueOf((int) dVarR3.getLong(0));
                if (numValueOf != null) {
                    cVarG = v1.g(numValueOf.intValue());
                }
            }
            return cVarG;
        } finally {
            dVarR3.close();
        }
    }

    public static final List o0(String str, String str2, f5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        f5.d dVarR3 = _connection.r3(str);
        try {
            dVarR3.k0(1, str2);
            ArrayList arrayList = new ArrayList();
            while (dVarR3.g3()) {
                arrayList.add(dVarR3.E2(0));
            }
            dVarR3.close();
            return arrayList;
        } catch (Throwable th2) {
            dVarR3.close();
            throw th2;
        }
    }

    public static final List p0(String str, String str2, f5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        f5.d dVarR3 = _connection.r3(str);
        try {
            dVarR3.k0(1, str2);
            ArrayList arrayList = new ArrayList();
            while (dVarR3.g3()) {
                arrayList.add(dVarR3.E2(0));
            }
            dVarR3.close();
            return arrayList;
        } catch (Throwable th2) {
            dVarR3.close();
            throw th2;
        }
    }

    public static final j0 q0(String str, String str2, f5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        f5.d dVarR3 = _connection.r3(str);
        try {
            dVarR3.k0(1, str2);
            int iC = c5.j.c(dVarR3, "id");
            int iC2 = c5.j.c(dVarR3, "state");
            int iC3 = c5.j.c(dVarR3, "worker_class_name");
            int iC4 = c5.j.c(dVarR3, "input_merger_class_name");
            int iC5 = c5.j.c(dVarR3, "input");
            int iC6 = c5.j.c(dVarR3, "output");
            int iC7 = c5.j.c(dVarR3, "initial_delay");
            int iC8 = c5.j.c(dVarR3, "interval_duration");
            int iC9 = c5.j.c(dVarR3, "flex_duration");
            int iC10 = c5.j.c(dVarR3, "run_attempt_count");
            int iC11 = c5.j.c(dVarR3, "backoff_policy");
            int iC12 = c5.j.c(dVarR3, "backoff_delay_duration");
            int iC13 = c5.j.c(dVarR3, "last_enqueue_time");
            int iC14 = c5.j.c(dVarR3, "minimum_retention_duration");
            int iC15 = c5.j.c(dVarR3, "schedule_requested_at");
            int iC16 = c5.j.c(dVarR3, "run_in_foreground");
            int iC17 = c5.j.c(dVarR3, "out_of_quota_policy");
            int iC18 = c5.j.c(dVarR3, "period_count");
            int iC19 = c5.j.c(dVarR3, "generation");
            int iC20 = c5.j.c(dVarR3, "next_schedule_time_override");
            int iC21 = c5.j.c(dVarR3, "next_schedule_time_override_generation");
            int iC22 = c5.j.c(dVarR3, "stop_reason");
            int iC23 = c5.j.c(dVarR3, "trace_tag");
            int iC24 = c5.j.c(dVarR3, "backoff_on_system_interruptions");
            int iC25 = c5.j.c(dVarR3, "required_network_type");
            int iC26 = c5.j.c(dVarR3, "required_network_request");
            int iC27 = c5.j.c(dVarR3, "requires_charging");
            int iC28 = c5.j.c(dVarR3, "requires_device_idle");
            int iC29 = c5.j.c(dVarR3, "requires_battery_not_low");
            int iC30 = c5.j.c(dVarR3, "requires_storage_not_low");
            int iC31 = c5.j.c(dVarR3, "trigger_content_update_delay");
            int iC32 = c5.j.c(dVarR3, "trigger_max_content_delay");
            int iC33 = c5.j.c(dVarR3, "content_uri_triggers");
            j0 j0Var = null;
            Boolean boolValueOf = null;
            if (dVarR3.g3()) {
                String strE2 = dVarR3.E2(iC);
                x5.o0.c cVarG = v1.g((int) dVarR3.getLong(iC2));
                String strE3 = dVarR3.E2(iC3);
                String strE4 = dVarR3.E2(iC4);
                byte[] blob = dVarR3.getBlob(iC5);
                androidx.work.b.Companion companion = androidx.work.b.INSTANCE;
                androidx.work.b bVarA = companion.a(blob);
                androidx.work.b bVarA2 = companion.a(dVarR3.getBlob(iC6));
                long j10 = dVarR3.getLong(iC7);
                long j11 = dVarR3.getLong(iC8);
                long j12 = dVarR3.getLong(iC9);
                int i10 = (int) dVarR3.getLong(iC10);
                x5.a aVarD = v1.d((int) dVarR3.getLong(iC11));
                long j13 = dVarR3.getLong(iC12);
                long j14 = dVarR3.getLong(iC13);
                long j15 = dVarR3.getLong(iC14);
                long j16 = dVarR3.getLong(iC15);
                boolean z10 = ((int) dVarR3.getLong(iC16)) != 0;
                x5.f0 f0VarF = v1.f((int) dVarR3.getLong(iC17));
                int i11 = (int) dVarR3.getLong(iC18);
                int i12 = (int) dVarR3.getLong(iC19);
                long j17 = dVarR3.getLong(iC20);
                int i13 = (int) dVarR3.getLong(iC21);
                int i14 = (int) dVarR3.getLong(iC22);
                String strE5 = dVarR3.isNull(iC23) ? null : dVarR3.E2(iC23);
                Integer numValueOf = dVarR3.isNull(iC24) ? null : Integer.valueOf((int) dVarR3.getLong(iC24));
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                j0Var = new j0(strE2, cVarG, strE3, strE4, bVarA, bVarA2, j10, j11, j12, new x5.d(v1.l(dVarR3.getBlob(iC26)), v1.e((int) dVarR3.getLong(iC25)), ((int) dVarR3.getLong(iC27)) != 0, ((int) dVarR3.getLong(iC28)) != 0, ((int) dVarR3.getLong(iC29)) != 0, ((int) dVarR3.getLong(iC30)) != 0, dVarR3.getLong(iC31), dVarR3.getLong(iC32), v1.b(dVarR3.getBlob(iC33))), i10, aVarD, j13, j14, j15, j16, z10, f0VarF, i11, i12, j17, i13, i14, strE5, boolValueOf);
            }
            return j0Var;
        } finally {
            dVarR3.close();
        }
    }

    public static final List r0(String str, String str2, f5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        f5.d dVarR3 = _connection.r3(str);
        try {
            dVarR3.k0(1, str2);
            ArrayList arrayList = new ArrayList();
            while (dVarR3.g3()) {
                arrayList.add(new j0.IdAndState(dVarR3.E2(0), v1.g((int) dVarR3.getLong(1))));
            }
            dVarR3.close();
            return arrayList;
        } catch (Throwable th2) {
            dVarR3.close();
            throw th2;
        }
    }

    public static final boolean s0(String str, f5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        f5.d dVarR3 = _connection.r3(str);
        try {
            boolean z10 = false;
            if (dVarR3.g3() && ((int) dVarR3.getLong(0)) != 0) {
                z10 = true;
            }
            return z10;
        } finally {
            dVarR3.close();
        }
    }

    public static final Unit t0(String str, String str2, f5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        f5.d dVarR3 = _connection.r3(str);
        try {
            dVarR3.k0(1, str2);
            dVarR3.g3();
            return Unit.f22483a;
        } finally {
            dVarR3.close();
        }
    }

    public static final int u0(String str, String str2, f5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        f5.d dVarR3 = _connection.r3(str);
        try {
            dVarR3.k0(1, str2);
            dVarR3.g3();
            return c5.i.b(_connection);
        } finally {
            dVarR3.close();
        }
    }

    public static final Unit v0(n1 n1Var, j0 j0Var, f5.b _connection) throws Exception {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        n1Var.__insertAdapterOfWorkSpec.d(_connection, j0Var);
        return Unit.f22483a;
    }

    public static final int w0(String str, long j10, String str2, f5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        f5.d dVarR3 = _connection.r3(str);
        try {
            dVarR3.z(1, j10);
            dVarR3.k0(2, str2);
            dVarR3.g3();
            return c5.i.b(_connection);
        } finally {
            dVarR3.close();
        }
    }

    public static final int x0(String str, f5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        f5.d dVarR3 = _connection.r3(str);
        try {
            dVarR3.g3();
            return c5.i.b(_connection);
        } finally {
            dVarR3.close();
        }
    }

    public static final Unit y0(String str, String str2, int i10, f5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        f5.d dVarR3 = _connection.r3(str);
        try {
            dVarR3.k0(1, str2);
            dVarR3.z(2, i10);
            dVarR3.g3();
            return Unit.f22483a;
        } finally {
            dVarR3.close();
        }
    }

    public static final int z0(String str, String str2, f5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        f5.d dVarR3 = _connection.r3(str);
        try {
            dVarR3.k0(1, str2);
            dVarR3.g3();
            return c5.i.b(_connection);
        } finally {
            dVarR3.close();
        }
    }

    @Override // f6.k0
    public int A() {
        final String str = "Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)";
        return ((Number) c5.a.c(this.__db, true, false, new Function1() { // from class: f6.h1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(n1.e0(str, (f5.b) obj));
            }
        })).intValue();
    }

    @Override // f6.k0
    public void B(@NotNull final String id2, final int overrideGeneration) {
        Intrinsics.checkNotNullParameter(id2, "id");
        final String str = "UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)";
        c5.a.c(this.__db, false, true, new Function1() { // from class: f6.y0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n1.y0(str, id2, overrideGeneration, (f5.b) obj);
            }
        });
    }

    @Override // f6.k0
    public void a(@NotNull final String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        final String str = "DELETE FROM workspec WHERE id=?";
        c5.a.c(this.__db, false, true, new Function1() { // from class: f6.i1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n1.f0(str, id2, (f5.b) obj);
            }
        });
    }

    @Override // f6.k0
    public void b(@NotNull final String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        final String str = "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
        c5.a.c(this.__db, false, true, new Function1() { // from class: f6.a1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n1.t0(str, id2, (f5.b) obj);
            }
        });
    }

    @Override // f6.k0
    public int c(@NotNull final x5.o0.c state, @NotNull final String id2) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(id2, "id");
        final String str = "UPDATE workspec SET state=? WHERE id=?";
        return ((Number) c5.a.c(this.__db, false, true, new Function1() { // from class: f6.r0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(n1.D0(str, state, id2, (f5.b) obj));
            }
        })).intValue();
    }

    @Override // f6.k0
    @NotNull
    public List<j0> d(final long startingAt) {
        final String str = "SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC";
        return (List) c5.a.c(this.__db, true, false, new Function1() { // from class: f6.m0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n1.k0(str, startingAt, (f5.b) obj);
            }
        });
    }

    @Override // f6.k0
    public void e(@NotNull final String id2, final int stopReason) {
        Intrinsics.checkNotNullParameter(id2, "id");
        final String str = "UPDATE workspec SET stop_reason=? WHERE id=?";
        c5.a.c(this.__db, false, true, new Function1() { // from class: f6.g1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n1.E0(str, stopReason, id2, (f5.b) obj);
            }
        });
    }

    @Override // f6.k0
    @NotNull
    public List<j0> f() {
        final String str = "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1";
        return (List) c5.a.c(this.__db, true, false, new Function1() { // from class: f6.n0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n1.m0(str, (f5.b) obj);
            }
        });
    }

    @Override // f6.k0
    public void g(@NotNull final j0 workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        c5.a.c(this.__db, false, true, new Function1() { // from class: f6.c1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n1.F0(this.f16221a, workSpec, (f5.b) obj);
            }
        });
    }

    @Override // f6.k0
    public void h(@NotNull final j0 workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        c5.a.c(this.__db, false, true, new Function1() { // from class: f6.w0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n1.v0(this.f16328a, workSpec, (f5.b) obj);
            }
        });
    }

    @Override // f6.k0
    @NotNull
    public List<String> i(@NotNull final String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        final String str = "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)";
        return (List) c5.a.c(this.__db, true, false, new Function1() { // from class: f6.t0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n1.o0(str, name, (f5.b) obj);
            }
        });
    }

    @Override // f6.k0
    @Nullable
    public x5.o0.c j(@NotNull final String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        final String str = "SELECT state FROM workspec WHERE id=?";
        return (x5.o0.c) c5.a.c(this.__db, true, false, new Function1() { // from class: f6.s0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n1.n0(str, id2, (f5.b) obj);
            }
        });
    }

    @Override // f6.k0
    @Nullable
    public j0 k(@NotNull final String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        final String str = "SELECT * FROM workspec WHERE id=?";
        return (j0) c5.a.c(this.__db, true, false, new Function1() { // from class: f6.l0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n1.q0(str, id2, (f5.b) obj);
            }
        });
    }

    @Override // f6.k0
    public int l(@NotNull final String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        final String str = "UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?";
        return ((Number) c5.a.c(this.__db, false, true, new Function1() { // from class: f6.u0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(n1.A0(str, id2, (f5.b) obj));
            }
        })).intValue();
    }

    @Override // f6.k0
    @NotNull
    public List<String> m(@NotNull final String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        final String str = "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)";
        return (List) c5.a.c(this.__db, true, false, new Function1() { // from class: f6.b1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n1.p0(str, tag, (f5.b) obj);
            }
        });
    }

    @Override // f6.k0
    @NotNull
    public List<androidx.work.b> n(@NotNull final String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        final String str = "SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)";
        return (List) c5.a.c(this.__db, true, false, new Function1() { // from class: f6.d1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n1.j0(str, id2, (f5.b) obj);
            }
        });
    }

    @Override // f6.k0
    @NotNull
    public List<j0> o(final int maxLimit) {
        final String str = "SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?";
        return (List) c5.a.c(this.__db, true, false, new Function1() { // from class: f6.k1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n1.g0(str, maxLimit, (f5.b) obj);
            }
        });
    }

    @Override // f6.k0
    public int p() {
        final String str = "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        return ((Number) c5.a.c(this.__db, false, true, new Function1() { // from class: f6.l1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(n1.x0(str, (f5.b) obj));
            }
        })).intValue();
    }

    @Override // f6.k0
    public int q(@NotNull final String id2, final long startTime) {
        Intrinsics.checkNotNullParameter(id2, "id");
        final String str = "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        return ((Number) c5.a.c(this.__db, false, true, new Function1() { // from class: f6.p0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(n1.w0(str, startTime, id2, (f5.b) obj));
            }
        })).intValue();
    }

    @Override // f6.k0
    @NotNull
    public List<j0.IdAndState> r(@NotNull final String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        final String str = "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)";
        return (List) c5.a.c(this.__db, true, false, new Function1() { // from class: f6.m1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n1.r0(str, name, (f5.b) obj);
            }
        });
    }

    @Override // f6.k0
    @NotNull
    public nu.h<Boolean> s() {
        final String str = "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1";
        return z4.k.a(this.__db, false, new String[]{"workspec"}, new Function1() { // from class: f6.j1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(n1.s0(str, (f5.b) obj));
            }
        });
    }

    @Override // f6.k0
    @NotNull
    public List<j0> t(final int schedulerLimit) {
        final String str = "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))";
        return (List) c5.a.c(this.__db, true, false, new Function1() { // from class: f6.o0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n1.h0(str, schedulerLimit, (f5.b) obj);
            }
        });
    }

    @Override // f6.k0
    public void u(@NotNull final String id2, @NotNull final androidx.work.b output) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(output, "output");
        final String str = "UPDATE workspec SET output=? WHERE id=?";
        c5.a.c(this.__db, false, true, new Function1() { // from class: f6.v0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n1.C0(str, output, id2, (f5.b) obj);
            }
        });
    }

    @Override // f6.k0
    public void v(@NotNull final String id2, final long enqueueTime) {
        Intrinsics.checkNotNullParameter(id2, "id");
        final String str = "UPDATE workspec SET last_enqueue_time=? WHERE id=?";
        c5.a.c(this.__db, false, true, new Function1() { // from class: f6.x0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n1.B0(str, enqueueTime, id2, (f5.b) obj);
            }
        });
    }

    @Override // f6.k0
    @NotNull
    public List<j0> w() {
        final String str = "SELECT * FROM workspec WHERE state=1";
        return (List) c5.a.c(this.__db, true, false, new Function1() { // from class: f6.q0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n1.l0(str, (f5.b) obj);
            }
        });
    }

    @Override // f6.k0
    @NotNull
    public List<j0> x() {
        final String str = "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time";
        return (List) c5.a.c(this.__db, true, false, new Function1() { // from class: f6.f1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n1.i0(str, (f5.b) obj);
            }
        });
    }

    @Override // f6.k0
    public int y(@NotNull final String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        final String str = "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        return ((Number) c5.a.c(this.__db, false, true, new Function1() { // from class: f6.z0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(n1.z0(str, id2, (f5.b) obj));
            }
        })).intValue();
    }

    @Override // f6.k0
    public int z(@NotNull final String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        final String str = "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        return ((Number) c5.a.c(this.__db, false, true, new Function1() { // from class: f6.e1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(n1.u0(str, id2, (f5.b) obj));
            }
        })).intValue();
    }
}
