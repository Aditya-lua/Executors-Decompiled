package v9;

import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f34245a;
    public static int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Boolean f34246c;

    public static String a() throws Throwable {
        BufferedReader bufferedReader;
        if (f34245a == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                f34245a = Application.getProcessName();
            } else {
                int iMyPid = b;
                if (iMyPid == 0) {
                    iMyPid = Process.myPid();
                    b = iMyPid;
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
                                o9.s.l(line);
                                strTrim = line.trim();
                            } catch (IOException unused) {
                            } catch (Throwable th2) {
                                th = th2;
                                bufferedReader2 = bufferedReader;
                                l.a(bufferedReader2);
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
                    l.a(bufferedReader);
                }
                f34245a = strTrim;
            }
        }
        return f34245a;
    }

    public static boolean b() {
        Boolean boolValueOf = f34246c;
        if (boolValueOf == null) {
            if (m.h()) {
                boolValueOf = Boolean.valueOf(Process.isIsolated());
            } else {
                try {
                    Object objA = eb.r.a(Process.class, "isIsolated", new eb.q[0]);
                    Object[] objArr = new Object[0];
                    if (objA == null) {
                        throw new eb.u(eb.t.a("expected a non-null reference", objArr));
                    }
                    boolValueOf = (Boolean) objA;
                } catch (ReflectiveOperationException unused) {
                    boolValueOf = Boolean.FALSE;
                }
            }
            f34246c = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }
}
