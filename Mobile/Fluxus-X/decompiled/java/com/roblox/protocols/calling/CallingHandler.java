package com.roblox.protocols.calling;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.Keep;
import av.d2;
import av.g1;
import av.g3;
import av.h2;
import av.k;
import av.p0;
import av.q0;
import av.w0;
import av.z2;
import com.github.luben.zstd.BuildConfig;
import com.roblox.protocols.calling.CallingHandler;
import com.roblox.protocols.callingplatforminterface.generated.CallingState;
import com.roblox.protocols.callingplatforminterface.generated.CallingStatus;
import com.roblox.protocols.callingplatforminterface.generated.ICallingCoreListener;
import com.roblox.protocols.callingplatforminterface.generated.IPlatformCalling;
import gu.l;
import gu.m;
import ok.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.text.StringsKt;
import pu.n;
import rj.b0;
import ul.ActiveCall;
import ul.h0;
import ul.j;
import zt.h;
import zt.i;
import zt.o;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0013\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\f\u0010\u000bJ+\u0010\u0010\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001c\u0010\u000bJ\u001f\u0010\u001d\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001d\u0010\u0014J\u001d\u0010 \u001a\u00020\t2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0\u001eH\u0002¢\u0006\u0004\b \u0010!J:\u0010+\u001a\u0004\u0018\u00010&2\u0006\u0010#\u001a\u00020\"2\u001e\u0010(\u001a\u001a\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010&0%\u0012\u0006\u0012\u0004\u0018\u00010'0$H\u0081@¢\u0006\u0004\b)\u0010*J\u001f\u00100\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010-\u001a\u00020,H\u0001¢\u0006\u0004\b.\u0010/J\u0017\u00103\u001a\u00020\t2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b5\u0010\u0016J!\u00109\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\r2\b\u00106\u001a\u0004\u0018\u00010&H\u0001¢\u0006\u0004\b7\u00108J\u0017\u0010;\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\rH\u0000¢\u0006\u0004\b:\u0010\u0016J\u0017\u0010=\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\rH\u0000¢\u0006\u0004\b<\u0010\u0016J\u000f\u0010?\u001a\u00020\tH\u0001¢\u0006\u0004\b>\u0010\u0003R\u0014\u0010@\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010B\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\bB\u0010AR\u001a\u0010D\u001a\u00020C8\u0000X\u0081T¢\u0006\f\n\u0004\bD\u0010E\u0012\u0004\bF\u0010\u0003R\u0018\u0010G\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010J\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u001b\u0010P\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u001b\u0010S\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bQ\u0010M\u001a\u0004\bR\u0010OR\u0018\u0010U\u001a\u0004\u0018\u00010T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR6\u0010W\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010I0$8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bW\u0010X\u0012\u0004\b]\u0010\u0003\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\RN\u0010_\u001a(\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020C\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010&\u0012\u0004\u0012\u00020\t0$\u0012\u0004\u0012\u00020\t0^8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b_\u0010`\u0012\u0004\be\u0010\u0003\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR.\u0010f\u001a\b\u0012\u0004\u0012\u00020\u00040\u001e8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bf\u0010g\u0012\u0004\bk\u0010\u0003\u001a\u0004\bh\u0010i\"\u0004\bj\u0010!R\"\u0010l\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bn\u0010\u0006\"\u0004\bo\u0010p¨\u0006q"}, d2 = {"Lcom/roblox/protocols/calling/CallingHandler;", "Lcom/roblox/protocols/callingplatforminterface/generated/IPlatformCalling;", "<init>", "()V", BuildConfig.FLAVOR, "isCallingEnabled", "()Z", "Landroid/content/Context;", "context", BuildConfig.FLAVOR, "setup", "(Landroid/content/Context;)V", "setupAsync", BuildConfig.FLAVOR, "callData", "callerName", "onIncomingCallPush", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "callId", "ring", "(Landroid/content/Context;Ljava/lang/String;)V", "alertIfReady", "(Ljava/lang/String;)V", "startOngoingCall", BuildConfig.FLAVOR, "cause", "endCall", "(Ljava/lang/String;I)V", "followCalls", "loadAvatar", "Lkotlin/Function0;", "block", "onMainThread", "(Lkotlin/jvm/functions/Function0;)V", "Lav/p0;", "scope", "Lkotlin/Function1;", "Leu/b;", "Landroid/graphics/Bitmap;", BuildConfig.FLAVOR, "load", "loadAvatarWithTimeout$NativeShell_googleProdRelease", "(Lav/p0;Lkotlin/jvm/functions/Function1;Leu/b;)Ljava/lang/Object;", "loadAvatarWithTimeout", "Lcom/roblox/protocols/calling/a;", "call", "forwardIncomingCallToEngine$NativeShell_googleProdRelease", "(Landroid/content/Context;Lcom/roblox/protocols/calling/a;)V", "forwardIncomingCallToEngine", "Lcom/roblox/protocols/callingplatforminterface/generated/CallingState;", "state", "onCallingStateChange", "(Lcom/roblox/protocols/callingplatforminterface/generated/CallingState;)V", "onCallingRemoved", "avatar", "onAvatarLoaded$NativeShell_googleProdRelease", "(Ljava/lang/String;Landroid/graphics/Bitmap;)V", "onAvatarLoaded", "answerCall$NativeShell_googleProdRelease", "answerCall", "declineCall$NativeShell_googleProdRelease", "declineCall", "resetForTest$NativeShell_googleProdRelease", "resetForTest", "TAG", "Ljava/lang/String;", "END_REASON_USER", BuildConfig.FLAVOR, "AVATAR_TIMEOUT_MS", "J", "getAVATAR_TIMEOUT_MS$NativeShell_googleProdRelease$annotations", "appContext", "Landroid/content/Context;", "Lcom/roblox/protocols/callingplatforminterface/generated/ICallingCoreListener;", "coreListener", "Lcom/roblox/protocols/callingplatforminterface/generated/ICallingCoreListener;", "mainScope$delegate", "Lzt/h;", "getMainScope", "()Lav/p0;", "mainScope", "ioScope$delegate", "getIoScope", "ioScope", "Lav/d2;", "surfaces", "Lav/d2;", "coreListenerFactory", "Lkotlin/jvm/functions/Function1;", "getCoreListenerFactory$NativeShell_googleProdRelease", "()Lkotlin/jvm/functions/Function1;", "setCoreListenerFactory$NativeShell_googleProdRelease", "(Lkotlin/jvm/functions/Function1;)V", "getCoreListenerFactory$NativeShell_googleProdRelease$annotations", "Lkotlin/Function3;", "fetchAvatar", "Lpu/n;", "getFetchAvatar$NativeShell_googleProdRelease", "()Lpu/n;", "setFetchAvatar$NativeShell_googleProdRelease", "(Lpu/n;)V", "getFetchAvatar$NativeShell_googleProdRelease$annotations", "engineFlagsLoaded", "Lkotlin/jvm/functions/Function0;", "getEngineFlagsLoaded$NativeShell_googleProdRelease", "()Lkotlin/jvm/functions/Function0;", "setEngineFlagsLoaded$NativeShell_googleProdRelease", "getEngineFlagsLoaded$NativeShell_googleProdRelease$annotations", "debugForceCallingEnabled", "Z", "getDebugForceCallingEnabled", "setDebugForceCallingEnabled", "(Z)V", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CallingHandler extends IPlatformCalling {
    public static final long AVATAR_TIMEOUT_MS = 2000;

    @NotNull
    private static final String END_REASON_USER = "NativeEndAction";

    @NotNull
    private static final String TAG = "CallingHandler";

    @Nullable
    private static volatile Context appContext;

    @Nullable
    private static volatile ICallingCoreListener coreListener;

    @Nullable
    private static d2 surfaces;

    @NotNull
    public static final CallingHandler INSTANCE = new CallingHandler();

    /* JADX INFO: renamed from: mainScope$delegate, reason: from kotlin metadata */
    @NotNull
    private static final h mainScope = i.a(new Function0() { // from class: ul.o
        @Override // p001kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CallingHandler.mainScope_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: ioScope$delegate, reason: from kotlin metadata */
    @NotNull
    private static final h ioScope = i.a(new Function0() { // from class: ul.p
        @Override // p001kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CallingHandler.ioScope_delegate$lambda$0();
        }
    });

    @NotNull
    private static Function1<? super IPlatformCalling, ? extends ICallingCoreListener> coreListenerFactory = new Function1() { // from class: ul.q
        @Override // p001kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return CallingHandler.coreListenerFactory$lambda$0((IPlatformCalling) obj);
        }
    };

    @NotNull
    private static n<? super Context, ? super Long, ? super Function1<? super Bitmap, Unit>, Unit> fetchAvatar = new n() { // from class: ul.r
        @Override // pu.n
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return CallingHandler.fetchAvatar$lambda$0((Context) obj, ((Long) obj2).longValue(), (Function1) obj3);
        }
    };

    @NotNull
    private static Function0<Boolean> engineFlagsLoaded = new Function0() { // from class: ul.s
        @Override // p001kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(com.roblox.client.startup.a.m());
        }
    };
    private static volatile boolean debugForceCallingEnabled = true;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9677a;

        static {
            int[] iArr = new int[CallingStatus.values().length];
            try {
                iArr[CallingStatus.RINGING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CallingStatus.CONNECTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CallingStatus.CONNECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CallingStatus.MISSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CallingStatus.DECLINED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CallingStatus.CANCELED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CallingStatus.ENDED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[CallingStatus.SUPPRESSED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[CallingStatus.FAILED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[CallingStatus.ANSWERED_ELSEWHERE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[CallingStatus.DIALING_ELSEWHERE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[CallingStatus.DECLINED_ELSEWHERE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[CallingStatus.MISSED_ELSEWHERE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[CallingStatus.CANCELED_ELSEWHERE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            f9677a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.roblox.protocols.calling.CallingHandler$fetchAvatar$1$1", f = "CallingHandler.kt", l = {61}, m = "invokeSuspend", v = 1)
    public static final class b extends m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f9678t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f9679u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Function1<Bitmap, Unit> f9680v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Context f9681w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ long f9682x;

        @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", "Landroid/graphics/Bitmap;"}, k = 3, mv = {2, 2, 0}, xi = 48)
        @gu.f(c = "com.roblox.protocols.calling.CallingHandler$fetchAvatar$1$1$1", f = "CallingHandler.kt", l = {61}, m = "invokeSuspend", v = 1)
        public static final class a extends m implements Function1<eu.b<? super Bitmap>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f9683t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ Context f9684u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ long f9685v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Context context, long j10, eu.b<? super a> bVar) {
                super(1, bVar);
                this.f9684u = context;
                this.f9685v = j10;
            }

            @Override // gu.a
            public final eu.b<Unit> create(eu.b<?> bVar) {
                return new a(this.f9684u, this.f9685v, bVar);
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                Object objE = fu.c.e();
                int i10 = this.f9683t;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                    return obj;
                }
                o.b(obj);
                b0 b0Var = b0.f30739a;
                Context context = this.f9684u;
                long j10 = this.f9685v;
                this.f9683t = 1;
                Object objD = b0Var.d(context, j10, this);
                return objD == objE ? objE : objD;
            }

            @Override // p001kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public final Object invoke(eu.b<? super Bitmap> bVar) {
                return ((a) create(bVar)).invokeSuspend(Unit.f21506a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function1<? super Bitmap, Unit> function1, Context context, long j10, eu.b<? super b> bVar) {
            super(2, bVar);
            this.f9680v = function1;
            this.f9681w = context;
            this.f9682x = j10;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new b(this.f9680v, this.f9681w, this.f9682x, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Function1 function1;
            Object objE = fu.c.e();
            int i10 = this.f9679u;
            if (i10 == 0) {
                o.b(obj);
                Function1<Bitmap, Unit> function2 = this.f9680v;
                CallingHandler callingHandler = CallingHandler.INSTANCE;
                p0 ioScope = callingHandler.getIoScope();
                a aVar = new a(this.f9681w, this.f9682x, null);
                this.f9678t = function2;
                this.f9679u = 1;
                Object objLoadAvatarWithTimeout$NativeShell_googleProdRelease = callingHandler.loadAvatarWithTimeout$NativeShell_googleProdRelease(ioScope, aVar, this);
                if (objLoadAvatarWithTimeout$NativeShell_googleProdRelease == objE) {
                    return objE;
                }
                function1 = function2;
                obj = objLoadAvatarWithTimeout$NativeShell_googleProdRelease;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function1 = (Function1) this.f9678t;
                o.b(obj);
            }
            function1.invoke(obj);
            return Unit.f21506a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.roblox.protocols.calling.CallingHandler$followCalls$1", f = "CallingHandler.kt", l = {230}, m = "invokeSuspend", v = 1)
    public static final class c extends m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f9686t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Context f9687u;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements dv.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Context f9688a;

            public a(Context context) {
                this.f9688a = context;
            }

            @Override // dv.i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(ActiveCall activeCall, eu.b<? super Unit> bVar) {
                ul.i.f33541a.j(this.f9688a, activeCall);
                if (activeCall.m()) {
                    ul.d.f33495a.e(activeCall.getCallId());
                }
                return Unit.f21506a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, eu.b<? super c> bVar) {
            super(2, bVar);
            this.f9687u = context;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new c(this.f9687u, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f9686t;
            if (i10 == 0) {
                o.b(obj);
                dv.h<ActiveCall> hVarH = ul.d.f33495a.h();
                a aVar = new a(this.f9687u);
                this.f9686t = 1;
                if (hVarH.collect(aVar, this) == objE) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", "Landroid/graphics/Bitmap;", "<anonymous>", "(Lav/p0;)Landroid/graphics/Bitmap;"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.roblox.protocols.calling.CallingHandler$loadAvatarWithTimeout$2", f = "CallingHandler.kt", l = {71}, m = "invokeSuspend", v = 1)
    public static final class d extends m implements Function2<p0, eu.b<? super Bitmap>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f9689t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ w0<Bitmap> f9690u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(w0<Bitmap> w0Var, eu.b<? super d> bVar) {
            super(2, bVar);
            this.f9690u = w0Var;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new d(this.f9690u, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Bitmap> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f9689t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                return obj;
            }
            o.b(obj);
            w0<Bitmap> w0Var = this.f9690u;
            this.f9689t = 1;
            Object objY = w0Var.y(this);
            return objY == objE ? objE : objY;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", "Landroid/graphics/Bitmap;", "<anonymous>", "(Lav/p0;)Landroid/graphics/Bitmap;"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.roblox.protocols.calling.CallingHandler$loadAvatarWithTimeout$avatar$1", f = "CallingHandler.kt", l = {70}, m = "invokeSuspend", v = 1)
    public static final class e extends m implements Function2<p0, eu.b<? super Bitmap>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f9691t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f9692u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f9693v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f9694w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ Function1<eu.b<? super Bitmap>, Object> f9695x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(Function1<? super eu.b<? super Bitmap>, ? extends Object> function1, eu.b<? super e> bVar) {
            super(2, bVar);
            this.f9695x = function1;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            e eVar = new e(this.f9695x, bVar);
            eVar.f9694w = obj;
            return eVar;
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Bitmap> bVar) {
            return ((e) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objB;
            p0 p0Var = (p0) this.f9694w;
            Object objE = fu.c.e();
            int i10 = this.f9693v;
            try {
                if (i10 == 0) {
                    o.b(obj);
                    Function1<eu.b<? super Bitmap>, Object> function1 = this.f9695x;
                    zt.n.Companion companion = zt.n.INSTANCE;
                    this.f9694w = l.a(p0Var);
                    this.f9691t = l.a(p0Var);
                    this.f9692u = 0;
                    this.f9693v = 1;
                    obj = function1.invoke(this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                }
                objB = zt.n.b((Bitmap) obj);
            } catch (Throwable th2) {
                zt.n.Companion companion2 = zt.n.INSTANCE;
                objB = zt.n.b(o.a(th2));
            }
            if (zt.n.g(objB)) {
                return null;
            }
            return objB;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.roblox.protocols.calling.CallingHandler$onMainThread$1", f = "CallingHandler.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class f extends m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f9696t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f9697u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Function0<Unit> function0, eu.b<? super f> bVar) {
            super(2, bVar);
            this.f9697u = function0;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new f(this.f9697u, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((f) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            fu.c.e();
            if (this.f9696t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            this.f9697u.invoke();
            return Unit.f21506a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.roblox.protocols.calling.CallingHandler$setupAsync$1", f = "CallingHandler.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class g extends m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f9698t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Context f9699u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Context context, eu.b<? super g> bVar) {
            super(2, bVar);
            this.f9699u = context;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new g(this.f9699u, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((g) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            fu.c.e();
            if (this.f9698t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            Context context = this.f9699u;
            Intrinsics.checkNotNull(context);
            CallingHandler.setup(context);
            return Unit.f21506a;
        }
    }

    private CallingHandler() {
    }

    private final void alertIfReady(String callId) {
        ul.d.f33495a.m(callId, new Function1() { // from class: ul.z
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(CallingHandler.alertIfReady$lambda$0((ActiveCall) obj));
            }
        }, new Function1() { // from class: ul.a0
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CallingHandler.alertIfReady$lambda$1((ActiveCall) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean alertIfReady$lambda$0(ActiveCall it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.l(h0.WAITING_FOR_AVATAR) && it.getAvatarLoad() == ul.e.DONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ActiveCall alertIfReady$lambda$1(ActiveCall it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return ActiveCall.b(it, null, 0, 0, null, null, null, h0.ALERTING, null, null, 447, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ICallingCoreListener coreListenerFactory$lambda$0(IPlatformCalling it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return ICallingCoreListener.setPlatformImpl(it);
    }

    private final void endCall(String callId, final int cause) {
        ul.d.f33495a.f(callId, new Function1() { // from class: ul.y
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CallingHandler.endCall$lambda$0(cause, (ActiveCall) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ActiveCall endCall$lambda$0(int i10, ActiveCall it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return ActiveCall.b(it, null, 0, 0, null, null, (i10 != 5 || it.getPhase() == j.ONGOING) ? j.ENDED : j.MISSED, null, null, null, 479, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fetchAvatar$lambda$0(Context context, long j10, Function1 onResult) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        k.d(INSTANCE.getIoScope(), null, null, new b(onResult, context, j10, null), 3, null);
        return Unit.f21506a;
    }

    private final void followCalls(Context context) {
        d2 d2Var = surfaces;
        if (d2Var == null || !d2Var.b()) {
            surfaces = k.d(getMainScope(), null, null, new c(context, null), 3, null);
        }
    }

    public static /* synthetic */ void getAVATAR_TIMEOUT_MS$NativeShell_googleProdRelease$annotations() {
    }

    public static /* synthetic */ void getCoreListenerFactory$NativeShell_googleProdRelease$annotations() {
    }

    public static /* synthetic */ void getEngineFlagsLoaded$NativeShell_googleProdRelease$annotations() {
    }

    public static /* synthetic */ void getFetchAvatar$NativeShell_googleProdRelease$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p0 getIoScope() {
        return (p0) ioScope.getValue();
    }

    private final p0 getMainScope() {
        return (p0) mainScope.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p0 ioScope_delegate$lambda$0() {
        return q0.a(z2.b(null, 1, null).plus(g1.b()));
    }

    @Keep
    public static final boolean isCallingEnabled() {
        return false;
    }

    private final void loadAvatar(Context context, final String callId) {
        Long callerUserId;
        ActiveCall activeCallM = ul.d.f33495a.m(callId, new Function1() { // from class: ul.b0
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(CallingHandler.loadAvatar$lambda$0((ActiveCall) obj));
            }
        }, new Function1() { // from class: ul.c0
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CallingHandler.loadAvatar$lambda$1((ActiveCall) obj);
            }
        });
        if (activeCallM == null || (callerUserId = activeCallM.getCallerUserId()) == null) {
            return;
        }
        fetchAvatar.invoke(context, callerUserId, new Function1() { // from class: ul.d0
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CallingHandler.loadAvatar$lambda$2(callId, (Bitmap) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean loadAvatar$lambda$0(ActiveCall it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getAvatarLoad() == ul.e.NOT_STARTED;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ActiveCall loadAvatar$lambda$1(ActiveCall it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return ActiveCall.b(it, null, 0, 0, null, null, null, null, null, it.getCallerUserId() != null ? ul.e.LOADING : ul.e.DONE, 255, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadAvatar$lambda$2(final String str, final Bitmap bitmap) {
        INSTANCE.onMainThread(new Function0() { // from class: ul.u
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CallingHandler.loadAvatar$lambda$2$0(str, bitmap);
            }
        });
        return Unit.f21506a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadAvatar$lambda$2$0(String str, Bitmap bitmap) {
        INSTANCE.onAvatarLoaded$NativeShell_googleProdRelease(str, bitmap);
        return Unit.f21506a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p0 mainScope_delegate$lambda$0() {
        return q0.a(z2.b(null, 1, null).plus(g1.c().getImmediate()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ActiveCall onAvatarLoaded$lambda$0(Bitmap bitmap, ActiveCall it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return ActiveCall.b(it, null, 0, 0, null, null, null, null, bitmap, ul.e.DONE, 127, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCallingRemoved$lambda$0(String str) {
        INSTANCE.endCall(str, 2);
        return Unit.f21506a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCallingStateChange$lambda$0(CallingState callingState) {
        Context context = appContext;
        if (context == null) {
            return Unit.f21506a;
        }
        String callId = callingState.getCallId();
        CallingStatus status = callingState.getStatus();
        switch (status == null ? -1 : a.f9677a[status.ordinal()]) {
            case 1:
                CallingHandler callingHandler = INSTANCE;
                ul.d dVar = ul.d.f33495a;
                Intrinsics.checkNotNull(callId);
                callingHandler.ring(context, dVar.i(callId).getCallId());
                break;
            case 2:
            case 3:
                CallingHandler callingHandler2 = INSTANCE;
                ul.d dVar2 = ul.d.f33495a;
                Intrinsics.checkNotNull(callId);
                callingHandler2.startOngoingCall(dVar2.i(callId).getCallId());
                break;
            case 4:
                CallingHandler callingHandler3 = INSTANCE;
                Intrinsics.checkNotNull(callId);
                callingHandler3.endCall(callId, 5);
                break;
            case 5:
                CallingHandler callingHandler4 = INSTANCE;
                Intrinsics.checkNotNull(callId);
                callingHandler4.endCall(callId, 6);
                break;
            case 6:
                CallingHandler callingHandler5 = INSTANCE;
                Intrinsics.checkNotNull(callId);
                callingHandler5.endCall(callId, 4);
                break;
            case 7:
            case 8:
            case 9:
                CallingHandler callingHandler6 = INSTANCE;
                Intrinsics.checkNotNull(callId);
                callingHandler6.endCall(callId, 3);
                break;
            case 10:
            case 11:
                CallingHandler callingHandler7 = INSTANCE;
                Intrinsics.checkNotNull(callId);
                callingHandler7.endCall(callId, 11);
                break;
            case 12:
                CallingHandler callingHandler8 = INSTANCE;
                Intrinsics.checkNotNull(callId);
                callingHandler8.endCall(callId, 6);
                break;
            case 13:
            case 14:
                CallingHandler callingHandler9 = INSTANCE;
                Intrinsics.checkNotNull(callId);
                callingHandler9.endCall(callId, 4);
                break;
        }
        return Unit.f21506a;
    }

    public static final void onIncomingCallPush(@NotNull Context context, @Nullable String callData, @Nullable String callerName) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (!isCallingEnabled()) {
            q.h(TAG, "calling is off; dropping call push");
            return;
        }
        IncomingCall incomingCallB = callData != null ? IncomingCall.INSTANCE.b(StringsKt.n1(callData).toString(), callerName) : null;
        if (incomingCallB == null) {
            q.e(TAG, "call push has no callId; dropping");
        } else if (engineFlagsLoaded.invoke().booleanValue()) {
            INSTANCE.forwardIncomingCallToEngine$NativeShell_googleProdRelease(context, incomingCallB);
        } else {
            q.k(TAG, "engine flags not loaded; dropping call push");
        }
    }

    private final void onMainThread(Function0<Unit> block) {
        k.d(getMainScope(), null, null, new f(block, null), 3, null);
    }

    private final void ring(Context context, String callId) {
        if (ul.d.f33495a.m(callId, new Function1() { // from class: ul.m
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(CallingHandler.ring$lambda$0((ActiveCall) obj));
            }
        }, new Function1() { // from class: ul.n
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CallingHandler.ring$lambda$1((ActiveCall) obj);
            }
        }) == null) {
            return;
        }
        loadAvatar(context, callId);
        alertIfReady(callId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ring$lambda$0(ActiveCall it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.l(h0.WAITING_FOR_TURN);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ActiveCall ring$lambda$1(ActiveCall it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return ActiveCall.b(it, null, 0, 0, null, null, null, h0.WAITING_FOR_AVATAR, null, null, 447, null);
    }

    public static final synchronized void setup(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (isCallingEnabled()) {
            appContext = context.getApplicationContext();
            ul.i.f33541a.d(context);
            CallingHandler callingHandler = INSTANCE;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            callingHandler.followCalls(applicationContext);
            if (coreListener == null) {
                coreListener = coreListenerFactory.invoke(callingHandler);
            }
        }
    }

    public static final void setupAsync(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        k.d(INSTANCE.getIoScope(), null, null, new g(context.getApplicationContext(), null), 3, null);
    }

    private final void startOngoingCall(String callId) {
        ul.d.f33495a.m(callId, new Function1() { // from class: ul.v
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(CallingHandler.startOngoingCall$lambda$0((ActiveCall) obj));
            }
        }, new Function1() { // from class: ul.w
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CallingHandler.startOngoingCall$lambda$1((ActiveCall) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean startOngoingCall$lambda$0(ActiveCall it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getPhase() == j.RINGING;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ActiveCall startOngoingCall$lambda$1(ActiveCall it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return ActiveCall.b(it, null, 0, 0, null, null, j.ONGOING, null, null, null, 479, null);
    }

    public final void answerCall$NativeShell_googleProdRelease(@NotNull String callId) {
        Intrinsics.checkNotNullParameter(callId, "callId");
        ICallingCoreListener iCallingCoreListener = coreListener;
        if (iCallingCoreListener == null) {
            return;
        }
        iCallingCoreListener.answerIncomingCall(callId);
        startOngoingCall(callId);
    }

    public final void declineCall$NativeShell_googleProdRelease(@NotNull String callId) {
        Intrinsics.checkNotNullParameter(callId, "callId");
        ICallingCoreListener iCallingCoreListener = coreListener;
        if (iCallingCoreListener != null) {
            iCallingCoreListener.endCall(callId, END_REASON_USER);
        }
    }

    public final void forwardIncomingCallToEngine$NativeShell_googleProdRelease(@NotNull Context context, @NotNull IncomingCall call) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(call, "call");
        setup(context);
        ICallingCoreListener iCallingCoreListener = coreListener;
        if (iCallingCoreListener == null) {
            return;
        }
        ul.d dVar = ul.d.f33495a;
        ActiveCall activeCallB = dVar.b(dVar.j(call.getCallId(), call.getCallerUserId(), call.getCallerName()));
        if (activeCallB == null) {
            q.h(TAG, "duplicate push for live call " + call.getCallId() + "; dropping");
            return;
        }
        try {
            iCallingCoreListener.receiveIncomingCall(call.getCallData());
        } catch (RuntimeException e10) {
            q.e(TAG, "engine didn't take call " + call.getCallId() + ": " + e10.getMessage());
            ul.d.f33495a.d(activeCallB);
        }
    }

    @NotNull
    public final Function1<IPlatformCalling, ICallingCoreListener> getCoreListenerFactory$NativeShell_googleProdRelease() {
        return coreListenerFactory;
    }

    public final boolean getDebugForceCallingEnabled() {
        return debugForceCallingEnabled;
    }

    @NotNull
    public final Function0<Boolean> getEngineFlagsLoaded$NativeShell_googleProdRelease() {
        return engineFlagsLoaded;
    }

    @NotNull
    public final n<Context, Long, Function1<? super Bitmap, Unit>, Unit> getFetchAvatar$NativeShell_googleProdRelease() {
        return fetchAvatar;
    }

    @Nullable
    public final Object loadAvatarWithTimeout$NativeShell_googleProdRelease(@NotNull p0 p0Var, @NotNull Function1<? super eu.b<? super Bitmap>, ? extends Object> function1, @NotNull eu.b<? super Bitmap> bVar) {
        return g3.e(AVATAR_TIMEOUT_MS, new d(k.b(p0Var, null, null, new e(function1, null), 3, null), null), bVar);
    }

    public final void onAvatarLoaded$NativeShell_googleProdRelease(@NotNull String callId, @Nullable final Bitmap avatar) {
        Intrinsics.checkNotNullParameter(callId, "callId");
        if (ul.d.n(ul.d.f33495a, callId, null, new Function1() { // from class: ul.l
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CallingHandler.onAvatarLoaded$lambda$0(avatar, (ActiveCall) obj);
            }
        }, 2, null) == null) {
            return;
        }
        alertIfReady(callId);
    }

    @Override // com.roblox.protocols.callingplatforminterface.generated.IPlatformCalling
    public void onCallingRemoved(@NotNull final String callId) {
        Intrinsics.checkNotNullParameter(callId, "callId");
        onMainThread(new Function0() { // from class: ul.x
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CallingHandler.onCallingRemoved$lambda$0(callId);
            }
        });
    }

    @Override // com.roblox.protocols.callingplatforminterface.generated.IPlatformCalling
    public void onCallingStateChange(@NotNull final CallingState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        onMainThread(new Function0() { // from class: ul.t
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CallingHandler.onCallingStateChange$lambda$0(state);
            }
        });
    }

    public final void resetForTest$NativeShell_googleProdRelease() {
        appContext = null;
        coreListener = null;
        h2.f(getMainScope().getCoroutineContext(), null, 1, null);
        surfaces = null;
        ul.d.f33495a.c();
        ul.i.f33541a.i();
        debugForceCallingEnabled = true;
    }

    public final void setCoreListenerFactory$NativeShell_googleProdRelease(@NotNull Function1<? super IPlatformCalling, ? extends ICallingCoreListener> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        coreListenerFactory = function1;
    }

    public final void setDebugForceCallingEnabled(boolean z10) {
        debugForceCallingEnabled = z10;
    }

    public final void setEngineFlagsLoaded$NativeShell_googleProdRelease(@NotNull Function0<Boolean> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        engineFlagsLoaded = function0;
    }

    public final void setFetchAvatar$NativeShell_googleProdRelease(@NotNull n<? super Context, ? super Long, ? super Function1<? super Bitmap, Unit>, Unit> nVar) {
        Intrinsics.checkNotNullParameter(nVar, "<set-?>");
        fetchAvatar = nVar;
    }
}
