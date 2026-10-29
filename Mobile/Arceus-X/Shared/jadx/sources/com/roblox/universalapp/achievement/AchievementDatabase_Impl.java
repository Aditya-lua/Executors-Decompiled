package com.roblox.universalapp.achievement;

import androidx.room.C1075c;
import com.roblox.universalapp.achievement.AchievementDatabase_Impl;
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
import p229jt.C7342i;
import p229jt.InterfaceC7341h;
import p535x4.AbstractC12651a0;
import sl.InterfaceC11392b;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\b\u0010\tJ)\u0010\r\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\f0\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000b0\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\f2\u001a\u0010\u0013\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000b\u0012\u0004\u0012\u00020\u00100\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00170\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m31665d2 = {"Lcom/roblox/universalapp/achievement/AchievementDatabase_Impl;", "Lcom/roblox/universalapp/achievement/AchievementDatabase;", "<init>", "()V", "Lx4/a0;", "d0", "()Lx4/a0;", "Landroidx/room/c;", "m", "()Landroidx/room/c;", "", "Lhu/c;", "", "y", "()Ljava/util/Map;", "", "La5/a;", "w", "()Ljava/util/Set;", "autoMigrationSpecs", "La5/b;", "j", "(Ljava/util/Map;)Ljava/util/List;", "Lsl/b;", "Z", "()Lsl/b;", "Ljt/h;", "q", "Ljt/h;", "_achievementDao", "database_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class AchievementDatabase_Impl extends AchievementDatabase {

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7341h<InterfaceC11392b> _achievementDao = C7342i.m30456b(new Function0() { // from class: sl.i
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AchievementDatabase_Impl.m15927b0(this.f40305a);
        }
    });

    /* JADX INFO: renamed from: com.roblox.universalapp.achievement.AchievementDatabase_Impl$a */
    @Metadata(m31664d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\u0006J\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"com/roblox/universalapp/achievement/AchievementDatabase_Impl$a", "Lx4/a0;", "Lf5/b;", "connection", "", "a", "(Lf5/b;)V", "b", "f", "g", "i", "h", "Lx4/a0$a;", "j", "(Lf5/b;)Lx4/a0$a;", "database_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C3342a extends AbstractC12651a0 {
        public C3342a() {
            super(1, "82442decbc35917f4ce6f2980cce65b6", "53e6a217c7eeb335c766df948e698df4");
        }

        @Override // p535x4.AbstractC12651a0
        /* JADX INFO: renamed from: a */
        public void mo6378a(InterfaceC5359b connection) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            C5358a.m24693a(connection, "CREATE TABLE IF NOT EXISTS `achievements` (`Id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `code_name` TEXT NOT NULL, `origin` TEXT NOT NULL, `created_ts` INTEGER NOT NULL, `synced_ts` INTEGER)");
            C5358a.m24693a(connection, "CREATE UNIQUE INDEX IF NOT EXISTS `index_achievements_code_name` ON `achievements` (`code_name`)");
            C5358a.m24693a(connection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            C5358a.m24693a(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '82442decbc35917f4ce6f2980cce65b6')");
        }

        @Override // p535x4.AbstractC12651a0
        /* JADX INFO: renamed from: b */
        public void mo6379b(InterfaceC5359b connection) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            C5358a.m24693a(connection, "DROP TABLE IF EXISTS `achievements`");
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
            AchievementDatabase_Impl.this.m47259K(connection);
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
            linkedHashMap.put("Id", new C1539o.a("Id", "INTEGER", true, 1, null, 1));
            linkedHashMap.put("code_name", new C1539o.a("code_name", "TEXT", true, 0, null, 1));
            linkedHashMap.put("origin", new C1539o.a("origin", "TEXT", true, 0, null, 1));
            linkedHashMap.put("created_ts", new C1539o.a("created_ts", "INTEGER", true, 0, null, 1));
            linkedHashMap.put("synced_ts", new C1539o.a("synced_ts", "INTEGER", false, 0, null, 1));
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            linkedHashSet2.add(new C1539o.d("index_achievements_code_name", true, C7697o.m31878d("code_name"), C7697o.m31878d("ASC")));
            C1539o c1539o = new C1539o("achievements", linkedHashMap, linkedHashSet, linkedHashSet2);
            C1539o c1539oM8113a = C1539o.INSTANCE.m8113a(connection, "achievements");
            if (c1539o.equals(c1539oM8113a)) {
                return new AbstractC12651a0.a(true, null);
            }
            return new AbstractC12651a0.a(false, "achievements(com.roblox.universalapp.achievement.Achievement).\n Expected:\n" + c1539o + "\n Found:\n" + c1539oM8113a);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public static final C3345a m15927b0(AchievementDatabase_Impl achievementDatabase_Impl) {
        return new C3345a(achievementDatabase_Impl);
    }

    @Override // com.roblox.universalapp.achievement.AchievementDatabase
    @NotNull
    /* JADX INFO: renamed from: Z */
    public InterfaceC11392b mo15924Z() {
        return this._achievementDao.getValue();
    }

    /* JADX DEBUG: Method merged with bridge method: n()Lx4/b0; */
    @Override // p535x4.AbstractC12682u
    @NotNull
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public AbstractC12651a0 mo6374n() {
        return new C3342a();
    }

    @Override // p535x4.AbstractC12682u
    @NotNull
    /* JADX INFO: renamed from: j */
    public List<AbstractC0072b> mo6372j(@NotNull Map<InterfaceC6567c<? extends InterfaceC0071a>, ? extends InterfaceC0071a> autoMigrationSpecs) {
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        return new ArrayList();
    }

    @Override // p535x4.AbstractC12682u
    @NotNull
    /* JADX INFO: renamed from: m */
    public C1075c mo6373m() {
        return new C1075c(this, new LinkedHashMap(), new LinkedHashMap(), "achievements");
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
        linkedHashMap.put(C7731d0.m32002b(InterfaceC11392b.class), C3345a.INSTANCE.m15961a());
        return linkedHashMap;
    }
}
