package com.roblox.client.appsflyer;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import gt.o;
import iu.g1;
import iu.i;
import iu.l0;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nt.d;
import nt.f;
import nt.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x5.j;
import x5.p0;
import x5.z;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/roblox/client/appsflyer/ConsentBackstopWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/c$a;", "doWork", "(Llt/b;)Ljava/lang/Object;", "a", "RobloxApp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ConsentBackstopWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.roblox.client.appsflyer.ConsentBackstopWorker$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/roblox/client/appsflyer/ConsentBackstopWorker$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "delayMs", "", "b", "(Landroid/content/Context;J)V", "a", "(Landroid/content/Context;)V", "", "WORK_NAME", "Ljava/lang/String;", "RobloxApp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            p0.Companion companion = p0.INSTANCE;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            companion.a(applicationContext).b("delayedAppsFlyerConsentBackstop");
        }

        public final void b(@NotNull Context context, long delayMs) {
            Intrinsics.checkNotNullParameter(context, "context");
            p0.Companion companion = p0.INSTANCE;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            companion.a(applicationContext).g("delayedAppsFlyerConsentBackstop", j.KEEP, new z.a(ConsentBackstopWorker.class).n(delayMs, TimeUnit.MILLISECONDS).b());
        }

        public Companion() {
        }
    }

    @f(c = "com.roblox.client.appsflyer.ConsentBackstopWorker", f = "ConsentBackstopWorker.kt", l = {19}, m = "doWork", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b extends d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f9017t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f9019v;

        public b(lt.b<? super b> bVar) {
            super(bVar);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f9017t = obj;
            this.f9019v |= Integer.MIN_VALUE;
            return ConsentBackstopWorker.this.doWork(this);
        }
    }

    @f(c = "com.roblox.client.appsflyer.ConsentBackstopWorker$doWork$2", f = "ConsentBackstopWorker.kt", l = {}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class c extends m implements Function2<iu.p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f9020t;

        public c(lt.b<? super c> bVar) {
            super(2, bVar);
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return new c(bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(iu.p0 p0Var, lt.b<? super Unit> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            mt.c.e();
            if (this.f9020t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            a.I().E();
            return Unit.f22938a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConsentBackstopWorker(@NotNull Context appContext, @NotNull WorkerParameters params) {
        super(appContext, params);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(params, "params");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    @Nullable
    public Object doWork(@NotNull lt.b<? super androidx.work.c.a> bVar) {
        b bVar2;
        if (bVar instanceof b) {
            bVar2 = (b) bVar;
            int i10 = bVar2.f9019v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar2.f9019v = i10 - Integer.MIN_VALUE;
            } else {
                bVar2 = new b(bVar);
            }
        } else {
            bVar2 = new b(bVar);
        }
        Object obj = bVar2.f9017t;
        Object objE = mt.c.e();
        int i11 = bVar2.f9019v;
        if (i11 == 0) {
            o.b(obj);
            l0 l0VarB = g1.b();
            c cVar = new c(null);
            bVar2.f9019v = 1;
            if (i.g(l0VarB, cVar, bVar2) == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
        }
        androidx.work.c.a aVarD = androidx.work.c.a.d();
        Intrinsics.checkNotNullExpressionValue(aVarD, "success(...)");
        return aVarD;
    }
}
