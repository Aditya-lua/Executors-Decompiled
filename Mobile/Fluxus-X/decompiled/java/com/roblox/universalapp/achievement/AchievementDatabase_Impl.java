package com.roblox.universalapp.achievement;

import com.github.luben.zstd.BuildConfig;
import com.roblox.universalapp.achievement.AchievementDatabase_Impl;
import d5.o;
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
import p001kotlin.jvm.internal.d0;
import xu.c;
import y4.a0;
import zt.h;
import zt.i;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\b\u0010\tJ)\u0010\r\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\f0\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000b0\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\f2\u001a\u0010\u0013\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000b\u0012\u0004\u0012\u00020\u00100\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00170\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/roblox/universalapp/achievement/AchievementDatabase_Impl;", "Lcom/roblox/universalapp/achievement/AchievementDatabase;", "<init>", "()V", "Ly4/a0;", "d0", "()Ly4/a0;", "Landroidx/room/c;", "m", "()Landroidx/room/c;", BuildConfig.FLAVOR, "Lxu/c;", BuildConfig.FLAVOR, "y", "()Ljava/util/Map;", BuildConfig.FLAVOR, "Lb5/a;", "w", "()Ljava/util/Set;", "autoMigrationSpecs", "Lb5/b;", "j", "(Ljava/util/Map;)Ljava/util/List;", "Lgm/b;", "Z", "()Lgm/b;", "Lzt/h;", "q", "Lzt/h;", "_achievementDao", "database_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AchievementDatabase_Impl extends AchievementDatabase {

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final h<gm.b> _achievementDao = i.a(new Function0() { // from class: gm.i
        @Override // p001kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AchievementDatabase_Impl.b0(this.f17789a);
        }
    });

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\u0006J\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"com/roblox/universalapp/achievement/AchievementDatabase_Impl$a", "Ly4/a0;", "Lg5/b;", "connection", BuildConfig.FLAVOR, "a", "(Lg5/b;)V", "b", "f", "g", "i", "h", "Ly4/a0$a;", "j", "(Lg5/b;)Ly4/a0$a;", "database_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a extends a0 {
        public a() {
            super(1, "82442decbc35917f4ce6f2980cce65b6", "53e6a217c7eeb335c766df948e698df4");
        }

        @Override // y4.a0
        public void a(g5.b connection) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            g5.a.a(connection, "CREATE TABLE IF NOT EXISTS `achievements` (`Id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `code_name` TEXT NOT NULL, `origin` TEXT NOT NULL, `created_ts` INTEGER NOT NULL, `synced_ts` INTEGER)");
            g5.a.a(connection, "CREATE UNIQUE INDEX IF NOT EXISTS `index_achievements_code_name` ON `achievements` (`code_name`)");
            g5.a.a(connection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            g5.a.a(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '82442decbc35917f4ce6f2980cce65b6')");
        }

        @Override // y4.a0
        public void b(g5.b connection) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            g5.a.a(connection, "DROP TABLE IF EXISTS `achievements`");
        }

        @Override // y4.a0
        public void f(g5.b connection) {
            Intrinsics.checkNotNullParameter(connection, "connection");
        }

        @Override // y4.a0
        public void g(g5.b connection) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            AchievementDatabase_Impl.this.K(connection);
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
            linkedHashMap.put("Id", new o.a("Id", "INTEGER", true, 1, null, 1));
            linkedHashMap.put("code_name", new o.a("code_name", "TEXT", true, 0, null, 1));
            linkedHashMap.put("origin", new o.a("origin", "TEXT", true, 0, null, 1));
            linkedHashMap.put("created_ts", new o.a("created_ts", "INTEGER", true, 0, null, 1));
            linkedHashMap.put("synced_ts", new o.a("synced_ts", "INTEGER", false, 0, null, 1));
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            linkedHashSet2.add(new o.d("index_achievements_code_name", true, p001kotlin.collections.o.d("code_name"), p001kotlin.collections.o.d("ASC")));
            o oVar = new o("achievements", linkedHashMap, linkedHashSet, linkedHashSet2);
            o oVarA = o.INSTANCE.a(connection, "achievements");
            if (oVar.equals(oVarA)) {
                return new a0.a(true, null);
            }
            return new a0.a(false, "achievements(com.roblox.universalapp.achievement.Achievement).\n Expected:\n" + oVar + "\n Found:\n" + oVarA);
        }
    }

    public static final com.roblox.universalapp.achievement.a b0(AchievementDatabase_Impl achievementDatabase_Impl) {
        return new com.roblox.universalapp.achievement.a(achievementDatabase_Impl);
    }

    @Override // com.roblox.universalapp.achievement.AchievementDatabase
    @NotNull
    public gm.b Z() {
        return this._achievementDao.getValue();
    }

    @Override // y4.u
    @NotNull
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public a0 n() {
        return new a();
    }

    @Override // y4.u
    @NotNull
    public List<b5.b> j(@NotNull Map<c<? extends b5.a>, ? extends b5.a> autoMigrationSpecs) {
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        return new ArrayList();
    }

    @Override // y4.u
    @NotNull
    public androidx.room.c m() {
        return new androidx.room.c(this, new LinkedHashMap(), new LinkedHashMap(), "achievements");
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
        linkedHashMap.put(d0.b(gm.b.class), com.roblox.universalapp.achievement.a.INSTANCE.a());
        return linkedHashMap;
    }
}
