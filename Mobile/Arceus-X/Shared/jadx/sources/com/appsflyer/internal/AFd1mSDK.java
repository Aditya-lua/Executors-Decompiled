package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import com.appsflyer.sdk_base.logger.LogTag;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class AFd1mSDK {
    private final int AFKeystoreWrapper;

    public AFd1mSDK(int i10) {
        this.AFKeystoreWrapper = i10;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x006c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0071  */
    /* JADX WARN: Code duplicated, block: B:47:? A[SYNTHETIC] */
    @NonNull
    private static String AFLogger(HttpURLConnection httpURLConnection) throws Throwable {
        Throwable th2;
        BufferedReader bufferedReader;
        InputStream errorStream;
        InputStreamReader inputStreamReader = null;
        try {
            try {
                errorStream = httpURLConnection.getInputStream();
            } catch (Exception e10) {
                errorStream = httpURLConnection.getErrorStream();
                AFLogger.INSTANCE.mo8697e(LogTag.HTTP_CLIENT, e10.getMessage() != null ? e10.getMessage() : "", e10, false, false, false, false);
            }
            if (errorStream == null) {
                return "";
            }
            StringBuilder sb2 = new StringBuilder();
            InputStreamReader inputStreamReader2 = new InputStreamReader(errorStream, Charset.defaultCharset());
            try {
                BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader2);
                boolean z10 = true;
                while (true) {
                    try {
                        String line = bufferedReader2.readLine();
                        if (line == null) {
                            String string = sb2.toString();
                            inputStreamReader2.close();
                            bufferedReader2.close();
                            return string;
                        }
                        if (!z10) {
                            sb2.append('\n');
                        }
                        sb2.append(line);
                        z10 = false;
                    } catch (Throwable th3) {
                        bufferedReader = bufferedReader2;
                        th2 = th3;
                        inputStreamReader = inputStreamReader2;
                        if (inputStreamReader != null) {
                            inputStreamReader.close();
                        }
                        if (bufferedReader != null) {
                            throw th2;
                        }
                        bufferedReader.close();
                        throw th2;
                    }
                }
            } catch (Throwable th4) {
                th2 = th4;
                bufferedReader = null;
            }
        } catch (Throwable th5) {
            th2 = th5;
            bufferedReader = null;
        }
        if (inputStreamReader != null) {
            inputStreamReader.close();
        }
        if (bufferedReader != null) {
            throw th2;
        }
        bufferedReader.close();
        throw th2;
    }

    public final AFd1fSDK<String> registerClient(AFd1oSDK aFd1oSDK) {
        Throwable th2;
        HttpURLConnection httpURLConnection;
        BufferedOutputStream bufferedOutputStream;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            byte[] bArr = aFd1oSDK.unregisterClient;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(aFd1oSDK.AFKeystoreWrapper);
            sb2.append(":");
            sb2.append(aFd1oSDK.f6909d);
            StringBuilder sb3 = new StringBuilder(sb2.toString());
            byte[] bArr2 = aFd1oSDK.unregisterClient;
            if (aFd1oSDK.f6910e && bArr2 != null) {
                try {
                    String str = aFd1oSDK.registerClient ? "<encrypted>" : new String(bArr2, Charset.defaultCharset());
                    sb3.append("\n payload: ");
                    sb3.append(str);
                } catch (Throwable th3) {
                    httpURLConnection = null;
                    th2 = th3;
                    try {
                        AFd1nSDK aFd1nSDK = new AFd1nSDK(System.currentTimeMillis() - jCurrentTimeMillis);
                        StringBuilder sb4 = new StringBuilder("error: ");
                        sb4.append(th2);
                        sb4.append("\n took ");
                        sb4.append(aFd1nSDK.registerClient);
                        sb4.append("ms");
                        String string = sb4.toString();
                        AFLogger aFLogger = AFLogger.INSTANCE;
                        LogTag logTag = LogTag.HTTP_CLIENT;
                        StringBuilder sb5 = new StringBuilder("[");
                        sb5.append(aFd1oSDK.hashCode());
                        sb5.append("] ");
                        sb5.append(string);
                        aFLogger.m8964e(logTag, sb5.toString(), th2, false, false, false);
                        throw new HttpException(th2, aFd1nSDK);
                    } catch (Throwable th4) {
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        throw th4;
                    }
                }
            }
            for (Map.Entry<String, String> entry : aFd1oSDK.AFLogger.entrySet()) {
                sb3.append("\n ");
                sb3.append(entry.getKey());
                sb3.append(": ");
                sb3.append(entry.getValue());
            }
            StringBuilder sb6 = new StringBuilder("[");
            sb6.append(aFd1oSDK.hashCode());
            sb6.append("] ");
            sb6.append((Object) sb3);
            AFLogger.INSTANCE.m8960d(LogTag.HTTP_CLIENT, sb6.toString());
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(aFd1oSDK.f6909d).openConnection();
            try {
                httpURLConnection2.setRequestMethod(aFd1oSDK.AFKeystoreWrapper);
                if (aFd1oSDK.force) {
                    httpURLConnection2.setUseCaches(false);
                }
                if (!aFd1oSDK.f6913w) {
                    httpURLConnection2.setInstanceFollowRedirects(false);
                }
                try {
                    int i10 = this.AFKeystoreWrapper;
                    int i11 = aFd1oSDK.f6912v;
                    if (i11 != -1) {
                        i10 = i11;
                    }
                    httpURLConnection2.setConnectTimeout(i10);
                    httpURLConnection2.setReadTimeout(i10);
                    httpURLConnection2.addRequestProperty("Content-Type", aFd1oSDK.registerClient ? "application/octet-stream" : "application/json");
                    for (Map.Entry<String, String> entry2 : aFd1oSDK.AFLogger.entrySet()) {
                        httpURLConnection2.setRequestProperty(entry2.getKey(), entry2.getValue());
                    }
                    if (bArr != null) {
                        httpURLConnection2.setDoOutput(true);
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append(bArr.length);
                        httpURLConnection2.setRequestProperty("Content-Length", sb7.toString());
                        try {
                            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(httpURLConnection2.getOutputStream());
                            try {
                                bufferedOutputStream2.write(bArr);
                                bufferedOutputStream2.close();
                            } catch (Throwable th5) {
                                th = th5;
                                bufferedOutputStream = bufferedOutputStream2;
                                if (bufferedOutputStream != null) {
                                    bufferedOutputStream.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            bufferedOutputStream = null;
                        }
                    }
                    boolean z10 = httpURLConnection2.getResponseCode() / 100 == 2;
                    String strAFLogger = aFd1oSDK.f6911i ? AFLogger(httpURLConnection2) : "";
                    AFd1nSDK aFd1nSDK2 = new AFd1nSDK(System.currentTimeMillis() - jCurrentTimeMillis);
                    StringBuilder sb8 = new StringBuilder("response code:");
                    sb8.append(httpURLConnection2.getResponseCode());
                    sb8.append(" ");
                    sb8.append(httpURLConnection2.getResponseMessage());
                    sb8.append("\n body:");
                    sb8.append(strAFLogger);
                    sb8.append("\n took ");
                    sb8.append(aFd1nSDK2.registerClient);
                    sb8.append("ms");
                    String string2 = sb8.toString();
                    AFLogger aFLogger2 = AFLogger.INSTANCE;
                    LogTag logTag2 = LogTag.HTTP_CLIENT;
                    StringBuilder sb9 = new StringBuilder("[");
                    sb9.append(aFd1oSDK.hashCode());
                    sb9.append("] ");
                    sb9.append(string2);
                    aFLogger2.m8960d(logTag2, sb9.toString());
                    HashMap map = new HashMap(httpURLConnection2.getHeaderFields());
                    map.remove(null);
                    AFd1fSDK<String> aFd1fSDK = new AFd1fSDK<>(strAFLogger, httpURLConnection2.getResponseCode(), z10, map, aFd1nSDK2);
                    httpURLConnection2.disconnect();
                    return aFd1fSDK;
                } catch (Throwable th7) {
                    th = th7;
                    th2 = th;
                    httpURLConnection = httpURLConnection2;
                    AFd1nSDK aFd1nSDK3 = new AFd1nSDK(System.currentTimeMillis() - jCurrentTimeMillis);
                    StringBuilder sb10 = new StringBuilder("error: ");
                    sb10.append(th2);
                    sb10.append("\n took ");
                    sb10.append(aFd1nSDK3.registerClient);
                    sb10.append("ms");
                    String string3 = sb10.toString();
                    AFLogger aFLogger3 = AFLogger.INSTANCE;
                    LogTag logTag3 = LogTag.HTTP_CLIENT;
                    StringBuilder sb11 = new StringBuilder("[");
                    sb11.append(aFd1oSDK.hashCode());
                    sb11.append("] ");
                    sb11.append(string3);
                    aFLogger3.m8964e(logTag3, sb11.toString(), th2, false, false, false);
                    throw new HttpException(th2, aFd1nSDK3);
                }
            } catch (Throwable th8) {
                th = th8;
            }
        } catch (Throwable th9) {
            th2 = th9;
            httpURLConnection = null;
        }
    }
}
