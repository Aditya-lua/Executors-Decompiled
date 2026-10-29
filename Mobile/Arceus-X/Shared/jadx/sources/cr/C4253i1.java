package cr;

import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import ar.C1148c;
import ar.C1149d;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.InputMaskedText;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.InputMaskedTextComponent;
import gr.C6234v;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p016an.C0390s;
import p227jr.C7296d0;
import p261l2.C7975b;
import p497vp.C12244g;
import p526wq.C12536s;

/* JADX INFO: renamed from: cr.i1 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0019\u0010\u000b\u001a\u00020\n*\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f\u001a\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001b\u0010\u0013\u001a\u00020\n*\u00020\u00122\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputMaskedTextComponent;", "Lcr/y4;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputMaskedText;", "config", "Lcom/google/android/material/textfield/TextInputLayout;", "h", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputMaskedTextComponent;Lcr/y4;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputMaskedText;)Lcom/google/android/material/textfield/TextInputLayout;", "Lcr/r3;", "newState", "", "d", "(Lcom/google/android/material/textfield/TextInputLayout;Lcr/r3;)V", "", "mask", "", "g", "(Ljava/lang/String;)Z", "Landroid/text/Editable;", "f", "(Landroid/text/Editable;Ljava/lang/String;)V", "ui-step-renderer_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C4253i1 {
    /* JADX INFO: renamed from: d */
    public static final void m21781d(@NotNull final TextInputLayout textInputLayout, @NotNull MaskTextInputState newState) {
        EditText editText;
        final String mask;
        EditText editText2;
        EditText editText3;
        Intrinsics.checkNotNullParameter(textInputLayout, "<this>");
        Intrinsics.checkNotNullParameter(newState, "newState");
        int i10 = C1149d.f4823g0;
        Object tag = textInputLayout.getTag(i10);
        if (Intrinsics.m31980c(tag instanceof MaskTextInputState ? (MaskTextInputState) tag : null, newState)) {
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
            C12536s.m46884a(textInputLayout);
        }
        if (m21784g(newState.getMask()) && (editText2 = textInputLayout.getEditText()) != null) {
            editText2.setRawInputType(2);
        }
        if (Intrinsics.m31980c(newState.getSecure(), Boolean.TRUE) && (mask = newState.getMask()) != null) {
            textInputLayout.setEndIconMode(-1);
            textInputLayout.setEndIconDrawable(C7975b.m33008f(textInputLayout.getContext(), C1148c.f4767c));
            textInputLayout.setEndIconContentDescription(textInputLayout.getContext().getString(C12244g.f43245b0));
            EditText editText4 = textInputLayout.getEditText();
            if (editText4 != null) {
                editText4.setTransformationMethod(new C4274l4(mask));
            }
            textInputLayout.setEndIconOnClickListener(new View.OnClickListener() { // from class: cr.h1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C4253i1.m21782e(textInputLayout, mask, view);
                }
            });
        }
        int i11 = C1149d.f4845r0;
        Object tag2 = textInputLayout.getTag(i11);
        C4315s3 c4315s3 = tag2 instanceof C4315s3 ? (C4315s3) tag2 : null;
        if (c4315s3 != null && (editText = textInputLayout.getEditText()) != null) {
            editText.removeTextChangedListener(c4315s3);
        }
        String mask2 = newState.getMask();
        if (mask2 == null || StringsKt.m32182p0(mask2)) {
            return;
        }
        C4315s3 c4315s4 = new C4315s3(newState.getMask());
        EditText editText5 = textInputLayout.getEditText();
        if (editText5 != null) {
            editText5.addTextChangedListener(c4315s4);
        }
        textInputLayout.setTag(i11, c4315s4);
    }

    /* JADX INFO: renamed from: e */
    public static final void m21782e(TextInputLayout textInputLayout, String str, View view) {
        EditText editText = textInputLayout.getEditText();
        boolean z10 = (editText != null ? editText.getTransformationMethod() : null) != null;
        EditText editText2 = textInputLayout.getEditText();
        if (editText2 != null) {
            editText2.setTransformationMethod(z10 ? null : new C4274l4(str));
        }
        textInputLayout.setEndIconDrawable(C7975b.m33008f(textInputLayout.getContext(), z10 ? C1148c.f4766b : C1148c.f4767c));
    }

    /* JADX INFO: renamed from: f */
    public static final void m21783f(Editable editable, String str) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        for (int i11 = 0; i11 < str.length(); i11++) {
            char cCharAt = str.charAt(i11);
            AbstractC4303q3 abstractC4303q3M21913a = AbstractC4303q3.INSTANCE.m21913a(cCharAt);
            while (i10 < editable.length()) {
                char cCharAt2 = editable.charAt(i10);
                if (abstractC4303q3M21913a.m21912a(cCharAt2)) {
                    sb2.append(cCharAt2);
                    i10++;
                    break;
                } else {
                    if (abstractC4303q3M21913a instanceof AbstractC4303q3.Literal) {
                        sb2.append(cCharAt);
                        break;
                    }
                    i10++;
                }
            }
        }
        editable.replace(0, editable.length(), sb2);
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m21784g(String str) {
        if (str != null && !StringsKt.m32182p0(str)) {
            for (int i10 = 0; i10 < str.length(); i10++) {
                AbstractC4303q3 abstractC4303q3M21913a = AbstractC4303q3.INSTANCE.m21913a(str.charAt(i10));
                if ((abstractC4303q3M21913a instanceof AbstractC4303q3.b) || (abstractC4303q3M21913a instanceof AbstractC4303q3.Literal)) {
                }
            }
            return true;
        }
        return false;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public static final TextInputLayout m21785h(@NotNull InputMaskedTextComponent inputMaskedTextComponent, @NotNull C4352y4 uiComponentHelper, @NotNull final InputMaskedText config) {
        Intrinsics.checkNotNullParameter(inputMaskedTextComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        final C6234v c6234vM27424c = C6234v.m27424c(uiComponentHelper.getLayoutInflater());
        TextInputLayout root = c6234vM27424c.getRoot();
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
        m21781d(root, new MaskTextInputState(prefill, mask, secure, label, attributes5 != null ? attributes5.getPlaceholder() : null));
        EditText editText = c6234vM27424c.getRoot().getEditText();
        if (editText != null) {
            C0390s.m1453b(inputMaskedTextComponent.getTextController(), editText);
        }
        uiComponentHelper.m22002d(new Function0() { // from class: cr.g1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C4253i1.m21786i(config, c6234vM27424c);
            }
        });
        TextInputLayout root2 = c6234vM27424c.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
        return root2;
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m21786i(InputMaskedText inputMaskedText, C6234v c6234v) {
        InputTextBasedComponentStyle styles = inputMaskedText.getStyles();
        if (styles != null) {
            TextInputLayout root = c6234v.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            C7296d0.m30348k(root, styles);
        }
        return Unit.f29331a;
    }
}
