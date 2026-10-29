package p306nb;

import com.google.android.gms.internal.measurement.C2185m1;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p305n9.C8953m;

/* JADX INFO: renamed from: nb.a6 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC8992a6 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final URL f32669a;

    /* JADX INFO: renamed from: b */
    public final byte[] f32670b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC9380y5 f32671c;

    /* JADX INFO: renamed from: d */
    public final String f32672d;

    /* JADX INFO: renamed from: e */
    public final Map f32673e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C9009b6 f32674f;

    public RunnableC8992a6(C9009b6 c9009b6, String str, URL url, byte[] bArr, Map map, InterfaceC9380y5 interfaceC9380y5) {
        Objects.requireNonNull(c9009b6);
        this.f32674f = c9009b6;
        C8953m.m36041f(str);
        C8953m.m36047l(url);
        C8953m.m36047l(interfaceC9380y5);
        this.f32669a = url;
        this.f32670b = bArr;
        this.f32671c = interfaceC9380y5;
        this.f32672d = str;
        this.f32673e = map;
    }

    /* JADX WARN: Code duplicated, block: B:73:0x0143  */
    /* JADX WARN: Code duplicated, block: B:83:0x0180  */
    /* JADX WARN: Code duplicated, block: B:88:0x0127 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x0164 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x00fe: MOVE (r9 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:51:0x00fc */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0101: MOVE (r10 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:52:0x0100 */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        HttpURLConnection httpURLConnection;
        Map map;
        IOException iOException;
        int responseCode;
        Map map2;
        Throwable th2;
        Map map3;
        Map map4;
        InputStream inputStream;
        C9009b6 c9009b6 = this.f32674f;
        c9009b6.mo36256g();
        int i10 = 0;
        OutputStream outputStream = null;
        try {
            URL url = this.f32669a;
            int i11 = C2185m1.f8408a;
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                throw new IOException("Failed to obtain HTTP connection");
            }
            httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setDefaultUseCaches(false);
            C9094g7 c9094g7 = c9009b6.f33067a;
            c9094g7.m36338w();
            httpURLConnection.setConnectTimeout(60000);
            c9094g7.m36338w();
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setDoInput(true);
            try {
                Map map5 = this.f32673e;
                if (map5 != null) {
                    for (Map.Entry entry : map5.entrySet()) {
                        httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                }
                byte[] bArr = this.f32670b;
                if (bArr != null) {
                    byte[] bArrM36762V = c9009b6.f33516b.m36515K0().m36762V(bArr);
                    C9316u5 c9316u5M37011w = c9094g7.mo36321a().m37011w();
                    int length = bArrM36762V.length;
                    c9316u5M37011w.m36912b("Uploading data. size", Integer.valueOf(length));
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
                    httpURLConnection.setFixedLengthStreamingMode(length);
                    httpURLConnection.connect();
                    OutputStream outputStream2 = httpURLConnection.getOutputStream();
                    try {
                        outputStream2.write(bArrM36762V);
                        outputStream2.close();
                    } catch (IOException e10) {
                        iOException = e10;
                        responseCode = 0;
                        map2 = null;
                        outputStream = outputStream2;
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (IOException e11) {
                                this.f32674f.f33067a.mo36321a().m37003o().m36913c("Error closing HTTP compressed POST connection output stream. appId", C9348w5.m36998x(this.f32672d), e11);
                            }
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        this.f32674f.f33067a.mo36322b().m36263t(new RunnableC9396z5(this.f32672d, this.f32671c, responseCode, iOException, null, map2, null));
                    } catch (Throwable th3) {
                        th = th3;
                        map = null;
                        outputStream = outputStream2;
                        th2 = th;
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (IOException e12) {
                                this.f32674f.f33067a.mo36321a().m37003o().m36913c("Error closing HTTP compressed POST connection output stream. appId", C9348w5.m36998x(this.f32672d), e12);
                            }
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        this.f32674f.f33067a.mo36322b().m36263t(new RunnableC9396z5(this.f32672d, this.f32671c, i10, null, null, map, null));
                        throw th2;
                    }
                }
                responseCode = httpURLConnection.getResponseCode();
                try {
                    try {
                        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                        try {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            inputStream = httpURLConnection.getInputStream();
                            try {
                                byte[] bArr2 = new byte[1024];
                                while (true) {
                                    int i12 = inputStream.read(bArr2);
                                    if (i12 <= 0) {
                                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                                        inputStream.close();
                                        httpURLConnection.disconnect();
                                        this.f32674f.f33067a.mo36322b().m36263t(new RunnableC9396z5(this.f32672d, this.f32671c, responseCode, null, byteArray, headerFields, null));
                                        return;
                                    }
                                    byteArrayOutputStream.write(bArr2, 0, i12);
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            inputStream = null;
                        }
                    } catch (IOException e13) {
                        e = e13;
                        map2 = null;
                        iOException = e;
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        this.f32674f.f33067a.mo36322b().m36263t(new RunnableC9396z5(this.f32672d, this.f32671c, responseCode, iOException, null, map2, null));
                    } catch (Throwable th6) {
                        th2 = th6;
                        map = null;
                        i10 = responseCode;
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        this.f32674f.f33067a.mo36322b().m36263t(new RunnableC9396z5(this.f32672d, this.f32671c, i10, null, null, map, null));
                        throw th2;
                    }
                } catch (IOException e14) {
                    e = e14;
                    map2 = map4;
                    iOException = e;
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    this.f32674f.f33067a.mo36322b().m36263t(new RunnableC9396z5(this.f32672d, this.f32671c, responseCode, iOException, null, map2, null));
                } catch (Throwable th7) {
                    th2 = th7;
                    i10 = responseCode;
                    map = map3;
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    this.f32674f.f33067a.mo36322b().m36263t(new RunnableC9396z5(this.f32672d, this.f32671c, i10, null, null, map, null));
                    throw th2;
                }
            } catch (IOException e15) {
                iOException = e15;
                responseCode = 0;
                map2 = null;
            } catch (Throwable th8) {
                th = th8;
                map = null;
            }
        } catch (IOException e16) {
            iOException = e16;
            responseCode = 0;
            httpURLConnection = null;
            map2 = null;
        } catch (Throwable th9) {
            th = th9;
            httpURLConnection = null;
            map = null;
        }
    }
}
