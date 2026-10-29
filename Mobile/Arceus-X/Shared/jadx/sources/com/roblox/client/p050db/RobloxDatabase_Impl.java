package com.roblox.client.p050db;

import androidx.room.C1075c;
import com.roblox.client.p050db.RobloxDatabase_Impl;
import hu.InterfaceC6567c;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kh.C7614d;
import kh.C7615e;
import kh.C7616f;
import kh.C7617g;
import kotlin.Metadata;
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
import p229jt.C7342i;
import p229jt.InterfaceC7341h;
import p272lh.C8143g;
import p272lh.C8149m;
import p272lh.InterfaceC8137a;
import p272lh.InterfaceC8145i;
import p535x4.AbstractC12651a0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\b\u0010\tJ)\u0010\r\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\f0\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000b0\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\f2\u001a\u0010\u0013\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000b\u0012\u0004\u0012\u00020\u00100\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00170\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001f¨\u0006#"}, m31665d2 = {"Lcom/roblox/client/db/RobloxDatabase_Impl;", "Lcom/roblox/client/db/RobloxDatabase;", "<init>", "()V", "Lx4/a0;", "e0", "()Lx4/a0;", "Landroidx/room/c;", "m", "()Landroidx/room/c;", "", "Lhu/c;", "", "y", "()Ljava/util/Map;", "", "La5/a;", "w", "()Ljava/util/Set;", "autoMigrationSpecs", "La5/b;", "j", "(Ljava/util/Map;)Ljava/util/List;", "Llh/a;", "X", "()Llh/a;", "Llh/i;", "Y", "()Llh/i;", "Ljt/h;", "o", "Ljt/h;", "_analyticEventDao", "p", "_notificationIdDao", "database_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class RobloxDatabase_Impl extends RobloxDatabase {

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7341h<InterfaceC8137a> _analyticEventDao = C7342i.m30456b(new Function0() { // from class: kh.h
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RobloxDatabase_Impl.m15105b0(this.f29136a);
        }
    });

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7341h<InterfaceC8145i> _notificationIdDao = C7342i.m30456b(new Function0() { // from class: kh.i
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RobloxDatabase_Impl.m15106c0(this.f29137a);
        }
    });

    /* JADX INFO: renamed from: com.roblox.client.db.RobloxDatabase_Impl$a */
    @Metadata(m31664d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\u0006J\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"com/roblox/client/db/RobloxDatabase_Impl$a", "Lx4/a0;", "Lf5/b;", "connection", "", "a", "(Lf5/b;)V", "b", "f", "g", "i", "h", "Lx4/a0$a;", "j", "(Lf5/b;)Lx4/a0$a;", "database_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C3180a extends AbstractC12651a0 {
        public C3180a() {
            super(5, "88309002ec78233a9a3477c82fbe69af", "9db1597f250c1e8481d7591a61408d45");
        }

        @Override // p535x4.AbstractC12651a0
        /* JADX INFO: renamed from: a */
        public void mo6378a(InterfaceC5359b connection) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            C5358a.m24693a(connection, "CREATE TABLE IF NOT EXISTS `analytic_event` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `serialized_event` TEXT NOT NULL, `event_name` TEXT, `event_context` TEXT, `serialized_params` TEXT, `retry_attempt_count` INTEGER)");
            C5358a.m24693a(connection, "CREATE TABLE IF NOT EXISTS `notification_id` (`notification_id` TEXT NOT NULL, `last_received_timestamp_ms` INTEGER NOT NULL, PRIMARY KEY(`notification_id`))");
            C5358a.m24693a(connection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            C5358a.m24693a(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '88309002ec78233a9a3477c82fbe69af')");
        }

        @Override // p535x4.AbstractC12651a0
        /* JADX INFO: renamed from: b */
        public void mo6379b(InterfaceC5359b connection) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            C5358a.m24693a(connection, "DROP TABLE IF EXISTS `analytic_event`");
            C5358a.m24693a(connection, "DROP TABLE IF EXISTS `notification_id`");
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
            RobloxDatabase_Impl.this.m47259K(connection);
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
            linkedHashMap.put("id", new C1539o.a("id", "INTEGER", true, 1, null, 1));
            linkedHashMap.put("serialized_event", new C1539o.a("serialized_event", "TEXT", true, 0, null, 1));
            linkedHashMap.put("event_name", new C1539o.a("event_name", "TEXT", false, 0, null, 1));
            linkedHashMap.put("event_context", new C1539o.a("event_context", "TEXT", false, 0, null, 1));
            linkedHashMap.put("serialized_params", new C1539o.a("serialized_params", "TEXT", false, 0, null, 1));
            linkedHashMap.put("retry_attempt_count", new C1539o.a("retry_attempt_count", "INTEGER", false, 0, null, 1));
            C1539o c1539o = new C1539o("analytic_event", linkedHashMap, new LinkedHashSet(), new LinkedHashSet());
            C1539o.Companion companion = C1539o.INSTANCE;
            C1539o c1539oM8113a = companion.m8113a(connection, "analytic_event");
            if (!c1539o.equals(c1539oM8113a)) {
                return new AbstractC12651a0.a(false, "analytic_event(com.roblox.client.db.entities.AnalyticEvent).\n Expected:\n" + c1539o + "\n Found:\n" + c1539oM8113a);
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("notification_id", new C1539o.a("notification_id", "TEXT", true, 1, null, 1));
            linkedHashMap2.put("last_received_timestamp_ms", new C1539o.a("last_received_timestamp_ms", "INTEGER", true, 0, null, 1));
            C1539o c1539o2 = new C1539o("notification_id", linkedHashMap2, new LinkedHashSet(), new LinkedHashSet());
            C1539o c1539oM8113a2 = companion.m8113a(connection, "notification_id");
            if (c1539o2.equals(c1539oM8113a2)) {
                return new AbstractC12651a0.a(true, null);
            }
            return new AbstractC12651a0.a(false, "notification_id(com.roblox.client.db.entities.NotificationId).\n Expected:\n" + c1539o2 + "\n Found:\n" + c1539oM8113a2);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public static final C8143g m15105b0(RobloxDatabase_Impl robloxDatabase_Impl) {
        return new C8143g(robloxDatabase_Impl);
    }

    /* JADX INFO: renamed from: c0 */
    public static final C8149m m15106c0(RobloxDatabase_Impl robloxDatabase_Impl) {
        return new C8149m(robloxDatabase_Impl);
    }

    @Override // com.roblox.client.p050db.RobloxDatabase
    @NotNull
    /* JADX INFO: renamed from: X */
    public InterfaceC8137a mo15101X() {
        return this._analyticEventDao.getValue();
    }

    @Override // com.roblox.client.p050db.RobloxDatabase
    @NotNull
    /* JADX INFO: renamed from: Y */
    public InterfaceC8145i mo15102Y() {
        return this._notificationIdDao.getValue();
    }

    /* JADX DEBUG: Method merged with bridge method: n()Lx4/b0; */
    @Override // p535x4.AbstractC12682u
    @NotNull
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public AbstractC12651a0 mo6374n() {
        return new C3180a();
    }

    @Override // p535x4.AbstractC12682u
    @NotNull
    /* JADX INFO: renamed from: j */
    public List<AbstractC0072b> mo6372j(@NotNull Map<InterfaceC6567c<? extends InterfaceC0071a>, ? extends InterfaceC0071a> autoMigrationSpecs) {
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C7614d());
        arrayList.add(new C7615e());
        arrayList.add(new C7616f());
        arrayList.add(new C7617g());
        return arrayList;
    }

    @Override // p535x4.AbstractC12682u
    @NotNull
    /* JADX INFO: renamed from: m */
    public C1075c mo6373m() {
        return new C1075c(this, new LinkedHashMap(), new LinkedHashMap(), "analytic_event", "notification_id");
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
        linkedHashMap.put(C7731d0.m32002b(InterfaceC8137a.class), C8143g.INSTANCE.m33383a());
        linkedHashMap.put(C7731d0.m32002b(InterfaceC8145i.class), C8149m.INSTANCE.m33400a());
        return linkedHashMap;
    }
}
