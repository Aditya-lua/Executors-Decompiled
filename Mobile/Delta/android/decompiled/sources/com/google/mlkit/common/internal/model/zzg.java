package com.google.mlkit.common.internal.model;

import com.google.android.gms.internal.mlkit_common.zzlm;
import com.google.android.gms.internal.mlkit_common.zzmh;
import com.google.android.gms.internal.mlkit_common.zzmv;
import com.google.android.gms.internal.mlkit_common.zzmw;
import com.google.android.gms.internal.mlkit_common.zzne;
import com.google.android.gms.internal.mlkit_common.zzsh;
import com.google.android.gms.internal.mlkit_common.zzsk;
import com.google.android.gms.internal.mlkit_common.zzss;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.model.CustomRemoteModel;
import com.google.mlkit.common.model.DownloadConditions;
import com.google.mlkit.common.model.RemoteModel;
import com.google.mlkit.common.sdkinternal.MLTaskExecutor;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.ModelType;
import com.google.mlkit.common.sdkinternal.model.ModelFileHelper;
import com.google.mlkit.common.sdkinternal.model.ModelInfoRetrieverInterop;
import com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager;
import com.google.mlkit.common.sdkinternal.model.RemoteModelFileManager;
import com.google.mlkit.common.sdkinternal.model.RemoteModelManagerInterface;
import java.util.Set;
import java.util.concurrent.Callable;
import sb.j;
import sb.k;
import sb.m;

/* JADX INFO: loaded from: classes2.dex */
public final class zzg implements RemoteModelManagerInterface {
    private final MlKitContext zza;
    private final zzsh zzb;

    public zzg(MlKitContext mlKitContext) {
        zzsh zzshVarZzb = zzss.zzb("common");
        this.zza = mlKitContext;
        this.zzb = zzshVarZzb;
    }

    private final RemoteModelDownloadManager zze(CustomRemoteModel customRemoteModel) {
        RemoteModelFileManager remoteModelFileManager = new RemoteModelFileManager(this.zza, customRemoteModel, null, new ModelFileHelper(this.zza), new zza(this.zza, customRemoteModel.getUniqueModelNameForPersist()));
        MlKitContext mlKitContext = this.zza;
        return RemoteModelDownloadManager.getInstance(this.zza, customRemoteModel, new ModelFileHelper(mlKitContext), remoteModelFileManager, (ModelInfoRetrieverInterop) mlKitContext.get(ModelInfoRetrieverInterop.class));
    }

    @Override // com.google.mlkit.common.sdkinternal.model.RemoteModelManagerInterface
    public final /* bridge */ /* synthetic */ Task deleteDownloadedModel(RemoteModel remoteModel) {
        final CustomRemoteModel customRemoteModel = (CustomRemoteModel) remoteModel;
        final k kVar = new k();
        MLTaskExecutor.workerThreadExecutor().execute(new Runnable() { // from class: com.google.mlkit.common.internal.model.zzb
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzb(customRemoteModel, kVar);
            }
        });
        return kVar.a().addOnCompleteListener(new OnCompleteListener() { // from class: com.google.mlkit.common.internal.model.zzc
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.zza.zzc(task);
            }
        });
    }

    @Override // com.google.mlkit.common.sdkinternal.model.RemoteModelManagerInterface
    public final /* bridge */ /* synthetic */ Task download(RemoteModel remoteModel, DownloadConditions downloadConditions) {
        final RemoteModelDownloadManager remoteModelDownloadManagerZze = zze((CustomRemoteModel) remoteModel);
        remoteModelDownloadManagerZze.setDownloadConditions(downloadConditions);
        return m.f(null).n(MLTaskExecutor.workerThreadExecutor(), new j() { // from class: com.google.mlkit.common.internal.model.zzd
            @Override // sb.j
            public final Task then(Object obj) {
                return remoteModelDownloadManagerZze.ensureModelDownloaded();
            }
        });
    }

    @Override // com.google.mlkit.common.sdkinternal.model.RemoteModelManagerInterface
    public final Task<Set<CustomRemoteModel>> getDownloadedModels() {
        return m.e(new MlKitException("Custom Remote model does not support listing downloaded models", 12));
    }

    @Override // com.google.mlkit.common.sdkinternal.model.RemoteModelManagerInterface
    public final /* bridge */ /* synthetic */ Task isModelDownloaded(RemoteModel remoteModel) {
        final CustomRemoteModel customRemoteModel = (CustomRemoteModel) remoteModel;
        return MLTaskExecutor.getInstance().scheduleCallable(new Callable() { // from class: com.google.mlkit.common.internal.model.zze
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zza(customRemoteModel);
            }
        }).addOnCompleteListener(new OnCompleteListener() { // from class: com.google.mlkit.common.internal.model.zzf
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.zza.zzd(task);
            }
        });
    }

    public final /* synthetic */ Boolean zza(CustomRemoteModel customRemoteModel) {
        return Boolean.valueOf(zze(customRemoteModel).isModelDownloadedAndValid());
    }

    public final /* synthetic */ void zzb(CustomRemoteModel customRemoteModel, k kVar) {
        try {
            new ModelFileHelper(this.zza).deleteAllModels(ModelType.CUSTOM, (String) n9.m.l(customRemoteModel.getModelName()));
            kVar.c(null);
        } catch (RuntimeException e10) {
            kVar.b(new MlKitException("Internal error has occurred when executing ML Kit tasks", 13, e10));
        }
    }

    public final /* synthetic */ void zzc(Task task) {
        boolean zIsSuccessful = task.isSuccessful();
        zzmw zzmwVar = new zzmw();
        zzlm zzlmVar = new zzlm();
        zzlmVar.zzb(zzne.CUSTOM);
        zzlmVar.zza(Boolean.valueOf(zIsSuccessful));
        zzmwVar.zze(zzlmVar.zzc());
        this.zzb.zzd(zzsk.zzf(zzmwVar), zzmv.REMOTE_MODEL_DELETE_ON_DEVICE);
    }

    public final /* synthetic */ void zzd(Task task) {
        Boolean bool = (Boolean) task.getResult();
        bool.booleanValue();
        zzmw zzmwVar = new zzmw();
        zzmh zzmhVar = new zzmh();
        zzmhVar.zzb(zzne.CUSTOM);
        zzmhVar.zza(bool);
        zzmwVar.zzg(zzmhVar.zzc());
        this.zzb.zzd(zzsk.zzf(zzmwVar), zzmv.REMOTE_MODEL_IS_DOWNLOADED);
    }
}
