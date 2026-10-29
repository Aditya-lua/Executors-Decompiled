package cr;

import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputCheckbox;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputCheckboxGroup;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.OptionWithDescription;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputCheckboxComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputCheckboxGroupComponent;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCheckboxGroupComponent;", "Lcr/y4;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckboxGroup;", "config", "Landroid/widget/LinearLayout;", "c", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCheckboxGroupComponent;Lcr/y4;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckboxGroup;)Landroid/widget/LinearLayout;", "ui-step-renderer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class l0 {
    @NotNull
    public static final LinearLayout c(@NotNull final InputCheckboxGroupComponent inputCheckboxGroupComponent, @NotNull y4 uiComponentHelper, @NotNull final InputCheckboxGroup config) {
        List<OptionWithDescription> listK;
        String str;
        TextBasedComponentStyle errorTextStyle;
        List<String> prefill;
        Intrinsics.checkNotNullParameter(inputCheckboxGroupComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        final gr.j jVarC = gr.j.c(uiComponentHelper.getLayoutInflater());
        InputCheckboxGroup.Attributes attributes = config.getAttributes();
        final ArrayList arrayList = new ArrayList();
        Set setQ0 = (attributes == null || (prefill = attributes.getPrefill()) == null) ? null : CollectionsKt.Q0(prefill);
        if (attributes == null || (listK = attributes.getOptions()) == null) {
            listK = kotlin.collections.p.k();
        }
        for (OptionWithDescription optionWithDescription : listK) {
            InputCheckbox inputCheckbox = new InputCheckbox(optionWithDescription.getValue(), new InputCheckbox.Attributes(Boolean.valueOf(setQ0 != null && setQ0.contains(optionWithDescription.getValue())), optionWithDescription.getText(), optionWithDescription.getDescriptionText(), attributes != null ? attributes.getHidden() : null, attributes != null ? attributes.getDisabled() : null), config.getStyles());
            InputCheckboxComponent inputCheckboxComponent = new InputCheckboxComponent(inputCheckbox, setQ0 != null && setQ0.contains(optionWithDescription.getValue()) == r17);
            gr.i iVarD = gr.i.d(uiComponentHelper.getLayoutInflater(), jVarC.b, false);
            Intrinsics.checkNotNullExpressionValue(iVarD, "inflate(...)");
            jVarC.b.addView(i0.e(inputCheckboxComponent, uiComponentHelper, iVarD, inputCheckbox));
            iVarD.b.setTag(optionWithDescription.getValue());
            if (inputCheckboxGroupComponent.getStringSetController().b().contains(optionWithDescription.getValue())) {
                iVarD.b.setChecked(r17);
            }
            MaterialCheckBox checkbox = iVarD.b;
            Intrinsics.checkNotNullExpressionValue(checkbox, "checkbox");
            arrayList.add(checkbox);
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((MaterialCheckBox) obj).c(new MaterialCheckBox.b() { // from class: cr.j0
                @Override // com.google.android.material.checkbox.MaterialCheckBox.b
                public final void a(MaterialCheckBox materialCheckBox, int i11) {
                    l0.d(inputCheckboxGroupComponent, arrayList, materialCheckBox, i11);
                }
            });
        }
        InputCheckbox.InputCheckboxComponentStyle styles = config.getStyles();
        if (styles == null || (errorTextStyle = styles.getErrorTextStyle()) == null) {
            str = null;
        } else {
            TextView checkboxGroupError = jVarC.f18430c;
            Intrinsics.checkNotNullExpressionValue(checkboxGroupError, "checkboxGroupError");
            str = null;
            jr.h0.l(checkboxGroupError, errorTextStyle, null, 2, null);
        }
        String label = attributes != null ? attributes.getLabel() : str;
        if (label == null || label.length() == 0) {
            jVarC.f18431d.setVisibility(8);
        } else {
            jVarC.f18431d.setVisibility(0);
            jVarC.f18431d.setText(label);
            uiComponentHelper.d(new Function0() { // from class: cr.k0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return l0.e(config, jVarC);
                }
            });
        }
        jVarC.getRoot().setTag(jVarC);
        LinearLayout root = jVarC.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    public static final void d(InputCheckboxGroupComponent inputCheckboxGroupComponent, List list, MaterialCheckBox checkBox, int i10) {
        Intrinsics.checkNotNullParameter(checkBox, "checkBox");
        f(inputCheckboxGroupComponent, list);
    }

    public static final Unit e(InputCheckboxGroup inputCheckboxGroup, gr.j jVar) {
        TextBasedComponentStyle textBasedStyle;
        InputCheckbox.InputCheckboxComponentStyle styles = inputCheckboxGroup.getStyles();
        if (styles != null && (textBasedStyle = styles.getTextBasedStyle()) != null) {
            TextView checkboxGroupLabel = jVar.f18431d;
            Intrinsics.checkNotNullExpressionValue(checkboxGroupLabel, "checkboxGroupLabel");
            jr.h0.l(checkboxGroupLabel, textBasedStyle, null, 2, null);
        }
        return Unit.f22483a;
    }

    public static final void f(InputCheckboxGroupComponent inputCheckboxGroupComponent, List<MaterialCheckBox> list) {
        String str;
        er.n stringSetController = inputCheckboxGroupComponent.getStringSetController();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (MaterialCheckBox materialCheckBox : list) {
            if (materialCheckBox.isChecked()) {
                Object tag = materialCheckBox.getTag();
                Intrinsics.d(tag, "null cannot be cast to non-null type kotlin.String");
                str = (String) tag;
            } else {
                str = null;
            }
            if (str != null) {
                linkedHashSet.add(str);
            }
        }
        stringSetController.c(linkedHashSet);
    }
}
