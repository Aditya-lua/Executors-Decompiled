package androidx.room;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import jt.o;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.k0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k;
import ku.p0;
import nu.h;
import nu.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pt.m;
import x4.g;
import x4.l0;
import x4.u;
import z4.r;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 #2\u00020\u0001:\u0002?;BS\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\u0004\u0012\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\t\"\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001b\u001a\u00020\r2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0007H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001dH\u0000¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\r2\u0006\u0010\"\u001a\u00020!H\u0000¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\rH\u0080@¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\rH\u0001¢\u0006\u0004\b'\u0010\u000fJ\r\u0010(\u001a\u00020\r¢\u0006\u0004\b(\u0010\u000fJ9\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070+2\u0012\u0010)\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\t\"\u00020\u00052\b\b\u0002\u0010*\u001a\u00020\u0012H\u0007¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0017¢\u0006\u0004\b0\u0010/J\u000f\u00101\u001a\u00020\rH\u0016¢\u0006\u0004\b1\u0010\u000fJ\u001d\u00102\u001a\u00020\r2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0000¢\u0006\u0004\b2\u0010\u001cJ'\u00108\u001a\u00020\r2\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u00020\u00052\u0006\u00107\u001a\u000206H\u0000¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\rH\u0000¢\u0006\u0004\b:\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R&\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010@R\"\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0014\u0010I\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR \u0010M\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020K0J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010@R\u0018\u0010R\u001a\u00060Nj\u0002`O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010SR\u001a\u0010V\u001a\b\u0012\u0004\u0012\u00020\r0T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010UR\u001a\u0010W\u001a\b\u0012\u0004\u0012\u00020\r0T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010UR\u0014\u0010Z\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010YR\u0018\u0010\\\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010[R\u0018\u0010_\u001a\u0004\u0018\u00010]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010^R\u0014\u0010a\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010`¨\u0006b"}, d2 = {"Landroidx/room/c;", "", "Lx4/u;", "database", "", "", "shadowTablesMap", "", "viewTables", "", "tableNames", "<init>", "(Lx4/u;Ljava/util/Map;Ljava/util/Map;[Ljava/lang/String;)V", "", "r", "()V", "Landroidx/room/c$b;", "observer", "", "h", "(Landroidx/room/c$b;)Z", "x", "", "k", "()Ljava/util/List;", "", "tableIds", "p", "(Ljava/util/Set;)V", "Lb5/b;", "autoCloser", "y", "(Lb5/b;)V", "Lf5/b;", "connection", "o", "(Lf5/b;)V", "A", "(Lnt/b;)Ljava/lang/Object;", "B", "u", "tables", "emitInitialState", "Lnu/h;", "j", "([Ljava/lang/String;Z)Lnu/h;", "i", "(Landroidx/room/c$b;)V", "w", "v", "q", "Landroid/content/Context;", "context", "name", "Landroid/content/Intent;", "serviceIntent", "n", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;)V", "z", "a", "Lx4/u;", "l", "()Lx4/u;", "b", "Ljava/util/Map;", "c", "d", "[Ljava/lang/String;", "m", "()[Ljava/lang/String;", "Lx4/l0;", "e", "Lx4/l0;", "implementation", "", "Landroidx/room/e;", "f", "observerMap", "Ljava/util/concurrent/locks/ReentrantLock;", "Landroidx/room/concurrent/ReentrantLock;", "g", "Ljava/util/concurrent/locks/ReentrantLock;", "observerMapLock", "Lb5/b;", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "onRefreshScheduled", "onRefreshCompleted", "Lx4/g;", "Lx4/g;", "invalidationLiveDataContainer", "Landroid/content/Intent;", "multiInstanceInvalidationIntent", "Landroidx/room/d;", "Landroidx/room/d;", "multiInstanceInvalidationClient", "Ljava/lang/Object;", "trackerLock", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final u database;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Map<String, String> shadowTablesMap;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<String, Set<String>> viewTables;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String[] tableNames;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final l0 implementation;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<b, androidx.room.e> observerMap;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ReentrantLock observerMapLock;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public b5.b autoCloser;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function0<Unit> onRefreshScheduled;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function0<Unit> onRefreshCompleted;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final g invalidationLiveDataContainer;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Intent multiInstanceInvalidationIntent;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public androidx.room.d multiInstanceInvalidationClient;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Object trackerLock;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\t\u001a\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H&¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Landroidx/room/c$b;", "", "", "", "tables", "<init>", "([Ljava/lang/String;)V", "", "", "c", "(Ljava/util/Set;)V", "a", "[Ljava/lang/String;", "()[Ljava/lang/String;", "", "b", "()Z", "isRemote", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
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

        public boolean b() {
            return false;
        }

        public abstract void c(@NotNull Set<String> tables);
    }

    /* JADX INFO: renamed from: androidx.room.c$c, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class C0059c extends k implements Function1<Set<? extends Integer>, Unit> {
        public C0059c(Object obj) {
            super(1, obj, c.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0);
        }

        public final void d(Set<Integer> p8) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            ((c) this.receiver).p(p8);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Set<? extends Integer> set) {
            d(set);
            return Unit.f22483a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 1, 0})
    @pt.f(c = "androidx.room.InvalidationTracker$removeObserver$1", f = "InvalidationTracker.android.kt", l = {310}, m = "invokeSuspend")
    public static final class d extends m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f3325t;

        public d(nt.b<? super d> bVar) {
            super(2, bVar);
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return c.this.new d(bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f3325t;
            if (i10 == 0) {
                o.b(obj);
                l0 l0Var = c.this.implementation;
                this.f3325t = 1;
                if (l0Var.x(this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class e extends k implements Function0<Unit> {
        public e(Object obj) {
            super(0, obj, c.class, "onAutoCloseCallback", "onAutoCloseCallback()V", 0);
        }

        public final void d() {
            ((c) this.receiver).r();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            d();
            return Unit.f22483a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 1, 0})
    @pt.f(c = "androidx.room.InvalidationTracker$syncBlocking$1", f = "InvalidationTracker.android.kt", l = {152}, m = "invokeSuspend")
    public static final class f extends m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f3327t;

        public f(nt.b<? super f> bVar) {
            super(2, bVar);
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return c.this.new f(bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f3327t;
            if (i10 == 0) {
                o.b(obj);
                c cVar = c.this;
                this.f3327t = 1;
                if (cVar.A(this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((f) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    public c(@NotNull u database, @NotNull Map<String, String> shadowTablesMap, @NotNull Map<String, Set<String>> viewTables, @NotNull String... tableNames) {
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(shadowTablesMap, "shadowTablesMap");
        Intrinsics.checkNotNullParameter(viewTables, "viewTables");
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        this.database = database;
        this.shadowTablesMap = shadowTablesMap;
        this.viewTables = viewTables;
        this.tableNames = tableNames;
        l0 l0Var = new l0(database, shadowTablesMap, viewTables, tableNames, database.getUseTempTrackingTable(), new C0059c(this));
        this.implementation = l0Var;
        this.observerMap = new LinkedHashMap();
        this.observerMapLock = new ReentrantLock();
        this.onRefreshScheduled = new Function0() { // from class: x4.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return androidx.room.c.t(this.f34743a);
            }
        };
        this.onRefreshCompleted = new Function0() { // from class: x4.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return androidx.room.c.s(this.f34744a);
            }
        };
        this.invalidationLiveDataContainer = new g(database);
        this.trackerLock = new Object();
        l0Var.u(new Function0() { // from class: x4.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(androidx.room.c.d(this.f34745a));
            }
        });
    }

    public static final boolean d(c cVar) {
        return !cVar.database.F() || cVar.database.M();
    }

    public static final Unit s(c cVar) {
        b5.b bVar = cVar.autoCloser;
        if (bVar != null) {
            bVar.g();
        }
        return Unit.f22483a;
    }

    public static final Unit t(c cVar) {
        b5.b bVar = cVar.autoCloser;
        if (bVar != null) {
            bVar.j();
        }
        return Unit.f22483a;
    }

    @Nullable
    public final Object A(@NotNull nt.b<? super Unit> bVar) throws Throwable {
        Object objX = this.implementation.x(bVar);
        return objX == ot.c.e() ? objX : Unit.f22483a;
    }

    public final void B() {
        r.a(new f(null));
    }

    public final boolean h(b observer) {
        Pair<String[], int[]> pairY = this.implementation.y(observer.getTables());
        String[] strArrA = pairY.a();
        int[] iArrB = pairY.b();
        androidx.room.e eVar = new androidx.room.e(observer, iArrB, strArrA);
        ReentrantLock reentrantLock = this.observerMapLock;
        reentrantLock.lock();
        try {
            androidx.room.e eVarPut = this.observerMap.containsKey(observer) ? (androidx.room.e) k0.k(this.observerMap, observer) : this.observerMap.put(observer, eVar);
            reentrantLock.unlock();
            return eVarPut == null && this.implementation.p(iArrB);
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void i(@NotNull b observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        if (!observer.b()) {
            throw new IllegalStateException("isRemote was false of observer argument");
        }
        h(observer);
    }

    @NotNull
    public final h<Set<String>> j(@NotNull String[] tables, boolean emitInitialState) {
        Intrinsics.checkNotNullParameter(tables, "tables");
        Pair<String[], int[]> pairY = this.implementation.y(tables);
        String[] strArrA = pairY.a();
        h<Set<String>> hVarM = this.implementation.m(strArrA, pairY.b(), emitInitialState);
        androidx.room.d dVar = this.multiInstanceInvalidationClient;
        h<Set<String>> hVarH = dVar != null ? dVar.h(strArrA) : null;
        return hVarH != null ? j.C(hVarM, hVarH) : hVarM;
    }

    public final List<b> k() {
        ReentrantLock reentrantLock = this.observerMapLock;
        reentrantLock.lock();
        try {
            return CollectionsKt.M0(this.observerMap.keySet());
        } finally {
            reentrantLock.unlock();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: l, reason: from getter */
    public final u getDatabase() {
        return this.database;
    }

    @NotNull
    /* JADX INFO: renamed from: m, reason: from getter */
    public final String[] getTableNames() {
        return this.tableNames;
    }

    public final void n(@NotNull Context context, @NotNull String name, @NotNull Intent serviceIntent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(serviceIntent, "serviceIntent");
        this.multiInstanceInvalidationIntent = serviceIntent;
        this.multiInstanceInvalidationClient = new androidx.room.d(context, name, this);
    }

    public final void o(@NotNull f5.b connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        this.implementation.l(connection);
        synchronized (this.trackerLock) {
            try {
                androidx.room.d dVar = this.multiInstanceInvalidationClient;
                if (dVar != null) {
                    Intent intent = this.multiInstanceInvalidationIntent;
                    if (intent == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    dVar.k(intent);
                    Unit unit = Unit.f22483a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void p(Set<Integer> tableIds) {
        ReentrantLock reentrantLock = this.observerMapLock;
        reentrantLock.lock();
        try {
            List listM0 = CollectionsKt.M0(this.observerMap.values());
            reentrantLock.unlock();
            Iterator it = listM0.iterator();
            while (it.hasNext()) {
                ((androidx.room.e) it.next()).c(tableIds);
            }
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void q(@NotNull Set<String> tables) {
        Intrinsics.checkNotNullParameter(tables, "tables");
        ReentrantLock reentrantLock = this.observerMapLock;
        reentrantLock.lock();
        try {
            List<androidx.room.e> listM0 = CollectionsKt.M0(this.observerMap.values());
            reentrantLock.unlock();
            for (androidx.room.e eVar : listM0) {
                if (!eVar.getObserver().b()) {
                    eVar.d(tables);
                }
            }
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void r() {
        synchronized (this.trackerLock) {
            try {
                androidx.room.d dVar = this.multiInstanceInvalidationClient;
                if (dVar != null) {
                    List<b> listK = k();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : listK) {
                        if (!((b) obj).b()) {
                            arrayList.add(obj);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        dVar.l();
                    }
                }
                this.implementation.s();
                Unit unit = Unit.f22483a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void u() {
        this.implementation.r(this.onRefreshScheduled, this.onRefreshCompleted);
    }

    public void v() {
        this.implementation.r(this.onRefreshScheduled, this.onRefreshCompleted);
    }

    public void w(@NotNull b observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        if (x(observer)) {
            r.a(new d(null));
        }
    }

    public final boolean x(b observer) {
        ReentrantLock reentrantLock = this.observerMapLock;
        reentrantLock.lock();
        try {
            androidx.room.e eVarRemove = this.observerMap.remove(observer);
            reentrantLock.unlock();
            return eVarRemove != null && this.implementation.q(eVarRemove.getTableIds());
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void y(@NotNull b5.b autoCloser) {
        Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
        this.autoCloser = autoCloser;
        autoCloser.n(new e(this));
    }

    public final void z() {
        androidx.room.d dVar = this.multiInstanceInvalidationClient;
        if (dVar != null) {
            dVar.l();
        }
    }
}
