package vo;

import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker;
import com.withpersona.sdk2.inquiry.network.core.ErrorResponse;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.GovIdCaptureButtonType;
import com.withpersona.sdk2.inquiry.tracking.model.GovernmentIdButtonEventData;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.collections.CollectionsKt;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aU\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022&\u0010\n\u001a\"0\u0004R\u001a\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0006j\u0002`\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011\u001aU\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022&\u0010\n\u001a\"0\u0004R\u001a\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0006j\u0002`\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015\u001a=\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0016\u001a\u00020\u00022\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lvo/d2$a;", "renderProps", "Lvo/j0$j;", "renderState", "Lln/k$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/RenderContext;", "Lln/k;", "Lvo/j0;", "Lvo/d2$b;", BuildConfig.FLAVOR, "context", "Lip/l;", "videoCaptureHelper", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", BuildConfig.FLAVOR, "h", "(Lvo/d2$a;Lvo/j0$j;Lln/k$a;Lip/l;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;", "autoClassifyWorkerFactory", "j", "(Lvo/d2$a;Lvo/j0$j;Lln/k$a;Lip/l;Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;)V", "state", BuildConfig.FLAVOR, "Lvo/m;", "captureFrames", "Lvo/f3;", "idConfigsForCountry", "backState", "Lvo/j0$b;", "g", "(Lvo/j0$j;Ljava/util/List;Ljava/util/List;Lvo/j0;)Lvo/j0$b;", "government-id_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class x3 {
    public static final j0.AutoClassificationManualSelect g(j0.j jVar, List<Frame> list, List<IdConfigForCountry> list2, j0 j0Var) {
        String countryCode;
        String str;
        if (list2.size() == 1) {
            IdConfigForCountry idConfigForCountry = (IdConfigForCountry) CollectionsKt.d0(list2);
            String idClassKey = idConfigForCountry.g().size() == 1 ? ((IdConfig) CollectionsKt.d0(idConfigForCountry.g())).getIdClassKey() : null;
            countryCode = idConfigForCountry.getCountryCode();
            str = idClassKey;
        } else {
            countryCode = null;
            str = null;
        }
        return new j0.AutoClassificationManualSelect(jVar.getCurrentPart(), jVar.D(), jVar.C(), jVar.getPartIndex(), j0Var, jVar.getCountryCode(), list, new sn.v(null, null, null, 0, 0, 31, null), list2, countryCode, str);
    }

    public static final void h(@NotNull d2.a renderProps, @NotNull j0.j renderState, @NotNull ln.k<? super d2.a, j0, ? extends d2.b, ? extends Object>.a context, @NotNull ip.l videoCaptureHelper, @NotNull TrackingEventsLogger trackingEventsLogger) {
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        Intrinsics.checkNotNullParameter(trackingEventsLogger, "trackingEventsLogger");
        TrackingEventsLogger.logGovernmentIdButtonClickEvent$default(trackingEventsLogger, new GovernmentIdButtonEventData(GovIdCaptureButtonType.CONTINUE, null, 2, null), false, 2, null);
        f captureConfig = renderState.getCaptureConfig();
        if (captureConfig instanceof f.AutoClassifyConfig) {
            context.d().a(ln.b0.c(null, new Function1() { // from class: vo.r3
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return x3.i((ln.r.c) obj);
                }
            }, 1, null));
        } else {
            if (!(captureConfig instanceof f.IdCaptureConfig)) {
                throw new zt.l();
            }
            b3.W(renderState, context, renderProps, renderState.getIdForReview(), ((f.IdCaptureConfig) captureConfig).getId(), videoCaptureHelper, renderState.getCameraProperties(), (3584 & Barcode.FORMAT_ITF) != 0, (3584 & Barcode.FORMAT_QR_CODE) != 0 ? renderState.C() : null, (3584 & Barcode.FORMAT_UPC_A) != 0 ? renderState.getPartIndex() : 0, (3584 & Barcode.FORMAT_UPC_E) != 0 ? null : null, (3584 & Barcode.FORMAT_PDF417) != 0 ? renderState.getCountryCode() : null);
        }
    }

    public static final Unit i(ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objC = action.c();
        j0.j jVar = objC instanceof j0.j ? (j0.j) objC : null;
        if (jVar == null) {
            return Unit.f21506a;
        }
        action.e(jVar.L(true));
        return Unit.f21506a;
    }

    public static final void j(@NotNull final d2.a renderProps, @NotNull final j0.j renderState, @NotNull final ln.k<? super d2.a, j0, ? extends d2.b, ? extends Object>.a context, @NotNull final ip.l videoCaptureHelper, @NotNull AutoClassifyWorker.b autoClassifyWorkerFactory) {
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        Intrinsics.checkNotNullParameter(autoClassifyWorkerFactory, "autoClassifyWorkerFactory");
        ln.w.l(context, autoClassifyWorkerFactory.a(renderProps.getSessionToken(), renderProps.getInquiryId(), renderProps.getFromStep(), renderProps.getFromComponent(), renderState.getIdForReview(), new AutoClassifyWorker.SupplementaryData(), renderProps.getManualCaptureButtonDelayMs(), renderProps.getAutoClassificationConfig().getExtractTextFromImage()), p001kotlin.jvm.internal.d0.k(AutoClassifyWorker.class), BuildConfig.FLAVOR, new Function1() { // from class: vo.s3
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return x3.k(context, videoCaptureHelper, renderProps, renderState, (AutoClassifyWorker.c) obj);
            }
        });
    }

    public static final ln.r k(final ln.k.a aVar, final ip.l lVar, final d2.a aVar2, final j0.j jVar, final AutoClassifyWorker.c it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof AutoClassifyWorker.c.a) {
            return ln.b0.c(null, new Function1() { // from class: vo.t3
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return x3.l(it, aVar, lVar, (ln.r.c) obj);
                }
            }, 1, null);
        }
        if (!(it instanceof AutoClassifyWorker.c.b)) {
            throw new zt.l();
        }
        final AutoClassifyWorker.a autoClassificationResult = ((AutoClassifyWorker.c.b) it).getAutoClassificationResult();
        if (autoClassificationResult instanceof AutoClassifyWorker.a.C0175a) {
            return ln.b0.c(null, new Function1() { // from class: vo.u3
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return x3.m(aVar, aVar2, jVar, autoClassificationResult, lVar, (ln.r.c) obj);
                }
            }, 1, null);
        }
        if (autoClassificationResult instanceof AutoClassifyWorker.a.b) {
            return ln.b0.c(null, new Function1() { // from class: vo.v3
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return x3.n(aVar2, jVar, autoClassificationResult, (ln.r.c) obj);
                }
            }, 1, null);
        }
        if (autoClassificationResult instanceof AutoClassifyWorker.a.c) {
            return ln.b0.c(null, new Function1() { // from class: vo.w3
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return x3.o(aVar2, jVar, autoClassificationResult, (ln.r.c) obj);
                }
            }, 1, null);
        }
        throw new zt.l();
    }

    public static final Unit l(AutoClassifyWorker.c cVar, ln.k.a aVar, ip.l lVar, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        InternalErrorInfo cause = ((AutoClassifyWorker.c.a) cVar).getCause();
        j0 backState = ((j0) action.c()).getBackState();
        InternalErrorInfo.NetworkErrorInfo networkErrorInfo = cause instanceof InternalErrorInfo.NetworkErrorInfo ? (InternalErrorInfo.NetworkErrorInfo) cause : null;
        if (((networkErrorInfo != null ? networkErrorInfo.getResponseError() : null) instanceof ErrorResponse.Error.InconsistentTransitionError) || networkErrorInfo == null || networkErrorInfo.getCode() != 422 || backState == null) {
            b3.b0(aVar, new d2.b.c(cause), lVar);
        } else {
            action.e(backState);
        }
        return Unit.f21506a;
    }

    public static final Unit m(ln.k.a aVar, d2.a aVar2, j0.j jVar, AutoClassifyWorker.a aVar3, ip.l lVar, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objC = action.c();
        j0.j jVar2 = objC instanceof j0.j ? (j0.j) objC : null;
        if (jVar2 == null) {
            return Unit.f21506a;
        }
        action.e(jVar2.L(false));
        AutoClassifyWorker.a.C0175a c0175a = (AutoClassifyWorker.a.C0175a) aVar3;
        b3.W(jVar2, aVar, aVar2, jVar.getIdForReview(), c0175a.getIdConfig(), lVar, jVar.getCameraProperties(), (3584 & Barcode.FORMAT_ITF) != 0, (3584 & Barcode.FORMAT_QR_CODE) != 0 ? jVar2.C() : c0175a.getIdConfig().f(), (3584 & Barcode.FORMAT_UPC_A) != 0 ? jVar2.getPartIndex() : 0, (3584 & Barcode.FORMAT_UPC_E) != 0 ? null : null, (3584 & Barcode.FORMAT_PDF417) != 0 ? jVar2.getCountryCode() : null);
        return Unit.f21506a;
    }

    public static final Unit n(d2.a aVar, j0.j jVar, AutoClassifyWorker.a aVar2, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objC = action.c();
        j0.j jVar2 = objC instanceof j0.j ? (j0.j) objC : null;
        if (jVar2 == null) {
            return Unit.f21506a;
        }
        action.e(aVar.getDesignVersion() == i.K0000 ? g(jVar2, jVar.getIdForReview().j3(), ((AutoClassifyWorker.a.b) aVar2).a(), b3.x(action, false)) : new j0.AutoClassificationError(jVar2.getCurrentPart(), jVar2.D(), jVar2.C(), jVar2.getPartIndex(), b3.x(action, false), jVar2.getCountryCode(), jVar.getIdForReview().j3(), jVar.getCameraProperties(), ((AutoClassifyWorker.a.b) aVar2).a(), null, null, c.IdTypeRejected, 1536, null));
        return Unit.f21506a;
    }

    public static final Unit o(d2.a aVar, j0.j jVar, AutoClassifyWorker.a aVar2, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objC = action.c();
        j0.j jVar2 = objC instanceof j0.j ? (j0.j) objC : null;
        if (jVar2 == null) {
            return Unit.f21506a;
        }
        action.e(aVar.getDesignVersion() == i.K0000 ? g(jVar2, jVar.getIdForReview().j3(), ((AutoClassifyWorker.a.c) aVar2).a(), b3.x(action, false)) : new j0.AutoClassificationError(jVar2.getCurrentPart(), jVar2.D(), jVar2.C(), jVar2.getPartIndex(), b3.x(action, false), jVar2.getCountryCode(), jVar.getIdForReview().j3(), jVar.getCameraProperties(), ((AutoClassifyWorker.a.c) aVar2).a(), null, null, c.UnableToClassify, 1536, null));
        return Unit.f21506a;
    }
}
