package com.google.mlkit.common.sdkinternal.model;

import androidx.annotation.NonNull;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.Constants;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.ModelType;
import java.io.File;
import p305n9.C8935g;
import p305n9.C8953m;

/* JADX INFO: loaded from: classes2.dex */
public class ModelFileHelper {
    public static final int INVALID_INDEX = -1;
    private final MlKitContext zze;
    private static final C8935g zzd = new C8935g("ModelFileHelper", "");

    @NonNull
    public static final String zza = String.format("com.google.mlkit.%s.models", "translate");

    @NonNull
    public static final String zzb = String.format("com.google.mlkit.%s.models", Payload.CUSTOM);
    static final String zzc = String.format("com.google.mlkit.%s.models", "base");

    public ModelFileHelper(@NonNull MlKitContext mlKitContext) {
        this.zze = mlKitContext;
    }

    private final File zzc(@NonNull String str, @NonNull ModelType modelType, boolean z10) throws MlKitException {
        File modelDirUnsafe = getModelDirUnsafe(str, modelType, z10);
        if (!modelDirUnsafe.exists()) {
            zzd.m36002b("ModelFileHelper", "model folder does not exist, creating one: ".concat(String.valueOf(modelDirUnsafe.getAbsolutePath())));
            if (!modelDirUnsafe.mkdirs()) {
                throw new MlKitException("Failed to create model folder: ".concat(String.valueOf(modelDirUnsafe)), 13);
            }
        } else if (!modelDirUnsafe.isDirectory()) {
            throw new MlKitException("Can not create model folder, since an existing file has the same name: ".concat(String.valueOf(modelDirUnsafe)), 6);
        }
        return modelDirUnsafe;
    }

    public synchronized void deleteAllModels(@NonNull ModelType modelType, @NonNull String str) {
        deleteRecursively(getModelDirUnsafe(str, modelType, false));
        deleteRecursively(getModelDirUnsafe(str, modelType, true));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002c  */
    /* JADX WARN: Code duplicated, block: B:19:0x0032 A[RETURN] */
    public boolean deleteRecursively(File file) {
        if (file == null) {
            return false;
        }
        if (file.isDirectory()) {
            boolean z10 = true;
            for (File file2 : (File[]) C8953m.m36047l(file.listFiles())) {
                z10 = z10 && deleteRecursively(file2);
            }
            if (z10) {
                if (file.delete()) {
                    return true;
                }
            }
        } else if (file.delete()) {
            return true;
        }
        return false;
    }

    public void deleteTempFilesInPrivateFolder(@NonNull String str, @NonNull ModelType modelType) throws MlKitException {
        File fileZzc = zzc(str, modelType, true);
        if (deleteRecursively(fileZzc)) {
            return;
        }
        zzd.m36004d("ModelFileHelper", "Failed to delete the temp labels file directory: ".concat(String.valueOf(fileZzc != null ? fileZzc.getAbsolutePath() : null)));
    }

    public int getLatestCachedModelVersion(@NonNull File file) {
        File[] fileArrListFiles = file.listFiles();
        int iMax = -1;
        if (fileArrListFiles != null && (fileArrListFiles.length) != 0) {
            for (File file2 : fileArrListFiles) {
                try {
                    iMax = Math.max(iMax, Integer.parseInt(file2.getName()));
                } catch (NumberFormatException unused) {
                    zzd.m36002b("ModelFileHelper", "Contains non-integer file name ".concat(String.valueOf(file2.getName())));
                }
            }
        }
        return iMax;
    }

    @NonNull
    public File getModelDir(@NonNull String str, @NonNull ModelType modelType) {
        return zzc(str, modelType, false);
    }

    @NonNull
    public File getModelDirUnsafe(@NonNull String str, @NonNull ModelType modelType, boolean z10) {
        String str2;
        ModelType modelType2 = ModelType.UNKNOWN;
        int iOrdinal = modelType.ordinal();
        if (iOrdinal == 1) {
            str2 = zzc;
        } else if (iOrdinal == 2) {
            str2 = zza;
        } else {
            if (iOrdinal != 4) {
                throw new IllegalArgumentException("Unknown model type " + modelType.name() + ". Cannot find a dir to store the downloaded model.");
            }
            str2 = zzb;
        }
        File file = new File(this.zze.getApplicationContext().getNoBackupFilesDir(), str2);
        if (z10) {
            file = new File(file, "temp");
        }
        return new File(file, str);
    }

    @NonNull
    public File getModelTempDir(@NonNull String str, @NonNull ModelType modelType) {
        return zzc(str, modelType, true);
    }

    @NonNull
    public File getTempFileInPrivateFolder(@NonNull String str, @NonNull ModelType modelType, @NonNull String str2) throws MlKitException {
        File fileZzc = zzc(str, modelType, true);
        if (fileZzc.exists() && fileZzc.isFile() && !fileZzc.delete()) {
            throw new MlKitException("Failed to delete the temp labels file: ".concat(String.valueOf(fileZzc.getAbsolutePath())), 13);
        }
        if (!fileZzc.exists()) {
            zzd.m36002b("ModelFileHelper", "Temp labels folder does not exist, creating one: ".concat(String.valueOf(fileZzc.getAbsolutePath())));
            if (!fileZzc.mkdirs()) {
                throw new MlKitException("Failed to create a directory to hold the AutoML model's labels file.", 13);
            }
        }
        return new File(fileZzc, str2);
    }

    public boolean modelExistsLocally(@NonNull String str, @NonNull ModelType modelType) {
        String strZzb;
        if (modelType == ModelType.UNKNOWN || (strZzb = zzb(str, modelType)) == null) {
            return false;
        }
        File file = new File(strZzb);
        if (!file.exists()) {
            return false;
        }
        File file2 = new File(file, Constants.MODEL_FILE_NAME);
        zzd.m36006f("ModelFileHelper", "Model file path: ".concat(String.valueOf(file2.getAbsolutePath())));
        return file2.exists();
    }

    @NonNull
    public final File zza(@NonNull String str, @NonNull ModelType modelType) {
        return zzc(str, modelType, true);
    }

    public final String zzb(@NonNull String str, @NonNull ModelType modelType) {
        File modelDir = getModelDir(str, modelType);
        int latestCachedModelVersion = getLatestCachedModelVersion(modelDir);
        if (latestCachedModelVersion == -1) {
            return null;
        }
        return modelDir.getAbsolutePath() + "/" + latestCachedModelVersion;
    }
}
