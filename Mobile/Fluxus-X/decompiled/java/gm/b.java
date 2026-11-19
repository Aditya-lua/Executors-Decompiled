package gm;

import com.github.luben.zstd.BuildConfig;
import java.time.Instant;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0097@¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\r\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H§@¢\u0006\u0004\b\r\u0010\fJ(\u0010\u0012\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007H§@¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00070\u00192\u0006\u0010\u0018\u001a\u00020\u0017H'¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u001c\u001a\u00020\u000eH§@¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001fÀ\u0006\u0003"}, d2 = {"Lgm/b;", BuildConfig.FLAVOR, "Lgm/l;", "localAchievement", BuildConfig.FLAVOR, "e", "(Lgm/l;Leu/b;)Ljava/lang/Object;", BuildConfig.FLAVOR, "Lgm/u;", "remoteAchievements", BuildConfig.FLAVOR, "d", "(Ljava/util/List;Leu/b;)Ljava/lang/Object;", "g", BuildConfig.FLAVOR, "codeNames", "Ljava/time/Instant;", "syncedAt", "h", "(Ljava/util/List;Ljava/time/Instant;Leu/b;)Ljava/lang/Object;", "Lgm/a;", "c", "(Leu/b;)Ljava/lang/Object;", BuildConfig.FLAVOR, "highWatermarkId", "Ldv/h;", "b", "(I)Ldv/h;", "codeName", "i", "(Ljava/lang/String;Leu/b;)Ljava/lang/Object;", "database_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.roblox.universalapp.achievement.AchievementDao", f = "AchievementDao.kt", l = {48, 49}, m = "replicateRemoteAchievements$suspendImpl", v = 1)
    public static final class a extends gu.d {
        public int A;
        public /* synthetic */ Object B;
        public int D;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f17772t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f17773u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f17774v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f17775w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f17776x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public Object f17777y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f17778z;

        public a(eu.b<? super a> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.B = obj;
            this.D |= Integer.MIN_VALUE;
            return b.a(b.this, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0090  */
    /* JADX WARN: Code duplicated, block: B:22:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:26:0x00db A[LOOP:0: B:24:0x00d5->B:26:0x00db, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0116  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0116 -> B:17:0x008a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    static /* synthetic */ java.lang.Object a(gm.b r13, java.util.List<gm.RemoteAchievement> r14, eu.b<? super p001kotlin.Unit> r15) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gm.b.a(gm.b, java.util.List, eu.b):java.lang.Object");
    }

    static /* synthetic */ Object f(b bVar, List list, Instant instant, eu.b bVar2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: markAchievementSynced");
        }
        if ((i10 & 2) != 0) {
            instant = Instant.now();
            Intrinsics.checkNotNullExpressionValue(instant, "now(...)");
        }
        return bVar.h(list, instant, bVar2);
    }

    @NotNull
    dv.h<List<Achievement>> b(int highWatermarkId);

    @Nullable
    Object c(@NotNull eu.b<? super List<Achievement>> bVar);

    @Nullable
    default Object d(@NotNull List<RemoteAchievement> list, @NotNull eu.b<? super Unit> bVar) {
        return a(this, list, bVar);
    }

    @Nullable
    Object e(@NotNull LocalAchievement localAchievement, @NotNull eu.b<? super Long> bVar);

    @Nullable
    Object g(@NotNull List<RemoteAchievement> list, @NotNull eu.b<? super Unit> bVar);

    @Nullable
    Object h(@NotNull List<String> list, @NotNull Instant instant, @NotNull eu.b<? super Unit> bVar);

    @Nullable
    Object i(@NotNull String str, @NotNull eu.b<? super Achievement> bVar);
}
