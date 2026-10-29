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
import ne.InterfaceFutureC9440x;
import p563y1.C13000f;

/* JADX INFO: renamed from: androidx.profileinstaller.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1002d {

    /* JADX INFO: renamed from: a */
    public static final C13000f<c> f3774a = C13000f.m48325B();

    /* JADX INFO: renamed from: b */
    public static final Object f3775b = new Object();

    /* JADX INFO: renamed from: c */
    public static c f3776c = null;

    /* JADX INFO: renamed from: androidx.profileinstaller.d$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static PackageInfo m5065a(PackageManager packageManager, Context context) {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        }
    }

    /* JADX INFO: renamed from: androidx.profileinstaller.d$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final int f3777a;

        /* JADX INFO: renamed from: b */
        public final int f3778b;

        /* JADX INFO: renamed from: c */
        public final long f3779c;

        /* JADX INFO: renamed from: d */
        public final long f3780d;

        public b(int i10, int i11, long j10, long j11) {
            this.f3777a = i10;
            this.f3778b = i11;
            this.f3779c = j10;
            this.f3780d = j11;
        }

        /* JADX INFO: renamed from: a */
        public static b m5066a(@NonNull File file) throws IOException {
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

        /* JADX INFO: renamed from: b */
        public void m5067b(@NonNull File file) throws IOException {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f3777a);
                dataOutputStream.writeInt(this.f3778b);
                dataOutputStream.writeLong(this.f3779c);
                dataOutputStream.writeLong(this.f3780d);
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
                if (this.f3778b == bVar.f3778b && this.f3779c == bVar.f3779c && this.f3777a == bVar.f3777a && this.f3780d == bVar.f3780d) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f3778b), Long.valueOf(this.f3779c), Integer.valueOf(this.f3777a), Long.valueOf(this.f3780d));
        }
    }

    /* JADX INFO: renamed from: androidx.profileinstaller.d$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        public final int f3781a;

        /* JADX INFO: renamed from: b */
        public final boolean f3782b;

        /* JADX INFO: renamed from: c */
        public final boolean f3783c;

        /* JADX INFO: renamed from: d */
        public final boolean f3784d;

        public c(int i10, boolean z10, boolean z11, boolean z12) {
            this.f3781a = i10;
            this.f3783c = z11;
            this.f3782b = z10;
            this.f3784d = z12;
        }

        /* JADX INFO: renamed from: a */
        public int m5068a() {
            return this.f3781a;
        }

        /* JADX INFO: renamed from: b */
        public boolean m5069b() {
            return this.f3783c;
        }

        /* JADX INFO: renamed from: c */
        public boolean m5070c() {
            return this.f3782b;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static InterfaceFutureC9440x<c> m5061a() {
        return f3774a;
    }

    /* JADX INFO: renamed from: b */
    public static long m5062b(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? a.m5065a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    /* JADX INFO: renamed from: c */
    public static c m5063c(int i10, boolean z10, boolean z11, boolean z12) {
        c cVar = new c(i10, z10, z11, z12);
        f3776c = cVar;
        f3774a.mo48300x(cVar);
        return f3776c;
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
    /* JADX INFO: renamed from: d */
    public static c m5064d(@NonNull Context context, boolean z10) {
        int i10;
        boolean z11;
        int i11;
        File file;
        boolean z12;
        File file2;
        long length;
        boolean z13;
        File file3;
        b bVarM5066a;
        b bVar;
        int i12;
        AssetFileDescriptor assetFileDescriptorOpenFd;
        c cVar;
        if (!z10 && (cVar = f3776c) != null) {
            return cVar;
        }
        synchronized (f3775b) {
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
                    long jM5062b = m5062b(context);
                    file3 = new File(context.getFilesDir(), "profileInstalled");
                    if (file3.exists()) {
                        bVarM5066a = b.m5066a(file3);
                    } else {
                        bVarM5066a = null;
                    }
                    if (bVarM5066a == null) {
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
                    if (bVarM5066a != null) {
                        i10 = 3;
                    }
                    int i13 = i10;
                    bVar = new b(1, i13, jM5062b, length);
                    if (bVarM5066a != null) {
                        bVar.m5067b(file3);
                    } else {
                        bVar.m5067b(file3);
                    }
                    return m5063c(i13, z12, z13, z11);
                }
                return m5063c(262144, false, false, z11);
            }
            c cVar2 = f3776c;
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
                    long jM5062b2 = m5062b(context);
                    file3 = new File(context.getFilesDir(), "profileInstalled");
                    if (file3.exists()) {
                        try {
                            bVarM5066a = b.m5066a(file3);
                        } catch (IOException unused2) {
                            return m5063c(131072, z12, z13, z11);
                        }
                    } else {
                        bVarM5066a = null;
                    }
                    if (bVarM5066a == null && bVarM5066a.f3779c == jM5062b2 && (i12 = bVarM5066a.f3778b) != 2) {
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
                    if (bVarM5066a != null && bVarM5066a.f3778b == 2 && i10 == 1 && length3 < bVarM5066a.f3780d) {
                        i10 = 3;
                    }
                    int i14 = i10;
                    bVar = new b(1, i14, jM5062b2, length);
                    if (bVarM5066a != null || !bVarM5066a.equals(bVar)) {
                        try {
                            bVar.m5067b(file3);
                        } catch (IOException unused3) {
                            i14 = 196608;
                        }
                    }
                    return m5063c(i14, z12, z13, z11);
                } catch (PackageManager.NameNotFoundException unused4) {
                    return m5063c(65536, z12, z13, z11);
                }
            }
            return m5063c(262144, false, false, z11);
            throw th;
        }
    }
}
