package cr;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.C0546c;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.InputCheckbox;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.InputCheckboxComponent;
import er.C5199h;
import gr.C6221i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p194ic.C6738b;
import p194ic.C6740d;
import p226jq.C7265j;
import p226jq.C7288z;
import p227jr.C7304h0;
import p298n2.C8870h;
import p526wq.C12537t;

/* JADX INFO: renamed from: cr.i0 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a)\u0010\n\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCheckboxComponent;", "Lcr/y4;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckbox;", "config", "Landroidx/constraintlayout/widget/ConstraintLayout;", "d", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCheckboxComponent;Lcr/y4;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckbox;)Landroidx/constraintlayout/widget/ConstraintLayout;", "Lgr/i;", "binding", "e", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCheckboxComponent;Lcr/y4;Lgr/i;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckbox;)Landroidx/constraintlayout/widget/ConstraintLayout;", "ui-step-renderer_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C4252i0 {
    @NotNull
    /* JADX INFO: renamed from: d */
    public static final ConstraintLayout m21773d(@NotNull InputCheckboxComponent inputCheckboxComponent, @NotNull C4352y4 uiComponentHelper, @NotNull InputCheckbox config) {
        Intrinsics.checkNotNullParameter(inputCheckboxComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        C6221i c6221iM27373c = C6221i.m27373c(uiComponentHelper.getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(c6221iM27373c, "inflate(...)");
        return m21774e(inputCheckboxComponent, uiComponentHelper, c6221iM27373c, config);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final ConstraintLayout m21774e(@NotNull final InputCheckboxComponent inputCheckboxComponent, @NotNull C4352y4 uiComponentHelper, @NotNull final C6221i binding, @NotNull final InputCheckbox config) {
        AttributeStyles.TextBasedTextColorStyle textColorHighlight;
        StyleElements.SimpleElementColor base;
        StyleElements.SimpleElementColorValue base2;
        Integer value;
        StyleElements.SimpleElementColor base3;
        StyleElements.SimpleElementColorValue base4;
        Integer value2;
        Intrinsics.checkNotNullParameter(inputCheckboxComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(config, "config");
        Context context = uiComponentHelper.getContext();
        binding.f23692b.setChecked(inputCheckboxComponent.getTwoStateViewController().m24155b());
        binding.f23692b.setClickable(false);
        binding.f23692b.setFocusable(false);
        InputCheckbox.Attributes attributes = config.getAttributes();
        String label = attributes != null ? attributes.getLabel() : null;
        if (label == null || StringsKt.m32182p0(label)) {
            binding.f23695e.setVisibility(8);
        } else {
            binding.f23695e.setVisibility(0);
            TextView checkboxLabel = binding.f23695e;
            Intrinsics.checkNotNullExpressionValue(checkboxLabel, "checkboxLabel");
            C5199h.m24129e(checkboxLabel, label);
        }
        InputCheckbox.Attributes attributes2 = config.getAttributes();
        String descriptionText = attributes2 != null ? attributes2.getDescriptionText() : null;
        if (descriptionText == null || StringsKt.m32182p0(descriptionText)) {
            binding.f23693c.setVisibility(8);
        } else {
            binding.f23693c.setVisibility(0);
            TextView checkboxDescription = binding.f23693c;
            Intrinsics.checkNotNullExpressionValue(checkboxDescription, "checkboxDescription");
            C5199h.m24129e(checkboxDescription, descriptionText);
        }
        binding.f23692b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: cr.f0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                C4252i0.m21775f(inputCheckboxComponent, compoundButton, z10);
            }
        });
        binding.getRoot().setOnClickListener(new View.OnClickListener() { // from class: cr.g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C4252i0.m21776g(binding, view);
            }
        });
        InputCheckbox.InputCheckboxComponentStyle styles = config.getStyles();
        if (styles != null && (textColorHighlight = styles.getTextColorHighlight()) != null && (base = textColorHighlight.getBase()) != null && (base2 = base.getBase()) != null && (value = base2.getValue()) != null) {
            int iIntValue = value.intValue();
            AttributeStyles.InputCheckboxTextColorStyle textColor = styles.getTextColor();
            int iM30328d = (textColor == null || (base3 = textColor.getBase()) == null || (base4 = base3.getBase()) == null || (value2 = base4.getValue()) == null) ? C7288z.m30328d(context, C6738b.f25903j, null, false, 6, null) : value2.intValue();
            binding.f23692b.setButtonTintList(new ColorStateList(new int[][]{new int[]{-16842910}, new int[]{-16842912}, new int[]{R.attr.state_checked}}, new int[]{C0546c.m2678l(iM30328d, (int) (C8870h.m35664g(context.getResources(), C6740d.f25930A) * 255)), iM30328d, iIntValue}));
        }
        uiComponentHelper.m22002d(new Function0() { // from class: cr.h0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C4252i0.m21777h(config, binding);
            }
        });
        binding.getRoot().setTag(binding);
        ConstraintLayout root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    /* JADX INFO: renamed from: f */
    public static final void m21775f(InputCheckboxComponent inputCheckboxComponent, CompoundButton compoundButton, boolean z10) {
        Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
        inputCheckboxComponent.getTwoStateViewController().m24156c(z10);
    }

    /* JADX INFO: renamed from: g */
    public static final void m21776g(C6221i c6221i, View view) {
        c6221i.f23692b.toggle();
    }

    /* JADX INFO: renamed from: h */
    public static final Unit m21777h(InputCheckbox inputCheckbox, C6221i c6221i) {
        TextBasedComponentStyle errorTextStyle;
        TextBasedComponentStyle descriptionTextStyle;
        TextBasedComponentStyle textBasedStyle;
        InputCheckbox.InputCheckboxComponentStyle styles = inputCheckbox.getStyles();
        if (styles != null && (textBasedStyle = styles.getTextBasedStyle()) != null) {
            TextView checkboxLabel = c6221i.f23695e;
            Intrinsics.checkNotNullExpressionValue(checkboxLabel, "checkboxLabel");
            C7304h0.m30392l(checkboxLabel, textBasedStyle, null, 2, null);
        }
        InputCheckbox.InputCheckboxComponentStyle styles2 = inputCheckbox.getStyles();
        if (styles2 != null && (descriptionTextStyle = styles2.getDescriptionTextStyle()) != null) {
            TextView checkboxDescription = c6221i.f23693c;
            Intrinsics.checkNotNullExpressionValue(checkboxDescription, "checkboxDescription");
            C7304h0.m30392l(checkboxDescription, descriptionTextStyle, null, 2, null);
        }
        InputCheckbox.InputCheckboxComponentStyle styles3 = inputCheckbox.getStyles();
        if (styles3 != null && (errorTextStyle = styles3.getErrorTextStyle()) != null) {
            TextView checkboxError = c6221i.f23694d;
            Intrinsics.checkNotNullExpressionValue(checkboxError, "checkboxError");
            C7304h0.m30392l(checkboxError, errorTextStyle, null, 2, null);
        }
        TextView checkboxLabel2 = c6221i.f23695e;
        Intrinsics.checkNotNullExpressionValue(checkboxLabel2, "checkboxLabel");
        ViewGroup.LayoutParams layoutParams = checkboxLabel2.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.C0513b c0513b = (ConstraintLayout.C0513b) layoutParams;
        TextView checkboxLabel3 = c6221i.f23695e;
        Intrinsics.checkNotNullExpressionValue(checkboxLabel3, "checkboxLabel");
        int iM46885a = C12537t.m46885a(checkboxLabel3);
        TextView checkboxDescription2 = c6221i.f23693c;
        Intrinsics.checkNotNullExpressionValue(checkboxDescription2, "checkboxDescription");
        int iM46885a2 = iM46885a + C12537t.m46885a(checkboxDescription2);
        if (iM46885a2 != 0) {
            if (iM46885a2 != 1) {
                ((ViewGroup.MarginLayoutParams) c0513b).topMargin = (int) C7265j.m30285a(4.0d);
            } else {
                ((ViewGroup.MarginLayoutParams) c0513b).topMargin = (int) C7265j.m30285a(0.0d);
            }
        }
        checkboxLabel2.setLayoutParams(c0513b);
        return Unit.f29331a;
    }
}
