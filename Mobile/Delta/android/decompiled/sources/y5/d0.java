package y5;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\u001a+\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\"\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f\"\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lku/p0;", "Landroid/content/Context;", "appContext", "Landroidx/work/a;", "configuration", "Landroidx/work/impl/WorkDatabase;", "db", "", "c", "(Lku/p0;Landroid/content/Context;Landroidx/work/a;Landroidx/work/impl/WorkDatabase;)V", "", "a", "Ljava/lang/String;", "TAG", "", "b", "J", "MAX_DELAY_MS", "work-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final String f35593a;
    public static final long b;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lnu/i;", "", "", "throwable", "", "attempt", "<anonymous>", "(Lnu/i;Ljava/lang/Throwable;J)Z"}, k = 3, mv = {2, 1, 0})
    @pt.f(c = "androidx.work.impl.UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1", f = "UnfinishedWorkListener.kt", l = {59}, m = "invokeSuspend")
    public static final class a extends pt.m implements zt.o<nu.i<? super Boolean>, Throwable, Long, nt.b<? super Boolean>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f35594t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f35595u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ long f35596v;

        public a(nt.b<? super a> bVar) {
            super(4, bVar);
        }

        @Override // zt.o
        public /* bridge */ /* synthetic */ Object e(nu.i<? super Boolean> iVar, Throwable th2, Long l10, nt.b<? super Boolean> bVar) {
            return q(iVar, th2, l10.longValue(), bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f35594t;
            if (i10 == 0) {
                jt.o.b(obj);
                Throwable th2 = (Throwable) this.f35595u;
                long j10 = this.f35596v;
                x5.w.e().d(d0.f35593a, "Cannot check for unfinished work", th2);
                long jMin = Math.min(j10 * ((long) 30000), d0.b);
                this.f35594t = 1;
                if (ku.z0.b(jMin, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
            }
            return pt.b.a(true);
        }

        public final Object q(nu.i<? super Boolean> iVar, Throwable th2, long j10, nt.b<? super Boolean> bVar) {
            a aVar = new a(bVar);
            aVar.f35595u = th2;
            aVar.f35596v = j10;
            return aVar.invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "hasUnfinishedWork", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @pt.f(c = "androidx.work.impl.UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$2", f = "UnfinishedWorkListener.kt", l = {}, m = "invokeSuspend")
    public static final class b extends pt.m implements Function2<Boolean, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f35597t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ boolean f35598u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Context f35599v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, nt.b<? super b> bVar) {
            super(2, bVar);
            this.f35599v = context;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            b bVar2 = new b(this.f35599v, bVar);
            bVar2.f35598u = ((Boolean) obj).booleanValue();
            return bVar2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, nt.b<? super Unit> bVar) {
            return q(bool.booleanValue(), bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            ot.c.e();
            if (this.f35597t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jt.o.b(obj);
            g6.v.c(this.f35599v, RescheduleReceiver.class, this.f35598u);
            return Unit.f22483a;
        }

        public final Object q(boolean z10, nt.b<? super Unit> bVar) {
            return ((b) create(Boolean.valueOf(z10), bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    static {
        String strI = x5.w.i("UnfinishedWorkListener");
        Intrinsics.checkNotNullExpressionValue(strI, "tagWithPrefix(...)");
        f35593a = strI;
        b = TimeUnit.HOURS.toMillis(1L);
    }

    public static final void c(@NotNull ku.p0 p0Var, @NotNull Context appContext, @NotNull androidx.work.a configuration, @NotNull WorkDatabase db2) {
        Intrinsics.checkNotNullParameter(p0Var, "<this>");
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(db2, "db");
        if (g6.x.b(appContext, configuration)) {
            nu.j.z(nu.j.E(nu.j.m(nu.j.k(nu.j.I(db2.c0().s(), new a(null)))), new b(appContext, null)), p0Var);
        }
    }
}
