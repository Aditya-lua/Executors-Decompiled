package com.withpersona.sdk2.inquiry.selfie;

import com.appsflyer.R;
import com.withpersona.sdk2.inquiry.selfie.pose.PoseInfo;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.SelfieCaptureState;
import com.withpersona.sdk2.inquiry.tracking.model.SelfieCaptureStateEventData;
import com.withpersona.sdk2.inquiry.tracking.model.SelfiePoseDetectEventData;
import com.withpersona.sdk2.inquiry.tracking.model.SelfiePoseEventData;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u0017J\u0015\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010$\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020!2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b&\u0010\u0017J\u001d\u0010(\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020'2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b(\u0010)J\u001d\u0010.\u001a\u00020\f2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020\f¢\u0006\u0004\b0\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u00101R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u00102R\u0018\u00104\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u00103R\u0018\u00106\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u00105R\"\u00109\u001a\u0002078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<¨\u0006="}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/g;", "", "Lpq/c;", "externalEventLogger", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "<init>", "(Lpq/c;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V", "", "stepName", "Lpq/j;", "currentPage", "", "e", "(Ljava/lang/String;Lpq/j;)V", "c", "()V", "k", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "currentState", "b", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;)V", "l", "(Ljava/lang/String;)V", "j", "i", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;", "state", "d", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;)V", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;", "a", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;)V", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "selfie", "g", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;Lcom/withpersona/sdk2/inquiry/selfie/Selfie;)V", "m", "Lcom/withpersona/sdk2/inquiry/selfie/a;", "f", "(Lcom/withpersona/sdk2/inquiry/selfie/a;Lcom/withpersona/sdk2/inquiry/selfie/Selfie;)V", "Lkn/a;", "intendedPose", "Lkn/c;", "selfieFrameInfo", "h", "(Lkn/a;Lkn/c;)V", "n", "Lpq/c;", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "Lpq/j;", "lastPage", "Lkn/a;", "previousDetectedPose", "", "Z", "isRandomPosesOn", "()Z", "o", "(Z)V", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final pq.c externalEventLogger;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public pq.j lastPage;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public kn.a previousDetectedPose;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean isRandomPosesOn;

    public g(@NotNull pq.c externalEventLogger, @NotNull TrackingEventsLogger trackingEventsLogger) {
        Intrinsics.checkNotNullParameter(externalEventLogger, "externalEventLogger");
        Intrinsics.checkNotNullParameter(trackingEventsLogger, "trackingEventsLogger");
        this.externalEventLogger = externalEventLogger;
        this.trackingEventsLogger = trackingEventsLogger;
    }

    public final void a(@NotNull SelfieState.StartCaptureFaceDetected state) {
        Intrinsics.checkNotNullParameter(state, "state");
        TrackingEventsLogger.logSelfieCaptureStateEvent$default(this.trackingEventsLogger, new SelfieCaptureStateEventData(SelfieCaptureState.COUNTDOWN_STARTED, "auto", p.G(state.j()), null, 8, null), false, 2, null);
    }

    public final void b(@Nullable SelfieState currentState) {
        kn.a pose;
        if (currentState instanceof SelfieState.WaitForCameraFeed) {
            TrackingEventsLogger trackingEventsLogger = this.trackingEventsLogger;
            SelfieCaptureState selfieCaptureState = SelfieCaptureState.IDLE;
            PoseInfo poseInfo = (PoseInfo) CollectionsKt.firstOrNull(((SelfieState.WaitForCameraFeed) currentState).g());
            TrackingEventsLogger.logSelfieCaptureStateEvent$default(trackingEventsLogger, new SelfieCaptureStateEventData(selfieCaptureState, null, (poseInfo == null || (pose = poseInfo.getPose()) == null) ? null : p.G(pose), null, 8, null), false, 2, null);
            return;
        }
        if (currentState instanceof SelfieState.WaitForWebRtcSetup) {
            TrackingEventsLogger trackingEventsLogger2 = this.trackingEventsLogger;
            SelfieCaptureState selfieCaptureState2 = SelfieCaptureState.IDLE;
            kn.a aVarM = ((SelfieState.WaitForWebRtcSetup) currentState).m();
            TrackingEventsLogger.logSelfieCaptureStateEvent$default(trackingEventsLogger2, new SelfieCaptureStateEventData(selfieCaptureState2, "webrtc", aVarM != null ? p.G(aVarM) : null, null, 8, null), false, 2, null);
        }
    }

    public final void c() {
        TrackingEventsLogger.logSelfieCaptureStateEvent$default(this.trackingEventsLogger, new SelfieCaptureStateEventData(SelfieCaptureState.LOADING, null, null, null, 8, null), false, 2, null);
    }

    public final void d(@NotNull SelfieState.StartCapture state) {
        Intrinsics.checkNotNullParameter(state, "state");
        TrackingEventsLogger.logSelfieCaptureStateEvent$default(this.trackingEventsLogger, new SelfieCaptureStateEventData(SelfieCaptureState.TAKING_PHOTO, "manual", p.G(state.j()), null, 8, null), false, 2, null);
    }

    public final void e(@NotNull String stepName, @NotNull pq.j currentPage) {
        Intrinsics.checkNotNullParameter(stepName, "stepName");
        Intrinsics.checkNotNullParameter(currentPage, "currentPage");
        if (Intrinsics.c(currentPage, this.lastPage)) {
            return;
        }
        this.lastPage = currentPage;
        this.externalEventLogger.c(new pq.i.e(stepName, currentPage));
        TrackingEventsLogger.logInquiryPageViewEvent$default(this.trackingEventsLogger, stepName, currentPage.toString(), false, 4, null);
    }

    public final void f(@NotNull a state, @NotNull Selfie selfie) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(selfie, "selfie");
        TrackingEventsLogger.logSelfiePoseCaptureEvent$default(this.trackingEventsLogger, new SelfiePoseEventData(p.G(state.j()), p.F(selfie.getCaptureMethod()), null, 4, null), false, 2, null);
        TrackingEventsLogger trackingEventsLogger = this.trackingEventsLogger;
        SelfieCaptureState selfieCaptureState = SelfieCaptureState.CAPTURED_PHOTO;
        String lowerCase = selfie.getCaptureMethod().name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        TrackingEventsLogger.logSelfieCaptureStateEvent$default(trackingEventsLogger, new SelfieCaptureStateEventData(selfieCaptureState, lowerCase, p.G(state.j()), null, 8, null), false, 2, null);
    }

    public final void g(@NotNull SelfieState.Capture state, @NotNull Selfie selfie) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(selfie, "selfie");
        TrackingEventsLogger.logSelfieCaptureStateEvent$default(this.trackingEventsLogger, new SelfieCaptureStateEventData(SelfieCaptureState.TAKING_PHOTO, selfie.getCaptureMethod().name(), p.G(state.j()), null, 8, null), false, 2, null);
    }

    public final void h(@NotNull kn.a intendedPose, @NotNull kn.c selfieFrameInfo) {
        kn.a detectedPose;
        Intrinsics.checkNotNullParameter(intendedPose, "intendedPose");
        Intrinsics.checkNotNullParameter(selfieFrameInfo, "selfieFrameInfo");
        if (!this.isRandomPosesOn || this.previousDetectedPose == (detectedPose = selfieFrameInfo.getDetectedPose()) || detectedPose == null) {
            return;
        }
        this.previousDetectedPose = detectedPose;
        TrackingEventsLogger.logSelfiePoseDetect$default(this.trackingEventsLogger, new SelfiePoseDetectEventData(p.G(intendedPose), p.G(detectedPose), selfieFrameInfo.getFaceAngleX(), selfieFrameInfo.getFaceAngleY(), selfieFrameInfo.getFaceAngleZ(), null, 32, null), false, 2, null);
    }

    public final void i(@NotNull String stepName) {
        Intrinsics.checkNotNullParameter(stepName, "stepName");
        TrackingEventsLogger.logVideoStopRequestEvent$default(this.trackingEventsLogger, stepName, false, 2, null);
    }

    public final void j(@NotNull String stepName) {
        Intrinsics.checkNotNullParameter(stepName, "stepName");
        TrackingEventsLogger.logWebRtcIceCompleteEvent$default(this.trackingEventsLogger, stepName, null, false, 6, null);
    }

    public final void k() {
        TrackingEventsLogger.logSelfieCaptureStateEvent$default(this.trackingEventsLogger, new SelfieCaptureStateEventData(SelfieCaptureState.LOADING, "webrtc", null, null, 8, null), false, 2, null);
    }

    public final void l(@NotNull String stepName) {
        Intrinsics.checkNotNullParameter(stepName, "stepName");
        TrackingEventsLogger.logVideoStartEvent$default(this.trackingEventsLogger, stepName, "Stream", null, false, 12, null);
    }

    public final void m(@NotNull String stepName) {
        Intrinsics.checkNotNullParameter(stepName, "stepName");
        TrackingEventsLogger.logVideoStopEvent$default(this.trackingEventsLogger, stepName, "Stream", null, null, null, null, false, R.styleable.AppCompatTheme_windowMinWidthMajor, null);
    }

    public final void n() {
        this.previousDetectedPose = null;
    }

    public final void o(boolean z10) {
        this.isRandomPosesOn = z10;
    }
}
