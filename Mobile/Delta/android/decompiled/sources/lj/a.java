package lj;

import gk.s;
import jj.r;
import jt.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ku.g1;
import ku.l0;
import ku.p0;
import ku.q0;
import ku.z2;
import mj.PushNotificationMetadataResponse;
import mj.RegisterDeviceResponse;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pt.m;
import sg.y;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\\\u0010\u001a\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00112\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00152\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0086@¢\u0006\u0004\b\u001a\u0010\u001bJ\u001e\u0010\u001c\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0015H\u0086@¢\u0006\u0004\b\u001c\u0010\u001dJR\u0010\"\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\t2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00130\u00112\u0014\u0010\u0016\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010!\u0012\u0004\u0012\u00020\u00130\u0011H\u0086@¢\u0006\u0004\b\"\u0010#JI\u0010$\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00112\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u0015¢\u0006\u0004\b$\u0010%J\u0015\u0010(\u001a\u00020\u00132\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)JO\u0010*\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\t2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00130\u00112\u0014\u0010\u0016\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010!\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0004\b*\u0010+J/\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010.R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010/R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u00100R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u00101R\u0014\u00104\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u00103¨\u00065"}, d2 = {"Llj/a;", "", "Lku/l0;", "ioDispatcher", "mainDispatcher", "Lzk/j;", "notificationPlatform", "Lsg/y;", "implementations", "", "deviceName", "<init>", "(Lku/l0;Lku/l0;Lzk/j;Lsg/y;Ljava/lang/String;)V", "token", "oldToken", "", "authorizeForPush", "Lkotlin/Function1;", "Lmj/k0;", "", "onSuccess", "Lkotlin/Function0;", "onFailure", "Ljv/d;", "Lokhttp3/ResponseBody;", "regCall", "g", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Ljv/d;Lnt/b;)Ljava/lang/Object;", "b", "(Lkotlin/jvm/functions/Function0;Lnt/b;)Ljava/lang/Object;", "platform", "notificationId", "Lmj/g0;", "", "e", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lnt/b;)Ljava/lang/Object;", "f", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "Ljj/r$c;", "deregistrationListener", "a", "(Ljj/r$c;)V", "d", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "c", "(Ljava/lang/String;ZLjava/lang/String;)Ljv/d;", "Lku/l0;", "Lzk/j;", "Lsg/y;", "Ljava/lang/String;", "Lku/p0;", "Lku/p0;", "serviceScope", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final l0 mainDispatcher;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final zk.j notificationPlatform;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final y implementations;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String deviceName;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final p0 serviceScope;

    /* JADX INFO: renamed from: lj.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.roblox.client.pushnotification.http.PushNotificationService$deregisterCurrentDevice$1", f = "PushNotificationService.kt", l = {161}, m = "invokeSuspend", v = 1)
    public static final class C0413a extends m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f23286t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ r.c f23288v;

        /* JADX INFO: renamed from: lj.a$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class C0414a extends kotlin.jvm.internal.k implements Function0<Unit> {
            public C0414a(Object obj) {
                super(0, obj, r.c.class, "onSuccessfullyDeregistered", "onSuccessfullyDeregistered()V", 0);
            }

            public final void d() {
                ((r.c) this.receiver).a();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                d();
                return Unit.f22483a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0413a(r.c cVar, nt.b<? super C0413a> bVar) {
            super(2, bVar);
            this.f23288v = cVar;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return a.this.new C0413a(this.f23288v, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f23286t;
            if (i10 == 0) {
                o.b(obj);
                a aVar = a.this;
                C0414a c0414a = new C0414a(this.f23288v);
                this.f23286t = 1;
                if (aVar.b(c0414a, this) == objE) {
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
            return ((C0413a) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @pt.f(c = "com.roblox.client.pushnotification.http.PushNotificationService", f = "PushNotificationService.kt", l = {84, 86}, m = "deregisterCurrentDeviceSuspend", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b extends pt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f23289t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f23290u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f23291v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f23292w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f23294y;

        public b(nt.b<? super b> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f23292w = obj;
            this.f23294y |= Integer.MIN_VALUE;
            return a.this.b(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.roblox.client.pushnotification.http.PushNotificationService$deregisterCurrentDeviceSuspend$3$1", f = "PushNotificationService.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class c extends m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f23295t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f23296u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Function0<Unit> function0, nt.b<? super c> bVar) {
            super(2, bVar);
            this.f23296u = function0;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new c(this.f23296u, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            ot.c.e();
            if (this.f23295t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            this.f23296u.invoke();
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.roblox.client.pushnotification.http.PushNotificationService$makeNotificationMetadataApiCall$1", f = "PushNotificationService.kt", l = {181}, m = "invokeSuspend", v = 1)
    public static final class d extends m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f23297t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f23299v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f23300w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ String f23301x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ Function1<PushNotificationMetadataResponse, Unit> f23302y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ Function1<Integer, Unit> f23303z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(String str, String str2, String str3, Function1<? super PushNotificationMetadataResponse, Unit> function1, Function1<? super Integer, Unit> function2, nt.b<? super d> bVar) {
            super(2, bVar);
            this.f23299v = str;
            this.f23300w = str2;
            this.f23301x = str3;
            this.f23302y = function1;
            this.f23303z = function2;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return a.this.new d(this.f23299v, this.f23300w, this.f23301x, this.f23302y, this.f23303z, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f23297t;
            if (i10 == 0) {
                o.b(obj);
                a aVar = a.this;
                String str = this.f23299v;
                String str2 = this.f23300w;
                String str3 = this.f23301x;
                Function1<PushNotificationMetadataResponse, Unit> function1 = this.f23302y;
                Function1<Integer, Unit> function2 = this.f23303z;
                this.f23297t = 1;
                if (aVar.e(str, str2, str3, function1, function2, this) == objE) {
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
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @pt.f(c = "com.roblox.client.pushnotification.http.PushNotificationService", f = "PushNotificationService.kt", l = {108, 116, 123}, m = "makeNotificationMetadataApiCallSuspend", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class e extends pt.d {
        public Object A;
        public int B;
        public /* synthetic */ Object C;
        public int E;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f23304t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f23305u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f23306v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f23307w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f23308x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public Object f23309y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public Object f23310z;

        public e(nt.b<? super e> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.C = obj;
            this.E |= Integer.MIN_VALUE;
            return a.this.e(null, null, null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.roblox.client.pushnotification.http.PushNotificationService$makeNotificationMetadataApiCallSuspend$3$1", f = "PushNotificationService.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class f extends m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f23311t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Function1<PushNotificationMetadataResponse, Unit> f23312u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ PushNotificationMetadataResponse f23313v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(Function1<? super PushNotificationMetadataResponse, Unit> function1, PushNotificationMetadataResponse pushNotificationMetadataResponse, nt.b<? super f> bVar) {
            super(2, bVar);
            this.f23312u = function1;
            this.f23313v = pushNotificationMetadataResponse;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new f(this.f23312u, this.f23313v, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            ot.c.e();
            if (this.f23311t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            this.f23312u.invoke(this.f23313v);
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((f) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.roblox.client.pushnotification.http.PushNotificationService$makeNotificationMetadataApiCallSuspend$4$1", f = "PushNotificationService.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class g extends m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f23314t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Function1<Integer, Unit> f23315u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(Function1<? super Integer, Unit> function1, nt.b<? super g> bVar) {
            super(2, bVar);
            this.f23315u = function1;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new g(this.f23315u, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            ot.c.e();
            if (this.f23314t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            this.f23315u.invoke(null);
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((g) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.roblox.client.pushnotification.http.PushNotificationService$sendNotificationTokenToRbx$1", f = "PushNotificationService.kt", l = {145}, m = "invokeSuspend", v = 1)
    public static final class h extends m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f23316t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f23318v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f23319w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ boolean f23320x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ Function1<RegisterDeviceResponse, Unit> f23321y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f23322z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(String str, String str2, boolean z10, Function1<? super RegisterDeviceResponse, Unit> function1, Function0<Unit> function0, nt.b<? super h> bVar) {
            super(2, bVar);
            this.f23318v = str;
            this.f23319w = str2;
            this.f23320x = z10;
            this.f23321y = function1;
            this.f23322z = function0;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return a.this.new h(this.f23318v, this.f23319w, this.f23320x, this.f23321y, this.f23322z, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f23316t;
            if (i10 == 0) {
                o.b(obj);
                a aVar = a.this;
                String str = this.f23318v;
                String str2 = this.f23319w;
                boolean z10 = this.f23320x;
                Function1<RegisterDeviceResponse, Unit> function1 = this.f23321y;
                Function0<Unit> function0 = this.f23322z;
                this.f23316t = 1;
                if (a.h(aVar, str, str2, z10, function1, function0, null, this, 32, null) == objE) {
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
            return ((h) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @pt.f(c = "com.roblox.client.pushnotification.http.PushNotificationService", f = "PushNotificationService.kt", l = {60, 68, 71, 75}, m = "sendNotificationTokenToRbxSuspend", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class i extends pt.d {
        public Object A;
        public boolean B;
        public int C;
        public /* synthetic */ Object D;
        public int F;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f23323t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f23324u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f23325v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f23326w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f23327x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public Object f23328y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public Object f23329z;

        public i(nt.b<? super i> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.D = obj;
            this.F |= Integer.MIN_VALUE;
            return a.this.g(null, null, false, null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.roblox.client.pushnotification.http.PushNotificationService$sendNotificationTokenToRbxSuspend$3$1", f = "PushNotificationService.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class j extends m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f23330t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Function1<RegisterDeviceResponse, Unit> f23331u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ RegisterDeviceResponse f23332v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public j(Function1<? super RegisterDeviceResponse, Unit> function1, RegisterDeviceResponse registerDeviceResponse, nt.b<? super j> bVar) {
            super(2, bVar);
            this.f23331u = function1;
            this.f23332v = registerDeviceResponse;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new j(this.f23331u, this.f23332v, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            ot.c.e();
            if (this.f23330t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            this.f23331u.invoke(this.f23332v);
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((j) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.roblox.client.pushnotification.http.PushNotificationService$sendNotificationTokenToRbxSuspend$3$2", f = "PushNotificationService.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class k extends m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f23333t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f23334u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Function0<Unit> function0, nt.b<? super k> bVar) {
            super(2, bVar);
            this.f23334u = function0;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new k(this.f23334u, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            ot.c.e();
            if (this.f23333t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            this.f23334u.invoke();
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((k) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.roblox.client.pushnotification.http.PushNotificationService$sendNotificationTokenToRbxSuspend$4$1", f = "PushNotificationService.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class l extends m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f23335t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f23336u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Function0<Unit> function0, nt.b<? super l> bVar) {
            super(2, bVar);
            this.f23336u = function0;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new l(this.f23336u, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            ot.c.e();
            if (this.f23335t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            this.f23336u.invoke();
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((l) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    public a() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object h(a aVar, String str, String str2, boolean z10, Function1 function1, Function0 function0, jv.d dVar, nt.b bVar, int i10, Object obj) {
        if ((i10 & 32) != 0) {
            dVar = aVar.c(str, z10, str2);
        }
        return aVar.g(str, str2, z10, function1, function0, dVar, bVar);
    }

    public final void a(@NotNull r.c deregistrationListener) {
        Intrinsics.checkNotNullParameter(deregistrationListener, "deregistrationListener");
        ku.k.d(this.serviceScope, null, null, new C0413a(deregistrationListener, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a1, code lost:
    
        if (ku.i.g(r2, r5, r0) == r1) goto L35;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:42:0x00c0, please report this as an issue */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.Unit> r8, @org.jetbrains.annotations.NotNull nt.b<? super kotlin.Unit> r9) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lj.a.b(kotlin.jvm.functions.Function0, nt.b):java.lang.Object");
    }

    public final jv.d<ResponseBody> c(String token, boolean authorizeForPush, String oldToken) {
        al.d dVar = new al.d(token, authorizeForPush, oldToken, this.deviceName);
        jv.d<ResponseBody> dVarN = this.implementations.n(dVar);
        if (dVarN == null) {
            return s.f() ? this.notificationPlatform.g(dVar) : this.notificationPlatform.d(dVar);
        }
        return dVarN;
    }

    public final void d(@NotNull String platform, @NotNull String token, @NotNull String notificationId, @NotNull Function1<? super PushNotificationMetadataResponse, Unit> onSuccess, @NotNull Function1<? super Integer, Unit> onFailure) {
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(notificationId, "notificationId");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFailure, "onFailure");
        ku.k.d(this.serviceScope, null, null, new d(platform, token, notificationId, onSuccess, onFailure, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x011a A[Catch: all -> 0x016c, TryCatch #5 {all -> 0x016c, blocks: (B:50:0x0110, B:52:0x011a, B:57:0x016f), top: B:80:0x0110 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x016a  */
    /* JADX WARN: Code duplicated, block: B:57:0x016f A[Catch: all -> 0x016c, TRY_LEAVE, TryCatch #5 {all -> 0x016c, blocks: (B:50:0x0110, B:52:0x011a, B:57:0x016f), top: B:80:0x0110 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x018e  */
    /* JADX WARN: Code duplicated, block: B:65:0x0198  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x0110 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01ea, code lost:
    
        if (ku.i.g(r5, r7, r2) == r3) goto L67;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:65:0x0198, please report this as an issue */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(@org.jetbrains.annotations.NotNull java.lang.String r17, @org.jetbrains.annotations.NotNull java.lang.String r18, @org.jetbrains.annotations.NotNull java.lang.String r19, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super mj.PushNotificationMetadataResponse, kotlin.Unit> r20, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r21, @org.jetbrains.annotations.NotNull nt.b<? super kotlin.Unit> r22) {
        /*
            Method dump skipped, instruction units count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lj.a.e(java.lang.String, java.lang.String, java.lang.String, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, nt.b):java.lang.Object");
    }

    public final void f(@NotNull String token, @Nullable String oldToken, boolean authorizeForPush, @NotNull Function1<? super RegisterDeviceResponse, Unit> onSuccess, @NotNull Function0<Unit> onFailure) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFailure, "onFailure");
        ku.k.d(this.serviceScope, null, null, new h(token, oldToken, authorizeForPush, onSuccess, onFailure, null), 3, null);
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
    
        if (ku.i.g(r5, r7, r2) == r3) goto L79;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(@org.jetbrains.annotations.NotNull java.lang.String r19, @org.jetbrains.annotations.Nullable java.lang.String r20, boolean r21, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super mj.RegisterDeviceResponse, kotlin.Unit> r22, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.Unit> r23, @org.jetbrains.annotations.NotNull jv.d<okhttp3.ResponseBody> r24, @org.jetbrains.annotations.NotNull nt.b<? super kotlin.Unit> r25) {
        /*
            Method dump skipped, instruction units count: 563
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lj.a.g(java.lang.String, java.lang.String, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, jv.d, nt.b):java.lang.Object");
    }

    public a(@NotNull l0 ioDispatcher, @NotNull l0 mainDispatcher, @NotNull zk.j notificationPlatform, @NotNull y implementations, @NotNull String deviceName) {
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
    public /* synthetic */ a(l0 l0Var, l0 l0Var2, zk.j jVar, y yVar, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        l0Var = (i10 & 1) != 0 ? g1.b() : l0Var;
        l0Var2 = (i10 & 2) != 0 ? g1.c() : l0Var2;
        if ((i10 & 4) != 0) {
            jVar = vk.g.d().g();
            Intrinsics.checkNotNullExpressionValue(jVar, "notifications(...)");
        }
        if ((i10 & 8) != 0) {
            yVar = y.h();
            Intrinsics.checkNotNullExpressionValue(yVar, "getInstance(...)");
        }
        if ((i10 & 16) != 0) {
            str = el.a.b(false);
            Intrinsics.checkNotNullExpressionValue(str, "getDeviceName(...)");
        }
        String str2 = str;
        this(l0Var, l0Var2, jVar, yVar, str2);
    }
}
