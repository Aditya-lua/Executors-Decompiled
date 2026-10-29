package com.roblox.client.scheduledwork;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.SystemClock;
import android.util.Log;
import androidx.core.os.EnvironmentCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.work.AbstractC1117c;
import androidx.work.C1116b;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.roblox.client.datastructures.NameValuePair;
import com.roblox.client.flags.C3188b;
import com.roblox.client.scheduledwork.OtaPollingWorker;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7697o;
import kotlin.collections.C7699p;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7758y;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C7797x;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlin.time.C7800a;
import kotlin.time.C7801b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import p151gk.C6130w;
import p201iu.C6988p;
import p229jt.C7347n;
import p229jt.C7348o;
import p229jt.C7352s;
import p230ju.EnumC7361b;
import p256ku.AbstractC7888l0;
import p256ku.C7864g1;
import p256ku.C7872i;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p477ut.C11957b;
import p477ut.C11958c;
import p477ut.C11969n;
import p536x5.AbstractC12719p0;
import p536x5.C12694d;
import p536x5.C12701g0;
import p536x5.C12738z;
import p536x5.EnumC12688a;
import p536x5.EnumC12704i;
import p536x5.EnumC12706j;
import p536x5.EnumC12734x;
import pt.AbstractC10342d;
import pt.AbstractC10351m;
import pt.C10340b;
import pt.C10350l;
import pt.InterfaceC10344f;
import sg.C11295a1;
import th.C11659h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 22\u00020\u0001:\u000202B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nJ*\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u000bH\u0082@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u0018\u001a\u00020\u000bH\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b$\u0010%J'\u0010*\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\u000b2\u000e\b\u0002\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'H\u0002¢\u0006\u0004\b*\u0010+J\u0019\u0010-\u001a\u00020\u000b2\b\u0010,\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020#H\u0002¢\u0006\u0004\b/\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00063"}, m31665d2 = {"Lcom/roblox/client/scheduledwork/OtaPollingWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/c$a;", "doWork", "(Lnt/b;)Ljava/lang/Object;", "", "behaviorName", "configUrl", "Landroid/content/SharedPreferences;", "prefs", "Lcom/roblox/client/scheduledwork/OtaPollingWorker$b;", "r", "(Ljava/lang/String;Ljava/lang/String;Landroid/content/SharedPreferences;Lnt/b;)Ljava/lang/Object;", "", "behaviorNames", "", "s", "(Landroid/content/SharedPreferences;Ljava/util/Set;)V", "url", "Ljava/io/File;", "dest", "j", "(Ljava/lang/String;Ljava/io/File;Lnt/b;)Ljava/lang/Object;", "Lorg/json/JSONArray;", "l", "(Ljava/lang/String;Lnt/b;)Ljava/lang/Object;", "Ljava/net/HttpURLConnection;", "q", "(Ljava/lang/String;)Ljava/net/HttpURLConnection;", "", "m", "()Z", "eventName", "", "Lcom/roblox/client/datastructures/NameValuePair;", "extraParams", "o", "(Ljava/lang/String;Ljava/util/List;)V", "message", "k", "(Ljava/lang/String;)Ljava/lang/String;", "n", "a", "Landroid/content/Context;", "b", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class OtaPollingWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c */
    public static final long f12176c;

    /* JADX INFO: renamed from: d */
    public static final long f12177d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: com.roblox.client.scheduledwork.OtaPollingWorker$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\f8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\f8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0012R\u0014\u0010\u001f\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0012R\u0014\u0010 \u001a\u00020\f8\u0000X\u0080T¢\u0006\u0006\n\u0004\b \u0010\u0012R\u0014\u0010!\u001a\u00020\f8\u0000X\u0080T¢\u0006\u0006\n\u0004\b!\u0010\u0012R\u0014\u0010\"\u001a\u00020\f8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\"\u0010\u0012R\u0014\u0010#\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\u0012R\u0014\u0010$\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010\u0012¨\u0006%"}, m31665d2 = {"Lcom/roblox/client/scheduledwork/OtaPollingWorker$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "c", "(Landroid/content/Context;)V", "a", "Lorg/json/JSONObject;", "rawConfig", "", "appVersion", "", "b", "(Lorg/json/JSONObject;Ljava/lang/String;)Z", "WORK_TAG", "Ljava/lang/String;", "TAG", "OTA_WORKER_BLOBS_DIR", "WORKER_BLOB_PREFIX", "Lkotlin/time/a;", "CONNECT_TIMEOUT", "J", "READ_TIMEOUT", "", "MAX_RETRY_ATTEMPTS", "I", "DEFAULT_INACTIVITY_DAYS", "KEY_MAX_RETRY_ATTEMPTS", "KEY_INACTIVITY_DAYS", "KEY_FLAGS_FROM_SCHEDULE", "KEY_DEBUG_MODE", "KEY_MAX_APP_VERSION_CHECK", "PREF_LAST_STARTUP_TIME", "PREF_OTA_POLLING_SCHEDULED", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.roblox.client.scheduledwork.OtaPollingWorker.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final void m15514a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            AbstractC12719p0.INSTANCE.m47401a(context).mo47394a("background_ota_polling");
            SharedPreferences sharedPreferencesM42422U = C11295a1.m42422U(context);
            Intrinsics.checkNotNullExpressionValue(sharedPreferencesM42422U, "getKeyValues(...)");
            SharedPreferences.Editor editorEdit = sharedPreferencesM42422U.edit();
            editorEdit.putBoolean("ota_polling_scheduled", false);
            editorEdit.apply();
        }

        /* JADX INFO: renamed from: b */
        public final boolean m15515b(@NotNull JSONObject rawConfig, @NotNull String appVersion) {
            String str;
            Long lT;
            Intrinsics.checkNotNullParameter(rawConfig, "rawConfig");
            Intrinsics.checkNotNullParameter(appVersion, "appVersion");
            if (!rawConfig.optBoolean("isDevelopmentConfig", false) && (str = (String) CollectionsKt.m31708f0(StringsKt.m32135P0(appVersion, new char[]{'.'}, false, 0, 6, null), 1)) != null && (lT = StringsKt.m32118t(str)) != null) {
                if (lT.longValue() < 0) {
                    lT = null;
                }
                if (lT != null) {
                    long jLongValue = lT.longValue();
                    String strOptString = rawConfig.optString("maxAppVersion", "0");
                    Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
                    Long lT2 = StringsKt.m32118t(strOptString);
                    if (lT2 != null) {
                        Long l10 = lT2.longValue() >= 0 ? lT2 : null;
                        if (l10 != null && l10.longValue() < jLongValue) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: c */
        public final void m15516c(@NotNull Context context) {
            C1116b c1116bM6322a;
            Intrinsics.checkNotNullParameter(context, "context");
            boolean zMo43494M5 = C11659h.m43403a().mo43494M5();
            boolean zMo43427D1 = C11659h.m43403a().mo43427D1();
            if (zMo43494M5) {
                Log.i("OtaPollingWorker", "DEV scheduleOtaPolling: enabled=" + zMo43427D1);
            }
            if (!zMo43427D1) {
                if (Intrinsics.m31980c(C6130w.m27099a(context), "foreground")) {
                    boolean z10 = C11295a1.m42422U(context).getBoolean("ota_polling_scheduled", false);
                    m15514a(context);
                    AbstractC12719p0.INSTANCE.m47401a(context).mo47395b("background_ota_polling_debug_once");
                    if (z10) {
                        OtaConfigHandler.logEvent$NativeShell_googleProdRelease$default(OtaConfigHandler.INSTANCE, "ota_polling_worker_flag_disabled_foreground_cancelled", "background_ota_worker", null, 4, null);
                        return;
                    }
                    return;
                }
                return;
            }
            if (C11659h.m43403a().mo43615d6()) {
                Pair[] pairArr = {C7352s.m30477a("flags_from_schedule", Boolean.TRUE), C7352s.m30477a("debug_mode", Boolean.valueOf(zMo43494M5)), C7352s.m30477a("max_app_version_check", Boolean.valueOf(C11659h.m43403a().mo43652j()))};
                C1116b.a aVar = new C1116b.a();
                for (int i10 = 0; i10 < 3; i10++) {
                    Pair pair = pairArr[i10];
                    aVar.m6323b((String) pair.m31673c(), pair.m31674d());
                }
                c1116bM6322a = aVar.m6322a();
            } else {
                c1116bM6322a = new C1116b.a().m6322a();
            }
            if (zMo43494M5) {
                AbstractC12719p0.INSTANCE.m47401a(context).m47400g("background_ota_polling_debug_once", EnumC12706j.KEEP, new C12738z.a(OtaPollingWorker.class).m47408a("background_ota_polling_debug_once").m47420o(c1116bM6322a).m47419n(30L, TimeUnit.SECONDS).m47416k(new C12694d.a().m47346b(EnumC12734x.CONNECTED).m47345a()).m47409b());
                Log.i("OtaPollingWorker", "DEV scheduleOtaPolling: enqueued one-time debug work (30s delay, KEEP — kill app within 30s to test dead-process wakeup)");
            } else {
                AbstractC12719p0.INSTANCE.m47401a(context).mo47395b("background_ota_polling_debug_once");
            }
            boolean zMo43692o4 = C11659h.m43403a().mo43692o4();
            long jMo43568X4 = C11659h.m43403a().mo43568X4();
            long jMo43601c0 = C11659h.m43403a().mo43601c0();
            int iMo43675m1 = C11659h.m43403a().mo43675m1();
            int iMo43452G5 = C11659h.m43403a().mo43452G5();
            C12694d c12694dM47345a = new C12694d.a().m47346b(zMo43692o4 ? EnumC12734x.UNMETERED : EnumC12734x.CONNECTED).m47347c(true).m47350f(true).m47345a();
            TimeUnit timeUnit = TimeUnit.MINUTES;
            C12701g0 c12701g0M47409b = new C12701g0.a(OtaPollingWorker.class, jMo43568X4, timeUnit, jMo43601c0, timeUnit).m47408a("background_ota_polling").m47416k(c12694dM47345a).m47414i(EnumC12688a.EXPONENTIAL, 10L, TimeUnit.SECONDS).m47420o(new C1116b.a().m6324c(c1116bM6322a).m6327f("max_retry_attempts", iMo43675m1).m6327f("inactivity_days", iMo43452G5).m6322a()).m47409b();
            SharedPreferences sharedPreferencesM42422U = C11295a1.m42422U(context);
            Intrinsics.checkNotNullExpressionValue(sharedPreferencesM42422U, "getKeyValues(...)");
            SharedPreferences.Editor editorEdit = sharedPreferencesM42422U.edit();
            editorEdit.putLong("last_startup_time", System.currentTimeMillis());
            editorEdit.putBoolean("ota_polling_scheduled", true);
            editorEdit.apply();
            AbstractC12719p0.INSTANCE.m47401a(context).mo47398e("background_ota_polling", EnumC12704i.UPDATE, c12701g0M47409b);
            if (zMo43494M5) {
                Log.i("OtaPollingWorker", "DEV scheduleOtaPolling: enqueued periodic work tag=background_ota_polling intervalMin=" + jMo43568X4 + " flexMin=" + jMo43601c0);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.scheduledwork.OtaPollingWorker$b, reason: from toString */
    @Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, m31665d2 = {"Lcom/roblox/client/scheduledwork/OtaPollingWorker$b;", "", "", "assetId", "assetVersion", "<init>", "(JJ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "()J", "b", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class PollResult {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        public final long assetId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public final long assetVersion;

        public PollResult(long j10, long j11) {
            this.assetId = j10;
            this.assetVersion = j11;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getAssetId() {
            return this.assetId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getAssetVersion() {
            return this.assetVersion;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PollResult)) {
                return false;
            }
            PollResult pollResult = (PollResult) other;
            return this.assetId == pollResult.assetId && this.assetVersion == pollResult.assetVersion;
        }

        public int hashCode() {
            return (Long.hashCode(this.assetId) * 31) + Long.hashCode(this.assetVersion);
        }

        @NotNull
        public String toString() {
            return "PollResult(assetId=" + this.assetId + ", assetVersion=" + this.assetVersion + ")";
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.scheduledwork.OtaPollingWorker$c */
    @InterfaceC10344f(m39663c = "com.roblox.client.scheduledwork.OtaPollingWorker", m39664f = "OtaPollingWorker.kt", m39665l = {284}, m39666m = "doWork", m39667v = 1)
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C3253c extends AbstractC10342d {

        /* JADX INFO: renamed from: A */
        public long f12181A;

        /* JADX INFO: renamed from: B */
        public /* synthetic */ Object f12182B;

        /* JADX INFO: renamed from: D */
        public int f12184D;

        /* JADX INFO: renamed from: t */
        public boolean f12185t;

        /* JADX INFO: renamed from: u */
        public boolean f12186u;

        /* JADX INFO: renamed from: v */
        public Object f12187v;

        /* JADX INFO: renamed from: w */
        public Object f12188w;

        /* JADX INFO: renamed from: x */
        public Object f12189x;

        /* JADX INFO: renamed from: y */
        public Object f12190y;

        /* JADX INFO: renamed from: z */
        public int f12191z;

        public C3253c(InterfaceC9557b<? super C3253c> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f12182B = obj;
            this.f12184D |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return OtaPollingWorker.this.doWork(this);
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.scheduledwork.OtaPollingWorker$d */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.scheduledwork.OtaPollingWorker$doWork$2", m39664f = "OtaPollingWorker.kt", m39665l = {295}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class C3254d extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: A */
        public final /* synthetic */ C7758y f12192A;

        /* JADX INFO: renamed from: t */
        public Object f12193t;

        /* JADX INFO: renamed from: u */
        public Object f12194u;

        /* JADX INFO: renamed from: v */
        public Object f12195v;

        /* JADX INFO: renamed from: w */
        public int f12196w;

        /* JADX INFO: renamed from: y */
        public final /* synthetic */ SharedPreferences f12198y;

        /* JADX INFO: renamed from: z */
        public final /* synthetic */ Set<String> f12199z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3254d(SharedPreferences sharedPreferences, Set<String> set, C7758y c7758y, InterfaceC9557b<? super C3254d> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f12198y = sharedPreferences;
            this.f12199z = set;
            this.f12192A = c7758y;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return OtaPollingWorker.this.new C3254d(this.f12198y, this.f12199z, this.f12192A, interfaceC9557b);
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0043  */
        /* JADX WARN: Code duplicated, block: B:17:0x0054 A[LOOP:0: B:13:0x003d->B:17:0x0054, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:20:0x0084 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:30:0x006e A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0082 -> B:21:0x0085). Please report as a decompilation issue!!! */
        /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
            java.lang.StackOverflowError
            	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
            	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
            */
        @Override // pt.AbstractC10339a
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = p344ot.C10047c.m38805e()
                int r1 = r14.f12196w
                java.lang.String r2 = "behavior_name"
                java.lang.String r3 = "OtaPollingWorker"
                r4 = 1
                if (r1 == 0) goto L2a
                if (r1 != r4) goto L22
                java.lang.Object r1 = r14.f12195v
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r14.f12194u
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r5 = r14.f12193t
                java.util.Iterator r5 = (java.util.Iterator) r5
                p229jt.C7348o.m30470b(r15)     // Catch: java.io.IOException -> L1f
                goto L85
            L1f:
                r15 = move-exception
                goto Lbc
            L22:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L2a:
                p229jt.C7348o.m30470b(r15)
                com.roblox.client.scheduledwork.OtaPollingWorker r15 = com.roblox.client.scheduledwork.OtaPollingWorker.this
                android.content.SharedPreferences r1 = r14.f12198y
                java.util.Set<java.lang.String> r5 = r14.f12199z
                com.roblox.client.scheduledwork.OtaPollingWorker.m15498i(r15, r1, r5)
                java.util.Set<java.lang.String> r15 = r14.f12199z
                java.util.Iterator r15 = r15.iterator()
                r5 = r15
            L3d:
                boolean r15 = r5.hasNext()
                if (r15 == 0) goto L12b
                java.lang.Object r15 = r5.next()
                r1 = r15
                java.lang.String r1 = (java.lang.String) r1
                com.roblox.client.scheduledwork.OtaConfigHandler r15 = com.roblox.client.scheduledwork.OtaConfigHandler.INSTANCE
                android.content.SharedPreferences r6 = r14.f12198y
                java.lang.String r15 = r15.getConfigUrl(r6, r1)
                if (r15 != 0) goto L6e
                java.lang.StringBuilder r15 = new java.lang.StringBuilder
                r15.<init>()
                java.lang.String r6 = "OtaPollingWorker: no config URL for "
                r15.append(r6)
                r15.append(r1)
                java.lang.String r1 = ", skipping"
                r15.append(r1)
                java.lang.String r15 = r15.toString()
                android.util.Log.w(r3, r15)
                goto L3d
            L6e:
                com.roblox.client.scheduledwork.OtaPollingWorker r6 = com.roblox.client.scheduledwork.OtaPollingWorker.this     // Catch: java.io.IOException -> L1f
                android.content.SharedPreferences r7 = r14.f12198y     // Catch: java.io.IOException -> L1f
                r14.f12193t = r5     // Catch: java.io.IOException -> L1f
                r14.f12194u = r1     // Catch: java.io.IOException -> L1f
                java.lang.Object r8 = pt.C10350l.m39676a(r15)     // Catch: java.io.IOException -> L1f
                r14.f12195v = r8     // Catch: java.io.IOException -> L1f
                r14.f12196w = r4     // Catch: java.io.IOException -> L1f
                java.lang.Object r15 = com.roblox.client.scheduledwork.OtaPollingWorker.m15497h(r6, r1, r15, r7, r14)     // Catch: java.io.IOException -> L1f
                if (r15 != r0) goto L85
                return r0
            L85:
                com.roblox.client.scheduledwork.OtaPollingWorker$b r15 = (com.roblox.client.scheduledwork.OtaPollingWorker.PollResult) r15     // Catch: java.io.IOException -> L1f
                if (r15 == 0) goto L3d
                com.roblox.client.scheduledwork.OtaPollingWorker r6 = com.roblox.client.scheduledwork.OtaPollingWorker.this     // Catch: java.io.IOException -> L1f
                java.lang.String r7 = "ota_polling_worker_patch_downloaded"
                com.roblox.client.datastructures.NameValuePair r8 = new com.roblox.client.datastructures.NameValuePair     // Catch: java.io.IOException -> L1f
                r8.<init>(r2, r1)     // Catch: java.io.IOException -> L1f
                com.roblox.client.datastructures.NameValuePair r9 = new com.roblox.client.datastructures.NameValuePair     // Catch: java.io.IOException -> L1f
                java.lang.String r10 = "asset_id"
                long r11 = r15.getAssetId()     // Catch: java.io.IOException -> L1f
                java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch: java.io.IOException -> L1f
                r9.<init>(r10, r11)     // Catch: java.io.IOException -> L1f
                com.roblox.client.datastructures.NameValuePair r10 = new com.roblox.client.datastructures.NameValuePair     // Catch: java.io.IOException -> L1f
                java.lang.String r11 = "asset_version"
                long r12 = r15.getAssetVersion()     // Catch: java.io.IOException -> L1f
                java.lang.String r15 = java.lang.String.valueOf(r12)     // Catch: java.io.IOException -> L1f
                r10.<init>(r11, r15)     // Catch: java.io.IOException -> L1f
                com.roblox.client.datastructures.NameValuePair[] r15 = new com.roblox.client.datastructures.NameValuePair[]{r8, r9, r10}     // Catch: java.io.IOException -> L1f
                java.util.List r15 = kotlin.collections.C7699p.m31895n(r15)     // Catch: java.io.IOException -> L1f
                com.roblox.client.scheduledwork.OtaPollingWorker.m15496g(r6, r7, r15)     // Catch: java.io.IOException -> L1f
                goto L3d
            Lbc:
                java.lang.Class r6 = r15.getClass()
                java.lang.String r6 = r6.getSimpleName()
                java.lang.String r7 = r15.getMessage()
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r9 = "OtaPollingWorker: IO error for "
                r8.append(r9)
                r8.append(r1)
                java.lang.String r9 = " ("
                r8.append(r9)
                r8.append(r6)
                java.lang.String r6 = ": "
                r8.append(r6)
                r8.append(r7)
                java.lang.String r6 = "), will retry"
                r8.append(r6)
                java.lang.String r6 = r8.toString()
                android.util.Log.e(r3, r6, r15)
                com.roblox.client.scheduledwork.OtaPollingWorker r6 = com.roblox.client.scheduledwork.OtaPollingWorker.this
                java.lang.String r7 = r15.getMessage()
                java.lang.String r6 = com.roblox.client.scheduledwork.OtaPollingWorker.m15495f(r6, r7)
                com.roblox.client.scheduledwork.OtaPollingWorker r7 = com.roblox.client.scheduledwork.OtaPollingWorker.this
                com.roblox.client.datastructures.NameValuePair r8 = new com.roblox.client.datastructures.NameValuePair
                java.lang.Class r15 = r15.getClass()
                java.lang.String r15 = r15.getSimpleName()
                java.lang.String r9 = "error_type"
                r8.<init>(r9, r15)
                com.roblox.client.datastructures.NameValuePair r15 = new com.roblox.client.datastructures.NameValuePair
                r15.<init>(r2, r1)
                com.roblox.client.datastructures.NameValuePair r1 = new com.roblox.client.datastructures.NameValuePair
                java.lang.String r9 = "failed_host"
                r1.<init>(r9, r6)
                com.roblox.client.datastructures.NameValuePair[] r15 = new com.roblox.client.datastructures.NameValuePair[]{r8, r15, r1}
                java.util.List r15 = kotlin.collections.C7699p.m31895n(r15)
                java.lang.String r1 = "ota_polling_worker_error"
                com.roblox.client.scheduledwork.OtaPollingWorker.m15496g(r7, r1, r15)
                kotlin.jvm.internal.y r15 = r14.f12192A
                r15.f29445a = r4
                goto L3d
            L12b:
                kotlin.Unit r15 = kotlin.Unit.f29331a
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.roblox.client.scheduledwork.OtaPollingWorker.C3254d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((C3254d) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.scheduledwork.OtaPollingWorker$e */
    @InterfaceC10344f(m39663c = "com.roblox.client.scheduledwork.OtaPollingWorker", m39664f = "OtaPollingWorker.kt", m39665l = {375, 448}, m39666m = "pollBehavior", m39667v = 1)
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C3255e extends AbstractC10342d {

        /* JADX INFO: renamed from: A */
        public Object f12200A;

        /* JADX INFO: renamed from: B */
        public Object f12201B;

        /* JADX INFO: renamed from: C */
        public Object f12202C;

        /* JADX INFO: renamed from: D */
        public Object f12203D;

        /* JADX INFO: renamed from: E */
        public Object f12204E;

        /* JADX INFO: renamed from: F */
        public Object f12205F;

        /* JADX INFO: renamed from: G */
        public Object f12206G;

        /* JADX INFO: renamed from: H */
        public long f12207H;

        /* JADX INFO: renamed from: I */
        public long f12208I;

        /* JADX INFO: renamed from: J */
        public boolean f12209J;

        /* JADX INFO: renamed from: K */
        public boolean f12210K;

        /* JADX INFO: renamed from: L */
        public /* synthetic */ Object f12211L;

        /* JADX INFO: renamed from: N */
        public int f12213N;

        /* JADX INFO: renamed from: t */
        public Object f12214t;

        /* JADX INFO: renamed from: u */
        public Object f12215u;

        /* JADX INFO: renamed from: v */
        public Object f12216v;

        /* JADX INFO: renamed from: w */
        public Object f12217w;

        /* JADX INFO: renamed from: x */
        public Object f12218x;

        /* JADX INFO: renamed from: y */
        public Object f12219y;

        /* JADX INFO: renamed from: z */
        public Object f12220z;

        public C3255e(InterfaceC9557b<? super C3255e> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f12211L = obj;
            this.f12213N |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return OtaPollingWorker.this.m15512r(null, null, null, this);
        }
    }

    static {
        C7800a.Companion companion = C7800a.INSTANCE;
        EnumC7361b enumC7361b = EnumC7361b.SECONDS;
        f12176c = C7801b.m32371p(10, enumC7361b);
        f12177d = C7801b.m32371p(30, enumC7361b);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OtaPollingWorker(@NotNull Context context, @NotNull WorkerParameters params) {
        super(context, params);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(params, "params");
        this.context = context;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.roblox.client.scheduledwork.OtaPollingWorker */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m15499p(OtaPollingWorker otaPollingWorker, String str, List list, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            list = C7699p.m31892k();
        }
        otaPollingWorker.m15510o(str, list);
    }

    /* JADX INFO: renamed from: t */
    public static final String m15500t(SharedPreferences sharedPreferences, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return sharedPreferences.getString(OtaConfigHandler.KEY_WORKER_PENDING_PREFIX + it, null);
    }

    /* JADX INFO: renamed from: u */
    public static final List m15501u(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return CollectionsKt.m31682H0(StringsKt.split$default(it, new String[]{":"}, false, 3, 2, null), 2);
    }

    /* JADX INFO: renamed from: v */
    public static final boolean m15502v(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.size() == 2;
    }

    /* JADX INFO: renamed from: w */
    public static final String m15503w(List list) {
        Intrinsics.checkNotNullParameter(list, "<destruct>");
        return "WorkerBlob_" + ((String) list.get(0)) + "_" + ((String) list.get(1));
    }

    /* JADX INFO: renamed from: x */
    public static final void m15504x(@NotNull Context context) {
        INSTANCE.m15516c(context);
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0253  */
    /* JADX WARN: Code duplicated, block: B:62:0x025b  */
    /* JADX WARN: Code duplicated, block: B:70:0x0274 A[Catch: all -> 0x02d4, TRY_LEAVE, TryCatch #1 {all -> 0x02d4, blocks: (B:68:0x0270, B:70:0x0274, B:75:0x02d6), top: B:78:0x0270 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x02d6 A[Catch: all -> 0x02d4, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x02d4, blocks: (B:68:0x0270, B:70:0x0274, B:75:0x02d6), top: B:78:0x0270 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    @Override // androidx.work.CoroutineWorker
    @Nullable
    public Object doWork(@NotNull InterfaceC9557b<? super AbstractC1117c.a> interfaceC9557b) throws Throwable {
        C3253c c3253c;
        C7758y c7758y;
        String str;
        String str2;
        long j10;
        String str3;
        String str4;
        long j11;
        if (interfaceC9557b instanceof C3253c) {
            c3253c = (C3253c) interfaceC9557b;
            int i10 = c3253c.f12184D;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                c3253c.f12184D = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                c3253c = new C3253c(interfaceC9557b);
            }
        } else {
            c3253c = new C3253c(interfaceC9557b);
        }
        C3253c c3253c2 = c3253c;
        Object obj = c3253c2.f12182B;
        Object objM38805e = C10047c.m38805e();
        int i11 = c3253c2.f12184D;
        if (i11 == 0) {
            C7348o.m30470b(obj);
            if (!m15508m() && !C11659h.m43403a().mo43427D1()) {
                m15499p(this, "ota_polling_worker_flag_disabled_cancelled", null, 2, null);
                INSTANCE.m15514a(this.context);
                AbstractC1117c.a aVarM6342d = AbstractC1117c.a.m6342d();
                Intrinsics.checkNotNullExpressionValue(aVarM6342d, "success(...)");
                return aVarM6342d;
            }
            boolean zContains = getTags().contains("background_ota_polling_debug_once");
            String strM27099a = C6130w.m27099a(this.context);
            Log.i("OtaPollingWorker", "OtaPollingWorker started: clientState=" + strM27099a + " isDebugOnce=" + zContains);
            if (!zContains && Intrinsics.m31980c(strM27099a, "foreground")) {
                Log.i("OtaPollingWorker", "OtaPollingWorker: app in foreground, skipping (in-process timer active)");
                m15499p(this, "ota_polling_worker_skipped_foreground", null, 2, null);
                AbstractC1117c.a aVarM6342d2 = AbstractC1117c.a.m6342d();
                Intrinsics.checkNotNullExpressionValue(aVarM6342d2, "success(...)");
                return aVarM6342d2;
            }
            if (!m15509n()) {
                Log.i("OtaPollingWorker", "OtaPollingWorker: app inactive beyond threshold, cancelling work");
                m15499p(this, "ota_polling_worker_inactivity_cancelled", null, 2, null);
                INSTANCE.m15514a(this.context);
                AbstractC12719p0.INSTANCE.m47401a(this.context).mo47395b("background_ota_polling_debug_once");
                AbstractC1117c.a aVarM6342d3 = AbstractC1117c.a.m6342d();
                Intrinsics.checkNotNullExpressionValue(aVarM6342d3, "success(...)");
                return aVarM6342d3;
            }
            int iM6315d = getInputData().m6315d("max_retry_attempts", 3);
            if (getRunAttemptCount() > iM6315d) {
                Log.w("OtaPollingWorker", "OtaPollingWorker: exceeded " + iM6315d + " consecutive retries (attempt " + getRunAttemptCount() + "), giving up for this period");
                m15499p(this, "ota_polling_worker_retry_exhausted", null, 2, null);
                AbstractC1117c.a aVarM6339a = AbstractC1117c.a.m6339a();
                Intrinsics.checkNotNullExpressionValue(aVarM6339a, "failure(...)");
                return aVarM6339a;
            }
            boolean zM15148g = C3188b.f11801a.m15148g();
            m15510o("ota_polling_worker_start", C7699p.m31895n(new NameValuePair("native_lib_loaded", String.valueOf(zM15148g)), new NameValuePair("run_attempt_count", String.valueOf(getRunAttemptCount()))));
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            c7758y = new C7758y();
            try {
                SharedPreferences otaPrefs = OtaConfigHandler.getOtaPrefs(this.context);
                Set<String> activeBehaviorNames = OtaConfigHandler.getActiveBehaviorNames(otaPrefs);
                if (activeBehaviorNames.isEmpty()) {
                    Log.i("OtaPollingWorker", "OtaPollingWorker: no behaviors registered yet, nothing to poll");
                    AbstractC1117c.a aVarM6342d4 = AbstractC1117c.a.m6342d();
                    Intrinsics.checkNotNullExpressionValue(aVarM6342d4, "success(...)");
                    m15510o("ota_polling_worker_end", C7699p.m31895n(new NameValuePair("duration_ms", String.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime)), new NameValuePair("run_attempt_count", String.valueOf(getRunAttemptCount()))));
                    return aVarM6342d4;
                }
                AbstractC7888l0 abstractC7888l0M32644b = C7864g1.m32644b();
                str3 = "ota_polling_worker_end";
                str4 = "run_attempt_count";
                j10 = jElapsedRealtime;
                try {
                    C3254d c3254d = new C3254d(otaPrefs, activeBehaviorNames, c7758y, null);
                    c3253c2.f12187v = C10350l.m39676a(strM27099a);
                    c3253c2.f12188w = c7758y;
                    c3253c2.f12189x = C10350l.m39676a(otaPrefs);
                    c3253c2.f12190y = C10350l.m39676a(activeBehaviorNames);
                    c3253c2.f12185t = zContains;
                    c3253c2.f12191z = iM6315d;
                    c3253c2.f12186u = zM15148g;
                    c3253c2.f12181A = j10;
                    c3253c2.f12184D = 1;
                    if (C7872i.m32684g(abstractC7888l0M32644b, c3254d, c3253c2) == objM38805e) {
                        return objM38805e;
                    }
                    j11 = j10;
                    m15510o(str3, C7699p.m31895n(new NameValuePair("duration_ms", String.valueOf(SystemClock.elapsedRealtime() - j11)), new NameValuePair(str4, String.valueOf(getRunAttemptCount()))));
                    if (c7758y.f29445a) {
                        AbstractC1117c.a aVarM6341c = AbstractC1117c.a.m6341c();
                        Intrinsics.checkNotNullExpressionValue(aVarM6341c, "retry(...)");
                        return aVarM6341c;
                    }
                    AbstractC1117c.a aVarM6342d5 = AbstractC1117c.a.m6342d();
                    Intrinsics.checkNotNullExpressionValue(aVarM6342d5, "success(...)");
                    return aVarM6342d5;
                } catch (Exception e10) {
                    e = e10;
                    str = str3;
                    str2 = str4;
                    if (!(e instanceof CancellationException)) {
                        throw e;
                    }
                    Log.e("OtaPollingWorker", "OtaPollingWorker: fatal error", e);
                    m15510o("ota_polling_worker_error", C7699p.m31895n(new NameValuePair("error_type", e.getClass().getSimpleName()), new NameValuePair("failed_host", m15506k(e.getMessage()))));
                    AbstractC1117c.a aVarM6341c2 = AbstractC1117c.a.m6341c();
                    Intrinsics.checkNotNullExpressionValue(aVarM6341c2, "retry(...)");
                    m15510o(str, C7699p.m31895n(new NameValuePair("duration_ms", String.valueOf(SystemClock.elapsedRealtime() - j10)), new NameValuePair(str2, String.valueOf(getRunAttemptCount()))));
                    return aVarM6341c2;
                } catch (Throwable th2) {
                    th = th2;
                    str = str3;
                    str2 = str4;
                }
            } catch (Exception e11) {
                e = e11;
                str = "ota_polling_worker_end";
                str2 = "run_attempt_count";
                j10 = jElapsedRealtime;
            } catch (Throwable th3) {
                th = th3;
                str = "ota_polling_worker_end";
                str2 = "run_attempt_count";
                j10 = jElapsedRealtime;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j11 = c3253c2.f12181A;
            c7758y = (C7758y) c3253c2.f12188w;
            try {
                C7348o.m30470b(obj);
                str3 = "ota_polling_worker_end";
                str4 = "run_attempt_count";
                m15510o(str3, C7699p.m31895n(new NameValuePair("duration_ms", String.valueOf(SystemClock.elapsedRealtime() - j11)), new NameValuePair(str4, String.valueOf(getRunAttemptCount()))));
                if (c7758y.f29445a) {
                    AbstractC1117c.a aVarM6341c3 = AbstractC1117c.a.m6341c();
                    Intrinsics.checkNotNullExpressionValue(aVarM6341c3, "retry(...)");
                    return aVarM6341c3;
                }
                AbstractC1117c.a aVarM6342d6 = AbstractC1117c.a.m6342d();
                Intrinsics.checkNotNullExpressionValue(aVarM6342d6, "success(...)");
                return aVarM6342d6;
            } catch (Exception e12) {
                e = e12;
                str2 = "run_attempt_count";
                str = "ota_polling_worker_end";
                j10 = j11;
                try {
                    if (!(e instanceof CancellationException)) {
                        throw e;
                    }
                    Log.e("OtaPollingWorker", "OtaPollingWorker: fatal error", e);
                    m15510o("ota_polling_worker_error", C7699p.m31895n(new NameValuePair("error_type", e.getClass().getSimpleName()), new NameValuePair("failed_host", m15506k(e.getMessage()))));
                    AbstractC1117c.a aVarM6341c4 = AbstractC1117c.a.m6341c();
                    Intrinsics.checkNotNullExpressionValue(aVarM6341c4, "retry(...)");
                    m15510o(str, C7699p.m31895n(new NameValuePair("duration_ms", String.valueOf(SystemClock.elapsedRealtime() - j10)), new NameValuePair(str2, String.valueOf(getRunAttemptCount()))));
                    return aVarM6341c4;
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (Throwable th5) {
                th = th5;
                str2 = "run_attempt_count";
                str = "ota_polling_worker_end";
                j10 = j11;
            }
        }
        m15510o(str, C7699p.m31895n(new NameValuePair("duration_ms", String.valueOf(SystemClock.elapsedRealtime() - j10)), new NameValuePair(str2, String.valueOf(getRunAttemptCount()))));
        throw th;
    }

    /* JADX INFO: renamed from: j */
    public final Object m15505j(String str, File file, InterfaceC9557b<? super Unit> interfaceC9557b) throws Exception {
        File file2 = new File(file.getParent(), file.getName() + ".tmp." + getId());
        try {
            HttpURLConnection httpURLConnectionM15511q = m15511q(str);
            int responseCode = httpURLConnectionM15511q.getResponseCode();
            if (responseCode != 200) {
                throw new IOException("HTTP " + responseCode + " downloading blob " + str);
            }
            Log.i("OtaPollingWorker", "OtaPollingWorker: blob HTTP " + responseCode + " contentLength=" + httpURLConnectionM15511q.getContentLengthLong() + " dest=" + file.getName());
            InputStream inputStream = httpURLConnectionM15511q.getInputStream();
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    Intrinsics.checkNotNull(inputStream);
                    C11957b.m44627b(inputStream, fileOutputStream, 0, 2, null);
                    C11958c.m44629a(fileOutputStream, null);
                    C11958c.m44629a(inputStream, null);
                    Log.i("OtaPollingWorker", "OtaPollingWorker: blob copy complete size=" + file2.length() + " dest=" + file.getName());
                    if (file2.renameTo(file)) {
                        return Unit.f29331a;
                    }
                    throw new IOException("Failed to rename " + file2 + " to " + file);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        C11958c.m44629a(fileOutputStream, th2);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    C11958c.m44629a(inputStream, th4);
                    throw th5;
                }
            }
        } catch (Exception e10) {
            file2.delete();
            throw e10;
        }
    }

    /* JADX INFO: renamed from: k */
    public final String m15506k(String message) {
        Object objM30460b;
        Object obj = EnvironmentCompat.MEDIA_UNKNOWN;
        if (message == null) {
            return EnvironmentCompat.MEDIA_UNKNOWN;
        }
        try {
            C7347n.Companion companion = C7347n.INSTANCE;
            objM30460b = C7347n.m30460b(new URL(StringsKt.m32163f1(message, " ", null, 2, null)).getHost());
        } catch (Throwable th2) {
            C7347n.Companion companion2 = C7347n.INSTANCE;
            objM30460b = C7347n.m30460b(C7348o.m30469a(th2));
        }
        if (!C7347n.m30465g(objM30460b)) {
            obj = objM30460b;
        }
        return (String) obj;
    }

    /* JADX INFO: renamed from: l */
    public final Object m15507l(String str, InterfaceC9557b<? super JSONArray> interfaceC9557b) throws IOException {
        HttpURLConnection httpURLConnectionM15511q = m15511q(str);
        int responseCode = httpURLConnectionM15511q.getResponseCode();
        if (responseCode != 200) {
            throw new IOException("HTTP " + responseCode + " fetching " + str);
        }
        InputStream inputStream = httpURLConnectionM15511q.getInputStream();
        Intrinsics.checkNotNullExpressionValue(inputStream, "getInputStream(...)");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, Charsets.UTF_8), 8192);
        try {
            String strM44671h = C11969n.m44671h(bufferedReader);
            C11958c.m44629a(bufferedReader, null);
            return new JSONArray(strM44671h);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                C11958c.m44629a(bufferedReader, th2);
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final boolean m15508m() {
        return getInputData().m6314c("flags_from_schedule", false);
    }

    /* JADX INFO: renamed from: n */
    public final boolean m15509n() {
        SharedPreferences sharedPreferencesM42422U = C11295a1.m42422U(this.context);
        C7800a.Companion companion = C7800a.INSTANCE;
        long j10 = sharedPreferencesM42422U.getLong("last_startup_time", 0L);
        EnumC7361b enumC7361b = EnumC7361b.MILLISECONDS;
        return C7800a.m32339j(C7800a.m32326L(C7801b.m32372q(System.currentTimeMillis(), enumC7361b), C7801b.m32372q(j10, enumC7361b)), C7801b.m32372q((long) getInputData().m6315d("inactivity_days", 3), EnumC7361b.DAYS)) <= 0;
    }

    /* JADX INFO: renamed from: o */
    public final void m15510o(String eventName, List<? extends NameValuePair> extraParams) {
        OtaConfigHandler.INSTANCE.logEvent$NativeShell_googleProdRelease(eventName, "background_ota_worker", extraParams);
    }

    /* JADX INFO: renamed from: q */
    public final HttpURLConnection m15511q(String url) throws IOException {
        URLConnection uRLConnectionOpenConnection = new URL(url).openConnection();
        Intrinsics.m31981d(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        httpURLConnection.setConnectTimeout((int) C7800a.m32348w(f12176c));
        httpURLConnection.setReadTimeout((int) C7800a.m32348w(f12177d));
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return httpURLConnection;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Instruction removed from duplicated block: B:104:0x04ac, please report this as an issue */
    /* JADX INFO: renamed from: r */
    public final Object m15512r(String str, String str2, SharedPreferences sharedPreferences, InterfaceC9557b<? super PollResult> interfaceC9557b) throws IOException {
        C3255e c3255e;
        Object obj;
        String patchStorageKey;
        String perUserPatchKey;
        String str3;
        Object obj2;
        String str4;
        String str5;
        long jOptLong;
        String str6;
        long jOptLong2;
        File file;
        Object objM30460b;
        boolean zBooleanValue;
        String str7;
        String host;
        String str8;
        String string;
        long j10;
        long j11;
        String str9;
        JSONObject jSONObject;
        SharedPreferences sharedPreferences2;
        SharedPreferences sharedPreferences3;
        SharedPreferences sharedPreferences4 = sharedPreferences;
        if (interfaceC9557b instanceof C3255e) {
            c3255e = (C3255e) interfaceC9557b;
            int i10 = c3255e.f12213N;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                c3255e.f12213N = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                c3255e = new C3255e(interfaceC9557b);
            }
        } else {
            c3255e = new C3255e(interfaceC9557b);
        }
        Object obj3 = c3255e.f12211L;
        Object objM38805e = C10047c.m38805e();
        int i11 = c3255e.f12213N;
        String str10 = " assetId=";
        String str11 = ":";
        if (i11 == 0) {
            obj = null;
            C7348o.m30470b(obj3);
            Log.d("OtaPollingWorker", "OtaPollingWorker: polling " + str + " from " + str2);
            OtaConfigHandler otaConfigHandler = OtaConfigHandler.INSTANCE;
            patchStorageKey = otaConfigHandler.getPatchStorageKey(sharedPreferences4, str);
            if (patchStorageKey == null) {
                Log.w("OtaPollingWorker", "OtaPollingWorker: no patchStorageKey for " + str + " yet, skipping");
                return null;
            }
            String baseUrl = otaConfigHandler.getBaseUrl(sharedPreferences4);
            if (baseUrl == null) {
                Log.w("OtaPollingWorker", "OtaPollingWorker: no base URL for blob download yet, skipping");
                return null;
            }
            perUserPatchKey = otaConfigHandler.getPerUserPatchKey(sharedPreferences4, str);
            if (perUserPatchKey == null) {
                Log.w("OtaPollingWorker", "OtaPollingWorker: no perUserPatchKey for " + str + " yet, skipping");
                return null;
            }
            c3255e.f12214t = str;
            c3255e.f12215u = C10350l.m39676a(str2);
            c3255e.f12216v = sharedPreferences4;
            c3255e.f12217w = patchStorageKey;
            c3255e.f12218x = baseUrl;
            c3255e.f12219y = perUserPatchKey;
            c3255e.f12213N = 1;
            Object objM15507l = m15507l(str2, c3255e);
            if (objM15507l == objM38805e) {
                return objM38805e;
            }
            str3 = str;
            obj2 = objM15507l;
            str4 = str2;
            str5 = baseUrl;
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                boolean z10 = c3255e.f12210K;
                j11 = c3255e.f12208I;
                j10 = c3255e.f12207H;
                file = (File) c3255e.f12203D;
                jSONObject = (JSONObject) c3255e.f12200A;
                sharedPreferences2 = (SharedPreferences) c3255e.f12216v;
                str9 = (String) c3255e.f12214t;
                try {
                    C7348o.m30470b(obj3);
                    zBooleanValue = z10;
                    jOptLong2 = j11;
                    sharedPreferences3 = sharedPreferences2;
                    str3 = str9;
                    jOptLong = j10;
                    SharedPreferences.Editor editorEdit = sharedPreferences3.edit();
                    editorEdit.putString(OtaConfigHandler.KEY_WORKER_PENDING_PREFIX + str3, jOptLong + str11 + jOptLong2);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(OtaConfigHandler.KEY_CONFIG_JSON_PREFIX);
                    sb2.append(str3);
                    editorEdit.putString(sb2.toString(), OtaConfigHandler.INSTANCE.buildStorageConfig(jSONObject).toString());
                    editorEdit.apply();
                    if (zBooleanValue) {
                        Log.w("OtaPollingWorker", "DEV: pending marker written for " + str3 + "=" + jOptLong + str11 + jOptLong2);
                    }
                    Log.i("OtaPollingWorker", "OtaPollingWorker: blob downloaded for " + str3 + " at " + file.getAbsolutePath());
                    return new PollResult(jOptLong, jOptLong2);
                } catch (IOException e10) {
                    e = e10;
                    str6 = ")";
                    str7 = " assetVersion=";
                    Log.e("OtaPollingWorker", "OtaPollingWorker: download failed for " + str9 + str10 + j10 + str7 + j11 + " (" + e.getClass().getSimpleName() + ": " + e.getMessage() + str6);
                    throw e;
                }
            }
            String str12 = (String) c3255e.f12219y;
            str5 = (String) c3255e.f12218x;
            String str13 = (String) c3255e.f12217w;
            SharedPreferences sharedPreferences5 = (SharedPreferences) c3255e.f12216v;
            str4 = (String) c3255e.f12215u;
            obj = null;
            str3 = (String) c3255e.f12214t;
            C7348o.m30470b(obj3);
            perUserPatchKey = str12;
            obj2 = obj3;
            patchStorageKey = str13;
            sharedPreferences4 = sharedPreferences5;
        }
        JSONArray jSONArray = (JSONArray) obj2;
        if (jSONArray.length() == 0) {
            Log.w("OtaPollingWorker", "OtaPollingWorker: empty config array for " + str3);
            return obj;
        }
        String str14 = str5;
        String str15 = str4;
        JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(0);
        if (jSONObjectOptJSONObject == null) {
            return obj;
        }
        SharedPreferences sharedPreferences6 = sharedPreferences4;
        C3255e c3255e2 = c3255e;
        jOptLong = jSONObjectOptJSONObject.optLong("assetId", 0L);
        str6 = ")";
        jOptLong2 = jSONObjectOptJSONObject.optLong("assetVersion", 0L);
        if (jOptLong == 0 || jOptLong2 == 0) {
            Log.w("OtaPollingWorker", "OtaPollingWorker: invalid patch config for " + str3 + " (assetId=" + jOptLong + ", assetVersion=" + jOptLong2 + str6);
            return obj;
        }
        String strM42445d1 = C11295a1.m42445d1();
        boolean zM6314c = m15508m() ? getInputData().m6314c("max_app_version_check", false) : C11659h.m43403a().mo43652j();
        if (zM6314c) {
            Companion companion = INSTANCE;
            Intrinsics.checkNotNull(strM42445d1);
            if (companion.m15515b(jSONObjectOptJSONObject, strM42445d1)) {
                String strOptString = jSONObjectOptJSONObject.optString("maxAppVersion");
                Log.i("OtaPollingWorker", "OtaPollingWorker: " + str3 + " maxAppVersion " + strOptString + " is below app version " + strM42445d1 + ", skipping download");
                m15510o("ota_polling_worker_incompatible_config_skipped", C7699p.m31895n(new NameValuePair("behavior_name", str3), new NameValuePair("asset_id", String.valueOf(jOptLong)), new NameValuePair("asset_version", String.valueOf(jOptLong2)), new NameValuePair("max_app_version", strOptString), new NameValuePair("app_version", strM42445d1)));
                return obj;
            }
        }
        OtaConfigHandler otaConfigHandler2 = OtaConfigHandler.INSTANCE;
        Long pendingWorkerBlobVersion = otaConfigHandler2.getPendingWorkerBlobVersion(sharedPreferences6, str3);
        if (pendingWorkerBlobVersion == null) {
            pendingWorkerBlobVersion = otaConfigHandler2.getCachedAssetVersionFromAppStorage(this.context, patchStorageKey, perUserPatchKey);
        }
        if (pendingWorkerBlobVersion != null && pendingWorkerBlobVersion.longValue() == jOptLong2) {
            Log.i("OtaPollingWorker", "OtaPollingWorker: " + str3 + " already at version " + jOptLong2 + ", skipping download");
            m15510o("ota_polling_worker_no_update", C7699p.m31895n(new NameValuePair("behavior_name", str3), new NameValuePair("asset_version", String.valueOf(jOptLong2))));
            return obj;
        }
        File file2 = new File(this.context.getFilesDir(), "appData/OTAWorkerBlobs");
        file2.mkdirs();
        file = new File(file2, "WorkerBlob_" + jOptLong + "_" + jOptLong2);
        if (m15508m()) {
            zBooleanValue = getInputData().m6314c("debug_mode", false);
        } else {
            try {
                C7347n.Companion companion2 = C7347n.INSTANCE;
                objM30460b = C7347n.m30460b(C10340b.m39658a(C11659h.m43403a().mo43494M5()));
            } catch (Throwable th2) {
                C7347n.Companion companion3 = C7347n.INSTANCE;
                objM30460b = C7347n.m30460b(C7348o.m30469a(th2));
            }
            Boolean boolM39658a = C10340b.m39658a(false);
            if (C7347n.m30465g(objM30460b)) {
                objM30460b = boolM39658a;
            }
            zBooleanValue = ((Boolean) objM30460b).booleanValue();
        }
        if (zBooleanValue) {
            Log.w("OtaPollingWorker", "DEV: blobFile path=" + file.getAbsolutePath() + " perUserPatchKey=" + perUserPatchKey);
        }
        if (file.exists()) {
            C10340b.m39661d(Log.i("OtaPollingWorker", "OtaPollingWorker: blob for " + str3 + " already on disk, updating pending marker"));
            jSONObject = jSONObjectOptJSONObject;
            sharedPreferences3 = sharedPreferences6;
            str11 = ":";
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("OtaPollingWorker: downloading patch for ");
            sb3.append(str3);
            str10 = " assetId=";
            sb3.append(str10);
            sb3.append(jOptLong);
            str7 = " assetVersion=";
            sb3.append(str7);
            sb3.append(jOptLong2);
            Log.i("OtaPollingWorker", sb3.toString());
            Uri uri = Uri.parse(str14);
            String host2 = uri.getHost();
            if (host2 == null || (host = C7797x.m32305P(host2, "www.", "assetdelivery.", false, 4, null)) == null) {
                host = uri.getHost();
            }
            String str16 = perUserPatchKey;
            Uri.Builder builderScheme = new Uri.Builder().scheme(uri.getScheme());
            String str17 = patchStorageKey;
            if (uri.getPort() != -1) {
                int port = uri.getPort();
                StringBuilder sb4 = new StringBuilder();
                sb4.append(host);
                str8 = host;
                str11 = ":";
                sb4.append(str11);
                sb4.append(port);
                string = sb4.toString();
            } else {
                str8 = host;
                str11 = ":";
                string = str8;
            }
            String string2 = builderScheme.encodedAuthority(string).path("/v1/asset/").appendQueryParameter("id", String.valueOf(jOptLong)).appendQueryParameter("version", String.valueOf(jOptLong2)).build().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            try {
                c3255e2.f12214t = str3;
                c3255e2.f12215u = C10350l.m39676a(str15);
                c3255e2.f12216v = sharedPreferences6;
                c3255e2.f12217w = C10350l.m39676a(str17);
                c3255e2.f12218x = C10350l.m39676a(str14);
                c3255e2.f12219y = C10350l.m39676a(str16);
                c3255e2.f12220z = C10350l.m39676a(jSONArray);
                c3255e2.f12200A = jSONObjectOptJSONObject;
                c3255e2.f12201B = C10350l.m39676a(strM42445d1);
                c3255e2.f12202C = C10350l.m39676a(pendingWorkerBlobVersion);
                c3255e2.f12203D = file;
                c3255e2.f12204E = C10350l.m39676a(uri);
                c3255e2.f12205F = C10350l.m39676a(str8);
                c3255e2.f12206G = C10350l.m39676a(string2);
                c3255e2.f12207H = jOptLong;
                c3255e2.f12208I = jOptLong2;
                c3255e2.f12209J = zM6314c;
                c3255e2.f12210K = zBooleanValue;
                c3255e2.f12213N = 2;
                if (m15505j(string2, file, c3255e2) == objM38805e) {
                    return objM38805e;
                }
                jSONObject = jSONObjectOptJSONObject;
                j11 = jOptLong2;
                j10 = jOptLong;
                str9 = str3;
                sharedPreferences2 = sharedPreferences6;
                jOptLong2 = j11;
                sharedPreferences3 = sharedPreferences2;
                str3 = str9;
                jOptLong = j10;
            } catch (IOException e11) {
                e = e11;
                j10 = jOptLong;
                j11 = jOptLong2;
                str9 = str3;
                Log.e("OtaPollingWorker", "OtaPollingWorker: download failed for " + str9 + str10 + j10 + str7 + j11 + " (" + e.getClass().getSimpleName() + ": " + e.getMessage() + str6);
                throw e;
            }
        }
        SharedPreferences.Editor editorEdit2 = sharedPreferences3.edit();
        editorEdit2.putString(OtaConfigHandler.KEY_WORKER_PENDING_PREFIX + str3, jOptLong + str11 + jOptLong2);
        StringBuilder sb5 = new StringBuilder();
        sb5.append(OtaConfigHandler.KEY_CONFIG_JSON_PREFIX);
        sb5.append(str3);
        editorEdit2.putString(sb5.toString(), OtaConfigHandler.INSTANCE.buildStorageConfig(jSONObject).toString());
        editorEdit2.apply();
        if (zBooleanValue) {
            Log.w("OtaPollingWorker", "DEV: pending marker written for " + str3 + "=" + jOptLong + str11 + jOptLong2);
        }
        Log.i("OtaPollingWorker", "OtaPollingWorker: blob downloaded for " + str3 + " at " + file.getAbsolutePath());
        return new PollResult(jOptLong, jOptLong2);
    }

    /* JADX INFO: renamed from: s */
    public final void m15513s(final SharedPreferences prefs, Set<String> behaviorNames) {
        int i10;
        Iterator<String> it = behaviorNames.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            String string = prefs.getString(OtaConfigHandler.KEY_WORKER_PENDING_PREFIX + next, null);
            if (string != null) {
                List listSplit$default = StringsKt.split$default(string, new String[]{":"}, false, 0, 6, null);
                List list = listSplit$default.size() >= 2 ? listSplit$default : null;
                if (list != null) {
                    if (!new File(this.context.getFilesDir(), "appData/OTAWorkerBlobs/WorkerBlob_" + ((String) list.get(0)) + "_" + ((String) list.get(1))).exists()) {
                        Log.i("OtaPollingWorker", "OtaPollingWorker: clearing marker for missing blob " + next + "=" + string);
                        m15510o("ota_polling_worker_orphan_marker_cleared", C7697o.m31878d(new NameValuePair("behavior_name", next)));
                        OtaConfigHandler.INSTANCE.clearPendingWorkerBlob(prefs, next);
                    }
                }
            }
        }
        File file = new File(this.context.getFilesDir(), "appData/OTAWorkerBlobs");
        if (file.exists()) {
            Set setM29383A = C6988p.m29383A(C6988p.m29396x(C6988p.m29388p(C6988p.m29396x(C6988p.m29397y(CollectionsKt.m31696U(behaviorNames), new Function1() { // from class: uj.a
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OtaPollingWorker.m15500t(prefs, (String) obj);
                }
            }), new Function1() { // from class: uj.b
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OtaPollingWorker.m15501u((String) obj);
                }
            }), new Function1() { // from class: uj.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(OtaPollingWorker.m15502v((List) obj));
                }
            }), new Function1() { // from class: uj.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OtaPollingWorker.m15503w((List) obj);
                }
            }));
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null) {
                for (File file2 : fileArrListFiles) {
                    if (!setM29383A.contains(file2.getName())) {
                        Log.i("OtaPollingWorker", "OtaPollingWorker: pruning orphaned blob " + file2.getName());
                        m15510o("ota_polling_worker_orphan_blob_pruned", C7697o.m31878d(new NameValuePair("blob_name", file2.getName())));
                        file2.delete();
                    }
                }
            }
        }
    }
}
