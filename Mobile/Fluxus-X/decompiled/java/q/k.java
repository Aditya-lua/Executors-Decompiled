package q;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class k {
    public static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static k f29538c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s0 f29539a;

    public class a implements s0.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int[] f29540a = {i.e.R, i.e.P, i.e.f18772a};
        public final int[] b = {i.e.f18785o, i.e.B, i.e.f18790t, i.e.f18786p, i.e.f18787q, i.e.f18789s, i.e.f18788r};

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[] f29541c = {i.e.O, i.e.Q, i.e.f18781k, i.e.K, i.e.L, i.e.M, i.e.N};

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int[] f29542d = {i.e.f18793w, i.e.f18779i, i.e.f18792v};

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int[] f29543e = {i.e.J, i.e.S};

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int[] f29544f = {i.e.f18773c, i.e.f18777g, i.e.f18774d, i.e.f18778h};

        @Override // q.s0.c
        public Drawable a(@NonNull s0 s0Var, @NonNull Context context, int i10) {
            if (i10 == i.e.f18780j) {
                return new LayerDrawable(new Drawable[]{s0Var.i(context, i.e.f18779i), s0Var.i(context, i.e.f18781k)});
            }
            if (i10 == i.e.f18795y) {
                return l(s0Var, context, i.d.f18769i);
            }
            if (i10 == i.e.f18794x) {
                return l(s0Var, context, i.d.f18770j);
            }
            if (i10 == i.e.f18796z) {
                return l(s0Var, context, i.d.f18771k);
            }
            return null;
        }

        @Override // q.s0.c
        public ColorStateList b(@NonNull Context context, int i10) {
            if (i10 == i.e.f18783m) {
                return k.a.a(context, i.c.f18758e);
            }
            if (i10 == i.e.I) {
                return k.a.a(context, i.c.f18761h);
            }
            if (i10 == i.e.H) {
                return k(context);
            }
            if (i10 == i.e.f18776f) {
                return j(context);
            }
            if (i10 == i.e.b) {
                return g(context);
            }
            if (i10 == i.e.f18775e) {
                return i(context);
            }
            if (i10 == i.e.D || i10 == i.e.E) {
                return k.a.a(context, i.c.f18760g);
            }
            if (f(this.b, i10)) {
                return w0.e(context, i.a.f18752y);
            }
            if (f(this.f29543e, i10)) {
                return k.a.a(context, i.c.f18757d);
            }
            if (f(this.f29544f, i10)) {
                return k.a.a(context, i.c.f18756c);
            }
            if (i10 == i.e.A) {
                return k.a.a(context, i.c.f18759f);
            }
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0050  */
        /* JADX WARN: Code duplicated, block: B:25:0x0061  */
        /* JADX WARN: Code duplicated, block: B:27:0x0065 A[RETURN] */
        @Override // q.s0.c
        public boolean c(@NonNull Context context, int i10, @NonNull Drawable drawable) {
            int i11;
            boolean z10;
            int iRound;
            Drawable drawableMutate;
            PorterDuff.Mode mode = k.b;
            if (!f(this.f29540a, i10)) {
                if (f(this.f29541c, i10)) {
                    i11 = i.a.f18750w;
                } else {
                    if (f(this.f29542d, i10)) {
                        mode = PorterDuff.Mode.MULTIPLY;
                    } else {
                        if (i10 == i.e.f18791u) {
                            iRound = Math.round(40.8f);
                            i11 = 16842800;
                            mode = mode;
                        } else if (i10 != i.e.f18782l) {
                            i11 = 0;
                            z10 = false;
                            iRound = -1;
                        }
                        z10 = true;
                    }
                    mode = mode;
                    iRound = -1;
                    i11 = 16842801;
                    z10 = true;
                }
                if (z10) {
                    return false;
                }
                drawableMutate = drawable.mutate();
                drawableMutate.setColorFilter(k.e(w0.c(context, i11), mode));
                if (iRound != -1) {
                    drawableMutate.setAlpha(iRound);
                }
                return true;
            }
            i11 = i.a.f18752y;
            z10 = true;
            iRound = -1;
            if (z10) {
                return false;
            }
            drawableMutate = drawable.mutate();
            drawableMutate.setColorFilter(k.e(w0.c(context, i11), mode));
            if (iRound != -1) {
                drawableMutate.setAlpha(iRound);
            }
            return true;
        }

        @Override // q.s0.c
        public PorterDuff.Mode d(int i10) {
            if (i10 == i.e.H) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // q.s0.c
        public boolean e(@NonNull Context context, int i10, @NonNull Drawable drawable) {
            if (i10 == i.e.C) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                m(layerDrawable.findDrawableByLayerId(R.id.background), w0.c(context, i.a.f18752y), k.b);
                m(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), w0.c(context, i.a.f18752y), k.b);
                m(layerDrawable.findDrawableByLayerId(R.id.progress), w0.c(context, i.a.f18750w), k.b);
                return true;
            }
            if (i10 != i.e.f18795y && i10 != i.e.f18794x && i10 != i.e.f18796z) {
                return false;
            }
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            m(layerDrawable2.findDrawableByLayerId(R.id.background), w0.b(context, i.a.f18752y), k.b);
            m(layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress), w0.c(context, i.a.f18750w), k.b);
            m(layerDrawable2.findDrawableByLayerId(R.id.progress), w0.c(context, i.a.f18750w), k.b);
            return true;
        }

        public final boolean f(int[] iArr, int i10) {
            for (int i11 : iArr) {
                if (i11 == i10) {
                    return true;
                }
            }
            return false;
        }

        public final ColorStateList g(@NonNull Context context) {
            return h(context, 0);
        }

        public final ColorStateList h(@NonNull Context context, int i10) {
            int iC = w0.c(context, i.a.f18751x);
            return new ColorStateList(new int[][]{w0.b, w0.f29677e, w0.f29675c, w0.f29681i}, new int[]{w0.b(context, i.a.f18749v), androidx.core.graphics.c.h(iC, i10), androidx.core.graphics.c.h(iC, i10), i10});
        }

        public final ColorStateList i(@NonNull Context context) {
            return h(context, w0.c(context, i.a.f18748u));
        }

        public final ColorStateList j(@NonNull Context context) {
            return h(context, w0.c(context, i.a.f18749v));
        }

        public final ColorStateList k(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList colorStateListE = w0.e(context, i.a.A);
            if (colorStateListE == null || !colorStateListE.isStateful()) {
                iArr[0] = w0.b;
                iArr2[0] = w0.b(context, i.a.A);
                iArr[1] = w0.f29678f;
                iArr2[1] = w0.c(context, i.a.f18750w);
                iArr[2] = w0.f29681i;
                iArr2[2] = w0.c(context, i.a.A);
            } else {
                int[] iArr3 = w0.b;
                iArr[0] = iArr3;
                iArr2[0] = colorStateListE.getColorForState(iArr3, 0);
                iArr[1] = w0.f29678f;
                iArr2[1] = w0.c(context, i.a.f18750w);
                iArr[2] = w0.f29681i;
                iArr2[2] = colorStateListE.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        public final LayerDrawable l(@NonNull s0 s0Var, @NonNull Context context, int i10) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i10);
            Drawable drawableI = s0Var.i(context, i.e.F);
            Drawable drawableI2 = s0Var.i(context, i.e.G);
            if ((drawableI instanceof BitmapDrawable) && drawableI.getIntrinsicWidth() == dimensionPixelSize && drawableI.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) drawableI;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawableI.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableI.draw(canvas);
                bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
                bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((drawableI2 instanceof BitmapDrawable) && drawableI2.getIntrinsicWidth() == dimensionPixelSize && drawableI2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) drawableI2;
            } else {
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                drawableI2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableI2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, R.id.background);
            layerDrawable.setId(1, R.id.secondaryProgress);
            layerDrawable.setId(2, R.id.progress);
            return layerDrawable;
        }

        public final void m(Drawable drawable, int i10, PorterDuff.Mode mode) {
            Drawable drawableMutate = drawable.mutate();
            if (mode == null) {
                mode = k.b;
            }
            drawableMutate.setColorFilter(k.e(i10, mode));
        }
    }

    public static synchronized k b() {
        try {
            if (f29538c == null) {
                h();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f29538c;
    }

    public static synchronized PorterDuffColorFilter e(int i10, PorterDuff.Mode mode) {
        return s0.k(i10, mode);
    }

    public static synchronized void h() {
        if (f29538c == null) {
            k kVar = new k();
            f29538c = kVar;
            kVar.f29539a = s0.g();
            f29538c.f29539a.t(new a());
        }
    }

    public static void i(Drawable drawable, z0 z0Var, int[] iArr) {
        s0.v(drawable, z0Var, iArr);
    }

    public synchronized Drawable c(@NonNull Context context, int i10) {
        return this.f29539a.i(context, i10);
    }

    public synchronized Drawable d(@NonNull Context context, int i10, boolean z10) {
        return this.f29539a.j(context, i10, z10);
    }

    public synchronized ColorStateList f(@NonNull Context context, int i10) {
        return this.f29539a.l(context, i10);
    }

    public synchronized void g(@NonNull Context context) {
        this.f29539a.r(context);
    }
}
