package com.withpersona.sdk2.inquiry.selfie;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.p000lifecycle.s;
import androidx.p000lifecycle.t;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.selfie.view.OldSelfieOverlayView;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.SelfieCaptureState;
import com.withpersona.sdk2.inquiry.tracking.model.SelfieCaptureStateEventData;
import dn.h0;
import dn.l0;
import dn.m0;
import dn.n0;
import dn.v0;
import fn.o0;
import iu.d2;
import iu.g1;
import iu.p0;
import iu.z0;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ym.ViewEnvironment;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001c\u001a\u00020\r*\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010 \u001a\u00020\u001f*\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010-\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R*\u00103\u001a\u0016\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\r\u0018\u00010.j\u0004\u0018\u0001`08\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u001e\u00107\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u00109\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010,R\u0014\u0010=\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006>"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/c;", "Lym/k;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c;", "Lyp/a;", "binding", "Ldn/g;", "cameraController", "Ldn/n0;", "selfieDirectionFeed", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "<init>", "(Lyp/a;Ldn/g;Ldn/n0;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V", "", "v", "()V", "rendering", "Lym/y;", "viewEnvironment", "w", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c;Lym/y;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "styles", "u", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;)V", "Landroid/widget/TextView;", "", "scale", "s", "(Landroid/widget/TextView;F)V", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView$b;", "H", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;)Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView$b;", "b", "Lyp/a;", "c", "Ldn/g;", "d", "Ldn/n0;", "e", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "Liu/d2;", "f", "Liu/d2;", "maxRecordingLimitJob", "Lkotlin/Function1;", "", "Lcom/withpersona/sdk2/inquiry/selfie/CameraErrorHandler;", "g", "Lkotlin/jvm/functions/Function1;", "currentErrorHandler", "Lkotlin/Function0;", "h", "Lkotlin/jvm/functions/Function0;", "permissionChangedHandler", "i", "cameraStateListenerJob", "", "j", "I", "confirmConst", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements ym.k<SelfieWorkflow.c.C0238c> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final yp.a binding;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final dn.g cameraController;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final n0 selfieDirectionFeed;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public d2 maxRecordingLimitJob;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super Throwable, Unit> currentErrorHandler;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function0<Unit> permissionChangedHandler;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public d2 cameraStateListenerJob;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final int confirmConst;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/withpersona/sdk2/inquiry/selfie/c$a", "Landroidx/lifecycle/f;", "Landroidx/lifecycle/s;", "owner", "", "onResume", "(Landroidx/lifecycle/s;)V", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements androidx.p000lifecycle.f {
        public a() {
        }

        public static final void b(c cVar) {
            Function0 function0 = cVar.permissionChangedHandler;
            if (function0 != null) {
                function0.invoke();
            }
            cVar.v();
        }

        @Override // androidx.p000lifecycle.f
        public void onCreate(s sVar) {
            super.onCreate(sVar);
        }

        @Override // androidx.p000lifecycle.f
        public void onDestroy(s sVar) {
            super.onDestroy(sVar);
        }

        @Override // androidx.p000lifecycle.f
        public void onPause(s sVar) {
            super.onPause(sVar);
        }

        @Override // androidx.p000lifecycle.f
        public void onResume(s owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            ConstraintLayout constraintLayoutB = c.this.binding.getRoot();
            final c cVar = c.this;
            constraintLayoutB.post(new Runnable() { // from class: wp.k
                @Override // java.lang.Runnable
                public final void run() {
                    com.withpersona.sdk2.inquiry.selfie.c.a.b(cVar);
                }
            });
        }

        @Override // androidx.p000lifecycle.f
        public void onStart(s sVar) {
            super.onStart(sVar);
        }

        @Override // androidx.p000lifecycle.f
        public void onStop(s sVar) {
            super.onStop(sVar);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f12932a;

        static {
            int[] iArr = new int[SelfieWorkflow.c.C0238c.EnumC0241c.values().length];
            try {
                iArr[SelfieWorkflow.c.C0238c.EnumC0241c.CLEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SelfieWorkflow.c.C0238c.EnumC0241c.LOOK_LEFT_HINT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SelfieWorkflow.c.C0238c.EnumC0241c.LOOK_RIGHT_HINT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SelfieWorkflow.c.C0238c.EnumC0241c.CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SelfieWorkflow.c.C0238c.EnumC0241c.LOOK_LEFT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SelfieWorkflow.c.C0238c.EnumC0241c.LOOK_RIGHT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[SelfieWorkflow.c.C0238c.EnumC0241c.LOOK_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[SelfieWorkflow.c.C0238c.EnumC0241c.LOOK_DOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[SelfieWorkflow.c.C0238c.EnumC0241c.COMPLETE_WITH_CAPTURE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[SelfieWorkflow.c.C0238c.EnumC0241c.LOOK_UP_HINT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[SelfieWorkflow.c.C0238c.EnumC0241c.LOOK_DOWN_HINT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[SelfieWorkflow.c.C0238c.EnumC0241c.CENTER_COMPLETE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[SelfieWorkflow.c.C0238c.EnumC0241c.LOOK_LEFT_COMPLETE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[SelfieWorkflow.c.C0238c.EnumC0241c.LOOK_RIGHT_COMPLETE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[SelfieWorkflow.c.C0238c.EnumC0241c.LOOK_UP_COMPLETE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[SelfieWorkflow.c.C0238c.EnumC0241c.LOOK_DOWN_COMPLETE.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[SelfieWorkflow.c.C0238c.EnumC0241c.FINALIZING.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[SelfieWorkflow.c.C0238c.EnumC0241c.COMPLETE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            f12932a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.c$c, reason: collision with other inner class name */
    @nt.f(c = "com.withpersona.sdk2.inquiry.selfie.OldCameraScreenRunner$registerCameraStateListener$1", f = "OldCameraScreenRunner.kt", l = {126}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class C0242c extends nt.m implements Function2<p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f12933t;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.c$c$a */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements lu.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ c f12935a;

            public a(c cVar) {
                this.f12935a = cVar;
            }

            @Override // lu.i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(com.withpersona.sdk2.camera.d dVar, lt.b<? super Unit> bVar) {
                Function1 function1;
                if (Intrinsics.c(dVar, com.withpersona.sdk2.camera.d.b.f10021a)) {
                    Function1 function2 = this.f12935a.currentErrorHandler;
                    if (function2 != null) {
                        function2.invoke(new v0());
                    }
                } else if (dVar instanceof com.withpersona.sdk2.camera.d.Closed) {
                    com.withpersona.sdk2.camera.d.Closed closed = (com.withpersona.sdk2.camera.d.Closed) dVar;
                    if (closed.getWasRecordingInterrupted() && (function1 = this.f12935a.currentErrorHandler) != null) {
                        function1.invoke(new l0(closed.getIsClosedDueToBadCameraConfiguration()));
                    }
                }
                return Unit.f22938a;
            }
        }

        public C0242c(lt.b<? super C0242c> bVar) {
            super(2, bVar);
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return c.this.new C0242c(bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
            return ((C0242c) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = mt.c.e();
            int i10 = this.f12933t;
            if (i10 == 0) {
                gt.o.b(obj);
                lu.h<com.withpersona.sdk2.camera.d> hVarA = com.withpersona.sdk2.camera.a.a(c.this.cameraController.b());
                a aVar = new a(c.this);
                this.f12933t = 1;
                if (hVarA.collect(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
            }
            return Unit.f22938a;
        }
    }

    @nt.f(c = "com.withpersona.sdk2.inquiry.selfie.OldCameraScreenRunner$showRendering$1$1", f = "OldCameraScreenRunner.kt", l = {236, 238}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class d extends nt.m implements Function2<p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f12936t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ SelfieWorkflow.c.C0238c.b f12938v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ androidx.p000lifecycle.m f12939w;

        @nt.f(c = "com.withpersona.sdk2.inquiry.selfie.OldCameraScreenRunner$showRendering$1$1$1", f = "OldCameraScreenRunner.kt", l = {}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/withpersona/sdk2/camera/d;", "it", "", "<anonymous>", "(Lcom/withpersona/sdk2/camera/d;)Z"}, k = 3, mv = {2, 2, 0})
        public static final class a extends nt.m implements Function2<com.withpersona.sdk2.camera.d, lt.b<? super Boolean>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f12940t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f12941u;

            public a(lt.b<? super a> bVar) {
                super(2, bVar);
            }

            @Override // nt.a
            public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
                a aVar = new a(bVar);
                aVar.f12941u = obj;
                return aVar;
            }

            @Override // nt.a
            public final Object invokeSuspend(Object obj) {
                com.withpersona.sdk2.camera.d dVar = (com.withpersona.sdk2.camera.d) this.f12941u;
                mt.c.e();
                if (this.f12940t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
                return nt.b.a(!(dVar instanceof com.withpersona.sdk2.camera.d.Ready));
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public final Object invoke(com.withpersona.sdk2.camera.d dVar, lt.b<? super Boolean> bVar) {
                return ((a) create(dVar, bVar)).invokeSuspend(Unit.f22938a);
            }
        }

        @nt.f(c = "com.withpersona.sdk2.inquiry.selfie.OldCameraScreenRunner$showRendering$1$1$2", f = "OldCameraScreenRunner.kt", l = {240}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
        public static final class b extends nt.m implements Function2<p0, lt.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f12942t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ SelfieWorkflow.c.C0238c.b f12943u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ c f12944v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ androidx.p000lifecycle.m f12945w;

            @nt.f(c = "com.withpersona.sdk2.inquiry.selfie.OldCameraScreenRunner$showRendering$1$1$2$1$1", f = "OldCameraScreenRunner.kt", l = {245, 249}, m = "invokeSuspend")
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
            public static final class a extends nt.m implements Function2<p0, lt.b<? super Unit>, Object> {

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public int f12946t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public final /* synthetic */ SelfieWorkflow.c.C0238c.b f12947u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                public final /* synthetic */ c f12948v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(SelfieWorkflow.c.C0238c.b bVar, c cVar, lt.b<? super a> bVar2) {
                    super(2, bVar2);
                    this.f12947u = bVar;
                    this.f12948v = cVar;
                }

                @Override // nt.a
                public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
                    return new a(this.f12947u, this.f12948v, bVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
                    return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
                
                    if (r12 == r0) goto L19;
                 */
                @Override // nt.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                    /*
                        r11 = this;
                        java.lang.Object r0 = mt.c.e()
                        int r1 = r11.f12946t
                        r2 = 1
                        r3 = 2
                        if (r1 == 0) goto L24
                        if (r1 == r2) goto L20
                        if (r1 != r3) goto L18
                        gt.o.b(r12)
                        gt.n r12 = (gt.n) r12
                        java.lang.Object r12 = r12.getValue()
                        goto L5c
                    L18:
                        java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r12.<init>(r0)
                        throw r12
                    L20:
                        gt.o.b(r12)
                        goto L38
                    L24:
                        gt.o.b(r12)
                        com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$c$b r12 = r11.f12947u
                        com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$c$b$g r12 = (com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.c.C0238c.b.g) r12
                        long r4 = r12.getMaxRecordingLengthMs()
                        r11.f12946t = r2
                        java.lang.Object r12 = iu.z0.b(r4, r11)
                        if (r12 != r0) goto L38
                        goto L5b
                    L38:
                        com.withpersona.sdk2.inquiry.selfie.c r12 = r11.f12948v
                        dn.g r12 = com.withpersona.sdk2.inquiry.selfie.c.l(r12)
                        lu.p0 r12 = r12.b()
                        java.lang.Object r12 = r12.getValue()
                        boolean r12 = r12 instanceof com.withpersona.sdk2.camera.d.Closed
                        if (r12 == 0) goto L4d
                        kotlin.Unit r12 = kotlin.Unit.f22938a
                        return r12
                    L4d:
                        com.withpersona.sdk2.inquiry.selfie.c r12 = r11.f12948v
                        dn.g r12 = com.withpersona.sdk2.inquiry.selfie.c.l(r12)
                        r11.f12946t = r3
                        java.lang.Object r12 = r12.k(r11)
                        if (r12 != r0) goto L5c
                    L5b:
                        return r0
                    L5c:
                        boolean r0 = gt.n.h(r12)
                        if (r0 == 0) goto L67
                        java.io.File r12 = (java.io.File) r12
                        r12.delete()
                    L67:
                        com.withpersona.sdk2.inquiry.selfie.c r12 = r11.f12948v
                        com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger r12 = com.withpersona.sdk2.inquiry.selfie.c.p(r12)
                        com.withpersona.sdk2.inquiry.tracking.model.SelfieCaptureStateEventData r4 = new com.withpersona.sdk2.inquiry.tracking.model.SelfieCaptureStateEventData
                        com.withpersona.sdk2.inquiry.tracking.model.SelfieCaptureState r5 = com.withpersona.sdk2.inquiry.tracking.model.SelfieCaptureState.RECORDING_TIMED_OUT
                        r9 = 8
                        r10 = 0
                        java.lang.String r6 = "local_video"
                        r7 = 0
                        r8 = 0
                        r4.<init>(r5, r6, r7, r8, r9, r10)
                        r0 = 0
                        r1 = 0
                        com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger.logSelfieCaptureStateEvent$default(r12, r4, r0, r3, r1)
                        com.withpersona.sdk2.inquiry.selfie.c r12 = r11.f12948v
                        kotlin.jvm.functions.Function1 r12 = com.withpersona.sdk2.inquiry.selfie.c.m(r12)
                        if (r12 == 0) goto L90
                        dn.m0 r0 = new dn.m0
                        r0.<init>()
                        r12.invoke(r0)
                    L90:
                        kotlin.Unit r12 = kotlin.Unit.f22938a
                        return r12
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.selfie.c.d.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(SelfieWorkflow.c.C0238c.b bVar, c cVar, androidx.p000lifecycle.m mVar, lt.b<? super b> bVar2) {
                super(2, bVar2);
                this.f12943u = bVar;
                this.f12944v = cVar;
                this.f12945w = mVar;
            }

            @Override // nt.a
            public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
                return new b(this.f12943u, this.f12944v, this.f12945w, bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
                return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
            }

            @Override // nt.a
            public final Object invokeSuspend(Object obj) {
                Object objD;
                Object objE = mt.c.e();
                int i10 = this.f12942t;
                if (i10 == 0) {
                    gt.o.b(obj);
                    if (((SelfieWorkflow.c.C0238c.b.g) this.f12943u).getRecordLocalVideo()) {
                        dn.g gVar = this.f12944v.cameraController;
                        this.f12942t = 1;
                        objD = gVar.d(this);
                        if (objD == objE) {
                            return objE;
                        }
                    }
                    ((SelfieWorkflow.c.C0238c.b.g) this.f12943u).d().invoke(this.f12944v.cameraController.a());
                    return Unit.f22938a;
                }
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
                objD = ((gt.n) obj).getValue();
                c cVar = this.f12944v;
                androidx.p000lifecycle.m mVar = this.f12945w;
                SelfieWorkflow.c.C0238c.b bVar = this.f12943u;
                if (gt.n.h(objD) && ((Boolean) objD).booleanValue()) {
                    d2 d2Var = cVar.maxRecordingLimitJob;
                    if (d2Var != null) {
                        d2.a.a(d2Var, null, 1, null);
                    }
                    cVar.maxRecordingLimitJob = iu.k.d(mVar, g1.b(), null, new a(bVar, cVar, null), 2, null);
                }
                SelfieWorkflow.c.C0238c.b bVar2 = this.f12943u;
                Throwable thE = gt.n.e(objD);
                if (thE != null) {
                    ((SelfieWorkflow.c.C0238c.b.g) bVar2).c().invoke(thE);
                }
                ((SelfieWorkflow.c.C0238c.b.g) this.f12943u).d().invoke(this.f12944v.cameraController.a());
                return Unit.f22938a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(SelfieWorkflow.c.C0238c.b bVar, androidx.p000lifecycle.m mVar, lt.b<? super d> bVar2) {
            super(2, bVar2);
            this.f12938v = bVar;
            this.f12939w = mVar;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return c.this.new d(this.f12938v, this.f12939w, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
        
            if (iu.i.g(r8, r1, r7) == r0) goto L15;
         */
        @Override // nt.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = mt.c.e()
                int r1 = r7.f12936t
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L1f
                if (r1 == r4) goto L1b
                if (r1 != r3) goto L13
                gt.o.b(r8)
                goto L56
            L13:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1b:
                gt.o.b(r8)
                goto L3e
            L1f:
                gt.o.b(r8)
                com.withpersona.sdk2.inquiry.selfie.c r8 = com.withpersona.sdk2.inquiry.selfie.c.this
                dn.g r8 = com.withpersona.sdk2.inquiry.selfie.c.l(r8)
                lu.p0 r8 = r8.b()
                com.withpersona.sdk2.inquiry.selfie.c$d$a r1 = new com.withpersona.sdk2.inquiry.selfie.c$d$a
                r1.<init>(r2)
                lu.h r8 = lu.j.N(r8, r1)
                r7.f12936t = r4
                java.lang.Object r8 = lu.j.i(r8, r7)
                if (r8 != r0) goto L3e
                goto L55
            L3e:
                iu.n2 r8 = iu.g1.c()
                com.withpersona.sdk2.inquiry.selfie.c$d$b r1 = new com.withpersona.sdk2.inquiry.selfie.c$d$b
                com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$c$b r4 = r7.f12938v
                com.withpersona.sdk2.inquiry.selfie.c r5 = com.withpersona.sdk2.inquiry.selfie.c.this
                androidx.lifecycle.m r6 = r7.f12939w
                r1.<init>(r4, r5, r6, r2)
                r7.f12936t = r3
                java.lang.Object r8 = iu.i.g(r8, r1, r7)
                if (r8 != r0) goto L56
            L55:
                return r0
            L56:
                kotlin.Unit r8 = kotlin.Unit.f22938a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.selfie.c.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @nt.f(c = "com.withpersona.sdk2.inquiry.selfie.OldCameraScreenRunner$showRendering$1$2", f = "OldCameraScreenRunner.kt", l = {280}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class e extends nt.m implements Function2<p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f12949t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ SelfieWorkflow.c.C0238c.b f12950u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ c f12951v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(SelfieWorkflow.c.C0238c.b bVar, c cVar, lt.b<? super e> bVar2) {
            super(2, bVar2);
            this.f12950u = bVar;
            this.f12951v = cVar;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return new e(this.f12950u, this.f12951v, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
            return ((e) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = mt.c.e();
            int i10 = this.f12949t;
            if (i10 == 0) {
                gt.o.b(obj);
                long maxRecordingLengthMs = ((SelfieWorkflow.c.C0238c.b.i) this.f12950u).getMaxRecordingLengthMs();
                this.f12949t = 1;
                if (z0.b(maxRecordingLengthMs, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
            }
            if (this.f12951v.cameraController.b().getValue() instanceof com.withpersona.sdk2.camera.d.Closed) {
                return Unit.f22938a;
            }
            TrackingEventsLogger.logSelfieCaptureStateEvent$default(this.f12951v.trackingEventsLogger, new SelfieCaptureStateEventData(SelfieCaptureState.RECORDING_TIMED_OUT, "webrtc", null, null, 8, null), false, 2, null);
            Function1 function1 = this.f12951v.currentErrorHandler;
            if (function1 != null) {
                function1.invoke(new m0());
            }
            return Unit.f22938a;
        }
    }

    @nt.f(c = "com.withpersona.sdk2.inquiry.selfie.OldCameraScreenRunner$showRendering$1$6", f = "OldCameraScreenRunner.kt", l = {400}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class f extends nt.m implements Function2<p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f12952t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ SelfieWorkflow.c.C0238c.b f12954v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ SelfieWorkflow.c.C0238c f12955w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(SelfieWorkflow.c.C0238c.b bVar, SelfieWorkflow.c.C0238c c0238c, lt.b<? super f> bVar2) {
            super(2, bVar2);
            this.f12954v = bVar;
            this.f12955w = c0238c;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return c.this.new f(this.f12954v, this.f12955w, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
            return ((f) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objK;
            Object objE = mt.c.e();
            int i10 = this.f12952t;
            if (i10 == 0) {
                gt.o.b(obj);
                dn.g gVar = c.this.cameraController;
                this.f12952t = 1;
                objK = gVar.k(this);
                if (objK == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
                objK = ((gt.n) obj).getValue();
            }
            SelfieWorkflow.c.C0238c.b bVar = this.f12954v;
            if (gt.n.h(objK)) {
                ((SelfieWorkflow.c.C0238c.b.C0240c) bVar).b().invoke((File) objK);
            }
            SelfieWorkflow.c.C0238c c0238c = this.f12955w;
            Throwable thE = gt.n.e(objK);
            if (thE != null && !(thE instanceof h0)) {
                c0238c.i().invoke(thE);
            }
            return Unit.f22938a;
        }
    }

    @nt.f(c = "com.withpersona.sdk2.inquiry.selfie.OldCameraScreenRunner$showRendering$1$takePhoto$1", f = "OldCameraScreenRunner.kt", l = {333}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class g extends nt.m implements Function2<p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f12956t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ SelfieWorkflow.c.C0238c.b f12958v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(SelfieWorkflow.c.C0238c.b bVar, lt.b<? super g> bVar2) {
            super(2, bVar2);
            this.f12958v = bVar;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return c.this.new g(this.f12958v, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
            return ((g) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objG;
            Object objE = mt.c.e();
            int i10 = this.f12956t;
            if (i10 == 0) {
                gt.o.b(obj);
                dn.g gVar = c.this.cameraController;
                this.f12956t = 1;
                objG = gVar.g(this);
                if (objG == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
                objG = ((gt.n) obj).getValue();
            }
            SelfieWorkflow.c.C0238c.b bVar = this.f12958v;
            if (gt.n.h(objG)) {
                Function1<String, Unit> function1D = ((SelfieWorkflow.c.C0238c.b.d) bVar).d();
                String absolutePath = ((File) objG).getAbsolutePath();
                Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
                function1D.invoke(absolutePath);
            }
            SelfieWorkflow.c.C0238c.b bVar2 = this.f12958v;
            Throwable thE = gt.n.e(objG);
            if (thE != null && !(thE instanceof o0)) {
                ((SelfieWorkflow.c.C0238c.b.d) bVar2).c().invoke(thE);
            }
            return Unit.f22938a;
        }
    }

    public c(@NotNull yp.a binding, @NotNull dn.g cameraController, @NotNull n0 selfieDirectionFeed, @NotNull TrackingEventsLogger trackingEventsLogger) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(cameraController, "cameraController");
        Intrinsics.checkNotNullParameter(selfieDirectionFeed, "selfieDirectionFeed");
        Intrinsics.checkNotNullParameter(trackingEventsLogger, "trackingEventsLogger");
        this.binding = binding;
        this.cameraController = cameraController;
        this.selfieDirectionFeed = selfieDirectionFeed;
        this.trackingEventsLogger = trackingEventsLogger;
        binding.f36944l.setPreviewView(cameraController.getPreviewView());
        ConstraintLayout constraintLayoutB = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutB, "getRoot(...)");
        uq.g.d(constraintLayoutB, false, false, false, false, 15, null);
        Context context = binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        hq.g.i(context).a().a(new a());
        v();
        this.confirmConst = Build.VERSION.SDK_INT >= 30 ? 16 : 3;
    }

    public static final void A(yp.a aVar, androidx.p000lifecycle.m mVar, c cVar, SelfieWorkflow.c.C0238c.b bVar, View view) {
        x(aVar, mVar, cVar, bVar);
    }

    public static final void B(yp.a aVar, final SelfieWorkflow.c.C0238c.b bVar, View view) {
        if (aVar.f36944l.a0()) {
            ((SelfieWorkflow.c.C0238c.b.e) bVar).b().invoke();
        } else {
            aVar.f36944l.X(new Function0() { // from class: wp.j
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.withpersona.sdk2.inquiry.selfie.c.C(bVar);
                }
            });
        }
    }

    public static final Unit C(SelfieWorkflow.c.C0238c.b bVar) {
        ((SelfieWorkflow.c.C0238c.b.e) bVar).b().invoke();
        return Unit.f22938a;
    }

    public static final Unit D(SelfieWorkflow.c.C0238c.b bVar) {
        ((SelfieWorkflow.c.C0238c.b.C0240c) bVar).c().invoke();
        return Unit.f22938a;
    }

    public static final Unit E(SelfieWorkflow.c.C0238c c0238c) {
        c0238c.h().invoke();
        return Unit.f22938a;
    }

    public static final Unit F(SelfieWorkflow.c.C0238c c0238c) {
        c0238c.j().invoke();
        return Unit.f22938a;
    }

    public static final void G(androidx.p000lifecycle.m mVar, c cVar, SelfieWorkflow.c.C0238c.b bVar) {
        iu.k.d(mVar, g1.c(), null, cVar.new g(bVar, null), 2, null);
    }

    public static final void t(TextView textView) {
        textView.setAlpha(1.0f);
        textView.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v() {
        d2 d2Var = this.cameraStateListenerJob;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        Context context = this.binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.cameraStateListenerJob = iu.k.d(t.a(hq.g.i(context)), null, null, new C0242c(null), 3, null);
    }

    public static final void x(yp.a aVar, final androidx.p000lifecycle.m mVar, final c cVar, final SelfieWorkflow.c.C0238c.b bVar) {
        aVar.b.setEnabled(false);
        if (aVar.f36944l.a0()) {
            G(mVar, cVar, bVar);
        } else {
            aVar.f36944l.X(new Function0() { // from class: wp.i
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.withpersona.sdk2.inquiry.selfie.c.y(mVar, cVar, bVar);
                }
            });
        }
    }

    public static final Unit y(androidx.p000lifecycle.m mVar, c cVar, SelfieWorkflow.c.C0238c.b bVar) {
        G(mVar, cVar, bVar);
        return Unit.f22938a;
    }

    public static final Unit z(SelfieWorkflow.c.C0238c.b bVar) {
        ((SelfieWorkflow.c.C0238c.b.f) bVar).b().invoke();
        return Unit.f22938a;
    }

    public final OldSelfieOverlayView.b H(SelfieWorkflow.c.C0238c.EnumC0241c enumC0241c) {
        switch (b.f12932a[enumC0241c.ordinal()]) {
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
            case 18:
                return OldSelfieOverlayView.b.COMPLETE;
            default:
                throw new gt.l();
        }
    }

    public final void s(final TextView textView, float f10) {
        textView.setVisibility(0);
        textView.animate().setDuration(500L).scaleX(f10).scaleY(f10).alpha(0.0f).withEndAction(new Runnable() { // from class: wp.h
            @Override // java.lang.Runnable
            public final void run() {
                com.withpersona.sdk2.inquiry.selfie.c.t(textView);
            }
        });
    }

    public final void u(StepStyles.SelfieStepStyle styles) {
        TextBasedComponentStyle titleStyleValue = styles.getTitleStyleValue();
        if (titleStyleValue != null) {
            TextView title = this.binding.f36945m;
            Intrinsics.checkNotNullExpressionValue(title, "title");
            hr.h0.l(title, titleStyleValue, null, 2, null);
            this.binding.f36945m.setTextColor(-1);
        }
        TextBasedComponentStyle selfieCaptureHintTextStyle = styles.getSelfieCaptureHintTextStyle();
        if (selfieCaptureHintTextStyle != null) {
            TextView hintMessage = this.binding.f36938f;
            Intrinsics.checkNotNullExpressionValue(hintMessage, "hintMessage");
            hr.h0.l(hintMessage, selfieCaptureHintTextStyle, null, 2, null);
            this.binding.f36938f.setTextColor(-1);
        }
        Integer capturePageHeaderIconColorValue = styles.getCapturePageHeaderIconColorValue();
        if (capturePageHeaderIconColorValue != null) {
            this.binding.f36940h.setControlsColor(capturePageHeaderIconColorValue.intValue());
        }
    }

    @Override // ym.k
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void b(@NotNull final SelfieWorkflow.c.C0238c rendering, @NotNull ViewEnvironment viewEnvironment) {
        Function1<? super Throwable, Unit> function1;
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        if (rendering.getRecordingLocallyRequired() && !this.cameraController.getRecordingStarted() && (function1 = this.currentErrorHandler) != null) {
            function1.invoke(new l0(false));
        }
        this.currentErrorHandler = rendering.i();
        this.permissionChangedHandler = rendering.k();
        this.cameraController.j();
        this.cameraController.getPreviewView().setVisibility(0);
        if ((rendering.getMode() instanceof SelfieWorkflow.c.C0238c.b.i) || (rendering.getMode() instanceof SelfieWorkflow.c.C0238c.b.g)) {
            this.binding.f36936d.setVisibility(0);
        } else {
            this.binding.f36936d.setVisibility(8);
        }
        this.selfieDirectionFeed.m(rendering.getRequireStrictSelfieCapture() ? 0.45d : 0.35d, 0.8d, false);
        final yp.a aVar = this.binding;
        Context context = aVar.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        final androidx.p000lifecycle.m mVarA = t.a(hq.g.i(context));
        TextView textView = this.binding.f36945m;
        String title = rendering.getCom.withpersona.sdk2.inquiry.network.dto.ui.components.Title.type java.lang.String();
        if (title == null) {
            title = "";
        }
        textView.setText(title);
        TextView textView2 = this.binding.f36945m;
        CharSequence text = aVar.f36945m.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        textView2.setVisibility(StringsKt.p0(text) ? 8 : 0);
        String message = rendering.getMessage();
        String str = message != null ? message : "";
        if (!Intrinsics.c(str, aVar.f36938f.getText())) {
            aVar.f36938f.setText(str);
        }
        aVar.f36944l.setLeftPoseImage(rendering.getAssetOverrides().getLeftPoseImage());
        aVar.f36944l.setRightPoseImage(rendering.getAssetOverrides().getRightPoseImage());
        int i10 = b.f12932a[rendering.getMode().getOverlay().ordinal()];
        if (i10 == 1) {
            TextView textView3 = aVar.f36938f;
            textView3.announceForAccessibility(textView3.getContext().getString(tp.g.T));
        } else if (i10 == 2) {
            TextView textView4 = aVar.f36938f;
            textView4.announceForAccessibility(textView4.getContext().getString(tp.g.V));
        } else if (i10 == 3) {
            TextView textView5 = aVar.f36938f;
            textView5.announceForAccessibility(textView5.getContext().getString(tp.g.W));
        } else if (rendering.getMode() instanceof SelfieWorkflow.c.C0238c.b.d) {
            TextView textView6 = aVar.f36938f;
            textView6.announceForAccessibility(textView6.getContext().getString(tp.g.U));
        }
        aVar.b.setEnabled(true);
        if (!(rendering.getMode() instanceof SelfieWorkflow.c.C0238c.b.C0239b)) {
            aVar.f36937e.setVisibility(8);
        }
        if (!(rendering.getMode() instanceof SelfieWorkflow.c.C0238c.b.i)) {
            aVar.f36939g.setVisibility(8);
        }
        final SelfieWorkflow.c.C0238c.b mode = rendering.getMode();
        if (mode instanceof SelfieWorkflow.c.C0238c.b.g) {
            aVar.b.setVisibility(4);
            iu.k.d(mVarA, g1.a(), null, new d(mode, mVarA, null), 2, null);
            SelfieWorkflow.c.C0238c.b.g gVar = (SelfieWorkflow.c.C0238c.b.g) mode;
            OldSelfieOverlayView.f0(aVar.f36944l, H(gVar.getOverlay()), gVar.getShowProgress(), null, 4, null);
        } else if (mode instanceof SelfieWorkflow.c.C0238c.b.i) {
            aVar.f36939g.setVisibility(0);
            aVar.b.setVisibility(4);
            d2 d2Var = this.maxRecordingLimitJob;
            if (d2Var != null) {
                d2.a.a(d2Var, null, 1, null);
            }
            this.maxRecordingLimitJob = iu.k.d(mVarA, g1.b(), null, new e(mode, this, null), 2, null);
        } else if (mode instanceof SelfieWorkflow.c.C0238c.b.f) {
            aVar.b.setVisibility(4);
            SelfieWorkflow.c.C0238c.b.f fVar = (SelfieWorkflow.c.C0238c.b.f) mode;
            aVar.f36944l.e0(H(fVar.getOverlay()), fVar.getShowProgress(), new Function0() { // from class: wp.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.withpersona.sdk2.inquiry.selfie.c.z(mode);
                }
            });
        } else if (mode instanceof SelfieWorkflow.c.C0238c.b.C0239b) {
            aVar.b.setVisibility(4);
            SelfieWorkflow.c.C0238c.b.C0239b c0239b = (SelfieWorkflow.c.C0238c.b.C0239b) mode;
            if (!Intrinsics.c(aVar.f36937e.getTag(), Integer.valueOf(c0239b.getCountDown()))) {
                TextView countdown = aVar.f36937e;
                Intrinsics.checkNotNullExpressionValue(countdown, "countdown");
                s(countdown, kotlin.ranges.d.c(4 - c0239b.getCountDown(), 1) * 1.5f);
                aVar.f36937e.setText(String.valueOf(c0239b.getCountDown()));
                aVar.f36937e.setTag(Integer.valueOf(c0239b.getCountDown()));
            }
            OldSelfieOverlayView.f0(aVar.f36944l, H(c0239b.getOverlay()), c0239b.getShowProgress(), null, 4, null);
        } else if (mode instanceof SelfieWorkflow.c.C0238c.b.h) {
            d2 d2Var2 = this.maxRecordingLimitJob;
            if (d2Var2 != null) {
                d2.a.a(d2Var2, null, 1, null);
            }
            aVar.b.setEnabled(false);
            SelfieWorkflow.c.C0238c.b.h hVar = (SelfieWorkflow.c.C0238c.b.h) mode;
            aVar.f36944l.e0(H(hVar.getOverlay()), hVar.getShowProgress(), hVar.c());
            if (hVar.getImageCaptured()) {
                aVar.getRoot().setHapticFeedbackEnabled(true);
                aVar.getRoot().performHapticFeedback(this.confirmConst, 2);
            }
        } else if (mode instanceof SelfieWorkflow.c.C0238c.b.d) {
            aVar.b.setVisibility(0);
            aVar.b.setOnClickListener(new View.OnClickListener() { // from class: wp.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    com.withpersona.sdk2.inquiry.selfie.c.A(aVar, mVarA, this, mode, view);
                }
            });
            SelfieWorkflow.c.C0238c.b.d dVar = (SelfieWorkflow.c.C0238c.b.d) mode;
            if (dVar.getForceCapture()) {
                aVar.b.setVisibility(4);
                x(aVar, mVarA, this, mode);
            }
            OldSelfieOverlayView.f0(aVar.f36944l, H(dVar.getOverlay()), dVar.getShowProgress(), null, 4, null);
        } else if (mode instanceof SelfieWorkflow.c.C0238c.b.e) {
            aVar.b.setVisibility(0);
            aVar.b.setOnClickListener(new View.OnClickListener() { // from class: wp.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    com.withpersona.sdk2.inquiry.selfie.c.B(aVar, mode, view);
                }
            });
            SelfieWorkflow.c.C0238c.b.e eVar = (SelfieWorkflow.c.C0238c.b.e) mode;
            OldSelfieOverlayView.f0(aVar.f36944l, H(eVar.getOverlay()), eVar.getShowProgress(), null, 4, null);
        } else if (mode instanceof SelfieWorkflow.c.C0238c.b.a) {
            aVar.b.setVisibility(4);
            SelfieWorkflow.c.C0238c.b.a aVar2 = (SelfieWorkflow.c.C0238c.b.a) mode;
            OldSelfieOverlayView.f0(aVar.f36944l, H(aVar2.getOverlay()), aVar2.getShowProgress(), null, 4, null);
        } else {
            if (!(mode instanceof SelfieWorkflow.c.C0238c.b.C0240c)) {
                throw new gt.l();
            }
            aVar.b.setVisibility(4);
            SelfieWorkflow.c.C0238c.b.C0240c c0240c = (SelfieWorkflow.c.C0238c.b.C0240c) mode;
            if (c0240c.getStartFinalize()) {
                d2 d2Var3 = this.maxRecordingLimitJob;
                if (d2Var3 != null) {
                    d2.a.a(d2Var3, null, 1, null);
                }
                iu.k.d(mVarA, g1.c(), null, new f(mode, rendering, null), 2, null);
            }
            aVar.f36944l.e0(H(c0240c.getOverlay()), c0240c.getShowProgress(), new Function0() { // from class: wp.e
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.withpersona.sdk2.inquiry.selfie.c.D(mode);
                }
            });
        }
        NavigationState navigationState = rendering.getNavigationState();
        Function0 function0 = new Function0() { // from class: wp.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.withpersona.sdk2.inquiry.selfie.c.E(rendering);
            }
        };
        Function0 function2 = new Function0() { // from class: wp.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.withpersona.sdk2.inquiry.selfie.c.F(rendering);
            }
        };
        Pi2NavigationBar navigationBar = aVar.f36940h;
        Intrinsics.checkNotNullExpressionValue(navigationBar, "navigationBar");
        ConstraintLayout constraintLayoutB = aVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutB, "getRoot(...)");
        String navBarTitle = rendering.getNavBarTitle();
        StepStyles.SelfieStepStyle styles = rendering.getStyles();
        gr.c.e(navigationState, function0, function2, null, navigationBar, constraintLayoutB, null, navBarTitle, styles != null ? styles.getNavBarTitleStyleValue() : null, 72, null);
        String watermarkText = rendering.getWatermarkText();
        if (watermarkText == null || StringsKt.p0(watermarkText)) {
            aVar.f36946n.setVisibility(8);
        } else {
            aVar.f36946n.setText(rendering.getWatermarkText());
            aVar.f36946n.setVisibility(0);
        }
        StepStyles.SelfieStepStyle styles2 = rendering.getStyles();
        if (styles2 != null) {
            u(styles2);
            int iC = l2.b.c(this.binding.getRoot().getContext(), tp.b.f32496a);
            this.binding.f36944l.W(styles2);
            Context context2 = this.binding.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            tq.c.b(viewEnvironment, context2, iC);
        }
    }
}
