package com.google.mlkit.common.internal.model;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.mlkit_common.zzh;
import com.google.android.gms.internal.mlkit_common.zzi;
import com.google.android.gms.internal.mlkit_common.zzu;
import com.google.mlkit.common.model.LocalModel;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.SharedPrefManager;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.json.JSONException;
import org.json.JSONObject;
import p305n9.C8935g;
import p305n9.C8953m;

/* JADX INFO: loaded from: classes2.dex */
public class ModelUtils {
    private static final C8935g zza = new C8935g("ModelUtils", "");

    public static abstract class AutoMLManifest {
        @NonNull
        public abstract String getLabelsFile();

        @NonNull
        public abstract String getModelFile();

        @NonNull
        public abstract String getModelType();
    }

    public static abstract class ModelLoggingInfo {
        public static ModelLoggingInfo zza(long j10, String str, boolean z10) {
            return new AutoValue_ModelUtils_ModelLoggingInfo(j10, zzu.zzb(str), z10);
        }

        @NonNull
        public abstract String getHash();

        public abstract long getSize();

        public abstract boolean isManifestModel();
    }

    private ModelUtils() {
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0109 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static ModelLoggingInfo getModelLoggingInfo(@NonNull Context context, @NonNull LocalModel localModel) throws Throwable {
        long length;
        String string;
        Throwable th2;
        IOException e10;
        InputStream inputStreamZzb;
        String strZzc;
        String assetFilePath = localModel.getAssetFilePath();
        String absoluteFilePath = localModel.getAbsoluteFilePath();
        Uri uri = localModel.getUri();
        InputStream inputStream = null;
        if (assetFilePath != null) {
            if (localModel.isManifestFile() && (assetFilePath = zzb(context, assetFilePath, true)) == null) {
                return null;
            }
            try {
                AssetFileDescriptor assetFileDescriptorOpenFd = context.getAssets().openFd(assetFilePath);
                try {
                    length = assetFileDescriptorOpenFd.getLength();
                    assetFileDescriptorOpenFd.close();
                } catch (Throwable th3) {
                    if (assetFileDescriptorOpenFd != null) {
                        try {
                            assetFileDescriptorOpenFd.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                    }
                    throw th3;
                }
            } catch (IOException e11) {
                zza.m36005e("ModelUtils", "Failed to open model file", e11);
                return null;
            }
        } else if (absoluteFilePath != null) {
            if (localModel.isManifestFile() && (absoluteFilePath = zzb(context, absoluteFilePath, false)) == null) {
                return null;
            }
            length = new File(absoluteFilePath).length();
        } else {
            if (uri == null) {
                zza.m36004d("ModelUtils", "Local model doesn't have any valid path.");
                return null;
            }
            try {
                AssetFileDescriptor assetFileDescriptorZza = zzi.zza(context, uri, "r");
                try {
                    length = assetFileDescriptorZza.getLength();
                    assetFileDescriptorZza.close();
                } catch (Throwable th5) {
                    if (assetFileDescriptorZza != null) {
                        try {
                            assetFileDescriptorZza.close();
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                        }
                    }
                    throw th5;
                }
            } catch (IOException e12) {
                zza.m36005e("ModelUtils", "Failed to open model file", e12);
                return null;
            }
        }
        SharedPrefManager sharedPrefManager = (SharedPrefManager) MlKitContext.getInstance().get(SharedPrefManager.class);
        if (assetFilePath != null) {
            string = assetFilePath;
        } else {
            string = absoluteFilePath != null ? absoluteFilePath : ((Uri) C8953m.m36047l(uri)).toString();
        }
        String strZzb = sharedPrefManager.zzb(string, length);
        if (strZzb != null) {
            return ModelLoggingInfo.zza(length, strZzb, localModel.isManifestFile());
        }
        try {
            if (assetFilePath != null) {
                inputStreamZzb = context.getAssets().open(assetFilePath);
            } else if (absoluteFilePath != null) {
                inputStreamZzb = new FileInputStream(new File(absoluteFilePath));
            } else {
                Uri uri2 = (Uri) C8953m.m36047l(uri);
                int i10 = zzi.zza;
                inputStreamZzb = zzi.zzb(context, uri2, zzh.zza);
            }
            if (inputStreamZzb != null) {
                try {
                    try {
                        strZzc = zzc(inputStreamZzb);
                    } catch (IOException e13) {
                        e10 = e13;
                        zza.m36005e("ModelUtils", "Failed to open model file", e10);
                        if (inputStreamZzb != null) {
                            try {
                                inputStreamZzb.close();
                            } catch (IOException e14) {
                                zza.m36005e("ModelUtils", "Failed to close model file", e14);
                            }
                        }
                        return null;
                    }
                } catch (Throwable th7) {
                    th2 = th7;
                    inputStream = inputStreamZzb;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e15) {
                            zza.m36005e("ModelUtils", "Failed to close model file", e15);
                        }
                    }
                    throw th2;
                }
            } else {
                strZzc = null;
            }
            if (strZzc != null) {
                sharedPrefManager.zzc(string, length, strZzc);
            }
            ModelLoggingInfo modelLoggingInfoZza = ModelLoggingInfo.zza(length, strZzc, localModel.isManifestFile());
            if (inputStreamZzb != null) {
                try {
                    inputStreamZzb.close();
                    return modelLoggingInfoZza;
                } catch (IOException e16) {
                    zza.m36005e("ModelUtils", "Failed to close model file", e16);
                }
            }
            return modelLoggingInfoZza;
        } catch (IOException e17) {
            e10 = e17;
            inputStreamZzb = null;
        } catch (Throwable th8) {
            th2 = th8;
            if (inputStream != null) {
                inputStream.close();
            }
            throw th2;
        }
    }

