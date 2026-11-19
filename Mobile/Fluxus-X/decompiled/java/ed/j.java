package ed;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import ed.b;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class j<S extends b> extends g {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public h<S> f13376p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public i<ObjectAnimator> f13377q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Drawable f13378r;

    public j(@NonNull Context context, @NonNull b bVar, @NonNull h<S> hVar, @NonNull i<ObjectAnimator> iVar) {
        super(context, bVar);
        y(hVar);
        x(iVar);
    }

    @NonNull
    public static j<e> t(@NonNull Context context, @NonNull e eVar, @NonNull c cVar) {
        j<e> jVar = new j<>(context, eVar, cVar, new d(eVar));
        jVar.z(q5.f.b(context.getResources(), jc.e.f20360d, null));
        return jVar;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        int i10;
        Drawable drawable;
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            if (w() && (drawable = this.f13378r) != null) {
                drawable.setBounds(getBounds());
                q2.a.n(this.f13378r, this.b.f13322c[0]);
                this.f13378r.draw(canvas);
                return;
            }
            canvas.save();
            this.f13376p.g(canvas, getBounds(), h(), k(), j());
            int i11 = this.b.f13326g;
            int alpha = getAlpha();
            if (i11 == 0) {
                this.f13376p.d(canvas, this.f13367m, 0.0f, 1.0f, this.b.f13323d, alpha, 0);
                i10 = i11;
            } else {
                h.a aVar = this.f13377q.b.get(0);
                List<h.a> list = this.f13377q.b;
                alpha = 0;
                i10 = i11;
                this.f13376p.d(canvas, this.f13367m, list.get(list.size() - 1).b, 1.0f + aVar.f13372a, this.b.f13323d, 0, i10);
            }
            for (int i12 = 0; i12 < this.f13377q.b.size(); i12++) {
                h.a aVar2 = this.f13377q.b.get(i12);
                this.f13376p.c(canvas, this.f13367m, aVar2, getAlpha());
                if (i12 > 0 && i10 > 0) {
                    this.f13376p.d(canvas, this.f13367m, this.f13377q.b.get(i12 - 1).b, aVar2.f13372a, this.b.f13323d, alpha, i10);
                }
            }
            canvas.restore();
        }
    }

    @Override // ed.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f13376p.e();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f13376p.f();
    }

    @Override // ed.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // ed.g
    public /* bridge */ /* synthetic */ boolean i() {
        return super.i();
    }

    @Override // ed.g, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
    }

    @Override // ed.g
    public /* bridge */ /* synthetic */ boolean j() {
        return super.j();
    }

    @Override // ed.g
    public /* bridge */ /* synthetic */ boolean k() {
        return super.k();
    }

    @Override // ed.g
    public /* bridge */ /* synthetic */ void m(@NonNull q5.b bVar) {
        super.m(bVar);
    }

    @Override // ed.g
    public /* bridge */ /* synthetic */ boolean q(boolean z10, boolean z11, boolean z12) {
        return super.q(z10, z11, z12);
    }

    @Override // ed.g
    public boolean r(boolean z10, boolean z11, boolean z12) {
        Drawable drawable;
        boolean zR = super.r(z10, z11, z12);
        if (w() && (drawable = this.f13378r) != null) {
            return drawable.setVisible(z10, z11);
        }
        if (!isRunning()) {
            this.f13377q.a();
        }
        if (!z10 || !z12) {
            return zR;
        }
        this.f13377q.g();
        return zR;
    }

    @Override // ed.g
    public /* bridge */ /* synthetic */ boolean s(@NonNull q5.b bVar) {
        return super.s(bVar);
    }

    @Override // ed.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i10) {
        super.setAlpha(i10);
    }

    @Override // ed.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // ed.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setVisible(boolean z10, boolean z11) {
        return super.setVisible(z10, z11);
    }

    @Override // ed.g, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void start() {
        super.start();
    }

    @Override // ed.g, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }

    @NonNull
    public i<ObjectAnimator> u() {
        return this.f13377q;
    }

    @NonNull
    public h<S> v() {
        return this.f13376p;
    }

    public final boolean w() {
        a aVar = this.f13357c;
        return aVar != null && aVar.a(this.f13356a.getContentResolver()) == 0.0f;
    }

    public void x(@NonNull i<ObjectAnimator> iVar) {
        this.f13377q = iVar;
        iVar.e(this);
    }

    public void y(@NonNull h<S> hVar) {
        this.f13376p = hVar;
    }

    public void z(Drawable drawable) {
        this.f13378r = drawable;
    }
}
