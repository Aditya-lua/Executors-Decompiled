package sg;

import android.os.AsyncTask;
import android.os.Build;
import com.roblox.engine.jni.NativeSettingsInterface;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public class u {
    public static u b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f31062a = false;

    public class a extends AsyncTask<Void, Void, Boolean> {
        public a(c cVar) {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Void... voidArr) {
            return Boolean.valueOf(u.this.e() || u.this.f());
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            u.this.f31062a = bool.booleanValue();
        }
    }

    public enum b {
        UNKNOWN,
        ARM32,
        ARM64,
        X86_64;

        public static b b(int i10) {
            if (i10 == 1) {
                return ARM32;
            }
            if (i10 != 2) {
                return i10 != 3 ? UNKNOWN : X86_64;
            }
            return ARM64;
        }
    }

    public interface c {
    }

    public static u g() {
        u uVar = b;
        if (uVar != null) {
            return uVar;
        }
        synchronized (u.class) {
            try {
                if (b == null) {
                    b = new u();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return b;
    }

    public void d(c cVar) {
        new a(cVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public final boolean e() {
        String str = Build.TAGS;
        return str != null && str.contains("test-keys");
    }

    public final boolean f() {
        String[] strArr = {"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su"};
        for (int i10 = 0; i10 < 10; i10++) {
            try {
                if (new File(strArr[i10]).exists()) {
                    return true;
                }
            } catch (SecurityException unused) {
            }
        }
        return false;
    }

    public boolean h() {
        return this.f31062a;
    }

    public b i() {
        return b.b(NativeSettingsInterface.getRunningArchitecture());
    }
}
