.class public final Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$Companion;,
        Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$Factory;,
        Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00fa\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0013\n\u0002\u0010\u0008\n\u0002\u0008\n\n\u0002\u0010\u0006\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\r\u0018\u0000 \u0094\u00012\u00020\u0001:\u0006\u0095\u0001\u0094\u0001\u0096\u0001BS\u0008\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0008\u0008\u0001\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0082@\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0002\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u001dH\u0082@\u00a2\u0006\u0004\u0008 \u0010\u0018J\u000f\u0010!\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008!\u0010\"J\u0017\u0010$\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008$\u0010%J\u0019\u0010\'\u001a\u00020\u001d2\u0008\u0010&\u001a\u0004\u0018\u00010\u000eH\u0016\u00a2\u0006\u0004\u0008\'\u0010%J\u0017\u0010)\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020\u001bH\u0016\u00a2\u0006\u0004\u0008)\u0010*J)\u0010-\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020\u000e2\u0008\u0010,\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016\u00a2\u0006\u0004\u0008-\u0010.J+\u0010/\u001a\u00020\u001d2\u0008\u0010+\u001a\u0004\u0018\u00010\u000e2\u0008\u0010,\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016\u00a2\u0006\u0004\u0008/\u0010.J+\u00100\u001a\u00020\u001d2\u0008\u0010+\u001a\u0004\u0018\u00010\u000e2\u0008\u0010,\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016\u00a2\u0006\u0004\u00080\u0010.J+\u00103\u001a\u00020\u001d2\u0008\u0010+\u001a\u0004\u0018\u00010\u000e2\u0008\u00102\u001a\u0004\u0018\u0001012\u0006\u0010\u001c\u001a\u00020\u001bH\u0016\u00a2\u0006\u0004\u00083\u00104J3\u00107\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020\u000e2\u0008\u00105\u001a\u0004\u0018\u00010\u000e2\u0008\u00106\u001a\u0004\u0018\u0001012\u0006\u0010\u001c\u001a\u00020\u001bH\u0016\u00a2\u0006\u0004\u00087\u00108JQ\u0010>\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020\u000e2\u0008\u00105\u001a\u0004\u0018\u00010\u000e2\u0008\u00109\u001a\u0004\u0018\u00010\u000e2\u0008\u0010:\u001a\u0004\u0018\u0001012\u0008\u0010;\u001a\u0004\u0018\u0001012\u0008\u0010=\u001a\u0004\u0018\u00010<2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016\u00a2\u0006\u0004\u0008>\u0010?J\u001f\u0010@\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016\u00a2\u0006\u0004\u0008@\u0010AJ=\u0010D\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020\u000e2\u0008\u00105\u001a\u0004\u0018\u00010\u000e2\u0008\u0010B\u001a\u0004\u0018\u00010\u000e2\u0008\u0010C\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016\u00a2\u0006\u0004\u0008D\u0010EJ\u001f\u0010H\u001a\u00020\u001d2\u0006\u0010G\u001a\u00020F2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016\u00a2\u0006\u0004\u0008H\u0010IJ\u001f\u0010L\u001a\u00020\u001d2\u0006\u0010K\u001a\u00020J2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016\u00a2\u0006\u0004\u0008L\u0010MJ\u001f\u0010O\u001a\u00020\u001d2\u0006\u0010K\u001a\u00020N2\u0006\u0010\u001c\u001a\u00020\u001bH\u0017\u00a2\u0006\u0004\u0008O\u0010PJ\u001f\u0010R\u001a\u00020\u001d2\u0006\u0010K\u001a\u00020Q2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016\u00a2\u0006\u0004\u0008R\u0010SJ\u001f\u0010U\u001a\u00020\u001d2\u0006\u0010K\u001a\u00020T2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016\u00a2\u0006\u0004\u0008U\u0010VJ\u001f\u0010X\u001a\u00020\u001d2\u0006\u0010K\u001a\u00020W2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016\u00a2\u0006\u0004\u0008X\u0010YJ\u001f\u0010\\\u001a\u00020\u001d2\u0006\u0010[\u001a\u00020Z2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016\u00a2\u0006\u0004\u0008\\\u0010]J1\u0010c\u001a\u00020\u001d2\u0006\u0010_\u001a\u00020^2\u0006\u0010a\u001a\u00020`2\u0008\u0010b\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016\u00a2\u0006\u0004\u0008c\u0010dJ\u001f\u0010f\u001a\u00020\u001d2\u0006\u0010K\u001a\u00020e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016\u00a2\u0006\u0004\u0008f\u0010gJ3\u0010k\u001a\u00020\u001d2\u0006\u0010i\u001a\u00020h2\u0008\u0010j\u001a\u0004\u0018\u00010\u000e2\u0008\u0010+\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016\u00a2\u0006\u0004\u0008k\u0010lJ\u001f\u0010n\u001a\u00020\u001d2\u0006\u0010K\u001a\u00020m2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016\u00a2\u0006\u0004\u0008n\u0010oJ\u001f\u0010q\u001a\u00020\u001d2\u0006\u0010K\u001a\u00020p2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016\u00a2\u0006\u0004\u0008q\u0010rJ\u001f\u0010t\u001a\u00020\u001d2\u0006\u0010K\u001a\u00020s2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016\u00a2\u0006\u0004\u0008t\u0010uJ-\u0010y\u001a\u00020\u001d2\u0006\u0010v\u001a\u00020\u000e2\u000c\u0010x\u001a\u0008\u0012\u0004\u0012\u00020\u000e0w2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016\u00a2\u0006\u0004\u0008y\u0010zJ\u001f\u0010|\u001a\u00020\u001d2\u0006\u0010K\u001a\u00020{2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016\u00a2\u0006\u0004\u0008|\u0010}R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010~R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u007fR\u0015\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0007\u0010\u0080\u0001R\u0015\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\t\u0010\u0081\u0001R\u0015\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u000b\u0010\u0082\u0001R\u0015\u0010\r\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\r\u0010\u0083\u0001R\u0015\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u000f\u0010\u0084\u0001R\u0015\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0011\u0010\u0085\u0001R\u0015\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0013\u0010\u0086\u0001R\u0018\u0010\u0088\u0001\u001a\u00030\u0087\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0088\u0001\u0010\u0089\u0001R\u0018\u0010\u008b\u0001\u001a\u00030\u008a\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u008b\u0001\u0010\u008c\u0001R\u0017\u0010\u008d\u0001\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u008d\u0001\u0010\u0084\u0001R\u0019\u0010#\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008#\u0010\u0084\u0001R\u0017\u0010&\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008&\u0010\u0084\u0001R\u0019\u0010\u008e\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u008e\u0001\u0010\u008f\u0001R\u001b\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0090\u0001\u0010\u0091\u0001R\u0017\u0010\u0092\u0001\u001a\u00020\u001b8BX\u0082\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u0092\u0001\u0010\u0093\u0001\u00a8\u0006\u0097\u0001"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;",
        "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
        "Landroid/content/Context;",
        "context",
        "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;",
        "cache",
        "Lum/w;",
        "moshi",
        "Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;",
        "metadataProvider",
        "Lqq/c;",
        "sdkFilesManager",
        "Lgo/e;",
        "featureFlagManager",
        "",
        "trackingEventServerEndpoint",
        "Lku/p0;",
        "coroutineScope",
        "Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager;",
        "networkStateManager",
        "<init>",
        "(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;Lum/w;Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;Lqq/c;Lgo/e;Ljava/lang/String;Lku/p0;Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager;)V",
        "Lcom/withpersona/sdk2/inquiry/tracking/network/PublicKeyResponse;",
        "fetchPublicKey",
        "(Lnt/b;)Ljava/lang/Object;",
        "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;",
        "event",
        "",
        "force",
        "",
        "logEvent",
        "(Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;Z)V",
        "flush",
        "nowToIso8601Utc",
        "()Ljava/lang/String;",
        "sessionToken",
        "setSessionToken",
        "(Ljava/lang/String;)V",
        "trackingEventsUrl",
        "setTrackingEventsUrl",
        "enabled",
        "setIsEnabled",
        "(Z)V",
        "stepName",
        "pageName",
        "logInquiryPageViewEvent",
        "(Ljava/lang/String;Ljava/lang/String;Z)V",
        "logForegroundEvent",
        "logBackgroundEvent",
        "",
        "numCandidates",
        "logWebRtcIceCompleteEvent",
        "(Ljava/lang/String;Ljava/lang/Integer;Z)V",
        "videoCaptureMethod",
        "attempt",
        "logVideoStartEvent",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Z)V",
        "assetId",
        "elapsedTime",
        "chunksLength",
        "",
        "blobSize",
        "logVideoStopEvent",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Z)V",
        "logVideoStopRequestEvent",
        "(Ljava/lang/String;Z)V",
        "errorName",
        "errorReason",
        "logVideoErrorEvent",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V",
        "Lcom/withpersona/sdk2/inquiry/tracking/model/PermissionTrackingEventData;",
        "permissionData",
        "logPermissionEvent",
        "(Lcom/withpersona/sdk2/inquiry/tracking/model/PermissionTrackingEventData;Z)V",
        "Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonEventData;",
        "data",
        "logSelfieCaptureButtonClickedEvent",
        "(Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonEventData;Z)V",
        "Lcom/withpersona/sdk2/inquiry/tracking/model/SelfiePoseEventData;",
        "logSelfiePoseCaptureEvent",
        "(Lcom/withpersona/sdk2/inquiry/tracking/model/SelfiePoseEventData;Z)V",
        "Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureStateEventData;",
        "logSelfieCaptureStateEvent",
        "(Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureStateEventData;Z)V",
        "Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdButtonEventData;",
        "logGovernmentIdButtonClickEvent",
        "(Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdButtonEventData;Z)V",
        "Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdStateEventData;",
        "logGovernmentIdStateEvent",
        "(Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdStateEventData;Z)V",
        "Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryConfigData;",
        "config",
        "logInquiryStartEvent",
        "(Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryConfigData;Z)V",
        "Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryEndReason;",
        "reason",
        "",
        "durationMs",
        "errorDescription",
        "logInquiryEndEvent",
        "(Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryEndReason;JLjava/lang/String;Z)V",
        "Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationEventData;",
        "logIntegrationEvent",
        "(Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationEventData;Z)V",
        "Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;",
        "type",
        "buttonName",
        "logUiStepButtonEvent",
        "(Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;Ljava/lang/String;Ljava/lang/String;Z)V",
        "Lcom/withpersona/sdk2/inquiry/tracking/model/CameraInfoEventData;",
        "logCameraInfoEvent",
        "(Lcom/withpersona/sdk2/inquiry/tracking/model/CameraInfoEventData;Z)V",
        "Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanEventData;",
        "logNfcScanEvent",
        "(Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanEventData;Z)V",
        "Lcom/withpersona/sdk2/inquiry/tracking/model/NfcErrorEventData;",
        "logNfcErrorEvent",
        "(Lcom/withpersona/sdk2/inquiry/tracking/model/NfcErrorEventData;Z)V",
        "category",
        "Lkotlin/Function0;",
        "message",
        "logDebugLogEvent",
        "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Z)V",
        "Lcom/withpersona/sdk2/inquiry/tracking/model/SelfiePoseDetectEventData;",
        "logSelfiePoseDetect",
        "(Lcom/withpersona/sdk2/inquiry/tracking/model/SelfiePoseDetectEventData;Z)V",
        "Landroid/content/Context;",
        "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;",
        "Lum/w;",
        "Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;",
        "Lqq/c;",
        "Lgo/e;",
        "Ljava/lang/String;",
        "Lku/p0;",
        "Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager;",
        "Lx5/p0;",
        "workManager",
        "Lx5/p0;",
        "Ljava/text/SimpleDateFormat;",
        "iso8601Formatter",
        "Ljava/text/SimpleDateFormat;",
        "id",
        "isEnabled",
        "Z",
        "cachedPublicKeyResponse",
        "Lcom/withpersona/sdk2/inquiry/tracking/network/PublicKeyResponse;",
        "isDebugMode",
        "()Z",
        "Companion",
        "Factory",
        "TrackingEventsWorker",
        "tracking-events_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final DEFAULT_MEMORY_THRESHOLD:I = 0xa

