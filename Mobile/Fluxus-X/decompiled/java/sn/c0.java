package sn;

import androidx.camera.view.PreviewView;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 implements a0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f31563a;

    public c0(b0 b0Var) {
        this.f31563a = b0Var;
    }

    public static wt.i<a0.a> b(b0 b0Var) {
        return wt.e.a(new c0(b0Var));
    }

    @Override // sn.a0.a
    public a0 a(t tVar, PreviewView previewView, z zVar, boolean z10) {
        return this.f31563a.b(tVar, previewView, zVar, z10);
    }
}
