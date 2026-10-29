package jo;

import com.google.mlkit.vision.barcode.common.Barcode;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.IdConfigForCountry;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.steps.ui.components.Option;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JM\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2&\u0010\u000f\u001a\"0\nR\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\fj\u0002`\u000b2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014JM\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00152&\u0010\u000f\u001a\"0\nR\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\fj\u0002`\u000b2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Ljo/n;", "", "Luq/a;", "navigationStateManager", "<init>", "(Luq/a;)V", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;", "renderProps", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationError;", "renderState", "Lym/k$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/RenderContext;", "Lym/k;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;", "context", "Luo/l;", "videoCaptureHelper", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$d;", "n", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationError;Lym/k$a;Luo/l;)Lcom/withpersona/sdk2/inquiry/governmentid/Screen$d;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationManualSelect;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen;", "t", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationManualSelect;Lym/k$a;Luo/l;)Lcom/withpersona/sdk2/inquiry/governmentid/Screen;", "a", "Luq/a;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final uq.a navigationStateManager;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21556a;

        static {
            int[] iArr = new int[io.b.values().length];
            try {
                iArr[io.b.IdTypeRejected.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[io.b.UnableToClassify.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f21556a = iArr;
        }
    }

    public n(@NotNull uq.a navigationStateManager) {
        Intrinsics.checkNotNullParameter(navigationStateManager, "navigationStateManager");
        this.navigationStateManager = navigationStateManager;
    }

    public static final Unit A(ym.k.a aVar) {
        aVar.d().a(ym.b0.c(null, new Function1() { // from class: jo.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n.B((ym.r.c) obj);
            }
        }, 1, null));
        return Unit.f22483a;
    }

    public static final Unit B(ym.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.d(GovernmentIdWorkflow.a.b.f10661a);
        return Unit.f22483a;
    }

    public static final Unit o(ym.k.a aVar) {
        aVar.d().a(ym.b0.c(null, new Function1() { // from class: jo.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n.p((ym.r.c) obj);
            }
        }, 1, null));
        return Unit.f22483a;
    }

    public static final Unit p(ym.r.c action) {
        String countryCode;
        String str;
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objC = action.c();
        GovernmentIdState.AutoClassificationError autoClassificationError = objC instanceof GovernmentIdState.AutoClassificationError ? (GovernmentIdState.AutoClassificationError) objC : null;
        if (autoClassificationError == null) {
            return Unit.f22483a;
        }
        if (autoClassificationError.L().size() == 1) {
            IdConfigForCountry idConfigForCountry = (IdConfigForCountry) CollectionsKt.d0(autoClassificationError.L());
            String idClassKey = idConfigForCountry.g().size() == 1 ? ((IdConfig) CollectionsKt.d0(idConfigForCountry.g())).getIdClassKey() : null;
            countryCode = idConfigForCountry.getCountryCode();
            str = idClassKey;
        } else {
            countryCode = null;
            str = null;
        }
        action.e(new GovernmentIdState.AutoClassificationManualSelect(autoClassificationError.getCurrentPart(), autoClassificationError.E(), autoClassificationError.D(), autoClassificationError.getPartIndex(), com.withpersona.sdk2.inquiry.governmentid.n.x(action, true), autoClassificationError.getCountryCode(), autoClassificationError.I(), new CameraProperties(null, null, null, 0, 0, 31, null), autoClassificationError.L(), countryCode, str));
        return Unit.f22483a;
    }

    public static final Unit q(ym.k.a aVar, uo.l lVar) {
        com.withpersona.sdk2.inquiry.governmentid.n.S(aVar, lVar);
        return Unit.f22483a;
    }

    public static final Unit r(ym.k.a aVar) {
        aVar.d().a(ym.b0.c(null, new Function1() { // from class: jo.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n.s((ym.r.c) obj);
            }
        }, 1, null));
        return Unit.f22483a;
    }

    public static final Unit s(ym.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.d(GovernmentIdWorkflow.a.b.f10661a);
        return Unit.f22483a;
    }

    public static final Unit u(ym.k.a aVar, final Option it) {
        Intrinsics.checkNotNullParameter(it, "it");
        aVar.d().a(ym.b0.c(null, new Function1() { // from class: jo.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n.v(it, (ym.r.c) obj);
            }
        }, 1, null));
        return Unit.f22483a;
    }

    public static final Unit v(Option option, ym.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objC = action.c();
        GovernmentIdState.AutoClassificationManualSelect autoClassificationManualSelect = objC instanceof GovernmentIdState.AutoClassificationManualSelect ? (GovernmentIdState.AutoClassificationManualSelect) objC : null;
        if (autoClassificationManualSelect == null) {
            return Unit.f22483a;
        }
        action.e(GovernmentIdState.AutoClassificationManualSelect.J(autoClassificationManualSelect, null, null, null, 0, null, null, null, null, null, option.getValue(), null, 1535, null));
        return Unit.f22483a;
    }

    public static final Unit w(ym.k.a aVar, final Option it) {
        Intrinsics.checkNotNullParameter(it, "it");
        aVar.d().a(ym.b0.c(null, new Function1() { // from class: jo.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n.x(it, (ym.r.c) obj);
            }
        }, 1, null));
        return Unit.f22483a;
    }

    public static final Unit x(Option option, ym.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objC = action.c();
        GovernmentIdState.AutoClassificationManualSelect autoClassificationManualSelect = objC instanceof GovernmentIdState.AutoClassificationManualSelect ? (GovernmentIdState.AutoClassificationManualSelect) objC : null;
        if (autoClassificationManualSelect == null) {
            return Unit.f22483a;
        }
        action.e(GovernmentIdState.AutoClassificationManualSelect.J(autoClassificationManualSelect, null, null, null, 0, null, null, null, null, null, null, option.getValue(), 1023, null));
        return Unit.f22483a;
    }

    public static final Unit y(IdConfig idConfig, GovernmentIdState.AutoClassificationManualSelect autoClassificationManualSelect, ym.k.a aVar, GovernmentIdWorkflow.Input input, uo.l lVar) {
        if (idConfig == null) {
            return Unit.f22483a;
        }
        com.withpersona.sdk2.inquiry.governmentid.n.W(autoClassificationManualSelect, aVar, input, null, idConfig, lVar, autoClassificationManualSelect.getCameraProperties(), (3584 & 128) != 0, (3584 & Barcode.FORMAT_QR_CODE) != 0 ? autoClassificationManualSelect.D() : idConfig.f(), (3584 & Barcode.FORMAT_UPC_A) != 0 ? autoClassificationManualSelect.getPartIndex() : -1, (3584 & Barcode.FORMAT_UPC_E) != 0 ? null : null, (3584 & Barcode.FORMAT_PDF417) != 0 ? autoClassificationManualSelect.getCountryCode() : autoClassificationManualSelect.getSelectedCountryCode());
        return Unit.f22483a;
    }

    public static final Unit z(ym.k.a aVar, uo.l lVar) {
        com.withpersona.sdk2.inquiry.governmentid.n.S(aVar, lVar);
        return Unit.f22483a;
    }

    @NotNull
    public final Screen.d n(@NotNull GovernmentIdWorkflow.Input renderProps, @NotNull GovernmentIdState.AutoClassificationError renderState, @NotNull final ym.k<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.a, ? extends Object>.a context, @NotNull final uo.l videoCaptureHelper) {
        String idClassRejectedTitle;
        String idClassRejectedContinueButtonText;
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        io.b errorType = renderState.getErrorType();
        int[] iArr = a.f21556a;
        int i10 = iArr[errorType.ordinal()];
        if (i10 == 1) {
            idClassRejectedTitle = renderProps.getStrings().getIdClassRejectedTitle();
        } else {
            if (i10 != 2) {
                throw new jt.l();
            }
            idClassRejectedTitle = renderProps.getStrings().getUnableToClassifyDocumentTitle();
        }
        int i11 = iArr[renderState.getErrorType().ordinal()];
        if (i11 == 1) {
            idClassRejectedContinueButtonText = renderProps.getStrings().getIdClassRejectedContinueButtonText();
        } else {
            if (i11 != 2) {
                throw new jt.l();
            }
            idClassRejectedContinueButtonText = renderProps.getStrings().getUnableToClassifyDocumentContinueButtonText();
        }
        String str = idClassRejectedContinueButtonText;
        StepStyles.GovernmentIdStepStyle styles = renderProps.getStyles();
        NavigationState navigationStateB = this.navigationStateManager.b();
        Function0 function0 = new Function0() { // from class: jo.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return n.o(context);
            }
        };
        Function0 function1 = new Function0() { // from class: jo.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return n.q(context, videoCaptureHelper);
            }
        };
        Function0 function2 = new Function0() { // from class: jo.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return n.r(context);
            }
        };
        String autoClassificationPageNavBarTitle = renderProps.getStrings().getAutoClassificationPageNavBarTitle();
        if (autoClassificationPageNavBarTitle == null) {
            autoClassificationPageNavBarTitle = renderProps.getStrings().getCapturePageNavBarTitle();
        }
        return new Screen.d(idClassRejectedTitle, str, styles, navigationStateB, function0, function1, function2, false, autoClassificationPageNavBarTitle, null, 640, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final Screen t(@NotNull final GovernmentIdWorkflow.Input renderProps, @NotNull final GovernmentIdState.AutoClassificationManualSelect renderState, @NotNull final ym.k<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.a, ? extends Object>.a context, @NotNull final uo.l videoCaptureHelper) {
        Object next;
        List<IdConfig> listK;
        String idClassKey;
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        Object obj = null;
        if (renderState.getSelectedCountryCode() == null) {
            listK = kotlin.collections.p.k();
        } else {
            Iterator<T> it = renderState.L().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.c(((IdConfigForCountry) next).getCountryCode(), renderState.getSelectedCountryCode()));
            IdConfigForCountry idConfigForCountry = (IdConfigForCountry) next;
            if (idConfigForCountry == null || (listK = idConfigForCountry.g()) == null) {
                listK = kotlin.collections.p.k();
            }
        }
        List<IdConfig> list = listK;
        ArrayList arrayList = new ArrayList(kotlin.collections.q.u(list, 10));
        for (IdConfig idConfig : list) {
            List<NextStep.GovernmentId.LocalizationOverride> listH0 = renderProps.getStrings().h0();
            if ((listH0 == null || (idClassKey = o.b(listH0, renderState.getSelectedCountryCode(), idConfig.getIdClassKey(), "selectPage")) == null) && (idClassKey = renderProps.getStrings().V().get(idConfig.getIdClassKey())) == null) {
                idClassKey = idConfig.getIdClassKey();
            }
            arrayList.add(new Option(idClassKey, idConfig.getIdClassKey(), null, 4, null));
        }
        if (renderState.getSelectedIdClass() != null) {
            for (Object obj2 : list) {
                if (Intrinsics.c(((IdConfig) obj2).getIdClassKey(), renderState.getSelectedIdClass())) {
                    obj = obj2;
                    break;
                }
            }
            obj = (IdConfig) obj;
        }
        String manualClassificationTitle = renderProps.getStrings().getManualClassificationTitle();
        String unableToClassifyDocumentTitle = renderProps.getStrings().getUnableToClassifyDocumentTitle();
        StepStyles.GovernmentIdStepStyle styles = renderProps.getStyles();
        List<IdConfigForCountry> listL = renderState.L();
        ArrayList arrayList2 = new ArrayList(kotlin.collections.q.u(listL, 10));
        for (IdConfigForCountry idConfigForCountry2 : listL) {
            arrayList2.add(new Screen.a.CountryOption(idConfigForCountry2.getCountryCode(), idConfigForCountry2.getCountryName(), z.a(idConfigForCountry2.getCountryCode())));
        }
        String selectedCountryCode = renderState.getSelectedCountryCode();
        String selectedIdClass = renderState.getSelectedIdClass();
        String countryInputTitle = renderProps.getStrings().getCountryInputTitle();
        String idClassInputTitle = renderProps.getStrings().getIdClassInputTitle();
        String manualClassificationContinueButtonText = renderProps.getStrings().getManualClassificationContinueButtonText();
        boolean z10 = obj != null;
        final IdConfig idConfig2 = obj;
        NavigationState navigationStateB = this.navigationStateManager.b();
        io.d designVersion = renderProps.getDesignVersion();
        Function1 function1 = new Function1() { // from class: jo.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                return n.u(context, (Option) obj3);
            }
        };
        Function1 function2 = new Function1() { // from class: jo.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                return n.w(context, (Option) obj3);
            }
        };
        Function0 function0 = new Function0() { // from class: jo.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return n.y(idConfig2, renderState, context, renderProps, videoCaptureHelper);
            }
        };
        Function0 function3 = new Function0() { // from class: jo.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return n.z(context, videoCaptureHelper);
            }
        };
        Function0 function4 = new Function0() { // from class: jo.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return n.A(context);
            }
        };
        String autoClassificationPageNavBarTitle = renderProps.getStrings().getAutoClassificationPageNavBarTitle();
        if (autoClassificationPageNavBarTitle == null) {
            autoClassificationPageNavBarTitle = renderProps.getStrings().getCapturePageNavBarTitle();
        }
        return new Screen.a(manualClassificationTitle, unableToClassifyDocumentTitle, styles, arrayList2, selectedCountryCode, arrayList, selectedIdClass, countryInputTitle, idClassInputTitle, manualClassificationContinueButtonText, z10, navigationStateB, designVersion, function1, function2, function0, function3, function4, autoClassificationPageNavBarTitle, null, 524288, null);
    }
}
