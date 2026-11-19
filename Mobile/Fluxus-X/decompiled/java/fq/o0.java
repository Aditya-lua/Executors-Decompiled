package fq;

import android.content.Context;
import com.appsflyer.share.attribution.RequestError;
import com.github.luben.zstd.BuildConfig;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.PermissionTrackingEventData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0002\u0018\u0013B1\b\u0007\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\u00102\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0013\u001a\u00020\u00102\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001aR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lfq/o0;", "Lln/o;", "Lfq/o0$b;", "Lls/j;", "Lg/d;", BuildConfig.FLAVOR, "requestPermissionsLauncher", "Landroid/content/Context;", "context", "Lfq/n0;", "permission", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "<init>", "(Lg/d;Landroid/content/Context;Lfq/n0;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V", "otherWorker", BuildConfig.FLAVOR, "c", "(Lls/j;)Z", "a", "(Lln/o;)Z", "Ldv/h;", "run", "()Ldv/h;", "b", "Lg/d;", "Landroid/content/Context;", "d", "Lfq/n0;", "e", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o0 implements ln.o<b>, ls.j<b> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final g.d<String> requestPermissionsLauncher;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final n0 permission;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lfq/o0$a;", BuildConfig.FLAVOR, "Landroid/content/Context;", "context", "Lg/d;", BuildConfig.FLAVOR, "requestPermissionsLauncher", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "<init>", "(Landroid/content/Context;Lg/d;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V", "Lfq/n0;", "permission", "Lfq/o0;", "a", "(Lfq/n0;)Lfq/o0;", "Landroid/content/Context;", "b", "Lg/d;", "c", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Context context;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final g.d<String> requestPermissionsLauncher;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final TrackingEventsLogger trackingEventsLogger;

        public a(@NotNull Context context, @NotNull g.d<String> requestPermissionsLauncher, @NotNull TrackingEventsLogger trackingEventsLogger) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(requestPermissionsLauncher, "requestPermissionsLauncher");
            Intrinsics.checkNotNullParameter(trackingEventsLogger, "trackingEventsLogger");
            this.context = context;
            this.requestPermissionsLauncher = requestPermissionsLauncher;
            this.trackingEventsLogger = trackingEventsLogger;
        }

        @NotNull
        public final o0 a(@NotNull n0 permission) {
            Intrinsics.checkNotNullParameter(permission, "permission");
            return new o0(this.requestPermissionsLauncher, this.context, permission, this.trackingEventsLogger);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lfq/o0$b;", BuildConfig.FLAVOR, "<init>", "()V", "b", "a", "Lfq/o0$b$a;", "Lfq/o0$b$b;", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class b {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lfq/o0$b$a;", "Lfq/o0$b;", "<init>", "()V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f16499a = new a();

            public a() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return -16139474;
            }

            @NotNull
            public String toString() {
                return "Denied";
            }
        }

        /* JADX INFO: renamed from: fq.o0$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lfq/o0$b$b;", "Lfq/o0$b;", "<init>", "()V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C0308b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0308b f16500a = new C0308b();

            public C0308b() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof C0308b);
            }

            public int hashCode() {
                return 375059152;
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldv/i;", "Lfq/o0$b;", BuildConfig.FLAVOR, "<anonymous>", "(Ldv/i;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.permissions.PermissionRequestDialogWorker$run$1", f = "PermissionRequestDialogWorker.kt", l = {46, RequestError.RESPONSE_CODE_FAILURE}, m = "invokeSuspend")
    public static final class c extends gu.m implements Function2<dv.i<? super b>, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f16501t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f16502u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f16503v;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements dv.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ dv.i<b> f16505a;

            /* JADX WARN: Multi-variable type inference failed */
            public a(dv.i<? super b> iVar) {
                this.f16505a = iVar;
            }

            public final Object b(boolean z10, eu.b<? super Unit> bVar) {
                if (z10) {
                    Object objEmit = this.f16505a.emit(b.C0308b.f16500a, bVar);
                    return objEmit == fu.c.e() ? objEmit : Unit.f21506a;
                }
                Object objEmit2 = this.f16505a.emit(b.a.f16499a, bVar);
                return objEmit2 == fu.c.e() ? objEmit2 : Unit.f21506a;
            }

            @Override // dv.i
            public /* bridge */ /* synthetic */ Object emit(Object obj, eu.b bVar) {
                return b(((Boolean) obj).booleanValue(), bVar);
            }
        }

        public c(eu.b<? super c> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            c cVar = o0.this.new c(bVar);
            cVar.f16503v = obj;
            return cVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0087, code lost:
        
            if (r0.emit(r12, r11) == r1) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x00bc, code lost:
        
            if (r12.collect(r2, r11) == r1) goto L22;
         */
        @Override // gu.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            dv.i iVar = (dv.i) this.f16503v;
            Object objE = fu.c.e();
            int i10 = this.f16502u;
            if (i10 != 0) {
                if (i10 == 1) {
                    zt.o.b(obj);
                    return Unit.f21506a;
                }
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
                throw new zt.d();
            }
            zt.o.b(obj);
            TrackingEventsLogger.logPermissionEvent$default(o0.this.trackingEventsLogger, new PermissionTrackingEventData(x1.c(o0.this.permission), "requested", null, 4, null), false, 2, null);
            h.a.C0337a synchronousResult = o0.this.requestPermissionsLauncher.a().getSynchronousResult(o0.this.context, x1.c(o0.this.permission));
            Object objA = synchronousResult != null ? synchronousResult.a() : null;
            if (Intrinsics.c(objA, gu.b.a(true))) {
                b.C0308b c0308b = b.C0308b.f16500a;
                this.f16503v = gu.l.a(iVar);
                this.f16501t = gu.l.a(objA);
                this.f16502u = 1;
            } else {
                o0.this.requestPermissionsLauncher.b(x1.c(o0.this.permission));
                aq.b0 b0Var = new aq.b0();
                a aVar = new a(iVar);
                this.f16503v = gu.l.a(iVar);
                this.f16501t = gu.l.a(objA);
                this.f16502u = 2;
            }
            return objE;
        }

        @Override // p001kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(dv.i<? super b> iVar, eu.b<? super Unit> bVar) {
            return ((c) create(iVar, bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    public o0(@NotNull g.d<String> requestPermissionsLauncher, @NotNull Context context, @NotNull n0 permission, @NotNull TrackingEventsLogger trackingEventsLogger) {
        Intrinsics.checkNotNullParameter(requestPermissionsLauncher, "requestPermissionsLauncher");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(permission, "permission");
        Intrinsics.checkNotNullParameter(trackingEventsLogger, "trackingEventsLogger");
        this.requestPermissionsLauncher = requestPermissionsLauncher;
        this.context = context;
        this.permission = permission;
        this.trackingEventsLogger = trackingEventsLogger;
    }

    @Override // ln.o
    public boolean a(@NotNull ln.o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof o0) && ((o0) otherWorker).permission == this.permission;
    }

    @Override // ls.j
    public boolean b(@NotNull ls.j<?> jVar) {
        return super.b(jVar);
    }

    @Override // ls.j
    public boolean c(@NotNull ls.j<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof o0) && ((o0) otherWorker).permission == this.permission;
    }

    @Override // ln.o, ls.j
    @NotNull
    public dv.h<b> run() {
        return dv.j.w(new c(null));
    }
}
