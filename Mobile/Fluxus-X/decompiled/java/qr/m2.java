package qr;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputTextArea;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputTextAreaComponent;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputTextAreaComponent;", "Lqr/z5;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputTextArea;", "config", "Lcom/google/android/material/textfield/TextInputLayout;", "b", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputTextAreaComponent;Lqr/z5;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputTextArea;)Lcom/google/android/material/textfield/TextInputLayout;", "ui-step-renderer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class m2 {
    @NotNull
    public static final TextInputLayout b(@NotNull InputTextAreaComponent inputTextAreaComponent, @NotNull z5 uiComponentHelper, @NotNull final InputTextArea config) {
        Intrinsics.checkNotNullParameter(inputTextAreaComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        final ur.o oVarC = ur.o.c(uiComponentHelper.getLayoutInflater());
        InputTextArea.Attributes attributes = config.getAttributes();
        if (attributes != null) {
            nn.s textController = inputTextAreaComponent.getTextController();
            TextInputEditText editText = oVarC.b;
            Intrinsics.checkNotNullExpressionValue(editText, "editText");
            nn.t.b(textController, editText);
            String label = attributes.getLabel();
            if (label != null) {
                oVarC.f33912c.setHint(label);
            }
            String placeholder = attributes.getPlaceholder();
            if (placeholder != null) {
                oVarC.f33912c.setPlaceholderText(placeholder);
                TextInputLayout inputLayout = oVarC.f33912c;
                Intrinsics.checkNotNullExpressionValue(inputLayout, "inputLayout");
                kr.t.a(inputLayout);
            }
            Integer rows = attributes.getRows();
            if (rows != null) {
                int iIntValue = rows.intValue();
                oVarC.b.setMaxLines(iIntValue);
                oVarC.b.setMinLines(iIntValue);
                oVarC.b.setVerticalScrollBarEnabled(true);
            }
        }
        uiComponentHelper.d(new Function0() { // from class: qr.l2
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return m2.c(config, oVarC);
            }
        });
        TextInputLayout root = oVarC.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    public static final Unit c(InputTextArea inputTextArea, ur.o oVar) {
        InputTextBasedComponentStyle styles = inputTextArea.getStyles();
        if (styles != null) {
            TextInputLayout inputLayout = oVar.f33912c;
            Intrinsics.checkNotNullExpressionValue(inputLayout, "inputLayout");
            yr.d0.k(inputLayout, styles);
        }
        return Unit.f21506a;
    }
}
