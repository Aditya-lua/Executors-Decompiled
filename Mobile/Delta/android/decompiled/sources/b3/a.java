package b3;

import android.graphics.drawable.ColorDrawable;

/* JADX INFO: loaded from: classes.dex */
public class a extends b {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ColorDrawable f3742p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f3743q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f3744r;

    public a(int i10) {
        super(i10);
        this.f3742p = new ColorDrawable();
        this.f3744r = 0;
    }

    @Override // b3.b
    public void a(int i10) {
        if (this.f3743q) {
            return;
        }
        q(i10);
    }

    @Override // b3.b
    public boolean g() {
        return true;
    }

    public void p(int i10) {
        this.f3743q = true;
        q(i10);
    }

    public final void q(int i10) {
        if (this.f3744r != i10) {
            this.f3744r = i10;
            this.f3742p.setColor(i10);
            i(this.f3742p);
        }
    }

    public a(int i10, int i11) {
        this(i10);
        p(i11);
    }
}
