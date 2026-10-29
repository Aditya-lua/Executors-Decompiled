package to;

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
import androidx.constraintlayout.widget.C0518c;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewTreeObserverOnPreDrawListenerC0586b0;
import com.withpersona.sdk2.inquiry.governmentid.C3571o;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.ButtonCancelComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.p055ui.PersonaMaterialButton;
import com.withpersona.sdk2.inquiry.shared.p055ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.p055ui.ThemeableLottieAnimationView;
import er.C5199h;
import io.C6887l2;
import io.C6895n2;
import io.C6899o2;
import io.OverlayAssets;
import ir.C6966c;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7700p0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C7764d;
import kotlin.text.StringsKt;
import lr.C8243c;
import no.C9533i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p016an.ViewEnvironment;
import p121f7.C5452i;
import p121f7.InterfaceC5463n0;
import p181i.C6589a;
import p226jq.C7260g0;
import p226jq.C7265j;
import p226jq.C7288z;
import p227jr.C7297e;
import p227jr.C7304h0;
import p227jr.EnumC7298e0;
import p239k6.InterfaceC7479s;
import p261l2.C7975b;
import p322o5.C9651a;
import p322o5.C9653b;
import p322o5.C9654b0;
import p322o5.C9655c;
import p322o5.C9657d;
import p322o5.C9659e;
import p322o5.C9691y;
import p497vp.C12238a;
import p497vp.C12239b;
import p497vp.C12242e;
import p498vq.C12249c;
import p526wq.C12524g;
import p526wq.C12543z;
import p537x6.C12749j;
import p537x6.ImageRequest;

