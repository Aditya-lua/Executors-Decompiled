package com.google.mlkit.common.model;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.model.RemoteModelManagerInterface;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p305n9.C8953m;
import p575yf.InterfaceC13188b;
import sb.C11268m;

/* JADX INFO: loaded from: classes2.dex */
public class RemoteModelManager {
    private final Map zza = new HashMap();

    public static class RemoteModelManagerRegistration {
        private final Class zza;
        private final InterfaceC13188b zzb;

        public <RemoteT extends RemoteModel> RemoteModelManagerRegistration(@NonNull Class<RemoteT> cls, @NonNull InterfaceC13188b<? extends RemoteModelManagerInterface<RemoteT>> interfaceC13188b) {
            this.zza = cls;
            this.zzb = interfaceC13188b;
        }

        public final InterfaceC13188b zza() {
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
        return (RemoteModelManagerInterface) ((InterfaceC13188b) C8953m.m36047l((InterfaceC13188b) this.zza.get(cls))).get();
    }

    @NonNull
    public Task<Void> deleteDownloadedModel(@NonNull RemoteModel remoteModel) {
        C8953m.m36048m(remoteModel, "RemoteModel cannot be null");
        return zza(remoteModel.getClass()).deleteDownloadedModel(remoteModel);
    }

    @NonNull
    public Task<Void> download(@NonNull RemoteModel remoteModel, @NonNull DownloadConditions downloadConditions) {
        C8953m.m36048m(remoteModel, "RemoteModel cannot be null");
        C8953m.m36048m(downloadConditions, "DownloadConditions cannot be null");
        if (this.zza.containsKey(remoteModel.getClass())) {
            return zza(remoteModel.getClass()).download(remoteModel, downloadConditions);
        }
        return C11268m.m42335e(new MlKitException("Feature model '" + remoteModel.getClass().getSimpleName() + "' doesn't have a corresponding modelmanager registered.", 13));
    }

    @NonNull
    public <T extends RemoteModel> Task<Set<T>> getDownloadedModels(@NonNull Class<T> cls) {
        return ((RemoteModelManagerInterface) ((InterfaceC13188b) C8953m.m36047l((InterfaceC13188b) this.zza.get(cls))).get()).getDownloadedModels();
    }

    @NonNull
    public Task<Boolean> isModelDownloaded(@NonNull RemoteModel remoteModel) {
        C8953m.m36048m(remoteModel, "RemoteModel cannot be null");
        return zza(remoteModel.getClass()).isModelDownloaded(remoteModel);
    }
}
