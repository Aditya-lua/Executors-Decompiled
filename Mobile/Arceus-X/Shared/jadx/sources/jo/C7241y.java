package jo;

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
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.InputSelectComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.p055ui.PersonaMaterialButton;
import com.withpersona.sdk2.inquiry.shared.p055ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.Option;
import cr.InterfaceC4337w1;
import er.C5199h;
import hr.C6555j;
import ir.C6966c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7697o;
import kotlin.collections.C7699p;
import kotlin.collections.C7701q;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import no.C9535k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p016an.ViewEnvironment;
import p227jr.C7297e;
import p227jr.C7304h0;
import p227jr.C7311o;
import p227jr.C7312p;
import p498vq.C12249c;
import p526wq.C12524g;
import p526wq.C12537t;

/* JADX INFO: renamed from: jo.y */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0014\u001a\u00020\b*\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00162\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\b0\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ1\u0010#\u001a\u00020\u00162\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00190\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b#\u0010$J1\u0010'\u001a\u00020\u00162\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00190\u001f2\b\u0010&\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b'\u0010$J=\u0010,\u001a\u00020\u00162\u0006\u0010(\u001a\u00020!2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00190\u001f2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00190\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010+H\u0002¢\u0006\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010.R\u0014\u00102\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00101R\u0014\u00106\u001a\u0002038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105¨\u00067"}, m31665d2 = {"Ljo/y;", "Ljo/c0;", "Landroid/content/Context;", "context", "Landroid/view/ViewGroup;", "container", "<init>", "(Landroid/content/Context;Landroid/view/ViewGroup;)V", "", "a", "()V", "Lan/y;", "viewEnvironment", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$a;", "rendering", "b", "(Lan/y;Lcom/withpersona/sdk2/inquiry/governmentid/Screen$a;)V", "Lno/k;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "k", "(Lno/k;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Lan/y;)V", "Lcr/w1;", "inputSelectComponent", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;", "onOptionSelected", "v", "(Lcr/w1;Lkotlin/jvm/functions/Function1;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepInputSelectStyle;", "style", "", "countryOptions", "", "selectedCountryCode", "s", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepInputSelectStyle;Ljava/util/List;Ljava/lang/String;)Lcr/w1;", "idClassOptions", "selectedIdClass", "t", "name", "options", "selectedOptions", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;", "u", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;)Lcr/w1;", "Lno/k;", "binding", "Lhr/j;", "Lhr/j;", "inputSelectBottomSheetController", "Landroid/view/View;", "getRoot", "()Landroid/view/View;", "root", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C7241y implements InterfaceC7219c0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C9535k binding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C6555j inputSelectBottomSheetController;

    /* JADX INFO: renamed from: jo.y$a */
    @Metadata(m31664d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\r¨\u0006\u0015"}, m31665d2 = {"jo/y$a", "Lcr/w1;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;", "a", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;", "styles", "", "j", "()Z", "canSelectMultipleValues", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;", "g", "()Ljava/util/List;", "options", "", "f", "()Ljava/lang/String;", "label", "m", "selectedOptions", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a implements InterfaceC4337w1 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InputSelectComponentStyle f27964a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ List<Option> f27965b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f27966c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ List<Option> f27967d;

        public a(InputSelectComponentStyle inputSelectComponentStyle, List<Option> list, String str, List<Option> list2) {
            this.f27964a = inputSelectComponentStyle;
            this.f27965b = list;
            this.f27966c = str;
            this.f27967d = list2;
        }

        /* JADX DEBUG: Method merged with bridge method: getStyles()Lcom/withpersona/sdk2/inquiry/network/dto/ui/InputSelectBoxComponentStyle; */
        @Override // cr.InterfaceC4337w1
        /* JADX INFO: renamed from: a, reason: from getter and merged with bridge method [inline-methods] */
        public InputSelectComponentStyle getStyles() {
            return this.f27964a;
        }

        @Override // cr.InterfaceC4337w1
        /* JADX INFO: renamed from: f */
        public String getLabel() {
            return null;
        }

        @Override // cr.InterfaceC4337w1
        /* JADX INFO: renamed from: g */
        public List<Option> mo20723g() {
            return this.f27965b;
        }

        @Override // cr.InterfaceC4337w1
        /* JADX INFO: renamed from: j */
        public boolean getCanSelectMultipleValues() {
            return false;
        }

        @Override // cr.InterfaceC4337w1
        /* JADX INFO: renamed from: m */
        public List<Option> mo20725m() {
            return this.f27967d;
        }

        @Override // cr.InterfaceC4337w1
        /* JADX INFO: renamed from: n */
        public RemoteImage getLeadingImageTemplate() {
            return super.getLeadingImageTemplate();
        }
    }

    public C7241y(@NotNull Context context, @Nullable ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(context, "context");
        C9535k c9535kM37642c = C9535k.m37642c(LayoutInflater.from(context), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c9535kM37642c, "inflate(...)");
        this.binding = c9535kM37642c;
        CoordinatorLayout root = c9535kM37642c.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        this.inputSelectBottomSheetController = new C6555j(root);
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m30194l(Screen.C3526a c3526a) {
        c3526a.m17343l().invoke();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: m */
    public static final Unit m30195m(Screen.C3526a c3526a) {
        c3526a.m17344m().invoke();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: n */
    public static final void m30196n(C7241y c7241y, InterfaceC4337w1 interfaceC4337w1, Screen.C3526a c3526a, View view) {
        c7241y.m30206v(interfaceC4337w1, c3526a.m17346o());
    }

    /* JADX INFO: renamed from: o */
    public static final void m30197o(C7241y c7241y, InterfaceC4337w1 interfaceC4337w1, Screen.C3526a c3526a, View view) {
        c7241y.m30206v(interfaceC4337w1, c3526a.m17346o());
    }

    /* JADX INFO: renamed from: p */
    public static final void m30198p(C7241y c7241y, InterfaceC4337w1 interfaceC4337w1, Screen.C3526a c3526a, View view) {
        c7241y.m30206v(interfaceC4337w1, c3526a.m17347p());
    }

    /* JADX INFO: renamed from: q */
    public static final void m30199q(C7241y c7241y, InterfaceC4337w1 interfaceC4337w1, Screen.C3526a c3526a, View view) {
        c7241y.m30206v(interfaceC4337w1, c3526a.m17347p());
    }

    /* JADX INFO: renamed from: r */
    public static final void m30200r(Screen.C3526a c3526a, View view) {
        c3526a.m17345n().invoke();
    }

    /* JADX INFO: renamed from: w */
    public static final Unit m30201w(Function1 function1, List selectedItems) {
        Intrinsics.checkNotNullParameter(selectedItems, "selectedItems");
        Option option = (Option) CollectionsKt.firstOrNull(selectedItems);
        if (option == null) {
            return Unit.f29331a;
        }
        function1.invoke(option);
        return Unit.f29331a;
    }

    @Override // jo.InterfaceC7219c0
    /* JADX INFO: renamed from: a */
    public void mo30151a() {
        LinearLayout contentView = this.binding.f34436b;
        Intrinsics.checkNotNullExpressionValue(contentView, "contentView");
        C12524g.m46873d(contentView, false, false, false, false, 15, null);
    }

    @Override // jo.InterfaceC7219c0
    /* JADX INFO: renamed from: b */
    public void mo30152b(@NotNull ViewEnvironment viewEnvironment, @NotNull final Screen.C3526a rendering) {
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        C9535k c9535k = this.binding;
        NavigationState navigationState = rendering.getNavigationState();
        Function0 function0 = new Function0() { // from class: jo.q
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C7241y.m30194l(rendering);
            }
        };
        Function0 function1 = new Function0() { // from class: jo.r
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C7241y.m30195m(rendering);
            }
        };
        Pi2NavigationBar navigationBar = c9535k.f34444j;
        Intrinsics.checkNotNullExpressionValue(navigationBar, "navigationBar");
        CoordinatorLayout root = c9535k.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        StepStyles.GovernmentIdStepStyle styles = rendering.getStyles();
        Rect rectM24132h = styles != null ? C5199h.m24132h(styles) : null;
        String navBarTitle = rendering.getNavBarTitle();
        StepStyles.GovernmentIdStepStyle styles2 = rendering.getStyles();
        C6966c.m29335e(navigationState, function0, function1, null, navigationBar, root, rectM24132h, navBarTitle, styles2 != null ? styles2.getNavBarTitleStyleValue() : null, 8, null);
        TextView title = c9535k.f34445k;
        Intrinsics.checkNotNullExpressionValue(title, "title");
        C12537t.m46886b(title, rendering.getManualClassificationTitle());
        StepStyles.GovernmentIdStepStyle styles3 = rendering.getStyles();
        StepStyles.GovernmentIdStepInputSelectStyle inputSelectStyle = styles3 != null ? styles3.getInputSelectStyle() : null;
        List<Screen.C3526a.CountryOption> listM17336e = rendering.m17336e();
        ArrayList arrayList = new ArrayList(C7701q.m31905u(listM17336e, 10));
        for (Screen.C3526a.CountryOption countryOption : listM17336e) {
            arrayList.add(new Option(countryOption.getCountryName(), countryOption.getCountryCode(), null, 4, null));
        }
        final InterfaceC4337w1 interfaceC4337w1M30203s = m30203s(inputSelectStyle, arrayList, rendering.getSelectedCountryCode());
        StepStyles.GovernmentIdStepStyle styles4 = rendering.getStyles();
        final InterfaceC4337w1 interfaceC4337w1M30204t = m30204t(styles4 != null ? styles4.getInputSelectStyle() : null, rendering.m17339h(), rendering.getSelectedIdClass());
        Option option = (Option) CollectionsKt.firstOrNull(interfaceC4337w1M30203s.mo20725m());
        String text = option != null ? option.getText() : null;
        c9535k.f34438d.setOnClickListener(new View.OnClickListener() { // from class: jo.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C7241y.m30196n(this.f27948a, interfaceC4337w1M30203s, rendering, view);
            }
        });
        EditText editText = c9535k.f34438d.getEditText();
        if (editText != null) {
            editText.setOnClickListener(new View.OnClickListener() { // from class: jo.t
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C7241y.m30197o(this.f27951a, interfaceC4337w1M30203s, rendering, view);
                }
            });
        }
        EditText editText2 = c9535k.f34438d.getEditText();
        if (editText2 != null) {
            editText2.setText(text);
        }
        if (text != null) {
            c9535k.f34441g.setEnabled(true);
            EditText editText3 = c9535k.f34441g.getEditText();
            if (editText3 != null) {
                editText3.setEnabled(true);
            }
            c9535k.f34441g.setOnClickListener(new View.OnClickListener() { // from class: jo.u
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C7241y.m30198p(this.f27954a, interfaceC4337w1M30204t, rendering, view);
                }
            });
            EditText editText4 = c9535k.f34441g.getEditText();
            if (editText4 != null) {
                editText4.setOnClickListener(new View.OnClickListener() { // from class: jo.v
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C7241y.m30199q(this.f27957a, interfaceC4337w1M30204t, rendering, view);
                    }
                });
            }
            EditText editText5 = c9535k.f34441g.getEditText();
            if (editText5 != null) {
                Option option2 = (Option) CollectionsKt.firstOrNull(interfaceC4337w1M30204t.mo20725m());
                editText5.setText(option2 != null ? option2.getText() : null);
            }
        } else {
            c9535k.f34441g.setEnabled(false);
            EditText editText6 = c9535k.f34441g.getEditText();
            if (editText6 != null) {
                editText6.setEnabled(false);
            }
        }
        c9535k.f34439e.setText(rendering.getCountryInputTitle());
        c9535k.f34442h.setText(rendering.getIdClassInputTitle());
        c9535k.f34437c.setEnabled(rendering.getIsContinueEnabled());
        c9535k.f34437c.setOnClickListener(new View.OnClickListener() { // from class: jo.w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C7241y.m30200r(rendering, view);
            }
        });
        c9535k.f34437c.setText(rendering.getContinueButtonText());
        m30202k(c9535k, rendering.getStyles(), viewEnvironment);
    }

    @Override // jo.InterfaceC7219c0
    @NotNull
    public View getRoot() {
        CoordinatorLayout root = this.binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    /* JADX INFO: renamed from: k */
    public final void m30202k(C9535k c9535k, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, ViewEnvironment viewEnvironment) {
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
            c9535k.getRoot().setBackgroundColor(iIntValue);
            Context context = c9535k.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            C12249c.m45393b(viewEnvironment, context, iIntValue);
        }
        StepStyles.GovernmentIdStepTitleComponentStyle titleStyle = governmentIdStepStyle.getTitleStyle();
        if (titleStyle != null && (base7 = titleStyle.getBase()) != null && (base8 = base7.getBase()) != null) {
            TextView title = c9535k.f34445k;
            Intrinsics.checkNotNullExpressionValue(title, "title");
            C7304h0.m30392l(title, base8, null, 2, null);
        }
        StepStyles.GovernmentIdStepTextBasedComponentStyle textStyle = governmentIdStepStyle.getTextStyle();
        if (textStyle != null && (base5 = textStyle.getBase()) != null && (base6 = base5.getBase()) != null) {
            TextView countrySelectorText = c9535k.f34439e;
            Intrinsics.checkNotNullExpressionValue(countrySelectorText, "countrySelectorText");
            C7304h0.m30392l(countrySelectorText, base6, null, 2, null);
            TextView idClassSelectorText = c9535k.f34442h;
            Intrinsics.checkNotNullExpressionValue(idClassSelectorText, "idClassSelectorText");
            C7304h0.m30392l(idClassSelectorText, base6, null, 2, null);
        }
        StepStyles.GovernmentIdStepInputSelectStyle inputSelectStyle = governmentIdStepStyle.getInputSelectStyle();
        if (inputSelectStyle != null && (base3 = inputSelectStyle.getBase()) != null && (base4 = base3.getBase()) != null) {
            TextInputLayout countrySelector = c9535k.f34438d;
            Intrinsics.checkNotNullExpressionValue(countrySelector, "countrySelector");
            C7311o.m30401i(countrySelector, base4);
            TextInputLayout idClassSelector = c9535k.f34441g;
            Intrinsics.checkNotNullExpressionValue(idClassSelector, "idClassSelector");
            C7311o.m30401i(idClassSelector, base4);
        }
        StepStyles.GovernmentIdStepPrimaryButtonComponentStyle buttonPrimaryStyle = governmentIdStepStyle.getButtonPrimaryStyle();
        if (buttonPrimaryStyle != null && (base = buttonPrimaryStyle.getBase()) != null && (base2 = base.getBase()) != null) {
            PersonaMaterialButton continueButton = c9535k.f34437c;
            Intrinsics.checkNotNullExpressionValue(continueButton, "continueButton");
            C7297e.m30364h(continueButton, base2, false, false, false, 14, null);
        }
        ConstraintLayout innerContent = this.binding.f34443i;
        Intrinsics.checkNotNullExpressionValue(innerContent, "innerContent");
        C7312p.m30410b(innerContent, governmentIdStepStyle, false, false, 6, null);
    }

    /* JADX INFO: renamed from: s */
    public final InterfaceC4337w1 m30203s(StepStyles.GovernmentIdStepInputSelectStyle style, List<Option> countryOptions, String selectedCountryCode) {
        InputSelectComponentStyle base;
        Object next;
        List<Option> listM31892k;
        StepStyles.InputSelectStyleContainer base2;
        Iterator<T> it = countryOptions.iterator();
        do {
            base = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.m31980c(((Option) next).getValue(), selectedCountryCode));
        Option option = (Option) next;
        if (option == null || (listM31892k = C7697o.m31878d(option)) == null) {
            listM31892k = C7699p.m31892k();
        }
        if (style != null && (base2 = style.getBase()) != null) {
            base = base2.getBase();
        }
        return m30205u("country_select", countryOptions, listM31892k, base);
    }

    /* JADX INFO: renamed from: t */
    public final InterfaceC4337w1 m30204t(StepStyles.GovernmentIdStepInputSelectStyle style, List<Option> idClassOptions, String selectedIdClass) {
        StepStyles.InputSelectStyleContainer base;
        ArrayList arrayList = new ArrayList();
        for (Object obj : idClassOptions) {
            if (Intrinsics.m31980c(((Option) obj).getValue(), selectedIdClass)) {
                arrayList.add(obj);
            }
        }
        return m30205u("id_class_select", idClassOptions, arrayList, (style == null || (base = style.getBase()) == null) ? null : base.getBase());
    }

    /* JADX INFO: renamed from: u */
    public final InterfaceC4337w1 m30205u(String name, List<Option> options, List<Option> selectedOptions, InputSelectComponentStyle style) {
        return new a(style, options, name, selectedOptions);
    }

    /* JADX INFO: renamed from: v */
    public final void m30206v(InterfaceC4337w1 inputSelectComponent, final Function1<? super Option, Unit> onOptionSelected) {
        this.inputSelectBottomSheetController.m28409t(inputSelectComponent, new Function1() { // from class: jo.x
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C7241y.m30201w(onOptionSelected, (List) obj);
            }
        });
    }
}
