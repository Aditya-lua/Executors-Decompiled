package p428s4;

import android.adservices.measurement.MeasurementManager;
import android.annotation.SuppressLint;
import android.net.Uri;
import android.view.InputEvent;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p092e3.ExecutorC4775n;
import p229jt.C7348o;
import p256ku.C7882k;
import p256ku.C7905p;
import p256ku.C7910q0;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10046b;
import p344ot.C10047c;
import p456u2.C11785n;
import pt.AbstractC10351m;
import pt.C10346h;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: s4.g */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0097@¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0097@¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0097@¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0097@¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0018H\u0097@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u001bH\u0097@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eH\u0097@¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, m31665d2 = {"Ls4/g;", "Ls4/b;", "Landroid/adservices/measurement/MeasurementManager;", "mMeasurementManager", "<init>", "(Landroid/adservices/measurement/MeasurementManager;)V", "Ls4/a;", "deletionRequest", "", "a", "(Ls4/a;Lnt/b;)Ljava/lang/Object;", "Landroid/net/Uri;", "attributionSource", "Landroid/view/InputEvent;", "inputEvent", "c", "(Landroid/net/Uri;Landroid/view/InputEvent;Lnt/b;)Ljava/lang/Object;", "trigger", "e", "(Landroid/net/Uri;Lnt/b;)Ljava/lang/Object;", "Ls4/i;", "request", "f", "(Ls4/i;Lnt/b;)Ljava/lang/Object;", "Ls4/h;", "d", "(Ls4/h;Lnt/b;)Ljava/lang/Object;", "Ls4/j;", "g", "(Ls4/j;Lnt/b;)Ljava/lang/Object;", "", "b", "(Lnt/b;)Ljava/lang/Object;", "Landroid/adservices/measurement/MeasurementManager;", "i", "()Landroid/adservices/measurement/MeasurementManager;", "ads-adservices_release"}, m31666k = 1, m31667mv = {1, 8, 0}, m31669xi = 48)
@SuppressLint({"NewApi", "ClassVerificationFailure"})
public class C11170g extends AbstractC11165b {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final MeasurementManager mMeasurementManager;

