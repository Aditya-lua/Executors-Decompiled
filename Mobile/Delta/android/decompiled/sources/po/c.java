package po;

import android.content.Context;
import com.appsflyer.R;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.governmentid.Frame;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentId;
import com.withpersona.sdk2.inquiry.governmentid.network.GovernmentIdRequestArguments;
import com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import jt.n;
import jv.x;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nu.i;
import nu.j;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pt.f;
import pt.m;
import vr.h;
import ym.o;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0019\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0002 CB\u008b\u0001\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\u0006\u0012\b\b\u0001\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010 \u001a\u00020\u001f2\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b \u0010!J\u001b\u0010\"\u001a\u00020\u001f2\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\"\u0010#J\u0015\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020$H\u0016¢\u0006\u0004\b%\u0010&J0\u0010,\u001a\b\u0012\u0004\u0012\u00020+0**\u00020\r2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'2\u0006\u0010\u0017\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010.R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010/R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010/R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010/R\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010/R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010/R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010B¨\u0006D"}, d2 = {"Lpo/c;", "Lym/o;", "Lpo/c$b;", "Lvr/h;", "Landroid/content/Context;", "context", "", "sessionToken", "inquiryId", "fromStep", "fromComponent", "Lcom/withpersona/sdk2/inquiry/governmentid/network/b;", "service", "Lcom/withpersona/sdk2/inquiry/governmentid/network/GovernmentIdRequestArguments;", "governmentIdRequestArguments", "Lmq/a;", "dataCollector", "Lfo/a;", "fallbackModeManager", "Lrq/a;", "imageHelper", "webRtcObjectId", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "Lln/a;", "cameraStatsManager", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/network/b;Lcom/withpersona/sdk2/inquiry/governmentid/network/GovernmentIdRequestArguments;Lmq/a;Lfo/a;Lrq/a;Ljava/lang/String;Lcom/withpersona/sdk2/camera/CameraProperties;Lln/a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V", "otherWorker", "", "b", "(Lym/o;)Z", "c", "(Lvr/h;)Z", "Lnu/h;", "run", "()Lnu/h;", "", "Lokhttp3/MultipartBody$Part;", "body", "Ljt/n;", "", "o", "(Lcom/withpersona/sdk2/inquiry/governmentid/network/GovernmentIdRequestArguments;Ljava/util/List;Lcom/withpersona/sdk2/camera/CameraProperties;Lnt/b;)Ljava/lang/Object;", "Landroid/content/Context;", "Ljava/lang/String;", "d", "e", "f", "g", "Lcom/withpersona/sdk2/inquiry/governmentid/network/b;", "h", "Lcom/withpersona/sdk2/inquiry/governmentid/network/GovernmentIdRequestArguments;", "i", "Lmq/a;", "j", "Lfo/a;", "k", "Lrq/a;", "l", "m", "Lcom/withpersona/sdk2/camera/CameraProperties;", "n", "Lln/a;", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "a", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements o<b>, h<b> {

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
    public final String fromStep;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String fromComponent;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.inquiry.governmentid.network.b service;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final GovernmentIdRequestArguments governmentIdRequestArguments;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final mq.a dataCollector;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final fo.a fallbackModeManager;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final rq.a imageHelper;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String webRtcObjectId;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CameraProperties cameraProperties;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ln.a cameraStatsManager;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001JW\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lpo/c$a;", "", "", "sessionToken", "inquiryId", "fromComponent", "fromStep", "Lcom/withpersona/sdk2/inquiry/governmentid/network/GovernmentIdRequestArguments;", "governmentIdRequestArguments", "webRtcObjectId", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "Lpo/c;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/network/GovernmentIdRequestArguments;Ljava/lang/String;Lcom/withpersona/sdk2/camera/CameraProperties;)Lpo/c;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        @NotNull
        c a(@NotNull String sessionToken, @NotNull String inquiryId, @NotNull String fromComponent, @NotNull String fromStep, @Nullable GovernmentIdRequestArguments governmentIdRequestArguments, @Nullable String webRtcObjectId, @NotNull CameraProperties cameraProperties);
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lpo/c$b;", "", "<init>", "()V", "c", "b", "a", "Lpo/c$b$a;", "Lpo/c$b$b;", "Lpo/c$b$c;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class b {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lpo/c$b$a;", "Lpo/c$b;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", "a", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final InternalErrorInfo cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@NotNull InternalErrorInfo cause) {
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

        /* JADX INFO: renamed from: po.c$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lpo/c$b$b;", "Lpo/c$b;", "Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse;)V", "a", "Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse;", "()Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class C0501b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final GenericFileUploadErrorResponse.DocumentErrorResponse cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0501b(@NotNull GenericFileUploadErrorResponse.DocumentErrorResponse cause) {
                super(null);
                Intrinsics.checkNotNullParameter(cause, "cause");
                this.cause = cause;
            }

            @NotNull
            /* JADX INFO: renamed from: a, reason: from getter */
            public final GenericFileUploadErrorResponse.DocumentErrorResponse getCause() {
                return this.cause;
            }
        }

        /* JADX INFO: renamed from: po.c$b$c, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lpo/c$b$c;", "Lpo/c$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C0502c extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0502c f28781a = new C0502c();

            public C0502c() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof C0502c);
            }

            public int hashCode() {
                return 1775834809;
            }

            @NotNull
            public String toString() {
                return "Success";
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public b() {
        }
    }

    /* JADX INFO: renamed from: po.c$c, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C0503c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28782a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[CameraProperties.b.values().length];
            try {
                iArr[CameraProperties.b.Unknown.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f28782a = iArr;
            int[] iArr2 = new int[GovernmentId.b.values().length];
            try {
                iArr2[GovernmentId.b.FRONT.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[GovernmentId.b.BACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[GovernmentId.b.FRONT_AND_BACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            b = iArr2;
        }
    }

    @f(c = "com.withpersona.sdk2.inquiry.governmentid.network.SubmitVerificationWorker", f = "SubmitVerificationWorker.kt", l = {235}, m = "addToForm-BWLJW6A")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class d extends pt.d {
        public Object A;
        public Object B;
        public Object C;
        public Object D;
        public int E;
        public int F;
        public int G;
        public int H;
        public /* synthetic */ Object I;
        public int K;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f28783t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f28784u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f28785v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f28786w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f28787x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public Object f28788y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public Object f28789z;

        public d(nt.b<? super d> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.I = obj;
            this.K |= Integer.MIN_VALUE;
            Object objO = c.this.o(null, null, null, this);
            return objO == ot.c.e() ? objO : n.a(objO);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lnu/i;", "Lpo/c$b;", "", "<anonymous>", "(Lnu/i;)V"}, k = 3, mv = {2, 2, 0})
    @f(c = "com.withpersona.sdk2.inquiry.governmentid.network.SubmitVerificationWorker$run$1", f = "SubmitVerificationWorker.kt", l = {79, 81, 85, 107, R.styleable.AppCompatTheme_windowMinWidthMinor, 127, 134}, m = "invokeSuspend")
    public static final class e extends m implements Function2<i<? super b>, nt.b<? super Unit>, Object> {
        public /* synthetic */ Object A;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f28790t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f28791u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f28792v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f28793w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f28794x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f28795y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f28796z;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljv/x;", "", "<anonymous>", "()Ljv/x;"}, k = 3, mv = {2, 2, 0})
        @f(c = "com.withpersona.sdk2.inquiry.governmentid.network.SubmitVerificationWorker$run$1$2", f = "SubmitVerificationWorker.kt", l = {87, 92}, m = "invokeSuspend")
        public static final class a extends m implements Function1<nt.b<? super x<? extends Object>>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f28797t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ c f28798u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ List<MultipartBody.Part> f28799v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(c cVar, List<MultipartBody.Part> list, nt.b<? super a> bVar) {
                super(1, bVar);
                this.f28798u = cVar;
                this.f28799v = list;
            }

            @Override // pt.a
            public final nt.b<Unit> create(nt.b<?> bVar) {
                return new a(this.f28798u, this.f28799v, bVar);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
            
                if (r6 == r0) goto L19;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
            
                if (r6 == r0) goto L19;
             */
            @Override // pt.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                /*
                    r5 = this;
                    java.lang.Object r0 = ot.c.e()
                    int r1 = r5.f28797t
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L1e
                    if (r1 == r3) goto L1a
                    if (r1 != r2) goto L12
                    jt.o.b(r6)
                    goto L64
                L12:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r0)
                    throw r6
                L1a:
                    jt.o.b(r6)
                    goto L44
                L1e:
                    jt.o.b(r6)
                    po.c r6 = r5.f28798u
                    fo.a r6 = po.c.g(r6)
                    boolean r6 = r6.b()
                    if (r6 == 0) goto L47
                    po.c r6 = r5.f28798u
                    fo.a r6 = po.c.g(r6)
                    po.c r1 = r5.f28798u
                    java.lang.String r1 = po.c.m(r1)
                    java.util.List<okhttp3.MultipartBody$Part> r2 = r5.f28799v
                    r5.f28797t = r3
                    java.lang.Object r6 = r6.a(r1, r2, r5)
                    if (r6 != r0) goto L44
                    goto L63
                L44:
                    jv.x r6 = (jv.x) r6
                    return r6
                L47:
                    po.c r6 = r5.f28798u
                    com.withpersona.sdk2.inquiry.governmentid.network.b r6 = po.c.l(r6)
                    po.c r1 = r5.f28798u
                    java.lang.String r1 = po.c.m(r1)
                    po.c r3 = r5.f28798u
                    java.lang.String r3 = po.c.k(r3)
                    java.util.List<okhttp3.MultipartBody$Part> r4 = r5.f28799v
                    r5.f28797t = r2
                    java.lang.Object r6 = r6.a(r1, r3, r4, r5)
                    if (r6 != r0) goto L64
                L63:
                    return r0
                L64:
                    jv.x r6 = (jv.x) r6
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: po.c.e.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public final Object invoke(nt.b<? super x<? extends Object>> bVar) {
                return ((a) create(bVar)).invokeSuspend(Unit.f22483a);
            }
        }

        public e(nt.b<? super e> bVar) {
            super(2, bVar);
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            e eVar = c.this.new e(bVar);
            eVar.A = obj;
            return eVar;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0041 A[PHI: r2 r14
          0x0041: PHI (r2v11 java.util.List) = (r2v5 java.util.List), (r2v15 java.util.List) binds: [B:27:0x0117, B:9:0x003a] A[DONT_GENERATE, DONT_INLINE]
          0x0041: PHI (r14v17 java.lang.Object) = (r14v10 java.lang.Object), (r14v0 java.lang.Object) binds: [B:27:0x0117, B:9:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:20:0x00d1  */
        /* JADX WARN: Code duplicated, block: B:25:0x00fe  */
        /* JADX WARN: Code duplicated, block: B:31:0x0124  */
        /* JADX WARN: Code duplicated, block: B:33:0x0135  */
        /* JADX WARN: Code duplicated, block: B:40:0x014d  */
        /* JADX WARN: Code duplicated, block: B:43:0x0163 A[LOOP:1: B:41:0x015d->B:43:0x0163, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:49:0x019b  */
        /* JADX WARN: Code duplicated, block: B:51:0x01a8  */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x00f7, code lost:
        
            if (r0.emit(r14, r13) == r1) goto L66;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x021b, code lost:
        
            if (r0.emit(r6, r13) == r1) goto L66;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x0252, code lost:
        
            if (r0.emit(r6, r13) == r1) goto L66;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x0279, code lost:
        
            if (r0.emit(r4, r13) == r1) goto L66;
         */
        @Override // pt.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instruction units count: 660
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: po.c.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i<? super b> iVar, nt.b<? super Unit> bVar) {
            return ((e) create(iVar, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    public c(@NotNull Context context, @NotNull String sessionToken, @NotNull String inquiryId, @NotNull String fromStep, @NotNull String fromComponent, @NotNull com.withpersona.sdk2.inquiry.governmentid.network.b service, @Nullable GovernmentIdRequestArguments governmentIdRequestArguments, @NotNull mq.a dataCollector, @NotNull fo.a fallbackModeManager, @NotNull rq.a imageHelper, @Nullable String str, @NotNull CameraProperties cameraProperties, @NotNull ln.a cameraStatsManager, @NotNull TrackingEventsLogger trackingEventsLogger) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Intrinsics.checkNotNullParameter(fromStep, "fromStep");
        Intrinsics.checkNotNullParameter(fromComponent, "fromComponent");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(dataCollector, "dataCollector");
        Intrinsics.checkNotNullParameter(fallbackModeManager, "fallbackModeManager");
        Intrinsics.checkNotNullParameter(imageHelper, "imageHelper");
        Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
        Intrinsics.checkNotNullParameter(cameraStatsManager, "cameraStatsManager");
        Intrinsics.checkNotNullParameter(trackingEventsLogger, "trackingEventsLogger");
        this.context = context;
        this.sessionToken = sessionToken;
        this.inquiryId = inquiryId;
        this.fromStep = fromStep;
        this.fromComponent = fromComponent;
        this.service = service;
        this.governmentIdRequestArguments = governmentIdRequestArguments;
        this.dataCollector = dataCollector;
        this.fallbackModeManager = fallbackModeManager;
        this.imageHelper = imageHelper;
        this.webRtcObjectId = str;
        this.cameraProperties = cameraProperties;
        this.cameraStatsManager = cameraStatsManager;
        this.trackingEventsLogger = trackingEventsLogger;
    }

    public static final List<MultipartBody.Part> p(GovernmentIdRequestArguments governmentIdRequestArguments, List<Frame> list) {
        ArrayList arrayList = new ArrayList();
        for (Frame frame : list) {
            u.z(arrayList, kotlin.collections.o.d(MultipartBody.Part.INSTANCE.createFormData("data[attributes][fields][" + governmentIdRequestArguments.getFieldKeyDocument() + "][files][][frames][]", new File(frame.getAbsoluteFilePath()).getName(), RequestBody.INSTANCE.create(new File(frame.getAbsoluteFilePath()), MediaType.INSTANCE.parse(frame.getMimeType())))));
        }
        return arrayList;
    }

    @Override // vr.h
    public boolean a(@NotNull h<?> hVar) {
        return super.a(hVar);
    }

    @Override // ym.o
    public boolean b(@NotNull o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof c) && Intrinsics.c(this.sessionToken, ((c) otherWorker).sessionToken);
    }

    @Override // vr.h
    public boolean c(@NotNull h<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof c) && Intrinsics.c(this.sessionToken, ((c) otherWorker).sessionToken);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x031d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0347  */
    /* JADX WARN: Code duplicated, block: B:51:0x0366  */
    /* JADX WARN: Code duplicated, block: B:53:0x03b3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:54:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:60:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:62:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:64:0x0410  */
    /* JADX WARN: Code duplicated, block: B:66:0x0413  */
    /* JADX WARN: Code duplicated, block: B:68:0x0416  */
    /* JADX WARN: Code duplicated, block: B:69:0x0419  */
    /* JADX WARN: Code duplicated, block: B:71:0x041f  */
    /* JADX WARN: Code duplicated, block: B:72:0x0422  */
    /* JADX WARN: Code duplicated, block: B:75:0x0477  */
    /* JADX WARN: Code duplicated, block: B:77:0x0480  */
    /* JADX WARN: Code duplicated, block: B:79:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:81:0x04ca  */
    /* JADX WARN: Code duplicated, block: B:83:0x050a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x031d -> B:47:0x033f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x03b4 -> B:12:0x008c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x03d5 -> B:61:0x03e1). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object o(com.withpersona.sdk2.inquiry.governmentid.network.GovernmentIdRequestArguments r31, java.util.List<okhttp3.MultipartBody.Part> r32, com.withpersona.sdk2.camera.CameraProperties r33, nt.b<? super jt.n<kotlin.Unit>> r34) {
        /*
            Method dump skipped, instruction units count: 1488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: po.c.o(com.withpersona.sdk2.inquiry.governmentid.network.GovernmentIdRequestArguments, java.util.List, com.withpersona.sdk2.camera.CameraProperties, nt.b):java.lang.Object");
    }

    @Override // ym.o, vr.h
    @NotNull
    public nu.h<b> run() {
        return j.w(new e(null));
    }
}
