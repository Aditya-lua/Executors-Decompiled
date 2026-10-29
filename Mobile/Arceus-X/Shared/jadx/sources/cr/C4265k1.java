package cr;

import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.InputMultiSelect;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.InputSelectComponentStyle;
import com.withpersona.sdk2.inquiry.shared.p055ui.PersonaTextInputLayout;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.InputMultiSelectComponent;
import gr.C6231s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p227jr.C7311o;
import p526wq.C12536s;

/* JADX INFO: renamed from: cr.k1 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputMultiSelectComponent;", "Lcr/y4;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputMultiSelect;", "config", "Lcom/google/android/material/textfield/TextInputLayout;", "b", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputMultiSelectComponent;Lcr/y4;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputMultiSelect;)Lcom/google/android/material/textfield/TextInputLayout;", "ui-step-renderer_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C4265k1 {
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final TextInputLayout m21792b(@NotNull InputMultiSelectComponent inputMultiSelectComponent, @NotNull C4352y4 uiComponentHelper, @NotNull final InputMultiSelect config) {
        Intrinsics.checkNotNullParameter(inputMultiSelectComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        final C6231s c6231sM27412c = C6231s.m27412c(uiComponentHelper.getLayoutInflater());
        InputMultiSelect.Attributes attributes = config.getAttributes();
        if (attributes != null) {
            String placeholder = attributes.getPlaceholder();
            if (placeholder != null && !StringsKt.m32182p0(placeholder)) {
                c6231sM27412c.getRoot().setPlaceholderText(attributes.getPlaceholder());
                c6231sM27412c.getRoot().setExpandedHintEnabled(false);
                PersonaTextInputLayout root = c6231sM27412c.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
                C12536s.m46884a(root);
            }
            String label = attributes.getLabel();
            if (label != null) {
                c6231sM27412c.getRoot().setHint(label);
            }
        }
        uiComponentHelper.m22002d(new Function0() { // from class: cr.j1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C4265k1.m21793c(config, c6231sM27412c);
            }
        });
        PersonaTextInputLayout root2 = c6231sM27412c.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
        return root2;
    }

    /* JADX INFO: renamed from: c */
    public static final Unit m21793c(InputMultiSelect inputMultiSelect, C6231s c6231s) {
        InputSelectComponentStyle styles = inputMultiSelect.getStyles();
        if (styles != null) {
            PersonaTextInputLayout listSelector = c6231s.f23735b;
            Intrinsics.checkNotNullExpressionValue(listSelector, "listSelector");
            C7311o.m30401i(listSelector, styles);
        }
        return Unit.f29331a;
    }
}
