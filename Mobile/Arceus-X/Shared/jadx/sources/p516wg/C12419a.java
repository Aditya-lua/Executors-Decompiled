package p516wg;

import androidx.annotation.NonNull;
import androidx.p616lifecycle.InterfaceC0954f;
import androidx.p616lifecycle.InterfaceC0980s;
import com.roblox.engine.jni.NativeGLInterface;
import p151gk.C6124q;
import p335ok.C9755a;

/* JADX INFO: renamed from: wg.a */
/* JADX INFO: loaded from: classes2.dex */
public class C12419a implements InterfaceC0954f {

    /* JADX INFO: renamed from: a */
    public final String f44398a = "rbx.datamodel";

    @Override // androidx.p616lifecycle.InterfaceC0954f
    public void onCreate(@NonNull InterfaceC0980s interfaceC0980s) {
        C6124q.m27057b("rbx.datamodel", "onMenuOptionActivated");
        C9755a c9755a = new C9755a(false);
        NativeGLInterface.nativeBroadcastEventWithNamespace(c9755a.f35514a, c9755a.f35515b, c9755a.f35516c);
    }

    @Override // androidx.p616lifecycle.InterfaceC0954f
    public void onDestroy(@NonNull InterfaceC0980s interfaceC0980s) {
        C6124q.m27057b("rbx.datamodel", "onMenuOptionClosed");
        C9755a c9755a = new C9755a(true);
        NativeGLInterface.nativeBroadcastEventWithNamespace(c9755a.f35514a, c9755a.f35515b, c9755a.f35516c);
    }
}