.field public static final KEY_ENCRYPTED_REQUEST_FILE:Ljava/lang/String; = "encrypted_request_file"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final KEY_FLUSH_TOKEN:Ljava/lang/String; = "flush_token"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final KEY_SERVER_ENDPOINT:Ljava/lang/String; = "server_endpoint"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final KEY_SESSION_TOKEN:Ljava/lang/String; = "session_token"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final WORK_NAME_PREFIX:Ljava/lang/String; = "tracking_events_work_"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static trackingEventsJsonAdapter:Lum/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lum/h<",
            "Ljava/util/List<",
            "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# instance fields
.field private final cache:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private volatile cachedPublicKeyResponse:Lcom/withpersona/sdk2/inquiry/tracking/network/PublicKeyResponse;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final context:Landroid/content/Context;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final coroutineScope:Lku/p0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final featureFlagManager:Lgo/e;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final id:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private volatile isEnabled:Z

.field private final iso8601Formatter:Ljava/text/SimpleDateFormat;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final metadataProvider:Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final moshi:Lum/w;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final networkStateManager:Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final sdkFilesManager:Lqq/c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private volatile sessionToken:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final trackingEventServerEndpoint:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private volatile trackingEventsUrl:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final workManager:Lx5/p0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->Companion:Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;Lum/w;Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;Lqq/c;Lgo/e;Ljava/lang/String;Lku/p0;Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lum/w;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lqq/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Lgo/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p8    # Lku/p0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p9    # Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->context:Landroid/content/Context;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->cache:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;

    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->moshi:Lum/w;

    iput-object p4, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->metadataProvider:Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;

    iput-object p5, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->sdkFilesManager:Lqq/c;

    iput-object p6, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->featureFlagManager:Lgo/e;

    iput-object p7, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->trackingEventServerEndpoint:Ljava/lang/String;

    iput-object p8, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->coroutineScope:Lku/p0;

    iput-object p9, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->networkStateManager:Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager;

    sget-object p4, Lx5/p0;->a:Lx5/p0$a;

    invoke-virtual {p4, p1}, Lx5/p0$a;->a(Landroid/content/Context;)Lx5/p0;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->workManager:Lx5/p0;

    new-instance p1, Ljava/text/SimpleDateFormat;

    sget-object p4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const-string p5, "yyyy-MM-dd\'T\'HH:mm:ss.SSS\'Z\'"

    invoke-direct {p1, p5, p4}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    const-string p4, "UTC"

    invoke-static {p4}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object p4

    invoke-virtual {p1, p4}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->iso8601Formatter:Ljava/text/SimpleDateFormat;

    invoke-static {}, Lcom/withpersona/sdk2/inquiry/tracking/a;->a()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->id:Ljava/lang/String;

    iput-object p7, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->trackingEventsUrl:Ljava/lang/String;

    const/4 p1, 0x1

    new-array p1, p1, [Ljava/lang/reflect/Type;

    const-class p4, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;

    const/4 p5, 0x0

    aput-object p4, p1, p5

    const-class p4, Ljava/util/List;

    invoke-static {p4, p1}, Lum/a0;->j(Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)Ljava/lang/reflect/ParameterizedType;

    move-result-object p1

    invoke-virtual {p3, p1}, Lum/w;->d(Ljava/lang/reflect/Type;)Lum/h;

    move-result-object p1

    sput-object p1, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->trackingEventsJsonAdapter:Lum/h;

    sget-object p1, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;->Companion:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$Companion;

    invoke-virtual {p1, p2}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$Companion;->setInstance(Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;)V

    return-void
.end method

.method public static final synthetic access$fetchPublicKey(Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;Lnt/b;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->fetchPublicKey(Lnt/b;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$flush(Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;Lnt/b;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->flush(Lnt/b;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getId$p(Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->id:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$getTrackingEventsJsonAdapter$cp()Lum/h;
    .locals 1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->trackingEventsJsonAdapter:Lum/h;

    return-object v0
.end method

.method private final fetchPublicKey(Lnt/b;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnt/b<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/tracking/network/PublicKeyResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$fetchPublicKey$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$fetchPublicKey$1;

    iget v1, v0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$fetchPublicKey$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$fetchPublicKey$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$fetchPublicKey$1;

    invoke-direct {v0, p0, p1}, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$fetchPublicKey$1;-><init>(Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;Lnt/b;)V

    :goto_0
    iget-object p1, v0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$fetchPublicKey$1;->result:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$fetchPublicKey$1;->label:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$fetchPublicKey$1;->L$0:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    :try_start_0
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    check-cast p1, Ljt/n;

    invoke-virtual {p1}, Ljt/n;->j()Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->cachedPublicKeyResponse:Lcom/withpersona/sdk2/inquiry/tracking/network/PublicKeyResponse;

    if-eqz p1, :cond_3

    return-object p1

    :cond_3
    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->sessionToken:Ljava/lang/String;

    if-nez p1, :cond_4

    return-object v4

    :cond_4
    :try_start_1
    sget-object v2, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceComponentManager;->INSTANCE:Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceComponentManager;

    iget-object v5, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->context:Landroid/content/Context;

    iget-object v6, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->trackingEventsUrl:Ljava/lang/String;

    invoke-virtual {v2, v5, v6}, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceComponentManager;->getInstance(Landroid/content/Context;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceComponent;

    move-result-object v2

    invoke-interface {v2}, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceComponent;->trackingEventsService()Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsService;

    move-result-object v2

    invoke-static {p1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$fetchPublicKey$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$fetchPublicKey$1;->label:I

    invoke-virtual {v2, p1, v0}, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsService;->getPublicKey-gIAlu-s$tracking_events_release(Ljava/lang/String;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    return-object v1

    :cond_5
    :goto_1
    invoke-static {p1}, Ljt/n;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    move-object p1, v4

    :cond_6
    check-cast p1, Lcom/withpersona/sdk2/inquiry/tracking/network/PublicKeyResponse;

    if-eqz p1, :cond_7

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->cachedPublicKeyResponse:Lcom/withpersona/sdk2/inquiry/tracking/network/PublicKeyResponse;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-object p1

    :catch_0
    :cond_7
    return-object v4
.end method

.method private final flush(Lnt/b;)Ljava/lang/Object;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    instance-of v2, v0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$flush$1;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$flush$1;

    iget v3, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$flush$1;->label:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$flush$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$flush$1;

    invoke-direct {v2, v1, v0}, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$flush$1;-><init>(Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;Lnt/b;)V

    :goto_0
    iget-object v0, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$flush$1;->result:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v3

    iget v4, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$flush$1;->label:I

    const/4 v5, 0x4

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v8, 0x1

    const/4 v9, 0x0

    packed-switch v4, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget-object v3, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$flush$1;->L$5:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Exception;

    iget-object v3, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$flush$1;->L$4:Ljava/lang/Object;

    check-cast v3, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventFlushSession;

    iget-object v3, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$flush$1;->L$3:Ljava/lang/Object;

    check-cast v3, Ljava/io/File;

    iget-object v3, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$flush$1;->L$2:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object v3, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$flush$1;->L$1:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object v2, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$flush$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;

    invoke-static {v0}, Ljt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_11

    :pswitch_1
    iget-object v4, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$flush$1;->L$7:Ljava/lang/Object;

    check-cast v4, Lcom/withpersona/sdk2/inquiry/tracking/network/EncryptedTrackingEventsRequest;

    iget-object v4, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$flush$1;->L$6:Ljava/lang/Object;

    check-cast v4, Lcom/withpersona/sdk2/inquiry/tracking/network/PublicKeyResponse;

    iget-object v4, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$flush$1;->L$5:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v4, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$flush$1;->L$4:Ljava/lang/Object;

    check-cast v4, Lx5/d;

    iget-object v4, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$flush$1;->L$3:Ljava/lang/Object;

    check-cast v4, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventFlushSession;

    iget-object v5, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$flush$1;->L$2:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v6, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$flush$1;->L$1:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    iget-object v8, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$flush$1;->L$0:Ljava/lang/Object;

    check-cast v8, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;

    :try_start_0
    invoke-static {v0}, Ljt/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_8

    :catch_0
    move-exception v0

    :goto_1
    move-object v11, v4

    move-object v4, v9

    goto/16 :goto_f

    :pswitch_2
    iget-object v4, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$flush$1;->L$6:Ljava/lang/Object;

    check-cast v4, Lcom/withpersona/sdk2/inquiry/tracking/network/PublicKeyResponse;

    iget-object v8, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$flush$1;->L$5:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    iget-object v10, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$flush$1;->L$4:Ljava/lang/Object;

    check-cast v10, Lx5/d;

    iget-object v11, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$flush$1;->L$3:Ljava/lang/Object;

    check-cast v11, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventFlushSession;

    iget-object v12, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$flush$1;->L$2:Ljava/lang/Object;

    check-cast v12, Ljava/lang/String;

    iget-object v13, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$flush$1;->L$1:Ljava/lang/Object;

    check-cast v13, Ljava/lang/String;

    iget-object v14, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$flush$1;->L$0:Ljava/lang/Object;

    check-cast v14, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;

    :try_start_1
    invoke-static {v0}, Ljt/o;->b(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-object v6, v13

    move-object v13, v10

    move-object v10, v8

    move-object v8, v14

    goto/16 :goto_7

    :catch_1
    move-exception v0

    move-object v4, v11

    move-object v5, v12

    move-object v6, v13

    move-object v8, v14

    goto :goto_1

    :pswitch_3
    iget-object v4, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$flush$1;->L$5:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v8, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$flush$1;->L$4:Ljava/lang/Object;

    check-cast v8, Lx5/d;

    iget-object v10, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$flush$1;->L$3:Ljava/lang/Object;

    check-cast v10, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventFlushSession;

    iget-object v11, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$flush$1;->L$2:Ljava/lang/Object;

    check-cast v11, Ljava/lang/String;

    iget-object v12, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$flush$1;->L$1:Ljava/lang/Object;

    check-cast v12, Ljava/lang/String;

    iget-object v13, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$flush$1;->L$0:Ljava/lang/Object;

    check-cast v13, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;

    :try_start_2
    invoke-static {v0}, Ljt/o;->b(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    move-object/from16 v16, v8

    move-object v8, v4

    move-object v4, v10

    move-object v10, v12

    move-object/from16 v12, v16

    goto/16 :goto_5

    :catch_2
    move-exception v0

    move-object v4, v10

    move-object v5, v11

    move-object v6, v12

    goto/16 :goto_d

    :pswitch_4
    iget-object v3, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$flush$1;->L$3:Ljava/lang/Object;

    check-cast v3, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventFlushSession;

    iget-object v3, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$flush$1;->L$2:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object v3, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$flush$1;->L$1:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object v2, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$flush$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;

    invoke-static {v0}, Ljt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_3

    :pswitch_5
    iget-object v4, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$flush$1;->L$2:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v10, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$flush$1;->L$1:Ljava/lang/Object;

    check-cast v10, Ljava/lang/String;

    iget-object v11, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$flush$1;->L$0:Ljava/lang/Object;

    check-cast v11, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;

    invoke-static {v0}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_2

    :pswitch_6
    invoke-static {v0}, Ljt/o;->b(Ljava/lang/Object;)V

    sget-object v0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;->Companion:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$Companion;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$Companion;->getInstance()Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;

    move-result-object v0

    if-nez v0, :cond_1

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0

    :cond_1
    iget-object v4, v1, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->sessionToken:Ljava/lang/String;

    if-nez v4, :cond_2

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0

    :cond_2
    iget-object v10, v1, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->trackingEventsUrl:Ljava/lang/String;

    iget-object v11, v1, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->id:Ljava/lang/String;

    iput-object v0, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$flush$1;->L$0:Ljava/lang/Object;

    iput-object v4, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$flush$1;->L$1:Ljava/lang/Object;

    iput-object v10, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$flush$1;->L$2:Ljava/lang/Object;

    iput v8, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$flush$1;->label:I

    invoke-virtual {v0, v11, v2}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;->beginFlush(Ljava/lang/String;Lnt/b;)Ljava/lang/Object;

    move-result-object v11

    if-ne v11, v3, :cond_3

    goto/16 :goto_10

    :cond_3
    move-object/from16 v16, v11

    move-object v11, v0

    move-object/from16 v0, v16

    move-object/from16 v16, v10

    move-object v10, v4

    move-object/from16 v4, v16

    :goto_2
    move-object v12, v0

    check-cast v12, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventFlushSession;

    invoke-virtual {v12}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventFlushSession;->getTrackingEvents()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {v12}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventFlushSession;->getToken()Ljava/lang/String;

    move-result-object v0

    invoke-static {v11}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$flush$1;->L$0:Ljava/lang/Object;

    invoke-static {v10}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$flush$1;->L$1:Ljava/lang/Object;

    invoke-static {v4}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$flush$1;->L$2:Ljava/lang/Object;

    invoke-static {v12}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$flush$1;->L$3:Ljava/lang/Object;

    iput v6, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$flush$1;->label:I

    invoke-virtual {v11, v0, v8, v2}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;->onFlushFinished(Ljava/lang/String;ZLnt/b;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_4

    goto/16 :goto_10

    :cond_4
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0

    :cond_5
    :try_start_3
    new-instance v0, Lx5/d$a;

    invoke-direct {v0}, Lx5/d$a;-><init>()V

    sget-object v8, Lx5/x;->b:Lx5/x;

    invoke-virtual {v0, v8}, Lx5/d$a;->b(Lx5/x;)Lx5/d$a;

    move-result-object v0

    invoke-virtual {v0}, Lx5/d$a;->a()Lx5/d;

    move-result-object v0

    sget-object v8, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->trackingEventsJsonAdapter:Lum/h;

    if-eqz v8, :cond_6

    invoke-virtual {v12}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventFlushSession;->getTrackingEvents()Ljava/util/List;

    move-result-object v13

    invoke-virtual {v8, v13}, Lum/h;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    goto :goto_4

    :catch_3
    move-exception v0

    goto/16 :goto_e

    :cond_6
    move-object v8, v9

    :goto_4
    iput-object v11, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$flush$1;->L$0:Ljava/lang/Object;

    iput-object v10, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$flush$1;->L$1:Ljava/lang/Object;

    iput-object v4, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$flush$1;->L$2:Ljava/lang/Object;

    iput-object v12, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$flush$1;->L$3:Ljava/lang/Object;

    iput-object v0, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$flush$1;->L$4:Ljava/lang/Object;

    iput-object v8, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$flush$1;->L$5:Ljava/lang/Object;

    const/4 v13, 0x3

    iput v13, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$flush$1;->label:I

    invoke-direct {v1, v2}, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->fetchPublicKey(Lnt/b;)Ljava/lang/Object;

    move-result-object v13
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    if-ne v13, v3, :cond_7

    goto/16 :goto_10

    :cond_7
    move-object/from16 v16, v12

    move-object v12, v0

    move-object v0, v13

    move-object v13, v11

    move-object v11, v4

    move-object/from16 v4, v16

    :goto_5
    :try_start_4
    check-cast v0, Lcom/withpersona/sdk2/inquiry/tracking/network/PublicKeyResponse;

    sget-object v14, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->Companion:Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$Companion;

    if-nez v8, :cond_8

    const-string v15, ""

    goto :goto_6

    :catch_4
    move-exception v0

    goto/16 :goto_c

    :cond_8
    move-object v15, v8

    :goto_6
    iput-object v13, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$flush$1;->L$0:Ljava/lang/Object;

    iput-object v10, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$flush$1;->L$1:Ljava/lang/Object;

    iput-object v11, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$flush$1;->L$2:Ljava/lang/Object;

    iput-object v4, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$flush$1;->L$3:Ljava/lang/Object;

    iput-object v12, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$flush$1;->L$4:Ljava/lang/Object;

    invoke-static {v8}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$flush$1;->L$5:Ljava/lang/Object;

    invoke-static {v0}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$flush$1;->L$6:Ljava/lang/Object;

    iput v5, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$flush$1;->label:I

    invoke-static {v14, v15, v0, v2}, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$Companion;->access$createTrackingEventsRequest(Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$Companion;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/network/PublicKeyResponse;Lnt/b;)Ljava/lang/Object;

    move-result-object v6
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    if-ne v6, v3, :cond_9

    goto/16 :goto_10

    :cond_9
    move-object/from16 v16, v4

    move-object v4, v0

    move-object v0, v6

    move-object v6, v10

    move-object v10, v8

    move-object v8, v13

    move-object v13, v12

    move-object v12, v11

    move-object/from16 v11, v16

    :goto_7
    :try_start_5
    check-cast v0, Lcom/withpersona/sdk2/inquiry/tracking/network/EncryptedTrackingEventsRequest;

    if-nez v0, :cond_b

    invoke-virtual {v11}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventFlushSession;->getToken()Ljava/lang/String;

    move-result-object v5

    iput-object v8, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$flush$1;->L$0:Ljava/lang/Object;

    invoke-static {v6}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    iput-object v14, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$flush$1;->L$1:Ljava/lang/Object;

    invoke-static {v12}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    iput-object v14, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$flush$1;->L$2:Ljava/lang/Object;

    iput-object v11, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$flush$1;->L$3:Ljava/lang/Object;

    invoke-static {v13}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    iput-object v13, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$flush$1;->L$4:Ljava/lang/Object;

    invoke-static {v10}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$flush$1;->L$5:Ljava/lang/Object;

    invoke-static {v4}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$flush$1;->L$6:Ljava/lang/Object;

    invoke-static {v0}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$flush$1;->L$7:Ljava/lang/Object;

    const/4 v0, 0x5

    iput v0, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$flush$1;->label:I

    invoke-virtual {v8, v5, v7, v2}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;->onFlushFinished(Ljava/lang/String;ZLnt/b;)Ljava/lang/Object;

    move-result-object v0
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_5

    if-ne v0, v3, :cond_a

    goto/16 :goto_10

    :cond_a
    move-object v4, v11

    move-object v5, v12

    :goto_8
    :try_start_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    return-object v0

    :catch_5
    move-exception v0

    goto/16 :goto_b

    :cond_b
    :try_start_7
    iget-object v4, v1, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->sdkFilesManager:Lqq/c;

    const-string v10, "json"

    invoke-virtual {v4, v10}, Lqq/c;->d(Ljava/lang/String;)Ljava/io/File;

    move-result-object v4
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_5

    :try_start_8
    new-instance v10, Lum/w$b;

    invoke-direct {v10}, Lum/w$b;-><init>()V

    invoke-virtual {v10}, Lum/w$b;->d()Lum/w;

    move-result-object v10

    const-class v14, Lcom/withpersona/sdk2/inquiry/tracking/network/EncryptedTrackingEventsRequest;

    invoke-virtual {v10, v14}, Lum/w;->c(Ljava/lang/Class;)Lum/h;

    move-result-object v10

    invoke-virtual {v10, v0}, Lum/h;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v10, 0x2

    invoke-static {v4, v0, v9, v10, v9}, Lut/i;->k(Ljava/io/File;Ljava/lang/String;Ljava/nio/charset/Charset;ILjava/lang/Object;)V

    new-instance v0, Lx5/z$a;

    const-class v10, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker;

    invoke-direct {v0, v10}, Lx5/z$a;-><init>(Ljava/lang/Class;)V

    invoke-virtual {v0, v13}, Lx5/q0$a;->k(Lx5/d;)Lx5/q0$a;

    move-result-object v0

    check-cast v0, Lx5/z$a;

    const-string v10, "server_endpoint"

    invoke-static {v10, v12}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    const-string v13, "session_token"

    invoke-static {v13, v6}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v13

    const-string v14, "encrypted_request_file"

    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v15

    invoke-static {v14, v15}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    const-string v15, "flush_token"

    invoke-virtual {v11}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventFlushSession;->getToken()Ljava/lang/String;

    move-result-object v7

    invoke-static {v15, v7}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v7

    filled-new-array {v10, v13, v14, v7}, [Lkotlin/Pair;

    move-result-object v7

    new-instance v10, Landroidx/work/b$a;

    invoke-direct {v10}, Landroidx/work/b$a;-><init>()V

    const/4 v13, 0x0

    :goto_9
    if-ge v13, v5, :cond_c

    aget-object v14, v7, v13

    invoke-virtual {v14}, Lkotlin/Pair;->c()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/String;

    invoke-virtual {v14}, Lkotlin/Pair;->d()Ljava/lang/Object;

    move-result-object v14

    invoke-virtual {v10, v15, v14}, Landroidx/work/b$a;->b(Ljava/lang/String;Ljava/lang/Object;)Landroidx/work/b$a;

    add-int/lit8 v13, v13, 0x1

    goto :goto_9

    :cond_c
    invoke-virtual {v10}, Landroidx/work/b$a;->a()Landroidx/work/b;

    move-result-object v5

    invoke-virtual {v0, v5}, Lx5/q0$a;->o(Landroidx/work/b;)Lx5/q0$a;

    move-result-object v0

    check-cast v0, Lx5/z$a;

    invoke-virtual {v0}, Lx5/q0$a;->b()Lx5/q0;

    move-result-object v0

    check-cast v0, Lx5/z;

    iget-object v5, v1, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->workManager:Lx5/p0;

    invoke-static {v6}, Ljq/m;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v10}, Ljq/m;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "tracking_events_work_"

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, "_"

    invoke-virtual {v13, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    sget-object v10, Lx5/j;->a:Lx5/j;

    invoke-virtual {v5, v7, v10, v0}, Lx5/p0;->g(Ljava/lang/String;Lx5/j;Lx5/z;)Lx5/a0;
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_6

    goto :goto_11

    :catch_6
    move-exception v0

    :goto_a
    move-object v5, v12

    goto :goto_f

    :goto_b
    move-object v4, v9

    goto :goto_a

    :goto_c
    move-object v6, v10

    move-object v5, v11

    :goto_d
    move-object v8, v13

    goto/16 :goto_1

    :goto_e
    move-object v5, v4

    move-object v4, v9

    move-object v6, v10

    move-object v8, v11

    move-object v11, v12

    :goto_f
    if-eqz v4, :cond_d

    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    move-result v7

    invoke-static {v7}, Lpt/b;->a(Z)Ljava/lang/Boolean;

    :cond_d
    invoke-virtual {v11}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventFlushSession;->getToken()Ljava/lang/String;

    move-result-object v7

    invoke-static {v8}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$flush$1;->L$0:Ljava/lang/Object;

    invoke-static {v6}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$flush$1;->L$1:Ljava/lang/Object;

    invoke-static {v5}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$flush$1;->L$2:Ljava/lang/Object;

    invoke-static {v4}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$flush$1;->L$3:Ljava/lang/Object;

    invoke-static {v11}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$flush$1;->L$4:Ljava/lang/Object;

    invoke-static {v0}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$flush$1;->L$5:Ljava/lang/Object;

    iput-object v9, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$flush$1;->L$6:Ljava/lang/Object;

    iput-object v9, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$flush$1;->L$7:Ljava/lang/Object;

    const/4 v0, 0x6

    iput v0, v2, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$flush$1;->label:I

    const/4 v4, 0x0

    invoke-virtual {v8, v7, v4, v2}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;->onFlushFinished(Ljava/lang/String;ZLnt/b;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_e

    :goto_10
    return-object v3

    :cond_e
    :goto_11
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final isDebugMode()Z
    .locals 2

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->featureFlagManager:Lgo/e;

    sget-object v1, Lgo/c;->a:Lgo/c;

    invoke-virtual {v0, v1}, Lgo/e;->a(Lgo/d;)Z

    move-result v0

    return v0
.end method

.method private final logEvent(Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;Z)V
    .locals 7

    iget-boolean v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->isEnabled:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->coroutineScope:Lku/p0;

    new-instance v4, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$logEvent$1;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, p2, v0}, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$logEvent$1;-><init>(Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;ZLnt/b;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lku/i;->d(Lku/p0;Lkotlin/coroutines/CoroutineContext;Lku/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lku/d2;

    return-void
.end method

.method private final nowToIso8601Utc()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->iso8601Formatter:Ljava/text/SimpleDateFormat;

    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object v0
.end method


# virtual methods
.method public logBackgroundEvent(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->metadataProvider:Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;->collect()Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;

    move-result-object v0

    new-instance v1, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryBackgroundEvent;

    invoke-static {}, Lcom/withpersona/sdk2/inquiry/tracking/a;->a()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingUiEvent;

    invoke-direct {v3, p2, p1, v0}, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingUiEvent;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;)V

    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->nowToIso8601Utc()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, v2, v3, p1}, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryBackgroundEvent;-><init>(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingUiEvent;Ljava/lang/String;)V

    invoke-direct {p0, v1, p3}, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->logEvent(Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;Z)V

    return-void
.end method

.method public logCameraInfoEvent(Lcom/withpersona/sdk2/inquiry/tracking/model/CameraInfoEventData;Z)V
    .locals 12
    .param p1    # Lcom/withpersona/sdk2/inquiry/tracking/model/CameraInfoEventData;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->metadataProvider:Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;->collect()Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;

    move-result-object v8

    new-instance v0, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryCameraInfoEvent;

    invoke-static {}, Lcom/withpersona/sdk2/inquiry/tracking/a;->a()Ljava/lang/String;

    move-result-object v11

    const/16 v9, 0x3f

    const/4 v10, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v10}, Lcom/withpersona/sdk2/inquiry/tracking/model/CameraInfoEventData;->copy$default(Lcom/withpersona/sdk2/inquiry/tracking/model/CameraInfoEventData;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/CameraSize;Ljava/lang/Double;Ljava/lang/Double;Lcom/withpersona/sdk2/inquiry/tracking/model/CameraDebugData;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;ILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/tracking/model/CameraInfoEventData;

    move-result-object p1

    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->nowToIso8601Utc()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v11, p1, v1}, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryCameraInfoEvent;-><init>(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/CameraInfoEventData;Ljava/lang/String;)V

    invoke-direct {p0, v0, p2}, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->logEvent(Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;Z)V

    return-void
.end method

.method public logDebugLogEvent(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Z)V
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;Z)V"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->isDebugMode()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->metadataProvider:Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;->collect()Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;

    move-result-object v0

    new-instance v1, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryDebugLogEvent;

    invoke-static {}, Lcom/withpersona/sdk2/inquiry/tracking/a;->a()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/withpersona/sdk2/inquiry/tracking/model/DebugLogEventData;

    invoke-interface {p2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-direct {v3, p1, p2, v0}, Lcom/withpersona/sdk2/inquiry/tracking/model/DebugLogEventData;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;)V

    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->nowToIso8601Utc()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, v2, v3, p1}, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryDebugLogEvent;-><init>(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/DebugLogEventData;Ljava/lang/String;)V

    invoke-direct {p0, v1, p3}, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->logEvent(Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;Z)V

    return-void
.end method

.method public logForegroundEvent(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->metadataProvider:Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;->collect()Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;

    move-result-object v0

    new-instance v1, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryForegroundEvent;

    invoke-static {}, Lcom/withpersona/sdk2/inquiry/tracking/a;->a()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingUiEvent;

    invoke-direct {v3, p2, p1, v0}, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingUiEvent;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;)V

    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->nowToIso8601Utc()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, v2, v3, p1}, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryForegroundEvent;-><init>(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingUiEvent;Ljava/lang/String;)V

    invoke-direct {p0, v1, p3}, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->logEvent(Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;Z)V

    return-void
.end method

.method public logGovernmentIdButtonClickEvent(Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdButtonEventData;Z)V
    .locals 5
    .param p1    # Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdButtonEventData;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryGovernmentIdButtonEvent;

    invoke-static {}, Lcom/withpersona/sdk2/inquiry/tracking/a;->a()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->metadataProvider:Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;->collect()Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-static {p1, v3, v2, v4, v3}, Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdButtonEventData;->copy$default(Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdButtonEventData;Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureButtonType;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;ILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdButtonEventData;

    move-result-object p1

    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->nowToIso8601Utc()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, p1, v2}, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryGovernmentIdButtonEvent;-><init>(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdButtonEventData;Ljava/lang/String;)V

    invoke-direct {p0, v0, p2}, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->logEvent(Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;Z)V

    return-void
.end method

.method public logGovernmentIdStateEvent(Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdStateEventData;Z)V
    .locals 10
    .param p1    # Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdStateEventData;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryGovernmentIdStateEvent;

    invoke-static {}, Lcom/withpersona/sdk2/inquiry/tracking/a;->a()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->metadataProvider:Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;->collect()Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;

    move-result-object v7

    const/4 v8, 0x7

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v3, p1

    invoke-static/range {v3 .. v9}, Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdStateEventData;->copy$default(Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdStateEventData;Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureMethod;Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureSide;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;ILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdStateEventData;

    move-result-object p1

    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->nowToIso8601Utc()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, p1, v2}, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryGovernmentIdStateEvent;-><init>(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdStateEventData;Ljava/lang/String;)V

    invoke-direct {p0, v0, p2}, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->logEvent(Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;Z)V

    return-void
.end method

.method public logInquiryEndEvent(Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryEndReason;JLjava/lang/String;Z)V
    .locals 3
    .param p1    # Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryEndReason;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p5, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->metadataProvider:Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;

    invoke-virtual {p5}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;->collect()Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;

    move-result-object p5

    new-instance v0, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryEndEvent;

    invoke-static {}, Lcom/withpersona/sdk2/inquiry/tracking/a;->a()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryEndEventData;

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-direct {v2, p1, p2, p4, p5}, Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryEndEventData;-><init>(Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryEndReason;Ljava/lang/Long;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;)V

    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->nowToIso8601Utc()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, v2, p1}, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryEndEvent;-><init>(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryEndEventData;Ljava/lang/String;)V

    const/4 p1, 0x1

    invoke-direct {p0, v0, p1}, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->logEvent(Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;Z)V

    return-void
.end method

.method public logInquiryPageViewEvent(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->metadataProvider:Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;->collect()Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;

    move-result-object v0

    new-instance v1, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$PageViewTrackingEvent;

    invoke-static {}, Lcom/withpersona/sdk2/inquiry/tracking/a;->a()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingUiEvent;

    invoke-direct {v3, p2, p1, v0}, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingUiEvent;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;)V

    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->nowToIso8601Utc()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, v2, v3, p1}, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$PageViewTrackingEvent;-><init>(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingUiEvent;Ljava/lang/String;)V

    invoke-direct {p0, v1, p3}, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->logEvent(Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;Z)V

    return-void
.end method

.method public logInquiryStartEvent(Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryConfigData;Z)V
    .locals 24
    .param p1    # Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryConfigData;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    move-object/from16 v0, p0

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->metadataProvider:Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;->collect()Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;

    move-result-object v1

    new-instance v2, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryStartEvent;

    invoke-static {}, Lcom/withpersona/sdk2/inquiry/tracking/a;->a()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryStartEventData;

    iget-object v5, v0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->networkStateManager:Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager;

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager;->getOrganizationId()Ljava/lang/String;

    move-result-object v11

    const/16 v22, 0x7fef

    const/16 v23, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object/from16 v6, p1

    invoke-static/range {v6 .. v23}, Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryConfigData;->copy$default(Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryConfigData;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/UiFramework;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;ILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryConfigData;

    move-result-object v5

    invoke-direct {v4, v5, v1}, Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryStartEventData;-><init>(Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryConfigData;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;)V

    invoke-direct {v0}, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->nowToIso8601Utc()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v3, v4, v1}, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryStartEvent;-><init>(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryStartEventData;Ljava/lang/String;)V

    move/from16 v1, p2

    invoke-direct {v0, v2, v1}, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->logEvent(Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;Z)V

    return-void
.end method

.method public logIntegrationEvent(Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationEventData;Z)V
    .locals 9
    .param p1    # Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationEventData;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->metadataProvider:Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;->collect()Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;

    move-result-object v5

    new-instance v0, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryIntegrationEvent;

    invoke-static {}, Lcom/withpersona/sdk2/inquiry/tracking/a;->a()Ljava/lang/String;

    move-result-object v8

    const/4 v6, 0x7

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v7}, Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationEventData;->copy$default(Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationEventData;Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationState;Ljava/lang/String;Ljava/lang/Boolean;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;ILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationEventData;

    move-result-object p1

    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->nowToIso8601Utc()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v8, p1, v1}, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryIntegrationEvent;-><init>(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationEventData;Ljava/lang/String;)V

    invoke-direct {p0, v0, p2}, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->logEvent(Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;Z)V

    return-void
.end method

.method public logNfcErrorEvent(Lcom/withpersona/sdk2/inquiry/tracking/model/NfcErrorEventData;Z)V
    .locals 16
    .param p1    # Lcom/withpersona/sdk2/inquiry/tracking/model/NfcErrorEventData;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    move-object/from16 v0, p0

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryNfcErrorEvent;

    invoke-static {}, Lcom/withpersona/sdk2/inquiry/tracking/a;->a()Ljava/lang/String;

    move-result-object v2

    iget-object v3, v0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->metadataProvider:Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;->collect()Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;

    move-result-object v13

    const/16 v14, 0xff

    const/4 v15, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object/from16 v4, p1

    invoke-static/range {v4 .. v15}, Lcom/withpersona/sdk2/inquiry/tracking/model/NfcErrorEventData;->copy$default(Lcom/withpersona/sdk2/inquiry/tracking/model/NfcErrorEventData;Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/NfcErrorType;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;ILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/tracking/model/NfcErrorEventData;

    move-result-object v3

    invoke-direct {v0}, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->nowToIso8601Utc()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v2, v3, v4}, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryNfcErrorEvent;-><init>(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/NfcErrorEventData;Ljava/lang/String;)V

    move/from16 v2, p2

    invoke-direct {v0, v1, v2}, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->logEvent(Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;Z)V

    return-void
.end method

.method public logNfcScanEvent(Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanEventData;Z)V
    .locals 13
    .param p1    # Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanEventData;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryNfcScanEvent;

    invoke-static {}, Lcom/withpersona/sdk2/inquiry/tracking/a;->a()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->metadataProvider:Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;->collect()Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;

    move-result-object v10

    const/16 v11, 0x3f

    const/4 v12, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v3, p1

    invoke-static/range {v3 .. v12}, Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanEventData;->copy$default(Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanEventData;Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanStatus;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;ILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanEventData;

    move-result-object p1

    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->nowToIso8601Utc()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, p1, v2}, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryNfcScanEvent;-><init>(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanEventData;Ljava/lang/String;)V

    invoke-direct {p0, v0, p2}, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->logEvent(Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;Z)V

    return-void
.end method

.method public logPermissionEvent(Lcom/withpersona/sdk2/inquiry/tracking/model/PermissionTrackingEventData;Z)V
    .locals 9
    .param p1    # Lcom/withpersona/sdk2/inquiry/tracking/model/PermissionTrackingEventData;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryPermissionEvent;

    invoke-static {}, Lcom/withpersona/sdk2/inquiry/tracking/a;->a()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->metadataProvider:Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;->collect()Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;

    move-result-object v6

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v3, p1

    invoke-static/range {v3 .. v8}, Lcom/withpersona/sdk2/inquiry/tracking/model/PermissionTrackingEventData;->copy$default(Lcom/withpersona/sdk2/inquiry/tracking/model/PermissionTrackingEventData;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;ILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/tracking/model/PermissionTrackingEventData;

    move-result-object p1

    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->nowToIso8601Utc()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, p1, v2}, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryPermissionEvent;-><init>(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/PermissionTrackingEventData;Ljava/lang/String;)V

    invoke-direct {p0, v0, p2}, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->logEvent(Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;Z)V

    return-void
.end method

.method public logSelfieCaptureButtonClickedEvent(Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonEventData;Z)V
    .locals 5
    .param p1    # Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonEventData;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquirySelfieClickEvent;

    invoke-static {}, Lcom/withpersona/sdk2/inquiry/tracking/a;->a()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->metadataProvider:Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;->collect()Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-static {p1, v3, v2, v4, v3}, Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonEventData;->copy$default(Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonEventData;Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonType;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;ILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonEventData;

    move-result-object p1

    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->nowToIso8601Utc()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, p1, v2}, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquirySelfieClickEvent;-><init>(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonEventData;Ljava/lang/String;)V

    invoke-direct {p0, v0, p2}, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->logEvent(Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;Z)V

    return-void
.end method

.method public logSelfieCaptureStateEvent(Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureStateEventData;Z)V
    .locals 10
    .param p1    # Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureStateEventData;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquirySelfieCaptureStateEvent;

    invoke-static {}, Lcom/withpersona/sdk2/inquiry/tracking/a;->a()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->metadataProvider:Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;->collect()Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;

    move-result-object v7

    const/4 v8, 0x7

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v3, p1

    invoke-static/range {v3 .. v9}, Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureStateEventData;->copy$default(Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureStateEventData;Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureState;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/SelfiePoseType;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;ILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureStateEventData;

    move-result-object p1

    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->nowToIso8601Utc()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, p1, v2}, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquirySelfieCaptureStateEvent;-><init>(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureStateEventData;Ljava/lang/String;)V

    invoke-direct {p0, v0, p2}, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->logEvent(Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;Z)V

    return-void
.end method

.method public logSelfiePoseCaptureEvent(Lcom/withpersona/sdk2/inquiry/tracking/model/SelfiePoseEventData;Z)V
    .locals 9
    .param p1    # Lcom/withpersona/sdk2/inquiry/tracking/model/SelfiePoseEventData;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquirySelfiePoseEvent;

    invoke-static {}, Lcom/withpersona/sdk2/inquiry/tracking/a;->a()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->metadataProvider:Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;->collect()Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;

    move-result-object v6

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v3, p1

    invoke-static/range {v3 .. v8}, Lcom/withpersona/sdk2/inquiry/tracking/model/SelfiePoseEventData;->copy$default(Lcom/withpersona/sdk2/inquiry/tracking/model/SelfiePoseEventData;Lcom/withpersona/sdk2/inquiry/tracking/model/SelfiePoseType;Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureMethod;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;ILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/tracking/model/SelfiePoseEventData;

    move-result-object p1

    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->nowToIso8601Utc()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, p1, v2}, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquirySelfiePoseEvent;-><init>(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/SelfiePoseEventData;Ljava/lang/String;)V

    invoke-direct {p0, v0, p2}, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->logEvent(Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;Z)V

    return-void
.end method

.method public logSelfiePoseDetect(Lcom/withpersona/sdk2/inquiry/tracking/model/SelfiePoseDetectEventData;Z)V
    .locals 12
    .param p1    # Lcom/withpersona/sdk2/inquiry/tracking/model/SelfiePoseDetectEventData;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquirySelfiePoseDetectEvent;

    invoke-static {}, Lcom/withpersona/sdk2/inquiry/tracking/a;->a()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->metadataProvider:Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;->collect()Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;

    move-result-object v9

    const/16 v10, 0x1f

    const/4 v11, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v3, p1

    invoke-static/range {v3 .. v11}, Lcom/withpersona/sdk2/inquiry/tracking/model/SelfiePoseDetectEventData;->copy$default(Lcom/withpersona/sdk2/inquiry/tracking/model/SelfiePoseDetectEventData;Lcom/withpersona/sdk2/inquiry/tracking/model/SelfiePoseType;Lcom/withpersona/sdk2/inquiry/tracking/model/SelfiePoseType;FFFLcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;ILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/tracking/model/SelfiePoseDetectEventData;

    move-result-object p1

    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->nowToIso8601Utc()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, p1, v2}, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquirySelfiePoseDetectEvent;-><init>(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/SelfiePoseDetectEventData;Ljava/lang/String;)V

    invoke-direct {p0, v0, p2}, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->logEvent(Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;Z)V

    return-void
.end method

.method public logUiStepButtonEvent(Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 4
    .param p1    # Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->metadataProvider:Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;->collect()Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;

    move-result-object v0

    new-instance v1, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryUiStepButtonEvent;

    invoke-static {}, Lcom/withpersona/sdk2/inquiry/tracking/a;->a()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonEventData;

    invoke-direct {v3, p1, p2, p3, v0}, Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonEventData;-><init>(Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;)V

    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->nowToIso8601Utc()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, v2, v3, p1}, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryUiStepButtonEvent;-><init>(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonEventData;Ljava/lang/String;)V

    invoke-direct {p0, v1, p4}, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->logEvent(Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;Z)V

    return-void
.end method

.method public logVideoErrorEvent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 11
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->metadataProvider:Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;->collect()Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;

    move-result-object v7

    new-instance v0, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryVideoErrorEvent;

    invoke-static {}, Lcom/withpersona/sdk2/inquiry/tracking/a;->a()Ljava/lang/String;

    move-result-object v10

    new-instance v1, Lcom/withpersona/sdk2/inquiry/tracking/model/VideoErrorEventData;

    const/4 v8, 0x2

    const/4 v9, 0x0

    const/4 v3, 0x0

    move-object v2, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v9}, Lcom/withpersona/sdk2/inquiry/tracking/model/VideoErrorEventData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->nowToIso8601Utc()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v10, v1, p1}, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryVideoErrorEvent;-><init>(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/VideoErrorEventData;Ljava/lang/String;)V

    move/from16 p1, p5

    invoke-direct {p0, v0, p1}, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->logEvent(Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;Z)V

    return-void
.end method

.method public logVideoStartEvent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Z)V
    .locals 10
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->metadataProvider:Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;->collect()Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;

    move-result-object v6

    new-instance v0, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryVideoStartEvent;

    invoke-static {}, Lcom/withpersona/sdk2/inquiry/tracking/a;->a()Ljava/lang/String;

    move-result-object v9

    new-instance v1, Lcom/withpersona/sdk2/inquiry/tracking/model/VideoStartEventData;

    const/4 v7, 0x2

    const/4 v8, 0x0

    const/4 v3, 0x0

    move-object v2, p1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v1 .. v8}, Lcom/withpersona/sdk2/inquiry/tracking/model/VideoStartEventData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->nowToIso8601Utc()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v9, v1, p1}, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryVideoStartEvent;-><init>(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/VideoStartEventData;Ljava/lang/String;)V

    invoke-direct {p0, v0, p4}, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->logEvent(Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;Z)V

    return-void
.end method

.method public logVideoStopEvent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Z)V
    .locals 13
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p5    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p6    # Ljava/lang/Double;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->metadataProvider:Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;->collect()Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;

    move-result-object v9

    new-instance v0, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryVideoStopEvent;

    invoke-static {}, Lcom/withpersona/sdk2/inquiry/tracking/a;->a()Ljava/lang/String;

    move-result-object v12

    new-instance v1, Lcom/withpersona/sdk2/inquiry/tracking/model/VideoStopEventData;

    const/4 v10, 0x2

    const/4 v11, 0x0

    const/4 v3, 0x0

    move-object v2, p1

    move-object v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    invoke-direct/range {v1 .. v11}, Lcom/withpersona/sdk2/inquiry/tracking/model/VideoStopEventData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->nowToIso8601Utc()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v12, v1, p1}, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryVideoStopEvent;-><init>(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/VideoStopEventData;Ljava/lang/String;)V

    move/from16 p1, p7

    invoke-direct {p0, v0, p1}, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->logEvent(Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;Z)V

    return-void
.end method

.method public logVideoStopRequestEvent(Ljava/lang/String;Z)V
    .locals 9
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->metadataProvider:Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;->collect()Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;

    move-result-object v5

    new-instance v0, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryVideoStopRequestEvent;

    invoke-static {}, Lcom/withpersona/sdk2/inquiry/tracking/a;->a()Ljava/lang/String;

    move-result-object v8

    new-instance v1, Lcom/withpersona/sdk2/inquiry/tracking/model/VideoStopRequestEventData;

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v2, p1

    invoke-direct/range {v1 .. v7}, Lcom/withpersona/sdk2/inquiry/tracking/model/VideoStopRequestEventData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->nowToIso8601Utc()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v8, v1, p1}, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryVideoStopRequestEvent;-><init>(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/VideoStopRequestEventData;Ljava/lang/String;)V

    invoke-direct {p0, v0, p2}, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->logEvent(Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;Z)V

    return-void
