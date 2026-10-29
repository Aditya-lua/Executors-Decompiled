package cr;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.InputTextArea;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.InputTextAreaComponent;
import gr.C6227o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p016an.C0390s;
import p016an.InterfaceC0389r;
import p227jr.C7296d0;
import p526wq.C12536s;

/* JADX INFO: renamed from: cr.a2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputTextAreaComponent;", "Lcr/y4;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputTextArea;", "config", "Lcom/google/android/material/textfield/TextInputLayout;", "b", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputTextAreaComponent;Lcr/y4;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputTextArea;)Lcom/google/android/material/textfield/TextInputLayout;", "ui-step-renderer_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C4203a2 {
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final TextInputLayout m21730b(@NotNull InputTextAreaComponent inputTextAreaComponent, @NotNull C4352y4 uiComponentHelper, @NotNull final InputTextArea config) {
        Intrinsics.checkNotNullParameter(inputTextAreaComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        final C6227o c6227oM27397c = C6227o.m27397c(uiComponentHelper.getLayoutInflater());
        InputTextArea.Attributes attributes = config.getAttributes();
        if (attributes != null) {
            InterfaceC0389r textController = inputTextAreaComponent.getTextController();
            TextInputEditText editText = c6227oM27397c.f23715b;
            Intrinsics.checkNotNullExpressionValue(editText, "editText");
            C0390s.m1453b(textController, editText);
            String label = attributes.getLabel();
            if (label != null) {
                c6227oM27397c.f23716c.setHint(label);
            }
            String placeholder = attributes.getPlaceholder();
            if (placeholder != null) {
                c6227oM27397c.f23716c.setPlaceholderText(placeholder);
                TextInputLayout inputLayout = c6227oM27397c.f23716c;
                Intrinsics.checkNotNullExpressionValue(inputLayout, "inputLayout");
                C12536s.m46884a(inputLayout);
            }
            Integer rows = attributes.getRows();
            if (rows != null) {
                int iIntValue = rows.intValue();
                c6227oM27397c.f23715b.setMaxLines(iIntValue);
                c6227oM27397c.f23715b.setMinLines(iIntValue);
                c6227oM27397c.f23715b.setVerticalScrollBarEnabled(true);
            }
        }
        uiComponentHelper.m22002d(new Function0() { // from class: cr.z1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C4203a2.m21731c(config, c6227oM27397c);
            }
        });
        TextInputLayout root = c6227oM27397c.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    /* JADX INFO: renamed from: c */
    public static final Unit m21731c(InputTextArea inputTextArea, C6227o c6227o) {
        InputTextBasedComponentStyle styles = inputTextArea.getStyles();
        if (styles != null) {
            TextInputLayout inputLayout = c6227o.f23716c;
            Intrinsics.checkNotNullExpressionValue(inputLayout, "inputLayout");
            C7296d0.m30348k(inputLayout, styles);
        }
        return Unit.f29331a;
    }
}
