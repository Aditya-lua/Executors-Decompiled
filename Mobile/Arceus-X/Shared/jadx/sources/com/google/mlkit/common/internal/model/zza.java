package com.google.mlkit.common.internal.model;

import androidx.annotation.NonNull;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.Constants;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.ModelType;
import com.google.mlkit.common.sdkinternal.model.ModelFileHelper;
import com.google.mlkit.common.sdkinternal.model.RemoteModelFileMover;
import java.io.File;
import p305n9.C8935g;
import p305n9.C8953m;

/* JADX INFO: loaded from: classes2.dex */
public final class zza implements RemoteModelFileMover {
    private static final C8935g zza = new C8935g("CustomModelFileMover", "");
    private final String zzb;
    private final ModelFileHelper zzc;

    public zza(@NonNull MlKitContext mlKitContext, @NonNull String str) {
        this.zzb = str;
        this.zzc = new ModelFileHelper(mlKitContext);
    }

    private static boolean zza(File file, File file2) {
        String absolutePath = file.getAbsolutePath();
        String absolutePath2 = file2.getAbsolutePath();
        if (file.renameTo(file2)) {
            zza.m36002b("CustomModelFileMover", String.format("Moved file from %s to %s successfully", absolutePath, absolutePath2));
            file2.setExecutable(false);
            file2.setWritable(false);
            return true;
        }
        C8935g c8935g = zza;
        c8935g.m36002b("CustomModelFileMover", String.format("Move file to %s failed, remove the temp file %s.", absolutePath2, absolutePath));
        if (!file.delete()) {
            c8935g.m36002b("CustomModelFileMover", "Failed to delete the temp file: ".concat(String.valueOf(absolutePath)));
        }
        return false;
    }

    @Override // com.google.mlkit.common.sdkinternal.model.RemoteModelFileMover
    public final File getModelFileDestination() {
        File modelDir = this.zzc.getModelDir(this.zzb, ModelType.CUSTOM);
        return new File(new File(modelDir, String.valueOf(this.zzc.getLatestCachedModelVersion(modelDir) + 1)), Constants.MODEL_FILE_NAME);
    }

    @Override // com.google.mlkit.common.sdkinternal.model.RemoteModelFileMover
    public final File moveAllFilesFromPrivateTempToPrivateDestination(File file) throws MlKitException {
        File file2;
        ModelFileHelper modelFileHelper = this.zzc;
        String str = this.zzb;
        ModelType modelType = ModelType.CUSTOM;
        File modelDir = modelFileHelper.getModelDir(str, modelType);
        File file3 = new File(new File(modelDir, String.valueOf(this.zzc.getLatestCachedModelVersion(modelDir) + 1)), Constants.MODEL_FILE_NAME);
        File parentFile = file3.getParentFile();
        if (parentFile != null && !parentFile.exists()) {
            ((File) C8953m.m36047l(parentFile)).mkdirs();
        }
        File file4 = null;
        if (!zza(file, file3)) {
            return null;
        }
        File tempFileInPrivateFolder = this.zzc.getTempFileInPrivateFolder(this.zzb, modelType, Constants.AUTOML_IMAGE_LABELING_LABELS_FILE_NAME);
        if (tempFileInPrivateFolder.exists()) {
            file2 = new File(parentFile, Constants.AUTOML_IMAGE_LABELING_LABELS_FILE_NAME);
            if (!zza(tempFileInPrivateFolder, file2)) {
                return null;
            }
        } else {
            file2 = null;
        }
        File tempFileInPrivateFolder2 = this.zzc.getTempFileInPrivateFolder(this.zzb, modelType, Constants.AUTOML_IMAGE_LABELING_MANIFEST_JSON_FILE_NAME);
        if (tempFileInPrivateFolder2.exists()) {
            File file5 = new File(parentFile, Constants.AUTOML_IMAGE_LABELING_MANIFEST_JSON_FILE_NAME);
            if (!zza(tempFileInPrivateFolder2, file5)) {
                return null;
            }
            file4 = file5;
        }
        return (file2 == null && file4 == null) ? file3 : parentFile;
    }
}
