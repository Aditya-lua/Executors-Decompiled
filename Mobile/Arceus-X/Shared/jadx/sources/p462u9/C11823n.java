package p462u9;

import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import p074db.C4535q;
import p074db.C4536r;
import p074db.C4538t;
import p074db.C4539u;
import p305n9.C8953m;

/* JADX INFO: renamed from: u9.n */
/* JADX INFO: loaded from: classes.dex */
public class C11823n {

    /* JADX INFO: renamed from: a */
    public static String f41577a;

    /* JADX INFO: renamed from: b */
    public static int f41578b;

    /* JADX INFO: renamed from: c */
    public static Boolean f41579c;

    /* JADX INFO: renamed from: a */
    public static String m44205a() throws Throwable {
        BufferedReader bufferedReader;
        if (f41577a == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                f41577a = Application.getProcessName();
            } else {
                int iMyPid = f41578b;
                if (iMyPid == 0) {
                    iMyPid = Process.myPid();
                    f41578b = iMyPid;
                }
                String strTrim = null;
                strTrim = null;
                strTrim = null;
                BufferedReader bufferedReader2 = null;
                if (iMyPid > 0) {
                    try {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(iMyPid).length() + 14);
                        sb2.append("/proc/");
                        sb2.append(iMyPid);
                        sb2.append("/cmdline");
                        String string = sb2.toString();
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            bufferedReader = new BufferedReader(new FileReader(string));
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            try {
                                String line = bufferedReader.readLine();
                                C8953m.m36047l(line);
                                strTrim = line.trim();
                            } catch (IOException unused) {
                            } catch (Throwable th2) {
                                th = th2;
                                bufferedReader2 = bufferedReader;
                                C11821l.m44193a(bufferedReader2);
                                throw th;
                            }
                        } catch (Throwable th3) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th3;
                        }
                    } catch (IOException unused2) {
                        bufferedReader = null;
                    } catch (Throwable th4) {
                        th = th4;
                    }
                    C11821l.m44193a(bufferedReader);
                }
                f41577a = strTrim;
            }
        }
        return f41577a;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m44206b() {
        Boolean boolValueOf = f41579c;
        if (boolValueOf == null) {
            if (C11822m.m44201h()) {
                boolValueOf = Boolean.valueOf(Process.isIsolated());
            } else {
                try {
                    Object objM22507a = C4536r.m22507a(Process.class, "isIsolated", new C4535q[0]);
                    Object[] objArr = new Object[0];
                    if (objM22507a == null) {
                        throw new C4539u(C4538t.m22514a("expected a non-null reference", objArr));
                    }
                    boolValueOf = (Boolean) objM22507a;
                } catch (ReflectiveOperationException unused) {
                    boolValueOf = Boolean.FALSE;
                }
            }
            f41579c = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }
}
