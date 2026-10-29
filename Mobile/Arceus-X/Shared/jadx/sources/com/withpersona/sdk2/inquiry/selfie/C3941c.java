package com.withpersona.sdk2.inquiry.selfie;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.p616lifecycle.AbstractC0968m;
import androidx.p616lifecycle.C0982t;
import androidx.p616lifecycle.InterfaceC0954f;
import androidx.p616lifecycle.InterfaceC0980s;
import aq.C1137a;
import com.withpersona.sdk2.camera.C3401a;
import com.withpersona.sdk2.camera.InterfaceC3404d;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.selfie.C3941c;
import com.withpersona.sdk2.inquiry.selfie.view.OldSelfieOverlayView;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.p055ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.SelfieCaptureState;
import com.withpersona.sdk2.inquiry.tracking.model.SelfieCaptureStateEventData;
import hn.C6459o0;
import ir.C6966c;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C7764d;
import kotlin.text.StringsKt;
import nu.C9579j;
import nu.InterfaceC9575h;
import nu.InterfaceC9577i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p016an.InterfaceC0382k;
import p016an.ViewEnvironment;
import p132fn.C5686h0;
import p132fn.C5694l0;
import p132fn.C5696m0;
import p132fn.C5698n0;
import p132fn.C5714v0;
import p132fn.InterfaceC5683g;
import p226jq.C7259g;
import p227jr.C7304h0;
import p229jt.C7345l;
import p229jt.C7347n;
import p229jt.C7348o;
import p256ku.AbstractC7900n2;
import p256ku.C7864g1;
import p256ku.C7882k;
import p256ku.C7946z0;
import p256ku.InterfaceC7850d2;
import p256ku.InterfaceC7906p0;
import p261l2.C7975b;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p497vp.C12239b;
import p497vp.C12244g;
import p498vq.C12249c;
import p526wq.C12524g;
import pt.AbstractC10351m;
import pt.C10340b;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001c\u001a\u00020\r*\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010 \u001a\u00020\u001f*\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010-\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R*\u00103\u001a\u0016\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\r\u0018\u00010.j\u0004\u0018\u0001`08\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u001e\u00107\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u00109\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010,R\u0014\u0010=\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006>"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/c;", "Lan/k;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c;", "Laq/a;", "binding", "Lfn/g;", "cameraController", "Lfn/n0;", "selfieDirectionFeed", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "<init>", "(Laq/a;Lfn/g;Lfn/n0;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V", "", "v", "()V", "rendering", "Lan/y;", "viewEnvironment", "w", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c;Lan/y;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "styles", "u", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;)V", "Landroid/widget/TextView;", "", "scale", "s", "(Landroid/widget/TextView;F)V", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView$b;", "H", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;)Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView$b;", "b", "Laq/a;", "c", "Lfn/g;", "d", "Lfn/n0;", "e", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "Lku/d2;", "f", "Lku/d2;", "maxRecordingLimitJob", "Lkotlin/Function1;", "", "Lcom/withpersona/sdk2/inquiry/selfie/CameraErrorHandler;", "g", "Lkotlin/jvm/functions/Function1;", "currentErrorHandler", "Lkotlin/Function0;", "h", "Lkotlin/jvm/functions/Function0;", "permissionChangedHandler", "i", "cameraStateListenerJob", "", "j", "I", "confirmConst", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C3941c implements InterfaceC0382k<SelfieWorkflow.AbstractC3928c.c> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C1137a binding;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC5683g cameraController;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final C5698n0 selfieDirectionFeed;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public InterfaceC7850d2 maxRecordingLimitJob;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public Function1<? super Throwable, Unit> currentErrorHandler;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public Function0<Unit> permissionChangedHandler;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public InterfaceC7850d2 cameraStateListenerJob;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public final int confirmConst;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.c$a */
    @Metadata(m31664d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m31665d2 = {"com/withpersona/sdk2/inquiry/selfie/c$a", "Landroidx/lifecycle/f;", "Landroidx/lifecycle/s;", "owner", "", "onResume", "(Landroidx/lifecycle/s;)V", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a implements InterfaceC0954f {
        public a() {
        }

        /* JADX INFO: renamed from: b */
        public static final void m19976b(C3941c c3941c) {
            Function0 function0 = c3941c.permissionChangedHandler;
            if (function0 != null) {
                function0.invoke();
            }
            c3941c.m19967v();
        }

        @Override // androidx.p616lifecycle.InterfaceC0954f
        public void onCreate(InterfaceC0980s interfaceC0980s) {
            super.onCreate(interfaceC0980s);
        }

        @Override // androidx.p616lifecycle.InterfaceC0954f
        public void onDestroy(InterfaceC0980s interfaceC0980s) {
            super.onDestroy(interfaceC0980s);
        }

        @Override // androidx.p616lifecycle.InterfaceC0954f
        public void onPause(InterfaceC0980s interfaceC0980s) {
            super.onPause(interfaceC0980s);
        }

        @Override // androidx.p616lifecycle.InterfaceC0954f
        public void onResume(InterfaceC0980s owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            ConstraintLayout root = C3941c.this.binding.getRoot();
            final C3941c c3941c = C3941c.this;
            root.post(new Runnable() { // from class: yp.k
                @Override // java.lang.Runnable
                public final void run() {
                    C3941c.a.m19976b(c3941c);
                }
            });
        }

        @Override // androidx.p616lifecycle.InterfaceC0954f
        public void onStart(InterfaceC0980s interfaceC0980s) {
            super.onStart(interfaceC0980s);
        }

        @Override // androidx.p616lifecycle.InterfaceC0954f
        public void onStop(InterfaceC0980s interfaceC0980s) {
            super.onStop(interfaceC0980s);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.c$b */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f16485a;

        static {
            int[] iArr = new int[SelfieWorkflow.AbstractC3928c.c.EnumC14142c.values().length];
            try {
                iArr[SelfieWorkflow.AbstractC3928c.c.EnumC14142c.CLEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SelfieWorkflow.AbstractC3928c.c.EnumC14142c.LOOK_LEFT_HINT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SelfieWorkflow.AbstractC3928c.c.EnumC14142c.LOOK_RIGHT_HINT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SelfieWorkflow.AbstractC3928c.c.EnumC14142c.CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SelfieWorkflow.AbstractC3928c.c.EnumC14142c.LOOK_LEFT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SelfieWorkflow.AbstractC3928c.c.EnumC14142c.LOOK_RIGHT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[SelfieWorkflow.AbstractC3928c.c.EnumC14142c.LOOK_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[SelfieWorkflow.AbstractC3928c.c.EnumC14142c.LOOK_DOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[SelfieWorkflow.AbstractC3928c.c.EnumC14142c.COMPLETE_WITH_CAPTURE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[SelfieWorkflow.AbstractC3928c.c.EnumC14142c.LOOK_UP_HINT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[SelfieWorkflow.AbstractC3928c.c.EnumC14142c.LOOK_DOWN_HINT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[SelfieWorkflow.AbstractC3928c.c.EnumC14142c.CENTER_COMPLETE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[SelfieWorkflow.AbstractC3928c.c.EnumC14142c.LOOK_LEFT_COMPLETE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[SelfieWorkflow.AbstractC3928c.c.EnumC14142c.LOOK_RIGHT_COMPLETE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[SelfieWorkflow.AbstractC3928c.c.EnumC14142c.LOOK_UP_COMPLETE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[SelfieWorkflow.AbstractC3928c.c.EnumC14142c.LOOK_DOWN_COMPLETE.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[SelfieWorkflow.AbstractC3928c.c.EnumC14142c.FINALIZING.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[SelfieWorkflow.AbstractC3928c.c.EnumC14142c.COMPLETE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            f16485a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.c$c */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.selfie.OldCameraScreenRunner$registerCameraStateListener$1", m39664f = "OldCameraScreenRunner.kt", m39665l = {126}, m39666m = "invokeSuspend")
    public static final class c extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f16486t;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.c$c$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class a<T> implements InterfaceC9577i {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C3941c f16488a;

            public a(C3941c c3941c) {
                this.f16488a = c3941c;
            }

            /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object; */
            @Override // nu.InterfaceC9577i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(InterfaceC3404d interfaceC3404d, InterfaceC9557b<? super Unit> interfaceC9557b) {
                Function1 function1;
                if (Intrinsics.m31980c(interfaceC3404d, InterfaceC3404d.b.f12930a)) {
                    Function1 function2 = this.f16488a.currentErrorHandler;
                    if (function2 != null) {
                        function2.invoke(new C5714v0());
                    }
                } else if (interfaceC3404d instanceof InterfaceC3404d.Closed) {
                    InterfaceC3404d.Closed closed = (InterfaceC3404d.Closed) interfaceC3404d;
                    if (closed.getWasRecordingInterrupted() && (function1 = this.f16488a.currentErrorHandler) != null) {
                        function1.invoke(new C5694l0(closed.getIsClosedDueToBadCameraConfiguration()));
                    }
                }
                return Unit.f29331a;
            }
        }

        public c(InterfaceC9557b<? super c> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C3941c.this.new c(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f16486t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                InterfaceC9575h<InterfaceC3404d> interfaceC9575hM16191a = C3401a.m16191a(C3941c.this.cameraController.mo16218b());
                a aVar = new a(C3941c.this);
                this.f16486t = 1;
                if (interfaceC9575hM16191a.collect(aVar, this) == objM38805e) {
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
            return ((c) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.c$d */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.selfie.OldCameraScreenRunner$showRendering$1$1", m39664f = "OldCameraScreenRunner.kt", m39665l = {236, 238}, m39666m = "invokeSuspend")
    public static final class d extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f16489t;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ SelfieWorkflow.AbstractC3928c.c.b f16491v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ AbstractC0968m f16492w;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.c$d$a */
        @Metadata(m31664d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lcom/withpersona/sdk2/camera/d;", "it", "", "<anonymous>", "(Lcom/withpersona/sdk2/camera/d;)Z"}, m31666k = 3, m31667mv = {2, 2, 0})
        @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.selfie.OldCameraScreenRunner$showRendering$1$1$1", m39664f = "OldCameraScreenRunner.kt", m39665l = {}, m39666m = "invokeSuspend")
        public static final class a extends AbstractC10351m implements Function2<InterfaceC3404d, InterfaceC9557b<? super Boolean>, Object> {

            /* JADX INFO: renamed from: t */
            public int f16493t;

            /* JADX INFO: renamed from: u */
            public /* synthetic */ Object f16494u;

            public a(InterfaceC9557b<? super a> interfaceC9557b) {
                super(2, interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                a aVar = new a(interfaceC9557b);
                aVar.f16494u = obj;
                return aVar;
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                InterfaceC3404d interfaceC3404d = (InterfaceC3404d) this.f16494u;
                C10047c.m38805e();
                if (this.f16493t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                return C10340b.m39658a(!(interfaceC3404d instanceof InterfaceC3404d.Ready));
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC3404d interfaceC3404d, InterfaceC9557b<? super Boolean> interfaceC9557b) {
                return ((a) create(interfaceC3404d, interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.c$d$b */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
        @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.selfie.OldCameraScreenRunner$showRendering$1$1$2", m39664f = "OldCameraScreenRunner.kt", m39665l = {240}, m39666m = "invokeSuspend")
        public static final class b extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t */
            public int f16495t;

            /* JADX INFO: renamed from: u */
            public final /* synthetic */ SelfieWorkflow.AbstractC3928c.c.b f16496u;

            /* JADX INFO: renamed from: v */
            public final /* synthetic */ C3941c f16497v;

            /* JADX INFO: renamed from: w */
            public final /* synthetic */ AbstractC0968m f16498w;

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.c$d$b$a */
            @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
            @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.selfie.OldCameraScreenRunner$showRendering$1$1$2$1$1", m39664f = "OldCameraScreenRunner.kt", m39665l = {245, 249}, m39666m = "invokeSuspend")
            public static final class a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

                /* JADX INFO: renamed from: t */
                public int f16499t;

                /* JADX INFO: renamed from: u */
                public final /* synthetic */ SelfieWorkflow.AbstractC3928c.c.b f16500u;

                /* JADX INFO: renamed from: v */
                public final /* synthetic */ C3941c f16501v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(SelfieWorkflow.AbstractC3928c.c.b bVar, C3941c c3941c, InterfaceC9557b<? super a> interfaceC9557b) {
                    super(2, interfaceC9557b);
                    this.f16500u = bVar;
                    this.f16501v = c3941c;
                }

                @Override // pt.AbstractC10339a
                public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                    return new a(this.f16500u, this.f16501v, interfaceC9557b);
                }

                /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
                
                    if (r12 == r0) goto L19;
                 */
                @Override // pt.AbstractC10339a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    Object objMo16225i;
                    Object objM38805e = C10047c.m38805e();
                    int i10 = this.f16499t;
                    if (i10 == 0) {
                        C7348o.m30470b(obj);
                        long maxRecordingLengthMs = ((SelfieWorkflow.AbstractC3928c.c.b.g) this.f16500u).getMaxRecordingLengthMs();
                        this.f16499t = 1;
                        if (C7946z0.m32938b(maxRecordingLengthMs, this) != objM38805e) {
                        }
                        return objM38805e;
                    }
                    if (i10 == 1) {
                        C7348o.m30470b(obj);
                    } else {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C7348o.m30470b(obj);
                        objMo16225i = ((C7347n) obj).getValue();
                    }
                    if (C7347n.m30466h(objMo16225i)) {
                        ((File) objMo16225i).delete();
                    }
                    TrackingEventsLogger.logSelfieCaptureStateEvent$default(this.f16501v.trackingEventsLogger, new SelfieCaptureStateEventData(SelfieCaptureState.RECORDING_TIMED_OUT, "local_video", null, null, 8, null), false, 2, null);
                    Function1 function1 = this.f16501v.currentErrorHandler;
                    if (function1 != null) {
                        function1.invoke(new C5696m0());
                    }
                    return Unit.f29331a;
                    if (this.f16501v.cameraController.mo16218b().getValue() instanceof InterfaceC3404d.Closed) {
                        return Unit.f29331a;
                    }
                    InterfaceC5683g interfaceC5683g = this.f16501v.cameraController;
                    this.f16499t = 2;
                    objMo16225i = interfaceC5683g.mo16225i(this);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
                    return ((a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(SelfieWorkflow.AbstractC3928c.c.b bVar, C3941c c3941c, AbstractC0968m abstractC0968m, InterfaceC9557b<? super b> interfaceC9557b) {
                super(2, interfaceC9557b);
                this.f16496u = bVar;
                this.f16497v = c3941c;
                this.f16498w = abstractC0968m;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                return new b(this.f16496u, this.f16497v, this.f16498w, interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                Object objMo16226j;
                Object objM38805e = C10047c.m38805e();
                int i10 = this.f16495t;
                if (i10 == 0) {
                    C7348o.m30470b(obj);
                    if (((SelfieWorkflow.AbstractC3928c.c.b.g) this.f16496u).getRecordLocalVideo()) {
                        InterfaceC5683g interfaceC5683g = this.f16497v.cameraController;
                        this.f16495t = 1;
                        objMo16226j = interfaceC5683g.mo16226j(this);
                        if (objMo16226j == objM38805e) {
                            return objM38805e;
                        }
                    }
                    ((SelfieWorkflow.AbstractC3928c.c.b.g) this.f16496u).m19878d().invoke(this.f16497v.cameraController.mo16217a());
                    return Unit.f29331a;
                }
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                objMo16226j = ((C7347n) obj).getValue();
                C3941c c3941c = this.f16497v;
                AbstractC0968m abstractC0968m = this.f16498w;
                SelfieWorkflow.AbstractC3928c.c.b bVar = this.f16496u;
                if (C7347n.m30466h(objMo16226j) && ((Boolean) objMo16226j).booleanValue()) {
                    InterfaceC7850d2 interfaceC7850d2 = c3941c.maxRecordingLimitJob;
                    if (interfaceC7850d2 != null) {
                        InterfaceC7850d2.a.m32603a(interfaceC7850d2, null, 1, null);
                    }
                    c3941c.maxRecordingLimitJob = C7882k.m32780d(abstractC0968m, C7864g1.m32644b(), null, new a(bVar, c3941c, null), 2, null);
                }
                SelfieWorkflow.AbstractC3928c.c.b bVar2 = this.f16496u;
                Throwable thM30463e = C7347n.m30463e(objMo16226j);
                if (thM30463e != null) {
                    ((SelfieWorkflow.AbstractC3928c.c.b.g) bVar2).m19877c().invoke(thM30463e);
                }
                ((SelfieWorkflow.AbstractC3928c.c.b.g) this.f16496u).m19878d().invoke(this.f16497v.cameraController.mo16217a());
                return Unit.f29331a;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
                return ((b) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(SelfieWorkflow.AbstractC3928c.c.b bVar, AbstractC0968m abstractC0968m, InterfaceC9557b<? super d> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f16491v = bVar;
            this.f16492w = abstractC0968m;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C3941c.this.new d(this.f16491v, this.f16492w, interfaceC9557b);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
        
            if (p256ku.C7872i.m32684g(r8, r1, r7) == r0) goto L15;
         */
        @Override // pt.AbstractC10339a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f16489t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                InterfaceC9575h interfaceC9575hM37777N = C9579j.m37777N(C3941c.this.cameraController.mo16218b(), new a(null));
                this.f16489t = 1;
                if (C9579j.m37792i(interfaceC9575hM37777N, this) != objM38805e) {
                }
                return objM38805e;
            }
            if (i10 == 1) {
                C7348o.m30470b(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            return Unit.f29331a;
            AbstractC7900n2 abstractC7900n2M32645c = C7864g1.m32645c();
            b bVar = new b(this.f16491v, C3941c.this, this.f16492w, null);
            this.f16489t = 2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((d) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.c$e */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.selfie.OldCameraScreenRunner$showRendering$1$2", m39664f = "OldCameraScreenRunner.kt", m39665l = {280}, m39666m = "invokeSuspend")
    public static final class e extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f16502t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ SelfieWorkflow.AbstractC3928c.c.b f16503u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ C3941c f16504v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(SelfieWorkflow.AbstractC3928c.c.b bVar, C3941c c3941c, InterfaceC9557b<? super e> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f16503u = bVar;
            this.f16504v = c3941c;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new e(this.f16503u, this.f16504v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f16502t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                long maxRecordingLengthMs = ((SelfieWorkflow.AbstractC3928c.c.b.i) this.f16503u).getMaxRecordingLengthMs();
                this.f16502t = 1;
                if (C7946z0.m32938b(maxRecordingLengthMs, this) == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            if (this.f16504v.cameraController.mo16218b().getValue() instanceof InterfaceC3404d.Closed) {
                return Unit.f29331a;
            }
            TrackingEventsLogger.logSelfieCaptureStateEvent$default(this.f16504v.trackingEventsLogger, new SelfieCaptureStateEventData(SelfieCaptureState.RECORDING_TIMED_OUT, "webrtc", null, null, 8, null), false, 2, null);
            Function1 function1 = this.f16504v.currentErrorHandler;
            if (function1 != null) {
                function1.invoke(new C5696m0());
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((e) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.c$f */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.selfie.OldCameraScreenRunner$showRendering$1$6", m39664f = "OldCameraScreenRunner.kt", m39665l = {400}, m39666m = "invokeSuspend")
    public static final class f extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f16505t;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ SelfieWorkflow.AbstractC3928c.c.b f16507v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ SelfieWorkflow.AbstractC3928c.c f16508w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(SelfieWorkflow.AbstractC3928c.c.b bVar, SelfieWorkflow.AbstractC3928c.c cVar, InterfaceC9557b<? super f> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f16507v = bVar;
            this.f16508w = cVar;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C3941c.this.new f(this.f16507v, this.f16508w, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objMo16225i;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f16505t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                InterfaceC5683g interfaceC5683g = C3941c.this.cameraController;
                this.f16505t = 1;
                objMo16225i = interfaceC5683g.mo16225i(this);
                if (objMo16225i == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                objMo16225i = ((C7347n) obj).getValue();
            }
            SelfieWorkflow.AbstractC3928c.c.b bVar = this.f16507v;
            if (C7347n.m30466h(objMo16225i)) {
                ((SelfieWorkflow.AbstractC3928c.c.b.C14141c) bVar).m19863b().invoke((File) objMo16225i);
            }
            SelfieWorkflow.AbstractC3928c.c cVar = this.f16508w;
            Throwable thM30463e = C7347n.m30463e(objMo16225i);
            if (thM30463e != null && !(thM30463e instanceof C5686h0)) {
                cVar.m19845i().invoke(thM30463e);
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((f) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.c$g */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.selfie.OldCameraScreenRunner$showRendering$1$takePhoto$1", m39664f = "OldCameraScreenRunner.kt", m39665l = {333}, m39666m = "invokeSuspend")
    public static final class g extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f16509t;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ SelfieWorkflow.AbstractC3928c.c.b f16511v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(SelfieWorkflow.AbstractC3928c.c.b bVar, InterfaceC9557b<? super g> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f16511v = bVar;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C3941c.this.new g(this.f16511v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objMo16227k;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f16509t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                InterfaceC5683g interfaceC5683g = C3941c.this.cameraController;
                this.f16509t = 1;
                objMo16227k = interfaceC5683g.mo16227k(this);
                if (objMo16227k == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                objMo16227k = ((C7347n) obj).getValue();
            }
            SelfieWorkflow.AbstractC3928c.c.b bVar = this.f16511v;
            if (C7347n.m30466h(objMo16227k)) {
                Function1<String, Unit> function1M19869d = ((SelfieWorkflow.AbstractC3928c.c.b.d) bVar).m19869d();
                String absolutePath = ((File) objMo16227k).getAbsolutePath();
                Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
                function1M19869d.invoke(absolutePath);
            }
            SelfieWorkflow.AbstractC3928c.c.b bVar2 = this.f16511v;
            Throwable thM30463e = C7347n.m30463e(objMo16227k);
            if (thM30463e != null && !(thM30463e instanceof C6459o0)) {
                ((SelfieWorkflow.AbstractC3928c.c.b.d) bVar2).m19868c().invoke(thM30463e);
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((g) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    public C3941c(@NotNull C1137a binding, @NotNull InterfaceC5683g cameraController, @NotNull C5698n0 selfieDirectionFeed, @NotNull TrackingEventsLogger trackingEventsLogger) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(cameraController, "cameraController");
        Intrinsics.checkNotNullParameter(selfieDirectionFeed, "selfieDirectionFeed");
        Intrinsics.checkNotNullParameter(trackingEventsLogger, "trackingEventsLogger");
        this.binding = binding;
        this.cameraController = cameraController;
        this.selfieDirectionFeed = selfieDirectionFeed;
        this.trackingEventsLogger = trackingEventsLogger;
        binding.f4680l.setPreviewView(cameraController.getPreviewView());
        ConstraintLayout root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        C12524g.m46873d(root, false, false, false, false, 15, null);
        Context context = binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        C7259g.m30275i(context).mo4656a().mo4935a(new a());
        m19967v();
        this.confirmConst = Build.VERSION.SDK_INT >= 30 ? 16 : 3;
    }

    /* JADX INFO: renamed from: A */
    public static final void m19942A(C1137a c1137a, AbstractC0968m abstractC0968m, C3941c c3941c, SelfieWorkflow.AbstractC3928c.c.b bVar, View view) {
        m19968x(c1137a, abstractC0968m, c3941c, bVar);
    }

    /* JADX INFO: renamed from: B */
    public static final void m19943B(C1137a c1137a, final SelfieWorkflow.AbstractC3928c.c.b bVar, View view) {
        if (c1137a.f4680l.m20300a0()) {
            ((SelfieWorkflow.AbstractC3928c.c.b.e) bVar).m19872b().invoke();
        } else {
            c1137a.f4680l.m20299X(new Function0() { // from class: yp.j
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C3941c.m19944C(bVar);
                }
            });
        }
    }

    /* JADX INFO: renamed from: C */
    public static final Unit m19944C(SelfieWorkflow.AbstractC3928c.c.b bVar) {
        ((SelfieWorkflow.AbstractC3928c.c.b.e) bVar).m19872b().invoke();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: D */
    public static final Unit m19945D(SelfieWorkflow.AbstractC3928c.c.b bVar) {
        ((SelfieWorkflow.AbstractC3928c.c.b.C14141c) bVar).m19864c().invoke();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: E */
    public static final Unit m19946E(SelfieWorkflow.AbstractC3928c.c cVar) {
        cVar.m19844h().invoke();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: F */
    public static final Unit m19947F(SelfieWorkflow.AbstractC3928c.c cVar) {
        cVar.m19846j().invoke();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: G */
    public static final void m19948G(AbstractC0968m abstractC0968m, C3941c c3941c, SelfieWorkflow.AbstractC3928c.c.b bVar) {
        C7882k.m32780d(abstractC0968m, C7864g1.m32645c(), null, c3941c.new g(bVar, null), 2, null);
    }

    /* JADX INFO: renamed from: t */
    public static final void m19966t(TextView textView) {
        textView.setAlpha(1.0f);
        textView.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public final void m19967v() {
        InterfaceC7850d2 interfaceC7850d2 = this.cameraStateListenerJob;
        if (interfaceC7850d2 != null) {
            InterfaceC7850d2.a.m32603a(interfaceC7850d2, null, 1, null);
        }
        Context context = this.binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.cameraStateListenerJob = C7882k.m32780d(C0982t.m4979a(C7259g.m30275i(context)), null, null, new c(null), 3, null);
    }

    /* JADX INFO: renamed from: x */
    public static final void m19968x(C1137a c1137a, final AbstractC0968m abstractC0968m, final C3941c c3941c, final SelfieWorkflow.AbstractC3928c.c.b bVar) {
        c1137a.f4670b.setEnabled(false);
        if (c1137a.f4680l.m20300a0()) {
            m19948G(abstractC0968m, c3941c, bVar);
        } else {
            c1137a.f4680l.m20299X(new Function0() { // from class: yp.i
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C3941c.m19969y(abstractC0968m, c3941c, bVar);
                }
            });
        }
    }

    /* JADX INFO: renamed from: y */
    public static final Unit m19969y(AbstractC0968m abstractC0968m, C3941c c3941c, SelfieWorkflow.AbstractC3928c.c.b bVar) {
        m19948G(abstractC0968m, c3941c, bVar);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: z */
    public static final Unit m19970z(SelfieWorkflow.AbstractC3928c.c.b bVar) {
        ((SelfieWorkflow.AbstractC3928c.c.b.f) bVar).m19874b().invoke();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: H */
    public final OldSelfieOverlayView.EnumC3986b m19971H(SelfieWorkflow.AbstractC3928c.c.EnumC14142c enumC14142c) {
        switch (b.f16485a[enumC14142c.ordinal()]) {
            case 1:
                return OldSelfieOverlayView.EnumC3986b.CLEAR;
            case 2:
                return OldSelfieOverlayView.EnumC3986b.LOOK_LEFT_HINT;
            case 3:
                return OldSelfieOverlayView.EnumC3986b.LOOK_RIGHT_HINT;
            case 4:
                return OldSelfieOverlayView.EnumC3986b.CENTER;
            case 5:
                return OldSelfieOverlayView.EnumC3986b.LOOK_LEFT;
            case 6:
                return OldSelfieOverlayView.EnumC3986b.LOOK_RIGHT;
            case 7:
                return OldSelfieOverlayView.EnumC3986b.LOOK_UP;
            case 8:
                return OldSelfieOverlayView.EnumC3986b.LOOK_DOWN;
            case 9:
                return OldSelfieOverlayView.EnumC3986b.COMPLETE_WITH_CAPTURE;
            case 10:
                return OldSelfieOverlayView.EnumC3986b.LOOK_UP_HINT;
            case 11:
                return OldSelfieOverlayView.EnumC3986b.LOOK_DOWN_HINT;
            case 12:
                return OldSelfieOverlayView.EnumC3986b.CENTER_COMPLETE;
            case 13:
                return OldSelfieOverlayView.EnumC3986b.LOOK_LEFT_COMPLETE;
            case 14:
                return OldSelfieOverlayView.EnumC3986b.LOOK_RIGHT_COMPLETE;
            case 15:
                return OldSelfieOverlayView.EnumC3986b.LOOK_UP_COMPLETE;
            case 16:
                return OldSelfieOverlayView.EnumC3986b.LOOK_DOWN_COMPLETE;
            case 17:
                return OldSelfieOverlayView.EnumC3986b.FINALIZING;
            case 18:
                return OldSelfieOverlayView.EnumC3986b.COMPLETE;
            default:
                throw new C7345l();
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m19972s(final TextView textView, float f10) {
        textView.setVisibility(0);
        textView.animate().setDuration(500L).scaleX(f10).scaleY(f10).alpha(0.0f).withEndAction(new Runnable() { // from class: yp.h
            @Override // java.lang.Runnable
            public final void run() {
                C3941c.m19966t(textView);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public final void m19973u(StepStyles.SelfieStepStyle styles) {
        TextBasedComponentStyle titleStyleValue = styles.getTitleStyleValue();
        if (titleStyleValue != null) {
            TextView title = this.binding.f4681m;
            Intrinsics.checkNotNullExpressionValue(title, "title");
            C7304h0.m30392l(title, titleStyleValue, null, 2, null);
            this.binding.f4681m.setTextColor(-1);
        }
        TextBasedComponentStyle selfieCaptureHintTextStyle = styles.getSelfieCaptureHintTextStyle();
        if (selfieCaptureHintTextStyle != null) {
            TextView hintMessage = this.binding.f4674f;
            Intrinsics.checkNotNullExpressionValue(hintMessage, "hintMessage");
            C7304h0.m30392l(hintMessage, selfieCaptureHintTextStyle, null, 2, null);
            this.binding.f4674f.setTextColor(-1);
        }
        Integer capturePageHeaderIconColorValue = styles.getCapturePageHeaderIconColorValue();
        if (capturePageHeaderIconColorValue != null) {
            this.binding.f4676h.setControlsColor(capturePageHeaderIconColorValue.intValue());
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.withpersona.sdk2.inquiry.selfie.view.OldSelfieOverlayView.f0(com.withpersona.sdk2.inquiry.selfie.view.OldSelfieOverlayView, com.withpersona.sdk2.inquiry.selfie.view.OldSelfieOverlayView$b, boolean, kotlin.jvm.functions.Function0, int, java.lang.Object):void */
    /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;Lan/y;)V */
    @Override // p016an.InterfaceC0382k
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void mo1442a(@NotNull final SelfieWorkflow.AbstractC3928c.c rendering, @NotNull ViewEnvironment viewEnvironment) {
        Function1<? super Throwable, Unit> function1;
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        if (rendering.getRecordingLocallyRequired() && !this.cameraController.getRecordingStarted() && (function1 = this.currentErrorHandler) != null) {
            function1.invoke(new C5694l0(false));
        }
        this.currentErrorHandler = rendering.m19845i();
        this.permissionChangedHandler = rendering.m19847k();
        this.cameraController.mo16224h();
        this.cameraController.getPreviewView().setVisibility(0);
        if ((rendering.getMode() instanceof SelfieWorkflow.AbstractC3928c.c.b.i) || (rendering.getMode() instanceof SelfieWorkflow.AbstractC3928c.c.b.g)) {
            this.binding.f4672d.setVisibility(0);
        } else {
            this.binding.f4672d.setVisibility(8);
        }
        this.selfieDirectionFeed.m25837m(rendering.getRequireStrictSelfieCapture() ? 0.45d : 0.35d, 0.8d, false);
        final C1137a c1137a = this.binding;
        Context context = c1137a.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        final AbstractC0968m abstractC0968mM4979a = C0982t.m4979a(C7259g.m30275i(context));
        TextView textView = this.binding.f4681m;
        String title = rendering.getCom.withpersona.sdk2.inquiry.network.dto.ui.components.Title.type java.lang.String();
        if (title == null) {
            title = "";
        }
        textView.setText(title);
        TextView textView2 = this.binding.f4681m;
        CharSequence text = c1137a.f4681m.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        textView2.setVisibility(StringsKt.m32182p0(text) ? 8 : 0);
        String message = rendering.getMessage();
        String str = message != null ? message : "";
        if (!Intrinsics.m31980c(str, c1137a.f4674f.getText())) {
            c1137a.f4674f.setText(str);
        }
        c1137a.f4680l.setLeftPoseImage(rendering.getAssetOverrides().getLeftPoseImage());
        c1137a.f4680l.setRightPoseImage(rendering.getAssetOverrides().getRightPoseImage());
        int i10 = b.f16485a[rendering.getMode().getOverlay().ordinal()];
        if (i10 == 1) {
            TextView textView3 = c1137a.f4674f;
            textView3.announceForAccessibility(textView3.getContext().getString(C12244g.f43235T));
        } else if (i10 == 2) {
            TextView textView4 = c1137a.f4674f;
            textView4.announceForAccessibility(textView4.getContext().getString(C12244g.f43237V));
        } else if (i10 == 3) {
            TextView textView5 = c1137a.f4674f;
            textView5.announceForAccessibility(textView5.getContext().getString(C12244g.f43238W));
        } else if (rendering.getMode() instanceof SelfieWorkflow.AbstractC3928c.c.b.d) {
            TextView textView6 = c1137a.f4674f;
            textView6.announceForAccessibility(textView6.getContext().getString(C12244g.f43236U));
        }
        c1137a.f4670b.setEnabled(true);
        if (!(rendering.getMode() instanceof SelfieWorkflow.AbstractC3928c.c.b.C14140b)) {
            c1137a.f4673e.setVisibility(8);
        }
        if (!(rendering.getMode() instanceof SelfieWorkflow.AbstractC3928c.c.b.i)) {
            c1137a.f4675g.setVisibility(8);
        }
        final SelfieWorkflow.AbstractC3928c.c.b mode = rendering.getMode();
        if (mode instanceof SelfieWorkflow.AbstractC3928c.c.b.g) {
            c1137a.f4670b.setVisibility(4);
            C7882k.m32780d(abstractC0968mM4979a, C7864g1.m32643a(), null, new d(mode, abstractC0968mM4979a, null), 2, null);
            SelfieWorkflow.AbstractC3928c.c.b.g gVar = (SelfieWorkflow.AbstractC3928c.c.b.g) mode;
            OldSelfieOverlayView.m20288f0(c1137a.f4680l, m19971H(gVar.getOverlay()), gVar.getShowProgress(), null, 4, null);
        } else if (mode instanceof SelfieWorkflow.AbstractC3928c.c.b.i) {
            c1137a.f4675g.setVisibility(0);
            c1137a.f4670b.setVisibility(4);
            InterfaceC7850d2 interfaceC7850d2 = this.maxRecordingLimitJob;
            if (interfaceC7850d2 != null) {
                InterfaceC7850d2.a.m32603a(interfaceC7850d2, null, 1, null);
            }
            this.maxRecordingLimitJob = C7882k.m32780d(abstractC0968mM4979a, C7864g1.m32644b(), null, new e(mode, this, null), 2, null);
        } else if (mode instanceof SelfieWorkflow.AbstractC3928c.c.b.f) {
            c1137a.f4670b.setVisibility(4);
            SelfieWorkflow.AbstractC3928c.c.b.f fVar = (SelfieWorkflow.AbstractC3928c.c.b.f) mode;
            c1137a.f4680l.m20302e0(m19971H(fVar.getOverlay()), fVar.getShowProgress(), new Function0() { // from class: yp.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C3941c.m19970z(mode);
                }
            });
        } else if (mode instanceof SelfieWorkflow.AbstractC3928c.c.b.C14140b) {
            c1137a.f4670b.setVisibility(4);
            SelfieWorkflow.AbstractC3928c.c.b.C14140b c14140b = (SelfieWorkflow.AbstractC3928c.c.b.C14140b) mode;
            if (!Intrinsics.m31980c(c1137a.f4673e.getTag(), Integer.valueOf(c14140b.getCountDown()))) {
                TextView countdown = c1137a.f4673e;
                Intrinsics.checkNotNullExpressionValue(countdown, "countdown");
                m19972s(countdown, C7764d.m32078c(4 - c14140b.getCountDown(), 1) * 1.5f);
                c1137a.f4673e.setText(String.valueOf(c14140b.getCountDown()));
                c1137a.f4673e.setTag(Integer.valueOf(c14140b.getCountDown()));
            }
            OldSelfieOverlayView.m20288f0(c1137a.f4680l, m19971H(c14140b.getOverlay()), c14140b.getShowProgress(), null, 4, null);
        } else if (mode instanceof SelfieWorkflow.AbstractC3928c.c.b.h) {
            InterfaceC7850d2 interfaceC7850d3 = this.maxRecordingLimitJob;
            if (interfaceC7850d3 != null) {
                InterfaceC7850d2.a.m32603a(interfaceC7850d3, null, 1, null);
            }
            c1137a.f4670b.setEnabled(false);
            SelfieWorkflow.AbstractC3928c.c.b.h hVar = (SelfieWorkflow.AbstractC3928c.c.b.h) mode;
            c1137a.f4680l.m20302e0(m19971H(hVar.getOverlay()), hVar.getShowProgress(), hVar.m19882c());
            if (hVar.getImageCaptured()) {
                c1137a.getRoot().setHapticFeedbackEnabled(true);
                c1137a.getRoot().performHapticFeedback(this.confirmConst, 2);
            }
        } else if (mode instanceof SelfieWorkflow.AbstractC3928c.c.b.d) {
            c1137a.f4670b.setVisibility(0);
            c1137a.f4670b.setOnClickListener(new View.OnClickListener() { // from class: yp.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C3941c.m19942A(c1137a, abstractC0968mM4979a, this, mode, view);
                }
            });
            SelfieWorkflow.AbstractC3928c.c.b.d dVar = (SelfieWorkflow.AbstractC3928c.c.b.d) mode;
            if (dVar.getForceCapture()) {
                c1137a.f4670b.setVisibility(4);
                m19968x(c1137a, abstractC0968mM4979a, this, mode);
            }
            OldSelfieOverlayView.m20288f0(c1137a.f4680l, m19971H(dVar.getOverlay()), dVar.getShowProgress(), null, 4, null);
        } else if (mode instanceof SelfieWorkflow.AbstractC3928c.c.b.e) {
            c1137a.f4670b.setVisibility(0);
            c1137a.f4670b.setOnClickListener(new View.OnClickListener() { // from class: yp.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C3941c.m19943B(c1137a, mode, view);
                }
            });
            SelfieWorkflow.AbstractC3928c.c.b.e eVar = (SelfieWorkflow.AbstractC3928c.c.b.e) mode;
            OldSelfieOverlayView.m20288f0(c1137a.f4680l, m19971H(eVar.getOverlay()), eVar.getShowProgress(), null, 4, null);
        } else if (mode instanceof SelfieWorkflow.AbstractC3928c.c.b.a) {
            c1137a.f4670b.setVisibility(4);
            SelfieWorkflow.AbstractC3928c.c.b.a aVar = (SelfieWorkflow.AbstractC3928c.c.b.a) mode;
            OldSelfieOverlayView.m20288f0(c1137a.f4680l, m19971H(aVar.getOverlay()), aVar.getShowProgress(), null, 4, null);
        } else {
            if (!(mode instanceof SelfieWorkflow.AbstractC3928c.c.b.C14141c)) {
                throw new C7345l();
            }
            c1137a.f4670b.setVisibility(4);
            SelfieWorkflow.AbstractC3928c.c.b.C14141c c14141c = (SelfieWorkflow.AbstractC3928c.c.b.C14141c) mode;
            if (c14141c.getStartFinalize()) {
                InterfaceC7850d2 interfaceC7850d4 = this.maxRecordingLimitJob;
                if (interfaceC7850d4 != null) {
                    InterfaceC7850d2.a.m32603a(interfaceC7850d4, null, 1, null);
                }
                C7882k.m32780d(abstractC0968mM4979a, C7864g1.m32645c(), null, new f(mode, rendering, null), 2, null);
            }
            c1137a.f4680l.m20302e0(m19971H(c14141c.getOverlay()), c14141c.getShowProgress(), new Function0() { // from class: yp.e
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C3941c.m19945D(mode);
                }
            });
        }
        NavigationState navigationState = rendering.getNavigationState();
        Function0 function0 = new Function0() { // from class: yp.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C3941c.m19946E(rendering);
            }
        };
        Function0 function2 = new Function0() { // from class: yp.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C3941c.m19947F(rendering);
            }
        };
        Pi2NavigationBar navigationBar = c1137a.f4676h;
        Intrinsics.checkNotNullExpressionValue(navigationBar, "navigationBar");
        ConstraintLayout root = c1137a.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        String navBarTitle = rendering.getNavBarTitle();
        StepStyles.SelfieStepStyle styles = rendering.getStyles();
        C6966c.m29335e(navigationState, function0, function2, null, navigationBar, root, null, navBarTitle, styles != null ? styles.getNavBarTitleStyleValue() : null, 72, null);
        String watermarkText = rendering.getWatermarkText();
        if (watermarkText == null || StringsKt.m32182p0(watermarkText)) {
            c1137a.f4682n.setVisibility(8);
        } else {
            c1137a.f4682n.setText(rendering.getWatermarkText());
            c1137a.f4682n.setVisibility(0);
        }
        StepStyles.SelfieStepStyle styles2 = rendering.getStyles();
        if (styles2 != null) {
            m19973u(styles2);
            int iM33005c = C7975b.m33005c(this.binding.getRoot().getContext(), C12239b.f43188a);
            this.binding.f4680l.m20298W(styles2);
            Context context2 = this.binding.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            C12249c.m45393b(viewEnvironment, context2, iM33005c);
        }
    }
}
