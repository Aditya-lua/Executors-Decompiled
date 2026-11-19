package de;

import com.github.luben.zstd.BuildConfig;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class s0 {
    public static String a(File file) {
        if (!file.getName().endsWith(".apk")) {
            throw new IllegalArgumentException("Non-apk found in splits directory.");
        }
        String strReplaceFirst = file.getName().replaceFirst("(_\\d+)?\\.apk", BuildConfig.FLAVOR);
        if (strReplaceFirst.equals("base-master") || strReplaceFirst.equals("base-main")) {
            return BuildConfig.FLAVOR;
        }
        return strReplaceFirst.startsWith("base-") ? strReplaceFirst.replace("base-", "config.") : strReplaceFirst.replace("-", ".config.").replace(".config.master", BuildConfig.FLAVOR).replace(".config.main", BuildConfig.FLAVOR);
    }
}
