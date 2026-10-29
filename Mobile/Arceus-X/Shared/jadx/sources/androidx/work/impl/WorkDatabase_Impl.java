package androidx.work.impl;

import androidx.core.app.NotificationCompat;
import androidx.room.C1075c;
import androidx.work.impl.WorkDatabase_Impl;
import hu.InterfaceC6567c;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7697o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C7731d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p006a5.AbstractC0072b;
import p006a5.InterfaceC0071a;
import p041c5.C1525a;
import p041c5.C1539o;
import p119f5.C5358a;
import p119f5.InterfaceC5359b;
import p120f6.C5366b0;
import p120f6.C5380g;
import p120f6.C5384h0;
import p120f6.C5395l;
import p120f6.C5401n;
import p120f6.C5403n1;
import p120f6.C5422u;
import p120f6.C5424u1;
import p120f6.InterfaceC5365b;
import p120f6.InterfaceC5372d0;
import p120f6.InterfaceC5386i;
import p120f6.InterfaceC5393k0;
import p120f6.InterfaceC5398m;
import p120f6.InterfaceC5407p;
import p120f6.InterfaceC5412q1;
import p120f6.InterfaceC5432y;
import p229jt.C7342i;
import p229jt.InterfaceC7341h;
import p535x4.AbstractC12651a0;
import p567y5.C13062k0;
import p567y5.C13065l0;
import p567y5.C13068m0;
import p567y5.C13071n0;
import p567y5.C13074o0;
import p567y5.C13077p0;
import p567y5.C13080q0;
import p567y5.C13083r0;
import p567y5.C13086s0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\b\u0010\tJ)\u0010\r\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\f0\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000b0\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\f2\u001a\u0010\u0013\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000b\u0012\u0004\u0012\u00020\u00100\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00170,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\u001a0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010.R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u001d0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010.R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020 0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010.R\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020#0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010.R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020&0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010.R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020)0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010.R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020<0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010.¨\u0006>"}, m31665d2 = {"Landroidx/work/impl/WorkDatabase_Impl;", "Landroidx/work/impl/WorkDatabase;", "<init>", "()V", "Lx4/a0;", "v0", "()Lx4/a0;", "Landroidx/room/c;", "m", "()Landroidx/room/c;", "", "Lhu/c;", "", "y", "()Ljava/util/Map;", "", "La5/a;", "w", "()Ljava/util/Set;", "autoMigrationSpecs", "La5/b;", "j", "(Ljava/util/Map;)Ljava/util/List;", "Lf6/k0;", "c0", "()Lf6/k0;", "Lf6/b;", "X", "()Lf6/b;", "Lf6/q1;", "d0", "()Lf6/q1;", "Lf6/p;", "Z", "()Lf6/p;", "Lf6/y;", "a0", "()Lf6/y;", "Lf6/d0;", "b0", "()Lf6/d0;", "Lf6/i;", "Y", "()Lf6/i;", "Ljt/h;", "p", "Ljt/h;", "_workSpecDao", "q", "_dependencyDao", "r", "_workTagDao", "s", "_systemIdInfoDao", "t", "_workNameDao", "u", "_workProgressDao", "v", "_preferenceDao", "Lf6/m;", "_rawWorkInfoDao", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class WorkDatabase_Impl extends WorkDatabase {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7341h<InterfaceC5393k0> _workSpecDao = C7342i.m30456b(new Function0() { // from class: y5.t0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WorkDatabase_Impl.m6369s0(this.f46312a);
        }
    });

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7341h<InterfaceC5365b> _dependencyDao = C7342i.m30456b(new Function0() { // from class: y5.u0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WorkDatabase_Impl.m6363m0(this.f46313a);
        }
    });

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7341h<InterfaceC5412q1> _workTagDao = C7342i.m30456b(new Function0() { // from class: y5.v0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WorkDatabase_Impl.m6370t0(this.f46318a);
        }
    });

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7341h<InterfaceC5407p> _systemIdInfoDao = C7342i.m30456b(new Function0() { // from class: y5.w0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WorkDatabase_Impl.m6366p0(this.f46323a);
        }
    });

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7341h<InterfaceC5432y> _workNameDao = C7342i.m30456b(new Function0() { // from class: y5.x0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WorkDatabase_Impl.m6367q0(this.f46325a);
        }
    });

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7341h<InterfaceC5372d0> _workProgressDao = C7342i.m30456b(new Function0() { // from class: y5.y0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WorkDatabase_Impl.m6368r0(this.f46327a);
        }
    });

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7341h<InterfaceC5386i> _preferenceDao = C7342i.m30456b(new Function0() { // from class: y5.z0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WorkDatabase_Impl.m6364n0(this.f46330a);
        }
    });

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7341h<InterfaceC5398m> _rawWorkInfoDao = C7342i.m30456b(new Function0() { // from class: y5.a1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WorkDatabase_Impl.m6365o0(this.f46161a);
        }
    });

    /* JADX INFO: renamed from: androidx.work.impl.WorkDatabase_Impl$a */
    @Metadata(m31664d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\u0006J\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"androidx/work/impl/WorkDatabase_Impl$a", "Lx4/a0;", "Lf5/b;", "connection", "", "a", "(Lf5/b;)V", "b", "f", "g", "i", "h", "Lx4/a0$a;", "j", "(Lf5/b;)Lx4/a0$a;", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class C1119a extends AbstractC12651a0 {
        public C1119a() {
            super(24, "08b926448d86528e697981ddd30459f7", "149fd8ad55885d3fe3549a37a0163243");
        }

        @Override // p535x4.AbstractC12651a0
        /* JADX INFO: renamed from: a */
        public void mo6378a(InterfaceC5359b connection) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            C5358a.m24693a(connection, "CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            C5358a.m24693a(connection, "CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            C5358a.m24693a(connection, "CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            C5358a.m24693a(connection, "CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `trace_tag` TEXT, `backoff_on_system_interruptions` INTEGER, `required_network_type` INTEGER NOT NULL, `required_network_request` BLOB NOT NULL DEFAULT x'', `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
            C5358a.m24693a(connection, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            C5358a.m24693a(connection, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
            C5358a.m24693a(connection, "CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            C5358a.m24693a(connection, "CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            C5358a.m24693a(connection, "CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            C5358a.m24693a(connection, "CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            C5358a.m24693a(connection, "CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            C5358a.m24693a(connection, "CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            C5358a.m24693a(connection, "CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            C5358a.m24693a(connection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            C5358a.m24693a(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '08b926448d86528e697981ddd30459f7')");
        }

        @Override // p535x4.AbstractC12651a0
        /* JADX INFO: renamed from: b */
        public void mo6379b(InterfaceC5359b connection) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            C5358a.m24693a(connection, "DROP TABLE IF EXISTS `Dependency`");
            C5358a.m24693a(connection, "DROP TABLE IF EXISTS `WorkSpec`");
            C5358a.m24693a(connection, "DROP TABLE IF EXISTS `WorkTag`");
            C5358a.m24693a(connection, "DROP TABLE IF EXISTS `SystemIdInfo`");
            C5358a.m24693a(connection, "DROP TABLE IF EXISTS `WorkName`");
            C5358a.m24693a(connection, "DROP TABLE IF EXISTS `WorkProgress`");
            C5358a.m24693a(connection, "DROP TABLE IF EXISTS `Preference`");
        }

        @Override // p535x4.AbstractC12651a0
        /* JADX INFO: renamed from: f */
        public void mo6380f(InterfaceC5359b connection) {
            Intrinsics.checkNotNullParameter(connection, "connection");
        }

        @Override // p535x4.AbstractC12651a0
        /* JADX INFO: renamed from: g */
        public void mo6381g(InterfaceC5359b connection) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            C5358a.m24693a(connection, "PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.m47259K(connection);
        }

        @Override // p535x4.AbstractC12651a0
        /* JADX INFO: renamed from: h */
        public void mo6382h(InterfaceC5359b connection) {
            Intrinsics.checkNotNullParameter(connection, "connection");
        }

        @Override // p535x4.AbstractC12651a0
        /* JADX INFO: renamed from: i */
        public void mo6383i(InterfaceC5359b connection) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            C1525a.m8063a(connection);
        }

        @Override // p535x4.AbstractC12651a0
        /* JADX INFO: renamed from: j */
        public AbstractC12651a0.a mo6384j(InterfaceC5359b connection) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("work_spec_id", new C1539o.a("work_spec_id", "TEXT", true, 1, null, 1));
            linkedHashMap.put("prerequisite_id", new C1539o.a("prerequisite_id", "TEXT", true, 2, null, 1));
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.add(new C1539o.c("WorkSpec", "CASCADE", "CASCADE", C7697o.m31878d("work_spec_id"), C7697o.m31878d("id")));
            linkedHashSet.add(new C1539o.c("WorkSpec", "CASCADE", "CASCADE", C7697o.m31878d("prerequisite_id"), C7697o.m31878d("id")));
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            linkedHashSet2.add(new C1539o.d("index_Dependency_work_spec_id", false, C7697o.m31878d("work_spec_id"), C7697o.m31878d("ASC")));
            linkedHashSet2.add(new C1539o.d("index_Dependency_prerequisite_id", false, C7697o.m31878d("prerequisite_id"), C7697o.m31878d("ASC")));
            C1539o c1539o = new C1539o("Dependency", linkedHashMap, linkedHashSet, linkedHashSet2);
            C1539o.Companion companion = C1539o.INSTANCE;
            C1539o c1539oM8113a = companion.m8113a(connection, "Dependency");
            if (!c1539o.equals(c1539oM8113a)) {
                return new AbstractC12651a0.a(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + c1539o + "\n Found:\n" + c1539oM8113a);
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("id", new C1539o.a("id", "TEXT", true, 1, null, 1));
            linkedHashMap2.put("state", new C1539o.a("state", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("worker_class_name", new C1539o.a("worker_class_name", "TEXT", true, 0, null, 1));
            linkedHashMap2.put("input_merger_class_name", new C1539o.a("input_merger_class_name", "TEXT", true, 0, null, 1));
            linkedHashMap2.put("input", new C1539o.a("input", "BLOB", true, 0, null, 1));
            linkedHashMap2.put("output", new C1539o.a("output", "BLOB", true, 0, null, 1));
            linkedHashMap2.put("initial_delay", new C1539o.a("initial_delay", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("interval_duration", new C1539o.a("interval_duration", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("flex_duration", new C1539o.a("flex_duration", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("run_attempt_count", new C1539o.a("run_attempt_count", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("backoff_policy", new C1539o.a("backoff_policy", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("backoff_delay_duration", new C1539o.a("backoff_delay_duration", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("last_enqueue_time", new C1539o.a("last_enqueue_time", "INTEGER", true, 0, "-1", 1));
            linkedHashMap2.put("minimum_retention_duration", new C1539o.a("minimum_retention_duration", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("schedule_requested_at", new C1539o.a("schedule_requested_at", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("run_in_foreground", new C1539o.a("run_in_foreground", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("out_of_quota_policy", new C1539o.a("out_of_quota_policy", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("period_count", new C1539o.a("period_count", "INTEGER", true, 0, "0", 1));
            linkedHashMap2.put("generation", new C1539o.a("generation", "INTEGER", true, 0, "0", 1));
            linkedHashMap2.put("next_schedule_time_override", new C1539o.a("next_schedule_time_override", "INTEGER", true, 0, "9223372036854775807", 1));
            linkedHashMap2.put("next_schedule_time_override_generation", new C1539o.a("next_schedule_time_override_generation", "INTEGER", true, 0, "0", 1));
            linkedHashMap2.put("stop_reason", new C1539o.a("stop_reason", "INTEGER", true, 0, "-256", 1));
            linkedHashMap2.put("trace_tag", new C1539o.a("trace_tag", "TEXT", false, 0, null, 1));
            linkedHashMap2.put("backoff_on_system_interruptions", new C1539o.a("backoff_on_system_interruptions", "INTEGER", false, 0, null, 1));
            linkedHashMap2.put("required_network_type", new C1539o.a("required_network_type", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("required_network_request", new C1539o.a("required_network_request", "BLOB", true, 0, "x''", 1));
            linkedHashMap2.put("requires_charging", new C1539o.a("requires_charging", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("requires_device_idle", new C1539o.a("requires_device_idle", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("requires_battery_not_low", new C1539o.a("requires_battery_not_low", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("requires_storage_not_low", new C1539o.a("requires_storage_not_low", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("trigger_content_update_delay", new C1539o.a("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("trigger_max_content_delay", new C1539o.a("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("content_uri_triggers", new C1539o.a("content_uri_triggers", "BLOB", true, 0, null, 1));
            LinkedHashSet linkedHashSet3 = new LinkedHashSet();
            LinkedHashSet linkedHashSet4 = new LinkedHashSet();
            linkedHashSet4.add(new C1539o.d("index_WorkSpec_schedule_requested_at", false, C7697o.m31878d("schedule_requested_at"), C7697o.m31878d("ASC")));
            linkedHashSet4.add(new C1539o.d("index_WorkSpec_last_enqueue_time", false, C7697o.m31878d("last_enqueue_time"), C7697o.m31878d("ASC")));
            C1539o c1539o2 = new C1539o("WorkSpec", linkedHashMap2, linkedHashSet3, linkedHashSet4);
            C1539o c1539oM8113a2 = companion.m8113a(connection, "WorkSpec");
            if (!c1539o2.equals(c1539oM8113a2)) {
                return new AbstractC12651a0.a(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + c1539o2 + "\n Found:\n" + c1539oM8113a2);
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            linkedHashMap3.put("tag", new C1539o.a("tag", "TEXT", true, 1, null, 1));
            linkedHashMap3.put("work_spec_id", new C1539o.a("work_spec_id", "TEXT", true, 2, null, 1));
            LinkedHashSet linkedHashSet5 = new LinkedHashSet();
            linkedHashSet5.add(new C1539o.c("WorkSpec", "CASCADE", "CASCADE", C7697o.m31878d("work_spec_id"), C7697o.m31878d("id")));
            LinkedHashSet linkedHashSet6 = new LinkedHashSet();
            linkedHashSet6.add(new C1539o.d("index_WorkTag_work_spec_id", false, C7697o.m31878d("work_spec_id"), C7697o.m31878d("ASC")));
            C1539o c1539o3 = new C1539o("WorkTag", linkedHashMap3, linkedHashSet5, linkedHashSet6);
            C1539o c1539oM8113a3 = companion.m8113a(connection, "WorkTag");
            if (!c1539o3.equals(c1539oM8113a3)) {
                return new AbstractC12651a0.a(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + c1539o3 + "\n Found:\n" + c1539oM8113a3);
            }
            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
            linkedHashMap4.put("work_spec_id", new C1539o.a("work_spec_id", "TEXT", true, 1, null, 1));
            linkedHashMap4.put("generation", new C1539o.a("generation", "INTEGER", true, 2, "0", 1));
            linkedHashMap4.put("system_id", new C1539o.a("system_id", "INTEGER", true, 0, null, 1));
            LinkedHashSet linkedHashSet7 = new LinkedHashSet();
            linkedHashSet7.add(new C1539o.c("WorkSpec", "CASCADE", "CASCADE", C7697o.m31878d("work_spec_id"), C7697o.m31878d("id")));
            C1539o c1539o4 = new C1539o("SystemIdInfo", linkedHashMap4, linkedHashSet7, new LinkedHashSet());
            C1539o c1539oM8113a4 = companion.m8113a(connection, "SystemIdInfo");
            if (!c1539o4.equals(c1539oM8113a4)) {
                return new AbstractC12651a0.a(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + c1539o4 + "\n Found:\n" + c1539oM8113a4);
            }
            LinkedHashMap linkedHashMap5 = new LinkedHashMap();
            linkedHashMap5.put("name", new C1539o.a("name", "TEXT", true, 1, null, 1));
            linkedHashMap5.put("work_spec_id", new C1539o.a("work_spec_id", "TEXT", true, 2, null, 1));
            LinkedHashSet linkedHashSet8 = new LinkedHashSet();
            linkedHashSet8.add(new C1539o.c("WorkSpec", "CASCADE", "CASCADE", C7697o.m31878d("work_spec_id"), C7697o.m31878d("id")));
            LinkedHashSet linkedHashSet9 = new LinkedHashSet();
            linkedHashSet9.add(new C1539o.d("index_WorkName_work_spec_id", false, C7697o.m31878d("work_spec_id"), C7697o.m31878d("ASC")));
            C1539o c1539o5 = new C1539o("WorkName", linkedHashMap5, linkedHashSet8, linkedHashSet9);
            C1539o c1539oM8113a5 = companion.m8113a(connection, "WorkName");
            if (!c1539o5.equals(c1539oM8113a5)) {
                return new AbstractC12651a0.a(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + c1539o5 + "\n Found:\n" + c1539oM8113a5);
            }
            LinkedHashMap linkedHashMap6 = new LinkedHashMap();
            linkedHashMap6.put("work_spec_id", new C1539o.a("work_spec_id", "TEXT", true, 1, null, 1));
            linkedHashMap6.put(NotificationCompat.CATEGORY_PROGRESS, new C1539o.a(NotificationCompat.CATEGORY_PROGRESS, "BLOB", true, 0, null, 1));
            LinkedHashSet linkedHashSet10 = new LinkedHashSet();
            linkedHashSet10.add(new C1539o.c("WorkSpec", "CASCADE", "CASCADE", C7697o.m31878d("work_spec_id"), C7697o.m31878d("id")));
            C1539o c1539o6 = new C1539o("WorkProgress", linkedHashMap6, linkedHashSet10, new LinkedHashSet());
            C1539o c1539oM8113a6 = companion.m8113a(connection, "WorkProgress");
            if (!c1539o6.equals(c1539oM8113a6)) {
                return new AbstractC12651a0.a(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + c1539o6 + "\n Found:\n" + c1539oM8113a6);
            }
            LinkedHashMap linkedHashMap7 = new LinkedHashMap();
            linkedHashMap7.put("key", new C1539o.a("key", "TEXT", true, 1, null, 1));
            linkedHashMap7.put("long_value", new C1539o.a("long_value", "INTEGER", false, 0, null, 1));
            C1539o c1539o7 = new C1539o("Preference", linkedHashMap7, new LinkedHashSet(), new LinkedHashSet());
            C1539o c1539oM8113a7 = companion.m8113a(connection, "Preference");
            if (c1539o7.equals(c1539oM8113a7)) {
                return new AbstractC12651a0.a(true, null);
            }
            return new AbstractC12651a0.a(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + c1539o7 + "\n Found:\n" + c1539oM8113a7);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public static final C5380g m6363m0(WorkDatabase_Impl workDatabase_Impl) {
        return new C5380g(workDatabase_Impl);
    }

    /* JADX INFO: renamed from: n0 */
    public static final C5395l m6364n0(WorkDatabase_Impl workDatabase_Impl) {
        return new C5395l(workDatabase_Impl);
    }

    /* JADX INFO: renamed from: o0 */
    public static final C5401n m6365o0(WorkDatabase_Impl workDatabase_Impl) {
        return new C5401n(workDatabase_Impl);
    }

    /* JADX INFO: renamed from: p0 */
    public static final C5422u m6366p0(WorkDatabase_Impl workDatabase_Impl) {
        return new C5422u(workDatabase_Impl);
    }

    /* JADX INFO: renamed from: q0 */
    public static final C5366b0 m6367q0(WorkDatabase_Impl workDatabase_Impl) {
        return new C5366b0(workDatabase_Impl);
    }

    /* JADX INFO: renamed from: r0 */
    public static final C5384h0 m6368r0(WorkDatabase_Impl workDatabase_Impl) {
        return new C5384h0(workDatabase_Impl);
    }

    /* JADX INFO: renamed from: s0 */
    public static final C5403n1 m6369s0(WorkDatabase_Impl workDatabase_Impl) {
        return new C5403n1(workDatabase_Impl);
    }

    /* JADX INFO: renamed from: t0 */
    public static final C5424u1 m6370t0(WorkDatabase_Impl workDatabase_Impl) {
        return new C5424u1(workDatabase_Impl);
    }

    @Override // androidx.work.impl.WorkDatabase
    @NotNull
    /* JADX INFO: renamed from: X */
    public InterfaceC5365b mo6345X() {
        return this._dependencyDao.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    @NotNull
    /* JADX INFO: renamed from: Y */
    public InterfaceC5386i mo6346Y() {
        return this._preferenceDao.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    @NotNull
    /* JADX INFO: renamed from: Z */
    public InterfaceC5407p mo6347Z() {
        return this._systemIdInfoDao.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    @NotNull
    /* JADX INFO: renamed from: a0 */
    public InterfaceC5432y mo6348a0() {
        return this._workNameDao.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    @NotNull
    /* JADX INFO: renamed from: b0 */
    public InterfaceC5372d0 mo6349b0() {
        return this._workProgressDao.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    @NotNull
    /* JADX INFO: renamed from: c0 */
    public InterfaceC5393k0 mo6350c0() {
        return this._workSpecDao.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    @NotNull
    /* JADX INFO: renamed from: d0 */
    public InterfaceC5412q1 mo6351d0() {
        return this._workTagDao.getValue();
    }

    @Override // p535x4.AbstractC12682u
    @NotNull
    /* JADX INFO: renamed from: j */
    public List<AbstractC0072b> mo6372j(@NotNull Map<InterfaceC6567c<? extends InterfaceC0071a>, ? extends InterfaceC0071a> autoMigrationSpecs) {
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C13062k0());
        arrayList.add(new C13065l0());
        arrayList.add(new C13068m0());
        arrayList.add(new C13071n0());
        arrayList.add(new C13074o0());
        arrayList.add(new C13077p0());
        arrayList.add(new C13080q0());
        arrayList.add(new C13083r0());
        arrayList.add(new C13086s0());
        return arrayList;
    }

    @Override // p535x4.AbstractC12682u
    @NotNull
    /* JADX INFO: renamed from: m */
    public C1075c mo6373m() {
        return new C1075c(this, new LinkedHashMap(), new LinkedHashMap(), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    /* JADX DEBUG: Method merged with bridge method: n()Lx4/b0; */
    @Override // p535x4.AbstractC12682u
    @NotNull
    /* JADX INFO: renamed from: v0, reason: merged with bridge method [inline-methods] */
    public AbstractC12651a0 mo6374n() {
        return new C1119a();
    }

    @Override // p535x4.AbstractC12682u
    @NotNull
    /* JADX INFO: renamed from: w */
    public Set<InterfaceC6567c<? extends InterfaceC0071a>> mo6376w() {
        return new LinkedHashSet();
    }

    @Override // p535x4.AbstractC12682u
    @NotNull
    /* JADX INFO: renamed from: y */
    public Map<InterfaceC6567c<?>, List<InterfaceC6567c<?>>> mo6377y() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(C7731d0.m32002b(InterfaceC5393k0.class), C5403n1.INSTANCE.m24870a());
        linkedHashMap.put(C7731d0.m32002b(InterfaceC5365b.class), C5380g.INSTANCE.m24735a());
        linkedHashMap.put(C7731d0.m32002b(InterfaceC5412q1.class), C5424u1.INSTANCE.m24901a());
        linkedHashMap.put(C7731d0.m32002b(InterfaceC5407p.class), C5422u.INSTANCE.m24893a());
        linkedHashMap.put(C7731d0.m32002b(InterfaceC5432y.class), C5366b0.INSTANCE.m24720a());
        linkedHashMap.put(C7731d0.m32002b(InterfaceC5372d0.class), C5384h0.INSTANCE.m24745a());
        linkedHashMap.put(C7731d0.m32002b(InterfaceC5386i.class), C5395l.INSTANCE.m24808a());
        linkedHashMap.put(C7731d0.m32002b(InterfaceC5398m.class), C5401n.INSTANCE.m24809a());
        return linkedHashMap;
    }
}
