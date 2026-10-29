package wg;

import androidx.annotation.NonNull;
import androidx.p000lifecycle.f;
import androidx.p000lifecycle.s;
import com.roblox.engine.jni.memstorage.MemStorage;
import th.h;

/* JADX INFO: loaded from: classes2.dex */
public class b implements f {
    @Override // androidx.p000lifecycle.f
    public void onDestroy(@NonNull s sVar) {
        if (h.a().X0()) {
            return;
        }
        MemStorage.fire("BrowserService.BrowserWindowClosed", "");
    }
}
