package p251ko;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.p616lifecycle.InterfaceC0954f;
import androidx.p616lifecycle.InterfaceC0980s;
import com.airbnb.lottie.LottieAnimationView;
import com.withpersona.sdk2.camera.C3402b;
import com.withpersona.sdk2.camera.camera2.Camera2PreviewView;
import com.withpersona.sdk2.inquiry.governmentid.C3539b;
import com.withpersona.sdk2.inquiry.governmentid.C3571o;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.governmentid.captureTips.StaticCaptureTipsView;
import com.withpersona.sdk2.inquiry.governmentid.view.ScanningView;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.p055ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.p055ui.ThemeableLottieAnimationView;
import cr.C4268k4;
import cr.C4352y4;
import er.C5199h;
import io.C6891m2;
import io.OverlayAssets;
import ir.C6966c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7700p0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lr.C8243c;
import mo.BottomSheetCaptureTipsViewModel;
import mo.C8606h;
import mo.InterfaceC8607i;
import mo.StaticCaptureTipsViewModel;
import no.C9526b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p132fn.C5717x;
import p132fn.InterfaceC5683g;
import p152go.C6153a0;
import p152go.C6159e;
import p181i.C6589a;
import p226jq.C7259g;
import p226jq.C7265j;
import p226jq.C7288z;
import p227jr.C7304h0;
import p227jr.EnumC7298e0;
import p229jt.C7345l;
import p315nt.InterfaceC9557b;
import p394qt.C10708b;
import p394qt.InterfaceC10707a;
import p497vp.C12238a;
import p497vp.C12244g;
import p526wq.C12524g;
import p526wq.C12543z;

