package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import p169he.AbstractC6381k;
import p504w1.C12277a;
import p504w1.C12286j;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.x8 */
/* JADX INFO: loaded from: classes.dex */
public final class C2390x8 {

    /* JADX INFO: renamed from: a */
    public static volatile AbstractC6381k f8772a;

    /* JADX WARN: Code duplicated, block: B:20:0x0036 A[Catch: all -> 0x0022, TryCatch #3 {all -> 0x0022, blocks: (B:6:0x0007, B:8:0x000b, B:10:0x0019, B:20:0x0036, B:76:0x017f, B:15:0x0025, B:17:0x002d, B:21:0x003c, B:23:0x0042, B:25:0x0048, B:27:0x0050, B:75:0x017c, B:77:0x0182, B:78:0x0185, B:79:0x0186, B:28:0x0054, B:30:0x0058, B:31:0x0065, B:33:0x006b, B:39:0x0084, B:41:0x008a, B:42:0x0096, B:62:0x015f, B:63:0x0162, B:71:0x0171, B:70:0x016e, B:72:0x0172, B:73:0x0177, B:74:0x0178, B:36:0x0073, B:38:0x0079), top: B:88:0x0007, inners: #0 }] */
    /* JADX INFO: renamed from: a */
    public static AbstractC6381k m10972a(Context context) {
        AbstractC6381k abstractC6381kM27912a;
        AbstractC6381k abstractC6381kM27912a2;
        AbstractC6381k abstractC6381k = f8772a;
        if (abstractC6381k != null) {
            return abstractC6381k;
        }
        synchronized (C2390x8.class) {
            try {
                abstractC6381kM27912a = f8772a;
                if (abstractC6381kM27912a == null) {
                    String str = Build.TYPE;
                    String str2 = Build.TAGS;
                    C12277a c12277a = C1970a9.f8093a;
                    if (!str.equals("eng") && !str.equals("userdebug")) {
                        abstractC6381kM27912a = AbstractC6381k.m27912a();
                    } else if (str2.contains("dev-keys") || str2.contains("test-keys")) {
                        Context contextCreateDeviceProtectedStorageContext = (!C2156k8.m10318a() || context.isDeviceProtectedStorage()) ? context : context.createDeviceProtectedStorageContext();
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            StrictMode.allowThreadDiskWrites();
                            char c10 = 0;
                            try {
                                File file = new File(contextCreateDeviceProtectedStorageContext.getDir("phenotype_hermetic", 0), "overrides.txt");
                                abstractC6381kM27912a2 = file.exists() ? AbstractC6381k.m27913d(file) : AbstractC6381k.m27912a();
                            } catch (RuntimeException e10) {
                                Log.e("HermeticFileOverrides", "no data dir", e10);
                                abstractC6381kM27912a2 = AbstractC6381k.m27912a();
                            }
                            if (abstractC6381kM27912a2.mo27884c()) {
                                File file2 = (File) abstractC6381kM27912a2.mo27883b();
                                try {
                                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
                                    try {
                                        C12286j c12286j = new C12286j();
                                        HashMap map = new HashMap();
                                        while (true) {
                                            String line = bufferedReader.readLine();
                                            if (line == null) {
                                                break;
                                            }
                                            String[] strArrSplit = line.split(" ", 3);
                                            if (strArrSplit.length != 3) {
                                                StringBuilder sb2 = new StringBuilder(line.length() + 9);
                                                sb2.append("Invalid: ");
                                                sb2.append(line);
                                                Log.e("HermeticFileOverrides", sb2.toString());
                                            } else {
                                                String str3 = new String(strArrSplit[c10]);
                                                String strDecode = Uri.decode(new String(strArrSplit[1]));
                                                String strDecode2 = (String) map.get(strArrSplit[2]);
                                                if (strDecode2 == null) {
                                                    String str4 = new String(strArrSplit[2]);
                                                    strDecode2 = Uri.decode(str4);
                                                    if (strDecode2.length() < 1024 || strDecode2 == str4) {
                                                        map.put(str4, strDecode2);
                                                    }
                                                }
                                                C12286j c12286j2 = (C12286j) c12286j.get(str3);
                                                if (c12286j2 == null) {
                                                    c12286j2 = new C12286j();
                                                    c12286j.put(str3, c12286j2);
                                                }
                                                c12286j2.put(strDecode, strDecode2);
                                                c10 = 0;
                                            }
                                        }
                                        String string = file2.toString();
                                        String packageName = contextCreateDeviceProtectedStorageContext.getPackageName();
                                        StringBuilder sb3 = new StringBuilder(string.length() + 28 + String.valueOf(packageName).length());
                                        sb3.append("Parsed ");
                                        sb3.append(string);
                                        sb3.append(" for Android package ");
                                        sb3.append(packageName);
                                        Log.w("HermeticFileOverrides", sb3.toString());
                                        C2282r8 c2282r8 = new C2282r8(c12286j);
                                        bufferedReader.close();
                                        abstractC6381kM27912a = AbstractC6381k.m27913d(c2282r8);
                                    } catch (Throwable th2) {
                                        try {
                                            bufferedReader.close();
                                            throw th2;
                                        } catch (Throwable th3) {
                                            th2.addSuppressed(th3);
                                            throw th2;
                                        }
                                    }
                                } catch (IOException e11) {
                                    throw new RuntimeException(e11);
                                }
                            } else {
                                abstractC6381kM27912a = AbstractC6381k.m27912a();
                            }
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        } catch (Throwable th4) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th4;
                        }
                    } else {
                        abstractC6381kM27912a = AbstractC6381k.m27912a();
                    }
                    f8772a = abstractC6381kM27912a;
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
        return abstractC6381kM27912a;
    }
}
