package com.withpersona.sdk2.inquiry.selfie;

import an.ViewEnvironment;
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
import fn.h0;
import fn.l0;
import fn.m0;
import fn.n0;
import fn.v0;
import hn.o0;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ku.d2;
import ku.g1;
import ku.p0;
import ku.z0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001c\u001a\u00020\r*\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010 \u001a\u00020\u001f*\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010-\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R*\u00103\u001a\u0016\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\r\u0018\u00010.j\u0004\u0018\u0001`08\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u001e\u00107\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u00109\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010,R\u0014\u0010=\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006>"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/c;", "Lan/k;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c;", "Laq/a;", "binding", "Lfn/g;", "cameraController", "Lfn/n0;", "selfieDirectionFeed", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "<init>", "(Laq/a;Lfn/g;Lfn/n0;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V", "", "v", "()V", "rendering", "Lan/y;", "viewEnvironment", "w", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c;Lan/y;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "styles", "u", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;)V", "Landroid/widget/TextView;", "", "scale", "s", "(Landroid/widget/TextView;F)V", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView$b;", "H", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;)Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView$b;", "b", "Laq/a;", "c", "Lfn/g;", "d", "Lfn/n0;", "e", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "Lku/d2;", "f", "Lku/d2;", "maxRecordingLimitJob", "Lkotlin/Function1;", "", "Lcom/withpersona/sdk2/inquiry/selfie/CameraErrorHandler;", "g", "Lkotlin/jvm/functions/Function1;", "currentErrorHandler", "Lkotlin/Function0;", "h", "Lkotlin/jvm/functions/Function0;", "permissionChangedHandler", "i", "cameraStateListenerJob", "", "j", "I", "confirmConst", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements an.k<SelfieWorkflow.c.C0235c> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final aq.a binding;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final fn.g cameraController;

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
            ConstraintLayout root = c.this.binding.getRoot();
            final c cVar = c.this;
            root.post(new Runnable() { // from class: yp.k
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
        public static final /* synthetic */ int[] f12851a;

        static {
            int[] iArr = new int[SelfieWorkflow.c.C0235c.EnumC0238c.values().length];
            try {
                iArr[SelfieWorkflow.c.C0235c.EnumC0238c.CLEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SelfieWorkflow.c.C0235c.EnumC0238c.LOOK_LEFT_HINT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SelfieWorkflow.c.C0235c.EnumC0238c.LOOK_RIGHT_HINT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SelfieWorkflow.c.C0235c.EnumC0238c.CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SelfieWorkflow.c.C0235c.EnumC0238c.LOOK_LEFT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SelfieWorkflow.c.C0235c.EnumC0238c.LOOK_RIGHT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[SelfieWorkflow.c.C0235c.EnumC0238c.LOOK_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[SelfieWorkflow.c.C0235c.EnumC0238c.LOOK_DOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[SelfieWorkflow.c.C0235c.EnumC0238c.COMPLETE_WITH_CAPTURE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[SelfieWorkflow.c.C0235c.EnumC0238c.LOOK_UP_HINT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[SelfieWorkflow.c.C0235c.EnumC0238c.LOOK_DOWN_HINT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[SelfieWorkflow.c.C0235c.EnumC0238c.CENTER_COMPLETE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[SelfieWorkflow.c.C0235c.EnumC0238c.LOOK_LEFT_COMPLETE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[SelfieWorkflow.c.C0235c.EnumC0238c.LOOK_RIGHT_COMPLETE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[SelfieWorkflow.c.C0235c.EnumC0238c.LOOK_UP_COMPLETE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[SelfieWorkflow.c.C0235c.EnumC0238c.LOOK_DOWN_COMPLETE.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[SelfieWorkflow.c.C0235c.EnumC0238c.FINALIZING.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[SelfieWorkflow.c.C0235c.EnumC0238c.COMPLETE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            f12851a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.inquiry.selfie.OldCameraScreenRunner$registerCameraStateListener$1", f = "OldCameraScreenRunner.kt", l = {126}, m = "invokeSuspend")
    public static final class C0239c extends pt.m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f12852t;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.c$c$a */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements nu.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ c f12854a;

            public a(c cVar) {
                this.f12854a = cVar;
            }

            @Override // nu.i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(com.withpersona.sdk2.camera.d dVar, nt.b<? super Unit> bVar) {
                Function1 function1;
                if (Intrinsics.c(dVar, com.withpersona.sdk2.camera.d.b.f9940a)) {
                    Function1 function2 = this.f12854a.currentErrorHandler;
                    if (function2 != null) {
                        function2.invoke(new v0());
                    }
                } else if (dVar instanceof com.withpersona.sdk2.camera.d.Closed) {
                    com.withpersona.sdk2.camera.d.Closed closed = (com.withpersona.sdk2.camera.d.Closed) dVar;
                    if (closed.getWasRecordingInterrupted() && (function1 = this.f12854a.currentErrorHandler) != null) {
                        function1.invoke(new l0(closed.getIsClosedDueToBadCameraConfiguration()));
                    }
                }
                return Unit.f22483a;
            }
        }

        public C0239c(nt.b<? super C0239c> bVar) {
            super(2, bVar);
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return c.this.new C0239c(bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f12852t;
            if (i10 == 0) {
                jt.o.b(obj);
                nu.h<com.withpersona.sdk2.camera.d> hVarA = com.withpersona.sdk2.camera.a.a(c.this.cameraController.b());
                a aVar = new a(c.this);
                this.f12852t = 1;
                if (hVarA.collect(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
            }
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((C0239c) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.inquiry.selfie.OldCameraScreenRunner$showRendering$1$1", f = "OldCameraScreenRunner.kt", l = {236, 238}, m = "invokeSuspend")
    public static final class d extends pt.m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f12855t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ SelfieWorkflow.c.C0235c.b f12857v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ androidx.p000lifecycle.m f12858w;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/withpersona/sdk2/camera/d;", "it", "", "<anonymous>", "(Lcom/withpersona/sdk2/camera/d;)Z"}, k = 3, mv = {2, 2, 0})
        @pt.f(c = "com.withpersona.sdk2.inquiry.selfie.OldCameraScreenRunner$showRendering$1$1$1", f = "OldCameraScreenRunner.kt", l = {}, m = "invokeSuspend")
        public static final class a extends pt.m implements Function2<com.withpersona.sdk2.camera.d, nt.b<? super Boolean>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f12859t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f12860u;

            public a(nt.b<? super a> bVar) {
                super(2, bVar);
            }

            @Override // pt.a
            public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
                a aVar = new a(bVar);
                aVar.f12860u = obj;
                return aVar;
            }

            @Override // pt.a
            public final Object invokeSuspend(Object obj) {
                com.withpersona.sdk2.camera.d dVar = (com.withpersona.sdk2.camera.d) this.f12860u;
                ot.c.e();
                if (this.f12859t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
                return pt.b.a(!(dVar instanceof com.withpersona.sdk2.camera.d.Ready));
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public final Object invoke(com.withpersona.sdk2.camera.d dVar, nt.b<? super Boolean> bVar) {
                return ((a) create(dVar, bVar)).invokeSuspend(Unit.f22483a);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
        @pt.f(c = "com.withpersona.sdk2.inquiry.selfie.OldCameraScreenRunner$showRendering$1$1$2", f = "OldCameraScreenRunner.kt", l = {240}, m = "invokeSuspend")
        public static final class b extends pt.m implements Function2<p0, nt.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f12861t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ SelfieWorkflow.c.C0235c.b f12862u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ c f12863v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ androidx.p000lifecycle.m f12864w;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
            @pt.f(c = "com.withpersona.sdk2.inquiry.selfie.OldCameraScreenRunner$showRendering$1$1$2$1$1", f = "OldCameraScreenRunner.kt", l = {245, 249}, m = "invokeSuspend")
            public static final class a extends pt.m implements Function2<p0, nt.b<? super Unit>, Object> {

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public int f12865t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public final /* synthetic */ SelfieWorkflow.c.C0235c.b f12866u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                public final /* synthetic */ c f12867v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(SelfieWorkflow.c.C0235c.b bVar, c cVar, nt.b<? super a> bVar2) {
                    super(2, bVar2);
                    this.f12866u = bVar;
                    this.f12867v = cVar;
                }

                @Override // pt.a
                public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
                    return new a(this.f12866u, this.f12867v, bVar);
                }

                /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
                
                    if (r12 == r0) goto L19;
                 */
                @Override // pt.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                    /*
                        r11 = this;
                        java.lang.Object r0 = ot.c.e()
                        int r1 = r11.f12865t
                        r2 = 1
                        r3 = 2
                        if (r1 == 0) goto L24
                        if (r1 == r2) goto L20
                        if (r1 != r3) goto L18
                        jt.o.b(r12)
                        jt.n r12 = (jt.n) r12
                        java.lang.Object r12 = r12.getValue()
                        goto L5c
                    L18:
                        java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r12.<init>(r0)
                        throw r12
                    L20:
                        jt.o.b(r12)
                        goto L38
                    L24:
                        jt.o.b(r12)
                        com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$c$b r12 = r11.f12866u
                        com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$c$b$g r12 = (com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.c.C0235c.b.g) r12
                        long r4 = r12.getMaxRecordingLengthMs()
                        r11.f12865t = r2
                        java.lang.Object r12 = ku.z0.b(r4, r11)
                        if (r12 != r0) goto L38
                        goto L5b
                    L38:
                        com.withpersona.sdk2.inquiry.selfie.c r12 = r11.f12867v
                        fn.g r12 = com.withpersona.sdk2.inquiry.selfie.c.l(r12)
                        nu.p0 r12 = r12.b()
                        java.lang.Object r12 = r12.getValue()
                        boolean r12 = r12 instanceof com.withpersona.sdk2.camera.d.Closed
                        if (r12 == 0) goto L4d
                        kotlin.Unit r12 = kotlin.Unit.f22483a
                        return r12
                    L4d:
                        com.withpersona.sdk2.inquiry.selfie.c r12 = r11.f12867v
                        fn.g r12 = com.withpersona.sdk2.inquiry.selfie.c.l(r12)
                        r11.f12865t = r3
                        java.lang.Object r12 = r12.i(r11)
                        if (r12 != r0) goto L5c
                    L5b:
                        return r0
                    L5c:
                        boolean r0 = jt.n.h(r12)
                        if (r0 == 0) goto L67
                        java.io.File r12 = (java.io.File) r12
                        r12.delete()
                    L67:
                        com.withpersona.sdk2.inquiry.selfie.c r12 = r11.f12867v
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
                        com.withpersona.sdk2.inquiry.selfie.c r12 = r11.f12867v
                        kotlin.jvm.functions.Function1 r12 = com.withpersona.sdk2.inquiry.selfie.c.m(r12)
                        if (r12 == 0) goto L90
                        fn.m0 r0 = new fn.m0
                        r0.<init>()
                        r12.invoke(r0)
                    L90:
                        kotlin.Unit r12 = kotlin.Unit.f22483a
                        return r12
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.selfie.c.d.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
                    return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(SelfieWorkflow.c.C0235c.b bVar, c cVar, androidx.p000lifecycle.m mVar, nt.b<? super b> bVar2) {
                super(2, bVar2);
                this.f12862u = bVar;
                this.f12863v = cVar;
                this.f12864w = mVar;
            }

            @Override // pt.a
            public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
                return new b(this.f12862u, this.f12863v, this.f12864w, bVar);
            }

            @Override // pt.a
            public final Object invokeSuspend(Object obj) {
                Object objJ;
                Object objE = ot.c.e();
                int i10 = this.f12861t;
                if (i10 == 0) {
                    jt.o.b(obj);
                    if (((SelfieWorkflow.c.C0235c.b.g) this.f12862u).getRecordLocalVideo()) {
                        fn.g gVar = this.f12863v.cameraController;
                        this.f12861t = 1;
                        objJ = gVar.j(this);
                        if (objJ == objE) {
                            return objE;
                        }
                    }
                    ((SelfieWorkflow.c.C0235c.b.g) this.f12862u).d().invoke(this.f12863v.cameraController.a());
                    return Unit.f22483a;
                }
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
                objJ = ((jt.n) obj).getValue();
                c cVar = this.f12863v;
                androidx.p000lifecycle.m mVar = this.f12864w;
                SelfieWorkflow.c.C0235c.b bVar = this.f12862u;
                if (jt.n.h(objJ) && ((Boolean) objJ).booleanValue()) {
                    d2 d2Var = cVar.maxRecordingLimitJob;
                    if (d2Var != null) {
                        d2.a.a(d2Var, null, 1, null);
                    }
                    cVar.maxRecordingLimitJob = ku.k.d(mVar, g1.b(), null, new a(bVar, cVar, null), 2, null);
                }
                SelfieWorkflow.c.C0235c.b bVar2 = this.f12862u;
                Throwable thE = jt.n.e(objJ);
                if (thE != null) {
                    ((SelfieWorkflow.c.C0235c.b.g) bVar2).c().invoke(thE);
                }
                ((SelfieWorkflow.c.C0235c.b.g) this.f12862u).d().invoke(this.f12863v.cameraController.a());
                return Unit.f22483a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
                return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(SelfieWorkflow.c.C0235c.b bVar, androidx.p000lifecycle.m mVar, nt.b<? super d> bVar2) {
            super(2, bVar2);
            this.f12857v = bVar;
            this.f12858w = mVar;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return c.this.new d(this.f12857v, this.f12858w, bVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
        
            if (ku.i.g(r8, r1, r7) == r0) goto L15;
         */
        @Override // pt.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = ot.c.e()
                int r1 = r7.f12855t
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L1f
                if (r1 == r4) goto L1b
                if (r1 != r3) goto L13
                jt.o.b(r8)
                goto L56
            L13:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1b:
                jt.o.b(r8)
                goto L3e
            L1f:
                jt.o.b(r8)
                com.withpersona.sdk2.inquiry.selfie.c r8 = com.withpersona.sdk2.inquiry.selfie.c.this
                fn.g r8 = com.withpersona.sdk2.inquiry.selfie.c.l(r8)
                nu.p0 r8 = r8.b()
                com.withpersona.sdk2.inquiry.selfie.c$d$a r1 = new com.withpersona.sdk2.inquiry.selfie.c$d$a
                r1.<init>(r2)
                nu.h r8 = nu.j.N(r8, r1)
                r7.f12855t = r4
                java.lang.Object r8 = nu.j.i(r8, r7)
                if (r8 != r0) goto L3e
                goto L55
            L3e:
                ku.n2 r8 = ku.g1.c()
                com.withpersona.sdk2.inquiry.selfie.c$d$b r1 = new com.withpersona.sdk2.inquiry.selfie.c$d$b
                com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$c$b r4 = r7.f12857v
                com.withpersona.sdk2.inquiry.selfie.c r5 = com.withpersona.sdk2.inquiry.selfie.c.this
                androidx.lifecycle.m r6 = r7.f12858w
                r1.<init>(r4, r5, r6, r2)
                r7.f12855t = r3
                java.lang.Object r8 = ku.i.g(r8, r1, r7)
                if (r8 != r0) goto L56
            L55:
                return r0
            L56:
                kotlin.Unit r8 = kotlin.Unit.f22483a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.selfie.c.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.inquiry.selfie.OldCameraScreenRunner$showRendering$1$2", f = "OldCameraScreenRunner.kt", l = {280}, m = "invokeSuspend")
    public static final class e extends pt.m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f12868t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ SelfieWorkflow.c.C0235c.b f12869u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ c f12870v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(SelfieWorkflow.c.C0235c.b bVar, c cVar, nt.b<? super e> bVar2) {
            super(2, bVar2);
            this.f12869u = bVar;
            this.f12870v = cVar;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new e(this.f12869u, this.f12870v, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f12868t;
            if (i10 == 0) {
                jt.o.b(obj);
                long maxRecordingLengthMs = ((SelfieWorkflow.c.C0235c.b.i) this.f12869u).getMaxRecordingLengthMs();
                this.f12868t = 1;
                if (z0.b(maxRecordingLengthMs, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
            }
            if (this.f12870v.cameraController.b().getValue() instanceof com.withpersona.sdk2.camera.d.Closed) {
                return Unit.f22483a;
            }
            TrackingEventsLogger.logSelfieCaptureStateEvent$default(this.f12870v.trackingEventsLogger, new SelfieCaptureStateEventData(SelfieCaptureState.RECORDING_TIMED_OUT, "webrtc", null, null, 8, null), false, 2, null);
            Function1 function1 = this.f12870v.currentErrorHandler;
            if (function1 != null) {
                function1.invoke(new m0());
            }
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((e) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.inquiry.selfie.OldCameraScreenRunner$showRendering$1$6", f = "OldCameraScreenRunner.kt", l = {400}, m = "invokeSuspend")
    public static final class f extends pt.m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f12871t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ SelfieWorkflow.c.C0235c.b f12873v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ SelfieWorkflow.c.C0235c f12874w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(SelfieWorkflow.c.C0235c.b bVar, SelfieWorkflow.c.C0235c c0235c, nt.b<? super f> bVar2) {
            super(2, bVar2);
            this.f12873v = bVar;
            this.f12874w = c0235c;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return c.this.new f(this.f12873v, this.f12874w, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objI;
            Object objE = ot.c.e();
            int i10 = this.f12871t;
            if (i10 == 0) {
                jt.o.b(obj);
                fn.g gVar = c.this.cameraController;
                this.f12871t = 1;
                objI = gVar.i(this);
                if (objI == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
                objI = ((jt.n) obj).getValue();
            }
            SelfieWorkflow.c.C0235c.b bVar = this.f12873v;
            if (jt.n.h(objI)) {
                ((SelfieWorkflow.c.C0235c.b.C0237c) bVar).b().invoke((File) objI);
            }
            SelfieWorkflow.c.C0235c c0235c = this.f12874w;
            Throwable thE = jt.n.e(objI);
            if (thE != null && !(thE instanceof h0)) {
                c0235c.i().invoke(thE);
            }
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((f) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.inquiry.selfie.OldCameraScreenRunner$showRendering$1$takePhoto$1", f = "OldCameraScreenRunner.kt", l = {333}, m = "invokeSuspend")
    public static final class g extends pt.m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f12875t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ SelfieWorkflow.c.C0235c.b f12877v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(SelfieWorkflow.c.C0235c.b bVar, nt.b<? super g> bVar2) {
            super(2, bVar2);
            this.f12877v = bVar;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return c.this.new g(this.f12877v, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objK;
            Object objE = ot.c.e();
            int i10 = this.f12875t;
            if (i10 == 0) {
                jt.o.b(obj);
                fn.g gVar = c.this.cameraController;
                this.f12875t = 1;
                objK = gVar.k(this);
                if (objK == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
                objK = ((jt.n) obj).getValue();
            }
            SelfieWorkflow.c.C0235c.b bVar = this.f12877v;
            if (jt.n.h(objK)) {
                Function1<String, Unit> function1D = ((SelfieWorkflow.c.C0235c.b.d) bVar).d();
                String absolutePath = ((File) objK).getAbsolutePath();
                Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
                function1D.invoke(absolutePath);
            }
            SelfieWorkflow.c.C0235c.b bVar2 = this.f12877v;
            Throwable thE = jt.n.e(objK);
            if (thE != null && !(thE instanceof o0)) {
                ((SelfieWorkflow.c.C0235c.b.d) bVar2).c().invoke(thE);
            }
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((g) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    public c(@NotNull aq.a binding, @NotNull fn.g cameraController, @NotNull n0 selfieDirectionFeed, @NotNull TrackingEventsLogger trackingEventsLogger) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(cameraController, "cameraController");
        Intrinsics.checkNotNullParameter(selfieDirectionFeed, "selfieDirectionFeed");
        Intrinsics.checkNotNullParameter(trackingEventsLogger, "trackingEventsLogger");
        this.binding = binding;
        this.cameraController = cameraController;
        this.selfieDirectionFeed = selfieDirectionFeed;
        this.trackingEventsLogger = trackingEventsLogger;
        binding.f3585l.setPreviewView(cameraController.getPreviewView());
        ConstraintLayout root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        wq.g.d(root, false, false, false, false, 15, null);
        Context context = binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        jq.g.i(context).a().a(new a());
        v();
        this.confirmConst = Build.VERSION.SDK_INT >= 30 ? 16 : 3;
    }

    public static final void A(aq.a aVar, androidx.p000lifecycle.m mVar, c cVar, SelfieWorkflow.c.C0235c.b bVar, View view) {
        x(aVar, mVar, cVar, bVar);
    }

    public static final void B(aq.a aVar, final SelfieWorkflow.c.C0235c.b bVar, View view) {
        if (aVar.f3585l.a0()) {
            ((SelfieWorkflow.c.C0235c.b.e) bVar).b().invoke();
        } else {
            aVar.f3585l.X(new Function0() { // from class: yp.j
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.withpersona.sdk2.inquiry.selfie.c.C(bVar);
                }
            });
        }
    }

    public static final Unit C(SelfieWorkflow.c.C0235c.b bVar) {
        ((SelfieWorkflow.c.C0235c.b.e) bVar).b().invoke();
        return Unit.f22483a;
    }

    public static final Unit D(SelfieWorkflow.c.C0235c.b bVar) {
        ((SelfieWorkflow.c.C0235c.b.C0237c) bVar).c().invoke();
        return Unit.f22483a;
    }

    public static final Unit E(SelfieWorkflow.c.C0235c c0235c) {
        c0235c.h().invoke();
        return Unit.f22483a;
    }

    public static final Unit F(SelfieWorkflow.c.C0235c c0235c) {
        c0235c.j().invoke();
        return Unit.f22483a;
    }

    public static final void G(androidx.p000lifecycle.m mVar, c cVar, SelfieWorkflow.c.C0235c.b bVar) {
        ku.k.d(mVar, g1.c(), null, cVar.new g(bVar, null), 2, null);
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
        this.cameraStateListenerJob = ku.k.d(t.a(jq.g.i(context)), null, null, new C0239c(null), 3, null);
    }

    public static final void x(aq.a aVar, final androidx.p000lifecycle.m mVar, final c cVar, final SelfieWorkflow.c.C0235c.b bVar) {
        aVar.b.setEnabled(false);
        if (aVar.f3585l.a0()) {
            G(mVar, cVar, bVar);
        } else {
            aVar.f3585l.X(new Function0() { // from class: yp.i
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.withpersona.sdk2.inquiry.selfie.c.y(mVar, cVar, bVar);
                }
            });
        }
    }

    public static final Unit y(androidx.p000lifecycle.m mVar, c cVar, SelfieWorkflow.c.C0235c.b bVar) {
        G(mVar, cVar, bVar);
        return Unit.f22483a;
    }

    public static final Unit z(SelfieWorkflow.c.C0235c.b bVar) {
        ((SelfieWorkflow.c.C0235c.b.f) bVar).b().invoke();
        return Unit.f22483a;
    }

    public final OldSelfieOverlayView.b H(SelfieWorkflow.c.C0235c.EnumC0238c enumC0238c) {
        switch (b.f12851a[enumC0238c.ordinal()]) {
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
                throw new jt.l();
        }
    }

    public final void s(final TextView textView, float f10) {
        textView.setVisibility(0);
        textView.animate().setDuration(500L).scaleX(f10).scaleY(f10).alpha(0.0f).withEndAction(new Runnable() { // from class: yp.h
            @Override // java.lang.Runnable
            public final void run() {
                com.withpersona.sdk2.inquiry.selfie.c.t(textView);
            }
        });
    }

    public final void u(StepStyles.SelfieStepStyle styles) {
        TextBasedComponentStyle titleStyleValue = styles.getTitleStyleValue();
        if (titleStyleValue != null) {
            TextView title = this.binding.f3586m;
            Intrinsics.checkNotNullExpressionValue(title, "title");
            jr.h0.l(title, titleStyleValue, null, 2, null);
            this.binding.f3586m.setTextColor(-1);
        }
        TextBasedComponentStyle selfieCaptureHintTextStyle = styles.getSelfieCaptureHintTextStyle();
        if (selfieCaptureHintTextStyle != null) {
            TextView hintMessage = this.binding.f3579f;
            Intrinsics.checkNotNullExpressionValue(hintMessage, "hintMessage");
            jr.h0.l(hintMessage, selfieCaptureHintTextStyle, null, 2, null);
            this.binding.f3579f.setTextColor(-1);
        }
        Integer capturePageHeaderIconColorValue = styles.getCapturePageHeaderIconColorValue();
        if (capturePageHeaderIconColorValue != null) {
            this.binding.f3581h.setControlsColor(capturePageHeaderIconColorValue.intValue());
        }
    }

    @Override // an.k
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void a(@NotNull final SelfieWorkflow.c.C0235c rendering, @NotNull ViewEnvironment viewEnvironment) {
        Function1<? super Throwable, Unit> function1;
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        if (rendering.getRecordingLocallyRequired() && !this.cameraController.getRecordingStarted() && (function1 = this.currentErrorHandler) != null) {
            function1.invoke(new l0(false));
        }
        this.currentErrorHandler = rendering.i();
        this.permissionChangedHandler = rendering.k();
        this.cameraController.h();
        this.cameraController.getPreviewView().setVisibility(0);
        if ((rendering.getMode() instanceof SelfieWorkflow.c.C0235c.b.i) || (rendering.getMode() instanceof SelfieWorkflow.c.C0235c.b.g)) {
            this.binding.f3577d.setVisibility(0);
        } else {
            this.binding.f3577d.setVisibility(8);
        }
        this.selfieDirectionFeed.m(rendering.getRequireStrictSelfieCapture() ? 0.45d : 0.35d, 0.8d, false);
        final aq.a aVar = this.binding;
        Context context = aVar.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        final androidx.p000lifecycle.m mVarA = t.a(jq.g.i(context));
        TextView textView = this.binding.f3586m;
        String title = rendering.getCom.withpersona.sdk2.inquiry.network.dto.ui.components.Title.type java.lang.String();
        if (title == null) {
            title = "";
        }
        textView.setText(title);
        TextView textView2 = this.binding.f3586m;
        CharSequence text = aVar.f3586m.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        textView2.setVisibility(StringsKt.p0(text) ? 8 : 0);
        String message = rendering.getMessage();
        String str = message != null ? message : "";
        if (!Intrinsics.c(str, aVar.f3579f.getText())) {
            aVar.f3579f.setText(str);
        }
        aVar.f3585l.setLeftPoseImage(rendering.getAssetOverrides().getLeftPoseImage());
        aVar.f3585l.setRightPoseImage(rendering.getAssetOverrides().getRightPoseImage());
        int i10 = b.f12851a[rendering.getMode().getOverlay().ordinal()];
        if (i10 == 1) {
            TextView textView3 = aVar.f3579f;
            textView3.announceForAccessibility(textView3.getContext().getString(vp.g.T));
        } else if (i10 == 2) {
            TextView textView4 = aVar.f3579f;
            textView4.announceForAccessibility(textView4.getContext().getString(vp.g.V));
        } else if (i10 == 3) {
            TextView textView5 = aVar.f3579f;
            textView5.announceForAccessibility(textView5.getContext().getString(vp.g.W));
        } else if (rendering.getMode() instanceof SelfieWorkflow.c.C0235c.b.d) {
            TextView textView6 = aVar.f3579f;
            textView6.announceForAccessibility(textView6.getContext().getString(vp.g.U));
        }
        aVar.b.setEnabled(true);
        if (!(rendering.getMode() instanceof SelfieWorkflow.c.C0235c.b.C0236b)) {
            aVar.f3578e.setVisibility(8);
        }
        if (!(rendering.getMode() instanceof SelfieWorkflow.c.C0235c.b.i)) {
            aVar.f3580g.setVisibility(8);
        }
        final SelfieWorkflow.c.C0235c.b mode = rendering.getMode();
        if (mode instanceof SelfieWorkflow.c.C0235c.b.g) {
            aVar.b.setVisibility(4);
            ku.k.d(mVarA, g1.a(), null, new d(mode, mVarA, null), 2, null);
            SelfieWorkflow.c.C0235c.b.g gVar = (SelfieWorkflow.c.C0235c.b.g) mode;
            OldSelfieOverlayView.f0(aVar.f3585l, H(gVar.getOverlay()), gVar.getShowProgress(), null, 4, null);
        } else if (mode instanceof SelfieWorkflow.c.C0235c.b.i) {
            aVar.f3580g.setVisibility(0);
            aVar.b.setVisibility(4);
            d2 d2Var = this.maxRecordingLimitJob;
            if (d2Var != null) {
                d2.a.a(d2Var, null, 1, null);
            }
            this.maxRecordingLimitJob = ku.k.d(mVarA, g1.b(), null, new e(mode, this, null), 2, null);
        } else if (mode instanceof SelfieWorkflow.c.C0235c.b.f) {
            aVar.b.setVisibility(4);
            SelfieWorkflow.c.C0235c.b.f fVar = (SelfieWorkflow.c.C0235c.b.f) mode;
            aVar.f3585l.e0(H(fVar.getOverlay()), fVar.getShowProgress(), new Function0() { // from class: yp.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.withpersona.sdk2.inquiry.selfie.c.z(mode);
                }
            });
        } else if (mode instanceof SelfieWorkflow.c.C0235c.b.C0236b) {
            aVar.b.setVisibility(4);
            SelfieWorkflow.c.C0235c.b.C0236b c0236b = (SelfieWorkflow.c.C0235c.b.C0236b) mode;
            if (!Intrinsics.c(aVar.f3578e.getTag(), Integer.valueOf(c0236b.getCountDown()))) {
                TextView countdown = aVar.f3578e;
                Intrinsics.checkNotNullExpressionValue(countdown, "countdown");
                s(countdown, kotlin.ranges.d.c(4 - c0236b.getCountDown(), 1) * 1.5f);
                aVar.f3578e.setText(String.valueOf(c0236b.getCountDown()));
                aVar.f3578e.setTag(Integer.valueOf(c0236b.getCountDown()));
            }
            OldSelfieOverlayView.f0(aVar.f3585l, H(c0236b.getOverlay()), c0236b.getShowProgress(), null, 4, null);
        } else if (mode instanceof SelfieWorkflow.c.C0235c.b.h) {
            d2 d2Var2 = this.maxRecordingLimitJob;
            if (d2Var2 != null) {
                d2.a.a(d2Var2, null, 1, null);
            }
            aVar.b.setEnabled(false);
            SelfieWorkflow.c.C0235c.b.h hVar = (SelfieWorkflow.c.C0235c.b.h) mode;
            aVar.f3585l.e0(H(hVar.getOverlay()), hVar.getShowProgress(), hVar.c());
            if (hVar.getImageCaptured()) {
                aVar.getRoot().setHapticFeedbackEnabled(true);
                aVar.getRoot().performHapticFeedback(this.confirmConst, 2);
            }
        } else if (mode instanceof SelfieWorkflow.c.C0235c.b.d) {
            aVar.b.setVisibility(0);
            aVar.b.setOnClickListener(new View.OnClickListener() { // from class: yp.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    com.withpersona.sdk2.inquiry.selfie.c.A(aVar, mVarA, this, mode, view);
                }
            });
            SelfieWorkflow.c.C0235c.b.d dVar = (SelfieWorkflow.c.C0235c.b.d) mode;
            if (dVar.getForceCapture()) {
                aVar.b.setVisibility(4);
                x(aVar, mVarA, this, mode);
            }
            OldSelfieOverlayView.f0(aVar.f3585l, H(dVar.getOverlay()), dVar.getShowProgress(), null, 4, null);
        } else if (mode instanceof SelfieWorkflow.c.C0235c.b.e) {
            aVar.b.setVisibility(0);
            aVar.b.setOnClickListener(new View.OnClickListener() { // from class: yp.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    com.withpersona.sdk2.inquiry.selfie.c.B(aVar, mode, view);
                }
            });
            SelfieWorkflow.c.C0235c.b.e eVar = (SelfieWorkflow.c.C0235c.b.e) mode;
            OldSelfieOverlayView.f0(aVar.f3585l, H(eVar.getOverlay()), eVar.getShowProgress(), null, 4, null);
        } else if (mode instanceof SelfieWorkflow.c.C0235c.b.a) {
            aVar.b.setVisibility(4);
            SelfieWorkflow.c.C0235c.b.a aVar2 = (SelfieWorkflow.c.C0235c.b.a) mode;
            OldSelfieOverlayView.f0(aVar.f3585l, H(aVar2.getOverlay()), aVar2.getShowProgress(), null, 4, null);
        } else {
            if (!(mode instanceof SelfieWorkflow.c.C0235c.b.C0237c)) {
                throw new jt.l();
            }
            aVar.b.setVisibility(4);
            SelfieWorkflow.c.C0235c.b.C0237c c0237c = (SelfieWorkflow.c.C0235c.b.C0237c) mode;
            if (c0237c.getStartFinalize()) {
                d2 d2Var3 = this.maxRecordingLimitJob;
                if (d2Var3 != null) {
                    d2.a.a(d2Var3, null, 1, null);
                }
                ku.k.d(mVarA, g1.c(), null, new f(mode, rendering, null), 2, null);
            }
            aVar.f3585l.e0(H(c0237c.getOverlay()), c0237c.getShowProgress(), new Function0() { // from class: yp.e
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.withpersona.sdk2.inquiry.selfie.c.D(mode);
                }
            });
        }
        NavigationState navigationState = rendering.getNavigationState();
        Function0 function0 = new Function0() { // from class: yp.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.withpersona.sdk2.inquiry.selfie.c.E(rendering);
            }
        };
        Function0 function2 = new Function0() { // from class: yp.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.withpersona.sdk2.inquiry.selfie.c.F(rendering);
            }
        };
        Pi2NavigationBar navigationBar = aVar.f3581h;
        Intrinsics.checkNotNullExpressionValue(navigationBar, "navigationBar");
        ConstraintLayout root = aVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        String navBarTitle = rendering.getNavBarTitle();
        StepStyles.SelfieStepStyle styles = rendering.getStyles();
        ir.c.e(navigationState, function0, function2, null, navigationBar, root, null, navBarTitle, styles != null ? styles.getNavBarTitleStyleValue() : null, 72, null);
        String watermarkText = rendering.getWatermarkText();
        if (watermarkText == null || StringsKt.p0(watermarkText)) {
            aVar.f3587n.setVisibility(8);
        } else {
            aVar.f3587n.setText(rendering.getWatermarkText());
            aVar.f3587n.setVisibility(0);
        }
        StepStyles.SelfieStepStyle styles2 = rendering.getStyles();
        if (styles2 != null) {
            u(styles2);
            int iC = l2.b.c(this.binding.getRoot().getContext(), vp.b.f33360a);
            this.binding.f3585l.W(styles2);
            Context context2 = this.binding.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            vq.c.b(viewEnvironment, context2, iC);
        }
    }
}
