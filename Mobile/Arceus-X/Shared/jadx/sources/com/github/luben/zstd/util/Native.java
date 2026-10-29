package com.github.luben.zstd.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public enum Native {
    ;

    private static final String nativePathOverride = "ZstdNativePath";
    private static final String tempFolderOverride = "ZstdTempFolder";
    private static final String libnameShort = "zstd-jni-1.5.7-6";
    private static final String libname = "libzstd-jni-1.5.7-6";
    private static final String errorMsg = "Unsupported OS/arch, cannot find " + resourceName() + " or load " + libnameShort + " from system libraries. Please try building from source the jar or providing " + libname + " in your system.";
    private static AtomicBoolean loaded = new AtomicBoolean(false);

    public static synchronized void assumeLoaded() {
        loaded.set(true);
    }

    public static synchronized boolean isLoaded() {
        return loaded.get();
    }

    private static String libExtension() {
        if (osName().contains("os_x") || osName().contains("darwin")) {
            return "dylib";
        }
        return osName().contains("win") ? "dll" : "so";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static synchronized void load() {
        try {
            String property = System.getProperty(tempFolderOverride);
            if (property == null) {
                load(null);
            } else {
                load(new File(property));
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private static void loadLibrary(final String str) {
        AccessController.doPrivileged(new PrivilegedAction<Void>() { // from class: com.github.luben.zstd.util.Native.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: run()Ljava/lang/Object; */
            @Override // java.security.PrivilegedAction
            public Void run() {
                System.loadLibrary(str);
                return null;
            }
        });
    }

    private static void loadLibraryFile(final String str) {
        AccessController.doPrivileged(new PrivilegedAction<Void>() { // from class: com.github.luben.zstd.util.Native.2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: run()Ljava/lang/Object; */
            @Override // java.security.PrivilegedAction
            public Void run() {
                System.load(str);
                return null;
            }
        });
    }

    private static String osName() {
        String strReplace = System.getProperty("os.name").toLowerCase().replace(' ', '_');
        if (strReplace.startsWith("win")) {
            return "win";
        }
        return strReplace.startsWith("mac") ? "darwin" : strReplace;
    }

    private static String resourceName() {
        String strOsName = osName();
        String property = System.getProperty("os.arch");
        if (strOsName.equals("darwin") && property.equals("amd64")) {
            property = "x86_64";
        }
        return "/" + strOsName + "/" + property + "/" + libname + "." + libExtension();
    }

    /* JADX WARN: Code duplicated, block: B:75:0x014a A[Catch: all -> 0x0024, IOException -> 0x0158, TryCatch #1 {IOException -> 0x0158, blocks: (B:73:0x0145, B:75:0x014a, B:77:0x014f, B:79:0x0155), top: B:87:0x0145 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x014f A[Catch: all -> 0x0024, IOException -> 0x0158, TryCatch #1 {IOException -> 0x0158, blocks: (B:73:0x0145, B:75:0x014a, B:77:0x014f, B:79:0x0155), top: B:87:0x0145 }] */
    public static synchronized void load(File file) {
        FileOutputStream fileOutputStream;
        Throwable th2;
        File fileCreateTempFile;
        if (loaded.get()) {
            return;
        }
        String strResourceName = resourceName();
        String property = System.getProperty(nativePathOverride);
        if (property != null) {
            loadLibraryFile(property);
            loaded.set(true);
            return;
        }
        try {
            Class.forName("org.osgi.framework.BundleEvent");
            loadLibrary(libname);
            loaded.set(true);
        } catch (Throwable unused) {
            InputStream resourceAsStream = Native.class.getResourceAsStream(strResourceName);
            if (resourceAsStream == null) {
                try {
                    loadLibrary(libnameShort);
                    loaded.set(true);
                    return;
                } catch (UnsatisfiedLinkError e10) {
                    UnsatisfiedLinkError unsatisfiedLinkError = new UnsatisfiedLinkError(e10.getMessage() + "\n" + errorMsg);
                    unsatisfiedLinkError.setStackTrace(e10.getStackTrace());
                    throw unsatisfiedLinkError;
                }
            }
            File file2 = null;
            fileOutputStream = null;
            fileOutputStream = null;
            FileOutputStream fileOutputStream2 = null;
            try {
                fileCreateTempFile = File.createTempFile(libname, "." + libExtension(), file);
                try {
                    fileCreateTempFile.deleteOnExit();
                    fileOutputStream = new FileOutputStream(fileCreateTempFile);
                    try {
                        try {
                            byte[] bArr = new byte[4096];
                            while (true) {
                                int i10 = resourceAsStream.read(bArr);
                                if (i10 == -1) {
                                    try {
                                        break;
                                    } catch (IOException unused2) {
                                        fileOutputStream2 = fileOutputStream;
                                    }
                                } else {
                                    fileOutputStream.write(bArr, 0, i10);
                                }
                            }
                            fileOutputStream.flush();
                            fileOutputStream.close();
                            try {
                                loadLibraryFile(fileCreateTempFile.getAbsolutePath());
                            } catch (UnsatisfiedLinkError e11) {
                                try {
                                    loadLibrary(libnameShort);
                                } catch (UnsatisfiedLinkError e12) {
                                    UnsatisfiedLinkError unsatisfiedLinkError2 = new UnsatisfiedLinkError(e11.getMessage() + "\n" + e12.getMessage() + "\n" + errorMsg);
                                    unsatisfiedLinkError2.setStackTrace(e12.getStackTrace());
                                    throw unsatisfiedLinkError2;
                                }
                            }
                            loaded.set(true);
                            try {
                                resourceAsStream.close();
                                if (fileOutputStream2 != null) {
                                    fileOutputStream2.close();
                                }
                                if (fileCreateTempFile.exists()) {
                                    fileCreateTempFile.delete();
                                }
                            } catch (IOException unused3) {
                            }
                        } catch (IOException e13) {
                            e = e13;
                            file2 = fileCreateTempFile;
                            try {
                                ExceptionInInitializerError exceptionInInitializerError = new ExceptionInInitializerError("Cannot unpack libzstd-jni-1.5.7-6: " + e.getMessage());
                                exceptionInInitializerError.setStackTrace(e.getStackTrace());
                                throw exceptionInInitializerError;
                            } catch (Throwable th3) {
                                File file3 = file2;
                                th2 = th3;
                                fileCreateTempFile = file3;
                                try {
                                    resourceAsStream.close();
                                    if (fileOutputStream != null) {
                                        fileOutputStream.close();
                                    }
                                    if (fileCreateTempFile != null && fileCreateTempFile.exists()) {
                                        fileCreateTempFile.delete();
                                    }
                                } catch (IOException unused4) {
                                }
                                throw th2;
                            }
                        }
                    } catch (Throwable th4) {
                        th2 = th4;
                        resourceAsStream.close();
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        if (fileCreateTempFile != null) {
                            fileCreateTempFile.delete();
                        }
                        throw th2;
                    }
                } catch (IOException e14) {
                    e = e14;
                    fileOutputStream = fileOutputStream2;
                    file2 = fileCreateTempFile;
                    ExceptionInInitializerError exceptionInInitializerError2 = new ExceptionInInitializerError("Cannot unpack libzstd-jni-1.5.7-6: " + e.getMessage());
                    exceptionInInitializerError2.setStackTrace(e.getStackTrace());
                    throw exceptionInInitializerError2;
                } catch (Throwable th5) {
                    fileOutputStream = fileOutputStream2;
                    th2 = th5;
                    resourceAsStream.close();
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    if (fileCreateTempFile != null) {
                        fileCreateTempFile.delete();
                    }
                    throw th2;
                }
            } catch (IOException e15) {
                e = e15;
                fileOutputStream = null;
            } catch (Throwable th6) {
                fileOutputStream = null;
                th2 = th6;
                fileCreateTempFile = null;
            }
        }
    }
}
