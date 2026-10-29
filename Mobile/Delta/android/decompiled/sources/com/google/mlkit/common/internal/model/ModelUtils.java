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
import n9.g;
import n9.m;

/* JADX INFO: loaded from: classes2.dex */
public class ModelUtils {
    private static final g zza = new g("ModelUtils", "");

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
                zza.e("ModelUtils", "Failed to open model file", e11);
                return null;
            }
        } else if (absoluteFilePath != null) {
            if (localModel.isManifestFile() && (absoluteFilePath = zzb(context, absoluteFilePath, false)) == null) {
                return null;
            }
            length = new File(absoluteFilePath).length();
        } else {
            if (uri == null) {
                zza.d("ModelUtils", "Local model doesn't have any valid path.");
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
                zza.e("ModelUtils", "Failed to open model file", e12);
                return null;
            }
        }
        SharedPrefManager sharedPrefManager = (SharedPrefManager) MlKitContext.getInstance().get(SharedPrefManager.class);
        if (assetFilePath != null) {
            string = assetFilePath;
        } else {
            string = absoluteFilePath != null ? absoluteFilePath : ((Uri) m.l(uri)).toString();
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
                Uri uri2 = (Uri) m.l(uri);
                int i10 = zzi.zza;
                inputStreamZzb = zzi.zzb(context, uri2, zzh.zza);
            }
            if (inputStreamZzb != null) {
                try {
                    try {
                        strZzc = zzc(inputStreamZzb);
                    } catch (IOException e13) {
                        e10 = e13;
                        zza.e("ModelUtils", "Failed to open model file", e10);
                        if (inputStreamZzb != null) {
                            try {
                                inputStreamZzb.close();
                            } catch (IOException e14) {
                                zza.e("ModelUtils", "Failed to close model file", e14);
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
                            zza.e("ModelUtils", "Failed to close model file", e15);
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
                    zza.e("ModelUtils", "Failed to close model file", e16);
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
            zza.d("ModelUtils", "Failed to create FileInputStream for model: ".concat(e10.toString()));
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
    
        if (new java.io.File(r5).exists() == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.mlkit.common.internal.model.ModelUtils.AutoMLManifest parseManifestFile(@androidx.annotation.NonNull java.lang.String r5, boolean r6, @androidx.annotation.NonNull android.content.Context r7) {
        /*
            java.lang.String r0 = java.lang.String.valueOf(r5)
            n9.g r1 = com.google.mlkit.common.internal.model.ModelUtils.zza
            java.lang.String r2 = "Manifest file path: "
            java.lang.String r0 = r2.concat(r0)
            java.lang.String r2 = "ModelUtils"
            r1.b(r2, r0)
            r0 = 0
            if (r6 == 0) goto L22
            android.content.res.AssetManager r3 = r7.getAssets()     // Catch: java.io.IOException -> L2d
            java.io.InputStream r3 = r3.open(r5)     // Catch: java.io.IOException -> L2d
            if (r3 == 0) goto L35
            r3.close()     // Catch: java.io.IOException -> L2d
            goto L35
        L22:
            java.io.File r3 = new java.io.File
            r3.<init>(r5)
            boolean r3 = r3.exists()
            if (r3 != 0) goto L35
        L2d:
            n9.g r5 = com.google.mlkit.common.internal.model.ModelUtils.zza
            java.lang.String r6 = "Manifest file does not exist."
            r5.d(r2, r6)
            return r0
        L35:
            boolean r3 = r5.isEmpty()     // Catch: java.io.IOException -> L3f org.json.JSONException -> L41
            r4 = 0
            if (r3 == 0) goto L43
            byte[] r5 = new byte[r4]     // Catch: java.io.IOException -> L3f org.json.JSONException -> L41
            goto L66
        L3f:
            r5 = move-exception
            goto Laa
        L41:
            r5 = move-exception
            goto Laa
        L43:
            if (r6 == 0) goto L4e
            android.content.res.AssetManager r6 = r7.getAssets()     // Catch: java.io.IOException -> L3f org.json.JSONException -> L41
            java.io.InputStream r5 = r6.open(r5)     // Catch: java.io.IOException -> L3f org.json.JSONException -> L41
            goto L59
        L4e:
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch: java.io.IOException -> L3f org.json.JSONException -> L41
            java.io.File r7 = new java.io.File     // Catch: java.io.IOException -> L3f org.json.JSONException -> L41
            r7.<init>(r5)     // Catch: java.io.IOException -> L3f org.json.JSONException -> L41
            r6.<init>(r7)     // Catch: java.io.IOException -> L3f org.json.JSONException -> L41
            r5 = r6
        L59:
            int r6 = r5.available()     // Catch: java.lang.Throwable -> L9e
            byte[] r7 = new byte[r6]     // Catch: java.lang.Throwable -> L9e
            r5.read(r7, r4, r6)     // Catch: java.lang.Throwable -> L9e
            r5.close()     // Catch: java.io.IOException -> L3f org.json.JSONException -> L41
            r5 = r7
        L66:
            java.lang.String r6 = new java.lang.String     // Catch: java.io.IOException -> L3f org.json.JSONException -> L41
            java.lang.String r7 = "UTF-8"
            r6.<init>(r5, r7)     // Catch: java.io.IOException -> L3f org.json.JSONException -> L41
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L3f org.json.JSONException -> L41
            r5.<init>()     // Catch: java.io.IOException -> L3f org.json.JSONException -> L41
            java.lang.String r7 = "Json string from the manifest file: "
            r5.append(r7)     // Catch: java.io.IOException -> L3f org.json.JSONException -> L41
            r5.append(r6)     // Catch: java.io.IOException -> L3f org.json.JSONException -> L41
            java.lang.String r5 = r5.toString()     // Catch: java.io.IOException -> L3f org.json.JSONException -> L41
            r1.b(r2, r5)     // Catch: java.io.IOException -> L3f org.json.JSONException -> L41
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.io.IOException -> L3f org.json.JSONException -> L41
            r5.<init>(r6)     // Catch: java.io.IOException -> L3f org.json.JSONException -> L41
            java.lang.String r6 = "modelType"
            java.lang.String r6 = r5.getString(r6)     // Catch: java.io.IOException -> L3f org.json.JSONException -> L41
            java.lang.String r7 = "modelFile"
            java.lang.String r7 = r5.getString(r7)     // Catch: java.io.IOException -> L3f org.json.JSONException -> L41
            java.lang.String r1 = "labelsFile"
            java.lang.String r5 = r5.getString(r1)     // Catch: java.io.IOException -> L3f org.json.JSONException -> L41
            com.google.mlkit.common.internal.model.AutoValue_ModelUtils_AutoMLManifest r1 = new com.google.mlkit.common.internal.model.AutoValue_ModelUtils_AutoMLManifest     // Catch: java.io.IOException -> L3f org.json.JSONException -> L41
            r1.<init>(r6, r7, r5)     // Catch: java.io.IOException -> L3f org.json.JSONException -> L41
            return r1
        L9e:
            r6 = move-exception
            if (r5 == 0) goto La9
            r5.close()     // Catch: java.lang.Throwable -> La5
            goto La9
        La5:
            r5 = move-exception
            r6.addSuppressed(r5)     // Catch: java.io.IOException -> L3f org.json.JSONException -> L41
        La9:
            throw r6     // Catch: java.io.IOException -> L3f org.json.JSONException -> L41
        Laa:
            n9.g r6 = com.google.mlkit.common.internal.model.ModelUtils.zza
            java.lang.String r7 = "Error parsing the manifest file."
            r6.e(r2, r7, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.common.internal.model.ModelUtils.parseManifestFile(java.lang.String, boolean, android.content.Context):com.google.mlkit.common.internal.model.ModelUtils$AutoMLManifest");
    }

    public static boolean zza(@NonNull File file, @NonNull String str) {
        String sha256 = getSHA256(file);
        zza.b("ModelUtils", "Calculated hash value is: ".concat(String.valueOf(sha256)));
        return str.equals(sha256);
    }

    private static String zzb(Context context, String str, boolean z10) {
        AutoMLManifest manifestFile = parseManifestFile(str, z10, context);
        if (manifestFile != null) {
            return new File(new File(str).getParent(), manifestFile.getModelFile()).toString();
        }
        zza.d("ModelUtils", "Failed to parse manifest file.");
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
            zza.d("ModelUtils", "Failed to read model file");
            return null;
        } catch (NoSuchAlgorithmException unused2) {
            zza.d("ModelUtils", "Do not have SHA-256 algorithm");
            return null;
        }
    }
}
