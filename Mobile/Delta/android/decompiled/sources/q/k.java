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
    public static k f28998c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r0 f28999a;

    public class a implements r0.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int[] f29000a = {i.e.R, i.e.P, i.e.f19929a};
        public final int[] b = {i.e.f19942o, i.e.B, i.e.f19947t, i.e.f19943p, i.e.f19944q, i.e.f19946s, i.e.f19945r};

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[] f29001c = {i.e.O, i.e.Q, i.e.f19938k, i.e.K, i.e.L, i.e.M, i.e.N};

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int[] f29002d = {i.e.f19950w, i.e.f19936i, i.e.f19949v};

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int[] f29003e = {i.e.J, i.e.S};

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int[] f29004f = {i.e.f19930c, i.e.f19934g, i.e.f19931d, i.e.f19935h};

        @Override // q.r0.c
        public Drawable a(@NonNull r0 r0Var, @NonNull Context context, int i10) {
            if (i10 == i.e.f19937j) {
                return new LayerDrawable(new Drawable[]{r0Var.i(context, i.e.f19936i), r0Var.i(context, i.e.f19938k)});
            }
            if (i10 == i.e.f19952y) {
                return l(r0Var, context, i.d.f19926i);
            }
            if (i10 == i.e.f19951x) {
                return l(r0Var, context, i.d.f19927j);
            }
            if (i10 == i.e.f19953z) {
                return l(r0Var, context, i.d.f19928k);
            }
            return null;
        }

        @Override // q.r0.c
        public ColorStateList b(@NonNull Context context, int i10) {
            if (i10 == i.e.f19940m) {
                return k.a.a(context, i.c.f19915e);
            }
            if (i10 == i.e.I) {
                return k.a.a(context, i.c.f19918h);
            }
            if (i10 == i.e.H) {
                return k(context);
            }
            if (i10 == i.e.f19933f) {
                return j(context);
            }
            if (i10 == i.e.b) {
                return g(context);
            }
            if (i10 == i.e.f19932e) {
                return i(context);
            }
            if (i10 == i.e.D || i10 == i.e.E) {
                return k.a.a(context, i.c.f19917g);
            }
            if (f(this.b, i10)) {
                return v0.e(context, i.a.f19909y);
            }
            if (f(this.f29003e, i10)) {
                return k.a.a(context, i.c.f19914d);
            }
            if (f(this.f29004f, i10)) {
                return k.a.a(context, i.c.f19913c);
            }
            if (i10 == i.e.A) {
                return k.a.a(context, i.c.f19916f);
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
            if (!f(this.f29000a, i10)) {
                if (f(this.f29001c, i10)) {
                    i11 = i.a.f19907w;
                } else {
                    if (f(this.f29002d, i10)) {
                        mode = PorterDuff.Mode.MULTIPLY;
                    } else {
                        if (i10 == i.e.f19948u) {
                            iRound = Math.round(40.8f);
                            i11 = 16842800;
                            mode = mode;
                        } else if (i10 != i.e.f19939l) {
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
            i11 = i.a.f19909y;
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
                int i11 = i.a.f19909y;
                m(drawableFindDrawableByLayerId, v0.c(context, i11), k.b);
                m(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), v0.c(context, i11), k.b);
                m(layerDrawable.findDrawableByLayerId(R.id.progress), v0.c(context, i.a.f19907w), k.b);
                return true;
            }
            if (i10 != i.e.f19952y && i10 != i.e.f19951x && i10 != i.e.f19953z) {
                return false;
            }
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            m(layerDrawable2.findDrawableByLayerId(R.id.background), v0.b(context, i.a.f19909y), k.b);
            Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress);
            int i12 = i.a.f19907w;
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
            int iC = v0.c(context, i.a.f19908x);
            return new ColorStateList(new int[][]{v0.b, v0.f29137e, v0.f29135c, v0.f29141i}, new int[]{v0.b(context, i.a.f19906v), androidx.core.graphics.c.h(iC, i10), androidx.core.graphics.c.h(iC, i10), i10});
        }

        public final ColorStateList i(@NonNull Context context) {
            return h(context, v0.c(context, i.a.f19905u));
        }

        public final ColorStateList j(@NonNull Context context) {
            return h(context, v0.c(context, i.a.f19906v));
        }

        public final ColorStateList k(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            int i10 = i.a.A;
            ColorStateList colorStateListE = v0.e(context, i10);
            if (colorStateListE == null || !colorStateListE.isStateful()) {
                iArr[0] = v0.b;
                iArr2[0] = v0.b(context, i10);
                iArr[1] = v0.f29138f;
                iArr2[1] = v0.c(context, i.a.f19907w);
                iArr[2] = v0.f29141i;
                iArr2[2] = v0.c(context, i10);
            } else {
                int[] iArr3 = v0.b;
                iArr[0] = iArr3;
                iArr2[0] = colorStateListE.getColorForState(iArr3, 0);
                iArr[1] = v0.f29138f;
                iArr2[1] = v0.c(context, i.a.f19907w);
                iArr[2] = v0.f29141i;
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
            if (f28998c == null) {
                h();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f28998c;
    }

    public static synchronized PorterDuffColorFilter e(int i10, PorterDuff.Mode mode) {
        return r0.k(i10, mode);
    }

    public static synchronized void h() {
        if (f28998c == null) {
            k kVar = new k();
            f28998c = kVar;
            kVar.f28999a = r0.g();
            f28998c.f28999a.t(new a());
        }
    }

    public static void i(Drawable drawable, y0 y0Var, int[] iArr) {
        r0.v(drawable, y0Var, iArr);
    }

    public synchronized Drawable c(@NonNull Context context, int i10) {
        return this.f28999a.i(context, i10);
    }

    public synchronized Drawable d(@NonNull Context context, int i10, boolean z10) {
        return this.f28999a.j(context, i10, z10);
    }

    public synchronized ColorStateList f(@NonNull Context context, int i10) {
        return this.f28999a.l(context, i10);
    }

    public synchronized void g(@NonNull Context context) {
        this.f28999a.r(context);
    }
}
