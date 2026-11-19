package li;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.p000lifecycle.h0;
import androidx.p000lifecycle.j0;
import androidx.p000lifecycle.s;
import av.d2;
import av.g1;
import av.l0;
import av.p0;
import com.github.luben.zstd.BuildConfig;
import com.google.android.gms.tasks.Task;
import com.roblox.client.RobloxApplication;
import f4.v;
import gm.Achievement;
import gm.LocalAchievement;
import gm.t;
import gm.w;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import ok.d0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.collections.CollectionsKt;
import p001kotlin.collections.q;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;
import zt.n;
import zt.o;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u000bJ\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u0018\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0087@¢\u0006\u0004\b\u001e\u0010\u001fJ\u001e\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\"2\u0006\u0010!\u001a\u00020 H\u0082@¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\tH\u0082@¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0006H\u0002¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\tH\u0082@¢\u0006\u0004\b)\u0010&J\u0012\u0010*\u001a\u0004\u0018\u00010\tH\u0082@¢\u0006\u0004\b*\u0010&R!\u00101\u001a\u00020+8FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b,\u0010-\u0012\u0004\b0\u0010\u0003\u001a\u0004\b.\u0010/R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00108\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u0010<\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006="}, d2 = {"Lli/i;", "Landroidx/lifecycle/f;", "<init>", "()V", "Landroid/content/Context;", "context", BuildConfig.FLAVOR, "l", "(Landroid/content/Context;)Z", BuildConfig.FLAVOR, "q", "(Landroid/content/Context;)V", BuildConfig.FLAVOR, "btid", "n", "(Landroid/content/Context;J)V", "m", "Lf4/v;", "activity", "o", "(Lf4/v;)V", "p", "Landroidx/lifecycle/s;", "owner", "onCreate", "(Landroidx/lifecycle/s;)V", "onStop", "Lgm/w;", "replicator", BuildConfig.FLAVOR, "r", "(Lgm/w;Leu/b;)Ljava/lang/Object;", "Lea/g;", "signInClient", "Lzt/n;", "k", "(Lea/g;Leu/b;)Ljava/lang/Object;", "t", "(Leu/b;)Ljava/lang/Object;", "s", "()Z", "i", "v", "Lli/m;", "b", "Lzt/h;", "j", "()Lli/m;", "getStreakTracker$annotations", "streakTracker", "Ljava/util/concurrent/atomic/AtomicBoolean;", "c", "Ljava/util/concurrent/atomic/AtomicBoolean;", "hasUnlockedAllStreaks", "d", "Z", "observerAttached", "Lav/d2;", "e", "Lav/d2;", "achievementsInitJob", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i implements androidx.p000lifecycle.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final i f22168a = new i();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final zt.h streakTracker = zt.i.a(new Function0() { // from class: li.h
        @Override // p001kotlin.jvm.functions.Function0
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.roblox.client.googleplaygames.PlayGamesIntegration$checkUnlockedAllStreaks$2", f = "PlayGamesIntegration.kt", l = {258}, m = "invokeSuspend", v = 1)
    public static final class a extends gu.m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f22172t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f22173u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f22174v;

        public a(eu.b<? super a> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new a(bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f22174v;
            if (i10 == 0) {
                o.b(obj);
                if (i.hasUnlockedAllStreaks.get()) {
                    Log.i("rbx.achievements.playgames", "Already unlocked all streak achievements, skipping check");
                    return Unit.f21506a;
                }
                gm.b bVarA = com.roblox.universalapp.achievement.b.f9792a.a();
                if (bVarA != null) {
                    this.f22172t = gu.l.a(bVarA);
                    this.f22173u = 0;
                    this.f22174v = 1;
                    obj = bVarA.c(this);
                    if (obj == objE) {
                        return objE;
                    }
                }
                return Unit.f21506a;
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
            List<Achievement> listA = li.b.a();
            ArrayList arrayList2 = new ArrayList(q.u(listA, 10));
            Iterator<T> it2 = listA.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((Achievement) it2.next()).getRobloxId());
            }
            List listU0 = CollectionsKt.u0(arrayList2, setQ0);
            Log.i("rbx.achievements.playgames", "Locked streak achievements: " + listU0);
            i.hasUnlockedAllStreaks.set(listU0.isEmpty());
            return Unit.f21506a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.roblox.client.googleplaygames.PlayGamesIntegration", f = "PlayGamesIntegration.kt", l = {231}, m = "isPgsAuthenticated-gIAlu-s", v = 1)
    public static final class b extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f22175t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f22176u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f22178w;

        public b(eu.b<? super b> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f22176u = obj;
            this.f22178w |= Integer.MIN_VALUE;
            Object objK = i.this.k(null, this);
            return objK == fu.c.e() ? objK : n.a(objK);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lav/p0;", "Lzt/n;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)Lzt/n;"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.roblox.client.googleplaygames.PlayGamesIntegration$isPgsAuthenticated$2", f = "PlayGamesIntegration.kt", l = {233}, m = "invokeSuspend", v = 1)
    public static final class c extends gu.m implements Function2<p0, eu.b<? super n<? extends Boolean>>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f22179t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f22180u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f22181v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f22182w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ ea.g f22183x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ea.g gVar, eu.b<? super c> bVar) {
            super(2, bVar);
            this.f22183x = gVar;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            c cVar = new c(this.f22183x, bVar);
            cVar.f22182w = obj;
            return cVar;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(p0 p0Var, eu.b<? super n<Boolean>> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objB;
            p0 p0Var = (p0) this.f22182w;
            Object objE = fu.c.e();
            int i10 = this.f22181v;
            try {
                if (i10 == 0) {
                    o.b(obj);
                    ea.g gVar = this.f22183x;
                    n.Companion companion = n.INSTANCE;
                    Task<ea.c> taskA = gVar.a();
                    Intrinsics.checkNotNullExpressionValue(taskA, "isAuthenticated(...)");
                    this.f22182w = gu.l.a(p0Var);
                    this.f22179t = gu.l.a(p0Var);
                    this.f22180u = 0;
                    this.f22181v = 1;
                    obj = lv.b.a(taskA, this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                }
                objB = n.b(gu.b.a(((ea.c) obj).a()));
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

        @Override // p001kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(p0 p0Var, eu.b<? super n<? extends Boolean>> bVar) {
            return invoke2(p0Var, (eu.b<? super n<Boolean>>) bVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.roblox.client.googleplaygames.PlayGamesIntegration$onAppCreate$1", f = "PlayGamesIntegration.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class d extends gu.m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f22184t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Context f22185u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context, eu.b<? super d> bVar) {
            super(2, bVar);
            this.f22185u = context;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new d(this.f22185u, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            fu.c.e();
            if (this.f22184t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            Context context = this.f22185u;
            Intrinsics.checkNotNull(context);
            com.roblox.universalapp.achievement.b.b(context);
            return Unit.f21506a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.roblox.client.googleplaygames.PlayGamesIntegration$onCreate$1", f = "PlayGamesIntegration.kt", l = {163}, m = "invokeSuspend", v = 1)
    public static final class e extends gu.m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f22186t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ j.b f22187u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ gm.b f22188v;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
        @gu.f(c = "com.roblox.client.googleplaygames.PlayGamesIntegration$onCreate$1$1", f = "PlayGamesIntegration.kt", l = {164, 197}, m = "invokeSuspend", v = 1)
        public static final class a extends gu.m implements Function2<p0, eu.b<? super Unit>, Object> {
            public final /* synthetic */ j.b A;
            public final /* synthetic */ gm.b B;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public Object f22189t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public Object f22190u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public Object f22191v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public boolean f22192w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public int f22193x;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            public int f22194y;

            /* JADX INFO: renamed from: z, reason: collision with root package name */
            public /* synthetic */ Object f22195z;

            /* JADX INFO: renamed from: li.i$e$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
            @gu.f(c = "com.roblox.client.googleplaygames.PlayGamesIntegration$onCreate$1$1$1$1", f = "PlayGamesIntegration.kt", l = {182, 193}, m = "invokeSuspend", v = 1)
            public static final class C0429a extends gu.m implements Function2<p0, eu.b<? super Unit>, Object> {

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public Object f22196t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public Object f22197u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                public int f22198v;

                /* JADX INFO: renamed from: w, reason: collision with root package name */
                public int f22199w;

                /* JADX INFO: renamed from: x, reason: collision with root package name */
                public /* synthetic */ Object f22200x;

                /* JADX INFO: renamed from: y, reason: collision with root package name */
                public final /* synthetic */ w f22201y;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0429a(w wVar, eu.b<? super C0429a> bVar) {
                    super(2, bVar);
                    this.f22201y = wVar;
                }

                @Override // gu.a
                public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
                    C0429a c0429a = new C0429a(this.f22201y, bVar);
                    c0429a.f22200x = obj;
                    return c0429a;
                }

                @Override // p001kotlin.jvm.functions.Function2
                public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
                    return ((C0429a) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:32:0x00b5, code lost:
                
                    if (r5.i(r9) == r1) goto L33;
                 */
                @Override // gu.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    Object objB;
                    p0 p0Var = (p0) this.f22200x;
                    Object objE = fu.c.e();
                    int i10 = this.f22199w;
                    try {
                        if (i10 != 0) {
                            if (i10 == 1) {
                                o.b(obj);
                            } else {
                                if (i10 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                o.b(obj);
                            }
                            return Unit.f21506a;
                        }
                        o.b(obj);
                        Log.i("rbx.achievements.playgames", "starting one time remote to local sync");
                        w wVar = this.f22201y;
                        n.Companion companion = n.INSTANCE;
                        this.f22200x = gu.l.a(p0Var);
                        this.f22196t = gu.l.a(p0Var);
                        this.f22198v = 0;
                        this.f22199w = 1;
                        obj = wVar.d(this);
                        if (obj == objE) {
                        }
                        return objE;
                        objB = n.b((Serializable) obj);
                    } catch (Throwable th2) {
                        n.Companion companion2 = n.INSTANCE;
                        objB = n.b(o.a(th2));
                    }
                    Throwable thE = n.e(objB);
                    if (thE != null) {
                        Log.w("rbx.achievements.playgames", "unable to sync remote to local", thE);
                        if (bi.h.a().C()) {
                            t.f17799a.o("local", false);
                        }
                    }
                    if (n.h(objB)) {
                        Serializable serializable = (Serializable) objB;
                        Log.i("rbx.achievements.playgames", "remote to local sync completed");
                        if (bi.h.a().C()) {
                            t.f17799a.o("local", true);
                        }
                        i iVar = i.f22168a;
                        this.f22200x = gu.l.a(p0Var);
                        this.f22196t = objB;
                        this.f22197u = gu.l.a(serializable);
                        this.f22198v = 0;
                        this.f22199w = 2;
                    }
                    return Unit.f21506a;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
            @gu.f(c = "com.roblox.client.googleplaygames.PlayGamesIntegration$onCreate$1$1$1$2", f = "PlayGamesIntegration.kt", l = {}, m = "invokeSuspend", v = 1)
            public static final class b extends gu.m implements Function2<p0, eu.b<? super Unit>, Object> {

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public int f22202t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public /* synthetic */ Object f22203u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                public final /* synthetic */ w f22204v;

                /* JADX INFO: renamed from: li.i$e$a$b$a, reason: collision with other inner class name */
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
                @gu.f(c = "com.roblox.client.googleplaygames.PlayGamesIntegration$onCreate$1$1$1$2$1", f = "PlayGamesIntegration.kt", l = {198}, m = "invokeSuspend", v = 1)
                public static final class C0430a extends gu.m implements Function2<p0, eu.b<? super Unit>, Object> {

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    public int f22205t;

                    /* JADX INFO: renamed from: u, reason: collision with root package name */
                    public final /* synthetic */ w f22206u;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0430a(w wVar, eu.b<? super C0430a> bVar) {
                        super(2, bVar);
                        this.f22206u = wVar;
                    }

                    @Override // gu.a
                    public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
                        return new C0430a(this.f22206u, bVar);
                    }

                    @Override // p001kotlin.jvm.functions.Function2
                    public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
                        return ((C0430a) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
                    }

                    @Override // gu.a
                    public final Object invokeSuspend(Object obj) {
                        Object objE = fu.c.e();
                        int i10 = this.f22205t;
                        if (i10 == 0) {
                            o.b(obj);
                            i iVar = i.f22168a;
                            w wVar = this.f22206u;
                            this.f22205t = 1;
                            if (iVar.r(wVar, this) == objE) {
                                return objE;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            o.b(obj);
                        }
                        return Unit.f21506a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(w wVar, eu.b<? super b> bVar) {
                    super(2, bVar);
                    this.f22204v = wVar;
                }

                @Override // gu.a
                public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
                    b bVar2 = new b(this.f22204v, bVar);
                    bVar2.f22203u = obj;
                    return bVar2;
                }

                @Override // p001kotlin.jvm.functions.Function2
                public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
                    return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
                }

                @Override // gu.a
                public final Object invokeSuspend(Object obj) {
                    p0 p0Var = (p0) this.f22203u;
                    fu.c.e();
                    if (this.f22202t != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                    av.k.d(p0Var, null, null, new C0430a(this.f22204v, null), 3, null);
                    return Unit.f21506a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(j.b bVar, gm.b bVar2, eu.b<? super a> bVar3) {
                super(2, bVar3);
                this.A = bVar;
                this.B = bVar2;
            }

            @Override // gu.a
            public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
                a aVar = new a(this.A, this.B, bVar);
                aVar.f22195z = obj;
                return aVar;
            }

            @Override // p001kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
                return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
            }

            /* JADX WARN: Code duplicated, block: B:27:0x00d2  */
            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                Object objK;
                Object obj2;
                Throwable thE;
                p0 p0Var = (p0) this.f22195z;
                Object objE = fu.c.e();
                int i10 = this.f22194y;
                if (i10 == 0) {
                    o.b(obj);
                    i iVar = i.f22168a;
                    ea.g gVarB = ea.i.b(this.A);
                    Intrinsics.checkNotNullExpressionValue(gVarB, "getGamesSignInClient(...)");
                    this.f22195z = p0Var;
                    this.f22194y = 1;
                    objK = iVar.k(gVarB, this);
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
                    obj2 = this.f22189t;
                    o.b(obj);
                }
                objK = obj2;
                thE = n.e(objK);
                if (thE != null) {
                    Log.w("rbx.achievements.playgames", "GooglePlayGames signIn failed exceptionally", thE);
                }
                return Unit.f21506a;
                j.b bVar = this.A;
                gm.b bVar2 = this.B;
                if (n.h(objK)) {
                    boolean zBooleanValue = ((Boolean) objK).booleanValue();
                    if (bi.h.a().C()) {
                        t.f17799a.m(zBooleanValue, li.g.a());
                    }
                    if (zBooleanValue) {
                        ea.a aVarA = ea.i.a(bVar);
                        Intrinsics.checkNotNullExpressionValue(aVarA, "getAchievementsClient(...)");
                        li.k kVar = new li.k(aVarA);
                        w wVar = new w(bVar2, kVar);
                        av.k.d(p0Var, null, null, new C0429a(wVar, null), 3, null);
                        androidx.lifecycle.l.b bVar3 = androidx.lifecycle.l.b.RESUMED;
                        b bVar4 = new b(wVar, null);
                        this.f22195z = gu.l.a(p0Var);
                        this.f22189t = objK;
                        this.f22190u = gu.l.a(kVar);
                        this.f22191v = gu.l.a(wVar);
                        this.f22192w = zBooleanValue;
                        this.f22193x = 0;
                        this.f22194y = 2;
                        if (j0.b(bVar, bVar3, bVar4, this) != objE) {
                            obj2 = objK;
                            objK = obj2;
                        }
                        return objE;
                    }
                    gu.b.c(Log.w("rbx.achievements.playgames", "PGS is not authenticated."));
                }
                thE = n.e(objK);
                if (thE != null) {
                    Log.w("rbx.achievements.playgames", "GooglePlayGames signIn failed exceptionally", thE);
                }
                return Unit.f21506a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(j.b bVar, gm.b bVar2, eu.b<? super e> bVar3) {
            super(2, bVar3);
            this.f22187u = bVar;
            this.f22188v = bVar2;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new e(this.f22187u, this.f22188v, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((e) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f22186t;
            if (i10 == 0) {
                o.b(obj);
                j.b bVar = this.f22187u;
                androidx.lifecycle.l.b bVar2 = androidx.lifecycle.l.b.CREATED;
                a aVar = new a(bVar, this.f22188v, null);
                this.f22186t = 1;
                if (j0.b(bVar, bVar2, aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            return Unit.f21506a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.roblox.client.googleplaygames.PlayGamesIntegration$onHomePageInteractive$1", f = "PlayGamesIntegration.kt", l = {124}, m = "invokeSuspend", v = 1)
    public static final class f extends gu.m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f22207t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ v f22208u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(v vVar, eu.b<? super f> bVar) {
            super(2, bVar);
            this.f22208u = vVar;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new f(this.f22208u, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((f) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f22207t;
            if (i10 == 0) {
                o.b(obj);
                d2 d2Var = i.achievementsInitJob;
                if (d2Var != null) {
                    this.f22207t = 1;
                    if (d2Var.z(this) == objE) {
                        return objE;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            this.f22208u.a().a(i.f22168a);
            return Unit.f21506a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.roblox.client.googleplaygames.PlayGamesIntegration$onHomePageLoaded$1", f = "PlayGamesIntegration.kt", l = {148}, m = "invokeSuspend", v = 1)
    public static final class g extends gu.m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f22209t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ v f22210u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(v vVar, eu.b<? super g> bVar) {
            super(2, bVar);
            this.f22210u = vVar;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new g(this.f22210u, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((g) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f22209t;
            if (i10 == 0) {
                o.b(obj);
                d2 d2Var = i.achievementsInitJob;
                if (d2Var != null) {
                    this.f22209t = 1;
                    if (d2Var.z(this) == objE) {
                        return objE;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            this.f22210u.a().a(i.f22168a);
            return Unit.f21506a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.roblox.client.googleplaygames.PlayGamesIntegration$onStop$1", f = "PlayGamesIntegration.kt", l = {212}, m = "invokeSuspend", v = 1)
    public static final class h extends gu.m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f22211t;

        public h(eu.b<? super h> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new h(bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((h) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f22211t;
            if (i10 == 0) {
                o.b(obj);
                m mVarJ = i.f22168a.j();
                this.f22211t = 1;
                if (mVarJ.l(this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            return Unit.f21506a;
        }
    }

    /* JADX INFO: renamed from: li.i$i, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)Ljava/lang/Object;"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.roblox.client.googleplaygames.PlayGamesIntegration$repeatOnResumed$2", f = "PlayGamesIntegration.kt", l = {219, 220}, m = "invokeSuspend", v = 1)
    public static final class C0431i extends gu.m implements Function2<p0, eu.b<? super Object>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f22212t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ w f22213u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0431i(w wVar, eu.b<? super C0431i> bVar) {
            super(2, bVar);
            this.f22213u = wVar;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new C0431i(this.f22213u, bVar);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(p0 p0Var, eu.b<Object> bVar) {
            return ((C0431i) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f22212t;
            try {
                if (i10 == 0) {
                    o.b(obj);
                    i iVar = i.f22168a;
                    this.f22212t = 1;
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
                w wVar = this.f22213u;
                this.f22212t = 2;
                Object objC = wVar.c(this);
                return objC == objE ? objE : objC;
            } catch (CancellationException e10) {
                throw e10;
            } catch (Exception e11) {
                Log.w("rbx.achievements.playgames", "unable to continue achievement sync", e11);
                if (bi.h.a().C()) {
                    t.f17799a.o("remote", false);
                }
                return Unit.f21506a;
            }
        }

        @Override // p001kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(p0 p0Var, eu.b<? super Object> bVar) {
            return invoke2(p0Var, (eu.b<Object>) bVar);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.roblox.client.googleplaygames.PlayGamesIntegration", f = "PlayGamesIntegration.kt", l = {241, 244}, m = "startStreakTracker", v = 1)
    public static final class j extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public long f22214t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f22215u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f22217w;

        public j(eu.b<? super j> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f22215u = obj;
            this.f22217w |= Integer.MIN_VALUE;
            return i.this.t(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.roblox.client.googleplaygames.PlayGamesIntegration$updateAndGrantStreak$2", f = "PlayGamesIntegration.kt", l = {273, 275, 279, 283, 287}, m = "invokeSuspend", v = 1)
    public static final class k extends gu.m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f22218t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f22219u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f22220v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f22221w;

        public k(eu.b<? super k> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new k(bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((k) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        /* JADX WARN: Code duplicated, block: B:31:0x00b3  */
        /* JADX WARN: Code duplicated, block: B:37:0x00da  */
        /* JADX WARN: Code duplicated, block: B:40:0x00fb  */
        /* JADX WARN: Code duplicated, block: B:42:0x00ff A[PHI: r1 r4 r5
          0x00ff: PHI (r1v9 int) = (r1v8 int), (r1v10 int) binds: [B:36:0x00d8, B:41:0x00fd] A[DONT_GENERATE, DONT_INLINE]
          0x00ff: PHI (r4v5 int) = (r4v3 int), (r4v7 int) binds: [B:36:0x00d8, B:41:0x00fd] A[DONT_GENERATE, DONT_INLINE]
          0x00ff: PHI (r5v4 gm.b) = (r5v3 gm.b), (r5v5 gm.b) binds: [B:36:0x00d8, B:41:0x00fd] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:44:0x0103  */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00d1, code lost:
        
            if (r1.e(r9, r12) == r0) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0125, code lost:
        
            if (r5.e(r13, r12) == r0) goto L46;
         */
        @Override // gu.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i10;
            gm.b bVar;
            int iIntValue;
            gm.b bVar2;
            int i11;
            LocalAchievement localAchievement;
            int i12;
            gm.b bVar3;
            Object objE = fu.c.e();
            int i13 = this.f22221w;
            if (i13 == 0) {
                o.b(obj);
                i iVar = i.f22168a;
                if (!iVar.s()) {
                    Log.i("rbx.achievements.playgames", "Skip updating and granting streak achievements");
                    return Unit.f21506a;
                }
                m mVarJ = iVar.j();
                this.f22221w = 1;
                if (mVarJ.m(this) != objE) {
                }
                return objE;
            }
            if (i13 == 1) {
                o.b(obj);
            } else {
                if (i13 == 2) {
                    int i14 = this.f22219u;
                    gm.b bVar4 = (gm.b) this.f22218t;
                    o.b(obj);
                    i10 = i14;
                    bVar = bVar4;
                    iIntValue = ((Number) obj).intValue();
                    Log.i("rbx.achievements.playgames", "Current login streak: " + iIntValue);
                    if (iIntValue >= 3) {
                        Log.i("rbx.achievements.playgames", "Granting 3 day streak achievement");
                        LocalAchievement localAchievement2 = new LocalAchievement(li.b.c().getRobloxId(), null, 2, null);
                        this.f22218t = bVar;
                        this.f22219u = i10;
                        this.f22220v = iIntValue;
                        this.f22221w = 3;
                    }
                    bVar2 = bVar;
                    i11 = iIntValue;
                    if (i11 >= 10) {
                        Log.i("rbx.achievements.playgames", "Granting 10 day streak achievement");
                        localAchievement = new LocalAchievement(li.b.b().getRobloxId(), null, 2, null);
                        this.f22218t = bVar2;
                        this.f22219u = i10;
                        this.f22220v = i11;
                        this.f22221w = 4;
                        if (bVar2.e(localAchievement, this) != objE) {
                            i12 = i10;
                            bVar3 = bVar2;
                            bVar2 = bVar3;
                            i10 = i12;
                            if (i11 >= 20) {
                                Log.i("rbx.achievements.playgames", "Granting 20 day streak achievement");
                                LocalAchievement localAchievement3 = new LocalAchievement(li.b.d().getRobloxId(), null, 2, null);
                                this.f22218t = gu.l.a(bVar2);
                                this.f22219u = i10;
                                this.f22220v = i11;
                                this.f22221w = 5;
                            }
                        }
                    } else if (i11 >= 20) {
                        Log.i("rbx.achievements.playgames", "Granting 20 day streak achievement");
                        LocalAchievement localAchievement4 = new LocalAchievement(li.b.d().getRobloxId(), null, 2, null);
                        this.f22218t = gu.l.a(bVar2);
                        this.f22219u = i10;
                        this.f22220v = i11;
                        this.f22221w = 5;
                    }
                    return objE;
                }
                if (i13 == 3) {
                    i11 = this.f22220v;
                    i10 = this.f22219u;
                    bVar2 = (gm.b) this.f22218t;
                    o.b(obj);
                    if (i11 >= 10) {
                        Log.i("rbx.achievements.playgames", "Granting 10 day streak achievement");
                        localAchievement = new LocalAchievement(li.b.b().getRobloxId(), null, 2, null);
                        this.f22218t = bVar2;
                        this.f22219u = i10;
                        this.f22220v = i11;
                        this.f22221w = 4;
                        if (bVar2.e(localAchievement, this) != objE) {
                            i12 = i10;
                            bVar3 = bVar2;
                            bVar2 = bVar3;
                            i10 = i12;
                            if (i11 >= 20) {
                                Log.i("rbx.achievements.playgames", "Granting 20 day streak achievement");
                                LocalAchievement localAchievement5 = new LocalAchievement(li.b.d().getRobloxId(), null, 2, null);
                                this.f22218t = gu.l.a(bVar2);
                                this.f22219u = i10;
                                this.f22220v = i11;
                                this.f22221w = 5;
                            }
                        }
                    } else if (i11 >= 20) {
                        Log.i("rbx.achievements.playgames", "Granting 20 day streak achievement");
                        LocalAchievement localAchievement6 = new LocalAchievement(li.b.d().getRobloxId(), null, 2, null);
                        this.f22218t = gu.l.a(bVar2);
                        this.f22219u = i10;
                        this.f22220v = i11;
                        this.f22221w = 5;
                    }
                    return objE;
                }
                if (i13 == 4) {
                    i11 = this.f22220v;
                    i12 = this.f22219u;
                    bVar3 = (gm.b) this.f22218t;
                    o.b(obj);
                    bVar2 = bVar3;
                    i10 = i12;
                    if (i11 >= 20) {
                        Log.i("rbx.achievements.playgames", "Granting 20 day streak achievement");
                        LocalAchievement localAchievement7 = new LocalAchievement(li.b.d().getRobloxId(), null, 2, null);
                        this.f22218t = gu.l.a(bVar2);
                        this.f22219u = i10;
                        this.f22220v = i11;
                        this.f22221w = 5;
                    }
                } else {
                    if (i13 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                }
            }
            return Unit.f21506a;
            gm.b bVarA = com.roblox.universalapp.achievement.b.f9792a.a();
            if (bVarA != null) {
                m mVarJ2 = i.f22168a.j();
                this.f22218t = bVarA;
                i10 = 0;
                this.f22219u = 0;
                this.f22221w = 2;
                Object objI = mVarJ2.i(this);
                if (objI != objE) {
                    bVar = bVarA;
                    obj = objI;
                    iIntValue = ((Number) obj).intValue();
                    Log.i("rbx.achievements.playgames", "Current login streak: " + iIntValue);
                    if (iIntValue >= 3) {
                        Log.i("rbx.achievements.playgames", "Granting 3 day streak achievement");
                        LocalAchievement localAchievement8 = new LocalAchievement(li.b.c().getRobloxId(), null, 2, null);
                        this.f22218t = bVar;
                        this.f22219u = i10;
                        this.f22220v = iIntValue;
                        this.f22221w = 3;
                    }
                    bVar2 = bVar;
                    i11 = iIntValue;
                    if (i11 >= 10) {
                        Log.i("rbx.achievements.playgames", "Granting 10 day streak achievement");
                        localAchievement = new LocalAchievement(li.b.b().getRobloxId(), null, 2, null);
                        this.f22218t = bVar2;
                        this.f22219u = i10;
                        this.f22220v = i11;
                        this.f22221w = 4;
                        if (bVar2.e(localAchievement, this) != objE) {
                            i12 = i10;
                            bVar3 = bVar2;
                            bVar2 = bVar3;
                            i10 = i12;
                            if (i11 >= 20) {
                                Log.i("rbx.achievements.playgames", "Granting 20 day streak achievement");
                                LocalAchievement localAchievement9 = new LocalAchievement(li.b.d().getRobloxId(), null, 2, null);
                                this.f22218t = gu.l.a(bVar2);
                                this.f22219u = i10;
                                this.f22220v = i11;
                                this.f22221w = 5;
                            }
                        }
                    } else if (i11 >= 20) {
                        Log.i("rbx.achievements.playgames", "Granting 20 day streak achievement");
                        LocalAchievement localAchievement10 = new LocalAchievement(li.b.d().getRobloxId(), null, 2, null);
                        this.f22218t = gu.l.a(bVar2);
                        this.f22219u = i10;
                        this.f22220v = i11;
                        this.f22221w = 5;
                    }
                }
                return objE;
            }
            return Unit.f21506a;
        }
    }

    public static final boolean l(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (bi.h.a().R5()) {
            return true;
        }
        if (bi.h.a().M1() && li.f.f22167a.b()) {
            return true;
        }
        if (bi.h.a().C0() && bi.h.a().y3()) {
            return li.d.e(context);
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
        achievementsInitJob = av.k.d(androidx.p000lifecycle.t.a(h0.INSTANCE.a()), g1.b(), null, new d(applicationContext, null), 2, null);
        ea.j.a(applicationContext);
    }

    public static final void n(@NotNull Context context, long btid) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (!l(context)) {
            Log.i("rbx.achievements.playgames", "PGS is not enabled - onBtidObtained");
        } else if (bi.h.a().C0()) {
            li.d.f(context, btid);
        }
    }

    public static final void o(@NotNull v activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (!l(activity)) {
            Log.i("rbx.achievements.playgames", "PGS is not enabled - onHomePageInteractive");
        } else {
            observerAttached = true;
            av.k.d(androidx.p000lifecycle.t.a(activity), null, null, new f(activity, null), 3, null);
        }
    }

    public static final void p(@NotNull v activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (!l(activity)) {
            Log.i("rbx.achievements.playgames", "PGS is not enabled - onHomePageLoaded");
        } else if (observerAttached) {
            av.k.d(androidx.p000lifecycle.t.a(activity), null, null, new g(activity, null), 3, null);
        }
    }

    public static final void q(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (!l(context)) {
            Log.i("rbx.achievements.playgames", "PGS is not enabled - onSettingsLoaded");
            return;
        }
        if (bi.h.a().C0()) {
            li.d.g(context);
        }
        m(context);
    }

    public static final m u() {
        SharedPreferences sharedPreferences = RobloxApplication.f().getSharedPreferences("play_games_streak", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        return new m(sharedPreferences, g1.b(), bi.h.a().x2() ? 60000L : 86400000L, new d0());
    }

    public final Object i(eu.b<? super Unit> bVar) {
        return av.i.g(g1.b(), new a(null), bVar);
    }

    @NotNull
    public final m j() {
        return (m) streakTracker.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(ea.g gVar, eu.b<? super n<Boolean>> bVar) {
        b bVar2;
        if (bVar instanceof b) {
            bVar2 = (b) bVar;
            int i10 = bVar2.f22178w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar2.f22178w = i10 - Integer.MIN_VALUE;
            } else {
                bVar2 = new b(bVar);
            }
        } else {
            bVar2 = new b(bVar);
        }
        Object objG = bVar2.f22176u;
        Object objE = fu.c.e();
        int i11 = bVar2.f22178w;
        if (i11 == 0) {
            o.b(objG);
            l0 l0VarB = g1.b();
            c cVar = new c(gVar, null);
            bVar2.f22175t = gu.l.a(gVar);
            bVar2.f22178w = 1;
            objG = av.i.g(l0VarB, cVar, bVar2);
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
        gm.b bVarA = com.roblox.universalapp.achievement.b.f9792a.a();
        if (bVarA == null) {
            Log.w("rbx.achievements.playgames", "no local achievement storage - google play games disabled");
        } else {
            av.k.d(androidx.p000lifecycle.t.a(bVar), null, null, new e(bVar, bVarA, null), 3, null);
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
        av.k.d(androidx.p000lifecycle.t.a(owner), null, null, new h(null), 3, null);
    }

    @Nullable
    public final Object r(@NotNull w wVar, @NotNull eu.b<Object> bVar) {
        return av.i.g(g1.b(), new C0431i(wVar, null), bVar);
    }

    public final boolean s() {
        return !hasUnlockedAllStreaks.get() && nk.e.f25810a.b();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object t(eu.b<? super Unit> bVar) {
        j jVar;
        if (bVar instanceof j) {
            jVar = (j) bVar;
            int i10 = jVar.f22217w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                jVar.f22217w = i10 - Integer.MIN_VALUE;
            } else {
                jVar = new j(bVar);
            }
        } else {
            jVar = new j(bVar);
        }
        Object objA = jVar.f22215u;
        Object objE = fu.c.e();
        int i11 = jVar.f22217w;
        if (i11 == 0) {
            o.b(objA);
            Log.i("rbx.achievements.playgames", "Waiting for valid user id to update streak");
            nk.e eVar = nk.e.f25810a;
            jVar.f22217w = 1;
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
        jVar.f22214t = jLongValue;
        jVar.f22217w = 2;
        Object objV = v(jVar);
        return objV == objE ? objE : objV;
    }

    public final Object v(eu.b<? super Unit> bVar) {
        return av.i.g(g1.b(), new k(null), bVar);
    }
}
