package p075dd;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import java.util.List;
import p075dd.AbstractC4542b;
import p194ic.C6741e;
import p352p5.AbstractC10160b;
import p352p5.C10164f;
import p368q2.C10425a;

/* JADX INFO: renamed from: dd.j */
/* JADX INFO: loaded from: classes2.dex */
public final class C4550j<S extends AbstractC4542b> extends AbstractC4547g {

    /* JADX INFO: renamed from: p */
    public AbstractC4548h<S> f18645p;

    /* JADX INFO: renamed from: q */
    public AbstractC4549i<ObjectAnimator> f18646q;

    /* JADX INFO: renamed from: r */
    public Drawable f18647r;

    public C4550j(@NonNull Context context, @NonNull AbstractC4542b abstractC4542b, @NonNull AbstractC4548h<S> abstractC4548h, @NonNull AbstractC4549i<ObjectAnimator> abstractC4549i) {
        super(context, abstractC4542b);
        m22597y(abstractC4548h);
        m22596x(abstractC4549i);
    }

    @NonNull
    /* JADX INFO: renamed from: t */
    public static C4550j<C4545e> m22592t(@NonNull Context context, @NonNull C4545e c4545e, @NonNull C4543c c4543c) {
        C4550j<C4545e> c4550j = new C4550j<>(context, c4545e, c4543c, new C4544d(c4545e));
        c4550j.m22598z(C10164f.m39120b(context.getResources(), C6741e.f25997d, null));
        return c4550j;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        int i10;
        Drawable drawable;
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            if (m22595w() && (drawable = this.f18647r) != null) {
                drawable.setBounds(getBounds());
                C10425a.m40117n(this.f18647r, this.f18623b.f18587c[0]);
                this.f18647r.draw(canvas);
                return;
            }
            canvas.save();
            this.f18645p.m22589g(canvas, getBounds(), m22582h(), mo22562k(), mo22561j());
            int i11 = this.f18623b.f18591g;
            int alpha = getAlpha();
            if (i11 == 0) {
                this.f18645p.mo22525d(canvas, this.f18634m, 0.0f, 1.0f, this.f18623b.f18588d, alpha, 0);
                i10 = i11;
            } else {
                AbstractC4548h.a aVar = this.f18646q.f18644b.get(0);
                List<AbstractC4548h.a> list = this.f18646q.f18644b;
                alpha = 0;
                i10 = i11;
                this.f18645p.mo22525d(canvas, this.f18634m, list.get(list.size() - 1).f18640b, 1.0f + aVar.f18639a, this.f18623b.f18588d, 0, i10);
            }
            for (int i12 = 0; i12 < this.f18646q.f18644b.size(); i12++) {
                AbstractC4548h.a aVar2 = this.f18646q.f18644b.get(i12);
                this.f18645p.mo22524c(canvas, this.f18634m, aVar2, getAlpha());
                if (i12 > 0 && i10 > 0) {
                    this.f18645p.mo22525d(canvas, this.f18634m, this.f18646q.f18644b.get(i12 - 1).f18640b, aVar2.f18639a, this.f18623b.f18588d, alpha, i10);
                }
            }
            canvas.restore();
        }
    }

    @Override // p075dd.AbstractC4547g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f18645p.mo22526e();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f18645p.mo22527f();
    }

    @Override // p075dd.AbstractC4547g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // p075dd.AbstractC4547g
    /* JADX INFO: renamed from: i */
    public /* bridge */ /* synthetic */ boolean mo22560i() {
        return super.mo22560i();
    }

    @Override // p075dd.AbstractC4547g, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
    }

    @Override // p075dd.AbstractC4547g
    /* JADX INFO: renamed from: j */
    public /* bridge */ /* synthetic */ boolean mo22561j() {
        return super.mo22561j();
    }

    @Override // p075dd.AbstractC4547g
    /* JADX INFO: renamed from: k */
    public /* bridge */ /* synthetic */ boolean mo22562k() {
        return super.mo22562k();
    }

    @Override // p075dd.AbstractC4547g
    /* JADX INFO: renamed from: m */
    public /* bridge */ /* synthetic */ void mo22563m(@NonNull AbstractC10160b abstractC10160b) {
        super.mo22563m(abstractC10160b);
    }

    @Override // p075dd.AbstractC4547g
    /* JADX INFO: renamed from: q */
    public /* bridge */ /* synthetic */ boolean mo22564q(boolean z10, boolean z11, boolean z12) {
        return super.mo22564q(z10, z11, z12);
    }

    @Override // p075dd.AbstractC4547g
    /* JADX INFO: renamed from: r */
    public boolean mo22565r(boolean z10, boolean z11, boolean z12) {
        Drawable drawable;
        boolean zMo22565r = super.mo22565r(z10, z11, z12);
        if (m22595w() && (drawable = this.f18647r) != null) {
            return drawable.setVisible(z10, z11);
        }
        if (!isRunning()) {
            this.f18646q.mo22538a();
        }
        if (!z10 || !z12) {
            return zMo22565r;
        }
        this.f18646q.mo22542g();
        return zMo22565r;
    }

    @Override // p075dd.AbstractC4547g
    /* JADX INFO: renamed from: s */
    public /* bridge */ /* synthetic */ boolean mo22566s(@NonNull AbstractC10160b abstractC10160b) {
        return super.mo22566s(abstractC10160b);
    }

    @Override // p075dd.AbstractC4547g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i10) {
        super.setAlpha(i10);
    }

    @Override // p075dd.AbstractC4547g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // p075dd.AbstractC4547g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setVisible(boolean z10, boolean z11) {
        return super.setVisible(z10, z11);
    }

    @Override // p075dd.AbstractC4547g, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void start() {
        super.start();
    }

    @Override // p075dd.AbstractC4547g, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }

    @NonNull
    /* JADX INFO: renamed from: u */
    public AbstractC4549i<ObjectAnimator> m22593u() {
        return this.f18646q;
    }

    @NonNull
    /* JADX INFO: renamed from: v */
    public AbstractC4548h<S> m22594v() {
        return this.f18645p;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m22595w() {
        C4541a c4541a = this.f18624c;
        return c4541a != null && c4541a.m22516a(this.f18622a.getContentResolver()) == 0.0f;
    }

    /* JADX INFO: renamed from: x */
    public void m22596x(@NonNull AbstractC4549i<ObjectAnimator> abstractC4549i) {
        this.f18646q = abstractC4549i;
        abstractC4549i.m22591e(this);
    }

    /* JADX INFO: renamed from: y */
    public void m22597y(@NonNull AbstractC4548h<S> abstractC4548h) {
        this.f18645p = abstractC4548h;
    }

    /* JADX INFO: renamed from: z */
    public void m22598z(Drawable drawable) {
        this.f18647r = drawable;
    }
}
