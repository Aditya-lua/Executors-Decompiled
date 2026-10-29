package com.withpersona.sdk2.inquiry.internal;

import androidx.core.app.NotificationCompat;
import com.withpersona.sdk2.inquiry.internal.network.C3706e;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.dto.CheckInquiryResponse;
import com.withpersona.sdk2.inquiry.shared.inquiryTheme.C4007a;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import gp.InterfaceC6203w;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kr.InterfaceC7814a;
import nu.C9579j;
import nu.InterfaceC9575h;
import nu.InterfaceC9577i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p082dp.C4655i;
import p315nt.InterfaceC9557b;
import p499vr.InterfaceC12257h;
import p525wp.C12504c;
import p582yn.InterfaceC13234a;
import p610zo.EnumC13949a0;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.k */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b!\b\u0000\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003!#=B\u007f\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010!\u001a\u00020\u000b2\n\u0010 \u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010$R\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b(\u0010&R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006>"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/k;", "Lvr/h;", "Lcom/withpersona/sdk2/inquiry/internal/k$c;", "", "sessionToken", "trackingEventsUrl", "inquiryId", "Lzo/a0;", "pollingMode", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquirySessionConfig", "", "canReuseWorkflow", "Lgp/w;", NotificationCompat.CATEGORY_SERVICE, "Lyn/a;", "deviceIdProvider", "Lwp/c;", "sandboxFlags", "Ldp/i;", "fallbackModeManager", "Lkr/a;", "fontDownloader", "Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;", "themeManager", "Lcom/withpersona/sdk2/inquiry/internal/network/e;", "inquiryApiHelper", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lzo/a0;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;ZLgp/w;Lyn/a;Lwp/c;Ldp/i;Lkr/a;Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;Lcom/withpersona/sdk2/inquiry/internal/network/e;)V", "Lnu/h;", "run", "()Lnu/h;", "otherWorker", "c", "(Lvr/h;)Z", "b", "Ljava/lang/String;", "p", "()Ljava/lang/String;", "d", "o", "e", "Lzo/a0;", "f", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "g", "Z", "h", "Lgp/w;", "i", "Lyn/a;", "j", "Lwp/c;", "k", "Ldp/i;", "l", "Lkr/a;", "m", "Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;", "n", "Lcom/withpersona/sdk2/inquiry/internal/network/e;", "a", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C3692k implements InterfaceC12257h<c> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String sessionToken;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final String trackingEventsUrl;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final String inquiryId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final EnumC13949a0 pollingMode;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public InquirySessionConfig inquirySessionConfig;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final boolean canReuseWorkflow;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC6203w service;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC13234a deviceIdProvider;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final C12504c sandboxFlags;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final C4655i fallbackModeManager;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7814a fontDownloader;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final C4007a themeManager;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    public final C3706e inquiryApiHelper;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.k$b */
    @Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001JG\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000fÀ\u0006\u0003"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/k$b;", "", "", "sessionToken", "trackingEventsUrl", "inquiryId", "Lzo/a0;", "pollingMode", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquirySessionConfig", "", "canReuseWorkflow", "Lcom/withpersona/sdk2/inquiry/internal/k;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lzo/a0;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Z)Lcom/withpersona/sdk2/inquiry/internal/k;", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public interface b {
        @NotNull
        /* JADX INFO: renamed from: a */
        C3692k mo18594a(@NotNull String sessionToken, @Nullable String trackingEventsUrl, @NotNull String inquiryId, @NotNull EnumC13949a0 pollingMode, @NotNull InquirySessionConfig inquirySessionConfig, boolean canReuseWorkflow);
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.k$c */
    @Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/k$c;", "", "<init>", "()V", "b", "a", "Lcom/withpersona/sdk2/inquiry/internal/k$c$a;", "Lcom/withpersona/sdk2/inquiry/internal/k$c$b;", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static abstract class c {

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.k$c$a, reason: from toString */
        @Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/k$c$a;", "Lcom/withpersona/sdk2/inquiry/internal/k$c;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class Error extends c {

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

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.k$c$b, reason: from toString */
        @Metadata(m31664d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015¨\u0006\u0016"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/k$c$b;", "Lcom/withpersona/sdk2/inquiry/internal/k$c;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "nextState", "<init>", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryState;)V", "currentState", "", "canReuseWorkflow", "a", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryState;Z)Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class Success extends c {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
            @NotNull
            public final InquiryState nextState;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(@NotNull InquiryState nextState) {
                super(null);
                Intrinsics.checkNotNullParameter(nextState, "nextState");
                this.nextState = nextState;
            }

            @NotNull
            /* JADX INFO: renamed from: a */
            public final InquiryState m18596a(@Nullable InquiryState currentState, boolean canReuseWorkflow) {
                InquiryState inquiryState = this.nextState;
                if (canReuseWorkflow && (inquiryState instanceof InquiryState.UiStepRunning) && (currentState instanceof InquiryState.UiStepRunning)) {
                    InquiryState.UiStepRunning uiStepRunning = (InquiryState.UiStepRunning) inquiryState;
                    InquiryState.UiStepRunning uiStepRunning2 = (InquiryState.UiStepRunning) currentState;
                    if (Intrinsics.m31980c(uiStepRunning.getStepName(), uiStepRunning2.getStepName())) {
                        return InquiryState.UiStepRunning.m18218r(uiStepRunning, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, uiStepRunning2.getClientSideKey(), null, null, null, false, null, 2064383, null);
                    }
                }
                return inquiryState;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && Intrinsics.m31980c(this.nextState, ((Success) other).nextState);
            }

            public int hashCode() {
                return this.nextState.hashCode();
            }

            @NotNull
            public String toString() {
                return "Success(nextState=" + this.nextState + ")";
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.internal.k.c.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public c() {
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.k$d */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lnu/i;", "Lcom/withpersona/sdk2/inquiry/internal/k$c;", "", "<anonymous>", "(Lnu/i;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.internal.PollingWorker$run$1", m39664f = "PollingWorker.kt", m39665l = {52, 63, 142, 153, 160, 164, 170, 174}, m39666m = "invokeSuspend")
    public static final class d extends AbstractC10351m implements Function2<InterfaceC9577i<? super c>, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: A */
        public Object f15255A;

        /* JADX INFO: renamed from: B */
        public Object f15256B;

        /* JADX INFO: renamed from: C */
        public Object f15257C;

        /* JADX INFO: renamed from: D */
        public int f15258D;

        /* JADX INFO: renamed from: E */
        public long f15259E;

        /* JADX INFO: renamed from: F */
        public int f15260F;

        /* JADX INFO: renamed from: G */
        public /* synthetic */ Object f15261G;

        /* JADX INFO: renamed from: t */
        public Object f15263t;

        /* JADX INFO: renamed from: u */
        public Object f15264u;

        /* JADX INFO: renamed from: v */
        public Object f15265v;

        /* JADX INFO: renamed from: w */
        public Object f15266w;

        /* JADX INFO: renamed from: x */
        public Object f15267x;

        /* JADX INFO: renamed from: y */
        public Object f15268y;

        /* JADX INFO: renamed from: z */
        public Object f15269z;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.k$d$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f15270a;

            static {
                int[] iArr = new int[CheckInquiryResponse.PollingMode.values().length];
                try {
                    iArr[CheckInquiryResponse.PollingMode.Blocking.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CheckInquiryResponse.PollingMode.Background.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[CheckInquiryResponse.PollingMode.None.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f15270a = iArr;
            }
        }

        public d(InterfaceC9557b<? super d> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            d dVar = C3692k.this.new d(interfaceC9557b);
            dVar.f15261G = obj;
            return dVar;
        }

        /* JADX WARN: Code duplicated, block: B:128:0x049e  */
        /* JADX WARN: Code duplicated, block: B:135:0x04e6  */
        /* JADX WARN: Code duplicated, block: B:137:0x04e9  */
        /* JADX WARN: Code duplicated, block: B:142:0x0524  */
        /* JADX WARN: Code duplicated, block: B:146:0x054d  */
        /* JADX WARN: Code duplicated, block: B:162:0x0159 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:170:0x018a A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:37:0x01a3 A[Catch: IOException -> 0x0190, TRY_ENTER, TRY_LEAVE, TryCatch #4 {IOException -> 0x0190, blocks: (B:31:0x018a, B:37:0x01a3), top: B:170:0x018a }] */
        /* JADX WARN: Code duplicated, block: B:45:0x01ec  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:146:0x054d -> B:8:0x0048). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:153:0x056c -> B:26:0x014e). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // pt.AbstractC10339a
        public final java.lang.Object invokeSuspend(java.lang.Object r29) {
            /*
                r28 = this;
                r5 = r28
                java.lang.Object r0 = r5.f15261G
                r6 = r0
                nu.i r6 = (nu.InterfaceC9577i) r6
                java.lang.Object r7 = p344ot.C10047c.m38805e()
                int r0 = r5.f15260F
                r10 = 0
                r11 = 1
                switch(r0) {
                    case 0: goto L100;
                    case 1: goto Lf8;
                    case 2: goto Ld3;
                    case 3: goto La6;
                    case 4: goto L7d;
                    case 5: goto L64;
                    case 6: goto L4b;
                    case 7: goto L2b;
                    case 8: goto L1a;
                    default: goto L12;
                }
            L12:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L1a:
                java.lang.Object r0 = r5.f15265v
                kotlin.jvm.internal.b0 r0 = (kotlin.jvm.internal.C7727b0) r0
                java.lang.Object r0 = r5.f15264u
                kotlin.jvm.internal.b0 r0 = (kotlin.jvm.internal.C7727b0) r0
                java.lang.Object r0 = r5.f15263t
                com.withpersona.sdk2.inquiry.internal.fallbackmode.i r0 = (com.withpersona.sdk2.inquiry.internal.fallbackmode.C3686i) r0
                p229jt.C7348o.m30470b(r29)
                goto L5be
            L2b:
                long r0 = r5.f15259E
                int r2 = r5.f15258D
                java.lang.Object r3 = r5.f15266w
                jv.x r3 = (p231jv.C7396x) r3
                java.lang.Object r3 = r5.f15265v
                kotlin.jvm.internal.b0 r3 = (kotlin.jvm.internal.C7727b0) r3
                java.lang.Object r4 = r5.f15264u
                kotlin.jvm.internal.b0 r4 = (kotlin.jvm.internal.C7727b0) r4
                java.lang.Object r12 = r5.f15263t
                com.withpersona.sdk2.inquiry.internal.fallbackmode.i r12 = (com.withpersona.sdk2.inquiry.internal.fallbackmode.C3686i) r12
                p229jt.C7348o.m30470b(r29)
                r16 = r12
                r9 = 2
                r14 = r2
                r15 = r3
                r12 = r0
            L48:
                r0 = r4
                goto L552
            L4b:
                java.lang.Object r0 = r5.f15267x
                com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$NetworkErrorInfo r0 = (com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo.NetworkErrorInfo) r0
                java.lang.Object r0 = r5.f15266w
                jv.x r0 = (p231jv.C7396x) r0
                java.lang.Object r0 = r5.f15265v
                kotlin.jvm.internal.b0 r0 = (kotlin.jvm.internal.C7727b0) r0
                java.lang.Object r0 = r5.f15264u
                kotlin.jvm.internal.b0 r0 = (kotlin.jvm.internal.C7727b0) r0
                java.lang.Object r0 = r5.f15263t
                com.withpersona.sdk2.inquiry.internal.fallbackmode.i r0 = (com.withpersona.sdk2.inquiry.internal.fallbackmode.C3686i) r0
                p229jt.C7348o.m30470b(r29)
                goto L521
            L64:
                java.lang.Object r0 = r5.f15267x
                com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$NetworkErrorInfo r0 = (com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo.NetworkErrorInfo) r0
                java.lang.Object r0 = r5.f15266w
                jv.x r0 = (p231jv.C7396x) r0
                java.lang.Object r0 = r5.f15265v
                kotlin.jvm.internal.b0 r0 = (kotlin.jvm.internal.C7727b0) r0
                java.lang.Object r0 = r5.f15264u
                kotlin.jvm.internal.b0 r0 = (kotlin.jvm.internal.C7727b0) r0
                java.lang.Object r0 = r5.f15263t
                com.withpersona.sdk2.inquiry.internal.fallbackmode.i r0 = (com.withpersona.sdk2.inquiry.internal.fallbackmode.C3686i) r0
                p229jt.C7348o.m30470b(r29)
                goto L4e3
            L7d:
                java.lang.Object r0 = r5.f15256B
                com.withpersona.sdk2.inquiry.internal.InquiryState r0 = (com.withpersona.sdk2.inquiry.internal.InquiryState) r0
                java.lang.Object r0 = r5.f15255A
                com.withpersona.sdk2.inquiry.network.dto.InquirySessionData r0 = (com.withpersona.sdk2.inquiry.network.dto.InquirySessionData) r0
                java.lang.Object r0 = r5.f15269z
                com.withpersona.sdk2.inquiry.network.dto.CheckInquiryResponse$WaitForTransitionConfig r0 = (com.withpersona.sdk2.inquiry.network.dto.CheckInquiryResponse.WaitForTransitionConfig) r0
                java.lang.Object r0 = r5.f15268y
                java.util.List r0 = (java.util.List) r0
                java.lang.Object r0 = r5.f15267x
                com.withpersona.sdk2.inquiry.network.dto.CheckInquiryResponse r0 = (com.withpersona.sdk2.inquiry.network.dto.CheckInquiryResponse) r0
                java.lang.Object r0 = r5.f15266w
                jv.x r0 = (p231jv.C7396x) r0
                java.lang.Object r0 = r5.f15265v
                kotlin.jvm.internal.b0 r0 = (kotlin.jvm.internal.C7727b0) r0
                java.lang.Object r0 = r5.f15264u
                kotlin.jvm.internal.b0 r0 = (kotlin.jvm.internal.C7727b0) r0
                java.lang.Object r0 = r5.f15263t
                com.withpersona.sdk2.inquiry.internal.fallbackmode.i r0 = (com.withpersona.sdk2.inquiry.internal.fallbackmode.C3686i) r0
                p229jt.C7348o.m30470b(r29)
                goto L3d2
            La6:
                java.lang.Object r0 = r5.f15257C
                com.withpersona.sdk2.inquiry.internal.InquiryState r0 = (com.withpersona.sdk2.inquiry.internal.InquiryState) r0
                java.lang.Object r0 = r5.f15256B
                zo.a0 r0 = (p610zo.EnumC13949a0) r0
                java.lang.Object r0 = r5.f15255A
                com.withpersona.sdk2.inquiry.network.dto.InquirySessionData r0 = (com.withpersona.sdk2.inquiry.network.dto.InquirySessionData) r0
                java.lang.Object r0 = r5.f15269z
                com.withpersona.sdk2.inquiry.network.dto.CheckInquiryResponse$WaitForTransitionConfig r0 = (com.withpersona.sdk2.inquiry.network.dto.CheckInquiryResponse.WaitForTransitionConfig) r0
                java.lang.Object r0 = r5.f15268y
                java.util.List r0 = (java.util.List) r0
                java.lang.Object r0 = r5.f15267x
                com.withpersona.sdk2.inquiry.network.dto.CheckInquiryResponse r0 = (com.withpersona.sdk2.inquiry.network.dto.CheckInquiryResponse) r0
                java.lang.Object r0 = r5.f15266w
                jv.x r0 = (p231jv.C7396x) r0
                java.lang.Object r0 = r5.f15265v
                kotlin.jvm.internal.b0 r0 = (kotlin.jvm.internal.C7727b0) r0
                java.lang.Object r0 = r5.f15264u
                kotlin.jvm.internal.b0 r0 = (kotlin.jvm.internal.C7727b0) r0
                java.lang.Object r0 = r5.f15263t
                com.withpersona.sdk2.inquiry.internal.fallbackmode.i r0 = (com.withpersona.sdk2.inquiry.internal.fallbackmode.C3686i) r0
                p229jt.C7348o.m30470b(r29)
                goto L48c
            Ld3:
                long r0 = r5.f15259E
                int r2 = r5.f15258D
                java.lang.Object r3 = r5.f15265v
                kotlin.jvm.internal.b0 r3 = (kotlin.jvm.internal.C7727b0) r3
                java.lang.Object r4 = r5.f15264u
                kotlin.jvm.internal.b0 r4 = (kotlin.jvm.internal.C7727b0) r4
                java.lang.Object r12 = r5.f15263t
                com.withpersona.sdk2.inquiry.internal.fallbackmode.i r12 = (com.withpersona.sdk2.inquiry.internal.fallbackmode.C3686i) r12
                p229jt.C7348o.m30470b(r29)     // Catch: java.io.IOException -> Led
                r16 = r12
                r12 = r0
                r0 = r29
                goto L1ef
            Led:
                r14 = r2
                r15 = r3
                r17 = r11
                r16 = r12
                r9 = 2
                r12 = r0
                r0 = r4
                goto L56c
            Lf8:
                java.lang.Object r0 = r5.f15263t
                com.withpersona.sdk2.inquiry.internal.fallbackmode.i r0 = (com.withpersona.sdk2.inquiry.internal.fallbackmode.C3686i) r0
                p229jt.C7348o.m30470b(r29)
                goto L12e
            L100:
                p229jt.C7348o.m30470b(r29)
                com.withpersona.sdk2.inquiry.internal.k r0 = com.withpersona.sdk2.inquiry.internal.C3692k.this
                dp.i r0 = com.withpersona.sdk2.inquiry.internal.C3692k.m18582e(r0)
                com.withpersona.sdk2.inquiry.internal.fallbackmode.i r0 = r0.getCurrentSession()
                if (r0 == 0) goto L131
                com.withpersona.sdk2.inquiry.internal.k$c$b r1 = new com.withpersona.sdk2.inquiry.internal.k$c$b
                com.withpersona.sdk2.inquiry.internal.InquiryState r2 = r0.m18505a()
                r1.<init>(r2)
                java.lang.Object r2 = pt.C10350l.m39676a(r6)
                r5.f15261G = r2
                java.lang.Object r0 = pt.C10350l.m39676a(r0)
                r5.f15263t = r0
                r5.f15260F = r11
                java.lang.Object r0 = r6.emit(r1, r5)
                if (r0 != r7) goto L12e
                goto L5bd
            L12e:
                kotlin.Unit r0 = kotlin.Unit.f29331a
                return r0
            L131:
                kotlin.jvm.internal.b0 r1 = new kotlin.jvm.internal.b0
                r1.<init>()
                r2 = 1000(0x3e8, double:4.94E-321)
                r1.f29424a = r2
                kotlin.jvm.internal.b0 r2 = new kotlin.jvm.internal.b0
                r2.<init>()
                r3 = 90000(0x15f90, double:4.4466E-319)
                r2.f29424a = r3
                long r3 = java.lang.System.currentTimeMillis()
                r16 = r0
                r0 = r1
                r15 = r2
                r12 = r3
                r14 = 0
            L14e:
                long r1 = java.lang.System.currentTimeMillis()
                long r1 = r1 - r12
                long r3 = r15.f29424a
                int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r1 >= 0) goto L571
                com.withpersona.sdk2.inquiry.internal.k r1 = com.withpersona.sdk2.inquiry.internal.C3692k.this     // Catch: java.io.IOException -> L568
                gp.w r1 = com.withpersona.sdk2.inquiry.internal.C3692k.m18588k(r1)     // Catch: java.io.IOException -> L568
                com.withpersona.sdk2.inquiry.internal.k r2 = com.withpersona.sdk2.inquiry.internal.C3692k.this     // Catch: java.io.IOException -> L568
                java.lang.String r2 = r2.getSessionToken()     // Catch: java.io.IOException -> L568
                com.withpersona.sdk2.inquiry.internal.k r3 = com.withpersona.sdk2.inquiry.internal.C3692k.this     // Catch: java.io.IOException -> L568
                yn.a r3 = com.withpersona.sdk2.inquiry.internal.C3692k.m18581d(r3)     // Catch: java.io.IOException -> L568
                java.lang.String r3 = r3.mo48949b()     // Catch: java.io.IOException -> L568
                com.withpersona.sdk2.inquiry.internal.k r4 = com.withpersona.sdk2.inquiry.internal.C3692k.this     // Catch: java.io.IOException -> L568
                java.lang.String r4 = r4.getInquiryId()     // Catch: java.io.IOException -> L568
                com.withpersona.sdk2.inquiry.internal.k r8 = com.withpersona.sdk2.inquiry.internal.C3692k.this     // Catch: java.io.IOException -> L568
                java.util.List r11 = kotlin.collections.C7697o.m31877c()     // Catch: java.io.IOException -> L565
                java.lang.String r9 = "theme-variable-fonts"
                r11.add(r9)     // Catch: java.io.IOException -> L565
                com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig r9 = com.withpersona.sdk2.inquiry.internal.C3692k.m18585h(r8)     // Catch: java.io.IOException -> L565
                boolean r9 = r9.m20425j()     // Catch: java.io.IOException -> L565
                if (r9 == 0) goto L195
                java.lang.String r9 = "current-inquiry-session"
                r11.add(r9)     // Catch: java.io.IOException -> L190
                goto L195
            L190:
                r9 = 2
            L191:
                r17 = 1
                goto L56c
            L195:
                com.withpersona.sdk2.inquiry.shared.inquiryTheme.a r8 = com.withpersona.sdk2.inquiry.internal.C3692k.m18589l(r8)     // Catch: java.io.IOException -> L565
                com.withpersona.sdk2.inquiry.shared.inquiryTheme.InquiryTheme r8 = r8.m20413a()     // Catch: java.io.IOException -> L565
                boolean r8 = r8.m20408g()     // Catch: java.io.IOException -> L565
                if (r8 == 0) goto L1a8
                java.lang.String r8 = "inquiry-template-version"
                r11.add(r8)     // Catch: java.io.IOException -> L190
            L1a8:
                kotlin.Unit r8 = kotlin.Unit.f29331a     // Catch: java.io.IOException -> L565
                java.util.List r8 = kotlin.collections.C7697o.m31875a(r11)     // Catch: java.io.IOException -> L565
                r18 = r8
                java.lang.Iterable r18 = (java.lang.Iterable) r18     // Catch: java.io.IOException -> L565
                java.lang.String r19 = ","
                r25 = 62
                r26 = 0
                r20 = 0
                r21 = 0
                r22 = 0
                r23 = 0
                r24 = 0
                java.lang.String r8 = kotlin.collections.CollectionsKt.m31715m0(r18, r19, r20, r21, r22, r23, r24, r25, r26)     // Catch: java.io.IOException -> L565
                r5.f15261G = r6     // Catch: java.io.IOException -> L565
                java.lang.Object r9 = pt.C10350l.m39676a(r16)     // Catch: java.io.IOException -> L565
                r5.f15263t = r9     // Catch: java.io.IOException -> L565
                r5.f15264u = r0     // Catch: java.io.IOException -> L565
                r5.f15265v = r15     // Catch: java.io.IOException -> L565
                r5.f15266w = r10     // Catch: java.io.IOException -> L565
                r5.f15258D = r14     // Catch: java.io.IOException -> L565
                r5.f15259E = r12     // Catch: java.io.IOException -> L565
                r9 = 2
                r5.f15260F = r9     // Catch: java.io.IOException -> L562
                r27 = r8
                r8 = r0
                r0 = r1
                r1 = r2
                r2 = r3
                r3 = r4
                r4 = r27
                java.lang.Object r0 = r0.m27315d(r1, r2, r3, r4, r5)     // Catch: java.io.IOException -> L55d
                if (r0 != r7) goto L1ec
                goto L5bd
            L1ec:
                r4 = r8
                r2 = r14
                r3 = r15
            L1ef:
                jv.x r0 = (p231jv.C7396x) r0     // Catch: java.io.IOException -> L556
                boolean r1 = r0.m30657g()
                if (r1 == 0) goto L49e
                okhttp3.Headers r1 = r0.m30656f()
                java.lang.String r8 = "persona-device-id"
                java.lang.String r1 = r1.get(r8)
                if (r1 == 0) goto L20e
                com.withpersona.sdk2.inquiry.internal.k r8 = com.withpersona.sdk2.inquiry.internal.C3692k.this
                yn.a r8 = com.withpersona.sdk2.inquiry.internal.C3692k.m18581d(r8)
                r8.mo48948a(r1)
                kotlin.Unit r1 = kotlin.Unit.f29331a
            L20e:
                java.lang.Object r1 = r0.m30653a()
                if (r1 == 0) goto L496
                com.withpersona.sdk2.inquiry.network.dto.CheckInquiryResponse r1 = (com.withpersona.sdk2.inquiry.network.dto.CheckInquiryResponse) r1
                com.withpersona.sdk2.inquiry.network.dto.CheckInquiryResponse$Data r8 = r1.getData()
                com.withpersona.sdk2.inquiry.network.dto.CheckInquiryResponse$Attributes r8 = r8.getAttributes()
                java.lang.String r8 = r8.getEnvironment()
                java.lang.String r9 = "SANDBOX"
                java.util.Locale r11 = java.util.Locale.ROOT
                java.lang.String r9 = r9.toLowerCase(r11)
                java.lang.String r11 = "toLowerCase(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r11)
                boolean r8 = kotlin.jvm.internal.Intrinsics.m31980c(r8, r9)
                if (r8 == 0) goto L23f
                com.withpersona.sdk2.inquiry.internal.k r8 = com.withpersona.sdk2.inquiry.internal.C3692k.this
                wp.c r8 = com.withpersona.sdk2.inquiry.internal.C3692k.m18587j(r8)
                r9 = 1
                r8.m46824e(r9)
            L23f:
                java.util.List r8 = r1.getIncluded()
                if (r8 == 0) goto L2b5
                java.lang.Iterable r8 = (java.lang.Iterable) r8
                java.util.ArrayList r9 = new java.util.ArrayList
                r9.<init>()
                java.util.Iterator r8 = r8.iterator()
            L250:
                boolean r11 = r8.hasNext()
                if (r11 == 0) goto L262
                java.lang.Object r11 = r8.next()
                boolean r14 = r11 instanceof com.withpersona.sdk2.inquiry.network.dto.Included.Font
                if (r14 == 0) goto L250
                r9.add(r11)
                goto L250
            L262:
                java.util.ArrayList r8 = new java.util.ArrayList
                r11 = 10
                int r11 = kotlin.collections.C7701q.m31905u(r9, r11)
                r8.<init>(r11)
                int r11 = r9.size()
                r14 = 0
            L272:
                if (r14 >= r11) goto L2b2
                java.lang.Object r15 = r9.get(r14)
                int r14 = r14 + 1
                com.withpersona.sdk2.inquiry.network.dto.Included$Font r15 = (com.withpersona.sdk2.inquiry.network.dto.Included.Font) r15
                kr.f r10 = new kr.f
                com.withpersona.sdk2.inquiry.network.dto.Included$Font$FontAttributes r19 = r15.getAttributes()
                r29 = r0
                java.lang.String r0 = r19.getFontFamilyName()
                com.withpersona.sdk2.inquiry.network.dto.Included$Font$FontAttributes r19 = r15.getAttributes()
                r20 = r9
                java.lang.String r9 = r19.getUrl()
                com.withpersona.sdk2.inquiry.network.dto.Included$Font$FontAttributes r19 = r15.getAttributes()
                r21 = r11
                com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements$FontWeight r11 = r19.getFontWeight()
                com.withpersona.sdk2.inquiry.network.dto.Included$Font$FontAttributes r15 = r15.getAttributes()
                com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements$FontStyle r15 = r15.getFontStyle()
                r10.<init>(r0, r9, r11, r15)
                r8.add(r10)
                r0 = r29
                r9 = r20
                r11 = r21
                r10 = 0
                goto L272
            L2b2:
                r29 = r0
                goto L2b7
            L2b5:
                r8 = 0
                goto L2b2
            L2b7:
                com.withpersona.sdk2.inquiry.internal.k r0 = com.withpersona.sdk2.inquiry.internal.C3692k.this
                kr.a r0 = com.withpersona.sdk2.inquiry.internal.C3692k.m18583f(r0)
                r0.mo20928c(r8)
                java.util.List r0 = r1.getIncluded()
                if (r0 == 0) goto L308
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.ArrayList r9 = new java.util.ArrayList
                r9.<init>()
                java.util.Iterator r0 = r0.iterator()
            L2d1:
                boolean r10 = r0.hasNext()
                if (r10 == 0) goto L2e3
                java.lang.Object r10 = r0.next()
                boolean r11 = r10 instanceof com.withpersona.sdk2.inquiry.network.dto.InquiryTemplateVersion
                if (r11 == 0) goto L2d1
                r9.add(r10)
                goto L2d1
            L2e3:
                java.lang.Object r0 = kotlin.collections.CollectionsKt.firstOrNull(r9)
                com.withpersona.sdk2.inquiry.network.dto.InquiryTemplateVersion r0 = (com.withpersona.sdk2.inquiry.network.dto.InquiryTemplateVersion) r0
                if (r0 == 0) goto L308
                com.withpersona.sdk2.inquiry.network.dto.InquiryTemplateVersion$Attributes r0 = r0.getAttributes()
                if (r0 == 0) goto L308
                com.withpersona.sdk2.inquiry.network.dto.InquiryTemplateVersion$InquiryTheme r0 = r0.getTheme()
                if (r0 == 0) goto L308
                com.withpersona.sdk2.inquiry.shared.inquiryTheme.InquiryTheme r0 = gp.C6181a.m27218R(r0)
                if (r0 == 0) goto L308
                com.withpersona.sdk2.inquiry.internal.k r9 = com.withpersona.sdk2.inquiry.internal.C3692k.this
                com.withpersona.sdk2.inquiry.shared.inquiryTheme.a r9 = com.withpersona.sdk2.inquiry.internal.C3692k.m18589l(r9)
                r9.m20414b(r0)
                kotlin.Unit r0 = kotlin.Unit.f29331a
            L308:
                com.withpersona.sdk2.inquiry.network.dto.CheckInquiryResponse$Data r0 = r1.getData()
                com.withpersona.sdk2.inquiry.network.dto.CheckInquiryResponse$Attributes r0 = r0.getAttributes()
                com.withpersona.sdk2.inquiry.network.dto.CheckInquiryResponse$WaitForTransitionConfig r0 = r0.getWaitForTransitionConfig()
                java.util.List r9 = r1.getIncluded()
                if (r9 == 0) goto L33e
                java.lang.Iterable r9 = (java.lang.Iterable) r9
                java.util.ArrayList r10 = new java.util.ArrayList
                r10.<init>()
                java.util.Iterator r9 = r9.iterator()
            L325:
                boolean r11 = r9.hasNext()
                if (r11 == 0) goto L337
                java.lang.Object r11 = r9.next()
                boolean r14 = r11 instanceof com.withpersona.sdk2.inquiry.network.dto.InquirySessionData
                if (r14 == 0) goto L325
                r10.add(r11)
                goto L325
            L337:
                java.lang.Object r9 = kotlin.collections.CollectionsKt.firstOrNull(r10)
                com.withpersona.sdk2.inquiry.network.dto.InquirySessionData r9 = (com.withpersona.sdk2.inquiry.network.dto.InquirySessionData) r9
                goto L33f
            L33e:
                r9 = 0
            L33f:
                if (r9 == 0) goto L357
                com.withpersona.sdk2.inquiry.internal.k r10 = com.withpersona.sdk2.inquiry.internal.C3692k.this
                com.withpersona.sdk2.inquiry.internal.network.e r10 = com.withpersona.sdk2.inquiry.internal.C3692k.m18584g(r10)
                r10.m18744q(r9)
                com.withpersona.sdk2.inquiry.internal.k r10 = com.withpersona.sdk2.inquiry.internal.C3692k.this
                com.withpersona.sdk2.inquiry.network.dto.Attributes r11 = r9.getAttributes()
                com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig r11 = gp.C6183c.m27246a(r11)
                com.withpersona.sdk2.inquiry.internal.C3692k.m18591n(r10, r11)
            L357:
                com.withpersona.sdk2.inquiry.network.dto.CheckInquiryResponse$PollingMode r10 = r0.getPollingMode()
                int[] r11 = com.withpersona.sdk2.inquiry.internal.C3692k.d.a.f15270a
                int r10 = r10.ordinal()
                r10 = r11[r10]
                r11 = 3
                r14 = 1
                if (r10 == r14) goto L3db
                r15 = 2
                if (r10 == r15) goto L3db
                if (r10 != r11) goto L3d5
                com.withpersona.sdk2.inquiry.internal.k r10 = com.withpersona.sdk2.inquiry.internal.C3692k.this
                java.lang.String r10 = r10.getSessionToken()
                com.withpersona.sdk2.inquiry.internal.k r11 = com.withpersona.sdk2.inquiry.internal.C3692k.this
                com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig r11 = com.withpersona.sdk2.inquiry.internal.C3692k.m18585h(r11)
                com.withpersona.sdk2.inquiry.internal.k r14 = com.withpersona.sdk2.inquiry.internal.C3692k.this
                java.lang.String r14 = com.withpersona.sdk2.inquiry.internal.C3692k.m18590m(r14)
                com.withpersona.sdk2.inquiry.internal.InquiryState r10 = gp.C6181a.m27241w(r1, r10, r11, r14)
                com.withpersona.sdk2.inquiry.internal.k$c$b r11 = new com.withpersona.sdk2.inquiry.internal.k$c$b
                r11.<init>(r10)
                java.lang.Object r14 = pt.C10350l.m39676a(r6)
                r5.f15261G = r14
                java.lang.Object r14 = pt.C10350l.m39676a(r16)
                r5.f15263t = r14
                java.lang.Object r4 = pt.C10350l.m39676a(r4)
                r5.f15264u = r4
                java.lang.Object r3 = pt.C10350l.m39676a(r3)
                r5.f15265v = r3
                java.lang.Object r3 = pt.C10350l.m39676a(r29)
                r5.f15266w = r3
                java.lang.Object r1 = pt.C10350l.m39676a(r1)
                r5.f15267x = r1
                java.lang.Object r1 = pt.C10350l.m39676a(r8)
                r5.f15268y = r1
                java.lang.Object r0 = pt.C10350l.m39676a(r0)
                r5.f15269z = r0
                java.lang.Object r0 = pt.C10350l.m39676a(r9)
                r5.f15255A = r0
                java.lang.Object r0 = pt.C10350l.m39676a(r10)
                r5.f15256B = r0
                r5.f15258D = r2
                r5.f15259E = r12
                r0 = 4
                r5.f15260F = r0
                java.lang.Object r0 = r6.emit(r11, r5)
                if (r0 != r7) goto L3d2
                goto L5bd
            L3d2:
                kotlin.Unit r0 = kotlin.Unit.f29331a
                return r0
            L3d5:
                jt.l r0 = new jt.l
                r0.<init>()
                throw r0
            L3db:
                java.lang.Long r10 = r0.getIntervalMs()
                if (r10 == 0) goto L3e9
                long r14 = r10.longValue()
                r4.f29424a = r14
                kotlin.Unit r10 = kotlin.Unit.f29331a
            L3e9:
                java.lang.Long r10 = r0.getMaxAttempts()
                if (r10 == 0) goto L3fd
                long r14 = r10.longValue()
                r19 = r12
                long r11 = r4.f29424a
                long r14 = r14 * r11
                r3.f29424a = r14
                kotlin.Unit r11 = kotlin.Unit.f29331a
                goto L3ff
            L3fd:
                r19 = r12
            L3ff:
                com.withpersona.sdk2.inquiry.network.dto.CheckInquiryResponse$PollingMode r11 = r0.getPollingMode()
                zo.a0 r11 = p610zo.C13951b0.m50446a(r11)
                com.withpersona.sdk2.inquiry.internal.k r12 = com.withpersona.sdk2.inquiry.internal.C3692k.this
                zo.a0 r12 = com.withpersona.sdk2.inquiry.internal.C3692k.m18586i(r12)
                if (r12 == r11) goto L48f
                com.withpersona.sdk2.inquiry.internal.k r12 = com.withpersona.sdk2.inquiry.internal.C3692k.this
                java.lang.String r12 = r12.getSessionToken()
                com.withpersona.sdk2.inquiry.internal.k r13 = com.withpersona.sdk2.inquiry.internal.C3692k.this
                com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig r13 = com.withpersona.sdk2.inquiry.internal.C3692k.m18585h(r13)
                com.withpersona.sdk2.inquiry.internal.k r14 = com.withpersona.sdk2.inquiry.internal.C3692k.this
                java.lang.String r14 = com.withpersona.sdk2.inquiry.internal.C3692k.m18590m(r14)
                com.withpersona.sdk2.inquiry.internal.InquiryState r12 = gp.C6181a.m27241w(r1, r12, r13, r14)
                com.withpersona.sdk2.inquiry.internal.TransitionStatus$CheckingForNextState r13 = new com.withpersona.sdk2.inquiry.internal.TransitionStatus$CheckingForNextState
                com.withpersona.sdk2.inquiry.internal.k r14 = com.withpersona.sdk2.inquiry.internal.C3692k.this
                boolean r14 = com.withpersona.sdk2.inquiry.internal.C3692k.m18580b(r14)
                r13.<init>(r11, r14)
                com.withpersona.sdk2.inquiry.internal.InquiryState r12 = r12.m18092p(r13)
                com.withpersona.sdk2.inquiry.internal.k$c$b r13 = new com.withpersona.sdk2.inquiry.internal.k$c$b
                r13.<init>(r12)
                java.lang.Object r14 = pt.C10350l.m39676a(r6)
                r5.f15261G = r14
                java.lang.Object r14 = pt.C10350l.m39676a(r16)
                r5.f15263t = r14
                java.lang.Object r4 = pt.C10350l.m39676a(r4)
                r5.f15264u = r4
                java.lang.Object r3 = pt.C10350l.m39676a(r3)
                r5.f15265v = r3
                java.lang.Object r3 = pt.C10350l.m39676a(r29)
                r5.f15266w = r3
                java.lang.Object r1 = pt.C10350l.m39676a(r1)
                r5.f15267x = r1
                java.lang.Object r1 = pt.C10350l.m39676a(r8)
                r5.f15268y = r1
                java.lang.Object r0 = pt.C10350l.m39676a(r0)
                r5.f15269z = r0
                java.lang.Object r0 = pt.C10350l.m39676a(r9)
                r5.f15255A = r0
                java.lang.Object r0 = pt.C10350l.m39676a(r11)
                r5.f15256B = r0
                java.lang.Object r0 = pt.C10350l.m39676a(r12)
                r5.f15257C = r0
                r5.f15258D = r2
                r0 = r19
                r5.f15259E = r0
                r10 = 3
                r5.f15260F = r10
                java.lang.Object r0 = r6.emit(r13, r5)
                if (r0 != r7) goto L48c
                goto L5bd
            L48c:
                kotlin.Unit r0 = kotlin.Unit.f29331a
                return r0
            L48f:
                r0 = r19
                kotlin.Unit r8 = kotlin.Unit.f29331a
                r9 = 2
                goto L52a
            L496:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Required value was null."
                r0.<init>(r1)
                throw r0
            L49e:
                r29 = r0
                r0 = r12
                com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$NetworkErrorInfo r8 = com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt.toErrorInfo(r29)
                boolean r9 = r8.isRecoverable()
                if (r9 != 0) goto L4e6
                com.withpersona.sdk2.inquiry.internal.k$c$a r9 = new com.withpersona.sdk2.inquiry.internal.k$c$a
                r9.<init>(r8)
                java.lang.Object r10 = pt.C10350l.m39676a(r6)
                r5.f15261G = r10
                java.lang.Object r10 = pt.C10350l.m39676a(r16)
                r5.f15263t = r10
                java.lang.Object r4 = pt.C10350l.m39676a(r4)
                r5.f15264u = r4
                java.lang.Object r3 = pt.C10350l.m39676a(r3)
                r5.f15265v = r3
                java.lang.Object r3 = pt.C10350l.m39676a(r29)
                r5.f15266w = r3
                java.lang.Object r3 = pt.C10350l.m39676a(r8)
                r5.f15267x = r3
                r5.f15258D = r2
                r5.f15259E = r0
                r0 = 5
                r5.f15260F = r0
                java.lang.Object r0 = r6.emit(r9, r5)
                if (r0 != r7) goto L4e3
                goto L5bd
            L4e3:
                kotlin.Unit r0 = kotlin.Unit.f29331a
                return r0
            L4e6:
                r9 = 2
                if (r2 < r9) goto L524
                com.withpersona.sdk2.inquiry.internal.k$c$a r9 = new com.withpersona.sdk2.inquiry.internal.k$c$a
                r9.<init>(r8)
                java.lang.Object r10 = pt.C10350l.m39676a(r6)
                r5.f15261G = r10
                java.lang.Object r10 = pt.C10350l.m39676a(r16)
                r5.f15263t = r10
                java.lang.Object r4 = pt.C10350l.m39676a(r4)
                r5.f15264u = r4
                java.lang.Object r3 = pt.C10350l.m39676a(r3)
                r5.f15265v = r3
                java.lang.Object r3 = pt.C10350l.m39676a(r29)
                r5.f15266w = r3
                java.lang.Object r3 = pt.C10350l.m39676a(r8)
                r5.f15267x = r3
                r5.f15258D = r2
                r5.f15259E = r0
                r0 = 6
                r5.f15260F = r0
                java.lang.Object r0 = r6.emit(r9, r5)
                if (r0 != r7) goto L521
                goto L5bd
            L521:
                kotlin.Unit r0 = kotlin.Unit.f29331a
                return r0
            L524:
                int r8 = r2 + 1
                pt.C10340b.m39661d(r2)
                r2 = r8
            L52a:
                long r10 = r4.f29424a
                r5.f15261G = r6
                java.lang.Object r8 = pt.C10350l.m39676a(r16)
                r5.f15263t = r8
                r5.f15264u = r4
                r5.f15265v = r3
                java.lang.Object r8 = pt.C10350l.m39676a(r29)
                r5.f15266w = r8
                r5.f15258D = r2
                r5.f15259E = r0
                r8 = 7
                r5.f15260F = r8
                java.lang.Object r8 = p256ku.C7946z0.m32938b(r10, r5)
                if (r8 != r7) goto L54d
                goto L5bd
            L54d:
                r12 = r0
                r14 = r2
                r15 = r3
                goto L48
            L552:
                r10 = 0
                r11 = 1
                goto L14e
            L556:
                r0 = r12
                r9 = 2
                r14 = r2
                r15 = r3
                r0 = r4
                goto L191
            L55d:
                r9 = 2
                r17 = 1
                r0 = r8
                goto L56c
            L562:
                r8 = r0
                goto L191
            L565:
                r8 = r0
                goto L190
            L568:
                r8 = r0
                r17 = r11
                r9 = 2
            L56c:
                r11 = r17
                r10 = 0
                goto L14e
            L571:
                r8 = r0
                com.withpersona.sdk2.inquiry.internal.k r0 = com.withpersona.sdk2.inquiry.internal.C3692k.this
                zo.a0 r0 = com.withpersona.sdk2.inquiry.internal.C3692k.m18586i(r0)
                zo.a0 r1 = p610zo.EnumC13949a0.Blocking
                if (r0 != r1) goto L5be
                com.withpersona.sdk2.inquiry.internal.k$c$a r0 = new com.withpersona.sdk2.inquiry.internal.k$c$a
                com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$NetworkErrorInfo r19 = new com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$NetworkErrorInfo
                r24 = 8
                r25 = 0
                r20 = 0
                java.lang.String r21 = "Timeout error. Wait for transition exceeded 90000ms."
                r22 = 1
                r23 = 0
                r19.<init>(r20, r21, r22, r23, r24, r25)
                r1 = r19
                r0.<init>(r1)
                java.lang.Object r1 = pt.C10350l.m39676a(r6)
                r5.f15261G = r1
                java.lang.Object r1 = pt.C10350l.m39676a(r16)
                r5.f15263t = r1
                java.lang.Object r1 = pt.C10350l.m39676a(r8)
                r5.f15264u = r1
                java.lang.Object r1 = pt.C10350l.m39676a(r15)
                r5.f15265v = r1
                r1 = 0
                r5.f15266w = r1
                r5.f15258D = r14
                r5.f15259E = r12
                r1 = 8
                r5.f15260F = r1
                java.lang.Object r0 = r6.emit(r0, r5)
                if (r0 != r7) goto L5be
            L5bd:
                return r7
            L5be:
                kotlin.Unit r0 = kotlin.Unit.f29331a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.internal.C3692k.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9577i<? super c> interfaceC9577i, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((d) create(interfaceC9577i, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    public C3692k(@NotNull String sessionToken, @Nullable String str, @NotNull String inquiryId, @NotNull EnumC13949a0 pollingMode, @NotNull InquirySessionConfig inquirySessionConfig, boolean z10, @NotNull InterfaceC6203w service, @NotNull InterfaceC13234a deviceIdProvider, @NotNull C12504c sandboxFlags, @NotNull C4655i fallbackModeManager, @NotNull InterfaceC7814a fontDownloader, @NotNull C4007a themeManager, @NotNull C3706e inquiryApiHelper) {
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Intrinsics.checkNotNullParameter(pollingMode, "pollingMode");
        Intrinsics.checkNotNullParameter(inquirySessionConfig, "inquirySessionConfig");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(deviceIdProvider, "deviceIdProvider");
        Intrinsics.checkNotNullParameter(sandboxFlags, "sandboxFlags");
        Intrinsics.checkNotNullParameter(fallbackModeManager, "fallbackModeManager");
        Intrinsics.checkNotNullParameter(fontDownloader, "fontDownloader");
        Intrinsics.checkNotNullParameter(themeManager, "themeManager");
        Intrinsics.checkNotNullParameter(inquiryApiHelper, "inquiryApiHelper");
        this.sessionToken = sessionToken;
        this.trackingEventsUrl = str;
        this.inquiryId = inquiryId;
        this.pollingMode = pollingMode;
        this.inquirySessionConfig = inquirySessionConfig;
        this.canReuseWorkflow = z10;
        this.service = service;
        this.deviceIdProvider = deviceIdProvider;
        this.sandboxFlags = sandboxFlags;
        this.fallbackModeManager = fallbackModeManager;
        this.fontDownloader = fontDownloader;
        this.themeManager = themeManager;
        this.inquiryApiHelper = inquiryApiHelper;
    }

    @Override // p499vr.InterfaceC12257h
    /* JADX INFO: renamed from: a */
    public boolean mo7572a(@NotNull InterfaceC12257h<?> interfaceC12257h) {
        return super.mo7572a(interfaceC12257h);
    }

    @Override // p499vr.InterfaceC12257h
    /* JADX INFO: renamed from: c */
    public boolean mo7574c(@NotNull InterfaceC12257h<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        if (!(otherWorker instanceof C3692k)) {
            return false;
        }
        C3692k c3692k = (C3692k) otherWorker;
        return Intrinsics.m31980c(this.sessionToken, c3692k.sessionToken) && Intrinsics.m31980c(this.inquiryId, c3692k.inquiryId) && this.pollingMode == c3692k.pollingMode;
    }

    @NotNull
    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getInquiryId() {
        return this.inquiryId;
    }

    @NotNull
    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getSessionToken() {
        return this.sessionToken;
    }

    @Override // p499vr.InterfaceC12257h
    @NotNull
    public InterfaceC9575h<c> run() {
        return C9579j.m37806w(new d(null));
    }
}
