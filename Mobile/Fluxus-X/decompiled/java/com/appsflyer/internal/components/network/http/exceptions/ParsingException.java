package com.appsflyer.internal.components.network.http.exceptions;

import androidx.annotation.NonNull;
import com.appsflyer.internal.AFd1fSDK;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class ParsingException extends IOException {

    @NonNull
    private final AFd1fSDK<String> AFKeystoreWrapper;

    public ParsingException(String str, Throwable th2, @NonNull AFd1fSDK<String> aFd1fSDK) {
        super(str, th2);
        this.AFKeystoreWrapper = aFd1fSDK;
    }

    @NonNull
    public AFd1fSDK<String> getRawResponse() {
        return this.AFKeystoreWrapper;
    }
}
