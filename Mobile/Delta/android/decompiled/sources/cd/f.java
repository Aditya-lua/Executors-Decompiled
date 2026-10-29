package cd;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import androidx.annotation.NonNull;
import cd.b;

/* JADX INFO: loaded from: classes2.dex */
public final class f<S extends b> extends g {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final y3.c<f<?>> f4720u = new a("indicatorLevel");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public h<S> f4721p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y3.f f4722q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y3.e f4723r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final h.a f4724s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f4725t;

    public class a extends y3.c<f<?>> {
        public a(String str) {
            super(str);
        }

        @Override // y3.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(f<?> fVar) {
            return fVar.x() * 10000.0f;
        }

        @Override // y3.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(f<?> fVar, float f10) {
            fVar.z(f10 / 10000.0f);
        }
    }

    public f(@NonNull Context context, @NonNull b bVar, @NonNull h<S> hVar) {
        super(context, bVar);
        this.f4725t = false;
        y(hVar);
        this.f4724s = new h.a();
        y3.f fVar = new y3.f();
        this.f4722q = fVar;
        fVar.d(1.0f);
        fVar.f(50.0f);
        y3.e eVar = new y3.e(this, f4720u);
        this.f4723r = eVar;
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
            this.f4721p.g(canvas, getBounds(), h(), k(), j());
            this.f4738m.setStyle(Paint.Style.FILL);
            this.f4738m.setAntiAlias(true);
            h.a aVar = this.f4724s;
            b bVar = this.b;
            aVar.f4744c = bVar.f4693c[0];
            int i10 = bVar.f4697g;
            if (i10 > 0) {
                this.f4721p.d(canvas, this.f4738m, x(), 1.0f, this.b.f4694d, getAlpha(), (int) ((i10 * s2.a.b(x(), 0.0f, 0.01f)) / 0.01f));
            } else {
                this.f4721p.d(canvas, this.f4738m, 0.0f, 1.0f, bVar.f4694d, getAlpha(), 0);
            }
            this.f4721p.c(canvas, this.f4738m, this.f4724s, getAlpha());
            this.f4721p.b(canvas, this.f4738m, this.b.f4693c[0], getAlpha());
            canvas.restore();
        }
    }

    @Override // cd.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f4721p.e();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f4721p.f();
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

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f4723r.x();
        z(getLevel() / 10000.0f);
    }

    @Override // cd.g
    public /* bridge */ /* synthetic */ boolean k() {
        return super.k();
    }

    @Override // cd.g
    public /* bridge */ /* synthetic */ void m(@NonNull p5.b bVar) {
        super.m(bVar);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i10) {
        if (this.f4725t) {
            this.f4723r.x();
            z(i10 / 10000.0f);
            return true;
        }
        this.f4723r.m(x() * 10000.0f);
        this.f4723r.s(i10);
        return true;
    }

    @Override // cd.g
    public /* bridge */ /* synthetic */ boolean q(boolean z10, boolean z11, boolean z12) {
        return super.q(z10, z11, z12);
    }

    @Override // cd.g
    public boolean r(boolean z10, boolean z11, boolean z12) {
        boolean zR = super.r(z10, z11, z12);
        float fA = this.f4728c.a(this.f4727a.getContentResolver());
        if (fA == 0.0f) {
            this.f4725t = true;
            return zR;
        }
        this.f4725t = false;
        this.f4722q.f(50.0f / fA);
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
    public h<S> w() {
        return this.f4721p;
    }

    public final float x() {
        return this.f4724s.b;
    }

    public void y(@NonNull h<S> hVar) {
        this.f4721p = hVar;
    }

    public final void z(float f10) {
        this.f4724s.b = f10;
        invalidateSelf();
    }
}
