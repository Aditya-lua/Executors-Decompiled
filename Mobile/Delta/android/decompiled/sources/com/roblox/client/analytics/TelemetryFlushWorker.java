package com.roblox.client.analytics;

import android.content.Context;
import android.os.Build;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.roblox.client.analytics.TelemetryFlushWorker;
import com.roblox.engine.jni.NativeReportingInterface;
import ek.q;
import gt.n;
import gt.o;
import iu.g1;
import iu.i;
import iu.k;
import iu.l0;
import iu.q0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nt.f;
import nt.l;
import nt.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rh.h;
import x5.d;
import x5.f0;
import x5.j;
import x5.p0;
import x5.x;
import x5.z;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\u0018\u0000 \u001b2\u00020\u0001:\u0001\rB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nR.\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\r\u0010\u000e\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R.\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0016\u0010\u000e\u0012\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012¨\u0006\u001c"}, d2 = {"Lcom/roblox/client/analytics/TelemetryFlushWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/c$a;", "doWork", "(Llt/b;)Ljava/lang/Object;", "Lkotlin/Function0;", "", "a", "Lkotlin/jvm/functions/Function0;", "e", "()Lkotlin/jvm/functions/Function0;", "setNativeFlushV1$NativeShell_googleProdRelease", "(Lkotlin/jvm/functions/Function0;)V", "getNativeFlushV1$NativeShell_googleProdRelease$annotations", "()V", "nativeFlushV1", "b", "f", "setNativeFlushV2$NativeShell_googleProdRelease", "getNativeFlushV2$NativeShell_googleProdRelease$annotations", "nativeFlushV2", "c", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TelemetryFlushWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Function0<Unit> nativeFlushV1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public Function0<Unit> nativeFlushV2;

    /* JADX INFO: renamed from: com.roblox.client.analytics.TelemetryFlushWorker$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/roblox/client/analytics/TelemetryFlushWorker$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "a", "(Landroid/content/Context;)V", "", "TAG", "Ljava/lang/String;", "WORK_NAME", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            z.a aVarK = new z.a(TelemetryFlushWorker.class).k(new d(x.CONNECTED, false, false, false, 14, null));
            if (Build.VERSION.SDK_INT >= 31) {
                aVarK.l(f0.RUN_AS_NON_EXPEDITED_WORK_REQUEST);
            }
            z zVarB = aVarK.b();
            p0.Companion companion = p0.INSTANCE;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            companion.a(applicationContext).g("TelemetryFlushUniqueWork", j.REPLACE, zVarB);
        }

        public Companion() {
        }
    }

    @f(c = "com.roblox.client.analytics.TelemetryFlushWorker", f = "TelemetryFlushWorker.kt", l = {41}, m = "doWork", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b extends nt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f9001t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f9003v;

        public b(lt.b<? super b> bVar) {
            super(bVar);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f9001t = obj;
            this.f9003v |= Integer.MIN_VALUE;
            return TelemetryFlushWorker.this.doWork(this);
        }
    }

    @f(c = "com.roblox.client.analytics.TelemetryFlushWorker$doWork$2", f = "TelemetryFlushWorker.kt", l = {42}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00070\u0001¢\u0006\u0002\b\u0002*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Liu/p0;", "Landroidx/work/c$a;", "Lkotlin/jvm/internal/EnhancedNullability;", "<anonymous>", "(Liu/p0;)Landroidx/work/c$a;"}, k = 3, mv = {2, 2, 0})
    public static final class c extends m implements Function2<iu.p0, lt.b<? super androidx.work.c.a>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f9004t;

        @f(c = "com.roblox.client.analytics.TelemetryFlushWorker$doWork$2$1", f = "TelemetryFlushWorker.kt", l = {59}, m = "invokeSuspend", v = 1)
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "Landroidx/work/c$a;", "<anonymous>", "(Liu/p0;)Landroidx/work/c$a;"}, k = 3, mv = {2, 2, 0})
        public static final class a extends m implements Function2<iu.p0, lt.b<? super androidx.work.c.a>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public Object f9006t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public int f9007u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public /* synthetic */ Object f9008v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ TelemetryFlushWorker f9009w;

            /* JADX INFO: renamed from: com.roblox.client.analytics.TelemetryFlushWorker$c$a$a, reason: collision with other inner class name */
            @f(c = "com.roblox.client.analytics.TelemetryFlushWorker$doWork$2$1$flushes$1$1", f = "TelemetryFlushWorker.kt", l = {}, m = "invokeSuspend", v = 1)
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)Z"}, k = 3, mv = {2, 2, 0})
            public static final class C0135a extends m implements Function2<iu.p0, lt.b<? super Boolean>, Object> {

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public int f9010t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public /* synthetic */ Object f9011u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                public final /* synthetic */ TelemetryFlushWorker f9012v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0135a(TelemetryFlushWorker telemetryFlushWorker, lt.b<? super C0135a> bVar) {
                    super(2, bVar);
                    this.f9012v = telemetryFlushWorker;
                }

                @Override // nt.a
                public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
                    C0135a c0135a = new C0135a(this.f9012v, bVar);
                    c0135a.f9011u = obj;
                    return c0135a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(iu.p0 p0Var, lt.b<? super Boolean> bVar) {
                    return ((C0135a) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
                }

                @Override // nt.a
                public final Object invokeSuspend(Object obj) {
                    Object objB;
                    mt.c.e();
                    if (this.f9010t != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                    TelemetryFlushWorker telemetryFlushWorker = this.f9012v;
                    try {
                        n.Companion companion = n.INSTANCE;
                        telemetryFlushWorker.e().invoke();
                        objB = n.b(Unit.f22938a);
                    } catch (Throwable th2) {
                        n.Companion companion2 = n.INSTANCE;
                        objB = n.b(o.a(th2));
                    }
                    Throwable thE = n.e(objB);
                    if (thE != null) {
                        q.f("TelemetryFlushWorker", "V1 telemetry flush failed: " + thE.getMessage(), thE);
                    }
                    return nt.b.a(n.g(objB));
                }
            }

            @f(c = "com.roblox.client.analytics.TelemetryFlushWorker$doWork$2$1$flushes$1$2", f = "TelemetryFlushWorker.kt", l = {}, m = "invokeSuspend", v = 1)
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)Z"}, k = 3, mv = {2, 2, 0})
            public static final class b extends m implements Function2<iu.p0, lt.b<? super Boolean>, Object> {

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public int f9013t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public /* synthetic */ Object f9014u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                public final /* synthetic */ TelemetryFlushWorker f9015v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(TelemetryFlushWorker telemetryFlushWorker, lt.b<? super b> bVar) {
                    super(2, bVar);
                    this.f9015v = telemetryFlushWorker;
                }

                @Override // nt.a
                public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
                    b bVar2 = new b(this.f9015v, bVar);
                    bVar2.f9014u = obj;
                    return bVar2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(iu.p0 p0Var, lt.b<? super Boolean> bVar) {
                    return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
                }

                @Override // nt.a
                public final Object invokeSuspend(Object obj) {
                    Object objB;
                    mt.c.e();
                    if (this.f9013t != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                    TelemetryFlushWorker telemetryFlushWorker = this.f9015v;
                    try {
                        n.Companion companion = n.INSTANCE;
                        telemetryFlushWorker.f().invoke();
                        objB = n.b(Unit.f22938a);
                    } catch (Throwable th2) {
                        n.Companion companion2 = n.INSTANCE;
                        objB = n.b(o.a(th2));
                    }
                    Throwable thE = n.e(objB);
                    if (thE != null) {
                        q.f("TelemetryFlushWorker", "V2 telemetry flush failed: " + thE.getMessage(), thE);
                    }
                    return nt.b.a(n.g(objB));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(TelemetryFlushWorker telemetryFlushWorker, lt.b<? super a> bVar) {
                super(2, bVar);
                this.f9009w = telemetryFlushWorker;
            }

            @Override // nt.a
            public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
                a aVar = new a(this.f9009w, bVar);
                aVar.f9008v = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(iu.p0 p0Var, lt.b<? super androidx.work.c.a> bVar) {
                return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
            }

            @Override // nt.a
            public final Object invokeSuspend(Object obj) {
                androidx.work.c.a aVarA;
                iu.p0 p0Var = (iu.p0) this.f9008v;
                Object objE = mt.c.e();
                int i10 = this.f9007u;
                if (i10 == 0) {
                    o.b(obj);
                    TelemetryFlushWorker telemetryFlushWorker = this.f9009w;
                    List listC = kotlin.collections.o.c();
                    if (h.a().R2()) {
                        listC.add(k.b(p0Var, null, null, new C0135a(telemetryFlushWorker, null), 3, null));
                    }
                    if (h.a().f()) {
                        listC.add(k.b(p0Var, null, null, new b(telemetryFlushWorker, null), 3, null));
                    }
                    List listA = kotlin.collections.o.a(listC);
                    this.f9008v = l.a(p0Var);
                    this.f9006t = l.a(listA);
                    this.f9007u = 1;
                    obj = iu.f.a(listA, this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                }
                Iterable iterable = (Iterable) obj;
                if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                    aVarA = androidx.work.c.a.d();
                } else {
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        if (((Boolean) it.next()).booleanValue()) {
                            aVarA = androidx.work.c.a.a();
                        }
                    }
                    aVarA = androidx.work.c.a.d();
                }
                Intrinsics.checkNotNull(aVarA);
                return aVarA;
            }
        }

        public c(lt.b<? super c> bVar) {
            super(2, bVar);
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return TelemetryFlushWorker.this.new c(bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(iu.p0 p0Var, lt.b<? super androidx.work.c.a> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = mt.c.e();
            int i10 = this.f9004t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                return obj;
            }
            o.b(obj);
            a aVar = new a(TelemetryFlushWorker.this, null);
            this.f9004t = 1;
            Object objG = q0.g(aVar, this);
            return objG == objE ? objE : objG;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TelemetryFlushWorker(@NotNull Context appContext, @NotNull WorkerParameters params) {
        super(appContext, params);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(params, "params");
        this.nativeFlushV1 = new Function0() { // from class: ug.t
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TelemetryFlushWorker.g();
            }
        };
        this.nativeFlushV2 = new Function0() { // from class: ug.u
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TelemetryFlushWorker.h();
            }
        };
    }

    public static final void d(@NotNull Context context) {
        INSTANCE.a(context);
    }

    public static final Unit g() {
        NativeReportingInterface.flushEngineTelemetryV1Events();
        return Unit.f22938a;
    }

    public static final Unit h() {
        NativeReportingInterface.flushEngineTelemetryV2Events();
        return Unit.f22938a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    @Nullable
    public Object doWork(@NotNull lt.b<? super androidx.work.c.a> bVar) {
        b bVar2;
        if (bVar instanceof b) {
            bVar2 = (b) bVar;
            int i10 = bVar2.f9003v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar2.f9003v = i10 - Integer.MIN_VALUE;
            } else {
                bVar2 = new b(bVar);
            }
        } else {
            bVar2 = new b(bVar);
        }
        Object objG = bVar2.f9001t;
        Object objE = mt.c.e();
        int i11 = bVar2.f9003v;
        if (i11 == 0) {
            o.b(objG);
            l0 l0VarB = g1.b();
            c cVar = new c(null);
            bVar2.f9003v = 1;
            objG = i.g(l0VarB, cVar, bVar2);
            if (objG == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(objG);
        }
        Intrinsics.checkNotNullExpressionValue(objG, "withContext(...)");
        return objG;
    }

    @NotNull
    public final Function0<Unit> e() {
        return this.nativeFlushV1;
    }

    @NotNull
    public final Function0<Unit> f() {
        return this.nativeFlushV2;
    }
}
