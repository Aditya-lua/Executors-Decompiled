package io;

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
import ar.k4;
import ar.y4;
import com.airbnb.lottie.LottieAnimationView;
import com.withpersona.sdk2.camera.camera2.Camera2PreviewView;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.governmentid.captureTips.StaticCaptureTipsView;
import com.withpersona.sdk2.inquiry.governmentid.view.ScanningView;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import go.OverlayAssets;
import go.m2;
import hr.e0;
import hr.h0;
import ko.BottomSheetCaptureTipsViewModel;
import ko.StaticCaptureTipsViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.p0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal.http2.Http2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0014\u0018\u0000 \u0080\u00012\u00020\u0001:\u0002T6B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001c\u001a\u00020\u0012*\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0012H\u0002¢\u0006\u0004\b \u0010\u001fJ\u000f\u0010!\u001a\u00020\u0012H\u0002¢\u0006\u0004\b!\u0010\u001fJ\u000f\u0010\"\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\"\u0010\u001fJ9\u0010,\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u00102\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&2\b\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b,\u0010-J1\u0010.\u001a\u00020\u00122\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&2\b\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b.\u0010/J1\u00104\u001a\u00020\u00122\b\u00100\u001a\u0004\u0018\u00010*2\u0006\u0010%\u001a\u00020$2\u0006\u00101\u001a\u00020\u00192\u0006\u00103\u001a\u000202H\u0002¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0012H\u0016¢\u0006\u0004\b6\u0010\u001fJ\u0097\u0002\u0010P\u001a\u00020\u00122\u0006\u0010+\u001a\u00020*2\u0006\u00107\u001a\u00020*2\u0006\u00108\u001a\u00020*2\u0006\u00109\u001a\u00020*2\u0006\u0010:\u001a\u00020*2\b\u00100\u001a\u0004\u0018\u00010*2\u0006\u0010<\u001a\u00020;2\u0006\u0010%\u001a\u00020$2\u0006\u0010>\u001a\u00020=2\u0006\u0010'\u001a\u00020&2\b\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010?\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010A\u001a\u00020@2\b\u0010B\u001a\u0004\u0018\u00010*2\b\u0010D\u001a\u0004\u0018\u00010C2\b\u0010F\u001a\u0004\u0018\u00010E2\u0006\u0010#\u001a\u00020\u00102\f\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00120G2\f\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00120G2\u0012\u0010K\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00120J2\f\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00120G2\f\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00120G2\f\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00120G2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010O\u001a\u0004\u0018\u00010*H\u0016¢\u0006\u0004\bP\u0010QJ\u000f\u0010R\u001a\u00020\u0012H\u0016¢\u0006\u0004\bR\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010SR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010VR\u0014\u0010Z\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010]\u001a\u00020[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010\\R\u001a\u0010c\u001a\u00020^8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR\u0018\u0010e\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010dR\u0016\u0010i\u001a\u00020f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u0018\u0010l\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010kR\u0018\u0010p\u001a\u0004\u0018\u00010m8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010oR\"\u0010v\u001a\u00020m8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bq\u0010!\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR\u0018\u0010x\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010dR\u0014\u0010{\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\by\u0010zR\u0014\u0010~\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b|\u0010}R\u0014\u0010\u007f\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bT\u0010}¨\u0006\u0081\u0001"}, d2 = {"Lio/m;", "Lio/w;", "Ldn/x;", "governmentIdFeed", "Lcom/withpersona/sdk2/camera/b;", "cameraPreview", "Leo/e;", "featureFlagManager", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;", "initialRendering", "Landroid/content/Context;", "context", "Landroid/view/ViewGroup;", "container", "<init>", "(Ldn/x;Lcom/withpersona/sdk2/camera/b;Leo/e;Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;Landroid/content/Context;Landroid/view/ViewGroup;)V", "", "showFinalizeUi", "", "K", "(Z)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "w", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;)Lkotlin/Unit;", "Landroid/view/View;", "", "alpha", "u", "(Landroid/view/View;F)V", "P", "()V", "N", "I", "F", "playSideTransition", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "captureSide", "Lgo/k2;", "overlayAssets", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "iconAsset", "", "messageText", "Q", "(ZLcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;Lgo/k2;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Ljava/lang/String;)Z", "L", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;Lgo/k2;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Ljava/lang/String;)V", "hintText", "overlay", "Landroid/widget/TextView;", "overlayText", "O", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;Landroid/view/View;Landroid/widget/TextView;)V", "a", "scanInstructionsText", "disclaimerText", "titleText", "descriptionText", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b$a;", "captureButtonState", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;", "overlayImage", "waitingOnWebRtcSetup", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "navigationState", "navBarTitle", "Lko/i;", "captureTipsViewModel", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;", "assetConfig", "Lkotlin/Function0;", "onBackClick", "onCancelClick", "Lkotlin/Function1;", "onFlashlightToggleClick", "onCaptureClick", "onCaptureTipsClick", "onViewfinderClick", "watermarkText", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b$a;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;Lgo/k2;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;ZZLcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Ljava/lang/String;Lko/i;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Ljava/lang/String;)V", "e", "Ldn/x;", "b", "Lcom/withpersona/sdk2/camera/b;", "Leo/e;", "Llo/b;", "d", "Llo/b;", "binding", "Lko/h;", "Lko/h;", "captureTipsBottomSheetController", "Ldn/g;", "f", "Ldn/g;", "g", "()Ldn/g;", "cameraController", "Landroid/view/View;", "currentOverlayAssetView", "Lio/m$a;", "h", "Lio/m$a;", "animationState", "i", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "lastCaptureSide", "", "j", "Ljava/lang/Integer;", "lockedOverlayGuideHeight", "k", "getCurrentHintAnimation", "()I", "setCurrentHintAnimation", "(I)V", "currentHintAnimation", "l", "customOverlayView", "E", "()Z", "isTransitioning", "getRoot", "()Landroid/view/View;", "root", "pointOfInterestView", "m", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m implements w {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f21220n;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final dn.x governmentIdFeed;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.camera.b cameraPreview;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final eo.e featureFlagManager;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final lo.b binding;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ko.h captureTipsBottomSheetController;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final dn.g cameraController;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public View currentOverlayAssetView;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public a animationState;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public IdConfig.b lastCaptureSide;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Integer lockedOverlayGuideHeight;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public int currentHintAnimation;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public View customOverlayView;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lio/m$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum a {
        INITIAL,
        ENTRY_ANIMATING,
        IDLE,
        TRANSITION_COLLAPSING,
        TRANSITION_EXPANDING;


        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ ot.a f21237g = ot.b.a(a());
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21238a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[Screen.b.a.values().length];
            try {
                iArr[Screen.b.a.Disabled.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Screen.b.a.Enabled.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Screen.b.a.Hidden.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f21238a = iArr;
            int[] iArr2 = new int[IdConfig.b.values().length];
            try {
                iArr2[IdConfig.b.Front.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[IdConfig.b.FrontOrBack.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[IdConfig.b.PassportSignature.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[IdConfig.b.Back.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[IdConfig.b.BarcodePdf417.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            b = iArr2;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"io/m$d", "Landroidx/lifecycle/f;", "Landroidx/lifecycle/s;", "owner", "", "onPause", "(Landroidx/lifecycle/s;)V", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d implements androidx.p000lifecycle.f {
        public d() {
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
        public void onPause(androidx.p000lifecycle.s owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            m.this.N();
        }

        @Override // androidx.p000lifecycle.f
        public void onResume(androidx.p000lifecycle.s sVar) {
            super.onResume(sVar);
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

    static {
        f21220n = Build.VERSION.SDK_INT >= 30 ? 16 : 3;
    }

    public m(@NotNull dn.x governmentIdFeed, @NotNull com.withpersona.sdk2.camera.b cameraPreview, @NotNull eo.e featureFlagManager, @NotNull Screen.b initialRendering, @NotNull Context context, @Nullable ViewGroup viewGroup) {
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
        lo.b bVarC = lo.b.c(LayoutInflater.from((viewGroup == null || (context2 = viewGroup.getContext()) == null) ? context : context2).cloneInContext(context));
        Intrinsics.checkNotNullExpressionValue(bVarC, "inflate(...)");
        Camera2PreviewView camera2Preview = bVarC.f23768c;
        Intrinsics.checkNotNullExpressionValue(camera2Preview, "camera2Preview");
        PreviewView previewView = bVarC.A;
        Intrinsics.checkNotNullExpressionValue(previewView, "previewView");
        this.cameraController = com.withpersona.sdk2.inquiry.governmentid.b.a(initialRendering, context, cameraPreview, camera2Preview, previewView, governmentIdFeed, featureFlagManager.a(eo.a0.f16182a));
        this.binding = bVarC;
        FrameLayout frameLayoutB = bVarC.getRoot();
        Intrinsics.checkNotNullExpressionValue(frameLayoutB, "getRoot(...)");
        this.captureTipsBottomSheetController = new ko.h(frameLayoutB);
    }

    public static final Unit A(Function0 function0) {
        function0.invoke();
        return Unit.f22938a;
    }

    public static final Unit B(Function0 function0) {
        function0.invoke();
        return Unit.f22938a;
    }

    public static final void C(Function1 function1, CompoundButton compoundButton, boolean z10) {
        Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
        function1.invoke(Boolean.valueOf(z10));
    }

    public static final void D(Function0 function0, View view) {
        function0.invoke();
    }

    public static final Unit G(final m mVar, lo.b bVar) {
        a aVar = mVar.animationState;
        a aVar2 = a.INITIAL;
        if (aVar != aVar2) {
            return Unit.f22938a;
        }
        mVar.animationState = a.ENTRY_ANIMATING;
        int height = bVar.f23783r.getHeight() + bVar.f23784s.getHeight();
        int height2 = bVar.f23784s.getHeight();
        ConstraintLayout overlayHint = bVar.f23784s;
        Intrinsics.checkNotNullExpressionValue(overlayHint, "overlayHint");
        boolean z10 = overlayHint.getVisibility() == 0 && bVar.f23784s.getHeight() == 0;
        if (height == 0 || z10) {
            mVar.animationState = aVar2;
            return Unit.f22938a;
        }
        float f10 = height;
        float f11 = -(f10 / 2.0f);
        float f12 = height2 / f10;
        bVar.f23784s.setTranslationY(f11);
        bVar.D.setTranslationY(f11);
        bVar.f23783r.setTranslationY(f11);
        ImageView imageView = bVar.f23783r;
        imageView.setPivotY(imageView.getHeight());
        ScanningView scanningView = bVar.D;
        scanningView.setPivotY(scanningView.getHeight());
        bVar.D.setScaleY(f12);
        FrameLayout frameLayoutB = mVar.binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(frameLayoutB, "getRoot(...)");
        uq.z.b(frameLayoutB, new Function0() { // from class: io.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return m.H(this.f21202a);
            }
        });
        return Unit.f22938a;
    }

    public static final Unit H(m mVar) {
        mVar.I();
        return Unit.f22938a;
    }

    public static final void J(lo.b bVar, m mVar) {
        bVar.D.setScanningAnimationEnabled(true);
        mVar.animationState = a.IDLE;
        bVar.f23789x.setVisibility(0);
        bVar.f23789x.animate().alpha(1.0f).setDuration(200L).start();
    }

    public static final void M(m mVar, IdConfig.b bVar, RemoteImage remoteImage, lo.b bVar2, OverlayAssets overlayAssets, String str) {
        mVar.animationState = a.TRANSITION_EXPANDING;
        mVar.lastCaptureSide = bVar;
        if (remoteImage != null) {
            View view = mVar.currentOverlayAssetView;
            if (view != null) {
                bVar2.f23786u.removeView(view);
            }
            ConstraintLayout overlayIconContainer = bVar2.f23786u;
            Intrinsics.checkNotNullExpressionValue(overlayIconContainer, "overlayIconContainer");
            mVar.currentOverlayAssetView = jr.c.f(remoteImage, overlayIconContainer, false, 2, null);
            bVar2.f23785t.setVisibility(8);
        } else if (mVar.currentHintAnimation != overlayAssets.getHintAnimation()) {
            mVar.currentHintAnimation = overlayAssets.getHintAnimation();
            bVar2.f23785t.setAnimation(overlayAssets.getHintAnimation());
            bVar2.f23785t.setVisibility(0);
        }
        bVar2.f23783r.setImageResource(overlayAssets.getGuideDrawable());
        bVar2.f23787v.setText(str);
        mVar.I();
    }

    public static final void v(float f10, View view) {
        if (f10 == 0.0f) {
            view.setVisibility(4);
        }
    }

    public static final void x(Function0 function0, View view) {
        function0.invoke();
    }

    public static final void y(Function0 function0, m mVar, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, ko.i iVar, NextStep.GovernmentId.AssetConfig.CapturePage capturePage, View view) {
        function0.invoke();
        mVar.captureTipsBottomSheetController.l(governmentIdStepStyle, (BottomSheetCaptureTipsViewModel) iVar, capturePage);
    }

    public static final Unit z(m mVar, y4 y4Var, lo.b bVar) {
        View view = mVar.customOverlayView;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams;
            ((ViewGroup.MarginLayoutParams) bVar2).height = 0;
            ((ViewGroup.MarginLayoutParams) bVar2).width = 0;
            bVar2.f1374i = bVar.f23783r.getId();
            bVar2.f1380l = bVar.f23783r.getId();
            bVar2.f1396t = bVar.f23783r.getId();
            bVar2.f1400v = bVar.f23783r.getId();
            view.setLayoutParams(bVar2);
        }
        y4Var.c();
        return Unit.f22938a;
    }

    public final boolean E() {
        a aVar = this.animationState;
        return aVar == a.TRANSITION_COLLAPSING || aVar == a.TRANSITION_EXPANDING;
    }

    public final void F() {
        if (this.animationState != a.INITIAL) {
            return;
        }
        final lo.b bVar = this.binding;
        View overlay = bVar.f23782q;
        Intrinsics.checkNotNullExpressionValue(overlay, "overlay");
        uq.z.b(overlay, new Function0() { // from class: io.l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return m.G(this.f21218a, bVar);
            }
        });
    }

    public final void I() {
        final lo.b bVar = this.binding;
        bVar.f23783r.animate().scaleY(1.0f).translationY(0.0f).setDuration(200L).withEndAction(new Runnable() { // from class: io.b
            @Override // java.lang.Runnable
            public final void run() {
                m.J(bVar, this);
            }
        }).start();
        bVar.f23784s.animate().translationY(0.0f).setDuration(200L).start();
        bVar.D.animate().scaleY(1.0f).translationY(0.0f).setDuration(200L).start();
    }

    public final void K(boolean showFinalizeUi) {
        lo.b bVar = this.binding;
        if (showFinalizeUi) {
            View previewDim = bVar.f23790y;
            Intrinsics.checkNotNullExpressionValue(previewDim, "previewDim");
            u(previewDim, 0.66f);
            LottieAnimationView scanningAnimation = bVar.C;
            Intrinsics.checkNotNullExpressionValue(scanningAnimation, "scanningAnimation");
            u(scanningAnimation, 0.0f);
            ImageView overlayGuide = bVar.f23783r;
            Intrinsics.checkNotNullExpressionValue(overlayGuide, "overlayGuide");
            u(overlayGuide, 0.0f);
            ConstraintLayout overlayHint = bVar.f23784s;
            Intrinsics.checkNotNullExpressionValue(overlayHint, "overlayHint");
            u(overlayHint, 0.0f);
            ProgressBar progressBar = bVar.B;
            Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
            u(progressBar, 1.0f);
            if (this.animationState == a.IDLE) {
                bVar.D.setScanningAnimationEnabled(false);
                return;
            }
            return;
        }
        View previewDim2 = bVar.f23790y;
        Intrinsics.checkNotNullExpressionValue(previewDim2, "previewDim");
        u(previewDim2, 0.0f);
        LottieAnimationView scanningAnimation2 = bVar.C;
        Intrinsics.checkNotNullExpressionValue(scanningAnimation2, "scanningAnimation");
        u(scanningAnimation2, 1.0f);
        ImageView overlayGuide2 = bVar.f23783r;
        Intrinsics.checkNotNullExpressionValue(overlayGuide2, "overlayGuide");
        u(overlayGuide2, 1.0f);
        ImageView overlayGuide3 = bVar.f23783r;
        Intrinsics.checkNotNullExpressionValue(overlayGuide3, "overlayGuide");
        u(overlayGuide3, 1.0f);
        ProgressBar progressBar2 = bVar.B;
        Intrinsics.checkNotNullExpressionValue(progressBar2, "progressBar");
        u(progressBar2, 0.0f);
        if (this.animationState == a.IDLE) {
            bVar.D.setScanningAnimationEnabled(true);
        }
    }

    public final void L(final IdConfig.b captureSide, final OverlayAssets overlayAssets, final RemoteImage iconAsset, final String messageText) {
        final lo.b bVar = this.binding;
        this.animationState = a.TRANSITION_COLLAPSING;
        Integer num = this.lockedOverlayGuideHeight;
        int iIntValue = num != null ? num.intValue() : bVar.f23783r.getHeight();
        this.lockedOverlayGuideHeight = Integer.valueOf(iIntValue);
        ImageView overlayGuide = bVar.f23783r;
        Intrinsics.checkNotNullExpressionValue(overlayGuide, "overlayGuide");
        ViewGroup.LayoutParams layoutParams = overlayGuide.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams;
        ((ViewGroup.MarginLayoutParams) bVar2).height = iIntValue;
        overlayGuide.setLayoutParams(bVar2);
        bVar.f23789x.setVisibility(4);
        bVar.f23789x.setAlpha(0.0f);
        bVar.D.setScanningAnimationEnabled(false);
        int height = bVar.f23783r.getHeight() + bVar.f23784s.getHeight();
        int height2 = bVar.f23784s.getHeight();
        if (height == 0 || height2 == 0) {
            this.animationState = a.IDLE;
            return;
        }
        float f10 = height;
        float f11 = -(f10 / 2.0f);
        float f12 = height2 / f10;
        ImageView imageView = bVar.f23783r;
        imageView.setPivotY(imageView.getHeight());
        ScanningView scanningView = bVar.D;
        scanningView.setPivotY(scanningView.getHeight());
        bVar.f23783r.animate().scaleY(0.0f).translationY(f11).setDuration(200L).withEndAction(new Runnable() { // from class: io.j
            @Override // java.lang.Runnable
            public final void run() {
                m.M(this.f21212a, captureSide, iconAsset, bVar, overlayAssets, messageText);
            }
        }).start();
        bVar.f23784s.animate().translationY(f11).setDuration(200L).start();
        bVar.D.animate().scaleY(f12).translationY(f11).setDuration(200L).start();
    }

    public final void N() {
        lo.b bVar = this.binding;
        bVar.f23783r.animate().cancel();
        bVar.f23784s.animate().cancel();
        bVar.D.animate().cancel();
        bVar.f23789x.animate().cancel();
        bVar.f23783r.setScaleY(1.0f);
        bVar.f23783r.setTranslationY(0.0f);
        bVar.f23784s.setTranslationY(0.0f);
        bVar.D.setScaleY(1.0f);
        bVar.D.setTranslationY(0.0f);
        bVar.f23789x.setAlpha(1.0f);
        bVar.f23789x.setVisibility(0);
        this.animationState = a.IDLE;
        bVar.D.setScanningAnimationEnabled(true);
    }

    public final void O(String hintText, IdConfig.b captureSide, View overlay, TextView overlayText) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(Http2.INITIAL_MAX_FRAME_SIZE);
        if (hintText != null) {
            accessibilityEventObtain.getText().add(hintText);
        } else {
            int i10 = c.b[captureSide.ordinal()];
            if (i10 == 1 || i10 == 2 || i10 == 3) {
                accessibilityEventObtain.getText().add(overlayText.getContext().getString(tp.g.f32547z));
            } else if (i10 == 4) {
                accessibilityEventObtain.getText().add(overlayText.getContext().getString(tp.g.f32545x));
            } else {
                if (i10 != 5) {
                    throw new gt.l();
                }
                accessibilityEventObtain.getText().add(overlayText.getContext().getString(tp.g.f32546y));
            }
            accessibilityEventObtain.getText().add(overlay.getContext().getString(tp.g.A));
        }
        overlayText.getParent().requestSendAccessibilityEvent(overlayText, accessibilityEventObtain);
    }

    public final void P() {
        lo.b bVar = this.binding;
        bVar.f23783r.setScaleY(0.0f);
        bVar.f23789x.setAlpha(0.0f);
        bVar.D.setScanningAnimationEnabled(false);
    }

    public final boolean Q(boolean playSideTransition, IdConfig.b captureSide, OverlayAssets overlayAssets, RemoteImage iconAsset, String messageText) {
        IdConfig.b bVar = this.lastCaptureSide;
        if (bVar == null || bVar == captureSide || E() || !playSideTransition) {
            this.lastCaptureSide = captureSide;
            return false;
        }
        L(captureSide, overlayAssets, iconAsset, messageText);
        return true;
    }

    @Override // io.w
    public void a() {
        ThemeableLottieAnimationView themeableLottieAnimationView = this.binding.f23785t;
        int color = Color.parseColor("#43957D");
        Context context = this.binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        themeableLottieAnimationView.F(color, hq.z.d(context, i.a.f20026z, null, false, 6, null));
        FrameLayout innerContentView = this.binding.f23780o;
        Intrinsics.checkNotNullExpressionValue(innerContentView, "innerContentView");
        uq.g.d(innerContentView, false, false, false, false, 15, null);
        P();
        Context context2 = this.binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        hq.g.i(context2).a().a(new d());
    }

    @Override // io.w
    @NotNull
    public View b() {
        View overlay = this.binding.f23782q;
        Intrinsics.checkNotNullExpressionValue(overlay, "overlay");
        return overlay;
    }

    @Override // io.w
    public void c(@NotNull String messageText, @NotNull String scanInstructionsText, @NotNull String disclaimerText, @NotNull String titleText, @NotNull String descriptionText, @Nullable String hintText, @NotNull Screen.b.a captureButtonState, @NotNull IdConfig.b captureSide, @NotNull Screen.Overlay overlayImage, @NotNull OverlayAssets overlayAssets, @Nullable RemoteImage iconAsset, boolean waitingOnWebRtcSetup, boolean showFinalizeUi, @NotNull NavigationState navigationState, @Nullable String navBarTitle, @Nullable final ko.i captureTipsViewModel, @Nullable final NextStep.GovernmentId.AssetConfig.CapturePage assetConfig, boolean playSideTransition, @NotNull final Function0<Unit> onBackClick, @NotNull final Function0<Unit> onCancelClick, @NotNull final Function1<? super Boolean, Unit> onFlashlightToggleClick, @NotNull final Function0<Unit> onCaptureClick, @NotNull final Function0<Unit> onCaptureTipsClick, @NotNull final Function0<Unit> onViewfinderClick, @Nullable final StepStyles.GovernmentIdStepStyle styles, @Nullable String watermarkText) {
        final m mVar;
        RemoteImage remoteImage;
        IdConfig.b bVar;
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
        final lo.b bVar2 = this.binding;
        Context context = bVar2.getRoot().getContext();
        if (waitingOnWebRtcSetup) {
            bVar2.f23770e.setVisibility(4);
            bVar2.f23769d.setVisibility(0);
            mVar = this;
            bVar = captureSide;
            remoteImage = iconAsset;
        } else {
            bVar2.f23770e.setVisibility(0);
            bVar2.f23769d.setVisibility(4);
            getCameraController().getPreviewView().setVisibility(0);
            F();
            mVar = this;
            remoteImage = iconAsset;
            bVar = captureSide;
            if (mVar.Q(playSideTransition, bVar, overlayAssets, remoteImage, messageText)) {
                return;
            }
        }
        if (!mVar.E()) {
            bVar2.f23787v.setText(messageText);
        }
        bVar2.f23775j.setText(disclaimerText);
        bVar2.H.setText(titleText);
        bVar2.H.setVisibility(StringsKt.p0(titleText) ? 8 : 0);
        bVar2.f23774i.setText(descriptionText);
        bVar2.f23774i.setVisibility(StringsKt.p0(descriptionText) ? 8 : 0);
        if (StringsKt.p0(disclaimerText)) {
            bVar2.f23776k.setVisibility(8);
            i10 = 0;
        } else {
            LinearLayout linearLayout = bVar2.f23776k;
            i10 = 0;
            linearLayout.setVisibility(0);
        }
        if (hintText == null || waitingOnWebRtcSetup) {
            bVar2.f23779n.setVisibility(8);
        } else {
            bVar2.f23779n.setVisibility(i10);
            bVar2.f23779n.setText(hintText);
        }
        Context context2 = bVar2.f23787v.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        if (hq.g.g(context2) && bVar2.f23787v.getParent() != null) {
            View overlay = bVar2.f23782q;
            Intrinsics.checkNotNullExpressionValue(overlay, "overlay");
            TextView overlayText = bVar2.f23787v;
            Intrinsics.checkNotNullExpressionValue(overlayText, "overlayText");
            mVar.O(hintText, bVar, overlay, overlayText);
        }
        int i12 = c.f21238a[captureButtonState.ordinal()];
        if (i12 == 1) {
            bVar2.f23771f.setEnabled(false);
        } else if (i12 == 2) {
            bVar2.f23771f.setVisibility(0);
            bVar2.f23771f.setEnabled(true);
        } else {
            if (i12 != 3) {
                throw new gt.l();
            }
            bVar2.f23771f.setVisibility(4);
        }
        Intrinsics.checkNotNull(context);
        if (hq.z.b(context, tp.a.f32483h, null, false, false, 14, null)) {
            bVar2.f23787v.setGravity(17);
            TextView overlayText2 = bVar2.f23787v;
            Intrinsics.checkNotNullExpressionValue(overlayText2, "overlayText");
            ViewGroup.LayoutParams layoutParams = overlayText2.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginStart(0);
            overlayText2.setLayoutParams(marginLayoutParams);
        }
        Integer numF = hq.z.f(context, tp.a.f32491p, null, false, 6, null);
        bVar2.f23775j.setCompoundDrawablesRelativeWithIntrinsicBounds(numF != null ? numF.intValue() : m2.f18757l, 0, 0, 0);
        if (!mVar.E()) {
            if (remoteImage != null) {
                if (mVar.currentOverlayAssetView == null) {
                    ConstraintLayout overlayIconContainer = bVar2.f23786u;
                    Intrinsics.checkNotNullExpressionValue(overlayIconContainer, "overlayIconContainer");
                    mVar.currentOverlayAssetView = jr.c.f(remoteImage, overlayIconContainer, false, 2, null);
                    bVar2.f23785t.setVisibility(8);
                }
            } else if (mVar.currentHintAnimation != overlayAssets.getHintAnimation()) {
                mVar.currentHintAnimation = overlayAssets.getHintAnimation();
                bVar2.f23785t.setAnimation(overlayAssets.getHintAnimation());
                bVar2.f23785t.setVisibility(0);
            }
            bVar2.f23783r.setImageResource(overlayAssets.getGuideDrawable());
        }
        Integer numF2 = hq.z.f(context, tp.a.f32487l, null, false, 6, null);
        if (numF2 != null) {
            bVar2.C.setAnimation(numF2.intValue());
            bVar2.f23782q.setVisibility(0);
            bVar2.D.setVisibility(8);
        } else {
            bVar2.C.setVisibility(4);
            bVar2.f23782q.setVisibility(4);
            bVar2.D.setVisibility(0);
        }
        bVar2.f23782q.setBackground(com.withpersona.sdk2.inquiry.governmentid.o.a(context, tp.a.f32482g));
        if ((overlayImage instanceof Screen.Overlay.Custom) && mVar.customOverlayView == null) {
            final y4 y4Var = new y4(context);
            Screen.Overlay.Custom custom = (Screen.Overlay.Custom) overlayImage;
            View viewN = k4.n(custom.getCustomImage(), y4Var, custom.getConfig());
            mVar.customOverlayView = viewN;
            bVar2.f23770e.addView(viewN);
            bVar2.C.setVisibility(4);
            bVar2.f23783r.setVisibility(4);
            View view = mVar.customOverlayView;
            if (view != null) {
                uq.z.b(view, new Function0() { // from class: io.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return m.z(this.f21196a, y4Var, bVar2);
                    }
                });
            }
        }
        if (styles != 0) {
            mVar.w(styles);
        }
        Function0 function0 = new Function0() { // from class: io.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return m.A(onBackClick);
            }
        };
        Function0 function1 = new Function0() { // from class: io.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return m.B(onCancelClick);
            }
        };
        Pi2NavigationBar navigationBar = bVar2.f23781p;
        Intrinsics.checkNotNullExpressionValue(navigationBar, "navigationBar");
        FrameLayout frameLayoutB = bVar2.getRoot();
        Intrinsics.checkNotNullExpressionValue(frameLayoutB, "getRoot(...)");
        gr.c.e(navigationState, function0, function1, null, navigationBar, frameLayoutB, styles != 0 ? cr.h.h(styles) : null, navBarTitle, styles != 0 ? styles.getNavBarTitleStyleValue() : null, 8, null);
        bVar2.f23778m.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: io.f
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                m.C(onFlashlightToggleClick, compoundButton, z10);
            }
        });
        bVar2.f23771f.setOnClickListener(new View.OnClickListener() { // from class: io.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                m.D(onCaptureClick, view2);
            }
        });
        mVar.getCameraController().getPreviewView().setOnClickListener(new View.OnClickListener() { // from class: io.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                m.x(onViewfinderClick, view2);
            }
        });
        mVar.K(showFinalizeUi);
        StaticCaptureTipsView staticCaptureTips = mVar.binding.G;
        Intrinsics.checkNotNullExpressionValue(staticCaptureTips, "staticCaptureTips");
        staticCaptureTips.setVisibility(8);
        if (captureTipsViewModel instanceof StaticCaptureTipsViewModel) {
            staticCaptureTips.setVisibility(0);
            StaticCaptureTipsViewModel staticCaptureTipsViewModel = (StaticCaptureTipsViewModel) captureTipsViewModel;
            staticCaptureTips.a(staticCaptureTipsViewModel.getTitle(), staticCaptureTipsViewModel.getSubtext(), staticCaptureTipsViewModel.getIconAsset(), styles);
            bVar2.f23773h.setVisibility(8);
        } else if (captureTipsViewModel instanceof BottomSheetCaptureTipsViewModel) {
            BottomSheetCaptureTipsViewModel bottomSheetCaptureTipsViewModel = (BottomSheetCaptureTipsViewModel) captureTipsViewModel;
            if (bottomSheetCaptureTipsViewModel.getHelpButtonText().length() == 0) {
                bVar2.f23773h.setVisibility(4);
            } else {
                bVar2.f23773h.setVisibility(0);
                bVar2.f23773h.setText(bottomSheetCaptureTipsViewModel.getHelpButtonText());
                final m mVar2 = mVar;
                bVar2.f23773h.setOnClickListener(new View.OnClickListener() { // from class: io.i
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        m.y(onCaptureTipsClick, mVar2, styles, captureTipsViewModel, assetConfig, view2);
                    }
                });
            }
        } else {
            bVar2.f23773h.setVisibility(4);
        }
        mVar.captureTipsBottomSheetController.o();
        if (messageText.length() == 0) {
            bVar2.f23784s.setVisibility(8);
            i11 = 0;
        } else {
            i11 = 0;
            bVar2.f23784s.setVisibility(0);
        }
        if (watermarkText == null || StringsKt.p0(watermarkText)) {
            bVar2.J.setVisibility(8);
        } else {
            bVar2.J.setText(watermarkText);
            bVar2.J.setVisibility(i11);
        }
    }

    @Override // io.w
    @Nullable
    public Object d(@NotNull lt.b<? super Unit> bVar) {
        return super.d(bVar);
    }

    @Override // io.w
    public void e() {
        lo.b bVar = this.binding;
        bVar.getRoot().setHapticFeedbackEnabled(true);
        bVar.getRoot().performHapticFeedback(f21220n, 2);
    }

    @Override // io.w
    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public dn.g getCameraController() {
        return this.cameraController;
    }

    @Override // io.w
    @NotNull
    public View getRoot() {
        FrameLayout frameLayoutB = this.binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(frameLayoutB, "getRoot(...)");
        return frameLayoutB;
    }

    public final void u(final View view, final float f10) {
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
            view.animate().alpha(f10).withEndAction(new Runnable() { // from class: io.k
                @Override // java.lang.Runnable
                public final void run() {
                    m.v(f10, view);
                }
            });
        }
    }

    public final Unit w(StepStyles.GovernmentIdStepStyle styles) {
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
        lo.b bVar = this.binding;
        float fA = (float) hq.j.a(8.0d);
        int iA = (int) hq.j.a(3.0d);
        TextBasedComponentStyle titleStyleValue = styles.getTitleStyleValue();
        if (titleStyleValue != null) {
            TextView title = this.binding.H;
            Intrinsics.checkNotNullExpressionValue(title, "title");
            h0.l(title, titleStyleValue, null, 2, null);
            this.binding.H.setTextColor(-1);
        }
        TextBasedComponentStyle governmentIdCaptureDescriptionStyle = styles.getGovernmentIdCaptureDescriptionStyle();
        if (governmentIdCaptureDescriptionStyle != null) {
            TextView description = this.binding.f23774i;
            Intrinsics.checkNotNullExpressionValue(description, "description");
            h0.l(description, governmentIdCaptureDescriptionStyle, null, 2, null);
            if (governmentIdCaptureDescriptionStyle.getTextColorValue() == null) {
                this.binding.f23774i.setTextColor(-1);
            }
        }
        Integer governmentIdCaptureFeedBoxBorderColorValue = styles.getGovernmentIdCaptureFeedBoxBorderColorValue();
        if (governmentIdCaptureFeedBoxBorderColorValue != null) {
            bVar.D.setBorderColor(governmentIdCaptureFeedBoxBorderColorValue.intValue());
        }
        Double governmentIdCaptureFeedBoxBorderRadiusValue = styles.getGovernmentIdCaptureFeedBoxBorderRadiusValue();
        if (governmentIdCaptureFeedBoxBorderRadiusValue != null) {
            fA = (float) hq.j.a(governmentIdCaptureFeedBoxBorderRadiusValue.doubleValue());
        }
        Double governmentIdCaptureFeedBoxBorderWidthValue = styles.getGovernmentIdCaptureFeedBoxBorderWidthValue();
        if (governmentIdCaptureFeedBoxBorderWidthValue != null) {
            iA = (int) Math.ceil(hq.j.a(governmentIdCaptureFeedBoxBorderWidthValue.doubleValue()));
            ImageView imageView = bVar.f23783r;
            imageView.setPadding(imageView.getPaddingLeft(), ((int) hq.j.a(8.0d)) + iA, bVar.f23783r.getPaddingRight(), bVar.f23783r.getPaddingBottom());
        }
        float f10 = iA;
        bVar.E.setRadius(fA + f10);
        TextBasedComponentStyle governmentIdCaptureHintTextStyle = styles.getGovernmentIdCaptureHintTextStyle();
        if (governmentIdCaptureHintTextStyle != null) {
            TextView overlayText = this.binding.f23787v;
            Intrinsics.checkNotNullExpressionValue(overlayText, "overlayText");
            h0.k(overlayText, governmentIdCaptureHintTextStyle, p0.c(e0.LineHeight));
        }
        TextView disclaimer = this.binding.f23775j;
        Intrinsics.checkNotNullExpressionValue(disclaimer, "disclaimer");
        StepStyles.GovernmentIdStepTextBasedComponentStyle textStyle = styles.getTextStyle();
        String fontNameValue = (textStyle == null || (base5 = textStyle.getBase()) == null || (base6 = base5.getBase()) == null) ? null : base6.getFontNameValue();
        StepStyles.GovernmentIdStepTextBasedComponentStyle textStyle2 = styles.getTextStyle();
        if (textStyle2 == null || (base3 = textStyle2.getBase()) == null || (base4 = base3.getBase()) == null || (fontWeightValue = base4.getFontWeightValue()) == null) {
            fontWeightValue = StyleElements.FontWeight.NORMAL;
        }
        h0.i(disclaimer, fontNameValue, fontWeightValue, null, 4, null);
        View view = bVar.f23782q;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(fA);
        gradientDrawable.setStroke(iA, bVar.D.getBorderColor());
        view.setBackground(gradientDrawable);
        ConstraintLayout constraintLayout = bVar.f23784s;
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(-1);
        gradientDrawable2.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, fA, fA, fA, fA});
        constraintLayout.setBackground(new InsetDrawable((Drawable) gradientDrawable2, (int) hq.j.a(6.0d)));
        Integer captureHintIconStrokeColor = styles.getCaptureHintIconStrokeColor();
        if (captureHintIconStrokeColor != null) {
            this.binding.f23785t.F(Color.parseColor("#000000"), captureHintIconStrokeColor.intValue());
        }
        Integer captureHintIconFillColor = styles.getCaptureHintIconFillColor();
        if (captureHintIconFillColor != null) {
            this.binding.f23785t.F(Color.parseColor("#43957D"), captureHintIconFillColor.intValue());
        }
        bVar.D.setStrokeWidth(f10);
        bVar.D.setCornerRadius(fA);
        Integer governmentIdCaptureFeedBoxStrokeColorValue = styles.getGovernmentIdCaptureFeedBoxStrokeColorValue();
        if (governmentIdCaptureFeedBoxStrokeColorValue != null) {
            bVar.D.setHighlightColor(governmentIdCaptureFeedBoxStrokeColorValue.intValue());
        }
        Integer capturePageHeaderIconColorValue = styles.getCapturePageHeaderIconColorValue();
        if (capturePageHeaderIconColorValue != null) {
            this.binding.f23781p.setControlsColor(capturePageHeaderIconColorValue.intValue());
        }
        StepStyles.StepPaddingStyle padding = styles.getPadding();
        if (padding != null && (screen2 = padding.getScreen()) != null && (base2 = screen2.getBase()) != null && (left = base2.getLeft()) != null && (dp3 = left.getDp()) != null) {
            this.binding.F.setGuidelineBegin((int) hq.j.a(dp3.doubleValue()));
        }
        StepStyles.StepPaddingStyle padding2 = styles.getPadding();
        if (padding2 == null || (screen = padding2.getScreen()) == null || (base = screen.getBase()) == null || (right = base.getRight()) == null || (dp2 = right.getDp()) == null) {
            return null;
        }
        this.binding.f23777l.setGuidelineEnd((int) hq.j.a(dp2.doubleValue()));
        return Unit.f22938a;
    }
}
