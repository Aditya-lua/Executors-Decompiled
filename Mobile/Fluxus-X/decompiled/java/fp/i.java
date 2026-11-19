package fp;

import com.github.luben.zstd.BuildConfig;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.collections.CollectionsKt;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.internal.Intrinsics;
import qr.Option;
import vo.IdConfig;
import vo.IdConfigForCountry;
import vo.d2;
import vo.y3;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JQ\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017JQ\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00182\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lfp/i;", BuildConfig.FLAVOR, "Lir/b;", "navigationStateManager", "<init>", "(Lir/b;)V", "Lvo/d2$a;", "renderProps", "Lvo/j0$a;", "renderState", "Lls/g;", "Lvo/j0;", "workflowContext", "Lip/l;", "videoCaptureHelper", "Lkotlin/Function1;", "Lvo/d2$b;", BuildConfig.FLAVOR, "onOutput", "Lkr/l;", "transition", "Lvo/y3$d;", "i", "(Lvo/d2$a;Lvo/j0$a;Lls/g;Lip/l;Lkotlin/jvm/functions/Function1;Lkr/l;)Lvo/y3$d;", "Lvo/j0$b;", "Lvo/y3;", "m", "(Lvo/d2$a;Lvo/j0$b;Lls/g;Lip/l;Lkotlin/jvm/functions/Function1;Lkr/l;)Lvo/y3;", "a", "Lir/b;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ir.b navigationStateManager;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16264a;

        static {
            int[] iArr = new int[vo.c.values().length];
            try {
                iArr[vo.c.IdTypeRejected.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[vo.c.UnableToClassify.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f16264a = iArr;
        }
    }

    public i(@NotNull ir.b navigationStateManager) {
        Intrinsics.checkNotNullParameter(navigationStateManager, "navigationStateManager");
        this.navigationStateManager = navigationStateManager;
    }

    public static final Unit j(ls.g gVar) {
        String countryCode;
        String str;
        ls.h hVarI = gVar.i();
        vo.j0.AutoClassificationError autoClassificationError = hVarI instanceof vo.j0.AutoClassificationError ? (vo.j0.AutoClassificationError) hVarI : null;
        if (autoClassificationError == null) {
            return Unit.f21506a;
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
        gVar.p(new vo.j0.AutoClassificationManualSelect(autoClassificationError.getCurrentPart(), autoClassificationError.D(), autoClassificationError.C(), autoClassificationError.getPartIndex(), ep.e.e(gVar, true), autoClassificationError.getCountryCode(), autoClassificationError.G(), new sn.v(null, null, null, 0, 0, 31, null), autoClassificationError.L(), countryCode, str));
        return Unit.f21506a;
    }

    public static final Unit k(ls.g gVar, d2.a aVar, ip.l lVar, Function1 function1) {
        ep.e.p(gVar, aVar, lVar, function1);
        return Unit.f21506a;
    }

    public static final Unit l(Function1 function1) {
        function1.invoke(d2.b.C0708b.f34600a);
        return Unit.f21506a;
    }

    public static final Unit n(ls.g gVar, d2.a aVar, ip.l lVar, Function1 function1) {
        ep.e.p(gVar, aVar, lVar, function1);
        return Unit.f21506a;
    }

    public static final Unit o(Function1 function1) {
        function1.invoke(d2.b.C0708b.f34600a);
        return Unit.f21506a;
    }

    public static final Unit p(ls.g gVar, Option it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ls.h hVarI = gVar.i();
        vo.j0.AutoClassificationManualSelect autoClassificationManualSelect = hVarI instanceof vo.j0.AutoClassificationManualSelect ? (vo.j0.AutoClassificationManualSelect) hVarI : null;
        if (autoClassificationManualSelect == null) {
            return Unit.f21506a;
        }
        gVar.p(vo.j0.AutoClassificationManualSelect.H(autoClassificationManualSelect, null, null, null, 0, null, null, null, null, null, it.getValue(), null, 1535, null));
        return Unit.f21506a;
    }

    public static final Unit q(ls.g gVar, Option it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ls.h hVarI = gVar.i();
        vo.j0.AutoClassificationManualSelect autoClassificationManualSelect = hVarI instanceof vo.j0.AutoClassificationManualSelect ? (vo.j0.AutoClassificationManualSelect) hVarI : null;
        if (autoClassificationManualSelect == null) {
            return Unit.f21506a;
        }
        gVar.p(vo.j0.AutoClassificationManualSelect.H(autoClassificationManualSelect, null, null, null, 0, null, null, null, null, null, null, it.getValue(), 1023, null));
        return Unit.f21506a;
    }

    public static final Unit r(IdConfig idConfig, vo.j0.AutoClassificationManualSelect autoClassificationManualSelect, ls.g gVar, d2.a aVar, ip.l lVar) {
        if (idConfig == null) {
            return Unit.f21506a;
        }
        ep.e.s(autoClassificationManualSelect, gVar, aVar, null, idConfig, lVar, autoClassificationManualSelect.getCameraProperties(), false, idConfig.f(), -1, null, autoClassificationManualSelect.getSelectedCountryCode(), 1152, null);
        return Unit.f21506a;
    }

    @NotNull
    public final y3.d i(@NotNull final d2.a renderProps, @NotNull vo.j0.AutoClassificationError renderState, @NotNull final ls.g<vo.j0> workflowContext, @NotNull final ip.l videoCaptureHelper, @NotNull final Function1<? super d2.b, Unit> onOutput, @NotNull kr.l transition) {
        String idClassRejectedTitle;
        String idClassRejectedContinueButtonText;
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(workflowContext, "workflowContext");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        Intrinsics.checkNotNullParameter(onOutput, "onOutput");
        Intrinsics.checkNotNullParameter(transition, "transition");
        vo.c errorType = renderState.getErrorType();
        int[] iArr = a.f16264a;
        int i10 = iArr[errorType.ordinal()];
        if (i10 == 1) {
            idClassRejectedTitle = renderProps.getStrings().getIdClassRejectedTitle();
        } else {
            if (i10 != 2) {
                throw new zt.l();
            }
            idClassRejectedTitle = renderProps.getStrings().getUnableToClassifyDocumentTitle();
        }
        int i11 = iArr[renderState.getErrorType().ordinal()];
        if (i11 == 1) {
            idClassRejectedContinueButtonText = renderProps.getStrings().getIdClassRejectedContinueButtonText();
        } else {
            if (i11 != 2) {
                throw new zt.l();
            }
            idClassRejectedContinueButtonText = renderProps.getStrings().getUnableToClassifyDocumentContinueButtonText();
        }
        String str = idClassRejectedContinueButtonText;
        StepStyles.GovernmentIdStepStyle styles = renderProps.getStyles();
        ir.a aVarB = this.navigationStateManager.b();
        Function0 function0 = new Function0() { // from class: fp.f
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return i.j(workflowContext);
            }
        };
        Function0 function1 = new Function0() { // from class: fp.g
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return i.k(workflowContext, renderProps, videoCaptureHelper, onOutput);
            }
        };
        Function0 function2 = new Function0() { // from class: fp.h
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return i.l(onOutput);
            }
        };
        boolean zC = videoCaptureHelper.c(renderProps);
        String autoClassificationPageNavBarTitle = renderProps.getStrings().getAutoClassificationPageNavBarTitle();
        if (autoClassificationPageNavBarTitle == null) {
            autoClassificationPageNavBarTitle = renderProps.getStrings().getCapturePageNavBarTitle();
        }
        return new y3.d(idClassRejectedTitle, str, styles, aVarB, function0, function1, function2, zC, autoClassificationPageNavBarTitle, transition);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final y3 m(@NotNull final d2.a renderProps, @NotNull final vo.j0.AutoClassificationManualSelect renderState, @NotNull final ls.g<vo.j0> workflowContext, @NotNull final ip.l videoCaptureHelper, @NotNull final Function1<? super d2.b, Unit> onOutput, @NotNull kr.l transition) {
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
            listK = p001kotlin.collections.p.k();
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
                listK = p001kotlin.collections.p.k();
            }
        }
        List<IdConfig> list = listK;
        ArrayList arrayList = new ArrayList(p001kotlin.collections.q.u(list, 10));
        for (IdConfig idConfig : list) {
            List<NextStep.GovernmentId.LocalizationOverride> listF0 = renderProps.getStrings().f0();
            if ((listF0 == null || (idClassKey = j.b(listF0, renderState.getSelectedCountryCode(), idConfig.getIdClassKey(), "selectPage")) == null) && (idClassKey = renderProps.getStrings().V().get(idConfig.getIdClassKey())) == null) {
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
        ArrayList arrayList2 = new ArrayList(p001kotlin.collections.q.u(listL, 10));
        for (IdConfigForCountry idConfigForCountry2 : listL) {
            arrayList2.add(new y3.a.CountryOption(idConfigForCountry2.getCountryCode(), idConfigForCountry2.getCountryName(), wo.a0.a(idConfigForCountry2.getCountryCode())));
        }
        String countryInputTitle = renderProps.getStrings().getCountryInputTitle();
        String selectedCountryCode = renderState.getSelectedCountryCode();
        String idClassInputTitle = renderProps.getStrings().getIdClassInputTitle();
        String selectedIdClass = renderState.getSelectedIdClass();
        String manualClassificationContinueButtonText = renderProps.getStrings().getManualClassificationContinueButtonText();
        boolean z10 = obj != null;
        final IdConfig idConfig2 = obj;
        ir.a aVarB = this.navigationStateManager.b();
        vo.i designVersion = renderProps.getDesignVersion();
        String autoClassificationPageNavBarTitle = renderProps.getStrings().getAutoClassificationPageNavBarTitle();
        if (autoClassificationPageNavBarTitle == null) {
            autoClassificationPageNavBarTitle = renderProps.getStrings().getCapturePageNavBarTitle();
        }
        return new y3.a(manualClassificationTitle, unableToClassifyDocumentTitle, styles, arrayList2, selectedCountryCode, arrayList, selectedIdClass, countryInputTitle, idClassInputTitle, manualClassificationContinueButtonText, z10, aVarB, designVersion, new Function1() { // from class: fp.a
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                return i.p(workflowContext, (Option) obj3);
            }
        }, new Function1() { // from class: fp.b
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                return i.q(workflowContext, (Option) obj3);
            }
        }, new Function0() { // from class: fp.c
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return i.r(idConfig2, renderState, workflowContext, renderProps, videoCaptureHelper);
            }
        }, new Function0() { // from class: fp.d
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return i.n(workflowContext, renderProps, videoCaptureHelper, onOutput);
            }
        }, new Function0() { // from class: fp.e
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return i.o(onOutput);
            }
        }, autoClassificationPageNavBarTitle, transition);
    }
}
