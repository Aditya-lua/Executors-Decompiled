package com.appsflyer.internal;

import kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.appsflyer.internal.AFd1cSDK[], still in use, count: 1, list:
  (r0v1 com.appsflyer.internal.AFd1cSDK[]) from 0x0024: INVOKE (r0v1 com.appsflyer.internal.AFd1cSDK[]) STATIC call: qt.b.a(java.lang.Enum[]):qt.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):qt.a<E extends java.lang.Enum<E>> (m)]
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/appsflyer/internal/AFd1cSDK;", "", "<init>", "(Ljava/lang/String;I)V", "d", "registerClient", "unregisterClient"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AFd1cSDK {
    SUCCESS,
    FAILURE,
    TIMEOUT;

    static {
        qt.b.a(aFd1cSDKArr);
    }

    private AFd1cSDK() {
        super(str, i);
    }

    public static AFd1cSDK valueOf(String str) {
        return (AFd1cSDK) Enum.valueOf(AFd1cSDK.class, str);
    }

    public static AFd1cSDK[] values() {
        return (AFd1cSDK[]) AFLogger.clone();
    }
}
