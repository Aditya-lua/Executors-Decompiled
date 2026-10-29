package com.roblox.universalapp.achievement;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x4.n;
import x4.u;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000 \u00072\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/roblox/universalapp/achievement/AchievementDatabase;", "Lx4/u;", "<init>", "()V", "Lsl/b;", "Z", "()Lsl/b;", "o", "a", "database_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class AchievementDatabase extends u {

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public static volatile AchievementDatabase f9748p;

    /* JADX INFO: renamed from: com.roblox.universalapp.achievement.AchievementDatabase$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/roblox/universalapp/achievement/AchievementDatabase$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/roblox/universalapp/achievement/AchievementDatabase;", "a", "(Landroid/content/Context;)Lcom/roblox/universalapp/achievement/AchievementDatabase;", "INSTANCE", "Lcom/roblox/universalapp/achievement/AchievementDatabase;", "database_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final AchievementDatabase a(@NotNull Context context) {
            AchievementDatabase achievementDatabase;
            Intrinsics.checkNotNullParameter(context, "context");
            AchievementDatabase achievementDatabase2 = AchievementDatabase.f9748p;
            if (achievementDatabase2 != null) {
                return achievementDatabase2;
            }
            synchronized (this) {
                Context applicationContext = context.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                u uVarD = n.a(applicationContext, AchievementDatabase.class, "achievement_db").d();
                AchievementDatabase.f9748p = (AchievementDatabase) uVarD;
                achievementDatabase = (AchievementDatabase) uVarD;
            }
            return achievementDatabase;
        }

        public Companion() {
        }
    }

    @NotNull
    public abstract sl.b Z();
}
