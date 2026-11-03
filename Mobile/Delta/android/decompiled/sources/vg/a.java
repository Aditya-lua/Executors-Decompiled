package vg;

import androidx.annotation.NonNull;
import androidx.p000lifecycle.f;
import androidx.p000lifecycle.s;
import com.roblox.engine.jni.NativeGLInterface;
import ek.q;

/* JADX INFO: loaded from: classes2.dex */
public class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33500a = "rbx.datamodel";

    @Override // androidx.p000lifecycle.f
    public void onCreate(@NonNull s sVar) {
        q.b("rbx.datamodel", "onMenuOptionActivated");
        mk.a aVar = new mk.a(false);
        NativeGLInterface.nativeBroadcastEventWithNamespace(aVar.f24878a, aVar.b, aVar.f24879c);
    }

    @Override // androidx.p000lifecycle.f
    public void onDestroy(@NonNull s sVar) {
        q.b("rbx.datamodel", "onMenuOptionClosed");
        mk.a aVar = new mk.a(true);
        NativeGLInterface.nativeBroadcastEventWithNamespace(aVar.f24878a, aVar.b, aVar.f24879c);
    }
}
