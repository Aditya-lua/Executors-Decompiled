package com.withpersona.sdk2.inquiry.permissions;

import android.app.PendingIntent;
import android.content.Context;
import android.content.IntentSender;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.tasks.Task;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lb.C8103f;
import lb.C8104g;
import lb.C8106i;
import mp.C8622g0;
import nu.C9579j;
import nu.InterfaceC9575h;
import nu.InterfaceC9577i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p139g.AbstractC5854c;
import p229jt.C7334d;
import p229jt.C7347n;
import p229jt.C7348o;
import p242k9.C7502l;
import p256ku.C7905p;
import p256ku.InterfaceC7897n;
import p315nt.InterfaceC9557b;
import p344ot.C10046b;
import p344ot.C10047c;
import p499vr.InterfaceC12257h;
import p581ym.InterfaceC13222o;
import pt.AbstractC10351m;
import pt.C10346h;
import pt.C10350l;
import pt.InterfaceC10344f;
import sb.InterfaceC11254f;
import sb.InterfaceC11256g;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.a */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0002\u000e\u0012B!\b\u0007\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/a;", "Lym/o;", "Lcom/withpersona/sdk2/inquiry/permissions/a$b;", "Lvr/h;", "Lg/c;", "Landroidx/activity/result/IntentSenderRequest;", "resolvableApiLauncher", "Landroid/content/Context;", "context", "<init>", "(Lg/c;Landroid/content/Context;)V", "Lnu/h;", "run", "()Lnu/h;", "b", "Lg/c;", "c", "Landroid/content/Context;", "a", "permissions_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C3852a implements InterfaceC13222o<b>, InterfaceC12257h<b> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final AbstractC5854c<IntentSenderRequest> resolvableApiLauncher;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.a$a */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005À\u0006\u0003"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/a$a;", "", "Lcom/withpersona/sdk2/inquiry/permissions/a;", "a", "()Lcom/withpersona/sdk2/inquiry/permissions/a;", "permissions_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public interface a {
        @NotNull
        /* JADX INFO: renamed from: a */
        C3852a mo19142a();
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.a$b */
    @Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/a$b;", "", "<init>", "()V", "c", "b", "a", "Lcom/withpersona/sdk2/inquiry/permissions/a$b$a;", "Lcom/withpersona/sdk2/inquiry/permissions/a$b$b;", "Lcom/withpersona/sdk2/inquiry/permissions/a$b$c;", "permissions_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static abstract class b {

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.a$b$a */
        @Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/a$b$a;", "Lcom/withpersona/sdk2/inquiry/permissions/a$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "permissions_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class a extends b {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final a f15814a = new a();

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

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.a$b$b, reason: collision with other inner class name */
        @Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/a$b$b;", "Lcom/withpersona/sdk2/inquiry/permissions/a$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "permissions_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class C14135b extends b {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final C14135b f15815a = new C14135b();

            public C14135b() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof C14135b);
            }

            public int hashCode() {
                return 726963865;
            }

            @NotNull
            public String toString() {
                return "NotSupported";
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.a$b$c */
        @Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/a$b$c;", "Lcom/withpersona/sdk2/inquiry/permissions/a$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "permissions_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class c extends b {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final c f15816a = new c();

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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.permissions.a.b.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public b() {
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.a$c */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lnu/i;", "Lcom/withpersona/sdk2/inquiry/permissions/a$b;", "", "<anonymous>", "(Lnu/i;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorker$run$1", m39664f = "DeviceFeatureRequestWorker.kt", m39665l = {103, 62, 68, 77, 85}, m39666m = "invokeSuspend")
    public static final class c extends AbstractC10351m implements Function2<InterfaceC9577i<? super b>, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: A */
        public int f15817A;

        /* JADX INFO: renamed from: B */
        public /* synthetic */ Object f15818B;

        /* JADX INFO: renamed from: t */
        public Object f15820t;

        /* JADX INFO: renamed from: u */
        public Object f15821u;

        /* JADX INFO: renamed from: v */
        public Object f15822v;

        /* JADX INFO: renamed from: w */
        public Object f15823w;

        /* JADX INFO: renamed from: x */
        public Object f15824x;

        /* JADX INFO: renamed from: y */
        public Object f15825y;

        /* JADX INFO: renamed from: z */
        public int f15826z;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.a$c$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class a<T> implements InterfaceC9577i {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC9577i<b> f15827a;

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: nu.i<? super com.withpersona.sdk2.inquiry.permissions.a$b> */
            /* JADX WARN: Multi-variable type inference failed */
            public a(InterfaceC9577i<? super b> interfaceC9577i) {
                this.f15827a = interfaceC9577i;
            }

            /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object; */
            @Override // nu.InterfaceC9577i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(ActivityResult activityResult, InterfaceC9557b<? super Unit> interfaceC9557b) {
                if (activityResult == null || activityResult.getResultCode() != -1) {
                    Object objEmit = this.f15827a.emit(b.a.f15814a, interfaceC9557b);
                    return objEmit == C10047c.m38805e() ? objEmit : Unit.f29331a;
                }
                Object objEmit2 = this.f15827a.emit(b.c.f15816a, interfaceC9557b);
                return objEmit2 == C10047c.m38805e() ? objEmit2 : Unit.f29331a;
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.a$c$b */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class b implements Function1<C8104g, Unit> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC7897n<C7347n<? extends C8104g>> f15828a;

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: ku.n<? super jt.n<? extends lb.g>> */
            /* JADX WARN: Multi-variable type inference failed */
            public b(InterfaceC7897n<? super C7347n<? extends C8104g>> interfaceC7897n) {
                this.f15828a = interfaceC7897n;
            }

            /* JADX INFO: renamed from: a */
            public final void m19145a(C8104g c8104g) {
                this.f15828a.resumeWith(C7347n.m30460b(C7347n.m30459a(C7347n.m30460b(c8104g))));
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C8104g c8104g) {
                m19145a(c8104g);
                return Unit.f29331a;
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.a$c$c, reason: collision with other inner class name */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C14136c implements InterfaceC11254f {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC7897n<C7347n<? extends C8104g>> f15829a;

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: ku.n<? super jt.n<? extends lb.g>> */
            /* JADX WARN: Multi-variable type inference failed */
            public C14136c(InterfaceC7897n<? super C7347n<? extends C8104g>> interfaceC7897n) {
                this.f15829a = interfaceC7897n;
            }

            @Override // sb.InterfaceC11254f
            public final void onFailure(Exception exception) {
                Intrinsics.checkNotNullParameter(exception, "exception");
                InterfaceC7897n<C7347n<? extends C8104g>> interfaceC7897n = this.f15829a;
                C7347n.Companion companion = C7347n.INSTANCE;
                interfaceC7897n.resumeWith(C7347n.m30460b(C7347n.m30459a(C7347n.m30460b(C7348o.m30469a(exception)))));
            }
        }

        public c(InterfaceC9557b<? super c> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            c cVar = C3852a.this.new c(interfaceC9557b);
            cVar.f15818B = obj;
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
        @Override // pt.AbstractC10339a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            C8106i c8106iM33323b;
            LocationRequest locationRequest;
            LocationSettingsRequest locationSettingsRequest;
            Object obj2;
            IntentSender.SendIntentException e10;
            C8106i c8106i;
            Throwable th2;
            LocationSettingsRequest locationSettingsRequest2;
            LocationRequest locationRequest2;
            InterfaceC9577i interfaceC9577i = (InterfaceC9577i) this.f15818B;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f15817A;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                LocationRequest locationRequestBuild = new LocationRequest.Builder(10000L).setPriority(100).setMinUpdateIntervalMillis(5000L).build();
                Intrinsics.checkNotNullExpressionValue(locationRequestBuild, "build(...)");
                LocationSettingsRequest locationSettingsRequestM11868b = new LocationSettingsRequest.C2724a().m11867a(locationRequestBuild).m11869c(true).m11868b();
                Intrinsics.checkNotNullExpressionValue(locationSettingsRequestM11868b, "build(...)");
                c8106iM33323b = C8103f.m33323b(C3852a.this.context);
                Intrinsics.checkNotNullExpressionValue(c8106iM33323b, "getSettingsClient(...)");
                this.f15818B = interfaceC9577i;
                this.f15820t = C10350l.m39676a(locationRequestBuild);
                this.f15821u = locationSettingsRequestM11868b;
                this.f15822v = c8106iM33323b;
                this.f15826z = 0;
                this.f15817A = 1;
                C7905p c7905p = new C7905p(C10046b.m38803c(this), 1);
                c7905p.m32860H();
                Task taskCheckLocationSettings = c8106iM33323b.checkLocationSettings(locationSettingsRequestM11868b);
                Intrinsics.checkNotNullExpressionValue(taskCheckLocationSettings, "checkLocationSettings(...)");
                taskCheckLocationSettings.mo11893g(new d(new b(c7905p)));
                taskCheckLocationSettings.mo11891e(new C14136c(c7905p));
                Object objM32857A = c7905p.m32857A();
                if (objM32857A == C10047c.m38805e()) {
                    C10346h.m39673c(this);
                }
                if (objM32857A != objM38805e) {
                    locationRequest = locationRequestBuild;
                    obj = objM32857A;
                    locationSettingsRequest = locationSettingsRequestM11868b;
                }
                return objM38805e;
            }
            if (i10 == 1) {
                c8106iM33323b = (C8106i) this.f15822v;
                locationSettingsRequest = (LocationSettingsRequest) this.f15821u;
                locationRequest = (LocationRequest) this.f15820t;
                C7348o.m30470b(obj);
            } else {
                if (i10 == 2) {
                    C7348o.m30470b(obj);
                    return Unit.f29331a;
                }
                if (i10 == 3) {
                    C7348o.m30470b(obj);
                    return Unit.f29331a;
                }
                if (i10 != 4) {
                    if (i10 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                    return Unit.f29331a;
                }
                th2 = (Throwable) this.f15824x;
                obj2 = this.f15823w;
                c8106i = (C8106i) this.f15822v;
                locationSettingsRequest2 = (LocationSettingsRequest) this.f15821u;
                locationRequest2 = (LocationRequest) this.f15820t;
                try {
                    C7348o.m30470b(obj);
                    throw new C7334d();
                } catch (IntentSender.SendIntentException e11) {
                    e10 = e11;
                    b.C14135b c14135b = b.C14135b.f15815a;
                    this.f15818B = C10350l.m39676a(interfaceC9577i);
                    this.f15820t = C10350l.m39676a(locationRequest2);
                    this.f15821u = C10350l.m39676a(locationSettingsRequest2);
                    this.f15822v = C10350l.m39676a(c8106i);
                    this.f15823w = C10350l.m39676a(obj2);
                    this.f15824x = C10350l.m39676a(th2);
                    this.f15825y = C10350l.m39676a(e10);
                    this.f15817A = 5;
                }
            }
            Object value = ((C7347n) obj).getValue();
            if (C7347n.m30466h(value)) {
                b.c cVar = b.c.f15816a;
                this.f15818B = C10350l.m39676a(interfaceC9577i);
                this.f15820t = C10350l.m39676a(locationRequest);
                this.f15821u = C10350l.m39676a(locationSettingsRequest);
                this.f15822v = C10350l.m39676a(c8106iM33323b);
                this.f15823w = C10350l.m39676a(value);
                this.f15817A = 2;
            } else {
                Throwable thM30463e = C7347n.m30463e(value);
                if (thM30463e instanceof C7502l) {
                    try {
                        PendingIntent pendingIntentM31163c = ((C7502l) thM30463e).m31163c();
                        Intrinsics.checkNotNullExpressionValue(pendingIntentM31163c, "getResolution(...)");
                        IntentSenderRequest intentSenderRequestM1474a = new IntentSenderRequest.C0401a(pendingIntentM31163c).m1474a();
                        C3852a.this.resolvableApiLauncher.m26240b(intentSenderRequestM1474a);
                        C8622g0 c8622g0 = new C8622g0();
                        a aVar = new a(interfaceC9577i);
                        this.f15818B = interfaceC9577i;
                        this.f15820t = C10350l.m39676a(locationRequest);
                        this.f15821u = C10350l.m39676a(locationSettingsRequest);
                        this.f15822v = C10350l.m39676a(c8106iM33323b);
                        this.f15823w = C10350l.m39676a(value);
                        this.f15824x = C10350l.m39676a(thM30463e);
                        this.f15825y = C10350l.m39676a(intentSenderRequestM1474a);
                        this.f15817A = 4;
                        if (c8622g0.collect(aVar, this) != objM38805e) {
                            obj2 = value;
                            c8106i = c8106iM33323b;
                            th2 = thM30463e;
                            locationSettingsRequest2 = locationSettingsRequest;
                            locationRequest2 = locationRequest;
                            throw new C7334d();
                        }
                    } catch (IntentSender.SendIntentException e12) {
                        obj2 = value;
                        e10 = e12;
                        c8106i = c8106iM33323b;
                        th2 = thM30463e;
                        locationSettingsRequest2 = locationSettingsRequest;
                        locationRequest2 = locationRequest;
                        b.C14135b c14135b2 = b.C14135b.f15815a;
                        this.f15818B = C10350l.m39676a(interfaceC9577i);
                        this.f15820t = C10350l.m39676a(locationRequest2);
                        this.f15821u = C10350l.m39676a(locationSettingsRequest2);
                        this.f15822v = C10350l.m39676a(c8106i);
                        this.f15823w = C10350l.m39676a(obj2);
                        this.f15824x = C10350l.m39676a(th2);
                        this.f15825y = C10350l.m39676a(e10);
                        this.f15817A = 5;
                    }
                } else {
                    b.C14135b c14135b3 = b.C14135b.f15815a;
                    this.f15818B = C10350l.m39676a(interfaceC9577i);
                    this.f15820t = C10350l.m39676a(locationRequest);
                    this.f15821u = C10350l.m39676a(locationSettingsRequest);
                    this.f15822v = C10350l.m39676a(c8106iM33323b);
                    this.f15823w = C10350l.m39676a(value);
                    this.f15824x = C10350l.m39676a(thM30463e);
                    this.f15817A = 3;
                }
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

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.a$d */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class d implements InterfaceC11256g {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Function1 f15830a;

        public d(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f15830a = function;
        }

        @Override // sb.InterfaceC11256g
        public final /* synthetic */ void onSuccess(Object obj) {
            this.f15830a.invoke(obj);
        }
    }

    public C3852a(@NotNull AbstractC5854c<IntentSenderRequest> resolvableApiLauncher, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(resolvableApiLauncher, "resolvableApiLauncher");
        Intrinsics.checkNotNullParameter(context, "context");
        this.resolvableApiLauncher = resolvableApiLauncher;
        this.context = context;
    }

    @Override // p499vr.InterfaceC12257h
    /* JADX INFO: renamed from: a */
    public boolean mo7572a(@NotNull InterfaceC12257h<?> interfaceC12257h) {
        return super.mo7572a(interfaceC12257h);
    }

    @Override // p581ym.InterfaceC13222o
    /* JADX INFO: renamed from: b */
    public boolean mo7573b(@NotNull InterfaceC13222o<?> interfaceC13222o) {
        return InterfaceC13222o.b.m48893a(this, interfaceC13222o);
    }

    @Override // p499vr.InterfaceC12257h
    /* JADX INFO: renamed from: c */
    public boolean mo7574c(@NotNull InterfaceC12257h<?> interfaceC12257h) {
        return super.mo7574c(interfaceC12257h);
    }

    @Override // p581ym.InterfaceC13222o, p499vr.InterfaceC12257h
    @NotNull
    public InterfaceC9575h<b> run() {
        return C9579j.m37806w(new c(null));
    }
}
