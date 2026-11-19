package ob;

import com.google.mlkit.vision.barcode.common.Barcode;
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

/* JADX INFO: loaded from: classes.dex */
public final class za implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final URL f28035a;
    public final byte[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xa f28036c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f28037d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f28038e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ab f28039f;

    public za(ab abVar, String str, URL url, byte[] bArr, Map map, xa xaVar) {
        Objects.requireNonNull(abVar);
        this.f28039f = abVar;
        o9.s.f(str);
        o9.s.l(url);
        o9.s.l(xaVar);
        this.f28035a = url;
        this.b = bArr;
        this.f28036c = xaVar;
        this.f28037d = str;
        this.f28038e = map;
    }

    public final /* synthetic */ void a(int i10, Exception exc, byte[] bArr, Map map) {
        this.f28036c.a(this.f28037d, i10, exc, bArr, map);
    }

    public final void b(final int i10, final Exception exc, final byte[] bArr, final Map map) {
        this.f28039f.f27641a.b().t(new Runnable() { // from class: ob.ya
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f27997a.a(i10, exc, bArr, map);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:77:0x0151  */
    /* JADX WARN: Code duplicated, block: B:87:0x0179  */
    /* JADX WARN: Code duplicated, block: B:90:0x0135 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x015d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [ob.za] */
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
        ?? r10;
        OutputStream outputStream3;
        ?? r11;
        OutputStream outputStream4;
        InputStream inputStream;
        ab abVar = this.f28039f;
        abVar.g();
        int i10 = 0;
        try {
            URL url = this.f28035a;
            int i11 = com.google.android.gms.internal.measurement.m1.f6605a;
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                throw new IOException("Failed to obtain HTTP connection");
            }
            httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setDefaultUseCaches(false);
            l7 l7Var = abVar.f27641a;
            l7Var.w();
            httpURLConnection.setConnectTimeout(60000);
            l7Var.w();
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            ?? r12 = 1;
            httpURLConnection.setDoInput(true);
            try {
                try {
                    Map map = this.f28038e;
                    if (map != null) {
                        for (Map.Entry entry : map.entrySet()) {
                            httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                        }
                    }
                    byte[] bArr = this.b;
                    if (bArr != null) {
                        try {
                            l7Var.c();
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                            gZIPOutputStream.write(bArr);
                            gZIPOutputStream.close();
                            byteArrayOutputStream.close();
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            z5 z5VarW = this.f28039f.f27641a.a().w();
                            int length = byteArray.length;
                            z5VarW.b("Uploading data. size", Integer.valueOf(length));
                            httpURLConnection.setDoOutput(true);
                            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
                            httpURLConnection.setFixedLengthStreamingMode(length);
                            httpURLConnection.connect();
                            OutputStream outputStream5 = httpURLConnection.getOutputStream();
                            try {
                                outputStream5.write(byteArray);
                                outputStream5.close();
                                r12 = outputStream5;
                            } catch (IOException e10) {
                                e = e10;
                                r11 = 0;
                                outputStream4 = outputStream5;
                                if (outputStream4 != null) {
                                    try {
                                        outputStream4.close();
                                    } catch (IOException e11) {
                                        this.f28039f.f27641a.a().o().c("Error closing HTTP compressed POST connection output stream. appId", b6.x(this.f28037d), e11);
                                    }
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                b(i10, e, null, r11);
                            } catch (Throwable th2) {
                                th = th2;
                                r10 = 0;
                                outputStream3 = outputStream5;
                                if (outputStream3 != null) {
                                    try {
                                        outputStream3.close();
                                    } catch (IOException e12) {
                                        this.f28039f.f27641a.a().o().c("Error closing HTTP compressed POST connection output stream. appId", b6.x(this.f28037d), e12);
                                    }
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                b(i10, null, null, r10);
                                throw th;
                            }
                        } catch (IOException e13) {
                            this.f28039f.f27641a.a().o().b("Failed to gzip post request content", e13);
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
                                    byte[] bArr2 = new byte[Barcode.FORMAT_UPC_E];
                                    while (true) {
                                        int i12 = inputStream.read(bArr2);
                                        if (i12 <= 0) {
                                            byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                                            inputStream.close();
                                            httpURLConnection.disconnect();
                                            b(responseCode, null, byteArray2, headerFields);
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
                            r11 = outputStream2;
                            outputStream4 = outputStream2;
                            if (outputStream4 != null) {
                                outputStream4.close();
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            b(i10, e, null, r11);
                        } catch (Throwable th5) {
                            i10 = responseCode;
                            th = th5;
                            outputStream = null;
                            r10 = outputStream;
                            outputStream3 = outputStream;
                            if (outputStream3 != null) {
                                outputStream3.close();
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            b(i10, null, null, r10);
                            throw th;
                        }
                    } catch (IOException e15) {
                        i10 = responseCode;
                        e = e15;
                        r11 = r12;
                        outputStream4 = null;
                        if (outputStream4 != null) {
                            outputStream4.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        b(i10, e, null, r11);
                    } catch (Throwable th6) {
                        i10 = responseCode;
                        th = th6;
                        r10 = r12;
                        outputStream3 = null;
                        if (outputStream3 != null) {
                            outputStream3.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        b(i10, null, null, r10);
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
