package com.appsflyer.internal;

import android.text.TextUtils;
import android.util.Base64;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1oSDK extends AFe1ySDK<AFf1pSDK> {

    @NotNull
    private final AFc1iSDK AFLoggerLogLevel;

    @NotNull
    private final AFc1eSDK AppsFlyerLib;

    @NotNull
    private final AFf1jSDK afDebugLog;

    @NotNull
    private final AFd1sSDK afErrorLog;

    @NotNull
    private final AFf1fSDK afInfoLog;

    @NotNull
    private final AFf1kSDK afWarnLog;

    /* JADX INFO: renamed from: e */
    @Nullable
    public AFh1bSDK f6982e;

    @Nullable
    public final AFf1mSDK force;

    @NotNull
    private final String getLevel;

    /* JADX INFO: renamed from: i */
    @Nullable
    public AFf1pSDK f6983i;

    /* JADX INFO: renamed from: v */
    @NotNull
    private final AFf1nSDK f6984v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFf1oSDK(@NotNull AFf1nSDK aFf1nSDK, @NotNull AFc1iSDK aFc1iSDK, @NotNull AFf1fSDK aFf1fSDK, @NotNull AFf1jSDK aFf1jSDK, @NotNull AFd1sSDK aFd1sSDK, @NotNull AFf1kSDK aFf1kSDK, @NotNull AFc1eSDK aFc1eSDK, @NotNull String str, @Nullable AFf1mSDK aFf1mSDK) {
        super(AFd1bSDK.RC_CDN, new AFe1zSDK[0], "UpdateRemoteConfiguration");
        Intrinsics.checkNotNullParameter(aFf1nSDK, "");
        Intrinsics.checkNotNullParameter(aFc1iSDK, "");
        Intrinsics.checkNotNullParameter(aFf1fSDK, "");
        Intrinsics.checkNotNullParameter(aFf1jSDK, "");
        Intrinsics.checkNotNullParameter(aFd1sSDK, "");
        Intrinsics.checkNotNullParameter(aFf1kSDK, "");
        Intrinsics.checkNotNullParameter(aFc1eSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.f6984v = aFf1nSDK;
        this.AFLoggerLogLevel = aFc1iSDK;
        this.afInfoLog = aFf1fSDK;
        this.afDebugLog = aFf1jSDK;
        this.afErrorLog = aFd1sSDK;
        this.afWarnLog = aFf1kSDK;
        this.AppsFlyerLib = aFc1eSDK;
        this.getLevel = str;
        this.force = aFf1mSDK;
    }

    private final void AFKeystoreWrapper(AFf1xSDK aFf1xSDK) {
        long j10;
        int statusCode;
        Throwable cause;
        long j11;
        AFd1fSDK<?> aFd1fSDK = aFf1xSDK.f6991d;
        if (aFd1fSDK != null) {
            j10 = aFd1fSDK.AFKeystoreWrapper.registerClient;
            statusCode = aFd1fSDK.getStatusCode();
        } else {
            j10 = 0;
            statusCode = 0;
        }
        int i10 = statusCode;
        Throwable th2 = aFf1xSDK.f6993v;
        if (th2 instanceof HttpException) {
            HttpException httpException = (HttpException) th2;
            cause = httpException.getCause();
            j11 = httpException.getMetrics().registerClient;
        } else {
            cause = th2;
            j11 = j10;
        }
        AFh1aSDK aFh1aSDK = aFf1xSDK.unregisterClient;
        this.f6982e = new AFh1bSDK(aFh1aSDK != null ? aFh1aSDK.AFKeystoreWrapper : null, aFf1xSDK.AFLogger, j11, System.currentTimeMillis() - aFf1xSDK.registerClient, i10, aFf1xSDK.AFKeystoreWrapper, aFf1xSDK.f6992e, cause);
    }

    /* JADX WARN: Code duplicated, block: B:89:0x031d  */
    /* JADX WARN: Code duplicated, block: B:90:0x0320  */
    /* JADX WARN: Code duplicated, block: B:93:0x0336  */
    /* JADX WARN: Code duplicated, block: B:95:0x0339  */
    /* JADX INFO: renamed from: e */
    private final AFf1pSDK m8842e() throws Throwable {
        long j10;
        Throwable cause;
        Throwable cause2;
        AFh1cSDK aFh1cSDK;
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str = this.getLevel;
        AFf1fSDK aFf1fSDK = this.afInfoLog;
        String str2 = (String) AFf1fSDK.unregisterClient(new Object[]{aFf1fSDK}, -1660886869, 1660886871, System.identityHashCode(aFf1fSDK));
        String strM8932d = null;
        if (str2 == null || StringsKt.m32182p0(str2)) {
            AFLoggerBase.w$default(AFLogger.INSTANCE, LogTag.REMOTE_CONTROL, "Dev key is not set, SDK is not started.", false, 4, null);
        } else if (str == null) {
            AFLoggerBase.w$default(AFLogger.INSTANCE, LogTag.REMOTE_CONTROL, "Can't create CDN token, domain or version is not provided.", false, 4, null);
        } else {
            strM8932d = AFj1nSDK.m8932d(TextUtils.join("\u2063", new String[]{"appsflyersdk.com", str, this.AFLoggerLogLevel.f6886d.f6933d.getPackageName()}), str2);
        }
        String str3 = strM8932d;
        if (str3 == null) {
            AFLoggerBase.v$default(AFLogger.INSTANCE, LogTag.REMOTE_CONTROL, "can't create CDN token, skipping fetch config", false, 4, null);
            return AFf1pSDK.FAILURE;
        }
        try {
            Boolean bool = (Boolean) this.afWarnLog.AFKeystoreWrapper.getValue();
            bool.booleanValue();
            Boolean bool2 = (Boolean) this.afWarnLog.registerClient.getValue();
            bool2.booleanValue();
            AFf1kSDK aFf1kSDK = this.afWarnLog;
            if (aFf1kSDK.unregisterClient.getOutOfStore == null) {
                AFLoggerBase.i$default(AFLogger.INSTANCE, LogTag.REMOTE_CONTROL, "Cold start detected - fetching config from CDN", false, 4, null);
            } else {
                AFh1aSDK aFh1aSDK = aFf1kSDK.d.AFLogger;
                if (aFh1aSDK == null) {
                    AFLoggerBase.i$default(AFLogger.INSTANCE, LogTag.REMOTE_CONTROL, "active config is missing - fetching from CDN", false, 4, null);
                } else {
                    AFh1gSDK aFh1gSDK = aFh1aSDK.registerClient;
                    boolean z10 = false;
                    if (aFh1gSDK != null && (aFh1cSDK = aFh1gSDK.unregisterClient) != null && TimeUnit.SECONDS.toMillis(aFh1cSDK.AFLogger) > AFh1cSDK.registerClient()) {
                        z10 = true;
                    }
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    AFf1jSDK aFf1jSDK = aFf1kSDK.d;
                    long j11 = jCurrentTimeMillis2 - aFf1jSDK.registerClient;
                    long millis = TimeUnit.SECONDS.toMillis(aFf1jSDK.unregisterClient);
                    if (!z10 && j11 <= millis) {
                        AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.REMOTE_CONTROL, "Using cached config (warm start, config valid)", false, 4, null);
                        return AFf1pSDK.USE_CACHED;
                    }
                }
            }
            AFLogger aFLogger = AFLogger.INSTANCE;
            LogTag logTag = LogTag.REMOTE_CONTROL;
            AFLoggerBase.d$default(aFLogger, logTag, "Fetching config (cold start or stale)...", false, 4, null);
            AFd1fSDK aFd1fSDKAFKeystoreWrapper = ((AFd1pSDK) AFd1sSDK.m8782d(new Object[]{this.afErrorLog, bool, bool2, str3, 1500}, 1895390539, -1895390537, 1500)).AFKeystoreWrapper();
            if (!aFd1fSDKAFKeystoreWrapper.isSuccessful()) {
                Intrinsics.checkNotNull(aFd1fSDKAFKeystoreWrapper);
                AFKeystoreWrapper(new AFf1xSDK(str3, jCurrentTimeMillis, aFd1fSDKAFKeystoreWrapper, (AFh1aSDK) aFd1fSDKAFKeystoreWrapper.getBody(), null, null, null));
                AFLoggerBase.w$default(aFLogger, logTag, "failed to fetch remote config from CDN with status code: " + aFd1fSDKAFKeystoreWrapper.getStatusCode(), false, 4, null);
                return AFf1pSDK.FAILURE;
            }
            Intrinsics.checkNotNull(aFd1fSDKAFKeystoreWrapper);
            Object body = aFd1fSDKAFKeystoreWrapper.getBody();
            Intrinsics.checkNotNullExpressionValue(body, "");
            AFh1aSDK aFh1aSDK2 = (AFh1aSDK) body;
            String strAFKeystoreWrapper = aFd1fSDKAFKeystoreWrapper.AFKeystoreWrapper("x-amz-meta-af-auth-v1");
            String strAFKeystoreWrapper2 = aFd1fSDKAFKeystoreWrapper.AFKeystoreWrapper("CF-Cache-Status");
            String strAFKeystoreWrapper3 = aFd1fSDKAFKeystoreWrapper.AFKeystoreWrapper("af-net-tkn");
            if (strAFKeystoreWrapper3 == null || strAFKeystoreWrapper3.length() == 0) {
                AFLoggerBase.d$default(aFLogger, logTag, "Network token header not present in the response", false, 4, null);
            } else {
                this.AppsFlyerLib.getOutOfStore = strAFKeystoreWrapper3;
            }
            AFf1fSDK aFf1fSDK2 = this.afInfoLog;
            String str4 = (String) AFf1fSDK.unregisterClient(new Object[]{aFf1fSDK2}, -1660886869, 1660886871, System.identityHashCode(aFf1fSDK2));
            if (str4 == null || StringsKt.m32182p0(str4)) {
                AFLoggerBase.w$default(aFLogger, logTag, "Dev key is not set, SDK is not started.", false, 4, null);
                return AFf1pSDK.FAILURE;
            }
            AFi1uSDK aFi1uSDKAFKeystoreWrapper = this.f6984v.AFKeystoreWrapper(aFh1aSDK2, strAFKeystoreWrapper, str3, str4);
            Intrinsics.checkNotNullExpressionValue(aFi1uSDKAFKeystoreWrapper, "");
            if (!aFi1uSDKAFKeystoreWrapper.AFKeystoreWrapper) {
                AFKeystoreWrapper(new AFf1xSDK(str3, jCurrentTimeMillis, aFd1fSDKAFKeystoreWrapper, (AFh1aSDK) aFd1fSDKAFKeystoreWrapper.getBody(), aFi1uSDKAFKeystoreWrapper.AFLogger, strAFKeystoreWrapper2, null));
                AFLoggerBase.w$default(aFLogger, logTag, "fetched config is not valid (MITM?) refuse to use it.", false, 4, null);
                return AFf1pSDK.FAILURE;
            }
            long jAFKeystoreWrapper = this.afWarnLog.AFKeystoreWrapper();
            AFLoggerBase.v$default(aFLogger, logTag, "using max-age fallback: " + jAFKeystoreWrapper + " seconds", false, 4, null);
            long jCurrentTimeMillis3 = System.currentTimeMillis();
            AFf1jSDK aFf1jSDK2 = this.afDebugLog;
            try {
                j10 = jCurrentTimeMillis;
                try {
                    aFf1jSDK2.AFKeystoreWrapper.mo8764d("af_remote_config", Base64.encodeToString(aFh1aSDK2.f7016d.getBytes(Charset.defaultCharset()), 2));
                    aFf1jSDK2.f6978d = aFf1jSDK2.AFLogger;
                    aFf1jSDK2.AFKeystoreWrapper.AFLogger("af_rc_timestamp", jCurrentTimeMillis3);
                    aFf1jSDK2.AFKeystoreWrapper.AFLogger("af_rc_max_age", jAFKeystoreWrapper);
                    aFf1jSDK2.AFLogger = aFh1aSDK2;
                    aFf1jSDK2.registerClient = jCurrentTimeMillis3;
                    aFf1jSDK2.unregisterClient = jAFKeystoreWrapper;
                    AFLoggerBase.d$default(aFLogger, logTag, "Config successfully updated, timeToLive: " + jAFKeystoreWrapper + " seconds", false, 4, null);
                    AFKeystoreWrapper(new AFf1xSDK(str3, j10, aFd1fSDKAFKeystoreWrapper, (AFh1aSDK) aFd1fSDKAFKeystoreWrapper.getBody(), aFi1uSDKAFKeystoreWrapper.AFLogger, strAFKeystoreWrapper2, null));
                    return AFf1pSDK.SUCCESS;
                } catch (ParsingException e10) {
                    e = e10;
                    str3 = str3;
                    IOException iOException = e;
                    m8841d(str3, j10, iOException, e.getRawResponse());
                    cause2 = iOException.getCause();
                    if (cause2 instanceof InterruptedIOException) {
                        throw cause2;
                    }
                    return AFf1pSDK.FAILURE;
                } catch (IOException e11) {
                    e = e11;
                    str3 = str3;
                    IOException iOException2 = e;
                    m8841d(str3, j10, iOException2, null);
                    cause = iOException2.getCause();
                    if (cause instanceof InterruptedIOException) {
                        throw cause;
                    }
                    return AFf1pSDK.FAILURE;
                } catch (Throwable th2) {
                    th = th2;
                    str3 = str3;
                    jCurrentTimeMillis = j10;
                    Throwable th3 = th;
                    AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.REMOTE_CONTROL, "failed to update remote config: " + th3.getMessage(), th3, true, false, false, false, 64, null);
                    AFKeystoreWrapper(new AFf1xSDK(str3, jCurrentTimeMillis, null, null, null, null, th3));
                    Throwable cause3 = th3.getCause();
                    if (cause3 instanceof InterruptedException) {
                        throw cause3;
                    }
                    return AFf1pSDK.FAILURE;
                }
            } catch (ParsingException e12) {
                e = e12;
                str3 = str3;
                j10 = jCurrentTimeMillis;
                IOException iOException3 = e;
                m8841d(str3, j10, iOException3, e.getRawResponse());
                cause2 = iOException3.getCause();
                if (cause2 instanceof InterruptedIOException) {
                    return AFf1pSDK.FAILURE;
                }
                throw cause2;
            } catch (IOException e13) {
                e = e13;
                str3 = str3;
                j10 = jCurrentTimeMillis;
                IOException iOException4 = e;
                m8841d(str3, j10, iOException4, null);
                cause = iOException4.getCause();
                if (cause instanceof InterruptedIOException) {
                    return AFf1pSDK.FAILURE;
                }
                throw cause;
            } catch (Throwable th4) {
                th = th4;
                str3 = str3;
            }
        } catch (ParsingException e14) {
            e = e14;
        } catch (IOException e15) {
            e = e15;
        } catch (Throwable th5) {
            th = th5;
        }
    }

    @Override // com.appsflyer.internal.AFe1ySDK
    public final boolean AFLogger() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.appsflyer.internal.AFe1ySDK
    /* JADX INFO: renamed from: d */
    public final long mo8802d() {
        return 1500L;
    }

    @Override // com.appsflyer.internal.AFe1ySDK
    @NotNull
    public final AFd1cSDK registerClient() throws Throwable {
        try {
            AFf1pSDK aFf1pSDKM8842e = m8842e();
            this.f6983i = aFf1pSDKM8842e;
            return aFf1pSDKM8842e == AFf1pSDK.FAILURE ? AFd1cSDK.FAILURE : AFd1cSDK.SUCCESS;
        } catch (InterruptedIOException e10) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.REMOTE_CONTROL, "RC update config failed", e10, false, false, false, false, 64, null);
            this.f6983i = AFf1pSDK.FAILURE;
            return AFd1cSDK.TIMEOUT;
        } catch (InterruptedException e11) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.REMOTE_CONTROL, "RC update config failed", e11, false, false, false, false, 64, null);
            this.f6983i = AFf1pSDK.FAILURE;
            return AFd1cSDK.TIMEOUT;
        } catch (SocketTimeoutException unused) {
            this.f6983i = AFf1pSDK.FAILURE;
            return AFd1cSDK.TIMEOUT;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX INFO: renamed from: d */
    private final void m8841d(String str, long j10, IOException iOException, AFd1fSDK<?> aFd1fSDK) {
        AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.REMOTE_CONTROL, "failed to fetch remote config: " + iOException.getMessage(), iOException, true, false, false, false, 64, null);
        AFKeystoreWrapper(new AFf1xSDK(str, j10, aFd1fSDK, null, null, null, iOException));
    }
}
