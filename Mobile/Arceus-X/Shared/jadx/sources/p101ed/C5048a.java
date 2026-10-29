package p101ed;

import android.graphics.Typeface;

/* JADX INFO: renamed from: ed.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C5048a extends AbstractC5053f {

    /* JADX INFO: renamed from: a */
    public final Typeface f19849a;

    /* JADX INFO: renamed from: b */
    public final a f19850b;

    /* JADX INFO: renamed from: c */
    public boolean f19851c;

    /* JADX INFO: renamed from: ed.a$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo385a(Typeface typeface);
    }

    public C5048a(a aVar, Typeface typeface) {
        this.f19849a = typeface;
        this.f19850b = aVar;
    }

    @Override // p101ed.AbstractC5053f
    /* JADX INFO: renamed from: a */
    public void mo425a(int i10) {
        m23729d(this.f19849a);
    }

    @Override // p101ed.AbstractC5053f
    /* JADX INFO: renamed from: b */
    public void mo426b(Typeface typeface, boolean z10) {
        m23729d(typeface);
    }

    /* JADX INFO: renamed from: c */
    public void m23728c() {
        this.f19851c = true;
    }

    /* JADX INFO: renamed from: d */
    public final void m23729d(Typeface typeface) {
        if (this.f19851c) {
            return;
        }
        this.f19850b.mo385a(typeface);
    }
}
