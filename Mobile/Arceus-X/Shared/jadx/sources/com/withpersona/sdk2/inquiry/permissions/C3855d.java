package com.withpersona.sdk2.inquiry.permissions;

import android.content.Context;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.PermissionTrackingEventData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mp.C8612b0;
import nu.C9579j;
import nu.InterfaceC9575h;
import nu.InterfaceC9577i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p139g.AbstractC5854c;
import p154h.AbstractC6248a;
import p229jt.C7334d;
import p229jt.C7348o;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p419rp.C11040n1;
import p419rp.EnumC11024i0;
import p499vr.InterfaceC12257h;
import p581ym.InterfaceC13222o;
import pt.AbstractC10351m;
import pt.C10340b;
import pt.C10350l;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.d */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0002\u0013\u001eB1\b\u0007\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\u00102\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0013\u001a\u00020\u00102\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0018R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0019R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/d;", "Lym/o;", "Lcom/withpersona/sdk2/inquiry/permissions/d$b;", "Lvr/h;", "Lg/c;", "", "requestPermissionsLauncher", "Landroid/content/Context;", "context", "Lrp/i0;", "permission", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "<init>", "(Lg/c;Landroid/content/Context;Lrp/i0;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V", "otherWorker", "", "c", "(Lvr/h;)Z", "b", "(Lym/o;)Z", "Lnu/h;", "run", "()Lnu/h;", "Lg/c;", "Landroid/content/Context;", "d", "Lrp/i0;", "e", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "a", "permissions_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C3855d implements InterfaceC13222o<b>, InterfaceC12257h<b> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final AbstractC5854c<String> requestPermissionsLauncher;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final EnumC11024i0 permission;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.d$a */
    @Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/d$a;", "", "Landroid/content/Context;", "context", "Lg/c;", "", "requestPermissionsLauncher", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "<init>", "(Landroid/content/Context;Lg/c;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V", "Lrp/i0;", "permission", "Lcom/withpersona/sdk2/inquiry/permissions/d;", "a", "(Lrp/i0;)Lcom/withpersona/sdk2/inquiry/permissions/d;", "Landroid/content/Context;", "b", "Lg/c;", "c", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "permissions_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Context context;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final AbstractC5854c<String> requestPermissionsLauncher;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public final TrackingEventsLogger trackingEventsLogger;

        public a(@NotNull Context context, @NotNull AbstractC5854c<String> requestPermissionsLauncher, @NotNull TrackingEventsLogger trackingEventsLogger) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(requestPermissionsLauncher, "requestPermissionsLauncher");
            Intrinsics.checkNotNullParameter(trackingEventsLogger, "trackingEventsLogger");
            this.context = context;
            this.requestPermissionsLauncher = requestPermissionsLauncher;
            this.trackingEventsLogger = trackingEventsLogger;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final C3855d m19154a(@NotNull EnumC11024i0 permission) {
            Intrinsics.checkNotNullParameter(permission, "permission");
            return new C3855d(this.requestPermissionsLauncher, this.context, permission, this.trackingEventsLogger);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.d$b */
    @Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/d$b;", "", "<init>", "()V", "b", "a", "Lcom/withpersona/sdk2/inquiry/permissions/d$b$a;", "Lcom/withpersona/sdk2/inquiry/permissions/d$b$b;", "permissions_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static abstract class b {

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.d$b$a */
        @Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/d$b$a;", "Lcom/withpersona/sdk2/inquiry/permissions/d$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "permissions_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class a extends b {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final a f15841a = new a();

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

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.d$b$b, reason: collision with other inner class name */
        @Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/d$b$b;", "Lcom/withpersona/sdk2/inquiry/permissions/d$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "permissions_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class C14137b extends b {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final C14137b f15842a = new C14137b();

            public C14137b() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof C14137b);
            }

            public int hashCode() {
                return 375059152;
            }

            @NotNull
            public String toString() {
                return "Success";
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.permissions.d.b.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public b() {
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.d$c */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lnu/i;", "Lcom/withpersona/sdk2/inquiry/permissions/d$b;", "", "<anonymous>", "(Lnu/i;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.permissions.PermissionRequestDialogWorker$run$1", m39664f = "PermissionRequestDialogWorker.kt", m39665l = {46, 50}, m39666m = "invokeSuspend")
    public static final class c extends AbstractC10351m implements Function2<InterfaceC9577i<? super b>, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public Object f15843t;

        /* JADX INFO: renamed from: u */
        public int f15844u;

        /* JADX INFO: renamed from: v */
        public /* synthetic */ Object f15845v;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.d$c$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class a<T> implements InterfaceC9577i {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC9577i<b> f15847a;

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: nu.i<? super com.withpersona.sdk2.inquiry.permissions.d$b> */
            /* JADX WARN: Multi-variable type inference failed */
            public a(InterfaceC9577i<? super b> interfaceC9577i) {
                this.f15847a = interfaceC9577i;
            }

            /* JADX INFO: renamed from: b */
            public final Object m19156b(boolean z10, InterfaceC9557b<? super Unit> interfaceC9557b) {
                if (z10) {
                    Object objEmit = this.f15847a.emit(b.C14137b.f15842a, interfaceC9557b);
                    return objEmit == C10047c.m38805e() ? objEmit : Unit.f29331a;
                }
                Object objEmit2 = this.f15847a.emit(b.a.f15841a, interfaceC9557b);
                return objEmit2 == C10047c.m38805e() ? objEmit2 : Unit.f29331a;
            }

            @Override // nu.InterfaceC9577i
            public /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC9557b interfaceC9557b) {
                return m19156b(((Boolean) obj).booleanValue(), interfaceC9557b);
            }
        }

        public c(InterfaceC9557b<? super c> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            c cVar = C3855d.this.new c(interfaceC9557b);
            cVar.f15845v = obj;
            return cVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0087, code lost:
        
            if (r0.emit(r12, r11) == r1) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x00bc, code lost:
        
            if (r12.collect(r2, r11) == r1) goto L22;
         */
        @Override // pt.AbstractC10339a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            InterfaceC9577i interfaceC9577i = (InterfaceC9577i) this.f15845v;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f15844u;
            if (i10 != 0) {
                if (i10 == 1) {
                    C7348o.m30470b(obj);
                    return Unit.f29331a;
                }
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                throw new C7334d();
            }
            C7348o.m30470b(obj);
            TrackingEventsLogger.logPermissionEvent$default(C3855d.this.trackingEventsLogger, new PermissionTrackingEventData(C11040n1.m41737c(C3855d.this.permission), "requested", null, 4, null), false, 2, null);
            AbstractC6248a.a synchronousResult = C3855d.this.requestPermissionsLauncher.mo4724a().getSynchronousResult(C3855d.this.context, C11040n1.m41737c(C3855d.this.permission));
            Object objM27450a = synchronousResult != null ? synchronousResult.m27450a() : null;
            if (Intrinsics.m31980c(objM27450a, C10340b.m39658a(true))) {
                b.C14137b c14137b = b.C14137b.f15842a;
                this.f15845v = C10350l.m39676a(interfaceC9577i);
                this.f15843t = C10350l.m39676a(objM27450a);
                this.f15844u = 1;
            } else {
                C3855d.this.requestPermissionsLauncher.m26240b(C11040n1.m41737c(C3855d.this.permission));
                C8612b0 c8612b0 = new C8612b0();
                a aVar = new a(interfaceC9577i);
                this.f15845v = C10350l.m39676a(interfaceC9577i);
                this.f15843t = C10350l.m39676a(objM27450a);
                this.f15844u = 2;
            }
            return objM38805e;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9577i<? super b> interfaceC9577i, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((c) create(interfaceC9577i, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    public C3855d(@NotNull AbstractC5854c<String> requestPermissionsLauncher, @NotNull Context context, @NotNull EnumC11024i0 permission, @NotNull TrackingEventsLogger trackingEventsLogger) {
        Intrinsics.checkNotNullParameter(requestPermissionsLauncher, "requestPermissionsLauncher");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(permission, "permission");
        Intrinsics.checkNotNullParameter(trackingEventsLogger, "trackingEventsLogger");
        this.requestPermissionsLauncher = requestPermissionsLauncher;
        this.context = context;
        this.permission = permission;
        this.trackingEventsLogger = trackingEventsLogger;
    }

    @Override // p499vr.InterfaceC12257h
    /* JADX INFO: renamed from: a */
    public boolean mo7572a(@NotNull InterfaceC12257h<?> interfaceC12257h) {
        return super.mo7572a(interfaceC12257h);
    }

    @Override // p581ym.InterfaceC13222o
    /* JADX INFO: renamed from: b */
    public boolean mo7573b(@NotNull InterfaceC13222o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof C3855d) && ((C3855d) otherWorker).permission == this.permission;
    }

    @Override // p499vr.InterfaceC12257h
    /* JADX INFO: renamed from: c */
    public boolean mo7574c(@NotNull InterfaceC12257h<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof C3855d) && ((C3855d) otherWorker).permission == this.permission;
    }

    @Override // p581ym.InterfaceC13222o, p499vr.InterfaceC12257h
    @NotNull
    public InterfaceC9575h<b> run() {
        return C9579j.m37806w(new c(null));
    }
}
