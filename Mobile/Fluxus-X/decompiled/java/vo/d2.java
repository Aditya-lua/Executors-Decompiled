package vo;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker;
import com.withpersona.sdk2.inquiry.governmentid.video_capture.VideoCaptureConfig;
import com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition;
import com.withpersona.sdk2.inquiry.network.dto.government_id.CaptureOptionNativeMobile;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.GovIdCaptureButtonType;
import com.withpersona.sdk2.inquiry.tracking.model.GovIdCaptureState;
import com.withpersona.sdk2.inquiry.tracking.model.GovernmentIdButtonEventData;
import com.withpersona.sdk2.inquiry.tracking.model.GovernmentIdStateEventData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ln.Snapshot;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.collections.CollectionsKt;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import rn.AlertContainerScreen;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u00020\u0005:\u0002VXBy\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#JC\u0010(\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00032\"\u0010'\u001a\u001e0&R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b(\u0010)J;\u0010,\u001a\u00020+2\"\u0010'\u001a\u001e0&R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u0006\u0010*\u001a\u00020\u0004H\u0002¢\u0006\u0004\b,\u0010-J-\u00101\u001a\u00020+2\u001c\u00100\u001a\u00180.R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040/H\u0002¢\u0006\u0004\b1\u00102J\u001b\u00104\u001a\u000203*\u00020\u00052\u0006\u0010%\u001a\u00020\u0003H\u0002¢\u0006\u0004\b4\u00105J!\u00109\u001a\b\u0012\u0004\u0012\u00020\u000508*\u00020\u00052\u0006\u00107\u001a\u000206H\u0002¢\u0006\u0004\b9\u0010:J\u0013\u0010<\u001a\u00020;*\u00020\u0003H\u0002¢\u0006\u0004\b<\u0010=J\u0015\u0010>\u001a\u0004\u0018\u000106*\u00020\u0003H\u0002¢\u0006\u0004\b>\u0010?J-\u0010E\u001a\u000206*\u00020@2\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u0002062\b\u0010D\u001a\u0004\u0018\u000106H\u0002¢\u0006\u0004\bE\u0010FJ-\u0010G\u001a\u000206*\u00020@2\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u0002062\b\u0010D\u001a\u0004\u0018\u000106H\u0002¢\u0006\u0004\bG\u0010FJ-\u0010H\u001a\u000206*\u00020@2\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u0002062\b\u0010D\u001a\u0004\u0018\u000106H\u0002¢\u0006\u0004\bH\u0010FJ\u001b\u0010I\u001a\u000206*\u00020@2\u0006\u0010B\u001a\u00020AH\u0002¢\u0006\u0004\bI\u0010JJ\u001b\u0010K\u001a\u000206*\u00020@2\u0006\u0010B\u001a\u00020AH\u0002¢\u0006\u0004\bK\u0010JJ\u0017\u0010M\u001a\u00020;2\u0006\u0010L\u001a\u00020\u0003H\u0002¢\u0006\u0004\bM\u0010=J!\u0010Q\u001a\u00020\u00032\u0006\u0010N\u001a\u00020\u00022\b\u0010P\u001a\u0004\u0018\u00010OH\u0016¢\u0006\u0004\bQ\u0010RJC\u0010S\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00032\"\u0010'\u001a\u001e0&R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0016¢\u0006\u0004\bS\u0010)J\u0019\u0010T\u001a\u0004\u0018\u00010O2\u0006\u0010L\u001a\u00020\u0003H\u0016¢\u0006\u0004\bT\u0010UR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\u0014\u0010u\u001a\u00020r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010tR \u0010y\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010v8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010x¨\u0006z"}, d2 = {"Lvo/d2;", "Lln/k;", "Lvo/d2$a;", "Lvo/j0;", "Lvo/d2$b;", BuildConfig.FLAVOR, "Landroid/content/Context;", "applicationContext", "Ll6/s;", "imageLoader", "Ldp/f$a;", "submitVerificationWorkerFactory", "Lvo/j;", "documentSelectWorker", "Lip/j;", "localVideoCaptureRenderer", "Lip/v;", "webRtcRenderer", "Lyo/t0;", "captureRenderer", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;", "autoClassifyWorkerFactory", "Lwo/o;", "autoClassificationRenderer", "Lyn/a;", "cameraStatsManager", "Lir/b;", "navigationStateManager", "Ldr/c;", "externalEventLogger", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "Lgr/b;", "themeManager", "<init>", "(Landroid/content/Context;Ll6/s;Ldp/f$a;Lvo/j;Lip/j;Lip/v;Lyo/t0;Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;Lwo/o;Lyn/a;Lir/b;Ldr/c;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lgr/b;)V", "renderProps", "renderState", "Lln/k$a;", "context", "j0", "(Lvo/d2$a;Lvo/j0;Lln/k$a;)Ljava/lang/Object;", "output", BuildConfig.FLAVOR, "b1", "(Lln/k$a;Lvo/d2$b;)V", "Lln/r$c;", "Lln/r;", "updater", "c1", "(Lln/r$c;)V", "Lkr/m;", "f1", "(Ljava/lang/Object;Lvo/j0;)Lkr/m;", BuildConfig.FLAVOR, "name", "Lnn/m;", "h0", "(Ljava/lang/Object;Ljava/lang/String;)Lnn/m;", BuildConfig.FLAVOR, "e1", "(Lvo/j0;)Z", "e0", "(Lvo/j0;)Ljava/lang/String;", "Lvo/d2$a$b;", "Lvo/d3$e;", "side", "selectedId", "countryCode", "a0", "(Lvo/d2$a$b;Lvo/d3$e;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Z", "b0", "d0", "(Lvo/d2$a$b;Lvo/d3$e;)Ljava/lang/String;", "c0", "state", "g0", "props", "Lln/i;", "snapshot", "f0", "(Lvo/d2$a;Lln/i;)Lvo/j0;", "i0", "d1", "(Lvo/j0;)Lln/i;", "a", "Landroid/content/Context;", "b", "Ll6/s;", "c", "Ldp/f$a;", "d", "Lvo/j;", "e", "Lip/j;", "f", "Lip/v;", "g", "Lyo/t0;", "h", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;", "i", "Lwo/o;", "j", "Lyn/a;", "k", "Lir/b;", "l", "Ldr/c;", "m", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "n", "Lgr/b;", "Lip/l;", "o", "Lip/l;", "videoCaptureHelper", "Lxu/c;", "p", "Lxu/c;", "previousStateClass", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d2 extends ln.k<a, j0, b, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context applicationContext;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final l6.s imageLoader;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final dp.f.a submitVerificationWorkerFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final j documentSelectWorker;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ip.j localVideoCaptureRenderer;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ip.v webRtcRenderer;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final yo.t0 captureRenderer;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AutoClassifyWorker.b autoClassifyWorkerFactory;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final wo.o autoClassificationRenderer;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final yn.a cameraStatsManager;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ir.b navigationStateManager;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final dr.c externalEventLogger;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final gr.b themeManager;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ip.l videoCaptureHelper;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public xu.c<? extends j0> previousStateClass;

    @Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\bF\b\u0007\u0018\u00002\u00020\u0001:\u0001>B\u008f\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001a\u001a\u00020\u000b\u0012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010 \u001a\u00020\u000b\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020%\u0012\b\u0010(\u001a\u0004\u0018\u00010'\u0012\u0006\u0010)\u001a\u00020\u000b\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010,\u001a\u00020+\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.¢\u0006\u0004\b0\u00101J\r\u00102\u001a\u00020\u0014¢\u0006\u0004\b2\u00103J\u001d\u00108\u001a\u0002072\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u00020\u0014¢\u0006\u0004\b8\u00109R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b>\u0010;\u001a\u0004\b?\u0010=R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bD\u0010;\u001a\u0004\bE\u0010=R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bF\u0010;\u001a\u0004\bG\u0010=R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bH\u0010;\u001a\u0004\bI\u0010=R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bJ\u0010LR\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bM\u0010K\u001a\u0004\bN\u0010LR\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00058\u0006¢\u0006\f\n\u0004\bN\u0010A\u001a\u0004\bO\u0010CR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b?\u0010P\u001a\u0004\bQ\u0010RR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u00103R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bZ\u0010;\u001a\u0004\b[\u0010=R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bO\u0010;\u001a\u0004\b\\\u0010=R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\bB\u0010]\u001a\u0004\b^\u0010_R\u0017\u0010\u001a\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b[\u0010K\u001a\u0004\b`\u0010LR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\\\u0010a\u001a\u0004\bb\u0010cR\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u0010gR\u0017\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\bI\u0010h\u001a\u0004\b:\u0010iR\u0017\u0010 \u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bG\u0010K\u001a\u0004\b \u0010LR\u0017\u0010\"\u001a\u00020!8\u0006¢\u0006\f\n\u0004\bj\u0010k\u001a\u0004\bH\u0010lR\u0017\u0010$\u001a\u00020#8\u0006¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bo\u0010pR\u0017\u0010&\u001a\u00020%8\u0006¢\u0006\f\n\u0004\bY\u0010q\u001a\u0004\br\u0010sR\u0019\u0010(\u001a\u0004\u0018\u00010'8\u0006¢\u0006\f\n\u0004\bE\u0010t\u001a\u0004\bu\u0010vR\u0017\u0010)\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b^\u0010K\u001a\u0004\bw\u0010LR\u0019\u0010*\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\br\u0010a\u001a\u0004\bm\u0010cR\u0017\u0010,\u001a\u00020+8\u0006¢\u0006\f\n\u0004\b<\u0010x\u001a\u0004\bW\u0010yR\u0019\u0010-\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bo\u0010;\u001a\u0004\bd\u0010=R\u0019\u0010/\u001a\u0004\u0018\u00010.8\u0006¢\u0006\f\n\u0004\b`\u0010z\u001a\u0004\bS\u0010{R\u0011\u0010|\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bj\u0010L¨\u0006}"}, d2 = {"Lvo/d2$a;", "Landroid/os/Parcelable;", BuildConfig.FLAVOR, "sessionToken", "countryCode", BuildConfig.FLAVOR, "Lvo/d3;", "enabledIdClasses", "inquiryId", "fromStep", "fromComponent", BuildConfig.FLAVOR, "backStepEnabled", "cancelButtonEnabled", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CaptureOptionNativeMobile;", "enabledCaptureOptionsNativeMobile", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "Lvo/d2$a$b;", "strings", BuildConfig.FLAVOR, "imageCaptureCount", "fieldKeyDocument", "fieldKeyIdClass", BuildConfig.FLAVOR, "manualCaptureButtonDelayMs", "shouldSkipReviewScreen", "theme", "Lcom/withpersona/sdk2/inquiry/governmentid/video_capture/VideoCaptureConfig;", "videoCaptureConfig", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig;", "assetConfig", "isEnabled", "Lwo/a;", "autoClassificationConfig", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;", "reviewCaptureButtonsAxis", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "pendingPageTextVerticalPosition", "Lbp/a;", "digitalIdConfig", "staticCaptureTipsEnabled", "holographicTorchEnabledDurationMs", "Lvo/i;", "designVersion", "flowWatermarkText", "Lor/b;", "customPendingPage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Lvo/d2$a$b;ILjava/lang/String;Ljava/lang/String;JZLjava/lang/Integer;Lcom/withpersona/sdk2/inquiry/governmentid/video_capture/VideoCaptureConfig;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig;ZLwo/a;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;Lbp/a;ZLjava/lang/Integer;Lvo/i;Ljava/lang/String;Lor/b;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "A", "()Ljava/lang/String;", "b", "j", "c", "Ljava/util/List;", "o", "()Ljava/util/List;", "d", "x", "e", "t", "f", "s", "g", "Z", "()Z", "h", "i", "n", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "G", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "k", "Lvo/d2$a$b;", "F", "()Lvo/d2$a$b;", "l", "I", "w", "m", "p", "q", "J", "y", "()J", "C", "Ljava/lang/Integer;", "getTheme", "()Ljava/lang/Integer;", "r", "Lcom/withpersona/sdk2/inquiry/governmentid/video_capture/VideoCaptureConfig;", "H", "()Lcom/withpersona/sdk2/inquiry/governmentid/video_capture/VideoCaptureConfig;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig;", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig;", "u", "Lwo/a;", "()Lwo/a;", "v", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;", "B", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "z", "()Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "Lbp/a;", "getDigitalIdConfig", "()Lbp/a;", "D", "Lvo/i;", "()Lvo/i;", "Lor/b;", "()Lor/b;", "hasMultipleCaptureOptions", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<a> CREATOR = new C0706a();

        /* JADX INFO: renamed from: A, reason: from kotlin metadata */
        @NotNull
        public final i designVersion;

        /* JADX INFO: renamed from: B, reason: from kotlin metadata */
        @Nullable
        public final String flowWatermarkText;

        /* JADX INFO: renamed from: C, reason: from kotlin metadata */
        @Nullable
        public final or.b customPendingPage;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String sessionToken;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public final String countryCode;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<IdConfig> enabledIdClasses;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String inquiryId;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String fromStep;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String fromComponent;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        public final boolean backStepEnabled;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        public final boolean cancelButtonEnabled;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<CaptureOptionNativeMobile> enabledCaptureOptionsNativeMobile;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final StepStyles.GovernmentIdStepStyle styles;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Strings strings;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        public final int imageCaptureCount;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String fieldKeyDocument;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String fieldKeyIdClass;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        public final long manualCaptureButtonDelayMs;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
        public final boolean shouldSkipReviewScreen;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final Integer theme;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final VideoCaptureConfig videoCaptureConfig;

        /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final NextStep.GovernmentId.AssetConfig assetConfig;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        public final boolean isEnabled;

        /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final wo.a autoClassificationConfig;

        /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final StyleElements.Axis reviewCaptureButtonsAxis;

        /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final PendingPageTextPosition pendingPageTextVerticalPosition;

        /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final bp.a digitalIdConfig;

        /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
        public final boolean staticCaptureTipsEnabled;

        /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final Integer holographicTorchEnabledDurationMs;

        /* JADX INFO: renamed from: vo.d2$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0706a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
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
                return new a(string, string2, arrayList, string3, string4, string5, z10, z11, arrayList2, (StepStyles.GovernmentIdStepStyle) parcel.readParcelable(a.class.getClassLoader()), Strings.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt() != 0 ? z10 : false, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), VideoCaptureConfig.CREATOR.createFromParcel(parcel), (NextStep.GovernmentId.AssetConfig) parcel.readParcelable(r19.getClassLoader()), parcel.readInt() != 0, wo.a.CREATOR.createFromParcel(parcel), StyleElements.Axis.valueOf(parcel.readString()), PendingPageTextPosition.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : bp.a.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, i.valueOf(parcel.readString()), parcel.readString(), (or.b) parcel.readParcelable(a.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i10) {
                return new a[i10];
            }
        }

        /* JADX INFO: renamed from: vo.d2$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b_\b\u0087\b\u0018\u00002\u00020\u0001B\u0095\u0005\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u000e\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u001a\u0012\u0006\u0010\u001c\u001a\u00020\u000e\u0012\u0006\u0010\u001d\u001a\u00020\u000e\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u0002\u0012\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00020\u001a\u0012\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00020\u001a\u0012\u0006\u0010#\u001a\u00020\u0002\u0012\u0006\u0010$\u001a\u00020\u0002\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0002\u0012\b\u00100\u001a\u0004\u0018\u00010\u0002\u0012\b\u00101\u001a\u0004\u0018\u00010\u0002\u0012\b\u00102\u001a\u0004\u0018\u00010\u0002\u0012\b\u00103\u001a\u0004\u0018\u00010\u0002\u0012\b\u00104\u001a\u0004\u0018\u00010\u0002\u0012\b\u00105\u001a\u0004\u0018\u00010\u0002\u0012\b\u00106\u001a\u0004\u0018\u00010\u0002\u0012\b\u00107\u001a\u0004\u0018\u00010\u0002\u0012\b\u00108\u001a\u0004\u0018\u00010\u0002\u0012\b\u00109\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010:\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010;\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010<\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010=\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010>\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010?\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010@\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010A\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010B\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010C\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010D\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010E\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010F\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010I\u001a\n\u0012\u0004\u0012\u00020H\u0018\u00010G¢\u0006\u0004\bJ\u0010KJ\r\u0010M\u001a\u00020L¢\u0006\u0004\bM\u0010NJ\u001d\u0010S\u001a\u00020R2\u0006\u0010P\u001a\u00020O2\u0006\u0010Q\u001a\u00020L¢\u0006\u0004\bS\u0010TJ\u0010\u0010U\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bU\u0010VJ\u0010\u0010W\u001a\u00020LHÖ\u0001¢\u0006\u0004\bW\u0010NJ\u001a\u0010[\u001a\u00020Z2\b\u0010Y\u001a\u0004\u0018\u00010XHÖ\u0003¢\u0006\u0004\b[\u0010\\R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010VR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b`\u0010^\u001a\u0004\ba\u0010VR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bb\u0010^\u001a\u0004\bc\u0010VR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bd\u0010^\u001a\u0004\be\u0010VR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bf\u0010^\u001a\u0004\bg\u0010VR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bh\u0010^\u001a\u0004\bi\u0010VR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bj\u0010^\u001a\u0004\bk\u0010VR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bl\u0010^\u001a\u0004\bm\u0010VR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bn\u0010^\u001a\u0004\bo\u0010VR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bp\u0010^\u001a\u0004\bq\u0010VR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\br\u0010^\u001a\u0004\bh\u0010VR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bs\u0010t\u001a\u0004\bu\u0010vR\u0017\u0010\u0010\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bw\u0010t\u001a\u0004\bx\u0010vR\u0017\u0010\u0011\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\by\u0010t\u001a\u0004\bz\u0010vR\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b{\u0010^\u001a\u0004\b|\u0010VR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b}\u0010t\u001a\u0004\b~\u0010vR\u0018\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\r\n\u0004\b\u007f\u0010^\u001a\u0005\b\u0080\u0001\u0010VR\u0018\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\r\n\u0005\b\u0081\u0001\u0010^\u001a\u0004\by\u0010VR\u0018\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\r\n\u0005\b\u0080\u0001\u0010^\u001a\u0004\bs\u0010VR\u0018\u0010\u0017\u001a\u00020\u000e8\u0006¢\u0006\r\n\u0004\bi\u0010t\u001a\u0005\b\u0082\u0001\u0010vR\u0018\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\r\n\u0004\bx\u0010^\u001a\u0005\b\u0083\u0001\u0010VR\u0018\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\r\n\u0004\bu\u0010^\u001a\u0005\b\u0084\u0001\u0010VR&\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u001a8\u0006¢\u0006\u000f\n\u0005\b|\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0018\u0010\u001c\u001a\u00020\u000e8\u0006¢\u0006\r\n\u0004\bk\u0010t\u001a\u0005\b\u0088\u0001\u0010vR\u0018\u0010\u001d\u001a\u00020\u000e8\u0006¢\u0006\r\n\u0004\bc\u0010t\u001a\u0005\b\u0089\u0001\u0010vR\u0019\u0010\u001e\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0089\u0001\u0010^\u001a\u0005\b\u008a\u0001\u0010VR\u0019\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u008b\u0001\u0010^\u001a\u0005\b\u008c\u0001\u0010VR'\u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00020\u001a8\u0006¢\u0006\u0010\n\u0006\b\u008a\u0001\u0010\u0085\u0001\u001a\u0006\b\u008d\u0001\u0010\u0087\u0001R'\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00020\u001a8\u0006¢\u0006\u0010\n\u0006\b\u0088\u0001\u0010\u0085\u0001\u001a\u0006\b\u008e\u0001\u0010\u0087\u0001R\u0019\u0010#\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u008c\u0001\u0010^\u001a\u0005\b\u008f\u0001\u0010VR\u0019\u0010$\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0090\u0001\u0010^\u001a\u0005\b\u0091\u0001\u0010VR\u001a\u0010%\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b~\u0010^\u001a\u0005\b\u0081\u0001\u0010VR\u001a\u0010&\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0005\b\u0082\u0001\u0010^\u001a\u0004\b\u007f\u0010VR\u001a\u0010'\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0005\b\u0092\u0001\u0010^\u001a\u0004\b{\u0010VR\u001a\u0010(\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0005\b\u0093\u0001\u0010^\u001a\u0004\b}\u0010VR\u001b\u0010)\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u0094\u0001\u0010^\u001a\u0005\b\u0095\u0001\u0010VR\u001b\u0010*\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u0096\u0001\u0010^\u001a\u0005\b\u0097\u0001\u0010VR\u001b\u0010+\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u0098\u0001\u0010^\u001a\u0005\b\u0099\u0001\u0010VR\u001b\u0010,\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u009a\u0001\u0010^\u001a\u0005\b\u009b\u0001\u0010VR\u001b\u0010-\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u009c\u0001\u0010^\u001a\u0005\b\u0098\u0001\u0010VR\u001b\u0010.\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u009d\u0001\u0010^\u001a\u0005\b\u009a\u0001\u0010VR\u001b\u0010/\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u009e\u0001\u0010^\u001a\u0005\b\u0094\u0001\u0010VR\u001a\u00100\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0005\b\u009f\u0001\u0010^\u001a\u0004\br\u0010VR\u001a\u00101\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0005\b \u0001\u0010^\u001a\u0004\bp\u0010VR\u001a\u00102\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0005\b¡\u0001\u0010^\u001a\u0004\bn\u0010VR\u001a\u00103\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0005\b¢\u0001\u0010^\u001a\u0004\bj\u0010VR\u001b\u00104\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b£\u0001\u0010^\u001a\u0005\b¤\u0001\u0010VR\u001b\u00105\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u0086\u0001\u0010^\u001a\u0005\b¥\u0001\u0010VR\u001b\u00106\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b¦\u0001\u0010^\u001a\u0005\b§\u0001\u0010VR\u001b\u00107\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b§\u0001\u0010^\u001a\u0005\b¦\u0001\u0010VR\u001b\u00108\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b¥\u0001\u0010^\u001a\u0005\b \u0001\u0010VR\u001b\u00109\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b¤\u0001\u0010^\u001a\u0005\b\u009e\u0001\u0010VR\u001a\u0010:\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\be\u0010^\u001a\u0005\b\u009d\u0001\u0010VR\u001b\u0010;\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b¨\u0001\u0010^\u001a\u0005\b\u009c\u0001\u0010VR\u001b\u0010<\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b©\u0001\u0010^\u001a\u0005\bª\u0001\u0010VR\u001b\u0010=\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b«\u0001\u0010^\u001a\u0005\b¬\u0001\u0010VR\u001b\u0010>\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u00ad\u0001\u0010^\u001a\u0005\b®\u0001\u0010VR\u001b\u0010?\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b¯\u0001\u0010^\u001a\u0005\b°\u0001\u0010VR\u001b\u0010@\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b±\u0001\u0010^\u001a\u0005\b£\u0001\u0010VR\u001b\u0010A\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b²\u0001\u0010^\u001a\u0005\b¢\u0001\u0010VR\u001b\u0010B\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b³\u0001\u0010^\u001a\u0005\b\u0092\u0001\u0010VR\u001b\u0010C\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b´\u0001\u0010^\u001a\u0005\b¡\u0001\u0010VR\u001b\u0010D\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\bµ\u0001\u0010^\u001a\u0005\b´\u0001\u0010VR\u001b\u0010E\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u0099\u0001\u0010^\u001a\u0005\b±\u0001\u0010VR\u001a\u0010F\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0005\b\u009b\u0001\u0010^\u001a\u0004\b]\u0010VR#\u0010I\u001a\n\u0012\u0004\u0012\u00020H\u0018\u00010G8\u0006¢\u0006\u0010\n\u0006\b¶\u0001\u0010·\u0001\u001a\u0006\b¯\u0001\u0010¸\u0001¨\u0006¹\u0001"}, d2 = {"Lvo/d2$a$b;", "Landroid/os/Parcelable;", BuildConfig.FLAVOR, Title.type, "prompt", "choose", "instructionsDisclaimer", "selectPageNavBarTitle", "capturePageNavBarTitle", "checkPageNavBarTitle", "pendingPageNavBarTitle", "requestPageNavBarTitle", "reviewUploadPageNavBarTitle", "autoClassificationPageNavBarTitle", "Lvo/k3;", "captureScreenTitle", "captureScreenDescription", "scanInstructions", "capturing", "confirmCapture", "captureDisclaimer", "buttonSubmit", "buttonRetake", "confirmCaptureTitle", "processingTitle", "processingDescription", BuildConfig.FLAVOR, "idClassToName", "chooseCaptureMethodTitle", "chooseCaptureMethodBody", "chooseCaptureMethodCameraButton", "chooseCaptureMethodUploadButton", "Lvo/d3$e;", "reviewSelectedImageTitle", "reviewSelectedImageBody", "reviewSelectedImageConfirmButton", "reviewSelectedImageChooseAnotherButton", "cameraPermissionsTitle", "cameraPermissionsPrompt", "cameraPermissionsAllowButtonText", "cameraPermissionsCancelButtonText", "microphonePermissionsTitle", "microphonePermissionsPrompt", "microphonePermissionsAllowButtonText", "microphonePermissionsCancelButtonText", "hintHoldStill", "hintLowLight", "helpButtonText", "barcodeHelpModalTitle", "barcodeHelpModalPrompt", "barcodeHelpModalHints", "barcodeHelpModalContinueButtonText", "idFrontHelpModalTitle", "idFrontHelpModalPrompt", "idFrontHelpModalHints", "idFrontHelpModalContinueButtonText", "idBackHelpModalTitle", "idBackHelpModalPrompt", "idBackHelpModalHints", "idBackHelpModalContinueButtonText", "staticCaptureTipsTitle", "staticCaptureTipsSubtext", "unableToClassifyDocumentTitle", "unableToClassifyDocumentContinueButtonText", "idClassRejectedTitle", "idClassRejectedContinueButtonText", "countryInputTitle", "idClassInputTitle", "manualClassificationTitle", "manualClassificationContinueButtonText", "autoClassificationCaptureTipText", BuildConfig.FLAVOR, "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$LocalizationOverride;", "localizationOverrides", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvo/k3;Lvo/k3;Lvo/k3;Ljava/lang/String;Lvo/k3;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvo/k3;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lvo/k3;Lvo/k3;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getTitle", "b", "u0", "c", "y", "d", "a0", "e", "H0", "f", "t", "g", "x", "h", "q0", "i", "v0", "j", "C0", "k", "l", "Lvo/k3;", "v", "()Lvo/k3;", "m", "u", "n", "D0", "o", "w", "p", "F", "q", "s", "r", "G", "t0", "r0", "Ljava/util/Map;", "V", "()Ljava/util/Map;", "C", "z", "B", "A", "D", "B0", "w0", "y0", "E", "x0", "H", "I", "J", "p0", "K", "o0", "L", "l0", "M", "m0", "N", "O", "P", "Q", "R", "S", "T", "U", "Z", "Y", "W", "X", "b0", "c0", "L0", "d0", "J0", "e0", "b1", "f0", "N0", "g0", "h0", "i0", "j0", "k0", "n0", "Ljava/util/List;", "()Ljava/util/List;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Strings implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Strings> CREATOR = new C0707a();

            /* JADX INFO: renamed from: A, reason: from kotlin metadata and from toString */
            @NotNull
            public final String chooseCaptureMethodUploadButton;

            /* JADX INFO: renamed from: B, reason: from kotlin metadata and from toString */
            @NotNull
            public final Map<IdConfig.e, String> reviewSelectedImageTitle;

            /* JADX INFO: renamed from: C, reason: from kotlin metadata and from toString */
            @NotNull
            public final Map<IdConfig.e, String> reviewSelectedImageBody;

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

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String title;

            /* JADX INFO: renamed from: a0, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String idBackHelpModalHints;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
            @NotNull
            public final String prompt;

            /* JADX INFO: renamed from: b0, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String idBackHelpModalContinueButtonText;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String choose;

            /* JADX INFO: renamed from: c0, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String staticCaptureTipsTitle;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String instructionsDisclaimer;

            /* JADX INFO: renamed from: d0, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String staticCaptureTipsSubtext;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String selectPageNavBarTitle;

            /* JADX INFO: renamed from: e0, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String unableToClassifyDocumentTitle;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String capturePageNavBarTitle;

            /* JADX INFO: renamed from: f0, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String unableToClassifyDocumentContinueButtonText;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String checkPageNavBarTitle;

            /* JADX INFO: renamed from: g0, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String idClassRejectedTitle;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String pendingPageNavBarTitle;

            /* JADX INFO: renamed from: h0, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String idClassRejectedContinueButtonText;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String requestPageNavBarTitle;

            /* JADX INFO: renamed from: i0, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String countryInputTitle;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String reviewUploadPageNavBarTitle;

            /* JADX INFO: renamed from: j0, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String idClassInputTitle;

            /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String autoClassificationPageNavBarTitle;

            /* JADX INFO: renamed from: k0, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String manualClassificationTitle;

            /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final OverridableText captureScreenTitle;

            /* JADX INFO: renamed from: l0, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String manualClassificationContinueButtonText;

            /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final OverridableText captureScreenDescription;

            /* JADX INFO: renamed from: m0, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String autoClassificationCaptureTipText;

            /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final OverridableText scanInstructions;

            /* JADX INFO: renamed from: n0, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final List<NextStep.GovernmentId.LocalizationOverride> localizationOverrides;

            /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String capturing;

            /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final OverridableText confirmCapture;

            /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String captureDisclaimer;

            /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String buttonSubmit;

            /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String buttonRetake;

            /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final OverridableText confirmCaptureTitle;

            /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String processingTitle;

            /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String processingDescription;

            /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final Map<String, String> idClassToName;

            /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final OverridableText chooseCaptureMethodTitle;

            /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final OverridableText chooseCaptureMethodBody;

            /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String chooseCaptureMethodCameraButton;

            /* JADX INFO: renamed from: vo.d2$a$b$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0707a implements Parcelable.Creator<Strings> {
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
                        linkedHashMap2.put(IdConfig.e.valueOf(parcel.readString()), parcel.readString());
                        i13++;
                        i12 = i12;
                    }
                    int i14 = parcel.readInt();
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap(i14);
                    int i15 = 0;
                    while (i15 != i14) {
                        linkedHashMap3.put(IdConfig.e.valueOf(parcel.readString()), parcel.readString());
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

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Strings[] newArray(int i10) {
                    return new Strings[i10];
                }
            }

            public Strings(@NotNull String title, @NotNull String prompt, @NotNull String choose, @NotNull String instructionsDisclaimer, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @NotNull OverridableText captureScreenTitle, @NotNull OverridableText captureScreenDescription, @NotNull OverridableText scanInstructions, @NotNull String capturing, @NotNull OverridableText confirmCapture, @NotNull String captureDisclaimer, @NotNull String buttonSubmit, @NotNull String buttonRetake, @NotNull OverridableText confirmCaptureTitle, @NotNull String processingTitle, @NotNull String processingDescription, @NotNull Map<String, String> idClassToName, @NotNull OverridableText chooseCaptureMethodTitle, @NotNull OverridableText chooseCaptureMethodBody, @NotNull String chooseCaptureMethodCameraButton, @NotNull String chooseCaptureMethodUploadButton, @NotNull Map<IdConfig.e, String> reviewSelectedImageTitle, @NotNull Map<IdConfig.e, String> reviewSelectedImageBody, @NotNull String reviewSelectedImageConfirmButton, @NotNull String reviewSelectedImageChooseAnotherButton, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable String str18, @Nullable String str19, @Nullable String str20, @Nullable String str21, @Nullable String str22, @Nullable String str23, @Nullable String str24, @Nullable String str25, @Nullable String str26, @Nullable String str27, @Nullable String str28, @Nullable String str29, @Nullable String str30, @Nullable String str31, @Nullable String str32, @Nullable String str33, @Nullable String str34, @Nullable String str35, @Nullable String str36, @Nullable String str37, @Nullable String str38, @Nullable String str39, @Nullable String str40, @Nullable String str41, @Nullable List<NextStep.GovernmentId.LocalizationOverride> list) {
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
            /* JADX INFO: renamed from: B, reason: from getter */
            public final String getChooseCaptureMethodCameraButton() {
                return this.chooseCaptureMethodCameraButton;
            }

            @NotNull
            public final Map<IdConfig.e, String> B0() {
                return this.reviewSelectedImageTitle;
            }

            @NotNull
            /* JADX INFO: renamed from: C, reason: from getter */
            public final OverridableText getChooseCaptureMethodTitle() {
                return this.chooseCaptureMethodTitle;
            }

            @Nullable
            /* JADX INFO: renamed from: C0, reason: from getter */
            public final String getReviewUploadPageNavBarTitle() {
                return this.reviewUploadPageNavBarTitle;
            }

            @NotNull
            /* JADX INFO: renamed from: D, reason: from getter */
            public final String getChooseCaptureMethodUploadButton() {
                return this.chooseCaptureMethodUploadButton;
            }

            @NotNull
            /* JADX INFO: renamed from: D0, reason: from getter */
            public final OverridableText getScanInstructions() {
                return this.scanInstructions;
            }

            @NotNull
            /* JADX INFO: renamed from: F, reason: from getter */
            public final OverridableText getConfirmCapture() {
                return this.confirmCapture;
            }

            @NotNull
            /* JADX INFO: renamed from: G, reason: from getter */
            public final OverridableText getConfirmCaptureTitle() {
                return this.confirmCaptureTitle;
            }

            @Nullable
            /* JADX INFO: renamed from: H, reason: from getter */
            public final String getCountryInputTitle() {
                return this.countryInputTitle;
            }

            @Nullable
            /* JADX INFO: renamed from: H0, reason: from getter */
            public final String getSelectPageNavBarTitle() {
                return this.selectPageNavBarTitle;
            }

            @Nullable
            /* JADX INFO: renamed from: J, reason: from getter */
            public final String getHelpButtonText() {
                return this.helpButtonText;
            }

            @Nullable
            /* JADX INFO: renamed from: J0, reason: from getter */
            public final String getStaticCaptureTipsSubtext() {
                return this.staticCaptureTipsSubtext;
            }

            @Nullable
            /* JADX INFO: renamed from: L, reason: from getter */
            public final String getHintHoldStill() {
                return this.hintHoldStill;
            }

            @Nullable
            /* JADX INFO: renamed from: L0, reason: from getter */
            public final String getStaticCaptureTipsTitle() {
                return this.staticCaptureTipsTitle;
            }

            @Nullable
            /* JADX INFO: renamed from: M, reason: from getter */
            public final String getHintLowLight() {
                return this.hintLowLight;
            }

            @Nullable
            /* JADX INFO: renamed from: N, reason: from getter */
            public final String getIdBackHelpModalContinueButtonText() {
                return this.idBackHelpModalContinueButtonText;
            }

            @Nullable
            /* JADX INFO: renamed from: N0, reason: from getter */
            public final String getUnableToClassifyDocumentContinueButtonText() {
                return this.unableToClassifyDocumentContinueButtonText;
            }

            @Nullable
            /* JADX INFO: renamed from: O, reason: from getter */
            public final String getIdBackHelpModalHints() {
                return this.idBackHelpModalHints;
            }

            @Nullable
            /* JADX INFO: renamed from: P, reason: from getter */
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

            @NotNull
            public final Map<String, String> V() {
                return this.idClassToName;
            }

            @Nullable
            /* JADX INFO: renamed from: W, reason: from getter */
            public final String getIdFrontHelpModalContinueButtonText() {
                return this.idFrontHelpModalContinueButtonText;
            }

            @Nullable
            /* JADX INFO: renamed from: X, reason: from getter */
            public final String getIdFrontHelpModalHints() {
                return this.idFrontHelpModalHints;
            }

            @Nullable
            /* JADX INFO: renamed from: Y, reason: from getter */
            public final String getIdFrontHelpModalPrompt() {
                return this.idFrontHelpModalPrompt;
            }

            @Nullable
            /* JADX INFO: renamed from: Z, reason: from getter */
            public final String getIdFrontHelpModalTitle() {
                return this.idFrontHelpModalTitle;
            }

            @Nullable
            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getAutoClassificationCaptureTipText() {
                return this.autoClassificationCaptureTipText;
            }

            @NotNull
            /* JADX INFO: renamed from: a0, reason: from getter */
            public final String getInstructionsDisclaimer() {
                return this.instructionsDisclaimer;
            }

            @Nullable
            /* JADX INFO: renamed from: b1, reason: from getter */
            public final String getUnableToClassifyDocumentTitle() {
                return this.unableToClassifyDocumentTitle;
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
                return Intrinsics.c(this.title, strings.title) && Intrinsics.c(this.prompt, strings.prompt) && Intrinsics.c(this.choose, strings.choose) && Intrinsics.c(this.instructionsDisclaimer, strings.instructionsDisclaimer) && Intrinsics.c(this.selectPageNavBarTitle, strings.selectPageNavBarTitle) && Intrinsics.c(this.capturePageNavBarTitle, strings.capturePageNavBarTitle) && Intrinsics.c(this.checkPageNavBarTitle, strings.checkPageNavBarTitle) && Intrinsics.c(this.pendingPageNavBarTitle, strings.pendingPageNavBarTitle) && Intrinsics.c(this.requestPageNavBarTitle, strings.requestPageNavBarTitle) && Intrinsics.c(this.reviewUploadPageNavBarTitle, strings.reviewUploadPageNavBarTitle) && Intrinsics.c(this.autoClassificationPageNavBarTitle, strings.autoClassificationPageNavBarTitle) && Intrinsics.c(this.captureScreenTitle, strings.captureScreenTitle) && Intrinsics.c(this.captureScreenDescription, strings.captureScreenDescription) && Intrinsics.c(this.scanInstructions, strings.scanInstructions) && Intrinsics.c(this.capturing, strings.capturing) && Intrinsics.c(this.confirmCapture, strings.confirmCapture) && Intrinsics.c(this.captureDisclaimer, strings.captureDisclaimer) && Intrinsics.c(this.buttonSubmit, strings.buttonSubmit) && Intrinsics.c(this.buttonRetake, strings.buttonRetake) && Intrinsics.c(this.confirmCaptureTitle, strings.confirmCaptureTitle) && Intrinsics.c(this.processingTitle, strings.processingTitle) && Intrinsics.c(this.processingDescription, strings.processingDescription) && Intrinsics.c(this.idClassToName, strings.idClassToName) && Intrinsics.c(this.chooseCaptureMethodTitle, strings.chooseCaptureMethodTitle) && Intrinsics.c(this.chooseCaptureMethodBody, strings.chooseCaptureMethodBody) && Intrinsics.c(this.chooseCaptureMethodCameraButton, strings.chooseCaptureMethodCameraButton) && Intrinsics.c(this.chooseCaptureMethodUploadButton, strings.chooseCaptureMethodUploadButton) && Intrinsics.c(this.reviewSelectedImageTitle, strings.reviewSelectedImageTitle) && Intrinsics.c(this.reviewSelectedImageBody, strings.reviewSelectedImageBody) && Intrinsics.c(this.reviewSelectedImageConfirmButton, strings.reviewSelectedImageConfirmButton) && Intrinsics.c(this.reviewSelectedImageChooseAnotherButton, strings.reviewSelectedImageChooseAnotherButton) && Intrinsics.c(this.cameraPermissionsTitle, strings.cameraPermissionsTitle) && Intrinsics.c(this.cameraPermissionsPrompt, strings.cameraPermissionsPrompt) && Intrinsics.c(this.cameraPermissionsAllowButtonText, strings.cameraPermissionsAllowButtonText) && Intrinsics.c(this.cameraPermissionsCancelButtonText, strings.cameraPermissionsCancelButtonText) && Intrinsics.c(this.microphonePermissionsTitle, strings.microphonePermissionsTitle) && Intrinsics.c(this.microphonePermissionsPrompt, strings.microphonePermissionsPrompt) && Intrinsics.c(this.microphonePermissionsAllowButtonText, strings.microphonePermissionsAllowButtonText) && Intrinsics.c(this.microphonePermissionsCancelButtonText, strings.microphonePermissionsCancelButtonText) && Intrinsics.c(this.hintHoldStill, strings.hintHoldStill) && Intrinsics.c(this.hintLowLight, strings.hintLowLight) && Intrinsics.c(this.helpButtonText, strings.helpButtonText) && Intrinsics.c(this.barcodeHelpModalTitle, strings.barcodeHelpModalTitle) && Intrinsics.c(this.barcodeHelpModalPrompt, strings.barcodeHelpModalPrompt) && Intrinsics.c(this.barcodeHelpModalHints, strings.barcodeHelpModalHints) && Intrinsics.c(this.barcodeHelpModalContinueButtonText, strings.barcodeHelpModalContinueButtonText) && Intrinsics.c(this.idFrontHelpModalTitle, strings.idFrontHelpModalTitle) && Intrinsics.c(this.idFrontHelpModalPrompt, strings.idFrontHelpModalPrompt) && Intrinsics.c(this.idFrontHelpModalHints, strings.idFrontHelpModalHints) && Intrinsics.c(this.idFrontHelpModalContinueButtonText, strings.idFrontHelpModalContinueButtonText) && Intrinsics.c(this.idBackHelpModalTitle, strings.idBackHelpModalTitle) && Intrinsics.c(this.idBackHelpModalPrompt, strings.idBackHelpModalPrompt) && Intrinsics.c(this.idBackHelpModalHints, strings.idBackHelpModalHints) && Intrinsics.c(this.idBackHelpModalContinueButtonText, strings.idBackHelpModalContinueButtonText) && Intrinsics.c(this.staticCaptureTipsTitle, strings.staticCaptureTipsTitle) && Intrinsics.c(this.staticCaptureTipsSubtext, strings.staticCaptureTipsSubtext) && Intrinsics.c(this.unableToClassifyDocumentTitle, strings.unableToClassifyDocumentTitle) && Intrinsics.c(this.unableToClassifyDocumentContinueButtonText, strings.unableToClassifyDocumentContinueButtonText) && Intrinsics.c(this.idClassRejectedTitle, strings.idClassRejectedTitle) && Intrinsics.c(this.idClassRejectedContinueButtonText, strings.idClassRejectedContinueButtonText) && Intrinsics.c(this.countryInputTitle, strings.countryInputTitle) && Intrinsics.c(this.idClassInputTitle, strings.idClassInputTitle) && Intrinsics.c(this.manualClassificationTitle, strings.manualClassificationTitle) && Intrinsics.c(this.manualClassificationContinueButtonText, strings.manualClassificationContinueButtonText) && Intrinsics.c(this.autoClassificationCaptureTipText, strings.autoClassificationCaptureTipText) && Intrinsics.c(this.localizationOverrides, strings.localizationOverrides);
            }

            @Nullable
            /* JADX INFO: renamed from: f, reason: from getter */
            public final String getAutoClassificationPageNavBarTitle() {
                return this.autoClassificationPageNavBarTitle;
            }

            @Nullable
            public final List<NextStep.GovernmentId.LocalizationOverride> f0() {
                return this.localizationOverrides;
            }

            @Nullable
            /* JADX INFO: renamed from: g, reason: from getter */
            public final String getBarcodeHelpModalContinueButtonText() {
                return this.barcodeHelpModalContinueButtonText;
            }

            @Nullable
            /* JADX INFO: renamed from: g0, reason: from getter */
            public final String getManualClassificationContinueButtonText() {
                return this.manualClassificationContinueButtonText;
            }

            @NotNull
            public final String getTitle() {
                return this.title;
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
            public final String getManualClassificationTitle() {
                return this.manualClassificationTitle;
            }

            @Nullable
            /* JADX INFO: renamed from: k, reason: from getter */
            public final String getBarcodeHelpModalTitle() {
                return this.barcodeHelpModalTitle;
            }

            @NotNull
            /* JADX INFO: renamed from: l, reason: from getter */
            public final String getButtonRetake() {
                return this.buttonRetake;
            }

            @Nullable
            /* JADX INFO: renamed from: l0, reason: from getter */
            public final String getMicrophonePermissionsAllowButtonText() {
                return this.microphonePermissionsAllowButtonText;
            }

            @Nullable
            /* JADX INFO: renamed from: m0, reason: from getter */
            public final String getMicrophonePermissionsCancelButtonText() {
                return this.microphonePermissionsCancelButtonText;
            }

            @NotNull
            /* JADX INFO: renamed from: n, reason: from getter */
            public final String getButtonSubmit() {
                return this.buttonSubmit;
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
            /* JADX INFO: renamed from: r0, reason: from getter */
            public final String getProcessingDescription() {
                return this.processingDescription;
            }

            @NotNull
            /* JADX INFO: renamed from: s, reason: from getter */
            public final String getCaptureDisclaimer() {
                return this.captureDisclaimer;
            }

            @Nullable
            /* JADX INFO: renamed from: t, reason: from getter */
            public final String getCapturePageNavBarTitle() {
                return this.capturePageNavBarTitle;
            }

            @NotNull
            /* JADX INFO: renamed from: t0, reason: from getter */
            public final String getProcessingTitle() {
                return this.processingTitle;
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
            public final String getPrompt() {
                return this.prompt;
            }

            @NotNull
            /* JADX INFO: renamed from: v, reason: from getter */
            public final OverridableText getCaptureScreenTitle() {
                return this.captureScreenTitle;
            }

            @Nullable
            /* JADX INFO: renamed from: v0, reason: from getter */
            public final String getRequestPageNavBarTitle() {
                return this.requestPageNavBarTitle;
            }

            @NotNull
            /* JADX INFO: renamed from: w, reason: from getter */
            public final String getCapturing() {
                return this.capturing;
            }

            @NotNull
            public final Map<IdConfig.e, String> w0() {
                return this.reviewSelectedImageBody;
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
                Map<IdConfig.e, String> map2 = this.reviewSelectedImageTitle;
                dest.writeInt(map2.size());
                for (Map.Entry<IdConfig.e, String> entry2 : map2.entrySet()) {
                    dest.writeString(entry2.getKey().name());
                    dest.writeString(entry2.getValue());
                }
                Map<IdConfig.e, String> map3 = this.reviewSelectedImageBody;
                dest.writeInt(map3.size());
                for (Map.Entry<IdConfig.e, String> entry3 : map3.entrySet()) {
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
            /* JADX INFO: renamed from: x0, reason: from getter */
            public final String getReviewSelectedImageChooseAnotherButton() {
                return this.reviewSelectedImageChooseAnotherButton;
            }

            @NotNull
            /* JADX INFO: renamed from: y, reason: from getter */
            public final String getChoose() {
                return this.choose;
            }

            @NotNull
            /* JADX INFO: renamed from: y0, reason: from getter */
            public final String getReviewSelectedImageConfirmButton() {
                return this.reviewSelectedImageConfirmButton;
            }

            @NotNull
            /* JADX INFO: renamed from: z, reason: from getter */
            public final OverridableText getChooseCaptureMethodBody() {
                return this.chooseCaptureMethodBody;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull String sessionToken, @Nullable String str, @NotNull List<IdConfig> enabledIdClasses, @NotNull String inquiryId, @NotNull String fromStep, @NotNull String fromComponent, boolean z10, boolean z11, @NotNull List<? extends CaptureOptionNativeMobile> enabledCaptureOptionsNativeMobile, @Nullable StepStyles.GovernmentIdStepStyle governmentIdStepStyle, @NotNull Strings strings, int i10, @NotNull String fieldKeyDocument, @NotNull String fieldKeyIdClass, long j10, boolean z12, @Nullable Integer num, @NotNull VideoCaptureConfig videoCaptureConfig, @NotNull NextStep.GovernmentId.AssetConfig assetConfig, boolean z13, @NotNull wo.a autoClassificationConfig, @NotNull StyleElements.Axis reviewCaptureButtonsAxis, @NotNull PendingPageTextPosition pendingPageTextVerticalPosition, @Nullable bp.a aVar, boolean z14, @Nullable Integer num2, @NotNull i designVersion, @Nullable String str2, @Nullable or.b bVar) {
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
            this.digitalIdConfig = aVar;
            this.staticCaptureTipsEnabled = z14;
            this.holographicTorchEnabledDurationMs = num2;
            this.designVersion = designVersion;
            this.flowWatermarkText = str2;
            this.customPendingPage = bVar;
        }

        @NotNull
        /* JADX INFO: renamed from: A, reason: from getter */
        public final String getSessionToken() {
            return this.sessionToken;
        }

        @NotNull
        /* JADX INFO: renamed from: B, reason: from getter */
        public final StyleElements.Axis getReviewCaptureButtonsAxis() {
            return this.reviewCaptureButtonsAxis;
        }

        /* JADX INFO: renamed from: C, reason: from getter */
        public final boolean getShouldSkipReviewScreen() {
            return this.shouldSkipReviewScreen;
        }

        /* JADX INFO: renamed from: D, reason: from getter */
        public final boolean getStaticCaptureTipsEnabled() {
            return this.staticCaptureTipsEnabled;
        }

        @NotNull
        /* JADX INFO: renamed from: F, reason: from getter */
        public final Strings getStrings() {
            return this.strings;
        }

        @Nullable
        /* JADX INFO: renamed from: G, reason: from getter */
        public final StepStyles.GovernmentIdStepStyle getStyles() {
            return this.styles;
        }

        @NotNull
        /* JADX INFO: renamed from: H, reason: from getter */
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
        public final wo.a getAutoClassificationConfig() {
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
        public final or.b getCustomPendingPage() {
            return this.customPendingPage;
        }

        @NotNull
        /* JADX INFO: renamed from: l, reason: from getter */
        public final i getDesignVersion() {
            return this.designVersion;
        }

        @NotNull
        public final List<CaptureOptionNativeMobile> n() {
            return this.enabledCaptureOptionsNativeMobile;
        }

        @NotNull
        public final List<IdConfig> o() {
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

        public final boolean u() {
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
            bp.a aVar = this.digitalIdConfig;
            if (aVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                aVar.writeToParcel(dest, flags);
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

        /* JADX INFO: renamed from: y, reason: from getter */
        public final long getManualCaptureButtonDelayMs() {
            return this.manualCaptureButtonDelayMs;
        }

        @NotNull
        /* JADX INFO: renamed from: z, reason: from getter */
        public final PendingPageTextPosition getPendingPageTextVerticalPosition() {
            return this.pendingPageTextVerticalPosition;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lvo/d2$b;", BuildConfig.FLAVOR, "<init>", "()V", "b", "d", "a", "c", "Lvo/d2$b$a;", "Lvo/d2$b$b;", "Lvo/d2$b$c;", "Lvo/d2$b$d;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class b {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lvo/d2$b$a;", "Lvo/d2$b;", "<init>", "()V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f34599a = new a();

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

        /* JADX INFO: renamed from: vo.d2$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lvo/d2$b$b;", "Lvo/d2$b;", "<init>", "()V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C0708b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0708b f34600a = new C0708b();

            public C0708b() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof C0708b);
            }

            public int hashCode() {
                return 1649914237;
            }

            @NotNull
            public String toString() {
                return "Canceled";
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lvo/d2$b$c;", "Lvo/d2$b;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", "a", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class c extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
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

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lvo/d2$b$d;", "Lvo/d2$b;", "<init>", "()V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class d extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final d f34602a = new d();

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

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public b() {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f34603a;

        static {
            int[] iArr = new int[IdConfig.e.values().length];
            try {
                iArr[IdConfig.e.Front.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IdConfig.e.Back.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IdConfig.e.FrontOrBack.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IdConfig.e.BarcodePdf417.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[IdConfig.e.PassportSignature.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f34603a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$render$2", f = "GovernmentIdWorkflow.kt", l = {157}, m = "invokeSuspend")
    public static final class d extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f34604t;

        public d(eu.b<? super d> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return d2.this.new d(bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f34604t;
            if (i10 == 0) {
                zt.o.b(obj);
                sn.m mVar = sn.m.f31643a;
                Context context = d2.this.applicationContext;
                this.f34604t = 1;
                if (mVar.b(context, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
            }
            d2.this.videoCaptureHelper.a();
            return Unit.f21506a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$render$3", f = "GovernmentIdWorkflow.kt", l = {}, m = "invokeSuspend")
    public static final class e extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f34606t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ ln.k<a, j0, b, Object>.a f34607u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ d2 f34608v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(ln.k<? super a, j0, ? extends b, ? extends Object>.a aVar, d2 d2Var, eu.b<? super e> bVar) {
            super(2, bVar);
            this.f34607u = aVar;
            this.f34608v = d2Var;
        }

        public static final Unit p(d2 d2Var, ln.r.c cVar) {
            d2Var.c1(cVar);
            return Unit.f21506a;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new e(this.f34607u, this.f34608v, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
            return ((e) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            fu.c.e();
            if (this.f34606t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zt.o.b(obj);
            ln.h<ln.r<? super a, j0, ? extends b>> hVarD = this.f34607u.d();
            final d2 d2Var = this.f34608v;
            hVarD.a(ln.z.d(d2Var, null, new Function1() { // from class: vo.e2
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return d2.e.p(d2Var, (ln.r.c) obj2);
                }
            }, 1, null));
            return Unit.f21506a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$renderScreen$1", f = "GovernmentIdWorkflow.kt", l = {}, m = "invokeSuspend")
    public static final class f extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f34609t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ a f34610u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ j0 f34611v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ d2 f34612w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ ln.k<a, j0, b, Object>.a f34613x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(a aVar, j0 j0Var, d2 d2Var, ln.k<? super a, j0, ? extends b, ? extends Object>.a aVar2, eu.b<? super f> bVar) {
            super(2, bVar);
            this.f34610u = aVar;
            this.f34611v = j0Var;
            this.f34612w = d2Var;
            this.f34613x = aVar2;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new f(this.f34610u, this.f34611v, this.f34612w, this.f34613x, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
            return ((f) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            fu.c.e();
            if (this.f34609t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zt.o.b(obj);
            if (this.f34610u.o().size() == 1) {
                j0 j0Var = this.f34611v;
                d2 d2Var = this.f34612w;
                ln.k<a, j0, b, Object>.a aVar = this.f34613x;
                a aVar2 = this.f34610u;
                d2.Z0(j0Var, d2Var, aVar, aVar2, (IdConfig) CollectionsKt.d0(aVar2.o()), false);
            }
            return Unit.f21506a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$renderScreen$24", f = "GovernmentIdWorkflow.kt", l = {774}, m = "invokeSuspend")
    public static final class g extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f34614t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ ln.k<a, j0, b, Object>.a f34616v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ j0 f34617w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(ln.k<? super a, j0, ? extends b, ? extends Object>.a aVar, j0 j0Var, eu.b<? super g> bVar) {
            super(2, bVar);
            this.f34616v = aVar;
            this.f34617w = j0Var;
        }

        public static final Unit p(j0 j0Var, ln.r.c cVar) {
            cVar.e(j0Var);
            return Unit.f21506a;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return d2.this.new g(this.f34616v, this.f34617w, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
            return ((g) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f34614t;
            if (i10 == 0) {
                zt.o.b(obj);
                sn.m mVar = sn.m.f31643a;
                Context context = d2.this.applicationContext;
                this.f34614t = 1;
                if (mVar.b(context, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
            }
            d2.this.videoCaptureHelper.a();
            ln.h<ln.r<? super a, j0, ? extends b>> hVarD = this.f34616v.d();
            d2 d2Var = d2.this;
            final j0 j0Var = this.f34617w;
            hVarD.a(ln.z.d(d2Var, null, new Function1() { // from class: vo.f2
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return d2.g.p(j0Var, (ln.r.c) obj2);
                }
            }, 1, null));
            return Unit.f21506a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class h extends p001kotlin.jvm.internal.a implements Function1<IdConfig, Unit> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ j0 f34618h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ d2 f34619i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ ln.k<a, j0, b, Object>.a f34620j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ a f34621k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(j0 j0Var, d2 d2Var, ln.k<? super a, j0, ? extends b, ? extends Object>.a aVar, a aVar2) {
            super(1, Intrinsics.a.class, "selectIdClass", "renderScreen$selectIdClass(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lcom/squareup/workflow1/StatefulWorkflow$RenderContext;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;Z)V", 0);
            this.f34618h = j0Var;
            this.f34619i = d2Var;
            this.f34620j = aVar;
            this.f34621k = aVar2;
        }

        public final void a(IdConfig p8) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            d2.a1(this.f34618h, this.f34619i, this.f34620j, this.f34621k, p8, false, 32, null);
        }

        @Override // p001kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(IdConfig idConfig) {
            a(idConfig);
            return Unit.f21506a;
        }
    }

    public d2(@NotNull Context applicationContext, @NotNull l6.s imageLoader, @NotNull dp.f.a submitVerificationWorkerFactory, @NotNull j documentSelectWorker, @NotNull ip.j localVideoCaptureRenderer, @NotNull ip.v webRtcRenderer, @NotNull yo.t0 captureRenderer, @NotNull AutoClassifyWorker.b autoClassifyWorkerFactory, @NotNull wo.o autoClassificationRenderer, @NotNull yn.a cameraStatsManager, @NotNull ir.b navigationStateManager, @NotNull dr.c externalEventLogger, @NotNull TrackingEventsLogger trackingEventsLogger, @NotNull gr.b themeManager) {
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
        this.videoCaptureHelper = new ip.l(null, 1, null);
    }

    public static final Unit A0(final d2 d2Var, final ln.k.a aVar, final j0 j0Var, final a aVar2, final vo.f fVar) {
        TrackingEventsLogger.logGovernmentIdButtonClickEvent$default(d2Var.trackingEventsLogger, new GovernmentIdButtonEventData(GovIdCaptureButtonType.RETAKE_PHOTO, null, 2, null), false, 2, null);
        aVar.d().a(ln.z.d(d2Var, null, new Function1() { // from class: vo.d1
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return d2.B0(j0Var, aVar2, fVar, aVar, d2Var, (ln.r.c) obj);
            }
        }, 1, null));
        return Unit.f21506a;
    }

    public static final Unit B0(j0 j0Var, a aVar, vo.f fVar, final ln.k.a aVar2, final d2 d2Var, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objC = action.c();
        j0 j0Var2 = objC instanceof j0 ? (j0) objC : null;
        if (j0Var2 == null) {
            return Unit.f21506a;
        }
        j0.ReviewCapturedImage reviewCapturedImage = (j0.ReviewCapturedImage) j0Var;
        j0.WaitForAutocapture waitForAutocapture = new j0.WaitForAutocapture(reviewCapturedImage.getCurrentPart(), ((j0) action.c()).D(), fVar, b3.O((a) action.b(), reviewCapturedImage.getCurrentPart().getSide()), j0Var2.C(), j0Var2.getPartIndex(), b3.x(action, false), ip.x.Disconnected, aVar.getVideoCaptureConfig().getWebRtcJwt(), null, false, false, reviewCapturedImage.getCountryCode(), null, new Function0() { // from class: vo.r1
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return d2.C0(aVar2, d2Var);
            }
        }, 11776, null);
        waitForAutocapture.F(true);
        action.e(waitForAutocapture);
        return Unit.f21506a;
    }

    public static final Unit C0(ln.k.a aVar, final d2 d2Var) {
        aVar.d().a(ln.z.d(d2Var, null, new Function1() { // from class: vo.v1
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return d2.D0(this.f34995a, (ln.r.c) obj);
            }
        }, 1, null));
        return Unit.f21506a;
    }

    public static final Unit D0(d2 d2Var, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objC = action.c();
        j0.WaitForAutocapture waitForAutocapture = objC instanceof j0.WaitForAutocapture ? (j0.WaitForAutocapture) objC : null;
        if (waitForAutocapture != null) {
            action.e(j0.WaitForAutocapture.L(waitForAutocapture, null, null, null, null, null, 0, null, d2Var.videoCaptureHelper.d() ? ip.x.Connected : ip.x.Disconnected, null, null, false, false, null, null, null, 32639, null));
        }
        return Unit.f21506a;
    }

    public static final Unit E0(ln.h hVar) {
        hVar.a(b.C0708b.f34600a);
        return Unit.f21506a;
    }

    public static final Unit F0(ln.k.a aVar, d2 d2Var, final j0 j0Var) {
        aVar.d().a(ln.z.d(d2Var, null, new Function1() { // from class: vo.o1
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return d2.G0(j0Var, (ln.r.c) obj);
            }
        }, 1, null));
        return Unit.f21506a;
    }

    public static final Unit G0(j0 j0Var, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(j0.ReviewCapturedImage.N((j0.ReviewCapturedImage) j0Var, null, null, null, null, null, 0, null, null, null, false, null, 1791, null));
        return Unit.f21506a;
    }

    public static final Unit H0(a aVar, j0 j0Var, ln.k.a aVar2, d2 d2Var) {
        x3.h(aVar, (j0.j) j0Var, aVar2, d2Var.videoCaptureHelper, d2Var.trackingEventsLogger);
        return Unit.f21506a;
    }

    public static final Unit I0(ln.k.a aVar, d2 d2Var) {
        b3.S(aVar, d2Var.videoCaptureHelper);
        return Unit.f21506a;
    }

    public static final Unit J0(ln.k.a aVar, d2 d2Var) {
        b3.S(aVar, d2Var.videoCaptureHelper);
        return Unit.f21506a;
    }

    public static final Unit K0(ln.k.a aVar) {
        b3.v(aVar);
        return Unit.f21506a;
    }

    public static final Unit L0(ln.k.a aVar, d2 d2Var, final j0 j0Var) {
        aVar.d().a(ln.z.d(d2Var, null, new Function1() { // from class: vo.e1
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return d2.M0(j0Var, (ln.r.c) obj);
            }
        }, 1, null));
        return Unit.f21506a;
    }

    public static final Unit M0(j0 j0Var, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(j0.ReviewSelectedImage.N((j0.ReviewSelectedImage) j0Var, null, null, null, null, null, null, 0, null, null, null, false, null, 3583, null));
        return Unit.f21506a;
    }

    public static final Unit N0(ln.k.a aVar, d2 d2Var) {
        b3.S(aVar, d2Var.videoCaptureHelper);
        return Unit.f21506a;
    }

    public static final ln.r O0(final d2 d2Var, final ln.k.a aVar, final dp.f.b it) {
        final String string;
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof dp.f.b.c) {
            return ln.z.d(d2Var, null, new Function1() { // from class: vo.g1
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return d2.P0(this.f34651a, aVar, (ln.r.c) obj);
                }
            }, 1, null);
        }
        if (!(it instanceof dp.f.b.C0228b)) {
            if (it instanceof dp.f.b.a) {
                return ln.z.d(d2Var, null, new Function1() { // from class: vo.i1
                    @Override // p001kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return d2.R0(it, d2Var, aVar, (ln.r.c) obj);
                    }
                }, 1, null);
            }
            throw new zt.l();
        }
        dp.f.b.C0228b c0228b = (dp.f.b.C0228b) it;
        if (c0228b.getCause() instanceof GenericFileUploadErrorResponse.DocumentErrorResponse.GovernmentIdDimensionSizeError) {
            string = d2Var.applicationContext.getString(jq.g.f20890t, Integer.valueOf(((GenericFileUploadErrorResponse.DocumentErrorResponse.GovernmentIdDimensionSizeError) c0228b.getCause()).getDetails().getMinDimensionSize()));
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        } else {
            string = d2Var.applicationContext.getString(jq.g.f20891u);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        }
        return ln.z.d(d2Var, null, new Function1() { // from class: vo.h1
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return d2.Q0(string, (ln.r.c) obj);
            }
        }, 1, null);
    }

    public static final Unit P0(d2 d2Var, ln.k.a aVar, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        d2Var.b1(aVar, b.d.f34602a);
        return Unit.f21506a;
    }

    public static final Unit Q0(String str, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        j0 backState = ((j0) action.c()).getBackState();
        if (backState != null) {
            action.e(backState.u(str));
        }
        return Unit.f21506a;
    }

    public static final Unit R0(dp.f.b bVar, d2 d2Var, ln.k.a aVar, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        j0 backState = ((j0) action.c()).getBackState();
        dp.f.b.a aVar2 = (dp.f.b.a) bVar;
        if ((aVar2.getCause() instanceof InternalErrorInfo.NetworkErrorInfo) && ((InternalErrorInfo.NetworkErrorInfo) aVar2.getCause()).isRecoverable() && backState != null) {
            String string = d2Var.applicationContext.getString(jq.g.B);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            action.e(backState.u(string));
        } else {
            d2Var.b1(aVar, new b.c(aVar2.getCause()));
        }
        return Unit.f21506a;
    }

    public static final Unit S0(d2 d2Var, ln.k.a aVar) {
        d2Var.b1(aVar, b.C0708b.f34600a);
        return Unit.f21506a;
    }

    public static final Unit T0(d2 d2Var, ln.k.a aVar) {
        d2Var.b1(aVar, b.C0708b.f34600a);
        return Unit.f21506a;
    }

    public static final Unit U0(ln.k.a aVar) {
        b3.v(aVar);
        return Unit.f21506a;
    }

    public static final Unit V0(ln.k.a aVar, d2 d2Var, final j0 j0Var) {
        aVar.d().a(ln.z.d(d2Var, null, new Function1() { // from class: vo.q1
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return d2.W0(j0Var, (ln.r.c) obj);
            }
        }, 1, null));
        return Unit.f21506a;
    }

    public static final Unit W0(j0 j0Var, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(j0.ShowInstructions.H((j0.ShowInstructions) j0Var, null, null, null, null, 0, null, null, null, 127, null));
        return Unit.f21506a;
    }

    public static final ln.r<a, j0, b> X0(i3.SideIdPart sideIdPart, final j0 j0Var, d2 d2Var, String str, final String str2) {
        final n.GovernmentIdImage governmentIdImage = new n.GovernmentIdImage(p001kotlin.collections.o.d(new Frame(str, null, 2, null)), b3.e0(sideIdPart.getSide()), vo.g.b(((j0.ChooseCaptureMethod) j0Var).getCaptureConfig()), n.a.f34839c, null, null, 32, null);
        return ln.z.d(d2Var, null, new Function1() { // from class: vo.s1
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return d2.Y0(j0Var, governmentIdImage, str2, (ln.r.c) obj);
            }
        }, 1, null);
    }

    public static final Unit Y0(j0 j0Var, n.GovernmentIdImage governmentIdImage, String str, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objC = action.c();
        j0.ChooseCaptureMethod chooseCaptureMethod = objC instanceof j0.ChooseCaptureMethod ? (j0.ChooseCaptureMethod) objC : null;
        if (chooseCaptureMethod == null) {
            return Unit.f21506a;
        }
        j0.ChooseCaptureMethod chooseCaptureMethod2 = chooseCaptureMethod;
        j0.ChooseCaptureMethod chooseCaptureMethod3 = (j0.ChooseCaptureMethod) j0Var;
        action.e(new j0.ReviewSelectedImage(chooseCaptureMethod3.getCurrentPart(), chooseCaptureMethod3.D(), chooseCaptureMethod3.getCaptureConfig(), governmentIdImage, str, chooseCaptureMethod2.C(), chooseCaptureMethod2.getPartIndex(), b3.y(action, false, 1, null), null, null, false, chooseCaptureMethod3.getCountryCode(), 1792, null));
        return Unit.f21506a;
    }

    public static final void Z0(j0 j0Var, d2 d2Var, ln.k<? super a, j0, ? extends b, ? extends Object>.a aVar, a aVar2, IdConfig idConfig, boolean z10) {
        j0.ShowInstructions showInstructions = (j0.ShowInstructions) j0Var;
        b3.W(showInstructions, aVar, aVar2, null, idConfig, d2Var.videoCaptureHelper, new sn.v(null, null, null, 0, 0, 31, null), (3584 & Barcode.FORMAT_ITF) != 0 ? true : z10, (3584 & Barcode.FORMAT_QR_CODE) != 0 ? showInstructions.C() : idConfig.f(), (3584 & Barcode.FORMAT_UPC_A) != 0 ? showInstructions.getPartIndex() : 0, (3584 & Barcode.FORMAT_UPC_E) != 0 ? null : null, (3584 & Barcode.FORMAT_PDF417) != 0 ? showInstructions.getCountryCode() : null);
    }

    public static /* synthetic */ void a1(j0 j0Var, d2 d2Var, ln.k.a aVar, a aVar2, IdConfig idConfig, boolean z10, int i10, Object obj) {
        if ((i10 & 32) != 0) {
            z10 = true;
        }
        Z0(j0Var, d2Var, aVar, aVar2, idConfig, z10);
    }

    public static final ln.r k0(final d2 d2Var, i3.SideIdPart sideIdPart, final j0 j0Var, final ln.k.a aVar, final j.a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof j.a.c) {
            j.a.c cVar = (j.a.c) it;
            return X0(sideIdPart, j0Var, d2Var, cVar.getAbsoluteFilePath(), cVar.getFileName());
        }
        if (Intrinsics.c(it, j.a.C0712a.f34672a)) {
            return ln.z.d(d2Var, null, new Function1() { // from class: vo.k1
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return d2.m0(j0Var, (ln.r.c) obj);
                }
            }, 1, null);
        }
        if (it instanceof j.a.b) {
            return ln.z.d(d2Var, null, new Function1() { // from class: vo.m1
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return d2.l0(this.f34825a, aVar, it, (ln.r.c) obj);
                }
            }, 1, null);
        }
        throw new zt.l();
    }

    public static final Unit l0(d2 d2Var, ln.k.a aVar, j.a aVar2, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        d2Var.b1(aVar, new b.c(((j.a.b) aVar2).getCause()));
        return Unit.f21506a;
    }

    public static final Unit m0(j0 j0Var, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(j0.ChooseCaptureMethod.H((j0.ChooseCaptureMethod) j0Var, null, null, null, 0, null, null, false, null, null, 447, null));
        return Unit.f21506a;
    }

    public static final Unit n0(final ln.k.a aVar, final d2 d2Var, final j0 j0Var, final a aVar2) {
        aVar.d().a(ln.z.d(d2Var, null, new Function1() { // from class: vo.f1
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return d2.o0(j0Var, aVar2, aVar, d2Var, (ln.r.c) obj);
            }
        }, 1, null));
        return Unit.f21506a;
    }

    public static final Unit o0(j0 j0Var, a aVar, final ln.k.a aVar2, final d2 d2Var, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objC = action.c();
        j0.ChooseCaptureMethod chooseCaptureMethod = objC instanceof j0.ChooseCaptureMethod ? (j0.ChooseCaptureMethod) objC : null;
        if (chooseCaptureMethod == null) {
            return Unit.f21506a;
        }
        j0.ChooseCaptureMethod chooseCaptureMethod2 = (j0.ChooseCaptureMethod) j0Var;
        action.e(new j0.WaitForAutocapture(chooseCaptureMethod2.getCurrentPart(), chooseCaptureMethod2.D(), chooseCaptureMethod2.getCaptureConfig(), b3.O(aVar, chooseCaptureMethod2.getCurrentPart().getSide()), chooseCaptureMethod.C(), chooseCaptureMethod.getPartIndex(), b3.y(action, false, 1, null), ip.x.Disconnected, aVar.getVideoCaptureConfig().getWebRtcJwt(), null, false, false, chooseCaptureMethod2.getCountryCode(), null, new Function0() { // from class: vo.t1
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return d2.p0(aVar2, d2Var);
            }
        }, 11776, null));
        return Unit.f21506a;
    }

    public static final Unit p0(ln.k.a aVar, final d2 d2Var) {
        aVar.d().a(ln.z.d(d2Var, null, new Function1() { // from class: vo.u1
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return d2.q0(this.f34975a, (ln.r.c) obj);
            }
        }, 1, null));
        return Unit.f21506a;
    }

    public static final Unit q0(d2 d2Var, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objC = action.c();
        j0.WaitForAutocapture waitForAutocapture = objC instanceof j0.WaitForAutocapture ? (j0.WaitForAutocapture) objC : null;
        if (waitForAutocapture != null) {
            action.e(j0.WaitForAutocapture.L(waitForAutocapture, null, null, null, null, null, 0, null, d2Var.videoCaptureHelper.d() ? ip.x.Connected : ip.x.Disconnected, null, null, false, false, null, null, null, 32639, null));
        }
        return Unit.f21506a;
    }

    public static final Unit r0(ln.k.a aVar, final d2 d2Var, final j0 j0Var) {
        aVar.d().a(ln.z.d(d2Var, null, new Function1() { // from class: vo.n1
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return d2.s0(this.f34855a, j0Var, (ln.r.c) obj);
            }
        }, 1, null));
        return Unit.f21506a;
    }

    public static final Unit s0(d2 d2Var, j0 j0Var, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        d2Var.documentSelectWorker.g();
        action.e(j0.ChooseCaptureMethod.H((j0.ChooseCaptureMethod) j0Var, null, null, null, 0, null, null, true, null, null, 447, null));
        return Unit.f21506a;
    }

    public static final Unit t0(ln.k.a aVar, d2 d2Var) {
        b3.S(aVar, d2Var.videoCaptureHelper);
        return Unit.f21506a;
    }

    public static final Unit u0(ln.k.a aVar) {
        b3.v(aVar);
        return Unit.f21506a;
    }

    public static final void v0(final ln.k.a aVar, final d2 d2Var, final b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        aVar.d().a(ln.z.d(d2Var, null, new Function1() { // from class: vo.p1
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return d2.w0(this.f34946a, aVar, it, (ln.r.c) obj);
            }
        }, 1, null));
    }

    public static final Unit w0(d2 d2Var, ln.k.a aVar, b bVar, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        d2Var.b1(aVar, bVar);
        return Unit.f21506a;
    }

    public static final Unit x0(ln.k.a aVar, d2 d2Var, final j0 j0Var) {
        aVar.d().a(ln.z.d(d2Var, null, new Function1() { // from class: vo.j1
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return d2.y0(j0Var, (ln.r.c) obj);
            }
        }, 1, null));
        return Unit.f21506a;
    }

    public static final Unit y0(j0 j0Var, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(j0.ChooseCaptureMethod.H((j0.ChooseCaptureMethod) j0Var, null, null, null, 0, null, null, false, null, null, 255, null));
        return Unit.f21506a;
    }

    public static final Unit z0(a aVar, j0 j0Var, ln.k.a aVar2, d2 d2Var) {
        x3.h(aVar, (j0.j) j0Var, aVar2, d2Var.videoCaptureHelper, d2Var.trackingEventsLogger);
        return Unit.f21506a;
    }

    public final String Z(a.Strings strings, IdConfig.e eVar, String str, String str2) {
        String strA = strings.getChooseCaptureMethodBody().a(str2, str, eVar);
        if (strA != null) {
            return strA;
        }
        String string = this.applicationContext.getString(jq.g.f20888r);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    public final String a0(a.Strings strings, IdConfig.e eVar, String str, String str2) {
        String strA = strings.getChooseCaptureMethodTitle().a(str2, str, eVar);
        if (strA != null) {
            return strA;
        }
        String string = this.applicationContext.getString(jq.g.f20889s);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    public final String b0(a.Strings strings, IdConfig.e eVar, String str, String str2) {
        String strA = strings.getConfirmCaptureTitle().a(str2, str, eVar);
        return strA == null ? BuildConfig.FLAVOR : strA;
    }

    public final void b1(ln.k<? super a, j0, ? extends b, ? extends Object>.a context, b output) {
        b3.b0(context, output, this.videoCaptureHelper);
    }

    public final String c0(a.Strings strings, IdConfig.e eVar) {
        String str = strings.w0().get(eVar);
        if (str != null) {
            return str;
        }
        String string = this.applicationContext.getString(jq.g.f20892v);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    public final void c1(ln.r<? super a, j0, ? extends b>.c updater) {
        updater.d(new b.c(new InternalErrorInfo.WebRtcIntegrationErrorInfo("WebRTC is listed as the preferred or only capture method, but it has not been configured for this project.")));
    }

    public final String d0(a.Strings strings, IdConfig.e eVar) {
        String str = strings.B0().get(eVar);
        if (str != null) {
            return str;
        }
        String string = this.applicationContext.getString(jq.g.f20893w);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @Override // ln.k
    @Nullable
    /* JADX INFO: renamed from: d1, reason: merged with bridge method [inline-methods] */
    public Snapshot g(@NotNull j0 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (g0(state)) {
            return null;
        }
        return nn.r.a(state);
    }

    public final String e0(j0 j0Var) {
        if ((j0Var instanceof j0.CountdownToCapture) || (j0Var instanceof j0.ReviewCapturedImage) || (j0Var instanceof j0.WaitForAutocapture) || (j0Var instanceof j0.FinalizeLocalVideoCapture) || (j0Var instanceof j0.f) || (j0Var instanceof j0.HolographicTorchDelay)) {
            return "camera_screen";
        }
        if ((j0Var instanceof j0.ChooseCaptureMethod) || (j0Var instanceof j0.ReviewSelectedImage) || (j0Var instanceof j0.ShowInstructions) || (j0Var instanceof j0.Submit) || (j0Var instanceof j0.AutoClassificationError) || (j0Var instanceof j0.AutoClassificationManualSelect) || (j0Var instanceof j0.RestartStep)) {
            return null;
        }
        throw new zt.l();
    }

    public final boolean e1(j0 j0Var) {
        if ((j0Var instanceof j0.CountdownToCapture) || (j0Var instanceof j0.f) || (j0Var instanceof j0.WaitForAutocapture) || (j0Var instanceof j0.FinalizeLocalVideoCapture) || (j0Var instanceof j0.HolographicTorchDelay)) {
            return true;
        }
        if ((j0Var instanceof j0.ChooseCaptureMethod) || (j0Var instanceof j0.ReviewSelectedImage) || (j0Var instanceof j0.ShowInstructions) || (j0Var instanceof j0.Submit) || (j0Var instanceof j0.ReviewCapturedImage) || (j0Var instanceof j0.AutoClassificationError) || (j0Var instanceof j0.AutoClassificationManualSelect) || (j0Var instanceof j0.RestartStep)) {
            return false;
        }
        throw new zt.l();
    }

    @Override // ln.k
    @NotNull
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public j0 d(@NotNull a props, @Nullable Snapshot snapshot) {
        Intrinsics.checkNotNullParameter(props, "props");
        j0 j0Var = null;
        Parcelable parcelable = null;
        if (snapshot != null) {
            ew.h hVarB = snapshot.b();
            if (hVarB.I() <= 0) {
                hVarB = null;
            }
            if (hVarB != null) {
                Parcel parcelObtain = Parcel.obtain();
                Intrinsics.checkNotNullExpressionValue(parcelObtain, "obtain()");
                byte[] bArrO = hVarB.O();
                parcelObtain.unmarshall(bArrO, 0, bArrO.length);
                parcelObtain.setDataPosition(0);
                Parcelable parcelable2 = parcelObtain.readParcelable(Snapshot.class.getClassLoader());
                Intrinsics.checkNotNull(parcelable2);
                Intrinsics.checkNotNullExpressionValue(parcelable2, "parcel.readParcelable<T>…class.java.classLoader)!!");
                parcelObtain.recycle();
                parcelable = parcelable2;
            }
            j0Var = (j0) parcelable;
        }
        if (j0Var != null) {
            return j0Var;
        }
        if (props.getAutoClassificationConfig().getIsEnabled() && !this.videoCaptureHelper.c(props)) {
            if (props.u()) {
                return new j0.ChooseCaptureMethod(new i3.SideIdPart(IdConfig.e.Front), p001kotlin.collections.p.k(), p001kotlin.collections.p.k(), 0, props.getCountryCode(), new vo.f.AutoClassifyConfig(props.getAutoClassificationConfig()), false, null, null, 320, null);
            }
            return new j0.WaitForAutocapture(new i3.SideIdPart(IdConfig.e.Front), p001kotlin.collections.p.k(), new vo.f.AutoClassifyConfig(props.getAutoClassificationConfig()), props.getDesignVersion() == i.K0000 ? y3.b.a.Hidden : y3.b.a.Enabled, p001kotlin.collections.p.k(), 0, null, ip.x.Disconnected, props.getVideoCaptureConfig().getWebRtcJwt(), null, false, false, props.getCountryCode(), null, null, 28160, null);
        }
        return new j0.ShowInstructions(null, null, null, null, 0, props.getCountryCode(), null, null, 223, null);
    }

    public final kr.m f1(Object obj, j0 j0Var) {
        return new kr.m(obj, j0Var.getDidGoBack() ? kr.l.SLIDE_OUT : kr.l.SLIDE_IN);
    }

    public final boolean g0(j0 state) {
        while (state != null) {
            if ((state instanceof j0.AutoClassificationError) || (state instanceof j0.AutoClassificationManualSelect)) {
                return true;
            }
            state = state.getBackState();
        }
        return false;
    }

    public final nn.m<Object> h0(Object obj, String str) {
        return new nn.m<>(obj, str);
    }

    @Override // ln.k
    @NotNull
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public Object f(@NotNull a renderProps, @NotNull j0 renderState, @NotNull ln.k<? super a, j0, ? extends b, ? extends Object>.a context) {
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        Object objJ0 = j0(renderProps, renderState, context);
        String strE0 = e0(renderState);
        if (strE0 != null) {
            objJ0 = h0(objJ0, strE0);
        }
        if (!e1(renderState)) {
            context.b("close_camera", new d(null));
        }
        if (!this.videoCaptureHelper.f(renderProps) && xq.g.e(this.applicationContext)) {
            context.b("output_webrtc_error", new e(context, this, null));
        }
        return f1(objJ0, renderState);
    }

    /* JADX WARN: Code duplicated, block: B:76:0x025e  */
    public final Object j0(final a renderProps, final j0 renderState, final ln.k<? super a, j0, ? extends b, ? extends Object>.a context) {
        dr.h takePhoto;
        RemoteImage idFrontPictograph;
        RemoteImage remoteImage;
        int i10;
        xu.c<? extends j0> cVarB = p001kotlin.jvm.internal.d0.b(renderState.getClass());
        final ln.h<? super b> hVar = new ln.h() { // from class: vo.p0
            @Override // ln.h
            public final void a(Object obj) {
                d2.v0(context, this, (d2.b) obj);
            }
        };
        ir.b.d(this.navigationStateManager, renderProps.getBackStepEnabled(), renderProps.getCancelButtonEnabled(), renderProps.getIsEnabled() && !(renderState instanceof j0.Submit), false, 8, null);
        boolean z10 = renderState instanceof j0.AutoClassificationError;
        if (z10) {
            takePhoto = dr.h.a.f12631a;
        } else if (renderState instanceof j0.AutoClassificationManualSelect) {
            takePhoto = dr.h.b.f12632a;
        } else if (renderState instanceof j0.ShowInstructions) {
            takePhoto = dr.h.C0231h.f12638a;
        } else if (renderState instanceof j0.ChooseCaptureMethod) {
            takePhoto = new dr.h.Prompt(((j0.ChooseCaptureMethod) renderState).getPartIndex());
        } else if ((renderState instanceof j0.WaitForAutocapture) || (renderState instanceof j0.CountdownToCapture) || (renderState instanceof j0.FinalizeLocalVideoCapture) || (renderState instanceof j0.f) || (renderState instanceof j0.HolographicTorchDelay)) {
            takePhoto = new dr.h.TakePhoto(renderState.getPartIndex());
        } else if (renderState instanceof j0.ReviewCapturedImage) {
            takePhoto = new dr.h.Check(((j0.ReviewCapturedImage) renderState).getPartIndex());
        } else if (renderState instanceof j0.ReviewSelectedImage) {
            takePhoto = new dr.h.CheckUpload(((j0.ReviewSelectedImage) renderState).getPartIndex());
        } else if (renderState instanceof j0.Submit) {
            takePhoto = dr.h.e.f12635a;
        } else {
            if (!(renderState instanceof j0.RestartStep)) {
                throw new zt.l();
            }
            takePhoto = dr.h.g.f12637a;
        }
        this.externalEventLogger.c(new dr.i.c(renderProps.getFromStep(), takePhoto));
        if (!Intrinsics.c(this.previousStateClass, cVarB)) {
            TrackingEventsLogger.logInquiryPageViewEvent$default(this.trackingEventsLogger, renderProps.getFromStep(), takePhoto.toString(), false, 4, null);
            if (Intrinsics.c(cVarB, p001kotlin.jvm.internal.d0.b(j0.WaitForAutocapture.class))) {
                TrackingEventsLogger trackingEventsLogger = this.trackingEventsLogger;
                GovIdCaptureState govIdCaptureState = GovIdCaptureState.LOADING;
                IdConfig.e eVarQ = b3.Q(renderState.getCurrentPart());
                TrackingEventsLogger.logGovernmentIdStateEvent$default(trackingEventsLogger, new GovernmentIdStateEventData(govIdCaptureState, null, eVarQ != null ? b3.d0(eVarQ) : null, null, 8, null), false, 2, null);
            }
            this.previousStateClass = cVarB;
        }
        if (renderState instanceof j0.ShowInstructions) {
            context.b("check_if_single_id_class", new f(renderProps, renderState, this, context, null));
            String title = renderProps.getStrings().getTitle();
            String prompt = renderProps.getStrings().getPrompt();
            String choose = renderProps.getStrings().getChoose();
            String instructionsDisclaimer = renderProps.getStrings().getInstructionsDisclaimer();
            List<EnabledIdClass> listN = b3.N(renderProps);
            h hVar2 = new h(renderState, this, context, renderProps);
            NextStep.GovernmentId.AssetConfig.SelectPage selectPage = renderProps.getAssetConfig().getSelectPage();
            StepStyles.GovernmentIdStepStyle styles = renderProps.getStyles();
            return new y3.e(title, prompt, choose, instructionsDisclaimer, listN, this.navigationStateManager.b(), hVar2, styles, selectPage, renderProps.getIsEnabled(), new Function0() { // from class: vo.r0
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return d2.N0(context, this);
                }
            }, new Function0() { // from class: vo.u0
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return d2.U0(context);
                }
            }, ((j0.ShowInstructions) renderState).getError(), new Function0() { // from class: vo.v0
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return d2.V0(context, this, renderState);
                }
            }, this.themeManager.a().getIconStyle(), renderProps.getStrings().getSelectPageNavBarTitle(), null, 65536, null);
        }
        if (renderState instanceof j0.ChooseCaptureMethod) {
            j0.ChooseCaptureMethod chooseCaptureMethod = (j0.ChooseCaptureMethod) renderState;
            final i3.SideIdPart currentPart = chooseCaptureMethod.getCurrentPart();
            if (chooseCaptureMethod.getChoosingDocumentToUpload()) {
                ln.w.l(context, this.documentSelectWorker, p001kotlin.jvm.internal.d0.k(j.class), BuildConfig.FLAVOR, new Function1() { // from class: vo.w0
                    @Override // p001kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return d2.k0(this.f35006a, currentPart, renderState, context, (j.a) obj);
                    }
                });
            }
            NextStep.GovernmentId.AssetConfig.PromptPage promptPage = renderProps.getAssetConfig().getPromptPage();
            List<CaptureOptionNativeMobile> listN2 = renderProps.n();
            String strA0 = a0(renderProps.getStrings(), currentPart.getSide(), vo.g.b(chooseCaptureMethod.getCaptureConfig()), chooseCaptureMethod.getCountryCode());
            String strZ = Z(renderProps.getStrings(), currentPart.getSide(), vo.g.b(chooseCaptureMethod.getCaptureConfig()), chooseCaptureMethod.getCountryCode());
            String chooseCaptureMethodCameraButton = renderProps.getStrings().getChooseCaptureMethodCameraButton();
            String chooseCaptureMethodUploadButton = renderProps.getStrings().getChooseCaptureMethodUploadButton();
            ir.a aVarB = this.navigationStateManager.b();
            Function0 function0 = new Function0() { // from class: vo.x0
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return d2.n0(context, this, renderState, renderProps);
                }
            };
            Function0 function1 = new Function0() { // from class: vo.y0
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return d2.r0(context, this, renderState);
                }
            };
            Function0 function2 = new Function0() { // from class: vo.z0
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return d2.t0(context, this);
                }
            };
            Function0 function3 = new Function0() { // from class: vo.b1
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return d2.u0(context);
                }
            };
            String error = chooseCaptureMethod.getError();
            Function0 function4 = new Function0() { // from class: vo.c1
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return d2.x0(context, this, renderState);
                }
            };
            StepStyles.GovernmentIdStepStyle styles2 = renderProps.getStyles();
            IdConfig.e side = chooseCaptureMethod.getCurrentPart().getSide();
            int[] iArr = c.f34603a;
            int i11 = iArr[side.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 != 5) {
                                throw new zt.l();
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
            } else if (vo.g.a(chooseCaptureMethod.getCaptureConfig()) == dp.e.Passport) {
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
                i10 = (i12 == 2 || i12 == 4) ? p3.f34951d : p3.f34952e;
            } else {
                i10 = vo.g.a(chooseCaptureMethod.getCaptureConfig()) == dp.e.Passport ? p3.f34953f : p3.f34952e;
            }
            int i13 = i10;
            String requestPageNavBarTitle = renderProps.getStrings().getRequestPageNavBarTitle();
            if (requestPageNavBarTitle == null) {
                requestPageNavBarTitle = renderProps.getStrings().getCapturePageNavBarTitle();
            }
            return new y3.c(listN2, strA0, strZ, chooseCaptureMethodCameraButton, chooseCaptureMethodUploadButton, aVarB, function0, function1, function2, function3, error, function4, styles2, remoteImage, i13, requestPageNavBarTitle, null, 65536, null);
        }
        if (renderState instanceof j0.WaitForAutocapture) {
            return this.captureRenderer.n0(renderProps, (j0.WaitForAutocapture) renderState, context, this.videoCaptureHelper, hVar);
        }
        if (renderState instanceof j0.CountdownToCapture) {
            return this.captureRenderer.Y(renderProps, (j0.CountdownToCapture) renderState, context, this.videoCaptureHelper, hVar);
        }
        if (renderState instanceof j0.ReviewCapturedImage) {
            j0.ReviewCapturedImage reviewCapturedImage = (j0.ReviewCapturedImage) renderState;
            TrackingEventsLogger.logGovernmentIdStateEvent$default(this.trackingEventsLogger, new GovernmentIdStateEventData(GovIdCaptureState.CONFIRMING, null, b3.d0(reviewCapturedImage.getCurrentPart().getSide()), null, 8, null), false, 2, null);
            final vo.f captureConfig = reviewCapturedImage.getCaptureConfig();
            IdConfig.IdSideConfig idSideConfigD = vo.g.d(captureConfig, reviewCapturedImage.getCurrentPart().getSide());
            Frame frame = (Frame) CollectionsKt.d0(reviewCapturedImage.getIdForReview().j3());
            if (reviewCapturedImage.getSubmittingForAutoClassification()) {
                x3.j(renderProps, (j0.j) renderState, context, this.videoCaptureHelper, this.autoClassifyWorkerFactory);
            }
            return new AlertContainerScreen(fq.y1.c(new y3.i(this.imageLoader, b3.M(renderProps.getStrings(), reviewCapturedImage.getCurrentPart().getSide(), vo.g.b(reviewCapturedImage.getCaptureConfig()), reviewCapturedImage.getCountryCode()), renderProps.getStrings().getCaptureDisclaimer(), idSideConfigD.getOverlay(), frame.getAbsoluteFilePath(), reviewCapturedImage.getCurrentPart().getSide(), vo.g.a(captureConfig), this.navigationStateManager.b(), new Function0() { // from class: vo.a1
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return d2.z0(renderProps, renderState, context, this);
                }
            }, renderProps.getStrings().getButtonSubmit(), new Function0() { // from class: vo.l1
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return d2.A0(this.f34817a, context, renderState, renderProps, captureConfig);
                }
            }, renderProps.getStrings().getButtonRetake(), b0(renderProps.getStrings(), reviewCapturedImage.getCurrentPart().getSide(), vo.g.b(reviewCapturedImage.getCaptureConfig()), reviewCapturedImage.getCountryCode()), new Function0() { // from class: vo.w1
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return d2.E0(hVar);
                }
            }, renderProps.getStyles(), reviewCapturedImage.getError(), new Function0() { // from class: vo.x1
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return d2.F0(context, this, renderState);
                }
            }, renderProps.getAssetConfig().getCapturePage(), renderProps.getIsEnabled() && !reviewCapturedImage.getSubmittingForAutoClassification(), reviewCapturedImage.getSubmittingForAutoClassification(), renderProps.getReviewCaptureButtonsAxis(), renderProps.getDesignVersion(), false, renderProps.getStrings().getCheckPageNavBarTitle(), null, 20971520, null)), null, 2, null);
        }
        if (!(renderState instanceof j0.ReviewSelectedImage)) {
            if (renderState instanceof j0.Submit) {
                j0.Submit submit = (j0.Submit) renderState;
                ln.w.l(context, this.submitVerificationWorkerFactory.a(renderProps.getSessionToken(), renderProps.getInquiryId(), renderProps.getFromComponent(), renderProps.getFromStep(), submit.getGovernmentIdRequestArguments(), submit.getWebRtcObjectId(), submit.getCameraProperties()), p001kotlin.jvm.internal.d0.k(dp.f.class), BuildConfig.FLAVOR, new Function1() { // from class: vo.q0
                    @Override // p001kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return d2.O0(this.f34955a, context, (dp.f.b) obj);
                    }
                });
                ir.b.d(this.navigationStateManager, false, false, false, false, 12, null);
                return new y3.k(renderProps.getStrings().getProcessingTitle(), renderProps.getStrings().getProcessingDescription(), renderProps.getStyles(), renderProps.getAssetConfig().getPendingPage(), this.navigationStateManager.b(), new Function0() { // from class: vo.s0
                    @Override // p001kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return d2.S0(this.f34961a, context);
                    }
                }, new Function0() { // from class: vo.t0
                    @Override // p001kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return d2.T0(this.f34968a, context);
                    }
                }, renderProps.getPendingPageTextVerticalPosition(), false, renderProps.getStrings().getPendingPageNavBarTitle(), null, 1280, null);
            }
            if (renderState instanceof j0.FinalizeLocalVideoCapture) {
                return this.localVideoCaptureRenderer.i(renderProps, (j0.FinalizeLocalVideoCapture) renderState, context, this.videoCaptureHelper);
            }
            if (renderState instanceof j0.f) {
                return this.webRtcRenderer.j(renderProps, (j0.f) renderState, context, this.videoCaptureHelper);
            }
            if (renderState instanceof j0.HolographicTorchDelay) {
                return this.captureRenderer.j0(renderProps, (j0.HolographicTorchDelay) renderState, context, this.videoCaptureHelper, hVar);
            }
            if (z10) {
                return this.autoClassificationRenderer.n(renderProps, (j0.AutoClassificationError) renderState, context, this.videoCaptureHelper);
            }
            if (renderState instanceof j0.AutoClassificationManualSelect) {
                return this.autoClassificationRenderer.t(renderProps, (j0.AutoClassificationManualSelect) renderState, context, this.videoCaptureHelper);
            }
            if (!(renderState instanceof j0.RestartStep)) {
                throw new zt.l();
            }
            context.b("restart_step", new g(context, d(renderProps, null), null));
            return new y3.h(null, 1, null);
        }
        j0.ReviewSelectedImage reviewSelectedImage = (j0.ReviewSelectedImage) renderState;
        TrackingEventsLogger.logGovernmentIdStateEvent$default(this.trackingEventsLogger, new GovernmentIdStateEventData(GovIdCaptureState.CONFIRMING, null, b3.d0(reviewSelectedImage.getCurrentPart().getSide()), null, 8, null), false, 2, null);
        i3.SideIdPart currentPart2 = reviewSelectedImage.getCurrentPart();
        if (reviewSelectedImage.getSubmittingForAutoClassification()) {
            x3.j(renderProps, (j0.j) renderState, context, this.videoCaptureHelper, this.autoClassifyWorkerFactory);
        }
        l6.s sVar = this.imageLoader;
        String strD0 = d0(renderProps.getStrings(), currentPart2.getSide());
        String strC0 = c0(renderProps.getStrings(), currentPart2.getSide());
        String reviewSelectedImageConfirmButton = renderProps.getStrings().getReviewSelectedImageConfirmButton();
        String reviewSelectedImageChooseAnotherButton = renderProps.getStrings().getReviewSelectedImageChooseAnotherButton();
        String absoluteFilePath = ((Frame) CollectionsKt.d0(reviewSelectedImage.getIdForReview().j3())).getAbsoluteFilePath();
        String mimeType = ((Frame) CollectionsKt.d0(reviewSelectedImage.getIdForReview().j3())).getMimeType();
        String fileName = reviewSelectedImage.getFileName();
        ir.a aVarB2 = this.navigationStateManager.b();
        String error2 = reviewSelectedImage.getError();
        boolean submittingForAutoClassification = reviewSelectedImage.getSubmittingForAutoClassification();
        StepStyles.GovernmentIdStepStyle styles3 = renderProps.getStyles();
        String reviewUploadPageNavBarTitle = renderProps.getStrings().getReviewUploadPageNavBarTitle();
        if (reviewUploadPageNavBarTitle == null) {
            reviewUploadPageNavBarTitle = renderProps.getStrings().getCapturePageNavBarTitle();
        }
        return new y3.j(sVar, strD0, strC0, reviewSelectedImageConfirmButton, reviewSelectedImageChooseAnotherButton, absoluteFilePath, mimeType, fileName, aVarB2, new Function0() { // from class: vo.y1
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return d2.H0(renderProps, renderState, context, this);
            }
        }, new Function0() { // from class: vo.z1
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return d2.I0(context, this);
            }
        }, new Function0() { // from class: vo.a2
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return d2.J0(context, this);
            }
        }, new Function0() { // from class: vo.b2
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return d2.K0(context);
            }
        }, error2, new Function0() { // from class: vo.c2
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return d2.L0(context, this, renderState);
            }
        }, styles3, submittingForAutoClassification, reviewUploadPageNavBarTitle, null, 262144, null);
    }
}
