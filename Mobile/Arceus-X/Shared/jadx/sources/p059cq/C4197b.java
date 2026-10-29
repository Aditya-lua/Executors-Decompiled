package p059cq;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.mlkit.common.MlKitException;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import com.withpersona.sdk2.inquiry.selfie.SelfieType;
import com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader;
import com.withpersona.sdk2.inquiry.selfie.network.SelfieStepData;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import fo.InterfaceC5720a;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kn.EnumC7638a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7688j0;
import kotlin.collections.C7699p;
import kotlin.collections.C7701q;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C7764d;
import kotlin.text.StringsKt;
import mq.InterfaceC8644a;
import nu.C9579j;
import nu.InterfaceC9575h;
import nu.InterfaceC9577i;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p083dq.C4658a;
import p229jt.C7345l;
import p229jt.C7347n;
import p229jt.C7348o;
import p231jv.C7396x;
import p276ln.InterfaceC8169a;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p394qt.C10708b;
import p394qt.InterfaceC10707a;
import p420rq.InterfaceC11067a;
import p499vr.InterfaceC12257h;
import p581ym.InterfaceC13222o;
import pt.AbstractC10342d;
import pt.AbstractC10351m;
import pt.C10340b;
import pt.C10350l;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: cq.b */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0004@^-+BË\u0001\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\u0006\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\u000e\b\u0001\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0001\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\b\u0001\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010$\u001a\u00020#\u0012\b\b\u0001\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u001b\u0010+\u001a\u00020*2\n\u0010)\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b+\u0010,J\u001b\u0010-\u001a\u00020*2\n\u0010)\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b-\u0010.J\u0015\u00100\u001a\b\u0012\u0004\u0012\u00020\u00020/H\u0016¢\u0006\u0004\b0\u00101J0\u0010:\u001a\b\u0012\u0004\u0012\u00020908*\u0002022\u0006\u00104\u001a\u0002032\f\u00107\u001a\b\u0012\u0004\u0012\u00020605H\u0082@¢\u0006\u0004\b:\u0010;J!\u0010<\u001a\u000209*\u00020\u00132\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b<\u0010=R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010>R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010?R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010?R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\u0010\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010?R\u0014\u0010\u0011\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010?R\u0014\u0010\u0012\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010?R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010?R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0016\u0010\"\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010?R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]¨\u0006_"}, m31665d2 = {"Lcq/b;", "Lym/o;", "Lcq/b$d;", "Lvr/h;", "Landroid/content/Context;", "context", "", "sessionToken", "inquiryId", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;", "selfieType", "", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "selfies", "Lcq/a;", NotificationCompat.CATEGORY_SERVICE, "fromStep", "fromComponent", "fieldKeySelfie", "Lmq/a;", "dataCollector", "Lfo/a;", "fallbackModeManager", "Lrq/a;", "imageHelper", "webRtcObjectId", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "Lln/a;", "cameraStatsManager", "", "startSelfieTimestamp", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "fileUploadUrl", "Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;", "directFileUploader", "Ldq/a;", "selfiePoseManager", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;Ljava/util/List;Lcq/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmq/a;Lfo/a;Lrq/a;Ljava/lang/String;Lcom/withpersona/sdk2/camera/CameraProperties;Lln/a;JLcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;Ldq/a;)V", "otherWorker", "", "b", "(Lym/o;)Z", "c", "(Lvr/h;)Z", "Lnu/h;", "run", "()Lnu/h;", "Ljava/io/File;", "Lcq/b$b;", "fileType", "", "Lokhttp3/MultipartBody$Part;", "bodyParts", "Ljt/n;", "", "y", "(Ljava/io/File;Lcq/b$b;Ljava/util/List;Lnt/b;)Ljava/lang/Object;", "x", "(Lmq/a;Ljava/util/List;)V", "Landroid/content/Context;", "Ljava/lang/String;", "d", "e", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;", "f", "Ljava/util/List;", "g", "Lcq/a;", "h", "i", "j", "k", "Lmq/a;", "l", "Lfo/a;", "m", "Lrq/a;", "n", "o", "Lcom/withpersona/sdk2/camera/CameraProperties;", "p", "Lln/a;", "q", "J", "r", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "s", "t", "Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;", "u", "Ldq/a;", "a", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C4197b implements InterfaceC13222o<d>, InterfaceC12257h<d> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final String sessionToken;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final String inquiryId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final SelfieType selfieType;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final List<Selfie> selfies;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC4196a service;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final String fromStep;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final String fromComponent;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final String fieldKeySelfie;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC8644a dataCollector;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC5720a fallbackModeManager;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC11067a imageHelper;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    public final String webRtcObjectId;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final CameraProperties cameraProperties;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC8169a cameraStatsManager;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public final long startSelfieTimestamp;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @Nullable
    public final String fileUploadUrl;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    public final DirectFileUploader directFileUploader;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    public final C4658a selfiePoseManager;

    /* JADX INFO: renamed from: cq.b$a */
    @Metadata(m31664d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0089\u0001\u0010\u0016\u001a\u00020\u00152\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0011\u001a\u00020\u00102\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018À\u0006\u0003"}, m31665d2 = {"Lcq/b$a;", "", "", "sessionToken", "inquiryId", "fromComponent", "fromStep", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;", "selfieType", "fieldKeySelfie", "", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "selfies", "webRtcObjectId", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "", "startSelfieTimestamp", "fileUploadUrl", "Ldq/a;", "selfiePoseManager", "Lcq/b;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/withpersona/sdk2/camera/CameraProperties;JLjava/lang/String;Ldq/a;)Lcq/b;", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public interface a {
        @NotNull
        /* JADX INFO: renamed from: a */
        C4197b mo21719a(@NotNull String sessionToken, @NotNull String inquiryId, @NotNull String fromComponent, @NotNull String fromStep, @NotNull SelfieType selfieType, @NotNull String fieldKeySelfie, @NotNull List<? extends Selfie> selfies, @Nullable String webRtcObjectId, @NotNull CameraProperties cameraProperties, long startSelfieTimestamp, @Nullable String fileUploadUrl, @NotNull C4658a selfiePoseManager);
    }

    /* JADX INFO: renamed from: cq.b$b */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m31665d2 = {"Lcq/b$b;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public enum b {
        IMAGE,
        VIDEO;


        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ InterfaceC10707a f17945d = C10708b.m40805a(m21720a());
    }

    /* JADX INFO: renamed from: cq.b$c */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31665d2 = {"Lcq/b$c;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "<init>", "()V", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class c extends RuntimeException {
        public c() {
            super("File upload returned invalid response.");
        }
    }

    /* JADX INFO: renamed from: cq.b$d */
    @Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m31665d2 = {"Lcq/b$d;", "", "<init>", "()V", "b", "a", "Lcq/b$d$a;", "Lcq/b$d$b;", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static abstract class d {

        /* JADX INFO: renamed from: cq.b$d$a, reason: from toString */
        @Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m31665d2 = {"Lcq/b$d$a;", "Lcq/b$d;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class Error extends d {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
            @NotNull
            public final InternalErrorInfo cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(@NotNull InternalErrorInfo cause) {
                super(null);
                Intrinsics.checkNotNullParameter(cause, "cause");
                this.cause = cause;
            }

            @NotNull
            /* JADX INFO: renamed from: a, reason: from getter */
            public final InternalErrorInfo getCause() {
                return this.cause;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && Intrinsics.m31980c(this.cause, ((Error) other).cause);
            }

            public int hashCode() {
                return this.cause.hashCode();
            }

            @NotNull
            public String toString() {
                return "Error(cause=" + this.cause + ")";
            }
        }

        /* JADX INFO: renamed from: cq.b$d$b */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m31665d2 = {"Lcq/b$d$b;", "Lcq/b$d;", "<init>", "()V", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class b extends d {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final b f17947a = new b();

            public b() {
                super(null);
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: cq.b.d.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public d() {
        }
    }

    /* JADX INFO: renamed from: cq.b$e */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class e {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f17948a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.IMAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f17948a = iArr;
        }
    }

    /* JADX INFO: renamed from: cq.b$f */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lnu/i;", "Lcq/b$d;", "", "<anonymous>", "(Lnu/i;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.selfie.network.SubmitVerificationWorker$run$1", m39664f = "SubmitVerificationWorker.kt", m39665l = {85, 87, 167, 172, 174, 197, MlKitException.CODE_SCANNER_CAMERA_PERMISSION_NOT_GRANTED, MlKitException.CODE_SCANNER_TASK_IN_PROGRESS, 324, 346, 347, 349, 350}, m39666m = "invokeSuspend")
    public static final class f extends AbstractC10351m implements Function2<InterfaceC9577i<? super d>, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: A */
        public Object f17949A;

        /* JADX INFO: renamed from: B */
        public Object f17950B;

        /* JADX INFO: renamed from: C */
        public Object f17951C;

        /* JADX INFO: renamed from: D */
        public Object f17952D;

        /* JADX INFO: renamed from: E */
        public Object f17953E;

        /* JADX INFO: renamed from: F */
        public int f17954F;

        /* JADX INFO: renamed from: G */
        public int f17955G;

        /* JADX INFO: renamed from: H */
        public int f17956H;

        /* JADX INFO: renamed from: I */
        public int f17957I;

        /* JADX INFO: renamed from: J */
        public int f17958J;

        /* JADX INFO: renamed from: K */
        public /* synthetic */ Object f17959K;

        /* JADX INFO: renamed from: t */
        public Object f17961t;

        /* JADX INFO: renamed from: u */
        public Object f17962u;

        /* JADX INFO: renamed from: v */
        public Object f17963v;

        /* JADX INFO: renamed from: w */
        public Object f17964w;

        /* JADX INFO: renamed from: x */
        public Object f17965x;

        /* JADX INFO: renamed from: y */
        public Object f17966y;

        /* JADX INFO: renamed from: z */
        public Object f17967z;

        /* JADX INFO: renamed from: cq.b$f$a */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Ljv/x;", "", "<anonymous>", "()Ljv/x;"}, m31666k = 3, m31667mv = {2, 2, 0})
        @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.selfie.network.SubmitVerificationWorker$run$1$2", m39664f = "SubmitVerificationWorker.kt", m39665l = {326, 331}, m39666m = "invokeSuspend")
        public static final class a extends AbstractC10351m implements Function1<InterfaceC9557b<? super C7396x<? extends Object>>, Object> {

            /* JADX INFO: renamed from: t */
            public int f17968t;

            /* JADX INFO: renamed from: u */
            public final /* synthetic */ C4197b f17969u;

            /* JADX INFO: renamed from: v */
            public final /* synthetic */ List<MultipartBody.Part> f17970v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C4197b c4197b, List<MultipartBody.Part> list, InterfaceC9557b<? super a> interfaceC9557b) {
                super(1, interfaceC9557b);
                this.f17969u = c4197b;
                this.f17970v = list;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(InterfaceC9557b<?> interfaceC9557b) {
                return new a(this.f17969u, this.f17970v, interfaceC9557b);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
            
                if (r6 == r0) goto L19;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
            
                if (r6 == r0) goto L19;
             */
            @Override // pt.AbstractC10339a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object objM38805e = C10047c.m38805e();
                int i10 = this.f17968t;
                if (i10 != 0) {
                    if (i10 == 1) {
                        C7348o.m30470b(obj);
                        return (C7396x) obj;
                    }
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                    return (C7396x) obj;
                }
                C7348o.m30470b(obj);
                if (this.f17969u.fallbackModeManager.mo22892b()) {
                    InterfaceC5720a interfaceC5720a = this.f17969u.fallbackModeManager;
                    String str = this.f17969u.sessionToken;
                    List<MultipartBody.Part> list = this.f17970v;
                    this.f17968t = 1;
                    obj = interfaceC5720a.mo22891a(str, list, this);
                } else {
                    InterfaceC4196a interfaceC4196a = this.f17969u.service;
                    String str2 = this.f17969u.sessionToken;
                    String str3 = this.f17969u.inquiryId;
                    List<MultipartBody.Part> list2 = this.f17970v;
                    this.f17968t = 2;
                    obj = interfaceC4196a.m21696b(str2, str3, list2, this);
                }
                return objM38805e;
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC9557b<? super C7396x<? extends Object>> interfaceC9557b) {
                return ((a) create(interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        /* JADX INFO: renamed from: cq.b$f$b */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* synthetic */ class b {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f17971a;

            /* JADX INFO: renamed from: b */
            public static final /* synthetic */ int[] f17972b;

            static {
                int[] iArr = new int[EnumC7638a.values().length];
                try {
                    iArr[EnumC7638a.Center.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC7638a.Left.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC7638a.Right.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EnumC7638a.Up.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[EnumC7638a.Down.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f17971a = iArr;
                int[] iArr2 = new int[CameraProperties.EnumC3397b.values().length];
                try {
                    iArr2[CameraProperties.EnumC3397b.Unknown.ordinal()] = 1;
                } catch (NoSuchFieldError unused6) {
                }
                f17972b = iArr2;
            }
        }

        public f(InterfaceC9557b<? super f> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            f fVar = C4197b.this.new f(interfaceC9557b);
            fVar.f17959K = obj;
            return fVar;
        }

        /* JADX DEBUG: Duplicate block (B:122:0x0779) to fix multi-entry loop: BACK_EDGE: B:122:0x0779 -> B:132:0x07db */
        /* JADX WARN: Code duplicated, block: B:102:0x0642  */
        /* JADX WARN: Code duplicated, block: B:103:0x0645  */
        /* JADX WARN: Code duplicated, block: B:23:0x02b8  */
        /* JADX WARN: Code duplicated, block: B:25:0x02e0  */
        /* JADX WARN: Code duplicated, block: B:28:0x031a  */
        /* JADX WARN: Code duplicated, block: B:31:0x032a  */
        /* JADX WARN: Code duplicated, block: B:36:0x0379  */
        /* JADX WARN: Code duplicated, block: B:38:0x0390  */
        /* JADX WARN: Code duplicated, block: B:40:0x0393  */
        /* JADX WARN: Code duplicated, block: B:42:0x0396  */
        /* JADX WARN: Code duplicated, block: B:44:0x0399  */
        /* JADX WARN: Code duplicated, block: B:46:0x039c  */
        /* JADX WARN: Code duplicated, block: B:47:0x039f  */
        /* JADX WARN: Code duplicated, block: B:49:0x03a5  */
        /* JADX WARN: Code duplicated, block: B:50:0x03a8  */
        /* JADX WARN: Code duplicated, block: B:51:0x03ab  */
        /* JADX WARN: Code duplicated, block: B:52:0x03ae  */
        /* JADX WARN: Code duplicated, block: B:55:0x03bf  */
        /* JADX WARN: Code duplicated, block: B:57:0x03c2  */
        /* JADX WARN: Code duplicated, block: B:59:0x03c5  */
        /* JADX WARN: Code duplicated, block: B:61:0x03c8  */
        /* JADX WARN: Code duplicated, block: B:63:0x03cb  */
        /* JADX WARN: Code duplicated, block: B:64:0x03ce  */
        /* JADX WARN: Code duplicated, block: B:66:0x03d4  */
        /* JADX WARN: Code duplicated, block: B:67:0x03d7  */
        /* JADX WARN: Code duplicated, block: B:68:0x03da  */
        /* JADX WARN: Code duplicated, block: B:69:0x03dd  */
        /* JADX WARN: Code duplicated, block: B:72:0x040f  */
        /* JADX WARN: Code duplicated, block: B:73:0x0412  */
        /* JADX WARN: Code duplicated, block: B:76:0x041b  */
        /* JADX WARN: Code duplicated, block: B:81:0x049d  */
        /* JADX WARN: Code duplicated, block: B:85:0x0556  */
        /* JADX WARN: Code duplicated, block: B:88:0x056d  */
        /* JADX WARN: Code duplicated, block: B:90:0x0571  */
        /* JADX WARN: Code duplicated, block: B:93:0x05cf  */
        /* JADX WARN: Code duplicated, block: B:95:0x05d6  */
        /* JADX WARN: Code duplicated, block: B:97:0x05ea  */
        /* JADX WARN: Code duplicated, block: B:98:0x05ed  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:104:0x0648 -> B:105:0x0650). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:115:0x0723 -> B:132:0x07db). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:130:0x07d5 -> B:131:0x07d8). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // pt.AbstractC10339a
        public final java.lang.Object invokeSuspend(java.lang.Object r41) {
            /*
                r40 = this;
                r0 = r40
                java.lang.Object r1 = r0.f17959K
                nu.i r1 = (nu.InterfaceC9577i) r1
                java.lang.Object r2 = p344ot.C10047c.m38805e()
                int r3 = r0.f17958J
                java.lang.String r4 = "][files][][type]"
                java.lang.String r5 = "][files][][capture-method]"
                java.lang.String r6 = "][files][][name]"
                java.lang.String r11 = ""
                java.lang.String r14 = "data[attributes][fields]["
                switch(r3) {
                    case 0: goto L25f;
                    case 1: goto L220;
                    case 2: goto L207;
                    case 3: goto L1a5;
                    case 4: goto L16a;
                    case 5: goto L12d;
                    case 6: goto Le0;
                    case 7: goto Lb2;
                    case 8: goto L84;
                    case 9: goto L78;
                    case 10: goto L59;
                    case 11: goto L4b;
                    case 12: goto L32;
                    case 13: goto L21;
                    default: goto L19;
                }
            L19:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L21:
                java.lang.Object r1 = r0.f17963v
                com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$NetworkErrorInfo r1 = (com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo.NetworkErrorInfo) r1
                java.lang.Object r1 = r0.f17962u
                com.withpersona.sdk2.inquiry.network.core.NetworkCallResult r1 = (com.withpersona.sdk2.inquiry.network.core.NetworkCallResult) r1
                java.lang.Object r1 = r0.f17961t
                java.util.List r1 = (java.util.List) r1
                p229jt.C7348o.m30470b(r41)
                goto Lc81
            L32:
                int r12 = r0.f17955G
                int r3 = r0.f17954F
                java.lang.Object r4 = r0.f17963v
                com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$NetworkErrorInfo r4 = (com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo.NetworkErrorInfo) r4
                java.lang.Object r5 = r0.f17962u
                com.withpersona.sdk2.inquiry.network.core.NetworkCallResult r5 = (com.withpersona.sdk2.inquiry.network.core.NetworkCallResult) r5
                java.lang.Object r6 = r0.f17961t
                java.util.List r6 = (java.util.List) r6
                p229jt.C7348o.m30470b(r41)
                r11 = r12
                r12 = r3
                r3 = r6
                r6 = r2
                goto Lc59
            L4b:
                java.lang.Object r3 = r0.f17962u
                com.withpersona.sdk2.inquiry.network.core.NetworkCallResult r3 = (com.withpersona.sdk2.inquiry.network.core.NetworkCallResult) r3
                java.lang.Object r4 = r0.f17961t
                java.util.List r4 = (java.util.List) r4
                p229jt.C7348o.m30470b(r41)
                r6 = r2
                goto Lc27
            L59:
                int r3 = r0.f17955G
                int r4 = r0.f17954F
                java.lang.Object r5 = r0.f17963v
                java.lang.Object r6 = r0.f17962u
                com.withpersona.sdk2.inquiry.network.core.NetworkCallResult r6 = (com.withpersona.sdk2.inquiry.network.core.NetworkCallResult) r6
                java.lang.Object r7 = r0.f17961t
                java.util.List r7 = (java.util.List) r7
                p229jt.C7348o.m30470b(r41)
                r39 = r6
                r6 = r2
                r2 = r3
                r3 = r39
                r39 = r5
                r5 = r4
                r4 = r7
                r7 = r39
                goto Lc06
            L78:
                java.lang.Object r3 = r0.f17961t
                java.util.List r3 = (java.util.List) r3
                p229jt.C7348o.m30470b(r41)
                r6 = r2
                r2 = r41
                goto Lb9a
            L84:
                int r3 = r0.f17954F
                java.lang.Object r15 = r0.f17950B
                java.lang.Throwable r15 = (java.lang.Throwable) r15
                java.lang.Object r15 = r0.f17967z
                java.io.File r15 = (java.io.File) r15
                java.lang.Object r15 = r0.f17966y
                com.withpersona.sdk2.inquiry.selfie.Selfie r15 = (com.withpersona.sdk2.inquiry.selfie.Selfie) r15
                java.lang.Object r15 = r0.f17964w
                java.util.Iterator r15 = (java.util.Iterator) r15
                java.lang.Object r7 = r0.f17963v
                cq.b r7 = (p059cq.C4197b) r7
                java.lang.Object r8 = r0.f17962u
                java.lang.Iterable r8 = (java.lang.Iterable) r8
                java.lang.Object r9 = r0.f17961t
                java.util.List r9 = (java.util.List) r9
                p229jt.C7348o.m30470b(r41)
                r21 = r5
                r27 = r6
                r19 = r11
                r16 = 4
                r17 = 2
                r6 = r2
                goto L7d8
            Lb2:
                int r3 = r0.f17954F
                java.lang.Object r7 = r0.f17950B
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                java.lang.Object r7 = r0.f17967z
                java.io.File r7 = (java.io.File) r7
                java.lang.Object r7 = r0.f17966y
                com.withpersona.sdk2.inquiry.selfie.Selfie r7 = (com.withpersona.sdk2.inquiry.selfie.Selfie) r7
                java.lang.Object r7 = r0.f17964w
                java.util.Iterator r7 = (java.util.Iterator) r7
                java.lang.Object r8 = r0.f17963v
                cq.b r8 = (p059cq.C4197b) r8
                java.lang.Object r9 = r0.f17962u
                java.lang.Iterable r9 = (java.lang.Iterable) r9
                java.lang.Object r15 = r0.f17961t
                java.util.List r15 = (java.util.List) r15
                p229jt.C7348o.m30470b(r41)
                r21 = r5
                r27 = r6
                r19 = r11
                r16 = 4
                r17 = 2
                r6 = r2
                goto L779
            Le0:
                int r3 = r0.f17956H
                int r7 = r0.f17955G
                int r8 = r0.f17954F
                java.lang.Object r9 = r0.f17967z
                java.io.File r9 = (java.io.File) r9
                java.lang.Object r15 = r0.f17966y
                com.withpersona.sdk2.inquiry.selfie.Selfie r15 = (com.withpersona.sdk2.inquiry.selfie.Selfie) r15
                java.lang.Object r10 = r0.f17965x
                java.lang.Object r12 = r0.f17964w
                java.util.Iterator r12 = (java.util.Iterator) r12
                java.lang.Object r13 = r0.f17963v
                cq.b r13 = (p059cq.C4197b) r13
                r18 = r1
                java.lang.Object r1 = r0.f17962u
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                r19 = r1
                java.lang.Object r1 = r0.f17961t
                java.util.List r1 = (java.util.List) r1
                p229jt.C7348o.m30470b(r41)
                r20 = r41
                jt.n r20 = (p229jt.C7347n) r20
                java.lang.Object r20 = r20.getValue()
                r16 = r8
                r8 = r3
                r3 = r16
                r21 = r5
                r27 = r6
                r5 = r20
                r16 = 4
                r17 = 2
                r6 = r2
                r2 = r7
                r20 = r15
                r15 = r9
                r9 = r1
                r1 = r18
                r18 = r19
                r19 = r11
            L12a:
                r7 = r13
                goto L71f
            L12d:
                r18 = r1
                int r1 = r0.f17954F
                java.lang.Object r3 = r0.f17953E
                java.lang.Throwable r3 = (java.lang.Throwable) r3
                java.lang.Object r3 = r0.f17951C
                java.util.List r3 = (java.util.List) r3
                java.lang.Object r3 = r0.f17950B
                java.lang.String r3 = (java.lang.String) r3
                java.lang.Object r3 = r0.f17949A
                java.lang.String r3 = (java.lang.String) r3
                java.lang.Object r3 = r0.f17967z
                java.io.File r3 = (java.io.File) r3
                java.lang.Object r3 = r0.f17966y
                com.withpersona.sdk2.inquiry.selfie.Selfie r3 = (com.withpersona.sdk2.inquiry.selfie.Selfie) r3
                java.lang.Object r3 = r0.f17964w
                java.util.Iterator r3 = (java.util.Iterator) r3
                java.lang.Object r7 = r0.f17963v
                cq.b r7 = (p059cq.C4197b) r7
                java.lang.Object r8 = r0.f17962u
                java.lang.Iterable r8 = (java.lang.Iterable) r8
                java.lang.Object r9 = r0.f17961t
                java.util.List r9 = (java.util.List) r9
                p229jt.C7348o.m30470b(r41)
                r12 = r2
                r27 = r6
                r10 = r7
                r19 = r11
                r2 = 5
                r16 = 4
                r7 = r1
                r1 = r18
                goto L648
            L16a:
                r18 = r1
                int r1 = r0.f17954F
                java.lang.Object r3 = r0.f17953E
                java.lang.Throwable r3 = (java.lang.Throwable) r3
                java.lang.Object r3 = r0.f17951C
                java.util.List r3 = (java.util.List) r3
                java.lang.Object r3 = r0.f17950B
                java.lang.String r3 = (java.lang.String) r3
                java.lang.Object r3 = r0.f17949A
                java.lang.String r3 = (java.lang.String) r3
                java.lang.Object r3 = r0.f17967z
                java.io.File r3 = (java.io.File) r3
                java.lang.Object r3 = r0.f17966y
                com.withpersona.sdk2.inquiry.selfie.Selfie r3 = (com.withpersona.sdk2.inquiry.selfie.Selfie) r3
                java.lang.Object r3 = r0.f17964w
                java.util.Iterator r3 = (java.util.Iterator) r3
                java.lang.Object r7 = r0.f17963v
                cq.b r7 = (p059cq.C4197b) r7
                java.lang.Object r8 = r0.f17962u
                java.lang.Iterable r8 = (java.lang.Iterable) r8
                java.lang.Object r9 = r0.f17961t
                java.util.List r9 = (java.util.List) r9
                p229jt.C7348o.m30470b(r41)
                r12 = r2
                r27 = r6
                r10 = r7
                r19 = r11
                r2 = 4
                r7 = r1
                r1 = r18
                goto L5d1
            L1a5:
                r18 = r1
                int r1 = r0.f17956H
                int r3 = r0.f17955G
                int r7 = r0.f17954F
                java.lang.Object r8 = r0.f17951C
                java.util.List r8 = (java.util.List) r8
                java.lang.Object r9 = r0.f17950B
                java.lang.String r9 = (java.lang.String) r9
                java.lang.Object r10 = r0.f17949A
                java.lang.String r10 = (java.lang.String) r10
                java.lang.Object r12 = r0.f17967z
                java.io.File r12 = (java.io.File) r12
                java.lang.Object r13 = r0.f17966y
                com.withpersona.sdk2.inquiry.selfie.Selfie r13 = (com.withpersona.sdk2.inquiry.selfie.Selfie) r13
                java.lang.Object r15 = r0.f17965x
                r19 = r1
                java.lang.Object r1 = r0.f17964w
                java.util.Iterator r1 = (java.util.Iterator) r1
                r20 = r1
                java.lang.Object r1 = r0.f17963v
                cq.b r1 = (p059cq.C4197b) r1
                r21 = r1
                java.lang.Object r1 = r0.f17962u
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                r22 = r1
                java.lang.Object r1 = r0.f17961t
                java.util.List r1 = (java.util.List) r1
                p229jt.C7348o.m30470b(r41)
                r23 = r41
                jt.n r23 = (p229jt.C7347n) r23
                java.lang.Object r23 = r23.getValue()
                r41 = r21
                r21 = r10
                r10 = r41
                r27 = r6
                r6 = r19
                r41 = r23
                r19 = r11
                r11 = r3
                r3 = r20
                r20 = r8
                r8 = r22
                r22 = r13
                r13 = r9
                r9 = r1
                r1 = r18
                r18 = r15
                r15 = r12
                r12 = r2
                goto L565
            L207:
                java.lang.Object r1 = r0.f17966y
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                java.lang.Object r1 = r0.f17965x
                java.io.File r1 = (java.io.File) r1
                java.lang.Object r1 = r0.f17964w
                com.withpersona.sdk2.inquiry.selfie.Selfie r1 = (com.withpersona.sdk2.inquiry.selfie.Selfie) r1
                java.lang.Object r1 = r0.f17962u
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.lang.Object r1 = r0.f17961t
                java.util.List r1 = (java.util.List) r1
                p229jt.C7348o.m30470b(r41)
                goto L376
            L220:
                r18 = r1
                int r1 = r0.f17956H
                int r3 = r0.f17955G
                int r7 = r0.f17954F
                java.lang.Object r8 = r0.f17967z
                java.io.File r8 = (java.io.File) r8
                java.lang.Object r9 = r0.f17966y
                com.withpersona.sdk2.inquiry.selfie.Selfie r9 = (com.withpersona.sdk2.inquiry.selfie.Selfie) r9
                java.lang.Object r10 = r0.f17965x
                java.lang.Object r12 = r0.f17964w
                java.util.Iterator r12 = (java.util.Iterator) r12
                java.lang.Object r13 = r0.f17963v
                cq.b r13 = (p059cq.C4197b) r13
                java.lang.Object r15 = r0.f17962u
                java.lang.Iterable r15 = (java.lang.Iterable) r15
                r19 = r1
                java.lang.Object r1 = r0.f17961t
                java.util.List r1 = (java.util.List) r1
                p229jt.C7348o.m30470b(r41)
                r20 = r41
                jt.n r20 = (p229jt.C7347n) r20
                java.lang.Object r20 = r20.getValue()
                r41 = r10
                r10 = r13
                r13 = r9
                r9 = r12
                r12 = r8
                r8 = r19
                r19 = r11
                r11 = r3
                r3 = r1
                r1 = r18
                goto L324
            L25f:
                r18 = r1
                p229jt.C7348o.m30470b(r41)
                cq.b r1 = p059cq.C4197b.this
                com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger r1 = p059cq.C4197b.m21713t(r1)
                com.withpersona.sdk2.inquiry.tracking.model.SelfieCaptureStateEventData r19 = new com.withpersona.sdk2.inquiry.tracking.model.SelfieCaptureStateEventData
                com.withpersona.sdk2.inquiry.tracking.model.SelfieCaptureState r20 = com.withpersona.sdk2.inquiry.tracking.model.SelfieCaptureState.SUBMITTING
                r24 = 8
                r25 = 0
                r21 = 0
                r22 = 0
                r23 = 0
                r19.<init>(r20, r21, r22, r23, r24, r25)
                r3 = r19
                r7 = 2
                r8 = 0
                r9 = 0
                com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger.logSelfieCaptureStateEvent$default(r1, r3, r8, r7, r9)
                cq.b r1 = p059cq.C4197b.this
                mq.a r3 = p059cq.C4197b.m21700g(r1)
                cq.b r7 = p059cq.C4197b.this
                java.util.List r7 = p059cq.C4197b.m21709p(r7)
                p059cq.C4197b.m21715v(r1, r3, r7)
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                cq.b r3 = p059cq.C4197b.this
                java.util.List r3 = p059cq.C4197b.m21709p(r3)
                java.lang.Iterable r3 = (java.lang.Iterable) r3
                java.lang.Iterable r3 = kotlin.collections.CollectionsKt.m31693S0(r3)
                cq.b r7 = p059cq.C4197b.this
                java.util.Iterator r8 = r3.iterator()
                r15 = r3
                r13 = r7
                r12 = r8
                r7 = 0
                r3 = r1
                r1 = r18
            L2b0:
                boolean r8 = r12.hasNext()
                java.lang.String r9 = "video"
                if (r8 == 0) goto L7f0
                java.lang.Object r10 = r12.next()
                r8 = r10
                kotlin.collections.IndexedValue r8 = (kotlin.collections.IndexedValue) r8
                r41 = r8
                int r8 = r41.getIndex()
                java.lang.Object r18 = r41.m31730b()
                r41 = r10
                r10 = r18
                com.withpersona.sdk2.inquiry.selfie.Selfie r10 = (com.withpersona.sdk2.inquiry.selfie.Selfie) r10
                r18 = r15
                java.io.File r15 = new java.io.File
                r19 = r11
                java.lang.String r11 = r10.getAbsoluteFilePath()
                r15.<init>(r11)
                boolean r11 = r10 instanceof com.withpersona.sdk2.inquiry.selfie.Selfie.SelfieImage
                if (r11 == 0) goto L659
                rq.a r9 = p059cq.C4197b.m21705l(r13)
                r0.f17959K = r1
                r0.f17961t = r3
                java.lang.Object r11 = pt.C10350l.m39676a(r18)
                r0.f17962u = r11
                r0.f17963v = r13
                r0.f17964w = r12
                java.lang.Object r11 = pt.C10350l.m39676a(r41)
                r0.f17965x = r11
                r0.f17966y = r10
                r0.f17967z = r15
                r11 = 0
                r0.f17949A = r11
                r0.f17950B = r11
                r0.f17951C = r11
                r0.f17952D = r11
                r0.f17953E = r11
                r0.f17954F = r7
                r11 = 0
                r0.f17955G = r11
                r0.f17956H = r8
                r11 = 1
                r0.f17958J = r11
                java.lang.Object r9 = r9.mo41740a(r15, r0)
                if (r9 != r2) goto L31a
            L317:
                r6 = r2
                goto Lc80
            L31a:
                r11 = r13
                r13 = r10
                r10 = r11
                r20 = r9
                r9 = r12
                r12 = r15
                r15 = r18
                r11 = 0
            L324:
                java.lang.Throwable r18 = p229jt.C7347n.m30463e(r20)
                if (r18 == 0) goto L379
                cq.b$d$a r4 = new cq.b$d$a
                com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$UnknownErrorInfo r5 = new com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$UnknownErrorInfo
                java.lang.String r6 = "Error processing image file in SubmitVerificationWorker."
                r5.<init>(r6)
                r4.<init>(r5)
                java.lang.Object r5 = pt.C10350l.m39676a(r1)
                r0.f17959K = r5
                java.lang.Object r3 = pt.C10350l.m39676a(r3)
                r0.f17961t = r3
                java.lang.Object r3 = pt.C10350l.m39676a(r15)
                r0.f17962u = r3
                java.lang.Object r3 = pt.C10350l.m39676a(r41)
                r0.f17963v = r3
                java.lang.Object r3 = pt.C10350l.m39676a(r13)
                r0.f17964w = r3
                java.lang.Object r3 = pt.C10350l.m39676a(r12)
                r0.f17965x = r3
                java.lang.Object r3 = pt.C10350l.m39676a(r18)
                r0.f17966y = r3
                r9 = 0
                r0.f17967z = r9
                r0.f17954F = r7
                r0.f17955G = r11
                r0.f17956H = r8
                r8 = 0
                r0.f17957I = r8
                r7 = 2
                r0.f17958J = r7
                java.lang.Object r1 = r1.emit(r4, r0)
                if (r1 != r2) goto L376
                goto L317
            L376:
                kotlin.Unit r1 = kotlin.Unit.f29331a
                return r1
            L379:
                r18 = r13
                com.withpersona.sdk2.inquiry.selfie.Selfie$SelfieImage r18 = (com.withpersona.sdk2.inquiry.selfie.Selfie.SelfieImage) r18
                kn.a r20 = r18.getPose()
                int[] r21 = p059cq.C4197b.f.b.f17971a
                int r20 = r20.ordinal()
                r22 = r13
                r13 = r21[r20]
                r20 = r15
                r15 = 1
                if (r13 == r15) goto L3ae
                r15 = 2
                if (r13 == r15) goto L3ab
                r15 = 3
                if (r13 == r15) goto L3a8
                r15 = 4
                if (r13 == r15) goto L3a5
                r15 = 5
                if (r13 != r15) goto L39f
                java.lang.String r13 = "down_photo"
                goto L3b0
            L39f:
                jt.l r1 = new jt.l
                r1.<init>()
                throw r1
            L3a5:
                java.lang.String r13 = "up_photo"
                goto L3b0
            L3a8:
                java.lang.String r13 = "right_photo"
                goto L3b0
            L3ab:
                java.lang.String r13 = "left_photo"
                goto L3b0
            L3ae:
                java.lang.String r13 = "center_photo"
            L3b0:
                kn.a r15 = r18.getPose()
                int r15 = r15.ordinal()
                r15 = r21[r15]
                r21 = r13
                r13 = 1
                if (r15 == r13) goto L3dd
                r13 = 2
                if (r15 == r13) goto L3da
                r13 = 3
                if (r15 == r13) goto L3d7
                r13 = 4
                if (r15 == r13) goto L3d4
                r13 = 5
                if (r15 != r13) goto L3ce
                java.lang.String r13 = "down"
                goto L3df
            L3ce:
                jt.l r1 = new jt.l
                r1.<init>()
                throw r1
            L3d4:
                java.lang.String r13 = "up"
                goto L3df
            L3d7:
                java.lang.String r13 = "right"
                goto L3df
            L3da:
                java.lang.String r13 = "left"
                goto L3df
            L3dd:
                java.lang.String r13 = "center"
            L3df:
                java.util.List r15 = kotlin.collections.C7697o.m31877c()
                r24 = r2
                okhttp3.MultipartBody$Part$Companion r2 = okhttp3.MultipartBody.Part.INSTANCE
                r25 = r12
                java.lang.String r12 = p059cq.C4197b.m21702i(r10)
                r26 = r8
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r8.append(r14)
                r8.append(r12)
                r8.append(r6)
                java.lang.String r8 = r8.toString()
                com.withpersona.sdk2.inquiry.selfie.SelfieType r12 = p059cq.C4197b.m21708o(r10)
                r27 = r6
                com.withpersona.sdk2.inquiry.selfie.SelfieType$CenterOnly r6 = com.withpersona.sdk2.inquiry.selfie.SelfieType.CenterOnly.f16125a
                boolean r6 = kotlin.jvm.internal.Intrinsics.m31980c(r12, r6)
                if (r6 == 0) goto L412
                java.lang.String r6 = "photo"
                goto L425
            L412:
                com.withpersona.sdk2.inquiry.selfie.SelfieType$ThreePhotos r6 = com.withpersona.sdk2.inquiry.selfie.SelfieType.ThreePhotos.f16127a
                boolean r6 = kotlin.jvm.internal.Intrinsics.m31980c(r12, r6)
                if (r6 == 0) goto L41b
                goto L423
            L41b:
                com.withpersona.sdk2.inquiry.selfie.SelfieType$ConfigurablePoses r6 = com.withpersona.sdk2.inquiry.selfie.SelfieType.ConfigurablePoses.f16126a
                boolean r6 = kotlin.jvm.internal.Intrinsics.m31980c(r12, r6)
                if (r6 == 0) goto L653
            L423:
                r6 = r21
            L425:
                okhttp3.MultipartBody$Part r6 = r2.createFormData(r8, r6)
                r15.add(r6)
                java.lang.String r6 = p059cq.C4197b.m21702i(r10)
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r8.append(r14)
                r8.append(r6)
                r8.append(r5)
                java.lang.String r6 = r8.toString()
                com.withpersona.sdk2.inquiry.selfie.Selfie$a r8 = r18.getCaptureMethod()
                java.lang.String r8 = r8.getMethod()
                okhttp3.MultipartBody$Part r6 = r2.createFormData(r6, r8)
                r15.add(r6)
                java.lang.String r6 = p059cq.C4197b.m21702i(r10)
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r8.append(r14)
                r8.append(r6)
                java.lang.String r6 = "][files][][captured-at]"
                r8.append(r6)
                java.lang.String r6 = r8.toString()
                long r28 = r18.getCapturedTimestamp()
                java.lang.String r8 = p226jq.C7261h.m30280a(r28)
                okhttp3.MultipartBody$Part r6 = r2.createFormData(r6, r8)
                r15.add(r6)
                java.lang.String r6 = p059cq.C4197b.m21702i(r10)
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r8.append(r14)
                r8.append(r6)
                r8.append(r4)
                java.lang.String r6 = r8.toString()
                java.lang.String r8 = "image"
                okhttp3.MultipartBody$Part r6 = r2.createFormData(r6, r8)
                r15.add(r6)
                java.lang.String r6 = r18.getToken()
                if (r6 == 0) goto L500
                java.lang.String r8 = p059cq.C4197b.m21702i(r10)
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                r12.append(r14)
                r12.append(r8)
                java.lang.String r8 = "][files][][pose]"
                r12.append(r8)
                java.lang.String r8 = r12.toString()
                okhttp3.MultipartBody$Part r8 = r2.createFormData(r8, r13)
                r15.add(r8)
                java.lang.String r8 = p059cq.C4197b.m21702i(r10)
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                r12.append(r14)
                r12.append(r8)
                java.lang.String r8 = "][files][][token]"
                r12.append(r8)
                java.lang.String r8 = r12.toString()
                okhttp3.MultipartBody$Part r6 = r2.createFormData(r8, r6)
                r15.add(r6)
                java.lang.String r6 = p059cq.C4197b.m21702i(r10)
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r8.append(r14)
                r8.append(r6)
                java.lang.String r6 = "][files][][index]"
                r8.append(r6)
                java.lang.String r6 = r8.toString()
                java.lang.String r8 = java.lang.String.valueOf(r26)
                okhttp3.MultipartBody$Part r2 = r2.createFormData(r6, r8)
                r15.add(r2)
                kotlin.Unit r2 = kotlin.Unit.f29331a
            L500:
                java.util.List r8 = kotlin.collections.C7697o.m31875a(r15)
                r2 = r8
                java.util.Collection r2 = (java.util.Collection) r2
                r3.addAll(r2)
                cq.b$b r2 = p059cq.C4197b.b.IMAGE
                r0.f17959K = r1
                r0.f17961t = r3
                java.lang.Object r6 = pt.C10350l.m39676a(r20)
                r0.f17962u = r6
                r0.f17963v = r10
                r0.f17964w = r9
                java.lang.Object r6 = pt.C10350l.m39676a(r41)
                r0.f17965x = r6
                java.lang.Object r6 = pt.C10350l.m39676a(r22)
                r0.f17966y = r6
                java.lang.Object r6 = pt.C10350l.m39676a(r25)
                r0.f17967z = r6
                java.lang.Object r6 = pt.C10350l.m39676a(r21)
                r0.f17949A = r6
                java.lang.Object r6 = pt.C10350l.m39676a(r13)
                r0.f17950B = r6
                java.lang.Object r6 = pt.C10350l.m39676a(r8)
                r0.f17951C = r6
                r0.f17954F = r7
                r0.f17955G = r11
                r6 = r26
                r0.f17956H = r6
                r15 = 3
                r0.f17958J = r15
                r15 = r25
                java.lang.Object r2 = p059cq.C4197b.m21716w(r10, r15, r2, r3, r0)
                r12 = r24
                if (r2 != r12) goto L556
            L553:
                r6 = r12
                goto Lc80
            L556:
                r18 = r9
                r9 = r3
                r3 = r18
                r18 = r20
                r20 = r8
                r8 = r18
                r18 = r41
                r41 = r2
            L565:
                java.lang.Throwable r2 = p229jt.C7347n.m30463e(r41)
                r23 = r8
                if (r2 == 0) goto L645
                boolean r8 = r2 instanceof com.withpersona.sdk2.inquiry.network.core.InternalErrorException
                if (r8 == 0) goto L5d6
                cq.b$d$a r8 = new cq.b$d$a
                r24 = r2
                com.withpersona.sdk2.inquiry.network.core.InternalErrorException r24 = (com.withpersona.sdk2.inquiry.network.core.InternalErrorException) r24
                r25 = r2
                com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo r2 = r24.getErrorInfo()
                r8.<init>(r2)
                r0.f17959K = r1
                r0.f17961t = r9
                java.lang.Object r2 = pt.C10350l.m39676a(r23)
                r0.f17962u = r2
                r0.f17963v = r10
                r0.f17964w = r3
                java.lang.Object r2 = pt.C10350l.m39676a(r18)
                r0.f17965x = r2
                java.lang.Object r2 = pt.C10350l.m39676a(r22)
                r0.f17966y = r2
                java.lang.Object r2 = pt.C10350l.m39676a(r15)
                r0.f17967z = r2
                java.lang.Object r2 = pt.C10350l.m39676a(r21)
                r0.f17949A = r2
                java.lang.Object r2 = pt.C10350l.m39676a(r13)
                r0.f17950B = r2
                java.lang.Object r2 = pt.C10350l.m39676a(r20)
                r0.f17951C = r2
                r2 = r41
                r0.f17952D = r2
                java.lang.Object r2 = pt.C10350l.m39676a(r25)
                r0.f17953E = r2
                r0.f17954F = r7
                r0.f17955G = r11
                r0.f17956H = r6
                r11 = 0
                r0.f17957I = r11
                r2 = 4
                r0.f17958J = r2
                java.lang.Object r6 = r1.emit(r8, r0)
                if (r6 != r12) goto L5cf
            L5ce:
                goto L553
            L5cf:
                r8 = r23
            L5d1:
                r16 = r2
                r2 = 5
                goto L648
            L5d6:
                r25 = r2
                r16 = 4
                r2 = r41
                cq.b$d$a r8 = new cq.b$d$a
                r41 = r13
                com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$UnknownErrorInfo r13 = new com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$UnknownErrorInfo
                java.lang.String r24 = r25.getMessage()
                r26 = r15
                if (r24 != 0) goto L5ed
                r15 = r19
                goto L5ef
            L5ed:
                r15 = r24
            L5ef:
                r13.<init>(r15)
                r8.<init>(r13)
                r0.f17959K = r1
                r0.f17961t = r9
                java.lang.Object r13 = pt.C10350l.m39676a(r23)
                r0.f17962u = r13
                r0.f17963v = r10
                r0.f17964w = r3
                java.lang.Object r13 = pt.C10350l.m39676a(r18)
                r0.f17965x = r13
                java.lang.Object r13 = pt.C10350l.m39676a(r22)
                r0.f17966y = r13
                java.lang.Object r13 = pt.C10350l.m39676a(r26)
                r0.f17967z = r13
                java.lang.Object r13 = pt.C10350l.m39676a(r21)
                r0.f17949A = r13
                java.lang.Object r13 = pt.C10350l.m39676a(r41)
                r0.f17950B = r13
                java.lang.Object r13 = pt.C10350l.m39676a(r20)
                r0.f17951C = r13
                r0.f17952D = r2
                java.lang.Object r2 = pt.C10350l.m39676a(r25)
                r0.f17953E = r2
                r0.f17954F = r7
                r0.f17955G = r11
                r0.f17956H = r6
                r11 = 0
                r0.f17957I = r11
                r2 = 5
                r0.f17958J = r2
                java.lang.Object r6 = r1.emit(r8, r0)
                if (r6 != r12) goto L642
                goto L5ce
            L642:
                r8 = r23
                goto L648
            L645:
                r2 = 5
                r16 = 4
            L648:
                r21 = r5
                r15 = r8
                r13 = r10
                r6 = r12
                r17 = 2
                r12 = r3
            L650:
                r3 = r9
                goto L7e1
            L653:
                jt.l r1 = new jt.l
                r1.<init>()
                throw r1
            L659:
                r27 = r6
                r16 = 4
                r17 = 2
                r6 = r2
                r2 = 5
                boolean r11 = r10 instanceof com.withpersona.sdk2.inquiry.selfie.Selfie.SelfieVideo
                if (r11 == 0) goto L7ea
                okhttp3.MultipartBody$Part$Companion r11 = okhttp3.MultipartBody.Part.INSTANCE
                java.lang.String r2 = p059cq.C4197b.m21702i(r13)
                r20 = r10
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                r10.append(r14)
                r10.append(r2)
                r2 = r27
                r10.append(r2)
                java.lang.String r10 = r10.toString()
                okhttp3.MultipartBody$Part r10 = r11.createFormData(r10, r9)
                java.lang.String r2 = p059cq.C4197b.m21702i(r13)
                r24 = r6
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r14)
                r6.append(r2)
                r6.append(r5)
                java.lang.String r2 = r6.toString()
                r6 = r20
                com.withpersona.sdk2.inquiry.selfie.Selfie$SelfieVideo r6 = (com.withpersona.sdk2.inquiry.selfie.Selfie.SelfieVideo) r6
                com.withpersona.sdk2.inquiry.selfie.Selfie$a r6 = r6.getCaptureMethod()
                java.lang.String r6 = r6.getMethod()
                okhttp3.MultipartBody$Part r2 = r11.createFormData(r2, r6)
                java.lang.String r6 = p059cq.C4197b.m21702i(r13)
                r21 = r5
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r14)
                r5.append(r6)
                r5.append(r4)
                java.lang.String r5 = r5.toString()
                okhttp3.MultipartBody$Part r5 = r11.createFormData(r5, r9)
                okhttp3.MultipartBody$Part[] r2 = new okhttp3.MultipartBody.Part[]{r10, r2, r5}
                java.util.List r2 = kotlin.collections.C7699p.m31895n(r2)
                java.util.Collection r2 = (java.util.Collection) r2
                r3.addAll(r2)
                cq.b$b r2 = p059cq.C4197b.b.VIDEO
                r0.f17959K = r1
                r0.f17961t = r3
                java.lang.Object r5 = pt.C10350l.m39676a(r18)
                r0.f17962u = r5
                r0.f17963v = r13
                r0.f17964w = r12
                java.lang.Object r5 = pt.C10350l.m39676a(r41)
                r0.f17965x = r5
                java.lang.Object r5 = pt.C10350l.m39676a(r20)
                r0.f17966y = r5
                java.lang.Object r5 = pt.C10350l.m39676a(r15)
                r0.f17967z = r5
                r9 = 0
                r0.f17949A = r9
                r0.f17950B = r9
                r0.f17951C = r9
                r0.f17952D = r9
                r0.f17953E = r9
                r0.f17954F = r7
                r11 = 0
                r0.f17955G = r11
                r0.f17956H = r8
                r5 = 6
                r0.f17958J = r5
                java.lang.Object r2 = p059cq.C4197b.m21716w(r13, r15, r2, r3, r0)
                r6 = r24
                if (r2 != r6) goto L717
                goto Lc80
            L717:
                r10 = r41
                r5 = r2
                r9 = r3
                r3 = r7
                r2 = 0
                goto L12a
            L71f:
                java.lang.Throwable r11 = p229jt.C7347n.m30463e(r5)
                if (r11 == 0) goto L7db
                boolean r13 = r11 instanceof com.withpersona.sdk2.inquiry.network.core.InternalErrorException
                if (r13 == 0) goto L77f
                cq.b$d$a r13 = new cq.b$d$a
                r22 = r11
                com.withpersona.sdk2.inquiry.network.core.InternalErrorException r22 = (com.withpersona.sdk2.inquiry.network.core.InternalErrorException) r22
                r41 = r10
                com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo r10 = r22.getErrorInfo()
                r13.<init>(r10)
                r0.f17959K = r1
                r0.f17961t = r9
                java.lang.Object r10 = pt.C10350l.m39676a(r18)
                r0.f17962u = r10
                r0.f17963v = r7
                r0.f17964w = r12
                java.lang.Object r10 = pt.C10350l.m39676a(r41)
                r0.f17965x = r10
                java.lang.Object r10 = pt.C10350l.m39676a(r20)
                r0.f17966y = r10
                java.lang.Object r10 = pt.C10350l.m39676a(r15)
                r0.f17967z = r10
                r0.f17949A = r5
                java.lang.Object r5 = pt.C10350l.m39676a(r11)
                r0.f17950B = r5
                r0.f17954F = r3
                r0.f17955G = r2
                r0.f17956H = r8
                r11 = 0
                r0.f17957I = r11
                r2 = 7
                r0.f17958J = r2
                java.lang.Object r2 = r1.emit(r13, r0)
                if (r2 != r6) goto L774
                goto Lc80
            L774:
                r8 = r7
                r15 = r9
                r7 = r12
                r9 = r18
            L779:
                r12 = r7
                r7 = r8
                r18 = r9
                r9 = r15
                goto L7db
            L77f:
                r41 = r10
                cq.b$d$a r10 = new cq.b$d$a
                com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$UnknownErrorInfo r13 = new com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$UnknownErrorInfo
                java.lang.String r22 = r11.getMessage()
                r23 = r11
                if (r22 != 0) goto L790
                r11 = r19
                goto L792
            L790:
                r11 = r22
            L792:
                r13.<init>(r11)
                r10.<init>(r13)
                r0.f17959K = r1
                r0.f17961t = r9
                java.lang.Object r11 = pt.C10350l.m39676a(r18)
                r0.f17962u = r11
                r0.f17963v = r7
                r0.f17964w = r12
                java.lang.Object r11 = pt.C10350l.m39676a(r41)
                r0.f17965x = r11
                java.lang.Object r11 = pt.C10350l.m39676a(r20)
                r0.f17966y = r11
                java.lang.Object r11 = pt.C10350l.m39676a(r15)
                r0.f17967z = r11
                r0.f17949A = r5
                java.lang.Object r5 = pt.C10350l.m39676a(r23)
                r0.f17950B = r5
                r0.f17954F = r3
                r0.f17955G = r2
                r0.f17956H = r8
                r11 = 0
                r0.f17957I = r11
                r2 = 8
                r0.f17958J = r2
                java.lang.Object r2 = r1.emit(r10, r0)
                if (r2 != r6) goto L7d5
                goto Lc80
            L7d5:
                r15 = r12
                r8 = r18
            L7d8:
                r18 = r8
                r12 = r15
            L7db:
                r13 = r7
                r15 = r18
                r7 = r3
                goto L650
            L7e1:
                r2 = r6
                r11 = r19
                r5 = r21
                r6 = r27
                goto L2b0
            L7ea:
                jt.l r1 = new jt.l
                r1.<init>()
                throw r1
            L7f0:
                r21 = r5
                r27 = r6
                r19 = r11
                r6 = r2
                cq.b r2 = p059cq.C4197b.this
                java.lang.String r2 = p059cq.C4197b.m21714u(r2)
                if (r2 == 0) goto L890
                okhttp3.MultipartBody$Part$Companion r2 = okhttp3.MultipartBody.Part.INSTANCE
                cq.b r5 = p059cq.C4197b.this
                java.lang.String r5 = p059cq.C4197b.m21702i(r5)
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r14)
                r7.append(r5)
                r5 = r27
                r7.append(r5)
                java.lang.String r5 = r7.toString()
                okhttp3.MultipartBody$Part r5 = r2.createFormData(r5, r9)
                cq.b r7 = p059cq.C4197b.this
                java.lang.String r7 = p059cq.C4197b.m21702i(r7)
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r8.append(r14)
                r8.append(r7)
                r7 = r21
                r8.append(r7)
                java.lang.String r7 = r8.toString()
                com.withpersona.sdk2.inquiry.selfie.Selfie$a r8 = com.withpersona.sdk2.inquiry.selfie.Selfie.EnumC3902a.AUTO
                java.lang.String r8 = r8.getMethod()
                okhttp3.MultipartBody$Part r7 = r2.createFormData(r7, r8)
                cq.b r8 = p059cq.C4197b.this
                java.lang.String r8 = p059cq.C4197b.m21702i(r8)
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                r10.append(r14)
                r10.append(r8)
                r10.append(r4)
                java.lang.String r4 = r10.toString()
                okhttp3.MultipartBody$Part r4 = r2.createFormData(r4, r9)
                cq.b r8 = p059cq.C4197b.this
                java.lang.String r8 = p059cq.C4197b.m21702i(r8)
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                r9.append(r14)
                r9.append(r8)
                java.lang.String r8 = "][files][][objectId]"
                r9.append(r8)
                java.lang.String r8 = r9.toString()
                cq.b r9 = p059cq.C4197b.this
                java.lang.String r9 = p059cq.C4197b.m21714u(r9)
                okhttp3.MultipartBody$Part r2 = r2.createFormData(r8, r9)
                okhttp3.MultipartBody$Part[] r2 = new okhttp3.MultipartBody.Part[]{r5, r7, r4, r2}
                java.util.List r2 = kotlin.collections.C7699p.m31895n(r2)
                java.util.Collection r2 = (java.util.Collection) r2
                r3.addAll(r2)
            L890:
                okhttp3.MultipartBody$Part$Companion r2 = okhttp3.MultipartBody.Part.INSTANCE
                cq.b r4 = p059cq.C4197b.this
                java.lang.String r4 = p059cq.C4197b.m21706m(r4)
                java.lang.String r5 = "data[id]"
                okhttp3.MultipartBody$Part r20 = r2.createFormData(r5, r4)
                java.lang.String r4 = "data[type]"
                java.lang.String r5 = "inquiry"
                okhttp3.MultipartBody$Part r21 = r2.createFormData(r4, r5)
                cq.b r4 = p059cq.C4197b.this
                java.lang.String r4 = p059cq.C4197b.m21702i(r4)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r14)
                r5.append(r4)
                java.lang.String r4 = "][type]"
                r5.append(r4)
                java.lang.String r4 = r5.toString()
                cq.b r5 = p059cq.C4197b.this
                com.withpersona.sdk2.inquiry.selfie.SelfieType r5 = p059cq.C4197b.m21708o(r5)
                com.withpersona.sdk2.inquiry.selfie.SelfieType$CenterOnly r7 = com.withpersona.sdk2.inquiry.selfie.SelfieType.CenterOnly.f16125a
                boolean r7 = kotlin.jvm.internal.Intrinsics.m31980c(r5, r7)
                if (r7 == 0) goto L8d1
                java.lang.String r5 = "only_center"
                goto L8e6
            L8d1:
                com.withpersona.sdk2.inquiry.selfie.SelfieType$ThreePhotos r7 = com.withpersona.sdk2.inquiry.selfie.SelfieType.ThreePhotos.f16127a
                boolean r7 = kotlin.jvm.internal.Intrinsics.m31980c(r5, r7)
                if (r7 == 0) goto L8dc
                java.lang.String r5 = "profile_and_center"
                goto L8e6
            L8dc:
                com.withpersona.sdk2.inquiry.selfie.SelfieType$ConfigurablePoses r7 = com.withpersona.sdk2.inquiry.selfie.SelfieType.ConfigurablePoses.f16126a
                boolean r5 = kotlin.jvm.internal.Intrinsics.m31980c(r5, r7)
                if (r5 == 0) goto Lc84
                java.lang.String r5 = "configurable_poses"
            L8e6:
                okhttp3.MultipartBody$Part r22 = r2.createFormData(r4, r5)
                cq.b r4 = p059cq.C4197b.this
                java.lang.String r4 = p059cq.C4197b.m21702i(r4)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r14)
                r5.append(r4)
                java.lang.String r4 = "][capture-started-at]"
                r5.append(r4)
                java.lang.String r4 = r5.toString()
                cq.b r5 = p059cq.C4197b.this
                long r7 = p059cq.C4197b.m21712s(r5)
                java.lang.String r5 = p226jq.C7261h.m30280a(r7)
                okhttp3.MultipartBody$Part r23 = r2.createFormData(r4, r5)
                cq.b r4 = p059cq.C4197b.this
                java.lang.String r4 = p059cq.C4197b.m21703j(r4)
                java.lang.String r5 = "meta[from_component]"
                okhttp3.MultipartBody$Part r24 = r2.createFormData(r5, r4)
                cq.b r4 = p059cq.C4197b.this
                java.lang.String r4 = p059cq.C4197b.m21704k(r4)
                java.lang.String r5 = "meta[from_step]"
                okhttp3.MultipartBody$Part r25 = r2.createFormData(r5, r4)
                cq.b r4 = p059cq.C4197b.this
                java.lang.String r4 = p059cq.C4197b.m21702i(r4)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r14)
                r5.append(r4)
                java.lang.String r4 = "][cameraProperties][label]"
                r5.append(r4)
                java.lang.String r4 = r5.toString()
                cq.b r5 = p059cq.C4197b.this
                com.withpersona.sdk2.camera.CameraProperties r5 = p059cq.C4197b.m21697d(r5)
                java.lang.String r5 = r5.getLabel()
                okhttp3.MultipartBody$Part r26 = r2.createFormData(r4, r5)
                cq.b r4 = p059cq.C4197b.this
                java.lang.String r4 = p059cq.C4197b.m21702i(r4)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r14)
                r5.append(r4)
                java.lang.String r4 = "][cameraProperties][facing_mode]"
                r5.append(r4)
                java.lang.String r4 = r5.toString()
                cq.b r5 = p059cq.C4197b.this
                com.withpersona.sdk2.camera.CameraProperties r5 = p059cq.C4197b.m21697d(r5)
                com.withpersona.sdk2.camera.CameraProperties$b r5 = r5.getFacingMode()
                int[] r7 = p059cq.C4197b.f.b.f17972b
                int r5 = r5.ordinal()
                r5 = r7[r5]
                r15 = 1
                if (r5 != r15) goto L984
                r5 = r19
                goto L99d
            L984:
                cq.b r5 = p059cq.C4197b.this
                com.withpersona.sdk2.camera.CameraProperties r5 = p059cq.C4197b.m21697d(r5)
                com.withpersona.sdk2.camera.CameraProperties$b r5 = r5.getFacingMode()
                java.lang.String r5 = r5.toString()
                java.util.Locale r7 = java.util.Locale.ROOT
                java.lang.String r5 = r5.toLowerCase(r7)
                java.lang.String r7 = "toLowerCase(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r7)
            L99d:
                okhttp3.MultipartBody$Part r27 = r2.createFormData(r4, r5)
                cq.b r4 = p059cq.C4197b.this
                java.lang.String r4 = p059cq.C4197b.m21702i(r4)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r14)
                r5.append(r4)
                java.lang.String r4 = "][cameraProperties][width]"
                r5.append(r4)
                java.lang.String r4 = r5.toString()
                cq.b r5 = p059cq.C4197b.this
                com.withpersona.sdk2.camera.CameraProperties r5 = p059cq.C4197b.m21697d(r5)
                android.util.Size r5 = r5.getSize()
                int r5 = r5.getWidth()
                java.lang.String r5 = java.lang.String.valueOf(r5)
                okhttp3.MultipartBody$Part r28 = r2.createFormData(r4, r5)
                cq.b r4 = p059cq.C4197b.this
                java.lang.String r4 = p059cq.C4197b.m21702i(r4)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r14)
                r5.append(r4)
                java.lang.String r4 = "][cameraProperties][height]"
                r5.append(r4)
                java.lang.String r4 = r5.toString()
                cq.b r5 = p059cq.C4197b.this
                com.withpersona.sdk2.camera.CameraProperties r5 = p059cq.C4197b.m21697d(r5)
                android.util.Size r5 = r5.getSize()
                int r5 = r5.getHeight()
                java.lang.String r5 = java.lang.String.valueOf(r5)
                okhttp3.MultipartBody$Part r29 = r2.createFormData(r4, r5)
                cq.b r4 = p059cq.C4197b.this
                java.lang.String r4 = p059cq.C4197b.m21702i(r4)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r14)
                r5.append(r4)
                java.lang.String r4 = "][cameraProperties][aspectRatio]"
                r5.append(r4)
                java.lang.String r4 = r5.toString()
                cq.b r5 = p059cq.C4197b.this
                com.withpersona.sdk2.camera.CameraProperties r5 = p059cq.C4197b.m21697d(r5)
                double r7 = r5.m16170a()
                java.lang.String r5 = java.lang.String.valueOf(r7)
                okhttp3.MultipartBody$Part r30 = r2.createFormData(r4, r5)
                cq.b r4 = p059cq.C4197b.this
                java.lang.String r4 = p059cq.C4197b.m21702i(r4)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r14)
                r5.append(r4)
                java.lang.String r4 = "][cameraProperties][frameRate]"
                r5.append(r4)
                java.lang.String r4 = r5.toString()
                cq.b r5 = p059cq.C4197b.this
                com.withpersona.sdk2.camera.CameraProperties r5 = p059cq.C4197b.m21697d(r5)
                int r5 = r5.getFrameRate()
                java.lang.String r5 = java.lang.String.valueOf(r5)
                okhttp3.MultipartBody$Part r31 = r2.createFormData(r4, r5)
                cq.b r4 = p059cq.C4197b.this
                java.lang.String r4 = p059cq.C4197b.m21702i(r4)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r14)
                r5.append(r4)
                java.lang.String r4 = "][cameraProperties][kind]"
                r5.append(r4)
                java.lang.String r4 = r5.toString()
                r5 = r19
                okhttp3.MultipartBody$Part r32 = r2.createFormData(r4, r5)
                cq.b r4 = p059cq.C4197b.this
                java.lang.String r4 = p059cq.C4197b.m21702i(r4)
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r14)
                r7.append(r4)
                java.lang.String r4 = "][cameraProperties][selectedCameraIndex]"
                r7.append(r4)
                java.lang.String r4 = r7.toString()
                okhttp3.MultipartBody$Part r33 = r2.createFormData(r4, r5)
                cq.b r4 = p059cq.C4197b.this
                java.lang.String r4 = p059cq.C4197b.m21702i(r4)
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r14)
                r7.append(r4)
                java.lang.String r4 = "][cameraProperties][streamStability]"
                r7.append(r4)
                java.lang.String r4 = r7.toString()
                okhttp3.MultipartBody$Part r34 = r2.createFormData(r4, r5)
                cq.b r4 = p059cq.C4197b.this
                java.lang.String r4 = p059cq.C4197b.m21702i(r4)
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r14)
                r7.append(r4)
                java.lang.String r4 = "][cameraProperties][allCameraLabels]"
                r7.append(r4)
                java.lang.String r4 = r7.toString()
                okhttp3.MultipartBody$Part r35 = r2.createFormData(r4, r5)
                cq.b r4 = p059cq.C4197b.this
                java.lang.String r4 = p059cq.C4197b.m21702i(r4)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r14)
                r5.append(r4)
                java.lang.String r4 = "][cameraProperties][client]"
                r5.append(r4)
                java.lang.String r4 = r5.toString()
                cq.b r5 = p059cq.C4197b.this
                android.content.Context r5 = p059cq.C4197b.m21699f(r5)
                boolean r5 = p582yn.C13241d0.m48977j(r5)
                if (r5 == 0) goto Lafc
                java.lang.String r5 = "mobile"
                goto Lafe
            Lafc:
                java.lang.String r5 = "mobile_sdk"
            Lafe:
                okhttp3.MultipartBody$Part r36 = r2.createFormData(r4, r5)
                cq.b r4 = p059cq.C4197b.this
                java.lang.String r4 = p059cq.C4197b.m21702i(r4)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r14)
                r5.append(r4)
                java.lang.String r4 = "][cameraProperties][platform]"
                r5.append(r4)
                java.lang.String r4 = r5.toString()
                boolean r5 = p582yn.C13249l.m49002a()
                if (r5 == 0) goto Lb25
                java.lang.String r5 = "android"
                goto Lb27
            Lb25:
                java.lang.String r5 = "android_sdk"
            Lb27:
                okhttp3.MultipartBody$Part r37 = r2.createFormData(r4, r5)
                cq.b r4 = p059cq.C4197b.this
                java.lang.String r4 = p059cq.C4197b.m21702i(r4)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r14)
                r5.append(r4)
                java.lang.String r4 = "][cameraProperties][factor]"
                r5.append(r4)
                java.lang.String r4 = r5.toString()
                cq.b r5 = p059cq.C4197b.this
                ln.a r5 = p059cq.C4197b.m21698e(r5)
                ln.a$a r5 = r5.mo33442b()
                double r7 = r5.getAverageRotation()
                java.lang.String r5 = java.lang.String.valueOf(r7)
                okhttp3.MultipartBody$Part r38 = r2.createFormData(r4, r5)
                okhttp3.MultipartBody$Part[] r2 = new okhttp3.MultipartBody.Part[]{r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38}
                java.util.List r2 = kotlin.collections.C7699p.m31895n(r2)
                java.util.Collection r2 = (java.util.Collection) r2
                r3.addAll(r2)
                cq.b$f$a r2 = new cq.b$f$a
                cq.b r4 = p059cq.C4197b.this
                r9 = 0
                r2.<init>(r4, r3, r9)
                r0.f17959K = r1
                java.lang.Object r4 = pt.C10350l.m39676a(r3)
                r0.f17961t = r4
                r0.f17962u = r9
                r0.f17963v = r9
                r0.f17964w = r9
                r0.f17965x = r9
                r0.f17966y = r9
                r0.f17967z = r9
                r0.f17949A = r9
                r0.f17950B = r9
                r0.f17951C = r9
                r0.f17952D = r9
                r0.f17953E = r9
                r4 = 9
                r0.f17958J = r4
                java.lang.Object r2 = com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt.enqueueVerificationRequestWithRetry(r2, r0)
                if (r2 != r6) goto Lb9a
                goto Lc80
            Lb9a:
                com.withpersona.sdk2.inquiry.network.core.NetworkCallResult r2 = (com.withpersona.sdk2.inquiry.network.core.NetworkCallResult) r2
                cq.b r4 = p059cq.C4197b.this
                boolean r5 = r2 instanceof com.withpersona.sdk2.inquiry.network.core.NetworkCallResult.Success
                if (r5 == 0) goto Lc2a
                r5 = r2
                com.withpersona.sdk2.inquiry.network.core.NetworkCallResult$Success r5 = (com.withpersona.sdk2.inquiry.network.core.NetworkCallResult.Success) r5
                java.lang.Object r5 = r5.getResponse()
                mq.a r7 = p059cq.C4197b.m21700g(r4)
                boolean r7 = r7.getIsActive()
                if (r7 != 0) goto Lbdc
                java.util.List r7 = p059cq.C4197b.m21709p(r4)
                java.lang.Iterable r7 = (java.lang.Iterable) r7
                java.util.Iterator r7 = r7.iterator()
            Lbbd:
                boolean r8 = r7.hasNext()
                if (r8 == 0) goto Lbdc
                java.lang.Object r8 = r7.next()
                com.withpersona.sdk2.inquiry.selfie.Selfie r8 = (com.withpersona.sdk2.inquiry.selfie.Selfie) r8
                boolean r9 = r8 instanceof com.withpersona.sdk2.inquiry.selfie.Selfie.SelfieImage
                if (r9 == 0) goto Lbbd
                java.io.File r9 = new java.io.File
                com.withpersona.sdk2.inquiry.selfie.Selfie$SelfieImage r8 = (com.withpersona.sdk2.inquiry.selfie.Selfie.SelfieImage) r8
                java.lang.String r8 = r8.getAbsoluteFilePath()
                r9.<init>(r8)
                r9.delete()
                goto Lbbd
            Lbdc:
                dq.a r4 = p059cq.C4197b.m21707n(r4)
                r0.f17959K = r1
                java.lang.Object r7 = pt.C10350l.m39676a(r3)
                r0.f17961t = r7
                r0.f17962u = r2
                java.lang.Object r7 = pt.C10350l.m39676a(r5)
                r0.f17963v = r7
                r11 = 0
                r0.f17954F = r11
                r0.f17955G = r11
                r7 = 10
                r0.f17958J = r7
                java.lang.Object r4 = r4.m22917o(r0)
                if (r4 != r6) goto Lc01
                goto Lc80
            Lc01:
                r4 = r3
                r7 = r5
                r5 = 0
                r3 = r2
                r2 = 0
            Lc06:
                cq.b$d$b r8 = p059cq.C4197b.d.b.f17947a
                r0.f17959K = r1
                java.lang.Object r9 = pt.C10350l.m39676a(r4)
                r0.f17961t = r9
                r0.f17962u = r3
                java.lang.Object r7 = pt.C10350l.m39676a(r7)
                r0.f17963v = r7
                r0.f17954F = r5
                r0.f17955G = r2
                r2 = 11
                r0.f17958J = r2
                java.lang.Object r2 = r1.emit(r8, r0)
                if (r2 != r6) goto Lc27
                goto Lc80
            Lc27:
                r5 = r3
                r3 = r4
                goto Lc2b
            Lc2a:
                r5 = r2
            Lc2b:
                cq.b r2 = p059cq.C4197b.this
                boolean r4 = r5 instanceof com.withpersona.sdk2.inquiry.network.core.NetworkCallResult.Failure
                if (r4 == 0) goto Lc81
                r4 = r5
                com.withpersona.sdk2.inquiry.network.core.NetworkCallResult$Failure r4 = (com.withpersona.sdk2.inquiry.network.core.NetworkCallResult.Failure) r4
                com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$NetworkErrorInfo r4 = r4.getNetworkErrorInfo()
                dq.a r2 = p059cq.C4197b.m21707n(r2)
                r0.f17959K = r1
                java.lang.Object r7 = pt.C10350l.m39676a(r3)
                r0.f17961t = r7
                r0.f17962u = r5
                r0.f17963v = r4
                r11 = 0
                r0.f17954F = r11
                r0.f17955G = r11
                r7 = 12
                r0.f17958J = r7
                java.lang.Object r2 = r2.m22917o(r0)
                if (r2 != r6) goto Lc58
                goto Lc80
            Lc58:
                r12 = r11
            Lc59:
                cq.b$d$a r2 = new cq.b$d$a
                r2.<init>(r4)
                java.lang.Object r7 = pt.C10350l.m39676a(r1)
                r0.f17959K = r7
                java.lang.Object r3 = pt.C10350l.m39676a(r3)
                r0.f17961t = r3
                r0.f17962u = r5
                java.lang.Object r3 = pt.C10350l.m39676a(r4)
                r0.f17963v = r3
                r0.f17954F = r12
                r0.f17955G = r11
                r3 = 13
                r0.f17958J = r3
                java.lang.Object r1 = r1.emit(r2, r0)
                if (r1 != r6) goto Lc81
            Lc80:
                return r6
            Lc81:
                kotlin.Unit r1 = kotlin.Unit.f29331a
                return r1
            Lc84:
                jt.l r1 = new jt.l
                r1.<init>()
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p059cq.C4197b.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9577i<? super d> interfaceC9577i, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((f) create(interfaceC9577i, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: cq.b$g */
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.selfie.network.SubmitVerificationWorker", m39664f = "SubmitVerificationWorker.kt", m39665l = {367, 368}, m39666m = "uploadIfNeededAndAddFileToBody-BWLJW6A")
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class g extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f17973t;

        /* JADX INFO: renamed from: u */
        public Object f17974u;

        /* JADX INFO: renamed from: v */
        public Object f17975v;

        /* JADX INFO: renamed from: w */
        public Object f17976w;

        /* JADX INFO: renamed from: x */
        public /* synthetic */ Object f17977x;

        /* JADX INFO: renamed from: z */
        public int f17979z;

        public g(InterfaceC9557b<? super g> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f17977x = obj;
            this.f17979z |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            Object objM21718y = C4197b.this.m21718y(null, null, null, this);
            return objM21718y == C10047c.m38805e() ? objM21718y : C7347n.m30459a(objM21718y);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r21v0, resolved type: java.util.List<? extends com.withpersona.sdk2.inquiry.selfie.Selfie> */
    /* JADX WARN: Multi-variable type inference failed */
    public C4197b(@NotNull Context context, @NotNull String sessionToken, @NotNull String inquiryId, @NotNull SelfieType selfieType, @NotNull List<? extends Selfie> selfies, @NotNull InterfaceC4196a service, @NotNull String fromStep, @NotNull String fromComponent, @NotNull String fieldKeySelfie, @NotNull InterfaceC8644a dataCollector, @NotNull InterfaceC5720a fallbackModeManager, @NotNull InterfaceC11067a imageHelper, @Nullable String str, @NotNull CameraProperties cameraProperties, @NotNull InterfaceC8169a cameraStatsManager, long j10, @NotNull TrackingEventsLogger trackingEventsLogger, @Nullable String str2, @NotNull DirectFileUploader directFileUploader, @NotNull C4658a selfiePoseManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Intrinsics.checkNotNullParameter(selfieType, "selfieType");
        Intrinsics.checkNotNullParameter(selfies, "selfies");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(fromStep, "fromStep");
        Intrinsics.checkNotNullParameter(fromComponent, "fromComponent");
        Intrinsics.checkNotNullParameter(fieldKeySelfie, "fieldKeySelfie");
        Intrinsics.checkNotNullParameter(dataCollector, "dataCollector");
        Intrinsics.checkNotNullParameter(fallbackModeManager, "fallbackModeManager");
        Intrinsics.checkNotNullParameter(imageHelper, "imageHelper");
        Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
        Intrinsics.checkNotNullParameter(cameraStatsManager, "cameraStatsManager");
        Intrinsics.checkNotNullParameter(trackingEventsLogger, "trackingEventsLogger");
        Intrinsics.checkNotNullParameter(directFileUploader, "directFileUploader");
        Intrinsics.checkNotNullParameter(selfiePoseManager, "selfiePoseManager");
        this.context = context;
        this.sessionToken = sessionToken;
        this.inquiryId = inquiryId;
        this.selfieType = selfieType;
        this.selfies = selfies;
        this.service = service;
        this.fromStep = fromStep;
        this.fromComponent = fromComponent;
        this.fieldKeySelfie = fieldKeySelfie;
        this.dataCollector = dataCollector;
        this.fallbackModeManager = fallbackModeManager;
        this.imageHelper = imageHelper;
        this.webRtcObjectId = str;
        this.cameraProperties = cameraProperties;
        this.cameraStatsManager = cameraStatsManager;
        this.startSelfieTimestamp = j10;
        this.trackingEventsLogger = trackingEventsLogger;
        this.fileUploadUrl = str2;
        this.directFileUploader = directFileUploader;
        this.selfiePoseManager = selfiePoseManager;
    }

    @Override // p499vr.InterfaceC12257h
    /* JADX INFO: renamed from: a */
    public boolean mo7572a(@NotNull InterfaceC12257h<?> interfaceC12257h) {
        return super.mo7572a(interfaceC12257h);
    }

    @Override // p581ym.InterfaceC13222o
    /* JADX INFO: renamed from: b */
    public boolean mo7573b(@NotNull InterfaceC13222o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof C4197b) && Intrinsics.m31980c(this.sessionToken, ((C4197b) otherWorker).sessionToken);
    }

    @Override // p499vr.InterfaceC12257h
    /* JADX INFO: renamed from: c */
    public boolean mo7574c(@NotNull InterfaceC12257h<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof C4197b) && Intrinsics.m31980c(this.sessionToken, ((C4197b) otherWorker).sessionToken);
    }

    @Override // p581ym.InterfaceC13222o, p499vr.InterfaceC12257h
    @NotNull
    public InterfaceC9575h<d> run() {
        return C9579j.m37806w(new f(null));
    }

    /* JADX INFO: renamed from: x */
    public final void m21717x(InterfaceC8644a interfaceC8644a, List<? extends Selfie> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof Selfie.SelfieImage) {
                arrayList.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(C7764d.m32078c(C7688j0.m31790f(C7701q.m31905u(arrayList, 10)), 16));
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj2 = arrayList.get(i10);
            i10++;
            linkedHashMap.put(((Selfie.SelfieImage) obj2).getPose(), obj2);
        }
        interfaceC8644a.mo34720a(new SelfieStepData(this.fromStep, (Selfie) linkedHashMap.get(EnumC7638a.Center), (Selfie) linkedHashMap.get(EnumC7638a.Left), (Selfie) linkedHashMap.get(EnumC7638a.Right), (Selfie) linkedHashMap.get(EnumC7638a.Up), (Selfie) linkedHashMap.get(EnumC7638a.Down)));
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:36:0x0163  */
    /* JADX WARN: Code duplicated, block: B:38:0x016c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:33:0x00cf, please report this as an issue */
    /* JADX INFO: renamed from: y */
    public final Object m21718y(File file, b bVar, List<MultipartBody.Part> list, InterfaceC9557b<? super C7347n<Unit>> interfaceC9557b) {
        g gVar;
        String str;
        Object obj;
        List<MultipartBody.Part> list2;
        b bVar2;
        File file2;
        Object objM20006a;
        List<MultipartBody.Part> list3;
        Throwable thM30463e;
        if (interfaceC9557b instanceof g) {
            gVar = (g) interfaceC9557b;
            int i10 = gVar.f17979z;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                gVar.f17979z = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                gVar = new g(interfaceC9557b);
            }
        } else {
            gVar = new g(interfaceC9557b);
        }
        Object obj2 = gVar.f17977x;
        Object objM38805e = C10047c.m38805e();
        int i11 = gVar.f17979z;
        if (i11 == 0) {
            C7348o.m30470b(obj2);
            String str2 = this.fileUploadUrl;
            if (str2 != null && !StringsKt.m32182p0(str2) && bVar != b.VIDEO) {
                DirectFileUploader directFileUploader = this.directFileUploader;
                String absolutePath = file.getAbsolutePath();
                Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
                String str3 = this.fileUploadUrl;
                gVar.f17973t = C10350l.m39676a(file);
                gVar.f17974u = C10350l.m39676a(bVar);
                gVar.f17975v = list;
                gVar.f17976w = C10350l.m39676a(file);
                gVar.f17979z = 1;
                Object objM19993i = directFileUploader.m19993i(absolutePath, str3, gVar);
                if (objM19993i != objM38805e) {
                    obj = objM19993i;
                    list2 = list;
                    bVar2 = bVar;
                    file2 = file;
                }
                return objM38805e;
            }
            RequestBody.Companion companion = RequestBody.INSTANCE;
            MediaType.Companion companion2 = MediaType.INSTANCE;
            int i12 = e.f17948a[bVar.ordinal()];
            if (i12 == 1) {
                str = "image/*";
            } else {
                if (i12 != 2) {
                    throw new C7345l();
                }
                str = "video/*";
            }
            RequestBody requestBodyCreate = companion.create(file, companion2.parse(str));
            C10340b.m39658a(list.add(MultipartBody.Part.INSTANCE.createFormData("data[attributes][fields][" + this.fieldKeySelfie + "][files][][frames][]", file.getName(), requestBodyCreate)));
            C7347n.Companion companion3 = C7347n.INSTANCE;
            return C7347n.m30460b(Unit.f29331a);
        }
        if (i11 == 1) {
            File file3 = (File) gVar.f17976w;
            List<MultipartBody.Part> list4 = (List) gVar.f17975v;
            b bVar3 = (b) gVar.f17974u;
            File file4 = (File) gVar.f17973t;
            C7348o.m30470b(obj2);
            file2 = file3;
            file = file4;
            obj = obj2;
            list2 = list4;
            bVar2 = bVar3;
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list3 = (List) gVar.f17975v;
            C7348o.m30470b(obj2);
            objM20006a = ((C7347n) obj2).getValue();
        }
        if (C7347n.m30466h(objM20006a)) {
            DirectFileUploader.UploadResult c3948c = (DirectFileUploader.UploadResult) objM20006a;
            MultipartBody.Part.Companion companion4 = MultipartBody.Part.INSTANCE;
            list3.addAll(C7699p.m31895n(companion4.createFormData("data[attributes][fields][" + this.fieldKeySelfie + "][files][][frames][][fileName]", c3948c.getFileName()), companion4.createFormData("data[attributes][fields][" + this.fieldKeySelfie + "][files][][frames][][fileKey]", c3948c.getFileKey()), companion4.createFormData("data[attributes][fields][" + this.fieldKeySelfie + "][files][][frames][][fileContentType]", c3948c.getFileContentType()), companion4.createFormData("data[attributes][fields][" + this.fieldKeySelfie + "][files][][frames][][fileByteSize]", String.valueOf(c3948c.getFileByteSize()))));
        }
        thM30463e = C7347n.m30463e(objM20006a);
        if (thM30463e != null) {
            return C7347n.m30460b(C7348o.m30469a(thM30463e));
        }
        C7347n.m30459a(objM20006a);
        C7347n.Companion companion5 = C7347n.INSTANCE;
        return C7347n.m30460b(Unit.f29331a);
        gVar.f17973t = C10350l.m39676a(file);
        gVar.f17974u = C10350l.m39676a(bVar2);
        gVar.f17975v = list2;
        gVar.f17976w = C10350l.m39676a(file2);
        gVar.f17979z = 2;
        objM20006a = ((DirectFileUploader.UploadTask) obj).m20006a(gVar);
        if (objM20006a != objM38805e) {
            list3 = list2;
            if (C7347n.m30466h(objM20006a)) {
                DirectFileUploader.UploadResult c3948c2 = (DirectFileUploader.UploadResult) objM20006a;
                MultipartBody.Part.Companion companion6 = MultipartBody.Part.INSTANCE;
                list3.addAll(C7699p.m31895n(companion6.createFormData("data[attributes][fields][" + this.fieldKeySelfie + "][files][][frames][][fileName]", c3948c2.getFileName()), companion6.createFormData("data[attributes][fields][" + this.fieldKeySelfie + "][files][][frames][][fileKey]", c3948c2.getFileKey()), companion6.createFormData("data[attributes][fields][" + this.fieldKeySelfie + "][files][][frames][][fileContentType]", c3948c2.getFileContentType()), companion6.createFormData("data[attributes][fields][" + this.fieldKeySelfie + "][files][][frames][][fileByteSize]", String.valueOf(c3948c2.getFileByteSize()))));
            }
            thM30463e = C7347n.m30463e(objM20006a);
            if (thM30463e != null) {
                return C7347n.m30460b(C7348o.m30469a(thM30463e));
            }
            C7347n.m30459a(objM20006a);
            C7347n.Companion companion7 = C7347n.INSTANCE;
            return C7347n.m30460b(Unit.f29331a);
        }
        return objM38805e;
    }
}
