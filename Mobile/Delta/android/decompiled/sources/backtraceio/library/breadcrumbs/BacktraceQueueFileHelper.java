package backtraceio.library.breadcrumbs;

import backtraceio.library.logger.BacktraceLogger;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.io.File;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import xm.a;

/* JADX INFO: loaded from: classes.dex */
public class BacktraceQueueFileHelper {
    private final String breadcrumbLogDirectory;
    private final a breadcrumbStore;
    private final int maxQueueFileSizeBytes;
    private final Method usedBytes;
    private final String LOG_TAG = BacktraceQueueFileHelper.class.getSimpleName();
    private final int minimumQueueFileSizeBytes = Barcode.FORMAT_AZTEC;

    public BacktraceQueueFileHelper(String str, int i10) throws NoSuchMethodException {
        this.breadcrumbLogDirectory = str;
        this.breadcrumbStore = new a(new File(str));
        Method declaredMethod = a.class.getDeclaredMethod("v", null);
        this.usedBytes = declaredMethod;
        declaredMethod.setAccessible(true);
        if (i10 < 4096) {
            this.maxQueueFileSizeBytes = Barcode.FORMAT_AZTEC;
        } else {
            this.maxQueueFileSizeBytes = i10;
        }
    }

    public boolean add(byte[] bArr) {
        try {
            int length = bArr.length;
            if (length > 4096) {
                BacktraceLogger.e(this.LOG_TAG, "We should not have a breadcrumb this big, this is a bug!");
                return false;
            }
            int iIntValue = ((Integer) this.usedBytes.invoke(this.breadcrumbStore, null)).intValue();
            while (!this.breadcrumbStore.j() && iIntValue + length > this.maxQueueFileSizeBytes) {
                this.breadcrumbStore.q();
                iIntValue = ((Integer) this.usedBytes.invoke(this.breadcrumbStore, null)).intValue();
            }
            this.breadcrumbStore.d(bArr);
            return true;
        } catch (Exception e10) {
            BacktraceLogger.w(this.LOG_TAG, "Exception: " + e10.getMessage() + "\nWhen adding breadcrumb: " + new String(bArr, StandardCharsets.UTF_8));
            return false;
        }
    }

    public boolean clear() {
        try {
            this.breadcrumbStore.f();
            return true;
        } catch (Exception e10) {
            BacktraceLogger.w(this.LOG_TAG, "Exception: " + e10.getMessage() + "\nWhen clearing breadcrumbs");
            return false;
        }
    }
}
