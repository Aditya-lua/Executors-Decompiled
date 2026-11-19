package fh;

import androidx.annotation.NonNull;
import androidx.p000lifecycle.f;
import androidx.p000lifecycle.s;
import com.roblox.engine.jni.NativeGLInterface;
import ok.q;

/* JADX INFO: loaded from: classes2.dex */
public class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16106a = "rbx.datamodel";

    @Override // androidx.p000lifecycle.f
    public void onCreate(@NonNull s sVar) {
        q.b("rbx.datamodel", "onMenuOptionActivated");
        wk.a aVar = new wk.a(false);
        NativeGLInterface.nativeBroadcastEventWithNamespace(aVar.f35884a, aVar.b, aVar.f35885c);
    }

    @Override // androidx.p000lifecycle.f
    public void onDestroy(@NonNull s sVar) {
        q.b("rbx.datamodel", "onMenuOptionClosed");
        wk.a aVar = new wk.a(true);
        NativeGLInterface.nativeBroadcastEventWithNamespace(aVar.f35884a, aVar.b, aVar.f35885c);
    }
}
