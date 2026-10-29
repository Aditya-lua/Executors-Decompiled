package com.appsflyer.internal;

import android.text.TextUtils;
import backtraceio.library.services.BacktraceMetrics;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7690k0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7352s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \r2\u00020\u0001:\u0001\rBE\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f"}, m31665d2 = {"Lcom/appsflyer/internal/AFd1qSDK;", "Lcom/appsflyer/internal/AFd1oSDK;", "", "p0", "", "p1", "", "p2", "p3", "", "p4", "<init>", "(Ljava/lang/String;Ljava/util/Map;[BLjava/lang/String;Z)V", "AFa1ySDK"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class AFd1qSDK extends AFd1oSDK {

    /* JADX INFO: renamed from: AFa1ySDK, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.appsflyer.internal.AFd1qSDK$AFa1ySDK, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\n\u001a\u0006*\u00020\u00040\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000b"}, m31665d2 = {"Lcom/appsflyer/internal/AFd1qSDK$AFa1ySDK;", "", "<init>", "()V", "", "p0", "p1", "p2", "p3", "p4", "unregisterClient", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private Companion() {
        }

        public static String unregisterClient(@NotNull String p8, @NotNull String p10, @Nullable String p11, @NotNull String p12, @NotNull String p13) {
            Intrinsics.checkNotNullParameter(p8, "");
            Intrinsics.checkNotNullParameter(p10, "");
            Intrinsics.checkNotNullParameter(p12, "");
            Intrinsics.checkNotNullParameter(p13, "");
            return AFj1nSDK.m8932d(TextUtils.join("\u2063", new String[]{p13, p11, p8 + p10}), p12);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:2) call: com.appsflyer.internal.AFd1qSDK.AFa1ySDK.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
      (r7v0 java.lang.String)
      (r8v0 java.util.Map)
      (wrap byte[]:0x0005: TERNARY null = ((wrap int:0x0000: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null byte[]) : (r9v0 byte[]))
      (wrap java.lang.String:0x000c: TERNARY null = ((wrap int:0x0006: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("GET") : (r10v0 java.lang.String))
      (wrap boolean:?: TERNARY null = ((wrap int:0x000d: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r11v0 boolean))
     A[MD:(java.lang.String, java.util.Map<java.lang.String, java.lang.String>, byte[], java.lang.String, boolean):void (m)] (LINE:2) call: com.appsflyer.internal.AFd1qSDK.<init>(java.lang.String, java.util.Map, byte[], java.lang.String, boolean):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ AFd1qSDK(String str, Map map, byte[] bArr, String str2, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, map, (i10 & 4) != 0 ? null : bArr, (i10 & 8) != 0 ? "GET" : str2, (i10 & 16) != 0 ? false : z10);
    }

    @NotNull
    public static final AFd1qSDK unregisterClient(@NotNull String str, @NotNull String str2, @Nullable String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        String strValueOf = String.valueOf(System.currentTimeMillis());
        AFd1qSDK aFd1qSDK = new AFd1qSDK(str, C7690k0.m31798m(C7352s.m30477a("Connection", "close"), C7352s.m30477a("af_request_epoch_ms", strValueOf), C7352s.m30477a("af_sig", Companion.unregisterClient(str2, str4, str3, str5, strValueOf))), null, null, false, 28, null);
        aFd1qSDK.f6912v = BacktraceMetrics.defaultTimeBetweenRetriesMs;
        return aFd1qSDK;
    }

    private AFd1qSDK(String str, Map<String, String> map, byte[] bArr, String str2, boolean z10) {
        super(str, bArr, str2, map, z10);
    }
}
