package com.google.mlkit.common.sdkinternal.model;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.mlkit_common.zzsh;
import com.google.android.gms.internal.mlkit_common.zzsk;
import com.google.android.gms.internal.mlkit_common.zzss;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.model.RemoteModel;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.SharedPrefManager;
import java.io.File;
import java.nio.MappedByteBuffer;
import java.util.HashMap;
import java.util.Map;
import p305n9.C8935g;

/* JADX INFO: loaded from: classes2.dex */
public class RemoteModelLoader {
    private static final C8935g zza = new C8935g("RemoteModelLoader", "");
    private static final Map zzb = new HashMap();
    private final MlKitContext zzc;
    private final RemoteModel zzd;
    private final RemoteModelDownloadManager zze;
    private final RemoteModelFileManager zzf;
    private final RemoteModelLoaderHelper zzg;
    private final zzsh zzh;
    private boolean zzi;

    private RemoteModelLoader(@NonNull MlKitContext mlKitContext, @NonNull RemoteModel remoteModel, @NonNull ModelValidator modelValidator, @NonNull RemoteModelLoaderHelper remoteModelLoaderHelper, @NonNull RemoteModelFileMover remoteModelFileMover) {
        RemoteModelFileManager remoteModelFileManager = new RemoteModelFileManager(mlKitContext, remoteModel, modelValidator, new ModelFileHelper(mlKitContext), remoteModelFileMover);
        this.zzf = remoteModelFileManager;
        this.zzi = true;
        this.zze = RemoteModelDownloadManager.getInstance(mlKitContext, remoteModel, new ModelFileHelper(mlKitContext), remoteModelFileManager, (ModelInfoRetrieverInterop) mlKitContext.get(ModelInfoRetrieverInterop.class));
        this.zzg = remoteModelLoaderHelper;
        this.zzc = mlKitContext;
        this.zzd = remoteModel;
        this.zzh = zzss.zzb("common");
    }

