package fn;

import android.content.Context;
import androidx.camera.view.PreviewView;

/* JADX INFO: loaded from: classes3.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ft.i<Context> f16997a;
    public final ft.i<ln.a> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ft.i<qq.c> f16998c;

    public t(ft.i<Context> iVar, ft.i<ln.a> iVar2, ft.i<qq.c> iVar3) {
        this.f16997a = iVar;
        this.b = iVar2;
        this.f16998c = iVar3;
    }

    public static t a(ft.i<Context> iVar, ft.i<ln.a> iVar2, ft.i<qq.c> iVar3) {
        return new t(iVar, iVar2, iVar3);
    }

    public static com.withpersona.sdk2.camera.e c(Context context, ln.a aVar, qq.c cVar, com.withpersona.sdk2.camera.b bVar, PreviewView previewView, s sVar, boolean z10) {
        return new com.withpersona.sdk2.camera.e(context, aVar, cVar, bVar, previewView, sVar, z10);
    }

    public com.withpersona.sdk2.camera.e b(com.withpersona.sdk2.camera.b bVar, PreviewView previewView, s sVar, boolean z10) {
        return c(this.f16997a.get(), this.b.get(), this.f16998c.get(), bVar, previewView, sVar, z10);
    }
}
