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
    public static k f29351c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r0 f29352a;

    public class a implements r0.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int[] f29353a = {i.e.R, i.e.P, i.e.f20045a};
        public final int[] b = {i.e.f20058o, i.e.B, i.e.f20063t, i.e.f20059p, i.e.f20060q, i.e.f20062s, i.e.f20061r};

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[] f29354c = {i.e.O, i.e.Q, i.e.f20054k, i.e.K, i.e.L, i.e.M, i.e.N};

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int[] f29355d = {i.e.f20066w, i.e.f20052i, i.e.f20065v};

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int[] f29356e = {i.e.J, i.e.S};

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int[] f29357f = {i.e.f20046c, i.e.f20050g, i.e.f20047d, i.e.f20051h};

        @Override // q.r0.c
        public Drawable a(@NonNull r0 r0Var, @NonNull Context context, int i10) {
            if (i10 == i.e.f20053j) {
                return new LayerDrawable(new Drawable[]{r0Var.i(context, i.e.f20052i), r0Var.i(context, i.e.f20054k)});
            }
            if (i10 == i.e.f20068y) {
                return l(r0Var, context, i.d.f20042i);
            }
            if (i10 == i.e.f20067x) {
                return l(r0Var, context, i.d.f20043j);
            }
            if (i10 == i.e.f20069z) {
                return l(r0Var, context, i.d.f20044k);
            }
            return null;
        }

        @Override // q.r0.c
        public ColorStateList b(@NonNull Context context, int i10) {
            if (i10 == i.e.f20056m) {
                return k.a.a(context, i.c.f20031e);
            }
            if (i10 == i.e.I) {
                return k.a.a(context, i.c.f20034h);
            }
            if (i10 == i.e.H) {
                return k(context);
            }
            if (i10 == i.e.f20049f) {
                return j(context);
            }
            if (i10 == i.e.b) {
                return g(context);
            }
            if (i10 == i.e.f20048e) {
                return i(context);
            }
            if (i10 == i.e.D || i10 == i.e.E) {
                return k.a.a(context, i.c.f20033g);
            }
            if (f(this.b, i10)) {
                return v0.e(context, i.a.f20025y);
            }
            if (f(this.f29356e, i10)) {
                return k.a.a(context, i.c.f20030d);
            }
            if (f(this.f29357f, i10)) {
                return k.a.a(context, i.c.f20029c);
            }
            if (i10 == i.e.A) {
                return k.a.a(context, i.c.f20032f);
            }
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0050  */
        /* JADX WARN: Code duplicated, block: B:25:0x0061  */
        /* JADX WARN: Code duplicated, block: B:27:0x0065 A[RETURN] */
        @Override // q.r0.c
        public boolean c(@NonNull Context context, int i10, @NonNull Drawable drawable) {
            int i11;
            boolean z10;
            int iRound;
            Drawable drawableMutate;
            PorterDuff.Mode mode = k.b;
            if (!f(this.f29353a, i10)) {
                if (f(this.f29354c, i10)) {
                    i11 = i.a.f20023w;
                } else {
                    if (f(this.f29355d, i10)) {
                        mode = PorterDuff.Mode.MULTIPLY;
                    } else {
                        if (i10 == i.e.f20064u) {
                            iRound = Math.round(40.8f);
                            i11 = 16842800;
                            mode = mode;
                        } else if (i10 != i.e.f20055l) {
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
                drawableMutate.setColorFilter(k.e(v0.c(context, i11), mode));
                if (iRound != -1) {
                    drawableMutate.setAlpha(iRound);
                }
                return true;
            }
            i11 = i.a.f20025y;
            z10 = true;
            iRound = -1;
            if (z10) {
                return false;
            }
            drawableMutate = drawable.mutate();
            drawableMutate.setColorFilter(k.e(v0.c(context, i11), mode));
            if (iRound != -1) {
                drawableMutate.setAlpha(iRound);
            }
            return true;
        }

        @Override // q.r0.c
        public PorterDuff.Mode d(int i10) {
            if (i10 == i.e.H) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // q.r0.c
        public boolean e(@NonNull Context context, int i10, @NonNull Drawable drawable) {
            if (i10 == i.e.C) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.background);
                int i11 = i.a.f20025y;
                m(drawableFindDrawableByLayerId, v0.c(context, i11), k.b);
                m(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), v0.c(context, i11), k.b);
                m(layerDrawable.findDrawableByLayerId(R.id.progress), v0.c(context, i.a.f20023w), k.b);
                return true;
            }
            if (i10 != i.e.f20068y && i10 != i.e.f20067x && i10 != i.e.f20069z) {
                return false;
            }
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            m(layerDrawable2.findDrawableByLayerId(R.id.background), v0.b(context, i.a.f20025y), k.b);
            Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress);
            int i12 = i.a.f20023w;
            m(drawableFindDrawableByLayerId2, v0.c(context, i12), k.b);
            m(layerDrawable2.findDrawableByLayerId(R.id.progress), v0.c(context, i12), k.b);
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
            int iC = v0.c(context, i.a.f20024x);
            return new ColorStateList(new int[][]{v0.b, v0.f29490e, v0.f29488c, v0.f29494i}, new int[]{v0.b(context, i.a.f20022v), androidx.core.graphics.c.h(iC, i10), androidx.core.graphics.c.h(iC, i10), i10});
        }

        public final ColorStateList i(@NonNull Context context) {
            return h(context, v0.c(context, i.a.f20021u));
        }

        public final ColorStateList j(@NonNull Context context) {
            return h(context, v0.c(context, i.a.f20022v));
        }

        public final ColorStateList k(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            int i10 = i.a.A;
            ColorStateList colorStateListE = v0.e(context, i10);
            if (colorStateListE == null || !colorStateListE.isStateful()) {
                iArr[0] = v0.b;
                iArr2[0] = v0.b(context, i10);
                iArr[1] = v0.f29491f;
                iArr2[1] = v0.c(context, i.a.f20023w);
                iArr[2] = v0.f29494i;
                iArr2[2] = v0.c(context, i10);
            } else {
                int[] iArr3 = v0.b;
                iArr[0] = iArr3;
                iArr2[0] = colorStateListE.getColorForState(iArr3, 0);
                iArr[1] = v0.f29491f;
                iArr2[1] = v0.c(context, i.a.f20023w);
                iArr[2] = v0.f29494i;
                iArr2[2] = colorStateListE.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        public final LayerDrawable l(@NonNull r0 r0Var, @NonNull Context context, int i10) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i10);
            Drawable drawableI = r0Var.i(context, i.e.F);
            Drawable drawableI2 = r0Var.i(context, i.e.G);
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
            if (f29351c == null) {
                h();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f29351c;
    }

    public static synchronized PorterDuffColorFilter e(int i10, PorterDuff.Mode mode) {
        return r0.k(i10, mode);
    }

    public static synchronized void h() {
        if (f29351c == null) {
            k kVar = new k();
            f29351c = kVar;
            kVar.f29352a = r0.g();
            f29351c.f29352a.t(new a());
        }
    }

    public static void i(Drawable drawable, y0 y0Var, int[] iArr) {
        r0.v(drawable, y0Var, iArr);
    }

    public synchronized Drawable c(@NonNull Context context, int i10) {
        return this.f29352a.i(context, i10);
    }

    public synchronized Drawable d(@NonNull Context context, int i10, boolean z10) {
        return this.f29352a.j(context, i10, z10);
    }

    public synchronized ColorStateList f(@NonNull Context context, int i10) {
        return this.f29352a.l(context, i10);
    }

    public synchronized void g(@NonNull Context context) {
        this.f29352a.r(context);
    }
}
