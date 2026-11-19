package hs;

import android.content.Context;
import android.graphics.Bitmap;
import com.github.luben.zstd.BuildConfig;
import com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.GovernmentIdNfcScan;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputFileUpload;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.PhoneNumberSna;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentContainerConfig;
import com.withpersona.sdk2.inquiry.steps.ui.components.GovernmentIdNfcScanComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputAddressComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputFileUploadComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputInternationalDbComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputPhoneNumberComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.JpMyNumberNfcScanComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.MdocComponent;
import es.g2;
import es.i4;
import es.k4;
import es.m1;
import es.s6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ls.FlowWorkflowWorker;
import nr.SilentNetworkAuthConfig;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.collections.CollectionsKt;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.internal.Intrinsics;
import qr.Option;
import qr.PhoneNumberSnaComponent;
import qr.h5;
import qr.i5;
import qr.j5;
import qr.o5;
import qr.x5;
import sr.GovernmentIdNfcData;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ?\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u001c\u001a\u0004\u0018\u00010\u00192\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00102\u0006\u0010\u001b\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJG\u0010)\u001a\u00020'2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010\u0014\u001a\u00020\u00132\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u00065"}, d2 = {"Lhs/e0;", BuildConfig.FLAVOR, "Landroid/content/Context;", "applicationContext", "Lcom/withpersona/sdk2/inquiry/ui/network/b$a;", "addressAutocompleteWorker", "Lgs/a$a;", "addressDetailsWorker", "Lnr/b$a;", "silentNetworkAuthWorker", "Les/k4$a;", "fileSelectWorkerFactory", "<init>", "(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/ui/network/b$a;Lgs/a$a;Lnr/b$a;Les/k4$a;)V", BuildConfig.FLAVOR, "isFieldBlank", BuildConfig.FLAVOR, "Les/g2;", "componentErrors", "Lqr/x5;", "component", BuildConfig.FLAVOR, "subComponentName", "F", "(ZLjava/util/List;Lqr/x5;Ljava/lang/String;)Ljava/util/List;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "configs", "name", "E", "(Ljava/util/List;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "Les/s6$b;", "renderProps", "Les/i4$a;", "renderState", "Lls/g;", "Les/i4;", "context", "Lkotlin/Function1;", "Les/s6$c;", BuildConfig.FLAVOR, "setOutput", "H", "(Les/s6$b;Les/i4$a;Lls/g;Lqr/x5;Lkotlin/jvm/functions/Function1;)V", "a", "Landroid/content/Context;", "b", "Lcom/withpersona/sdk2/inquiry/ui/network/b$a;", "c", "Lgs/a$a;", "d", "Lnr/b$a;", "e", "Les/k4$a;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context applicationContext;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.inquiry.ui.network.b.a addressAutocompleteWorker;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final gs.a.C0332a addressDetailsWorker;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final nr.b.a silentNetworkAuthWorker;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final k4.a fileSelectWorkerFactory;

    public e0(@NotNull Context applicationContext, @NotNull com.withpersona.sdk2.inquiry.ui.network.b.a addressAutocompleteWorker, @NotNull gs.a.C0332a addressDetailsWorker, @NotNull nr.b.a silentNetworkAuthWorker, @NotNull k4.a fileSelectWorkerFactory) {
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

    public static /* synthetic */ List G(e0 e0Var, boolean z10, List list, x5 x5Var, String str, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            str = null;
        }
        return e0Var.F(z10, list, x5Var, str);
    }

    public static final Unit I(ls.g gVar, i4.Displaying displaying, x5 x5Var, e0 e0Var, String newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        gVar.p(i4.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.g.m(displaying.getComponents(), x5Var, ((j5) x5Var).a(newText)), null, G(e0Var, newText.length() == 0, displaying.x(), x5Var, null, 8, null), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f21506a;
    }

    public static final Unit J(ls.g gVar, i4.Displaying displaying, x5 x5Var, e0 e0Var, List newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        gVar.p(i4.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.g.m(displaying.getComponents(), x5Var, ((InputPhoneNumberComponent) x5Var).u((Option) CollectionsKt.firstOrNull(newText))), null, G(e0Var, newText.isEmpty(), displaying.x(), x5Var, null, 8, null), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f21506a;
    }

    public static final Unit K(ls.g gVar, x5 x5Var, Object obj) {
        ls.h hVarI = gVar.i();
        i4.Displaying displaying = hVarI instanceof i4.Displaying ? (i4.Displaying) hVarI : null;
        if (displaying == null) {
            return Unit.f21506a;
        }
        x5 x5VarG = com.withpersona.sdk2.inquiry.steps.ui.components.g.g(displaying.getComponents(), ((InputAddressComponent) x5Var).getName());
        InputAddressComponent inputAddressComponent = x5VarG instanceof InputAddressComponent ? (InputAddressComponent) x5VarG : null;
        if (inputAddressComponent == null) {
            return Unit.f21506a;
        }
        if (obj instanceof com.withpersona.sdk2.inquiry.ui.network.b.AbstractC0196b.C0197b) {
            gVar.p(i4.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.g.m(displaying.getComponents(), inputAddressComponent, inputAddressComponent.U(((com.withpersona.sdk2.inquiry.ui.network.b.AbstractC0196b.C0197b) obj).a()).T(null).V(null)), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262142, null));
        }
        return Unit.f21506a;
    }

    public static final Unit L(ls.g gVar, x5 x5Var, Function1 function1, gs.a.b response) {
        Intrinsics.checkNotNullParameter(response, "response");
        ls.h hVarI = gVar.i();
        i4.Displaying displaying = hVarI instanceof i4.Displaying ? (i4.Displaying) hVarI : null;
        if (displaying == null) {
            return Unit.f21506a;
        }
        x5 x5VarG = com.withpersona.sdk2.inquiry.steps.ui.components.g.g(displaying.getComponents(), ((InputAddressComponent) x5Var).getName());
        InputAddressComponent inputAddressComponent = x5VarG instanceof InputAddressComponent ? (InputAddressComponent) x5VarG : null;
        if (inputAddressComponent == null) {
            return Unit.f21506a;
        }
        if (response instanceof gs.a.b.C0334b) {
            Boolean bool = Boolean.FALSE;
            gs.a.b.C0334b c0334b = (gs.a.b.C0334b) response;
            InputAddressComponent inputAddressComponentQ = inputAddressComponent.o(bool).q(c0334b.getResult().getAddressStreet1());
            String addressStreet2 = c0334b.getResult().getAddressStreet2();
            if (addressStreet2 == null) {
                addressStreet2 = BuildConfig.FLAVOR;
            }
            InputAddressComponent inputAddressComponentS = inputAddressComponentQ.j(addressStreet2).k(c0334b.getResult().getAddressCity()).s(c0334b.getResult().getAddressSubdivision()).p(c0334b.getResult().getAddressPostalCode()).T(null).V(null).S(bool);
            gVar.p(i4.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.g.m(displaying.getComponents(), inputAddressComponent, inputAddressComponentS), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262142, null));
            inputAddressComponentS.getTextControllerForAddressStreet1().c(inputAddressComponentS.getStreet1());
            inputAddressComponentS.getTextControllerForAddressStreet2().c(inputAddressComponentS.getStreet2());
            inputAddressComponentS.getTextControllerForAddressCity().c(inputAddressComponentS.getCity());
            inputAddressComponentS.getTextControllerForAddressSubdivision().c(inputAddressComponentS.getSubdivision());
            inputAddressComponentS.getTextControllerForAddressPostalCode().c(inputAddressComponentS.getPostalCode());
        } else {
            if (!(response instanceof gs.a.b.C0333a)) {
                throw new zt.l();
            }
            function1.invoke(new s6.c.d("Couldn't load address.", ((gs.a.b.C0333a) response).getCause()));
        }
        return Unit.f21506a;
    }

    public static final Unit M(ls.g gVar, i4.Displaying displaying, x5 x5Var, boolean z10) {
        gVar.p(i4.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.g.m(displaying.getComponents(), x5Var, ((h5) x5Var).a(z10)), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262142, null));
        return Unit.f21506a;
    }

    public static final Unit N(ls.g gVar, i4.Displaying displaying, x5 x5Var, e0 e0Var, List selectedOptions) {
        Intrinsics.checkNotNullParameter(selectedOptions, "selectedOptions");
        gVar.p(i4.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.g.m(displaying.getComponents(), x5Var, ((qr.k4) x5Var).k(selectedOptions)), null, G(e0Var, selectedOptions.isEmpty(), displaying.x(), x5Var, null, 8, null), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f21506a;
    }

    public static final Unit O(ls.g gVar, i4.Displaying displaying, x5 x5Var, e0 e0Var, Number number) {
        gVar.p(i4.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.g.m(displaying.getComponents(), x5Var, ((i5) x5Var).a(number)), null, G(e0Var, number == null, displaying.x(), x5Var, null, 8, null), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f21506a;
    }

    public static final Unit P(ls.g gVar, i4.Displaying displaying, x5 x5Var, Bitmap bitmap) {
        gVar.p(i4.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.g.m(displaying.getComponents(), x5Var, ((qr.e) x5Var).f(bitmap)), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262142, null));
        return Unit.f21506a;
    }

    public static final Unit Q(ls.g gVar, i4.Displaying displaying, x5 x5Var, e0 e0Var, String str) {
        gVar.p(i4.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.g.m(displaying.getComponents(), x5Var, ((qr.t) x5Var).a(str)), null, G(e0Var, str == null || str.length() == 0, displaying.x(), x5Var, null, 8, null), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f21506a;
    }

    public static final Unit R(ls.g gVar, i4.Displaying displaying, x5 x5Var, e0 e0Var, String newValue) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        gVar.p(i4.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.g.m(displaying.getComponents(), x5Var, ((GovernmentIdNfcScanComponent) x5Var).q(newValue)), null, e0Var.F(newValue.length() == 0, displaying.x(), x5Var, GovernmentIdNfcScan.cardAccessNumberName), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f21506a;
    }

    public static final Unit S(ls.g gVar, i4.Displaying displaying, x5 x5Var, e0 e0Var, String newValue) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        gVar.p(i4.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.g.m(displaying.getComponents(), x5Var, ((GovernmentIdNfcScanComponent) x5Var).s(newValue)), null, e0Var.F(newValue.length() == 0, displaying.x(), x5Var, GovernmentIdNfcScan.documentNumberName), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f21506a;
    }

    public static final Unit T(ls.g gVar, i4.Displaying displaying, x5 x5Var, e0 e0Var, String str) {
        gVar.p(i4.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.g.m(displaying.getComponents(), x5Var, ((GovernmentIdNfcScanComponent) x5Var).r(str)), null, e0Var.F(str == null || str.length() == 0, displaying.x(), x5Var, GovernmentIdNfcScan.dateOfBirthName), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f21506a;
    }

    public static final Unit U(ls.g gVar, i4.Displaying displaying, x5 x5Var, e0 e0Var, String str) {
        gVar.p(i4.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.g.m(displaying.getComponents(), x5Var, ((GovernmentIdNfcScanComponent) x5Var).t(str)), null, e0Var.F(str == null || str.length() == 0, displaying.x(), x5Var, GovernmentIdNfcScan.expirationDateName), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f21506a;
    }

    public static final Unit V(ls.g gVar, i4.Displaying displaying, x5 x5Var, GovernmentIdNfcData governmentIdNfcData) {
        gVar.p(i4.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.g.m(displaying.getComponents(), x5Var, ((GovernmentIdNfcScanComponent) x5Var).u(governmentIdNfcData)), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262142, null));
        return Unit.f21506a;
    }

    public static final Unit W(ls.g gVar, i4.Displaying displaying, x5 x5Var, e0 e0Var, List newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        gVar.p(i4.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.g.m(displaying.getComponents(), x5Var, ((InputInternationalDbComponent) x5Var).z((Option) CollectionsKt.firstOrNull(newText))), null, G(e0Var, newText.isEmpty(), displaying.x(), x5Var, null, 8, null), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f21506a;
    }

    public static final Unit X(ls.g gVar, i4.Displaying displaying, x5 x5Var, e0 e0Var, List newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        gVar.p(i4.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.g.m(displaying.getComponents(), x5Var, ((InputInternationalDbComponent) x5Var).B((Option) CollectionsKt.firstOrNull(newText))), null, G(e0Var, newText.isEmpty(), displaying.x(), x5Var, null, 8, null), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f21506a;
    }

    public static final Unit Y(ls.g gVar, i4.Displaying displaying, x5 x5Var, e0 e0Var, Set stringSet) {
        Intrinsics.checkNotNullParameter(stringSet, "stringSet");
        gVar.p(i4.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.g.m(displaying.getComponents(), x5Var, ((o5) x5Var).a(stringSet)), null, G(e0Var, stringSet.isEmpty(), displaying.x(), x5Var, null, 8, null), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f21506a;
    }

    public static final Unit Z(ls.g gVar, i4.Displaying displaying, x5 x5Var, e0 e0Var, String newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        gVar.p(i4.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.g.m(displaying.getComponents(), x5Var, ((InputInternationalDbComponent) x5Var).C(newText)), null, G(e0Var, newText.length() == 0, displaying.x(), x5Var, null, 8, null), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f21506a;
    }

    public static final Unit a0(ls.g gVar, i4.Displaying displaying, x5 x5Var, zp.o oVar) {
        gVar.p(i4.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.g.m(displaying.getComponents(), x5Var, ((JpMyNumberNfcScanComponent) x5Var).l(oVar)), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262142, null));
        return Unit.f21506a;
    }

    public static final Unit b0(ls.g gVar, i4.Displaying displaying, x5 x5Var, String newValue) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        gVar.p(i4.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.g.m(displaying.getComponents(), x5Var, ((MdocComponent) x5Var).p(newValue)), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262142, null));
        return Unit.f21506a;
    }

    public static final Unit c0(ls.g gVar, i4.Displaying displaying, x5 x5Var, String newValue) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        MdocComponent mdocComponent = (MdocComponent) x5Var;
        gVar.p(m1.b(i4.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.g.m(displaying.getComponents(), x5Var, mdocComponent.q(newValue)), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262142, null), mdocComponent.getSuccessfulMdocRetrievalTransitionComponentName()));
        return Unit.f21506a;
    }

    public static final Unit d0(x5 x5Var, ls.g gVar, i4.Displaying displaying, Object obj) {
        PhoneNumberSnaComponent phoneNumberSnaComponentL;
        if (obj instanceof nr.d.b.C0532b) {
            phoneNumberSnaComponentL = ((PhoneNumberSnaComponent) x5Var).l(((nr.d.b.C0532b) obj).a(), null, null);
        } else {
            if (!(obj instanceof nr.d.b.Error)) {
                return Unit.f21506a;
            }
            nr.d.b.Error error = (nr.d.b.Error) obj;
            phoneNumberSnaComponentL = ((PhoneNumberSnaComponent) x5Var).l(null, error.getErrorName(), error.getErrorMessage());
        }
        gVar.p(i4.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.g.m(displaying.getComponents(), x5Var, phoneNumberSnaComponentL), null, null, null, null, null, null, new i4.Displaying.AutoSubmit(phoneNumberSnaComponentL, 0, null), null, false, false, null, null, null, false, 0, null, 0, 262014, null));
        return Unit.f21506a;
    }

    public static final Unit e0(ls.g gVar, i4.Displaying displaying, x5 x5Var, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        gVar.p(i4.Displaying.v(displaying, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, ((InputFileUploadComponent) x5Var).getName(), displaying.getFilePickRequestId() + 1, 65535, null));
        return Unit.f21506a;
    }

    public static final Unit f0(x5 x5Var, ls.g gVar, i4.Displaying displaying, k4.b output) {
        Intrinsics.checkNotNullParameter(output, "output");
        if (output instanceof k4.b.Success) {
            gVar.p(i4.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.g.m(displaying.getComponents(), x5Var, ((InputFileUploadComponent) x5Var).l(((k4.b.Success) output).a())), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 196606, null));
        } else {
            if (!(output instanceof k4.b.a) && !(output instanceof k4.b.C0277b)) {
                throw new zt.l();
            }
            gVar.p(i4.Displaying.v(displaying, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 196607, null));
        }
        return Unit.f21506a;
    }

    public static final Unit g0(ls.g gVar, x5 x5Var, boolean z10) {
        ls.h hVarI = gVar.i();
        i4.Displaying displaying = hVarI instanceof i4.Displaying ? (i4.Displaying) hVarI : null;
        if (displaying == null) {
            return Unit.f21506a;
        }
        gVar.p(i4.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.g.m(displaying.getComponents(), x5Var, ((qr.c) x5Var).o(Boolean.valueOf(z10))), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262142, null));
        return Unit.f21506a;
    }

    public static final Unit h0(ls.g gVar, x5 x5Var, e0 e0Var, String newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        ls.h hVarI = gVar.i();
        i4.Displaying displaying = hVarI instanceof i4.Displaying ? (i4.Displaying) hVarI : null;
        if (displaying == null) {
            return Unit.f21506a;
        }
        gVar.p(i4.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.g.m(displaying.getComponents(), x5Var, ((qr.c) x5Var).q(newText).T(newText)), null, e0Var.F(newText.length() == 0, displaying.x(), x5Var, "street_1"), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f21506a;
    }

    public static final Unit i0(ls.g gVar, x5 x5Var, e0 e0Var, String newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        ls.h hVarI = gVar.i();
        i4.Displaying displaying = hVarI instanceof i4.Displaying ? (i4.Displaying) hVarI : null;
        if (displaying == null) {
            return Unit.f21506a;
        }
        gVar.p(i4.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.g.m(displaying.getComponents(), x5Var, ((qr.c) x5Var).j(newText)), null, e0Var.F(newText.length() == 0, displaying.x(), x5Var, "street_2"), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f21506a;
    }

    public static final Unit j0(ls.g gVar, x5 x5Var, e0 e0Var, String newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        ls.h hVarI = gVar.i();
        i4.Displaying displaying = hVarI instanceof i4.Displaying ? (i4.Displaying) hVarI : null;
        if (displaying == null) {
            return Unit.f21506a;
        }
        gVar.p(i4.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.g.m(displaying.getComponents(), x5Var, ((qr.c) x5Var).k(newText)), null, e0Var.F(newText.length() == 0, displaying.x(), x5Var, "city"), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f21506a;
    }

    public static final Unit k0(ls.g gVar, x5 x5Var, e0 e0Var, String newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        ls.h hVarI = gVar.i();
        i4.Displaying displaying = hVarI instanceof i4.Displaying ? (i4.Displaying) hVarI : null;
        if (displaying == null) {
            return Unit.f21506a;
        }
        gVar.p(i4.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.g.m(displaying.getComponents(), x5Var, ((qr.c) x5Var).s(newText)), null, e0Var.F(newText.length() == 0, displaying.x(), x5Var, "subdivision"), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f21506a;
    }

    public static final Unit l0(ls.g gVar, x5 x5Var, e0 e0Var, String newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        ls.h hVarI = gVar.i();
        i4.Displaying displaying = hVarI instanceof i4.Displaying ? (i4.Displaying) hVarI : null;
        if (displaying == null) {
            return Unit.f21506a;
        }
        gVar.p(i4.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.g.m(displaying.getComponents(), x5Var, ((qr.c) x5Var).p(newText)), null, e0Var.F(newText.length() == 0, displaying.x(), x5Var, "postal_code"), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f21506a;
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

    public final List<g2> F(boolean isFieldBlank, List<g2> componentErrors, x5 component, String subComponentName) {
        Object next;
        List<g2> list = componentErrors;
        Iterator<T> it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.c(((g2) next).getName(), component.getName()));
        g2 g2Var = (g2) next;
        if (isFieldBlank) {
            return componentErrors;
        }
        UiComponentError uiComponentErrorA = g2Var != null ? g2Var.a(component.getLastValueUpdateTs()) : null;
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
                if (!Intrinsics.c(((g2) obj).getName(), component.getName())) {
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

    public final void H(@NotNull s6.Input renderProps, @NotNull final i4.Displaying renderState, @NotNull final ls.g<i4> context, @NotNull final x5 component, @NotNull final Function1<? super s6.c, Unit> setOutput) {
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
        if (component instanceof j5) {
            context.n(new FlowWorkflowWorker(component.getName(), ((j5) component).getTextController().a()), new Function1() { // from class: hs.a
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e0.I(context, renderState, component, this, (String) obj);
                }
            });
            if (component instanceof InputPhoneNumberComponent) {
                InputPhoneNumberComponent inputPhoneNumberComponent = (InputPhoneNumberComponent) component;
                context.n(new FlowWorkflowWorker(inputPhoneNumberComponent.getName() + ":country", inputPhoneNumberComponent.getCountryCodeOptionsController().a()), new Function1() { // from class: hs.c
                    @Override // p001kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return e0.J(context, renderState, component, this, (List) obj);
                    }
                });
                return;
            }
            return;
        }
        if (component instanceof qr.k4) {
            context.n(new FlowWorkflowWorker(component.getName(), ((qr.k4) component).getSelectedOptionsController().a()), new Function1() { // from class: hs.o
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e0.N(context, renderState, component, this, (List) obj);
                }
            });
            return;
        }
        if (component instanceof o5) {
            context.n(new FlowWorkflowWorker(component.getName(), ((o5) component).getStringSetController().a()), new Function1() { // from class: hs.p
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e0.Y(context, renderState, component, this, (Set) obj);
                }
            });
            return;
        }
        if (component instanceof qr.c) {
            context.n(new FlowWorkflowWorker(component.getName() + "UpdateCollapsedState", ((qr.c) component).getIsAddressFieldCollapsed().a()), new Function1() { // from class: hs.q
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e0.g0(context, component, ((Boolean) obj).booleanValue());
                }
            });
            qr.c cVar = (qr.c) component;
            context.n(new FlowWorkflowWorker(component.getName() + "UpdateAddressStreet1", cVar.getTextControllerForAddressStreet1().a()), new Function1() { // from class: hs.r
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e0.h0(context, component, this, (String) obj);
                }
            });
            context.n(new FlowWorkflowWorker(component.getName() + "UpdateAddressStreet2", cVar.getTextControllerForAddressStreet2().a()), new Function1() { // from class: hs.s
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e0.i0(context, component, this, (String) obj);
                }
            });
            context.n(new FlowWorkflowWorker(component.getName() + "UpdateAddressCity", cVar.getTextControllerForAddressCity().a()), new Function1() { // from class: hs.t
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e0.j0(context, component, this, (String) obj);
                }
            });
            context.n(new FlowWorkflowWorker(component.getName() + "UpdateAddressSubdivision", cVar.getTextControllerForAddressSubdivision().a()), new Function1() { // from class: hs.u
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e0.k0(context, component, this, (String) obj);
                }
            });
            context.n(new FlowWorkflowWorker(component.getName() + "UpdateAddressPostalCode", cVar.getTextControllerForAddressPostalCode().a()), new Function1() { // from class: hs.v
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e0.l0(context, component, this, (String) obj);
                }
            });
            if (component instanceof InputAddressComponent) {
                InputAddressComponent inputAddressComponent = (InputAddressComponent) component;
                if (inputAddressComponent.getAutocompleteMethod() == sr.b.Server) {
                    String searchQuery = inputAddressComponent.getSearchQuery();
                    if (searchQuery != null) {
                        context.n(ls.i.a(this.addressAutocompleteWorker.a(renderProps.getSessionToken(), component, searchQuery), "autocomplete_" + inputAddressComponent.getName()), new Function1() { // from class: hs.l
                            @Override // p001kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return e0.K(context, component, obj);
                            }
                        });
                    }
                    String selectedSearchResultId = inputAddressComponent.getSelectedSearchResultId();
                    if (selectedSearchResultId != null) {
                        context.n(this.addressDetailsWorker.a(renderProps.getSessionToken(), selectedSearchResultId), new Function1() { // from class: hs.w
                            @Override // p001kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return e0.L(context, component, setOutput, (gs.a.b) obj);
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
        if (component instanceof h5) {
            context.n(new FlowWorkflowWorker(component.getName(), ((h5) component).getTwoStateViewController().a()), new Function1() { // from class: hs.x
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e0.M(context, renderState, component, ((Boolean) obj).booleanValue());
                }
            });
            return;
        }
        if (component instanceof i5) {
            context.n(new FlowWorkflowWorker(component.getName(), ((i5) component).getNumberController().a()), new Function1() { // from class: hs.y
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e0.O(context, renderState, component, this, (Number) obj);
                }
            });
            return;
        }
        if (component instanceof qr.e) {
            context.n(new FlowWorkflowWorker(component.getName(), ((qr.e) component).getBitmapController().a()), new Function1() { // from class: hs.z
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e0.P(context, renderState, component, (Bitmap) obj);
                }
            });
            return;
        }
        if (component instanceof qr.t) {
            context.n(new FlowWorkflowWorker(component.getName(), ((qr.t) component).getDateController().e()), new Function1() { // from class: hs.a0
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e0.Q(context, renderState, component, this, (String) obj);
                }
            });
            return;
        }
        if (component instanceof GovernmentIdNfcScanComponent) {
            GovernmentIdNfcScanComponent governmentIdNfcScanComponent = (GovernmentIdNfcScanComponent) component;
            context.n(new FlowWorkflowWorker(governmentIdNfcScanComponent.getName() + "UpdateCardAccessNumber", governmentIdNfcScanComponent.getCardAccessNumberController().a()), new Function1() { // from class: hs.b0
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e0.R(context, renderState, component, this, (String) obj);
                }
            });
            context.n(new FlowWorkflowWorker(governmentIdNfcScanComponent.getName() + "UpdateDocumentNumber", governmentIdNfcScanComponent.getDocumentNumberController().a()), new Function1() { // from class: hs.c0
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e0.S(context, renderState, component, this, (String) obj);
                }
            });
            context.n(new FlowWorkflowWorker(governmentIdNfcScanComponent.getName() + "UpdateDateOfBirth", governmentIdNfcScanComponent.getDateOfBirthController().e()), new Function1() { // from class: hs.d0
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e0.T(context, renderState, component, this, (String) obj);
                }
            });
            context.n(new FlowWorkflowWorker(governmentIdNfcScanComponent.getName() + "UpdateExpirationDate", governmentIdNfcScanComponent.getExpirationDateController().e()), new Function1() { // from class: hs.b
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e0.U(context, renderState, component, this, (String) obj);
                }
            });
            context.n(new FlowWorkflowWorker(governmentIdNfcScanComponent.getName(), governmentIdNfcScanComponent.getNfcDataController().a()), new Function1() { // from class: hs.d
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e0.V(context, renderState, component, (GovernmentIdNfcData) obj);
                }
            });
            return;
        }
        if (component instanceof InputInternationalDbComponent) {
            InputInternationalDbComponent inputInternationalDbComponent = (InputInternationalDbComponent) component;
            context.n(new FlowWorkflowWorker(inputInternationalDbComponent.getName() + ":country", inputInternationalDbComponent.getCountryOptionsController().a()), new Function1() { // from class: hs.e
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e0.W(context, renderState, component, this, (List) obj);
                }
            });
            context.n(new FlowWorkflowWorker(inputInternationalDbComponent.getName() + ":idType", inputInternationalDbComponent.getIdTypeOptionsController().a()), new Function1() { // from class: hs.f
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e0.X(context, renderState, component, this, (List) obj);
                }
            });
            context.n(new FlowWorkflowWorker(inputInternationalDbComponent.getName() + ":idValue", inputInternationalDbComponent.getIdValueController().a()), new Function1() { // from class: hs.g
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e0.Z(context, renderState, component, this, (String) obj);
                }
            });
            return;
        }
        if (component instanceof JpMyNumberNfcScanComponent) {
            JpMyNumberNfcScanComponent jpMyNumberNfcScanComponent = (JpMyNumberNfcScanComponent) component;
            context.n(new FlowWorkflowWorker(jpMyNumberNfcScanComponent.getName() + ":scanResult", jpMyNumberNfcScanComponent.getScanResultController().a()), new Function1() { // from class: hs.h
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e0.a0(context, renderState, component, (zp.o) obj);
                }
            });
            return;
        }
        if (component instanceof MdocComponent) {
            MdocComponent mdocComponent = (MdocComponent) component;
            context.n(new FlowWorkflowWorker(mdocComponent.getName() + ":error", mdocComponent.getErrorTextController().a()), new Function1() { // from class: hs.i
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e0.b0(context, renderState, component, (String) obj);
                }
            });
            context.n(new FlowWorkflowWorker(mdocComponent.getName() + ":data", mdocComponent.getMdocDataController().a()), new Function1() { // from class: hs.j
                @Override // p001kotlin.jvm.functions.Function1
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
                checkUrl = BuildConfig.FLAVOR;
            }
            context.n(ls.i.a(this.silentNetworkAuthWorker.a(this.applicationContext, new SilentNetworkAuthConfig(checkUrl, 0, 0L, 6, null), attributes3 != null ? attributes3.getTimeoutSeconds() : 10), phoneNumberSnaComponent.getName()), new Function1() { // from class: hs.k
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e0.d0(component, context, renderState, obj);
                }
            });
            return;
        }
        if (component instanceof InputFileUploadComponent) {
            InputFileUploadComponent inputFileUploadComponent = (InputFileUploadComponent) component;
            context.n(new FlowWorkflowWorker(inputFileUploadComponent.getName() + "_pick_request", inputFileUploadComponent.getFileUploadController().a()), new Function1() { // from class: hs.m
                @Override // p001kotlin.jvm.functions.Function1
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
                context.n(this.fileSelectWorkerFactory.b(inputFileUploadComponent.getName() + "_" + renderState.getFilePickRequestId(), strArr, iIntValue), new Function1() { // from class: hs.n
                    @Override // p001kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return e0.f0(component, context, renderState, (k4.b) obj);
                    }
                });
            }
        }
    }
}
