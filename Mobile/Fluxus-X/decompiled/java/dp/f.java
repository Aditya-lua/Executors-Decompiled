package dp;

import android.content.Context;
import com.github.luben.zstd.BuildConfig;
import com.withpersona.sdk2.inquiry.network.core.ErrorResponse;
import com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.core.NetworkCallResult;
import com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.GovIdCaptureState;
import com.withpersona.sdk2.inquiry.tracking.model.GovernmentIdStateEventData;
import dv.i;
import gu.l;
import gu.m;
import hn.w;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ln.o;
import ls.j;
import mv.b0;
import mv.c0;
import mv.g0;
import mv.i0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.collections.p;
import p001kotlin.collections.u;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import sn.v;
import sw.x;
import vo.Frame;
import vo.n;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0019\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0002. B\u008b\u0001\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\u0006\u0012\b\b\u0001\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010 \u001a\u00020\u001f2\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b \u0010!J\u001b\u0010\"\u001a\u00020\u001f2\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\"\u0010#J\u0015\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020$H\u0016¢\u0006\u0004\b%\u0010&J0\u0010,\u001a\b\u0012\u0004\u0012\u00020+0**\u00020\r2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'2\u0006\u0010\u0017\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u00100R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00100R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00100R\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00100R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u00100R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010C¨\u0006D"}, d2 = {"Ldp/f;", "Lln/o;", "Ldp/f$b;", "Lls/j;", "Landroid/content/Context;", "context", BuildConfig.FLAVOR, "sessionToken", "inquiryId", "fromStep", "fromComponent", "Lcom/withpersona/sdk2/inquiry/governmentid/network/b;", "service", "Ldp/c;", "governmentIdRequestArguments", "Lar/a;", "dataCollector", "Lso/a;", "fallbackModeManager", "Lfr/a;", "imageHelper", "webRtcObjectId", "Lsn/v;", "cameraProperties", "Lyn/a;", "cameraStatsManager", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/network/b;Ldp/c;Lar/a;Lso/a;Lfr/a;Ljava/lang/String;Lsn/v;Lyn/a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V", "otherWorker", BuildConfig.FLAVOR, "a", "(Lln/o;)Z", "c", "(Lls/j;)Z", "Ldv/h;", "run", "()Ldv/h;", BuildConfig.FLAVOR, "Lmv/c0$c;", "body", "Lzt/n;", BuildConfig.FLAVOR, "o", "(Ldp/c;Ljava/util/List;Lsn/v;Leu/b;)Ljava/lang/Object;", "b", "Landroid/content/Context;", "Ljava/lang/String;", "d", "e", "f", "g", "Lcom/withpersona/sdk2/inquiry/governmentid/network/b;", "h", "Ldp/c;", "i", "Lar/a;", "j", "Lso/a;", "k", "Lfr/a;", "l", "m", "Lsn/v;", "n", "Lyn/a;", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements o<b>, j<b> {

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
    public final ar.a dataCollector;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final so.a fallbackModeManager;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final fr.a imageHelper;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String webRtcObjectId;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final v cameraProperties;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final yn.a cameraStatsManager;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001JW\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Ldp/f$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "sessionToken", "inquiryId", "fromComponent", "fromStep", "Ldp/c;", "governmentIdRequestArguments", "webRtcObjectId", "Lsn/v;", "cameraProperties", "Ldp/f;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ldp/c;Ljava/lang/String;Lsn/v;)Ldp/f;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        @NotNull
        f a(@NotNull String sessionToken, @NotNull String inquiryId, @NotNull String fromComponent, @NotNull String fromStep, @Nullable GovernmentIdRequestArguments governmentIdRequestArguments, @Nullable String webRtcObjectId, @NotNull v cameraProperties);
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Ldp/f$b;", BuildConfig.FLAVOR, "<init>", "()V", "c", "b", "a", "Ldp/f$b$a;", "Ldp/f$b$b;", "Ldp/f$b$c;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class b {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Ldp/f$b$a;", "Ldp/f$b;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", "a", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

        /* JADX INFO: renamed from: dp.f$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Ldp/f$b$b;", "Ldp/f$b;", "Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse;)V", "a", "Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse;", "()Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class C0228b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final GenericFileUploadErrorResponse.DocumentErrorResponse cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0228b(@NotNull GenericFileUploadErrorResponse.DocumentErrorResponse cause) {
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

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ldp/f$b$c;", "Ldp/f$b;", "<init>", "()V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class c extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final c f12592a = new c();

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

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public b() {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f12593a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[v.b.values().length];
            try {
                iArr[v.b.Unknown.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f12593a = iArr;
            int[] iArr2 = new int[n.d.values().length];
            try {
                iArr2[n.d.FRONT.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[n.d.BACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[n.d.FRONT_AND_BACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            b = iArr2;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.withpersona.sdk2.inquiry.governmentid.network.SubmitVerificationWorker", f = "SubmitVerificationWorker.kt", l = {235}, m = "addToForm-BWLJW6A")
    public static final class d extends gu.d {
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
        public Object f12594t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f12595u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f12596v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f12597w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f12598x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public Object f12599y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public Object f12600z;

        public d(eu.b<? super d> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.I = obj;
            this.K |= Integer.MIN_VALUE;
            Object objO = f.this.o(null, null, null, this);
            return objO == fu.c.e() ? objO : zt.n.a(objO);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldv/i;", "Ldp/f$b;", BuildConfig.FLAVOR, "<anonymous>", "(Ldv/i;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.governmentid.network.SubmitVerificationWorker$run$1", f = "SubmitVerificationWorker.kt", l = {79, 81, 85, 107, 125, 127, 134}, m = "invokeSuspend")
    public static final class e extends m implements Function2<i<? super b>, eu.b<? super Unit>, Object> {
        public /* synthetic */ Object A;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f12601t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f12602u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f12603v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f12604w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f12605x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f12606y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f12607z;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lsw/x;", BuildConfig.FLAVOR, "<anonymous>", "()Lsw/x;"}, k = 3, mv = {2, 2, 0})
        @gu.f(c = "com.withpersona.sdk2.inquiry.governmentid.network.SubmitVerificationWorker$run$1$2", f = "SubmitVerificationWorker.kt", l = {87, 92}, m = "invokeSuspend")
        public static final class a extends m implements Function1<eu.b<? super x<? extends Object>>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f12608t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ f f12609u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ List<c0.c> f12610v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(f fVar, List<c0.c> list, eu.b<? super a> bVar) {
                super(1, bVar);
                this.f12609u = fVar;
                this.f12610v = list;
            }

            @Override // gu.a
            public final eu.b<Unit> create(eu.b<?> bVar) {
                return new a(this.f12609u, this.f12610v, bVar);
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
                int i10 = this.f12608t;
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
                if (this.f12609u.fallbackModeManager.b()) {
                    so.a aVar = this.f12609u.fallbackModeManager;
                    String str = this.f12609u.sessionToken;
                    List<c0.c> list = this.f12610v;
                    this.f12608t = 1;
                    obj = aVar.a(str, list, this);
                } else {
                    com.withpersona.sdk2.inquiry.governmentid.network.b bVar = this.f12609u.service;
                    String str2 = this.f12609u.sessionToken;
                    String str3 = this.f12609u.inquiryId;
                    List<c0.c> list2 = this.f12610v;
                    this.f12608t = 2;
                    obj = bVar.b(str2, str3, list2, this);
                }
                return objE;
            }

            @Override // p001kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public final Object invoke(eu.b<? super x<? extends Object>> bVar) {
                return ((a) create(bVar)).invokeSuspend(Unit.f21506a);
            }
        }

        public e(eu.b<? super e> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            e eVar = f.this.new e(bVar);
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
        @Override // gu.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            List listP;
            Object objO;
            Throwable thE;
            List list;
            NetworkCallResult networkCallResult;
            f fVar;
            b.c cVar;
            GovernmentIdRequestArguments governmentIdRequestArguments;
            List<n> listG;
            Iterator<T> it;
            Iterator<T> it2;
            InternalErrorInfo.NetworkErrorInfo networkErrorInfo;
            i iVar = (i) this.A;
            Object objE = fu.c.e();
            GenericFileUploadErrorResponse genericFileUploadErrorResponse = null;
            switch (this.f12607z) {
                case 0:
                    zt.o.b(obj);
                    TrackingEventsLogger.logGovernmentIdStateEvent$default(f.this.trackingEventsLogger, new GovernmentIdStateEventData(GovIdCaptureState.SUBMITTING, null, null, null, 12, null), false, 2, null);
                    c0.c.Companion companion = c0.c.INSTANCE;
                    listP = p.p(companion.b("data[id]", f.this.inquiryId), companion.b("data[type]", "inquiry"), companion.b("meta[from_component]", f.this.fromComponent), companion.b("meta[from_step]", f.this.fromStep));
                    GovernmentIdRequestArguments governmentIdRequestArguments2 = f.this.governmentIdRequestArguments;
                    if (governmentIdRequestArguments2 != null) {
                        f fVar2 = f.this;
                        v vVar = fVar2.cameraProperties;
                        this.A = iVar;
                        this.f12601t = listP;
                        this.f12607z = 1;
                        objO = fVar2.o(governmentIdRequestArguments2, listP, vVar, this);
                        if (objO != objE) {
                            thE = zt.n.e(objO);
                            if (thE != null) {
                                b.a aVar = new b.a(new InternalErrorInfo.UnknownErrorInfo("Error adding data to form."));
                                this.A = l.a(iVar);
                                this.f12601t = l.a(listP);
                                this.f12602u = l.a(thE);
                                this.f12605x = 0;
                                this.f12607z = 2;
                            } else {
                                zt.n.a(objO);
                                a aVar2 = new a(f.this, listP, null);
                                this.A = iVar;
                                this.f12601t = l.a(listP);
                                this.f12607z = 3;
                                obj = NetworkUtilsKt.enqueueVerificationRequestWithRetry(aVar2, this);
                                if (obj != objE) {
                                    list = listP;
                                    networkCallResult = (NetworkCallResult) obj;
                                    fVar = f.this;
                                    if (networkCallResult instanceof NetworkCallResult.Success) {
                                        Object response = ((NetworkCallResult.Success) networkCallResult).getResponse();
                                        if (!fVar.dataCollector.getIsActive() && (governmentIdRequestArguments = fVar.governmentIdRequestArguments) != null && (listG = governmentIdRequestArguments.g()) != null) {
                                            it = listG.iterator();
                                            while (it.hasNext()) {
                                                it2 = ((n) it.next()).j3().iterator();
                                                while (it2.hasNext()) {
                                                    new File(((Frame) it2.next()).getAbsoluteFilePath()).delete();
                                                }
                                            }
                                        }
                                        cVar = b.c.f12592a;
                                        this.A = iVar;
                                        this.f12601t = l.a(list);
                                        this.f12602u = networkCallResult;
                                        this.f12603v = l.a(response);
                                        this.f12605x = 0;
                                        this.f12606y = 0;
                                        this.f12607z = 4;
                                        if (iVar.emit(cVar, this) != objE) {
                                        }
                                    }
                                    if (networkCallResult instanceof NetworkCallResult.Failure) {
                                        networkErrorInfo = ((NetworkCallResult.Failure) networkCallResult).getNetworkErrorInfo();
                                        if (!networkErrorInfo.isRecoverable() && (networkErrorInfo.getResponseError() instanceof ErrorResponse.Error.UnknownError)) {
                                            ErrorResponse.Error responseError = networkErrorInfo.getResponseError();
                                            Intrinsics.d(responseError, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.core.ErrorResponse.Error.UnknownError");
                                            i0 errorBody = ((ErrorResponse.Error.UnknownError) responseError).getErrorBody();
                                            if (errorBody != null) {
                                                try {
                                                    genericFileUploadErrorResponse = (GenericFileUploadErrorResponse) new w.b().a(GenericFileUploadErrorResponse.Companion.getAdapter()).d().c(GenericFileUploadErrorResponse.class).fromJson(errorBody.getSource());
                                                } catch (Exception unused) {
                                                }
                                            }
                                            if (genericFileUploadErrorResponse == null) {
                                                b.C0228b c0228b = new b.C0228b(new GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError(null, null, null, 7, null));
                                                this.A = l.a(iVar);
                                                this.f12601t = l.a(list);
                                                this.f12602u = networkCallResult;
                                                this.f12603v = l.a(networkErrorInfo);
                                                this.f12604w = l.a(genericFileUploadErrorResponse);
                                                this.f12605x = 0;
                                                this.f12606y = 0;
                                                this.f12607z = 6;
                                            } else {
                                                b.C0228b c0228b2 = new b.C0228b(genericFileUploadErrorResponse.getErrors().get(0));
                                                this.A = l.a(iVar);
                                                this.f12601t = l.a(list);
                                                this.f12602u = networkCallResult;
                                                this.f12603v = l.a(networkErrorInfo);
                                                this.f12604w = l.a(genericFileUploadErrorResponse);
                                                this.f12605x = 0;
                                                this.f12606y = 0;
                                                this.f12607z = 5;
                                            }
                                        } else {
                                            b.a aVar3 = new b.a(networkErrorInfo);
                                            this.A = l.a(iVar);
                                            this.f12601t = l.a(list);
                                            this.f12602u = networkCallResult;
                                            this.f12603v = l.a(networkErrorInfo);
                                            this.f12605x = 0;
                                            this.f12606y = 0;
                                            this.f12607z = 7;
                                        }
                                        break;
                                    }
                                    return Unit.f21506a;
                                }
                            }
                        }
                        break;
                    } else {
                        a aVar4 = new a(f.this, listP, null);
                        this.A = iVar;
                        this.f12601t = l.a(listP);
                        this.f12607z = 3;
                        obj = NetworkUtilsKt.enqueueVerificationRequestWithRetry(aVar4, this);
                        if (obj != objE) {
                            list = listP;
                            networkCallResult = (NetworkCallResult) obj;
                            fVar = f.this;
                            if (networkCallResult instanceof NetworkCallResult.Success) {
                                Object response2 = ((NetworkCallResult.Success) networkCallResult).getResponse();
                                if (!fVar.dataCollector.getIsActive()) {
                                    it = listG.iterator();
                                    while (it.hasNext()) {
                                        it2 = ((n) it.next()).j3().iterator();
                                        while (it2.hasNext()) {
                                            new File(((Frame) it2.next()).getAbsoluteFilePath()).delete();
                                        }
                                    }
                                }
                                cVar = b.c.f12592a;
                                this.A = iVar;
                                this.f12601t = l.a(list);
                                this.f12602u = networkCallResult;
                                this.f12603v = l.a(response2);
                                this.f12605x = 0;
                                this.f12606y = 0;
                                this.f12607z = 4;
                                if (iVar.emit(cVar, this) != objE) {
                                }
                            }
                            if (networkCallResult instanceof NetworkCallResult.Failure) {
                                networkErrorInfo = ((NetworkCallResult.Failure) networkCallResult).getNetworkErrorInfo();
                                if (!networkErrorInfo.isRecoverable()) {
                                }
                                b.a aVar5 = new b.a(networkErrorInfo);
                                this.A = l.a(iVar);
                                this.f12601t = l.a(list);
                                this.f12602u = networkCallResult;
                                this.f12603v = l.a(networkErrorInfo);
                                this.f12605x = 0;
                                this.f12606y = 0;
                                this.f12607z = 7;
                                break;
                            }
                            return Unit.f21506a;
                        }
                    }
                    return objE;
                case 1:
                    listP = (List) this.f12601t;
                    zt.o.b(obj);
                    objO = ((zt.n) obj).getValue();
                    thE = zt.n.e(objO);
                    if (thE != null) {
                        b.a aVar6 = new b.a(new InternalErrorInfo.UnknownErrorInfo("Error adding data to form."));
                        this.A = l.a(iVar);
                        this.f12601t = l.a(listP);
                        this.f12602u = l.a(thE);
                        this.f12605x = 0;
                        this.f12607z = 2;
                        break;
                    } else {
                        zt.n.a(objO);
                        a aVar7 = new a(f.this, listP, null);
                        this.A = iVar;
                        this.f12601t = l.a(listP);
                        this.f12607z = 3;
                        obj = NetworkUtilsKt.enqueueVerificationRequestWithRetry(aVar7, this);
                        if (obj != objE) {
                            list = listP;
                            networkCallResult = (NetworkCallResult) obj;
                            fVar = f.this;
                            if (networkCallResult instanceof NetworkCallResult.Success) {
                                Object response3 = ((NetworkCallResult.Success) networkCallResult).getResponse();
                                if (!fVar.dataCollector.getIsActive()) {
                                    it = listG.iterator();
                                    while (it.hasNext()) {
                                        it2 = ((n) it.next()).j3().iterator();
                                        while (it2.hasNext()) {
                                            new File(((Frame) it2.next()).getAbsoluteFilePath()).delete();
                                        }
                                    }
                                }
                                cVar = b.c.f12592a;
                                this.A = iVar;
                                this.f12601t = l.a(list);
                                this.f12602u = networkCallResult;
                                this.f12603v = l.a(response3);
                                this.f12605x = 0;
                                this.f12606y = 0;
                                this.f12607z = 4;
                                if (iVar.emit(cVar, this) != objE) {
                                }
                            }
                            if (networkCallResult instanceof NetworkCallResult.Failure) {
                                networkErrorInfo = ((NetworkCallResult.Failure) networkCallResult).getNetworkErrorInfo();
                                if (!networkErrorInfo.isRecoverable()) {
                                }
                                b.a aVar8 = new b.a(networkErrorInfo);
                                this.A = l.a(iVar);
                                this.f12601t = l.a(list);
                                this.f12602u = networkCallResult;
                                this.f12603v = l.a(networkErrorInfo);
                                this.f12605x = 0;
                                this.f12606y = 0;
                                this.f12607z = 7;
                                break;
                            }
                            return Unit.f21506a;
                        }
                    }
                    return objE;
                case 2:
                    zt.o.b(obj);
                    return Unit.f21506a;
                case 3:
                    listP = (List) this.f12601t;
                    zt.o.b(obj);
                    list = listP;
                    networkCallResult = (NetworkCallResult) obj;
                    fVar = f.this;
                    if (networkCallResult instanceof NetworkCallResult.Success) {
                        Object response4 = ((NetworkCallResult.Success) networkCallResult).getResponse();
                        if (!fVar.dataCollector.getIsActive()) {
                            it = listG.iterator();
                            while (it.hasNext()) {
                                it2 = ((n) it.next()).j3().iterator();
                                while (it2.hasNext()) {
                                    new File(((Frame) it2.next()).getAbsoluteFilePath()).delete();
                                }
                            }
                        }
                        cVar = b.c.f12592a;
                        this.A = iVar;
                        this.f12601t = l.a(list);
                        this.f12602u = networkCallResult;
                        this.f12603v = l.a(response4);
                        this.f12605x = 0;
                        this.f12606y = 0;
                        this.f12607z = 4;
                        if (iVar.emit(cVar, this) != objE) {
                        }
                        return objE;
                    }
                    if (networkCallResult instanceof NetworkCallResult.Failure) {
                        networkErrorInfo = ((NetworkCallResult.Failure) networkCallResult).getNetworkErrorInfo();
                        if (!networkErrorInfo.isRecoverable()) {
                        }
                        b.a aVar9 = new b.a(networkErrorInfo);
                        this.A = l.a(iVar);
                        this.f12601t = l.a(list);
                        this.f12602u = networkCallResult;
                        this.f12603v = l.a(networkErrorInfo);
                        this.f12605x = 0;
                        this.f12606y = 0;
                        this.f12607z = 7;
                        break;
                    }
                    return Unit.f21506a;
                case 4:
                    networkCallResult = (NetworkCallResult) this.f12602u;
                    list = (List) this.f12601t;
                    zt.o.b(obj);
                    if (networkCallResult instanceof NetworkCallResult.Failure) {
                        networkErrorInfo = ((NetworkCallResult.Failure) networkCallResult).getNetworkErrorInfo();
                        if (!networkErrorInfo.isRecoverable()) {
                        }
                        b.a aVar10 = new b.a(networkErrorInfo);
                        this.A = l.a(iVar);
                        this.f12601t = l.a(list);
                        this.f12602u = networkCallResult;
                        this.f12603v = l.a(networkErrorInfo);
                        this.f12605x = 0;
                        this.f12606y = 0;
                        this.f12607z = 7;
                        break;
                    }
                    return Unit.f21506a;
                case 5:
                case 6:
                case 7:
                    zt.o.b(obj);
                    return Unit.f21506a;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // p001kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i<? super b> iVar, eu.b<? super Unit> bVar) {
            return ((e) create(iVar, bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    public f(@NotNull Context context, @NotNull String sessionToken, @NotNull String inquiryId, @NotNull String fromStep, @NotNull String fromComponent, @NotNull com.withpersona.sdk2.inquiry.governmentid.network.b service, @Nullable GovernmentIdRequestArguments governmentIdRequestArguments, @NotNull ar.a dataCollector, @NotNull so.a fallbackModeManager, @NotNull fr.a imageHelper, @Nullable String str, @NotNull v cameraProperties, @NotNull yn.a cameraStatsManager, @NotNull TrackingEventsLogger trackingEventsLogger) {
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

    public static final List<c0.c> p(GovernmentIdRequestArguments governmentIdRequestArguments, List<Frame> list) {
        ArrayList arrayList = new ArrayList();
        for (Frame frame : list) {
            u.z(arrayList, p001kotlin.collections.o.d(c0.c.INSTANCE.c("data[attributes][fields][" + governmentIdRequestArguments.getFieldKeyDocument() + "][files][][frames][]", new File(frame.getAbsoluteFilePath()).getName(), g0.INSTANCE.b(new File(frame.getAbsoluteFilePath()), b0.INSTANCE.b(frame.getMimeType())))));
        }
        return arrayList;
    }

    @Override // ln.o
    public boolean a(@NotNull o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof f) && Intrinsics.c(this.sessionToken, ((f) otherWorker).sessionToken);
    }

    @Override // ls.j
    public boolean b(@NotNull j<?> jVar) {
        return super.b(jVar);
    }

    @Override // ls.j
    public boolean c(@NotNull j<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof f) && Intrinsics.c(this.sessionToken, ((f) otherWorker).sessionToken);
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
    public final java.lang.Object o(dp.GovernmentIdRequestArguments r31, java.util.List<mv.c0.c> r32, sn.v r33, eu.b<? super zt.n<p001kotlin.Unit>> r34) {
        /*
            Method dump skipped, instruction units count: 1488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dp.f.o(dp.c, java.util.List, sn.v, eu.b):java.lang.Object");
    }

    @Override // ln.o, ls.j
    @NotNull
    public dv.h<b> run() {
        return dv.j.w(new e(null));
    }
}
