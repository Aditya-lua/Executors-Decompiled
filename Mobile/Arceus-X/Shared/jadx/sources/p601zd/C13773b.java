package p601zd;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.StrictMode;
import android.util.Log;
import be.C1324g0;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: zd.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C13773b {

    /* JADX INFO: renamed from: a */
    public final C13777f f48359a;

    public C13773b(C13777f c13777f) {
        this.f48359a = c13777f;
    }

    /* JADX INFO: renamed from: c */
    public static final int m50200c(AssetManager assetManager, File file) {
        int iIntValue = ((Integer) C1324g0.m7160d(assetManager, "addAssetPath", Integer.class, String.class, file.getPath())).intValue();
        Log.d("SplitCompat", "addAssetPath completed with " + iIntValue);
        return iIntValue;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m50201a(Context context, Set set) {
        AssetManager assets = context.getAssets();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            m50200c(assets, (File) it.next());
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized boolean m50202b(Context context, Set set) {
        StrictMode.ThreadPolicy threadPolicy;
        try {
            threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.allowThreadDiskReads();
                StrictMode.allowThreadDiskWrites();
            } catch (Exception e10) {
                e = e10;
                Log.i("SplitCompat", "Unable to set up strict mode.", e);
            }
        } catch (Exception e11) {
            e = e11;
            threadPolicy = null;
        }
        try {
            try {
                HashSet hashSet = new HashSet();
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    hashSet.add(this.f48359a.m50218g((String) it.next()));
                }
                m50201a(context, hashSet);
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
            } catch (Exception e12) {
                Log.e("SplitCompat", "Error installing additional splits", e12);
                if (threadPolicy == null) {
                    return false;
                }
                StrictMode.setThreadPolicy(threadPolicy);
                return false;
            }
        } catch (Throwable th2) {
            if (threadPolicy != null) {
                StrictMode.setThreadPolicy(threadPolicy);
            }
            throw th2;
        }
        return true;
    }
}
