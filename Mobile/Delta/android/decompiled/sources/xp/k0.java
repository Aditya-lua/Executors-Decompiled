package xp;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.camera.view.PreviewView;
import com.appsflyer.R;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.camera.camera2.Camera2PreviewView;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.selfie.view.SelfieOverlayView;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.SelfieCaptureButtonEventData;
import com.withpersona.sdk2.inquiry.tracking.model.SelfieCaptureButtonType;
import com.withpersona.sdk2.inquiry.tracking.model.SelfieCaptureState;
import com.withpersona.sdk2.inquiry.tracking.model.SelfieCaptureStateEventData;
import dn.v0;
import fn.CameraChoices;
import iu.d2;
import iu.g1;
import iu.z0;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ym.ViewEnvironment;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001e\u001a\u00020\u001d*\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010!\u001a\u00020 *\u00020\u001cH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\u0012H\u0002¢\u0006\u0004\b%\u0010&J\u001b\u0010*\u001a\u00020)*\u00020'2\u0006\u0010(\u001a\u00020\rH\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020$2\u0006\u0010,\u001a\u00020\rH\u0002¢\u0006\u0004\b-\u0010.J\u001f\u00101\u001a\u00020$2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J\u001f\u00105\u001a\u00020$2\u0006\u0010\u0011\u001a\u00020\u00022\b\u00104\u001a\u0004\u0018\u000103¢\u0006\u0004\b5\u00106R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010!R\u0014\u0010E\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010#\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010J\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010M\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u001c\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u001c0N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0018\u0010U\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0018\u0010W\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010TR\u0018\u0010Y\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010TR*\u0010_\u001a\u0016\u0012\u0004\u0012\u00020[\u0012\u0004\u0012\u00020$\u0018\u00010Zj\u0004\u0018\u0001`\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u001e\u0010c\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010`8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u0016\u0010e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010!¨\u0006f"}, d2 = {"Lxp/k0;", "Lym/k;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;", "Landroid/content/Context;", "context", "Lxp/r0;", "viewController", "Lcom/withpersona/sdk2/camera/b;", "cameraPreview", "Ldn/n0;", "selfieDirectionFeed", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "", "useCameraXForVideo", "<init>", "(Landroid/content/Context;Lxp/r0;Lcom/withpersona/sdk2/camera/b;Ldn/n0;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Z)V", "rendering", "Ldn/g;", "E", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;)Ldn/g;", "Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;", "camera2Preview", "C", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;)Ldn/g;", "recordVideo", "D", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;Z)Ldn/g;", "Lcom/withpersona/sdk2/camera/CameraProperties$b;", "Lfn/m0;", "Y", "(Lcom/withpersona/sdk2/camera/CameraProperties$b;)Lfn/m0;", "Lcom/withpersona/sdk2/camera/b$a;", "Z", "(Lcom/withpersona/sdk2/camera/CameraProperties$b;)Lcom/withpersona/sdk2/camera/b$a;", "cameraController", "", "F", "(Ldn/g;)V", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "isPreviewMirrored", "Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;", "a0", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;Z)Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;", "on", "G", "(Z)V", "Lym/y;", "viewEnvironment", "I", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;Lym/y;)V", "Ltq/a;", "systemUiController", "H", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;Ltq/a;)V", "b", "Landroid/content/Context;", "c", "Lxp/r0;", "d", "Lcom/withpersona/sdk2/camera/b;", "e", "Ldn/n0;", "f", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "g", "Landroidx/lifecycle/m;", "h", "Landroidx/lifecycle/m;", "lifecycleScope", "i", "Ldn/g;", "j", "Lcom/withpersona/sdk2/camera/CameraProperties$b;", "currentFacingMode", "k", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;", "lastRendering", "", "l", "Ljava/util/List;", "cameraFacingDirections", "Liu/d2;", "m", "Liu/d2;", "cameraStateListenerJob", "n", "maxRecordingLimitJob", "o", "manualCaptureJob", "Lkotlin/Function1;", "", "Lcom/withpersona/sdk2/inquiry/selfie/CameraErrorHandler;", "p", "Lkotlin/jvm/functions/Function1;", "currentErrorHandler", "Lkotlin/Function0;", "q", "Lkotlin/jvm/functions/Function0;", "permissionChangedHandler", "r", "takingManualCapture", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k0 implements ym.k<SelfieWorkflow.c.a> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final r0 viewController;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.camera.b cameraPreview;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final dn.n0 selfieDirectionFeed;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final boolean useCameraXForVideo;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final androidx.p000lifecycle.m lifecycleScope;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public dn.g cameraController;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public CameraProperties.b currentFacingMode;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public SelfieWorkflow.c.a lastRendering;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public List<? extends CameraProperties.b> cameraFacingDirections;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public d2 cameraStateListenerJob;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public d2 maxRecordingLimitJob;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public d2 manualCaptureJob;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super Throwable, Unit> currentErrorHandler;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function0<Unit> permissionChangedHandler;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public boolean takingManualCapture;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f36158a;
        public static final /* synthetic */ int[] b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f36159c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f36160d;

        static {
            int[] iArr = new int[in.a.values().length];
            try {
                iArr[in.a.Center.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[in.a.Left.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[in.a.Right.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[in.a.Up.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[in.a.Down.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f36158a = iArr;
            int[] iArr2 = new int[SelfieWorkflow.c.a.b.values().length];
            try {
                iArr2[SelfieWorkflow.c.a.b.CLEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[SelfieWorkflow.c.a.b.FINALIZING.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[SelfieWorkflow.c.a.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[SelfieWorkflow.c.a.b.LOOK_LEFT.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[SelfieWorkflow.c.a.b.LOOK_RIGHT.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[SelfieWorkflow.c.a.b.LOOK_UP.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[SelfieWorkflow.c.a.b.LOOK_DOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused12) {
            }
            b = iArr2;
            int[] iArr3 = new int[CameraProperties.b.values().length];
            try {
                iArr3[CameraProperties.b.User.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[CameraProperties.b.Environment.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[CameraProperties.b.Unknown.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            f36159c = iArr3;
            int[] iArr4 = new int[kn.a.values().length];
            try {
                iArr4[kn.a.Stream.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[kn.a.Upload.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[kn.a.None.ordinal()] = 3;
            } catch (NoSuchFieldError unused18) {
            }
            f36160d = iArr4;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"xp/k0$b", "Ldn/s;", "", "a", "()V", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements dn.s {
        public final /* synthetic */ SelfieWorkflow.c.a b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f36162c;

        public b(SelfieWorkflow.c.a aVar, boolean z10) {
            this.b = aVar;
            this.f36162c = z10;
        }

        public static final Unit c(SelfieWorkflow.c.a aVar, dn.h it) {
            Intrinsics.checkNotNullParameter(it, "it");
            aVar.r().invoke(it);
            return Unit.f22938a;
        }

        @Override // dn.s
        public void a() {
            com.withpersona.sdk2.camera.b bVar = k0.this.cameraPreview;
            PreviewView previewViewJ = k0.this.viewController.j();
            com.withpersona.sdk2.camera.b.a aVarZ = k0.this.Z(this.b.getFacingMode());
            dn.n0 n0Var = k0.this.selfieDirectionFeed;
            boolean z10 = this.f36162c;
            final SelfieWorkflow.c.a aVar = this.b;
            bVar.f(previewViewJ, aVarZ, n0Var, true, z10, new Function1() { // from class: xp.l0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return k0.b.c(aVar, (dn.h) obj);
                }
            });
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"xp/k0$c", "Landroidx/lifecycle/f;", "Landroidx/lifecycle/s;", "owner", "", "onResume", "(Landroidx/lifecycle/s;)V", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements androidx.p000lifecycle.f {
        public final /* synthetic */ dn.g b;

        public c(dn.g gVar) {
            this.b = gVar;
        }

        public static final void b(k0 k0Var, dn.g gVar) {
            Function0 function0 = k0Var.permissionChangedHandler;
            if (function0 != null) {
                function0.invoke();
            }
            k0Var.F(gVar);
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
            View root = k0.this.viewController.getRoot();
            final k0 k0Var = k0.this;
            final dn.g gVar = this.b;
            root.post(new Runnable() { // from class: xp.m0
                @Override // java.lang.Runnable
                public final void run() {
                    k0.c.b(k0Var, gVar);
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

    @nt.f(c = "com.withpersona.sdk2.inquiry.selfie.cameraScreen.CameraScreenRunner$registerCameraStateListener$1", f = "CameraScreenRunner.kt", l = {652}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class d extends nt.m implements Function2<iu.p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f36164t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ dn.g f36165u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ k0 f36166v;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements lu.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ k0 f36167a;

            public a(k0 k0Var) {
                this.f36167a = k0Var;
            }

            @Override // lu.i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(com.withpersona.sdk2.camera.d dVar, lt.b<? super Unit> bVar) {
                Function1 function1;
                if (Intrinsics.c(dVar, com.withpersona.sdk2.camera.d.b.f10021a)) {
                    Function1 function2 = this.f36167a.currentErrorHandler;
                    if (function2 != null) {
                        function2.invoke(new v0());
                    }
                } else if (dVar instanceof com.withpersona.sdk2.camera.d.Closed) {
                    com.withpersona.sdk2.camera.d.Closed closed = (com.withpersona.sdk2.camera.d.Closed) dVar;
                    if (closed.getWasRecordingInterrupted() && (function1 = this.f36167a.currentErrorHandler) != null) {
                        function1.invoke(new dn.l0(closed.getIsClosedDueToBadCameraConfiguration()));
                    }
                }
                return Unit.f22938a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(dn.g gVar, k0 k0Var, lt.b<? super d> bVar) {
            super(2, bVar);
            this.f36165u = gVar;
            this.f36166v = k0Var;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return new d(this.f36165u, this.f36166v, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(iu.p0 p0Var, lt.b<? super Unit> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = mt.c.e();
            int i10 = this.f36164t;
            if (i10 == 0) {
                gt.o.b(obj);
                lu.h<com.withpersona.sdk2.camera.d> hVarA = com.withpersona.sdk2.camera.a.a(this.f36165u.b());
                a aVar = new a(this.f36166v);
                this.f36164t = 1;
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

    @nt.f(c = "com.withpersona.sdk2.inquiry.selfie.cameraScreen.CameraScreenRunner$showRendering$12", f = "CameraScreenRunner.kt", l = {403}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class e extends nt.m implements Function2<iu.p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f36168t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ dn.g f36169u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ k0 f36170v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ SelfieWorkflow.c.a f36171w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ SelfieWorkflow.c.a.AbstractC0235a f36172x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(dn.g gVar, k0 k0Var, SelfieWorkflow.c.a aVar, SelfieWorkflow.c.a.AbstractC0235a abstractC0235a, lt.b<? super e> bVar) {
            super(2, bVar);
            this.f36169u = gVar;
            this.f36170v = k0Var;
            this.f36171w = aVar;
            this.f36172x = abstractC0235a;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return new e(this.f36169u, this.f36170v, this.f36171w, this.f36172x, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(iu.p0 p0Var, lt.b<? super Unit> bVar) {
            return ((e) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objK;
            Object objE = mt.c.e();
            int i10 = this.f36168t;
            if (i10 == 0) {
                gt.o.b(obj);
                dn.g gVar = this.f36169u;
                this.f36168t = 1;
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
            k0 k0Var = this.f36170v;
            SelfieWorkflow.c.a aVar = this.f36171w;
            SelfieWorkflow.c.a.AbstractC0235a abstractC0235a = this.f36172x;
            if (gt.n.h(objK)) {
                TrackingEventsLogger.logVideoStopEvent$default(k0Var.trackingEventsLogger, "selfie", aVar.getVideoCaptureMethod().name(), null, null, null, null, false, R.styleable.AppCompatTheme_windowMinWidthMajor, null);
                SelfieWorkflow.c.a.AbstractC0235a.d dVar = (SelfieWorkflow.c.a.AbstractC0235a.d) abstractC0235a;
                dVar.b().invoke((File) objK);
                dVar.c().invoke();
            }
            k0 k0Var2 = this.f36170v;
            SelfieWorkflow.c.a aVar2 = this.f36171w;
            SelfieWorkflow.c.a.AbstractC0235a abstractC0235a2 = this.f36172x;
            Throwable thE = gt.n.e(objK);
            if (thE != null) {
                TrackingEventsLogger.logVideoErrorEvent$default(k0Var2.trackingEventsLogger, "selfie", aVar2.getVideoCaptureMethod().name(), null, gt.a.b(thE), false, 20, null);
                if (!(thE instanceof dn.h0)) {
                    aVar2.r().invoke(thE);
                    ((SelfieWorkflow.c.a.AbstractC0235a.d) abstractC0235a2).c().invoke();
                }
            }
            return Unit.f22938a;
        }
    }

    @nt.f(c = "com.withpersona.sdk2.inquiry.selfie.cameraScreen.CameraScreenRunner$showRendering$2", f = "CameraScreenRunner.kt", l = {192, 194}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class f extends nt.m implements Function2<iu.p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f36173t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ dn.g f36174u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ k0 f36175v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ SelfieWorkflow.c.a.AbstractC0235a f36176w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ SelfieWorkflow.c.a f36177x;

        @nt.f(c = "com.withpersona.sdk2.inquiry.selfie.cameraScreen.CameraScreenRunner$showRendering$2$1", f = "CameraScreenRunner.kt", l = {}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/withpersona/sdk2/camera/d;", "it", "", "<anonymous>", "(Lcom/withpersona/sdk2/camera/d;)Z"}, k = 3, mv = {2, 2, 0})
        public static final class a extends nt.m implements Function2<com.withpersona.sdk2.camera.d, lt.b<? super Boolean>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f36178t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f36179u;

            public a(lt.b<? super a> bVar) {
                super(2, bVar);
            }

            @Override // nt.a
            public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
                a aVar = new a(bVar);
                aVar.f36179u = obj;
                return aVar;
            }

            @Override // nt.a
            public final Object invokeSuspend(Object obj) {
                com.withpersona.sdk2.camera.d dVar = (com.withpersona.sdk2.camera.d) this.f36179u;
                mt.c.e();
                if (this.f36178t != 0) {
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

        @nt.f(c = "com.withpersona.sdk2.inquiry.selfie.cameraScreen.CameraScreenRunner$showRendering$2$2", f = "CameraScreenRunner.kt", l = {195, 216}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
        public static final class b extends nt.m implements Function2<iu.p0, lt.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f36180t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ dn.g f36181u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ k0 f36182v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ SelfieWorkflow.c.a.AbstractC0235a f36183w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public final /* synthetic */ SelfieWorkflow.c.a f36184x;

            @nt.f(c = "com.withpersona.sdk2.inquiry.selfie.cameraScreen.CameraScreenRunner$showRendering$2$2$3$1", f = "CameraScreenRunner.kt", l = {225, 231}, m = "invokeSuspend")
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
            public static final class a extends nt.m implements Function2<iu.p0, lt.b<? super Unit>, Object> {

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public int f36185t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public final /* synthetic */ SelfieWorkflow.c.a.AbstractC0235a f36186u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                public final /* synthetic */ dn.g f36187v;

                /* JADX INFO: renamed from: w, reason: collision with root package name */
                public final /* synthetic */ k0 f36188w;

                /* JADX INFO: renamed from: x, reason: collision with root package name */
                public final /* synthetic */ SelfieWorkflow.c.a f36189x;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(SelfieWorkflow.c.a.AbstractC0235a abstractC0235a, dn.g gVar, k0 k0Var, SelfieWorkflow.c.a aVar, lt.b<? super a> bVar) {
                    super(2, bVar);
                    this.f36186u = abstractC0235a;
                    this.f36187v = gVar;
                    this.f36188w = k0Var;
                    this.f36189x = aVar;
                }

                @Override // nt.a
                public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
                    return new a(this.f36186u, this.f36187v, this.f36188w, this.f36189x, bVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(iu.p0 p0Var, lt.b<? super Unit> bVar) {
                    return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
                
                    if (r14 == r0) goto L19;
                 */
                @Override // nt.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r14) {
                    /*
                        r13 = this;
                        java.lang.Object r0 = mt.c.e()
                        int r1 = r13.f36185t
                        r2 = 2
                        r3 = 1
                        if (r1 == 0) goto L24
                        if (r1 == r3) goto L20
                        if (r1 != r2) goto L18
                        gt.o.b(r14)
                        gt.n r14 = (gt.n) r14
                        java.lang.Object r14 = r14.getValue()
                        goto L54
                    L18:
                        java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r14.<init>(r0)
                        throw r14
                    L20:
                        gt.o.b(r14)
                        goto L38
                    L24:
                        gt.o.b(r14)
                        com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$a$a r14 = r13.f36186u
                        com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$a$a$h r14 = (com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.c.a.AbstractC0235a.h) r14
                        long r4 = r14.getMaxRecordingLengthMs()
                        r13.f36185t = r3
                        java.lang.Object r14 = iu.z0.b(r4, r13)
                        if (r14 != r0) goto L38
                        goto L53
                    L38:
                        dn.g r14 = r13.f36187v
                        lu.p0 r14 = r14.b()
                        java.lang.Object r14 = r14.getValue()
                        boolean r14 = r14 instanceof com.withpersona.sdk2.camera.d.Closed
                        if (r14 == 0) goto L49
                        kotlin.Unit r14 = kotlin.Unit.f22938a
                        return r14
                    L49:
                        dn.g r14 = r13.f36187v
                        r13.f36185t = r2
                        java.lang.Object r14 = r14.k(r13)
                        if (r14 != r0) goto L54
                    L53:
                        return r0
                    L54:
                        xp.k0 r0 = r13.f36188w
                        com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$a r1 = r13.f36189x
                        boolean r2 = gt.n.h(r14)
                        if (r2 == 0) goto L7d
                        r2 = r14
                        java.io.File r2 = (java.io.File) r2
                        com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger r3 = xp.k0.v(r0)
                        kn.a r0 = r1.getVideoCaptureMethod()
                        java.lang.String r5 = r0.name()
                        r11 = 124(0x7c, float:1.74E-43)
                        r12 = 0
                        java.lang.String r4 = "selfie"
                        r6 = 0
                        r7 = 0
                        r8 = 0
                        r9 = 0
                        r10 = 0
                        com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger.logVideoStopEvent$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                        r2.delete()
                    L7d:
                        xp.k0 r0 = r13.f36188w
                        com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$a r1 = r13.f36189x
                        java.lang.Throwable r14 = gt.n.e(r14)
                        if (r14 == 0) goto La1
                        com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger r2 = xp.k0.v(r0)
                        kn.a r0 = r1.getVideoCaptureMethod()
                        java.lang.String r4 = r0.name()
                        java.lang.String r6 = gt.a.b(r14)
                        r8 = 20
                        r9 = 0
                        java.lang.String r3 = "selfie"
                        r5 = 0
                        r7 = 0
                        com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger.logVideoErrorEvent$default(r2, r3, r4, r5, r6, r7, r8, r9)
                    La1:
                        xp.k0 r14 = r13.f36188w
                        kotlin.jvm.functions.Function1 r14 = xp.k0.q(r14)
                        if (r14 == 0) goto Lb1
                        dn.m0 r0 = new dn.m0
                        r0.<init>()
                        r14.invoke(r0)
                    Lb1:
                        kotlin.Unit r14 = kotlin.Unit.f22938a
                        return r14
                    */
                    throw new UnsupportedOperationException("Method not decompiled: xp.k0.f.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(dn.g gVar, k0 k0Var, SelfieWorkflow.c.a.AbstractC0235a abstractC0235a, SelfieWorkflow.c.a aVar, lt.b<? super b> bVar) {
                super(2, bVar);
                this.f36181u = gVar;
                this.f36182v = k0Var;
                this.f36183w = abstractC0235a;
                this.f36184x = aVar;
            }

            @Override // nt.a
            public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
                return new b(this.f36181u, this.f36182v, this.f36183w, this.f36184x, bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(iu.p0 p0Var, lt.b<? super Unit> bVar) {
                return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
            }

            /* JADX WARN: Code duplicated, block: B:27:0x00c7  */
            /* JADX WARN: Code duplicated, block: B:29:0x00e7  */
            /* JADX WARN: Code duplicated, block: B:31:0x00ed  */
            /* JADX WARN: Code duplicated, block: B:35:0x0117  */
            @Override // nt.a
            public final Object invokeSuspend(Object obj) {
                Object objK;
                Object value;
                k0 k0Var;
                SelfieWorkflow.c.a aVar;
                SelfieWorkflow.c.a.AbstractC0235a abstractC0235a;
                dn.g gVar;
                SelfieWorkflow.c.a.AbstractC0235a abstractC0235a2;
                k0 k0Var2;
                SelfieWorkflow.c.a aVar2;
                Throwable thE;
                boolean zBooleanValue;
                d2 d2Var;
                Object objE = mt.c.e();
                int i10 = this.f36180t;
                if (i10 == 0) {
                    gt.o.b(obj);
                    dn.g gVar2 = this.f36181u;
                    this.f36180t = 1;
                    objK = gVar2.k(this);
                    if (objK != objE) {
                    }
                    return objE;
                }
                if (i10 == 1) {
                    gt.o.b(obj);
                    objK = ((gt.n) obj).getValue();
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gt.o.b(obj);
                    value = ((gt.n) obj).getValue();
                }
                k0Var = this.f36182v;
                aVar = this.f36184x;
                abstractC0235a = this.f36183w;
                gVar = this.f36181u;
                if (gt.n.h(value)) {
                    zBooleanValue = ((Boolean) value).booleanValue();
                    TrackingEventsLogger.logVideoStartEvent$default(k0Var.trackingEventsLogger, "selfie", aVar.getVideoCaptureMethod().name(), null, false, 12, null);
                    if (zBooleanValue) {
                        d2Var = k0Var.maxRecordingLimitJob;
                        if (d2Var != null) {
                            d2.a.a(d2Var, null, 1, null);
                        }
                        k0Var.maxRecordingLimitJob = iu.k.d(k0Var.lifecycleScope, g1.b(), null, new a(abstractC0235a, gVar, k0Var, aVar, null), 2, null);
                    }
                }
                abstractC0235a2 = this.f36183w;
                k0Var2 = this.f36182v;
                aVar2 = this.f36184x;
                thE = gt.n.e(value);
                if (thE != null) {
                    ((SelfieWorkflow.c.a.AbstractC0235a.h) abstractC0235a2).c().invoke(thE);
                    TrackingEventsLogger.logVideoErrorEvent$default(k0Var2.trackingEventsLogger, "selfie", aVar2.getVideoCaptureMethod().name(), null, gt.a.b(thE), false, 20, null);
                }
                ((SelfieWorkflow.c.a.AbstractC0235a.h) this.f36183w).d().invoke(this.f36181u.a());
                return Unit.f22938a;
                k0 k0Var3 = this.f36182v;
                SelfieWorkflow.c.a aVar3 = this.f36184x;
                if (gt.n.h(objK)) {
                    TrackingEventsLogger.logVideoStopEvent$default(k0Var3.trackingEventsLogger, "selfie", aVar3.getVideoCaptureMethod().name(), null, null, null, null, false, R.styleable.AppCompatTheme_windowMinWidthMajor, null);
                    ((File) objK).delete();
                }
                k0 k0Var4 = this.f36182v;
                SelfieWorkflow.c.a aVar4 = this.f36184x;
                Throwable thE2 = gt.n.e(objK);
                if (thE2 != null) {
                    TrackingEventsLogger.logVideoErrorEvent$default(k0Var4.trackingEventsLogger, "selfie", aVar4.getVideoCaptureMethod().name(), null, gt.a.b(thE2), false, 20, null);
                }
                TrackingEventsLogger.logCameraInfoEvent$default(this.f36182v.trackingEventsLogger, com.withpersona.sdk2.camera.c.a(this.f36181u.a()), false, 2, null);
                if (((SelfieWorkflow.c.a.AbstractC0235a.h) this.f36183w).getRecordLocalVideo()) {
                    dn.g gVar3 = this.f36181u;
                    this.f36180t = 2;
                    Object objD = gVar3.d(this);
                    if (objD != objE) {
                        value = objD;
                        k0Var = this.f36182v;
                        aVar = this.f36184x;
                        abstractC0235a = this.f36183w;
                        gVar = this.f36181u;
                        if (gt.n.h(value)) {
                            zBooleanValue = ((Boolean) value).booleanValue();
                            TrackingEventsLogger.logVideoStartEvent$default(k0Var.trackingEventsLogger, "selfie", aVar.getVideoCaptureMethod().name(), null, false, 12, null);
                            if (zBooleanValue) {
                                d2Var = k0Var.maxRecordingLimitJob;
                                if (d2Var != null) {
                                    d2.a.a(d2Var, null, 1, null);
                                }
                                k0Var.maxRecordingLimitJob = iu.k.d(k0Var.lifecycleScope, g1.b(), null, new a(abstractC0235a, gVar, k0Var, aVar, null), 2, null);
                            }
                        }
                        abstractC0235a2 = this.f36183w;
                        k0Var2 = this.f36182v;
                        aVar2 = this.f36184x;
                        thE = gt.n.e(value);
                        if (thE != null) {
                            ((SelfieWorkflow.c.a.AbstractC0235a.h) abstractC0235a2).c().invoke(thE);
                            TrackingEventsLogger.logVideoErrorEvent$default(k0Var2.trackingEventsLogger, "selfie", aVar2.getVideoCaptureMethod().name(), null, gt.a.b(thE), false, 20, null);
                        }
                    }
                    return objE;
                }
                ((SelfieWorkflow.c.a.AbstractC0235a.h) this.f36183w).d().invoke(this.f36181u.a());
                return Unit.f22938a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(dn.g gVar, k0 k0Var, SelfieWorkflow.c.a.AbstractC0235a abstractC0235a, SelfieWorkflow.c.a aVar, lt.b<? super f> bVar) {
            super(2, bVar);
            this.f36174u = gVar;
            this.f36175v = k0Var;
            this.f36176w = abstractC0235a;
            this.f36177x = aVar;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return new f(this.f36174u, this.f36175v, this.f36176w, this.f36177x, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(iu.p0 p0Var, lt.b<? super Unit> bVar) {
            return ((f) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
        
            if (iu.i.g(r10, r3, r9) == r0) goto L15;
         */
        @Override // nt.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = mt.c.e()
                int r1 = r9.f36173t
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                gt.o.b(r10)
                goto L55
            L12:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1a:
                gt.o.b(r10)
                goto L3a
            L1e:
                gt.o.b(r10)
                dn.g r10 = r9.f36174u
                lu.p0 r10 = r10.b()
                xp.k0$f$a r1 = new xp.k0$f$a
                r4 = 0
                r1.<init>(r4)
                lu.h r10 = lu.j.N(r10, r1)
                r9.f36173t = r3
                java.lang.Object r10 = lu.j.i(r10, r9)
                if (r10 != r0) goto L3a
                goto L54
            L3a:
                iu.n2 r10 = iu.g1.c()
                xp.k0$f$b r3 = new xp.k0$f$b
                dn.g r4 = r9.f36174u
                xp.k0 r5 = r9.f36175v
                com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$a$a r6 = r9.f36176w
                com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$a r7 = r9.f36177x
                r8 = 0
                r3.<init>(r4, r5, r6, r7, r8)
                r9.f36173t = r2
                java.lang.Object r10 = iu.i.g(r10, r3, r9)
                if (r10 != r0) goto L55
            L54:
                return r0
            L55:
                kotlin.Unit r10 = kotlin.Unit.f22938a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: xp.k0.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @nt.f(c = "com.withpersona.sdk2.inquiry.selfie.cameraScreen.CameraScreenRunner$showRendering$3", f = "CameraScreenRunner.kt", l = {263}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class g extends nt.m implements Function2<iu.p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f36190t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ SelfieWorkflow.c.a.AbstractC0235a f36191u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ dn.g f36192v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ k0 f36193w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(SelfieWorkflow.c.a.AbstractC0235a abstractC0235a, dn.g gVar, k0 k0Var, lt.b<? super g> bVar) {
            super(2, bVar);
            this.f36191u = abstractC0235a;
            this.f36192v = gVar;
            this.f36193w = k0Var;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return new g(this.f36191u, this.f36192v, this.f36193w, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(iu.p0 p0Var, lt.b<? super Unit> bVar) {
            return ((g) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = mt.c.e();
            int i10 = this.f36190t;
            if (i10 == 0) {
                gt.o.b(obj);
                long maxRecordingLengthMs = ((SelfieWorkflow.c.a.AbstractC0235a.j) this.f36191u).getMaxRecordingLengthMs();
                this.f36190t = 1;
                if (z0.b(maxRecordingLengthMs, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
            }
            if (this.f36192v.b().getValue() instanceof com.withpersona.sdk2.camera.d.Closed) {
                return Unit.f22938a;
            }
            TrackingEventsLogger.logSelfieCaptureStateEvent$default(this.f36193w.trackingEventsLogger, new SelfieCaptureStateEventData(SelfieCaptureState.RECORDING_TIMED_OUT, null, null, null, 8, null), false, 2, null);
            Function1 function1 = this.f36193w.currentErrorHandler;
            if (function1 != null) {
                function1.invoke(new dn.m0());
            }
            return Unit.f22938a;
        }
    }

    @nt.f(c = "com.withpersona.sdk2.inquiry.selfie.cameraScreen.CameraScreenRunner$showRendering$takePhoto$1", f = "CameraScreenRunner.kt", l = {344, 349}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class h extends nt.m implements Function2<iu.p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f36194t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f36195u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f36196v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ SelfieWorkflow.c.a f36198x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ dn.g f36199y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ SelfieWorkflow.c.a.AbstractC0235a f36200z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(SelfieWorkflow.c.a aVar, dn.g gVar, SelfieWorkflow.c.a.AbstractC0235a abstractC0235a, lt.b<? super h> bVar) {
            super(2, bVar);
            this.f36198x = aVar;
            this.f36199y = gVar;
            this.f36200z = abstractC0235a;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            h hVar = k0.this.new h(this.f36198x, this.f36199y, this.f36200z, bVar);
            hVar.f36196v = obj;
            return hVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(iu.p0 p0Var, lt.b<? super Unit> bVar) {
            return ((h) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        /* JADX WARN: Code duplicated, block: B:36:0x0088 A[Catch: all -> 0x001f, TryCatch #0 {all -> 0x001f, blocks: (B:7:0x0015, B:34:0x007d, B:36:0x0088, B:37:0x009d, B:39:0x00a5, B:42:0x00aa, B:44:0x00b5, B:14:0x002c, B:30:0x006a, B:17:0x0033, B:19:0x0040, B:21:0x0048, B:27:0x0056), top: B:49:0x000d }] */
        /* JADX WARN: Code duplicated, block: B:44:0x00b5 A[Catch: all -> 0x001f, TRY_LEAVE, TryCatch #0 {all -> 0x001f, blocks: (B:7:0x0015, B:34:0x007d, B:36:0x0088, B:37:0x009d, B:39:0x00a5, B:42:0x00aa, B:44:0x00b5, B:14:0x002c, B:30:0x006a, B:17:0x0033, B:19:0x0040, B:21:0x0048, B:27:0x0056), top: B:49:0x000d }] */
        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            int i10;
            Object objG;
            int i11;
            SelfieWorkflow.c.a.AbstractC0235a abstractC0235a;
            SelfieWorkflow.c.a.AbstractC0235a abstractC0235a2;
            Throwable thE;
            iu.p0 p0Var = (iu.p0) this.f36196v;
            Object objE = mt.c.e();
            int i12 = this.f36195u;
            try {
                if (i12 == 0) {
                    gt.o.b(obj);
                    k0.this.takingManualCapture = true;
                    i10 = (this.f36198x.getIsFlashEnabled() || (this.f36198x.getIsAutoFlashOnManualCaptureEnabled() && this.f36198x.getIsDimLightConditions())) ? 1 : 0;
                    if (i10 != 0) {
                        k0.this.G(true);
                        this.f36196v = p0Var;
                        this.f36194t = i10;
                        this.f36195u = 1;
                        if (z0.b(1000L, this) == objE) {
                        }
                    }
                    return objE;
                }
                if (i12 == 1) {
                    i10 = this.f36194t;
                    gt.o.b(obj);
                } else {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i11 = this.f36194t;
                    gt.o.b(obj);
                    objG = ((gt.n) obj).getValue();
                }
                iu.q0.h(p0Var);
                abstractC0235a = this.f36200z;
                if (gt.n.h(objG)) {
                    Function1<String, Unit> function1D = ((SelfieWorkflow.c.a.AbstractC0235a.e) abstractC0235a).d();
                    String absolutePath = ((File) objG).getAbsolutePath();
                    Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
                    function1D.invoke(absolutePath);
                }
                abstractC0235a2 = this.f36200z;
                thE = gt.n.e(objG);
                if (thE != null && !(thE instanceof fn.o0)) {
                    ((SelfieWorkflow.c.a.AbstractC0235a.e) abstractC0235a2).c().invoke(thE);
                }
                if (i11 != 0) {
                    k0.this.G(false);
                }
                k0.this.takingManualCapture = false;
                return Unit.f22938a;
                iu.q0.h(p0Var);
                dn.g gVar = this.f36199y;
                this.f36196v = p0Var;
                this.f36194t = i10;
                this.f36195u = 2;
                objG = gVar.g(this);
                if (objG != objE) {
                    i11 = i10;
                    iu.q0.h(p0Var);
                    abstractC0235a = this.f36200z;
                    if (gt.n.h(objG)) {
                        Function1<String, Unit> function1D2 = ((SelfieWorkflow.c.a.AbstractC0235a.e) abstractC0235a).d();
                        String absolutePath2 = ((File) objG).getAbsolutePath();
                        Intrinsics.checkNotNullExpressionValue(absolutePath2, "getAbsolutePath(...)");
                        function1D2.invoke(absolutePath2);
                    }
                    abstractC0235a2 = this.f36200z;
                    thE = gt.n.e(objG);
                    if (thE != null) {
                        ((SelfieWorkflow.c.a.AbstractC0235a.e) abstractC0235a2).c().invoke(thE);
                    }
                    if (i11 != 0) {
                        k0.this.G(false);
                    }
                    k0.this.takingManualCapture = false;
                    return Unit.f22938a;
                }
                return objE;
            } catch (Throwable th2) {
                k0.this.takingManualCapture = false;
                throw th2;
            }
        }
    }

    public k0(@NotNull Context context, @NotNull r0 viewController, @NotNull com.withpersona.sdk2.camera.b cameraPreview, @NotNull dn.n0 selfieDirectionFeed, @NotNull TrackingEventsLogger trackingEventsLogger, boolean z10) throws CameraAccessException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewController, "viewController");
        Intrinsics.checkNotNullParameter(cameraPreview, "cameraPreview");
        Intrinsics.checkNotNullParameter(selfieDirectionFeed, "selfieDirectionFeed");
        Intrinsics.checkNotNullParameter(trackingEventsLogger, "trackingEventsLogger");
        this.context = context;
        this.viewController = viewController;
        this.cameraPreview = cameraPreview;
        this.selfieDirectionFeed = selfieDirectionFeed;
        this.trackingEventsLogger = trackingEventsLogger;
        this.useCameraXForVideo = z10;
        this.lifecycleScope = androidx.p000lifecycle.t.a(hq.g.i(context));
        List<fn.h0> listA = fn.f0.a(context);
        ArrayList arrayList = new ArrayList(kotlin.collections.q.u(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(((fn.h0) it.next()).getFacing());
        }
        this.cameraFacingDirections = CollectionsKt.X(arrayList);
        this.viewController.a();
    }

    public static final Unit J(k0 k0Var, SelfieWorkflow.c.a aVar, int i10) {
        TrackingEventsLogger.logSelfieCaptureButtonClickedEvent$default(k0Var.trackingEventsLogger, new SelfieCaptureButtonEventData(SelfieCaptureButtonType.SWITCH_CAMERA, null, 2, null), false, 2, null);
        aVar.s().invoke(k0Var.cameraFacingDirections.get(i10));
        return Unit.f22938a;
    }

    public static final Unit K(SelfieWorkflow.c.a aVar, k0 k0Var) {
        boolean z10 = !aVar.getIsFlashEnabled();
        TrackingEventsLogger.logSelfieCaptureButtonClickedEvent$default(k0Var.trackingEventsLogger, new SelfieCaptureButtonEventData(SelfieCaptureButtonType.FLASH, null, 2, null), false, 2, null);
        aVar.u().invoke(Boolean.valueOf(z10));
        return Unit.f22938a;
    }

    public static final Unit L(SelfieWorkflow.c.a aVar) {
        aVar.q().invoke();
        return Unit.f22938a;
    }

    public static final Unit M(SelfieWorkflow.c.a aVar) {
        aVar.t().invoke();
        return Unit.f22938a;
    }

    public static final Unit N(k0 k0Var, kotlin.jvm.internal.c0 c0Var) {
        TrackingEventsLogger.logSelfieCaptureButtonClickedEvent$default(k0Var.trackingEventsLogger, new SelfieCaptureButtonEventData(SelfieCaptureButtonType.SHUTTER, null, 2, null), false, 2, null);
        Function0 function0 = (Function0) c0Var.f23007a;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.f22938a;
    }

    public static final Unit O(k0 k0Var, dn.g gVar) {
        hn.b.a(k0Var.selfieDirectionFeed, gVar, k0Var.viewController.b());
        return Unit.f22938a;
    }

    public static final Unit P(SelfieWorkflow.c.a.AbstractC0235a abstractC0235a) {
        ((SelfieWorkflow.c.a.AbstractC0235a.g) abstractC0235a).b().invoke();
        return Unit.f22938a;
    }

    public static final Unit Q(SelfieWorkflow.c.a.AbstractC0235a abstractC0235a) {
        ((SelfieWorkflow.c.a.AbstractC0235a.g) abstractC0235a).b().invoke();
        return Unit.f22938a;
    }

    public static final Unit R(SelfieWorkflow.c.a.AbstractC0235a abstractC0235a) {
        ((SelfieWorkflow.c.a.AbstractC0235a.g) abstractC0235a).b().invoke();
        return Unit.f22938a;
    }

    public static final Unit S(SelfieWorkflow.c.a.AbstractC0235a abstractC0235a) {
        ((SelfieWorkflow.c.a.AbstractC0235a.g) abstractC0235a).b().invoke();
        return Unit.f22938a;
    }

    public static final Unit T(SelfieWorkflow.c.a.AbstractC0235a abstractC0235a) {
        ((SelfieWorkflow.c.a.AbstractC0235a.g) abstractC0235a).b().invoke();
        return Unit.f22938a;
    }

    public static final Unit U(SelfieWorkflow.c.a.AbstractC0235a abstractC0235a) {
        ((SelfieWorkflow.c.a.AbstractC0235a.i) abstractC0235a).c().invoke();
        return Unit.f22938a;
    }

    public static final Unit V(k0 k0Var, SelfieWorkflow.c.a aVar, dn.g gVar, SelfieWorkflow.c.a.AbstractC0235a abstractC0235a) {
        X(k0Var, aVar, gVar, abstractC0235a);
        return Unit.f22938a;
    }

    public static final Unit W(SelfieWorkflow.c.a.AbstractC0235a abstractC0235a) {
        ((SelfieWorkflow.c.a.AbstractC0235a.f) abstractC0235a).b().invoke();
        return Unit.f22938a;
    }

    public static final void X(k0 k0Var, SelfieWorkflow.c.a aVar, dn.g gVar, SelfieWorkflow.c.a.AbstractC0235a abstractC0235a) {
        if (k0Var.takingManualCapture) {
            return;
        }
        d2 d2Var = k0Var.manualCaptureJob;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        k0Var.manualCaptureJob = iu.k.d(k0Var.lifecycleScope, g1.c(), null, k0Var.new h(aVar, gVar, abstractC0235a, null), 2, null);
    }

    public final dn.g C(SelfieWorkflow.c.a rendering, Camera2PreviewView camera2Preview) throws CameraAccessException {
        Context applicationContext = this.context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        CameraChoices cameraChoicesB = fn.f0.b(applicationContext, Y(rendering.getFacingMode()));
        if (cameraChoicesB != null) {
            return rendering.getCamera2ControllerFactory().a(cameraChoicesB, camera2Preview, this.selfieDirectionFeed, kn.a.valueOf(rendering.getVideoCaptureMethod().toString()), rendering.getWebRtcManager(), rendering.getIsAudioRequired());
        }
        rendering.r().invoke(new dn.i0());
        return new com.withpersona.sdk2.camera.g(camera2Preview);
    }

    public final dn.g D(SelfieWorkflow.c.a rendering, boolean recordVideo) {
        return rendering.getCameraXControllerFactory().a(this.cameraPreview, this.viewController.j(), new b(rendering, recordVideo), rendering.getIsAudioRequired());
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    public final dn.g E(SelfieWorkflow.c.a rendering) throws CameraAccessException {
        dn.g gVarC;
        dn.g gVar = this.cameraController;
        if (gVar != null) {
            if (this.currentFacingMode == rendering.getFacingMode()) {
                gVar.j();
                return gVar;
            }
            gVar.destroy();
        }
        Camera2PreviewView camera2PreviewViewI = this.viewController.i();
        int i10 = a.f36160d[rendering.getVideoCaptureMethod().ordinal()];
        if (i10 == 1) {
            gVarC = C(rendering, camera2PreviewViewI);
        } else {
            if (i10 != 2) {
                if (i10 != 3) {
                    throw new gt.l();
                }
            } else if (!this.useCameraXForVideo) {
                gVarC = C(rendering, camera2PreviewViewI);
            }
            gVarC = D(rendering, rendering.getVideoCaptureMethod() == kn.a.Upload);
        }
        hq.g.i(this.context).a().a(new c(gVarC));
        F(gVarC);
        gVarC.j();
        this.cameraController = gVarC;
        this.currentFacingMode = rendering.getFacingMode();
        return gVarC;
    }

    public final void F(dn.g cameraController) {
        d2 d2Var = this.cameraStateListenerJob;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        this.cameraStateListenerJob = iu.k.d(androidx.p000lifecycle.t.a(hq.g.i(this.context)), null, null, new d(cameraController, this, null), 3, null);
    }

    public final void G(boolean on2) {
        Window window;
        Window window2;
        dn.g gVar = this.cameraController;
        if (gVar == null) {
            return;
        }
        CameraProperties.b facingMode = gVar.a().getFacingMode();
        if (on2) {
            if (facingMode != CameraProperties.b.User) {
                gVar.c(true);
                return;
            }
            this.viewController.c();
            j.b bVarA = hq.g.a(this.context);
            if (bVarA == null || (window2 = bVarA.getWindow()) == null) {
                return;
            }
            WindowManager.LayoutParams attributes = window2.getAttributes();
            attributes.screenBrightness = 1.0f;
            window2.setAttributes(attributes);
            return;
        }
        if (facingMode != CameraProperties.b.User) {
            gVar.c(false);
            return;
        }
        this.viewController.l();
        j.b bVarA2 = hq.g.a(this.context);
        if (bVarA2 == null || (window = bVarA2.getWindow()) == null) {
            return;
        }
        WindowManager.LayoutParams attributes2 = window.getAttributes();
        attributes2.screenBrightness = -1.0f;
        window.setAttributes(attributes2);
    }

    /* JADX WARN: Code duplicated, block: B:108:0x026c  */
    /* JADX WARN: Code duplicated, block: B:109:0x026e  */
    /* JADX WARN: Code duplicated, block: B:116:0x0282  */
    /* JADX WARN: Code duplicated, block: B:119:0x0298  */
    /* JADX WARN: Code duplicated, block: B:121:0x02aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:122:0x02ac A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:123:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:125:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:127:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:128:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:129:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:143:0x0360  */
    /* JADX WARN: Code duplicated, block: B:147:0x036e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:151:0x0375  */
    /* JADX WARN: Code duplicated, block: B:154:0x0395  */
    /* JADX WARN: Type inference failed for: r0v32, types: [T, xp.y] */
    /* JADX WARN: Type inference failed for: r0v34, types: [T, xp.x] */
    public final void H(@NotNull SelfieWorkflow.c.a rendering, @Nullable tq.a systemUiController) throws CameraAccessException {
        dn.r0.c cVar;
        boolean isCapturing;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        final int iIndexOf;
        String str;
        TextBasedComponentStyle navBarTitleStyleValue;
        boolean z16;
        boolean z17;
        boolean z18;
        StepStyles.SelfieStepStyle styles;
        int i10;
        String string;
        Function1<? super Throwable, Unit> function1;
        final k0 k0Var = this;
        final SelfieWorkflow.c.a rendering2 = rendering;
        Intrinsics.checkNotNullParameter(rendering2, "rendering");
        k0Var.currentErrorHandler = rendering2.r();
        k0Var.permissionChangedHandler = rendering2.v();
        StepStyles.SelfieStepStyle styles2 = rendering2.getStyles();
        if (styles2 != null) {
            k0Var.viewController.n(styles2, systemUiController);
        }
        if (rendering2.getRequestingPermissions()) {
            return;
        }
        final dn.g gVarE = E(rendering);
        if (rendering2.getRecordingLocallyRequired() && !gVarE.getRecordingStarted() && (function1 = k0Var.currentErrorHandler) != null) {
            function1.invoke(new dn.l0(false));
        }
        gVarE.getPreviewView().setVisibility(0);
        s0 s0VarO = k0Var.viewController.o(rendering2.getRequireStrictSelfieCapture());
        k0Var.selfieDirectionFeed.m(s0VarO.getMinFaceRatio(), s0VarO.getMaxFaceRatio(), rendering2.getIsAutoFlashOnManualCaptureEnabled());
        dn.n0 n0Var = k0Var.selfieDirectionFeed;
        in.a pose = rendering2.getPose();
        int i11 = pose == null ? -1 : a.f36158a[pose.ordinal()];
        if (i11 == -1) {
            cVar = dn.r0.c.None;
        } else if (i11 == 1) {
            cVar = dn.r0.c.Center;
        } else if (i11 == 2) {
            cVar = dn.r0.c.Left;
        } else if (i11 == 3) {
            cVar = dn.r0.c.Right;
        } else if (i11 == 4) {
            cVar = dn.r0.c.Up;
        } else {
            if (i11 != 5) {
                throw new gt.l();
            }
            cVar = dn.r0.c.Down;
        }
        n0Var.n(cVar);
        if (!k0Var.takingManualCapture) {
            k0Var.G(rendering2.getIsFlashOn());
        }
        final kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        final SelfieWorkflow.c.a.AbstractC0235a mode = rendering2.getMode();
        if (!(mode instanceof SelfieWorkflow.c.a.AbstractC0235a.h)) {
            if (mode instanceof SelfieWorkflow.c.a.AbstractC0235a.j) {
                d2 d2Var = k0Var.maxRecordingLimitJob;
                if (d2Var != null) {
                    d2.a.a(d2Var, null, 1, null);
                }
                k0Var.maxRecordingLimitJob = iu.k.d(k0Var.lifecycleScope, g1.b(), null, new g(mode, gVarE, k0Var, null), 2, null);
            } else {
                if (mode instanceof SelfieWorkflow.c.a.AbstractC0235a.g) {
                    SelfieWorkflow.c.a.AbstractC0235a.g gVar = (SelfieWorkflow.c.a.AbstractC0235a.g) mode;
                    switch (a.b[gVar.getOverlay().ordinal()]) {
                        case 1:
                        case 2:
                            gVar.b().invoke();
                            break;
                        case 3:
                            k0Var.viewController.k(new Function0() { // from class: xp.w
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return k0.P(mode);
                                }
                            });
                            break;
                        case 4:
                            k0Var.viewController.f(new Function0() { // from class: xp.f0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return k0.Q(mode);
                                }
                            });
                            break;
                        case 5:
                            k0Var.viewController.p(new Function0() { // from class: xp.g0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return k0.R(mode);
                                }
                            });
                            break;
                        case 6:
                            k0Var.viewController.m(new Function0() { // from class: xp.h0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return k0.S(mode);
                                }
                            });
                            break;
                        case 7:
                            k0Var.viewController.h(new Function0() { // from class: xp.i0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return k0.T(mode);
                                }
                            });
                            break;
                        default:
                            throw new gt.l();
                    }
                } else {
                    if (mode instanceof SelfieWorkflow.c.a.AbstractC0235a.C0237c) {
                        k0Var.viewController.e(((SelfieWorkflow.c.a.AbstractC0235a.C0237c) mode).getCountDown());
                        z11 = false;
                        z12 = false;
                        isCapturing = false;
                        z13 = true;
                    } else if (mode instanceof SelfieWorkflow.c.a.AbstractC0235a.i) {
                        SelfieWorkflow.c.a.AbstractC0235a.i iVar = (SelfieWorkflow.c.a.AbstractC0235a.i) mode;
                        if (iVar.getImageCaptured()) {
                            k0Var.viewController.d(rendering2.getMessage(), rendering2.getDescription(), new Function0() { // from class: xp.j0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return k0.U(mode);
                                }
                            });
                        } else {
                            iVar.c().invoke();
                        }
                        z12 = false;
                        z13 = false;
                        isCapturing = false;
                        z11 = true;
                    } else if (mode instanceof SelfieWorkflow.c.a.AbstractC0235a.C0236a) {
                        k0Var = k0Var;
                        z12 = false;
                        z13 = false;
                        isCapturing = false;
                        z11 = true;
                        gVarE = gVarE;
                        rendering2 = rendering2;
                        z10 = true;
                    } else {
                        if (mode instanceof SelfieWorkflow.c.a.AbstractC0235a.e) {
                            c0Var.f23007a = new Function0() { // from class: xp.x
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return k0.V(this.f36241a, rendering2, gVarE, mode);
                                }
                            };
                            SelfieWorkflow.c.a.AbstractC0235a.e eVar = (SelfieWorkflow.c.a.AbstractC0235a.e) mode;
                            if (eVar.getForceCapture()) {
                                X(k0Var, rendering2, gVarE, mode);
                                z11 = false;
                            } else {
                                z11 = true;
                            }
                            if (eVar.getIsCapturing() || k0Var.takingManualCapture) {
                                z11 = false;
                            }
                            isCapturing = eVar.getIsCapturing();
                            z12 = false;
                        } else if (mode instanceof SelfieWorkflow.c.a.AbstractC0235a.f) {
                            c0Var.f23007a = new Function0() { // from class: xp.y
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return k0.W(mode);
                                }
                            };
                        } else if (mode instanceof SelfieWorkflow.c.a.AbstractC0235a.b) {
                            isCapturing = ((SelfieWorkflow.c.a.AbstractC0235a.b) mode).getIsCapturing();
                            z11 = false;
                            z12 = false;
                        } else {
                            if (!(mode instanceof SelfieWorkflow.c.a.AbstractC0235a.d)) {
                                throw new gt.l();
                            }
                            d2 d2Var2 = k0Var.maxRecordingLimitJob;
                            if (d2Var2 != null) {
                                d2.a.a(d2Var2, null, 1, null);
                            }
                            if (((SelfieWorkflow.c.a.AbstractC0235a.d) mode).getStartFinalize()) {
                                iu.k.d(k0Var.lifecycleScope, g1.c(), null, new e(gVarE, k0Var, rendering2, mode, null), 2, null);
                            }
                            isCapturing = false;
                            z10 = true;
                            z11 = true;
                            z12 = true;
                            z13 = true;
                        }
                        z13 = true;
                        gVarE = gVarE;
                        rendering2 = rendering2;
                        z10 = z12;
                    }
                    gVarE = gVarE;
                    rendering2 = rendering2;
                    z10 = isCapturing;
                }
                z12 = false;
                isCapturing = false;
                z11 = true;
                z13 = true;
                gVarE = gVarE;
                rendering2 = rendering2;
                z10 = isCapturing;
            }
            if (rendering2.getFacingMode() == CameraProperties.b.User) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (z10 && k0Var.cameraFacingDirections.size() >= 2 && rendering2.getAllowSwitchCamera()) {
                z15 = true;
            } else {
                z15 = false;
            }
            iIndexOf = (k0Var.cameraFacingDirections.indexOf(rendering2.getFacingMode()) + 1) % k0Var.cameraFacingDirections.size();
            if (z15) {
                i10 = a.f36159c[k0Var.cameraFacingDirections.get(iIndexOf).ordinal()];
                if (i10 != 1) {
                    Context context = k0Var.context;
                    string = context.getString(tp.g.Z, context.getString(tp.g.f32525d));
                } else if (i10 != 2) {
                    Context context2 = k0Var.context;
                    string = context2.getString(tp.g.Z, context2.getString(tp.g.f32523c));
                } else {
                    if (i10 == 3) {
                        throw new gt.l();
                    }
                    string = k0Var.context.getString(tp.g.f32521a0);
                }
                str = string;
            } else {
                str = null;
            }
            r0 r0Var = k0Var.viewController;
            boolean z19 = z11;
            String title = rendering2.getCom.withpersona.sdk2.inquiry.network.dto.ui.components.Title.type java.lang.String();
            String autoCaptureText = rendering2.getAutoCaptureText();
            String realTimeHint = rendering2.getRealTimeHint();
            String message = rendering2.getMessage();
            final dn.g gVar2 = gVarE;
            String description = rendering2.getDescription();
            String captureSuccessText = rendering2.getCaptureSuccessText();
            String disclaimerText = rendering2.getDisclaimerText();
            boolean isAutoCaptureOn = rendering2.getIsAutoCaptureOn();
            boolean isFlashEnabled = rendering2.getIsFlashEnabled();
            navBarTitleStyleValue = null;
            String hintVerifyingText = rendering2.getHintVerifyingText();
            String hintAutoCaptureTimeoutText = rendering2.getHintAutoCaptureTimeoutText();
            boolean z20 = rendering2.getMode() instanceof SelfieWorkflow.c.a.AbstractC0235a.j;
            if ((rendering2.getMode() instanceof SelfieWorkflow.c.a.AbstractC0235a.j) && !(rendering2.getMode() instanceof SelfieWorkflow.c.a.AbstractC0235a.h)) {
                com.withpersona.sdk2.camera.d value = gVar2.b().getValue();
                z16 = z10;
                com.withpersona.sdk2.camera.d.Ready ready = value instanceof com.withpersona.sdk2.camera.d.Ready ? (com.withpersona.sdk2.camera.d.Ready) value : null;
                if (ready == null || ready.getFirstFrameReceived()) {
                    z17 = false;
                }
                z18 = true;
                boolean z21 = !z16;
                boolean z22 = !z16;
                if (z13 || !z19 || c0Var.f23007a == 0) {
                    z18 = false;
                }
                boolean z23 = rendering2.getMode() instanceof SelfieWorkflow.c.a.AbstractC0235a.C0237c;
                NavigationState navigationState = rendering2.getNavigationState();
                String navBarTitle = rendering2.getNavBarTitle();
                styles = rendering2.getStyles();
                if (styles != null) {
                    navBarTitleStyleValue = styles.getNavBarTitleStyleValue();
                }
                r0Var.g(systemUiController, title, autoCaptureText, realTimeHint, message, description, captureSuccessText, disclaimerText, hintAutoCaptureTimeoutText, hintVerifyingText, isAutoCaptureOn, isFlashEnabled, z14, z20, z17, z12, str, z15, z13, z21, z13, z22, z18, z23, isCapturing, navigationState, navBarTitle, navBarTitleStyleValue, k0Var.a0(rendering2.getMode().getOverlay(), z14), rendering2.getPoseScore(), rendering2.getBrightnessInfo(), rendering2.getWatermarkText(), rendering2.getStyles(), new Function0() { // from class: xp.z
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return k0.J(this.f36245a, rendering2, iIndexOf);
                    }
                }, new Function0() { // from class: xp.a0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return k0.K(rendering2, k0Var);
                    }
                }, new Function0() { // from class: xp.b0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return k0.L(rendering2);
                    }
                }, new Function0() { // from class: xp.c0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return k0.M(rendering2);
                    }
                }, new Function0() { // from class: xp.d0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return k0.N(this.f36128a, c0Var);
                    }
                });
                uq.z.b(gVar2.getPreviewView(), new Function0() { // from class: xp.e0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return k0.O(this.f36130a, gVar2);
                    }
                });
                k0Var.lastRendering = rendering2;
            }
            z16 = z10;
            z17 = true;
            z18 = true;
            boolean z24 = !z16;
            boolean z25 = !z16;
            if (z13) {
                z18 = false;
            } else {
                z18 = false;
            }
            boolean z26 = rendering2.getMode() instanceof SelfieWorkflow.c.a.AbstractC0235a.C0237c;
            NavigationState navigationState2 = rendering2.getNavigationState();
            String navBarTitle2 = rendering2.getNavBarTitle();
            styles = rendering2.getStyles();
            if (styles != null) {
                navBarTitleStyleValue = styles.getNavBarTitleStyleValue();
            }
            r0Var.g(systemUiController, title, autoCaptureText, realTimeHint, message, description, captureSuccessText, disclaimerText, hintAutoCaptureTimeoutText, hintVerifyingText, isAutoCaptureOn, isFlashEnabled, z14, z20, z17, z12, str, z15, z13, z24, z13, z25, z18, z26, isCapturing, navigationState2, navBarTitle2, navBarTitleStyleValue, k0Var.a0(rendering2.getMode().getOverlay(), z14), rendering2.getPoseScore(), rendering2.getBrightnessInfo(), rendering2.getWatermarkText(), rendering2.getStyles(), new Function0() { // from class: xp.z
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return k0.J(this.f36245a, rendering2, iIndexOf);
                }
            }, new Function0() { // from class: xp.a0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return k0.K(rendering2, k0Var);
                }
            }, new Function0() { // from class: xp.b0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return k0.L(rendering2);
                }
            }, new Function0() { // from class: xp.c0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return k0.M(rendering2);
                }
            }, new Function0() { // from class: xp.d0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return k0.N(this.f36128a, c0Var);
                }
            });
            uq.z.b(gVar2.getPreviewView(), new Function0() { // from class: xp.e0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return k0.O(this.f36130a, gVar2);
                }
            });
            k0Var.lastRendering = rendering2;
        }
        androidx.p000lifecycle.m mVar = k0Var.lifecycleScope;
        iu.l0 l0VarA = g1.a();
        f fVar = new f(gVarE, k0Var, mode, rendering2, null);
        rendering2 = rendering2;
        iu.k.d(mVar, l0VarA, null, fVar, 2, null);
        k0Var = k0Var;
        z12 = false;
        isCapturing = false;
        z11 = true;
        z13 = true;
        gVarE = gVarE;
        rendering2 = rendering2;
        z10 = true;
        if (rendering2.getFacingMode() == CameraProperties.b.User) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z10) {
            z15 = false;
        } else {
            z15 = false;
        }
        iIndexOf = (k0Var.cameraFacingDirections.indexOf(rendering2.getFacingMode()) + 1) % k0Var.cameraFacingDirections.size();
        if (z15) {
            i10 = a.f36159c[k0Var.cameraFacingDirections.get(iIndexOf).ordinal()];
            if (i10 != 1) {
                Context context3 = k0Var.context;
                string = context3.getString(tp.g.Z, context3.getString(tp.g.f32525d));
            } else if (i10 != 2) {
                Context context4 = k0Var.context;
                string = context4.getString(tp.g.Z, context4.getString(tp.g.f32523c));
            } else {
                if (i10 == 3) {
                    throw new gt.l();
                }
                string = k0Var.context.getString(tp.g.f32521a0);
            }
            str = string;
        } else {
            str = null;
        }
        r0 r0Var2 = k0Var.viewController;
        boolean z110 = z11;
        String title2 = rendering2.getCom.withpersona.sdk2.inquiry.network.dto.ui.components.Title.type java.lang.String();
        String autoCaptureText2 = rendering2.getAutoCaptureText();
        String realTimeHint2 = rendering2.getRealTimeHint();
        String message2 = rendering2.getMessage();
        final dn.g gVar3 = gVarE;
        String description2 = rendering2.getDescription();
        String captureSuccessText2 = rendering2.getCaptureSuccessText();
        String disclaimerText2 = rendering2.getDisclaimerText();
        boolean isAutoCaptureOn2 = rendering2.getIsAutoCaptureOn();
        boolean isFlashEnabled2 = rendering2.getIsFlashEnabled();
        navBarTitleStyleValue = null;
        String hintVerifyingText2 = rendering2.getHintVerifyingText();
        String hintAutoCaptureTimeoutText2 = rendering2.getHintAutoCaptureTimeoutText();
        boolean z27 = rendering2.getMode() instanceof SelfieWorkflow.c.a.AbstractC0235a.j;
        if (rendering2.getMode() instanceof SelfieWorkflow.c.a.AbstractC0235a.j) {
            z16 = z10;
            z17 = true;
        } else {
            z16 = z10;
            z17 = true;
        }
        z18 = true;
        boolean z28 = !z16;
        boolean z29 = !z16;
        if (z13) {
            z18 = false;
        } else {
            z18 = false;
        }
        boolean z210 = rendering2.getMode() instanceof SelfieWorkflow.c.a.AbstractC0235a.C0237c;
        NavigationState navigationState3 = rendering2.getNavigationState();
        String navBarTitle3 = rendering2.getNavBarTitle();
        styles = rendering2.getStyles();
        if (styles != null) {
            navBarTitleStyleValue = styles.getNavBarTitleStyleValue();
        }
        r0Var2.g(systemUiController, title2, autoCaptureText2, realTimeHint2, message2, description2, captureSuccessText2, disclaimerText2, hintAutoCaptureTimeoutText2, hintVerifyingText2, isAutoCaptureOn2, isFlashEnabled2, z14, z27, z17, z12, str, z15, z13, z28, z13, z29, z18, z210, isCapturing, navigationState3, navBarTitle3, navBarTitleStyleValue, k0Var.a0(rendering2.getMode().getOverlay(), z14), rendering2.getPoseScore(), rendering2.getBrightnessInfo(), rendering2.getWatermarkText(), rendering2.getStyles(), new Function0() { // from class: xp.z
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k0.J(this.f36245a, rendering2, iIndexOf);
            }
        }, new Function0() { // from class: xp.a0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k0.K(rendering2, k0Var);
            }
        }, new Function0() { // from class: xp.b0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k0.L(rendering2);
            }
        }, new Function0() { // from class: xp.c0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k0.M(rendering2);
            }
        }, new Function0() { // from class: xp.d0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k0.N(this.f36128a, c0Var);
            }
        });
        uq.z.b(gVar3.getPreviewView(), new Function0() { // from class: xp.e0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k0.O(this.f36130a, gVar3);
            }
        });
        k0Var.lastRendering = rendering2;
    }

    @Override // ym.k
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void b(@NotNull SelfieWorkflow.c.a rendering, @NotNull ViewEnvironment viewEnvironment) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        H(rendering, tq.c.a(viewEnvironment));
    }

    public final fn.m0 Y(CameraProperties.b bVar) {
        int i10 = a.f36159c[bVar.ordinal()];
        if (i10 == 1) {
            return fn.m0.FRONT;
        }
        if (i10 == 2) {
            return fn.m0.BACK;
        }
        if (i10 == 3) {
            return fn.m0.EXTERNAL;
        }
        throw new gt.l();
    }

    public final com.withpersona.sdk2.camera.b.a Z(CameraProperties.b bVar) {
        int i10 = a.f36159c[bVar.ordinal()];
        if (i10 == 1) {
            return com.withpersona.sdk2.camera.b.a.FRONT;
        }
        if (i10 == 2) {
            return com.withpersona.sdk2.camera.b.a.BACK;
        }
        if (i10 == 3) {
            return com.withpersona.sdk2.camera.b.a.EXTERNAL;
        }
        throw new gt.l();
    }

    public final SelfieOverlayView.e a0(SelfieWorkflow.c.a.b bVar, boolean z10) {
        switch (a.b[bVar.ordinal()]) {
            case 1:
                return SelfieOverlayView.e.None;
            case 2:
                return SelfieOverlayView.e.Finalizing;
            case 3:
                return SelfieOverlayView.e.Center;
            case 4:
                return z10 ? SelfieOverlayView.e.Left : SelfieOverlayView.e.Right;
            case 5:
                return z10 ? SelfieOverlayView.e.Right : SelfieOverlayView.e.Left;
            case 6:
                return SelfieOverlayView.e.Up;
            case 7:
                return SelfieOverlayView.e.Down;
            default:
                throw new gt.l();
        }
    }
}