    @NonNull
    public static synchronized RemoteModelLoader getInstance(@NonNull MlKitContext mlKitContext, @NonNull RemoteModel remoteModel, @NonNull ModelValidator modelValidator, @NonNull RemoteModelLoaderHelper remoteModelLoaderHelper, @NonNull RemoteModelFileMover remoteModelFileMover) {
        String uniqueModelNameForPersist;
        Map map;
        try {
            uniqueModelNameForPersist = remoteModel.getUniqueModelNameForPersist();
            map = zzb;
            if (!map.containsKey(uniqueModelNameForPersist)) {
                map.put(uniqueModelNameForPersist, new RemoteModelLoader(mlKitContext, remoteModel, modelValidator, remoteModelLoaderHelper, remoteModelFileMover));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (RemoteModelLoader) map.get(uniqueModelNameForPersist);
    }

    @NonNull
    private final MappedByteBuffer zza(@NonNull String str) {
        return this.zzg.loadModelAtPath(str);
    }

    private final MappedByteBuffer zzb(File file) throws MlKitException {
        try {
            return zza(file.getAbsolutePath());
        } catch (Exception e10) {
            this.zzf.zzc(file);
            throw new MlKitException("Failed to load newly downloaded model.", 14, e10);
        }
    }

    @NonNull
    public RemoteModel getRemoteModel() {
        return this.zzd;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00b8 A[Catch: all -> 0x002e, TryCatch #1 {all -> 0x002e, blocks: (B:3:0x0001, B:7:0x001e, B:9:0x0026, B:28:0x00b8, B:30:0x00c7, B:32:0x00cf, B:35:0x00d5, B:36:0x00f3, B:37:0x00f4, B:13:0x0031, B:15:0x0048, B:18:0x0051, B:20:0x006f, B:22:0x0077, B:23:0x0089, B:25:0x0091, B:26:0x00a8), top: B:45:0x0001, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00c7 A[Catch: all -> 0x002e, TRY_LEAVE, TryCatch #1 {all -> 0x002e, blocks: (B:3:0x0001, B:7:0x001e, B:9:0x0026, B:28:0x00b8, B:30:0x00c7, B:32:0x00cf, B:35:0x00d5, B:36:0x00f3, B:37:0x00f4, B:13:0x0031, B:15:0x0048, B:18:0x0051, B:20:0x006f, B:22:0x0077, B:23:0x0089, B:25:0x0091, B:26:0x00a8), top: B:45:0x0001, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00f4 A[Catch: all -> 0x002e, TRY_LEAVE, TryCatch #1 {all -> 0x002e, blocks: (B:3:0x0001, B:7:0x001e, B:9:0x0026, B:28:0x00b8, B:30:0x00c7, B:32:0x00cf, B:35:0x00d5, B:36:0x00f3, B:37:0x00f4, B:13:0x0031, B:15:0x0048, B:18:0x0051, B:20:0x006f, B:22:0x0077, B:23:0x0089, B:25:0x0091, B:26:0x00a8), top: B:45:0x0001, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00cf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public synchronized MappedByteBuffer load() {
        MappedByteBuffer mappedByteBufferZza;
        MappedByteBuffer mappedByteBufferZzb;
        String strZzb;
        try {
            C8935g c8935g = zza;
            c8935g.m36002b("RemoteModelLoader", "Try to load newly downloaded model file.");
            RemoteModelDownloadManager remoteModelDownloadManager = this.zze;
            boolean z10 = this.zzi;
            Long downloadingId = remoteModelDownloadManager.getDownloadingId();
            String downloadingModelHash = remoteModelDownloadManager.getDownloadingModelHash();
            mappedByteBufferZza = null;
            if (downloadingId == null || downloadingModelHash == null) {
                c8935g.m36002b("RemoteModelLoader", "No new model is downloading.");
                this.zze.removeOrCancelDownload();
            } else {
                Integer downloadingModelStatusCode = this.zze.getDownloadingModelStatusCode();
                if (downloadingModelStatusCode == null) {
                    this.zze.removeOrCancelDownload();
                } else {
                    c8935g.m36002b("RemoteModelLoader", "Download Status code: ".concat(downloadingModelStatusCode.toString()));
                    if (downloadingModelStatusCode.intValue() == 8) {
                        File fileZzi = this.zze.zzi(downloadingModelHash);
                        if (fileZzi != null) {
                            mappedByteBufferZzb = zzb(fileZzi);
                            c8935g.m36002b("RemoteModelLoader", "Moved the downloaded model to private folder successfully: ".concat(String.valueOf(fileZzi.getParent())));
                            this.zze.updateLatestModelHashAndType(downloadingModelHash);
                            if (z10 && this.zzf.zzd(fileZzi)) {
                                c8935g.m36002b("RemoteModelLoader", "All old models are deleted.");
                                mappedByteBufferZzb = zzb(this.zzf.zza(fileZzi));
                            }
                        }
                        if (mappedByteBufferZzb == null) {
                            c8935g.m36002b("RemoteModelLoader", "Loading existing model file.");
                            strZzb = this.zzf.zzb();
                            if (strZzb == null) {
                                c8935g.m36002b("RemoteModelLoader", "No existing model file");
                            } else {
                                try {
                                    mappedByteBufferZza = zza(strZzb);
                                } catch (Exception e10) {
                                    this.zzf.zzc(new File(strZzb));
                                    SharedPrefManager.getInstance(this.zzc).clearLatestModelHash(this.zzd);
                                    throw new MlKitException("Failed to load an already downloaded model.", 14, e10);
                                }
                            }
                        } else {
                            this.zzi = false;
                            mappedByteBufferZza = mappedByteBufferZzb;
                        }
                    } else if (downloadingModelStatusCode.intValue() == 16) {
                        this.zzh.zze(zzsk.zzg(), this.zzd, false, this.zze.getFailureReason(downloadingId));
                        this.zze.removeOrCancelDownload();
                    }
                }
            }
            mappedByteBufferZzb = null;
            if (mappedByteBufferZzb == null) {
                c8935g.m36002b("RemoteModelLoader", "Loading existing model file.");
                strZzb = this.zzf.zzb();
                if (strZzb == null) {
                    c8935g.m36002b("RemoteModelLoader", "No existing model file");
                } else {
                    mappedByteBufferZza = zza(strZzb);
                }
            } else {
                this.zzi = false;
                mappedByteBufferZza = mappedByteBufferZzb;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return mappedByteBufferZza;
    }
}
