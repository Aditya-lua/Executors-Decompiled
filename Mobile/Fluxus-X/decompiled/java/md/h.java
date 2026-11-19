package md;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import com.google.mlkit.common.MlKitException;

/* JADX INFO: loaded from: classes2.dex */
public class h extends id.g {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NonNull
    public b f23143z;

    @TargetApi(MlKitException.UNSUPPORTED)
    public static class c extends h {
        public c(@NonNull b bVar) {
            super(bVar);
        }

        @Override // id.g
        public void r(@NonNull Canvas canvas) {
            if (this.f23143z.f23144w.isEmpty()) {
                super.r(canvas);
                return;
            }
            canvas.save();
            canvas.clipOutRect(this.f23143z.f23144w);
            super.r(canvas);
            canvas.restore();
        }
    }

    public static h o0(id.k kVar) {
        if (kVar == null) {
            kVar = new id.k();
        }
        return p0(new b(kVar, new RectF()));
    }

    public static h p0(@NonNull b bVar) {
        return new c(bVar);
    }

    @Override // id.g, android.graphics.drawable.Drawable
    @NonNull
    public Drawable mutate() {
        this.f23143z = new b(this.f23143z);
        return this;
    }

    public boolean q0() {
        return !this.f23143z.f23144w.isEmpty();
    }

    public void r0() {
        s0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public void s0(float f10, float f11, float f12, float f13) {
        if (f10 == this.f23143z.f23144w.left && f11 == this.f23143z.f23144w.top && f12 == this.f23143z.f23144w.right && f13 == this.f23143z.f23144w.bottom) {
            return;
        }
        this.f23143z.f23144w.set(f10, f11, f12, f13);
        invalidateSelf();
    }

    public void t0(@NonNull RectF rectF) {
        s0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public static final class b extends id.g.c {

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        @NonNull
        public final RectF f23144w;

        @Override // id.g.c, android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            h hVarP0 = h.p0(this);
            hVarP0.invalidateSelf();
            return hVarP0;
        }

        public b(@NonNull id.k kVar, @NonNull RectF rectF) {
            super(kVar, null);
            this.f23144w = rectF;
        }

        public b(@NonNull b bVar) {
            super(bVar);
            this.f23144w = bVar.f23144w;
        }
    }

    public h(@NonNull b bVar) {
        super(bVar);
        this.f23143z = bVar;
    }
}
