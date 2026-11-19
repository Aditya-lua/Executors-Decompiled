package androidx.work.impl;

import androidx.work.impl.WorkDatabase_Impl;
import com.github.luben.zstd.BuildConfig;
import d5.o;
import g6.b;
import g6.b0;
import g6.d0;
import g6.g;
import g6.h0;
import g6.k0;
import g6.l;
import g6.m;
import g6.n;
import g6.n1;
import g6.p;
import g6.q1;
import g6.u;
import g6.u1;
import g6.y;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.internal.Intrinsics;
import xu.c;
import y4.a0;
import z5.l0;
import z5.m0;
import z5.n0;
import z5.o0;
import z5.p0;
import z5.q0;
import z5.r0;
import z5.s0;
import zt.h;
import zt.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\b\u0010\tJ)\u0010\r\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\f0\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000b0\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\f2\u001a\u0010\u0013\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000b\u0012\u0004\u0012\u00020\u00100\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00170,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\u001a0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010.R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u001d0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010.R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020 0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010.R\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020#0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010.R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020&0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010.R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020)0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010.R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020<0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010.¨\u0006>"}, d2 = {"Landroidx/work/impl/WorkDatabase_Impl;", "Landroidx/work/impl/WorkDatabase;", "<init>", "()V", "Ly4/a0;", "v0", "()Ly4/a0;", "Landroidx/room/c;", "m", "()Landroidx/room/c;", BuildConfig.FLAVOR, "Lxu/c;", BuildConfig.FLAVOR, "y", "()Ljava/util/Map;", BuildConfig.FLAVOR, "Lb5/a;", "w", "()Ljava/util/Set;", "autoMigrationSpecs", "Lb5/b;", "j", "(Ljava/util/Map;)Ljava/util/List;", "Lg6/k0;", "c0", "()Lg6/k0;", "Lg6/b;", "X", "()Lg6/b;", "Lg6/q1;", "d0", "()Lg6/q1;", "Lg6/p;", "Z", "()Lg6/p;", "Lg6/y;", "a0", "()Lg6/y;", "Lg6/d0;", "b0", "()Lg6/d0;", "Lg6/i;", "Y", "()Lg6/i;", "Lzt/h;", "p", "Lzt/h;", "_workSpecDao", "q", "_dependencyDao", "r", "_workTagDao", "s", "_systemIdInfoDao", "t", "_workNameDao", "u", "_workProgressDao", "v", "_preferenceDao", "Lg6/m;", "_rawWorkInfoDao", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class WorkDatabase_Impl extends WorkDatabase {

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final h<k0> _workSpecDao = i.a(new Function0() { // from class: z5.t0
        @Override // p001kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WorkDatabase_Impl.s0(this.f39116a);
        }
    });

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final h<b> _dependencyDao = i.a(new Function0() { // from class: z5.u0
        @Override // p001kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WorkDatabase_Impl.m0(this.f39117a);
        }
    });

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final h<q1> _workTagDao = i.a(new Function0() { // from class: z5.v0
        @Override // p001kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WorkDatabase_Impl.t0(this.f39121a);
        }
    });

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final h<p> _systemIdInfoDao = i.a(new Function0() { // from class: z5.w0
        @Override // p001kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WorkDatabase_Impl.p0(this.f39125a);
        }
    });

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final h<y> _workNameDao = i.a(new Function0() { // from class: z5.x0
        @Override // p001kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WorkDatabase_Impl.q0(this.f39127a);
        }
    });

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final h<d0> _workProgressDao = i.a(new Function0() { // from class: z5.y0
        @Override // p001kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WorkDatabase_Impl.r0(this.f39129a);
        }
    });

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final h<g6.i> _preferenceDao = i.a(new Function0() { // from class: z5.z0
        @Override // p001kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WorkDatabase_Impl.n0(this.f39132a);
        }
    });

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final h<m> _rawWorkInfoDao = i.a(new Function0() { // from class: z5.a1
        @Override // p001kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WorkDatabase_Impl.o0(this.f38985a);
        }
    });

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\u0006J\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"androidx/work/impl/WorkDatabase_Impl$a", "Ly4/a0;", "Lg5/b;", "connection", BuildConfig.FLAVOR, "a", "(Lg5/b;)V", "b", "f", "g", "i", "h", "Ly4/a0$a;", "j", "(Lg5/b;)Ly4/a0$a;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends a0 {
        public a() {
            super(24, "08b926448d86528e697981ddd30459f7", "149fd8ad55885d3fe3549a37a0163243");
        }

        @Override // y4.a0
        public void a(g5.b connection) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            g5.a.a(connection, "CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            g5.a.a(connection, "CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            g5.a.a(connection, "CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            g5.a.a(connection, "CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `trace_tag` TEXT, `backoff_on_system_interruptions` INTEGER, `required_network_type` INTEGER NOT NULL, `required_network_request` BLOB NOT NULL DEFAULT x'', `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
            g5.a.a(connection, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            g5.a.a(connection, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
            g5.a.a(connection, "CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            g5.a.a(connection, "CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            g5.a.a(connection, "CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            g5.a.a(connection, "CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            g5.a.a(connection, "CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            g5.a.a(connection, "CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            g5.a.a(connection, "CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            g5.a.a(connection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            g5.a.a(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '08b926448d86528e697981ddd30459f7')");
        }

        @Override // y4.a0
        public void b(g5.b connection) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            g5.a.a(connection, "DROP TABLE IF EXISTS `Dependency`");
            g5.a.a(connection, "DROP TABLE IF EXISTS `WorkSpec`");
            g5.a.a(connection, "DROP TABLE IF EXISTS `WorkTag`");
            g5.a.a(connection, "DROP TABLE IF EXISTS `SystemIdInfo`");
            g5.a.a(connection, "DROP TABLE IF EXISTS `WorkName`");
            g5.a.a(connection, "DROP TABLE IF EXISTS `WorkProgress`");
            g5.a.a(connection, "DROP TABLE IF EXISTS `Preference`");
        }

        @Override // y4.a0
        public void f(g5.b connection) {
            Intrinsics.checkNotNullParameter(connection, "connection");
        }

        @Override // y4.a0
        public void g(g5.b connection) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            g5.a.a(connection, "PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.K(connection);
        }

        @Override // y4.a0
        public void h(g5.b connection) {
            Intrinsics.checkNotNullParameter(connection, "connection");
        }

        @Override // y4.a0
        public void i(g5.b connection) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            d5.a.a(connection);
        }

        @Override // y4.a0
        public a0.a j(g5.b connection) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("work_spec_id", new o.a("work_spec_id", "TEXT", true, 1, null, 1));
            linkedHashMap.put("prerequisite_id", new o.a("prerequisite_id", "TEXT", true, 2, null, 1));
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.add(new o.c("WorkSpec", "CASCADE", "CASCADE", p001kotlin.collections.o.d("work_spec_id"), p001kotlin.collections.o.d("id")));
            linkedHashSet.add(new o.c("WorkSpec", "CASCADE", "CASCADE", p001kotlin.collections.o.d("prerequisite_id"), p001kotlin.collections.o.d("id")));
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            linkedHashSet2.add(new o.d("index_Dependency_work_spec_id", false, p001kotlin.collections.o.d("work_spec_id"), p001kotlin.collections.o.d("ASC")));
            linkedHashSet2.add(new o.d("index_Dependency_prerequisite_id", false, p001kotlin.collections.o.d("prerequisite_id"), p001kotlin.collections.o.d("ASC")));
            o oVar = new o("Dependency", linkedHashMap, linkedHashSet, linkedHashSet2);
            o.Companion companion = o.INSTANCE;
            o oVarA = companion.a(connection, "Dependency");
            if (!oVar.equals(oVarA)) {
                return new a0.a(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + oVar + "\n Found:\n" + oVarA);
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("id", new o.a("id", "TEXT", true, 1, null, 1));
            linkedHashMap2.put("state", new o.a("state", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("worker_class_name", new o.a("worker_class_name", "TEXT", true, 0, null, 1));
            linkedHashMap2.put("input_merger_class_name", new o.a("input_merger_class_name", "TEXT", true, 0, null, 1));
            linkedHashMap2.put("input", new o.a("input", "BLOB", true, 0, null, 1));
            linkedHashMap2.put("output", new o.a("output", "BLOB", true, 0, null, 1));
            linkedHashMap2.put("initial_delay", new o.a("initial_delay", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("interval_duration", new o.a("interval_duration", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("flex_duration", new o.a("flex_duration", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("run_attempt_count", new o.a("run_attempt_count", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("backoff_policy", new o.a("backoff_policy", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("backoff_delay_duration", new o.a("backoff_delay_duration", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("last_enqueue_time", new o.a("last_enqueue_time", "INTEGER", true, 0, "-1", 1));
            linkedHashMap2.put("minimum_retention_duration", new o.a("minimum_retention_duration", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("schedule_requested_at", new o.a("schedule_requested_at", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("run_in_foreground", new o.a("run_in_foreground", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("out_of_quota_policy", new o.a("out_of_quota_policy", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("period_count", new o.a("period_count", "INTEGER", true, 0, "0", 1));
            linkedHashMap2.put("generation", new o.a("generation", "INTEGER", true, 0, "0", 1));
            linkedHashMap2.put("next_schedule_time_override", new o.a("next_schedule_time_override", "INTEGER", true, 0, "9223372036854775807", 1));
            linkedHashMap2.put("next_schedule_time_override_generation", new o.a("next_schedule_time_override_generation", "INTEGER", true, 0, "0", 1));
            linkedHashMap2.put("stop_reason", new o.a("stop_reason", "INTEGER", true, 0, "-256", 1));
            linkedHashMap2.put("trace_tag", new o.a("trace_tag", "TEXT", false, 0, null, 1));
            linkedHashMap2.put("backoff_on_system_interruptions", new o.a("backoff_on_system_interruptions", "INTEGER", false, 0, null, 1));
            linkedHashMap2.put("required_network_type", new o.a("required_network_type", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("required_network_request", new o.a("required_network_request", "BLOB", true, 0, "x''", 1));
            linkedHashMap2.put("requires_charging", new o.a("requires_charging", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("requires_device_idle", new o.a("requires_device_idle", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("requires_battery_not_low", new o.a("requires_battery_not_low", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("requires_storage_not_low", new o.a("requires_storage_not_low", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("trigger_content_update_delay", new o.a("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("trigger_max_content_delay", new o.a("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("content_uri_triggers", new o.a("content_uri_triggers", "BLOB", true, 0, null, 1));
            LinkedHashSet linkedHashSet3 = new LinkedHashSet();
            LinkedHashSet linkedHashSet4 = new LinkedHashSet();
            linkedHashSet4.add(new o.d("index_WorkSpec_schedule_requested_at", false, p001kotlin.collections.o.d("schedule_requested_at"), p001kotlin.collections.o.d("ASC")));
            linkedHashSet4.add(new o.d("index_WorkSpec_last_enqueue_time", false, p001kotlin.collections.o.d("last_enqueue_time"), p001kotlin.collections.o.d("ASC")));
            o oVar2 = new o("WorkSpec", linkedHashMap2, linkedHashSet3, linkedHashSet4);
            o oVarA2 = companion.a(connection, "WorkSpec");
            if (!oVar2.equals(oVarA2)) {
                return new a0.a(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + oVar2 + "\n Found:\n" + oVarA2);
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            linkedHashMap3.put("tag", new o.a("tag", "TEXT", true, 1, null, 1));
            linkedHashMap3.put("work_spec_id", new o.a("work_spec_id", "TEXT", true, 2, null, 1));
            LinkedHashSet linkedHashSet5 = new LinkedHashSet();
            linkedHashSet5.add(new o.c("WorkSpec", "CASCADE", "CASCADE", p001kotlin.collections.o.d("work_spec_id"), p001kotlin.collections.o.d("id")));
            LinkedHashSet linkedHashSet6 = new LinkedHashSet();
            linkedHashSet6.add(new o.d("index_WorkTag_work_spec_id", false, p001kotlin.collections.o.d("work_spec_id"), p001kotlin.collections.o.d("ASC")));
            o oVar3 = new o("WorkTag", linkedHashMap3, linkedHashSet5, linkedHashSet6);
            o oVarA3 = companion.a(connection, "WorkTag");
            if (!oVar3.equals(oVarA3)) {
                return new a0.a(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + oVar3 + "\n Found:\n" + oVarA3);
            }
            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
            linkedHashMap4.put("work_spec_id", new o.a("work_spec_id", "TEXT", true, 1, null, 1));
            linkedHashMap4.put("generation", new o.a("generation", "INTEGER", true, 2, "0", 1));
            linkedHashMap4.put("system_id", new o.a("system_id", "INTEGER", true, 0, null, 1));
            LinkedHashSet linkedHashSet7 = new LinkedHashSet();
            linkedHashSet7.add(new o.c("WorkSpec", "CASCADE", "CASCADE", p001kotlin.collections.o.d("work_spec_id"), p001kotlin.collections.o.d("id")));
            o oVar4 = new o("SystemIdInfo", linkedHashMap4, linkedHashSet7, new LinkedHashSet());
            o oVarA4 = companion.a(connection, "SystemIdInfo");
            if (!oVar4.equals(oVarA4)) {
                return new a0.a(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + oVar4 + "\n Found:\n" + oVarA4);
            }
            LinkedHashMap linkedHashMap5 = new LinkedHashMap();
            linkedHashMap5.put("name", new o.a("name", "TEXT", true, 1, null, 1));
            linkedHashMap5.put("work_spec_id", new o.a("work_spec_id", "TEXT", true, 2, null, 1));
            LinkedHashSet linkedHashSet8 = new LinkedHashSet();
            linkedHashSet8.add(new o.c("WorkSpec", "CASCADE", "CASCADE", p001kotlin.collections.o.d("work_spec_id"), p001kotlin.collections.o.d("id")));
            LinkedHashSet linkedHashSet9 = new LinkedHashSet();
            linkedHashSet9.add(new o.d("index_WorkName_work_spec_id", false, p001kotlin.collections.o.d("work_spec_id"), p001kotlin.collections.o.d("ASC")));
            o oVar5 = new o("WorkName", linkedHashMap5, linkedHashSet8, linkedHashSet9);
            o oVarA5 = companion.a(connection, "WorkName");
            if (!oVar5.equals(oVarA5)) {
                return new a0.a(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + oVar5 + "\n Found:\n" + oVarA5);
            }
            LinkedHashMap linkedHashMap6 = new LinkedHashMap();
            linkedHashMap6.put("work_spec_id", new o.a("work_spec_id", "TEXT", true, 1, null, 1));
            linkedHashMap6.put("progress", new o.a("progress", "BLOB", true, 0, null, 1));
            LinkedHashSet linkedHashSet10 = new LinkedHashSet();
            linkedHashSet10.add(new o.c("WorkSpec", "CASCADE", "CASCADE", p001kotlin.collections.o.d("work_spec_id"), p001kotlin.collections.o.d("id")));
            o oVar6 = new o("WorkProgress", linkedHashMap6, linkedHashSet10, new LinkedHashSet());
            o oVarA6 = companion.a(connection, "WorkProgress");
            if (!oVar6.equals(oVarA6)) {
                return new a0.a(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + oVar6 + "\n Found:\n" + oVarA6);
            }
            LinkedHashMap linkedHashMap7 = new LinkedHashMap();
            linkedHashMap7.put("key", new o.a("key", "TEXT", true, 1, null, 1));
            linkedHashMap7.put("long_value", new o.a("long_value", "INTEGER", false, 0, null, 1));
            o oVar7 = new o("Preference", linkedHashMap7, new LinkedHashSet(), new LinkedHashSet());
            o oVarA7 = companion.a(connection, "Preference");
            if (oVar7.equals(oVarA7)) {
                return new a0.a(true, null);
            }
            return new a0.a(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + oVar7 + "\n Found:\n" + oVarA7);
        }
    }

    public static final g m0(WorkDatabase_Impl workDatabase_Impl) {
        return new g(workDatabase_Impl);
    }

    public static final l n0(WorkDatabase_Impl workDatabase_Impl) {
        return new l(workDatabase_Impl);
    }

    public static final n o0(WorkDatabase_Impl workDatabase_Impl) {
        return new n(workDatabase_Impl);
    }

    public static final u p0(WorkDatabase_Impl workDatabase_Impl) {
        return new u(workDatabase_Impl);
    }

    public static final b0 q0(WorkDatabase_Impl workDatabase_Impl) {
        return new b0(workDatabase_Impl);
    }

    public static final h0 r0(WorkDatabase_Impl workDatabase_Impl) {
        return new h0(workDatabase_Impl);
    }

    public static final n1 s0(WorkDatabase_Impl workDatabase_Impl) {
        return new n1(workDatabase_Impl);
    }

    public static final u1 t0(WorkDatabase_Impl workDatabase_Impl) {
        return new u1(workDatabase_Impl);
    }

    @Override // androidx.work.impl.WorkDatabase
    @NotNull
    public b X() {
        return this._dependencyDao.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    @NotNull
    public g6.i Y() {
        return this._preferenceDao.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    @NotNull
    public p Z() {
        return this._systemIdInfoDao.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    @NotNull
    public y a0() {
        return this._workNameDao.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    @NotNull
    public d0 b0() {
        return this._workProgressDao.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    @NotNull
    public k0 c0() {
        return this._workSpecDao.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    @NotNull
    public q1 d0() {
        return this._workTagDao.getValue();
    }

    @Override // y4.u
    @NotNull
    public List<b5.b> j(@NotNull Map<c<? extends b5.a>, ? extends b5.a> autoMigrationSpecs) {
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new z5.k0());
        arrayList.add(new l0());
        arrayList.add(new m0());
        arrayList.add(new n0());
        arrayList.add(new o0());
        arrayList.add(new p0());
        arrayList.add(new q0());
        arrayList.add(new r0());
        arrayList.add(new s0());
        return arrayList;
    }

    @Override // y4.u
    @NotNull
    public androidx.room.c m() {
        return new androidx.room.c(this, new LinkedHashMap(), new LinkedHashMap(), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // y4.u
    @NotNull
    /* JADX INFO: renamed from: v0, reason: merged with bridge method [inline-methods] */
    public a0 n() {
        return new a();
    }

    @Override // y4.u
    @NotNull
    public Set<c<? extends b5.a>> w() {
        return new LinkedHashSet();
    }

    @Override // y4.u
    @NotNull
    public Map<c<?>, List<c<?>>> y() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(p001kotlin.jvm.internal.d0.b(k0.class), n1.INSTANCE.a());
        linkedHashMap.put(p001kotlin.jvm.internal.d0.b(b.class), g.INSTANCE.a());
        linkedHashMap.put(p001kotlin.jvm.internal.d0.b(q1.class), u1.INSTANCE.a());
        linkedHashMap.put(p001kotlin.jvm.internal.d0.b(p.class), u.INSTANCE.a());
        linkedHashMap.put(p001kotlin.jvm.internal.d0.b(y.class), b0.INSTANCE.a());
        linkedHashMap.put(p001kotlin.jvm.internal.d0.b(d0.class), h0.INSTANCE.a());
        linkedHashMap.put(p001kotlin.jvm.internal.d0.b(g6.i.class), l.INSTANCE.a());
        linkedHashMap.put(p001kotlin.jvm.internal.d0.b(m.class), n.INSTANCE.a());
        return linkedHashMap;
    }
}
