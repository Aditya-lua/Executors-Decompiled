package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import p305n9.C8953m;
import sb.C11264k;

/* JADX INFO: renamed from: com.google.firebase.messaging.d0 */
/* JADX INFO: loaded from: classes2.dex */
public class C2986d0 implements Closeable {

    /* JADX INFO: renamed from: a */
    public final URL f11260a;

    /* JADX INFO: renamed from: b */
    public volatile Future<?> f11261b;

    /* JADX INFO: renamed from: c */
    public Task<Bitmap> f11262c;

    public C2986d0(URL url) {
        this.f11260a = url;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m14509a(C2986d0 c2986d0, C11264k c11264k) {
        c2986d0.getClass();
        try {
            c11264k.m42328c(c2986d0.m14511b());
        } catch (Exception e10) {
            c11264k.m42327b(e10);
        }
    }

    /* JADX INFO: renamed from: d */
    public static C2986d0 m14510d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new C2986d0(new URL(str));
        } catch (MalformedURLException unused) {
            Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + str);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public Bitmap m14511b() throws IOException {
        if (Log.isLoggable("FirebaseMessaging", 4)) {
            Log.i("FirebaseMessaging", "Starting download of: " + this.f11260a);
        }
        byte[] bArrM14512c = m14512c();
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrM14512c, 0, bArrM14512c.length);
        if (bitmapDecodeByteArray == null) {
            throw new IOException("Failed to decode image: " + this.f11260a);
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Successfully downloaded image: " + this.f11260a);
        }
        return bitmapDecodeByteArray;
    }

    /* JADX INFO: renamed from: c */
    public final byte[] m14512c() throws IOException {
        URLConnection uRLConnectionOpenConnection = this.f11260a.openConnection();
        if (uRLConnectionOpenConnection.getContentLength() > 1048576) {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        try {
            byte[] bArrM14469d = C2979b.m14469d(C2979b.m14467b(inputStream, 1048577L));
            if (inputStream != null) {
                inputStream.close();
            }
            if (Log.isLoggable("FirebaseMessaging", 2)) {
                Log.v("FirebaseMessaging", "Downloaded " + bArrM14469d.length + " bytes from " + this.f11260a);
            }
            if (bArrM14469d.length <= 1048576) {
                return bArrM14469d;
            }
            throw new IOException("Image exceeds max size of 1048576");
        } catch (Throwable th2) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f11261b.cancel(true);
    }

    /* JADX INFO: renamed from: e */
    public Task<Bitmap> m14513e() {
        return (Task) C8953m.m36047l(this.f11262c);
    }

    /* JADX INFO: renamed from: f */
    public void m14514f(ExecutorService executorService) {
        final C11264k c11264k = new C11264k();
        this.f11261b = executorService.submit(new Runnable() { // from class: com.google.firebase.messaging.c0
            @Override // java.lang.Runnable
            public final void run() {
                C2986d0.m14509a(this.f11254a, c11264k);
            }
        });
        this.f11262c = c11264k.m42326a();
    }
}
