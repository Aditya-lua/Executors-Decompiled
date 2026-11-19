package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import androidx.annotation.NonNull;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;
import pe.x;
import y1.f;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f<c> f2428a = f.B();
    public static final Object b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static c f2429c = null;

    public static class a {
        public static PackageInfo a(PackageManager packageManager, Context context) {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f2430a;
        public final int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f2431c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f2432d;

        public b(int i10, int i11, long j10, long j11) {
            this.f2430a = i10;
            this.b = i11;
            this.f2431c = j10;
            this.f2432d = j11;
        }

        public static b a(@NonNull File file) throws IOException {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                b bVar = new b(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return bVar;
            } catch (Throwable th2) {
                try {
                    dataInputStream.close();
                    throw th2;
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                    throw th2;
                }
            }
        }

        public void b(@NonNull File file) throws IOException {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f2430a);
                dataOutputStream.writeInt(this.b);
                dataOutputStream.writeLong(this.f2431c);
                dataOutputStream.writeLong(this.f2432d);
                dataOutputStream.close();
            } catch (Throwable th2) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof b)) {
                b bVar = (b) obj;
                if (this.b == bVar.b && this.f2431c == bVar.f2431c && this.f2430a == bVar.f2430a && this.f2432d == bVar.f2432d) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.b), Long.valueOf(this.f2431c), Integer.valueOf(this.f2430a), Long.valueOf(this.f2432d));
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f2433a;
        public final boolean b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f2434c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f2435d;

        public c(int i10, boolean z10, boolean z11, boolean z12) {
            this.f2433a = i10;
            this.f2434c = z11;
            this.b = z10;
            this.f2435d = z12;
        }

        public int a() {
            return this.f2433a;
        }

        public boolean b() {
            return this.f2434c;
        }

        public boolean c() {
            return this.b;
        }
    }

    @NonNull
    public static x<c> a() {
        return f2428a;
    }

    public static long b(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? a.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static c c(int i10, boolean z10, boolean z11, boolean z12) {
        c cVar = new c(i10, z10, z11, z12);
        f2429c = cVar;
        f2428a.x(cVar);
        return f2429c;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x00f6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x00a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x002b  */
    /* JADX WARN: Code duplicated, block: B:21:0x002d  */
    /* JADX WARN: Code duplicated, block: B:43:0x006e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0091  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ca A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ce A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x00d0  */
    @NonNull
    public static c d(@NonNull Context context, boolean z10) {
        int i10;
        boolean z11;
        int i11;
        File file;
        boolean z12;
        File file2;
        long length;
        boolean z13;
        File file3;
        b bVarA;
        b bVar;
        int i12;
        AssetFileDescriptor assetFileDescriptorOpenFd;
        c cVar;
        if (!z10 && (cVar = f2429c) != null) {
            return cVar;
        }
        synchronized (b) {
            if (z10) {
                i10 = 0;
                assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                if (assetFileDescriptorOpenFd.getLength() > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                assetFileDescriptorOpenFd.close();
                i11 = Build.VERSION.SDK_INT;
                if (i11 >= 28) {
                    file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length2 = file.length();
                    if (file.exists()) {
                        z12 = false;
                    } else {
                        z12 = false;
                    }
                    file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    length = file2.length();
                    if (file2.exists()) {
                        z13 = false;
                    } else {
                        z13 = false;
                    }
                    long jB = b(context);
                    file3 = new File(context.getFilesDir(), "profileInstalled");
                    if (file3.exists()) {
                        bVarA = b.a(file3);
                    } else {
                        bVarA = null;
                    }
                    if (bVarA == null) {
                        if (!z11) {
                            i10 = 327680;
                        } else if (z12) {
                            i10 = 1;
                        } else if (z13) {
                            i10 = 2;
                        }
                    } else if (!z11) {
                        i10 = 327680;
                    } else if (z12) {
                        i10 = 1;
                    } else if (z13) {
                        i10 = 2;
                    }
                    if (z10) {
                        i10 = 2;
                    }
                    if (bVarA != null) {
                        i10 = 3;
                    }
                    int i13 = i10;
                    bVar = new b(1, i13, jB, length);
                    if (bVarA != null) {
                        bVar.b(file3);
                    } else {
                        bVar.b(file3);
                    }
                    return c(i13, z12, z13, z11);
                }
                return c(262144, false, false, z11);
            }
            c cVar2 = f2429c;
            if (cVar2 != null) {
                return cVar2;
            }
            i10 = 0;
            try {
                assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                try {
                    if (assetFileDescriptorOpenFd.getLength() > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    assetFileDescriptorOpenFd.close();
                } catch (Throwable th2) {
                    if (assetFileDescriptorOpenFd == null) {
                        throw th2;
                    }
                    try {
                        assetFileDescriptorOpenFd.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            } catch (IOException unused) {
                z11 = false;
            }
            i11 = Build.VERSION.SDK_INT;
            if (i11 >= 28 && i11 != 30) {
                file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                long length3 = file.length();
                if (file.exists() || length3 <= 0) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                length = file2.length();
                if (file2.exists() || length <= 0) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                try {
                    long jB2 = b(context);
                    file3 = new File(context.getFilesDir(), "profileInstalled");
                    if (file3.exists()) {
                        try {
                            bVarA = b.a(file3);
                        } catch (IOException unused2) {
                            return c(131072, z12, z13, z11);
                        }
                    } else {
                        bVarA = null;
                    }
                    if (bVarA == null && bVarA.f2431c == jB2 && (i12 = bVarA.b) != 2) {
                        i10 = i12;
                    } else if (!z11) {
                        i10 = 327680;
                    } else if (z12) {
                        i10 = 1;
                    } else if (z13) {
                        i10 = 2;
                    }
                    if (z10 && z13 && i10 != 1) {
                        i10 = 2;
                    }
                    if (bVarA != null && bVarA.b == 2 && i10 == 1 && length3 < bVarA.f2432d) {
                        i10 = 3;
                    }
                    int i14 = i10;
                    bVar = new b(1, i14, jB2, length);
                    if (bVarA != null || !bVarA.equals(bVar)) {
                        try {
                            bVar.b(file3);
                        } catch (IOException unused3) {
                            i14 = 196608;
                        }
                    }
                    return c(i14, z12, z13, z11);
                } catch (PackageManager.NameNotFoundException unused4) {
                    return c(65536, z12, z13, z11);
                }
            }
            return c(262144, false, false, z11);
            throw th;
        }
    }
}
