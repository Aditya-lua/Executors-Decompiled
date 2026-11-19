package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.LogTag;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class AFb1rSDK {
    public final String[] AFKeystoreWrapper;

    public AFb1rSDK(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            this.AFKeystoreWrapper = null;
            return;
        }
        Pattern patternCompile = Pattern.compile("[\\w]{1,45}");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (str == null || !patternCompile.matcher(str).matches()) {
                AFLogger.INSTANCE.w(LogTag.GENERAL, "Invalid partner name: ".concat(String.valueOf(str)));
            } else {
                arrayList.add(str.toLowerCase(Locale.ROOT));
            }
        }
        if (arrayList.contains("all")) {
            this.AFKeystoreWrapper = new String[]{"all"};
        } else if (arrayList.isEmpty()) {
            this.AFKeystoreWrapper = null;
        } else {
            this.AFKeystoreWrapper = (String[]) arrayList.toArray(new String[0]);
        }
    }
}
