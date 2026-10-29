package com.google.mlkit.common.sdkinternal.model;

import android.app.DownloadManager;
import android.content.IntentFilter;
import android.database.Cursor;
import android.os.ParcelFileDescriptor;
import android.util.LongSparseArray;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.mlkit_common.zzmu;
import com.google.android.gms.internal.mlkit_common.zzna;
import com.google.android.gms.internal.mlkit_common.zzry;
import com.google.android.gms.internal.mlkit_common.zzsh;
import com.google.android.gms.internal.mlkit_common.zzsk;
import com.google.android.gms.internal.mlkit_common.zzss;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.model.DownloadConditions;
import com.google.mlkit.common.model.RemoteModel;
import com.google.mlkit.common.sdkinternal.CommonUtils;
import com.google.mlkit.common.sdkinternal.MLTaskExecutor;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.ModelInfo;
import com.google.mlkit.common.sdkinternal.ModelType;
import com.google.mlkit.common.sdkinternal.SharedPrefManager;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import p261l2.C7975b;
import p305n9.C8935g;
import p305n9.C8947k;
import p305n9.C8953m;
import sb.C11264k;
import sb.C11268m;

/* JADX INFO: loaded from: classes2.dex */
public class RemoteModelDownloadManager {
    private static final C8935g zza = new C8935g("ModelDownloadManager", "");
    private static final Map zzb = new HashMap();
    private final LongSparseArray zzc = new LongSparseArray();
    private final LongSparseArray zzd = new LongSparseArray();
    private final MlKitContext zze;
    private final DownloadManager zzf;
    private final RemoteModel zzg;
    private final ModelType zzh;
    private final zzsh zzi;
    private final SharedPrefManager zzj;
    private final ModelFileHelper zzk;
    private final ModelInfoRetrieverInterop zzl;
    private final RemoteModelFileManager zzm;
    private DownloadConditions zzn;

    public RemoteModelDownloadManager(@NonNull MlKitContext mlKitContext, @NonNull RemoteModel remoteModel, @NonNull ModelFileHelper modelFileHelper, @NonNull RemoteModelFileManager remoteModelFileManager, ModelInfoRetrieverInterop modelInfoRetrieverInterop, @NonNull zzsh zzshVar) {
        this.zze = mlKitContext;
        this.zzh = remoteModel.getModelType();
        this.zzg = remoteModel;
        DownloadManager downloadManager = (DownloadManager) mlKitContext.getApplicationContext().getSystemService("download");
        this.zzf = downloadManager;
        this.zzi = zzshVar;
        if (downloadManager == null) {
            zza.m36002b("ModelDownloadManager", "Download manager service is not available in the service.");
        }
        this.zzk = modelFileHelper;
        this.zzj = SharedPrefManager.getInstance(mlKitContext);
        this.zzl = modelInfoRetrieverInterop;
        this.zzm = remoteModelFileManager;
    }

