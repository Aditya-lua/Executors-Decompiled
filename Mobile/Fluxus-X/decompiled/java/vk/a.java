package vk;

import android.content.Context;
import com.roblox.engine.jni.NativeGLInterface;
import com.roblox.platform.util.DeviceUtils;
import ok.q;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f34404a;
    public b b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0702a f34405c;

    /* JADX INFO: renamed from: vk.a$a, reason: collision with other inner class name */
    public static class C0702a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f34406a;
    }

    public a(Context context, C0702a c0702a) {
        this.f34404a = context;
        this.f34405c = c0702a;
    }

    public final void a(int i10, int i11, int i12, int i13, int i14) {
        q.i("rbx.glview.layout", "doUpdateAppUISizes() vw:" + i10 + " status:" + i11 + " tbh:" + i12 + " bm:" + i13 + " rm:" + i14);
        NativeGLInterface.updateAppUISizes(i10, i11, i12, i13, i14);
    }

    public abstract b b();

    public void c(b bVar, boolean z10) {
        a aVar;
        b bVar2;
        if (bVar != null && (z10 || (bVar2 = this.b) == null || !bVar2.equals(bVar))) {
            this.b = bVar;
            try {
                float screenDensity = DeviceUtils.getScreenDensity(this.f34404a);
                int iF = f(bVar.f34408a.right, screenDensity);
                int iF2 = f(bVar.f34412f, screenDensity);
                int i10 = bVar.f34411e;
                if (i10 > 0) {
                    aVar = this;
                    aVar.e(true, 0, iF2, iF, f(i10, screenDensity));
                } else {
                    aVar = this;
                    aVar.e(false, 0, iF2, iF, 0);
                }
                if (g()) {
                    return;
                }
                int iF3 = f(bVar.f34409c, screenDensity);
                int iF4 = f(bVar.f34413g, screenDensity);
                int iF5 = f(bVar.f34410d, screenDensity);
                C0702a c0702a = aVar.f34405c;
                aVar.a(iF, iF4, c0702a != null ? c0702a.f34406a : 0, iF3, iF5);
            } catch (Exception e10) {
                q.e("rbx.glview.layout", "onGlobalLayout() exception:" + e10.getMessage());
            }
        }
    }

    public void d(boolean z10) {
        c(b(), z10);
    }

    public void e(boolean z10, int i10, int i11, int i12, int i13) {
        q.i("rbx.glview.layout", "onUpdateKeyboardSize() v:" + z10 + " x:" + i10 + " y:" + i11 + " w:" + i12 + " h:" + i13);
        NativeGLInterface.updateKeyboardSize(z10, i10, i11, i12, i13);
    }

    public final int f(int i10, float f10) {
        return (int) (((double) (i10 / f10)) + 0.5d);
    }

    public boolean g() {
        return false;
    }
}
