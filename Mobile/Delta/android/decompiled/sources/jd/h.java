package jd;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class h extends gd.g {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NonNull
    public b f21277z;

    @TargetApi(18)
    public static class c extends h {
        public c(@NonNull b bVar) {
            super(bVar);
        }

        @Override // gd.g
        public void r(@NonNull Canvas canvas) {
            if (this.f21277z.f21278w.isEmpty()) {
                super.r(canvas);
                return;
            }
            canvas.save();
            canvas.clipOutRect(this.f21277z.f21278w);
            super.r(canvas);
            canvas.restore();
        }
    }

    public static h o0(gd.k kVar) {
        if (kVar == null) {
            kVar = new gd.k();
        }
        return p0(new b(kVar, new RectF()));
    }

    public static h p0(@NonNull b bVar) {
        return new c(bVar);
    }

    @Override // gd.g, android.graphics.drawable.Drawable
    @NonNull
    public Drawable mutate() {
        this.f21277z = new b(this.f21277z);
        return this;
    }

    public boolean q0() {
        return !this.f21277z.f21278w.isEmpty();
    }

    public void r0() {
        s0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public void s0(float f10, float f11, float f12, float f13) {
        if (f10 == this.f21277z.f21278w.left && f11 == this.f21277z.f21278w.top && f12 == this.f21277z.f21278w.right && f13 == this.f21277z.f21278w.bottom) {
            return;
        }
        this.f21277z.f21278w.set(f10, f11, f12, f13);
        invalidateSelf();
    }

    public void t0(@NonNull RectF rectF) {
        s0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public static final class b extends gd.g.c {

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        @NonNull
        public final RectF f21278w;

        @Override // gd.g.c, android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            h hVarP0 = h.p0(this);
            hVarP0.invalidateSelf();
            return hVarP0;
        }

        public b(@NonNull gd.k kVar, @NonNull RectF rectF) {
            super(kVar, null);
            this.f21278w = rectF;
        }

        public b(@NonNull b bVar) {
            super(bVar);
            this.f21278w = bVar.f21278w;
        }
    }

    public h(@NonNull b bVar) {
        super(bVar);
        this.f21277z = bVar;
    }
}
