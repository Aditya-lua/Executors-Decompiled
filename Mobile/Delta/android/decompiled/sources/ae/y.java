package ae;

import android.util.Log;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class y implements q {
    @Override // ae.q
    public final boolean a(Object obj, File file, File file2) {
        try {
            return !((Boolean) g0.f(Class.forName("dalvik.system.DexFile"), "isDexOptNeeded", Boolean.class, String.class, file.getPath())).booleanValue();
        } catch (ClassNotFoundException unused) {
            Log.e("SplitCompat", "Unexpected missing dalvik.system.DexFile.");
            return false;
        }
    }
}
