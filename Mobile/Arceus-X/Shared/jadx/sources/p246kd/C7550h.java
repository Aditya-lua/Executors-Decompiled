package p246kd;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import p168hd.C6363g;
import p168hd.C6367k;

/* JADX INFO: renamed from: kd.h */
/* JADX INFO: loaded from: classes2.dex */
public class C7550h extends C6363g {

    /* JADX INFO: renamed from: z */
    @NonNull
    public b f28930z;

    /* JADX INFO: renamed from: kd.h$c */
    @TargetApi(18)
    public static class c extends C7550h {
        public c(@NonNull b bVar) {
            super(bVar);
        }

        @Override // p168hd.C6363g
        /* JADX INFO: renamed from: r */
        public void mo27743r(@NonNull Canvas canvas) {
            if (this.f28930z.f28931w.isEmpty()) {
                super.mo27743r(canvas);
                return;
            }
            canvas.save();
            canvas.clipOutRect(this.f28930z.f28931w);
            super.mo27743r(canvas);
            canvas.restore();
        }
    }

    /* JADX INFO: renamed from: o0 */
    public static C7550h m31217o0(C6367k c6367k) {
        if (c6367k == null) {
            c6367k = new C6367k();
        }
        return m31218p0(new b(c6367k, new RectF()));
    }

    /* JADX INFO: renamed from: p0 */
    public static C7550h m31218p0(@NonNull b bVar) {
        return new c(bVar);
    }

    @Override // p168hd.C6363g, android.graphics.drawable.Drawable
    @NonNull
    public Drawable mutate() {
        this.f28930z = new b(this.f28930z);
        return this;
    }

    /* JADX INFO: renamed from: q0 */
    public boolean m31219q0() {
        return !this.f28930z.f28931w.isEmpty();
    }

    /* JADX INFO: renamed from: r0 */
    public void m31220r0() {
        m31221s0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    /* JADX INFO: renamed from: s0 */
    public void m31221s0(float f10, float f11, float f12, float f13) {
        if (f10 == this.f28930z.f28931w.left && f11 == this.f28930z.f28931w.top && f12 == this.f28930z.f28931w.right && f13 == this.f28930z.f28931w.bottom) {
            return;
        }
        this.f28930z.f28931w.set(f10, f11, f12, f13);
        invalidateSelf();
    }

    /* JADX INFO: renamed from: t0 */
    public void m31222t0(@NonNull RectF rectF) {
        m31221s0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    /* JADX INFO: renamed from: kd.h$b */
    public static final class b extends C6363g.c {

        /* JADX INFO: renamed from: w */
        @NonNull
        public final RectF f28931w;

        @Override // p168hd.C6363g.c, android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            C7550h c7550hM31218p0 = C7550h.m31218p0(this);
            c7550hM31218p0.invalidateSelf();
            return c7550hM31218p0;
        }

        public b(@NonNull C6367k c6367k, @NonNull RectF rectF) {
            super(c6367k, null);
            this.f28931w = rectF;
        }

        public b(@NonNull b bVar) {
            super(bVar);
            this.f28931w = bVar.f28931w;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C7550h(@NonNull b bVar) {
        super(bVar);
        this.f28930z = bVar;
    }
}
