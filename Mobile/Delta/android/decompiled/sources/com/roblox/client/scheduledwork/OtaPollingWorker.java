package com.roblox.client.scheduledwork;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import androidx.work.b;
import androidx.work.c;
import com.roblox.client.datastructures.NameValuePair;
import com.roblox.client.scheduledwork.OtaPollingWorker;
import ek.w;
import gt.n;
import gt.o;
import gt.s;
import iu.g1;
import iu.l0;
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
import kotlin.collections.CollectionsKt;
import kotlin.collections.p;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.y;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import nt.l;
import nt.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import rg.a1;
import rh.h;
import x5.g0;
import x5.i;
import x5.j;
import x5.p0;
import x5.x;
import x5.z;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 22\u00020\u0001:\u000223B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nJ*\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u000bH\u0082@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u0018\u001a\u00020\u000bH\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b$\u0010%J'\u0010*\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\u000b2\u000e\b\u0002\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'H\u0002¢\u0006\u0004\b*\u0010+J\u0019\u0010-\u001a\u00020\u000b2\b\u0010,\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020#H\u0002¢\u0006\u0004\b/\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00064"}, d2 = {"Lcom/roblox/client/scheduledwork/OtaPollingWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/c$a;", "doWork", "(Llt/b;)Ljava/lang/Object;", "", "behaviorName", "configUrl", "Landroid/content/SharedPreferences;", "prefs", "Lcom/roblox/client/scheduledwork/OtaPollingWorker$c;", "v", "(Ljava/lang/String;Ljava/lang/String;Landroid/content/SharedPreferences;Llt/b;)Ljava/lang/Object;", "", "behaviorNames", "", "w", "(Landroid/content/SharedPreferences;Ljava/util/Set;)V", "url", "Ljava/io/File;", "dest", "m", "(Ljava/lang/String;Ljava/io/File;Llt/b;)Ljava/lang/Object;", "Lorg/json/JSONArray;", "o", "(Ljava/lang/String;Llt/b;)Ljava/lang/Object;", "Ljava/net/HttpURLConnection;", "u", "(Ljava/lang/String;)Ljava/net/HttpURLConnection;", "", "p", "()Z", "eventName", "", "Lcom/roblox/client/datastructures/NameValuePair;", "extraParams", "r", "(Ljava/lang/String;Ljava/util/List;)V", "message", "n", "(Ljava/lang/String;)Ljava/lang/String;", "q", "a", "Landroid/content/Context;", "b", "c", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OtaPollingWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f9425c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f9426d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static Function2<? super Network, ? super URL, ? extends URLConnection> f9427e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static Function1<? super Context, ? extends Network> f9428f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static Function0<String> f9429g;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context context;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a extends k implements Function0<String> {
        public a(Object obj) {
            super(0, obj, OtaConfigHandler.class, "getEngineVersion", "getEngineVersion()Ljava/lang/String;", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return ((OtaConfigHandler) this.receiver).getEngineVersion();
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.scheduledwork.OtaPollingWorker$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ!\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\nH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\n8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\n8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010 R\u0014\u0010\"\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\u0016R\u0014\u0010#\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\u0016R\u0014\u0010$\u001a\u00020\n8\u0000X\u0080T¢\u0006\u0006\n\u0004\b$\u0010\u0016R\u0014\u0010%\u001a\u00020\n8\u0000X\u0080T¢\u0006\u0006\n\u0004\b%\u0010\u0016R\u0014\u0010&\u001a\u00020\n8\u0000X\u0080T¢\u0006\u0006\n\u0004\b&\u0010\u0016R\u0014\u0010'\u001a\u00020\n8\u0000X\u0080T¢\u0006\u0006\n\u0004\b'\u0010\u0016R\u0014\u0010(\u001a\u00020\n8\u0000X\u0080T¢\u0006\u0006\n\u0004\b(\u0010\u0016R\u0014\u0010)\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010\u0016R\u0014\u0010*\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010\u0016¨\u0006+"}, d2 = {"Lcom/roblox/client/scheduledwork/OtaPollingWorker$b;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "f", "(Landroid/content/Context;)V", "b", "", "configUrl", "engineVersion", "d", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lorg/json/JSONObject;", "rawConfig", "appVersion", "", "c", "(Lorg/json/JSONObject;Ljava/lang/String;)Z", "WORK_TAG", "Ljava/lang/String;", "TAG", "OTA_WORKER_BLOBS_DIR", "WORKER_BLOB_PREFIX", "Lkotlin/time/a;", "CONNECT_TIMEOUT", "J", "READ_TIMEOUT", "", "MAX_RETRY_ATTEMPTS", "I", "DEFAULT_INACTIVITY_DAYS", "KEY_MAX_RETRY_ATTEMPTS", "KEY_INACTIVITY_DAYS", "KEY_FLAGS_FROM_SCHEDULE", "KEY_DEBUG_MODE", "KEY_MAX_APP_VERSION_CHECK", "KEY_RETARGET_CONFIG_URL", "KEY_BIND_NETWORK", "PREF_LAST_STARTUP_TIME", "PREF_OTA_POLLING_SCHEDULED", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final CharSequence e(String str, String pair) {
            Intrinsics.checkNotNullParameter(pair, "pair");
            if (!Intrinsics.c(Uri.decode(StringsKt.i1(pair, '=', null, 2, null)), "version")) {
                return pair;
            }
            return "version=" + Uri.encode(str);
        }

        public final void b(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            p0.INSTANCE.a(context).a("background_ota_polling");
            SharedPreferences sharedPreferencesU = a1.U(context);
            Intrinsics.checkNotNullExpressionValue(sharedPreferencesU, "getKeyValues(...)");
            SharedPreferences.Editor editorEdit = sharedPreferencesU.edit();
            editorEdit.putBoolean("ota_polling_scheduled", false);
            editorEdit.apply();
        }

        public final boolean c(@NotNull JSONObject rawConfig, @NotNull String appVersion) {
            String str;
            Long lT;
            Intrinsics.checkNotNullParameter(rawConfig, "rawConfig");
            Intrinsics.checkNotNullParameter(appVersion, "appVersion");
            if (!rawConfig.optBoolean("isDevelopmentConfig", false) && (str = (String) CollectionsKt.f0(StringsKt.P0(appVersion, new char[]{'.'}, false, 0, 6, null), 1)) != null && (lT = StringsKt.t(str)) != null) {
                if (lT.longValue() < 0) {
                    lT = null;
                }
                if (lT != null) {
                    long jLongValue = lT.longValue();
                    String strOptString = rawConfig.optString("maxAppVersion", "0");
                    Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
                    Long lT2 = StringsKt.t(strOptString);
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

        @NotNull
        public final String d(@NotNull String configUrl, @Nullable final String engineVersion) {
            Intrinsics.checkNotNullParameter(configUrl, "configUrl");
            Uri uri = Uri.parse(configUrl);
            String queryParameter = uri.getQueryParameter("version");
            if (engineVersion == null || queryParameter == null || Intrinsics.c(queryParameter, engineVersion)) {
                return configUrl;
            }
            String encodedQuery = uri.getEncodedQuery();
            if (encodedQuery == null) {
                encodedQuery = "";
            }
            String string = uri.buildUpon().encodedQuery(CollectionsKt.m0(StringsKt.P0(encodedQuery, new char[]{'&'}, false, 0, 6, null), "&", null, null, 0, null, new Function1() { // from class: sj.g
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OtaPollingWorker.Companion.e(engineVersion, (String) obj);
                }
            }, 30, null)).build().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }

        public final void f(@NotNull Context context) {
            b bVarA;
            Intrinsics.checkNotNullParameter(context, "context");
            boolean zQ5 = h.a().Q5();
            boolean zH1 = h.a().H1();
            if (zQ5) {
                Log.i("OtaPollingWorker", "DEV scheduleOtaPolling: enabled=" + zH1);
            }
            if (!zH1) {
                if (Intrinsics.c(w.a(context), "foreground")) {
                    boolean z10 = a1.U(context).getBoolean("ota_polling_scheduled", false);
                    b(context);
                    p0.INSTANCE.a(context).b("background_ota_polling_debug_once");
                    if (z10) {
                        OtaConfigHandler.logEvent$NativeShell_googleProdRelease$default(OtaConfigHandler.INSTANCE, "ota_polling_worker_flag_disabled_foreground_cancelled", "background_ota_worker", null, 4, null);
                        return;
                    }
                    return;
                }
                return;
            }
            if (h.a().g6()) {
                Pair[] pairArr = {s.a("flags_from_schedule", Boolean.TRUE), s.a("debug_mode", Boolean.valueOf(zQ5)), s.a("max_app_version_check", Boolean.valueOf(h.a().j())), s.a("retarget_config_url", Boolean.valueOf(h.a().B3())), s.a("bind_network", Boolean.valueOf(h.a().f0()))};
                b.a aVar = new b.a();
                for (int i10 = 0; i10 < 5; i10++) {
                    Pair pair = pairArr[i10];
                    aVar.b((String) pair.c(), pair.d());
                }
                bVarA = aVar.a();
            } else {
                bVarA = new b.a().a();
            }
            if (zQ5) {
                p0.INSTANCE.a(context).g("background_ota_polling_debug_once", j.KEEP, new z.a(OtaPollingWorker.class).a("background_ota_polling_debug_once").o(bVarA).n(30L, TimeUnit.SECONDS).k(new x5.d.a().b(x.CONNECTED).a()).b());
                Log.i("OtaPollingWorker", "DEV scheduleOtaPolling: enqueued one-time debug work (30s delay, KEEP — kill app within 30s to test dead-process wakeup)");
            } else {
                p0.INSTANCE.a(context).b("background_ota_polling_debug_once");
            }
            boolean zU4 = h.a().u4();
            long jE5 = h.a().e5();
            long jC0 = h.a().c0();
            int iP1 = h.a().p1();
            int iK5 = h.a().K5();
            x5.d dVarA = new x5.d.a().b(zU4 ? x.UNMETERED : x.CONNECTED).c(true).f(true).a();
            TimeUnit timeUnit = TimeUnit.MINUTES;
            g0 g0VarB = new g0.a(OtaPollingWorker.class, jE5, timeUnit, jC0, timeUnit).a("background_ota_polling").k(dVarA).i(x5.a.EXPONENTIAL, 10L, TimeUnit.SECONDS).o(new b.a().c(bVarA).f("max_retry_attempts", iP1).f("inactivity_days", iK5).a()).b();
            SharedPreferences sharedPreferencesU = a1.U(context);
            Intrinsics.checkNotNullExpressionValue(sharedPreferencesU, "getKeyValues(...)");
            SharedPreferences.Editor editorEdit = sharedPreferencesU.edit();
            editorEdit.putLong("last_startup_time", System.currentTimeMillis());
            editorEdit.putBoolean("ota_polling_scheduled", true);
            editorEdit.apply();
            p0.INSTANCE.a(context).e("background_ota_polling", i.UPDATE, g0VarB);
            if (zQ5) {
                Log.i("OtaPollingWorker", "DEV scheduleOtaPolling: enqueued periodic work tag=background_ota_polling intervalMin=" + jE5 + " flexMin=" + jC0);
            }
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.scheduledwork.OtaPollingWorker$c, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/roblox/client/scheduledwork/OtaPollingWorker$c;", "", "", "assetId", "assetVersion", "<init>", "(JJ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "()J", "b", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PollResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
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

    @nt.f(c = "com.roblox.client.scheduledwork.OtaPollingWorker", f = "OtaPollingWorker.kt", l = {318}, m = "doWork", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class d extends nt.d {
        public long A;
        public /* synthetic */ Object B;
        public int D;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public boolean f9432t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public boolean f9433u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f9434v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f9435w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f9436x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public Object f9437y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f9438z;

        public d(lt.b<? super d> bVar) {
            super(bVar);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.B = obj;
            this.D |= Integer.MIN_VALUE;
            return OtaPollingWorker.this.doWork(this);
        }
    }

    @nt.f(c = "com.roblox.client.scheduledwork.OtaPollingWorker$doWork$2", f = "OtaPollingWorker.kt", l = {329}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class e extends m implements Function2<iu.p0, lt.b<? super Unit>, Object> {
        public final /* synthetic */ y A;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f9439t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f9440u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f9441v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f9442w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ SharedPreferences f9444y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ Set<String> f9445z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(SharedPreferences sharedPreferences, Set<String> set, y yVar, lt.b<? super e> bVar) {
            super(2, bVar);
            this.f9444y = sharedPreferences;
            this.f9445z = set;
            this.A = yVar;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return OtaPollingWorker.this.new e(this.f9444y, this.f9445z, this.A, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(iu.p0 p0Var, lt.b<? super Unit> bVar) {
            return ((e) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0043  */
        /* JADX WARN: Code duplicated, block: B:17:0x0054 A[LOOP:0: B:13:0x003d->B:17:0x0054, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:20:0x0084 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:30:0x006e A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0082 -> B:21:0x0085). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // nt.a
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instruction units count: 302
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.roblox.client.scheduledwork.OtaPollingWorker.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @nt.f(c = "com.roblox.client.scheduledwork.OtaPollingWorker", f = "OtaPollingWorker.kt", l = {419, 492}, m = "pollBehavior", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class f extends nt.d {
        public Object A;
        public Object B;
        public Object C;
        public Object D;
        public Object E;
        public Object F;
        public Object G;
        public Object H;
        public long I;
        public long J;
        public boolean K;
        public boolean L;
        public /* synthetic */ Object M;
        public int O;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f9446t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f9447u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f9448v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f9449w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f9450x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public Object f9451y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public Object f9452z;

        public f(lt.b<? super f> bVar) {
            super(bVar);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.M = obj;
            this.O |= Integer.MIN_VALUE;
            return OtaPollingWorker.this.v(null, null, null, this);
        }
    }

    static {
        kotlin.time.a.Companion companion = kotlin.time.a.INSTANCE;
        hu.b bVar = hu.b.SECONDS;
        f9425c = kotlin.time.b.p(10, bVar);
        f9426d = kotlin.time.b.p(30, bVar);
        f9427e = new Function2() { // from class: sj.a
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return OtaPollingWorker.t((Network) obj, (URL) obj2);
            }
        };
        f9428f = new Function1() { // from class: sj.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OtaPollingWorker.l((Context) obj);
            }
        };
        f9429g = new a(OtaConfigHandler.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OtaPollingWorker(@NotNull Context context, @NotNull WorkerParameters params) {
        super(context, params);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(params, "params");
        this.context = context;
    }

    public static final String A(List list) {
        Intrinsics.checkNotNullParameter(list, "<destruct>");
        return "WorkerBlob_" + ((String) list.get(0)) + "_" + ((String) list.get(1));
    }

    public static final void B(@NotNull Context context) {
        INSTANCE.f(context);
    }

    public static final Network l(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        ConnectivityManager connectivityManager = (ConnectivityManager) l2.b.k(context, ConnectivityManager.class);
        if (connectivityManager != null) {
            return connectivityManager.getActiveNetwork();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void s(OtaPollingWorker otaPollingWorker, String str, List list, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            list = p.k();
        }
        otaPollingWorker.r(str, list);
    }

    public static final URLConnection t(Network network, URL it) {
        Intrinsics.checkNotNullParameter(network, "<this>");
        Intrinsics.checkNotNullParameter(it, "it");
        return network.openConnection(it);
    }

    public static final String x(SharedPreferences sharedPreferences, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return sharedPreferences.getString(OtaConfigHandler.KEY_WORKER_PENDING_PREFIX + it, null);
    }

    public static final List y(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return CollectionsKt.H0(StringsKt.split$default(it, new String[]{":"}, false, 3, 2, null), 2);
    }

    public static final boolean z(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.size() == 2;
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0253  */
    /* JADX WARN: Code duplicated, block: B:62:0x025b  */
    /* JADX WARN: Code duplicated, block: B:70:0x0274 A[Catch: all -> 0x02d4, TRY_LEAVE, TryCatch #1 {all -> 0x02d4, blocks: (B:68:0x0270, B:70:0x0274, B:75:0x02d6), top: B:78:0x0270 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x02d6 A[Catch: all -> 0x02d4, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x02d4, blocks: (B:68:0x0270, B:70:0x0274, B:75:0x02d6), top: B:78:0x0270 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    @Override // androidx.work.CoroutineWorker
    @Nullable
    public Object doWork(@NotNull lt.b<? super c.a> bVar) throws Throwable {
        d dVar;
        y yVar;
        String str;
        String str2;
        long j10;
        String str3;
        String str4;
        long j11;
        if (bVar instanceof d) {
            dVar = (d) bVar;
            int i10 = dVar.D;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.D = i10 - Integer.MIN_VALUE;
            } else {
                dVar = new d(bVar);
            }
        } else {
            dVar = new d(bVar);
        }
        d dVar2 = dVar;
        Object obj = dVar2.B;
        Object objE = mt.c.e();
        int i11 = dVar2.D;
        if (i11 == 0) {
            o.b(obj);
            if (!p() && !h.a().H1()) {
                s(this, "ota_polling_worker_flag_disabled_cancelled", null, 2, null);
                INSTANCE.b(this.context);
                c.a aVarD = c.a.d();
                Intrinsics.checkNotNullExpressionValue(aVarD, "success(...)");
                return aVarD;
            }
            boolean zContains = getTags().contains("background_ota_polling_debug_once");
            String strA = w.a(this.context);
            Log.i("OtaPollingWorker", "OtaPollingWorker started: clientState=" + strA + " isDebugOnce=" + zContains);
            if (!zContains && Intrinsics.c(strA, "foreground")) {
                Log.i("OtaPollingWorker", "OtaPollingWorker: app in foreground, skipping (in-process timer active)");
                s(this, "ota_polling_worker_skipped_foreground", null, 2, null);
                c.a aVarD2 = c.a.d();
                Intrinsics.checkNotNullExpressionValue(aVarD2, "success(...)");
                return aVarD2;
            }
            if (!q()) {
                Log.i("OtaPollingWorker", "OtaPollingWorker: app inactive beyond threshold, cancelling work");
                s(this, "ota_polling_worker_inactivity_cancelled", null, 2, null);
                INSTANCE.b(this.context);
                p0.INSTANCE.a(this.context).b("background_ota_polling_debug_once");
                c.a aVarD3 = c.a.d();
                Intrinsics.checkNotNullExpressionValue(aVarD3, "success(...)");
                return aVarD3;
            }
            int iD = getInputData().d("max_retry_attempts", 3);
            if (getRunAttemptCount() > iD) {
                Log.w("OtaPollingWorker", "OtaPollingWorker: exceeded " + iD + " consecutive retries (attempt " + getRunAttemptCount() + "), giving up for this period");
                s(this, "ota_polling_worker_retry_exhausted", null, 2, null);
                c.a aVarA = c.a.a();
                Intrinsics.checkNotNullExpressionValue(aVarA, "failure(...)");
                return aVarA;
            }
            boolean zG = com.roblox.client.flags.b.f9110a.g();
            r("ota_polling_worker_start", p.n(new NameValuePair("native_lib_loaded", String.valueOf(zG)), new NameValuePair("run_attempt_count", String.valueOf(getRunAttemptCount()))));
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            yVar = new y();
            try {
                SharedPreferences otaPrefs = OtaConfigHandler.getOtaPrefs(this.context);
                Set<String> activeBehaviorNames = OtaConfigHandler.getActiveBehaviorNames(otaPrefs);
                if (activeBehaviorNames.isEmpty()) {
                    Log.i("OtaPollingWorker", "OtaPollingWorker: no behaviors registered yet, nothing to poll");
                    c.a aVarD4 = c.a.d();
                    Intrinsics.checkNotNullExpressionValue(aVarD4, "success(...)");
                    r("ota_polling_worker_end", p.n(new NameValuePair("duration_ms", String.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime)), new NameValuePair("run_attempt_count", String.valueOf(getRunAttemptCount()))));
                    return aVarD4;
                }
                l0 l0VarB = g1.b();
                str3 = "ota_polling_worker_end";
                str4 = "run_attempt_count";
                j10 = jElapsedRealtime;
                try {
                    e eVar = new e(otaPrefs, activeBehaviorNames, yVar, null);
                    dVar2.f9434v = l.a(strA);
                    dVar2.f9435w = yVar;
                    dVar2.f9436x = l.a(otaPrefs);
                    dVar2.f9437y = l.a(activeBehaviorNames);
                    dVar2.f9432t = zContains;
                    dVar2.f9438z = iD;
                    dVar2.f9433u = zG;
                    dVar2.A = j10;
                    dVar2.D = 1;
                    if (iu.i.g(l0VarB, eVar, dVar2) == objE) {
                        return objE;
                    }
                    j11 = j10;
                    r(str3, p.n(new NameValuePair("duration_ms", String.valueOf(SystemClock.elapsedRealtime() - j11)), new NameValuePair(str4, String.valueOf(getRunAttemptCount()))));
                    if (yVar.f23023a) {
                        c.a aVarC = c.a.c();
                        Intrinsics.checkNotNullExpressionValue(aVarC, "retry(...)");
                        return aVarC;
                    }
                    c.a aVarD5 = c.a.d();
                    Intrinsics.checkNotNullExpressionValue(aVarD5, "success(...)");
                    return aVarD5;
                } catch (Exception e10) {
                    e = e10;
                    str = str3;
                    str2 = str4;
                    if (!(e instanceof CancellationException)) {
                        throw e;
                    }
                    Log.e("OtaPollingWorker", "OtaPollingWorker: fatal error", e);
                    r("ota_polling_worker_error", p.n(new NameValuePair("error_type", e.getClass().getSimpleName()), new NameValuePair("failed_host", n(e.getMessage()))));
                    c.a aVarC2 = c.a.c();
                    Intrinsics.checkNotNullExpressionValue(aVarC2, "retry(...)");
                    r(str, p.n(new NameValuePair("duration_ms", String.valueOf(SystemClock.elapsedRealtime() - j10)), new NameValuePair(str2, String.valueOf(getRunAttemptCount()))));
                    return aVarC2;
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
            j11 = dVar2.A;
            yVar = (y) dVar2.f9435w;
            try {
                o.b(obj);
                str3 = "ota_polling_worker_end";
                str4 = "run_attempt_count";
                r(str3, p.n(new NameValuePair("duration_ms", String.valueOf(SystemClock.elapsedRealtime() - j11)), new NameValuePair(str4, String.valueOf(getRunAttemptCount()))));
                if (yVar.f23023a) {
                    c.a aVarC3 = c.a.c();
                    Intrinsics.checkNotNullExpressionValue(aVarC3, "retry(...)");
                    return aVarC3;
                }
                c.a aVarD6 = c.a.d();
                Intrinsics.checkNotNullExpressionValue(aVarD6, "success(...)");
                return aVarD6;
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
                    r("ota_polling_worker_error", p.n(new NameValuePair("error_type", e.getClass().getSimpleName()), new NameValuePair("failed_host", n(e.getMessage()))));
                    c.a aVarC4 = c.a.c();
                    Intrinsics.checkNotNullExpressionValue(aVarC4, "retry(...)");
                    r(str, p.n(new NameValuePair("duration_ms", String.valueOf(SystemClock.elapsedRealtime() - j10)), new NameValuePair(str2, String.valueOf(getRunAttemptCount()))));
                    return aVarC4;
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
        r(str, p.n(new NameValuePair("duration_ms", String.valueOf(SystemClock.elapsedRealtime() - j10)), new NameValuePair(str2, String.valueOf(getRunAttemptCount()))));
        throw th;
    }

    public final Object m(String str, File file, lt.b<? super Unit> bVar) throws Exception {
        File file2 = new File(file.getParent(), file.getName() + ".tmp." + getId());
        try {
            HttpURLConnection httpURLConnectionU = u(str);
            int responseCode = httpURLConnectionU.getResponseCode();
            if (responseCode != 200) {
                throw new IOException("HTTP " + responseCode + " downloading blob " + str);
            }
            Log.i("OtaPollingWorker", "OtaPollingWorker: blob HTTP " + responseCode + " contentLength=" + httpURLConnectionU.getContentLengthLong() + " dest=" + file.getName());
            InputStream inputStream = httpURLConnectionU.getInputStream();
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    Intrinsics.checkNotNull(inputStream);
                    st.b.b(inputStream, fileOutputStream, 0, 2, null);
                    st.c.a(fileOutputStream, null);
                    st.c.a(inputStream, null);
                    Log.i("OtaPollingWorker", "OtaPollingWorker: blob copy complete size=" + file2.length() + " dest=" + file.getName());
                    if (file2.renameTo(file)) {
                        return Unit.f22938a;
                    }
                    throw new IOException("Failed to rename " + file2 + " to " + file);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        st.c.a(fileOutputStream, th2);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    st.c.a(inputStream, th4);
                    throw th5;
                }
            }
        } catch (Exception e10) {
            file2.delete();
            throw e10;
        }
    }

    public final String n(String message) {
        Object objB;
        if (message == null) {
            return "unknown";
        }
        try {
            n.Companion companion = n.INSTANCE;
            objB = n.b(new URL(StringsKt.f1(message, " ", null, 2, null)).getHost());
        } catch (Throwable th2) {
            n.Companion companion2 = n.INSTANCE;
            objB = n.b(o.a(th2));
        }
        return (String) (n.g(objB) ? "unknown" : objB);
    }

    public final Object o(String str, lt.b<? super JSONArray> bVar) throws IOException {
        HttpURLConnection httpURLConnectionU = u(str);
        int responseCode = httpURLConnectionU.getResponseCode();
        if (responseCode != 200) {
            throw new IOException("HTTP " + responseCode + " fetching " + str);
        }
        InputStream inputStream = httpURLConnectionU.getInputStream();
        Intrinsics.checkNotNullExpressionValue(inputStream, "getInputStream(...)");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, Charsets.UTF_8), 8192);
        try {
            String strH = st.n.h(bufferedReader);
            st.c.a(bufferedReader, null);
            return new JSONArray(strH);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                st.c.a(bufferedReader, th2);
                throw th3;
            }
        }
    }

    public final boolean p() {
        return getInputData().c("flags_from_schedule", false);
    }

    public final boolean q() {
        SharedPreferences sharedPreferencesU = a1.U(this.context);
        kotlin.time.a.Companion companion = kotlin.time.a.INSTANCE;
        long j10 = sharedPreferencesU.getLong("last_startup_time", 0L);
        hu.b bVar = hu.b.MILLISECONDS;
        return kotlin.time.a.j(kotlin.time.a.L(kotlin.time.b.q(System.currentTimeMillis(), bVar), kotlin.time.b.q(j10, bVar)), kotlin.time.b.q((long) getInputData().d("inactivity_days", 3), hu.b.DAYS)) <= 0;
    }

    public final void r(String eventName, List<? extends NameValuePair> extraParams) {
        OtaConfigHandler.INSTANCE.logEvent$NativeShell_googleProdRelease(eventName, "background_ota_worker", extraParams);
    }

    public final HttpURLConnection u(String url) throws IOException {
        Network networkInvoke;
        URLConnection uRLConnectionOpenConnection;
        if (getInputData().c("bind_network", false)) {
            networkInvoke = (Build.VERSION.SDK_INT < 28 || getNetwork() == null) ? f9428f.invoke(this.context) : getNetwork();
        } else {
            networkInvoke = null;
        }
        if (networkInvoke == null || (uRLConnectionOpenConnection = f9427e.invoke(networkInvoke, new URL(url))) == null) {
            uRLConnectionOpenConnection = new URL(url).openConnection();
        }
        Intrinsics.d(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        httpURLConnection.setConnectTimeout((int) kotlin.time.a.w(f9425c));
        httpURLConnection.setReadTimeout((int) kotlin.time.a.w(f9426d));
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return httpURLConnection;
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0502  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Instruction removed from duplicated block: B:113:0x0502, please report this as an issue */
    public final Object v(String str, String str2, SharedPreferences sharedPreferences, lt.b<? super PollResult> bVar) throws IOException {
        f fVar;
        String patchStorageKey;
        String strD;
        String str3;
        String str4;
        SharedPreferences sharedPreferences2;
        String str5;
        String str6;
        JSONObject jSONObjectOptJSONObject;
        long jOptLong;
        long j10;
        File file;
        Object objB;
        boolean zBooleanValue;
        String str7;
        String host;
        String str8;
        String str9;
        String str10;
        String string;
        long j11;
        long j12;
        String str11;
        File file2;
        SharedPreferences sharedPreferences3;
        JSONObject jSONObject;
        if (bVar instanceof f) {
            fVar = (f) bVar;
            int i10 = fVar.O;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.O = i10 - Integer.MIN_VALUE;
            } else {
                fVar = new f(bVar);
            }
        } else {
            fVar = new f(bVar);
        }
        Object obj = fVar.M;
        Object objE = mt.c.e();
        int i11 = fVar.O;
        if (i11 == 0) {
            o.b(obj);
            Log.d("OtaPollingWorker", "OtaPollingWorker: polling " + str + " from " + str2);
            OtaConfigHandler otaConfigHandler = OtaConfigHandler.INSTANCE;
            patchStorageKey = otaConfigHandler.getPatchStorageKey(sharedPreferences, str);
            if (patchStorageKey == null) {
                Log.w("OtaPollingWorker", "OtaPollingWorker: no patchStorageKey for " + str + " yet, skipping");
                return null;
            }
            String baseUrl = otaConfigHandler.getBaseUrl(sharedPreferences);
            if (baseUrl == null) {
                Log.w("OtaPollingWorker", "OtaPollingWorker: no base URL for blob download yet, skipping");
                return null;
            }
            String perUserPatchKey = otaConfigHandler.getPerUserPatchKey(sharedPreferences, str);
            if (perUserPatchKey == null) {
                Log.w("OtaPollingWorker", "OtaPollingWorker: no perUserPatchKey for " + str + " yet, skipping");
                return null;
            }
            strD = getInputData().c("retarget_config_url", false) ? INSTANCE.d(str2, f9429g.invoke()) : str2;
            if (!Intrinsics.c(strD, str2)) {
                Log.i("OtaPollingWorker", "OtaPollingWorker: re-targeted " + str + " config URL to " + strD);
            }
            fVar.f9446t = str;
            fVar.f9447u = l.a(str2);
            fVar.f9448v = sharedPreferences;
            fVar.f9449w = patchStorageKey;
            fVar.f9450x = baseUrl;
            fVar.f9451y = perUserPatchKey;
            fVar.f9452z = l.a(strD);
            fVar.O = 1;
            Object objO = o(strD, fVar);
            if (objO == objE) {
                return objE;
            }
            str3 = str2;
            str4 = perUserPatchKey;
            obj = objO;
            sharedPreferences2 = sharedPreferences;
            str5 = baseUrl;
            str6 = str;
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                boolean z10 = fVar.L;
                j12 = fVar.J;
                j11 = fVar.I;
                file2 = (File) fVar.E;
                jSONObject = (JSONObject) fVar.B;
                sharedPreferences3 = (SharedPreferences) fVar.f9448v;
                str11 = (String) fVar.f9446t;
                try {
                    o.b(obj);
                    zBooleanValue = z10;
                    jOptLong = j12;
                    str10 = ":";
                    file = file2;
                    jSONObjectOptJSONObject = jSONObject;
                    sharedPreferences2 = sharedPreferences3;
                    str6 = str11;
                    j10 = j11;
                    SharedPreferences.Editor editorEdit = sharedPreferences2.edit();
                    editorEdit.putString(OtaConfigHandler.KEY_WORKER_PENDING_PREFIX + str6, j10 + str10 + jOptLong);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(OtaConfigHandler.KEY_CONFIG_JSON_PREFIX);
                    sb2.append(str6);
                    editorEdit.putString(sb2.toString(), OtaConfigHandler.INSTANCE.buildStorageConfig(jSONObjectOptJSONObject).toString());
                    editorEdit.apply();
                    if (zBooleanValue) {
                        Log.w("OtaPollingWorker", "DEV: pending marker written for " + str6 + "=" + j10 + str10 + jOptLong);
                    }
                    Log.i("OtaPollingWorker", "OtaPollingWorker: blob downloaded for " + str6 + " at " + file.getAbsolutePath());
                    return new PollResult(j10, jOptLong);
                } catch (IOException e10) {
                    e = e10;
                    String str12 = ")";
                    str8 = " assetVersion=";
                    str7 = " assetId=";
                    Log.e("OtaPollingWorker", "OtaPollingWorker: download failed for " + str11 + str7 + j11 + str8 + j12 + " (" + e.getClass().getSimpleName() + ": " + e.getMessage() + str12);
                    throw e;
                }
            }
            String str13 = (String) fVar.f9452z;
            str4 = (String) fVar.f9451y;
            str5 = (String) fVar.f9450x;
            patchStorageKey = (String) fVar.f9449w;
            sharedPreferences2 = (SharedPreferences) fVar.f9448v;
            str3 = (String) fVar.f9447u;
            str6 = (String) fVar.f9446t;
            o.b(obj);
            strD = str13;
        }
        JSONArray jSONArray = (JSONArray) obj;
        if (jSONArray.length() == 0) {
            Log.w("OtaPollingWorker", "OtaPollingWorker: empty config array for " + str6);
            return null;
        }
        String str14 = str5;
        String str15 = strD;
        jSONObjectOptJSONObject = jSONArray.optJSONObject(0);
        if (jSONObjectOptJSONObject == null) {
            return null;
        }
        f fVar2 = fVar;
        long jOptLong2 = jSONObjectOptJSONObject.optLong("assetId", 0L);
        jOptLong = jSONObjectOptJSONObject.optLong("assetVersion", 0L);
        if (jOptLong2 == 0 || jOptLong == 0) {
            Log.w("OtaPollingWorker", "OtaPollingWorker: invalid patch config for " + str6 + " (assetId=" + jOptLong2 + ", assetVersion=" + jOptLong + ")");
            return null;
        }
        String strE1 = a1.e1();
        boolean zC = p() ? getInputData().c("max_app_version_check", false) : h.a().j();
        if (zC) {
            Companion companion = INSTANCE;
            Intrinsics.checkNotNull(strE1);
            if (companion.c(jSONObjectOptJSONObject, strE1)) {
                String strOptString = jSONObjectOptJSONObject.optString("maxAppVersion");
                Log.i("OtaPollingWorker", "OtaPollingWorker: " + str6 + " maxAppVersion " + strOptString + " is below app version " + strE1 + ", skipping download");
                r("ota_polling_worker_incompatible_config_skipped", p.n(new NameValuePair("behavior_name", str6), new NameValuePair("asset_id", String.valueOf(jOptLong2)), new NameValuePair("asset_version", String.valueOf(jOptLong)), new NameValuePair("max_app_version", strOptString), new NameValuePair("app_version", strE1)));
                return null;
            }
        }
        OtaConfigHandler otaConfigHandler2 = OtaConfigHandler.INSTANCE;
        Long pendingWorkerBlobVersion = otaConfigHandler2.getPendingWorkerBlobVersion(sharedPreferences2, str6);
        if (pendingWorkerBlobVersion == null) {
            pendingWorkerBlobVersion = otaConfigHandler2.getCachedAssetVersionFromAppStorage(this.context, patchStorageKey, str4);
        }
        if (pendingWorkerBlobVersion != null && pendingWorkerBlobVersion.longValue() == jOptLong) {
            Log.i("OtaPollingWorker", "OtaPollingWorker: " + str6 + " already at version " + jOptLong + ", skipping download");
            r("ota_polling_worker_no_update", p.n(new NameValuePair("behavior_name", str6), new NameValuePair("asset_version", String.valueOf(jOptLong))));
            return null;
        }
        File file3 = new File(this.context.getFilesDir(), "appData/OTAWorkerBlobs");
        file3.mkdirs();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("WorkerBlob_");
        Long l10 = pendingWorkerBlobVersion;
        j10 = jOptLong2;
        sb3.append(j10);
        sb3.append("_");
        sb3.append(jOptLong);
        file = new File(file3, sb3.toString());
        if (p()) {
            zBooleanValue = getInputData().c("debug_mode", false);
        } else {
            try {
                n.Companion companion2 = n.INSTANCE;
                objB = n.b(nt.b.a(h.a().Q5()));
            } catch (Throwable th2) {
                n.Companion companion3 = n.INSTANCE;
                objB = n.b(o.a(th2));
            }
            Boolean boolA = nt.b.a(false);
            if (n.g(objB)) {
                objB = boolA;
            }
            zBooleanValue = ((Boolean) objB).booleanValue();
        }
        if (zBooleanValue) {
            Log.w("OtaPollingWorker", "DEV: blobFile path=" + file.getAbsolutePath() + " perUserPatchKey=" + str4);
        }
        if (file.exists()) {
            nt.b.d(Log.i("OtaPollingWorker", "OtaPollingWorker: blob for " + str6 + " already on disk, updating pending marker"));
            str10 = ":";
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("OtaPollingWorker: downloading patch for ");
            sb4.append(str6);
            str7 = " assetId=";
            sb4.append(str7);
            sb4.append(j10);
            sb4.append(" assetVersion=");
            sb4.append(jOptLong);
            Log.i("OtaPollingWorker", sb4.toString());
            Uri uri = Uri.parse(str14);
            String host2 = uri.getHost();
            if (host2 == null || (host = kotlin.text.x.P(host2, "www.", "assetdelivery.", false, 4, null)) == null) {
                host = uri.getHost();
            }
            String str16 = str4;
            String str17 = host;
            Uri.Builder builderScheme = new Uri.Builder().scheme(uri.getScheme());
            str8 = " assetVersion=";
            if (uri.getPort() != -1) {
                int port = uri.getPort();
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str17);
                str9 = str17;
                str10 = ":";
                sb5.append(str10);
                sb5.append(port);
                string = sb5.toString();
            } else {
                str9 = str17;
                str10 = ":";
                string = str9;
            }
            String string2 = builderScheme.encodedAuthority(string).path("/v1/asset/").appendQueryParameter("id", String.valueOf(j10)).appendQueryParameter("version", String.valueOf(jOptLong)).build().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            try {
                fVar2.f9446t = str6;
                fVar2.f9447u = l.a(str3);
                fVar2.f9448v = sharedPreferences2;
                fVar2.f9449w = l.a(patchStorageKey);
                fVar2.f9450x = l.a(str14);
                fVar2.f9451y = l.a(str16);
                fVar2.f9452z = l.a(str15);
                fVar2.A = l.a(jSONArray);
                fVar2.B = jSONObjectOptJSONObject;
                fVar2.C = l.a(strE1);
                fVar2.D = l.a(l10);
                fVar2.E = file;
                fVar2.F = l.a(uri);
                fVar2.G = l.a(str9);
                fVar2.H = l.a(string2);
                fVar2.I = j10;
                fVar2.J = jOptLong;
                fVar2.K = zC;
                fVar2.L = zBooleanValue;
                fVar2.O = 2;
                if (m(string2, file, fVar2) == objE) {
                    return objE;
                }
                j11 = j10;
                file2 = file;
                str11 = str6;
                sharedPreferences3 = sharedPreferences2;
                jSONObject = jSONObjectOptJSONObject;
                file = file2;
                jSONObjectOptJSONObject = jSONObject;
                sharedPreferences2 = sharedPreferences3;
                str6 = str11;
                j10 = j11;
            } catch (IOException e11) {
                e = e11;
                j11 = j10;
                j12 = jOptLong;
                str11 = str6;
                Log.e("OtaPollingWorker", "OtaPollingWorker: download failed for " + str11 + str7 + j11 + str8 + j12 + " (" + e.getClass().getSimpleName() + ": " + e.getMessage() + str12);
                throw e;
            }
        }
        SharedPreferences.Editor editorEdit2 = sharedPreferences2.edit();
        editorEdit2.putString(OtaConfigHandler.KEY_WORKER_PENDING_PREFIX + str6, j10 + str10 + jOptLong);
        StringBuilder sb6 = new StringBuilder();
        sb6.append(OtaConfigHandler.KEY_CONFIG_JSON_PREFIX);
        sb6.append(str6);
        editorEdit2.putString(sb6.toString(), OtaConfigHandler.INSTANCE.buildStorageConfig(jSONObjectOptJSONObject).toString());
        editorEdit2.apply();
        if (zBooleanValue) {
            Log.w("OtaPollingWorker", "DEV: pending marker written for " + str6 + "=" + j10 + str10 + jOptLong);
        }
        Log.i("OtaPollingWorker", "OtaPollingWorker: blob downloaded for " + str6 + " at " + file.getAbsolutePath());
        return new PollResult(j10, jOptLong);
    }

    public final void w(final SharedPreferences prefs, Set<String> behaviorNames) {
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
                        r("ota_polling_worker_orphan_marker_cleared", kotlin.collections.o.d(new NameValuePair("behavior_name", next)));
                        OtaConfigHandler.INSTANCE.clearPendingWorkerBlob(prefs, next);
                    }
                }
            }
        }
        File file = new File(this.context.getFilesDir(), "appData/OTAWorkerBlobs");
        if (file.exists()) {
            Set setA = gu.p.A(gu.p.x(gu.p.p(gu.p.x(gu.p.y(CollectionsKt.U(behaviorNames), new Function1() { // from class: sj.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OtaPollingWorker.x(prefs, (String) obj);
                }
            }), new Function1() { // from class: sj.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OtaPollingWorker.y((String) obj);
                }
            }), new Function1() { // from class: sj.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(OtaPollingWorker.z((List) obj));
                }
            }), new Function1() { // from class: sj.f
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OtaPollingWorker.A((List) obj);
                }
            }));
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null) {
                for (File file2 : fileArrListFiles) {
                    if (!setA.contains(file2.getName())) {
                        Log.i("OtaPollingWorker", "OtaPollingWorker: pruning orphaned blob " + file2.getName());
                        r("ota_polling_worker_orphan_blob_pruned", kotlin.collections.o.d(new NameValuePair("blob_name", file2.getName())));
                        file2.delete();
                    }
                }
            }
        }
    }
}
