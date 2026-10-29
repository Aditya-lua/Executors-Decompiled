package p421rr;

import android.content.Context;
import android.graphics.Bitmap;
import com.withpersona.sdk2.inquiry.jpmynumber.JpMyNumberNfcScanResult;
import com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.GovernmentIdNfcScan;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.InputFileUpload;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.PhoneNumberSna;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.UiComponentContainerConfig;
import com.withpersona.sdk2.inquiry.p057ui.C4149b;
import com.withpersona.sdk2.inquiry.p057ui.C4155h;
import com.withpersona.sdk2.inquiry.p057ui.UiComponentErrorInfo;
import com.withpersona.sdk2.inquiry.p057ui.UiState;
import com.withpersona.sdk2.inquiry.p057ui.UiWorkflow;
import com.withpersona.sdk2.inquiry.p057ui.network.C4178b;
import com.withpersona.sdk2.inquiry.sna.SilentNetworkAuthConfig;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.C4086b;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.GovernmentIdNfcScanComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.InputAddressComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.InputFileUploadComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.InputInternationalDbComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.InputPhoneNumberComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.JpMyNumberNfcScanComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.MdocComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.Option;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.PhoneNumberSnaComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.UiComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.utils.GovernmentIdNfcData;
import com.withpersona.sdk2.inquiry.workflows.WorkflowState;
import cr.InterfaceC4207b;
import cr.InterfaceC4214c;
import cr.InterfaceC4269l;
import cr.InterfaceC4280m4;
import cr.InterfaceC4286n4;
import cr.InterfaceC4292o4;
import cr.InterfaceC4316s4;
import cr.InterfaceC4339w3;
import er.EnumC5193b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p229jt.C7345l;
import p392qr.C10701a;
import p499vr.C12255f;
import p499vr.C12256g;
import p499vr.FlowWorkflowWorker;
import p612zq.C14035a;
import p612zq.InterfaceC14037c;

