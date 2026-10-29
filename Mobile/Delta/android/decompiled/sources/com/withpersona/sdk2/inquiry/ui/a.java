package com.withpersona.sdk2.inquiry.ui;

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
import kotlin.jvm.internal.d0;
import kotlin.reflect.KTypeProjection;
import okhttp3.internal.http2.Settings;
import org.jetbrains.annotations.NotNull;
import ym.TypedWorker;
import ym.b0;
import ym.o;
import ym.r;
import ym.w;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J?\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00170\u000e2\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u000e2\u0006\u0010\u001a\u001a\u00020\u00192\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJM\u0010)\u001a\u00020(2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2&\u0010'\u001a\"0\"R\u001a\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00010$j\u0002`#2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u00065"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/a;", "", "Landroid/content/Context;", "applicationContext", "Lcom/withpersona/sdk2/inquiry/ui/network/b$a;", "addressAutocompleteWorker", "Lqr/a$a;", "addressDetailsWorker", "Lzq/a$a;", "silentNetworkAuthWorker", "Lcom/withpersona/sdk2/inquiry/ui/h$a;", "fileSelectWorkerFactory", "<init>", "(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/ui/network/b$a;Lqr/a$a;Lzq/a$a;Lcom/withpersona/sdk2/inquiry/ui/h$a;)V", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "configs", "", "name", "k0", "(Ljava/util/List;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "", "isFieldBlank", "Lcom/withpersona/sdk2/inquiry/ui/UiComponentErrorInfo;", "componentErrors", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "component", "subComponentName", "l0", "(ZLjava/util/List;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Ljava/lang/String;)Ljava/util/List;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;", "renderProps", "Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;", "renderState", "Lym/k$a;", "Lcom/withpersona/sdk2/inquiry/ui/RenderContext;", "Lym/k;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$b;", "context", "", "n0", "(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;Lym/k$a;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)V", "a", "Landroid/content/Context;", "b", "Lcom/withpersona/sdk2/inquiry/ui/network/b$a;", "c", "Lqr/a$a;", "d", "Lzq/a$a;", "e", "Lcom/withpersona/sdk2/inquiry/ui/h$a;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

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
    public final h.a fileSelectWorkerFactory;

    public a(@NotNull Context applicationContext, @NotNull com.withpersona.sdk2.inquiry.ui.network.b.a addressAutocompleteWorker, @NotNull qr.a.C0521a addressDetailsWorker, @NotNull zq.a.C0689a silentNetworkAuthWorker, @NotNull h.a fileSelectWorkerFactory) {
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

    public static final r A0(final UiState.Displaying displaying, final UiComponent uiComponent, final com.withpersona.sdk2.inquiry.ui.network.b.AbstractC0257b response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return b0.c(null, new Function1() { // from class: or.m0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.withpersona.sdk2.inquiry.ui.a.B0(response, displaying, uiComponent, (ym.r.c) obj);
            }
        }, 1, null);
    }

    public static final Unit B0(com.withpersona.sdk2.inquiry.ui.network.b.AbstractC0257b abstractC0257b, UiState.Displaying displaying, UiComponent uiComponent, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (abstractC0257b instanceof com.withpersona.sdk2.inquiry.ui.network.b.AbstractC0257b.C0258b) {
            action.e(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((InputAddressComponent) uiComponent).U(((com.withpersona.sdk2.inquiry.ui.network.b.AbstractC0257b.C0258b) abstractC0257b).a()).T(null)), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262142, null));
        } else if (!(abstractC0257b instanceof com.withpersona.sdk2.inquiry.ui.network.b.AbstractC0257b.a)) {
            throw new jt.l();
        }
        return Unit.f22483a;
    }

    public static final r C0(final UiState.Displaying displaying, final UiComponent uiComponent, final a aVar, final List newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        return b0.c(null, new Function1() { // from class: or.c1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.withpersona.sdk2.inquiry.ui.a.D0(displaying, uiComponent, newText, aVar, (ym.r.c) obj);
            }
        }, 1, null);
    }

    public static final Unit D0(UiState.Displaying displaying, UiComponent uiComponent, List list, a aVar, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((InputPhoneNumberComponent) uiComponent).u((Option) CollectionsKt.firstOrNull(list))), null, m0(aVar, list.isEmpty(), displaying.x(), uiComponent, null, 8, null), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f22483a;
    }

    public static final r E0(final UiComponent uiComponent, final UiState.Displaying displaying, final qr.a.b response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (response instanceof qr.a.b.C0523b) {
            return b0.c(null, new Function1() { // from class: or.o0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.ui.a.F0(uiComponent, response, displaying, (ym.r.c) obj);
                }
            }, 1, null);
        }
        if (response instanceof qr.a.b.C0522a) {
            return b0.c(null, new Function1() { // from class: or.p0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.ui.a.G0(response, (ym.r.c) obj);
                }
            }, 1, null);
        }
        throw new jt.l();
    }

    public static final Unit F0(UiComponent uiComponent, qr.a.b bVar, UiState.Displaying displaying, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Boolean bool = Boolean.FALSE;
        qr.a.b.C0523b c0523b = (qr.a.b.C0523b) bVar;
        InputAddressComponent inputAddressComponentQ = ((InputAddressComponent) uiComponent).o(bool).q(c0523b.getResult().getAddressStreet1());
        String addressStreet2 = c0523b.getResult().getAddressStreet2();
        if (addressStreet2 == null) {
            addressStreet2 = "";
        }
        InputAddressComponent inputAddressComponentS = inputAddressComponentQ.j(addressStreet2).k(c0523b.getResult().getAddressCity()).s(c0523b.getResult().getAddressSubdivision()).p(c0523b.getResult().getAddressPostalCode()).V(null).S(bool);
        action.e(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, inputAddressComponentS), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262142, null));
        inputAddressComponentS.getTextControllerForAddressStreet1().c(inputAddressComponentS.getStreet1());
        inputAddressComponentS.getTextControllerForAddressStreet2().c(inputAddressComponentS.getStreet2());
        inputAddressComponentS.getTextControllerForAddressCity().c(inputAddressComponentS.getCity());
        inputAddressComponentS.getTextControllerForAddressSubdivision().c(inputAddressComponentS.getSubdivision());
        inputAddressComponentS.getTextControllerForAddressPostalCode().c(inputAddressComponentS.getPostalCode());
        return Unit.f22483a;
    }

    public static final Unit G0(qr.a.b bVar, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.d(new UiWorkflow.b.d("Couldn't load address.", ((qr.a.b.C0522a) bVar).getCause()));
        return Unit.f22483a;
    }

    public static final r H0(final UiState.Displaying displaying, final UiComponent uiComponent, final boolean z10) {
        return b0.c(null, new Function1() { // from class: or.e1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.withpersona.sdk2.inquiry.ui.a.I0(displaying, uiComponent, z10, (ym.r.c) obj);
            }
        }, 1, null);
    }

    public static final Unit I0(UiState.Displaying displaying, UiComponent uiComponent, boolean z10, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((m4) uiComponent).a(z10)), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262142, null));
        return Unit.f22483a;
    }

    public static final r J0(final UiState.Displaying displaying, final UiComponent uiComponent, final a aVar, final Number number) {
        return b0.c(null, new Function1() { // from class: or.z0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.withpersona.sdk2.inquiry.ui.a.K0(displaying, uiComponent, number, aVar, (ym.r.c) obj);
            }
        }, 1, null);
    }

    public static final Unit K0(UiState.Displaying displaying, UiComponent uiComponent, Number number, a aVar, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((n4) uiComponent).a(number)), null, m0(aVar, number == null, displaying.x(), uiComponent, null, 8, null), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f22483a;
    }

    public static final r L0(final UiState.Displaying displaying, final UiComponent uiComponent, final Bitmap bitmap) {
        return b0.c(null, new Function1() { // from class: or.t0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.withpersona.sdk2.inquiry.ui.a.M0(displaying, uiComponent, bitmap, (ym.r.c) obj);
            }
        }, 1, null);
    }

    public static final Unit M0(UiState.Displaying displaying, UiComponent uiComponent, Bitmap bitmap, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((cr.c) uiComponent).f(bitmap)), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262142, null));
        return Unit.f22483a;
    }

    public static final r N0(final UiState.Displaying displaying, final UiComponent uiComponent, final a aVar, final String str) {
        return b0.c(null, new Function1() { // from class: or.v0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.withpersona.sdk2.inquiry.ui.a.O0(displaying, uiComponent, str, aVar, (ym.r.c) obj);
            }
        }, 1, null);
    }

    public static final Unit O0(UiState.Displaying displaying, UiComponent uiComponent, String str, a aVar, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((cr.l) uiComponent).a(str)), null, m0(aVar, str == null || str.length() == 0, displaying.x(), uiComponent, null, 8, null), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f22483a;
    }

    public static final r P0(final UiState.Displaying displaying, final UiComponent uiComponent, final a aVar, final String newValue) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        return b0.c(null, new Function1() { // from class: or.g0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.withpersona.sdk2.inquiry.ui.a.Q0(displaying, uiComponent, newValue, aVar, (ym.r.c) obj);
            }
        }, 1, null);
    }

    public static final Unit Q0(UiState.Displaying displaying, UiComponent uiComponent, String str, a aVar, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((GovernmentIdNfcScanComponent) uiComponent).q(str)), null, aVar.l0(str.length() == 0, displaying.x(), uiComponent, GovernmentIdNfcScan.cardAccessNumberName), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f22483a;
    }

    public static final r R0(final UiState.Displaying displaying, final UiComponent uiComponent, final a aVar, final String newValue) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        return b0.c(null, new Function1() { // from class: or.k0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.withpersona.sdk2.inquiry.ui.a.S0(displaying, uiComponent, newValue, aVar, (ym.r.c) obj);
            }
        }, 1, null);
    }

    public static final Unit S0(UiState.Displaying displaying, UiComponent uiComponent, String str, a aVar, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((GovernmentIdNfcScanComponent) uiComponent).s(str)), null, aVar.l0(str.length() == 0, displaying.x(), uiComponent, GovernmentIdNfcScan.documentNumberName), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f22483a;
    }

    public static final r T0(final UiState.Displaying displaying, final UiComponent uiComponent, final a aVar, final String str) {
        return b0.c(null, new Function1() { // from class: or.c0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.withpersona.sdk2.inquiry.ui.a.U0(displaying, uiComponent, str, aVar, (ym.r.c) obj);
            }
        }, 1, null);
    }

    public static final Unit U0(UiState.Displaying displaying, UiComponent uiComponent, String str, a aVar, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((GovernmentIdNfcScanComponent) uiComponent).r(str)), null, aVar.l0(str == null || str.length() == 0, displaying.x(), uiComponent, GovernmentIdNfcScan.dateOfBirthName), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f22483a;
    }

    public static final r V0(final UiState.Displaying displaying, final UiComponent uiComponent, final a aVar, final String str) {
        return b0.c(null, new Function1() { // from class: or.n0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.withpersona.sdk2.inquiry.ui.a.W0(displaying, uiComponent, str, aVar, (ym.r.c) obj);
            }
        }, 1, null);
    }

    public static final Unit W0(UiState.Displaying displaying, UiComponent uiComponent, String str, a aVar, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((GovernmentIdNfcScanComponent) uiComponent).t(str)), null, aVar.l0(str == null || str.length() == 0, displaying.x(), uiComponent, GovernmentIdNfcScan.expirationDateName), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f22483a;
    }

    public static final r X0(final UiState.Displaying displaying, final UiComponent uiComponent, final GovernmentIdNfcData governmentIdNfcData) {
        return b0.c(null, new Function1() { // from class: or.i0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.withpersona.sdk2.inquiry.ui.a.Y0(displaying, uiComponent, governmentIdNfcData, (ym.r.c) obj);
            }
        }, 1, null);
    }

    public static final Unit Y0(UiState.Displaying displaying, UiComponent uiComponent, GovernmentIdNfcData governmentIdNfcData, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((GovernmentIdNfcScanComponent) uiComponent).u(governmentIdNfcData)), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262142, null));
        return Unit.f22483a;
    }

    public static final r Z0(final UiState.Displaying displaying, final UiComponent uiComponent, final a aVar, final List selectedOptions) {
        Intrinsics.checkNotNullParameter(selectedOptions, "selectedOptions");
        return b0.c(null, new Function1() { // from class: or.y0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.withpersona.sdk2.inquiry.ui.a.a1(displaying, uiComponent, selectedOptions, aVar, (ym.r.c) obj);
            }
        }, 1, null);
    }

    public static final Unit a1(UiState.Displaying displaying, UiComponent uiComponent, List list, a aVar, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((w3) uiComponent).k(list)), null, m0(aVar, list.isEmpty(), displaying.x(), uiComponent, null, 8, null), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f22483a;
    }

    public static final r b1(final UiState.Displaying displaying, final UiComponent uiComponent, final a aVar, final List newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        return b0.c(null, new Function1() { // from class: or.e0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.withpersona.sdk2.inquiry.ui.a.c1(displaying, uiComponent, newText, aVar, (ym.r.c) obj);
            }
        }, 1, null);
    }

    public static final Unit c1(UiState.Displaying displaying, UiComponent uiComponent, List list, a aVar, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((InputInternationalDbComponent) uiComponent).A((Option) CollectionsKt.firstOrNull(list))), null, m0(aVar, list.isEmpty(), displaying.x(), uiComponent, null, 8, null), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f22483a;
    }

    public static final r d1(final UiState.Displaying displaying, final UiComponent uiComponent, final a aVar, final List newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        return b0.c(null, new Function1() { // from class: or.y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.withpersona.sdk2.inquiry.ui.a.e1(displaying, uiComponent, newText, aVar, (ym.r.c) obj);
            }
        }, 1, null);
    }

    public static final Unit e1(UiState.Displaying displaying, UiComponent uiComponent, List list, a aVar, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((InputInternationalDbComponent) uiComponent).C((Option) CollectionsKt.firstOrNull(list))), null, m0(aVar, list.isEmpty(), displaying.x(), uiComponent, null, 8, null), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f22483a;
    }

    public static final r f1(final UiState.Displaying displaying, final UiComponent uiComponent, final a aVar, final String newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        return b0.c(null, new Function1() { // from class: or.j0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.withpersona.sdk2.inquiry.ui.a.g1(displaying, uiComponent, newText, aVar, (ym.r.c) obj);
            }
        }, 1, null);
    }

    public static final Unit g1(UiState.Displaying displaying, UiComponent uiComponent, String str, a aVar, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((InputInternationalDbComponent) uiComponent).D(str)), null, m0(aVar, str.length() == 0, displaying.x(), uiComponent, null, 8, null), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f22483a;
    }

    public static final r h1(final UiState.Displaying displaying, final UiComponent uiComponent, final JpMyNumberNfcScanResult jpMyNumberNfcScanResult) {
        return b0.c(null, new Function1() { // from class: or.l0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.withpersona.sdk2.inquiry.ui.a.i1(displaying, uiComponent, jpMyNumberNfcScanResult, (ym.r.c) obj);
            }
        }, 1, null);
    }

    public static final Unit i1(UiState.Displaying displaying, UiComponent uiComponent, JpMyNumberNfcScanResult jpMyNumberNfcScanResult, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((JpMyNumberNfcScanComponent) uiComponent).m(jpMyNumberNfcScanResult)), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262142, null));
        return Unit.f22483a;
    }

    public static final r j1(final UiState.Displaying displaying, final UiComponent uiComponent, final String newValue) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        return b0.c(null, new Function1() { // from class: or.u0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.withpersona.sdk2.inquiry.ui.a.k1(displaying, uiComponent, newValue, (ym.r.c) obj);
            }
        }, 1, null);
    }

    public static final Unit k1(UiState.Displaying displaying, UiComponent uiComponent, String str, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((MdocComponent) uiComponent).p(str)), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262142, null));
        return Unit.f22483a;
    }

    public static final r l1(final UiState.Displaying displaying, final UiComponent uiComponent, final String newValue) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        return b0.c(null, new Function1() { // from class: or.b1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.withpersona.sdk2.inquiry.ui.a.m1(displaying, uiComponent, newValue, (ym.r.c) obj);
            }
        }, 1, null);
    }

    public static /* synthetic */ List m0(a aVar, boolean z10, List list, UiComponent uiComponent, String str, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            str = null;
        }
        return aVar.l0(z10, list, uiComponent, str);
    }

    public static final Unit m1(UiState.Displaying displaying, UiComponent uiComponent, String str, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        MdocComponent mdocComponent = (MdocComponent) uiComponent;
        action.e(b.b(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, mdocComponent.q(str)), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262142, null), mdocComponent.getSuccessfulMdocRetrievalTransitionComponentName()));
        return Unit.f22483a;
    }

    public static final r n1(final UiComponent uiComponent, final UiState.Displaying displaying, zq.c.b output) {
        final PhoneNumberSnaComponent phoneNumberSnaComponentM;
        Intrinsics.checkNotNullParameter(output, "output");
        if (output instanceof zq.c.b.C0691b) {
            phoneNumberSnaComponentM = ((PhoneNumberSnaComponent) uiComponent).m(((zq.c.b.C0691b) output).a(), null, null);
        } else {
            if (!(output instanceof zq.c.b.Error)) {
                throw new jt.l();
            }
            zq.c.b.Error error = (zq.c.b.Error) output;
            phoneNumberSnaComponentM = ((PhoneNumberSnaComponent) uiComponent).m(null, error.getErrorName(), error.getErrorMessage());
        }
        return b0.c(null, new Function1() { // from class: or.w0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.withpersona.sdk2.inquiry.ui.a.o1(displaying, uiComponent, phoneNumberSnaComponentM, (ym.r.c) obj);
            }
        }, 1, null);
    }

    public static final r o0(final UiState.Displaying displaying, final UiComponent uiComponent, final a aVar, final String newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        return b0.c(null, new Function1() { // from class: or.a1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.withpersona.sdk2.inquiry.ui.a.p0(displaying, uiComponent, newText, aVar, (ym.r.c) obj);
            }
        }, 1, null);
    }

    public static final Unit o1(UiState.Displaying displaying, UiComponent uiComponent, PhoneNumberSnaComponent phoneNumberSnaComponent, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, phoneNumberSnaComponent), null, null, null, null, null, null, new UiState.Displaying.AutoSubmit(phoneNumberSnaComponent, 0, null), null, false, false, null, null, null, false, 0, null, 0, 262014, null));
        return Unit.f22483a;
    }

    public static final Unit p0(UiState.Displaying displaying, UiComponent uiComponent, String str, a aVar, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((o4) uiComponent).a(str)), null, m0(aVar, str.length() == 0, displaying.x(), uiComponent, null, 8, null), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f22483a;
    }

    public static final r p1(final UiState.Displaying displaying, final UiComponent uiComponent, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return b0.c(null, new Function1() { // from class: or.f1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.withpersona.sdk2.inquiry.ui.a.q1(displaying, uiComponent, (ym.r.c) obj);
            }
        }, 1, null);
    }

    public static final r q0(final UiState.Displaying displaying, final UiComponent uiComponent, final a aVar, final String newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        return b0.c(null, new Function1() { // from class: or.q0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.withpersona.sdk2.inquiry.ui.a.r0(displaying, uiComponent, newText, aVar, (ym.r.c) obj);
            }
        }, 1, null);
    }

    public static final Unit q1(UiState.Displaying displaying, UiComponent uiComponent, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(UiState.Displaying.v(displaying, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, ((InputFileUploadComponent) uiComponent).getName(), displaying.getFilePickRequestId() + 1, Settings.DEFAULT_INITIAL_WINDOW_SIZE, null));
        return Unit.f22483a;
    }

    public static final Unit r0(UiState.Displaying displaying, UiComponent uiComponent, String str, a aVar, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((cr.b) uiComponent).q(str).T(str)), null, aVar.l0(str.length() == 0, displaying.x(), uiComponent, "street_1"), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f22483a;
    }

    public static final r r1(final UiComponent uiComponent, final UiState.Displaying displaying, h.b output) {
        Intrinsics.checkNotNullParameter(output, "output");
        if (output instanceof h.b.Success) {
            final InputFileUploadComponent inputFileUploadComponentM = ((InputFileUploadComponent) uiComponent).m(((h.b.Success) output).a());
            return b0.c(null, new Function1() { // from class: or.a0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.ui.a.s1(displaying, uiComponent, inputFileUploadComponentM, (ym.r.c) obj);
                }
            }, 1, null);
        }
        if ((output instanceof h.b.a) || (output instanceof h.b.C0255b)) {
            return b0.c(null, new Function1() { // from class: or.b0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.ui.a.t1(displaying, (ym.r.c) obj);
                }
            }, 1, null);
        }
        throw new jt.l();
    }

    public static final r s0(final UiState.Displaying displaying, final UiComponent uiComponent, final a aVar, final String newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        return b0.c(null, new Function1() { // from class: or.z
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.withpersona.sdk2.inquiry.ui.a.t0(displaying, uiComponent, newText, aVar, (ym.r.c) obj);
            }
        }, 1, null);
    }

    public static final Unit s1(UiState.Displaying displaying, UiComponent uiComponent, InputFileUploadComponent inputFileUploadComponent, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, inputFileUploadComponent), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 196606, null));
        return Unit.f22483a;
    }

    public static final Unit t0(UiState.Displaying displaying, UiComponent uiComponent, String str, a aVar, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((cr.b) uiComponent).j(str)), null, aVar.l0(str.length() == 0, displaying.x(), uiComponent, "street_2"), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f22483a;
    }

    public static final Unit t1(UiState.Displaying displaying, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(UiState.Displaying.v(displaying, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 196607, null));
        return Unit.f22483a;
    }

    public static final r u0(final UiState.Displaying displaying, final UiComponent uiComponent, final a aVar, final String newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        return b0.c(null, new Function1() { // from class: or.f0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.withpersona.sdk2.inquiry.ui.a.v0(displaying, uiComponent, newText, aVar, (ym.r.c) obj);
            }
        }, 1, null);
    }

    public static final r u1(final UiState.Displaying displaying, final UiComponent uiComponent, final a aVar, final Set stringSet) {
        Intrinsics.checkNotNullParameter(stringSet, "stringSet");
        return b0.c(null, new Function1() { // from class: or.x
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.withpersona.sdk2.inquiry.ui.a.v1(displaying, uiComponent, stringSet, aVar, (ym.r.c) obj);
            }
        }, 1, null);
    }

    public static final Unit v0(UiState.Displaying displaying, UiComponent uiComponent, String str, a aVar, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((cr.b) uiComponent).k(str)), null, aVar.l0(str.length() == 0, displaying.x(), uiComponent, "city"), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f22483a;
    }

    public static final Unit v1(UiState.Displaying displaying, UiComponent uiComponent, Set set, a aVar, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((s4) uiComponent).a(set)), null, m0(aVar, set.isEmpty(), displaying.x(), uiComponent, null, 8, null), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f22483a;
    }

    public static final r w0(final UiState.Displaying displaying, final UiComponent uiComponent, final a aVar, final String newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        return b0.c(null, new Function1() { // from class: or.x0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.withpersona.sdk2.inquiry.ui.a.x0(displaying, uiComponent, newText, aVar, (ym.r.c) obj);
            }
        }, 1, null);
    }

    public static final r w1(final UiState.Displaying displaying, final UiComponent uiComponent, final boolean z10) {
        return b0.c(null, new Function1() { // from class: or.r0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.withpersona.sdk2.inquiry.ui.a.x1(displaying, uiComponent, z10, (ym.r.c) obj);
            }
        }, 1, null);
    }

    public static final Unit x0(UiState.Displaying displaying, UiComponent uiComponent, String str, a aVar, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((cr.b) uiComponent).s(str)), null, aVar.l0(str.length() == 0, displaying.x(), uiComponent, "subdivision"), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f22483a;
    }

    public static final Unit x1(UiState.Displaying displaying, UiComponent uiComponent, boolean z10, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((cr.b) uiComponent).o(Boolean.valueOf(z10))), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262142, null));
        return Unit.f22483a;
    }

    public static final r y0(final UiState.Displaying displaying, final UiComponent uiComponent, final a aVar, final String newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        return b0.c(null, new Function1() { // from class: or.d0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.withpersona.sdk2.inquiry.ui.a.z0(displaying, uiComponent, newText, aVar, (ym.r.c) obj);
            }
        }, 1, null);
    }

    public static final Unit z0(UiState.Displaying displaying, UiComponent uiComponent, String str, a aVar, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((cr.b) uiComponent).p(str)), null, aVar.l0(str.length() == 0, displaying.x(), uiComponent, "postal_code"), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f22483a;
    }

    public final UiComponentConfig k0(List<? extends UiComponentConfig> configs, String name) {
        UiComponentConfig uiComponentConfigK0;
        if (configs == null) {
            return null;
        }
        for (UiComponentConfig uiComponentConfig : configs) {
            if (Intrinsics.c(uiComponentConfig.getName(), name)) {
                return uiComponentConfig;
            }
            if ((uiComponentConfig instanceof UiComponentContainerConfig) && (uiComponentConfigK0 = k0(((UiComponentContainerConfig) uiComponentConfig).getChildren(), name)) != null) {
                return uiComponentConfigK0;
            }
        }
        return null;
    }

    public final List<UiComponentErrorInfo> l0(boolean isFieldBlank, List<UiComponentErrorInfo> componentErrors, UiComponent component, String subComponentName) {
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

    public final void n0(@NotNull UiWorkflow.Input renderProps, @NotNull final UiState.Displaying renderState, @NotNull ym.k<? super UiWorkflow.Input, UiState, ? extends UiWorkflow.b, ? extends Object>.a context, @NotNull final UiComponent component) {
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
        if (component instanceof o4) {
            TypedWorker typedWorker = new TypedWorker(d0.k(String.class), ((o4) component).getTextController().a());
            String name = component.getName();
            Function1 function1 = new Function1() { // from class: or.a
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.ui.a.o0(renderState, component, this, (String) obj);
                }
            };
            KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
            w.l(context, typedWorker, d0.l(o.class, companion.a(d0.k(String.class))), name, function1);
            if (component instanceof InputPhoneNumberComponent) {
                InputPhoneNumberComponent inputPhoneNumberComponent = (InputPhoneNumberComponent) component;
                w.l(context, new TypedWorker(d0.l(List.class, companion.a(d0.k(Option.class))), inputPhoneNumberComponent.getCountryCodeOptionsController().a()), d0.l(o.class, companion.a(d0.l(List.class, companion.a(d0.k(Option.class))))), inputPhoneNumberComponent.getName() + ":country", new Function1() { // from class: or.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return com.withpersona.sdk2.inquiry.ui.a.C0(renderState, component, this, (List) obj);
                    }
                });
                return;
            }
            return;
        }
        if (component instanceof w3) {
            nu.h<List<Option>> hVarA = ((w3) component).getSelectedOptionsController().a();
            KTypeProjection.Companion companion2 = KTypeProjection.INSTANCE;
            w.l(context, new TypedWorker(d0.l(List.class, companion2.a(d0.k(Option.class))), hVarA), d0.l(o.class, companion2.a(d0.l(List.class, companion2.a(d0.k(Option.class))))), component.getName(), new Function1() { // from class: or.o
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.ui.a.Z0(renderState, component, this, (List) obj);
                }
            });
            return;
        }
        if (component instanceof s4) {
            nu.h<Set<String>> hVarA2 = ((s4) component).getStringSetController().a();
            KTypeProjection.Companion companion3 = KTypeProjection.INSTANCE;
            w.l(context, new TypedWorker(d0.l(Set.class, companion3.a(d0.k(String.class))), hVarA2), d0.l(o.class, companion3.a(d0.l(Set.class, companion3.a(d0.k(String.class))))), component.getName(), new Function1() { // from class: or.p
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.ui.a.u1(renderState, component, this, (Set) obj);
                }
            });
            return;
        }
        boolean z10 = component instanceof cr.b;
        Class cls = Boolean.TYPE;
        if (z10) {
            TypedWorker typedWorker2 = new TypedWorker(d0.k(cls), ((cr.b) component).getIsAddressFieldCollapsed().a());
            String str = component.getName() + "UpdateCollapsedState";
            Function1 function2 = new Function1() { // from class: or.q
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.ui.a.w1(renderState, component, ((Boolean) obj).booleanValue());
                }
            };
            KTypeProjection.Companion companion4 = KTypeProjection.INSTANCE;
            w.l(context, typedWorker2, d0.l(o.class, companion4.a(d0.k(cls))), str, function2);
            cr.b bVar = (cr.b) component;
            w.l(context, new TypedWorker(d0.k(String.class), bVar.getTextControllerForAddressStreet1().a()), d0.l(o.class, companion4.a(d0.k(String.class))), component.getName() + "UpdateAddressStreet1", new Function1() { // from class: or.r
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.ui.a.q0(renderState, component, this, (String) obj);
                }
            });
            w.l(context, new TypedWorker(d0.k(String.class), bVar.getTextControllerForAddressStreet2().a()), d0.l(o.class, companion4.a(d0.k(String.class))), component.getName() + "UpdateAddressStreet2", new Function1() { // from class: or.s
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.ui.a.s0(renderState, component, this, (String) obj);
                }
            });
            w.l(context, new TypedWorker(d0.k(String.class), bVar.getTextControllerForAddressCity().a()), d0.l(o.class, companion4.a(d0.k(String.class))), component.getName() + "UpdateAddressCity", new Function1() { // from class: or.t
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.ui.a.u0(renderState, component, this, (String) obj);
                }
            });
            w.l(context, new TypedWorker(d0.k(String.class), bVar.getTextControllerForAddressSubdivision().a()), d0.l(o.class, companion4.a(d0.k(String.class))), component.getName() + "UpdateAddressSubdivision", new Function1() { // from class: or.u
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.ui.a.w0(renderState, component, this, (String) obj);
                }
            });
            w.l(context, new TypedWorker(d0.k(String.class), bVar.getTextControllerForAddressPostalCode().a()), d0.l(o.class, companion4.a(d0.k(String.class))), component.getName() + "UpdateAddressPostalCode", new Function1() { // from class: or.v
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.ui.a.y0(renderState, component, this, (String) obj);
                }
            });
            if (component instanceof InputAddressComponent) {
                InputAddressComponent inputAddressComponent = (InputAddressComponent) component;
                if (inputAddressComponent.getAutocompleteMethod() == er.b.Server) {
                    String searchQuery = inputAddressComponent.getSearchQuery();
                    if (searchQuery != null) {
                        w.l(context, this.addressAutocompleteWorker.a(renderProps.getSessionToken(), component, searchQuery), d0.k(com.withpersona.sdk2.inquiry.ui.network.b.class), inputAddressComponent.getName(), new Function1() { // from class: or.l
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return com.withpersona.sdk2.inquiry.ui.a.A0(renderState, component, (com.withpersona.sdk2.inquiry.ui.network.b.AbstractC0257b) obj);
                            }
                        });
                        Unit unit = Unit.f22483a;
                    }
                    String selectedSearchResultId = inputAddressComponent.getSelectedSearchResultId();
                    if (selectedSearchResultId != null) {
                        w.l(context, this.addressDetailsWorker.a(renderProps.getSessionToken(), selectedSearchResultId), d0.k(qr.a.class), "", new Function1() { // from class: or.w
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return com.withpersona.sdk2.inquiry.ui.a.E0(component, renderState, (qr.a.b) obj);
                            }
                        });
                        Unit unit2 = Unit.f22483a;
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (component instanceof m4) {
            w.l(context, new TypedWorker(d0.k(cls), ((m4) component).getTwoStateViewController().a()), d0.l(o.class, KTypeProjection.INSTANCE.a(d0.k(cls))), component.getName(), new Function1() { // from class: or.h0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.ui.a.H0(renderState, component, ((Boolean) obj).booleanValue());
                }
            });
            return;
        }
        if (component instanceof n4) {
            w.l(context, new TypedWorker(d0.e(Number.class), ((n4) component).getNumberController().a()), d0.l(o.class, KTypeProjection.INSTANCE.a(d0.e(Number.class))), component.getName(), new Function1() { // from class: or.s0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.ui.a.J0(renderState, component, this, (Number) obj);
                }
            });
            return;
        }
        if (component instanceof cr.c) {
            w.l(context, new TypedWorker(d0.e(Bitmap.class), ((cr.c) component).getBitmapController().a()), d0.l(o.class, KTypeProjection.INSTANCE.a(d0.e(Bitmap.class))), component.getName(), new Function1() { // from class: or.d1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.ui.a.L0(renderState, component, (Bitmap) obj);
                }
            });
            return;
        }
        if (component instanceof cr.l) {
            w.l(context, new TypedWorker(d0.e(String.class), ((cr.l) component).getDateController().e()), d0.l(o.class, KTypeProjection.INSTANCE.a(d0.e(String.class))), component.getName(), new Function1() { // from class: or.g1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.ui.a.N0(renderState, component, this, (String) obj);
                }
            });
            return;
        }
        if (component instanceof GovernmentIdNfcScanComponent) {
            GovernmentIdNfcScanComponent governmentIdNfcScanComponent = (GovernmentIdNfcScanComponent) component;
            TypedWorker typedWorker3 = new TypedWorker(d0.k(String.class), governmentIdNfcScanComponent.getCardAccessNumberController().a());
            String str2 = governmentIdNfcScanComponent.getName() + "UpdateCardAccessNumber";
            Function1 function3 = new Function1() { // from class: or.h1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.ui.a.P0(renderState, component, this, (String) obj);
                }
            };
            KTypeProjection.Companion companion5 = KTypeProjection.INSTANCE;
            w.l(context, typedWorker3, d0.l(o.class, companion5.a(d0.k(String.class))), str2, function3);
            w.l(context, new TypedWorker(d0.k(String.class), governmentIdNfcScanComponent.getDocumentNumberController().a()), d0.l(o.class, companion5.a(d0.k(String.class))), governmentIdNfcScanComponent.getName() + "UpdateDocumentNumber", new Function1() { // from class: or.i1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.ui.a.R0(renderState, component, this, (String) obj);
                }
            });
            w.l(context, new TypedWorker(d0.e(String.class), governmentIdNfcScanComponent.getDateOfBirthController().e()), d0.l(o.class, companion5.a(d0.e(String.class))), governmentIdNfcScanComponent.getName() + "UpdateDateOfBirth", new Function1() { // from class: or.j1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.ui.a.T0(renderState, component, this, (String) obj);
                }
            });
            w.l(context, new TypedWorker(d0.e(String.class), governmentIdNfcScanComponent.getExpirationDateController().e()), d0.l(o.class, companion5.a(d0.e(String.class))), governmentIdNfcScanComponent.getName() + "UpdateExpirationDate", new Function1() { // from class: or.b
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.ui.a.V0(renderState, component, this, (String) obj);
                }
            });
            w.l(context, new TypedWorker(d0.e(GovernmentIdNfcData.class), governmentIdNfcScanComponent.getNfcDataController().a()), d0.l(o.class, companion5.a(d0.e(GovernmentIdNfcData.class))), governmentIdNfcScanComponent.getName(), new Function1() { // from class: or.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.ui.a.X0(renderState, component, (GovernmentIdNfcData) obj);
                }
            });
            return;
        }
        if (component instanceof InputInternationalDbComponent) {
            InputInternationalDbComponent inputInternationalDbComponent = (InputInternationalDbComponent) component;
            nu.h<List<Option>> hVarA3 = inputInternationalDbComponent.getCountryOptionsController().a();
            KTypeProjection.Companion companion6 = KTypeProjection.INSTANCE;
            w.l(context, new TypedWorker(d0.l(List.class, companion6.a(d0.k(Option.class))), hVarA3), d0.l(o.class, companion6.a(d0.l(List.class, companion6.a(d0.k(Option.class))))), inputInternationalDbComponent.getName() + ":country", new Function1() { // from class: or.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.ui.a.b1(renderState, component, this, (List) obj);
                }
            });
            w.l(context, new TypedWorker(d0.l(List.class, companion6.a(d0.k(Option.class))), inputInternationalDbComponent.getIdTypeOptionsController().a()), d0.l(o.class, companion6.a(d0.l(List.class, companion6.a(d0.k(Option.class))))), inputInternationalDbComponent.getName() + ":idType", new Function1() { // from class: or.f
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.ui.a.d1(renderState, component, this, (List) obj);
                }
            });
            w.l(context, new TypedWorker(d0.k(String.class), inputInternationalDbComponent.getIdValueController().a()), d0.l(o.class, companion6.a(d0.k(String.class))), inputInternationalDbComponent.getName() + ":idValue", new Function1() { // from class: or.g
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.ui.a.f1(renderState, component, this, (String) obj);
                }
            });
            return;
        }
        if (component instanceof JpMyNumberNfcScanComponent) {
            JpMyNumberNfcScanComponent jpMyNumberNfcScanComponent = (JpMyNumberNfcScanComponent) component;
            w.l(context, new TypedWorker(d0.e(JpMyNumberNfcScanResult.class), jpMyNumberNfcScanComponent.getScanResultController().a()), d0.l(o.class, KTypeProjection.INSTANCE.a(d0.e(JpMyNumberNfcScanResult.class))), jpMyNumberNfcScanComponent.getName() + ":scanResult", new Function1() { // from class: or.h
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.ui.a.h1(renderState, component, (JpMyNumberNfcScanResult) obj);
                }
            });
            return;
        }
        if (component instanceof MdocComponent) {
            MdocComponent mdocComponent = (MdocComponent) component;
            TypedWorker typedWorker4 = new TypedWorker(d0.k(String.class), mdocComponent.getErrorTextController().a());
            String str3 = mdocComponent.getName() + ":error";
            Function1 function4 = new Function1() { // from class: or.i
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.ui.a.j1(renderState, component, (String) obj);
                }
            };
            KTypeProjection.Companion companion7 = KTypeProjection.INSTANCE;
            w.l(context, typedWorker4, d0.l(o.class, companion7.a(d0.k(String.class))), str3, function4);
            w.l(context, new TypedWorker(d0.k(String.class), mdocComponent.getMdocDataController().a()), d0.l(o.class, companion7.a(d0.k(String.class))), mdocComponent.getName() + ":data", new Function1() { // from class: or.j
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.ui.a.l1(renderState, component, (String) obj);
                }
            });
            return;
        }
        if (component instanceof PhoneNumberSnaComponent) {
            PhoneNumberSnaComponent phoneNumberSnaComponent = (PhoneNumberSnaComponent) component;
            PhoneNumberSna.Attributes attributes3 = phoneNumberSnaComponent.getConfig().getAttributes();
            w.l(context, this.silentNetworkAuthWorker.a(this.applicationContext, new SilentNetworkAuthConfig((attributes3 == null || (checkUrl = attributes3.getCheckUrl()) == null) ? "" : checkUrl, 0, 0L, 6, null), attributes3 != null ? attributes3.getTimeoutSeconds() : 10), d0.k(zq.a.class), phoneNumberSnaComponent.getName(), new Function1() { // from class: or.k
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.ui.a.n1(component, renderState, (zq.c.b) obj);
                }
            });
            return;
        }
        if (component instanceof InputFileUploadComponent) {
            InputFileUploadComponent inputFileUploadComponent = (InputFileUploadComponent) component;
            w.l(context, new TypedWorker(d0.k(Unit.class), inputFileUploadComponent.getFileUploadController().a()), d0.l(o.class, KTypeProjection.INSTANCE.a(d0.k(Unit.class))), inputFileUploadComponent.getName() + "_pick_request", new Function1() { // from class: or.m
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.ui.a.p1(renderState, component, (Unit) obj);
                }
            });
            if (Intrinsics.c(renderState.getFilePickComponentName(), inputFileUploadComponent.getName())) {
                UiComponentConfig uiComponentConfigK0 = k0(renderProps.getComponents(), inputFileUploadComponent.getName());
                InputFileUpload inputFileUpload = uiComponentConfigK0 instanceof InputFileUpload ? (InputFileUpload) uiComponentConfigK0 : null;
                int iIntValue = 1;
                if (inputFileUpload == null || (attributes2 = inputFileUpload.getAttributes()) == null || (allowedFileTypes = attributes2.getAllowedFileTypes()) == null || (strArr = (String[]) allowedFileTypes.toArray(new String[0])) == null) {
                    strArr = new String[]{"*/*"};
                }
                if (inputFileUpload != null && (attributes = inputFileUpload.getAttributes()) != null && (fileUploadLimit = attributes.getFileUploadLimit()) != null) {
                    iIntValue = fileUploadLimit.intValue();
                }
                w.l(context, this.fileSelectWorkerFactory.b(inputFileUploadComponent.getName() + "_" + renderState.getFilePickRequestId(), strArr, iIntValue), d0.k(h.class), "", new Function1() { // from class: or.n
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return com.withpersona.sdk2.inquiry.ui.a.r1(component, renderState, (com.withpersona.sdk2.inquiry.ui.h.b) obj);
                    }
                });
            }
        }
    }
}
