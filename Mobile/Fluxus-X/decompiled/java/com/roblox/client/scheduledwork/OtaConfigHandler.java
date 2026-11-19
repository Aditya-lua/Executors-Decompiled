package com.roblox.client.scheduledwork;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.Keep;
import av.g1;
import av.k;
import av.p0;
import av.q0;
import bi.h;
import com.github.luben.zstd.BuildConfig;
import com.roblox.client.RobloxApplication;
import com.roblox.client.datastructures.NameValuePair;
import eu.b;
import fu.c;
import gu.f;
import gu.m;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import lu.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p001kotlin.Metadata;
import p001kotlin.Pair;
import p001kotlin.Unit;
import p001kotlin.collections.CollectionsKt;
import p001kotlin.collections.p;
import p001kotlin.collections.r0;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.text.StringsKt;
import zt.n;
import zt.o;
import zt.s;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ7\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ0\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\tH\u0083 ¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010 \u001a\b\u0012\u0004\u0012\u00020\t0\u001f*\u00020\u0006H\u0007¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\tH\u0083 ¢\u0006\u0004\b\"\u0010#J \u0010%\u001a\u00020\u001c2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010$\u001a\u00020\tH\u0083 ¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020'2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*J\u001f\u0010,\u001a\u0004\u0018\u00010\u00162\u0006\u0010+\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b,\u0010-J\u001d\u0010.\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b.\u0010/J'\u00102\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0001¢\u0006\u0004\b0\u00101J\u001f\u00106\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u00103\u001a\u00020\u001cH\u0001¢\u0006\u0004\b4\u00105J\u001b\u00107\u001a\u0004\u0018\u00010\t*\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b7\u00108J\u001b\u00109\u001a\u0004\u0018\u00010\t*\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b9\u00108J\u001b\u0010:\u001a\u0004\u0018\u00010\t*\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b:\u00108J\u001b\u0010;\u001a\u0004\u0018\u00010'*\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b;\u0010<J\u0013\u0010=\u001a\u0004\u0018\u00010\t*\u00020\u0006¢\u0006\u0004\b=\u0010>J'\u0010?\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b?\u0010@J\u0015\u0010B\u001a\u00020'2\u0006\u0010A\u001a\u00020'¢\u0006\u0004\bB\u0010*J=\u0010H\u001a\b\u0012\u0004\u0012\u00020\u000f0E2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010C\u001a\u00020'2\b\b\u0002\u0010D\u001a\u00020\t¢\u0006\u0004\bF\u0010GJ\u000f\u0010I\u001a\u0004\u0018\u00010\t¢\u0006\u0004\bI\u0010#J/\u0010Q\u001a\u00020\u000f2\u0006\u0010J\u001a\u00020\t2\u0006\u0010K\u001a\u00020\t2\u000e\b\u0002\u0010N\u001a\b\u0012\u0004\u0012\u00020M0LH\u0000¢\u0006\u0004\bO\u0010PR\u0014\u0010R\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010T\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\bT\u0010SR\u0014\u0010U\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\bU\u0010SR\u0014\u0010V\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\bV\u0010SR\u0014\u0010W\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\bW\u0010SR\u0014\u0010X\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\bX\u0010SR\u0014\u0010Y\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\bY\u0010SR\u0014\u0010Z\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\bZ\u0010SR\u0014\u0010[\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b[\u0010SR\u0014\u0010\\\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\\\u0010SR\u0014\u0010]\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b]\u0010SR8\u0010`\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160_0^8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b`\u0010a\u0012\u0004\bd\u0010\u0003\u001a\u0004\bb\u0010cR&\u0010f\u001a\b\u0012\u0004\u0012\u00020\t0e8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bf\u0010g\u0012\u0004\bj\u0010\u0003\u001a\u0004\bh\u0010iR&\u0010k\u001a\b\u0012\u0004\u0012\u00020\t0e8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bk\u0010g\u0012\u0004\bm\u0010\u0003\u001a\u0004\bl\u0010iR\u0014\u0010n\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010o¨\u0006p"}, d2 = {"Lcom/roblox/client/scheduledwork/OtaConfigHandler;", BuildConfig.FLAVOR, "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/SharedPreferences;", "getOtaPrefs", "(Landroid/content/Context;)Landroid/content/SharedPreferences;", BuildConfig.FLAVOR, "behaviorName", "url", "patchStorageKey", "perUserPatchKey", "baseUrl", BuildConfig.FLAVOR, "saveOtaConfigState", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "clearPendingWorkerBlobFromNative", "(Ljava/lang/String;)V", "checkAndPromoteWorkerBlob", "(Landroid/content/Context;Ljava/lang/String;)V", BuildConfig.FLAVOR, "assetId", "assetVersion", "onPatchLoadedFromNative", "(Ljava/lang/String;JJ)V", "blobPath", BuildConfig.FLAVOR, "nativeVerifyAndPromoteBlob", "(Ljava/lang/String;JJLjava/lang/String;)Z", BuildConfig.FLAVOR, "getActiveBehaviorNames", "(Landroid/content/SharedPreferences;)Ljava/util/Set;", "nativeGetEngineVersion", "()Ljava/lang/String;", "perUserKeyJson", "nativeCommitOtaConfig", "(Ljava/lang/String;Ljava/lang/String;)Z", "Lorg/json/JSONObject;", "patchJson", "normalizePatchConfigForStorage", "(Lorg/json/JSONObject;)Lorg/json/JSONObject;", "prefs", "getPendingWorkerBlobVersion", "(Landroid/content/SharedPreferences;Ljava/lang/String;)Ljava/lang/Long;", "clearPendingWorkerBlob", "(Landroid/content/SharedPreferences;Ljava/lang/String;)V", "trackPromotionStarted$NativeShell_googleProdRelease", "(Ljava/lang/String;JJ)Z", "trackPromotionStarted", "promoted", "trackPromotionFinished$NativeShell_googleProdRelease", "(Ljava/lang/String;Z)V", "trackPromotionFinished", "getConfigUrl", "(Landroid/content/SharedPreferences;Ljava/lang/String;)Ljava/lang/String;", "getPatchStorageKey", "getPerUserPatchKey", "getStoredConfigJson", "(Landroid/content/SharedPreferences;Ljava/lang/String;)Lorg/json/JSONObject;", "getBaseUrl", "(Landroid/content/SharedPreferences;)Ljava/lang/String;", "getCachedAssetVersionFromAppStorage", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Long;", "serverConfig", "buildStorageConfig", "patchConfigJson", "workerId", "Lzt/n;", "writeConfigToAppStorage-yxL6bBk", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Object;", "writeConfigToAppStorage", "getEngineVersion", "eventName", "ctx", BuildConfig.FLAVOR, "Lcom/roblox/client/datastructures/NameValuePair;", "extraParams", "logEvent$NativeShell_googleProdRelease", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "logEvent", "TAG", "Ljava/lang/String;", "KEY_ACTIVE_BEHAVIORS", "KEY_CONFIG_URL_PREFIX", "KEY_PATCH_STORAGE_KEY_PREFIX", "KEY_PER_USER_PATCH_KEY_PREFIX", "KEY_BASE_URL", "KEY_WORKER_PENDING_PREFIX", "KEY_CONFIG_JSON_PREFIX", "OTA_PREFS_FILE", "APP_STORAGE_RELATIVE_PATH", "LEGACY_PATCH_CONFIG_KEY", "Ljava/util/concurrent/ConcurrentHashMap;", "Lkotlin/Pair;", "promotionCandidates", "Ljava/util/concurrent/ConcurrentHashMap;", "getPromotionCandidates$NativeShell_googleProdRelease", "()Ljava/util/concurrent/ConcurrentHashMap;", "getPromotionCandidates$NativeShell_googleProdRelease$annotations", BuildConfig.FLAVOR, "promotedBehaviors", "Ljava/util/Set;", "getPromotedBehaviors$NativeShell_googleProdRelease", "()Ljava/util/Set;", "getPromotedBehaviors$NativeShell_googleProdRelease$annotations", "promotionsInFlight", "getPromotionsInFlight$NativeShell_googleProdRelease", "getPromotionsInFlight$NativeShell_googleProdRelease$annotations", "PATCH_CONFIG_DEFAULTS", "Lorg/json/JSONObject;", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OtaConfigHandler {

    @NotNull
    private static final String APP_STORAGE_RELATIVE_PATH = "appData/LocalStorage/appStorage.json";

    @NotNull
    public static final String KEY_ACTIVE_BEHAVIORS = "ota_active_behavior_names";

    @NotNull
    public static final String KEY_BASE_URL = "ota_base_url";

    @NotNull
    public static final String KEY_CONFIG_JSON_PREFIX = "ota_config_json_";

    @NotNull
    public static final String KEY_CONFIG_URL_PREFIX = "ota_config_url_";

    @NotNull
    public static final String KEY_PATCH_STORAGE_KEY_PREFIX = "ota_patch_storage_key_";

    @NotNull
    public static final String KEY_PER_USER_PATCH_KEY_PREFIX = "ota_per_user_patch_key_";

    @NotNull
    public static final String KEY_WORKER_PENDING_PREFIX = "ota_worker_pending_";

    @NotNull
    private static final String LEGACY_PATCH_CONFIG_KEY = "DataModelPatchConfig";

    @NotNull
    private static final String OTA_PREFS_FILE = "ota_state";

    @NotNull
    private static final JSONObject PATCH_CONFIG_DEFAULTS;

    @NotNull
    private static final String TAG = "OtaConfigHandler";

    @NotNull
    private static final Set<String> promotedBehaviors;

    @NotNull
    private static final Set<String> promotionsInFlight;

    @NotNull
    public static final OtaConfigHandler INSTANCE = new OtaConfigHandler();

    @NotNull
    private static final ConcurrentHashMap<String, Pair<Long, Long>> promotionCandidates = new ConcurrentHashMap<>();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @f(c = "com.roblox.client.scheduledwork.OtaConfigHandler$checkAndPromoteWorkerBlob$1", f = "OtaConfigHandler.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends m implements Function2<p0, b<? super Unit>, Object> {
        public final /* synthetic */ Context A;
        public final /* synthetic */ String B;
        public final /* synthetic */ JSONObject C;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f9235t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ File f9236u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ long f9237v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ long f9238w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ String f9239x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ String f9240y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ String f9241z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(File file, long j10, long j11, String str, String str2, String str3, Context context, String str4, JSONObject jSONObject, b<? super a> bVar) {
            super(2, bVar);
            this.f9236u = file;
            this.f9237v = j10;
            this.f9238w = j11;
            this.f9239x = str;
            this.f9240y = str2;
            this.f9241z = str3;
            this.A = context;
            this.B = str4;
            this.C = jSONObject;
        }

        @Override // gu.a
        public final b<Unit> create(Object obj, b<?> bVar) {
            return new a(this.f9236u, this.f9237v, this.f9238w, this.f9239x, this.f9240y, this.f9241z, this.A, this.B, this.C, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            c.e();
            if (this.f9235t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            String absolutePath = this.f9236u.getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
            boolean zNativeVerifyAndPromoteBlob = OtaConfigHandler.nativeVerifyAndPromoteBlob(absolutePath, this.f9237v, this.f9238w, this.f9239x);
            OtaConfigHandler.INSTANCE.logEvent$NativeShell_googleProdRelease(zNativeVerifyAndPromoteBlob ? "ota_promote_success" : "ota_promote_failed", "background_ota_worker", p.n(new NameValuePair("behavior_name", this.f9239x), new NameValuePair("asset_id", String.valueOf(this.f9237v)), new NameValuePair("asset_version", String.valueOf(this.f9238w))));
            if (zNativeVerifyAndPromoteBlob) {
                try {
                    OtaConfigHandler.nativeCommitOtaConfig(this.f9240y, this.f9241z);
                } catch (UnsatisfiedLinkError unused) {
                }
                Object objM64writeConfigToAppStorageyxL6bBk$default = OtaConfigHandler.m64writeConfigToAppStorageyxL6bBk$default(OtaConfigHandler.INSTANCE, this.A, this.f9240y, this.B, this.C, null, 16, null);
                String str = this.f9239x;
                Throwable thE = n.e(objM64writeConfigToAppStorageyxL6bBk$default);
                if (thE != null) {
                    Log.w(OtaConfigHandler.TAG, "checkAndPromoteWorkerBlob: writeConfigToAppStorage failed for " + str + ": " + thE);
                }
            }
            OtaConfigHandler.INSTANCE.trackPromotionFinished$NativeShell_googleProdRelease(this.f9239x, zNativeVerifyAndPromoteBlob);
            return Unit.f21506a;
        }
    }

    static {
        ConcurrentHashMap.KeySetView keySetViewNewKeySet = ConcurrentHashMap.newKeySet();
        Intrinsics.checkNotNullExpressionValue(keySetViewNewKeySet, "newKeySet(...)");
        promotedBehaviors = keySetViewNewKeySet;
        ConcurrentHashMap.KeySetView keySetViewNewKeySet2 = ConcurrentHashMap.newKeySet();
        Intrinsics.checkNotNullExpressionValue(keySetViewNewKeySet2, "newKeySet(...)");
        promotionsInFlight = keySetViewNewKeySet2;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("MaxAppVersion", "0");
        jSONObject.put("TryoutName", BuildConfig.FLAVOR);
        jSONObject.put("IsForcedUpdate", false);
        jSONObject.put("IsDevelopmentConfig", false);
        jSONObject.put("AppStorageResetId", "0");
        jSONObject.put("AssetsManifest", new JSONObject());
        jSONObject.put("VersionV2", "0");
        PATCH_CONFIG_DEFAULTS = jSONObject;
    }

    private OtaConfigHandler() {
    }

    public static final void checkAndPromoteWorkerBlob(@NotNull Context context, @NotNull String behaviorName) {
        Long lT;
        Long lT2;
        String perUserPatchKey;
        JSONObject storedConfigJson;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(behaviorName, "behaviorName");
        SharedPreferences otaPrefs = getOtaPrefs(context);
        String string = otaPrefs.getString(KEY_WORKER_PENDING_PREFIX + behaviorName, null);
        if (string == null) {
            return;
        }
        List listSplit$default = StringsKt.split$default(string, new String[]{":"}, false, 0, 6, null);
        String str = (String) CollectionsKt.f0(listSplit$default, 0);
        if (str == null || (lT = StringsKt.t(str)) == null) {
            Log.d(TAG, "checkAndPromoteWorkerBlob: malformed pending marker for " + behaviorName + " (no assetId): '" + string + "'");
            return;
        }
        long jLongValue = lT.longValue();
        String str2 = (String) CollectionsKt.f0(listSplit$default, 1);
        if (str2 == null || (lT2 = StringsKt.t(str2)) == null) {
            Log.d(TAG, "checkAndPromoteWorkerBlob: malformed pending marker for " + behaviorName + " (no assetVersion): '" + string + "'");
            return;
        }
        long jLongValue2 = lT2.longValue();
        File file = new File(context.getFilesDir(), "appData/OTAWorkerBlobs/WorkerBlob_" + jLongValue + "_" + jLongValue2);
        if (!file.exists()) {
            OtaConfigHandler otaConfigHandler = INSTANCE;
            otaConfigHandler.logEvent$NativeShell_googleProdRelease("ota_promote_blob_missing", "background_ota_worker", p.n(new NameValuePair("behavior_name", behaviorName), new NameValuePair("asset_id", String.valueOf(jLongValue)), new NameValuePair("asset_version", String.valueOf(jLongValue2))));
            otaConfigHandler.clearPendingWorkerBlob(otaPrefs, behaviorName);
            return;
        }
        OtaConfigHandler otaConfigHandler2 = INSTANCE;
        String patchStorageKey = otaConfigHandler2.getPatchStorageKey(otaPrefs, behaviorName);
        if (patchStorageKey == null || (perUserPatchKey = otaConfigHandler2.getPerUserPatchKey(otaPrefs, behaviorName)) == null || (storedConfigJson = otaConfigHandler2.getStoredConfigJson(otaPrefs, behaviorName)) == null) {
            return;
        }
        String string2 = new JSONObject().put(perUserPatchKey, new JSONArray().put(storedConfigJson)).toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        if (otaConfigHandler2.trackPromotionStarted$NativeShell_googleProdRelease(behaviorName, jLongValue, jLongValue2)) {
            k.d(q0.a(g1.b()), null, null, new a(file, jLongValue, jLongValue2, behaviorName, patchStorageKey, string2, context, perUserPatchKey, storedConfigJson, null), 3, null);
        }
    }

    public static final void clearPendingWorkerBlobFromNative(@NotNull String behaviorName) {
        Intrinsics.checkNotNullParameter(behaviorName, "behaviorName");
        Context contextF = RobloxApplication.f();
        if (contextF != null) {
            INSTANCE.clearPendingWorkerBlob(getOtaPrefs(contextF), behaviorName);
            return;
        }
        Log.w(TAG, "clearPendingWorkerBlobFromNative: could not obtain context for " + behaviorName);
    }

    @NotNull
    public static final Set<String> getActiveBehaviorNames(@NotNull SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "<this>");
        Set<String> stringSet = sharedPreferences.getStringSet(KEY_ACTIVE_BEHAVIORS, p001kotlin.collections.q0.d());
        return stringSet == null ? p001kotlin.collections.q0.d() : stringSet;
    }

    @NotNull
    public static final SharedPreferences getOtaPrefs(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences(OTA_PREFS_FILE, 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        return sharedPreferences;
    }

    public static /* synthetic */ void getPromotedBehaviors$NativeShell_googleProdRelease$annotations() {
    }

    public static /* synthetic */ void getPromotionCandidates$NativeShell_googleProdRelease$annotations() {
    }

    public static /* synthetic */ void getPromotionsInFlight$NativeShell_googleProdRelease$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void logEvent$NativeShell_googleProdRelease$default(OtaConfigHandler otaConfigHandler, String str, String str2, List list, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            list = p.k();
        }
        otaConfigHandler.logEvent$NativeShell_googleProdRelease(str, str2, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean nativeCommitOtaConfig(String patchStorageKey, String perUserKeyJson);

    private static final native String nativeGetEngineVersion();

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean nativeVerifyAndPromoteBlob(String blobPath, long assetId, long assetVersion, String behaviorName);

    private final JSONObject normalizePatchConfigForStorage(JSONObject patchJson) throws JSONException {
        JSONObject jSONObject = new JSONObject(PATCH_CONFIG_DEFAULTS.toString());
        Iterator<String> itKeys = patchJson.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "keys(...)");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            jSONObject.put(next, patchJson.get(next));
        }
        return jSONObject;
    }

    public static final void onPatchLoadedFromNative(@NotNull String behaviorName, long assetId, long assetVersion) {
        Intrinsics.checkNotNullParameter(behaviorName, "behaviorName");
        Pair<Long, Long> pairRemove = promotionCandidates.remove(behaviorName);
        if (pairRemove == null) {
            return;
        }
        long jLongValue = pairRemove.a().longValue();
        long jLongValue2 = pairRemove.b().longValue();
        if (jLongValue != assetId || assetVersion < jLongValue2) {
            INSTANCE.logEvent$NativeShell_googleProdRelease("ota_promote_lost_race", "background_ota_worker", p.n(new NameValuePair("behavior_name", behaviorName), new NameValuePair("asset_id", String.valueOf(jLongValue)), new NameValuePair("asset_version", String.valueOf(jLongValue2)), new NameValuePair("loaded_asset_id", String.valueOf(assetId)), new NameValuePair("loaded_asset_version", String.valueOf(assetVersion)), new NameValuePair("promotion_in_flight", String.valueOf(!promotedBehaviors.contains(behaviorName)))));
        }
    }

    public static final void saveOtaConfigState(@NotNull String behaviorName, @NotNull String url, @NotNull String patchStorageKey, @NotNull String perUserPatchKey, @NotNull String baseUrl) {
        Object objB;
        Intrinsics.checkNotNullParameter(behaviorName, "behaviorName");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(patchStorageKey, "patchStorageKey");
        Intrinsics.checkNotNullParameter(perUserPatchKey, "perUserPatchKey");
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        try {
            n.Companion companion = n.INSTANCE;
            objB = n.b(Boolean.valueOf(h.a().O5()));
        } catch (Throwable th2) {
            n.Companion companion2 = n.INSTANCE;
            objB = n.b(o.a(th2));
        }
        Boolean bool = Boolean.FALSE;
        if (n.g(objB)) {
            objB = bool;
        }
        boolean zBooleanValue = ((Boolean) objB).booleanValue();
        if (zBooleanValue) {
            Log.w(TAG, "DEV: saveOtaConfigState KOTLIN ENTRY behaviorName=" + behaviorName + " url=" + url + " patchStorageKey=" + patchStorageKey + " perUserPatchKey=" + perUserPatchKey + " baseUrl=" + baseUrl);
        }
        Context contextF = RobloxApplication.f();
        if (contextF == null) {
            Log.w(TAG, "saveOtaConfigState: could not obtain application context");
            return;
        }
        SharedPreferences otaPrefs = getOtaPrefs(contextF);
        SharedPreferences.Editor editorEdit = otaPrefs.edit();
        Set<String> stringSet = otaPrefs.getStringSet(KEY_ACTIVE_BEHAVIORS, p001kotlin.collections.q0.d());
        if (stringSet == null) {
            stringSet = p001kotlin.collections.q0.d();
        }
        if (!stringSet.contains(behaviorName)) {
            editorEdit.putStringSet(KEY_ACTIVE_BEHAVIORS, r0.j(stringSet, behaviorName));
        }
        editorEdit.putString(KEY_CONFIG_URL_PREFIX + behaviorName, url);
        editorEdit.putString(KEY_PATCH_STORAGE_KEY_PREFIX + behaviorName, patchStorageKey);
        editorEdit.putString(KEY_PER_USER_PATCH_KEY_PREFIX + behaviorName, perUserPatchKey);
        if (baseUrl.length() > 0) {
            editorEdit.putString(KEY_BASE_URL, baseUrl);
        }
        editorEdit.apply();
        if (zBooleanValue) {
            Log.w(TAG, "DEV: saveOtaConfigState KOTLIN DONE prefsPath=" + contextF.getFilesDir().getParent() + "/shared_prefs/ota_state.xml");
        }
    }

    /* JADX INFO: renamed from: writeConfigToAppStorage-yxL6bBk$default, reason: not valid java name */
    public static /* synthetic */ Object m64writeConfigToAppStorageyxL6bBk$default(OtaConfigHandler otaConfigHandler, Context context, String str, String str2, JSONObject jSONObject, String str3, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            str3 = BuildConfig.FLAVOR;
        }
        return otaConfigHandler.m65writeConfigToAppStorageyxL6bBk(context, str, str2, jSONObject, str3);
    }

    @NotNull
    public final JSONObject buildStorageConfig(@NotNull JSONObject serverConfig) throws JSONException {
        Intrinsics.checkNotNullParameter(serverConfig, "serverConfig");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("AssetId", serverConfig.optString("assetId", BuildConfig.FLAVOR));
        jSONObject.put("AssetVersion", serverConfig.optString("assetVersion", BuildConfig.FLAVOR));
        jSONObject.put("MaxAppVersion", serverConfig.optString("maxAppVersion", "0"));
        jSONObject.put("TryoutName", serverConfig.optString("tryoutName", BuildConfig.FLAVOR));
        String strOptString = serverConfig.optString("localAssetUri", BuildConfig.FLAVOR);
        if (strOptString.length() == 0) {
            strOptString = serverConfig.optString("LocalAssetURI", BuildConfig.FLAVOR);
        }
        Intrinsics.checkNotNull(strOptString);
        if (strOptString.length() > 0) {
            jSONObject.put("LocalAssetURI", strOptString);
        }
        jSONObject.put("IsForcedUpdate", serverConfig.optBoolean("isForcedUpdate", false));
        jSONObject.put("IsDevelopmentConfig", serverConfig.optBoolean("isDevelopmentConfig", false));
        jSONObject.put("AppStorageResetId", serverConfig.optString("appStorageResetId", "0"));
        jSONObject.put("AssetsManifest", new JSONObject());
        jSONObject.put("VersionV2", serverConfig.optString("versionV2", "0"));
        jSONObject.put("DownloadSource", "worker");
        return jSONObject;
    }

    public final void clearPendingWorkerBlob(@NotNull SharedPreferences prefs, @NotNull String behaviorName) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        Intrinsics.checkNotNullParameter(behaviorName, "behaviorName");
        SharedPreferences.Editor editorEdit = prefs.edit();
        editorEdit.remove(KEY_WORKER_PENDING_PREFIX + behaviorName);
        editorEdit.apply();
    }

    @Nullable
    public final String getBaseUrl(@NotNull SharedPreferences sharedPreferences) {
        String strP1;
        Intrinsics.checkNotNullParameter(sharedPreferences, "<this>");
        String string = sharedPreferences.getString(KEY_BASE_URL, null);
        if (string == null || (strP1 = StringsKt.p1(string, '/')) == null || strP1.length() <= 0) {
            return null;
        }
        return strP1;
    }

    @Nullable
    public final Long getCachedAssetVersionFromAppStorage(@NotNull Context context, @NotNull String patchStorageKey, @NotNull String perUserPatchKey) {
        Object objB;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(patchStorageKey, "patchStorageKey");
        Intrinsics.checkNotNullParameter(perUserPatchKey, "perUserPatchKey");
        File file = new File(context.getFilesDir(), APP_STORAGE_RELATIVE_PATH);
        if (!file.exists()) {
            return null;
        }
        try {
            n.Companion companion = n.INSTANCE;
            JSONArray jSONArrayOptJSONArray = new JSONObject(new JSONObject(i.i(file, null, 1, null)).optString(patchStorageKey, "{}")).optJSONArray(perUserPatchKey);
            if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
                return null;
            }
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(0);
            long jOptLong = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optLong("AssetVersion", -1L) : -1L;
            objB = n.b(jOptLong == -1 ? null : Long.valueOf(jOptLong));
        } catch (Throwable th2) {
            n.Companion companion2 = n.INSTANCE;
            objB = n.b(o.a(th2));
        }
        return (Long) (n.g(objB) ? null : objB);
    }

    @Nullable
    public final String getConfigUrl(@NotNull SharedPreferences sharedPreferences, @NotNull String behaviorName) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "<this>");
        Intrinsics.checkNotNullParameter(behaviorName, "behaviorName");
        String string = sharedPreferences.getString(KEY_CONFIG_URL_PREFIX + behaviorName, null);
        if (string == null || string.length() <= 0) {
            return null;
        }
        return string;
    }

    @Nullable
    public final String getEngineVersion() {
        Object objB;
        try {
            n.Companion companion = n.INSTANCE;
            objB = n.b(nativeGetEngineVersion());
        } catch (Throwable th2) {
            n.Companion companion2 = n.INSTANCE;
            objB = n.b(o.a(th2));
        }
        if (n.g(objB)) {
            objB = null;
        }
        String str = (String) objB;
        if (str == null || str.length() <= 0) {
            return null;
        }
        return str;
    }

    @Nullable
    public final String getPatchStorageKey(@NotNull SharedPreferences sharedPreferences, @NotNull String behaviorName) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "<this>");
        Intrinsics.checkNotNullParameter(behaviorName, "behaviorName");
        String string = sharedPreferences.getString(KEY_PATCH_STORAGE_KEY_PREFIX + behaviorName, null);
        if (string == null || string.length() <= 0) {
            return null;
        }
        return string;
    }

    @Nullable
    public final Long getPendingWorkerBlobVersion(@NotNull SharedPreferences prefs, @NotNull String behaviorName) {
        String str;
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        Intrinsics.checkNotNullParameter(behaviorName, "behaviorName");
        String string = prefs.getString(KEY_WORKER_PENDING_PREFIX + behaviorName, null);
        if (string == null || (str = (String) CollectionsKt.f0(StringsKt.split$default(string, new String[]{":"}, false, 0, 6, null), 1)) == null) {
            return null;
        }
        return StringsKt.t(str);
    }

    @Nullable
    public final String getPerUserPatchKey(@NotNull SharedPreferences sharedPreferences, @NotNull String behaviorName) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "<this>");
        Intrinsics.checkNotNullParameter(behaviorName, "behaviorName");
        String string = sharedPreferences.getString(KEY_PER_USER_PATCH_KEY_PREFIX + behaviorName, null);
        if (string == null || string.length() <= 0) {
            return null;
        }
        return string;
    }

    @NotNull
    public final Set<String> getPromotedBehaviors$NativeShell_googleProdRelease() {
        return promotedBehaviors;
    }

    @NotNull
    public final ConcurrentHashMap<String, Pair<Long, Long>> getPromotionCandidates$NativeShell_googleProdRelease() {
        return promotionCandidates;
    }

    @NotNull
    public final Set<String> getPromotionsInFlight$NativeShell_googleProdRelease() {
        return promotionsInFlight;
    }

    @Nullable
    public final JSONObject getStoredConfigJson(@NotNull SharedPreferences sharedPreferences, @NotNull String behaviorName) {
        Object objB;
        Intrinsics.checkNotNullParameter(sharedPreferences, "<this>");
        Intrinsics.checkNotNullParameter(behaviorName, "behaviorName");
        String string = sharedPreferences.getString(KEY_CONFIG_JSON_PREFIX + behaviorName, null);
        if (string == null) {
            return null;
        }
        if (string.length() <= 0) {
            string = null;
        }
        if (string == null) {
            return null;
        }
        try {
            n.Companion companion = n.INSTANCE;
            objB = n.b(new JSONObject(string));
        } catch (Throwable th2) {
            n.Companion companion2 = n.INSTANCE;
            objB = n.b(o.a(th2));
        }
        return (JSONObject) (n.g(objB) ? null : objB);
    }

    public final void logEvent$NativeShell_googleProdRelease(@NotNull String eventName, @NotNull String ctx, @NotNull List<? extends NameValuePair> extraParams) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(extraParams, "extraParams");
        try {
            n.Companion companion = n.INSTANCE;
            eh.o.c(eventName, ctx, CollectionsKt.w0(p001kotlin.collections.o.d(new NameValuePair("elapsed_realtime_ms", String.valueOf(SystemClock.elapsedRealtime()))), extraParams), false);
            n.b(Unit.f21506a);
        } catch (Throwable th2) {
            n.Companion companion2 = n.INSTANCE;
            n.b(o.a(th2));
        }
    }

    public final void trackPromotionFinished$NativeShell_googleProdRelease(@NotNull String behaviorName, boolean promoted) {
        Intrinsics.checkNotNullParameter(behaviorName, "behaviorName");
        if (promoted) {
            promotedBehaviors.add(behaviorName);
        } else {
            promotionCandidates.remove(behaviorName);
        }
        promotionsInFlight.remove(behaviorName);
    }

    public final boolean trackPromotionStarted$NativeShell_googleProdRelease(@NotNull String behaviorName, long assetId, long assetVersion) {
        Intrinsics.checkNotNullParameter(behaviorName, "behaviorName");
        if (!promotionsInFlight.add(behaviorName)) {
            return false;
        }
        promotionCandidates.put(behaviorName, s.a(Long.valueOf(assetId), Long.valueOf(assetVersion)));
        return true;
    }

    @NotNull
    /* JADX INFO: renamed from: writeConfigToAppStorage-yxL6bBk, reason: not valid java name */
    public final synchronized Object m65writeConfigToAppStorageyxL6bBk(@NotNull Context context, @NotNull String patchStorageKey, @NotNull String perUserPatchKey, @NotNull JSONObject patchConfigJson, @NotNull String workerId) {
        Object objB;
        JSONObject jSONObject;
        String str;
        JSONObject jSONObjectOptJSONObject;
        String strOptString;
        Long lT;
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(patchStorageKey, "patchStorageKey");
            Intrinsics.checkNotNullParameter(perUserPatchKey, "perUserPatchKey");
            Intrinsics.checkNotNullParameter(patchConfigJson, "patchConfigJson");
            Intrinsics.checkNotNullParameter(workerId, "workerId");
            File file = new File(context.getFilesDir(), APP_STORAGE_RELATIVE_PATH);
            try {
                n.Companion companion = n.INSTANCE;
                objB = n.b(Boolean.valueOf(h.a().O5()));
            } catch (Throwable th2) {
                n.Companion companion2 = n.INSTANCE;
                objB = n.b(o.a(th2));
            }
            Boolean bool = Boolean.FALSE;
            if (n.g(objB)) {
                objB = bool;
            }
            if (((Boolean) objB).booleanValue()) {
                Log.w(TAG, "DEV: writeConfigToAppStorage path=" + file.getAbsolutePath() + " exists=" + file.exists() + " patchStorageKey=" + patchStorageKey + " perUserPatchKey=" + perUserPatchKey + " AssetVersion=" + patchConfigJson.optString("AssetVersion"));
            }
            if (!file.exists()) {
                Log.w(TAG, "writeConfigToAppStorage: AppStorage.json not found — config not written");
                return n.b(Unit.f21506a);
            }
            try {
                JSONObject jSONObject2 = new JSONObject(i.i(file, null, 1, null));
                try {
                    jSONObject = new JSONObject(jSONObject2.optString(patchStorageKey, "{}"));
                } catch (Exception unused) {
                    jSONObject = new JSONObject();
                }
                String strOptString2 = patchConfigJson.optString("AssetVersion", "-1");
                Intrinsics.checkNotNullExpressionValue(strOptString2, "optString(...)");
                Long lT2 = StringsKt.t(strOptString2);
                long jLongValue = -1;
                long jLongValue2 = lT2 != null ? lT2.longValue() : -1L;
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(perUserPatchKey);
                if (jSONArrayOptJSONArray != null && (jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(0)) != null && (strOptString = jSONObjectOptJSONObject.optString("AssetVersion", "-1")) != null && (lT = StringsKt.t(strOptString)) != null) {
                    jLongValue = lT.longValue();
                }
                if (jLongValue2 >= 0 && jLongValue >= 0 && jLongValue > jLongValue2) {
                    Log.i(TAG, "writeConfigToAppStorage: skipping — stored v" + jLongValue + " > candidate v" + jLongValue2 + " key=" + patchStorageKey);
                    n.Companion companion3 = n.INSTANCE;
                    return n.b(Unit.f21506a);
                }
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(INSTANCE.normalizePatchConfigForStorage(patchConfigJson));
                Unit unit = Unit.f21506a;
                jSONObject.put(perUserPatchKey, jSONArray);
                jSONObject2.put(patchStorageKey, jSONObject.toString());
                jSONObject2.put(LEGACY_PATCH_CONFIG_KEY, BuildConfig.FLAVOR);
                if (workerId.length() > 0) {
                    str = ".tmp." + workerId;
                } else {
                    str = ".tmp";
                }
                File file2 = new File(file.getParent(), file.getName() + str);
                try {
                    String string = jSONObject2.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                    i.k(file2, string, null, 2, null);
                    if (file2.renameTo(file)) {
                        Log.i(TAG, "writeConfigToAppStorage: wrote directly to AppStorage.json patchStorageKey=" + patchStorageKey);
                        n.Companion companion4 = n.INSTANCE;
                        return n.b(Unit.f21506a);
                    }
                    file2.delete();
                    n.Companion companion5 = n.INSTANCE;
                    return n.b(o.a(new IOException("rename to " + file.getName() + " failed")));
                } catch (Exception e10) {
                    file2.delete();
                    n.Companion companion6 = n.INSTANCE;
                    return n.b(o.a(e10));
                }
            } catch (Exception e11) {
                n.Companion companion7 = n.INSTANCE;
                return n.b(o.a(e11));
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }
}
