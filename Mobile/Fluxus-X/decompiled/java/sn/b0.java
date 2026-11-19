package sn;

import android.content.Context;
import androidx.camera.view.PreviewView;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.i<Context> f31550a;
    public final wt.i<yn.a> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wt.i<er.c> f31551c;

    public b0(wt.i<Context> iVar, wt.i<yn.a> iVar2, wt.i<er.c> iVar3) {
        this.f31550a = iVar;
        this.b = iVar2;
        this.f31551c = iVar3;
    }

    public static b0 a(wt.i<Context> iVar, wt.i<yn.a> iVar2, wt.i<er.c> iVar3) {
        return new b0(iVar, iVar2, iVar3);
    }

    public static a0 c(Context context, yn.a aVar, er.c cVar, t tVar, PreviewView previewView, z zVar, boolean z10) {
        return new a0(context, aVar, cVar, tVar, previewView, zVar, z10);
    }

    public a0 b(t tVar, PreviewView previewView, z zVar, boolean z10) {
        return c(this.f31550a.get(), this.b.get(), this.f31551c.get(), tVar, previewView, zVar, z10);
    }
}
