package com.roblox.client.ads;

import ai.h;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import av.g1;
import av.i;
import av.l0;
import av.p0;
import gu.d;
import gu.f;
import gu.m;
import ok.q;
import ok.w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;
import zt.o;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/roblox/client/ads/GmaSdkBackgroundInstallWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/c$a;", "doWork", "(Leu/b;)Ljava/lang/Object;", "a", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GmaSdkBackgroundInstallWorker extends CoroutineWorker {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @f(c = "com.roblox.client.ads.GmaSdkBackgroundInstallWorker", f = "GmaSdkBackgroundInstallWorker.kt", l = {27}, m = "doWork", v = 1)
    public static final class b extends d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f8811t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f8813v;

        public b(eu.b<? super b> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f8811t = obj;
            this.f8813v |= Integer.MIN_VALUE;
            return GmaSdkBackgroundInstallWorker.this.doWork(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00070\u0001¢\u0006\u0002\b\u0002*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lav/p0;", "Landroidx/work/c$a;", "Lkotlin/jvm/internal/EnhancedNullability;", "<anonymous>", "(Lav/p0;)Landroidx/work/c$a;"}, k = 3, mv = {2, 2, 0})
    @f(c = "com.roblox.client.ads.GmaSdkBackgroundInstallWorker$doWork$2", f = "GmaSdkBackgroundInstallWorker.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class c extends m implements Function2<p0, eu.b<? super androidx.work.c.a>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f8814t;

        public c(eu.b<? super c> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return GmaSdkBackgroundInstallWorker.this.new c(bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super androidx.work.c.a> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            fu.c.e();
            if (this.f8814t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            if (h.k("gmasdk")) {
                return androidx.work.c.a.d();
            }
            if (Intrinsics.c(w.a(GmaSdkBackgroundInstallWorker.this.getApplicationContext()), "foreground")) {
                q.h("GmaSdkBgInstallWorker", "App returned to foreground before delay elapsed; skipping background install");
                return androidx.work.c.a.d();
            }
            q.h("GmaSdkBgInstallWorker", "Installing GMA SDK in background");
            h.m("gmasdk");
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
    public Object doWork(@NotNull eu.b<? super androidx.work.c.a> bVar) {
        b bVar2;
        if (bVar instanceof b) {
            bVar2 = (b) bVar;
            int i10 = bVar2.f8813v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar2.f8813v = i10 - Integer.MIN_VALUE;
            } else {
                bVar2 = new b(bVar);
            }
        } else {
            bVar2 = new b(bVar);
        }
        Object objG = bVar2.f8811t;
        Object objE = fu.c.e();
        int i11 = bVar2.f8813v;
        if (i11 == 0) {
            o.b(objG);
            l0 l0VarB = g1.b();
            c cVar = new c(null);
            bVar2.f8813v = 1;
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
