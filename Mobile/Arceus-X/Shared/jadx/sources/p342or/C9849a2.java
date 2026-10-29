package p342or;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.ESignature;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.ButtonCancelComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.ESignatureComponent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p016an.ViewEnvironment;
import p226jq.C7265j;
import p227jr.C7293c;
import p227jr.C7297e;
import p227jr.C7304h0;
import p229jt.C7342i;
import p229jt.InterfaceC7341h;
import p526wq.C12519b;
import pr.C10318b;

/* JADX INFO: renamed from: or.a2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JK\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f2\u001a\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00110\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001b\u001a\u00020\u00112\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001f\u0010$\u001a\r\u0012\t\u0012\u00070 ¢\u0006\u0002\b!0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010'\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R,\u0010*\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u001b\u0010/\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\b+\u0010,*\u0004\b-\u0010.¨\u00060"}, m31665d2 = {"Lor/a2;", "", "Landroid/view/ViewGroup;", "contentView", "<init>", "(Landroid/view/ViewGroup;)V", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/ESignatureComponent;", "component", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature;", "config", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "stepStyles", "Lan/y;", "viewEnvironment", "Lkotlin/Function2;", "", "Landroid/graphics/Bitmap;", "", "onComplete", "p", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/ESignatureComponent;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;Lan/y;Lkotlin/jvm/functions/Function2;)V", "h", "()Z", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature$ESignatureComponentStyle;", "styles", "g", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature$ESignatureComponentStyle;)V", "k", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;Lan/y;)V", "a", "Landroid/view/ViewGroup;", "Ljt/h;", "Lpr/b;", "Lkotlin/jvm/internal/EnhancedNullability;", "b", "Ljt/h;", "lazyBinding", "c", "Z", "setup", "d", "Lkotlin/jvm/functions/Function2;", "currentOnCompleteListener", "i", "()Lpr/b;", "getBinding$delegate", "(Lor/a2;)Ljava/lang/Object;", "binding", "ui_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C9849a2 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ViewGroup contentView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7341h<C10318b> lazyBinding;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public boolean setup;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public Function2<? super Boolean, ? super Bitmap, Unit> currentOnCompleteListener;

    public C9849a2(@NotNull ViewGroup contentView) {
        Intrinsics.checkNotNullParameter(contentView, "contentView");
        this.contentView = contentView;
        this.lazyBinding = C7342i.m30456b(new Function0() { // from class: or.u1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C9849a2.m38739j(this.f36075a);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public static final C10318b m38739j(C9849a2 c9849a2) {
        return C10318b.m39627c(LayoutInflater.from(c9849a2.contentView.getContext()), c9849a2.contentView, true);
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m38740l(C9849a2 c9849a2) {
        Function2<? super Boolean, ? super Bitmap, Unit> function2 = c9849a2.currentOnCompleteListener;
        if (function2 != null) {
            function2.invoke(Boolean.TRUE, null);
        }
        c9849a2.currentOnCompleteListener = null;
        c9849a2.m38747i().f37162h.m20944j();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: m */
    public static final void m38741m(BottomSheetBehavior bottomSheetBehavior, View view) {
        bottomSheetBehavior.m12125X0(5);
    }

    /* JADX INFO: renamed from: n */
    public static final void m38742n(C9849a2 c9849a2, View view) {
        c9849a2.m38747i().f37162h.m20944j();
    }

    /* JADX INFO: renamed from: o */
    public static final void m38743o(C9849a2 c9849a2, BottomSheetBehavior bottomSheetBehavior, View view) {
        Function2<? super Boolean, ? super Bitmap, Unit> function2 = c9849a2.currentOnCompleteListener;
        if (function2 != null) {
            function2.invoke(Boolean.FALSE, c9849a2.m38747i().f37162h.m20947m());
        }
        c9849a2.currentOnCompleteListener = null;
        bottomSheetBehavior.m12125X0(5);
    }

    /* JADX INFO: renamed from: q */
    public static final void m38744q(C9849a2 c9849a2) {
        BottomSheetBehavior bottomSheetBehaviorM12102q0 = BottomSheetBehavior.m12102q0(c9849a2.m38747i().f37156b);
        Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorM12102q0, "from(...)");
        bottomSheetBehaviorM12102q0.m12125X0(3);
    }

    /* JADX INFO: renamed from: g */
    public final void m38745g(ESignature.ESignatureComponentStyle styles) {
        TextBasedComponentStyle dialogTitleStyle = styles.getDialogTitleStyle();
        if (dialogTitleStyle != null) {
            TextView signatureLabel = m38747i().f37164j;
            Intrinsics.checkNotNullExpressionValue(signatureLabel, "signatureLabel");
            C7304h0.m30392l(signatureLabel, dialogTitleStyle, null, 2, null);
        }
        TextBasedComponentStyle dialogTextStyle = styles.getDialogTextStyle();
        if (dialogTextStyle != null) {
            TextView signatureDescription = m38747i().f37163i;
            Intrinsics.checkNotNullExpressionValue(signatureDescription, "signatureDescription");
            C7304h0.m30392l(signatureDescription, dialogTextStyle, null, 2, null);
        }
        Integer baseBackgroundColorValue = styles.getInputTextStyle().getBaseBackgroundColorValue();
        if (baseBackgroundColorValue != null) {
            m38747i().f37162h.setCardBackgroundColor(baseBackgroundColorValue.intValue());
        }
        Double borderRadiusValue = styles.getInputTextStyle().getBorderRadiusValue();
        if (borderRadiusValue != null) {
            m38747i().f37162h.setRadius((float) Math.ceil(C7265j.m30285a(borderRadiusValue.doubleValue())));
        }
        Double borderWidthValue = styles.getInputTextStyle().getBorderWidthValue();
        if (borderWidthValue != null) {
            m38747i().f37162h.setStrokeWidth((int) Math.ceil(C7265j.m30285a(borderWidthValue.doubleValue())));
        }
        Integer baseBorderColorValue = styles.getInputTextStyle().getBaseBorderColorValue();
        if (baseBorderColorValue != null) {
            m38747i().f37162h.setStrokeColor(baseBorderColorValue.intValue());
        }
        ButtonSubmitComponentStyle submitButtonStyle = styles.getSubmitButtonStyle();
        if (submitButtonStyle != null) {
            Button saveButton = m38747i().f37160f;
            Intrinsics.checkNotNullExpressionValue(saveButton, "saveButton");
            C7297e.m30364h(saveButton, submitButtonStyle, false, false, false, 14, null);
        }
        ButtonCancelComponentStyle clearSignatureButtonStyle = styles.getClearSignatureButtonStyle();
        if (clearSignatureButtonStyle != null) {
            Button clearButton = m38747i().f37157c;
            Intrinsics.checkNotNullExpressionValue(clearButton, "clearButton");
            C7297e.m30364h(clearButton, clearSignatureButtonStyle, false, false, false, 14, null);
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m38746h() {
        if (!this.lazyBinding.isInitialized()) {
            return false;
        }
        BottomSheetBehavior bottomSheetBehaviorM12102q0 = BottomSheetBehavior.m12102q0(m38747i().f37156b);
        Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorM12102q0, "from(...)");
        if (bottomSheetBehaviorM12102q0.m12159v0() == 5) {
            return false;
        }
        bottomSheetBehaviorM12102q0.m12125X0(5);
        return true;
    }

    /* JADX INFO: renamed from: i */
    public final C10318b m38747i() {
        return this.lazyBinding.getValue();
    }

    /* JADX INFO: renamed from: k */
    public final void m38748k(StepStyles.UiStepStyle stepStyles, ViewEnvironment viewEnvironment) {
        if (this.setup) {
            return;
        }
        this.setup = true;
        final BottomSheetBehavior bottomSheetBehaviorM12102q0 = BottomSheetBehavior.m12102q0(m38747i().f37156b);
        Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorM12102q0, "from(...)");
        Function0 function0 = new Function0() { // from class: or.w1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C9849a2.m38740l(this.f36101a);
            }
        };
        FrameLayout bottomSheet = m38747i().f37156b;
        Intrinsics.checkNotNullExpressionValue(bottomSheet, "bottomSheet");
        C12519b.m46866b(bottomSheetBehaviorM12102q0, function0, bottomSheet, m38747i().f37165k, m38747i().f37161g);
        bottomSheetBehaviorM12102q0.m12112K0(false);
        m38747i().f37158d.setOnClickListener(new View.OnClickListener() { // from class: or.x1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C9849a2.m38741m(bottomSheetBehaviorM12102q0, view);
            }
        });
        m38747i().f37157c.setOnClickListener(new View.OnClickListener() { // from class: or.y1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C9849a2.m38742n(this.f36134a, view);
            }
        });
        m38747i().f37160f.setOnClickListener(new View.OnClickListener() { // from class: or.z1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C9849a2.m38743o(this.f36155a, bottomSheetBehaviorM12102q0, view);
            }
        });
        ConstraintLayout signatureSheet = m38747i().f37165k;
        Intrinsics.checkNotNullExpressionValue(signatureSheet, "signatureSheet");
        C7293c.m30334c(signatureSheet, stepStyles, null, new Rect(0, (int) C7265j.m30285a(12.0d), 0, 0), false, 10, null);
    }

    /* JADX INFO: renamed from: p */
    public final void m38749p(@NotNull ESignatureComponent component, @NotNull ESignature config, @Nullable StepStyles.UiStepStyle stepStyles, @NotNull ViewEnvironment viewEnvironment, @NotNull Function2<? super Boolean, ? super Bitmap, Unit> onComplete) {
        String dialogText;
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        m38748k(stepStyles, viewEnvironment);
        this.currentOnCompleteListener = onComplete;
        m38747i().f37162h.m20944j();
        TextView textView = m38747i().f37164j;
        ESignature.Attributes attributes = config.getAttributes();
        textView.setText(attributes != null ? attributes.getDialogTitle() : null);
        TextView textView2 = m38747i().f37163i;
        ESignature.Attributes attributes2 = config.getAttributes();
        if (attributes2 == null || (dialogText = attributes2.getDialogText()) == null) {
            dialogText = "";
        }
        textView2.setText(dialogText);
        ESignature.ESignatureComponentStyle styles = config.getStyles();
        if (styles != null) {
            m38745g(styles);
        }
        m38747i().getRoot().postDelayed(new Runnable() { // from class: or.v1
            @Override // java.lang.Runnable
            public final void run() {
                C9849a2.m38744q(this.f36088a);
            }
        }, 100L);
    }
}
