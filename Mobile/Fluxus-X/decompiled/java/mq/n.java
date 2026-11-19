package mq;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.common.MlKitException;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.selfie.view.OldSelfieOverlayView;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.SelfieCaptureState;
import com.withpersona.sdk2.inquiry.tracking.model.SelfieCaptureStateEventData;
import java.io.File;
import nn.ViewEnvironment;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001c\u001a\u00020\r*\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010 \u001a\u00020\u001f*\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010-\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R*\u00103\u001a\u0016\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\r\u0018\u00010.j\u0004\u0018\u0001`08\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u001e\u00107\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u00109\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010,R\u0014\u0010=\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006>"}, d2 = {"Lmq/n;", "Lnn/k;", "Lmq/q5$d$c;", "Loq/a;", "binding", "Lsn/i;", "cameraController", "Lsn/b1;", "selfieDirectionFeed", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "<init>", "(Loq/a;Lsn/i;Lsn/b1;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V", BuildConfig.FLAVOR, "v", "()V", "rendering", "Lnn/z;", "viewEnvironment", "w", "(Lmq/q5$d$c;Lnn/z;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "styles", "u", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;)V", "Landroid/widget/TextView;", BuildConfig.FLAVOR, "scale", "s", "(Landroid/widget/TextView;F)V", "Lmq/q5$d$c$c;", "Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView$b;", "H", "(Lmq/q5$d$c$c;)Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView$b;", "b", "Loq/a;", "c", "Lsn/i;", "d", "Lsn/b1;", "e", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "Lav/d2;", "f", "Lav/d2;", "maxRecordingLimitJob", "Lkotlin/Function1;", BuildConfig.FLAVOR, "Lcom/withpersona/sdk2/inquiry/selfie/CameraErrorHandler;", "g", "Lkotlin/jvm/functions/Function1;", "currentErrorHandler", "Lkotlin/Function0;", "h", "Lkotlin/jvm/functions/Function0;", "permissionChangedHandler", "i", "cameraStateListenerJob", BuildConfig.FLAVOR, "j", "I", "confirmConst", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n implements nn.k<q5.d.c> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final oq.a binding;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final sn.i cameraController;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final sn.b1 selfieDirectionFeed;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public av.d2 maxRecordingLimitJob;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super Throwable, Unit> currentErrorHandler;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function0<Unit> permissionChangedHandler;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public av.d2 cameraStateListenerJob;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final int confirmConst;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"mq/n$a", "Landroidx/lifecycle/f;", "Landroidx/lifecycle/s;", "owner", BuildConfig.FLAVOR, "onResume", "(Landroidx/lifecycle/s;)V", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements androidx.p000lifecycle.f {
        public a() {
        }

        public static final void b(n nVar) {
            Function0 function0 = nVar.permissionChangedHandler;
            if (function0 != null) {
                function0.invoke();
            }
            nVar.v();
        }

        @Override // androidx.p000lifecycle.f
        public void onCreate(androidx.p000lifecycle.s sVar) {
            super.onCreate(sVar);
        }

        @Override // androidx.p000lifecycle.f
        public void onDestroy(androidx.p000lifecycle.s sVar) {
            super.onDestroy(sVar);
        }

        @Override // androidx.p000lifecycle.f
        public void onPause(androidx.p000lifecycle.s sVar) {
            super.onPause(sVar);
        }

        @Override // androidx.p000lifecycle.f
        public void onResume(androidx.p000lifecycle.s owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            ConstraintLayout constraintLayoutB = n.this.binding.getRoot();
            final n nVar = n.this;
            constraintLayoutB.post(new Runnable() { // from class: mq.m
                @Override // java.lang.Runnable
                public final void run() {
                    n.a.b(nVar);
                }
            });
        }

        @Override // androidx.p000lifecycle.f
        public void onStart(androidx.p000lifecycle.s sVar) {
            super.onStart(sVar);
        }

        @Override // androidx.p000lifecycle.f
        public void onStop(androidx.p000lifecycle.s sVar) {
            super.onStop(sVar);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23704a;

        static {
            int[] iArr = new int[q5.d.c.EnumC0473c.values().length];
            try {
                iArr[q5.d.c.EnumC0473c.CLEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[q5.d.c.EnumC0473c.LOOK_LEFT_HINT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[q5.d.c.EnumC0473c.LOOK_RIGHT_HINT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[q5.d.c.EnumC0473c.CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[q5.d.c.EnumC0473c.LOOK_LEFT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[q5.d.c.EnumC0473c.LOOK_RIGHT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[q5.d.c.EnumC0473c.LOOK_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[q5.d.c.EnumC0473c.LOOK_DOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[q5.d.c.EnumC0473c.COMPLETE_WITH_CAPTURE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[q5.d.c.EnumC0473c.LOOK_UP_HINT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[q5.d.c.EnumC0473c.LOOK_DOWN_HINT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[q5.d.c.EnumC0473c.CENTER_COMPLETE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[q5.d.c.EnumC0473c.LOOK_LEFT_COMPLETE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[q5.d.c.EnumC0473c.LOOK_RIGHT_COMPLETE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[q5.d.c.EnumC0473c.LOOK_UP_COMPLETE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[q5.d.c.EnumC0473c.LOOK_DOWN_COMPLETE.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[q5.d.c.EnumC0473c.FINALIZING.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[q5.d.c.EnumC0473c.COMPLETE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            f23704a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.selfie.OldCameraScreenRunner$registerCameraStateListener$1", f = "OldCameraScreenRunner.kt", l = {126}, m = "invokeSuspend")
    public static final class c extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f23705t;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements dv.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ n f23707a;

            public a(n nVar) {
                this.f23707a = nVar;
            }

            @Override // dv.i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(sn.y yVar, eu.b<? super Unit> bVar) {
                Function1 function1;
                if (Intrinsics.c(yVar, sn.y.b.f31746a)) {
                    Function1 function2 = this.f23707a.currentErrorHandler;
                    if (function2 != null) {
                        function2.invoke(new sn.j1());
                    }
                } else if (yVar instanceof sn.y.Closed) {
                    sn.y.Closed closed = (sn.y.Closed) yVar;
                    if (closed.getWasRecordingInterrupted() && (function1 = this.f23707a.currentErrorHandler) != null) {
                        function1.invoke(new sn.z0(closed.getIsClosedDueToBadCameraConfiguration()));
                    }
                }
                return Unit.f21506a;
            }
        }

        public c(eu.b<? super c> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return n.this.new c(bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f23705t;
            if (i10 == 0) {
                zt.o.b(obj);
                dv.h<sn.y> hVarA = sn.j.a(n.this.cameraController.b());
                a aVar = new a(n.this);
                this.f23705t = 1;
                if (hVarA.collect(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
            }
            return Unit.f21506a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.selfie.OldCameraScreenRunner$showRendering$1$1", f = "OldCameraScreenRunner.kt", l = {236, 238}, m = "invokeSuspend")
    public static final class d extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f23708t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ q5.d.c.b f23710v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ androidx.p000lifecycle.m f23711w;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lsn/y;", "it", BuildConfig.FLAVOR, "<anonymous>", "(Lsn/y;)Z"}, k = 3, mv = {2, 2, 0})
        @gu.f(c = "com.withpersona.sdk2.inquiry.selfie.OldCameraScreenRunner$showRendering$1$1$1", f = "OldCameraScreenRunner.kt", l = {}, m = "invokeSuspend")
        public static final class a extends gu.m implements Function2<sn.y, eu.b<? super Boolean>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f23712t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f23713u;

            public a(eu.b<? super a> bVar) {
                super(2, bVar);
            }

            @Override // gu.a
            public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
                a aVar = new a(bVar);
                aVar.f23713u = obj;
                return aVar;
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                sn.y yVar = (sn.y) this.f23713u;
                fu.c.e();
                if (this.f23712t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
                return gu.b.a(!(yVar instanceof sn.y.Ready));
            }

            @Override // p001kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public final Object invoke(sn.y yVar, eu.b<? super Boolean> bVar) {
                return ((a) create(yVar, bVar)).invokeSuspend(Unit.f21506a);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
        @gu.f(c = "com.withpersona.sdk2.inquiry.selfie.OldCameraScreenRunner$showRendering$1$1$2", f = "OldCameraScreenRunner.kt", l = {240}, m = "invokeSuspend")
        public static final class b extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f23714t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ q5.d.c.b f23715u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ n f23716v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ androidx.p000lifecycle.m f23717w;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
            @gu.f(c = "com.withpersona.sdk2.inquiry.selfie.OldCameraScreenRunner$showRendering$1$1$2$1$1", f = "OldCameraScreenRunner.kt", l = {245, 249}, m = "invokeSuspend")
            public static final class a extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public int f23718t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public final /* synthetic */ q5.d.c.b f23719u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                public final /* synthetic */ n f23720v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(q5.d.c.b bVar, n nVar, eu.b<? super a> bVar2) {
                    super(2, bVar2);
                    this.f23719u = bVar;
                    this.f23720v = nVar;
                }

                @Override // gu.a
                public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
                    return new a(this.f23719u, this.f23720v, bVar);
                }

                @Override // p001kotlin.jvm.functions.Function2
                public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
                    return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
                
                    if (r12 == r0) goto L19;
                 */
                @Override // gu.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    Object objK;
                    Object objE = fu.c.e();
                    int i10 = this.f23718t;
                    if (i10 == 0) {
                        zt.o.b(obj);
                        long maxRecordingLengthMs = ((q5.d.c.b.g) this.f23719u).getMaxRecordingLengthMs();
                        this.f23718t = 1;
                        if (av.z0.b(maxRecordingLengthMs, this) != objE) {
                        }
                        return objE;
                    }
                    if (i10 == 1) {
                        zt.o.b(obj);
                    } else {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        zt.o.b(obj);
                        objK = ((zt.n) obj).getValue();
                    }
                    if (zt.n.h(objK)) {
                        ((File) objK).delete();
                    }
                    TrackingEventsLogger.logSelfieCaptureStateEvent$default(this.f23720v.trackingEventsLogger, new SelfieCaptureStateEventData(SelfieCaptureState.RECORDING_TIMED_OUT, "local_video", null, null, 8, null), false, 2, null);
                    Function1 function1 = this.f23720v.currentErrorHandler;
                    if (function1 != null) {
                        function1.invoke(new sn.a1());
                    }
                    return Unit.f21506a;
                    if (this.f23720v.cameraController.b().getValue() instanceof sn.y.Closed) {
                        return Unit.f21506a;
                    }
                    sn.i iVar = this.f23720v.cameraController;
                    this.f23718t = 2;
                    objK = iVar.k(this);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(q5.d.c.b bVar, n nVar, androidx.p000lifecycle.m mVar, eu.b<? super b> bVar2) {
                super(2, bVar2);
                this.f23715u = bVar;
                this.f23716v = nVar;
                this.f23717w = mVar;
            }

            @Override // gu.a
            public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
                return new b(this.f23715u, this.f23716v, this.f23717w, bVar);
            }

            @Override // p001kotlin.jvm.functions.Function2
            public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
                return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                Object objI;
                Object objE = fu.c.e();
                int i10 = this.f23714t;
                if (i10 == 0) {
                    zt.o.b(obj);
                    if (((q5.d.c.b.g) this.f23715u).getRecordLocalVideo()) {
                        sn.i iVar = this.f23716v.cameraController;
                        this.f23714t = 1;
                        objI = iVar.i(this);
                        if (objI == objE) {
                            return objE;
                        }
                    }
                    ((q5.d.c.b.g) this.f23715u).d().invoke(this.f23716v.cameraController.f());
                    return Unit.f21506a;
                }
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
                objI = ((zt.n) obj).getValue();
                n nVar = this.f23716v;
                androidx.p000lifecycle.m mVar = this.f23717w;
                q5.d.c.b bVar = this.f23715u;
                if (zt.n.h(objI) && ((Boolean) objI).booleanValue()) {
                    av.d2 d2Var = nVar.maxRecordingLimitJob;
                    if (d2Var != null) {
                        av.d2.a.a(d2Var, null, 1, null);
                    }
                    nVar.maxRecordingLimitJob = av.k.d(mVar, av.g1.b(), null, new a(bVar, nVar, null), 2, null);
                }
                q5.d.c.b bVar2 = this.f23715u;
                Throwable thE = zt.n.e(objI);
                if (thE != null) {
                    ((q5.d.c.b.g) bVar2).c().invoke(thE);
                }
                ((q5.d.c.b.g) this.f23715u).d().invoke(this.f23716v.cameraController.f());
                return Unit.f21506a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(q5.d.c.b bVar, androidx.p000lifecycle.m mVar, eu.b<? super d> bVar2) {
            super(2, bVar2);
            this.f23710v = bVar;
            this.f23711w = mVar;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return n.this.new d(this.f23710v, this.f23711w, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
        
            if (av.i.g(r8, r1, r7) == r0) goto L15;
         */
        @Override // gu.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f23708t;
            if (i10 == 0) {
                zt.o.b(obj);
                dv.h hVarO = dv.j.O(n.this.cameraController.b(), new a(null));
                this.f23708t = 1;
                if (dv.j.i(hVarO, this) != objE) {
                }
                return objE;
            }
            if (i10 == 1) {
                zt.o.b(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
            }
            return Unit.f21506a;
            av.n2 n2VarC = av.g1.c();
            b bVar = new b(this.f23710v, n.this, this.f23711w, null);
            this.f23708t = 2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.selfie.OldCameraScreenRunner$showRendering$1$2", f = "OldCameraScreenRunner.kt", l = {280}, m = "invokeSuspend")
    public static final class e extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f23721t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ q5.d.c.b f23722u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ n f23723v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(q5.d.c.b bVar, n nVar, eu.b<? super e> bVar2) {
            super(2, bVar2);
            this.f23722u = bVar;
            this.f23723v = nVar;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new e(this.f23722u, this.f23723v, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
            return ((e) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f23721t;
            if (i10 == 0) {
                zt.o.b(obj);
                long maxRecordingLengthMs = ((q5.d.c.b.i) this.f23722u).getMaxRecordingLengthMs();
                this.f23721t = 1;
                if (av.z0.b(maxRecordingLengthMs, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
            }
            if (this.f23723v.cameraController.b().getValue() instanceof sn.y.Closed) {
                return Unit.f21506a;
            }
            TrackingEventsLogger.logSelfieCaptureStateEvent$default(this.f23723v.trackingEventsLogger, new SelfieCaptureStateEventData(SelfieCaptureState.RECORDING_TIMED_OUT, "webrtc", null, null, 8, null), false, 2, null);
            Function1 function1 = this.f23723v.currentErrorHandler;
            if (function1 != null) {
                function1.invoke(new sn.a1());
            }
            return Unit.f21506a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.selfie.OldCameraScreenRunner$showRendering$1$6", f = "OldCameraScreenRunner.kt", l = {400}, m = "invokeSuspend")
    public static final class f extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f23724t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ q5.d.c.b f23726v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ q5.d.c f23727w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(q5.d.c.b bVar, q5.d.c cVar, eu.b<? super f> bVar2) {
            super(2, bVar2);
            this.f23726v = bVar;
            this.f23727w = cVar;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return n.this.new f(this.f23726v, this.f23727w, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
            return ((f) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objK;
            Object objE = fu.c.e();
            int i10 = this.f23724t;
            if (i10 == 0) {
                zt.o.b(obj);
                sn.i iVar = n.this.cameraController;
                this.f23724t = 1;
                objK = iVar.k(this);
                if (objK == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
                objK = ((zt.n) obj).getValue();
            }
            q5.d.c.b bVar = this.f23726v;
            if (zt.n.h(objK)) {
                ((q5.d.c.b.C0471c) bVar).b().invoke((File) objK);
            }
            q5.d.c cVar = this.f23727w;
            Throwable thE = zt.n.e(objK);
            if (thE != null && !(thE instanceof sn.t0)) {
                cVar.i().invoke(thE);
            }
            return Unit.f21506a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.selfie.OldCameraScreenRunner$showRendering$1$takePhoto$1", f = "OldCameraScreenRunner.kt", l = {333}, m = "invokeSuspend")
    public static final class g extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f23728t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ q5.d.c.b f23730v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(q5.d.c.b bVar, eu.b<? super g> bVar2) {
            super(2, bVar2);
            this.f23730v = bVar;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return n.this.new g(this.f23730v, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
            return ((g) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objG;
            Object objE = fu.c.e();
            int i10 = this.f23728t;
            if (i10 == 0) {
                zt.o.b(obj);
                sn.i iVar = n.this.cameraController;
                this.f23728t = 1;
                objG = iVar.g(this);
                if (objG == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
                objG = ((zt.n) obj).getValue();
            }
            q5.d.c.b bVar = this.f23730v;
            if (zt.n.h(objG)) {
                Function1<String, Unit> function1D = ((q5.d.c.b.C0472d) bVar).d();
                String absolutePath = ((File) objG).getAbsolutePath();
                Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
                function1D.invoke(absolutePath);
            }
            q5.d.c.b bVar2 = this.f23730v;
            Throwable thE = zt.n.e(objG);
            if (thE != null && !(thE instanceof un.o0)) {
                ((q5.d.c.b.C0472d) bVar2).c().invoke(thE);
            }
            return Unit.f21506a;
        }
    }

    public n(@NotNull oq.a binding, @NotNull sn.i cameraController, @NotNull sn.b1 selfieDirectionFeed, @NotNull TrackingEventsLogger trackingEventsLogger) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(cameraController, "cameraController");
        Intrinsics.checkNotNullParameter(selfieDirectionFeed, "selfieDirectionFeed");
        Intrinsics.checkNotNullParameter(trackingEventsLogger, "trackingEventsLogger");
        this.binding = binding;
        this.cameraController = cameraController;
        this.selfieDirectionFeed = selfieDirectionFeed;
        this.trackingEventsLogger = trackingEventsLogger;
        binding.f28336l.setPreviewView(cameraController.getPreviewView());
        ConstraintLayout constraintLayoutB = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutB, "getRoot(...)");
        kr.g.d(constraintLayoutB, false, false, false, false, 15, null);
        Context context = binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        xq.g.i(context).a().a(new a());
        v();
        this.confirmConst = Build.VERSION.SDK_INT >= 30 ? 16 : 3;
    }

    public static final void A(oq.a aVar, androidx.p000lifecycle.m mVar, n nVar, q5.d.c.b bVar, View view) {
        x(aVar, mVar, nVar, bVar);
    }

    public static final void B(oq.a aVar, final q5.d.c.b bVar, View view) {
        if (aVar.f28336l.a0()) {
            ((q5.d.c.b.e) bVar).b().invoke();
        } else {
            aVar.f28336l.X(new Function0() { // from class: mq.l
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return n.C(bVar);
                }
            });
        }
    }

    public static final Unit C(q5.d.c.b bVar) {
        ((q5.d.c.b.e) bVar).b().invoke();
        return Unit.f21506a;
    }

    public static final Unit D(q5.d.c.b bVar) {
        ((q5.d.c.b.C0471c) bVar).c().invoke();
        return Unit.f21506a;
    }

    public static final Unit E(q5.d.c cVar) {
        cVar.h().invoke();
        return Unit.f21506a;
    }

    public static final Unit F(q5.d.c cVar) {
        cVar.j().invoke();
        return Unit.f21506a;
    }

    public static final void G(androidx.p000lifecycle.m mVar, n nVar, q5.d.c.b bVar) {
        av.k.d(mVar, av.g1.c(), null, nVar.new g(bVar, null), 2, null);
    }

    public static final void t(TextView textView) {
        textView.setAlpha(1.0f);
        textView.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v() {
        av.d2 d2Var = this.cameraStateListenerJob;
        if (d2Var != null) {
            av.d2.a.a(d2Var, null, 1, null);
        }
        Context context = this.binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.cameraStateListenerJob = av.k.d(androidx.p000lifecycle.t.a(xq.g.i(context)), null, null, new c(null), 3, null);
    }

    public static final void x(oq.a aVar, final androidx.p000lifecycle.m mVar, final n nVar, final q5.d.c.b bVar) {
        aVar.b.setEnabled(false);
        if (aVar.f28336l.a0()) {
            G(mVar, nVar, bVar);
        } else {
            aVar.f28336l.X(new Function0() { // from class: mq.k
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return n.y(mVar, nVar, bVar);
                }
            });
        }
    }

    public static final Unit y(androidx.p000lifecycle.m mVar, n nVar, q5.d.c.b bVar) {
        G(mVar, nVar, bVar);
        return Unit.f21506a;
    }

    public static final Unit z(q5.d.c.b bVar) {
        ((q5.d.c.b.f) bVar).b().invoke();
        return Unit.f21506a;
    }

    public final OldSelfieOverlayView.b H(q5.d.c.EnumC0473c enumC0473c) {
        switch (b.f23704a[enumC0473c.ordinal()]) {
            case 1:
                return OldSelfieOverlayView.b.CLEAR;
            case 2:
                return OldSelfieOverlayView.b.LOOK_LEFT_HINT;
            case 3:
                return OldSelfieOverlayView.b.LOOK_RIGHT_HINT;
            case 4:
                return OldSelfieOverlayView.b.CENTER;
            case 5:
                return OldSelfieOverlayView.b.LOOK_LEFT;
            case 6:
                return OldSelfieOverlayView.b.LOOK_RIGHT;
            case 7:
                return OldSelfieOverlayView.b.LOOK_UP;
            case 8:
                return OldSelfieOverlayView.b.LOOK_DOWN;
            case 9:
                return OldSelfieOverlayView.b.COMPLETE_WITH_CAPTURE;
            case 10:
                return OldSelfieOverlayView.b.LOOK_UP_HINT;
            case 11:
                return OldSelfieOverlayView.b.LOOK_DOWN_HINT;
            case 12:
                return OldSelfieOverlayView.b.CENTER_COMPLETE;
            case 13:
                return OldSelfieOverlayView.b.LOOK_LEFT_COMPLETE;
            case 14:
                return OldSelfieOverlayView.b.LOOK_RIGHT_COMPLETE;
            case 15:
                return OldSelfieOverlayView.b.LOOK_UP_COMPLETE;
            case 16:
                return OldSelfieOverlayView.b.LOOK_DOWN_COMPLETE;
            case 17:
                return OldSelfieOverlayView.b.FINALIZING;
            case MlKitException.UNSUPPORTED /* 18 */:
                return OldSelfieOverlayView.b.COMPLETE;
            default:
                throw new zt.l();
        }
    }

    public final void s(final TextView textView, float f10) {
        textView.setVisibility(0);
        textView.animate().setDuration(500L).scaleX(f10).scaleY(f10).alpha(0.0f).withEndAction(new Runnable() { // from class: mq.j
            @Override // java.lang.Runnable
            public final void run() {
                n.t(textView);
            }
        });
    }

    public final void u(StepStyles.SelfieStepStyle styles) {
        TextBasedComponentStyle titleStyleValue = styles.getTitleStyleValue();
        if (titleStyleValue != null) {
            TextView title = this.binding.f28337m;
            Intrinsics.checkNotNullExpressionValue(title, "title");
            yr.h0.l(title, titleStyleValue, null, 2, null);
            this.binding.f28337m.setTextColor(-1);
        }
        TextBasedComponentStyle selfieCaptureHintTextStyle = styles.getSelfieCaptureHintTextStyle();
        if (selfieCaptureHintTextStyle != null) {
            TextView hintMessage = this.binding.f28330f;
            Intrinsics.checkNotNullExpressionValue(hintMessage, "hintMessage");
            yr.h0.l(hintMessage, selfieCaptureHintTextStyle, null, 2, null);
            this.binding.f28330f.setTextColor(-1);
        }
        Integer capturePageHeaderIconColorValue = styles.getCapturePageHeaderIconColorValue();
        if (capturePageHeaderIconColorValue != null) {
            this.binding.f28332h.setControlsColor(capturePageHeaderIconColorValue.intValue());
        }
    }

    @Override // nn.k
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void a(@NotNull final q5.d.c rendering, @NotNull ViewEnvironment viewEnvironment) {
        Function1<? super Throwable, Unit> function1;
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        if (rendering.getRecordingLocallyRequired() && !this.cameraController.getRecordingStarted() && (function1 = this.currentErrorHandler) != null) {
            function1.invoke(new sn.z0(false));
        }
        this.currentErrorHandler = rendering.i();
        this.permissionChangedHandler = rendering.k();
        this.cameraController.j();
        this.cameraController.getPreviewView().setVisibility(0);
        if ((rendering.getMode() instanceof q5.d.c.b.i) || (rendering.getMode() instanceof q5.d.c.b.g)) {
            this.binding.f28328d.setVisibility(0);
        } else {
            this.binding.f28328d.setVisibility(8);
        }
        this.selfieDirectionFeed.m(rendering.getRequireStrictSelfieCapture() ? 0.45d : 0.35d, 0.8d, false);
        final oq.a aVar = this.binding;
        Context context = aVar.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        final androidx.p000lifecycle.m mVarA = androidx.p000lifecycle.t.a(xq.g.i(context));
        TextView textView = this.binding.f28337m;
        String title = rendering.getCom.withpersona.sdk2.inquiry.network.dto.ui.components.Title.type java.lang.String();
        String str = BuildConfig.FLAVOR;
        if (title == null) {
            title = BuildConfig.FLAVOR;
        }
        textView.setText(title);
        TextView textView2 = this.binding.f28337m;
        CharSequence text = aVar.f28337m.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        textView2.setVisibility(StringsKt.p0(text) ? 8 : 0);
        String message = rendering.getMessage();
        if (message != null) {
            str = message;
        }
        if (!Intrinsics.c(str, aVar.f28330f.getText())) {
            aVar.f28330f.setText(str);
        }
        aVar.f28336l.setLeftPoseImage(rendering.getAssetOverrides().getLeftPoseImage());
        aVar.f28336l.setRightPoseImage(rendering.getAssetOverrides().getRightPoseImage());
        int i10 = b.f23704a[rendering.getMode().getOverlay().ordinal()];
        if (i10 == 1) {
            TextView textView3 = aVar.f28330f;
            textView3.announceForAccessibility(textView3.getContext().getString(jq.g.T));
        } else if (i10 == 2) {
            TextView textView4 = aVar.f28330f;
            textView4.announceForAccessibility(textView4.getContext().getString(jq.g.V));
        } else if (i10 == 3) {
            TextView textView5 = aVar.f28330f;
            textView5.announceForAccessibility(textView5.getContext().getString(jq.g.W));
        } else if (rendering.getMode() instanceof q5.d.c.b.C0472d) {
            TextView textView6 = aVar.f28330f;
            textView6.announceForAccessibility(textView6.getContext().getString(jq.g.U));
        }
        aVar.b.setEnabled(true);
        if (!(rendering.getMode() instanceof q5.d.c.b.C0470b)) {
            aVar.f28329e.setVisibility(8);
        }
        if (!(rendering.getMode() instanceof q5.d.c.b.i)) {
            aVar.f28331g.setVisibility(8);
        }
        final q5.d.c.b mode = rendering.getMode();
        if (mode instanceof q5.d.c.b.g) {
            aVar.b.setVisibility(4);
            av.k.d(mVarA, av.g1.a(), null, new d(mode, mVarA, null), 2, null);
            q5.d.c.b.g gVar = (q5.d.c.b.g) mode;
            OldSelfieOverlayView.f0(aVar.f28336l, H(gVar.getOverlay()), gVar.getShowProgress(), null, 4, null);
        } else if (mode instanceof q5.d.c.b.i) {
            aVar.f28331g.setVisibility(0);
            aVar.b.setVisibility(4);
            av.d2 d2Var = this.maxRecordingLimitJob;
            if (d2Var != null) {
                av.d2.a.a(d2Var, null, 1, null);
            }
            this.maxRecordingLimitJob = av.k.d(mVarA, av.g1.b(), null, new e(mode, this, null), 2, null);
        } else if (mode instanceof q5.d.c.b.f) {
            aVar.b.setVisibility(4);
            q5.d.c.b.f fVar = (q5.d.c.b.f) mode;
            aVar.f28336l.e0(H(fVar.getOverlay()), fVar.getShowProgress(), new Function0() { // from class: mq.d
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return n.z(mode);
                }
            });
        } else if (mode instanceof q5.d.c.b.C0470b) {
            aVar.b.setVisibility(4);
            q5.d.c.b.C0470b c0470b = (q5.d.c.b.C0470b) mode;
            if (!Intrinsics.c(aVar.f28329e.getTag(), Integer.valueOf(c0470b.getCountDown()))) {
                TextView countdown = aVar.f28329e;
                Intrinsics.checkNotNullExpressionValue(countdown, "countdown");
                s(countdown, p001kotlin.ranges.d.c(4 - c0470b.getCountDown(), 1) * 1.5f);
                aVar.f28329e.setText(String.valueOf(c0470b.getCountDown()));
                aVar.f28329e.setTag(Integer.valueOf(c0470b.getCountDown()));
            }
            OldSelfieOverlayView.f0(aVar.f28336l, H(c0470b.getOverlay()), c0470b.getShowProgress(), null, 4, null);
        } else if (mode instanceof q5.d.c.b.h) {
            av.d2 d2Var2 = this.maxRecordingLimitJob;
            if (d2Var2 != null) {
                av.d2.a.a(d2Var2, null, 1, null);
            }
            aVar.b.setEnabled(false);
            q5.d.c.b.h hVar = (q5.d.c.b.h) mode;
            aVar.f28336l.e0(H(hVar.getOverlay()), hVar.getShowProgress(), hVar.c());
            if (hVar.getImageCaptured()) {
                aVar.getRoot().setHapticFeedbackEnabled(true);
                aVar.getRoot().performHapticFeedback(this.confirmConst, 2);
            }
        } else if (mode instanceof q5.d.c.b.C0472d) {
            aVar.b.setVisibility(0);
            aVar.b.setOnClickListener(new View.OnClickListener() { // from class: mq.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    n.A(aVar, mVarA, this, mode, view);
                }
            });
            q5.d.c.b.C0472d c0472d = (q5.d.c.b.C0472d) mode;
            if (c0472d.getForceCapture()) {
                aVar.b.setVisibility(4);
                x(aVar, mVarA, this, mode);
            }
            OldSelfieOverlayView.f0(aVar.f28336l, H(c0472d.getOverlay()), c0472d.getShowProgress(), null, 4, null);
        } else if (mode instanceof q5.d.c.b.e) {
            aVar.b.setVisibility(0);
            aVar.b.setOnClickListener(new View.OnClickListener() { // from class: mq.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    n.B(aVar, mode, view);
                }
            });
            q5.d.c.b.e eVar = (q5.d.c.b.e) mode;
            OldSelfieOverlayView.f0(aVar.f28336l, H(eVar.getOverlay()), eVar.getShowProgress(), null, 4, null);
        } else if (mode instanceof q5.d.c.b.a) {
            aVar.b.setVisibility(4);
            q5.d.c.b.a aVar2 = (q5.d.c.b.a) mode;
            OldSelfieOverlayView.f0(aVar.f28336l, H(aVar2.getOverlay()), aVar2.getShowProgress(), null, 4, null);
        } else {
            if (!(mode instanceof q5.d.c.b.C0471c)) {
                throw new zt.l();
            }
            aVar.b.setVisibility(4);
            q5.d.c.b.C0471c c0471c = (q5.d.c.b.C0471c) mode;
            if (c0471c.getStartFinalize()) {
                av.d2 d2Var3 = this.maxRecordingLimitJob;
                if (d2Var3 != null) {
                    av.d2.a.a(d2Var3, null, 1, null);
                }
                av.k.d(mVarA, av.g1.c(), null, new f(mode, rendering, null), 2, null);
            }
            aVar.f28336l.e0(H(c0471c.getOverlay()), c0471c.getShowProgress(), new Function0() { // from class: mq.g
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return n.D(mode);
                }
            });
        }
        ir.a navigationState = rendering.getNavigationState();
        Function0 function0 = new Function0() { // from class: mq.h
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return n.E(rendering);
            }
        };
        Function0 function2 = new Function0() { // from class: mq.i
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return n.F(rendering);
            }
        };
        Pi2NavigationBar navigationBar = aVar.f28332h;
        Intrinsics.checkNotNullExpressionValue(navigationBar, "navigationBar");
        ConstraintLayout constraintLayoutB = aVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutB, "getRoot(...)");
        String navBarTitle = rendering.getNavBarTitle();
        StepStyles.SelfieStepStyle styles = rendering.getStyles();
        xr.c.e(navigationState, function0, function2, null, navigationBar, constraintLayoutB, null, navBarTitle, styles != null ? styles.getNavBarTitleStyleValue() : null, 72, null);
        String watermarkText = rendering.getWatermarkText();
        if (watermarkText == null || StringsKt.p0(watermarkText)) {
            aVar.f28338n.setVisibility(8);
        } else {
            aVar.f28338n.setText(rendering.getWatermarkText());
            aVar.f28338n.setVisibility(0);
        }
        StepStyles.SelfieStepStyle styles2 = rendering.getStyles();
        if (styles2 != null) {
            u(styles2);
            int iC = l2.b.c(this.binding.getRoot().getContext(), jq.b.f20845a);
            this.binding.f28336l.W(styles2);
            Context context2 = this.binding.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            jr.c.b(viewEnvironment, context2, iC);
        }
    }
}
