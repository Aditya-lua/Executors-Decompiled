package p361po;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.appsflyer.C1759R;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.governmentid.Frame;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentId;
import com.withpersona.sdk2.inquiry.governmentid.network.GovernmentIdRequestArguments;
import com.withpersona.sdk2.inquiry.governmentid.network.InterfaceC3570b;
import com.withpersona.sdk2.inquiry.network.core.ErrorResponse;
import com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.core.NetworkCallResult;
import com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.GovIdCaptureState;
import com.withpersona.sdk2.inquiry.tracking.model.GovernmentIdStateEventData;
import fo.InterfaceC5720a;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7697o;
import kotlin.collections.C7699p;
import kotlin.collections.C7708u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mq.InterfaceC8644a;
import nu.C9579j;
import nu.InterfaceC9575h;
import nu.InterfaceC9577i;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7347n;
import p229jt.C7348o;
import p231jv.C7396x;
import p276ln.InterfaceC8169a;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p420rq.InterfaceC11067a;
import p471um.C11888w;
import p499vr.InterfaceC12257h;
import p581ym.InterfaceC13222o;
import pt.AbstractC10342d;
import pt.AbstractC10351m;
import pt.C10350l;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: po.c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0019\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0002 CB\u008b\u0001\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\u0006\u0012\b\b\u0001\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010 \u001a\u00020\u001f2\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b \u0010!J\u001b\u0010\"\u001a\u00020\u001f2\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\"\u0010#J\u0015\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020$H\u0016¢\u0006\u0004\b%\u0010&J0\u0010,\u001a\b\u0012\u0004\u0012\u00020+0**\u00020\r2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'2\u0006\u0010\u0017\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010.R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010/R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010/R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010/R\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010/R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010/R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010B¨\u0006D"}, m31665d2 = {"Lpo/c;", "Lym/o;", "Lpo/c$b;", "Lvr/h;", "Landroid/content/Context;", "context", "", "sessionToken", "inquiryId", "fromStep", "fromComponent", "Lcom/withpersona/sdk2/inquiry/governmentid/network/b;", NotificationCompat.CATEGORY_SERVICE, "Lcom/withpersona/sdk2/inquiry/governmentid/network/GovernmentIdRequestArguments;", "governmentIdRequestArguments", "Lmq/a;", "dataCollector", "Lfo/a;", "fallbackModeManager", "Lrq/a;", "imageHelper", "webRtcObjectId", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "Lln/a;", "cameraStatsManager", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/network/b;Lcom/withpersona/sdk2/inquiry/governmentid/network/GovernmentIdRequestArguments;Lmq/a;Lfo/a;Lrq/a;Ljava/lang/String;Lcom/withpersona/sdk2/camera/CameraProperties;Lln/a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V", "otherWorker", "", "b", "(Lym/o;)Z", "c", "(Lvr/h;)Z", "Lnu/h;", "run", "()Lnu/h;", "", "Lokhttp3/MultipartBody$Part;", "body", "Ljt/n;", "", "o", "(Lcom/withpersona/sdk2/inquiry/governmentid/network/GovernmentIdRequestArguments;Ljava/util/List;Lcom/withpersona/sdk2/camera/CameraProperties;Lnt/b;)Ljava/lang/Object;", "Landroid/content/Context;", "Ljava/lang/String;", "d", "e", "f", "g", "Lcom/withpersona/sdk2/inquiry/governmentid/network/b;", "h", "Lcom/withpersona/sdk2/inquiry/governmentid/network/GovernmentIdRequestArguments;", "i", "Lmq/a;", "j", "Lfo/a;", "k", "Lrq/a;", "l", "m", "Lcom/withpersona/sdk2/camera/CameraProperties;", "n", "Lln/a;", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "a", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C10303c implements InterfaceC13222o<b>, InterfaceC12257h<b> {

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
    public final String fromStep;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final String fromComponent;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC3570b service;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public final GovernmentIdRequestArguments governmentIdRequestArguments;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC8644a dataCollector;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC5720a fallbackModeManager;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC11067a imageHelper;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public final String webRtcObjectId;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final CameraProperties cameraProperties;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC8169a cameraStatsManager;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    /* JADX INFO: renamed from: po.c$a */
    @Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001JW\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000fÀ\u0006\u0003"}, m31665d2 = {"Lpo/c$a;", "", "", "sessionToken", "inquiryId", "fromComponent", "fromStep", "Lcom/withpersona/sdk2/inquiry/governmentid/network/GovernmentIdRequestArguments;", "governmentIdRequestArguments", "webRtcObjectId", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "Lpo/c;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/network/GovernmentIdRequestArguments;Ljava/lang/String;Lcom/withpersona/sdk2/camera/CameraProperties;)Lpo/c;", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public interface a {
        @NotNull
        /* JADX INFO: renamed from: a */
        C10303c mo39594a(@NotNull String sessionToken, @NotNull String inquiryId, @NotNull String fromComponent, @NotNull String fromStep, @Nullable GovernmentIdRequestArguments governmentIdRequestArguments, @Nullable String webRtcObjectId, @NotNull CameraProperties cameraProperties);
    }

    /* JADX INFO: renamed from: po.c$b */
    @Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m31665d2 = {"Lpo/c$b;", "", "<init>", "()V", "c", "b", "a", "Lpo/c$b$a;", "Lpo/c$b$b;", "Lpo/c$b$c;", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static abstract class b {

        /* JADX INFO: renamed from: po.c$b$a */
        @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, m31665d2 = {"Lpo/c$b$a;", "Lpo/c$b;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", "a", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
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
        @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, m31665d2 = {"Lpo/c$b$b;", "Lpo/c$b;", "Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse;)V", "a", "Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse;", "()Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse;", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C14231b extends b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            public final GenericFileUploadErrorResponse.DocumentErrorResponse cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C14231b(@NotNull GenericFileUploadErrorResponse.DocumentErrorResponse cause) {
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

        /* JADX INFO: renamed from: po.c$b$c */
        @Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lpo/c$b$c;", "Lpo/c$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class c extends b {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final c f37061a = new c();

            public c() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof c);
            }

            public int hashCode() {
                return 1775834809;
            }

            @NotNull
            public String toString() {
                return "Success";
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: po.c.b.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public b() {
        }
    }

    /* JADX INFO: renamed from: po.c$c */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f37062a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f37063b;

        static {
            int[] iArr = new int[CameraProperties.EnumC3397b.values().length];
            try {
                iArr[CameraProperties.EnumC3397b.Unknown.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f37062a = iArr;
            int[] iArr2 = new int[GovernmentId.EnumC3486b.values().length];
            try {
                iArr2[GovernmentId.EnumC3486b.FRONT.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[GovernmentId.EnumC3486b.BACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[GovernmentId.EnumC3486b.FRONT_AND_BACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            f37063b = iArr2;
        }
    }

    /* JADX INFO: renamed from: po.c$d */
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.governmentid.network.SubmitVerificationWorker", m39664f = "SubmitVerificationWorker.kt", m39665l = {235}, m39666m = "addToForm-BWLJW6A")
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class d extends AbstractC10342d {

        /* JADX INFO: renamed from: A */
        public Object f37064A;

        /* JADX INFO: renamed from: B */
        public Object f37065B;

        /* JADX INFO: renamed from: C */
        public Object f37066C;

        /* JADX INFO: renamed from: D */
        public Object f37067D;

        /* JADX INFO: renamed from: E */
        public int f37068E;

        /* JADX INFO: renamed from: F */
        public int f37069F;

        /* JADX INFO: renamed from: G */
        public int f37070G;

        /* JADX INFO: renamed from: H */
        public int f37071H;

        /* JADX INFO: renamed from: I */
        public /* synthetic */ Object f37072I;

        /* JADX INFO: renamed from: K */
        public int f37074K;

        /* JADX INFO: renamed from: t */
        public Object f37075t;

        /* JADX INFO: renamed from: u */
        public Object f37076u;

        /* JADX INFO: renamed from: v */
        public Object f37077v;

        /* JADX INFO: renamed from: w */
        public Object f37078w;

        /* JADX INFO: renamed from: x */
        public Object f37079x;

        /* JADX INFO: renamed from: y */
        public Object f37080y;

        /* JADX INFO: renamed from: z */
        public Object f37081z;

        public d(InterfaceC9557b<? super d> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f37072I = obj;
            this.f37074K |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            Object objM39593o = C10303c.this.m39593o(null, null, null, this);
            return objM39593o == C10047c.m38805e() ? objM39593o : C7347n.m30459a(objM39593o);
        }
    }

    /* JADX INFO: renamed from: po.c$e */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lnu/i;", "Lpo/c$b;", "", "<anonymous>", "(Lnu/i;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.governmentid.network.SubmitVerificationWorker$run$1", m39664f = "SubmitVerificationWorker.kt", m39665l = {79, 81, 85, 107, C1759R.styleable.AppCompatTheme_windowMinWidthMinor, 127, 134}, m39666m = "invokeSuspend")
    public static final class e extends AbstractC10351m implements Function2<InterfaceC9577i<? super b>, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: A */
        public /* synthetic */ Object f37082A;

        /* JADX INFO: renamed from: t */
        public Object f37084t;

        /* JADX INFO: renamed from: u */
        public Object f37085u;

        /* JADX INFO: renamed from: v */
        public Object f37086v;

        /* JADX INFO: renamed from: w */
        public Object f37087w;

        /* JADX INFO: renamed from: x */
        public int f37088x;

        /* JADX INFO: renamed from: y */
        public int f37089y;

        /* JADX INFO: renamed from: z */
        public int f37090z;

        /* JADX INFO: renamed from: po.c$e$a */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Ljv/x;", "", "<anonymous>", "()Ljv/x;"}, m31666k = 3, m31667mv = {2, 2, 0})
        @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.governmentid.network.SubmitVerificationWorker$run$1$2", m39664f = "SubmitVerificationWorker.kt", m39665l = {87, 92}, m39666m = "invokeSuspend")
        public static final class a extends AbstractC10351m implements Function1<InterfaceC9557b<? super C7396x<? extends Object>>, Object> {

            /* JADX INFO: renamed from: t */
            public int f37091t;

            /* JADX INFO: renamed from: u */
            public final /* synthetic */ C10303c f37092u;

            /* JADX INFO: renamed from: v */
            public final /* synthetic */ List<MultipartBody.Part> f37093v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C10303c c10303c, List<MultipartBody.Part> list, InterfaceC9557b<? super a> interfaceC9557b) {
                super(1, interfaceC9557b);
                this.f37092u = c10303c;
                this.f37093v = list;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(InterfaceC9557b<?> interfaceC9557b) {
                return new a(this.f37092u, this.f37093v, interfaceC9557b);
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
                int i10 = this.f37091t;
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
                if (this.f37092u.fallbackModeManager.mo22892b()) {
                    InterfaceC5720a interfaceC5720a = this.f37092u.fallbackModeManager;
                    String str = this.f37092u.sessionToken;
                    List<MultipartBody.Part> list = this.f37093v;
                    this.f37091t = 1;
                    obj = interfaceC5720a.mo22891a(str, list, this);
                } else {
                    InterfaceC3570b interfaceC3570b = this.f37092u.service;
                    String str2 = this.f37092u.sessionToken;
                    String str3 = this.f37092u.inquiryId;
                    List<MultipartBody.Part> list2 = this.f37093v;
                    this.f37091t = 2;
                    obj = interfaceC3570b.m17727a(str2, str3, list2, this);
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

        public e(InterfaceC9557b<? super e> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            e eVar = C10303c.this.new e(interfaceC9557b);
            eVar.f37082A = obj;
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
        @Override // pt.AbstractC10339a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            List listM31897p;
            Object objM39593o;
            Throwable thM30463e;
            List list;
            NetworkCallResult networkCallResult;
            C10303c c10303c;
            b.c cVar;
            GovernmentIdRequestArguments governmentIdRequestArguments;
            List<GovernmentId> listM17717g;
            Iterator<T> it;
            Iterator<T> it2;
            InternalErrorInfo.NetworkErrorInfo networkErrorInfo;
            InterfaceC9577i interfaceC9577i = (InterfaceC9577i) this.f37082A;
            Object objM38805e = C10047c.m38805e();
            GenericFileUploadErrorResponse genericFileUploadErrorResponse = null;
            switch (this.f37090z) {
                case 0:
                    C7348o.m30470b(obj);
                    TrackingEventsLogger.logGovernmentIdStateEvent$default(C10303c.this.trackingEventsLogger, new GovernmentIdStateEventData(GovIdCaptureState.SUBMITTING, null, null, null, 12, null), false, 2, null);
                    MultipartBody.Part.Companion companion = MultipartBody.Part.INSTANCE;
                    listM31897p = C7699p.m31897p(companion.createFormData("data[id]", C10303c.this.inquiryId), companion.createFormData("data[type]", "inquiry"), companion.createFormData("meta[from_component]", C10303c.this.fromComponent), companion.createFormData("meta[from_step]", C10303c.this.fromStep));
                    GovernmentIdRequestArguments governmentIdRequestArguments2 = C10303c.this.governmentIdRequestArguments;
                    if (governmentIdRequestArguments2 != null) {
                        C10303c c10303c2 = C10303c.this;
                        CameraProperties cameraProperties = c10303c2.cameraProperties;
                        this.f37082A = interfaceC9577i;
                        this.f37084t = listM31897p;
                        this.f37090z = 1;
                        objM39593o = c10303c2.m39593o(governmentIdRequestArguments2, listM31897p, cameraProperties, this);
                        if (objM39593o != objM38805e) {
                            thM30463e = C7347n.m30463e(objM39593o);
                            if (thM30463e != null) {
                                b.a aVar = new b.a(new InternalErrorInfo.UnknownErrorInfo("Error adding data to form."));
                                this.f37082A = C10350l.m39676a(interfaceC9577i);
                                this.f37084t = C10350l.m39676a(listM31897p);
                                this.f37085u = C10350l.m39676a(thM30463e);
                                this.f37088x = 0;
                                this.f37090z = 2;
                            } else {
                                C7347n.m30459a(objM39593o);
                                a aVar2 = new a(C10303c.this, listM31897p, null);
                                this.f37082A = interfaceC9577i;
                                this.f37084t = C10350l.m39676a(listM31897p);
                                this.f37090z = 3;
                                obj = NetworkUtilsKt.enqueueVerificationRequestWithRetry(aVar2, this);
                                if (obj != objM38805e) {
                                    list = listM31897p;
                                    networkCallResult = (NetworkCallResult) obj;
                                    c10303c = C10303c.this;
                                    if (networkCallResult instanceof NetworkCallResult.Success) {
                                        Object response = ((NetworkCallResult.Success) networkCallResult).getResponse();
                                        if (!c10303c.dataCollector.getIsActive() && (governmentIdRequestArguments = c10303c.governmentIdRequestArguments) != null && (listM17717g = governmentIdRequestArguments.m17717g()) != null) {
                                            it = listM17717g.iterator();
                                            while (it.hasNext()) {
                                                it2 = ((GovernmentId) it.next()).mo16936d3().iterator();
                                                while (it2.hasNext()) {
                                                    new File(((Frame) it2.next()).getAbsoluteFilePath()).delete();
                                                }
                                            }
                                        }
                                        cVar = b.c.f37061a;
                                        this.f37082A = interfaceC9577i;
                                        this.f37084t = C10350l.m39676a(list);
                                        this.f37085u = networkCallResult;
                                        this.f37086v = C10350l.m39676a(response);
                                        this.f37088x = 0;
                                        this.f37089y = 0;
                                        this.f37090z = 4;
                                        if (interfaceC9577i.emit(cVar, this) != objM38805e) {
                                        }
                                    }
                                    if (networkCallResult instanceof NetworkCallResult.Failure) {
                                        networkErrorInfo = ((NetworkCallResult.Failure) networkCallResult).getNetworkErrorInfo();
                                        if (!networkErrorInfo.isRecoverable() && (networkErrorInfo.getResponseError() instanceof ErrorResponse.Error.UnknownError)) {
                                            ErrorResponse.Error responseError = networkErrorInfo.getResponseError();
                                            Intrinsics.m31981d(responseError, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.core.ErrorResponse.Error.UnknownError");
                                            ResponseBody errorBody = ((ErrorResponse.Error.UnknownError) responseError).getErrorBody();
                                            if (errorBody != null) {
                                                try {
                                                    genericFileUploadErrorResponse = (GenericFileUploadErrorResponse) new C11888w.b().m44444c(GenericFileUploadErrorResponse.Companion.getAdapter()).m44445d().m44436c(GenericFileUploadErrorResponse.class).fromJson(errorBody.getSource());
                                                } catch (Exception unused) {
                                                }
                                            }
                                            if (genericFileUploadErrorResponse == null) {
                                                b.C14231b c14231b = new b.C14231b(new GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError(null, null, null, 7, null));
                                                this.f37082A = C10350l.m39676a(interfaceC9577i);
                                                this.f37084t = C10350l.m39676a(list);
                                                this.f37085u = networkCallResult;
                                                this.f37086v = C10350l.m39676a(networkErrorInfo);
                                                this.f37087w = C10350l.m39676a(genericFileUploadErrorResponse);
                                                this.f37088x = 0;
                                                this.f37089y = 0;
                                                this.f37090z = 6;
                                            } else {
                                                b.C14231b c14231b2 = new b.C14231b(genericFileUploadErrorResponse.getErrors().get(0));
                                                this.f37082A = C10350l.m39676a(interfaceC9577i);
                                                this.f37084t = C10350l.m39676a(list);
                                                this.f37085u = networkCallResult;
                                                this.f37086v = C10350l.m39676a(networkErrorInfo);
                                                this.f37087w = C10350l.m39676a(genericFileUploadErrorResponse);
                                                this.f37088x = 0;
                                                this.f37089y = 0;
                                                this.f37090z = 5;
                                            }
                                        } else {
                                            b.a aVar3 = new b.a(networkErrorInfo);
                                            this.f37082A = C10350l.m39676a(interfaceC9577i);
                                            this.f37084t = C10350l.m39676a(list);
                                            this.f37085u = networkCallResult;
                                            this.f37086v = C10350l.m39676a(networkErrorInfo);
                                            this.f37088x = 0;
                                            this.f37089y = 0;
                                            this.f37090z = 7;
                                        }
                                        break;
                                    }
                                    return Unit.f29331a;
                                }
                            }
                        }
                        break;
                    } else {
                        a aVar4 = new a(C10303c.this, listM31897p, null);
                        this.f37082A = interfaceC9577i;
                        this.f37084t = C10350l.m39676a(listM31897p);
                        this.f37090z = 3;
                        obj = NetworkUtilsKt.enqueueVerificationRequestWithRetry(aVar4, this);
                        if (obj != objM38805e) {
                            list = listM31897p;
                            networkCallResult = (NetworkCallResult) obj;
                            c10303c = C10303c.this;
                            if (networkCallResult instanceof NetworkCallResult.Success) {
                                Object response2 = ((NetworkCallResult.Success) networkCallResult).getResponse();
                                if (!c10303c.dataCollector.getIsActive()) {
                                    it = listM17717g.iterator();
                                    while (it.hasNext()) {
                                        it2 = ((GovernmentId) it.next()).mo16936d3().iterator();
                                        while (it2.hasNext()) {
                                            new File(((Frame) it2.next()).getAbsoluteFilePath()).delete();
                                        }
                                    }
                                }
                                cVar = b.c.f37061a;
                                this.f37082A = interfaceC9577i;
                                this.f37084t = C10350l.m39676a(list);
                                this.f37085u = networkCallResult;
                                this.f37086v = C10350l.m39676a(response2);
                                this.f37088x = 0;
                                this.f37089y = 0;
                                this.f37090z = 4;
                                if (interfaceC9577i.emit(cVar, this) != objM38805e) {
                                }
                            }
                            if (networkCallResult instanceof NetworkCallResult.Failure) {
                                networkErrorInfo = ((NetworkCallResult.Failure) networkCallResult).getNetworkErrorInfo();
                                if (!networkErrorInfo.isRecoverable()) {
                                }
                                b.a aVar5 = new b.a(networkErrorInfo);
                                this.f37082A = C10350l.m39676a(interfaceC9577i);
                                this.f37084t = C10350l.m39676a(list);
                                this.f37085u = networkCallResult;
                                this.f37086v = C10350l.m39676a(networkErrorInfo);
                                this.f37088x = 0;
                                this.f37089y = 0;
                                this.f37090z = 7;
                                break;
                            }
                            return Unit.f29331a;
                        }
                    }
                    return objM38805e;
                case 1:
                    listM31897p = (List) this.f37084t;
                    C7348o.m30470b(obj);
                    objM39593o = ((C7347n) obj).getValue();
                    thM30463e = C7347n.m30463e(objM39593o);
                    if (thM30463e != null) {
                        b.a aVar6 = new b.a(new InternalErrorInfo.UnknownErrorInfo("Error adding data to form."));
                        this.f37082A = C10350l.m39676a(interfaceC9577i);
                        this.f37084t = C10350l.m39676a(listM31897p);
                        this.f37085u = C10350l.m39676a(thM30463e);
                        this.f37088x = 0;
                        this.f37090z = 2;
                        break;
                    } else {
                        C7347n.m30459a(objM39593o);
                        a aVar7 = new a(C10303c.this, listM31897p, null);
                        this.f37082A = interfaceC9577i;
                        this.f37084t = C10350l.m39676a(listM31897p);
                        this.f37090z = 3;
                        obj = NetworkUtilsKt.enqueueVerificationRequestWithRetry(aVar7, this);
                        if (obj != objM38805e) {
                            list = listM31897p;
                            networkCallResult = (NetworkCallResult) obj;
                            c10303c = C10303c.this;
                            if (networkCallResult instanceof NetworkCallResult.Success) {
                                Object response3 = ((NetworkCallResult.Success) networkCallResult).getResponse();
                                if (!c10303c.dataCollector.getIsActive()) {
                                    it = listM17717g.iterator();
                                    while (it.hasNext()) {
                                        it2 = ((GovernmentId) it.next()).mo16936d3().iterator();
                                        while (it2.hasNext()) {
                                            new File(((Frame) it2.next()).getAbsoluteFilePath()).delete();
                                        }
                                    }
                                }
                                cVar = b.c.f37061a;
                                this.f37082A = interfaceC9577i;
                                this.f37084t = C10350l.m39676a(list);
                                this.f37085u = networkCallResult;
                                this.f37086v = C10350l.m39676a(response3);
                                this.f37088x = 0;
                                this.f37089y = 0;
                                this.f37090z = 4;
                                if (interfaceC9577i.emit(cVar, this) != objM38805e) {
                                }
                            }
                            if (networkCallResult instanceof NetworkCallResult.Failure) {
                                networkErrorInfo = ((NetworkCallResult.Failure) networkCallResult).getNetworkErrorInfo();
                                if (!networkErrorInfo.isRecoverable()) {
                                }
                                b.a aVar8 = new b.a(networkErrorInfo);
                                this.f37082A = C10350l.m39676a(interfaceC9577i);
                                this.f37084t = C10350l.m39676a(list);
                                this.f37085u = networkCallResult;
                                this.f37086v = C10350l.m39676a(networkErrorInfo);
                                this.f37088x = 0;
                                this.f37089y = 0;
                                this.f37090z = 7;
                                break;
                            }
                            return Unit.f29331a;
                        }
                    }
                    return objM38805e;
                case 2:
                    C7348o.m30470b(obj);
                    return Unit.f29331a;
                case 3:
                    listM31897p = (List) this.f37084t;
                    C7348o.m30470b(obj);
                    list = listM31897p;
                    networkCallResult = (NetworkCallResult) obj;
                    c10303c = C10303c.this;
                    if (networkCallResult instanceof NetworkCallResult.Success) {
                        Object response4 = ((NetworkCallResult.Success) networkCallResult).getResponse();
                        if (!c10303c.dataCollector.getIsActive()) {
                            it = listM17717g.iterator();
                            while (it.hasNext()) {
                                it2 = ((GovernmentId) it.next()).mo16936d3().iterator();
                                while (it2.hasNext()) {
                                    new File(((Frame) it2.next()).getAbsoluteFilePath()).delete();
                                }
                            }
                        }
                        cVar = b.c.f37061a;
                        this.f37082A = interfaceC9577i;
                        this.f37084t = C10350l.m39676a(list);
                        this.f37085u = networkCallResult;
                        this.f37086v = C10350l.m39676a(response4);
                        this.f37088x = 0;
                        this.f37089y = 0;
                        this.f37090z = 4;
                        if (interfaceC9577i.emit(cVar, this) != objM38805e) {
                        }
                        return objM38805e;
                    }
                    if (networkCallResult instanceof NetworkCallResult.Failure) {
                        networkErrorInfo = ((NetworkCallResult.Failure) networkCallResult).getNetworkErrorInfo();
                        if (!networkErrorInfo.isRecoverable()) {
                        }
                        b.a aVar9 = new b.a(networkErrorInfo);
                        this.f37082A = C10350l.m39676a(interfaceC9577i);
                        this.f37084t = C10350l.m39676a(list);
                        this.f37085u = networkCallResult;
                        this.f37086v = C10350l.m39676a(networkErrorInfo);
                        this.f37088x = 0;
                        this.f37089y = 0;
                        this.f37090z = 7;
                        break;
                    }
                    return Unit.f29331a;
                case 4:
                    networkCallResult = (NetworkCallResult) this.f37085u;
                    list = (List) this.f37084t;
                    C7348o.m30470b(obj);
                    if (networkCallResult instanceof NetworkCallResult.Failure) {
                        networkErrorInfo = ((NetworkCallResult.Failure) networkCallResult).getNetworkErrorInfo();
                        if (!networkErrorInfo.isRecoverable()) {
                        }
                        b.a aVar10 = new b.a(networkErrorInfo);
                        this.f37082A = C10350l.m39676a(interfaceC9577i);
                        this.f37084t = C10350l.m39676a(list);
                        this.f37085u = networkCallResult;
                        this.f37086v = C10350l.m39676a(networkErrorInfo);
                        this.f37088x = 0;
                        this.f37089y = 0;
                        this.f37090z = 7;
                        break;
                    }
                    return Unit.f29331a;
                case 5:
                case 6:
                case 7:
                    C7348o.m30470b(obj);
                    return Unit.f29331a;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9577i<? super b> interfaceC9577i, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((e) create(interfaceC9577i, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    public C10303c(@NotNull Context context, @NotNull String sessionToken, @NotNull String inquiryId, @NotNull String fromStep, @NotNull String fromComponent, @NotNull InterfaceC3570b service, @Nullable GovernmentIdRequestArguments governmentIdRequestArguments, @NotNull InterfaceC8644a dataCollector, @NotNull InterfaceC5720a fallbackModeManager, @NotNull InterfaceC11067a imageHelper, @Nullable String str, @NotNull CameraProperties cameraProperties, @NotNull InterfaceC8169a cameraStatsManager, @NotNull TrackingEventsLogger trackingEventsLogger) {
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

    /* JADX INFO: renamed from: p */
    public static final List<MultipartBody.Part> m39592p(GovernmentIdRequestArguments governmentIdRequestArguments, List<Frame> list) {
        ArrayList arrayList = new ArrayList();
        for (Frame frame : list) {
            C7708u.m31931z(arrayList, C7697o.m31878d(MultipartBody.Part.INSTANCE.createFormData("data[attributes][fields][" + governmentIdRequestArguments.getFieldKeyDocument() + "][files][][frames][]", new File(frame.getAbsoluteFilePath()).getName(), RequestBody.INSTANCE.create(new File(frame.getAbsoluteFilePath()), MediaType.INSTANCE.parse(frame.getMimeType())))));
        }
        return arrayList;
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
        return (otherWorker instanceof C10303c) && Intrinsics.m31980c(this.sessionToken, ((C10303c) otherWorker).sessionToken);
    }

    @Override // p499vr.InterfaceC12257h
    /* JADX INFO: renamed from: c */
    public boolean mo7574c(@NotNull InterfaceC12257h<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof C10303c) && Intrinsics.m31980c(this.sessionToken, ((C10303c) otherWorker).sessionToken);
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
    /* JADX INFO: renamed from: o */
    public final java.lang.Object m39593o(com.withpersona.sdk2.inquiry.governmentid.network.GovernmentIdRequestArguments r31, java.util.List<okhttp3.MultipartBody.Part> r32, com.withpersona.sdk2.camera.CameraProperties r33, p315nt.InterfaceC9557b<? super p229jt.C7347n<kotlin.Unit>> r34) {
        /*
            r30 = this;
            r0 = r30
            r1 = r32
            r2 = r34
            boolean r3 = r2 instanceof p361po.C10303c.d
            if (r3 == 0) goto L19
            r3 = r2
            po.c$d r3 = (p361po.C10303c.d) r3
            int r4 = r3.f37074K
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f37074K = r4
            goto L1e
        L19:
            po.c$d r3 = new po.c$d
            r3.<init>(r2)
        L1e:
            java.lang.Object r2 = r3.f37072I
            java.lang.Object r4 = p344ot.C10047c.m38805e()
            int r5 = r3.f37074K
            java.lang.String r6 = "][files][][page]"
            java.lang.String r7 = "front_and_back"
            java.lang.String r8 = "toLowerCase(...)"
            java.lang.String r9 = "video"
            java.lang.String r10 = "][files][][type]"
            r11 = 1
            java.lang.String r13 = "data[attributes][fields]["
            if (r5 == 0) goto L98
            if (r5 != r11) goto L90
            int r1 = r3.f37070G
            int r5 = r3.f37069F
            int r14 = r3.f37068E
            java.lang.Object r15 = r3.f37067D
            com.withpersona.sdk2.inquiry.governmentid.Frame r15 = (com.withpersona.sdk2.inquiry.governmentid.Frame) r15
            java.lang.Object r15 = r3.f37065B
            java.util.Iterator r15 = (java.util.Iterator) r15
            java.lang.Object r12 = r3.f37064A
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.lang.Object r11 = r3.f37081z
            com.withpersona.sdk2.inquiry.governmentid.GovernmentId r11 = (com.withpersona.sdk2.inquiry.governmentid.GovernmentId) r11
            r31 = r1
            java.lang.Object r1 = r3.f37080y
            r32 = r1
            java.lang.Object r1 = r3.f37079x
            java.util.Iterator r1 = (java.util.Iterator) r1
            r33 = r1
            java.lang.Object r1 = r3.f37078w
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            r16 = r1
            java.lang.Object r1 = r3.f37077v
            com.withpersona.sdk2.camera.CameraProperties r1 = (com.withpersona.sdk2.camera.CameraProperties) r1
            r17 = r1
            java.lang.Object r1 = r3.f37076u
            java.util.List r1 = (java.util.List) r1
            r18 = r1
            java.lang.Object r1 = r3.f37075t
            com.withpersona.sdk2.inquiry.governmentid.network.GovernmentIdRequestArguments r1 = (com.withpersona.sdk2.inquiry.governmentid.network.GovernmentIdRequestArguments) r1
            p229jt.C7348o.m30470b(r2)
            jt.n r2 = (p229jt.C7347n) r2
            java.lang.Object r2 = r2.getValue()
            r25 = r6
            r19 = r7
            r22 = r8
            r23 = r9
            r24 = r10
            r7 = r12
            r8 = r15
            r9 = 0
            r15 = r33
            r6 = r2
            r12 = r5
            r5 = r3
            r3 = r31
        L8c:
            r2 = r32
            goto L3c0
        L90:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L98:
            p229jt.C7348o.m30470b(r2)
            mq.a r2 = r0.dataCollector
            com.withpersona.sdk2.inquiry.governmentid.network.GovernmentIdStepData r5 = new com.withpersona.sdk2.inquiry.governmentid.network.GovernmentIdStepData
            java.lang.String r11 = r0.fromStep
            java.util.List r12 = r31.m17717g()
            r5.<init>(r11, r12)
            r2.mo34720a(r5)
            okhttp3.MultipartBody$Part$Companion r2 = okhttp3.MultipartBody.Part.INSTANCE
            java.lang.String r5 = r31.getFieldKeyDocument()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r13)
            r11.append(r5)
            java.lang.String r5 = "][cameraProperties][label]"
            r11.append(r5)
            java.lang.String r5 = r11.toString()
            java.lang.String r11 = r33.getLabel()
            okhttp3.MultipartBody$Part r16 = r2.createFormData(r5, r11)
            java.lang.String r5 = r31.getFieldKeyDocument()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r13)
            r11.append(r5)
            java.lang.String r5 = "][cameraProperties][facing_mode]"
            r11.append(r5)
            java.lang.String r5 = r11.toString()
            com.withpersona.sdk2.camera.CameraProperties$b r11 = r33.getFacingMode()
            int[] r12 = p361po.C10303c.c.f37062a
            int r11 = r11.ordinal()
            r11 = r12[r11]
            java.lang.String r12 = ""
            r14 = 1
            if (r11 != r14) goto Lf8
            r11 = r12
            goto L109
        Lf8:
            com.withpersona.sdk2.camera.CameraProperties$b r11 = r33.getFacingMode()
            java.lang.String r11 = r11.toString()
            java.util.Locale r14 = java.util.Locale.ROOT
            java.lang.String r11 = r11.toLowerCase(r14)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r8)
        L109:
            okhttp3.MultipartBody$Part r17 = r2.createFormData(r5, r11)
            java.lang.String r5 = r31.getFieldKeyDocument()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r13)
            r11.append(r5)
            java.lang.String r5 = "][cameraProperties][width]"
            r11.append(r5)
            java.lang.String r5 = r11.toString()
            android.util.Size r11 = r33.getSize()
            int r11 = r11.getWidth()
            java.lang.String r11 = java.lang.String.valueOf(r11)
            okhttp3.MultipartBody$Part r18 = r2.createFormData(r5, r11)
            java.lang.String r5 = r31.getFieldKeyDocument()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r13)
            r11.append(r5)
            java.lang.String r5 = "][cameraProperties][height]"
            r11.append(r5)
            java.lang.String r5 = r11.toString()
            android.util.Size r11 = r33.getSize()
            int r11 = r11.getHeight()
            java.lang.String r11 = java.lang.String.valueOf(r11)
            okhttp3.MultipartBody$Part r19 = r2.createFormData(r5, r11)
            java.lang.String r5 = r31.getFieldKeyDocument()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r13)
            r11.append(r5)
            java.lang.String r5 = "][cameraProperties][aspectRatio]"
            r11.append(r5)
            java.lang.String r5 = r11.toString()
            double r14 = r33.m16170a()
            java.lang.String r11 = java.lang.String.valueOf(r14)
            okhttp3.MultipartBody$Part r20 = r2.createFormData(r5, r11)
            java.lang.String r5 = r31.getFieldKeyDocument()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r13)
            r11.append(r5)
            java.lang.String r5 = "][cameraProperties][frameRate]"
            r11.append(r5)
            java.lang.String r5 = r11.toString()
            int r11 = r33.getFrameRate()
            java.lang.String r11 = java.lang.String.valueOf(r11)
            okhttp3.MultipartBody$Part r21 = r2.createFormData(r5, r11)
            java.lang.String r5 = r31.getFieldKeyDocument()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r13)
            r11.append(r5)
            java.lang.String r5 = "][cameraProperties][kind]"
            r11.append(r5)
            java.lang.String r5 = r11.toString()
            okhttp3.MultipartBody$Part r22 = r2.createFormData(r5, r12)
            java.lang.String r5 = r31.getFieldKeyDocument()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r13)
            r11.append(r5)
            java.lang.String r5 = "][cameraProperties][selectedCameraIndex]"
            r11.append(r5)
            java.lang.String r5 = r11.toString()
            okhttp3.MultipartBody$Part r23 = r2.createFormData(r5, r12)
            java.lang.String r5 = r31.getFieldKeyDocument()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r13)
            r11.append(r5)
            java.lang.String r5 = "][cameraProperties][streamStability]"
            r11.append(r5)
            java.lang.String r5 = r11.toString()
            okhttp3.MultipartBody$Part r24 = r2.createFormData(r5, r12)
            java.lang.String r5 = r31.getFieldKeyDocument()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r13)
            r11.append(r5)
            java.lang.String r5 = "][cameraProperties][allCameraLabels]"
            r11.append(r5)
            java.lang.String r5 = r11.toString()
            okhttp3.MultipartBody$Part r25 = r2.createFormData(r5, r12)
            java.lang.String r5 = r31.getFieldKeyDocument()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r13)
            r11.append(r5)
            java.lang.String r5 = "][cameraProperties][client]"
            r11.append(r5)
            java.lang.String r5 = r11.toString()
            android.content.Context r11 = r0.context
            boolean r11 = p582yn.C13241d0.m48977j(r11)
            if (r11 == 0) goto L238
            java.lang.String r11 = "mobile"
            goto L23a
        L238:
            java.lang.String r11 = "mobile_sdk"
        L23a:
            okhttp3.MultipartBody$Part r26 = r2.createFormData(r5, r11)
            java.lang.String r5 = r31.getFieldKeyDocument()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r13)
            r11.append(r5)
            java.lang.String r5 = "][cameraProperties][platform]"
            r11.append(r5)
            java.lang.String r5 = r11.toString()
            boolean r11 = p582yn.C13249l.m49002a()
            if (r11 == 0) goto L25f
            java.lang.String r11 = "android"
            goto L261
        L25f:
            java.lang.String r11 = "android_sdk"
        L261:
            okhttp3.MultipartBody$Part r27 = r2.createFormData(r5, r11)
            java.lang.String r5 = r31.getFieldKeyDocument()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r13)
            r11.append(r5)
            java.lang.String r5 = "][cameraProperties][factor]"
            r11.append(r5)
            java.lang.String r5 = r11.toString()
            ln.a r11 = r0.cameraStatsManager
            ln.a$a r11 = r11.mo33442b()
            double r11 = r11.getAverageRotation()
            java.lang.String r11 = java.lang.String.valueOf(r11)
            okhttp3.MultipartBody$Part r28 = r2.createFormData(r5, r11)
            okhttp3.MultipartBody$Part[] r2 = new okhttp3.MultipartBody.Part[]{r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28}
            java.util.List r2 = kotlin.collections.C7699p.m31895n(r2)
            java.util.Collection r2 = (java.util.Collection) r2
            r1.addAll(r2)
            java.util.List r2 = r31.m17717g()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            boolean r5 = r2 instanceof java.util.Collection
            if (r5 == 0) goto L2b0
            r5 = r2
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L2b0
            goto L2cd
        L2b0:
            java.util.Iterator r2 = r2.iterator()
        L2b4:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L2cd
            java.lang.Object r5 = r2.next()
            com.withpersona.sdk2.inquiry.governmentid.GovernmentId r5 = (com.withpersona.sdk2.inquiry.governmentid.GovernmentId) r5
            java.lang.String r5 = r5.getIdClassKey()
            java.lang.String r11 = "auto-classification"
            boolean r5 = kotlin.jvm.internal.Intrinsics.m31980c(r5, r11)
            if (r5 == 0) goto L2b4
            goto L304
        L2cd:
            java.util.List r2 = r31.m17717g()
            java.lang.Object r2 = kotlin.collections.CollectionsKt.firstOrNull(r2)
            com.withpersona.sdk2.inquiry.governmentid.GovernmentId r2 = (com.withpersona.sdk2.inquiry.governmentid.GovernmentId) r2
            if (r2 == 0) goto L304
            java.lang.String r2 = r2.getIdClassKey()
            if (r2 == 0) goto L304
            okhttp3.MultipartBody$Part$Companion r5 = okhttp3.MultipartBody.Part.INSTANCE
            java.lang.String r11 = r31.getFieldKeyIdClass()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r13)
            r12.append(r11)
            java.lang.String r11 = "]"
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            okhttp3.MultipartBody$Part r2 = r5.createFormData(r11, r2)
            boolean r2 = r1.add(r2)
            pt.C10340b.m39658a(r2)
        L304:
            java.util.List r2 = r31.m17717g()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r5 = r2.iterator()
            r11 = r2
            r12 = r3
            r14 = r5
            r5 = 0
            r3 = r33
            r2 = r1
            r1 = r31
        L317:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L510
            java.lang.Object r15 = r14.next()
            r16 = r15
            com.withpersona.sdk2.inquiry.governmentid.GovernmentId r16 = (com.withpersona.sdk2.inquiry.governmentid.GovernmentId) r16
            java.util.List r17 = r16.mo16936d3()
            java.lang.Iterable r17 = (java.lang.Iterable) r17
            java.util.Iterator r18 = r17.iterator()
            r31 = r3
            r32 = r15
            r33 = r18
            r3 = r2
            r15 = r14
            r14 = r16
            r2 = 0
            r16 = r11
            r11 = r5
            r5 = r12
            r12 = 0
        L33f:
            boolean r18 = r33.hasNext()
            r19 = r7
            if (r18 == 0) goto L3f8
            java.lang.Object r18 = r33.next()
            r20 = r18
            com.withpersona.sdk2.inquiry.governmentid.Frame r20 = (com.withpersona.sdk2.inquiry.governmentid.Frame) r20
            java.lang.String r7 = r20.getMimeType()
            r22 = r8
            java.lang.String r8 = "image/"
            r23 = r9
            r9 = 0
            r25 = r6
            r24 = r10
            r6 = 0
            r10 = 2
            boolean r7 = kotlin.text.C7797x.m32309T(r7, r8, r6, r10, r9)
            if (r7 == 0) goto L3d5
            rq.a r6 = r0.imageHelper
            java.io.File r7 = new java.io.File
            java.lang.String r8 = r20.getAbsoluteFilePath()
            r7.<init>(r8)
            r5.f37075t = r1
            r5.f37076u = r3
            java.lang.Object r8 = pt.C10350l.m39676a(r31)
            r5.f37077v = r8
            java.lang.Object r8 = pt.C10350l.m39676a(r16)
            r5.f37078w = r8
            r5.f37079x = r15
            java.lang.Object r8 = pt.C10350l.m39676a(r32)
            r5.f37080y = r8
            r5.f37081z = r14
            java.lang.Object r8 = pt.C10350l.m39676a(r17)
            r5.f37064A = r8
            r8 = r33
            r5.f37065B = r8
            java.lang.Object r9 = pt.C10350l.m39676a(r18)
            r5.f37066C = r9
            java.lang.Object r9 = pt.C10350l.m39676a(r20)
            r5.f37067D = r9
            r5.f37068E = r11
            r5.f37069F = r12
            r5.f37070G = r2
            r9 = 0
            r5.f37071H = r9
            r10 = 1
            r5.f37074K = r10
            java.lang.Object r6 = r6.mo41740a(r7, r5)
            if (r6 != r4) goto L3b4
            return r4
        L3b4:
            r7 = r14
            r14 = r11
            r11 = r7
            r18 = r3
            r7 = r17
            r17 = r31
            r3 = r2
            goto L8c
        L3c0:
            java.lang.Throwable r6 = p229jt.C7347n.m30463e(r6)
            if (r6 == 0) goto L3cf
            java.lang.Object r1 = p229jt.C7348o.m30469a(r6)
            java.lang.Object r1 = p229jt.C7347n.m30460b(r1)
            return r1
        L3cf:
            r29 = r14
            r14 = r11
            r11 = r29
            goto L3e1
        L3d5:
            r8 = r33
            r9 = 0
            r18 = r3
            r7 = r17
            r17 = r31
            r3 = r2
            r2 = r32
        L3e1:
            r32 = r2
            r2 = r3
            r33 = r8
            r31 = r17
            r3 = r18
            r8 = r22
            r9 = r23
            r10 = r24
            r6 = r25
            r17 = r7
            r7 = r19
            goto L33f
        L3f8:
            r25 = r6
            r22 = r8
            r23 = r9
            r24 = r10
            r9 = 0
            com.withpersona.sdk2.inquiry.governmentid.GovernmentId$b r2 = r14.getSide()
            int[] r6 = p361po.C10303c.c.f37063b
            int r2 = r2.ordinal()
            r2 = r6[r2]
            r10 = 1
            if (r2 == r10) goto L422
            r6 = 2
            if (r2 == r6) goto L41f
            r6 = 3
            if (r2 != r6) goto L419
            r2 = r19
            goto L424
        L419:
            jt.l r1 = new jt.l
            r1.<init>()
            throw r1
        L41f:
            java.lang.String r2 = "back"
            goto L424
        L422:
            java.lang.String r2 = "front"
        L424:
            okhttp3.MultipartBody$Part$Companion r6 = okhttp3.MultipartBody.Part.INSTANCE
            java.lang.String r7 = r1.getFieldKeyDocument()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r13)
            r8.append(r7)
            r7 = r25
            r8.append(r7)
            java.lang.String r8 = r8.toString()
            okhttp3.MultipartBody$Part r2 = r6.createFormData(r8, r2)
            java.lang.String r8 = r1.getFieldKeyDocument()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r13)
            r12.append(r8)
            java.lang.String r8 = "][files][][capture_method]"
            r12.append(r8)
            java.lang.String r8 = r12.toString()
            com.withpersona.sdk2.inquiry.governmentid.GovernmentId$a r12 = r14.getCaptureMethod()
            java.lang.String r12 = r12.toString()
            okhttp3.MultipartBody$Part r8 = r6.createFormData(r8, r12)
            okhttp3.MultipartBody$Part[] r2 = new okhttp3.MultipartBody.Part[]{r2, r8}
            java.util.List r2 = kotlin.collections.C7699p.m31895n(r2)
            java.util.Collection r2 = (java.util.Collection) r2
            r3.addAll(r2)
            boolean r2 = r14 instanceof com.withpersona.sdk2.inquiry.governmentid.GovernmentId.GovernmentIdImage
            if (r2 == 0) goto L4c4
            r2 = r14
            com.withpersona.sdk2.inquiry.governmentid.GovernmentId$GovernmentIdImage r2 = (com.withpersona.sdk2.inquiry.governmentid.GovernmentId.GovernmentIdImage) r2
            com.withpersona.sdk2.inquiry.governmentid.RawExtraction r2 = r2.getRawExtraction()
            if (r2 == 0) goto L49d
            r8 = r3
            java.util.Collection r8 = (java.util.Collection) r8
            java.lang.String r12 = "data[attributes][client-extraction-raws][][type]"
            java.lang.String r9 = r2.getCom.appsflyer.sdk_base.referrer.Payload.TYPE java.lang.String()
            okhttp3.MultipartBody$Part r9 = r6.createFormData(r12, r9)
            r8.add(r9)
            java.lang.String r9 = "data[attributes][client-extraction-raws][][value]"
            java.lang.String r2 = r2.getValue()
            okhttp3.MultipartBody$Part r2 = r6.createFormData(r9, r2)
            r8.add(r2)
        L49d:
            r2 = r3
            java.util.Collection r2 = (java.util.Collection) r2
            java.lang.String r8 = r1.getFieldKeyDocument()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r13)
            r9.append(r8)
            r8 = r24
            r9.append(r8)
            java.lang.String r9 = r9.toString()
            java.lang.String r12 = "image"
            okhttp3.MultipartBody$Part r6 = r6.createFormData(r9, r12)
            r2.add(r6)
            r12 = r23
            goto L4ec
        L4c4:
            r8 = r24
            boolean r2 = r14 instanceof com.withpersona.sdk2.inquiry.governmentid.GovernmentId.GovernmentIdVideo
            if (r2 == 0) goto L50a
            r2 = r3
            java.util.Collection r2 = (java.util.Collection) r2
            java.lang.String r9 = r1.getFieldKeyDocument()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r13)
            r12.append(r9)
            r12.append(r8)
            java.lang.String r9 = r12.toString()
            r12 = r23
            okhttp3.MultipartBody$Part r6 = r6.createFormData(r9, r12)
            r2.add(r6)
        L4ec:
            java.util.List r2 = r14.mo16936d3()
            java.util.List r2 = m39592p(r1, r2)
            java.util.Collection r2 = (java.util.Collection) r2
            r3.addAll(r2)
            r2 = r3
            r6 = r7
            r10 = r8
            r9 = r12
            r14 = r15
            r7 = r19
            r8 = r22
            r3 = r31
            r12 = r5
            r5 = r11
            r11 = r16
            goto L317
        L50a:
            jt.l r1 = new jt.l
            r1.<init>()
            throw r1
        L510:
            r19 = r7
            r22 = r8
            r12 = r9
            r8 = r10
            r7 = r6
            java.lang.String r3 = r0.webRtcObjectId
            if (r3 == 0) goto L5c7
            okhttp3.MultipartBody$Part$Companion r3 = okhttp3.MultipartBody.Part.INSTANCE
            java.lang.String r4 = r1.getFieldKeyDocument()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r13)
            r5.append(r4)
            java.lang.String r4 = "][files][][name]"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            okhttp3.MultipartBody$Part r4 = r3.createFormData(r4, r12)
            java.lang.String r5 = r1.getFieldKeyDocument()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r13)
            r6.append(r5)
            java.lang.String r5 = "][files][][capture-method]"
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            com.withpersona.sdk2.inquiry.types.collected_data.GovernmentIdCapture$a r6 = com.withpersona.sdk2.inquiry.types.collected_data.GovernmentIdCapture.EnumC4123a.Auto
            java.lang.String r6 = r6.toString()
            java.util.Locale r9 = java.util.Locale.ROOT
            java.lang.String r6 = r6.toLowerCase(r9)
            r9 = r22
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r9)
            okhttp3.MultipartBody$Part r5 = r3.createFormData(r5, r6)
            java.lang.String r6 = r1.getFieldKeyDocument()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r13)
            r9.append(r6)
            r9.append(r8)
            java.lang.String r6 = r9.toString()
            okhttp3.MultipartBody$Part r6 = r3.createFormData(r6, r12)
            java.lang.String r8 = r1.getFieldKeyDocument()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r13)
            r9.append(r8)
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            r8 = r19
            okhttp3.MultipartBody$Part r7 = r3.createFormData(r7, r8)
            java.lang.String r1 = r1.getFieldKeyDocument()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r13)
            r8.append(r1)
            java.lang.String r1 = "][files][][objectId]"
            r8.append(r1)
            java.lang.String r1 = r8.toString()
            java.lang.String r8 = r0.webRtcObjectId
            okhttp3.MultipartBody$Part r1 = r3.createFormData(r1, r8)
            okhttp3.MultipartBody$Part[] r1 = new okhttp3.MultipartBody.Part[]{r4, r5, r6, r7, r1}
            java.util.List r1 = kotlin.collections.C7699p.m31895n(r1)
            java.util.Collection r1 = (java.util.Collection) r1
            r2.addAll(r1)
        L5c7:
            jt.n$a r1 = p229jt.C7347n.INSTANCE
            kotlin.Unit r1 = kotlin.Unit.f29331a
            java.lang.Object r1 = p229jt.C7347n.m30460b(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p361po.C10303c.m39593o(com.withpersona.sdk2.inquiry.governmentid.network.GovernmentIdRequestArguments, java.util.List, com.withpersona.sdk2.camera.CameraProperties, nt.b):java.lang.Object");
    }

    @Override // p581ym.InterfaceC13222o, p499vr.InterfaceC12257h
    @NotNull
    public InterfaceC9575h<b> run() {
        return C9579j.m37806w(new e(null));
    }
}
