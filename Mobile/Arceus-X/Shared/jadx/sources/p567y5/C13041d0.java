package p567y5;

import android.content.Context;
import androidx.work.C1115a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nu.C9579j;
import nu.InterfaceC9577i;
import org.jetbrains.annotations.NotNull;
import p146g6.C6042v;
import p146g6.C6044x;
import p229jt.C7348o;
import p256ku.C7946z0;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p536x5.AbstractC12732w;
import p615zt.InterfaceC14058o;
import pt.AbstractC10351m;
import pt.C10340b;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: y5.d0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\u001a+\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\"\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f\"\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m31665d2 = {"Lku/p0;", "Landroid/content/Context;", "appContext", "Landroidx/work/a;", "configuration", "Landroidx/work/impl/WorkDatabase;", "db", "", "c", "(Lku/p0;Landroid/content/Context;Landroidx/work/a;Landroidx/work/impl/WorkDatabase;)V", "", "a", "Ljava/lang/String;", "TAG", "", "b", "J", "MAX_DELAY_MS", "work-runtime_release"}, m31666k = 2, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C13041d0 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final String f46171a;

    /* JADX INFO: renamed from: b */
    public static final long f46172b;

    /* JADX INFO: renamed from: y5.d0$a */
    @Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m31665d2 = {"Lnu/i;", "", "", "throwable", "", "attempt", "<anonymous>", "(Lnu/i;Ljava/lang/Throwable;J)Z"}, m31666k = 3, m31667mv = {2, 1, 0})
    @InterfaceC10344f(m39663c = "androidx.work.impl.UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1", m39664f = "UnfinishedWorkListener.kt", m39665l = {59}, m39666m = "invokeSuspend")
    public static final class a extends AbstractC10351m implements InterfaceC14058o<InterfaceC9577i<? super Boolean>, Throwable, Long, InterfaceC9557b<? super Boolean>, Object> {

        /* JADX INFO: renamed from: t */
        public int f46173t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f46174u;

        /* JADX INFO: renamed from: v */
        public /* synthetic */ long f46175v;

        public a(InterfaceC9557b<? super a> interfaceC9557b) {
            super(4, interfaceC9557b);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p615zt.InterfaceC14058o
        /* JADX INFO: renamed from: e */
        public /* bridge */ /* synthetic */ Object mo1397e(InterfaceC9577i<? super Boolean> interfaceC9577i, Throwable th2, Long l10, InterfaceC9557b<? super Boolean> interfaceC9557b) {
            return m48560q(interfaceC9577i, th2, l10.longValue(), interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f46173t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                Throwable th2 = (Throwable) this.f46174u;
                long j10 = this.f46175v;
                AbstractC12732w.m47441e().mo47447d(C13041d0.f46171a, "Cannot check for unfinished work", th2);
                long jMin = Math.min(j10 * ((long) 30000), C13041d0.f46172b);
                this.f46173t = 1;
                if (C7946z0.m32938b(jMin, this) == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            return C10340b.m39658a(true);
        }

        /* JADX INFO: renamed from: q */
        public final Object m48560q(InterfaceC9577i<? super Boolean> interfaceC9577i, Throwable th2, long j10, InterfaceC9557b<? super Boolean> interfaceC9557b) {
            a aVar = new a(interfaceC9557b);
            aVar.f46174u = th2;
            aVar.f46175v = j10;
            return aVar.invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: y5.d0$b */
    @Metadata(m31664d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m31665d2 = {"<anonymous>", "", "hasUnfinishedWork", ""}, m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    @InterfaceC10344f(m39663c = "androidx.work.impl.UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$2", m39664f = "UnfinishedWorkListener.kt", m39665l = {}, m39666m = "invokeSuspend")
    public static final class b extends AbstractC10351m implements Function2<Boolean, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f46176t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ boolean f46177u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ Context f46178v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, InterfaceC9557b<? super b> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f46178v = context;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            b bVar = new b(this.f46178v, interfaceC9557b);
            bVar.f46177u = ((Boolean) obj).booleanValue();
            return bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return m48561q(bool.booleanValue(), interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f46176t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            C6042v.m26859c(this.f46178v, RescheduleReceiver.class, this.f46177u);
            return Unit.f29331a;
        }

        /* JADX INFO: renamed from: q */
        public final Object m48561q(boolean z10, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((b) create(Boolean.valueOf(z10), interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    static {
        String strM47443i = AbstractC12732w.m47443i("UnfinishedWorkListener");
        Intrinsics.checkNotNullExpressionValue(strM47443i, "tagWithPrefix(...)");
        f46171a = strM47443i;
        f46172b = TimeUnit.HOURS.toMillis(1L);
    }

    /* JADX INFO: renamed from: c */
    public static final void m48559c(@NotNull InterfaceC7906p0 interfaceC7906p0, @NotNull Context appContext, @NotNull C1115a configuration, @NotNull WorkDatabase db2) {
        Intrinsics.checkNotNullParameter(interfaceC7906p0, "<this>");
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(db2, "db");
        if (C6044x.m26866b(appContext, configuration)) {
            C9579j.m37809z(C9579j.m37768E(C9579j.m37796m(C9579j.m37794k(C9579j.m37772I(db2.mo6350c0().mo24795s(), new a(null)))), new b(appContext, null)), interfaceC7906p0);
        }
    }
}
