package p297n1;

import android.net.Uri;
import android.os.Environment;
import android.os.StatFs;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p140g0.C5931r1;

/* JADX INFO: renamed from: n1.e */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0016\u001a\u00020\u00172\n\u0010\u0016\u001a\u00060\u0014j\u0002`\u0015H\u0007¢\u0006\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, m31665d2 = {"Ln1/e;", "", "<init>", "()V", "Ljava/io/File;", "file", "", "b", "(Ljava/io/File;)J", "", "path", "c", "(Ljava/lang/String;)J", "Landroid/net/Uri;", "uri", "d", "(Landroid/net/Uri;)J", "bytes", "a", "(J)Ljava/lang/String;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "", "(Ljava/lang/Exception;)Z", "camera-video_release"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class C8862e {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C8862e f32250a = new C8862e();

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m35581a(long bytes) {
        if (bytes < 0) {
            throw new IllegalArgumentException("Bytes cannot be negative");
        }
        String[] strArr = {"B", "KB", "MB", "GB", "TB"};
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        double d10 = bytes;
        int i10 = 0;
        double d11 = d10;
        while (d11 >= 1024.0d && i10 < 4) {
            d11 /= 1024.0d;
            i10++;
        }
        if (i10 == 0) {
            return decimalFormat.format(d11) + ' ' + strArr[i10];
        }
        StringBuilder sb2 = new StringBuilder();
        while (-1 < i10) {
            double dPow = Math.pow(1024.0d, i10);
            double dFloor = Math.floor(d10 / dPow);
            if (dFloor > 0.0d) {
                sb2.append(decimalFormat.format(dFloor));
                sb2.append(" ");
                sb2.append(strArr[i10]);
                sb2.append(" ");
                d10 -= dFloor * dPow;
            }
            i10--;
        }
        return StringsKt.m32183p1(sb2).toString();
    }

    /* JADX INFO: renamed from: b */
    public static final long m35582b(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        String path = file.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
        return m35583c(path);
    }

    /* JADX INFO: renamed from: c */
    public static final long m35583c(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return new StatFs(path).getAvailableBytes();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
    
        if (r0.equals("external") == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        if (r0.equals("external_primary") != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        r3 = android.os.Environment.getExternalStorageDirectory();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, "getExternalStorageDirectory(...)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0067, code lost:
    
        return m35582b(r3);
     */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long m35584d(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        if (!Intrinsics.m31980c(uri.getScheme(), "content")) {
            throw new IllegalStateException(("Not a content uri: " + uri).toString());
        }
        String str = uri.getPathSegments().get(0);
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -1921573490) {
                if (iHashCode != -1820761141) {
                    if (iHashCode == 570410685 && str.equals("internal")) {
                        File dataDirectory = Environment.getDataDirectory();
                        Intrinsics.checkNotNullExpressionValue(dataDirectory, "getDataDirectory(...)");
                        return m35582b(dataDirectory);
                    }
                }
            }
        }
        C5931r1.m26572l("StorageUtil", "Unknown MediaStore URI: " + uri);
        return Long.MAX_VALUE;
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m35585e(@NotNull Exception e10) {
        String message;
        Intrinsics.checkNotNullParameter(e10, "e");
        return (e10 instanceof FileNotFoundException) && (message = e10.getMessage()) != null && StringsKt.m32152a0(message, "No space left on device", false, 2, null);
    }
}