    /* JADX INFO: renamed from: s4.g$a */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {1, 8, 0})
    @InterfaceC10344f(m39663c = "androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon$registerSource$4", m39664f = "MeasurementManagerImplCommon.kt", m39665l = {}, m39666m = "invokeSuspend")
    public static final class a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f39407t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f39408u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ C11171h f39409v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ C11170g f39410w;

        /* JADX INFO: renamed from: s4.g$a$a, reason: collision with other inner class name */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {1, 8, 0})
        @InterfaceC10344f(m39663c = "androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon$registerSource$4$1$1", m39664f = "MeasurementManagerImplCommon.kt", m39665l = {131}, m39666m = "invokeSuspend")
        public static final class C14241a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t */
            public Object f39411t;

            /* JADX INFO: renamed from: u */
            public Object f39412u;

            /* JADX INFO: renamed from: v */
            public Object f39413v;

            /* JADX INFO: renamed from: w */
            public int f39414w;

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C11170g f39415x;

            /* JADX INFO: renamed from: y */
            public final /* synthetic */ Uri f39416y;

            /* JADX INFO: renamed from: z */
            public final /* synthetic */ C11171h f39417z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C14241a(C11170g c11170g, Uri uri, C11171h c11171h, InterfaceC9557b<? super C14241a> interfaceC9557b) {
                super(2, interfaceC9557b);
                this.f39415x = c11170g;
                this.f39416y = uri;
                this.f39417z = c11171h;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                return new C14241a(this.f39415x, this.f39416y, this.f39417z, interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                Object objM38805e = C10047c.m38805e();
                int i10 = this.f39414w;
                if (i10 == 0) {
                    C7348o.m30470b(obj);
                    C11170g c11170g = this.f39415x;
                    Uri uri = this.f39416y;
                    C11171h c11171h = this.f39417z;
                    this.f39411t = c11170g;
                    this.f39412u = uri;
                    this.f39413v = c11171h;
                    this.f39414w = 1;
                    C7905p c7905p = new C7905p(C10046b.m38803c(this), 1);
                    c7905p.m32860H();
                    c11170g.getMMeasurementManager().registerSource(uri, c11171h.getInputEvent(), new ExecutorC4775n(), C11785n.m44080a(c7905p));
                    Object objM32857A = c7905p.m32857A();
                    if (objM32857A == C10047c.m38805e()) {
                        C10346h.m39673c(this);
                    }
                    if (objM32857A == objM38805e) {
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
                return ((C14241a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C11171h c11171h, C11170g c11170g, InterfaceC9557b<? super a> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f39409v = c11171h;
            this.f39410w = c11170g;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            a aVar = new a(this.f39409v, this.f39410w, interfaceC9557b);
            aVar.f39408u = obj;
            return aVar;
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f39407t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            InterfaceC7906p0 interfaceC7906p0 = (InterfaceC7906p0) this.f39408u;
            List<Uri> listM42082b = this.f39409v.m42082b();
            C11170g c11170g = this.f39410w;
            C11171h c11171h = this.f39409v;
            Iterator<T> it = listM42082b.iterator();
            while (it.hasNext()) {
                C7882k.m32780d(interfaceC7906p0, null, null, new C14241a(c11170g, (Uri) it.next(), c11171h, null), 3, null);
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

    public C11170g(@NotNull MeasurementManager mMeasurementManager) {
        Intrinsics.checkNotNullParameter(mMeasurementManager, "mMeasurementManager");
        this.mMeasurementManager = mMeasurementManager;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ Object m42073h(C11170g c11170g, C11164a c11164a, InterfaceC9557b<? super Unit> interfaceC9557b) {
        new C7905p(C10046b.m38803c(interfaceC9557b), 1).m32860H();
        c11170g.getMMeasurementManager();
        throw null;
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ Object m42074j(C11170g c11170g, InterfaceC9557b<? super Integer> interfaceC9557b) {
        C7905p c7905p = new C7905p(C10046b.m38803c(interfaceC9557b), 1);
        c7905p.m32860H();
        c11170g.getMMeasurementManager().getMeasurementApiStatus(new ExecutorC4775n(), C11785n.m44080a(c7905p));
        Object objM32857A = c7905p.m32857A();
        if (objM32857A == C10047c.m38805e()) {
            C10346h.m39673c(interfaceC9557b);
        }
        return objM32857A;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ Object m42075k(C11170g c11170g, Uri uri, InputEvent inputEvent, InterfaceC9557b<? super Unit> interfaceC9557b) {
        C7905p c7905p = new C7905p(C10046b.m38803c(interfaceC9557b), 1);
        c7905p.m32860H();
        c11170g.getMMeasurementManager().registerSource(uri, inputEvent, new ExecutorC4775n(), C11785n.m44080a(c7905p));
        Object objM32857A = c7905p.m32857A();
        if (objM32857A == C10047c.m38805e()) {
            C10346h.m39673c(interfaceC9557b);
        }
        return objM32857A == C10047c.m38805e() ? objM32857A : Unit.f29331a;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ Object m42076l(C11170g c11170g, C11171h c11171h, InterfaceC9557b<? super Unit> interfaceC9557b) {
        Object objM32891g = C7910q0.m32891g(new a(c11171h, c11170g, null), interfaceC9557b);
        return objM32891g == C10047c.m38805e() ? objM32891g : Unit.f29331a;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ Object m42077m(C11170g c11170g, Uri uri, InterfaceC9557b<? super Unit> interfaceC9557b) {
        C7905p c7905p = new C7905p(C10046b.m38803c(interfaceC9557b), 1);
        c7905p.m32860H();
        c11170g.getMMeasurementManager().registerTrigger(uri, new ExecutorC4775n(), C11785n.m44080a(c7905p));
        Object objM32857A = c7905p.m32857A();
        if (objM32857A == C10047c.m38805e()) {
            C10346h.m39673c(interfaceC9557b);
        }
        return objM32857A == C10047c.m38805e() ? objM32857A : Unit.f29331a;
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ Object m42078n(C11170g c11170g, C11172i c11172i, InterfaceC9557b<? super Unit> interfaceC9557b) {
        new C7905p(C10046b.m38803c(interfaceC9557b), 1).m32860H();
        c11170g.getMMeasurementManager();
        throw null;
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ Object m42079o(C11170g c11170g, C11173j c11173j, InterfaceC9557b<? super Unit> interfaceC9557b) {
        new C7905p(C10046b.m38803c(interfaceC9557b), 1).m32860H();
        c11170g.getMMeasurementManager();
        throw null;
    }

    @Override // p428s4.AbstractC11165b
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo42062a(@NotNull C11164a c11164a, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        return m42073h(this, c11164a, interfaceC9557b);
    }

    @Override // p428s4.AbstractC11165b
    @Nullable
    /* JADX INFO: renamed from: b */
    public Object mo42063b(@NotNull InterfaceC9557b<? super Integer> interfaceC9557b) {
        return m42074j(this, interfaceC9557b);
    }

    @Override // p428s4.AbstractC11165b
    @Nullable
    /* JADX INFO: renamed from: c */
    public Object mo42064c(@NotNull Uri uri, @Nullable InputEvent inputEvent, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        return m42075k(this, uri, inputEvent, interfaceC9557b);
    }

    @Override // p428s4.AbstractC11165b
    @Nullable
    /* JADX INFO: renamed from: d */
    public Object mo42065d(@NotNull C11171h c11171h, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        return m42076l(this, c11171h, interfaceC9557b);
    }

    @Override // p428s4.AbstractC11165b
    @Nullable
    /* JADX INFO: renamed from: e */
    public Object mo42066e(@NotNull Uri uri, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        return m42077m(this, uri, interfaceC9557b);
    }

    @Override // p428s4.AbstractC11165b
    @Nullable
    /* JADX INFO: renamed from: f */
    public Object mo42067f(@NotNull C11172i c11172i, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        return m42078n(this, c11172i, interfaceC9557b);
    }

    @Override // p428s4.AbstractC11165b
    @Nullable
    /* JADX INFO: renamed from: g */
    public Object mo42068g(@NotNull C11173j c11173j, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        return m42079o(this, c11173j, interfaceC9557b);
    }

    @NotNull
    /* JADX INFO: renamed from: i, reason: from getter */
    public final MeasurementManager getMMeasurementManager() {
        return this.mMeasurementManager;
    }
}
