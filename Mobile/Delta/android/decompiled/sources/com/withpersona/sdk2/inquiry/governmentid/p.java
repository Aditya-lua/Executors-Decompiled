package com.withpersona.sdk2.inquiry.governmentid;

import com.google.mlkit.vision.barcode.common.Barcode;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker;
import com.withpersona.sdk2.inquiry.network.core.ErrorResponse;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.GovIdCaptureButtonType;
import com.withpersona.sdk2.inquiry.tracking.model.GovernmentIdButtonEventData;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import org.jetbrains.annotations.NotNull;
import wm.b0;
import wm.r;
import wm.w;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aU\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022&\u0010\n\u001a\"0\u0004R\u001a\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0006j\u0002`\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011\u001aU\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022&\u0010\n\u001a\"0\u0004R\u001a\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0006j\u0002`\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015\u001a=\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0016\u001a\u00020\u00022\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;", "renderProps", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;", "renderState", "Lwm/k$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/RenderContext;", "Lwm/k;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;", "", "context", "Lso/l;", "videoCaptureHelper", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "", "h", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;Lwm/k$a;Lso/l;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;", "autoClassifyWorkerFactory", "j", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;Lwm/k$a;Lso/l;Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;)V", "state", "", "Lcom/withpersona/sdk2/inquiry/governmentid/Frame;", "captureFrames", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfigForCountry;", "idConfigsForCountry", "backState", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationManualSelect;", "g", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;Ljava/util/List;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationManualSelect;", "government-id_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class p {
    public static final GovernmentIdState.AutoClassificationManualSelect g(GovernmentIdState.ReviewImageState reviewImageState, List<Frame> list, List<IdConfigForCountry> list2, GovernmentIdState governmentIdState) {
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
        return new GovernmentIdState.AutoClassificationManualSelect(reviewImageState.getCurrentPart(), reviewImageState.E(), reviewImageState.D(), reviewImageState.getPartIndex(), governmentIdState, reviewImageState.getCountryCode(), list, new CameraProperties(null, null, null, 0, 0, 31, null), list2, countryCode, str);
    }

    public static final void h(@NotNull GovernmentIdWorkflow.Input renderProps, @NotNull GovernmentIdState.ReviewImageState renderState, @NotNull wm.k<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.a, ? extends Object>.a context, @NotNull so.l videoCaptureHelper, @NotNull TrackingEventsLogger trackingEventsLogger) {
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        Intrinsics.checkNotNullParameter(trackingEventsLogger, "trackingEventsLogger");
        TrackingEventsLogger.logGovernmentIdButtonClickEvent$default(trackingEventsLogger, new GovernmentIdButtonEventData(GovIdCaptureButtonType.CONTINUE, null, 2, null), false, 2, null);
        CaptureConfig captureConfig = renderState.getCaptureConfig();
        if (captureConfig instanceof CaptureConfig.AutoClassifyConfig) {
            context.d().a(b0.c(null, new Function1() { // from class: go.r2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.governmentid.p.i((wm.r.c) obj);
                }
            }, 1, null));
        } else {
            if (!(captureConfig instanceof CaptureConfig.IdCaptureConfig)) {
                throw new gt.l();
            }
            n.W(renderState, context, renderProps, renderState.getIdForReview(), ((CaptureConfig.IdCaptureConfig) captureConfig).getId(), videoCaptureHelper, renderState.getCameraProperties(), (3584 & 128) != 0, (3584 & Barcode.FORMAT_QR_CODE) != 0 ? renderState.D() : null, (3584 & Barcode.FORMAT_UPC_A) != 0 ? renderState.getPartIndex() : 0, (3584 & Barcode.FORMAT_UPC_E) != 0 ? null : null, (3584 & Barcode.FORMAT_PDF417) != 0 ? renderState.getCountryCode() : null);
        }
    }

    public static final Unit i(r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objC = action.c();
        GovernmentIdState.ReviewImageState reviewImageState = objC instanceof GovernmentIdState.ReviewImageState ? (GovernmentIdState.ReviewImageState) objC : null;
        if (reviewImageState == null) {
            return Unit.f22938a;
        }
        action.e(reviewImageState.L(true));
        return Unit.f22938a;
    }

    public static final void j(@NotNull final GovernmentIdWorkflow.Input renderProps, @NotNull final GovernmentIdState.ReviewImageState renderState, @NotNull final wm.k<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.a, ? extends Object>.a context, @NotNull final so.l videoCaptureHelper, @NotNull AutoClassifyWorker.b autoClassifyWorkerFactory) {
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        Intrinsics.checkNotNullParameter(autoClassifyWorkerFactory, "autoClassifyWorkerFactory");
        w.l(context, autoClassifyWorkerFactory.a(renderProps.getSessionToken(), renderProps.getInquiryId(), renderProps.getFromStep(), renderProps.getFromComponent(), renderState.getIdForReview(), new AutoClassifyWorker.SupplementaryData(), renderProps.getManualCaptureButtonDelayMs(), renderProps.getAutoClassificationConfig().getExtractTextFromImage()), d0.k(AutoClassifyWorker.class), "", new Function1() { // from class: go.s2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.withpersona.sdk2.inquiry.governmentid.p.k(context, videoCaptureHelper, renderProps, renderState, (AutoClassifyWorker.c) obj);
            }
        });
    }

    public static final r k(final wm.k.a aVar, final so.l lVar, final GovernmentIdWorkflow.Input input, final GovernmentIdState.ReviewImageState reviewImageState, final AutoClassifyWorker.c it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof AutoClassifyWorker.c.a) {
            return b0.c(null, new Function1() { // from class: go.t2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.governmentid.p.l(it, aVar, lVar, (wm.r.c) obj);
                }
            }, 1, null);
        }
        if (!(it instanceof AutoClassifyWorker.c.b)) {
            throw new gt.l();
        }
        final AutoClassifyWorker.a autoClassificationResult = ((AutoClassifyWorker.c.b) it).getAutoClassificationResult();
        if (autoClassificationResult instanceof AutoClassifyWorker.a.C0203a) {
            return b0.c(null, new Function1() { // from class: go.u2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.governmentid.p.m(aVar, input, reviewImageState, autoClassificationResult, lVar, (wm.r.c) obj);
                }
            }, 1, null);
        }
        if (autoClassificationResult instanceof AutoClassifyWorker.a.b) {
            return b0.c(null, new Function1() { // from class: go.v2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.governmentid.p.n(input, reviewImageState, autoClassificationResult, (wm.r.c) obj);
                }
            }, 1, null);
        }
        if (autoClassificationResult instanceof AutoClassifyWorker.a.c) {
            return b0.c(null, new Function1() { // from class: go.w2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.governmentid.p.o(input, reviewImageState, autoClassificationResult, (wm.r.c) obj);
                }
            }, 1, null);
        }
        throw new gt.l();
    }

    public static final Unit l(AutoClassifyWorker.c cVar, wm.k.a aVar, so.l lVar, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        InternalErrorInfo cause = ((AutoClassifyWorker.c.a) cVar).getCause();
        GovernmentIdState backState = ((GovernmentIdState) action.c()).getBackState();
        InternalErrorInfo.NetworkErrorInfo networkErrorInfo = cause instanceof InternalErrorInfo.NetworkErrorInfo ? (InternalErrorInfo.NetworkErrorInfo) cause : null;
        if (((networkErrorInfo != null ? networkErrorInfo.getResponseError() : null) instanceof ErrorResponse.Error.InconsistentTransitionError) || networkErrorInfo == null || networkErrorInfo.getCode() != 422 || backState == null) {
            n.b0(aVar, new GovernmentIdWorkflow.a.c(cause), lVar);
        } else {
            action.e(backState);
        }
        return Unit.f22938a;
    }

    public static final Unit m(wm.k.a aVar, GovernmentIdWorkflow.Input input, GovernmentIdState.ReviewImageState reviewImageState, AutoClassifyWorker.a aVar2, so.l lVar, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objC = action.c();
        GovernmentIdState.ReviewImageState reviewImageState2 = objC instanceof GovernmentIdState.ReviewImageState ? (GovernmentIdState.ReviewImageState) objC : null;
        if (reviewImageState2 == null) {
            return Unit.f22938a;
        }
        action.e(reviewImageState2.L(false));
        AutoClassifyWorker.a.C0203a c0203a = (AutoClassifyWorker.a.C0203a) aVar2;
        n.W(reviewImageState2, aVar, input, reviewImageState.getIdForReview(), c0203a.getIdConfig(), lVar, reviewImageState.getCameraProperties(), (3584 & 128) != 0, (3584 & Barcode.FORMAT_QR_CODE) != 0 ? reviewImageState2.D() : c0203a.getIdConfig().f(), (3584 & Barcode.FORMAT_UPC_A) != 0 ? reviewImageState2.getPartIndex() : 0, (3584 & Barcode.FORMAT_UPC_E) != 0 ? null : null, (3584 & Barcode.FORMAT_PDF417) != 0 ? reviewImageState2.getCountryCode() : null);
        return Unit.f22938a;
    }

    public static final Unit n(GovernmentIdWorkflow.Input input, GovernmentIdState.ReviewImageState reviewImageState, AutoClassifyWorker.a aVar, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objC = action.c();
        GovernmentIdState.ReviewImageState reviewImageState2 = objC instanceof GovernmentIdState.ReviewImageState ? (GovernmentIdState.ReviewImageState) objC : null;
        if (reviewImageState2 == null) {
            return Unit.f22938a;
        }
        action.e(input.getDesignVersion() == go.d.K0000 ? g(reviewImageState2, reviewImageState.getIdForReview().f3(), ((AutoClassifyWorker.a.b) aVar).a(), n.x(action, false)) : new GovernmentIdState.AutoClassificationError(reviewImageState2.getCurrentPart(), reviewImageState2.E(), reviewImageState2.D(), reviewImageState2.getPartIndex(), n.x(action, false), reviewImageState2.getCountryCode(), reviewImageState.getIdForReview().f3(), reviewImageState.getCameraProperties(), ((AutoClassifyWorker.a.b) aVar).a(), null, null, go.b.IdTypeRejected, 1536, null));
        return Unit.f22938a;
    }

    public static final Unit o(GovernmentIdWorkflow.Input input, GovernmentIdState.ReviewImageState reviewImageState, AutoClassifyWorker.a aVar, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objC = action.c();
        GovernmentIdState.ReviewImageState reviewImageState2 = objC instanceof GovernmentIdState.ReviewImageState ? (GovernmentIdState.ReviewImageState) objC : null;
        if (reviewImageState2 == null) {
            return Unit.f22938a;
        }
        action.e(input.getDesignVersion() == go.d.K0000 ? g(reviewImageState2, reviewImageState.getIdForReview().f3(), ((AutoClassifyWorker.a.c) aVar).a(), n.x(action, false)) : new GovernmentIdState.AutoClassificationError(reviewImageState2.getCurrentPart(), reviewImageState2.E(), reviewImageState2.D(), reviewImageState2.getPartIndex(), n.x(action, false), reviewImageState2.getCountryCode(), reviewImageState.getIdForReview().f3(), reviewImageState.getCameraProperties(), ((AutoClassifyWorker.a.c) aVar).a(), null, null, go.b.UnableToClassify, 1536, null));
        return Unit.f22938a;
    }
}
