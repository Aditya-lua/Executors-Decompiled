package or;

import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.github.luben.zstd.BuildConfig;
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
import com.withpersona.sdk2.inquiry.steps.ui.components.ClickableStackComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.CreatePersonaSheetComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.ESignatureComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.GovernmentIdNfcScanComponent;
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
import com.withpersona.sdk2.inquiry.steps.ui.components.MdocComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kr.a0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Pair;
import p001kotlin.Unit;
import p001kotlin.collections.CollectionsKt;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.text.StringsKt;
import qr.ActionButtonComponent;
import qr.BrandingComponent;
import qr.CancelButtonComponent;
import qr.CombinedStepButtonComponent;
import qr.CompleteButtonComponent;
import qr.FooterComponent;
import qr.HorizontalStackComponent;
import qr.ImagePreviewComponent;
import qr.LinkButtonComponent;
import qr.LocalImageComponent;
import qr.PhoneNumberSnaComponent;
import qr.PrivacyPolicyComponent;
import qr.QRCodeComponent;
import qr.RemoteImageComponent;
import qr.SpacerComponent;
import qr.SubmitButtonComponent;
import qr.TextComponent;
import qr.TitleComponent;
import qr.b0;
import qr.b2;
import qr.d1;
import qr.d4;
import qr.d5;
import qr.d6;
import qr.e0;
import qr.e6;
import qr.f1;
import qr.g0;
import qr.h1;
import qr.h2;
import qr.i4;
import qr.k0;
import qr.k1;
import qr.k2;
import qr.m2;
import qr.m5;
import qr.n0;
import qr.o2;
import qr.p4;
import qr.q0;
import qr.q2;
import qr.q5;
import qr.s4;
import qr.t2;
import qr.t5;
import qr.u0;
import qr.u1;
import qr.w1;
import qr.w5;
import qr.x0;
import qr.x5;
import qr.y;
import qr.y1;
import qr.z5;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JU\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042$\u0010\f\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t0\u00070\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0011\u0010\u0012JM\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042&\u0010\u0018\u001a\"\u0012\u0004\u0012\u00020\u0013\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00152\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ7\u0010\"\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\"\u0010#J\u0015\u0010&\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'JU\u0010-\u001a\u00020,2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00192\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00170(2\u0006\u0010+\u001a\u00020*2\u0006\u0010!\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b-\u0010.Jg\u00106\u001a\u00020,2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u00100\u001a\u00020/2\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u0002010\u00162\u0006\u0010 \u001a\u00020\u00192\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00170(2\u0006\u0010+\u001a\u00020*2\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u000203H\u0002¢\u0006\u0004\b6\u00107Jm\u0010;\u001a\b\u0012\u0004\u0012\u00020,0\u00062\f\u00108\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u0002010\u00162\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u00192\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0017092\u0006\u0010+\u001a\u00020*2\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u000203H\u0002¢\u0006\u0004\b;\u0010<¨\u0006="}, d2 = {"Lor/v;", BuildConfig.FLAVOR, "<init>", "()V", "Lor/i;", "uiScreen", BuildConfig.FLAVOR, "Lkotlin/Pair;", BuildConfig.FLAVOR, "Lkotlin/Function1;", "Lqr/x5;", BuildConfig.FLAVOR, "componentNamesToActions", "Lkotlin/Function0;", "onCancelled", "cancelButtonName", "Lor/s;", "j", "(Lor/i;Ljava/util/List;Lkotlin/jvm/functions/Function0;Ljava/lang/String;)Lor/s;", "Lbr/b;", "binding", "Lkotlin/Function2;", BuildConfig.FLAVOR, "Lor/a;", "initialRendering", BuildConfig.FLAVOR, "shouldApplyFocus", "Lor/j;", "l", "(Lbr/b;Lor/i;Lkotlin/jvm/functions/Function2;Z)Lor/j;", "Landroid/content/Context;", "context", "isLoading", "isModal", "g", "(Landroid/content/Context;Lor/i;ZZZ)Lor/j;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "parentView", "c", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", BuildConfig.FLAVOR, "viewBindings", "Lqr/z5;", "uiComponentHelper", "Landroid/view/View;", "f", "(Landroid/content/Context;Lor/i;ZLjava/util/Map;Lqr/z5;ZZ)Landroid/view/View;", "Lqr/a0;", "component", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "componentNameToComponent", BuildConfig.FLAVOR, "minLeftPadding", "minRightPadding", "e", "(Landroid/content/Context;Lqr/a0;Ljava/util/Map;ZLjava/util/Map;Lqr/z5;II)Landroid/view/View;", "components", BuildConfig.FLAVOR, "componentViews", "k", "(Ljava/util/List;Ljava/util/Map;Landroid/content/Context;ZLjava/util/List;Lqr/z5;II)Ljava/util/List;", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final v f28513a = new v();

    public static final void d(View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(view, 1);
        }
    }

    public static /* synthetic */ j h(v vVar, Context context, UiComponentScreen iVar, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            z12 = true;
        }
        return vVar.g(context, iVar, z10, z11, z12);
    }

    public static final Unit i(z5 z5Var) {
        z5Var.c();
        return Unit.f21506a;
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
            view3.post(new Runnable() { // from class: or.u
                @Override // java.lang.Runnable
                public final void run() {
                    v.d(view3);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View e(Context context, FooterComponent component, Map<String, ? extends UiComponentConfig> componentNameToComponent, boolean isLoading, Map<String, ComponentView> viewBindings, z5 uiComponentHelper, int minLeftPadding, int minRightPadding) {
        ArrayList arrayList = new ArrayList();
        List<View> listK = k(p001kotlin.collections.o.d(component), componentNameToComponent, context, isLoading, arrayList, uiComponentHelper, minLeftPadding, minRightPadding);
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
    public final View f(Context context, UiComponentScreen uiScreen, boolean isLoading, Map<String, ComponentView> viewBindings, z5 uiComponentHelper, boolean isModal, boolean shouldApplyFocus) {
        List<? extends x5> listK;
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
        ur.t tVarC = ur.t.c(uiComponentHelper.getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(tVarC, "inflate(...)");
        ConstraintLayout constraintLayoutB = tVarC.getRoot();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutB, "getRoot(...)");
        List<x5> components = uiScreen.getComponents();
        if (components != null) {
            listK = new ArrayList<>();
            for (Object obj : components) {
                if (!(((x5) obj) instanceof FooterComponent)) {
                    listK.add(obj);
                }
            }
        } else {
            listK = p001kotlin.collections.p.k();
        }
        List<? extends x5> list = listK;
        ArrayList arrayList = new ArrayList();
        Map<String, ? extends UiComponentConfig> mapJ = com.withpersona.sdk2.inquiry.steps.ui.components.g.j(uiScreen.W0());
        StepStyles.UiStepStyle styles = uiScreen.getStyles();
        int iA = (int) ((styles == null || (padding2 = styles.getPadding()) == null || (screen2 = padding2.getScreen()) == null || (base2 = screen2.getBase()) == null || (left = base2.getLeft()) == null || (dp3 = left.getDp()) == null) ? xq.j.a(24.0d) : xq.j.a(dp3.doubleValue()));
        StepStyles.UiStepStyle styles2 = uiScreen.getStyles();
        List<View> listK2 = k(list, mapJ, context, isLoading, arrayList, uiComponentHelper, iA, (int) ((styles2 == null || (padding = styles2.getPadding()) == null || (screen = padding.getScreen()) == null || (base = screen.getBase()) == null || (right = base.getRight()) == null || (dp2 = right.getDp()) == null) ? xq.j.a(24.0d) : xq.j.a(dp2.doubleValue())));
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
            ArrayList arrayList2 = new ArrayList(p001kotlin.collections.q.u(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Integer.valueOf(((View) it2.next()).getId()));
            }
            cVar2.q(0, 3, 0, 4, CollectionsKt.L0(arrayList2), null, 3);
            cVar = cVar2;
            if (uiScreen.getStyles() == null) {
                for (x5 x5Var : list) {
                    int i12 = i10 + 1;
                    if (!(x5Var instanceof SpacerComponent) && (componentView = (ComponentView) viewBindings.get(x5Var.getName())) != null && (viewD = componentView.d()) != null && i10 != p001kotlin.collections.p.m(list)) {
                        cVar.E(viewD.getId(), 4, (int) xq.j.a(16.0d));
                    }
                    i10 = i12;
                }
            }
        } else {
            cVar = cVar2;
        }
        if (!isModal) {
            constraintLayoutB.setPadding(constraintLayoutB.getPaddingLeft(), constraintLayoutB.getPaddingTop(), constraintLayoutB.getPaddingRight(), (int) xq.j.a(24.0d));
        }
        cVar.c(constraintLayoutB);
        Context context2 = tVarC.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        if (!xq.g.g(context2) && shouldApplyFocus) {
            c(constraintLayoutB);
        }
        ConstraintLayout constraintLayoutB2 = tVarC.getRoot();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutB2, "getRoot(...)");
        return constraintLayoutB2;
    }

    @NotNull
    public final j g(@NotNull Context context, @NotNull UiComponentScreen uiScreen, boolean isLoading, boolean isModal, boolean shouldApplyFocus) {
        FooterComponent a0Var;
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
        final z5 z5Var = new z5(context);
        View viewF = f(context, uiScreen, isLoading, linkedHashMap, z5Var, isModal, shouldApplyFocus);
        List<x5> components = uiScreen.getComponents();
        View viewE = null;
        if (components != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : components) {
                if (obj instanceof FooterComponent) {
                    arrayList.add(obj);
                }
            }
            a0Var = (FooterComponent) CollectionsKt.firstOrNull(arrayList);
        } else {
            a0Var = null;
        }
        if (a0Var != null) {
            Map<String, UiComponentConfig> mapJ = com.withpersona.sdk2.inquiry.steps.ui.components.g.j(uiScreen.W0());
            StepStyles.UiStepStyle styles = uiScreen.getStyles();
            int iA = (int) ((styles == null || (padding2 = styles.getPadding()) == null || (screen2 = padding2.getScreen()) == null || (base2 = screen2.getBase()) == null || (left = base2.getLeft()) == null || (dp3 = left.getDp()) == null) ? xq.j.a(24.0d) : xq.j.a(dp3.doubleValue()));
            StepStyles.UiStepStyle styles2 = uiScreen.getStyles();
            viewE = e(context, a0Var, mapJ, isLoading, linkedHashMap, z5Var, iA, (int) ((styles2 == null || (padding = styles2.getPadding()) == null || (screen = padding.getScreen()) == null || (base = screen.getBase()) == null || (right = base.getRight()) == null || (dp2 = right.getDp()) == null) ? xq.j.a(24.0d) : xq.j.a(dp2.doubleValue())));
            linkedHashMap = linkedHashMap;
            z5Var = z5Var;
        }
        a0.b(viewF, new Function0() { // from class: or.t
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return v.i(z5Var);
            }
        });
        return new j(new k(linkedHashMap), viewF, viewE);
    }

    @NotNull
    public final UiStepBottomSheet j(@NotNull UiComponentScreen uiScreen, @NotNull List<? extends Pair<String, ? extends Function1<? super x5, Unit>>> componentNamesToActions, @NotNull Function0<Unit> onCancelled, @Nullable String cancelButtonName) {
        Intrinsics.checkNotNullParameter(uiScreen, "uiScreen");
        Intrinsics.checkNotNullParameter(componentNamesToActions, "componentNamesToActions");
        Intrinsics.checkNotNullParameter(onCancelled, "onCancelled");
        return new UiStepBottomSheet(uiScreen, componentNamesToActions, onCancelled, cancelButtonName, false, 16, null);
    }

    /* JADX WARN: Code duplicated, block: B:133:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:141:0x04b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x000d A[SYNTHETIC] */
    public final List<View> k(List<? extends x5> components, Map<String, ? extends UiComponentConfig> componentNameToComponent, Context context, boolean isLoading, List<ComponentView> componentViews, z5 uiComponentHelper, int minLeftPadding, int minRightPadding) {
        List<ComponentView> list;
        View viewB;
        z5 z5Var = uiComponentHelper;
        ArrayList arrayList = new ArrayList();
        for (x5 x5Var : components) {
            if (x5Var instanceof ActionButtonComponent) {
                ActionButtonComponent aVar = (ActionButtonComponent) x5Var;
                UiComponentConfig uiComponentConfig = componentNameToComponent.get(aVar.getName());
                Intrinsics.d(uiComponentConfig, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.ActionButton");
                viewB = qr.b.a(aVar, z5Var, (ActionButton) uiComponentConfig);
            } else if (x5Var instanceof CancelButtonComponent) {
                CancelButtonComponent jVar = (CancelButtonComponent) x5Var;
                UiComponentConfig uiComponentConfig2 = componentNameToComponent.get(jVar.getName());
                Intrinsics.d(uiComponentConfig2, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.CancelButton");
                viewB = qr.k.a(jVar, z5Var, (CancelButton) uiComponentConfig2);
            } else if (x5Var instanceof CombinedStepButtonComponent) {
                CombinedStepButtonComponent nVar = (CombinedStepButtonComponent) x5Var;
                UiComponentConfig uiComponentConfig3 = componentNameToComponent.get(nVar.getName());
                Intrinsics.d(uiComponentConfig3, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.CombinedStepButton");
                viewB = qr.o.a(nVar, z5Var, (CombinedStepButton) uiComponentConfig3);
            } else if (x5Var instanceof CompleteButtonComponent) {
                CompleteButtonComponent pVar = (CompleteButtonComponent) x5Var;
                UiComponentConfig uiComponentConfig4 = componentNameToComponent.get(pVar.getName());
                Intrinsics.d(uiComponentConfig4, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.CompleteButton");
                viewB = qr.q.a(pVar, z5Var, (CompleteButton) uiComponentConfig4);
            } else if (x5Var instanceof LinkButtonComponent) {
                LinkButtonComponent s2Var = (LinkButtonComponent) x5Var;
                UiComponentConfig uiComponentConfig5 = componentNameToComponent.get(s2Var.getName());
                Intrinsics.d(uiComponentConfig5, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.LinkButton");
                viewB = t2.a(s2Var, z5Var, (LinkButton) uiComponentConfig5);
            } else if (x5Var instanceof SubmitButtonComponent) {
                SubmitButtonComponent p5Var = (SubmitButtonComponent) x5Var;
                UiComponentConfig uiComponentConfig6 = componentNameToComponent.get(p5Var.getName());
                Intrinsics.d(uiComponentConfig6, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.SubmitButton");
                viewB = q5.a(p5Var, z5Var, (SubmitButton) uiComponentConfig6);
            } else if (x5Var instanceof ESignatureComponent) {
                ESignatureComponent eSignatureComponent = (ESignatureComponent) x5Var;
                UiComponentConfig uiComponentConfig7 = componentNameToComponent.get(eSignatureComponent.getName());
                Intrinsics.d(uiComponentConfig7, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.ESignature");
                viewB = y.c(eSignatureComponent, z5Var, (ESignature) uiComponentConfig7);
            } else if (x5Var instanceof GovernmentIdNfcScanComponent) {
                GovernmentIdNfcScanComponent governmentIdNfcScanComponent = (GovernmentIdNfcScanComponent) x5Var;
                UiComponentConfig uiComponentConfig8 = componentNameToComponent.get(governmentIdNfcScanComponent.getName());
                Intrinsics.d(uiComponentConfig8, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.GovernmentIdNfcScan");
                viewB = e0.c(governmentIdNfcScanComponent, z5Var, (GovernmentIdNfcScan) uiComponentConfig8);
            } else if (x5Var instanceof JpMyNumberNfcScanComponent) {
                JpMyNumberNfcScanComponent jpMyNumberNfcScanComponent = (JpMyNumberNfcScanComponent) x5Var;
                UiComponentConfig uiComponentConfig9 = componentNameToComponent.get(jpMyNumberNfcScanComponent.getName());
                Intrinsics.d(uiComponentConfig9, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.JpMyNumberNfcScan");
                viewB = q2.b(jpMyNumberNfcScanComponent, z5Var, (JpMyNumberNfcScan) uiComponentConfig9);
            } else if (x5Var instanceof ImagePreviewComponent) {
                ImagePreviewComponent l0Var = (ImagePreviewComponent) x5Var;
                UiComponentConfig uiComponentConfig10 = componentNameToComponent.get(l0Var.getName());
                Intrinsics.d(uiComponentConfig10, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.CombinedStepImagePreview");
                viewB = n0.b(l0Var, z5Var, (CombinedStepImagePreview) uiComponentConfig10);
            } else if (x5Var instanceof InputAddressComponent) {
                InputAddressComponent inputAddressComponent = (InputAddressComponent) x5Var;
                UiComponentConfig uiComponentConfig11 = componentNameToComponent.get(inputAddressComponent.getName());
                Intrinsics.d(uiComponentConfig11, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.InputAddress");
                viewB = q0.g(inputAddressComponent, z5Var, (InputAddress) uiComponentConfig11);
            } else if (x5Var instanceof InputCheckboxComponent) {
                InputCheckboxComponent inputCheckboxComponent = (InputCheckboxComponent) x5Var;
                UiComponentConfig uiComponentConfig12 = componentNameToComponent.get(inputCheckboxComponent.getName());
                Intrinsics.d(uiComponentConfig12, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.InputCheckbox");
                viewB = u0.d(inputCheckboxComponent, z5Var, (InputCheckbox) uiComponentConfig12);
            } else if (x5Var instanceof InputCheckboxGroupComponent) {
                InputCheckboxGroupComponent inputCheckboxGroupComponent = (InputCheckboxGroupComponent) x5Var;
                UiComponentConfig uiComponentConfig13 = componentNameToComponent.get(inputCheckboxGroupComponent.getName());
                Intrinsics.d(uiComponentConfig13, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.InputCheckboxGroup");
                viewB = x0.c(inputCheckboxGroupComponent, z5Var, (InputCheckboxGroup) uiComponentConfig13);
            } else if (x5Var instanceof InputConfirmationCodeComponent) {
                InputConfirmationCodeComponent inputConfirmationCodeComponent = (InputConfirmationCodeComponent) x5Var;
                UiComponentConfig uiComponentConfig14 = componentNameToComponent.get(inputConfirmationCodeComponent.getName());
                Intrinsics.d(uiComponentConfig14, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.InputConfirmationCode");
                viewB = d1.f(inputConfirmationCodeComponent, z5Var, (InputConfirmationCode) uiComponentConfig14);
            } else if (x5Var instanceof InputDateComponent) {
                InputDateComponent inputDateComponent = (InputDateComponent) x5Var;
                UiComponentConfig uiComponentConfig15 = componentNameToComponent.get(inputDateComponent.getName());
                Intrinsics.d(uiComponentConfig15, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.InputDate");
                viewB = h1.c(inputDateComponent, z5Var, null, (InputDate) uiComponentConfig15, 2, null);
            } else if (x5Var instanceof InputFileUploadComponent) {
                InputFileUploadComponent inputFileUploadComponent = (InputFileUploadComponent) x5Var;
                UiComponentConfig uiComponentConfig16 = componentNameToComponent.get(inputFileUploadComponent.getName());
                Intrinsics.d(uiComponentConfig16, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.InputFileUpload");
                viewB = k1.c(inputFileUploadComponent, z5Var, (InputFileUpload) uiComponentConfig16);
            } else if (x5Var instanceof InputMaskedTextComponent) {
                InputMaskedTextComponent inputMaskedTextComponent = (InputMaskedTextComponent) x5Var;
                UiComponentConfig uiComponentConfig17 = componentNameToComponent.get(inputMaskedTextComponent.getName());
                Intrinsics.d(uiComponentConfig17, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.InputMaskedText");
                viewB = u1.h(inputMaskedTextComponent, z5Var, (InputMaskedText) uiComponentConfig17);
            } else if (x5Var instanceof InputMultiSelectComponent) {
                InputMultiSelectComponent dVar = (InputMultiSelectComponent) x5Var;
                UiComponentConfig uiComponentConfig18 = componentNameToComponent.get(dVar.getName());
                Intrinsics.d(uiComponentConfig18, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.InputMultiSelect");
                viewB = w1.b(dVar, z5Var, (InputMultiSelect) uiComponentConfig18);
            } else if (x5Var instanceof InputNumberComponent) {
                InputNumberComponent inputNumberComponent = (InputNumberComponent) x5Var;
                UiComponentConfig uiComponentConfig19 = componentNameToComponent.get(inputNumberComponent.getName());
                Intrinsics.d(uiComponentConfig19, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.InputNumber");
                viewB = y1.b(inputNumberComponent, z5Var, (InputNumber) uiComponentConfig19);
            } else if (x5Var instanceof InputPhoneNumberComponent) {
                InputPhoneNumberComponent inputPhoneNumberComponent = (InputPhoneNumberComponent) x5Var;
                UiComponentConfig uiComponentConfig20 = componentNameToComponent.get(inputPhoneNumberComponent.getName());
                Intrinsics.d(uiComponentConfig20, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.InputPhoneNumber");
                viewB = b2.c(inputPhoneNumberComponent, z5Var, (InputPhoneNumber) uiComponentConfig20);
            } else if (x5Var instanceof InputRadioGroupComponent) {
                InputRadioGroupComponent inputRadioGroupComponent = (InputRadioGroupComponent) x5Var;
                UiComponentConfig uiComponentConfig21 = componentNameToComponent.get(inputRadioGroupComponent.getName());
                Intrinsics.d(uiComponentConfig21, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.InputRadioGroup");
                viewB = h2.f(inputRadioGroupComponent, z5Var, (InputRadioGroup) uiComponentConfig21);
            } else if (x5Var instanceof InputSelectComponent) {
                InputSelectComponent eVar = (InputSelectComponent) x5Var;
                UiComponentConfig uiComponentConfig22 = componentNameToComponent.get(eVar.getName());
                Intrinsics.d(uiComponentConfig22, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.InputSelect");
                viewB = k2.b(eVar, z5Var, (InputSelect) uiComponentConfig22);
            } else if (x5Var instanceof InputTextComponent) {
                InputTextComponent inputTextComponent = (InputTextComponent) x5Var;
                UiComponentConfig uiComponentConfig23 = componentNameToComponent.get(inputTextComponent.getName());
                Intrinsics.d(uiComponentConfig23, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.InputText");
                viewB = o2.c(inputTextComponent, z5Var, (InputText) uiComponentConfig23, null, 4, null);
            } else if (x5Var instanceof LocalImageComponent) {
                LocalImageComponent v2Var = (LocalImageComponent) x5Var;
                UiComponentConfig uiComponentConfig24 = componentNameToComponent.get(v2Var.getName());
                Intrinsics.d(uiComponentConfig24, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.LocalImage");
                viewB = d4.K(v2Var, z5Var, (LocalImage) uiComponentConfig24);
            } else if (x5Var instanceof PrivacyPolicyComponent) {
                PrivacyPolicyComponent n4Var = (PrivacyPolicyComponent) x5Var;
                UiComponentConfig uiComponentConfig25 = componentNameToComponent.get(n4Var.getName());
                Intrinsics.d(uiComponentConfig25, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.PrivacyPolicy");
                viewB = p4.b(n4Var, z5Var, (PrivacyPolicy) uiComponentConfig25);
            } else if (x5Var instanceof QRCodeComponent) {
                QRCodeComponent q4Var = (QRCodeComponent) x5Var;
                UiComponentConfig uiComponentConfig26 = componentNameToComponent.get(q4Var.getName());
                Intrinsics.d(uiComponentConfig26, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.QRCode");
                viewB = s4.b(q4Var, z5Var, (QRCode) uiComponentConfig26);
            } else if (x5Var instanceof RemoteImageComponent) {
                RemoteImageComponent t4Var = (RemoteImageComponent) x5Var;
                UiComponentConfig uiComponentConfig27 = componentNameToComponent.get(t4Var.getName());
                Intrinsics.d(uiComponentConfig27, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage");
                viewB = d5.n(t4Var, z5Var, (RemoteImage) uiComponentConfig27);
            } else if (x5Var instanceof SpacerComponent) {
                viewB = m5.b((SpacerComponent) x5Var, z5Var);
            } else if (x5Var instanceof TextComponent) {
                TextComponent r5Var = (TextComponent) x5Var;
                UiComponentConfig uiComponentConfig28 = componentNameToComponent.get(r5Var.getName());
                Intrinsics.d(uiComponentConfig28, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.Text");
                viewB = t5.b(r5Var, z5Var, (Text) uiComponentConfig28);
            } else if (x5Var instanceof TitleComponent) {
                TitleComponent u5Var = (TitleComponent) x5Var;
                UiComponentConfig uiComponentConfig29 = componentNameToComponent.get(u5Var.getName());
                Intrinsics.d(uiComponentConfig29, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.Title");
                viewB = w5.b(u5Var, z5Var, (Title) uiComponentConfig29);
            } else if (x5Var instanceof InputTextAreaComponent) {
                InputTextAreaComponent inputTextAreaComponent = (InputTextAreaComponent) x5Var;
                UiComponentConfig uiComponentConfig30 = componentNameToComponent.get(inputTextAreaComponent.getName());
                Intrinsics.d(uiComponentConfig30, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.InputTextArea");
                viewB = m2.b(inputTextAreaComponent, z5Var, (InputTextArea) uiComponentConfig30);
            } else if (x5Var instanceof BrandingComponent) {
                viewB = qr.h.b((BrandingComponent) x5Var, z5Var);
            } else if (x5Var instanceof CreatePersonaSheetComponent) {
                viewB = qr.r.a((CreatePersonaSheetComponent) x5Var, z5Var);
            } else {
                if (x5Var instanceof d6) {
                    d6 d6Var = (d6) x5Var;
                    UiComponentConfig uiComponentConfig31 = componentNameToComponent.get(d6Var.getName());
                    Intrinsics.d(uiComponentConfig31, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.VerifyPersonaButton");
                    viewB = e6.a(d6Var, z5Var, (VerifyPersonaButton) uiComponentConfig31);
                } else if (x5Var instanceof ClickableStackComponent) {
                    ClickableStackComponent clickableStackComponent = (ClickableStackComponent) x5Var;
                    list = componentViews;
                    List<View> listK = f28513a.k(clickableStackComponent.getChildren(), componentNameToComponent, context, isLoading, list, uiComponentHelper, minLeftPadding, minRightPadding);
                    z5Var = uiComponentHelper;
                    UiComponentConfig uiComponentConfig32 = componentNameToComponent.get(clickableStackComponent.getName());
                    Intrinsics.d(uiComponentConfig32, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.ClickableStack");
                    viewB = qr.m.b(clickableStackComponent, z5Var, list, listK, (ClickableStack) uiComponentConfig32);
                } else {
                    list = componentViews;
                    if (x5Var instanceof HorizontalStackComponent) {
                        HorizontalStackComponent i0Var = (HorizontalStackComponent) x5Var;
                        List<View> listK2 = f28513a.k(i0Var.getChildren(), componentNameToComponent, context, isLoading, list, uiComponentHelper, minLeftPadding, minRightPadding);
                        z5Var = uiComponentHelper;
                        UiComponentConfig uiComponentConfig33 = componentNameToComponent.get(i0Var.getName());
                        Intrinsics.d(uiComponentConfig33, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.HorizontalStack");
                        viewB = k0.b(i0Var, z5Var, list, listK2, (HorizontalStack) uiComponentConfig33);
                    } else if (x5Var instanceof FooterComponent) {
                        FooterComponent a0Var = (FooterComponent) x5Var;
                        List<View> listK3 = f28513a.k(a0Var.getChildren(), componentNameToComponent, context, isLoading, list, uiComponentHelper, minLeftPadding, minRightPadding);
                        UiComponentConfig uiComponentConfig34 = componentNameToComponent.get(a0Var.getName());
                        Intrinsics.d(uiComponentConfig34, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.Footer");
                        Footer footer = (Footer) uiComponentConfig34;
                        z5Var = uiComponentHelper;
                        viewB = b0.a(a0Var, z5Var, componentViews, listK3, footer, minLeftPadding, minRightPadding);
                        list = componentViews;
                    } else if (x5Var instanceof InputCurrencyComponent) {
                        InputCurrencyComponent inputCurrencyComponent = (InputCurrencyComponent) x5Var;
                        UiComponentConfig uiComponentConfig35 = componentNameToComponent.get(inputCurrencyComponent.getName());
                        Intrinsics.d(uiComponentConfig35, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.InputCurrency");
                        viewB = f1.b(inputCurrencyComponent, z5Var, (InputCurrency) uiComponentConfig35);
                    } else if (x5Var instanceof InputInternationalDbComponent) {
                        InputInternationalDbComponent bVar = (InputInternationalDbComponent) x5Var;
                        UiComponentConfig uiComponentConfig36 = componentNameToComponent.get(bVar.getName());
                        Intrinsics.d(uiComponentConfig36, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.InputInternationalDb");
                        viewB = com.withpersona.sdk2.inquiry.steps.ui.components.c.j(bVar, z5Var, (InputInternationalDb) uiComponentConfig36);
                    } else if (x5Var instanceof MdocComponent) {
                        MdocComponent fVar = (MdocComponent) x5Var;
                        UiComponentConfig uiComponentConfig37 = componentNameToComponent.get(fVar.getName());
                        Intrinsics.d(uiComponentConfig37, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.Mdoc");
                        viewB = i4.b(fVar, z5Var, (Mdoc) uiComponentConfig37);
                    } else {
                        if (!(x5Var instanceof PhoneNumberSnaComponent) && !(x5Var instanceof g0)) {
                            throw new zt.l();
                        }
                        viewB = null;
                    }
                }
                if (viewB != null) {
                    list.add(new ComponentView(x5Var, viewB));
                }
                if (viewB != null) {
                    arrayList.add(viewB);
                }
            }
            list = componentViews;
            if (viewB != null) {
                list.add(new ComponentView(x5Var, viewB));
            }
            if (viewB != null) {
                arrayList.add(viewB);
            }
        }
        return arrayList;
    }

    @NotNull
    public final j l(@NotNull br.b binding, @NotNull UiComponentScreen uiScreen, @Nullable Function2<? super br.b, ? super Map<String, ComponentView>, Unit> initialRendering, boolean shouldApplyFocus) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(uiScreen, "uiScreen");
        Context context = binding.getRoot().getContext();
        Intrinsics.checkNotNull(context);
        j jVarH = h(this, context, uiScreen, false, shouldApplyFocus, false, 16, null);
        if (uiScreen.k() == StyleElements.PositionType.CENTER) {
            binding.f4559c.setFillViewport(true);
            jVarH.getContentView().setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            View viewA = jVarH.getContentView();
            ViewGroup.LayoutParams layoutParams = viewA.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.gravity = 16;
            viewA.setLayoutParams(layoutParams2);
        }
        binding.b.addView(jVarH.getContentView());
        ConstraintLayout constraintLayoutB = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutB, "getRoot(...)");
        kr.g.d(constraintLayoutB, false, false, false, false, 13, null);
        if (jVarH.getFooterView() != null) {
            binding.f4560d.addView(jVarH.getFooterView());
            kr.g.d(jVarH.getFooterView(), false, false, false, false, 2, null);
        }
        if (initialRendering != null) {
            initialRendering.invoke(binding, jVarH.getViewBindings().a());
        }
        Integer numJ = uiScreen.j();
        if (numJ != null) {
            binding.f4561e.setControlsColor(numJ.intValue());
        }
        return jVarH;
    }
}
