package di;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.p000lifecycle.h0;
import androidx.p000lifecycle.j0;
import androidx.p000lifecycle.s;
import com.appsflyer.R;
import com.google.android.gms.tasks.Task;
import com.roblox.client.RobloxApplication;
import gk.c0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import jt.n;
import jt.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ku.d2;
import ku.g1;
import ku.l0;
import ku.p0;
import okhttp3.internal.ws.RealWebSocket;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pt.m;
import sl.Achievement;
import sl.t;
import sl.w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u000bJ\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u0018\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0087@¢\u0006\u0004\b\u001e\u0010\u001fJ\u001e\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\"2\u0006\u0010!\u001a\u00020 H\u0082@¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\tH\u0082@¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0006H\u0002¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\tH\u0082@¢\u0006\u0004\b)\u0010&J\u0012\u0010*\u001a\u0004\u0018\u00010\tH\u0082@¢\u0006\u0004\b*\u0010&R!\u00101\u001a\u00020+8FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b,\u0010-\u0012\u0004\b0\u0010\u0003\u001a\u0004\b.\u0010/R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00108\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u0010<\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006="}, d2 = {"Ldi/h;", "Landroidx/lifecycle/f;", "<init>", "()V", "Landroid/content/Context;", "context", "", "l", "(Landroid/content/Context;)Z", "", "q", "(Landroid/content/Context;)V", "", "btid", "n", "(Landroid/content/Context;J)V", "m", "Le4/q;", "activity", "o", "(Le4/q;)V", "p", "Landroidx/lifecycle/s;", "owner", "onCreate", "(Landroidx/lifecycle/s;)V", "onStop", "Lsl/w;", "replicator", "", "r", "(Lsl/w;Lnt/b;)Ljava/lang/Object;", "Lda/e;", "signInClient", "Ljt/n;", "k", "(Lda/e;Lnt/b;)Ljava/lang/Object;", "t", "(Lnt/b;)Ljava/lang/Object;", "s", "()Z", "i", "v", "Ldi/l;", "b", "Ljt/h;", "j", "()Ldi/l;", "getStreakTracker$annotations", "streakTracker", "Ljava/util/concurrent/atomic/AtomicBoolean;", "c", "Ljava/util/concurrent/atomic/AtomicBoolean;", "hasUnlockedAllStreaks", "d", "Z", "observerAttached", "Lku/d2;", "e", "Lku/d2;", "achievementsInitJob", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h implements androidx.p000lifecycle.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final h f14632a = new h();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final jt.h streakTracker = jt.i.b(new Function0() { // from class: di.g
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return h.u();
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static AtomicBoolean hasUnlockedAllStreaks = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static volatile boolean observerAttached;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public static d2 achievementsInitJob;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.roblox.client.googleplaygames.PlayGamesIntegration$checkUnlockedAllStreaks$2", f = "PlayGamesIntegration.kt", l = {257}, m = "invokeSuspend", v = 1)
    public static final class a extends m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f14636t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f14637u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f14638v;

        public a(nt.b<? super a> bVar) {
            super(2, bVar);
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new a(bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f14638v;
            if (i10 == 0) {
                o.b(obj);
                if (h.hasUnlockedAllStreaks.get()) {
                    Log.i("rbx.achievements.playgames", "Already unlocked all streak achievements, skipping check");
                    return Unit.f22483a;
                }
                sl.b bVarA = com.roblox.universalapp.achievement.b.f9774a.a();
                if (bVarA != null) {
                    this.f14636t = pt.l.a(bVarA);
                    this.f14637u = 0;
                    this.f14638v = 1;
                    obj = bVarA.g(this);
                    if (obj == objE) {
                        return objE;
                    }
                }
                return Unit.f22483a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(q.u(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(((Achievement) it.next()).getCodeName());
            }
            Set setQ0 = CollectionsKt.Q0(arrayList);
            List<Achievement> listA = di.b.a();
            ArrayList arrayList2 = new ArrayList(q.u(listA, 10));
            Iterator<T> it2 = listA.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((Achievement) it2.next()).getRobloxId());
            }
            List listU0 = CollectionsKt.u0(arrayList2, setQ0);
            Log.i("rbx.achievements.playgames", "Locked streak achievements: " + listU0);
            h.hasUnlockedAllStreaks.set(listU0.isEmpty());
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @pt.f(c = "com.roblox.client.googleplaygames.PlayGamesIntegration", f = "PlayGamesIntegration.kt", l = {230}, m = "isPgsAuthenticated-gIAlu-s", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b extends pt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f14639t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f14640u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f14642w;

        public b(nt.b<? super b> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f14640u = obj;
            this.f14642w |= Integer.MIN_VALUE;
            Object objK = h.this.k(null, this);
            return objK == ot.c.e() ? objK : n.a(objK);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lku/p0;", "Ljt/n;", "", "<anonymous>", "(Lku/p0;)Ljt/n;"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.roblox.client.googleplaygames.PlayGamesIntegration$isPgsAuthenticated$2", f = "PlayGamesIntegration.kt", l = {232}, m = "invokeSuspend", v = 1)
    public static final class c extends m implements Function2<p0, nt.b<? super n<? extends Boolean>>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f14643t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f14644u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f14645v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f14646w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ da.e f14647x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(da.e eVar, nt.b<? super c> bVar) {
            super(2, bVar);
            this.f14647x = eVar;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            c cVar = new c(this.f14647x, bVar);
            cVar.f14646w = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(p0 p0Var, nt.b<? super n<? extends Boolean>> bVar) {
            return invoke2(p0Var, (nt.b<? super n<Boolean>>) bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objB;
            p0 p0Var = (p0) this.f14646w;
            Object objE = ot.c.e();
            int i10 = this.f14645v;
            try {
                if (i10 == 0) {
                    o.b(obj);
                    da.e eVar = this.f14647x;
                    n.Companion companion = n.INSTANCE;
                    Task<da.c> taskA = eVar.a();
                    Intrinsics.checkNotNullExpressionValue(taskA, "isAuthenticated(...)");
                    this.f14646w = pt.l.a(p0Var);
                    this.f14643t = pt.l.a(p0Var);
                    this.f14644u = 0;
                    this.f14645v = 1;
                    obj = vu.b.a(taskA, this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                }
                objB = n.b(pt.b.a(((da.c) obj).a()));
            } catch (Throwable th2) {
                n.Companion companion2 = n.INSTANCE;
                objB = n.b(o.a(th2));
            }
            n nVarA = n.a(objB);
            Object value = nVarA.getValue();
            if (n.g(value)) {
                value = null;
            }
            Boolean bool = (Boolean) value;
            Log.i("rbx.achievements.playgames", "PGS isAuthenticated: " + (bool != null ? bool.booleanValue() : false));
            return nVarA;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(p0 p0Var, nt.b<? super n<Boolean>> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.roblox.client.googleplaygames.PlayGamesIntegration$onAppCreate$1", f = "PlayGamesIntegration.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class d extends m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f14648t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Context f14649u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context, nt.b<? super d> bVar) {
            super(2, bVar);
            this.f14649u = context;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new d(this.f14649u, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            ot.c.e();
            if (this.f14648t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            Context context = this.f14649u;
            Intrinsics.checkNotNull(context);
            com.roblox.universalapp.achievement.b.b(context);
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.roblox.client.googleplaygames.PlayGamesIntegration$onCreate$1", f = "PlayGamesIntegration.kt", l = {163}, m = "invokeSuspend", v = 1)
    public static final class e extends m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f14650t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ j.b f14651u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ sl.b f14652v;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
        @pt.f(c = "com.roblox.client.googleplaygames.PlayGamesIntegration$onCreate$1$1", f = "PlayGamesIntegration.kt", l = {164, 196}, m = "invokeSuspend", v = 1)
        public static final class a extends m implements Function2<p0, nt.b<? super Unit>, Object> {
            public final /* synthetic */ j.b A;
            public final /* synthetic */ sl.b B;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public Object f14653t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public Object f14654u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public Object f14655v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public boolean f14656w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public int f14657x;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            public int f14658y;

            /* JADX INFO: renamed from: z, reason: collision with root package name */
            public /* synthetic */ Object f14659z;

            /* JADX INFO: renamed from: di.h$e$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
            @pt.f(c = "com.roblox.client.googleplaygames.PlayGamesIntegration$onCreate$1$1$1$1", f = "PlayGamesIntegration.kt", l = {181, 192}, m = "invokeSuspend", v = 1)
            public static final class C0270a extends m implements Function2<p0, nt.b<? super Unit>, Object> {

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public Object f14660t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public Object f14661u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                public int f14662v;

                /* JADX INFO: renamed from: w, reason: collision with root package name */
                public int f14663w;

                /* JADX INFO: renamed from: x, reason: collision with root package name */
                public /* synthetic */ Object f14664x;

                /* JADX INFO: renamed from: y, reason: collision with root package name */
                public final /* synthetic */ w f14665y;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0270a(w wVar, nt.b<? super C0270a> bVar) {
                    super(2, bVar);
                    this.f14665y = wVar;
                }

                @Override // pt.a
                public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
                    C0270a c0270a = new C0270a(this.f14665y, bVar);
                    c0270a.f14664x = obj;
                    return c0270a;
                }

                /* JADX WARN: Code restructure failed: missing block: B:32:0x00b5, code lost:
                
                    if (r5.i(r9) == r1) goto L33;
                 */
                @Override // pt.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                    /*
                        r9 = this;
                        java.lang.Object r0 = r9.f14664x
                        ku.p0 r0 = (ku.p0) r0
                        java.lang.Object r1 = ot.c.e()
                        int r2 = r9.f14663w
                        r3 = 2
                        r4 = 0
                        java.lang.String r5 = "rbx.achievements.playgames"
                        r6 = 1
                        if (r2 == 0) goto L30
                        if (r2 == r6) goto L26
                        if (r2 != r3) goto L1e
                        java.lang.Object r0 = r9.f14661u
                        java.io.Serializable r0 = (java.io.Serializable) r0
                        jt.o.b(r10)
                        goto Lb8
                    L1e:
                        java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r10.<init>(r0)
                        throw r10
                    L26:
                        java.lang.Object r2 = r9.f14660t
                        ku.p0 r2 = (ku.p0) r2
                        jt.o.b(r10)     // Catch: java.lang.Throwable -> L2e
                        goto L53
                    L2e:
                        r10 = move-exception
                        goto L5a
                    L30:
                        jt.o.b(r10)
                        java.lang.String r10 = "starting one time remote to local sync"
                        android.util.Log.i(r5, r10)
                        sl.w r10 = r9.f14665y
                        jt.n$a r2 = jt.n.INSTANCE     // Catch: java.lang.Throwable -> L2e
                        java.lang.Object r2 = pt.l.a(r0)     // Catch: java.lang.Throwable -> L2e
                        r9.f14664x = r2     // Catch: java.lang.Throwable -> L2e
                        java.lang.Object r2 = pt.l.a(r0)     // Catch: java.lang.Throwable -> L2e
                        r9.f14660t = r2     // Catch: java.lang.Throwable -> L2e
                        r9.f14662v = r4     // Catch: java.lang.Throwable -> L2e
                        r9.f14663w = r6     // Catch: java.lang.Throwable -> L2e
                        java.lang.Object r10 = r10.d(r9)     // Catch: java.lang.Throwable -> L2e
                        if (r10 != r1) goto L53
                        goto Lb7
                    L53:
                        java.io.Serializable r10 = (java.io.Serializable) r10     // Catch: java.lang.Throwable -> L2e
                        java.lang.Object r10 = jt.n.b(r10)     // Catch: java.lang.Throwable -> L2e
                        goto L64
                    L5a:
                        jt.n$a r2 = jt.n.INSTANCE
                        java.lang.Object r10 = jt.o.a(r10)
                        java.lang.Object r10 = jt.n.b(r10)
                    L64:
                        java.lang.Throwable r2 = jt.n.e(r10)
                        java.lang.String r7 = "local"
                        if (r2 == 0) goto L80
                        java.lang.String r8 = "unable to sync remote to local"
                        android.util.Log.w(r5, r8, r2)
                        th.i r2 = th.h.a()
                        boolean r2 = r2.A()
                        if (r2 == 0) goto L80
                        sl.t r2 = sl.t.f31178a
                        r2.o(r7, r4)
                    L80:
                        boolean r2 = jt.n.h(r10)
                        if (r2 == 0) goto Lb8
                        r2 = r10
                        java.io.Serializable r2 = (java.io.Serializable) r2
                        java.lang.String r8 = "remote to local sync completed"
                        android.util.Log.i(r5, r8)
                        th.i r5 = th.h.a()
                        boolean r5 = r5.A()
                        if (r5 == 0) goto L9d
                        sl.t r5 = sl.t.f31178a
                        r5.o(r7, r6)
                    L9d:
                        di.h r5 = di.h.f14632a
                        java.lang.Object r0 = pt.l.a(r0)
                        r9.f14664x = r0
                        r9.f14660t = r10
                        java.lang.Object r10 = pt.l.a(r2)
                        r9.f14661u = r10
                        r9.f14662v = r4
                        r9.f14663w = r3
                        java.lang.Object r10 = di.h.b(r5, r9)
                        if (r10 != r1) goto Lb8
                    Lb7:
                        return r1
                    Lb8:
                        kotlin.Unit r10 = kotlin.Unit.f22483a
                        return r10
                    */
                    throw new UnsupportedOperationException("Method not decompiled: di.h.e.a.C0270a.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
                    return ((C0270a) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
            @pt.f(c = "com.roblox.client.googleplaygames.PlayGamesIntegration$onCreate$1$1$1$2", f = "PlayGamesIntegration.kt", l = {}, m = "invokeSuspend", v = 1)
            public static final class b extends m implements Function2<p0, nt.b<? super Unit>, Object> {

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public int f14666t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public /* synthetic */ Object f14667u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                public final /* synthetic */ w f14668v;

                /* JADX INFO: renamed from: di.h$e$a$b$a, reason: collision with other inner class name */
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
                @pt.f(c = "com.roblox.client.googleplaygames.PlayGamesIntegration$onCreate$1$1$1$2$1", f = "PlayGamesIntegration.kt", l = {197}, m = "invokeSuspend", v = 1)
                public static final class C0271a extends m implements Function2<p0, nt.b<? super Unit>, Object> {

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    public int f14669t;

                    /* JADX INFO: renamed from: u, reason: collision with root package name */
                    public final /* synthetic */ w f14670u;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0271a(w wVar, nt.b<? super C0271a> bVar) {
                        super(2, bVar);
                        this.f14670u = wVar;
                    }

                    @Override // pt.a
                    public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
                        return new C0271a(this.f14670u, bVar);
                    }

                    @Override // pt.a
                    public final Object invokeSuspend(Object obj) {
                        Object objE = ot.c.e();
                        int i10 = this.f14669t;
                        if (i10 == 0) {
                            o.b(obj);
                            h hVar = h.f14632a;
                            w wVar = this.f14670u;
                            this.f14669t = 1;
                            if (hVar.r(wVar, this) == objE) {
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
                        return ((C0271a) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(w wVar, nt.b<? super b> bVar) {
                    super(2, bVar);
                    this.f14668v = wVar;
                }

                @Override // pt.a
                public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
                    b bVar2 = new b(this.f14668v, bVar);
                    bVar2.f14667u = obj;
                    return bVar2;
                }

                @Override // pt.a
                public final Object invokeSuspend(Object obj) {
                    p0 p0Var = (p0) this.f14667u;
                    ot.c.e();
                    if (this.f14666t != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                    ku.k.d(p0Var, null, null, new C0271a(this.f14668v, null), 3, null);
                    return Unit.f22483a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
                    return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(j.b bVar, sl.b bVar2, nt.b<? super a> bVar3) {
                super(2, bVar3);
                this.A = bVar;
                this.B = bVar2;
            }

            @Override // pt.a
            public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
                a aVar = new a(this.A, this.B, bVar);
                aVar.f14659z = obj;
                return aVar;
            }

            /* JADX WARN: Code duplicated, block: B:27:0x00ce  */
            @Override // pt.a
            public final Object invokeSuspend(Object obj) {
                Object objK;
                Object obj2;
                Throwable thE;
                p0 p0Var = (p0) this.f14659z;
                Object objE = ot.c.e();
                int i10 = this.f14658y;
                if (i10 == 0) {
                    o.b(obj);
                    h hVar = h.f14632a;
                    da.e eVarB = da.g.b(this.A);
                    Intrinsics.checkNotNullExpressionValue(eVarB, "getGamesSignInClient(...)");
                    this.f14659z = p0Var;
                    this.f14658y = 1;
                    objK = hVar.k(eVarB, this);
                    if (objK != objE) {
                    }
                    return objE;
                }
                if (i10 == 1) {
                    o.b(obj);
                    objK = ((n) obj).getValue();
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj2 = this.f14653t;
                    o.b(obj);
                }
                objK = obj2;
                thE = n.e(objK);
                if (thE != null) {
                    Log.w("rbx.achievements.playgames", "GooglePlayGames signIn failed exceptionally", thE);
                }
                return Unit.f22483a;
                j.b bVar = this.A;
                sl.b bVar2 = this.B;
                if (n.h(objK)) {
                    boolean zBooleanValue = ((Boolean) objK).booleanValue();
                    if (th.h.a().A()) {
                        t.f31178a.m(zBooleanValue);
                    }
                    if (zBooleanValue) {
                        da.a aVarA = da.g.a(bVar);
                        Intrinsics.checkNotNullExpressionValue(aVarA, "getAchievementsClient(...)");
                        di.j jVar = new di.j(aVarA);
                        w wVar = new w(bVar2, jVar);
                        ku.k.d(p0Var, null, null, new C0270a(wVar, null), 3, null);
                        androidx.lifecycle.l.b bVar3 = androidx.lifecycle.l.b.RESUMED;
                        b bVar4 = new b(wVar, null);
                        this.f14659z = pt.l.a(p0Var);
                        this.f14653t = objK;
                        this.f14654u = pt.l.a(wVar);
                        this.f14655v = pt.l.a(jVar);
                        this.f14656w = zBooleanValue;
                        this.f14657x = 0;
                        this.f14658y = 2;
                        if (j0.b(bVar, bVar3, bVar4, this) != objE) {
                            obj2 = objK;
                            objK = obj2;
                        }
                        return objE;
                    }
                    pt.b.d(Log.w("rbx.achievements.playgames", "PGS is not authenticated."));
                }
                thE = n.e(objK);
                if (thE != null) {
                    Log.w("rbx.achievements.playgames", "GooglePlayGames signIn failed exceptionally", thE);
                }
                return Unit.f22483a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
                return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(j.b bVar, sl.b bVar2, nt.b<? super e> bVar3) {
            super(2, bVar3);
            this.f14651u = bVar;
            this.f14652v = bVar2;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new e(this.f14651u, this.f14652v, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f14650t;
            if (i10 == 0) {
                o.b(obj);
                j.b bVar = this.f14651u;
                androidx.lifecycle.l.b bVar2 = androidx.lifecycle.l.b.CREATED;
                a aVar = new a(bVar, this.f14652v, null);
                this.f14650t = 1;
                if (j0.b(bVar, bVar2, aVar, this) == objE) {
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
            return ((e) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.roblox.client.googleplaygames.PlayGamesIntegration$onHomePageInteractive$1", f = "PlayGamesIntegration.kt", l = {R.styleable.AppCompatTheme_windowMinWidthMajor}, m = "invokeSuspend", v = 1)
    public static final class f extends m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f14671t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ e4.q f14672u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e4.q qVar, nt.b<? super f> bVar) {
            super(2, bVar);
            this.f14672u = qVar;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new f(this.f14672u, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f14671t;
            if (i10 == 0) {
                o.b(obj);
                d2 d2Var = h.achievementsInitJob;
                if (d2Var != null) {
                    this.f14671t = 1;
                    if (d2Var.L(this) == objE) {
                        return objE;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            this.f14672u.a().a(h.f14632a);
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((f) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.roblox.client.googleplaygames.PlayGamesIntegration$onHomePageLoaded$1", f = "PlayGamesIntegration.kt", l = {148}, m = "invokeSuspend", v = 1)
    public static final class g extends m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f14673t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ e4.q f14674u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(e4.q qVar, nt.b<? super g> bVar) {
            super(2, bVar);
            this.f14674u = qVar;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new g(this.f14674u, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f14673t;
            if (i10 == 0) {
                o.b(obj);
                d2 d2Var = h.achievementsInitJob;
                if (d2Var != null) {
                    this.f14673t = 1;
                    if (d2Var.L(this) == objE) {
                        return objE;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            this.f14674u.a().a(h.f14632a);
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((g) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    /* JADX INFO: renamed from: di.h$h, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.roblox.client.googleplaygames.PlayGamesIntegration$onStop$1", f = "PlayGamesIntegration.kt", l = {211}, m = "invokeSuspend", v = 1)
    public static final class C0272h extends m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f14675t;

        public C0272h(nt.b<? super C0272h> bVar) {
            super(2, bVar);
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new C0272h(bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f14675t;
            if (i10 == 0) {
                o.b(obj);
                l lVarJ = h.f14632a.j();
                this.f14675t = 1;
                if (lVarJ.l(this) == objE) {
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
            return ((C0272h) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)Ljava/lang/Object;"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.roblox.client.googleplaygames.PlayGamesIntegration$repeatOnResumed$2", f = "PlayGamesIntegration.kt", l = {218, 219}, m = "invokeSuspend", v = 1)
    public static final class i extends m implements Function2<p0, nt.b<? super Object>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f14676t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ w f14677u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(w wVar, nt.b<? super i> bVar) {
            super(2, bVar);
            this.f14677u = wVar;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new i(this.f14677u, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(p0 p0Var, nt.b<? super Object> bVar) {
            return invoke2(p0Var, (nt.b<Object>) bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f14676t;
            try {
                if (i10 == 0) {
                    o.b(obj);
                    h hVar = h.f14632a;
                    this.f14676t = 1;
                    if (hVar.t(this) == objE) {
                    }
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                    return obj;
                }
                o.b(obj);
                w wVar = this.f14677u;
                this.f14676t = 2;
                Object objC = wVar.c(this);
                return objC == objE ? objE : objC;
            } catch (CancellationException e10) {
                throw e10;
            } catch (Exception e11) {
                Log.w("rbx.achievements.playgames", "unable to continue achievement sync", e11);
                if (th.h.a().A()) {
                    t.f31178a.o("remote", false);
                }
                return Unit.f22483a;
            }
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(p0 p0Var, nt.b<Object> bVar) {
            return ((i) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @pt.f(c = "com.roblox.client.googleplaygames.PlayGamesIntegration", f = "PlayGamesIntegration.kt", l = {240, 243}, m = "startStreakTracker", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class j extends pt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public long f14678t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f14679u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f14681w;

        public j(nt.b<? super j> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f14679u = obj;
            this.f14681w |= Integer.MIN_VALUE;
            return h.this.t(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.roblox.client.googleplaygames.PlayGamesIntegration$updateAndGrantStreak$2", f = "PlayGamesIntegration.kt", l = {272, 274, 278, 282, 286}, m = "invokeSuspend", v = 1)
    public static final class k extends m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f14682t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f14683u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f14684v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f14685w;

        public k(nt.b<? super k> bVar) {
            super(2, bVar);
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new k(bVar);
        }

        /* JADX WARN: Code duplicated, block: B:31:0x00b3  */
        /* JADX WARN: Code duplicated, block: B:37:0x00da  */
        /* JADX WARN: Code duplicated, block: B:40:0x00fb  */
        /* JADX WARN: Code duplicated, block: B:42:0x00ff A[PHI: r1 r4 r5
          0x00ff: PHI (r1v9 int) = (r1v8 int), (r1v10 int) binds: [B:36:0x00d8, B:41:0x00fd] A[DONT_GENERATE, DONT_INLINE]
          0x00ff: PHI (r4v5 int) = (r4v3 int), (r4v7 int) binds: [B:36:0x00d8, B:41:0x00fd] A[DONT_GENERATE, DONT_INLINE]
          0x00ff: PHI (r5v4 sl.b) = (r5v3 sl.b), (r5v5 sl.b) binds: [B:36:0x00d8, B:41:0x00fd] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:44:0x0103  */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00d1, code lost:
        
            if (r1.f(r9, r12) == r0) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0125, code lost:
        
            if (r5.f(r13, r12) == r0) goto L46;
         */
        @Override // pt.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instruction units count: 299
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: di.h.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((k) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    public static final boolean l(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (th.h.a().J5()) {
            return true;
        }
        if (th.h.a().C1() && di.e.f14631a.a(context)) {
            return true;
        }
        if (th.h.a().u0() && th.h.a().l3()) {
            return di.d.e(context);
        }
        return false;
    }

    public static final void m(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (!l(context)) {
            Log.i("rbx.achievements.playgames", "PGS is not enabled - onAppCreate");
            return;
        }
        Context applicationContext = context.getApplicationContext();
        achievementsInitJob = ku.k.d(androidx.p000lifecycle.t.a(h0.INSTANCE.a()), g1.b(), null, new d(applicationContext, null), 2, null);
        da.h.a(applicationContext);
    }

    public static final void n(@NotNull Context context, long btid) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (!l(context)) {
            Log.i("rbx.achievements.playgames", "PGS is not enabled - onBtidObtained");
        } else if (th.h.a().u0()) {
            di.d.f(context, btid);
        }
    }

    public static final void o(@NotNull e4.q activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (!l(activity)) {
            Log.i("rbx.achievements.playgames", "PGS is not enabled - onHomePageInteractive");
        } else {
            observerAttached = true;
            ku.k.d(androidx.p000lifecycle.t.a(activity), null, null, new f(activity, null), 3, null);
        }
    }

    public static final void p(@NotNull e4.q activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (!l(activity)) {
            Log.i("rbx.achievements.playgames", "PGS is not enabled - onHomePageLoaded");
        } else if (observerAttached) {
            ku.k.d(androidx.p000lifecycle.t.a(activity), null, null, new g(activity, null), 3, null);
        }
    }

    public static final void q(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (!l(context)) {
            Log.i("rbx.achievements.playgames", "PGS is not enabled - onSettingsLoaded");
            return;
        }
        if (th.h.a().u0()) {
            di.d.g(context);
        }
        m(context);
    }

    public static final l u() {
        SharedPreferences sharedPreferences = RobloxApplication.f().getSharedPreferences("play_games_streak", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        return new l(sharedPreferences, g1.b(), th.h.a().l2() ? RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS : 86400000L, new c0());
    }

    public final Object i(nt.b<? super Unit> bVar) {
        return ku.i.g(g1.b(), new a(null), bVar);
    }

    @NotNull
    public final l j() {
        return (l) streakTracker.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(da.e eVar, nt.b<? super n<Boolean>> bVar) {
        b bVar2;
        if (bVar instanceof b) {
            bVar2 = (b) bVar;
            int i10 = bVar2.f14642w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar2.f14642w = i10 - Integer.MIN_VALUE;
            } else {
                bVar2 = new b(bVar);
            }
        } else {
            bVar2 = new b(bVar);
        }
        Object objG = bVar2.f14640u;
        Object objE = ot.c.e();
        int i11 = bVar2.f14642w;
        if (i11 == 0) {
            o.b(objG);
            l0 l0VarB = g1.b();
            c cVar = new c(eVar, null);
            bVar2.f14639t = pt.l.a(eVar);
            bVar2.f14642w = 1;
            objG = ku.i.g(l0VarB, cVar, bVar2);
            if (objG == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(objG);
        }
        return ((n) objG).getValue();
    }

    @Override // androidx.p000lifecycle.f
    public void onCreate(@NotNull s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        j.b bVar = owner instanceof j.b ? (j.b) owner : null;
        if (bVar == null) {
            return;
        }
        sl.b bVarA = com.roblox.universalapp.achievement.b.f9774a.a();
        if (bVarA == null) {
            Log.w("rbx.achievements.playgames", "no local achievement storage - google play games disabled");
        } else {
            ku.k.d(androidx.p000lifecycle.t.a(bVar), null, null, new e(bVar, bVarA, null), 3, null);
        }
    }

    @Override // androidx.p000lifecycle.f
    public /* bridge */ void onDestroy(@NotNull s sVar) {
        super.onDestroy(sVar);
    }

    @Override // androidx.p000lifecycle.f
    public /* bridge */ void onPause(@NotNull s sVar) {
        super.onPause(sVar);
    }

    @Override // androidx.p000lifecycle.f
    public /* bridge */ void onResume(@NotNull s sVar) {
        super.onResume(sVar);
    }

    @Override // androidx.p000lifecycle.f
    public /* bridge */ void onStart(@NotNull s sVar) {
        super.onStart(sVar);
    }

    @Override // androidx.p000lifecycle.f
    public void onStop(@NotNull s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        ku.k.d(androidx.p000lifecycle.t.a(owner), null, null, new C0272h(null), 3, null);
    }

    @Nullable
    public final Object r(@NotNull w wVar, @NotNull nt.b<Object> bVar) {
        return ku.i.g(g1.b(), new i(wVar, null), bVar);
    }

    public final boolean s() {
        return !hasUnlockedAllStreaks.get() && fk.e.f16798a.b();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object t(nt.b<? super Unit> bVar) {
        j jVar;
        if (bVar instanceof j) {
            jVar = (j) bVar;
            int i10 = jVar.f14681w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                jVar.f14681w = i10 - Integer.MIN_VALUE;
            } else {
                jVar = new j(bVar);
            }
        } else {
            jVar = new j(bVar);
        }
        Object objA = jVar.f14679u;
        Object objE = ot.c.e();
        int i11 = jVar.f14681w;
        if (i11 == 0) {
            o.b(objA);
            Log.i("rbx.achievements.playgames", "Waiting for valid user id to update streak");
            fk.e eVar = fk.e.f16798a;
            jVar.f14681w = 1;
            objA = eVar.a(jVar);
            if (objA != objE) {
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(objA);
            return objA;
        }
        o.b(objA);
        long jLongValue = ((Number) objA).longValue();
        Log.i("rbx.achievements.playgames", "User id " + jLongValue + " signed in, updating streak");
        jVar.f14678t = jLongValue;
        jVar.f14681w = 2;
        Object objV = v(jVar);
        return objV == objE ? objE : objV;
    }

    public final Object v(nt.b<? super Unit> bVar) {
        return ku.i.g(g1.b(), new k(null), bVar);
    }
}
