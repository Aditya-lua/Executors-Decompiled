package com.google.mlkit.common.sdkinternal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.google.mlkit.common.model.RemoteModel;
import java.util.UUID;
import lf.c;
import lf.d;
import lf.g;
import lf.r;
import n9.m;

/* JADX INFO: loaded from: classes2.dex */
public class SharedPrefManager {

    @NonNull
    public static final c<?> COMPONENT = c.c(SharedPrefManager.class).b(r.j(MlKitContext.class)).b(r.j(Context.class)).f(new g() { // from class: com.google.mlkit.common.sdkinternal.zzs
        @Override // lf.g
        public final Object create(d dVar) {
            return new SharedPrefManager((Context) dVar.a(Context.class));
        }
    }).d();

    @NonNull
    public static final String PREF_FILE = "com.google.mlkit.internal";

    @NonNull
    protected final Context zza;

    public SharedPrefManager(@NonNull Context context) {
        this.zza = context;
    }

    @NonNull
    public static SharedPrefManager getInstance(@NonNull MlKitContext mlKitContext) {
        return (SharedPrefManager) mlKitContext.get(SharedPrefManager.class);
    }

    public synchronized void clearDownloadingModelInfo(@NonNull RemoteModel remoteModel) {
        zza().edit().remove(String.format("downloading_model_id_%s", remoteModel.getUniqueModelNameForPersist())).remove(String.format("downloading_model_hash_%s", remoteModel.getUniqueModelNameForPersist())).remove(String.format("downloading_model_type_%s", getDownloadingModelHash(remoteModel))).remove(String.format("downloading_begin_time_%s", remoteModel.getUniqueModelNameForPersist())).remove(String.format("model_first_use_time_%s", remoteModel.getUniqueModelNameForPersist())).apply();
    }

    public synchronized void clearIncompatibleModelInfo(@NonNull RemoteModel remoteModel) {
        zza().edit().remove(String.format("bad_hash_%s", remoteModel.getUniqueModelNameForPersist())).remove("app_version").apply();
    }

    public synchronized void clearLatestModelHash(@NonNull RemoteModel remoteModel) {
        zza().edit().remove(String.format("current_model_hash_%s", remoteModel.getUniqueModelNameForPersist())).commit();
    }

    public synchronized String getDownloadingModelHash(@NonNull RemoteModel remoteModel) {
        return zza().getString(String.format("downloading_model_hash_%s", remoteModel.getUniqueModelNameForPersist()), null);
    }

    public synchronized Long getDownloadingModelId(@NonNull RemoteModel remoteModel) {
        long j10 = zza().getLong(String.format("downloading_model_id_%s", remoteModel.getUniqueModelNameForPersist()), -1L);
        if (j10 < 0) {
            return null;
        }
        return Long.valueOf(j10);
    }

    public synchronized String getIncompatibleModelHash(@NonNull RemoteModel remoteModel) {
        return zza().getString(String.format("bad_hash_%s", remoteModel.getUniqueModelNameForPersist()), null);
    }

    public synchronized String getLatestModelHash(@NonNull RemoteModel remoteModel) {
        return zza().getString(String.format("current_model_hash_%s", remoteModel.getUniqueModelNameForPersist()), null);
    }

    @NonNull
    public synchronized String getMlSdkInstanceId() {
        String string = zza().getString("ml_sdk_instance_id", null);
        if (string != null) {
            return string;
        }
        String string2 = UUID.randomUUID().toString();
        zza().edit().putString("ml_sdk_instance_id", string2).apply();
        return string2;
    }

    public synchronized long getModelDownloadBeginTimeMs(@NonNull RemoteModel remoteModel) {
        return zza().getLong(String.format("downloading_begin_time_%s", remoteModel.getUniqueModelNameForPersist()), 0L);
    }

    public synchronized long getModelFirstUseTimeMs(@NonNull RemoteModel remoteModel) {
        return zza().getLong(String.format("model_first_use_time_%s", remoteModel.getUniqueModelNameForPersist()), 0L);
    }

    public synchronized String getPreviousAppVersion() {
        return zza().getString("app_version", null);
    }

    public synchronized void setDownloadingModelInfo(long j10, @NonNull ModelInfo modelInfo) {
        String modelNameForPersist = modelInfo.getModelNameForPersist();
        zza().edit().putString(String.format("downloading_model_hash_%s", modelNameForPersist), modelInfo.getModelHash()).putLong(String.format("downloading_model_id_%s", modelNameForPersist), j10).putLong(String.format("downloading_begin_time_%s", modelNameForPersist), SystemClock.elapsedRealtime()).apply();
    }

    public synchronized void setIncompatibleModelInfo(@NonNull RemoteModel remoteModel, @NonNull String str, @NonNull String str2) {
        zza().edit().putString(String.format("bad_hash_%s", remoteModel.getUniqueModelNameForPersist()), str).putString("app_version", str2).apply();
    }

    public synchronized void setLatestModelHash(@NonNull RemoteModel remoteModel, @NonNull String str) {
        zza().edit().putString(String.format("current_model_hash_%s", remoteModel.getUniqueModelNameForPersist()), str).apply();
    }

    public synchronized void setModelFirstUseTimeMs(@NonNull RemoteModel remoteModel, long j10) {
        zza().edit().putLong(String.format("model_first_use_time_%s", remoteModel.getUniqueModelNameForPersist()), j10).apply();
    }

    @NonNull
    public final SharedPreferences zza() {
        return this.zza.getSharedPreferences(PREF_FILE, 0);
    }

    public final synchronized String zzb(@NonNull String str, long j10) {
        return zza().getString(String.format("cached_local_model_hash_%1s_%2s", m.l(str), Long.valueOf(j10)), null);
    }

    public final synchronized void zzc(@NonNull String str, long j10, @NonNull String str2) {
        zza().edit().putString(String.format("cached_local_model_hash_%1s_%2s", m.l(str), Long.valueOf(j10)), str2).apply();
    }
}
