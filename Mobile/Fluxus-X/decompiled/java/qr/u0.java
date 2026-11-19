package qr;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputCheckbox;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputCheckboxComponent;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a)\u0010\n\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCheckboxComponent;", "Lqr/z5;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckbox;", "config", "Landroidx/constraintlayout/widget/ConstraintLayout;", "d", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCheckboxComponent;Lqr/z5;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckbox;)Landroidx/constraintlayout/widget/ConstraintLayout;", "Lur/i;", "binding", "e", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCheckboxComponent;Lqr/z5;Lur/i;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckbox;)Landroidx/constraintlayout/widget/ConstraintLayout;", "ui-step-renderer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class u0 {
    @NotNull
    public static final ConstraintLayout d(@NotNull InputCheckboxComponent inputCheckboxComponent, @NotNull z5 uiComponentHelper, @NotNull InputCheckbox config) {
        Intrinsics.checkNotNullParameter(inputCheckboxComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        ur.i iVarC = ur.i.c(uiComponentHelper.getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(iVarC, "inflate(...)");
        return e(inputCheckboxComponent, uiComponentHelper, iVarC, config);
    }

    @NotNull
    public static final ConstraintLayout e(@NotNull final InputCheckboxComponent inputCheckboxComponent, @NotNull z5 uiComponentHelper, @NotNull final ur.i binding, @NotNull final InputCheckbox config) {
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
        binding.b.setChecked(inputCheckboxComponent.getTwoStateViewController().b());
        binding.b.setClickable(false);
        binding.b.setFocusable(false);
        InputCheckbox.Attributes attributes = config.getAttributes();
        String label = attributes != null ? attributes.getLabel() : null;
        if (label == null || StringsKt.p0(label)) {
            binding.f33897e.setVisibility(8);
        } else {
            binding.f33897e.setVisibility(0);
            TextView checkboxLabel = binding.f33897e;
            Intrinsics.checkNotNullExpressionValue(checkboxLabel, "checkboxLabel");
            sr.h.e(checkboxLabel, label);
        }
        InputCheckbox.Attributes attributes2 = config.getAttributes();
        String descriptionText = attributes2 != null ? attributes2.getDescriptionText() : null;
        if (descriptionText == null || StringsKt.p0(descriptionText)) {
            binding.f33895c.setVisibility(8);
        } else {
            binding.f33895c.setVisibility(0);
            TextView checkboxDescription = binding.f33895c;
            Intrinsics.checkNotNullExpressionValue(checkboxDescription, "checkboxDescription");
            sr.h.e(checkboxDescription, descriptionText);
        }
        binding.b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: qr.r0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                u0.f(inputCheckboxComponent, compoundButton, z10);
            }
        });
        binding.getRoot().setOnClickListener(new View.OnClickListener() { // from class: qr.s0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                u0.g(binding, view);
            }
        });
        InputCheckbox.InputCheckboxComponentStyle styles = config.getStyles();
        if (styles != null && (textColorHighlight = styles.getTextColorHighlight()) != null && (base = textColorHighlight.getBase()) != null && (base2 = base.getBase()) != null && (value = base2.getValue()) != null) {
            int iIntValue = value.intValue();
            AttributeStyles.InputCheckboxTextColorStyle textColor = styles.getTextColor();
            int iD = (textColor == null || (base3 = textColor.getBase()) == null || (base4 = base3.getBase()) == null || (value2 = base4.getValue()) == null) ? xq.z.d(context, jc.b.f20295j, null, false, 6, null) : value2.intValue();
            binding.b.setButtonTintList(new ColorStateList(new int[][]{new int[]{-16842910}, new int[]{-16842912}, new int[]{R.attr.state_checked}}, new int[]{androidx.core.graphics.c.l(iD, (int) (n2.h.g(context.getResources(), jc.d.A) * 255)), iD, iIntValue}));
        }
        uiComponentHelper.d(new Function0() { // from class: qr.t0
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return u0.h(config, binding);
            }
        });
        binding.getRoot().setTag(binding);
        ConstraintLayout root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    public static final void f(InputCheckboxComponent inputCheckboxComponent, CompoundButton compoundButton, boolean z10) {
        Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
        inputCheckboxComponent.getTwoStateViewController().c(z10);
    }

    public static final void g(ur.i iVar, View view) {
        iVar.b.toggle();
    }

    public static final Unit h(InputCheckbox inputCheckbox, ur.i iVar) {
        TextBasedComponentStyle errorTextStyle;
        TextBasedComponentStyle descriptionTextStyle;
        TextBasedComponentStyle textBasedStyle;
        InputCheckbox.InputCheckboxComponentStyle styles = inputCheckbox.getStyles();
        if (styles != null && (textBasedStyle = styles.getTextBasedStyle()) != null) {
            TextView checkboxLabel = iVar.f33897e;
            Intrinsics.checkNotNullExpressionValue(checkboxLabel, "checkboxLabel");
            yr.h0.l(checkboxLabel, textBasedStyle, null, 2, null);
        }
        InputCheckbox.InputCheckboxComponentStyle styles2 = inputCheckbox.getStyles();
        if (styles2 != null && (descriptionTextStyle = styles2.getDescriptionTextStyle()) != null) {
            TextView checkboxDescription = iVar.f33895c;
            Intrinsics.checkNotNullExpressionValue(checkboxDescription, "checkboxDescription");
            yr.h0.l(checkboxDescription, descriptionTextStyle, null, 2, null);
        }
        InputCheckbox.InputCheckboxComponentStyle styles3 = inputCheckbox.getStyles();
        if (styles3 != null && (errorTextStyle = styles3.getErrorTextStyle()) != null) {
            TextView checkboxError = iVar.f33896d;
            Intrinsics.checkNotNullExpressionValue(checkboxError, "checkboxError");
            yr.h0.l(checkboxError, errorTextStyle, null, 2, null);
        }
        TextView checkboxLabel2 = iVar.f33897e;
        Intrinsics.checkNotNullExpressionValue(checkboxLabel2, "checkboxLabel");
        ViewGroup.LayoutParams layoutParams = checkboxLabel2.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        TextView checkboxLabel3 = iVar.f33897e;
        Intrinsics.checkNotNullExpressionValue(checkboxLabel3, "checkboxLabel");
        int iA = kr.u.a(checkboxLabel3);
        TextView checkboxDescription2 = iVar.f33895c;
        Intrinsics.checkNotNullExpressionValue(checkboxDescription2, "checkboxDescription");
        int iA2 = iA + kr.u.a(checkboxDescription2);
        if (iA2 != 0) {
            if (iA2 != 1) {
                ((ViewGroup.MarginLayoutParams) bVar).topMargin = (int) xq.j.a(4.0d);
            } else {
                ((ViewGroup.MarginLayoutParams) bVar).topMargin = (int) xq.j.a(0.0d);
            }
        }
        checkboxLabel2.setLayoutParams(bVar);
        return Unit.f21506a;
    }
}
