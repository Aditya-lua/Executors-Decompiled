package ar;

import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.C0518c;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.ActionButton;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.CancelButton;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.ClickableStack;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.CombinedStepButton;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.CombinedStepImagePreview;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.CompleteButton;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.ESignature;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.Footer;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.GovernmentIdNfcScan;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.HorizontalStack;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.InputAddress;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.InputCheckbox;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.InputCheckboxGroup;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.InputConfirmationCode;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.InputCurrency;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.InputDate;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.InputFileUpload;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.InputInternationalDb;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.InputMaskedText;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.InputMultiSelect;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.InputNumber;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.InputPhoneNumber;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.InputRadioGroup;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.InputSelect;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.InputText;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.InputTextArea;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.JpMyNumberNfcScan;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.LinkButton;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.LocalImage;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.Mdoc;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.PrivacyPolicy;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.QRCode;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.SubmitButton;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.Text;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.Title;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.VerifyPersonaButton;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.steps.p056ui.UiComponentScreen;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.ActionButtonComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.BrandingComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.C4085a;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.C4086b;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.CancelButtonComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.ClickableStackComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.CombinedStepButtonComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.CompleteButtonComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.CreatePersonaSheetComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.ESignatureComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.FooterComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.GovernmentIdNfcScanComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.HelpBottomSheetComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.HorizontalStackComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.ImagePreviewComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.InputAddressComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.InputCheckboxComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.InputCheckboxGroupComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.InputConfirmationCodeComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.InputCurrencyComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.InputDateComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.InputFileUploadComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.InputInternationalDbComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.InputMaskedTextComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.InputMultiSelectComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.InputNumberComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.InputPhoneNumberComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.InputRadioGroupComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.InputSelectComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.InputTextAreaComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.InputTextComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.JpMyNumberNfcScanComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.LinkButtonComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.LocalImageComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.MdocComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.PhoneNumberSnaComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.PrivacyPolicyComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.QRCodeComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.RemoteImageComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.SpacerComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.SubmitButtonComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.TextComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.TitleComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.UiComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.VerifyPersonaButtonComponent;
import cr.C4200a;
import cr.C4203a2;
import cr.C4205a4;
import cr.C4208b0;
import cr.C4217c2;
import cr.C4220c5;
import cr.C4227e;
import cr.C4228e0;
import cr.C4230e2;
import cr.C4233f;
import cr.C4242g2;
import cr.C4245h;
import cr.C4251i;
import cr.C4252i0;
import cr.C4253i1;
import cr.C4257j;
import cr.C4263k;
import cr.C4265k1;
import cr.C4268k4;
import cr.C4270l0;
import cr.C4277m1;
import cr.C4295p1;
import cr.C4297p3;
import cr.C4299q;
import cr.C4304q4;
import cr.C4306r0;
import cr.C4311s;
import cr.C4318t0;
import cr.C4322t4;
import cr.C4327u3;
import cr.C4329v;
import cr.C4330v0;
import cr.C4331v1;
import cr.C4334v4;
import cr.C4346x4;
import cr.C4348y0;
import cr.C4349y1;
import cr.C4351y3;
import cr.C4352y4;
import cr.C4353z;
import gr.C6232t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7697o;
import kotlin.collections.C7699p;
import kotlin.collections.C7701q;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p226jq.C7259g;
import p226jq.C7265j;
import p229jt.C7345l;
import p313nq.C9546b;
import p526wq.C12524g;
import p526wq.C12543z;

