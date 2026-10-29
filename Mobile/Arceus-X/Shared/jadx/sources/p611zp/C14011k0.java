package p611zp;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.camera.view.PreviewView;
import androidx.p616lifecycle.AbstractC0968m;
import androidx.p616lifecycle.C0982t;
import androidx.p616lifecycle.InterfaceC0954f;
import androidx.p616lifecycle.InterfaceC0980s;
import com.appsflyer.C1759R;
import com.withpersona.sdk2.camera.C3401a;
import com.withpersona.sdk2.camera.C3402b;
import com.withpersona.sdk2.camera.C3403c;
import com.withpersona.sdk2.camera.C3407g;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.camera.InterfaceC3404d;
import com.withpersona.sdk2.camera.camera2.Camera2PreviewView;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.selfie.view.SelfieOverlayView;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.SelfieCaptureButtonEventData;
import com.withpersona.sdk2.inquiry.tracking.model.SelfieCaptureButtonType;
import com.withpersona.sdk2.inquiry.tracking.model.SelfieCaptureState;
import com.withpersona.sdk2.inquiry.tracking.model.SelfieCaptureStateEventData;
import hn.C6441f0;
import hn.C6445h0;
import hn.C6459o0;
import hn.CameraChoices;
import hn.EnumC6455m0;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kn.EnumC7638a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7701q;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7729c0;
import kotlin.jvm.internal.Intrinsics;
import mn.EnumC8598a;
import nu.C9579j;
import nu.InterfaceC9575h;
import nu.InterfaceC9577i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p016an.InterfaceC0382k;
import p016an.ViewEnvironment;
import p132fn.AbstractC5685h;
import p132fn.C5686h0;
import p132fn.C5688i0;
import p132fn.C5694l0;
import p132fn.C5696m0;
import p132fn.C5698n0;
import p132fn.C5706r0;
import p132fn.C5714v0;
import p132fn.InterfaceC5683g;
import p132fn.InterfaceC5707s;
import p203j.ActivityC6992b;
import p225jn.C7211b;
import p226jq.C7259g;
import p229jt.C7328a;
import p229jt.C7345l;
import p229jt.C7347n;
import p229jt.C7348o;
import p256ku.AbstractC7888l0;
import p256ku.AbstractC7900n2;
import p256ku.C7864g1;
import p256ku.C7882k;
import p256ku.C7910q0;
import p256ku.C7946z0;
import p256ku.InterfaceC7850d2;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p497vp.C12244g;
import p498vq.C12247a;
import p498vq.C12249c;
import p526wq.C12543z;
import pt.AbstractC10351m;
import pt.C10340b;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: zp.k0 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001e\u001a\u00020\u001d*\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010!\u001a\u00020 *\u00020\u001cH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\u0012H\u0002¢\u0006\u0004\b%\u0010&J\u001b\u0010*\u001a\u00020)*\u00020'2\u0006\u0010(\u001a\u00020\rH\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020$2\u0006\u0010,\u001a\u00020\rH\u0002¢\u0006\u0004\b-\u0010.J\u001f\u00101\u001a\u00020$2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J\u001f\u00105\u001a\u00020$2\u0006\u0010\u0011\u001a\u00020\u00022\b\u00104\u001a\u0004\u0018\u000103¢\u0006\u0004\b5\u00106R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010!R\u0014\u0010E\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010#\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010J\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010M\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u001c\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u001c0N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0018\u0010U\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0018\u0010W\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010TR\u0018\u0010Y\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010TR*\u0010_\u001a\u0016\u0012\u0004\u0012\u00020[\u0012\u0004\u0012\u00020$\u0018\u00010Zj\u0004\u0018\u0001`\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u001e\u0010c\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010`8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u0016\u0010e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010!¨\u0006f"}, m31665d2 = {"Lzp/k0;", "Lan/k;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;", "Landroid/content/Context;", "context", "Lzp/r0;", "viewController", "Lcom/withpersona/sdk2/camera/b;", "cameraPreview", "Lfn/n0;", "selfieDirectionFeed", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "", "useCameraXForVideo", "<init>", "(Landroid/content/Context;Lzp/r0;Lcom/withpersona/sdk2/camera/b;Lfn/n0;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Z)V", "rendering", "Lfn/g;", "E", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;)Lfn/g;", "Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;", "camera2Preview", "C", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;)Lfn/g;", "recordVideo", "D", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;Z)Lfn/g;", "Lcom/withpersona/sdk2/camera/CameraProperties$b;", "Lhn/m0;", "Y", "(Lcom/withpersona/sdk2/camera/CameraProperties$b;)Lhn/m0;", "Lcom/withpersona/sdk2/camera/b$a;", "Z", "(Lcom/withpersona/sdk2/camera/CameraProperties$b;)Lcom/withpersona/sdk2/camera/b$a;", "cameraController", "", "F", "(Lfn/g;)V", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "isPreviewMirrored", "Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;", "a0", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;Z)Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;", "on", "G", "(Z)V", "Lan/y;", "viewEnvironment", "H", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;Lan/y;)V", "Lvq/a;", "systemUiController", "I", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;Lvq/a;)V", "b", "Landroid/content/Context;", "c", "Lzp/r0;", "d", "Lcom/withpersona/sdk2/camera/b;", "e", "Lfn/n0;", "f", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "g", "Landroidx/lifecycle/m;", "h", "Landroidx/lifecycle/m;", "lifecycleScope", "i", "Lfn/g;", "j", "Lcom/withpersona/sdk2/camera/CameraProperties$b;", "currentFacingMode", "k", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;", "lastRendering", "", "l", "Ljava/util/List;", "cameraFacingDirections", "Lku/d2;", "m", "Lku/d2;", "cameraStateListenerJob", "n", "maxRecordingLimitJob", "o", "manualCaptureJob", "Lkotlin/Function1;", "", "Lcom/withpersona/sdk2/inquiry/selfie/CameraErrorHandler;", "p", "Lkotlin/jvm/functions/Function1;", "currentErrorHandler", "Lkotlin/Function0;", "q", "Lkotlin/jvm/functions/Function0;", "permissionChangedHandler", "r", "takingManualCapture", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C14011k0 implements InterfaceC0382k<SelfieWorkflow.AbstractC3928c.a> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC14025r0 viewController;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final C3402b cameraPreview;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final C5698n0 selfieDirectionFeed;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final boolean useCameraXForVideo;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final AbstractC0968m lifecycleScope;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public InterfaceC5683g cameraController;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public CameraProperties.EnumC3397b currentFacingMode;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public SelfieWorkflow.AbstractC3928c.a lastRendering;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public List<? extends CameraProperties.EnumC3397b> cameraFacingDirections;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public InterfaceC7850d2 cameraStateListenerJob;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    public InterfaceC7850d2 maxRecordingLimitJob;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    public InterfaceC7850d2 manualCaptureJob;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @Nullable
    public Function1<? super Throwable, Unit> currentErrorHandler;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @Nullable
    public Function0<Unit> permissionChangedHandler;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public boolean takingManualCapture;

    /* JADX INFO: renamed from: zp.k0$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f48946a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f48947b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f48948c;

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ int[] f48949d;

        static {
            int[] iArr = new int[EnumC7638a.values().length];
            try {
                iArr[EnumC7638a.Center.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC7638a.Left.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC7638a.Right.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC7638a.Up.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC7638a.Down.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f48946a = iArr;
            int[] iArr2 = new int[SelfieWorkflow.AbstractC3928c.a.b.values().length];
            try {
                iArr2[SelfieWorkflow.AbstractC3928c.a.b.CLEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[SelfieWorkflow.AbstractC3928c.a.b.FINALIZING.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[SelfieWorkflow.AbstractC3928c.a.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[SelfieWorkflow.AbstractC3928c.a.b.LOOK_LEFT.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[SelfieWorkflow.AbstractC3928c.a.b.LOOK_RIGHT.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[SelfieWorkflow.AbstractC3928c.a.b.LOOK_UP.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[SelfieWorkflow.AbstractC3928c.a.b.LOOK_DOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused12) {
            }
            f48947b = iArr2;
            int[] iArr3 = new int[CameraProperties.EnumC3397b.values().length];
            try {
                iArr3[CameraProperties.EnumC3397b.User.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[CameraProperties.EnumC3397b.Environment.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[CameraProperties.EnumC3397b.Unknown.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            f48948c = iArr3;
            int[] iArr4 = new int[EnumC8598a.values().length];
            try {
                iArr4[EnumC8598a.Stream.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[EnumC8598a.Upload.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[EnumC8598a.None.ordinal()] = 3;
            } catch (NoSuchFieldError unused18) {
            }
            f48949d = iArr4;
        }
    }

    /* JADX INFO: renamed from: zp.k0$b */
    @Metadata(m31664d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31665d2 = {"zp/k0$b", "Lfn/s;", "", "a", "()V", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class b implements InterfaceC5707s {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ SelfieWorkflow.AbstractC3928c.a f48951b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f48952c;

        public b(SelfieWorkflow.AbstractC3928c.a aVar, boolean z10) {
            this.f48951b = aVar;
            this.f48952c = z10;
        }

        /* JADX INFO: renamed from: c */
        public static final Unit m50625c(SelfieWorkflow.AbstractC3928c.a aVar, AbstractC5685h it) {
            Intrinsics.checkNotNullParameter(it, "it");
            aVar.m19793r().invoke(it);
            return Unit.f29331a;
        }

        @Override // p132fn.InterfaceC5707s
        /* JADX INFO: renamed from: a */
        public void mo17506a() {
            C3402b c3402b = C14011k0.this.cameraPreview;
            PreviewView previewViewMo50686j = C14011k0.this.viewController.mo50686j();
            C3402b.a aVarM50622Z = C14011k0.this.m50622Z(this.f48951b.getFacingMode());
            C5698n0 c5698n0 = C14011k0.this.selfieDirectionFeed;
            boolean z10 = this.f48952c;
            final SelfieWorkflow.AbstractC3928c.a aVar = this.f48951b;
            c3402b.m16201f(previewViewMo50686j, aVarM50622Z, c5698n0, true, z10, new Function1() { // from class: zp.l0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C14011k0.b.m50625c(aVar, (AbstractC5685h) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: zp.k0$c */
    @Metadata(m31664d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m31665d2 = {"zp/k0$c", "Landroidx/lifecycle/f;", "Landroidx/lifecycle/s;", "owner", "", "onResume", "(Landroidx/lifecycle/s;)V", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class c implements InterfaceC0954f {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC5683g f48954b;

        public c(InterfaceC5683g interfaceC5683g) {
            this.f48954b = interfaceC5683g;
        }

        /* JADX INFO: renamed from: b */
        public static final void m50627b(C14011k0 c14011k0, InterfaceC5683g interfaceC5683g) {
            Function0 function0 = c14011k0.permissionChangedHandler;
            if (function0 != null) {
                function0.invoke();
            }
            c14011k0.m50617F(interfaceC5683g);
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
            View root = C14011k0.this.viewController.getRoot();
            final C14011k0 c14011k0 = C14011k0.this;
            final InterfaceC5683g interfaceC5683g = this.f48954b;
            root.post(new Runnable() { // from class: zp.m0
                @Override // java.lang.Runnable
                public final void run() {
                    C14011k0.c.m50627b(c14011k0, interfaceC5683g);
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

    /* JADX INFO: renamed from: zp.k0$d */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.selfie.cameraScreen.CameraScreenRunner$registerCameraStateListener$1", m39664f = "CameraScreenRunner.kt", m39665l = {652}, m39666m = "invokeSuspend")
    public static final class d extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f48955t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ InterfaceC5683g f48956u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ C14011k0 f48957v;

        /* JADX INFO: renamed from: zp.k0$d$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class a<T> implements InterfaceC9577i {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C14011k0 f48958a;

            public a(C14011k0 c14011k0) {
                this.f48958a = c14011k0;
            }

            /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object; */
            @Override // nu.InterfaceC9577i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(InterfaceC3404d interfaceC3404d, InterfaceC9557b<? super Unit> interfaceC9557b) {
                Function1 function1;
                if (Intrinsics.m31980c(interfaceC3404d, InterfaceC3404d.b.f12930a)) {
                    Function1 function2 = this.f48958a.currentErrorHandler;
                    if (function2 != null) {
                        function2.invoke(new C5714v0());
                    }
                } else if (interfaceC3404d instanceof InterfaceC3404d.Closed) {
                    InterfaceC3404d.Closed closed = (InterfaceC3404d.Closed) interfaceC3404d;
                    if (closed.getWasRecordingInterrupted() && (function1 = this.f48958a.currentErrorHandler) != null) {
                        function1.invoke(new C5694l0(closed.getIsClosedDueToBadCameraConfiguration()));
                    }
                }
                return Unit.f29331a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC5683g interfaceC5683g, C14011k0 c14011k0, InterfaceC9557b<? super d> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f48956u = interfaceC5683g;
            this.f48957v = c14011k0;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new d(this.f48956u, this.f48957v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f48955t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                InterfaceC9575h<InterfaceC3404d> interfaceC9575hM16191a = C3401a.m16191a(this.f48956u.mo16218b());
                a aVar = new a(this.f48957v);
                this.f48955t = 1;
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
            return ((d) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: zp.k0$e */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.selfie.cameraScreen.CameraScreenRunner$showRendering$12", m39664f = "CameraScreenRunner.kt", m39665l = {403}, m39666m = "invokeSuspend")
    public static final class e extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f48959t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ InterfaceC5683g f48960u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ C14011k0 f48961v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ SelfieWorkflow.AbstractC3928c.a f48962w;

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ SelfieWorkflow.AbstractC3928c.a.AbstractC14138a f48963x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC5683g interfaceC5683g, C14011k0 c14011k0, SelfieWorkflow.AbstractC3928c.a aVar, SelfieWorkflow.AbstractC3928c.a.AbstractC14138a abstractC14138a, InterfaceC9557b<? super e> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f48960u = interfaceC5683g;
            this.f48961v = c14011k0;
            this.f48962w = aVar;
            this.f48963x = abstractC14138a;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new e(this.f48960u, this.f48961v, this.f48962w, this.f48963x, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objMo16225i;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f48959t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                InterfaceC5683g interfaceC5683g = this.f48960u;
                this.f48959t = 1;
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
            C14011k0 c14011k0 = this.f48961v;
            SelfieWorkflow.AbstractC3928c.a aVar = this.f48962w;
            SelfieWorkflow.AbstractC3928c.a.AbstractC14138a abstractC14138a = this.f48963x;
            if (C7347n.m30466h(objMo16225i)) {
                TrackingEventsLogger.logVideoStopEvent$default(c14011k0.trackingEventsLogger, "selfie", aVar.getVideoCaptureMethod().name(), null, null, null, null, false, C1759R.styleable.AppCompatTheme_windowMinWidthMajor, null);
                SelfieWorkflow.AbstractC3928c.a.AbstractC14138a.d dVar = (SelfieWorkflow.AbstractC3928c.a.AbstractC14138a.d) abstractC14138a;
                dVar.m19805b().invoke((File) objMo16225i);
                dVar.m19806c().invoke();
            }
            C14011k0 c14011k1 = this.f48961v;
            SelfieWorkflow.AbstractC3928c.a aVar2 = this.f48962w;
            SelfieWorkflow.AbstractC3928c.a.AbstractC14138a abstractC14138a2 = this.f48963x;
            Throwable thM30463e = C7347n.m30463e(objMo16225i);
            if (thM30463e != null) {
                TrackingEventsLogger.logVideoErrorEvent$default(c14011k1.trackingEventsLogger, "selfie", aVar2.getVideoCaptureMethod().name(), null, C7328a.m30430b(thM30463e), false, 20, null);
                if (!(thM30463e instanceof C5686h0)) {
                    aVar2.m19793r().invoke(thM30463e);
                    ((SelfieWorkflow.AbstractC3928c.a.AbstractC14138a.d) abstractC14138a2).m19806c().invoke();
                }
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

    /* JADX INFO: renamed from: zp.k0$f */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.selfie.cameraScreen.CameraScreenRunner$showRendering$2", m39664f = "CameraScreenRunner.kt", m39665l = {192, 194}, m39666m = "invokeSuspend")
    public static final class f extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f48964t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ InterfaceC5683g f48965u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ C14011k0 f48966v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ SelfieWorkflow.AbstractC3928c.a.AbstractC14138a f48967w;

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ SelfieWorkflow.AbstractC3928c.a f48968x;

        /* JADX INFO: renamed from: zp.k0$f$a */
        @Metadata(m31664d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lcom/withpersona/sdk2/camera/d;", "it", "", "<anonymous>", "(Lcom/withpersona/sdk2/camera/d;)Z"}, m31666k = 3, m31667mv = {2, 2, 0})
        @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.selfie.cameraScreen.CameraScreenRunner$showRendering$2$1", m39664f = "CameraScreenRunner.kt", m39665l = {}, m39666m = "invokeSuspend")
        public static final class a extends AbstractC10351m implements Function2<InterfaceC3404d, InterfaceC9557b<? super Boolean>, Object> {

            /* JADX INFO: renamed from: t */
            public int f48969t;

            /* JADX INFO: renamed from: u */
            public /* synthetic */ Object f48970u;

            public a(InterfaceC9557b<? super a> interfaceC9557b) {
                super(2, interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                a aVar = new a(interfaceC9557b);
                aVar.f48970u = obj;
                return aVar;
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                InterfaceC3404d interfaceC3404d = (InterfaceC3404d) this.f48970u;
                C10047c.m38805e();
                if (this.f48969t != 0) {
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

        /* JADX INFO: renamed from: zp.k0$f$b */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
        @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.selfie.cameraScreen.CameraScreenRunner$showRendering$2$2", m39664f = "CameraScreenRunner.kt", m39665l = {195, 216}, m39666m = "invokeSuspend")
        public static final class b extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t */
            public int f48971t;

            /* JADX INFO: renamed from: u */
            public final /* synthetic */ InterfaceC5683g f48972u;

            /* JADX INFO: renamed from: v */
            public final /* synthetic */ C14011k0 f48973v;

            /* JADX INFO: renamed from: w */
            public final /* synthetic */ SelfieWorkflow.AbstractC3928c.a.AbstractC14138a f48974w;

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ SelfieWorkflow.AbstractC3928c.a f48975x;

            /* JADX INFO: renamed from: zp.k0$f$b$a */
            @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
            @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.selfie.cameraScreen.CameraScreenRunner$showRendering$2$2$3$1", m39664f = "CameraScreenRunner.kt", m39665l = {225, 231}, m39666m = "invokeSuspend")
            public static final class a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

                /* JADX INFO: renamed from: t */
                public int f48976t;

                /* JADX INFO: renamed from: u */
                public final /* synthetic */ SelfieWorkflow.AbstractC3928c.a.AbstractC14138a f48977u;

                /* JADX INFO: renamed from: v */
                public final /* synthetic */ InterfaceC5683g f48978v;

                /* JADX INFO: renamed from: w */
                public final /* synthetic */ C14011k0 f48979w;

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ SelfieWorkflow.AbstractC3928c.a f48980x;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(SelfieWorkflow.AbstractC3928c.a.AbstractC14138a abstractC14138a, InterfaceC5683g interfaceC5683g, C14011k0 c14011k0, SelfieWorkflow.AbstractC3928c.a aVar, InterfaceC9557b<? super a> interfaceC9557b) {
                    super(2, interfaceC9557b);
                    this.f48977u = abstractC14138a;
                    this.f48978v = interfaceC5683g;
                    this.f48979w = c14011k0;
                    this.f48980x = aVar;
                }

                @Override // pt.AbstractC10339a
                public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                    return new a(this.f48977u, this.f48978v, this.f48979w, this.f48980x, interfaceC9557b);
                }

                /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
                
                    if (r14 == r0) goto L19;
                 */
                @Override // pt.AbstractC10339a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    Object objMo16225i;
                    Object objM38805e = C10047c.m38805e();
                    int i10 = this.f48976t;
                    if (i10 == 0) {
                        C7348o.m30470b(obj);
                        long maxRecordingLengthMs = ((SelfieWorkflow.AbstractC3928c.a.AbstractC14138a.h) this.f48977u).getMaxRecordingLengthMs();
                        this.f48976t = 1;
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
                    C14011k0 c14011k0 = this.f48979w;
                    SelfieWorkflow.AbstractC3928c.a aVar = this.f48980x;
                    if (C7347n.m30466h(objMo16225i)) {
                        TrackingEventsLogger.logVideoStopEvent$default(c14011k0.trackingEventsLogger, "selfie", aVar.getVideoCaptureMethod().name(), null, null, null, null, false, C1759R.styleable.AppCompatTheme_windowMinWidthMajor, null);
                        ((File) objMo16225i).delete();
                    }
                    C14011k0 c14011k1 = this.f48979w;
                    SelfieWorkflow.AbstractC3928c.a aVar2 = this.f48980x;
                    Throwable thM30463e = C7347n.m30463e(objMo16225i);
                    if (thM30463e != null) {
                        TrackingEventsLogger.logVideoErrorEvent$default(c14011k1.trackingEventsLogger, "selfie", aVar2.getVideoCaptureMethod().name(), null, C7328a.m30430b(thM30463e), false, 20, null);
                    }
                    Function1 function1 = this.f48979w.currentErrorHandler;
                    if (function1 != null) {
                        function1.invoke(new C5696m0());
                    }
                    return Unit.f29331a;
                    if (this.f48978v.mo16218b().getValue() instanceof InterfaceC3404d.Closed) {
                        return Unit.f29331a;
                    }
                    InterfaceC5683g interfaceC5683g = this.f48978v;
                    this.f48976t = 2;
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
            public b(InterfaceC5683g interfaceC5683g, C14011k0 c14011k0, SelfieWorkflow.AbstractC3928c.a.AbstractC14138a abstractC14138a, SelfieWorkflow.AbstractC3928c.a aVar, InterfaceC9557b<? super b> interfaceC9557b) {
                super(2, interfaceC9557b);
                this.f48972u = interfaceC5683g;
                this.f48973v = c14011k0;
                this.f48974w = abstractC14138a;
                this.f48975x = aVar;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                return new b(this.f48972u, this.f48973v, this.f48974w, this.f48975x, interfaceC9557b);
            }

            /* JADX WARN: Code duplicated, block: B:27:0x00c7  */
            /* JADX WARN: Code duplicated, block: B:29:0x00e7  */
            /* JADX WARN: Code duplicated, block: B:31:0x00ed  */
            /* JADX WARN: Code duplicated, block: B:35:0x0117  */
            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                Object objMo16225i;
                Object value;
                C14011k0 c14011k0;
                SelfieWorkflow.AbstractC3928c.a aVar;
                SelfieWorkflow.AbstractC3928c.a.AbstractC14138a abstractC14138a;
                InterfaceC5683g interfaceC5683g;
                SelfieWorkflow.AbstractC3928c.a.AbstractC14138a abstractC14138a2;
                C14011k0 c14011k1;
                SelfieWorkflow.AbstractC3928c.a aVar2;
                Throwable thM30463e;
                boolean zBooleanValue;
                InterfaceC7850d2 interfaceC7850d2;
                Object objM38805e = C10047c.m38805e();
                int i10 = this.f48971t;
                if (i10 == 0) {
                    C7348o.m30470b(obj);
                    InterfaceC5683g interfaceC5683g2 = this.f48972u;
                    this.f48971t = 1;
                    objMo16225i = interfaceC5683g2.mo16225i(this);
                    if (objMo16225i != objM38805e) {
                    }
                    return objM38805e;
                }
                if (i10 == 1) {
                    C7348o.m30470b(obj);
                    objMo16225i = ((C7347n) obj).getValue();
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                    value = ((C7347n) obj).getValue();
                }
                c14011k0 = this.f48973v;
                aVar = this.f48975x;
                abstractC14138a = this.f48974w;
                interfaceC5683g = this.f48972u;
                if (C7347n.m30466h(value)) {
                    zBooleanValue = ((Boolean) value).booleanValue();
                    TrackingEventsLogger.logVideoStartEvent$default(c14011k0.trackingEventsLogger, "selfie", aVar.getVideoCaptureMethod().name(), null, false, 12, null);
                    if (zBooleanValue) {
                        interfaceC7850d2 = c14011k0.maxRecordingLimitJob;
                        if (interfaceC7850d2 != null) {
                            InterfaceC7850d2.a.m32603a(interfaceC7850d2, null, 1, null);
                        }
                        c14011k0.maxRecordingLimitJob = C7882k.m32780d(c14011k0.lifecycleScope, C7864g1.m32644b(), null, new a(abstractC14138a, interfaceC5683g, c14011k0, aVar, null), 2, null);
                    }
                }
                abstractC14138a2 = this.f48974w;
                c14011k1 = this.f48973v;
                aVar2 = this.f48975x;
                thM30463e = C7347n.m30463e(value);
                if (thM30463e != null) {
                    ((SelfieWorkflow.AbstractC3928c.a.AbstractC14138a.h) abstractC14138a2).m19815c().invoke(thM30463e);
                    TrackingEventsLogger.logVideoErrorEvent$default(c14011k1.trackingEventsLogger, "selfie", aVar2.getVideoCaptureMethod().name(), null, C7328a.m30430b(thM30463e), false, 20, null);
                }
                ((SelfieWorkflow.AbstractC3928c.a.AbstractC14138a.h) this.f48974w).m19816d().invoke(this.f48972u.mo16217a());
                return Unit.f29331a;
                C14011k0 c14011k2 = this.f48973v;
                SelfieWorkflow.AbstractC3928c.a aVar3 = this.f48975x;
                if (C7347n.m30466h(objMo16225i)) {
                    TrackingEventsLogger.logVideoStopEvent$default(c14011k2.trackingEventsLogger, "selfie", aVar3.getVideoCaptureMethod().name(), null, null, null, null, false, C1759R.styleable.AppCompatTheme_windowMinWidthMajor, null);
                    ((File) objMo16225i).delete();
                }
                C14011k0 c14011k3 = this.f48973v;
                SelfieWorkflow.AbstractC3928c.a aVar4 = this.f48975x;
                Throwable thM30463e2 = C7347n.m30463e(objMo16225i);
                if (thM30463e2 != null) {
                    TrackingEventsLogger.logVideoErrorEvent$default(c14011k3.trackingEventsLogger, "selfie", aVar4.getVideoCaptureMethod().name(), null, C7328a.m30430b(thM30463e2), false, 20, null);
                }
                TrackingEventsLogger.logCameraInfoEvent$default(this.f48973v.trackingEventsLogger, C3403c.m16209a(this.f48972u.mo16217a()), false, 2, null);
                if (((SelfieWorkflow.AbstractC3928c.a.AbstractC14138a.h) this.f48974w).getRecordLocalVideo()) {
                    InterfaceC5683g interfaceC5683g3 = this.f48972u;
                    this.f48971t = 2;
                    Object objMo16226j = interfaceC5683g3.mo16226j(this);
                    if (objMo16226j != objM38805e) {
                        value = objMo16226j;
                        c14011k0 = this.f48973v;
                        aVar = this.f48975x;
                        abstractC14138a = this.f48974w;
                        interfaceC5683g = this.f48972u;
                        if (C7347n.m30466h(value)) {
                            zBooleanValue = ((Boolean) value).booleanValue();
                            TrackingEventsLogger.logVideoStartEvent$default(c14011k0.trackingEventsLogger, "selfie", aVar.getVideoCaptureMethod().name(), null, false, 12, null);
                            if (zBooleanValue) {
                                interfaceC7850d2 = c14011k0.maxRecordingLimitJob;
                                if (interfaceC7850d2 != null) {
                                    InterfaceC7850d2.a.m32603a(interfaceC7850d2, null, 1, null);
                                }
                                c14011k0.maxRecordingLimitJob = C7882k.m32780d(c14011k0.lifecycleScope, C7864g1.m32644b(), null, new a(abstractC14138a, interfaceC5683g, c14011k0, aVar, null), 2, null);
                            }
                        }
                        abstractC14138a2 = this.f48974w;
                        c14011k1 = this.f48973v;
                        aVar2 = this.f48975x;
                        thM30463e = C7347n.m30463e(value);
                        if (thM30463e != null) {
                            ((SelfieWorkflow.AbstractC3928c.a.AbstractC14138a.h) abstractC14138a2).m19815c().invoke(thM30463e);
                            TrackingEventsLogger.logVideoErrorEvent$default(c14011k1.trackingEventsLogger, "selfie", aVar2.getVideoCaptureMethod().name(), null, C7328a.m30430b(thM30463e), false, 20, null);
                        }
                    }
                    return objM38805e;
                }
                ((SelfieWorkflow.AbstractC3928c.a.AbstractC14138a.h) this.f48974w).m19816d().invoke(this.f48972u.mo16217a());
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
        public f(InterfaceC5683g interfaceC5683g, C14011k0 c14011k0, SelfieWorkflow.AbstractC3928c.a.AbstractC14138a abstractC14138a, SelfieWorkflow.AbstractC3928c.a aVar, InterfaceC9557b<? super f> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f48965u = interfaceC5683g;
            this.f48966v = c14011k0;
            this.f48967w = abstractC14138a;
            this.f48968x = aVar;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new f(this.f48965u, this.f48966v, this.f48967w, this.f48968x, interfaceC9557b);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
        
            if (p256ku.C7872i.m32684g(r10, r3, r9) == r0) goto L15;
         */
        @Override // pt.AbstractC10339a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f48964t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                InterfaceC9575h interfaceC9575hM37777N = C9579j.m37777N(this.f48965u.mo16218b(), new a(null));
                this.f48964t = 1;
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
            b bVar = new b(this.f48965u, this.f48966v, this.f48967w, this.f48968x, null);
            this.f48964t = 2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((f) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: zp.k0$g */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.selfie.cameraScreen.CameraScreenRunner$showRendering$3", m39664f = "CameraScreenRunner.kt", m39665l = {263}, m39666m = "invokeSuspend")
    public static final class g extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f48981t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ SelfieWorkflow.AbstractC3928c.a.AbstractC14138a f48982u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ InterfaceC5683g f48983v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ C14011k0 f48984w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(SelfieWorkflow.AbstractC3928c.a.AbstractC14138a abstractC14138a, InterfaceC5683g interfaceC5683g, C14011k0 c14011k0, InterfaceC9557b<? super g> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f48982u = abstractC14138a;
            this.f48983v = interfaceC5683g;
            this.f48984w = c14011k0;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new g(this.f48982u, this.f48983v, this.f48984w, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f48981t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                long maxRecordingLengthMs = ((SelfieWorkflow.AbstractC3928c.a.AbstractC14138a.j) this.f48982u).getMaxRecordingLengthMs();
                this.f48981t = 1;
                if (C7946z0.m32938b(maxRecordingLengthMs, this) == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            if (this.f48983v.mo16218b().getValue() instanceof InterfaceC3404d.Closed) {
                return Unit.f29331a;
            }
            TrackingEventsLogger.logSelfieCaptureStateEvent$default(this.f48984w.trackingEventsLogger, new SelfieCaptureStateEventData(SelfieCaptureState.RECORDING_TIMED_OUT, null, null, null, 8, null), false, 2, null);
            Function1 function1 = this.f48984w.currentErrorHandler;
            if (function1 != null) {
                function1.invoke(new C5696m0());
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

    /* JADX INFO: renamed from: zp.k0$h */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.selfie.cameraScreen.CameraScreenRunner$showRendering$takePhoto$1", m39664f = "CameraScreenRunner.kt", m39665l = {344, 349}, m39666m = "invokeSuspend")
    public static final class h extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f48985t;

        /* JADX INFO: renamed from: u */
        public int f48986u;

        /* JADX INFO: renamed from: v */
        public /* synthetic */ Object f48987v;

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ SelfieWorkflow.AbstractC3928c.a f48989x;

        /* JADX INFO: renamed from: y */
        public final /* synthetic */ InterfaceC5683g f48990y;

        /* JADX INFO: renamed from: z */
        public final /* synthetic */ SelfieWorkflow.AbstractC3928c.a.AbstractC14138a f48991z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(SelfieWorkflow.AbstractC3928c.a aVar, InterfaceC5683g interfaceC5683g, SelfieWorkflow.AbstractC3928c.a.AbstractC14138a abstractC14138a, InterfaceC9557b<? super h> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f48989x = aVar;
            this.f48990y = interfaceC5683g;
            this.f48991z = abstractC14138a;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            h hVar = C14011k0.this.new h(this.f48989x, this.f48990y, this.f48991z, interfaceC9557b);
            hVar.f48987v = obj;
            return hVar;
        }

        /* JADX WARN: Code duplicated, block: B:36:0x0088 A[Catch: all -> 0x001f, TryCatch #0 {all -> 0x001f, blocks: (B:7:0x0015, B:34:0x007d, B:36:0x0088, B:37:0x009d, B:39:0x00a5, B:42:0x00aa, B:44:0x00b5, B:14:0x002c, B:30:0x006a, B:17:0x0033, B:19:0x0040, B:21:0x0048, B:27:0x0056), top: B:49:0x000d }] */
        /* JADX WARN: Code duplicated, block: B:44:0x00b5 A[Catch: all -> 0x001f, TRY_LEAVE, TryCatch #0 {all -> 0x001f, blocks: (B:7:0x0015, B:34:0x007d, B:36:0x0088, B:37:0x009d, B:39:0x00a5, B:42:0x00aa, B:44:0x00b5, B:14:0x002c, B:30:0x006a, B:17:0x0033, B:19:0x0040, B:21:0x0048, B:27:0x0056), top: B:49:0x000d }] */
        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            int i10;
            Object objMo16227k;
            int i11;
            SelfieWorkflow.AbstractC3928c.a.AbstractC14138a abstractC14138a;
            SelfieWorkflow.AbstractC3928c.a.AbstractC14138a abstractC14138a2;
            Throwable thM30463e;
            InterfaceC7906p0 interfaceC7906p0 = (InterfaceC7906p0) this.f48987v;
            Object objM38805e = C10047c.m38805e();
            int i12 = this.f48986u;
            try {
                if (i12 == 0) {
                    C7348o.m30470b(obj);
                    C14011k0.this.takingManualCapture = true;
                    i10 = (this.f48989x.getIsFlashEnabled() || (this.f48989x.getIsAutoFlashOnManualCaptureEnabled() && this.f48989x.getIsDimLightConditions())) ? 1 : 0;
                    if (i10 != 0) {
                        C14011k0.this.m50618G(true);
                        this.f48987v = interfaceC7906p0;
                        this.f48985t = i10;
                        this.f48986u = 1;
                        if (C7946z0.m32938b(1000L, this) == objM38805e) {
                        }
                    }
                    return objM38805e;
                }
                if (i12 == 1) {
                    i10 = this.f48985t;
                    C7348o.m30470b(obj);
                } else {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i11 = this.f48985t;
                    C7348o.m30470b(obj);
                    objMo16227k = ((C7347n) obj).getValue();
                }
                C7910q0.m32892h(interfaceC7906p0);
                abstractC14138a = this.f48991z;
                if (C7347n.m30466h(objMo16227k)) {
                    Function1<String, Unit> function1M19810d = ((SelfieWorkflow.AbstractC3928c.a.AbstractC14138a.e) abstractC14138a).m19810d();
                    String absolutePath = ((File) objMo16227k).getAbsolutePath();
                    Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
                    function1M19810d.invoke(absolutePath);
                }
                abstractC14138a2 = this.f48991z;
                thM30463e = C7347n.m30463e(objMo16227k);
                if (thM30463e != null && !(thM30463e instanceof C6459o0)) {
                    ((SelfieWorkflow.AbstractC3928c.a.AbstractC14138a.e) abstractC14138a2).m19809c().invoke(thM30463e);
                }
                if (i11 != 0) {
                    C14011k0.this.m50618G(false);
                }
                C14011k0.this.takingManualCapture = false;
                return Unit.f29331a;
                C7910q0.m32892h(interfaceC7906p0);
                InterfaceC5683g interfaceC5683g = this.f48990y;
                this.f48987v = interfaceC7906p0;
                this.f48985t = i10;
                this.f48986u = 2;
                objMo16227k = interfaceC5683g.mo16227k(this);
                if (objMo16227k != objM38805e) {
                    i11 = i10;
                    C7910q0.m32892h(interfaceC7906p0);
                    abstractC14138a = this.f48991z;
                    if (C7347n.m30466h(objMo16227k)) {
                        Function1<String, Unit> function1M19810d2 = ((SelfieWorkflow.AbstractC3928c.a.AbstractC14138a.e) abstractC14138a).m19810d();
                        String absolutePath2 = ((File) objMo16227k).getAbsolutePath();
                        Intrinsics.checkNotNullExpressionValue(absolutePath2, "getAbsolutePath(...)");
                        function1M19810d2.invoke(absolutePath2);
                    }
                    abstractC14138a2 = this.f48991z;
                    thM30463e = C7347n.m30463e(objMo16227k);
                    if (thM30463e != null) {
                        ((SelfieWorkflow.AbstractC3928c.a.AbstractC14138a.e) abstractC14138a2).m19809c().invoke(thM30463e);
                    }
                    if (i11 != 0) {
                        C14011k0.this.m50618G(false);
                    }
                    C14011k0.this.takingManualCapture = false;
                    return Unit.f29331a;
                }
                return objM38805e;
            } catch (Throwable th2) {
                C14011k0.this.takingManualCapture = false;
                throw th2;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((h) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    public C14011k0(@NotNull Context context, @NotNull InterfaceC14025r0 viewController, @NotNull C3402b cameraPreview, @NotNull C5698n0 selfieDirectionFeed, @NotNull TrackingEventsLogger trackingEventsLogger, boolean z10) throws CameraAccessException {
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
        this.lifecycleScope = C0982t.m4979a(C7259g.m30275i(context));
        List<C6445h0> listM28078a = C6441f0.m28078a(context);
        ArrayList arrayList = new ArrayList(C7701q.m31905u(listM28078a, 10));
        Iterator<T> it = listM28078a.iterator();
        while (it.hasNext()) {
            arrayList.add(((C6445h0) it.next()).getFacing());
        }
        this.cameraFacingDirections = CollectionsKt.m31700X(arrayList);
        this.viewController.mo50675a();
    }

    /* JADX INFO: renamed from: J */
    public static final Unit m50574J(C14011k0 c14011k0, SelfieWorkflow.AbstractC3928c.a aVar, int i10) {
        TrackingEventsLogger.logSelfieCaptureButtonClickedEvent$default(c14011k0.trackingEventsLogger, new SelfieCaptureButtonEventData(SelfieCaptureButtonType.SWITCH_CAMERA, null, 2, null), false, 2, null);
        aVar.m19794s().invoke(c14011k0.cameraFacingDirections.get(i10));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: K */
    public static final Unit m50575K(SelfieWorkflow.AbstractC3928c.a aVar, C14011k0 c14011k0) {
        boolean z10 = !aVar.getIsFlashEnabled();
        TrackingEventsLogger.logSelfieCaptureButtonClickedEvent$default(c14011k0.trackingEventsLogger, new SelfieCaptureButtonEventData(SelfieCaptureButtonType.FLASH, null, 2, null), false, 2, null);
        aVar.m19796u().invoke(Boolean.valueOf(z10));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: L */
    public static final Unit m50576L(SelfieWorkflow.AbstractC3928c.a aVar) {
        aVar.m19792q().invoke();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: M */
    public static final Unit m50577M(SelfieWorkflow.AbstractC3928c.a aVar) {
        aVar.m19795t().invoke();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: N */
    public static final Unit m50578N(C14011k0 c14011k0, C7729c0 c7729c0) {
        TrackingEventsLogger.logSelfieCaptureButtonClickedEvent$default(c14011k0.trackingEventsLogger, new SelfieCaptureButtonEventData(SelfieCaptureButtonType.SHUTTER, null, 2, null), false, 2, null);
        Function0 function0 = (Function0) c7729c0.f29425a;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: O */
    public static final Unit m50579O(C14011k0 c14011k0, InterfaceC5683g interfaceC5683g) {
        C7211b.m30141a(c14011k0.selfieDirectionFeed, interfaceC5683g, c14011k0.viewController.mo50676b());
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: P */
    public static final Unit m50580P(SelfieWorkflow.AbstractC3928c.a.AbstractC14138a abstractC14138a) {
        ((SelfieWorkflow.AbstractC3928c.a.AbstractC14138a.g) abstractC14138a).m19813b().invoke();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: Q */
    public static final Unit m50581Q(SelfieWorkflow.AbstractC3928c.a.AbstractC14138a abstractC14138a) {
        ((SelfieWorkflow.AbstractC3928c.a.AbstractC14138a.g) abstractC14138a).m19813b().invoke();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: R */
    public static final Unit m50582R(SelfieWorkflow.AbstractC3928c.a.AbstractC14138a abstractC14138a) {
        ((SelfieWorkflow.AbstractC3928c.a.AbstractC14138a.g) abstractC14138a).m19813b().invoke();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: S */
    public static final Unit m50583S(SelfieWorkflow.AbstractC3928c.a.AbstractC14138a abstractC14138a) {
        ((SelfieWorkflow.AbstractC3928c.a.AbstractC14138a.g) abstractC14138a).m19813b().invoke();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: T */
    public static final Unit m50584T(SelfieWorkflow.AbstractC3928c.a.AbstractC14138a abstractC14138a) {
        ((SelfieWorkflow.AbstractC3928c.a.AbstractC14138a.g) abstractC14138a).m19813b().invoke();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: U */
    public static final Unit m50585U(SelfieWorkflow.AbstractC3928c.a.AbstractC14138a abstractC14138a) {
        ((SelfieWorkflow.AbstractC3928c.a.AbstractC14138a.i) abstractC14138a).m19819c().invoke();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: V */
    public static final Unit m50586V(C14011k0 c14011k0, SelfieWorkflow.AbstractC3928c.a aVar, InterfaceC5683g interfaceC5683g, SelfieWorkflow.AbstractC3928c.a.AbstractC14138a abstractC14138a) {
        m50588X(c14011k0, aVar, interfaceC5683g, abstractC14138a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: W */
    public static final Unit m50587W(SelfieWorkflow.AbstractC3928c.a.AbstractC14138a abstractC14138a) {
        ((SelfieWorkflow.AbstractC3928c.a.AbstractC14138a.f) abstractC14138a).m19812b().invoke();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: X */
    public static final void m50588X(C14011k0 c14011k0, SelfieWorkflow.AbstractC3928c.a aVar, InterfaceC5683g interfaceC5683g, SelfieWorkflow.AbstractC3928c.a.AbstractC14138a abstractC14138a) {
        if (c14011k0.takingManualCapture) {
            return;
        }
        InterfaceC7850d2 interfaceC7850d2 = c14011k0.manualCaptureJob;
        if (interfaceC7850d2 != null) {
            InterfaceC7850d2.a.m32603a(interfaceC7850d2, null, 1, null);
        }
        c14011k0.manualCaptureJob = C7882k.m32780d(c14011k0.lifecycleScope, C7864g1.m32645c(), null, c14011k0.new h(aVar, interfaceC5683g, abstractC14138a, null), 2, null);
    }

    /* JADX INFO: renamed from: C */
    public final InterfaceC5683g m50614C(SelfieWorkflow.AbstractC3928c.a rendering, Camera2PreviewView camera2Preview) throws CameraAccessException {
        Context applicationContext = this.context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        CameraChoices cameraChoicesM28079b = C6441f0.m28079b(applicationContext, m50621Y(rendering.getFacingMode()));
        if (cameraChoicesM28079b != null) {
            return rendering.getCamera2ControllerFactory().mo28063a(cameraChoicesM28079b, camera2Preview, this.selfieDirectionFeed, EnumC8598a.valueOf(rendering.getVideoCaptureMethod().toString()), rendering.getWebRtcManager(), rendering.getIsAudioRequired());
        }
        rendering.m19793r().invoke(new C5688i0());
        return new C3407g(camera2Preview);
    }

    /* JADX INFO: renamed from: D */
    public final InterfaceC5683g m50615D(SelfieWorkflow.AbstractC3928c.a rendering, boolean recordVideo) {
        return rendering.getCameraXControllerFactory().mo16229a(this.cameraPreview, this.viewController.mo50686j(), new b(rendering, recordVideo), rendering.getIsAudioRequired());
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX INFO: renamed from: E */
    public final InterfaceC5683g m50616E(SelfieWorkflow.AbstractC3928c.a rendering) throws CameraAccessException {
        InterfaceC5683g interfaceC5683gM50614C;
        InterfaceC5683g interfaceC5683g = this.cameraController;
        if (interfaceC5683g != null) {
            if (this.currentFacingMode == rendering.getFacingMode()) {
                interfaceC5683g.mo16224h();
                return interfaceC5683g;
            }
            interfaceC5683g.destroy();
        }
        Camera2PreviewView camera2PreviewViewMo50685i = this.viewController.mo50685i();
        int i10 = a.f48949d[rendering.getVideoCaptureMethod().ordinal()];
        if (i10 == 1) {
            interfaceC5683gM50614C = m50614C(rendering, camera2PreviewViewMo50685i);
        } else {
            if (i10 != 2) {
                if (i10 != 3) {
                    throw new C7345l();
                }
            } else if (!this.useCameraXForVideo) {
                interfaceC5683gM50614C = m50614C(rendering, camera2PreviewViewMo50685i);
            }
            interfaceC5683gM50614C = m50615D(rendering, rendering.getVideoCaptureMethod() == EnumC8598a.Upload);
        }
        C7259g.m30275i(this.context).mo4656a().mo4935a(new c(interfaceC5683gM50614C));
        m50617F(interfaceC5683gM50614C);
        interfaceC5683gM50614C.mo16224h();
        this.cameraController = interfaceC5683gM50614C;
        this.currentFacingMode = rendering.getFacingMode();
        return interfaceC5683gM50614C;
    }

    /* JADX INFO: renamed from: F */
    public final void m50617F(InterfaceC5683g cameraController) {
        InterfaceC7850d2 interfaceC7850d2 = this.cameraStateListenerJob;
        if (interfaceC7850d2 != null) {
            InterfaceC7850d2.a.m32603a(interfaceC7850d2, null, 1, null);
        }
        this.cameraStateListenerJob = C7882k.m32780d(C0982t.m4979a(C7259g.m30275i(this.context)), null, null, new d(cameraController, this, null), 3, null);
    }

    /* JADX INFO: renamed from: G */
    public final void m50618G(boolean on2) {
        Window window;
        Window window2;
        InterfaceC5683g interfaceC5683g = this.cameraController;
        if (interfaceC5683g == null) {
            return;
        }
        CameraProperties.EnumC3397b facingMode = interfaceC5683g.mo16217a().getFacingMode();
        if (on2) {
            if (facingMode != CameraProperties.EnumC3397b.User) {
                interfaceC5683g.mo16219c(true);
                return;
            }
            this.viewController.mo50677c();
            ActivityC6992b activityC6992bM30267a = C7259g.m30267a(this.context);
            if (activityC6992bM30267a == null || (window2 = activityC6992bM30267a.getWindow()) == null) {
                return;
            }
            WindowManager.LayoutParams attributes = window2.getAttributes();
            attributes.screenBrightness = 1.0f;
            window2.setAttributes(attributes);
            return;
        }
        if (facingMode != CameraProperties.EnumC3397b.User) {
            interfaceC5683g.mo16219c(false);
            return;
        }
        this.viewController.mo50688l();
        ActivityC6992b activityC6992bM30267a2 = C7259g.m30267a(this.context);
        if (activityC6992bM30267a2 == null || (window = activityC6992bM30267a2.getWindow()) == null) {
            return;
        }
        WindowManager.LayoutParams attributes2 = window.getAttributes();
        attributes2.screenBrightness = -1.0f;
        window.setAttributes(attributes2);
    }

    /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;Lan/y;)V */
    @Override // p016an.InterfaceC0382k
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo1442a(@NotNull SelfieWorkflow.AbstractC3928c.a rendering, @NotNull ViewEnvironment viewEnvironment) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        m50620I(rendering, C12249c.m45392a(viewEnvironment));
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
    /* JADX WARN: Type inference failed for: r0v32, types: [T, zp.y] */
    /* JADX WARN: Type inference failed for: r0v34, types: [T, zp.x] */
    /* JADX INFO: renamed from: I */
    public final void m50620I(@NotNull SelfieWorkflow.AbstractC3928c.a rendering, @Nullable C12247a systemUiController) throws CameraAccessException {
        C5706r0.c cVar;
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
        final C14011k0 c14011k0 = this;
        final SelfieWorkflow.AbstractC3928c.a rendering2 = rendering;
        Intrinsics.checkNotNullParameter(rendering2, "rendering");
        c14011k0.currentErrorHandler = rendering2.m19793r();
        c14011k0.permissionChangedHandler = rendering2.m19797v();
        StepStyles.SelfieStepStyle styles2 = rendering2.getStyles();
        if (styles2 != null) {
            c14011k0.viewController.mo50690n(styles2, systemUiController);
        }
        if (rendering2.getRequestingPermissions()) {
            return;
        }
        final InterfaceC5683g interfaceC5683gM50616E = m50616E(rendering);
        if (rendering2.getRecordingLocallyRequired() && !interfaceC5683gM50616E.getRecordingStarted() && (function1 = c14011k0.currentErrorHandler) != null) {
            function1.invoke(new C5694l0(false));
        }
        interfaceC5683gM50616E.getPreviewView().setVisibility(0);
        C14027s0 c14027s0Mo50691o = c14011k0.viewController.mo50691o(rendering2.getRequireStrictSelfieCapture());
        c14011k0.selfieDirectionFeed.m25837m(c14027s0Mo50691o.getMinFaceRatio(), c14027s0Mo50691o.getMaxFaceRatio(), rendering2.getIsAutoFlashOnManualCaptureEnabled());
        C5698n0 c5698n0 = c14011k0.selfieDirectionFeed;
        EnumC7638a pose = rendering2.getPose();
        int i11 = pose == null ? -1 : a.f48946a[pose.ordinal()];
        if (i11 == -1) {
            cVar = C5706r0.c.None;
        } else if (i11 == 1) {
            cVar = C5706r0.c.Center;
        } else if (i11 == 2) {
            cVar = C5706r0.c.Left;
        } else if (i11 == 3) {
            cVar = C5706r0.c.Right;
        } else if (i11 == 4) {
            cVar = C5706r0.c.Up;
        } else {
            if (i11 != 5) {
                throw new C7345l();
            }
            cVar = C5706r0.c.Down;
        }
        c5698n0.m25838n(cVar);
        if (!c14011k0.takingManualCapture) {
            c14011k0.m50618G(rendering2.getIsFlashOn());
        }
        final C7729c0 c7729c0 = new C7729c0();
        final SelfieWorkflow.AbstractC3928c.a.AbstractC14138a mode = rendering2.getMode();
        if (!(mode instanceof SelfieWorkflow.AbstractC3928c.a.AbstractC14138a.h)) {
            if (mode instanceof SelfieWorkflow.AbstractC3928c.a.AbstractC14138a.j) {
                InterfaceC7850d2 interfaceC7850d2 = c14011k0.maxRecordingLimitJob;
                if (interfaceC7850d2 != null) {
                    InterfaceC7850d2.a.m32603a(interfaceC7850d2, null, 1, null);
                }
                c14011k0.maxRecordingLimitJob = C7882k.m32780d(c14011k0.lifecycleScope, C7864g1.m32644b(), null, new g(mode, interfaceC5683gM50616E, c14011k0, null), 2, null);
            } else {
                if (mode instanceof SelfieWorkflow.AbstractC3928c.a.AbstractC14138a.g) {
                    SelfieWorkflow.AbstractC3928c.a.AbstractC14138a.g gVar = (SelfieWorkflow.AbstractC3928c.a.AbstractC14138a.g) mode;
                    switch (a.f48947b[gVar.getOverlay().ordinal()]) {
                        case 1:
                        case 2:
                            gVar.m19813b().invoke();
                            break;
                        case 3:
                            c14011k0.viewController.mo50687k(new Function0() { // from class: zp.w
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return C14011k0.m50580P(mode);
                                }
                            });
                            break;
                        case 4:
                            c14011k0.viewController.mo50683g(new Function0() { // from class: zp.f0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return C14011k0.m50581Q(mode);
                                }
                            });
                            break;
                        case 5:
                            c14011k0.viewController.mo50692p(new Function0() { // from class: zp.g0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return C14011k0.m50582R(mode);
                                }
                            });
                            break;
                        case 6:
                            c14011k0.viewController.mo50689m(new Function0() { // from class: zp.h0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return C14011k0.m50583S(mode);
                                }
                            });
                            break;
                        case 7:
                            c14011k0.viewController.mo50684h(new Function0() { // from class: zp.i0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return C14011k0.m50584T(mode);
                                }
                            });
                            break;
                        default:
                            throw new C7345l();
                    }
                } else {
                    if (mode instanceof SelfieWorkflow.AbstractC3928c.a.AbstractC14138a.c) {
                        c14011k0.viewController.mo50682f(((SelfieWorkflow.AbstractC3928c.a.AbstractC14138a.c) mode).getCountDown());
                        z11 = false;
                        z12 = false;
                        isCapturing = false;
                        z13 = true;
                    } else if (mode instanceof SelfieWorkflow.AbstractC3928c.a.AbstractC14138a.i) {
                        SelfieWorkflow.AbstractC3928c.a.AbstractC14138a.i iVar = (SelfieWorkflow.AbstractC3928c.a.AbstractC14138a.i) mode;
                        if (iVar.getImageCaptured()) {
                            c14011k0.viewController.mo50680e(rendering2.getMessage(), rendering2.getDescription(), new Function0() { // from class: zp.j0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return C14011k0.m50585U(mode);
                                }
                            });
                        } else {
                            iVar.m19819c().invoke();
                        }
                        z12 = false;
                        z13 = false;
                        isCapturing = false;
                        z11 = true;
                    } else if (mode instanceof SelfieWorkflow.AbstractC3928c.a.AbstractC14138a.C14139a) {
                        c14011k0 = c14011k0;
                        z12 = false;
                        z13 = false;
                        isCapturing = false;
                        z11 = true;
                        interfaceC5683gM50616E = interfaceC5683gM50616E;
                        rendering2 = rendering2;
                        z10 = true;
                    } else {
                        if (mode instanceof SelfieWorkflow.AbstractC3928c.a.AbstractC14138a.e) {
                            c7729c0.f29425a = new Function0() { // from class: zp.x
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return C14011k0.m50586V(this.f49041a, rendering2, interfaceC5683gM50616E, mode);
                                }
                            };
                            SelfieWorkflow.AbstractC3928c.a.AbstractC14138a.e eVar = (SelfieWorkflow.AbstractC3928c.a.AbstractC14138a.e) mode;
                            if (eVar.getForceCapture()) {
                                m50588X(c14011k0, rendering2, interfaceC5683gM50616E, mode);
                                z11 = false;
                            } else {
                                z11 = true;
                            }
                            if (eVar.getIsCapturing() || c14011k0.takingManualCapture) {
                                z11 = false;
                            }
                            isCapturing = eVar.getIsCapturing();
                            z12 = false;
                        } else if (mode instanceof SelfieWorkflow.AbstractC3928c.a.AbstractC14138a.f) {
                            c7729c0.f29425a = new Function0() { // from class: zp.y
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return C14011k0.m50587W(mode);
                                }
                            };
                        } else if (mode instanceof SelfieWorkflow.AbstractC3928c.a.AbstractC14138a.b) {
                            isCapturing = ((SelfieWorkflow.AbstractC3928c.a.AbstractC14138a.b) mode).getIsCapturing();
                            z11 = false;
                            z12 = false;
                        } else {
                            if (!(mode instanceof SelfieWorkflow.AbstractC3928c.a.AbstractC14138a.d)) {
                                throw new C7345l();
                            }
                            InterfaceC7850d2 interfaceC7850d3 = c14011k0.maxRecordingLimitJob;
                            if (interfaceC7850d3 != null) {
                                InterfaceC7850d2.a.m32603a(interfaceC7850d3, null, 1, null);
                            }
                            if (((SelfieWorkflow.AbstractC3928c.a.AbstractC14138a.d) mode).getStartFinalize()) {
                                C7882k.m32780d(c14011k0.lifecycleScope, C7864g1.m32645c(), null, new e(interfaceC5683gM50616E, c14011k0, rendering2, mode, null), 2, null);
                            }
                            isCapturing = false;
                            z10 = true;
                            z11 = true;
                            z12 = true;
                            z13 = true;
                        }
                        z13 = true;
                        interfaceC5683gM50616E = interfaceC5683gM50616E;
                        rendering2 = rendering2;
                        z10 = z12;
                    }
                    interfaceC5683gM50616E = interfaceC5683gM50616E;
                    rendering2 = rendering2;
                    z10 = isCapturing;
                }
                z12 = false;
                isCapturing = false;
                z11 = true;
                z13 = true;
                interfaceC5683gM50616E = interfaceC5683gM50616E;
                rendering2 = rendering2;
                z10 = isCapturing;
            }
            if (rendering2.getFacingMode() == CameraProperties.EnumC3397b.User) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (z10 && c14011k0.cameraFacingDirections.size() >= 2 && rendering2.getAllowSwitchCamera()) {
                z15 = true;
            } else {
                z15 = false;
            }
            iIndexOf = (c14011k0.cameraFacingDirections.indexOf(rendering2.getFacingMode()) + 1) % c14011k0.cameraFacingDirections.size();
            if (z15) {
                i10 = a.f48948c[c14011k0.cameraFacingDirections.get(iIndexOf).ordinal()];
                if (i10 != 1) {
                    Context context = c14011k0.context;
                    string = context.getString(C12244g.f43241Z, context.getString(C12244g.f43248d));
                } else if (i10 != 2) {
                    Context context2 = c14011k0.context;
                    string = context2.getString(C12244g.f43241Z, context2.getString(C12244g.f43246c));
                } else {
                    if (i10 == 3) {
                        throw new C7345l();
                    }
                    string = c14011k0.context.getString(C12244g.f43243a0);
                }
                str = string;
            } else {
                str = null;
            }
            InterfaceC14025r0 interfaceC14025r0 = c14011k0.viewController;
            boolean z19 = z11;
            String title = rendering2.getCom.withpersona.sdk2.inquiry.network.dto.ui.components.Title.type java.lang.String();
            String autoCaptureText = rendering2.getAutoCaptureText();
            String realTimeHint = rendering2.getRealTimeHint();
            String message = rendering2.getMessage();
            final InterfaceC5683g interfaceC5683g = interfaceC5683gM50616E;
            String description = rendering2.getDescription();
            String captureSuccessText = rendering2.getCaptureSuccessText();
            String disclaimerText = rendering2.getDisclaimerText();
            boolean isAutoCaptureOn = rendering2.getIsAutoCaptureOn();
            boolean isFlashEnabled = rendering2.getIsFlashEnabled();
            navBarTitleStyleValue = null;
            String hintVerifyingText = rendering2.getHintVerifyingText();
            String hintAutoCaptureTimeoutText = rendering2.getHintAutoCaptureTimeoutText();
            boolean z20 = rendering2.getMode() instanceof SelfieWorkflow.AbstractC3928c.a.AbstractC14138a.j;
            if ((rendering2.getMode() instanceof SelfieWorkflow.AbstractC3928c.a.AbstractC14138a.j) && !(rendering2.getMode() instanceof SelfieWorkflow.AbstractC3928c.a.AbstractC14138a.h)) {
                InterfaceC3404d value = interfaceC5683g.mo16218b().getValue();
                z16 = z10;
                InterfaceC3404d.Ready ready = value instanceof InterfaceC3404d.Ready ? (InterfaceC3404d.Ready) value : null;
                if (ready == null || ready.getFirstFrameReceived()) {
                    z17 = false;
                }
                z18 = true;
                boolean z21 = !z16;
                boolean z22 = !z16;
                if (z13 || !z19 || c7729c0.f29425a == 0) {
                    z18 = false;
                }
                boolean z23 = rendering2.getMode() instanceof SelfieWorkflow.AbstractC3928c.a.AbstractC14138a.c;
                NavigationState navigationState = rendering2.getNavigationState();
                String navBarTitle = rendering2.getNavBarTitle();
                styles = rendering2.getStyles();
                if (styles != null) {
                    navBarTitleStyleValue = styles.getNavBarTitleStyleValue();
                }
                interfaceC14025r0.mo50679d(systemUiController, title, autoCaptureText, realTimeHint, message, description, captureSuccessText, disclaimerText, hintAutoCaptureTimeoutText, hintVerifyingText, isAutoCaptureOn, isFlashEnabled, z14, z20, z17, z12, str, z15, z13, z21, z13, z22, z18, z23, isCapturing, navigationState, navBarTitle, navBarTitleStyleValue, c14011k0.m50623a0(rendering2.getMode().getOverlay(), z14), rendering2.getPoseScore(), rendering2.getBrightnessInfo(), rendering2.getWatermarkText(), rendering2.getStyles(), new Function0() { // from class: zp.z
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C14011k0.m50574J(this.f49046a, rendering2, iIndexOf);
                    }
                }, new Function0() { // from class: zp.a0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C14011k0.m50575K(rendering2, c14011k0);
                    }
                }, new Function0() { // from class: zp.b0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C14011k0.m50576L(rendering2);
                    }
                }, new Function0() { // from class: zp.c0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C14011k0.m50577M(rendering2);
                    }
                }, new Function0() { // from class: zp.d0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C14011k0.m50578N(this.f48911a, c7729c0);
                    }
                });
                C12543z.m46890b(interfaceC5683g.getPreviewView(), new Function0() { // from class: zp.e0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C14011k0.m50579O(this.f48915a, interfaceC5683g);
                    }
                });
                c14011k0.lastRendering = rendering2;
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
            boolean z26 = rendering2.getMode() instanceof SelfieWorkflow.AbstractC3928c.a.AbstractC14138a.c;
            NavigationState navigationState2 = rendering2.getNavigationState();
            String navBarTitle2 = rendering2.getNavBarTitle();
            styles = rendering2.getStyles();
            if (styles != null) {
                navBarTitleStyleValue = styles.getNavBarTitleStyleValue();
            }
            interfaceC14025r0.mo50679d(systemUiController, title, autoCaptureText, realTimeHint, message, description, captureSuccessText, disclaimerText, hintAutoCaptureTimeoutText, hintVerifyingText, isAutoCaptureOn, isFlashEnabled, z14, z20, z17, z12, str, z15, z13, z24, z13, z25, z18, z26, isCapturing, navigationState2, navBarTitle2, navBarTitleStyleValue, c14011k0.m50623a0(rendering2.getMode().getOverlay(), z14), rendering2.getPoseScore(), rendering2.getBrightnessInfo(), rendering2.getWatermarkText(), rendering2.getStyles(), new Function0() { // from class: zp.z
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C14011k0.m50574J(this.f49046a, rendering2, iIndexOf);
                }
            }, new Function0() { // from class: zp.a0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C14011k0.m50575K(rendering2, c14011k0);
                }
            }, new Function0() { // from class: zp.b0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C14011k0.m50576L(rendering2);
                }
            }, new Function0() { // from class: zp.c0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C14011k0.m50577M(rendering2);
                }
            }, new Function0() { // from class: zp.d0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C14011k0.m50578N(this.f48911a, c7729c0);
                }
            });
            C12543z.m46890b(interfaceC5683g.getPreviewView(), new Function0() { // from class: zp.e0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C14011k0.m50579O(this.f48915a, interfaceC5683g);
                }
            });
            c14011k0.lastRendering = rendering2;
        }
        AbstractC0968m abstractC0968m = c14011k0.lifecycleScope;
        AbstractC7888l0 abstractC7888l0M32643a = C7864g1.m32643a();
        f fVar = new f(interfaceC5683gM50616E, c14011k0, mode, rendering2, null);
        rendering2 = rendering2;
        C7882k.m32780d(abstractC0968m, abstractC7888l0M32643a, null, fVar, 2, null);
        c14011k0 = c14011k0;
        z12 = false;
        isCapturing = false;
        z11 = true;
        z13 = true;
        interfaceC5683gM50616E = interfaceC5683gM50616E;
        rendering2 = rendering2;
        z10 = true;
        if (rendering2.getFacingMode() == CameraProperties.EnumC3397b.User) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z10) {
            z15 = false;
        } else {
            z15 = false;
        }
        iIndexOf = (c14011k0.cameraFacingDirections.indexOf(rendering2.getFacingMode()) + 1) % c14011k0.cameraFacingDirections.size();
        if (z15) {
            i10 = a.f48948c[c14011k0.cameraFacingDirections.get(iIndexOf).ordinal()];
            if (i10 != 1) {
                Context context3 = c14011k0.context;
                string = context3.getString(C12244g.f43241Z, context3.getString(C12244g.f43248d));
            } else if (i10 != 2) {
                Context context4 = c14011k0.context;
                string = context4.getString(C12244g.f43241Z, context4.getString(C12244g.f43246c));
            } else {
                if (i10 == 3) {
                    throw new C7345l();
                }
                string = c14011k0.context.getString(C12244g.f43243a0);
            }
            str = string;
        } else {
            str = null;
        }
        InterfaceC14025r0 interfaceC14025r1 = c14011k0.viewController;
        boolean z110 = z11;
        String title2 = rendering2.getCom.withpersona.sdk2.inquiry.network.dto.ui.components.Title.type java.lang.String();
        String autoCaptureText2 = rendering2.getAutoCaptureText();
        String realTimeHint2 = rendering2.getRealTimeHint();
        String message2 = rendering2.getMessage();
        final InterfaceC5683g interfaceC5683g2 = interfaceC5683gM50616E;
        String description2 = rendering2.getDescription();
        String captureSuccessText2 = rendering2.getCaptureSuccessText();
        String disclaimerText2 = rendering2.getDisclaimerText();
        boolean isAutoCaptureOn2 = rendering2.getIsAutoCaptureOn();
        boolean isFlashEnabled2 = rendering2.getIsFlashEnabled();
        navBarTitleStyleValue = null;
        String hintVerifyingText2 = rendering2.getHintVerifyingText();
        String hintAutoCaptureTimeoutText2 = rendering2.getHintAutoCaptureTimeoutText();
        boolean z27 = rendering2.getMode() instanceof SelfieWorkflow.AbstractC3928c.a.AbstractC14138a.j;
        if (rendering2.getMode() instanceof SelfieWorkflow.AbstractC3928c.a.AbstractC14138a.j) {
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
        boolean z210 = rendering2.getMode() instanceof SelfieWorkflow.AbstractC3928c.a.AbstractC14138a.c;
        NavigationState navigationState3 = rendering2.getNavigationState();
        String navBarTitle3 = rendering2.getNavBarTitle();
        styles = rendering2.getStyles();
        if (styles != null) {
            navBarTitleStyleValue = styles.getNavBarTitleStyleValue();
        }
        interfaceC14025r1.mo50679d(systemUiController, title2, autoCaptureText2, realTimeHint2, message2, description2, captureSuccessText2, disclaimerText2, hintAutoCaptureTimeoutText2, hintVerifyingText2, isAutoCaptureOn2, isFlashEnabled2, z14, z27, z17, z12, str, z15, z13, z28, z13, z29, z18, z210, isCapturing, navigationState3, navBarTitle3, navBarTitleStyleValue, c14011k0.m50623a0(rendering2.getMode().getOverlay(), z14), rendering2.getPoseScore(), rendering2.getBrightnessInfo(), rendering2.getWatermarkText(), rendering2.getStyles(), new Function0() { // from class: zp.z
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C14011k0.m50574J(this.f49046a, rendering2, iIndexOf);
            }
        }, new Function0() { // from class: zp.a0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C14011k0.m50575K(rendering2, c14011k0);
            }
        }, new Function0() { // from class: zp.b0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C14011k0.m50576L(rendering2);
            }
        }, new Function0() { // from class: zp.c0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C14011k0.m50577M(rendering2);
            }
        }, new Function0() { // from class: zp.d0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C14011k0.m50578N(this.f48911a, c7729c0);
            }
        });
        C12543z.m46890b(interfaceC5683g2.getPreviewView(), new Function0() { // from class: zp.e0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C14011k0.m50579O(this.f48915a, interfaceC5683g2);
            }
        });
        c14011k0.lastRendering = rendering2;
    }

    /* JADX INFO: renamed from: Y */
    public final EnumC6455m0 m50621Y(CameraProperties.EnumC3397b enumC3397b) {
        int i10 = a.f48948c[enumC3397b.ordinal()];
        if (i10 == 1) {
            return EnumC6455m0.FRONT;
        }
        if (i10 == 2) {
            return EnumC6455m0.BACK;
        }
        if (i10 == 3) {
            return EnumC6455m0.EXTERNAL;
        }
        throw new C7345l();
    }

    /* JADX INFO: renamed from: Z */
    public final C3402b.a m50622Z(CameraProperties.EnumC3397b enumC3397b) {
        int i10 = a.f48948c[enumC3397b.ordinal()];
        if (i10 == 1) {
            return C3402b.a.FRONT;
        }
        if (i10 == 2) {
            return C3402b.a.BACK;
        }
        if (i10 == 3) {
            return C3402b.a.EXTERNAL;
        }
        throw new C7345l();
    }

    /* JADX INFO: renamed from: a0 */
    public final SelfieOverlayView.EnumC3998e m50623a0(SelfieWorkflow.AbstractC3928c.a.b bVar, boolean z10) {
        switch (a.f48947b[bVar.ordinal()]) {
            case 1:
                return SelfieOverlayView.EnumC3998e.None;
            case 2:
                return SelfieOverlayView.EnumC3998e.Finalizing;
            case 3:
                return SelfieOverlayView.EnumC3998e.Center;
            case 4:
                return z10 ? SelfieOverlayView.EnumC3998e.Left : SelfieOverlayView.EnumC3998e.Right;
            case 5:
                return z10 ? SelfieOverlayView.EnumC3998e.Right : SelfieOverlayView.EnumC3998e.Left;
            case 6:
                return SelfieOverlayView.EnumC3998e.Up;
            case 7:
                return SelfieOverlayView.EnumC3998e.Down;
            default:
                throw new C7345l();
        }
    }
}
