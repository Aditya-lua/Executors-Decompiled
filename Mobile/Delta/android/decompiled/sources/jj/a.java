package jj;

import ek.t;
import gt.o;
import hj.r;
import iu.g1;
import iu.l0;
import iu.p0;
import iu.q0;
import iu.z2;
import kj.PushNotificationMetadataResponse;
import kj.RegisterDeviceResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nt.m;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rg.y;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\\\u0010\u001a\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00112\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00152\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0086@¢\u0006\u0004\b\u001a\u0010\u001bJ\u001e\u0010\u001c\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0015H\u0086@¢\u0006\u0004\b\u001c\u0010\u001dJR\u0010\"\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\t2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00130\u00112\u0014\u0010\u0016\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010!\u0012\u0004\u0012\u00020\u00130\u0011H\u0086@¢\u0006\u0004\b\"\u0010#JI\u0010$\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00112\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u0015¢\u0006\u0004\b$\u0010%J\u0015\u0010(\u001a\u00020\u00132\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)JO\u0010*\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\t2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00130\u00112\u0014\u0010\u0016\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010!\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0004\b*\u0010+J/\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010.R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010/R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u00100R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u00101R\u0014\u00104\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u00103¨\u00065"}, d2 = {"Ljj/a;", "", "Liu/l0;", "ioDispatcher", "mainDispatcher", "Lxk/j;", "notificationPlatform", "Lrg/y;", "implementations", "", "deviceName", "<init>", "(Liu/l0;Liu/l0;Lxk/j;Lrg/y;Ljava/lang/String;)V", "token", "oldToken", "", "authorizeForPush", "Lkotlin/Function1;", "Lkj/k0;", "", "onSuccess", "Lkotlin/Function0;", "onFailure", "Lhv/d;", "Lokhttp3/ResponseBody;", "regCall", "g", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lhv/d;Llt/b;)Ljava/lang/Object;", "b", "(Lkotlin/jvm/functions/Function0;Llt/b;)Ljava/lang/Object;", "platform", "notificationId", "Lkj/g0;", "", "e", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Llt/b;)Ljava/lang/Object;", "f", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "Lhj/r$c;", "deregistrationListener", "a", "(Lhj/r$c;)V", "d", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "c", "(Ljava/lang/String;ZLjava/lang/String;)Lhv/d;", "Liu/l0;", "Lxk/j;", "Lrg/y;", "Ljava/lang/String;", "Liu/p0;", "Liu/p0;", "serviceScope", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final l0 mainDispatcher;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final xk.j notificationPlatform;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final y implementations;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String deviceName;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final p0 serviceScope;

    /* JADX INFO: renamed from: jj.a$a, reason: collision with other inner class name */
    @nt.f(c = "com.roblox.client.pushnotification.http.PushNotificationService$deregisterCurrentDevice$1", f = "PushNotificationService.kt", l = {161}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class C0381a extends m implements Function2<p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f21939t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ r.c f21941v;

        /* JADX INFO: renamed from: jj.a$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class C0382a extends kotlin.jvm.internal.k implements Function0<Unit> {
            public C0382a(Object obj) {
                super(0, obj, r.c.class, "onSuccessfullyDeregistered", "onSuccessfullyDeregistered()V", 0);
            }

            public final void d() {
                ((r.c) this.receiver).a();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                d();
                return Unit.f22938a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0381a(r.c cVar, lt.b<? super C0381a> bVar) {
            super(2, bVar);
            this.f21941v = cVar;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return a.this.new C0381a(this.f21941v, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
            return ((C0381a) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = mt.c.e();
            int i10 = this.f21939t;
            if (i10 == 0) {
                o.b(obj);
                a aVar = a.this;
                C0382a c0382a = new C0382a(this.f21941v);
                this.f21939t = 1;
                if (aVar.b(c0382a, this) == objE) {
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

    @nt.f(c = "com.roblox.client.pushnotification.http.PushNotificationService", f = "PushNotificationService.kt", l = {84, 86}, m = "deregisterCurrentDeviceSuspend", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b extends nt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f21942t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f21943u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f21944v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f21945w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f21947y;

        public b(lt.b<? super b> bVar) {
            super(bVar);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f21945w = obj;
            this.f21947y |= Integer.MIN_VALUE;
            return a.this.b(null, this);
        }
    }

    @nt.f(c = "com.roblox.client.pushnotification.http.PushNotificationService$deregisterCurrentDeviceSuspend$3$1", f = "PushNotificationService.kt", l = {}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class c extends m implements Function2<p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f21948t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f21949u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Function0<Unit> function0, lt.b<? super c> bVar) {
            super(2, bVar);
            this.f21949u = function0;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return new c(this.f21949u, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            mt.c.e();
            if (this.f21948t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            this.f21949u.invoke();
            return Unit.f22938a;
        }
    }

    @nt.f(c = "com.roblox.client.pushnotification.http.PushNotificationService$makeNotificationMetadataApiCall$1", f = "PushNotificationService.kt", l = {181}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class d extends m implements Function2<p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f21950t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f21952v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f21953w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ String f21954x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ Function1<PushNotificationMetadataResponse, Unit> f21955y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ Function1<Integer, Unit> f21956z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(String str, String str2, String str3, Function1<? super PushNotificationMetadataResponse, Unit> function1, Function1<? super Integer, Unit> function2, lt.b<? super d> bVar) {
            super(2, bVar);
            this.f21952v = str;
            this.f21953w = str2;
            this.f21954x = str3;
            this.f21955y = function1;
            this.f21956z = function2;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return a.this.new d(this.f21952v, this.f21953w, this.f21954x, this.f21955y, this.f21956z, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = mt.c.e();
            int i10 = this.f21950t;
            if (i10 == 0) {
                o.b(obj);
                a aVar = a.this;
                String str = this.f21952v;
                String str2 = this.f21953w;
                String str3 = this.f21954x;
                Function1<PushNotificationMetadataResponse, Unit> function1 = this.f21955y;
                Function1<Integer, Unit> function2 = this.f21956z;
                this.f21950t = 1;
                if (aVar.e(str, str2, str3, function1, function2, this) == objE) {
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

    @nt.f(c = "com.roblox.client.pushnotification.http.PushNotificationService", f = "PushNotificationService.kt", l = {108, 116, 123}, m = "makeNotificationMetadataApiCallSuspend", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class e extends nt.d {
        public Object A;
        public int B;
        public /* synthetic */ Object C;
        public int E;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f21957t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f21958u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f21959v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f21960w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f21961x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public Object f21962y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public Object f21963z;

        public e(lt.b<? super e> bVar) {
            super(bVar);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.C = obj;
            this.E |= Integer.MIN_VALUE;
            return a.this.e(null, null, null, null, null, this);
        }
    }

    @nt.f(c = "com.roblox.client.pushnotification.http.PushNotificationService$makeNotificationMetadataApiCallSuspend$3$1", f = "PushNotificationService.kt", l = {}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class f extends m implements Function2<p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f21964t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Function1<PushNotificationMetadataResponse, Unit> f21965u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ PushNotificationMetadataResponse f21966v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(Function1<? super PushNotificationMetadataResponse, Unit> function1, PushNotificationMetadataResponse pushNotificationMetadataResponse, lt.b<? super f> bVar) {
            super(2, bVar);
            this.f21965u = function1;
            this.f21966v = pushNotificationMetadataResponse;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return new f(this.f21965u, this.f21966v, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
            return ((f) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            mt.c.e();
            if (this.f21964t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            this.f21965u.invoke(this.f21966v);
            return Unit.f22938a;
        }
    }

    @nt.f(c = "com.roblox.client.pushnotification.http.PushNotificationService$makeNotificationMetadataApiCallSuspend$4$1", f = "PushNotificationService.kt", l = {}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class g extends m implements Function2<p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f21967t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Function1<Integer, Unit> f21968u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(Function1<? super Integer, Unit> function1, lt.b<? super g> bVar) {
            super(2, bVar);
            this.f21968u = function1;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return new g(this.f21968u, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
            return ((g) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            mt.c.e();
            if (this.f21967t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            this.f21968u.invoke(null);
            return Unit.f22938a;
        }
    }

    @nt.f(c = "com.roblox.client.pushnotification.http.PushNotificationService$sendNotificationTokenToRbx$1", f = "PushNotificationService.kt", l = {145}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class h extends m implements Function2<p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f21969t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f21971v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f21972w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ boolean f21973x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ Function1<RegisterDeviceResponse, Unit> f21974y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f21975z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(String str, String str2, boolean z10, Function1<? super RegisterDeviceResponse, Unit> function1, Function0<Unit> function0, lt.b<? super h> bVar) {
            super(2, bVar);
            this.f21971v = str;
            this.f21972w = str2;
            this.f21973x = z10;
            this.f21974y = function1;
            this.f21975z = function0;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return a.this.new h(this.f21971v, this.f21972w, this.f21973x, this.f21974y, this.f21975z, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
            return ((h) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = mt.c.e();
            int i10 = this.f21969t;
            if (i10 == 0) {
                o.b(obj);
                a aVar = a.this;
                String str = this.f21971v;
                String str2 = this.f21972w;
                boolean z10 = this.f21973x;
                Function1<RegisterDeviceResponse, Unit> function1 = this.f21974y;
                Function0<Unit> function0 = this.f21975z;
                this.f21969t = 1;
                if (a.h(aVar, str, str2, z10, function1, function0, null, this, 32, null) == objE) {
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

    @nt.f(c = "com.roblox.client.pushnotification.http.PushNotificationService", f = "PushNotificationService.kt", l = {60, 68, 71, 75}, m = "sendNotificationTokenToRbxSuspend", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class i extends nt.d {
        public Object A;
        public boolean B;
        public int C;
        public /* synthetic */ Object D;
        public int F;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f21976t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f21977u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f21978v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f21979w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f21980x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public Object f21981y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public Object f21982z;

        public i(lt.b<? super i> bVar) {
            super(bVar);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.D = obj;
            this.F |= Integer.MIN_VALUE;
            return a.this.g(null, null, false, null, null, null, this);
        }
    }

    @nt.f(c = "com.roblox.client.pushnotification.http.PushNotificationService$sendNotificationTokenToRbxSuspend$3$1", f = "PushNotificationService.kt", l = {}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class j extends m implements Function2<p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f21983t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Function1<RegisterDeviceResponse, Unit> f21984u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ RegisterDeviceResponse f21985v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public j(Function1<? super RegisterDeviceResponse, Unit> function1, RegisterDeviceResponse registerDeviceResponse, lt.b<? super j> bVar) {
            super(2, bVar);
            this.f21984u = function1;
            this.f21985v = registerDeviceResponse;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return new j(this.f21984u, this.f21985v, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
            return ((j) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            mt.c.e();
            if (this.f21983t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            this.f21984u.invoke(this.f21985v);
            return Unit.f22938a;
        }
    }

    @nt.f(c = "com.roblox.client.pushnotification.http.PushNotificationService$sendNotificationTokenToRbxSuspend$3$2", f = "PushNotificationService.kt", l = {}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class k extends m implements Function2<p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f21986t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f21987u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Function0<Unit> function0, lt.b<? super k> bVar) {
            super(2, bVar);
            this.f21987u = function0;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return new k(this.f21987u, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
            return ((k) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            mt.c.e();
            if (this.f21986t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            this.f21987u.invoke();
            return Unit.f22938a;
        }
    }

    @nt.f(c = "com.roblox.client.pushnotification.http.PushNotificationService$sendNotificationTokenToRbxSuspend$4$1", f = "PushNotificationService.kt", l = {}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class l extends m implements Function2<p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f21988t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f21989u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Function0<Unit> function0, lt.b<? super l> bVar) {
            super(2, bVar);
            this.f21989u = function0;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return new l(this.f21989u, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
            return ((l) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            mt.c.e();
            if (this.f21988t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            this.f21989u.invoke();
            return Unit.f22938a;
        }
    }

    public a() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object h(a aVar, String str, String str2, boolean z10, Function1 function1, Function0 function0, hv.d dVar, lt.b bVar, int i10, Object obj) {
        if ((i10 & 32) != 0) {
            dVar = aVar.c(str, z10, str2);
        }
        return aVar.g(str, str2, z10, function1, function0, dVar, bVar);
    }

    public final void a(@NotNull r.c deregistrationListener) {
        Intrinsics.checkNotNullParameter(deregistrationListener, "deregistrationListener");
        iu.k.d(this.serviceScope, null, null, new C0381a(deregistrationListener, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a1, code lost:
    
        if (iu.i.g(r2, r5, r0) == r1) goto L35;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:42:0x00c0, please report this as an issue */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.Unit> r8, @org.jetbrains.annotations.NotNull lt.b<? super kotlin.Unit> r9) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jj.a.b(kotlin.jvm.functions.Function0, lt.b):java.lang.Object");
    }

    public final hv.d<ResponseBody> c(String token, boolean authorizeForPush, String oldToken) {
        yk.d dVar = new yk.d(token, authorizeForPush, oldToken, this.deviceName);
        hv.d<ResponseBody> dVarN = this.implementations.n(dVar);
        if (dVarN == null) {
            return t.f() ? this.notificationPlatform.i(dVar) : this.notificationPlatform.e(dVar);
        }
        return dVarN;
    }

    public final void d(@NotNull String platform, @NotNull String token, @NotNull String notificationId, @NotNull Function1<? super PushNotificationMetadataResponse, Unit> onSuccess, @NotNull Function1<? super Integer, Unit> onFailure) {
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(notificationId, "notificationId");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFailure, "onFailure");
        iu.k.d(this.serviceScope, null, null, new d(platform, token, notificationId, onSuccess, onFailure, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x011a A[Catch: all -> 0x016c, TryCatch #5 {all -> 0x016c, blocks: (B:50:0x0110, B:52:0x011a, B:57:0x016f), top: B:80:0x0110 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x016a  */
    /* JADX WARN: Code duplicated, block: B:57:0x016f A[Catch: all -> 0x016c, TRY_LEAVE, TryCatch #5 {all -> 0x016c, blocks: (B:50:0x0110, B:52:0x011a, B:57:0x016f), top: B:80:0x0110 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x018e  */
    /* JADX WARN: Code duplicated, block: B:65:0x0198  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x0110 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01ea, code lost:
    
        if (iu.i.g(r5, r7, r2) == r3) goto L67;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:65:0x0198, please report this as an issue */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(@org.jetbrains.annotations.NotNull java.lang.String r17, @org.jetbrains.annotations.NotNull java.lang.String r18, @org.jetbrains.annotations.NotNull java.lang.String r19, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kj.PushNotificationMetadataResponse, kotlin.Unit> r20, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r21, @org.jetbrains.annotations.NotNull lt.b<? super kotlin.Unit> r22) {
        /*
            Method dump skipped, instruction units count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jj.a.e(java.lang.String, java.lang.String, java.lang.String, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, lt.b):java.lang.Object");
    }

    public final void f(@NotNull String token, @Nullable String oldToken, boolean authorizeForPush, @NotNull Function1<? super RegisterDeviceResponse, Unit> onSuccess, @NotNull Function0<Unit> onFailure) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFailure, "onFailure");
        iu.k.d(this.serviceScope, null, null, new h(token, oldToken, authorizeForPush, onSuccess, onFailure, null), 3, null);
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
    
        if (iu.i.g(r5, r7, r2) == r3) goto L79;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(@org.jetbrains.annotations.NotNull java.lang.String r19, @org.jetbrains.annotations.Nullable java.lang.String r20, boolean r21, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kj.RegisterDeviceResponse, kotlin.Unit> r22, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.Unit> r23, @org.jetbrains.annotations.NotNull hv.d<okhttp3.ResponseBody> r24, @org.jetbrains.annotations.NotNull lt.b<? super kotlin.Unit> r25) {
        /*
            Method dump skipped, instruction units count: 563
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jj.a.g(java.lang.String, java.lang.String, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, hv.d, lt.b):java.lang.Object");
    }

    public a(@NotNull l0 ioDispatcher, @NotNull l0 mainDispatcher, @NotNull xk.j notificationPlatform, @NotNull y implementations, @NotNull String deviceName) {
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
    public /* synthetic */ a(l0 l0Var, l0 l0Var2, xk.j jVar, y yVar, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        l0Var = (i10 & 1) != 0 ? g1.b() : l0Var;
        l0Var2 = (i10 & 2) != 0 ? g1.c() : l0Var2;
        if ((i10 & 4) != 0) {
            jVar = tk.g.d().f();
            Intrinsics.checkNotNullExpressionValue(jVar, "notifications(...)");
        }
        if ((i10 & 8) != 0) {
            yVar = y.h();
            Intrinsics.checkNotNullExpressionValue(yVar, "getInstance(...)");
        }
        if ((i10 & 16) != 0) {
            str = cl.a.b(false);
            Intrinsics.checkNotNullExpressionValue(str, "getDeviceName(...)");
        }
        String str2 = str;
        this(l0Var, l0Var2, jVar, yVar, str2);
    }
}
