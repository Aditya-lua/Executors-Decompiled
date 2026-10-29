package jo;

import an.ViewEnvironment;
import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputSelectComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaMaterialButton;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.steps.ui.components.Option;
import cr.w1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jr.h0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0014\u001a\u00020\b*\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00162\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\b0\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ1\u0010#\u001a\u00020\u00162\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00190\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b#\u0010$J1\u0010'\u001a\u00020\u00162\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00190\u001f2\b\u0010&\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b'\u0010$J=\u0010,\u001a\u00020\u00162\u0006\u0010(\u001a\u00020!2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00190\u001f2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00190\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010+H\u0002¢\u0006\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010.R\u0014\u00102\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00101R\u0014\u00106\u001a\u0002038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105¨\u00067"}, d2 = {"Ljo/y;", "Ljo/c0;", "Landroid/content/Context;", "context", "Landroid/view/ViewGroup;", "container", "<init>", "(Landroid/content/Context;Landroid/view/ViewGroup;)V", "", "a", "()V", "Lan/y;", "viewEnvironment", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$a;", "rendering", "b", "(Lan/y;Lcom/withpersona/sdk2/inquiry/governmentid/Screen$a;)V", "Lno/k;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "k", "(Lno/k;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Lan/y;)V", "Lcr/w1;", "inputSelectComponent", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;", "onOptionSelected", "v", "(Lcr/w1;Lkotlin/jvm/functions/Function1;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepInputSelectStyle;", "style", "", "countryOptions", "", "selectedCountryCode", "s", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepInputSelectStyle;Ljava/util/List;Ljava/lang/String;)Lcr/w1;", "idClassOptions", "selectedIdClass", "t", "name", "options", "selectedOptions", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;", "u", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;)Lcr/w1;", "Lno/k;", "binding", "Lhr/j;", "Lhr/j;", "inputSelectBottomSheetController", "Landroid/view/View;", "getRoot", "()Landroid/view/View;", "root", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class y implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final no.k binding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final hr.j inputSelectBottomSheetController;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\r¨\u0006\u0015"}, d2 = {"jo/y$a", "Lcr/w1;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;", "a", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;", "styles", "", "j", "()Z", "canSelectMultipleValues", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;", "g", "()Ljava/util/List;", "options", "", "f", "()Ljava/lang/String;", "label", "m", "selectedOptions", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements w1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InputSelectComponentStyle f21571a;
        public final /* synthetic */ List<Option> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f21572c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ List<Option> f21573d;

        public a(InputSelectComponentStyle inputSelectComponentStyle, List<Option> list, String str, List<Option> list2) {
            this.f21571a = inputSelectComponentStyle;
            this.b = list;
            this.f21572c = str;
            this.f21573d = list2;
        }

        @Override // cr.w1
        /* JADX INFO: renamed from: a, reason: from getter and merged with bridge method [inline-methods] */
        public InputSelectComponentStyle getStyles() {
            return this.f21571a;
        }

        @Override // cr.w1
        /* JADX INFO: renamed from: f */
        public String getLabel() {
            return null;
        }

        @Override // cr.w1
        public List<Option> g() {
            return this.b;
        }

        @Override // cr.w1
        /* JADX INFO: renamed from: j */
        public boolean getCanSelectMultipleValues() {
            return false;
        }

        @Override // cr.w1
        public List<Option> m() {
            return this.f21573d;
        }

        @Override // cr.w1
        /* JADX INFO: renamed from: n */
        public RemoteImage getLeadingImageTemplate() {
            return super.getLeadingImageTemplate();
        }
    }

    public y(@NotNull Context context, @Nullable ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(context, "context");
        no.k kVarC = no.k.c(LayoutInflater.from(context), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(kVarC, "inflate(...)");
        this.binding = kVarC;
        CoordinatorLayout root = kVarC.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        this.inputSelectBottomSheetController = new hr.j(root);
    }

    public static final Unit l(Screen.a aVar) {
        aVar.l().invoke();
        return Unit.f22483a;
    }

    public static final Unit m(Screen.a aVar) {
        aVar.m().invoke();
        return Unit.f22483a;
    }

    public static final void n(y yVar, w1 w1Var, Screen.a aVar, View view) {
        yVar.v(w1Var, aVar.o());
    }

    public static final void o(y yVar, w1 w1Var, Screen.a aVar, View view) {
        yVar.v(w1Var, aVar.o());
    }

    public static final void p(y yVar, w1 w1Var, Screen.a aVar, View view) {
        yVar.v(w1Var, aVar.p());
    }

    public static final void q(y yVar, w1 w1Var, Screen.a aVar, View view) {
        yVar.v(w1Var, aVar.p());
    }

    public static final void r(Screen.a aVar, View view) {
        aVar.n().invoke();
    }

    public static final Unit w(Function1 function1, List selectedItems) {
        Intrinsics.checkNotNullParameter(selectedItems, "selectedItems");
        Option option = (Option) CollectionsKt.firstOrNull(selectedItems);
        if (option == null) {
            return Unit.f22483a;
        }
        function1.invoke(option);
        return Unit.f22483a;
    }

    @Override // jo.c0
    public void a() {
        LinearLayout contentView = this.binding.b;
        Intrinsics.checkNotNullExpressionValue(contentView, "contentView");
        wq.g.d(contentView, false, false, false, false, 15, null);
    }

    @Override // jo.c0
    public void b(@NotNull ViewEnvironment viewEnvironment, @NotNull final Screen.a rendering) {
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        no.k kVar = this.binding;
        NavigationState navigationState = rendering.getNavigationState();
        Function0 function0 = new Function0() { // from class: jo.q
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return y.l(rendering);
            }
        };
        Function0 function1 = new Function0() { // from class: jo.r
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return y.m(rendering);
            }
        };
        Pi2NavigationBar navigationBar = kVar.f26586j;
        Intrinsics.checkNotNullExpressionValue(navigationBar, "navigationBar");
        CoordinatorLayout root = kVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        StepStyles.GovernmentIdStepStyle styles = rendering.getStyles();
        Rect rectH = styles != null ? er.h.h(styles) : null;
        String navBarTitle = rendering.getNavBarTitle();
        StepStyles.GovernmentIdStepStyle styles2 = rendering.getStyles();
        ir.c.e(navigationState, function0, function1, null, navigationBar, root, rectH, navBarTitle, styles2 != null ? styles2.getNavBarTitleStyleValue() : null, 8, null);
        TextView title = kVar.f26587k;
        Intrinsics.checkNotNullExpressionValue(title, "title");
        wq.t.b(title, rendering.getManualClassificationTitle());
        StepStyles.GovernmentIdStepStyle styles3 = rendering.getStyles();
        StepStyles.GovernmentIdStepInputSelectStyle inputSelectStyle = styles3 != null ? styles3.getInputSelectStyle() : null;
        List<Screen.a.CountryOption> listE = rendering.e();
        ArrayList arrayList = new ArrayList(kotlin.collections.q.u(listE, 10));
        for (Screen.a.CountryOption countryOption : listE) {
            arrayList.add(new Option(countryOption.getCountryName(), countryOption.getCountryCode(), null, 4, null));
        }
        final w1 w1VarS = s(inputSelectStyle, arrayList, rendering.getSelectedCountryCode());
        StepStyles.GovernmentIdStepStyle styles4 = rendering.getStyles();
        final w1 w1VarT = t(styles4 != null ? styles4.getInputSelectStyle() : null, rendering.h(), rendering.getSelectedIdClass());
        Option option = (Option) CollectionsKt.firstOrNull(w1VarS.m());
        String text = option != null ? option.getText() : null;
        kVar.f26580d.setOnClickListener(new View.OnClickListener() { // from class: jo.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y.n(this.f21560a, w1VarS, rendering, view);
            }
        });
        EditText editText = kVar.f26580d.getEditText();
        if (editText != null) {
            editText.setOnClickListener(new View.OnClickListener() { // from class: jo.t
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    y.o(this.f21562a, w1VarS, rendering, view);
                }
            });
        }
        EditText editText2 = kVar.f26580d.getEditText();
        if (editText2 != null) {
            editText2.setText(text);
        }
        if (text != null) {
            kVar.f26583g.setEnabled(true);
            EditText editText3 = kVar.f26583g.getEditText();
            if (editText3 != null) {
                editText3.setEnabled(true);
            }
            kVar.f26583g.setOnClickListener(new View.OnClickListener() { // from class: jo.u
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    y.p(this.f21564a, w1VarT, rendering, view);
                }
            });
            EditText editText4 = kVar.f26583g.getEditText();
            if (editText4 != null) {
                editText4.setOnClickListener(new View.OnClickListener() { // from class: jo.v
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        y.q(this.f21566a, w1VarT, rendering, view);
                    }
                });
            }
            EditText editText5 = kVar.f26583g.getEditText();
            if (editText5 != null) {
                Option option2 = (Option) CollectionsKt.firstOrNull(w1VarT.m());
                editText5.setText(option2 != null ? option2.getText() : null);
            }
        } else {
            kVar.f26583g.setEnabled(false);
            EditText editText6 = kVar.f26583g.getEditText();
            if (editText6 != null) {
                editText6.setEnabled(false);
            }
        }
        kVar.f26581e.setText(rendering.getCountryInputTitle());
        kVar.f26584h.setText(rendering.getIdClassInputTitle());
        kVar.f26579c.setEnabled(rendering.getIsContinueEnabled());
        kVar.f26579c.setOnClickListener(new View.OnClickListener() { // from class: jo.w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y.r(rendering, view);
            }
        });
        kVar.f26579c.setText(rendering.getContinueButtonText());
        k(kVar, rendering.getStyles(), viewEnvironment);
    }

    @Override // jo.c0
    @NotNull
    public View getRoot() {
        CoordinatorLayout root = this.binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    public final void k(no.k kVar, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, ViewEnvironment viewEnvironment) {
        StepStyles.StepSubmitButtonComponentStyleContainer base;
        ButtonSubmitComponentStyle base2;
        StepStyles.InputSelectStyleContainer base3;
        InputSelectComponentStyle base4;
        StepStyles.StepTextBasedComponentStyleContainer base5;
        TextBasedComponentStyle base6;
        StepStyles.StepTextBasedComponentStyleContainer base7;
        TextBasedComponentStyle base8;
        if (governmentIdStepStyle == null) {
            return;
        }
        Integer backgroundColorValue = governmentIdStepStyle.getBackgroundColorValue();
        if (backgroundColorValue != null) {
            int iIntValue = backgroundColorValue.intValue();
            kVar.getRoot().setBackgroundColor(iIntValue);
            Context context = kVar.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            vq.c.b(viewEnvironment, context, iIntValue);
        }
        StepStyles.GovernmentIdStepTitleComponentStyle titleStyle = governmentIdStepStyle.getTitleStyle();
        if (titleStyle != null && (base7 = titleStyle.getBase()) != null && (base8 = base7.getBase()) != null) {
            TextView title = kVar.f26587k;
            Intrinsics.checkNotNullExpressionValue(title, "title");
            h0.l(title, base8, null, 2, null);
        }
        StepStyles.GovernmentIdStepTextBasedComponentStyle textStyle = governmentIdStepStyle.getTextStyle();
        if (textStyle != null && (base5 = textStyle.getBase()) != null && (base6 = base5.getBase()) != null) {
            TextView countrySelectorText = kVar.f26581e;
            Intrinsics.checkNotNullExpressionValue(countrySelectorText, "countrySelectorText");
            h0.l(countrySelectorText, base6, null, 2, null);
            TextView idClassSelectorText = kVar.f26584h;
            Intrinsics.checkNotNullExpressionValue(idClassSelectorText, "idClassSelectorText");
            h0.l(idClassSelectorText, base6, null, 2, null);
        }
        StepStyles.GovernmentIdStepInputSelectStyle inputSelectStyle = governmentIdStepStyle.getInputSelectStyle();
        if (inputSelectStyle != null && (base3 = inputSelectStyle.getBase()) != null && (base4 = base3.getBase()) != null) {
            TextInputLayout countrySelector = kVar.f26580d;
            Intrinsics.checkNotNullExpressionValue(countrySelector, "countrySelector");
            jr.o.i(countrySelector, base4);
            TextInputLayout idClassSelector = kVar.f26583g;
            Intrinsics.checkNotNullExpressionValue(idClassSelector, "idClassSelector");
            jr.o.i(idClassSelector, base4);
        }
        StepStyles.GovernmentIdStepPrimaryButtonComponentStyle buttonPrimaryStyle = governmentIdStepStyle.getButtonPrimaryStyle();
        if (buttonPrimaryStyle != null && (base = buttonPrimaryStyle.getBase()) != null && (base2 = base.getBase()) != null) {
            PersonaMaterialButton continueButton = kVar.f26579c;
            Intrinsics.checkNotNullExpressionValue(continueButton, "continueButton");
            jr.e.h(continueButton, base2, false, false, false, 14, null);
        }
        ConstraintLayout innerContent = this.binding.f26585i;
        Intrinsics.checkNotNullExpressionValue(innerContent, "innerContent");
        jr.p.b(innerContent, governmentIdStepStyle, false, false, 6, null);
    }

    public final w1 s(StepStyles.GovernmentIdStepInputSelectStyle style, List<Option> countryOptions, String selectedCountryCode) {
        InputSelectComponentStyle base;
        Object next;
        List<Option> listK;
        StepStyles.InputSelectStyleContainer base2;
        Iterator<T> it = countryOptions.iterator();
        do {
            base = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.c(((Option) next).getValue(), selectedCountryCode));
        Option option = (Option) next;
        if (option == null || (listK = kotlin.collections.o.d(option)) == null) {
            listK = kotlin.collections.p.k();
        }
        if (style != null && (base2 = style.getBase()) != null) {
            base = base2.getBase();
        }
        return u("country_select", countryOptions, listK, base);
    }

    public final w1 t(StepStyles.GovernmentIdStepInputSelectStyle style, List<Option> idClassOptions, String selectedIdClass) {
        StepStyles.InputSelectStyleContainer base;
        ArrayList arrayList = new ArrayList();
        for (Object obj : idClassOptions) {
            if (Intrinsics.c(((Option) obj).getValue(), selectedIdClass)) {
                arrayList.add(obj);
            }
        }
        return u("id_class_select", idClassOptions, arrayList, (style == null || (base = style.getBase()) == null) ? null : base.getBase());
    }

    public final w1 u(String name, List<Option> options, List<Option> selectedOptions, InputSelectComponentStyle style) {
        return new a(style, options, name, selectedOptions);
    }

    public final void v(w1 inputSelectComponent, final Function1<? super Option, Unit> onOptionSelected) {
        this.inputSelectBottomSheetController.t(inputSelectComponent, new Function1() { // from class: jo.x
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return y.w(onOptionSelected, (List) obj);
            }
        });
    }
}
