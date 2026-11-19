package eh;

import com.github.luben.zstd.BuildConfig;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 /2\u00020\u0001:\u00025'B£\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0002\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0002\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\t¢\u0006\u0004\b\u001e\u0010\u0018J+\u0010\"\u001a\u00020\t2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00032\b\u0010 \u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010!\u001a\u00020\b¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\t¢\u0006\u0004\b$\u0010\u0018J\u001f\u0010'\u001a\u00020\t2\u0006\u0010&\u001a\u00020%2\b\b\u0002\u0010!\u001a\u00020\b¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\t¢\u0006\u0004\b)\u0010\u0018J\u000f\u0010*\u001a\u00020\u0003H\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0003H\u0002¢\u0006\u0004\b,\u0010+J\u000f\u0010-\u001a\u00020%H\u0002¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\b2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u00020\t2\u0006\u00101\u001a\u00020\u0003H\u0002¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\tH\u0002¢\u0006\u0004\b4\u0010\u0018J\u0017\u00105\u001a\u00020\t2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b5\u00106J\u001f\u00108\u001a\u00020\t2\u0006\u00107\u001a\u00020\b2\u0006\u0010!\u001a\u00020\bH\u0002¢\u0006\u0004\b8\u00109J\u0017\u0010;\u001a\u00020\t2\u0006\u0010:\u001a\u00020\u000eH\u0002¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\bH\u0002¢\u0006\u0004\b=\u0010>J\u001f\u0010?\u001a\u00020\t2\u0006\u0010&\u001a\u00020%2\u0006\u0010!\u001a\u00020\bH\u0002¢\u0006\u0004\b?\u0010(J\u0017\u0010@\u001a\u00020\t2\u0006\u0010!\u001a\u00020\bH\u0002¢\u0006\u0004\b@\u0010AJ\u0017\u0010B\u001a\u00020\t2\u0006\u0010!\u001a\u00020\bH\u0002¢\u0006\u0004\bB\u0010AJ\u001f\u0010D\u001a\u00020\t2\u0006\u0010C\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\bH\u0002¢\u0006\u0004\bD\u0010ER\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010FR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010GR \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010HR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010FR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010FR\"\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010HR\"\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010HR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010FR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010FR\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020\u000e0K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010LR\u001c\u0010P\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010OR\u0014\u0010R\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010QR\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010SR\u0016\u0010U\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010TR\u0018\u0010X\u001a\u0004\u0018\u00010V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010WR\u0016\u0010Z\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010YR\u0016\u0010\\\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010YR\u0016\u0010]\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010YR\u0016\u0010^\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010YR\u0016\u0010_\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010YR\u0016\u0010a\u001a\u0004\u0018\u00010\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bI\u0010`R\u0014\u0010b\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010+¨\u0006c"}, d2 = {"Leh/e0;", BuildConfig.FLAVOR, "Lkotlin/Function0;", BuildConfig.FLAVOR, "isKillSwitchOn", "Leh/s;", "analytics", "Lkotlin/Function1;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "reportOutcome", "isTrackingOptedOut", "Leh/t;", "readColdStartInputs", "Leh/g0;", "reportEvent", "Leh/h0;", "reportTimeToDecision", BuildConfig.FLAVOR, "msSinceProcessStart", "isHoldActive", "<init>", "(Lkotlin/jvm/functions/Function0;Leh/s;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "n", "()V", "consentRequired", "Leh/b0;", "cache", "r", "(Ljava/lang/Boolean;Leh/b0;)V", "o", "applySharingFilter", "dmaConsented", "trigger", "p", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)V", "t", "Leh/d0;", "decision", "a", "(Leh/d0;Ljava/lang/String;)V", "s", "c", "()Z", "e", "f", "()Leh/d0;", "u", "(Leh/d0;)Ljava/lang/String;", "granted", "x", "(Z)V", "w", "b", "(Leh/d0;)V", "outcome", "v", "(Ljava/lang/String;Ljava/lang/String;)V", "event", "g", "(Leh/g0;)V", "d", "()Ljava/lang/String;", "k", "m", "(Ljava/lang/String;)V", "l", "on", "j", "(ZLjava/lang/String;)V", "Lkotlin/jvm/functions/Function0;", "Leh/s;", "Lkotlin/jvm/functions/Function1;", "h", "i", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "pendingOutcomes", "Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "pendingTimeToDecision", "Ljava/lang/Object;", "lock", "Ljava/lang/Boolean;", "Leh/b0;", "savedCache", "Leh/e0$b;", "Leh/e0$b;", "live", "Z", "attributionBlocked", "q", "coldAttributionBlocked", "coldTrackingOptedOut", "coldEligibilityPending", "firstDecisionReported", "()Ljava/lang/Boolean;", "isConsentRequired", "isHeldUnflagged", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function0<Boolean> isKillSwitchOn;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final s analytics;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function1<String, Unit> reportOutcome;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function0<Boolean> isTrackingOptedOut;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function0<FirebaseColdStartInputs> readColdStartInputs;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Function1<FirebaseOutcomeEvent, Unit> reportEvent;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Function1<FirebaseTimeToDecisionEvent, Unit> reportTimeToDecision;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function0<Long> msSinceProcessStart;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function0<Boolean> isHoldActive;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ConcurrentLinkedQueue<FirebaseOutcomeEvent> pendingOutcomes;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AtomicReference<FirebaseTimeToDecisionEvent> pendingTimeToDecision;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Object lock;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Boolean consentRequired;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public b0 savedCache;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public LiveConsent live;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public boolean attributionBlocked;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public boolean coldAttributionBlocked;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public boolean coldTrackingOptedOut;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    public boolean coldEligibilityPending;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public boolean firstDecisionReported;

    /* JADX INFO: renamed from: eh.e0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b$\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000eR\u0014\u0010\u0014\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u000eR\u0014\u0010\u0015\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u000eR\u0014\u0010\u0016\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u000eR\u0014\u0010\u0017\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u000eR\u0014\u0010\u0018\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u000eR\u0014\u0010\u0019\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u000eR\u0014\u0010\u001a\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u000eR\u0014\u0010\u001b\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u000eR\u0014\u0010\u001c\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u000eR\u0014\u0010\u001d\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u000eR\u0014\u0010\u001e\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u000eR\u0014\u0010\u001f\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u000eR\u0014\u0010 \u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u000eR\u0014\u0010!\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u000eR\u0014\u0010\"\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u000eR\u0014\u0010#\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u000eR\u0014\u0010$\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\u000eR\u0014\u0010%\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\u000eR\u0014\u0010&\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\u000eR\u0014\u0010'\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\u000eR\u0014\u0010(\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010\u000eR\u0014\u0010)\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010\u000eR\u0014\u0010*\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010\u000eR\u0014\u0010+\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b+\u0010\u000eR\u0014\u0010,\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b,\u0010\u000e¨\u0006-"}, d2 = {"Leh/e0$a;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "ms", BuildConfig.FLAVOR, "b", "(J)Ljava/lang/String;", "Leh/d0;", "decision", "a", "(Leh/d0;)Ljava/lang/String;", "TAG", "Ljava/lang/String;", "OUTCOME_ALLOW_ENABLE", "OUTCOME_SHARING_FILTER_DISABLE", "OUTCOME_DMA_WITHDRAWAL_DISABLE", "OUTCOME_TRACKING_OPT_OUT_DISABLE", "OUTCOME_ATTRIBUTION_BLOCKED_DISABLE", "OUTCOME_NOT_REQUIRED_ENABLE", "OUTCOME_PRE_DECISION_LEFT_OFF", "OUTCOME_STALE_CACHE_LEFT_OFF", "OUTCOME_HELD_UNFLAGGED_LEFT_OFF", "OUTCOME_KILL_SWITCH_RESTORED_CONSENT", "OUTCOME_SESSION_ENDED", "OUTCOME_COLD_START_PREFIX", "GEO_FLAGGED", "GEO_UNFLAGGED", "GEO_UNKNOWN", "GEO_BLOCKED", "TRIGGER_COLD_START", "TRIGGER_ELIGIBILITY", "TRIGGER_LIVE_PUBLISH", "TRIGGER_BACKSTOP", "TRIGGER_LOGOUT", "TRIGGER_OPT_OUT", "TRIGGER_KILL_SWITCH", "STATE_ON", "STATE_OFF", "BUCKET_UNDER_1S", "BUCKET_1_TO_3S", "BUCKET_3_TO_10S", "BUCKET_10_TO_60S", "BUCKET_OVER_60S", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: eh.e0$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class C0260a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f13513a;

            static {
                int[] iArr = new int[d0.values().length];
                try {
                    iArr[d0.ALLOW.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[d0.NOT_REQUIRED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[d0.BLOCK_SHARING_FILTER.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[d0.BLOCK_DMA_WITHDRAWAL.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[d0.BLOCK_TRACKING_OPT_OUT.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[d0.BLOCK_ATTRIBUTION_BLOCKED.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[d0.STAY_OFF_NO_DECISION.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[d0.STAY_OFF_STALE_CACHE.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                f13513a = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String a(@NotNull d0 decision) {
            Intrinsics.checkNotNullParameter(decision, "decision");
            switch (C0260a.f13513a[decision.ordinal()]) {
                case 1:
                    return "allow_enable";
                case 2:
                    return "not_required_enable";
                case 3:
                    return "sharing_filter_disable";
                case 4:
                    return "dma_withdrawal_disable";
                case 5:
                    return "tracking_opt_out_disable";
                case 6:
                    return "attribution_blocked_disable";
                case 7:
                    return "pre_decision_left_off";
                case 8:
                    return "stale_cache_left_off";
                default:
                    throw new zt.l();
            }
        }

        @NotNull
        public final String b(long ms2) {
            if (ms2 < 1000) {
                return "lt_1s";
            }
            if (ms2 < 3000) {
                return "1_3s";
            }
            if (ms2 < 10000) {
                return "3_10s";
            }
            return ms2 < 60000 ? "10_60s" : "gt_60s";
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: eh.e0$b, reason: from toString */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0082\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0011\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"Leh/e0$b;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "applySharingFilter", "dmaConsented", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "b", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LiveConsent {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final Boolean applySharingFilter;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @Nullable
        public final Boolean dmaConsented;

        public LiveConsent(@Nullable Boolean bool, @Nullable Boolean bool2) {
            this.applySharingFilter = bool;
            this.dmaConsented = bool2;
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Boolean getApplySharingFilter() {
            return this.applySharingFilter;
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public final Boolean getDmaConsented() {
            return this.dmaConsented;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LiveConsent)) {
                return false;
            }
            LiveConsent liveConsent = (LiveConsent) other;
            return Intrinsics.c(this.applySharingFilter, liveConsent.applySharingFilter) && Intrinsics.c(this.dmaConsented, liveConsent.dmaConsented);
        }

        public int hashCode() {
            Boolean bool = this.applySharingFilter;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Boolean bool2 = this.dmaConsented;
            return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "LiveConsent(applySharingFilter=" + this.applySharingFilter + ", dmaConsented=" + this.dmaConsented + ")";
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13515a;

        static {
            int[] iArr = new int[d0.values().length];
            try {
                iArr[d0.STAY_OFF_NO_DECISION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d0.STAY_OFF_STALE_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d0.ALLOW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d0.NOT_REQUIRED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[d0.BLOCK_TRACKING_OPT_OUT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[d0.BLOCK_ATTRIBUTION_BLOCKED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[d0.BLOCK_SHARING_FILTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[d0.BLOCK_DMA_WITHDRAWAL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f13515a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e0(@NotNull Function0<Boolean> isKillSwitchOn, @NotNull s analytics, @NotNull Function1<? super String, Unit> reportOutcome, @NotNull Function0<Boolean> isTrackingOptedOut, @NotNull Function0<FirebaseColdStartInputs> readColdStartInputs, @Nullable Function1<? super FirebaseOutcomeEvent, Unit> function1, @Nullable Function1<? super FirebaseTimeToDecisionEvent, Unit> function2, @NotNull Function0<Long> msSinceProcessStart, @NotNull Function0<Boolean> isHoldActive) {
        Intrinsics.checkNotNullParameter(isKillSwitchOn, "isKillSwitchOn");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(reportOutcome, "reportOutcome");
        Intrinsics.checkNotNullParameter(isTrackingOptedOut, "isTrackingOptedOut");
        Intrinsics.checkNotNullParameter(readColdStartInputs, "readColdStartInputs");
        Intrinsics.checkNotNullParameter(msSinceProcessStart, "msSinceProcessStart");
        Intrinsics.checkNotNullParameter(isHoldActive, "isHoldActive");
        this.isKillSwitchOn = isKillSwitchOn;
        this.analytics = analytics;
        this.reportOutcome = reportOutcome;
        this.isTrackingOptedOut = isTrackingOptedOut;
        this.readColdStartInputs = readColdStartInputs;
        this.reportEvent = function1;
        this.reportTimeToDecision = function2;
        this.msSinceProcessStart = msSinceProcessStart;
        this.isHoldActive = isHoldActive;
        this.pendingOutcomes = new ConcurrentLinkedQueue<>();
        this.pendingTimeToDecision = new AtomicReference<>(null);
        this.lock = new Object();
        this.savedCache = b0.a.f13478a;
    }

    public static /* synthetic */ void q(e0 e0Var, Boolean bool, Boolean bool2, String str, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str = "live_publish";
        }
        e0Var.p(bool, bool2, str);
    }

    public final void a(@NotNull d0 decision, @NotNull String trigger) {
        Intrinsics.checkNotNullParameter(decision, "decision");
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        if (this.analytics.c()) {
            if (this.isKillSwitchOn.invoke().booleanValue()) {
                w();
                m("kill_switch");
                v("kill_switch_restored_consent", "kill_switch");
            } else {
                b(decision);
                k(decision, trigger);
                v(u(decision), trigger);
            }
        }
    }

    public final void b(d0 decision) {
        switch (c.f13515a[decision.ordinal()]) {
            case 1:
            case 2:
                this.analytics.a(false);
                break;
            case 3:
            case 4:
                x(true);
                this.analytics.a(true);
                break;
            case 5:
            case 6:
            case 7:
            case 8:
                this.analytics.a(false);
                x(false);
                break;
            default:
                throw new zt.l();
        }
        ok.q.h("FirebaseConsentGate", "apply: " + decision + " collectionEnabled=" + decision.getCollectionEnabled());
    }

    public final boolean c() {
        FirebaseColdStartInputs firebaseColdStartInputsInvoke;
        try {
            firebaseColdStartInputsInvoke = this.readColdStartInputs.invoke();
        } catch (Throwable th2) {
            ok.q.k("FirebaseConsentGate", "onAppStart: cold start read failed: " + th2);
            firebaseColdStartInputsInvoke = null;
        }
        if (firebaseColdStartInputsInvoke == null) {
            synchronized (this.lock) {
                this.coldEligibilityPending = true;
                Unit unit = Unit.f21506a;
            }
            return false;
        }
        synchronized (this.lock) {
            this.consentRequired = firebaseColdStartInputsInvoke.getConsentRequired();
            this.savedCache = firebaseColdStartInputsInvoke.getCache();
            this.coldAttributionBlocked = firebaseColdStartInputsInvoke.getAttributionBlocked();
            this.coldTrackingOptedOut = firebaseColdStartInputsInvoke.getTrackingOptedOut();
            this.coldEligibilityPending = firebaseColdStartInputsInvoke.getEligibilityPending();
            d0 d0VarF = f();
            b(d0VarF);
            this.pendingOutcomes.add(new FirebaseOutcomeEvent("cold_start_" + u(d0VarF), d(), "cold_start"));
            k(d0VarF, "cold_start");
            ok.q.h("FirebaseConsentGate", "onAppStart: cold start " + d0VarF + " collectionEnabled=" + d0VarF.getCollectionEnabled());
        }
        return true;
    }

    public final String d() {
        String str;
        synchronized (this.lock) {
            try {
                if (this.attributionBlocked || this.coldAttributionBlocked) {
                    str = "blocked";
                } else if (Intrinsics.c(this.consentRequired, Boolean.TRUE)) {
                    str = "flagged";
                } else {
                    str = Intrinsics.c(this.consentRequired, Boolean.FALSE) ? "unflagged" : "unknown";
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    public final boolean e() {
        if (this.isKillSwitchOn.invoke().booleanValue()) {
            return false;
        }
        return this.coldTrackingOptedOut || this.isTrackingOptedOut.invoke().booleanValue();
    }

    public final d0 f() {
        boolean zE = e();
        boolean z10 = this.attributionBlocked || this.coldAttributionBlocked;
        Boolean boolH = h();
        LiveConsent liveConsent = this.live;
        d0 d0VarD = liveConsent != null ? c0.d(boolH, liveConsent.getApplySharingFilter(), liveConsent.getDmaConsented(), zE, z10) : null;
        if (!this.coldEligibilityPending) {
            return d0VarD == null ? c0.b(boolH, this.savedCache, zE, z10) : d0VarD;
        }
        if (d0VarD != null && !d0VarD.getCollectionEnabled()) {
            return d0VarD;
        }
        if (zE) {
            return d0.BLOCK_TRACKING_OPT_OUT;
        }
        if (z10) {
            return d0.BLOCK_ATTRIBUTION_BLOCKED;
        }
        b0 b0Var = this.savedCache;
        b0.Fresh fresh = b0Var instanceof b0.Fresh ? (b0.Fresh) b0Var : null;
        d0 d0VarC = fresh != null ? c0.c(fresh.getApplySharingFilter(), fresh.getDmaConsented()) : null;
        return (d0VarC == null || d0VarC.getCollectionEnabled()) ? d0.STAY_OFF_NO_DECISION : d0VarC;
    }

    public final void g(FirebaseOutcomeEvent event) {
        try {
            Function1<FirebaseOutcomeEvent, Unit> function1 = this.reportEvent;
            if (function1 != null) {
                function1.invoke(event);
            } else {
                this.reportOutcome.invoke(event.getOutcome());
            }
        } catch (Throwable th2) {
            ok.q.k("FirebaseConsentGate", "report failed for " + event.getOutcome() + ": " + th2);
        }
    }

    public final Boolean h() {
        return i() ? Boolean.TRUE : this.consentRequired;
    }

    public final boolean i() {
        return Intrinsics.c(this.consentRequired, Boolean.FALSE) && this.isHoldActive.invoke().booleanValue();
    }

    public final void j(boolean on2, String trigger) {
        synchronized (this.lock) {
            if (!this.firstDecisionReported) {
                this.firstDecisionReported = true;
                try {
                    this.pendingTimeToDecision.set(new FirebaseTimeToDecisionEvent(INSTANCE.b(this.msSinceProcessStart.invoke().longValue()), on2 ? "on" : "off", trigger));
                } catch (Throwable th2) {
                    ok.q.k("FirebaseConsentGate", "time to decision failed: " + th2);
                }
            }
            Unit unit = Unit.f21506a;
        }
    }

    public final void k(d0 decision, String trigger) {
        int i10 = c.f13515a[decision.ordinal()];
        if (i10 == 1 || i10 == 2) {
            return;
        }
        j(decision.getCollectionEnabled(), trigger);
    }

    public final void l(String trigger) {
        j(false, trigger);
    }

    public final void m(String trigger) {
        j(true, trigger);
    }

    public final void n() {
        if (!this.analytics.c()) {
            ok.q.h("FirebaseConsentGate", "onAppStart: no FirebaseApp, nothing to gate");
            return;
        }
        if (this.isKillSwitchOn.invoke().booleanValue()) {
            w();
            this.pendingOutcomes.add(new FirebaseOutcomeEvent("kill_switch_restored_consent", "unknown", "kill_switch"));
            m("kill_switch");
            ok.q.h("FirebaseConsentGate", "onAppStart: kill switch on, consent restored and collection on");
            return;
        }
        if (c()) {
            return;
        }
        this.analytics.a(false);
        ok.q.h("FirebaseConsentGate", "onAppStart: gate active, collection off until a decision");
    }

    public final void o() {
        synchronized (this.lock) {
            this.attributionBlocked = true;
            this.coldEligibilityPending = false;
            a(f(), "eligibility");
            Unit unit = Unit.f21506a;
        }
    }

    public final void p(@Nullable Boolean applySharingFilter, @Nullable Boolean dmaConsented, @NotNull String trigger) {
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        synchronized (this.lock) {
            try {
                if (c0.d(h(), applySharingFilter, dmaConsented, e(), this.attributionBlocked || this.coldAttributionBlocked) == null) {
                    return;
                }
                this.live = new LiveConsent(applySharingFilter, dmaConsented);
                a(f(), trigger);
                Unit unit = Unit.f21506a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void r(@Nullable Boolean consentRequired, @NotNull b0 cache) {
        Intrinsics.checkNotNullParameter(cache, "cache");
        synchronized (this.lock) {
            this.consentRequired = consentRequired;
            this.savedCache = cache;
            this.coldAttributionBlocked = false;
            this.coldEligibilityPending = false;
            a(f(), "eligibility");
            Unit unit = Unit.f21506a;
        }
    }

    public final void s() {
        if (!this.analytics.c() || this.isKillSwitchOn.invoke().booleanValue()) {
            return;
        }
        synchronized (this.lock) {
            this.live = null;
            this.savedCache = b0.a.f13478a;
            d0 d0VarF = f();
            if (d0VarF == d0.NOT_REQUIRED) {
                a(d0VarF, "logout");
                return;
            }
            this.analytics.a(false);
            x(false);
            ok.q.h("FirebaseConsentGate", "onSessionEnded: collection off, consent denied");
            l("logout");
            v("session_ended_disable", "logout");
            Unit unit = Unit.f21506a;
        }
    }

    public final void t() {
        if (!this.analytics.c() || this.isKillSwitchOn.invoke().booleanValue()) {
            return;
        }
        synchronized (this.lock) {
            this.coldTrackingOptedOut = false;
            a(f(), "opt_out");
            Unit unit = Unit.f21506a;
        }
    }

    public final String u(d0 decision) {
        int i10 = c.f13515a[decision.ordinal()];
        return ((i10 == 1 || i10 == 2) && i()) ? "held_unflagged_left_off" : INSTANCE.a(decision);
    }

    public final void v(String outcome, String trigger) {
        while (true) {
            FirebaseOutcomeEvent firebaseOutcomeEventPoll = this.pendingOutcomes.poll();
            if (firebaseOutcomeEventPoll == null) {
                break;
            } else {
                g(firebaseOutcomeEventPoll);
            }
        }
        g(new FirebaseOutcomeEvent(outcome, d(), trigger));
        FirebaseTimeToDecisionEvent andSet = this.pendingTimeToDecision.getAndSet(null);
        if (andSet != null) {
            try {
                Function1<FirebaseTimeToDecisionEvent, Unit> function1 = this.reportTimeToDecision;
                if (function1 != null) {
                    function1.invoke(andSet);
                    Unit unit = Unit.f21506a;
                }
            } catch (Throwable th2) {
                ok.q.k("FirebaseConsentGate", "time to decision failed: " + th2);
            }
        }
    }

    public final void w() {
        x(true);
        this.analytics.a(true);
    }

    public final void x(boolean granted) {
        s sVar = this.analytics;
        hu.a<f0> aVarB = f0.b();
        LinkedHashMap linkedHashMap = new LinkedHashMap(p001kotlin.ranges.d.c(p001kotlin.collections.j0.f(p001kotlin.collections.q.u(aVarB, 10)), 16));
        Iterator<f0> it = aVarB.iterator();
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), Boolean.valueOf(granted));
        }
        sVar.b(linkedHashMap);
    }
}
