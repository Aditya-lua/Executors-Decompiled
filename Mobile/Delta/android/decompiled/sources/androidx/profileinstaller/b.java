package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.annotation.NonNull;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.concurrent.Executor;
import u4.i;
import u4.j;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final AssetManager f2870a;

    @NonNull
    public final Executor b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final c.InterfaceC0051c f2871c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final File f2873e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final String f2874f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final String f2875g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final String f2876h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public u4.b[] f2878j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public byte[] f2879k;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f2877i = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f2872d = d();

    public b(@NonNull AssetManager assetManager, @NonNull Executor executor, @NonNull c.InterfaceC0051c interfaceC0051c, @NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull File file) {
        this.f2870a = assetManager;
        this.b = executor;
        this.f2871c = interfaceC0051c;
        this.f2874f = str;
        this.f2875g = str2;
        this.f2876h = str3;
        this.f2873e = file;
    }

    public static byte[] d() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            return j.f32069a;
        }
        switch (i10) {
            case 26:
                return j.f32071d;
            case 27:
                return j.f32070c;
            case 28:
            case 29:
            case 30:
                return j.b;
            default:
                return null;
        }
    }

    public static boolean j() {
        return Build.VERSION.SDK_INT >= 31;
    }

    public final b b(u4.b[] bVarArr, byte[] bArr) {
        try {
            InputStream inputStreamG = g(this.f2870a, this.f2876h);
            if (inputStreamG == null) {
                if (inputStreamG != null) {
                    inputStreamG.close();
                }
                return null;
            }
            try {
                this.f2878j = i.r(inputStreamG, i.p(inputStreamG, i.b), bArr, bVarArr);
                inputStreamG.close();
                return this;
            } catch (Throwable th2) {
                try {
                    inputStreamG.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (FileNotFoundException e10) {
            this.f2871c.a(9, e10);
        } catch (IOException e11) {
            this.f2871c.a(7, e11);
        } catch (IllegalStateException e12) {
            this.f2878j = null;
            this.f2871c.a(8, e12);
        }
    }

    public final void c() {
        if (!this.f2877i) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    public boolean e() {
        if (this.f2872d == null) {
            k(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        if (!this.f2873e.exists()) {
            try {
                if (!this.f2873e.createNewFile()) {
                    k(4, null);
                    return false;
                }
            } catch (IOException unused) {
                k(4, null);
                return false;
            }
        } else if (!this.f2873e.canWrite()) {
            k(4, null);
            return false;
        }
        this.f2877i = true;
        return true;
    }

    public final InputStream f(AssetManager assetManager) {
        try {
            return g(assetManager, this.f2875g);
        } catch (FileNotFoundException e10) {
            this.f2871c.a(6, e10);
            return null;
        } catch (IOException e11) {
            this.f2871c.a(7, e11);
            return null;
        }
    }

    public final InputStream g(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e10) {
            String message = e10.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f2871c.b(5, null);
            }
            return null;
        }
    }

    @NonNull
    public b h() {
        b bVarB;
        c();
        if (this.f2872d != null) {
            InputStream inputStreamF = f(this.f2870a);
            if (inputStreamF != null) {
                this.f2878j = i(inputStreamF);
            }
            u4.b[] bVarArr = this.f2878j;
            if (bVarArr != null && j() && (bVarB = b(bVarArr, this.f2872d)) != null) {
                return bVarB;
            }
        }
        return this;
    }

    public final u4.b[] i(InputStream inputStream) {
        try {
            try {
                try {
                    u4.b[] bVarArrX = i.x(inputStream, i.p(inputStream, i.f32068a), this.f2874f);
                    try {
                        inputStream.close();
                        return bVarArrX;
                    } catch (IOException e10) {
                        this.f2871c.a(7, e10);
                        return bVarArrX;
                    }
                } catch (IllegalStateException e11) {
                    this.f2871c.a(8, e11);
                    try {
                        inputStream.close();
                    } catch (IOException e12) {
                        this.f2871c.a(7, e12);
                    }
                    return null;
                }
            } catch (IOException e13) {
                this.f2871c.a(7, e13);
                inputStream.close();
                return null;
            }
        } catch (Throwable th2) {
            try {
                inputStream.close();
            } catch (IOException e14) {
                this.f2871c.a(7, e14);
            }
            throw th2;
        }
    }

    public final void k(final int i10, final Object obj) {
        this.b.execute(new Runnable() { // from class: u4.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f32047a.f2871c.a(i10, obj);
            }
        });
    }

    @NonNull
    public b l() {
        u4.b[] bVarArr = this.f2878j;
        byte[] bArr = this.f2872d;
        if (bVarArr != null && bArr != null) {
            c();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    i.F(byteArrayOutputStream, bArr);
                    if (!i.C(byteArrayOutputStream, bArr, bVarArr)) {
                        this.f2871c.a(5, null);
                        this.f2878j = null;
                        byteArrayOutputStream.close();
                        return this;
                    }
                    this.f2879k = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    this.f2878j = null;
                } catch (Throwable th2) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (IOException e10) {
                this.f2871c.a(7, e10);
            } catch (IllegalStateException e11) {
                this.f2871c.a(8, e11);
            }
        }
        return this;
    }

    public boolean m() {
        byte[] bArr = this.f2879k;
        if (bArr == null) {
            return false;
        }
        c();
        try {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(this.f2873e);
                    try {
                        FileChannel channel = fileOutputStream.getChannel();
                        try {
                            FileLock fileLockTryLock = channel.tryLock();
                            try {
                                u4.c.l(byteArrayInputStream, fileOutputStream, fileLockTryLock);
                                k(1, null);
                                if (fileLockTryLock != null) {
                                    fileLockTryLock.close();
                                }
                                channel.close();
                                fileOutputStream.close();
                                byteArrayInputStream.close();
                                this.f2879k = null;
                                this.f2878j = null;
                                return true;
                            } catch (Throwable th2) {
                                if (fileLockTryLock != null) {
                                    try {
                                        fileLockTryLock.close();
                                    } catch (Throwable th3) {
                                        th2.addSuppressed(th3);
                                    }
                                }
                                throw th2;
                            }
                        } catch (Throwable th4) {
                            if (channel != null) {
                                try {
                                    channel.close();
                                } catch (Throwable th5) {
                                    th4.addSuppressed(th5);
                                }
                            }
                            throw th4;
                        }
                    } catch (Throwable th6) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th7) {
                            th6.addSuppressed(th7);
                        }
                        throw th6;
                    }
                } catch (Throwable th8) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th9) {
                        th8.addSuppressed(th9);
                    }
                    throw th8;
                }
            } catch (FileNotFoundException e10) {
                k(6, e10);
                this.f2879k = null;
                this.f2878j = null;
                return false;
            } catch (IOException e11) {
                k(7, e11);
                this.f2879k = null;
                this.f2878j = null;
                return false;
            }
        } catch (Throwable th10) {
            this.f2879k = null;
            this.f2878j = null;
            throw th10;
        }
    }
}
