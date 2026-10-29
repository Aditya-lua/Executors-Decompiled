package vg;

import com.roblox.engine.jni.NativeGLInterface;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Supplier {
    @Override // java.util.function.Supplier
    public final Object get() {
        return NativeGLInterface.getIxpEnrolledExperiments();
    }
}