    @NonNull
    public static synchronized RemoteModelDownloadManager getInstance(@NonNull MlKitContext mlKitContext, @NonNull RemoteModel remoteModel, @NonNull ModelFileHelper modelFileHelper, @NonNull RemoteModelFileManager remoteModelFileManager, ModelInfoRetrieverInterop modelInfoRetrieverInterop) {
        Map map;
        RemoteModel remoteModel2;
        try {
            map = zzb;
            if (map.containsKey(remoteModel)) {
                remoteModel2 = remoteModel;
            } else {
                remoteModel2 = remoteModel;
                map.put(remoteModel2, new RemoteModelDownloadManager(mlKitContext, remoteModel2, modelFileHelper, remoteModelFileManager, modelInfoRetrieverInterop, zzss.zzb("common")));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (RemoteModelDownloadManager) map.get(remoteModel2);
    }

    private final Task zzj(long j10) throws Throwable {
        MlKitContext mlKitContext = this.zze;
        C7975b.m33016n(mlKitContext.getApplicationContext(), zzm(j10), new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"), null, MLTaskExecutor.getInstance().getHandler(), 2);
        return zzk(j10).m42326a();
    }

    private final synchronized C11264k zzk(long j10) {
        C11264k c11264k = (C11264k) this.zzd.get(j10);
        if (c11264k != null) {
            return c11264k;
        }
        C11264k c11264k2 = new C11264k();
        this.zzd.put(j10, c11264k2);
        return c11264k2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MlKitException zzl(Long l10) {
        DownloadManager downloadManager = this.zzf;
        Cursor cursorQuery = null;
        if (downloadManager != null && l10 != null) {
            cursorQuery = downloadManager.query(new DownloadManager.Query().setFilterById(l10.longValue()));
        }
        int i10 = 13;
        String str = "Model downloading failed";
        if (cursorQuery != null && cursorQuery.moveToFirst()) {
            int i11 = cursorQuery.getInt(cursorQuery.getColumnIndex("reason"));
            if (i11 == 1006) {
                str = "Model downloading failed due to insufficient space on the device.";
                i10 = 101;
            } else {
                str = "Model downloading failed due to error code: " + i11 + " from Android DownloadManager";
            }
        }
        return new MlKitException(str, i10);
    }

    private final synchronized zzc zzm(long j10) throws Throwable {
        try {
            try {
                zzc zzcVar = (zzc) this.zzc.get(j10);
                if (zzcVar != null) {
                    return zzcVar;
                }
                zzc zzcVar2 = new zzc(this, j10, zzk(j10), null);
                this.zzc.put(j10, zzcVar2);
                return zzcVar2;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private final synchronized Long zzn(@NonNull DownloadManager.Request request, @NonNull ModelInfo modelInfo) {
        DownloadManager downloadManager = this.zzf;
        if (downloadManager == null) {
            return null;
        }
        long jEnqueue = downloadManager.enqueue(request);
        zza.m36002b("ModelDownloadManager", "Schedule a new downloading task: " + jEnqueue);
        this.zzj.setDownloadingModelInfo(jEnqueue, modelInfo);
        this.zzi.zzf(zzsk.zzg(), this.zzg, zzmu.NO_ERROR, false, modelInfo.getModelType(), zzna.SCHEDULED);
        return Long.valueOf(jEnqueue);
    }

    private final synchronized Long zzo(@NonNull ModelInfo modelInfo, @NonNull DownloadConditions downloadConditions) {
        try {
            C8953m.m36048m(downloadConditions, "DownloadConditions can not be null");
            String downloadingModelHash = this.zzj.getDownloadingModelHash(this.zzg);
            Integer downloadingModelStatusCode = getDownloadingModelStatusCode();
            if (downloadingModelHash != null && downloadingModelHash.equals(modelInfo.getModelHash()) && downloadingModelStatusCode != null) {
                Integer downloadingModelStatusCode2 = getDownloadingModelStatusCode();
                if (downloadingModelStatusCode2 == null || (downloadingModelStatusCode2.intValue() != 8 && downloadingModelStatusCode2.intValue() != 16)) {
                    zzsh zzshVar = this.zzi;
                    RemoteModel remoteModel = this.zzg;
                    zzshVar.zzf(zzsk.zzg(), remoteModel, zzmu.NO_ERROR, false, remoteModel.getModelType(), zzna.DOWNLOADING);
                }
                zza.m36002b("ModelDownloadManager", "New model is already in downloading, do nothing.");
                return null;
            }
            C8935g c8935g = zza;
            c8935g.m36002b("ModelDownloadManager", "Need to download a new model.");
            removeOrCancelDownload();
            DownloadManager.Request request = new DownloadManager.Request(modelInfo.getModelUri());
            if (this.zzk.modelExistsLocally(modelInfo.getModelNameForPersist(), modelInfo.getModelType())) {
                c8935g.m36002b("ModelDownloadManager", "Model update is enabled and have a previous downloaded model, use download condition");
                this.zzi.zzf(zzsk.zzg(), this.zzg, zzmu.NO_ERROR, false, modelInfo.getModelType(), zzna.UPDATE_AVAILABLE);
            }
            request.setRequiresCharging(downloadConditions.isChargingRequired());
            if (downloadConditions.isWifiRequired()) {
                request.setAllowedNetworkTypes(2);
            }
            return zzn(request, modelInfo);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @NonNull
    public Task<Void> ensureModelDownloaded() {
        MlKitException mlKitException;
        ModelInfo modelInfoZzg;
        this.zzi.zzf(zzsk.zzg(), this.zzg, zzmu.NO_ERROR, false, ModelType.UNKNOWN, zzna.EXPLICITLY_REQUESTED);
        Long lZzo = null;
        try {
            modelInfoZzg = zzg();
            mlKitException = null;
        } catch (MlKitException e10) {
            mlKitException = e10;
            modelInfoZzg = null;
        }
        try {
            Integer downloadingModelStatusCode = getDownloadingModelStatusCode();
            Long downloadingId = getDownloadingId();
            if (!modelExistsLocally() && (downloadingModelStatusCode == null || downloadingModelStatusCode.intValue() != 8)) {
                if (downloadingModelStatusCode != null && downloadingModelStatusCode.intValue() == 16) {
                    MlKitException mlKitExceptionZzl = zzl(downloadingId);
                    removeOrCancelDownload();
                    return C11268m.m42335e(mlKitExceptionZzl);
                }
                if (downloadingModelStatusCode == null || (!(downloadingModelStatusCode.intValue() == 4 || downloadingModelStatusCode.intValue() == 2 || downloadingModelStatusCode.intValue() == 1) || downloadingId == null || getDownloadingModelHash() == null)) {
                    if (modelInfoZzg != null) {
                        lZzo = zzo(modelInfoZzg, this.zzn);
                    }
                    return lZzo == null ? C11268m.m42335e(new MlKitException("Failed to schedule the download task", 13, mlKitException)) : zzj(lZzo.longValue());
                }
                zzsh zzshVar = this.zzi;
                zzry zzryVarZzg = zzsk.zzg();
                RemoteModel remoteModel = this.zzg;
                zzshVar.zzf(zzryVarZzg, remoteModel, zzmu.NO_ERROR, false, remoteModel.getModelType(), zzna.DOWNLOADING);
                return zzj(downloadingId.longValue());
            }
            if (modelInfoZzg != null) {
                Long lZzo2 = zzo(modelInfoZzg, this.zzn);
                if (lZzo2 != null) {
                    return zzj(lZzo2.longValue());
                }
                zza.m36006f("ModelDownloadManager", "Didn't schedule download for the updated model");
            }
            return C11268m.m42336f(null);
        } catch (MlKitException e11) {
            return C11268m.m42335e(new MlKitException("Failed to ensure the model is downloaded.", 13, e11));
        }
    }

    public synchronized ParcelFileDescriptor getDownloadedFile() {
        try {
            DownloadManager downloadManager = this.zzf;
            Long downloadingId = getDownloadingId();
            ParcelFileDescriptor parcelFileDescriptorOpenDownloadedFile = null;
            if (downloadManager == null || downloadingId == null) {
                return null;
            }
            try {
                parcelFileDescriptorOpenDownloadedFile = downloadManager.openDownloadedFile(downloadingId.longValue());
            } catch (FileNotFoundException unused) {
                zza.m36004d("ModelDownloadManager", "Downloaded file is not found");
            }
            return parcelFileDescriptorOpenDownloadedFile;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized Long getDownloadingId() {
        return this.zzj.getDownloadingModelId(this.zzg);
    }

    public synchronized String getDownloadingModelHash() {
        return this.zzj.getDownloadingModelHash(this.zzg);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0041 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0043 A[Catch: all -> 0x0047, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x000e, B:18:0x0043, B:35:0x006f, B:42:0x007c, B:41:0x0079, B:38:0x0074, B:9:0x0027, B:11:0x002d, B:22:0x0049, B:24:0x0050, B:26:0x0057, B:28:0x005d, B:30:0x0065), top: B:47:0x0001, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0049 A[Catch: all -> 0x003c, TRY_ENTER, TryCatch #2 {all -> 0x003c, blocks: (B:9:0x0027, B:11:0x002d, B:22:0x0049, B:24:0x0050, B:26:0x0057, B:28:0x005d, B:30:0x0065), top: B:50:0x0027, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x006e  */
    public synchronized Integer getDownloadingModelStatusCode() {
        Integer numValueOf;
        DownloadManager downloadManager = this.zzf;
        Long downloadingId = getDownloadingId();
        if (downloadManager != null && downloadingId != null) {
            Cursor cursorQuery = downloadManager.query(new DownloadManager.Query().setFilterById(downloadingId.longValue()));
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        numValueOf = Integer.valueOf(cursorQuery.getInt(cursorQuery.getColumnIndex(NotificationCompat.CATEGORY_STATUS)));
                    }
                    if (numValueOf == null) {
                        Integer num = (numValueOf.intValue() != 2 || numValueOf.intValue() == 4 || numValueOf.intValue() == 1 || numValueOf.intValue() == 8 || numValueOf.intValue() == 16) ? numValueOf : null;
                        cursorQuery.close();
                        return num;
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                } catch (Throwable th2) {
                    try {
                        cursorQuery.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
            numValueOf = null;
            if (numValueOf == null) {
                if (numValueOf.intValue() != 2) {
                }
                cursorQuery.close();
                return num;
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
        return null;
    }

    public int getFailureReason(@NonNull Long l10) {
        int columnIndex;
        DownloadManager downloadManager = this.zzf;
        Cursor cursorQuery = null;
        if (downloadManager != null && l10 != null) {
            cursorQuery = downloadManager.query(new DownloadManager.Query().setFilterById(l10.longValue()));
        }
        if (cursorQuery == null || !cursorQuery.moveToFirst() || (columnIndex = cursorQuery.getColumnIndex("reason")) == -1) {
            return 0;
        }
        return cursorQuery.getInt(columnIndex);
    }

    public boolean isModelDownloadedAndValid() {
        try {
            if (modelExistsLocally()) {
                return true;
            }
        } catch (MlKitException unused) {
            zza.m36002b("ModelDownloadManager", "Failed to check if the model exist locally.");
        }
        Long downloadingId = getDownloadingId();
        String downloadingModelHash = getDownloadingModelHash();
        if (downloadingId == null || downloadingModelHash == null) {
            zza.m36002b("ModelDownloadManager", "No new model is downloading.");
            removeOrCancelDownload();
            return false;
        }
        Integer downloadingModelStatusCode = getDownloadingModelStatusCode();
        zza.m36002b("ModelDownloadManager", "Download Status code: ".concat(String.valueOf(downloadingModelStatusCode)));
        if (downloadingModelStatusCode != null) {
            return C8947k.m36026b(downloadingModelStatusCode, 8) && zzi(downloadingModelHash) != null;
        }
        removeOrCancelDownload();
        return false;
    }

    public boolean modelExistsLocally() {
        return this.zzk.modelExistsLocally(this.zzg.getUniqueModelNameForPersist(), this.zzh);
    }

    public synchronized void removeOrCancelDownload() {
        try {
            DownloadManager downloadManager = this.zzf;
            Long downloadingId = getDownloadingId();
            if (downloadManager != null && downloadingId != null) {
                zza.m36002b("ModelDownloadManager", "Cancel or remove existing downloading task: ".concat(downloadingId.toString()));
                if (this.zzf.remove(downloadingId.longValue()) <= 0) {
                    if (getDownloadingModelStatusCode() == null) {
                    }
                }
                ModelFileHelper modelFileHelper = this.zzk;
                RemoteModel remoteModel = this.zzg;
                modelFileHelper.deleteTempFilesInPrivateFolder(remoteModel.getUniqueModelNameForPersist(), remoteModel.getModelType());
                this.zzj.clearDownloadingModelInfo(this.zzg);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void setDownloadConditions(@NonNull DownloadConditions downloadConditions) {
        C8953m.m36048m(downloadConditions, "DownloadConditions can not be null");
        this.zzn = downloadConditions;
    }

    public synchronized void updateLatestModelHashAndType(@NonNull String str) {
        this.zzj.setLatestModelHash(this.zzg, str);
        removeOrCancelDownload();
    }

    public final synchronized ModelInfo zzg() {
        try {
            boolean zModelExistsLocally = modelExistsLocally();
            if (zModelExistsLocally) {
                zzsh zzshVar = this.zzi;
                RemoteModel remoteModel = this.zzg;
                zzshVar.zzf(zzsk.zzg(), remoteModel, zzmu.NO_ERROR, false, remoteModel.getModelType(), zzna.LIVE);
            }
            ModelInfoRetrieverInterop modelInfoRetrieverInterop = this.zzl;
            if (modelInfoRetrieverInterop == null) {
                throw new MlKitException("Please include com.google.mlkit:linkfirebase sdk as your dependency when you try to download from Firebase.", 14);
            }
            ModelInfo modelInfoRetrieveRemoteModelInfo = modelInfoRetrieverInterop.retrieveRemoteModelInfo(this.zzg);
            if (modelInfoRetrieveRemoteModelInfo == null) {
                return null;
            }
            MlKitContext mlKitContext = this.zze;
            RemoteModel remoteModel2 = this.zzg;
            String modelHash = modelInfoRetrieveRemoteModelInfo.getModelHash();
            SharedPrefManager sharedPrefManager = SharedPrefManager.getInstance(mlKitContext);
            boolean zEquals = modelHash.equals(sharedPrefManager.getIncompatibleModelHash(remoteModel2));
            boolean z10 = false;
            boolean z11 = true;
            if (zEquals && CommonUtils.getAppVersion(mlKitContext.getApplicationContext()).equals(sharedPrefManager.getPreviousAppVersion())) {
                zza.m36004d("ModelDownloadManager", "The model is incompatible with TFLite and the app is not upgraded, do not download");
                z11 = false;
            }
            if (!zModelExistsLocally) {
                this.zzj.clearLatestModelHash(this.zzg);
            }
            boolean zEquals2 = modelInfoRetrieveRemoteModelInfo.getModelHash().equals(SharedPrefManager.getInstance(this.zze).getLatestModelHash(this.zzg));
            boolean z12 = !zEquals2;
            if (!z11) {
                z10 = z12;
            } else if (!zModelExistsLocally || !zEquals2) {
                return modelInfoRetrieveRemoteModelInfo;
            }
            if (zModelExistsLocally && (z10 ^ z11)) {
                return null;
            }
            throw new MlKitException("The model " + this.zzg.getModelName() + " is incompatible with TFLite runtime", 100);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final File zzi(@NonNull String str) {
        C8935g c8935g = zza;
        c8935g.m36002b("ModelDownloadManager", "Model downloaded successfully");
        this.zzi.zzf(zzsk.zzg(), this.zzg, zzmu.NO_ERROR, true, this.zzh, zzna.SUCCEEDED);
        ParcelFileDescriptor downloadedFile = getDownloadedFile();
        if (downloadedFile == null) {
            removeOrCancelDownload();
            return null;
        }
        c8935g.m36002b("ModelDownloadManager", "moving downloaded model from external storage to private folder.");
        try {
            return this.zzm.moveModelToPrivateFolder(downloadedFile, str, this.zzg);
        } finally {
            removeOrCancelDownload();
        }
    }
}