/* JADX INFO: renamed from: ar.s */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JU\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042$\u0010\f\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t0\u00070\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0011\u0010\u0012JM\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042&\u0010\u0018\u001a\"\u0012\u0004\u0012\u00020\u0013\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00152\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ7\u0010\"\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\"\u0010#J\u0015\u0010&\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'JU\u0010-\u001a\u00020,2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00192\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00170(2\u0006\u0010+\u001a\u00020*2\u0006\u0010!\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b-\u0010.Jg\u00106\u001a\u00020,2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u00100\u001a\u00020/2\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u0002010\u00162\u0006\u0010 \u001a\u00020\u00192\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00170(2\u0006\u0010+\u001a\u00020*2\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u000203H\u0002¢\u0006\u0004\b6\u00107Jm\u0010;\u001a\b\u0012\u0004\u0012\u00020,0\u00062\f\u00108\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u0002010\u00162\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u00192\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0017092\u0006\u0010+\u001a\u00020*2\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u000203H\u0002¢\u0006\u0004\b;\u0010<¨\u0006="}, m31665d2 = {"Lar/s;", "", "<init>", "()V", "Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;", "uiScreen", "", "Lkotlin/Pair;", "", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "", "componentNamesToActions", "Lkotlin/Function0;", "onCancelled", "cancelButtonName", "Lar/p;", "j", "(Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;Ljava/util/List;Lkotlin/jvm/functions/Function0;Ljava/lang/String;)Lar/p;", "Lnq/b;", "binding", "Lkotlin/Function2;", "", "Lar/a;", "initialRendering", "", "shouldApplyFocus", "Lar/g;", "l", "(Lnq/b;Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;Lkotlin/jvm/functions/Function2;Z)Lar/g;", "Landroid/content/Context;", "context", "isLoading", "isModal", "g", "(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;ZZZ)Lar/g;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "parentView", "c", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "", "viewBindings", "Lcr/y4;", "uiComponentHelper", "Landroid/view/View;", "f", "(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;ZLjava/util/Map;Lcr/y4;ZZ)Landroid/view/View;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/FooterComponent;", "component", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "componentNameToComponent", "", "minLeftPadding", "minRightPadding", "e", "(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/steps/ui/components/FooterComponent;Ljava/util/Map;ZLjava/util/Map;Lcr/y4;II)Landroid/view/View;", "components", "", "componentViews", "k", "(Ljava/util/List;Ljava/util/Map;Landroid/content/Context;ZLjava/util/List;Lcr/y4;II)Ljava/util/List;", "ui-step-renderer_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C1164s {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C1164s f4917a = new C1164s();

    /* JADX INFO: renamed from: d */
    public static final void m6521d(View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(view, 1);
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ C1152g m6522h(C1164s c1164s, Context context, UiComponentScreen uiComponentScreen, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            z12 = true;
        }
        return c1164s.m6527g(context, uiComponentScreen, z10, z11, z12);
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m6523i(C4352y4 c4352y4) {
        c4352y4.m22001c();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: c */
    public final void m6524c(@NotNull ConstraintLayout parentView) {
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
            if ((view2 instanceof EditText) && ((text = ((EditText) view2).getText()) == null || StringsKt.m32182p0(text))) {
                break;
            }
        }
        final View view3 = view;
        if (view3 != null) {
            view3.requestFocus();
            view3.post(new Runnable() { // from class: ar.r
                @Override // java.lang.Runnable
                public final void run() {
                    C1164s.m6521d(view3);
                }
            });
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r14v0, resolved type: java.util.Map<java.lang.String, ar.a> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public final View m6525e(Context context, FooterComponent component, Map<String, ? extends UiComponentConfig> componentNameToComponent, boolean isLoading, Map<String, ComponentView> viewBindings, C4352y4 uiComponentHelper, int minLeftPadding, int minRightPadding) {
        ArrayList arrayList = new ArrayList();
        List<View> listM6529k = m6529k(C7697o.m31878d(component), componentNameToComponent, context, isLoading, arrayList, uiComponentHelper, minLeftPadding, minRightPadding);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            viewBindings.put(((ComponentView) obj).m6490c().getName(), obj);
        }
        return (View) CollectionsKt.m31706d0(listM6529k);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r29v0, resolved type: java.util.Map<java.lang.String, ar.a> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public final View m6526f(Context context, UiComponentScreen uiScreen, boolean isLoading, Map<String, ComponentView> viewBindings, C4352y4 uiComponentHelper, boolean isModal, boolean shouldApplyFocus) {
        List<? extends UiComponent> listM31892k;
        int i10;
        C0518c c0518c;
        ComponentView componentView;
        View viewM6491d;
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
        C6232t c6232tM27416c = C6232t.m27416c(uiComponentHelper.getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(c6232tM27416c, "inflate(...)");
        ConstraintLayout constraintLayoutM27418b = c6232tM27416c.getRoot();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutM27418b, "getRoot(...)");
        List<UiComponent> components = uiScreen.getComponents();
        if (components != null) {
            listM31892k = new ArrayList<>();
            for (Object obj : components) {
                if (!(((UiComponent) obj) instanceof FooterComponent)) {
                    listM31892k.add(obj);
                }
            }
        } else {
            listM31892k = C7699p.m31892k();
        }
        List<? extends UiComponent> list = listM31892k;
        ArrayList arrayList = new ArrayList();
        Map<String, ? extends UiComponentConfig> mapM20893j = C4086b.m20893j(uiScreen.m20523W0());
        StepStyles.UiStepStyle styles = uiScreen.getStyles();
        int iM30285a = (int) ((styles == null || (padding2 = styles.getPadding()) == null || (screen2 = padding2.getScreen()) == null || (base2 = screen2.getBase()) == null || (left = base2.getLeft()) == null || (dp3 = left.getDp()) == null) ? C7265j.m30285a(24.0d) : C7265j.m30285a(dp3.doubleValue()));
        StepStyles.UiStepStyle styles2 = uiScreen.getStyles();
        List<View> listM6529k = m6529k(list, mapM20893j, context, isLoading, arrayList, uiComponentHelper, iM30285a, (int) ((styles2 == null || (padding = styles2.getPadding()) == null || (screen = padding.getScreen()) == null || (base = screen.getBase()) == null || (right = base.getRight()) == null || (dp2 = right.getDp()) == null) ? C7265j.m30285a(24.0d) : C7265j.m30285a(dp2.doubleValue())));
        C0518c c0518c2 = new C0518c();
        c0518c2.m2509f(constraintLayoutM27418b);
        Iterator<View> it = listM6529k.iterator();
        while (true) {
            i10 = 0;
            if (!it.hasNext()) {
                break;
            }
            View next = it.next();
            next.setId(View.generateViewId());
            next.setSaveEnabled(false);
            constraintLayoutM27418b.addView(next);
            c0518c2.m2511h(next.getId(), 6, 0, 6);
            c0518c2.m2511h(next.getId(), 7, 0, 7);
            c0518c2.m2515l(next.getId(), -2);
            c0518c2.m2514k(next.getId(), 0);
            c0518c2.m2503F(next.getId(), 0.5f);
        }
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj2 = arrayList.get(i11);
            i11++;
            viewBindings.put(((ComponentView) obj2).m6490c().getName(), obj2);
        }
        if (listM6529k.size() > 1) {
            List<View> list2 = listM6529k;
            ArrayList arrayList2 = new ArrayList(C7701q.m31905u(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Integer.valueOf(((View) it2.next()).getId()));
            }
            c0518c2.m2520q(0, 3, 0, 4, CollectionsKt.m31686L0(arrayList2), null, 3);
            c0518c = c0518c2;
            if (uiScreen.getStyles() == null) {
                for (UiComponent uiComponent : list) {
                    int i12 = i10 + 1;
                    if (!(uiComponent instanceof SpacerComponent) && (componentView = (ComponentView) viewBindings.get(uiComponent.getName())) != null && (viewM6491d = componentView.m6491d()) != null && i10 != C7699p.m31894m(list)) {
                        c0518c.m2502E(viewM6491d.getId(), 4, (int) C7265j.m30285a(16.0d));
                    }
                    i10 = i12;
                }
            }
        } else {
            c0518c = c0518c2;
        }
        if (!isModal) {
            constraintLayoutM27418b.setPadding(constraintLayoutM27418b.getPaddingLeft(), constraintLayoutM27418b.getPaddingTop(), constraintLayoutM27418b.getPaddingRight(), (int) C7265j.m30285a(24.0d));
        }
        c0518c.m2506c(constraintLayoutM27418b);
        Context context2 = c6232tM27416c.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        if (!C7259g.m30273g(context2) && shouldApplyFocus) {
            m6524c(constraintLayoutM27418b);
        }
        ConstraintLayout constraintLayoutM27418b2 = c6232tM27416c.getRoot();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutM27418b2, "getRoot(...)");
        return constraintLayoutM27418b2;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final C1152g m6527g(@NotNull Context context, @NotNull UiComponentScreen uiScreen, boolean isLoading, boolean isModal, boolean shouldApplyFocus) {
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
        final C4352y4 c4352y4 = new C4352y4(context);
        View viewM6526f = m6526f(context, uiScreen, isLoading, linkedHashMap, c4352y4, isModal, shouldApplyFocus);
        List<UiComponent> components = uiScreen.getComponents();
        View viewM6525e = null;
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
            Map<String, UiComponentConfig> mapM20893j = C4086b.m20893j(uiScreen.m20523W0());
            StepStyles.UiStepStyle styles = uiScreen.getStyles();
            int iM30285a = (int) ((styles == null || (padding2 = styles.getPadding()) == null || (screen2 = padding2.getScreen()) == null || (base2 = screen2.getBase()) == null || (left = base2.getLeft()) == null || (dp3 = left.getDp()) == null) ? C7265j.m30285a(24.0d) : C7265j.m30285a(dp3.doubleValue()));
            StepStyles.UiStepStyle styles2 = uiScreen.getStyles();
            viewM6525e = m6525e(context, footerComponent, mapM20893j, isLoading, linkedHashMap, c4352y4, iM30285a, (int) ((styles2 == null || (padding = styles2.getPadding()) == null || (screen = padding.getScreen()) == null || (base = screen.getBase()) == null || (right = base.getRight()) == null || (dp2 = right.getDp()) == null) ? C7265j.m30285a(24.0d) : C7265j.m30285a(dp2.doubleValue())));
            linkedHashMap = linkedHashMap;
            c4352y4 = c4352y4;
        }
        C12543z.m46890b(viewM6526f, new Function0() { // from class: ar.q
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C1164s.m6523i(c4352y4);
            }
        });
        return new C1152g(new C1153h(linkedHashMap), viewM6526f, viewM6525e);
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final UiStepBottomSheet m6528j(@NotNull UiComponentScreen uiScreen, @NotNull List<? extends Pair<String, ? extends Function1<? super UiComponent, Unit>>> componentNamesToActions, @NotNull Function0<Unit> onCancelled, @Nullable String cancelButtonName) {
        Intrinsics.checkNotNullParameter(uiScreen, "uiScreen");
        Intrinsics.checkNotNullParameter(componentNamesToActions, "componentNamesToActions");
        Intrinsics.checkNotNullParameter(onCancelled, "onCancelled");
        return new UiStepBottomSheet(uiScreen, componentNamesToActions, onCancelled, cancelButtonName, false, 16, null);
    }

    /* JADX DEBUG: Class process forced to load method for inline: cr.c2.c(com.withpersona.sdk2.inquiry.steps.ui.components.InputTextComponent, cr.y4, com.withpersona.sdk2.inquiry.network.dto.ui.components.InputText, an.r, int, java.lang.Object):com.google.android.material.textfield.TextInputLayout */
    /* JADX DEBUG: Class process forced to load method for inline: cr.v0.c(com.withpersona.sdk2.inquiry.steps.ui.components.InputDateComponent, cr.y4, er.g, com.withpersona.sdk2.inquiry.network.dto.ui.components.InputDate, int, java.lang.Object):androidx.constraintlayout.widget.ConstraintLayout */
    /* JADX WARN: Code duplicated, block: B:133:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:141:0x04b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x000d A[SYNTHETIC] */
    /* JADX INFO: renamed from: k */
    public final List<View> m6529k(List<? extends UiComponent> components, Map<String, ? extends UiComponentConfig> componentNameToComponent, Context context, boolean isLoading, List<ComponentView> componentViews, C4352y4 uiComponentHelper, int minLeftPadding, int minRightPadding) {
        List<ComponentView> list;
        View viewM21950b;
        C4352y4 c4352y4 = uiComponentHelper;
        ArrayList arrayList = new ArrayList();
        for (UiComponent uiComponent : components) {
            if (uiComponent instanceof ActionButtonComponent) {
                ActionButtonComponent actionButtonComponent = (ActionButtonComponent) uiComponent;
                UiComponentConfig uiComponentConfig = componentNameToComponent.get(actionButtonComponent.getName());
                Intrinsics.m31981d(uiComponentConfig, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.ActionButton");
                viewM21950b = C4200a.m21728a(actionButtonComponent, c4352y4, (ActionButton) uiComponentConfig);
            } else if (uiComponent instanceof CancelButtonComponent) {
                CancelButtonComponent cancelButtonComponent = (CancelButtonComponent) uiComponent;
                UiComponentConfig uiComponentConfig2 = componentNameToComponent.get(cancelButtonComponent.getName());
                Intrinsics.m31981d(uiComponentConfig2, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.CancelButton");
                viewM21950b = C4233f.m21762a(cancelButtonComponent, c4352y4, (CancelButton) uiComponentConfig2);
            } else if (uiComponent instanceof CombinedStepButtonComponent) {
                CombinedStepButtonComponent combinedStepButtonComponent = (CombinedStepButtonComponent) uiComponent;
                UiComponentConfig uiComponentConfig3 = componentNameToComponent.get(combinedStepButtonComponent.getName());
                Intrinsics.m31981d(uiComponentConfig3, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.CombinedStepButton");
                viewM21950b = C4251i.m21769a(combinedStepButtonComponent, c4352y4, (CombinedStepButton) uiComponentConfig3);
            } else if (uiComponent instanceof CompleteButtonComponent) {
                CompleteButtonComponent completeButtonComponent = (CompleteButtonComponent) uiComponent;
                UiComponentConfig uiComponentConfig4 = componentNameToComponent.get(completeButtonComponent.getName());
                Intrinsics.m31981d(uiComponentConfig4, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.CompleteButton");
                viewM21950b = C4257j.m21788a(completeButtonComponent, c4352y4, (CompleteButton) uiComponentConfig4);
            } else if (uiComponent instanceof LinkButtonComponent) {
                LinkButtonComponent linkButtonComponent = (LinkButtonComponent) uiComponent;
                UiComponentConfig uiComponentConfig5 = componentNameToComponent.get(linkButtonComponent.getName());
                Intrinsics.m31981d(uiComponentConfig5, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.LinkButton");
                viewM21950b = C4242g2.m21765a(linkButtonComponent, c4352y4, (LinkButton) uiComponentConfig5);
            } else if (uiComponent instanceof SubmitButtonComponent) {
                SubmitButtonComponent submitButtonComponent = (SubmitButtonComponent) uiComponent;
                UiComponentConfig uiComponentConfig6 = componentNameToComponent.get(submitButtonComponent.getName());
                Intrinsics.m31981d(uiComponentConfig6, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.SubmitButton");
                viewM21950b = C4322t4.m21948a(submitButtonComponent, c4352y4, (SubmitButton) uiComponentConfig6);
            } else if (uiComponent instanceof ESignatureComponent) {
                ESignatureComponent eSignatureComponent = (ESignatureComponent) uiComponent;
                UiComponentConfig uiComponentConfig7 = componentNameToComponent.get(eSignatureComponent.getName());
                Intrinsics.m31981d(uiComponentConfig7, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.ESignature");
                viewM21950b = C4299q.m21910c(eSignatureComponent, c4352y4, (ESignature) uiComponentConfig7);
            } else if (uiComponent instanceof GovernmentIdNfcScanComponent) {
                GovernmentIdNfcScanComponent governmentIdNfcScanComponent = (GovernmentIdNfcScanComponent) uiComponent;
                UiComponentConfig uiComponentConfig8 = componentNameToComponent.get(governmentIdNfcScanComponent.getName());
                Intrinsics.m31981d(uiComponentConfig8, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.GovernmentIdNfcScan");
                viewM21950b = C4329v.m21954c(governmentIdNfcScanComponent, c4352y4, (GovernmentIdNfcScan) uiComponentConfig8);
            } else if (uiComponent instanceof JpMyNumberNfcScanComponent) {
                JpMyNumberNfcScanComponent jpMyNumberNfcScanComponent = (JpMyNumberNfcScanComponent) uiComponent;
                UiComponentConfig uiComponentConfig9 = componentNameToComponent.get(jpMyNumberNfcScanComponent.getName());
                Intrinsics.m31981d(uiComponentConfig9, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.JpMyNumberNfcScan");
                viewM21950b = C4230e2.m21760b(jpMyNumberNfcScanComponent, c4352y4, (JpMyNumberNfcScan) uiComponentConfig9);
            } else if (uiComponent instanceof ImagePreviewComponent) {
                ImagePreviewComponent imagePreviewComponent = (ImagePreviewComponent) uiComponent;
                UiComponentConfig uiComponentConfig10 = componentNameToComponent.get(imagePreviewComponent.getName());
                Intrinsics.m31981d(uiComponentConfig10, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.CombinedStepImagePreview");
                viewM21950b = C4208b0.m21737b(imagePreviewComponent, c4352y4, (CombinedStepImagePreview) uiComponentConfig10);
            } else if (uiComponent instanceof InputAddressComponent) {
                InputAddressComponent inputAddressComponent = (InputAddressComponent) uiComponent;
                UiComponentConfig uiComponentConfig11 = componentNameToComponent.get(inputAddressComponent.getName());
                Intrinsics.m31981d(uiComponentConfig11, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.InputAddress");
                viewM21950b = C4228e0.m21756g(inputAddressComponent, c4352y4, (InputAddress) uiComponentConfig11);
            } else if (uiComponent instanceof InputCheckboxComponent) {
                InputCheckboxComponent inputCheckboxComponent = (InputCheckboxComponent) uiComponent;
                UiComponentConfig uiComponentConfig12 = componentNameToComponent.get(inputCheckboxComponent.getName());
                Intrinsics.m31981d(uiComponentConfig12, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.InputCheckbox");
                viewM21950b = C4252i0.m21773d(inputCheckboxComponent, c4352y4, (InputCheckbox) uiComponentConfig12);
            } else if (uiComponent instanceof InputCheckboxGroupComponent) {
                InputCheckboxGroupComponent inputCheckboxGroupComponent = (InputCheckboxGroupComponent) uiComponent;
                UiComponentConfig uiComponentConfig13 = componentNameToComponent.get(inputCheckboxGroupComponent.getName());
                Intrinsics.m31981d(uiComponentConfig13, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.InputCheckboxGroup");
                viewM21950b = C4270l0.m21822c(inputCheckboxGroupComponent, c4352y4, (InputCheckboxGroup) uiComponentConfig13);
            } else if (uiComponent instanceof InputConfirmationCodeComponent) {
                InputConfirmationCodeComponent inputConfirmationCodeComponent = (InputConfirmationCodeComponent) uiComponent;
                UiComponentConfig uiComponentConfig14 = componentNameToComponent.get(inputConfirmationCodeComponent.getName());
                Intrinsics.m31981d(uiComponentConfig14, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.InputConfirmationCode");
                viewM21950b = C4306r0.m21926f(inputConfirmationCodeComponent, c4352y4, (InputConfirmationCode) uiComponentConfig14);
            } else if (uiComponent instanceof InputDateComponent) {
                InputDateComponent inputDateComponent = (InputDateComponent) uiComponent;
                UiComponentConfig uiComponentConfig15 = componentNameToComponent.get(inputDateComponent.getName());
                Intrinsics.m31981d(uiComponentConfig15, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.InputDate");
                viewM21950b = C4330v0.m21959c(inputDateComponent, c4352y4, null, (InputDate) uiComponentConfig15, 2, null);
            } else if (uiComponent instanceof InputFileUploadComponent) {
                InputFileUploadComponent inputFileUploadComponent = (InputFileUploadComponent) uiComponent;
                UiComponentConfig uiComponentConfig16 = componentNameToComponent.get(inputFileUploadComponent.getName());
                Intrinsics.m31981d(uiComponentConfig16, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.InputFileUpload");
                viewM21950b = C4348y0.m21990c(inputFileUploadComponent, c4352y4, (InputFileUpload) uiComponentConfig16);
            } else if (uiComponent instanceof InputMaskedTextComponent) {
                InputMaskedTextComponent inputMaskedTextComponent = (InputMaskedTextComponent) uiComponent;
                UiComponentConfig uiComponentConfig17 = componentNameToComponent.get(inputMaskedTextComponent.getName());
                Intrinsics.m31981d(uiComponentConfig17, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.InputMaskedText");
                viewM21950b = C4253i1.m21785h(inputMaskedTextComponent, c4352y4, (InputMaskedText) uiComponentConfig17);
            } else if (uiComponent instanceof InputMultiSelectComponent) {
                InputMultiSelectComponent inputMultiSelectComponent = (InputMultiSelectComponent) uiComponent;
                UiComponentConfig uiComponentConfig18 = componentNameToComponent.get(inputMultiSelectComponent.getName());
                Intrinsics.m31981d(uiComponentConfig18, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.InputMultiSelect");
                viewM21950b = C4265k1.m21792b(inputMultiSelectComponent, c4352y4, (InputMultiSelect) uiComponentConfig18);
            } else if (uiComponent instanceof InputNumberComponent) {
                InputNumberComponent inputNumberComponent = (InputNumberComponent) uiComponent;
                UiComponentConfig uiComponentConfig19 = componentNameToComponent.get(inputNumberComponent.getName());
                Intrinsics.m31981d(uiComponentConfig19, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.InputNumber");
                viewM21950b = C4277m1.m21829b(inputNumberComponent, c4352y4, (InputNumber) uiComponentConfig19);
            } else if (uiComponent instanceof InputPhoneNumberComponent) {
                InputPhoneNumberComponent inputPhoneNumberComponent = (InputPhoneNumberComponent) uiComponent;
                UiComponentConfig uiComponentConfig20 = componentNameToComponent.get(inputPhoneNumberComponent.getName());
                Intrinsics.m31981d(uiComponentConfig20, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.InputPhoneNumber");
                viewM21950b = C4295p1.m21836c(inputPhoneNumberComponent, c4352y4, (InputPhoneNumber) uiComponentConfig20);
            } else if (uiComponent instanceof InputRadioGroupComponent) {
                InputRadioGroupComponent inputRadioGroupComponent = (InputRadioGroupComponent) uiComponent;
                UiComponentConfig uiComponentConfig21 = componentNameToComponent.get(inputRadioGroupComponent.getName());
                Intrinsics.m31981d(uiComponentConfig21, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.InputRadioGroup");
                viewM21950b = C4331v1.m21966f(inputRadioGroupComponent, c4352y4, (InputRadioGroup) uiComponentConfig21);
            } else if (uiComponent instanceof InputSelectComponent) {
                InputSelectComponent inputSelectComponent = (InputSelectComponent) uiComponent;
                UiComponentConfig uiComponentConfig22 = componentNameToComponent.get(inputSelectComponent.getName());
                Intrinsics.m31981d(uiComponentConfig22, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.InputSelect");
                viewM21950b = C4349y1.m21994b(inputSelectComponent, c4352y4, (InputSelect) uiComponentConfig22);
            } else if (uiComponent instanceof InputTextComponent) {
                InputTextComponent inputTextComponent = (InputTextComponent) uiComponent;
                UiComponentConfig uiComponentConfig23 = componentNameToComponent.get(inputTextComponent.getName());
                Intrinsics.m31981d(uiComponentConfig23, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.InputText");
                viewM21950b = C4217c2.m21742c(inputTextComponent, c4352y4, (InputText) uiComponentConfig23, null, 4, null);
            } else if (uiComponent instanceof LocalImageComponent) {
                LocalImageComponent localImageComponent = (LocalImageComponent) uiComponent;
                UiComponentConfig uiComponentConfig24 = componentNameToComponent.get(localImageComponent.getName());
                Intrinsics.m31981d(uiComponentConfig24, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.LocalImage");
                viewM21950b = C4297p3.m21850K(localImageComponent, c4352y4, (LocalImage) uiComponentConfig24);
            } else if (uiComponent instanceof PrivacyPolicyComponent) {
                PrivacyPolicyComponent privacyPolicyComponent = (PrivacyPolicyComponent) uiComponent;
                UiComponentConfig uiComponentConfig25 = componentNameToComponent.get(privacyPolicyComponent.getName());
                Intrinsics.m31981d(uiComponentConfig25, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.PrivacyPolicy");
                viewM21950b = C4351y3.m21997b(privacyPolicyComponent, c4352y4, (PrivacyPolicy) uiComponentConfig25);
            } else if (uiComponent instanceof QRCodeComponent) {
                QRCodeComponent qRCodeComponent = (QRCodeComponent) uiComponent;
                UiComponentConfig uiComponentConfig26 = componentNameToComponent.get(qRCodeComponent.getName());
                Intrinsics.m31981d(uiComponentConfig26, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.QRCode");
                viewM21950b = C4205a4.m21734b(qRCodeComponent, c4352y4, (QRCode) uiComponentConfig26);
            } else if (uiComponent instanceof RemoteImageComponent) {
                RemoteImageComponent remoteImageComponent = (RemoteImageComponent) uiComponent;
                UiComponentConfig uiComponentConfig27 = componentNameToComponent.get(remoteImageComponent.getName());
                Intrinsics.m31981d(uiComponentConfig27, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage");
                viewM21950b = C4268k4.m21807n(remoteImageComponent, c4352y4, (RemoteImage) uiComponentConfig27);
            } else if (uiComponent instanceof SpacerComponent) {
                viewM21950b = C4304q4.m21916b((SpacerComponent) uiComponent, c4352y4);
            } else if (uiComponent instanceof TextComponent) {
                TextComponent textComponent = (TextComponent) uiComponent;
                UiComponentConfig uiComponentConfig28 = componentNameToComponent.get(textComponent.getName());
                Intrinsics.m31981d(uiComponentConfig28, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.Text");
                viewM21950b = C4334v4.m21976b(textComponent, c4352y4, (Text) uiComponentConfig28);
            } else if (uiComponent instanceof TitleComponent) {
                TitleComponent titleComponent = (TitleComponent) uiComponent;
                UiComponentConfig uiComponentConfig29 = componentNameToComponent.get(titleComponent.getName());
                Intrinsics.m31981d(uiComponentConfig29, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.Title");
                viewM21950b = C4346x4.m21986b(titleComponent, c4352y4, (Title) uiComponentConfig29);
            } else if (uiComponent instanceof InputTextAreaComponent) {
                InputTextAreaComponent inputTextAreaComponent = (InputTextAreaComponent) uiComponent;
                UiComponentConfig uiComponentConfig30 = componentNameToComponent.get(inputTextAreaComponent.getName());
                Intrinsics.m31981d(uiComponentConfig30, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.InputTextArea");
                viewM21950b = C4203a2.m21730b(inputTextAreaComponent, c4352y4, (InputTextArea) uiComponentConfig30);
            } else if (uiComponent instanceof BrandingComponent) {
                viewM21950b = C4227e.m21748b((BrandingComponent) uiComponent, c4352y4);
            } else if (uiComponent instanceof CreatePersonaSheetComponent) {
                viewM21950b = C4263k.m21789a((CreatePersonaSheetComponent) uiComponent, c4352y4);
            } else {
                if (uiComponent instanceof VerifyPersonaButtonComponent) {
                    VerifyPersonaButtonComponent verifyPersonaButtonComponent = (VerifyPersonaButtonComponent) uiComponent;
                    UiComponentConfig uiComponentConfig31 = componentNameToComponent.get(verifyPersonaButtonComponent.getName());
                    Intrinsics.m31981d(uiComponentConfig31, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.VerifyPersonaButton");
                    viewM21950b = C4220c5.m21746a(verifyPersonaButtonComponent, c4352y4, (VerifyPersonaButton) uiComponentConfig31);
                } else if (uiComponent instanceof ClickableStackComponent) {
                    ClickableStackComponent clickableStackComponent = (ClickableStackComponent) uiComponent;
                    list = componentViews;
                    List<View> listM6529k = f4917a.m6529k(clickableStackComponent.getChildren(), componentNameToComponent, context, isLoading, list, uiComponentHelper, minLeftPadding, minRightPadding);
                    c4352y4 = uiComponentHelper;
                    UiComponentConfig uiComponentConfig32 = componentNameToComponent.get(clickableStackComponent.getName());
                    Intrinsics.m31981d(uiComponentConfig32, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.ClickableStack");
                    viewM21950b = C4245h.m21767b(clickableStackComponent, c4352y4, list, listM6529k, (ClickableStack) uiComponentConfig32);
                } else {
                    list = componentViews;
                    if (uiComponent instanceof HorizontalStackComponent) {
                        HorizontalStackComponent horizontalStackComponent = (HorizontalStackComponent) uiComponent;
                        List<View> listM6529k2 = f4917a.m6529k(horizontalStackComponent.getChildren(), componentNameToComponent, context, isLoading, list, uiComponentHelper, minLeftPadding, minRightPadding);
                        c4352y4 = uiComponentHelper;
                        UiComponentConfig uiComponentConfig33 = componentNameToComponent.get(horizontalStackComponent.getName());
                        Intrinsics.m31981d(uiComponentConfig33, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.HorizontalStack");
                        viewM21950b = C4353z.m22004b(horizontalStackComponent, c4352y4, list, listM6529k2, (HorizontalStack) uiComponentConfig33);
                    } else if (uiComponent instanceof FooterComponent) {
                        FooterComponent footerComponent = (FooterComponent) uiComponent;
                        List<View> listM6529k3 = f4917a.m6529k(footerComponent.getChildren(), componentNameToComponent, context, isLoading, list, uiComponentHelper, minLeftPadding, minRightPadding);
                        UiComponentConfig uiComponentConfig34 = componentNameToComponent.get(footerComponent.getName());
                        Intrinsics.m31981d(uiComponentConfig34, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.Footer");
                        Footer footer = (Footer) uiComponentConfig34;
                        c4352y4 = uiComponentHelper;
                        viewM21950b = C4311s.m21944a(footerComponent, c4352y4, componentViews, listM6529k3, footer, minLeftPadding, minRightPadding);
                        list = componentViews;
                    } else if (uiComponent instanceof InputCurrencyComponent) {
                        InputCurrencyComponent inputCurrencyComponent = (InputCurrencyComponent) uiComponent;
                        UiComponentConfig uiComponentConfig35 = componentNameToComponent.get(inputCurrencyComponent.getName());
                        Intrinsics.m31981d(uiComponentConfig35, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.InputCurrency");
                        viewM21950b = C4318t0.m21946b(inputCurrencyComponent, c4352y4, (InputCurrency) uiComponentConfig35);
                    } else if (uiComponent instanceof InputInternationalDbComponent) {
                        InputInternationalDbComponent inputInternationalDbComponent = (InputInternationalDbComponent) uiComponent;
                        UiComponentConfig uiComponentConfig36 = componentNameToComponent.get(inputInternationalDbComponent.getName());
                        Intrinsics.m31981d(uiComponentConfig36, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.InputInternationalDb");
                        viewM21950b = C4085a.m20873j(inputInternationalDbComponent, c4352y4, (InputInternationalDb) uiComponentConfig36);
                    } else if (uiComponent instanceof MdocComponent) {
                        MdocComponent mdocComponent = (MdocComponent) uiComponent;
                        UiComponentConfig uiComponentConfig37 = componentNameToComponent.get(mdocComponent.getName());
                        Intrinsics.m31981d(uiComponentConfig37, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.Mdoc");
                        viewM21950b = C4327u3.m21950b(mdocComponent, c4352y4, (Mdoc) uiComponentConfig37);
                    } else {
                        if (!(uiComponent instanceof PhoneNumberSnaComponent) && !(uiComponent instanceof HelpBottomSheetComponent)) {
                            throw new C7345l();
                        }
                        viewM21950b = null;
                    }
                }
                if (viewM21950b != null) {
                    list.add(new ComponentView(uiComponent, viewM21950b));
                }
                if (viewM21950b != null) {
                    arrayList.add(viewM21950b);
                }
            }
            list = componentViews;
            if (viewM21950b != null) {
                list.add(new ComponentView(uiComponent, viewM21950b));
            }
            if (viewM21950b != null) {
                arrayList.add(viewM21950b);
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Class process forced to load method for inline: wq.g.d(android.view.View, boolean, boolean, boolean, boolean, int, java.lang.Object):void */
    @NotNull
    /* JADX INFO: renamed from: l */
    public final C1152g m6530l(@NotNull C9546b binding, @NotNull UiComponentScreen uiScreen, @Nullable Function2<? super C9546b, ? super Map<String, ComponentView>, Unit> initialRendering, boolean shouldApplyFocus) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(uiScreen, "uiScreen");
        Context context = binding.getRoot().getContext();
        Intrinsics.checkNotNull(context);
        C1152g c1152gM6522h = m6522h(this, context, uiScreen, false, shouldApplyFocus, false, 16, null);
        if (uiScreen.m20528k() == StyleElements.PositionType.CENTER) {
            binding.f34503c.setFillViewport(true);
            c1152gM6522h.getContentView().setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            View contentView = c1152gM6522h.getContentView();
            ViewGroup.LayoutParams layoutParams = contentView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.gravity = 16;
            contentView.setLayoutParams(layoutParams2);
        }
        binding.f34502b.addView(c1152gM6522h.getContentView());
        ConstraintLayout constraintLayoutM37677b = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutM37677b, "getRoot(...)");
        C12524g.m46873d(constraintLayoutM37677b, false, false, false, false, 13, null);
        if (c1152gM6522h.getFooterView() != null) {
            binding.f34504d.addView(c1152gM6522h.getFooterView());
            C12524g.m46873d(c1152gM6522h.getFooterView(), false, false, false, false, 2, null);
        }
        if (initialRendering != null) {
            initialRendering.invoke(binding, c1152gM6522h.getViewBindings().m6497a());
        }
        Integer numM20527j = uiScreen.m20527j();
        if (numM20527j != null) {
            binding.f34505e.setControlsColor(numM20527j.intValue());
        }
        return c1152gM6522h;
    }
}
