package rr;

import android.content.Context;
import android.graphics.Bitmap;
import com.withpersona.sdk2.inquiry.jpmynumber.JpMyNumberNfcScanResult;
import com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.GovernmentIdNfcScan;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputFileUpload;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.PhoneNumberSna;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentContainerConfig;
import com.withpersona.sdk2.inquiry.sna.SilentNetworkAuthConfig;
import com.withpersona.sdk2.inquiry.steps.ui.components.GovernmentIdNfcScanComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputAddressComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputFileUploadComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputInternationalDbComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputPhoneNumberComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.JpMyNumberNfcScanComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.MdocComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.Option;
import com.withpersona.sdk2.inquiry.steps.ui.components.PhoneNumberSnaComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.utils.GovernmentIdNfcData;
import com.withpersona.sdk2.inquiry.ui.UiComponentErrorInfo;
import com.withpersona.sdk2.inquiry.ui.UiState;
import com.withpersona.sdk2.inquiry.ui.UiWorkflow;
import com.withpersona.sdk2.inquiry.workflows.WorkflowState;
import cr.m4;
import cr.n4;
import cr.o4;
import cr.s4;
import cr.w3;
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
import okhttp3.internal.http2.Settings;
import org.jetbrains.annotations.NotNull;
import vr.FlowWorkflowWorker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ?\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u001c\u001a\u0004\u0018\u00010\u00192\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00102\u0006\u0010\u001b\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJG\u0010)\u001a\u00020'2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010\u0014\u001a\u00020\u00132\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u00065"}, d2 = {"Lrr/e0;", "", "Landroid/content/Context;", "applicationContext", "Lcom/withpersona/sdk2/inquiry/ui/network/b$a;", "addressAutocompleteWorker", "Lqr/a$a;", "addressDetailsWorker", "Lzq/a$a;", "silentNetworkAuthWorker", "Lcom/withpersona/sdk2/inquiry/ui/h$a;", "fileSelectWorkerFactory", "<init>", "(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/ui/network/b$a;Lqr/a$a;Lzq/a$a;Lcom/withpersona/sdk2/inquiry/ui/h$a;)V", "", "isFieldBlank", "", "Lcom/withpersona/sdk2/inquiry/ui/UiComponentErrorInfo;", "componentErrors", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "component", "", "subComponentName", "F", "(ZLjava/util/List;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Ljava/lang/String;)Ljava/util/List;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "configs", "name", "E", "(Ljava/util/List;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;", "renderProps", "Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;", "renderState", "Lvr/f;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "context", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$b;", "", "setOutput", "H", "(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;Lvr/f;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Lkotlin/jvm/functions/Function1;)V", "a", "Landroid/content/Context;", "b", "Lcom/withpersona/sdk2/inquiry/ui/network/b$a;", "c", "Lqr/a$a;", "d", "Lzq/a$a;", "e", "Lcom/withpersona/sdk2/inquiry/ui/h$a;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context applicationContext;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.inquiry.ui.network.b.a addressAutocompleteWorker;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final qr.a.C0521a addressDetailsWorker;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final zq.a.C0689a silentNetworkAuthWorker;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.inquiry.ui.h.a fileSelectWorkerFactory;

    public e0(@NotNull Context applicationContext, @NotNull com.withpersona.sdk2.inquiry.ui.network.b.a addressAutocompleteWorker, @NotNull qr.a.C0521a addressDetailsWorker, @NotNull zq.a.C0689a silentNetworkAuthWorker, @NotNull com.withpersona.sdk2.inquiry.ui.h.a fileSelectWorkerFactory) {
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

    public static /* synthetic */ List G(e0 e0Var, boolean z10, List list, UiComponent uiComponent, String str, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            str = null;
        }
        return e0Var.F(z10, list, uiComponent, str);
    }

    public static final Unit I(vr.f fVar, UiState.Displaying displaying, UiComponent uiComponent, e0 e0Var, String newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        fVar.p(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((o4) uiComponent).a(newText)), null, G(e0Var, newText.length() == 0, displaying.x(), uiComponent, null, 8, null), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f22483a;
    }

    public static final Unit J(vr.f fVar, UiState.Displaying displaying, UiComponent uiComponent, e0 e0Var, List newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        fVar.p(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((InputPhoneNumberComponent) uiComponent).u((Option) CollectionsKt.firstOrNull(newText))), null, G(e0Var, newText.isEmpty(), displaying.x(), uiComponent, null, 8, null), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f22483a;
    }

    public static final Unit K(vr.f fVar, UiComponent uiComponent, Object obj) {
        WorkflowState workflowStateI = fVar.i();
        UiState.Displaying displaying = workflowStateI instanceof UiState.Displaying ? (UiState.Displaying) workflowStateI : null;
        if (displaying == null) {
            return Unit.f22483a;
        }
        UiComponent uiComponentG = com.withpersona.sdk2.inquiry.steps.ui.components.b.g(displaying.getComponents(), ((InputAddressComponent) uiComponent).getName());
        InputAddressComponent inputAddressComponent = uiComponentG instanceof InputAddressComponent ? (InputAddressComponent) uiComponentG : null;
        if (inputAddressComponent == null) {
            return Unit.f22483a;
        }
        if (obj instanceof com.withpersona.sdk2.inquiry.ui.network.b.AbstractC0257b.C0258b) {
            fVar.p(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), inputAddressComponent, inputAddressComponent.U(((com.withpersona.sdk2.inquiry.ui.network.b.AbstractC0257b.C0258b) obj).a()).T(null).V(null)), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262142, null));
        }
        return Unit.f22483a;
    }

    public static final Unit L(vr.f fVar, UiComponent uiComponent, Function1 function1, qr.a.b response) {
        Intrinsics.checkNotNullParameter(response, "response");
        WorkflowState workflowStateI = fVar.i();
        UiState.Displaying displaying = workflowStateI instanceof UiState.Displaying ? (UiState.Displaying) workflowStateI : null;
        if (displaying == null) {
            return Unit.f22483a;
        }
        UiComponent uiComponentG = com.withpersona.sdk2.inquiry.steps.ui.components.b.g(displaying.getComponents(), ((InputAddressComponent) uiComponent).getName());
        InputAddressComponent inputAddressComponent = uiComponentG instanceof InputAddressComponent ? (InputAddressComponent) uiComponentG : null;
        if (inputAddressComponent == null) {
            return Unit.f22483a;
        }
        if (response instanceof qr.a.b.C0523b) {
            Boolean bool = Boolean.FALSE;
            qr.a.b.C0523b c0523b = (qr.a.b.C0523b) response;
            InputAddressComponent inputAddressComponentQ = inputAddressComponent.o(bool).q(c0523b.getResult().getAddressStreet1());
            String addressStreet2 = c0523b.getResult().getAddressStreet2();
            if (addressStreet2 == null) {
                addressStreet2 = "";
            }
            InputAddressComponent inputAddressComponentS = inputAddressComponentQ.j(addressStreet2).k(c0523b.getResult().getAddressCity()).s(c0523b.getResult().getAddressSubdivision()).p(c0523b.getResult().getAddressPostalCode()).T(null).V(null).S(bool);
            fVar.p(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), inputAddressComponent, inputAddressComponentS), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262142, null));
            inputAddressComponentS.getTextControllerForAddressStreet1().c(inputAddressComponentS.getStreet1());
            inputAddressComponentS.getTextControllerForAddressStreet2().c(inputAddressComponentS.getStreet2());
            inputAddressComponentS.getTextControllerForAddressCity().c(inputAddressComponentS.getCity());
            inputAddressComponentS.getTextControllerForAddressSubdivision().c(inputAddressComponentS.getSubdivision());
            inputAddressComponentS.getTextControllerForAddressPostalCode().c(inputAddressComponentS.getPostalCode());
        } else {
            if (!(response instanceof qr.a.b.C0522a)) {
                throw new jt.l();
            }
            function1.invoke(new UiWorkflow.b.d("Couldn't load address.", ((qr.a.b.C0522a) response).getCause()));
        }
        return Unit.f22483a;
    }

    public static final Unit M(vr.f fVar, UiState.Displaying displaying, UiComponent uiComponent, boolean z10) {
        fVar.p(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((m4) uiComponent).a(z10)), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262142, null));
        return Unit.f22483a;
    }

    public static final Unit N(vr.f fVar, UiState.Displaying displaying, UiComponent uiComponent, e0 e0Var, List selectedOptions) {
        Intrinsics.checkNotNullParameter(selectedOptions, "selectedOptions");
        fVar.p(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((w3) uiComponent).k(selectedOptions)), null, G(e0Var, selectedOptions.isEmpty(), displaying.x(), uiComponent, null, 8, null), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f22483a;
    }

    public static final Unit O(vr.f fVar, UiState.Displaying displaying, UiComponent uiComponent, e0 e0Var, Number number) {
        fVar.p(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((n4) uiComponent).a(number)), null, G(e0Var, number == null, displaying.x(), uiComponent, null, 8, null), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f22483a;
    }

    public static final Unit P(vr.f fVar, UiState.Displaying displaying, UiComponent uiComponent, Bitmap bitmap) {
        fVar.p(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((cr.c) uiComponent).f(bitmap)), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262142, null));
        return Unit.f22483a;
    }

    public static final Unit Q(vr.f fVar, UiState.Displaying displaying, UiComponent uiComponent, e0 e0Var, String str) {
        fVar.p(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((cr.l) uiComponent).a(str)), null, G(e0Var, str == null || str.length() == 0, displaying.x(), uiComponent, null, 8, null), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f22483a;
    }

    public static final Unit R(vr.f fVar, UiState.Displaying displaying, UiComponent uiComponent, e0 e0Var, String newValue) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        fVar.p(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((GovernmentIdNfcScanComponent) uiComponent).q(newValue)), null, e0Var.F(newValue.length() == 0, displaying.x(), uiComponent, GovernmentIdNfcScan.cardAccessNumberName), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f22483a;
    }

    public static final Unit S(vr.f fVar, UiState.Displaying displaying, UiComponent uiComponent, e0 e0Var, String newValue) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        fVar.p(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((GovernmentIdNfcScanComponent) uiComponent).s(newValue)), null, e0Var.F(newValue.length() == 0, displaying.x(), uiComponent, GovernmentIdNfcScan.documentNumberName), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f22483a;
    }

    public static final Unit T(vr.f fVar, UiState.Displaying displaying, UiComponent uiComponent, e0 e0Var, String str) {
        fVar.p(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((GovernmentIdNfcScanComponent) uiComponent).r(str)), null, e0Var.F(str == null || str.length() == 0, displaying.x(), uiComponent, GovernmentIdNfcScan.dateOfBirthName), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f22483a;
    }

    public static final Unit U(vr.f fVar, UiState.Displaying displaying, UiComponent uiComponent, e0 e0Var, String str) {
        fVar.p(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((GovernmentIdNfcScanComponent) uiComponent).t(str)), null, e0Var.F(str == null || str.length() == 0, displaying.x(), uiComponent, GovernmentIdNfcScan.expirationDateName), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f22483a;
    }

    public static final Unit V(vr.f fVar, UiState.Displaying displaying, UiComponent uiComponent, GovernmentIdNfcData governmentIdNfcData) {
        fVar.p(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((GovernmentIdNfcScanComponent) uiComponent).u(governmentIdNfcData)), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262142, null));
        return Unit.f22483a;
    }

    public static final Unit W(vr.f fVar, UiState.Displaying displaying, UiComponent uiComponent, e0 e0Var, List newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        fVar.p(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((InputInternationalDbComponent) uiComponent).A((Option) CollectionsKt.firstOrNull(newText))), null, G(e0Var, newText.isEmpty(), displaying.x(), uiComponent, null, 8, null), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f22483a;
    }

    public static final Unit X(vr.f fVar, UiState.Displaying displaying, UiComponent uiComponent, e0 e0Var, List newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        fVar.p(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((InputInternationalDbComponent) uiComponent).C((Option) CollectionsKt.firstOrNull(newText))), null, G(e0Var, newText.isEmpty(), displaying.x(), uiComponent, null, 8, null), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f22483a;
    }

    public static final Unit Y(vr.f fVar, UiState.Displaying displaying, UiComponent uiComponent, e0 e0Var, Set stringSet) {
        Intrinsics.checkNotNullParameter(stringSet, "stringSet");
        fVar.p(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((s4) uiComponent).a(stringSet)), null, G(e0Var, stringSet.isEmpty(), displaying.x(), uiComponent, null, 8, null), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f22483a;
    }

    public static final Unit Z(vr.f fVar, UiState.Displaying displaying, UiComponent uiComponent, e0 e0Var, String newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        fVar.p(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((InputInternationalDbComponent) uiComponent).D(newText)), null, G(e0Var, newText.length() == 0, displaying.x(), uiComponent, null, 8, null), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f22483a;
    }

    public static final Unit a0(vr.f fVar, UiState.Displaying displaying, UiComponent uiComponent, JpMyNumberNfcScanResult jpMyNumberNfcScanResult) {
        fVar.p(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((JpMyNumberNfcScanComponent) uiComponent).m(jpMyNumberNfcScanResult)), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262142, null));
        return Unit.f22483a;
    }

    public static final Unit b0(vr.f fVar, UiState.Displaying displaying, UiComponent uiComponent, String newValue) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        fVar.p(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((MdocComponent) uiComponent).p(newValue)), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262142, null));
        return Unit.f22483a;
    }

    public static final Unit c0(vr.f fVar, UiState.Displaying displaying, UiComponent uiComponent, String newValue) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        MdocComponent mdocComponent = (MdocComponent) uiComponent;
        fVar.p(com.withpersona.sdk2.inquiry.ui.b.b(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, mdocComponent.q(newValue)), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262142, null), mdocComponent.getSuccessfulMdocRetrievalTransitionComponentName()));
        return Unit.f22483a;
    }

    public static final Unit d0(UiComponent uiComponent, vr.f fVar, UiState.Displaying displaying, Object obj) {
        PhoneNumberSnaComponent phoneNumberSnaComponentM;
        if (obj instanceof zq.c.b.C0691b) {
            phoneNumberSnaComponentM = ((PhoneNumberSnaComponent) uiComponent).m(((zq.c.b.C0691b) obj).a(), null, null);
        } else {
            if (!(obj instanceof zq.c.b.Error)) {
                return Unit.f22483a;
            }
            zq.c.b.Error error = (zq.c.b.Error) obj;
            phoneNumberSnaComponentM = ((PhoneNumberSnaComponent) uiComponent).m(null, error.getErrorName(), error.getErrorMessage());
        }
        fVar.p(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, phoneNumberSnaComponentM), null, null, null, null, null, null, new UiState.Displaying.AutoSubmit(phoneNumberSnaComponentM, 0, null), null, false, false, null, null, null, false, 0, null, 0, 262014, null));
        return Unit.f22483a;
    }

    public static final Unit e0(vr.f fVar, UiState.Displaying displaying, UiComponent uiComponent, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        fVar.p(UiState.Displaying.v(displaying, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, ((InputFileUploadComponent) uiComponent).getName(), displaying.getFilePickRequestId() + 1, Settings.DEFAULT_INITIAL_WINDOW_SIZE, null));
        return Unit.f22483a;
    }

    public static final Unit f0(UiComponent uiComponent, vr.f fVar, UiState.Displaying displaying, com.withpersona.sdk2.inquiry.ui.h.b output) {
        Intrinsics.checkNotNullParameter(output, "output");
        if (output instanceof com.withpersona.sdk2.inquiry.ui.h.b.Success) {
            fVar.p(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((InputFileUploadComponent) uiComponent).m(((com.withpersona.sdk2.inquiry.ui.h.b.Success) output).a())), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 196606, null));
        } else {
            if (!(output instanceof com.withpersona.sdk2.inquiry.ui.h.b.a) && !(output instanceof com.withpersona.sdk2.inquiry.ui.h.b.C0255b)) {
                throw new jt.l();
            }
            fVar.p(UiState.Displaying.v(displaying, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 196607, null));
        }
        return Unit.f22483a;
    }

    public static final Unit g0(vr.f fVar, UiComponent uiComponent, boolean z10) {
        WorkflowState workflowStateI = fVar.i();
        UiState.Displaying displaying = workflowStateI instanceof UiState.Displaying ? (UiState.Displaying) workflowStateI : null;
        if (displaying == null) {
            return Unit.f22483a;
        }
        fVar.p(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((cr.b) uiComponent).o(Boolean.valueOf(z10))), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262142, null));
        return Unit.f22483a;
    }

    public static final Unit h0(vr.f fVar, UiComponent uiComponent, e0 e0Var, String newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        WorkflowState workflowStateI = fVar.i();
        UiState.Displaying displaying = workflowStateI instanceof UiState.Displaying ? (UiState.Displaying) workflowStateI : null;
        if (displaying == null) {
            return Unit.f22483a;
        }
        fVar.p(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((cr.b) uiComponent).q(newText).T(newText)), null, e0Var.F(newText.length() == 0, displaying.x(), uiComponent, "street_1"), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f22483a;
    }

    public static final Unit i0(vr.f fVar, UiComponent uiComponent, e0 e0Var, String newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        WorkflowState workflowStateI = fVar.i();
        UiState.Displaying displaying = workflowStateI instanceof UiState.Displaying ? (UiState.Displaying) workflowStateI : null;
        if (displaying == null) {
            return Unit.f22483a;
        }
        fVar.p(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((cr.b) uiComponent).j(newText)), null, e0Var.F(newText.length() == 0, displaying.x(), uiComponent, "street_2"), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f22483a;
    }

    public static final Unit j0(vr.f fVar, UiComponent uiComponent, e0 e0Var, String newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        WorkflowState workflowStateI = fVar.i();
        UiState.Displaying displaying = workflowStateI instanceof UiState.Displaying ? (UiState.Displaying) workflowStateI : null;
        if (displaying == null) {
            return Unit.f22483a;
        }
        fVar.p(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((cr.b) uiComponent).k(newText)), null, e0Var.F(newText.length() == 0, displaying.x(), uiComponent, "city"), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f22483a;
    }

    public static final Unit k0(vr.f fVar, UiComponent uiComponent, e0 e0Var, String newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        WorkflowState workflowStateI = fVar.i();
        UiState.Displaying displaying = workflowStateI instanceof UiState.Displaying ? (UiState.Displaying) workflowStateI : null;
        if (displaying == null) {
            return Unit.f22483a;
        }
        fVar.p(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((cr.b) uiComponent).s(newText)), null, e0Var.F(newText.length() == 0, displaying.x(), uiComponent, "subdivision"), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f22483a;
    }

    public static final Unit l0(vr.f fVar, UiComponent uiComponent, e0 e0Var, String newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        WorkflowState workflowStateI = fVar.i();
        UiState.Displaying displaying = workflowStateI instanceof UiState.Displaying ? (UiState.Displaying) workflowStateI : null;
        if (displaying == null) {
            return Unit.f22483a;
        }
        fVar.p(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((cr.b) uiComponent).p(newText)), null, e0Var.F(newText.length() == 0, displaying.x(), uiComponent, "postal_code"), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f22483a;
    }

    public final UiComponentConfig E(List<? extends UiComponentConfig> configs, String name) {
        UiComponentConfig uiComponentConfigE;
        if (configs == null) {
            return null;
        }
        for (UiComponentConfig uiComponentConfig : configs) {
            if (Intrinsics.c(uiComponentConfig.getName(), name)) {
                return uiComponentConfig;
            }
            if ((uiComponentConfig instanceof UiComponentContainerConfig) && (uiComponentConfigE = E(((UiComponentContainerConfig) uiComponentConfig).getChildren(), name)) != null) {
                return uiComponentConfigE;
            }
        }
        return null;
    }

    public final List<UiComponentErrorInfo> F(boolean isFieldBlank, List<UiComponentErrorInfo> componentErrors, UiComponent component, String subComponentName) {
        Object next;
        List<UiComponentErrorInfo> list = componentErrors;
        Iterator<T> it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.c(((UiComponentErrorInfo) next).getName(), component.getName()));
        UiComponentErrorInfo uiComponentErrorInfo = (UiComponentErrorInfo) next;
        if (isFieldBlank) {
            return componentErrors;
        }
        UiComponentError uiComponentErrorA = uiComponentErrorInfo != null ? uiComponentErrorInfo.a(component.getLastValueUpdateTs()) : null;
        if (uiComponentErrorA instanceof UiComponentError.UiGovernmentIdNfcScanComponentError) {
            UiComponentError.UiGovernmentIdNfcScanComponentError uiGovernmentIdNfcScanComponentError = (UiComponentError.UiGovernmentIdNfcScanComponentError) uiComponentErrorA;
            Map<String, String> message = uiGovernmentIdNfcScanComponentError.getMessage();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, String> entry : message.entrySet()) {
                if (!Intrinsics.c(entry.getKey(), subComponentName)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            uiGovernmentIdNfcScanComponentError.setMessage(linkedHashMap);
            return componentErrors;
        }
        if (!(uiComponentErrorA instanceof UiComponentError.UiInputAddressComponentError)) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!Intrinsics.c(((UiComponentErrorInfo) obj).getName(), component.getName())) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        UiComponentError.UiInputAddressComponentError uiInputAddressComponentError = (UiComponentError.UiInputAddressComponentError) uiComponentErrorA;
        Map<String, String> message2 = uiInputAddressComponentError.getMessage();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry<String, String> entry2 : message2.entrySet()) {
            if (!Intrinsics.c(entry2.getKey(), subComponentName)) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        uiInputAddressComponentError.setMessage(linkedHashMap2);
        return componentErrors;
    }

    public final void H(@NotNull UiWorkflow.Input renderProps, @NotNull final UiState.Displaying renderState, @NotNull final vr.f<UiState> context, @NotNull final UiComponent component, @NotNull final Function1<? super UiWorkflow.b, Unit> setOutput) {
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
        if (component instanceof o4) {
            context.n(new FlowWorkflowWorker(component.getName(), ((o4) component).getTextController().a()), new Function1() { // from class: rr.a
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e0.I(context, renderState, component, this, (String) obj);
                }
            });
            if (component instanceof InputPhoneNumberComponent) {
                InputPhoneNumberComponent inputPhoneNumberComponent = (InputPhoneNumberComponent) component;
                context.n(new FlowWorkflowWorker(inputPhoneNumberComponent.getName() + ":country", inputPhoneNumberComponent.getCountryCodeOptionsController().a()), new Function1() { // from class: rr.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return e0.J(context, renderState, component, this, (List) obj);
                    }
                });
                return;
            }
            return;
        }
        if (component instanceof w3) {
            context.n(new FlowWorkflowWorker(component.getName(), ((w3) component).getSelectedOptionsController().a()), new Function1() { // from class: rr.o
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e0.N(context, renderState, component, this, (List) obj);
                }
            });
            return;
        }
        if (component instanceof s4) {
            context.n(new FlowWorkflowWorker(component.getName(), ((s4) component).getStringSetController().a()), new Function1() { // from class: rr.p
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e0.Y(context, renderState, component, this, (Set) obj);
                }
            });
            return;
        }
        if (component instanceof cr.b) {
            context.n(new FlowWorkflowWorker(component.getName() + "UpdateCollapsedState", ((cr.b) component).getIsAddressFieldCollapsed().a()), new Function1() { // from class: rr.q
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e0.g0(context, component, ((Boolean) obj).booleanValue());
                }
            });
            cr.b bVar = (cr.b) component;
            context.n(new FlowWorkflowWorker(component.getName() + "UpdateAddressStreet1", bVar.getTextControllerForAddressStreet1().a()), new Function1() { // from class: rr.r
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e0.h0(context, component, this, (String) obj);
                }
            });
            context.n(new FlowWorkflowWorker(component.getName() + "UpdateAddressStreet2", bVar.getTextControllerForAddressStreet2().a()), new Function1() { // from class: rr.s
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e0.i0(context, component, this, (String) obj);
                }
            });
            context.n(new FlowWorkflowWorker(component.getName() + "UpdateAddressCity", bVar.getTextControllerForAddressCity().a()), new Function1() { // from class: rr.t
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e0.j0(context, component, this, (String) obj);
                }
            });
            context.n(new FlowWorkflowWorker(component.getName() + "UpdateAddressSubdivision", bVar.getTextControllerForAddressSubdivision().a()), new Function1() { // from class: rr.u
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e0.k0(context, component, this, (String) obj);
                }
            });
            context.n(new FlowWorkflowWorker(component.getName() + "UpdateAddressPostalCode", bVar.getTextControllerForAddressPostalCode().a()), new Function1() { // from class: rr.v
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e0.l0(context, component, this, (String) obj);
                }
            });
            if (component instanceof InputAddressComponent) {
                InputAddressComponent inputAddressComponent = (InputAddressComponent) component;
                if (inputAddressComponent.getAutocompleteMethod() == er.b.Server) {
                    String searchQuery = inputAddressComponent.getSearchQuery();
                    if (searchQuery != null) {
                        context.n(vr.g.a(this.addressAutocompleteWorker.a(renderProps.getSessionToken(), component, searchQuery), "autocomplete_" + inputAddressComponent.getName()), new Function1() { // from class: rr.l
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return e0.K(context, component, obj);
                            }
                        });
                    }
                    String selectedSearchResultId = inputAddressComponent.getSelectedSearchResultId();
                    if (selectedSearchResultId != null) {
                        context.n(this.addressDetailsWorker.a(renderProps.getSessionToken(), selectedSearchResultId), new Function1() { // from class: rr.w
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return e0.L(context, component, setOutput, (qr.a.b) obj);
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
        if (component instanceof m4) {
            context.n(new FlowWorkflowWorker(component.getName(), ((m4) component).getTwoStateViewController().a()), new Function1() { // from class: rr.x
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e0.M(context, renderState, component, ((Boolean) obj).booleanValue());
                }
            });
            return;
        }
        if (component instanceof n4) {
            context.n(new FlowWorkflowWorker(component.getName(), ((n4) component).getNumberController().a()), new Function1() { // from class: rr.y
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e0.O(context, renderState, component, this, (Number) obj);
                }
            });
            return;
        }
        if (component instanceof cr.c) {
            context.n(new FlowWorkflowWorker(component.getName(), ((cr.c) component).getBitmapController().a()), new Function1() { // from class: rr.z
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e0.P(context, renderState, component, (Bitmap) obj);
                }
            });
            return;
        }
        if (component instanceof cr.l) {
            context.n(new FlowWorkflowWorker(component.getName(), ((cr.l) component).getDateController().e()), new Function1() { // from class: rr.a0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e0.Q(context, renderState, component, this, (String) obj);
                }
            });
            return;
        }
        if (component instanceof GovernmentIdNfcScanComponent) {
            GovernmentIdNfcScanComponent governmentIdNfcScanComponent = (GovernmentIdNfcScanComponent) component;
            context.n(new FlowWorkflowWorker(governmentIdNfcScanComponent.getName() + "UpdateCardAccessNumber", governmentIdNfcScanComponent.getCardAccessNumberController().a()), new Function1() { // from class: rr.b0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e0.R(context, renderState, component, this, (String) obj);
                }
            });
            context.n(new FlowWorkflowWorker(governmentIdNfcScanComponent.getName() + "UpdateDocumentNumber", governmentIdNfcScanComponent.getDocumentNumberController().a()), new Function1() { // from class: rr.c0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e0.S(context, renderState, component, this, (String) obj);
                }
            });
            context.n(new FlowWorkflowWorker(governmentIdNfcScanComponent.getName() + "UpdateDateOfBirth", governmentIdNfcScanComponent.getDateOfBirthController().e()), new Function1() { // from class: rr.d0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e0.T(context, renderState, component, this, (String) obj);
                }
            });
            context.n(new FlowWorkflowWorker(governmentIdNfcScanComponent.getName() + "UpdateExpirationDate", governmentIdNfcScanComponent.getExpirationDateController().e()), new Function1() { // from class: rr.b
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e0.U(context, renderState, component, this, (String) obj);
                }
            });
            context.n(new FlowWorkflowWorker(governmentIdNfcScanComponent.getName(), governmentIdNfcScanComponent.getNfcDataController().a()), new Function1() { // from class: rr.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e0.V(context, renderState, component, (GovernmentIdNfcData) obj);
                }
            });
            return;
        }
        if (component instanceof InputInternationalDbComponent) {
            InputInternationalDbComponent inputInternationalDbComponent = (InputInternationalDbComponent) component;
            context.n(new FlowWorkflowWorker(inputInternationalDbComponent.getName() + ":country", inputInternationalDbComponent.getCountryOptionsController().a()), new Function1() { // from class: rr.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e0.W(context, renderState, component, this, (List) obj);
                }
            });
            context.n(new FlowWorkflowWorker(inputInternationalDbComponent.getName() + ":idType", inputInternationalDbComponent.getIdTypeOptionsController().a()), new Function1() { // from class: rr.f
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e0.X(context, renderState, component, this, (List) obj);
                }
            });
            context.n(new FlowWorkflowWorker(inputInternationalDbComponent.getName() + ":idValue", inputInternationalDbComponent.getIdValueController().a()), new Function1() { // from class: rr.g
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e0.Z(context, renderState, component, this, (String) obj);
                }
            });
            return;
        }
        if (component instanceof JpMyNumberNfcScanComponent) {
            JpMyNumberNfcScanComponent jpMyNumberNfcScanComponent = (JpMyNumberNfcScanComponent) component;
            context.n(new FlowWorkflowWorker(jpMyNumberNfcScanComponent.getName() + ":scanResult", jpMyNumberNfcScanComponent.getScanResultController().a()), new Function1() { // from class: rr.h
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e0.a0(context, renderState, component, (JpMyNumberNfcScanResult) obj);
                }
            });
            return;
        }
        if (component instanceof MdocComponent) {
            MdocComponent mdocComponent = (MdocComponent) component;
            context.n(new FlowWorkflowWorker(mdocComponent.getName() + ":error", mdocComponent.getErrorTextController().a()), new Function1() { // from class: rr.i
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e0.b0(context, renderState, component, (String) obj);
                }
            });
            context.n(new FlowWorkflowWorker(mdocComponent.getName() + ":data", mdocComponent.getMdocDataController().a()), new Function1() { // from class: rr.j
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e0.c0(context, renderState, component, (String) obj);
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
            context.n(vr.g.a(this.silentNetworkAuthWorker.a(this.applicationContext, new SilentNetworkAuthConfig(checkUrl, 0, 0L, 6, null), attributes3 != null ? attributes3.getTimeoutSeconds() : 10), phoneNumberSnaComponent.getName()), new Function1() { // from class: rr.k
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e0.d0(component, context, renderState, obj);
                }
            });
            return;
        }
        if (component instanceof InputFileUploadComponent) {
            InputFileUploadComponent inputFileUploadComponent = (InputFileUploadComponent) component;
            context.n(new FlowWorkflowWorker(inputFileUploadComponent.getName() + "_pick_request", inputFileUploadComponent.getFileUploadController().a()), new Function1() { // from class: rr.m
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e0.e0(context, renderState, component, (Unit) obj);
                }
            });
            if (Intrinsics.c(renderState.getFilePickComponentName(), inputFileUploadComponent.getName())) {
                UiComponentConfig uiComponentConfigE = E(renderProps.getComponents(), inputFileUploadComponent.getName());
                InputFileUpload inputFileUpload = uiComponentConfigE instanceof InputFileUpload ? (InputFileUpload) uiComponentConfigE : null;
                int iIntValue = 1;
                if (inputFileUpload == null || (attributes2 = inputFileUpload.getAttributes()) == null || (allowedFileTypes = attributes2.getAllowedFileTypes()) == null || (strArr = (String[]) allowedFileTypes.toArray(new String[0])) == null) {
                    strArr = new String[]{"*/*"};
                }
                if (inputFileUpload != null && (attributes = inputFileUpload.getAttributes()) != null && (fileUploadLimit = attributes.getFileUploadLimit()) != null) {
                    iIntValue = fileUploadLimit.intValue();
                }
                context.n(this.fileSelectWorkerFactory.b(inputFileUploadComponent.getName() + "_" + renderState.getFilePickRequestId(), strArr, iIntValue), new Function1() { // from class: rr.n
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return e0.f0(component, context, renderState, (com.withpersona.sdk2.inquiry.ui.h.b) obj);
                    }
                });
            }
        }
    }
}
