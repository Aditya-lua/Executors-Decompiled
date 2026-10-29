package androidx.core.graphics;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes4.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class TypefaceCompatUtil {
    private static final String CACHE_FILE_PREFIX = ".font";
    private static final String TAG = "TypefaceCompatUtil";

    private TypefaceCompatUtil() {
    }

    @Nullable
    public static File getTempFile(Context context) {
        String prefix = CACHE_FILE_PREFIX + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i10 = 0; i10 < 100; i10++) {
            File file = new File(context.getCacheDir(), prefix + i10);
            try {
                if (file.createNewFile()) {
                    return file;
                }
            } catch (IOException e10) {
            }
        }
        return null;
    }

    @Nullable
    @RequiresApi(19)
    private static ByteBuffer mmap(File file) {
        try {
            FileInputStream fis = new FileInputStream(file);
            try {
                FileChannel channel = fis.getChannel();
                long size = channel.size();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, size);
                fis.close();
                return map;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    try {
                        fis.close();
                    } catch (Throwable th4) {
                        th2.addSuppressed(th4);
                    }
                    throw th3;
                }
            }
        } catch (IOException e10) {
            return null;
        }
    }

    @Nullable
    @RequiresApi(19)
    public static ByteBuffer mmap(Context context, CancellationSignal cancellationSignal, Uri uri) {
        ContentResolver resolver = context.getContentResolver();
        try {
            ParcelFileDescriptor pfd = resolver.openFileDescriptor(uri, "r", cancellationSignal);
            if (pfd != null) {
                try {
                    FileInputStream fis = new FileInputStream(pfd.getFileDescriptor());
                    try {
                        FileChannel channel = fis.getChannel();
                        long size = channel.size();
                        MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, size);
                        fis.close();
                        pfd.close();
                        return map;
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            try {
                                fis.close();
                            } catch (Throwable th4) {
                                th2.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    }
                } catch (Throwable th5) {
                    try {
                        throw th5;
                    } catch (Throwable th6) {
                        try {
                            pfd.close();
                        } catch (Throwable th7) {
                            th5.addSuppressed(th7);
                        }
                        throw th6;
                    }
                }
            }
            if (pfd != null) {
                pfd.close();
            }
            return null;
        } catch (IOException e10) {
            return null;
        }
    }

    @Nullable
    @RequiresApi(19)
    public static ByteBuffer copyToDirectBuffer(Context context, Resources res, int id2) {
        File tmpFile = getTempFile(context);
        ByteBuffer byteBufferMmap = null;
        if (tmpFile == null) {
            return null;
        }
        try {
            if (copyToFile(tmpFile, res, id2)) {
                byteBufferMmap = mmap(tmpFile);
            }
            return byteBufferMmap;
        } finally {
            tmpFile.delete();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [151=4] */
    public static boolean copyToFile(File file, InputStream is2) {
        FileOutputStream os2 = null;
        StrictMode.ThreadPolicy old = StrictMode.allowThreadDiskWrites();
        try {
            os2 = new FileOutputStream(file, false);
            byte[] buffer = new byte[1024];
            while (true) {
                int readLen = is2.read(buffer);
                if (readLen == -1) {
                    return true;
                }
                os2.write(buffer, 0, readLen);
            }
        } catch (IOException e10) {
            Log.e(TAG, "Error copying resource contents to temp file: " + e10.getMessage());
            return false;
        } finally {
            closeQuietly(os2);
            StrictMode.setThreadPolicy(old);
        }
    }

    public static boolean copyToFile(File file, Resources res, int id2) {
        InputStream is2 = null;
        try {
            is2 = res.openRawResource(id2);
            return copyToFile(file, is2);
        } finally {
            closeQuietly(is2);
        }
    }

    public static void closeQuietly(Closeable c10) {
        if (c10 != null) {
            try {
                c10.close();
            } catch (IOException e10) {
            }
        }
    }
}
