package cd;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import cd.b;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class j<S extends b> extends g {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public h<S> f4747p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public i<ObjectAnimator> f4748q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Drawable f4749r;

    public j(@NonNull Context context, @NonNull b bVar, @NonNull h<S> hVar, @NonNull i<ObjectAnimator> iVar) {
        super(context, bVar);
        y(hVar);
        x(iVar);
    }

    @NonNull
    public static j<e> t(@NonNull Context context, @NonNull e eVar, @NonNull c cVar) {
        j<e> jVar = new j<>(context, eVar, cVar, new d(eVar));
        jVar.z(p5.f.b(context.getResources(), hc.e.f18850d, null));
        return jVar;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        int i10;
        Drawable drawable;
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            if (w() && (drawable = this.f4749r) != null) {
                drawable.setBounds(getBounds());
                q2.a.n(this.f4749r, this.b.f4693c[0]);
                this.f4749r.draw(canvas);
                return;
            }
            canvas.save();
            this.f4747p.g(canvas, getBounds(), h(), k(), j());
            int i11 = this.b.f4697g;
            int alpha = getAlpha();
            if (i11 == 0) {
                this.f4747p.d(canvas, this.f4738m, 0.0f, 1.0f, this.b.f4694d, alpha, 0);
                i10 = i11;
            } else {
                h.a aVar = this.f4748q.b.get(0);
                List<h.a> list = this.f4748q.b;
                alpha = 0;
                i10 = i11;
                this.f4747p.d(canvas, this.f4738m, list.get(list.size() - 1).b, 1.0f + aVar.f4743a, this.b.f4694d, 0, i10);
            }
            for (int i12 = 0; i12 < this.f4748q.b.size(); i12++) {
                h.a aVar2 = this.f4748q.b.get(i12);
                this.f4747p.c(canvas, this.f4738m, aVar2, getAlpha());
                if (i12 > 0 && i10 > 0) {
                    this.f4747p.d(canvas, this.f4738m, this.f4748q.b.get(i12 - 1).b, aVar2.f4743a, this.b.f4694d, alpha, i10);
                }
            }
            canvas.restore();
        }
    }

    @Override // cd.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f4747p.e();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f4747p.f();
    }

    @Override // cd.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // cd.g
    public /* bridge */ /* synthetic */ boolean i() {
        return super.i();
    }

    @Override // cd.g, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
    }

    @Override // cd.g
    public /* bridge */ /* synthetic */ boolean j() {
        return super.j();
    }

    @Override // cd.g
    public /* bridge */ /* synthetic */ boolean k() {
        return super.k();
    }

    @Override // cd.g
    public /* bridge */ /* synthetic */ void m(@NonNull p5.b bVar) {
        super.m(bVar);
    }

    @Override // cd.g
    public /* bridge */ /* synthetic */ boolean q(boolean z10, boolean z11, boolean z12) {
        return super.q(z10, z11, z12);
    }

    @Override // cd.g
    public boolean r(boolean z10, boolean z11, boolean z12) {
        Drawable drawable;
        boolean zR = super.r(z10, z11, z12);
        if (w() && (drawable = this.f4749r) != null) {
            return drawable.setVisible(z10, z11);
        }
        if (!isRunning()) {
            this.f4748q.a();
        }
        if (!z10 || !z12) {
            return zR;
        }
        this.f4748q.g();
        return zR;
    }

    @Override // cd.g
    public /* bridge */ /* synthetic */ boolean s(@NonNull p5.b bVar) {
        return super.s(bVar);
    }

    @Override // cd.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i10) {
        super.setAlpha(i10);
    }

    @Override // cd.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // cd.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setVisible(boolean z10, boolean z11) {
        return super.setVisible(z10, z11);
    }

    @Override // cd.g, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void start() {
        super.start();
    }

    @Override // cd.g, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }

    @NonNull
    public i<ObjectAnimator> u() {
        return this.f4748q;
    }

    @NonNull
    public h<S> v() {
        return this.f4747p;
    }

    public final boolean w() {
        a aVar = this.f4728c;
        return aVar != null && aVar.a(this.f4727a.getContentResolver()) == 0.0f;
    }

    public void x(@NonNull i<ObjectAnimator> iVar) {
        this.f4748q = iVar;
        iVar.e(this);
    }

    public void y(@NonNull h<S> hVar) {
        this.f4747p = hVar;
    }

    public void z(Drawable drawable) {
        this.f4749r = drawable;
    }
}
