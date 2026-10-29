package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import com.appsflyer.sdk_base.logger.LogTag;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public final class AFd1pSDK<ResponseBody> {
    private final AtomicBoolean AFKeystoreWrapper = new AtomicBoolean(false);
    private final ExecutorService AFLogger;

    /* JADX INFO: renamed from: d */
    private final AFd1iSDK<ResponseBody> f6914d;
    private final AFd1mSDK registerClient;
    public final AFd1oSDK unregisterClient;

    public AFd1pSDK(AFd1oSDK aFd1oSDK, ExecutorService executorService, AFd1mSDK aFd1mSDK, AFd1iSDK<ResponseBody> aFd1iSDK) {
        this.unregisterClient = aFd1oSDK;
        this.AFLogger = executorService;
        this.registerClient = aFd1mSDK;
        this.f6914d = aFd1iSDK;
    }

    public final AFd1fSDK<ResponseBody> AFKeystoreWrapper() throws ParsingException {
        if (this.AFKeystoreWrapper.getAndSet(true)) {
            throw new IllegalStateException("Http call is already executed");
        }
        AFd1fSDK<String> aFd1fSDKRegisterClient = this.registerClient.registerClient(this.unregisterClient);
        try {
            return new AFd1fSDK<>(this.f6914d.registerClient(aFd1fSDKRegisterClient.getBody()), aFd1fSDKRegisterClient.unregisterClient, aFd1fSDKRegisterClient.AFLogger, aFd1fSDKRegisterClient.f6904d, aFd1fSDKRegisterClient.AFKeystoreWrapper);
        } catch (JSONException e10) {
            AFLogger.INSTANCE.m8963e(LogTag.HTTP_CLIENT, "Could not parse raw response during execute", e10, false, false);
            throw new ParsingException(e10.getMessage(), e10, aFd1fSDKRegisterClient);
        }
    }
}
