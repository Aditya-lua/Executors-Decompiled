package cr;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputTextArea;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputTextAreaComponent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputTextAreaComponent;", "Lcr/y4;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputTextArea;", "config", "Lcom/google/android/material/textfield/TextInputLayout;", "b", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputTextAreaComponent;Lcr/y4;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputTextArea;)Lcom/google/android/material/textfield/TextInputLayout;", "ui-step-renderer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a2 {
    @NotNull
    public static final TextInputLayout b(@NotNull InputTextAreaComponent inputTextAreaComponent, @NotNull y4 uiComponentHelper, @NotNull final InputTextArea config) {
        Intrinsics.checkNotNullParameter(inputTextAreaComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        final gr.o oVarC = gr.o.c(uiComponentHelper.getLayoutInflater());
        InputTextArea.Attributes attributes = config.getAttributes();
        if (attributes != null) {
            an.r textController = inputTextAreaComponent.getTextController();
            TextInputEditText editText = oVarC.b;
            Intrinsics.checkNotNullExpressionValue(editText, "editText");
            an.s.b(textController, editText);
            String label = attributes.getLabel();
            if (label != null) {
                oVarC.f18443c.setHint(label);
            }
            String placeholder = attributes.getPlaceholder();
            if (placeholder != null) {
                oVarC.f18443c.setPlaceholderText(placeholder);
                TextInputLayout inputLayout = oVarC.f18443c;
                Intrinsics.checkNotNullExpressionValue(inputLayout, "inputLayout");
                wq.s.a(inputLayout);
            }
            Integer rows = attributes.getRows();
            if (rows != null) {
                int iIntValue = rows.intValue();
                oVarC.b.setMaxLines(iIntValue);
                oVarC.b.setMinLines(iIntValue);
                oVarC.b.setVerticalScrollBarEnabled(true);
            }
        }
        uiComponentHelper.d(new Function0() { // from class: cr.z1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a2.c(config, oVarC);
            }
        });
        TextInputLayout root = oVarC.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    public static final Unit c(InputTextArea inputTextArea, gr.o oVar) {
        InputTextBasedComponentStyle styles = inputTextArea.getStyles();
        if (styles != null) {
            TextInputLayout inputLayout = oVar.f18443c;
            Intrinsics.checkNotNullExpressionValue(inputLayout, "inputLayout");
            jr.d0.k(inputLayout, styles);
        }
        return Unit.f22483a;
    }
}
