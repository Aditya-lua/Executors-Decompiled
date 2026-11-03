package com.roblox.client.ads;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import ek.q;
import ek.w;
import gt.o;
import iu.g1;
import iu.i;
import iu.l0;
import iu.p0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nt.d;
import nt.f;
import nt.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qh.g;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/roblox/client/ads/GmaSdkBackgroundInstallWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/c$a;", "doWork", "(Llt/b;)Ljava/lang/Object;", "a", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GmaSdkBackgroundInstallWorker extends CoroutineWorker {

    @f(c = "com.roblox.client.ads.GmaSdkBackgroundInstallWorker", f = "GmaSdkBackgroundInstallWorker.kt", l = {27}, m = "doWork", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b extends d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f8994t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f8996v;

        public b(lt.b<? super b> bVar) {
            super(bVar);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f8994t = obj;
            this.f8996v |= Integer.MIN_VALUE;
            return GmaSdkBackgroundInstallWorker.this.doWork(this);
        }
    }

    @f(c = "com.roblox.client.ads.GmaSdkBackgroundInstallWorker$doWork$2", f = "GmaSdkBackgroundInstallWorker.kt", l = {}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00070\u0001¢\u0006\u0002\b\u0002*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Liu/p0;", "Landroidx/work/c$a;", "Lkotlin/jvm/internal/EnhancedNullability;", "<anonymous>", "(Liu/p0;)Landroidx/work/c$a;"}, k = 3, mv = {2, 2, 0})
    public static final class c extends m implements Function2<p0, lt.b<? super androidx.work.c.a>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f8997t;

        public c(lt.b<? super c> bVar) {
            super(2, bVar);
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return GmaSdkBackgroundInstallWorker.this.new c(bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super androidx.work.c.a> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            mt.c.e();
            if (this.f8997t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            if (g.j("gmasdk")) {
                return androidx.work.c.a.d();
            }
            if (Intrinsics.c(w.a(GmaSdkBackgroundInstallWorker.this.getApplicationContext()), "foreground")) {
                q.h("GmaSdkBgInstallWorker", "App returned to foreground before delay elapsed; skipping background install");
                return androidx.work.c.a.d();
            }
            q.h("GmaSdkBgInstallWorker", "Installing GMA SDK in background");
            g.l("gmasdk");
            return androidx.work.c.a.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GmaSdkBackgroundInstallWorker(@NotNull Context context, @NotNull WorkerParameters params) {
        super(context, params);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(params, "params");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    @Nullable
    public Object doWork(@NotNull lt.b<? super androidx.work.c.a> bVar) {
        b bVar2;
        if (bVar instanceof b) {
            bVar2 = (b) bVar;
            int i10 = bVar2.f8996v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar2.f8996v = i10 - Integer.MIN_VALUE;
            } else {
                bVar2 = new b(bVar);
            }
        } else {
            bVar2 = new b(bVar);
        }
        Object objG = bVar2.f8994t;
        Object objE = mt.c.e();
        int i11 = bVar2.f8996v;
        if (i11 == 0) {
            o.b(objG);
            l0 l0VarB = g1.b();
            c cVar = new c(null);
            bVar2.f8996v = 1;
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
}
