package or;

import an.ViewEnvironment;
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
import com.withpersona.sdk2.inquiry.network.dto.ui.components.ESignature;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonCancelComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.ui.components.ESignatureComponent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JK\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f2\u001a\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00110\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001b\u001a\u00020\u00112\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001f\u0010$\u001a\r\u0012\t\u0012\u00070 ¢\u0006\u0002\b!0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010'\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R,\u0010*\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u001b\u0010/\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\b+\u0010,*\u0004\b-\u0010.¨\u00060"}, d2 = {"Lor/a2;", "", "Landroid/view/ViewGroup;", "contentView", "<init>", "(Landroid/view/ViewGroup;)V", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/ESignatureComponent;", "component", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature;", "config", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "stepStyles", "Lan/y;", "viewEnvironment", "Lkotlin/Function2;", "", "Landroid/graphics/Bitmap;", "", "onComplete", "p", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/ESignatureComponent;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;Lan/y;Lkotlin/jvm/functions/Function2;)V", "h", "()Z", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature$ESignatureComponentStyle;", "styles", "g", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature$ESignatureComponentStyle;)V", "k", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;Lan/y;)V", "a", "Landroid/view/ViewGroup;", "Ljt/h;", "Lpr/b;", "Lkotlin/jvm/internal/EnhancedNullability;", "b", "Ljt/h;", "lazyBinding", "c", "Z", "setup", "d", "Lkotlin/jvm/functions/Function2;", "currentOnCompleteListener", "i", "()Lpr/b;", "getBinding$delegate", "(Lor/a2;)Ljava/lang/Object;", "binding", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ViewGroup contentView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final jt.h<pr.b> lazyBinding;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public boolean setup;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function2<? super Boolean, ? super Bitmap, Unit> currentOnCompleteListener;

    public a2(@NotNull ViewGroup contentView) {
        Intrinsics.checkNotNullParameter(contentView, "contentView");
        this.contentView = contentView;
        this.lazyBinding = jt.i.b(new Function0() { // from class: or.u1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a2.j(this.f27858a);
            }
        });
    }

    public static final pr.b j(a2 a2Var) {
        return pr.b.c(LayoutInflater.from(a2Var.contentView.getContext()), a2Var.contentView, true);
    }

    public static final Unit l(a2 a2Var) {
        Function2<? super Boolean, ? super Bitmap, Unit> function2 = a2Var.currentOnCompleteListener;
        if (function2 != null) {
            function2.invoke(Boolean.TRUE, null);
        }
        a2Var.currentOnCompleteListener = null;
        a2Var.i().f28859h.j();
        return Unit.f22483a;
    }

    public static final void m(BottomSheetBehavior bottomSheetBehavior, View view) {
        bottomSheetBehavior.X0(5);
    }

    public static final void n(a2 a2Var, View view) {
        a2Var.i().f28859h.j();
    }

    public static final void o(a2 a2Var, BottomSheetBehavior bottomSheetBehavior, View view) {
        Function2<? super Boolean, ? super Bitmap, Unit> function2 = a2Var.currentOnCompleteListener;
        if (function2 != null) {
            function2.invoke(Boolean.FALSE, a2Var.i().f28859h.m());
        }
        a2Var.currentOnCompleteListener = null;
        bottomSheetBehavior.X0(5);
    }

    public static final void q(a2 a2Var) {
        BottomSheetBehavior bottomSheetBehaviorQ0 = BottomSheetBehavior.q0(a2Var.i().b);
        Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorQ0, "from(...)");
        bottomSheetBehaviorQ0.X0(3);
    }

    public final void g(ESignature.ESignatureComponentStyle styles) {
        TextBasedComponentStyle dialogTitleStyle = styles.getDialogTitleStyle();
        if (dialogTitleStyle != null) {
            TextView signatureLabel = i().f28861j;
            Intrinsics.checkNotNullExpressionValue(signatureLabel, "signatureLabel");
            jr.h0.l(signatureLabel, dialogTitleStyle, null, 2, null);
        }
        TextBasedComponentStyle dialogTextStyle = styles.getDialogTextStyle();
        if (dialogTextStyle != null) {
            TextView signatureDescription = i().f28860i;
            Intrinsics.checkNotNullExpressionValue(signatureDescription, "signatureDescription");
            jr.h0.l(signatureDescription, dialogTextStyle, null, 2, null);
        }
        Integer baseBackgroundColorValue = styles.getInputTextStyle().getBaseBackgroundColorValue();
        if (baseBackgroundColorValue != null) {
            i().f28859h.setCardBackgroundColor(baseBackgroundColorValue.intValue());
        }
        Double borderRadiusValue = styles.getInputTextStyle().getBorderRadiusValue();
        if (borderRadiusValue != null) {
            i().f28859h.setRadius((float) Math.ceil(jq.j.a(borderRadiusValue.doubleValue())));
        }
        Double borderWidthValue = styles.getInputTextStyle().getBorderWidthValue();
        if (borderWidthValue != null) {
            i().f28859h.setStrokeWidth((int) Math.ceil(jq.j.a(borderWidthValue.doubleValue())));
        }
        Integer baseBorderColorValue = styles.getInputTextStyle().getBaseBorderColorValue();
        if (baseBorderColorValue != null) {
            i().f28859h.setStrokeColor(baseBorderColorValue.intValue());
        }
        ButtonSubmitComponentStyle submitButtonStyle = styles.getSubmitButtonStyle();
        if (submitButtonStyle != null) {
            Button saveButton = i().f28857f;
            Intrinsics.checkNotNullExpressionValue(saveButton, "saveButton");
            jr.e.h(saveButton, submitButtonStyle, false, false, false, 14, null);
        }
        ButtonCancelComponentStyle clearSignatureButtonStyle = styles.getClearSignatureButtonStyle();
        if (clearSignatureButtonStyle != null) {
            Button clearButton = i().f28854c;
            Intrinsics.checkNotNullExpressionValue(clearButton, "clearButton");
            jr.e.h(clearButton, clearSignatureButtonStyle, false, false, false, 14, null);
        }
    }

    public final boolean h() {
        if (!this.lazyBinding.isInitialized()) {
            return false;
        }
        BottomSheetBehavior bottomSheetBehaviorQ0 = BottomSheetBehavior.q0(i().b);
        Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorQ0, "from(...)");
        if (bottomSheetBehaviorQ0.v0() == 5) {
            return false;
        }
        bottomSheetBehaviorQ0.X0(5);
        return true;
    }

    public final pr.b i() {
        return this.lazyBinding.getValue();
    }

    public final void k(StepStyles.UiStepStyle stepStyles, ViewEnvironment viewEnvironment) {
        if (this.setup) {
            return;
        }
        this.setup = true;
        final BottomSheetBehavior bottomSheetBehaviorQ0 = BottomSheetBehavior.q0(i().b);
        Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorQ0, "from(...)");
        Function0 function0 = new Function0() { // from class: or.w1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a2.l(this.f27875a);
            }
        };
        FrameLayout bottomSheet = i().b;
        Intrinsics.checkNotNullExpressionValue(bottomSheet, "bottomSheet");
        wq.b.b(bottomSheetBehaviorQ0, function0, bottomSheet, i().f28862k, i().f28858g);
        bottomSheetBehaviorQ0.K0(false);
        i().f28855d.setOnClickListener(new View.OnClickListener() { // from class: or.x1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a2.m(bottomSheetBehaviorQ0, view);
            }
        });
        i().f28854c.setOnClickListener(new View.OnClickListener() { // from class: or.y1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a2.n(this.f27898a, view);
            }
        });
        i().f28857f.setOnClickListener(new View.OnClickListener() { // from class: or.z1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a2.o(this.f27913a, bottomSheetBehaviorQ0, view);
            }
        });
        ConstraintLayout signatureSheet = i().f28862k;
        Intrinsics.checkNotNullExpressionValue(signatureSheet, "signatureSheet");
        jr.c.c(signatureSheet, stepStyles, null, new Rect(0, (int) jq.j.a(12.0d), 0, 0), false, 10, null);
    }

    public final void p(@NotNull ESignatureComponent component, @NotNull ESignature config, @Nullable StepStyles.UiStepStyle stepStyles, @NotNull ViewEnvironment viewEnvironment, @NotNull Function2<? super Boolean, ? super Bitmap, Unit> onComplete) {
        String dialogText;
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        k(stepStyles, viewEnvironment);
        this.currentOnCompleteListener = onComplete;
        i().f28859h.j();
        TextView textView = i().f28861j;
        ESignature.Attributes attributes = config.getAttributes();
        textView.setText(attributes != null ? attributes.getDialogTitle() : null);
        TextView textView2 = i().f28860i;
        ESignature.Attributes attributes2 = config.getAttributes();
        if (attributes2 == null || (dialogText = attributes2.getDialogText()) == null) {
            dialogText = "";
        }
        textView2.setText(dialogText);
        ESignature.ESignatureComponentStyle styles = config.getStyles();
        if (styles != null) {
            g(styles);
        }
        i().getRoot().postDelayed(new Runnable() { // from class: or.v1
            @Override // java.lang.Runnable
            public final void run() {
                a2.q(this.f27867a);
            }
        }, 100L);
    }
}
