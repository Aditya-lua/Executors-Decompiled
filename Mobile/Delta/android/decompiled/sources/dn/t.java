package dn;

import android.content.Context;
import androidx.camera.view.PreviewView;

/* JADX INFO: loaded from: classes3.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dt.i<Context> f15193a;
    public final dt.i<jn.a> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dt.i<oq.c> f15194c;

    public t(dt.i<Context> iVar, dt.i<jn.a> iVar2, dt.i<oq.c> iVar3) {
        this.f15193a = iVar;
        this.b = iVar2;
        this.f15194c = iVar3;
    }

    public static t a(dt.i<Context> iVar, dt.i<jn.a> iVar2, dt.i<oq.c> iVar3) {
        return new t(iVar, iVar2, iVar3);
    }

    public static com.withpersona.sdk2.camera.e c(Context context, jn.a aVar, oq.c cVar, com.withpersona.sdk2.camera.b bVar, PreviewView previewView, s sVar, boolean z10) {
        return new com.withpersona.sdk2.camera.e(context, aVar, cVar, bVar, previewView, sVar, z10);
    }

    public com.withpersona.sdk2.camera.e b(com.withpersona.sdk2.camera.b bVar, PreviewView previewView, s sVar, boolean z10) {
        return c(this.f15193a.get(), this.b.get(), this.f15194c.get(), bVar, previewView, sVar, z10);
    }
}
