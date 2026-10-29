package be;

import android.util.Log;
import java.io.File;

/* JADX INFO: renamed from: be.y */
/* JADX INFO: loaded from: classes2.dex */
public final class C1375y implements InterfaceC1353q {
    @Override // be.InterfaceC1353q
    /* JADX INFO: renamed from: a */
    public final boolean mo7108a(Object obj, File file, File file2) {
        try {
            return !((Boolean) C1324g0.m7162f(Class.forName("dalvik.system.DexFile"), "isDexOptNeeded", Boolean.class, String.class, file.getPath())).booleanValue();
        } catch (ClassNotFoundException unused) {
            Log.e("SplitCompat", "Unexpected missing dalvik.system.DexFile.");
            return false;
        }
    }
}
