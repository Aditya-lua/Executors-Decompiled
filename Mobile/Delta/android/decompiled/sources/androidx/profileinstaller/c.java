package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.util.Log;
import androidx.annotation.NonNull;
import e3.n;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final InterfaceC0051c f2880a = new a();

    @NonNull
    public static final InterfaceC0051c b = new b();

    public class a implements InterfaceC0051c {
        @Override // androidx.profileinstaller.c.InterfaceC0051c
        public void a(int i10, Object obj) {
        }

        @Override // androidx.profileinstaller.c.InterfaceC0051c
        public void b(int i10, Object obj) {
        }
    }

    public class b implements InterfaceC0051c {
        @Override // androidx.profileinstaller.c.InterfaceC0051c
        public void a(int i10, Object obj) {
            String str;
            switch (i10) {
                case 1:
                    str = "RESULT_INSTALL_SUCCESS";
                    break;
                case 2:
                    str = "RESULT_ALREADY_INSTALLED";
                    break;
                case 3:
                    str = "RESULT_UNSUPPORTED_ART_VERSION";
                    break;
                case 4:
                    str = "RESULT_NOT_WRITABLE";
                    break;
                case 5:
                    str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                    break;
                case 6:
                    str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                    break;
                case 7:
                    str = "RESULT_IO_EXCEPTION";
                    break;
                case 8:
                    str = "RESULT_PARSE_EXCEPTION";
                    break;
                case 9:
                default:
                    str = "";
                    break;
                case 10:
                    str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                    break;
                case 11:
                    str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                    break;
            }
            if (i10 == 6 || i10 == 7 || i10 == 8) {
                Log.e("ProfileInstaller", str, (Throwable) obj);
            } else {
                Log.d("ProfileInstaller", str);
            }
        }

        @Override // androidx.profileinstaller.c.InterfaceC0051c
        public void b(int i10, Object obj) {
            String str;
            if (i10 == 1) {
                str = "DIAGNOSTIC_CURRENT_PROFILE_EXISTS";
            } else if (i10 == 2) {
                str = "DIAGNOSTIC_CURRENT_PROFILE_DOES_NOT_EXIST";
            } else if (i10 == 3) {
                str = "DIAGNOSTIC_REF_PROFILE_EXISTS";
            } else if (i10 != 4) {
                str = i10 != 5 ? "" : "DIAGNOSTIC_PROFILE_IS_COMPRESSED";
            } else {
                str = "DIAGNOSTIC_REF_PROFILE_DOES_NOT_EXIST";
            }
            Log.d("ProfileInstaller", str);
        }
    }

    /* JADX INFO: renamed from: androidx.profileinstaller.c$c, reason: collision with other inner class name */
    public interface InterfaceC0051c {
        void a(int i10, Object obj);

        void b(int i10, Object obj);
    }

    public static boolean b(@NonNull File file) {
        return new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
    }

    public static void c(@NonNull Context context, @NonNull Executor executor, @NonNull InterfaceC0051c interfaceC0051c) {
        b(context.getFilesDir());
        f(executor, interfaceC0051c, 11, null);
    }

    public static boolean d(PackageInfo packageInfo, File file, InterfaceC0051c interfaceC0051c) {
        File file2 = new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
        if (!file2.exists()) {
            return false;
        }
        try {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file2));
            try {
                long j10 = dataInputStream.readLong();
                dataInputStream.close();
                boolean z10 = j10 == packageInfo.lastUpdateTime;
                if (z10) {
                    interfaceC0051c.a(2, null);
                }
                return z10;
            } catch (Throwable th2) {
                try {
                    dataInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException unused) {
            return false;
        }
    }

    public static void e(@NonNull PackageInfo packageInfo, @NonNull File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } catch (Throwable th2) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException unused) {
        }
    }

    public static void f(@NonNull Executor executor, @NonNull final InterfaceC0051c interfaceC0051c, final int i10, final Object obj) {
        executor.execute(new Runnable() { // from class: u4.e
            @Override // java.lang.Runnable
            public final void run() {
                interfaceC0051c.a(i10, obj);
            }
        });
    }

    public static boolean g(@NonNull AssetManager assetManager, @NonNull String str, @NonNull PackageInfo packageInfo, @NonNull File file, @NonNull String str2, @NonNull Executor executor, @NonNull InterfaceC0051c interfaceC0051c) {
        androidx.profileinstaller.b bVar = new androidx.profileinstaller.b(assetManager, executor, interfaceC0051c, str2, "dexopt/baseline.prof", "dexopt/baseline.profm", new File(new File("/data/misc/profiles/cur/0", str), "primary.prof"));
        if (!bVar.e()) {
            return false;
        }
        boolean zM = bVar.h().l().m();
        if (zM) {
            e(packageInfo, file);
        }
        return zM;
    }

    public static void h(@NonNull Context context) {
        i(context, new n(), f2880a);
    }

    public static void i(@NonNull Context context, @NonNull Executor executor, @NonNull InterfaceC0051c interfaceC0051c) {
        j(context, executor, interfaceC0051c, false);
    }

    public static void j(@NonNull Context context, @NonNull Executor executor, @NonNull InterfaceC0051c interfaceC0051c, boolean z10) {
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        boolean z11 = false;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z10 && d(packageInfo, filesDir, interfaceC0051c)) {
                Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                d.d(context, false);
                return;
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            if (g(assets, packageName, packageInfo, filesDir, name, executor, interfaceC0051c) && z10) {
                z11 = true;
            }
            d.d(context, z11);
        } catch (PackageManager.NameNotFoundException e10) {
            interfaceC0051c.a(7, e10);
            d.d(context, false);
        }
    }

    public static void k(@NonNull Context context, @NonNull Executor executor, @NonNull InterfaceC0051c interfaceC0051c) {
        try {
            e(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
            f(executor, interfaceC0051c, 10, null);
        } catch (PackageManager.NameNotFoundException e10) {
            f(executor, interfaceC0051c, 7, e10);
        }
    }
}
