package p516wg;

import androidx.annotation.NonNull;
import androidx.p616lifecycle.InterfaceC0954f;
import androidx.p616lifecycle.InterfaceC0980s;
import com.roblox.engine.jni.memstorage.MemStorage;
import th.C11659h;

/* JADX INFO: renamed from: wg.b */
/* JADX INFO: loaded from: classes2.dex */
public class C12420b implements InterfaceC0954f {
    @Override // androidx.p616lifecycle.InterfaceC0954f
    public void onDestroy(@NonNull InterfaceC0980s interfaceC0980s) {
        if (C11659h.m43403a().mo43594b1()) {
            return;
        }
        MemStorage.fire("BrowserService.BrowserWindowClosed", "");
    }
}
