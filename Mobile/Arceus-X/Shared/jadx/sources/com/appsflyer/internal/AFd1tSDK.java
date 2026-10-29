package com.appsflyer.internal;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p394qt.C10708b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v8 com.appsflyer.internal.AFd1tSDK[], still in use, count: 1, list:
  (r0v8 com.appsflyer.internal.AFd1tSDK[]) from 0x0072: INVOKE (r0v8 com.appsflyer.internal.AFd1tSDK[]) STATIC call: qt.b.a(java.lang.Enum[]):qt.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):qt.a<E extends java.lang.Enum<E>> (m)]
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f"}, m31665d2 = {"Lcom/appsflyer/internal/AFd1tSDK;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "registerClient", "Ljava/lang/String;", "unregisterClient", "AFKeystoreWrapper", "d", "AFLogger", "w", "i", "v", "e"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class AFd1tSDK {
    TEXT("text/plain"),
    JSON("application/json"),
    OCTET_STREAM("application/octet-stream"),
    XML("application/xml"),
    HTML("text/html"),
    FORM("application/x-www-form-urlencoded"),
    IMAGE_JPEG("image/jpeg"),
    IMAGE_PNG("image/png");


    /* JADX INFO: renamed from: registerClient, reason: from kotlin metadata */
    @NotNull
    public final String unregisterClient;

    static {
        C10708b.m40805a(new AFd1tSDK[]{TEXT, JSON, r6, XML, HTML, FORM, IMAGE_JPEG, r11});
    }

    private AFd1tSDK(String str) {
        super(str, i);
        this.unregisterClient = str;
    }

    public static AFd1tSDK valueOf(String str) {
        return (AFd1tSDK) Enum.valueOf(AFd1tSDK.class, str);
    }

    public static AFd1tSDK[] values() {
        return (AFd1tSDK[]) force.clone();
    }
}
