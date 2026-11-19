package wo;

import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.vision.barcode.common.Barcode;
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
import vo.b3;
import vo.d2;
import vo.j0;
import vo.y3;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JM\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2&\u0010\u000f\u001a\"0\nR\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\fj\u0002`\u000b2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014JM\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00152&\u0010\u000f\u001a\"0\nR\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\fj\u0002`\u000b2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lwo/o;", BuildConfig.FLAVOR, "Lir/b;", "navigationStateManager", "<init>", "(Lir/b;)V", "Lvo/d2$a;", "renderProps", "Lvo/j0$a;", "renderState", "Lln/k$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/RenderContext;", "Lln/k;", "Lvo/j0;", "Lvo/d2$b;", "context", "Lip/l;", "videoCaptureHelper", "Lvo/y3$d;", "n", "(Lvo/d2$a;Lvo/j0$a;Lln/k$a;Lip/l;)Lvo/y3$d;", "Lvo/j0$b;", "Lvo/y3;", "t", "(Lvo/d2$a;Lvo/j0$b;Lln/k$a;Lip/l;)Lvo/y3;", "a", "Lir/b;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ir.b navigationStateManager;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f35942a;

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
            f35942a = iArr;
        }
    }

    public o(@NotNull ir.b navigationStateManager) {
        Intrinsics.checkNotNullParameter(navigationStateManager, "navigationStateManager");
        this.navigationStateManager = navigationStateManager;
    }

    public static final Unit A(ln.k.a aVar) {
        aVar.d().a(ln.b0.c(null, new Function1() { // from class: wo.d
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return o.B((ln.r.c) obj);
            }
        }, 1, null));
        return Unit.f21506a;
    }

    public static final Unit B(ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.d(d2.b.C0708b.f34600a);
        return Unit.f21506a;
    }

    public static final Unit o(ln.k.a aVar) {
        aVar.d().a(ln.b0.c(null, new Function1() { // from class: wo.m
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return o.p((ln.r.c) obj);
            }
        }, 1, null));
        return Unit.f21506a;
    }

    public static final Unit p(ln.r.c action) {
        String countryCode;
        String str;
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objC = action.c();
        j0.AutoClassificationError autoClassificationError = objC instanceof j0.AutoClassificationError ? (j0.AutoClassificationError) objC : null;
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
        action.e(new j0.AutoClassificationManualSelect(autoClassificationError.getCurrentPart(), autoClassificationError.D(), autoClassificationError.C(), autoClassificationError.getPartIndex(), b3.x(action, true), autoClassificationError.getCountryCode(), autoClassificationError.G(), new sn.v(null, null, null, 0, 0, 31, null), autoClassificationError.L(), countryCode, str));
        return Unit.f21506a;
    }

    public static final Unit q(ln.k.a aVar, ip.l lVar) {
        b3.S(aVar, lVar);
        return Unit.f21506a;
    }

    public static final Unit r(ln.k.a aVar) {
        aVar.d().a(ln.b0.c(null, new Function1() { // from class: wo.n
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return o.s((ln.r.c) obj);
            }
        }, 1, null));
        return Unit.f21506a;
    }

    public static final Unit s(ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.d(d2.b.C0708b.f34600a);
        return Unit.f21506a;
    }

    public static final Unit u(ln.k.a aVar, final Option it) {
        Intrinsics.checkNotNullParameter(it, "it");
        aVar.d().a(ln.b0.c(null, new Function1() { // from class: wo.e
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return o.v(it, (ln.r.c) obj);
            }
        }, 1, null));
        return Unit.f21506a;
    }

    public static final Unit v(Option option, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objC = action.c();
        j0.AutoClassificationManualSelect autoClassificationManualSelect = objC instanceof j0.AutoClassificationManualSelect ? (j0.AutoClassificationManualSelect) objC : null;
        if (autoClassificationManualSelect == null) {
            return Unit.f21506a;
        }
        action.e(j0.AutoClassificationManualSelect.H(autoClassificationManualSelect, null, null, null, 0, null, null, null, null, null, option.getValue(), null, 1535, null));
        return Unit.f21506a;
    }

    public static final Unit w(ln.k.a aVar, final Option it) {
        Intrinsics.checkNotNullParameter(it, "it");
        aVar.d().a(ln.b0.c(null, new Function1() { // from class: wo.c
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return o.x(it, (ln.r.c) obj);
            }
        }, 1, null));
        return Unit.f21506a;
    }

    public static final Unit x(Option option, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objC = action.c();
        j0.AutoClassificationManualSelect autoClassificationManualSelect = objC instanceof j0.AutoClassificationManualSelect ? (j0.AutoClassificationManualSelect) objC : null;
        if (autoClassificationManualSelect == null) {
            return Unit.f21506a;
        }
        action.e(j0.AutoClassificationManualSelect.H(autoClassificationManualSelect, null, null, null, 0, null, null, null, null, null, null, option.getValue(), 1023, null));
        return Unit.f21506a;
    }

    public static final Unit y(IdConfig idConfig, j0.AutoClassificationManualSelect autoClassificationManualSelect, ln.k.a aVar, d2.a aVar2, ip.l lVar) {
        if (idConfig == null) {
            return Unit.f21506a;
        }
        b3.W(autoClassificationManualSelect, aVar, aVar2, null, idConfig, lVar, autoClassificationManualSelect.getCameraProperties(), (3584 & Barcode.FORMAT_ITF) != 0, (3584 & Barcode.FORMAT_QR_CODE) != 0 ? autoClassificationManualSelect.C() : idConfig.f(), (3584 & Barcode.FORMAT_UPC_A) != 0 ? autoClassificationManualSelect.getPartIndex() : -1, (3584 & Barcode.FORMAT_UPC_E) != 0 ? null : null, (3584 & Barcode.FORMAT_PDF417) != 0 ? autoClassificationManualSelect.getCountryCode() : autoClassificationManualSelect.getSelectedCountryCode());
        return Unit.f21506a;
    }

    public static final Unit z(ln.k.a aVar, ip.l lVar) {
        b3.S(aVar, lVar);
        return Unit.f21506a;
    }

    @NotNull
    public final y3.d n(@NotNull d2.a renderProps, @NotNull j0.AutoClassificationError renderState, @NotNull final ln.k<? super d2.a, j0, ? extends d2.b, ? extends Object>.a context, @NotNull final ip.l videoCaptureHelper) {
        String idClassRejectedTitle;
        String idClassRejectedContinueButtonText;
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        vo.c errorType = renderState.getErrorType();
        int[] iArr = a.f35942a;
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
        Function0 function0 = new Function0() { // from class: wo.b
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return o.o(context);
            }
        };
        Function0 function1 = new Function0() { // from class: wo.f
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return o.q(context, videoCaptureHelper);
            }
        };
        Function0 function2 = new Function0() { // from class: wo.g
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return o.r(context);
            }
        };
        String autoClassificationPageNavBarTitle = renderProps.getStrings().getAutoClassificationPageNavBarTitle();
        if (autoClassificationPageNavBarTitle == null) {
            autoClassificationPageNavBarTitle = renderProps.getStrings().getCapturePageNavBarTitle();
        }
        return new y3.d(idClassRejectedTitle, str, styles, aVarB, function0, function1, function2, false, autoClassificationPageNavBarTitle, null, 640, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final y3 t(@NotNull final d2.a renderProps, @NotNull final j0.AutoClassificationManualSelect renderState, @NotNull final ln.k<? super d2.a, j0, ? extends d2.b, ? extends Object>.a context, @NotNull final ip.l videoCaptureHelper) {
        Object next;
        List<IdConfig> listK;
        String idClassKey;
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
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
            if ((listF0 == null || (idClassKey = p.b(listF0, renderState.getSelectedCountryCode(), idConfig.getIdClassKey(), "selectPage")) == null) && (idClassKey = renderProps.getStrings().V().get(idConfig.getIdClassKey())) == null) {
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
            arrayList2.add(new y3.a.CountryOption(idConfigForCountry2.getCountryCode(), idConfigForCountry2.getCountryName(), a0.a(idConfigForCountry2.getCountryCode())));
        }
        String selectedCountryCode = renderState.getSelectedCountryCode();
        String selectedIdClass = renderState.getSelectedIdClass();
        String countryInputTitle = renderProps.getStrings().getCountryInputTitle();
        String idClassInputTitle = renderProps.getStrings().getIdClassInputTitle();
        String manualClassificationContinueButtonText = renderProps.getStrings().getManualClassificationContinueButtonText();
        boolean z10 = obj != null;
        final IdConfig idConfig2 = obj;
        ir.a aVarB = this.navigationStateManager.b();
        vo.i designVersion = renderProps.getDesignVersion();
        Function1 function1 = new Function1() { // from class: wo.h
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                return o.u(context, (Option) obj3);
            }
        };
        Function1 function2 = new Function1() { // from class: wo.i
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                return o.w(context, (Option) obj3);
            }
        };
        Function0 function0 = new Function0() { // from class: wo.j
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return o.y(idConfig2, renderState, context, renderProps, videoCaptureHelper);
            }
        };
        Function0 function3 = new Function0() { // from class: wo.k
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return o.z(context, videoCaptureHelper);
            }
        };
        Function0 function4 = new Function0() { // from class: wo.l
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return o.A(context);
            }
        };
        String autoClassificationPageNavBarTitle = renderProps.getStrings().getAutoClassificationPageNavBarTitle();
        if (autoClassificationPageNavBarTitle == null) {
            autoClassificationPageNavBarTitle = renderProps.getStrings().getCapturePageNavBarTitle();
        }
        return new y3.a(manualClassificationTitle, unableToClassifyDocumentTitle, styles, arrayList2, selectedCountryCode, arrayList, selectedIdClass, countryInputTitle, idClassInputTitle, manualClassificationContinueButtonText, z10, aVarB, designVersion, function1, function2, function0, function3, function4, autoClassificationPageNavBarTitle, null, 524288, null);
    }
}
