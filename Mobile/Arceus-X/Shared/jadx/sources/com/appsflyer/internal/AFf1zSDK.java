package com.appsflyer.internal;

import android.net.Uri;
import androidx.core.app.NotificationCompat;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import com.appsflyer.sdk_base.referrer.Payload;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7690k0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7352s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0001\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0015¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0010¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0006\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0018\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0018\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0012\u001a\u00020\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010&R:\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0016@RX\u0097\u000e¢\u0006\u0006\n\u0004\b'\u0010("}, m31665d2 = {"Lcom/appsflyer/internal/AFf1zSDK;", "Lcom/appsflyer/internal/AFe1ySDK;", "", "", "", "Lcom/appsflyer/internal/AFa1qSDK;", "p0", "Lcom/appsflyer/internal/AFa1kSDK;", "p1", "Landroid/net/Uri;", "p2", "", "p3", "Lcom/appsflyer/internal/AFe1mSDK;", "p4", "<init>", "(Lcom/appsflyer/internal/AFa1qSDK;Lcom/appsflyer/internal/AFa1kSDK;Landroid/net/Uri;Ljava/util/List;Lcom/appsflyer/internal/AFe1mSDK;)V", "Lcom/appsflyer/internal/AFd1cSDK;", "registerClient", "()Lcom/appsflyer/internal/AFd1cSDK;", "", "d", "()J", "", "AFLogger", "()Z", "(Ljava/lang/String;)Z", "force", "Lcom/appsflyer/internal/AFa1qSDK;", "AFKeystoreWrapper", "v", "Lcom/appsflyer/internal/AFa1kSDK;", "i", "Landroid/net/Uri;", "unregisterClient", "afWarnLog", "Ljava/util/List;", "afInfoLog", "Lcom/appsflyer/internal/AFe1mSDK;", "e", "Ljava/util/Map;"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class AFf1zSDK extends AFe1ySDK<Map<String, ? extends Object>> {

    /* JADX INFO: renamed from: afInfoLog, reason: from kotlin metadata */
    @NotNull
    private final AFe1mSDK registerClient;

    /* JADX INFO: renamed from: afWarnLog, reason: from kotlin metadata */
    @NotNull
    private final List<String> d;

    @Nullable
    public Map<String, ? extends Object> e;

    /* JADX INFO: renamed from: force, reason: from kotlin metadata */
    @NotNull
    private final AFa1qSDK AFKeystoreWrapper;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Uri unregisterClient;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @NotNull
    private final AFa1kSDK AFLogger;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AFf1zSDK(@NotNull AFa1qSDK aFa1qSDK, @NotNull AFa1kSDK aFa1kSDK, @NotNull Uri uri, @NotNull List<String> list) {
        this(aFa1qSDK, aFa1kSDK, uri, list, null, 16, null);
        Intrinsics.checkNotNullParameter(aFa1qSDK, "");
        Intrinsics.checkNotNullParameter(aFa1kSDK, "");
        Intrinsics.checkNotNullParameter(uri, "");
        Intrinsics.checkNotNullParameter(list, "");
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.appsflyer.internal.AFf1ySDK.y_(android.net.Uri):java.util.Map */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w_ */
    public static final Map m8859w_(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "");
        return AFf1ySDK.m8856x_(uri);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.appsflyer.internal.AFe1ySDK
    public final boolean AFLogger() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1ySDK
    /* JADX INFO: renamed from: d */
    public final long mo8802d() {
        return AFf1ySDK.AFKeystoreWrapper;
    }

    @Override // com.appsflyer.internal.AFe1ySDK
    @NotNull
    public final AFd1cSDK registerClient() {
        String string = this.unregisterClient.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        if (!AFLogger(string)) {
            this.AFKeystoreWrapper.m8719f_(this.AFLogger, this.unregisterClient, null);
            return AFd1cSDK.SUCCESS;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        String string2 = this.unregisterClient.toString();
        int i10 = 0;
        Integer num = null;
        String str = null;
        while (i10 < 5) {
            AFe1mSDK aFe1mSDK = this.registerClient;
            Uri uri = Uri.parse(string2);
            Intrinsics.checkNotNullExpressionValue(uri, "");
            Map<String, Object> mapFetch = aFe1mSDK.fetch(uri);
            Object obj = mapFetch.get("res");
            String str2 = obj instanceof String ? (String) obj : null;
            Object obj2 = mapFetch.get(NotificationCompat.CATEGORY_STATUS);
            Integer num2 = obj2 instanceof Integer ? (Integer) obj2 : null;
            Object obj3 = mapFetch.get("error");
            String str3 = obj3 instanceof String ? (String) obj3 : null;
            if (str2 == null || !AFLogger(str2)) {
                Integer num3 = num2;
                str = str3;
                string2 = str2;
                num = num3;
                break;
            }
            if (i10 < 4) {
                arrayList.add(str2);
            }
            i10++;
            Integer num4 = num2;
            str = str3;
            string2 = str2;
            num = num4;
        }
        Map<String, ? extends Object> mapM31799n = C7690k0.m31799n(C7352s.m30477a("res", string2 == null ? "" : string2), C7352s.m30477a(NotificationCompat.CATEGORY_STATUS, Integer.valueOf(num != null ? num.intValue() : -1)), C7352s.m30477a(Payload.LATENCY, Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis)));
        if (str != null) {
            mapM31799n.put("error", str);
        }
        if (!arrayList.isEmpty()) {
            mapM31799n.put("redirects", arrayList);
        }
        synchronized (this.AFLogger) {
            this.AFLogger.unregisterClient("af_deeplink_r", mapM31799n);
            this.AFLogger.unregisterClient("af_deeplink", this.unregisterClient.toString());
            Unit unit = Unit.f29331a;
        }
        this.AFKeystoreWrapper.m8719f_(this.AFLogger, string2 != null ? Uri.parse(string2) : this.unregisterClient, this.unregisterClient);
        this.e = mapM31799n;
        return AFd1cSDK.SUCCESS;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000f: CONSTRUCTOR 
      (r7v0 com.appsflyer.internal.AFa1qSDK)
      (r8v0 com.appsflyer.internal.AFa1kSDK)
      (r9v0 android.net.Uri)
      (r10v0 java.util.List)
      (wrap com.appsflyer.internal.AFe1mSDK:?: TERNARY null = ((wrap int:0x0000: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap com.appsflyer.internal.AFe1mSDK:0x0006: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:2) call: com.appsflyer.internal.q0.<init>():void type: CONSTRUCTOR) : (r11v0 com.appsflyer.internal.AFe1mSDK))
     A[MD:(com.appsflyer.internal.AFa1qSDK, com.appsflyer.internal.AFa1kSDK, android.net.Uri, java.util.List<java.lang.String>, com.appsflyer.internal.AFe1mSDK):void (m)] (LINE:3) call: com.appsflyer.internal.AFf1zSDK.<init>(com.appsflyer.internal.AFa1qSDK, com.appsflyer.internal.AFa1kSDK, android.net.Uri, java.util.List, com.appsflyer.internal.AFe1mSDK):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ AFf1zSDK(AFa1qSDK aFa1qSDK, AFa1kSDK aFa1kSDK, Uri uri, List list, AFe1mSDK aFe1mSDK, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFa1qSDK, aFa1kSDK, uri, list, (i10 & 16) != 0 ? new AFe1mSDK() { // from class: com.appsflyer.internal.q0
            @Override // com.appsflyer.internal.AFe1mSDK
            public final Map fetch(Uri uri2) {
                return AFf1zSDK.m8859w_(uri2);
            }
        } : aFe1mSDK);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    private final boolean AFLogger(String p8) {
        if (StringsKt.m32152a0(p8, "af_tranid=", false, 2, null)) {
            return false;
        }
        AFLoggerBase.v$default(AFLogger.INSTANCE, LogTag.DDL, "Validate if link " + p8 + " belongs to ESP domains: " + this.d, false, 4, null);
        try {
            return this.d.contains(new URL(p8).getHost());
        } catch (MalformedURLException e10) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.DDL, "MalformedURLException ESP link", e10, false, false, false, false, 96, null);
            return false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private AFf1zSDK(@NotNull AFa1qSDK aFa1qSDK, @NotNull AFa1kSDK aFa1kSDK, @NotNull Uri uri, @NotNull List<String> list, @NotNull AFe1mSDK aFe1mSDK) {
        super(AFd1bSDK.RESOLVE_ESP, new AFe1zSDK[]{AFd1bSDK.RC_CDN}, "ResolveEsp");
        Intrinsics.checkNotNullParameter(aFa1qSDK, "");
        Intrinsics.checkNotNullParameter(aFa1kSDK, "");
        Intrinsics.checkNotNullParameter(uri, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(aFe1mSDK, "");
        this.AFKeystoreWrapper = aFa1qSDK;
        this.AFLogger = aFa1kSDK;
        this.unregisterClient = uri;
        this.d = list;
        this.registerClient = aFe1mSDK;
    }
}
