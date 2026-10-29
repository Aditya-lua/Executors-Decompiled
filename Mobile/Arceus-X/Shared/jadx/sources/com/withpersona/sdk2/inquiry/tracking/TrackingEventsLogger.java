package com.withpersona.sdk2.inquiry.tracking;

import com.appsflyer.sdk_base.referrer.Payload;
import com.withpersona.sdk2.inquiry.tracking.model.CameraInfoEventData;
import com.withpersona.sdk2.inquiry.tracking.model.GovernmentIdButtonEventData;
import com.withpersona.sdk2.inquiry.tracking.model.GovernmentIdStateEventData;
import com.withpersona.sdk2.inquiry.tracking.model.InquiryConfigData;
import com.withpersona.sdk2.inquiry.tracking.model.InquiryEndReason;
import com.withpersona.sdk2.inquiry.tracking.model.IntegrationEventData;
import com.withpersona.sdk2.inquiry.tracking.model.NfcErrorEventData;
import com.withpersona.sdk2.inquiry.tracking.model.NfcScanEventData;
import com.withpersona.sdk2.inquiry.tracking.model.PermissionTrackingEventData;
import com.withpersona.sdk2.inquiry.tracking.model.SelfieCaptureButtonEventData;
import com.withpersona.sdk2.inquiry.tracking.model.SelfieCaptureStateEventData;
import com.withpersona.sdk2.inquiry.tracking.model.SelfiePoseDetectEventData;
import com.withpersona.sdk2.inquiry.tracking.model.SelfiePoseEventData;
import com.withpersona.sdk2.inquiry.tracking.model.UiStepButtonType;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J$\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000e\u001a\u00020\nH&J&\u0010\u000f\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000e\u001a\u00020\nH&J&\u0010\u0010\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000e\u001a\u00020\nH&J-\u0010\u0011\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u000e\u001a\u00020\nH&¢\u0006\u0002\u0010\u0014J5\u0010\u0015\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u000e\u001a\u00020\nH&¢\u0006\u0002\u0010\u0018JY\u0010\u0019\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010\u000e\u001a\u00020\nH&¢\u0006\u0002\u0010\u001fJ\u001a\u0010 \u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\nH&J<\u0010!\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000e\u001a\u00020\nH&J\u001a\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020&2\b\b\u0002\u0010\u000e\u001a\u00020\nH&J\u001a\u0010'\u001a\u00020\u00032\u0006\u0010(\u001a\u00020)2\b\b\u0002\u0010\u000e\u001a\u00020\nH&J\u001a\u0010*\u001a\u00020\u00032\u0006\u0010(\u001a\u00020+2\b\b\u0002\u0010\u000e\u001a\u00020\nH'J\u001a\u0010,\u001a\u00020\u00032\u0006\u0010(\u001a\u00020-2\b\b\u0002\u0010\u000e\u001a\u00020\nH&J\u001a\u0010.\u001a\u00020\u00032\u0006\u0010(\u001a\u00020/2\b\b\u0002\u0010\u000e\u001a\u00020\nH&J\u001a\u00100\u001a\u00020\u00032\u0006\u0010(\u001a\u0002012\b\b\u0002\u0010\u000e\u001a\u00020\nH&J\u001a\u00102\u001a\u00020\u00032\u0006\u00103\u001a\u0002042\b\b\u0002\u0010\u000e\u001a\u00020\nH&J.\u00105\u001a\u00020\u00032\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000e\u001a\u00020\nH&J\u001a\u0010;\u001a\u00020\u00032\u0006\u0010(\u001a\u00020<2\b\b\u0002\u0010\u000e\u001a\u00020\nH&J2\u0010=\u001a\u00020\u00032\u0006\u0010>\u001a\u00020?2\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000e\u001a\u00020\nH&J\u001a\u0010A\u001a\u00020\u00032\u0006\u0010(\u001a\u00020B2\b\b\u0002\u0010\u000e\u001a\u00020\nH&J\u001a\u0010C\u001a\u00020\u00032\u0006\u0010(\u001a\u00020D2\b\b\u0002\u0010\u000e\u001a\u00020\nH&J\u001a\u0010E\u001a\u00020\u00032\u0006\u0010(\u001a\u00020F2\b\b\u0002\u0010\u000e\u001a\u00020\nH&J(\u0010G\u001a\u00020\u00032\u0006\u0010H\u001a\u00020\u00052\f\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00050J2\b\b\u0002\u0010\u000e\u001a\u00020\nH&J\u001a\u0010K\u001a\u00020\u00032\u0006\u0010(\u001a\u00020L2\b\b\u0002\u0010\u000e\u001a\u00020\nH&¨\u0006MÀ\u0006\u0003"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "", "setSessionToken", "", "sessionToken", "", "setTrackingEventsUrl", "trackingEventsUrl", "setIsEnabled", "enabled", "", "logInquiryPageViewEvent", "stepName", "pageName", "force", "logForegroundEvent", "logBackgroundEvent", "logWebRtcIceCompleteEvent", "numCandidates", "", "(Ljava/lang/String;Ljava/lang/Integer;Z)V", "logVideoStartEvent", "videoCaptureMethod", "attempt", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Z)V", "logVideoStopEvent", "assetId", "elapsedTime", "chunksLength", "blobSize", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Z)V", "logVideoStopRequestEvent", "logVideoErrorEvent", "errorName", "errorReason", "logPermissionEvent", "permissionData", "Lcom/withpersona/sdk2/inquiry/tracking/model/PermissionTrackingEventData;", "logSelfieCaptureButtonClickedEvent", "data", "Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonEventData;", "logSelfiePoseCaptureEvent", "Lcom/withpersona/sdk2/inquiry/tracking/model/SelfiePoseEventData;", "logSelfieCaptureStateEvent", "Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureStateEventData;", "logGovernmentIdButtonClickEvent", "Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdButtonEventData;", "logGovernmentIdStateEvent", "Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdStateEventData;", "logInquiryStartEvent", "config", "Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryConfigData;", "logInquiryEndEvent", "reason", "Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryEndReason;", "durationMs", "", "errorDescription", "logIntegrationEvent", "Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationEventData;", "logUiStepButtonEvent", Payload.TYPE, "Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;", "buttonName", "logCameraInfoEvent", "Lcom/withpersona/sdk2/inquiry/tracking/model/CameraInfoEventData;", "logNfcScanEvent", "Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanEventData;", "logNfcErrorEvent", "Lcom/withpersona/sdk2/inquiry/tracking/model/NfcErrorEventData;", "logDebugLogEvent", "category", "message", "Lkotlin/Function0;", "logSelfiePoseDetect", "Lcom/withpersona/sdk2/inquiry/tracking/model/SelfiePoseDetectEventData;", "tracking-events_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public interface TrackingEventsLogger {

    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class DefaultImpls {
    }

    static /* synthetic */ void logBackgroundEvent$default(TrackingEventsLogger trackingEventsLogger, String str, String str2, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logBackgroundEvent");
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        trackingEventsLogger.logBackgroundEvent(str, str2, z10);
    }

    static /* synthetic */ void logCameraInfoEvent$default(TrackingEventsLogger trackingEventsLogger, CameraInfoEventData cameraInfoEventData, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logCameraInfoEvent");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        trackingEventsLogger.logCameraInfoEvent(cameraInfoEventData, z10);
    }

    static /* synthetic */ void logDebugLogEvent$default(TrackingEventsLogger trackingEventsLogger, String str, Function0 function0, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logDebugLogEvent");
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        trackingEventsLogger.logDebugLogEvent(str, function0, z10);
    }

    static /* synthetic */ void logForegroundEvent$default(TrackingEventsLogger trackingEventsLogger, String str, String str2, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logForegroundEvent");
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        trackingEventsLogger.logForegroundEvent(str, str2, z10);
    }

    static /* synthetic */ void logGovernmentIdButtonClickEvent$default(TrackingEventsLogger trackingEventsLogger, GovernmentIdButtonEventData governmentIdButtonEventData, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logGovernmentIdButtonClickEvent");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        trackingEventsLogger.logGovernmentIdButtonClickEvent(governmentIdButtonEventData, z10);
    }

    static /* synthetic */ void logGovernmentIdStateEvent$default(TrackingEventsLogger trackingEventsLogger, GovernmentIdStateEventData governmentIdStateEventData, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logGovernmentIdStateEvent");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        trackingEventsLogger.logGovernmentIdStateEvent(governmentIdStateEventData, z10);
    }

    static /* synthetic */ void logInquiryEndEvent$default(TrackingEventsLogger trackingEventsLogger, InquiryEndReason inquiryEndReason, long j10, String str, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logInquiryEndEvent");
        }
        if ((i10 & 4) != 0) {
            str = null;
        }
        String str2 = str;
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        trackingEventsLogger.logInquiryEndEvent(inquiryEndReason, j10, str2, z10);
    }

    static /* synthetic */ void logInquiryPageViewEvent$default(TrackingEventsLogger trackingEventsLogger, String str, String str2, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logInquiryPageViewEvent");
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        trackingEventsLogger.logInquiryPageViewEvent(str, str2, z10);
    }

    static /* synthetic */ void logInquiryStartEvent$default(TrackingEventsLogger trackingEventsLogger, InquiryConfigData inquiryConfigData, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logInquiryStartEvent");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        trackingEventsLogger.logInquiryStartEvent(inquiryConfigData, z10);
    }

    static /* synthetic */ void logIntegrationEvent$default(TrackingEventsLogger trackingEventsLogger, IntegrationEventData integrationEventData, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logIntegrationEvent");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        trackingEventsLogger.logIntegrationEvent(integrationEventData, z10);
    }

    static /* synthetic */ void logNfcErrorEvent$default(TrackingEventsLogger trackingEventsLogger, NfcErrorEventData nfcErrorEventData, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logNfcErrorEvent");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        trackingEventsLogger.logNfcErrorEvent(nfcErrorEventData, z10);
    }

    static /* synthetic */ void logNfcScanEvent$default(TrackingEventsLogger trackingEventsLogger, NfcScanEventData nfcScanEventData, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logNfcScanEvent");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        trackingEventsLogger.logNfcScanEvent(nfcScanEventData, z10);
    }

    static /* synthetic */ void logPermissionEvent$default(TrackingEventsLogger trackingEventsLogger, PermissionTrackingEventData permissionTrackingEventData, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logPermissionEvent");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        trackingEventsLogger.logPermissionEvent(permissionTrackingEventData, z10);
    }

    static /* synthetic */ void logSelfieCaptureButtonClickedEvent$default(TrackingEventsLogger trackingEventsLogger, SelfieCaptureButtonEventData selfieCaptureButtonEventData, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logSelfieCaptureButtonClickedEvent");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        trackingEventsLogger.logSelfieCaptureButtonClickedEvent(selfieCaptureButtonEventData, z10);
    }

    static /* synthetic */ void logSelfieCaptureStateEvent$default(TrackingEventsLogger trackingEventsLogger, SelfieCaptureStateEventData selfieCaptureStateEventData, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logSelfieCaptureStateEvent");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        trackingEventsLogger.logSelfieCaptureStateEvent(selfieCaptureStateEventData, z10);
    }

    static /* synthetic */ void logSelfiePoseCaptureEvent$default(TrackingEventsLogger trackingEventsLogger, SelfiePoseEventData selfiePoseEventData, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logSelfiePoseCaptureEvent");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        trackingEventsLogger.logSelfiePoseCaptureEvent(selfiePoseEventData, z10);
    }

    static /* synthetic */ void logSelfiePoseDetect$default(TrackingEventsLogger trackingEventsLogger, SelfiePoseDetectEventData selfiePoseDetectEventData, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logSelfiePoseDetect");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        trackingEventsLogger.logSelfiePoseDetect(selfiePoseDetectEventData, z10);
    }

    static /* synthetic */ void logUiStepButtonEvent$default(TrackingEventsLogger trackingEventsLogger, UiStepButtonType uiStepButtonType, String str, String str2, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logUiStepButtonEvent");
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        trackingEventsLogger.logUiStepButtonEvent(uiStepButtonType, str, str2, z10);
    }

    static /* synthetic */ void logVideoErrorEvent$default(TrackingEventsLogger trackingEventsLogger, String str, String str2, String str3, String str4, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logVideoErrorEvent");
        }
        if ((i10 & 4) != 0) {
            str3 = null;
        }
        if ((i10 & 8) != 0) {
            str4 = null;
        }
        if ((i10 & 16) != 0) {
            z10 = false;
        }
        trackingEventsLogger.logVideoErrorEvent(str, str2, str3, str4, z10);
    }

    static /* synthetic */ void logVideoStartEvent$default(TrackingEventsLogger trackingEventsLogger, String str, String str2, Integer num, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logVideoStartEvent");
        }
        if ((i10 & 4) != 0) {
            num = null;
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        trackingEventsLogger.logVideoStartEvent(str, str2, num, z10);
    }

    static /* synthetic */ void logVideoStopEvent$default(TrackingEventsLogger trackingEventsLogger, String str, String str2, String str3, Integer num, Integer num2, Double d10, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logVideoStopEvent");
        }
        if ((i10 & 4) != 0) {
            str3 = null;
        }
        if ((i10 & 8) != 0) {
            num = null;
        }
        if ((i10 & 16) != 0) {
            num2 = null;
        }
        if ((i10 & 32) != 0) {
            d10 = null;
        }
        if ((i10 & 64) != 0) {
            z10 = false;
        }
        trackingEventsLogger.logVideoStopEvent(str, str2, str3, num, num2, d10, z10);
    }

    static /* synthetic */ void logVideoStopRequestEvent$default(TrackingEventsLogger trackingEventsLogger, String str, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logVideoStopRequestEvent");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        trackingEventsLogger.logVideoStopRequestEvent(str, z10);
    }

    static /* synthetic */ void logWebRtcIceCompleteEvent$default(TrackingEventsLogger trackingEventsLogger, String str, Integer num, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logWebRtcIceCompleteEvent");
        }
        if ((i10 & 2) != 0) {
            num = null;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        trackingEventsLogger.logWebRtcIceCompleteEvent(str, num, z10);
    }

    void logBackgroundEvent(@Nullable String stepName, @Nullable String pageName, boolean force);

    void logCameraInfoEvent(@NotNull CameraInfoEventData data, boolean force);

    void logDebugLogEvent(@NotNull String category, @NotNull Function0<String> message, boolean force);

    void logForegroundEvent(@Nullable String stepName, @Nullable String pageName, boolean force);

    void logGovernmentIdButtonClickEvent(@NotNull GovernmentIdButtonEventData data, boolean force);

    void logGovernmentIdStateEvent(@NotNull GovernmentIdStateEventData data, boolean force);

    void logInquiryEndEvent(@NotNull InquiryEndReason reason, long durationMs, @Nullable String errorDescription, boolean force);

    void logInquiryPageViewEvent(@NotNull String stepName, @Nullable String pageName, boolean force);

    void logInquiryStartEvent(@NotNull InquiryConfigData config, boolean force);

    void logIntegrationEvent(@NotNull IntegrationEventData data, boolean force);

    void logNfcErrorEvent(@NotNull NfcErrorEventData data, boolean force);

    void logNfcScanEvent(@NotNull NfcScanEventData data, boolean force);

    void logPermissionEvent(@NotNull PermissionTrackingEventData permissionData, boolean force);

    void logSelfieCaptureButtonClickedEvent(@NotNull SelfieCaptureButtonEventData data, boolean force);

    void logSelfieCaptureStateEvent(@NotNull SelfieCaptureStateEventData data, boolean force);

    void logSelfiePoseCaptureEvent(@NotNull SelfiePoseEventData data, boolean force);

    void logSelfiePoseDetect(@NotNull SelfiePoseDetectEventData data, boolean force);

    void logUiStepButtonEvent(@NotNull UiStepButtonType type, @Nullable String buttonName, @Nullable String stepName, boolean force);

    void logVideoErrorEvent(@NotNull String stepName, @Nullable String videoCaptureMethod, @Nullable String errorName, @Nullable String errorReason, boolean force);

    void logVideoStartEvent(@NotNull String stepName, @Nullable String videoCaptureMethod, @Nullable Integer attempt, boolean force);

    void logVideoStopEvent(@NotNull String stepName, @Nullable String videoCaptureMethod, @Nullable String assetId, @Nullable Integer elapsedTime, @Nullable Integer chunksLength, @Nullable Double blobSize, boolean force);

    void logVideoStopRequestEvent(@NotNull String stepName, boolean force);

    void logWebRtcIceCompleteEvent(@Nullable String stepName, @Nullable Integer numCandidates, boolean force);

    void setIsEnabled(boolean enabled);

    void setSessionToken(@NotNull String sessionToken);

    void setTrackingEventsUrl(@Nullable String trackingEventsUrl);
}
