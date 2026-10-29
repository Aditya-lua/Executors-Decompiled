package b3;

import android.graphics.drawable.ColorDrawable;

/* JADX INFO: loaded from: classes.dex */
public class a extends b {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ColorDrawable f3844p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f3845q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f3846r;

    public a(int i10) {
        super(i10);
        this.f3844p = new ColorDrawable();
        this.f3846r = 0;
    }

    @Override // b3.b
    public void a(int i10) {
        if (this.f3845q) {
            return;
        }
        q(i10);
    }

    @Override // b3.b
    public boolean g() {
        return true;
    }

    public void p(int i10) {
        this.f3845q = true;
        q(i10);
    }

    public final void q(int i10) {
        if (this.f3846r != i10) {
            this.f3846r = i10;
            this.f3844p.setColor(i10);
            i(this.f3844p);
        }
    }

    public a(int i10, int i11) {
        this(i10);
        p(i11);
    }
}
