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
import java.util.zip.GZIPOutputStream;
import p305n9.C8953m;

/* JADX INFO: renamed from: nb.ua */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9321ua implements Runnable {

    /* JADX INFO: renamed from: a */
    public final URL f33536a;

    /* JADX INFO: renamed from: b */
    public final byte[] f33537b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC9289sa f33538c;

    /* JADX INFO: renamed from: d */
    public final String f33539d;

    /* JADX INFO: renamed from: e */
    public final Map f33540e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C9337va f33541f;

    public RunnableC9321ua(C9337va c9337va, String str, URL url, byte[] bArr, Map map, InterfaceC9289sa interfaceC9289sa) {
        Objects.requireNonNull(c9337va);
        this.f33541f = c9337va;
        C8953m.m36041f(str);
        C8953m.m36047l(url);
        C8953m.m36047l(interfaceC9289sa);
        this.f33536a = url;
        this.f33537b = bArr;
        this.f33538c = interfaceC9289sa;
        this.f33539d = str;
        this.f33540e = map;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void m36915a(int i10, Exception exc, byte[] bArr, Map map) {
        this.f33538c.mo36292a(this.f33539d, i10, exc, bArr, map);
    }

    /* JADX INFO: renamed from: b */
    public final void m36916b(final int i10, final Exception exc, final byte[] bArr, final Map map) {
        this.f33541f.f33067a.mo36322b().m36263t(new Runnable() { // from class: nb.ta
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f33502a.m36915a(i10, exc, bArr, map);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:77:0x0151  */
    /* JADX WARN: Code duplicated, block: B:87:0x0179  */
    /* JADX WARN: Code duplicated, block: B:90:0x0135 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x015d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [nb.ua] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v3 */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        HttpURLConnection httpURLConnection;
        OutputStream outputStream;
        OutputStream outputStream2;
        ?? r8;
        OutputStream outputStream3;
        ?? r10;
        OutputStream outputStream4;
        InputStream inputStream;
        C9337va c9337va = this.f33541f;
        c9337va.mo36256g();
        int i10 = 0;
        try {
            URL url = this.f33536a;
            int i11 = C2185m1.f8408a;
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                throw new IOException("Failed to obtain HTTP connection");
            }
            httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setDefaultUseCaches(false);
            C9094g7 c9094g7 = c9337va.f33067a;
            c9094g7.m36338w();
            httpURLConnection.setConnectTimeout(60000);
            c9094g7.m36338w();
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            ?? r11 = 1;
            httpURLConnection.setDoInput(true);
            try {
                try {
                    Map map = this.f33540e;
                    if (map != null) {
                        for (Map.Entry entry : map.entrySet()) {
                            httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                        }
                    }
                    byte[] bArr = this.f33537b;
                    if (bArr != null) {
                        try {
                            c9094g7.mo36323c();
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                            gZIPOutputStream.write(bArr);
                            gZIPOutputStream.close();
                            byteArrayOutputStream.close();
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            C9316u5 c9316u5M37011w = this.f33541f.f33067a.mo36321a().m37011w();
                            int length = byteArray.length;
                            c9316u5M37011w.m36912b("Uploading data. size", Integer.valueOf(length));
                            httpURLConnection.setDoOutput(true);
                            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
                            httpURLConnection.setFixedLengthStreamingMode(length);
                            httpURLConnection.connect();
                            OutputStream outputStream5 = httpURLConnection.getOutputStream();
                            try {
                                outputStream5.write(byteArray);
                                outputStream5.close();
                                r11 = outputStream5;
                            } catch (IOException e10) {
                                e = e10;
                                r10 = 0;
                                outputStream4 = outputStream5;
                                if (outputStream4 != null) {
                                    try {
                                        outputStream4.close();
                                    } catch (IOException e11) {
                                        this.f33541f.f33067a.mo36321a().m37003o().m36913c("Error closing HTTP compressed POST connection output stream. appId", C9348w5.m36998x(this.f33539d), e11);
                                    }
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                m36916b(i10, e, null, r10);
                            } catch (Throwable th2) {
                                th = th2;
                                r8 = 0;
                                outputStream3 = outputStream5;
                                if (outputStream3 != null) {
                                    try {
                                        outputStream3.close();
                                    } catch (IOException e12) {
                                        this.f33541f.f33067a.mo36321a().m37003o().m36913c("Error closing HTTP compressed POST connection output stream. appId", C9348w5.m36998x(this.f33539d), e12);
                                    }
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                m36916b(i10, null, null, r8);
                                throw th;
                            }
                        } catch (IOException e13) {
                            this.f33541f.f33067a.mo36321a().m37003o().m36912b("Failed to gzip post request content", e13);
                            throw e13;
                        }
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    try {
                        try {
                            Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                            try {
                                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                inputStream = httpURLConnection.getInputStream();
                                try {
                                    byte[] bArr2 = new byte[1024];
                                    while (true) {
                                        int i12 = inputStream.read(bArr2);
                                        if (i12 <= 0) {
                                            byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                                            inputStream.close();
                                            httpURLConnection.disconnect();
                                            m36916b(responseCode, null, byteArray2, headerFields);
                                            return;
                                        }
                                        byteArrayOutputStream2.write(bArr2, 0, i12);
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                inputStream = null;
                            }
                        } catch (IOException e14) {
                            i10 = responseCode;
                            e = e14;
                            outputStream2 = null;
                            r10 = outputStream2;
                            outputStream4 = outputStream2;
                            if (outputStream4 != null) {
                                outputStream4.close();
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            m36916b(i10, e, null, r10);
                        } catch (Throwable th5) {
                            i10 = responseCode;
                            th = th5;
                            outputStream = null;
                            r8 = outputStream;
                            outputStream3 = outputStream;
                            if (outputStream3 != null) {
                                outputStream3.close();
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            m36916b(i10, null, null, r8);
                            throw th;
                        }
                    } catch (IOException e15) {
                        i10 = responseCode;
                        e = e15;
                        r10 = r11;
                        outputStream4 = null;
                        if (outputStream4 != null) {
                            outputStream4.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        m36916b(i10, e, null, r10);
                    } catch (Throwable th6) {
                        i10 = responseCode;
                        th = th6;
                        r8 = r11;
                        outputStream3 = null;
                        if (outputStream3 != null) {
                            outputStream3.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        m36916b(i10, null, null, r8);
                        throw th;
                    }
                } catch (IOException e16) {
                    e = e16;
                }
            } catch (Throwable th7) {
                th = th7;
            }
        } catch (IOException e17) {
            e = e17;
            httpURLConnection = null;
            outputStream2 = null;
        } catch (Throwable th8) {
            th = th8;
            httpURLConnection = null;
            outputStream = null;
        }
    }
}
