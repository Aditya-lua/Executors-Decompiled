package p026b6;

import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.Build;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mu.C8685t;
import mu.InterfaceC8687v;
import mu.InterfaceC8690y;
import nu.C9579j;
import nu.InterfaceC9575h;
import org.jetbrains.annotations.NotNull;
import p042c6.InterfaceC1545e;
import p120f6.C5390j0;
import p146g6.C6041u;
import p229jt.C7348o;
import p256ku.C7882k;
import p256ku.C7946z0;
import p256ku.InterfaceC7850d2;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p536x5.AbstractC12732w;
import p536x5.C12694d;
import p536x5.EnumC12734x;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: b6.g */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0014¨\u0006\u0015"}, m31665d2 = {"Lb6/g;", "Lc6/e;", "Landroid/net/ConnectivityManager;", "connManager", "", "timeoutMs", "<init>", "(Landroid/net/ConnectivityManager;J)V", "Lx5/d;", "constraints", "Lnu/h;", "Lb6/b;", "b", "(Lx5/d;)Lnu/h;", "Lf6/j0;", "workSpec", "", "a", "(Lf6/j0;)Z", "Landroid/net/ConnectivityManager;", "J", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C1242g implements InterfaceC1545e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ConnectivityManager connManager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final long timeoutMs;

    /* JADX INFO: renamed from: b6.g$a */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lmu/v;", "Lb6/b;", "", "<anonymous>", "(Lmu/v;)V"}, m31666k = 3, m31667mv = {2, 1, 0})
    @InterfaceC10344f(m39663c = "androidx.work.impl.constraints.NetworkRequestConstraintController$track$1", m39664f = "WorkConstraintsTracker.kt", m39665l = {191}, m39666m = "invokeSuspend")
    public static final class a extends AbstractC10351m implements Function2<InterfaceC8687v<? super AbstractC1237b>, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f5178t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f5179u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ C12694d f5180v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ C1242g f5181w;

        /* JADX INFO: renamed from: b6.g$a$a, reason: collision with other inner class name */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 1, 0})
        @InterfaceC10344f(m39663c = "androidx.work.impl.constraints.NetworkRequestConstraintController$track$1$timeoutJob$1", m39664f = "WorkConstraintsTracker.kt", m39665l = {162}, m39666m = "invokeSuspend")
        public static final class C14092a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t */
            public int f5182t;

            /* JADX INFO: renamed from: u */
            public final /* synthetic */ C1242g f5183u;

            /* JADX INFO: renamed from: v */
            public final /* synthetic */ InterfaceC8687v<AbstractC1237b> f5184v;

            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: mu.v<? super b6.b> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C14092a(C1242g c1242g, InterfaceC8687v<? super AbstractC1237b> interfaceC8687v, InterfaceC9557b<? super C14092a> interfaceC9557b) {
                super(2, interfaceC9557b);
                this.f5183u = c1242g;
                this.f5184v = interfaceC8687v;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                return new C14092a(this.f5183u, this.f5184v, interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                Object objM38805e = C10047c.m38805e();
                int i10 = this.f5182t;
                if (i10 == 0) {
                    C7348o.m30470b(obj);
                    long j10 = this.f5183u.timeoutMs;
                    this.f5182t = 1;
                    if (C7946z0.m32938b(j10, this) == objM38805e) {
                        return objM38805e;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                }
                AbstractC12732w.m47441e().mo47444a(C1248m.f5204a, "NetworkRequestConstraintController didn't receive neither onCapabilitiesChanged/onLost callback, sending `ConstraintsNotMet` after " + this.f5183u.timeoutMs + " ms");
                this.f5184v.mo34870w(new AbstractC1237b.ConstraintsNotMet(7));
                return Unit.f29331a;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
                return ((C14092a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C12694d c12694d, C1242g c1242g, InterfaceC9557b<? super a> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f5180v = c12694d;
            this.f5181w = c1242g;
        }

        /* JADX INFO: renamed from: t */
        public static final Unit m6943t(InterfaceC7850d2 interfaceC7850d2, InterfaceC8687v interfaceC8687v, AbstractC1237b abstractC1237b) {
            InterfaceC7850d2.a.m32603a(interfaceC7850d2, null, 1, null);
            interfaceC8687v.mo34870w(abstractC1237b);
            return Unit.f29331a;
        }

        /* JADX INFO: renamed from: u */
        public static final Unit m6944u(Function0 function0) {
            function0.invoke();
            return Unit.f29331a;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            a aVar = new a(this.f5180v, this.f5181w, interfaceC9557b);
            aVar.f5179u = obj;
            return aVar;
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f5178t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                final InterfaceC8687v interfaceC8687v = (InterfaceC8687v) this.f5179u;
                NetworkRequest networkRequestM47337d = this.f5180v.m47337d();
                if (networkRequestM47337d == null) {
                    networkRequestM47337d = C6041u.m26856a(this.f5180v.getRequiredNetworkType());
                }
                if (networkRequestM47337d == null) {
                    InterfaceC8690y.a.m34972a(interfaceC8687v.mo34971a(), null, 1, null);
                    return Unit.f29331a;
                }
                final InterfaceC7850d2 interfaceC7850d2M32780d = C7882k.m32780d(interfaceC8687v, null, null, new C14092a(this.f5181w, interfaceC8687v, null), 3, null);
                Function1<? super AbstractC1237b, Unit> function1 = new Function1() { // from class: b6.e
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return C1242g.a.m6943t(interfaceC7850d2M32780d, interfaceC8687v, (AbstractC1237b) obj2);
                    }
                };
                final Function0<Unit> function0M6955b = Build.VERSION.SDK_INT >= 30 ? C1246k.f5192a.m6955b(this.f5181w.connManager, networkRequestM47337d, function1) : C1239d.INSTANCE.m6936b(this.f5181w.connManager, networkRequestM47337d, function1);
                Function0 function0 = new Function0() { // from class: b6.f
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C1242g.a.m6944u(function0M6955b);
                    }
                };
                this.f5178t = 1;
                if (C8685t.m34964a(interfaceC8687v, function0, this) == objM38805e) {
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

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC8687v<? super AbstractC1237b> interfaceC8687v, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((a) create(interfaceC8687v, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1242g(@NotNull ConnectivityManager connManager, long j10) {
        Intrinsics.checkNotNullParameter(connManager, "connManager");
        this.connManager = connManager;
        this.timeoutMs = j10;
    }

    @Override // p042c6.InterfaceC1545e
    /* JADX INFO: renamed from: a */
    public boolean mo6939a(@NotNull C5390j0 workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        return (workSpec.constraints.m47337d() == null && workSpec.constraints.getRequiredNetworkType() == EnumC12734x.NOT_REQUIRED) ? false : true;
    }

    @Override // p042c6.InterfaceC1545e
    @NotNull
    /* JADX INFO: renamed from: b */
    public InterfaceC9575h<AbstractC1237b> mo6940b(@NotNull C12694d constraints) {
        Intrinsics.checkNotNullParameter(constraints, "constraints");
        return C9579j.m37787d(new a(constraints, this, null));
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
      (r1v0 android.net.ConnectivityManager)
      (wrap long:?: TERNARY null = ((wrap int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (1000 long) : (r2v0 long))
     A[MD:(android.net.ConnectivityManager, long):void (m)] (LINE:4) call: b6.g.<init>(android.net.ConnectivityManager, long):void type: THIS */
    public /* synthetic */ C1242g(ConnectivityManager connectivityManager, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(connectivityManager, (i10 & 2) != 0 ? 1000L : j10);
    }
}
