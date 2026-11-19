package com.roblox.client.appsflyer;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import av.g1;
import av.i;
import av.l0;
import com.github.luben.zstd.BuildConfig;
import gu.d;
import gu.f;
import gu.m;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import y5.j;
import y5.p0;
import y5.z;
import zt.o;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/roblox/client/appsflyer/ConsentBackstopWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/c$a;", "doWork", "(Leu/b;)Ljava/lang/Object;", "a", "RobloxApp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ConsentBackstopWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.roblox.client.appsflyer.ConsentBackstopWorker$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/roblox/client/appsflyer/ConsentBackstopWorker$a;", BuildConfig.FLAVOR, "<init>", "()V", "Landroid/content/Context;", "context", BuildConfig.FLAVOR, "delayMs", BuildConfig.FLAVOR, "b", "(Landroid/content/Context;J)V", "a", "(Landroid/content/Context;)V", BuildConfig.FLAVOR, "WORK_NAME", "Ljava/lang/String;", "RobloxApp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @f(c = "com.roblox.client.appsflyer.ConsentBackstopWorker", f = "ConsentBackstopWorker.kt", l = {19}, m = "doWork", v = 1)
    public static final class b extends d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f8834t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f8836v;

        public b(eu.b<? super b> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f8834t = obj;
            this.f8836v |= Integer.MIN_VALUE;
            return ConsentBackstopWorker.this.doWork(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @f(c = "com.roblox.client.appsflyer.ConsentBackstopWorker$doWork$2", f = "ConsentBackstopWorker.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class c extends m implements Function2<av.p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f8837t;

        public c(eu.b<? super c> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new c(bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            fu.c.e();
            if (this.f8837t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            a.O().K();
            return Unit.f21506a;
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
    public Object doWork(@NotNull eu.b<? super androidx.work.c.a> bVar) {
        b bVar2;
        if (bVar instanceof b) {
            bVar2 = (b) bVar;
            int i10 = bVar2.f8836v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar2.f8836v = i10 - Integer.MIN_VALUE;
            } else {
                bVar2 = new b(bVar);
            }
        } else {
            bVar2 = new b(bVar);
        }
        Object obj = bVar2.f8834t;
        Object objE = fu.c.e();
        int i11 = bVar2.f8836v;
        if (i11 == 0) {
            o.b(obj);
            l0 l0VarB = g1.b();
            c cVar = new c(null);
            bVar2.f8836v = 1;
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
