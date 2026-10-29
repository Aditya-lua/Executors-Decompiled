package com.appsflyer.internal;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v10 com.appsflyer.internal.AFd1bSDK[], still in use, count: 1, list:
  (r0v10 com.appsflyer.internal.AFd1bSDK[]) from 0x00f0: INVOKE (r0v10 com.appsflyer.internal.AFd1bSDK[]) STATIC call: qt.b.a(java.lang.Enum[]):qt.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):qt.a<E extends java.lang.Enum<E>> (m), WRAPPED]
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u001a\b\u0086\u0001\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000bj\u0002\b\tj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001d"}, d2 = {"Lcom/appsflyer/internal/AFd1bSDK;", "Lcom/appsflyer/internal/AFe1zSDK;", "", "", "p0", "<init>", "(Ljava/lang/String;II)V", "getEntries", "I", "AFLogger", "()I", "unregisterClient", "AFa1vSDK", "d", "AFKeystoreWrapper", "registerClient", "v", "i", "force", "e", "w", "afDebugLog", "afInfoLog", "afErrorLog", "AFLoggerLogLevel", "afWarnLog", "values", "AppsFlyerLib", "getLevel", "valueOf"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AFd1bSDK implements AFe1zSDK {
    RC_CDN(1),
    FETCH_ADVERTISING_ID(1),
    LOAD_CACHE(2),
    CACHED_EVENT(2),
    CONVERSION(2),
    PLAY_INTEGRITY_API(2),
    ONELINK(2),
    DLSDK(2),
    RESOLVE_ESP(2),
    ATTR(2),
    GCDSDK(3),
    REGISTER(4),
    LAUNCH(4),
    INAPP(4),
    MANUAL_PURCHASE_VALIDATION(4),
    PURCHASE_VALIDATE(4),
    IMPRESSIONS(4),
    ARS_VALIDATE(4),
    ADREVENUE(4);


    /* JADX INFO: renamed from: AFa1vSDK, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final /* synthetic */ qt.a getInstance;

    /* JADX INFO: renamed from: getEntries, reason: from kotlin metadata */
    private final int unregisterClient;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFd1bSDK$AFa1vSDK, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/appsflyer/internal/AFd1bSDK$AFa1vSDK;", "", "<init>", "()V", "", "p0", "Lcom/appsflyer/internal/AFd1bSDK;", "registerClient", "(Ljava/lang/String;)Lcom/appsflyer/internal/AFd1bSDK;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @Nullable
        public static AFd1bSDK registerClient(@NotNull String p8) {
            AFd1bSDK next;
            Intrinsics.checkNotNullParameter(p8, "");
            Iterator<AFd1bSDK> it = AFd1bSDK.registerClient().iterator();
            while (it.hasNext()) {
                next = it.next();
                if (Intrinsics.c(next.name(), p8)) {
                    return next;
                }
            }
            next = null;
            return next;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        getInstance = qt.b.a(new AFd1bSDK[]{r1, r2, r3, r0, r5, r7, r7, r10, r9, r10, r11, r12, r13, r14, r15, r0, r1, r0, r1});
    }

    private AFd1bSDK(int i10) {
        super(str, i);
        this.unregisterClient = i10;
    }

    @Nullable
    public static final AFd1bSDK registerClient(@NotNull String str) {
        return Companion.registerClient(str);
    }

    public static AFd1bSDK valueOf(String str) {
        return (AFd1bSDK) Enum.valueOf(AFd1bSDK.class, str);
    }

    public static AFd1bSDK[] values() {
        return (AFd1bSDK[]) enableTCFDataCollection.clone();
    }

    @Override // com.appsflyer.internal.AFe1zSDK
    /* JADX INFO: renamed from: AFLogger, reason: from getter */
    public final int getUnregisterClient() {
        return this.unregisterClient;
    }

    @Override // com.appsflyer.internal.AFe1zSDK
    public final /* synthetic */ String unregisterClient() {
        return name();
    }

    @NotNull
    public static qt.a<AFd1bSDK> registerClient() {
        return getInstance;
    }
}
