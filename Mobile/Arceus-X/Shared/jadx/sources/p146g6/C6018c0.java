package p146g6;

import android.content.Context;
import android.os.Build;
import androidx.work.AbstractC1117c;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ne.InterfaceFutureC9440x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p120f6.C5390j0;
import p161h6.InterfaceC6292b;
import p229jt.C7348o;
import p256ku.C7872i;
import p256ku.C7931v1;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p536x5.AbstractC12732w;
import p536x5.C12708k;
import p536x5.InterfaceC12710l;
import p563y1.C12999e;
import p567y5.C13087s1;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: g6.c0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a8\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u000b\u0010\f\"\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m31665d2 = {"Landroid/content/Context;", "context", "Lf6/j0;", "spec", "Landroidx/work/c;", "worker", "Lx5/l;", "foregroundUpdater", "Lh6/b;", "taskExecutor", "", "b", "(Landroid/content/Context;Lf6/j0;Landroidx/work/c;Lx5/l;Lh6/b;Lnt/b;)Ljava/lang/Object;", "", "a", "Ljava/lang/String;", "TAG", "work-runtime_release"}, m31666k = 2, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C6018c0 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final String f23281a;

    /* JADX INFO: renamed from: g6.c0$a */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lku/p0;", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "<anonymous>", "(Lku/p0;)Ljava/lang/Void;"}, m31666k = 3, m31667mv = {2, 1, 0})
    @InterfaceC10344f(m39663c = "androidx.work.impl.utils.WorkForegroundKt$workForeground$2", m39664f = "WorkForeground.kt", m39665l = {42, 50}, m39666m = "invokeSuspend")
    public static final class a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Void>, Object> {

        /* JADX INFO: renamed from: t */
        public int f23282t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ AbstractC1117c f23283u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ C5390j0 f23284v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ InterfaceC12710l f23285w;

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ Context f23286x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC1117c abstractC1117c, C5390j0 c5390j0, InterfaceC12710l interfaceC12710l, Context context, InterfaceC9557b<? super a> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f23283u = abstractC1117c;
            this.f23284v = c5390j0;
            this.f23285w = interfaceC12710l;
            this.f23286x = context;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new a(this.f23283u, this.f23284v, this.f23285w, this.f23286x, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f23282t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                InterfaceFutureC9440x<C12708k> foregroundInfoAsync = this.f23283u.getForegroundInfoAsync();
                Intrinsics.checkNotNullExpressionValue(foregroundInfoAsync, "getForegroundInfoAsync(...)");
                AbstractC1117c abstractC1117c = this.f23283u;
                this.f23282t = 1;
                obj = C13087s1.m48680d(foregroundInfoAsync, abstractC1117c, this);
                if (obj != objM38805e) {
                }
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                return obj;
            }
            C7348o.m30470b(obj);
            C12708k c12708k = (C12708k) obj;
            if (c12708k == null) {
                throw new IllegalStateException("Worker was marked important (" + this.f23284v.workerClassName + ") but did not provide ForegroundInfo");
            }
            String str = C6018c0.f23281a;
            C5390j0 c5390j0 = this.f23284v;
            AbstractC12732w.m47441e().mo47444a(str, "Updating notification for " + c5390j0.workerClassName);
            InterfaceFutureC9440x<Void> interfaceFutureC9440xMo26801a = this.f23285w.mo26801a(this.f23286x, this.f23283u.getId(), c12708k);
            Intrinsics.checkNotNullExpressionValue(interfaceFutureC9440xMo26801a, "setForegroundAsync(...)");
            this.f23282t = 2;
            Object objM48322b = C12999e.m48322b(interfaceFutureC9440xMo26801a, this);
            return objM48322b == objM38805e ? objM38805e : objM48322b;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Void> interfaceC9557b) {
            return ((a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    static {
        String strM47443i = AbstractC12732w.m47443i("WorkForegroundRunnable");
        Intrinsics.checkNotNullExpressionValue(strM47443i, "tagWithPrefix(...)");
        f23281a = strM47443i;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static final Object m26799b(@NotNull Context context, @NotNull C5390j0 c5390j0, @NotNull AbstractC1117c abstractC1117c, @NotNull InterfaceC12710l interfaceC12710l, @NotNull InterfaceC6292b interfaceC6292b, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        if (!c5390j0.expedited || Build.VERSION.SDK_INT >= 31) {
            return Unit.f29331a;
        }
        Executor executorMo27570a = interfaceC6292b.mo27570a();
        Intrinsics.checkNotNullExpressionValue(executorMo27570a, "getMainThreadExecutor(...)");
        Object objM32684g = C7872i.m32684g(C7931v1.m32925b(executorMo27570a), new a(abstractC1117c, c5390j0, interfaceC12710l, context, null), interfaceC9557b);
        return objM32684g == C10047c.m38805e() ? objM32684g : Unit.f29331a;
    }
}
