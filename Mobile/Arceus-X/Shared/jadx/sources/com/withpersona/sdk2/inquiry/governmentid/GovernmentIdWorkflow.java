package com.withpersona.sdk2.inquiry.governmentid;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.governmentid.C3544e;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.autoClassification.AutoClassificationConfig;
import com.withpersona.sdk2.inquiry.governmentid.digitalId.DigitalIdConfig;
import com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker;
import com.withpersona.sdk2.inquiry.governmentid.video_capture.VideoCaptureConfig;
import com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition;
import com.withpersona.sdk2.inquiry.network.dto.government_id.CaptureOptionNativeMobile;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.Title;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.permissions.C3858g;
import com.withpersona.sdk2.inquiry.shared.inquiryTheme.C4007a;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.steps.p056ui.CustomPendingPage;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.GovIdCaptureButtonType;
import com.withpersona.sdk2.inquiry.tracking.model.GovIdCaptureState;
import com.withpersona.sdk2.inquiry.tracking.model.GovernmentIdButtonEventData;
import com.withpersona.sdk2.inquiry.tracking.model.GovernmentIdStateEventData;
import hu.InterfaceC6567c;
import io.C6903p2;
import io.EnumC6852d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jo.C7230n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7697o;
import kotlin.collections.C7699p;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7724a;
import kotlin.jvm.internal.C7731d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p016an.C0384m;
import p016an.C0388q;
import p109en.AlertContainerScreen;
import p132fn.C5689j;
import p226jq.C7259g;
import p229jt.C7345l;
import p229jt.C7348o;
import p239k6.InterfaceC7479s;
import p256ku.InterfaceC7906p0;
import p276ln.InterfaceC8169a;
import p277lo.C8211t0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p361po.C10303c;
import p361po.EnumC10302b;
import p363pq.AbstractC10315i;
import p363pq.C10309c;
import p363pq.InterfaceC10314h;
import p473uo.C11903j;
import p473uo.C11905l;
import p473uo.C11915v;
import p473uo.EnumC11917x;
import p475uq.C11930a;
import p497vp.C12244g;
import p526wq.C12530m;
import p526wq.EnumC12529l;
import p560xu.C12930h;
import p581ym.AbstractC13218k;
import p581ym.AbstractC13225r;
import p581ym.C13230w;
import p581ym.C13233z;
import p581ym.InterfaceC13215h;
import p581ym.Snapshot;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u00020\u0005:\u0002zVBy\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#JC\u0010(\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00032\"\u0010'\u001a\u001e0&R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b(\u0010)J;\u0010,\u001a\u00020+2\"\u0010'\u001a\u001e0&R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u0006\u0010*\u001a\u00020\u0004H\u0002¢\u0006\u0004\b,\u0010-J-\u00101\u001a\u00020+2\u001c\u00100\u001a\u00180.R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040/H\u0002¢\u0006\u0004\b1\u00102J\u001b\u00104\u001a\u000203*\u00020\u00052\u0006\u0010%\u001a\u00020\u0003H\u0002¢\u0006\u0004\b4\u00105J!\u00109\u001a\b\u0012\u0004\u0012\u00020\u000508*\u00020\u00052\u0006\u00107\u001a\u000206H\u0002¢\u0006\u0004\b9\u0010:J\u0013\u0010<\u001a\u00020;*\u00020\u0003H\u0002¢\u0006\u0004\b<\u0010=J\u0015\u0010>\u001a\u0004\u0018\u000106*\u00020\u0003H\u0002¢\u0006\u0004\b>\u0010?J-\u0010E\u001a\u000206*\u00020@2\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u0002062\b\u0010D\u001a\u0004\u0018\u000106H\u0002¢\u0006\u0004\bE\u0010FJ-\u0010G\u001a\u000206*\u00020@2\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u0002062\b\u0010D\u001a\u0004\u0018\u000106H\u0002¢\u0006\u0004\bG\u0010FJ-\u0010H\u001a\u000206*\u00020@2\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u0002062\b\u0010D\u001a\u0004\u0018\u000106H\u0002¢\u0006\u0004\bH\u0010FJ\u001b\u0010I\u001a\u000206*\u00020@2\u0006\u0010B\u001a\u00020AH\u0002¢\u0006\u0004\bI\u0010JJ\u001b\u0010K\u001a\u000206*\u00020@2\u0006\u0010B\u001a\u00020AH\u0002¢\u0006\u0004\bK\u0010JJ\u0017\u0010M\u001a\u00020;2\u0006\u0010L\u001a\u00020\u0003H\u0002¢\u0006\u0004\bM\u0010=J!\u0010Q\u001a\u00020\u00032\u0006\u0010N\u001a\u00020\u00022\b\u0010P\u001a\u0004\u0018\u00010OH\u0016¢\u0006\u0004\bQ\u0010RJC\u0010S\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00032\"\u0010'\u001a\u001e0&R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0016¢\u0006\u0004\bS\u0010)J\u0019\u0010T\u001a\u0004\u0018\u00010O2\u0006\u0010L\u001a\u00020\u0003H\u0016¢\u0006\u0004\bT\u0010UR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\u0014\u0010u\u001a\u00020r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010tR \u0010y\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010v8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010x¨\u0006{"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;", "Lym/k;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;", "", "Landroid/content/Context;", "applicationContext", "Lk6/s;", "imageLoader", "Lpo/c$a;", "submitVerificationWorkerFactory", "Lcom/withpersona/sdk2/inquiry/governmentid/e;", "documentSelectWorker", "Luo/j;", "localVideoCaptureRenderer", "Luo/v;", "webRtcRenderer", "Llo/t0;", "captureRenderer", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;", "autoClassifyWorkerFactory", "Ljo/n;", "autoClassificationRenderer", "Lln/a;", "cameraStatsManager", "Luq/a;", "navigationStateManager", "Lpq/c;", "externalEventLogger", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;", "themeManager", "<init>", "(Landroid/content/Context;Lk6/s;Lpo/c$a;Lcom/withpersona/sdk2/inquiry/governmentid/e;Luo/j;Luo/v;Llo/t0;Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;Ljo/n;Lln/a;Luq/a;Lpq/c;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;)V", "renderProps", "renderState", "Lym/k$a;", "context", "j0", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lym/k$a;)Ljava/lang/Object;", "output", "", "b1", "(Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;)V", "Lym/r$c;", "Lym/r;", "updater", "c1", "(Lym/r$c;)V", "Lwq/m;", "f1", "(Ljava/lang/Object;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)Lwq/m;", "", "name", "Lan/m;", "h0", "(Ljava/lang/Object;Ljava/lang/String;)Lan/m;", "", "e1", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)Z", "e0", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "side", "selectedId", "countryCode", "a0", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Z", "b0", "d0", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)Ljava/lang/String;", "c0", "state", "g0", "props", "Lym/i;", "snapshot", "f0", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lym/i;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "i0", "d1", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)Lym/i;", "a", "Landroid/content/Context;", "b", "Lk6/s;", "c", "Lpo/c$a;", "d", "Lcom/withpersona/sdk2/inquiry/governmentid/e;", "e", "Luo/j;", "f", "Luo/v;", "g", "Llo/t0;", "h", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;", "i", "Ljo/n;", "j", "Lln/a;", "k", "Luq/a;", "l", "Lpq/c;", "m", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "n", "Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;", "Luo/l;", "o", "Luo/l;", "videoCaptureHelper", "Lhu/c;", "p", "Lhu/c;", "previousStateClass", "Input", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class GovernmentIdWorkflow extends AbstractC13218k<Input, GovernmentIdState, AbstractC3503a, Object> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context applicationContext;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7479s imageLoader;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final C10303c.a submitVerificationWorkerFactory;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final C3544e documentSelectWorker;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final C11903j localVideoCaptureRenderer;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final C11915v webRtcRenderer;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final C8211t0 captureRenderer;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final AutoClassifyWorker.C3563b autoClassifyWorkerFactory;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final C7230n autoClassificationRenderer;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC8169a cameraStatsManager;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final C11930a navigationStateManager;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final C10309c externalEventLogger;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    public final C4007a themeManager;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final C11905l videoCaptureHelper;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @Nullable
    public InterfaceC6567c<? extends GovernmentIdState> previousStateClass;

    @Metadata(m31664d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\bF\b\u0007\u0018\u00002\u00020\u0001:\u0001|B\u008f\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001a\u001a\u00020\u000b\u0012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010 \u001a\u00020\u000b\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020%\u0012\b\u0010(\u001a\u0004\u0018\u00010'\u0012\u0006\u0010)\u001a\u00020\u000b\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010,\u001a\u00020+\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.¢\u0006\u0004\b0\u00101J\r\u00102\u001a\u00020\u0014¢\u0006\u0004\b2\u00103J\u001d\u00108\u001a\u0002072\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u00020\u0014¢\u0006\u0004\b8\u00109R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b>\u0010;\u001a\u0004\b?\u0010=R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bD\u0010;\u001a\u0004\bE\u0010=R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bF\u0010;\u001a\u0004\bG\u0010=R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bH\u0010;\u001a\u0004\bI\u0010=R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bJ\u0010LR\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bM\u0010K\u001a\u0004\bN\u0010LR\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00058\u0006¢\u0006\f\n\u0004\bN\u0010A\u001a\u0004\bO\u0010CR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b?\u0010P\u001a\u0004\bQ\u0010RR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bW\u0010Q\u001a\u0004\bX\u00103R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bY\u0010;\u001a\u0004\bZ\u0010=R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bO\u0010;\u001a\u0004\b[\u0010=R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\bB\u0010\\\u001a\u0004\b]\u0010^R\u0017\u0010\u001a\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bZ\u0010K\u001a\u0004\b_\u0010LR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b[\u0010`\u001a\u0004\ba\u0010bR\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\b\\\u0010eR\u0017\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\bI\u0010f\u001a\u0004\b:\u0010gR\u0017\u0010 \u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bG\u0010K\u001a\u0004\b \u0010LR\u0017\u0010\"\u001a\u00020!8\u0006¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bH\u0010jR\u0017\u0010$\u001a\u00020#8\u0006¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010nR\u0017\u0010&\u001a\u00020%8\u0006¢\u0006\f\n\u0004\bX\u0010o\u001a\u0004\bp\u0010qR\u0019\u0010(\u001a\u0004\u0018\u00010'8\u0006¢\u0006\f\n\u0004\bE\u0010r\u001a\u0004\bs\u0010tR\u0017\u0010)\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b<\u0010K\u001a\u0004\bu\u0010LR\u0019\u0010*\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b]\u0010`\u001a\u0004\bk\u0010bR\u0017\u0010,\u001a\u00020+8\u0006¢\u0006\f\n\u0004\bp\u0010v\u001a\u0004\bY\u0010wR\u0019\u0010-\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bx\u0010;\u001a\u0004\bc\u0010=R\u0019\u0010/\u001a\u0004\u0018\u00010.8\u0006¢\u0006\f\n\u0004\bm\u0010y\u001a\u0004\bS\u0010zR\u0011\u0010{\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bh\u0010L¨\u0006}"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;", "Landroid/os/Parcelable;", "", "sessionToken", "countryCode", "", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "enabledIdClasses", "inquiryId", "fromStep", "fromComponent", "", "backStepEnabled", "cancelButtonEnabled", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CaptureOptionNativeMobile;", "enabledCaptureOptionsNativeMobile", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;", "strings", "", "imageCaptureCount", "fieldKeyDocument", "fieldKeyIdClass", "", "manualCaptureButtonDelayMs", "shouldSkipReviewScreen", "theme", "Lcom/withpersona/sdk2/inquiry/governmentid/video_capture/VideoCaptureConfig;", "videoCaptureConfig", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig;", "assetConfig", "isEnabled", "Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;", "autoClassificationConfig", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;", "reviewCaptureButtonsAxis", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "pendingPageTextVerticalPosition", "Lcom/withpersona/sdk2/inquiry/governmentid/digitalId/DigitalIdConfig;", "digitalIdConfig", "staticCaptureTipsEnabled", "holographicTorchEnabledDurationMs", "Lio/d;", "designVersion", "flowWatermarkText", "Lcom/withpersona/sdk2/inquiry/steps/ui/CustomPendingPage;", "customPendingPage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;ILjava/lang/String;Ljava/lang/String;JZLjava/lang/Integer;Lcom/withpersona/sdk2/inquiry/governmentid/video_capture/VideoCaptureConfig;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig;ZLcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;Lcom/withpersona/sdk2/inquiry/governmentid/digitalId/DigitalIdConfig;ZLjava/lang/Integer;Lio/d;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/steps/ui/CustomPendingPage;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "y", "()Ljava/lang/String;", "b", "j", "c", "Ljava/util/List;", "o", "()Ljava/util/List;", "d", "x", "e", "t", "f", "s", "g", "Z", "()Z", "h", "i", "n", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "I", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "k", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;", "G", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;", "l", "w", "m", "p", "q", "J", "z", "()J", "D", "Ljava/lang/Integer;", "getTheme", "()Ljava/lang/Integer;", "r", "Lcom/withpersona/sdk2/inquiry/governmentid/video_capture/VideoCaptureConfig;", "()Lcom/withpersona/sdk2/inquiry/governmentid/video_capture/VideoCaptureConfig;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig;", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig;", "u", "Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;", "()Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;", "v", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;", "C", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "A", "()Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "Lcom/withpersona/sdk2/inquiry/governmentid/digitalId/DigitalIdConfig;", "getDigitalIdConfig", "()Lcom/withpersona/sdk2/inquiry/governmentid/digitalId/DigitalIdConfig;", "E", "Lio/d;", "()Lio/d;", "B", "Lcom/withpersona/sdk2/inquiry/steps/ui/CustomPendingPage;", "()Lcom/withpersona/sdk2/inquiry/steps/ui/CustomPendingPage;", "hasMultipleCaptureOptions", "Strings", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Input implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Input> CREATOR = new C3502a();

        /* JADX INFO: renamed from: A, reason: from kotlin metadata */
        @NotNull
        public final EnumC6852d designVersion;

        /* JADX INFO: renamed from: B, reason: from kotlin metadata */
        @Nullable
        public final String flowWatermarkText;

        /* JADX INFO: renamed from: C, reason: from kotlin metadata */
        @Nullable
        public final CustomPendingPage customPendingPage;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final String sessionToken;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public final String countryCode;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public final List<IdConfig> enabledIdClasses;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        public final String inquiryId;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        public final String fromStep;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @NotNull
        public final String fromComponent;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        public final boolean backStepEnabled;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        public final boolean cancelButtonEnabled;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @NotNull
        public final List<CaptureOptionNativeMobile> enabledCaptureOptionsNativeMobile;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        @Nullable
        public final StepStyles.GovernmentIdStepStyle styles;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        @NotNull
        public final Strings strings;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        public final int imageCaptureCount;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        @NotNull
        public final String fieldKeyDocument;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata */
        @NotNull
        public final String fieldKeyIdClass;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata */
        public final long manualCaptureButtonDelayMs;

        /* JADX INFO: renamed from: p, reason: from kotlin metadata */
        public final boolean shouldSkipReviewScreen;

        /* JADX INFO: renamed from: q, reason: from kotlin metadata */
        @Nullable
        public final Integer theme;

        /* JADX INFO: renamed from: r, reason: from kotlin metadata */
        @NotNull
        public final VideoCaptureConfig videoCaptureConfig;

        /* JADX INFO: renamed from: s, reason: from kotlin metadata */
        @NotNull
        public final NextStep.GovernmentId.AssetConfig assetConfig;

        /* JADX INFO: renamed from: t, reason: from kotlin metadata */
        public final boolean isEnabled;

        /* JADX INFO: renamed from: u, reason: from kotlin metadata */
        @NotNull
        public final AutoClassificationConfig autoClassificationConfig;

        /* JADX INFO: renamed from: v, reason: from kotlin metadata */
        @NotNull
        public final StyleElements.Axis reviewCaptureButtonsAxis;

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        @NotNull
        public final PendingPageTextPosition pendingPageTextVerticalPosition;

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        @Nullable
        public final DigitalIdConfig digitalIdConfig;

        /* JADX INFO: renamed from: y, reason: from kotlin metadata */
        public final boolean staticCaptureTipsEnabled;

        /* JADX INFO: renamed from: z, reason: from kotlin metadata */
        @Nullable
        public final Integer holographicTorchEnabledDurationMs;

        @Metadata(m31664d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b_\b\u0087\b\u0018\u00002\u00020\u0001B\u0095\u0005\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u000e\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u001a\u0012\u0006\u0010\u001c\u001a\u00020\u000e\u0012\u0006\u0010\u001d\u001a\u00020\u000e\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u0002\u0012\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00020\u001a\u0012\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00020\u001a\u0012\u0006\u0010#\u001a\u00020\u0002\u0012\u0006\u0010$\u001a\u00020\u0002\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0002\u0012\b\u00100\u001a\u0004\u0018\u00010\u0002\u0012\b\u00101\u001a\u0004\u0018\u00010\u0002\u0012\b\u00102\u001a\u0004\u0018\u00010\u0002\u0012\b\u00103\u001a\u0004\u0018\u00010\u0002\u0012\b\u00104\u001a\u0004\u0018\u00010\u0002\u0012\b\u00105\u001a\u0004\u0018\u00010\u0002\u0012\b\u00106\u001a\u0004\u0018\u00010\u0002\u0012\b\u00107\u001a\u0004\u0018\u00010\u0002\u0012\b\u00108\u001a\u0004\u0018\u00010\u0002\u0012\b\u00109\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010:\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010;\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010<\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010=\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010>\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010?\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010@\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010A\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010B\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010C\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010D\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010E\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010F\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010I\u001a\n\u0012\u0004\u0012\u00020H\u0018\u00010G¢\u0006\u0004\bJ\u0010KJ\r\u0010M\u001a\u00020L¢\u0006\u0004\bM\u0010NJ\u001d\u0010S\u001a\u00020R2\u0006\u0010P\u001a\u00020O2\u0006\u0010Q\u001a\u00020L¢\u0006\u0004\bS\u0010TJ\u0010\u0010U\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bU\u0010VJ\u0010\u0010W\u001a\u00020LHÖ\u0001¢\u0006\u0004\bW\u0010NJ\u001a\u0010[\u001a\u00020Z2\b\u0010Y\u001a\u0004\u0018\u00010XHÖ\u0003¢\u0006\u0004\b[\u0010\\R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010VR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b`\u0010^\u001a\u0004\ba\u0010VR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bb\u0010^\u001a\u0004\bc\u0010VR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bd\u0010^\u001a\u0004\be\u0010VR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bf\u0010^\u001a\u0004\bg\u0010VR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bh\u0010^\u001a\u0004\bi\u0010VR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bj\u0010^\u001a\u0004\bk\u0010VR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bl\u0010^\u001a\u0004\bm\u0010VR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bn\u0010^\u001a\u0004\bo\u0010VR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bp\u0010^\u001a\u0004\bq\u0010VR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\br\u0010^\u001a\u0004\bh\u0010VR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bs\u0010t\u001a\u0004\bu\u0010vR\u0017\u0010\u0010\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bw\u0010t\u001a\u0004\bx\u0010vR\u0017\u0010\u0011\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\by\u0010t\u001a\u0004\bz\u0010vR\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b{\u0010^\u001a\u0004\b|\u0010VR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b}\u0010t\u001a\u0004\b~\u0010vR\u0018\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\r\n\u0004\b\u007f\u0010^\u001a\u0005\b\u0080\u0001\u0010VR\u0018\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\r\n\u0005\b\u0081\u0001\u0010^\u001a\u0004\by\u0010VR\u0018\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\r\n\u0005\b\u0080\u0001\u0010^\u001a\u0004\bw\u0010VR\u0018\u0010\u0017\u001a\u00020\u000e8\u0006¢\u0006\r\n\u0004\bi\u0010t\u001a\u0005\b\u0082\u0001\u0010vR\u0018\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\r\n\u0004\bx\u0010^\u001a\u0005\b\u0083\u0001\u0010VR\u0018\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\r\n\u0004\bu\u0010^\u001a\u0005\b\u0084\u0001\u0010VR&\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u001a8\u0006¢\u0006\u000f\n\u0005\b|\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0018\u0010\u001c\u001a\u00020\u000e8\u0006¢\u0006\r\n\u0004\bk\u0010t\u001a\u0005\b\u0088\u0001\u0010vR\u0019\u0010\u001d\u001a\u00020\u000e8\u0006¢\u0006\u000e\n\u0005\b\u0089\u0001\u0010t\u001a\u0005\b\u008a\u0001\u0010vR\u0018\u0010\u001e\u001a\u00020\u00028\u0006¢\u0006\r\n\u0004\bc\u0010^\u001a\u0005\b\u008b\u0001\u0010VR\u0019\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u008a\u0001\u0010^\u001a\u0005\b\u008c\u0001\u0010VR'\u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00020\u001a8\u0006¢\u0006\u0010\n\u0006\b\u008d\u0001\u0010\u0085\u0001\u001a\u0006\b\u008e\u0001\u0010\u0087\u0001R'\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00020\u001a8\u0006¢\u0006\u0010\n\u0006\b\u008b\u0001\u0010\u0085\u0001\u001a\u0006\b\u008f\u0001\u0010\u0087\u0001R\u0019\u0010#\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0088\u0001\u0010^\u001a\u0005\b\u0090\u0001\u0010VR\u0019\u0010$\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u008c\u0001\u0010^\u001a\u0005\b\u0091\u0001\u0010VR\u001b\u0010%\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u0092\u0001\u0010^\u001a\u0005\b\u0081\u0001\u0010VR\u0019\u0010&\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b~\u0010^\u001a\u0004\b\u007f\u0010VR\u001a\u0010'\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0005\b\u0093\u0001\u0010^\u001a\u0004\b{\u0010VR\u001a\u0010(\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0005\b\u0082\u0001\u0010^\u001a\u0004\b}\u0010VR\u001b\u0010)\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u0094\u0001\u0010^\u001a\u0005\b\u0095\u0001\u0010VR\u001b\u0010*\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u0096\u0001\u0010^\u001a\u0005\b\u0097\u0001\u0010VR\u001b\u0010+\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u0098\u0001\u0010^\u001a\u0005\b\u0099\u0001\u0010VR\u001b\u0010,\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u009a\u0001\u0010^\u001a\u0005\b\u009b\u0001\u0010VR\u001b\u0010-\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u009c\u0001\u0010^\u001a\u0005\b\u0098\u0001\u0010VR\u001b\u0010.\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u009d\u0001\u0010^\u001a\u0005\b\u009c\u0001\u0010VR\u001b\u0010/\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u009e\u0001\u0010^\u001a\u0005\b\u0096\u0001\u0010VR\u001a\u00100\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0005\b\u009f\u0001\u0010^\u001a\u0004\br\u0010VR\u001a\u00101\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0005\b \u0001\u0010^\u001a\u0004\bp\u0010VR\u001a\u00102\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0005\b¡\u0001\u0010^\u001a\u0004\bn\u0010VR\u001a\u00103\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0005\b¢\u0001\u0010^\u001a\u0004\bj\u0010VR\u001b\u00104\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b£\u0001\u0010^\u001a\u0005\b¤\u0001\u0010VR\u001b\u00105\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u0086\u0001\u0010^\u001a\u0005\b¥\u0001\u0010VR\u001b\u00106\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b¦\u0001\u0010^\u001a\u0005\b§\u0001\u0010VR\u001b\u00107\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b¨\u0001\u0010^\u001a\u0005\b¦\u0001\u0010VR\u001b\u00108\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b©\u0001\u0010^\u001a\u0005\b \u0001\u0010VR\u001b\u00109\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\bª\u0001\u0010^\u001a\u0005\b\u009f\u0001\u0010VR\u001b\u0010:\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b«\u0001\u0010^\u001a\u0005\b\u009e\u0001\u0010VR\u001b\u0010;\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b§\u0001\u0010^\u001a\u0005\b\u009d\u0001\u0010VR\u001b\u0010<\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b¥\u0001\u0010^\u001a\u0005\b¬\u0001\u0010VR\u001b\u0010=\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b¤\u0001\u0010^\u001a\u0005\b\u00ad\u0001\u0010VR\u001b\u0010>\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b®\u0001\u0010^\u001a\u0005\b¯\u0001\u0010VR\u001b\u0010?\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b°\u0001\u0010^\u001a\u0005\b±\u0001\u0010VR\u001a\u0010@\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\be\u0010^\u001a\u0005\b£\u0001\u0010VR\u001b\u0010A\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b²\u0001\u0010^\u001a\u0005\b¢\u0001\u0010VR\u001b\u0010B\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b³\u0001\u0010^\u001a\u0005\b\u0094\u0001\u0010VR\u001b\u0010C\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b´\u0001\u0010^\u001a\u0005\b¡\u0001\u0010VR\u001b\u0010D\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\bµ\u0001\u0010^\u001a\u0005\bµ\u0001\u0010VR\u001b\u0010E\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b¶\u0001\u0010^\u001a\u0005\b´\u0001\u0010VR\u001a\u0010F\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0005\b\u0099\u0001\u0010^\u001a\u0004\b]\u0010VR#\u0010I\u001a\n\u0012\u0004\u0012\u00020H\u0018\u00010G8\u0006¢\u0006\u0010\n\u0006\b\u009b\u0001\u0010·\u0001\u001a\u0006\b²\u0001\u0010¸\u0001¨\u0006¹\u0001"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;", "Landroid/os/Parcelable;", "", Title.type, "prompt", "choose", "instructionsDisclaimer", "selectPageNavBarTitle", "capturePageNavBarTitle", "checkPageNavBarTitle", "pendingPageNavBarTitle", "requestPageNavBarTitle", "reviewUploadPageNavBarTitle", "autoClassificationPageNavBarTitle", "Lcom/withpersona/sdk2/inquiry/governmentid/OverridableText;", "captureScreenTitle", "captureScreenDescription", "scanInstructions", "capturing", "confirmCapture", "captureDisclaimer", "buttonSubmit", "buttonRetake", "confirmCaptureTitle", "processingTitle", "processingDescription", "", "idClassToName", "chooseCaptureMethodTitle", "chooseCaptureMethodBody", "chooseCaptureMethodCameraButton", "chooseCaptureMethodUploadButton", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "reviewSelectedImageTitle", "reviewSelectedImageBody", "reviewSelectedImageConfirmButton", "reviewSelectedImageChooseAnotherButton", "cameraPermissionsTitle", "cameraPermissionsPrompt", "cameraPermissionsAllowButtonText", "cameraPermissionsCancelButtonText", "microphonePermissionsTitle", "microphonePermissionsPrompt", "microphonePermissionsAllowButtonText", "microphonePermissionsCancelButtonText", "hintHoldStill", "hintLowLight", "helpButtonText", "barcodeHelpModalTitle", "barcodeHelpModalPrompt", "barcodeHelpModalHints", "barcodeHelpModalContinueButtonText", "idFrontHelpModalTitle", "idFrontHelpModalPrompt", "idFrontHelpModalHints", "idFrontHelpModalContinueButtonText", "idBackHelpModalTitle", "idBackHelpModalPrompt", "idBackHelpModalHints", "idBackHelpModalContinueButtonText", "staticCaptureTipsTitle", "staticCaptureTipsSubtext", "unableToClassifyDocumentTitle", "unableToClassifyDocumentContinueButtonText", "idClassRejectedTitle", "idClassRejectedContinueButtonText", "countryInputTitle", "idClassInputTitle", "manualClassificationTitle", "manualClassificationContinueButtonText", "autoClassificationCaptureTipText", "", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$LocalizationOverride;", "localizationOverrides", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/OverridableText;Lcom/withpersona/sdk2/inquiry/governmentid/OverridableText;Lcom/withpersona/sdk2/inquiry/governmentid/OverridableText;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/OverridableText;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/OverridableText;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/withpersona/sdk2/inquiry/governmentid/OverridableText;Lcom/withpersona/sdk2/inquiry/governmentid/OverridableText;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getTitle", "b", "v0", "c", "z", "d", "g0", "e", "K0", "f", "t", "g", "x", "h", "q0", "i", "w0", "j", "G0", "k", "l", "Lcom/withpersona/sdk2/inquiry/governmentid/OverridableText;", "v", "()Lcom/withpersona/sdk2/inquiry/governmentid/OverridableText;", "m", "u", "n", "I0", "o", "w", "p", "G", "q", "s", "r", "I", "u0", "s0", "Ljava/util/Map;", "V", "()Ljava/util/Map;", "D", "y", "A", "C", "E", "B", "C0", "x0", "B0", "y0", "F", "H", "J", "p0", "K", "o0", "L", "m0", "M", "n0", "N", "O", "P", "Q", "R", "S", "T", "U", "d0", "c0", "W", "b0", "X", "Y", "Z", "a0", "U0", "M0", "e0", "c1", "f0", "b1", "h0", "i0", "j0", "k0", "l0", "Ljava/util/List;", "()Ljava/util/List;", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class Strings implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Strings> CREATOR = new C3501a();

            /* JADX INFO: renamed from: A, reason: from kotlin metadata and from toString */
            @NotNull
            public final String chooseCaptureMethodUploadButton;

            /* JADX INFO: renamed from: B, reason: from kotlin metadata and from toString */
            @NotNull
            public final Map<IdConfig.EnumC3514b, String> reviewSelectedImageTitle;

            /* JADX INFO: renamed from: C, reason: from kotlin metadata and from toString */
            @NotNull
            public final Map<IdConfig.EnumC3514b, String> reviewSelectedImageBody;

            /* JADX INFO: renamed from: D, reason: from kotlin metadata and from toString */
            @NotNull
            public final String reviewSelectedImageConfirmButton;

            /* JADX INFO: renamed from: E, reason: from kotlin metadata and from toString */
            @NotNull
            public final String reviewSelectedImageChooseAnotherButton;

            /* JADX INFO: renamed from: F, reason: from kotlin metadata and from toString */
            @Nullable
            public final String cameraPermissionsTitle;

            /* JADX INFO: renamed from: G, reason: from kotlin metadata and from toString */
            @Nullable
            public final String cameraPermissionsPrompt;

            /* JADX INFO: renamed from: H, reason: from kotlin metadata and from toString */
            @Nullable
            public final String cameraPermissionsAllowButtonText;

            /* JADX INFO: renamed from: I, reason: from kotlin metadata and from toString */
            @Nullable
            public final String cameraPermissionsCancelButtonText;

            /* JADX INFO: renamed from: J, reason: from kotlin metadata and from toString */
            @Nullable
            public final String microphonePermissionsTitle;

            /* JADX INFO: renamed from: K, reason: from kotlin metadata and from toString */
            @Nullable
            public final String microphonePermissionsPrompt;

            /* JADX INFO: renamed from: L, reason: from kotlin metadata and from toString */
            @Nullable
            public final String microphonePermissionsAllowButtonText;

            /* JADX INFO: renamed from: M, reason: from kotlin metadata and from toString */
            @Nullable
            public final String microphonePermissionsCancelButtonText;

            /* JADX INFO: renamed from: N, reason: from kotlin metadata and from toString */
            @Nullable
            public final String hintHoldStill;

            /* JADX INFO: renamed from: O, reason: from kotlin metadata and from toString */
            @Nullable
            public final String hintLowLight;

            /* JADX INFO: renamed from: P, reason: from kotlin metadata and from toString */
            @Nullable
            public final String helpButtonText;

            /* JADX INFO: renamed from: Q, reason: from kotlin metadata and from toString */
            @Nullable
            public final String barcodeHelpModalTitle;

            /* JADX INFO: renamed from: R, reason: from kotlin metadata and from toString */
            @Nullable
            public final String barcodeHelpModalPrompt;

            /* JADX INFO: renamed from: S, reason: from kotlin metadata and from toString */
            @Nullable
            public final String barcodeHelpModalHints;

            /* JADX INFO: renamed from: T, reason: from kotlin metadata and from toString */
            @Nullable
            public final String barcodeHelpModalContinueButtonText;

            /* JADX INFO: renamed from: U, reason: from kotlin metadata and from toString */
            @Nullable
            public final String idFrontHelpModalTitle;

            /* JADX INFO: renamed from: V, reason: from kotlin metadata and from toString */
            @Nullable
            public final String idFrontHelpModalPrompt;

            /* JADX INFO: renamed from: W, reason: from kotlin metadata and from toString */
            @Nullable
            public final String idFrontHelpModalHints;

            /* JADX INFO: renamed from: X, reason: from kotlin metadata and from toString */
            @Nullable
            public final String idFrontHelpModalContinueButtonText;

            /* JADX INFO: renamed from: Y, reason: from kotlin metadata and from toString */
            @Nullable
            public final String idBackHelpModalTitle;

            /* JADX INFO: renamed from: Z, reason: from kotlin metadata and from toString */
            @Nullable
            public final String idBackHelpModalPrompt;

            /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
            @NotNull
            public final String title;

            /* JADX INFO: renamed from: a0, reason: from kotlin metadata and from toString */
            @Nullable
            public final String idBackHelpModalHints;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
            @NotNull
            public final String prompt;

            /* JADX INFO: renamed from: b0, reason: from kotlin metadata and from toString */
            @Nullable
            public final String idBackHelpModalContinueButtonText;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
            @NotNull
            public final String choose;

            /* JADX INFO: renamed from: c0, reason: from kotlin metadata and from toString */
            @Nullable
            public final String staticCaptureTipsTitle;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
            @NotNull
            public final String instructionsDisclaimer;

            /* JADX INFO: renamed from: d0, reason: from kotlin metadata and from toString */
            @Nullable
            public final String staticCaptureTipsSubtext;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
            @Nullable
            public final String selectPageNavBarTitle;

            /* JADX INFO: renamed from: e0, reason: from kotlin metadata and from toString */
            @Nullable
            public final String unableToClassifyDocumentTitle;

            /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
            @Nullable
            public final String capturePageNavBarTitle;

            /* JADX INFO: renamed from: f0, reason: from kotlin metadata and from toString */
            @Nullable
            public final String unableToClassifyDocumentContinueButtonText;

            /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
            @Nullable
            public final String checkPageNavBarTitle;

            /* JADX INFO: renamed from: g0, reason: from kotlin metadata and from toString */
            @Nullable
            public final String idClassRejectedTitle;

            /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
            @Nullable
            public final String pendingPageNavBarTitle;

            /* JADX INFO: renamed from: h0, reason: from kotlin metadata and from toString */
            @Nullable
            public final String idClassRejectedContinueButtonText;

            /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
            @Nullable
            public final String requestPageNavBarTitle;

            /* JADX INFO: renamed from: i0, reason: from kotlin metadata and from toString */
            @Nullable
            public final String countryInputTitle;

            /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
            @Nullable
            public final String reviewUploadPageNavBarTitle;

            /* JADX INFO: renamed from: j0, reason: from kotlin metadata and from toString */
            @Nullable
            public final String idClassInputTitle;

            /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
            @Nullable
            public final String autoClassificationPageNavBarTitle;

            /* JADX INFO: renamed from: k0, reason: from kotlin metadata and from toString */
            @Nullable
            public final String manualClassificationTitle;

            /* JADX INFO: renamed from: l, reason: from kotlin metadata and from toString */
            @NotNull
            public final OverridableText captureScreenTitle;

            /* JADX INFO: renamed from: l0, reason: from kotlin metadata and from toString */
            @Nullable
            public final String manualClassificationContinueButtonText;

            /* JADX INFO: renamed from: m, reason: from kotlin metadata and from toString */
            @NotNull
            public final OverridableText captureScreenDescription;

            /* JADX INFO: renamed from: m0, reason: from kotlin metadata and from toString */
            @Nullable
            public final String autoClassificationCaptureTipText;

            /* JADX INFO: renamed from: n, reason: from kotlin metadata and from toString */
            @NotNull
            public final OverridableText scanInstructions;

            /* JADX INFO: renamed from: n0, reason: from kotlin metadata and from toString */
            @Nullable
            public final List<NextStep.GovernmentId.LocalizationOverride> localizationOverrides;

            /* JADX INFO: renamed from: o, reason: from kotlin metadata and from toString */
            @NotNull
            public final String capturing;

            /* JADX INFO: renamed from: p, reason: from kotlin metadata and from toString */
            @NotNull
            public final OverridableText confirmCapture;

            /* JADX INFO: renamed from: q, reason: from kotlin metadata and from toString */
            @NotNull
            public final String captureDisclaimer;

            /* JADX INFO: renamed from: r, reason: from kotlin metadata and from toString */
            @NotNull
            public final String buttonSubmit;

            /* JADX INFO: renamed from: s, reason: from kotlin metadata and from toString */
            @NotNull
            public final String buttonRetake;

            /* JADX INFO: renamed from: t, reason: from kotlin metadata and from toString */
            @NotNull
            public final OverridableText confirmCaptureTitle;

            /* JADX INFO: renamed from: u, reason: from kotlin metadata and from toString */
            @NotNull
            public final String processingTitle;

            /* JADX INFO: renamed from: v, reason: from kotlin metadata and from toString */
            @NotNull
            public final String processingDescription;

            /* JADX INFO: renamed from: w, reason: from kotlin metadata and from toString */
            @NotNull
            public final Map<String, String> idClassToName;

            /* JADX INFO: renamed from: x, reason: from kotlin metadata and from toString */
            @NotNull
            public final OverridableText chooseCaptureMethodTitle;

            /* JADX INFO: renamed from: y, reason: from kotlin metadata and from toString */
            @NotNull
            public final OverridableText chooseCaptureMethodBody;

            /* JADX INFO: renamed from: z, reason: from kotlin metadata and from toString */
            @NotNull
            public final String chooseCaptureMethodCameraButton;

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input$Strings$a */
            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class C3501a implements Parcelable.Creator<Strings> {
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Strings createFromParcel(Parcel parcel) {
                    ArrayList arrayList;
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    String string4 = parcel.readString();
                    String string5 = parcel.readString();
                    String string6 = parcel.readString();
                    String string7 = parcel.readString();
                    String string8 = parcel.readString();
                    String string9 = parcel.readString();
                    String string10 = parcel.readString();
                    String string11 = parcel.readString();
                    Parcelable.Creator<OverridableText> creator = OverridableText.CREATOR;
                    OverridableText overridableTextCreateFromParcel = creator.createFromParcel(parcel);
                    OverridableText overridableTextCreateFromParcel2 = creator.createFromParcel(parcel);
                    OverridableText overridableTextCreateFromParcel3 = creator.createFromParcel(parcel);
                    String string12 = parcel.readString();
                    OverridableText overridableTextCreateFromParcel4 = creator.createFromParcel(parcel);
                    String string13 = parcel.readString();
                    String string14 = parcel.readString();
                    String string15 = parcel.readString();
                    OverridableText overridableTextCreateFromParcel5 = creator.createFromParcel(parcel);
                    String string16 = parcel.readString();
                    String string17 = parcel.readString();
                    int i10 = parcel.readInt();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(i10);
                    int i11 = 0;
                    while (i11 != i10) {
                        linkedHashMap.put(parcel.readString(), parcel.readString());
                        i11++;
                        i10 = i10;
                    }
                    Parcelable.Creator<OverridableText> creator2 = OverridableText.CREATOR;
                    OverridableText overridableTextCreateFromParcel6 = creator2.createFromParcel(parcel);
                    OverridableText overridableTextCreateFromParcel7 = creator2.createFromParcel(parcel);
                    String string18 = parcel.readString();
                    String string19 = parcel.readString();
                    int i12 = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(i12);
                    int i13 = 0;
                    while (i13 != i12) {
                        linkedHashMap2.put(IdConfig.EnumC3514b.valueOf(parcel.readString()), parcel.readString());
                        i13++;
                        i12 = i12;
                    }
                    int i14 = parcel.readInt();
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap(i14);
                    int i15 = 0;
                    while (i15 != i14) {
                        linkedHashMap3.put(IdConfig.EnumC3514b.valueOf(parcel.readString()), parcel.readString());
                        i15++;
                        i14 = i14;
                    }
                    String string20 = parcel.readString();
                    String string21 = parcel.readString();
                    String string22 = parcel.readString();
                    String string23 = parcel.readString();
                    String string24 = parcel.readString();
                    String string25 = parcel.readString();
                    String string26 = parcel.readString();
                    String string27 = parcel.readString();
                    String string28 = parcel.readString();
                    String string29 = parcel.readString();
                    String string30 = parcel.readString();
                    String string31 = parcel.readString();
                    String string32 = parcel.readString();
                    String string33 = parcel.readString();
                    String string34 = parcel.readString();
                    String string35 = parcel.readString();
                    String string36 = parcel.readString();
                    String string37 = parcel.readString();
                    String string38 = parcel.readString();
                    String string39 = parcel.readString();
                    String string40 = parcel.readString();
                    String string41 = parcel.readString();
                    String string42 = parcel.readString();
                    String string43 = parcel.readString();
                    String string44 = parcel.readString();
                    String string45 = parcel.readString();
                    String string46 = parcel.readString();
                    String string47 = parcel.readString();
                    String string48 = parcel.readString();
                    String string49 = parcel.readString();
                    String string50 = parcel.readString();
                    String string51 = parcel.readString();
                    String string52 = parcel.readString();
                    String string53 = parcel.readString();
                    String string54 = parcel.readString();
                    String string55 = parcel.readString();
                    if (parcel.readInt() == 0) {
                        arrayList = null;
                    } else {
                        int i16 = parcel.readInt();
                        ArrayList arrayList2 = new ArrayList(i16);
                        int i17 = 0;
                        while (i17 != i16) {
                            arrayList2.add(parcel.readParcelable(Strings.class.getClassLoader()));
                            i17++;
                            i16 = i16;
                        }
                        arrayList = arrayList2;
                    }
                    return new Strings(string, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, overridableTextCreateFromParcel, overridableTextCreateFromParcel2, overridableTextCreateFromParcel3, string12, overridableTextCreateFromParcel4, string13, string14, string15, overridableTextCreateFromParcel5, string16, string17, linkedHashMap, overridableTextCreateFromParcel6, overridableTextCreateFromParcel7, string18, string19, linkedHashMap2, linkedHashMap3, string20, string21, string22, string23, string24, string25, string26, string27, string28, string29, string30, string31, string32, string33, string34, string35, string36, string37, string38, string39, string40, string41, string42, string43, string44, string45, string46, string47, string48, string49, string50, string51, string52, string53, string54, string55, arrayList);
                }

                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Strings[] newArray(int i10) {
                    return new Strings[i10];
                }
            }

            public Strings(@NotNull String title, @NotNull String prompt, @NotNull String choose, @NotNull String instructionsDisclaimer, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @NotNull OverridableText captureScreenTitle, @NotNull OverridableText captureScreenDescription, @NotNull OverridableText scanInstructions, @NotNull String capturing, @NotNull OverridableText confirmCapture, @NotNull String captureDisclaimer, @NotNull String buttonSubmit, @NotNull String buttonRetake, @NotNull OverridableText confirmCaptureTitle, @NotNull String processingTitle, @NotNull String processingDescription, @NotNull Map<String, String> idClassToName, @NotNull OverridableText chooseCaptureMethodTitle, @NotNull OverridableText chooseCaptureMethodBody, @NotNull String chooseCaptureMethodCameraButton, @NotNull String chooseCaptureMethodUploadButton, @NotNull Map<IdConfig.EnumC3514b, String> reviewSelectedImageTitle, @NotNull Map<IdConfig.EnumC3514b, String> reviewSelectedImageBody, @NotNull String reviewSelectedImageConfirmButton, @NotNull String reviewSelectedImageChooseAnotherButton, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable String str18, @Nullable String str19, @Nullable String str20, @Nullable String str21, @Nullable String str22, @Nullable String str23, @Nullable String str24, @Nullable String str25, @Nullable String str26, @Nullable String str27, @Nullable String str28, @Nullable String str29, @Nullable String str30, @Nullable String str31, @Nullable String str32, @Nullable String str33, @Nullable String str34, @Nullable String str35, @Nullable String str36, @Nullable String str37, @Nullable String str38, @Nullable String str39, @Nullable String str40, @Nullable String str41, @Nullable List<NextStep.GovernmentId.LocalizationOverride> list) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(prompt, "prompt");
                Intrinsics.checkNotNullParameter(choose, "choose");
                Intrinsics.checkNotNullParameter(instructionsDisclaimer, "instructionsDisclaimer");
                Intrinsics.checkNotNullParameter(captureScreenTitle, "captureScreenTitle");
                Intrinsics.checkNotNullParameter(captureScreenDescription, "captureScreenDescription");
                Intrinsics.checkNotNullParameter(scanInstructions, "scanInstructions");
                Intrinsics.checkNotNullParameter(capturing, "capturing");
                Intrinsics.checkNotNullParameter(confirmCapture, "confirmCapture");
                Intrinsics.checkNotNullParameter(captureDisclaimer, "captureDisclaimer");
                Intrinsics.checkNotNullParameter(buttonSubmit, "buttonSubmit");
                Intrinsics.checkNotNullParameter(buttonRetake, "buttonRetake");
                Intrinsics.checkNotNullParameter(confirmCaptureTitle, "confirmCaptureTitle");
                Intrinsics.checkNotNullParameter(processingTitle, "processingTitle");
                Intrinsics.checkNotNullParameter(processingDescription, "processingDescription");
                Intrinsics.checkNotNullParameter(idClassToName, "idClassToName");
                Intrinsics.checkNotNullParameter(chooseCaptureMethodTitle, "chooseCaptureMethodTitle");
                Intrinsics.checkNotNullParameter(chooseCaptureMethodBody, "chooseCaptureMethodBody");
                Intrinsics.checkNotNullParameter(chooseCaptureMethodCameraButton, "chooseCaptureMethodCameraButton");
                Intrinsics.checkNotNullParameter(chooseCaptureMethodUploadButton, "chooseCaptureMethodUploadButton");
                Intrinsics.checkNotNullParameter(reviewSelectedImageTitle, "reviewSelectedImageTitle");
                Intrinsics.checkNotNullParameter(reviewSelectedImageBody, "reviewSelectedImageBody");
                Intrinsics.checkNotNullParameter(reviewSelectedImageConfirmButton, "reviewSelectedImageConfirmButton");
                Intrinsics.checkNotNullParameter(reviewSelectedImageChooseAnotherButton, "reviewSelectedImageChooseAnotherButton");
                this.title = title;
                this.prompt = prompt;
                this.choose = choose;
                this.instructionsDisclaimer = instructionsDisclaimer;
                this.selectPageNavBarTitle = str;
                this.capturePageNavBarTitle = str2;
                this.checkPageNavBarTitle = str3;
                this.pendingPageNavBarTitle = str4;
                this.requestPageNavBarTitle = str5;
                this.reviewUploadPageNavBarTitle = str6;
                this.autoClassificationPageNavBarTitle = str7;
                this.captureScreenTitle = captureScreenTitle;
                this.captureScreenDescription = captureScreenDescription;
                this.scanInstructions = scanInstructions;
                this.capturing = capturing;
                this.confirmCapture = confirmCapture;
                this.captureDisclaimer = captureDisclaimer;
                this.buttonSubmit = buttonSubmit;
                this.buttonRetake = buttonRetake;
                this.confirmCaptureTitle = confirmCaptureTitle;
                this.processingTitle = processingTitle;
                this.processingDescription = processingDescription;
                this.idClassToName = idClassToName;
                this.chooseCaptureMethodTitle = chooseCaptureMethodTitle;
                this.chooseCaptureMethodBody = chooseCaptureMethodBody;
                this.chooseCaptureMethodCameraButton = chooseCaptureMethodCameraButton;
                this.chooseCaptureMethodUploadButton = chooseCaptureMethodUploadButton;
                this.reviewSelectedImageTitle = reviewSelectedImageTitle;
                this.reviewSelectedImageBody = reviewSelectedImageBody;
                this.reviewSelectedImageConfirmButton = reviewSelectedImageConfirmButton;
                this.reviewSelectedImageChooseAnotherButton = reviewSelectedImageChooseAnotherButton;
                this.cameraPermissionsTitle = str8;
                this.cameraPermissionsPrompt = str9;
                this.cameraPermissionsAllowButtonText = str10;
                this.cameraPermissionsCancelButtonText = str11;
                this.microphonePermissionsTitle = str12;
                this.microphonePermissionsPrompt = str13;
                this.microphonePermissionsAllowButtonText = str14;
                this.microphonePermissionsCancelButtonText = str15;
                this.hintHoldStill = str16;
                this.hintLowLight = str17;
                this.helpButtonText = str18;
                this.barcodeHelpModalTitle = str19;
                this.barcodeHelpModalPrompt = str20;
                this.barcodeHelpModalHints = str21;
                this.barcodeHelpModalContinueButtonText = str22;
                this.idFrontHelpModalTitle = str23;
                this.idFrontHelpModalPrompt = str24;
                this.idFrontHelpModalHints = str25;
                this.idFrontHelpModalContinueButtonText = str26;
                this.idBackHelpModalTitle = str27;
                this.idBackHelpModalPrompt = str28;
                this.idBackHelpModalHints = str29;
                this.idBackHelpModalContinueButtonText = str30;
                this.staticCaptureTipsTitle = str31;
                this.staticCaptureTipsSubtext = str32;
                this.unableToClassifyDocumentTitle = str33;
                this.unableToClassifyDocumentContinueButtonText = str34;
                this.idClassRejectedTitle = str35;
                this.idClassRejectedContinueButtonText = str36;
                this.countryInputTitle = str37;
                this.idClassInputTitle = str38;
                this.manualClassificationTitle = str39;
                this.manualClassificationContinueButtonText = str40;
                this.autoClassificationCaptureTipText = str41;
                this.localizationOverrides = list;
            }

            @NotNull
            /* JADX INFO: renamed from: A, reason: from getter */
            public final OverridableText getChooseCaptureMethodBody() {
                return this.chooseCaptureMethodBody;
            }

            @NotNull
            /* JADX INFO: renamed from: B0, reason: from getter */
            public final String getReviewSelectedImageConfirmButton() {
                return this.reviewSelectedImageConfirmButton;
            }

            @NotNull
            /* JADX INFO: renamed from: C, reason: from getter */
            public final String getChooseCaptureMethodCameraButton() {
                return this.chooseCaptureMethodCameraButton;
            }

            @NotNull
            /* JADX INFO: renamed from: C0 */
            public final Map<IdConfig.EnumC3514b, String> m17199C0() {
                return this.reviewSelectedImageTitle;
            }

            @NotNull
            /* JADX INFO: renamed from: D, reason: from getter */
            public final OverridableText getChooseCaptureMethodTitle() {
                return this.chooseCaptureMethodTitle;
            }

            @NotNull
            /* JADX INFO: renamed from: E, reason: from getter */
            public final String getChooseCaptureMethodUploadButton() {
                return this.chooseCaptureMethodUploadButton;
            }

            @NotNull
            /* JADX INFO: renamed from: G, reason: from getter */
            public final OverridableText getConfirmCapture() {
                return this.confirmCapture;
            }

            @Nullable
            /* JADX INFO: renamed from: G0, reason: from getter */
            public final String getReviewUploadPageNavBarTitle() {
                return this.reviewUploadPageNavBarTitle;
            }

            @NotNull
            /* JADX INFO: renamed from: I, reason: from getter */
            public final OverridableText getConfirmCaptureTitle() {
                return this.confirmCaptureTitle;
            }

            @NotNull
            /* JADX INFO: renamed from: I0, reason: from getter */
            public final OverridableText getScanInstructions() {
                return this.scanInstructions;
            }

            @Nullable
            /* JADX INFO: renamed from: J, reason: from getter */
            public final String getCountryInputTitle() {
                return this.countryInputTitle;
            }

            @Nullable
            /* JADX INFO: renamed from: K, reason: from getter */
            public final String getHelpButtonText() {
                return this.helpButtonText;
            }

            @Nullable
            /* JADX INFO: renamed from: K0, reason: from getter */
            public final String getSelectPageNavBarTitle() {
                return this.selectPageNavBarTitle;
            }

            @Nullable
            /* JADX INFO: renamed from: L, reason: from getter */
            public final String getHintHoldStill() {
                return this.hintHoldStill;
            }

            @Nullable
            /* JADX INFO: renamed from: M0, reason: from getter */
            public final String getStaticCaptureTipsSubtext() {
                return this.staticCaptureTipsSubtext;
            }

            @Nullable
            /* JADX INFO: renamed from: N, reason: from getter */
            public final String getHintLowLight() {
                return this.hintLowLight;
            }

            @Nullable
            /* JADX INFO: renamed from: O, reason: from getter */
            public final String getIdBackHelpModalContinueButtonText() {
                return this.idBackHelpModalContinueButtonText;
            }

            @Nullable
            /* JADX INFO: renamed from: P, reason: from getter */
            public final String getIdBackHelpModalHints() {
                return this.idBackHelpModalHints;
            }

            @Nullable
            /* JADX INFO: renamed from: Q, reason: from getter */
            public final String getIdBackHelpModalPrompt() {
                return this.idBackHelpModalPrompt;
            }

            @Nullable
            /* JADX INFO: renamed from: R, reason: from getter */
            public final String getIdBackHelpModalTitle() {
                return this.idBackHelpModalTitle;
            }

            @Nullable
            /* JADX INFO: renamed from: S, reason: from getter */
            public final String getIdClassInputTitle() {
                return this.idClassInputTitle;
            }

            @Nullable
            /* JADX INFO: renamed from: T, reason: from getter */
            public final String getIdClassRejectedContinueButtonText() {
                return this.idClassRejectedContinueButtonText;
            }

            @Nullable
            /* JADX INFO: renamed from: U, reason: from getter */
            public final String getIdClassRejectedTitle() {
                return this.idClassRejectedTitle;
            }

            @Nullable
            /* JADX INFO: renamed from: U0, reason: from getter */
            public final String getStaticCaptureTipsTitle() {
                return this.staticCaptureTipsTitle;
            }

            @NotNull
            /* JADX INFO: renamed from: V */
            public final Map<String, String> m17220V() {
                return this.idClassToName;
            }

            @Nullable
            /* JADX INFO: renamed from: W, reason: from getter */
            public final String getIdFrontHelpModalContinueButtonText() {
                return this.idFrontHelpModalContinueButtonText;
            }

            @Nullable
            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getAutoClassificationCaptureTipText() {
                return this.autoClassificationCaptureTipText;
            }

            @Nullable
            /* JADX INFO: renamed from: b0, reason: from getter */
            public final String getIdFrontHelpModalHints() {
                return this.idFrontHelpModalHints;
            }

            @Nullable
            /* JADX INFO: renamed from: b1, reason: from getter */
            public final String getUnableToClassifyDocumentContinueButtonText() {
                return this.unableToClassifyDocumentContinueButtonText;
            }

            @Nullable
            /* JADX INFO: renamed from: c0, reason: from getter */
            public final String getIdFrontHelpModalPrompt() {
                return this.idFrontHelpModalPrompt;
            }

            @Nullable
            /* JADX INFO: renamed from: c1, reason: from getter */
            public final String getUnableToClassifyDocumentTitle() {
                return this.unableToClassifyDocumentTitle;
            }

            @Nullable
            /* JADX INFO: renamed from: d0, reason: from getter */
            public final String getIdFrontHelpModalTitle() {
                return this.idFrontHelpModalTitle;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Strings)) {
                    return false;
                }
                Strings strings = (Strings) other;
                return Intrinsics.m31980c(this.title, strings.title) && Intrinsics.m31980c(this.prompt, strings.prompt) && Intrinsics.m31980c(this.choose, strings.choose) && Intrinsics.m31980c(this.instructionsDisclaimer, strings.instructionsDisclaimer) && Intrinsics.m31980c(this.selectPageNavBarTitle, strings.selectPageNavBarTitle) && Intrinsics.m31980c(this.capturePageNavBarTitle, strings.capturePageNavBarTitle) && Intrinsics.m31980c(this.checkPageNavBarTitle, strings.checkPageNavBarTitle) && Intrinsics.m31980c(this.pendingPageNavBarTitle, strings.pendingPageNavBarTitle) && Intrinsics.m31980c(this.requestPageNavBarTitle, strings.requestPageNavBarTitle) && Intrinsics.m31980c(this.reviewUploadPageNavBarTitle, strings.reviewUploadPageNavBarTitle) && Intrinsics.m31980c(this.autoClassificationPageNavBarTitle, strings.autoClassificationPageNavBarTitle) && Intrinsics.m31980c(this.captureScreenTitle, strings.captureScreenTitle) && Intrinsics.m31980c(this.captureScreenDescription, strings.captureScreenDescription) && Intrinsics.m31980c(this.scanInstructions, strings.scanInstructions) && Intrinsics.m31980c(this.capturing, strings.capturing) && Intrinsics.m31980c(this.confirmCapture, strings.confirmCapture) && Intrinsics.m31980c(this.captureDisclaimer, strings.captureDisclaimer) && Intrinsics.m31980c(this.buttonSubmit, strings.buttonSubmit) && Intrinsics.m31980c(this.buttonRetake, strings.buttonRetake) && Intrinsics.m31980c(this.confirmCaptureTitle, strings.confirmCaptureTitle) && Intrinsics.m31980c(this.processingTitle, strings.processingTitle) && Intrinsics.m31980c(this.processingDescription, strings.processingDescription) && Intrinsics.m31980c(this.idClassToName, strings.idClassToName) && Intrinsics.m31980c(this.chooseCaptureMethodTitle, strings.chooseCaptureMethodTitle) && Intrinsics.m31980c(this.chooseCaptureMethodBody, strings.chooseCaptureMethodBody) && Intrinsics.m31980c(this.chooseCaptureMethodCameraButton, strings.chooseCaptureMethodCameraButton) && Intrinsics.m31980c(this.chooseCaptureMethodUploadButton, strings.chooseCaptureMethodUploadButton) && Intrinsics.m31980c(this.reviewSelectedImageTitle, strings.reviewSelectedImageTitle) && Intrinsics.m31980c(this.reviewSelectedImageBody, strings.reviewSelectedImageBody) && Intrinsics.m31980c(this.reviewSelectedImageConfirmButton, strings.reviewSelectedImageConfirmButton) && Intrinsics.m31980c(this.reviewSelectedImageChooseAnotherButton, strings.reviewSelectedImageChooseAnotherButton) && Intrinsics.m31980c(this.cameraPermissionsTitle, strings.cameraPermissionsTitle) && Intrinsics.m31980c(this.cameraPermissionsPrompt, strings.cameraPermissionsPrompt) && Intrinsics.m31980c(this.cameraPermissionsAllowButtonText, strings.cameraPermissionsAllowButtonText) && Intrinsics.m31980c(this.cameraPermissionsCancelButtonText, strings.cameraPermissionsCancelButtonText) && Intrinsics.m31980c(this.microphonePermissionsTitle, strings.microphonePermissionsTitle) && Intrinsics.m31980c(this.microphonePermissionsPrompt, strings.microphonePermissionsPrompt) && Intrinsics.m31980c(this.microphonePermissionsAllowButtonText, strings.microphonePermissionsAllowButtonText) && Intrinsics.m31980c(this.microphonePermissionsCancelButtonText, strings.microphonePermissionsCancelButtonText) && Intrinsics.m31980c(this.hintHoldStill, strings.hintHoldStill) && Intrinsics.m31980c(this.hintLowLight, strings.hintLowLight) && Intrinsics.m31980c(this.helpButtonText, strings.helpButtonText) && Intrinsics.m31980c(this.barcodeHelpModalTitle, strings.barcodeHelpModalTitle) && Intrinsics.m31980c(this.barcodeHelpModalPrompt, strings.barcodeHelpModalPrompt) && Intrinsics.m31980c(this.barcodeHelpModalHints, strings.barcodeHelpModalHints) && Intrinsics.m31980c(this.barcodeHelpModalContinueButtonText, strings.barcodeHelpModalContinueButtonText) && Intrinsics.m31980c(this.idFrontHelpModalTitle, strings.idFrontHelpModalTitle) && Intrinsics.m31980c(this.idFrontHelpModalPrompt, strings.idFrontHelpModalPrompt) && Intrinsics.m31980c(this.idFrontHelpModalHints, strings.idFrontHelpModalHints) && Intrinsics.m31980c(this.idFrontHelpModalContinueButtonText, strings.idFrontHelpModalContinueButtonText) && Intrinsics.m31980c(this.idBackHelpModalTitle, strings.idBackHelpModalTitle) && Intrinsics.m31980c(this.idBackHelpModalPrompt, strings.idBackHelpModalPrompt) && Intrinsics.m31980c(this.idBackHelpModalHints, strings.idBackHelpModalHints) && Intrinsics.m31980c(this.idBackHelpModalContinueButtonText, strings.idBackHelpModalContinueButtonText) && Intrinsics.m31980c(this.staticCaptureTipsTitle, strings.staticCaptureTipsTitle) && Intrinsics.m31980c(this.staticCaptureTipsSubtext, strings.staticCaptureTipsSubtext) && Intrinsics.m31980c(this.unableToClassifyDocumentTitle, strings.unableToClassifyDocumentTitle) && Intrinsics.m31980c(this.unableToClassifyDocumentContinueButtonText, strings.unableToClassifyDocumentContinueButtonText) && Intrinsics.m31980c(this.idClassRejectedTitle, strings.idClassRejectedTitle) && Intrinsics.m31980c(this.idClassRejectedContinueButtonText, strings.idClassRejectedContinueButtonText) && Intrinsics.m31980c(this.countryInputTitle, strings.countryInputTitle) && Intrinsics.m31980c(this.idClassInputTitle, strings.idClassInputTitle) && Intrinsics.m31980c(this.manualClassificationTitle, strings.manualClassificationTitle) && Intrinsics.m31980c(this.manualClassificationContinueButtonText, strings.manualClassificationContinueButtonText) && Intrinsics.m31980c(this.autoClassificationCaptureTipText, strings.autoClassificationCaptureTipText) && Intrinsics.m31980c(this.localizationOverrides, strings.localizationOverrides);
            }

            @Nullable
            /* JADX INFO: renamed from: f, reason: from getter */
            public final String getAutoClassificationPageNavBarTitle() {
                return this.autoClassificationPageNavBarTitle;
            }

            @Nullable
            /* JADX INFO: renamed from: g, reason: from getter */
            public final String getBarcodeHelpModalContinueButtonText() {
                return this.barcodeHelpModalContinueButtonText;
            }

            @NotNull
            /* JADX INFO: renamed from: g0, reason: from getter */
            public final String getInstructionsDisclaimer() {
                return this.instructionsDisclaimer;
            }

            @NotNull
            public final String getTitle() {
                return this.title;
            }

            @Nullable
            /* JADX INFO: renamed from: h0 */
            public final List<NextStep.GovernmentId.LocalizationOverride> m17231h0() {
                return this.localizationOverrides;
            }

            public int hashCode() {
                int iHashCode = ((((((this.title.hashCode() * 31) + this.prompt.hashCode()) * 31) + this.choose.hashCode()) * 31) + this.instructionsDisclaimer.hashCode()) * 31;
                String str = this.selectPageNavBarTitle;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.capturePageNavBarTitle;
                int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.checkPageNavBarTitle;
                int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.pendingPageNavBarTitle;
                int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.requestPageNavBarTitle;
                int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
                String str6 = this.reviewUploadPageNavBarTitle;
                int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
                String str7 = this.autoClassificationPageNavBarTitle;
                int iHashCode8 = (((((((((((((((((((((((((((((((((((((((((iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31) + this.captureScreenTitle.hashCode()) * 31) + this.captureScreenDescription.hashCode()) * 31) + this.scanInstructions.hashCode()) * 31) + this.capturing.hashCode()) * 31) + this.confirmCapture.hashCode()) * 31) + this.captureDisclaimer.hashCode()) * 31) + this.buttonSubmit.hashCode()) * 31) + this.buttonRetake.hashCode()) * 31) + this.confirmCaptureTitle.hashCode()) * 31) + this.processingTitle.hashCode()) * 31) + this.processingDescription.hashCode()) * 31) + this.idClassToName.hashCode()) * 31) + this.chooseCaptureMethodTitle.hashCode()) * 31) + this.chooseCaptureMethodBody.hashCode()) * 31) + this.chooseCaptureMethodCameraButton.hashCode()) * 31) + this.chooseCaptureMethodUploadButton.hashCode()) * 31) + this.reviewSelectedImageTitle.hashCode()) * 31) + this.reviewSelectedImageBody.hashCode()) * 31) + this.reviewSelectedImageConfirmButton.hashCode()) * 31) + this.reviewSelectedImageChooseAnotherButton.hashCode()) * 31;
                String str8 = this.cameraPermissionsTitle;
                int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
                String str9 = this.cameraPermissionsPrompt;
                int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
                String str10 = this.cameraPermissionsAllowButtonText;
                int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
                String str11 = this.cameraPermissionsCancelButtonText;
                int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
                String str12 = this.microphonePermissionsTitle;
                int iHashCode13 = (iHashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
                String str13 = this.microphonePermissionsPrompt;
                int iHashCode14 = (iHashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
                String str14 = this.microphonePermissionsAllowButtonText;
                int iHashCode15 = (iHashCode14 + (str14 == null ? 0 : str14.hashCode())) * 31;
                String str15 = this.microphonePermissionsCancelButtonText;
                int iHashCode16 = (iHashCode15 + (str15 == null ? 0 : str15.hashCode())) * 31;
                String str16 = this.hintHoldStill;
                int iHashCode17 = (iHashCode16 + (str16 == null ? 0 : str16.hashCode())) * 31;
                String str17 = this.hintLowLight;
                int iHashCode18 = (iHashCode17 + (str17 == null ? 0 : str17.hashCode())) * 31;
                String str18 = this.helpButtonText;
                int iHashCode19 = (iHashCode18 + (str18 == null ? 0 : str18.hashCode())) * 31;
                String str19 = this.barcodeHelpModalTitle;
                int iHashCode20 = (iHashCode19 + (str19 == null ? 0 : str19.hashCode())) * 31;
                String str20 = this.barcodeHelpModalPrompt;
                int iHashCode21 = (iHashCode20 + (str20 == null ? 0 : str20.hashCode())) * 31;
                String str21 = this.barcodeHelpModalHints;
                int iHashCode22 = (iHashCode21 + (str21 == null ? 0 : str21.hashCode())) * 31;
                String str22 = this.barcodeHelpModalContinueButtonText;
                int iHashCode23 = (iHashCode22 + (str22 == null ? 0 : str22.hashCode())) * 31;
                String str23 = this.idFrontHelpModalTitle;
                int iHashCode24 = (iHashCode23 + (str23 == null ? 0 : str23.hashCode())) * 31;
                String str24 = this.idFrontHelpModalPrompt;
                int iHashCode25 = (iHashCode24 + (str24 == null ? 0 : str24.hashCode())) * 31;
                String str25 = this.idFrontHelpModalHints;
                int iHashCode26 = (iHashCode25 + (str25 == null ? 0 : str25.hashCode())) * 31;
                String str26 = this.idFrontHelpModalContinueButtonText;
                int iHashCode27 = (iHashCode26 + (str26 == null ? 0 : str26.hashCode())) * 31;
                String str27 = this.idBackHelpModalTitle;
                int iHashCode28 = (iHashCode27 + (str27 == null ? 0 : str27.hashCode())) * 31;
                String str28 = this.idBackHelpModalPrompt;
                int iHashCode29 = (iHashCode28 + (str28 == null ? 0 : str28.hashCode())) * 31;
                String str29 = this.idBackHelpModalHints;
                int iHashCode30 = (iHashCode29 + (str29 == null ? 0 : str29.hashCode())) * 31;
                String str30 = this.idBackHelpModalContinueButtonText;
                int iHashCode31 = (iHashCode30 + (str30 == null ? 0 : str30.hashCode())) * 31;
                String str31 = this.staticCaptureTipsTitle;
                int iHashCode32 = (iHashCode31 + (str31 == null ? 0 : str31.hashCode())) * 31;
                String str32 = this.staticCaptureTipsSubtext;
                int iHashCode33 = (iHashCode32 + (str32 == null ? 0 : str32.hashCode())) * 31;
                String str33 = this.unableToClassifyDocumentTitle;
                int iHashCode34 = (iHashCode33 + (str33 == null ? 0 : str33.hashCode())) * 31;
                String str34 = this.unableToClassifyDocumentContinueButtonText;
                int iHashCode35 = (iHashCode34 + (str34 == null ? 0 : str34.hashCode())) * 31;
                String str35 = this.idClassRejectedTitle;
                int iHashCode36 = (iHashCode35 + (str35 == null ? 0 : str35.hashCode())) * 31;
                String str36 = this.idClassRejectedContinueButtonText;
                int iHashCode37 = (iHashCode36 + (str36 == null ? 0 : str36.hashCode())) * 31;
                String str37 = this.countryInputTitle;
                int iHashCode38 = (iHashCode37 + (str37 == null ? 0 : str37.hashCode())) * 31;
                String str38 = this.idClassInputTitle;
                int iHashCode39 = (iHashCode38 + (str38 == null ? 0 : str38.hashCode())) * 31;
                String str39 = this.manualClassificationTitle;
                int iHashCode40 = (iHashCode39 + (str39 == null ? 0 : str39.hashCode())) * 31;
                String str40 = this.manualClassificationContinueButtonText;
                int iHashCode41 = (iHashCode40 + (str40 == null ? 0 : str40.hashCode())) * 31;
                String str41 = this.autoClassificationCaptureTipText;
                int iHashCode42 = (iHashCode41 + (str41 == null ? 0 : str41.hashCode())) * 31;
                List<NextStep.GovernmentId.LocalizationOverride> list = this.localizationOverrides;
                return iHashCode42 + (list != null ? list.hashCode() : 0);
            }

            @Nullable
            /* JADX INFO: renamed from: i, reason: from getter */
            public final String getBarcodeHelpModalHints() {
                return this.barcodeHelpModalHints;
            }

            @Nullable
            /* JADX INFO: renamed from: j, reason: from getter */
            public final String getBarcodeHelpModalPrompt() {
                return this.barcodeHelpModalPrompt;
            }

            @Nullable
            /* JADX INFO: renamed from: j0, reason: from getter */
            public final String getManualClassificationContinueButtonText() {
                return this.manualClassificationContinueButtonText;
            }

            @Nullable
            /* JADX INFO: renamed from: k, reason: from getter */
            public final String getBarcodeHelpModalTitle() {
                return this.barcodeHelpModalTitle;
            }

            @Nullable
            /* JADX INFO: renamed from: k0, reason: from getter */
            public final String getManualClassificationTitle() {
                return this.manualClassificationTitle;
            }

            @NotNull
            /* JADX INFO: renamed from: m, reason: from getter */
            public final String getButtonRetake() {
                return this.buttonRetake;
            }

            @Nullable
            /* JADX INFO: renamed from: m0, reason: from getter */
            public final String getMicrophonePermissionsAllowButtonText() {
                return this.microphonePermissionsAllowButtonText;
            }

            @NotNull
            /* JADX INFO: renamed from: n, reason: from getter */
            public final String getButtonSubmit() {
                return this.buttonSubmit;
            }

            @Nullable
            /* JADX INFO: renamed from: n0, reason: from getter */
            public final String getMicrophonePermissionsCancelButtonText() {
                return this.microphonePermissionsCancelButtonText;
            }

            @Nullable
            /* JADX INFO: renamed from: o, reason: from getter */
            public final String getCameraPermissionsAllowButtonText() {
                return this.cameraPermissionsAllowButtonText;
            }

            @Nullable
            /* JADX INFO: renamed from: o0, reason: from getter */
            public final String getMicrophonePermissionsPrompt() {
                return this.microphonePermissionsPrompt;
            }

            @Nullable
            /* JADX INFO: renamed from: p, reason: from getter */
            public final String getCameraPermissionsCancelButtonText() {
                return this.cameraPermissionsCancelButtonText;
            }

            @Nullable
            /* JADX INFO: renamed from: p0, reason: from getter */
            public final String getMicrophonePermissionsTitle() {
                return this.microphonePermissionsTitle;
            }

            @Nullable
            /* JADX INFO: renamed from: q, reason: from getter */
            public final String getCameraPermissionsPrompt() {
                return this.cameraPermissionsPrompt;
            }

            @Nullable
            /* JADX INFO: renamed from: q0, reason: from getter */
            public final String getPendingPageNavBarTitle() {
                return this.pendingPageNavBarTitle;
            }

            @Nullable
            /* JADX INFO: renamed from: r, reason: from getter */
            public final String getCameraPermissionsTitle() {
                return this.cameraPermissionsTitle;
            }

            @NotNull
            /* JADX INFO: renamed from: s, reason: from getter */
            public final String getCaptureDisclaimer() {
                return this.captureDisclaimer;
            }

            @NotNull
            /* JADX INFO: renamed from: s0, reason: from getter */
            public final String getProcessingDescription() {
                return this.processingDescription;
            }

            @Nullable
            /* JADX INFO: renamed from: t, reason: from getter */
            public final String getCapturePageNavBarTitle() {
                return this.capturePageNavBarTitle;
            }

            @NotNull
            public String toString() {
                return "Strings(title=" + this.title + ", prompt=" + this.prompt + ", choose=" + this.choose + ", instructionsDisclaimer=" + this.instructionsDisclaimer + ", selectPageNavBarTitle=" + this.selectPageNavBarTitle + ", capturePageNavBarTitle=" + this.capturePageNavBarTitle + ", checkPageNavBarTitle=" + this.checkPageNavBarTitle + ", pendingPageNavBarTitle=" + this.pendingPageNavBarTitle + ", requestPageNavBarTitle=" + this.requestPageNavBarTitle + ", reviewUploadPageNavBarTitle=" + this.reviewUploadPageNavBarTitle + ", autoClassificationPageNavBarTitle=" + this.autoClassificationPageNavBarTitle + ", captureScreenTitle=" + this.captureScreenTitle + ", captureScreenDescription=" + this.captureScreenDescription + ", scanInstructions=" + this.scanInstructions + ", capturing=" + this.capturing + ", confirmCapture=" + this.confirmCapture + ", captureDisclaimer=" + this.captureDisclaimer + ", buttonSubmit=" + this.buttonSubmit + ", buttonRetake=" + this.buttonRetake + ", confirmCaptureTitle=" + this.confirmCaptureTitle + ", processingTitle=" + this.processingTitle + ", processingDescription=" + this.processingDescription + ", idClassToName=" + this.idClassToName + ", chooseCaptureMethodTitle=" + this.chooseCaptureMethodTitle + ", chooseCaptureMethodBody=" + this.chooseCaptureMethodBody + ", chooseCaptureMethodCameraButton=" + this.chooseCaptureMethodCameraButton + ", chooseCaptureMethodUploadButton=" + this.chooseCaptureMethodUploadButton + ", reviewSelectedImageTitle=" + this.reviewSelectedImageTitle + ", reviewSelectedImageBody=" + this.reviewSelectedImageBody + ", reviewSelectedImageConfirmButton=" + this.reviewSelectedImageConfirmButton + ", reviewSelectedImageChooseAnotherButton=" + this.reviewSelectedImageChooseAnotherButton + ", cameraPermissionsTitle=" + this.cameraPermissionsTitle + ", cameraPermissionsPrompt=" + this.cameraPermissionsPrompt + ", cameraPermissionsAllowButtonText=" + this.cameraPermissionsAllowButtonText + ", cameraPermissionsCancelButtonText=" + this.cameraPermissionsCancelButtonText + ", microphonePermissionsTitle=" + this.microphonePermissionsTitle + ", microphonePermissionsPrompt=" + this.microphonePermissionsPrompt + ", microphonePermissionsAllowButtonText=" + this.microphonePermissionsAllowButtonText + ", microphonePermissionsCancelButtonText=" + this.microphonePermissionsCancelButtonText + ", hintHoldStill=" + this.hintHoldStill + ", hintLowLight=" + this.hintLowLight + ", helpButtonText=" + this.helpButtonText + ", barcodeHelpModalTitle=" + this.barcodeHelpModalTitle + ", barcodeHelpModalPrompt=" + this.barcodeHelpModalPrompt + ", barcodeHelpModalHints=" + this.barcodeHelpModalHints + ", barcodeHelpModalContinueButtonText=" + this.barcodeHelpModalContinueButtonText + ", idFrontHelpModalTitle=" + this.idFrontHelpModalTitle + ", idFrontHelpModalPrompt=" + this.idFrontHelpModalPrompt + ", idFrontHelpModalHints=" + this.idFrontHelpModalHints + ", idFrontHelpModalContinueButtonText=" + this.idFrontHelpModalContinueButtonText + ", idBackHelpModalTitle=" + this.idBackHelpModalTitle + ", idBackHelpModalPrompt=" + this.idBackHelpModalPrompt + ", idBackHelpModalHints=" + this.idBackHelpModalHints + ", idBackHelpModalContinueButtonText=" + this.idBackHelpModalContinueButtonText + ", staticCaptureTipsTitle=" + this.staticCaptureTipsTitle + ", staticCaptureTipsSubtext=" + this.staticCaptureTipsSubtext + ", unableToClassifyDocumentTitle=" + this.unableToClassifyDocumentTitle + ", unableToClassifyDocumentContinueButtonText=" + this.unableToClassifyDocumentContinueButtonText + ", idClassRejectedTitle=" + this.idClassRejectedTitle + ", idClassRejectedContinueButtonText=" + this.idClassRejectedContinueButtonText + ", countryInputTitle=" + this.countryInputTitle + ", idClassInputTitle=" + this.idClassInputTitle + ", manualClassificationTitle=" + this.manualClassificationTitle + ", manualClassificationContinueButtonText=" + this.manualClassificationContinueButtonText + ", autoClassificationCaptureTipText=" + this.autoClassificationCaptureTipText + ", localizationOverrides=" + this.localizationOverrides + ")";
            }

            @NotNull
            /* JADX INFO: renamed from: u, reason: from getter */
            public final OverridableText getCaptureScreenDescription() {
                return this.captureScreenDescription;
            }

            @NotNull
            /* JADX INFO: renamed from: u0, reason: from getter */
            public final String getProcessingTitle() {
                return this.processingTitle;
            }

            @NotNull
            /* JADX INFO: renamed from: v, reason: from getter */
            public final OverridableText getCaptureScreenTitle() {
                return this.captureScreenTitle;
            }

            @NotNull
            /* JADX INFO: renamed from: v0, reason: from getter */
            public final String getPrompt() {
                return this.prompt;
            }

            @NotNull
            /* JADX INFO: renamed from: w, reason: from getter */
            public final String getCapturing() {
                return this.capturing;
            }

            @Nullable
            /* JADX INFO: renamed from: w0, reason: from getter */
            public final String getRequestPageNavBarTitle() {
                return this.requestPageNavBarTitle;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.title);
                dest.writeString(this.prompt);
                dest.writeString(this.choose);
                dest.writeString(this.instructionsDisclaimer);
                dest.writeString(this.selectPageNavBarTitle);
                dest.writeString(this.capturePageNavBarTitle);
                dest.writeString(this.checkPageNavBarTitle);
                dest.writeString(this.pendingPageNavBarTitle);
                dest.writeString(this.requestPageNavBarTitle);
                dest.writeString(this.reviewUploadPageNavBarTitle);
                dest.writeString(this.autoClassificationPageNavBarTitle);
                this.captureScreenTitle.writeToParcel(dest, flags);
                this.captureScreenDescription.writeToParcel(dest, flags);
                this.scanInstructions.writeToParcel(dest, flags);
                dest.writeString(this.capturing);
                this.confirmCapture.writeToParcel(dest, flags);
                dest.writeString(this.captureDisclaimer);
                dest.writeString(this.buttonSubmit);
                dest.writeString(this.buttonRetake);
                this.confirmCaptureTitle.writeToParcel(dest, flags);
                dest.writeString(this.processingTitle);
                dest.writeString(this.processingDescription);
                Map<String, String> map = this.idClassToName;
                dest.writeInt(map.size());
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    dest.writeString(entry.getKey());
                    dest.writeString(entry.getValue());
                }
                this.chooseCaptureMethodTitle.writeToParcel(dest, flags);
                this.chooseCaptureMethodBody.writeToParcel(dest, flags);
                dest.writeString(this.chooseCaptureMethodCameraButton);
                dest.writeString(this.chooseCaptureMethodUploadButton);
                Map<IdConfig.EnumC3514b, String> map2 = this.reviewSelectedImageTitle;
                dest.writeInt(map2.size());
                for (Map.Entry<IdConfig.EnumC3514b, String> entry2 : map2.entrySet()) {
                    dest.writeString(entry2.getKey().name());
                    dest.writeString(entry2.getValue());
                }
                Map<IdConfig.EnumC3514b, String> map3 = this.reviewSelectedImageBody;
                dest.writeInt(map3.size());
                for (Map.Entry<IdConfig.EnumC3514b, String> entry3 : map3.entrySet()) {
                    dest.writeString(entry3.getKey().name());
                    dest.writeString(entry3.getValue());
                }
                dest.writeString(this.reviewSelectedImageConfirmButton);
                dest.writeString(this.reviewSelectedImageChooseAnotherButton);
                dest.writeString(this.cameraPermissionsTitle);
                dest.writeString(this.cameraPermissionsPrompt);
                dest.writeString(this.cameraPermissionsAllowButtonText);
                dest.writeString(this.cameraPermissionsCancelButtonText);
                dest.writeString(this.microphonePermissionsTitle);
                dest.writeString(this.microphonePermissionsPrompt);
                dest.writeString(this.microphonePermissionsAllowButtonText);
                dest.writeString(this.microphonePermissionsCancelButtonText);
                dest.writeString(this.hintHoldStill);
                dest.writeString(this.hintLowLight);
                dest.writeString(this.helpButtonText);
                dest.writeString(this.barcodeHelpModalTitle);
                dest.writeString(this.barcodeHelpModalPrompt);
                dest.writeString(this.barcodeHelpModalHints);
                dest.writeString(this.barcodeHelpModalContinueButtonText);
                dest.writeString(this.idFrontHelpModalTitle);
                dest.writeString(this.idFrontHelpModalPrompt);
                dest.writeString(this.idFrontHelpModalHints);
                dest.writeString(this.idFrontHelpModalContinueButtonText);
                dest.writeString(this.idBackHelpModalTitle);
                dest.writeString(this.idBackHelpModalPrompt);
                dest.writeString(this.idBackHelpModalHints);
                dest.writeString(this.idBackHelpModalContinueButtonText);
                dest.writeString(this.staticCaptureTipsTitle);
                dest.writeString(this.staticCaptureTipsSubtext);
                dest.writeString(this.unableToClassifyDocumentTitle);
                dest.writeString(this.unableToClassifyDocumentContinueButtonText);
                dest.writeString(this.idClassRejectedTitle);
                dest.writeString(this.idClassRejectedContinueButtonText);
                dest.writeString(this.countryInputTitle);
                dest.writeString(this.idClassInputTitle);
                dest.writeString(this.manualClassificationTitle);
                dest.writeString(this.manualClassificationContinueButtonText);
                dest.writeString(this.autoClassificationCaptureTipText);
                List<NextStep.GovernmentId.LocalizationOverride> list = this.localizationOverrides;
                if (list == null) {
                    dest.writeInt(0);
                    return;
                }
                dest.writeInt(1);
                dest.writeInt(list.size());
                Iterator<NextStep.GovernmentId.LocalizationOverride> it = list.iterator();
                while (it.hasNext()) {
                    dest.writeParcelable(it.next(), flags);
                }
            }

            @Nullable
            /* JADX INFO: renamed from: x, reason: from getter */
            public final String getCheckPageNavBarTitle() {
                return this.checkPageNavBarTitle;
            }

            @NotNull
            /* JADX INFO: renamed from: x0 */
            public final Map<IdConfig.EnumC3514b, String> m17258x0() {
                return this.reviewSelectedImageBody;
            }

            @NotNull
            /* JADX INFO: renamed from: y0, reason: from getter */
            public final String getReviewSelectedImageChooseAnotherButton() {
                return this.reviewSelectedImageChooseAnotherButton;
            }

            @NotNull
            /* JADX INFO: renamed from: z, reason: from getter */
            public final String getChoose() {
                return this.choose;
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C3502a implements Parcelable.Creator<Input> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Input createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                int i10 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList.add(IdConfig.CREATOR.createFromParcel(parcel));
                }
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                boolean z10 = true;
                if (parcel.readInt() == 0) {
                    z10 = false;
                }
                boolean z11 = parcel.readInt() != 0;
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    arrayList2.add(CaptureOptionNativeMobile.valueOf(parcel.readString()));
                }
                return new Input(string, string2, arrayList, string3, string4, string5, z10, z11, arrayList2, (StepStyles.GovernmentIdStepStyle) parcel.readParcelable(Input.class.getClassLoader()), Strings.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt() != 0 ? z10 : false, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), VideoCaptureConfig.CREATOR.createFromParcel(parcel), (NextStep.GovernmentId.AssetConfig) parcel.readParcelable(r19.getClassLoader()), parcel.readInt() != 0, AutoClassificationConfig.CREATOR.createFromParcel(parcel), StyleElements.Axis.valueOf(parcel.readString()), PendingPageTextPosition.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : DigitalIdConfig.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, EnumC6852d.valueOf(parcel.readString()), parcel.readString(), (CustomPendingPage) parcel.readParcelable(Input.class.getClassLoader()));
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Input[] newArray(int i10) {
                return new Input[i10];
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r25v0, resolved type: java.util.List<? extends com.withpersona.sdk2.inquiry.network.dto.government_id.CaptureOptionNativeMobile> */
        /* JADX WARN: Multi-variable type inference failed */
        public Input(@NotNull String sessionToken, @Nullable String str, @NotNull List<IdConfig> enabledIdClasses, @NotNull String inquiryId, @NotNull String fromStep, @NotNull String fromComponent, boolean z10, boolean z11, @NotNull List<? extends CaptureOptionNativeMobile> enabledCaptureOptionsNativeMobile, @Nullable StepStyles.GovernmentIdStepStyle governmentIdStepStyle, @NotNull Strings strings, int i10, @NotNull String fieldKeyDocument, @NotNull String fieldKeyIdClass, long j10, boolean z12, @Nullable Integer num, @NotNull VideoCaptureConfig videoCaptureConfig, @NotNull NextStep.GovernmentId.AssetConfig assetConfig, boolean z13, @NotNull AutoClassificationConfig autoClassificationConfig, @NotNull StyleElements.Axis reviewCaptureButtonsAxis, @NotNull PendingPageTextPosition pendingPageTextVerticalPosition, @Nullable DigitalIdConfig digitalIdConfig, boolean z14, @Nullable Integer num2, @NotNull EnumC6852d designVersion, @Nullable String str2, @Nullable CustomPendingPage customPendingPage) {
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(enabledIdClasses, "enabledIdClasses");
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(fromStep, "fromStep");
            Intrinsics.checkNotNullParameter(fromComponent, "fromComponent");
            Intrinsics.checkNotNullParameter(enabledCaptureOptionsNativeMobile, "enabledCaptureOptionsNativeMobile");
            Intrinsics.checkNotNullParameter(strings, "strings");
            Intrinsics.checkNotNullParameter(fieldKeyDocument, "fieldKeyDocument");
            Intrinsics.checkNotNullParameter(fieldKeyIdClass, "fieldKeyIdClass");
            Intrinsics.checkNotNullParameter(videoCaptureConfig, "videoCaptureConfig");
            Intrinsics.checkNotNullParameter(assetConfig, "assetConfig");
            Intrinsics.checkNotNullParameter(autoClassificationConfig, "autoClassificationConfig");
            Intrinsics.checkNotNullParameter(reviewCaptureButtonsAxis, "reviewCaptureButtonsAxis");
            Intrinsics.checkNotNullParameter(pendingPageTextVerticalPosition, "pendingPageTextVerticalPosition");
            Intrinsics.checkNotNullParameter(designVersion, "designVersion");
            this.sessionToken = sessionToken;
            this.countryCode = str;
            this.enabledIdClasses = enabledIdClasses;
            this.inquiryId = inquiryId;
            this.fromStep = fromStep;
            this.fromComponent = fromComponent;
            this.backStepEnabled = z10;
            this.cancelButtonEnabled = z11;
            this.enabledCaptureOptionsNativeMobile = enabledCaptureOptionsNativeMobile;
            this.styles = governmentIdStepStyle;
            this.strings = strings;
            this.imageCaptureCount = i10;
            this.fieldKeyDocument = fieldKeyDocument;
            this.fieldKeyIdClass = fieldKeyIdClass;
            this.manualCaptureButtonDelayMs = j10;
            this.shouldSkipReviewScreen = z12;
            this.theme = num;
            this.videoCaptureConfig = videoCaptureConfig;
            this.assetConfig = assetConfig;
            this.isEnabled = z13;
            this.autoClassificationConfig = autoClassificationConfig;
            this.reviewCaptureButtonsAxis = reviewCaptureButtonsAxis;
            this.pendingPageTextVerticalPosition = pendingPageTextVerticalPosition;
            this.digitalIdConfig = digitalIdConfig;
            this.staticCaptureTipsEnabled = z14;
            this.holographicTorchEnabledDurationMs = num2;
            this.designVersion = designVersion;
            this.flowWatermarkText = str2;
            this.customPendingPage = customPendingPage;
        }

        @NotNull
        /* JADX INFO: renamed from: A, reason: from getter */
        public final PendingPageTextPosition getPendingPageTextVerticalPosition() {
            return this.pendingPageTextVerticalPosition;
        }

        @NotNull
        /* JADX INFO: renamed from: C, reason: from getter */
        public final StyleElements.Axis getReviewCaptureButtonsAxis() {
            return this.reviewCaptureButtonsAxis;
        }

        /* JADX INFO: renamed from: D, reason: from getter */
        public final boolean getShouldSkipReviewScreen() {
            return this.shouldSkipReviewScreen;
        }

        /* JADX INFO: renamed from: E, reason: from getter */
        public final boolean getStaticCaptureTipsEnabled() {
            return this.staticCaptureTipsEnabled;
        }

        @NotNull
        /* JADX INFO: renamed from: G, reason: from getter */
        public final Strings getStrings() {
            return this.strings;
        }

        @Nullable
        /* JADX INFO: renamed from: I, reason: from getter */
        public final StepStyles.GovernmentIdStepStyle getStyles() {
            return this.styles;
        }

        @NotNull
        /* JADX INFO: renamed from: J, reason: from getter */
        public final VideoCaptureConfig getVideoCaptureConfig() {
            return this.videoCaptureConfig;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final NextStep.GovernmentId.AssetConfig getAssetConfig() {
            return this.assetConfig;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public final AutoClassificationConfig getAutoClassificationConfig() {
            return this.autoClassificationConfig;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final boolean getBackStepEnabled() {
            return this.backStepEnabled;
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final boolean getCancelButtonEnabled() {
            return this.cancelButtonEnabled;
        }

        /* JADX INFO: renamed from: isEnabled, reason: from getter */
        public final boolean getIsEnabled() {
            return this.isEnabled;
        }

        @Nullable
        /* JADX INFO: renamed from: j, reason: from getter */
        public final String getCountryCode() {
            return this.countryCode;
        }

        @Nullable
        /* JADX INFO: renamed from: k, reason: from getter */
        public final CustomPendingPage getCustomPendingPage() {
            return this.customPendingPage;
        }

        @NotNull
        /* JADX INFO: renamed from: m, reason: from getter */
        public final EnumC6852d getDesignVersion() {
            return this.designVersion;
        }

        @NotNull
        /* JADX INFO: renamed from: n */
        public final List<CaptureOptionNativeMobile> m17183n() {
            return this.enabledCaptureOptionsNativeMobile;
        }

        @NotNull
        /* JADX INFO: renamed from: o */
        public final List<IdConfig> m17184o() {
            return this.enabledIdClasses;
        }

        @NotNull
        /* JADX INFO: renamed from: p, reason: from getter */
        public final String getFieldKeyDocument() {
            return this.fieldKeyDocument;
        }

        @NotNull
        /* JADX INFO: renamed from: q, reason: from getter */
        public final String getFieldKeyIdClass() {
            return this.fieldKeyIdClass;
        }

        @Nullable
        /* JADX INFO: renamed from: r, reason: from getter */
        public final String getFlowWatermarkText() {
            return this.flowWatermarkText;
        }

        @NotNull
        /* JADX INFO: renamed from: s, reason: from getter */
        public final String getFromComponent() {
            return this.fromComponent;
        }

        @NotNull
        /* JADX INFO: renamed from: t, reason: from getter */
        public final String getFromStep() {
            return this.fromStep;
        }

        /* JADX INFO: renamed from: u */
        public final boolean m17190u() {
            return this.enabledCaptureOptionsNativeMobile.size() > 1;
        }

        @Nullable
        /* JADX INFO: renamed from: v, reason: from getter */
        public final Integer getHolographicTorchEnabledDurationMs() {
            return this.holographicTorchEnabledDurationMs;
        }

        /* JADX INFO: renamed from: w, reason: from getter */
        public final int getImageCaptureCount() {
            return this.imageCaptureCount;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.sessionToken);
            dest.writeString(this.countryCode);
            List<IdConfig> list = this.enabledIdClasses;
            dest.writeInt(list.size());
            Iterator<IdConfig> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
            dest.writeString(this.inquiryId);
            dest.writeString(this.fromStep);
            dest.writeString(this.fromComponent);
            dest.writeInt(this.backStepEnabled ? 1 : 0);
            dest.writeInt(this.cancelButtonEnabled ? 1 : 0);
            List<CaptureOptionNativeMobile> list2 = this.enabledCaptureOptionsNativeMobile;
            dest.writeInt(list2.size());
            Iterator<CaptureOptionNativeMobile> it2 = list2.iterator();
            while (it2.hasNext()) {
                dest.writeString(it2.next().name());
            }
            dest.writeParcelable(this.styles, flags);
            this.strings.writeToParcel(dest, flags);
            dest.writeInt(this.imageCaptureCount);
            dest.writeString(this.fieldKeyDocument);
            dest.writeString(this.fieldKeyIdClass);
            dest.writeLong(this.manualCaptureButtonDelayMs);
            dest.writeInt(this.shouldSkipReviewScreen ? 1 : 0);
            Integer num = this.theme;
            if (num == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(num.intValue());
            }
            this.videoCaptureConfig.writeToParcel(dest, flags);
            dest.writeParcelable(this.assetConfig, flags);
            dest.writeInt(this.isEnabled ? 1 : 0);
            this.autoClassificationConfig.writeToParcel(dest, flags);
            dest.writeString(this.reviewCaptureButtonsAxis.name());
            dest.writeString(this.pendingPageTextVerticalPosition.name());
            DigitalIdConfig digitalIdConfig = this.digitalIdConfig;
            if (digitalIdConfig == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                digitalIdConfig.writeToParcel(dest, flags);
            }
            dest.writeInt(this.staticCaptureTipsEnabled ? 1 : 0);
            Integer num2 = this.holographicTorchEnabledDurationMs;
            if (num2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(num2.intValue());
            }
            dest.writeString(this.designVersion.name());
            dest.writeString(this.flowWatermarkText);
            dest.writeParcelable(this.customPendingPage, flags);
        }

        @NotNull
        /* JADX INFO: renamed from: x, reason: from getter */
        public final String getInquiryId() {
            return this.inquiryId;
        }

        @NotNull
        /* JADX INFO: renamed from: y, reason: from getter */
        public final String getSessionToken() {
            return this.sessionToken;
        }

        /* JADX INFO: renamed from: z, reason: from getter */
        public final long getManualCaptureButtonDelayMs() {
            return this.manualCaptureButtonDelayMs;
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$a */
    @Metadata(m31664d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;", "", "<init>", "()V", "b", "d", "a", "c", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a$b;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a$c;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a$d;", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static abstract class AbstractC3503a {

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$a$a */
        @Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class a extends AbstractC3503a {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final a f13790a = new a();

            public a() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return 1411335115;
            }

            @NotNull
            public String toString() {
                return "Back";
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$a$b */
        @Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a$b;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class b extends AbstractC3503a {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final b f13791a = new b();

            public b() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return 1649914237;
            }

            @NotNull
            public String toString() {
                return "Canceled";
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$a$c */
        @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a$c;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", "a", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class c extends AbstractC3503a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            public final InternalErrorInfo cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(@NotNull InternalErrorInfo cause) {
                super(null);
                Intrinsics.checkNotNullParameter(cause, "cause");
                this.cause = cause;
            }

            @NotNull
            /* JADX INFO: renamed from: a, reason: from getter */
            public final InternalErrorInfo getCause() {
                return this.cause;
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$a$d */
        @Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a$d;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class d extends AbstractC3503a {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final d f13793a = new d();

            public d() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof d);
            }

            public int hashCode() {
                return 1099427158;
            }

            @NotNull
            public String toString() {
                return "Finished";
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ AbstractC3503a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public AbstractC3503a() {
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$b */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class C3504b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f13794a;

        static {
            int[] iArr = new int[IdConfig.EnumC3514b.values().length];
            try {
                iArr[IdConfig.EnumC3514b.Front.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IdConfig.EnumC3514b.Back.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IdConfig.EnumC3514b.FrontOrBack.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IdConfig.EnumC3514b.BarcodePdf417.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[IdConfig.EnumC3514b.PassportSignature.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f13794a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$c */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$render$2", m39664f = "GovernmentIdWorkflow.kt", m39665l = {157}, m39666m = "invokeSuspend")
    public static final class C3505c extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f13795t;

        public C3505c(InterfaceC9557b<? super C3505c> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return GovernmentIdWorkflow.this.new C3505c(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f13795t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                C5689j c5689j = C5689j.f21847a;
                Context context = GovernmentIdWorkflow.this.applicationContext;
                this.f13795t = 1;
                if (c5689j.m25813b(context, this) == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            GovernmentIdWorkflow.this.videoCaptureHelper.m44494a();
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((C3505c) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$d */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$render$3", m39664f = "GovernmentIdWorkflow.kt", m39665l = {}, m39666m = "invokeSuspend")
    public static final class C3506d extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f13797t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ AbstractC13218k<Input, GovernmentIdState, AbstractC3503a, Object>.a f13798u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ GovernmentIdWorkflow f13799v;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: ym.k<? super com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState, ? extends com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$a, ? extends java.lang.Object>$a */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C3506d(AbstractC13218k<? super Input, GovernmentIdState, ? extends AbstractC3503a, ? extends Object>.a aVar, GovernmentIdWorkflow governmentIdWorkflow, InterfaceC9557b<? super C3506d> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f13798u = aVar;
            this.f13799v = governmentIdWorkflow;
        }

        /* JADX INFO: renamed from: r */
        public static final Unit m17267r(GovernmentIdWorkflow governmentIdWorkflow, AbstractC13225r.c cVar) {
            governmentIdWorkflow.m17158c1(cVar);
            return Unit.f29331a;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new C3506d(this.f13798u, this.f13799v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f13797t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            InterfaceC13215h<AbstractC13225r<? super Input, GovernmentIdState, ? extends AbstractC3503a>> interfaceC13215hMo48837d = this.f13798u.mo48837d();
            final GovernmentIdWorkflow governmentIdWorkflow = this.f13799v;
            interfaceC13215hMo48837d.mo17905a(C13233z.m48946d(governmentIdWorkflow, null, new Function1() { // from class: io.k1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return GovernmentIdWorkflow.C3506d.m17267r(governmentIdWorkflow, (AbstractC13225r.c) obj2);
                }
            }, 1, null));
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((C3506d) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$e */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$renderScreen$1", m39664f = "GovernmentIdWorkflow.kt", m39665l = {}, m39666m = "invokeSuspend")
    public static final class C3507e extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f13800t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ Input f13801u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ GovernmentIdState f13802v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ GovernmentIdWorkflow f13803w;

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ AbstractC13218k<Input, GovernmentIdState, AbstractC3503a, Object>.a f13804x;

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: ym.k<? super com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState, ? extends com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$a, ? extends java.lang.Object>$a */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C3507e(Input input, GovernmentIdState governmentIdState, GovernmentIdWorkflow governmentIdWorkflow, AbstractC13218k<? super Input, GovernmentIdState, ? extends AbstractC3503a, ? extends Object>.a aVar, InterfaceC9557b<? super C3507e> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f13801u = input;
            this.f13802v = governmentIdState;
            this.f13803w = governmentIdWorkflow;
            this.f13804x = aVar;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new C3507e(this.f13801u, this.f13802v, this.f13803w, this.f13804x, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f13800t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            if (this.f13801u.m17184o().size() == 1) {
                GovernmentIdState governmentIdState = this.f13802v;
                GovernmentIdWorkflow governmentIdWorkflow = this.f13803w;
                AbstractC13218k<Input, GovernmentIdState, AbstractC3503a, Object>.a aVar = this.f13804x;
                Input input = this.f13801u;
                GovernmentIdWorkflow.m17116Z0(governmentIdState, governmentIdWorkflow, aVar, input, (IdConfig) CollectionsKt.m31706d0(input.m17184o()), false);
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((C3507e) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$f */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$renderScreen$24", m39664f = "GovernmentIdWorkflow.kt", m39665l = {774}, m39666m = "invokeSuspend")
    public static final class C3508f extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f13805t;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ AbstractC13218k<Input, GovernmentIdState, AbstractC3503a, Object>.a f13807v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ GovernmentIdState f13808w;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: ym.k<? super com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState, ? extends com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$a, ? extends java.lang.Object>$a */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C3508f(AbstractC13218k<? super Input, GovernmentIdState, ? extends AbstractC3503a, ? extends Object>.a aVar, GovernmentIdState governmentIdState, InterfaceC9557b<? super C3508f> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f13807v = aVar;
            this.f13808w = governmentIdState;
        }

        /* JADX INFO: renamed from: r */
        public static final Unit m17269r(GovernmentIdState governmentIdState, AbstractC13225r.c cVar) {
            cVar.m48903e(governmentIdState);
            return Unit.f29331a;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return GovernmentIdWorkflow.this.new C3508f(this.f13807v, this.f13808w, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f13805t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                C5689j c5689j = C5689j.f21847a;
                Context context = GovernmentIdWorkflow.this.applicationContext;
                this.f13805t = 1;
                if (c5689j.m25813b(context, this) == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            GovernmentIdWorkflow.this.videoCaptureHelper.m44494a();
            InterfaceC13215h<AbstractC13225r<? super Input, GovernmentIdState, ? extends AbstractC3503a>> interfaceC13215hMo48837d = this.f13807v.mo48837d();
            GovernmentIdWorkflow governmentIdWorkflow = GovernmentIdWorkflow.this;
            final GovernmentIdState governmentIdState = this.f13808w;
            interfaceC13215hMo48837d.mo17905a(C13233z.m48946d(governmentIdWorkflow, null, new Function1() { // from class: io.l1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return GovernmentIdWorkflow.C3508f.m17269r(governmentIdState, (AbstractC13225r.c) obj2);
                }
            }, 1, null));
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((C3508f) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$g */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class C3509g extends C7724a implements Function1<IdConfig, Unit> {

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ GovernmentIdState f13809h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ GovernmentIdWorkflow f13810i;

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ AbstractC13218k<Input, GovernmentIdState, AbstractC3503a, Object>.a f13811j;

        /* JADX INFO: renamed from: k */
        public final /* synthetic */ Input f13812k;

        /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: ym.k<? super com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState, ? extends com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$a, ? extends java.lang.Object>$a */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C3509g(GovernmentIdState governmentIdState, GovernmentIdWorkflow governmentIdWorkflow, AbstractC13218k<? super Input, GovernmentIdState, ? extends AbstractC3503a, ? extends Object>.a aVar, Input input) {
            super(1, Intrinsics.C7723a.class, "selectIdClass", "renderScreen$selectIdClass(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lcom/squareup/workflow1/StatefulWorkflow$RenderContext;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;Z)V", 0);
            this.f13809h = governmentIdState;
            this.f13810i = governmentIdWorkflow;
            this.f13811j = aVar;
            this.f13812k = input;
        }

        /* JADX INFO: renamed from: a */
        public final void m17270a(IdConfig p8) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            GovernmentIdWorkflow.m17117a1(this.f13809h, this.f13810i, this.f13811j, this.f13812k, p8, false, 32, null);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(IdConfig idConfig) {
            m17270a(idConfig);
            return Unit.f29331a;
        }
    }

    public GovernmentIdWorkflow(@NotNull Context applicationContext, @NotNull InterfaceC7479s imageLoader, @NotNull C10303c.a submitVerificationWorkerFactory, @NotNull C3544e documentSelectWorker, @NotNull C11903j localVideoCaptureRenderer, @NotNull C11915v webRtcRenderer, @NotNull C8211t0 captureRenderer, @NotNull AutoClassifyWorker.C3563b autoClassifyWorkerFactory, @NotNull C7230n autoClassificationRenderer, @NotNull InterfaceC8169a cameraStatsManager, @NotNull C11930a navigationStateManager, @NotNull C10309c externalEventLogger, @NotNull TrackingEventsLogger trackingEventsLogger, @NotNull C4007a themeManager) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        Intrinsics.checkNotNullParameter(submitVerificationWorkerFactory, "submitVerificationWorkerFactory");
        Intrinsics.checkNotNullParameter(documentSelectWorker, "documentSelectWorker");
        Intrinsics.checkNotNullParameter(localVideoCaptureRenderer, "localVideoCaptureRenderer");
        Intrinsics.checkNotNullParameter(webRtcRenderer, "webRtcRenderer");
        Intrinsics.checkNotNullParameter(captureRenderer, "captureRenderer");
        Intrinsics.checkNotNullParameter(autoClassifyWorkerFactory, "autoClassifyWorkerFactory");
        Intrinsics.checkNotNullParameter(autoClassificationRenderer, "autoClassificationRenderer");
        Intrinsics.checkNotNullParameter(cameraStatsManager, "cameraStatsManager");
        Intrinsics.checkNotNullParameter(navigationStateManager, "navigationStateManager");
        Intrinsics.checkNotNullParameter(externalEventLogger, "externalEventLogger");
        Intrinsics.checkNotNullParameter(trackingEventsLogger, "trackingEventsLogger");
        Intrinsics.checkNotNullParameter(themeManager, "themeManager");
        this.applicationContext = applicationContext;
        this.imageLoader = imageLoader;
        this.submitVerificationWorkerFactory = submitVerificationWorkerFactory;
        this.documentSelectWorker = documentSelectWorker;
        this.localVideoCaptureRenderer = localVideoCaptureRenderer;
        this.webRtcRenderer = webRtcRenderer;
        this.captureRenderer = captureRenderer;
        this.autoClassifyWorkerFactory = autoClassifyWorkerFactory;
        this.autoClassificationRenderer = autoClassificationRenderer;
        this.cameraStatsManager = cameraStatsManager;
        this.navigationStateManager = navigationStateManager;
        this.externalEventLogger = externalEventLogger;
        this.trackingEventsLogger = trackingEventsLogger;
        this.themeManager = themeManager;
        this.videoCaptureHelper = new C11905l(null, 1, null);
    }

    /* JADX INFO: renamed from: A0 */
    public static final Unit m17067A0(final GovernmentIdWorkflow governmentIdWorkflow, final AbstractC13218k.a aVar, final GovernmentIdState governmentIdState, final Input input, final CaptureConfig captureConfig) {
        TrackingEventsLogger.logGovernmentIdButtonClickEvent$default(governmentIdWorkflow.trackingEventsLogger, new GovernmentIdButtonEventData(GovIdCaptureButtonType.RETAKE_PHOTO, null, 2, null), false, 2, null);
        aVar.mo48837d().mo17905a(C13233z.m48946d(governmentIdWorkflow, null, new Function1() { // from class: io.k0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GovernmentIdWorkflow.m17069B0(governmentIdState, input, captureConfig, aVar, governmentIdWorkflow, (AbstractC13225r.c) obj);
            }
        }, 1, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: B0 */
    public static final Unit m17069B0(GovernmentIdState governmentIdState, Input input, CaptureConfig captureConfig, final AbstractC13218k.a aVar, final GovernmentIdWorkflow governmentIdWorkflow, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objM48901c = action.m48901c();
        GovernmentIdState governmentIdState2 = objM48901c instanceof GovernmentIdState ? (GovernmentIdState) objM48901c : null;
        if (governmentIdState2 == null) {
            return Unit.f29331a;
        }
        GovernmentIdState.ReviewCapturedImage reviewCapturedImage = (GovernmentIdState.ReviewCapturedImage) governmentIdState;
        GovernmentIdState.WaitForAutocapture waitForAutocapture = new GovernmentIdState.WaitForAutocapture(reviewCapturedImage.getCurrentPart(), ((GovernmentIdState) action.m48901c()).mo16956E(), captureConfig, C3555n.m17609O((Input) action.m48900b(), reviewCapturedImage.getCurrentPart().getSide()), governmentIdState2.mo16955D(), governmentIdState2.getPartIndex(), C3555n.m17657x(action, false), EnumC11917x.Disconnected, input.getVideoCaptureConfig().getWebRtcJwt(), null, false, false, reviewCapturedImage.getCountryCode(), null, new Function0() { // from class: io.y0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GovernmentIdWorkflow.m17071C0(aVar, governmentIdWorkflow);
            }
        }, 11776, null);
        waitForAutocapture.m16957G(true);
        action.m48903e(waitForAutocapture);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: C0 */
    public static final Unit m17071C0(AbstractC13218k.a aVar, final GovernmentIdWorkflow governmentIdWorkflow) {
        aVar.mo48837d().mo17905a(C13233z.m48946d(governmentIdWorkflow, null, new Function1() { // from class: io.c1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GovernmentIdWorkflow.m17073D0(this.f26890a, (AbstractC13225r.c) obj);
            }
        }, 1, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: D0 */
    public static final Unit m17073D0(GovernmentIdWorkflow governmentIdWorkflow, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objM48901c = action.m48901c();
        GovernmentIdState.WaitForAutocapture waitForAutocapture = objM48901c instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) objM48901c : null;
        if (waitForAutocapture != null) {
            action.m48903e(GovernmentIdState.WaitForAutocapture.m17050L(waitForAutocapture, null, null, null, null, null, 0, null, governmentIdWorkflow.videoCaptureHelper.m44497d() ? EnumC11917x.Connected : EnumC11917x.Disconnected, null, null, false, false, null, null, null, 32639, null));
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: E0 */
    public static final Unit m17075E0(InterfaceC13215h interfaceC13215h) {
        interfaceC13215h.mo17905a(AbstractC3503a.b.f13791a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: F0 */
    public static final Unit m17077F0(AbstractC13218k.a aVar, GovernmentIdWorkflow governmentIdWorkflow, final GovernmentIdState governmentIdState) {
        aVar.mo48837d().mo17905a(C13233z.m48946d(governmentIdWorkflow, null, new Function1() { // from class: io.v0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GovernmentIdWorkflow.m17079G0(governmentIdState, (AbstractC13225r.c) obj);
            }
        }, 1, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: G0 */
    public static final Unit m17079G0(GovernmentIdState governmentIdState, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48903e(GovernmentIdState.ReviewCapturedImage.m17017O((GovernmentIdState.ReviewCapturedImage) governmentIdState, null, null, null, null, null, 0, null, null, null, false, null, 1791, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: H0 */
    public static final Unit m17081H0(Input input, GovernmentIdState governmentIdState, AbstractC13218k.a aVar, GovernmentIdWorkflow governmentIdWorkflow) {
        C3572p.m17738h(input, (GovernmentIdState.ReviewImageState) governmentIdState, aVar, governmentIdWorkflow.videoCaptureHelper, governmentIdWorkflow.trackingEventsLogger);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: I0 */
    public static final Unit m17083I0(AbstractC13218k.a aVar, GovernmentIdWorkflow governmentIdWorkflow) {
        C3555n.m17613S(aVar, governmentIdWorkflow.videoCaptureHelper);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: J0 */
    public static final Unit m17085J0(AbstractC13218k.a aVar, GovernmentIdWorkflow governmentIdWorkflow) {
        C3555n.m17613S(aVar, governmentIdWorkflow.videoCaptureHelper);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: K0 */
    public static final Unit m17087K0(AbstractC13218k.a aVar) {
        C3555n.m17655v(aVar);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: L0 */
    public static final Unit m17089L0(AbstractC13218k.a aVar, GovernmentIdWorkflow governmentIdWorkflow, final GovernmentIdState governmentIdState) {
        aVar.mo48837d().mo17905a(C13233z.m48946d(governmentIdWorkflow, null, new Function1() { // from class: io.l0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GovernmentIdWorkflow.m17091M0(governmentIdState, (AbstractC13225r.c) obj);
            }
        }, 1, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: M0 */
    public static final Unit m17091M0(GovernmentIdState governmentIdState, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48903e(GovernmentIdState.ReviewSelectedImage.m17028O((GovernmentIdState.ReviewSelectedImage) governmentIdState, null, null, null, null, null, null, 0, null, null, null, false, null, 3583, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: N0 */
    public static final Unit m17093N0(AbstractC13218k.a aVar, GovernmentIdWorkflow governmentIdWorkflow) {
        C3555n.m17613S(aVar, governmentIdWorkflow.videoCaptureHelper);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: O0 */
    public static final AbstractC13225r m17095O0(final GovernmentIdWorkflow governmentIdWorkflow, final AbstractC13218k.a aVar, final C10303c.b it) {
        final String string;
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof C10303c.b.c) {
            return C13233z.m48946d(governmentIdWorkflow, null, new Function1() { // from class: io.n0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return GovernmentIdWorkflow.m17097P0(this.f27009a, aVar, (AbstractC13225r.c) obj);
                }
            }, 1, null);
        }
        if (!(it instanceof C10303c.b.C14231b)) {
            if (it instanceof C10303c.b.a) {
                return C13233z.m48946d(governmentIdWorkflow, null, new Function1() { // from class: io.p0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return GovernmentIdWorkflow.m17101R0(it, governmentIdWorkflow, aVar, (AbstractC13225r.c) obj);
                    }
                }, 1, null);
            }
            throw new C7345l();
        }
        C10303c.b.C14231b c14231b = (C10303c.b.C14231b) it;
        if (c14231b.getCause() instanceof GenericFileUploadErrorResponse.DocumentErrorResponse.GovernmentIdDimensionSizeError) {
            string = governmentIdWorkflow.applicationContext.getString(C12244g.f43264t, Integer.valueOf(((GenericFileUploadErrorResponse.DocumentErrorResponse.GovernmentIdDimensionSizeError) c14231b.getCause()).getDetails().getMinDimensionSize()));
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        } else {
            string = governmentIdWorkflow.applicationContext.getString(C12244g.f43265u);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        }
        return C13233z.m48946d(governmentIdWorkflow, null, new Function1() { // from class: io.o0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GovernmentIdWorkflow.m17099Q0(string, (AbstractC13225r.c) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: P0 */
    public static final Unit m17097P0(GovernmentIdWorkflow governmentIdWorkflow, AbstractC13218k.a aVar, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        governmentIdWorkflow.m17156b1(aVar, AbstractC3503a.d.f13793a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: Q0 */
    public static final Unit m17099Q0(String str, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        GovernmentIdState backState = ((GovernmentIdState) action.m48901c()).getBackState();
        if (backState != null) {
            action.m48903e(backState.m16958u(str));
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: R0 */
    public static final Unit m17101R0(C10303c.b bVar, GovernmentIdWorkflow governmentIdWorkflow, AbstractC13218k.a aVar, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        GovernmentIdState backState = ((GovernmentIdState) action.m48901c()).getBackState();
        C10303c.b.a aVar2 = (C10303c.b.a) bVar;
        if ((aVar2.getCause() instanceof InternalErrorInfo.NetworkErrorInfo) && ((InternalErrorInfo.NetworkErrorInfo) aVar2.getCause()).isRecoverable() && backState != null) {
            String string = governmentIdWorkflow.applicationContext.getString(C12244g.f43217B);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            action.m48903e(backState.m16958u(string));
        } else {
            governmentIdWorkflow.m17156b1(aVar, new AbstractC3503a.c(aVar2.getCause()));
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: S0 */
    public static final Unit m17103S0(GovernmentIdWorkflow governmentIdWorkflow, AbstractC13218k.a aVar) {
        governmentIdWorkflow.m17156b1(aVar, AbstractC3503a.b.f13791a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: T0 */
    public static final Unit m17105T0(GovernmentIdWorkflow governmentIdWorkflow, AbstractC13218k.a aVar) {
        governmentIdWorkflow.m17156b1(aVar, AbstractC3503a.b.f13791a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: U0 */
    public static final Unit m17107U0(AbstractC13218k.a aVar) {
        C3555n.m17655v(aVar);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: V0 */
    public static final Unit m17109V0(AbstractC13218k.a aVar, GovernmentIdWorkflow governmentIdWorkflow, final GovernmentIdState governmentIdState) {
        aVar.mo48837d().mo17905a(C13233z.m48946d(governmentIdWorkflow, null, new Function1() { // from class: io.x0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GovernmentIdWorkflow.m17111W0(governmentIdState, (AbstractC13225r.c) obj);
            }
        }, 1, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: W0 */
    public static final Unit m17111W0(GovernmentIdState governmentIdState, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48903e(GovernmentIdState.ShowInstructions.m17035J((GovernmentIdState.ShowInstructions) governmentIdState, null, null, null, null, 0, null, null, null, 127, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: X0 */
    public static final AbstractC13225r<Input, GovernmentIdState, AbstractC3503a> m17113X0(IdPart.SideIdPart sideIdPart, final GovernmentIdState governmentIdState, GovernmentIdWorkflow governmentIdWorkflow, String str, final String str2) {
        final GovernmentId.GovernmentIdImage governmentIdImage = new GovernmentId.GovernmentIdImage(C7697o.m31878d(new Frame(str, null, 2, null)), C3555n.m17630e0(sideIdPart.getSide()), C3540c.m17508b(((GovernmentIdState.ChooseCaptureMethod) governmentIdState).getCaptureConfig()), GovernmentId.EnumC3485a.f13533c, null, null, 32, null);
        return C13233z.m48946d(governmentIdWorkflow, null, new Function1() { // from class: io.z0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GovernmentIdWorkflow.m17115Y0(governmentIdState, governmentIdImage, str2, (AbstractC13225r.c) obj);
            }
        }, 1, null);
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.withpersona.sdk2.inquiry.governmentid.n.y(ym.r$c, boolean, int, java.lang.Object):com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState */
    /* JADX INFO: renamed from: Y0 */
    public static final Unit m17115Y0(GovernmentIdState governmentIdState, GovernmentId.GovernmentIdImage governmentIdImage, String str, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objM48901c = action.m48901c();
        GovernmentIdState.ChooseCaptureMethod chooseCaptureMethod = objM48901c instanceof GovernmentIdState.ChooseCaptureMethod ? (GovernmentIdState.ChooseCaptureMethod) objM48901c : null;
        if (chooseCaptureMethod == null) {
            return Unit.f29331a;
        }
        GovernmentIdState.ChooseCaptureMethod chooseCaptureMethod2 = chooseCaptureMethod;
        GovernmentIdState.ChooseCaptureMethod chooseCaptureMethod3 = (GovernmentIdState.ChooseCaptureMethod) governmentIdState;
        action.m48903e(new GovernmentIdState.ReviewSelectedImage(chooseCaptureMethod3.getCurrentPart(), chooseCaptureMethod3.mo16956E(), chooseCaptureMethod3.getCaptureConfig(), governmentIdImage, str, chooseCaptureMethod2.mo16955D(), chooseCaptureMethod2.getPartIndex(), C3555n.m17658y(action, false, 1, null), null, null, false, chooseCaptureMethod3.getCountryCode(), 1792, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: Z0 */
    public static final void m17116Z0(GovernmentIdState governmentIdState, GovernmentIdWorkflow governmentIdWorkflow, AbstractC13218k<? super Input, GovernmentIdState, ? extends AbstractC3503a, ? extends Object>.a aVar, Input input, IdConfig idConfig, boolean z10) {
        GovernmentIdState.ShowInstructions showInstructions = (GovernmentIdState.ShowInstructions) governmentIdState;
        C3555n.m17617W(showInstructions, aVar, input, null, idConfig, governmentIdWorkflow.videoCaptureHelper, new CameraProperties(null, null, null, 0, 0, 31, null), (3584 & 128) != 0 ? true : z10, (3584 & 256) != 0 ? showInstructions.mo16955D() : idConfig.m17272f(), (3584 & 512) != 0 ? showInstructions.getPartIndex() : 0, (3584 & 1024) != 0 ? null : null, (3584 & 2048) != 0 ? showInstructions.getCountryCode() : null);
    }

    /* JADX INFO: renamed from: a1 */
    public static /* synthetic */ void m17117a1(GovernmentIdState governmentIdState, GovernmentIdWorkflow governmentIdWorkflow, AbstractC13218k.a aVar, Input input, IdConfig idConfig, boolean z10, int i10, Object obj) {
        if ((i10 & 32) != 0) {
            z10 = true;
        }
        m17116Z0(governmentIdState, governmentIdWorkflow, aVar, input, idConfig, z10);
    }

    /* JADX INFO: renamed from: k0 */
    public static final AbstractC13225r m17122k0(final GovernmentIdWorkflow governmentIdWorkflow, IdPart.SideIdPart sideIdPart, final GovernmentIdState governmentIdState, final AbstractC13218k.a aVar, final C3544e.a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof C3544e.a.c) {
            C3544e.a.c cVar = (C3544e.a.c) it;
            return m17113X0(sideIdPart, governmentIdState, governmentIdWorkflow, cVar.getAbsoluteFilePath(), cVar.getFileName());
        }
        if (Intrinsics.m31980c(it, C3544e.a.C14125a.f14058a)) {
            return C13233z.m48946d(governmentIdWorkflow, null, new Function1() { // from class: io.r0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return GovernmentIdWorkflow.m17126m0(governmentIdState, (AbstractC13225r.c) obj);
                }
            }, 1, null);
        }
        if (it instanceof C3544e.a.b) {
            return C13233z.m48946d(governmentIdWorkflow, null, new Function1() { // from class: io.t0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return GovernmentIdWorkflow.m17124l0(this.f27145a, aVar, it, (AbstractC13225r.c) obj);
                }
            }, 1, null);
        }
        throw new C7345l();
    }

    /* JADX INFO: renamed from: l0 */
    public static final Unit m17124l0(GovernmentIdWorkflow governmentIdWorkflow, AbstractC13218k.a aVar, C3544e.a aVar2, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        governmentIdWorkflow.m17156b1(aVar, new AbstractC3503a.c(((C3544e.a.b) aVar2).getCause()));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: m0 */
    public static final Unit m17126m0(GovernmentIdState governmentIdState, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48903e(GovernmentIdState.ChooseCaptureMethod.m16978J((GovernmentIdState.ChooseCaptureMethod) governmentIdState, null, null, null, 0, null, null, false, null, null, 447, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: n0 */
    public static final Unit m17128n0(final AbstractC13218k.a aVar, final GovernmentIdWorkflow governmentIdWorkflow, final GovernmentIdState governmentIdState, final Input input) {
        aVar.mo48837d().mo17905a(C13233z.m48946d(governmentIdWorkflow, null, new Function1() { // from class: io.m0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GovernmentIdWorkflow.m17130o0(governmentIdState, input, aVar, governmentIdWorkflow, (AbstractC13225r.c) obj);
            }
        }, 1, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: o0 */
    public static final Unit m17130o0(GovernmentIdState governmentIdState, Input input, final AbstractC13218k.a aVar, final GovernmentIdWorkflow governmentIdWorkflow, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objM48901c = action.m48901c();
        GovernmentIdState.ChooseCaptureMethod chooseCaptureMethod = objM48901c instanceof GovernmentIdState.ChooseCaptureMethod ? (GovernmentIdState.ChooseCaptureMethod) objM48901c : null;
        if (chooseCaptureMethod == null) {
            return Unit.f29331a;
        }
        GovernmentIdState.ChooseCaptureMethod chooseCaptureMethod2 = (GovernmentIdState.ChooseCaptureMethod) governmentIdState;
        action.m48903e(new GovernmentIdState.WaitForAutocapture(chooseCaptureMethod2.getCurrentPart(), chooseCaptureMethod2.mo16956E(), chooseCaptureMethod2.getCaptureConfig(), C3555n.m17609O(input, chooseCaptureMethod2.getCurrentPart().getSide()), chooseCaptureMethod.mo16955D(), chooseCaptureMethod.getPartIndex(), C3555n.m17658y(action, false, 1, null), EnumC11917x.Disconnected, input.getVideoCaptureConfig().getWebRtcJwt(), null, false, false, chooseCaptureMethod2.getCountryCode(), null, new Function0() { // from class: io.a1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GovernmentIdWorkflow.m17132p0(aVar, governmentIdWorkflow);
            }
        }, 11776, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: p0 */
    public static final Unit m17132p0(AbstractC13218k.a aVar, final GovernmentIdWorkflow governmentIdWorkflow) {
        aVar.mo48837d().mo17905a(C13233z.m48946d(governmentIdWorkflow, null, new Function1() { // from class: io.b1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GovernmentIdWorkflow.m17134q0(this.f26885a, (AbstractC13225r.c) obj);
            }
        }, 1, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: q0 */
    public static final Unit m17134q0(GovernmentIdWorkflow governmentIdWorkflow, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objM48901c = action.m48901c();
        GovernmentIdState.WaitForAutocapture waitForAutocapture = objM48901c instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) objM48901c : null;
        if (waitForAutocapture != null) {
            action.m48903e(GovernmentIdState.WaitForAutocapture.m17050L(waitForAutocapture, null, null, null, null, null, 0, null, governmentIdWorkflow.videoCaptureHelper.m44497d() ? EnumC11917x.Connected : EnumC11917x.Disconnected, null, null, false, false, null, null, null, 32639, null));
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: r0 */
    public static final Unit m17136r0(AbstractC13218k.a aVar, final GovernmentIdWorkflow governmentIdWorkflow, final GovernmentIdState governmentIdState) {
        aVar.mo48837d().mo17905a(C13233z.m48946d(governmentIdWorkflow, null, new Function1() { // from class: io.u0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GovernmentIdWorkflow.m17138s0(this.f27152a, governmentIdState, (AbstractC13225r.c) obj);
            }
        }, 1, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: s0 */
    public static final Unit m17138s0(GovernmentIdWorkflow governmentIdWorkflow, GovernmentIdState governmentIdState, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        governmentIdWorkflow.documentSelectWorker.m17534g();
        action.m48903e(GovernmentIdState.ChooseCaptureMethod.m16978J((GovernmentIdState.ChooseCaptureMethod) governmentIdState, null, null, null, 0, null, null, true, null, null, 447, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: t0 */
    public static final Unit m17140t0(AbstractC13218k.a aVar, GovernmentIdWorkflow governmentIdWorkflow) {
        C3555n.m17613S(aVar, governmentIdWorkflow.videoCaptureHelper);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: u0 */
    public static final Unit m17142u0(AbstractC13218k.a aVar) {
        C3555n.m17655v(aVar);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: v0 */
    public static final void m17144v0(final AbstractC13218k.a aVar, final GovernmentIdWorkflow governmentIdWorkflow, final AbstractC3503a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        aVar.mo48837d().mo17905a(C13233z.m48946d(governmentIdWorkflow, null, new Function1() { // from class: io.w0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GovernmentIdWorkflow.m17146w0(this.f27170a, aVar, it, (AbstractC13225r.c) obj);
            }
        }, 1, null));
    }

    /* JADX INFO: renamed from: w0 */
    public static final Unit m17146w0(GovernmentIdWorkflow governmentIdWorkflow, AbstractC13218k.a aVar, AbstractC3503a abstractC3503a, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        governmentIdWorkflow.m17156b1(aVar, abstractC3503a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: x0 */
    public static final Unit m17148x0(AbstractC13218k.a aVar, GovernmentIdWorkflow governmentIdWorkflow, final GovernmentIdState governmentIdState) {
        aVar.mo48837d().mo17905a(C13233z.m48946d(governmentIdWorkflow, null, new Function1() { // from class: io.q0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GovernmentIdWorkflow.m17150y0(governmentIdState, (AbstractC13225r.c) obj);
            }
        }, 1, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: y0 */
    public static final Unit m17150y0(GovernmentIdState governmentIdState, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48903e(GovernmentIdState.ChooseCaptureMethod.m16978J((GovernmentIdState.ChooseCaptureMethod) governmentIdState, null, null, null, 0, null, null, false, null, null, 255, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: z0 */
    public static final Unit m17152z0(Input input, GovernmentIdState governmentIdState, AbstractC13218k.a aVar, GovernmentIdWorkflow governmentIdWorkflow) {
        C3572p.m17738h(input, (GovernmentIdState.ReviewImageState) governmentIdState, aVar, governmentIdWorkflow.videoCaptureHelper, governmentIdWorkflow.trackingEventsLogger);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: Z */
    public final String m17153Z(Input.Strings strings, IdConfig.EnumC3514b enumC3514b, String str, String str2) {
        String strM17307a = strings.getChooseCaptureMethodBody().m17307a(str2, str, enumC3514b);
        if (strM17307a != null) {
            return strM17307a;
        }
        String string = this.applicationContext.getString(C12244g.f43262r);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    /* JADX INFO: renamed from: a0 */
    public final String m17154a0(Input.Strings strings, IdConfig.EnumC3514b enumC3514b, String str, String str2) {
        String strM17307a = strings.getChooseCaptureMethodTitle().m17307a(str2, str, enumC3514b);
        if (strM17307a != null) {
            return strM17307a;
        }
        String string = this.applicationContext.getString(C12244g.f43263s);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    /* JADX INFO: renamed from: b0 */
    public final String m17155b0(Input.Strings strings, IdConfig.EnumC3514b enumC3514b, String str, String str2) {
        String strM17307a = strings.getConfirmCaptureTitle().m17307a(str2, str, enumC3514b);
        return strM17307a == null ? "" : strM17307a;
    }

    /* JADX INFO: renamed from: b1 */
    public final void m17156b1(AbstractC13218k<? super Input, GovernmentIdState, ? extends AbstractC3503a, ? extends Object>.a context, AbstractC3503a output) {
        C3555n.m17624b0(context, output, this.videoCaptureHelper);
    }

    /* JADX INFO: renamed from: c0 */
    public final String m17157c0(Input.Strings strings, IdConfig.EnumC3514b enumC3514b) {
        String str = strings.m17258x0().get(enumC3514b);
        if (str != null) {
            return str;
        }
        String string = this.applicationContext.getString(C12244g.f43266v);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    /* JADX INFO: renamed from: c1 */
    public final void m17158c1(AbstractC13225r<? super Input, GovernmentIdState, ? extends AbstractC3503a>.c updater) {
        updater.m48902d(new AbstractC3503a.c(new InternalErrorInfo.WebRtcIntegrationErrorInfo("WebRTC is listed as the preferred or only capture method, but it has not been configured for this project.")));
    }

    /* JADX INFO: renamed from: d0 */
    public final String m17159d0(Input.Strings strings, IdConfig.EnumC3514b enumC3514b) {
        String str = strings.m17199C0().get(enumC3514b);
        if (str != null) {
            return str;
        }
        String string = this.applicationContext.getString(C12244g.f43267w);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    /* JADX DEBUG: Method merged with bridge method: g(Ljava/lang/Object;)Lym/i; */
    @Override // p581ym.AbstractC13218k
    @Nullable
    /* JADX INFO: renamed from: d1, reason: merged with bridge method [inline-methods] */
    public Snapshot mo16432g(@NotNull GovernmentIdState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (m17165g0(state)) {
            return null;
        }
        return C0388q.m1447a(state);
    }

    /* JADX INFO: renamed from: e0 */
    public final String m17161e0(GovernmentIdState governmentIdState) {
        if ((governmentIdState instanceof GovernmentIdState.CountdownToCapture) || (governmentIdState instanceof GovernmentIdState.ReviewCapturedImage) || (governmentIdState instanceof GovernmentIdState.WaitForAutocapture) || (governmentIdState instanceof GovernmentIdState.FinalizeLocalVideoCapture) || (governmentIdState instanceof GovernmentIdState.FinalizeWebRtc) || (governmentIdState instanceof GovernmentIdState.HolographicTorchDelay)) {
            return "camera_screen";
        }
        if ((governmentIdState instanceof GovernmentIdState.ChooseCaptureMethod) || (governmentIdState instanceof GovernmentIdState.ReviewSelectedImage) || (governmentIdState instanceof GovernmentIdState.ShowInstructions) || (governmentIdState instanceof GovernmentIdState.Submit) || (governmentIdState instanceof GovernmentIdState.AutoClassificationError) || (governmentIdState instanceof GovernmentIdState.AutoClassificationManualSelect) || (governmentIdState instanceof GovernmentIdState.RestartStep)) {
            return null;
        }
        throw new C7345l();
    }

    /* JADX INFO: renamed from: e1 */
    public final boolean m17162e1(GovernmentIdState governmentIdState) {
        if ((governmentIdState instanceof GovernmentIdState.CountdownToCapture) || (governmentIdState instanceof GovernmentIdState.FinalizeWebRtc) || (governmentIdState instanceof GovernmentIdState.WaitForAutocapture) || (governmentIdState instanceof GovernmentIdState.FinalizeLocalVideoCapture) || (governmentIdState instanceof GovernmentIdState.HolographicTorchDelay)) {
            return true;
        }
        if ((governmentIdState instanceof GovernmentIdState.ChooseCaptureMethod) || (governmentIdState instanceof GovernmentIdState.ReviewSelectedImage) || (governmentIdState instanceof GovernmentIdState.ShowInstructions) || (governmentIdState instanceof GovernmentIdState.Submit) || (governmentIdState instanceof GovernmentIdState.ReviewCapturedImage) || (governmentIdState instanceof GovernmentIdState.AutoClassificationError) || (governmentIdState instanceof GovernmentIdState.AutoClassificationManualSelect) || (governmentIdState instanceof GovernmentIdState.RestartStep)) {
            return false;
        }
        throw new C7345l();
    }

    /* JADX DEBUG: Method merged with bridge method: d(Ljava/lang/Object;Lym/i;)Ljava/lang/Object; */
    @Override // p581ym.AbstractC13218k
    @NotNull
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public GovernmentIdState mo16430d(@NotNull Input props, @Nullable Snapshot snapshot) {
        Intrinsics.checkNotNullParameter(props, "props");
        GovernmentIdState governmentIdState = null;
        Parcelable parcelable = null;
        if (snapshot != null) {
            C12930h c12930hM48870b = snapshot.m48870b();
            if (c12930hM48870b.m48089I() <= 0) {
                c12930hM48870b = null;
            }
            if (c12930hM48870b != null) {
                Parcel parcelObtain = Parcel.obtain();
                Intrinsics.checkNotNullExpressionValue(parcelObtain, "obtain()");
                byte[] bArrMo48094O = c12930hM48870b.mo48094O();
                parcelObtain.unmarshall(bArrMo48094O, 0, bArrMo48094O.length);
                parcelObtain.setDataPosition(0);
                Parcelable parcelable2 = parcelObtain.readParcelable(Snapshot.class.getClassLoader());
                Intrinsics.checkNotNull(parcelable2);
                Intrinsics.checkNotNullExpressionValue(parcelable2, "parcel.readParcelable<T>…class.java.classLoader)!!");
                parcelObtain.recycle();
                parcelable = parcelable2;
            }
            governmentIdState = (GovernmentIdState) parcelable;
        }
        if (governmentIdState != null) {
            return governmentIdState;
        }
        if (props.getAutoClassificationConfig().getIsEnabled() && !this.videoCaptureHelper.m44496c(props)) {
            if (props.m17190u()) {
                return new GovernmentIdState.ChooseCaptureMethod(new IdPart.SideIdPart(IdConfig.EnumC3514b.Front), C7699p.m31892k(), C7699p.m31892k(), 0, props.getCountryCode(), new CaptureConfig.AutoClassifyConfig(props.getAutoClassificationConfig()), false, null, null, 320, null);
            }
            return new GovernmentIdState.WaitForAutocapture(new IdPart.SideIdPart(IdConfig.EnumC3514b.Front), C7699p.m31892k(), new CaptureConfig.AutoClassifyConfig(props.getAutoClassificationConfig()), props.getDesignVersion() == EnumC6852d.K0000 ? Screen.C3527b.a.Hidden : Screen.C3527b.a.Enabled, C7699p.m31892k(), 0, null, EnumC11917x.Disconnected, props.getVideoCaptureConfig().getWebRtcJwt(), null, false, false, props.getCountryCode(), null, null, 28160, null);
        }
        return new GovernmentIdState.ShowInstructions(null, null, null, null, 0, props.getCountryCode(), null, null, 223, null);
    }

    /* JADX INFO: renamed from: f1 */
    public final C12530m m17164f1(Object obj, GovernmentIdState governmentIdState) {
        return new C12530m(obj, governmentIdState.getDidGoBack() ? EnumC12529l.SLIDE_OUT : EnumC12529l.SLIDE_IN);
    }

    /* JADX INFO: renamed from: g0 */
    public final boolean m17165g0(GovernmentIdState state) {
        while (state != null) {
            if ((state instanceof GovernmentIdState.AutoClassificationError) || (state instanceof GovernmentIdState.AutoClassificationManualSelect)) {
                return true;
            }
            state = state.getBackState();
        }
        return false;
    }

    /* JADX INFO: renamed from: h0 */
    public final C0384m<Object> m17166h0(Object obj, String str) {
        return new C0384m<>(obj, str);
    }

    /* JADX DEBUG: Method merged with bridge method: f(Ljava/lang/Object;Ljava/lang/Object;Lym/k$a;)Ljava/lang/Object; */
    @Override // p581ym.AbstractC13218k
    @NotNull
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public Object mo16431f(@NotNull Input renderProps, @NotNull GovernmentIdState renderState, @NotNull AbstractC13218k<? super Input, GovernmentIdState, ? extends AbstractC3503a, ? extends Object>.a context) {
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        Object objM17168j0 = m17168j0(renderProps, renderState, context);
        String strM17161e0 = m17161e0(renderState);
        if (strM17161e0 != null) {
            objM17168j0 = m17166h0(objM17168j0, strM17161e0);
        }
        if (!m17162e1(renderState)) {
            context.mo48835b("close_camera", new C3505c(null));
        }
        if (!this.videoCaptureHelper.m44499f(renderProps) && C7259g.m30271e(this.applicationContext)) {
            context.mo48835b("output_webrtc_error", new C3506d(context, this, null));
        }
        return m17164f1(objM17168j0, renderState);
    }

    /* JADX WARN: Code duplicated, block: B:76:0x025e  */
    /* JADX INFO: renamed from: j0 */
    public final Object m17168j0(final Input renderProps, final GovernmentIdState renderState, final AbstractC13218k<? super Input, GovernmentIdState, ? extends AbstractC3503a, ? extends Object>.a context) {
        InterfaceC10314h takePhoto;
        RemoteImage idFrontPictograph;
        RemoteImage remoteImage;
        int i10;
        InterfaceC6567c<? extends GovernmentIdState> interfaceC6567cM32002b = C7731d0.m32002b(renderState.getClass());
        final InterfaceC13215h<? super AbstractC3503a> interfaceC13215h = new InterfaceC13215h() { // from class: io.w
            @Override // p581ym.InterfaceC13215h
            /* JADX INFO: renamed from: a */
            public final void mo17905a(Object obj) {
                GovernmentIdWorkflow.m17144v0(context, this, (GovernmentIdWorkflow.AbstractC3503a) obj);
            }
        };
        C11930a.m44527d(this.navigationStateManager, renderProps.getBackStepEnabled(), renderProps.getCancelButtonEnabled(), renderProps.getIsEnabled() && !(renderState instanceof GovernmentIdState.Submit), false, 8, null);
        boolean z10 = renderState instanceof GovernmentIdState.AutoClassificationError;
        if (z10) {
            takePhoto = InterfaceC10314h.a.f37118a;
        } else if (renderState instanceof GovernmentIdState.AutoClassificationManualSelect) {
            takePhoto = InterfaceC10314h.b.f37119a;
        } else if (renderState instanceof GovernmentIdState.ShowInstructions) {
            takePhoto = InterfaceC10314h.h.f37125a;
        } else if (renderState instanceof GovernmentIdState.ChooseCaptureMethod) {
            takePhoto = new InterfaceC10314h.Prompt(((GovernmentIdState.ChooseCaptureMethod) renderState).getPartIndex());
        } else if ((renderState instanceof GovernmentIdState.WaitForAutocapture) || (renderState instanceof GovernmentIdState.CountdownToCapture) || (renderState instanceof GovernmentIdState.FinalizeLocalVideoCapture) || (renderState instanceof GovernmentIdState.FinalizeWebRtc) || (renderState instanceof GovernmentIdState.HolographicTorchDelay)) {
            takePhoto = new InterfaceC10314h.TakePhoto(renderState.getPartIndex());
        } else if (renderState instanceof GovernmentIdState.ReviewCapturedImage) {
            takePhoto = new InterfaceC10314h.Check(((GovernmentIdState.ReviewCapturedImage) renderState).getPartIndex());
        } else if (renderState instanceof GovernmentIdState.ReviewSelectedImage) {
            takePhoto = new InterfaceC10314h.CheckUpload(((GovernmentIdState.ReviewSelectedImage) renderState).getPartIndex());
        } else if (renderState instanceof GovernmentIdState.Submit) {
            takePhoto = InterfaceC10314h.e.f37122a;
        } else {
            if (!(renderState instanceof GovernmentIdState.RestartStep)) {
                throw new C7345l();
            }
            takePhoto = InterfaceC10314h.g.f37124a;
        }
        this.externalEventLogger.m39607c(new AbstractC10315i.c(renderProps.getFromStep(), takePhoto));
        if (!Intrinsics.m31980c(this.previousStateClass, interfaceC6567cM32002b)) {
            TrackingEventsLogger.logInquiryPageViewEvent$default(this.trackingEventsLogger, renderProps.getFromStep(), takePhoto.toString(), false, 4, null);
            if (Intrinsics.m31980c(interfaceC6567cM32002b, C7731d0.m32002b(GovernmentIdState.WaitForAutocapture.class))) {
                TrackingEventsLogger trackingEventsLogger = this.trackingEventsLogger;
                GovIdCaptureState govIdCaptureState = GovIdCaptureState.LOADING;
                IdConfig.EnumC3514b enumC3514bM17611Q = C3555n.m17611Q(renderState.getCurrentPart());
                TrackingEventsLogger.logGovernmentIdStateEvent$default(trackingEventsLogger, new GovernmentIdStateEventData(govIdCaptureState, null, enumC3514bM17611Q != null ? C3555n.m17628d0(enumC3514bM17611Q) : null, null, 8, null), false, 2, null);
            }
            this.previousStateClass = interfaceC6567cM32002b;
        }
        if (renderState instanceof GovernmentIdState.ShowInstructions) {
            context.mo48835b("check_if_single_id_class", new C3507e(renderProps, renderState, this, context, null));
            String title = renderProps.getStrings().getTitle();
            String prompt = renderProps.getStrings().getPrompt();
            String choose = renderProps.getStrings().getChoose();
            String instructionsDisclaimer = renderProps.getStrings().getInstructionsDisclaimer();
            List<EnabledIdClass> listM17608N = C3555n.m17608N(renderProps);
            C3509g c3509g = new C3509g(renderState, this, context, renderProps);
            NextStep.GovernmentId.AssetConfig.SelectPage selectPage = renderProps.getAssetConfig().getSelectPage();
            StepStyles.GovernmentIdStepStyle styles = renderProps.getStyles();
            return new Screen.C3530e(title, prompt, choose, instructionsDisclaimer, listM17608N, this.navigationStateManager.m44528b(), c3509g, styles, selectPage, renderProps.getIsEnabled(), new Function0() { // from class: io.y
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GovernmentIdWorkflow.m17093N0(context, this);
                }
            }, new Function0() { // from class: io.b0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GovernmentIdWorkflow.m17107U0(context);
                }
            }, ((GovernmentIdState.ShowInstructions) renderState).getError(), new Function0() { // from class: io.c0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GovernmentIdWorkflow.m17109V0(context, this, renderState);
                }
            }, this.themeManager.m20413a().getIconStyle(), renderProps.getStrings().getSelectPageNavBarTitle(), null, 65536, null);
        }
        if (renderState instanceof GovernmentIdState.ChooseCaptureMethod) {
            GovernmentIdState.ChooseCaptureMethod chooseCaptureMethod = (GovernmentIdState.ChooseCaptureMethod) renderState;
            final IdPart.SideIdPart currentPart = chooseCaptureMethod.getCurrentPart();
            if (chooseCaptureMethod.getChoosingDocumentToUpload()) {
                C13230w.m48937l(context, this.documentSelectWorker, C7731d0.m32011k(C3544e.class), "", new Function1() { // from class: io.d0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return GovernmentIdWorkflow.m17122k0(this.f26896a, currentPart, renderState, context, (C3544e.a) obj);
                    }
                });
            }
            NextStep.GovernmentId.AssetConfig.PromptPage promptPage = renderProps.getAssetConfig().getPromptPage();
            List<CaptureOptionNativeMobile> listM17183n = renderProps.m17183n();
            String strM17154a0 = m17154a0(renderProps.getStrings(), currentPart.getSide(), C3540c.m17508b(chooseCaptureMethod.getCaptureConfig()), chooseCaptureMethod.getCountryCode());
            String strM17153Z = m17153Z(renderProps.getStrings(), currentPart.getSide(), C3540c.m17508b(chooseCaptureMethod.getCaptureConfig()), chooseCaptureMethod.getCountryCode());
            String chooseCaptureMethodCameraButton = renderProps.getStrings().getChooseCaptureMethodCameraButton();
            String chooseCaptureMethodUploadButton = renderProps.getStrings().getChooseCaptureMethodUploadButton();
            NavigationState navigationStateM44528b = this.navigationStateManager.m44528b();
            Function0 function0 = new Function0() { // from class: io.e0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GovernmentIdWorkflow.m17128n0(context, this, renderState, renderProps);
                }
            };
            Function0 function1 = new Function0() { // from class: io.f0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GovernmentIdWorkflow.m17136r0(context, this, renderState);
                }
            };
            Function0 function2 = new Function0() { // from class: io.g0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GovernmentIdWorkflow.m17140t0(context, this);
                }
            };
            Function0 function3 = new Function0() { // from class: io.i0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GovernmentIdWorkflow.m17142u0(context);
                }
            };
            String error = chooseCaptureMethod.getError();
            Function0 function4 = new Function0() { // from class: io.j0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GovernmentIdWorkflow.m17148x0(context, this, renderState);
                }
            };
            StepStyles.GovernmentIdStepStyle styles2 = renderProps.getStyles();
            IdConfig.EnumC3514b side = chooseCaptureMethod.getCurrentPart().getSide();
            int[] iArr = C3504b.f13794a;
            int i11 = iArr[side.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 != 5) {
                                throw new C7345l();
                            }
                            if (promptPage != null) {
                                idFrontPictograph = promptPage.getPassportSignaturePictograph();
                                remoteImage = idFrontPictograph;
                            }
                        } else if (promptPage != null) {
                            idFrontPictograph = promptPage.getBarcodePdf417Pictograph();
                            remoteImage = idFrontPictograph;
                        }
                    }
                    remoteImage = null;
                } else if (promptPage != null) {
                    idFrontPictograph = promptPage.getIdBackPictograph();
                    remoteImage = idFrontPictograph;
                } else {
                    remoteImage = null;
                }
            } else if (C3540c.m17507a(chooseCaptureMethod.getCaptureConfig()) == EnumC10302b.Passport) {
                if (promptPage != null) {
                    idFrontPictograph = promptPage.getPassportFrontPictograph();
                    remoteImage = idFrontPictograph;
                } else {
                    remoteImage = null;
                }
            } else if (promptPage != null) {
                idFrontPictograph = promptPage.getIdFrontPictograph();
                remoteImage = idFrontPictograph;
            } else {
                remoteImage = null;
            }
            int i12 = iArr[chooseCaptureMethod.getCurrentPart().getSide().ordinal()];
            if (i12 != 1) {
                i10 = (i12 == 2 || i12 == 4) ? C6903p2.f27129d : C6903p2.f27130e;
            } else {
                i10 = C3540c.m17507a(chooseCaptureMethod.getCaptureConfig()) == EnumC10302b.Passport ? C6903p2.f27131f : C6903p2.f27130e;
            }
            int i13 = i10;
            String requestPageNavBarTitle = renderProps.getStrings().getRequestPageNavBarTitle();
            if (requestPageNavBarTitle == null) {
                requestPageNavBarTitle = renderProps.getStrings().getCapturePageNavBarTitle();
            }
            return new Screen.C3528c(listM17183n, strM17154a0, strM17153Z, chooseCaptureMethodCameraButton, chooseCaptureMethodUploadButton, navigationStateM44528b, function0, function1, function2, function3, error, function4, styles2, remoteImage, i13, requestPageNavBarTitle, null, 65536, null);
        }
        if (renderState instanceof GovernmentIdState.WaitForAutocapture) {
            return this.captureRenderer.m33546n0(renderProps, (GovernmentIdState.WaitForAutocapture) renderState, context, this.videoCaptureHelper, interfaceC13215h);
        }
        if (renderState instanceof GovernmentIdState.CountdownToCapture) {
            return this.captureRenderer.m33544Y(renderProps, (GovernmentIdState.CountdownToCapture) renderState, context, this.videoCaptureHelper, interfaceC13215h);
        }
        if (renderState instanceof GovernmentIdState.ReviewCapturedImage) {
            GovernmentIdState.ReviewCapturedImage reviewCapturedImage = (GovernmentIdState.ReviewCapturedImage) renderState;
            TrackingEventsLogger.logGovernmentIdStateEvent$default(this.trackingEventsLogger, new GovernmentIdStateEventData(GovIdCaptureState.CONFIRMING, null, C3555n.m17628d0(reviewCapturedImage.getCurrentPart().getSide()), null, 8, null), false, 2, null);
            final CaptureConfig captureConfig = reviewCapturedImage.getCaptureConfig();
            IdConfig.IdSideConfig idSideConfigM17510d = C3540c.m17510d(captureConfig, reviewCapturedImage.getCurrentPart().getSide());
            Frame frame = (Frame) CollectionsKt.m31706d0(reviewCapturedImage.getIdForReview().mo16936d3());
            if (reviewCapturedImage.getSubmittingForAutoClassification()) {
                C3572p.m17740j(renderProps, (GovernmentIdState.ReviewImageState) renderState, context, this.videoCaptureHelper, this.autoClassifyWorkerFactory);
            }
            return new AlertContainerScreen(C3858g.m19165c(new Screen.C3533h(this.imageLoader, C3555n.m17607M(renderProps.getStrings(), reviewCapturedImage.getCurrentPart().getSide(), C3540c.m17508b(reviewCapturedImage.getCaptureConfig()), reviewCapturedImage.getCountryCode()), renderProps.getStrings().getCaptureDisclaimer(), idSideConfigM17510d.getOverlay(), frame.getAbsoluteFilePath(), reviewCapturedImage.getCurrentPart().getSide(), C3540c.m17507a(captureConfig), this.navigationStateManager.m44528b(), new Function0() { // from class: io.h0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GovernmentIdWorkflow.m17152z0(renderProps, renderState, context, this);
                }
            }, renderProps.getStrings().getButtonSubmit(), new Function0() { // from class: io.s0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GovernmentIdWorkflow.m17067A0(this.f27135a, context, renderState, renderProps, captureConfig);
                }
            }, renderProps.getStrings().getButtonRetake(), m17155b0(renderProps.getStrings(), reviewCapturedImage.getCurrentPart().getSide(), C3540c.m17508b(reviewCapturedImage.getCaptureConfig()), reviewCapturedImage.getCountryCode()), new Function0() { // from class: io.d1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GovernmentIdWorkflow.m17075E0(interfaceC13215h);
                }
            }, renderProps.getStyles(), reviewCapturedImage.getError(), new Function0() { // from class: io.e1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GovernmentIdWorkflow.m17077F0(context, this, renderState);
                }
            }, renderProps.getAssetConfig().getCapturePage(), renderProps.getIsEnabled() && !reviewCapturedImage.getSubmittingForAutoClassification(), reviewCapturedImage.getSubmittingForAutoClassification(), renderProps.getReviewCaptureButtonsAxis(), renderProps.getDesignVersion(), false, renderProps.getStrings().getCheckPageNavBarTitle(), null, 20971520, null)), null, 2, null);
        }
        if (!(renderState instanceof GovernmentIdState.ReviewSelectedImage)) {
            if (renderState instanceof GovernmentIdState.Submit) {
                GovernmentIdState.Submit submit = (GovernmentIdState.Submit) renderState;
                C13230w.m48937l(context, this.submitVerificationWorkerFactory.mo39594a(renderProps.getSessionToken(), renderProps.getInquiryId(), renderProps.getFromComponent(), renderProps.getFromStep(), submit.getGovernmentIdRequestArguments(), submit.getWebRtcObjectId(), submit.getCameraProperties()), C7731d0.m32011k(C10303c.class), "", new Function1() { // from class: io.x
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return GovernmentIdWorkflow.m17095O0(this.f27176a, context, (C10303c.b) obj);
                    }
                });
                C11930a.m44527d(this.navigationStateManager, false, false, false, false, 12, null);
                return new Screen.C3535j(renderProps.getStrings().getProcessingTitle(), renderProps.getStrings().getProcessingDescription(), renderProps.getStyles(), renderProps.getAssetConfig().getPendingPage(), this.navigationStateManager.m44528b(), new Function0() { // from class: io.z
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GovernmentIdWorkflow.m17103S0(this.f27183a, context);
                    }
                }, new Function0() { // from class: io.a0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GovernmentIdWorkflow.m17105T0(this.f26863a, context);
                    }
                }, renderProps.getPendingPageTextVerticalPosition(), false, renderProps.getStrings().getPendingPageNavBarTitle(), null, 1280, null);
            }
            if (renderState instanceof GovernmentIdState.FinalizeLocalVideoCapture) {
                return this.localVideoCaptureRenderer.m44488i(renderProps, (GovernmentIdState.FinalizeLocalVideoCapture) renderState, context, this.videoCaptureHelper);
            }
            if (renderState instanceof GovernmentIdState.FinalizeWebRtc) {
                return this.webRtcRenderer.m44518j(renderProps, (GovernmentIdState.FinalizeWebRtc) renderState, context, this.videoCaptureHelper);
            }
            if (renderState instanceof GovernmentIdState.HolographicTorchDelay) {
                return this.captureRenderer.m33545j0(renderProps, (GovernmentIdState.HolographicTorchDelay) renderState, context, this.videoCaptureHelper, interfaceC13215h);
            }
            if (z10) {
                return this.autoClassificationRenderer.m30179n(renderProps, (GovernmentIdState.AutoClassificationError) renderState, context, this.videoCaptureHelper);
            }
            if (renderState instanceof GovernmentIdState.AutoClassificationManualSelect) {
                return this.autoClassificationRenderer.m30180t(renderProps, (GovernmentIdState.AutoClassificationManualSelect) renderState, context, this.videoCaptureHelper);
            }
            if (!(renderState instanceof GovernmentIdState.RestartStep)) {
                throw new C7345l();
            }
            context.mo48835b("restart_step", new C3508f(context, mo16430d(renderProps, null), null));
            return new Screen.C3532g(null, 1, null);
        }
        GovernmentIdState.ReviewSelectedImage reviewSelectedImage = (GovernmentIdState.ReviewSelectedImage) renderState;
        TrackingEventsLogger.logGovernmentIdStateEvent$default(this.trackingEventsLogger, new GovernmentIdStateEventData(GovIdCaptureState.CONFIRMING, null, C3555n.m17628d0(reviewSelectedImage.getCurrentPart().getSide()), null, 8, null), false, 2, null);
        IdPart.SideIdPart currentPart2 = reviewSelectedImage.getCurrentPart();
        if (reviewSelectedImage.getSubmittingForAutoClassification()) {
            C3572p.m17740j(renderProps, (GovernmentIdState.ReviewImageState) renderState, context, this.videoCaptureHelper, this.autoClassifyWorkerFactory);
        }
        InterfaceC7479s interfaceC7479s = this.imageLoader;
        String strM17159d0 = m17159d0(renderProps.getStrings(), currentPart2.getSide());
        String strM17157c0 = m17157c0(renderProps.getStrings(), currentPart2.getSide());
        String reviewSelectedImageConfirmButton = renderProps.getStrings().getReviewSelectedImageConfirmButton();
        String reviewSelectedImageChooseAnotherButton = renderProps.getStrings().getReviewSelectedImageChooseAnotherButton();
        String absoluteFilePath = ((Frame) CollectionsKt.m31706d0(reviewSelectedImage.getIdForReview().mo16936d3())).getAbsoluteFilePath();
        String mimeType = ((Frame) CollectionsKt.m31706d0(reviewSelectedImage.getIdForReview().mo16936d3())).getMimeType();
        String fileName = reviewSelectedImage.getFileName();
        NavigationState navigationStateM44528b2 = this.navigationStateManager.m44528b();
        String error2 = reviewSelectedImage.getError();
        boolean submittingForAutoClassification = reviewSelectedImage.getSubmittingForAutoClassification();
        StepStyles.GovernmentIdStepStyle styles3 = renderProps.getStyles();
        String reviewUploadPageNavBarTitle = renderProps.getStrings().getReviewUploadPageNavBarTitle();
        if (reviewUploadPageNavBarTitle == null) {
            reviewUploadPageNavBarTitle = renderProps.getStrings().getCapturePageNavBarTitle();
        }
        return new Screen.C3534i(interfaceC7479s, strM17159d0, strM17157c0, reviewSelectedImageConfirmButton, reviewSelectedImageChooseAnotherButton, absoluteFilePath, mimeType, fileName, navigationStateM44528b2, new Function0() { // from class: io.f1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GovernmentIdWorkflow.m17081H0(renderProps, renderState, context, this);
            }
        }, new Function0() { // from class: io.g1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GovernmentIdWorkflow.m17083I0(context, this);
            }
        }, new Function0() { // from class: io.h1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GovernmentIdWorkflow.m17085J0(context, this);
            }
        }, new Function0() { // from class: io.i1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GovernmentIdWorkflow.m17087K0(context);
            }
        }, error2, new Function0() { // from class: io.j1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GovernmentIdWorkflow.m17089L0(context, this, renderState);
            }
        }, styles3, submittingForAutoClassification, reviewUploadPageNavBarTitle, null, 262144, null);
    }
}