/* JADX INFO: renamed from: to.j */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJß\u0001\u0010,\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001e2\b\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010#\u001a\u0004\u0018\u00010\u000f2\u0006\u0010%\u001a\u00020$2\b\u0010&\u001a\u0004\u0018\u00010\u000f2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\b0'2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\b0'2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\b0'2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\b0'H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001eH\u0002¢\u0006\u0004\b.\u0010/J\u0019\u00100\u001a\u0004\u0018\u00010\b2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b0\u00101J!\u00105\u001a\u00020\b2\u0006\u00102\u001a\u00020$2\b\b\u0002\u00104\u001a\u000203H\u0002¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\bH\u0002¢\u0006\u0004\b7\u0010\nR\u0014\u0010:\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00109R\u0014\u0010=\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010<R\u0018\u0010A\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010 \u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010F\u001a\u00020>8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010E¨\u0006G"}, m31665d2 = {"Lto/j;", "Lto/k;", "Landroid/content/Context;", "context", "Landroid/view/ViewGroup;", "container", "<init>", "(Landroid/content/Context;Landroid/view/ViewGroup;)V", "", "a", "()V", "Lan/y;", "viewEnvironment", "Lk6/s;", "imageLoader", "", "imagePath", "messageText", "disclaimerText", "acceptText", "retryText", "confirmCaptureTitle", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;", "overlayImage", "Lio/k2;", "overlayAssets", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "iconAsset", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "navigationState", "", "isEnabled", "isProcessing", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "error", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;", "reviewCaptureButtonsAxis", "navBarTitle", "Lkotlin/Function0;", "onAcceptImageClick", "onRetryClick", "onCancelClick", "onErrorDismissed", "b", "(Lan/y;Lk6/s;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;Lio/k2;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;ZZLcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "y", "(Z)V", "l", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;)Lkotlin/Unit;", "preferredAxis", "", "originalCallTimestamp", "u", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;J)V", "t", "Lno/i;", "Lno/i;", "binding", "Landroidx/constraintlayout/widget/c;", "Landroidx/constraintlayout/widget/c;", "constraintSet", "Landroid/view/View;", "c", "Landroid/view/View;", "currentOverlayAssetView", "d", "Z", "getRoot", "()Landroid/view/View;", "root", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C11724j implements InterfaceC11725k {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C9533i binding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C0518c constraintSet;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public View currentOverlayAssetView;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public boolean isProcessing;

    public C11724j(@NotNull Context context, @Nullable ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(context, "context");
        C9533i c9533iM37636c = C9533i.m37636c(LayoutInflater.from(context), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c9533iM37636c, "inflate(...)");
        this.binding = c9533iM37636c;
        this.constraintSet = new C0518c();
    }

    /* JADX INFO: renamed from: m */
    public static final void m43916m(C9533i c9533i) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(c9533i.f34406j, "alpha", 0.9f, 0.0f).setDuration(500L);
        duration.setInterpolator(new LinearInterpolator());
        duration.start();
        c9533i.getRoot().setHapticFeedbackEnabled(true);
        c9533i.getRoot().performHapticFeedback(1, 2);
    }

    /* JADX INFO: renamed from: n */
    public static final void m43917n(C9533i c9533i, C5452i c5452i) {
        c9533i.f34412p.setProgress(1.0f);
    }

    /* JADX INFO: renamed from: o */
    public static final Unit m43918o(C9533i c9533i, String str, InterfaceC7479s interfaceC7479s) {
        int iM32081f = C7764d.m32081f(c9533i.f34418v.getMeasuredWidth(), 2000);
        if (iM32081f > 0) {
            c9533i.f34418v.setTag(C12242e.f43202a, str);
            ImageView reviewImage = c9533i.f34418v;
            Intrinsics.checkNotNullExpressionValue(reviewImage, "reviewImage");
            ImageRequest.a aVarM47600q = C12749j.m47600q(new ImageRequest.a(reviewImage.getContext()).m47525c(new File(str)), reviewImage);
            aVarM47600q.m47540s(iM32081f, iM32081f);
            aVarM47600q.m47532j(str);
            interfaceC7479s.mo31067c(aVarM47600q.m47524b());
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m43919p(Function0 function0) {
        function0.invoke();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m43920q(Function0 function0) {
        function0.invoke();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: r */
    public static final void m43921r(Function0 function0, View view) {
        function0.invoke();
    }

    /* JADX INFO: renamed from: s */
    public static final void m43922s(Function0 function0, View view) {
        function0.invoke();
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m43923v(C11724j c11724j, StyleElements.Axis axis, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = System.currentTimeMillis();
        }
        c11724j.m43930u(axis, j10);
    }

    /* JADX INFO: renamed from: w */
    public static final Unit m43924w(C9533i c9533i, long j10, final C11724j c11724j, StyleElements.Axis axis) {
        boolean z10 = (c9533i.f34398b.getLineCount() == 0 || c9533i.f34417u.getLineCount() == 0) ? false : true;
        boolean z11 = System.currentTimeMillis() - j10 > 300;
        if (!z10 && !z11) {
            c11724j.m43930u(axis, j10);
            return Unit.f29331a;
        }
        if (z10 && (c9533i.f34398b.getLineCount() > 1 || c9533i.f34417u.getLineCount() > 1 || axis == StyleElements.Axis.VERTICAL)) {
            PersonaMaterialButton acceptButton = c9533i.f34398b;
            Intrinsics.checkNotNullExpressionValue(acceptButton, "acceptButton");
            ViewGroup.LayoutParams layoutParams = acceptButton.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = c9533i.f34407k.getWidth();
            acceptButton.setLayoutParams(layoutParams);
            PersonaMaterialButton retryButton = c9533i.f34417u;
            Intrinsics.checkNotNullExpressionValue(retryButton, "retryButton");
            ViewGroup.LayoutParams layoutParams2 = retryButton.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams2.width = c9533i.f34407k.getWidth();
            retryButton.setLayoutParams(layoutParams2);
            c9533i.f34407k.setReferencedIds(new int[]{c9533i.f34398b.getId(), c9533i.f34417u.getId()});
            c11724j.binding.f34408l.setAccessibilityTraversalAfter(C6895n2.f27100w0);
        }
        ViewTreeObserverOnPreDrawListenerC0586b0.m2815a(c9533i.f34398b, new Runnable() { // from class: to.i
            @Override // java.lang.Runnable
            public final void run() {
                C11724j.m43925x(this.f41377a);
            }
        });
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: x */
    public static final void m43925x(C11724j c11724j) {
        c11724j.m43929t();
    }

    @Override // to.InterfaceC11725k
    /* JADX INFO: renamed from: a */
    public void mo43926a() {
        CoordinatorLayout cameraScreenContent = this.binding.f34400d;
        Intrinsics.checkNotNullExpressionValue(cameraScreenContent, "cameraScreenContent");
        C12524g.m46873d(cameraScreenContent, false, false, false, false, 15, null);
        ThemeableLottieAnimationView themeableLottieAnimationView = this.binding.f34412p;
        int color = Color.parseColor("#43957D");
        Context context = this.binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        themeableLottieAnimationView.m20474F(color, C7288z.m30328d(context, C6589a.f25047z, null, false, 6, null));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r20v0, resolved type: android.graphics.Rect */
    /* JADX DEBUG: Multi-variable search result rejected for r20v1, resolved type: android.graphics.Rect */
    /* JADX DEBUG: Multi-variable search result rejected for r20v2, resolved type: android.graphics.Rect */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // to.InterfaceC11725k
    /* JADX INFO: renamed from: b */
    public void mo43927b(@NotNull ViewEnvironment viewEnvironment, @NotNull final InterfaceC7479s imageLoader, @NotNull final String imagePath, @NotNull String messageText, @NotNull String disclaimerText, @NotNull String acceptText, @NotNull String retryText, @NotNull String confirmCaptureTitle, @NotNull Screen.Overlay overlayImage, @NotNull OverlayAssets overlayAssets, @Nullable RemoteImage iconAsset, @NotNull NavigationState navigationState, boolean isEnabled, boolean isProcessing, @Nullable StepStyles.GovernmentIdStepStyle styles, @Nullable String error, @NotNull StyleElements.Axis reviewCaptureButtonsAxis, @Nullable String navBarTitle, @NotNull final Function0<Unit> onAcceptImageClick, @NotNull final Function0<Unit> onRetryClick, @NotNull final Function0<Unit> onCancelClick, @NotNull Function0<Unit> onErrorDismissed) {
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
        final C9533i c9533i = this.binding;
        if (c9533i.f34399c.isChecked()) {
            c9533i.f34412p.m8422j(new InterfaceC5463n0() { // from class: to.b
                @Override // p121f7.InterfaceC5463n0
                /* JADX INFO: renamed from: a */
                public final void mo21732a(C5452i c5452i) {
                    C11724j.m43917n(c9533i, c5452i);
                }
            });
        } else {
            c9533i.f34399c.setChecked(true);
            c9533i.getRoot().post(new Runnable() { // from class: to.a
                @Override // java.lang.Runnable
                public final void run() {
                    C11724j.m43916m(c9533i);
                }
            });
        }
        Object tag = c9533i.f34418v.getTag(C12242e.f43202a);
        if (!Intrinsics.m31980c(tag instanceof String ? (String) tag : null, imagePath)) {
            ImageView reviewImage = c9533i.f34418v;
            Intrinsics.checkNotNullExpressionValue(reviewImage, "reviewImage");
            C12543z.m46890b(reviewImage, new Function0() { // from class: to.c
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C11724j.m43918o(c9533i, imagePath, imageLoader);
                }
            });
        }
        c9533i.f34414r.setText(messageText);
        c9533i.f34403g.setVisibility(StringsKt.m32182p0(disclaimerText) ? 8 : 0);
        c9533i.f34402f.setVisibility(StringsKt.m32182p0(disclaimerText) ? 8 : 0);
        c9533i.f34402f.setText(disclaimerText);
        c9533i.f34398b.setText(acceptText);
        c9533i.f34417u.setText(retryText);
        c9533i.f34422z.setText(confirmCaptureTitle);
        TextView textView = c9533i.f34422z;
        CharSequence text = textView.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        textView.setVisibility(StringsKt.m32182p0(text) ? 8 : 0);
        Context context = c9533i.getRoot().getContext();
        View view = c9533i.f34409m;
        Intrinsics.checkNotNull(context);
        view.setBackground(C3571o.m17729a(context, C12238a.f43178k));
        if (C7288z.m30326b(context, C12238a.f43175h, null, false, false, 14, null)) {
            c9533i.f34414r.setGravity(17);
            TextView overlayText = c9533i.f34414r;
            Intrinsics.checkNotNullExpressionValue(overlayText, "overlayText");
            ViewGroup.LayoutParams layoutParams = overlayText.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginStart(0);
            overlayText.setLayoutParams(marginLayoutParams);
        }
        Integer numM30330f = C7288z.m30330f(context, C12238a.f43183p, null, false, 6, null);
        if (numM30330f != null) {
            c9533i.f34403g.setImageResource(numM30330f.intValue());
        }
        c9533i.f34410n.setImageResource(overlayAssets.getGuideDrawable());
        if (iconAsset == null) {
            textBasedComponentStyle = null;
            c9533i.f34412p.setAnimation(overlayAssets.getHintAnimation());
        } else if (this.currentOverlayAssetView == null) {
            ConstraintLayout overlayIconContainer = c9533i.f34413q;
            Intrinsics.checkNotNullExpressionValue(overlayIconContainer, "overlayIconContainer");
            textBasedComponentStyle = null;
            this.currentOverlayAssetView = C8243c.m33618f(iconAsset, overlayIconContainer, false, 2, null);
            c9533i.f34412p.setVisibility(8);
        } else {
            textBasedComponentStyle = null;
        }
        Function0 function0 = new Function0() { // from class: to.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C11724j.m43919p(onRetryClick);
            }
        };
        Function0 function1 = new Function0() { // from class: to.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C11724j.m43920q(onCancelClick);
            }
        };
        Pi2NavigationBar navigationBar = c9533i.f34408l;
        Intrinsics.checkNotNullExpressionValue(navigationBar, "navigationBar");
        FrameLayout frameLayoutM37637b = c9533i.getRoot();
        Intrinsics.checkNotNullExpressionValue(frameLayoutM37637b, "getRoot(...)");
        C6966c.m29335e(navigationState, function0, function1, null, navigationBar, frameLayoutM37637b, styles != null ? C5199h.m24132h(styles) : textBasedComponentStyle, navBarTitle, styles != null ? styles.getNavBarTitleStyleValue() : textBasedComponentStyle, 8, null);
        c9533i.f34398b.setOnClickListener(new View.OnClickListener() { // from class: to.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C11724j.m43921r(onAcceptImageClick, view2);
            }
        });
        c9533i.f34417u.setOnClickListener(new View.OnClickListener() { // from class: to.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C11724j.m43922s(onRetryClick, view2);
            }
        });
        c9533i.f34398b.setEnabled(isEnabled);
        c9533i.f34417u.setEnabled(isEnabled);
        m43931y(isProcessing);
        if (styles != null) {
            m43928l(styles);
            int iM33005c = C7975b.m33005c(this.binding.getRoot().getContext(), C12239b.f43188a);
            Context context2 = this.binding.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            C12249c.m45393b(viewEnvironment, context2, iM33005c);
        }
        m43923v(this, reviewCaptureButtonsAxis, 0L, 2, null);
        CoordinatorLayout cameraScreenContent = this.binding.f34400d;
        Intrinsics.checkNotNullExpressionValue(cameraScreenContent, "cameraScreenContent");
        C7260g0.m30278b(cameraScreenContent, error, onErrorDismissed, null, 0, 0, 56, null);
    }

    @Override // to.InterfaceC11725k
    @NotNull
    public View getRoot() {
        FrameLayout frameLayoutM37637b = this.binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(frameLayoutM37637b, "getRoot(...)");
        return frameLayoutM37637b;
    }

    /* JADX INFO: renamed from: l */
    public final Unit m43928l(StepStyles.GovernmentIdStepStyle styles) {
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
        C9533i c9533i = this.binding;
        float fM30285a = (float) C7265j.m30285a(8.0d);
        int iM30285a = (int) C7265j.m30285a(3.0d);
        TextBasedComponentStyle titleStyleValue = styles.getTitleStyleValue();
        if (titleStyleValue != null) {
            TextView title = this.binding.f34422z;
            Intrinsics.checkNotNullExpressionValue(title, "title");
            C7304h0.m30392l(title, titleStyleValue, null, 2, null);
            this.binding.f34422z.setTextColor(-1);
        }
        TextBasedComponentStyle governmentIdCaptureHintTextStyle = styles.getGovernmentIdCaptureHintTextStyle();
        if (governmentIdCaptureHintTextStyle != null) {
            TextView overlayText = this.binding.f34414r;
            Intrinsics.checkNotNullExpressionValue(overlayText, "overlayText");
            C7304h0.m30391k(overlayText, governmentIdCaptureHintTextStyle, C7700p0.m31904c(EnumC7298e0.LineHeight));
        }
        Integer governmentIdReviewImageBoxBorderColorValue = styles.getGovernmentIdReviewImageBoxBorderColorValue();
        if (governmentIdReviewImageBoxBorderColorValue != null) {
            iIntValue = governmentIdReviewImageBoxBorderColorValue.intValue();
            c9533i.f34416t.setIndeterminateTintList(new ColorStateList(new int[][]{new int[0]}, new int[]{iIntValue}));
        } else {
            iIntValue = -1;
        }
        TextView disclaimer = this.binding.f34402f;
        Intrinsics.checkNotNullExpressionValue(disclaimer, "disclaimer");
        StepStyles.GovernmentIdStepTextBasedComponentStyle textStyle = styles.getTextStyle();
        String fontNameValue = (textStyle == null || (base5 = textStyle.getBase()) == null || (base6 = base5.getBase()) == null) ? null : base6.getFontNameValue();
        StepStyles.GovernmentIdStepTextBasedComponentStyle textStyle2 = styles.getTextStyle();
        if (textStyle2 == null || (base3 = textStyle2.getBase()) == null || (base4 = base3.getBase()) == null || (fontWeightValue = base4.getFontWeightValue()) == null) {
            fontWeightValue = StyleElements.FontWeight.NORMAL;
        }
        C7304h0.m30389i(disclaimer, fontNameValue, fontWeightValue, null, 4, null);
        Double governmentIdReviewImageBoxBorderRadiusValue = styles.getGovernmentIdReviewImageBoxBorderRadiusValue();
        if (governmentIdReviewImageBoxBorderRadiusValue != null) {
            fM30285a = (float) C7265j.m30285a(governmentIdReviewImageBoxBorderRadiusValue.doubleValue());
        }
        Double governmentIdReviewImageBoxBorderWidthValue = styles.getGovernmentIdReviewImageBoxBorderWidthValue();
        if (governmentIdReviewImageBoxBorderWidthValue != null) {
            iM30285a = (int) Math.ceil(C7265j.m30285a(governmentIdReviewImageBoxBorderWidthValue.doubleValue()));
        }
        c9533i.f34419w.setRadius(iM30285a + fM30285a);
        View view = c9533i.f34409m;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(fM30285a);
        gradientDrawable.setStroke(iM30285a, iIntValue);
        view.setBackground(gradientDrawable);
        ConstraintLayout constraintLayout = c9533i.f34411o;
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(-1);
        gradientDrawable2.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, fM30285a, fM30285a, fM30285a, fM30285a});
        constraintLayout.setBackground(new InsetDrawable((Drawable) gradientDrawable2, (int) C7265j.m30285a(6.0d)));
        ButtonSubmitComponentStyle submitPhotoButtonStyleValue = styles.getSubmitPhotoButtonStyleValue();
        if (submitPhotoButtonStyleValue != null) {
            PersonaMaterialButton acceptButton = c9533i.f34398b;
            Intrinsics.checkNotNullExpressionValue(acceptButton, "acceptButton");
            C7297e.m30364h(acceptButton, submitPhotoButtonStyleValue, false, false, false, 10, null);
        }
        ButtonCancelComponentStyle retakePhotoButtonStyleValue = styles.getRetakePhotoButtonStyleValue();
        if (retakePhotoButtonStyleValue != null) {
            PersonaMaterialButton retryButton = c9533i.f34417u;
            Intrinsics.checkNotNullExpressionValue(retryButton, "retryButton");
            C7297e.m30364h(retryButton, retakePhotoButtonStyleValue, false, false, false, 10, null);
        }
        Integer captureHintIconStrokeColor = styles.getCaptureHintIconStrokeColor();
        if (captureHintIconStrokeColor != null) {
            this.binding.f34412p.m20474F(Color.parseColor("#000000"), captureHintIconStrokeColor.intValue());
        }
        Integer captureHintIconFillColor = styles.getCaptureHintIconFillColor();
        if (captureHintIconFillColor != null) {
            this.binding.f34412p.m20474F(Color.parseColor("#43957D"), captureHintIconFillColor.intValue());
        }
        Integer capturePageHeaderIconColorValue = styles.getCapturePageHeaderIconColorValue();
        if (capturePageHeaderIconColorValue != null) {
            this.binding.f34408l.setControlsColor(capturePageHeaderIconColorValue.intValue());
        }
        StepStyles.StepPaddingStyle padding = styles.getPadding();
        if (padding != null && (screen2 = padding.getScreen()) != null && (base2 = screen2.getBase()) != null && (left = base2.getLeft()) != null && (dp3 = left.getDp()) != null) {
            this.binding.f34421y.setGuidelineBegin((int) C7265j.m30285a(dp3.doubleValue()));
        }
        StepStyles.StepPaddingStyle padding2 = styles.getPadding();
        if (padding2 == null || (screen = padding2.getScreen()) == null || (base = screen.getBase()) == null || (right = base.getRight()) == null || (dp2 = right.getDp()) == null) {
            return null;
        }
        this.binding.f34405i.setGuidelineEnd((int) C7265j.m30285a(dp2.doubleValue()));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: t */
    public final void m43929t() {
        C9533i c9533i = this.binding;
        if (c9533i.f34398b.getTop() < c9533i.f34404h.getBottom() + c9533i.getRoot().getContext().getResources().getDimensionPixelOffset(C6887l2.f26990a)) {
            this.constraintSet.m2508e(c9533i.getRoot().getContext(), C6899o2.f27118j);
            C9691y.m38301a(this.binding.f34400d, new C9651a());
            this.constraintSet.m2506c(this.binding.f34401e);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m43930u(final StyleElements.Axis preferredAxis, final long originalCallTimestamp) {
        final C9533i c9533i = this.binding;
        PersonaMaterialButton acceptButton = c9533i.f34398b;
        Intrinsics.checkNotNullExpressionValue(acceptButton, "acceptButton");
        C12543z.m46890b(acceptButton, new Function0() { // from class: to.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C11724j.m43924w(c9533i, originalCallTimestamp, this, preferredAxis);
            }
        });
    }

    /* JADX INFO: renamed from: y */
    public final void m43931y(boolean isProcessing) {
        if (this.isProcessing == isProcessing) {
            return;
        }
        this.isProcessing = isProcessing;
        C9533i c9533i = this.binding;
        C9654b0 c9654b0Mo38142t0 = new C9654b0().m38116D0(new C9659e(3)).m38116D0(new C9653b()).m38116D0(new C9655c()).m38116D0(new C9657d()).m38125M0(0).mo38142t0(300L);
        Intrinsics.checkNotNullExpressionValue(c9654b0Mo38142t0, "setDuration(...)");
        C9691y.m38301a(c9533i.getRoot(), c9654b0Mo38142t0);
        if (isProcessing) {
            c9533i.f34415s.setVisibility(0);
            c9533i.f34404h.setVisibility(4);
            c9533i.f34398b.setVisibility(4);
            c9533i.f34417u.setVisibility(4);
            c9533i.f34411o.setVisibility(4);
            return;
        }
        c9533i.f34415s.setVisibility(4);
        c9533i.f34404h.setVisibility(0);
        c9533i.f34398b.setVisibility(0);
        c9533i.f34417u.setVisibility(0);
        c9533i.f34411o.setVisibility(0);
    }
}
