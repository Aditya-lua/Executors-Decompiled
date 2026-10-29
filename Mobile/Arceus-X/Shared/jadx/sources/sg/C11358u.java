package sg;

import android.os.AsyncTask;
import android.os.Build;
import com.roblox.engine.jni.NativeSettingsInterface;
import java.io.File;

/* JADX INFO: renamed from: sg.u */
/* JADX INFO: loaded from: classes2.dex */
public class C11358u {

    /* JADX INFO: renamed from: b */
    public static C11358u f40161b;

    /* JADX INFO: renamed from: a */
    public boolean f40162a = false;

    /* JADX INFO: renamed from: sg.u$a */
    public class a extends AsyncTask<Void, Void, Boolean> {
        public a(c cVar) {
        }

        /* JADX DEBUG: Method merged with bridge method: doInBackground([Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Void... voidArr) {
            return Boolean.valueOf(C11358u.this.m42562e() || C11358u.this.m42563f());
        }

        /* JADX DEBUG: Method merged with bridge method: onPostExecute(Ljava/lang/Object;)V */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            C11358u.this.f40162a = bool.booleanValue();
        }
    }

    /* JADX INFO: renamed from: sg.u$b */
    public enum b {
        UNKNOWN,
        ARM32,
        ARM64,
        X86_64;

        /* JADX INFO: renamed from: b */
        public static b m42569b(int i10) {
            if (i10 == 1) {
                return ARM32;
            }
            if (i10 != 2) {
                return i10 != 3 ? UNKNOWN : X86_64;
            }
            return ARM64;
        }
    }

    /* JADX INFO: renamed from: sg.u$c */
    public interface c {
    }

    /* JADX INFO: renamed from: g */
    public static C11358u m42560g() {
        C11358u c11358u = f40161b;
        if (c11358u != null) {
            return c11358u;
        }
        synchronized (C11358u.class) {
            try {
                if (f40161b == null) {
                    f40161b = new C11358u();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f40161b;
    }

    /* JADX INFO: renamed from: d */
    public void m42561d(c cVar) {
        new a(cVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m42562e() {
        String str = Build.TAGS;
        return str != null && str.contains("test-keys");
    }

    /* JADX INFO: renamed from: f */
    public final boolean m42563f() {
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

    /* JADX INFO: renamed from: h */
    public boolean m42564h() {
        return this.f40162a;
    }

    /* JADX INFO: renamed from: i */
    public b m42565i() {
        return b.m42569b(NativeSettingsInterface.getRunningArchitecture());
    }
}
