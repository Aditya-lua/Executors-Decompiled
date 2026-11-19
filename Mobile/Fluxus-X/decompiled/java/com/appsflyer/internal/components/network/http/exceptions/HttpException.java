package com.appsflyer.internal.components.network.http.exceptions;

import androidx.annotation.NonNull;
import com.appsflyer.internal.AFd1nSDK;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class HttpException extends IOException {
    private final AFd1nSDK AFKeystoreWrapper;

    public HttpException(@NonNull Throwable th2, @NonNull AFd1nSDK aFd1nSDK) {
        super(th2.getMessage(), th2);
        this.AFKeystoreWrapper = aFd1nSDK;
    }

    @NonNull
    public AFd1nSDK getMetrics() {
        return this.AFKeystoreWrapper;
    }
}
