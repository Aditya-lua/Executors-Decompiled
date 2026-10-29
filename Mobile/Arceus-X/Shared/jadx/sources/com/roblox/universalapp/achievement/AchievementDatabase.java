package com.roblox.universalapp.achievement;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p535x4.AbstractC12682u;
import p535x4.C12675n;
import sl.InterfaceC11392b;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000 \u00072\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, m31665d2 = {"Lcom/roblox/universalapp/achievement/AchievementDatabase;", "Lx4/u;", "<init>", "()V", "Lsl/b;", "Z", "()Lsl/b;", "o", "a", "database_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public abstract class AchievementDatabase extends AbstractC12682u {

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: p */
    @Nullable
    public static volatile AchievementDatabase f12702p;

    /* JADX INFO: renamed from: com.roblox.universalapp.achievement.AchievementDatabase$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, m31665d2 = {"Lcom/roblox/universalapp/achievement/AchievementDatabase$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/roblox/universalapp/achievement/AchievementDatabase;", "a", "(Landroid/content/Context;)Lcom/roblox/universalapp/achievement/AchievementDatabase;", "INSTANCE", "Lcom/roblox/universalapp/achievement/AchievementDatabase;", "database_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.roblox.universalapp.achievement.AchievementDatabase.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final AchievementDatabase m15925a(@NotNull Context context) {
            AchievementDatabase achievementDatabase;
            Intrinsics.checkNotNullParameter(context, "context");
            AchievementDatabase achievementDatabase2 = AchievementDatabase.f12702p;
            if (achievementDatabase2 != null) {
                return achievementDatabase2;
            }
            synchronized (this) {
                Context applicationContext = context.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                AbstractC12682u abstractC12682uM47287d = C12675n.m47228a(applicationContext, AchievementDatabase.class, "achievement_db").m47287d();
                AchievementDatabase.f12702p = (AchievementDatabase) abstractC12682uM47287d;
                achievementDatabase = (AchievementDatabase) abstractC12682uM47287d;
            }
            return achievementDatabase;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    @NotNull
    /* JADX INFO: renamed from: Z */
    public abstract InterfaceC11392b mo15924Z();
}