    public static String getSHA256(@NonNull File file) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                String strZzc = zzc(fileInputStream);
                fileInputStream.close();
                return strZzc;
            } catch (Throwable th2) {
                try {
                    fileInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException e10) {
            zza.m36004d("ModelUtils", "Failed to create FileInputStream for model: ".concat(e10.toString()));
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
    
        if (new java.io.File(r5).exists() == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static AutoMLManifest parseManifestFile(@NonNull String str, boolean z10, @NonNull Context context) {
        byte[] bArr;
        String strValueOf = String.valueOf(str);
        C8935g c8935g = zza;
        c8935g.m36002b("ModelUtils", "Manifest file path: ".concat(strValueOf));
        if (z10) {
            try {
                InputStream inputStreamOpen = context.getAssets().open(str);
                if (inputStreamOpen != null) {
                    inputStreamOpen.close();
                }
            } catch (IOException unused) {
                zza.m36004d("ModelUtils", "Manifest file does not exist.");
                return null;
            }
        }
        try {
            if (str.isEmpty()) {
                bArr = new byte[0];
            } else {
                InputStream inputStreamOpen2 = z10 ? context.getAssets().open(str) : new FileInputStream(new File(str));
                try {
                    int iAvailable = inputStreamOpen2.available();
                    byte[] bArr2 = new byte[iAvailable];
                    inputStreamOpen2.read(bArr2, 0, iAvailable);
                    inputStreamOpen2.close();
                    bArr = bArr2;
                } catch (Throwable th2) {
                    if (inputStreamOpen2 != null) {
                        try {
                            inputStreamOpen2.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            }
            String str2 = new String(bArr, "UTF-8");
            c8935g.m36002b("ModelUtils", "Json string from the manifest file: " + str2);
            JSONObject jSONObject = new JSONObject(str2);
            return new AutoValue_ModelUtils_AutoMLManifest(jSONObject.getString("modelType"), jSONObject.getString("modelFile"), jSONObject.getString("labelsFile"));
        } catch (IOException e10) {
            e = e10;
            zza.m36005e("ModelUtils", "Error parsing the manifest file.", e);
            return null;
        } catch (JSONException e11) {
            e = e11;
            zza.m36005e("ModelUtils", "Error parsing the manifest file.", e);
            return null;
        }
    }

    public static boolean zza(@NonNull File file, @NonNull String str) {
        String sha256 = getSHA256(file);
        zza.m36002b("ModelUtils", "Calculated hash value is: ".concat(String.valueOf(sha256)));
        return str.equals(sha256);
    }

    private static String zzb(Context context, String str, boolean z10) {
        AutoMLManifest manifestFile = parseManifestFile(str, z10, context);
        if (manifestFile != null) {
            return new File(new File(str).getParent(), manifestFile.getModelFile()).toString();
        }
        zza.m36004d("ModelUtils", "Failed to parse manifest file.");
        return null;
    }

    private static String zzc(InputStream inputStream) {
        int i10;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] bArr = new byte[1048576];
            while (true) {
                int i11 = inputStream.read(bArr);
                if (i11 == -1) {
                    break;
                }
                messageDigest.update(bArr, 0, i11);
            }
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb2 = new StringBuilder();
            for (byte b : bArrDigest) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    sb2.append('0');
                }
                sb2.append(hexString);
            }
            return sb2.toString();
        } catch (IOException unused) {
            zza.m36004d("ModelUtils", "Failed to read model file");
            return null;
        } catch (NoSuchAlgorithmException unused2) {
            zza.m36004d("ModelUtils", "Do not have SHA-256 algorithm");
            return null;
        }
    }
}
