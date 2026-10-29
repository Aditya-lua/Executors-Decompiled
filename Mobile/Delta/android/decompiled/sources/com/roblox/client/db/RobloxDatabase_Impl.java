package com.roblox.client.db;

import c5.o;
import com.roblox.client.db.RobloxDatabase_Impl;
import f5.b;
import hu.c;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jt.h;
import jt.i;
import kh.d;
import kh.e;
import kh.f;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import lh.g;
import lh.m;
import org.jetbrains.annotations.NotNull;
import x4.a0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\b\u0010\tJ)\u0010\r\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\f0\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000b0\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\f2\u001a\u0010\u0013\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000b\u0012\u0004\u0012\u00020\u00100\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00170\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001f¨\u0006#"}, d2 = {"Lcom/roblox/client/db/RobloxDatabase_Impl;", "Lcom/roblox/client/db/RobloxDatabase;", "<init>", "()V", "Lx4/a0;", "e0", "()Lx4/a0;", "Landroidx/room/c;", "m", "()Landroidx/room/c;", "", "Lhu/c;", "", "y", "()Ljava/util/Map;", "", "La5/a;", "w", "()Ljava/util/Set;", "autoMigrationSpecs", "La5/b;", "j", "(Ljava/util/Map;)Ljava/util/List;", "Llh/a;", "X", "()Llh/a;", "Llh/i;", "Y", "()Llh/i;", "Ljt/h;", "o", "Ljt/h;", "_analyticEventDao", "p", "_notificationIdDao", "database_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RobloxDatabase_Impl extends RobloxDatabase {

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final h<lh.a> _analyticEventDao = i.b(new Function0() { // from class: kh.h
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RobloxDatabase_Impl.b0(this.f22318a);
        }
    });

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final h<lh.i> _notificationIdDao = i.b(new Function0() { // from class: kh.i
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RobloxDatabase_Impl.c0(this.f22319a);
        }
    });

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\u0006J\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"com/roblox/client/db/RobloxDatabase_Impl$a", "Lx4/a0;", "Lf5/b;", "connection", "", "a", "(Lf5/b;)V", "b", "f", "g", "i", "h", "Lx4/a0$a;", "j", "(Lf5/b;)Lx4/a0$a;", "database_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a extends a0 {
        public a() {
            super(5, "88309002ec78233a9a3477c82fbe69af", "9db1597f250c1e8481d7591a61408d45");
        }

        @Override // x4.a0
        public void a(b connection) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            f5.a.a(connection, "CREATE TABLE IF NOT EXISTS `analytic_event` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `serialized_event` TEXT NOT NULL, `event_name` TEXT, `event_context` TEXT, `serialized_params` TEXT, `retry_attempt_count` INTEGER)");
            f5.a.a(connection, "CREATE TABLE IF NOT EXISTS `notification_id` (`notification_id` TEXT NOT NULL, `last_received_timestamp_ms` INTEGER NOT NULL, PRIMARY KEY(`notification_id`))");
            f5.a.a(connection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            f5.a.a(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '88309002ec78233a9a3477c82fbe69af')");
        }

        @Override // x4.a0
        public void b(b connection) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            f5.a.a(connection, "DROP TABLE IF EXISTS `analytic_event`");
            f5.a.a(connection, "DROP TABLE IF EXISTS `notification_id`");
        }

        @Override // x4.a0
        public void f(b connection) {
            Intrinsics.checkNotNullParameter(connection, "connection");
        }

        @Override // x4.a0
        public void g(b connection) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            RobloxDatabase_Impl.this.K(connection);
        }

        @Override // x4.a0
        public void h(b connection) {
            Intrinsics.checkNotNullParameter(connection, "connection");
        }

        @Override // x4.a0
        public void i(b connection) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            c5.a.a(connection);
        }

        @Override // x4.a0
        public a0.a j(b connection) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("id", new o.a("id", "INTEGER", true, 1, null, 1));
            linkedHashMap.put("serialized_event", new o.a("serialized_event", "TEXT", true, 0, null, 1));
            linkedHashMap.put("event_name", new o.a("event_name", "TEXT", false, 0, null, 1));
            linkedHashMap.put("event_context", new o.a("event_context", "TEXT", false, 0, null, 1));
            linkedHashMap.put("serialized_params", new o.a("serialized_params", "TEXT", false, 0, null, 1));
            linkedHashMap.put("retry_attempt_count", new o.a("retry_attempt_count", "INTEGER", false, 0, null, 1));
            o oVar = new o("analytic_event", linkedHashMap, new LinkedHashSet(), new LinkedHashSet());
            o.Companion companion = o.INSTANCE;
            o oVarA = companion.a(connection, "analytic_event");
            if (!oVar.equals(oVarA)) {
                return new a0.a(false, "analytic_event(com.roblox.client.db.entities.AnalyticEvent).\n Expected:\n" + oVar + "\n Found:\n" + oVarA);
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("notification_id", new o.a("notification_id", "TEXT", true, 1, null, 1));
            linkedHashMap2.put("last_received_timestamp_ms", new o.a("last_received_timestamp_ms", "INTEGER", true, 0, null, 1));
            o oVar2 = new o("notification_id", linkedHashMap2, new LinkedHashSet(), new LinkedHashSet());
            o oVarA2 = companion.a(connection, "notification_id");
            if (oVar2.equals(oVarA2)) {
                return new a0.a(true, null);
            }
            return new a0.a(false, "notification_id(com.roblox.client.db.entities.NotificationId).\n Expected:\n" + oVar2 + "\n Found:\n" + oVarA2);
        }
    }

    public static final g b0(RobloxDatabase_Impl robloxDatabase_Impl) {
        return new g(robloxDatabase_Impl);
    }

    public static final m c0(RobloxDatabase_Impl robloxDatabase_Impl) {
        return new m(robloxDatabase_Impl);
    }

    @Override // com.roblox.client.db.RobloxDatabase
    @NotNull
    public lh.a X() {
        return this._analyticEventDao.getValue();
    }

    @Override // com.roblox.client.db.RobloxDatabase
    @NotNull
    public lh.i Y() {
        return this._notificationIdDao.getValue();
    }

    @Override // x4.u
    @NotNull
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public a0 n() {
        return new a();
    }

    @Override // x4.u
    @NotNull
    public List<a5.b> j(@NotNull Map<c<? extends a5.a>, ? extends a5.a> autoMigrationSpecs) {
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new d());
        arrayList.add(new e());
        arrayList.add(new f());
        arrayList.add(new kh.g());
        return arrayList;
    }

    @Override // x4.u
    @NotNull
    public androidx.room.c m() {
        return new androidx.room.c(this, new LinkedHashMap(), new LinkedHashMap(), "analytic_event", "notification_id");
    }

    @Override // x4.u
    @NotNull
    public Set<c<? extends a5.a>> w() {
        return new LinkedHashSet();
    }

    @Override // x4.u
    @NotNull
    public Map<c<?>, List<c<?>>> y() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(d0.b(lh.a.class), g.INSTANCE.a());
        linkedHashMap.put(d0.b(lh.i.class), m.INSTANCE.a());
        return linkedHashMap;
    }
}
