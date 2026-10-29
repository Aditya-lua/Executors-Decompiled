package p088e;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: e.j0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4711j0 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m23003a(Object obj) throws Exception {
        if (obj instanceof AutoCloseable) {
            ((AutoCloseable) obj).close();
            return;
        }
        if (obj instanceof ExecutorService) {
            C4713k0.m23004a((ExecutorService) obj);
            return;
        }
        if (obj instanceof TypedArray) {
            ((TypedArray) obj).recycle();
            return;
        }
        if (obj instanceof MediaMetadataRetriever) {
            ((MediaMetadataRetriever) obj).release();
        } else if (obj instanceof MediaDrm) {
            ((MediaDrm) obj).release();
        } else {
            C4715l0.m23006a(obj);
        }
    }
}
