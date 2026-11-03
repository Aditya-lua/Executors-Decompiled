package kd;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class h extends hd.g {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NonNull
    public b f22565z;

    @TargetApi(18)
    public static class c extends h {
        public c(@NonNull b bVar) {
            super(bVar);
        }

        @Override // hd.g
        public void r(@NonNull Canvas canvas) {
            if (this.f22565z.f22566w.isEmpty()) {
                super.r(canvas);
                return;
            }
            canvas.save();
            canvas.clipOutRect(this.f22565z.f22566w);
            super.r(canvas);
            canvas.restore();
        }
    }

    public static h o0(hd.k kVar) {
        if (kVar == null) {
            kVar = new hd.k();
        }
        return p0(new b(kVar, new RectF()));
    }

    public static h p0(@NonNull b bVar) {
        return new c(bVar);
    }

    @Override // hd.g, android.graphics.drawable.Drawable
    @NonNull
    public Drawable mutate() {
        this.f22565z = new b(this.f22565z);
        return this;
    }

    public boolean q0() {
        return !this.f22565z.f22566w.isEmpty();
    }

    public void r0() {
        s0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public void s0(float f10, float f11, float f12, float f13) {
        if (f10 == this.f22565z.f22566w.left && f11 == this.f22565z.f22566w.top && f12 == this.f22565z.f22566w.right && f13 == this.f22565z.f22566w.bottom) {
            return;
        }
        this.f22565z.f22566w.set(f10, f11, f12, f13);
        invalidateSelf();
    }

    public void t0(@NonNull RectF rectF) {
        s0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public static final class b extends hd.g.c {

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        @NonNull
        public final RectF f22566w;

        @Override // hd.g.c, android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            h hVarP0 = h.p0(this);
            hVarP0.invalidateSelf();
            return hVarP0;
        }

        public b(@NonNull hd.k kVar, @NonNull RectF rectF) {
            super(kVar, null);
            this.f22566w = rectF;
        }

        public b(@NonNull b bVar) {
            super(bVar);
            this.f22566w = bVar.f22566w;
        }
    }

    public h(@NonNull b bVar) {
        super(bVar);
        this.f22565z = bVar;
    }
}
