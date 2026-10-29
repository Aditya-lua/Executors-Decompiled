package p273lj;

import al.C0359d;
import androidx.core.view.inputmethod.EditorInfoCompat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7744k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p107el.C5160a;
import p151gk.C6124q;
import p151gk.C6127t;
import p151gk.C6132y;
import p222jj.C7193r;
import p229jt.C7347n;
import p229jt.C7348o;
import p231jv.C7388p;
import p231jv.C7396x;
import p231jv.InterfaceC7376d;
import p256ku.AbstractC7888l0;
import p256ku.C7864g1;
import p256ku.C7872i;
import p256ku.C7882k;
import p256ku.C7910q0;
import p256ku.C7948z2;
import p256ku.InterfaceC7906p0;
import p294mj.PushNotificationMetadataResponse;
import p294mj.RegisterDeviceResponse;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p493vk.C12225g;
import p607zk.InterfaceC13830j;
import pt.AbstractC10342d;
import pt.AbstractC10351m;
import pt.C10340b;
import pt.C10350l;
import pt.InterfaceC10344f;
import sg.C11370y;

/* JADX INFO: renamed from: lj.a */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\\\u0010\u001a\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00112\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00152\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0086@¢\u0006\u0004\b\u001a\u0010\u001bJ\u001e\u0010\u001c\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0015H\u0086@¢\u0006\u0004\b\u001c\u0010\u001dJR\u0010\"\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\t2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00130\u00112\u0014\u0010\u0016\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010!\u0012\u0004\u0012\u00020\u00130\u0011H\u0086@¢\u0006\u0004\b\"\u0010#JI\u0010$\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00112\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u0015¢\u0006\u0004\b$\u0010%J\u0015\u0010(\u001a\u00020\u00132\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)JO\u0010*\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\t2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00130\u00112\u0014\u0010\u0016\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010!\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0004\b*\u0010+J/\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010.R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010/R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u00100R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u00101R\u0014\u00104\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u00103¨\u00065"}, m31665d2 = {"Llj/a;", "", "Lku/l0;", "ioDispatcher", "mainDispatcher", "Lzk/j;", "notificationPlatform", "Lsg/y;", "implementations", "", "deviceName", "<init>", "(Lku/l0;Lku/l0;Lzk/j;Lsg/y;Ljava/lang/String;)V", "token", "oldToken", "", "authorizeForPush", "Lkotlin/Function1;", "Lmj/k0;", "", "onSuccess", "Lkotlin/Function0;", "onFailure", "Ljv/d;", "Lokhttp3/ResponseBody;", "regCall", "g", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Ljv/d;Lnt/b;)Ljava/lang/Object;", "b", "(Lkotlin/jvm/functions/Function0;Lnt/b;)Ljava/lang/Object;", "platform", "notificationId", "Lmj/g0;", "", "e", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lnt/b;)Ljava/lang/Object;", "f", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "Ljj/r$c;", "deregistrationListener", "a", "(Ljj/r$c;)V", "d", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "c", "(Ljava/lang/String;ZLjava/lang/String;)Ljv/d;", "Lku/l0;", "Lzk/j;", "Lsg/y;", "Ljava/lang/String;", "Lku/p0;", "Lku/p0;", "serviceScope", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C8153a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final AbstractC7888l0 mainDispatcher;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC13830j notificationPlatform;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final C11370y implementations;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final String deviceName;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7906p0 serviceScope;

    /* JADX INFO: renamed from: lj.a$a */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.pushnotification.http.PushNotificationService$deregisterCurrentDevice$1", m39664f = "PushNotificationService.kt", m39665l = {161}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f30243t;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ C7193r.c f30245v;

        /* JADX INFO: renamed from: lj.a$a$a, reason: collision with other inner class name */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* synthetic */ class C14199a extends C7744k implements Function0<Unit> {
            public C14199a(Object obj) {
                super(0, obj, C7193r.c.class, "onSuccessfullyDeregistered", "onSuccessfullyDeregistered()V", 0);
            }

            /* JADX INFO: renamed from: d */
            public final void m33427d() {
                ((C7193r.c) this.receiver).mo30061a();
            }

            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                m33427d();
                return Unit.f29331a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C7193r.c cVar, InterfaceC9557b<? super a> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f30245v = cVar;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C8153a.this.new a(this.f30245v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f30243t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                C8153a c8153a = C8153a.this;
                C14199a c14199a = new C14199a(this.f30245v);
                this.f30243t = 1;
                if (c8153a.m33421b(c14199a, this) == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: lj.a$b */
    @InterfaceC10344f(m39663c = "com.roblox.client.pushnotification.http.PushNotificationService", m39664f = "PushNotificationService.kt", m39665l = {84, 86}, m39666m = "deregisterCurrentDeviceSuspend", m39667v = 1)
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class b extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f30246t;

        /* JADX INFO: renamed from: u */
        public Object f30247u;

        /* JADX INFO: renamed from: v */
        public int f30248v;

        /* JADX INFO: renamed from: w */
        public /* synthetic */ Object f30249w;

        /* JADX INFO: renamed from: y */
        public int f30251y;

        public b(InterfaceC9557b<? super b> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f30249w = obj;
            this.f30251y |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C8153a.this.m33421b(null, this);
        }
    }

    /* JADX INFO: renamed from: lj.a$c */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.pushnotification.http.PushNotificationService$deregisterCurrentDeviceSuspend$3$1", m39664f = "PushNotificationService.kt", m39665l = {}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class c extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f30252t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ Function0<Unit> f30253u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Function0<Unit> function0, InterfaceC9557b<? super c> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f30253u = function0;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new c(this.f30253u, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f30252t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            this.f30253u.invoke();
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((c) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: lj.a$d */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.pushnotification.http.PushNotificationService$makeNotificationMetadataApiCall$1", m39664f = "PushNotificationService.kt", m39665l = {181}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class d extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f30254t;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ String f30256v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ String f30257w;

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ String f30258x;

        /* JADX INFO: renamed from: y */
        public final /* synthetic */ Function1<PushNotificationMetadataResponse, Unit> f30259y;

        /* JADX INFO: renamed from: z */
        public final /* synthetic */ Function1<Integer, Unit> f30260z;

        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super mj.g0, kotlin.Unit> */
        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(String str, String str2, String str3, Function1<? super PushNotificationMetadataResponse, Unit> function1, Function1<? super Integer, Unit> function2, InterfaceC9557b<? super d> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f30256v = str;
            this.f30257w = str2;
            this.f30258x = str3;
            this.f30259y = function1;
            this.f30260z = function2;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C8153a.this.new d(this.f30256v, this.f30257w, this.f30258x, this.f30259y, this.f30260z, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f30254t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                C8153a c8153a = C8153a.this;
                String str = this.f30256v;
                String str2 = this.f30257w;
                String str3 = this.f30258x;
                Function1<PushNotificationMetadataResponse, Unit> function1 = this.f30259y;
                Function1<Integer, Unit> function2 = this.f30260z;
                this.f30254t = 1;
                if (c8153a.m33424e(str, str2, str3, function1, function2, this) == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((d) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: lj.a$e */
    @InterfaceC10344f(m39663c = "com.roblox.client.pushnotification.http.PushNotificationService", m39664f = "PushNotificationService.kt", m39665l = {108, 116, 123}, m39666m = "makeNotificationMetadataApiCallSuspend", m39667v = 1)
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class e extends AbstractC10342d {

        /* JADX INFO: renamed from: A */
        public Object f30261A;

        /* JADX INFO: renamed from: B */
        public int f30262B;

        /* JADX INFO: renamed from: C */
        public /* synthetic */ Object f30263C;

        /* JADX INFO: renamed from: E */
        public int f30265E;

        /* JADX INFO: renamed from: t */
        public Object f30266t;

        /* JADX INFO: renamed from: u */
        public Object f30267u;

        /* JADX INFO: renamed from: v */
        public Object f30268v;

        /* JADX INFO: renamed from: w */
        public Object f30269w;

        /* JADX INFO: renamed from: x */
        public Object f30270x;

        /* JADX INFO: renamed from: y */
        public Object f30271y;

        /* JADX INFO: renamed from: z */
        public Object f30272z;

        public e(InterfaceC9557b<? super e> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f30263C = obj;
            this.f30265E |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C8153a.this.m33424e(null, null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: lj.a$f */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.pushnotification.http.PushNotificationService$makeNotificationMetadataApiCallSuspend$3$1", m39664f = "PushNotificationService.kt", m39665l = {}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class f extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f30273t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ Function1<PushNotificationMetadataResponse, Unit> f30274u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ PushNotificationMetadataResponse f30275v;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super mj.g0, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(Function1<? super PushNotificationMetadataResponse, Unit> function1, PushNotificationMetadataResponse pushNotificationMetadataResponse, InterfaceC9557b<? super f> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f30274u = function1;
            this.f30275v = pushNotificationMetadataResponse;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new f(this.f30274u, this.f30275v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f30273t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            this.f30274u.invoke(this.f30275v);
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((f) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: lj.a$g */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.pushnotification.http.PushNotificationService$makeNotificationMetadataApiCallSuspend$4$1", m39664f = "PushNotificationService.kt", m39665l = {}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class g extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f30276t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ Function1<Integer, Unit> f30277u;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(Function1<? super Integer, Unit> function1, InterfaceC9557b<? super g> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f30277u = function1;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new g(this.f30277u, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f30276t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            this.f30277u.invoke(null);
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((g) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: lj.a$h */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.pushnotification.http.PushNotificationService$sendNotificationTokenToRbx$1", m39664f = "PushNotificationService.kt", m39665l = {145}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class h extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f30278t;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ String f30280v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ String f30281w;

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ boolean f30282x;

        /* JADX INFO: renamed from: y */
        public final /* synthetic */ Function1<RegisterDeviceResponse, Unit> f30283y;

        /* JADX INFO: renamed from: z */
        public final /* synthetic */ Function0<Unit> f30284z;

        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super mj.k0, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(String str, String str2, boolean z10, Function1<? super RegisterDeviceResponse, Unit> function1, Function0<Unit> function0, InterfaceC9557b<? super h> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f30280v = str;
            this.f30281w = str2;
            this.f30282x = z10;
            this.f30283y = function1;
            this.f30284z = function0;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C8153a.this.new h(this.f30280v, this.f30281w, this.f30282x, this.f30283y, this.f30284z, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f30278t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                C8153a c8153a = C8153a.this;
                String str = this.f30280v;
                String str2 = this.f30281w;
                boolean z10 = this.f30282x;
                Function1<RegisterDeviceResponse, Unit> function1 = this.f30283y;
                Function0<Unit> function0 = this.f30284z;
                this.f30278t = 1;
                if (C8153a.m33419h(c8153a, str, str2, z10, function1, function0, null, this, 32, null) == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((h) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: lj.a$i */
    @InterfaceC10344f(m39663c = "com.roblox.client.pushnotification.http.PushNotificationService", m39664f = "PushNotificationService.kt", m39665l = {60, 68, 71, 75}, m39666m = "sendNotificationTokenToRbxSuspend", m39667v = 1)
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class i extends AbstractC10342d {

        /* JADX INFO: renamed from: A */
        public Object f30285A;

        /* JADX INFO: renamed from: B */
        public boolean f30286B;

        /* JADX INFO: renamed from: C */
        public int f30287C;

        /* JADX INFO: renamed from: D */
        public /* synthetic */ Object f30288D;

        /* JADX INFO: renamed from: F */
        public int f30290F;

        /* JADX INFO: renamed from: t */
        public Object f30291t;

        /* JADX INFO: renamed from: u */
        public Object f30292u;

        /* JADX INFO: renamed from: v */
        public Object f30293v;

        /* JADX INFO: renamed from: w */
        public Object f30294w;

        /* JADX INFO: renamed from: x */
        public Object f30295x;

        /* JADX INFO: renamed from: y */
        public Object f30296y;

        /* JADX INFO: renamed from: z */
        public Object f30297z;

        public i(InterfaceC9557b<? super i> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f30288D = obj;
            this.f30290F |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C8153a.this.m33426g(null, null, false, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: lj.a$j */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.pushnotification.http.PushNotificationService$sendNotificationTokenToRbxSuspend$3$1", m39664f = "PushNotificationService.kt", m39665l = {}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class j extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f30298t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ Function1<RegisterDeviceResponse, Unit> f30299u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ RegisterDeviceResponse f30300v;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super mj.k0, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public j(Function1<? super RegisterDeviceResponse, Unit> function1, RegisterDeviceResponse registerDeviceResponse, InterfaceC9557b<? super j> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f30299u = function1;
            this.f30300v = registerDeviceResponse;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new j(this.f30299u, this.f30300v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f30298t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            this.f30299u.invoke(this.f30300v);
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((j) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: lj.a$k */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.pushnotification.http.PushNotificationService$sendNotificationTokenToRbxSuspend$3$2", m39664f = "PushNotificationService.kt", m39665l = {}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class k extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f30301t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ Function0<Unit> f30302u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Function0<Unit> function0, InterfaceC9557b<? super k> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f30302u = function0;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new k(this.f30302u, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f30301t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            this.f30302u.invoke();
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((k) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: lj.a$l */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.pushnotification.http.PushNotificationService$sendNotificationTokenToRbxSuspend$4$1", m39664f = "PushNotificationService.kt", m39665l = {}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class l extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f30303t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ Function0<Unit> f30304u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Function0<Unit> function0, InterfaceC9557b<? super l> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f30304u = function0;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new l(this.f30304u, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f30303t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            this.f30304u.invoke();
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((l) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C8153a() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: lj.a */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public static /* synthetic */ Object m33419h(C8153a c8153a, String str, String str2, boolean z10, Function1 function1, Function0 function0, InterfaceC7376d interfaceC7376d, InterfaceC9557b interfaceC9557b, int i10, Object obj) {
        if ((i10 & 32) != 0) {
            interfaceC7376d = c8153a.m33422c(str, z10, str2);
        }
        return c8153a.m33426g(str, str2, z10, function1, function0, interfaceC7376d, interfaceC9557b);
    }

    /* JADX INFO: renamed from: a */
    public final void m33420a(@NotNull C7193r.c deregistrationListener) {
        Intrinsics.checkNotNullParameter(deregistrationListener, "deregistrationListener");
        C7882k.m32780d(this.serviceScope, null, null, new a(deregistrationListener, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a1, code lost:
    
        if (p256ku.C7872i.m32684g(r2, r5, r0) == r1) goto L35;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:42:0x00c0, please report this as an issue */
    @Nullable
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m33421b(@NotNull Function0<Unit> function0, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        b bVar;
        Object objM30460b;
        Object objM30460b2;
        Throwable thM30463e;
        if (interfaceC9557b instanceof b) {
            bVar = (b) interfaceC9557b;
            int i10 = bVar.f30251y;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                bVar.f30251y = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                bVar = new b(interfaceC9557b);
            }
        } else {
            bVar = new b(interfaceC9557b);
        }
        Object objM30598c = bVar.f30249w;
        Object objM38805e = C10047c.m38805e();
        int i11 = bVar.f30251y;
        try {
            try {
                if (i11 == 0) {
                    C7348o.m30470b(objM30598c);
                    InterfaceC7376d<ResponseBody> interfaceC7376dM50317h = this.notificationPlatform.m50317h();
                    C7347n.Companion companion = C7347n.INSTANCE;
                    bVar.f30246t = function0;
                    bVar.f30247u = C10350l.m39676a(interfaceC7376dM50317h);
                    bVar.f30248v = 0;
                    bVar.f30251y = 1;
                    objM30598c = C7388p.m30598c(interfaceC7376dM50317h, bVar);
                    if (objM30598c == objM38805e) {
                    }
                    return objM38805e;
                }
                if (i11 == 1) {
                    function0 = (Function0) bVar.f30246t;
                    C7348o.m30470b(objM30598c);
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(objM30598c);
                }
                objM30460b2 = C7347n.m30460b(Unit.f29331a);
                thM30463e = C7347n.m30463e(objM30460b2);
                if (thM30463e != null) {
                    C6124q.m27061f("rbx.push", "deregisterCurrentDevice failed: " + thM30463e.getMessage(), thM30463e);
                }
                return Unit.f29331a;
                objM30460b = C7347n.m30460b((C7396x) objM30598c);
            } catch (Throwable th2) {
                C7347n.Companion companion2 = C7347n.INSTANCE;
                objM30460b2 = C7347n.m30460b(C7348o.m30469a(th2));
            }
        } catch (Throwable th3) {
            C7347n.Companion companion3 = C7347n.INSTANCE;
            objM30460b = C7347n.m30460b(C7348o.m30469a(th3));
        }
        if (C7347n.m30466h(objM30460b)) {
            AbstractC7888l0 abstractC7888l0 = this.mainDispatcher;
            c cVar = new c(function0, null);
            bVar.f30246t = C10350l.m39676a(function0);
            bVar.f30247u = C10350l.m39676a((C7396x) objM30460b);
            bVar.f30248v = 0;
            bVar.f30251y = 2;
        } else {
            objM30460b2 = C7347n.m30460b(objM30460b);
        }
        thM30463e = C7347n.m30463e(objM30460b2);
        if (thM30463e != null) {
            C6124q.m27061f("rbx.push", "deregisterCurrentDevice failed: " + thM30463e.getMessage(), thM30463e);
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC7376d<ResponseBody> m33422c(String token, boolean authorizeForPush, String oldToken) {
        C0359d c0359d = new C0359d(token, authorizeForPush, oldToken, this.deviceName);
        InterfaceC7376d<ResponseBody> interfaceC7376dM42594n = this.implementations.m42594n(c0359d);
        if (interfaceC7376dM42594n == null) {
            return C6127t.m27090f() ? this.notificationPlatform.m50316g(c0359d) : this.notificationPlatform.m50313d(c0359d);
        }
        return interfaceC7376dM42594n;
    }

    /* JADX INFO: renamed from: d */
    public final void m33423d(@NotNull String platform, @NotNull String token, @NotNull String notificationId, @NotNull Function1<? super PushNotificationMetadataResponse, Unit> onSuccess, @NotNull Function1<? super Integer, Unit> onFailure) {
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(notificationId, "notificationId");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFailure, "onFailure");
        C7882k.m32780d(this.serviceScope, null, null, new d(platform, token, notificationId, onSuccess, onFailure, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x011a A[Catch: all -> 0x016c, TryCatch #5 {all -> 0x016c, blocks: (B:50:0x0110, B:52:0x011a, B:57:0x016f), top: B:80:0x0110 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x016a  */
    /* JADX WARN: Code duplicated, block: B:57:0x016f A[Catch: all -> 0x016c, TRY_LEAVE, TryCatch #5 {all -> 0x016c, blocks: (B:50:0x0110, B:52:0x011a, B:57:0x016f), top: B:80:0x0110 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x018e  */
    /* JADX WARN: Code duplicated, block: B:65:0x0198  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x0110 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01ea, code lost:
    
        if (p256ku.C7872i.m32684g(r5, r7, r2) == r3) goto L67;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:65:0x0198, please report this as an issue */
    @Nullable
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m33424e(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Function1<? super PushNotificationMetadataResponse, Unit> function1, @NotNull Function1<? super Integer, Unit> function2, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        e eVar;
        String str4;
        String str5;
        String str6;
        Function1<? super PushNotificationMetadataResponse, Unit> function3;
        Function1<? super Integer, Unit> function4;
        Function1<? super PushNotificationMetadataResponse, Unit> function5;
        String str7;
        Object objM30460b;
        String str8;
        String str9;
        Function1<? super Integer, Unit> function6;
        Function1<? super PushNotificationMetadataResponse, Unit> function7;
        C7396x c7396x;
        AbstractC7888l0 abstractC7888l0;
        f fVar;
        Object objM30460b2;
        Throwable thM30463e;
        if (interfaceC9557b instanceof e) {
            eVar = (e) interfaceC9557b;
            int i10 = eVar.f30265E;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                eVar.f30265E = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                eVar = new e(interfaceC9557b);
            }
        } else {
            eVar = new e(interfaceC9557b);
        }
        Object objM30598c = eVar.f30263C;
        Object objM38805e = C10047c.m38805e();
        int i11 = eVar.f30265E;
        try {
            if (i11 == 0) {
                C7348o.m30470b(objM30598c);
                str4 = str;
                str5 = str2;
                str6 = str3;
                InterfaceC7376d<ResponseBody> interfaceC7376dM50310a = this.notificationPlatform.m50310a(str4, str5, str6);
                try {
                    C7347n.Companion companion = C7347n.INSTANCE;
                    eVar.f30266t = C10350l.m39676a(str4);
                    eVar.f30267u = C10350l.m39676a(str5);
                    eVar.f30268v = C10350l.m39676a(str6);
                    function3 = function1;
                    try {
                        eVar.f30269w = function3;
                        function4 = function2;
                        try {
                            eVar.f30270x = function4;
                            eVar.f30271y = C10350l.m39676a(interfaceC7376dM50310a);
                            eVar.f30262B = 0;
                            eVar.f30265E = 1;
                            objM30598c = C7388p.m30598c(interfaceC7376dM50310a, eVar);
                            if (objM30598c != objM38805e) {
                                function5 = function3;
                                str7 = str4;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            C7347n.Companion companion2 = C7347n.INSTANCE;
                            objM30460b = C7347n.m30460b(C7348o.m30469a(th));
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        function4 = function2;
                        C7347n.Companion companion3 = C7347n.INSTANCE;
                        objM30460b = C7347n.m30460b(C7348o.m30469a(th));
                        str8 = str6;
                        str9 = str4;
                        function6 = function4;
                        if (!C7347n.m30466h(objM30460b)) {
                            objM30460b2 = C7347n.m30460b(objM30460b);
                            thM30463e = C7347n.m30463e(objM30460b2);
                            if (thM30463e != null) {
                                C6124q.m27061f("rbx.push", "RGLS.onMessageReceived() Exception msg: " + thM30463e.getMessage(), thM30463e);
                                AbstractC7888l0 abstractC7888l1 = this.mainDispatcher;
                                g gVar = new g(function6, null);
                                eVar.f30266t = C10350l.m39676a(str9);
                                eVar.f30267u = C10350l.m39676a(str5);
                                eVar.f30268v = C10350l.m39676a(str8);
                                eVar.f30269w = C10350l.m39676a(function3);
                                eVar.f30270x = C10350l.m39676a(function6);
                                eVar.f30271y = objM30460b2;
                                eVar.f30272z = C10350l.m39676a(thM30463e);
                                eVar.f30261A = null;
                                eVar.f30262B = 0;
                                eVar.f30265E = 3;
                            }
                            return Unit.f29331a;
                        }
                        c7396x = (C7396x) objM30460b;
                        if (c7396x.m30654b() == 200) {
                            String strM27103a = C6132y.m27103a(c7396x);
                            C6124q.m27063h("rbx.push", strM27103a);
                            PushNotificationMetadataResponse pushNotificationMetadataResponseM34437a = PushNotificationMetadataResponse.INSTANCE.m34437a(new JSONObject(strM27103a));
                            abstractC7888l0 = this.mainDispatcher;
                            fVar = new f(function3, pushNotificationMetadataResponseM34437a, null);
                            eVar.f30266t = C10350l.m39676a(str9);
                            eVar.f30267u = C10350l.m39676a(str5);
                            eVar.f30268v = C10350l.m39676a(str8);
                            eVar.f30269w = C10350l.m39676a(function3);
                            eVar.f30270x = function6;
                            eVar.f30271y = C10350l.m39676a(c7396x);
                            eVar.f30272z = C10350l.m39676a(strM27103a);
                            eVar.f30261A = C10350l.m39676a(pushNotificationMetadataResponseM34437a);
                            eVar.f30262B = 0;
                            eVar.f30265E = 2;
                            if (C7872i.m32684g(abstractC7888l0, fVar, eVar) == objM38805e) {
                            }
                        } else {
                            function6.invoke(C10340b.m39661d(c7396x.m30654b()));
                        }
                        function7 = function3;
                        objM30460b2 = C7347n.m30460b(Unit.f29331a);
                        function3 = function7;
                        thM30463e = C7347n.m30463e(objM30460b2);
                        if (thM30463e != null) {
                            C6124q.m27061f("rbx.push", "RGLS.onMessageReceived() Exception msg: " + thM30463e.getMessage(), thM30463e);
                            AbstractC7888l0 abstractC7888l2 = this.mainDispatcher;
                            g gVar2 = new g(function6, null);
                            eVar.f30266t = C10350l.m39676a(str9);
                            eVar.f30267u = C10350l.m39676a(str5);
                            eVar.f30268v = C10350l.m39676a(str8);
                            eVar.f30269w = C10350l.m39676a(function3);
                            eVar.f30270x = C10350l.m39676a(function6);
                            eVar.f30271y = objM30460b2;
                            eVar.f30272z = C10350l.m39676a(thM30463e);
                            eVar.f30261A = null;
                            eVar.f30262B = 0;
                            eVar.f30265E = 3;
                        }
                        return Unit.f29331a;
                        return objM38805e;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    function3 = function1;
                }
                return objM38805e;
            }
            if (i11 == 1) {
                Function1<? super Integer, Unit> function8 = (Function1) eVar.f30270x;
                function5 = (Function1) eVar.f30269w;
                String str10 = (String) eVar.f30268v;
                String str11 = (String) eVar.f30267u;
                str7 = (String) eVar.f30266t;
                try {
                    C7348o.m30470b(objM30598c);
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
                    C7347n.Companion companion4 = C7347n.INSTANCE;
                    objM30460b = C7347n.m30460b(C7348o.m30469a(th));
                    str8 = str6;
                    str9 = str4;
                    function6 = function4;
                    if (!C7347n.m30466h(objM30460b)) {
                        objM30460b2 = C7347n.m30460b(objM30460b);
                        thM30463e = C7347n.m30463e(objM30460b2);
                        if (thM30463e != null) {
                            C6124q.m27061f("rbx.push", "RGLS.onMessageReceived() Exception msg: " + thM30463e.getMessage(), thM30463e);
                            AbstractC7888l0 abstractC7888l3 = this.mainDispatcher;
                            g gVar3 = new g(function6, null);
                            eVar.f30266t = C10350l.m39676a(str9);
                            eVar.f30267u = C10350l.m39676a(str5);
                            eVar.f30268v = C10350l.m39676a(str8);
                            eVar.f30269w = C10350l.m39676a(function3);
                            eVar.f30270x = C10350l.m39676a(function6);
                            eVar.f30271y = objM30460b2;
                            eVar.f30272z = C10350l.m39676a(thM30463e);
                            eVar.f30261A = null;
                            eVar.f30262B = 0;
                            eVar.f30265E = 3;
                        }
                        return Unit.f29331a;
                    }
                    try {
                        c7396x = (C7396x) objM30460b;
                        if (c7396x.m30654b() == 200) {
                            String strM27103a2 = C6132y.m27103a(c7396x);
                            C6124q.m27063h("rbx.push", strM27103a2);
                            PushNotificationMetadataResponse pushNotificationMetadataResponseM34437a2 = PushNotificationMetadataResponse.INSTANCE.m34437a(new JSONObject(strM27103a2));
                            abstractC7888l0 = this.mainDispatcher;
                            fVar = new f(function3, pushNotificationMetadataResponseM34437a2, null);
                            eVar.f30266t = C10350l.m39676a(str9);
                            eVar.f30267u = C10350l.m39676a(str5);
                            eVar.f30268v = C10350l.m39676a(str8);
                            eVar.f30269w = C10350l.m39676a(function3);
                            eVar.f30270x = function6;
                            eVar.f30271y = C10350l.m39676a(c7396x);
                            eVar.f30272z = C10350l.m39676a(strM27103a2);
                            eVar.f30261A = C10350l.m39676a(pushNotificationMetadataResponseM34437a2);
                            eVar.f30262B = 0;
                            eVar.f30265E = 2;
                            if (C7872i.m32684g(abstractC7888l0, fVar, eVar) == objM38805e) {
                            }
                        } else {
                            function6.invoke(C10340b.m39661d(c7396x.m30654b()));
                        }
                        function7 = function3;
                        objM30460b2 = C7347n.m30460b(Unit.f29331a);
                    } catch (Throwable th6) {
                        th = th6;
                        function7 = function3;
                        C7347n.Companion companion5 = C7347n.INSTANCE;
                        objM30460b2 = C7347n.m30460b(C7348o.m30469a(th));
                    }
                    function3 = function7;
                    thM30463e = C7347n.m30463e(objM30460b2);
                    if (thM30463e != null) {
                        C6124q.m27061f("rbx.push", "RGLS.onMessageReceived() Exception msg: " + thM30463e.getMessage(), thM30463e);
                        AbstractC7888l0 abstractC7888l4 = this.mainDispatcher;
                        g gVar4 = new g(function6, null);
                        eVar.f30266t = C10350l.m39676a(str9);
                        eVar.f30267u = C10350l.m39676a(str5);
                        eVar.f30268v = C10350l.m39676a(str8);
                        eVar.f30269w = C10350l.m39676a(function3);
                        eVar.f30270x = C10350l.m39676a(function6);
                        eVar.f30271y = objM30460b2;
                        eVar.f30272z = C10350l.m39676a(thM30463e);
                        eVar.f30261A = null;
                        eVar.f30262B = 0;
                        eVar.f30265E = 3;
                    }
                    return Unit.f29331a;
                    return objM38805e;
                }
            } else if (i11 == 2) {
                function6 = (Function1) eVar.f30270x;
                function7 = (Function1) eVar.f30269w;
                str8 = (String) eVar.f30268v;
                str5 = (String) eVar.f30267u;
                str9 = (String) eVar.f30266t;
                try {
                    C7348o.m30470b(objM30598c);
                    objM30460b2 = C7347n.m30460b(Unit.f29331a);
                } catch (Throwable th7) {
                    th = th7;
                    C7347n.Companion companion6 = C7347n.INSTANCE;
                    objM30460b2 = C7347n.m30460b(C7348o.m30469a(th));
                }
                function3 = function7;
                thM30463e = C7347n.m30463e(objM30460b2);
                if (thM30463e != null) {
                    C6124q.m27061f("rbx.push", "RGLS.onMessageReceived() Exception msg: " + thM30463e.getMessage(), thM30463e);
                    AbstractC7888l0 abstractC7888l5 = this.mainDispatcher;
                    g gVar5 = new g(function6, null);
                    eVar.f30266t = C10350l.m39676a(str9);
                    eVar.f30267u = C10350l.m39676a(str5);
                    eVar.f30268v = C10350l.m39676a(str8);
                    eVar.f30269w = C10350l.m39676a(function3);
                    eVar.f30270x = C10350l.m39676a(function6);
                    eVar.f30271y = objM30460b2;
                    eVar.f30272z = C10350l.m39676a(thM30463e);
                    eVar.f30261A = null;
                    eVar.f30262B = 0;
                    eVar.f30265E = 3;
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(objM30598c);
            }
            return Unit.f29331a;
            objM30460b = C7347n.m30460b((C7396x) objM30598c);
            str4 = str7;
            function3 = function5;
        } catch (Throwable th8) {
            th = th8;
            str4 = str7;
            function3 = function5;
            C7347n.Companion companion7 = C7347n.INSTANCE;
            objM30460b = C7347n.m30460b(C7348o.m30469a(th));
        }
        str8 = str6;
        str9 = str4;
        function6 = function4;
        if (!C7347n.m30466h(objM30460b)) {
            objM30460b2 = C7347n.m30460b(objM30460b);
            thM30463e = C7347n.m30463e(objM30460b2);
            if (thM30463e != null) {
                C6124q.m27061f("rbx.push", "RGLS.onMessageReceived() Exception msg: " + thM30463e.getMessage(), thM30463e);
                AbstractC7888l0 abstractC7888l6 = this.mainDispatcher;
                g gVar6 = new g(function6, null);
                eVar.f30266t = C10350l.m39676a(str9);
                eVar.f30267u = C10350l.m39676a(str5);
                eVar.f30268v = C10350l.m39676a(str8);
                eVar.f30269w = C10350l.m39676a(function3);
                eVar.f30270x = C10350l.m39676a(function6);
                eVar.f30271y = objM30460b2;
                eVar.f30272z = C10350l.m39676a(thM30463e);
                eVar.f30261A = null;
                eVar.f30262B = 0;
                eVar.f30265E = 3;
            }
            return Unit.f29331a;
        }
        c7396x = (C7396x) objM30460b;
        if (c7396x.m30654b() == 200) {
            String strM27103a3 = C6132y.m27103a(c7396x);
            C6124q.m27063h("rbx.push", strM27103a3);
            PushNotificationMetadataResponse pushNotificationMetadataResponseM34437a3 = PushNotificationMetadataResponse.INSTANCE.m34437a(new JSONObject(strM27103a3));
            abstractC7888l0 = this.mainDispatcher;
            fVar = new f(function3, pushNotificationMetadataResponseM34437a3, null);
            eVar.f30266t = C10350l.m39676a(str9);
            eVar.f30267u = C10350l.m39676a(str5);
            eVar.f30268v = C10350l.m39676a(str8);
            eVar.f30269w = C10350l.m39676a(function3);
            eVar.f30270x = function6;
            eVar.f30271y = C10350l.m39676a(c7396x);
            eVar.f30272z = C10350l.m39676a(strM27103a3);
            eVar.f30261A = C10350l.m39676a(pushNotificationMetadataResponseM34437a3);
            eVar.f30262B = 0;
            eVar.f30265E = 2;
            if (C7872i.m32684g(abstractC7888l0, fVar, eVar) == objM38805e) {
            }
        } else {
            function6.invoke(C10340b.m39661d(c7396x.m30654b()));
        }
        function7 = function3;
        objM30460b2 = C7347n.m30460b(Unit.f29331a);
        function3 = function7;
        thM30463e = C7347n.m30463e(objM30460b2);
        if (thM30463e != null) {
            C6124q.m27061f("rbx.push", "RGLS.onMessageReceived() Exception msg: " + thM30463e.getMessage(), thM30463e);
            AbstractC7888l0 abstractC7888l7 = this.mainDispatcher;
            g gVar7 = new g(function6, null);
            eVar.f30266t = C10350l.m39676a(str9);
            eVar.f30267u = C10350l.m39676a(str5);
            eVar.f30268v = C10350l.m39676a(str8);
            eVar.f30269w = C10350l.m39676a(function3);
            eVar.f30270x = C10350l.m39676a(function6);
            eVar.f30271y = objM30460b2;
            eVar.f30272z = C10350l.m39676a(thM30463e);
            eVar.f30261A = null;
            eVar.f30262B = 0;
            eVar.f30265E = 3;
        }
        return Unit.f29331a;
        return objM38805e;
    }

    /* JADX INFO: renamed from: f */
    public final void m33425f(@NotNull String token, @Nullable String oldToken, boolean authorizeForPush, @NotNull Function1<? super RegisterDeviceResponse, Unit> onSuccess, @NotNull Function0<Unit> onFailure) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFailure, "onFailure");
        C7882k.m32780d(this.serviceScope, null, null, new h(token, oldToken, authorizeForPush, onSuccess, onFailure, null), 3, null);
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
    
        if (p256ku.C7872i.m32684g(r5, r7, r2) == r3) goto L79;
     */
    @Nullable
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m33426g(@NotNull String str, @Nullable String str2, boolean z10, @NotNull Function1<? super RegisterDeviceResponse, Unit> function1, @NotNull Function0<Unit> function0, @NotNull InterfaceC7376d<ResponseBody> interfaceC7376d, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        i iVar;
        Function1<? super RegisterDeviceResponse, Unit> function2;
        Function0<Unit> function3;
        InterfaceC7376d<ResponseBody> interfaceC7376d2;
        String str3;
        String str4;
        Object objM30460b;
        Function1<? super RegisterDeviceResponse, Unit> function4;
        boolean z11;
        InterfaceC7376d<ResponseBody> interfaceC7376d3;
        Function0<Unit> function5;
        Function1<? super RegisterDeviceResponse, Unit> function6;
        String str5;
        String str6;
        C7396x c7396x;
        AbstractC7888l0 abstractC7888l0;
        k kVar;
        AbstractC7888l0 abstractC7888l1;
        j jVar;
        Object objM30460b2;
        Throwable thM30463e;
        if (interfaceC9557b instanceof i) {
            iVar = (i) interfaceC9557b;
            int i10 = iVar.f30290F;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                iVar.f30290F = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                iVar = new i(interfaceC9557b);
            }
        } else {
            iVar = new i(interfaceC9557b);
        }
        Object objM30598c = iVar.f30288D;
        Object objM38805e = C10047c.m38805e();
        int i11 = iVar.f30290F;
        if (i11 != 0) {
            if (i11 == 1) {
                boolean z12 = iVar.f30286B;
                interfaceC7376d2 = (InterfaceC7376d) iVar.f30295x;
                function3 = (Function0) iVar.f30294w;
                Function1<? super RegisterDeviceResponse, Unit> function7 = (Function1) iVar.f30293v;
                str4 = (String) iVar.f30292u;
                str3 = (String) iVar.f30291t;
                try {
                    C7348o.m30470b(objM30598c);
                    z10 = z12;
                    function2 = function7;
                    try {
                        objM30460b = C7347n.m30460b((C7396x) objM30598c);
                    } catch (Throwable th2) {
                        th = th2;
                        C7347n.Companion companion = C7347n.INSTANCE;
                        objM30460b = C7347n.m30460b(C7348o.m30469a(th));
                    }
                } catch (Throwable th3) {
                    th = th3;
                    z10 = z12;
                    function2 = function7;
                    C7347n.Companion companion2 = C7347n.INSTANCE;
                    objM30460b = C7347n.m30460b(C7348o.m30469a(th));
                    boolean z13 = z10;
                    function4 = function2;
                    z11 = z13;
                    if (!C7347n.m30466h(objM30460b)) {
                        objM30460b2 = C7347n.m30460b(objM30460b);
                        thM30463e = C7347n.m30463e(objM30460b2);
                        if (thM30463e != null) {
                            C6124q.m27061f("rbx.push", "Error trying to register notification token", thM30463e);
                            AbstractC7888l0 abstractC7888l2 = this.mainDispatcher;
                            l lVar = new l(function3, null);
                            iVar.f30291t = C10350l.m39676a(str3);
                            iVar.f30292u = C10350l.m39676a(str4);
                            iVar.f30293v = C10350l.m39676a(function4);
                            iVar.f30294w = C10350l.m39676a(function3);
                            iVar.f30295x = C10350l.m39676a(interfaceC7376d2);
                            iVar.f30296y = objM30460b2;
                            iVar.f30297z = C10350l.m39676a(thM30463e);
                            iVar.f30285A = null;
                            iVar.f30286B = z11;
                            iVar.f30287C = 0;
                            iVar.f30290F = 4;
                        }
                        return Unit.f29331a;
                    }
                    try {
                        c7396x = (C7396x) objM30460b;
                        if (c7396x.m30654b() == 200) {
                            String strM27103a = C6132y.m27103a(c7396x);
                            C6124q.m27064i("rbx.push", strM27103a);
                            RegisterDeviceResponse registerDeviceResponseM34442a = RegisterDeviceResponse.INSTANCE.m34442a(new JSONObject(strM27103a));
                            abstractC7888l1 = this.mainDispatcher;
                            jVar = new j(function4, registerDeviceResponseM34442a, null);
                            iVar.f30291t = C10350l.m39676a(str3);
                            iVar.f30292u = C10350l.m39676a(str4);
                            iVar.f30293v = C10350l.m39676a(function4);
                            iVar.f30294w = function3;
                            iVar.f30295x = C10350l.m39676a(interfaceC7376d2);
                            iVar.f30296y = C10350l.m39676a(c7396x);
                            iVar.f30297z = C10350l.m39676a(strM27103a);
                            iVar.f30285A = C10350l.m39676a(registerDeviceResponseM34442a);
                            iVar.f30286B = z11;
                            iVar.f30287C = 0;
                            iVar.f30290F = 2;
                            if (C7872i.m32684g(abstractC7888l1, jVar, iVar) == objM38805e) {
                            }
                            interfaceC7376d3 = interfaceC7376d2;
                            function5 = function3;
                            function6 = function4;
                            str5 = str4;
                            str6 = str3;
                            objM30460b2 = C7347n.m30460b(Unit.f29331a);
                        } else {
                            abstractC7888l0 = this.mainDispatcher;
                            kVar = new k(function3, null);
                            iVar.f30291t = C10350l.m39676a(str3);
                            iVar.f30292u = C10350l.m39676a(str4);
                            iVar.f30293v = C10350l.m39676a(function4);
                            iVar.f30294w = function3;
                            iVar.f30295x = C10350l.m39676a(interfaceC7376d2);
                            iVar.f30296y = C10350l.m39676a(c7396x);
                            iVar.f30286B = z11;
                            iVar.f30287C = 0;
                            iVar.f30290F = 3;
                            if (C7872i.m32684g(abstractC7888l0, kVar, iVar) == objM38805e) {
                                interfaceC7376d3 = interfaceC7376d2;
                                function5 = function3;
                                function6 = function4;
                                str5 = str4;
                                str6 = str3;
                                objM30460b2 = C7347n.m30460b(Unit.f29331a);
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        interfaceC7376d3 = interfaceC7376d2;
                        function5 = function3;
                        function6 = function4;
                        str5 = str4;
                        str6 = str3;
                        C7347n.Companion companion3 = C7347n.INSTANCE;
                        objM30460b2 = C7347n.m30460b(C7348o.m30469a(th));
                    }
                    str4 = str5;
                    str3 = str6;
                    function3 = function5;
                    function4 = function6;
                    interfaceC7376d2 = interfaceC7376d3;
                    thM30463e = C7347n.m30463e(objM30460b2);
                    if (thM30463e != null) {
                        C6124q.m27061f("rbx.push", "Error trying to register notification token", thM30463e);
                        AbstractC7888l0 abstractC7888l3 = this.mainDispatcher;
                        l lVar2 = new l(function3, null);
                        iVar.f30291t = C10350l.m39676a(str3);
                        iVar.f30292u = C10350l.m39676a(str4);
                        iVar.f30293v = C10350l.m39676a(function4);
                        iVar.f30294w = C10350l.m39676a(function3);
                        iVar.f30295x = C10350l.m39676a(interfaceC7376d2);
                        iVar.f30296y = objM30460b2;
                        iVar.f30297z = C10350l.m39676a(thM30463e);
                        iVar.f30285A = null;
                        iVar.f30286B = z11;
                        iVar.f30287C = 0;
                        iVar.f30290F = 4;
                    }
                    return Unit.f29331a;
                    return objM38805e;
                }
                boolean z14 = z10;
                function4 = function2;
                z11 = z14;
                if (!C7347n.m30466h(objM30460b)) {
                    c7396x = (C7396x) objM30460b;
                    if (c7396x.m30654b() == 200) {
                        String strM27103a2 = C6132y.m27103a(c7396x);
                        C6124q.m27064i("rbx.push", strM27103a2);
                        RegisterDeviceResponse registerDeviceResponseM34442a2 = RegisterDeviceResponse.INSTANCE.m34442a(new JSONObject(strM27103a2));
                        abstractC7888l1 = this.mainDispatcher;
                        jVar = new j(function4, registerDeviceResponseM34442a2, null);
                        iVar.f30291t = C10350l.m39676a(str3);
                        iVar.f30292u = C10350l.m39676a(str4);
                        iVar.f30293v = C10350l.m39676a(function4);
                        iVar.f30294w = function3;
                        iVar.f30295x = C10350l.m39676a(interfaceC7376d2);
                        iVar.f30296y = C10350l.m39676a(c7396x);
                        iVar.f30297z = C10350l.m39676a(strM27103a2);
                        iVar.f30285A = C10350l.m39676a(registerDeviceResponseM34442a2);
                        iVar.f30286B = z11;
                        iVar.f30287C = 0;
                        iVar.f30290F = 2;
                        if (C7872i.m32684g(abstractC7888l1, jVar, iVar) == objM38805e) {
                        }
                        interfaceC7376d3 = interfaceC7376d2;
                        function5 = function3;
                        function6 = function4;
                        str5 = str4;
                        str6 = str3;
                        objM30460b2 = C7347n.m30460b(Unit.f29331a);
                    } else {
                        abstractC7888l0 = this.mainDispatcher;
                        kVar = new k(function3, null);
                        iVar.f30291t = C10350l.m39676a(str3);
                        iVar.f30292u = C10350l.m39676a(str4);
                        iVar.f30293v = C10350l.m39676a(function4);
                        iVar.f30294w = function3;
                        iVar.f30295x = C10350l.m39676a(interfaceC7376d2);
                        iVar.f30296y = C10350l.m39676a(c7396x);
                        iVar.f30286B = z11;
                        iVar.f30287C = 0;
                        iVar.f30290F = 3;
                        if (C7872i.m32684g(abstractC7888l0, kVar, iVar) == objM38805e) {
                            interfaceC7376d3 = interfaceC7376d2;
                            function5 = function3;
                            function6 = function4;
                            str5 = str4;
                            str6 = str3;
                            objM30460b2 = C7347n.m30460b(Unit.f29331a);
                        }
                    }
                    str4 = str5;
                    str3 = str6;
                    function3 = function5;
                    function4 = function6;
                    interfaceC7376d2 = interfaceC7376d3;
                    thM30463e = C7347n.m30463e(objM30460b2);
                    if (thM30463e != null) {
                        C6124q.m27061f("rbx.push", "Error trying to register notification token", thM30463e);
                        AbstractC7888l0 abstractC7888l4 = this.mainDispatcher;
                        l lVar3 = new l(function3, null);
                        iVar.f30291t = C10350l.m39676a(str3);
                        iVar.f30292u = C10350l.m39676a(str4);
                        iVar.f30293v = C10350l.m39676a(function4);
                        iVar.f30294w = C10350l.m39676a(function3);
                        iVar.f30295x = C10350l.m39676a(interfaceC7376d2);
                        iVar.f30296y = objM30460b2;
                        iVar.f30297z = C10350l.m39676a(thM30463e);
                        iVar.f30285A = null;
                        iVar.f30286B = z11;
                        iVar.f30287C = 0;
                        iVar.f30290F = 4;
                    }
                } else {
                    objM30460b2 = C7347n.m30460b(objM30460b);
                    thM30463e = C7347n.m30463e(objM30460b2);
                    if (thM30463e != null) {
                        C6124q.m27061f("rbx.push", "Error trying to register notification token", thM30463e);
                        AbstractC7888l0 abstractC7888l5 = this.mainDispatcher;
                        l lVar4 = new l(function3, null);
                        iVar.f30291t = C10350l.m39676a(str3);
                        iVar.f30292u = C10350l.m39676a(str4);
                        iVar.f30293v = C10350l.m39676a(function4);
                        iVar.f30294w = C10350l.m39676a(function3);
                        iVar.f30295x = C10350l.m39676a(interfaceC7376d2);
                        iVar.f30296y = objM30460b2;
                        iVar.f30297z = C10350l.m39676a(thM30463e);
                        iVar.f30285A = null;
                        iVar.f30286B = z11;
                        iVar.f30287C = 0;
                        iVar.f30290F = 4;
                    }
                }
                return objM38805e;
            }
            if (i11 == 2) {
                z11 = iVar.f30286B;
            } else if (i11 == 3) {
                z11 = iVar.f30286B;
            } else {
                if (i11 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(objM30598c);
            }
            interfaceC7376d3 = (InterfaceC7376d) iVar.f30295x;
            function5 = (Function0) iVar.f30294w;
            function6 = (Function1) iVar.f30293v;
            str5 = (String) iVar.f30292u;
            str6 = (String) iVar.f30291t;
            try {
                C7348o.m30470b(objM30598c);
                objM30460b2 = C7347n.m30460b(Unit.f29331a);
            } catch (Throwable th5) {
                th = th5;
                C7347n.Companion companion4 = C7347n.INSTANCE;
                objM30460b2 = C7347n.m30460b(C7348o.m30469a(th));
            }
            str4 = str5;
            str3 = str6;
            function3 = function5;
            function4 = function6;
            interfaceC7376d2 = interfaceC7376d3;
            thM30463e = C7347n.m30463e(objM30460b2);
            if (thM30463e != null) {
                C6124q.m27061f("rbx.push", "Error trying to register notification token", thM30463e);
                AbstractC7888l0 abstractC7888l6 = this.mainDispatcher;
                l lVar5 = new l(function3, null);
                iVar.f30291t = C10350l.m39676a(str3);
                iVar.f30292u = C10350l.m39676a(str4);
                iVar.f30293v = C10350l.m39676a(function4);
                iVar.f30294w = C10350l.m39676a(function3);
                iVar.f30295x = C10350l.m39676a(interfaceC7376d2);
                iVar.f30296y = objM30460b2;
                iVar.f30297z = C10350l.m39676a(thM30463e);
                iVar.f30285A = null;
                iVar.f30286B = z11;
                iVar.f30287C = 0;
                iVar.f30290F = 4;
            }
            return Unit.f29331a;
        }
        C7348o.m30470b(objM30598c);
        try {
            C7347n.Companion companion5 = C7347n.INSTANCE;
            iVar.f30291t = C10350l.m39676a(str);
            iVar.f30292u = C10350l.m39676a(str2);
            function2 = function1;
            try {
                iVar.f30293v = function2;
                function3 = function0;
                try {
                    iVar.f30294w = function3;
                    iVar.f30295x = C10350l.m39676a(interfaceC7376d);
                    iVar.f30296y = C10350l.m39676a(interfaceC7376d);
                    z10 = z10;
                    try {
                        iVar.f30286B = z10;
                        iVar.f30287C = 0;
                        iVar.f30290F = 1;
                        interfaceC7376d2 = interfaceC7376d;
                        try {
                            objM30598c = C7388p.m30598c(interfaceC7376d2, iVar);
                            if (objM30598c != objM38805e) {
                                str3 = str;
                                str4 = str2;
                                objM30460b = C7347n.m30460b((C7396x) objM30598c);
                                boolean z15 = z10;
                                function4 = function2;
                                z11 = z15;
                                if (!C7347n.m30466h(objM30460b)) {
                                    objM30460b2 = C7347n.m30460b(objM30460b);
                                    thM30463e = C7347n.m30463e(objM30460b2);
                                    if (thM30463e != null) {
                                        C6124q.m27061f("rbx.push", "Error trying to register notification token", thM30463e);
                                        AbstractC7888l0 abstractC7888l7 = this.mainDispatcher;
                                        l lVar6 = new l(function3, null);
                                        iVar.f30291t = C10350l.m39676a(str3);
                                        iVar.f30292u = C10350l.m39676a(str4);
                                        iVar.f30293v = C10350l.m39676a(function4);
                                        iVar.f30294w = C10350l.m39676a(function3);
                                        iVar.f30295x = C10350l.m39676a(interfaceC7376d2);
                                        iVar.f30296y = objM30460b2;
                                        iVar.f30297z = C10350l.m39676a(thM30463e);
                                        iVar.f30285A = null;
                                        iVar.f30286B = z11;
                                        iVar.f30287C = 0;
                                        iVar.f30290F = 4;
                                    }
                                    return Unit.f29331a;
                                }
                                c7396x = (C7396x) objM30460b;
                                if (c7396x.m30654b() == 200) {
                                    String strM27103a3 = C6132y.m27103a(c7396x);
                                    C6124q.m27064i("rbx.push", strM27103a3);
                                    RegisterDeviceResponse registerDeviceResponseM34442a3 = RegisterDeviceResponse.INSTANCE.m34442a(new JSONObject(strM27103a3));
                                    abstractC7888l1 = this.mainDispatcher;
                                    jVar = new j(function4, registerDeviceResponseM34442a3, null);
                                    iVar.f30291t = C10350l.m39676a(str3);
                                    iVar.f30292u = C10350l.m39676a(str4);
                                    iVar.f30293v = C10350l.m39676a(function4);
                                    iVar.f30294w = function3;
                                    iVar.f30295x = C10350l.m39676a(interfaceC7376d2);
                                    iVar.f30296y = C10350l.m39676a(c7396x);
                                    iVar.f30297z = C10350l.m39676a(strM27103a3);
                                    iVar.f30285A = C10350l.m39676a(registerDeviceResponseM34442a3);
                                    iVar.f30286B = z11;
                                    iVar.f30287C = 0;
                                    iVar.f30290F = 2;
                                    if (C7872i.m32684g(abstractC7888l1, jVar, iVar) == objM38805e) {
                                    }
                                    interfaceC7376d3 = interfaceC7376d2;
                                    function5 = function3;
                                    function6 = function4;
                                    str5 = str4;
                                    str6 = str3;
                                    objM30460b2 = C7347n.m30460b(Unit.f29331a);
                                } else {
                                    abstractC7888l0 = this.mainDispatcher;
                                    kVar = new k(function3, null);
                                    iVar.f30291t = C10350l.m39676a(str3);
                                    iVar.f30292u = C10350l.m39676a(str4);
                                    iVar.f30293v = C10350l.m39676a(function4);
                                    iVar.f30294w = function3;
                                    iVar.f30295x = C10350l.m39676a(interfaceC7376d2);
                                    iVar.f30296y = C10350l.m39676a(c7396x);
                                    iVar.f30286B = z11;
                                    iVar.f30287C = 0;
                                    iVar.f30290F = 3;
                                    if (C7872i.m32684g(abstractC7888l0, kVar, iVar) == objM38805e) {
                                        interfaceC7376d3 = interfaceC7376d2;
                                        function5 = function3;
                                        function6 = function4;
                                        str5 = str4;
                                        str6 = str3;
                                        objM30460b2 = C7347n.m30460b(Unit.f29331a);
                                    }
                                }
                                str4 = str5;
                                str3 = str6;
                                function3 = function5;
                                function4 = function6;
                                interfaceC7376d2 = interfaceC7376d3;
                                thM30463e = C7347n.m30463e(objM30460b2);
                                if (thM30463e != null) {
                                    C6124q.m27061f("rbx.push", "Error trying to register notification token", thM30463e);
                                    AbstractC7888l0 abstractC7888l8 = this.mainDispatcher;
                                    l lVar7 = new l(function3, null);
                                    iVar.f30291t = C10350l.m39676a(str3);
                                    iVar.f30292u = C10350l.m39676a(str4);
                                    iVar.f30293v = C10350l.m39676a(function4);
                                    iVar.f30294w = C10350l.m39676a(function3);
                                    iVar.f30295x = C10350l.m39676a(interfaceC7376d2);
                                    iVar.f30296y = objM30460b2;
                                    iVar.f30297z = C10350l.m39676a(thM30463e);
                                    iVar.f30285A = null;
                                    iVar.f30286B = z11;
                                    iVar.f30287C = 0;
                                    iVar.f30290F = 4;
                                }
                                return Unit.f29331a;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            str3 = str;
                            str4 = str2;
                            C7347n.Companion companion6 = C7347n.INSTANCE;
                            objM30460b = C7347n.m30460b(C7348o.m30469a(th));
                            boolean z16 = z10;
                            function4 = function2;
                            z11 = z16;
                            if (!C7347n.m30466h(objM30460b)) {
                                objM30460b2 = C7347n.m30460b(objM30460b);
                                thM30463e = C7347n.m30463e(objM30460b2);
                                if (thM30463e != null) {
                                    C6124q.m27061f("rbx.push", "Error trying to register notification token", thM30463e);
                                    AbstractC7888l0 abstractC7888l9 = this.mainDispatcher;
                                    l lVar8 = new l(function3, null);
                                    iVar.f30291t = C10350l.m39676a(str3);
                                    iVar.f30292u = C10350l.m39676a(str4);
                                    iVar.f30293v = C10350l.m39676a(function4);
                                    iVar.f30294w = C10350l.m39676a(function3);
                                    iVar.f30295x = C10350l.m39676a(interfaceC7376d2);
                                    iVar.f30296y = objM30460b2;
                                    iVar.f30297z = C10350l.m39676a(thM30463e);
                                    iVar.f30285A = null;
                                    iVar.f30286B = z11;
                                    iVar.f30287C = 0;
                                    iVar.f30290F = 4;
                                }
                                return Unit.f29331a;
                            }
                            c7396x = (C7396x) objM30460b;
                            if (c7396x.m30654b() == 200) {
                                String strM27103a4 = C6132y.m27103a(c7396x);
                                C6124q.m27064i("rbx.push", strM27103a4);
                                RegisterDeviceResponse registerDeviceResponseM34442a4 = RegisterDeviceResponse.INSTANCE.m34442a(new JSONObject(strM27103a4));
                                abstractC7888l1 = this.mainDispatcher;
                                jVar = new j(function4, registerDeviceResponseM34442a4, null);
                                iVar.f30291t = C10350l.m39676a(str3);
                                iVar.f30292u = C10350l.m39676a(str4);
                                iVar.f30293v = C10350l.m39676a(function4);
                                iVar.f30294w = function3;
                                iVar.f30295x = C10350l.m39676a(interfaceC7376d2);
                                iVar.f30296y = C10350l.m39676a(c7396x);
                                iVar.f30297z = C10350l.m39676a(strM27103a4);
                                iVar.f30285A = C10350l.m39676a(registerDeviceResponseM34442a4);
                                iVar.f30286B = z11;
                                iVar.f30287C = 0;
                                iVar.f30290F = 2;
                                if (C7872i.m32684g(abstractC7888l1, jVar, iVar) == objM38805e) {
                                }
                                interfaceC7376d3 = interfaceC7376d2;
                                function5 = function3;
                                function6 = function4;
                                str5 = str4;
                                str6 = str3;
                                objM30460b2 = C7347n.m30460b(Unit.f29331a);
                            } else {
                                abstractC7888l0 = this.mainDispatcher;
                                kVar = new k(function3, null);
                                iVar.f30291t = C10350l.m39676a(str3);
                                iVar.f30292u = C10350l.m39676a(str4);
                                iVar.f30293v = C10350l.m39676a(function4);
                                iVar.f30294w = function3;
                                iVar.f30295x = C10350l.m39676a(interfaceC7376d2);
                                iVar.f30296y = C10350l.m39676a(c7396x);
                                iVar.f30286B = z11;
                                iVar.f30287C = 0;
                                iVar.f30290F = 3;
                                if (C7872i.m32684g(abstractC7888l0, kVar, iVar) == objM38805e) {
                                    interfaceC7376d3 = interfaceC7376d2;
                                    function5 = function3;
                                    function6 = function4;
                                    str5 = str4;
                                    str6 = str3;
                                    objM30460b2 = C7347n.m30460b(Unit.f29331a);
                                }
                            }
                            str4 = str5;
                            str3 = str6;
                            function3 = function5;
                            function4 = function6;
                            interfaceC7376d2 = interfaceC7376d3;
                            thM30463e = C7347n.m30463e(objM30460b2);
                            if (thM30463e != null) {
                                C6124q.m27061f("rbx.push", "Error trying to register notification token", thM30463e);
                                AbstractC7888l0 abstractC7888l10 = this.mainDispatcher;
                                l lVar9 = new l(function3, null);
                                iVar.f30291t = C10350l.m39676a(str3);
                                iVar.f30292u = C10350l.m39676a(str4);
                                iVar.f30293v = C10350l.m39676a(function4);
                                iVar.f30294w = C10350l.m39676a(function3);
                                iVar.f30295x = C10350l.m39676a(interfaceC7376d2);
                                iVar.f30296y = objM30460b2;
                                iVar.f30297z = C10350l.m39676a(thM30463e);
                                iVar.f30285A = null;
                                iVar.f30286B = z11;
                                iVar.f30287C = 0;
                                iVar.f30290F = 4;
                            }
                            return Unit.f29331a;
                            return objM38805e;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        interfaceC7376d2 = interfaceC7376d;
                        str3 = str;
                        str4 = str2;
                        C7347n.Companion companion7 = C7347n.INSTANCE;
                        objM30460b = C7347n.m30460b(C7348o.m30469a(th));
                        boolean z17 = z10;
                        function4 = function2;
                        z11 = z17;
                        if (!C7347n.m30466h(objM30460b)) {
                            objM30460b2 = C7347n.m30460b(objM30460b);
                            thM30463e = C7347n.m30463e(objM30460b2);
                            if (thM30463e != null) {
                                C6124q.m27061f("rbx.push", "Error trying to register notification token", thM30463e);
                                AbstractC7888l0 abstractC7888l11 = this.mainDispatcher;
                                l lVar10 = new l(function3, null);
                                iVar.f30291t = C10350l.m39676a(str3);
                                iVar.f30292u = C10350l.m39676a(str4);
                                iVar.f30293v = C10350l.m39676a(function4);
                                iVar.f30294w = C10350l.m39676a(function3);
                                iVar.f30295x = C10350l.m39676a(interfaceC7376d2);
                                iVar.f30296y = objM30460b2;
                                iVar.f30297z = C10350l.m39676a(thM30463e);
                                iVar.f30285A = null;
                                iVar.f30286B = z11;
                                iVar.f30287C = 0;
                                iVar.f30290F = 4;
                            }
                            return Unit.f29331a;
                        }
                        c7396x = (C7396x) objM30460b;
                        if (c7396x.m30654b() == 200) {
                            String strM27103a5 = C6132y.m27103a(c7396x);
                            C6124q.m27064i("rbx.push", strM27103a5);
                            RegisterDeviceResponse registerDeviceResponseM34442a5 = RegisterDeviceResponse.INSTANCE.m34442a(new JSONObject(strM27103a5));
                            abstractC7888l1 = this.mainDispatcher;
                            jVar = new j(function4, registerDeviceResponseM34442a5, null);
                            iVar.f30291t = C10350l.m39676a(str3);
                            iVar.f30292u = C10350l.m39676a(str4);
                            iVar.f30293v = C10350l.m39676a(function4);
                            iVar.f30294w = function3;
                            iVar.f30295x = C10350l.m39676a(interfaceC7376d2);
                            iVar.f30296y = C10350l.m39676a(c7396x);
                            iVar.f30297z = C10350l.m39676a(strM27103a5);
                            iVar.f30285A = C10350l.m39676a(registerDeviceResponseM34442a5);
                            iVar.f30286B = z11;
                            iVar.f30287C = 0;
                            iVar.f30290F = 2;
                            if (C7872i.m32684g(abstractC7888l1, jVar, iVar) == objM38805e) {
                            }
                            interfaceC7376d3 = interfaceC7376d2;
                            function5 = function3;
                            function6 = function4;
                            str5 = str4;
                            str6 = str3;
                            objM30460b2 = C7347n.m30460b(Unit.f29331a);
                        } else {
                            abstractC7888l0 = this.mainDispatcher;
                            kVar = new k(function3, null);
                            iVar.f30291t = C10350l.m39676a(str3);
                            iVar.f30292u = C10350l.m39676a(str4);
                            iVar.f30293v = C10350l.m39676a(function4);
                            iVar.f30294w = function3;
                            iVar.f30295x = C10350l.m39676a(interfaceC7376d2);
                            iVar.f30296y = C10350l.m39676a(c7396x);
                            iVar.f30286B = z11;
                            iVar.f30287C = 0;
                            iVar.f30290F = 3;
                            if (C7872i.m32684g(abstractC7888l0, kVar, iVar) == objM38805e) {
                                interfaceC7376d3 = interfaceC7376d2;
                                function5 = function3;
                                function6 = function4;
                                str5 = str4;
                                str6 = str3;
                                objM30460b2 = C7347n.m30460b(Unit.f29331a);
                            }
                        }
                        str4 = str5;
                        str3 = str6;
                        function3 = function5;
                        function4 = function6;
                        interfaceC7376d2 = interfaceC7376d3;
                        thM30463e = C7347n.m30463e(objM30460b2);
                        if (thM30463e != null) {
                            C6124q.m27061f("rbx.push", "Error trying to register notification token", thM30463e);
                            AbstractC7888l0 abstractC7888l12 = this.mainDispatcher;
                            l lVar11 = new l(function3, null);
                            iVar.f30291t = C10350l.m39676a(str3);
                            iVar.f30292u = C10350l.m39676a(str4);
                            iVar.f30293v = C10350l.m39676a(function4);
                            iVar.f30294w = C10350l.m39676a(function3);
                            iVar.f30295x = C10350l.m39676a(interfaceC7376d2);
                            iVar.f30296y = objM30460b2;
                            iVar.f30297z = C10350l.m39676a(thM30463e);
                            iVar.f30285A = null;
                            iVar.f30286B = z11;
                            iVar.f30287C = 0;
                            iVar.f30290F = 4;
                        }
                        return Unit.f29331a;
                        return objM38805e;
                    }
                } catch (Throwable th8) {
                    th = th8;
                    z10 = z10;
                }
            } catch (Throwable th9) {
                th = th9;
                function3 = function0;
                interfaceC7376d2 = interfaceC7376d;
                str3 = str;
                str4 = str2;
                C7347n.Companion companion8 = C7347n.INSTANCE;
                objM30460b = C7347n.m30460b(C7348o.m30469a(th));
                boolean z18 = z10;
                function4 = function2;
                z11 = z18;
                if (!C7347n.m30466h(objM30460b)) {
                    objM30460b2 = C7347n.m30460b(objM30460b);
                    thM30463e = C7347n.m30463e(objM30460b2);
                    if (thM30463e != null) {
                        C6124q.m27061f("rbx.push", "Error trying to register notification token", thM30463e);
                        AbstractC7888l0 abstractC7888l13 = this.mainDispatcher;
                        l lVar12 = new l(function3, null);
                        iVar.f30291t = C10350l.m39676a(str3);
                        iVar.f30292u = C10350l.m39676a(str4);
                        iVar.f30293v = C10350l.m39676a(function4);
                        iVar.f30294w = C10350l.m39676a(function3);
                        iVar.f30295x = C10350l.m39676a(interfaceC7376d2);
                        iVar.f30296y = objM30460b2;
                        iVar.f30297z = C10350l.m39676a(thM30463e);
                        iVar.f30285A = null;
                        iVar.f30286B = z11;
                        iVar.f30287C = 0;
                        iVar.f30290F = 4;
                    }
                    return Unit.f29331a;
                }
                c7396x = (C7396x) objM30460b;
                if (c7396x.m30654b() == 200) {
                    String strM27103a6 = C6132y.m27103a(c7396x);
                    C6124q.m27064i("rbx.push", strM27103a6);
                    RegisterDeviceResponse registerDeviceResponseM34442a6 = RegisterDeviceResponse.INSTANCE.m34442a(new JSONObject(strM27103a6));
                    abstractC7888l1 = this.mainDispatcher;
                    jVar = new j(function4, registerDeviceResponseM34442a6, null);
                    iVar.f30291t = C10350l.m39676a(str3);
                    iVar.f30292u = C10350l.m39676a(str4);
                    iVar.f30293v = C10350l.m39676a(function4);
                    iVar.f30294w = function3;
                    iVar.f30295x = C10350l.m39676a(interfaceC7376d2);
                    iVar.f30296y = C10350l.m39676a(c7396x);
                    iVar.f30297z = C10350l.m39676a(strM27103a6);
                    iVar.f30285A = C10350l.m39676a(registerDeviceResponseM34442a6);
                    iVar.f30286B = z11;
                    iVar.f30287C = 0;
                    iVar.f30290F = 2;
                    if (C7872i.m32684g(abstractC7888l1, jVar, iVar) == objM38805e) {
                    }
                    interfaceC7376d3 = interfaceC7376d2;
                    function5 = function3;
                    function6 = function4;
                    str5 = str4;
                    str6 = str3;
                    objM30460b2 = C7347n.m30460b(Unit.f29331a);
                } else {
                    abstractC7888l0 = this.mainDispatcher;
                    kVar = new k(function3, null);
                    iVar.f30291t = C10350l.m39676a(str3);
                    iVar.f30292u = C10350l.m39676a(str4);
                    iVar.f30293v = C10350l.m39676a(function4);
                    iVar.f30294w = function3;
                    iVar.f30295x = C10350l.m39676a(interfaceC7376d2);
                    iVar.f30296y = C10350l.m39676a(c7396x);
                    iVar.f30286B = z11;
                    iVar.f30287C = 0;
                    iVar.f30290F = 3;
                    if (C7872i.m32684g(abstractC7888l0, kVar, iVar) == objM38805e) {
                        interfaceC7376d3 = interfaceC7376d2;
                        function5 = function3;
                        function6 = function4;
                        str5 = str4;
                        str6 = str3;
                        objM30460b2 = C7347n.m30460b(Unit.f29331a);
                    }
                }
                str4 = str5;
                str3 = str6;
                function3 = function5;
                function4 = function6;
                interfaceC7376d2 = interfaceC7376d3;
                thM30463e = C7347n.m30463e(objM30460b2);
                if (thM30463e != null) {
                    C6124q.m27061f("rbx.push", "Error trying to register notification token", thM30463e);
                    AbstractC7888l0 abstractC7888l14 = this.mainDispatcher;
                    l lVar13 = new l(function3, null);
                    iVar.f30291t = C10350l.m39676a(str3);
                    iVar.f30292u = C10350l.m39676a(str4);
                    iVar.f30293v = C10350l.m39676a(function4);
                    iVar.f30294w = C10350l.m39676a(function3);
                    iVar.f30295x = C10350l.m39676a(interfaceC7376d2);
                    iVar.f30296y = objM30460b2;
                    iVar.f30297z = C10350l.m39676a(thM30463e);
                    iVar.f30285A = null;
                    iVar.f30286B = z11;
                    iVar.f30287C = 0;
                    iVar.f30290F = 4;
                }
                return Unit.f29331a;
                return objM38805e;
            }
        } catch (Throwable th10) {
            th = th10;
            function2 = function1;
        }
        return objM38805e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C8153a(@NotNull AbstractC7888l0 ioDispatcher, @NotNull AbstractC7888l0 mainDispatcher, @NotNull InterfaceC13830j notificationPlatform, @NotNull C11370y implementations, @NotNull String deviceName) {
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        Intrinsics.checkNotNullParameter(mainDispatcher, "mainDispatcher");
        Intrinsics.checkNotNullParameter(notificationPlatform, "notificationPlatform");
        Intrinsics.checkNotNullParameter(implementations, "implementations");
        Intrinsics.checkNotNullParameter(deviceName, "deviceName");
        this.mainDispatcher = mainDispatcher;
        this.notificationPlatform = notificationPlatform;
        this.implementations = implementations;
        this.deviceName = deviceName;
        this.serviceScope = C7910q0.m32885a(C7948z2.m32943b(null, 1, null).plus(ioDispatcher));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C8153a(AbstractC7888l0 abstractC7888l0, AbstractC7888l0 abstractC7888l1, InterfaceC13830j interfaceC13830j, C11370y c11370y, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        abstractC7888l0 = (i10 & 1) != 0 ? C7864g1.m32644b() : abstractC7888l0;
        abstractC7888l1 = (i10 & 2) != 0 ? C7864g1.m32645c() : abstractC7888l1;
        if ((i10 & 4) != 0) {
            interfaceC13830j = C12225g.m45326d().mo45321g();
            Intrinsics.checkNotNullExpressionValue(interfaceC13830j, "notifications(...)");
        }
        if ((i10 & 8) != 0) {
            c11370y = C11370y.m42581h();
            Intrinsics.checkNotNullExpressionValue(c11370y, "getInstance(...)");
        }
        if ((i10 & 16) != 0) {
            str = C5160a.m23998b(false);
            Intrinsics.checkNotNullExpressionValue(str, "getDeviceName(...)");
        }
        String str2 = str;
        this(abstractC7888l0, abstractC7888l1, interfaceC13830j, c11370y, str2);
    }
}
