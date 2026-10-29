package p026b6;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Build;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7699p;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nu.InterfaceC9575h;
import nu.InterfaceC9577i;
import org.jetbrains.annotations.NotNull;
import p042c6.C1543c;
import p042c6.C1544d;
import p042c6.C1546f;
import p042c6.C1547g;
import p042c6.C1548h;
import p042c6.C1549i;
import p042c6.C1550j;
import p042c6.InterfaceC1545e;
import p069d6.AbstractC4457h;
import p069d6.C4463n;
import p120f6.C5390j0;
import p229jt.C7348o;
import p256ku.AbstractC7888l0;
import p256ku.C7882k;
import p256ku.C7910q0;
import p256ku.InterfaceC7850d2;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p536x5.AbstractC12732w;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: b6.m */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a)\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t\u001a\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0016*$\b\u0002\u0010\u001b\"\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u00182\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018¨\u0006\u001c"}, m31665d2 = {"Lb6/l;", "Lf6/j0;", "spec", "Lku/l0;", "dispatcher", "Lb6/i;", "listener", "Lku/d2;", "e", "(Lb6/l;Lf6/j0;Lku/l0;Lb6/i;)Lku/d2;", "Ld6/n;", "trackers", "", "Lc6/e;", "d", "(Ld6/n;)Ljava/util/List;", "Landroid/content/Context;", "context", "Lb6/g;", "a", "(Landroid/content/Context;)Lb6/g;", "", "Ljava/lang/String;", "TAG", "Lkotlin/Function1;", "Lb6/b;", "", "OnConstraintState", "work-runtime_release"}, m31666k = 2, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C1248m {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final String f5204a;

    /* JADX INFO: renamed from: b6.m$a */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 1, 0})
    @InterfaceC10344f(m39663c = "androidx.work.impl.constraints.WorkConstraintsTrackerKt$listen$1", m39664f = "WorkConstraintsTracker.kt", m39665l = {69}, m39666m = "invokeSuspend")
    public static final class a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f5205t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ C1247l f5206u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ C5390j0 f5207v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ InterfaceC1244i f5208w;

        /* JADX INFO: renamed from: b6.m$a$a, reason: collision with other inner class name */
        @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
        public static final class C14094a<T> implements InterfaceC9577i {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC1244i f5209a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C5390j0 f5210b;

            public C14094a(InterfaceC1244i interfaceC1244i, C5390j0 c5390j0) {
                this.f5209a = interfaceC1244i;
                this.f5210b = c5390j0;
            }

            /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object; */
            @Override // nu.InterfaceC9577i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC1237b abstractC1237b, InterfaceC9557b<? super Unit> interfaceC9557b) {
                this.f5209a.mo6414e(this.f5210b, abstractC1237b);
                return Unit.f29331a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C1247l c1247l, C5390j0 c5390j0, InterfaceC1244i interfaceC1244i, InterfaceC9557b<? super a> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f5206u = c1247l;
            this.f5207v = c5390j0;
            this.f5208w = interfaceC1244i;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new a(this.f5206u, this.f5207v, this.f5208w, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f5205t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                InterfaceC9575h<AbstractC1237b> interfaceC9575hM6958a = this.f5206u.m6958a(this.f5207v);
                C14094a c14094a = new C14094a(this.f5208w, this.f5207v);
                this.f5205t = 1;
                if (interfaceC9575hM6958a.collect(c14094a, this) == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    static {
        String strM47443i = AbstractC12732w.m47443i("WorkConstraintsTracker");
        Intrinsics.checkNotNullExpressionValue(strM47443i, "tagWithPrefix(...)");
        f5204a = strM47443i;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final C1242g m6961a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("connectivity");
        Intrinsics.m31981d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        return new C1242g((ConnectivityManager) systemService, 0L, 2, null);
    }

    /* JADX INFO: renamed from: d */
    public static final List<InterfaceC1545e> m6964d(C4463n c4463n) {
        List<InterfaceC1545e> listM31897p = C7699p.m31897p(new C1543c(c4463n.m22404a()), new C1544d(c4463n.getBatteryNotLowTracker()), new C1550j(c4463n.m22408e()));
        if (Build.VERSION.SDK_INT >= 28) {
            listM31897p.add(m6961a(c4463n.getContext()));
            return listM31897p;
        }
        AbstractC4457h<NetworkState> abstractC4457hM22407d = c4463n.m22407d();
        Intrinsics.checkNotNull(abstractC4457hM22407d);
        listM31897p.addAll(C7699p.m31895n(new C1546f(abstractC4457hM22407d), new C1549i(c4463n.m22407d()), new C1548h(c4463n.m22407d()), new C1547g(c4463n.m22407d())));
        return listM31897p;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final InterfaceC7850d2 m6965e(@NotNull C1247l c1247l, @NotNull C5390j0 spec, @NotNull AbstractC7888l0 dispatcher, @NotNull InterfaceC1244i listener) {
        Intrinsics.checkNotNullParameter(c1247l, "<this>");
        Intrinsics.checkNotNullParameter(spec, "spec");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(listener, "listener");
        return C7882k.m32780d(C7910q0.m32885a(dispatcher), null, null, new a(c1247l, spec, listener, null), 3, null);
    }
}
