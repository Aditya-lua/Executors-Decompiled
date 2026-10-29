package com.withpersona.sdk2.inquiry.governmentid;

import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.governmentid.C3572p;
import com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker;
import com.withpersona.sdk2.inquiry.network.core.ErrorResponse;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.GovIdCaptureButtonType;
import com.withpersona.sdk2.inquiry.tracking.model.GovernmentIdButtonEventData;
import io.EnumC6844b;
import io.EnumC6852d;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7731d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p229jt.C7345l;
import p473uo.C11905l;
import p581ym.AbstractC13218k;
import p581ym.AbstractC13225r;
import p581ym.C13208b0;
import p581ym.C13230w;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.p */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aU\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022&\u0010\n\u001a\"0\u0004R\u001a\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0006j\u0002`\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011\u001aU\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022&\u0010\n\u001a\"0\u0004R\u001a\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0006j\u0002`\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015\u001a=\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0016\u001a\u00020\u00022\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;", "renderProps", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;", "renderState", "Lym/k$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/RenderContext;", "Lym/k;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;", "", "context", "Luo/l;", "videoCaptureHelper", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "", "h", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;Lym/k$a;Luo/l;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;", "autoClassifyWorkerFactory", "j", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;Lym/k$a;Luo/l;Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;)V", "state", "", "Lcom/withpersona/sdk2/inquiry/governmentid/Frame;", "captureFrames", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfigForCountry;", "idConfigsForCountry", "backState", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationManualSelect;", "g", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;Ljava/util/List;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationManualSelect;", "government-id_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C3572p {
    /* JADX INFO: renamed from: g */
    public static final GovernmentIdState.AutoClassificationManualSelect m17737g(GovernmentIdState.ReviewImageState reviewImageState, List<Frame> list, List<IdConfigForCountry> list2, GovernmentIdState governmentIdState) {
        String countryCode;
        String str;
        if (list2.size() == 1) {
            IdConfigForCountry idConfigForCountry = (IdConfigForCountry) CollectionsKt.m31706d0(list2);
            String idClassKey = idConfigForCountry.m17301g().size() == 1 ? ((IdConfig) CollectionsKt.m31706d0(idConfigForCountry.m17301g())).getIdClassKey() : null;
            countryCode = idConfigForCountry.getCountryCode();
            str = idClassKey;
        } else {
            countryCode = null;
            str = null;
        }
        return new GovernmentIdState.AutoClassificationManualSelect(reviewImageState.getCurrentPart(), reviewImageState.mo16956E(), reviewImageState.mo16955D(), reviewImageState.getPartIndex(), governmentIdState, reviewImageState.getCountryCode(), list, new CameraProperties(null, null, null, 0, 0, 31, null), list2, countryCode, str);
    }

    /* JADX INFO: renamed from: h */
    public static final void m17738h(@NotNull GovernmentIdWorkflow.Input renderProps, @NotNull GovernmentIdState.ReviewImageState renderState, @NotNull AbstractC13218k<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.AbstractC3503a, ? extends Object>.a context, @NotNull C11905l videoCaptureHelper, @NotNull TrackingEventsLogger trackingEventsLogger) {
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        Intrinsics.checkNotNullParameter(trackingEventsLogger, "trackingEventsLogger");
        TrackingEventsLogger.logGovernmentIdButtonClickEvent$default(trackingEventsLogger, new GovernmentIdButtonEventData(GovIdCaptureButtonType.CONTINUE, null, 2, null), false, 2, null);
        CaptureConfig captureConfig = renderState.getCaptureConfig();
        if (captureConfig instanceof CaptureConfig.AutoClassifyConfig) {
            context.mo48837d().mo17905a(C13208b0.m48847c(null, new Function1() { // from class: io.r2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C3572p.m17739i((AbstractC13225r.c) obj);
                }
            }, 1, null));
        } else {
            if (!(captureConfig instanceof CaptureConfig.IdCaptureConfig)) {
                throw new C7345l();
            }
            C3555n.m17617W(renderState, context, renderProps, renderState.getIdForReview(), ((CaptureConfig.IdCaptureConfig) captureConfig).getId(), videoCaptureHelper, renderState.getCameraProperties(), (3584 & 128) != 0, (3584 & 256) != 0 ? renderState.mo16955D() : null, (3584 & 512) != 0 ? renderState.getPartIndex() : 0, (3584 & 1024) != 0 ? null : null, (3584 & 2048) != 0 ? renderState.getCountryCode() : null);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m17739i(AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objM48901c = action.m48901c();
        GovernmentIdState.ReviewImageState reviewImageState = objM48901c instanceof GovernmentIdState.ReviewImageState ? (GovernmentIdState.ReviewImageState) objM48901c : null;
        if (reviewImageState == null) {
            return Unit.f29331a;
        }
        action.m48903e(reviewImageState.mo17021L(true));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: j */
    public static final void m17740j(@NotNull final GovernmentIdWorkflow.Input renderProps, @NotNull final GovernmentIdState.ReviewImageState renderState, @NotNull final AbstractC13218k<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.AbstractC3503a, ? extends Object>.a context, @NotNull final C11905l videoCaptureHelper, @NotNull AutoClassifyWorker.C3563b autoClassifyWorkerFactory) {
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        Intrinsics.checkNotNullParameter(autoClassifyWorkerFactory, "autoClassifyWorkerFactory");
        C13230w.m48937l(context, autoClassifyWorkerFactory.m17703a(renderProps.getSessionToken(), renderProps.getInquiryId(), renderProps.getFromStep(), renderProps.getFromComponent(), renderState.getIdForReview(), new AutoClassifyWorker.SupplementaryData(), renderProps.getManualCaptureButtonDelayMs(), renderProps.getAutoClassificationConfig().getExtractTextFromImage()), C7731d0.m32011k(AutoClassifyWorker.class), "", new Function1() { // from class: io.s2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C3572p.m17741k(context, videoCaptureHelper, renderProps, renderState, (AutoClassifyWorker.InterfaceC3564c) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public static final AbstractC13225r m17741k(final AbstractC13218k.a aVar, final C11905l c11905l, final GovernmentIdWorkflow.Input input, final GovernmentIdState.ReviewImageState reviewImageState, final AutoClassifyWorker.InterfaceC3564c it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof AutoClassifyWorker.InterfaceC3564c.a) {
            return C13208b0.m48847c(null, new Function1() { // from class: io.t2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C3572p.m17742l(it, aVar, c11905l, (AbstractC13225r.c) obj);
                }
            }, 1, null);
        }
        if (!(it instanceof AutoClassifyWorker.InterfaceC3564c.b)) {
            throw new C7345l();
        }
        final AutoClassifyWorker.InterfaceC3562a autoClassificationResult = ((AutoClassifyWorker.InterfaceC3564c.b) it).getAutoClassificationResult();
        if (autoClassificationResult instanceof AutoClassifyWorker.InterfaceC3562a.a) {
            return C13208b0.m48847c(null, new Function1() { // from class: io.u2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C3572p.m17743m(aVar, input, reviewImageState, autoClassificationResult, c11905l, (AbstractC13225r.c) obj);
                }
            }, 1, null);
        }
        if (autoClassificationResult instanceof AutoClassifyWorker.InterfaceC3562a.b) {
            return C13208b0.m48847c(null, new Function1() { // from class: io.v2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C3572p.m17744n(input, reviewImageState, autoClassificationResult, (AbstractC13225r.c) obj);
                }
            }, 1, null);
        }
        if (autoClassificationResult instanceof AutoClassifyWorker.InterfaceC3562a.c) {
            return C13208b0.m48847c(null, new Function1() { // from class: io.w2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C3572p.m17745o(input, reviewImageState, autoClassificationResult, (AbstractC13225r.c) obj);
                }
            }, 1, null);
        }
        throw new C7345l();
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m17742l(AutoClassifyWorker.InterfaceC3564c interfaceC3564c, AbstractC13218k.a aVar, C11905l c11905l, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        InternalErrorInfo cause = ((AutoClassifyWorker.InterfaceC3564c.a) interfaceC3564c).getCause();
        GovernmentIdState backState = ((GovernmentIdState) action.m48901c()).getBackState();
        InternalErrorInfo.NetworkErrorInfo networkErrorInfo = cause instanceof InternalErrorInfo.NetworkErrorInfo ? (InternalErrorInfo.NetworkErrorInfo) cause : null;
        if (((networkErrorInfo != null ? networkErrorInfo.getResponseError() : null) instanceof ErrorResponse.Error.InconsistentTransitionError) || networkErrorInfo == null || networkErrorInfo.getCode() != 422 || backState == null) {
            C3555n.m17624b0(aVar, new GovernmentIdWorkflow.AbstractC3503a.c(cause), c11905l);
        } else {
            action.m48903e(backState);
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: m */
    public static final Unit m17743m(AbstractC13218k.a aVar, GovernmentIdWorkflow.Input input, GovernmentIdState.ReviewImageState reviewImageState, AutoClassifyWorker.InterfaceC3562a interfaceC3562a, C11905l c11905l, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objM48901c = action.m48901c();
        GovernmentIdState.ReviewImageState reviewImageState2 = objM48901c instanceof GovernmentIdState.ReviewImageState ? (GovernmentIdState.ReviewImageState) objM48901c : null;
        if (reviewImageState2 == null) {
            return Unit.f29331a;
        }
        action.m48903e(reviewImageState2.mo17021L(false));
        AutoClassifyWorker.InterfaceC3562a.a aVar2 = (AutoClassifyWorker.InterfaceC3562a.a) interfaceC3562a;
        C3555n.m17617W(reviewImageState2, aVar, input, reviewImageState.getIdForReview(), aVar2.getIdConfig(), c11905l, reviewImageState.getCameraProperties(), (3584 & 128) != 0, (3584 & 256) != 0 ? reviewImageState2.mo16955D() : aVar2.getIdConfig().m17272f(), (3584 & 512) != 0 ? reviewImageState2.getPartIndex() : 0, (3584 & 1024) != 0 ? null : null, (3584 & 2048) != 0 ? reviewImageState2.getCountryCode() : null);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m17744n(GovernmentIdWorkflow.Input input, GovernmentIdState.ReviewImageState reviewImageState, AutoClassifyWorker.InterfaceC3562a interfaceC3562a, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objM48901c = action.m48901c();
        GovernmentIdState.ReviewImageState reviewImageState2 = objM48901c instanceof GovernmentIdState.ReviewImageState ? (GovernmentIdState.ReviewImageState) objM48901c : null;
        if (reviewImageState2 == null) {
            return Unit.f29331a;
        }
        action.m48903e(input.getDesignVersion() == EnumC6852d.K0000 ? m17737g(reviewImageState2, reviewImageState.getIdForReview().mo16936d3(), ((AutoClassifyWorker.InterfaceC3562a.b) interfaceC3562a).m17701a(), C3555n.m17657x(action, false)) : new GovernmentIdState.AutoClassificationError(reviewImageState2.getCurrentPart(), reviewImageState2.mo16956E(), reviewImageState2.mo16955D(), reviewImageState2.getPartIndex(), C3555n.m17657x(action, false), reviewImageState2.getCountryCode(), reviewImageState.getIdForReview().mo16936d3(), reviewImageState.getCameraProperties(), ((AutoClassifyWorker.InterfaceC3562a.b) interfaceC3562a).m17701a(), null, null, EnumC6844b.IdTypeRejected, 1536, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: o */
    public static final Unit m17745o(GovernmentIdWorkflow.Input input, GovernmentIdState.ReviewImageState reviewImageState, AutoClassifyWorker.InterfaceC3562a interfaceC3562a, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objM48901c = action.m48901c();
        GovernmentIdState.ReviewImageState reviewImageState2 = objM48901c instanceof GovernmentIdState.ReviewImageState ? (GovernmentIdState.ReviewImageState) objM48901c : null;
        if (reviewImageState2 == null) {
            return Unit.f29331a;
        }
        action.m48903e(input.getDesignVersion() == EnumC6852d.K0000 ? m17737g(reviewImageState2, reviewImageState.getIdForReview().mo16936d3(), ((AutoClassifyWorker.InterfaceC3562a.c) interfaceC3562a).m17702a(), C3555n.m17657x(action, false)) : new GovernmentIdState.AutoClassificationError(reviewImageState2.getCurrentPart(), reviewImageState2.mo16956E(), reviewImageState2.mo16955D(), reviewImageState2.getPartIndex(), C3555n.m17657x(action, false), reviewImageState2.getCountryCode(), reviewImageState.getIdForReview().mo16936d3(), reviewImageState.getCameraProperties(), ((AutoClassifyWorker.InterfaceC3562a.c) interfaceC3562a).m17702a(), null, null, EnumC6844b.UnableToClassify, 1536, null));
        return Unit.f29331a;
    }
}
