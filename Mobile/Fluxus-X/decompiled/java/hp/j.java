package hp;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.b0;
import com.github.luben.zstd.BuildConfig;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonCancelComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaMaterialButton;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import g7.n0;
import java.io.File;
import kr.a0;
import l6.s;
import nn.ViewEnvironment;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.collections.p0;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.text.StringsKt;
import p5.y;
import vo.OverlayAssets;
import vo.g3;
import vo.l3;
import vo.n3;
import vo.o3;
import vo.y3;
import xq.g0;
import xq.z;
import y6.ImageRequest;
import yr.e0;
import yr.h0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJß\u0001\u0010,\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001e2\b\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010#\u001a\u0004\u0018\u00010\u000f2\u0006\u0010%\u001a\u00020$2\b\u0010&\u001a\u0004\u0018\u00010\u000f2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\b0'2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\b0'2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\b0'2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\b0'H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001eH\u0002¢\u0006\u0004\b.\u0010/J\u0019\u00100\u001a\u0004\u0018\u00010\b2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b0\u00101J!\u00105\u001a\u00020\b2\u0006\u00102\u001a\u00020$2\b\b\u0002\u00104\u001a\u000203H\u0002¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\bH\u0002¢\u0006\u0004\b7\u0010\nR\u0014\u0010:\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00109R\u0014\u0010=\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010<R\u0018\u0010A\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010 \u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010F\u001a\u00020>8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010E¨\u0006G"}, d2 = {"Lhp/j;", "Lhp/k;", "Landroid/content/Context;", "context", "Landroid/view/ViewGroup;", "container", "<init>", "(Landroid/content/Context;Landroid/view/ViewGroup;)V", BuildConfig.FLAVOR, "a", "()V", "Lnn/z;", "viewEnvironment", "Ll6/s;", "imageLoader", BuildConfig.FLAVOR, "imagePath", "messageText", "disclaimerText", "acceptText", "retryText", "confirmCaptureTitle", "Lvo/y3$f;", "overlayImage", "Lvo/j3;", "overlayAssets", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "iconAsset", "Lir/a;", "navigationState", BuildConfig.FLAVOR, "isEnabled", "isProcessing", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "error", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;", "reviewCaptureButtonsAxis", "navBarTitle", "Lkotlin/Function0;", "onAcceptImageClick", "onRetryClick", "onCancelClick", "onErrorDismissed", "b", "(Lnn/z;Ll6/s;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvo/y3$f;Lvo/j3;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Lir/a;ZZLcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "y", "(Z)V", "l", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;)Lkotlin/Unit;", "preferredAxis", BuildConfig.FLAVOR, "originalCallTimestamp", "u", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;J)V", "t", "Lap/i;", "Lap/i;", "binding", "Landroidx/constraintlayout/widget/c;", "Landroidx/constraintlayout/widget/c;", "constraintSet", "Landroid/view/View;", "c", "Landroid/view/View;", "currentOverlayAssetView", "d", "Z", "getRoot", "()Landroid/view/View;", "root", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ap.i binding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final androidx.constraintlayout.widget.c constraintSet;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public View currentOverlayAssetView;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public boolean isProcessing;

    public j(@NotNull Context context, @Nullable ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(context, "context");
        ap.i iVarC = ap.i.c(LayoutInflater.from(context), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(iVarC, "inflate(...)");
        this.binding = iVarC;
        this.constraintSet = new androidx.constraintlayout.widget.c();
    }

    public static final void m(ap.i iVar) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(iVar.f3242j, "alpha", 0.9f, 0.0f).setDuration(500L);
        duration.setInterpolator(new LinearInterpolator());
        duration.start();
        iVar.getRoot().setHapticFeedbackEnabled(true);
        iVar.getRoot().performHapticFeedback(1, 2);
    }

    public static final void n(ap.i iVar, g7.i iVar2) {
        iVar.f3248p.setProgress(1.0f);
    }

    public static final Unit o(ap.i iVar, String str, s sVar) {
        int iF = p001kotlin.ranges.d.f(iVar.f3254v.getMeasuredWidth(), 2000);
        if (iF > 0) {
            iVar.f3254v.setTag(jq.e.f20856a, str);
            ImageView reviewImage = iVar.f3254v;
            Intrinsics.checkNotNullExpressionValue(reviewImage, "reviewImage");
            ImageRequest.a aVarQ = y6.j.q(new ImageRequest.a(reviewImage.getContext()).c(new File(str)), reviewImage);
            aVarQ.s(iF, iF);
            aVarQ.j(str);
            sVar.d(aVarQ.b());
        }
        return Unit.f21506a;
    }

    public static final Unit p(Function0 function0) {
        function0.invoke();
        return Unit.f21506a;
    }

    public static final Unit q(Function0 function0) {
        function0.invoke();
        return Unit.f21506a;
    }

    public static final void r(Function0 function0, View view) {
        function0.invoke();
    }

    public static final void s(Function0 function0, View view) {
        function0.invoke();
    }

    public static /* synthetic */ void v(j jVar, StyleElements.Axis axis, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = System.currentTimeMillis();
        }
        jVar.u(axis, j10);
    }

    public static final Unit w(ap.i iVar, long j10, final j jVar, StyleElements.Axis axis) {
        boolean z10 = (iVar.b.getLineCount() == 0 || iVar.f3253u.getLineCount() == 0) ? false : true;
        boolean z11 = System.currentTimeMillis() - j10 > 300;
        if (!z10 && !z11) {
            jVar.u(axis, j10);
            return Unit.f21506a;
        }
        if (z10 && (iVar.b.getLineCount() > 1 || iVar.f3253u.getLineCount() > 1 || axis == StyleElements.Axis.VERTICAL)) {
            PersonaMaterialButton acceptButton = iVar.b;
            Intrinsics.checkNotNullExpressionValue(acceptButton, "acceptButton");
            ViewGroup.LayoutParams layoutParams = acceptButton.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = iVar.f3243k.getWidth();
            acceptButton.setLayoutParams(layoutParams);
            PersonaMaterialButton retryButton = iVar.f3253u;
            Intrinsics.checkNotNullExpressionValue(retryButton, "retryButton");
            ViewGroup.LayoutParams layoutParams2 = retryButton.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams2.width = iVar.f3243k.getWidth();
            retryButton.setLayoutParams(layoutParams2);
            iVar.f3243k.setReferencedIds(new int[]{iVar.b.getId(), iVar.f3253u.getId()});
            jVar.binding.f3244l.setAccessibilityTraversalAfter(n3.f34900w0);
        }
        b0.a(iVar.b, new Runnable() { // from class: hp.i
            @Override // java.lang.Runnable
            public final void run() {
                j.x(this.f18470a);
            }
        });
        return Unit.f21506a;
    }

    public static final void x(j jVar) {
        jVar.t();
    }

    @Override // hp.k
    public void a() {
        CoordinatorLayout cameraScreenContent = this.binding.f3236d;
        Intrinsics.checkNotNullExpressionValue(cameraScreenContent, "cameraScreenContent");
        kr.g.d(cameraScreenContent, false, false, false, false, 15, null);
        ThemeableLottieAnimationView themeableLottieAnimationView = this.binding.f3248p;
        int color = Color.parseColor("#43957D");
        Context context = this.binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        themeableLottieAnimationView.F(color, z.d(context, i.a.f18753z, null, false, 6, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // hp.k
    public void b(@NotNull ViewEnvironment viewEnvironment, @NotNull final s imageLoader, @NotNull final String imagePath, @NotNull String messageText, @NotNull String disclaimerText, @NotNull String acceptText, @NotNull String retryText, @NotNull String confirmCaptureTitle, @NotNull y3.f overlayImage, @NotNull OverlayAssets overlayAssets, @Nullable RemoteImage iconAsset, @NotNull ir.a navigationState, boolean isEnabled, boolean isProcessing, @Nullable StepStyles.GovernmentIdStepStyle styles, @Nullable String error, @NotNull StyleElements.Axis reviewCaptureButtonsAxis, @Nullable String navBarTitle, @NotNull final Function0<Unit> onAcceptImageClick, @NotNull final Function0<Unit> onRetryClick, @NotNull final Function0<Unit> onCancelClick, @NotNull Function0<Unit> onErrorDismissed) {
        TextBasedComponentStyle textBasedComponentStyle;
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        Intrinsics.checkNotNullParameter(imagePath, "imagePath");
        Intrinsics.checkNotNullParameter(messageText, "messageText");
        Intrinsics.checkNotNullParameter(disclaimerText, "disclaimerText");
        Intrinsics.checkNotNullParameter(acceptText, "acceptText");
        Intrinsics.checkNotNullParameter(retryText, "retryText");
        Intrinsics.checkNotNullParameter(confirmCaptureTitle, "confirmCaptureTitle");
        Intrinsics.checkNotNullParameter(overlayImage, "overlayImage");
        Intrinsics.checkNotNullParameter(overlayAssets, "overlayAssets");
        Intrinsics.checkNotNullParameter(navigationState, "navigationState");
        Intrinsics.checkNotNullParameter(reviewCaptureButtonsAxis, "reviewCaptureButtonsAxis");
        Intrinsics.checkNotNullParameter(onAcceptImageClick, "onAcceptImageClick");
        Intrinsics.checkNotNullParameter(onRetryClick, "onRetryClick");
        Intrinsics.checkNotNullParameter(onCancelClick, "onCancelClick");
        Intrinsics.checkNotNullParameter(onErrorDismissed, "onErrorDismissed");
        final ap.i iVar = this.binding;
        if (iVar.f3235c.isChecked()) {
            iVar.f3248p.j(new n0() { // from class: hp.b
                @Override // g7.n0
                public final void a(g7.i iVar2) {
                    j.n(iVar, iVar2);
                }
            });
        } else {
            iVar.f3235c.setChecked(true);
            iVar.getRoot().post(new Runnable() { // from class: hp.a
                @Override // java.lang.Runnable
                public final void run() {
                    j.m(iVar);
                }
            });
        }
        Object tag = iVar.f3254v.getTag(jq.e.f20856a);
        if (!Intrinsics.c(tag instanceof String ? (String) tag : null, imagePath)) {
            ImageView reviewImage = iVar.f3254v;
            Intrinsics.checkNotNullExpressionValue(reviewImage, "reviewImage");
            a0.b(reviewImage, new Function0() { // from class: hp.c
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return j.o(iVar, imagePath, imageLoader);
                }
            });
        }
        iVar.f3250r.setText(messageText);
        iVar.f3239g.setVisibility(StringsKt.p0(disclaimerText) ? 8 : 0);
        iVar.f3238f.setVisibility(StringsKt.p0(disclaimerText) ? 8 : 0);
        iVar.f3238f.setText(disclaimerText);
        iVar.b.setText(acceptText);
        iVar.f3253u.setText(retryText);
        iVar.f3258z.setText(confirmCaptureTitle);
        TextView textView = iVar.f3258z;
        CharSequence text = textView.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        textView.setVisibility(StringsKt.p0(text) ? 8 : 0);
        Context context = iVar.getRoot().getContext();
        View view = iVar.f3245m;
        Intrinsics.checkNotNull(context);
        view.setBackground(g3.a(context, jq.a.f20835k));
        if (z.b(context, jq.a.f20832h, null, false, false, 14, null)) {
            iVar.f3250r.setGravity(17);
            TextView overlayText = iVar.f3250r;
            Intrinsics.checkNotNullExpressionValue(overlayText, "overlayText");
            ViewGroup.LayoutParams layoutParams = overlayText.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginStart(0);
            overlayText.setLayoutParams(marginLayoutParams);
        }
        Integer numF = z.f(context, jq.a.f20840p, null, false, 6, null);
        if (numF != null) {
            iVar.f3239g.setImageResource(numF.intValue());
        }
        iVar.f3246n.setImageResource(overlayAssets.getGuideDrawable());
        if (iconAsset == null) {
            textBasedComponentStyle = null;
            iVar.f3248p.setAnimation(overlayAssets.getHintAnimation());
        } else if (this.currentOverlayAssetView == null) {
            ConstraintLayout overlayIconContainer = iVar.f3249q;
            Intrinsics.checkNotNullExpressionValue(overlayIconContainer, "overlayIconContainer");
            textBasedComponentStyle = null;
            this.currentOverlayAssetView = as.c.f(iconAsset, overlayIconContainer, false, 2, null);
            iVar.f3248p.setVisibility(8);
        } else {
            textBasedComponentStyle = null;
        }
        Function0 function0 = new Function0() { // from class: hp.d
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return j.p(onRetryClick);
            }
        };
        Function0 function1 = new Function0() { // from class: hp.e
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return j.q(onCancelClick);
            }
        };
        Pi2NavigationBar navigationBar = iVar.f3244l;
        Intrinsics.checkNotNullExpressionValue(navigationBar, "navigationBar");
        FrameLayout frameLayoutB = iVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(frameLayoutB, "getRoot(...)");
        xr.c.e(navigationState, function0, function1, null, navigationBar, frameLayoutB, styles != null ? sr.h.h(styles) : textBasedComponentStyle, navBarTitle, styles != null ? styles.getNavBarTitleStyleValue() : textBasedComponentStyle, 8, null);
        iVar.b.setOnClickListener(new View.OnClickListener() { // from class: hp.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                j.r(onAcceptImageClick, view2);
            }
        });
        iVar.f3253u.setOnClickListener(new View.OnClickListener() { // from class: hp.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                j.s(onRetryClick, view2);
            }
        });
        iVar.b.setEnabled(isEnabled);
        iVar.f3253u.setEnabled(isEnabled);
        y(isProcessing);
        if (styles != null) {
            l(styles);
            int iC = l2.b.c(this.binding.getRoot().getContext(), jq.b.f20845a);
            Context context2 = this.binding.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            jr.c.b(viewEnvironment, context2, iC);
        }
        v(this, reviewCaptureButtonsAxis, 0L, 2, null);
        CoordinatorLayout cameraScreenContent = this.binding.f3236d;
        Intrinsics.checkNotNullExpressionValue(cameraScreenContent, "cameraScreenContent");
        g0.b(cameraScreenContent, error, onErrorDismissed, null, 0, 0, 56, null);
    }

    @Override // hp.k
    @NotNull
    public View getRoot() {
        FrameLayout frameLayoutB = this.binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(frameLayoutB, "getRoot(...)");
        return frameLayoutB;
    }

    public final Unit l(StepStyles.GovernmentIdStepStyle styles) {
        int iIntValue;
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
        ap.i iVar = this.binding;
        float fA = (float) xq.j.a(8.0d);
        int iA = (int) xq.j.a(3.0d);
        TextBasedComponentStyle titleStyleValue = styles.getTitleStyleValue();
        if (titleStyleValue != null) {
            TextView title = this.binding.f3258z;
            Intrinsics.checkNotNullExpressionValue(title, "title");
            h0.l(title, titleStyleValue, null, 2, null);
            this.binding.f3258z.setTextColor(-1);
        }
        TextBasedComponentStyle governmentIdCaptureHintTextStyle = styles.getGovernmentIdCaptureHintTextStyle();
        if (governmentIdCaptureHintTextStyle != null) {
            TextView overlayText = this.binding.f3250r;
            Intrinsics.checkNotNullExpressionValue(overlayText, "overlayText");
            h0.k(overlayText, governmentIdCaptureHintTextStyle, p0.c(e0.LineHeight));
        }
        Integer governmentIdReviewImageBoxBorderColorValue = styles.getGovernmentIdReviewImageBoxBorderColorValue();
        if (governmentIdReviewImageBoxBorderColorValue != null) {
            iIntValue = governmentIdReviewImageBoxBorderColorValue.intValue();
            iVar.f3252t.setIndeterminateTintList(new ColorStateList(new int[][]{new int[0]}, new int[]{iIntValue}));
        } else {
            iIntValue = -1;
        }
        TextView disclaimer = this.binding.f3238f;
        Intrinsics.checkNotNullExpressionValue(disclaimer, "disclaimer");
        StepStyles.GovernmentIdStepTextBasedComponentStyle textStyle = styles.getTextStyle();
        String fontNameValue = (textStyle == null || (base5 = textStyle.getBase()) == null || (base6 = base5.getBase()) == null) ? null : base6.getFontNameValue();
        StepStyles.GovernmentIdStepTextBasedComponentStyle textStyle2 = styles.getTextStyle();
        if (textStyle2 == null || (base3 = textStyle2.getBase()) == null || (base4 = base3.getBase()) == null || (fontWeightValue = base4.getFontWeightValue()) == null) {
            fontWeightValue = StyleElements.FontWeight.NORMAL;
        }
        h0.i(disclaimer, fontNameValue, fontWeightValue, null, 4, null);
        Double governmentIdReviewImageBoxBorderRadiusValue = styles.getGovernmentIdReviewImageBoxBorderRadiusValue();
        if (governmentIdReviewImageBoxBorderRadiusValue != null) {
            fA = (float) xq.j.a(governmentIdReviewImageBoxBorderRadiusValue.doubleValue());
        }
        Double governmentIdReviewImageBoxBorderWidthValue = styles.getGovernmentIdReviewImageBoxBorderWidthValue();
        if (governmentIdReviewImageBoxBorderWidthValue != null) {
            iA = (int) Math.ceil(xq.j.a(governmentIdReviewImageBoxBorderWidthValue.doubleValue()));
        }
        iVar.f3255w.setRadius(iA + fA);
        View view = iVar.f3245m;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(fA);
        gradientDrawable.setStroke(iA, iIntValue);
        view.setBackground(gradientDrawable);
        ConstraintLayout constraintLayout = iVar.f3247o;
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(-1);
        gradientDrawable2.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, fA, fA, fA, fA});
        constraintLayout.setBackground(new InsetDrawable((Drawable) gradientDrawable2, (int) xq.j.a(6.0d)));
        ButtonSubmitComponentStyle submitPhotoButtonStyleValue = styles.getSubmitPhotoButtonStyleValue();
        if (submitPhotoButtonStyleValue != null) {
            PersonaMaterialButton acceptButton = iVar.b;
            Intrinsics.checkNotNullExpressionValue(acceptButton, "acceptButton");
            yr.e.h(acceptButton, submitPhotoButtonStyleValue, false, false, false, 10, null);
        }
        ButtonCancelComponentStyle retakePhotoButtonStyleValue = styles.getRetakePhotoButtonStyleValue();
        if (retakePhotoButtonStyleValue != null) {
            PersonaMaterialButton retryButton = iVar.f3253u;
            Intrinsics.checkNotNullExpressionValue(retryButton, "retryButton");
            yr.e.h(retryButton, retakePhotoButtonStyleValue, false, false, false, 10, null);
        }
        Integer captureHintIconStrokeColor = styles.getCaptureHintIconStrokeColor();
        if (captureHintIconStrokeColor != null) {
            this.binding.f3248p.F(Color.parseColor("#000000"), captureHintIconStrokeColor.intValue());
        }
        Integer captureHintIconFillColor = styles.getCaptureHintIconFillColor();
        if (captureHintIconFillColor != null) {
            this.binding.f3248p.F(Color.parseColor("#43957D"), captureHintIconFillColor.intValue());
        }
        Integer capturePageHeaderIconColorValue = styles.getCapturePageHeaderIconColorValue();
        if (capturePageHeaderIconColorValue != null) {
            this.binding.f3244l.setControlsColor(capturePageHeaderIconColorValue.intValue());
        }
        StepStyles.StepPaddingStyle padding = styles.getPadding();
        if (padding != null && (screen2 = padding.getScreen()) != null && (base2 = screen2.getBase()) != null && (left = base2.getLeft()) != null && (dp3 = left.getDp()) != null) {
            this.binding.f3257y.setGuidelineBegin((int) xq.j.a(dp3.doubleValue()));
        }
        StepStyles.StepPaddingStyle padding2 = styles.getPadding();
        if (padding2 == null || (screen = padding2.getScreen()) == null || (base = screen.getBase()) == null || (right = base.getRight()) == null || (dp2 = right.getDp()) == null) {
            return null;
        }
        this.binding.f3241i.setGuidelineEnd((int) xq.j.a(dp2.doubleValue()));
        return Unit.f21506a;
    }

    public final void t() {
        ap.i iVar = this.binding;
        if (iVar.b.getTop() < iVar.f3240h.getBottom() + iVar.getRoot().getContext().getResources().getDimensionPixelOffset(l3.f34822a)) {
            this.constraintSet.e(iVar.getRoot().getContext(), o3.f34938j);
            y.a(this.binding.f3236d, new p5.a());
            this.constraintSet.c(this.binding.f3237e);
        }
    }

    public final void u(final StyleElements.Axis preferredAxis, final long originalCallTimestamp) {
        final ap.i iVar = this.binding;
        PersonaMaterialButton acceptButton = iVar.b;
        Intrinsics.checkNotNullExpressionValue(acceptButton, "acceptButton");
        a0.b(acceptButton, new Function0() { // from class: hp.h
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return j.w(iVar, originalCallTimestamp, this, preferredAxis);
            }
        });
    }

    public final void y(boolean isProcessing) {
        if (this.isProcessing == isProcessing) {
            return;
        }
        this.isProcessing = isProcessing;
        ap.i iVar = this.binding;
        p5.b0 b0VarX0 = new p5.b0().H0(new p5.e(3)).H0(new p5.b()).H0(new p5.c()).H0(new p5.d()).Q0(0).x0(300L);
        Intrinsics.checkNotNullExpressionValue(b0VarX0, "setDuration(...)");
        y.a(iVar.getRoot(), b0VarX0);
        if (isProcessing) {
            iVar.f3251s.setVisibility(0);
            iVar.f3240h.setVisibility(4);
            iVar.b.setVisibility(4);
            iVar.f3253u.setVisibility(4);
            iVar.f3247o.setVisibility(4);
            return;
        }
        iVar.f3251s.setVisibility(4);
        iVar.f3240h.setVisibility(0);
        iVar.b.setVisibility(0);
        iVar.f3253u.setVisibility(0);
        iVar.f3247o.setVisibility(0);
    }
}
