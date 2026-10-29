package cr;

import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputMultiSelect;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputSelectComponentStyle;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaTextInputLayout;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputMultiSelectComponent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputMultiSelectComponent;", "Lcr/y4;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputMultiSelect;", "config", "Lcom/google/android/material/textfield/TextInputLayout;", "b", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputMultiSelectComponent;Lcr/y4;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputMultiSelect;)Lcom/google/android/material/textfield/TextInputLayout;", "ui-step-renderer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class k1 {
    @NotNull
    public static final TextInputLayout b(@NotNull InputMultiSelectComponent inputMultiSelectComponent, @NotNull y4 uiComponentHelper, @NotNull final InputMultiSelect config) {
        Intrinsics.checkNotNullParameter(inputMultiSelectComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        final gr.s sVarC = gr.s.c(uiComponentHelper.getLayoutInflater());
        InputMultiSelect.Attributes attributes = config.getAttributes();
        if (attributes != null) {
            String placeholder = attributes.getPlaceholder();
            if (placeholder != null && !StringsKt.p0(placeholder)) {
                sVarC.getRoot().setPlaceholderText(attributes.getPlaceholder());
                sVarC.getRoot().setExpandedHintEnabled(false);
                PersonaTextInputLayout root = sVarC.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
                wq.s.a(root);
            }
            String label = attributes.getLabel();
            if (label != null) {
                sVarC.getRoot().setHint(label);
            }
        }
        uiComponentHelper.d(new Function0() { // from class: cr.j1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k1.c(config, sVarC);
            }
        });
        PersonaTextInputLayout root2 = sVarC.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
        return root2;
    }

    public static final Unit c(InputMultiSelect inputMultiSelect, gr.s sVar) {
        InputSelectComponentStyle styles = inputMultiSelect.getStyles();
        if (styles != null) {
            PersonaTextInputLayout listSelector = sVar.b;
            Intrinsics.checkNotNullExpressionValue(listSelector, "listSelector");
            jr.o.i(listSelector, styles);
        }
        return Unit.f22483a;
    }
}
