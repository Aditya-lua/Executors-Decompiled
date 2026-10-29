package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import jt.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.x;
import ku.k;
import ku.p0;
import nu.b0;
import nu.h;
import nu.i;
import nu.i0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pt.f;
import pt.m;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000{\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u00017\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00140\u00132\u000e\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0017\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010#\u001a\n  *\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00103\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R \u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0014048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u00105R\u0014\u00109\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u00108R\u0014\u0010<\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010;R\u0014\u0010?\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010>¨\u0006@"}, d2 = {"Landroidx/room/d;", "", "Landroid/content/Context;", "context", "", "name", "Landroidx/room/c;", "invalidationTracker", "<init>", "(Landroid/content/Context;Ljava/lang/String;Landroidx/room/c;)V", "Landroid/content/Intent;", "serviceIntent", "", "k", "(Landroid/content/Intent;)V", "l", "()V", "", "resolvedTableNames", "Lnu/h;", "", "h", "([Ljava/lang/String;)Lnu/h;", "j", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "b", "Landroidx/room/c;", "i", "()Landroidx/room/c;", "kotlin.jvm.PlatformType", "c", "Landroid/content/Context;", "appContext", "Lku/p0;", "d", "Lku/p0;", "coroutineScope", "Ljava/util/concurrent/atomic/AtomicBoolean;", "e", "Ljava/util/concurrent/atomic/AtomicBoolean;", "stopped", "", "f", "I", "clientId", "Landroidx/room/b;", "g", "Landroidx/room/b;", "invalidationService", "Lnu/b0;", "Lnu/b0;", "invalidatedTables", "androidx/room/d$c", "Landroidx/room/d$c;", "observer", "Landroidx/room/a;", "Landroidx/room/a;", "invalidationCallback", "Landroid/content/ServiceConnection;", "Landroid/content/ServiceConnection;", "serviceConnection", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final androidx.room.c invalidationTracker;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final Context appContext;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final p0 coroutineScope;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AtomicBoolean stopped;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public int clientId;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public androidx.room.b invalidationService;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final b0<Set<String>> invalidatedTables;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final c observer;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final androidx.room.a invalidationCallback;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ServiceConnection serviceConnection;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lnu/h;", "Lnu/i;", "collector", "", "collect", "(Lnu/i;Lnt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements h<Set<? extends String>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f3339a;
        public final /* synthetic */ String[] b;

        /* JADX INFO: renamed from: androidx.room.d$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
        public static final class C0060a<T> implements i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ i f3340a;
            public final /* synthetic */ String[] b;

            /* JADX INFO: renamed from: androidx.room.d$a$a$a, reason: collision with other inner class name */
            @f(c = "androidx.room.MultiInstanceInvalidationClient$createFlow$$inlined$mapNotNull$1$2", f = "MultiInstanceInvalidationClient.android.kt", l = {235}, m = "emit")
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class C0061a extends pt.d {

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public /* synthetic */ Object f3341t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public int f3342u;

                public C0061a(nt.b bVar) {
                    super(bVar);
                }

                @Override // pt.a
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f3341t = obj;
                    this.f3342u |= Integer.MIN_VALUE;
                    return C0060a.this.emit(null, this);
                }
            }

            public C0060a(i iVar, String[] strArr) {
                this.f3340a = iVar;
                this.b = strArr;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // nu.i
            @Nullable
            public final Object emit(Object obj, @NotNull nt.b bVar) {
                C0061a c0061a;
                if (bVar instanceof C0061a) {
                    c0061a = (C0061a) bVar;
                    int i10 = c0061a.f3342u;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0061a.f3342u = i10 - Integer.MIN_VALUE;
                    } else {
                        c0061a = new C0061a(bVar);
                    }
                } else {
                    c0061a = new C0061a(bVar);
                }
                Object obj2 = c0061a.f3341t;
                Object objE = ot.c.e();
                int i11 = c0061a.f3342u;
                if (i11 == 0) {
                    o.b(obj2);
                    i iVar = this.f3340a;
                    Set set = (Set) obj;
                    Set setB = kotlin.collections.p0.b();
                    for (String str : this.b) {
                        Iterator<T> it = set.iterator();
                        while (it.hasNext()) {
                            if (x.E(str, (String) it.next(), true)) {
                                setB.add(str);
                            }
                        }
                    }
                    Set setA = kotlin.collections.p0.a(setB);
                    if (setA.isEmpty()) {
                        setA = null;
                    }
                    if (setA != null) {
                        c0061a.f3342u = 1;
                        if (iVar.emit(setA, c0061a) == objE) {
                            return objE;
                        }
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f22483a;
            }
        }

        public a(h hVar, String[] strArr) {
            this.f3339a = hVar;
            this.b = strArr;
        }

        @Override // nu.h
        @Nullable
        public Object collect(@NotNull i<? super Set<? extends String>> iVar, @NotNull nt.b bVar) {
            Object objCollect = this.f3339a.collect(new C0060a(iVar, this.b), bVar);
            return objCollect == ot.c.e() ? objCollect : Unit.f22483a;
        }
    }

    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"androidx/room/d$b", "Landroidx/room/a$a;", "", "", "tables", "", "A", "([Ljava/lang/String;)V", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends androidx.room.a.AbstractBinderC0056a {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 1, 0})
        @f(c = "androidx.room.MultiInstanceInvalidationClient$invalidationCallback$1$onInvalidation$1", f = "MultiInstanceInvalidationClient.android.kt", l = {87}, m = "invokeSuspend")
        public static final class a extends m implements Function2<p0, nt.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public Object f3345t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public int f3346u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ String[] f3347v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ d f3348w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String[] strArr, d dVar, nt.b<? super a> bVar) {
                super(2, bVar);
                this.f3347v = strArr;
                this.f3348w = dVar;
            }

            @Override // pt.a
            public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
                return new a(this.f3347v, this.f3348w, bVar);
            }

            @Override // pt.a
            public final Object invokeSuspend(Object obj) {
                Set<String> set;
                Object objE = ot.c.e();
                int i10 = this.f3346u;
                if (i10 == 0) {
                    o.b(obj);
                    String[] strArr = this.f3347v;
                    Set<String> setG = q0.g(Arrays.copyOf(strArr, strArr.length));
                    b0 b0Var = this.f3348w.invalidatedTables;
                    this.f3345t = setG;
                    this.f3346u = 1;
                    if (b0Var.emit(setG, this) == objE) {
                        return objE;
                    }
                    set = setG;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    set = (Set) this.f3345t;
                    o.b(obj);
                }
                this.f3348w.getInvalidationTracker().q(set);
                return Unit.f22483a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
                return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
            }
        }

        public b() {
        }

        @Override // androidx.room.a
        public void A(String[] tables) {
            Intrinsics.checkNotNullParameter(tables, "tables");
            k.d(d.this.coroutineScope, null, null, new a(tables, d.this, null), 3, null);
        }
    }

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"androidx/room/d$c", "Landroidx/room/c$b;", "", "", "tables", "", "c", "(Ljava/util/Set;)V", "", "b", "()Z", "isRemote", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends androidx.room.c.b {
        public c(String[] strArr) {
            super(strArr);
        }

        @Override // androidx.room.c.b
        public boolean b() {
            return true;
        }

        @Override // androidx.room.c.b
        public void c(Set<String> tables) {
            Intrinsics.checkNotNullParameter(tables, "tables");
            if (d.this.stopped.get()) {
                return;
            }
            try {
                androidx.room.b bVar = d.this.invalidationService;
                if (bVar != null) {
                    bVar.F0(d.this.clientId, (String[]) tables.toArray(new String[0]));
                }
            } catch (RemoteException e10) {
                Log.w("ROOM", "Cannot broadcast invalidation", e10);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.room.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"androidx/room/d$d", "Landroid/content/ServiceConnection;", "Landroid/content/ComponentName;", "name", "Landroid/os/IBinder;", "service", "", "onServiceConnected", "(Landroid/content/ComponentName;Landroid/os/IBinder;)V", "onServiceDisconnected", "(Landroid/content/ComponentName;)V", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ServiceConnectionC0062d implements ServiceConnection {
        public ServiceConnectionC0062d() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName name, IBinder service) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(service, "service");
            d.this.invalidationService = androidx.room.b.a.r2(service);
            d.this.j();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName name) {
            Intrinsics.checkNotNullParameter(name, "name");
            d.this.invalidationService = null;
        }
    }

    public d(@NotNull Context context, @NotNull String name, @NotNull androidx.room.c invalidationTracker) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(invalidationTracker, "invalidationTracker");
        this.name = name;
        this.invalidationTracker = invalidationTracker;
        this.appContext = context.getApplicationContext();
        this.coroutineScope = invalidationTracker.getDatabase().s();
        this.stopped = new AtomicBoolean(true);
        this.invalidatedTables = i0.a(0, 0, mu.a.SUSPEND);
        this.observer = new c(invalidationTracker.getTableNames());
        this.invalidationCallback = new b();
        this.serviceConnection = new ServiceConnectionC0062d();
    }

    @NotNull
    public final h<Set<String>> h(@NotNull String[] resolvedTableNames) {
        Intrinsics.checkNotNullParameter(resolvedTableNames, "resolvedTableNames");
        return new a(this.invalidatedTables, resolvedTableNames);
    }

    @NotNull
    /* JADX INFO: renamed from: i, reason: from getter */
    public final androidx.room.c getInvalidationTracker() {
        return this.invalidationTracker;
    }

    public final void j() {
        try {
            androidx.room.b bVar = this.invalidationService;
            if (bVar != null) {
                this.clientId = bVar.b1(this.invalidationCallback, this.name);
            }
        } catch (RemoteException e10) {
            Log.w("ROOM", "Cannot register multi-instance invalidation callback", e10);
        }
    }

    public final void k(@NotNull Intent serviceIntent) {
        Intrinsics.checkNotNullParameter(serviceIntent, "serviceIntent");
        if (this.stopped.compareAndSet(true, false)) {
            this.appContext.bindService(serviceIntent, this.serviceConnection, 1);
            this.invalidationTracker.i(this.observer);
        }
    }

    public final void l() {
        if (this.stopped.compareAndSet(false, true)) {
            this.invalidationTracker.w(this.observer);
            try {
                androidx.room.b bVar = this.invalidationService;
                if (bVar != null) {
                    bVar.n2(this.invalidationCallback, this.clientId);
                }
            } catch (RemoteException e10) {
                Log.w("ROOM", "Cannot unregister multi-instance invalidation callback", e10);
            }
            this.appContext.unbindService(this.serviceConnection);
        }
    }
}
