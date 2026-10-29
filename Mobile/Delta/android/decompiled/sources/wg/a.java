package wg;

import androidx.annotation.NonNull;
import androidx.p000lifecycle.f;
import androidx.p000lifecycle.s;
import com.roblox.engine.jni.NativeGLInterface;
import gk.p;

/* JADX INFO: loaded from: classes2.dex */
public class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34241a = "rbx.datamodel";

    @Override // androidx.p000lifecycle.f
    public void onCreate(@NonNull s sVar) {
        p.b("rbx.datamodel", "onMenuOptionActivated");
        ok.a aVar = new ok.a(false);
        NativeGLInterface.nativeBroadcastEventWithNamespace(aVar.f27448a, aVar.b, aVar.f27449c);
    }

    @Override // androidx.p000lifecycle.f
    public void onDestroy(@NonNull s sVar) {
        p.b("rbx.datamodel", "onMenuOptionClosed");
        ok.a aVar = new ok.a(true);
        NativeGLInterface.nativeBroadcastEventWithNamespace(aVar.f27448a, aVar.b, aVar.f27449c);
    }
}
