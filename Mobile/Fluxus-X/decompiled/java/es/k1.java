package es;

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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ln.TypedWorker;
import nr.SilentNetworkAuthConfig;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.collections.CollectionsKt;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.reflect.KTypeProjection;
import qr.Option;
import qr.PhoneNumberSnaComponent;
import sr.GovernmentIdNfcData;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J?\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00170\u000e2\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u000e2\u0006\u0010\u001a\u001a\u00020\u00192\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJM\u0010)\u001a\u00020(2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2&\u0010'\u001a\"0\"R\u001a\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00010$j\u0002`#2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u00065"}, d2 = {"Les/k1;", BuildConfig.FLAVOR, "Landroid/content/Context;", "applicationContext", "Lcom/withpersona/sdk2/inquiry/ui/network/b$a;", "addressAutocompleteWorker", "Lgs/a$a;", "addressDetailsWorker", "Lnr/b$a;", "silentNetworkAuthWorker", "Les/k4$a;", "fileSelectWorkerFactory", "<init>", "(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/ui/network/b$a;Lgs/a$a;Lnr/b$a;Les/k4$a;)V", BuildConfig.FLAVOR, "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "configs", BuildConfig.FLAVOR, "name", "k0", "(Ljava/util/List;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", BuildConfig.FLAVOR, "isFieldBlank", "Les/g2;", "componentErrors", "Lqr/x5;", "component", "subComponentName", "l0", "(ZLjava/util/List;Lqr/x5;Ljava/lang/String;)Ljava/util/List;", "Les/s6$b;", "renderProps", "Les/i4$a;", "renderState", "Lln/k$a;", "Lcom/withpersona/sdk2/inquiry/ui/RenderContext;", "Lln/k;", "Les/i4;", "Les/s6$c;", "context", BuildConfig.FLAVOR, "n0", "(Les/s6$b;Les/i4$a;Lln/k$a;Lqr/x5;)V", "a", "Landroid/content/Context;", "b", "Lcom/withpersona/sdk2/inquiry/ui/network/b$a;", "c", "Lgs/a$a;", "d", "Lnr/b$a;", "e", "Les/k4$a;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k1 {

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

    public k1(@NotNull Context applicationContext, @NotNull com.withpersona.sdk2.inquiry.ui.network.b.a addressAutocompleteWorker, @NotNull gs.a.C0332a addressDetailsWorker, @NotNull nr.b.a silentNetworkAuthWorker, @NotNull k4.a fileSelectWorkerFactory) {
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

    public static final ln.r A0(final i4.Displaying displaying, final qr.x5 x5Var, final com.withpersona.sdk2.inquiry.ui.network.b.AbstractC0196b response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return ln.b0.c(null, new Function1() { // from class: es.m0
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k1.B0(response, displaying, x5Var, (ln.r.c) obj);
            }
        }, 1, null);
    }

    public static final Unit B0(com.withpersona.sdk2.inquiry.ui.network.b.AbstractC0196b abstractC0196b, i4.Displaying displaying, qr.x5 x5Var, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (abstractC0196b instanceof com.withpersona.sdk2.inquiry.ui.network.b.AbstractC0196b.C0197b) {
            action.e(i4.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.g.m(displaying.getComponents(), x5Var, ((InputAddressComponent) x5Var).U(((com.withpersona.sdk2.inquiry.ui.network.b.AbstractC0196b.C0197b) abstractC0196b).a()).T(null)), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262142, null));
        } else if (!(abstractC0196b instanceof com.withpersona.sdk2.inquiry.ui.network.b.AbstractC0196b.a)) {
            throw new zt.l();
        }
        return Unit.f21506a;
    }

    public static final ln.r C0(final i4.Displaying displaying, final qr.x5 x5Var, final k1 k1Var, final List newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        return ln.b0.c(null, new Function1() { // from class: es.c1
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k1.D0(displaying, x5Var, newText, k1Var, (ln.r.c) obj);
            }
        }, 1, null);
    }

    public static final Unit D0(i4.Displaying displaying, qr.x5 x5Var, List list, k1 k1Var, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(i4.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.g.m(displaying.getComponents(), x5Var, ((InputPhoneNumberComponent) x5Var).u((Option) CollectionsKt.firstOrNull(list))), null, m0(k1Var, list.isEmpty(), displaying.x(), x5Var, null, 8, null), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f21506a;
    }

    public static final ln.r E0(final qr.x5 x5Var, final i4.Displaying displaying, final gs.a.b response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (response instanceof gs.a.b.C0334b) {
            return ln.b0.c(null, new Function1() { // from class: es.o0
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return k1.F0(x5Var, response, displaying, (ln.r.c) obj);
                }
            }, 1, null);
        }
        if (response instanceof gs.a.b.C0333a) {
            return ln.b0.c(null, new Function1() { // from class: es.p0
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return k1.G0(response, (ln.r.c) obj);
                }
            }, 1, null);
        }
        throw new zt.l();
    }

    public static final Unit F0(qr.x5 x5Var, gs.a.b bVar, i4.Displaying displaying, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Boolean bool = Boolean.FALSE;
        gs.a.b.C0334b c0334b = (gs.a.b.C0334b) bVar;
        InputAddressComponent inputAddressComponentQ = ((InputAddressComponent) x5Var).o(bool).q(c0334b.getResult().getAddressStreet1());
        String addressStreet2 = c0334b.getResult().getAddressStreet2();
        if (addressStreet2 == null) {
            addressStreet2 = BuildConfig.FLAVOR;
        }
        InputAddressComponent inputAddressComponentS = inputAddressComponentQ.j(addressStreet2).k(c0334b.getResult().getAddressCity()).s(c0334b.getResult().getAddressSubdivision()).p(c0334b.getResult().getAddressPostalCode()).V(null).S(bool);
        action.e(i4.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.g.m(displaying.getComponents(), x5Var, inputAddressComponentS), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262142, null));
        inputAddressComponentS.getTextControllerForAddressStreet1().c(inputAddressComponentS.getStreet1());
        inputAddressComponentS.getTextControllerForAddressStreet2().c(inputAddressComponentS.getStreet2());
        inputAddressComponentS.getTextControllerForAddressCity().c(inputAddressComponentS.getCity());
        inputAddressComponentS.getTextControllerForAddressSubdivision().c(inputAddressComponentS.getSubdivision());
        inputAddressComponentS.getTextControllerForAddressPostalCode().c(inputAddressComponentS.getPostalCode());
        return Unit.f21506a;
    }

    public static final Unit G0(gs.a.b bVar, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.d(new s6.c.d("Couldn't load address.", ((gs.a.b.C0333a) bVar).getCause()));
        return Unit.f21506a;
    }

    public static final ln.r H0(final i4.Displaying displaying, final qr.x5 x5Var, final boolean z10) {
        return ln.b0.c(null, new Function1() { // from class: es.e1
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k1.I0(displaying, x5Var, z10, (ln.r.c) obj);
            }
        }, 1, null);
    }

    public static final Unit I0(i4.Displaying displaying, qr.x5 x5Var, boolean z10, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(i4.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.g.m(displaying.getComponents(), x5Var, ((qr.h5) x5Var).a(z10)), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262142, null));
        return Unit.f21506a;
    }

    public static final ln.r J0(final i4.Displaying displaying, final qr.x5 x5Var, final k1 k1Var, final Number number) {
        return ln.b0.c(null, new Function1() { // from class: es.z0
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k1.K0(displaying, x5Var, number, k1Var, (ln.r.c) obj);
            }
        }, 1, null);
    }

    public static final Unit K0(i4.Displaying displaying, qr.x5 x5Var, Number number, k1 k1Var, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(i4.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.g.m(displaying.getComponents(), x5Var, ((qr.i5) x5Var).a(number)), null, m0(k1Var, number == null, displaying.x(), x5Var, null, 8, null), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f21506a;
    }

    public static final ln.r L0(final i4.Displaying displaying, final qr.x5 x5Var, final Bitmap bitmap) {
        return ln.b0.c(null, new Function1() { // from class: es.t0
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k1.M0(displaying, x5Var, bitmap, (ln.r.c) obj);
            }
        }, 1, null);
    }

    public static final Unit M0(i4.Displaying displaying, qr.x5 x5Var, Bitmap bitmap, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(i4.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.g.m(displaying.getComponents(), x5Var, ((qr.e) x5Var).f(bitmap)), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262142, null));
        return Unit.f21506a;
    }

    public static final ln.r N0(final i4.Displaying displaying, final qr.x5 x5Var, final k1 k1Var, final String str) {
        return ln.b0.c(null, new Function1() { // from class: es.v0
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k1.O0(displaying, x5Var, str, k1Var, (ln.r.c) obj);
            }
        }, 1, null);
    }

    public static final Unit O0(i4.Displaying displaying, qr.x5 x5Var, String str, k1 k1Var, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(i4.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.g.m(displaying.getComponents(), x5Var, ((qr.t) x5Var).a(str)), null, m0(k1Var, str == null || str.length() == 0, displaying.x(), x5Var, null, 8, null), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f21506a;
    }

    public static final ln.r P0(final i4.Displaying displaying, final qr.x5 x5Var, final k1 k1Var, final String newValue) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        return ln.b0.c(null, new Function1() { // from class: es.g0
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k1.Q0(displaying, x5Var, newValue, k1Var, (ln.r.c) obj);
            }
        }, 1, null);
    }

    public static final Unit Q0(i4.Displaying displaying, qr.x5 x5Var, String str, k1 k1Var, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(i4.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.g.m(displaying.getComponents(), x5Var, ((GovernmentIdNfcScanComponent) x5Var).q(str)), null, k1Var.l0(str.length() == 0, displaying.x(), x5Var, GovernmentIdNfcScan.cardAccessNumberName), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f21506a;
    }

    public static final ln.r R0(final i4.Displaying displaying, final qr.x5 x5Var, final k1 k1Var, final String newValue) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        return ln.b0.c(null, new Function1() { // from class: es.k0
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k1.S0(displaying, x5Var, newValue, k1Var, (ln.r.c) obj);
            }
        }, 1, null);
    }

    public static final Unit S0(i4.Displaying displaying, qr.x5 x5Var, String str, k1 k1Var, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(i4.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.g.m(displaying.getComponents(), x5Var, ((GovernmentIdNfcScanComponent) x5Var).s(str)), null, k1Var.l0(str.length() == 0, displaying.x(), x5Var, GovernmentIdNfcScan.documentNumberName), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f21506a;
    }

    public static final ln.r T0(final i4.Displaying displaying, final qr.x5 x5Var, final k1 k1Var, final String str) {
        return ln.b0.c(null, new Function1() { // from class: es.c0
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k1.U0(displaying, x5Var, str, k1Var, (ln.r.c) obj);
            }
        }, 1, null);
    }

    public static final Unit U0(i4.Displaying displaying, qr.x5 x5Var, String str, k1 k1Var, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(i4.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.g.m(displaying.getComponents(), x5Var, ((GovernmentIdNfcScanComponent) x5Var).r(str)), null, k1Var.l0(str == null || str.length() == 0, displaying.x(), x5Var, GovernmentIdNfcScan.dateOfBirthName), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f21506a;
    }

    public static final ln.r V0(final i4.Displaying displaying, final qr.x5 x5Var, final k1 k1Var, final String str) {
        return ln.b0.c(null, new Function1() { // from class: es.n0
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k1.W0(displaying, x5Var, str, k1Var, (ln.r.c) obj);
            }
        }, 1, null);
    }

    public static final Unit W0(i4.Displaying displaying, qr.x5 x5Var, String str, k1 k1Var, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(i4.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.g.m(displaying.getComponents(), x5Var, ((GovernmentIdNfcScanComponent) x5Var).t(str)), null, k1Var.l0(str == null || str.length() == 0, displaying.x(), x5Var, GovernmentIdNfcScan.expirationDateName), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f21506a;
    }

    public static final ln.r X0(final i4.Displaying displaying, final qr.x5 x5Var, final GovernmentIdNfcData governmentIdNfcData) {
        return ln.b0.c(null, new Function1() { // from class: es.i0
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k1.Y0(displaying, x5Var, governmentIdNfcData, (ln.r.c) obj);
            }
        }, 1, null);
    }

    public static final Unit Y0(i4.Displaying displaying, qr.x5 x5Var, GovernmentIdNfcData governmentIdNfcData, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(i4.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.g.m(displaying.getComponents(), x5Var, ((GovernmentIdNfcScanComponent) x5Var).u(governmentIdNfcData)), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262142, null));
        return Unit.f21506a;
    }

    public static final ln.r Z0(final i4.Displaying displaying, final qr.x5 x5Var, final k1 k1Var, final List selectedOptions) {
        Intrinsics.checkNotNullParameter(selectedOptions, "selectedOptions");
        return ln.b0.c(null, new Function1() { // from class: es.y0
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k1.a1(displaying, x5Var, selectedOptions, k1Var, (ln.r.c) obj);
            }
        }, 1, null);
    }

    public static final Unit a1(i4.Displaying displaying, qr.x5 x5Var, List list, k1 k1Var, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(i4.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.g.m(displaying.getComponents(), x5Var, ((qr.k4) x5Var).k(list)), null, m0(k1Var, list.isEmpty(), displaying.x(), x5Var, null, 8, null), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f21506a;
    }

    public static final ln.r b1(final i4.Displaying displaying, final qr.x5 x5Var, final k1 k1Var, final List newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        return ln.b0.c(null, new Function1() { // from class: es.e0
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k1.c1(displaying, x5Var, newText, k1Var, (ln.r.c) obj);
            }
        }, 1, null);
    }

    public static final Unit c1(i4.Displaying displaying, qr.x5 x5Var, List list, k1 k1Var, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(i4.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.g.m(displaying.getComponents(), x5Var, ((InputInternationalDbComponent) x5Var).z((Option) CollectionsKt.firstOrNull(list))), null, m0(k1Var, list.isEmpty(), displaying.x(), x5Var, null, 8, null), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f21506a;
    }

    public static final ln.r d1(final i4.Displaying displaying, final qr.x5 x5Var, final k1 k1Var, final List newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        return ln.b0.c(null, new Function1() { // from class: es.y
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k1.e1(displaying, x5Var, newText, k1Var, (ln.r.c) obj);
            }
        }, 1, null);
    }

    public static final Unit e1(i4.Displaying displaying, qr.x5 x5Var, List list, k1 k1Var, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(i4.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.g.m(displaying.getComponents(), x5Var, ((InputInternationalDbComponent) x5Var).B((Option) CollectionsKt.firstOrNull(list))), null, m0(k1Var, list.isEmpty(), displaying.x(), x5Var, null, 8, null), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f21506a;
    }

    public static final ln.r f1(final i4.Displaying displaying, final qr.x5 x5Var, final k1 k1Var, final String newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        return ln.b0.c(null, new Function1() { // from class: es.j0
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k1.g1(displaying, x5Var, newText, k1Var, (ln.r.c) obj);
            }
        }, 1, null);
    }

    public static final Unit g1(i4.Displaying displaying, qr.x5 x5Var, String str, k1 k1Var, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(i4.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.g.m(displaying.getComponents(), x5Var, ((InputInternationalDbComponent) x5Var).C(str)), null, m0(k1Var, str.length() == 0, displaying.x(), x5Var, null, 8, null), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f21506a;
    }

    public static final ln.r h1(final i4.Displaying displaying, final qr.x5 x5Var, final zp.o oVar) {
        return ln.b0.c(null, new Function1() { // from class: es.l0
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k1.i1(displaying, x5Var, oVar, (ln.r.c) obj);
            }
        }, 1, null);
    }

    public static final Unit i1(i4.Displaying displaying, qr.x5 x5Var, zp.o oVar, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(i4.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.g.m(displaying.getComponents(), x5Var, ((JpMyNumberNfcScanComponent) x5Var).l(oVar)), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262142, null));
        return Unit.f21506a;
    }

    public static final ln.r j1(final i4.Displaying displaying, final qr.x5 x5Var, final String newValue) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        return ln.b0.c(null, new Function1() { // from class: es.u0
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k1.k1(displaying, x5Var, newValue, (ln.r.c) obj);
            }
        }, 1, null);
    }

    public static final Unit k1(i4.Displaying displaying, qr.x5 x5Var, String str, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(i4.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.g.m(displaying.getComponents(), x5Var, ((MdocComponent) x5Var).p(str)), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262142, null));
        return Unit.f21506a;
    }

    public static final ln.r l1(final i4.Displaying displaying, final qr.x5 x5Var, final String newValue) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        return ln.b0.c(null, new Function1() { // from class: es.b1
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k1.m1(displaying, x5Var, newValue, (ln.r.c) obj);
            }
        }, 1, null);
    }

    public static /* synthetic */ List m0(k1 k1Var, boolean z10, List list, qr.x5 x5Var, String str, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            str = null;
        }
        return k1Var.l0(z10, list, x5Var, str);
    }

    public static final Unit m1(i4.Displaying displaying, qr.x5 x5Var, String str, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        MdocComponent mdocComponent = (MdocComponent) x5Var;
        action.e(m1.b(i4.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.g.m(displaying.getComponents(), x5Var, mdocComponent.q(str)), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262142, null), mdocComponent.getSuccessfulMdocRetrievalTransitionComponentName()));
        return Unit.f21506a;
    }

    public static final ln.r n1(final qr.x5 x5Var, final i4.Displaying displaying, nr.d.b output) {
        final PhoneNumberSnaComponent phoneNumberSnaComponentL;
        Intrinsics.checkNotNullParameter(output, "output");
        if (output instanceof nr.d.b.C0532b) {
            phoneNumberSnaComponentL = ((PhoneNumberSnaComponent) x5Var).l(((nr.d.b.C0532b) output).a(), null, null);
        } else {
            if (!(output instanceof nr.d.b.Error)) {
                throw new zt.l();
            }
            nr.d.b.Error error = (nr.d.b.Error) output;
            phoneNumberSnaComponentL = ((PhoneNumberSnaComponent) x5Var).l(null, error.getErrorName(), error.getErrorMessage());
        }
        return ln.b0.c(null, new Function1() { // from class: es.w0
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k1.o1(displaying, x5Var, phoneNumberSnaComponentL, (ln.r.c) obj);
            }
        }, 1, null);
    }

    public static final ln.r o0(final i4.Displaying displaying, final qr.x5 x5Var, final k1 k1Var, final String newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        return ln.b0.c(null, new Function1() { // from class: es.a1
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k1.p0(displaying, x5Var, newText, k1Var, (ln.r.c) obj);
            }
        }, 1, null);
    }

    public static final Unit o1(i4.Displaying displaying, qr.x5 x5Var, PhoneNumberSnaComponent phoneNumberSnaComponent, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(i4.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.g.m(displaying.getComponents(), x5Var, phoneNumberSnaComponent), null, null, null, null, null, null, new i4.Displaying.AutoSubmit(phoneNumberSnaComponent, 0, null), null, false, false, null, null, null, false, 0, null, 0, 262014, null));
        return Unit.f21506a;
    }

    public static final Unit p0(i4.Displaying displaying, qr.x5 x5Var, String str, k1 k1Var, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(i4.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.g.m(displaying.getComponents(), x5Var, ((qr.j5) x5Var).a(str)), null, m0(k1Var, str.length() == 0, displaying.x(), x5Var, null, 8, null), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f21506a;
    }

    public static final ln.r p1(final i4.Displaying displaying, final qr.x5 x5Var, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return ln.b0.c(null, new Function1() { // from class: es.f1
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k1.q1(displaying, x5Var, (ln.r.c) obj);
            }
        }, 1, null);
    }

    public static final ln.r q0(final i4.Displaying displaying, final qr.x5 x5Var, final k1 k1Var, final String newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        return ln.b0.c(null, new Function1() { // from class: es.q0
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k1.r0(displaying, x5Var, newText, k1Var, (ln.r.c) obj);
            }
        }, 1, null);
    }

    public static final Unit q1(i4.Displaying displaying, qr.x5 x5Var, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(i4.Displaying.v(displaying, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, ((InputFileUploadComponent) x5Var).getName(), displaying.getFilePickRequestId() + 1, 65535, null));
        return Unit.f21506a;
    }

    public static final Unit r0(i4.Displaying displaying, qr.x5 x5Var, String str, k1 k1Var, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(i4.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.g.m(displaying.getComponents(), x5Var, ((qr.c) x5Var).q(str).T(str)), null, k1Var.l0(str.length() == 0, displaying.x(), x5Var, "street_1"), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f21506a;
    }

    public static final ln.r r1(final qr.x5 x5Var, final i4.Displaying displaying, k4.b output) {
        Intrinsics.checkNotNullParameter(output, "output");
        if (output instanceof k4.b.Success) {
            final InputFileUploadComponent inputFileUploadComponentL = ((InputFileUploadComponent) x5Var).l(((k4.b.Success) output).a());
            return ln.b0.c(null, new Function1() { // from class: es.a0
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return k1.s1(displaying, x5Var, inputFileUploadComponentL, (ln.r.c) obj);
                }
            }, 1, null);
        }
        if ((output instanceof k4.b.a) || (output instanceof k4.b.C0277b)) {
            return ln.b0.c(null, new Function1() { // from class: es.b0
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return k1.t1(displaying, (ln.r.c) obj);
                }
            }, 1, null);
        }
        throw new zt.l();
    }

    public static final ln.r s0(final i4.Displaying displaying, final qr.x5 x5Var, final k1 k1Var, final String newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        return ln.b0.c(null, new Function1() { // from class: es.z
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k1.t0(displaying, x5Var, newText, k1Var, (ln.r.c) obj);
            }
        }, 1, null);
    }

    public static final Unit s1(i4.Displaying displaying, qr.x5 x5Var, InputFileUploadComponent inputFileUploadComponent, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(i4.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.g.m(displaying.getComponents(), x5Var, inputFileUploadComponent), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 196606, null));
        return Unit.f21506a;
    }

    public static final Unit t0(i4.Displaying displaying, qr.x5 x5Var, String str, k1 k1Var, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(i4.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.g.m(displaying.getComponents(), x5Var, ((qr.c) x5Var).j(str)), null, k1Var.l0(str.length() == 0, displaying.x(), x5Var, "street_2"), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f21506a;
    }

    public static final Unit t1(i4.Displaying displaying, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(i4.Displaying.v(displaying, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 196607, null));
        return Unit.f21506a;
    }

    public static final ln.r u0(final i4.Displaying displaying, final qr.x5 x5Var, final k1 k1Var, final String newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        return ln.b0.c(null, new Function1() { // from class: es.f0
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k1.v0(displaying, x5Var, newText, k1Var, (ln.r.c) obj);
            }
        }, 1, null);
    }

    public static final ln.r u1(final i4.Displaying displaying, final qr.x5 x5Var, final k1 k1Var, final Set stringSet) {
        Intrinsics.checkNotNullParameter(stringSet, "stringSet");
        return ln.b0.c(null, new Function1() { // from class: es.x
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k1.v1(displaying, x5Var, stringSet, k1Var, (ln.r.c) obj);
            }
        }, 1, null);
    }

    public static final Unit v0(i4.Displaying displaying, qr.x5 x5Var, String str, k1 k1Var, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(i4.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.g.m(displaying.getComponents(), x5Var, ((qr.c) x5Var).k(str)), null, k1Var.l0(str.length() == 0, displaying.x(), x5Var, "city"), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f21506a;
    }

    public static final Unit v1(i4.Displaying displaying, qr.x5 x5Var, Set set, k1 k1Var, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(i4.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.g.m(displaying.getComponents(), x5Var, ((qr.o5) x5Var).a(set)), null, m0(k1Var, set.isEmpty(), displaying.x(), x5Var, null, 8, null), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f21506a;
    }

    public static final ln.r w0(final i4.Displaying displaying, final qr.x5 x5Var, final k1 k1Var, final String newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        return ln.b0.c(null, new Function1() { // from class: es.x0
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k1.x0(displaying, x5Var, newText, k1Var, (ln.r.c) obj);
            }
        }, 1, null);
    }

    public static final ln.r w1(final i4.Displaying displaying, final qr.x5 x5Var, final boolean z10) {
        return ln.b0.c(null, new Function1() { // from class: es.r0
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k1.x1(displaying, x5Var, z10, (ln.r.c) obj);
            }
        }, 1, null);
    }

    public static final Unit x0(i4.Displaying displaying, qr.x5 x5Var, String str, k1 k1Var, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(i4.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.g.m(displaying.getComponents(), x5Var, ((qr.c) x5Var).s(str)), null, k1Var.l0(str.length() == 0, displaying.x(), x5Var, "subdivision"), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f21506a;
    }

    public static final Unit x1(i4.Displaying displaying, qr.x5 x5Var, boolean z10, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(i4.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.g.m(displaying.getComponents(), x5Var, ((qr.c) x5Var).o(Boolean.valueOf(z10))), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262142, null));
        return Unit.f21506a;
    }

    public static final ln.r y0(final i4.Displaying displaying, final qr.x5 x5Var, final k1 k1Var, final String newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        return ln.b0.c(null, new Function1() { // from class: es.d0
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k1.z0(displaying, x5Var, newText, k1Var, (ln.r.c) obj);
            }
        }, 1, null);
    }

    public static final Unit z0(i4.Displaying displaying, qr.x5 x5Var, String str, k1 k1Var, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(i4.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.g.m(displaying.getComponents(), x5Var, ((qr.c) x5Var).p(str)), null, k1Var.l0(str.length() == 0, displaying.x(), x5Var, "postal_code"), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f21506a;
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

    public final List<g2> l0(boolean isFieldBlank, List<g2> componentErrors, qr.x5 component, String subComponentName) {
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

    public final void n0(@NotNull s6.Input renderProps, @NotNull final i4.Displaying renderState, @NotNull ln.k<? super s6.Input, i4, ? extends s6.c, ? extends Object>.a context, @NotNull final qr.x5 component) {
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
        if (component instanceof qr.j5) {
            TypedWorker typedWorker = new TypedWorker(p001kotlin.jvm.internal.d0.k(String.class), ((qr.j5) component).getTextController().a());
            String name = component.getName();
            Function1 function1 = new Function1() { // from class: es.a
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return k1.o0(renderState, component, this, (String) obj);
                }
            };
            KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
            ln.w.l(context, typedWorker, p001kotlin.jvm.internal.d0.l(ln.o.class, companion.a(p001kotlin.jvm.internal.d0.k(String.class))), name, function1);
            if (component instanceof InputPhoneNumberComponent) {
                InputPhoneNumberComponent inputPhoneNumberComponent = (InputPhoneNumberComponent) component;
                ln.w.l(context, new TypedWorker(p001kotlin.jvm.internal.d0.l(List.class, companion.a(p001kotlin.jvm.internal.d0.k(Option.class))), inputPhoneNumberComponent.getCountryCodeOptionsController().a()), p001kotlin.jvm.internal.d0.l(ln.o.class, companion.a(p001kotlin.jvm.internal.d0.l(List.class, companion.a(p001kotlin.jvm.internal.d0.k(Option.class))))), inputPhoneNumberComponent.getName() + ":country", new Function1() { // from class: es.c
                    @Override // p001kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return k1.C0(renderState, component, this, (List) obj);
                    }
                });
                return;
            }
            return;
        }
        if (component instanceof qr.k4) {
            dv.h<List<Option>> hVarA = ((qr.k4) component).getSelectedOptionsController().a();
            KTypeProjection.Companion companion2 = KTypeProjection.INSTANCE;
            ln.w.l(context, new TypedWorker(p001kotlin.jvm.internal.d0.l(List.class, companion2.a(p001kotlin.jvm.internal.d0.k(Option.class))), hVarA), p001kotlin.jvm.internal.d0.l(ln.o.class, companion2.a(p001kotlin.jvm.internal.d0.l(List.class, companion2.a(p001kotlin.jvm.internal.d0.k(Option.class))))), component.getName(), new Function1() { // from class: es.o
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return k1.Z0(renderState, component, this, (List) obj);
                }
            });
            return;
        }
        if (component instanceof qr.o5) {
            dv.h<Set<String>> hVarA2 = ((qr.o5) component).getStringSetController().a();
            KTypeProjection.Companion companion3 = KTypeProjection.INSTANCE;
            ln.w.l(context, new TypedWorker(p001kotlin.jvm.internal.d0.l(Set.class, companion3.a(p001kotlin.jvm.internal.d0.k(String.class))), hVarA2), p001kotlin.jvm.internal.d0.l(ln.o.class, companion3.a(p001kotlin.jvm.internal.d0.l(Set.class, companion3.a(p001kotlin.jvm.internal.d0.k(String.class))))), component.getName(), new Function1() { // from class: es.p
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return k1.u1(renderState, component, this, (Set) obj);
                }
            });
            return;
        }
        boolean z10 = component instanceof qr.c;
        Class cls = Boolean.TYPE;
        if (z10) {
            TypedWorker typedWorker2 = new TypedWorker(p001kotlin.jvm.internal.d0.k(cls), ((qr.c) component).getIsAddressFieldCollapsed().a());
            String str = component.getName() + "UpdateCollapsedState";
            Function1 function2 = new Function1() { // from class: es.q
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return k1.w1(renderState, component, ((Boolean) obj).booleanValue());
                }
            };
            KTypeProjection.Companion companion4 = KTypeProjection.INSTANCE;
            ln.w.l(context, typedWorker2, p001kotlin.jvm.internal.d0.l(ln.o.class, companion4.a(p001kotlin.jvm.internal.d0.k(cls))), str, function2);
            qr.c cVar = (qr.c) component;
            ln.w.l(context, new TypedWorker(p001kotlin.jvm.internal.d0.k(String.class), cVar.getTextControllerForAddressStreet1().a()), p001kotlin.jvm.internal.d0.l(ln.o.class, companion4.a(p001kotlin.jvm.internal.d0.k(String.class))), component.getName() + "UpdateAddressStreet1", new Function1() { // from class: es.r
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return k1.q0(renderState, component, this, (String) obj);
                }
            });
            ln.w.l(context, new TypedWorker(p001kotlin.jvm.internal.d0.k(String.class), cVar.getTextControllerForAddressStreet2().a()), p001kotlin.jvm.internal.d0.l(ln.o.class, companion4.a(p001kotlin.jvm.internal.d0.k(String.class))), component.getName() + "UpdateAddressStreet2", new Function1() { // from class: es.s
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return k1.s0(renderState, component, this, (String) obj);
                }
            });
            ln.w.l(context, new TypedWorker(p001kotlin.jvm.internal.d0.k(String.class), cVar.getTextControllerForAddressCity().a()), p001kotlin.jvm.internal.d0.l(ln.o.class, companion4.a(p001kotlin.jvm.internal.d0.k(String.class))), component.getName() + "UpdateAddressCity", new Function1() { // from class: es.t
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return k1.u0(renderState, component, this, (String) obj);
                }
            });
            ln.w.l(context, new TypedWorker(p001kotlin.jvm.internal.d0.k(String.class), cVar.getTextControllerForAddressSubdivision().a()), p001kotlin.jvm.internal.d0.l(ln.o.class, companion4.a(p001kotlin.jvm.internal.d0.k(String.class))), component.getName() + "UpdateAddressSubdivision", new Function1() { // from class: es.u
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return k1.w0(renderState, component, this, (String) obj);
                }
            });
            ln.w.l(context, new TypedWorker(p001kotlin.jvm.internal.d0.k(String.class), cVar.getTextControllerForAddressPostalCode().a()), p001kotlin.jvm.internal.d0.l(ln.o.class, companion4.a(p001kotlin.jvm.internal.d0.k(String.class))), component.getName() + "UpdateAddressPostalCode", new Function1() { // from class: es.v
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return k1.y0(renderState, component, this, (String) obj);
                }
            });
            if (component instanceof InputAddressComponent) {
                InputAddressComponent inputAddressComponent = (InputAddressComponent) component;
                if (inputAddressComponent.getAutocompleteMethod() == sr.b.Server) {
                    String searchQuery = inputAddressComponent.getSearchQuery();
                    if (searchQuery != null) {
                        ln.w.l(context, this.addressAutocompleteWorker.a(renderProps.getSessionToken(), component, searchQuery), p001kotlin.jvm.internal.d0.k(com.withpersona.sdk2.inquiry.ui.network.b.class), inputAddressComponent.getName(), new Function1() { // from class: es.l
                            @Override // p001kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return k1.A0(renderState, component, (com.withpersona.sdk2.inquiry.ui.network.b.AbstractC0196b) obj);
                            }
                        });
                        Unit unit = Unit.f21506a;
                    }
                    String selectedSearchResultId = inputAddressComponent.getSelectedSearchResultId();
                    if (selectedSearchResultId != null) {
                        ln.w.l(context, this.addressDetailsWorker.a(renderProps.getSessionToken(), selectedSearchResultId), p001kotlin.jvm.internal.d0.k(gs.a.class), BuildConfig.FLAVOR, new Function1() { // from class: es.w
                            @Override // p001kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return k1.E0(component, renderState, (gs.a.b) obj);
                            }
                        });
                        Unit unit2 = Unit.f21506a;
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (component instanceof qr.h5) {
            ln.w.l(context, new TypedWorker(p001kotlin.jvm.internal.d0.k(cls), ((qr.h5) component).getTwoStateViewController().a()), p001kotlin.jvm.internal.d0.l(ln.o.class, KTypeProjection.INSTANCE.a(p001kotlin.jvm.internal.d0.k(cls))), component.getName(), new Function1() { // from class: es.h0
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return k1.H0(renderState, component, ((Boolean) obj).booleanValue());
                }
            });
            return;
        }
        if (component instanceof qr.i5) {
            ln.w.l(context, new TypedWorker(p001kotlin.jvm.internal.d0.e(Number.class), ((qr.i5) component).getNumberController().a()), p001kotlin.jvm.internal.d0.l(ln.o.class, KTypeProjection.INSTANCE.a(p001kotlin.jvm.internal.d0.e(Number.class))), component.getName(), new Function1() { // from class: es.s0
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return k1.J0(renderState, component, this, (Number) obj);
                }
            });
            return;
        }
        if (component instanceof qr.e) {
            ln.w.l(context, new TypedWorker(p001kotlin.jvm.internal.d0.e(Bitmap.class), ((qr.e) component).getBitmapController().a()), p001kotlin.jvm.internal.d0.l(ln.o.class, KTypeProjection.INSTANCE.a(p001kotlin.jvm.internal.d0.e(Bitmap.class))), component.getName(), new Function1() { // from class: es.d1
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return k1.L0(renderState, component, (Bitmap) obj);
                }
            });
            return;
        }
        if (component instanceof qr.t) {
            ln.w.l(context, new TypedWorker(p001kotlin.jvm.internal.d0.e(String.class), ((qr.t) component).getDateController().e()), p001kotlin.jvm.internal.d0.l(ln.o.class, KTypeProjection.INSTANCE.a(p001kotlin.jvm.internal.d0.e(String.class))), component.getName(), new Function1() { // from class: es.g1
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return k1.N0(renderState, component, this, (String) obj);
                }
            });
            return;
        }
        if (component instanceof GovernmentIdNfcScanComponent) {
            GovernmentIdNfcScanComponent governmentIdNfcScanComponent = (GovernmentIdNfcScanComponent) component;
            TypedWorker typedWorker3 = new TypedWorker(p001kotlin.jvm.internal.d0.k(String.class), governmentIdNfcScanComponent.getCardAccessNumberController().a());
            String str2 = governmentIdNfcScanComponent.getName() + "UpdateCardAccessNumber";
            Function1 function3 = new Function1() { // from class: es.h1
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return k1.P0(renderState, component, this, (String) obj);
                }
            };
            KTypeProjection.Companion companion5 = KTypeProjection.INSTANCE;
            ln.w.l(context, typedWorker3, p001kotlin.jvm.internal.d0.l(ln.o.class, companion5.a(p001kotlin.jvm.internal.d0.k(String.class))), str2, function3);
            ln.w.l(context, new TypedWorker(p001kotlin.jvm.internal.d0.k(String.class), governmentIdNfcScanComponent.getDocumentNumberController().a()), p001kotlin.jvm.internal.d0.l(ln.o.class, companion5.a(p001kotlin.jvm.internal.d0.k(String.class))), governmentIdNfcScanComponent.getName() + "UpdateDocumentNumber", new Function1() { // from class: es.i1
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return k1.R0(renderState, component, this, (String) obj);
                }
            });
            ln.w.l(context, new TypedWorker(p001kotlin.jvm.internal.d0.e(String.class), governmentIdNfcScanComponent.getDateOfBirthController().e()), p001kotlin.jvm.internal.d0.l(ln.o.class, companion5.a(p001kotlin.jvm.internal.d0.e(String.class))), governmentIdNfcScanComponent.getName() + "UpdateDateOfBirth", new Function1() { // from class: es.j1
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return k1.T0(renderState, component, this, (String) obj);
                }
            });
            ln.w.l(context, new TypedWorker(p001kotlin.jvm.internal.d0.e(String.class), governmentIdNfcScanComponent.getExpirationDateController().e()), p001kotlin.jvm.internal.d0.l(ln.o.class, companion5.a(p001kotlin.jvm.internal.d0.e(String.class))), governmentIdNfcScanComponent.getName() + "UpdateExpirationDate", new Function1() { // from class: es.b
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return k1.V0(renderState, component, this, (String) obj);
                }
            });
            ln.w.l(context, new TypedWorker(p001kotlin.jvm.internal.d0.e(GovernmentIdNfcData.class), governmentIdNfcScanComponent.getNfcDataController().a()), p001kotlin.jvm.internal.d0.l(ln.o.class, companion5.a(p001kotlin.jvm.internal.d0.e(GovernmentIdNfcData.class))), governmentIdNfcScanComponent.getName(), new Function1() { // from class: es.d
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return k1.X0(renderState, component, (GovernmentIdNfcData) obj);
                }
            });
            return;
        }
        if (component instanceof InputInternationalDbComponent) {
            InputInternationalDbComponent inputInternationalDbComponent = (InputInternationalDbComponent) component;
            dv.h<List<Option>> hVarA3 = inputInternationalDbComponent.getCountryOptionsController().a();
            KTypeProjection.Companion companion6 = KTypeProjection.INSTANCE;
            ln.w.l(context, new TypedWorker(p001kotlin.jvm.internal.d0.l(List.class, companion6.a(p001kotlin.jvm.internal.d0.k(Option.class))), hVarA3), p001kotlin.jvm.internal.d0.l(ln.o.class, companion6.a(p001kotlin.jvm.internal.d0.l(List.class, companion6.a(p001kotlin.jvm.internal.d0.k(Option.class))))), inputInternationalDbComponent.getName() + ":country", new Function1() { // from class: es.e
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return k1.b1(renderState, component, this, (List) obj);
                }
            });
            ln.w.l(context, new TypedWorker(p001kotlin.jvm.internal.d0.l(List.class, companion6.a(p001kotlin.jvm.internal.d0.k(Option.class))), inputInternationalDbComponent.getIdTypeOptionsController().a()), p001kotlin.jvm.internal.d0.l(ln.o.class, companion6.a(p001kotlin.jvm.internal.d0.l(List.class, companion6.a(p001kotlin.jvm.internal.d0.k(Option.class))))), inputInternationalDbComponent.getName() + ":idType", new Function1() { // from class: es.f
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return k1.d1(renderState, component, this, (List) obj);
                }
            });
            ln.w.l(context, new TypedWorker(p001kotlin.jvm.internal.d0.k(String.class), inputInternationalDbComponent.getIdValueController().a()), p001kotlin.jvm.internal.d0.l(ln.o.class, companion6.a(p001kotlin.jvm.internal.d0.k(String.class))), inputInternationalDbComponent.getName() + ":idValue", new Function1() { // from class: es.g
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return k1.f1(renderState, component, this, (String) obj);
                }
            });
            return;
        }
        if (component instanceof JpMyNumberNfcScanComponent) {
            JpMyNumberNfcScanComponent jpMyNumberNfcScanComponent = (JpMyNumberNfcScanComponent) component;
            ln.w.l(context, new TypedWorker(p001kotlin.jvm.internal.d0.e(zp.o.class), jpMyNumberNfcScanComponent.getScanResultController().a()), p001kotlin.jvm.internal.d0.l(ln.o.class, KTypeProjection.INSTANCE.a(p001kotlin.jvm.internal.d0.e(zp.o.class))), jpMyNumberNfcScanComponent.getName() + ":scanResult", new Function1() { // from class: es.h
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return k1.h1(renderState, component, (zp.o) obj);
                }
            });
            return;
        }
        if (component instanceof MdocComponent) {
            MdocComponent mdocComponent = (MdocComponent) component;
            TypedWorker typedWorker4 = new TypedWorker(p001kotlin.jvm.internal.d0.k(String.class), mdocComponent.getErrorTextController().a());
            String str3 = mdocComponent.getName() + ":error";
            Function1 function4 = new Function1() { // from class: es.i
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return k1.j1(renderState, component, (String) obj);
                }
            };
            KTypeProjection.Companion companion7 = KTypeProjection.INSTANCE;
            ln.w.l(context, typedWorker4, p001kotlin.jvm.internal.d0.l(ln.o.class, companion7.a(p001kotlin.jvm.internal.d0.k(String.class))), str3, function4);
            ln.w.l(context, new TypedWorker(p001kotlin.jvm.internal.d0.k(String.class), mdocComponent.getMdocDataController().a()), p001kotlin.jvm.internal.d0.l(ln.o.class, companion7.a(p001kotlin.jvm.internal.d0.k(String.class))), mdocComponent.getName() + ":data", new Function1() { // from class: es.j
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return k1.l1(renderState, component, (String) obj);
                }
            });
            return;
        }
        if (component instanceof PhoneNumberSnaComponent) {
            PhoneNumberSnaComponent phoneNumberSnaComponent = (PhoneNumberSnaComponent) component;
            PhoneNumberSna.Attributes attributes3 = phoneNumberSnaComponent.getConfig().getAttributes();
            ln.w.l(context, this.silentNetworkAuthWorker.a(this.applicationContext, new SilentNetworkAuthConfig((attributes3 == null || (checkUrl = attributes3.getCheckUrl()) == null) ? BuildConfig.FLAVOR : checkUrl, 0, 0L, 6, null), attributes3 != null ? attributes3.getTimeoutSeconds() : 10), p001kotlin.jvm.internal.d0.k(nr.b.class), phoneNumberSnaComponent.getName(), new Function1() { // from class: es.k
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return k1.n1(component, renderState, (nr.d.b) obj);
                }
            });
            return;
        }
        if (component instanceof InputFileUploadComponent) {
            InputFileUploadComponent inputFileUploadComponent = (InputFileUploadComponent) component;
            ln.w.l(context, new TypedWorker(p001kotlin.jvm.internal.d0.k(Unit.class), inputFileUploadComponent.getFileUploadController().a()), p001kotlin.jvm.internal.d0.l(ln.o.class, KTypeProjection.INSTANCE.a(p001kotlin.jvm.internal.d0.k(Unit.class))), inputFileUploadComponent.getName() + "_pick_request", new Function1() { // from class: es.m
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return k1.p1(renderState, component, (Unit) obj);
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
                ln.w.l(context, this.fileSelectWorkerFactory.b(inputFileUploadComponent.getName() + "_" + renderState.getFilePickRequestId(), strArr, iIntValue), p001kotlin.jvm.internal.d0.k(k4.class), BuildConfig.FLAVOR, new Function1() { // from class: es.n
                    @Override // p001kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return k1.r1(component, renderState, (k4.b) obj);
                    }
                });
            }
        }
    }
}
