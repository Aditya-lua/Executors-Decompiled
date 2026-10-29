package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1bSDK {

    @Nullable
    private final PackageManager AFKeystoreWrapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Map<String, Object> f5334d;

    @NotNull
    private final String registerClient;

    public AFf1bSDK(@NotNull AFd1zSDK aFd1zSDK, @NotNull AFc1iSDK aFc1iSDK) {
        Intrinsics.checkNotNullParameter(aFd1zSDK, "");
        Intrinsics.checkNotNullParameter(aFc1iSDK, "");
        this.f5334d = new LinkedHashMap();
        Context context = aFd1zSDK.f5305d;
        this.AFKeystoreWrapper = context != null ? context.getPackageManager() : null;
        String packageName = aFc1iSDK.f5258d.f5305d.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "");
        this.registerClient = packageName;
    }

    private final Map<String, Object> AFLogger() {
        InstallSourceInfo installSourceInfo;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            String str = this.registerClient;
            PackageManager packageManager = this.AFKeystoreWrapper;
            if (packageManager != null && (installSourceInfo = packageManager.getInstallSourceInfo(str)) != null) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                String initiatingPackageName = installSourceInfo.getInitiatingPackageName();
                if (initiatingPackageName != null) {
                    linkedHashMap2.put("initiating_package", initiatingPackageName);
                }
                String installingPackageName = installSourceInfo.getInstallingPackageName();
                if (installingPackageName != null) {
                    linkedHashMap2.put("installing_package", installingPackageName);
                }
                String originatingPackageName = installSourceInfo.getOriginatingPackageName();
                if (originatingPackageName != null) {
                    linkedHashMap2.put("originating_package", originatingPackageName);
                }
                return linkedHashMap2;
            }
        } catch (Throwable unused) {
        }
        return linkedHashMap;
    }

    @NotNull
    public final Map<String, Object> AFKeystoreWrapper() {
        String installerPackageName;
        if (this.f5334d.isEmpty()) {
            try {
                PackageManager packageManager = this.AFKeystoreWrapper;
                if (packageManager != null && (installerPackageName = packageManager.getInstallerPackageName(this.registerClient)) != null) {
                    this.f5334d.put("installer_package", installerPackageName);
                }
            } catch (Throwable unused) {
            }
            if (Build.VERSION.SDK_INT >= 30) {
                this.f5334d.put("install_source_info", AFLogger());
            }
        }
        return this.f5334d;
    }
}
