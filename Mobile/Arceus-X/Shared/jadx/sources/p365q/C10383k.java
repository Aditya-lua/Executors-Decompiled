package p365q;

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
import androidx.core.graphics.C0546c;
import p181i.C6589a;
import p181i.C6591c;
import p181i.C6592d;
import p181i.C6593e;
import p232k.C7399a;

/* JADX INFO: renamed from: q.k */
/* JADX INFO: loaded from: classes.dex */
public final class C10383k {

    /* JADX INFO: renamed from: b */
    public static final PorterDuff.Mode f37332b = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: c */
    public static C10383k f37333c;

    /* JADX INFO: renamed from: a */
    public C10398r0 f37334a;

    /* JADX INFO: renamed from: q.k$a */
    public class a implements C10398r0.c {

        /* JADX INFO: renamed from: a */
        public final int[] f37335a = {C6593e.f25085R, C6593e.f25083P, C6593e.f25087a};

        /* JADX INFO: renamed from: b */
        public final int[] f37336b = {C6593e.f25101o, C6593e.f25069B, C6593e.f25106t, C6593e.f25102p, C6593e.f25103q, C6593e.f25105s, C6593e.f25104r};

        /* JADX INFO: renamed from: c */
        public final int[] f37337c = {C6593e.f25082O, C6593e.f25084Q, C6593e.f25097k, C6593e.f25078K, C6593e.f25079L, C6593e.f25080M, C6593e.f25081N};

        /* JADX INFO: renamed from: d */
        public final int[] f37338d = {C6593e.f25109w, C6593e.f25095i, C6593e.f25108v};

        /* JADX INFO: renamed from: e */
        public final int[] f37339e = {C6593e.f25077J, C6593e.f25086S};

        /* JADX INFO: renamed from: f */
        public final int[] f37340f = {C6593e.f25089c, C6593e.f25093g, C6593e.f25090d, C6593e.f25094h};

        @Override // p365q.C10398r0.c
        /* JADX INFO: renamed from: a */
        public Drawable mo39870a(@NonNull C10398r0 c10398r0, @NonNull Context context, int i10) {
            if (i10 == C6593e.f25096j) {
                return new LayerDrawable(new Drawable[]{c10398r0.m40007i(context, C6593e.f25095i), c10398r0.m40007i(context, C6593e.f25097k)});
            }
            if (i10 == C6593e.f25111y) {
                return m39881l(c10398r0, context, C6592d.f25065i);
            }
            if (i10 == C6593e.f25110x) {
                return m39881l(c10398r0, context, C6592d.f25066j);
            }
            if (i10 == C6593e.f25112z) {
                return m39881l(c10398r0, context, C6592d.f25067k);
            }
            return null;
        }

