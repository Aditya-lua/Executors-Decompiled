package com.google.mlkit.vision.common.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.mlkit.common.internal.model.ModelUtils;
import com.google.mlkit.common.model.LocalModel;
import com.google.mlkit.common.sdkinternal.Constants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import n9.m;

/* JADX INFO: loaded from: classes2.dex */
public class AutoMLModelUtils {
    private AutoMLModelUtils() {
    }

    @NonNull
    public static String[] getModelAndLabelFilePaths(@NonNull Context context, @NonNull LocalModel localModel, boolean z10) throws IOException {
        String string;
        String string2 = z10 ? (String) m.l(localModel.getAssetFilePath()) : (String) m.l(localModel.getAbsoluteFilePath());
        if (localModel.isManifestFile()) {
            ModelUtils.AutoMLManifest manifestFile = ModelUtils.parseManifestFile(string2, z10, context);
            if (manifestFile == null) {
                throw new IOException("Failed to parse manifest file.");
            }
            m.r(Constants.AUTOML_IMAGE_LABELING_MODEL_TYPE.equals(manifestFile.getModelType()), "Model type should be: %s.", Constants.AUTOML_IMAGE_LABELING_MODEL_TYPE);
            string2 = new File(new File(string2).getParent(), manifestFile.getModelFile()).toString();
            string = new File(new File(string2).getParent(), manifestFile.getLabelsFile()).toString();
        } else {
            string = "";
        }
        return new String[]{string2, string};
    }

    @NonNull
    public static List<String> readLabelsFile(@NonNull Context context, @NonNull String str, boolean z10) throws IOException {
        ArrayList arrayList = new ArrayList();
        InputStream inputStreamOpen = z10 ? context.getAssets().open(str) : new FileInputStream(new File(str));
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, "UTF-8"));
            for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                arrayList.add(line);
            }
            if (inputStreamOpen != null) {
                inputStreamOpen.close();
            }
            return arrayList;
        } catch (Throwable th2) {
            if (inputStreamOpen != null) {
                try {
                    inputStreamOpen.close();
                } catch (Throwable th3) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                    } catch (Exception unused) {
                    }
                }
            }
            throw th2;
        }
    }
}
