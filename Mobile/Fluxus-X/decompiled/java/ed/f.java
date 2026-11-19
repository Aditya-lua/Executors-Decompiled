package ed;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import androidx.annotation.NonNull;
import ed.b;

/* JADX INFO: loaded from: classes2.dex */
public final class f<S extends b> extends g {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final z3.c<f<?>> f13349u = new a("indicatorLevel");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public h<S> f13350p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final z3.f f13351q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final z3.e f13352r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final h.a f13353s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f13354t;

    public class a extends z3.c<f<?>> {
        public a(String str) {
            super(str);
        }

        @Override // z3.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(f<?> fVar) {
            return fVar.x() * 10000.0f;
        }

        @Override // z3.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(f<?> fVar, float f10) {
            fVar.z(f10 / 10000.0f);
        }
    }

    public f(@NonNull Context context, @NonNull b bVar, @NonNull h<S> hVar) {
        super(context, bVar);
        this.f13354t = false;
        y(hVar);
        this.f13353s = new h.a();
        z3.f fVar = new z3.f();
        this.f13351q = fVar;
        fVar.d(1.0f);
        fVar.f(50.0f);
        z3.e eVar = new z3.e(this, f13349u);
        this.f13352r = eVar;
        eVar.w(fVar);
        n(1.0f);
    }

    @NonNull
    public static f<e> v(@NonNull Context context, @NonNull e eVar, @NonNull c cVar) {
        return new f<>(context, eVar, cVar);
    }

    public void A(float f10) {
        setLevel((int) (f10 * 10000.0f));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            this.f13350p.g(canvas, getBounds(), h(), k(), j());
            this.f13367m.setStyle(Paint.Style.FILL);
            this.f13367m.setAntiAlias(true);
            h.a aVar = this.f13353s;
            b bVar = this.b;
            aVar.f13373c = bVar.f13322c[0];
            int i10 = bVar.f13326g;
            if (i10 > 0) {
                this.f13350p.d(canvas, this.f13367m, x(), 1.0f, this.b.f13323d, getAlpha(), (int) ((i10 * s2.a.b(x(), 0.0f, 0.01f)) / 0.01f));
            } else {
                this.f13350p.d(canvas, this.f13367m, 0.0f, 1.0f, bVar.f13323d, getAlpha(), 0);
            }
            this.f13350p.c(canvas, this.f13367m, this.f13353s, getAlpha());
            this.f13350p.b(canvas, this.f13367m, this.b.f13322c[0], getAlpha());
            canvas.restore();
        }
    }

    @Override // ed.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f13350p.e();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f13350p.f();
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

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f13352r.x();
        z(getLevel() / 10000.0f);
    }

    @Override // ed.g
    public /* bridge */ /* synthetic */ boolean k() {
        return super.k();
    }

    @Override // ed.g
    public /* bridge */ /* synthetic */ void m(@NonNull q5.b bVar) {
        super.m(bVar);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i10) {
        if (this.f13354t) {
            this.f13352r.x();
            z(i10 / 10000.0f);
            return true;
        }
        this.f13352r.m(x() * 10000.0f);
        this.f13352r.s(i10);
        return true;
    }

    @Override // ed.g
    public /* bridge */ /* synthetic */ boolean q(boolean z10, boolean z11, boolean z12) {
        return super.q(z10, z11, z12);
    }

    @Override // ed.g
    public boolean r(boolean z10, boolean z11, boolean z12) {
        boolean zR = super.r(z10, z11, z12);
        float fA = this.f13357c.a(this.f13356a.getContentResolver());
        if (fA == 0.0f) {
            this.f13354t = true;
            return zR;
        }
        this.f13354t = false;
        this.f13351q.f(50.0f / fA);
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
    public h<S> w() {
        return this.f13350p;
    }

    public final float x() {
        return this.f13353s.b;
    }

    public void y(@NonNull h<S> hVar) {
        this.f13350p = hVar;
    }

    public final void z(float f10) {
        this.f13353s.b = f10;
        invalidateSelf();
    }
}
