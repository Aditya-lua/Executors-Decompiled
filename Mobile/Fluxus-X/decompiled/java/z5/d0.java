package z5;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import com.github.luben.zstd.BuildConfig;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\u001a+\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\"\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f\"\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lav/p0;", "Landroid/content/Context;", "appContext", "Landroidx/work/a;", "configuration", "Landroidx/work/impl/WorkDatabase;", "db", BuildConfig.FLAVOR, "c", "(Lav/p0;Landroid/content/Context;Landroidx/work/a;Landroidx/work/impl/WorkDatabase;)V", BuildConfig.FLAVOR, "a", "Ljava/lang/String;", "TAG", BuildConfig.FLAVOR, "b", "J", "MAX_DELAY_MS", "work-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final String f38992a;
    public static final long b;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ldv/i;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "throwable", BuildConfig.FLAVOR, "attempt", "<anonymous>", "(Ldv/i;Ljava/lang/Throwable;J)Z"}, k = 3, mv = {2, 1, 0})
    @gu.f(c = "androidx.work.impl.UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1", f = "UnfinishedWorkListener.kt", l = {59}, m = "invokeSuspend")
    public static final class a extends gu.m implements pu.o<dv.i<? super Boolean>, Throwable, Long, eu.b<? super Boolean>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f38993t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f38994u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ long f38995v;

        public a(eu.b<? super a> bVar) {
            super(4, bVar);
        }

        @Override // pu.o
        public /* bridge */ /* synthetic */ Object e(dv.i<? super Boolean> iVar, Throwable th2, Long l10, eu.b<? super Boolean> bVar) {
            return m(iVar, th2, l10.longValue(), bVar);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f38993t;
            if (i10 == 0) {
                zt.o.b(obj);
                Throwable th2 = (Throwable) this.f38994u;
                long j10 = this.f38995v;
                y5.w.e().d(d0.f38992a, "Cannot check for unfinished work", th2);
                long jMin = Math.min(j10 * ((long) 30000), d0.b);
                this.f38993t = 1;
                if (av.z0.b(jMin, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
            }
            return gu.b.a(true);
        }

        public final Object m(dv.i<? super Boolean> iVar, Throwable th2, long j10, eu.b<? super Boolean> bVar) {
            a aVar = new a(bVar);
            aVar.f38994u = th2;
            aVar.f38995v = j10;
            return aVar.invokeSuspend(Unit.f21506a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "hasUnfinishedWork", BuildConfig.FLAVOR}, k = 3, mv = {2, 1, 0}, xi = 48)
    @gu.f(c = "androidx.work.impl.UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$2", f = "UnfinishedWorkListener.kt", l = {}, m = "invokeSuspend")
    public static final class b extends gu.m implements Function2<Boolean, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f38996t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ boolean f38997u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Context f38998v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, eu.b<? super b> bVar) {
            super(2, bVar);
            this.f38998v = context;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            b bVar2 = new b(this.f38998v, bVar);
            bVar2.f38997u = ((Boolean) obj).booleanValue();
            return bVar2;
        }

        @Override // p001kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, eu.b<? super Unit> bVar) {
            return m(bool.booleanValue(), bVar);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            fu.c.e();
            if (this.f38996t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zt.o.b(obj);
            h6.v.c(this.f38998v, RescheduleReceiver.class, this.f38997u);
            return Unit.f21506a;
        }

        public final Object m(boolean z10, eu.b<? super Unit> bVar) {
            return ((b) create(Boolean.valueOf(z10), bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    static {
        String strI = y5.w.i("UnfinishedWorkListener");
        Intrinsics.checkNotNullExpressionValue(strI, "tagWithPrefix(...)");
        f38992a = strI;
        b = TimeUnit.HOURS.toMillis(1L);
    }

    public static final void c(@NotNull av.p0 p0Var, @NotNull Context appContext, @NotNull androidx.work.a configuration, @NotNull WorkDatabase db2) {
        Intrinsics.checkNotNullParameter(p0Var, "<this>");
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(db2, "db");
        if (h6.x.b(appContext, configuration)) {
            dv.j.z(dv.j.E(dv.j.m(dv.j.k(dv.j.I(db2.c0().s(), new a(null)))), new b(appContext, null)), p0Var);
        }
    }
}
