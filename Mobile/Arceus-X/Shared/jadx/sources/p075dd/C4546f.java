package p075dd;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import androidx.annotation.NonNull;
import p075dd.AbstractC4542b;
import p352p5.AbstractC10160b;
import p426s2.C11162a;
import p565y3.AbstractC13023c;
import p565y3.C13025e;
import p565y3.C13026f;

/* JADX INFO: renamed from: dd.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C4546f<S extends AbstractC4542b> extends AbstractC4547g {

    /* JADX INFO: renamed from: u */
    public static final AbstractC13023c<C4546f<?>> f18615u = new a("indicatorLevel");

    /* JADX INFO: renamed from: p */
    public AbstractC4548h<S> f18616p;

    /* JADX INFO: renamed from: q */
    public final C13026f f18617q;

    /* JADX INFO: renamed from: r */
    public final C13025e f18618r;

    /* JADX INFO: renamed from: s */
    public final AbstractC4548h.a f18619s;

    /* JADX INFO: renamed from: t */
    public boolean f18620t;

    /* JADX INFO: renamed from: dd.f$a */
    public class a extends AbstractC13023c<C4546f<?>> {
        public a(String str) {
            super(str);
        }

        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;)F */
        @Override // p565y3.AbstractC13023c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo22571a(C4546f<?> c4546f) {
            return c4546f.m22568x() * 10000.0f;
        }

        /* JADX DEBUG: Method merged with bridge method: b(Ljava/lang/Object;F)V */
        @Override // p565y3.AbstractC13023c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo22572b(C4546f<?> c4546f, float f10) {
            c4546f.m22570z(f10 / 10000.0f);
        }
    }

    public C4546f(@NonNull Context context, @NonNull AbstractC4542b abstractC4542b, @NonNull AbstractC4548h<S> abstractC4548h) {
        super(context, abstractC4542b);
        this.f18620t = false;
        m22569y(abstractC4548h);
        this.f18619s = new AbstractC4548h.a();
        C13026f c13026f = new C13026f();
        this.f18617q = c13026f;
        c13026f.m48529d(1.0f);
        c13026f.m48531f(50.0f);
        C13025e c13025e = new C13025e(this, f18615u);
        this.f18618r = c13025e;
        c13025e.m48524w(c13026f);
        m22584n(1.0f);
    }

    @NonNull
    /* JADX INFO: renamed from: v */
    public static C4546f<C4545e> m22558v(@NonNull Context context, @NonNull C4545e c4545e, @NonNull C4543c c4543c) {
        return new C4546f<>(context, c4545e, c4543c);
    }

    /* JADX INFO: renamed from: A */
    public void m22559A(float f10) {
        setLevel((int) (f10 * 10000.0f));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            this.f18616p.m22589g(canvas, getBounds(), m22582h(), mo22562k(), mo22561j());
            this.f18634m.setStyle(Paint.Style.FILL);
            this.f18634m.setAntiAlias(true);
            AbstractC4548h.a aVar = this.f18619s;
            AbstractC4542b abstractC4542b = this.f18623b;
            aVar.f18641c = abstractC4542b.f18587c[0];
            int i10 = abstractC4542b.f18591g;
            if (i10 > 0) {
                this.f18616p.mo22525d(canvas, this.f18634m, m22568x(), 1.0f, this.f18623b.f18588d, getAlpha(), (int) ((i10 * C11162a.m42059b(m22568x(), 0.0f, 0.01f)) / 0.01f));
            } else {
                this.f18616p.mo22525d(canvas, this.f18634m, 0.0f, 1.0f, abstractC4542b.f18588d, getAlpha(), 0);
            }
            this.f18616p.mo22524c(canvas, this.f18634m, this.f18619s, getAlpha());
            this.f18616p.mo22523b(canvas, this.f18634m, this.f18623b.f18587c[0], getAlpha());
            canvas.restore();
        }
    }

    @Override // p075dd.AbstractC4547g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f18616p.mo22526e();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f18616p.mo22527f();
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

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f18618r.m48525x();
        m22570z(getLevel() / 10000.0f);
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

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i10) {
        if (this.f18620t) {
            this.f18618r.m48525x();
            m22570z(i10 / 10000.0f);
            return true;
        }
        this.f18618r.m48484m(m22568x() * 10000.0f);
        this.f18618r.m48520s(i10);
        return true;
    }

    @Override // p075dd.AbstractC4547g
    /* JADX INFO: renamed from: q */
    public /* bridge */ /* synthetic */ boolean mo22564q(boolean z10, boolean z11, boolean z12) {
        return super.mo22564q(z10, z11, z12);
    }

    @Override // p075dd.AbstractC4547g
    /* JADX INFO: renamed from: r */
    public boolean mo22565r(boolean z10, boolean z11, boolean z12) {
        boolean zMo22565r = super.mo22565r(z10, z11, z12);
        float fM22516a = this.f18624c.m22516a(this.f18622a.getContentResolver());
        if (fM22516a == 0.0f) {
            this.f18620t = true;
            return zMo22565r;
        }
        this.f18620t = false;
        this.f18617q.m48531f(50.0f / fM22516a);
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
    /* JADX INFO: renamed from: w */
    public AbstractC4548h<S> m22567w() {
        return this.f18616p;
    }

    /* JADX INFO: renamed from: x */
    public final float m22568x() {
        return this.f18619s.f18640b;
    }

    /* JADX INFO: renamed from: y */
    public void m22569y(@NonNull AbstractC4548h<S> abstractC4548h) {
        this.f18616p = abstractC4548h;
    }

    /* JADX INFO: renamed from: z */
    public final void m22570z(float f10) {
        this.f18619s.f18640b = f10;
        invalidateSelf();
    }
}
