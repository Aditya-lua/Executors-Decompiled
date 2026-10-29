package cr;

import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputMaskedText;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputMaskedTextComponent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0019\u0010\u000b\u001a\u00020\n*\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f\u001a\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001b\u0010\u0013\u001a\u00020\n*\u00020\u00122\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputMaskedTextComponent;", "Lcr/y4;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputMaskedText;", "config", "Lcom/google/android/material/textfield/TextInputLayout;", "h", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputMaskedTextComponent;Lcr/y4;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputMaskedText;)Lcom/google/android/material/textfield/TextInputLayout;", "Lcr/r3;", "newState", "", "d", "(Lcom/google/android/material/textfield/TextInputLayout;Lcr/r3;)V", "", "mask", "", "g", "(Ljava/lang/String;)Z", "Landroid/text/Editable;", "f", "(Landroid/text/Editable;Ljava/lang/String;)V", "ui-step-renderer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class i1 {
    public static final void d(@NotNull final TextInputLayout textInputLayout, @NotNull MaskTextInputState newState) {
        EditText editText;
        final String mask;
        EditText editText2;
        EditText editText3;
        Intrinsics.checkNotNullParameter(textInputLayout, "<this>");
        Intrinsics.checkNotNullParameter(newState, "newState");
        int i10 = ar.d.f3670g0;
        Object tag = textInputLayout.getTag(i10);
        if (Intrinsics.c(tag instanceof MaskTextInputState ? (MaskTextInputState) tag : null, newState)) {
            return;
        }
        textInputLayout.setTag(i10, newState);
        String prefill = newState.getPrefill();
        if (prefill != null && (editText3 = textInputLayout.getEditText()) != null) {
            editText3.setText(prefill);
        }
        String label = newState.getLabel();
        if (label != null) {
            textInputLayout.setHint(label);
        }
        String placeholder = newState.getPlaceholder();
        if (placeholder != null) {
            textInputLayout.setPlaceholderText(placeholder);
            wq.s.a(textInputLayout);
        }
        if (g(newState.getMask()) && (editText2 = textInputLayout.getEditText()) != null) {
            editText2.setRawInputType(2);
        }
        if (Intrinsics.c(newState.getSecure(), Boolean.TRUE) && (mask = newState.getMask()) != null) {
            textInputLayout.setEndIconMode(-1);
            textInputLayout.setEndIconDrawable(l2.b.f(textInputLayout.getContext(), ar.c.f3656c));
            textInputLayout.setEndIconContentDescription(textInputLayout.getContext().getString(vp.g.f33386b0));
            EditText editText4 = textInputLayout.getEditText();
            if (editText4 != null) {
                editText4.setTransformationMethod(new l4(mask));
            }
            textInputLayout.setEndIconOnClickListener(new View.OnClickListener() { // from class: cr.h1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    i1.e(textInputLayout, mask, view);
                }
            });
        }
        int i11 = ar.d.f3692r0;
        Object tag2 = textInputLayout.getTag(i11);
        s3 s3Var = tag2 instanceof s3 ? (s3) tag2 : null;
        if (s3Var != null && (editText = textInputLayout.getEditText()) != null) {
            editText.removeTextChangedListener(s3Var);
        }
        String mask2 = newState.getMask();
        if (mask2 == null || StringsKt.p0(mask2)) {
            return;
        }
        s3 s3Var2 = new s3(newState.getMask());
        EditText editText5 = textInputLayout.getEditText();
        if (editText5 != null) {
            editText5.addTextChangedListener(s3Var2);
        }
        textInputLayout.setTag(i11, s3Var2);
    }

    public static final void e(TextInputLayout textInputLayout, String str, View view) {
        EditText editText = textInputLayout.getEditText();
        boolean z10 = (editText != null ? editText.getTransformationMethod() : null) != null;
        EditText editText2 = textInputLayout.getEditText();
        if (editText2 != null) {
            editText2.setTransformationMethod(z10 ? null : new l4(str));
        }
        textInputLayout.setEndIconDrawable(l2.b.f(textInputLayout.getContext(), z10 ? ar.c.b : ar.c.f3656c));
    }

    public static final void f(Editable editable, String str) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        for (int i11 = 0; i11 < str.length(); i11++) {
            char cCharAt = str.charAt(i11);
            q3 q3VarA = q3.INSTANCE.a(cCharAt);
            while (i10 < editable.length()) {
                char cCharAt2 = editable.charAt(i10);
                if (q3VarA.a(cCharAt2)) {
                    sb2.append(cCharAt2);
                    i10++;
                    break;
                } else {
                    if (q3VarA instanceof q3.Literal) {
                        sb2.append(cCharAt);
                        break;
                    }
                    i10++;
                }
            }
        }
        editable.replace(0, editable.length(), sb2);
    }

    public static final boolean g(String str) {
        if (str != null && !StringsKt.p0(str)) {
            for (int i10 = 0; i10 < str.length(); i10++) {
                q3 q3VarA = q3.INSTANCE.a(str.charAt(i10));
                if ((q3VarA instanceof q3.b) || (q3VarA instanceof q3.Literal)) {
                }
            }
            return true;
        }
        return false;
    }

    @NotNull
    public static final TextInputLayout h(@NotNull InputMaskedTextComponent inputMaskedTextComponent, @NotNull y4 uiComponentHelper, @NotNull final InputMaskedText config) {
        Intrinsics.checkNotNullParameter(inputMaskedTextComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        final gr.v vVarC = gr.v.c(uiComponentHelper.getLayoutInflater());
        TextInputLayout root = vVarC.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        InputMaskedText.Attributes attributes = config.getAttributes();
        String prefill = attributes != null ? attributes.getPrefill() : null;
        InputMaskedText.Attributes attributes2 = config.getAttributes();
        String mask = attributes2 != null ? attributes2.getMask() : null;
        InputMaskedText.Attributes attributes3 = config.getAttributes();
        Boolean secure = attributes3 != null ? attributes3.getSecure() : null;
        InputMaskedText.Attributes attributes4 = config.getAttributes();
        String label = attributes4 != null ? attributes4.getLabel() : null;
        InputMaskedText.Attributes attributes5 = config.getAttributes();
        d(root, new MaskTextInputState(prefill, mask, secure, label, attributes5 != null ? attributes5.getPlaceholder() : null));
        EditText editText = vVarC.getRoot().getEditText();
        if (editText != null) {
            an.s.b(inputMaskedTextComponent.getTextController(), editText);
        }
        uiComponentHelper.d(new Function0() { // from class: cr.g1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return i1.i(config, vVarC);
            }
        });
        TextInputLayout root2 = vVarC.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
        return root2;
    }

    public static final Unit i(InputMaskedText inputMaskedText, gr.v vVar) {
        InputTextBasedComponentStyle styles = inputMaskedText.getStyles();
        if (styles != null) {
            TextInputLayout root = vVar.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            jr.d0.k(root, styles);
        }
        return Unit.f22483a;
    }
}
