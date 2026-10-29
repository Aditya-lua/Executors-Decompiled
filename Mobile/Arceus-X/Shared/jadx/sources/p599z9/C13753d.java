package p599z9;

import android.os.Looper;
import android.util.Log;

/* JADX INFO: renamed from: z9.d */
/* JADX INFO: loaded from: classes.dex */
public final class C13753d {

    /* JADX INFO: renamed from: a */
    public static ClassLoader f48323a;

    /* JADX INFO: renamed from: b */
    public static Thread f48324b;

    /* JADX WARN: Code duplicated, block: B:52:0x00b6 A[Catch: all -> 0x00b2, PHI: r2
      0x00b6: PHI (r2v1 java.lang.Thread) = (r2v0 java.lang.Thread), (r2v11 java.lang.Thread) binds: [B:7:0x000c, B:46:0x00af] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000e, B:45:0x00ad, B:60:0x00e4, B:12:0x0023, B:51:0x00b5, B:52:0x00b6, B:63:0x00e8, B:64:0x00e9, B:13:0x0024, B:15:0x0031, B:25:0x004b, B:26:0x0052, B:28:0x005d, B:34:0x0072, B:35:0x0079, B:42:0x0089, B:43:0x00ab, B:18:0x0040, B:53:0x00b7, B:59:0x00e3, B:58:0x00c1), top: B:71:0x0003, inners: #3, #5 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x00b7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static synchronized ClassLoader m50160a() {
        SecurityException e10;
        Thread thread;
        ThreadGroup threadGroup;
        if (f48323a == null) {
            Thread thread2 = f48324b;
            ClassLoader contextClassLoader = null;
            if (thread2 != null) {
                synchronized (thread2) {
                    try {
                        contextClassLoader = f48324b.getContextClassLoader();
                    } catch (SecurityException e11) {
                        String message = e11.getMessage();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 41);
                        sb2.append("Failed to get thread context classloader ");
                        sb2.append(message);
                        Log.w("DynamiteLoaderV2CL", sb2.toString());
                    }
                }
                f48323a = contextClassLoader;
            } else {
                ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
                if (threadGroup2 == null) {
                    thread2 = null;
                } else {
                    synchronized (Void.class) {
                        try {
                            try {
                                int iActiveGroupCount = threadGroup2.activeGroupCount();
                                ThreadGroup[] threadGroupArr = new ThreadGroup[iActiveGroupCount];
                                threadGroup2.enumerate(threadGroupArr);
                                int i10 = 0;
                                int i11 = 0;
                                while (true) {
                                    if (i11 >= iActiveGroupCount) {
                                        threadGroup = null;
                                        break;
                                    }
                                    threadGroup = threadGroupArr[i11];
                                    if ("dynamiteLoader".equals(threadGroup.getName())) {
                                        break;
                                    }
                                    i11++;
                                }
                                if (threadGroup == null) {
                                    threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                                }
                                int iActiveCount = threadGroup.activeCount();
                                Thread[] threadArr = new Thread[iActiveCount];
                                threadGroup.enumerate(threadArr);
                                while (true) {
                                    if (i10 >= iActiveCount) {
                                        thread = null;
                                        break;
                                    }
                                    thread = threadArr[i10];
                                    if ("GmsDynamite".equals(thread.getName())) {
                                        break;
                                    }
                                    i10++;
                                }
                                if (thread == null) {
                                    try {
                                        C13752c c13752c = new C13752c(threadGroup, "GmsDynamite");
                                        try {
                                            c13752c.setContextClassLoader(null);
                                            c13752c.start();
                                            thread = c13752c;
                                        } catch (SecurityException e12) {
                                            e10 = e12;
                                            thread = c13752c;
                                            String message2 = e10.getMessage();
                                            StringBuilder sb3 = new StringBuilder(String.valueOf(message2).length() + 39);
                                            sb3.append("Failed to enumerate thread/threadgroup ");
                                            sb3.append(message2);
                                            Log.w("DynamiteLoaderV2CL", sb3.toString());
                                        }
                                    } catch (SecurityException e13) {
                                        e10 = e13;
                                    }
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        } catch (SecurityException e14) {
                            e10 = e14;
                            thread = null;
                        }
                    }
                    thread2 = thread;
                }
                f48324b = thread2;
                if (thread2 != null) {
                    synchronized (thread2) {
                        contextClassLoader = f48324b.getContextClassLoader();
                    }
                }
                f48323a = contextClassLoader;
            }
        }
        return f48323a;
    }
}
