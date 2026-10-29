package com.withpersona.sdk2.inquiry.tracking;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.work.AbstractC1117c;
import androidx.work.C1116b;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.appsflyer.sdk_base.referrer.Payload;
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
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152go.C6156c;
import p152go.C6159e;
import p226jq.C7271m;
import p229jt.C7328a;
import p229jt.C7347n;
import p229jt.C7348o;
import p229jt.C7352s;
import p256ku.C7882k;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p391qq.C10700c;
import p471um.AbstractC11873h;
import p471um.C11866a0;
import p471um.C11888w;
import p477ut.C11964i;
import p536x5.AbstractC12719p0;
import p536x5.C12694d;
import p536x5.C12738z;
import p536x5.EnumC12706j;
import p536x5.EnumC12734x;
import pt.AbstractC10342d;
import pt.AbstractC10351m;
import pt.C10340b;
import pt.C10350l;
import pt.InterfaceC10344f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 \u0094\u00012\u00020\u0001:\u0006\u0095\u0001\u0094\u0001\u0096\u0001BS\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u001dH\u0082@¢\u0006\u0004\b \u0010\u0018J\u000f\u0010!\u001a\u00020\u000eH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\u000eH\u0016¢\u0006\u0004\b$\u0010%J\u0019\u0010'\u001a\u00020\u001d2\b\u0010&\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b'\u0010%J\u0017\u0010)\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020\u001bH\u0016¢\u0006\u0004\b)\u0010*J)\u0010-\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020\u000e2\b\u0010,\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b-\u0010.J+\u0010/\u001a\u00020\u001d2\b\u0010+\u001a\u0004\u0018\u00010\u000e2\b\u0010,\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b/\u0010.J+\u00100\u001a\u00020\u001d2\b\u0010+\u001a\u0004\u0018\u00010\u000e2\b\u0010,\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b0\u0010.J+\u00103\u001a\u00020\u001d2\b\u0010+\u001a\u0004\u0018\u00010\u000e2\b\u00102\u001a\u0004\u0018\u0001012\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b3\u00104J3\u00107\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020\u000e2\b\u00105\u001a\u0004\u0018\u00010\u000e2\b\u00106\u001a\u0004\u0018\u0001012\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b7\u00108JQ\u0010>\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020\u000e2\b\u00105\u001a\u0004\u0018\u00010\u000e2\b\u00109\u001a\u0004\u0018\u00010\u000e2\b\u0010:\u001a\u0004\u0018\u0001012\b\u0010;\u001a\u0004\u0018\u0001012\b\u0010=\u001a\u0004\u0018\u00010<2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b>\u0010?J\u001f\u0010@\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b@\u0010AJ=\u0010D\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020\u000e2\b\u00105\u001a\u0004\u0018\u00010\u000e2\b\u0010B\u001a\u0004\u0018\u00010\u000e2\b\u0010C\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\bD\u0010EJ\u001f\u0010H\u001a\u00020\u001d2\u0006\u0010G\u001a\u00020F2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\bH\u0010IJ\u001f\u0010L\u001a\u00020\u001d2\u0006\u0010K\u001a\u00020J2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\bL\u0010MJ\u001f\u0010O\u001a\u00020\u001d2\u0006\u0010K\u001a\u00020N2\u0006\u0010\u001c\u001a\u00020\u001bH\u0017¢\u0006\u0004\bO\u0010PJ\u001f\u0010R\u001a\u00020\u001d2\u0006\u0010K\u001a\u00020Q2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\bR\u0010SJ\u001f\u0010U\u001a\u00020\u001d2\u0006\u0010K\u001a\u00020T2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\bU\u0010VJ\u001f\u0010X\u001a\u00020\u001d2\u0006\u0010K\u001a\u00020W2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\bX\u0010YJ\u001f\u0010\\\u001a\u00020\u001d2\u0006\u0010[\u001a\u00020Z2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\\\u0010]J1\u0010c\u001a\u00020\u001d2\u0006\u0010_\u001a\u00020^2\u0006\u0010a\u001a\u00020`2\b\u0010b\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\bc\u0010dJ\u001f\u0010f\u001a\u00020\u001d2\u0006\u0010K\u001a\u00020e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\bf\u0010gJ3\u0010k\u001a\u00020\u001d2\u0006\u0010i\u001a\u00020h2\b\u0010j\u001a\u0004\u0018\u00010\u000e2\b\u0010+\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\bk\u0010lJ\u001f\u0010n\u001a\u00020\u001d2\u0006\u0010K\u001a\u00020m2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\bn\u0010oJ\u001f\u0010q\u001a\u00020\u001d2\u0006\u0010K\u001a\u00020p2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\bq\u0010rJ\u001f\u0010t\u001a\u00020\u001d2\u0006\u0010K\u001a\u00020s2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\bt\u0010uJ-\u0010y\u001a\u00020\u001d2\u0006\u0010v\u001a\u00020\u000e2\f\u0010x\u001a\b\u0012\u0004\u0012\u00020\u000e0w2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\by\u0010zJ\u001f\u0010|\u001a\u00020\u001d2\u0006\u0010K\u001a\u00020{2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b|\u0010}R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010~R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u007fR\u0015\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0007\u0010\u0080\u0001R\u0015\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\t\u0010\u0081\u0001R\u0015\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000b\u0010\u0082\u0001R\u0015\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\r\u0010\u0083\u0001R\u0015\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000f\u0010\u0084\u0001R\u0015\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0011\u0010\u0085\u0001R\u0015\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0013\u0010\u0086\u0001R\u0018\u0010\u0088\u0001\u001a\u00030\u0087\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0018\u0010\u008b\u0001\u001a\u00030\u008a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0017\u0010\u008d\u0001\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u0084\u0001R\u0019\u0010#\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b#\u0010\u0084\u0001R\u0017\u0010&\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b&\u0010\u0084\u0001R\u0019\u0010\u008e\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u001b\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0017\u0010\u0092\u0001\u001a\u00020\u001b8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001¨\u0006\u0097\u0001"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "Landroid/content/Context;", "context", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;", "cache", "Lum/w;", "moshi", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;", "metadataProvider", "Lqq/c;", "sdkFilesManager", "Lgo/e;", "featureFlagManager", "", "trackingEventServerEndpoint", "Lku/p0;", "coroutineScope", "Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager;", "networkStateManager", "<init>", "(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;Lum/w;Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;Lqq/c;Lgo/e;Ljava/lang/String;Lku/p0;Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager;)V", "Lcom/withpersona/sdk2/inquiry/tracking/network/PublicKeyResponse;", "fetchPublicKey", "(Lnt/b;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;", NotificationCompat.CATEGORY_EVENT, "", "force", "", "logEvent", "(Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;Z)V", "flush", "nowToIso8601Utc", "()Ljava/lang/String;", "sessionToken", "setSessionToken", "(Ljava/lang/String;)V", "trackingEventsUrl", "setTrackingEventsUrl", "enabled", "setIsEnabled", "(Z)V", "stepName", "pageName", "logInquiryPageViewEvent", "(Ljava/lang/String;Ljava/lang/String;Z)V", "logForegroundEvent", "logBackgroundEvent", "", "numCandidates", "logWebRtcIceCompleteEvent", "(Ljava/lang/String;Ljava/lang/Integer;Z)V", "videoCaptureMethod", "attempt", "logVideoStartEvent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Z)V", "assetId", "elapsedTime", "chunksLength", "", "blobSize", "logVideoStopEvent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Z)V", "logVideoStopRequestEvent", "(Ljava/lang/String;Z)V", "errorName", "errorReason", "logVideoErrorEvent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "Lcom/withpersona/sdk2/inquiry/tracking/model/PermissionTrackingEventData;", "permissionData", "logPermissionEvent", "(Lcom/withpersona/sdk2/inquiry/tracking/model/PermissionTrackingEventData;Z)V", "Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonEventData;", "data", "logSelfieCaptureButtonClickedEvent", "(Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonEventData;Z)V", "Lcom/withpersona/sdk2/inquiry/tracking/model/SelfiePoseEventData;", "logSelfiePoseCaptureEvent", "(Lcom/withpersona/sdk2/inquiry/tracking/model/SelfiePoseEventData;Z)V", "Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureStateEventData;", "logSelfieCaptureStateEvent", "(Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureStateEventData;Z)V", "Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdButtonEventData;", "logGovernmentIdButtonClickEvent", "(Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdButtonEventData;Z)V", "Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdStateEventData;", "logGovernmentIdStateEvent", "(Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdStateEventData;Z)V", "Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryConfigData;", "config", "logInquiryStartEvent", "(Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryConfigData;Z)V", "Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryEndReason;", "reason", "", "durationMs", "errorDescription", "logInquiryEndEvent", "(Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryEndReason;JLjava/lang/String;Z)V", "Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationEventData;", "logIntegrationEvent", "(Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationEventData;Z)V", "Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;", Payload.TYPE, "buttonName", "logUiStepButtonEvent", "(Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;Ljava/lang/String;Ljava/lang/String;Z)V", "Lcom/withpersona/sdk2/inquiry/tracking/model/CameraInfoEventData;", "logCameraInfoEvent", "(Lcom/withpersona/sdk2/inquiry/tracking/model/CameraInfoEventData;Z)V", "Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanEventData;", "logNfcScanEvent", "(Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanEventData;Z)V", "Lcom/withpersona/sdk2/inquiry/tracking/model/NfcErrorEventData;", "logNfcErrorEvent", "(Lcom/withpersona/sdk2/inquiry/tracking/model/NfcErrorEventData;Z)V", "category", "Lkotlin/Function0;", "message", "logDebugLogEvent", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Z)V", "Lcom/withpersona/sdk2/inquiry/tracking/model/SelfiePoseDetectEventData;", "logSelfiePoseDetect", "(Lcom/withpersona/sdk2/inquiry/tracking/model/SelfiePoseDetectEventData;Z)V", "Landroid/content/Context;", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;", "Lum/w;", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;", "Lqq/c;", "Lgo/e;", "Ljava/lang/String;", "Lku/p0;", "Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager;", "Lx5/p0;", "workManager", "Lx5/p0;", "Ljava/text/SimpleDateFormat;", "iso8601Formatter", "Ljava/text/SimpleDateFormat;", "id", "isEnabled", "Z", "cachedPublicKeyResponse", "Lcom/withpersona/sdk2/inquiry/tracking/network/PublicKeyResponse;", "isDebugMode", "()Z", "Companion", "Factory", "TrackingEventsWorker", "tracking-events_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
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
    private static AbstractC11873h<List<TrackingEvent>> trackingEventsJsonAdapter;

    @NotNull
    private final TrackingEventsCache cache;

    @Nullable
    private volatile PublicKeyResponse cachedPublicKeyResponse;

    @NotNull
    private final Context context;

    @NotNull
    private final InterfaceC7906p0 coroutineScope;

    @NotNull
    private final C6159e featureFlagManager;

    @NotNull
    private final String id;
    private volatile boolean isEnabled;

    @NotNull
    private final SimpleDateFormat iso8601Formatter;

    @NotNull
    private final TrackingMetadataProvider metadataProvider;

    @NotNull
    private final C11888w moshi;

    @NotNull
    private final NetworkStateManager networkStateManager;

    @NotNull
    private final C10700c sdkFilesManager;

    @Nullable
    private volatile String sessionToken;

    @NotNull
    private final String trackingEventServerEndpoint;

    @NotNull
    private volatile String trackingEventsUrl;

    @NotNull
    private final AbstractC12719p0 workManager;

    @Metadata(m31664d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0082@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000fR$\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$Companion;", "", "<init>", "()V", "", "json", "Lcom/withpersona/sdk2/inquiry/tracking/network/PublicKeyResponse;", "publicKeyResponse", "Lcom/withpersona/sdk2/inquiry/tracking/network/EncryptedTrackingEventsRequest;", "createTrackingEventsRequest", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/network/PublicKeyResponse;Lnt/b;)Ljava/lang/Object;", "", "DEFAULT_MEMORY_THRESHOLD", "I", "KEY_SESSION_TOKEN", "Ljava/lang/String;", "KEY_SERVER_ENDPOINT", "KEY_ENCRYPTED_REQUEST_FILE", "KEY_FLUSH_TOKEN", "WORK_NAME_PREFIX", "Lum/h;", "", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;", "trackingEventsJsonAdapter", "Lum/h;", "tracking-events_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.tracking.RealTrackingEventsLogger.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
        public final Object createTrackingEventsRequest(String str, PublicKeyResponse publicKeyResponse, InterfaceC9557b<? super EncryptedTrackingEventsRequest> interfaceC9557b) {
            RealTrackingEventsLogger$Companion$createTrackingEventsRequest$1 realTrackingEventsLogger$Companion$createTrackingEventsRequest$1;
            String str2;
            String str3;
            if (interfaceC9557b instanceof RealTrackingEventsLogger$Companion$createTrackingEventsRequest$1) {
                realTrackingEventsLogger$Companion$createTrackingEventsRequest$1 = (RealTrackingEventsLogger$Companion$createTrackingEventsRequest$1) interfaceC9557b;
                int i10 = realTrackingEventsLogger$Companion$createTrackingEventsRequest$1.label;
                if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                    realTrackingEventsLogger$Companion$createTrackingEventsRequest$1.label = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                } else {
                    realTrackingEventsLogger$Companion$createTrackingEventsRequest$1 = new RealTrackingEventsLogger$Companion$createTrackingEventsRequest$1(this, interfaceC9557b);
                }
            } else {
                realTrackingEventsLogger$Companion$createTrackingEventsRequest$1 = new RealTrackingEventsLogger$Companion$createTrackingEventsRequest$1(this, interfaceC9557b);
            }
            Object objObfuscatePayload = realTrackingEventsLogger$Companion$createTrackingEventsRequest$1.result;
            Object objM38805e = C10047c.m38805e();
            int i11 = realTrackingEventsLogger$Companion$createTrackingEventsRequest$1.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    publicKeyResponse = (PublicKeyResponse) realTrackingEventsLogger$Companion$createTrackingEventsRequest$1.L$1;
                    C7348o.m30470b(objObfuscatePayload);
                    ObfuscationResult obfuscationResult = (ObfuscationResult) objObfuscatePayload;
                    return new EncryptedTrackingEventsRequest(publicKeyResponse.getVersion(), obfuscationResult.getEncryptedKey(), obfuscationResult.getEncryptedPayload());
                }
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = (String) realTrackingEventsLogger$Companion$createTrackingEventsRequest$1.L$5;
                str3 = (String) realTrackingEventsLogger$Companion$createTrackingEventsRequest$1.L$4;
                C7348o.m30470b(objObfuscatePayload);
                return new EncryptedTrackingEventsRequest(str3, str2, (String) objObfuscatePayload);
            }
            C7348o.m30470b(objObfuscatePayload);
            String str4 = "{\"events\": " + str + "}";
            AbstractC11873h abstractC11873h = RealTrackingEventsLogger.trackingEventsJsonAdapter;
            List list = abstractC11873h != null ? (List) abstractC11873h.fromJson(str) : null;
            if (list == null || list.isEmpty()) {
                return null;
            }
            if (publicKeyResponse != null) {
                String publicKey = publicKeyResponse.getPublicKey();
                realTrackingEventsLogger$Companion$createTrackingEventsRequest$1.L$0 = C10350l.m39676a(str);
                realTrackingEventsLogger$Companion$createTrackingEventsRequest$1.L$1 = publicKeyResponse;
                realTrackingEventsLogger$Companion$createTrackingEventsRequest$1.L$2 = C10350l.m39676a(str4);
                realTrackingEventsLogger$Companion$createTrackingEventsRequest$1.L$3 = C10350l.m39676a(list);
                realTrackingEventsLogger$Companion$createTrackingEventsRequest$1.label = 1;
                objObfuscatePayload = TrackingEventUtilsKt.obfuscatePayload(str4, publicKey, realTrackingEventsLogger$Companion$createTrackingEventsRequest$1);
            } else {
                realTrackingEventsLogger$Companion$createTrackingEventsRequest$1.L$0 = C10350l.m39676a(str);
                realTrackingEventsLogger$Companion$createTrackingEventsRequest$1.L$1 = C10350l.m39676a(publicKeyResponse);
                realTrackingEventsLogger$Companion$createTrackingEventsRequest$1.L$2 = C10350l.m39676a(str4);
                realTrackingEventsLogger$Companion$createTrackingEventsRequest$1.L$3 = C10350l.m39676a(list);
                str2 = "";
                realTrackingEventsLogger$Companion$createTrackingEventsRequest$1.L$4 = "";
                realTrackingEventsLogger$Companion$createTrackingEventsRequest$1.L$5 = "";
                realTrackingEventsLogger$Companion$createTrackingEventsRequest$1.label = 2;
                objObfuscatePayload = TrackingEventUtilsKt.obfuscatePayload(str4, realTrackingEventsLogger$Companion$createTrackingEventsRequest$1);
                if (objObfuscatePayload != objM38805e) {
                    str3 = "";
                    return new EncryptedTrackingEventsRequest(str3, str2, (String) objObfuscatePayload);
                }
            }
            return objM38805e;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Companion() {
        }
    }

    @Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006À\u0006\u0003"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$Factory;", "", "create", "Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;", "trackingEventServerEndpoint", "", "tracking-events_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public interface Factory {
        @NotNull
        RealTrackingEventsLogger create(@NotNull String trackingEventServerEndpoint);
    }

    @Metadata(m31664d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/c$a;", "doWork", "(Lnt/b;)Ljava/lang/Object;", "Landroid/content/Context;", "tracking-events_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
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

        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:132:0x03a2 */
        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:177:0x047c */
        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:178:0x01f6 */
        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:181:? */
        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:182:? */
        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:190:0x0143 */
        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:20:0x00ab */
        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:52:0x0173 */
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
        /* JADX WARN: Type inference failed for: r2v2, types: [com.withpersona.sdk2.inquiry.tracking.RealTrackingEventsLogger$TrackingEventsWorker$doWork$1, nt.b] */
        /* JADX WARN: Type inference failed for: r2v23 */
        /* JADX WARN: Type inference failed for: r2v24, types: [com.withpersona.sdk2.inquiry.tracking.RealTrackingEventsLogger$TrackingEventsWorker$doWork$1, nt.b] */
        /* JADX WARN: Type inference failed for: r2v25 */
        /* JADX WARN: Type inference failed for: r2v26 */
        /* JADX WARN: Type inference failed for: r2v27 */
        /* JADX WARN: Type inference failed for: r2v28, types: [com.withpersona.sdk2.inquiry.tracking.RealTrackingEventsLogger$TrackingEventsWorker$doWork$1, nt.b] */
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
        public Object doWork(@NotNull InterfaceC9557b<? super AbstractC1117c.a> interfaceC9557b) throws Throwable {
            ?? OnFlushFinished;
            ?? M6318g;
            int i10;
            File file;
            ?? r10;
            String strM6318g;
            String strM6318g2;
            String strM6318g3;
            int i11;
            int i12;
            AbstractC11873h abstractC11873hM44436c;
            EncryptedTrackingEventsRequest encryptedTrackingEventsRequest;
            Object objM50805sendEvents0E7RQCE$tracking_events_release;
            ?? companion;
            Object objOnFlushFinished;
            ?? companion2;
            Object objOnFlushFinished2;
            ?? r8;
            ?? r11;
            boolean z10;
            String message;
            Pair[] pairArr;
            C1116b.a aVar;
            int i13;
            C1116b c1116bM6322a;
            AbstractC1117c.a aVarM6340b;
            ?? companion3;
            boolean z11;
            Throwable thM30463e;
            Pair[] pairArr2;
            C1116b.a aVar2;
            int i14;
            AbstractC1117c.a aVarM6340b2;
            if (interfaceC9557b instanceof RealTrackingEventsLogger$TrackingEventsWorker$doWork$1) {
                RealTrackingEventsLogger$TrackingEventsWorker$doWork$1 realTrackingEventsLogger$TrackingEventsWorker$doWork$1 = (RealTrackingEventsLogger$TrackingEventsWorker$doWork$1) interfaceC9557b;
                int i15 = realTrackingEventsLogger$TrackingEventsWorker$doWork$1.label;
                if ((i15 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                    realTrackingEventsLogger$TrackingEventsWorker$doWork$1.label = i15 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                    OnFlushFinished = realTrackingEventsLogger$TrackingEventsWorker$doWork$1;
                } else {
                    OnFlushFinished = new RealTrackingEventsLogger$TrackingEventsWorker$doWork$1(this, interfaceC9557b);
                }
            } else {
                OnFlushFinished = new RealTrackingEventsLogger$TrackingEventsWorker$doWork$1(this, interfaceC9557b);
            }
            Object obj = OnFlushFinished.result;
            Object objM38805e = C10047c.m38805e();
            ?? companion4 = "error_stacktrace";
            ?? M39676a = "error_message";
            switch (OnFlushFinished.label) {
                case 0:
                    C7348o.m30470b(obj);
                    try {
                        M6318g = getInputData().m6318g(RealTrackingEventsLogger.KEY_FLUSH_TOKEN);
                        if (M6318g == 0) {
                            AbstractC1117c.a aVarM6339a = AbstractC1117c.a.m6339a();
                            aVarM6339a.getClass();
                            return aVarM6339a;
                        }
                        try {
                            strM6318g = getInputData().m6318g(RealTrackingEventsLogger.KEY_SESSION_TOKEN);
                            if (strM6318g == null) {
                                AbstractC1117c.a aVarM6339a2 = AbstractC1117c.a.m6339a();
                                aVarM6339a2.getClass();
                                companion4 = TrackingEventsCache.INSTANCE.getInstance();
                                if (companion4 != 0) {
                                    M39676a = C10350l.m39676a(M6318g);
                                    OnFlushFinished.L$0 = M39676a;
                                    OnFlushFinished.L$1 = aVarM6339a2;
                                    OnFlushFinished.I$0 = 0;
                                    OnFlushFinished.label = 2;
                                    OnFlushFinished = companion4.onFlushFinished(M6318g, false, OnFlushFinished);
                                    break;
                                }
                                return aVarM6339a2;
                            }
                            strM6318g2 = getInputData().m6318g(RealTrackingEventsLogger.KEY_SERVER_ENDPOINT);
                            if (strM6318g2 == null) {
                                AbstractC1117c.a aVarM6339a3 = AbstractC1117c.a.m6339a();
                                aVarM6339a3.getClass();
                                companion4 = TrackingEventsCache.INSTANCE.getInstance();
                                if (companion4 != 0) {
                                    OnFlushFinished.L$0 = C10350l.m39676a(M6318g);
                                    OnFlushFinished.L$1 = C10350l.m39676a(strM6318g);
                                    OnFlushFinished.L$2 = aVarM6339a3;
                                    OnFlushFinished.I$0 = 0;
                                    M39676a = 3;
                                    OnFlushFinished.label = 3;
                                    OnFlushFinished = companion4.onFlushFinished(M6318g, false, OnFlushFinished);
                                    break;
                                }
                                return aVarM6339a3;
                            }
                            strM6318g3 = getInputData().m6318g(RealTrackingEventsLogger.KEY_ENCRYPTED_REQUEST_FILE);
                            if (strM6318g3 == null) {
                                AbstractC1117c.a aVarM6339a4 = AbstractC1117c.a.m6339a();
                                aVarM6339a4.getClass();
                                companion4 = TrackingEventsCache.INSTANCE.getInstance();
                                if (companion4 != 0) {
                                    OnFlushFinished.L$0 = C10350l.m39676a(M6318g);
                                    OnFlushFinished.L$1 = C10350l.m39676a(strM6318g);
                                    OnFlushFinished.L$2 = C10350l.m39676a(strM6318g2);
                                    OnFlushFinished.L$3 = aVarM6339a4;
                                    OnFlushFinished.I$0 = 0;
                                    M39676a = 4;
                                    OnFlushFinished.label = 4;
                                    OnFlushFinished = companion4.onFlushFinished(M6318g, false, OnFlushFinished);
                                    break;
                                }
                                return aVarM6339a4;
                            }
                            file = new File(strM6318g3);
                            try {
                                try {
                                    try {
                                        if (!file.exists()) {
                                            AbstractC1117c.a aVarM6339a5 = AbstractC1117c.a.m6339a();
                                            aVarM6339a5.getClass();
                                            file.delete();
                                            companion2 = TrackingEventsCache.INSTANCE.getInstance();
                                            if (companion2 != 0) {
                                                OnFlushFinished.L$0 = C10350l.m39676a(M6318g);
                                                OnFlushFinished.L$1 = C10350l.m39676a(file);
                                                OnFlushFinished.L$2 = C10350l.m39676a(strM6318g);
                                                OnFlushFinished.L$3 = C10350l.m39676a(strM6318g2);
                                                OnFlushFinished.L$4 = C10350l.m39676a(strM6318g3);
                                                OnFlushFinished.L$5 = aVarM6339a5;
                                                OnFlushFinished.I$0 = 0;
                                                M39676a = 5;
                                                OnFlushFinished.label = 5;
                                                objOnFlushFinished2 = companion2.onFlushFinished(M6318g, false, OnFlushFinished);
                                                break;
                                            }
                                            OnFlushFinished = objOnFlushFinished2;
                                            companion4 = companion2;
                                            return aVarM6339a5;
                                        }
                                        abstractC11873hM44436c = new C11888w.b().m44445d().m44436c(EncryptedTrackingEventsRequest.class);
                                        try {
                                            encryptedTrackingEventsRequest = (EncryptedTrackingEventsRequest) abstractC11873hM44436c.fromJson(C11964i.m44651i(file, null, 1, null));
                                        } catch (Exception unused) {
                                            encryptedTrackingEventsRequest = null;
                                        }
                                        if (encryptedTrackingEventsRequest == null) {
                                            AbstractC1117c.a aVarM6339a6 = AbstractC1117c.a.m6339a();
                                            aVarM6339a6.getClass();
                                            file.delete();
                                            companion = TrackingEventsCache.INSTANCE.getInstance();
                                            if (companion != 0) {
                                                OnFlushFinished.L$0 = C10350l.m39676a(M6318g);
                                                OnFlushFinished.L$1 = C10350l.m39676a(file);
                                                OnFlushFinished.L$2 = C10350l.m39676a(strM6318g);
                                                OnFlushFinished.L$3 = C10350l.m39676a(strM6318g2);
                                                OnFlushFinished.L$4 = C10350l.m39676a(strM6318g3);
                                                OnFlushFinished.L$5 = C10350l.m39676a(abstractC11873hM44436c);
                                                OnFlushFinished.L$6 = C10350l.m39676a(encryptedTrackingEventsRequest);
                                                OnFlushFinished.L$7 = aVarM6339a6;
                                                OnFlushFinished.I$0 = 0;
                                                M39676a = 6;
                                                OnFlushFinished.label = 6;
                                                objOnFlushFinished = companion.onFlushFinished(M6318g, false, OnFlushFinished);
                                                break;
                                            }
                                            OnFlushFinished = objOnFlushFinished;
                                            companion4 = companion;
                                            return aVarM6339a6;
                                        }
                                        try {
                                            ?? TrackingEventsService = TrackingEventsServiceComponentManager.INSTANCE.getInstance(this.context, strM6318g2).trackingEventsService();
                                            OnFlushFinished.L$0 = M6318g;
                                            OnFlushFinished.L$1 = file;
                                            OnFlushFinished.L$2 = C10350l.m39676a(strM6318g);
                                            OnFlushFinished.L$3 = C10350l.m39676a(strM6318g2);
                                            OnFlushFinished.L$4 = C10350l.m39676a(strM6318g3);
                                            OnFlushFinished.L$5 = C10350l.m39676a(abstractC11873hM44436c);
                                            OnFlushFinished.L$6 = C10350l.m39676a(encryptedTrackingEventsRequest);
                                            OnFlushFinished.I$0 = 1;
                                            OnFlushFinished.label = 7;
                                            objM50805sendEvents0E7RQCE$tracking_events_release = TrackingEventsService.m50805sendEvents0E7RQCE$tracking_events_release(strM6318g, encryptedTrackingEventsRequest, OnFlushFinished);
                                            if (objM50805sendEvents0E7RQCE$tracking_events_release != objM38805e) {
                                                r10 = M6318g;
                                                i10 = 1;
                                                thM30463e = C7347n.m30463e(objM50805sendEvents0E7RQCE$tracking_events_release);
                                                if (thM30463e == null) {
                                                    aVarM6340b2 = AbstractC1117c.a.m6342d();
                                                } else {
                                                    pairArr2 = new Pair[]{C7352s.m30477a("error_message", thM30463e.getMessage()), C7352s.m30477a("error_stacktrace", C7328a.m30430b(thM30463e))};
                                                    aVar2 = new C1116b.a();
                                                    for (i14 = 0; i14 < 2; i14++) {
                                                        Pair pair = pairArr2[i14];
                                                        aVar2.m6323b((String) pair.m31673c(), pair.m31674d());
                                                    }
                                                    aVarM6340b2 = AbstractC1117c.a.m6340b(aVar2.m6322a());
                                                }
                                                aVarM6340b2.getClass();
                                                if (file != null) {
                                                    C10340b.m39658a(file.delete());
                                                }
                                                if (r10 != 0 && (r1 = TrackingEventsCache.INSTANCE.getInstance()) != 0) {
                                                    if (i10 != 0) {
                                                        companion4 = 1;
                                                    } else {
                                                        companion4 = 0;
                                                    }
                                                    OnFlushFinished.L$0 = C10350l.m39676a(r10);
                                                    OnFlushFinished.L$1 = C10350l.m39676a(file);
                                                    OnFlushFinished.L$2 = C10350l.m39676a(strM6318g);
                                                    OnFlushFinished.L$3 = C10350l.m39676a(strM6318g2);
                                                    OnFlushFinished.L$4 = C10350l.m39676a(strM6318g3);
                                                    OnFlushFinished.L$5 = C10350l.m39676a(abstractC11873hM44436c);
                                                    OnFlushFinished.L$6 = C10350l.m39676a(encryptedTrackingEventsRequest);
                                                    M39676a = C10350l.m39676a(objM50805sendEvents0E7RQCE$tracking_events_release);
                                                    OnFlushFinished.L$7 = M39676a;
                                                    OnFlushFinished.L$8 = aVarM6340b2;
                                                    OnFlushFinished.I$0 = i10;
                                                    M6318g = 8;
                                                    OnFlushFinished.label = 8;
                                                    break;
                                                }
                                                return aVarM6340b2;
                                            }
                                        } catch (Exception e10) {
                                            e = e10;
                                            i11 = 1;
                                            OnFlushFinished = OnFlushFinished;
                                            companion4 = companion4;
                                            M39676a = M39676a;
                                            int i16 = i11;
                                            r10 = M6318g;
                                            i10 = i16;
                                            message = e.getMessage();
                                            if (message == null) {
                                                message = "Unknown error";
                                            }
                                            pairArr = new Pair[]{C7352s.m30477a(M39676a, message), C7352s.m30477a(companion4, C7328a.m30430b(e))};
                                            aVar = new C1116b.a();
                                            for (i13 = 0; i13 < 2; i13++) {
                                                Pair pair2 = pairArr[i13];
                                                aVar.m6323b((String) pair2.m31673c(), pair2.m31674d());
                                            }
                                            c1116bM6322a = aVar.m6322a();
                                            aVarM6340b = AbstractC1117c.a.m6340b(c1116bM6322a);
                                            aVarM6340b.getClass();
                                            if (file != null) {
                                                C10340b.m39658a(file.delete());
                                            }
                                            if (r10 != 0) {
                                                if (i10 != 0) {
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                OnFlushFinished.L$0 = C10350l.m39676a(r10);
                                                OnFlushFinished.L$1 = C10350l.m39676a(file);
                                                OnFlushFinished.L$2 = C10350l.m39676a(e);
                                                OnFlushFinished.L$3 = C10350l.m39676a(c1116bM6322a);
                                                OnFlushFinished.L$4 = aVarM6340b;
                                                OnFlushFinished.L$5 = null;
                                                OnFlushFinished.L$6 = null;
                                                OnFlushFinished.I$0 = i10;
                                                OnFlushFinished.label = 9;
                                                if (companion3.onFlushFinished(r10, z11, OnFlushFinished) == objM38805e) {
                                                }
                                            }
                                            return aVarM6340b;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            i12 = 1;
                                            r11 = OnFlushFinished;
                                            r8 = M6318g;
                                            if (file != null) {
                                                C10340b.m39658a(file.delete());
                                            }
                                            if (r8 != 0) {
                                                if (i12 != 0) {
                                                    z10 = true;
                                                } else {
                                                    z10 = false;
                                                }
                                                r11.L$0 = C10350l.m39676a(r8);
                                                r11.L$1 = C10350l.m39676a(file);
                                                r11.L$2 = th;
                                                r11.L$3 = null;
                                                r11.L$4 = null;
                                                r11.L$5 = null;
                                                r11.L$6 = null;
                                                r11.I$0 = i12;
                                                r11.label = 10;
                                                break;
                                            }
                                            throw th;
                                        }
                                        OnFlushFinished = objOnFlushFinished;
                                        companion4 = companion;
                                        OnFlushFinished = objOnFlushFinished2;
                                        companion4 = companion2;
                                    } catch (Exception e11) {
                                        e = e11;
                                        i11 = 0;
                                        OnFlushFinished = OnFlushFinished;
                                        companion4 = companion4;
                                        M39676a = M39676a;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    i12 = 0;
                                    r11 = OnFlushFinished;
                                    r8 = M6318g;
                                }
                            } catch (Exception e12) {
                                e = e12;
                                i11 = 0;
                                OnFlushFinished = OnFlushFinished;
                                companion4 = companion4;
                                M39676a = M39676a;
                            } catch (Throwable th4) {
                                th = th4;
                                i12 = 0;
                                r11 = OnFlushFinished;
                                r8 = M6318g;
                                if (file != null) {
                                    C10340b.m39658a(file.delete());
                                }
                                if (r8 != 0) {
                                    if (i12 != 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    r11.L$0 = C10350l.m39676a(r8);
                                    r11.L$1 = C10350l.m39676a(file);
                                    r11.L$2 = th;
                                    r11.L$3 = null;
                                    r11.L$4 = null;
                                    r11.L$5 = null;
                                    r11.L$6 = null;
                                    r11.I$0 = i12;
                                    r11.label = 10;
                                    break;
                                }
                                throw th;
                            }
                            break;
                            break;
                        } catch (Exception e13) {
                            e = e13;
                            r10 = M6318g;
                            i10 = 0;
                            file = null;
                        } catch (Throwable th5) {
                            th = th5;
                            file = null;
                            i12 = 0;
                            r11 = OnFlushFinished;
                            r8 = M6318g;
                            if (file != null) {
                                C10340b.m39658a(file.delete());
                            }
                            if (r8 != 0) {
                                if (i12 != 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                r11.L$0 = C10350l.m39676a(r8);
                                r11.L$1 = C10350l.m39676a(file);
                                r11.L$2 = th;
                                r11.L$3 = null;
                                r11.L$4 = null;
                                r11.L$5 = null;
                                r11.L$6 = null;
                                r11.I$0 = i12;
                                r11.label = 10;
                                break;
                            }
                            throw th;
                        }
                        return objM38805e;
                    } catch (Exception e14) {
                        e = e14;
                        i10 = 0;
                        file = null;
                        r10 = 0;
                    } catch (Throwable th6) {
                        th = th6;
                        M6318g = 0;
                        file = null;
                        i12 = 0;
                        r11 = OnFlushFinished;
                        r8 = M6318g;
                        if (file != null) {
                            C10340b.m39658a(file.delete());
                        }
                        if (r8 != 0) {
                            if (i12 != 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            r11.L$0 = C10350l.m39676a(r8);
                            r11.L$1 = C10350l.m39676a(file);
                            r11.L$2 = th;
                            r11.L$3 = null;
                            r11.L$4 = null;
                            r11.L$5 = null;
                            r11.L$6 = null;
                            r11.I$0 = i12;
                            r11.label = 10;
                            break;
                        }
                        throw th;
                    }
                    message = e.getMessage();
                    if (message == null) {
                        message = "Unknown error";
                    }
                    pairArr = new Pair[]{C7352s.m30477a(M39676a, message), C7352s.m30477a(companion4, C7328a.m30430b(e))};
                    aVar = new C1116b.a();
                    while (i13 < 2) {
                        Pair pair3 = pairArr[i13];
                        aVar.m6323b((String) pair3.m31673c(), pair3.m31674d());
                    }
                    c1116bM6322a = aVar.m6322a();
                    aVarM6340b = AbstractC1117c.a.m6340b(c1116bM6322a);
                    aVarM6340b.getClass();
                    if (file != null) {
                        C10340b.m39658a(file.delete());
                    }
                    if (r10 != 0 && (companion3 = TrackingEventsCache.INSTANCE.getInstance()) != 0) {
                        if (i10 != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        OnFlushFinished.L$0 = C10350l.m39676a(r10);
                        OnFlushFinished.L$1 = C10350l.m39676a(file);
                        OnFlushFinished.L$2 = C10350l.m39676a(e);
                        OnFlushFinished.L$3 = C10350l.m39676a(c1116bM6322a);
                        OnFlushFinished.L$4 = aVarM6340b;
                        OnFlushFinished.L$5 = null;
                        OnFlushFinished.L$6 = null;
                        OnFlushFinished.I$0 = i10;
                        OnFlushFinished.label = 9;
                        if (companion3.onFlushFinished(r10, z11, OnFlushFinished) == objM38805e) {
                            return objM38805e;
                        }
                    }
                    return aVarM6340b;
                case 1:
                    AbstractC1117c.a aVar3 = (AbstractC1117c.a) OnFlushFinished.L$0;
                    C7348o.m30470b(obj);
                    return aVar3;
                case 2:
                    AbstractC1117c.a aVar4 = (AbstractC1117c.a) OnFlushFinished.L$1;
                    C7348o.m30470b(obj);
                    return aVar4;
                case 3:
                    AbstractC1117c.a aVar5 = (AbstractC1117c.a) OnFlushFinished.L$2;
                    C7348o.m30470b(obj);
                    return aVar5;
                case 4:
                    AbstractC1117c.a aVar6 = (AbstractC1117c.a) OnFlushFinished.L$3;
                    C7348o.m30470b(obj);
                    return aVar6;
                case 5:
                    AbstractC1117c.a aVar7 = (AbstractC1117c.a) OnFlushFinished.L$5;
                    C7348o.m30470b(obj);
                    return aVar7;
                case 6:
                    AbstractC1117c.a aVar8 = (AbstractC1117c.a) OnFlushFinished.L$7;
                    C7348o.m30470b(obj);
                    return aVar8;
                case 7:
                    i10 = OnFlushFinished.I$0;
                    encryptedTrackingEventsRequest = (EncryptedTrackingEventsRequest) OnFlushFinished.L$6;
                    abstractC11873hM44436c = (AbstractC11873h) OnFlushFinished.L$5;
                    strM6318g3 = (String) OnFlushFinished.L$4;
                    strM6318g2 = (String) OnFlushFinished.L$3;
                    strM6318g = (String) OnFlushFinished.L$2;
                    file = (File) OnFlushFinished.L$1;
                    r10 = (String) OnFlushFinished.L$0;
                    try {
                        try {
                            C7348o.m30470b(obj);
                            objM50805sendEvents0E7RQCE$tracking_events_release = ((C7347n) obj).getValue();
                            r10 = r10;
                            thM30463e = C7347n.m30463e(objM50805sendEvents0E7RQCE$tracking_events_release);
                            if (thM30463e == null) {
                                aVarM6340b2 = AbstractC1117c.a.m6342d();
                            } else {
                                pairArr2 = new Pair[]{C7352s.m30477a("error_message", thM30463e.getMessage()), C7352s.m30477a("error_stacktrace", C7328a.m30430b(thM30463e))};
                                aVar2 = new C1116b.a();
                                while (i14 < 2) {
                                    Pair pair4 = pairArr2[i14];
                                    aVar2.m6323b((String) pair4.m31673c(), pair4.m31674d());
                                }
                                aVarM6340b2 = AbstractC1117c.a.m6340b(aVar2.m6322a());
                            }
                            aVarM6340b2.getClass();
                            if (file != null) {
                                C10340b.m39658a(file.delete());
                            }
                            if (r10 != 0) {
                                if (i10 != 0) {
                                    companion4 = 1;
                                } else {
                                    companion4 = 0;
                                }
                                OnFlushFinished.L$0 = C10350l.m39676a(r10);
                                OnFlushFinished.L$1 = C10350l.m39676a(file);
                                OnFlushFinished.L$2 = C10350l.m39676a(strM6318g);
                                OnFlushFinished.L$3 = C10350l.m39676a(strM6318g2);
                                OnFlushFinished.L$4 = C10350l.m39676a(strM6318g3);
                                OnFlushFinished.L$5 = C10350l.m39676a(abstractC11873hM44436c);
                                OnFlushFinished.L$6 = C10350l.m39676a(encryptedTrackingEventsRequest);
                                M39676a = C10350l.m39676a(objM50805sendEvents0E7RQCE$tracking_events_release);
                                OnFlushFinished.L$7 = M39676a;
                                OnFlushFinished.L$8 = aVarM6340b2;
                                OnFlushFinished.I$0 = i10;
                                M6318g = 8;
                                OnFlushFinished.label = 8;
                                break;
                            }
                            return aVarM6340b2;
                        } catch (Exception e15) {
                            e = e15;
                            message = e.getMessage();
                            if (message == null) {
                                message = "Unknown error";
                            }
                            pairArr = new Pair[]{C7352s.m30477a(M39676a, message), C7352s.m30477a(companion4, C7328a.m30430b(e))};
                            aVar = new C1116b.a();
                            while (i13 < 2) {
                                Pair pair5 = pairArr[i13];
                                aVar.m6323b((String) pair5.m31673c(), pair5.m31674d());
                            }
                            c1116bM6322a = aVar.m6322a();
                            aVarM6340b = AbstractC1117c.a.m6340b(c1116bM6322a);
                            aVarM6340b.getClass();
                            if (file != null) {
                                C10340b.m39658a(file.delete());
                            }
                            if (r10 != 0) {
                                if (i10 != 0) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                OnFlushFinished.L$0 = C10350l.m39676a(r10);
                                OnFlushFinished.L$1 = C10350l.m39676a(file);
                                OnFlushFinished.L$2 = C10350l.m39676a(e);
                                OnFlushFinished.L$3 = C10350l.m39676a(c1116bM6322a);
                                OnFlushFinished.L$4 = aVarM6340b;
                                OnFlushFinished.L$5 = null;
                                OnFlushFinished.L$6 = null;
                                OnFlushFinished.I$0 = i10;
                                OnFlushFinished.label = 9;
                                if (companion3.onFlushFinished(r10, z11, OnFlushFinished) == objM38805e) {
                                }
                            }
                            return aVarM6340b;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        ?? r19 = r10;
                        i12 = i10;
                        r8 = r19;
                        r11 = OnFlushFinished;
                        if (file != null) {
                            C10340b.m39658a(file.delete());
                        }
                        if (r8 != 0 && (r1 = TrackingEventsCache.INSTANCE.getInstance()) != 0) {
                            if (i12 != 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            r11.L$0 = C10350l.m39676a(r8);
                            r11.L$1 = C10350l.m39676a(file);
                            r11.L$2 = th;
                            r11.L$3 = null;
                            r11.L$4 = null;
                            r11.L$5 = null;
                            r11.L$6 = null;
                            r11.I$0 = i12;
                            r11.label = 10;
                            break;
                        }
                        throw th;
                    }
                case 8:
                    AbstractC1117c.a aVar9 = (AbstractC1117c.a) OnFlushFinished.L$8;
                    C7348o.m30470b(obj);
                    return aVar9;
                case 9:
                    AbstractC1117c.a aVar10 = (AbstractC1117c.a) OnFlushFinished.L$4;
                    C7348o.m30470b(obj);
                    return aVar10;
                case 10:
                    Throwable th8 = (Throwable) OnFlushFinished.L$2;
                    C7348o.m30470b(obj);
                    throw th8;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.tracking.RealTrackingEventsLogger$fetchPublicKey$1 */
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.tracking.RealTrackingEventsLogger", m39664f = "RealTrackingEventsLogger.kt", m39665l = {255}, m39666m = "fetchPublicKey")
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C41001 extends AbstractC10342d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C41001(InterfaceC9557b<? super C41001> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return RealTrackingEventsLogger.this.fetchPublicKey(this);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.tracking.RealTrackingEventsLogger$flush$1 */
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.tracking.RealTrackingEventsLogger", m39664f = "RealTrackingEventsLogger.kt", m39665l = {570, 573, 583, 585, 587, 616}, m39666m = "flush")
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C41011 extends AbstractC10342d {
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

        public C41011(InterfaceC9557b<? super C41011> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return RealTrackingEventsLogger.this.flush(this);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.tracking.RealTrackingEventsLogger$logEvent$1 */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.tracking.RealTrackingEventsLogger$logEvent$1", m39664f = "RealTrackingEventsLogger.kt", m39665l = {549, 551, 553, 555}, m39666m = "invokeSuspend")
    public static final class C41021 extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {
        final /* synthetic */ TrackingEvent $event;
        final /* synthetic */ boolean $force;
        int I$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41021(TrackingEvent trackingEvent, boolean z10, InterfaceC9557b<? super C41021> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.$event = trackingEvent;
            this.$force = z10;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return RealTrackingEventsLogger.this.new C41021(this.$event, this.$force, interfaceC9557b);
        }

        /* JADX WARN: Code duplicated, block: B:35:0x0071 A[Catch: Exception -> 0x007e, TRY_LEAVE, TryCatch #0 {Exception -> 0x007e, blocks: (B:11:0x001d, B:31:0x0065, B:35:0x0071, B:12:0x0021, B:13:0x0025, B:21:0x0045, B:23:0x0049, B:26:0x0054, B:28:0x005c, B:16:0x002c, B:18:0x0034), top: B:41:0x000a }] */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x007b, code lost:
        
            if (r1.flush(r7) == r0) goto L37;
         */
        @Override // pt.AbstractC10339a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int iIntValue;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.label;
            try {
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                C7348o.m30470b(obj);
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
                        C7348o.m30470b(obj);
                    } else {
                        C7348o.m30470b(obj);
                    }
                    return Unit.f29331a;
                }
                C7348o.m30470b(obj);
                TrackingEventsCache companion = TrackingEventsCache.INSTANCE.getInstance();
                if (companion != null) {
                    String str = RealTrackingEventsLogger.this.id;
                    TrackingEvent trackingEvent = this.$event;
                    this.label = 1;
                    if (companion.add(str, trackingEvent, this) == objM38805e) {
                    }
                    return objM38805e;
                }
                if (this.$force) {
                    RealTrackingEventsLogger realTrackingEventsLogger2 = RealTrackingEventsLogger.this;
                    this.label = 2;
                    if (realTrackingEventsLogger2.flush(this) == objM38805e) {
                    }
                    return Unit.f29331a;
                }
                TrackingEventsCache companion2 = TrackingEventsCache.INSTANCE.getInstance();
                if (companion2 == null) {
                    iIntValue = 0;
                    if (iIntValue >= 10) {
                        RealTrackingEventsLogger realTrackingEventsLogger3 = RealTrackingEventsLogger.this;
                        this.I$0 = iIntValue;
                        this.label = 4;
                    }
                    return Unit.f29331a;
                }
                this.label = 3;
                obj = companion2.currentCount(this);
                if (obj != objM38805e) {
                    iIntValue = ((Number) obj).intValue();
                    if (iIntValue >= 10) {
                        RealTrackingEventsLogger realTrackingEventsLogger4 = RealTrackingEventsLogger.this;
                        this.I$0 = iIntValue;
                        this.label = 4;
                    }
                    return Unit.f29331a;
                }
                return objM38805e;
            } catch (Exception unused) {
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((C41021) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    public RealTrackingEventsLogger(@NotNull Context context, @NotNull TrackingEventsCache trackingEventsCache, @NotNull C11888w c11888w, @NotNull TrackingMetadataProvider trackingMetadataProvider, @NotNull C10700c c10700c, @NotNull C6159e c6159e, @NotNull String str, @NotNull InterfaceC7906p0 interfaceC7906p0, @NotNull NetworkStateManager networkStateManager) {
        context.getClass();
        trackingEventsCache.getClass();
        c11888w.getClass();
        trackingMetadataProvider.getClass();
        c10700c.getClass();
        c6159e.getClass();
        str.getClass();
        interfaceC7906p0.getClass();
        networkStateManager.getClass();
        this.context = context;
        this.cache = trackingEventsCache;
        this.moshi = c11888w;
        this.metadataProvider = trackingMetadataProvider;
        this.sdkFilesManager = c10700c;
        this.featureFlagManager = c6159e;
        this.trackingEventServerEndpoint = str;
        this.coroutineScope = interfaceC7906p0;
        this.networkStateManager = networkStateManager;
        this.workManager = AbstractC12719p0.INSTANCE.m47401a(context);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.ROOT);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        this.iso8601Formatter = simpleDateFormat;
        this.id = AbstractC4109a.m20954a();
        this.trackingEventsUrl = str;
        trackingEventsJsonAdapter = c11888w.m44437d(C11866a0.m44298j(List.class, TrackingEvent.class));
        TrackingEventsCache.INSTANCE.setInstance(trackingEventsCache);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object fetchPublicKey(InterfaceC9557b<? super PublicKeyResponse> interfaceC9557b) {
        C41001 c41001;
        Object objM50804getPublicKeygIAlus$tracking_events_release;
        if (interfaceC9557b instanceof C41001) {
            c41001 = (C41001) interfaceC9557b;
            int i10 = c41001.label;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                c41001.label = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                c41001 = new C41001(interfaceC9557b);
            }
        } else {
            c41001 = new C41001(interfaceC9557b);
        }
        Object obj = c41001.result;
        Object objM38805e = C10047c.m38805e();
        int i11 = c41001.label;
        try {
            if (i11 == 0) {
                C7348o.m30470b(obj);
                PublicKeyResponse publicKeyResponse = this.cachedPublicKeyResponse;
                if (publicKeyResponse != null) {
                    return publicKeyResponse;
                }
                String str = this.sessionToken;
                if (str == null) {
                    return null;
                }
                TrackingEventsService trackingEventsService = TrackingEventsServiceComponentManager.INSTANCE.getInstance(this.context, this.trackingEventsUrl).trackingEventsService();
                c41001.L$0 = C10350l.m39676a(str);
                c41001.label = 1;
                objM50804getPublicKeygIAlus$tracking_events_release = trackingEventsService.m50804getPublicKeygIAlus$tracking_events_release(str, c41001);
                if (objM50804getPublicKeygIAlus$tracking_events_release == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                objM50804getPublicKeygIAlus$tracking_events_release = ((C7347n) obj).getValue();
            }
            if (C7347n.m30465g(objM50804getPublicKeygIAlus$tracking_events_release)) {
                objM50804getPublicKeygIAlus$tracking_events_release = null;
            }
            PublicKeyResponse publicKeyResponse2 = (PublicKeyResponse) objM50804getPublicKeygIAlus$tracking_events_release;
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
    public final Object flush(InterfaceC9557b<? super Unit> interfaceC9557b) {
        C41011 c41011;
        String str;
        TrackingEventsCache trackingEventsCache;
        String str2;
        String str3;
        TrackingEventFlushSession trackingEventFlushSession;
        String str4;
        File fileM40781d;
        String str5;
        TrackingEventsCache trackingEventsCache2;
        TrackingEventFlushSession trackingEventFlushSession2;
        C12694d c12694dM47345a;
        AbstractC11873h<List<TrackingEvent>> abstractC11873h;
        String json;
        Object objFetchPublicKey;
        C12694d c12694d;
        TrackingEventsCache trackingEventsCache3;
        String str6;
        TrackingEventFlushSession trackingEventFlushSession3;
        PublicKeyResponse publicKeyResponse;
        String str7;
        Object objCreateTrackingEventsRequest;
        PublicKeyResponse publicKeyResponse2;
        String str8;
        C12694d c12694d2;
        String str9;
        EncryptedTrackingEventsRequest encryptedTrackingEventsRequest;
        Pair[] pairArr;
        C1116b.a aVar;
        int i10;
        String token;
        if (interfaceC9557b instanceof C41011) {
            c41011 = (C41011) interfaceC9557b;
            int i11 = c41011.label;
            if ((i11 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                c41011.label = i11 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                c41011 = new C41011(interfaceC9557b);
            }
        } else {
            c41011 = new C41011(interfaceC9557b);
        }
        Object obj = c41011.result;
        Object objM38805e = C10047c.m38805e();
        switch (c41011.label) {
            case 0:
                C7348o.m30470b(obj);
                TrackingEventsCache companion = TrackingEventsCache.INSTANCE.getInstance();
                if (companion != null && (str = this.sessionToken) != null) {
                    String str10 = this.trackingEventsUrl;
                    String str11 = this.id;
                    c41011.L$0 = companion;
                    c41011.L$1 = str;
                    c41011.L$2 = str10;
                    c41011.label = 1;
                    Object objBeginFlush = companion.beginFlush(str11, c41011);
                    if (objBeginFlush != objM38805e) {
                        trackingEventsCache = companion;
                        obj = objBeginFlush;
                        str2 = str;
                        str3 = str10;
                        trackingEventFlushSession = (TrackingEventFlushSession) obj;
                        if (!trackingEventFlushSession.getTrackingEvents().isEmpty()) {
                            try {
                                c12694dM47345a = new C12694d.a().m47346b(EnumC12734x.CONNECTED).m47345a();
                                abstractC11873h = trackingEventsJsonAdapter;
                                if (abstractC11873h != null) {
                                    json = abstractC11873h.toJson(trackingEventFlushSession.getTrackingEvents());
                                } else {
                                    json = null;
                                }
                                c41011.L$0 = trackingEventsCache;
                                c41011.L$1 = str2;
                                c41011.L$2 = str3;
                                c41011.L$3 = trackingEventFlushSession;
                                c41011.L$4 = c12694dM47345a;
                                c41011.L$5 = json;
                                c41011.label = 3;
                                objFetchPublicKey = fetchPublicKey(c41011);
                                if (objFetchPublicKey != objM38805e) {
                                    c12694d = c12694dM47345a;
                                    obj = objFetchPublicKey;
                                    trackingEventsCache3 = trackingEventsCache;
                                    str6 = str3;
                                    trackingEventFlushSession3 = trackingEventFlushSession;
                                    try {
                                        publicKeyResponse = (PublicKeyResponse) obj;
                                        Companion companion2 = INSTANCE;
                                        if (json == null) {
                                            str7 = "";
                                        } else {
                                            str7 = json;
                                        }
                                        c41011.L$0 = trackingEventsCache3;
                                        c41011.L$1 = str2;
                                        c41011.L$2 = str6;
                                        c41011.L$3 = trackingEventFlushSession3;
                                        c41011.L$4 = c12694d;
                                        c41011.L$5 = C10350l.m39676a(json);
                                        c41011.L$6 = C10350l.m39676a(publicKeyResponse);
                                        c41011.label = 4;
                                        objCreateTrackingEventsRequest = companion2.createTrackingEventsRequest(str7, publicKeyResponse, c41011);
                                        if (objCreateTrackingEventsRequest != objM38805e) {
                                            TrackingEventFlushSession trackingEventFlushSession4 = trackingEventFlushSession3;
                                            publicKeyResponse2 = publicKeyResponse;
                                            obj = objCreateTrackingEventsRequest;
                                            str5 = str2;
                                            str8 = json;
                                            trackingEventsCache2 = trackingEventsCache3;
                                            c12694d2 = c12694d;
                                            str9 = str6;
                                            trackingEventFlushSession2 = trackingEventFlushSession4;
                                            try {
                                                encryptedTrackingEventsRequest = (EncryptedTrackingEventsRequest) obj;
                                                if (encryptedTrackingEventsRequest != null) {
                                                    fileM40781d = this.sdkFilesManager.m40781d("json");
                                                    try {
                                                        String json2 = new C11888w.b().m44445d().m44436c(EncryptedTrackingEventsRequest.class).toJson(encryptedTrackingEventsRequest);
                                                        json2.getClass();
                                                        C11964i.m44653k(fileM40781d, json2, null, 2, null);
                                                        C12738z.a aVarM47416k = new C12738z.a(TrackingEventsWorker.class).m47416k(c12694d2);
                                                        pairArr = new Pair[]{C7352s.m30477a(KEY_SERVER_ENDPOINT, str9), C7352s.m30477a(KEY_SESSION_TOKEN, str5), C7352s.m30477a(KEY_ENCRYPTED_REQUEST_FILE, fileM40781d.getAbsolutePath()), C7352s.m30477a(KEY_FLUSH_TOKEN, trackingEventFlushSession2.getToken())};
                                                        aVar = new C1116b.a();
                                                        for (i10 = 0; i10 < 4; i10++) {
                                                            Pair pair = pairArr[i10];
                                                            aVar.m6323b((String) pair.m31673c(), pair.m31674d());
                                                        }
                                                        C12738z c12738zM47409b = aVarM47416k.m47420o(aVar.m6322a()).m47409b();
                                                        AbstractC12719p0 abstractC12719p0 = this.workManager;
                                                        String strM30296b = C7271m.m30296b(str5);
                                                        String name = fileM40781d.getName();
                                                        name.getClass();
                                                        abstractC12719p0.m47400g(WORK_NAME_PREFIX + strM30296b + "_" + C7271m.m30296b(name), EnumC12706j.REPLACE, c12738zM47409b);
                                                        break;
                                                    } catch (Exception e10) {
                                                        e = e10;
                                                        str4 = str9;
                                                        if (fileM40781d != null) {
                                                            C10340b.m39658a(fileM40781d.delete());
                                                        }
                                                        String token2 = trackingEventFlushSession2.getToken();
                                                        c41011.L$0 = C10350l.m39676a(trackingEventsCache2);
                                                        c41011.L$1 = C10350l.m39676a(str5);
                                                        c41011.L$2 = C10350l.m39676a(str4);
                                                        c41011.L$3 = C10350l.m39676a(fileM40781d);
                                                        c41011.L$4 = C10350l.m39676a(trackingEventFlushSession2);
                                                        c41011.L$5 = C10350l.m39676a(e);
                                                        c41011.L$6 = null;
                                                        c41011.L$7 = null;
                                                        c41011.label = 6;
                                                        break;
                                                    }
                                                    return Unit.f29331a;
                                                }
                                                token = trackingEventFlushSession2.getToken();
                                                c41011.L$0 = trackingEventsCache2;
                                                c41011.L$1 = C10350l.m39676a(str5);
                                                c41011.L$2 = C10350l.m39676a(str9);
                                                c41011.L$3 = trackingEventFlushSession2;
                                                c41011.L$4 = C10350l.m39676a(c12694d2);
                                                c41011.L$5 = C10350l.m39676a(str8);
                                                c41011.L$6 = C10350l.m39676a(publicKeyResponse2);
                                                c41011.L$7 = C10350l.m39676a(encryptedTrackingEventsRequest);
                                                c41011.label = 5;
                                                if (trackingEventsCache2.onFlushFinished(token, false, c41011) != objM38805e) {
                                                    trackingEventFlushSession3 = trackingEventFlushSession2;
                                                    str4 = str9;
                                                    return Unit.f29331a;
                                                }
                                            } catch (Exception e11) {
                                                e = e11;
                                                fileM40781d = null;
                                            }
                                        }
                                    } catch (Exception e12) {
                                        e = e12;
                                        str5 = str2;
                                        str4 = str6;
                                        trackingEventsCache2 = trackingEventsCache3;
                                        trackingEventFlushSession2 = trackingEventFlushSession3;
                                        fileM40781d = null;
                                        if (fileM40781d != null) {
                                            C10340b.m39658a(fileM40781d.delete());
                                        }
                                        String token3 = trackingEventFlushSession2.getToken();
                                        c41011.L$0 = C10350l.m39676a(trackingEventsCache2);
                                        c41011.L$1 = C10350l.m39676a(str5);
                                        c41011.L$2 = C10350l.m39676a(str4);
                                        c41011.L$3 = C10350l.m39676a(fileM40781d);
                                        c41011.L$4 = C10350l.m39676a(trackingEventFlushSession2);
                                        c41011.L$5 = C10350l.m39676a(e);
                                        c41011.L$6 = null;
                                        c41011.L$7 = null;
                                        c41011.label = 6;
                                        break;
                                    }
                                }
                            } catch (Exception e13) {
                                e = e13;
                                str4 = str3;
                                fileM40781d = null;
                                str5 = str2;
                                trackingEventsCache2 = trackingEventsCache;
                                trackingEventFlushSession2 = trackingEventFlushSession;
                                if (fileM40781d != null) {
                                    C10340b.m39658a(fileM40781d.delete());
                                }
                                String token4 = trackingEventFlushSession2.getToken();
                                c41011.L$0 = C10350l.m39676a(trackingEventsCache2);
                                c41011.L$1 = C10350l.m39676a(str5);
                                c41011.L$2 = C10350l.m39676a(str4);
                                c41011.L$3 = C10350l.m39676a(fileM40781d);
                                c41011.L$4 = C10350l.m39676a(trackingEventFlushSession2);
                                c41011.L$5 = C10350l.m39676a(e);
                                c41011.L$6 = null;
                                c41011.L$7 = null;
                                c41011.label = 6;
                                break;
                            }
                        } else {
                            String token5 = trackingEventFlushSession.getToken();
                            c41011.L$0 = C10350l.m39676a(trackingEventsCache);
                            c41011.L$1 = C10350l.m39676a(str2);
                            c41011.L$2 = C10350l.m39676a(str3);
                            c41011.L$3 = C10350l.m39676a(trackingEventFlushSession);
                            c41011.label = 2;
                            break;
                        }
                    }
                    return objM38805e;
                }
                return Unit.f29331a;
            case 1:
                str3 = (String) c41011.L$2;
                str2 = (String) c41011.L$1;
                trackingEventsCache = (TrackingEventsCache) c41011.L$0;
                C7348o.m30470b(obj);
                trackingEventFlushSession = (TrackingEventFlushSession) obj;
                if (!trackingEventFlushSession.getTrackingEvents().isEmpty()) {
                    String token6 = trackingEventFlushSession.getToken();
                    c41011.L$0 = C10350l.m39676a(trackingEventsCache);
                    c41011.L$1 = C10350l.m39676a(str2);
                    c41011.L$2 = C10350l.m39676a(str3);
                    c41011.L$3 = C10350l.m39676a(trackingEventFlushSession);
                    c41011.label = 2;
                    break;
                } else {
                    c12694dM47345a = new C12694d.a().m47346b(EnumC12734x.CONNECTED).m47345a();
                    abstractC11873h = trackingEventsJsonAdapter;
                    if (abstractC11873h != null) {
                        json = abstractC11873h.toJson(trackingEventFlushSession.getTrackingEvents());
                    } else {
                        json = null;
                    }
                    c41011.L$0 = trackingEventsCache;
                    c41011.L$1 = str2;
                    c41011.L$2 = str3;
                    c41011.L$3 = trackingEventFlushSession;
                    c41011.L$4 = c12694dM47345a;
                    c41011.L$5 = json;
                    c41011.label = 3;
                    objFetchPublicKey = fetchPublicKey(c41011);
                    if (objFetchPublicKey != objM38805e) {
                        c12694d = c12694dM47345a;
                        obj = objFetchPublicKey;
                        trackingEventsCache3 = trackingEventsCache;
                        str6 = str3;
                        trackingEventFlushSession3 = trackingEventFlushSession;
                        publicKeyResponse = (PublicKeyResponse) obj;
                        Companion companion3 = INSTANCE;
                        if (json == null) {
                            str7 = "";
                        } else {
                            str7 = json;
                        }
                        c41011.L$0 = trackingEventsCache3;
                        c41011.L$1 = str2;
                        c41011.L$2 = str6;
                        c41011.L$3 = trackingEventFlushSession3;
                        c41011.L$4 = c12694d;
                        c41011.L$5 = C10350l.m39676a(json);
                        c41011.L$6 = C10350l.m39676a(publicKeyResponse);
                        c41011.label = 4;
                        objCreateTrackingEventsRequest = companion3.createTrackingEventsRequest(str7, publicKeyResponse, c41011);
                        if (objCreateTrackingEventsRequest != objM38805e) {
                            TrackingEventFlushSession trackingEventFlushSession5 = trackingEventFlushSession3;
                            publicKeyResponse2 = publicKeyResponse;
                            obj = objCreateTrackingEventsRequest;
                            str5 = str2;
                            str8 = json;
                            trackingEventsCache2 = trackingEventsCache3;
                            c12694d2 = c12694d;
                            str9 = str6;
                            trackingEventFlushSession2 = trackingEventFlushSession5;
                            encryptedTrackingEventsRequest = (EncryptedTrackingEventsRequest) obj;
                            if (encryptedTrackingEventsRequest != null) {
                                fileM40781d = this.sdkFilesManager.m40781d("json");
                                String json3 = new C11888w.b().m44445d().m44436c(EncryptedTrackingEventsRequest.class).toJson(encryptedTrackingEventsRequest);
                                json3.getClass();
                                C11964i.m44653k(fileM40781d, json3, null, 2, null);
                                C12738z.a aVarM47416k2 = new C12738z.a(TrackingEventsWorker.class).m47416k(c12694d2);
                                pairArr = new Pair[]{C7352s.m30477a(KEY_SERVER_ENDPOINT, str9), C7352s.m30477a(KEY_SESSION_TOKEN, str5), C7352s.m30477a(KEY_ENCRYPTED_REQUEST_FILE, fileM40781d.getAbsolutePath()), C7352s.m30477a(KEY_FLUSH_TOKEN, trackingEventFlushSession2.getToken())};
                                aVar = new C1116b.a();
                                while (i10 < 4) {
                                    Pair pair2 = pairArr[i10];
                                    aVar.m6323b((String) pair2.m31673c(), pair2.m31674d());
                                }
                                C12738z c12738zM47409b2 = aVarM47416k2.m47420o(aVar.m6322a()).m47409b();
                                AbstractC12719p0 abstractC12719p1 = this.workManager;
                                String strM30296b2 = C7271m.m30296b(str5);
                                String name2 = fileM40781d.getName();
                                name2.getClass();
                                abstractC12719p1.m47400g(WORK_NAME_PREFIX + strM30296b2 + "_" + C7271m.m30296b(name2), EnumC12706j.REPLACE, c12738zM47409b2);
                                return Unit.f29331a;
                            }
                            token = trackingEventFlushSession2.getToken();
                            c41011.L$0 = trackingEventsCache2;
                            c41011.L$1 = C10350l.m39676a(str5);
                            c41011.L$2 = C10350l.m39676a(str9);
                            c41011.L$3 = trackingEventFlushSession2;
                            c41011.L$4 = C10350l.m39676a(c12694d2);
                            c41011.L$5 = C10350l.m39676a(str8);
                            c41011.L$6 = C10350l.m39676a(publicKeyResponse2);
                            c41011.L$7 = C10350l.m39676a(encryptedTrackingEventsRequest);
                            c41011.label = 5;
                            if (trackingEventsCache2.onFlushFinished(token, false, c41011) != objM38805e) {
                                trackingEventFlushSession3 = trackingEventFlushSession2;
                                str4 = str9;
                                return Unit.f29331a;
                            }
                        }
                    }
                }
                return objM38805e;
            case 2:
                C7348o.m30470b(obj);
                return Unit.f29331a;
            case 3:
                String str12 = (String) c41011.L$5;
                C12694d c12694d3 = (C12694d) c41011.L$4;
                TrackingEventFlushSession trackingEventFlushSession6 = (TrackingEventFlushSession) c41011.L$3;
                str6 = (String) c41011.L$2;
                String str13 = (String) c41011.L$1;
                trackingEventsCache3 = (TrackingEventsCache) c41011.L$0;
                try {
                    C7348o.m30470b(obj);
                    json = str12;
                    trackingEventFlushSession3 = trackingEventFlushSession6;
                    str2 = str13;
                    c12694d = c12694d3;
                    publicKeyResponse = (PublicKeyResponse) obj;
                    Companion companion4 = INSTANCE;
                    if (json == null) {
                        str7 = "";
                    } else {
                        str7 = json;
                    }
                    c41011.L$0 = trackingEventsCache3;
                    c41011.L$1 = str2;
                    c41011.L$2 = str6;
                    c41011.L$3 = trackingEventFlushSession3;
                    c41011.L$4 = c12694d;
                    c41011.L$5 = C10350l.m39676a(json);
                    c41011.L$6 = C10350l.m39676a(publicKeyResponse);
                    c41011.label = 4;
                    objCreateTrackingEventsRequest = companion4.createTrackingEventsRequest(str7, publicKeyResponse, c41011);
                    if (objCreateTrackingEventsRequest != objM38805e) {
                        TrackingEventFlushSession trackingEventFlushSession7 = trackingEventFlushSession3;
                        publicKeyResponse2 = publicKeyResponse;
                        obj = objCreateTrackingEventsRequest;
                        str5 = str2;
                        str8 = json;
                        trackingEventsCache2 = trackingEventsCache3;
                        c12694d2 = c12694d;
                        str9 = str6;
                        trackingEventFlushSession2 = trackingEventFlushSession7;
                        encryptedTrackingEventsRequest = (EncryptedTrackingEventsRequest) obj;
                        if (encryptedTrackingEventsRequest != null) {
                            fileM40781d = this.sdkFilesManager.m40781d("json");
                            String json4 = new C11888w.b().m44445d().m44436c(EncryptedTrackingEventsRequest.class).toJson(encryptedTrackingEventsRequest);
                            json4.getClass();
                            C11964i.m44653k(fileM40781d, json4, null, 2, null);
                            C12738z.a aVarM47416k3 = new C12738z.a(TrackingEventsWorker.class).m47416k(c12694d2);
                            pairArr = new Pair[]{C7352s.m30477a(KEY_SERVER_ENDPOINT, str9), C7352s.m30477a(KEY_SESSION_TOKEN, str5), C7352s.m30477a(KEY_ENCRYPTED_REQUEST_FILE, fileM40781d.getAbsolutePath()), C7352s.m30477a(KEY_FLUSH_TOKEN, trackingEventFlushSession2.getToken())};
                            aVar = new C1116b.a();
                            while (i10 < 4) {
                                Pair pair3 = pairArr[i10];
                                aVar.m6323b((String) pair3.m31673c(), pair3.m31674d());
                            }
                            C12738z c12738zM47409b3 = aVarM47416k3.m47420o(aVar.m6322a()).m47409b();
                            AbstractC12719p0 abstractC12719p2 = this.workManager;
                            String strM30296b3 = C7271m.m30296b(str5);
                            String name3 = fileM40781d.getName();
                            name3.getClass();
                            abstractC12719p2.m47400g(WORK_NAME_PREFIX + strM30296b3 + "_" + C7271m.m30296b(name3), EnumC12706j.REPLACE, c12738zM47409b3);
                            return Unit.f29331a;
                        }
                        token = trackingEventFlushSession2.getToken();
                        c41011.L$0 = trackingEventsCache2;
                        c41011.L$1 = C10350l.m39676a(str5);
                        c41011.L$2 = C10350l.m39676a(str9);
                        c41011.L$3 = trackingEventFlushSession2;
                        c41011.L$4 = C10350l.m39676a(c12694d2);
                        c41011.L$5 = C10350l.m39676a(str8);
                        c41011.L$6 = C10350l.m39676a(publicKeyResponse2);
                        c41011.L$7 = C10350l.m39676a(encryptedTrackingEventsRequest);
                        c41011.label = 5;
                        if (trackingEventsCache2.onFlushFinished(token, false, c41011) != objM38805e) {
                            trackingEventFlushSession3 = trackingEventFlushSession2;
                            str4 = str9;
                            return Unit.f29331a;
                        }
                    }
                } catch (Exception e14) {
                    e = e14;
                    trackingEventFlushSession3 = trackingEventFlushSession6;
                    str4 = str6;
                    str5 = str13;
                    trackingEventsCache2 = trackingEventsCache3;
                    trackingEventFlushSession2 = trackingEventFlushSession3;
                    fileM40781d = null;
                    if (fileM40781d != null) {
                        C10340b.m39658a(fileM40781d.delete());
                    }
                    String token7 = trackingEventFlushSession2.getToken();
                    c41011.L$0 = C10350l.m39676a(trackingEventsCache2);
                    c41011.L$1 = C10350l.m39676a(str5);
                    c41011.L$2 = C10350l.m39676a(str4);
                    c41011.L$3 = C10350l.m39676a(fileM40781d);
                    c41011.L$4 = C10350l.m39676a(trackingEventFlushSession2);
                    c41011.L$5 = C10350l.m39676a(e);
                    c41011.L$6 = null;
                    c41011.L$7 = null;
                    c41011.label = 6;
                    break;
                }
                return objM38805e;
            case 4:
                publicKeyResponse2 = (PublicKeyResponse) c41011.L$6;
                String str14 = (String) c41011.L$5;
                C12694d c12694d4 = (C12694d) c41011.L$4;
                trackingEventFlushSession2 = (TrackingEventFlushSession) c41011.L$3;
                str9 = (String) c41011.L$2;
                String str15 = (String) c41011.L$1;
                TrackingEventsCache trackingEventsCache4 = (TrackingEventsCache) c41011.L$0;
                try {
                    C7348o.m30470b(obj);
                    str5 = str15;
                    c12694d2 = c12694d4;
                    str8 = str14;
                    trackingEventsCache2 = trackingEventsCache4;
                    encryptedTrackingEventsRequest = (EncryptedTrackingEventsRequest) obj;
                    if (encryptedTrackingEventsRequest != null) {
                        token = trackingEventFlushSession2.getToken();
                        c41011.L$0 = trackingEventsCache2;
                        c41011.L$1 = C10350l.m39676a(str5);
                        c41011.L$2 = C10350l.m39676a(str9);
                        c41011.L$3 = trackingEventFlushSession2;
                        c41011.L$4 = C10350l.m39676a(c12694d2);
                        c41011.L$5 = C10350l.m39676a(str8);
                        c41011.L$6 = C10350l.m39676a(publicKeyResponse2);
                        c41011.L$7 = C10350l.m39676a(encryptedTrackingEventsRequest);
                        c41011.label = 5;
                        if (trackingEventsCache2.onFlushFinished(token, false, c41011) != objM38805e) {
                            trackingEventFlushSession3 = trackingEventFlushSession2;
                            str4 = str9;
                            return Unit.f29331a;
                        }
                        return objM38805e;
                    }
                    fileM40781d = this.sdkFilesManager.m40781d("json");
                    String json5 = new C11888w.b().m44445d().m44436c(EncryptedTrackingEventsRequest.class).toJson(encryptedTrackingEventsRequest);
                    json5.getClass();
                    C11964i.m44653k(fileM40781d, json5, null, 2, null);
                    C12738z.a aVarM47416k4 = new C12738z.a(TrackingEventsWorker.class).m47416k(c12694d2);
                    pairArr = new Pair[]{C7352s.m30477a(KEY_SERVER_ENDPOINT, str9), C7352s.m30477a(KEY_SESSION_TOKEN, str5), C7352s.m30477a(KEY_ENCRYPTED_REQUEST_FILE, fileM40781d.getAbsolutePath()), C7352s.m30477a(KEY_FLUSH_TOKEN, trackingEventFlushSession2.getToken())};
                    aVar = new C1116b.a();
                    while (i10 < 4) {
                        Pair pair4 = pairArr[i10];
                        aVar.m6323b((String) pair4.m31673c(), pair4.m31674d());
                    }
                    C12738z c12738zM47409b4 = aVarM47416k4.m47420o(aVar.m6322a()).m47409b();
                    AbstractC12719p0 abstractC12719p3 = this.workManager;
                    String strM30296b4 = C7271m.m30296b(str5);
                    String name4 = fileM40781d.getName();
                    name4.getClass();
                    abstractC12719p3.m47400g(WORK_NAME_PREFIX + strM30296b4 + "_" + C7271m.m30296b(name4), EnumC12706j.REPLACE, c12738zM47409b4);
                    return Unit.f29331a;
                } catch (Exception e15) {
                    e = e15;
                    trackingEventFlushSession3 = trackingEventFlushSession2;
                    str4 = str9;
                    str5 = str15;
                    trackingEventsCache2 = trackingEventsCache4;
                    trackingEventFlushSession2 = trackingEventFlushSession3;
                    fileM40781d = null;
                    if (fileM40781d != null) {
                        C10340b.m39658a(fileM40781d.delete());
                    }
                    String token8 = trackingEventFlushSession2.getToken();
                    c41011.L$0 = C10350l.m39676a(trackingEventsCache2);
                    c41011.L$1 = C10350l.m39676a(str5);
                    c41011.L$2 = C10350l.m39676a(str4);
                    c41011.L$3 = C10350l.m39676a(fileM40781d);
                    c41011.L$4 = C10350l.m39676a(trackingEventFlushSession2);
                    c41011.L$5 = C10350l.m39676a(e);
                    c41011.L$6 = null;
                    c41011.L$7 = null;
                    c41011.label = 6;
                }
                break;
            case 5:
                trackingEventFlushSession3 = (TrackingEventFlushSession) c41011.L$3;
                str4 = (String) c41011.L$2;
                str5 = (String) c41011.L$1;
                trackingEventsCache2 = (TrackingEventsCache) c41011.L$0;
                try {
                    C7348o.m30470b(obj);
                    return Unit.f29331a;
                } catch (Exception e16) {
                    e = e16;
                    trackingEventFlushSession2 = trackingEventFlushSession3;
                    fileM40781d = null;
                    if (fileM40781d != null) {
                        C10340b.m39658a(fileM40781d.delete());
                    }
                    String token9 = trackingEventFlushSession2.getToken();
                    c41011.L$0 = C10350l.m39676a(trackingEventsCache2);
                    c41011.L$1 = C10350l.m39676a(str5);
                    c41011.L$2 = C10350l.m39676a(str4);
                    c41011.L$3 = C10350l.m39676a(fileM40781d);
                    c41011.L$4 = C10350l.m39676a(trackingEventFlushSession2);
                    c41011.L$5 = C10350l.m39676a(e);
                    c41011.L$6 = null;
                    c41011.L$7 = null;
                    c41011.label = 6;
                }
                break;
            case 6:
                C7348o.m30470b(obj);
                return Unit.f29331a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    private final boolean isDebugMode() {
        return this.featureFlagManager.m27145a(C6156c.f23523a);
    }

    private final void logEvent(TrackingEvent event, boolean force) {
        if (this.isEnabled) {
            C7882k.m32780d(this.coroutineScope, null, null, new C41021(event, force, null), 3, null);
        }
    }

    private final String nowToIso8601Utc() {
        String str = this.iso8601Formatter.format(new Date());
        str.getClass();
        return str;
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logBackgroundEvent(@Nullable String stepName, @Nullable String pageName, boolean force) {
        logEvent(new TrackingEvent.InquiryBackgroundEvent(AbstractC4109a.m20954a(), new TrackingUiEvent(pageName, stepName, this.metadataProvider.collect()), nowToIso8601Utc()), force);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logCameraInfoEvent(@NotNull CameraInfoEventData data, boolean force) {
        data.getClass();
        logEvent(new TrackingEvent.InquiryCameraInfoEvent(AbstractC4109a.m20954a(), CameraInfoEventData.copy$default(data, null, null, null, null, null, null, this.metadataProvider.collect(), 63, null), nowToIso8601Utc()), force);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logDebugLogEvent(@NotNull String category, @NotNull Function0<String> message, boolean force) {
        category.getClass();
        message.getClass();
        if (isDebugMode()) {
            logEvent(new TrackingEvent.InquiryDebugLogEvent(AbstractC4109a.m20954a(), new DebugLogEventData(category, message.invoke(), this.metadataProvider.collect()), nowToIso8601Utc()), force);
        }
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logForegroundEvent(@Nullable String stepName, @Nullable String pageName, boolean force) {
        logEvent(new TrackingEvent.InquiryForegroundEvent(AbstractC4109a.m20954a(), new TrackingUiEvent(pageName, stepName, this.metadataProvider.collect()), nowToIso8601Utc()), force);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logGovernmentIdButtonClickEvent(@NotNull GovernmentIdButtonEventData data, boolean force) {
        data.getClass();
        logEvent(new TrackingEvent.InquiryGovernmentIdButtonEvent(AbstractC4109a.m20954a(), GovernmentIdButtonEventData.copy$default(data, null, this.metadataProvider.collect(), 1, null), nowToIso8601Utc()), force);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logGovernmentIdStateEvent(@NotNull GovernmentIdStateEventData data, boolean force) {
        data.getClass();
        logEvent(new TrackingEvent.InquiryGovernmentIdStateEvent(AbstractC4109a.m20954a(), GovernmentIdStateEventData.copy$default(data, null, null, null, this.metadataProvider.collect(), 7, null), nowToIso8601Utc()), force);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logInquiryEndEvent(@NotNull InquiryEndReason reason, long durationMs, @Nullable String errorDescription, boolean force) {
        reason.getClass();
        logEvent(new TrackingEvent.InquiryEndEvent(AbstractC4109a.m20954a(), new InquiryEndEventData(reason, Long.valueOf(durationMs), errorDescription, this.metadataProvider.collect()), nowToIso8601Utc()), true);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logInquiryPageViewEvent(@NotNull String stepName, @Nullable String pageName, boolean force) {
        stepName.getClass();
        logEvent(new TrackingEvent.PageViewTrackingEvent(AbstractC4109a.m20954a(), new TrackingUiEvent(pageName, stepName, this.metadataProvider.collect()), nowToIso8601Utc()), force);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logInquiryStartEvent(@NotNull InquiryConfigData config, boolean force) {
        config.getClass();
        logEvent(new TrackingEvent.InquiryStartEvent(AbstractC4109a.m20954a(), new InquiryStartEventData(config.copy((32751 & 1) != 0 ? config.templateId : null, (32751 & 2) != 0 ? config.templateVersion : null, (32751 & 4) != 0 ? config.environment : null, (32751 & 8) != 0 ? config.environmentId : null, (32751 & 16) != 0 ? config.organizationId : this.networkStateManager.getOrganizationId(), (32751 & 32) != 0 ? config.uiFramework : null, (32751 & 64) != 0 ? config.themeSetId : null, (32751 & 128) != 0 ? config.hasAccountId : null, (32751 & 256) != 0 ? config.hasFields : null, (32751 & 512) != 0 ? config.hasInquiryId : null, (32751 & 1024) != 0 ? config.hasOneTimeLinkCode : null, (32751 & 2048) != 0 ? config.hasRedirectUri : null, (32751 & 4096) != 0 ? config.hasReferenceId : null, (32751 & 8192) != 0 ? config.hasSessionToken : null, (32751 & 16384) != 0 ? config.hasTheme : null), this.metadataProvider.collect()), nowToIso8601Utc()), force);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logIntegrationEvent(@NotNull IntegrationEventData data, boolean force) {
        data.getClass();
        logEvent(new TrackingEvent.InquiryIntegrationEvent(AbstractC4109a.m20954a(), IntegrationEventData.copy$default(data, null, null, null, this.metadataProvider.collect(), 7, null), nowToIso8601Utc()), force);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logNfcErrorEvent(@NotNull NfcErrorEventData data, boolean force) {
        data.getClass();
        logEvent(new TrackingEvent.InquiryNfcErrorEvent(AbstractC4109a.m20954a(), NfcErrorEventData.copy$default(data, null, null, null, null, null, null, null, null, this.metadataProvider.collect(), 255, null), nowToIso8601Utc()), force);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logNfcScanEvent(@NotNull NfcScanEventData data, boolean force) {
        data.getClass();
        logEvent(new TrackingEvent.InquiryNfcScanEvent(AbstractC4109a.m20954a(), NfcScanEventData.copy$default(data, null, null, null, null, null, null, this.metadataProvider.collect(), 63, null), nowToIso8601Utc()), force);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logPermissionEvent(@NotNull PermissionTrackingEventData permissionData, boolean force) {
        permissionData.getClass();
        logEvent(new TrackingEvent.InquiryPermissionEvent(AbstractC4109a.m20954a(), PermissionTrackingEventData.copy$default(permissionData, null, null, this.metadataProvider.collect(), 3, null), nowToIso8601Utc()), force);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logSelfieCaptureButtonClickedEvent(@NotNull SelfieCaptureButtonEventData data, boolean force) {
        data.getClass();
        logEvent(new TrackingEvent.InquirySelfieClickEvent(AbstractC4109a.m20954a(), SelfieCaptureButtonEventData.copy$default(data, null, this.metadataProvider.collect(), 1, null), nowToIso8601Utc()), force);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logSelfieCaptureStateEvent(@NotNull SelfieCaptureStateEventData data, boolean force) {
        data.getClass();
        logEvent(new TrackingEvent.InquirySelfieCaptureStateEvent(AbstractC4109a.m20954a(), SelfieCaptureStateEventData.copy$default(data, null, null, null, this.metadataProvider.collect(), 7, null), nowToIso8601Utc()), force);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logSelfiePoseCaptureEvent(@NotNull SelfiePoseEventData data, boolean force) {
        data.getClass();
        logEvent(new TrackingEvent.InquirySelfiePoseEvent(AbstractC4109a.m20954a(), SelfiePoseEventData.copy$default(data, null, null, this.metadataProvider.collect(), 3, null), nowToIso8601Utc()), force);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logSelfiePoseDetect(@NotNull SelfiePoseDetectEventData data, boolean force) {
        data.getClass();
        logEvent(new TrackingEvent.InquirySelfiePoseDetectEvent(AbstractC4109a.m20954a(), SelfiePoseDetectEventData.copy$default(data, null, null, 0.0f, 0.0f, 0.0f, this.metadataProvider.collect(), 31, null), nowToIso8601Utc()), force);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logUiStepButtonEvent(@NotNull UiStepButtonType type, @Nullable String buttonName, @Nullable String stepName, boolean force) {
        type.getClass();
        logEvent(new TrackingEvent.InquiryUiStepButtonEvent(AbstractC4109a.m20954a(), new UiStepButtonEventData(type, buttonName, stepName, this.metadataProvider.collect()), nowToIso8601Utc()), force);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logVideoErrorEvent(@NotNull String stepName, @Nullable String videoCaptureMethod, @Nullable String errorName, @Nullable String errorReason, boolean force) {
        stepName.getClass();
        logEvent(new TrackingEvent.InquiryVideoErrorEvent(AbstractC4109a.m20954a(), new VideoErrorEventData(stepName, null, videoCaptureMethod, errorName, errorReason, this.metadataProvider.collect(), 2, null), nowToIso8601Utc()), force);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logVideoStartEvent(@NotNull String stepName, @Nullable String videoCaptureMethod, @Nullable Integer attempt, boolean force) {
        stepName.getClass();
        logEvent(new TrackingEvent.InquiryVideoStartEvent(AbstractC4109a.m20954a(), new VideoStartEventData(stepName, null, videoCaptureMethod, attempt, this.metadataProvider.collect(), 2, null), nowToIso8601Utc()), force);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logVideoStopEvent(@NotNull String stepName, @Nullable String videoCaptureMethod, @Nullable String assetId, @Nullable Integer elapsedTime, @Nullable Integer chunksLength, @Nullable Double blobSize, boolean force) {
        stepName.getClass();
        logEvent(new TrackingEvent.InquiryVideoStopEvent(AbstractC4109a.m20954a(), new VideoStopEventData(stepName, null, videoCaptureMethod, assetId, elapsedTime, chunksLength, blobSize, this.metadataProvider.collect(), 2, null), nowToIso8601Utc()), force);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logVideoStopRequestEvent(@NotNull String stepName, boolean force) {
        stepName.getClass();
        logEvent(new TrackingEvent.InquiryVideoStopRequestEvent(AbstractC4109a.m20954a(), new VideoStopRequestEventData(stepName, null, null, this.metadataProvider.collect(), 6, null), nowToIso8601Utc()), force);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logWebRtcIceCompleteEvent(@Nullable String stepName, @Nullable Integer numCandidates, boolean force) {
        logEvent(new TrackingEvent.InquiryVideoIceCompleteEvent(AbstractC4109a.m20954a(), new VideoIceCompleteEventData(stepName, null, null, numCandidates, this.metadataProvider.collect(), 6, null), nowToIso8601Utc()), force);
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
