package ar;

import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.ActionButton;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.CancelButton;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.ClickableStack;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.CombinedStepButton;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.CombinedStepImagePreview;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.CompleteButton;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.ESignature;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Footer;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.GovernmentIdNfcScan;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.HorizontalStack;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputAddress;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputCheckbox;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputCheckboxGroup;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputConfirmationCode;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputCurrency;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputDate;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputFileUpload;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputInternationalDb;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputMaskedText;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputMultiSelect;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputNumber;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputPhoneNumber;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputRadioGroup;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputSelect;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputText;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputTextArea;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.JpMyNumberNfcScan;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.LinkButton;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.LocalImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Mdoc;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.PrivacyPolicy;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.QRCode;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.SubmitButton;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Text;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.VerifyPersonaButton;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.steps.ui.UiComponentScreen;
import com.withpersona.sdk2.inquiry.steps.ui.components.ActionButtonComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.BrandingComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.CancelButtonComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.ClickableStackComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.CombinedStepButtonComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.CompleteButtonComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.CreatePersonaSheetComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.ESignatureComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.FooterComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.GovernmentIdNfcScanComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.HelpBottomSheetComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.HorizontalStackComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.ImagePreviewComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputAddressComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputCheckboxComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputCheckboxGroupComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputConfirmationCodeComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputCurrencyComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputDateComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputFileUploadComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputInternationalDbComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputMaskedTextComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputMultiSelectComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputNumberComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputPhoneNumberComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputRadioGroupComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputSelectComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputTextAreaComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputTextComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.JpMyNumberNfcScanComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.LinkButtonComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.LocalImageComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.MdocComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.PhoneNumberSnaComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.PrivacyPolicyComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.QRCodeComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.RemoteImageComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.SpacerComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.SubmitButtonComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.TextComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.TitleComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.VerifyPersonaButtonComponent;
import cr.a2;
import cr.a4;
import cr.b0;
import cr.c2;
import cr.c5;
import cr.e0;
import cr.e2;
import cr.g2;
import cr.i0;
import cr.i1;
import cr.k1;
import cr.k4;
import cr.l0;
import cr.m1;
import cr.p1;
import cr.p3;
import cr.q4;
import cr.r0;
import cr.t0;
import cr.t4;
import cr.u3;
import cr.v;
import cr.v0;
import cr.v1;
import cr.v4;
import cr.x4;
import cr.y0;
import cr.y1;
import cr.y3;
import cr.y4;
import gr.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wq.z;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JU\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042$\u0010\f\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t0\u00070\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0011\u0010\u0012JM\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042&\u0010\u0018\u001a\"\u0012\u0004\u0012\u00020\u0013\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00152\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ7\u0010\"\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\"\u0010#J\u0015\u0010&\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'JU\u0010-\u001a\u00020,2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00192\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00170(2\u0006\u0010+\u001a\u00020*2\u0006\u0010!\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b-\u0010.Jg\u00106\u001a\u00020,2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u00100\u001a\u00020/2\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u0002010\u00162\u0006\u0010 \u001a\u00020\u00192\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00170(2\u0006\u0010+\u001a\u00020*2\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u000203H\u0002¢\u0006\u0004\b6\u00107Jm\u0010;\u001a\b\u0012\u0004\u0012\u00020,0\u00062\f\u00108\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u0002010\u00162\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u00192\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0017092\u0006\u0010+\u001a\u00020*2\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u000203H\u0002¢\u0006\u0004\b;\u0010<¨\u0006="}, d2 = {"Lar/s;", "", "<init>", "()V", "Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;", "uiScreen", "", "Lkotlin/Pair;", "", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "", "componentNamesToActions", "Lkotlin/Function0;", "onCancelled", "cancelButtonName", "Lar/p;", "j", "(Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;Ljava/util/List;Lkotlin/jvm/functions/Function0;Ljava/lang/String;)Lar/p;", "Lnq/b;", "binding", "Lkotlin/Function2;", "", "Lar/a;", "initialRendering", "", "shouldApplyFocus", "Lar/g;", "l", "(Lnq/b;Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;Lkotlin/jvm/functions/Function2;Z)Lar/g;", "Landroid/content/Context;", "context", "isLoading", "isModal", "g", "(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;ZZZ)Lar/g;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "parentView", "c", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "", "viewBindings", "Lcr/y4;", "uiComponentHelper", "Landroid/view/View;", "f", "(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;ZLjava/util/Map;Lcr/y4;ZZ)Landroid/view/View;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/FooterComponent;", "component", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "componentNameToComponent", "", "minLeftPadding", "minRightPadding", "e", "(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/steps/ui/components/FooterComponent;Ljava/util/Map;ZLjava/util/Map;Lcr/y4;II)Landroid/view/View;", "components", "", "componentViews", "k", "(Ljava/util/List;Ljava/util/Map;Landroid/content/Context;ZLjava/util/List;Lcr/y4;II)Ljava/util/List;", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final s f3757a = new s();

    public static final void d(View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(view, 1);
        }
    }

    public static /* synthetic */ g h(s sVar, Context context, UiComponentScreen uiComponentScreen, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            z12 = true;
        }
        return sVar.g(context, uiComponentScreen, z10, z11, z12);
    }

    public static final Unit i(y4 y4Var) {
        y4Var.c();
        return Unit.f22483a;
    }

    public final void c(@NotNull ConstraintLayout parentView) {
        View view;
        Editable text;
        Intrinsics.checkNotNullParameter(parentView, "parentView");
        ArrayList<View> focusables = parentView.getFocusables(2);
        Intrinsics.checkNotNullExpressionValue(focusables, "getFocusables(...)");
        int size = focusables.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                view = null;
                break;
            }
            view = focusables.get(i10);
            i10++;
            View view2 = view;
            if ((view2 instanceof EditText) && ((text = ((EditText) view2).getText()) == null || StringsKt.p0(text))) {
                break;
            }
        }
        final View view3 = view;
        if (view3 != null) {
            view3.requestFocus();
            view3.post(new Runnable() { // from class: ar.r
                @Override // java.lang.Runnable
                public final void run() {
                    s.d(view3);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View e(Context context, FooterComponent component, Map<String, ? extends UiComponentConfig> componentNameToComponent, boolean isLoading, Map<String, ComponentView> viewBindings, y4 uiComponentHelper, int minLeftPadding, int minRightPadding) {
        ArrayList arrayList = new ArrayList();
        List<View> listK = k(kotlin.collections.o.d(component), componentNameToComponent, context, isLoading, arrayList, uiComponentHelper, minLeftPadding, minRightPadding);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            viewBindings.put(((ComponentView) obj).c().getName(), obj);
        }
        return (View) CollectionsKt.d0(listK);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View f(Context context, UiComponentScreen uiScreen, boolean isLoading, Map<String, ComponentView> viewBindings, y4 uiComponentHelper, boolean isModal, boolean shouldApplyFocus) {
        List<? extends UiComponent> listK;
        int i10;
        androidx.constraintlayout.widget.c cVar;
        ComponentView componentView;
        View viewD;
        StepStyles.StepPaddingStyle padding;
        StepStyles.StepPaddingStyleContainer screen;
        StyleElements.SizeSet base;
        StyleElements.Size right;
        Double dp2;
        StepStyles.StepPaddingStyle padding2;
        StepStyles.StepPaddingStyleContainer screen2;
        StyleElements.SizeSet base2;
        StyleElements.Size left;
        Double dp3;
        t tVarC = t.c(uiComponentHelper.getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(tVarC, "inflate(...)");
        ConstraintLayout constraintLayoutB = tVarC.getRoot();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutB, "getRoot(...)");
        List<UiComponent> components = uiScreen.getComponents();
        if (components != null) {
            listK = new ArrayList<>();
            for (Object obj : components) {
                if (!(((UiComponent) obj) instanceof FooterComponent)) {
                    listK.add(obj);
                }
            }
        } else {
            listK = kotlin.collections.p.k();
        }
        List<? extends UiComponent> list = listK;
        ArrayList arrayList = new ArrayList();
        Map<String, ? extends UiComponentConfig> mapJ = com.withpersona.sdk2.inquiry.steps.ui.components.b.j(uiScreen.W0());
        StepStyles.UiStepStyle styles = uiScreen.getStyles();
        int iA = (int) ((styles == null || (padding2 = styles.getPadding()) == null || (screen2 = padding2.getScreen()) == null || (base2 = screen2.getBase()) == null || (left = base2.getLeft()) == null || (dp3 = left.getDp()) == null) ? jq.j.a(24.0d) : jq.j.a(dp3.doubleValue()));
        StepStyles.UiStepStyle styles2 = uiScreen.getStyles();
        List<View> listK2 = k(list, mapJ, context, isLoading, arrayList, uiComponentHelper, iA, (int) ((styles2 == null || (padding = styles2.getPadding()) == null || (screen = padding.getScreen()) == null || (base = screen.getBase()) == null || (right = base.getRight()) == null || (dp2 = right.getDp()) == null) ? jq.j.a(24.0d) : jq.j.a(dp2.doubleValue())));
        androidx.constraintlayout.widget.c cVar2 = new androidx.constraintlayout.widget.c();
        cVar2.f(constraintLayoutB);
        Iterator<View> it = listK2.iterator();
        while (true) {
            i10 = 0;
            if (!it.hasNext()) {
                break;
            }
            View next = it.next();
            next.setId(View.generateViewId());
            next.setSaveEnabled(false);
            constraintLayoutB.addView(next);
            cVar2.h(next.getId(), 6, 0, 6);
            cVar2.h(next.getId(), 7, 0, 7);
            cVar2.l(next.getId(), -2);
            cVar2.k(next.getId(), 0);
            cVar2.F(next.getId(), 0.5f);
        }
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj2 = arrayList.get(i11);
            i11++;
            viewBindings.put(((ComponentView) obj2).c().getName(), obj2);
        }
        if (listK2.size() > 1) {
            List<View> list2 = listK2;
            ArrayList arrayList2 = new ArrayList(kotlin.collections.q.u(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Integer.valueOf(((View) it2.next()).getId()));
            }
            cVar2.q(0, 3, 0, 4, CollectionsKt.L0(arrayList2), null, 3);
            cVar = cVar2;
            if (uiScreen.getStyles() == null) {
                for (UiComponent uiComponent : list) {
                    int i12 = i10 + 1;
                    if (!(uiComponent instanceof SpacerComponent) && (componentView = (ComponentView) viewBindings.get(uiComponent.getName())) != null && (viewD = componentView.d()) != null && i10 != kotlin.collections.p.m(list)) {
                        cVar.E(viewD.getId(), 4, (int) jq.j.a(16.0d));
                    }
                    i10 = i12;
                }
            }
        } else {
            cVar = cVar2;
        }
        if (!isModal) {
            constraintLayoutB.setPadding(constraintLayoutB.getPaddingLeft(), constraintLayoutB.getPaddingTop(), constraintLayoutB.getPaddingRight(), (int) jq.j.a(24.0d));
        }
        cVar.c(constraintLayoutB);
        Context context2 = tVarC.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        if (!jq.g.g(context2) && shouldApplyFocus) {
            c(constraintLayoutB);
        }
        ConstraintLayout constraintLayoutB2 = tVarC.getRoot();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutB2, "getRoot(...)");
        return constraintLayoutB2;
    }

    @NotNull
    public final g g(@NotNull Context context, @NotNull UiComponentScreen uiScreen, boolean isLoading, boolean isModal, boolean shouldApplyFocus) {
        FooterComponent footerComponent;
        StepStyles.StepPaddingStyle padding;
        StepStyles.StepPaddingStyleContainer screen;
        StyleElements.SizeSet base;
        StyleElements.Size right;
        Double dp2;
        StepStyles.StepPaddingStyle padding2;
        StepStyles.StepPaddingStyleContainer screen2;
        StyleElements.SizeSet base2;
        StyleElements.Size left;
        Double dp3;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uiScreen, "uiScreen");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        final y4 y4Var = new y4(context);
        View viewF = f(context, uiScreen, isLoading, linkedHashMap, y4Var, isModal, shouldApplyFocus);
        List<UiComponent> components = uiScreen.getComponents();
        View viewE = null;
        if (components != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : components) {
                if (obj instanceof FooterComponent) {
                    arrayList.add(obj);
                }
            }
            footerComponent = (FooterComponent) CollectionsKt.firstOrNull(arrayList);
        } else {
            footerComponent = null;
        }
        if (footerComponent != null) {
            Map<String, UiComponentConfig> mapJ = com.withpersona.sdk2.inquiry.steps.ui.components.b.j(uiScreen.W0());
            StepStyles.UiStepStyle styles = uiScreen.getStyles();
            int iA = (int) ((styles == null || (padding2 = styles.getPadding()) == null || (screen2 = padding2.getScreen()) == null || (base2 = screen2.getBase()) == null || (left = base2.getLeft()) == null || (dp3 = left.getDp()) == null) ? jq.j.a(24.0d) : jq.j.a(dp3.doubleValue()));
            StepStyles.UiStepStyle styles2 = uiScreen.getStyles();
            viewE = e(context, footerComponent, mapJ, isLoading, linkedHashMap, y4Var, iA, (int) ((styles2 == null || (padding = styles2.getPadding()) == null || (screen = padding.getScreen()) == null || (base = screen.getBase()) == null || (right = base.getRight()) == null || (dp2 = right.getDp()) == null) ? jq.j.a(24.0d) : jq.j.a(dp2.doubleValue())));
            linkedHashMap = linkedHashMap;
            y4Var = y4Var;
        }
        z.b(viewF, new Function0() { // from class: ar.q
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return s.i(y4Var);
            }
        });
        return new g(new h(linkedHashMap), viewF, viewE);
    }

    @NotNull
    public final UiStepBottomSheet j(@NotNull UiComponentScreen uiScreen, @NotNull List<? extends Pair<String, ? extends Function1<? super UiComponent, Unit>>> componentNamesToActions, @NotNull Function0<Unit> onCancelled, @Nullable String cancelButtonName) {
        Intrinsics.checkNotNullParameter(uiScreen, "uiScreen");
        Intrinsics.checkNotNullParameter(componentNamesToActions, "componentNamesToActions");
        Intrinsics.checkNotNullParameter(onCancelled, "onCancelled");
        return new UiStepBottomSheet(uiScreen, componentNamesToActions, onCancelled, cancelButtonName, false, 16, null);
    }

    /* JADX WARN: Code duplicated, block: B:133:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:141:0x04b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x000d A[SYNTHETIC] */
    public final List<View> k(List<? extends UiComponent> components, Map<String, ? extends UiComponentConfig> componentNameToComponent, Context context, boolean isLoading, List<ComponentView> componentViews, y4 uiComponentHelper, int minLeftPadding, int minRightPadding) {
        List<ComponentView> list;
        View viewB;
        y4 y4Var = uiComponentHelper;
        ArrayList arrayList = new ArrayList();
        for (UiComponent uiComponent : components) {
            if (uiComponent instanceof ActionButtonComponent) {
                ActionButtonComponent actionButtonComponent = (ActionButtonComponent) uiComponent;
                UiComponentConfig uiComponentConfig = componentNameToComponent.get(actionButtonComponent.getName());
                Intrinsics.d(uiComponentConfig, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.ActionButton");
                viewB = cr.a.a(actionButtonComponent, y4Var, (ActionButton) uiComponentConfig);
            } else if (uiComponent instanceof CancelButtonComponent) {
                CancelButtonComponent cancelButtonComponent = (CancelButtonComponent) uiComponent;
                UiComponentConfig uiComponentConfig2 = componentNameToComponent.get(cancelButtonComponent.getName());
                Intrinsics.d(uiComponentConfig2, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.CancelButton");
                viewB = cr.f.a(cancelButtonComponent, y4Var, (CancelButton) uiComponentConfig2);
            } else if (uiComponent instanceof CombinedStepButtonComponent) {
                CombinedStepButtonComponent combinedStepButtonComponent = (CombinedStepButtonComponent) uiComponent;
                UiComponentConfig uiComponentConfig3 = componentNameToComponent.get(combinedStepButtonComponent.getName());
                Intrinsics.d(uiComponentConfig3, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.CombinedStepButton");
                viewB = cr.i.a(combinedStepButtonComponent, y4Var, (CombinedStepButton) uiComponentConfig3);
            } else if (uiComponent instanceof CompleteButtonComponent) {
                CompleteButtonComponent completeButtonComponent = (CompleteButtonComponent) uiComponent;
                UiComponentConfig uiComponentConfig4 = componentNameToComponent.get(completeButtonComponent.getName());
                Intrinsics.d(uiComponentConfig4, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.CompleteButton");
                viewB = cr.j.a(completeButtonComponent, y4Var, (CompleteButton) uiComponentConfig4);
            } else if (uiComponent instanceof LinkButtonComponent) {
                LinkButtonComponent linkButtonComponent = (LinkButtonComponent) uiComponent;
                UiComponentConfig uiComponentConfig5 = componentNameToComponent.get(linkButtonComponent.getName());
                Intrinsics.d(uiComponentConfig5, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.LinkButton");
                viewB = g2.a(linkButtonComponent, y4Var, (LinkButton) uiComponentConfig5);
            } else if (uiComponent instanceof SubmitButtonComponent) {
                SubmitButtonComponent submitButtonComponent = (SubmitButtonComponent) uiComponent;
                UiComponentConfig uiComponentConfig6 = componentNameToComponent.get(submitButtonComponent.getName());
                Intrinsics.d(uiComponentConfig6, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.SubmitButton");
                viewB = t4.a(submitButtonComponent, y4Var, (SubmitButton) uiComponentConfig6);
            } else if (uiComponent instanceof ESignatureComponent) {
                ESignatureComponent eSignatureComponent = (ESignatureComponent) uiComponent;
                UiComponentConfig uiComponentConfig7 = componentNameToComponent.get(eSignatureComponent.getName());
                Intrinsics.d(uiComponentConfig7, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.ESignature");
                viewB = cr.q.c(eSignatureComponent, y4Var, (ESignature) uiComponentConfig7);
            } else if (uiComponent instanceof GovernmentIdNfcScanComponent) {
                GovernmentIdNfcScanComponent governmentIdNfcScanComponent = (GovernmentIdNfcScanComponent) uiComponent;
                UiComponentConfig uiComponentConfig8 = componentNameToComponent.get(governmentIdNfcScanComponent.getName());
                Intrinsics.d(uiComponentConfig8, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.GovernmentIdNfcScan");
                viewB = v.c(governmentIdNfcScanComponent, y4Var, (GovernmentIdNfcScan) uiComponentConfig8);
            } else if (uiComponent instanceof JpMyNumberNfcScanComponent) {
                JpMyNumberNfcScanComponent jpMyNumberNfcScanComponent = (JpMyNumberNfcScanComponent) uiComponent;
                UiComponentConfig uiComponentConfig9 = componentNameToComponent.get(jpMyNumberNfcScanComponent.getName());
                Intrinsics.d(uiComponentConfig9, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.JpMyNumberNfcScan");
                viewB = e2.b(jpMyNumberNfcScanComponent, y4Var, (JpMyNumberNfcScan) uiComponentConfig9);
            } else if (uiComponent instanceof ImagePreviewComponent) {
                ImagePreviewComponent imagePreviewComponent = (ImagePreviewComponent) uiComponent;
                UiComponentConfig uiComponentConfig10 = componentNameToComponent.get(imagePreviewComponent.getName());
                Intrinsics.d(uiComponentConfig10, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.CombinedStepImagePreview");
                viewB = b0.b(imagePreviewComponent, y4Var, (CombinedStepImagePreview) uiComponentConfig10);
            } else if (uiComponent instanceof InputAddressComponent) {
                InputAddressComponent inputAddressComponent = (InputAddressComponent) uiComponent;
                UiComponentConfig uiComponentConfig11 = componentNameToComponent.get(inputAddressComponent.getName());
                Intrinsics.d(uiComponentConfig11, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.InputAddress");
                viewB = e0.g(inputAddressComponent, y4Var, (InputAddress) uiComponentConfig11);
            } else if (uiComponent instanceof InputCheckboxComponent) {
                InputCheckboxComponent inputCheckboxComponent = (InputCheckboxComponent) uiComponent;
                UiComponentConfig uiComponentConfig12 = componentNameToComponent.get(inputCheckboxComponent.getName());
                Intrinsics.d(uiComponentConfig12, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.InputCheckbox");
                viewB = i0.d(inputCheckboxComponent, y4Var, (InputCheckbox) uiComponentConfig12);
            } else if (uiComponent instanceof InputCheckboxGroupComponent) {
                InputCheckboxGroupComponent inputCheckboxGroupComponent = (InputCheckboxGroupComponent) uiComponent;
                UiComponentConfig uiComponentConfig13 = componentNameToComponent.get(inputCheckboxGroupComponent.getName());
                Intrinsics.d(uiComponentConfig13, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.InputCheckboxGroup");
                viewB = l0.c(inputCheckboxGroupComponent, y4Var, (InputCheckboxGroup) uiComponentConfig13);
            } else if (uiComponent instanceof InputConfirmationCodeComponent) {
                InputConfirmationCodeComponent inputConfirmationCodeComponent = (InputConfirmationCodeComponent) uiComponent;
                UiComponentConfig uiComponentConfig14 = componentNameToComponent.get(inputConfirmationCodeComponent.getName());
                Intrinsics.d(uiComponentConfig14, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.InputConfirmationCode");
                viewB = r0.f(inputConfirmationCodeComponent, y4Var, (InputConfirmationCode) uiComponentConfig14);
            } else if (uiComponent instanceof InputDateComponent) {
                InputDateComponent inputDateComponent = (InputDateComponent) uiComponent;
                UiComponentConfig uiComponentConfig15 = componentNameToComponent.get(inputDateComponent.getName());
                Intrinsics.d(uiComponentConfig15, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.InputDate");
                viewB = v0.c(inputDateComponent, y4Var, null, (InputDate) uiComponentConfig15, 2, null);
            } else if (uiComponent instanceof InputFileUploadComponent) {
                InputFileUploadComponent inputFileUploadComponent = (InputFileUploadComponent) uiComponent;
                UiComponentConfig uiComponentConfig16 = componentNameToComponent.get(inputFileUploadComponent.getName());
                Intrinsics.d(uiComponentConfig16, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.InputFileUpload");
                viewB = y0.c(inputFileUploadComponent, y4Var, (InputFileUpload) uiComponentConfig16);
            } else if (uiComponent instanceof InputMaskedTextComponent) {
                InputMaskedTextComponent inputMaskedTextComponent = (InputMaskedTextComponent) uiComponent;
                UiComponentConfig uiComponentConfig17 = componentNameToComponent.get(inputMaskedTextComponent.getName());
                Intrinsics.d(uiComponentConfig17, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.InputMaskedText");
                viewB = i1.h(inputMaskedTextComponent, y4Var, (InputMaskedText) uiComponentConfig17);
            } else if (uiComponent instanceof InputMultiSelectComponent) {
                InputMultiSelectComponent inputMultiSelectComponent = (InputMultiSelectComponent) uiComponent;
                UiComponentConfig uiComponentConfig18 = componentNameToComponent.get(inputMultiSelectComponent.getName());
                Intrinsics.d(uiComponentConfig18, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.InputMultiSelect");
                viewB = k1.b(inputMultiSelectComponent, y4Var, (InputMultiSelect) uiComponentConfig18);
            } else if (uiComponent instanceof InputNumberComponent) {
                InputNumberComponent inputNumberComponent = (InputNumberComponent) uiComponent;
                UiComponentConfig uiComponentConfig19 = componentNameToComponent.get(inputNumberComponent.getName());
                Intrinsics.d(uiComponentConfig19, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.InputNumber");
                viewB = m1.b(inputNumberComponent, y4Var, (InputNumber) uiComponentConfig19);
            } else if (uiComponent instanceof InputPhoneNumberComponent) {
                InputPhoneNumberComponent inputPhoneNumberComponent = (InputPhoneNumberComponent) uiComponent;
                UiComponentConfig uiComponentConfig20 = componentNameToComponent.get(inputPhoneNumberComponent.getName());
                Intrinsics.d(uiComponentConfig20, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.InputPhoneNumber");
                viewB = p1.c(inputPhoneNumberComponent, y4Var, (InputPhoneNumber) uiComponentConfig20);
            } else if (uiComponent instanceof InputRadioGroupComponent) {
                InputRadioGroupComponent inputRadioGroupComponent = (InputRadioGroupComponent) uiComponent;
                UiComponentConfig uiComponentConfig21 = componentNameToComponent.get(inputRadioGroupComponent.getName());
                Intrinsics.d(uiComponentConfig21, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.InputRadioGroup");
                viewB = v1.f(inputRadioGroupComponent, y4Var, (InputRadioGroup) uiComponentConfig21);
            } else if (uiComponent instanceof InputSelectComponent) {
                InputSelectComponent inputSelectComponent = (InputSelectComponent) uiComponent;
                UiComponentConfig uiComponentConfig22 = componentNameToComponent.get(inputSelectComponent.getName());
                Intrinsics.d(uiComponentConfig22, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.InputSelect");
                viewB = y1.b(inputSelectComponent, y4Var, (InputSelect) uiComponentConfig22);
            } else if (uiComponent instanceof InputTextComponent) {
                InputTextComponent inputTextComponent = (InputTextComponent) uiComponent;
                UiComponentConfig uiComponentConfig23 = componentNameToComponent.get(inputTextComponent.getName());
                Intrinsics.d(uiComponentConfig23, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.InputText");
                viewB = c2.c(inputTextComponent, y4Var, (InputText) uiComponentConfig23, null, 4, null);
            } else if (uiComponent instanceof LocalImageComponent) {
                LocalImageComponent localImageComponent = (LocalImageComponent) uiComponent;
                UiComponentConfig uiComponentConfig24 = componentNameToComponent.get(localImageComponent.getName());
                Intrinsics.d(uiComponentConfig24, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.LocalImage");
                viewB = p3.K(localImageComponent, y4Var, (LocalImage) uiComponentConfig24);
            } else if (uiComponent instanceof PrivacyPolicyComponent) {
                PrivacyPolicyComponent privacyPolicyComponent = (PrivacyPolicyComponent) uiComponent;
                UiComponentConfig uiComponentConfig25 = componentNameToComponent.get(privacyPolicyComponent.getName());
                Intrinsics.d(uiComponentConfig25, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.PrivacyPolicy");
                viewB = y3.b(privacyPolicyComponent, y4Var, (PrivacyPolicy) uiComponentConfig25);
            } else if (uiComponent instanceof QRCodeComponent) {
                QRCodeComponent qRCodeComponent = (QRCodeComponent) uiComponent;
                UiComponentConfig uiComponentConfig26 = componentNameToComponent.get(qRCodeComponent.getName());
                Intrinsics.d(uiComponentConfig26, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.QRCode");
                viewB = a4.b(qRCodeComponent, y4Var, (QRCode) uiComponentConfig26);
            } else if (uiComponent instanceof RemoteImageComponent) {
                RemoteImageComponent remoteImageComponent = (RemoteImageComponent) uiComponent;
                UiComponentConfig uiComponentConfig27 = componentNameToComponent.get(remoteImageComponent.getName());
                Intrinsics.d(uiComponentConfig27, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage");
                viewB = k4.n(remoteImageComponent, y4Var, (RemoteImage) uiComponentConfig27);
            } else if (uiComponent instanceof SpacerComponent) {
                viewB = q4.b((SpacerComponent) uiComponent, y4Var);
            } else if (uiComponent instanceof TextComponent) {
                TextComponent textComponent = (TextComponent) uiComponent;
                UiComponentConfig uiComponentConfig28 = componentNameToComponent.get(textComponent.getName());
                Intrinsics.d(uiComponentConfig28, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.Text");
                viewB = v4.b(textComponent, y4Var, (Text) uiComponentConfig28);
            } else if (uiComponent instanceof TitleComponent) {
                TitleComponent titleComponent = (TitleComponent) uiComponent;
                UiComponentConfig uiComponentConfig29 = componentNameToComponent.get(titleComponent.getName());
                Intrinsics.d(uiComponentConfig29, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.Title");
                viewB = x4.b(titleComponent, y4Var, (Title) uiComponentConfig29);
            } else if (uiComponent instanceof InputTextAreaComponent) {
                InputTextAreaComponent inputTextAreaComponent = (InputTextAreaComponent) uiComponent;
                UiComponentConfig uiComponentConfig30 = componentNameToComponent.get(inputTextAreaComponent.getName());
                Intrinsics.d(uiComponentConfig30, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.InputTextArea");
                viewB = a2.b(inputTextAreaComponent, y4Var, (InputTextArea) uiComponentConfig30);
            } else if (uiComponent instanceof BrandingComponent) {
                viewB = cr.e.b((BrandingComponent) uiComponent, y4Var);
            } else if (uiComponent instanceof CreatePersonaSheetComponent) {
                viewB = cr.k.a((CreatePersonaSheetComponent) uiComponent, y4Var);
            } else {
                if (uiComponent instanceof VerifyPersonaButtonComponent) {
                    VerifyPersonaButtonComponent verifyPersonaButtonComponent = (VerifyPersonaButtonComponent) uiComponent;
                    UiComponentConfig uiComponentConfig31 = componentNameToComponent.get(verifyPersonaButtonComponent.getName());
                    Intrinsics.d(uiComponentConfig31, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.VerifyPersonaButton");
                    viewB = c5.a(verifyPersonaButtonComponent, y4Var, (VerifyPersonaButton) uiComponentConfig31);
                } else if (uiComponent instanceof ClickableStackComponent) {
                    ClickableStackComponent clickableStackComponent = (ClickableStackComponent) uiComponent;
                    list = componentViews;
                    List<View> listK = f3757a.k(clickableStackComponent.getChildren(), componentNameToComponent, context, isLoading, list, uiComponentHelper, minLeftPadding, minRightPadding);
                    y4Var = uiComponentHelper;
                    UiComponentConfig uiComponentConfig32 = componentNameToComponent.get(clickableStackComponent.getName());
                    Intrinsics.d(uiComponentConfig32, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.ClickableStack");
                    viewB = cr.h.b(clickableStackComponent, y4Var, list, listK, (ClickableStack) uiComponentConfig32);
                } else {
                    list = componentViews;
                    if (uiComponent instanceof HorizontalStackComponent) {
                        HorizontalStackComponent horizontalStackComponent = (HorizontalStackComponent) uiComponent;
                        List<View> listK2 = f3757a.k(horizontalStackComponent.getChildren(), componentNameToComponent, context, isLoading, list, uiComponentHelper, minLeftPadding, minRightPadding);
                        y4Var = uiComponentHelper;
                        UiComponentConfig uiComponentConfig33 = componentNameToComponent.get(horizontalStackComponent.getName());
                        Intrinsics.d(uiComponentConfig33, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.HorizontalStack");
                        viewB = cr.z.b(horizontalStackComponent, y4Var, list, listK2, (HorizontalStack) uiComponentConfig33);
                    } else if (uiComponent instanceof FooterComponent) {
                        FooterComponent footerComponent = (FooterComponent) uiComponent;
                        List<View> listK3 = f3757a.k(footerComponent.getChildren(), componentNameToComponent, context, isLoading, list, uiComponentHelper, minLeftPadding, minRightPadding);
                        UiComponentConfig uiComponentConfig34 = componentNameToComponent.get(footerComponent.getName());
                        Intrinsics.d(uiComponentConfig34, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.Footer");
                        Footer footer = (Footer) uiComponentConfig34;
                        y4Var = uiComponentHelper;
                        viewB = cr.s.a(footerComponent, y4Var, componentViews, listK3, footer, minLeftPadding, minRightPadding);
                        list = componentViews;
                    } else if (uiComponent instanceof InputCurrencyComponent) {
                        InputCurrencyComponent inputCurrencyComponent = (InputCurrencyComponent) uiComponent;
                        UiComponentConfig uiComponentConfig35 = componentNameToComponent.get(inputCurrencyComponent.getName());
                        Intrinsics.d(uiComponentConfig35, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.InputCurrency");
                        viewB = t0.b(inputCurrencyComponent, y4Var, (InputCurrency) uiComponentConfig35);
                    } else if (uiComponent instanceof InputInternationalDbComponent) {
                        InputInternationalDbComponent inputInternationalDbComponent = (InputInternationalDbComponent) uiComponent;
                        UiComponentConfig uiComponentConfig36 = componentNameToComponent.get(inputInternationalDbComponent.getName());
                        Intrinsics.d(uiComponentConfig36, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.InputInternationalDb");
                        viewB = com.withpersona.sdk2.inquiry.steps.ui.components.a.j(inputInternationalDbComponent, y4Var, (InputInternationalDb) uiComponentConfig36);
                    } else if (uiComponent instanceof MdocComponent) {
                        MdocComponent mdocComponent = (MdocComponent) uiComponent;
                        UiComponentConfig uiComponentConfig37 = componentNameToComponent.get(mdocComponent.getName());
                        Intrinsics.d(uiComponentConfig37, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.Mdoc");
                        viewB = u3.b(mdocComponent, y4Var, (Mdoc) uiComponentConfig37);
                    } else {
                        if (!(uiComponent instanceof PhoneNumberSnaComponent) && !(uiComponent instanceof HelpBottomSheetComponent)) {
                            throw new jt.l();
                        }
                        viewB = null;
                    }
                }
                if (viewB != null) {
                    list.add(new ComponentView(uiComponent, viewB));
                }
                if (viewB != null) {
                    arrayList.add(viewB);
                }
            }
            list = componentViews;
            if (viewB != null) {
                list.add(new ComponentView(uiComponent, viewB));
            }
            if (viewB != null) {
                arrayList.add(viewB);
            }
        }
        return arrayList;
    }

    @NotNull
    public final g l(@NotNull nq.b binding, @NotNull UiComponentScreen uiScreen, @Nullable Function2<? super nq.b, ? super Map<String, ComponentView>, Unit> initialRendering, boolean shouldApplyFocus) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(uiScreen, "uiScreen");
        Context context = binding.getRoot().getContext();
        Intrinsics.checkNotNull(context);
        g gVarH = h(this, context, uiScreen, false, shouldApplyFocus, false, 16, null);
        if (uiScreen.k() == StyleElements.PositionType.CENTER) {
            binding.f26637c.setFillViewport(true);
            gVarH.getContentView().setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            View contentView = gVarH.getContentView();
            ViewGroup.LayoutParams layoutParams = contentView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.gravity = 16;
            contentView.setLayoutParams(layoutParams2);
        }
        binding.b.addView(gVarH.getContentView());
        ConstraintLayout constraintLayoutB = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutB, "getRoot(...)");
        wq.g.d(constraintLayoutB, false, false, false, false, 13, null);
        if (gVarH.getFooterView() != null) {
            binding.f26638d.addView(gVarH.getFooterView());
            wq.g.d(gVarH.getFooterView(), false, false, false, false, 2, null);
        }
        if (initialRendering != null) {
            initialRendering.invoke(binding, gVarH.getViewBindings().a());
        }
        Integer numJ = uiScreen.j();
        if (numJ != null) {
            binding.f26639e.setControlsColor(numJ.intValue());
        }
        return gVarH;
    }
}
