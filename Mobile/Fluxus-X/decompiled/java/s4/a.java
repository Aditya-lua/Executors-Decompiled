package s4;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import av.g1;
import av.k;
import av.p0;
import av.q0;
import com.github.luben.zstd.BuildConfig;
import gu.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import pe.x;
import t4.b;
import t4.h;
import t4.i;
import t4.j;
import zt.o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b&\u0018\u0000 \r2\u00020\u0001:\u0002\r\u000bB\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0006H'¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Ls4/a;", BuildConfig.FLAVOR, "<init>", "()V", "Landroid/net/Uri;", "trigger", "Lpe/x;", BuildConfig.FLAVOR, "c", "(Landroid/net/Uri;)Lpe/x;", BuildConfig.FLAVOR, "b", "()Lpe/x;", "a", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: s4.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0016\u001a\u00020\fH\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0013\u001a\u00020\u0019H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0013\u001a\u00020\u001cH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\bH\u0017¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\"¨\u0006#"}, d2 = {"Ls4/a$a;", "Ls4/a;", "Lt4/b;", "mMeasurementManager", "<init>", "(Lt4/b;)V", "Lt4/a;", "deletionRequest", "Lpe/x;", BuildConfig.FLAVOR, "e", "(Lt4/a;)Lpe/x;", "Landroid/net/Uri;", "attributionSource", "Landroid/view/InputEvent;", "inputEvent", "f", "(Landroid/net/Uri;Landroid/view/InputEvent;)Lpe/x;", "Lt4/h;", "request", "g", "(Lt4/h;)Lpe/x;", "trigger", "c", "(Landroid/net/Uri;)Lpe/x;", "Lt4/i;", "h", "(Lt4/i;)Lpe/x;", "Lt4/j;", "i", "(Lt4/j;)Lpe/x;", BuildConfig.FLAVOR, "b", "()Lpe/x;", "Lt4/b;", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class C0616a extends a {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final t4.b mMeasurementManager;

        /* JADX INFO: renamed from: s4.a$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {1, 8, 0})
        @gu.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$deleteRegistrationsAsync$1", f = "MeasurementManagerFutures.kt", l = {132}, m = "invokeSuspend")
        public static final class C0617a extends m implements Function2<p0, eu.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f31202t;

            public C0617a(t4.a aVar, eu.b<? super C0617a> bVar) {
                super(2, bVar);
            }

            @Override // gu.a
            public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
                return C0616a.this.new C0617a(null, bVar);
            }

            @Override // p001kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
                return ((C0617a) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                Object objE = fu.c.e();
                int i10 = this.f31202t;
                if (i10 == 0) {
                    o.b(obj);
                    t4.b bVar = C0616a.this.mMeasurementManager;
                    this.f31202t = 1;
                    if (bVar.a(null, this) == objE) {
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

        /* JADX INFO: renamed from: s4.a$a$b */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)I"}, k = 3, mv = {1, 8, 0})
        @gu.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$getMeasurementApiStatusAsync$1", f = "MeasurementManagerFutures.kt", l = {190}, m = "invokeSuspend")
        public static final class b extends m implements Function2<p0, eu.b<? super Integer>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f31204t;

            public b(eu.b<? super b> bVar) {
                super(2, bVar);
            }

            @Override // gu.a
            public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
                return C0616a.this.new b(bVar);
            }

            @Override // p001kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, eu.b<? super Integer> bVar) {
                return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                Object objE = fu.c.e();
                int i10 = this.f31204t;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                    return obj;
                }
                o.b(obj);
                t4.b bVar = C0616a.this.mMeasurementManager;
                this.f31204t = 1;
                Object objB = bVar.b(this);
                return objB == objE ? objE : objB;
            }
        }

        /* JADX INFO: renamed from: s4.a$a$c */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {1, 8, 0})
        @gu.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerSourceAsync$1", f = "MeasurementManagerFutures.kt", l = {143}, m = "invokeSuspend")
        public static final class c extends m implements Function2<p0, eu.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f31206t;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ Uri f31208v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ InputEvent f31209w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Uri uri, InputEvent inputEvent, eu.b<? super c> bVar) {
                super(2, bVar);
                this.f31208v = uri;
                this.f31209w = inputEvent;
            }

            @Override // gu.a
            public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
                return C0616a.this.new c(this.f31208v, this.f31209w, bVar);
            }

            @Override // p001kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
                return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                Object objE = fu.c.e();
                int i10 = this.f31206t;
                if (i10 == 0) {
                    o.b(obj);
                    t4.b bVar = C0616a.this.mMeasurementManager;
                    Uri uri = this.f31208v;
                    InputEvent inputEvent = this.f31209w;
                    this.f31206t = 1;
                    if (bVar.c(uri, inputEvent, this) == objE) {
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

        /* JADX INFO: renamed from: s4.a$a$d */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {1, 8, 0})
        @gu.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerSourceAsync$2", f = "MeasurementManagerFutures.kt", l = {154}, m = "invokeSuspend")
        public static final class d extends m implements Function2<p0, eu.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f31210t;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ h f31212v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(h hVar, eu.b<? super d> bVar) {
                super(2, bVar);
                this.f31212v = hVar;
            }

            @Override // gu.a
            public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
                return C0616a.this.new d(this.f31212v, bVar);
            }

            @Override // p001kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
                return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                Object objE = fu.c.e();
                int i10 = this.f31210t;
                if (i10 == 0) {
                    o.b(obj);
                    t4.b bVar = C0616a.this.mMeasurementManager;
                    h hVar = this.f31212v;
                    this.f31210t = 1;
                    if (bVar.d(hVar, this) == objE) {
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

        /* JADX INFO: renamed from: s4.a$a$e */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {1, 8, 0})
        @gu.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerTriggerAsync$1", f = "MeasurementManagerFutures.kt", l = {162}, m = "invokeSuspend")
        public static final class e extends m implements Function2<p0, eu.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f31213t;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ Uri f31215v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(Uri uri, eu.b<? super e> bVar) {
                super(2, bVar);
                this.f31215v = uri;
            }

            @Override // gu.a
            public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
                return C0616a.this.new e(this.f31215v, bVar);
            }

            @Override // p001kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
                return ((e) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                Object objE = fu.c.e();
                int i10 = this.f31213t;
                if (i10 == 0) {
                    o.b(obj);
                    t4.b bVar = C0616a.this.mMeasurementManager;
                    Uri uri = this.f31215v;
                    this.f31213t = 1;
                    if (bVar.e(uri, this) == objE) {
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

        /* JADX INFO: renamed from: s4.a$a$f */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {1, 8, 0})
        @gu.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerWebSourceAsync$1", f = "MeasurementManagerFutures.kt", l = {172}, m = "invokeSuspend")
        public static final class f extends m implements Function2<p0, eu.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f31216t;

            public f(i iVar, eu.b<? super f> bVar) {
                super(2, bVar);
            }

            @Override // gu.a
            public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
                return C0616a.this.new f(null, bVar);
            }

            @Override // p001kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
                return ((f) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                Object objE = fu.c.e();
                int i10 = this.f31216t;
                if (i10 == 0) {
                    o.b(obj);
                    t4.b bVar = C0616a.this.mMeasurementManager;
                    this.f31216t = 1;
                    if (bVar.f(null, this) == objE) {
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

        /* JADX INFO: renamed from: s4.a$a$g */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {1, 8, 0})
        @gu.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerWebTriggerAsync$1", f = "MeasurementManagerFutures.kt", l = {182}, m = "invokeSuspend")
        public static final class g extends m implements Function2<p0, eu.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f31218t;

            public g(j jVar, eu.b<? super g> bVar) {
                super(2, bVar);
            }

            @Override // gu.a
            public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
                return C0616a.this.new g(null, bVar);
            }

            @Override // p001kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
                return ((g) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                Object objE = fu.c.e();
                int i10 = this.f31218t;
                if (i10 == 0) {
                    o.b(obj);
                    t4.b bVar = C0616a.this.mMeasurementManager;
                    this.f31218t = 1;
                    if (bVar.g(null, this) == objE) {
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

        public C0616a(@NotNull t4.b mMeasurementManager) {
            Intrinsics.checkNotNullParameter(mMeasurementManager, "mMeasurementManager");
            this.mMeasurementManager = mMeasurementManager;
        }

        @Override // s4.a
        @NotNull
        public x<Integer> b() {
            return r4.b.c(k.b(q0.a(g1.a()), null, null, new b(null), 3, null), null, 1, null);
        }

        @Override // s4.a
        @NotNull
        public x<Unit> c(@NotNull Uri trigger) {
            Intrinsics.checkNotNullParameter(trigger, "trigger");
            return r4.b.c(k.b(q0.a(g1.a()), null, null, new e(trigger, null), 3, null), null, 1, null);
        }

        @NotNull
        public x<Unit> e(@NotNull t4.a deletionRequest) {
            Intrinsics.checkNotNullParameter(deletionRequest, "deletionRequest");
            return r4.b.c(k.b(q0.a(g1.a()), null, null, new C0617a(deletionRequest, null), 3, null), null, 1, null);
        }

        @NotNull
        public x<Unit> f(@NotNull Uri attributionSource, @Nullable InputEvent inputEvent) {
            Intrinsics.checkNotNullParameter(attributionSource, "attributionSource");
            return r4.b.c(k.b(q0.a(g1.a()), null, null, new c(attributionSource, inputEvent, null), 3, null), null, 1, null);
        }

        @NotNull
        public x<Unit> g(@NotNull h request) {
            Intrinsics.checkNotNullParameter(request, "request");
            return r4.b.c(k.b(q0.a(g1.a()), null, null, new d(request, null), 3, null), null, 1, null);
        }

        @NotNull
        public x<Unit> h(@NotNull i request) {
            Intrinsics.checkNotNullParameter(request, "request");
            return r4.b.c(k.b(q0.a(g1.a()), null, null, new f(request, null), 3, null), null, 1, null);
        }

        @NotNull
        public x<Unit> i(@NotNull j request) {
            Intrinsics.checkNotNullParameter(request, "request");
            return r4.b.c(k.b(q0.a(g1.a()), null, null, new g(request, null), 3, null), null, 1, null);
        }
    }

    /* JADX INFO: renamed from: s4.a$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ls4/a$b;", BuildConfig.FLAVOR, "<init>", "()V", "Landroid/content/Context;", "context", "Ls4/a;", "a", "(Landroid/content/Context;)Ls4/a;", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final a a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            b bVarA = b.INSTANCE.a(context);
            if (bVarA != null) {
                return new C0616a(bVarA);
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
