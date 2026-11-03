package dd;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import dd.b;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class j<S extends b> extends g {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public h<S> f14585p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public i<ObjectAnimator> f14586q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Drawable f14587r;

    public j(@NonNull Context context, @NonNull b bVar, @NonNull h<S> hVar, @NonNull i<ObjectAnimator> iVar) {
        super(context, bVar);
        y(hVar);
        x(iVar);
    }

    @NonNull
    public static j<e> t(@NonNull Context context, @NonNull e eVar, @NonNull c cVar) {
        j<e> jVar = new j<>(context, eVar, cVar, new d(eVar));
        jVar.z(p5.f.b(context.getResources(), ic.e.f20672d, null));
        return jVar;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        int i10;
        Drawable drawable;
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            if (w() && (drawable = this.f14587r) != null) {
                drawable.setBounds(getBounds());
                q2.a.n(this.f14587r, this.b.f14531c[0]);
                this.f14587r.draw(canvas);
                return;
            }
            canvas.save();
            this.f14585p.g(canvas, getBounds(), h(), k(), j());
            int i11 = this.b.f14535g;
            int alpha = getAlpha();
            if (i11 == 0) {
                this.f14585p.d(canvas, this.f14576m, 0.0f, 1.0f, this.b.f14532d, alpha, 0);
                i10 = i11;
            } else {
                h.a aVar = this.f14586q.b.get(0);
                List<h.a> list = this.f14586q.b;
                alpha = 0;
                i10 = i11;
                this.f14585p.d(canvas, this.f14576m, list.get(list.size() - 1).b, 1.0f + aVar.f14581a, this.b.f14532d, 0, i10);
            }
            for (int i12 = 0; i12 < this.f14586q.b.size(); i12++) {
                h.a aVar2 = this.f14586q.b.get(i12);
                this.f14585p.c(canvas, this.f14576m, aVar2, getAlpha());
                if (i12 > 0 && i10 > 0) {
                    this.f14585p.d(canvas, this.f14576m, this.f14586q.b.get(i12 - 1).b, aVar2.f14581a, this.b.f14532d, alpha, i10);
                }
            }
            canvas.restore();
        }
    }

    @Override // dd.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f14585p.e();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f14585p.f();
    }

    @Override // dd.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // dd.g
    public /* bridge */ /* synthetic */ boolean i() {
        return super.i();
    }

    @Override // dd.g, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
    }

    @Override // dd.g
    public /* bridge */ /* synthetic */ boolean j() {
        return super.j();
    }

    @Override // dd.g
    public /* bridge */ /* synthetic */ boolean k() {
        return super.k();
    }

    @Override // dd.g
    public /* bridge */ /* synthetic */ void m(@NonNull p5.b bVar) {
        super.m(bVar);
    }

    @Override // dd.g
    public /* bridge */ /* synthetic */ boolean q(boolean z10, boolean z11, boolean z12) {
        return super.q(z10, z11, z12);
    }

    @Override // dd.g
    public boolean r(boolean z10, boolean z11, boolean z12) {
        Drawable drawable;
        boolean zR = super.r(z10, z11, z12);
        if (w() && (drawable = this.f14587r) != null) {
            return drawable.setVisible(z10, z11);
        }
        if (!isRunning()) {
            this.f14586q.a();
        }
        if (!z10 || !z12) {
            return zR;
        }
        this.f14586q.g();
        return zR;
    }

    @Override // dd.g
    public /* bridge */ /* synthetic */ boolean s(@NonNull p5.b bVar) {
        return super.s(bVar);
    }

    @Override // dd.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i10) {
        super.setAlpha(i10);
    }

    @Override // dd.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // dd.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setVisible(boolean z10, boolean z11) {
        return super.setVisible(z10, z11);
    }

    @Override // dd.g, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void start() {
        super.start();
    }

    @Override // dd.g, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }

    @NonNull
    public i<ObjectAnimator> u() {
        return this.f14586q;
    }

    @NonNull
    public h<S> v() {
        return this.f14585p;
    }

    public final boolean w() {
        a aVar = this.f14566c;
        return aVar != null && aVar.a(this.f14565a.getContentResolver()) == 0.0f;
    }

    public void x(@NonNull i<ObjectAnimator> iVar) {
        this.f14586q = iVar;
        iVar.e(this);
    }

    public void y(@NonNull h<S> hVar) {
        this.f14585p = hVar;
    }

    public void z(Drawable drawable) {
        this.f14587r = drawable;
    }
}
