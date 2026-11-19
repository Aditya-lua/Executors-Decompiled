package b3;

import android.graphics.drawable.ColorDrawable;

/* JADX INFO: loaded from: classes.dex */
public class a extends b {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ColorDrawable f3595p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f3596q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f3597r;

    public a(int i10) {
        super(i10);
        this.f3595p = new ColorDrawable();
        this.f3597r = 0;
    }

    @Override // b3.b
    public void a(int i10) {
        if (this.f3596q) {
            return;
        }
        q(i10);
    }

    @Override // b3.b
    public boolean g() {
        return true;
    }

    public void p(int i10) {
        this.f3596q = true;
        q(i10);
    }

    public final void q(int i10) {
        if (this.f3597r != i10) {
            this.f3597r = i10;
            this.f3595p.setColor(i10);
            i(this.f3595p);
        }
    }

    public a(int i10, int i11) {
        this(i10);
        p(i11);
    }
}
