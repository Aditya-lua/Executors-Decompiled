package to;

import an.ViewEnvironment;
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
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonCancelComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaMaterialButton;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import f7.n0;
import io.OverlayAssets;
import io.l2;
import io.n2;
import io.o2;
import java.io.File;
import jq.g0;
import jq.z;
import jr.e0;
import jr.h0;
import k6.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.p0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o5.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x6.ImageRequest;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJß\u0001\u0010,\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001e2\b\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010#\u001a\u0004\u0018\u00010\u000f2\u0006\u0010%\u001a\u00020$2\b\u0010&\u001a\u0004\u0018\u00010\u000f2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\b0'2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\b0'2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\b0'2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\b0'H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001eH\u0002¢\u0006\u0004\b.\u0010/J\u0019\u00100\u001a\u0004\u0018\u00010\b2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b0\u00101J!\u00105\u001a\u00020\b2\u0006\u00102\u001a\u00020$2\b\b\u0002\u00104\u001a\u000203H\u0002¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\bH\u0002¢\u0006\u0004\b7\u0010\nR\u0014\u0010:\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00109R\u0014\u0010=\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010<R\u0018\u0010A\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010 \u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010F\u001a\u00020>8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010E¨\u0006G"}, d2 = {"Lto/j;", "Lto/k;", "Landroid/content/Context;", "context", "Landroid/view/ViewGroup;", "container", "<init>", "(Landroid/content/Context;Landroid/view/ViewGroup;)V", "", "a", "()V", "Lan/y;", "viewEnvironment", "Lk6/s;", "imageLoader", "", "imagePath", "messageText", "disclaimerText", "acceptText", "retryText", "confirmCaptureTitle", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;", "overlayImage", "Lio/k2;", "overlayAssets", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "iconAsset", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "navigationState", "", "isEnabled", "isProcessing", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "error", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;", "reviewCaptureButtonsAxis", "navBarTitle", "Lkotlin/Function0;", "onAcceptImageClick", "onRetryClick", "onCancelClick", "onErrorDismissed", "b", "(Lan/y;Lk6/s;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;Lio/k2;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;ZZLcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "y", "(Z)V", "l", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;)Lkotlin/Unit;", "preferredAxis", "", "originalCallTimestamp", "u", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;J)V", "t", "Lno/i;", "Lno/i;", "binding", "Landroidx/constraintlayout/widget/c;", "Landroidx/constraintlayout/widget/c;", "constraintSet", "Landroid/view/View;", "c", "Landroid/view/View;", "currentOverlayAssetView", "d", "Z", "getRoot", "()Landroid/view/View;", "root", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final no.i binding;

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
        no.i iVarC = no.i.c(LayoutInflater.from(context), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(iVarC, "inflate(...)");
        this.binding = iVarC;
        this.constraintSet = new androidx.constraintlayout.widget.c();
    }

    public static final void m(no.i iVar) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(iVar.f26550j, "alpha", 0.9f, 0.0f).setDuration(500L);
        duration.setInterpolator(new LinearInterpolator());
        duration.start();
        iVar.getRoot().setHapticFeedbackEnabled(true);
        iVar.getRoot().performHapticFeedback(1, 2);
    }

    public static final void n(no.i iVar, f7.i iVar2) {
        iVar.f26556p.setProgress(1.0f);
    }

    public static final Unit o(no.i iVar, String str, s sVar) {
        int iF = kotlin.ranges.d.f(iVar.f26562v.getMeasuredWidth(), 2000);
        if (iF > 0) {
            iVar.f26562v.setTag(vp.e.f33371a, str);
            ImageView reviewImage = iVar.f26562v;
            Intrinsics.checkNotNullExpressionValue(reviewImage, "reviewImage");
            ImageRequest.a aVarQ = x6.j.q(new ImageRequest.a(reviewImage.getContext()).c(new File(str)), reviewImage);
            aVarQ.s(iF, iF);
            aVarQ.j(str);
            sVar.c(aVarQ.b());
        }
        return Unit.f22483a;
    }

    public static final Unit p(Function0 function0) {
        function0.invoke();
        return Unit.f22483a;
    }

    public static final Unit q(Function0 function0) {
        function0.invoke();
        return Unit.f22483a;
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

    public static final Unit w(no.i iVar, long j10, final j jVar, StyleElements.Axis axis) {
        boolean z10 = (iVar.b.getLineCount() == 0 || iVar.f26561u.getLineCount() == 0) ? false : true;
        boolean z11 = System.currentTimeMillis() - j10 > 300;
        if (!z10 && !z11) {
            jVar.u(axis, j10);
            return Unit.f22483a;
        }
        if (z10 && (iVar.b.getLineCount() > 1 || iVar.f26561u.getLineCount() > 1 || axis == StyleElements.Axis.VERTICAL)) {
            PersonaMaterialButton acceptButton = iVar.b;
            Intrinsics.checkNotNullExpressionValue(acceptButton, "acceptButton");
            ViewGroup.LayoutParams layoutParams = acceptButton.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = iVar.f26551k.getWidth();
            acceptButton.setLayoutParams(layoutParams);
            PersonaMaterialButton retryButton = iVar.f26561u;
            Intrinsics.checkNotNullExpressionValue(retryButton, "retryButton");
            ViewGroup.LayoutParams layoutParams2 = retryButton.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams2.width = iVar.f26551k.getWidth();
            retryButton.setLayoutParams(layoutParams2);
            iVar.f26551k.setReferencedIds(new int[]{iVar.b.getId(), iVar.f26561u.getId()});
            jVar.binding.f26552l.setAccessibilityTraversalAfter(n2.f20747w0);
        }
        b0.a(iVar.b, new Runnable() { // from class: to.i
            @Override // java.lang.Runnable
            public final void run() {
                j.x(this.f31933a);
            }
        });
        return Unit.f22483a;
    }

    public static final void x(j jVar) {
        jVar.t();
    }

    @Override // to.k
    public void a() {
        CoordinatorLayout cameraScreenContent = this.binding.f26544d;
        Intrinsics.checkNotNullExpressionValue(cameraScreenContent, "cameraScreenContent");
        wq.g.d(cameraScreenContent, false, false, false, false, 15, null);
        ThemeableLottieAnimationView themeableLottieAnimationView = this.binding.f26556p;
        int color = Color.parseColor("#43957D");
        Context context = this.binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        themeableLottieAnimationView.F(color, z.d(context, i.a.f19910z, null, false, 6, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // to.k
    public void b(@NotNull ViewEnvironment viewEnvironment, @NotNull final s imageLoader, @NotNull final String imagePath, @NotNull String messageText, @NotNull String disclaimerText, @NotNull String acceptText, @NotNull String retryText, @NotNull String confirmCaptureTitle, @NotNull Screen.Overlay overlayImage, @NotNull OverlayAssets overlayAssets, @Nullable RemoteImage iconAsset, @NotNull NavigationState navigationState, boolean isEnabled, boolean isProcessing, @Nullable StepStyles.GovernmentIdStepStyle styles, @Nullable String error, @NotNull StyleElements.Axis reviewCaptureButtonsAxis, @Nullable String navBarTitle, @NotNull final Function0<Unit> onAcceptImageClick, @NotNull final Function0<Unit> onRetryClick, @NotNull final Function0<Unit> onCancelClick, @NotNull Function0<Unit> onErrorDismissed) {
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
        final no.i iVar = this.binding;
        if (iVar.f26543c.isChecked()) {
            iVar.f26556p.j(new n0() { // from class: to.b
                @Override // f7.n0
                public final void a(f7.i iVar2) {
                    j.n(iVar, iVar2);
                }
            });
        } else {
            iVar.f26543c.setChecked(true);
            iVar.getRoot().post(new Runnable() { // from class: to.a
                @Override // java.lang.Runnable
                public final void run() {
                    j.m(iVar);
                }
            });
        }
        Object tag = iVar.f26562v.getTag(vp.e.f33371a);
        if (!Intrinsics.c(tag instanceof String ? (String) tag : null, imagePath)) {
            ImageView reviewImage = iVar.f26562v;
            Intrinsics.checkNotNullExpressionValue(reviewImage, "reviewImage");
            wq.z.b(reviewImage, new Function0() { // from class: to.c
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return j.o(iVar, imagePath, imageLoader);
                }
            });
        }
        iVar.f26558r.setText(messageText);
        iVar.f26547g.setVisibility(StringsKt.p0(disclaimerText) ? 8 : 0);
        iVar.f26546f.setVisibility(StringsKt.p0(disclaimerText) ? 8 : 0);
        iVar.f26546f.setText(disclaimerText);
        iVar.b.setText(acceptText);
        iVar.f26561u.setText(retryText);
        iVar.f26566z.setText(confirmCaptureTitle);
        TextView textView = iVar.f26566z;
        CharSequence text = textView.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        textView.setVisibility(StringsKt.p0(text) ? 8 : 0);
        Context context = iVar.getRoot().getContext();
        View view = iVar.f26553m;
        Intrinsics.checkNotNull(context);
        view.setBackground(com.withpersona.sdk2.inquiry.governmentid.o.a(context, vp.a.f33350k));
        if (z.b(context, vp.a.f33347h, null, false, false, 14, null)) {
            iVar.f26558r.setGravity(17);
            TextView overlayText = iVar.f26558r;
            Intrinsics.checkNotNullExpressionValue(overlayText, "overlayText");
            ViewGroup.LayoutParams layoutParams = overlayText.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginStart(0);
            overlayText.setLayoutParams(marginLayoutParams);
        }
        Integer numF = z.f(context, vp.a.f33355p, null, false, 6, null);
        if (numF != null) {
            iVar.f26547g.setImageResource(numF.intValue());
        }
        iVar.f26554n.setImageResource(overlayAssets.getGuideDrawable());
        if (iconAsset == null) {
            textBasedComponentStyle = null;
            iVar.f26556p.setAnimation(overlayAssets.getHintAnimation());
        } else if (this.currentOverlayAssetView == null) {
            ConstraintLayout overlayIconContainer = iVar.f26557q;
            Intrinsics.checkNotNullExpressionValue(overlayIconContainer, "overlayIconContainer");
            textBasedComponentStyle = null;
            this.currentOverlayAssetView = lr.c.f(iconAsset, overlayIconContainer, false, 2, null);
            iVar.f26556p.setVisibility(8);
        } else {
            textBasedComponentStyle = null;
        }
        Function0 function0 = new Function0() { // from class: to.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return j.p(onRetryClick);
            }
        };
        Function0 function1 = new Function0() { // from class: to.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return j.q(onCancelClick);
            }
        };
        Pi2NavigationBar navigationBar = iVar.f26552l;
        Intrinsics.checkNotNullExpressionValue(navigationBar, "navigationBar");
        FrameLayout frameLayoutB = iVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(frameLayoutB, "getRoot(...)");
        ir.c.e(navigationState, function0, function1, null, navigationBar, frameLayoutB, styles != null ? er.h.h(styles) : textBasedComponentStyle, navBarTitle, styles != null ? styles.getNavBarTitleStyleValue() : textBasedComponentStyle, 8, null);
        iVar.b.setOnClickListener(new View.OnClickListener() { // from class: to.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                j.r(onAcceptImageClick, view2);
            }
        });
        iVar.f26561u.setOnClickListener(new View.OnClickListener() { // from class: to.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                j.s(onRetryClick, view2);
            }
        });
        iVar.b.setEnabled(isEnabled);
        iVar.f26561u.setEnabled(isEnabled);
        y(isProcessing);
        if (styles != null) {
            l(styles);
            int iC = l2.b.c(this.binding.getRoot().getContext(), vp.b.f33360a);
            Context context2 = this.binding.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            vq.c.b(viewEnvironment, context2, iC);
        }
        v(this, reviewCaptureButtonsAxis, 0L, 2, null);
        CoordinatorLayout cameraScreenContent = this.binding.f26544d;
        Intrinsics.checkNotNullExpressionValue(cameraScreenContent, "cameraScreenContent");
        g0.b(cameraScreenContent, error, onErrorDismissed, null, 0, 0, 56, null);
    }

    @Override // to.k
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
        no.i iVar = this.binding;
        float fA = (float) jq.j.a(8.0d);
        int iA = (int) jq.j.a(3.0d);
        TextBasedComponentStyle titleStyleValue = styles.getTitleStyleValue();
        if (titleStyleValue != null) {
            TextView title = this.binding.f26566z;
            Intrinsics.checkNotNullExpressionValue(title, "title");
            h0.l(title, titleStyleValue, null, 2, null);
            this.binding.f26566z.setTextColor(-1);
        }
        TextBasedComponentStyle governmentIdCaptureHintTextStyle = styles.getGovernmentIdCaptureHintTextStyle();
        if (governmentIdCaptureHintTextStyle != null) {
            TextView overlayText = this.binding.f26558r;
            Intrinsics.checkNotNullExpressionValue(overlayText, "overlayText");
            h0.k(overlayText, governmentIdCaptureHintTextStyle, p0.c(e0.LineHeight));
        }
        Integer governmentIdReviewImageBoxBorderColorValue = styles.getGovernmentIdReviewImageBoxBorderColorValue();
        if (governmentIdReviewImageBoxBorderColorValue != null) {
            iIntValue = governmentIdReviewImageBoxBorderColorValue.intValue();
            iVar.f26560t.setIndeterminateTintList(new ColorStateList(new int[][]{new int[0]}, new int[]{iIntValue}));
        } else {
            iIntValue = -1;
        }
        TextView disclaimer = this.binding.f26546f;
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
            fA = (float) jq.j.a(governmentIdReviewImageBoxBorderRadiusValue.doubleValue());
        }
        Double governmentIdReviewImageBoxBorderWidthValue = styles.getGovernmentIdReviewImageBoxBorderWidthValue();
        if (governmentIdReviewImageBoxBorderWidthValue != null) {
            iA = (int) Math.ceil(jq.j.a(governmentIdReviewImageBoxBorderWidthValue.doubleValue()));
        }
        iVar.f26563w.setRadius(iA + fA);
        View view = iVar.f26553m;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(fA);
        gradientDrawable.setStroke(iA, iIntValue);
        view.setBackground(gradientDrawable);
        ConstraintLayout constraintLayout = iVar.f26555o;
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(-1);
        gradientDrawable2.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, fA, fA, fA, fA});
        constraintLayout.setBackground(new InsetDrawable((Drawable) gradientDrawable2, (int) jq.j.a(6.0d)));
        ButtonSubmitComponentStyle submitPhotoButtonStyleValue = styles.getSubmitPhotoButtonStyleValue();
        if (submitPhotoButtonStyleValue != null) {
            PersonaMaterialButton acceptButton = iVar.b;
            Intrinsics.checkNotNullExpressionValue(acceptButton, "acceptButton");
            jr.e.h(acceptButton, submitPhotoButtonStyleValue, false, false, false, 10, null);
        }
        ButtonCancelComponentStyle retakePhotoButtonStyleValue = styles.getRetakePhotoButtonStyleValue();
        if (retakePhotoButtonStyleValue != null) {
            PersonaMaterialButton retryButton = iVar.f26561u;
            Intrinsics.checkNotNullExpressionValue(retryButton, "retryButton");
            jr.e.h(retryButton, retakePhotoButtonStyleValue, false, false, false, 10, null);
        }
        Integer captureHintIconStrokeColor = styles.getCaptureHintIconStrokeColor();
        if (captureHintIconStrokeColor != null) {
            this.binding.f26556p.F(Color.parseColor("#000000"), captureHintIconStrokeColor.intValue());
        }
        Integer captureHintIconFillColor = styles.getCaptureHintIconFillColor();
        if (captureHintIconFillColor != null) {
            this.binding.f26556p.F(Color.parseColor("#43957D"), captureHintIconFillColor.intValue());
        }
        Integer capturePageHeaderIconColorValue = styles.getCapturePageHeaderIconColorValue();
        if (capturePageHeaderIconColorValue != null) {
            this.binding.f26552l.setControlsColor(capturePageHeaderIconColorValue.intValue());
        }
        StepStyles.StepPaddingStyle padding = styles.getPadding();
        if (padding != null && (screen2 = padding.getScreen()) != null && (base2 = screen2.getBase()) != null && (left = base2.getLeft()) != null && (dp3 = left.getDp()) != null) {
            this.binding.f26565y.setGuidelineBegin((int) jq.j.a(dp3.doubleValue()));
        }
        StepStyles.StepPaddingStyle padding2 = styles.getPadding();
        if (padding2 == null || (screen = padding2.getScreen()) == null || (base = screen.getBase()) == null || (right = base.getRight()) == null || (dp2 = right.getDp()) == null) {
            return null;
        }
        this.binding.f26549i.setGuidelineEnd((int) jq.j.a(dp2.doubleValue()));
        return Unit.f22483a;
    }

    public final void t() {
        no.i iVar = this.binding;
        if (iVar.b.getTop() < iVar.f26548h.getBottom() + iVar.getRoot().getContext().getResources().getDimensionPixelOffset(l2.f20684a)) {
            this.constraintSet.e(iVar.getRoot().getContext(), o2.f20764j);
            y.a(this.binding.f26544d, new o5.a());
            this.constraintSet.c(this.binding.f26545e);
        }
    }

    public final void u(final StyleElements.Axis preferredAxis, final long originalCallTimestamp) {
        final no.i iVar = this.binding;
        PersonaMaterialButton acceptButton = iVar.b;
        Intrinsics.checkNotNullExpressionValue(acceptButton, "acceptButton");
        wq.z.b(acceptButton, new Function0() { // from class: to.h
            @Override // kotlin.jvm.functions.Function0
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
        no.i iVar = this.binding;
        o5.b0 b0VarT0 = new o5.b0().D0(new o5.e(3)).D0(new o5.b()).D0(new o5.c()).D0(new o5.d()).M0(0).t0(300L);
        Intrinsics.checkNotNullExpressionValue(b0VarT0, "setDuration(...)");
        y.a(iVar.getRoot(), b0VarT0);
        if (isProcessing) {
            iVar.f26559s.setVisibility(0);
            iVar.f26548h.setVisibility(4);
            iVar.b.setVisibility(4);
            iVar.f26561u.setVisibility(4);
            iVar.f26555o.setVisibility(4);
            return;
        }
        iVar.f26559s.setVisibility(4);
        iVar.f26548h.setVisibility(0);
        iVar.b.setVisibility(0);
        iVar.f26561u.setVisibility(0);
        iVar.f26555o.setVisibility(0);
    }
}
