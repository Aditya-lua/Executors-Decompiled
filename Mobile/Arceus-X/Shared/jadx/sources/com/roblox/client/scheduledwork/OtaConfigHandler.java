package com.roblox.client.scheduledwork;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.Keep;
import com.roblox.client.RobloxApplication;
import com.roblox.client.datastructures.NameValuePair;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7697o;
import kotlin.collections.C7699p;
import kotlin.collections.C7702q0;
import kotlin.collections.C7704r0;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p229jt.C7347n;
import p229jt.C7348o;
import p256ku.C7864g1;
import p256ku.C7882k;
import p256ku.C7910q0;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p477ut.C11964i;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;
import th.C11659h;
import vg.C12183m;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(m31664d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ7\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0014\u0010\u0015J0\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\tH\u0083 ¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u001d*\u00020\u0006H\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ \u0010!\u001a\u00020\u001a2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010 \u001a\u00020\tH\u0083 ¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020#2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&J\u001f\u0010(\u001a\u0004\u0018\u00010\u00172\u0006\u0010'\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b(\u0010)J\u001d\u0010*\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b*\u0010+J\u001b\u0010,\u001a\u0004\u0018\u00010\t*\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b,\u0010-J\u001b\u0010.\u001a\u0004\u0018\u00010\t*\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b.\u0010-J\u001b\u0010/\u001a\u0004\u0018\u00010\t*\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b/\u0010-J\u001b\u00100\u001a\u0004\u0018\u00010#*\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b0\u00101J\u0013\u00102\u001a\u0004\u0018\u00010\t*\u00020\u0006¢\u0006\u0004\b2\u00103J'\u00104\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b4\u00105J\u0015\u00107\u001a\u00020#2\u0006\u00106\u001a\u00020#¢\u0006\u0004\b7\u0010&J=\u0010=\u001a\b\u0012\u0004\u0012\u00020\u000f0:2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u00108\u001a\u00020#2\b\b\u0002\u00109\u001a\u00020\t¢\u0006\u0004\b;\u0010<J/\u0010E\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020\t2\u0006\u0010?\u001a\u00020\t2\u000e\b\u0002\u0010B\u001a\b\u0012\u0004\u0012\u00020A0@H\u0000¢\u0006\u0004\bC\u0010DR\u0014\u0010F\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010H\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\bH\u0010GR\u0014\u0010I\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\bI\u0010GR\u0014\u0010J\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\bJ\u0010GR\u0014\u0010K\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\bK\u0010GR\u0014\u0010L\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\bL\u0010GR\u0014\u0010M\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\bM\u0010GR\u0014\u0010N\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\bN\u0010GR\u0014\u0010O\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\bO\u0010GR\u0014\u0010P\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\bP\u0010GR\u0014\u0010Q\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\bQ\u0010GR\u0014\u0010R\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010S¨\u0006T"}, m31665d2 = {"Lcom/roblox/client/scheduledwork/OtaConfigHandler;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/SharedPreferences;", "getOtaPrefs", "(Landroid/content/Context;)Landroid/content/SharedPreferences;", "", "behaviorName", "url", "patchStorageKey", "perUserPatchKey", "baseUrl", "", "saveOtaConfigState", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "clearPendingWorkerBlobFromNative", "(Ljava/lang/String;)V", "checkAndPromoteWorkerBlob", "(Landroid/content/Context;Ljava/lang/String;)V", "blobPath", "", "assetId", "assetVersion", "", "nativeVerifyAndPromoteBlob", "(Ljava/lang/String;JJLjava/lang/String;)Z", "", "getActiveBehaviorNames", "(Landroid/content/SharedPreferences;)Ljava/util/Set;", "perUserKeyJson", "nativeCommitOtaConfig", "(Ljava/lang/String;Ljava/lang/String;)Z", "Lorg/json/JSONObject;", "patchJson", "normalizePatchConfigForStorage", "(Lorg/json/JSONObject;)Lorg/json/JSONObject;", "prefs", "getPendingWorkerBlobVersion", "(Landroid/content/SharedPreferences;Ljava/lang/String;)Ljava/lang/Long;", "clearPendingWorkerBlob", "(Landroid/content/SharedPreferences;Ljava/lang/String;)V", "getConfigUrl", "(Landroid/content/SharedPreferences;Ljava/lang/String;)Ljava/lang/String;", "getPatchStorageKey", "getPerUserPatchKey", "getStoredConfigJson", "(Landroid/content/SharedPreferences;Ljava/lang/String;)Lorg/json/JSONObject;", "getBaseUrl", "(Landroid/content/SharedPreferences;)Ljava/lang/String;", "getCachedAssetVersionFromAppStorage", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Long;", "serverConfig", "buildStorageConfig", "patchConfigJson", "workerId", "Ljt/n;", "writeConfigToAppStorage-yxL6bBk", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Object;", "writeConfigToAppStorage", "eventName", "ctx", "", "Lcom/roblox/client/datastructures/NameValuePair;", "extraParams", "logEvent$NativeShell_googleProdRelease", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "logEvent", "TAG", "Ljava/lang/String;", "KEY_ACTIVE_BEHAVIORS", "KEY_CONFIG_URL_PREFIX", "KEY_PATCH_STORAGE_KEY_PREFIX", "KEY_PER_USER_PATCH_KEY_PREFIX", "KEY_BASE_URL", "KEY_WORKER_PENDING_PREFIX", "KEY_CONFIG_JSON_PREFIX", "OTA_PREFS_FILE", "APP_STORAGE_RELATIVE_PATH", "LEGACY_PATCH_CONFIG_KEY", "PATCH_CONFIG_DEFAULTS", "Lorg/json/JSONObject;", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class OtaConfigHandler {

    @NotNull
    private static final String APP_STORAGE_RELATIVE_PATH = "appData/LocalStorage/appStorage.json";

    @NotNull
    public static final OtaConfigHandler INSTANCE = new OtaConfigHandler();

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

    /* JADX INFO: renamed from: com.roblox.client.scheduledwork.OtaConfigHandler$a */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.scheduledwork.OtaConfigHandler$checkAndPromoteWorkerBlob$1", m39664f = "OtaConfigHandler.kt", m39665l = {}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class C3250a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: A */
        public final /* synthetic */ Context f12165A;

        /* JADX INFO: renamed from: B */
        public final /* synthetic */ String f12166B;

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ JSONObject f12167C;

        /* JADX INFO: renamed from: t */
        public int f12168t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ File f12169u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ long f12170v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ long f12171w;

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ String f12172x;

        /* JADX INFO: renamed from: y */
        public final /* synthetic */ String f12173y;

        /* JADX INFO: renamed from: z */
        public final /* synthetic */ String f12174z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3250a(File file, long j10, long j11, String str, String str2, String str3, Context context, String str4, JSONObject jSONObject, InterfaceC9557b<? super C3250a> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f12169u = file;
            this.f12170v = j10;
            this.f12171w = j11;
            this.f12172x = str;
            this.f12173y = str2;
            this.f12174z = str3;
            this.f12165A = context;
            this.f12166B = str4;
            this.f12167C = jSONObject;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new C3250a(this.f12169u, this.f12170v, this.f12171w, this.f12172x, this.f12173y, this.f12174z, this.f12165A, this.f12166B, this.f12167C, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f12168t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            String absolutePath = this.f12169u.getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
            boolean zNativeVerifyAndPromoteBlob = OtaConfigHandler.nativeVerifyAndPromoteBlob(absolutePath, this.f12170v, this.f12171w, this.f12172x);
            OtaConfigHandler.INSTANCE.logEvent$NativeShell_googleProdRelease(zNativeVerifyAndPromoteBlob ? "ota_promote_success" : "ota_promote_failed", "background_ota_worker", C7699p.m31895n(new NameValuePair("behavior_name", this.f12172x), new NameValuePair("asset_id", String.valueOf(this.f12170v)), new NameValuePair("asset_version", String.valueOf(this.f12171w))));
            if (zNativeVerifyAndPromoteBlob) {
                try {
                    OtaConfigHandler.nativeCommitOtaConfig(this.f12173y, this.f12174z);
                } catch (UnsatisfiedLinkError unused) {
                }
                Object objM50802writeConfigToAppStorageyxL6bBk$default = OtaConfigHandler.m50802writeConfigToAppStorageyxL6bBk$default(OtaConfigHandler.INSTANCE, this.f12165A, this.f12173y, this.f12166B, this.f12167C, null, 16, null);
                String str = this.f12172x;
                Throwable thM30463e = C7347n.m30463e(objM50802writeConfigToAppStorageyxL6bBk$default);
                if (thM30463e != null) {
                    Log.w(OtaConfigHandler.TAG, "checkAndPromoteWorkerBlob: writeConfigToAppStorage failed for " + str + ": " + thM30463e);
                }
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((C3250a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    static {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("MaxAppVersion", "0");
        jSONObject.put("TryoutName", "");
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
        String str = (String) CollectionsKt.m31708f0(listSplit$default, 0);
        if (str == null || (lT = StringsKt.m32118t(str)) == null) {
            Log.d(TAG, "checkAndPromoteWorkerBlob: malformed pending marker for " + behaviorName + " (no assetId): '" + string + "'");
            return;
        }
        long jLongValue = lT.longValue();
        String str2 = (String) CollectionsKt.m31708f0(listSplit$default, 1);
        if (str2 == null || (lT2 = StringsKt.m32118t(str2)) == null) {
            Log.d(TAG, "checkAndPromoteWorkerBlob: malformed pending marker for " + behaviorName + " (no assetVersion): '" + string + "'");
            return;
        }
        long jLongValue2 = lT2.longValue();
        File file = new File(context.getFilesDir(), "appData/OTAWorkerBlobs/WorkerBlob_" + jLongValue + "_" + jLongValue2);
        if (!file.exists()) {
            OtaConfigHandler otaConfigHandler = INSTANCE;
            otaConfigHandler.logEvent$NativeShell_googleProdRelease("ota_promote_blob_missing", "background_ota_worker", C7699p.m31895n(new NameValuePair("behavior_name", behaviorName), new NameValuePair("asset_id", String.valueOf(jLongValue)), new NameValuePair("asset_version", String.valueOf(jLongValue2))));
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
        C7882k.m32780d(C7910q0.m32885a(C7864g1.m32644b()), null, null, new C3250a(file, jLongValue, jLongValue2, behaviorName, patchStorageKey, string2, context, perUserPatchKey, storedConfigJson, null), 3, null);
    }

    public static final void clearPendingWorkerBlobFromNative(@NotNull String behaviorName) {
        Intrinsics.checkNotNullParameter(behaviorName, "behaviorName");
        Context contextM14834f = RobloxApplication.m14834f();
        if (contextM14834f != null) {
            INSTANCE.clearPendingWorkerBlob(getOtaPrefs(contextM14834f), behaviorName);
            return;
        }
        Log.w(TAG, "clearPendingWorkerBlobFromNative: could not obtain context for " + behaviorName);
    }

    @NotNull
    public static final Set<String> getActiveBehaviorNames(@NotNull SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "<this>");
        Set<String> stringSet = sharedPreferences.getStringSet(KEY_ACTIVE_BEHAVIORS, C7702q0.m31908d());
        return stringSet == null ? C7702q0.m31908d() : stringSet;
    }

    @NotNull
    public static final SharedPreferences getOtaPrefs(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences(OTA_PREFS_FILE, 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        return sharedPreferences;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.roblox.client.scheduledwork.OtaConfigHandler */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void logEvent$NativeShell_googleProdRelease$default(OtaConfigHandler otaConfigHandler, String str, String str2, List list, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            list = C7699p.m31892k();
        }
        otaConfigHandler.logEvent$NativeShell_googleProdRelease(str, str2, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean nativeCommitOtaConfig(String patchStorageKey, String perUserKeyJson);

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

    public static final void saveOtaConfigState(@NotNull String behaviorName, @NotNull String url, @NotNull String patchStorageKey, @NotNull String perUserPatchKey, @NotNull String baseUrl) {
        Object objM30460b;
        Intrinsics.checkNotNullParameter(behaviorName, "behaviorName");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(patchStorageKey, "patchStorageKey");
        Intrinsics.checkNotNullParameter(perUserPatchKey, "perUserPatchKey");
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        try {
            C7347n.Companion companion = C7347n.INSTANCE;
            objM30460b = C7347n.m30460b(Boolean.valueOf(C11659h.m43403a().mo43494M5()));
        } catch (Throwable th2) {
            C7347n.Companion companion2 = C7347n.INSTANCE;
            objM30460b = C7347n.m30460b(C7348o.m30469a(th2));
        }
        Boolean bool = Boolean.FALSE;
        if (C7347n.m30465g(objM30460b)) {
            objM30460b = bool;
        }
        boolean zBooleanValue = ((Boolean) objM30460b).booleanValue();
        if (zBooleanValue) {
            Log.w(TAG, "DEV: saveOtaConfigState KOTLIN ENTRY behaviorName=" + behaviorName + " url=" + url + " patchStorageKey=" + patchStorageKey + " perUserPatchKey=" + perUserPatchKey + " baseUrl=" + baseUrl);
        }
        Context contextM14834f = RobloxApplication.m14834f();
        if (contextM14834f == null) {
            Log.w(TAG, "saveOtaConfigState: could not obtain application context");
            return;
        }
        SharedPreferences otaPrefs = getOtaPrefs(contextM14834f);
        SharedPreferences.Editor editorEdit = otaPrefs.edit();
        Set<String> stringSet = otaPrefs.getStringSet(KEY_ACTIVE_BEHAVIORS, C7702q0.m31908d());
        if (stringSet == null) {
            stringSet = C7702q0.m31908d();
        }
        if (!stringSet.contains(behaviorName)) {
            editorEdit.putStringSet(KEY_ACTIVE_BEHAVIORS, C7704r0.m31914j(stringSet, behaviorName));
        }
        editorEdit.putString(KEY_CONFIG_URL_PREFIX + behaviorName, url);
        editorEdit.putString(KEY_PATCH_STORAGE_KEY_PREFIX + behaviorName, patchStorageKey);
        editorEdit.putString(KEY_PER_USER_PATCH_KEY_PREFIX + behaviorName, perUserPatchKey);
        if (baseUrl.length() > 0) {
            editorEdit.putString(KEY_BASE_URL, baseUrl);
        }
        editorEdit.apply();
        if (zBooleanValue) {
            Log.w(TAG, "DEV: saveOtaConfigState KOTLIN DONE prefsPath=" + contextM14834f.getFilesDir().getParent() + "/shared_prefs/ota_state.xml");
        }
    }

    /* JADX INFO: renamed from: writeConfigToAppStorage-yxL6bBk$default, reason: not valid java name */
    public static /* synthetic */ Object m50802writeConfigToAppStorageyxL6bBk$default(OtaConfigHandler otaConfigHandler, Context context, String str, String str2, JSONObject jSONObject, String str3, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            str3 = "";
        }
        return otaConfigHandler.m50803writeConfigToAppStorageyxL6bBk(context, str, str2, jSONObject, str3);
    }

    @NotNull
    public final JSONObject buildStorageConfig(@NotNull JSONObject serverConfig) throws JSONException {
        Intrinsics.checkNotNullParameter(serverConfig, "serverConfig");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("AssetId", serverConfig.optString("assetId", ""));
        jSONObject.put("AssetVersion", serverConfig.optString("assetVersion", ""));
        jSONObject.put("MaxAppVersion", serverConfig.optString("maxAppVersion", "0"));
        jSONObject.put("TryoutName", serverConfig.optString("tryoutName", ""));
        String strOptString = serverConfig.optString("localAssetUri", "");
        if (strOptString.length() == 0) {
            strOptString = serverConfig.optString("LocalAssetURI", "");
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
        String strR1;
        Intrinsics.checkNotNullParameter(sharedPreferences, "<this>");
        String string = sharedPreferences.getString(KEY_BASE_URL, null);
        if (string == null || (strR1 = StringsKt.m32187r1(string, '/')) == null || strR1.length() <= 0) {
            return null;
        }
        return strR1;
    }

    @Nullable
    public final Long getCachedAssetVersionFromAppStorage(@NotNull Context context, @NotNull String patchStorageKey, @NotNull String perUserPatchKey) {
        Object objM30460b;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(patchStorageKey, "patchStorageKey");
        Intrinsics.checkNotNullParameter(perUserPatchKey, "perUserPatchKey");
        File file = new File(context.getFilesDir(), APP_STORAGE_RELATIVE_PATH);
        if (!file.exists()) {
            return null;
        }
        try {
            C7347n.Companion companion = C7347n.INSTANCE;
            JSONArray jSONArrayOptJSONArray = new JSONObject(new JSONObject(C11964i.m44651i(file, null, 1, null)).optString(patchStorageKey, "{}")).optJSONArray(perUserPatchKey);
            if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
                return null;
            }
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(0);
            long jOptLong = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optLong("AssetVersion", -1L) : -1L;
            objM30460b = C7347n.m30460b(jOptLong == -1 ? null : Long.valueOf(jOptLong));
        } catch (Throwable th2) {
            C7347n.Companion companion2 = C7347n.INSTANCE;
            objM30460b = C7347n.m30460b(C7348o.m30469a(th2));
        }
        return (Long) (C7347n.m30465g(objM30460b) ? null : objM30460b);
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
        if (string == null || (str = (String) CollectionsKt.m31708f0(StringsKt.split$default(string, new String[]{":"}, false, 0, 6, null), 1)) == null) {
            return null;
        }
        return StringsKt.m32118t(str);
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

    @Nullable
    public final JSONObject getStoredConfigJson(@NotNull SharedPreferences sharedPreferences, @NotNull String behaviorName) {
        Object objM30460b;
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
            C7347n.Companion companion = C7347n.INSTANCE;
            objM30460b = C7347n.m30460b(new JSONObject(string));
        } catch (Throwable th2) {
            C7347n.Companion companion2 = C7347n.INSTANCE;
            objM30460b = C7347n.m30460b(C7348o.m30469a(th2));
        }
        return (JSONObject) (C7347n.m30465g(objM30460b) ? null : objM30460b);
    }

    public final void logEvent$NativeShell_googleProdRelease(@NotNull String eventName, @NotNull String ctx, @NotNull List<? extends NameValuePair> extraParams) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(extraParams, "extraParams");
        try {
            C7347n.Companion companion = C7347n.INSTANCE;
            C12183m.m45108c(eventName, ctx, CollectionsKt.m31725w0(C7697o.m31878d(new NameValuePair("elapsed_realtime_ms", String.valueOf(SystemClock.elapsedRealtime()))), extraParams), false);
            C7347n.m30460b(Unit.f29331a);
        } catch (Throwable th2) {
            C7347n.Companion companion2 = C7347n.INSTANCE;
            C7347n.m30460b(C7348o.m30469a(th2));
        }
    }

    @NotNull
    /* JADX INFO: renamed from: writeConfigToAppStorage-yxL6bBk, reason: not valid java name */
    public final synchronized Object m50803writeConfigToAppStorageyxL6bBk(@NotNull Context context, @NotNull String patchStorageKey, @NotNull String perUserPatchKey, @NotNull JSONObject patchConfigJson, @NotNull String workerId) {
        Object objM30460b;
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
                C7347n.Companion companion = C7347n.INSTANCE;
                objM30460b = C7347n.m30460b(Boolean.valueOf(C11659h.m43403a().mo43494M5()));
            } catch (Throwable th2) {
                C7347n.Companion companion2 = C7347n.INSTANCE;
                objM30460b = C7347n.m30460b(C7348o.m30469a(th2));
            }
            Boolean bool = Boolean.FALSE;
            if (C7347n.m30465g(objM30460b)) {
                objM30460b = bool;
            }
            if (((Boolean) objM30460b).booleanValue()) {
                Log.w(TAG, "DEV: writeConfigToAppStorage path=" + file.getAbsolutePath() + " exists=" + file.exists() + " patchStorageKey=" + patchStorageKey + " perUserPatchKey=" + perUserPatchKey + " AssetVersion=" + patchConfigJson.optString("AssetVersion"));
            }
            if (!file.exists()) {
                Log.w(TAG, "writeConfigToAppStorage: AppStorage.json not found — config not written");
                return C7347n.m30460b(Unit.f29331a);
            }
            try {
                JSONObject jSONObject2 = new JSONObject(C11964i.m44651i(file, null, 1, null));
                try {
                    jSONObject = new JSONObject(jSONObject2.optString(patchStorageKey, "{}"));
                } catch (Exception unused) {
                    jSONObject = new JSONObject();
                }
                String strOptString2 = patchConfigJson.optString("AssetVersion", "-1");
                Intrinsics.checkNotNullExpressionValue(strOptString2, "optString(...)");
                Long lT2 = StringsKt.m32118t(strOptString2);
                long jLongValue = -1;
                long jLongValue2 = lT2 != null ? lT2.longValue() : -1L;
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(perUserPatchKey);
                if (jSONArrayOptJSONArray != null && (jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(0)) != null && (strOptString = jSONObjectOptJSONObject.optString("AssetVersion", "-1")) != null && (lT = StringsKt.m32118t(strOptString)) != null) {
                    jLongValue = lT.longValue();
                }
                if (jLongValue2 >= 0 && jLongValue >= 0 && jLongValue > jLongValue2) {
                    Log.i(TAG, "writeConfigToAppStorage: skipping — stored v" + jLongValue + " > candidate v" + jLongValue2 + " key=" + patchStorageKey);
                    C7347n.Companion companion3 = C7347n.INSTANCE;
                    return C7347n.m30460b(Unit.f29331a);
                }
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(INSTANCE.normalizePatchConfigForStorage(patchConfigJson));
                Unit unit = Unit.f29331a;
                jSONObject.put(perUserPatchKey, jSONArray);
                jSONObject2.put(patchStorageKey, jSONObject.toString());
                jSONObject2.put(LEGACY_PATCH_CONFIG_KEY, "");
                if (workerId.length() > 0) {
                    str = ".tmp." + workerId;
                } else {
                    str = ".tmp";
                }
                File file2 = new File(file.getParent(), file.getName() + str);
                try {
                    String string = jSONObject2.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                    C11964i.m44653k(file2, string, null, 2, null);
                    if (file2.renameTo(file)) {
                        Log.i(TAG, "writeConfigToAppStorage: wrote directly to AppStorage.json patchStorageKey=" + patchStorageKey);
                        C7347n.Companion companion4 = C7347n.INSTANCE;
                        return C7347n.m30460b(Unit.f29331a);
                    }
                    file2.delete();
                    C7347n.Companion companion5 = C7347n.INSTANCE;
                    return C7347n.m30460b(C7348o.m30469a(new IOException("rename to " + file.getName() + " failed")));
                } catch (Exception e10) {
                    file2.delete();
                    C7347n.Companion companion6 = C7347n.INSTANCE;
                    return C7347n.m30460b(C7348o.m30469a(e10));
                }
            } catch (Exception e11) {
                C7347n.Companion companion7 = C7347n.INSTANCE;
                return C7347n.m30460b(C7348o.m30469a(e11));
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }
}
