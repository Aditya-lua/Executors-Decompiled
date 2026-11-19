package nq;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.camera.view.PreviewView;
import av.d2;
import av.g1;
import av.n2;
import com.github.luben.zstd.BuildConfig;
import com.withpersona.sdk2.camera.camera2.Camera2PreviewView;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.selfie.view.SelfieOverlayView;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.SelfieCaptureButtonEventData;
import com.withpersona.sdk2.inquiry.tracking.model.SelfieCaptureButtonType;
import com.withpersona.sdk2.inquiry.tracking.model.SelfieCaptureState;
import com.withpersona.sdk2.inquiry.tracking.model.SelfieCaptureStateEventData;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mq.q5;
import nn.ViewEnvironment;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.collections.CollectionsKt;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;
import sn.a1;
import sn.b1;
import sn.f1;
import sn.j1;
import sn.t0;
import sn.u0;
import sn.v0;
import sn.z0;
import un.CameraChoices;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001e\u001a\u00020\u001d*\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010!\u001a\u00020 *\u00020\u001cH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\u0012H\u0002¢\u0006\u0004\b%\u0010&J\u001b\u0010*\u001a\u00020)*\u00020'2\u0006\u0010(\u001a\u00020\rH\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020$2\u0006\u0010,\u001a\u00020\rH\u0002¢\u0006\u0004\b-\u0010.J\u001f\u00101\u001a\u00020$2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J\u001f\u00105\u001a\u00020$2\u0006\u0010\u0011\u001a\u00020\u00022\b\u00104\u001a\u0004\u0018\u000103¢\u0006\u0004\b5\u00106R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010!R\u0014\u0010E\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010#\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010J\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010M\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u001c\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u001c0N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0018\u0010U\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0018\u0010W\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010TR\u0018\u0010Y\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010TR*\u0010_\u001a\u0016\u0012\u0004\u0012\u00020[\u0012\u0004\u0012\u00020$\u0018\u00010Zj\u0004\u0018\u0001`\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u001e\u0010c\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010`8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u0016\u0010e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010!¨\u0006f"}, d2 = {"Lnq/k0;", "Lnn/k;", "Lmq/q5$d$a;", "Landroid/content/Context;", "context", "Lnq/r0;", "viewController", "Lsn/t;", "cameraPreview", "Lsn/b1;", "selfieDirectionFeed", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", BuildConfig.FLAVOR, "useCameraXForVideo", "<init>", "(Landroid/content/Context;Lnq/r0;Lsn/t;Lsn/b1;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Z)V", "rendering", "Lsn/i;", "E", "(Lmq/q5$d$a;)Lsn/i;", "Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;", "camera2Preview", "C", "(Lmq/q5$d$a;Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;)Lsn/i;", "recordVideo", "D", "(Lmq/q5$d$a;Z)Lsn/i;", "Lsn/v$b;", "Lun/m0;", "Y", "(Lsn/v$b;)Lun/m0;", "Lsn/t$a;", "Z", "(Lsn/v$b;)Lsn/t$a;", "cameraController", BuildConfig.FLAVOR, "F", "(Lsn/i;)V", "Lmq/q5$d$a$b;", "isPreviewMirrored", "Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;", "a0", "(Lmq/q5$d$a$b;Z)Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;", "on", "G", "(Z)V", "Lnn/z;", "viewEnvironment", "I", "(Lmq/q5$d$a;Lnn/z;)V", "Ljr/a;", "systemUiController", "H", "(Lmq/q5$d$a;Ljr/a;)V", "b", "Landroid/content/Context;", "c", "Lnq/r0;", "d", "Lsn/t;", "e", "Lsn/b1;", "f", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "g", "Landroidx/lifecycle/m;", "h", "Landroidx/lifecycle/m;", "lifecycleScope", "i", "Lsn/i;", "j", "Lsn/v$b;", "currentFacingMode", "k", "Lmq/q5$d$a;", "lastRendering", BuildConfig.FLAVOR, "l", "Ljava/util/List;", "cameraFacingDirections", "Lav/d2;", "m", "Lav/d2;", "cameraStateListenerJob", "n", "maxRecordingLimitJob", "o", "manualCaptureJob", "Lkotlin/Function1;", BuildConfig.FLAVOR, "Lcom/withpersona/sdk2/inquiry/selfie/CameraErrorHandler;", "p", "Lkotlin/jvm/functions/Function1;", "currentErrorHandler", "Lkotlin/Function0;", "q", "Lkotlin/jvm/functions/Function0;", "permissionChangedHandler", "r", "takingManualCapture", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k0 implements nn.k<q5.d.a> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final r0 viewController;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final sn.t cameraPreview;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final b1 selfieDirectionFeed;

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
    public sn.i cameraController;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public sn.v.b currentFacingMode;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public q5.d.a lastRendering;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public List<? extends sn.v.b> cameraFacingDirections;

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
        public static final /* synthetic */ int[] f26505a;
        public static final /* synthetic */ int[] b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f26506c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f26507d;

        static {
            int[] iArr = new int[xn.a.values().length];
            try {
                iArr[xn.a.Center.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[xn.a.Left.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[xn.a.Right.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[xn.a.Up.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[xn.a.Down.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f26505a = iArr;
            int[] iArr2 = new int[q5.d.a.b.values().length];
            try {
                iArr2[q5.d.a.b.CLEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[q5.d.a.b.FINALIZING.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[q5.d.a.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[q5.d.a.b.LOOK_LEFT.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[q5.d.a.b.LOOK_RIGHT.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[q5.d.a.b.LOOK_UP.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[q5.d.a.b.LOOK_DOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused12) {
            }
            b = iArr2;
            int[] iArr3 = new int[sn.v.b.values().length];
            try {
                iArr3[sn.v.b.User.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[sn.v.b.Environment.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[sn.v.b.Unknown.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            f26506c = iArr3;
            int[] iArr4 = new int[zn.a.values().length];
            try {
                iArr4[zn.a.Stream.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[zn.a.Upload.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[zn.a.None.ordinal()] = 3;
            } catch (NoSuchFieldError unused18) {
            }
            f26507d = iArr4;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"nq/k0$b", "Lsn/z;", BuildConfig.FLAVOR, "a", "()V", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements sn.z {
        public final /* synthetic */ q5.d.a b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f26509c;

        public b(q5.d.a aVar, boolean z10) {
            this.b = aVar;
            this.f26509c = z10;
        }

        public static final Unit c(q5.d.a aVar, sn.k it) {
            Intrinsics.checkNotNullParameter(it, "it");
            aVar.r().invoke(it);
            return Unit.f21506a;
        }

        @Override // sn.z
        public void a() {
            sn.t tVar = k0.this.cameraPreview;
            PreviewView previewViewK = k0.this.viewController.k();
            sn.t.a aVarZ = k0.this.Z(this.b.getFacingMode());
            b1 b1Var = k0.this.selfieDirectionFeed;
            boolean z10 = this.f26509c;
            final q5.d.a aVar = this.b;
            tVar.f(previewViewK, aVarZ, b1Var, true, z10, new Function1() { // from class: nq.l0
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return k0.b.c(aVar, (sn.k) obj);
                }
            });
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"nq/k0$c", "Landroidx/lifecycle/f;", "Landroidx/lifecycle/s;", "owner", BuildConfig.FLAVOR, "onResume", "(Landroidx/lifecycle/s;)V", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements androidx.p000lifecycle.f {
        public final /* synthetic */ sn.i b;

        public c(sn.i iVar) {
            this.b = iVar;
        }

        public static final void b(k0 k0Var, sn.i iVar) {
            Function0 function0 = k0Var.permissionChangedHandler;
            if (function0 != null) {
                function0.invoke();
            }
            k0Var.F(iVar);
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
            final sn.i iVar = this.b;
            root.post(new Runnable() { // from class: nq.m0
                @Override // java.lang.Runnable
                public final void run() {
                    k0.c.b(k0Var, iVar);
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.selfie.cameraScreen.CameraScreenRunner$registerCameraStateListener$1", f = "CameraScreenRunner.kt", l = {652}, m = "invokeSuspend")
    public static final class d extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f26511t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ sn.i f26512u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ k0 f26513v;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements dv.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ k0 f26514a;

            public a(k0 k0Var) {
                this.f26514a = k0Var;
            }

            @Override // dv.i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(sn.y yVar, eu.b<? super Unit> bVar) {
                Function1 function1;
                if (Intrinsics.c(yVar, sn.y.b.f31746a)) {
                    Function1 function2 = this.f26514a.currentErrorHandler;
                    if (function2 != null) {
                        function2.invoke(new j1());
                    }
                } else if (yVar instanceof sn.y.Closed) {
                    sn.y.Closed closed = (sn.y.Closed) yVar;
                    if (closed.getWasRecordingInterrupted() && (function1 = this.f26514a.currentErrorHandler) != null) {
                        function1.invoke(new z0(closed.getIsClosedDueToBadCameraConfiguration()));
                    }
                }
                return Unit.f21506a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(sn.i iVar, k0 k0Var, eu.b<? super d> bVar) {
            super(2, bVar);
            this.f26512u = iVar;
            this.f26513v = k0Var;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new d(this.f26512u, this.f26513v, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f26511t;
            if (i10 == 0) {
                zt.o.b(obj);
                dv.h<sn.y> hVarA = sn.j.a(this.f26512u.b());
                a aVar = new a(this.f26513v);
                this.f26511t = 1;
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
    @gu.f(c = "com.withpersona.sdk2.inquiry.selfie.cameraScreen.CameraScreenRunner$showRendering$12", f = "CameraScreenRunner.kt", l = {403}, m = "invokeSuspend")
    public static final class e extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f26515t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ sn.i f26516u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ k0 f26517v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ q5.d.a f26518w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ q5.d.a.AbstractC0467a f26519x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(sn.i iVar, k0 k0Var, q5.d.a aVar, q5.d.a.AbstractC0467a abstractC0467a, eu.b<? super e> bVar) {
            super(2, bVar);
            this.f26516u = iVar;
            this.f26517v = k0Var;
            this.f26518w = aVar;
            this.f26519x = abstractC0467a;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new e(this.f26516u, this.f26517v, this.f26518w, this.f26519x, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
            return ((e) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objK;
            Object objE = fu.c.e();
            int i10 = this.f26515t;
            if (i10 == 0) {
                zt.o.b(obj);
                sn.i iVar = this.f26516u;
                this.f26515t = 1;
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
            k0 k0Var = this.f26517v;
            q5.d.a aVar = this.f26518w;
            q5.d.a.AbstractC0467a abstractC0467a = this.f26519x;
            if (zt.n.h(objK)) {
                TrackingEventsLogger.logVideoStopEvent$default(k0Var.trackingEventsLogger, "selfie", aVar.getVideoCaptureMethod().name(), null, null, null, null, false, 124, null);
                q5.d.a.AbstractC0467a.C0469d c0469d = (q5.d.a.AbstractC0467a.C0469d) abstractC0467a;
                c0469d.b().invoke((File) objK);
                c0469d.c().invoke();
            }
            k0 k0Var2 = this.f26517v;
            q5.d.a aVar2 = this.f26518w;
            q5.d.a.AbstractC0467a abstractC0467a2 = this.f26519x;
            Throwable thE = zt.n.e(objK);
            if (thE != null) {
                TrackingEventsLogger.logVideoErrorEvent$default(k0Var2.trackingEventsLogger, "selfie", aVar2.getVideoCaptureMethod().name(), null, zt.a.b(thE), false, 20, null);
                if (!(thE instanceof t0)) {
                    aVar2.r().invoke(thE);
                    ((q5.d.a.AbstractC0467a.C0469d) abstractC0467a2).c().invoke();
                }
            }
            return Unit.f21506a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.selfie.cameraScreen.CameraScreenRunner$showRendering$2", f = "CameraScreenRunner.kt", l = {192, 194}, m = "invokeSuspend")
    public static final class f extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f26520t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ sn.i f26521u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ k0 f26522v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ q5.d.a.AbstractC0467a f26523w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ q5.d.a f26524x;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lsn/y;", "it", BuildConfig.FLAVOR, "<anonymous>", "(Lsn/y;)Z"}, k = 3, mv = {2, 2, 0})
        @gu.f(c = "com.withpersona.sdk2.inquiry.selfie.cameraScreen.CameraScreenRunner$showRendering$2$1", f = "CameraScreenRunner.kt", l = {}, m = "invokeSuspend")
        public static final class a extends gu.m implements Function2<sn.y, eu.b<? super Boolean>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f26525t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f26526u;

            public a(eu.b<? super a> bVar) {
                super(2, bVar);
            }

            @Override // gu.a
            public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
                a aVar = new a(bVar);
                aVar.f26526u = obj;
                return aVar;
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                sn.y yVar = (sn.y) this.f26526u;
                fu.c.e();
                if (this.f26525t != 0) {
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
        @gu.f(c = "com.withpersona.sdk2.inquiry.selfie.cameraScreen.CameraScreenRunner$showRendering$2$2", f = "CameraScreenRunner.kt", l = {195, 216}, m = "invokeSuspend")
        public static final class b extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f26527t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ sn.i f26528u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ k0 f26529v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ q5.d.a.AbstractC0467a f26530w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public final /* synthetic */ q5.d.a f26531x;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
            @gu.f(c = "com.withpersona.sdk2.inquiry.selfie.cameraScreen.CameraScreenRunner$showRendering$2$2$3$1", f = "CameraScreenRunner.kt", l = {225, 231}, m = "invokeSuspend")
            public static final class a extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public int f26532t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public final /* synthetic */ q5.d.a.AbstractC0467a f26533u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                public final /* synthetic */ sn.i f26534v;

                /* JADX INFO: renamed from: w, reason: collision with root package name */
                public final /* synthetic */ k0 f26535w;

                /* JADX INFO: renamed from: x, reason: collision with root package name */
                public final /* synthetic */ q5.d.a f26536x;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(q5.d.a.AbstractC0467a abstractC0467a, sn.i iVar, k0 k0Var, q5.d.a aVar, eu.b<? super a> bVar) {
                    super(2, bVar);
                    this.f26533u = abstractC0467a;
                    this.f26534v = iVar;
                    this.f26535w = k0Var;
                    this.f26536x = aVar;
                }

                @Override // gu.a
                public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
                    return new a(this.f26533u, this.f26534v, this.f26535w, this.f26536x, bVar);
                }

                @Override // p001kotlin.jvm.functions.Function2
                public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
                    return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
                
                    if (r14 == r0) goto L19;
                 */
                @Override // gu.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    Object objK;
                    Object objE = fu.c.e();
                    int i10 = this.f26532t;
                    if (i10 == 0) {
                        zt.o.b(obj);
                        long maxRecordingLengthMs = ((q5.d.a.AbstractC0467a.h) this.f26533u).getMaxRecordingLengthMs();
                        this.f26532t = 1;
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
                    k0 k0Var = this.f26535w;
                    q5.d.a aVar = this.f26536x;
                    if (zt.n.h(objK)) {
                        TrackingEventsLogger.logVideoStopEvent$default(k0Var.trackingEventsLogger, "selfie", aVar.getVideoCaptureMethod().name(), null, null, null, null, false, 124, null);
                        ((File) objK).delete();
                    }
                    k0 k0Var2 = this.f26535w;
                    q5.d.a aVar2 = this.f26536x;
                    Throwable thE = zt.n.e(objK);
                    if (thE != null) {
                        TrackingEventsLogger.logVideoErrorEvent$default(k0Var2.trackingEventsLogger, "selfie", aVar2.getVideoCaptureMethod().name(), null, zt.a.b(thE), false, 20, null);
                    }
                    Function1 function1 = this.f26535w.currentErrorHandler;
                    if (function1 != null) {
                        function1.invoke(new a1());
                    }
                    return Unit.f21506a;
                    if (this.f26534v.b().getValue() instanceof sn.y.Closed) {
                        return Unit.f21506a;
                    }
                    sn.i iVar = this.f26534v;
                    this.f26532t = 2;
                    objK = iVar.k(this);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(sn.i iVar, k0 k0Var, q5.d.a.AbstractC0467a abstractC0467a, q5.d.a aVar, eu.b<? super b> bVar) {
                super(2, bVar);
                this.f26528u = iVar;
                this.f26529v = k0Var;
                this.f26530w = abstractC0467a;
                this.f26531x = aVar;
            }

            @Override // gu.a
            public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
                return new b(this.f26528u, this.f26529v, this.f26530w, this.f26531x, bVar);
            }

            @Override // p001kotlin.jvm.functions.Function2
            public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
                return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
            }

            /* JADX WARN: Code duplicated, block: B:27:0x00c7  */
            /* JADX WARN: Code duplicated, block: B:29:0x00e7  */
            /* JADX WARN: Code duplicated, block: B:31:0x00ed  */
            /* JADX WARN: Code duplicated, block: B:35:0x0117  */
            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                Object objK;
                Object value;
                k0 k0Var;
                q5.d.a aVar;
                q5.d.a.AbstractC0467a abstractC0467a;
                sn.i iVar;
                q5.d.a.AbstractC0467a abstractC0467a2;
                k0 k0Var2;
                q5.d.a aVar2;
                Throwable thE;
                boolean zBooleanValue;
                d2 d2Var;
                Object objE = fu.c.e();
                int i10 = this.f26527t;
                if (i10 == 0) {
                    zt.o.b(obj);
                    sn.i iVar2 = this.f26528u;
                    this.f26527t = 1;
                    objK = iVar2.k(this);
                    if (objK != objE) {
                    }
                    return objE;
                }
                if (i10 == 1) {
                    zt.o.b(obj);
                    objK = ((zt.n) obj).getValue();
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zt.o.b(obj);
                    value = ((zt.n) obj).getValue();
                }
                k0Var = this.f26529v;
                aVar = this.f26531x;
                abstractC0467a = this.f26530w;
                iVar = this.f26528u;
                if (zt.n.h(value)) {
                    zBooleanValue = ((Boolean) value).booleanValue();
                    TrackingEventsLogger.logVideoStartEvent$default(k0Var.trackingEventsLogger, "selfie", aVar.getVideoCaptureMethod().name(), null, false, 12, null);
                    if (zBooleanValue) {
                        d2Var = k0Var.maxRecordingLimitJob;
                        if (d2Var != null) {
                            d2.a.a(d2Var, null, 1, null);
                        }
                        k0Var.maxRecordingLimitJob = av.k.d(k0Var.lifecycleScope, g1.b(), null, new a(abstractC0467a, iVar, k0Var, aVar, null), 2, null);
                    }
                }
                abstractC0467a2 = this.f26530w;
                k0Var2 = this.f26529v;
                aVar2 = this.f26531x;
                thE = zt.n.e(value);
                if (thE != null) {
                    ((q5.d.a.AbstractC0467a.h) abstractC0467a2).c().invoke(thE);
                    TrackingEventsLogger.logVideoErrorEvent$default(k0Var2.trackingEventsLogger, "selfie", aVar2.getVideoCaptureMethod().name(), null, zt.a.b(thE), false, 20, null);
                }
                ((q5.d.a.AbstractC0467a.h) this.f26530w).d().invoke(this.f26528u.f());
                return Unit.f21506a;
                k0 k0Var3 = this.f26529v;
                q5.d.a aVar3 = this.f26531x;
                if (zt.n.h(objK)) {
                    TrackingEventsLogger.logVideoStopEvent$default(k0Var3.trackingEventsLogger, "selfie", aVar3.getVideoCaptureMethod().name(), null, null, null, null, false, 124, null);
                    ((File) objK).delete();
                }
                k0 k0Var4 = this.f26529v;
                q5.d.a aVar4 = this.f26531x;
                Throwable thE2 = zt.n.e(objK);
                if (thE2 != null) {
                    TrackingEventsLogger.logVideoErrorEvent$default(k0Var4.trackingEventsLogger, "selfie", aVar4.getVideoCaptureMethod().name(), null, zt.a.b(thE2), false, 20, null);
                }
                TrackingEventsLogger.logCameraInfoEvent$default(this.f26529v.trackingEventsLogger, sn.w.a(this.f26528u.f()), false, 2, null);
                if (((q5.d.a.AbstractC0467a.h) this.f26530w).getRecordLocalVideo()) {
                    sn.i iVar3 = this.f26528u;
                    this.f26527t = 2;
                    Object objI = iVar3.i(this);
                    if (objI != objE) {
                        value = objI;
                        k0Var = this.f26529v;
                        aVar = this.f26531x;
                        abstractC0467a = this.f26530w;
                        iVar = this.f26528u;
                        if (zt.n.h(value)) {
                            zBooleanValue = ((Boolean) value).booleanValue();
                            TrackingEventsLogger.logVideoStartEvent$default(k0Var.trackingEventsLogger, "selfie", aVar.getVideoCaptureMethod().name(), null, false, 12, null);
                            if (zBooleanValue) {
                                d2Var = k0Var.maxRecordingLimitJob;
                                if (d2Var != null) {
                                    d2.a.a(d2Var, null, 1, null);
                                }
                                k0Var.maxRecordingLimitJob = av.k.d(k0Var.lifecycleScope, g1.b(), null, new a(abstractC0467a, iVar, k0Var, aVar, null), 2, null);
                            }
                        }
                        abstractC0467a2 = this.f26530w;
                        k0Var2 = this.f26529v;
                        aVar2 = this.f26531x;
                        thE = zt.n.e(value);
                        if (thE != null) {
                            ((q5.d.a.AbstractC0467a.h) abstractC0467a2).c().invoke(thE);
                            TrackingEventsLogger.logVideoErrorEvent$default(k0Var2.trackingEventsLogger, "selfie", aVar2.getVideoCaptureMethod().name(), null, zt.a.b(thE), false, 20, null);
                        }
                    }
                    return objE;
                }
                ((q5.d.a.AbstractC0467a.h) this.f26530w).d().invoke(this.f26528u.f());
                return Unit.f21506a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(sn.i iVar, k0 k0Var, q5.d.a.AbstractC0467a abstractC0467a, q5.d.a aVar, eu.b<? super f> bVar) {
            super(2, bVar);
            this.f26521u = iVar;
            this.f26522v = k0Var;
            this.f26523w = abstractC0467a;
            this.f26524x = aVar;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new f(this.f26521u, this.f26522v, this.f26523w, this.f26524x, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
            return ((f) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
        
            if (av.i.g(r10, r3, r9) == r0) goto L15;
         */
        @Override // gu.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f26520t;
            if (i10 == 0) {
                zt.o.b(obj);
                dv.h hVarO = dv.j.O(this.f26521u.b(), new a(null));
                this.f26520t = 1;
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
            n2 n2VarC = g1.c();
            b bVar = new b(this.f26521u, this.f26522v, this.f26523w, this.f26524x, null);
            this.f26520t = 2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.selfie.cameraScreen.CameraScreenRunner$showRendering$3", f = "CameraScreenRunner.kt", l = {263}, m = "invokeSuspend")
    public static final class g extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f26537t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ q5.d.a.AbstractC0467a f26538u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ sn.i f26539v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ k0 f26540w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(q5.d.a.AbstractC0467a abstractC0467a, sn.i iVar, k0 k0Var, eu.b<? super g> bVar) {
            super(2, bVar);
            this.f26538u = abstractC0467a;
            this.f26539v = iVar;
            this.f26540w = k0Var;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new g(this.f26538u, this.f26539v, this.f26540w, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
            return ((g) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f26537t;
            if (i10 == 0) {
                zt.o.b(obj);
                long maxRecordingLengthMs = ((q5.d.a.AbstractC0467a.j) this.f26538u).getMaxRecordingLengthMs();
                this.f26537t = 1;
                if (av.z0.b(maxRecordingLengthMs, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
            }
            if (this.f26539v.b().getValue() instanceof sn.y.Closed) {
                return Unit.f21506a;
            }
            TrackingEventsLogger.logSelfieCaptureStateEvent$default(this.f26540w.trackingEventsLogger, new SelfieCaptureStateEventData(SelfieCaptureState.RECORDING_TIMED_OUT, null, null, null, 8, null), false, 2, null);
            Function1 function1 = this.f26540w.currentErrorHandler;
            if (function1 != null) {
                function1.invoke(new a1());
            }
            return Unit.f21506a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.selfie.cameraScreen.CameraScreenRunner$showRendering$takePhoto$1", f = "CameraScreenRunner.kt", l = {344, 349}, m = "invokeSuspend")
    public static final class h extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f26541t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f26542u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f26543v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ q5.d.a f26545x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ sn.i f26546y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ q5.d.a.AbstractC0467a f26547z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(q5.d.a aVar, sn.i iVar, q5.d.a.AbstractC0467a abstractC0467a, eu.b<? super h> bVar) {
            super(2, bVar);
            this.f26545x = aVar;
            this.f26546y = iVar;
            this.f26547z = abstractC0467a;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            h hVar = k0.this.new h(this.f26545x, this.f26546y, this.f26547z, bVar);
            hVar.f26543v = obj;
            return hVar;
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
            return ((h) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        /* JADX WARN: Code duplicated, block: B:36:0x0088 A[Catch: all -> 0x001f, TryCatch #0 {all -> 0x001f, blocks: (B:7:0x0015, B:34:0x007d, B:36:0x0088, B:37:0x009d, B:39:0x00a5, B:42:0x00aa, B:44:0x00b5, B:14:0x002c, B:30:0x006a, B:17:0x0033, B:19:0x0040, B:21:0x0048, B:27:0x0056), top: B:49:0x000d }] */
        /* JADX WARN: Code duplicated, block: B:44:0x00b5 A[Catch: all -> 0x001f, TRY_LEAVE, TryCatch #0 {all -> 0x001f, blocks: (B:7:0x0015, B:34:0x007d, B:36:0x0088, B:37:0x009d, B:39:0x00a5, B:42:0x00aa, B:44:0x00b5, B:14:0x002c, B:30:0x006a, B:17:0x0033, B:19:0x0040, B:21:0x0048, B:27:0x0056), top: B:49:0x000d }] */
        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            int i10;
            Object objG;
            int i11;
            q5.d.a.AbstractC0467a abstractC0467a;
            q5.d.a.AbstractC0467a abstractC0467a2;
            Throwable thE;
            av.p0 p0Var = (av.p0) this.f26543v;
            Object objE = fu.c.e();
            int i12 = this.f26542u;
            try {
                if (i12 == 0) {
                    zt.o.b(obj);
                    k0.this.takingManualCapture = true;
                    i10 = (this.f26545x.getIsFlashEnabled() || (this.f26545x.getIsAutoFlashOnManualCaptureEnabled() && this.f26545x.getIsDimLightConditions())) ? 1 : 0;
                    if (i10 != 0) {
                        k0.this.G(true);
                        this.f26543v = p0Var;
                        this.f26541t = i10;
                        this.f26542u = 1;
                        if (av.z0.b(1000L, this) == objE) {
                        }
                    }
                    return objE;
                }
                if (i12 == 1) {
                    i10 = this.f26541t;
                    zt.o.b(obj);
                } else {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i11 = this.f26541t;
                    zt.o.b(obj);
                    objG = ((zt.n) obj).getValue();
                }
                av.q0.h(p0Var);
                abstractC0467a = this.f26547z;
                if (zt.n.h(objG)) {
                    Function1<String, Unit> function1D = ((q5.d.a.AbstractC0467a.e) abstractC0467a).d();
                    String absolutePath = ((File) objG).getAbsolutePath();
                    Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
                    function1D.invoke(absolutePath);
                }
                abstractC0467a2 = this.f26547z;
                thE = zt.n.e(objG);
                if (thE != null && !(thE instanceof un.o0)) {
                    ((q5.d.a.AbstractC0467a.e) abstractC0467a2).c().invoke(thE);
                }
                if (i11 != 0) {
                    k0.this.G(false);
                }
                k0.this.takingManualCapture = false;
                return Unit.f21506a;
                av.q0.h(p0Var);
                sn.i iVar = this.f26546y;
                this.f26543v = p0Var;
                this.f26541t = i10;
                this.f26542u = 2;
                objG = iVar.g(this);
                if (objG != objE) {
                    i11 = i10;
                    av.q0.h(p0Var);
                    abstractC0467a = this.f26547z;
                    if (zt.n.h(objG)) {
                        Function1<String, Unit> function1D2 = ((q5.d.a.AbstractC0467a.e) abstractC0467a).d();
                        String absolutePath2 = ((File) objG).getAbsolutePath();
                        Intrinsics.checkNotNullExpressionValue(absolutePath2, "getAbsolutePath(...)");
                        function1D2.invoke(absolutePath2);
                    }
                    abstractC0467a2 = this.f26547z;
                    thE = zt.n.e(objG);
                    if (thE != null) {
                        ((q5.d.a.AbstractC0467a.e) abstractC0467a2).c().invoke(thE);
                    }
                    if (i11 != 0) {
                        k0.this.G(false);
                    }
                    k0.this.takingManualCapture = false;
                    return Unit.f21506a;
                }
                return objE;
            } catch (Throwable th2) {
                k0.this.takingManualCapture = false;
                throw th2;
            }
        }
    }

    public k0(@NotNull Context context, @NotNull r0 viewController, @NotNull sn.t cameraPreview, @NotNull b1 selfieDirectionFeed, @NotNull TrackingEventsLogger trackingEventsLogger, boolean z10) throws CameraAccessException {
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
        this.lifecycleScope = androidx.p000lifecycle.t.a(xq.g.i(context));
        List<un.h0> listA = un.f0.a(context);
        ArrayList arrayList = new ArrayList(p001kotlin.collections.q.u(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(((un.h0) it.next()).getFacing());
        }
        this.cameraFacingDirections = CollectionsKt.X(arrayList);
        this.viewController.a();
    }

    public static final Unit J(k0 k0Var, q5.d.a aVar, int i10) {
        TrackingEventsLogger.logSelfieCaptureButtonClickedEvent$default(k0Var.trackingEventsLogger, new SelfieCaptureButtonEventData(SelfieCaptureButtonType.SWITCH_CAMERA, null, 2, null), false, 2, null);
        aVar.s().invoke(k0Var.cameraFacingDirections.get(i10));
        return Unit.f21506a;
    }

    public static final Unit K(q5.d.a aVar, k0 k0Var) {
        boolean z10 = !aVar.getIsFlashEnabled();
        TrackingEventsLogger.logSelfieCaptureButtonClickedEvent$default(k0Var.trackingEventsLogger, new SelfieCaptureButtonEventData(SelfieCaptureButtonType.FLASH, null, 2, null), false, 2, null);
        aVar.u().invoke(Boolean.valueOf(z10));
        return Unit.f21506a;
    }

    public static final Unit L(q5.d.a aVar) {
        aVar.q().invoke();
        return Unit.f21506a;
    }

    public static final Unit M(q5.d.a aVar) {
        aVar.t().invoke();
        return Unit.f21506a;
    }

    public static final Unit N(k0 k0Var, p001kotlin.jvm.internal.c0 c0Var) {
        TrackingEventsLogger.logSelfieCaptureButtonClickedEvent$default(k0Var.trackingEventsLogger, new SelfieCaptureButtonEventData(SelfieCaptureButtonType.SHUTTER, null, 2, null), false, 2, null);
        Function0 function0 = (Function0) c0Var.f21575a;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.f21506a;
    }

    public static final Unit O(k0 k0Var, sn.i iVar) {
        wn.b.a(k0Var.selfieDirectionFeed, iVar, k0Var.viewController.b());
        return Unit.f21506a;
    }

    public static final Unit P(q5.d.a.AbstractC0467a abstractC0467a) {
        ((q5.d.a.AbstractC0467a.g) abstractC0467a).b().invoke();
        return Unit.f21506a;
    }

    public static final Unit Q(q5.d.a.AbstractC0467a abstractC0467a) {
        ((q5.d.a.AbstractC0467a.g) abstractC0467a).b().invoke();
        return Unit.f21506a;
    }

    public static final Unit R(q5.d.a.AbstractC0467a abstractC0467a) {
        ((q5.d.a.AbstractC0467a.g) abstractC0467a).b().invoke();
        return Unit.f21506a;
    }

    public static final Unit S(q5.d.a.AbstractC0467a abstractC0467a) {
        ((q5.d.a.AbstractC0467a.g) abstractC0467a).b().invoke();
        return Unit.f21506a;
    }

    public static final Unit T(q5.d.a.AbstractC0467a abstractC0467a) {
        ((q5.d.a.AbstractC0467a.g) abstractC0467a).b().invoke();
        return Unit.f21506a;
    }

    public static final Unit U(q5.d.a.AbstractC0467a abstractC0467a) {
        ((q5.d.a.AbstractC0467a.i) abstractC0467a).c().invoke();
        return Unit.f21506a;
    }

    public static final Unit V(k0 k0Var, q5.d.a aVar, sn.i iVar, q5.d.a.AbstractC0467a abstractC0467a) {
        X(k0Var, aVar, iVar, abstractC0467a);
        return Unit.f21506a;
    }

    public static final Unit W(q5.d.a.AbstractC0467a abstractC0467a) {
        ((q5.d.a.AbstractC0467a.f) abstractC0467a).b().invoke();
        return Unit.f21506a;
    }

    public static final void X(k0 k0Var, q5.d.a aVar, sn.i iVar, q5.d.a.AbstractC0467a abstractC0467a) {
        if (k0Var.takingManualCapture) {
            return;
        }
        d2 d2Var = k0Var.manualCaptureJob;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        k0Var.manualCaptureJob = av.k.d(k0Var.lifecycleScope, g1.c(), null, k0Var.new h(aVar, iVar, abstractC0467a, null), 2, null);
    }

    public final sn.i C(q5.d.a rendering, Camera2PreviewView camera2Preview) throws CameraAccessException {
        Context applicationContext = this.context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        CameraChoices cameraChoicesB = un.f0.b(applicationContext, Y(rendering.getFacingMode()));
        if (cameraChoicesB != null) {
            return rendering.getCamera2ControllerFactory().a(cameraChoicesB, camera2Preview, this.selfieDirectionFeed, zn.a.valueOf(rendering.getVideoCaptureMethod().toString()), rendering.getWebRtcManager(), rendering.getIsAudioRequired());
        }
        rendering.r().invoke(new v0());
        return new u0(camera2Preview);
    }

    public final sn.i D(q5.d.a rendering, boolean recordVideo) {
        return rendering.getCameraXControllerFactory().a(this.cameraPreview, this.viewController.k(), new b(rendering, recordVideo), rendering.getIsAudioRequired());
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    public final sn.i E(q5.d.a rendering) throws CameraAccessException {
        sn.i iVarC;
        sn.i iVar = this.cameraController;
        if (iVar != null) {
            if (this.currentFacingMode == rendering.getFacingMode()) {
                iVar.j();
                return iVar;
            }
            iVar.destroy();
        }
        Camera2PreviewView camera2PreviewViewJ = this.viewController.j();
        int i10 = a.f26507d[rendering.getVideoCaptureMethod().ordinal()];
        if (i10 == 1) {
            iVarC = C(rendering, camera2PreviewViewJ);
        } else {
            if (i10 != 2) {
                if (i10 != 3) {
                    throw new zt.l();
                }
            } else if (!this.useCameraXForVideo) {
                iVarC = C(rendering, camera2PreviewViewJ);
            }
            iVarC = D(rendering, rendering.getVideoCaptureMethod() == zn.a.Upload);
        }
        xq.g.i(this.context).a().a(new c(iVarC));
        F(iVarC);
        iVarC.j();
        this.cameraController = iVarC;
        this.currentFacingMode = rendering.getFacingMode();
        return iVarC;
    }

    public final void F(sn.i cameraController) {
        d2 d2Var = this.cameraStateListenerJob;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        this.cameraStateListenerJob = av.k.d(androidx.p000lifecycle.t.a(xq.g.i(this.context)), null, null, new d(cameraController, this, null), 3, null);
    }

    public final void G(boolean on2) {
        Window window;
        Window window2;
        sn.i iVar = this.cameraController;
        if (iVar == null) {
            return;
        }
        sn.v.b facingMode = iVar.f().getFacingMode();
        if (on2) {
            if (facingMode != sn.v.b.User) {
                iVar.a(true);
                return;
            }
            this.viewController.c();
            j.b bVarA = xq.g.a(this.context);
            if (bVarA == null || (window2 = bVarA.getWindow()) == null) {
                return;
            }
            WindowManager.LayoutParams attributes = window2.getAttributes();
            attributes.screenBrightness = 1.0f;
            window2.setAttributes(attributes);
            return;
        }
        if (facingMode != sn.v.b.User) {
            iVar.a(false);
            return;
        }
        this.viewController.m();
        j.b bVarA2 = xq.g.a(this.context);
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
    /* JADX WARN: Type inference failed for: r0v32, types: [T, nq.y] */
    /* JADX WARN: Type inference failed for: r0v34, types: [T, nq.x] */
    public final void H(@NotNull q5.d.a rendering, @Nullable jr.a systemUiController) throws CameraAccessException {
        f1.c cVar;
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
        final q5.d.a rendering2 = rendering;
        Intrinsics.checkNotNullParameter(rendering2, "rendering");
        k0Var.currentErrorHandler = rendering2.r();
        k0Var.permissionChangedHandler = rendering2.v();
        StepStyles.SelfieStepStyle styles2 = rendering2.getStyles();
        if (styles2 != null) {
            k0Var.viewController.i(styles2, systemUiController);
        }
        if (rendering2.getRequestingPermissions()) {
            return;
        }
        final sn.i iVarE = E(rendering);
        if (rendering2.getRecordingLocallyRequired() && !iVarE.getRecordingStarted() && (function1 = k0Var.currentErrorHandler) != null) {
            function1.invoke(new z0(false));
        }
        iVarE.getPreviewView().setVisibility(0);
        s0 s0VarO = k0Var.viewController.o(rendering2.getRequireStrictSelfieCapture());
        k0Var.selfieDirectionFeed.m(s0VarO.getMinFaceRatio(), s0VarO.getMaxFaceRatio(), rendering2.getIsAutoFlashOnManualCaptureEnabled());
        b1 b1Var = k0Var.selfieDirectionFeed;
        xn.a pose = rendering2.getPose();
        int i11 = pose == null ? -1 : a.f26505a[pose.ordinal()];
        if (i11 == -1) {
            cVar = f1.c.None;
        } else if (i11 == 1) {
            cVar = f1.c.Center;
        } else if (i11 == 2) {
            cVar = f1.c.Left;
        } else if (i11 == 3) {
            cVar = f1.c.Right;
        } else if (i11 == 4) {
            cVar = f1.c.Up;
        } else {
            if (i11 != 5) {
                throw new zt.l();
            }
            cVar = f1.c.Down;
        }
        b1Var.n(cVar);
        if (!k0Var.takingManualCapture) {
            k0Var.G(rendering2.getIsFlashOn());
        }
        final p001kotlin.jvm.internal.c0 c0Var = new p001kotlin.jvm.internal.c0();
        final q5.d.a.AbstractC0467a mode = rendering2.getMode();
        if (!(mode instanceof q5.d.a.AbstractC0467a.h)) {
            if (mode instanceof q5.d.a.AbstractC0467a.j) {
                d2 d2Var = k0Var.maxRecordingLimitJob;
                if (d2Var != null) {
                    d2.a.a(d2Var, null, 1, null);
                }
                k0Var.maxRecordingLimitJob = av.k.d(k0Var.lifecycleScope, g1.b(), null, new g(mode, iVarE, k0Var, null), 2, null);
            } else {
                if (mode instanceof q5.d.a.AbstractC0467a.g) {
                    q5.d.a.AbstractC0467a.g gVar = (q5.d.a.AbstractC0467a.g) mode;
                    switch (a.b[gVar.getOverlay().ordinal()]) {
                        case 1:
                        case 2:
                            gVar.b().invoke();
                            break;
                        case 3:
                            k0Var.viewController.l(new Function0() { // from class: nq.w
                                @Override // p001kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return k0.P(mode);
                                }
                            });
                            break;
                        case 4:
                            k0Var.viewController.g(new Function0() { // from class: nq.f0
                                @Override // p001kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return k0.Q(mode);
                                }
                            });
                            break;
                        case 5:
                            k0Var.viewController.p(new Function0() { // from class: nq.g0
                                @Override // p001kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return k0.R(mode);
                                }
                            });
                            break;
                        case 6:
                            k0Var.viewController.n(new Function0() { // from class: nq.h0
                                @Override // p001kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return k0.S(mode);
                                }
                            });
                            break;
                        case 7:
                            k0Var.viewController.h(new Function0() { // from class: nq.i0
                                @Override // p001kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return k0.T(mode);
                                }
                            });
                            break;
                        default:
                            throw new zt.l();
                    }
                } else {
                    if (mode instanceof q5.d.a.AbstractC0467a.c) {
                        k0Var.viewController.f(((q5.d.a.AbstractC0467a.c) mode).getCountDown());
                        z11 = false;
                        z12 = false;
                        isCapturing = false;
                        z13 = true;
                    } else if (mode instanceof q5.d.a.AbstractC0467a.i) {
                        q5.d.a.AbstractC0467a.i iVar = (q5.d.a.AbstractC0467a.i) mode;
                        if (iVar.getImageCaptured()) {
                            k0Var.viewController.d(rendering2.getMessage(), rendering2.getDescription(), new Function0() { // from class: nq.j0
                                @Override // p001kotlin.jvm.functions.Function0
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
                    } else if (mode instanceof q5.d.a.AbstractC0467a.C0468a) {
                        k0Var = k0Var;
                        z12 = false;
                        z13 = false;
                        isCapturing = false;
                        z11 = true;
                        iVarE = iVarE;
                        rendering2 = rendering2;
                        z10 = true;
                    } else {
                        if (mode instanceof q5.d.a.AbstractC0467a.e) {
                            c0Var.f21575a = new Function0() { // from class: nq.x
                                @Override // p001kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return k0.V(this.f26588a, rendering2, iVarE, mode);
                                }
                            };
                            q5.d.a.AbstractC0467a.e eVar = (q5.d.a.AbstractC0467a.e) mode;
                            if (eVar.getForceCapture()) {
                                X(k0Var, rendering2, iVarE, mode);
                                z11 = false;
                            } else {
                                z11 = true;
                            }
                            if (eVar.getIsCapturing() || k0Var.takingManualCapture) {
                                z11 = false;
                            }
                            isCapturing = eVar.getIsCapturing();
                            z12 = false;
                        } else if (mode instanceof q5.d.a.AbstractC0467a.f) {
                            c0Var.f21575a = new Function0() { // from class: nq.y
                                @Override // p001kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return k0.W(mode);
                                }
                            };
                        } else if (mode instanceof q5.d.a.AbstractC0467a.b) {
                            isCapturing = ((q5.d.a.AbstractC0467a.b) mode).getIsCapturing();
                            z11 = false;
                            z12 = false;
                        } else {
                            if (!(mode instanceof q5.d.a.AbstractC0467a.C0469d)) {
                                throw new zt.l();
                            }
                            d2 d2Var2 = k0Var.maxRecordingLimitJob;
                            if (d2Var2 != null) {
                                d2.a.a(d2Var2, null, 1, null);
                            }
                            if (((q5.d.a.AbstractC0467a.C0469d) mode).getStartFinalize()) {
                                av.k.d(k0Var.lifecycleScope, g1.c(), null, new e(iVarE, k0Var, rendering2, mode, null), 2, null);
                            }
                            isCapturing = false;
                            z10 = true;
                            z11 = true;
                            z12 = true;
                            z13 = true;
                        }
                        z13 = true;
                        iVarE = iVarE;
                        rendering2 = rendering2;
                        z10 = z12;
                    }
                    iVarE = iVarE;
                    rendering2 = rendering2;
                    z10 = isCapturing;
                }
                z12 = false;
                isCapturing = false;
                z11 = true;
                z13 = true;
                iVarE = iVarE;
                rendering2 = rendering2;
                z10 = isCapturing;
            }
            if (rendering2.getFacingMode() == sn.v.b.User) {
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
                i10 = a.f26506c[k0Var.cameraFacingDirections.get(iIndexOf).ordinal()];
                if (i10 != 1) {
                    Context context = k0Var.context;
                    string = context.getString(jq.g.Z, context.getString(jq.g.f20874d));
                } else if (i10 != 2) {
                    Context context2 = k0Var.context;
                    string = context2.getString(jq.g.Z, context2.getString(jq.g.f20872c));
                } else {
                    if (i10 == 3) {
                        throw new zt.l();
                    }
                    string = k0Var.context.getString(jq.g.f20870a0);
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
            final sn.i iVar2 = iVarE;
            String description = rendering2.getDescription();
            String captureSuccessText = rendering2.getCaptureSuccessText();
            String disclaimerText = rendering2.getDisclaimerText();
            boolean isAutoCaptureOn = rendering2.getIsAutoCaptureOn();
            boolean isFlashEnabled = rendering2.getIsFlashEnabled();
            navBarTitleStyleValue = null;
            String hintVerifyingText = rendering2.getHintVerifyingText();
            String hintAutoCaptureTimeoutText = rendering2.getHintAutoCaptureTimeoutText();
            boolean z20 = rendering2.getMode() instanceof q5.d.a.AbstractC0467a.j;
            if ((rendering2.getMode() instanceof q5.d.a.AbstractC0467a.j) && !(rendering2.getMode() instanceof q5.d.a.AbstractC0467a.h)) {
                sn.y value = iVar2.b().getValue();
                z16 = z10;
                sn.y.Ready ready = value instanceof sn.y.Ready ? (sn.y.Ready) value : null;
                if (ready == null || ready.getFirstFrameReceived()) {
                    z17 = false;
                }
                z18 = true;
                boolean z21 = !z16;
                boolean z22 = !z16;
                if (z13 || !z19 || c0Var.f21575a == 0) {
                    z18 = false;
                }
                boolean z23 = rendering2.getMode() instanceof q5.d.a.AbstractC0467a.c;
                ir.a navigationState = rendering2.getNavigationState();
                String navBarTitle = rendering2.getNavBarTitle();
                styles = rendering2.getStyles();
                if (styles != null) {
                    navBarTitleStyleValue = styles.getNavBarTitleStyleValue();
                }
                r0Var.e(systemUiController, title, autoCaptureText, realTimeHint, message, description, captureSuccessText, disclaimerText, hintAutoCaptureTimeoutText, hintVerifyingText, isAutoCaptureOn, isFlashEnabled, z14, z20, z17, z12, str, z15, z13, z21, z13, z22, z18, z23, isCapturing, navigationState, navBarTitle, navBarTitleStyleValue, k0Var.a0(rendering2.getMode().getOverlay(), z14), rendering2.getPoseScore(), rendering2.getBrightnessInfo(), rendering2.getWatermarkText(), rendering2.getStyles(), new Function0() { // from class: nq.z
                    @Override // p001kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return k0.J(this.f26592a, rendering2, iIndexOf);
                    }
                }, new Function0() { // from class: nq.a0
                    @Override // p001kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return k0.K(rendering2, k0Var);
                    }
                }, new Function0() { // from class: nq.b0
                    @Override // p001kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return k0.L(rendering2);
                    }
                }, new Function0() { // from class: nq.c0
                    @Override // p001kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return k0.M(rendering2);
                    }
                }, new Function0() { // from class: nq.d0
                    @Override // p001kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return k0.N(this.f26475a, c0Var);
                    }
                });
                kr.a0.b(iVar2.getPreviewView(), new Function0() { // from class: nq.e0
                    @Override // p001kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return k0.O(this.f26477a, iVar2);
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
            boolean z26 = rendering2.getMode() instanceof q5.d.a.AbstractC0467a.c;
            ir.a navigationState2 = rendering2.getNavigationState();
            String navBarTitle2 = rendering2.getNavBarTitle();
            styles = rendering2.getStyles();
            if (styles != null) {
                navBarTitleStyleValue = styles.getNavBarTitleStyleValue();
            }
            r0Var.e(systemUiController, title, autoCaptureText, realTimeHint, message, description, captureSuccessText, disclaimerText, hintAutoCaptureTimeoutText, hintVerifyingText, isAutoCaptureOn, isFlashEnabled, z14, z20, z17, z12, str, z15, z13, z24, z13, z25, z18, z26, isCapturing, navigationState2, navBarTitle2, navBarTitleStyleValue, k0Var.a0(rendering2.getMode().getOverlay(), z14), rendering2.getPoseScore(), rendering2.getBrightnessInfo(), rendering2.getWatermarkText(), rendering2.getStyles(), new Function0() { // from class: nq.z
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return k0.J(this.f26592a, rendering2, iIndexOf);
                }
            }, new Function0() { // from class: nq.a0
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return k0.K(rendering2, k0Var);
                }
            }, new Function0() { // from class: nq.b0
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return k0.L(rendering2);
                }
            }, new Function0() { // from class: nq.c0
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return k0.M(rendering2);
                }
            }, new Function0() { // from class: nq.d0
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return k0.N(this.f26475a, c0Var);
                }
            });
            kr.a0.b(iVar2.getPreviewView(), new Function0() { // from class: nq.e0
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return k0.O(this.f26477a, iVar2);
                }
            });
            k0Var.lastRendering = rendering2;
        }
        androidx.p000lifecycle.m mVar = k0Var.lifecycleScope;
        av.l0 l0VarA = g1.a();
        f fVar = new f(iVarE, k0Var, mode, rendering2, null);
        rendering2 = rendering2;
        av.k.d(mVar, l0VarA, null, fVar, 2, null);
        k0Var = k0Var;
        z12 = false;
        isCapturing = false;
        z11 = true;
        z13 = true;
        iVarE = iVarE;
        rendering2 = rendering2;
        z10 = true;
        if (rendering2.getFacingMode() == sn.v.b.User) {
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
            i10 = a.f26506c[k0Var.cameraFacingDirections.get(iIndexOf).ordinal()];
            if (i10 != 1) {
                Context context3 = k0Var.context;
                string = context3.getString(jq.g.Z, context3.getString(jq.g.f20874d));
            } else if (i10 != 2) {
                Context context4 = k0Var.context;
                string = context4.getString(jq.g.Z, context4.getString(jq.g.f20872c));
            } else {
                if (i10 == 3) {
                    throw new zt.l();
                }
                string = k0Var.context.getString(jq.g.f20870a0);
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
        final sn.i iVar3 = iVarE;
        String description2 = rendering2.getDescription();
        String captureSuccessText2 = rendering2.getCaptureSuccessText();
        String disclaimerText2 = rendering2.getDisclaimerText();
        boolean isAutoCaptureOn2 = rendering2.getIsAutoCaptureOn();
        boolean isFlashEnabled2 = rendering2.getIsFlashEnabled();
        navBarTitleStyleValue = null;
        String hintVerifyingText2 = rendering2.getHintVerifyingText();
        String hintAutoCaptureTimeoutText2 = rendering2.getHintAutoCaptureTimeoutText();
        boolean z27 = rendering2.getMode() instanceof q5.d.a.AbstractC0467a.j;
        if (rendering2.getMode() instanceof q5.d.a.AbstractC0467a.j) {
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
        boolean z210 = rendering2.getMode() instanceof q5.d.a.AbstractC0467a.c;
        ir.a navigationState3 = rendering2.getNavigationState();
        String navBarTitle3 = rendering2.getNavBarTitle();
        styles = rendering2.getStyles();
        if (styles != null) {
            navBarTitleStyleValue = styles.getNavBarTitleStyleValue();
        }
        r0Var2.e(systemUiController, title2, autoCaptureText2, realTimeHint2, message2, description2, captureSuccessText2, disclaimerText2, hintAutoCaptureTimeoutText2, hintVerifyingText2, isAutoCaptureOn2, isFlashEnabled2, z14, z27, z17, z12, str, z15, z13, z28, z13, z29, z18, z210, isCapturing, navigationState3, navBarTitle3, navBarTitleStyleValue, k0Var.a0(rendering2.getMode().getOverlay(), z14), rendering2.getPoseScore(), rendering2.getBrightnessInfo(), rendering2.getWatermarkText(), rendering2.getStyles(), new Function0() { // from class: nq.z
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k0.J(this.f26592a, rendering2, iIndexOf);
            }
        }, new Function0() { // from class: nq.a0
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k0.K(rendering2, k0Var);
            }
        }, new Function0() { // from class: nq.b0
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k0.L(rendering2);
            }
        }, new Function0() { // from class: nq.c0
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k0.M(rendering2);
            }
        }, new Function0() { // from class: nq.d0
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k0.N(this.f26475a, c0Var);
            }
        });
        kr.a0.b(iVar3.getPreviewView(), new Function0() { // from class: nq.e0
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k0.O(this.f26477a, iVar3);
            }
        });
        k0Var.lastRendering = rendering2;
    }

    @Override // nn.k
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void a(@NotNull q5.d.a rendering, @NotNull ViewEnvironment viewEnvironment) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        H(rendering, jr.c.a(viewEnvironment));
    }

    public final un.m0 Y(sn.v.b bVar) {
        int i10 = a.f26506c[bVar.ordinal()];
        if (i10 == 1) {
            return un.m0.FRONT;
        }
        if (i10 == 2) {
            return un.m0.BACK;
        }
        if (i10 == 3) {
            return un.m0.EXTERNAL;
        }
        throw new zt.l();
    }

    public final sn.t.a Z(sn.v.b bVar) {
        int i10 = a.f26506c[bVar.ordinal()];
        if (i10 == 1) {
            return sn.t.a.FRONT;
        }
        if (i10 == 2) {
            return sn.t.a.BACK;
        }
        if (i10 == 3) {
            return sn.t.a.EXTERNAL;
        }
        throw new zt.l();
    }

    public final SelfieOverlayView.e a0(q5.d.a.b bVar, boolean z10) {
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
                throw new zt.l();
        }
    }
}
