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
import p458u4.C11791b;
import p458u4.C11792c;
import p458u4.C11798i;
import p458u4.C11799j;

/* JADX INFO: renamed from: androidx.profileinstaller.b */
/* JADX INFO: loaded from: classes.dex */
public class C1000b {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final AssetManager f3761a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final Executor f3762b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final C1001c.c f3763c;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final File f3765e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final String f3766f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final String f3767g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final String f3768h;

    /* JADX INFO: renamed from: j */
    public C11791b[] f3770j;

    /* JADX INFO: renamed from: k */
    public byte[] f3771k;

    /* JADX INFO: renamed from: i */
    public boolean f3769i = false;

    /* JADX INFO: renamed from: d */
    public final byte[] f3764d = m5038d();

    public C1000b(@NonNull AssetManager assetManager, @NonNull Executor executor, @NonNull C1001c.c cVar, @NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull File file) {
        this.f3761a = assetManager;
        this.f3762b = executor;
        this.f3763c = cVar;
        this.f3766f = str;
        this.f3767g = str2;
        this.f3768h = str3;
        this.f3765e = file;
    }

    /* JADX INFO: renamed from: d */
    public static byte[] m5038d() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            return C11799j.f41540a;
        }
        switch (i10) {
            case 26:
                return C11799j.f41543d;
            case 27:
                return C11799j.f41542c;
            case 28:
            case 29:
            case 30:
                return C11799j.f41541b;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: j */
    public static boolean m5039j() {
        return Build.VERSION.SDK_INT >= 31;
    }

    /* JADX INFO: renamed from: b */
    public final C1000b m5040b(C11791b[] c11791bArr, byte[] bArr) {
        try {
            InputStream inputStreamM5044g = m5044g(this.f3761a, this.f3768h);
            if (inputStreamM5044g == null) {
                if (inputStreamM5044g != null) {
                    inputStreamM5044g.close();
                }
                return null;
            }
            try {
                this.f3770j = C11798i.m44141r(inputStreamM5044g, C11798i.m44139p(inputStreamM5044g, C11798i.f41539b), bArr, c11791bArr);
                inputStreamM5044g.close();
                return this;
            } catch (Throwable th2) {
                try {
                    inputStreamM5044g.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (FileNotFoundException e10) {
            this.f3763c.mo5024a(9, e10);
        } catch (IOException e11) {
            this.f3763c.mo5024a(7, e11);
        } catch (IllegalStateException e12) {
            this.f3770j = null;
            this.f3763c.mo5024a(8, e12);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m5041c() {
        if (!this.f3769i) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean m5042e() {
        if (this.f3764d == null) {
            m5047k(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        if (!this.f3765e.exists()) {
            try {
                if (!this.f3765e.createNewFile()) {
                    m5047k(4, null);
                    return false;
                }
            } catch (IOException unused) {
                m5047k(4, null);
                return false;
            }
        } else if (!this.f3765e.canWrite()) {
            m5047k(4, null);
            return false;
        }
        this.f3769i = true;
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final InputStream m5043f(AssetManager assetManager) {
        try {
            return m5044g(assetManager, this.f3767g);
        } catch (FileNotFoundException e10) {
            this.f3763c.mo5024a(6, e10);
            return null;
        } catch (IOException e11) {
            this.f3763c.mo5024a(7, e11);
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public final InputStream m5044g(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e10) {
            String message = e10.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f3763c.mo5025b(5, null);
            }
            return null;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: h */
    public C1000b m5045h() {
        C1000b c1000bM5040b;
        m5041c();
        if (this.f3764d != null) {
            InputStream inputStreamM5043f = m5043f(this.f3761a);
            if (inputStreamM5043f != null) {
                this.f3770j = m5046i(inputStreamM5043f);
            }
            C11791b[] c11791bArr = this.f3770j;
            if (c11791bArr != null && m5039j() && (c1000bM5040b = m5040b(c11791bArr, this.f3764d)) != null) {
                return c1000bM5040b;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: i */
    public final C11791b[] m5046i(InputStream inputStream) {
        try {
            try {
                try {
                    C11791b[] c11791bArrM44147x = C11798i.m44147x(inputStream, C11798i.m44139p(inputStream, C11798i.f41538a), this.f3766f);
                    try {
                        inputStream.close();
                        return c11791bArrM44147x;
                    } catch (IOException e10) {
                        this.f3763c.mo5024a(7, e10);
                        return c11791bArrM44147x;
                    }
                } catch (IllegalStateException e11) {
                    this.f3763c.mo5024a(8, e11);
                    try {
                        inputStream.close();
                    } catch (IOException e12) {
                        this.f3763c.mo5024a(7, e12);
                    }
                    return null;
                }
            } catch (IOException e13) {
                this.f3763c.mo5024a(7, e13);
                inputStream.close();
                return null;
            }
        } catch (Throwable th2) {
            try {
                inputStream.close();
            } catch (IOException e14) {
                this.f3763c.mo5024a(7, e14);
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m5047k(final int i10, final Object obj) {
        this.f3762b.execute(new Runnable() { // from class: u4.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f41512a.f3763c.mo5024a(i10, obj);
            }
        });
    }

    @NonNull
    /* JADX INFO: renamed from: l */
    public C1000b m5048l() {
        C11791b[] c11791bArr = this.f3770j;
        byte[] bArr = this.f3764d;
        if (c11791bArr != null && bArr != null) {
            m5041c();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    C11798i.m44112F(byteArrayOutputStream, bArr);
                    if (!C11798i.m44109C(byteArrayOutputStream, bArr, c11791bArr)) {
                        this.f3763c.mo5024a(5, null);
                        this.f3770j = null;
                        byteArrayOutputStream.close();
                        return this;
                    }
                    this.f3771k = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    this.f3770j = null;
                } catch (Throwable th2) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (IOException e10) {
                this.f3763c.mo5024a(7, e10);
            } catch (IllegalStateException e11) {
                this.f3763c.mo5024a(8, e11);
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: m */
    public boolean m5049m() {
        byte[] bArr = this.f3771k;
        if (bArr == null) {
            return false;
        }
        m5041c();
        try {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(this.f3765e);
                    try {
                        FileChannel channel = fileOutputStream.getChannel();
                        try {
                            FileLock fileLockTryLock = channel.tryLock();
                            try {
                                C11792c.m44098l(byteArrayInputStream, fileOutputStream, fileLockTryLock);
                                m5047k(1, null);
                                if (fileLockTryLock != null) {
                                    fileLockTryLock.close();
                                }
                                channel.close();
                                fileOutputStream.close();
                                byteArrayInputStream.close();
                                this.f3771k = null;
                                this.f3770j = null;
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
                m5047k(6, e10);
                this.f3771k = null;
                this.f3770j = null;
                return false;
            } catch (IOException e11) {
                m5047k(7, e11);
                this.f3771k = null;
                this.f3770j = null;
                return false;
            }
        } catch (Throwable th10) {
            this.f3771k = null;
            this.f3770j = null;
            throw th10;
        }
    }
}