        @Override // p365q.C10398r0.c
        /* JADX INFO: renamed from: b */
        public ColorStateList mo39871b(@NonNull Context context, int i10) {
            if (i10 == C6593e.f25099m) {
                return C7399a.m30678a(context, C6591c.f25053e);
            }
            if (i10 == C6593e.f25076I) {
                return C7399a.m30678a(context, C6591c.f25056h);
            }
            if (i10 == C6593e.f25075H) {
                return m39880k(context);
            }
            if (i10 == C6593e.f25092f) {
                return m39879j(context);
            }
            if (i10 == C6593e.f25088b) {
                return m39876g(context);
            }
            if (i10 == C6593e.f25091e) {
                return m39878i(context);
            }
            if (i10 == C6593e.f25071D || i10 == C6593e.f25072E) {
                return C7399a.m30678a(context, C6591c.f25055g);
            }
            if (m39875f(this.f37336b, i10)) {
                return C10406v0.m40060e(context, C6589a.f25046y);
            }
            if (m39875f(this.f37339e, i10)) {
                return C7399a.m30678a(context, C6591c.f25052d);
            }
            if (m39875f(this.f37340f, i10)) {
                return C7399a.m30678a(context, C6591c.f25051c);
            }
            if (i10 == C6593e.f25068A) {
                return C7399a.m30678a(context, C6591c.f25054f);
            }
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0050  */
        /* JADX WARN: Code duplicated, block: B:25:0x0061  */
        /* JADX WARN: Code duplicated, block: B:27:0x0065 A[RETURN] */
        @Override // p365q.C10398r0.c
        /* JADX INFO: renamed from: c */
        public boolean mo39872c(@NonNull Context context, int i10, @NonNull Drawable drawable) {
            int i11;
            boolean z10;
            int iRound;
            Drawable drawableMutate;
            PorterDuff.Mode mode = C10383k.f37332b;
            if (!m39875f(this.f37335a, i10)) {
                if (m39875f(this.f37337c, i10)) {
                    i11 = C6589a.f25044w;
                } else {
                    if (m39875f(this.f37338d, i10)) {
                        mode = PorterDuff.Mode.MULTIPLY;
                    } else {
                        if (i10 == C6593e.f25107u) {
                            iRound = Math.round(40.8f);
                            i11 = 16842800;
                            mode = mode;
                        } else if (i10 != C6593e.f25098l) {
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
                drawableMutate.setColorFilter(C10383k.m39863e(C10406v0.m40058c(context, i11), mode));
                if (iRound != -1) {
                    drawableMutate.setAlpha(iRound);
                }
                return true;
            }
            i11 = C6589a.f25046y;
            z10 = true;
            iRound = -1;
            if (z10) {
                return false;
            }
            drawableMutate = drawable.mutate();
            drawableMutate.setColorFilter(C10383k.m39863e(C10406v0.m40058c(context, i11), mode));
            if (iRound != -1) {
                drawableMutate.setAlpha(iRound);
            }
            return true;
        }

        @Override // p365q.C10398r0.c
        /* JADX INFO: renamed from: d */
        public PorterDuff.Mode mo39873d(int i10) {
            if (i10 == C6593e.f25075H) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // p365q.C10398r0.c
        /* JADX INFO: renamed from: e */
        public boolean mo39874e(@NonNull Context context, int i10, @NonNull Drawable drawable) {
            if (i10 == C6593e.f25070C) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.background);
                int i11 = C6589a.f25046y;
                m39882m(drawableFindDrawableByLayerId, C10406v0.m40058c(context, i11), C10383k.f37332b);
                m39882m(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), C10406v0.m40058c(context, i11), C10383k.f37332b);
                m39882m(layerDrawable.findDrawableByLayerId(R.id.progress), C10406v0.m40058c(context, C6589a.f25044w), C10383k.f37332b);
                return true;
            }
            if (i10 != C6593e.f25111y && i10 != C6593e.f25110x && i10 != C6593e.f25112z) {
                return false;
            }
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            m39882m(layerDrawable2.findDrawableByLayerId(R.id.background), C10406v0.m40057b(context, C6589a.f25046y), C10383k.f37332b);
            Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress);
            int i12 = C6589a.f25044w;
            m39882m(drawableFindDrawableByLayerId2, C10406v0.m40058c(context, i12), C10383k.f37332b);
            m39882m(layerDrawable2.findDrawableByLayerId(R.id.progress), C10406v0.m40058c(context, i12), C10383k.f37332b);
            return true;
        }

        /* JADX INFO: renamed from: f */
        public final boolean m39875f(int[] iArr, int i10) {
            for (int i11 : iArr) {
                if (i11 == i10) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: g */
        public final ColorStateList m39876g(@NonNull Context context) {
            return m39877h(context, 0);
        }

        /* JADX INFO: renamed from: h */
        public final ColorStateList m39877h(@NonNull Context context, int i10) {
            int iM40058c = C10406v0.m40058c(context, C6589a.f25045x);
            return new ColorStateList(new int[][]{C10406v0.f37500b, C10406v0.f37503e, C10406v0.f37501c, C10406v0.f37507i}, new int[]{C10406v0.m40057b(context, C6589a.f25043v), C0546c.m2674h(iM40058c, i10), C0546c.m2674h(iM40058c, i10), i10});
        }

        /* JADX INFO: renamed from: i */
        public final ColorStateList m39878i(@NonNull Context context) {
            return m39877h(context, C10406v0.m40058c(context, C6589a.f25042u));
        }

        /* JADX INFO: renamed from: j */
        public final ColorStateList m39879j(@NonNull Context context) {
            return m39877h(context, C10406v0.m40058c(context, C6589a.f25043v));
        }

        /* JADX INFO: renamed from: k */
        public final ColorStateList m39880k(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            int i10 = C6589a.f25005A;
            ColorStateList colorStateListM40060e = C10406v0.m40060e(context, i10);
            if (colorStateListM40060e == null || !colorStateListM40060e.isStateful()) {
                iArr[0] = C10406v0.f37500b;
                iArr2[0] = C10406v0.m40057b(context, i10);
                iArr[1] = C10406v0.f37504f;
                iArr2[1] = C10406v0.m40058c(context, C6589a.f25044w);
                iArr[2] = C10406v0.f37507i;
                iArr2[2] = C10406v0.m40058c(context, i10);
            } else {
                int[] iArr3 = C10406v0.f37500b;
                iArr[0] = iArr3;
                iArr2[0] = colorStateListM40060e.getColorForState(iArr3, 0);
                iArr[1] = C10406v0.f37504f;
                iArr2[1] = C10406v0.m40058c(context, C6589a.f25044w);
                iArr[2] = C10406v0.f37507i;
                iArr2[2] = colorStateListM40060e.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        /* JADX INFO: renamed from: l */
        public final LayerDrawable m39881l(@NonNull C10398r0 c10398r0, @NonNull Context context, int i10) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i10);
            Drawable drawableM40007i = c10398r0.m40007i(context, C6593e.f25073F);
            Drawable drawableM40007i2 = c10398r0.m40007i(context, C6593e.f25074G);
            if ((drawableM40007i instanceof BitmapDrawable) && drawableM40007i.getIntrinsicWidth() == dimensionPixelSize && drawableM40007i.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) drawableM40007i;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawableM40007i.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableM40007i.draw(canvas);
                bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
                bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((drawableM40007i2 instanceof BitmapDrawable) && drawableM40007i2.getIntrinsicWidth() == dimensionPixelSize && drawableM40007i2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) drawableM40007i2;
            } else {
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                drawableM40007i2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableM40007i2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, R.id.background);
            layerDrawable.setId(1, R.id.secondaryProgress);
            layerDrawable.setId(2, R.id.progress);
            return layerDrawable;
        }

        /* JADX INFO: renamed from: m */
        public final void m39882m(Drawable drawable, int i10, PorterDuff.Mode mode) {
            Drawable drawableMutate = drawable.mutate();
            if (mode == null) {
                mode = C10383k.f37332b;
            }
            drawableMutate.setColorFilter(C10383k.m39863e(i10, mode));
        }
    }

    /* JADX INFO: renamed from: b */
    public static synchronized C10383k m39862b() {
        try {
            if (f37333c == null) {
                m39864h();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f37333c;
    }

    /* JADX INFO: renamed from: e */
    public static synchronized PorterDuffColorFilter m39863e(int i10, PorterDuff.Mode mode) {
        return C10398r0.m39998k(i10, mode);
    }

    /* JADX INFO: renamed from: h */
    public static synchronized void m39864h() {
        if (f37333c == null) {
            C10383k c10383k = new C10383k();
            f37333c = c10383k;
            c10383k.f37334a = C10398r0.m39997g();
            f37333c.f37334a.m40015t(new a());
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m39865i(Drawable drawable, C10412y0 c10412y0, int[] iArr) {
        C10398r0.m40001v(drawable, c10412y0, iArr);
    }

    /* JADX INFO: renamed from: c */
    public synchronized Drawable m39866c(@NonNull Context context, int i10) {
        return this.f37334a.m40007i(context, i10);
    }

    /* JADX INFO: renamed from: d */
    public synchronized Drawable m39867d(@NonNull Context context, int i10, boolean z10) {
        return this.f37334a.m40008j(context, i10, z10);
    }

    /* JADX INFO: renamed from: f */
    public synchronized ColorStateList m39868f(@NonNull Context context, int i10) {
        return this.f37334a.m40009l(context, i10);
    }

    /* JADX INFO: renamed from: g */
    public synchronized void m39869g(@NonNull Context context) {
        this.f37334a.m40013r(context);
    }
}
