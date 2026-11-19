package t4;

import android.adservices.measurement.MeasurementManager;
import android.annotation.SuppressLint;
import android.net.Uri;
import android.view.InputEvent;
import av.k;
import av.p;
import av.p0;
import av.q0;
import com.github.luben.zstd.BuildConfig;
import e3.n;
import gu.m;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;
import zt.o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0097@¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0097@¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0097@¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0097@¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0018H\u0097@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u001bH\u0097@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eH\u0097@¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lt4/g;", "Lt4/b;", "Landroid/adservices/measurement/MeasurementManager;", "mMeasurementManager", "<init>", "(Landroid/adservices/measurement/MeasurementManager;)V", "Lt4/a;", "deletionRequest", BuildConfig.FLAVOR, "a", "(Lt4/a;Leu/b;)Ljava/lang/Object;", "Landroid/net/Uri;", "attributionSource", "Landroid/view/InputEvent;", "inputEvent", "c", "(Landroid/net/Uri;Landroid/view/InputEvent;Leu/b;)Ljava/lang/Object;", "trigger", "e", "(Landroid/net/Uri;Leu/b;)Ljava/lang/Object;", "Lt4/i;", "request", "f", "(Lt4/i;Leu/b;)Ljava/lang/Object;", "Lt4/h;", "d", "(Lt4/h;Leu/b;)Ljava/lang/Object;", "Lt4/j;", "g", "(Lt4/j;Leu/b;)Ljava/lang/Object;", BuildConfig.FLAVOR, "b", "(Leu/b;)Ljava/lang/Object;", "Landroid/adservices/measurement/MeasurementManager;", "i", "()Landroid/adservices/measurement/MeasurementManager;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"NewApi", "ClassVerificationFailure"})
public class g extends b {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final MeasurementManager mMeasurementManager;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {1, 8, 0})
    @gu.f(c = "androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon$registerSource$4", f = "MeasurementManagerImplCommon.kt", l = {}, m = "invokeSuspend")
    public static final class a extends m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f32107t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f32108u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ h f32109v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ g f32110w;

        /* JADX INFO: renamed from: t4.g$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {1, 8, 0})
        @gu.f(c = "androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon$registerSource$4$1$1", f = "MeasurementManagerImplCommon.kt", l = {131}, m = "invokeSuspend")
        public static final class C0642a extends m implements Function2<p0, eu.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public Object f32111t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public Object f32112u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public Object f32113v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public int f32114w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public final /* synthetic */ g f32115x;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            public final /* synthetic */ Uri f32116y;

            /* JADX INFO: renamed from: z, reason: collision with root package name */
            public final /* synthetic */ h f32117z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0642a(g gVar, Uri uri, h hVar, eu.b<? super C0642a> bVar) {
                super(2, bVar);
                this.f32115x = gVar;
                this.f32116y = uri;
                this.f32117z = hVar;
            }

            @Override // gu.a
            public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
                return new C0642a(this.f32115x, this.f32116y, this.f32117z, bVar);
            }

            @Override // p001kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
                return ((C0642a) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                Object objE = fu.c.e();
                int i10 = this.f32114w;
                if (i10 == 0) {
                    o.b(obj);
                    g gVar = this.f32115x;
                    Uri uri = this.f32116y;
                    h hVar = this.f32117z;
                    this.f32111t = gVar;
                    this.f32112u = uri;
                    this.f32113v = hVar;
                    this.f32114w = 1;
                    p pVar = new p(fu.b.c(this), 1);
                    pVar.G();
                    gVar.getMMeasurementManager().registerSource(uri, hVar.getInputEvent(), new n(), u2.n.a(pVar));
                    Object objY = pVar.y();
                    if (objY == fu.c.e()) {
                        gu.h.c(this);
                    }
                    if (objY == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                }
                return Unit.f21506a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h hVar, g gVar, eu.b<? super a> bVar) {
            super(2, bVar);
            this.f32109v = hVar;
            this.f32110w = gVar;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            a aVar = new a(this.f32109v, this.f32110w, bVar);
            aVar.f32108u = obj;
            return aVar;
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            fu.c.e();
            if (this.f32107t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            p0 p0Var = (p0) this.f32108u;
            List<Uri> listB = this.f32109v.b();
            g gVar = this.f32110w;
            h hVar = this.f32109v;
            Iterator<T> it = listB.iterator();
            while (it.hasNext()) {
                k.d(p0Var, null, null, new C0642a(gVar, (Uri) it.next(), hVar, null), 3, null);
            }
            return Unit.f21506a;
        }
    }

    public g(@NotNull MeasurementManager mMeasurementManager) {
        Intrinsics.checkNotNullParameter(mMeasurementManager, "mMeasurementManager");
        this.mMeasurementManager = mMeasurementManager;
    }

    public static /* synthetic */ Object h(g gVar, t4.a aVar, eu.b<? super Unit> bVar) {
        new p(fu.b.c(bVar), 1).G();
        gVar.getMMeasurementManager();
        throw null;
    }

    public static /* synthetic */ Object j(g gVar, eu.b<? super Integer> bVar) {
        p pVar = new p(fu.b.c(bVar), 1);
        pVar.G();
        gVar.getMMeasurementManager().getMeasurementApiStatus(new n(), u2.n.a(pVar));
        Object objY = pVar.y();
        if (objY == fu.c.e()) {
            gu.h.c(bVar);
        }
        return objY;
    }

    public static /* synthetic */ Object k(g gVar, Uri uri, InputEvent inputEvent, eu.b<? super Unit> bVar) {
        p pVar = new p(fu.b.c(bVar), 1);
        pVar.G();
        gVar.getMMeasurementManager().registerSource(uri, inputEvent, new n(), u2.n.a(pVar));
        Object objY = pVar.y();
        if (objY == fu.c.e()) {
            gu.h.c(bVar);
        }
        return objY == fu.c.e() ? objY : Unit.f21506a;
    }

    public static /* synthetic */ Object l(g gVar, h hVar, eu.b<? super Unit> bVar) {
        Object objG = q0.g(new a(hVar, gVar, null), bVar);
        return objG == fu.c.e() ? objG : Unit.f21506a;
    }

    public static /* synthetic */ Object m(g gVar, Uri uri, eu.b<? super Unit> bVar) {
        p pVar = new p(fu.b.c(bVar), 1);
        pVar.G();
        gVar.getMMeasurementManager().registerTrigger(uri, new n(), u2.n.a(pVar));
        Object objY = pVar.y();
        if (objY == fu.c.e()) {
            gu.h.c(bVar);
        }
        return objY == fu.c.e() ? objY : Unit.f21506a;
    }

    public static /* synthetic */ Object n(g gVar, i iVar, eu.b<? super Unit> bVar) {
        new p(fu.b.c(bVar), 1).G();
        gVar.getMMeasurementManager();
        throw null;
    }

    public static /* synthetic */ Object o(g gVar, j jVar, eu.b<? super Unit> bVar) {
        new p(fu.b.c(bVar), 1).G();
        gVar.getMMeasurementManager();
        throw null;
    }

    @Override // t4.b
    @Nullable
    public Object a(@NotNull t4.a aVar, @NotNull eu.b<? super Unit> bVar) {
        return h(this, aVar, bVar);
    }

    @Override // t4.b
    @Nullable
    public Object b(@NotNull eu.b<? super Integer> bVar) {
        return j(this, bVar);
    }

    @Override // t4.b
    @Nullable
    public Object c(@NotNull Uri uri, @Nullable InputEvent inputEvent, @NotNull eu.b<? super Unit> bVar) {
        return k(this, uri, inputEvent, bVar);
    }

    @Override // t4.b
    @Nullable
    public Object d(@NotNull h hVar, @NotNull eu.b<? super Unit> bVar) {
        return l(this, hVar, bVar);
    }

    @Override // t4.b
    @Nullable
    public Object e(@NotNull Uri uri, @NotNull eu.b<? super Unit> bVar) {
        return m(this, uri, bVar);
    }

    @Override // t4.b
    @Nullable
    public Object f(@NotNull i iVar, @NotNull eu.b<? super Unit> bVar) {
        return n(this, iVar, bVar);
    }

    @Override // t4.b
    @Nullable
    public Object g(@NotNull j jVar, @NotNull eu.b<? super Unit> bVar) {
        return o(this, jVar, bVar);
    }

    @NotNull
    /* JADX INFO: renamed from: i, reason: from getter */
    public final MeasurementManager getMMeasurementManager() {
        return this.mMeasurementManager;
    }
}
