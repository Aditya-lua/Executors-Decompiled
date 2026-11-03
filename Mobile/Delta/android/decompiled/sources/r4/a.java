package r4;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import gt.o;
import iu.g1;
import iu.k;
import iu.p0;
import iu.q0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ne.x;
import nt.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s4.b;
import s4.h;
import s4.i;
import s4.j;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b&\u0018\u0000 \r2\u00020\u0001:\u0002\r\u000bB\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0006H'¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lr4/a;", "", "<init>", "()V", "Landroid/net/Uri;", "trigger", "Lne/x;", "", "c", "(Landroid/net/Uri;)Lne/x;", "", "b", "()Lne/x;", "a", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: r4.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0016\u001a\u00020\fH\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0013\u001a\u00020\u0019H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0013\u001a\u00020\u001cH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\bH\u0017¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\"¨\u0006#"}, d2 = {"Lr4/a$a;", "Lr4/a;", "Ls4/b;", "mMeasurementManager", "<init>", "(Ls4/b;)V", "Ls4/a;", "deletionRequest", "Lne/x;", "", "e", "(Ls4/a;)Lne/x;", "Landroid/net/Uri;", "attributionSource", "Landroid/view/InputEvent;", "inputEvent", "f", "(Landroid/net/Uri;Landroid/view/InputEvent;)Lne/x;", "Ls4/h;", "request", "g", "(Ls4/h;)Lne/x;", "trigger", "c", "(Landroid/net/Uri;)Lne/x;", "Ls4/i;", "h", "(Ls4/i;)Lne/x;", "Ls4/j;", "i", "(Ls4/j;)Lne/x;", "", "b", "()Lne/x;", "Ls4/b;", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class C0532a extends a {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final s4.b mMeasurementManager;

        /* JADX INFO: renamed from: r4.a$a$a, reason: collision with other inner class name */
        @nt.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$deleteRegistrationsAsync$1", f = "MeasurementManagerFutures.kt", l = {132}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {1, 8, 0})
        public static final class C0533a extends m implements Function2<p0, lt.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f30179t;

            public C0533a(s4.a aVar, lt.b<? super C0533a> bVar) {
                super(2, bVar);
            }

            @Override // nt.a
            public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
                return C0532a.this.new C0533a(null, bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
                return ((C0533a) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
            }

            @Override // nt.a
            public final Object invokeSuspend(Object obj) {
                Object objE = mt.c.e();
                int i10 = this.f30179t;
                if (i10 == 0) {
                    o.b(obj);
                    s4.b bVar = C0532a.this.mMeasurementManager;
                    this.f30179t = 1;
                    if (bVar.a(null, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                }
                return Unit.f22938a;
            }
        }

        /* JADX INFO: renamed from: r4.a$a$b */
        @nt.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$getMeasurementApiStatusAsync$1", f = "MeasurementManagerFutures.kt", l = {190}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)I"}, k = 3, mv = {1, 8, 0})
        public static final class b extends m implements Function2<p0, lt.b<? super Integer>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f30181t;

            public b(lt.b<? super b> bVar) {
                super(2, bVar);
            }

            @Override // nt.a
            public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
                return C0532a.this.new b(bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, lt.b<? super Integer> bVar) {
                return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
            }

            @Override // nt.a
            public final Object invokeSuspend(Object obj) {
                Object objE = mt.c.e();
                int i10 = this.f30181t;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                    return obj;
                }
                o.b(obj);
                s4.b bVar = C0532a.this.mMeasurementManager;
                this.f30181t = 1;
                Object objB = bVar.b(this);
                return objB == objE ? objE : objB;
            }
        }

        /* JADX INFO: renamed from: r4.a$a$c */
        @nt.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerSourceAsync$1", f = "MeasurementManagerFutures.kt", l = {143}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {1, 8, 0})
        public static final class c extends m implements Function2<p0, lt.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f30183t;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ Uri f30185v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ InputEvent f30186w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Uri uri, InputEvent inputEvent, lt.b<? super c> bVar) {
                super(2, bVar);
                this.f30185v = uri;
                this.f30186w = inputEvent;
            }

            @Override // nt.a
            public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
                return C0532a.this.new c(this.f30185v, this.f30186w, bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
                return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
            }

            @Override // nt.a
            public final Object invokeSuspend(Object obj) {
                Object objE = mt.c.e();
                int i10 = this.f30183t;
                if (i10 == 0) {
                    o.b(obj);
                    s4.b bVar = C0532a.this.mMeasurementManager;
                    Uri uri = this.f30185v;
                    InputEvent inputEvent = this.f30186w;
                    this.f30183t = 1;
                    if (bVar.c(uri, inputEvent, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                }
                return Unit.f22938a;
            }
        }

        /* JADX INFO: renamed from: r4.a$a$d */
        @nt.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerSourceAsync$2", f = "MeasurementManagerFutures.kt", l = {154}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {1, 8, 0})
        public static final class d extends m implements Function2<p0, lt.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f30187t;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ h f30189v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(h hVar, lt.b<? super d> bVar) {
                super(2, bVar);
                this.f30189v = hVar;
            }

            @Override // nt.a
            public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
                return C0532a.this.new d(this.f30189v, bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
                return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
            }

            @Override // nt.a
            public final Object invokeSuspend(Object obj) {
                Object objE = mt.c.e();
                int i10 = this.f30187t;
                if (i10 == 0) {
                    o.b(obj);
                    s4.b bVar = C0532a.this.mMeasurementManager;
                    h hVar = this.f30189v;
                    this.f30187t = 1;
                    if (bVar.d(hVar, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                }
                return Unit.f22938a;
            }
        }

        /* JADX INFO: renamed from: r4.a$a$e */
        @nt.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerTriggerAsync$1", f = "MeasurementManagerFutures.kt", l = {162}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {1, 8, 0})
        public static final class e extends m implements Function2<p0, lt.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f30190t;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ Uri f30192v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(Uri uri, lt.b<? super e> bVar) {
                super(2, bVar);
                this.f30192v = uri;
            }

            @Override // nt.a
            public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
                return C0532a.this.new e(this.f30192v, bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
                return ((e) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
            }

            @Override // nt.a
            public final Object invokeSuspend(Object obj) {
                Object objE = mt.c.e();
                int i10 = this.f30190t;
                if (i10 == 0) {
                    o.b(obj);
                    s4.b bVar = C0532a.this.mMeasurementManager;
                    Uri uri = this.f30192v;
                    this.f30190t = 1;
                    if (bVar.e(uri, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                }
                return Unit.f22938a;
            }
        }

        /* JADX INFO: renamed from: r4.a$a$f */
        @nt.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerWebSourceAsync$1", f = "MeasurementManagerFutures.kt", l = {172}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {1, 8, 0})
        public static final class f extends m implements Function2<p0, lt.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f30193t;

            public f(i iVar, lt.b<? super f> bVar) {
                super(2, bVar);
            }

            @Override // nt.a
            public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
                return C0532a.this.new f(null, bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
                return ((f) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
            }

            @Override // nt.a
            public final Object invokeSuspend(Object obj) {
                Object objE = mt.c.e();
                int i10 = this.f30193t;
                if (i10 == 0) {
                    o.b(obj);
                    s4.b bVar = C0532a.this.mMeasurementManager;
                    this.f30193t = 1;
                    if (bVar.f(null, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                }
                return Unit.f22938a;
            }
        }

        /* JADX INFO: renamed from: r4.a$a$g */
        @nt.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerWebTriggerAsync$1", f = "MeasurementManagerFutures.kt", l = {182}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {1, 8, 0})
        public static final class g extends m implements Function2<p0, lt.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f30195t;

            public g(j jVar, lt.b<? super g> bVar) {
                super(2, bVar);
            }

            @Override // nt.a
            public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
                return C0532a.this.new g(null, bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
                return ((g) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
            }

            @Override // nt.a
            public final Object invokeSuspend(Object obj) {
                Object objE = mt.c.e();
                int i10 = this.f30195t;
                if (i10 == 0) {
                    o.b(obj);
                    s4.b bVar = C0532a.this.mMeasurementManager;
                    this.f30195t = 1;
                    if (bVar.g(null, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                }
                return Unit.f22938a;
            }
        }

        public C0532a(@NotNull s4.b mMeasurementManager) {
            Intrinsics.checkNotNullParameter(mMeasurementManager, "mMeasurementManager");
            this.mMeasurementManager = mMeasurementManager;
        }

        @Override // r4.a
        @NotNull
        public x<Integer> b() {
            return q4.b.c(k.b(q0.a(g1.a()), null, null, new b(null), 3, null), null, 1, null);
        }

        @Override // r4.a
        @NotNull
        public x<Unit> c(@NotNull Uri trigger) {
            Intrinsics.checkNotNullParameter(trigger, "trigger");
            return q4.b.c(k.b(q0.a(g1.a()), null, null, new e(trigger, null), 3, null), null, 1, null);
        }

        @NotNull
        public x<Unit> e(@NotNull s4.a deletionRequest) {
            Intrinsics.checkNotNullParameter(deletionRequest, "deletionRequest");
            return q4.b.c(k.b(q0.a(g1.a()), null, null, new C0533a(deletionRequest, null), 3, null), null, 1, null);
        }

        @NotNull
        public x<Unit> f(@NotNull Uri attributionSource, @Nullable InputEvent inputEvent) {
            Intrinsics.checkNotNullParameter(attributionSource, "attributionSource");
            return q4.b.c(k.b(q0.a(g1.a()), null, null, new c(attributionSource, inputEvent, null), 3, null), null, 1, null);
        }

        @NotNull
        public x<Unit> g(@NotNull h request) {
            Intrinsics.checkNotNullParameter(request, "request");
            return q4.b.c(k.b(q0.a(g1.a()), null, null, new d(request, null), 3, null), null, 1, null);
        }

        @NotNull
        public x<Unit> h(@NotNull i request) {
            Intrinsics.checkNotNullParameter(request, "request");
            return q4.b.c(k.b(q0.a(g1.a()), null, null, new f(request, null), 3, null), null, 1, null);
        }

        @NotNull
        public x<Unit> i(@NotNull j request) {
            Intrinsics.checkNotNullParameter(request, "request");
            return q4.b.c(k.b(q0.a(g1.a()), null, null, new g(request, null), 3, null), null, 1, null);
        }
    }

    /* JADX INFO: renamed from: r4.a$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lr4/a$b;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lr4/a;", "a", "(Landroid/content/Context;)Lr4/a;", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final a a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            b bVarA = b.INSTANCE.a(context);
            if (bVarA != null) {
                return new C0532a(bVarA);
            }
            return null;
        }

        public Companion() {
        }
    }

    @Nullable
    public static final a a(@NotNull Context context) {
        return INSTANCE.a(context);
    }

    @NotNull
    public abstract x<Integer> b();

    @NotNull
    public abstract x<Unit> c(@NotNull Uri trigger);
}
