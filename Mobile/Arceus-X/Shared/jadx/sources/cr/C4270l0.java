package cr;

import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.InputCheckbox;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.InputCheckboxGroup;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.OptionWithDescription;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.InputCheckboxComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.InputCheckboxGroupComponent;
import er.C5205n;
import gr.C6221i;
import gr.C6222j;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7699p;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p227jr.C7304h0;

/* JADX INFO: renamed from: cr.l0 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCheckboxGroupComponent;", "Lcr/y4;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckboxGroup;", "config", "Landroid/widget/LinearLayout;", "c", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCheckboxGroupComponent;Lcr/y4;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckboxGroup;)Landroid/widget/LinearLayout;", "ui-step-renderer_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C4270l0 {
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final LinearLayout m21822c(@NotNull final InputCheckboxGroupComponent inputCheckboxGroupComponent, @NotNull C4352y4 uiComponentHelper, @NotNull final InputCheckboxGroup config) {
        List<OptionWithDescription> listM31892k;
        String str;
        TextBasedComponentStyle errorTextStyle;
        List<String> prefill;
        Intrinsics.checkNotNullParameter(inputCheckboxGroupComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        final C6222j c6222jM27377c = C6222j.m27377c(uiComponentHelper.getLayoutInflater());
        InputCheckboxGroup.Attributes attributes = config.getAttributes();
        final ArrayList arrayList = new ArrayList();
        Set setQ0 = (attributes == null || (prefill = attributes.getPrefill()) == null) ? null : CollectionsKt.m31691Q0(prefill);
        if (attributes == null || (listM31892k = attributes.getOptions()) == null) {
            listM31892k = C7699p.m31892k();
        }
        for (OptionWithDescription optionWithDescription : listM31892k) {
            InputCheckbox inputCheckbox = new InputCheckbox(optionWithDescription.getValue(), new InputCheckbox.Attributes(Boolean.valueOf(setQ0 != null && setQ0.contains(optionWithDescription.getValue())), optionWithDescription.getText(), optionWithDescription.getDescriptionText(), attributes != null ? attributes.getHidden() : null, attributes != null ? attributes.getDisabled() : null), config.getStyles());
            InputCheckboxComponent inputCheckboxComponent = new InputCheckboxComponent(inputCheckbox, setQ0 != null && setQ0.contains(optionWithDescription.getValue()) == r17);
            C6221i c6221iM27374d = C6221i.m27374d(uiComponentHelper.getLayoutInflater(), c6222jM27377c.f23697b, false);
            Intrinsics.checkNotNullExpressionValue(c6221iM27374d, "inflate(...)");
            c6222jM27377c.f23697b.addView(C4252i0.m21774e(inputCheckboxComponent, uiComponentHelper, c6221iM27374d, inputCheckbox));
            c6221iM27374d.f23692b.setTag(optionWithDescription.getValue());
            if (inputCheckboxGroupComponent.getStringSetController().m24149b().contains(optionWithDescription.getValue())) {
                c6221iM27374d.f23692b.setChecked(r17);
            }
            MaterialCheckBox checkbox = c6221iM27374d.f23692b;
            Intrinsics.checkNotNullExpressionValue(checkbox, "checkbox");
            arrayList.add(checkbox);
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((MaterialCheckBox) obj).m12365c(new MaterialCheckBox.InterfaceC2778b() { // from class: cr.j0
                @Override // com.google.android.material.checkbox.MaterialCheckBox.InterfaceC2778b
                /* JADX INFO: renamed from: a */
                public final void mo12378a(MaterialCheckBox materialCheckBox, int i11) {
                    C4270l0.m21823d(inputCheckboxGroupComponent, arrayList, materialCheckBox, i11);
                }
            });
        }
        InputCheckbox.InputCheckboxComponentStyle styles = config.getStyles();
        if (styles == null || (errorTextStyle = styles.getErrorTextStyle()) == null) {
            str = null;
        } else {
            TextView checkboxGroupError = c6222jM27377c.f23698c;
            Intrinsics.checkNotNullExpressionValue(checkboxGroupError, "checkboxGroupError");
            str = null;
            C7304h0.m30392l(checkboxGroupError, errorTextStyle, null, 2, null);
        }
        String label = attributes != null ? attributes.getLabel() : str;
        if (label == null || label.length() == 0) {
            c6222jM27377c.f23699d.setVisibility(8);
        } else {
            c6222jM27377c.f23699d.setVisibility(0);
            c6222jM27377c.f23699d.setText(label);
            uiComponentHelper.m22002d(new Function0() { // from class: cr.k0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C4270l0.m21824e(config, c6222jM27377c);
                }
            });
        }
        c6222jM27377c.getRoot().setTag(c6222jM27377c);
        LinearLayout root = c6222jM27377c.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    /* JADX INFO: renamed from: d */
    public static final void m21823d(InputCheckboxGroupComponent inputCheckboxGroupComponent, List list, MaterialCheckBox checkBox, int i10) {
        Intrinsics.checkNotNullParameter(checkBox, "checkBox");
        m21825f(inputCheckboxGroupComponent, list);
    }

    /* JADX INFO: renamed from: e */
    public static final Unit m21824e(InputCheckboxGroup inputCheckboxGroup, C6222j c6222j) {
        TextBasedComponentStyle textBasedStyle;
        InputCheckbox.InputCheckboxComponentStyle styles = inputCheckboxGroup.getStyles();
        if (styles != null && (textBasedStyle = styles.getTextBasedStyle()) != null) {
            TextView checkboxGroupLabel = c6222j.f23699d;
            Intrinsics.checkNotNullExpressionValue(checkboxGroupLabel, "checkboxGroupLabel");
            C7304h0.m30392l(checkboxGroupLabel, textBasedStyle, null, 2, null);
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: f */
    public static final void m21825f(InputCheckboxGroupComponent inputCheckboxGroupComponent, List<MaterialCheckBox> list) {
        String str;
        C5205n stringSetController = inputCheckboxGroupComponent.getStringSetController();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (MaterialCheckBox materialCheckBox : list) {
            if (materialCheckBox.isChecked()) {
                Object tag = materialCheckBox.getTag();
                Intrinsics.m31981d(tag, "null cannot be cast to non-null type kotlin.String");
                str = (String) tag;
            } else {
                str = null;
            }
            if (str != null) {
                linkedHashSet.add(str);
            }
        }
        stringSetController.m24150c(linkedHashSet);
    }
}
