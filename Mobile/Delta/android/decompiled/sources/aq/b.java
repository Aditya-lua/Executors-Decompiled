package aq;

import android.content.Context;
import com.google.mlkit.common.MlKitException;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import com.withpersona.sdk2.inquiry.selfie.SelfieType;
import com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader;
import com.withpersona.sdk2.inquiry.selfie.network.SelfieStepData;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import gt.n;
import hv.x;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.j0;
import kotlin.collections.p;
import kotlin.collections.q;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lu.i;
import lu.j;
import nt.l;
import nt.m;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tr.h;
import wm.o;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0004A-+>BË\u0001\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\u0006\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\u000e\b\u0001\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0001\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\b\u0001\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010$\u001a\u00020#\u0012\b\b\u0001\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u001b\u0010+\u001a\u00020*2\n\u0010)\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b+\u0010,J\u001b\u0010-\u001a\u00020*2\n\u0010)\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b-\u0010.J\u0015\u00100\u001a\b\u0012\u0004\u0012\u00020\u00020/H\u0016¢\u0006\u0004\b0\u00101J0\u0010:\u001a\b\u0012\u0004\u0012\u00020908*\u0002022\u0006\u00104\u001a\u0002032\f\u00107\u001a\b\u0012\u0004\u0012\u00020605H\u0082@¢\u0006\u0004\b:\u0010;J!\u0010<\u001a\u000209*\u00020\u00132\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b<\u0010=R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010@R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010@R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\u0010\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010@R\u0014\u0010\u0011\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010@R\u0014\u0010\u0012\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010@R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010@R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0016\u0010\"\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010@R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^¨\u0006_"}, d2 = {"Laq/b;", "Lwm/o;", "Laq/b$d;", "Ltr/h;", "Landroid/content/Context;", "context", "", "sessionToken", "inquiryId", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;", "selfieType", "", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "selfies", "Laq/a;", "service", "fromStep", "fromComponent", "fieldKeySelfie", "Lkq/a;", "dataCollector", "Lco/a;", "fallbackModeManager", "Lpq/a;", "imageHelper", "webRtcObjectId", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "Ljn/a;", "cameraStatsManager", "", "startSelfieTimestamp", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "fileUploadUrl", "Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;", "directFileUploader", "Lbq/a;", "selfiePoseManager", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;Ljava/util/List;Laq/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkq/a;Lco/a;Lpq/a;Ljava/lang/String;Lcom/withpersona/sdk2/camera/CameraProperties;Ljn/a;JLcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;Lbq/a;)V", "otherWorker", "", "c", "(Lwm/o;)Z", "a", "(Ltr/h;)Z", "Llu/h;", "run", "()Llu/h;", "Ljava/io/File;", "Laq/b$b;", "fileType", "", "Lokhttp3/MultipartBody$Part;", "bodyParts", "Lgt/n;", "", "y", "(Ljava/io/File;Laq/b$b;Ljava/util/List;Llt/b;)Ljava/lang/Object;", "x", "(Lkq/a;Ljava/util/List;)V", "b", "Landroid/content/Context;", "Ljava/lang/String;", "d", "e", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;", "f", "Ljava/util/List;", "g", "Laq/a;", "h", "i", "j", "k", "Lkq/a;", "l", "Lco/a;", "m", "Lpq/a;", "n", "o", "Lcom/withpersona/sdk2/camera/CameraProperties;", "p", "Ljn/a;", "q", "J", "r", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "s", "t", "Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;", "u", "Lbq/a;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements o<d>, h<d> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String sessionToken;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String inquiryId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final SelfieType selfieType;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<Selfie> selfies;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final aq.a service;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String fromStep;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String fromComponent;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String fieldKeySelfie;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final kq.a dataCollector;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final co.a fallbackModeManager;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final pq.a imageHelper;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String webRtcObjectId;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CameraProperties cameraProperties;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final jn.a cameraStatsManager;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public final long startSelfieTimestamp;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String fileUploadUrl;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final DirectFileUploader directFileUploader;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final bq.a selfiePoseManager;

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0089\u0001\u0010\u0016\u001a\u00020\u00152\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0011\u001a\u00020\u00102\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018À\u0006\u0003"}, d2 = {"Laq/b$a;", "", "", "sessionToken", "inquiryId", "fromComponent", "fromStep", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;", "selfieType", "fieldKeySelfie", "", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "selfies", "webRtcObjectId", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "", "startSelfieTimestamp", "fileUploadUrl", "Lbq/a;", "selfiePoseManager", "Laq/b;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/withpersona/sdk2/camera/CameraProperties;JLjava/lang/String;Lbq/a;)Laq/b;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        @NotNull
        b a(@NotNull String sessionToken, @NotNull String inquiryId, @NotNull String fromComponent, @NotNull String fromStep, @NotNull SelfieType selfieType, @NotNull String fieldKeySelfie, @NotNull List<? extends Selfie> selfies, @Nullable String webRtcObjectId, @NotNull CameraProperties cameraProperties, long startSelfieTimestamp, @Nullable String fileUploadUrl, @NotNull bq.a selfiePoseManager);
    }

    /* JADX INFO: renamed from: aq.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Laq/b$b;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum EnumC0065b {
        IMAGE,
        VIDEO;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ ot.a f3477d = ot.b.a(a());
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Laq/b$c;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "<init>", "()V", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c extends RuntimeException {
        public c() {
            super("File upload returned invalid response.");
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Laq/b$d;", "", "<init>", "()V", "b", "a", "Laq/b$d$a;", "Laq/b$d$b;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class d {

        /* JADX INFO: renamed from: aq.b$d$a, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Laq/b$d$a;", "Laq/b$d;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Error extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
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
                return (other instanceof Error) && Intrinsics.c(this.cause, ((Error) other).cause);
            }

            public int hashCode() {
                return this.cause.hashCode();
            }

            @NotNull
            public String toString() {
                return "Error(cause=" + this.cause + ")";
            }
        }

        /* JADX INFO: renamed from: aq.b$d$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Laq/b$d$b;", "Laq/b$d;", "<init>", "()V", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class C0066b extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0066b f3479a = new C0066b();

            public C0066b() {
                super(null);
            }
        }

        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public d() {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3480a;

        static {
            int[] iArr = new int[EnumC0065b.values().length];
            try {
                iArr[EnumC0065b.IMAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC0065b.VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f3480a = iArr;
        }
    }

    @nt.f(c = "com.withpersona.sdk2.inquiry.selfie.network.SubmitVerificationWorker$run$1", f = "SubmitVerificationWorker.kt", l = {85, 87, 167, 172, 174, 197, MlKitException.CODE_SCANNER_CAMERA_PERMISSION_NOT_GRANTED, MlKitException.CODE_SCANNER_TASK_IN_PROGRESS, 324, 346, 347, 349, 350}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Llu/i;", "Laq/b$d;", "", "<anonymous>", "(Llu/i;)V"}, k = 3, mv = {2, 2, 0})
    public static final class f extends m implements Function2<i<? super d>, lt.b<? super Unit>, Object> {
        public Object A;
        public Object B;
        public Object C;
        public Object D;
        public Object E;
        public int F;
        public int G;
        public int H;
        public int I;
        public int J;
        public /* synthetic */ Object K;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f3481t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f3482u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f3483v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f3484w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f3485x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public Object f3486y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public Object f3487z;

        @nt.f(c = "com.withpersona.sdk2.inquiry.selfie.network.SubmitVerificationWorker$run$1$2", f = "SubmitVerificationWorker.kt", l = {326, 331}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lhv/x;", "", "<anonymous>", "()Lhv/x;"}, k = 3, mv = {2, 2, 0})
        public static final class a extends m implements Function1<lt.b<? super x<? extends Object>>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f3488t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ b f3489u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ List<MultipartBody.Part> f3490v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, List<MultipartBody.Part> list, lt.b<? super a> bVar2) {
                super(1, bVar2);
                this.f3489u = bVar;
                this.f3490v = list;
            }

            @Override // nt.a
            public final lt.b<Unit> create(lt.b<?> bVar) {
                return new a(this.f3489u, this.f3490v, bVar);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
            
                if (r6 == r0) goto L19;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
            
                if (r6 == r0) goto L19;
             */
            @Override // nt.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                /*
                    r5 = this;
                    java.lang.Object r0 = mt.c.e()
                    int r1 = r5.f3488t
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L1e
                    if (r1 == r3) goto L1a
                    if (r1 != r2) goto L12
                    gt.o.b(r6)
                    goto L64
                L12:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r0)
                    throw r6
                L1a:
                    gt.o.b(r6)
                    goto L44
                L1e:
                    gt.o.b(r6)
                    aq.b r6 = r5.f3489u
                    co.a r6 = aq.b.h(r6)
                    boolean r6 = r6.b()
                    if (r6 == 0) goto L47
                    aq.b r6 = r5.f3489u
                    co.a r6 = aq.b.h(r6)
                    aq.b r1 = r5.f3489u
                    java.lang.String r1 = aq.b.r(r1)
                    java.util.List<okhttp3.MultipartBody$Part> r2 = r5.f3490v
                    r5.f3488t = r3
                    java.lang.Object r6 = r6.a(r1, r2, r5)
                    if (r6 != r0) goto L44
                    goto L63
                L44:
                    hv.x r6 = (hv.x) r6
                    return r6
                L47:
                    aq.b r6 = r5.f3489u
                    aq.a r6 = aq.b.q(r6)
                    aq.b r1 = r5.f3489u
                    java.lang.String r1 = aq.b.r(r1)
                    aq.b r3 = r5.f3489u
                    java.lang.String r3 = aq.b.m(r3)
                    java.util.List<okhttp3.MultipartBody$Part> r4 = r5.f3490v
                    r5.f3488t = r2
                    java.lang.Object r6 = r6.b(r1, r3, r4, r5)
                    if (r6 != r0) goto L64
                L63:
                    return r0
                L64:
                    hv.x r6 = (hv.x) r6
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: aq.b.f.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public final Object invoke(lt.b<? super x<? extends Object>> bVar) {
                return ((a) create(bVar)).invokeSuspend(Unit.f22938a);
            }
        }

        /* JADX INFO: renamed from: aq.b$f$b, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class C0067b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f3491a;
            public static final /* synthetic */ int[] b;

            static {
                int[] iArr = new int[in.a.values().length];
                try {
                    iArr[in.a.Center.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[in.a.Left.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[in.a.Right.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[in.a.Up.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[in.a.Down.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f3491a = iArr;
                int[] iArr2 = new int[CameraProperties.b.values().length];
                try {
                    iArr2[CameraProperties.b.Unknown.ordinal()] = 1;
                } catch (NoSuchFieldError unused6) {
                }
                b = iArr2;
            }
        }

        public f(lt.b<? super f> bVar) {
            super(2, bVar);
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            f fVar = b.this.new f(bVar);
            fVar.K = obj;
            return fVar;
        }

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
        @Override // nt.a
        public final java.lang.Object invokeSuspend(java.lang.Object r41) {
            /*
                Method dump skipped, instruction units count: 3242
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: aq.b.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i<? super d> iVar, lt.b<? super Unit> bVar) {
            return ((f) create(iVar, bVar)).invokeSuspend(Unit.f22938a);
        }
    }

    @nt.f(c = "com.withpersona.sdk2.inquiry.selfie.network.SubmitVerificationWorker", f = "SubmitVerificationWorker.kt", l = {367, 368}, m = "uploadIfNeededAndAddFileToBody-BWLJW6A")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class g extends nt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f3492t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f3493u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f3494v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f3495w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public /* synthetic */ Object f3496x;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f3498z;

        public g(lt.b<? super g> bVar) {
            super(bVar);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f3496x = obj;
            this.f3498z |= Integer.MIN_VALUE;
            Object objY = b.this.y(null, null, null, this);
            return objY == mt.c.e() ? objY : n.a(objY);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(@NotNull Context context, @NotNull String sessionToken, @NotNull String inquiryId, @NotNull SelfieType selfieType, @NotNull List<? extends Selfie> selfies, @NotNull aq.a service, @NotNull String fromStep, @NotNull String fromComponent, @NotNull String fieldKeySelfie, @NotNull kq.a dataCollector, @NotNull co.a fallbackModeManager, @NotNull pq.a imageHelper, @Nullable String str, @NotNull CameraProperties cameraProperties, @NotNull jn.a cameraStatsManager, long j10, @NotNull TrackingEventsLogger trackingEventsLogger, @Nullable String str2, @NotNull DirectFileUploader directFileUploader, @NotNull bq.a selfiePoseManager) {
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

    @Override // tr.h
    public boolean a(@NotNull h<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof b) && Intrinsics.c(this.sessionToken, ((b) otherWorker).sessionToken);
    }

    @Override // tr.h
    public boolean b(@NotNull h<?> hVar) {
        return super.b(hVar);
    }

    @Override // wm.o
    public boolean c(@NotNull o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof b) && Intrinsics.c(this.sessionToken, ((b) otherWorker).sessionToken);
    }

    @Override // wm.o, tr.h
    @NotNull
    public lu.h<d> run() {
        return j.w(new f(null));
    }

    public final void x(kq.a aVar, List<? extends Selfie> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof Selfie.SelfieImage) {
                arrayList.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.d.c(j0.f(q.u(arrayList, 10)), 16));
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj2 = arrayList.get(i10);
            i10++;
            linkedHashMap.put(((Selfie.SelfieImage) obj2).getPose(), obj2);
        }
        aVar.a(new SelfieStepData(this.fromStep, (Selfie) linkedHashMap.get(in.a.Center), (Selfie) linkedHashMap.get(in.a.Left), (Selfie) linkedHashMap.get(in.a.Right), (Selfie) linkedHashMap.get(in.a.Up), (Selfie) linkedHashMap.get(in.a.Down)));
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:36:0x0163  */
    /* JADX WARN: Code duplicated, block: B:38:0x016c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:33:0x00cf, please report this as an issue */
    public final Object y(File file, EnumC0065b enumC0065b, List<MultipartBody.Part> list, lt.b<? super n<Unit>> bVar) {
        g gVar;
        String str;
        Object obj;
        List<MultipartBody.Part> list2;
        EnumC0065b enumC0065b2;
        File file2;
        Object objA;
        List<MultipartBody.Part> list3;
        Throwable thE;
        if (bVar instanceof g) {
            gVar = (g) bVar;
            int i10 = gVar.f3498z;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.f3498z = i10 - Integer.MIN_VALUE;
            } else {
                gVar = new g(bVar);
            }
        } else {
            gVar = new g(bVar);
        }
        Object obj2 = gVar.f3496x;
        Object objE = mt.c.e();
        int i11 = gVar.f3498z;
        if (i11 == 0) {
            gt.o.b(obj2);
            String str2 = this.fileUploadUrl;
            if (str2 != null && !StringsKt.p0(str2) && enumC0065b != EnumC0065b.VIDEO) {
                DirectFileUploader directFileUploader = this.directFileUploader;
                String absolutePath = file.getAbsolutePath();
                Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
                String str3 = this.fileUploadUrl;
                gVar.f3492t = l.a(file);
                gVar.f3493u = l.a(enumC0065b);
                gVar.f3494v = list;
                gVar.f3495w = l.a(file);
                gVar.f3498z = 1;
                Object objI = directFileUploader.i(absolutePath, str3, gVar);
                if (objI != objE) {
                    obj = objI;
                    list2 = list;
                    enumC0065b2 = enumC0065b;
                    file2 = file;
                }
                return objE;
            }
            RequestBody.Companion companion = RequestBody.INSTANCE;
            MediaType.Companion companion2 = MediaType.INSTANCE;
            int i12 = e.f3480a[enumC0065b.ordinal()];
            if (i12 == 1) {
                str = "image/*";
            } else {
                if (i12 != 2) {
                    throw new gt.l();
                }
                str = "video/*";
            }
            RequestBody requestBodyCreate = companion.create(file, companion2.parse(str));
            nt.b.a(list.add(MultipartBody.Part.INSTANCE.createFormData("data[attributes][fields][" + this.fieldKeySelfie + "][files][][frames][]", file.getName(), requestBodyCreate)));
            n.Companion companion3 = n.INSTANCE;
            return n.b(Unit.f22938a);
        }
        if (i11 == 1) {
            File file3 = (File) gVar.f3495w;
            List<MultipartBody.Part> list4 = (List) gVar.f3494v;
            EnumC0065b enumC0065b3 = (EnumC0065b) gVar.f3493u;
            File file4 = (File) gVar.f3492t;
            gt.o.b(obj2);
            file2 = file3;
            file = file4;
            obj = obj2;
            list2 = list4;
            enumC0065b2 = enumC0065b3;
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list3 = (List) gVar.f3494v;
            gt.o.b(obj2);
            objA = ((n) obj2).getValue();
        }
        if (n.h(objA)) {
            DirectFileUploader.UploadResult cVar = (DirectFileUploader.UploadResult) objA;
            MultipartBody.Part.Companion companion4 = MultipartBody.Part.INSTANCE;
            list3.addAll(p.n(companion4.createFormData("data[attributes][fields][" + this.fieldKeySelfie + "][files][][frames][][fileName]", cVar.getFileName()), companion4.createFormData("data[attributes][fields][" + this.fieldKeySelfie + "][files][][frames][][fileKey]", cVar.getFileKey()), companion4.createFormData("data[attributes][fields][" + this.fieldKeySelfie + "][files][][frames][][fileContentType]", cVar.getFileContentType()), companion4.createFormData("data[attributes][fields][" + this.fieldKeySelfie + "][files][][frames][][fileByteSize]", String.valueOf(cVar.getFileByteSize()))));
        }
        thE = n.e(objA);
        if (thE != null) {
            return n.b(gt.o.a(thE));
        }
        n.a(objA);
        n.Companion companion5 = n.INSTANCE;
        return n.b(Unit.f22938a);
        gVar.f3492t = l.a(file);
        gVar.f3493u = l.a(enumC0065b2);
        gVar.f3494v = list2;
        gVar.f3495w = l.a(file2);
        gVar.f3498z = 2;
        objA = ((DirectFileUploader.UploadTask) obj).a(gVar);
        if (objA != objE) {
            list3 = list2;
            if (n.h(objA)) {
                DirectFileUploader.UploadResult cVar2 = (DirectFileUploader.UploadResult) objA;
                MultipartBody.Part.Companion companion6 = MultipartBody.Part.INSTANCE;
                list3.addAll(p.n(companion6.createFormData("data[attributes][fields][" + this.fieldKeySelfie + "][files][][frames][][fileName]", cVar2.getFileName()), companion6.createFormData("data[attributes][fields][" + this.fieldKeySelfie + "][files][][frames][][fileKey]", cVar2.getFileKey()), companion6.createFormData("data[attributes][fields][" + this.fieldKeySelfie + "][files][][frames][][fileContentType]", cVar2.getFileContentType()), companion6.createFormData("data[attributes][fields][" + this.fieldKeySelfie + "][files][][frames][][fileByteSize]", String.valueOf(cVar2.getFileByteSize()))));
            }
            thE = n.e(objA);
            if (thE != null) {
                return n.b(gt.o.a(thE));
            }
            n.a(objA);
            n.Companion companion7 = n.INSTANCE;
            return n.b(Unit.f22938a);
        }
        return objE;
    }
}
