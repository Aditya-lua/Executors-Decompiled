package s4;

import android.adservices.measurement.MeasurementManager;
import android.annotation.SuppressLint;
import android.net.Uri;
import android.view.InputEvent;
import e3.n;
import java.util.Iterator;
import java.util.List;
import jt.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ku.k;
import ku.p;
import ku.p0;
import ku.q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pt.m;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0097@¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0097@¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0097@¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0097@¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0018H\u0097@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u001bH\u0097@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eH\u0097@¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Ls4/g;", "Ls4/b;", "Landroid/adservices/measurement/MeasurementManager;", "mMeasurementManager", "<init>", "(Landroid/adservices/measurement/MeasurementManager;)V", "Ls4/a;", "deletionRequest", "", "a", "(Ls4/a;Lnt/b;)Ljava/lang/Object;", "Landroid/net/Uri;", "attributionSource", "Landroid/view/InputEvent;", "inputEvent", "c", "(Landroid/net/Uri;Landroid/view/InputEvent;Lnt/b;)Ljava/lang/Object;", "trigger", "e", "(Landroid/net/Uri;Lnt/b;)Ljava/lang/Object;", "Ls4/i;", "request", "f", "(Ls4/i;Lnt/b;)Ljava/lang/Object;", "Ls4/h;", "d", "(Ls4/h;Lnt/b;)Ljava/lang/Object;", "Ls4/j;", "g", "(Ls4/j;Lnt/b;)Ljava/lang/Object;", "", "b", "(Lnt/b;)Ljava/lang/Object;", "Landroid/adservices/measurement/MeasurementManager;", "i", "()Landroid/adservices/measurement/MeasurementManager;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"NewApi", "ClassVerificationFailure"})
public class g extends b {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final MeasurementManager mMeasurementManager;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {1, 8, 0})
    @pt.f(c = "androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon$registerSource$4", f = "MeasurementManagerImplCommon.kt", l = {}, m = "invokeSuspend")
    public static final class a extends m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f30454t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f30455u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ h f30456v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ g f30457w;

        /* JADX INFO: renamed from: s4.g$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {1, 8, 0})
        @pt.f(c = "androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon$registerSource$4$1$1", f = "MeasurementManagerImplCommon.kt", l = {131}, m = "invokeSuspend")
        public static final class C0541a extends m implements Function2<p0, nt.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public Object f30458t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public Object f30459u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public Object f30460v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public int f30461w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public final /* synthetic */ g f30462x;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            public final /* synthetic */ Uri f30463y;

            /* JADX INFO: renamed from: z, reason: collision with root package name */
            public final /* synthetic */ h f30464z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0541a(g gVar, Uri uri, h hVar, nt.b<? super C0541a> bVar) {
                super(2, bVar);
                this.f30462x = gVar;
                this.f30463y = uri;
                this.f30464z = hVar;
            }

            @Override // pt.a
            public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
                return new C0541a(this.f30462x, this.f30463y, this.f30464z, bVar);
            }

            @Override // pt.a
            public final Object invokeSuspend(Object obj) {
                Object objE = ot.c.e();
                int i10 = this.f30461w;
                if (i10 == 0) {
                    o.b(obj);
                    g gVar = this.f30462x;
                    Uri uri = this.f30463y;
                    h hVar = this.f30464z;
                    this.f30458t = gVar;
                    this.f30459u = uri;
                    this.f30460v = hVar;
                    this.f30461w = 1;
                    p pVar = new p(ot.b.c(this), 1);
                    pVar.H();
                    gVar.getMMeasurementManager().registerSource(uri, hVar.getInputEvent(), new n(), u2.n.a(pVar));
                    Object objA = pVar.A();
                    if (objA == ot.c.e()) {
                        pt.h.c(this);
                    }
                    if (objA == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                }
                return Unit.f22483a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
                return ((C0541a) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h hVar, g gVar, nt.b<? super a> bVar) {
            super(2, bVar);
            this.f30456v = hVar;
            this.f30457w = gVar;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            a aVar = new a(this.f30456v, this.f30457w, bVar);
            aVar.f30455u = obj;
            return aVar;
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            ot.c.e();
            if (this.f30454t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            p0 p0Var = (p0) this.f30455u;
            List<Uri> listB = this.f30456v.b();
            g gVar = this.f30457w;
            h hVar = this.f30456v;
            Iterator<T> it = listB.iterator();
            while (it.hasNext()) {
                k.d(p0Var, null, null, new C0541a(gVar, (Uri) it.next(), hVar, null), 3, null);
            }
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    public g(@NotNull MeasurementManager mMeasurementManager) {
        Intrinsics.checkNotNullParameter(mMeasurementManager, "mMeasurementManager");
        this.mMeasurementManager = mMeasurementManager;
    }

    public static /* synthetic */ Object h(g gVar, s4.a aVar, nt.b<? super Unit> bVar) {
        new p(ot.b.c(bVar), 1).H();
        gVar.getMMeasurementManager();
        throw null;
    }

    public static /* synthetic */ Object j(g gVar, nt.b<? super Integer> bVar) {
        p pVar = new p(ot.b.c(bVar), 1);
        pVar.H();
        gVar.getMMeasurementManager().getMeasurementApiStatus(new n(), u2.n.a(pVar));
        Object objA = pVar.A();
        if (objA == ot.c.e()) {
            pt.h.c(bVar);
        }
        return objA;
    }

    public static /* synthetic */ Object k(g gVar, Uri uri, InputEvent inputEvent, nt.b<? super Unit> bVar) {
        p pVar = new p(ot.b.c(bVar), 1);
        pVar.H();
        gVar.getMMeasurementManager().registerSource(uri, inputEvent, new n(), u2.n.a(pVar));
        Object objA = pVar.A();
        if (objA == ot.c.e()) {
            pt.h.c(bVar);
        }
        return objA == ot.c.e() ? objA : Unit.f22483a;
    }

    public static /* synthetic */ Object l(g gVar, h hVar, nt.b<? super Unit> bVar) {
        Object objG = q0.g(new a(hVar, gVar, null), bVar);
        return objG == ot.c.e() ? objG : Unit.f22483a;
    }

    public static /* synthetic */ Object m(g gVar, Uri uri, nt.b<? super Unit> bVar) {
        p pVar = new p(ot.b.c(bVar), 1);
        pVar.H();
        gVar.getMMeasurementManager().registerTrigger(uri, new n(), u2.n.a(pVar));
        Object objA = pVar.A();
        if (objA == ot.c.e()) {
            pt.h.c(bVar);
        }
        return objA == ot.c.e() ? objA : Unit.f22483a;
    }

    public static /* synthetic */ Object n(g gVar, i iVar, nt.b<? super Unit> bVar) {
        new p(ot.b.c(bVar), 1).H();
        gVar.getMMeasurementManager();
        throw null;
    }

    public static /* synthetic */ Object o(g gVar, j jVar, nt.b<? super Unit> bVar) {
        new p(ot.b.c(bVar), 1).H();
        gVar.getMMeasurementManager();
        throw null;
    }

    @Override // s4.b
    @Nullable
    public Object a(@NotNull s4.a aVar, @NotNull nt.b<? super Unit> bVar) {
        return h(this, aVar, bVar);
    }

    @Override // s4.b
    @Nullable
    public Object b(@NotNull nt.b<? super Integer> bVar) {
        return j(this, bVar);
    }

    @Override // s4.b
    @Nullable
    public Object c(@NotNull Uri uri, @Nullable InputEvent inputEvent, @NotNull nt.b<? super Unit> bVar) {
        return k(this, uri, inputEvent, bVar);
    }

    @Override // s4.b
    @Nullable
    public Object d(@NotNull h hVar, @NotNull nt.b<? super Unit> bVar) {
        return l(this, hVar, bVar);
    }

    @Override // s4.b
    @Nullable
    public Object e(@NotNull Uri uri, @NotNull nt.b<? super Unit> bVar) {
        return m(this, uri, bVar);
    }

    @Override // s4.b
    @Nullable
    public Object f(@NotNull i iVar, @NotNull nt.b<? super Unit> bVar) {
        return n(this, iVar, bVar);
    }

    @Override // s4.b
    @Nullable
    public Object g(@NotNull j jVar, @NotNull nt.b<? super Unit> bVar) {
        return o(this, jVar, bVar);
    }

    @NotNull
    /* JADX INFO: renamed from: i, reason: from getter */
    public final MeasurementManager getMMeasurementManager() {
        return this.mMeasurementManager;
    }
}