/* JADX INFO: renamed from: rr.e0 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ?\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u001c\u001a\u0004\u0018\u00010\u00192\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00102\u0006\u0010\u001b\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJG\u0010)\u001a\u00020'2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010\u0014\u001a\u00020\u00132\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u00065"}, m31665d2 = {"Lrr/e0;", "", "Landroid/content/Context;", "applicationContext", "Lcom/withpersona/sdk2/inquiry/ui/network/b$a;", "addressAutocompleteWorker", "Lqr/a$a;", "addressDetailsWorker", "Lzq/a$a;", "silentNetworkAuthWorker", "Lcom/withpersona/sdk2/inquiry/ui/h$a;", "fileSelectWorkerFactory", "<init>", "(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/ui/network/b$a;Lqr/a$a;Lzq/a$a;Lcom/withpersona/sdk2/inquiry/ui/h$a;)V", "", "isFieldBlank", "", "Lcom/withpersona/sdk2/inquiry/ui/UiComponentErrorInfo;", "componentErrors", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "component", "", "subComponentName", "F", "(ZLjava/util/List;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Ljava/lang/String;)Ljava/util/List;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "configs", "name", "E", "(Ljava/util/List;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;", "renderProps", "Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;", "renderState", "Lvr/f;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "context", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$b;", "", "setOutput", "H", "(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;Lvr/f;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Lkotlin/jvm/functions/Function1;)V", "a", "Landroid/content/Context;", "b", "Lcom/withpersona/sdk2/inquiry/ui/network/b$a;", "c", "Lqr/a$a;", "d", "Lzq/a$a;", "e", "Lcom/withpersona/sdk2/inquiry/ui/h$a;", "ui_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C11084e0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context applicationContext;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C4178b.a addressAutocompleteWorker;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final C10701a.a addressDetailsWorker;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final C14035a.a silentNetworkAuthWorker;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final C4155h.a fileSelectWorkerFactory;

    public C11084e0(@NotNull Context applicationContext, @NotNull C4178b.a addressAutocompleteWorker, @NotNull C10701a.a addressDetailsWorker, @NotNull C14035a.a silentNetworkAuthWorker, @NotNull C4155h.a fileSelectWorkerFactory) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(addressAutocompleteWorker, "addressAutocompleteWorker");
        Intrinsics.checkNotNullParameter(addressDetailsWorker, "addressDetailsWorker");
        Intrinsics.checkNotNullParameter(silentNetworkAuthWorker, "silentNetworkAuthWorker");
        Intrinsics.checkNotNullParameter(fileSelectWorkerFactory, "fileSelectWorkerFactory");
        this.applicationContext = applicationContext;
        this.addressAutocompleteWorker = addressAutocompleteWorker;
        this.addressDetailsWorker = addressDetailsWorker;
        this.silentNetworkAuthWorker = silentNetworkAuthWorker;
        this.fileSelectWorkerFactory = fileSelectWorkerFactory;
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ List m41753G(C11084e0 c11084e0, boolean z10, List list, UiComponent uiComponent, String str, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            str = null;
        }
        return c11084e0.m41811F(z10, list, uiComponent, str);
    }

    /* JADX INFO: renamed from: I */
    public static final Unit m41754I(C12255f c12255f, UiState.Displaying displaying, UiComponent uiComponent, C11084e0 c11084e0, String newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        c12255f.m45417p(UiState.Displaying.m20990v(displaying, C4086b.m20896m(displaying.getComponents(), uiComponent, ((InterfaceC4292o4) uiComponent).mo20667a(newText)), null, m41753G(c11084e0, newText.length() == 0, displaying.m21006x(), uiComponent, null, 8, null), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: J */
    public static final Unit m41755J(C12255f c12255f, UiState.Displaying displaying, UiComponent uiComponent, C11084e0 c11084e0, List newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        c12255f.m45417p(UiState.Displaying.m20990v(displaying, C4086b.m20896m(displaying.getComponents(), uiComponent, ((InputPhoneNumberComponent) uiComponent).m20768u((Option) CollectionsKt.firstOrNull(newText))), null, m41753G(c11084e0, newText.isEmpty(), displaying.m21006x(), uiComponent, null, 8, null), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: K */
    public static final Unit m41756K(C12255f c12255f, UiComponent uiComponent, Object obj) {
        WorkflowState workflowStateM45411i = c12255f.m45411i();
        UiState.Displaying displaying = workflowStateM45411i instanceof UiState.Displaying ? (UiState.Displaying) workflowStateM45411i : null;
        if (displaying == null) {
            return Unit.f29331a;
        }
        UiComponent uiComponentM20890g = C4086b.m20890g(displaying.getComponents(), ((InputAddressComponent) uiComponent).getName());
        InputAddressComponent inputAddressComponent = uiComponentM20890g instanceof InputAddressComponent ? (InputAddressComponent) uiComponentM20890g : null;
        if (inputAddressComponent == null) {
            return Unit.f29331a;
        }
        if (obj instanceof C4178b.b.C14155b) {
            c12255f.m45417p(UiState.Displaying.m20990v(displaying, C4086b.m20896m(displaying.getComponents(), inputAddressComponent, inputAddressComponent.m20627U(((C4178b.b.C14155b) obj).m21643a()).m20626T(null).m20628V(null)), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262142, null));
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: L */
    public static final Unit m41757L(C12255f c12255f, UiComponent uiComponent, Function1 function1, C10701a.b response) {
        Intrinsics.checkNotNullParameter(response, "response");
        WorkflowState workflowStateM45411i = c12255f.m45411i();
        UiState.Displaying displaying = workflowStateM45411i instanceof UiState.Displaying ? (UiState.Displaying) workflowStateM45411i : null;
        if (displaying == null) {
            return Unit.f29331a;
        }
        UiComponent uiComponentM20890g = C4086b.m20890g(displaying.getComponents(), ((InputAddressComponent) uiComponent).getName());
        InputAddressComponent inputAddressComponent = uiComponentM20890g instanceof InputAddressComponent ? (InputAddressComponent) uiComponentM20890g : null;
        if (inputAddressComponent == null) {
            return Unit.f29331a;
        }
        if (response instanceof C10701a.b.C14235b) {
            Boolean bool = Boolean.FALSE;
            C10701a.b.C14235b c14235b = (C10701a.b.C14235b) response;
            InputAddressComponent inputAddressComponentMo20638q = inputAddressComponent.mo20636o(bool).mo20638q(c14235b.getResult().getAddressStreet1());
            String addressStreet2 = c14235b.getResult().getAddressStreet2();
            if (addressStreet2 == null) {
                addressStreet2 = "";
            }
            InputAddressComponent inputAddressComponentM20625S = inputAddressComponentMo20638q.mo20632j(addressStreet2).mo20633k(c14235b.getResult().getAddressCity()).mo20640s(c14235b.getResult().getAddressSubdivision()).mo20637p(c14235b.getResult().getAddressPostalCode()).m20626T(null).m20628V(null).m20625S(bool);
            c12255f.m45417p(UiState.Displaying.m20990v(displaying, C4086b.m20896m(displaying.getComponents(), inputAddressComponent, inputAddressComponentM20625S), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262142, null));
            inputAddressComponentM20625S.getTextControllerForAddressStreet1().mo1451c(inputAddressComponentM20625S.getStreet1());
            inputAddressComponentM20625S.getTextControllerForAddressStreet2().mo1451c(inputAddressComponentM20625S.getStreet2());
            inputAddressComponentM20625S.getTextControllerForAddressCity().mo1451c(inputAddressComponentM20625S.getCity());
            inputAddressComponentM20625S.getTextControllerForAddressSubdivision().mo1451c(inputAddressComponentM20625S.getSubdivision());
            inputAddressComponentM20625S.getTextControllerForAddressPostalCode().mo1451c(inputAddressComponentM20625S.getPostalCode());
        } else {
            if (!(response instanceof C10701a.b.a)) {
                throw new C7345l();
            }
            function1.invoke(new UiWorkflow.InterfaceC4141b.d("Couldn't load address.", ((C10701a.b.a) response).getCause()));
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: M */
    public static final Unit m41758M(C12255f c12255f, UiState.Displaying displaying, UiComponent uiComponent, boolean z10) {
        c12255f.m45417p(UiState.Displaying.m20990v(displaying, C4086b.m20896m(displaying.getComponents(), uiComponent, ((InterfaceC4280m4) uiComponent).mo20650a(z10)), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262142, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: N */
    public static final Unit m41759N(C12255f c12255f, UiState.Displaying displaying, UiComponent uiComponent, C11084e0 c11084e0, List selectedOptions) {
        Intrinsics.checkNotNullParameter(selectedOptions, "selectedOptions");
        c12255f.m45417p(UiState.Displaying.m20990v(displaying, C4086b.m20896m(displaying.getComponents(), uiComponent, ((InterfaceC4339w3) uiComponent).mo20743k(selectedOptions)), null, m41753G(c11084e0, selectedOptions.isEmpty(), displaying.m21006x(), uiComponent, null, 8, null), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: O */
    public static final Unit m41760O(C12255f c12255f, UiState.Displaying displaying, UiComponent uiComponent, C11084e0 c11084e0, Number number) {
        c12255f.m45417p(UiState.Displaying.m20990v(displaying, C4086b.m20896m(displaying.getComponents(), uiComponent, ((InterfaceC4286n4) uiComponent).mo20676a(number)), null, m41753G(c11084e0, number == null, displaying.m21006x(), uiComponent, null, 8, null), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: P */
    public static final Unit m41761P(C12255f c12255f, UiState.Displaying displaying, UiComponent uiComponent, Bitmap bitmap) {
        c12255f.m45417p(UiState.Displaying.m20990v(displaying, C4086b.m20896m(displaying.getComponents(), uiComponent, ((InterfaceC4214c) uiComponent).mo20574f(bitmap)), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262142, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: Q */
    public static final Unit m41762Q(C12255f c12255f, UiState.Displaying displaying, UiComponent uiComponent, C11084e0 c11084e0, String str) {
        c12255f.m45417p(UiState.Displaying.m20990v(displaying, C4086b.m20896m(displaying.getComponents(), uiComponent, ((InterfaceC4269l) uiComponent).mo20686a(str)), null, m41753G(c11084e0, str == null || str.length() == 0, displaying.m21006x(), uiComponent, null, 8, null), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: R */
    public static final Unit m41763R(C12255f c12255f, UiState.Displaying displaying, UiComponent uiComponent, C11084e0 c11084e0, String newValue) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        c12255f.m45417p(UiState.Displaying.m20990v(displaying, C4086b.m20896m(displaying.getComponents(), uiComponent, ((GovernmentIdNfcScanComponent) uiComponent).m20596q(newValue)), null, c11084e0.m41811F(newValue.length() == 0, displaying.m21006x(), uiComponent, GovernmentIdNfcScan.cardAccessNumberName), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: S */
    public static final Unit m41764S(C12255f c12255f, UiState.Displaying displaying, UiComponent uiComponent, C11084e0 c11084e0, String newValue) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        c12255f.m45417p(UiState.Displaying.m20990v(displaying, C4086b.m20896m(displaying.getComponents(), uiComponent, ((GovernmentIdNfcScanComponent) uiComponent).m20598s(newValue)), null, c11084e0.m41811F(newValue.length() == 0, displaying.m21006x(), uiComponent, GovernmentIdNfcScan.documentNumberName), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: T */
    public static final Unit m41765T(C12255f c12255f, UiState.Displaying displaying, UiComponent uiComponent, C11084e0 c11084e0, String str) {
        c12255f.m45417p(UiState.Displaying.m20990v(displaying, C4086b.m20896m(displaying.getComponents(), uiComponent, ((GovernmentIdNfcScanComponent) uiComponent).m20597r(str)), null, c11084e0.m41811F(str == null || str.length() == 0, displaying.m21006x(), uiComponent, GovernmentIdNfcScan.dateOfBirthName), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: U */
    public static final Unit m41766U(C12255f c12255f, UiState.Displaying displaying, UiComponent uiComponent, C11084e0 c11084e0, String str) {
        c12255f.m45417p(UiState.Displaying.m20990v(displaying, C4086b.m20896m(displaying.getComponents(), uiComponent, ((GovernmentIdNfcScanComponent) uiComponent).m20599t(str)), null, c11084e0.m41811F(str == null || str.length() == 0, displaying.m21006x(), uiComponent, GovernmentIdNfcScan.expirationDateName), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: V */
    public static final Unit m41767V(C12255f c12255f, UiState.Displaying displaying, UiComponent uiComponent, GovernmentIdNfcData governmentIdNfcData) {
        c12255f.m45417p(UiState.Displaying.m20990v(displaying, C4086b.m20896m(displaying.getComponents(), uiComponent, ((GovernmentIdNfcScanComponent) uiComponent).m20600u(governmentIdNfcData)), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262142, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: W */
    public static final Unit m41768W(C12255f c12255f, UiState.Displaying displaying, UiComponent uiComponent, C11084e0 c11084e0, List newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        c12255f.m45417p(UiState.Displaying.m20990v(displaying, C4086b.m20896m(displaying.getComponents(), uiComponent, ((InputInternationalDbComponent) uiComponent).m20702A((Option) CollectionsKt.firstOrNull(newText))), null, m41753G(c11084e0, newText.isEmpty(), displaying.m21006x(), uiComponent, null, 8, null), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: X */
    public static final Unit m41769X(C12255f c12255f, UiState.Displaying displaying, UiComponent uiComponent, C11084e0 c11084e0, List newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        c12255f.m45417p(UiState.Displaying.m20990v(displaying, C4086b.m20896m(displaying.getComponents(), uiComponent, ((InputInternationalDbComponent) uiComponent).m20703C((Option) CollectionsKt.firstOrNull(newText))), null, m41753G(c11084e0, newText.isEmpty(), displaying.m21006x(), uiComponent, null, 8, null), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: Y */
    public static final Unit m41770Y(C12255f c12255f, UiState.Displaying displaying, UiComponent uiComponent, C11084e0 c11084e0, Set stringSet) {
        Intrinsics.checkNotNullParameter(stringSet, "stringSet");
        c12255f.m45417p(UiState.Displaying.m20990v(displaying, C4086b.m20896m(displaying.getComponents(), uiComponent, ((InterfaceC4316s4) uiComponent).mo20658a(stringSet)), null, m41753G(c11084e0, stringSet.isEmpty(), displaying.m21006x(), uiComponent, null, 8, null), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: Z */
    public static final Unit m41771Z(C12255f c12255f, UiState.Displaying displaying, UiComponent uiComponent, C11084e0 c11084e0, String newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        c12255f.m45417p(UiState.Displaying.m20990v(displaying, C4086b.m20896m(displaying.getComponents(), uiComponent, ((InputInternationalDbComponent) uiComponent).m20704D(newText)), null, m41753G(c11084e0, newText.length() == 0, displaying.m21006x(), uiComponent, null, 8, null), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: a0 */
    public static final Unit m41773a0(C12255f c12255f, UiState.Displaying displaying, UiComponent uiComponent, JpMyNumberNfcScanResult jpMyNumberNfcScanResult) {
        c12255f.m45417p(UiState.Displaying.m20990v(displaying, C4086b.m20896m(displaying.getComponents(), uiComponent, ((JpMyNumberNfcScanComponent) uiComponent).m20806m(jpMyNumberNfcScanResult)), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262142, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: b0 */
    public static final Unit m41775b0(C12255f c12255f, UiState.Displaying displaying, UiComponent uiComponent, String newValue) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        c12255f.m45417p(UiState.Displaying.m20990v(displaying, C4086b.m20896m(displaying.getComponents(), uiComponent, ((MdocComponent) uiComponent).m20822p(newValue)), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262142, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: c0 */
    public static final Unit m41777c0(C12255f c12255f, UiState.Displaying displaying, UiComponent uiComponent, String newValue) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        MdocComponent mdocComponent = (MdocComponent) uiComponent;
        c12255f.m45417p(C4149b.m21349b(UiState.Displaying.m20990v(displaying, C4086b.m20896m(displaying.getComponents(), uiComponent, mdocComponent.m20823q(newValue)), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262142, null), mdocComponent.getSuccessfulMdocRetrievalTransitionComponentName()));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: d0 */
    public static final Unit m41779d0(UiComponent uiComponent, C12255f c12255f, UiState.Displaying displaying, Object obj) {
        PhoneNumberSnaComponent phoneNumberSnaComponentM20837m;
        if (obj instanceof InterfaceC14037c.b.C14301b) {
            phoneNumberSnaComponentM20837m = ((PhoneNumberSnaComponent) uiComponent).m20837m(((InterfaceC14037c.b.C14301b) obj).m50720a(), null, null);
        } else {
            if (!(obj instanceof InterfaceC14037c.b.Error)) {
                return Unit.f29331a;
            }
            InterfaceC14037c.b.Error error = (InterfaceC14037c.b.Error) obj;
            phoneNumberSnaComponentM20837m = ((PhoneNumberSnaComponent) uiComponent).m20837m(null, error.getErrorName(), error.getErrorMessage());
        }
        c12255f.m45417p(UiState.Displaying.m20990v(displaying, C4086b.m20896m(displaying.getComponents(), uiComponent, phoneNumberSnaComponentM20837m), null, null, null, null, null, null, new UiState.Displaying.AutoSubmit(phoneNumberSnaComponentM20837m, 0, null), null, false, false, null, null, null, false, 0, null, 0, 262014, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: e0 */
    public static final Unit m41781e0(C12255f c12255f, UiState.Displaying displaying, UiComponent uiComponent, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        c12255f.m45417p(UiState.Displaying.m20990v(displaying, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, ((InputFileUploadComponent) uiComponent).getName(), displaying.getFilePickRequestId() + 1, 65535, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: f0 */
    public static final Unit m41783f0(UiComponent uiComponent, C12255f c12255f, UiState.Displaying displaying, C4155h.b output) {
        Intrinsics.checkNotNullParameter(output, "output");
        if (output instanceof C4155h.b.Success) {
            c12255f.m45417p(UiState.Displaying.m20990v(displaying, C4086b.m20896m(displaying.getComponents(), uiComponent, ((InputFileUploadComponent) uiComponent).m20698m(((C4155h.b.Success) output).m21506a())), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 196606, null));
        } else {
            if (!(output instanceof C4155h.b.a) && !(output instanceof C4155h.b.C14153b)) {
                throw new C7345l();
            }
            c12255f.m45417p(UiState.Displaying.m20990v(displaying, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 196607, null));
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: g0 */
    public static final Unit m41785g0(C12255f c12255f, UiComponent uiComponent, boolean z10) {
        WorkflowState workflowStateM45411i = c12255f.m45411i();
        UiState.Displaying displaying = workflowStateM45411i instanceof UiState.Displaying ? (UiState.Displaying) workflowStateM45411i : null;
        if (displaying == null) {
            return Unit.f29331a;
        }
        c12255f.m45417p(UiState.Displaying.m20990v(displaying, C4086b.m20896m(displaying.getComponents(), uiComponent, ((InterfaceC4207b) uiComponent).mo20636o(Boolean.valueOf(z10))), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262142, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: h0 */
    public static final Unit m41787h0(C12255f c12255f, UiComponent uiComponent, C11084e0 c11084e0, String newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        WorkflowState workflowStateM45411i = c12255f.m45411i();
        UiState.Displaying displaying = workflowStateM45411i instanceof UiState.Displaying ? (UiState.Displaying) workflowStateM45411i : null;
        if (displaying == null) {
            return Unit.f29331a;
        }
        c12255f.m45417p(UiState.Displaying.m20990v(displaying, C4086b.m20896m(displaying.getComponents(), uiComponent, ((InterfaceC4207b) uiComponent).mo20638q(newText).m20626T(newText)), null, c11084e0.m41811F(newText.length() == 0, displaying.m21006x(), uiComponent, "street_1"), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: i0 */
    public static final Unit m41789i0(C12255f c12255f, UiComponent uiComponent, C11084e0 c11084e0, String newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        WorkflowState workflowStateM45411i = c12255f.m45411i();
        UiState.Displaying displaying = workflowStateM45411i instanceof UiState.Displaying ? (UiState.Displaying) workflowStateM45411i : null;
        if (displaying == null) {
            return Unit.f29331a;
        }
        c12255f.m45417p(UiState.Displaying.m20990v(displaying, C4086b.m20896m(displaying.getComponents(), uiComponent, ((InterfaceC4207b) uiComponent).mo20632j(newText)), null, c11084e0.m41811F(newText.length() == 0, displaying.m21006x(), uiComponent, "street_2"), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: j0 */
    public static final Unit m41791j0(C12255f c12255f, UiComponent uiComponent, C11084e0 c11084e0, String newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        WorkflowState workflowStateM45411i = c12255f.m45411i();
        UiState.Displaying displaying = workflowStateM45411i instanceof UiState.Displaying ? (UiState.Displaying) workflowStateM45411i : null;
        if (displaying == null) {
            return Unit.f29331a;
        }
        c12255f.m45417p(UiState.Displaying.m20990v(displaying, C4086b.m20896m(displaying.getComponents(), uiComponent, ((InterfaceC4207b) uiComponent).mo20633k(newText)), null, c11084e0.m41811F(newText.length() == 0, displaying.m21006x(), uiComponent, "city"), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: k0 */
    public static final Unit m41793k0(C12255f c12255f, UiComponent uiComponent, C11084e0 c11084e0, String newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        WorkflowState workflowStateM45411i = c12255f.m45411i();
        UiState.Displaying displaying = workflowStateM45411i instanceof UiState.Displaying ? (UiState.Displaying) workflowStateM45411i : null;
        if (displaying == null) {
            return Unit.f29331a;
        }
        c12255f.m45417p(UiState.Displaying.m20990v(displaying, C4086b.m20896m(displaying.getComponents(), uiComponent, ((InterfaceC4207b) uiComponent).mo20640s(newText)), null, c11084e0.m41811F(newText.length() == 0, displaying.m21006x(), uiComponent, "subdivision"), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: l0 */
    public static final Unit m41795l0(C12255f c12255f, UiComponent uiComponent, C11084e0 c11084e0, String newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        WorkflowState workflowStateM45411i = c12255f.m45411i();
        UiState.Displaying displaying = workflowStateM45411i instanceof UiState.Displaying ? (UiState.Displaying) workflowStateM45411i : null;
        if (displaying == null) {
            return Unit.f29331a;
        }
        c12255f.m45417p(UiState.Displaying.m20990v(displaying, C4086b.m20896m(displaying.getComponents(), uiComponent, ((InterfaceC4207b) uiComponent).mo20637p(newText)), null, c11084e0.m41811F(newText.length() == 0, displaying.m21006x(), uiComponent, "postal_code"), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: E */
    public final UiComponentConfig m41810E(List<? extends UiComponentConfig> configs, String name) {
        UiComponentConfig uiComponentConfigM41810E;
        if (configs == null) {
            return null;
        }
        for (UiComponentConfig uiComponentConfig : configs) {
            if (Intrinsics.m31980c(uiComponentConfig.getName(), name)) {
                return uiComponentConfig;
            }
            if ((uiComponentConfig instanceof UiComponentContainerConfig) && (uiComponentConfigM41810E = m41810E(((UiComponentContainerConfig) uiComponentConfig).getChildren(), name)) != null) {
                return uiComponentConfigM41810E;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: F */
    public final List<UiComponentErrorInfo> m41811F(boolean isFieldBlank, List<UiComponentErrorInfo> componentErrors, UiComponent component, String subComponentName) {
        Object next;
        List<UiComponentErrorInfo> list = componentErrors;
        Iterator<T> it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.m31980c(((UiComponentErrorInfo) next).getName(), component.getName()));
        UiComponentErrorInfo uiComponentErrorInfo = (UiComponentErrorInfo) next;
        if (isFieldBlank) {
            return componentErrors;
        }
        UiComponentError uiComponentErrorM20987a = uiComponentErrorInfo != null ? uiComponentErrorInfo.m20987a(component.getLastValueUpdateTs()) : null;
        if (uiComponentErrorM20987a instanceof UiComponentError.UiGovernmentIdNfcScanComponentError) {
            UiComponentError.UiGovernmentIdNfcScanComponentError uiGovernmentIdNfcScanComponentError = (UiComponentError.UiGovernmentIdNfcScanComponentError) uiComponentErrorM20987a;
            Map<String, String> message = uiGovernmentIdNfcScanComponentError.getMessage();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, String> entry : message.entrySet()) {
                if (!Intrinsics.m31980c(entry.getKey(), subComponentName)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            uiGovernmentIdNfcScanComponentError.setMessage(linkedHashMap);
            return componentErrors;
        }
        if (!(uiComponentErrorM20987a instanceof UiComponentError.UiInputAddressComponentError)) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!Intrinsics.m31980c(((UiComponentErrorInfo) obj).getName(), component.getName())) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        UiComponentError.UiInputAddressComponentError uiInputAddressComponentError = (UiComponentError.UiInputAddressComponentError) uiComponentErrorM20987a;
        Map<String, String> message2 = uiInputAddressComponentError.getMessage();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry<String, String> entry2 : message2.entrySet()) {
            if (!Intrinsics.m31980c(entry2.getKey(), subComponentName)) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        uiInputAddressComponentError.setMessage(linkedHashMap2);
        return componentErrors;
    }

    /* JADX INFO: renamed from: H */
    public final void m41812H(@NotNull UiWorkflow.Input renderProps, @NotNull final UiState.Displaying renderState, @NotNull final C12255f<UiState> context, @NotNull final UiComponent component, @NotNull final Function1<? super UiWorkflow.InterfaceC4141b, Unit> setOutput) {
        String[] strArr;
        InputFileUpload.Attributes attributes;
        Integer fileUploadLimit;
        InputFileUpload.Attributes attributes2;
        List<String> allowedFileTypes;
        String checkUrl;
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(setOutput, "setOutput");
        if (component instanceof InterfaceC4292o4) {
            context.m45415n(new FlowWorkflowWorker(component.getName(), ((InterfaceC4292o4) component).getTextController().mo1449a()), new Function1() { // from class: rr.a
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C11084e0.m41754I(context, renderState, component, this, (String) obj);
                }
            });
            if (component instanceof InputPhoneNumberComponent) {
                InputPhoneNumberComponent inputPhoneNumberComponent = (InputPhoneNumberComponent) component;
                context.m45415n(new FlowWorkflowWorker(inputPhoneNumberComponent.getName() + ":country", inputPhoneNumberComponent.getCountryCodeOptionsController().m24145a()), new Function1() { // from class: rr.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C11084e0.m41755J(context, renderState, component, this, (List) obj);
                    }
                });
                return;
            }
            return;
        }
        if (component instanceof InterfaceC4339w3) {
            context.m45415n(new FlowWorkflowWorker(component.getName(), ((InterfaceC4339w3) component).getSelectedOptionsController().m24145a()), new Function1() { // from class: rr.o
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C11084e0.m41759N(context, renderState, component, this, (List) obj);
                }
            });
            return;
        }
        if (component instanceof InterfaceC4316s4) {
            context.m45415n(new FlowWorkflowWorker(component.getName(), ((InterfaceC4316s4) component).getStringSetController().m24148a()), new Function1() { // from class: rr.p
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C11084e0.m41770Y(context, renderState, component, this, (Set) obj);
                }
            });
            return;
        }
        if (component instanceof InterfaceC4207b) {
            context.m45415n(new FlowWorkflowWorker(component.getName() + "UpdateCollapsedState", ((InterfaceC4207b) component).getIsAddressFieldCollapsed().m24154a()), new Function1() { // from class: rr.q
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C11084e0.m41785g0(context, component, ((Boolean) obj).booleanValue());
                }
            });
            InterfaceC4207b interfaceC4207b = (InterfaceC4207b) component;
            context.m45415n(new FlowWorkflowWorker(component.getName() + "UpdateAddressStreet1", interfaceC4207b.getTextControllerForAddressStreet1().mo1449a()), new Function1() { // from class: rr.r
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C11084e0.m41787h0(context, component, this, (String) obj);
                }
            });
            context.m45415n(new FlowWorkflowWorker(component.getName() + "UpdateAddressStreet2", interfaceC4207b.getTextControllerForAddressStreet2().mo1449a()), new Function1() { // from class: rr.s
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C11084e0.m41789i0(context, component, this, (String) obj);
                }
            });
            context.m45415n(new FlowWorkflowWorker(component.getName() + "UpdateAddressCity", interfaceC4207b.getTextControllerForAddressCity().mo1449a()), new Function1() { // from class: rr.t
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C11084e0.m41791j0(context, component, this, (String) obj);
                }
            });
            context.m45415n(new FlowWorkflowWorker(component.getName() + "UpdateAddressSubdivision", interfaceC4207b.getTextControllerForAddressSubdivision().mo1449a()), new Function1() { // from class: rr.u
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C11084e0.m41793k0(context, component, this, (String) obj);
                }
            });
            context.m45415n(new FlowWorkflowWorker(component.getName() + "UpdateAddressPostalCode", interfaceC4207b.getTextControllerForAddressPostalCode().mo1449a()), new Function1() { // from class: rr.v
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C11084e0.m41795l0(context, component, this, (String) obj);
                }
            });
            if (component instanceof InputAddressComponent) {
                InputAddressComponent inputAddressComponent = (InputAddressComponent) component;
                if (inputAddressComponent.getAutocompleteMethod() == EnumC5193b.Server) {
                    String searchQuery = inputAddressComponent.getSearchQuery();
                    if (searchQuery != null) {
                        context.m45415n(C12256g.m45423a(this.addressAutocompleteWorker.m21642a(renderProps.getSessionToken(), component, searchQuery), "autocomplete_" + inputAddressComponent.getName()), new Function1() { // from class: rr.l
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return C11084e0.m41756K(context, component, obj);
                            }
                        });
                    }
                    String selectedSearchResultId = inputAddressComponent.getSelectedSearchResultId();
                    if (selectedSearchResultId != null) {
                        context.m45415n(this.addressDetailsWorker.m40787a(renderProps.getSessionToken(), selectedSearchResultId), new Function1() { // from class: rr.w
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return C11084e0.m41757L(context, component, setOutput, (C10701a.b) obj);
                            }
                        });
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (component instanceof InterfaceC4280m4) {
            context.m45415n(new FlowWorkflowWorker(component.getName(), ((InterfaceC4280m4) component).getTwoStateViewController().m24154a()), new Function1() { // from class: rr.x
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C11084e0.m41758M(context, renderState, component, ((Boolean) obj).booleanValue());
                }
            });
            return;
        }
        if (component instanceof InterfaceC4286n4) {
            context.m45415n(new FlowWorkflowWorker(component.getName(), ((InterfaceC4286n4) component).getNumberController().m24140a()), new Function1() { // from class: rr.y
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C11084e0.m41760O(context, renderState, component, this, (Number) obj);
                }
            });
            return;
        }
        if (component instanceof InterfaceC4214c) {
            context.m45415n(new FlowWorkflowWorker(component.getName(), ((InterfaceC4214c) component).getBitmapController().m24095a()), new Function1() { // from class: rr.z
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C11084e0.m41761P(context, renderState, component, (Bitmap) obj);
                }
            });
            return;
        }
        if (component instanceof InterfaceC4269l) {
            context.m45415n(new FlowWorkflowWorker(component.getName(), ((InterfaceC4269l) component).getDateController().m24120e()), new Function1() { // from class: rr.a0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C11084e0.m41762Q(context, renderState, component, this, (String) obj);
                }
            });
            return;
        }
        if (component instanceof GovernmentIdNfcScanComponent) {
            GovernmentIdNfcScanComponent governmentIdNfcScanComponent = (GovernmentIdNfcScanComponent) component;
            context.m45415n(new FlowWorkflowWorker(governmentIdNfcScanComponent.getName() + "UpdateCardAccessNumber", governmentIdNfcScanComponent.getCardAccessNumberController().mo1449a()), new Function1() { // from class: rr.b0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C11084e0.m41763R(context, renderState, component, this, (String) obj);
                }
            });
            context.m45415n(new FlowWorkflowWorker(governmentIdNfcScanComponent.getName() + "UpdateDocumentNumber", governmentIdNfcScanComponent.getDocumentNumberController().mo1449a()), new Function1() { // from class: rr.c0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C11084e0.m41764S(context, renderState, component, this, (String) obj);
                }
            });
            context.m45415n(new FlowWorkflowWorker(governmentIdNfcScanComponent.getName() + "UpdateDateOfBirth", governmentIdNfcScanComponent.getDateOfBirthController().m24120e()), new Function1() { // from class: rr.d0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C11084e0.m41765T(context, renderState, component, this, (String) obj);
                }
            });
            context.m45415n(new FlowWorkflowWorker(governmentIdNfcScanComponent.getName() + "UpdateExpirationDate", governmentIdNfcScanComponent.getExpirationDateController().m24120e()), new Function1() { // from class: rr.b
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C11084e0.m41766U(context, renderState, component, this, (String) obj);
                }
            });
            context.m45415n(new FlowWorkflowWorker(governmentIdNfcScanComponent.getName(), governmentIdNfcScanComponent.getNfcDataController().m24134a()), new Function1() { // from class: rr.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C11084e0.m41767V(context, renderState, component, (GovernmentIdNfcData) obj);
                }
            });
            return;
        }
        if (component instanceof InputInternationalDbComponent) {
            InputInternationalDbComponent inputInternationalDbComponent = (InputInternationalDbComponent) component;
            context.m45415n(new FlowWorkflowWorker(inputInternationalDbComponent.getName() + ":country", inputInternationalDbComponent.getCountryOptionsController().m24145a()), new Function1() { // from class: rr.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C11084e0.m41768W(context, renderState, component, this, (List) obj);
                }
            });
            context.m45415n(new FlowWorkflowWorker(inputInternationalDbComponent.getName() + ":idType", inputInternationalDbComponent.getIdTypeOptionsController().m24145a()), new Function1() { // from class: rr.f
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C11084e0.m41769X(context, renderState, component, this, (List) obj);
                }
            });
            context.m45415n(new FlowWorkflowWorker(inputInternationalDbComponent.getName() + ":idValue", inputInternationalDbComponent.getIdValueController().mo1449a()), new Function1() { // from class: rr.g
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C11084e0.m41771Z(context, renderState, component, this, (String) obj);
                }
            });
            return;
        }
        if (component instanceof JpMyNumberNfcScanComponent) {
            JpMyNumberNfcScanComponent jpMyNumberNfcScanComponent = (JpMyNumberNfcScanComponent) component;
            context.m45415n(new FlowWorkflowWorker(jpMyNumberNfcScanComponent.getName() + ":scanResult", jpMyNumberNfcScanComponent.getScanResultController().m24137a()), new Function1() { // from class: rr.h
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C11084e0.m41773a0(context, renderState, component, (JpMyNumberNfcScanResult) obj);
                }
            });
            return;
        }
        if (component instanceof MdocComponent) {
            MdocComponent mdocComponent = (MdocComponent) component;
            context.m45415n(new FlowWorkflowWorker(mdocComponent.getName() + ":error", mdocComponent.getErrorTextController().mo1449a()), new Function1() { // from class: rr.i
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C11084e0.m41775b0(context, renderState, component, (String) obj);
                }
            });
            context.m45415n(new FlowWorkflowWorker(mdocComponent.getName() + ":data", mdocComponent.getMdocDataController().mo1449a()), new Function1() { // from class: rr.j
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C11084e0.m41777c0(context, renderState, component, (String) obj);
                }
            });
            return;
        }
        if (component instanceof PhoneNumberSnaComponent) {
            PhoneNumberSnaComponent phoneNumberSnaComponent = (PhoneNumberSnaComponent) component;
            PhoneNumberSna.Attributes attributes3 = phoneNumberSnaComponent.getConfig().getAttributes();
            if (attributes3 == null || (checkUrl = attributes3.getCheckUrl()) == null) {
                checkUrl = "";
            }
            context.m45415n(C12256g.m45423a(this.silentNetworkAuthWorker.m50711a(this.applicationContext, new SilentNetworkAuthConfig(checkUrl, 0, 0L, 6, null), attributes3 != null ? attributes3.getTimeoutSeconds() : 10), phoneNumberSnaComponent.getName()), new Function1() { // from class: rr.k
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C11084e0.m41779d0(component, context, renderState, obj);
                }
            });
            return;
        }
        if (component instanceof InputFileUploadComponent) {
            InputFileUploadComponent inputFileUploadComponent = (InputFileUploadComponent) component;
            context.m45415n(new FlowWorkflowWorker(inputFileUploadComponent.getName() + "_pick_request", inputFileUploadComponent.getFileUploadController().m21918a()), new Function1() { // from class: rr.m
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C11084e0.m41781e0(context, renderState, component, (Unit) obj);
                }
            });
            if (Intrinsics.m31980c(renderState.getFilePickComponentName(), inputFileUploadComponent.getName())) {
                UiComponentConfig uiComponentConfigM41810E = m41810E(renderProps.getComponents(), inputFileUploadComponent.getName());
                InputFileUpload inputFileUpload = uiComponentConfigM41810E instanceof InputFileUpload ? (InputFileUpload) uiComponentConfigM41810E : null;
                int iIntValue = 1;
                if (inputFileUpload == null || (attributes2 = inputFileUpload.getAttributes()) == null || (allowedFileTypes = attributes2.getAllowedFileTypes()) == null || (strArr = (String[]) allowedFileTypes.toArray(new String[0])) == null) {
                    strArr = new String[]{"*/*"};
                }
                if (inputFileUpload != null && (attributes = inputFileUpload.getAttributes()) != null && (fileUploadLimit = attributes.getFileUploadLimit()) != null) {
                    iIntValue = fileUploadLimit.intValue();
                }
                context.m45415n(this.fileSelectWorkerFactory.m21503b(inputFileUploadComponent.getName() + "_" + renderState.getFilePickRequestId(), strArr, iIntValue), new Function1() { // from class: rr.n
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C11084e0.m41783f0(component, context, renderState, (C4155h.b) obj);
                    }
                });
            }
        }
    }
}
