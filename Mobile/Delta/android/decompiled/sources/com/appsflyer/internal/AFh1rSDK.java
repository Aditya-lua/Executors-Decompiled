package com.appsflyer.internal;

import com.appsflyer.migration.internal.MigrationDataProvider;

/* JADX INFO: loaded from: classes.dex */
public final class AFh1rSDK {
    public static final boolean unregisterClient() {
        try {
            MigrationDataProvider migrationDataProvider = MigrationDataProvider.INSTANCE;
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
