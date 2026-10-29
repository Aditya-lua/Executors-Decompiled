package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.util.Log;
import androidx.annotation.NonNull;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Executor;
import p092e3.ExecutorC4775n;

/* JADX INFO: renamed from: androidx.profileinstaller.c */
/* JADX INFO: loaded from: classes.dex */
public class C1001c {

    /* JADX INFO: renamed from: a */
    public static final c f3772a = new a();

    /* JADX INFO: renamed from: b */
    @NonNull
    public static final c f3773b = new b();

    /* JADX INFO: renamed from: androidx.profileinstaller.c$a */
    public class a implements c {
        @Override // androidx.profileinstaller.C1001c.c
        /* JADX INFO: renamed from: a */
        public void mo5024a(int i10, Object obj) {
        }

        @Override // androidx.profileinstaller.C1001c.c
        /* JADX INFO: renamed from: b */
        public void mo5025b(int i10, Object obj) {
        }
    }

    /* JADX INFO: renamed from: androidx.profileinstaller.c$b */
    public class b implements c {
        @Override // androidx.profileinstaller.C1001c.c
        /* JADX INFO: renamed from: a */
        public void mo5024a(int i10, Object obj) {
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

        @Override // androidx.profileinstaller.C1001c.c
        /* JADX INFO: renamed from: b */
        public void mo5025b(int i10, Object obj) {
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

    /* JADX INFO: renamed from: androidx.profileinstaller.c$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo5024a(int i10, Object obj);

        /* JADX INFO: renamed from: b */
        void mo5025b(int i10, Object obj);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m5051b(@NonNull File file) {
        return new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
    }

    /* JADX INFO: renamed from: c */
    public static void m5052c(@NonNull Context context, @NonNull Executor executor, @NonNull c cVar) {
        m5051b(context.getFilesDir());
        m5055f(executor, cVar, 11, null);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m5053d(PackageInfo packageInfo, File file, c cVar) {
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
                    cVar.mo5024a(2, null);
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

    /* JADX INFO: renamed from: e */
    public static void m5054e(@NonNull PackageInfo packageInfo, @NonNull File file) {
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

    /* JADX INFO: renamed from: f */
    public static void m5055f(@NonNull Executor executor, @NonNull final c cVar, final int i10, final Object obj) {
        executor.execute(new Runnable() { // from class: u4.e
            @Override // java.lang.Runnable
            public final void run() {
                cVar.mo5024a(i10, obj);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public static boolean m5056g(@NonNull AssetManager assetManager, @NonNull String str, @NonNull PackageInfo packageInfo, @NonNull File file, @NonNull String str2, @NonNull Executor executor, @NonNull c cVar) {
        C1000b c1000b = new C1000b(assetManager, executor, cVar, str2, "dexopt/baseline.prof", "dexopt/baseline.profm", new File(new File("/data/misc/profiles/cur/0", str), "primary.prof"));
        if (!c1000b.m5042e()) {
            return false;
        }
        boolean zM5049m = c1000b.m5045h().m5048l().m5049m();
        if (zM5049m) {
            m5054e(packageInfo, file);
        }
        return zM5049m;
    }

    /* JADX INFO: renamed from: h */
    public static void m5057h(@NonNull Context context) {
        m5058i(context, new ExecutorC4775n(), f3772a);
    }

    /* JADX INFO: renamed from: i */
    public static void m5058i(@NonNull Context context, @NonNull Executor executor, @NonNull c cVar) {
        m5059j(context, executor, cVar, false);
    }

    /* JADX INFO: renamed from: j */
    public static void m5059j(@NonNull Context context, @NonNull Executor executor, @NonNull c cVar, boolean z10) {
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        boolean z11 = false;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z10 && m5053d(packageInfo, filesDir, cVar)) {
                Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                C1002d.m5064d(context, false);
                return;
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            if (m5056g(assets, packageName, packageInfo, filesDir, name, executor, cVar) && z10) {
                z11 = true;
            }
            C1002d.m5064d(context, z11);
        } catch (PackageManager.NameNotFoundException e10) {
            cVar.mo5024a(7, e10);
            C1002d.m5064d(context, false);
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m5060k(@NonNull Context context, @NonNull Executor executor, @NonNull c cVar) {
        try {
            m5054e(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
            m5055f(executor, cVar, 10, null);
        } catch (PackageManager.NameNotFoundException e10) {
            m5055f(executor, cVar, 7, e10);
        }
    }
}