/* JADX INFO: renamed from: ko.m */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0014\u0018\u0000 \u0080\u00012\u00020\u0001:\u0002T6B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001c\u001a\u00020\u0012*\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0012H\u0002¢\u0006\u0004\b \u0010\u001fJ\u000f\u0010!\u001a\u00020\u0012H\u0002¢\u0006\u0004\b!\u0010\u001fJ\u000f\u0010\"\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\"\u0010\u001fJ9\u0010,\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u00102\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&2\b\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b,\u0010-J1\u0010.\u001a\u00020\u00122\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&2\b\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b.\u0010/J1\u00104\u001a\u00020\u00122\b\u00100\u001a\u0004\u0018\u00010*2\u0006\u0010%\u001a\u00020$2\u0006\u00101\u001a\u00020\u00192\u0006\u00103\u001a\u000202H\u0002¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0012H\u0016¢\u0006\u0004\b6\u0010\u001fJ\u0097\u0002\u0010P\u001a\u00020\u00122\u0006\u0010+\u001a\u00020*2\u0006\u00107\u001a\u00020*2\u0006\u00108\u001a\u00020*2\u0006\u00109\u001a\u00020*2\u0006\u0010:\u001a\u00020*2\b\u00100\u001a\u0004\u0018\u00010*2\u0006\u0010<\u001a\u00020;2\u0006\u0010%\u001a\u00020$2\u0006\u0010>\u001a\u00020=2\u0006\u0010'\u001a\u00020&2\b\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010?\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010A\u001a\u00020@2\b\u0010B\u001a\u0004\u0018\u00010*2\b\u0010D\u001a\u0004\u0018\u00010C2\b\u0010F\u001a\u0004\u0018\u00010E2\u0006\u0010#\u001a\u00020\u00102\f\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00120G2\f\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00120G2\u0012\u0010K\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00120J2\f\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00120G2\f\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00120G2\f\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00120G2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010O\u001a\u0004\u0018\u00010*H\u0016¢\u0006\u0004\bP\u0010QJ\u000f\u0010R\u001a\u00020\u0012H\u0016¢\u0006\u0004\bR\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010SR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010VR\u0014\u0010Z\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010]\u001a\u00020[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010\\R\u001a\u0010b\u001a\u00020^8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\b_\u0010aR\u0018\u0010e\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u0016\u0010i\u001a\u00020f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u0018\u0010l\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010kR\u0018\u0010p\u001a\u0004\u0018\u00010m8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010oR\"\u0010v\u001a\u00020m8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bq\u0010!\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR\u0018\u0010x\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010dR\u0014\u0010{\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\by\u0010zR\u0014\u0010~\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b|\u0010}R\u0014\u0010\u007f\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bT\u0010}¨\u0006\u0081\u0001"}, m31665d2 = {"Lko/m;", "Lko/w;", "Lfn/x;", "governmentIdFeed", "Lcom/withpersona/sdk2/camera/b;", "cameraPreview", "Lgo/e;", "featureFlagManager", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;", "initialRendering", "Landroid/content/Context;", "context", "Landroid/view/ViewGroup;", "container", "<init>", "(Lfn/x;Lcom/withpersona/sdk2/camera/b;Lgo/e;Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;Landroid/content/Context;Landroid/view/ViewGroup;)V", "", "showFinalizeUi", "", "K", "(Z)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "w", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;)Lkotlin/Unit;", "Landroid/view/View;", "", "alpha", "u", "(Landroid/view/View;F)V", "P", "()V", "N", "I", "F", "playSideTransition", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "captureSide", "Lio/k2;", "overlayAssets", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "iconAsset", "", "messageText", "Q", "(ZLcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;Lio/k2;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Ljava/lang/String;)Z", "L", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;Lio/k2;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Ljava/lang/String;)V", "hintText", "overlay", "Landroid/widget/TextView;", "overlayText", "O", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;Landroid/view/View;Landroid/widget/TextView;)V", "a", "scanInstructionsText", "disclaimerText", "titleText", "descriptionText", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b$a;", "captureButtonState", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;", "overlayImage", "waitingOnWebRtcSetup", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "navigationState", "navBarTitle", "Lmo/i;", "captureTipsViewModel", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;", "assetConfig", "Lkotlin/Function0;", "onBackClick", "onCancelClick", "Lkotlin/Function1;", "onFlashlightToggleClick", "onCaptureClick", "onCaptureTipsClick", "onViewfinderClick", "watermarkText", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b$a;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;Lio/k2;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;ZZLcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Ljava/lang/String;Lmo/i;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Ljava/lang/String;)V", "e", "Lfn/x;", "b", "Lcom/withpersona/sdk2/camera/b;", "Lgo/e;", "Lno/b;", "d", "Lno/b;", "binding", "Lmo/h;", "Lmo/h;", "captureTipsBottomSheetController", "Lfn/g;", "f", "Lfn/g;", "()Lfn/g;", "cameraController", "g", "Landroid/view/View;", "currentOverlayAssetView", "Lko/m$a;", "h", "Lko/m$a;", "animationState", "i", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "lastCaptureSide", "", "j", "Ljava/lang/Integer;", "lockedOverlayGuideHeight", "k", "getCurrentHintAnimation", "()I", "setCurrentHintAnimation", "(I)V", "currentHintAnimation", "l", "customOverlayView", "E", "()Z", "isTransitioning", "getRoot", "()Landroid/view/View;", "root", "pointOfInterestView", "m", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C7654m implements InterfaceC7664w {

    /* JADX INFO: renamed from: n */
    public static final int f29232n;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C5717x governmentIdFeed;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C3402b cameraPreview;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final C6159e featureFlagManager;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final C9526b binding;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final C8606h captureTipsBottomSheetController;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC5683g cameraController;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public View currentOverlayAssetView;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public a animationState;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public IdConfig.EnumC3514b lastCaptureSide;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public Integer lockedOverlayGuideHeight;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public int currentHintAnimation;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public View customOverlayView;

    /* JADX INFO: renamed from: ko.m$a */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m31665d2 = {"Lko/m$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public enum a {
        INITIAL,
        ENTRY_ANIMATING,
        IDLE,
        TRANSITION_COLLAPSING,
        TRANSITION_EXPANDING;


        /* JADX INFO: renamed from: g */
        public static final /* synthetic */ InterfaceC10707a f29251g = C10708b.m40805a(m31623a());
    }

    /* JADX INFO: renamed from: ko.m$c */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f29252a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f29253b;

        static {
            int[] iArr = new int[Screen.C3527b.a.values().length];
            try {
                iArr[Screen.C3527b.a.Disabled.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Screen.C3527b.a.Enabled.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Screen.C3527b.a.Hidden.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f29252a = iArr;
            int[] iArr2 = new int[IdConfig.EnumC3514b.values().length];
            try {
                iArr2[IdConfig.EnumC3514b.Front.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[IdConfig.EnumC3514b.FrontOrBack.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[IdConfig.EnumC3514b.PassportSignature.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[IdConfig.EnumC3514b.Back.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[IdConfig.EnumC3514b.BarcodePdf417.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            f29253b = iArr2;
        }
    }

    /* JADX INFO: renamed from: ko.m$d */
    @Metadata(m31664d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m31665d2 = {"ko/m$d", "Landroidx/lifecycle/f;", "Landroidx/lifecycle/s;", "owner", "", "onPause", "(Landroidx/lifecycle/s;)V", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class d implements InterfaceC0954f {
        public d() {
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
        public void onPause(InterfaceC0980s owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            C7654m.this.m31611N();
        }

        @Override // androidx.p616lifecycle.InterfaceC0954f
        public void onResume(InterfaceC0980s interfaceC0980s) {
            super.onResume(interfaceC0980s);
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

    static {
        f29232n = Build.VERSION.SDK_INT >= 30 ? 16 : 3;
    }

    public C7654m(@NotNull C5717x governmentIdFeed, @NotNull C3402b cameraPreview, @NotNull C6159e featureFlagManager, @NotNull Screen.C3527b initialRendering, @NotNull Context context, @Nullable ViewGroup viewGroup) {
        Context context2;
        Intrinsics.checkNotNullParameter(governmentIdFeed, "governmentIdFeed");
        Intrinsics.checkNotNullParameter(cameraPreview, "cameraPreview");
        Intrinsics.checkNotNullParameter(featureFlagManager, "featureFlagManager");
        Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
        Intrinsics.checkNotNullParameter(context, "context");
        this.governmentIdFeed = governmentIdFeed;
        this.cameraPreview = cameraPreview;
        this.featureFlagManager = featureFlagManager;
        this.animationState = a.INITIAL;
        C9526b c9526bM37614c = C9526b.m37614c(LayoutInflater.from((viewGroup == null || (context2 = viewGroup.getContext()) == null) ? context : context2).cloneInContext(context));
        Intrinsics.checkNotNullExpressionValue(c9526bM37614c, "inflate(...)");
        Camera2PreviewView camera2Preview = c9526bM37614c.f34329c;
        Intrinsics.checkNotNullExpressionValue(camera2Preview, "camera2Preview");
        PreviewView previewView = c9526bM37614c.f34317A;
        Intrinsics.checkNotNullExpressionValue(previewView, "previewView");
        this.cameraController = C3539b.m17505a(initialRendering, context, cameraPreview, camera2Preview, previewView, governmentIdFeed, featureFlagManager.m27145a(C6153a0.f23514a));
        this.binding = c9526bM37614c;
        FrameLayout frameLayoutM37616b = c9526bM37614c.getRoot();
        Intrinsics.checkNotNullExpressionValue(frameLayoutM37616b, "getRoot(...)");
        this.captureTipsBottomSheetController = new C8606h(frameLayoutM37616b);
    }

    /* JADX INFO: renamed from: A */
    public static final Unit m31581A(Function0 function0) {
        function0.invoke();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: B */
    public static final Unit m31582B(Function0 function0) {
        function0.invoke();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: C */
    public static final void m31583C(Function1 function1, CompoundButton compoundButton, boolean z10) {
        Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
        function1.invoke(Boolean.valueOf(z10));
    }

    /* JADX INFO: renamed from: D */
    public static final void m31584D(Function0 function0, View view) {
        function0.invoke();
    }

    /* JADX INFO: renamed from: G */
    public static final Unit m31585G(final C7654m c7654m, C9526b c9526b) {
        a aVar = c7654m.animationState;
        a aVar2 = a.INITIAL;
        if (aVar != aVar2) {
            return Unit.f29331a;
        }
        c7654m.animationState = a.ENTRY_ANIMATING;
        int height = c9526b.f34344r.getHeight() + c9526b.f34345s.getHeight();
        int height2 = c9526b.f34345s.getHeight();
        ConstraintLayout overlayHint = c9526b.f34345s;
        Intrinsics.checkNotNullExpressionValue(overlayHint, "overlayHint");
        boolean z10 = overlayHint.getVisibility() == 0 && c9526b.f34345s.getHeight() == 0;
        if (height == 0 || z10) {
            c7654m.animationState = aVar2;
            return Unit.f29331a;
        }
        float f10 = height;
        float f11 = -(f10 / 2.0f);
        float f12 = height2 / f10;
        c9526b.f34345s.setTranslationY(f11);
        c9526b.f34320D.setTranslationY(f11);
        c9526b.f34344r.setTranslationY(f11);
        ImageView imageView = c9526b.f34344r;
        imageView.setPivotY(imageView.getHeight());
        ScanningView scanningView = c9526b.f34320D;
        scanningView.setPivotY(scanningView.getHeight());
        c9526b.f34320D.setScaleY(f12);
        FrameLayout frameLayoutM37616b = c7654m.binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(frameLayoutM37616b, "getRoot(...)");
        C12543z.m46890b(frameLayoutM37616b, new Function0() { // from class: ko.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C7654m.m31586H(this.f29210a);
            }
        });
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: H */
    public static final Unit m31586H(C7654m c7654m) {
        c7654m.m31608I();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: J */
    public static final void m31587J(C9526b c9526b, C7654m c7654m) {
        c9526b.f34320D.setScanningAnimationEnabled(true);
        c7654m.animationState = a.IDLE;
        c9526b.f34350x.setVisibility(0);
        c9526b.f34350x.animate().alpha(1.0f).setDuration(200L).start();
    }

    /* JADX INFO: renamed from: M */
    public static final void m31588M(C7654m c7654m, IdConfig.EnumC3514b enumC3514b, RemoteImage remoteImage, C9526b c9526b, OverlayAssets overlayAssets, String str) {
        c7654m.animationState = a.TRANSITION_EXPANDING;
        c7654m.lastCaptureSide = enumC3514b;
        if (remoteImage != null) {
            View view = c7654m.currentOverlayAssetView;
            if (view != null) {
                c9526b.f34347u.removeView(view);
            }
            ConstraintLayout overlayIconContainer = c9526b.f34347u;
            Intrinsics.checkNotNullExpressionValue(overlayIconContainer, "overlayIconContainer");
            c7654m.currentOverlayAssetView = C8243c.m33618f(remoteImage, overlayIconContainer, false, 2, null);
            c9526b.f34346t.setVisibility(8);
        } else if (c7654m.currentHintAnimation != overlayAssets.getHintAnimation()) {
            c7654m.currentHintAnimation = overlayAssets.getHintAnimation();
            c9526b.f34346t.setAnimation(overlayAssets.getHintAnimation());
            c9526b.f34346t.setVisibility(0);
        }
        c9526b.f34344r.setImageResource(overlayAssets.getGuideDrawable());
        c9526b.f34348v.setText(str);
        c7654m.m31608I();
    }

    /* JADX INFO: renamed from: v */
    public static final void m31602v(float f10, View view) {
        if (f10 == 0.0f) {
            view.setVisibility(4);
        }
    }

    /* JADX INFO: renamed from: x */
    public static final void m31603x(Function0 function0, View view) {
        function0.invoke();
    }

    /* JADX INFO: renamed from: y */
    public static final void m31604y(Function0 function0, C7654m c7654m, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, InterfaceC8607i interfaceC8607i, NextStep.GovernmentId.AssetConfig.CapturePage capturePage, View view) {
        function0.invoke();
        c7654m.captureTipsBottomSheetController.m34649l(governmentIdStepStyle, (BottomSheetCaptureTipsViewModel) interfaceC8607i, capturePage);
    }

    /* JADX INFO: renamed from: z */
    public static final Unit m31605z(C7654m c7654m, C4352y4 c4352y4, C9526b c9526b) {
        View view = c7654m.customOverlayView;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.C0513b c0513b = (ConstraintLayout.C0513b) layoutParams;
            ((ViewGroup.MarginLayoutParams) c0513b).height = 0;
            ((ViewGroup.MarginLayoutParams) c0513b).width = 0;
            c0513b.f1998i = c9526b.f34344r.getId();
            c0513b.f2004l = c9526b.f34344r.getId();
            c0513b.f2020t = c9526b.f34344r.getId();
            c0513b.f2024v = c9526b.f34344r.getId();
            view.setLayoutParams(c0513b);
        }
        c4352y4.m22001c();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: E */
    public final boolean m31606E() {
        a aVar = this.animationState;
        return aVar == a.TRANSITION_COLLAPSING || aVar == a.TRANSITION_EXPANDING;
    }

    /* JADX INFO: renamed from: F */
    public final void m31607F() {
        if (this.animationState != a.INITIAL) {
            return;
        }
        final C9526b c9526b = this.binding;
        View overlay = c9526b.f34343q;
        Intrinsics.checkNotNullExpressionValue(overlay, "overlay");
        C12543z.m46890b(overlay, new Function0() { // from class: ko.l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C7654m.m31585G(this.f29229a, c9526b);
            }
        });
    }

    /* JADX INFO: renamed from: I */
    public final void m31608I() {
        final C9526b c9526b = this.binding;
        c9526b.f34344r.animate().scaleY(1.0f).translationY(0.0f).setDuration(200L).withEndAction(new Runnable() { // from class: ko.b
            @Override // java.lang.Runnable
            public final void run() {
                C7654m.m31587J(c9526b, this);
            }
        }).start();
        c9526b.f34345s.animate().translationY(0.0f).setDuration(200L).start();
        c9526b.f34320D.animate().scaleY(1.0f).translationY(0.0f).setDuration(200L).start();
    }

    /* JADX INFO: renamed from: K */
    public final void m31609K(boolean showFinalizeUi) {
        C9526b c9526b = this.binding;
        if (showFinalizeUi) {
            View previewDim = c9526b.f34351y;
            Intrinsics.checkNotNullExpressionValue(previewDim, "previewDim");
            m31621u(previewDim, 0.66f);
            LottieAnimationView scanningAnimation = c9526b.f34319C;
            Intrinsics.checkNotNullExpressionValue(scanningAnimation, "scanningAnimation");
            m31621u(scanningAnimation, 0.0f);
            ImageView overlayGuide = c9526b.f34344r;
            Intrinsics.checkNotNullExpressionValue(overlayGuide, "overlayGuide");
            m31621u(overlayGuide, 0.0f);
            ConstraintLayout overlayHint = c9526b.f34345s;
            Intrinsics.checkNotNullExpressionValue(overlayHint, "overlayHint");
            m31621u(overlayHint, 0.0f);
            ProgressBar progressBar = c9526b.f34318B;
            Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
            m31621u(progressBar, 1.0f);
            if (this.animationState == a.IDLE) {
                c9526b.f34320D.setScanningAnimationEnabled(false);
                return;
            }
            return;
        }
        View previewDim2 = c9526b.f34351y;
        Intrinsics.checkNotNullExpressionValue(previewDim2, "previewDim");
        m31621u(previewDim2, 0.0f);
        LottieAnimationView scanningAnimation2 = c9526b.f34319C;
        Intrinsics.checkNotNullExpressionValue(scanningAnimation2, "scanningAnimation");
        m31621u(scanningAnimation2, 1.0f);
        ImageView overlayGuide2 = c9526b.f34344r;
        Intrinsics.checkNotNullExpressionValue(overlayGuide2, "overlayGuide");
        m31621u(overlayGuide2, 1.0f);
        ImageView overlayGuide3 = c9526b.f34344r;
        Intrinsics.checkNotNullExpressionValue(overlayGuide3, "overlayGuide");
        m31621u(overlayGuide3, 1.0f);
        ProgressBar progressBar2 = c9526b.f34318B;
        Intrinsics.checkNotNullExpressionValue(progressBar2, "progressBar");
        m31621u(progressBar2, 0.0f);
        if (this.animationState == a.IDLE) {
            c9526b.f34320D.setScanningAnimationEnabled(true);
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m31610L(final IdConfig.EnumC3514b captureSide, final OverlayAssets overlayAssets, final RemoteImage iconAsset, final String messageText) {
        final C9526b c9526b = this.binding;
        this.animationState = a.TRANSITION_COLLAPSING;
        Integer num = this.lockedOverlayGuideHeight;
        int iIntValue = num != null ? num.intValue() : c9526b.f34344r.getHeight();
        this.lockedOverlayGuideHeight = Integer.valueOf(iIntValue);
        ImageView overlayGuide = c9526b.f34344r;
        Intrinsics.checkNotNullExpressionValue(overlayGuide, "overlayGuide");
        ViewGroup.LayoutParams layoutParams = overlayGuide.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.C0513b c0513b = (ConstraintLayout.C0513b) layoutParams;
        ((ViewGroup.MarginLayoutParams) c0513b).height = iIntValue;
        overlayGuide.setLayoutParams(c0513b);
        c9526b.f34350x.setVisibility(4);
        c9526b.f34350x.setAlpha(0.0f);
        c9526b.f34320D.setScanningAnimationEnabled(false);
        int height = c9526b.f34344r.getHeight() + c9526b.f34345s.getHeight();
        int height2 = c9526b.f34345s.getHeight();
        if (height == 0 || height2 == 0) {
            this.animationState = a.IDLE;
            return;
        }
        float f10 = height;
        float f11 = -(f10 / 2.0f);
        float f12 = height2 / f10;
        ImageView imageView = c9526b.f34344r;
        imageView.setPivotY(imageView.getHeight());
        ScanningView scanningView = c9526b.f34320D;
        scanningView.setPivotY(scanningView.getHeight());
        c9526b.f34344r.animate().scaleY(0.0f).translationY(f11).setDuration(200L).withEndAction(new Runnable() { // from class: ko.j
            @Override // java.lang.Runnable
            public final void run() {
                C7654m.m31588M(this.f29221a, captureSide, iconAsset, c9526b, overlayAssets, messageText);
            }
        }).start();
        c9526b.f34345s.animate().translationY(f11).setDuration(200L).start();
        c9526b.f34320D.animate().scaleY(f12).translationY(f11).setDuration(200L).start();
    }

    /* JADX INFO: renamed from: N */
    public final void m31611N() {
        C9526b c9526b = this.binding;
        c9526b.f34344r.animate().cancel();
        c9526b.f34345s.animate().cancel();
        c9526b.f34320D.animate().cancel();
        c9526b.f34350x.animate().cancel();
        c9526b.f34344r.setScaleY(1.0f);
        c9526b.f34344r.setTranslationY(0.0f);
        c9526b.f34345s.setTranslationY(0.0f);
        c9526b.f34320D.setScaleY(1.0f);
        c9526b.f34320D.setTranslationY(0.0f);
        c9526b.f34350x.setAlpha(1.0f);
        c9526b.f34350x.setVisibility(0);
        this.animationState = a.IDLE;
        c9526b.f34320D.setScanningAnimationEnabled(true);
    }

    /* JADX INFO: renamed from: O */
    public final void m31612O(String hintText, IdConfig.EnumC3514b captureSide, View overlay, TextView overlayText) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(16384);
        if (hintText != null) {
            accessibilityEventObtain.getText().add(hintText);
        } else {
            int i10 = c.f29253b[captureSide.ordinal()];
            if (i10 == 1 || i10 == 2 || i10 == 3) {
                accessibilityEventObtain.getText().add(overlayText.getContext().getString(C12244g.f43270z));
            } else if (i10 == 4) {
                accessibilityEventObtain.getText().add(overlayText.getContext().getString(C12244g.f43268x));
            } else {
                if (i10 != 5) {
                    throw new C7345l();
                }
                accessibilityEventObtain.getText().add(overlayText.getContext().getString(C12244g.f43269y));
            }
            accessibilityEventObtain.getText().add(overlay.getContext().getString(C12244g.f43216A));
        }
        overlayText.getParent().requestSendAccessibilityEvent(overlayText, accessibilityEventObtain);
    }

    /* JADX INFO: renamed from: P */
    public final void m31613P() {
        C9526b c9526b = this.binding;
        c9526b.f34344r.setScaleY(0.0f);
        c9526b.f34350x.setAlpha(0.0f);
        c9526b.f34320D.setScanningAnimationEnabled(false);
    }

    /* JADX INFO: renamed from: Q */
    public final boolean m31614Q(boolean playSideTransition, IdConfig.EnumC3514b captureSide, OverlayAssets overlayAssets, RemoteImage iconAsset, String messageText) {
        IdConfig.EnumC3514b enumC3514b = this.lastCaptureSide;
        if (enumC3514b == null || enumC3514b == captureSide || m31606E() || !playSideTransition) {
            this.lastCaptureSide = captureSide;
            return false;
        }
        m31610L(captureSide, overlayAssets, iconAsset, messageText);
        return true;
    }

    @Override // p251ko.InterfaceC7664w
    /* JADX INFO: renamed from: a */
    public void mo31615a() {
        ThemeableLottieAnimationView themeableLottieAnimationView = this.binding.f34346t;
        int color = Color.parseColor("#43957D");
        Context context = this.binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        themeableLottieAnimationView.m20474F(color, C7288z.m30328d(context, C6589a.f25047z, null, false, 6, null));
        FrameLayout innerContentView = this.binding.f34341o;
        Intrinsics.checkNotNullExpressionValue(innerContentView, "innerContentView");
        C12524g.m46873d(innerContentView, false, false, false, false, 15, null);
        m31613P();
        Context context2 = this.binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        C7259g.m30275i(context2).mo4656a().mo4935a(new d());
    }

    @Override // p251ko.InterfaceC7664w
    @NotNull
    /* JADX INFO: renamed from: b */
    public View mo31616b() {
        View overlay = this.binding.f34343q;
        Intrinsics.checkNotNullExpressionValue(overlay, "overlay");
        return overlay;
    }

    @Override // p251ko.InterfaceC7664w
    /* JADX INFO: renamed from: c */
    public void mo31617c(@NotNull String messageText, @NotNull String scanInstructionsText, @NotNull String disclaimerText, @NotNull String titleText, @NotNull String descriptionText, @Nullable String hintText, @NotNull Screen.C3527b.a captureButtonState, @NotNull IdConfig.EnumC3514b captureSide, @NotNull Screen.Overlay overlayImage, @NotNull OverlayAssets overlayAssets, @Nullable RemoteImage iconAsset, boolean waitingOnWebRtcSetup, boolean showFinalizeUi, @NotNull NavigationState navigationState, @Nullable String navBarTitle, @Nullable final InterfaceC8607i captureTipsViewModel, @Nullable final NextStep.GovernmentId.AssetConfig.CapturePage assetConfig, boolean playSideTransition, @NotNull final Function0<Unit> onBackClick, @NotNull final Function0<Unit> onCancelClick, @NotNull final Function1<? super Boolean, Unit> onFlashlightToggleClick, @NotNull final Function0<Unit> onCaptureClick, @NotNull final Function0<Unit> onCaptureTipsClick, @NotNull final Function0<Unit> onViewfinderClick, @Nullable final StepStyles.GovernmentIdStepStyle styles, @Nullable String watermarkText) {
        final C7654m c7654m;
        RemoteImage remoteImage;
        IdConfig.EnumC3514b enumC3514b;
        int i10;
        int i11;
        Intrinsics.checkNotNullParameter(messageText, "messageText");
        Intrinsics.checkNotNullParameter(scanInstructionsText, "scanInstructionsText");
        Intrinsics.checkNotNullParameter(disclaimerText, "disclaimerText");
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        Intrinsics.checkNotNullParameter(descriptionText, "descriptionText");
        Intrinsics.checkNotNullParameter(captureButtonState, "captureButtonState");
        Intrinsics.checkNotNullParameter(captureSide, "captureSide");
        Intrinsics.checkNotNullParameter(overlayImage, "overlayImage");
        Intrinsics.checkNotNullParameter(overlayAssets, "overlayAssets");
        Intrinsics.checkNotNullParameter(navigationState, "navigationState");
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Intrinsics.checkNotNullParameter(onCancelClick, "onCancelClick");
        Intrinsics.checkNotNullParameter(onFlashlightToggleClick, "onFlashlightToggleClick");
        Intrinsics.checkNotNullParameter(onCaptureClick, "onCaptureClick");
        Intrinsics.checkNotNullParameter(onCaptureTipsClick, "onCaptureTipsClick");
        Intrinsics.checkNotNullParameter(onViewfinderClick, "onViewfinderClick");
        final C9526b c9526b = this.binding;
        Context context = c9526b.getRoot().getContext();
        if (waitingOnWebRtcSetup) {
            c9526b.f34331e.setVisibility(4);
            c9526b.f34330d.setVisibility(0);
            c7654m = this;
            enumC3514b = captureSide;
            remoteImage = iconAsset;
        } else {
            c9526b.f34331e.setVisibility(0);
            c9526b.f34330d.setVisibility(4);
            getCameraController().getPreviewView().setVisibility(0);
            m31607F();
            c7654m = this;
            remoteImage = iconAsset;
            enumC3514b = captureSide;
            if (c7654m.m31614Q(playSideTransition, enumC3514b, overlayAssets, remoteImage, messageText)) {
                return;
            }
        }
        if (!c7654m.m31606E()) {
            c9526b.f34348v.setText(messageText);
        }
        c9526b.f34336j.setText(disclaimerText);
        c9526b.f34324H.setText(titleText);
        c9526b.f34324H.setVisibility(StringsKt.m32182p0(titleText) ? 8 : 0);
        c9526b.f34335i.setText(descriptionText);
        c9526b.f34335i.setVisibility(StringsKt.m32182p0(descriptionText) ? 8 : 0);
        if (StringsKt.m32182p0(disclaimerText)) {
            c9526b.f34337k.setVisibility(8);
            i10 = 0;
        } else {
            LinearLayout linearLayout = c9526b.f34337k;
            i10 = 0;
            linearLayout.setVisibility(0);
        }
        if (hintText == null || waitingOnWebRtcSetup) {
            c9526b.f34340n.setVisibility(8);
        } else {
            c9526b.f34340n.setVisibility(i10);
            c9526b.f34340n.setText(hintText);
        }
        Context context2 = c9526b.f34348v.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        if (C7259g.m30273g(context2) && c9526b.f34348v.getParent() != null) {
            View overlay = c9526b.f34343q;
            Intrinsics.checkNotNullExpressionValue(overlay, "overlay");
            TextView overlayText = c9526b.f34348v;
            Intrinsics.checkNotNullExpressionValue(overlayText, "overlayText");
            c7654m.m31612O(hintText, enumC3514b, overlay, overlayText);
        }
        int i12 = c.f29252a[captureButtonState.ordinal()];
        if (i12 == 1) {
            c9526b.f34332f.setEnabled(false);
        } else if (i12 == 2) {
            c9526b.f34332f.setVisibility(0);
            c9526b.f34332f.setEnabled(true);
        } else {
            if (i12 != 3) {
                throw new C7345l();
            }
            c9526b.f34332f.setVisibility(4);
        }
        Intrinsics.checkNotNull(context);
        if (C7288z.m30326b(context, C12238a.f43175h, null, false, false, 14, null)) {
            c9526b.f34348v.setGravity(17);
            TextView overlayText2 = c9526b.f34348v;
            Intrinsics.checkNotNullExpressionValue(overlayText2, "overlayText");
            ViewGroup.LayoutParams layoutParams = overlayText2.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginStart(0);
            overlayText2.setLayoutParams(marginLayoutParams);
        }
        Integer numM30330f = C7288z.m30330f(context, C12238a.f43183p, null, false, 6, null);
        c9526b.f34336j.setCompoundDrawablesRelativeWithIntrinsicBounds(numM30330f != null ? numM30330f.intValue() : C6891m2.f27008l, 0, 0, 0);
        if (!c7654m.m31606E()) {
            if (remoteImage != null) {
                if (c7654m.currentOverlayAssetView == null) {
                    ConstraintLayout overlayIconContainer = c9526b.f34347u;
                    Intrinsics.checkNotNullExpressionValue(overlayIconContainer, "overlayIconContainer");
                    c7654m.currentOverlayAssetView = C8243c.m33618f(remoteImage, overlayIconContainer, false, 2, null);
                    c9526b.f34346t.setVisibility(8);
                }
            } else if (c7654m.currentHintAnimation != overlayAssets.getHintAnimation()) {
                c7654m.currentHintAnimation = overlayAssets.getHintAnimation();
                c9526b.f34346t.setAnimation(overlayAssets.getHintAnimation());
                c9526b.f34346t.setVisibility(0);
            }
            c9526b.f34344r.setImageResource(overlayAssets.getGuideDrawable());
        }
        Integer numM30330f2 = C7288z.m30330f(context, C12238a.f43179l, null, false, 6, null);
        if (numM30330f2 != null) {
            c9526b.f34319C.setAnimation(numM30330f2.intValue());
            c9526b.f34343q.setVisibility(0);
            c9526b.f34320D.setVisibility(8);
        } else {
            c9526b.f34319C.setVisibility(4);
            c9526b.f34343q.setVisibility(4);
            c9526b.f34320D.setVisibility(0);
        }
        c9526b.f34343q.setBackground(C3571o.m17729a(context, C12238a.f43174g));
        if ((overlayImage instanceof Screen.Overlay.Custom) && c7654m.customOverlayView == null) {
            final C4352y4 c4352y4 = new C4352y4(context);
            Screen.Overlay.Custom custom = (Screen.Overlay.Custom) overlayImage;
            View viewM21807n = C4268k4.m21807n(custom.getCustomImage(), c4352y4, custom.getConfig());
            c7654m.customOverlayView = viewM21807n;
            c9526b.f34331e.addView(viewM21807n);
            c9526b.f34319C.setVisibility(4);
            c9526b.f34344r.setVisibility(4);
            View view = c7654m.customOverlayView;
            if (view != null) {
                C12543z.m46890b(view, new Function0() { // from class: ko.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C7654m.m31605z(this.f29201a, c4352y4, c9526b);
                    }
                });
            }
        }
        if (styles != 0) {
            c7654m.m31622w(styles);
        }
        Function0 function0 = new Function0() { // from class: ko.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C7654m.m31581A(onBackClick);
            }
        };
        Function0 function1 = new Function0() { // from class: ko.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C7654m.m31582B(onCancelClick);
            }
        };
        Pi2NavigationBar navigationBar = c9526b.f34342p;
        Intrinsics.checkNotNullExpressionValue(navigationBar, "navigationBar");
        FrameLayout frameLayoutM37616b = c9526b.getRoot();
        Intrinsics.checkNotNullExpressionValue(frameLayoutM37616b, "getRoot(...)");
        C6966c.m29335e(navigationState, function0, function1, null, navigationBar, frameLayoutM37616b, styles != 0 ? C5199h.m24132h(styles) : null, navBarTitle, styles != 0 ? styles.getNavBarTitleStyleValue() : null, 8, null);
        c9526b.f34339m.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: ko.f
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                C7654m.m31583C(onFlashlightToggleClick, compoundButton, z10);
            }
        });
        c9526b.f34332f.setOnClickListener(new View.OnClickListener() { // from class: ko.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C7654m.m31584D(onCaptureClick, view2);
            }
        });
        c7654m.getCameraController().getPreviewView().setOnClickListener(new View.OnClickListener() { // from class: ko.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C7654m.m31603x(onViewfinderClick, view2);
            }
        });
        c7654m.m31609K(showFinalizeUi);
        StaticCaptureTipsView staticCaptureTips = c7654m.binding.f34323G;
        Intrinsics.checkNotNullExpressionValue(staticCaptureTips, "staticCaptureTips");
        staticCaptureTips.setVisibility(8);
        if (captureTipsViewModel instanceof StaticCaptureTipsViewModel) {
            staticCaptureTips.setVisibility(0);
            StaticCaptureTipsViewModel staticCaptureTipsViewModel = (StaticCaptureTipsViewModel) captureTipsViewModel;
            staticCaptureTips.m17511a(staticCaptureTipsViewModel.getTitle(), staticCaptureTipsViewModel.getSubtext(), staticCaptureTipsViewModel.getIconAsset(), styles);
            c9526b.f34334h.setVisibility(8);
        } else if (captureTipsViewModel instanceof BottomSheetCaptureTipsViewModel) {
            BottomSheetCaptureTipsViewModel bottomSheetCaptureTipsViewModel = (BottomSheetCaptureTipsViewModel) captureTipsViewModel;
            if (bottomSheetCaptureTipsViewModel.getHelpButtonText().length() == 0) {
                c9526b.f34334h.setVisibility(4);
            } else {
                c9526b.f34334h.setVisibility(0);
                c9526b.f34334h.setText(bottomSheetCaptureTipsViewModel.getHelpButtonText());
                final C7654m c7654m2 = c7654m;
                c9526b.f34334h.setOnClickListener(new View.OnClickListener() { // from class: ko.i
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        C7654m.m31604y(onCaptureTipsClick, c7654m2, styles, captureTipsViewModel, assetConfig, view2);
                    }
                });
            }
        } else {
            c9526b.f34334h.setVisibility(4);
        }
        c7654m.captureTipsBottomSheetController.m34650o();
        if (messageText.length() == 0) {
            c9526b.f34345s.setVisibility(8);
            i11 = 0;
        } else {
            i11 = 0;
            c9526b.f34345s.setVisibility(0);
        }
        if (watermarkText == null || StringsKt.m32182p0(watermarkText)) {
            c9526b.f34326J.setVisibility(8);
        } else {
            c9526b.f34326J.setText(watermarkText);
            c9526b.f34326J.setVisibility(i11);
        }
    }

    @Override // p251ko.InterfaceC7664w
    /* JADX INFO: renamed from: e */
    public void mo31618e() {
        C9526b c9526b = this.binding;
        c9526b.getRoot().setHapticFeedbackEnabled(true);
        c9526b.getRoot().performHapticFeedback(f29232n, 2);
    }

    @Override // p251ko.InterfaceC7664w
    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public InterfaceC5683g getCameraController() {
        return this.cameraController;
    }

    @Override // p251ko.InterfaceC7664w
    @Nullable
    /* JADX INFO: renamed from: g */
    public Object mo31620g(@NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        return super.mo31620g(interfaceC9557b);
    }

    @Override // p251ko.InterfaceC7664w
    @NotNull
    public View getRoot() {
        FrameLayout frameLayoutM37616b = this.binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(frameLayoutM37616b, "getRoot(...)");
        return frameLayoutM37616b;
    }

    /* JADX INFO: renamed from: u */
    public final void m31621u(final View view, final float f10) {
        if (view.getAlpha() == f10) {
            if (f10 <= 0.0f) {
                view.setVisibility(4);
            }
        } else {
            if (view.getVisibility() != 0) {
                if (f10 <= 0.0f) {
                    return;
                }
                view.setVisibility(0);
                view.setAlpha(0.0f);
            }
            view.animate().alpha(f10).withEndAction(new Runnable() { // from class: ko.k
                @Override // java.lang.Runnable
                public final void run() {
                    C7654m.m31602v(f10, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: w */
    public final Unit m31622w(StepStyles.GovernmentIdStepStyle styles) {
        StyleElements.FontWeight fontWeightValue;
        StepStyles.StepPaddingStyleContainer screen;
        StyleElements.SizeSet base;
        StyleElements.Size right;
        Double dp2;
        StepStyles.StepPaddingStyleContainer screen2;
        StyleElements.SizeSet base2;
        StyleElements.Size left;
        Double dp3;
        StepStyles.StepTextBasedComponentStyleContainer base3;
        TextBasedComponentStyle base4;
        StepStyles.StepTextBasedComponentStyleContainer base5;
        TextBasedComponentStyle base6;
        C9526b c9526b = this.binding;
        float fM30285a = (float) C7265j.m30285a(8.0d);
        int iM30285a = (int) C7265j.m30285a(3.0d);
        TextBasedComponentStyle titleStyleValue = styles.getTitleStyleValue();
        if (titleStyleValue != null) {
            TextView title = this.binding.f34324H;
            Intrinsics.checkNotNullExpressionValue(title, "title");
            C7304h0.m30392l(title, titleStyleValue, null, 2, null);
            this.binding.f34324H.setTextColor(-1);
        }
        TextBasedComponentStyle governmentIdCaptureDescriptionStyle = styles.getGovernmentIdCaptureDescriptionStyle();
        if (governmentIdCaptureDescriptionStyle != null) {
            TextView description = this.binding.f34335i;
            Intrinsics.checkNotNullExpressionValue(description, "description");
            C7304h0.m30392l(description, governmentIdCaptureDescriptionStyle, null, 2, null);
            if (governmentIdCaptureDescriptionStyle.getTextColorValue() == null) {
                this.binding.f34335i.setTextColor(-1);
            }
        }
        Integer governmentIdCaptureFeedBoxBorderColorValue = styles.getGovernmentIdCaptureFeedBoxBorderColorValue();
        if (governmentIdCaptureFeedBoxBorderColorValue != null) {
            c9526b.f34320D.setBorderColor(governmentIdCaptureFeedBoxBorderColorValue.intValue());
        }
        Double governmentIdCaptureFeedBoxBorderRadiusValue = styles.getGovernmentIdCaptureFeedBoxBorderRadiusValue();
        if (governmentIdCaptureFeedBoxBorderRadiusValue != null) {
            fM30285a = (float) C7265j.m30285a(governmentIdCaptureFeedBoxBorderRadiusValue.doubleValue());
        }
        Double governmentIdCaptureFeedBoxBorderWidthValue = styles.getGovernmentIdCaptureFeedBoxBorderWidthValue();
        if (governmentIdCaptureFeedBoxBorderWidthValue != null) {
            iM30285a = (int) Math.ceil(C7265j.m30285a(governmentIdCaptureFeedBoxBorderWidthValue.doubleValue()));
            ImageView imageView = c9526b.f34344r;
            imageView.setPadding(imageView.getPaddingLeft(), ((int) C7265j.m30285a(8.0d)) + iM30285a, c9526b.f34344r.getPaddingRight(), c9526b.f34344r.getPaddingBottom());
        }
        float f10 = iM30285a;
        c9526b.f34321E.setRadius(fM30285a + f10);
        TextBasedComponentStyle governmentIdCaptureHintTextStyle = styles.getGovernmentIdCaptureHintTextStyle();
        if (governmentIdCaptureHintTextStyle != null) {
            TextView overlayText = this.binding.f34348v;
            Intrinsics.checkNotNullExpressionValue(overlayText, "overlayText");
            C7304h0.m30391k(overlayText, governmentIdCaptureHintTextStyle, C7700p0.m31904c(EnumC7298e0.LineHeight));
        }
        TextView disclaimer = this.binding.f34336j;
        Intrinsics.checkNotNullExpressionValue(disclaimer, "disclaimer");
        StepStyles.GovernmentIdStepTextBasedComponentStyle textStyle = styles.getTextStyle();
        String fontNameValue = (textStyle == null || (base5 = textStyle.getBase()) == null || (base6 = base5.getBase()) == null) ? null : base6.getFontNameValue();
        StepStyles.GovernmentIdStepTextBasedComponentStyle textStyle2 = styles.getTextStyle();
        if (textStyle2 == null || (base3 = textStyle2.getBase()) == null || (base4 = base3.getBase()) == null || (fontWeightValue = base4.getFontWeightValue()) == null) {
            fontWeightValue = StyleElements.FontWeight.NORMAL;
        }
        C7304h0.m30389i(disclaimer, fontNameValue, fontWeightValue, null, 4, null);
        View view = c9526b.f34343q;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(fM30285a);
        gradientDrawable.setStroke(iM30285a, c9526b.f34320D.getBorderColor());
        view.setBackground(gradientDrawable);
        ConstraintLayout constraintLayout = c9526b.f34345s;
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(-1);
        gradientDrawable2.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, fM30285a, fM30285a, fM30285a, fM30285a});
        constraintLayout.setBackground(new InsetDrawable((Drawable) gradientDrawable2, (int) C7265j.m30285a(6.0d)));
        Integer captureHintIconStrokeColor = styles.getCaptureHintIconStrokeColor();
        if (captureHintIconStrokeColor != null) {
            this.binding.f34346t.m20474F(Color.parseColor("#000000"), captureHintIconStrokeColor.intValue());
        }
        Integer captureHintIconFillColor = styles.getCaptureHintIconFillColor();
        if (captureHintIconFillColor != null) {
            this.binding.f34346t.m20474F(Color.parseColor("#43957D"), captureHintIconFillColor.intValue());
        }
        c9526b.f34320D.setStrokeWidth(f10);
        c9526b.f34320D.setCornerRadius(fM30285a);
        Integer governmentIdCaptureFeedBoxStrokeColorValue = styles.getGovernmentIdCaptureFeedBoxStrokeColorValue();
        if (governmentIdCaptureFeedBoxStrokeColorValue != null) {
            c9526b.f34320D.setHighlightColor(governmentIdCaptureFeedBoxStrokeColorValue.intValue());
        }
        Integer capturePageHeaderIconColorValue = styles.getCapturePageHeaderIconColorValue();
        if (capturePageHeaderIconColorValue != null) {
            this.binding.f34342p.setControlsColor(capturePageHeaderIconColorValue.intValue());
        }
        StepStyles.StepPaddingStyle padding = styles.getPadding();
        if (padding != null && (screen2 = padding.getScreen()) != null && (base2 = screen2.getBase()) != null && (left = base2.getLeft()) != null && (dp3 = left.getDp()) != null) {
            this.binding.f34322F.setGuidelineBegin((int) C7265j.m30285a(dp3.doubleValue()));
        }
        StepStyles.StepPaddingStyle padding2 = styles.getPadding();
        if (padding2 == null || (screen = padding2.getScreen()) == null || (base = screen.getBase()) == null || (right = base.getRight()) == null || (dp2 = right.getDp()) == null) {
            return null;
        }
        this.binding.f34338l.setGuidelineEnd((int) C7265j.m30285a(dp2.doubleValue()));
        return Unit.f29331a;
    }
}
