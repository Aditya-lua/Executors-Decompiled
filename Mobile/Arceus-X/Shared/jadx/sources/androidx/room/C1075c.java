package androidx.room;

import android.content.Context;
import android.content.Intent;
import androidx.room.C1075c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7690k0;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7744k;
import kotlin.jvm.internal.Intrinsics;
import nu.C9579j;
import nu.InterfaceC9575h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025b5.C1224b;
import p119f5.InterfaceC5359b;
import p229jt.C7348o;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p535x4.AbstractC12682u;
import p535x4.C12662g;
import p535x4.C12673l0;
import p594z4.C13718r;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: androidx.room.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 #2\u00020\u0001:\u0002?;BS\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\u0004\u0012\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\t\"\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001b\u001a\u00020\r2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0007H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001dH\u0000¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\r2\u0006\u0010\"\u001a\u00020!H\u0000¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\rH\u0080@¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\rH\u0001¢\u0006\u0004\b'\u0010\u000fJ\r\u0010(\u001a\u00020\r¢\u0006\u0004\b(\u0010\u000fJ9\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070+2\u0012\u0010)\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\t\"\u00020\u00052\b\b\u0002\u0010*\u001a\u00020\u0012H\u0007¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0017¢\u0006\u0004\b0\u0010/J\u000f\u00101\u001a\u00020\rH\u0016¢\u0006\u0004\b1\u0010\u000fJ\u001d\u00102\u001a\u00020\r2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0000¢\u0006\u0004\b2\u0010\u001cJ'\u00108\u001a\u00020\r2\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u00020\u00052\u0006\u00107\u001a\u000206H\u0000¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\rH\u0000¢\u0006\u0004\b:\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R&\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010@R\"\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0014\u0010I\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR \u0010M\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020K0J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010@R\u0018\u0010R\u001a\u00060Nj\u0002`O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010SR\u001a\u0010V\u001a\b\u0012\u0004\u0012\u00020\r0T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010UR\u001a\u0010W\u001a\b\u0012\u0004\u0012\u00020\r0T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010UR\u0014\u0010Z\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010YR\u0018\u0010\\\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010[R\u0018\u0010_\u001a\u0004\u0018\u00010]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010^R\u0014\u0010a\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010`¨\u0006b"}, m31665d2 = {"Landroidx/room/c;", "", "Lx4/u;", "database", "", "", "shadowTablesMap", "", "viewTables", "", "tableNames", "<init>", "(Lx4/u;Ljava/util/Map;Ljava/util/Map;[Ljava/lang/String;)V", "", "r", "()V", "Landroidx/room/c$b;", "observer", "", "h", "(Landroidx/room/c$b;)Z", "x", "", "k", "()Ljava/util/List;", "", "tableIds", "p", "(Ljava/util/Set;)V", "Lb5/b;", "autoCloser", "y", "(Lb5/b;)V", "Lf5/b;", "connection", "o", "(Lf5/b;)V", "A", "(Lnt/b;)Ljava/lang/Object;", "B", "u", "tables", "emitInitialState", "Lnu/h;", "j", "([Ljava/lang/String;Z)Lnu/h;", "i", "(Landroidx/room/c$b;)V", "w", "v", "q", "Landroid/content/Context;", "context", "name", "Landroid/content/Intent;", "serviceIntent", "n", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;)V", "z", "a", "Lx4/u;", "l", "()Lx4/u;", "b", "Ljava/util/Map;", "c", "d", "[Ljava/lang/String;", "m", "()[Ljava/lang/String;", "Lx4/l0;", "e", "Lx4/l0;", "implementation", "", "Landroidx/room/e;", "f", "observerMap", "Ljava/util/concurrent/locks/ReentrantLock;", "Landroidx/room/concurrent/ReentrantLock;", "g", "Ljava/util/concurrent/locks/ReentrantLock;", "observerMapLock", "Lb5/b;", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "onRefreshScheduled", "onRefreshCompleted", "Lx4/g;", "Lx4/g;", "invalidationLiveDataContainer", "Landroid/content/Intent;", "multiInstanceInvalidationIntent", "Landroidx/room/d;", "Landroidx/room/d;", "multiInstanceInvalidationClient", "Ljava/lang/Object;", "trackerLock", "room-runtime"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public class C1075c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final AbstractC12682u database;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Map<String, String> shadowTablesMap;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Map<String, Set<String>> viewTables;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final String[] tableNames;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final C12673l0 implementation;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final Map<b, C1077e> observerMap;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final ReentrantLock observerMapLock;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public C1224b autoCloser;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Function0<Unit> onRefreshScheduled;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final Function0<Unit> onRefreshCompleted;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final C12662g invalidationLiveDataContainer;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public Intent multiInstanceInvalidationIntent;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public C1076d multiInstanceInvalidationClient;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    public final Object trackerLock;

    /* JADX INFO: renamed from: androidx.room.c$b */
    @Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\t\u001a\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H&¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m31665d2 = {"Landroidx/room/c$b;", "", "", "", "tables", "<init>", "([Ljava/lang/String;)V", "", "", "c", "(Ljava/util/Set;)V", "a", "[Ljava/lang/String;", "()[Ljava/lang/String;", "", "b", "()Z", "isRemote", "room-runtime"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static abstract class b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final String[] tables;

        public b(@NotNull String[] tables) {
            Intrinsics.checkNotNullParameter(tables, "tables");
            this.tables = tables;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String[] getTables() {
            return this.tables;
        }

        /* JADX INFO: renamed from: b */
        public boolean mo6129b() {
            return false;
        }

        /* JADX INFO: renamed from: c */
        public abstract void mo6130c(@NotNull Set<String> tables);
    }

    /* JADX INFO: renamed from: androidx.room.c$c */
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final /* synthetic */ class c extends C7744k implements Function1<Set<? extends Integer>, Unit> {
        public c(Object obj) {
            super(1, obj, C1075c.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0);
        }

        /* JADX INFO: renamed from: d */
        public final void m6131d(Set<Integer> p8) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            ((C1075c) this.receiver).m6119p(p8);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Set<? extends Integer> set) {
            m6131d(set);
            return Unit.f29331a;
        }
    }

    /* JADX INFO: renamed from: androidx.room.c$d */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 1, 0})
    @InterfaceC10344f(m39663c = "androidx.room.InvalidationTracker$removeObserver$1", m39664f = "InvalidationTracker.android.kt", m39665l = {310}, m39666m = "invokeSuspend")
    public static final class d extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f4368t;

        public d(InterfaceC9557b<? super d> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C1075c.this.new d(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f4368t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                C12673l0 c12673l0 = C1075c.this.implementation;
                this.f4368t = 1;
                if (c12673l0.m47217x(this) == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((d) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: androidx.room.c$e */
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final /* synthetic */ class e extends C7744k implements Function0<Unit> {
        public e(Object obj) {
            super(0, obj, C1075c.class, "onAutoCloseCallback", "onAutoCloseCallback()V", 0);
        }

        /* JADX INFO: renamed from: d */
        public final void m6132d() {
            ((C1075c) this.receiver).m6121r();
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            m6132d();
            return Unit.f29331a;
        }
    }

    /* JADX INFO: renamed from: androidx.room.c$f */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 1, 0})
    @InterfaceC10344f(m39663c = "androidx.room.InvalidationTracker$syncBlocking$1", m39664f = "InvalidationTracker.android.kt", m39665l = {152}, m39666m = "invokeSuspend")
    public static final class f extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f4370t;

        public f(InterfaceC9557b<? super f> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C1075c.this.new f(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f4370t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                C1075c c1075c = C1075c.this;
                this.f4370t = 1;
                if (c1075c.m6109A(this) == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((f) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    public C1075c(@NotNull AbstractC12682u database, @NotNull Map<String, String> shadowTablesMap, @NotNull Map<String, Set<String>> viewTables, @NotNull String... tableNames) {
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(shadowTablesMap, "shadowTablesMap");
        Intrinsics.checkNotNullParameter(viewTables, "viewTables");
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        this.database = database;
        this.shadowTablesMap = shadowTablesMap;
        this.viewTables = viewTables;
        this.tableNames = tableNames;
        C12673l0 c12673l0 = new C12673l0(database, shadowTablesMap, viewTables, tableNames, database.getUseTempTrackingTable(), new c(this));
        this.implementation = c12673l0;
        this.observerMap = new LinkedHashMap();
        this.observerMapLock = new ReentrantLock();
        this.onRefreshScheduled = new Function0() { // from class: x4.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C1075c.m6108t(this.f45032a);
            }
        };
        this.onRefreshCompleted = new Function0() { // from class: x4.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C1075c.m6107s(this.f45033a);
            }
        };
        this.invalidationLiveDataContainer = new C12662g(database);
        this.trackerLock = new Object();
        c12673l0.m47214u(new Function0() { // from class: x4.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(C1075c.m6103d(this.f45034a));
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m6103d(C1075c c1075c) {
        return !c1075c.database.m47254F() || c1075c.database.m47261M();
    }

    /* JADX INFO: renamed from: s */
    public static final Unit m6107s(C1075c c1075c) {
        C1224b c1224b = c1075c.autoCloser;
        if (c1224b != null) {
            c1224b.m6875g();
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: t */
    public static final Unit m6108t(C1075c c1075c) {
        C1224b c1224b = c1075c.autoCloser;
        if (c1224b != null) {
            c1224b.m6878j();
        }
        return Unit.f29331a;
    }

    @Nullable
    /* JADX INFO: renamed from: A */
    public final Object m6109A(@NotNull InterfaceC9557b<? super Unit> interfaceC9557b) throws Throwable {
        Object objM47217x = this.implementation.m47217x(interfaceC9557b);
        return objM47217x == C10047c.m38805e() ? objM47217x : Unit.f29331a;
    }

    /* JADX INFO: renamed from: B */
    public final void m6110B() {
        C13718r.m50112a(new f(null));
    }

    /* JADX INFO: renamed from: h */
    public final boolean m6111h(b observer) {
        Pair<String[], int[]> pairM47218y = this.implementation.m47218y(observer.getTables());
        String[] strArrM31671a = pairM47218y.m31671a();
        int[] iArrM31672b = pairM47218y.m31672b();
        C1077e c1077e = new C1077e(observer, iArrM31672b, strArrM31671a);
        ReentrantLock reentrantLock = this.observerMapLock;
        reentrantLock.lock();
        try {
            C1077e c1077ePut = this.observerMap.containsKey(observer) ? (C1077e) C7690k0.m31796k(this.observerMap, observer) : this.observerMap.put(observer, c1077e);
            reentrantLock.unlock();
            return c1077ePut == null && this.implementation.m47209p(iArrM31672b);
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m6112i(@NotNull b observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        if (!observer.mo6129b()) {
            throw new IllegalStateException("isRemote was false of observer argument");
        }
        m6111h(observer);
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final InterfaceC9575h<Set<String>> m6113j(@NotNull String[] tables, boolean emitInitialState) {
        Intrinsics.checkNotNullParameter(tables, "tables");
        Pair<String[], int[]> pairM47218y = this.implementation.m47218y(tables);
        String[] strArrM31671a = pairM47218y.m31671a();
        InterfaceC9575h<Set<String>> interfaceC9575hM47207m = this.implementation.m47207m(strArrM31671a, pairM47218y.m31672b(), emitInitialState);
        C1076d c1076d = this.multiInstanceInvalidationClient;
        InterfaceC9575h<Set<String>> interfaceC9575hM6140h = c1076d != null ? c1076d.m6140h(strArrM31671a) : null;
        return interfaceC9575hM6140h != null ? C9579j.m37766C(interfaceC9575hM47207m, interfaceC9575hM6140h) : interfaceC9575hM47207m;
    }

    /* JADX INFO: renamed from: k */
    public final List<b> m6114k() {
        ReentrantLock reentrantLock = this.observerMapLock;
        reentrantLock.lock();
        try {
            return CollectionsKt.m31687M0(this.observerMap.keySet());
        } finally {
            reentrantLock.unlock();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: l, reason: from getter */
    public final AbstractC12682u getDatabase() {
        return this.database;
    }

    @NotNull
    /* JADX INFO: renamed from: m, reason: from getter */
    public final String[] getTableNames() {
        return this.tableNames;
    }

    /* JADX INFO: renamed from: n */
    public final void m6117n(@NotNull Context context, @NotNull String name, @NotNull Intent serviceIntent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(serviceIntent, "serviceIntent");
        this.multiInstanceInvalidationIntent = serviceIntent;
        this.multiInstanceInvalidationClient = new C1076d(context, name, this);
    }

    /* JADX INFO: renamed from: o */
    public final void m6118o(@NotNull InterfaceC5359b connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        this.implementation.m47206l(connection);
        synchronized (this.trackerLock) {
            try {
                C1076d c1076d = this.multiInstanceInvalidationClient;
                if (c1076d != null) {
                    Intent intent = this.multiInstanceInvalidationIntent;
                    if (intent == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    c1076d.m6143k(intent);
                    Unit unit = Unit.f29331a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m6119p(Set<Integer> tableIds) {
        ReentrantLock reentrantLock = this.observerMapLock;
        reentrantLock.lock();
        try {
            List listM0 = CollectionsKt.m31687M0(this.observerMap.values());
            reentrantLock.unlock();
            Iterator it = listM0.iterator();
            while (it.hasNext()) {
                ((C1077e) it.next()).m6147c(tableIds);
            }
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m6120q(@NotNull Set<String> tables) {
        Intrinsics.checkNotNullParameter(tables, "tables");
        ReentrantLock reentrantLock = this.observerMapLock;
        reentrantLock.lock();
        try {
            List<C1077e> listM0 = CollectionsKt.m31687M0(this.observerMap.values());
            reentrantLock.unlock();
            for (C1077e c1077e : listM0) {
                if (!c1077e.getObserver().mo6129b()) {
                    c1077e.m6148d(tables);
                }
            }
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m6121r() {
        synchronized (this.trackerLock) {
            try {
                C1076d c1076d = this.multiInstanceInvalidationClient;
                if (c1076d != null) {
                    List<b> listM6114k = m6114k();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : listM6114k) {
                        if (!((b) obj).mo6129b()) {
                            arrayList.add(obj);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        c1076d.m6144l();
                    }
                }
                this.implementation.m47212s();
                Unit unit = Unit.f29331a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m6122u() {
        this.implementation.m47211r(this.onRefreshScheduled, this.onRefreshCompleted);
    }

    /* JADX INFO: renamed from: v */
    public void m6123v() {
        this.implementation.m47211r(this.onRefreshScheduled, this.onRefreshCompleted);
    }

    /* JADX INFO: renamed from: w */
    public void m6124w(@NotNull b observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        if (m6125x(observer)) {
            C13718r.m50112a(new d(null));
        }
    }

    /* JADX INFO: renamed from: x */
    public final boolean m6125x(b observer) {
        ReentrantLock reentrantLock = this.observerMapLock;
        reentrantLock.lock();
        try {
            C1077e c1077eRemove = this.observerMap.remove(observer);
            reentrantLock.unlock();
            return c1077eRemove != null && this.implementation.m47210q(c1077eRemove.getTableIds());
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m6126y(@NotNull C1224b autoCloser) {
        Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
        this.autoCloser = autoCloser;
        autoCloser.m6882n(new e(this));
    }

    /* JADX INFO: renamed from: z */
    public final void m6127z() {
        C1076d c1076d = this.multiInstanceInvalidationClient;
        if (c1076d != null) {
            c1076d.m6144l();
        }
    }
}
