package cr;

import android.graphics.drawable.ColorDrawable;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ar.C1150e;
import br.C1487a;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.InputDate;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.InputSelectComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.InputDateComponent;
import er.C5198g;
import gr.C6218f;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7699p;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mr.C8652d;
import org.jetbrains.annotations.NotNull;
import p016an.C0390s;
import p016an.InterfaceC0389r;
import p227jr.C7296d0;
import p227jr.C7304h0;
import p227jr.C7311o;

/* JADX INFO: renamed from: cr.v0 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputDateComponent;", "Lcr/y4;", "uiComponentHelper", "Ler/g;", "dateController", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputDate;", "config", "Landroidx/constraintlayout/widget/ConstraintLayout;", "b", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputDateComponent;Lcr/y4;Ler/g;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputDate;)Landroidx/constraintlayout/widget/ConstraintLayout;", "ui-step-renderer_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C4330v0 {
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final ConstraintLayout m21958b(@NotNull InputDateComponent inputDateComponent, @NotNull C4352y4 uiComponentHelper, @NotNull C5198g dateController, @NotNull InputDate config) {
        AttributeStyles.DateSelectBackgroundColorStyle backgroundColor;
        Integer inputSelectBackgroundColor;
        InputSelectComponentStyle inputSelectStyle;
        Intrinsics.checkNotNullParameter(inputDateComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(dateController, "dateController");
        Intrinsics.checkNotNullParameter(config, "config");
        final C6218f c6218fM27361c = C6218f.m27361c(uiComponentHelper.getLayoutInflater());
        final InputDate.InputDateComponentStyle styles = config.getStyles();
        InputDate.Attributes attributes = config.getAttributes();
        if (attributes != null) {
            c6218fM27361c.f23678b.setText(attributes.getLabel());
            List<String> textMonths = attributes.getTextMonths();
            if (textMonths == null) {
                textMonths = C7699p.m31892k();
            }
            C1487a c1487a = new C1487a(uiComponentHelper.getContext(), C1150e.f4869g, textMonths, (styles == null || (inputSelectStyle = styles.getInputSelectStyle()) == null) ? null : inputSelectStyle.getTextBasedStyle());
            InterfaceC0389r interfaceC0389rM24119d = dateController.getMonthController();
            AutoCompleteTextView monthEditText = c6218fM27361c.f23683g;
            Intrinsics.checkNotNullExpressionValue(monthEditText, "monthEditText");
            C0390s.m1453b(interfaceC0389rM24119d, monthEditText);
            c6218fM27361c.f23683g.setAdapter(c1487a);
            if (styles != null && (backgroundColor = styles.getBackgroundColor()) != null && (inputSelectBackgroundColor = backgroundColor.getInputSelectBackgroundColor()) != null) {
                c6218fM27361c.f23683g.setDropDownBackgroundDrawable(new ColorDrawable(inputSelectBackgroundColor.intValue()));
            }
            c6218fM27361c.f23679c.setHint(attributes.getPlaceholderDay());
            InterfaceC0389r interfaceC0389rM24118c = dateController.getDayController();
            TextInputEditText dayEditText = c6218fM27361c.f23680d;
            Intrinsics.checkNotNullExpressionValue(dayEditText, "dayEditText");
            C0390s.m1453b(interfaceC0389rM24118c, dayEditText);
            c6218fM27361c.f23684h.setHint(attributes.getPlaceholderYear());
            InterfaceC0389r interfaceC0389rM24122g = dateController.getYearController();
            TextInputEditText yearEditText = c6218fM27361c.f23685i;
            Intrinsics.checkNotNullExpressionValue(yearEditText, "yearEditText");
            C0390s.m1453b(interfaceC0389rM24122g, yearEditText);
        }
        uiComponentHelper.m22002d(new Function0() { // from class: cr.u0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C4330v0.m21960d(styles, c6218fM27361c);
            }
        });
        c6218fM27361c.getRoot().setTag(c6218fM27361c);
        ConstraintLayout constraintLayoutM27363b = c6218fM27361c.getRoot();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutM27363b, "getRoot(...)");
        return constraintLayoutM27363b;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ ConstraintLayout m21959c(InputDateComponent inputDateComponent, C4352y4 c4352y4, C5198g c5198g, InputDate inputDate, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            c5198g = inputDateComponent.getDateController();
        }
        return m21958b(inputDateComponent, c4352y4, c5198g, inputDate);
    }

    /* JADX DEBUG: Class process forced to load method for inline: jr.h0.l(android.widget.TextView, com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextViewStyle, java.util.Set, int, java.lang.Object):void */
    /* JADX INFO: renamed from: d */
    public static final Unit m21960d(InputDate.InputDateComponentStyle inputDateComponentStyle, C6218f c6218f) {
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
            ConstraintLayout constraintLayoutM27363b = c6218f.getRoot();
            Intrinsics.checkNotNullExpressionValue(constraintLayoutM27363b, "getRoot(...)");
            C8652d.m34730c(constraintLayoutM27363b, base2);
        }
        if (inputDateComponentStyle != null && (inputSelectStyle3 = inputDateComponentStyle.getInputSelectStyle()) != null && (labelStyle = inputSelectStyle3.getLabelStyle()) != null) {
            TextView dateLabel = c6218f.f23678b;
            Intrinsics.checkNotNullExpressionValue(dateLabel, "dateLabel");
            C7304h0.m30392l(dateLabel, labelStyle, null, 2, null);
        }
        if (inputDateComponentStyle != null && (inputSelectStyle2 = inputDateComponentStyle.getInputSelectStyle()) != null && (errorTextStyle = inputSelectStyle2.getErrorTextStyle()) != null) {
            TextView errorLabel = c6218f.f23681e;
            Intrinsics.checkNotNullExpressionValue(errorLabel, "errorLabel");
            C7304h0.m30392l(errorLabel, errorTextStyle, null, 2, null);
        }
        if (inputDateComponentStyle != null && (inputSelectStyle = inputDateComponentStyle.getInputSelectStyle()) != null) {
            TextInputLayout month = c6218f.f23682f;
            Intrinsics.checkNotNullExpressionValue(month, "month");
            C7311o.m30401i(month, inputSelectStyle);
        }
        if (inputDateComponentStyle != null && (inputTextStyle2 = inputDateComponentStyle.getInputTextStyle()) != null) {
            TextInputLayout day = c6218f.f23679c;
            Intrinsics.checkNotNullExpressionValue(day, "day");
            C7296d0.m30348k(day, inputTextStyle2);
        }
        if (inputDateComponentStyle != null && (inputTextStyle = inputDateComponentStyle.getInputTextStyle()) != null) {
            TextInputLayout year = c6218f.f23684h;
            Intrinsics.checkNotNullExpressionValue(year, "year");
            C7296d0.m30348k(year, inputTextStyle);
        }
        return Unit.f29331a;
    }
}
