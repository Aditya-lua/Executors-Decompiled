package fq;

import android.app.PendingIntent;
import android.content.Context;
import android.content.IntentSender;
import com.github.luben.zstd.BuildConfig;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.tasks.Task;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0002\u000e\u0012B!\b\u0007\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lfq/j;", "Lln/o;", "Lfq/j$b;", "Lls/j;", "Lg/d;", "Lg/i;", "resolvableApiLauncher", "Landroid/content/Context;", "context", "<init>", "(Lg/d;Landroid/content/Context;)V", "Ldv/h;", "run", "()Ldv/h;", "b", "Lg/d;", "c", "Landroid/content/Context;", "a", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j implements ln.o<b>, ls.j<b> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final g.d<g.i> resolvableApiLauncher;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context context;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lfq/j$a;", BuildConfig.FLAVOR, "Lfq/j;", "a", "()Lfq/j;", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        @NotNull
        j a();
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lfq/j$b;", BuildConfig.FLAVOR, "<init>", "()V", "c", "b", "a", "Lfq/j$b$a;", "Lfq/j$b$b;", "Lfq/j$b$c;", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class b {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lfq/j$b$a;", "Lfq/j$b;", "<init>", "()V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f16412a = new a();

            public a() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return -588562023;
            }

            @NotNull
            public String toString() {
                return "Denied";
            }
        }

        /* JADX INFO: renamed from: fq.j$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lfq/j$b$b;", "Lfq/j$b;", "<init>", "()V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C0302b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0302b f16413a = new C0302b();

            public C0302b() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof C0302b);
            }

            public int hashCode() {
                return 726963865;
            }

            @NotNull
            public String toString() {
                return "NotSupported";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lfq/j$b$c;", "Lfq/j$b;", "<init>", "()V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class c extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final c f16414a = new c();

            public c() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof c);
            }

            public int hashCode() {
                return -190170683;
            }

            @NotNull
            public String toString() {
                return "Success";
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldv/i;", "Lfq/j$b;", BuildConfig.FLAVOR, "<anonymous>", "(Ldv/i;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorker$run$1", f = "DeviceFeatureRequestWorker.kt", l = {103, 62, 68, 77, 85}, m = "invokeSuspend")
    public static final class c extends gu.m implements Function2<dv.i<? super b>, eu.b<? super Unit>, Object> {
        public int A;
        public /* synthetic */ Object B;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f16415t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f16416u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f16417v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f16418w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f16419x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public Object f16420y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f16421z;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements dv.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ dv.i<b> f16422a;

            /* JADX WARN: Multi-variable type inference failed */
            public a(dv.i<? super b> iVar) {
                this.f16422a = iVar;
            }

            @Override // dv.i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(g.a aVar, eu.b<? super Unit> bVar) {
                if (aVar == null || aVar.getResultCode() != -1) {
                    Object objEmit = this.f16422a.emit(b.a.f16412a, bVar);
                    return objEmit == fu.c.e() ? objEmit : Unit.f21506a;
                }
                Object objEmit2 = this.f16422a.emit(b.c.f16414a, bVar);
                return objEmit2 == fu.c.e() ? objEmit2 : Unit.f21506a;
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class b implements Function1<mb.g, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ av.n<zt.n<? extends mb.g>> f16423a;

            /* JADX WARN: Multi-variable type inference failed */
            public b(av.n<? super zt.n<? extends mb.g>> nVar) {
                this.f16423a = nVar;
            }

            public final void a(mb.g gVar) {
                this.f16423a.resumeWith(zt.n.b(zt.n.a(zt.n.b(gVar))));
            }

            @Override // p001kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(mb.g gVar) {
                a(gVar);
                return Unit.f21506a;
            }
        }

        /* JADX INFO: renamed from: fq.j$c$c, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0303c implements tb.f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ av.n<zt.n<? extends mb.g>> f16424a;

            /* JADX WARN: Multi-variable type inference failed */
            public C0303c(av.n<? super zt.n<? extends mb.g>> nVar) {
                this.f16424a = nVar;
            }

            @Override // tb.f
            public final void onFailure(Exception exception) {
                Intrinsics.checkNotNullParameter(exception, "exception");
                av.n<zt.n<? extends mb.g>> nVar = this.f16424a;
                zt.n.Companion companion = zt.n.INSTANCE;
                nVar.resumeWith(zt.n.b(zt.n.a(zt.n.b(zt.o.a(exception)))));
            }
        }

        public c(eu.b<? super c> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            c cVar = j.this.new c(bVar);
            cVar.B = obj;
            return cVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x0155, code lost:
        
            if (r0.emit(r3, r13) == r1) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0190, code lost:
        
            if (r0.emit(r3, r13) == r1) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x0233, code lost:
        
            if (r0.emit(r8, r13) == r1) goto L50;
         */
        @Override // gu.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            mb.i iVarB;
            LocationRequest locationRequest;
            LocationSettingsRequest locationSettingsRequest;
            Object obj2;
            IntentSender.SendIntentException e10;
            mb.i iVar;
            Throwable th2;
            LocationSettingsRequest locationSettingsRequest2;
            LocationRequest locationRequest2;
            dv.i iVar2 = (dv.i) this.B;
            Object objE = fu.c.e();
            int i10 = this.A;
            if (i10 == 0) {
                zt.o.b(obj);
                LocationRequest locationRequestBuild = new LocationRequest.Builder(10000L).setPriority(100).setMinUpdateIntervalMillis(5000L).build();
                Intrinsics.checkNotNullExpressionValue(locationRequestBuild, "build(...)");
                LocationSettingsRequest locationSettingsRequestB = new LocationSettingsRequest.a().a(locationRequestBuild).c(true).b();
                Intrinsics.checkNotNullExpressionValue(locationSettingsRequestB, "build(...)");
                iVarB = mb.f.b(j.this.context);
                Intrinsics.checkNotNullExpressionValue(iVarB, "getSettingsClient(...)");
                this.B = iVar2;
                this.f16415t = gu.l.a(locationRequestBuild);
                this.f16416u = locationSettingsRequestB;
                this.f16417v = iVarB;
                this.f16421z = 0;
                this.A = 1;
                av.p pVar = new av.p(fu.b.c(this), 1);
                pVar.G();
                Task taskCheckLocationSettings = iVarB.checkLocationSettings(locationSettingsRequestB);
                Intrinsics.checkNotNullExpressionValue(taskCheckLocationSettings, "checkLocationSettings(...)");
                taskCheckLocationSettings.g(new d(new b(pVar)));
                taskCheckLocationSettings.e(new C0303c(pVar));
                Object objY = pVar.y();
                if (objY == fu.c.e()) {
                    gu.h.c(this);
                }
                if (objY != objE) {
                    locationRequest = locationRequestBuild;
                    obj = objY;
                    locationSettingsRequest = locationSettingsRequestB;
                }
                return objE;
            }
            if (i10 == 1) {
                iVarB = (mb.i) this.f16417v;
                locationSettingsRequest = (LocationSettingsRequest) this.f16416u;
                locationRequest = (LocationRequest) this.f16415t;
                zt.o.b(obj);
            } else {
                if (i10 == 2) {
                    zt.o.b(obj);
                    return Unit.f21506a;
                }
                if (i10 == 3) {
                    zt.o.b(obj);
                    return Unit.f21506a;
                }
                if (i10 != 4) {
                    if (i10 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zt.o.b(obj);
                    return Unit.f21506a;
                }
                th2 = (Throwable) this.f16419x;
                obj2 = this.f16418w;
                iVar = (mb.i) this.f16417v;
                locationSettingsRequest2 = (LocationSettingsRequest) this.f16416u;
                locationRequest2 = (LocationRequest) this.f16415t;
                try {
                    zt.o.b(obj);
                    throw new zt.d();
                } catch (IntentSender.SendIntentException e11) {
                    e10 = e11;
                    b.C0302b c0302b = b.C0302b.f16413a;
                    this.B = gu.l.a(iVar2);
                    this.f16415t = gu.l.a(locationRequest2);
                    this.f16416u = gu.l.a(locationSettingsRequest2);
                    this.f16417v = gu.l.a(iVar);
                    this.f16418w = gu.l.a(obj2);
                    this.f16419x = gu.l.a(th2);
                    this.f16420y = gu.l.a(e10);
                    this.A = 5;
                }
            }
            Object value = ((zt.n) obj).getValue();
            if (zt.n.h(value)) {
                b.c cVar = b.c.f16414a;
                this.B = gu.l.a(iVar2);
                this.f16415t = gu.l.a(locationRequest);
                this.f16416u = gu.l.a(locationSettingsRequest);
                this.f16417v = gu.l.a(iVarB);
                this.f16418w = gu.l.a(value);
                this.A = 2;
            } else {
                Throwable thE = zt.n.e(value);
                if (thE instanceof l9.n) {
                    try {
                        PendingIntent pendingIntentC = ((l9.n) thE).c();
                        Intrinsics.checkNotNullExpressionValue(pendingIntentC, "getResolution(...)");
                        g.i iVarA = new g.i.a(pendingIntentC).a();
                        j.this.resolvableApiLauncher.b(iVarA);
                        aq.g0 g0Var = new aq.g0();
                        a aVar = new a(iVar2);
                        this.B = iVar2;
                        this.f16415t = gu.l.a(locationRequest);
                        this.f16416u = gu.l.a(locationSettingsRequest);
                        this.f16417v = gu.l.a(iVarB);
                        this.f16418w = gu.l.a(value);
                        this.f16419x = gu.l.a(thE);
                        this.f16420y = gu.l.a(iVarA);
                        this.A = 4;
                        if (g0Var.collect(aVar, this) != objE) {
                            obj2 = value;
                            iVar = iVarB;
                            th2 = thE;
                            locationSettingsRequest2 = locationSettingsRequest;
                            locationRequest2 = locationRequest;
                            throw new zt.d();
                        }
                    } catch (IntentSender.SendIntentException e12) {
                        obj2 = value;
                        e10 = e12;
                        iVar = iVarB;
                        th2 = thE;
                        locationSettingsRequest2 = locationSettingsRequest;
                        locationRequest2 = locationRequest;
                        b.C0302b c0302b2 = b.C0302b.f16413a;
                        this.B = gu.l.a(iVar2);
                        this.f16415t = gu.l.a(locationRequest2);
                        this.f16416u = gu.l.a(locationSettingsRequest2);
                        this.f16417v = gu.l.a(iVar);
                        this.f16418w = gu.l.a(obj2);
                        this.f16419x = gu.l.a(th2);
                        this.f16420y = gu.l.a(e10);
                        this.A = 5;
                    }
                } else {
                    b.C0302b c0302b3 = b.C0302b.f16413a;
                    this.B = gu.l.a(iVar2);
                    this.f16415t = gu.l.a(locationRequest);
                    this.f16416u = gu.l.a(locationSettingsRequest);
                    this.f16417v = gu.l.a(iVarB);
                    this.f16418w = gu.l.a(value);
                    this.f16419x = gu.l.a(thE);
                    this.A = 3;
                }
            }
            return objE;
        }

        @Override // p001kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(dv.i<? super b> iVar, eu.b<? super Unit> bVar) {
            return ((c) create(iVar, bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class d implements tb.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function1 f16425a;

        public d(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f16425a = function;
        }

        @Override // tb.g
        public final /* synthetic */ void onSuccess(Object obj) {
            this.f16425a.invoke(obj);
        }
    }

    public j(@NotNull g.d<g.i> resolvableApiLauncher, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(resolvableApiLauncher, "resolvableApiLauncher");
        Intrinsics.checkNotNullParameter(context, "context");
        this.resolvableApiLauncher = resolvableApiLauncher;
        this.context = context;
    }

    @Override // ln.o
    public boolean a(@NotNull ln.o<?> oVar) {
        return ln.o.b.a(this, oVar);
    }

    @Override // ls.j
    public boolean b(@NotNull ls.j<?> jVar) {
        return super.b(jVar);
    }

    @Override // ls.j
    public boolean c(@NotNull ls.j<?> jVar) {
        return super.c(jVar);
    }

    @Override // ln.o, ls.j
    @NotNull
    public dv.h<b> run() {
        return dv.j.w(new c(null));
    }
}
