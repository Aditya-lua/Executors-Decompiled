package qq;

import android.content.Context;
import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.common.MlKitException;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import dv.h;
import dv.i;
import gu.l;
import gu.m;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import ln.o;
import ls.j;
import mq.b0;
import mq.z0;
import mv.c0;
import mv.g0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.collections.j0;
import p001kotlin.collections.p;
import p001kotlin.collections.q;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.text.StringsKt;
import sn.v;
import sw.x;
import zt.n;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0004A+->BË\u0001\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\u0006\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\u000e\b\u0001\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0001\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\b\u0001\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010$\u001a\u00020#\u0012\b\b\u0001\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u001b\u0010+\u001a\u00020*2\n\u0010)\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b+\u0010,J\u001b\u0010-\u001a\u00020*2\n\u0010)\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b-\u0010.J\u0015\u00100\u001a\b\u0012\u0004\u0012\u00020\u00020/H\u0016¢\u0006\u0004\b0\u00101J0\u0010:\u001a\b\u0012\u0004\u0012\u00020908*\u0002022\u0006\u00104\u001a\u0002032\f\u00107\u001a\b\u0012\u0004\u0012\u00020605H\u0082@¢\u0006\u0004\b:\u0010;J!\u0010<\u001a\u000209*\u00020\u00132\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b<\u0010=R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010@R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010@R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\u0010\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010@R\u0014\u0010\u0011\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010@R\u0014\u0010\u0012\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010@R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010@R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0016\u0010\"\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010@R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^¨\u0006_"}, d2 = {"Lqq/c;", "Lln/o;", "Lqq/c$d;", "Lls/j;", "Landroid/content/Context;", "context", BuildConfig.FLAVOR, "sessionToken", "inquiryId", "Lmq/z0;", "selfieType", BuildConfig.FLAVOR, "Lmq/b0;", "selfies", "Lqq/a;", "service", "fromStep", "fromComponent", "fieldKeySelfie", "Lar/a;", "dataCollector", "Lso/a;", "fallbackModeManager", "Lfr/a;", "imageHelper", "webRtcObjectId", "Lsn/v;", "cameraProperties", "Lyn/a;", "cameraStatsManager", BuildConfig.FLAVOR, "startSelfieTimestamp", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "fileUploadUrl", "Lpq/a;", "directFileUploader", "Lrq/b;", "selfiePoseManager", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lmq/z0;Ljava/util/List;Lqq/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lar/a;Lso/a;Lfr/a;Ljava/lang/String;Lsn/v;Lyn/a;JLcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Ljava/lang/String;Lpq/a;Lrq/b;)V", "otherWorker", BuildConfig.FLAVOR, "a", "(Lln/o;)Z", "c", "(Lls/j;)Z", "Ldv/h;", "run", "()Ldv/h;", "Ljava/io/File;", "Lqq/c$b;", "fileType", BuildConfig.FLAVOR, "Lmv/c0$c;", "bodyParts", "Lzt/n;", BuildConfig.FLAVOR, "y", "(Ljava/io/File;Lqq/c$b;Ljava/util/List;Leu/b;)Ljava/lang/Object;", "x", "(Lar/a;Ljava/util/List;)V", "b", "Landroid/content/Context;", "Ljava/lang/String;", "d", "e", "Lmq/z0;", "f", "Ljava/util/List;", "g", "Lqq/a;", "h", "i", "j", "k", "Lar/a;", "l", "Lso/a;", "m", "Lfr/a;", "n", "o", "Lsn/v;", "p", "Lyn/a;", "q", "J", "r", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "s", "t", "Lpq/a;", "u", "Lrq/b;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements o<d>, j<d> {

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
    public final z0 selfieType;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<b0> selfies;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final qq.a service;

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
    public final ar.a dataCollector;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final so.a fallbackModeManager;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final fr.a imageHelper;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String webRtcObjectId;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final v cameraProperties;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final yn.a cameraStatsManager;

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
    public final pq.a directFileUploader;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final rq.b selfiePoseManager;

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0089\u0001\u0010\u0016\u001a\u00020\u00152\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0011\u001a\u00020\u00102\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018À\u0006\u0003"}, d2 = {"Lqq/c$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "sessionToken", "inquiryId", "fromComponent", "fromStep", "Lmq/z0;", "selfieType", "fieldKeySelfie", BuildConfig.FLAVOR, "Lmq/b0;", "selfies", "webRtcObjectId", "Lsn/v;", "cameraProperties", BuildConfig.FLAVOR, "startSelfieTimestamp", "fileUploadUrl", "Lrq/b;", "selfiePoseManager", "Lqq/c;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmq/z0;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lsn/v;JLjava/lang/String;Lrq/b;)Lqq/c;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        @NotNull
        c a(@NotNull String sessionToken, @NotNull String inquiryId, @NotNull String fromComponent, @NotNull String fromStep, @NotNull z0 selfieType, @NotNull String fieldKeySelfie, @NotNull List<? extends b0> selfies, @Nullable String webRtcObjectId, @NotNull v cameraProperties, long startSelfieTimestamp, @Nullable String fileUploadUrl, @NotNull rq.b selfiePoseManager);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lqq/c$b;", BuildConfig.FLAVOR, "<init>", "(Ljava/lang/String;I)V", "a", "b", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum b {
        IMAGE,
        VIDEO;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ hu.a f30192d = hu.b.a(a());
    }

    /* JADX INFO: renamed from: qq.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lqq/c$c;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "<init>", "()V", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0592c extends RuntimeException {
        public C0592c() {
            super("File upload returned invalid response.");
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lqq/c$d;", BuildConfig.FLAVOR, "<init>", "()V", "b", "a", "Lqq/c$d$a;", "Lqq/c$d$b;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class d {

        /* JADX INFO: renamed from: qq.c$d$a, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lqq/c$d$a;", "Lqq/c$d;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqq/c$d$b;", "Lqq/c$d;", "<init>", "()V", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class b extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final b f30194a = new b();

            public b() {
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
        public static final /* synthetic */ int[] f30195a;

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
            f30195a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldv/i;", "Lqq/c$d;", BuildConfig.FLAVOR, "<anonymous>", "(Ldv/i;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.selfie.network.SubmitVerificationWorker$run$1", f = "SubmitVerificationWorker.kt", l = {85, 87, 167, 172, 174, 197, MlKitException.CODE_SCANNER_CAMERA_PERMISSION_NOT_GRANTED, MlKitException.CODE_SCANNER_TASK_IN_PROGRESS, 324, 346, 347, 349, 350}, m = "invokeSuspend")
    public static final class f extends m implements Function2<i<? super d>, eu.b<? super Unit>, Object> {
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
        public Object f30196t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f30197u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f30198v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f30199w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f30200x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public Object f30201y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public Object f30202z;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lsw/x;", BuildConfig.FLAVOR, "<anonymous>", "()Lsw/x;"}, k = 3, mv = {2, 2, 0})
        @gu.f(c = "com.withpersona.sdk2.inquiry.selfie.network.SubmitVerificationWorker$run$1$2", f = "SubmitVerificationWorker.kt", l = {326, 331}, m = "invokeSuspend")
        public static final class a extends m implements Function1<eu.b<? super x<? extends Object>>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f30203t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ c f30204u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ List<c0.c> f30205v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(c cVar, List<c0.c> list, eu.b<? super a> bVar) {
                super(1, bVar);
                this.f30204u = cVar;
                this.f30205v = list;
            }

            @Override // gu.a
            public final eu.b<Unit> create(eu.b<?> bVar) {
                return new a(this.f30204u, this.f30205v, bVar);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
            
                if (r6 == r0) goto L19;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
            
                if (r6 == r0) goto L19;
             */
            @Override // gu.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object objE = fu.c.e();
                int i10 = this.f30203t;
                if (i10 != 0) {
                    if (i10 == 1) {
                        zt.o.b(obj);
                        return (x) obj;
                    }
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zt.o.b(obj);
                    return (x) obj;
                }
                zt.o.b(obj);
                if (this.f30204u.fallbackModeManager.b()) {
                    so.a aVar = this.f30204u.fallbackModeManager;
                    String str = this.f30204u.sessionToken;
                    List<c0.c> list = this.f30205v;
                    this.f30203t = 1;
                    obj = aVar.a(str, list, this);
                } else {
                    qq.a aVar2 = this.f30204u.service;
                    String str2 = this.f30204u.sessionToken;
                    String str3 = this.f30204u.inquiryId;
                    List<c0.c> list2 = this.f30205v;
                    this.f30203t = 2;
                    obj = aVar2.b(str2, str3, list2, this);
                }
                return objE;
            }

            @Override // p001kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public final Object invoke(eu.b<? super x<? extends Object>> bVar) {
                return ((a) create(bVar)).invokeSuspend(Unit.f21506a);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f30206a;
            public static final /* synthetic */ int[] b;

            static {
                int[] iArr = new int[xn.a.values().length];
                try {
                    iArr[xn.a.Center.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[xn.a.Left.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[xn.a.Right.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[xn.a.Up.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[xn.a.Down.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f30206a = iArr;
                int[] iArr2 = new int[v.b.values().length];
                try {
                    iArr2[v.b.Unknown.ordinal()] = 1;
                } catch (NoSuchFieldError unused6) {
                }
                b = iArr2;
            }
        }

        public f(eu.b<? super f> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            f fVar = c.this.new f(bVar);
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
        @Override // gu.a
        public final java.lang.Object invokeSuspend(java.lang.Object r41) {
            /*
                Method dump skipped, instruction units count: 3242
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: qq.c.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p001kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i<? super d> iVar, eu.b<? super Unit> bVar) {
            return ((f) create(iVar, bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.withpersona.sdk2.inquiry.selfie.network.SubmitVerificationWorker", f = "SubmitVerificationWorker.kt", l = {367, 368}, m = "uploadIfNeededAndAddFileToBody-BWLJW6A")
    public static final class g extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f30207t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f30208u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f30209v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f30210w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public /* synthetic */ Object f30211x;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f30213z;

        public g(eu.b<? super g> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f30211x = obj;
            this.f30213z |= Integer.MIN_VALUE;
            Object objY = c.this.y(null, null, null, this);
            return objY == fu.c.e() ? objY : n.a(objY);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(@NotNull Context context, @NotNull String sessionToken, @NotNull String inquiryId, @NotNull z0 selfieType, @NotNull List<? extends b0> selfies, @NotNull qq.a service, @NotNull String fromStep, @NotNull String fromComponent, @NotNull String fieldKeySelfie, @NotNull ar.a dataCollector, @NotNull so.a fallbackModeManager, @NotNull fr.a imageHelper, @Nullable String str, @NotNull v cameraProperties, @NotNull yn.a cameraStatsManager, long j10, @NotNull TrackingEventsLogger trackingEventsLogger, @Nullable String str2, @NotNull pq.a directFileUploader, @NotNull rq.b selfiePoseManager) {
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

    @Override // ln.o
    public boolean a(@NotNull o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof c) && Intrinsics.c(this.sessionToken, ((c) otherWorker).sessionToken);
    }

    @Override // ls.j
    public boolean b(@NotNull j<?> jVar) {
        return super.b(jVar);
    }

    @Override // ls.j
    public boolean c(@NotNull j<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof c) && Intrinsics.c(this.sessionToken, ((c) otherWorker).sessionToken);
    }

    @Override // ln.o, ls.j
    @NotNull
    public h<d> run() {
        return dv.j.w(new f(null));
    }

    public final void x(ar.a aVar, List<? extends b0> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof b0.SelfieImage) {
                arrayList.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(p001kotlin.ranges.d.c(j0.f(q.u(arrayList, 10)), 16));
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj2 = arrayList.get(i10);
            i10++;
            linkedHashMap.put(((b0.SelfieImage) obj2).getPose(), obj2);
        }
        aVar.c(new SelfieStepData(this.fromStep, (b0) linkedHashMap.get(xn.a.Center), (b0) linkedHashMap.get(xn.a.Left), (b0) linkedHashMap.get(xn.a.Right), (b0) linkedHashMap.get(xn.a.Up), (b0) linkedHashMap.get(xn.a.Down)));
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:36:0x0163  */
    /* JADX WARN: Code duplicated, block: B:38:0x016c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:33:0x00cf, please report this as an issue */
    public final Object y(File file, b bVar, List<c0.c> list, eu.b<? super n<Unit>> bVar2) {
        g gVar;
        String str;
        Object obj;
        List<c0.c> list2;
        b bVar3;
        File file2;
        Object objA;
        List<c0.c> list3;
        Throwable thE;
        if (bVar2 instanceof g) {
            gVar = (g) bVar2;
            int i10 = gVar.f30213z;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.f30213z = i10 - Integer.MIN_VALUE;
            } else {
                gVar = new g(bVar2);
            }
        } else {
            gVar = new g(bVar2);
        }
        Object obj2 = gVar.f30211x;
        Object objE = fu.c.e();
        int i11 = gVar.f30213z;
        if (i11 == 0) {
            zt.o.b(obj2);
            String str2 = this.fileUploadUrl;
            if (str2 != null && !StringsKt.p0(str2) && bVar != b.VIDEO) {
                pq.a aVar = this.directFileUploader;
                String absolutePath = file.getAbsolutePath();
                Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
                String str3 = this.fileUploadUrl;
                gVar.f30207t = l.a(file);
                gVar.f30208u = l.a(bVar);
                gVar.f30209v = list;
                gVar.f30210w = l.a(file);
                gVar.f30213z = 1;
                Object objI = aVar.i(absolutePath, str3, gVar);
                if (objI != objE) {
                    obj = objI;
                    list2 = list;
                    bVar3 = bVar;
                    file2 = file;
                }
                return objE;
            }
            g0.Companion companion = g0.INSTANCE;
            mv.b0.Companion companion2 = mv.b0.INSTANCE;
            int i12 = e.f30195a[bVar.ordinal()];
            if (i12 == 1) {
                str = "image/*";
            } else {
                if (i12 != 2) {
                    throw new zt.l();
                }
                str = "video/*";
            }
            g0 g0VarB = companion.b(file, companion2.b(str));
            gu.b.a(list.add(c0.c.INSTANCE.c("data[attributes][fields][" + this.fieldKeySelfie + "][files][][frames][]", file.getName(), g0VarB)));
            n.Companion companion3 = n.INSTANCE;
            return n.b(Unit.f21506a);
        }
        if (i11 == 1) {
            File file3 = (File) gVar.f30210w;
            List<c0.c> list4 = (List) gVar.f30209v;
            b bVar4 = (b) gVar.f30208u;
            File file4 = (File) gVar.f30207t;
            zt.o.b(obj2);
            file2 = file3;
            file = file4;
            obj = obj2;
            list2 = list4;
            bVar3 = bVar4;
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list3 = (List) gVar.f30209v;
            zt.o.b(obj2);
            objA = ((n) obj2).getValue();
        }
        if (n.h(objA)) {
            pq.a.UploadResult dVar = (pq.a.UploadResult) objA;
            c0.c.Companion companion4 = c0.c.INSTANCE;
            list3.addAll(p.n(companion4.b("data[attributes][fields][" + this.fieldKeySelfie + "][files][][frames][][fileName]", dVar.getFileName()), companion4.b("data[attributes][fields][" + this.fieldKeySelfie + "][files][][frames][][fileKey]", dVar.getFileKey()), companion4.b("data[attributes][fields][" + this.fieldKeySelfie + "][files][][frames][][fileContentType]", dVar.getFileContentType()), companion4.b("data[attributes][fields][" + this.fieldKeySelfie + "][files][][frames][][fileByteSize]", String.valueOf(dVar.getFileByteSize()))));
        }
        thE = n.e(objA);
        if (thE != null) {
            return n.b(zt.o.a(thE));
        }
        n.a(objA);
        n.Companion companion5 = n.INSTANCE;
        return n.b(Unit.f21506a);
        gVar.f30207t = l.a(file);
        gVar.f30208u = l.a(bVar3);
        gVar.f30209v = list2;
        gVar.f30210w = l.a(file2);
        gVar.f30213z = 2;
        objA = ((pq.a.e) obj).a(gVar);
        if (objA != objE) {
            list3 = list2;
            if (n.h(objA)) {
                pq.a.UploadResult dVar2 = (pq.a.UploadResult) objA;
                c0.c.Companion companion6 = c0.c.INSTANCE;
                list3.addAll(p.n(companion6.b("data[attributes][fields][" + this.fieldKeySelfie + "][files][][frames][][fileName]", dVar2.getFileName()), companion6.b("data[attributes][fields][" + this.fieldKeySelfie + "][files][][frames][][fileKey]", dVar2.getFileKey()), companion6.b("data[attributes][fields][" + this.fieldKeySelfie + "][files][][frames][][fileContentType]", dVar2.getFileContentType()), companion6.b("data[attributes][fields][" + this.fieldKeySelfie + "][files][][frames][][fileByteSize]", String.valueOf(dVar2.getFileByteSize()))));
            }
            thE = n.e(objA);
            if (thE != null) {
                return n.b(zt.o.a(thE));
            }
            n.a(objA);
            n.Companion companion7 = n.INSTANCE;
            return n.b(Unit.f21506a);
        }
        return objE;
    }
}
