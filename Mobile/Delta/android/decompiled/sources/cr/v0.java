package cr;

import android.graphics.drawable.ColorDrawable;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputDate;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputSelectComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputDateComponent;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputDateComponent;", "Lcr/y4;", "uiComponentHelper", "Ler/g;", "dateController", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputDate;", "config", "Landroidx/constraintlayout/widget/ConstraintLayout;", "b", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputDateComponent;Lcr/y4;Ler/g;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputDate;)Landroidx/constraintlayout/widget/ConstraintLayout;", "ui-step-renderer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class v0 {
    @NotNull
    public static final ConstraintLayout b(@NotNull InputDateComponent inputDateComponent, @NotNull y4 uiComponentHelper, @NotNull er.g dateController, @NotNull InputDate config) {
        AttributeStyles.DateSelectBackgroundColorStyle backgroundColor;
        Integer inputSelectBackgroundColor;
        InputSelectComponentStyle inputSelectStyle;
        Intrinsics.checkNotNullParameter(inputDateComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(dateController, "dateController");
        Intrinsics.checkNotNullParameter(config, "config");
        final gr.f fVarC = gr.f.c(uiComponentHelper.getLayoutInflater());
        final InputDate.InputDateComponentStyle styles = config.getStyles();
        InputDate.Attributes attributes = config.getAttributes();
        if (attributes != null) {
            fVarC.b.setText(attributes.getLabel());
            List<String> textMonths = attributes.getTextMonths();
            if (textMonths == null) {
                textMonths = kotlin.collections.p.k();
            }
            br.a aVar = new br.a(uiComponentHelper.getContext(), ar.e.f3714g, textMonths, (styles == null || (inputSelectStyle = styles.getInputSelectStyle()) == null) ? null : inputSelectStyle.getTextBasedStyle());
            an.r rVarD = dateController.getMonthController();
            AutoCompleteTextView monthEditText = fVarC.f18418g;
            Intrinsics.checkNotNullExpressionValue(monthEditText, "monthEditText");
            an.s.b(rVarD, monthEditText);
            fVarC.f18418g.setAdapter(aVar);
            if (styles != null && (backgroundColor = styles.getBackgroundColor()) != null && (inputSelectBackgroundColor = backgroundColor.getInputSelectBackgroundColor()) != null) {
                fVarC.f18418g.setDropDownBackgroundDrawable(new ColorDrawable(inputSelectBackgroundColor.intValue()));
            }
            fVarC.f18414c.setHint(attributes.getPlaceholderDay());
            an.r rVarC = dateController.getDayController();
            TextInputEditText dayEditText = fVarC.f18415d;
            Intrinsics.checkNotNullExpressionValue(dayEditText, "dayEditText");
            an.s.b(rVarC, dayEditText);
            fVarC.f18419h.setHint(attributes.getPlaceholderYear());
            an.r rVarG = dateController.getYearController();
            TextInputEditText yearEditText = fVarC.f18420i;
            Intrinsics.checkNotNullExpressionValue(yearEditText, "yearEditText");
            an.s.b(rVarG, yearEditText);
        }
        uiComponentHelper.d(new Function0() { // from class: cr.u0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return v0.d(styles, fVarC);
            }
        });
        fVarC.getRoot().setTag(fVarC);
        ConstraintLayout constraintLayoutB = fVarC.getRoot();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    public static /* synthetic */ ConstraintLayout c(InputDateComponent inputDateComponent, y4 y4Var, er.g gVar, InputDate inputDate, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            gVar = inputDateComponent.getDateController();
        }
        return b(inputDateComponent, y4Var, gVar, inputDate);
    }

    public static final Unit d(InputDate.InputDateComponentStyle inputDateComponentStyle, gr.f fVar) {
        InputTextBasedComponentStyle inputTextStyle;
        InputTextBasedComponentStyle inputTextStyle2;
        InputSelectComponentStyle inputSelectStyle;
        InputSelectComponentStyle inputSelectStyle2;
        TextBasedComponentStyle errorTextStyle;
        InputSelectComponentStyle inputSelectStyle3;
        TextBasedComponentStyle labelStyle;
        AttributeStyles.InputMarginStyle margin;
        StyleElements.MeasurementSet base;
        StyleElements.SizeSet base2;
        if (inputDateComponentStyle != null && (margin = inputDateComponentStyle.getMargin()) != null && (base = margin.getBase()) != null && (base2 = base.getBase()) != null) {
            ConstraintLayout constraintLayoutB = fVar.getRoot();
            Intrinsics.checkNotNullExpressionValue(constraintLayoutB, "getRoot(...)");
            mr.d.c(constraintLayoutB, base2);
        }
        if (inputDateComponentStyle != null && (inputSelectStyle3 = inputDateComponentStyle.getInputSelectStyle()) != null && (labelStyle = inputSelectStyle3.getLabelStyle()) != null) {
            TextView dateLabel = fVar.b;
            Intrinsics.checkNotNullExpressionValue(dateLabel, "dateLabel");
            jr.h0.l(dateLabel, labelStyle, null, 2, null);
        }
        if (inputDateComponentStyle != null && (inputSelectStyle2 = inputDateComponentStyle.getInputSelectStyle()) != null && (errorTextStyle = inputSelectStyle2.getErrorTextStyle()) != null) {
            TextView errorLabel = fVar.f18416e;
            Intrinsics.checkNotNullExpressionValue(errorLabel, "errorLabel");
            jr.h0.l(errorLabel, errorTextStyle, null, 2, null);
        }
        if (inputDateComponentStyle != null && (inputSelectStyle = inputDateComponentStyle.getInputSelectStyle()) != null) {
            TextInputLayout month = fVar.f18417f;
            Intrinsics.checkNotNullExpressionValue(month, "month");
            jr.o.i(month, inputSelectStyle);
        }
        if (inputDateComponentStyle != null && (inputTextStyle2 = inputDateComponentStyle.getInputTextStyle()) != null) {
            TextInputLayout day = fVar.f18414c;
            Intrinsics.checkNotNullExpressionValue(day, "day");
            jr.d0.k(day, inputTextStyle2);
        }
        if (inputDateComponentStyle != null && (inputTextStyle = inputDateComponentStyle.getInputTextStyle()) != null) {
            TextInputLayout year = fVar.f18419h;
            Intrinsics.checkNotNullExpressionValue(year, "year");
            jr.d0.k(year, inputTextStyle);
        }
        return Unit.f22483a;
    }
}
