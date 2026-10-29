package com.google.mlkit.common.sdkinternal.model;

import android.annotation.SuppressLint;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.mlkit_common.zzmu;
import com.google.android.gms.internal.mlkit_common.zzna;
import com.google.android.gms.internal.mlkit_common.zzsk;
import com.google.android.gms.internal.mlkit_common.zzss;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.internal.model.ModelUtils;
import com.google.mlkit.common.model.RemoteModel;
import com.google.mlkit.common.sdkinternal.CommonUtils;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.ModelType;
import com.google.mlkit.common.sdkinternal.SharedPrefManager;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import n9.g;

/* JADX INFO: loaded from: classes2.dex */
public class RemoteModelFileManager {
    private static final g zza = new g("RemoteModelFileManager", "");
    private final MlKitContext zzb;
    private final String zzc;
    private final ModelType zzd;
    private final ModelValidator zze;
    private final RemoteModelFileMover zzf;
    private final SharedPrefManager zzg;
    private final ModelFileHelper zzh;

    @SuppressLint({"FirebaseLambdaLast"})
    public RemoteModelFileManager(@NonNull MlKitContext mlKitContext, @NonNull RemoteModel remoteModel, ModelValidator modelValidator, @NonNull ModelFileHelper modelFileHelper, @NonNull RemoteModelFileMover remoteModelFileMover) {
        this.zzb = mlKitContext;
        ModelType modelType = remoteModel.getModelType();
        this.zzd = modelType;
        this.zzc = modelType == ModelType.TRANSLATE ? remoteModel.getModelNameForBackend() : remoteModel.getUniqueModelNameForPersist();
        this.zze = modelValidator;
        this.zzg = SharedPrefManager.getInstance(mlKitContext);
        this.zzh = modelFileHelper;
        this.zzf = remoteModelFileMover;
    }

    @NonNull
    public File getModelDirUnsafe(boolean z10) {
        return this.zzh.getModelDirUnsafe(this.zzc, this.zzd, z10);
    }

    public synchronized File moveModelToPrivateFolder(@NonNull ParcelFileDescriptor parcelFileDescriptor, @NonNull String str, @NonNull RemoteModel remoteModel) {
        File file;
        MlKitException mlKitException;
        ModelValidator modelValidator;
        try {
            file = new File(this.zzh.zza(this.zzc, this.zzd), "to_be_validated_model.tmp");
            ModelValidator.ValidationResult validationResultValidateModel = null;
            try {
                ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        byte[] bArr = new byte[Barcode.FORMAT_AZTEC];
                        while (true) {
                            int i10 = autoCloseInputStream.read(bArr);
                            if (i10 == -1) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, i10);
                            try {
                                autoCloseInputStream.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                        fileOutputStream.getFD().sync();
                        fileOutputStream.close();
                        autoCloseInputStream.close();
                        boolean zZza = ModelUtils.zza(file, str);
                        if (zZza && (modelValidator = this.zze) != null) {
                            validationResultValidateModel = modelValidator.validateModel(file, remoteModel);
                            if (validationResultValidateModel.getErrorCode().equals(ModelValidator.ValidationResult.ErrorCode.TFLITE_VERSION_INCOMPATIBLE)) {
                                String appVersion = CommonUtils.getAppVersion(this.zzb.getApplicationContext());
                                this.zzg.setIncompatibleModelInfo(remoteModel, str, appVersion);
                                String strValueOf = String.valueOf(str);
                                g gVar = zza;
                                gVar.b("RemoteModelFileManager", "Model is not compatible. Model hash: ".concat(strValueOf));
                                gVar.b("RemoteModelFileManager", "The current app version is: ".concat(String.valueOf(appVersion)));
                            }
                        }
                        if (zZza && (validationResultValidateModel == null || validationResultValidateModel.isValid())) {
                        }
                        if (zZza) {
                            mlKitException = new MlKitException("Model is not compatible with TFLite run time", 100);
                        } else {
                            zza.b("RemoteModelFileManager", "Hash does not match with expected: ".concat(String.valueOf(str)));
                            zzss.zzb("common").zzf(zzsk.zzg(), remoteModel, zzmu.MODEL_HASH_MISMATCH, true, this.zzd, zzna.SUCCEEDED);
                            mlKitException = new MlKitException("Hash does not match with expected", 102);
                        }
                        if (file.delete()) {
                            throw mlKitException;
                        }
                        zza.b("RemoteModelFileManager", "Failed to delete the temp file: ".concat(String.valueOf(file.getAbsolutePath())));
                        throw mlKitException;
                    } catch (Throwable th3) {
                        try {
                            fileOutputStream.close();
                            throw th3;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                            throw th3;
                        }
                    }
                } catch (Throwable th5) {
                    autoCloseInputStream.close();
                    throw th5;
                }
            } catch (IOException e10) {
                zza.d("RemoteModelFileManager", "Failed to copy downloaded model file to private folder: ".concat(e10.toString()));
                return null;
            }
        } catch (Throwable th6) {
            throw th6;
        }
        return this.zzf.moveAllFilesFromPrivateTempToPrivateDestination(file);
    }

    @NonNull
    public final synchronized File zza(@NonNull File file) {
        File file2 = new File(String.valueOf(this.zzh.getModelDir(this.zzc, this.zzd).getAbsolutePath()).concat("/0"));
        if (file2.exists()) {
            return file;
        }
        return file.renameTo(file2) ? file2 : file;
    }

    public final synchronized String zzb() {
        return this.zzh.zzb(this.zzc, this.zzd);
    }

    public final synchronized void zzc(@NonNull File file) {
        File[] fileArrListFiles;
        File modelDirUnsafe = getModelDirUnsafe(false);
        if (modelDirUnsafe.exists() && (fileArrListFiles = modelDirUnsafe.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.equals(file)) {
                    this.zzh.deleteRecursively(file);
                    return;
                }
            }
        }
    }

    public final synchronized boolean zzd(@NonNull File file) {
        File modelDir = this.zzh.getModelDir(this.zzc, this.zzd);
        if (!modelDir.exists()) {
            return false;
        }
        File[] fileArrListFiles = modelDir.listFiles();
        boolean z10 = true;
        if (fileArrListFiles == null) {
            return true;
        }
        for (File file2 : fileArrListFiles) {
            if (!file2.equals(file) && !this.zzh.deleteRecursively(file2)) {
                z10 = false;
            }
        }
        return z10;
    }
}
