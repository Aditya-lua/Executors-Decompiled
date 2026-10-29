package p023b3;

import android.graphics.drawable.ColorDrawable;

/* JADX INFO: renamed from: b3.a */
/* JADX INFO: loaded from: classes.dex */
public class C1208a extends AbstractC1209b {

    /* JADX INFO: renamed from: p */
    public final ColorDrawable f5031p;

    /* JADX INFO: renamed from: q */
    public boolean f5032q;

    /* JADX INFO: renamed from: r */
    public int f5033r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1208a(int i10) {
        super(i10);
        this.f5031p = new ColorDrawable();
        this.f5033r = 0;
    }

    @Override // p023b3.AbstractC1209b
    /* JADX INFO: renamed from: a */
    public void mo6752a(int i10) {
        if (this.f5032q) {
            return;
        }
        m6755q(i10);
    }

    @Override // p023b3.AbstractC1209b
    /* JADX INFO: renamed from: g */
    public boolean mo6753g() {
        return true;
    }

    /* JADX INFO: renamed from: p */
    public void m6754p(int i10) {
        this.f5032q = true;
        m6755q(i10);
    }

    /* JADX INFO: renamed from: q */
    public final void m6755q(int i10) {
        if (this.f5033r != i10) {
            this.f5033r = i10;
            this.f5031p.setColor(i10);
            m6762i(this.f5031p);
        }
    }

    public C1208a(int i10, int i11) {
        this(i10);
        m6754p(i11);
    }
}
