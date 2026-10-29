package ro;

import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.IdConfigForCountry;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.Option;
import com.withpersona.sdk2.inquiry.workflows.WorkflowState;
import io.EnumC6844b;
import io.EnumC6852d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jo.C7242z;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7699p;
import kotlin.collections.C7701q;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p229jt.C7345l;
import p389qo.C10643e;
import p473uo.C11905l;
import p475uq.C11930a;
import p499vr.C12255f;
import p526wq.EnumC12529l;

/* JADX INFO: renamed from: ro.i */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JQ\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017JQ\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00182\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m31665d2 = {"Lro/i;", "", "Luq/a;", "navigationStateManager", "<init>", "(Luq/a;)V", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;", "renderProps", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationError;", "renderState", "Lvr/f;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "workflowContext", "Luo/l;", "videoCaptureHelper", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;", "", "onOutput", "Lwq/l;", "transition", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$d;", "i", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationError;Lvr/f;Luo/l;Lkotlin/jvm/functions/Function1;Lwq/l;)Lcom/withpersona/sdk2/inquiry/governmentid/Screen$d;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationManualSelect;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen;", "m", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationManualSelect;Lvr/f;Luo/l;Lkotlin/jvm/functions/Function1;Lwq/l;)Lcom/withpersona/sdk2/inquiry/governmentid/Screen;", "a", "Luq/a;", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C10960i {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C11930a navigationStateManager;

    /* JADX INFO: renamed from: ro.i$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f38783a;

        static {
            int[] iArr = new int[EnumC6844b.values().length];
            try {
                iArr[EnumC6844b.IdTypeRejected.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC6844b.UnableToClassify.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f38783a = iArr;
        }
    }

    public C10960i(@NotNull C11930a navigationStateManager) {
        Intrinsics.checkNotNullParameter(navigationStateManager, "navigationStateManager");
        this.navigationStateManager = navigationStateManager;
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m41547j(C12255f c12255f) {
        String countryCode;
        String str;
        WorkflowState workflowStateM45411i = c12255f.m45411i();
        GovernmentIdState.AutoClassificationError autoClassificationError = workflowStateM45411i instanceof GovernmentIdState.AutoClassificationError ? (GovernmentIdState.AutoClassificationError) workflowStateM45411i : null;
        if (autoClassificationError == null) {
            return Unit.f29331a;
        }
        if (autoClassificationError.m16966L().size() == 1) {
            IdConfigForCountry idConfigForCountry = (IdConfigForCountry) CollectionsKt.m31706d0(autoClassificationError.m16966L());
            String idClassKey = idConfigForCountry.m17301g().size() == 1 ? ((IdConfig) CollectionsKt.m31706d0(idConfigForCountry.m17301g())).getIdClassKey() : null;
            countryCode = idConfigForCountry.getCountryCode();
            str = idClassKey;
        } else {
            countryCode = null;
            str = null;
        }
        c12255f.m45417p(new GovernmentIdState.AutoClassificationManualSelect(autoClassificationError.getCurrentPart(), autoClassificationError.mo16956E(), autoClassificationError.mo16955D(), autoClassificationError.getPartIndex(), C10643e.m40734e(c12255f, true), autoClassificationError.getCountryCode(), autoClassificationError.m16963I(), new CameraProperties(null, null, null, 0, 0, 31, null), autoClassificationError.m16966L(), countryCode, str));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m41548k(C12255f c12255f, GovernmentIdWorkflow.Input input, C11905l c11905l, Function1 function1) {
        C10643e.m40745p(c12255f, input, c11905l, function1);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m41549l(Function1 function1) {
        function1.invoke(GovernmentIdWorkflow.AbstractC3503a.b.f13791a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m41550n(C12255f c12255f, GovernmentIdWorkflow.Input input, C11905l c11905l, Function1 function1) {
        C10643e.m40745p(c12255f, input, c11905l, function1);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: o */
    public static final Unit m41551o(Function1 function1) {
        function1.invoke(GovernmentIdWorkflow.AbstractC3503a.b.f13791a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m41552p(C12255f c12255f, Option it) {
        Intrinsics.checkNotNullParameter(it, "it");
        WorkflowState workflowStateM45411i = c12255f.m45411i();
        GovernmentIdState.AutoClassificationManualSelect autoClassificationManualSelect = workflowStateM45411i instanceof GovernmentIdState.AutoClassificationManualSelect ? (GovernmentIdState.AutoClassificationManualSelect) workflowStateM45411i : null;
        if (autoClassificationManualSelect == null) {
            return Unit.f29331a;
        }
        c12255f.m45417p(GovernmentIdState.AutoClassificationManualSelect.m16969J(autoClassificationManualSelect, null, null, null, 0, null, null, null, null, null, it.getValue(), null, 1535, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m41553q(C12255f c12255f, Option it) {
        Intrinsics.checkNotNullParameter(it, "it");
        WorkflowState workflowStateM45411i = c12255f.m45411i();
        GovernmentIdState.AutoClassificationManualSelect autoClassificationManualSelect = workflowStateM45411i instanceof GovernmentIdState.AutoClassificationManualSelect ? (GovernmentIdState.AutoClassificationManualSelect) workflowStateM45411i : null;
        if (autoClassificationManualSelect == null) {
            return Unit.f29331a;
        }
        c12255f.m45417p(GovernmentIdState.AutoClassificationManualSelect.m16969J(autoClassificationManualSelect, null, null, null, 0, null, null, null, null, null, null, it.getValue(), 1023, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: r */
    public static final Unit m41554r(IdConfig idConfig, GovernmentIdState.AutoClassificationManualSelect autoClassificationManualSelect, C12255f c12255f, GovernmentIdWorkflow.Input input, C11905l c11905l) {
        if (idConfig == null) {
            return Unit.f29331a;
        }
        C10643e.m40748s(autoClassificationManualSelect, c12255f, input, null, idConfig, c11905l, autoClassificationManualSelect.getCameraProperties(), false, idConfig.m17272f(), -1, null, autoClassificationManualSelect.getSelectedCountryCode(), 1152, null);
        return Unit.f29331a;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final Screen.C3529d m41555i(@NotNull final GovernmentIdWorkflow.Input renderProps, @NotNull GovernmentIdState.AutoClassificationError renderState, @NotNull final C12255f<GovernmentIdState> workflowContext, @NotNull final C11905l videoCaptureHelper, @NotNull final Function1<? super GovernmentIdWorkflow.AbstractC3503a, Unit> onOutput, @NotNull EnumC12529l transition) {
        String idClassRejectedTitle;
        String idClassRejectedContinueButtonText;
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(workflowContext, "workflowContext");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        Intrinsics.checkNotNullParameter(onOutput, "onOutput");
        Intrinsics.checkNotNullParameter(transition, "transition");
        EnumC6844b errorType = renderState.getErrorType();
        int[] iArr = a.f38783a;
        int i10 = iArr[errorType.ordinal()];
        if (i10 == 1) {
            idClassRejectedTitle = renderProps.getStrings().getIdClassRejectedTitle();
        } else {
            if (i10 != 2) {
                throw new C7345l();
            }
            idClassRejectedTitle = renderProps.getStrings().getUnableToClassifyDocumentTitle();
        }
        int i11 = iArr[renderState.getErrorType().ordinal()];
        if (i11 == 1) {
            idClassRejectedContinueButtonText = renderProps.getStrings().getIdClassRejectedContinueButtonText();
        } else {
            if (i11 != 2) {
                throw new C7345l();
            }
            idClassRejectedContinueButtonText = renderProps.getStrings().getUnableToClassifyDocumentContinueButtonText();
        }
        String str = idClassRejectedContinueButtonText;
        StepStyles.GovernmentIdStepStyle styles = renderProps.getStyles();
        NavigationState navigationStateM44528b = this.navigationStateManager.m44528b();
        Function0 function0 = new Function0() { // from class: ro.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C10960i.m41547j(workflowContext);
            }
        };
        Function0 function1 = new Function0() { // from class: ro.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C10960i.m41548k(workflowContext, renderProps, videoCaptureHelper, onOutput);
            }
        };
        Function0 function2 = new Function0() { // from class: ro.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C10960i.m41549l(onOutput);
            }
        };
        boolean zM44496c = videoCaptureHelper.m44496c(renderProps);
        String autoClassificationPageNavBarTitle = renderProps.getStrings().getAutoClassificationPageNavBarTitle();
        if (autoClassificationPageNavBarTitle == null) {
            autoClassificationPageNavBarTitle = renderProps.getStrings().getCapturePageNavBarTitle();
        }
        return new Screen.C3529d(idClassRejectedTitle, str, styles, navigationStateM44528b, function0, function1, function2, zM44496c, autoClassificationPageNavBarTitle, transition);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r18v0, resolved type: com.withpersona.sdk2.inquiry.governmentid.IdConfig */
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* JADX INFO: renamed from: m */
    public final Screen m41556m(@NotNull final GovernmentIdWorkflow.Input renderProps, @NotNull final GovernmentIdState.AutoClassificationManualSelect renderState, @NotNull final C12255f<GovernmentIdState> workflowContext, @NotNull final C11905l videoCaptureHelper, @NotNull final Function1<? super GovernmentIdWorkflow.AbstractC3503a, Unit> onOutput, @NotNull EnumC12529l transition) {
        Object next;
        List<IdConfig> listM31892k;
        String idClassKey;
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(workflowContext, "workflowContext");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        Intrinsics.checkNotNullParameter(onOutput, "onOutput");
        Intrinsics.checkNotNullParameter(transition, "transition");
        Object obj = null;
        if (renderState.getSelectedCountryCode() == null) {
            listM31892k = C7699p.m31892k();
        } else {
            Iterator<T> it = renderState.m16972L().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.m31980c(((IdConfigForCountry) next).getCountryCode(), renderState.getSelectedCountryCode()));
            IdConfigForCountry idConfigForCountry = (IdConfigForCountry) next;
            if (idConfigForCountry == null || (listM31892k = idConfigForCountry.m17301g()) == null) {
                listM31892k = C7699p.m31892k();
            }
        }
        List<IdConfig> list = listM31892k;
        ArrayList arrayList = new ArrayList(C7701q.m31905u(list, 10));
        for (IdConfig idConfig : list) {
            List<NextStep.GovernmentId.LocalizationOverride> listM17231h0 = renderProps.getStrings().m17231h0();
            if ((listM17231h0 == null || (idClassKey = C10963j.m41558b(listM17231h0, renderState.getSelectedCountryCode(), idConfig.getIdClassKey(), "selectPage")) == null) && (idClassKey = renderProps.getStrings().m17220V().get(idConfig.getIdClassKey())) == null) {
                idClassKey = idConfig.getIdClassKey();
            }
            arrayList.add(new Option(idClassKey, idConfig.getIdClassKey(), null, 4, null));
        }
        if (renderState.getSelectedIdClass() != null) {
            for (Object obj2 : list) {
                if (Intrinsics.m31980c(((IdConfig) obj2).getIdClassKey(), renderState.getSelectedIdClass())) {
                    obj = obj2;
                    break;
                }
            }
            obj = (IdConfig) obj;
        }
        String manualClassificationTitle = renderProps.getStrings().getManualClassificationTitle();
        String unableToClassifyDocumentTitle = renderProps.getStrings().getUnableToClassifyDocumentTitle();
        StepStyles.GovernmentIdStepStyle styles = renderProps.getStyles();
        List<IdConfigForCountry> listM16972L = renderState.m16972L();
        ArrayList arrayList2 = new ArrayList(C7701q.m31905u(listM16972L, 10));
        for (IdConfigForCountry idConfigForCountry2 : listM16972L) {
            arrayList2.add(new Screen.C3526a.CountryOption(idConfigForCountry2.getCountryCode(), idConfigForCountry2.getCountryName(), C7242z.m30208a(idConfigForCountry2.getCountryCode())));
        }
        String countryInputTitle = renderProps.getStrings().getCountryInputTitle();
        String selectedCountryCode = renderState.getSelectedCountryCode();
        String idClassInputTitle = renderProps.getStrings().getIdClassInputTitle();
        String selectedIdClass = renderState.getSelectedIdClass();
        String manualClassificationContinueButtonText = renderProps.getStrings().getManualClassificationContinueButtonText();
        boolean z10 = obj != null;
        final IdConfig idConfig2 = obj;
        NavigationState navigationStateM44528b = this.navigationStateManager.m44528b();
        EnumC6852d designVersion = renderProps.getDesignVersion();
        String autoClassificationPageNavBarTitle = renderProps.getStrings().getAutoClassificationPageNavBarTitle();
        if (autoClassificationPageNavBarTitle == null) {
            autoClassificationPageNavBarTitle = renderProps.getStrings().getCapturePageNavBarTitle();
        }
        return new Screen.C3526a(manualClassificationTitle, unableToClassifyDocumentTitle, styles, arrayList2, selectedCountryCode, arrayList, selectedIdClass, countryInputTitle, idClassInputTitle, manualClassificationContinueButtonText, z10, navigationStateM44528b, designVersion, new Function1() { // from class: ro.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                return C10960i.m41552p(workflowContext, (Option) obj3);
            }
        }, new Function1() { // from class: ro.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                return C10960i.m41553q(workflowContext, (Option) obj3);
            }
        }, new Function0() { // from class: ro.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C10960i.m41554r(idConfig2, renderState, workflowContext, renderProps, videoCaptureHelper);
            }
        }, new Function0() { // from class: ro.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C10960i.m41550n(workflowContext, renderProps, videoCaptureHelper, onOutput);
            }
        }, new Function0() { // from class: ro.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C10960i.m41551o(onOutput);
            }
        }, autoClassificationPageNavBarTitle, transition);
    }
}
