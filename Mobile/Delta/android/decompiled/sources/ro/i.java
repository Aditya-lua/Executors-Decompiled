package ro;

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
import com.withpersona.sdk2.inquiry.workflows.WorkflowState;
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
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JQ\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017JQ\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00182\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lro/i;", "", "Luq/a;", "navigationStateManager", "<init>", "(Luq/a;)V", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;", "renderProps", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationError;", "renderState", "Lvr/f;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "workflowContext", "Luo/l;", "videoCaptureHelper", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;", "", "onOutput", "Lwq/l;", "transition", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$d;", "i", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationError;Lvr/f;Luo/l;Lkotlin/jvm/functions/Function1;Lwq/l;)Lcom/withpersona/sdk2/inquiry/governmentid/Screen$d;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationManualSelect;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen;", "m", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationManualSelect;Lvr/f;Luo/l;Lkotlin/jvm/functions/Function1;Lwq/l;)Lcom/withpersona/sdk2/inquiry/governmentid/Screen;", "a", "Luq/a;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final uq.a navigationStateManager;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29976a;

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
            f29976a = iArr;
        }
    }

    public i(@NotNull uq.a navigationStateManager) {
        Intrinsics.checkNotNullParameter(navigationStateManager, "navigationStateManager");
        this.navigationStateManager = navigationStateManager;
    }

    public static final Unit j(vr.f fVar) {
        String countryCode;
        String str;
        WorkflowState workflowStateI = fVar.i();
        GovernmentIdState.AutoClassificationError autoClassificationError = workflowStateI instanceof GovernmentIdState.AutoClassificationError ? (GovernmentIdState.AutoClassificationError) workflowStateI : null;
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
        fVar.p(new GovernmentIdState.AutoClassificationManualSelect(autoClassificationError.getCurrentPart(), autoClassificationError.E(), autoClassificationError.D(), autoClassificationError.getPartIndex(), qo.e.e(fVar, true), autoClassificationError.getCountryCode(), autoClassificationError.I(), new CameraProperties(null, null, null, 0, 0, 31, null), autoClassificationError.L(), countryCode, str));
        return Unit.f22483a;
    }

    public static final Unit k(vr.f fVar, GovernmentIdWorkflow.Input input, uo.l lVar, Function1 function1) {
        qo.e.p(fVar, input, lVar, function1);
        return Unit.f22483a;
    }

    public static final Unit l(Function1 function1) {
        function1.invoke(GovernmentIdWorkflow.a.b.f10661a);
        return Unit.f22483a;
    }

    public static final Unit n(vr.f fVar, GovernmentIdWorkflow.Input input, uo.l lVar, Function1 function1) {
        qo.e.p(fVar, input, lVar, function1);
        return Unit.f22483a;
    }

    public static final Unit o(Function1 function1) {
        function1.invoke(GovernmentIdWorkflow.a.b.f10661a);
        return Unit.f22483a;
    }

    public static final Unit p(vr.f fVar, Option it) {
        Intrinsics.checkNotNullParameter(it, "it");
        WorkflowState workflowStateI = fVar.i();
        GovernmentIdState.AutoClassificationManualSelect autoClassificationManualSelect = workflowStateI instanceof GovernmentIdState.AutoClassificationManualSelect ? (GovernmentIdState.AutoClassificationManualSelect) workflowStateI : null;
        if (autoClassificationManualSelect == null) {
            return Unit.f22483a;
        }
        fVar.p(GovernmentIdState.AutoClassificationManualSelect.J(autoClassificationManualSelect, null, null, null, 0, null, null, null, null, null, it.getValue(), null, 1535, null));
        return Unit.f22483a;
    }

    public static final Unit q(vr.f fVar, Option it) {
        Intrinsics.checkNotNullParameter(it, "it");
        WorkflowState workflowStateI = fVar.i();
        GovernmentIdState.AutoClassificationManualSelect autoClassificationManualSelect = workflowStateI instanceof GovernmentIdState.AutoClassificationManualSelect ? (GovernmentIdState.AutoClassificationManualSelect) workflowStateI : null;
        if (autoClassificationManualSelect == null) {
            return Unit.f22483a;
        }
        fVar.p(GovernmentIdState.AutoClassificationManualSelect.J(autoClassificationManualSelect, null, null, null, 0, null, null, null, null, null, null, it.getValue(), 1023, null));
        return Unit.f22483a;
    }

    public static final Unit r(IdConfig idConfig, GovernmentIdState.AutoClassificationManualSelect autoClassificationManualSelect, vr.f fVar, GovernmentIdWorkflow.Input input, uo.l lVar) {
        if (idConfig == null) {
            return Unit.f22483a;
        }
        qo.e.s(autoClassificationManualSelect, fVar, input, null, idConfig, lVar, autoClassificationManualSelect.getCameraProperties(), false, idConfig.f(), -1, null, autoClassificationManualSelect.getSelectedCountryCode(), 1152, null);
        return Unit.f22483a;
    }

    @NotNull
    public final Screen.d i(@NotNull final GovernmentIdWorkflow.Input renderProps, @NotNull GovernmentIdState.AutoClassificationError renderState, @NotNull final vr.f<GovernmentIdState> workflowContext, @NotNull final uo.l videoCaptureHelper, @NotNull final Function1<? super GovernmentIdWorkflow.a, Unit> onOutput, @NotNull wq.l transition) {
        String idClassRejectedTitle;
        String idClassRejectedContinueButtonText;
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(workflowContext, "workflowContext");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        Intrinsics.checkNotNullParameter(onOutput, "onOutput");
        Intrinsics.checkNotNullParameter(transition, "transition");
        io.b errorType = renderState.getErrorType();
        int[] iArr = a.f29976a;
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
        Function0 function0 = new Function0() { // from class: ro.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return i.j(workflowContext);
            }
        };
        Function0 function1 = new Function0() { // from class: ro.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return i.k(workflowContext, renderProps, videoCaptureHelper, onOutput);
            }
        };
        Function0 function2 = new Function0() { // from class: ro.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return i.l(onOutput);
            }
        };
        boolean zC = videoCaptureHelper.c(renderProps);
        String autoClassificationPageNavBarTitle = renderProps.getStrings().getAutoClassificationPageNavBarTitle();
        if (autoClassificationPageNavBarTitle == null) {
            autoClassificationPageNavBarTitle = renderProps.getStrings().getCapturePageNavBarTitle();
        }
        return new Screen.d(idClassRejectedTitle, str, styles, navigationStateB, function0, function1, function2, zC, autoClassificationPageNavBarTitle, transition);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final Screen m(@NotNull final GovernmentIdWorkflow.Input renderProps, @NotNull final GovernmentIdState.AutoClassificationManualSelect renderState, @NotNull final vr.f<GovernmentIdState> workflowContext, @NotNull final uo.l videoCaptureHelper, @NotNull final Function1<? super GovernmentIdWorkflow.a, Unit> onOutput, @NotNull wq.l transition) {
        Object next;
        List<IdConfig> listK;
        String idClassKey;
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(workflowContext, "workflowContext");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        Intrinsics.checkNotNullParameter(onOutput, "onOutput");
        Intrinsics.checkNotNullParameter(transition, "transition");
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
            if ((listH0 == null || (idClassKey = j.b(listH0, renderState.getSelectedCountryCode(), idConfig.getIdClassKey(), "selectPage")) == null) && (idClassKey = renderProps.getStrings().V().get(idConfig.getIdClassKey())) == null) {
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
            arrayList2.add(new Screen.a.CountryOption(idConfigForCountry2.getCountryCode(), idConfigForCountry2.getCountryName(), jo.z.a(idConfigForCountry2.getCountryCode())));
        }
        String countryInputTitle = renderProps.getStrings().getCountryInputTitle();
        String selectedCountryCode = renderState.getSelectedCountryCode();
        String idClassInputTitle = renderProps.getStrings().getIdClassInputTitle();
        String selectedIdClass = renderState.getSelectedIdClass();
        String manualClassificationContinueButtonText = renderProps.getStrings().getManualClassificationContinueButtonText();
        boolean z10 = obj != null;
        final IdConfig idConfig2 = obj;
        NavigationState navigationStateB = this.navigationStateManager.b();
        io.d designVersion = renderProps.getDesignVersion();
        String autoClassificationPageNavBarTitle = renderProps.getStrings().getAutoClassificationPageNavBarTitle();
        if (autoClassificationPageNavBarTitle == null) {
            autoClassificationPageNavBarTitle = renderProps.getStrings().getCapturePageNavBarTitle();
        }
        return new Screen.a(manualClassificationTitle, unableToClassifyDocumentTitle, styles, arrayList2, selectedCountryCode, arrayList, selectedIdClass, countryInputTitle, idClassInputTitle, manualClassificationContinueButtonText, z10, navigationStateB, designVersion, new Function1() { // from class: ro.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                return i.p(workflowContext, (Option) obj3);
            }
        }, new Function1() { // from class: ro.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                return i.q(workflowContext, (Option) obj3);
            }
        }, new Function0() { // from class: ro.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return i.r(idConfig2, renderState, workflowContext, renderProps, videoCaptureHelper);
            }
        }, new Function0() { // from class: ro.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return i.n(workflowContext, renderProps, videoCaptureHelper, onOutput);
            }
        }, new Function0() { // from class: ro.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return i.o(onOutput);
            }
        }, autoClassificationPageNavBarTitle, transition);
    }
}
