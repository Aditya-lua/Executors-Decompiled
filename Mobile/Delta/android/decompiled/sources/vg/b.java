package vg;

import androidx.annotation.NonNull;
import androidx.p000lifecycle.f;
import androidx.p000lifecycle.s;
import com.roblox.engine.jni.memstorage.MemStorage;
import rh.h;

/* JADX INFO: loaded from: classes2.dex */
public class b implements f {
    @Override // androidx.p000lifecycle.f
    public void onDestroy(@NonNull s sVar) {
        if (h.a().e1()) {
            return;
        }
        MemStorage.fire("BrowserService.BrowserWindowClosed", "");
    }
}
