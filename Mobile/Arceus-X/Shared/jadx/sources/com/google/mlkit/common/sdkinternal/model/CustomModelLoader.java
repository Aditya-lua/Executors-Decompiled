package com.google.mlkit.common.sdkinternal.model;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.mlkit_common.zzsh;
import com.google.android.gms.internal.mlkit_common.zzsk;
import com.google.android.gms.internal.mlkit_common.zzss;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.model.CustomRemoteModel;
import com.google.mlkit.common.model.LocalModel;
import com.google.mlkit.common.model.RemoteModel;
import com.google.mlkit.common.sdkinternal.Constants;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.SharedPrefManager;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import p305n9.C8935g;
import p305n9.C8953m;

/* JADX INFO: loaded from: classes2.dex */
public class CustomModelLoader {
    private static final C8935g zza = new C8935g("CustomModelLoader", "");
    private static final Map zzb = new HashMap();
    private final MlKitContext zzc;
    private final LocalModel zzd;
    private final CustomRemoteModel zze;
    private final RemoteModelDownloadManager zzf;
    private final RemoteModelFileManager zzg;
    private final zzsh zzh;
    private boolean zzi;

    public interface CustomModelLoaderHelper {
        void logLoad();

        boolean tryLoad(@NonNull LocalModel localModel);
    }

    private CustomModelLoader(@NonNull MlKitContext mlKitContext, LocalModel localModel, CustomRemoteModel customRemoteModel) {
        MlKitContext mlKitContext2;
        CustomRemoteModel customRemoteModel2;
        if (customRemoteModel != null) {
            mlKitContext2 = mlKitContext;
            customRemoteModel2 = customRemoteModel;
            RemoteModelFileManager remoteModelFileManager = new RemoteModelFileManager(mlKitContext2, customRemoteModel2, null, new ModelFileHelper(mlKitContext), new com.google.mlkit.common.internal.model.zza(mlKitContext, customRemoteModel.getUniqueModelNameForPersist()));
            this.zzg = remoteModelFileManager;
            this.zzf = RemoteModelDownloadManager.getInstance(mlKitContext2, customRemoteModel2, new ModelFileHelper(mlKitContext2), remoteModelFileManager, (ModelInfoRetrieverInterop) mlKitContext2.get(ModelInfoRetrieverInterop.class));
            this.zzi = true;
        } else {
            mlKitContext2 = mlKitContext;
            customRemoteModel2 = customRemoteModel;
            this.zzg = null;
            this.zzf = null;
        }
        this.zzc = mlKitContext2;
        this.zzd = localModel;
        this.zze = customRemoteModel2;
        this.zzh = zzss.zzb("common");
    }

