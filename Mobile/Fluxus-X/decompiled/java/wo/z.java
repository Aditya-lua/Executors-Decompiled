package wo;

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
import com.github.luben.zstd.BuildConfig;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputSelectComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaMaterialButton;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import nn.ViewEnvironment;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.collections.CollectionsKt;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.internal.Intrinsics;
import qr.Option;
import qr.i2;
import vo.y3;
import yr.h0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0014\u001a\u00020\b*\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00162\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\b0\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ1\u0010#\u001a\u00020\u00162\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00190\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b#\u0010$J1\u0010'\u001a\u00020\u00162\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00190\u001f2\b\u0010&\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b'\u0010$J=\u0010,\u001a\u00020\u00162\u0006\u0010(\u001a\u00020!2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00190\u001f2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00190\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010+H\u0002¢\u0006\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010.R\u0014\u00102\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00101R\u0014\u00106\u001a\u0002038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105¨\u00067"}, d2 = {"Lwo/z;", "Lwo/d0;", "Landroid/content/Context;", "context", "Landroid/view/ViewGroup;", "container", "<init>", "(Landroid/content/Context;Landroid/view/ViewGroup;)V", BuildConfig.FLAVOR, "a", "()V", "Lnn/z;", "viewEnvironment", "Lvo/y3$a;", "rendering", "b", "(Lnn/z;Lvo/y3$a;)V", "Lap/k;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "k", "(Lap/k;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Lnn/z;)V", "Lqr/i2;", "inputSelectComponent", "Lkotlin/Function1;", "Lqr/l4;", "onOptionSelected", "v", "(Lqr/i2;Lkotlin/jvm/functions/Function1;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepInputSelectStyle;", "style", BuildConfig.FLAVOR, "countryOptions", BuildConfig.FLAVOR, "selectedCountryCode", "s", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepInputSelectStyle;Ljava/util/List;Ljava/lang/String;)Lqr/i2;", "idClassOptions", "selectedIdClass", "t", "name", "options", "selectedOptions", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;", "u", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;)Lqr/i2;", "Lap/k;", "binding", "Lvr/j;", "Lvr/j;", "inputSelectBottomSheetController", "Landroid/view/View;", "getRoot", "()Landroid/view/View;", "root", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class z implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ap.k binding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final vr.j inputSelectBottomSheetController;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\r¨\u0006\u0015"}, d2 = {"wo/z$a", "Lqr/i2;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;", "a", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;", "styles", BuildConfig.FLAVOR, "j", "()Z", "canSelectMultipleValues", BuildConfig.FLAVOR, "Lqr/l4;", "g", "()Ljava/util/List;", "options", BuildConfig.FLAVOR, "f", "()Ljava/lang/String;", "label", "l", "selectedOptions", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements i2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InputSelectComponentStyle f35957a;
        public final /* synthetic */ List<Option> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f35958c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ List<Option> f35959d;

        public a(InputSelectComponentStyle inputSelectComponentStyle, List<Option> list, String str, List<Option> list2) {
            this.f35957a = inputSelectComponentStyle;
            this.b = list;
            this.f35958c = str;
            this.f35959d = list2;
        }

        @Override // qr.i2
        /* JADX INFO: renamed from: a, reason: from getter and merged with bridge method [inline-methods] */
        public InputSelectComponentStyle getStyles() {
            return this.f35957a;
        }

        @Override // qr.i2
        /* JADX INFO: renamed from: f */
        public String getLabel() {
            return null;
        }

        @Override // qr.i2
        public List<Option> g() {
            return this.b;
        }

        @Override // qr.i2
        /* JADX INFO: renamed from: j */
        public boolean getCanSelectMultipleValues() {
            return false;
        }

        @Override // qr.i2
        public List<Option> l() {
            return this.f35959d;
        }

        @Override // qr.i2
        /* JADX INFO: renamed from: n */
        public RemoteImage getLeadingImageTemplate() {
            return super.getLeadingImageTemplate();
        }
    }

    public z(@NotNull Context context, @Nullable ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(context, "context");
        ap.k kVarC = ap.k.c(LayoutInflater.from(context), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(kVarC, "inflate(...)");
        this.binding = kVarC;
        CoordinatorLayout root = kVarC.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        this.inputSelectBottomSheetController = new vr.j(root);
    }

    public static final Unit l(y3.a aVar) {
        aVar.l().invoke();
        return Unit.f21506a;
    }

    public static final Unit m(y3.a aVar) {
        aVar.m().invoke();
        return Unit.f21506a;
    }

    public static final void n(z zVar, i2 i2Var, y3.a aVar, View view) {
        zVar.v(i2Var, aVar.o());
    }

    public static final void o(z zVar, i2 i2Var, y3.a aVar, View view) {
        zVar.v(i2Var, aVar.o());
    }

    public static final void p(z zVar, i2 i2Var, y3.a aVar, View view) {
        zVar.v(i2Var, aVar.p());
    }

    public static final void q(z zVar, i2 i2Var, y3.a aVar, View view) {
        zVar.v(i2Var, aVar.p());
    }

    public static final void r(y3.a aVar, View view) {
        aVar.n().invoke();
    }

    public static final Unit w(Function1 function1, List selectedItems) {
        Intrinsics.checkNotNullParameter(selectedItems, "selectedItems");
        Option option = (Option) CollectionsKt.firstOrNull(selectedItems);
        if (option == null) {
            return Unit.f21506a;
        }
        function1.invoke(option);
        return Unit.f21506a;
    }

    @Override // wo.d0
    public void a() {
        LinearLayout contentView = this.binding.b;
        Intrinsics.checkNotNullExpressionValue(contentView, "contentView");
        kr.g.d(contentView, false, false, false, false, 15, null);
    }

    @Override // wo.d0
    public void b(@NotNull ViewEnvironment viewEnvironment, @NotNull final y3.a rendering) {
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        ap.k kVar = this.binding;
        ir.a navigationState = rendering.getNavigationState();
        Function0 function0 = new Function0() { // from class: wo.r
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return z.l(rendering);
            }
        };
        Function0 function1 = new Function0() { // from class: wo.s
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return z.m(rendering);
            }
        };
        Pi2NavigationBar navigationBar = kVar.f3278j;
        Intrinsics.checkNotNullExpressionValue(navigationBar, "navigationBar");
        CoordinatorLayout root = kVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        StepStyles.GovernmentIdStepStyle styles = rendering.getStyles();
        Rect rectH = styles != null ? sr.h.h(styles) : null;
        String navBarTitle = rendering.getNavBarTitle();
        StepStyles.GovernmentIdStepStyle styles2 = rendering.getStyles();
        xr.c.e(navigationState, function0, function1, null, navigationBar, root, rectH, navBarTitle, styles2 != null ? styles2.getNavBarTitleStyleValue() : null, 8, null);
        TextView title = kVar.f3279k;
        Intrinsics.checkNotNullExpressionValue(title, "title");
        kr.u.b(title, rendering.getManualClassificationTitle());
        StepStyles.GovernmentIdStepStyle styles3 = rendering.getStyles();
        StepStyles.GovernmentIdStepInputSelectStyle inputSelectStyle = styles3 != null ? styles3.getInputSelectStyle() : null;
        List<y3.a.CountryOption> listE = rendering.e();
        ArrayList arrayList = new ArrayList(p001kotlin.collections.q.u(listE, 10));
        for (y3.a.CountryOption countryOption : listE) {
            arrayList.add(new Option(countryOption.getCountryName(), countryOption.getCountryCode(), null, 4, null));
        }
        final i2 i2VarS = s(inputSelectStyle, arrayList, rendering.getSelectedCountryCode());
        StepStyles.GovernmentIdStepStyle styles4 = rendering.getStyles();
        final i2 i2VarT = t(styles4 != null ? styles4.getInputSelectStyle() : null, rendering.h(), rendering.getSelectedIdClass());
        Option option = (Option) CollectionsKt.firstOrNull(i2VarS.l());
        String text = option != null ? option.getText() : null;
        kVar.f3272d.setOnClickListener(new View.OnClickListener() { // from class: wo.t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                z.n(this.f35946a, i2VarS, rendering, view);
            }
        });
        EditText editText = kVar.f3272d.getEditText();
        if (editText != null) {
            editText.setOnClickListener(new View.OnClickListener() { // from class: wo.u
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    z.o(this.f35948a, i2VarS, rendering, view);
                }
            });
        }
        EditText editText2 = kVar.f3272d.getEditText();
        if (editText2 != null) {
            editText2.setText(text);
        }
        if (text != null) {
            kVar.f3275g.setEnabled(true);
            EditText editText3 = kVar.f3275g.getEditText();
            if (editText3 != null) {
                editText3.setEnabled(true);
            }
            kVar.f3275g.setOnClickListener(new View.OnClickListener() { // from class: wo.v
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    z.p(this.f35950a, i2VarT, rendering, view);
                }
            });
            EditText editText4 = kVar.f3275g.getEditText();
            if (editText4 != null) {
                editText4.setOnClickListener(new View.OnClickListener() { // from class: wo.w
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        z.q(this.f35952a, i2VarT, rendering, view);
                    }
                });
            }
            EditText editText5 = kVar.f3275g.getEditText();
            if (editText5 != null) {
                Option option2 = (Option) CollectionsKt.firstOrNull(i2VarT.l());
                editText5.setText(option2 != null ? option2.getText() : null);
            }
        } else {
            kVar.f3275g.setEnabled(false);
            EditText editText6 = kVar.f3275g.getEditText();
            if (editText6 != null) {
                editText6.setEnabled(false);
            }
        }
        kVar.f3273e.setText(rendering.getCountryInputTitle());
        kVar.f3276h.setText(rendering.getIdClassInputTitle());
        kVar.f3271c.setEnabled(rendering.getIsContinueEnabled());
        kVar.f3271c.setOnClickListener(new View.OnClickListener() { // from class: wo.x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                z.r(rendering, view);
            }
        });
        kVar.f3271c.setText(rendering.getContinueButtonText());
        k(kVar, rendering.getStyles(), viewEnvironment);
    }

    @Override // wo.d0
    @NotNull
    public View getRoot() {
        CoordinatorLayout root = this.binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    public final void k(ap.k kVar, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, ViewEnvironment viewEnvironment) {
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
            jr.c.b(viewEnvironment, context, iIntValue);
        }
        StepStyles.GovernmentIdStepTitleComponentStyle titleStyle = governmentIdStepStyle.getTitleStyle();
        if (titleStyle != null && (base7 = titleStyle.getBase()) != null && (base8 = base7.getBase()) != null) {
            TextView title = kVar.f3279k;
            Intrinsics.checkNotNullExpressionValue(title, "title");
            h0.l(title, base8, null, 2, null);
        }
        StepStyles.GovernmentIdStepTextBasedComponentStyle textStyle = governmentIdStepStyle.getTextStyle();
        if (textStyle != null && (base5 = textStyle.getBase()) != null && (base6 = base5.getBase()) != null) {
            TextView countrySelectorText = kVar.f3273e;
            Intrinsics.checkNotNullExpressionValue(countrySelectorText, "countrySelectorText");
            h0.l(countrySelectorText, base6, null, 2, null);
            TextView idClassSelectorText = kVar.f3276h;
            Intrinsics.checkNotNullExpressionValue(idClassSelectorText, "idClassSelectorText");
            h0.l(idClassSelectorText, base6, null, 2, null);
        }
        StepStyles.GovernmentIdStepInputSelectStyle inputSelectStyle = governmentIdStepStyle.getInputSelectStyle();
        if (inputSelectStyle != null && (base3 = inputSelectStyle.getBase()) != null && (base4 = base3.getBase()) != null) {
            TextInputLayout countrySelector = kVar.f3272d;
            Intrinsics.checkNotNullExpressionValue(countrySelector, "countrySelector");
            yr.o.i(countrySelector, base4);
            TextInputLayout idClassSelector = kVar.f3275g;
            Intrinsics.checkNotNullExpressionValue(idClassSelector, "idClassSelector");
            yr.o.i(idClassSelector, base4);
        }
        StepStyles.GovernmentIdStepPrimaryButtonComponentStyle buttonPrimaryStyle = governmentIdStepStyle.getButtonPrimaryStyle();
        if (buttonPrimaryStyle != null && (base = buttonPrimaryStyle.getBase()) != null && (base2 = base.getBase()) != null) {
            PersonaMaterialButton continueButton = kVar.f3271c;
            Intrinsics.checkNotNullExpressionValue(continueButton, "continueButton");
            yr.e.h(continueButton, base2, false, false, false, 14, null);
        }
        ConstraintLayout innerContent = this.binding.f3277i;
        Intrinsics.checkNotNullExpressionValue(innerContent, "innerContent");
        yr.p.b(innerContent, governmentIdStepStyle, false, false, 6, null);
    }

    public final i2 s(StepStyles.GovernmentIdStepInputSelectStyle style, List<Option> countryOptions, String selectedCountryCode) {
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
        if (option == null || (listK = p001kotlin.collections.o.d(option)) == null) {
            listK = p001kotlin.collections.p.k();
        }
        if (style != null && (base2 = style.getBase()) != null) {
            base = base2.getBase();
        }
        return u("country_select", countryOptions, listK, base);
    }

    public final i2 t(StepStyles.GovernmentIdStepInputSelectStyle style, List<Option> idClassOptions, String selectedIdClass) {
        StepStyles.InputSelectStyleContainer base;
        ArrayList arrayList = new ArrayList();
        for (Object obj : idClassOptions) {
            if (Intrinsics.c(((Option) obj).getValue(), selectedIdClass)) {
                arrayList.add(obj);
            }
        }
        return u("id_class_select", idClassOptions, arrayList, (style == null || (base = style.getBase()) == null) ? null : base.getBase());
    }

    public final i2 u(String name, List<Option> options, List<Option> selectedOptions, InputSelectComponentStyle style) {
        return new a(style, options, name, selectedOptions);
    }

    public final void v(i2 inputSelectComponent, final Function1<? super Option, Unit> onOptionSelected) {
        this.inputSelectBottomSheetController.t(inputSelectComponent, new Function1() { // from class: wo.y
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return z.w(onOptionSelected, (List) obj);
            }
        });
    }
}
