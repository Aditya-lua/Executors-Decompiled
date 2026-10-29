package sl;

import androidx.core.view.inputmethod.EditorInfoCompat;
import java.time.Instant;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import nu.InterfaceC9575h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p315nt.InterfaceC9557b;
import pt.AbstractC10342d;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: sl.b */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0097@¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\r\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H§@¢\u0006\u0004\b\r\u0010\fJ(\u0010\u0012\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007H§@¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00070\u00192\u0006\u0010\u0018\u001a\u00020\u0017H'¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u001c\u001a\u00020\u000eH§@¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001fÀ\u0006\u0003"}, m31665d2 = {"Lsl/b;", "", "Lsl/l;", "localAchievement", "", "f", "(Lsl/l;Lnt/b;)Ljava/lang/Object;", "", "Lsl/u;", "remoteAchievements", "", "i", "(Ljava/util/List;Lnt/b;)Ljava/lang/Object;", "e", "", "codeNames", "Ljava/time/Instant;", "syncedAt", "d", "(Ljava/util/List;Ljava/time/Instant;Lnt/b;)Ljava/lang/Object;", "Lsl/a;", "g", "(Lnt/b;)Ljava/lang/Object;", "", "highWatermarkId", "Lnu/h;", "c", "(I)Lnu/h;", "codeName", "h", "(Ljava/lang/String;Lnt/b;)Ljava/lang/Object;", "database_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public interface InterfaceC11392b {

    /* JADX INFO: renamed from: sl.b$a */
    @InterfaceC10344f(m39663c = "com.roblox.universalapp.achievement.AchievementDao", m39664f = "AchievementDao.kt", m39665l = {48, 49}, m39666m = "replicateRemoteAchievements$suspendImpl", m39667v = 1)
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a extends AbstractC10342d {

        /* JADX INFO: renamed from: A */
        public int f40278A;

        /* JADX INFO: renamed from: B */
        public /* synthetic */ Object f40279B;

        /* JADX INFO: renamed from: D */
        public int f40281D;

        /* JADX INFO: renamed from: t */
        public Object f40282t;

        /* JADX INFO: renamed from: u */
        public Object f40283u;

        /* JADX INFO: renamed from: v */
        public Object f40284v;

        /* JADX INFO: renamed from: w */
        public Object f40285w;

        /* JADX INFO: renamed from: x */
        public Object f40286x;

        /* JADX INFO: renamed from: y */
        public Object f40287y;

        /* JADX INFO: renamed from: z */
        public int f40288z;

        public a(InterfaceC9557b<? super a> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f40279B = obj;
            this.f40281D |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return InterfaceC11392b.m42713a(InterfaceC11392b.this, null, this);
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
    /* JADX INFO: renamed from: a */
    static /* synthetic */ java.lang.Object m42713a(sl.InterfaceC11392b r13, java.util.List<sl.RemoteAchievement> r14, p315nt.InterfaceC9557b<? super kotlin.Unit> r15) {
        /*
            boolean r0 = r15 instanceof sl.InterfaceC11392b.a
            if (r0 == 0) goto L13
            r0 = r15
            sl.b$a r0 = (sl.InterfaceC11392b.a) r0
            int r1 = r0.f40281D
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40281D = r1
            goto L18
        L13:
            sl.b$a r0 = new sl.b$a
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f40279B
            java.lang.Object r1 = p344ot.C10047c.m38805e()
            int r2 = r0.f40281D
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L77
            if (r2 == r5) goto L50
            if (r2 != r4) goto L48
            int r13 = r0.f40288z
            java.lang.Object r14 = r0.f40287y
            java.util.List r14 = (java.util.List) r14
            java.lang.Object r14 = r0.f40285w
            java.util.Iterator r14 = (java.util.Iterator) r14
            java.lang.Object r2 = r0.f40284v
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.lang.Object r6 = r0.f40283u
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r7 = r0.f40282t
            sl.b r7 = (sl.InterfaceC11392b) r7
            p229jt.C7348o.m30470b(r15)
            r15 = r2
            r2 = r14
            r14 = r6
            r6 = r13
            r13 = r7
            goto L8a
        L48:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L50:
            int r13 = r0.f40278A
            int r14 = r0.f40288z
            java.lang.Object r2 = r0.f40287y
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r6 = r0.f40286x
            java.lang.Object r7 = r0.f40285w
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r8 = r0.f40284v
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.lang.Object r9 = r0.f40283u
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r10 = r0.f40282t
            sl.b r10 = (sl.InterfaceC11392b) r10
            p229jt.C7348o.m30470b(r15)
            r15 = r14
            r14 = r13
            r13 = r15
            r15 = r9
            r9 = r0
            r0 = r15
            r15 = r8
            r8 = r2
            r2 = r7
            goto Lc2
        L77:
            p229jt.C7348o.m30470b(r15)
            r15 = r14
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            r2 = 100
            java.util.List r15 = kotlin.collections.CollectionsKt.m31698V(r15, r2)
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            java.util.Iterator r2 = r15.iterator()
            r6 = r3
        L8a:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L11d
            java.lang.Object r7 = r2.next()
            r8 = r7
            java.util.List r8 = (java.util.List) r8
            r0.f40282t = r13
            java.lang.Object r9 = pt.C10350l.m39676a(r14)
            r0.f40283u = r9
            java.lang.Object r9 = pt.C10350l.m39676a(r15)
            r0.f40284v = r9
            r0.f40285w = r2
            java.lang.Object r9 = pt.C10350l.m39676a(r7)
            r0.f40286x = r9
            r0.f40287y = r8
            r0.f40288z = r6
            r0.f40278A = r3
            r0.f40281D = r5
            java.lang.Object r9 = r13.mo15950e(r8, r0)
            if (r9 != r1) goto Lbc
            goto L115
        Lbc:
            r10 = r13
            r9 = r0
            r13 = r6
            r6 = r7
            r0 = r14
            r14 = r3
        Lc2:
            r7 = r8
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            r11 = r7
            java.util.ArrayList r7 = new java.util.ArrayList
            r12 = 10
            int r12 = kotlin.collections.C7701q.m31905u(r11, r12)
            r7.<init>(r12)
            java.util.Iterator r11 = r11.iterator()
        Ld5:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto Le9
            java.lang.Object r12 = r11.next()
            sl.u r12 = (sl.RemoteAchievement) r12
            java.lang.String r12 = r12.getCodeName()
            r7.add(r12)
            goto Ld5
        Le9:
            r9.f40282t = r10
            java.lang.Object r11 = pt.C10350l.m39676a(r0)
            r9.f40283u = r11
            java.lang.Object r11 = pt.C10350l.m39676a(r15)
            r9.f40284v = r11
            r9.f40285w = r2
            java.lang.Object r6 = pt.C10350l.m39676a(r6)
            r9.f40286x = r6
            java.lang.Object r6 = pt.C10350l.m39676a(r8)
            r9.f40287y = r6
            r9.f40288z = r13
            r9.f40278A = r14
            r9.f40281D = r4
            r8 = 0
            r6 = r10
            r10 = 2
            r11 = 0
            java.lang.Object r14 = m42714b(r6, r7, r8, r9, r10, r11)
            if (r14 != r1) goto L116
        L115:
            return r1
        L116:
            r14 = r6
            r6 = r13
            r13 = r14
            r14 = r0
            r0 = r9
            goto L8a
        L11d:
            kotlin.Unit r13 = kotlin.Unit.f29331a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: sl.InterfaceC11392b.m42713a(sl.b, java.util.List, nt.b):java.lang.Object");
    }

    /* JADX INFO: renamed from: b */
    static /* synthetic */ Object m42714b(InterfaceC11392b interfaceC11392b, List list, Instant instant, InterfaceC9557b interfaceC9557b, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: markAchievementSynced");
        }
        if ((i10 & 2) != 0) {
            instant = Instant.now();
            Intrinsics.checkNotNullExpressionValue(instant, "now(...)");
        }
        return interfaceC11392b.mo15949d(list, instant, interfaceC9557b);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    InterfaceC9575h<List<Achievement>> mo15948c(int highWatermarkId);

    @Nullable
    /* JADX INFO: renamed from: d */
    Object mo15949d(@NotNull List<String> list, @NotNull Instant instant, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b);

    @Nullable
    /* JADX INFO: renamed from: e */
    Object mo15950e(@NotNull List<RemoteAchievement> list, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b);

    @Nullable
    /* JADX INFO: renamed from: f */
    Object mo15951f(@NotNull LocalAchievement localAchievement, @NotNull InterfaceC9557b<? super Long> interfaceC9557b);

    @Nullable
    /* JADX INFO: renamed from: g */
    Object mo15952g(@NotNull InterfaceC9557b<? super List<Achievement>> interfaceC9557b);

    @Nullable
    /* JADX INFO: renamed from: h */
    Object mo15953h(@NotNull String str, @NotNull InterfaceC9557b<? super Achievement> interfaceC9557b);

    @Nullable
    /* JADX INFO: renamed from: i */
    default Object mo15954i(@NotNull List<RemoteAchievement> list, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        return m42713a(this, list, interfaceC9557b);
    }
}
