package g6;

import com.github.luben.zstd.BuildConfig;
import h6.NetworkRequestCompat;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 I2\u00020\u0001:\u0001-B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00112\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0019\u0010\u0014J\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u00112\u0006\u0010\u001a\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001b\u0010\u0014J\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u00112\u0006\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001c\u0010\u0014J\u0015\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\u00112\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u0015\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011H\u0016¢\u0006\u0004\b%\u0010&J\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00060\u00112\u0006\u0010'\u001a\u00020!H\u0016¢\u0006\u0004\b(\u0010$J\u0015\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011H\u0016¢\u0006\u0004\b)\u0010&J\u0015\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011H\u0016¢\u0006\u0004\b*\u0010&J\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00060\u00112\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020!H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b1\u00102J\u001f\u00104\u001a\u00020!2\u0006\u00103\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020!2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b8\u00102J\u001f\u0010:\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u00109\u001a\u00020\u0018H\u0016¢\u0006\u0004\b:\u0010;J\u001f\u0010=\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010<\u001a\u00020+H\u0016¢\u0006\u0004\b=\u0010>J\u0017\u0010?\u001a\u00020!2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b?\u00107J\u0017\u0010@\u001a\u00020!2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b@\u00107J\u001f\u0010B\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010A\u001a\u00020!H\u0016¢\u0006\u0004\bB\u0010CJ\u001f\u0010E\u001a\u00020!2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010D\u001a\u00020+H\u0016¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020!H\u0016¢\u0006\u0004\bG\u00100J\u001f\u0010I\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010H\u001a\u00020!H\u0016¢\u0006\u0004\bI\u0010CR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010JR\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00060K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010LR\u001a\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00060N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010O¨\u0006Q"}, d2 = {"Lg6/n1;", "Lg6/k0;", "Ly4/u;", "__db", "<init>", "(Ly4/u;)V", "Lg6/j0;", "workSpec", BuildConfig.FLAVOR, "o", "(Lg6/j0;)V", "p", BuildConfig.FLAVOR, "id", "h", "(Ljava/lang/String;)Lg6/j0;", "name", BuildConfig.FLAVOR, "Lg6/j0$b;", "r", "(Ljava/lang/String;)Ljava/util/List;", "Ly5/o0$c;", "g", "(Ljava/lang/String;)Ly5/o0$c;", "Landroidx/work/b;", "l", "tag", "k", "f", "Ldv/h;", BuildConfig.FLAVOR, "s", "()Ldv/h;", BuildConfig.FLAVOR, "schedulerLimit", "t", "(I)Ljava/util/List;", "x", "()Ljava/util/List;", "maxLimit", "m", "e", "w", BuildConfig.FLAVOR, "startingAt", "c", "(J)Ljava/util/List;", "A", "()I", "a", "(Ljava/lang/String;)V", "state", "j", "(Ly5/o0$c;Ljava/lang/String;)I", "i", "(Ljava/lang/String;)I", "b", "output", "u", "(Ljava/lang/String;Landroidx/work/b;)V", "enqueueTime", "v", "(Ljava/lang/String;J)V", "z", "y", "overrideGeneration", "B", "(Ljava/lang/String;I)V", "startTime", "q", "(Ljava/lang/String;J)I", "n", "stopReason", "d", "Ly4/u;", "Ly4/f;", "Ly4/f;", "__insertAdapterOfWorkSpec", "Ly4/e;", "Ly4/e;", "__updateAdapterOfWorkSpec", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n1 implements k0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final y4.u __db;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final y4.f<j0> __insertAdapterOfWorkSpec;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final y4.e<j0> __updateAdapterOfWorkSpec;

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"g6/n1$a", "Ly4/f;", "Lg6/j0;", BuildConfig.FLAVOR, "b", "()Ljava/lang/String;", "Lg5/d;", "statement", "entity", BuildConfig.FLAVOR, "g", "(Lg5/d;Lg6/j0;)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends y4.f<j0> {
        @Override // y4.f
        public String b() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`trace_tag`,`backoff_on_system_interruptions`,`required_network_type`,`required_network_request`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // y4.f
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void a(g5.d statement, j0 entity) {
            Intrinsics.checkNotNullParameter(statement, "statement");
            Intrinsics.checkNotNullParameter(entity, "entity");
            statement.m0(1, entity.id);
            statement.B(2, v1.k(entity.state));
            statement.m0(3, entity.workerClassName);
            statement.m0(4, entity.inputMergerClassName);
            androidx.work.b.Companion companion = androidx.work.b.INSTANCE;
            statement.C(5, companion.e(entity.input));
            statement.C(6, companion.e(entity.output));
            statement.B(7, entity.initialDelay);
            statement.B(8, entity.intervalDuration);
            statement.B(9, entity.flexDuration);
            statement.B(10, entity.runAttemptCount);
            statement.B(11, v1.a(entity.backoffPolicy));
            statement.B(12, entity.backoffDelayDuration);
            statement.B(13, entity.lastEnqueueTime);
            statement.B(14, entity.minimumRetentionDuration);
            statement.B(15, entity.scheduleRequestedAt);
            statement.B(16, entity.expedited ? 1L : 0L);
            statement.B(17, v1.i(entity.outOfQuotaPolicy));
            statement.B(18, entity.getPeriodCount());
            statement.B(19, entity.getGeneration());
            statement.B(20, entity.getNextScheduleTimeOverride());
            statement.B(21, entity.getNextScheduleTimeOverrideGeneration());
            statement.B(22, entity.getStopReason());
            String traceTag = entity.getTraceTag();
            if (traceTag == null) {
                statement.F(23);
            } else {
                statement.m0(23, traceTag);
            }
            Boolean backOffOnSystemInterruptions = entity.getBackOffOnSystemInterruptions();
            Integer numValueOf = backOffOnSystemInterruptions != null ? Integer.valueOf(backOffOnSystemInterruptions.booleanValue() ? 1 : 0) : null;
            if (numValueOf == null) {
                statement.F(24);
            } else {
                statement.B(24, numValueOf.intValue());
            }
            y5.d dVar = entity.constraints;
            statement.B(25, v1.h(dVar.getRequiredNetworkType()));
            statement.C(26, v1.c(dVar.getRequiredNetworkRequestCompat()));
            statement.B(27, dVar.getRequiresCharging() ? 1L : 0L);
            statement.B(28, dVar.getRequiresDeviceIdle() ? 1L : 0L);
            statement.B(29, dVar.getRequiresBatteryNotLow() ? 1L : 0L);
            statement.B(30, dVar.getRequiresStorageNotLow() ? 1L : 0L);
            statement.B(31, dVar.getContentTriggerUpdateDelayMillis());
            statement.B(32, dVar.getContentTriggerMaxDelayMillis());
            statement.C(33, v1.j(dVar.c()));
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"g6/n1$b", "Ly4/e;", "Lg6/j0;", BuildConfig.FLAVOR, "b", "()Ljava/lang/String;", "Lg5/d;", "statement", "entity", BuildConfig.FLAVOR, "e", "(Lg5/d;Lg6/j0;)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends y4.e<j0> {
        @Override // y4.e
        public String b() {
            return "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`next_schedule_time_override` = ?,`next_schedule_time_override_generation` = ?,`stop_reason` = ?,`trace_tag` = ?,`backoff_on_system_interruptions` = ?,`required_network_type` = ?,`required_network_request` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
        }

        @Override // y4.e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void a(g5.d statement, j0 entity) {
            Intrinsics.checkNotNullParameter(statement, "statement");
            Intrinsics.checkNotNullParameter(entity, "entity");
            statement.m0(1, entity.id);
            statement.B(2, v1.k(entity.state));
            statement.m0(3, entity.workerClassName);
            statement.m0(4, entity.inputMergerClassName);
            androidx.work.b.Companion companion = androidx.work.b.INSTANCE;
            statement.C(5, companion.e(entity.input));
            statement.C(6, companion.e(entity.output));
            statement.B(7, entity.initialDelay);
            statement.B(8, entity.intervalDuration);
            statement.B(9, entity.flexDuration);
            statement.B(10, entity.runAttemptCount);
            statement.B(11, v1.a(entity.backoffPolicy));
            statement.B(12, entity.backoffDelayDuration);
            statement.B(13, entity.lastEnqueueTime);
            statement.B(14, entity.minimumRetentionDuration);
            statement.B(15, entity.scheduleRequestedAt);
            statement.B(16, entity.expedited ? 1L : 0L);
            statement.B(17, v1.i(entity.outOfQuotaPolicy));
            statement.B(18, entity.getPeriodCount());
            statement.B(19, entity.getGeneration());
            statement.B(20, entity.getNextScheduleTimeOverride());
            statement.B(21, entity.getNextScheduleTimeOverrideGeneration());
            statement.B(22, entity.getStopReason());
            String traceTag = entity.getTraceTag();
            if (traceTag == null) {
                statement.F(23);
            } else {
                statement.m0(23, traceTag);
            }
            Boolean backOffOnSystemInterruptions = entity.getBackOffOnSystemInterruptions();
            Integer numValueOf = backOffOnSystemInterruptions != null ? Integer.valueOf(backOffOnSystemInterruptions.booleanValue() ? 1 : 0) : null;
            if (numValueOf == null) {
                statement.F(24);
            } else {
                statement.B(24, numValueOf.intValue());
            }
            y5.d dVar = entity.constraints;
            statement.B(25, v1.h(dVar.getRequiredNetworkType()));
            statement.C(26, v1.c(dVar.getRequiredNetworkRequestCompat()));
            statement.B(27, dVar.getRequiresCharging() ? 1L : 0L);
            statement.B(28, dVar.getRequiresDeviceIdle() ? 1L : 0L);
            statement.B(29, dVar.getRequiresBatteryNotLow() ? 1L : 0L);
            statement.B(30, dVar.getRequiresStorageNotLow() ? 1L : 0L);
            statement.B(31, dVar.getContentTriggerUpdateDelayMillis());
            statement.B(32, dVar.getContentTriggerMaxDelayMillis());
            statement.C(33, v1.j(dVar.c()));
            statement.m0(34, entity.id);
        }
    }

    /* JADX INFO: renamed from: g6.n1$c, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lg6/n1$c;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "Lxu/c;", "a", "()Ljava/util/List;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<xu.c<?>> a() {
            return p001kotlin.collections.p.k();
        }

        public Companion() {
        }
    }

    public n1(@NotNull y4.u __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.__db = __db;
        this.__insertAdapterOfWorkSpec = new a();
        this.__updateAdapterOfWorkSpec = new b();
    }

    public static final int A0(String str, String str2, g5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        g5.d dVarW3 = _connection.w3(str);
        try {
            dVarW3.m0(1, str2);
            dVarW3.n3();
            return d5.i.b(_connection);
        } finally {
            dVarW3.close();
        }
    }

    public static final Unit B0(String str, long j10, String str2, g5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        g5.d dVarW3 = _connection.w3(str);
        try {
            dVarW3.B(1, j10);
            dVarW3.m0(2, str2);
            dVarW3.n3();
            return Unit.f21506a;
        } finally {
            dVarW3.close();
        }
    }

    public static final Unit C0(String str, androidx.work.b bVar, String str2, g5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        g5.d dVarW3 = _connection.w3(str);
        try {
            dVarW3.C(1, androidx.work.b.INSTANCE.e(bVar));
            dVarW3.m0(2, str2);
            dVarW3.n3();
            return Unit.f21506a;
        } finally {
            dVarW3.close();
        }
    }

    public static final int D0(String str, y5.o0.c cVar, String str2, g5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        g5.d dVarW3 = _connection.w3(str);
        try {
            dVarW3.B(1, v1.k(cVar));
            dVarW3.m0(2, str2);
            dVarW3.n3();
            return d5.i.b(_connection);
        } finally {
            dVarW3.close();
        }
    }

    public static final Unit E0(String str, int i10, String str2, g5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        g5.d dVarW3 = _connection.w3(str);
        try {
            dVarW3.B(1, i10);
            dVarW3.m0(2, str2);
            dVarW3.n3();
            return Unit.f21506a;
        } finally {
            dVarW3.close();
        }
    }

    public static final Unit F0(n1 n1Var, j0 j0Var, g5.b _connection) throws Exception {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        n1Var.__updateAdapterOfWorkSpec.c(_connection, j0Var);
        return Unit.f21506a;
    }

    public static final int e0(String str, g5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        g5.d dVarW3 = _connection.w3(str);
        try {
            return dVarW3.n3() ? (int) dVarW3.getLong(0) : 0;
        } finally {
            dVarW3.close();
        }
    }

    public static final Unit f0(String str, String str2, g5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        g5.d dVarW3 = _connection.w3(str);
        try {
            dVarW3.m0(1, str2);
            dVarW3.n3();
            return Unit.f21506a;
        } finally {
            dVarW3.close();
        }
    }

    public static final List g0(String str, int i10, g5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        g5.d dVarW3 = _connection.w3(str);
        try {
            dVarW3.B(1, i10);
            int iC = d5.j.c(dVarW3, "id");
            int iC2 = d5.j.c(dVarW3, "state");
            int iC3 = d5.j.c(dVarW3, "worker_class_name");
            int iC4 = d5.j.c(dVarW3, "input_merger_class_name");
            int iC5 = d5.j.c(dVarW3, "input");
            int iC6 = d5.j.c(dVarW3, "output");
            int iC7 = d5.j.c(dVarW3, "initial_delay");
            int iC8 = d5.j.c(dVarW3, "interval_duration");
            int iC9 = d5.j.c(dVarW3, "flex_duration");
            int iC10 = d5.j.c(dVarW3, "run_attempt_count");
            int iC11 = d5.j.c(dVarW3, "backoff_policy");
            int iC12 = d5.j.c(dVarW3, "backoff_delay_duration");
            int iC13 = d5.j.c(dVarW3, "last_enqueue_time");
            int iC14 = d5.j.c(dVarW3, "minimum_retention_duration");
            int iC15 = d5.j.c(dVarW3, "schedule_requested_at");
            int iC16 = d5.j.c(dVarW3, "run_in_foreground");
            int iC17 = d5.j.c(dVarW3, "out_of_quota_policy");
            int iC18 = d5.j.c(dVarW3, "period_count");
            int iC19 = d5.j.c(dVarW3, "generation");
            int iC20 = d5.j.c(dVarW3, "next_schedule_time_override");
            int iC21 = d5.j.c(dVarW3, "next_schedule_time_override_generation");
            int iC22 = d5.j.c(dVarW3, "stop_reason");
            int iC23 = d5.j.c(dVarW3, "trace_tag");
            int iC24 = d5.j.c(dVarW3, "backoff_on_system_interruptions");
            int iC25 = d5.j.c(dVarW3, "required_network_type");
            int iC26 = d5.j.c(dVarW3, "required_network_request");
            int iC27 = d5.j.c(dVarW3, "requires_charging");
            int iC28 = d5.j.c(dVarW3, "requires_device_idle");
            int iC29 = d5.j.c(dVarW3, "requires_battery_not_low");
            int iC30 = d5.j.c(dVarW3, "requires_storage_not_low");
            int iC31 = d5.j.c(dVarW3, "trigger_content_update_delay");
            int iC32 = d5.j.c(dVarW3, "trigger_max_content_delay");
            int iC33 = d5.j.c(dVarW3, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (dVarW3.n3()) {
                String strI2 = dVarW3.I2(iC);
                int i11 = iC13;
                int i12 = iC14;
                y5.o0.c cVarG = v1.g((int) dVarW3.getLong(iC2));
                String strI3 = dVarW3.I2(iC3);
                String strI4 = dVarW3.I2(iC4);
                byte[] blob = dVarW3.getBlob(iC5);
                androidx.work.b.Companion companion = androidx.work.b.INSTANCE;
                androidx.work.b bVarA = companion.a(blob);
                androidx.work.b bVarA2 = companion.a(dVarW3.getBlob(iC6));
                long j10 = dVarW3.getLong(iC7);
                long j11 = dVarW3.getLong(iC8);
                long j12 = dVarW3.getLong(iC9);
                int i13 = (int) dVarW3.getLong(iC10);
                int i14 = iC;
                int i15 = iC2;
                y5.a aVarD = v1.d((int) dVarW3.getLong(iC11));
                long j13 = dVarW3.getLong(iC12);
                long j14 = dVarW3.getLong(i11);
                long j15 = dVarW3.getLong(i12);
                int i16 = iC15;
                long j16 = dVarW3.getLong(i16);
                iC15 = i16;
                int i17 = iC16;
                int i18 = iC3;
                boolean z10 = ((int) dVarW3.getLong(i17)) != 0;
                int i19 = iC17;
                int i20 = iC4;
                y5.f0 f0VarF = v1.f((int) dVarW3.getLong(i19));
                int i21 = iC18;
                int i22 = (int) dVarW3.getLong(i21);
                int i23 = iC19;
                int i24 = (int) dVarW3.getLong(i23);
                int i25 = iC20;
                long j17 = dVarW3.getLong(i25);
                int i26 = iC21;
                int i27 = (int) dVarW3.getLong(i26);
                iC21 = i26;
                iC22 = iC22;
                int i28 = (int) dVarW3.getLong(iC22);
                int i29 = iC23;
                Boolean boolValueOf = null;
                String strI5 = dVarW3.isNull(i29) ? null : dVarW3.I2(i29);
                int i30 = iC24;
                Integer numValueOf = dVarW3.isNull(i30) ? null : Integer.valueOf((int) dVarW3.getLong(i30));
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                Boolean bool = boolValueOf;
                int i31 = iC25;
                y5.x xVarE = v1.e((int) dVarW3.getLong(i31));
                int i32 = iC26;
                NetworkRequestCompat networkRequestCompatL = v1.l(dVarW3.getBlob(i32));
                int i33 = iC27;
                boolean z11 = ((int) dVarW3.getLong(i33)) != 0;
                int i34 = iC28;
                boolean z12 = ((int) dVarW3.getLong(i34)) != 0;
                int i35 = iC29;
                boolean z13 = ((int) dVarW3.getLong(i35)) != 0;
                iC29 = i35;
                int i36 = iC30;
                int i37 = iC31;
                int i38 = iC32;
                iC31 = i37;
                int i39 = iC33;
                arrayList.add(new j0(strI2, cVarG, strI3, strI4, bVarA, bVarA2, j10, j11, j12, new y5.d(networkRequestCompatL, xVarE, z11, z12, z13, ((int) dVarW3.getLong(i36)) != 0, dVarW3.getLong(i37), dVarW3.getLong(i38), v1.b(dVarW3.getBlob(i39))), i13, aVarD, j13, j14, j15, j16, z10, f0VarF, i22, i24, j17, i27, i28, strI5, bool));
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
            dVarW3.close();
        }
    }

    public static final List h0(String str, int i10, g5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        g5.d dVarW3 = _connection.w3(str);
        try {
            dVarW3.B(1, i10);
            int iC = d5.j.c(dVarW3, "id");
            int iC2 = d5.j.c(dVarW3, "state");
            int iC3 = d5.j.c(dVarW3, "worker_class_name");
            int iC4 = d5.j.c(dVarW3, "input_merger_class_name");
            int iC5 = d5.j.c(dVarW3, "input");
            int iC6 = d5.j.c(dVarW3, "output");
            int iC7 = d5.j.c(dVarW3, "initial_delay");
            int iC8 = d5.j.c(dVarW3, "interval_duration");
            int iC9 = d5.j.c(dVarW3, "flex_duration");
            int iC10 = d5.j.c(dVarW3, "run_attempt_count");
            int iC11 = d5.j.c(dVarW3, "backoff_policy");
            int iC12 = d5.j.c(dVarW3, "backoff_delay_duration");
            int iC13 = d5.j.c(dVarW3, "last_enqueue_time");
            int iC14 = d5.j.c(dVarW3, "minimum_retention_duration");
            int iC15 = d5.j.c(dVarW3, "schedule_requested_at");
            int iC16 = d5.j.c(dVarW3, "run_in_foreground");
            int iC17 = d5.j.c(dVarW3, "out_of_quota_policy");
            int iC18 = d5.j.c(dVarW3, "period_count");
            int iC19 = d5.j.c(dVarW3, "generation");
            int iC20 = d5.j.c(dVarW3, "next_schedule_time_override");
            int iC21 = d5.j.c(dVarW3, "next_schedule_time_override_generation");
            int iC22 = d5.j.c(dVarW3, "stop_reason");
            int iC23 = d5.j.c(dVarW3, "trace_tag");
            int iC24 = d5.j.c(dVarW3, "backoff_on_system_interruptions");
            int iC25 = d5.j.c(dVarW3, "required_network_type");
            int iC26 = d5.j.c(dVarW3, "required_network_request");
            int iC27 = d5.j.c(dVarW3, "requires_charging");
            int iC28 = d5.j.c(dVarW3, "requires_device_idle");
            int iC29 = d5.j.c(dVarW3, "requires_battery_not_low");
            int iC30 = d5.j.c(dVarW3, "requires_storage_not_low");
            int iC31 = d5.j.c(dVarW3, "trigger_content_update_delay");
            int iC32 = d5.j.c(dVarW3, "trigger_max_content_delay");
            int iC33 = d5.j.c(dVarW3, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (dVarW3.n3()) {
                String strI2 = dVarW3.I2(iC);
                int i11 = iC13;
                int i12 = iC14;
                y5.o0.c cVarG = v1.g((int) dVarW3.getLong(iC2));
                String strI3 = dVarW3.I2(iC3);
                String strI4 = dVarW3.I2(iC4);
                byte[] blob = dVarW3.getBlob(iC5);
                androidx.work.b.Companion companion = androidx.work.b.INSTANCE;
                androidx.work.b bVarA = companion.a(blob);
                androidx.work.b bVarA2 = companion.a(dVarW3.getBlob(iC6));
                long j10 = dVarW3.getLong(iC7);
                long j11 = dVarW3.getLong(iC8);
                long j12 = dVarW3.getLong(iC9);
                int i13 = (int) dVarW3.getLong(iC10);
                int i14 = iC;
                int i15 = iC2;
                y5.a aVarD = v1.d((int) dVarW3.getLong(iC11));
                long j13 = dVarW3.getLong(iC12);
                long j14 = dVarW3.getLong(i11);
                long j15 = dVarW3.getLong(i12);
                int i16 = iC15;
                long j16 = dVarW3.getLong(i16);
                iC15 = i16;
                int i17 = iC16;
                int i18 = iC3;
                boolean z10 = ((int) dVarW3.getLong(i17)) != 0;
                int i19 = iC17;
                int i20 = iC4;
                y5.f0 f0VarF = v1.f((int) dVarW3.getLong(i19));
                int i21 = iC18;
                int i22 = (int) dVarW3.getLong(i21);
                int i23 = iC19;
                int i24 = (int) dVarW3.getLong(i23);
                int i25 = iC20;
                long j17 = dVarW3.getLong(i25);
                int i26 = iC21;
                int i27 = (int) dVarW3.getLong(i26);
                iC21 = i26;
                iC22 = iC22;
                int i28 = (int) dVarW3.getLong(iC22);
                int i29 = iC23;
                Boolean boolValueOf = null;
                String strI5 = dVarW3.isNull(i29) ? null : dVarW3.I2(i29);
                int i30 = iC24;
                Integer numValueOf = dVarW3.isNull(i30) ? null : Integer.valueOf((int) dVarW3.getLong(i30));
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                Boolean bool = boolValueOf;
                int i31 = iC25;
                y5.x xVarE = v1.e((int) dVarW3.getLong(i31));
                int i32 = iC26;
                NetworkRequestCompat networkRequestCompatL = v1.l(dVarW3.getBlob(i32));
                int i33 = iC27;
                boolean z11 = ((int) dVarW3.getLong(i33)) != 0;
                int i34 = iC28;
                boolean z12 = ((int) dVarW3.getLong(i34)) != 0;
                int i35 = iC29;
                boolean z13 = ((int) dVarW3.getLong(i35)) != 0;
                iC29 = i35;
                int i36 = iC30;
                int i37 = iC31;
                int i38 = iC32;
                iC31 = i37;
                int i39 = iC33;
                arrayList.add(new j0(strI2, cVarG, strI3, strI4, bVarA, bVarA2, j10, j11, j12, new y5.d(networkRequestCompatL, xVarE, z11, z12, z13, ((int) dVarW3.getLong(i36)) != 0, dVarW3.getLong(i37), dVarW3.getLong(i38), v1.b(dVarW3.getBlob(i39))), i13, aVarD, j13, j14, j15, j16, z10, f0VarF, i22, i24, j17, i27, i28, strI5, bool));
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
            dVarW3.close();
        }
    }

    public static final List i0(String str, g5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        g5.d dVarW3 = _connection.w3(str);
        try {
            int iC = d5.j.c(dVarW3, "id");
            int iC2 = d5.j.c(dVarW3, "state");
            int iC3 = d5.j.c(dVarW3, "worker_class_name");
            int iC4 = d5.j.c(dVarW3, "input_merger_class_name");
            int iC5 = d5.j.c(dVarW3, "input");
            int iC6 = d5.j.c(dVarW3, "output");
            int iC7 = d5.j.c(dVarW3, "initial_delay");
            int iC8 = d5.j.c(dVarW3, "interval_duration");
            int iC9 = d5.j.c(dVarW3, "flex_duration");
            int iC10 = d5.j.c(dVarW3, "run_attempt_count");
            int iC11 = d5.j.c(dVarW3, "backoff_policy");
            int iC12 = d5.j.c(dVarW3, "backoff_delay_duration");
            int iC13 = d5.j.c(dVarW3, "last_enqueue_time");
            int iC14 = d5.j.c(dVarW3, "minimum_retention_duration");
            int iC15 = d5.j.c(dVarW3, "schedule_requested_at");
            int iC16 = d5.j.c(dVarW3, "run_in_foreground");
            int iC17 = d5.j.c(dVarW3, "out_of_quota_policy");
            int iC18 = d5.j.c(dVarW3, "period_count");
            int iC19 = d5.j.c(dVarW3, "generation");
            int iC20 = d5.j.c(dVarW3, "next_schedule_time_override");
            int iC21 = d5.j.c(dVarW3, "next_schedule_time_override_generation");
            int iC22 = d5.j.c(dVarW3, "stop_reason");
            int iC23 = d5.j.c(dVarW3, "trace_tag");
            int iC24 = d5.j.c(dVarW3, "backoff_on_system_interruptions");
            int iC25 = d5.j.c(dVarW3, "required_network_type");
            int iC26 = d5.j.c(dVarW3, "required_network_request");
            int iC27 = d5.j.c(dVarW3, "requires_charging");
            int iC28 = d5.j.c(dVarW3, "requires_device_idle");
            int iC29 = d5.j.c(dVarW3, "requires_battery_not_low");
            int iC30 = d5.j.c(dVarW3, "requires_storage_not_low");
            int iC31 = d5.j.c(dVarW3, "trigger_content_update_delay");
            int iC32 = d5.j.c(dVarW3, "trigger_max_content_delay");
            int iC33 = d5.j.c(dVarW3, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (dVarW3.n3()) {
                String strI2 = dVarW3.I2(iC);
                int i10 = iC14;
                ArrayList arrayList2 = arrayList;
                y5.o0.c cVarG = v1.g((int) dVarW3.getLong(iC2));
                String strI3 = dVarW3.I2(iC3);
                String strI4 = dVarW3.I2(iC4);
                byte[] blob = dVarW3.getBlob(iC5);
                androidx.work.b.Companion companion = androidx.work.b.INSTANCE;
                androidx.work.b bVarA = companion.a(blob);
                androidx.work.b bVarA2 = companion.a(dVarW3.getBlob(iC6));
                long j10 = dVarW3.getLong(iC7);
                long j11 = dVarW3.getLong(iC8);
                long j12 = dVarW3.getLong(iC9);
                int i11 = (int) dVarW3.getLong(iC10);
                int i12 = iC2;
                int i13 = iC3;
                y5.a aVarD = v1.d((int) dVarW3.getLong(iC11));
                long j13 = dVarW3.getLong(iC12);
                long j14 = dVarW3.getLong(iC13);
                long j15 = dVarW3.getLong(i10);
                int i14 = iC15;
                long j16 = dVarW3.getLong(i14);
                int i15 = iC;
                int i16 = iC16;
                boolean z10 = ((int) dVarW3.getLong(i16)) != 0;
                int i17 = iC17;
                int i18 = iC4;
                y5.f0 f0VarF = v1.f((int) dVarW3.getLong(i17));
                int i19 = iC18;
                int i20 = iC5;
                int i21 = (int) dVarW3.getLong(i19);
                int i22 = iC19;
                int i23 = (int) dVarW3.getLong(i22);
                int i24 = iC20;
                long j17 = dVarW3.getLong(i24);
                int i25 = iC21;
                int i26 = (int) dVarW3.getLong(i25);
                int i27 = iC22;
                int i28 = (int) dVarW3.getLong(i27);
                int i29 = iC23;
                Boolean boolValueOf = null;
                String strI5 = dVarW3.isNull(i29) ? null : dVarW3.I2(i29);
                int i30 = iC24;
                Integer numValueOf = dVarW3.isNull(i30) ? null : Integer.valueOf((int) dVarW3.getLong(i30));
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                int i31 = iC25;
                Boolean bool = boolValueOf;
                y5.x xVarE = v1.e((int) dVarW3.getLong(i31));
                int i32 = iC26;
                NetworkRequestCompat networkRequestCompatL = v1.l(dVarW3.getBlob(i32));
                iC25 = i31;
                iC26 = i32;
                int i33 = iC27;
                boolean z11 = ((int) dVarW3.getLong(i33)) != 0;
                iC27 = i33;
                int i34 = iC28;
                boolean z12 = ((int) dVarW3.getLong(i34)) != 0;
                int i35 = iC29;
                boolean z13 = ((int) dVarW3.getLong(i35)) != 0;
                iC29 = i35;
                int i36 = iC30;
                int i37 = iC31;
                int i38 = iC32;
                int i39 = iC33;
                iC33 = i39;
                arrayList2.add(new j0(strI2, cVarG, strI3, strI4, bVarA, bVarA2, j10, j11, j12, new y5.d(networkRequestCompatL, xVarE, z11, z12, z13, ((int) dVarW3.getLong(i36)) != 0, dVarW3.getLong(i37), dVarW3.getLong(i38), v1.b(dVarW3.getBlob(i39))), i11, aVarD, j13, j14, j15, j16, z10, f0VarF, i21, i23, j17, i26, i28, strI5, bool));
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
            dVarW3.close();
        }
    }

    public static final List j0(String str, String str2, g5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        g5.d dVarW3 = _connection.w3(str);
        try {
            dVarW3.m0(1, str2);
            ArrayList arrayList = new ArrayList();
            while (dVarW3.n3()) {
                arrayList.add(androidx.work.b.INSTANCE.a(dVarW3.getBlob(0)));
            }
            dVarW3.close();
            return arrayList;
        } catch (Throwable th2) {
            dVarW3.close();
            throw th2;
        }
    }

    public static final List k0(String str, long j10, g5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        g5.d dVarW3 = _connection.w3(str);
        try {
            dVarW3.B(1, j10);
            int iC = d5.j.c(dVarW3, "id");
            int iC2 = d5.j.c(dVarW3, "state");
            int iC3 = d5.j.c(dVarW3, "worker_class_name");
            int iC4 = d5.j.c(dVarW3, "input_merger_class_name");
            int iC5 = d5.j.c(dVarW3, "input");
            int iC6 = d5.j.c(dVarW3, "output");
            int iC7 = d5.j.c(dVarW3, "initial_delay");
            int iC8 = d5.j.c(dVarW3, "interval_duration");
            int iC9 = d5.j.c(dVarW3, "flex_duration");
            int iC10 = d5.j.c(dVarW3, "run_attempt_count");
            int iC11 = d5.j.c(dVarW3, "backoff_policy");
            int iC12 = d5.j.c(dVarW3, "backoff_delay_duration");
            int iC13 = d5.j.c(dVarW3, "last_enqueue_time");
            int iC14 = d5.j.c(dVarW3, "minimum_retention_duration");
            int iC15 = d5.j.c(dVarW3, "schedule_requested_at");
            int iC16 = d5.j.c(dVarW3, "run_in_foreground");
            int iC17 = d5.j.c(dVarW3, "out_of_quota_policy");
            int iC18 = d5.j.c(dVarW3, "period_count");
            int iC19 = d5.j.c(dVarW3, "generation");
            int iC20 = d5.j.c(dVarW3, "next_schedule_time_override");
            int iC21 = d5.j.c(dVarW3, "next_schedule_time_override_generation");
            int iC22 = d5.j.c(dVarW3, "stop_reason");
            int iC23 = d5.j.c(dVarW3, "trace_tag");
            int iC24 = d5.j.c(dVarW3, "backoff_on_system_interruptions");
            int iC25 = d5.j.c(dVarW3, "required_network_type");
            int iC26 = d5.j.c(dVarW3, "required_network_request");
            int iC27 = d5.j.c(dVarW3, "requires_charging");
            int iC28 = d5.j.c(dVarW3, "requires_device_idle");
            int iC29 = d5.j.c(dVarW3, "requires_battery_not_low");
            int iC30 = d5.j.c(dVarW3, "requires_storage_not_low");
            int iC31 = d5.j.c(dVarW3, "trigger_content_update_delay");
            int iC32 = d5.j.c(dVarW3, "trigger_max_content_delay");
            int iC33 = d5.j.c(dVarW3, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (dVarW3.n3()) {
                String strI2 = dVarW3.I2(iC);
                int i10 = iC13;
                int i11 = iC14;
                y5.o0.c cVarG = v1.g((int) dVarW3.getLong(iC2));
                String strI3 = dVarW3.I2(iC3);
                String strI4 = dVarW3.I2(iC4);
                byte[] blob = dVarW3.getBlob(iC5);
                androidx.work.b.Companion companion = androidx.work.b.INSTANCE;
                androidx.work.b bVarA = companion.a(blob);
                androidx.work.b bVarA2 = companion.a(dVarW3.getBlob(iC6));
                long j11 = dVarW3.getLong(iC7);
                long j12 = dVarW3.getLong(iC8);
                long j13 = dVarW3.getLong(iC9);
                int i12 = (int) dVarW3.getLong(iC10);
                int i13 = iC;
                int i14 = iC2;
                y5.a aVarD = v1.d((int) dVarW3.getLong(iC11));
                long j14 = dVarW3.getLong(iC12);
                long j15 = dVarW3.getLong(i10);
                long j16 = dVarW3.getLong(i11);
                int i15 = iC15;
                long j17 = dVarW3.getLong(i15);
                iC15 = i15;
                int i16 = iC16;
                int i17 = iC3;
                boolean z10 = ((int) dVarW3.getLong(i16)) != 0;
                int i18 = iC17;
                int i19 = iC4;
                y5.f0 f0VarF = v1.f((int) dVarW3.getLong(i18));
                int i20 = iC18;
                int i21 = (int) dVarW3.getLong(i20);
                int i22 = iC19;
                int i23 = (int) dVarW3.getLong(i22);
                int i24 = iC20;
                long j18 = dVarW3.getLong(i24);
                int i25 = iC21;
                int i26 = (int) dVarW3.getLong(i25);
                iC21 = i25;
                iC22 = iC22;
                int i27 = (int) dVarW3.getLong(iC22);
                int i28 = iC23;
                Boolean boolValueOf = null;
                String strI5 = dVarW3.isNull(i28) ? null : dVarW3.I2(i28);
                int i29 = iC24;
                Integer numValueOf = dVarW3.isNull(i29) ? null : Integer.valueOf((int) dVarW3.getLong(i29));
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                Boolean bool = boolValueOf;
                int i30 = iC25;
                y5.x xVarE = v1.e((int) dVarW3.getLong(i30));
                int i31 = iC26;
                NetworkRequestCompat networkRequestCompatL = v1.l(dVarW3.getBlob(i31));
                int i32 = iC27;
                boolean z11 = ((int) dVarW3.getLong(i32)) != 0;
                int i33 = iC28;
                boolean z12 = ((int) dVarW3.getLong(i33)) != 0;
                int i34 = iC29;
                boolean z13 = ((int) dVarW3.getLong(i34)) != 0;
                iC29 = i34;
                int i35 = iC30;
                int i36 = iC31;
                int i37 = iC32;
                iC31 = i36;
                int i38 = iC33;
                arrayList.add(new j0(strI2, cVarG, strI3, strI4, bVarA, bVarA2, j11, j12, j13, new y5.d(networkRequestCompatL, xVarE, z11, z12, z13, ((int) dVarW3.getLong(i35)) != 0, dVarW3.getLong(i36), dVarW3.getLong(i37), v1.b(dVarW3.getBlob(i38))), i12, aVarD, j14, j15, j16, j17, z10, f0VarF, i21, i23, j18, i26, i27, strI5, bool));
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
            dVarW3.close();
        }
    }

    public static final List l0(String str, g5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        g5.d dVarW3 = _connection.w3(str);
        try {
            int iC = d5.j.c(dVarW3, "id");
            int iC2 = d5.j.c(dVarW3, "state");
            int iC3 = d5.j.c(dVarW3, "worker_class_name");
            int iC4 = d5.j.c(dVarW3, "input_merger_class_name");
            int iC5 = d5.j.c(dVarW3, "input");
            int iC6 = d5.j.c(dVarW3, "output");
            int iC7 = d5.j.c(dVarW3, "initial_delay");
            int iC8 = d5.j.c(dVarW3, "interval_duration");
            int iC9 = d5.j.c(dVarW3, "flex_duration");
            int iC10 = d5.j.c(dVarW3, "run_attempt_count");
            int iC11 = d5.j.c(dVarW3, "backoff_policy");
            int iC12 = d5.j.c(dVarW3, "backoff_delay_duration");
            int iC13 = d5.j.c(dVarW3, "last_enqueue_time");
            int iC14 = d5.j.c(dVarW3, "minimum_retention_duration");
            int iC15 = d5.j.c(dVarW3, "schedule_requested_at");
            int iC16 = d5.j.c(dVarW3, "run_in_foreground");
            int iC17 = d5.j.c(dVarW3, "out_of_quota_policy");
            int iC18 = d5.j.c(dVarW3, "period_count");
            int iC19 = d5.j.c(dVarW3, "generation");
            int iC20 = d5.j.c(dVarW3, "next_schedule_time_override");
            int iC21 = d5.j.c(dVarW3, "next_schedule_time_override_generation");
            int iC22 = d5.j.c(dVarW3, "stop_reason");
            int iC23 = d5.j.c(dVarW3, "trace_tag");
            int iC24 = d5.j.c(dVarW3, "backoff_on_system_interruptions");
            int iC25 = d5.j.c(dVarW3, "required_network_type");
            int iC26 = d5.j.c(dVarW3, "required_network_request");
            int iC27 = d5.j.c(dVarW3, "requires_charging");
            int iC28 = d5.j.c(dVarW3, "requires_device_idle");
            int iC29 = d5.j.c(dVarW3, "requires_battery_not_low");
            int iC30 = d5.j.c(dVarW3, "requires_storage_not_low");
            int iC31 = d5.j.c(dVarW3, "trigger_content_update_delay");
            int iC32 = d5.j.c(dVarW3, "trigger_max_content_delay");
            int iC33 = d5.j.c(dVarW3, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (dVarW3.n3()) {
                String strI2 = dVarW3.I2(iC);
                int i10 = iC14;
                ArrayList arrayList2 = arrayList;
                y5.o0.c cVarG = v1.g((int) dVarW3.getLong(iC2));
                String strI3 = dVarW3.I2(iC3);
                String strI4 = dVarW3.I2(iC4);
                byte[] blob = dVarW3.getBlob(iC5);
                androidx.work.b.Companion companion = androidx.work.b.INSTANCE;
                androidx.work.b bVarA = companion.a(blob);
                androidx.work.b bVarA2 = companion.a(dVarW3.getBlob(iC6));
                long j10 = dVarW3.getLong(iC7);
                long j11 = dVarW3.getLong(iC8);
                long j12 = dVarW3.getLong(iC9);
                int i11 = (int) dVarW3.getLong(iC10);
                int i12 = iC2;
                int i13 = iC3;
                y5.a aVarD = v1.d((int) dVarW3.getLong(iC11));
                long j13 = dVarW3.getLong(iC12);
                long j14 = dVarW3.getLong(iC13);
                long j15 = dVarW3.getLong(i10);
                int i14 = iC15;
                long j16 = dVarW3.getLong(i14);
                int i15 = iC;
                int i16 = iC16;
                boolean z10 = ((int) dVarW3.getLong(i16)) != 0;
                int i17 = iC17;
                int i18 = iC4;
                y5.f0 f0VarF = v1.f((int) dVarW3.getLong(i17));
                int i19 = iC18;
                int i20 = iC5;
                int i21 = (int) dVarW3.getLong(i19);
                int i22 = iC19;
                int i23 = (int) dVarW3.getLong(i22);
                int i24 = iC20;
                long j17 = dVarW3.getLong(i24);
                int i25 = iC21;
                int i26 = (int) dVarW3.getLong(i25);
                int i27 = iC22;
                int i28 = (int) dVarW3.getLong(i27);
                int i29 = iC23;
                Boolean boolValueOf = null;
                String strI5 = dVarW3.isNull(i29) ? null : dVarW3.I2(i29);
                int i30 = iC24;
                Integer numValueOf = dVarW3.isNull(i30) ? null : Integer.valueOf((int) dVarW3.getLong(i30));
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                int i31 = iC25;
                Boolean bool = boolValueOf;
                y5.x xVarE = v1.e((int) dVarW3.getLong(i31));
                int i32 = iC26;
                NetworkRequestCompat networkRequestCompatL = v1.l(dVarW3.getBlob(i32));
                iC25 = i31;
                iC26 = i32;
                int i33 = iC27;
                boolean z11 = ((int) dVarW3.getLong(i33)) != 0;
                iC27 = i33;
                int i34 = iC28;
                boolean z12 = ((int) dVarW3.getLong(i34)) != 0;
                int i35 = iC29;
                boolean z13 = ((int) dVarW3.getLong(i35)) != 0;
                iC29 = i35;
                int i36 = iC30;
                int i37 = iC31;
                int i38 = iC32;
                int i39 = iC33;
                iC33 = i39;
                arrayList2.add(new j0(strI2, cVarG, strI3, strI4, bVarA, bVarA2, j10, j11, j12, new y5.d(networkRequestCompatL, xVarE, z11, z12, z13, ((int) dVarW3.getLong(i36)) != 0, dVarW3.getLong(i37), dVarW3.getLong(i38), v1.b(dVarW3.getBlob(i39))), i11, aVarD, j13, j14, j15, j16, z10, f0VarF, i21, i23, j17, i26, i28, strI5, bool));
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
            dVarW3.close();
        }
    }

    public static final List m0(String str, g5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        g5.d dVarW3 = _connection.w3(str);
        try {
            int iC = d5.j.c(dVarW3, "id");
            int iC2 = d5.j.c(dVarW3, "state");
            int iC3 = d5.j.c(dVarW3, "worker_class_name");
            int iC4 = d5.j.c(dVarW3, "input_merger_class_name");
            int iC5 = d5.j.c(dVarW3, "input");
            int iC6 = d5.j.c(dVarW3, "output");
            int iC7 = d5.j.c(dVarW3, "initial_delay");
            int iC8 = d5.j.c(dVarW3, "interval_duration");
            int iC9 = d5.j.c(dVarW3, "flex_duration");
            int iC10 = d5.j.c(dVarW3, "run_attempt_count");
            int iC11 = d5.j.c(dVarW3, "backoff_policy");
            int iC12 = d5.j.c(dVarW3, "backoff_delay_duration");
            int iC13 = d5.j.c(dVarW3, "last_enqueue_time");
            int iC14 = d5.j.c(dVarW3, "minimum_retention_duration");
            int iC15 = d5.j.c(dVarW3, "schedule_requested_at");
            int iC16 = d5.j.c(dVarW3, "run_in_foreground");
            int iC17 = d5.j.c(dVarW3, "out_of_quota_policy");
            int iC18 = d5.j.c(dVarW3, "period_count");
            int iC19 = d5.j.c(dVarW3, "generation");
            int iC20 = d5.j.c(dVarW3, "next_schedule_time_override");
            int iC21 = d5.j.c(dVarW3, "next_schedule_time_override_generation");
            int iC22 = d5.j.c(dVarW3, "stop_reason");
            int iC23 = d5.j.c(dVarW3, "trace_tag");
            int iC24 = d5.j.c(dVarW3, "backoff_on_system_interruptions");
            int iC25 = d5.j.c(dVarW3, "required_network_type");
            int iC26 = d5.j.c(dVarW3, "required_network_request");
            int iC27 = d5.j.c(dVarW3, "requires_charging");
            int iC28 = d5.j.c(dVarW3, "requires_device_idle");
            int iC29 = d5.j.c(dVarW3, "requires_battery_not_low");
            int iC30 = d5.j.c(dVarW3, "requires_storage_not_low");
            int iC31 = d5.j.c(dVarW3, "trigger_content_update_delay");
            int iC32 = d5.j.c(dVarW3, "trigger_max_content_delay");
            int iC33 = d5.j.c(dVarW3, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (dVarW3.n3()) {
                String strI2 = dVarW3.I2(iC);
                int i10 = iC14;
                ArrayList arrayList2 = arrayList;
                y5.o0.c cVarG = v1.g((int) dVarW3.getLong(iC2));
                String strI3 = dVarW3.I2(iC3);
                String strI4 = dVarW3.I2(iC4);
                byte[] blob = dVarW3.getBlob(iC5);
                androidx.work.b.Companion companion = androidx.work.b.INSTANCE;
                androidx.work.b bVarA = companion.a(blob);
                androidx.work.b bVarA2 = companion.a(dVarW3.getBlob(iC6));
                long j10 = dVarW3.getLong(iC7);
                long j11 = dVarW3.getLong(iC8);
                long j12 = dVarW3.getLong(iC9);
                int i11 = (int) dVarW3.getLong(iC10);
                int i12 = iC2;
                int i13 = iC3;
                y5.a aVarD = v1.d((int) dVarW3.getLong(iC11));
                long j13 = dVarW3.getLong(iC12);
                long j14 = dVarW3.getLong(iC13);
                long j15 = dVarW3.getLong(i10);
                int i14 = iC15;
                long j16 = dVarW3.getLong(i14);
                int i15 = iC;
                int i16 = iC16;
                boolean z10 = ((int) dVarW3.getLong(i16)) != 0;
                int i17 = iC17;
                int i18 = iC4;
                y5.f0 f0VarF = v1.f((int) dVarW3.getLong(i17));
                int i19 = iC18;
                int i20 = iC5;
                int i21 = (int) dVarW3.getLong(i19);
                int i22 = iC19;
                int i23 = (int) dVarW3.getLong(i22);
                int i24 = iC20;
                long j17 = dVarW3.getLong(i24);
                int i25 = iC21;
                int i26 = (int) dVarW3.getLong(i25);
                int i27 = iC22;
                int i28 = (int) dVarW3.getLong(i27);
                int i29 = iC23;
                Boolean boolValueOf = null;
                String strI5 = dVarW3.isNull(i29) ? null : dVarW3.I2(i29);
                int i30 = iC24;
                Integer numValueOf = dVarW3.isNull(i30) ? null : Integer.valueOf((int) dVarW3.getLong(i30));
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                int i31 = iC25;
                Boolean bool = boolValueOf;
                y5.x xVarE = v1.e((int) dVarW3.getLong(i31));
                int i32 = iC26;
                NetworkRequestCompat networkRequestCompatL = v1.l(dVarW3.getBlob(i32));
                iC25 = i31;
                iC26 = i32;
                int i33 = iC27;
                boolean z11 = ((int) dVarW3.getLong(i33)) != 0;
                iC27 = i33;
                int i34 = iC28;
                boolean z12 = ((int) dVarW3.getLong(i34)) != 0;
                int i35 = iC29;
                boolean z13 = ((int) dVarW3.getLong(i35)) != 0;
                iC29 = i35;
                int i36 = iC30;
                int i37 = iC31;
                int i38 = iC32;
                int i39 = iC33;
                iC33 = i39;
                arrayList2.add(new j0(strI2, cVarG, strI3, strI4, bVarA, bVarA2, j10, j11, j12, new y5.d(networkRequestCompatL, xVarE, z11, z12, z13, ((int) dVarW3.getLong(i36)) != 0, dVarW3.getLong(i37), dVarW3.getLong(i38), v1.b(dVarW3.getBlob(i39))), i11, aVarD, j13, j14, j15, j16, z10, f0VarF, i21, i23, j17, i26, i28, strI5, bool));
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
            dVarW3.close();
        }
    }

    public static final y5.o0.c n0(String str, String str2, g5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        g5.d dVarW3 = _connection.w3(str);
        try {
            dVarW3.m0(1, str2);
            y5.o0.c cVarG = null;
            if (dVarW3.n3()) {
                Integer numValueOf = dVarW3.isNull(0) ? null : Integer.valueOf((int) dVarW3.getLong(0));
                if (numValueOf != null) {
                    cVarG = v1.g(numValueOf.intValue());
                }
            }
            return cVarG;
        } finally {
            dVarW3.close();
        }
    }

    public static final List o0(String str, String str2, g5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        g5.d dVarW3 = _connection.w3(str);
        try {
            dVarW3.m0(1, str2);
            ArrayList arrayList = new ArrayList();
            while (dVarW3.n3()) {
                arrayList.add(dVarW3.I2(0));
            }
            dVarW3.close();
            return arrayList;
        } catch (Throwable th2) {
            dVarW3.close();
            throw th2;
        }
    }

    public static final List p0(String str, String str2, g5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        g5.d dVarW3 = _connection.w3(str);
        try {
            dVarW3.m0(1, str2);
            ArrayList arrayList = new ArrayList();
            while (dVarW3.n3()) {
                arrayList.add(dVarW3.I2(0));
            }
            dVarW3.close();
            return arrayList;
        } catch (Throwable th2) {
            dVarW3.close();
            throw th2;
        }
    }

    public static final j0 q0(String str, String str2, g5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        g5.d dVarW3 = _connection.w3(str);
        try {
            dVarW3.m0(1, str2);
            int iC = d5.j.c(dVarW3, "id");
            int iC2 = d5.j.c(dVarW3, "state");
            int iC3 = d5.j.c(dVarW3, "worker_class_name");
            int iC4 = d5.j.c(dVarW3, "input_merger_class_name");
            int iC5 = d5.j.c(dVarW3, "input");
            int iC6 = d5.j.c(dVarW3, "output");
            int iC7 = d5.j.c(dVarW3, "initial_delay");
            int iC8 = d5.j.c(dVarW3, "interval_duration");
            int iC9 = d5.j.c(dVarW3, "flex_duration");
            int iC10 = d5.j.c(dVarW3, "run_attempt_count");
            int iC11 = d5.j.c(dVarW3, "backoff_policy");
            int iC12 = d5.j.c(dVarW3, "backoff_delay_duration");
            int iC13 = d5.j.c(dVarW3, "last_enqueue_time");
            int iC14 = d5.j.c(dVarW3, "minimum_retention_duration");
            int iC15 = d5.j.c(dVarW3, "schedule_requested_at");
            int iC16 = d5.j.c(dVarW3, "run_in_foreground");
            int iC17 = d5.j.c(dVarW3, "out_of_quota_policy");
            int iC18 = d5.j.c(dVarW3, "period_count");
            int iC19 = d5.j.c(dVarW3, "generation");
            int iC20 = d5.j.c(dVarW3, "next_schedule_time_override");
            int iC21 = d5.j.c(dVarW3, "next_schedule_time_override_generation");
            int iC22 = d5.j.c(dVarW3, "stop_reason");
            int iC23 = d5.j.c(dVarW3, "trace_tag");
            int iC24 = d5.j.c(dVarW3, "backoff_on_system_interruptions");
            int iC25 = d5.j.c(dVarW3, "required_network_type");
            int iC26 = d5.j.c(dVarW3, "required_network_request");
            int iC27 = d5.j.c(dVarW3, "requires_charging");
            int iC28 = d5.j.c(dVarW3, "requires_device_idle");
            int iC29 = d5.j.c(dVarW3, "requires_battery_not_low");
            int iC30 = d5.j.c(dVarW3, "requires_storage_not_low");
            int iC31 = d5.j.c(dVarW3, "trigger_content_update_delay");
            int iC32 = d5.j.c(dVarW3, "trigger_max_content_delay");
            int iC33 = d5.j.c(dVarW3, "content_uri_triggers");
            j0 j0Var = null;
            Boolean boolValueOf = null;
            if (dVarW3.n3()) {
                String strI2 = dVarW3.I2(iC);
                y5.o0.c cVarG = v1.g((int) dVarW3.getLong(iC2));
                String strI3 = dVarW3.I2(iC3);
                String strI4 = dVarW3.I2(iC4);
                byte[] blob = dVarW3.getBlob(iC5);
                androidx.work.b.Companion companion = androidx.work.b.INSTANCE;
                androidx.work.b bVarA = companion.a(blob);
                androidx.work.b bVarA2 = companion.a(dVarW3.getBlob(iC6));
                long j10 = dVarW3.getLong(iC7);
                long j11 = dVarW3.getLong(iC8);
                long j12 = dVarW3.getLong(iC9);
                int i10 = (int) dVarW3.getLong(iC10);
                y5.a aVarD = v1.d((int) dVarW3.getLong(iC11));
                long j13 = dVarW3.getLong(iC12);
                long j14 = dVarW3.getLong(iC13);
                long j15 = dVarW3.getLong(iC14);
                long j16 = dVarW3.getLong(iC15);
                boolean z10 = ((int) dVarW3.getLong(iC16)) != 0;
                y5.f0 f0VarF = v1.f((int) dVarW3.getLong(iC17));
                int i11 = (int) dVarW3.getLong(iC18);
                int i12 = (int) dVarW3.getLong(iC19);
                long j17 = dVarW3.getLong(iC20);
                int i13 = (int) dVarW3.getLong(iC21);
                int i14 = (int) dVarW3.getLong(iC22);
                String strI5 = dVarW3.isNull(iC23) ? null : dVarW3.I2(iC23);
                Integer numValueOf = dVarW3.isNull(iC24) ? null : Integer.valueOf((int) dVarW3.getLong(iC24));
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                j0Var = new j0(strI2, cVarG, strI3, strI4, bVarA, bVarA2, j10, j11, j12, new y5.d(v1.l(dVarW3.getBlob(iC26)), v1.e((int) dVarW3.getLong(iC25)), ((int) dVarW3.getLong(iC27)) != 0, ((int) dVarW3.getLong(iC28)) != 0, ((int) dVarW3.getLong(iC29)) != 0, ((int) dVarW3.getLong(iC30)) != 0, dVarW3.getLong(iC31), dVarW3.getLong(iC32), v1.b(dVarW3.getBlob(iC33))), i10, aVarD, j13, j14, j15, j16, z10, f0VarF, i11, i12, j17, i13, i14, strI5, boolValueOf);
            }
            return j0Var;
        } finally {
            dVarW3.close();
        }
    }

    public static final List r0(String str, String str2, g5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        g5.d dVarW3 = _connection.w3(str);
        try {
            dVarW3.m0(1, str2);
            ArrayList arrayList = new ArrayList();
            while (dVarW3.n3()) {
                arrayList.add(new j0.IdAndState(dVarW3.I2(0), v1.g((int) dVarW3.getLong(1))));
            }
            dVarW3.close();
            return arrayList;
        } catch (Throwable th2) {
            dVarW3.close();
            throw th2;
        }
    }

    public static final boolean s0(String str, g5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        g5.d dVarW3 = _connection.w3(str);
        try {
            boolean z10 = false;
            if (dVarW3.n3() && ((int) dVarW3.getLong(0)) != 0) {
                z10 = true;
            }
            return z10;
        } finally {
            dVarW3.close();
        }
    }

    public static final Unit t0(String str, String str2, g5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        g5.d dVarW3 = _connection.w3(str);
        try {
            dVarW3.m0(1, str2);
            dVarW3.n3();
            return Unit.f21506a;
        } finally {
            dVarW3.close();
        }
    }

    public static final int u0(String str, String str2, g5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        g5.d dVarW3 = _connection.w3(str);
        try {
            dVarW3.m0(1, str2);
            dVarW3.n3();
            return d5.i.b(_connection);
        } finally {
            dVarW3.close();
        }
    }

    public static final Unit v0(n1 n1Var, j0 j0Var, g5.b _connection) throws Exception {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        n1Var.__insertAdapterOfWorkSpec.d(_connection, j0Var);
        return Unit.f21506a;
    }

    public static final int w0(String str, long j10, String str2, g5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        g5.d dVarW3 = _connection.w3(str);
        try {
            dVarW3.B(1, j10);
            dVarW3.m0(2, str2);
            dVarW3.n3();
            return d5.i.b(_connection);
        } finally {
            dVarW3.close();
        }
    }

    public static final int x0(String str, g5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        g5.d dVarW3 = _connection.w3(str);
        try {
            dVarW3.n3();
            return d5.i.b(_connection);
        } finally {
            dVarW3.close();
        }
    }

    public static final Unit y0(String str, String str2, int i10, g5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        g5.d dVarW3 = _connection.w3(str);
        try {
            dVarW3.m0(1, str2);
            dVarW3.B(2, i10);
            dVarW3.n3();
            return Unit.f21506a;
        } finally {
            dVarW3.close();
        }
    }

    public static final int z0(String str, String str2, g5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        g5.d dVarW3 = _connection.w3(str);
        try {
            dVarW3.m0(1, str2);
            dVarW3.n3();
            return d5.i.b(_connection);
        } finally {
            dVarW3.close();
        }
    }

    @Override // g6.k0
    public int A() {
        final String str = "Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)";
        return ((Number) d5.a.c(this.__db, true, false, new Function1() { // from class: g6.h1
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(n1.e0(str, (g5.b) obj));
            }
        })).intValue();
    }

    @Override // g6.k0
    public void B(@NotNull final String id2, final int overrideGeneration) {
        Intrinsics.checkNotNullParameter(id2, "id");
        final String str = "UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)";
        d5.a.c(this.__db, false, true, new Function1() { // from class: g6.y0
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n1.y0(str, id2, overrideGeneration, (g5.b) obj);
            }
        });
    }

    @Override // g6.k0
    public void a(@NotNull final String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        final String str = "DELETE FROM workspec WHERE id=?";
        d5.a.c(this.__db, false, true, new Function1() { // from class: g6.i1
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n1.f0(str, id2, (g5.b) obj);
            }
        });
    }

    @Override // g6.k0
    public void b(@NotNull final String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        final String str = "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
        d5.a.c(this.__db, false, true, new Function1() { // from class: g6.a1
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n1.t0(str, id2, (g5.b) obj);
            }
        });
    }

    @Override // g6.k0
    @NotNull
    public List<j0> c(final long startingAt) {
        final String str = "SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC";
        return (List) d5.a.c(this.__db, true, false, new Function1() { // from class: g6.m0
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n1.k0(str, startingAt, (g5.b) obj);
            }
        });
    }

    @Override // g6.k0
    public void d(@NotNull final String id2, final int stopReason) {
        Intrinsics.checkNotNullParameter(id2, "id");
        final String str = "UPDATE workspec SET stop_reason=? WHERE id=?";
        d5.a.c(this.__db, false, true, new Function1() { // from class: g6.g1
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n1.E0(str, stopReason, id2, (g5.b) obj);
            }
        });
    }

    @Override // g6.k0
    @NotNull
    public List<j0> e() {
        final String str = "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1";
        return (List) d5.a.c(this.__db, true, false, new Function1() { // from class: g6.n0
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n1.m0(str, (g5.b) obj);
            }
        });
    }

    @Override // g6.k0
    @NotNull
    public List<String> f(@NotNull final String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        final String str = "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)";
        return (List) d5.a.c(this.__db, true, false, new Function1() { // from class: g6.t0
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n1.o0(str, name, (g5.b) obj);
            }
        });
    }

    @Override // g6.k0
    @Nullable
    public y5.o0.c g(@NotNull final String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        final String str = "SELECT state FROM workspec WHERE id=?";
        return (y5.o0.c) d5.a.c(this.__db, true, false, new Function1() { // from class: g6.s0
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n1.n0(str, id2, (g5.b) obj);
            }
        });
    }

    @Override // g6.k0
    @Nullable
    public j0 h(@NotNull final String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        final String str = "SELECT * FROM workspec WHERE id=?";
        return (j0) d5.a.c(this.__db, true, false, new Function1() { // from class: g6.l0
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n1.q0(str, id2, (g5.b) obj);
            }
        });
    }

    @Override // g6.k0
    public int i(@NotNull final String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        final String str = "UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?";
        return ((Number) d5.a.c(this.__db, false, true, new Function1() { // from class: g6.u0
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(n1.A0(str, id2, (g5.b) obj));
            }
        })).intValue();
    }

    @Override // g6.k0
    public int j(@NotNull final y5.o0.c state, @NotNull final String id2) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(id2, "id");
        final String str = "UPDATE workspec SET state=? WHERE id=?";
        return ((Number) d5.a.c(this.__db, false, true, new Function1() { // from class: g6.r0
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(n1.D0(str, state, id2, (g5.b) obj));
            }
        })).intValue();
    }

    @Override // g6.k0
    @NotNull
    public List<String> k(@NotNull final String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        final String str = "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)";
        return (List) d5.a.c(this.__db, true, false, new Function1() { // from class: g6.b1
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n1.p0(str, tag, (g5.b) obj);
            }
        });
    }

    @Override // g6.k0
    @NotNull
    public List<androidx.work.b> l(@NotNull final String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        final String str = "SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)";
        return (List) d5.a.c(this.__db, true, false, new Function1() { // from class: g6.d1
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n1.j0(str, id2, (g5.b) obj);
            }
        });
    }

    @Override // g6.k0
    @NotNull
    public List<j0> m(final int maxLimit) {
        final String str = "SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?";
        return (List) d5.a.c(this.__db, true, false, new Function1() { // from class: g6.k1
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n1.g0(str, maxLimit, (g5.b) obj);
            }
        });
    }

    @Override // g6.k0
    public int n() {
        final String str = "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        return ((Number) d5.a.c(this.__db, false, true, new Function1() { // from class: g6.l1
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(n1.x0(str, (g5.b) obj));
            }
        })).intValue();
    }

    @Override // g6.k0
    public void o(@NotNull final j0 workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        d5.a.c(this.__db, false, true, new Function1() { // from class: g6.w0
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n1.v0(this.f17407a, workSpec, (g5.b) obj);
            }
        });
    }

    @Override // g6.k0
    public void p(@NotNull final j0 workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        d5.a.c(this.__db, false, true, new Function1() { // from class: g6.c1
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n1.F0(this.f17300a, workSpec, (g5.b) obj);
            }
        });
    }

    @Override // g6.k0
    public int q(@NotNull final String id2, final long startTime) {
        Intrinsics.checkNotNullParameter(id2, "id");
        final String str = "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        return ((Number) d5.a.c(this.__db, false, true, new Function1() { // from class: g6.p0
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(n1.w0(str, startTime, id2, (g5.b) obj));
            }
        })).intValue();
    }

    @Override // g6.k0
    @NotNull
    public List<j0.IdAndState> r(@NotNull final String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        final String str = "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)";
        return (List) d5.a.c(this.__db, true, false, new Function1() { // from class: g6.m1
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n1.r0(str, name, (g5.b) obj);
            }
        });
    }

    @Override // g6.k0
    @NotNull
    public dv.h<Boolean> s() {
        final String str = "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1";
        return a5.k.a(this.__db, false, new String[]{"workspec"}, new Function1() { // from class: g6.j1
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(n1.s0(str, (g5.b) obj));
            }
        });
    }

    @Override // g6.k0
    @NotNull
    public List<j0> t(final int schedulerLimit) {
        final String str = "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))";
        return (List) d5.a.c(this.__db, true, false, new Function1() { // from class: g6.o0
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n1.h0(str, schedulerLimit, (g5.b) obj);
            }
        });
    }

    @Override // g6.k0
    public void u(@NotNull final String id2, @NotNull final androidx.work.b output) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(output, "output");
        final String str = "UPDATE workspec SET output=? WHERE id=?";
        d5.a.c(this.__db, false, true, new Function1() { // from class: g6.v0
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n1.C0(str, output, id2, (g5.b) obj);
            }
        });
    }

    @Override // g6.k0
    public void v(@NotNull final String id2, final long enqueueTime) {
        Intrinsics.checkNotNullParameter(id2, "id");
        final String str = "UPDATE workspec SET last_enqueue_time=? WHERE id=?";
        d5.a.c(this.__db, false, true, new Function1() { // from class: g6.x0
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n1.B0(str, enqueueTime, id2, (g5.b) obj);
            }
        });
    }

    @Override // g6.k0
    @NotNull
    public List<j0> w() {
        final String str = "SELECT * FROM workspec WHERE state=1";
        return (List) d5.a.c(this.__db, true, false, new Function1() { // from class: g6.q0
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n1.l0(str, (g5.b) obj);
            }
        });
    }

    @Override // g6.k0
    @NotNull
    public List<j0> x() {
        final String str = "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time";
        return (List) d5.a.c(this.__db, true, false, new Function1() { // from class: g6.f1
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n1.i0(str, (g5.b) obj);
            }
        });
    }

    @Override // g6.k0
    public int y(@NotNull final String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        final String str = "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        return ((Number) d5.a.c(this.__db, false, true, new Function1() { // from class: g6.z0
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(n1.z0(str, id2, (g5.b) obj));
            }
        })).intValue();
    }

    @Override // g6.k0
    public int z(@NotNull final String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        final String str = "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        return ((Number) d5.a.c(this.__db, false, true, new Function1() { // from class: g6.e1
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(n1.u0(str, id2, (g5.b) obj));
            }
        })).intValue();
    }
}
