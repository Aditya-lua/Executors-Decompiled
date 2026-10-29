package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p477ut.C11969n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\u0005*\u00020\u0005H'¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u000b\u001a\u00020\r*\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u000b\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R$\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u000e\u0010\u0017R\u0014\u0010\u0015\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00058'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0019R\u0014\u0010\u0013\u001a\u00020\u001b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u001cR\u001a\u0010\u001e\u001a\u00020\r8\u0017X\u0097D¢\u0006\f\n\u0004\b\u000b\u0010\u001d\u001a\u0004\b\u0015\u0010\u000f"}, m31665d2 = {"Lcom/appsflyer/internal/AFc1cSDK;", "", "", "p0", "", "", "p1", "", "p2", "<init>", "([BLjava/util/Map;I)V", "d", "(Ljava/lang/String;)Ljava/lang/String;", "", "unregisterClient", "()Z", "Ljava/net/HttpURLConnection;", "", "(Ljava/net/HttpURLConnection;J)Z", "registerClient", "(Ljava/net/HttpURLConnection;)Ljava/lang/String;", "AFKeystoreWrapper", "[B", "Ljava/util/Map;", "I", "()Ljava/lang/String;", "AFLogger", "Lcom/appsflyer/internal/AFd1tSDK;", "()Lcom/appsflyer/internal/AFd1tSDK;", "Z", "i"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public abstract class AFc1cSDK {

    /* JADX INFO: renamed from: AFKeystoreWrapper, reason: from kotlin metadata */
    @NotNull
    public byte[] d;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean i;

    /* JADX INFO: renamed from: registerClient, reason: from kotlin metadata */
    public int AFKeystoreWrapper;

    @Nullable
    public Map<String, String> unregisterClient;

    public AFc1cSDK(@NotNull byte[] bArr, @Nullable Map<String, String> map, int i10) {
        Intrinsics.checkNotNullParameter(bArr, "");
        this.d = bArr;
        this.unregisterClient = map;
        this.AFKeystoreWrapper = i10;
        this.i = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    private final boolean m8756d(HttpURLConnection httpURLConnection, long j10) throws IOException {
        httpURLConnection.setRequestMethod("POST");
        StringBuilder sb2 = new StringBuilder(httpURLConnection.getRequestMethod() + ":" + httpURLConnection.getURL());
        sb2.append("\n length: ");
        sb2.append(new String(this.d, Charsets.UTF_8).length());
        Map<String, String> map = this.unregisterClient;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                sb2.append("\n ");
                sb2.append(entry.getKey());
                sb2.append(": ");
                sb2.append(entry.getValue());
            }
        }
        AFLogger.INSTANCE.mo8699v(LogTag.REMOTE_CONTROL, mo8758d("HTTP: [" + httpURLConnection.hashCode() + "] " + ((Object) sb2)), getI());
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setReadTimeout(this.AFKeystoreWrapper);
        httpURLConnection.setConnectTimeout(this.AFKeystoreWrapper);
        httpURLConnection.addRequestProperty("Content-Type", mo8757d().unregisterClient);
        Map<String, String> map2 = this.unregisterClient;
        if (map2 != null) {
            for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                httpURLConnection.addRequestProperty(entry2.getKey(), entry2.getValue());
            }
        }
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty("Content-Length", String.valueOf(this.d.length));
        OutputStream outputStream = httpURLConnection.getOutputStream();
        Intrinsics.checkNotNullExpressionValue(outputStream, "");
        BufferedOutputStream bufferedOutputStream = outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, 8192);
        bufferedOutputStream.write(this.d);
        bufferedOutputStream.close();
        String strRegisterClient = registerClient(httpURLConnection);
        long jCurrentTimeMillis = System.currentTimeMillis() - j10;
        String str = "response code:" + httpURLConnection.getResponseCode() + " " + httpURLConnection.getResponseMessage() + "\n\tbody:" + strRegisterClient + "\n\ttook " + jCurrentTimeMillis + "ms";
        AFLogger.INSTANCE.mo8699v(LogTag.REMOTE_CONTROL, mo8758d("HTTP: [" + httpURLConnection.hashCode() + "] " + str), getI());
        return httpURLConnection.getResponseCode() / 100 == 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static String registerClient(HttpURLConnection p8) throws IOException {
        InputStream errorStream;
        try {
            errorStream = p8.getInputStream();
        } catch (Throwable th2) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            LogTag logTag = LogTag.HTTP_CLIENT;
            String message = th2.getMessage();
            AFLoggerBase.e$default(aFLogger, logTag, message == null ? "" : message, th2, false, false, false, false, 96, null);
            errorStream = p8.getErrorStream();
        }
        if (errorStream == null) {
            return "";
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, Charsets.UTF_8), 8192);
        String strM0 = CollectionsKt.m31715m0(C11969n.m44669f(bufferedReader), null, null, null, 0, null, null, 63, null);
        bufferedReader.close();
        return strM0 == null ? "" : strM0;
    }

    /* JADX INFO: renamed from: AFKeystoreWrapper, reason: from getter */
    public boolean getI() {
        return this.i;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public abstract AFd1tSDK mo8757d();

    @NotNull
    /* JADX INFO: renamed from: d */
    public abstract String mo8758d(@NotNull String str);

    @NotNull
    public abstract String registerClient();

    public final boolean unregisterClient() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        HttpURLConnection httpURLConnection = null;
        try {
            String strRegisterClient = registerClient();
            Intrinsics.checkNotNullParameter(strRegisterClient, "");
            URLConnection uRLConnectionOpenConnection = new URL(strRegisterClient).openConnection();
            Intrinsics.m31981d(uRLConnectionOpenConnection, "");
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) uRLConnectionOpenConnection;
            try {
                boolean zM8756d = m8756d(httpURLConnection2, jCurrentTimeMillis);
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                return zM8756d;
            } catch (Throwable th2) {
                th = th2;
                httpURLConnection = httpURLConnection2;
                try {
                    String str = "error: " + th + "\n\ttook " + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms\n\t" + th.getMessage();
                    AFLogger.INSTANCE.mo8699v(LogTag.REMOTE_CONTROL, mo8758d("HTTP: [" + (httpURLConnection != null ? httpURLConnection.hashCode() : 0) + "] " + str), getI());
                    return false;
                } finally {
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
