package tj;

import av.g1;
import av.l0;
import av.p0;
import av.q0;
import av.z2;
import bh.y;
import com.github.luben.zstd.BuildConfig;
import com.roblox.platform.http.interfaces.NotificationsInterface;
import com.roblox.platform.util.DeviceUtils;
import gu.m;
import mv.i0;
import ok.q;
import ok.t;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import rj.r;
import sw.p;
import sw.x;
import uj.PushNotificationMetadataResponse;
import uj.RegisterDeviceResponse;
import zt.n;
import zt.o;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\\\u0010\u001a\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00112\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00152\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0086@¢\u0006\u0004\b\u001a\u0010\u001bJ\u001e\u0010\u001c\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0015H\u0086@¢\u0006\u0004\b\u001c\u0010\u001dJR\u0010\"\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\t2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00130\u00112\u0014\u0010\u0016\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010!\u0012\u0004\u0012\u00020\u00130\u0011H\u0086@¢\u0006\u0004\b\"\u0010#JI\u0010$\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00112\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u0015¢\u0006\u0004\b$\u0010%J\u0015\u0010(\u001a\u00020\u00132\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)JO\u0010*\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\t2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00130\u00112\u0014\u0010\u0016\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010!\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0004\b*\u0010+J/\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010.R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010/R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u00100R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u00101R\u0014\u00104\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u00103¨\u00065"}, d2 = {"Ltj/a;", BuildConfig.FLAVOR, "Lav/l0;", "ioDispatcher", "mainDispatcher", "Lcom/roblox/platform/http/interfaces/NotificationsInterface;", "notificationPlatform", "Lbh/y;", "implementations", BuildConfig.FLAVOR, "deviceName", "<init>", "(Lav/l0;Lav/l0;Lcom/roblox/platform/http/interfaces/NotificationsInterface;Lbh/y;Ljava/lang/String;)V", "token", "oldToken", BuildConfig.FLAVOR, "authorizeForPush", "Lkotlin/Function1;", "Luj/k0;", BuildConfig.FLAVOR, "onSuccess", "Lkotlin/Function0;", "onFailure", "Lsw/d;", "Lmv/i0;", "regCall", "g", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lsw/d;Leu/b;)Ljava/lang/Object;", "b", "(Lkotlin/jvm/functions/Function0;Leu/b;)Ljava/lang/Object;", "platform", "notificationId", "Luj/g0;", BuildConfig.FLAVOR, "e", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Leu/b;)Ljava/lang/Object;", "f", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "Lrj/r$c;", "deregistrationListener", "a", "(Lrj/r$c;)V", "d", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "c", "(Ljava/lang/String;ZLjava/lang/String;)Lsw/d;", "Lav/l0;", "Lcom/roblox/platform/http/interfaces/NotificationsInterface;", "Lbh/y;", "Ljava/lang/String;", "Lav/p0;", "Lav/p0;", "serviceScope", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final l0 mainDispatcher;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final NotificationsInterface notificationPlatform;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final y implementations;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String deviceName;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final p0 serviceScope;

    /* JADX INFO: renamed from: tj.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.roblox.client.pushnotification.http.PushNotificationService$deregisterCurrentDevice$1", f = "PushNotificationService.kt", l = {161}, m = "invokeSuspend", v = 1)
    public static final class C0649a extends m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f32451t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ r.c f32453v;

        /* JADX INFO: renamed from: tj.a$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class C0650a extends p001kotlin.jvm.internal.k implements Function0<Unit> {
            public C0650a(Object obj) {
                super(0, obj, r.c.class, "onSuccessfullyDeregistered", "onSuccessfullyDeregistered()V", 0);
            }

            public final void d() {
                ((r.c) this.receiver).a();
            }

            @Override // p001kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                d();
                return Unit.f21506a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0649a(r.c cVar, eu.b<? super C0649a> bVar) {
            super(2, bVar);
            this.f32453v = cVar;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return a.this.new C0649a(this.f32453v, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((C0649a) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f32451t;
            if (i10 == 0) {
                o.b(obj);
                a aVar = a.this;
                C0650a c0650a = new C0650a(this.f32453v);
                this.f32451t = 1;
                if (aVar.b(c0650a, this) == objE) {
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

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.roblox.client.pushnotification.http.PushNotificationService", f = "PushNotificationService.kt", l = {84, 86}, m = "deregisterCurrentDeviceSuspend", v = 1)
    public static final class b extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f32454t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f32455u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f32456v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f32457w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f32459y;

        public b(eu.b<? super b> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f32457w = obj;
            this.f32459y |= Integer.MIN_VALUE;
            return a.this.b(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.roblox.client.pushnotification.http.PushNotificationService$deregisterCurrentDeviceSuspend$3$1", f = "PushNotificationService.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class c extends m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f32460t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f32461u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Function0<Unit> function0, eu.b<? super c> bVar) {
            super(2, bVar);
            this.f32461u = function0;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new c(this.f32461u, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            fu.c.e();
            if (this.f32460t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            this.f32461u.invoke();
            return Unit.f21506a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.roblox.client.pushnotification.http.PushNotificationService$makeNotificationMetadataApiCall$1", f = "PushNotificationService.kt", l = {181}, m = "invokeSuspend", v = 1)
    public static final class d extends m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f32462t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f32464v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f32465w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ String f32466x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ Function1<PushNotificationMetadataResponse, Unit> f32467y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ Function1<Integer, Unit> f32468z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(String str, String str2, String str3, Function1<? super PushNotificationMetadataResponse, Unit> function1, Function1<? super Integer, Unit> function2, eu.b<? super d> bVar) {
            super(2, bVar);
            this.f32464v = str;
            this.f32465w = str2;
            this.f32466x = str3;
            this.f32467y = function1;
            this.f32468z = function2;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return a.this.new d(this.f32464v, this.f32465w, this.f32466x, this.f32467y, this.f32468z, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f32462t;
            if (i10 == 0) {
                o.b(obj);
                a aVar = a.this;
                String str = this.f32464v;
                String str2 = this.f32465w;
                String str3 = this.f32466x;
                Function1<PushNotificationMetadataResponse, Unit> function1 = this.f32467y;
                Function1<Integer, Unit> function2 = this.f32468z;
                this.f32462t = 1;
                if (aVar.e(str, str2, str3, function1, function2, this) == objE) {
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

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.roblox.client.pushnotification.http.PushNotificationService", f = "PushNotificationService.kt", l = {108, 116, 123}, m = "makeNotificationMetadataApiCallSuspend", v = 1)
    public static final class e extends gu.d {
        public Object A;
        public int B;
        public /* synthetic */ Object C;
        public int E;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f32469t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f32470u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f32471v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f32472w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f32473x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public Object f32474y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public Object f32475z;

        public e(eu.b<? super e> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.C = obj;
            this.E |= Integer.MIN_VALUE;
            return a.this.e(null, null, null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.roblox.client.pushnotification.http.PushNotificationService$makeNotificationMetadataApiCallSuspend$3$1", f = "PushNotificationService.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class f extends m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f32476t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Function1<PushNotificationMetadataResponse, Unit> f32477u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ PushNotificationMetadataResponse f32478v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(Function1<? super PushNotificationMetadataResponse, Unit> function1, PushNotificationMetadataResponse pushNotificationMetadataResponse, eu.b<? super f> bVar) {
            super(2, bVar);
            this.f32477u = function1;
            this.f32478v = pushNotificationMetadataResponse;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new f(this.f32477u, this.f32478v, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((f) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            fu.c.e();
            if (this.f32476t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            this.f32477u.invoke(this.f32478v);
            return Unit.f21506a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.roblox.client.pushnotification.http.PushNotificationService$makeNotificationMetadataApiCallSuspend$4$1", f = "PushNotificationService.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class g extends m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f32479t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Function1<Integer, Unit> f32480u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(Function1<? super Integer, Unit> function1, eu.b<? super g> bVar) {
            super(2, bVar);
            this.f32480u = function1;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new g(this.f32480u, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((g) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            fu.c.e();
            if (this.f32479t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            this.f32480u.invoke(null);
            return Unit.f21506a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.roblox.client.pushnotification.http.PushNotificationService$sendNotificationTokenToRbx$1", f = "PushNotificationService.kt", l = {145}, m = "invokeSuspend", v = 1)
    public static final class h extends m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f32481t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f32483v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f32484w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ boolean f32485x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ Function1<RegisterDeviceResponse, Unit> f32486y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f32487z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(String str, String str2, boolean z10, Function1<? super RegisterDeviceResponse, Unit> function1, Function0<Unit> function0, eu.b<? super h> bVar) {
            super(2, bVar);
            this.f32483v = str;
            this.f32484w = str2;
            this.f32485x = z10;
            this.f32486y = function1;
            this.f32487z = function0;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return a.this.new h(this.f32483v, this.f32484w, this.f32485x, this.f32486y, this.f32487z, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((h) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f32481t;
            if (i10 == 0) {
                o.b(obj);
                a aVar = a.this;
                String str = this.f32483v;
                String str2 = this.f32484w;
                boolean z10 = this.f32485x;
                Function1<RegisterDeviceResponse, Unit> function1 = this.f32486y;
                Function0<Unit> function0 = this.f32487z;
                this.f32481t = 1;
                if (a.h(aVar, str, str2, z10, function1, function0, null, this, 32, null) == objE) {
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

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.roblox.client.pushnotification.http.PushNotificationService", f = "PushNotificationService.kt", l = {60, 68, 71, 75}, m = "sendNotificationTokenToRbxSuspend", v = 1)
    public static final class i extends gu.d {
        public Object A;
        public boolean B;
        public int C;
        public /* synthetic */ Object D;
        public int F;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f32488t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f32489u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f32490v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f32491w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f32492x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public Object f32493y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public Object f32494z;

        public i(eu.b<? super i> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.D = obj;
            this.F |= Integer.MIN_VALUE;
            return a.this.g(null, null, false, null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.roblox.client.pushnotification.http.PushNotificationService$sendNotificationTokenToRbxSuspend$3$1", f = "PushNotificationService.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class j extends m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f32495t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Function1<RegisterDeviceResponse, Unit> f32496u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ RegisterDeviceResponse f32497v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public j(Function1<? super RegisterDeviceResponse, Unit> function1, RegisterDeviceResponse registerDeviceResponse, eu.b<? super j> bVar) {
            super(2, bVar);
            this.f32496u = function1;
            this.f32497v = registerDeviceResponse;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new j(this.f32496u, this.f32497v, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((j) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            fu.c.e();
            if (this.f32495t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            this.f32496u.invoke(this.f32497v);
            return Unit.f21506a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.roblox.client.pushnotification.http.PushNotificationService$sendNotificationTokenToRbxSuspend$3$2", f = "PushNotificationService.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class k extends m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f32498t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f32499u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Function0<Unit> function0, eu.b<? super k> bVar) {
            super(2, bVar);
            this.f32499u = function0;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new k(this.f32499u, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((k) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            fu.c.e();
            if (this.f32498t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            this.f32499u.invoke();
            return Unit.f21506a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.roblox.client.pushnotification.http.PushNotificationService$sendNotificationTokenToRbxSuspend$4$1", f = "PushNotificationService.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class l extends m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f32500t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f32501u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Function0<Unit> function0, eu.b<? super l> bVar) {
            super(2, bVar);
            this.f32501u = function0;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new l(this.f32501u, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((l) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            fu.c.e();
            if (this.f32500t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            this.f32501u.invoke();
            return Unit.f21506a;
        }
    }

    public a() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object h(a aVar, String str, String str2, boolean z10, Function1 function1, Function0 function0, sw.d dVar, eu.b bVar, int i10, Object obj) {
        if ((i10 & 32) != 0) {
            dVar = aVar.c(str, z10, str2);
        }
        return aVar.g(str, str2, z10, function1, function0, dVar, bVar);
    }

    public final void a(@NotNull r.c deregistrationListener) {
        Intrinsics.checkNotNullParameter(deregistrationListener, "deregistrationListener");
        av.k.d(this.serviceScope, null, null, new C0649a(deregistrationListener, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a1, code lost:
    
        if (av.i.g(r2, r5, r0) == r1) goto L35;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:42:0x00c0, please report this as an issue */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(@NotNull Function0<Unit> function0, @NotNull eu.b<? super Unit> bVar) {
        b bVar2;
        Object objB;
        Object objB2;
        Throwable thE;
        if (bVar instanceof b) {
            bVar2 = (b) bVar;
            int i10 = bVar2.f32459y;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar2.f32459y = i10 - Integer.MIN_VALUE;
            } else {
                bVar2 = new b(bVar);
            }
        } else {
            bVar2 = new b(bVar);
        }
        Object objC = bVar2.f32457w;
        Object objE = fu.c.e();
        int i11 = bVar2.f32459y;
        try {
            try {
                if (i11 == 0) {
                    o.b(objC);
                    sw.d<i0> dVarDeregisterCurrentDevice = this.notificationPlatform.deregisterCurrentDevice();
                    n.Companion companion = n.INSTANCE;
                    bVar2.f32454t = function0;
                    bVar2.f32455u = gu.l.a(dVarDeregisterCurrentDevice);
                    bVar2.f32456v = 0;
                    bVar2.f32459y = 1;
                    objC = p.c(dVarDeregisterCurrentDevice, bVar2);
                    if (objC == objE) {
                    }
                    return objE;
                }
                if (i11 == 1) {
                    function0 = (Function0) bVar2.f32454t;
                    o.b(objC);
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(objC);
                }
                objB2 = n.b(Unit.f21506a);
                thE = n.e(objB2);
                if (thE != null) {
                    q.f("rbx.push", "deregisterCurrentDevice failed: " + thE.getMessage(), thE);
                }
                return Unit.f21506a;
                objB = n.b((x) objC);
            } catch (Throwable th2) {
                n.Companion companion2 = n.INSTANCE;
                objB2 = n.b(o.a(th2));
            }
        } catch (Throwable th3) {
            n.Companion companion3 = n.INSTANCE;
            objB = n.b(o.a(th3));
        }
        if (n.h(objB)) {
            l0 l0Var = this.mainDispatcher;
            c cVar = new c(function0, null);
            bVar2.f32454t = gu.l.a(function0);
            bVar2.f32455u = gu.l.a((x) objB);
            bVar2.f32456v = 0;
            bVar2.f32459y = 2;
        } else {
            objB2 = n.b(objB);
        }
        thE = n.e(objB2);
        if (thE != null) {
            q.f("rbx.push", "deregisterCurrentDevice failed: " + thE.getMessage(), thE);
        }
        return Unit.f21506a;
    }

    public final sw.d<i0> c(String token, boolean authorizeForPush, String oldToken) {
        kl.d dVar = new kl.d(token, authorizeForPush, oldToken, this.deviceName);
        sw.d<i0> dVarN = this.implementations.n(dVar);
        if (dVarN == null) {
            return t.f() ? this.notificationPlatform.registerPushAmazon(dVar) : this.notificationPlatform.registerPushAndroid(dVar);
        }
        return dVarN;
    }

    public final void d(@NotNull String platform, @NotNull String token, @NotNull String notificationId, @NotNull Function1<? super PushNotificationMetadataResponse, Unit> onSuccess, @NotNull Function1<? super Integer, Unit> onFailure) {
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(notificationId, "notificationId");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFailure, "onFailure");
        av.k.d(this.serviceScope, null, null, new d(platform, token, notificationId, onSuccess, onFailure, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x011a A[Catch: all -> 0x016c, TryCatch #5 {all -> 0x016c, blocks: (B:50:0x0110, B:52:0x011a, B:57:0x016f), top: B:80:0x0110 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x016a  */
    /* JADX WARN: Code duplicated, block: B:57:0x016f A[Catch: all -> 0x016c, TRY_LEAVE, TryCatch #5 {all -> 0x016c, blocks: (B:50:0x0110, B:52:0x011a, B:57:0x016f), top: B:80:0x0110 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x018e  */
    /* JADX WARN: Code duplicated, block: B:65:0x0198  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x0110 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01ea, code lost:
    
        if (av.i.g(r5, r7, r2) == r3) goto L67;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:65:0x0198, please report this as an issue */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Function1<? super PushNotificationMetadataResponse, Unit> function1, @NotNull Function1<? super Integer, Unit> function2, @NotNull eu.b<? super Unit> bVar) {
        e eVar;
        String str4;
        String str5;
        String str6;
        Function1<? super PushNotificationMetadataResponse, Unit> function3;
        Function1<? super Integer, Unit> function4;
        Function1<? super PushNotificationMetadataResponse, Unit> function5;
        String str7;
        Object objB;
        String str8;
        String str9;
        Function1<? super Integer, Unit> function6;
        Function1<? super PushNotificationMetadataResponse, Unit> function7;
        x xVar;
        l0 l0Var;
        f fVar;
        Object objB2;
        Throwable thE;
        if (bVar instanceof e) {
            eVar = (e) bVar;
            int i10 = eVar.E;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.E = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(bVar);
            }
        } else {
            eVar = new e(bVar);
        }
        Object objC = eVar.C;
        Object objE = fu.c.e();
        int i11 = eVar.E;
        try {
            if (i11 == 0) {
                o.b(objC);
                str4 = str;
                str5 = str2;
                str6 = str3;
                sw.d<i0> pushMetadata = this.notificationPlatform.getPushMetadata(str4, str5, str6);
                try {
                    n.Companion companion = n.INSTANCE;
                    eVar.f32469t = gu.l.a(str4);
                    eVar.f32470u = gu.l.a(str5);
                    eVar.f32471v = gu.l.a(str6);
                    function3 = function1;
                    try {
                        eVar.f32472w = function3;
                        function4 = function2;
                        try {
                            eVar.f32473x = function4;
                            eVar.f32474y = gu.l.a(pushMetadata);
                            eVar.B = 0;
                            eVar.E = 1;
                            objC = p.c(pushMetadata, eVar);
                            if (objC != objE) {
                                function5 = function3;
                                str7 = str4;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            n.Companion companion2 = n.INSTANCE;
                            objB = n.b(o.a(th));
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        function4 = function2;
                        n.Companion companion3 = n.INSTANCE;
                        objB = n.b(o.a(th));
                        str8 = str6;
                        str9 = str4;
                        function6 = function4;
                        if (!n.h(objB)) {
                            objB2 = n.b(objB);
                            thE = n.e(objB2);
                            if (thE != null) {
                                q.f("rbx.push", "RGLS.onMessageReceived() Exception msg: " + thE.getMessage(), thE);
                                l0 l0Var2 = this.mainDispatcher;
                                g gVar = new g(function6, null);
                                eVar.f32469t = gu.l.a(str9);
                                eVar.f32470u = gu.l.a(str5);
                                eVar.f32471v = gu.l.a(str8);
                                eVar.f32472w = gu.l.a(function3);
                                eVar.f32473x = gu.l.a(function6);
                                eVar.f32474y = objB2;
                                eVar.f32475z = gu.l.a(thE);
                                eVar.A = null;
                                eVar.B = 0;
                                eVar.E = 3;
                            }
                            return Unit.f21506a;
                        }
                        xVar = (x) objB;
                        if (xVar.b() == 200) {
                            String strA = ok.y.a(xVar);
                            q.h("rbx.push", strA);
                            PushNotificationMetadataResponse pushNotificationMetadataResponseA = PushNotificationMetadataResponse.INSTANCE.a(new JSONObject(strA));
                            l0Var = this.mainDispatcher;
                            fVar = new f(function3, pushNotificationMetadataResponseA, null);
                            eVar.f32469t = gu.l.a(str9);
                            eVar.f32470u = gu.l.a(str5);
                            eVar.f32471v = gu.l.a(str8);
                            eVar.f32472w = gu.l.a(function3);
                            eVar.f32473x = function6;
                            eVar.f32474y = gu.l.a(xVar);
                            eVar.f32475z = gu.l.a(strA);
                            eVar.A = gu.l.a(pushNotificationMetadataResponseA);
                            eVar.B = 0;
                            eVar.E = 2;
                            if (av.i.g(l0Var, fVar, eVar) == objE) {
                            }
                        } else {
                            function6.invoke(gu.b.c(xVar.b()));
                        }
                        function7 = function3;
                        objB2 = n.b(Unit.f21506a);
                        function3 = function7;
                        thE = n.e(objB2);
                        if (thE != null) {
                            q.f("rbx.push", "RGLS.onMessageReceived() Exception msg: " + thE.getMessage(), thE);
                            l0 l0Var3 = this.mainDispatcher;
                            g gVar2 = new g(function6, null);
                            eVar.f32469t = gu.l.a(str9);
                            eVar.f32470u = gu.l.a(str5);
                            eVar.f32471v = gu.l.a(str8);
                            eVar.f32472w = gu.l.a(function3);
                            eVar.f32473x = gu.l.a(function6);
                            eVar.f32474y = objB2;
                            eVar.f32475z = gu.l.a(thE);
                            eVar.A = null;
                            eVar.B = 0;
                            eVar.E = 3;
                        }
                        return Unit.f21506a;
                        return objE;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    function3 = function1;
                }
                return objE;
            }
            if (i11 == 1) {
                Function1<? super Integer, Unit> function8 = (Function1) eVar.f32473x;
                function5 = (Function1) eVar.f32472w;
                String str10 = (String) eVar.f32471v;
                String str11 = (String) eVar.f32470u;
                str7 = (String) eVar.f32469t;
                try {
                    o.b(objC);
                    str6 = str10;
                    str5 = str11;
                    function4 = function8;
                } catch (Throwable th5) {
                    th = th5;
                    str6 = str10;
                    str5 = str11;
                    function4 = function8;
                    str4 = str7;
                    function3 = function5;
                    n.Companion companion4 = n.INSTANCE;
                    objB = n.b(o.a(th));
                    str8 = str6;
                    str9 = str4;
                    function6 = function4;
                    if (!n.h(objB)) {
                        objB2 = n.b(objB);
                        thE = n.e(objB2);
                        if (thE != null) {
                            q.f("rbx.push", "RGLS.onMessageReceived() Exception msg: " + thE.getMessage(), thE);
                            l0 l0Var4 = this.mainDispatcher;
                            g gVar3 = new g(function6, null);
                            eVar.f32469t = gu.l.a(str9);
                            eVar.f32470u = gu.l.a(str5);
                            eVar.f32471v = gu.l.a(str8);
                            eVar.f32472w = gu.l.a(function3);
                            eVar.f32473x = gu.l.a(function6);
                            eVar.f32474y = objB2;
                            eVar.f32475z = gu.l.a(thE);
                            eVar.A = null;
                            eVar.B = 0;
                            eVar.E = 3;
                        }
                        return Unit.f21506a;
                    }
                    try {
                        xVar = (x) objB;
                        if (xVar.b() == 200) {
                            String strA2 = ok.y.a(xVar);
                            q.h("rbx.push", strA2);
                            PushNotificationMetadataResponse pushNotificationMetadataResponseA2 = PushNotificationMetadataResponse.INSTANCE.a(new JSONObject(strA2));
                            l0Var = this.mainDispatcher;
                            fVar = new f(function3, pushNotificationMetadataResponseA2, null);
                            eVar.f32469t = gu.l.a(str9);
                            eVar.f32470u = gu.l.a(str5);
                            eVar.f32471v = gu.l.a(str8);
                            eVar.f32472w = gu.l.a(function3);
                            eVar.f32473x = function6;
                            eVar.f32474y = gu.l.a(xVar);
                            eVar.f32475z = gu.l.a(strA2);
                            eVar.A = gu.l.a(pushNotificationMetadataResponseA2);
                            eVar.B = 0;
                            eVar.E = 2;
                            if (av.i.g(l0Var, fVar, eVar) == objE) {
                            }
                        } else {
                            function6.invoke(gu.b.c(xVar.b()));
                        }
                        function7 = function3;
                        objB2 = n.b(Unit.f21506a);
                    } catch (Throwable th6) {
                        th = th6;
                        function7 = function3;
                        n.Companion companion5 = n.INSTANCE;
                        objB2 = n.b(o.a(th));
                    }
                    function3 = function7;
                    thE = n.e(objB2);
                    if (thE != null) {
                        q.f("rbx.push", "RGLS.onMessageReceived() Exception msg: " + thE.getMessage(), thE);
                        l0 l0Var5 = this.mainDispatcher;
                        g gVar4 = new g(function6, null);
                        eVar.f32469t = gu.l.a(str9);
                        eVar.f32470u = gu.l.a(str5);
                        eVar.f32471v = gu.l.a(str8);
                        eVar.f32472w = gu.l.a(function3);
                        eVar.f32473x = gu.l.a(function6);
                        eVar.f32474y = objB2;
                        eVar.f32475z = gu.l.a(thE);
                        eVar.A = null;
                        eVar.B = 0;
                        eVar.E = 3;
                    }
                    return Unit.f21506a;
                    return objE;
                }
            } else if (i11 == 2) {
                function6 = (Function1) eVar.f32473x;
                function7 = (Function1) eVar.f32472w;
                str8 = (String) eVar.f32471v;
                str5 = (String) eVar.f32470u;
                str9 = (String) eVar.f32469t;
                try {
                    o.b(objC);
                    objB2 = n.b(Unit.f21506a);
                } catch (Throwable th7) {
                    th = th7;
                    n.Companion companion6 = n.INSTANCE;
                    objB2 = n.b(o.a(th));
                }
                function3 = function7;
                thE = n.e(objB2);
                if (thE != null) {
                    q.f("rbx.push", "RGLS.onMessageReceived() Exception msg: " + thE.getMessage(), thE);
                    l0 l0Var6 = this.mainDispatcher;
                    g gVar5 = new g(function6, null);
                    eVar.f32469t = gu.l.a(str9);
                    eVar.f32470u = gu.l.a(str5);
                    eVar.f32471v = gu.l.a(str8);
                    eVar.f32472w = gu.l.a(function3);
                    eVar.f32473x = gu.l.a(function6);
                    eVar.f32474y = objB2;
                    eVar.f32475z = gu.l.a(thE);
                    eVar.A = null;
                    eVar.B = 0;
                    eVar.E = 3;
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(objC);
            }
            return Unit.f21506a;
            objB = n.b((x) objC);
            str4 = str7;
            function3 = function5;
        } catch (Throwable th8) {
            th = th8;
            str4 = str7;
            function3 = function5;
            n.Companion companion7 = n.INSTANCE;
            objB = n.b(o.a(th));
        }
        str8 = str6;
        str9 = str4;
        function6 = function4;
        if (!n.h(objB)) {
            objB2 = n.b(objB);
            thE = n.e(objB2);
            if (thE != null) {
                q.f("rbx.push", "RGLS.onMessageReceived() Exception msg: " + thE.getMessage(), thE);
                l0 l0Var7 = this.mainDispatcher;
                g gVar6 = new g(function6, null);
                eVar.f32469t = gu.l.a(str9);
                eVar.f32470u = gu.l.a(str5);
                eVar.f32471v = gu.l.a(str8);
                eVar.f32472w = gu.l.a(function3);
                eVar.f32473x = gu.l.a(function6);
                eVar.f32474y = objB2;
                eVar.f32475z = gu.l.a(thE);
                eVar.A = null;
                eVar.B = 0;
                eVar.E = 3;
            }
            return Unit.f21506a;
        }
        xVar = (x) objB;
        if (xVar.b() == 200) {
            String strA3 = ok.y.a(xVar);
            q.h("rbx.push", strA3);
            PushNotificationMetadataResponse pushNotificationMetadataResponseA3 = PushNotificationMetadataResponse.INSTANCE.a(new JSONObject(strA3));
            l0Var = this.mainDispatcher;
            fVar = new f(function3, pushNotificationMetadataResponseA3, null);
            eVar.f32469t = gu.l.a(str9);
            eVar.f32470u = gu.l.a(str5);
            eVar.f32471v = gu.l.a(str8);
            eVar.f32472w = gu.l.a(function3);
            eVar.f32473x = function6;
            eVar.f32474y = gu.l.a(xVar);
            eVar.f32475z = gu.l.a(strA3);
            eVar.A = gu.l.a(pushNotificationMetadataResponseA3);
            eVar.B = 0;
            eVar.E = 2;
            if (av.i.g(l0Var, fVar, eVar) == objE) {
            }
        } else {
            function6.invoke(gu.b.c(xVar.b()));
        }
        function7 = function3;
        objB2 = n.b(Unit.f21506a);
        function3 = function7;
        thE = n.e(objB2);
        if (thE != null) {
            q.f("rbx.push", "RGLS.onMessageReceived() Exception msg: " + thE.getMessage(), thE);
            l0 l0Var8 = this.mainDispatcher;
            g gVar7 = new g(function6, null);
            eVar.f32469t = gu.l.a(str9);
            eVar.f32470u = gu.l.a(str5);
            eVar.f32471v = gu.l.a(str8);
            eVar.f32472w = gu.l.a(function3);
            eVar.f32473x = gu.l.a(function6);
            eVar.f32474y = objB2;
            eVar.f32475z = gu.l.a(thE);
            eVar.A = null;
            eVar.B = 0;
            eVar.E = 3;
        }
        return Unit.f21506a;
        return objE;
    }

    public final void f(@NotNull String token, @Nullable String oldToken, boolean authorizeForPush, @NotNull Function1<? super RegisterDeviceResponse, Unit> onSuccess, @NotNull Function0<Unit> onFailure) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFailure, "onFailure");
        av.k.d(this.serviceScope, null, null, new h(token, oldToken, authorizeForPush, onSuccess, onFailure, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0131 A[Catch: all -> 0x018c, TryCatch #8 {all -> 0x018c, blocks: (B:60:0x0127, B:62:0x0131, B:68:0x0193), top: B:99:0x0127 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0184  */
    /* JADX WARN: Code duplicated, block: B:65:0x0186  */
    /* JADX WARN: Code duplicated, block: B:68:0x0193 A[Catch: all -> 0x018c, TRY_LEAVE, TryCatch #8 {all -> 0x018c, blocks: (B:60:0x0127, B:62:0x0131, B:68:0x0193), top: B:99:0x0127 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:77:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:98:0x022f A[ExcSplitCross -> B:79:0x022f, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x0127 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x022d, code lost:
    
        if (av.i.g(r5, r7, r2) == r3) goto L79;
     */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(@NotNull String str, @Nullable String str2, boolean z10, @NotNull Function1<? super RegisterDeviceResponse, Unit> function1, @NotNull Function0<Unit> function0, @NotNull sw.d<i0> dVar, @NotNull eu.b<? super Unit> bVar) {
        i iVar;
        Function1<? super RegisterDeviceResponse, Unit> function2;
        Function0<Unit> function3;
        sw.d<i0> dVar2;
        String str3;
        String str4;
        Object objB;
        Function1<? super RegisterDeviceResponse, Unit> function4;
        boolean z11;
        sw.d<i0> dVar3;
        Function0<Unit> function5;
        Function1<? super RegisterDeviceResponse, Unit> function6;
        String str5;
        String str6;
        x xVar;
        l0 l0Var;
        k kVar;
        l0 l0Var2;
        j jVar;
        Object objB2;
        Throwable thE;
        if (bVar instanceof i) {
            iVar = (i) bVar;
            int i10 = iVar.F;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                iVar.F = i10 - Integer.MIN_VALUE;
            } else {
                iVar = new i(bVar);
            }
        } else {
            iVar = new i(bVar);
        }
        Object objC = iVar.D;
        Object objE = fu.c.e();
        int i11 = iVar.F;
        if (i11 != 0) {
            if (i11 == 1) {
                boolean z12 = iVar.B;
                dVar2 = (sw.d) iVar.f32492x;
                function3 = (Function0) iVar.f32491w;
                Function1<? super RegisterDeviceResponse, Unit> function7 = (Function1) iVar.f32490v;
                str4 = (String) iVar.f32489u;
                str3 = (String) iVar.f32488t;
                try {
                    o.b(objC);
                    z10 = z12;
                    function2 = function7;
                    try {
                        objB = n.b((x) objC);
                    } catch (Throwable th2) {
                        th = th2;
                        n.Companion companion = n.INSTANCE;
                        objB = n.b(o.a(th));
                    }
                } catch (Throwable th3) {
                    th = th3;
                    z10 = z12;
                    function2 = function7;
                    n.Companion companion2 = n.INSTANCE;
                    objB = n.b(o.a(th));
                    boolean z13 = z10;
                    function4 = function2;
                    z11 = z13;
                    if (!n.h(objB)) {
                        objB2 = n.b(objB);
                        thE = n.e(objB2);
                        if (thE != null) {
                            q.f("rbx.push", "Error trying to register notification token", thE);
                            l0 l0Var3 = this.mainDispatcher;
                            l lVar = new l(function3, null);
                            iVar.f32488t = gu.l.a(str3);
                            iVar.f32489u = gu.l.a(str4);
                            iVar.f32490v = gu.l.a(function4);
                            iVar.f32491w = gu.l.a(function3);
                            iVar.f32492x = gu.l.a(dVar2);
                            iVar.f32493y = objB2;
                            iVar.f32494z = gu.l.a(thE);
                            iVar.A = null;
                            iVar.B = z11;
                            iVar.C = 0;
                            iVar.F = 4;
                        }
                        return Unit.f21506a;
                    }
                    try {
                        xVar = (x) objB;
                        if (xVar.b() == 200) {
                            String strA = ok.y.a(xVar);
                            q.i("rbx.push", strA);
                            RegisterDeviceResponse registerDeviceResponseA = RegisterDeviceResponse.INSTANCE.a(new JSONObject(strA));
                            l0Var2 = this.mainDispatcher;
                            jVar = new j(function4, registerDeviceResponseA, null);
                            iVar.f32488t = gu.l.a(str3);
                            iVar.f32489u = gu.l.a(str4);
                            iVar.f32490v = gu.l.a(function4);
                            iVar.f32491w = function3;
                            iVar.f32492x = gu.l.a(dVar2);
                            iVar.f32493y = gu.l.a(xVar);
                            iVar.f32494z = gu.l.a(strA);
                            iVar.A = gu.l.a(registerDeviceResponseA);
                            iVar.B = z11;
                            iVar.C = 0;
                            iVar.F = 2;
                            if (av.i.g(l0Var2, jVar, iVar) == objE) {
                            }
                            dVar3 = dVar2;
                            function5 = function3;
                            function6 = function4;
                            str5 = str4;
                            str6 = str3;
                            objB2 = n.b(Unit.f21506a);
                        } else {
                            l0Var = this.mainDispatcher;
                            kVar = new k(function3, null);
                            iVar.f32488t = gu.l.a(str3);
                            iVar.f32489u = gu.l.a(str4);
                            iVar.f32490v = gu.l.a(function4);
                            iVar.f32491w = function3;
                            iVar.f32492x = gu.l.a(dVar2);
                            iVar.f32493y = gu.l.a(xVar);
                            iVar.B = z11;
                            iVar.C = 0;
                            iVar.F = 3;
                            if (av.i.g(l0Var, kVar, iVar) == objE) {
                                dVar3 = dVar2;
                                function5 = function3;
                                function6 = function4;
                                str5 = str4;
                                str6 = str3;
                                objB2 = n.b(Unit.f21506a);
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        dVar3 = dVar2;
                        function5 = function3;
                        function6 = function4;
                        str5 = str4;
                        str6 = str3;
                        n.Companion companion3 = n.INSTANCE;
                        objB2 = n.b(o.a(th));
                    }
                    str4 = str5;
                    str3 = str6;
                    function3 = function5;
                    function4 = function6;
                    dVar2 = dVar3;
                    thE = n.e(objB2);
                    if (thE != null) {
                        q.f("rbx.push", "Error trying to register notification token", thE);
                        l0 l0Var4 = this.mainDispatcher;
                        l lVar2 = new l(function3, null);
                        iVar.f32488t = gu.l.a(str3);
                        iVar.f32489u = gu.l.a(str4);
                        iVar.f32490v = gu.l.a(function4);
                        iVar.f32491w = gu.l.a(function3);
                        iVar.f32492x = gu.l.a(dVar2);
                        iVar.f32493y = objB2;
                        iVar.f32494z = gu.l.a(thE);
                        iVar.A = null;
                        iVar.B = z11;
                        iVar.C = 0;
                        iVar.F = 4;
                    }
                    return Unit.f21506a;
                    return objE;
                }
                boolean z14 = z10;
                function4 = function2;
                z11 = z14;
                if (!n.h(objB)) {
                    xVar = (x) objB;
                    if (xVar.b() == 200) {
                        String strA2 = ok.y.a(xVar);
                        q.i("rbx.push", strA2);
                        RegisterDeviceResponse registerDeviceResponseA2 = RegisterDeviceResponse.INSTANCE.a(new JSONObject(strA2));
                        l0Var2 = this.mainDispatcher;
                        jVar = new j(function4, registerDeviceResponseA2, null);
                        iVar.f32488t = gu.l.a(str3);
                        iVar.f32489u = gu.l.a(str4);
                        iVar.f32490v = gu.l.a(function4);
                        iVar.f32491w = function3;
                        iVar.f32492x = gu.l.a(dVar2);
                        iVar.f32493y = gu.l.a(xVar);
                        iVar.f32494z = gu.l.a(strA2);
                        iVar.A = gu.l.a(registerDeviceResponseA2);
                        iVar.B = z11;
                        iVar.C = 0;
                        iVar.F = 2;
                        if (av.i.g(l0Var2, jVar, iVar) == objE) {
                        }
                        dVar3 = dVar2;
                        function5 = function3;
                        function6 = function4;
                        str5 = str4;
                        str6 = str3;
                        objB2 = n.b(Unit.f21506a);
                    } else {
                        l0Var = this.mainDispatcher;
                        kVar = new k(function3, null);
                        iVar.f32488t = gu.l.a(str3);
                        iVar.f32489u = gu.l.a(str4);
                        iVar.f32490v = gu.l.a(function4);
                        iVar.f32491w = function3;
                        iVar.f32492x = gu.l.a(dVar2);
                        iVar.f32493y = gu.l.a(xVar);
                        iVar.B = z11;
                        iVar.C = 0;
                        iVar.F = 3;
                        if (av.i.g(l0Var, kVar, iVar) == objE) {
                            dVar3 = dVar2;
                            function5 = function3;
                            function6 = function4;
                            str5 = str4;
                            str6 = str3;
                            objB2 = n.b(Unit.f21506a);
                        }
                    }
                    str4 = str5;
                    str3 = str6;
                    function3 = function5;
                    function4 = function6;
                    dVar2 = dVar3;
                    thE = n.e(objB2);
                    if (thE != null) {
                        q.f("rbx.push", "Error trying to register notification token", thE);
                        l0 l0Var5 = this.mainDispatcher;
                        l lVar3 = new l(function3, null);
                        iVar.f32488t = gu.l.a(str3);
                        iVar.f32489u = gu.l.a(str4);
                        iVar.f32490v = gu.l.a(function4);
                        iVar.f32491w = gu.l.a(function3);
                        iVar.f32492x = gu.l.a(dVar2);
                        iVar.f32493y = objB2;
                        iVar.f32494z = gu.l.a(thE);
                        iVar.A = null;
                        iVar.B = z11;
                        iVar.C = 0;
                        iVar.F = 4;
                    }
                } else {
                    objB2 = n.b(objB);
                    thE = n.e(objB2);
                    if (thE != null) {
                        q.f("rbx.push", "Error trying to register notification token", thE);
                        l0 l0Var6 = this.mainDispatcher;
                        l lVar4 = new l(function3, null);
                        iVar.f32488t = gu.l.a(str3);
                        iVar.f32489u = gu.l.a(str4);
                        iVar.f32490v = gu.l.a(function4);
                        iVar.f32491w = gu.l.a(function3);
                        iVar.f32492x = gu.l.a(dVar2);
                        iVar.f32493y = objB2;
                        iVar.f32494z = gu.l.a(thE);
                        iVar.A = null;
                        iVar.B = z11;
                        iVar.C = 0;
                        iVar.F = 4;
                    }
                }
                return objE;
            }
            if (i11 == 2) {
                z11 = iVar.B;
            } else if (i11 == 3) {
                z11 = iVar.B;
            } else {
                if (i11 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(objC);
            }
            dVar3 = (sw.d) iVar.f32492x;
            function5 = (Function0) iVar.f32491w;
            function6 = (Function1) iVar.f32490v;
            str5 = (String) iVar.f32489u;
            str6 = (String) iVar.f32488t;
            try {
                o.b(objC);
                objB2 = n.b(Unit.f21506a);
            } catch (Throwable th5) {
                th = th5;
                n.Companion companion4 = n.INSTANCE;
                objB2 = n.b(o.a(th));
            }
            str4 = str5;
            str3 = str6;
            function3 = function5;
            function4 = function6;
            dVar2 = dVar3;
            thE = n.e(objB2);
            if (thE != null) {
                q.f("rbx.push", "Error trying to register notification token", thE);
                l0 l0Var7 = this.mainDispatcher;
                l lVar5 = new l(function3, null);
                iVar.f32488t = gu.l.a(str3);
                iVar.f32489u = gu.l.a(str4);
                iVar.f32490v = gu.l.a(function4);
                iVar.f32491w = gu.l.a(function3);
                iVar.f32492x = gu.l.a(dVar2);
                iVar.f32493y = objB2;
                iVar.f32494z = gu.l.a(thE);
                iVar.A = null;
                iVar.B = z11;
                iVar.C = 0;
                iVar.F = 4;
            }
            return Unit.f21506a;
        }
        o.b(objC);
        try {
            n.Companion companion5 = n.INSTANCE;
            iVar.f32488t = gu.l.a(str);
            iVar.f32489u = gu.l.a(str2);
            function2 = function1;
            try {
                iVar.f32490v = function2;
                function3 = function0;
                try {
                    iVar.f32491w = function3;
                    iVar.f32492x = gu.l.a(dVar);
                    iVar.f32493y = gu.l.a(dVar);
                    z10 = z10;
                    try {
                        iVar.B = z10;
                        iVar.C = 0;
                        iVar.F = 1;
                        dVar2 = dVar;
                        try {
                            objC = p.c(dVar2, iVar);
                            if (objC != objE) {
                                str3 = str;
                                str4 = str2;
                                objB = n.b((x) objC);
                                boolean z15 = z10;
                                function4 = function2;
                                z11 = z15;
                                if (!n.h(objB)) {
                                    objB2 = n.b(objB);
                                    thE = n.e(objB2);
                                    if (thE != null) {
                                        q.f("rbx.push", "Error trying to register notification token", thE);
                                        l0 l0Var8 = this.mainDispatcher;
                                        l lVar6 = new l(function3, null);
                                        iVar.f32488t = gu.l.a(str3);
                                        iVar.f32489u = gu.l.a(str4);
                                        iVar.f32490v = gu.l.a(function4);
                                        iVar.f32491w = gu.l.a(function3);
                                        iVar.f32492x = gu.l.a(dVar2);
                                        iVar.f32493y = objB2;
                                        iVar.f32494z = gu.l.a(thE);
                                        iVar.A = null;
                                        iVar.B = z11;
                                        iVar.C = 0;
                                        iVar.F = 4;
                                    }
                                    return Unit.f21506a;
                                }
                                xVar = (x) objB;
                                if (xVar.b() == 200) {
                                    String strA3 = ok.y.a(xVar);
                                    q.i("rbx.push", strA3);
                                    RegisterDeviceResponse registerDeviceResponseA3 = RegisterDeviceResponse.INSTANCE.a(new JSONObject(strA3));
                                    l0Var2 = this.mainDispatcher;
                                    jVar = new j(function4, registerDeviceResponseA3, null);
                                    iVar.f32488t = gu.l.a(str3);
                                    iVar.f32489u = gu.l.a(str4);
                                    iVar.f32490v = gu.l.a(function4);
                                    iVar.f32491w = function3;
                                    iVar.f32492x = gu.l.a(dVar2);
                                    iVar.f32493y = gu.l.a(xVar);
                                    iVar.f32494z = gu.l.a(strA3);
                                    iVar.A = gu.l.a(registerDeviceResponseA3);
                                    iVar.B = z11;
                                    iVar.C = 0;
                                    iVar.F = 2;
                                    if (av.i.g(l0Var2, jVar, iVar) == objE) {
                                    }
                                    dVar3 = dVar2;
                                    function5 = function3;
                                    function6 = function4;
                                    str5 = str4;
                                    str6 = str3;
                                    objB2 = n.b(Unit.f21506a);
                                } else {
                                    l0Var = this.mainDispatcher;
                                    kVar = new k(function3, null);
                                    iVar.f32488t = gu.l.a(str3);
                                    iVar.f32489u = gu.l.a(str4);
                                    iVar.f32490v = gu.l.a(function4);
                                    iVar.f32491w = function3;
                                    iVar.f32492x = gu.l.a(dVar2);
                                    iVar.f32493y = gu.l.a(xVar);
                                    iVar.B = z11;
                                    iVar.C = 0;
                                    iVar.F = 3;
                                    if (av.i.g(l0Var, kVar, iVar) == objE) {
                                        dVar3 = dVar2;
                                        function5 = function3;
                                        function6 = function4;
                                        str5 = str4;
                                        str6 = str3;
                                        objB2 = n.b(Unit.f21506a);
                                    }
                                }
                                str4 = str5;
                                str3 = str6;
                                function3 = function5;
                                function4 = function6;
                                dVar2 = dVar3;
                                thE = n.e(objB2);
                                if (thE != null) {
                                    q.f("rbx.push", "Error trying to register notification token", thE);
                                    l0 l0Var9 = this.mainDispatcher;
                                    l lVar7 = new l(function3, null);
                                    iVar.f32488t = gu.l.a(str3);
                                    iVar.f32489u = gu.l.a(str4);
                                    iVar.f32490v = gu.l.a(function4);
                                    iVar.f32491w = gu.l.a(function3);
                                    iVar.f32492x = gu.l.a(dVar2);
                                    iVar.f32493y = objB2;
                                    iVar.f32494z = gu.l.a(thE);
                                    iVar.A = null;
                                    iVar.B = z11;
                                    iVar.C = 0;
                                    iVar.F = 4;
                                }
                                return Unit.f21506a;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            str3 = str;
                            str4 = str2;
                            n.Companion companion6 = n.INSTANCE;
                            objB = n.b(o.a(th));
                            boolean z16 = z10;
                            function4 = function2;
                            z11 = z16;
                            if (!n.h(objB)) {
                                objB2 = n.b(objB);
                                thE = n.e(objB2);
                                if (thE != null) {
                                    q.f("rbx.push", "Error trying to register notification token", thE);
                                    l0 l0Var10 = this.mainDispatcher;
                                    l lVar8 = new l(function3, null);
                                    iVar.f32488t = gu.l.a(str3);
                                    iVar.f32489u = gu.l.a(str4);
                                    iVar.f32490v = gu.l.a(function4);
                                    iVar.f32491w = gu.l.a(function3);
                                    iVar.f32492x = gu.l.a(dVar2);
                                    iVar.f32493y = objB2;
                                    iVar.f32494z = gu.l.a(thE);
                                    iVar.A = null;
                                    iVar.B = z11;
                                    iVar.C = 0;
                                    iVar.F = 4;
                                }
                                return Unit.f21506a;
                            }
                            xVar = (x) objB;
                            if (xVar.b() == 200) {
                                String strA4 = ok.y.a(xVar);
                                q.i("rbx.push", strA4);
                                RegisterDeviceResponse registerDeviceResponseA4 = RegisterDeviceResponse.INSTANCE.a(new JSONObject(strA4));
                                l0Var2 = this.mainDispatcher;
                                jVar = new j(function4, registerDeviceResponseA4, null);
                                iVar.f32488t = gu.l.a(str3);
                                iVar.f32489u = gu.l.a(str4);
                                iVar.f32490v = gu.l.a(function4);
                                iVar.f32491w = function3;
                                iVar.f32492x = gu.l.a(dVar2);
                                iVar.f32493y = gu.l.a(xVar);
                                iVar.f32494z = gu.l.a(strA4);
                                iVar.A = gu.l.a(registerDeviceResponseA4);
                                iVar.B = z11;
                                iVar.C = 0;
                                iVar.F = 2;
                                if (av.i.g(l0Var2, jVar, iVar) == objE) {
                                }
                                dVar3 = dVar2;
                                function5 = function3;
                                function6 = function4;
                                str5 = str4;
                                str6 = str3;
                                objB2 = n.b(Unit.f21506a);
                            } else {
                                l0Var = this.mainDispatcher;
                                kVar = new k(function3, null);
                                iVar.f32488t = gu.l.a(str3);
                                iVar.f32489u = gu.l.a(str4);
                                iVar.f32490v = gu.l.a(function4);
                                iVar.f32491w = function3;
                                iVar.f32492x = gu.l.a(dVar2);
                                iVar.f32493y = gu.l.a(xVar);
                                iVar.B = z11;
                                iVar.C = 0;
                                iVar.F = 3;
                                if (av.i.g(l0Var, kVar, iVar) == objE) {
                                    dVar3 = dVar2;
                                    function5 = function3;
                                    function6 = function4;
                                    str5 = str4;
                                    str6 = str3;
                                    objB2 = n.b(Unit.f21506a);
                                }
                            }
                            str4 = str5;
                            str3 = str6;
                            function3 = function5;
                            function4 = function6;
                            dVar2 = dVar3;
                            thE = n.e(objB2);
                            if (thE != null) {
                                q.f("rbx.push", "Error trying to register notification token", thE);
                                l0 l0Var11 = this.mainDispatcher;
                                l lVar9 = new l(function3, null);
                                iVar.f32488t = gu.l.a(str3);
                                iVar.f32489u = gu.l.a(str4);
                                iVar.f32490v = gu.l.a(function4);
                                iVar.f32491w = gu.l.a(function3);
                                iVar.f32492x = gu.l.a(dVar2);
                                iVar.f32493y = objB2;
                                iVar.f32494z = gu.l.a(thE);
                                iVar.A = null;
                                iVar.B = z11;
                                iVar.C = 0;
                                iVar.F = 4;
                            }
                            return Unit.f21506a;
                            return objE;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        dVar2 = dVar;
                        str3 = str;
                        str4 = str2;
                        n.Companion companion7 = n.INSTANCE;
                        objB = n.b(o.a(th));
                        boolean z17 = z10;
                        function4 = function2;
                        z11 = z17;
                        if (!n.h(objB)) {
                            objB2 = n.b(objB);
                            thE = n.e(objB2);
                            if (thE != null) {
                                q.f("rbx.push", "Error trying to register notification token", thE);
                                l0 l0Var12 = this.mainDispatcher;
                                l lVar10 = new l(function3, null);
                                iVar.f32488t = gu.l.a(str3);
                                iVar.f32489u = gu.l.a(str4);
                                iVar.f32490v = gu.l.a(function4);
                                iVar.f32491w = gu.l.a(function3);
                                iVar.f32492x = gu.l.a(dVar2);
                                iVar.f32493y = objB2;
                                iVar.f32494z = gu.l.a(thE);
                                iVar.A = null;
                                iVar.B = z11;
                                iVar.C = 0;
                                iVar.F = 4;
                            }
                            return Unit.f21506a;
                        }
                        xVar = (x) objB;
                        if (xVar.b() == 200) {
                            String strA5 = ok.y.a(xVar);
                            q.i("rbx.push", strA5);
                            RegisterDeviceResponse registerDeviceResponseA5 = RegisterDeviceResponse.INSTANCE.a(new JSONObject(strA5));
                            l0Var2 = this.mainDispatcher;
                            jVar = new j(function4, registerDeviceResponseA5, null);
                            iVar.f32488t = gu.l.a(str3);
                            iVar.f32489u = gu.l.a(str4);
                            iVar.f32490v = gu.l.a(function4);
                            iVar.f32491w = function3;
                            iVar.f32492x = gu.l.a(dVar2);
                            iVar.f32493y = gu.l.a(xVar);
                            iVar.f32494z = gu.l.a(strA5);
                            iVar.A = gu.l.a(registerDeviceResponseA5);
                            iVar.B = z11;
                            iVar.C = 0;
                            iVar.F = 2;
                            if (av.i.g(l0Var2, jVar, iVar) == objE) {
                            }
                            dVar3 = dVar2;
                            function5 = function3;
                            function6 = function4;
                            str5 = str4;
                            str6 = str3;
                            objB2 = n.b(Unit.f21506a);
                        } else {
                            l0Var = this.mainDispatcher;
                            kVar = new k(function3, null);
                            iVar.f32488t = gu.l.a(str3);
                            iVar.f32489u = gu.l.a(str4);
                            iVar.f32490v = gu.l.a(function4);
                            iVar.f32491w = function3;
                            iVar.f32492x = gu.l.a(dVar2);
                            iVar.f32493y = gu.l.a(xVar);
                            iVar.B = z11;
                            iVar.C = 0;
                            iVar.F = 3;
                            if (av.i.g(l0Var, kVar, iVar) == objE) {
                                dVar3 = dVar2;
                                function5 = function3;
                                function6 = function4;
                                str5 = str4;
                                str6 = str3;
                                objB2 = n.b(Unit.f21506a);
                            }
                        }
                        str4 = str5;
                        str3 = str6;
                        function3 = function5;
                        function4 = function6;
                        dVar2 = dVar3;
                        thE = n.e(objB2);
                        if (thE != null) {
                            q.f("rbx.push", "Error trying to register notification token", thE);
                            l0 l0Var13 = this.mainDispatcher;
                            l lVar11 = new l(function3, null);
                            iVar.f32488t = gu.l.a(str3);
                            iVar.f32489u = gu.l.a(str4);
                            iVar.f32490v = gu.l.a(function4);
                            iVar.f32491w = gu.l.a(function3);
                            iVar.f32492x = gu.l.a(dVar2);
                            iVar.f32493y = objB2;
                            iVar.f32494z = gu.l.a(thE);
                            iVar.A = null;
                            iVar.B = z11;
                            iVar.C = 0;
                            iVar.F = 4;
                        }
                        return Unit.f21506a;
                        return objE;
                    }
                } catch (Throwable th8) {
                    th = th8;
                    z10 = z10;
                }
            } catch (Throwable th9) {
                th = th9;
                function3 = function0;
                dVar2 = dVar;
                str3 = str;
                str4 = str2;
                n.Companion companion8 = n.INSTANCE;
                objB = n.b(o.a(th));
                boolean z18 = z10;
                function4 = function2;
                z11 = z18;
                if (!n.h(objB)) {
                    objB2 = n.b(objB);
                    thE = n.e(objB2);
                    if (thE != null) {
                        q.f("rbx.push", "Error trying to register notification token", thE);
                        l0 l0Var14 = this.mainDispatcher;
                        l lVar12 = new l(function3, null);
                        iVar.f32488t = gu.l.a(str3);
                        iVar.f32489u = gu.l.a(str4);
                        iVar.f32490v = gu.l.a(function4);
                        iVar.f32491w = gu.l.a(function3);
                        iVar.f32492x = gu.l.a(dVar2);
                        iVar.f32493y = objB2;
                        iVar.f32494z = gu.l.a(thE);
                        iVar.A = null;
                        iVar.B = z11;
                        iVar.C = 0;
                        iVar.F = 4;
                    }
                    return Unit.f21506a;
                }
                xVar = (x) objB;
                if (xVar.b() == 200) {
                    String strA6 = ok.y.a(xVar);
                    q.i("rbx.push", strA6);
                    RegisterDeviceResponse registerDeviceResponseA6 = RegisterDeviceResponse.INSTANCE.a(new JSONObject(strA6));
                    l0Var2 = this.mainDispatcher;
                    jVar = new j(function4, registerDeviceResponseA6, null);
                    iVar.f32488t = gu.l.a(str3);
                    iVar.f32489u = gu.l.a(str4);
                    iVar.f32490v = gu.l.a(function4);
                    iVar.f32491w = function3;
                    iVar.f32492x = gu.l.a(dVar2);
                    iVar.f32493y = gu.l.a(xVar);
                    iVar.f32494z = gu.l.a(strA6);
                    iVar.A = gu.l.a(registerDeviceResponseA6);
                    iVar.B = z11;
                    iVar.C = 0;
                    iVar.F = 2;
                    if (av.i.g(l0Var2, jVar, iVar) == objE) {
                    }
                    dVar3 = dVar2;
                    function5 = function3;
                    function6 = function4;
                    str5 = str4;
                    str6 = str3;
                    objB2 = n.b(Unit.f21506a);
                } else {
                    l0Var = this.mainDispatcher;
                    kVar = new k(function3, null);
                    iVar.f32488t = gu.l.a(str3);
                    iVar.f32489u = gu.l.a(str4);
                    iVar.f32490v = gu.l.a(function4);
                    iVar.f32491w = function3;
                    iVar.f32492x = gu.l.a(dVar2);
                    iVar.f32493y = gu.l.a(xVar);
                    iVar.B = z11;
                    iVar.C = 0;
                    iVar.F = 3;
                    if (av.i.g(l0Var, kVar, iVar) == objE) {
                        dVar3 = dVar2;
                        function5 = function3;
                        function6 = function4;
                        str5 = str4;
                        str6 = str3;
                        objB2 = n.b(Unit.f21506a);
                    }
                }
                str4 = str5;
                str3 = str6;
                function3 = function5;
                function4 = function6;
                dVar2 = dVar3;
                thE = n.e(objB2);
                if (thE != null) {
                    q.f("rbx.push", "Error trying to register notification token", thE);
                    l0 l0Var15 = this.mainDispatcher;
                    l lVar13 = new l(function3, null);
                    iVar.f32488t = gu.l.a(str3);
                    iVar.f32489u = gu.l.a(str4);
                    iVar.f32490v = gu.l.a(function4);
                    iVar.f32491w = gu.l.a(function3);
                    iVar.f32492x = gu.l.a(dVar2);
                    iVar.f32493y = objB2;
                    iVar.f32494z = gu.l.a(thE);
                    iVar.A = null;
                    iVar.B = z11;
                    iVar.C = 0;
                    iVar.F = 4;
                }
                return Unit.f21506a;
                return objE;
            }
        } catch (Throwable th10) {
            th = th10;
            function2 = function1;
        }
        return objE;
    }

    public a(@NotNull l0 ioDispatcher, @NotNull l0 mainDispatcher, @NotNull NotificationsInterface notificationPlatform, @NotNull y implementations, @NotNull String deviceName) {
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        Intrinsics.checkNotNullParameter(mainDispatcher, "mainDispatcher");
        Intrinsics.checkNotNullParameter(notificationPlatform, "notificationPlatform");
        Intrinsics.checkNotNullParameter(implementations, "implementations");
        Intrinsics.checkNotNullParameter(deviceName, "deviceName");
        this.mainDispatcher = mainDispatcher;
        this.notificationPlatform = notificationPlatform;
        this.implementations = implementations;
        this.deviceName = deviceName;
        this.serviceScope = q0.a(z2.b(null, 1, null).plus(ioDispatcher));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ a(l0 l0Var, l0 l0Var2, NotificationsInterface notificationsInterface, y yVar, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        l0Var = (i10 & 1) != 0 ? g1.b() : l0Var;
        l0Var2 = (i10 & 2) != 0 ? g1.c() : l0Var2;
        if ((i10 & 4) != 0) {
            notificationsInterface = cl.g.d().g();
            Intrinsics.checkNotNullExpressionValue(notificationsInterface, "notifications(...)");
        }
        if ((i10 & 8) != 0) {
            yVar = y.h();
            Intrinsics.checkNotNullExpressionValue(yVar, "getInstance(...)");
        }
        if ((i10 & 16) != 0) {
            str = DeviceUtils.getDeviceName(false);
            Intrinsics.checkNotNullExpressionValue(str, "getDeviceName(...)");
        }
        String str2 = str;
        this(l0Var, l0Var2, notificationsInterface, yVar, str2);
    }
}