.end method

.method public logWebRtcIceCompleteEvent(Ljava/lang/String;Ljava/lang/Integer;Z)V
    .locals 10
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->metadataProvider:Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;->collect()Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;

    move-result-object v6

    new-instance v0, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryVideoIceCompleteEvent;

    invoke-static {}, Lcom/withpersona/sdk2/inquiry/tracking/a;->a()Ljava/lang/String;

    move-result-object v9

    new-instance v1, Lcom/withpersona/sdk2/inquiry/tracking/model/VideoIceCompleteEventData;

    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v2, p1

    move-object v5, p2

    invoke-direct/range {v1 .. v8}, Lcom/withpersona/sdk2/inquiry/tracking/model/VideoIceCompleteEventData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->nowToIso8601Utc()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v9, v1, p1}, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryVideoIceCompleteEvent;-><init>(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/VideoIceCompleteEventData;Ljava/lang/String;)V

    invoke-direct {p0, v0, p3}, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->logEvent(Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;Z)V

    return-void
.end method

.method public setIsEnabled(Z)V
    .locals 1

    iget-boolean v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->isEnabled:Z

    if-ne v0, p1, :cond_0

    goto :goto_0

    :cond_0
    iput-boolean p1, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->isEnabled:Z

    iget-boolean p1, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->isEnabled:Z

    if-nez p1, :cond_1

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->cachedPublicKeyResponse:Lcom/withpersona/sdk2/inquiry/tracking/network/PublicKeyResponse;

    :cond_1
    :goto_0
    return-void
.end method

.method public setSessionToken(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->sessionToken:Ljava/lang/String;

    return-void
.end method

.method public setTrackingEventsUrl(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->trackingEventsUrl:Ljava/lang/String;

    :cond_0
    return-void
.end method
