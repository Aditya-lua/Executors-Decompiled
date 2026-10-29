package cr;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.core.graphics.C0546c;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.InputRadioGroup;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.OptionWithDescription;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.InputRadioGroupComponent;
import er.C5199h;
import gr.C6214b;
import gr.C6226n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7699p;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import mr.C8652d;
import org.jetbrains.annotations.NotNull;
import p194ic.C6738b;
import p194ic.C6740d;
import p226jq.C7288z;
import p227jr.C7304h0;
import p298n2.C8870h;

/* JADX INFO: renamed from: cr.v1 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputRadioGroupComponent;", "Lcr/y4;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup;", "config", "Landroid/widget/LinearLayout;", "f", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputRadioGroupComponent;Lcr/y4;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup;)Landroid/widget/LinearLayout;", "ui-step-renderer_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C4331v1 {
    @NotNull
    /* JADX INFO: renamed from: f */
    public static final LinearLayout m21966f(@NotNull final InputRadioGroupComponent inputRadioGroupComponent, @NotNull C4352y4 uiComponentHelper, @NotNull final InputRadioGroup config) {
        List<OptionWithDescription> listM31892k;
        TextBasedComponentStyle errorTextStyle;
        Intrinsics.checkNotNullParameter(inputRadioGroupComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        final C6226n c6226nM27393c = C6226n.m27393c(uiComponentHelper.getLayoutInflater());
        InputRadioGroup.Attributes attributes = config.getAttributes();
        final ArrayList arrayList = new ArrayList();
        if (attributes == null || (listM31892k = attributes.getOptions()) == null) {
            listM31892k = C7699p.m31892k();
        }
        for (final OptionWithDescription optionWithDescription : listM31892k) {
            final C6214b c6214bM27346c = C6214b.m27346c(uiComponentHelper.getLayoutInflater(), c6226nM27393c.getRoot(), false);
            TextView radioButtonLabel = c6214bM27346c.f23647d;
            Intrinsics.checkNotNullExpressionValue(radioButtonLabel, "radioButtonLabel");
            C5199h.m24129e(radioButtonLabel, optionWithDescription.getText());
            String descriptionText = optionWithDescription.getDescriptionText();
            if (descriptionText == null || StringsKt.m32182p0(descriptionText)) {
                c6214bM27346c.f23646c.setVisibility(8);
            } else {
                c6214bM27346c.f23646c.setVisibility(0);
                TextView radioButtonDescription = c6214bM27346c.f23646c;
                Intrinsics.checkNotNullExpressionValue(radioButtonDescription, "radioButtonDescription");
                C5199h.m24129e(radioButtonDescription, descriptionText);
            }
            uiComponentHelper.m22002d(new Function0() { // from class: cr.q1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C4331v1.m21968h(config, c6214bM27346c);
                }
            });
            c6214bM27346c.f23645b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: cr.r1
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                    C4331v1.m21969i(arrayList, config, optionWithDescription, inputRadioGroupComponent, compoundButton, z10);
                }
            });
            c6214bM27346c.getRoot().setOnClickListener(new View.OnClickListener() { // from class: cr.s1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C4331v1.m21967g(c6214bM27346c, view);
                }
            });
            c6226nM27393c.f23711b.addView(c6214bM27346c.getRoot());
            MaterialRadioButton radioButton = c6214bM27346c.f23645b;
            Intrinsics.checkNotNullExpressionValue(radioButton, "radioButton");
            arrayList.add(radioButton);
            if (Intrinsics.m31980c(inputRadioGroupComponent.getTextController().mo1450b(), optionWithDescription.getValue())) {
                c6214bM27346c.f23645b.setChecked(true);
            }
        }
        InputRadioGroup.InputRadioGroupComponentStyle styles = config.getStyles();
        if (styles != null && (errorTextStyle = styles.getErrorTextStyle()) != null) {
            TextView radioGroupError = c6226nM27393c.f23712c;
            Intrinsics.checkNotNullExpressionValue(radioGroupError, "radioGroupError");
            C7304h0.m30392l(radioGroupError, errorTextStyle, null, 2, null);
        }
        String label = attributes != null ? attributes.getLabel() : null;
        if (label == null || label.length() == 0) {
            c6226nM27393c.f23713d.setVisibility(8);
        } else {
            c6226nM27393c.f23713d.setVisibility(0);
            c6226nM27393c.f23713d.setText(label);
            uiComponentHelper.m22002d(new Function0() { // from class: cr.t1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C4331v1.m21970j(config, c6226nM27393c);
                }
            });
        }
        uiComponentHelper.m22002d(new Function0() { // from class: cr.u1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C4331v1.m21971k(config, c6226nM27393c);
            }
        });
        c6226nM27393c.getRoot().setTag(c6226nM27393c);
        LinearLayout root = c6226nM27393c.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    /* JADX INFO: renamed from: g */
    public static final void m21967g(C6214b c6214b, View view) {
        if (c6214b.f23645b.isChecked()) {
            return;
        }
        c6214b.f23645b.setChecked(true);
    }

    /* JADX INFO: renamed from: h */
    public static final Unit m21968h(InputRadioGroup inputRadioGroup, C6214b c6214b) {
        AttributeStyles.TextBasedTextColorStyle textColorHighlight;
        StyleElements.SimpleElementColor base;
        StyleElements.SimpleElementColorValue base2;
        Integer value;
        int iM30328d;
        TextBasedComponentStyle textBasedStyle;
        AttributeStyles.TextBasedTextColorStyle textColor;
        StyleElements.SimpleElementColor base3;
        StyleElements.SimpleElementColorValue base4;
        Integer value2;
        TextBasedComponentStyle descriptionTextStyle;
        TextBasedComponentStyle textBasedStyle2;
        InputRadioGroup.InputRadioGroupComponentStyle styles = inputRadioGroup.getStyles();
        if (styles != null && (textBasedStyle2 = styles.getTextBasedStyle()) != null) {
            TextView radioButtonLabel = c6214b.f23647d;
            Intrinsics.checkNotNullExpressionValue(radioButtonLabel, "radioButtonLabel");
            C7304h0.m30392l(radioButtonLabel, textBasedStyle2, null, 2, null);
        }
        InputRadioGroup.InputRadioGroupComponentStyle styles2 = inputRadioGroup.getStyles();
        if (styles2 != null && (descriptionTextStyle = styles2.getDescriptionTextStyle()) != null) {
            TextView radioButtonDescription = c6214b.f23646c;
            Intrinsics.checkNotNullExpressionValue(radioButtonDescription, "radioButtonDescription");
            C7304h0.m30392l(radioButtonDescription, descriptionTextStyle, null, 2, null);
        }
        InputRadioGroup.InputRadioGroupComponentStyle styles3 = inputRadioGroup.getStyles();
        if (styles3 == null || (textColorHighlight = styles3.getTextColorHighlight()) == null || (base = textColorHighlight.getBase()) == null || (base2 = base.getBase()) == null || (value = base2.getValue()) == null) {
            c6214b.f23645b.setButtonTintList(ColorStateList.valueOf(C0546c.m2678l(c6214b.f23647d.getCurrentTextColor(), 150)));
        } else {
            int iIntValue = value.intValue();
            InputRadioGroup.InputRadioGroupComponentStyle styles4 = inputRadioGroup.getStyles();
            if (styles4 == null || (textBasedStyle = styles4.getTextBasedStyle()) == null || (textColor = textBasedStyle.getTextColor()) == null || (base3 = textColor.getBase()) == null || (base4 = base3.getBase()) == null || (value2 = base4.getValue()) == null) {
                Context context = c6214b.f23647d.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                iM30328d = C7288z.m30328d(context, C6738b.f25903j, null, false, 6, null);
            } else {
                iM30328d = value2.intValue();
            }
            c6214b.f23645b.setButtonTintList(new ColorStateList(new int[][]{new int[]{-16842910}, new int[]{-16842912}, new int[]{R.attr.state_checked}}, new int[]{C0546c.m2678l(iM30328d, (int) (C8870h.m35664g(c6214b.f23647d.getContext().getResources(), C6740d.f25930A) * 255)), iM30328d, iIntValue}));
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: i */
    public static final void m21969i(List list, InputRadioGroup inputRadioGroup, OptionWithDescription optionWithDescription, InputRadioGroupComponent inputRadioGroupComponent, CompoundButton button, boolean z10) {
        Intrinsics.checkNotNullParameter(button, "button");
        if (z10) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!Intrinsics.m31980c((RadioButton) obj, button)) {
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
            m21972l(inputRadioGroupComponent, inputRadioGroup, optionWithDescription.getText());
        }
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m21970j(InputRadioGroup inputRadioGroup, C6226n c6226n) {
        TextBasedComponentStyle textBasedStyle;
        InputRadioGroup.InputRadioGroupComponentStyle styles = inputRadioGroup.getStyles();
        if (styles != null && (textBasedStyle = styles.getTextBasedStyle()) != null) {
            TextView radioGroupLabel = c6226n.f23713d;
            Intrinsics.checkNotNullExpressionValue(radioGroupLabel, "radioGroupLabel");
            C7304h0.m30392l(radioGroupLabel, textBasedStyle, null, 2, null);
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m21971k(InputRadioGroup inputRadioGroup, C6226n c6226n) {
        StyleElements.SizeSet margins;
        InputRadioGroup.InputRadioGroupComponentStyle styles = inputRadioGroup.getStyles();
        if (styles != null && (margins = styles.getMargins()) != null) {
            LinearLayout root = c6226n.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            C8652d.m34730c(root, margins);
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: l */
    public static final void m21972l(InputRadioGroupComponent inputRadioGroupComponent, InputRadioGroup inputRadioGroup, String str) {
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
            } while (!Intrinsics.m31980c(((OptionWithDescription) next).getText(), str));
            OptionWithDescription optionWithDescription = (OptionWithDescription) next;
            if (optionWithDescription != null) {
                value = optionWithDescription.getValue();
            }
        }
        if (value != null) {
            inputRadioGroupComponent.getTextController().mo1451c(value);
        }
    }
}
