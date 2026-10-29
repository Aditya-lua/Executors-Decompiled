package com.withpersona.sdk2.inquiry.p057ui;

import android.content.Context;
import android.graphics.Bitmap;
import com.withpersona.sdk2.inquiry.jpmynumber.JpMyNumberNfcScanResult;
import com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.GovernmentIdNfcScan;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.InputFileUpload;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.PhoneNumberSna;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.UiComponentContainerConfig;
import com.withpersona.sdk2.inquiry.p057ui.C4148a;
import com.withpersona.sdk2.inquiry.p057ui.C4155h;
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
import kotlin.jvm.internal.C7731d0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import nu.InterfaceC9575h;
import org.jetbrains.annotations.NotNull;
import p229jt.C7345l;
import p392qr.C10701a;
import p581ym.AbstractC13218k;
import p581ym.AbstractC13225r;
import p581ym.C13208b0;
import p581ym.C13230w;
import p581ym.InterfaceC13222o;
import p581ym.TypedWorker;
import p612zq.C14035a;
import p612zq.InterfaceC14037c;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.a */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J?\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00170\u000e2\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u000e2\u0006\u0010\u001a\u001a\u00020\u00192\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJM\u0010)\u001a\u00020(2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2&\u0010'\u001a\"0\"R\u001a\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00010$j\u0002`#2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u00065"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/ui/a;", "", "Landroid/content/Context;", "applicationContext", "Lcom/withpersona/sdk2/inquiry/ui/network/b$a;", "addressAutocompleteWorker", "Lqr/a$a;", "addressDetailsWorker", "Lzq/a$a;", "silentNetworkAuthWorker", "Lcom/withpersona/sdk2/inquiry/ui/h$a;", "fileSelectWorkerFactory", "<init>", "(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/ui/network/b$a;Lqr/a$a;Lzq/a$a;Lcom/withpersona/sdk2/inquiry/ui/h$a;)V", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "configs", "", "name", "k0", "(Ljava/util/List;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "", "isFieldBlank", "Lcom/withpersona/sdk2/inquiry/ui/UiComponentErrorInfo;", "componentErrors", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "component", "subComponentName", "l0", "(ZLjava/util/List;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Ljava/lang/String;)Ljava/util/List;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;", "renderProps", "Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;", "renderState", "Lym/k$a;", "Lcom/withpersona/sdk2/inquiry/ui/RenderContext;", "Lym/k;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$b;", "context", "", "n0", "(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;Lym/k$a;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)V", "a", "Landroid/content/Context;", "b", "Lcom/withpersona/sdk2/inquiry/ui/network/b$a;", "c", "Lqr/a$a;", "d", "Lzq/a$a;", "e", "Lcom/withpersona/sdk2/inquiry/ui/h$a;", "ui_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C4148a {

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

    public C4148a(@NotNull Context applicationContext, @NotNull C4178b.a addressAutocompleteWorker, @NotNull C10701a.a addressDetailsWorker, @NotNull C14035a.a silentNetworkAuthWorker, @NotNull C4155h.a fileSelectWorkerFactory) {
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

    /* JADX INFO: renamed from: A0 */
    public static final AbstractC13225r m21221A0(final UiState.Displaying displaying, final UiComponent uiComponent, final C4178b.b response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return C13208b0.m48847c(null, new Function1() { // from class: or.m0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4148a.m21223B0(response, displaying, uiComponent, (AbstractC13225r.c) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: B0 */
    public static final Unit m21223B0(C4178b.b bVar, UiState.Displaying displaying, UiComponent uiComponent, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (bVar instanceof C4178b.b.C14155b) {
            action.m48903e(UiState.Displaying.m20990v(displaying, C4086b.m20896m(displaying.getComponents(), uiComponent, ((InputAddressComponent) uiComponent).m20627U(((C4178b.b.C14155b) bVar).m21643a()).m20626T(null)), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262142, null));
        } else if (!(bVar instanceof C4178b.b.a)) {
            throw new C7345l();
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: C0 */
    public static final AbstractC13225r m21225C0(final UiState.Displaying displaying, final UiComponent uiComponent, final C4148a c4148a, final List newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        return C13208b0.m48847c(null, new Function1() { // from class: or.c1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4148a.m21227D0(displaying, uiComponent, newText, c4148a, (AbstractC13225r.c) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: D0 */
    public static final Unit m21227D0(UiState.Displaying displaying, UiComponent uiComponent, List list, C4148a c4148a, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48903e(UiState.Displaying.m20990v(displaying, C4086b.m20896m(displaying.getComponents(), uiComponent, ((InputPhoneNumberComponent) uiComponent).m20768u((Option) CollectionsKt.firstOrNull(list))), null, m21307m0(c4148a, list.isEmpty(), displaying.m21006x(), uiComponent, null, 8, null), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: E0 */
    public static final AbstractC13225r m21229E0(final UiComponent uiComponent, final UiState.Displaying displaying, final C10701a.b response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (response instanceof C10701a.b.C14235b) {
            return C13208b0.m48847c(null, new Function1() { // from class: or.o0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C4148a.m21231F0(uiComponent, response, displaying, (AbstractC13225r.c) obj);
                }
            }, 1, null);
        }
        if (response instanceof C10701a.b.a) {
            return C13208b0.m48847c(null, new Function1() { // from class: or.p0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C4148a.m21233G0(response, (AbstractC13225r.c) obj);
                }
            }, 1, null);
        }
        throw new C7345l();
    }

    /* JADX INFO: renamed from: F0 */
    public static final Unit m21231F0(UiComponent uiComponent, C10701a.b bVar, UiState.Displaying displaying, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Boolean bool = Boolean.FALSE;
        C10701a.b.C14235b c14235b = (C10701a.b.C14235b) bVar;
        InputAddressComponent inputAddressComponentMo20638q = ((InputAddressComponent) uiComponent).mo20636o(bool).mo20638q(c14235b.getResult().getAddressStreet1());
        String addressStreet2 = c14235b.getResult().getAddressStreet2();
        if (addressStreet2 == null) {
            addressStreet2 = "";
        }
        InputAddressComponent inputAddressComponentM20625S = inputAddressComponentMo20638q.mo20632j(addressStreet2).mo20633k(c14235b.getResult().getAddressCity()).mo20640s(c14235b.getResult().getAddressSubdivision()).mo20637p(c14235b.getResult().getAddressPostalCode()).m20628V(null).m20625S(bool);
        action.m48903e(UiState.Displaying.m20990v(displaying, C4086b.m20896m(displaying.getComponents(), uiComponent, inputAddressComponentM20625S), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262142, null));
        inputAddressComponentM20625S.getTextControllerForAddressStreet1().mo1451c(inputAddressComponentM20625S.getStreet1());
        inputAddressComponentM20625S.getTextControllerForAddressStreet2().mo1451c(inputAddressComponentM20625S.getStreet2());
        inputAddressComponentM20625S.getTextControllerForAddressCity().mo1451c(inputAddressComponentM20625S.getCity());
        inputAddressComponentM20625S.getTextControllerForAddressSubdivision().mo1451c(inputAddressComponentM20625S.getSubdivision());
        inputAddressComponentM20625S.getTextControllerForAddressPostalCode().mo1451c(inputAddressComponentM20625S.getPostalCode());
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: G0 */
    public static final Unit m21233G0(C10701a.b bVar, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48902d(new UiWorkflow.InterfaceC4141b.d("Couldn't load address.", ((C10701a.b.a) bVar).getCause()));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: H0 */
    public static final AbstractC13225r m21235H0(final UiState.Displaying displaying, final UiComponent uiComponent, final boolean z10) {
        return C13208b0.m48847c(null, new Function1() { // from class: or.e1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4148a.m21237I0(displaying, uiComponent, z10, (AbstractC13225r.c) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: I0 */
    public static final Unit m21237I0(UiState.Displaying displaying, UiComponent uiComponent, boolean z10, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48903e(UiState.Displaying.m20990v(displaying, C4086b.m20896m(displaying.getComponents(), uiComponent, ((InterfaceC4280m4) uiComponent).mo20650a(z10)), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262142, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: J0 */
    public static final AbstractC13225r m21239J0(final UiState.Displaying displaying, final UiComponent uiComponent, final C4148a c4148a, final Number number) {
        return C13208b0.m48847c(null, new Function1() { // from class: or.z0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4148a.m21241K0(displaying, uiComponent, number, c4148a, (AbstractC13225r.c) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: K0 */
    public static final Unit m21241K0(UiState.Displaying displaying, UiComponent uiComponent, Number number, C4148a c4148a, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48903e(UiState.Displaying.m20990v(displaying, C4086b.m20896m(displaying.getComponents(), uiComponent, ((InterfaceC4286n4) uiComponent).mo20676a(number)), null, m21307m0(c4148a, number == null, displaying.m21006x(), uiComponent, null, 8, null), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: L0 */
    public static final AbstractC13225r m21243L0(final UiState.Displaying displaying, final UiComponent uiComponent, final Bitmap bitmap) {
        return C13208b0.m48847c(null, new Function1() { // from class: or.t0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4148a.m21245M0(displaying, uiComponent, bitmap, (AbstractC13225r.c) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: M0 */
    public static final Unit m21245M0(UiState.Displaying displaying, UiComponent uiComponent, Bitmap bitmap, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48903e(UiState.Displaying.m20990v(displaying, C4086b.m20896m(displaying.getComponents(), uiComponent, ((InterfaceC4214c) uiComponent).mo20574f(bitmap)), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262142, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: N0 */
    public static final AbstractC13225r m21247N0(final UiState.Displaying displaying, final UiComponent uiComponent, final C4148a c4148a, final String str) {
        return C13208b0.m48847c(null, new Function1() { // from class: or.v0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4148a.m21249O0(displaying, uiComponent, str, c4148a, (AbstractC13225r.c) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: O0 */
    public static final Unit m21249O0(UiState.Displaying displaying, UiComponent uiComponent, String str, C4148a c4148a, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48903e(UiState.Displaying.m20990v(displaying, C4086b.m20896m(displaying.getComponents(), uiComponent, ((InterfaceC4269l) uiComponent).mo20686a(str)), null, m21307m0(c4148a, str == null || str.length() == 0, displaying.m21006x(), uiComponent, null, 8, null), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: P0 */
    public static final AbstractC13225r m21251P0(final UiState.Displaying displaying, final UiComponent uiComponent, final C4148a c4148a, final String newValue) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        return C13208b0.m48847c(null, new Function1() { // from class: or.g0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4148a.m21253Q0(displaying, uiComponent, newValue, c4148a, (AbstractC13225r.c) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: Q0 */
    public static final Unit m21253Q0(UiState.Displaying displaying, UiComponent uiComponent, String str, C4148a c4148a, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48903e(UiState.Displaying.m20990v(displaying, C4086b.m20896m(displaying.getComponents(), uiComponent, ((GovernmentIdNfcScanComponent) uiComponent).m20596q(str)), null, c4148a.m21346l0(str.length() == 0, displaying.m21006x(), uiComponent, GovernmentIdNfcScan.cardAccessNumberName), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: R0 */
    public static final AbstractC13225r m21255R0(final UiState.Displaying displaying, final UiComponent uiComponent, final C4148a c4148a, final String newValue) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        return C13208b0.m48847c(null, new Function1() { // from class: or.k0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4148a.m21257S0(displaying, uiComponent, newValue, c4148a, (AbstractC13225r.c) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: S0 */
    public static final Unit m21257S0(UiState.Displaying displaying, UiComponent uiComponent, String str, C4148a c4148a, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48903e(UiState.Displaying.m20990v(displaying, C4086b.m20896m(displaying.getComponents(), uiComponent, ((GovernmentIdNfcScanComponent) uiComponent).m20598s(str)), null, c4148a.m21346l0(str.length() == 0, displaying.m21006x(), uiComponent, GovernmentIdNfcScan.documentNumberName), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: T0 */
    public static final AbstractC13225r m21259T0(final UiState.Displaying displaying, final UiComponent uiComponent, final C4148a c4148a, final String str) {
        return C13208b0.m48847c(null, new Function1() { // from class: or.c0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4148a.m21261U0(displaying, uiComponent, str, c4148a, (AbstractC13225r.c) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: U0 */
    public static final Unit m21261U0(UiState.Displaying displaying, UiComponent uiComponent, String str, C4148a c4148a, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48903e(UiState.Displaying.m20990v(displaying, C4086b.m20896m(displaying.getComponents(), uiComponent, ((GovernmentIdNfcScanComponent) uiComponent).m20597r(str)), null, c4148a.m21346l0(str == null || str.length() == 0, displaying.m21006x(), uiComponent, GovernmentIdNfcScan.dateOfBirthName), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: V0 */
    public static final AbstractC13225r m21263V0(final UiState.Displaying displaying, final UiComponent uiComponent, final C4148a c4148a, final String str) {
        return C13208b0.m48847c(null, new Function1() { // from class: or.n0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4148a.m21265W0(displaying, uiComponent, str, c4148a, (AbstractC13225r.c) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: W0 */
    public static final Unit m21265W0(UiState.Displaying displaying, UiComponent uiComponent, String str, C4148a c4148a, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48903e(UiState.Displaying.m20990v(displaying, C4086b.m20896m(displaying.getComponents(), uiComponent, ((GovernmentIdNfcScanComponent) uiComponent).m20599t(str)), null, c4148a.m21346l0(str == null || str.length() == 0, displaying.m21006x(), uiComponent, GovernmentIdNfcScan.expirationDateName), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: X0 */
    public static final AbstractC13225r m21267X0(final UiState.Displaying displaying, final UiComponent uiComponent, final GovernmentIdNfcData governmentIdNfcData) {
        return C13208b0.m48847c(null, new Function1() { // from class: or.i0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4148a.m21269Y0(displaying, uiComponent, governmentIdNfcData, (AbstractC13225r.c) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: Y0 */
    public static final Unit m21269Y0(UiState.Displaying displaying, UiComponent uiComponent, GovernmentIdNfcData governmentIdNfcData, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48903e(UiState.Displaying.m20990v(displaying, C4086b.m20896m(displaying.getComponents(), uiComponent, ((GovernmentIdNfcScanComponent) uiComponent).m20600u(governmentIdNfcData)), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262142, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: Z0 */
    public static final AbstractC13225r m21271Z0(final UiState.Displaying displaying, final UiComponent uiComponent, final C4148a c4148a, final List selectedOptions) {
        Intrinsics.checkNotNullParameter(selectedOptions, "selectedOptions");
        return C13208b0.m48847c(null, new Function1() { // from class: or.y0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4148a.m21274a1(displaying, uiComponent, selectedOptions, c4148a, (AbstractC13225r.c) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: a1 */
    public static final Unit m21274a1(UiState.Displaying displaying, UiComponent uiComponent, List list, C4148a c4148a, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48903e(UiState.Displaying.m20990v(displaying, C4086b.m20896m(displaying.getComponents(), uiComponent, ((InterfaceC4339w3) uiComponent).mo20743k(list)), null, m21307m0(c4148a, list.isEmpty(), displaying.m21006x(), uiComponent, null, 8, null), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: b1 */
    public static final AbstractC13225r m21277b1(final UiState.Displaying displaying, final UiComponent uiComponent, final C4148a c4148a, final List newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        return C13208b0.m48847c(null, new Function1() { // from class: or.e0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4148a.m21280c1(displaying, uiComponent, newText, c4148a, (AbstractC13225r.c) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: c1 */
    public static final Unit m21280c1(UiState.Displaying displaying, UiComponent uiComponent, List list, C4148a c4148a, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48903e(UiState.Displaying.m20990v(displaying, C4086b.m20896m(displaying.getComponents(), uiComponent, ((InputInternationalDbComponent) uiComponent).m20702A((Option) CollectionsKt.firstOrNull(list))), null, m21307m0(c4148a, list.isEmpty(), displaying.m21006x(), uiComponent, null, 8, null), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: d1 */
    public static final AbstractC13225r m21283d1(final UiState.Displaying displaying, final UiComponent uiComponent, final C4148a c4148a, final List newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        return C13208b0.m48847c(null, new Function1() { // from class: or.y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4148a.m21286e1(displaying, uiComponent, newText, c4148a, (AbstractC13225r.c) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: e1 */
    public static final Unit m21286e1(UiState.Displaying displaying, UiComponent uiComponent, List list, C4148a c4148a, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48903e(UiState.Displaying.m20990v(displaying, C4086b.m20896m(displaying.getComponents(), uiComponent, ((InputInternationalDbComponent) uiComponent).m20703C((Option) CollectionsKt.firstOrNull(list))), null, m21307m0(c4148a, list.isEmpty(), displaying.m21006x(), uiComponent, null, 8, null), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: f1 */
    public static final AbstractC13225r m21289f1(final UiState.Displaying displaying, final UiComponent uiComponent, final C4148a c4148a, final String newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        return C13208b0.m48847c(null, new Function1() { // from class: or.j0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4148a.m21292g1(displaying, uiComponent, newText, c4148a, (AbstractC13225r.c) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: g1 */
    public static final Unit m21292g1(UiState.Displaying displaying, UiComponent uiComponent, String str, C4148a c4148a, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48903e(UiState.Displaying.m20990v(displaying, C4086b.m20896m(displaying.getComponents(), uiComponent, ((InputInternationalDbComponent) uiComponent).m20704D(str)), null, m21307m0(c4148a, str.length() == 0, displaying.m21006x(), uiComponent, null, 8, null), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: h1 */
    public static final AbstractC13225r m21295h1(final UiState.Displaying displaying, final UiComponent uiComponent, final JpMyNumberNfcScanResult jpMyNumberNfcScanResult) {
        return C13208b0.m48847c(null, new Function1() { // from class: or.l0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4148a.m21298i1(displaying, uiComponent, jpMyNumberNfcScanResult, (AbstractC13225r.c) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: i1 */
    public static final Unit m21298i1(UiState.Displaying displaying, UiComponent uiComponent, JpMyNumberNfcScanResult jpMyNumberNfcScanResult, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48903e(UiState.Displaying.m20990v(displaying, C4086b.m20896m(displaying.getComponents(), uiComponent, ((JpMyNumberNfcScanComponent) uiComponent).m20806m(jpMyNumberNfcScanResult)), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262142, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: j1 */
    public static final AbstractC13225r m21301j1(final UiState.Displaying displaying, final UiComponent uiComponent, final String newValue) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        return C13208b0.m48847c(null, new Function1() { // from class: or.u0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4148a.m21303k1(displaying, uiComponent, newValue, (AbstractC13225r.c) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: k1 */
    public static final Unit m21303k1(UiState.Displaying displaying, UiComponent uiComponent, String str, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48903e(UiState.Displaying.m20990v(displaying, C4086b.m20896m(displaying.getComponents(), uiComponent, ((MdocComponent) uiComponent).m20822p(str)), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262142, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: l1 */
    public static final AbstractC13225r m21305l1(final UiState.Displaying displaying, final UiComponent uiComponent, final String newValue) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        return C13208b0.m48847c(null, new Function1() { // from class: or.b1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4148a.m21308m1(displaying, uiComponent, newValue, (AbstractC13225r.c) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ List m21307m0(C4148a c4148a, boolean z10, List list, UiComponent uiComponent, String str, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            str = null;
        }
        return c4148a.m21346l0(z10, list, uiComponent, str);
    }

    /* JADX INFO: renamed from: m1 */
    public static final Unit m21308m1(UiState.Displaying displaying, UiComponent uiComponent, String str, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        MdocComponent mdocComponent = (MdocComponent) uiComponent;
        action.m48903e(C4149b.m21349b(UiState.Displaying.m20990v(displaying, C4086b.m20896m(displaying.getComponents(), uiComponent, mdocComponent.m20823q(str)), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262142, null), mdocComponent.getSuccessfulMdocRetrievalTransitionComponentName()));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: n1 */
    public static final AbstractC13225r m21310n1(final UiComponent uiComponent, final UiState.Displaying displaying, InterfaceC14037c.b output) {
        final PhoneNumberSnaComponent phoneNumberSnaComponentM20837m;
        Intrinsics.checkNotNullParameter(output, "output");
        if (output instanceof InterfaceC14037c.b.C14301b) {
            phoneNumberSnaComponentM20837m = ((PhoneNumberSnaComponent) uiComponent).m20837m(((InterfaceC14037c.b.C14301b) output).m50720a(), null, null);
        } else {
            if (!(output instanceof InterfaceC14037c.b.Error)) {
                throw new C7345l();
            }
            InterfaceC14037c.b.Error error = (InterfaceC14037c.b.Error) output;
            phoneNumberSnaComponentM20837m = ((PhoneNumberSnaComponent) uiComponent).m20837m(null, error.getErrorName(), error.getErrorMessage());
        }
        return C13208b0.m48847c(null, new Function1() { // from class: or.w0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4148a.m21313o1(displaying, uiComponent, phoneNumberSnaComponentM20837m, (AbstractC13225r.c) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: o0 */
    public static final AbstractC13225r m21312o0(final UiState.Displaying displaying, final UiComponent uiComponent, final C4148a c4148a, final String newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        return C13208b0.m48847c(null, new Function1() { // from class: or.a1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4148a.m21315p0(displaying, uiComponent, newText, c4148a, (AbstractC13225r.c) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: o1 */
    public static final Unit m21313o1(UiState.Displaying displaying, UiComponent uiComponent, PhoneNumberSnaComponent phoneNumberSnaComponent, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48903e(UiState.Displaying.m20990v(displaying, C4086b.m20896m(displaying.getComponents(), uiComponent, phoneNumberSnaComponent), null, null, null, null, null, null, new UiState.Displaying.AutoSubmit(phoneNumberSnaComponent, 0, null), null, false, false, null, null, null, false, 0, null, 0, 262014, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: p0 */
    public static final Unit m21315p0(UiState.Displaying displaying, UiComponent uiComponent, String str, C4148a c4148a, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48903e(UiState.Displaying.m20990v(displaying, C4086b.m20896m(displaying.getComponents(), uiComponent, ((InterfaceC4292o4) uiComponent).mo20667a(str)), null, m21307m0(c4148a, str.length() == 0, displaying.m21006x(), uiComponent, null, 8, null), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: p1 */
    public static final AbstractC13225r m21316p1(final UiState.Displaying displaying, final UiComponent uiComponent, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return C13208b0.m48847c(null, new Function1() { // from class: or.f1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4148a.m21319q1(displaying, uiComponent, (AbstractC13225r.c) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: q0 */
    public static final AbstractC13225r m21318q0(final UiState.Displaying displaying, final UiComponent uiComponent, final C4148a c4148a, final String newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        return C13208b0.m48847c(null, new Function1() { // from class: or.q0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4148a.m21321r0(displaying, uiComponent, newText, c4148a, (AbstractC13225r.c) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: q1 */
    public static final Unit m21319q1(UiState.Displaying displaying, UiComponent uiComponent, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48903e(UiState.Displaying.m20990v(displaying, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, ((InputFileUploadComponent) uiComponent).getName(), displaying.getFilePickRequestId() + 1, 65535, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: r0 */
    public static final Unit m21321r0(UiState.Displaying displaying, UiComponent uiComponent, String str, C4148a c4148a, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48903e(UiState.Displaying.m20990v(displaying, C4086b.m20896m(displaying.getComponents(), uiComponent, ((InterfaceC4207b) uiComponent).mo20638q(str).m20626T(str)), null, c4148a.m21346l0(str.length() == 0, displaying.m21006x(), uiComponent, "street_1"), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: r1 */
    public static final AbstractC13225r m21322r1(final UiComponent uiComponent, final UiState.Displaying displaying, C4155h.b output) {
        Intrinsics.checkNotNullParameter(output, "output");
        if (output instanceof C4155h.b.Success) {
            final InputFileUploadComponent inputFileUploadComponentM20698m = ((InputFileUploadComponent) uiComponent).m20698m(((C4155h.b.Success) output).m21506a());
            return C13208b0.m48847c(null, new Function1() { // from class: or.a0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C4148a.m21325s1(displaying, uiComponent, inputFileUploadComponentM20698m, (AbstractC13225r.c) obj);
                }
            }, 1, null);
        }
        if ((output instanceof C4155h.b.a) || (output instanceof C4155h.b.C14153b)) {
            return C13208b0.m48847c(null, new Function1() { // from class: or.b0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C4148a.m21328t1(displaying, (AbstractC13225r.c) obj);
                }
            }, 1, null);
        }
        throw new C7345l();
    }

    /* JADX INFO: renamed from: s0 */
    public static final AbstractC13225r m21324s0(final UiState.Displaying displaying, final UiComponent uiComponent, final C4148a c4148a, final String newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        return C13208b0.m48847c(null, new Function1() { // from class: or.z
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4148a.m21327t0(displaying, uiComponent, newText, c4148a, (AbstractC13225r.c) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: s1 */
    public static final Unit m21325s1(UiState.Displaying displaying, UiComponent uiComponent, InputFileUploadComponent inputFileUploadComponent, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48903e(UiState.Displaying.m20990v(displaying, C4086b.m20896m(displaying.getComponents(), uiComponent, inputFileUploadComponent), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 196606, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: t0 */
    public static final Unit m21327t0(UiState.Displaying displaying, UiComponent uiComponent, String str, C4148a c4148a, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48903e(UiState.Displaying.m20990v(displaying, C4086b.m20896m(displaying.getComponents(), uiComponent, ((InterfaceC4207b) uiComponent).mo20632j(str)), null, c4148a.m21346l0(str.length() == 0, displaying.m21006x(), uiComponent, "street_2"), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: t1 */
    public static final Unit m21328t1(UiState.Displaying displaying, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48903e(UiState.Displaying.m20990v(displaying, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 196607, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: u0 */
    public static final AbstractC13225r m21330u0(final UiState.Displaying displaying, final UiComponent uiComponent, final C4148a c4148a, final String newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        return C13208b0.m48847c(null, new Function1() { // from class: or.f0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4148a.m21333v0(displaying, uiComponent, newText, c4148a, (AbstractC13225r.c) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: u1 */
    public static final AbstractC13225r m21331u1(final UiState.Displaying displaying, final UiComponent uiComponent, final C4148a c4148a, final Set stringSet) {
        Intrinsics.checkNotNullParameter(stringSet, "stringSet");
        return C13208b0.m48847c(null, new Function1() { // from class: or.x
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4148a.m21334v1(displaying, uiComponent, stringSet, c4148a, (AbstractC13225r.c) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: v0 */
    public static final Unit m21333v0(UiState.Displaying displaying, UiComponent uiComponent, String str, C4148a c4148a, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48903e(UiState.Displaying.m20990v(displaying, C4086b.m20896m(displaying.getComponents(), uiComponent, ((InterfaceC4207b) uiComponent).mo20633k(str)), null, c4148a.m21346l0(str.length() == 0, displaying.m21006x(), uiComponent, "city"), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: v1 */
    public static final Unit m21334v1(UiState.Displaying displaying, UiComponent uiComponent, Set set, C4148a c4148a, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48903e(UiState.Displaying.m20990v(displaying, C4086b.m20896m(displaying.getComponents(), uiComponent, ((InterfaceC4316s4) uiComponent).mo20658a(set)), null, m21307m0(c4148a, set.isEmpty(), displaying.m21006x(), uiComponent, null, 8, null), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: w0 */
    public static final AbstractC13225r m21336w0(final UiState.Displaying displaying, final UiComponent uiComponent, final C4148a c4148a, final String newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        return C13208b0.m48847c(null, new Function1() { // from class: or.x0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4148a.m21339x0(displaying, uiComponent, newText, c4148a, (AbstractC13225r.c) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: w1 */
    public static final AbstractC13225r m21337w1(final UiState.Displaying displaying, final UiComponent uiComponent, final boolean z10) {
        return C13208b0.m48847c(null, new Function1() { // from class: or.r0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4148a.m21340x1(displaying, uiComponent, z10, (AbstractC13225r.c) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: x0 */
    public static final Unit m21339x0(UiState.Displaying displaying, UiComponent uiComponent, String str, C4148a c4148a, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48903e(UiState.Displaying.m20990v(displaying, C4086b.m20896m(displaying.getComponents(), uiComponent, ((InterfaceC4207b) uiComponent).mo20640s(str)), null, c4148a.m21346l0(str.length() == 0, displaying.m21006x(), uiComponent, "subdivision"), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: x1 */
    public static final Unit m21340x1(UiState.Displaying displaying, UiComponent uiComponent, boolean z10, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48903e(UiState.Displaying.m20990v(displaying, C4086b.m20896m(displaying.getComponents(), uiComponent, ((InterfaceC4207b) uiComponent).mo20636o(Boolean.valueOf(z10))), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262142, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: y0 */
    public static final AbstractC13225r m21342y0(final UiState.Displaying displaying, final UiComponent uiComponent, final C4148a c4148a, final String newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        return C13208b0.m48847c(null, new Function1() { // from class: or.d0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4148a.m21344z0(displaying, uiComponent, newText, c4148a, (AbstractC13225r.c) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: z0 */
    public static final Unit m21344z0(UiState.Displaying displaying, UiComponent uiComponent, String str, C4148a c4148a, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48903e(UiState.Displaying.m20990v(displaying, C4086b.m20896m(displaying.getComponents(), uiComponent, ((InterfaceC4207b) uiComponent).mo20637p(str)), null, c4148a.m21346l0(str.length() == 0, displaying.m21006x(), uiComponent, "postal_code"), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: k0 */
    public final UiComponentConfig m21345k0(List<? extends UiComponentConfig> configs, String name) {
        UiComponentConfig uiComponentConfigM21345k0;
        if (configs == null) {
            return null;
        }
        for (UiComponentConfig uiComponentConfig : configs) {
            if (Intrinsics.m31980c(uiComponentConfig.getName(), name)) {
                return uiComponentConfig;
            }
            if ((uiComponentConfig instanceof UiComponentContainerConfig) && (uiComponentConfigM21345k0 = m21345k0(((UiComponentContainerConfig) uiComponentConfig).getChildren(), name)) != null) {
                return uiComponentConfigM21345k0;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: l0 */
    public final List<UiComponentErrorInfo> m21346l0(boolean isFieldBlank, List<UiComponentErrorInfo> componentErrors, UiComponent component, String subComponentName) {
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

    /* JADX INFO: renamed from: n0 */
    public final void m21347n0(@NotNull UiWorkflow.Input renderProps, @NotNull final UiState.Displaying renderState, @NotNull AbstractC13218k<? super UiWorkflow.Input, UiState, ? extends UiWorkflow.InterfaceC4141b, ? extends Object>.a context, @NotNull final UiComponent component) {
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
        if (component instanceof InterfaceC4292o4) {
            TypedWorker typedWorker = new TypedWorker(C7731d0.m32011k(String.class), ((InterfaceC4292o4) component).getTextController().mo1449a());
            String name = component.getName();
            Function1 function1 = new Function1() { // from class: or.a
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C4148a.m21312o0(renderState, component, this, (String) obj);
                }
            };
            KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
            C13230w.m48937l(context, typedWorker, C7731d0.m32012l(InterfaceC13222o.class, companion.m32095a(C7731d0.m32011k(String.class))), name, function1);
            if (component instanceof InputPhoneNumberComponent) {
                InputPhoneNumberComponent inputPhoneNumberComponent = (InputPhoneNumberComponent) component;
                C13230w.m48937l(context, new TypedWorker(C7731d0.m32012l(List.class, companion.m32095a(C7731d0.m32011k(Option.class))), inputPhoneNumberComponent.getCountryCodeOptionsController().m24145a()), C7731d0.m32012l(InterfaceC13222o.class, companion.m32095a(C7731d0.m32012l(List.class, companion.m32095a(C7731d0.m32011k(Option.class))))), inputPhoneNumberComponent.getName() + ":country", new Function1() { // from class: or.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C4148a.m21225C0(renderState, component, this, (List) obj);
                    }
                });
                return;
            }
            return;
        }
        if (component instanceof InterfaceC4339w3) {
            InterfaceC9575h<List<Option>> interfaceC9575hM24145a = ((InterfaceC4339w3) component).getSelectedOptionsController().m24145a();
            KTypeProjection.Companion companion2 = KTypeProjection.INSTANCE;
            C13230w.m48937l(context, new TypedWorker(C7731d0.m32012l(List.class, companion2.m32095a(C7731d0.m32011k(Option.class))), interfaceC9575hM24145a), C7731d0.m32012l(InterfaceC13222o.class, companion2.m32095a(C7731d0.m32012l(List.class, companion2.m32095a(C7731d0.m32011k(Option.class))))), component.getName(), new Function1() { // from class: or.o
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C4148a.m21271Z0(renderState, component, this, (List) obj);
                }
            });
            return;
        }
        if (component instanceof InterfaceC4316s4) {
            InterfaceC9575h<Set<String>> interfaceC9575hM24148a = ((InterfaceC4316s4) component).getStringSetController().m24148a();
            KTypeProjection.Companion companion3 = KTypeProjection.INSTANCE;
            C13230w.m48937l(context, new TypedWorker(C7731d0.m32012l(Set.class, companion3.m32095a(C7731d0.m32011k(String.class))), interfaceC9575hM24148a), C7731d0.m32012l(InterfaceC13222o.class, companion3.m32095a(C7731d0.m32012l(Set.class, companion3.m32095a(C7731d0.m32011k(String.class))))), component.getName(), new Function1() { // from class: or.p
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C4148a.m21331u1(renderState, component, this, (Set) obj);
                }
            });
            return;
        }
        boolean z10 = component instanceof InterfaceC4207b;
        Class cls = Boolean.TYPE;
        if (z10) {
            TypedWorker typedWorker2 = new TypedWorker(C7731d0.m32011k(cls), ((InterfaceC4207b) component).getIsAddressFieldCollapsed().m24154a());
            String str = component.getName() + "UpdateCollapsedState";
            Function1 function2 = new Function1() { // from class: or.q
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C4148a.m21337w1(renderState, component, ((Boolean) obj).booleanValue());
                }
            };
            KTypeProjection.Companion companion4 = KTypeProjection.INSTANCE;
            C13230w.m48937l(context, typedWorker2, C7731d0.m32012l(InterfaceC13222o.class, companion4.m32095a(C7731d0.m32011k(cls))), str, function2);
            InterfaceC4207b interfaceC4207b = (InterfaceC4207b) component;
            C13230w.m48937l(context, new TypedWorker(C7731d0.m32011k(String.class), interfaceC4207b.getTextControllerForAddressStreet1().mo1449a()), C7731d0.m32012l(InterfaceC13222o.class, companion4.m32095a(C7731d0.m32011k(String.class))), component.getName() + "UpdateAddressStreet1", new Function1() { // from class: or.r
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C4148a.m21318q0(renderState, component, this, (String) obj);
                }
            });
            C13230w.m48937l(context, new TypedWorker(C7731d0.m32011k(String.class), interfaceC4207b.getTextControllerForAddressStreet2().mo1449a()), C7731d0.m32012l(InterfaceC13222o.class, companion4.m32095a(C7731d0.m32011k(String.class))), component.getName() + "UpdateAddressStreet2", new Function1() { // from class: or.s
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C4148a.m21324s0(renderState, component, this, (String) obj);
                }
            });
            C13230w.m48937l(context, new TypedWorker(C7731d0.m32011k(String.class), interfaceC4207b.getTextControllerForAddressCity().mo1449a()), C7731d0.m32012l(InterfaceC13222o.class, companion4.m32095a(C7731d0.m32011k(String.class))), component.getName() + "UpdateAddressCity", new Function1() { // from class: or.t
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C4148a.m21330u0(renderState, component, this, (String) obj);
                }
            });
            C13230w.m48937l(context, new TypedWorker(C7731d0.m32011k(String.class), interfaceC4207b.getTextControllerForAddressSubdivision().mo1449a()), C7731d0.m32012l(InterfaceC13222o.class, companion4.m32095a(C7731d0.m32011k(String.class))), component.getName() + "UpdateAddressSubdivision", new Function1() { // from class: or.u
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C4148a.m21336w0(renderState, component, this, (String) obj);
                }
            });
            C13230w.m48937l(context, new TypedWorker(C7731d0.m32011k(String.class), interfaceC4207b.getTextControllerForAddressPostalCode().mo1449a()), C7731d0.m32012l(InterfaceC13222o.class, companion4.m32095a(C7731d0.m32011k(String.class))), component.getName() + "UpdateAddressPostalCode", new Function1() { // from class: or.v
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C4148a.m21342y0(renderState, component, this, (String) obj);
                }
            });
            if (component instanceof InputAddressComponent) {
                InputAddressComponent inputAddressComponent = (InputAddressComponent) component;
                if (inputAddressComponent.getAutocompleteMethod() == EnumC5193b.Server) {
                    String searchQuery = inputAddressComponent.getSearchQuery();
                    if (searchQuery != null) {
                        C13230w.m48937l(context, this.addressAutocompleteWorker.m21642a(renderProps.getSessionToken(), component, searchQuery), C7731d0.m32011k(C4178b.class), inputAddressComponent.getName(), new Function1() { // from class: or.l
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return C4148a.m21221A0(renderState, component, (C4178b.b) obj);
                            }
                        });
                        Unit unit = Unit.f29331a;
                    }
                    String selectedSearchResultId = inputAddressComponent.getSelectedSearchResultId();
                    if (selectedSearchResultId != null) {
                        C13230w.m48937l(context, this.addressDetailsWorker.m40787a(renderProps.getSessionToken(), selectedSearchResultId), C7731d0.m32011k(C10701a.class), "", new Function1() { // from class: or.w
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return C4148a.m21229E0(component, renderState, (C10701a.b) obj);
                            }
                        });
                        Unit unit2 = Unit.f29331a;
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (component instanceof InterfaceC4280m4) {
            C13230w.m48937l(context, new TypedWorker(C7731d0.m32011k(cls), ((InterfaceC4280m4) component).getTwoStateViewController().m24154a()), C7731d0.m32012l(InterfaceC13222o.class, KTypeProjection.INSTANCE.m32095a(C7731d0.m32011k(cls))), component.getName(), new Function1() { // from class: or.h0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C4148a.m21235H0(renderState, component, ((Boolean) obj).booleanValue());
                }
            });
            return;
        }
        if (component instanceof InterfaceC4286n4) {
            C13230w.m48937l(context, new TypedWorker(C7731d0.m32005e(Number.class), ((InterfaceC4286n4) component).getNumberController().m24140a()), C7731d0.m32012l(InterfaceC13222o.class, KTypeProjection.INSTANCE.m32095a(C7731d0.m32005e(Number.class))), component.getName(), new Function1() { // from class: or.s0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C4148a.m21239J0(renderState, component, this, (Number) obj);
                }
            });
            return;
        }
        if (component instanceof InterfaceC4214c) {
            C13230w.m48937l(context, new TypedWorker(C7731d0.m32005e(Bitmap.class), ((InterfaceC4214c) component).getBitmapController().m24095a()), C7731d0.m32012l(InterfaceC13222o.class, KTypeProjection.INSTANCE.m32095a(C7731d0.m32005e(Bitmap.class))), component.getName(), new Function1() { // from class: or.d1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C4148a.m21243L0(renderState, component, (Bitmap) obj);
                }
            });
            return;
        }
        if (component instanceof InterfaceC4269l) {
            C13230w.m48937l(context, new TypedWorker(C7731d0.m32005e(String.class), ((InterfaceC4269l) component).getDateController().m24120e()), C7731d0.m32012l(InterfaceC13222o.class, KTypeProjection.INSTANCE.m32095a(C7731d0.m32005e(String.class))), component.getName(), new Function1() { // from class: or.g1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C4148a.m21247N0(renderState, component, this, (String) obj);
                }
            });
            return;
        }
        if (component instanceof GovernmentIdNfcScanComponent) {
            GovernmentIdNfcScanComponent governmentIdNfcScanComponent = (GovernmentIdNfcScanComponent) component;
            TypedWorker typedWorker3 = new TypedWorker(C7731d0.m32011k(String.class), governmentIdNfcScanComponent.getCardAccessNumberController().mo1449a());
            String str2 = governmentIdNfcScanComponent.getName() + "UpdateCardAccessNumber";
            Function1 function3 = new Function1() { // from class: or.h1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C4148a.m21251P0(renderState, component, this, (String) obj);
                }
            };
            KTypeProjection.Companion companion5 = KTypeProjection.INSTANCE;
            C13230w.m48937l(context, typedWorker3, C7731d0.m32012l(InterfaceC13222o.class, companion5.m32095a(C7731d0.m32011k(String.class))), str2, function3);
            C13230w.m48937l(context, new TypedWorker(C7731d0.m32011k(String.class), governmentIdNfcScanComponent.getDocumentNumberController().mo1449a()), C7731d0.m32012l(InterfaceC13222o.class, companion5.m32095a(C7731d0.m32011k(String.class))), governmentIdNfcScanComponent.getName() + "UpdateDocumentNumber", new Function1() { // from class: or.i1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C4148a.m21255R0(renderState, component, this, (String) obj);
                }
            });
            C13230w.m48937l(context, new TypedWorker(C7731d0.m32005e(String.class), governmentIdNfcScanComponent.getDateOfBirthController().m24120e()), C7731d0.m32012l(InterfaceC13222o.class, companion5.m32095a(C7731d0.m32005e(String.class))), governmentIdNfcScanComponent.getName() + "UpdateDateOfBirth", new Function1() { // from class: or.j1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C4148a.m21259T0(renderState, component, this, (String) obj);
                }
            });
            C13230w.m48937l(context, new TypedWorker(C7731d0.m32005e(String.class), governmentIdNfcScanComponent.getExpirationDateController().m24120e()), C7731d0.m32012l(InterfaceC13222o.class, companion5.m32095a(C7731d0.m32005e(String.class))), governmentIdNfcScanComponent.getName() + "UpdateExpirationDate", new Function1() { // from class: or.b
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C4148a.m21263V0(renderState, component, this, (String) obj);
                }
            });
            C13230w.m48937l(context, new TypedWorker(C7731d0.m32005e(GovernmentIdNfcData.class), governmentIdNfcScanComponent.getNfcDataController().m24134a()), C7731d0.m32012l(InterfaceC13222o.class, companion5.m32095a(C7731d0.m32005e(GovernmentIdNfcData.class))), governmentIdNfcScanComponent.getName(), new Function1() { // from class: or.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C4148a.m21267X0(renderState, component, (GovernmentIdNfcData) obj);
                }
            });
            return;
        }
        if (component instanceof InputInternationalDbComponent) {
            InputInternationalDbComponent inputInternationalDbComponent = (InputInternationalDbComponent) component;
            InterfaceC9575h<List<Option>> interfaceC9575hM24145a2 = inputInternationalDbComponent.getCountryOptionsController().m24145a();
            KTypeProjection.Companion companion6 = KTypeProjection.INSTANCE;
            C13230w.m48937l(context, new TypedWorker(C7731d0.m32012l(List.class, companion6.m32095a(C7731d0.m32011k(Option.class))), interfaceC9575hM24145a2), C7731d0.m32012l(InterfaceC13222o.class, companion6.m32095a(C7731d0.m32012l(List.class, companion6.m32095a(C7731d0.m32011k(Option.class))))), inputInternationalDbComponent.getName() + ":country", new Function1() { // from class: or.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C4148a.m21277b1(renderState, component, this, (List) obj);
                }
            });
            C13230w.m48937l(context, new TypedWorker(C7731d0.m32012l(List.class, companion6.m32095a(C7731d0.m32011k(Option.class))), inputInternationalDbComponent.getIdTypeOptionsController().m24145a()), C7731d0.m32012l(InterfaceC13222o.class, companion6.m32095a(C7731d0.m32012l(List.class, companion6.m32095a(C7731d0.m32011k(Option.class))))), inputInternationalDbComponent.getName() + ":idType", new Function1() { // from class: or.f
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C4148a.m21283d1(renderState, component, this, (List) obj);
                }
            });
            C13230w.m48937l(context, new TypedWorker(C7731d0.m32011k(String.class), inputInternationalDbComponent.getIdValueController().mo1449a()), C7731d0.m32012l(InterfaceC13222o.class, companion6.m32095a(C7731d0.m32011k(String.class))), inputInternationalDbComponent.getName() + ":idValue", new Function1() { // from class: or.g
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C4148a.m21289f1(renderState, component, this, (String) obj);
                }
            });
            return;
        }
        if (component instanceof JpMyNumberNfcScanComponent) {
            JpMyNumberNfcScanComponent jpMyNumberNfcScanComponent = (JpMyNumberNfcScanComponent) component;
            C13230w.m48937l(context, new TypedWorker(C7731d0.m32005e(JpMyNumberNfcScanResult.class), jpMyNumberNfcScanComponent.getScanResultController().m24137a()), C7731d0.m32012l(InterfaceC13222o.class, KTypeProjection.INSTANCE.m32095a(C7731d0.m32005e(JpMyNumberNfcScanResult.class))), jpMyNumberNfcScanComponent.getName() + ":scanResult", new Function1() { // from class: or.h
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C4148a.m21295h1(renderState, component, (JpMyNumberNfcScanResult) obj);
                }
            });
            return;
        }
        if (component instanceof MdocComponent) {
            MdocComponent mdocComponent = (MdocComponent) component;
            TypedWorker typedWorker4 = new TypedWorker(C7731d0.m32011k(String.class), mdocComponent.getErrorTextController().mo1449a());
            String str3 = mdocComponent.getName() + ":error";
            Function1 function4 = new Function1() { // from class: or.i
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C4148a.m21301j1(renderState, component, (String) obj);
                }
            };
            KTypeProjection.Companion companion7 = KTypeProjection.INSTANCE;
            C13230w.m48937l(context, typedWorker4, C7731d0.m32012l(InterfaceC13222o.class, companion7.m32095a(C7731d0.m32011k(String.class))), str3, function4);
            C13230w.m48937l(context, new TypedWorker(C7731d0.m32011k(String.class), mdocComponent.getMdocDataController().mo1449a()), C7731d0.m32012l(InterfaceC13222o.class, companion7.m32095a(C7731d0.m32011k(String.class))), mdocComponent.getName() + ":data", new Function1() { // from class: or.j
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C4148a.m21305l1(renderState, component, (String) obj);
                }
            });
            return;
        }
        if (component instanceof PhoneNumberSnaComponent) {
            PhoneNumberSnaComponent phoneNumberSnaComponent = (PhoneNumberSnaComponent) component;
            PhoneNumberSna.Attributes attributes3 = phoneNumberSnaComponent.getConfig().getAttributes();
            C13230w.m48937l(context, this.silentNetworkAuthWorker.m50711a(this.applicationContext, new SilentNetworkAuthConfig((attributes3 == null || (checkUrl = attributes3.getCheckUrl()) == null) ? "" : checkUrl, 0, 0L, 6, null), attributes3 != null ? attributes3.getTimeoutSeconds() : 10), C7731d0.m32011k(C14035a.class), phoneNumberSnaComponent.getName(), new Function1() { // from class: or.k
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C4148a.m21310n1(component, renderState, (InterfaceC14037c.b) obj);
                }
            });
            return;
        }
        if (component instanceof InputFileUploadComponent) {
            InputFileUploadComponent inputFileUploadComponent = (InputFileUploadComponent) component;
            C13230w.m48937l(context, new TypedWorker(C7731d0.m32011k(Unit.class), inputFileUploadComponent.getFileUploadController().m21918a()), C7731d0.m32012l(InterfaceC13222o.class, KTypeProjection.INSTANCE.m32095a(C7731d0.m32011k(Unit.class))), inputFileUploadComponent.getName() + "_pick_request", new Function1() { // from class: or.m
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C4148a.m21316p1(renderState, component, (Unit) obj);
                }
            });
            if (Intrinsics.m31980c(renderState.getFilePickComponentName(), inputFileUploadComponent.getName())) {
                UiComponentConfig uiComponentConfigM21345k0 = m21345k0(renderProps.getComponents(), inputFileUploadComponent.getName());
                InputFileUpload inputFileUpload = uiComponentConfigM21345k0 instanceof InputFileUpload ? (InputFileUpload) uiComponentConfigM21345k0 : null;
                int iIntValue = 1;
                if (inputFileUpload == null || (attributes2 = inputFileUpload.getAttributes()) == null || (allowedFileTypes = attributes2.getAllowedFileTypes()) == null || (strArr = (String[]) allowedFileTypes.toArray(new String[0])) == null) {
                    strArr = new String[]{"*/*"};
                }
                if (inputFileUpload != null && (attributes = inputFileUpload.getAttributes()) != null && (fileUploadLimit = attributes.getFileUploadLimit()) != null) {
                    iIntValue = fileUploadLimit.intValue();
                }
                C13230w.m48937l(context, this.fileSelectWorkerFactory.m21503b(inputFileUploadComponent.getName() + "_" + renderState.getFilePickRequestId(), strArr, iIntValue), C7731d0.m32011k(C4155h.class), "", new Function1() { // from class: or.n
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C4148a.m21322r1(component, renderState, (C4155h.b) obj);
                    }
                });
            }
        }
    }
}