    @NonNull
    public static synchronized CustomModelLoader getInstance(@NonNull MlKitContext mlKitContext, LocalModel localModel, CustomRemoteModel customRemoteModel) {
        String string;
        Map map;
        try {
            string = customRemoteModel == null ? ((LocalModel) C8953m.m36047l(localModel)).toString() : customRemoteModel.getUniqueModelNameForPersist();
            map = zzb;
            if (!map.containsKey(string)) {
                map.put(string, new CustomModelLoader(mlKitContext, localModel, customRemoteModel));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (CustomModelLoader) map.get(string);
    }

    private final File zza() {
        String strZzb = ((RemoteModelFileManager) C8953m.m36047l(this.zzg)).zzb();
        if (strZzb == null) {
            zza.m36002b("CustomModelLoader", "No existing model file");
            return null;
        }
        File file = new File(strZzb);
        File[] fileArrListFiles = file.listFiles();
        return ((File[]) C8953m.m36047l(fileArrListFiles)).length == 1 ? fileArrListFiles[0] : file;
    }

    private final void zzb() {
        ((RemoteModelDownloadManager) C8953m.m36047l(this.zzf)).removeOrCancelDownload();
    }

    private static final LocalModel zzc(File file) {
        if (file.isDirectory()) {
            LocalModel.Builder builder = new LocalModel.Builder();
            builder.setAbsoluteManifestFilePath(new File(file.getAbsolutePath(), Constants.AUTOML_IMAGE_LABELING_MANIFEST_JSON_FILE_NAME).toString());
            return builder.build();
        }
        LocalModel.Builder builder2 = new LocalModel.Builder();
        builder2.setAbsoluteFilePath(file.getAbsolutePath());
        return builder2.build();
    }

    public synchronized LocalModel createLocalModelByLatestExistingModel() {
        zza.m36002b("CustomModelLoader", "Try to get the latest existing model file.");
        File fileZza = zza();
        if (fileZza == null) {
            return null;
        }
        return zzc(fileZza);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x009c A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:27:0x009e A[Catch: all -> 0x002f, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x002f, blocks: (B:3:0x0001, B:7:0x0022, B:9:0x002a, B:27:0x009e, B:13:0x0032, B:15:0x0049, B:18:0x0052, B:19:0x006b, B:21:0x0073, B:22:0x008f), top: B:32:0x0001 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:25:0x009c, please report this as an issue */
    public synchronized LocalModel createLocalModelByNewlyDownloadedModel() {
        File fileZzi;
        try {
            C8935g c8935g = zza;
            c8935g.m36002b("CustomModelLoader", "Try to get newly downloaded model file.");
            Long downloadingId = ((RemoteModelDownloadManager) C8953m.m36047l(this.zzf)).getDownloadingId();
            String downloadingModelHash = this.zzf.getDownloadingModelHash();
            if (downloadingId == null || downloadingModelHash == null) {
                c8935g.m36002b("CustomModelLoader", "No new model is downloading.");
                zzb();
            } else {
                Integer downloadingModelStatusCode = this.zzf.getDownloadingModelStatusCode();
                if (downloadingModelStatusCode == null) {
                    zzb();
                } else {
                    c8935g.m36002b("CustomModelLoader", "Download Status code: ".concat(downloadingModelStatusCode.toString()));
                    if (downloadingModelStatusCode.intValue() == 8) {
                        fileZzi = this.zzf.zzi(downloadingModelHash);
                        if (fileZzi != null) {
                            c8935g.m36002b("CustomModelLoader", "Moved the downloaded model to private folder successfully: ".concat(String.valueOf(fileZzi.getParent())));
                            this.zzf.updateLatestModelHashAndType(downloadingModelHash);
                        }
                        if (fileZzi == null) {
                            return null;
                        }
                        return zzc(fileZzi);
                    }
                    if (downloadingModelStatusCode.intValue() == 16) {
                        this.zzh.zze(zzsk.zzg(), (RemoteModel) C8953m.m36047l(this.zze), false, this.zzf.getFailureReason(downloadingId));
                        zzb();
                    }
                }
            }
            fileZzi = null;
            if (fileZzi == null) {
                return null;
            }
            return zzc(fileZzi);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void deleteLatestExistingModel() {
        File fileZza = zza();
        if (fileZza != null) {
            ((RemoteModelFileManager) C8953m.m36047l(this.zzg)).zzc(fileZza);
            SharedPrefManager.getInstance(this.zzc).clearLatestModelHash((RemoteModel) C8953m.m36047l(this.zze));
        }
    }

    public void deleteOldModels(@NonNull LocalModel localModel) {
        File parentFile = new File((String) C8953m.m36047l(localModel.getAbsoluteFilePath())).getParentFile();
        if (!((RemoteModelFileManager) C8953m.m36047l(this.zzg)).zzd((File) C8953m.m36047l(parentFile))) {
            zza.m36004d("CustomModelLoader", "Failed to delete old models");
        } else {
            zza.m36002b("CustomModelLoader", "All old models are deleted.");
            this.zzg.zza(parentFile);
        }
    }

    public synchronized void load(@NonNull CustomModelLoaderHelper customModelLoaderHelper) {
        try {
            LocalModel localModelCreateLocalModelByLatestExistingModel = this.zzd;
            if (localModelCreateLocalModelByLatestExistingModel == null) {
                localModelCreateLocalModelByLatestExistingModel = createLocalModelByNewlyDownloadedModel();
            }
            if (localModelCreateLocalModelByLatestExistingModel == null) {
                localModelCreateLocalModelByLatestExistingModel = createLocalModelByLatestExistingModel();
            }
            if (localModelCreateLocalModelByLatestExistingModel == null) {
                throw new MlKitException("Model is not available.", 14);
            }
            while (!customModelLoaderHelper.tryLoad(localModelCreateLocalModelByLatestExistingModel)) {
                if (this.zze != null) {
                    deleteLatestExistingModel();
                    localModelCreateLocalModelByLatestExistingModel = createLocalModelByLatestExistingModel();
                } else {
                    localModelCreateLocalModelByLatestExistingModel = null;
                }
                if (localModelCreateLocalModelByLatestExistingModel == null) {
                    customModelLoaderHelper.logLoad();
                    return;
                }
            }
            if (this.zze != null && this.zzi) {
                deleteOldModels((LocalModel) C8953m.m36047l(localModelCreateLocalModelByLatestExistingModel));
                this.zzi = false;
            }
            customModelLoaderHelper.logLoad();
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
