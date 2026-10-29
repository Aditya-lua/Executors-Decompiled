package cr;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputRadioGroup;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.OptionWithDescription;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputRadioGroupComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputRadioGroupComponent;", "Lcr/y4;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup;", "config", "Landroid/widget/LinearLayout;", "f", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputRadioGroupComponent;Lcr/y4;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup;)Landroid/widget/LinearLayout;", "ui-step-renderer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class v1 {
    @NotNull
    public static final LinearLayout f(@NotNull final InputRadioGroupComponent inputRadioGroupComponent, @NotNull y4 uiComponentHelper, @NotNull final InputRadioGroup config) {
        List<OptionWithDescription> listK;
        TextBasedComponentStyle errorTextStyle;
        Intrinsics.checkNotNullParameter(inputRadioGroupComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        final gr.n nVarC = gr.n.c(uiComponentHelper.getLayoutInflater());
        InputRadioGroup.Attributes attributes = config.getAttributes();
        final ArrayList arrayList = new ArrayList();
        if (attributes == null || (listK = attributes.getOptions()) == null) {
            listK = kotlin.collections.p.k();
        }
        for (final OptionWithDescription optionWithDescription : listK) {
            final gr.b bVarC = gr.b.c(uiComponentHelper.getLayoutInflater(), nVarC.getRoot(), false);
            TextView radioButtonLabel = bVarC.f18386d;
            Intrinsics.checkNotNullExpressionValue(radioButtonLabel, "radioButtonLabel");
            er.h.e(radioButtonLabel, optionWithDescription.getText());
            String descriptionText = optionWithDescription.getDescriptionText();
            if (descriptionText == null || StringsKt.p0(descriptionText)) {
                bVarC.f18385c.setVisibility(8);
            } else {
                bVarC.f18385c.setVisibility(0);
                TextView radioButtonDescription = bVarC.f18385c;
                Intrinsics.checkNotNullExpressionValue(radioButtonDescription, "radioButtonDescription");
                er.h.e(radioButtonDescription, descriptionText);
            }
            uiComponentHelper.d(new Function0() { // from class: cr.q1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return v1.h(config, bVarC);
                }
            });
            bVarC.b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: cr.r1
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                    v1.i(arrayList, config, optionWithDescription, inputRadioGroupComponent, compoundButton, z10);
                }
            });
            bVarC.getRoot().setOnClickListener(new View.OnClickListener() { // from class: cr.s1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    v1.g(bVarC, view);
                }
            });
            nVarC.b.addView(bVarC.getRoot());
            MaterialRadioButton radioButton = bVarC.b;
            Intrinsics.checkNotNullExpressionValue(radioButton, "radioButton");
            arrayList.add(radioButton);
            if (Intrinsics.c(inputRadioGroupComponent.getTextController().b(), optionWithDescription.getValue())) {
                bVarC.b.setChecked(true);
            }
        }
        InputRadioGroup.InputRadioGroupComponentStyle styles = config.getStyles();
        if (styles != null && (errorTextStyle = styles.getErrorTextStyle()) != null) {
            TextView radioGroupError = nVarC.f18440c;
            Intrinsics.checkNotNullExpressionValue(radioGroupError, "radioGroupError");
            jr.h0.l(radioGroupError, errorTextStyle, null, 2, null);
        }
        String label = attributes != null ? attributes.getLabel() : null;
        if (label == null || label.length() == 0) {
            nVarC.f18441d.setVisibility(8);
        } else {
            nVarC.f18441d.setVisibility(0);
            nVarC.f18441d.setText(label);
            uiComponentHelper.d(new Function0() { // from class: cr.t1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return v1.j(config, nVarC);
                }
            });
        }
        uiComponentHelper.d(new Function0() { // from class: cr.u1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return v1.k(config, nVarC);
            }
        });
        nVarC.getRoot().setTag(nVarC);
        LinearLayout root = nVarC.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    public static final void g(gr.b bVar, View view) {
        if (bVar.b.isChecked()) {
            return;
        }
        bVar.b.setChecked(true);
    }

    public static final Unit h(InputRadioGroup inputRadioGroup, gr.b bVar) {
        AttributeStyles.TextBasedTextColorStyle textColorHighlight;
        StyleElements.SimpleElementColor base;
        StyleElements.SimpleElementColorValue base2;
        Integer value;
        int iD;
        TextBasedComponentStyle textBasedStyle;
        AttributeStyles.TextBasedTextColorStyle textColor;
        StyleElements.SimpleElementColor base3;
        StyleElements.SimpleElementColorValue base4;
        Integer value2;
        TextBasedComponentStyle descriptionTextStyle;
        TextBasedComponentStyle textBasedStyle2;
        InputRadioGroup.InputRadioGroupComponentStyle styles = inputRadioGroup.getStyles();
        if (styles != null && (textBasedStyle2 = styles.getTextBasedStyle()) != null) {
            TextView radioButtonLabel = bVar.f18386d;
            Intrinsics.checkNotNullExpressionValue(radioButtonLabel, "radioButtonLabel");
            jr.h0.l(radioButtonLabel, textBasedStyle2, null, 2, null);
        }
        InputRadioGroup.InputRadioGroupComponentStyle styles2 = inputRadioGroup.getStyles();
        if (styles2 != null && (descriptionTextStyle = styles2.getDescriptionTextStyle()) != null) {
            TextView radioButtonDescription = bVar.f18385c;
            Intrinsics.checkNotNullExpressionValue(radioButtonDescription, "radioButtonDescription");
            jr.h0.l(radioButtonDescription, descriptionTextStyle, null, 2, null);
        }
        InputRadioGroup.InputRadioGroupComponentStyle styles3 = inputRadioGroup.getStyles();
        if (styles3 == null || (textColorHighlight = styles3.getTextColorHighlight()) == null || (base = textColorHighlight.getBase()) == null || (base2 = base.getBase()) == null || (value = base2.getValue()) == null) {
            bVar.b.setButtonTintList(ColorStateList.valueOf(androidx.core.graphics.c.l(bVar.f18386d.getCurrentTextColor(), 150)));
        } else {
            int iIntValue = value.intValue();
            InputRadioGroup.InputRadioGroupComponentStyle styles4 = inputRadioGroup.getStyles();
            if (styles4 == null || (textBasedStyle = styles4.getTextBasedStyle()) == null || (textColor = textBasedStyle.getTextColor()) == null || (base3 = textColor.getBase()) == null || (base4 = base3.getBase()) == null || (value2 = base4.getValue()) == null) {
                Context context = bVar.f18386d.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                iD = jq.z.d(context, hc.b.f18785j, null, false, 6, null);
            } else {
                iD = value2.intValue();
            }
            bVar.b.setButtonTintList(new ColorStateList(new int[][]{new int[]{-16842910}, new int[]{-16842912}, new int[]{R.attr.state_checked}}, new int[]{androidx.core.graphics.c.l(iD, (int) (n2.h.g(bVar.f18386d.getContext().getResources(), hc.d.A) * 255)), iD, iIntValue}));
        }
        return Unit.f22483a;
    }

    public static final void i(List list, InputRadioGroup inputRadioGroup, OptionWithDescription optionWithDescription, InputRadioGroupComponent inputRadioGroupComponent, CompoundButton button, boolean z10) {
        Intrinsics.checkNotNullParameter(button, "button");
        if (z10) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!Intrinsics.c((RadioButton) obj, button)) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj2 = arrayList.get(i10);
                i10++;
                ((RadioButton) obj2).setChecked(false);
            }
            l(inputRadioGroupComponent, inputRadioGroup, optionWithDescription.getText());
        }
    }

    public static final Unit j(InputRadioGroup inputRadioGroup, gr.n nVar) {
        TextBasedComponentStyle textBasedStyle;
        InputRadioGroup.InputRadioGroupComponentStyle styles = inputRadioGroup.getStyles();
        if (styles != null && (textBasedStyle = styles.getTextBasedStyle()) != null) {
            TextView radioGroupLabel = nVar.f18441d;
            Intrinsics.checkNotNullExpressionValue(radioGroupLabel, "radioGroupLabel");
            jr.h0.l(radioGroupLabel, textBasedStyle, null, 2, null);
        }
        return Unit.f22483a;
    }

    public static final Unit k(InputRadioGroup inputRadioGroup, gr.n nVar) {
        StyleElements.SizeSet margins;
        InputRadioGroup.InputRadioGroupComponentStyle styles = inputRadioGroup.getStyles();
        if (styles != null && (margins = styles.getMargins()) != null) {
            LinearLayout root = nVar.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            mr.d.c(root, margins);
        }
        return Unit.f22483a;
    }

    public static final void l(InputRadioGroupComponent inputRadioGroupComponent, InputRadioGroup inputRadioGroup, String str) {
        List<OptionWithDescription> options;
        Object next;
        InputRadioGroup.Attributes attributes = inputRadioGroup.getAttributes();
        String value = null;
        if (attributes != null && (options = attributes.getOptions()) != null) {
            Iterator<T> it = options.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.c(((OptionWithDescription) next).getText(), str));
            OptionWithDescription optionWithDescription = (OptionWithDescription) next;
            if (optionWithDescription != null) {
                value = optionWithDescription.getValue();
            }
        }
        if (value != null) {
            inputRadioGroupComponent.getTextController().c(value);
        }
    }
}
