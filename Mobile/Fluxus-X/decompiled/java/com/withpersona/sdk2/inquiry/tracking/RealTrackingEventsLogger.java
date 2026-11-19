package com.withpersona.sdk2.inquiry.tracking;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import av.k;
import av.p0;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.withpersona.sdk2.inquiry.network.core.NetworkStateManager;
import com.withpersona.sdk2.inquiry.tracking.model.CameraInfoEventData;
import com.withpersona.sdk2.inquiry.tracking.model.DebugLogEventData;
import com.withpersona.sdk2.inquiry.tracking.model.GovernmentIdButtonEventData;
import com.withpersona.sdk2.inquiry.tracking.model.GovernmentIdStateEventData;
import com.withpersona.sdk2.inquiry.tracking.model.InquiryConfigData;
import com.withpersona.sdk2.inquiry.tracking.model.InquiryEndEventData;
import com.withpersona.sdk2.inquiry.tracking.model.InquiryEndReason;
import com.withpersona.sdk2.inquiry.tracking.model.InquiryStartEventData;
import com.withpersona.sdk2.inquiry.tracking.model.IntegrationEventData;
import com.withpersona.sdk2.inquiry.tracking.model.NfcErrorEventData;
import com.withpersona.sdk2.inquiry.tracking.model.NfcScanEventData;
import com.withpersona.sdk2.inquiry.tracking.model.PermissionTrackingEventData;
import com.withpersona.sdk2.inquiry.tracking.model.SelfieCaptureButtonEventData;
import com.withpersona.sdk2.inquiry.tracking.model.SelfieCaptureStateEventData;
import com.withpersona.sdk2.inquiry.tracking.model.SelfiePoseDetectEventData;
import com.withpersona.sdk2.inquiry.tracking.model.SelfiePoseEventData;
import com.withpersona.sdk2.inquiry.tracking.model.TrackingEvent;
import com.withpersona.sdk2.inquiry.tracking.model.TrackingUiEvent;
import com.withpersona.sdk2.inquiry.tracking.model.UiStepButtonEventData;
import com.withpersona.sdk2.inquiry.tracking.model.UiStepButtonType;
import com.withpersona.sdk2.inquiry.tracking.model.VideoErrorEventData;
import com.withpersona.sdk2.inquiry.tracking.model.VideoIceCompleteEventData;
import com.withpersona.sdk2.inquiry.tracking.model.VideoStartEventData;
import com.withpersona.sdk2.inquiry.tracking.model.VideoStopEventData;
import com.withpersona.sdk2.inquiry.tracking.model.VideoStopRequestEventData;
import com.withpersona.sdk2.inquiry.tracking.network.EncryptedTrackingEventsRequest;
import com.withpersona.sdk2.inquiry.tracking.network.PublicKeyResponse;
import com.withpersona.sdk2.inquiry.tracking.network.TrackingEventsService;
import com.withpersona.sdk2.inquiry.tracking.network.TrackingEventsServiceComponentManager;
import er.c;
import gu.d;
import gu.f;
import gu.l;
import gu.m;
import hn.a0;
import hn.h;
import hn.w;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import lu.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Pair;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import to.e;
import y5.j;
import y5.x;
import y5.z;
import zt.n;
import zt.o;
import zt.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 \u0094\u00012\u00020\u0001:\u0006\u0095\u0001\u0094\u0001\u0096\u0001BS\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u001dH\u0082@¢\u0006\u0004\b \u0010\u0018J\u000f\u0010!\u001a\u00020\u000eH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\u000eH\u0016¢\u0006\u0004\b$\u0010%J\u0019\u0010'\u001a\u00020\u001d2\b\u0010&\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b'\u0010%J\u0017\u0010)\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020\u001bH\u0016¢\u0006\u0004\b)\u0010*J)\u0010-\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020\u000e2\b\u0010,\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b-\u0010.J+\u0010/\u001a\u00020\u001d2\b\u0010+\u001a\u0004\u0018\u00010\u000e2\b\u0010,\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b/\u0010.J+\u00100\u001a\u00020\u001d2\b\u0010+\u001a\u0004\u0018\u00010\u000e2\b\u0010,\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b0\u0010.J+\u00103\u001a\u00020\u001d2\b\u0010+\u001a\u0004\u0018\u00010\u000e2\b\u00102\u001a\u0004\u0018\u0001012\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b3\u00104J3\u00107\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020\u000e2\b\u00105\u001a\u0004\u0018\u00010\u000e2\b\u00106\u001a\u0004\u0018\u0001012\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b7\u00108JQ\u0010>\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020\u000e2\b\u00105\u001a\u0004\u0018\u00010\u000e2\b\u00109\u001a\u0004\u0018\u00010\u000e2\b\u0010:\u001a\u0004\u0018\u0001012\b\u0010;\u001a\u0004\u0018\u0001012\b\u0010=\u001a\u0004\u0018\u00010<2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b>\u0010?J\u001f\u0010@\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b@\u0010AJ=\u0010D\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020\u000e2\b\u00105\u001a\u0004\u0018\u00010\u000e2\b\u0010B\u001a\u0004\u0018\u00010\u000e2\b\u0010C\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\bD\u0010EJ\u001f\u0010H\u001a\u00020\u001d2\u0006\u0010G\u001a\u00020F2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\bH\u0010IJ\u001f\u0010L\u001a\u00020\u001d2\u0006\u0010K\u001a\u00020J2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\bL\u0010MJ\u001f\u0010O\u001a\u00020\u001d2\u0006\u0010K\u001a\u00020N2\u0006\u0010\u001c\u001a\u00020\u001bH\u0017¢\u0006\u0004\bO\u0010PJ\u001f\u0010R\u001a\u00020\u001d2\u0006\u0010K\u001a\u00020Q2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\bR\u0010SJ\u001f\u0010U\u001a\u00020\u001d2\u0006\u0010K\u001a\u00020T2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\bU\u0010VJ\u001f\u0010X\u001a\u00020\u001d2\u0006\u0010K\u001a\u00020W2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\bX\u0010YJ\u001f\u0010\\\u001a\u00020\u001d2\u0006\u0010[\u001a\u00020Z2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\\\u0010]J1\u0010c\u001a\u00020\u001d2\u0006\u0010_\u001a\u00020^2\u0006\u0010a\u001a\u00020`2\b\u0010b\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\bc\u0010dJ\u001f\u0010f\u001a\u00020\u001d2\u0006\u0010K\u001a\u00020e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\bf\u0010gJ3\u0010k\u001a\u00020\u001d2\u0006\u0010i\u001a\u00020h2\b\u0010j\u001a\u0004\u0018\u00010\u000e2\b\u0010+\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\bk\u0010lJ\u001f\u0010n\u001a\u00020\u001d2\u0006\u0010K\u001a\u00020m2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\bn\u0010oJ\u001f\u0010q\u001a\u00020\u001d2\u0006\u0010K\u001a\u00020p2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\bq\u0010rJ\u001f\u0010t\u001a\u00020\u001d2\u0006\u0010K\u001a\u00020s2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\bt\u0010uJ-\u0010y\u001a\u00020\u001d2\u0006\u0010v\u001a\u00020\u000e2\f\u0010x\u001a\b\u0012\u0004\u0012\u00020\u000e0w2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\by\u0010zJ\u001f\u0010|\u001a\u00020\u001d2\u0006\u0010K\u001a\u00020{2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b|\u0010}R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010~R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u007fR\u0015\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0007\u0010\u0080\u0001R\u0015\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\t\u0010\u0081\u0001R\u0015\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000b\u0010\u0082\u0001R\u0015\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\r\u0010\u0083\u0001R\u0015\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000f\u0010\u0084\u0001R\u0015\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0011\u0010\u0085\u0001R\u0015\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0013\u0010\u0086\u0001R\u0018\u0010\u0088\u0001\u001a\u00030\u0087\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0018\u0010\u008b\u0001\u001a\u00030\u008a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0017\u0010\u008d\u0001\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u0084\u0001R\u0019\u0010#\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b#\u0010\u0084\u0001R\u0017\u0010&\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b&\u0010\u0084\u0001R\u0019\u0010\u008e\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u001b\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0017\u0010\u0092\u0001\u001a\u00020\u001b8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001¨\u0006\u0097\u0001"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "Landroid/content/Context;", "context", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;", "cache", "Lhn/w;", "moshi", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;", "metadataProvider", "Ler/c;", "sdkFilesManager", "Lto/e;", "featureFlagManager", com.github.luben.zstd.BuildConfig.FLAVOR, "trackingEventServerEndpoint", "Lav/p0;", "coroutineScope", "Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager;", "networkStateManager", "<init>", "(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;Lhn/w;Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;Ler/c;Lto/e;Ljava/lang/String;Lav/p0;Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager;)V", "Lcom/withpersona/sdk2/inquiry/tracking/network/PublicKeyResponse;", "fetchPublicKey", "(Leu/b;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;", "event", com.github.luben.zstd.BuildConfig.FLAVOR, "force", com.github.luben.zstd.BuildConfig.FLAVOR, "logEvent", "(Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;Z)V", "flush", "nowToIso8601Utc", "()Ljava/lang/String;", "sessionToken", "setSessionToken", "(Ljava/lang/String;)V", "trackingEventsUrl", "setTrackingEventsUrl", "enabled", "setIsEnabled", "(Z)V", "stepName", "pageName", "logInquiryPageViewEvent", "(Ljava/lang/String;Ljava/lang/String;Z)V", "logForegroundEvent", "logBackgroundEvent", com.github.luben.zstd.BuildConfig.FLAVOR, "numCandidates", "logWebRtcIceCompleteEvent", "(Ljava/lang/String;Ljava/lang/Integer;Z)V", "videoCaptureMethod", "attempt", "logVideoStartEvent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Z)V", "assetId", "elapsedTime", "chunksLength", com.github.luben.zstd.BuildConfig.FLAVOR, "blobSize", "logVideoStopEvent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Z)V", "logVideoStopRequestEvent", "(Ljava/lang/String;Z)V", "errorName", "errorReason", "logVideoErrorEvent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "Lcom/withpersona/sdk2/inquiry/tracking/model/PermissionTrackingEventData;", "permissionData", "logPermissionEvent", "(Lcom/withpersona/sdk2/inquiry/tracking/model/PermissionTrackingEventData;Z)V", "Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonEventData;", "data", "logSelfieCaptureButtonClickedEvent", "(Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonEventData;Z)V", "Lcom/withpersona/sdk2/inquiry/tracking/model/SelfiePoseEventData;", "logSelfiePoseCaptureEvent", "(Lcom/withpersona/sdk2/inquiry/tracking/model/SelfiePoseEventData;Z)V", "Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureStateEventData;", "logSelfieCaptureStateEvent", "(Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureStateEventData;Z)V", "Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdButtonEventData;", "logGovernmentIdButtonClickEvent", "(Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdButtonEventData;Z)V", "Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdStateEventData;", "logGovernmentIdStateEvent", "(Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdStateEventData;Z)V", "Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryConfigData;", "config", "logInquiryStartEvent", "(Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryConfigData;Z)V", "Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryEndReason;", "reason", com.github.luben.zstd.BuildConfig.FLAVOR, "durationMs", "errorDescription", "logInquiryEndEvent", "(Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryEndReason;JLjava/lang/String;Z)V", "Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationEventData;", "logIntegrationEvent", "(Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationEventData;Z)V", "Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;", Payload.TYPE, "buttonName", "logUiStepButtonEvent", "(Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;Ljava/lang/String;Ljava/lang/String;Z)V", "Lcom/withpersona/sdk2/inquiry/tracking/model/CameraInfoEventData;", "logCameraInfoEvent", "(Lcom/withpersona/sdk2/inquiry/tracking/model/CameraInfoEventData;Z)V", "Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanEventData;", "logNfcScanEvent", "(Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanEventData;Z)V", "Lcom/withpersona/sdk2/inquiry/tracking/model/NfcErrorEventData;", "logNfcErrorEvent", "(Lcom/withpersona/sdk2/inquiry/tracking/model/NfcErrorEventData;Z)V", "category", "Lkotlin/Function0;", "message", "logDebugLogEvent", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Z)V", "Lcom/withpersona/sdk2/inquiry/tracking/model/SelfiePoseDetectEventData;", "logSelfiePoseDetect", "(Lcom/withpersona/sdk2/inquiry/tracking/model/SelfiePoseDetectEventData;Z)V", "Landroid/content/Context;", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;", "Lhn/w;", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;", "Ler/c;", "Lto/e;", "Ljava/lang/String;", "Lav/p0;", "Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager;", "Ly5/p0;", "workManager", "Ly5/p0;", "Ljava/text/SimpleDateFormat;", "iso8601Formatter", "Ljava/text/SimpleDateFormat;", "id", "isEnabled", "Z", "cachedPublicKeyResponse", "Lcom/withpersona/sdk2/inquiry/tracking/network/PublicKeyResponse;", "isDebugMode", "()Z", "Companion", "Factory", "TrackingEventsWorker", "tracking-events_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RealTrackingEventsLogger implements TrackingEventsLogger {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int DEFAULT_MEMORY_THRESHOLD = 10;

    @NotNull
    public static final String KEY_ENCRYPTED_REQUEST_FILE = "encrypted_request_file";

    @NotNull
    public static final String KEY_FLUSH_TOKEN = "flush_token";

    @NotNull
    public static final String KEY_SERVER_ENDPOINT = "server_endpoint";

    @NotNull
    public static final String KEY_SESSION_TOKEN = "session_token";

    @NotNull
    public static final String WORK_NAME_PREFIX = "tracking_events_work_";

    @Nullable
    private static h<List<TrackingEvent>> trackingEventsJsonAdapter;

    @NotNull
    private final TrackingEventsCache cache;

    @Nullable
    private volatile PublicKeyResponse cachedPublicKeyResponse;

    @NotNull
    private final Context context;

    @NotNull
    private final p0 coroutineScope;

    @NotNull
    private final e featureFlagManager;

    @NotNull
    private final String id;
    private volatile boolean isEnabled;

    @NotNull
    private final SimpleDateFormat iso8601Formatter;

    @NotNull
    private final TrackingMetadataProvider metadataProvider;

    @NotNull
    private final w moshi;

    @NotNull
    private final NetworkStateManager networkStateManager;

    @NotNull
    private final c sdkFilesManager;

    @Nullable
    private volatile String sessionToken;

    @NotNull
    private final String trackingEventServerEndpoint;

    @NotNull
    private volatile String trackingEventsUrl;

    @NotNull
    private final y5.p0 workManager;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0082@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000fR$\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$Companion;", com.github.luben.zstd.BuildConfig.FLAVOR, "<init>", "()V", com.github.luben.zstd.BuildConfig.FLAVOR, "json", "Lcom/withpersona/sdk2/inquiry/tracking/network/PublicKeyResponse;", "publicKeyResponse", "Lcom/withpersona/sdk2/inquiry/tracking/network/EncryptedTrackingEventsRequest;", "createTrackingEventsRequest", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/network/PublicKeyResponse;Leu/b;)Ljava/lang/Object;", com.github.luben.zstd.BuildConfig.FLAVOR, "DEFAULT_MEMORY_THRESHOLD", "I", "KEY_SESSION_TOKEN", "Ljava/lang/String;", "KEY_SERVER_ENDPOINT", "KEY_ENCRYPTED_REQUEST_FILE", "KEY_FLUSH_TOKEN", "WORK_NAME_PREFIX", "Lhn/h;", com.github.luben.zstd.BuildConfig.FLAVOR, "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;", "trackingEventsJsonAdapter", "Lhn/h;", "tracking-events_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00b3, code lost:
        
            if (r10 == r1) goto L32;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object createTrackingEventsRequest(String str, PublicKeyResponse publicKeyResponse, eu.b<? super EncryptedTrackingEventsRequest> bVar) {
            RealTrackingEventsLogger$Companion$createTrackingEventsRequest$1 realTrackingEventsLogger$Companion$createTrackingEventsRequest$1;
            String str2;
            String str3;
            if (bVar instanceof RealTrackingEventsLogger$Companion$createTrackingEventsRequest$1) {
                realTrackingEventsLogger$Companion$createTrackingEventsRequest$1 = (RealTrackingEventsLogger$Companion$createTrackingEventsRequest$1) bVar;
                int i10 = realTrackingEventsLogger$Companion$createTrackingEventsRequest$1.label;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    realTrackingEventsLogger$Companion$createTrackingEventsRequest$1.label = i10 - Integer.MIN_VALUE;
                } else {
                    realTrackingEventsLogger$Companion$createTrackingEventsRequest$1 = new RealTrackingEventsLogger$Companion$createTrackingEventsRequest$1(this, bVar);
                }
            } else {
                realTrackingEventsLogger$Companion$createTrackingEventsRequest$1 = new RealTrackingEventsLogger$Companion$createTrackingEventsRequest$1(this, bVar);
            }
            Object objObfuscatePayload = realTrackingEventsLogger$Companion$createTrackingEventsRequest$1.result;
            Object objE = fu.c.e();
            int i11 = realTrackingEventsLogger$Companion$createTrackingEventsRequest$1.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    publicKeyResponse = (PublicKeyResponse) realTrackingEventsLogger$Companion$createTrackingEventsRequest$1.L$1;
                    o.b(objObfuscatePayload);
                    ObfuscationResult obfuscationResult = (ObfuscationResult) objObfuscatePayload;
                    return new EncryptedTrackingEventsRequest(publicKeyResponse.getVersion(), obfuscationResult.getEncryptedKey(), obfuscationResult.getEncryptedPayload());
                }
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = (String) realTrackingEventsLogger$Companion$createTrackingEventsRequest$1.L$5;
                str3 = (String) realTrackingEventsLogger$Companion$createTrackingEventsRequest$1.L$4;
                o.b(objObfuscatePayload);
                return new EncryptedTrackingEventsRequest(str3, str2, (String) objObfuscatePayload);
            }
            o.b(objObfuscatePayload);
            String str4 = "{\"events\": " + str + "}";
            h hVar = RealTrackingEventsLogger.trackingEventsJsonAdapter;
            List list = hVar != null ? (List) hVar.fromJson(str) : null;
            if (list == null || list.isEmpty()) {
                return null;
            }
            if (publicKeyResponse != null) {
                String publicKey = publicKeyResponse.getPublicKey();
                realTrackingEventsLogger$Companion$createTrackingEventsRequest$1.L$0 = l.a(str);
                realTrackingEventsLogger$Companion$createTrackingEventsRequest$1.L$1 = publicKeyResponse;
                realTrackingEventsLogger$Companion$createTrackingEventsRequest$1.L$2 = l.a(str4);
                realTrackingEventsLogger$Companion$createTrackingEventsRequest$1.L$3 = l.a(list);
                realTrackingEventsLogger$Companion$createTrackingEventsRequest$1.label = 1;
                objObfuscatePayload = TrackingEventUtilsKt.obfuscatePayload(str4, publicKey, realTrackingEventsLogger$Companion$createTrackingEventsRequest$1);
            } else {
                realTrackingEventsLogger$Companion$createTrackingEventsRequest$1.L$0 = l.a(str);
                realTrackingEventsLogger$Companion$createTrackingEventsRequest$1.L$1 = l.a(publicKeyResponse);
                realTrackingEventsLogger$Companion$createTrackingEventsRequest$1.L$2 = l.a(str4);
                realTrackingEventsLogger$Companion$createTrackingEventsRequest$1.L$3 = l.a(list);
                str2 = com.github.luben.zstd.BuildConfig.FLAVOR;
                realTrackingEventsLogger$Companion$createTrackingEventsRequest$1.L$4 = com.github.luben.zstd.BuildConfig.FLAVOR;
                realTrackingEventsLogger$Companion$createTrackingEventsRequest$1.L$5 = com.github.luben.zstd.BuildConfig.FLAVOR;
                realTrackingEventsLogger$Companion$createTrackingEventsRequest$1.label = 2;
                objObfuscatePayload = TrackingEventUtilsKt.obfuscatePayload(str4, realTrackingEventsLogger$Companion$createTrackingEventsRequest$1);
                if (objObfuscatePayload != objE) {
                    str3 = com.github.luben.zstd.BuildConfig.FLAVOR;
                    return new EncryptedTrackingEventsRequest(str3, str2, (String) objObfuscatePayload);
                }
            }
            return objE;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$Factory;", com.github.luben.zstd.BuildConfig.FLAVOR, "create", "Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;", "trackingEventServerEndpoint", com.github.luben.zstd.BuildConfig.FLAVOR, "tracking-events_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Factory {
        @NotNull
        RealTrackingEventsLogger create(@NotNull String trackingEventServerEndpoint);
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/c$a;", "doWork", "(Leu/b;)Ljava/lang/Object;", "Landroid/content/Context;", "tracking-events_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TrackingEventsWorker extends CoroutineWorker {

        @NotNull
        private final Context context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TrackingEventsWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters) {
            super(context, workerParameters);
            context.getClass();
            workerParameters.getClass();
            this.context = context;
        }

        /* JADX WARN: Code duplicated, block: B:107:0x02f0 A[Catch: Exception -> 0x00ab, all -> 0x0398, TryCatch #6 {Exception -> 0x00ab, blocks: (B:18:0x00a0, B:105:0x02ea, B:107:0x02f0, B:113:0x033c, B:108:0x02ff, B:111:0x031e, B:112:0x0334), top: B:180:0x00a0 }] */
        /* JADX WARN: Code duplicated, block: B:108:0x02ff A[Catch: Exception -> 0x00ab, all -> 0x0398, TryCatch #6 {Exception -> 0x00ab, blocks: (B:18:0x00a0, B:105:0x02ea, B:107:0x02f0, B:113:0x033c, B:108:0x02ff, B:111:0x031e, B:112:0x0334), top: B:180:0x00a0 }] */
        /* JADX WARN: Code duplicated, block: B:111:0x031e A[Catch: Exception -> 0x00ab, all -> 0x0398, LOOP:1: B:109:0x031b->B:111:0x031e, LOOP_END, TryCatch #6 {Exception -> 0x00ab, blocks: (B:18:0x00a0, B:105:0x02ea, B:107:0x02f0, B:113:0x033c, B:108:0x02ff, B:111:0x031e, B:112:0x0334), top: B:180:0x00a0 }] */
        /* JADX WARN: Code duplicated, block: B:115:0x0341  */
        /* JADX WARN: Code duplicated, block: B:120:0x0354  */
        /* JADX WARN: Code duplicated, block: B:121:0x0356  */
        /* JADX WARN: Code duplicated, block: B:144:0x03bf  */
        /* JADX WARN: Code duplicated, block: B:147:0x03da A[Catch: all -> 0x0398, LOOP:0: B:146:0x03d8->B:147:0x03da, LOOP_END, TryCatch #8 {all -> 0x0398, blocks: (B:18:0x00a0, B:105:0x02ea, B:107:0x02f0, B:113:0x033c, B:108:0x02ff, B:111:0x031e, B:112:0x0334, B:142:0x03b9, B:145:0x03c1, B:147:0x03da, B:148:0x03ec), top: B:180:0x00a0 }] */
        /* JADX WARN: Code duplicated, block: B:150:0x03f9  */
        /* JADX WARN: Code duplicated, block: B:152:0x0402  */
        /* JADX WARN: Code duplicated, block: B:155:0x040c  */
        /* JADX WARN: Code duplicated, block: B:156:0x040e  */
        /* JADX WARN: Code duplicated, block: B:163:0x0443  */
        /* JADX WARN: Code duplicated, block: B:165:0x044c  */
        /* JADX WARN: Code duplicated, block: B:168:0x0456  */
        /* JADX WARN: Code duplicated, block: B:169:0x0458  */
        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Code restructure failed: missing block: B:123:0x0393, code lost:
        
            if (r1.onFlushFinished(r9, r5, r2) == r3) goto L189;
         */
        /* JADX WARN: Code restructure failed: missing block: B:171:0x047a, code lost:
        
            if (r1.onFlushFinished(r4, r5, r2) == r3) goto L172;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x016e, code lost:
        
            if (r2 == r3) goto L189;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x01ab, code lost:
        
            if (r2 == r3) goto L189;
         */
        /* JADX WARN: Code restructure failed: missing block: B:71:0x01e8, code lost:
        
            if (r2 == r3) goto L189;
         */
        /* JADX WARN: Code restructure failed: missing block: B:81:0x0233, code lost:
        
            if (r2 == r3) goto L177;
         */
        /* JADX WARN: Code restructure failed: missing block: B:98:0x02a7, code lost:
        
            if (r2 == r3) goto L177;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v20, types: [com.withpersona.sdk2.inquiry.tracking.network.TrackingEventsService] */
        /* JADX WARN: Type inference failed for: r19v1 */
        /* JADX WARN: Type inference failed for: r1v15, types: [com.withpersona.sdk2.inquiry.tracking.TrackingEventsCache] */
        /* JADX WARN: Type inference failed for: r1v2, types: [com.withpersona.sdk2.inquiry.tracking.TrackingEventsCache] */
        /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v2, types: [com.withpersona.sdk2.inquiry.tracking.RealTrackingEventsLogger$TrackingEventsWorker$doWork$1, eu.b] */
        /* JADX WARN: Type inference failed for: r2v23 */
        /* JADX WARN: Type inference failed for: r2v24, types: [com.withpersona.sdk2.inquiry.tracking.RealTrackingEventsLogger$TrackingEventsWorker$doWork$1, eu.b] */
        /* JADX WARN: Type inference failed for: r2v25 */
        /* JADX WARN: Type inference failed for: r2v26 */
        /* JADX WARN: Type inference failed for: r2v27 */
        /* JADX WARN: Type inference failed for: r2v28, types: [com.withpersona.sdk2.inquiry.tracking.RealTrackingEventsLogger$TrackingEventsWorker$doWork$1, eu.b] */
        /* JADX WARN: Type inference failed for: r2v29 */
        /* JADX WARN: Type inference failed for: r2v3 */
        /* JADX WARN: Type inference failed for: r2v30 */
        /* JADX WARN: Type inference failed for: r2v4 */
        /* JADX WARN: Type inference failed for: r2v40 */
        /* JADX WARN: Type inference failed for: r2v41 */
        /* JADX WARN: Type inference failed for: r2v42 */
        /* JADX WARN: Type inference failed for: r2v43 */
        /* JADX WARN: Type inference failed for: r2v44 */
        /* JADX WARN: Type inference failed for: r2v45 */
        /* JADX WARN: Type inference failed for: r2v46 */
        /* JADX WARN: Type inference failed for: r2v47 */
        /* JADX WARN: Type inference failed for: r2v48 */
        /* JADX WARN: Type inference failed for: r2v49 */
        /* JADX WARN: Type inference failed for: r2v50 */
        /* JADX WARN: Type inference failed for: r2v6 */
        /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r4v1 */
        /* JADX WARN: Type inference failed for: r4v34 */
        /* JADX WARN: Type inference failed for: r4v36, types: [java.lang.Object, java.lang.String] */
        /* JADX WARN: Type inference failed for: r4v37 */
        /* JADX WARN: Type inference failed for: r4v38 */
        /* JADX WARN: Type inference failed for: r4v39 */
        /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.lang.String] */
        /* JADX WARN: Type inference failed for: r4v41 */
        /* JADX WARN: Type inference failed for: r4v43 */
        /* JADX WARN: Type inference failed for: r4v45 */
        /* JADX WARN: Type inference failed for: r4v67 */
        /* JADX WARN: Type inference failed for: r4v68 */
        /* JADX WARN: Type inference failed for: r4v69 */
        /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r5v1 */
        /* JADX WARN: Type inference failed for: r5v11, types: [com.withpersona.sdk2.inquiry.tracking.TrackingEventsCache] */
        /* JADX WARN: Type inference failed for: r5v13, types: [com.withpersona.sdk2.inquiry.tracking.TrackingEventsCache] */
        /* JADX WARN: Type inference failed for: r5v17, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r5v2 */
        /* JADX WARN: Type inference failed for: r5v21 */
        /* JADX WARN: Type inference failed for: r5v22 */
        /* JADX WARN: Type inference failed for: r5v23 */
        /* JADX WARN: Type inference failed for: r5v24, types: [boolean] */
        /* JADX WARN: Type inference failed for: r5v25 */
        /* JADX WARN: Type inference failed for: r5v27 */
        /* JADX WARN: Type inference failed for: r5v28 */
        /* JADX WARN: Type inference failed for: r5v29 */
        /* JADX WARN: Type inference failed for: r5v30 */
        /* JADX WARN: Type inference failed for: r5v31 */
        /* JADX WARN: Type inference failed for: r5v4, types: [com.withpersona.sdk2.inquiry.tracking.TrackingEventsCache] */
        /* JADX WARN: Type inference failed for: r5v5 */
        /* JADX WARN: Type inference failed for: r5v7, types: [com.withpersona.sdk2.inquiry.tracking.TrackingEventsCache] */
        /* JADX WARN: Type inference failed for: r5v9, types: [com.withpersona.sdk2.inquiry.tracking.TrackingEventsCache] */
        /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r6v1 */
        /* JADX WARN: Type inference failed for: r6v10 */
        /* JADX WARN: Type inference failed for: r6v11 */
        /* JADX WARN: Type inference failed for: r6v17 */
        /* JADX WARN: Type inference failed for: r6v2 */
        /* JADX WARN: Type inference failed for: r6v21 */
        /* JADX WARN: Type inference failed for: r6v24 */
        /* JADX WARN: Type inference failed for: r6v25, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v29, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v34, types: [com.withpersona.sdk2.inquiry.tracking.TrackingEventsCache] */
        /* JADX WARN: Type inference failed for: r6v37 */
        /* JADX WARN: Type inference failed for: r6v38 */
        /* JADX WARN: Type inference failed for: r6v46, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v47 */
        /* JADX WARN: Type inference failed for: r6v48 */
        /* JADX WARN: Type inference failed for: r6v49 */
        /* JADX WARN: Type inference failed for: r9v0 */
        /* JADX WARN: Type inference failed for: r9v18 */
        /* JADX WARN: Type inference failed for: r9v19 */
        /* JADX WARN: Type inference failed for: r9v21 */
        /* JADX WARN: Type inference failed for: r9v24, types: [java.lang.Object, java.lang.String] */
        /* JADX WARN: Type inference failed for: r9v25 */
        /* JADX WARN: Type inference failed for: r9v26, types: [java.lang.Object, java.lang.String] */
        /* JADX WARN: Type inference failed for: r9v28, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r9v29 */
        /* JADX WARN: Type inference failed for: r9v3 */
        @Override // androidx.work.CoroutineWorker
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object doWork(@NotNull eu.b<? super androidx.work.c.a> bVar) throws Throwable {
            ?? OnFlushFinished;
            ?? G;
            int i10;
            File file;
            ?? r10;
            String strG;
            String strG2;
            String strG3;
            int i11;
            int i12;
            h hVarC;
            EncryptedTrackingEventsRequest encryptedTrackingEventsRequest;
            Object objM67sendEvents0E7RQCE$tracking_events_release;
            ?? r11;
            ?? r12;
            boolean z10;
            String message;
            Pair[] pairArr;
            androidx.work.b.a aVar;
            int i13;
            androidx.work.b bVarA;
            androidx.work.c.a aVarB;
            ?? companion;
            boolean z11;
            Throwable thE;
            Pair[] pairArr2;
            androidx.work.b.a aVar2;
            int i14;
            androidx.work.c.a aVarB2;
            if (bVar instanceof RealTrackingEventsLogger$TrackingEventsWorker$doWork$1) {
                RealTrackingEventsLogger$TrackingEventsWorker$doWork$1 realTrackingEventsLogger$TrackingEventsWorker$doWork$1 = (RealTrackingEventsLogger$TrackingEventsWorker$doWork$1) bVar;
                int i15 = realTrackingEventsLogger$TrackingEventsWorker$doWork$1.label;
                if ((i15 & Integer.MIN_VALUE) != 0) {
                    realTrackingEventsLogger$TrackingEventsWorker$doWork$1.label = i15 - Integer.MIN_VALUE;
                    OnFlushFinished = realTrackingEventsLogger$TrackingEventsWorker$doWork$1;
                } else {
                    OnFlushFinished = new RealTrackingEventsLogger$TrackingEventsWorker$doWork$1(this, bVar);
                }
            } else {
                OnFlushFinished = new RealTrackingEventsLogger$TrackingEventsWorker$doWork$1(this, bVar);
            }
            Object obj = OnFlushFinished.result;
            Object objE = fu.c.e();
            ?? companion2 = "error_stacktrace";
            ?? A = "error_message";
            switch (OnFlushFinished.label) {
                case 0:
                    o.b(obj);
                    try {
                        G = getInputData().g(RealTrackingEventsLogger.KEY_FLUSH_TOKEN);
                        if (G == 0) {
                            androidx.work.c.a aVarA = androidx.work.c.a.a();
                            aVarA.getClass();
                            return aVarA;
                        }
                        try {
                            strG = getInputData().g(RealTrackingEventsLogger.KEY_SESSION_TOKEN);
                            if (strG == null) {
                                androidx.work.c.a aVarA2 = androidx.work.c.a.a();
                                aVarA2.getClass();
                                companion2 = TrackingEventsCache.INSTANCE.getInstance();
                                if (companion2 != 0) {
                                    A = l.a(G);
                                    OnFlushFinished.L$0 = A;
                                    OnFlushFinished.L$1 = aVarA2;
                                    OnFlushFinished.I$0 = 0;
                                    OnFlushFinished.label = 2;
                                    OnFlushFinished = companion2.onFlushFinished(G, false, OnFlushFinished);
                                    break;
                                }
                                return aVarA2;
                            }
                            strG2 = getInputData().g(RealTrackingEventsLogger.KEY_SERVER_ENDPOINT);
                            if (strG2 == null) {
                                androidx.work.c.a aVarA3 = androidx.work.c.a.a();
                                aVarA3.getClass();
                                companion2 = TrackingEventsCache.INSTANCE.getInstance();
                                if (companion2 != 0) {
                                    OnFlushFinished.L$0 = l.a(G);
                                    OnFlushFinished.L$1 = l.a(strG);
                                    OnFlushFinished.L$2 = aVarA3;
                                    OnFlushFinished.I$0 = 0;
                                    A = 3;
                                    OnFlushFinished.label = 3;
                                    OnFlushFinished = companion2.onFlushFinished(G, false, OnFlushFinished);
                                    break;
                                }
                                return aVarA3;
                            }
                            strG3 = getInputData().g(RealTrackingEventsLogger.KEY_ENCRYPTED_REQUEST_FILE);
                            if (strG3 == null) {
                                androidx.work.c.a aVarA4 = androidx.work.c.a.a();
                                aVarA4.getClass();
                                companion2 = TrackingEventsCache.INSTANCE.getInstance();
                                if (companion2 != 0) {
                                    OnFlushFinished.L$0 = l.a(G);
                                    OnFlushFinished.L$1 = l.a(strG);
                                    OnFlushFinished.L$2 = l.a(strG2);
                                    OnFlushFinished.L$3 = aVarA4;
                                    OnFlushFinished.I$0 = 0;
                                    A = 4;
                                    OnFlushFinished.label = 4;
                                    OnFlushFinished = companion2.onFlushFinished(G, false, OnFlushFinished);
                                    break;
                                }
                                return aVarA4;
                            }
                            file = new File(strG3);
                            try {
                                try {
                                    try {
                                        if (!file.exists()) {
                                            androidx.work.c.a aVarA5 = androidx.work.c.a.a();
                                            aVarA5.getClass();
                                            file.delete();
                                            ?? companion3 = TrackingEventsCache.INSTANCE.getInstance();
                                            if (companion3 != 0) {
                                                OnFlushFinished.L$0 = l.a(G);
                                                OnFlushFinished.L$1 = l.a(file);
                                                OnFlushFinished.L$2 = l.a(strG);
                                                OnFlushFinished.L$3 = l.a(strG2);
                                                OnFlushFinished.L$4 = l.a(strG3);
                                                OnFlushFinished.L$5 = aVarA5;
                                                OnFlushFinished.I$0 = 0;
                                                A = 5;
                                                OnFlushFinished.label = 5;
                                                Object objOnFlushFinished = companion3.onFlushFinished(G, false, OnFlushFinished);
                                                OnFlushFinished = objOnFlushFinished;
                                                companion2 = companion3;
                                                break;
                                            }
                                            return aVarA5;
                                        }
                                        hVarC = new w.b().d().c(EncryptedTrackingEventsRequest.class);
                                        try {
                                            encryptedTrackingEventsRequest = (EncryptedTrackingEventsRequest) hVarC.fromJson(i.i(file, null, 1, null));
                                        } catch (Exception unused) {
                                            encryptedTrackingEventsRequest = null;
                                        }
                                        if (encryptedTrackingEventsRequest == null) {
                                            androidx.work.c.a aVarA6 = androidx.work.c.a.a();
                                            aVarA6.getClass();
                                            file.delete();
                                            ?? companion4 = TrackingEventsCache.INSTANCE.getInstance();
                                            if (companion4 != 0) {
                                                OnFlushFinished.L$0 = l.a(G);
                                                OnFlushFinished.L$1 = l.a(file);
                                                OnFlushFinished.L$2 = l.a(strG);
                                                OnFlushFinished.L$3 = l.a(strG2);
                                                OnFlushFinished.L$4 = l.a(strG3);
                                                OnFlushFinished.L$5 = l.a(hVarC);
                                                OnFlushFinished.L$6 = l.a(encryptedTrackingEventsRequest);
                                                OnFlushFinished.L$7 = aVarA6;
                                                OnFlushFinished.I$0 = 0;
                                                A = 6;
                                                OnFlushFinished.label = 6;
                                                Object objOnFlushFinished2 = companion4.onFlushFinished(G, false, OnFlushFinished);
                                                OnFlushFinished = objOnFlushFinished2;
                                                companion2 = companion4;
                                                break;
                                            }
                                            return aVarA6;
                                        }
                                        try {
                                            ?? TrackingEventsService = TrackingEventsServiceComponentManager.INSTANCE.getInstance(this.context, strG2).trackingEventsService();
                                            OnFlushFinished.L$0 = G;
                                            OnFlushFinished.L$1 = file;
                                            OnFlushFinished.L$2 = l.a(strG);
                                            OnFlushFinished.L$3 = l.a(strG2);
                                            OnFlushFinished.L$4 = l.a(strG3);
                                            OnFlushFinished.L$5 = l.a(hVarC);
                                            OnFlushFinished.L$6 = l.a(encryptedTrackingEventsRequest);
                                            OnFlushFinished.I$0 = 1;
                                            OnFlushFinished.label = 7;
                                            objM67sendEvents0E7RQCE$tracking_events_release = TrackingEventsService.m67sendEvents0E7RQCE$tracking_events_release(strG, encryptedTrackingEventsRequest, OnFlushFinished);
                                            if (objM67sendEvents0E7RQCE$tracking_events_release != objE) {
                                                r10 = G;
                                                i10 = 1;
                                                thE = n.e(objM67sendEvents0E7RQCE$tracking_events_release);
                                                if (thE == null) {
                                                    aVarB2 = androidx.work.c.a.d();
                                                } else {
                                                    pairArr2 = new Pair[]{s.a("error_message", thE.getMessage()), s.a("error_stacktrace", zt.a.b(thE))};
                                                    aVar2 = new androidx.work.b.a();
                                                    for (i14 = 0; i14 < 2; i14++) {
                                                        Pair pair = pairArr2[i14];
                                                        aVar2.b((String) pair.c(), pair.d());
                                                    }
                                                    aVarB2 = androidx.work.c.a.b(aVar2.a());
                                                }
                                                aVarB2.getClass();
                                                if (file != null) {
                                                    gu.b.a(file.delete());
                                                }
                                                if (r10 != 0 && (r1 = TrackingEventsCache.INSTANCE.getInstance()) != 0) {
                                                    if (i10 != 0) {
                                                        companion2 = 1;
                                                    } else {
                                                        companion2 = 0;
                                                    }
                                                    OnFlushFinished.L$0 = l.a(r10);
                                                    OnFlushFinished.L$1 = l.a(file);
                                                    OnFlushFinished.L$2 = l.a(strG);
                                                    OnFlushFinished.L$3 = l.a(strG2);
                                                    OnFlushFinished.L$4 = l.a(strG3);
                                                    OnFlushFinished.L$5 = l.a(hVarC);
                                                    OnFlushFinished.L$6 = l.a(encryptedTrackingEventsRequest);
                                                    A = l.a(objM67sendEvents0E7RQCE$tracking_events_release);
                                                    OnFlushFinished.L$7 = A;
                                                    OnFlushFinished.L$8 = aVarB2;
                                                    OnFlushFinished.I$0 = i10;
                                                    G = 8;
                                                    OnFlushFinished.label = 8;
                                                    break;
                                                }
                                                return aVarB2;
                                            }
                                        } catch (Exception e10) {
                                            e = e10;
                                            i11 = 1;
                                            OnFlushFinished = OnFlushFinished;
                                            companion2 = companion2;
                                            A = A;
                                            int i16 = i11;
                                            r10 = G;
                                            i10 = i16;
                                            message = e.getMessage();
                                            if (message == null) {
                                                message = "Unknown error";
                                            }
                                            pairArr = new Pair[]{s.a(A, message), s.a(companion2, zt.a.b(e))};
                                            aVar = new androidx.work.b.a();
                                            for (i13 = 0; i13 < 2; i13++) {
                                                Pair pair2 = pairArr[i13];
                                                aVar.b((String) pair2.c(), pair2.d());
                                            }
                                            bVarA = aVar.a();
                                            aVarB = androidx.work.c.a.b(bVarA);
                                            aVarB.getClass();
                                            if (file != null) {
                                                gu.b.a(file.delete());
                                            }
                                            if (r10 != 0) {
                                                if (i10 != 0) {
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                OnFlushFinished.L$0 = l.a(r10);
                                                OnFlushFinished.L$1 = l.a(file);
                                                OnFlushFinished.L$2 = l.a(e);
                                                OnFlushFinished.L$3 = l.a(bVarA);
                                                OnFlushFinished.L$4 = aVarB;
                                                OnFlushFinished.L$5 = null;
                                                OnFlushFinished.L$6 = null;
                                                OnFlushFinished.I$0 = i10;
                                                OnFlushFinished.label = 9;
                                                if (companion.onFlushFinished(r10, z11, OnFlushFinished) == objE) {
                                                }
                                            }
                                            return aVarB;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            i12 = 1;
                                            r12 = OnFlushFinished;
                                            r11 = G;
                                            if (file != null) {
                                                gu.b.a(file.delete());
                                            }
                                            if (r11 != 0) {
                                                if (i12 != 0) {
                                                    z10 = true;
                                                } else {
                                                    z10 = false;
                                                }
                                                r12.L$0 = l.a(r11);
                                                r12.L$1 = l.a(file);
                                                r12.L$2 = th;
                                                r12.L$3 = null;
                                                r12.L$4 = null;
                                                r12.L$5 = null;
                                                r12.L$6 = null;
                                                r12.I$0 = i12;
                                                r12.label = 10;
                                                break;
                                            }
                                            throw th;
                                        }
                                    } catch (Exception e11) {
                                        e = e11;
                                        i11 = 0;
                                        OnFlushFinished = OnFlushFinished;
                                        companion2 = companion2;
                                        A = A;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    i12 = 0;
                                    r12 = OnFlushFinished;
                                    r11 = G;
                                }
                            } catch (Exception e12) {
                                e = e12;
                                i11 = 0;
                                OnFlushFinished = OnFlushFinished;
                                companion2 = companion2;
                                A = A;
                            } catch (Throwable th4) {
                                th = th4;
                                i12 = 0;
                                r12 = OnFlushFinished;
                                r11 = G;
                                if (file != null) {
                                    gu.b.a(file.delete());
                                }
                                if (r11 != 0) {
                                    if (i12 != 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    r12.L$0 = l.a(r11);
                                    r12.L$1 = l.a(file);
                                    r12.L$2 = th;
                                    r12.L$3 = null;
                                    r12.L$4 = null;
                                    r12.L$5 = null;
                                    r12.L$6 = null;
                                    r12.I$0 = i12;
                                    r12.label = 10;
                                    break;
                                }
                                throw th;
                            }
                            break;
                            break;
                        } catch (Exception e13) {
                            e = e13;
                            r10 = G;
                            i10 = 0;
                            file = null;
                        } catch (Throwable th5) {
                            th = th5;
                            file = null;
                            i12 = 0;
                            r12 = OnFlushFinished;
                            r11 = G;
                            if (file != null) {
                                gu.b.a(file.delete());
                            }
                            if (r11 != 0) {
                                if (i12 != 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                r12.L$0 = l.a(r11);
                                r12.L$1 = l.a(file);
                                r12.L$2 = th;
                                r12.L$3 = null;
                                r12.L$4 = null;
                                r12.L$5 = null;
                                r12.L$6 = null;
                                r12.I$0 = i12;
                                r12.label = 10;
                                break;
                            }
                            throw th;
                        }
                        return objE;
                    } catch (Exception e14) {
                        e = e14;
                        i10 = 0;
                        file = null;
                        r10 = 0;
                    } catch (Throwable th6) {
                        th = th6;
                        G = 0;
                        file = null;
                        i12 = 0;
                        r12 = OnFlushFinished;
                        r11 = G;
                        if (file != null) {
                            gu.b.a(file.delete());
                        }
                        if (r11 != 0) {
                            if (i12 != 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            r12.L$0 = l.a(r11);
                            r12.L$1 = l.a(file);
                            r12.L$2 = th;
                            r12.L$3 = null;
                            r12.L$4 = null;
                            r12.L$5 = null;
                            r12.L$6 = null;
                            r12.I$0 = i12;
                            r12.label = 10;
                            break;
                        }
                        throw th;
                    }
                    message = e.getMessage();
                    if (message == null) {
                        message = "Unknown error";
                    }
                    pairArr = new Pair[]{s.a(A, message), s.a(companion2, zt.a.b(e))};
                    aVar = new androidx.work.b.a();
                    while (i13 < 2) {
                        Pair pair3 = pairArr[i13];
                        aVar.b((String) pair3.c(), pair3.d());
                    }
                    bVarA = aVar.a();
                    aVarB = androidx.work.c.a.b(bVarA);
                    aVarB.getClass();
                    if (file != null) {
                        gu.b.a(file.delete());
                    }
                    if (r10 != 0 && (companion = TrackingEventsCache.INSTANCE.getInstance()) != 0) {
                        if (i10 != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        OnFlushFinished.L$0 = l.a(r10);
                        OnFlushFinished.L$1 = l.a(file);
                        OnFlushFinished.L$2 = l.a(e);
                        OnFlushFinished.L$3 = l.a(bVarA);
                        OnFlushFinished.L$4 = aVarB;
                        OnFlushFinished.L$5 = null;
                        OnFlushFinished.L$6 = null;
                        OnFlushFinished.I$0 = i10;
                        OnFlushFinished.label = 9;
                        if (companion.onFlushFinished(r10, z11, OnFlushFinished) == objE) {
                            return objE;
                        }
                    }
                    return aVarB;
                case 1:
                    androidx.work.c.a aVar3 = (androidx.work.c.a) OnFlushFinished.L$0;
                    o.b(obj);
                    return aVar3;
                case 2:
                    androidx.work.c.a aVar4 = (androidx.work.c.a) OnFlushFinished.L$1;
                    o.b(obj);
                    return aVar4;
                case 3:
                    androidx.work.c.a aVar5 = (androidx.work.c.a) OnFlushFinished.L$2;
                    o.b(obj);
                    return aVar5;
                case 4:
                    androidx.work.c.a aVar6 = (androidx.work.c.a) OnFlushFinished.L$3;
                    o.b(obj);
                    return aVar6;
                case 5:
                    androidx.work.c.a aVar7 = (androidx.work.c.a) OnFlushFinished.L$5;
                    o.b(obj);
                    return aVar7;
                case 6:
                    androidx.work.c.a aVar8 = (androidx.work.c.a) OnFlushFinished.L$7;
                    o.b(obj);
                    return aVar8;
                case 7:
                    i10 = OnFlushFinished.I$0;
                    encryptedTrackingEventsRequest = (EncryptedTrackingEventsRequest) OnFlushFinished.L$6;
                    hVarC = (h) OnFlushFinished.L$5;
                    strG3 = (String) OnFlushFinished.L$4;
                    strG2 = (String) OnFlushFinished.L$3;
                    strG = (String) OnFlushFinished.L$2;
                    file = (File) OnFlushFinished.L$1;
                    r10 = (String) OnFlushFinished.L$0;
                    try {
                        try {
                            o.b(obj);
                            objM67sendEvents0E7RQCE$tracking_events_release = ((n) obj).getValue();
                            r10 = r10;
                            thE = n.e(objM67sendEvents0E7RQCE$tracking_events_release);
                            if (thE == null) {
                                aVarB2 = androidx.work.c.a.d();
                            } else {
                                pairArr2 = new Pair[]{s.a("error_message", thE.getMessage()), s.a("error_stacktrace", zt.a.b(thE))};
                                aVar2 = new androidx.work.b.a();
                                while (i14 < 2) {
                                    Pair pair4 = pairArr2[i14];
                                    aVar2.b((String) pair4.c(), pair4.d());
                                }
                                aVarB2 = androidx.work.c.a.b(aVar2.a());
                            }
                            aVarB2.getClass();
                            if (file != null) {
                                gu.b.a(file.delete());
                            }
                            if (r10 != 0) {
                                if (i10 != 0) {
                                    companion2 = 1;
                                } else {
                                    companion2 = 0;
                                }
                                OnFlushFinished.L$0 = l.a(r10);
                                OnFlushFinished.L$1 = l.a(file);
                                OnFlushFinished.L$2 = l.a(strG);
                                OnFlushFinished.L$3 = l.a(strG2);
                                OnFlushFinished.L$4 = l.a(strG3);
                                OnFlushFinished.L$5 = l.a(hVarC);
                                OnFlushFinished.L$6 = l.a(encryptedTrackingEventsRequest);
                                A = l.a(objM67sendEvents0E7RQCE$tracking_events_release);
                                OnFlushFinished.L$7 = A;
                                OnFlushFinished.L$8 = aVarB2;
                                OnFlushFinished.I$0 = i10;
                                G = 8;
                                OnFlushFinished.label = 8;
                                break;
                            }
                            return aVarB2;
                        } catch (Exception e15) {
                            e = e15;
                            message = e.getMessage();
                            if (message == null) {
                                message = "Unknown error";
                            }
                            pairArr = new Pair[]{s.a(A, message), s.a(companion2, zt.a.b(e))};
                            aVar = new androidx.work.b.a();
                            while (i13 < 2) {
                                Pair pair5 = pairArr[i13];
                                aVar.b((String) pair5.c(), pair5.d());
                            }
                            bVarA = aVar.a();
                            aVarB = androidx.work.c.a.b(bVarA);
                            aVarB.getClass();
                            if (file != null) {
                                gu.b.a(file.delete());
                            }
                            if (r10 != 0) {
                                if (i10 != 0) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                OnFlushFinished.L$0 = l.a(r10);
                                OnFlushFinished.L$1 = l.a(file);
                                OnFlushFinished.L$2 = l.a(e);
                                OnFlushFinished.L$3 = l.a(bVarA);
                                OnFlushFinished.L$4 = aVarB;
                                OnFlushFinished.L$5 = null;
                                OnFlushFinished.L$6 = null;
                                OnFlushFinished.I$0 = i10;
                                OnFlushFinished.label = 9;
                                if (companion.onFlushFinished(r10, z11, OnFlushFinished) == objE) {
                                }
                            }
                            return aVarB;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        ?? r19 = r10;
                        i12 = i10;
                        r11 = r19;
                        r12 = OnFlushFinished;
                        if (file != null) {
                            gu.b.a(file.delete());
                        }
                        if (r11 != 0 && (r1 = TrackingEventsCache.INSTANCE.getInstance()) != 0) {
                            if (i12 != 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            r12.L$0 = l.a(r11);
                            r12.L$1 = l.a(file);
                            r12.L$2 = th;
                            r12.L$3 = null;
                            r12.L$4 = null;
                            r12.L$5 = null;
                            r12.L$6 = null;
                            r12.I$0 = i12;
                            r12.label = 10;
                            break;
                        }
                        throw th;
                    }
                case 8:
                    androidx.work.c.a aVar9 = (androidx.work.c.a) OnFlushFinished.L$8;
                    o.b(obj);
                    return aVar9;
                case 9:
                    androidx.work.c.a aVar10 = (androidx.work.c.a) OnFlushFinished.L$4;
                    o.b(obj);
                    return aVar10;
                case 10:
                    Throwable th8 = (Throwable) OnFlushFinished.L$2;
                    o.b(obj);
                    throw th8;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.tracking.RealTrackingEventsLogger$fetchPublicKey$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @f(c = "com.withpersona.sdk2.inquiry.tracking.RealTrackingEventsLogger", f = "RealTrackingEventsLogger.kt", l = {255}, m = "fetchPublicKey")
    public static final class AnonymousClass1 extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(eu.b<? super AnonymousClass1> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RealTrackingEventsLogger.this.fetchPublicKey(this);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.tracking.RealTrackingEventsLogger$flush$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @f(c = "com.withpersona.sdk2.inquiry.tracking.RealTrackingEventsLogger", f = "RealTrackingEventsLogger.kt", l = {570, 573, 583, 585, 587, 616}, m = "flush")
    public static final class C07961 extends d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        int label;
        /* synthetic */ Object result;

        public C07961(eu.b<? super C07961> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RealTrackingEventsLogger.this.flush(this);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.tracking.RealTrackingEventsLogger$logEvent$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", com.github.luben.zstd.BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @f(c = "com.withpersona.sdk2.inquiry.tracking.RealTrackingEventsLogger$logEvent$1", f = "RealTrackingEventsLogger.kt", l = {549, 551, 553, 555}, m = "invokeSuspend")
    public static final class C07971 extends m implements Function2<p0, eu.b<? super Unit>, Object> {
        final /* synthetic */ TrackingEvent $event;
        final /* synthetic */ boolean $force;
        int I$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07971(TrackingEvent trackingEvent, boolean z10, eu.b<? super C07971> bVar) {
            super(2, bVar);
            this.$event = trackingEvent;
            this.$force = z10;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return RealTrackingEventsLogger.this.new C07971(this.$event, this.$force, bVar);
        }

        /* JADX WARN: Code duplicated, block: B:35:0x0071 A[Catch: Exception -> 0x007e, TRY_LEAVE, TryCatch #0 {Exception -> 0x007e, blocks: (B:11:0x001d, B:31:0x0065, B:35:0x0071, B:12:0x0021, B:13:0x0025, B:21:0x0045, B:23:0x0049, B:26:0x0054, B:28:0x005c, B:16:0x002c, B:18:0x0034), top: B:41:0x000a }] */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x007b, code lost:
        
            if (r1.flush(r7) == r0) goto L37;
         */
        @Override // gu.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int iIntValue;
            Object objE = fu.c.e();
            int i10 = this.label;
            try {
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                o.b(obj);
                                iIntValue = ((Number) obj).intValue();
                                if (iIntValue >= 10) {
                                    RealTrackingEventsLogger realTrackingEventsLogger = RealTrackingEventsLogger.this;
                                    this.I$0 = iIntValue;
                                    this.label = 4;
                                }
                            } else if (i10 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        }
                        o.b(obj);
                    } else {
                        o.b(obj);
                    }
                    return Unit.f21506a;
                }
                o.b(obj);
                TrackingEventsCache companion = TrackingEventsCache.INSTANCE.getInstance();
                if (companion != null) {
                    String str = RealTrackingEventsLogger.this.id;
                    TrackingEvent trackingEvent = this.$event;
                    this.label = 1;
                    if (companion.add(str, trackingEvent, this) == objE) {
                    }
                    return objE;
                }
                if (this.$force) {
                    RealTrackingEventsLogger realTrackingEventsLogger2 = RealTrackingEventsLogger.this;
                    this.label = 2;
                    if (realTrackingEventsLogger2.flush(this) == objE) {
                    }
                    return Unit.f21506a;
                }
                TrackingEventsCache companion2 = TrackingEventsCache.INSTANCE.getInstance();
                if (companion2 == null) {
                    iIntValue = 0;
                    if (iIntValue >= 10) {
                        RealTrackingEventsLogger realTrackingEventsLogger3 = RealTrackingEventsLogger.this;
                        this.I$0 = iIntValue;
                        this.label = 4;
                    }
                    return Unit.f21506a;
                }
                this.label = 3;
                obj = companion2.currentCount(this);
                if (obj != objE) {
                    iIntValue = ((Number) obj).intValue();
                    if (iIntValue >= 10) {
                        RealTrackingEventsLogger realTrackingEventsLogger4 = RealTrackingEventsLogger.this;
                        this.I$0 = iIntValue;
                        this.label = 4;
                    }
                    return Unit.f21506a;
                }
                return objE;
            } catch (Exception unused) {
            }
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((C07971) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    public RealTrackingEventsLogger(@NotNull Context context, @NotNull TrackingEventsCache trackingEventsCache, @NotNull w wVar, @NotNull TrackingMetadataProvider trackingMetadataProvider, @NotNull c cVar, @NotNull e eVar, @NotNull String str, @NotNull p0 p0Var, @NotNull NetworkStateManager networkStateManager) {
        context.getClass();
        trackingEventsCache.getClass();
        wVar.getClass();
        trackingMetadataProvider.getClass();
        cVar.getClass();
        eVar.getClass();
        str.getClass();
        p0Var.getClass();
        networkStateManager.getClass();
        this.context = context;
        this.cache = trackingEventsCache;
        this.moshi = wVar;
        this.metadataProvider = trackingMetadataProvider;
        this.sdkFilesManager = cVar;
        this.featureFlagManager = eVar;
        this.trackingEventServerEndpoint = str;
        this.coroutineScope = p0Var;
        this.networkStateManager = networkStateManager;
        this.workManager = y5.p0.INSTANCE.a(context);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.ROOT);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        this.iso8601Formatter = simpleDateFormat;
        this.id = a.a();
        this.trackingEventsUrl = str;
        trackingEventsJsonAdapter = wVar.d(a0.j(List.class, TrackingEvent.class));
        TrackingEventsCache.INSTANCE.setInstance(trackingEventsCache);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object fetchPublicKey(eu.b<? super PublicKeyResponse> bVar) {
        AnonymousClass1 anonymousClass1;
        Object objM66getPublicKeygIAlus$tracking_events_release;
        if (bVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) bVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(bVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(bVar);
        }
        Object obj = anonymousClass1.result;
        Object objE = fu.c.e();
        int i11 = anonymousClass1.label;
        try {
            if (i11 == 0) {
                o.b(obj);
                PublicKeyResponse publicKeyResponse = this.cachedPublicKeyResponse;
                if (publicKeyResponse != null) {
                    return publicKeyResponse;
                }
                String str = this.sessionToken;
                if (str == null) {
                    return null;
                }
                TrackingEventsService trackingEventsService = TrackingEventsServiceComponentManager.INSTANCE.getInstance(this.context, this.trackingEventsUrl).trackingEventsService();
                anonymousClass1.L$0 = l.a(str);
                anonymousClass1.label = 1;
                objM66getPublicKeygIAlus$tracking_events_release = trackingEventsService.m66getPublicKeygIAlus$tracking_events_release(str, anonymousClass1);
                if (objM66getPublicKeygIAlus$tracking_events_release == objE) {
                    return objE;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                objM66getPublicKeygIAlus$tracking_events_release = ((n) obj).getValue();
            }
            if (n.g(objM66getPublicKeygIAlus$tracking_events_release)) {
                objM66getPublicKeygIAlus$tracking_events_release = null;
            }
            PublicKeyResponse publicKeyResponse2 = (PublicKeyResponse) objM66getPublicKeygIAlus$tracking_events_release;
            if (publicKeyResponse2 != null) {
                this.cachedPublicKeyResponse = publicKeyResponse2;
                return publicKeyResponse2;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:100:0x015e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x0135  */
    /* JADX WARN: Code duplicated, block: B:51:0x0171 A[Catch: Exception -> 0x017a, TryCatch #1 {Exception -> 0x017a, blocks: (B:49:0x015e, B:51:0x0171, B:55:0x017e), top: B:100:0x015e }] */
    /* JADX WARN: Code duplicated, block: B:54:0x017d  */
    /* JADX WARN: Code duplicated, block: B:58:0x0195  */
    /* JADX WARN: Code duplicated, block: B:61:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:64:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:68:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:71:0x01d9 A[Catch: Exception -> 0x0215, TRY_LEAVE, TryCatch #6 {Exception -> 0x0215, blocks: (B:69:0x01d5, B:71:0x01d9, B:79:0x0218), top: B:110:0x01d5 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0210  */
    /* JADX WARN: Code duplicated, block: B:79:0x0218 A[Catch: Exception -> 0x0215, TRY_ENTER, TRY_LEAVE, TryCatch #6 {Exception -> 0x0215, blocks: (B:69:0x01d5, B:71:0x01d9, B:79:0x0218), top: B:110:0x01d5 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:82:0x0273 A[Catch: Exception -> 0x02c5, LOOP:0: B:81:0x0271->B:82:0x0273, LOOP_END, TryCatch #5 {Exception -> 0x02c5, blocks: (B:80:0x0220, B:82:0x0273, B:83:0x0285), top: B:108:0x0220 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x02d6  */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0157, code lost:
    
        if (r11.onFlushFinished(r0, true, r2) == r3) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0311, code lost:
    
        if (r8.onFlushFinished(r7, false, r2) == r3) goto L95;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object flush(eu.b<? super Unit> bVar) {
        C07961 c07961;
        String str;
        TrackingEventsCache trackingEventsCache;
        String str2;
        String str3;
        TrackingEventFlushSession trackingEventFlushSession;
        String str4;
        File fileD;
        String str5;
        TrackingEventsCache trackingEventsCache2;
        TrackingEventFlushSession trackingEventFlushSession2;
        y5.d dVarA;
        h<List<TrackingEvent>> hVar;
        String json;
        Object objFetchPublicKey;
        y5.d dVar;
        TrackingEventsCache trackingEventsCache3;
        String str6;
        TrackingEventFlushSession trackingEventFlushSession3;
        PublicKeyResponse publicKeyResponse;
        String str7;
        Object objCreateTrackingEventsRequest;
        PublicKeyResponse publicKeyResponse2;
        String str8;
        y5.d dVar2;
        String str9;
        EncryptedTrackingEventsRequest encryptedTrackingEventsRequest;
        Pair[] pairArr;
        androidx.work.b.a aVar;
        int i10;
        String token;
        if (bVar instanceof C07961) {
            c07961 = (C07961) bVar;
            int i11 = c07961.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c07961.label = i11 - Integer.MIN_VALUE;
            } else {
                c07961 = new C07961(bVar);
            }
        } else {
            c07961 = new C07961(bVar);
        }
        Object obj = c07961.result;
        Object objE = fu.c.e();
        switch (c07961.label) {
            case 0:
                o.b(obj);
                TrackingEventsCache companion = TrackingEventsCache.INSTANCE.getInstance();
                if (companion != null && (str = this.sessionToken) != null) {
                    String str10 = this.trackingEventsUrl;
                    String str11 = this.id;
                    c07961.L$0 = companion;
                    c07961.L$1 = str;
                    c07961.L$2 = str10;
                    c07961.label = 1;
                    Object objBeginFlush = companion.beginFlush(str11, c07961);
                    if (objBeginFlush != objE) {
                        trackingEventsCache = companion;
                        obj = objBeginFlush;
                        str2 = str;
                        str3 = str10;
                        trackingEventFlushSession = (TrackingEventFlushSession) obj;
                        if (!trackingEventFlushSession.getTrackingEvents().isEmpty()) {
                            try {
                                dVarA = new y5.d.a().b(x.CONNECTED).a();
                                hVar = trackingEventsJsonAdapter;
                                if (hVar != null) {
                                    json = hVar.toJson(trackingEventFlushSession.getTrackingEvents());
                                } else {
                                    json = null;
                                }
                                c07961.L$0 = trackingEventsCache;
                                c07961.L$1 = str2;
                                c07961.L$2 = str3;
                                c07961.L$3 = trackingEventFlushSession;
                                c07961.L$4 = dVarA;
                                c07961.L$5 = json;
                                c07961.label = 3;
                                objFetchPublicKey = fetchPublicKey(c07961);
                                if (objFetchPublicKey != objE) {
                                    dVar = dVarA;
                                    obj = objFetchPublicKey;
                                    trackingEventsCache3 = trackingEventsCache;
                                    str6 = str3;
                                    trackingEventFlushSession3 = trackingEventFlushSession;
                                    try {
                                        publicKeyResponse = (PublicKeyResponse) obj;
                                        Companion companion2 = INSTANCE;
                                        if (json == null) {
                                            str7 = com.github.luben.zstd.BuildConfig.FLAVOR;
                                        } else {
                                            str7 = json;
                                        }
                                        c07961.L$0 = trackingEventsCache3;
                                        c07961.L$1 = str2;
                                        c07961.L$2 = str6;
                                        c07961.L$3 = trackingEventFlushSession3;
                                        c07961.L$4 = dVar;
                                        c07961.L$5 = l.a(json);
                                        c07961.L$6 = l.a(publicKeyResponse);
                                        c07961.label = 4;
                                        objCreateTrackingEventsRequest = companion2.createTrackingEventsRequest(str7, publicKeyResponse, c07961);
                                        if (objCreateTrackingEventsRequest != objE) {
                                            TrackingEventFlushSession trackingEventFlushSession4 = trackingEventFlushSession3;
                                            publicKeyResponse2 = publicKeyResponse;
                                            obj = objCreateTrackingEventsRequest;
                                            str5 = str2;
                                            str8 = json;
                                            trackingEventsCache2 = trackingEventsCache3;
                                            dVar2 = dVar;
                                            str9 = str6;
                                            trackingEventFlushSession2 = trackingEventFlushSession4;
                                            try {
                                                encryptedTrackingEventsRequest = (EncryptedTrackingEventsRequest) obj;
                                                if (encryptedTrackingEventsRequest != null) {
                                                    fileD = this.sdkFilesManager.d("json");
                                                    try {
                                                        String json2 = new w.b().d().c(EncryptedTrackingEventsRequest.class).toJson(encryptedTrackingEventsRequest);
                                                        json2.getClass();
                                                        i.k(fileD, json2, null, 2, null);
                                                        z.a aVarK = new z.a(TrackingEventsWorker.class).k(dVar2);
                                                        pairArr = new Pair[]{s.a(KEY_SERVER_ENDPOINT, str9), s.a(KEY_SESSION_TOKEN, str5), s.a(KEY_ENCRYPTED_REQUEST_FILE, fileD.getAbsolutePath()), s.a(KEY_FLUSH_TOKEN, trackingEventFlushSession2.getToken())};
                                                        aVar = new androidx.work.b.a();
                                                        for (i10 = 0; i10 < 4; i10++) {
                                                            Pair pair = pairArr[i10];
                                                            aVar.b((String) pair.c(), pair.d());
                                                        }
                                                        z zVarB = aVarK.o(aVar.a()).b();
                                                        y5.p0 p0Var = this.workManager;
                                                        String strB = xq.m.b(str5);
                                                        String name = fileD.getName();
                                                        name.getClass();
                                                        p0Var.g(WORK_NAME_PREFIX + strB + "_" + xq.m.b(name), j.REPLACE, zVarB);
                                                        break;
                                                    } catch (Exception e10) {
                                                        e = e10;
                                                        str4 = str9;
                                                        if (fileD != null) {
                                                            gu.b.a(fileD.delete());
                                                        }
                                                        String token2 = trackingEventFlushSession2.getToken();
                                                        c07961.L$0 = l.a(trackingEventsCache2);
                                                        c07961.L$1 = l.a(str5);
                                                        c07961.L$2 = l.a(str4);
                                                        c07961.L$3 = l.a(fileD);
                                                        c07961.L$4 = l.a(trackingEventFlushSession2);
                                                        c07961.L$5 = l.a(e);
                                                        c07961.L$6 = null;
                                                        c07961.L$7 = null;
                                                        c07961.label = 6;
                                                        break;
                                                    }
                                                    return Unit.f21506a;
                                                }
                                                token = trackingEventFlushSession2.getToken();
                                                c07961.L$0 = trackingEventsCache2;
                                                c07961.L$1 = l.a(str5);
                                                c07961.L$2 = l.a(str9);
                                                c07961.L$3 = trackingEventFlushSession2;
                                                c07961.L$4 = l.a(dVar2);
                                                c07961.L$5 = l.a(str8);
                                                c07961.L$6 = l.a(publicKeyResponse2);
                                                c07961.L$7 = l.a(encryptedTrackingEventsRequest);
                                                c07961.label = 5;
                                                if (trackingEventsCache2.onFlushFinished(token, false, c07961) != objE) {
                                                    trackingEventFlushSession3 = trackingEventFlushSession2;
                                                    str4 = str9;
                                                    return Unit.f21506a;
                                                }
                                            } catch (Exception e11) {
                                                e = e11;
                                                fileD = null;
                                            }
                                        }
                                    } catch (Exception e12) {
                                        e = e12;
                                        str5 = str2;
                                        str4 = str6;
                                        trackingEventsCache2 = trackingEventsCache3;
                                        trackingEventFlushSession2 = trackingEventFlushSession3;
                                        fileD = null;
                                        if (fileD != null) {
                                            gu.b.a(fileD.delete());
                                        }
                                        String token3 = trackingEventFlushSession2.getToken();
                                        c07961.L$0 = l.a(trackingEventsCache2);
                                        c07961.L$1 = l.a(str5);
                                        c07961.L$2 = l.a(str4);
                                        c07961.L$3 = l.a(fileD);
                                        c07961.L$4 = l.a(trackingEventFlushSession2);
                                        c07961.L$5 = l.a(e);
                                        c07961.L$6 = null;
                                        c07961.L$7 = null;
                                        c07961.label = 6;
                                        break;
                                    }
                                }
                            } catch (Exception e13) {
                                e = e13;
                                str4 = str3;
                                fileD = null;
                                str5 = str2;
                                trackingEventsCache2 = trackingEventsCache;
                                trackingEventFlushSession2 = trackingEventFlushSession;
                                if (fileD != null) {
                                    gu.b.a(fileD.delete());
                                }
                                String token4 = trackingEventFlushSession2.getToken();
                                c07961.L$0 = l.a(trackingEventsCache2);
                                c07961.L$1 = l.a(str5);
                                c07961.L$2 = l.a(str4);
                                c07961.L$3 = l.a(fileD);
                                c07961.L$4 = l.a(trackingEventFlushSession2);
                                c07961.L$5 = l.a(e);
                                c07961.L$6 = null;
                                c07961.L$7 = null;
                                c07961.label = 6;
                                break;
                            }
                        } else {
                            String token5 = trackingEventFlushSession.getToken();
                            c07961.L$0 = l.a(trackingEventsCache);
                            c07961.L$1 = l.a(str2);
                            c07961.L$2 = l.a(str3);
                            c07961.L$3 = l.a(trackingEventFlushSession);
                            c07961.label = 2;
                            break;
                        }
                    }
                    return objE;
                }
                return Unit.f21506a;
            case 1:
                str3 = (String) c07961.L$2;
                str2 = (String) c07961.L$1;
                trackingEventsCache = (TrackingEventsCache) c07961.L$0;
                o.b(obj);
                trackingEventFlushSession = (TrackingEventFlushSession) obj;
                if (!trackingEventFlushSession.getTrackingEvents().isEmpty()) {
                    String token6 = trackingEventFlushSession.getToken();
                    c07961.L$0 = l.a(trackingEventsCache);
                    c07961.L$1 = l.a(str2);
                    c07961.L$2 = l.a(str3);
                    c07961.L$3 = l.a(trackingEventFlushSession);
                    c07961.label = 2;
                    break;
                } else {
                    dVarA = new y5.d.a().b(x.CONNECTED).a();
                    hVar = trackingEventsJsonAdapter;
                    if (hVar != null) {
                        json = hVar.toJson(trackingEventFlushSession.getTrackingEvents());
                    } else {
                        json = null;
                    }
                    c07961.L$0 = trackingEventsCache;
                    c07961.L$1 = str2;
                    c07961.L$2 = str3;
                    c07961.L$3 = trackingEventFlushSession;
                    c07961.L$4 = dVarA;
                    c07961.L$5 = json;
                    c07961.label = 3;
                    objFetchPublicKey = fetchPublicKey(c07961);
                    if (objFetchPublicKey != objE) {
                        dVar = dVarA;
                        obj = objFetchPublicKey;
                        trackingEventsCache3 = trackingEventsCache;
                        str6 = str3;
                        trackingEventFlushSession3 = trackingEventFlushSession;
                        publicKeyResponse = (PublicKeyResponse) obj;
                        Companion companion3 = INSTANCE;
                        if (json == null) {
                            str7 = com.github.luben.zstd.BuildConfig.FLAVOR;
                        } else {
                            str7 = json;
                        }
                        c07961.L$0 = trackingEventsCache3;
                        c07961.L$1 = str2;
                        c07961.L$2 = str6;
                        c07961.L$3 = trackingEventFlushSession3;
                        c07961.L$4 = dVar;
                        c07961.L$5 = l.a(json);
                        c07961.L$6 = l.a(publicKeyResponse);
                        c07961.label = 4;
                        objCreateTrackingEventsRequest = companion3.createTrackingEventsRequest(str7, publicKeyResponse, c07961);
                        if (objCreateTrackingEventsRequest != objE) {
                            TrackingEventFlushSession trackingEventFlushSession5 = trackingEventFlushSession3;
                            publicKeyResponse2 = publicKeyResponse;
                            obj = objCreateTrackingEventsRequest;
                            str5 = str2;
                            str8 = json;
                            trackingEventsCache2 = trackingEventsCache3;
                            dVar2 = dVar;
                            str9 = str6;
                            trackingEventFlushSession2 = trackingEventFlushSession5;
                            encryptedTrackingEventsRequest = (EncryptedTrackingEventsRequest) obj;
                            if (encryptedTrackingEventsRequest != null) {
                                fileD = this.sdkFilesManager.d("json");
                                String json3 = new w.b().d().c(EncryptedTrackingEventsRequest.class).toJson(encryptedTrackingEventsRequest);
                                json3.getClass();
                                i.k(fileD, json3, null, 2, null);
                                z.a aVarK2 = new z.a(TrackingEventsWorker.class).k(dVar2);
                                pairArr = new Pair[]{s.a(KEY_SERVER_ENDPOINT, str9), s.a(KEY_SESSION_TOKEN, str5), s.a(KEY_ENCRYPTED_REQUEST_FILE, fileD.getAbsolutePath()), s.a(KEY_FLUSH_TOKEN, trackingEventFlushSession2.getToken())};
                                aVar = new androidx.work.b.a();
                                while (i10 < 4) {
                                    Pair pair2 = pairArr[i10];
                                    aVar.b((String) pair2.c(), pair2.d());
                                }
                                z zVarB2 = aVarK2.o(aVar.a()).b();
                                y5.p0 p0Var2 = this.workManager;
                                String strB2 = xq.m.b(str5);
                                String name2 = fileD.getName();
                                name2.getClass();
                                p0Var2.g(WORK_NAME_PREFIX + strB2 + "_" + xq.m.b(name2), j.REPLACE, zVarB2);
                                return Unit.f21506a;
                            }
                            token = trackingEventFlushSession2.getToken();
                            c07961.L$0 = trackingEventsCache2;
                            c07961.L$1 = l.a(str5);
                            c07961.L$2 = l.a(str9);
                            c07961.L$3 = trackingEventFlushSession2;
                            c07961.L$4 = l.a(dVar2);
                            c07961.L$5 = l.a(str8);
                            c07961.L$6 = l.a(publicKeyResponse2);
                            c07961.L$7 = l.a(encryptedTrackingEventsRequest);
                            c07961.label = 5;
                            if (trackingEventsCache2.onFlushFinished(token, false, c07961) != objE) {
                                trackingEventFlushSession3 = trackingEventFlushSession2;
                                str4 = str9;
                                return Unit.f21506a;
                            }
                        }
                    }
                }
                return objE;
            case 2:
                o.b(obj);
                return Unit.f21506a;
            case 3:
                String str12 = (String) c07961.L$5;
                y5.d dVar3 = (y5.d) c07961.L$4;
                TrackingEventFlushSession trackingEventFlushSession6 = (TrackingEventFlushSession) c07961.L$3;
                str6 = (String) c07961.L$2;
                String str13 = (String) c07961.L$1;
                trackingEventsCache3 = (TrackingEventsCache) c07961.L$0;
                try {
                    o.b(obj);
                    json = str12;
                    trackingEventFlushSession3 = trackingEventFlushSession6;
                    str2 = str13;
                    dVar = dVar3;
                    publicKeyResponse = (PublicKeyResponse) obj;
                    Companion companion4 = INSTANCE;
                    if (json == null) {
                        str7 = com.github.luben.zstd.BuildConfig.FLAVOR;
                    } else {
                        str7 = json;
                    }
                    c07961.L$0 = trackingEventsCache3;
                    c07961.L$1 = str2;
                    c07961.L$2 = str6;
                    c07961.L$3 = trackingEventFlushSession3;
                    c07961.L$4 = dVar;
                    c07961.L$5 = l.a(json);
                    c07961.L$6 = l.a(publicKeyResponse);
                    c07961.label = 4;
                    objCreateTrackingEventsRequest = companion4.createTrackingEventsRequest(str7, publicKeyResponse, c07961);
                    if (objCreateTrackingEventsRequest != objE) {
                        TrackingEventFlushSession trackingEventFlushSession7 = trackingEventFlushSession3;
                        publicKeyResponse2 = publicKeyResponse;
                        obj = objCreateTrackingEventsRequest;
                        str5 = str2;
                        str8 = json;
                        trackingEventsCache2 = trackingEventsCache3;
                        dVar2 = dVar;
                        str9 = str6;
                        trackingEventFlushSession2 = trackingEventFlushSession7;
                        encryptedTrackingEventsRequest = (EncryptedTrackingEventsRequest) obj;
                        if (encryptedTrackingEventsRequest != null) {
                            fileD = this.sdkFilesManager.d("json");
                            String json4 = new w.b().d().c(EncryptedTrackingEventsRequest.class).toJson(encryptedTrackingEventsRequest);
                            json4.getClass();
                            i.k(fileD, json4, null, 2, null);
                            z.a aVarK3 = new z.a(TrackingEventsWorker.class).k(dVar2);
                            pairArr = new Pair[]{s.a(KEY_SERVER_ENDPOINT, str9), s.a(KEY_SESSION_TOKEN, str5), s.a(KEY_ENCRYPTED_REQUEST_FILE, fileD.getAbsolutePath()), s.a(KEY_FLUSH_TOKEN, trackingEventFlushSession2.getToken())};
                            aVar = new androidx.work.b.a();
                            while (i10 < 4) {
                                Pair pair3 = pairArr[i10];
                                aVar.b((String) pair3.c(), pair3.d());
                            }
                            z zVarB3 = aVarK3.o(aVar.a()).b();
                            y5.p0 p0Var3 = this.workManager;
                            String strB3 = xq.m.b(str5);
                            String name3 = fileD.getName();
                            name3.getClass();
                            p0Var3.g(WORK_NAME_PREFIX + strB3 + "_" + xq.m.b(name3), j.REPLACE, zVarB3);
                            return Unit.f21506a;
                        }
                        token = trackingEventFlushSession2.getToken();
                        c07961.L$0 = trackingEventsCache2;
                        c07961.L$1 = l.a(str5);
                        c07961.L$2 = l.a(str9);
                        c07961.L$3 = trackingEventFlushSession2;
                        c07961.L$4 = l.a(dVar2);
                        c07961.L$5 = l.a(str8);
                        c07961.L$6 = l.a(publicKeyResponse2);
                        c07961.L$7 = l.a(encryptedTrackingEventsRequest);
                        c07961.label = 5;
                        if (trackingEventsCache2.onFlushFinished(token, false, c07961) != objE) {
                            trackingEventFlushSession3 = trackingEventFlushSession2;
                            str4 = str9;
                            return Unit.f21506a;
                        }
                    }
                } catch (Exception e14) {
                    e = e14;
                    trackingEventFlushSession3 = trackingEventFlushSession6;
                    str4 = str6;
                    str5 = str13;
                    trackingEventsCache2 = trackingEventsCache3;
                    trackingEventFlushSession2 = trackingEventFlushSession3;
                    fileD = null;
                    if (fileD != null) {
                        gu.b.a(fileD.delete());
                    }
                    String token7 = trackingEventFlushSession2.getToken();
                    c07961.L$0 = l.a(trackingEventsCache2);
                    c07961.L$1 = l.a(str5);
                    c07961.L$2 = l.a(str4);
                    c07961.L$3 = l.a(fileD);
                    c07961.L$4 = l.a(trackingEventFlushSession2);
                    c07961.L$5 = l.a(e);
                    c07961.L$6 = null;
                    c07961.L$7 = null;
                    c07961.label = 6;
                    break;
                }
                return objE;
            case 4:
                publicKeyResponse2 = (PublicKeyResponse) c07961.L$6;
                String str14 = (String) c07961.L$5;
                y5.d dVar4 = (y5.d) c07961.L$4;
                trackingEventFlushSession2 = (TrackingEventFlushSession) c07961.L$3;
                str9 = (String) c07961.L$2;
                String str15 = (String) c07961.L$1;
                TrackingEventsCache trackingEventsCache4 = (TrackingEventsCache) c07961.L$0;
                try {
                    o.b(obj);
                    str5 = str15;
                    dVar2 = dVar4;
                    str8 = str14;
                    trackingEventsCache2 = trackingEventsCache4;
                    encryptedTrackingEventsRequest = (EncryptedTrackingEventsRequest) obj;
                    if (encryptedTrackingEventsRequest != null) {
                        token = trackingEventFlushSession2.getToken();
                        c07961.L$0 = trackingEventsCache2;
                        c07961.L$1 = l.a(str5);
                        c07961.L$2 = l.a(str9);
                        c07961.L$3 = trackingEventFlushSession2;
                        c07961.L$4 = l.a(dVar2);
                        c07961.L$5 = l.a(str8);
                        c07961.L$6 = l.a(publicKeyResponse2);
                        c07961.L$7 = l.a(encryptedTrackingEventsRequest);
                        c07961.label = 5;
                        if (trackingEventsCache2.onFlushFinished(token, false, c07961) != objE) {
                            trackingEventFlushSession3 = trackingEventFlushSession2;
                            str4 = str9;
                            return Unit.f21506a;
                        }
                        return objE;
                    }
                    fileD = this.sdkFilesManager.d("json");
                    String json5 = new w.b().d().c(EncryptedTrackingEventsRequest.class).toJson(encryptedTrackingEventsRequest);
                    json5.getClass();
                    i.k(fileD, json5, null, 2, null);
                    z.a aVarK4 = new z.a(TrackingEventsWorker.class).k(dVar2);
                    pairArr = new Pair[]{s.a(KEY_SERVER_ENDPOINT, str9), s.a(KEY_SESSION_TOKEN, str5), s.a(KEY_ENCRYPTED_REQUEST_FILE, fileD.getAbsolutePath()), s.a(KEY_FLUSH_TOKEN, trackingEventFlushSession2.getToken())};
                    aVar = new androidx.work.b.a();
                    while (i10 < 4) {
                        Pair pair4 = pairArr[i10];
                        aVar.b((String) pair4.c(), pair4.d());
                    }
                    z zVarB4 = aVarK4.o(aVar.a()).b();
                    y5.p0 p0Var4 = this.workManager;
                    String strB4 = xq.m.b(str5);
                    String name4 = fileD.getName();
                    name4.getClass();
                    p0Var4.g(WORK_NAME_PREFIX + strB4 + "_" + xq.m.b(name4), j.REPLACE, zVarB4);
                    return Unit.f21506a;
                } catch (Exception e15) {
                    e = e15;
                    trackingEventFlushSession3 = trackingEventFlushSession2;
                    str4 = str9;
                    str5 = str15;
                    trackingEventsCache2 = trackingEventsCache4;
                    trackingEventFlushSession2 = trackingEventFlushSession3;
                    fileD = null;
                    if (fileD != null) {
                        gu.b.a(fileD.delete());
                    }
                    String token8 = trackingEventFlushSession2.getToken();
                    c07961.L$0 = l.a(trackingEventsCache2);
                    c07961.L$1 = l.a(str5);
                    c07961.L$2 = l.a(str4);
                    c07961.L$3 = l.a(fileD);
                    c07961.L$4 = l.a(trackingEventFlushSession2);
                    c07961.L$5 = l.a(e);
                    c07961.L$6 = null;
                    c07961.L$7 = null;
                    c07961.label = 6;
                }
                break;
            case 5:
                trackingEventFlushSession3 = (TrackingEventFlushSession) c07961.L$3;
                str4 = (String) c07961.L$2;
                str5 = (String) c07961.L$1;
                trackingEventsCache2 = (TrackingEventsCache) c07961.L$0;
                try {
                    o.b(obj);
                    return Unit.f21506a;
                } catch (Exception e16) {
                    e = e16;
                    trackingEventFlushSession2 = trackingEventFlushSession3;
                    fileD = null;
                    if (fileD != null) {
                        gu.b.a(fileD.delete());
                    }
                    String token9 = trackingEventFlushSession2.getToken();
                    c07961.L$0 = l.a(trackingEventsCache2);
                    c07961.L$1 = l.a(str5);
                    c07961.L$2 = l.a(str4);
                    c07961.L$3 = l.a(fileD);
                    c07961.L$4 = l.a(trackingEventFlushSession2);
                    c07961.L$5 = l.a(e);
                    c07961.L$6 = null;
                    c07961.L$7 = null;
                    c07961.label = 6;
                }
                break;
            case 6:
                o.b(obj);
                return Unit.f21506a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    private final boolean isDebugMode() {
        return this.featureFlagManager.a(to.c.f32608a);
    }

    private final void logEvent(TrackingEvent event, boolean force) {
        if (this.isEnabled) {
            k.d(this.coroutineScope, null, null, new C07971(event, force, null), 3, null);
        }
    }

    private final String nowToIso8601Utc() {
        String str = this.iso8601Formatter.format(new Date());
        str.getClass();
        return str;
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logBackgroundEvent(@Nullable String stepName, @Nullable String pageName, boolean force) {
        logEvent(new TrackingEvent.InquiryBackgroundEvent(a.a(), new TrackingUiEvent(pageName, stepName, this.metadataProvider.collect()), nowToIso8601Utc()), force);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logCameraInfoEvent(@NotNull CameraInfoEventData data, boolean force) {
        data.getClass();
        logEvent(new TrackingEvent.InquiryCameraInfoEvent(a.a(), CameraInfoEventData.copy$default(data, null, null, null, null, null, null, this.metadataProvider.collect(), 63, null), nowToIso8601Utc()), force);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logDebugLogEvent(@NotNull String category, @NotNull Function0<String> message, boolean force) {
        category.getClass();
        message.getClass();
        if (isDebugMode()) {
            logEvent(new TrackingEvent.InquiryDebugLogEvent(a.a(), new DebugLogEventData(category, message.invoke(), this.metadataProvider.collect()), nowToIso8601Utc()), force);
        }
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logForegroundEvent(@Nullable String stepName, @Nullable String pageName, boolean force) {
        logEvent(new TrackingEvent.InquiryForegroundEvent(a.a(), new TrackingUiEvent(pageName, stepName, this.metadataProvider.collect()), nowToIso8601Utc()), force);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logGovernmentIdButtonClickEvent(@NotNull GovernmentIdButtonEventData data, boolean force) {
        data.getClass();
        logEvent(new TrackingEvent.InquiryGovernmentIdButtonEvent(a.a(), GovernmentIdButtonEventData.copy$default(data, null, this.metadataProvider.collect(), 1, null), nowToIso8601Utc()), force);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logGovernmentIdStateEvent(@NotNull GovernmentIdStateEventData data, boolean force) {
        data.getClass();
        logEvent(new TrackingEvent.InquiryGovernmentIdStateEvent(a.a(), GovernmentIdStateEventData.copy$default(data, null, null, null, this.metadataProvider.collect(), 7, null), nowToIso8601Utc()), force);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logInquiryEndEvent(@NotNull InquiryEndReason reason, long durationMs, @Nullable String errorDescription, boolean force) {
        reason.getClass();
        logEvent(new TrackingEvent.InquiryEndEvent(a.a(), new InquiryEndEventData(reason, Long.valueOf(durationMs), errorDescription, this.metadataProvider.collect()), nowToIso8601Utc()), true);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logInquiryPageViewEvent(@NotNull String stepName, @Nullable String pageName, boolean force) {
        stepName.getClass();
        logEvent(new TrackingEvent.PageViewTrackingEvent(a.a(), new TrackingUiEvent(pageName, stepName, this.metadataProvider.collect()), nowToIso8601Utc()), force);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logInquiryStartEvent(@NotNull InquiryConfigData config, boolean force) {
        config.getClass();
        logEvent(new TrackingEvent.InquiryStartEvent(a.a(), new InquiryStartEventData(config.copy((32751 & 1) != 0 ? config.templateId : null, (32751 & 2) != 0 ? config.templateVersion : null, (32751 & 4) != 0 ? config.environment : null, (32751 & 8) != 0 ? config.environmentId : null, (32751 & 16) != 0 ? config.organizationId : this.networkStateManager.getOrganizationId(), (32751 & 32) != 0 ? config.uiFramework : null, (32751 & 64) != 0 ? config.themeSetId : null, (32751 & Barcode.FORMAT_ITF) != 0 ? config.hasAccountId : null, (32751 & Barcode.FORMAT_QR_CODE) != 0 ? config.hasFields : null, (32751 & Barcode.FORMAT_UPC_A) != 0 ? config.hasInquiryId : null, (32751 & Barcode.FORMAT_UPC_E) != 0 ? config.hasOneTimeLinkCode : null, (32751 & Barcode.FORMAT_PDF417) != 0 ? config.hasRedirectUri : null, (32751 & Barcode.FORMAT_AZTEC) != 0 ? config.hasReferenceId : null, (32751 & 8192) != 0 ? config.hasSessionToken : null, (32751 & 16384) != 0 ? config.hasTheme : null), this.metadataProvider.collect()), nowToIso8601Utc()), force);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logIntegrationEvent(@NotNull IntegrationEventData data, boolean force) {
        data.getClass();
        logEvent(new TrackingEvent.InquiryIntegrationEvent(a.a(), IntegrationEventData.copy$default(data, null, null, null, this.metadataProvider.collect(), 7, null), nowToIso8601Utc()), force);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logNfcErrorEvent(@NotNull NfcErrorEventData data, boolean force) {
        data.getClass();
        logEvent(new TrackingEvent.InquiryNfcErrorEvent(a.a(), NfcErrorEventData.copy$default(data, null, null, null, null, null, null, null, null, this.metadataProvider.collect(), 255, null), nowToIso8601Utc()), force);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logNfcScanEvent(@NotNull NfcScanEventData data, boolean force) {
        data.getClass();
        logEvent(new TrackingEvent.InquiryNfcScanEvent(a.a(), NfcScanEventData.copy$default(data, null, null, null, null, null, null, this.metadataProvider.collect(), 63, null), nowToIso8601Utc()), force);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logPermissionEvent(@NotNull PermissionTrackingEventData permissionData, boolean force) {
        permissionData.getClass();
        logEvent(new TrackingEvent.InquiryPermissionEvent(a.a(), PermissionTrackingEventData.copy$default(permissionData, null, null, this.metadataProvider.collect(), 3, null), nowToIso8601Utc()), force);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logSelfieCaptureButtonClickedEvent(@NotNull SelfieCaptureButtonEventData data, boolean force) {
        data.getClass();
        logEvent(new TrackingEvent.InquirySelfieClickEvent(a.a(), SelfieCaptureButtonEventData.copy$default(data, null, this.metadataProvider.collect(), 1, null), nowToIso8601Utc()), force);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logSelfieCaptureStateEvent(@NotNull SelfieCaptureStateEventData data, boolean force) {
        data.getClass();
        logEvent(new TrackingEvent.InquirySelfieCaptureStateEvent(a.a(), SelfieCaptureStateEventData.copy$default(data, null, null, null, this.metadataProvider.collect(), 7, null), nowToIso8601Utc()), force);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logSelfiePoseCaptureEvent(@NotNull SelfiePoseEventData data, boolean force) {
        data.getClass();
        logEvent(new TrackingEvent.InquirySelfiePoseEvent(a.a(), SelfiePoseEventData.copy$default(data, null, null, this.metadataProvider.collect(), 3, null), nowToIso8601Utc()), force);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logSelfiePoseDetect(@NotNull SelfiePoseDetectEventData data, boolean force) {
        data.getClass();
        logEvent(new TrackingEvent.InquirySelfiePoseDetectEvent(a.a(), SelfiePoseDetectEventData.copy$default(data, null, null, 0.0f, 0.0f, 0.0f, this.metadataProvider.collect(), 31, null), nowToIso8601Utc()), force);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logUiStepButtonEvent(@NotNull UiStepButtonType type, @Nullable String buttonName, @Nullable String stepName, boolean force) {
        type.getClass();
        logEvent(new TrackingEvent.InquiryUiStepButtonEvent(a.a(), new UiStepButtonEventData(type, buttonName, stepName, this.metadataProvider.collect()), nowToIso8601Utc()), force);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logVideoErrorEvent(@NotNull String stepName, @Nullable String videoCaptureMethod, @Nullable String errorName, @Nullable String errorReason, boolean force) {
        stepName.getClass();
        logEvent(new TrackingEvent.InquiryVideoErrorEvent(a.a(), new VideoErrorEventData(stepName, null, videoCaptureMethod, errorName, errorReason, this.metadataProvider.collect(), 2, null), nowToIso8601Utc()), force);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logVideoStartEvent(@NotNull String stepName, @Nullable String videoCaptureMethod, @Nullable Integer attempt, boolean force) {
        stepName.getClass();
        logEvent(new TrackingEvent.InquiryVideoStartEvent(a.a(), new VideoStartEventData(stepName, null, videoCaptureMethod, attempt, this.metadataProvider.collect(), 2, null), nowToIso8601Utc()), force);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logVideoStopEvent(@NotNull String stepName, @Nullable String videoCaptureMethod, @Nullable String assetId, @Nullable Integer elapsedTime, @Nullable Integer chunksLength, @Nullable Double blobSize, boolean force) {
        stepName.getClass();
        logEvent(new TrackingEvent.InquiryVideoStopEvent(a.a(), new VideoStopEventData(stepName, null, videoCaptureMethod, assetId, elapsedTime, chunksLength, blobSize, this.metadataProvider.collect(), 2, null), nowToIso8601Utc()), force);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logVideoStopRequestEvent(@NotNull String stepName, boolean force) {
        stepName.getClass();
        logEvent(new TrackingEvent.InquiryVideoStopRequestEvent(a.a(), new VideoStopRequestEventData(stepName, null, null, this.metadataProvider.collect(), 6, null), nowToIso8601Utc()), force);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logWebRtcIceCompleteEvent(@Nullable String stepName, @Nullable Integer numCandidates, boolean force) {
        logEvent(new TrackingEvent.InquiryVideoIceCompleteEvent(a.a(), new VideoIceCompleteEventData(stepName, null, null, numCandidates, this.metadataProvider.collect(), 6, null), nowToIso8601Utc()), force);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void setIsEnabled(boolean enabled) {
        if (this.isEnabled == enabled) {
            return;
        }
        this.isEnabled = enabled;
        if (this.isEnabled) {
            return;
        }
        this.cachedPublicKeyResponse = null;
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void setSessionToken(@NotNull String sessionToken) {
        sessionToken.getClass();
        this.sessionToken = sessionToken;
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void setTrackingEventsUrl(@Nullable String trackingEventsUrl) {
        if (trackingEventsUrl != null) {
            this.trackingEventsUrl = trackingEventsUrl;
        }
    }
}
