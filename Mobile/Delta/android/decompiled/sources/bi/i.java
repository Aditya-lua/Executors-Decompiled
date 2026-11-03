package bi;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.p000lifecycle.h0;
import androidx.p000lifecycle.j0;
import androidx.p000lifecycle.s;
import com.appsflyer.R;
import com.google.android.gms.tasks.Task;
import com.roblox.client.RobloxApplication;
import ek.d0;
import gt.n;
import gt.o;
import iu.d2;
import iu.g1;
import iu.l0;
import iu.p0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.RealWebSocket;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ql.Achievement;
import ql.t;
import ql.w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u000bJ\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u0018\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0087@¢\u0006\u0004\b\u001e\u0010\u001fJ\u001e\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\"2\u0006\u0010!\u001a\u00020 H\u0082@¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\tH\u0082@¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0006H\u0002¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\tH\u0082@¢\u0006\u0004\b)\u0010&J\u0012\u0010*\u001a\u0004\u0018\u00010\tH\u0082@¢\u0006\u0004\b*\u0010&R!\u00101\u001a\u00020+8FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b,\u0010-\u0012\u0004\b0\u0010\u0003\u001a\u0004\b.\u0010/R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00108\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u0010<\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006="}, d2 = {"Lbi/i;", "Landroidx/lifecycle/f;", "<init>", "()V", "Landroid/content/Context;", "context", "", "l", "(Landroid/content/Context;)Z", "", "q", "(Landroid/content/Context;)V", "", "btid", "n", "(Landroid/content/Context;J)V", "m", "Le4/q;", "activity", "o", "(Le4/q;)V", "p", "Landroidx/lifecycle/s;", "owner", "onCreate", "(Landroidx/lifecycle/s;)V", "onStop", "Lql/w;", "replicator", "", "r", "(Lql/w;Llt/b;)Ljava/lang/Object;", "Lda/e;", "signInClient", "Lgt/n;", "k", "(Lda/e;Llt/b;)Ljava/lang/Object;", "t", "(Llt/b;)Ljava/lang/Object;", "s", "()Z", "i", "v", "Lbi/m;", "b", "Lgt/h;", "j", "()Lbi/m;", "getStreakTracker$annotations", "streakTracker", "Ljava/util/concurrent/atomic/AtomicBoolean;", "c", "Ljava/util/concurrent/atomic/AtomicBoolean;", "hasUnlockedAllStreaks", "d", "Z", "observerAttached", "Liu/d2;", "e", "Liu/d2;", "achievementsInitJob", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i implements androidx.p000lifecycle.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final i f4224a = new i();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final gt.h streakTracker = gt.i.b(new Function0() { // from class: bi.h
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return i.u();
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

    @nt.f(c = "com.roblox.client.googleplaygames.PlayGamesIntegration$checkUnlockedAllStreaks$2", f = "PlayGamesIntegration.kt", l = {258}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class a extends nt.m implements Function2<p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f4228t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f4229u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f4230v;

        public a(lt.b<? super a> bVar) {
            super(2, bVar);
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return new a(bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = mt.c.e();
            int i10 = this.f4230v;
            if (i10 == 0) {
                o.b(obj);
                if (i.hasUnlockedAllStreaks.get()) {
                    Log.i("rbx.achievements.playgames", "Already unlocked all streak achievements, skipping check");
                    return Unit.f22938a;
                }
                ql.b bVarA = com.roblox.universalapp.achievement.b.f9855a.a();
                if (bVarA != null) {
                    this.f4228t = nt.l.a(bVarA);
                    this.f4229u = 0;
                    this.f4230v = 1;
                    obj = bVarA.c(this);
                    if (obj == objE) {
                        return objE;
                    }
                }
                return Unit.f22938a;
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
            List<Achievement> listA = bi.b.a();
            ArrayList arrayList2 = new ArrayList(q.u(listA, 10));
            Iterator<T> it2 = listA.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((Achievement) it2.next()).getRobloxId());
            }
            List listU0 = CollectionsKt.u0(arrayList2, setQ0);
            Log.i("rbx.achievements.playgames", "Locked streak achievements: " + listU0);
            i.hasUnlockedAllStreaks.set(listU0.isEmpty());
            return Unit.f22938a;
        }
    }

    @nt.f(c = "com.roblox.client.googleplaygames.PlayGamesIntegration", f = "PlayGamesIntegration.kt", l = {231}, m = "isPgsAuthenticated-gIAlu-s", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b extends nt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f4231t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f4232u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f4234w;

        public b(lt.b<? super b> bVar) {
            super(bVar);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f4232u = obj;
            this.f4234w |= Integer.MIN_VALUE;
            Object objK = i.this.k(null, this);
            return objK == mt.c.e() ? objK : n.a(objK);
        }
    }

    @nt.f(c = "com.roblox.client.googleplaygames.PlayGamesIntegration$isPgsAuthenticated$2", f = "PlayGamesIntegration.kt", l = {233}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Liu/p0;", "Lgt/n;", "", "<anonymous>", "(Liu/p0;)Lgt/n;"}, k = 3, mv = {2, 2, 0})
    public static final class c extends nt.m implements Function2<p0, lt.b<? super n<? extends Boolean>>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f4235t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f4236u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f4237v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f4238w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ da.e f4239x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(da.e eVar, lt.b<? super c> bVar) {
            super(2, bVar);
            this.f4239x = eVar;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            c cVar = new c(this.f4239x, bVar);
            cVar.f4238w = obj;
            return cVar;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(p0 p0Var, lt.b<? super n<Boolean>> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objB;
            p0 p0Var = (p0) this.f4238w;
            Object objE = mt.c.e();
            int i10 = this.f4237v;
            try {
                if (i10 == 0) {
                    o.b(obj);
                    da.e eVar = this.f4239x;
                    n.Companion companion = n.INSTANCE;
                    Task<da.c> taskA = eVar.a();
                    Intrinsics.checkNotNullExpressionValue(taskA, "isAuthenticated(...)");
                    this.f4238w = nt.l.a(p0Var);
                    this.f4235t = nt.l.a(p0Var);
                    this.f4236u = 0;
                    this.f4237v = 1;
                    obj = tu.b.a(taskA, this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                }
                objB = n.b(nt.b.a(((da.c) obj).a()));
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

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(p0 p0Var, lt.b<? super n<? extends Boolean>> bVar) {
            return invoke2(p0Var, (lt.b<? super n<Boolean>>) bVar);
        }
    }

    @nt.f(c = "com.roblox.client.googleplaygames.PlayGamesIntegration$onAppCreate$1", f = "PlayGamesIntegration.kt", l = {}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class d extends nt.m implements Function2<p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f4240t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Context f4241u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context, lt.b<? super d> bVar) {
            super(2, bVar);
            this.f4241u = context;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return new d(this.f4241u, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            mt.c.e();
            if (this.f4240t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            Context context = this.f4241u;
            Intrinsics.checkNotNull(context);
            com.roblox.universalapp.achievement.b.b(context);
            return Unit.f22938a;
        }
    }

    @nt.f(c = "com.roblox.client.googleplaygames.PlayGamesIntegration$onCreate$1", f = "PlayGamesIntegration.kt", l = {163}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class e extends nt.m implements Function2<p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f4242t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ j.b f4243u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ ql.b f4244v;

        @nt.f(c = "com.roblox.client.googleplaygames.PlayGamesIntegration$onCreate$1$1", f = "PlayGamesIntegration.kt", l = {164, 197}, m = "invokeSuspend", v = 1)
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
        public static final class a extends nt.m implements Function2<p0, lt.b<? super Unit>, Object> {
            public final /* synthetic */ j.b A;
            public final /* synthetic */ ql.b B;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public Object f4245t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public Object f4246u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public Object f4247v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public boolean f4248w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public int f4249x;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            public int f4250y;

            /* JADX INFO: renamed from: z, reason: collision with root package name */
            public /* synthetic */ Object f4251z;

            /* JADX INFO: renamed from: bi.i$e$a$a, reason: collision with other inner class name */
            @nt.f(c = "com.roblox.client.googleplaygames.PlayGamesIntegration$onCreate$1$1$1$1", f = "PlayGamesIntegration.kt", l = {182, 193}, m = "invokeSuspend", v = 1)
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
            public static final class C0082a extends nt.m implements Function2<p0, lt.b<? super Unit>, Object> {

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public Object f4252t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public Object f4253u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                public int f4254v;

                /* JADX INFO: renamed from: w, reason: collision with root package name */
                public int f4255w;

                /* JADX INFO: renamed from: x, reason: collision with root package name */
                public /* synthetic */ Object f4256x;

                /* JADX INFO: renamed from: y, reason: collision with root package name */
                public final /* synthetic */ w f4257y;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0082a(w wVar, lt.b<? super C0082a> bVar) {
                    super(2, bVar);
                    this.f4257y = wVar;
                }

                @Override // nt.a
                public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
                    C0082a c0082a = new C0082a(this.f4257y, bVar);
                    c0082a.f4256x = obj;
                    return c0082a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
                    return ((C0082a) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:32:0x00b5, code lost:
                
                    if (r5.i(r9) == r1) goto L33;
                 */
                @Override // nt.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                    /*
                        r9 = this;
                        java.lang.Object r0 = r9.f4256x
                        iu.p0 r0 = (iu.p0) r0
                        java.lang.Object r1 = mt.c.e()
                        int r2 = r9.f4255w
                        r3 = 2
                        r4 = 0
                        java.lang.String r5 = "rbx.achievements.playgames"
                        r6 = 1
                        if (r2 == 0) goto L30
                        if (r2 == r6) goto L26
                        if (r2 != r3) goto L1e
                        java.lang.Object r0 = r9.f4253u
                        java.io.Serializable r0 = (java.io.Serializable) r0
                        gt.o.b(r10)
                        goto Lb8
                    L1e:
                        java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r10.<init>(r0)
                        throw r10
                    L26:
                        java.lang.Object r2 = r9.f4252t
                        iu.p0 r2 = (iu.p0) r2
                        gt.o.b(r10)     // Catch: java.lang.Throwable -> L2e
                        goto L53
                    L2e:
                        r10 = move-exception
                        goto L5a
                    L30:
                        gt.o.b(r10)
                        java.lang.String r10 = "starting one time remote to local sync"
                        android.util.Log.i(r5, r10)
                        ql.w r10 = r9.f4257y
                        gt.n$a r2 = gt.n.INSTANCE     // Catch: java.lang.Throwable -> L2e
                        java.lang.Object r2 = nt.l.a(r0)     // Catch: java.lang.Throwable -> L2e
                        r9.f4256x = r2     // Catch: java.lang.Throwable -> L2e
                        java.lang.Object r2 = nt.l.a(r0)     // Catch: java.lang.Throwable -> L2e
                        r9.f4252t = r2     // Catch: java.lang.Throwable -> L2e
                        r9.f4254v = r4     // Catch: java.lang.Throwable -> L2e
                        r9.f4255w = r6     // Catch: java.lang.Throwable -> L2e
                        java.lang.Object r10 = r10.d(r9)     // Catch: java.lang.Throwable -> L2e
                        if (r10 != r1) goto L53
                        goto Lb7
                    L53:
                        java.io.Serializable r10 = (java.io.Serializable) r10     // Catch: java.lang.Throwable -> L2e
                        java.lang.Object r10 = gt.n.b(r10)     // Catch: java.lang.Throwable -> L2e
                        goto L64
                    L5a:
                        gt.n$a r2 = gt.n.INSTANCE
                        java.lang.Object r10 = gt.o.a(r10)
                        java.lang.Object r10 = gt.n.b(r10)
                    L64:
                        java.lang.Throwable r2 = gt.n.e(r10)
                        java.lang.String r7 = "local"
                        if (r2 == 0) goto L80
                        java.lang.String r8 = "unable to sync remote to local"
                        android.util.Log.w(r5, r8, r2)
                        rh.i r2 = rh.h.a()
                        boolean r2 = r2.C()
                        if (r2 == 0) goto L80
                        ql.t r2 = ql.t.f29925a
                        r2.o(r7, r4)
                    L80:
                        boolean r2 = gt.n.h(r10)
                        if (r2 == 0) goto Lb8
                        r2 = r10
                        java.io.Serializable r2 = (java.io.Serializable) r2
                        java.lang.String r8 = "remote to local sync completed"
                        android.util.Log.i(r5, r8)
                        rh.i r5 = rh.h.a()
                        boolean r5 = r5.C()
                        if (r5 == 0) goto L9d
                        ql.t r5 = ql.t.f29925a
                        r5.o(r7, r6)
                    L9d:
                        bi.i r5 = bi.i.f4224a
                        java.lang.Object r0 = nt.l.a(r0)
                        r9.f4256x = r0
                        r9.f4252t = r10
                        java.lang.Object r10 = nt.l.a(r2)
                        r9.f4253u = r10
                        r9.f4254v = r4
                        r9.f4255w = r3
                        java.lang.Object r10 = bi.i.b(r5, r9)
                        if (r10 != r1) goto Lb8
                    Lb7:
                        return r1
                    Lb8:
                        kotlin.Unit r10 = kotlin.Unit.f22938a
                        return r10
                    */
                    throw new UnsupportedOperationException("Method not decompiled: bi.i.e.a.C0082a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            @nt.f(c = "com.roblox.client.googleplaygames.PlayGamesIntegration$onCreate$1$1$1$2", f = "PlayGamesIntegration.kt", l = {}, m = "invokeSuspend", v = 1)
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
            public static final class b extends nt.m implements Function2<p0, lt.b<? super Unit>, Object> {

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public int f4258t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public /* synthetic */ Object f4259u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                public final /* synthetic */ w f4260v;

                /* JADX INFO: renamed from: bi.i$e$a$b$a, reason: collision with other inner class name */
                @nt.f(c = "com.roblox.client.googleplaygames.PlayGamesIntegration$onCreate$1$1$1$2$1", f = "PlayGamesIntegration.kt", l = {198}, m = "invokeSuspend", v = 1)
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
                public static final class C0083a extends nt.m implements Function2<p0, lt.b<? super Unit>, Object> {

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    public int f4261t;

                    /* JADX INFO: renamed from: u, reason: collision with root package name */
                    public final /* synthetic */ w f4262u;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0083a(w wVar, lt.b<? super C0083a> bVar) {
                        super(2, bVar);
                        this.f4262u = wVar;
                    }

                    @Override // nt.a
                    public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
                        return new C0083a(this.f4262u, bVar);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
                        return ((C0083a) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
                    }

                    @Override // nt.a
                    public final Object invokeSuspend(Object obj) {
                        Object objE = mt.c.e();
                        int i10 = this.f4261t;
                        if (i10 == 0) {
                            o.b(obj);
                            i iVar = i.f4224a;
                            w wVar = this.f4262u;
                            this.f4261t = 1;
                            if (iVar.r(wVar, this) == objE) {
                                return objE;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            o.b(obj);
                        }
                        return Unit.f22938a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(w wVar, lt.b<? super b> bVar) {
                    super(2, bVar);
                    this.f4260v = wVar;
                }

                @Override // nt.a
                public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
                    b bVar2 = new b(this.f4260v, bVar);
                    bVar2.f4259u = obj;
                    return bVar2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
                    return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
                }

                @Override // nt.a
                public final Object invokeSuspend(Object obj) {
                    p0 p0Var = (p0) this.f4259u;
                    mt.c.e();
                    if (this.f4258t != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                    iu.k.d(p0Var, null, null, new C0083a(this.f4260v, null), 3, null);
                    return Unit.f22938a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(j.b bVar, ql.b bVar2, lt.b<? super a> bVar3) {
                super(2, bVar3);
                this.A = bVar;
                this.B = bVar2;
            }

            @Override // nt.a
            public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
                a aVar = new a(this.A, this.B, bVar);
                aVar.f4251z = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
                return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
            }

            /* JADX WARN: Code duplicated, block: B:27:0x00d2  */
            @Override // nt.a
            public final Object invokeSuspend(Object obj) {
                Object objK;
                Object obj2;
                Throwable thE;
                p0 p0Var = (p0) this.f4251z;
                Object objE = mt.c.e();
                int i10 = this.f4250y;
                if (i10 == 0) {
                    o.b(obj);
                    i iVar = i.f4224a;
                    da.e eVarB = da.g.b(this.A);
                    Intrinsics.checkNotNullExpressionValue(eVarB, "getGamesSignInClient(...)");
                    this.f4251z = p0Var;
                    this.f4250y = 1;
                    objK = iVar.k(eVarB, this);
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
                    obj2 = this.f4245t;
                    o.b(obj);
                }
                objK = obj2;
                thE = n.e(objK);
                if (thE != null) {
                    Log.w("rbx.achievements.playgames", "GooglePlayGames signIn failed exceptionally", thE);
                }
                return Unit.f22938a;
                j.b bVar = this.A;
                ql.b bVar2 = this.B;
                if (n.h(objK)) {
                    boolean zBooleanValue = ((Boolean) objK).booleanValue();
                    if (rh.h.a().C()) {
                        t.f29925a.m(zBooleanValue, bi.g.a(bVar));
                    }
                    if (zBooleanValue) {
                        da.a aVarA = da.g.a(bVar);
                        Intrinsics.checkNotNullExpressionValue(aVarA, "getAchievementsClient(...)");
                        bi.k kVar = new bi.k(aVarA);
                        w wVar = new w(bVar2, kVar);
                        iu.k.d(p0Var, null, null, new C0082a(wVar, null), 3, null);
                        androidx.lifecycle.l.b bVar3 = androidx.lifecycle.l.b.RESUMED;
                        b bVar4 = new b(wVar, null);
                        this.f4251z = nt.l.a(p0Var);
                        this.f4245t = objK;
                        this.f4246u = nt.l.a(kVar);
                        this.f4247v = nt.l.a(wVar);
                        this.f4248w = zBooleanValue;
                        this.f4249x = 0;
                        this.f4250y = 2;
                        if (j0.b(bVar, bVar3, bVar4, this) != objE) {
                            obj2 = objK;
                            objK = obj2;
                        }
                        return objE;
                    }
                    nt.b.d(Log.w("rbx.achievements.playgames", "PGS is not authenticated."));
                }
                thE = n.e(objK);
                if (thE != null) {
                    Log.w("rbx.achievements.playgames", "GooglePlayGames signIn failed exceptionally", thE);
                }
                return Unit.f22938a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(j.b bVar, ql.b bVar2, lt.b<? super e> bVar3) {
            super(2, bVar3);
            this.f4243u = bVar;
            this.f4244v = bVar2;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return new e(this.f4243u, this.f4244v, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
            return ((e) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = mt.c.e();
            int i10 = this.f4242t;
            if (i10 == 0) {
                o.b(obj);
                j.b bVar = this.f4243u;
                androidx.lifecycle.l.b bVar2 = androidx.lifecycle.l.b.CREATED;
                a aVar = new a(bVar, this.f4244v, null);
                this.f4242t = 1;
                if (j0.b(bVar, bVar2, aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            return Unit.f22938a;
        }
    }

    @nt.f(c = "com.roblox.client.googleplaygames.PlayGamesIntegration$onHomePageInteractive$1", f = "PlayGamesIntegration.kt", l = {R.styleable.AppCompatTheme_windowMinWidthMajor}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class f extends nt.m implements Function2<p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f4263t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ e4.q f4264u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e4.q qVar, lt.b<? super f> bVar) {
            super(2, bVar);
            this.f4264u = qVar;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return new f(this.f4264u, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
            return ((f) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = mt.c.e();
            int i10 = this.f4263t;
            if (i10 == 0) {
                o.b(obj);
                d2 d2Var = i.achievementsInitJob;
                if (d2Var != null) {
                    this.f4263t = 1;
                    if (d2Var.F(this) == objE) {
                        return objE;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            this.f4264u.a().a(i.f4224a);
            return Unit.f22938a;
        }
    }

    @nt.f(c = "com.roblox.client.googleplaygames.PlayGamesIntegration$onHomePageLoaded$1", f = "PlayGamesIntegration.kt", l = {148}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class g extends nt.m implements Function2<p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f4265t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ e4.q f4266u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(e4.q qVar, lt.b<? super g> bVar) {
            super(2, bVar);
            this.f4266u = qVar;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return new g(this.f4266u, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
            return ((g) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = mt.c.e();
            int i10 = this.f4265t;
            if (i10 == 0) {
                o.b(obj);
                d2 d2Var = i.achievementsInitJob;
                if (d2Var != null) {
                    this.f4265t = 1;
                    if (d2Var.F(this) == objE) {
                        return objE;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            this.f4266u.a().a(i.f4224a);
            return Unit.f22938a;
        }
    }

    @nt.f(c = "com.roblox.client.googleplaygames.PlayGamesIntegration$onStop$1", f = "PlayGamesIntegration.kt", l = {212}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class h extends nt.m implements Function2<p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f4267t;

        public h(lt.b<? super h> bVar) {
            super(2, bVar);
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return new h(bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
            return ((h) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = mt.c.e();
            int i10 = this.f4267t;
            if (i10 == 0) {
                o.b(obj);
                m mVarJ = i.f4224a.j();
                this.f4267t = 1;
                if (mVarJ.l(this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            return Unit.f22938a;
        }
    }

    /* JADX INFO: renamed from: bi.i$i, reason: collision with other inner class name */
    @nt.f(c = "com.roblox.client.googleplaygames.PlayGamesIntegration$repeatOnResumed$2", f = "PlayGamesIntegration.kt", l = {219, 220}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)Ljava/lang/Object;"}, k = 3, mv = {2, 2, 0})
    public static final class C0084i extends nt.m implements Function2<p0, lt.b<? super Object>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f4268t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ w f4269u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0084i(w wVar, lt.b<? super C0084i> bVar) {
            super(2, bVar);
            this.f4269u = wVar;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return new C0084i(this.f4269u, bVar);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(p0 p0Var, lt.b<Object> bVar) {
            return ((C0084i) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = mt.c.e();
            int i10 = this.f4268t;
            try {
                if (i10 == 0) {
                    o.b(obj);
                    i iVar = i.f4224a;
                    this.f4268t = 1;
                    if (iVar.t(this) == objE) {
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
                w wVar = this.f4269u;
                this.f4268t = 2;
                Object objC = wVar.c(this);
                return objC == objE ? objE : objC;
            } catch (CancellationException e10) {
                throw e10;
            } catch (Exception e11) {
                Log.w("rbx.achievements.playgames", "unable to continue achievement sync", e11);
                if (rh.h.a().C()) {
                    t.f29925a.o("remote", false);
                }
                return Unit.f22938a;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(p0 p0Var, lt.b<? super Object> bVar) {
            return invoke2(p0Var, (lt.b<Object>) bVar);
        }
    }

    @nt.f(c = "com.roblox.client.googleplaygames.PlayGamesIntegration", f = "PlayGamesIntegration.kt", l = {241, 244}, m = "startStreakTracker", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class j extends nt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public long f4270t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f4271u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f4273w;

        public j(lt.b<? super j> bVar) {
            super(bVar);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f4271u = obj;
            this.f4273w |= Integer.MIN_VALUE;
            return i.this.t(this);
        }
    }

    @nt.f(c = "com.roblox.client.googleplaygames.PlayGamesIntegration$updateAndGrantStreak$2", f = "PlayGamesIntegration.kt", l = {273, 275, 279, 283, 287}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class k extends nt.m implements Function2<p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f4274t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f4275u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f4276v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f4277w;

        public k(lt.b<? super k> bVar) {
            super(2, bVar);
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return new k(bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
            return ((k) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        /* JADX WARN: Code duplicated, block: B:31:0x00b3  */
        /* JADX WARN: Code duplicated, block: B:37:0x00da  */
        /* JADX WARN: Code duplicated, block: B:40:0x00fb  */
        /* JADX WARN: Code duplicated, block: B:42:0x00ff A[PHI: r1 r4 r5
          0x00ff: PHI (r1v9 int) = (r1v8 int), (r1v10 int) binds: [B:36:0x00d8, B:41:0x00fd] A[DONT_GENERATE, DONT_INLINE]
          0x00ff: PHI (r4v5 int) = (r4v3 int), (r4v7 int) binds: [B:36:0x00d8, B:41:0x00fd] A[DONT_GENERATE, DONT_INLINE]
          0x00ff: PHI (r5v4 ql.b) = (r5v3 ql.b), (r5v5 ql.b) binds: [B:36:0x00d8, B:41:0x00fd] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:44:0x0103  */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00d1, code lost:
        
            if (r1.i(r9, r12) == r0) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0125, code lost:
        
            if (r5.i(r13, r12) == r0) goto L46;
         */
        @Override // nt.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instruction units count: 299
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: bi.i.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final boolean l(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (rh.h.a().T5()) {
            return true;
        }
        if (rh.h.a().M1() && bi.f.f4223a.b(context)) {
            return true;
        }
        if (rh.h.a().z0() && rh.h.a().v3()) {
            return bi.d.e(context);
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
        achievementsInitJob = iu.k.d(androidx.p000lifecycle.t.a(h0.INSTANCE.a()), g1.b(), null, new d(applicationContext, null), 2, null);
        da.h.a(applicationContext);
    }

    public static final void n(@NotNull Context context, long btid) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (!l(context)) {
            Log.i("rbx.achievements.playgames", "PGS is not enabled - onBtidObtained");
        } else if (rh.h.a().z0()) {
            bi.d.f(context, btid);
        }
    }

    public static final void o(@NotNull e4.q activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (!l(activity)) {
            Log.i("rbx.achievements.playgames", "PGS is not enabled - onHomePageInteractive");
        } else {
            observerAttached = true;
            iu.k.d(androidx.p000lifecycle.t.a(activity), null, null, new f(activity, null), 3, null);
        }
    }

    public static final void p(@NotNull e4.q activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (!l(activity)) {
            Log.i("rbx.achievements.playgames", "PGS is not enabled - onHomePageLoaded");
        } else if (observerAttached) {
            iu.k.d(androidx.p000lifecycle.t.a(activity), null, null, new g(activity, null), 3, null);
        }
    }

    public static final void q(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (!l(context)) {
            Log.i("rbx.achievements.playgames", "PGS is not enabled - onSettingsLoaded");
            return;
        }
        if (rh.h.a().z0()) {
            bi.d.g(context);
        }
        m(context);
    }

    public static final m u() {
        SharedPreferences sharedPreferences = RobloxApplication.f().getSharedPreferences("play_games_streak", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        return new m(sharedPreferences, g1.b(), rh.h.a().w2() ? RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS : 86400000L, new d0());
    }

    public final Object i(lt.b<? super Unit> bVar) {
        return iu.i.g(g1.b(), new a(null), bVar);
    }

    @NotNull
    public final m j() {
        return (m) streakTracker.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(da.e eVar, lt.b<? super n<Boolean>> bVar) {
        b bVar2;
        if (bVar instanceof b) {
            bVar2 = (b) bVar;
            int i10 = bVar2.f4234w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar2.f4234w = i10 - Integer.MIN_VALUE;
            } else {
                bVar2 = new b(bVar);
            }
        } else {
            bVar2 = new b(bVar);
        }
        Object objG = bVar2.f4232u;
        Object objE = mt.c.e();
        int i11 = bVar2.f4234w;
        if (i11 == 0) {
            o.b(objG);
            l0 l0VarB = g1.b();
            c cVar = new c(eVar, null);
            bVar2.f4231t = nt.l.a(eVar);
            bVar2.f4234w = 1;
            objG = iu.i.g(l0VarB, cVar, bVar2);
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
        ql.b bVarA = com.roblox.universalapp.achievement.b.f9855a.a();
        if (bVarA == null) {
            Log.w("rbx.achievements.playgames", "no local achievement storage - google play games disabled");
        } else {
            iu.k.d(androidx.p000lifecycle.t.a(bVar), null, null, new e(bVar, bVarA, null), 3, null);
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
        iu.k.d(androidx.p000lifecycle.t.a(owner), null, null, new h(null), 3, null);
    }

    @Nullable
    public final Object r(@NotNull w wVar, @NotNull lt.b<Object> bVar) {
        return iu.i.g(g1.b(), new C0084i(wVar, null), bVar);
    }

    public final boolean s() {
        return !hasUnlockedAllStreaks.get() && dk.e.f14994a.b();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object t(lt.b<? super Unit> bVar) {
        j jVar;
        if (bVar instanceof j) {
            jVar = (j) bVar;
            int i10 = jVar.f4273w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                jVar.f4273w = i10 - Integer.MIN_VALUE;
            } else {
                jVar = new j(bVar);
            }
        } else {
            jVar = new j(bVar);
        }
        Object objA = jVar.f4271u;
        Object objE = mt.c.e();
        int i11 = jVar.f4273w;
        if (i11 == 0) {
            o.b(objA);
            Log.i("rbx.achievements.playgames", "Waiting for valid user id to update streak");
            dk.e eVar = dk.e.f14994a;
            jVar.f4273w = 1;
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
        jVar.f4270t = jLongValue;
        jVar.f4273w = 2;
        Object objV = v(jVar);
        return objV == objE ? objE : objV;
    }

    public final Object v(lt.b<? super Unit> bVar) {
        return iu.i.g(g1.b(), new k(null), bVar);
    }
}
