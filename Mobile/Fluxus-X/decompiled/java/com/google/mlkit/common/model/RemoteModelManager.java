package com.google.mlkit.common.model;

import ag.b;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.model.RemoteModelManagerInterface;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import o9.s;
import tb.m;

/* JADX INFO: loaded from: classes2.dex */
public class RemoteModelManager {
    private final Map zza = new HashMap();

    public static class RemoteModelManagerRegistration {
        private final Class zza;
        private final b zzb;

        public <RemoteT extends RemoteModel> RemoteModelManagerRegistration(@NonNull Class<RemoteT> cls, @NonNull b<? extends RemoteModelManagerInterface<RemoteT>> bVar) {
            this.zza = cls;
            this.zzb = bVar;
        }

        public final b zza() {
            return this.zzb;
        }

        public final Class zzb() {
            return this.zza;
        }
    }

    public RemoteModelManager(@NonNull Set<RemoteModelManagerRegistration> set) {
        for (RemoteModelManagerRegistration remoteModelManagerRegistration : set) {
            this.zza.put(remoteModelManagerRegistration.zzb(), remoteModelManagerRegistration.zza());
        }
    }

    @NonNull
    public static synchronized RemoteModelManager getInstance() {
        return (RemoteModelManager) MlKitContext.getInstance().get(RemoteModelManager.class);
    }

    private final RemoteModelManagerInterface zza(Class cls) {
        return (RemoteModelManagerInterface) ((b) s.l((b) this.zza.get(cls))).get();
    }

    @NonNull
    public Task<Void> deleteDownloadedModel(@NonNull RemoteModel remoteModel) {
        s.m(remoteModel, "RemoteModel cannot be null");
        return zza(remoteModel.getClass()).deleteDownloadedModel(remoteModel);
    }

    @NonNull
    public Task<Void> download(@NonNull RemoteModel remoteModel, @NonNull DownloadConditions downloadConditions) {
        s.m(remoteModel, "RemoteModel cannot be null");
        s.m(downloadConditions, "DownloadConditions cannot be null");
        if (this.zza.containsKey(remoteModel.getClass())) {
            return zza(remoteModel.getClass()).download(remoteModel, downloadConditions);
        }
        return m.e(new MlKitException("Feature model '" + remoteModel.getClass().getSimpleName() + "' doesn't have a corresponding modelmanager registered.", 13));
    }

    @NonNull
    public <T extends RemoteModel> Task<Set<T>> getDownloadedModels(@NonNull Class<T> cls) {
        return ((RemoteModelManagerInterface) ((b) s.l((b) this.zza.get(cls))).get()).getDownloadedModels();
    }

    @NonNull
    public Task<Boolean> isModelDownloaded(@NonNull RemoteModel remoteModel) {
        s.m(remoteModel, "RemoteModel cannot be null");
        return zza(remoteModel.getClass()).isModelDownloaded(remoteModel);
    }
}
