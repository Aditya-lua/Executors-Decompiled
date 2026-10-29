package jo;

import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.governmentid.C3555n;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.IdConfigForCountry;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.Option;
import io.EnumC6844b;
import io.EnumC6852d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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
import p473uo.C11905l;
import p475uq.C11930a;
import p581ym.AbstractC13218k;
import p581ym.AbstractC13225r;
import p581ym.C13208b0;

/* JADX INFO: renamed from: jo.n */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JM\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2&\u0010\u000f\u001a\"0\nR\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\fj\u0002`\u000b2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014JM\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00152&\u0010\u000f\u001a\"0\nR\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\fj\u0002`\u000b2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m31665d2 = {"Ljo/n;", "", "Luq/a;", "navigationStateManager", "<init>", "(Luq/a;)V", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;", "renderProps", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationError;", "renderState", "Lym/k$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/RenderContext;", "Lym/k;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;", "context", "Luo/l;", "videoCaptureHelper", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$d;", "n", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationError;Lym/k$a;Luo/l;)Lcom/withpersona/sdk2/inquiry/governmentid/Screen$d;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationManualSelect;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen;", "t", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationManualSelect;Lym/k$a;Luo/l;)Lcom/withpersona/sdk2/inquiry/governmentid/Screen;", "a", "Luq/a;", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C7230n {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C11930a navigationStateManager;

    /* JADX INFO: renamed from: jo.n$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f27944a;

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
            f27944a = iArr;
        }
    }

    public C7230n(@NotNull C11930a navigationStateManager) {
        Intrinsics.checkNotNullParameter(navigationStateManager, "navigationStateManager");
        this.navigationStateManager = navigationStateManager;
    }

    /* JADX INFO: renamed from: A */
    public static final Unit m30153A(AbstractC13218k.a aVar) {
        aVar.mo48837d().mo17905a(C13208b0.m48847c(null, new Function1() { // from class: jo.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C7230n.m30154B((AbstractC13225r.c) obj);
            }
        }, 1, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: B */
    public static final Unit m30154B(AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48902d(GovernmentIdWorkflow.AbstractC3503a.b.f13791a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: o */
    public static final Unit m30168o(AbstractC13218k.a aVar) {
        aVar.mo48837d().mo17905a(C13208b0.m48847c(null, new Function1() { // from class: jo.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C7230n.m30169p((AbstractC13225r.c) obj);
            }
        }, 1, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m30169p(AbstractC13225r.c action) {
        String countryCode;
        String str;
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objM48901c = action.m48901c();
        GovernmentIdState.AutoClassificationError autoClassificationError = objM48901c instanceof GovernmentIdState.AutoClassificationError ? (GovernmentIdState.AutoClassificationError) objM48901c : null;
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
        action.m48903e(new GovernmentIdState.AutoClassificationManualSelect(autoClassificationError.getCurrentPart(), autoClassificationError.mo16956E(), autoClassificationError.mo16955D(), autoClassificationError.getPartIndex(), C3555n.m17657x(action, true), autoClassificationError.getCountryCode(), autoClassificationError.m16963I(), new CameraProperties(null, null, null, 0, 0, 31, null), autoClassificationError.m16966L(), countryCode, str));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m30170q(AbstractC13218k.a aVar, C11905l c11905l) {
        C3555n.m17613S(aVar, c11905l);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: r */
    public static final Unit m30171r(AbstractC13218k.a aVar) {
        aVar.mo48837d().mo17905a(C13208b0.m48847c(null, new Function1() { // from class: jo.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C7230n.m30172s((AbstractC13225r.c) obj);
            }
        }, 1, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: s */
    public static final Unit m30172s(AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48902d(GovernmentIdWorkflow.AbstractC3503a.b.f13791a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: u */
    public static final Unit m30173u(AbstractC13218k.a aVar, final Option it) {
        Intrinsics.checkNotNullParameter(it, "it");
        aVar.mo48837d().mo17905a(C13208b0.m48847c(null, new Function1() { // from class: jo.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C7230n.m30174v(it, (AbstractC13225r.c) obj);
            }
        }, 1, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: v */
    public static final Unit m30174v(Option option, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objM48901c = action.m48901c();
        GovernmentIdState.AutoClassificationManualSelect autoClassificationManualSelect = objM48901c instanceof GovernmentIdState.AutoClassificationManualSelect ? (GovernmentIdState.AutoClassificationManualSelect) objM48901c : null;
        if (autoClassificationManualSelect == null) {
            return Unit.f29331a;
        }
        action.m48903e(GovernmentIdState.AutoClassificationManualSelect.m16969J(autoClassificationManualSelect, null, null, null, 0, null, null, null, null, null, option.getValue(), null, 1535, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: w */
    public static final Unit m30175w(AbstractC13218k.a aVar, final Option it) {
        Intrinsics.checkNotNullParameter(it, "it");
        aVar.mo48837d().mo17905a(C13208b0.m48847c(null, new Function1() { // from class: jo.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C7230n.m30176x(it, (AbstractC13225r.c) obj);
            }
        }, 1, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: x */
    public static final Unit m30176x(Option option, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objM48901c = action.m48901c();
        GovernmentIdState.AutoClassificationManualSelect autoClassificationManualSelect = objM48901c instanceof GovernmentIdState.AutoClassificationManualSelect ? (GovernmentIdState.AutoClassificationManualSelect) objM48901c : null;
        if (autoClassificationManualSelect == null) {
            return Unit.f29331a;
        }
        action.m48903e(GovernmentIdState.AutoClassificationManualSelect.m16969J(autoClassificationManualSelect, null, null, null, 0, null, null, null, null, null, null, option.getValue(), 1023, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: y */
    public static final Unit m30177y(IdConfig idConfig, GovernmentIdState.AutoClassificationManualSelect autoClassificationManualSelect, AbstractC13218k.a aVar, GovernmentIdWorkflow.Input input, C11905l c11905l) {
        if (idConfig == null) {
            return Unit.f29331a;
        }
        C3555n.m17617W(autoClassificationManualSelect, aVar, input, null, idConfig, c11905l, autoClassificationManualSelect.getCameraProperties(), (3584 & 128) != 0, (3584 & 256) != 0 ? autoClassificationManualSelect.mo16955D() : idConfig.m17272f(), (3584 & 512) != 0 ? autoClassificationManualSelect.getPartIndex() : -1, (3584 & 1024) != 0 ? null : null, (3584 & 2048) != 0 ? autoClassificationManualSelect.getCountryCode() : autoClassificationManualSelect.getSelectedCountryCode());
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: z */
    public static final Unit m30178z(AbstractC13218k.a aVar, C11905l c11905l) {
        C3555n.m17613S(aVar, c11905l);
        return Unit.f29331a;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final Screen.C3529d m30179n(@NotNull GovernmentIdWorkflow.Input renderProps, @NotNull GovernmentIdState.AutoClassificationError renderState, @NotNull final AbstractC13218k<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.AbstractC3503a, ? extends Object>.a context, @NotNull final C11905l videoCaptureHelper) {
        String idClassRejectedTitle;
        String idClassRejectedContinueButtonText;
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        EnumC6844b errorType = renderState.getErrorType();
        int[] iArr = a.f27944a;
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
        Function0 function0 = new Function0() { // from class: jo.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C7230n.m30168o(context);
            }
        };
        Function0 function1 = new Function0() { // from class: jo.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C7230n.m30170q(context, videoCaptureHelper);
            }
        };
        Function0 function2 = new Function0() { // from class: jo.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C7230n.m30171r(context);
            }
        };
        String autoClassificationPageNavBarTitle = renderProps.getStrings().getAutoClassificationPageNavBarTitle();
        if (autoClassificationPageNavBarTitle == null) {
            autoClassificationPageNavBarTitle = renderProps.getStrings().getCapturePageNavBarTitle();
        }
        return new Screen.C3529d(idClassRejectedTitle, str, styles, navigationStateM44528b, function0, function1, function2, false, autoClassificationPageNavBarTitle, null, 640, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r17v0, resolved type: com.withpersona.sdk2.inquiry.governmentid.IdConfig */
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* JADX INFO: renamed from: t */
    public final Screen m30180t(@NotNull final GovernmentIdWorkflow.Input renderProps, @NotNull final GovernmentIdState.AutoClassificationManualSelect renderState, @NotNull final AbstractC13218k<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.AbstractC3503a, ? extends Object>.a context, @NotNull final C11905l videoCaptureHelper) {
        Object next;
        List<IdConfig> listM31892k;
        String idClassKey;
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
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
            if ((listM17231h0 == null || (idClassKey = C7231o.m30182b(listM17231h0, renderState.getSelectedCountryCode(), idConfig.getIdClassKey(), "selectPage")) == null) && (idClassKey = renderProps.getStrings().m17220V().get(idConfig.getIdClassKey())) == null) {
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
        String selectedCountryCode = renderState.getSelectedCountryCode();
        String selectedIdClass = renderState.getSelectedIdClass();
        String countryInputTitle = renderProps.getStrings().getCountryInputTitle();
        String idClassInputTitle = renderProps.getStrings().getIdClassInputTitle();
        String manualClassificationContinueButtonText = renderProps.getStrings().getManualClassificationContinueButtonText();
        boolean z10 = obj != null;
        final IdConfig idConfig2 = obj;
        NavigationState navigationStateM44528b = this.navigationStateManager.m44528b();
        EnumC6852d designVersion = renderProps.getDesignVersion();
        Function1 function1 = new Function1() { // from class: jo.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                return C7230n.m30173u(context, (Option) obj3);
            }
        };
        Function1 function2 = new Function1() { // from class: jo.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                return C7230n.m30175w(context, (Option) obj3);
            }
        };
        Function0 function0 = new Function0() { // from class: jo.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C7230n.m30177y(idConfig2, renderState, context, renderProps, videoCaptureHelper);
            }
        };
        Function0 function3 = new Function0() { // from class: jo.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C7230n.m30178z(context, videoCaptureHelper);
            }
        };
        Function0 function4 = new Function0() { // from class: jo.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C7230n.m30153A(context);
            }
        };
        String autoClassificationPageNavBarTitle = renderProps.getStrings().getAutoClassificationPageNavBarTitle();
        if (autoClassificationPageNavBarTitle == null) {
            autoClassificationPageNavBarTitle = renderProps.getStrings().getCapturePageNavBarTitle();
        }
        return new Screen.C3526a(manualClassificationTitle, unableToClassifyDocumentTitle, styles, arrayList2, selectedCountryCode, arrayList, selectedIdClass, countryInputTitle, idClassInputTitle, manualClassificationContinueButtonText, z10, navigationStateM44528b, designVersion, function1, function2, function0, function3, function4, autoClassificationPageNavBarTitle, null, 524288, null);
    }
}
