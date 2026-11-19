package h6;

import android.content.Context;
import android.os.Build;
import av.p0;
import av.v1;
import com.appsflyer.share.attribution.RequestError;
import com.github.luben.zstd.BuildConfig;
import g6.j0;
import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;
import z5.s1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a8\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u000b\u0010\f\"\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Landroid/content/Context;", "context", "Lg6/j0;", "spec", "Landroidx/work/c;", "worker", "Ly5/l;", "foregroundUpdater", "Li6/b;", "taskExecutor", BuildConfig.FLAVOR, "b", "(Landroid/content/Context;Lg6/j0;Landroidx/work/c;Ly5/l;Li6/b;Leu/b;)Ljava/lang/Object;", BuildConfig.FLAVOR, "a", "Ljava/lang/String;", "TAG", "work-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final String f18077a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lav/p0;", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "<anonymous>", "(Lav/p0;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
    @gu.f(c = "androidx.work.impl.utils.WorkForegroundKt$workForeground$2", f = "WorkForeground.kt", l = {42, RequestError.RESPONSE_CODE_FAILURE}, m = "invokeSuspend")
    public static final class a extends gu.m implements Function2<p0, eu.b<? super Void>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f18078t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ androidx.work.c f18079u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ j0 f18080v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ y5.l f18081w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ Context f18082x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.work.c cVar, j0 j0Var, y5.l lVar, Context context, eu.b<? super a> bVar) {
            super(2, bVar);
            this.f18079u = cVar;
            this.f18080v = j0Var;
            this.f18081w = lVar;
            this.f18082x = context;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new a(this.f18079u, this.f18080v, this.f18081w, this.f18082x, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Void> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = fu.c.e();
            int i10 = this.f18078t;
            if (i10 == 0) {
                zt.o.b(obj);
                pe.x<y5.k> foregroundInfoAsync = this.f18079u.getForegroundInfoAsync();
                Intrinsics.checkNotNullExpressionValue(foregroundInfoAsync, "getForegroundInfoAsync(...)");
                androidx.work.c cVar = this.f18079u;
                this.f18078t = 1;
                obj = s1.d(foregroundInfoAsync, cVar, this);
                if (obj != objE) {
                }
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
                return obj;
            }
            zt.o.b(obj);
            y5.k kVar = (y5.k) obj;
            if (kVar == null) {
                throw new IllegalStateException("Worker was marked important (" + this.f18080v.workerClassName + ") but did not provide ForegroundInfo");
            }
            String str = c0.f18077a;
            j0 j0Var = this.f18080v;
            y5.w.e().a(str, "Updating notification for " + j0Var.workerClassName);
            pe.x<Void> xVarA = this.f18081w.a(this.f18082x, this.f18079u.getId(), kVar);
            Intrinsics.checkNotNullExpressionValue(xVarA, "setForegroundAsync(...)");
            this.f18078t = 2;
            Object objB = y1.e.b(xVarA, this);
            return objB == objE ? objE : objB;
        }
    }

    static {
        String strI = y5.w.i("WorkForegroundRunnable");
        Intrinsics.checkNotNullExpressionValue(strI, "tagWithPrefix(...)");
        f18077a = strI;
    }

    @Nullable
    public static final Object b(@NotNull Context context, @NotNull j0 j0Var, @NotNull androidx.work.c cVar, @NotNull y5.l lVar, @NotNull i6.b bVar, @NotNull eu.b<? super Unit> bVar2) {
        if (!j0Var.expedited || Build.VERSION.SDK_INT >= 31) {
            return Unit.f21506a;
        }
        Executor executorA = bVar.a();
        Intrinsics.checkNotNullExpressionValue(executorA, "getMainThreadExecutor(...)");
        Object objG = av.i.g(v1.b(executorA), new a(cVar, j0Var, lVar, context, null), bVar2);
        return objG == fu.c.e() ? objG : Unit.f21506a;
    }
}
