package backtraceio.library.breadcrumbs;

import backtraceio.library.logger.BacktraceLogger;
import java.io.File;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import p552xm.C12865a;

/* JADX INFO: loaded from: classes.dex */
public class BacktraceQueueFileHelper {
    private final String breadcrumbLogDirectory;
    private final C12865a breadcrumbStore;
    private final int maxQueueFileSizeBytes;
    private final Method usedBytes;
    private final String LOG_TAG = BacktraceQueueFileHelper.class.getSimpleName();
    private final int minimumQueueFileSizeBytes = 4096;

    public BacktraceQueueFileHelper(String str, int i10) throws NoSuchMethodException {
        this.breadcrumbLogDirectory = str;
        this.breadcrumbStore = new C12865a(new File(str));
        Method declaredMethod = C12865a.class.getDeclaredMethod("v", null);
        this.usedBytes = declaredMethod;
        declaredMethod.setAccessible(true);
        if (i10 < 4096) {
            this.maxQueueFileSizeBytes = 4096;
        } else {
            this.maxQueueFileSizeBytes = i10;
        }
    }

    public boolean add(byte[] bArr) {
        try {
            int length = bArr.length;
            if (length > 4096) {
                BacktraceLogger.m7081e(this.LOG_TAG, "We should not have a breadcrumb this big, this is a bug!");
                return false;
            }
            int iIntValue = ((Integer) this.usedBytes.invoke(this.breadcrumbStore, null)).intValue();
            while (!this.breadcrumbStore.m47875j() && iIntValue + length > this.maxQueueFileSizeBytes) {
                this.breadcrumbStore.m47879q();
                iIntValue = ((Integer) this.usedBytes.invoke(this.breadcrumbStore, null)).intValue();
            }
            this.breadcrumbStore.m47870d(bArr);
            return true;
        } catch (Exception e10) {
            BacktraceLogger.m7083w(this.LOG_TAG, "Exception: " + e10.getMessage() + "\nWhen adding breadcrumb: " + new String(bArr, StandardCharsets.UTF_8));
            return false;
        }
    }

    public boolean clear() {
        try {
            this.breadcrumbStore.m47872f();
            return true;
        } catch (Exception e10) {
            BacktraceLogger.m7083w(this.LOG_TAG, "Exception: " + e10.getMessage() + "\nWhen clearing breadcrumbs");
            return false;
        }
    }
}
