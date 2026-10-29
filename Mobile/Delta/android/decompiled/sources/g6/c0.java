package g6;

import android.content.Context;
import android.os.Build;
import f6.j0;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ku.p0;
import ku.v1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y5.s1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a8\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u000b\u0010\f\"\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Landroid/content/Context;", "context", "Lf6/j0;", "spec", "Landroidx/work/c;", "worker", "Lx5/l;", "foregroundUpdater", "Lh6/b;", "taskExecutor", "", "b", "(Landroid/content/Context;Lf6/j0;Landroidx/work/c;Lx5/l;Lh6/b;Lnt/b;)Ljava/lang/Object;", "", "a", "Ljava/lang/String;", "TAG", "work-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final String f17901a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lku/p0;", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "<anonymous>", "(Lku/p0;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
    @pt.f(c = "androidx.work.impl.utils.WorkForegroundKt$workForeground$2", f = "WorkForeground.kt", l = {42, 50}, m = "invokeSuspend")
    public static final class a extends pt.m implements Function2<p0, nt.b<? super Void>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f17902t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ androidx.work.c f17903u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ j0 f17904v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ x5.l f17905w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ Context f17906x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.work.c cVar, j0 j0Var, x5.l lVar, Context context, nt.b<? super a> bVar) {
            super(2, bVar);
            this.f17903u = cVar;
            this.f17904v = j0Var;
            this.f17905w = lVar;
            this.f17906x = context;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new a(this.f17903u, this.f17904v, this.f17905w, this.f17906x, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = ot.c.e();
            int i10 = this.f17902t;
            if (i10 == 0) {
                jt.o.b(obj);
                me.x<x5.k> foregroundInfoAsync = this.f17903u.getForegroundInfoAsync();
                Intrinsics.checkNotNullExpressionValue(foregroundInfoAsync, "getForegroundInfoAsync(...)");
                androidx.work.c cVar = this.f17903u;
                this.f17902t = 1;
                obj = s1.d(foregroundInfoAsync, cVar, this);
                if (obj != objE) {
                }
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
                return obj;
            }
            jt.o.b(obj);
            x5.k kVar = (x5.k) obj;
            if (kVar == null) {
                throw new IllegalStateException("Worker was marked important (" + this.f17904v.workerClassName + ") but did not provide ForegroundInfo");
            }
            String str = c0.f17901a;
            j0 j0Var = this.f17904v;
            x5.w.e().a(str, "Updating notification for " + j0Var.workerClassName);
            me.x<Void> xVarA = this.f17905w.a(this.f17906x, this.f17903u.getId(), kVar);
            Intrinsics.checkNotNullExpressionValue(xVarA, "setForegroundAsync(...)");
            this.f17902t = 2;
            Object objB = y1.e.b(xVarA, this);
            return objB == objE ? objE : objB;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Void> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    static {
        String strI = x5.w.i("WorkForegroundRunnable");
        Intrinsics.checkNotNullExpressionValue(strI, "tagWithPrefix(...)");
        f17901a = strI;
    }

    @Nullable
    public static final Object b(@NotNull Context context, @NotNull j0 j0Var, @NotNull androidx.work.c cVar, @NotNull x5.l lVar, @NotNull h6.b bVar, @NotNull nt.b<? super Unit> bVar2) {
        if (!j0Var.expedited || Build.VERSION.SDK_INT >= 31) {
            return Unit.f22483a;
        }
        Executor executorA = bVar.a();
        Intrinsics.checkNotNullExpressionValue(executorA, "getMainThreadExecutor(...)");
        Object objG = ku.i.g(v1.b(executorA), new a(cVar, j0Var, lVar, context, null), bVar2);
        return objG == ot.c.e() ? objG : Unit.f22483a;
    }
}
