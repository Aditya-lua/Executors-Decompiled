package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f1796a;
    public static final w1.i<String, Typeface> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Paint f1797c;

    public static class a extends v2.g.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public n2.h.f f1798a;

        public a(n2.h.f fVar) {
            this.f1798a = fVar;
        }

        @Override // v2.g.c
        public void a(int i10) {
            n2.h.f fVar = this.f1798a;
            if (fVar != null) {
                fVar.f(i10);
            }
        }

        @Override // v2.g.c
        public void b(Typeface typeface) {
            n2.h.f fVar = this.f1798a;
            if (fVar != null) {
                fVar.g(typeface);
            }
        }
    }

    static {
        n5.a.c("TypefaceCompat static init");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            f1796a = new p();
        } else if (i10 >= 29) {
            f1796a = new o();
        } else if (i10 >= 28) {
            f1796a = new n();
        } else {
            f1796a = new m();
        }
        b = new w1.i<>(16);
        f1797c = null;
        n5.a.f();
    }

    public static Typeface a(Context context, Typeface typeface, int i10) {
        if (context != null) {
            return Typeface.create(typeface, i10);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface b(Context context, CancellationSignal cancellationSignal, v2.g.b[] bVarArr, int i10) {
        n5.a.c("TypefaceCompat.createFromFontInfo");
        try {
            return f1796a.b(context, cancellationSignal, bVarArr, i10);
        } finally {
            n5.a.f();
        }
    }

    public static Typeface c(Context context, CancellationSignal cancellationSignal, List<v2.g.b[]> list, int i10) {
        n5.a.c("TypefaceCompat.createFromFontInfoWithFallback");
        try {
            return f1796a.c(context, cancellationSignal, list, i10);
        } finally {
            n5.a.f();
        }
    }

    public static Typeface d(Context context, n2.e.b bVar, Resources resources, int i10, String str, int i11, int i12, n2.h.f fVar, Handler handler, boolean z10) {
        Typeface typefaceA;
        if (bVar instanceof n2.e.C0433e) {
            n2.e.C0433e c0433e = (n2.e.C0433e) bVar;
            Typeface typefaceI = i(c0433e);
            if (typefaceI != null) {
                if (fVar != null) {
                    fVar.d(typefaceI, handler);
                }
                b.e(f(resources, i10, str, i11, i12), typefaceI);
                return typefaceI;
            }
            typefaceA = v2.g.c(context, c0433e.b(), i12, !z10 ? fVar != null : c0433e.a() != 0, z10 ? c0433e.d() : -1, n2.h.f.e(handler), new a(fVar));
        } else {
            typefaceA = f1796a.a(context, (n2.e.c) bVar, resources, i12);
            if (fVar != null) {
                if (typefaceA != null) {
                    fVar.d(typefaceA, handler);
                } else {
                    fVar.c(-3, handler);
                }
            }
        }
        if (typefaceA != null) {
            b.e(f(resources, i10, str, i11, i12), typefaceA);
        }
        return typefaceA;
    }

    public static Typeface e(Context context, Resources resources, int i10, String str, int i11, int i12) {
        Typeface typefaceD = f1796a.d(context, resources, i10, str, i12);
        if (typefaceD != null) {
            b.e(f(resources, i10, str, i11, i12), typefaceD);
        }
        return typefaceD;
    }

    public static String f(Resources resources, int i10, String str, int i11, int i12) {
        return resources.getResourcePackageName(i10) + '-' + str + '-' + i11 + '-' + i10 + '-' + i12;
    }

    public static Typeface g(Resources resources, int i10, String str, int i11, int i12) {
        return b.d(f(resources, i10, str, i11, i12));
    }

    public static Typeface h(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface typefaceCreate = Typeface.create(str, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate != null && !typefaceCreate.equals(typefaceCreate2)) {
                return typefaceCreate;
            }
        }
        return null;
    }

    public static Typeface i(n2.e.C0433e c0433e) {
        FontFamily fontFamilyBuild;
        Typeface typefaceH;
        String strC = c0433e.c();
        if (!TextUtils.isEmpty(strC) && (typefaceH = h(strC)) != null) {
            return typefaceH;
        }
        List<v2.e> listB = c0433e.b();
        if (listB.size() == 1) {
            return h(listB.get(0).h());
        }
        if (Build.VERSION.SDK_INT < 31) {
            return null;
        }
        for (int i10 = 0; i10 < listB.size(); i10++) {
            if (h(listB.get(i10).h()) == null) {
                return null;
            }
        }
        Typeface.CustomFallbackBuilder customFallbackBuilderA = null;
        for (int i11 = 0; i11 < listB.size(); i11++) {
            v2.e eVar = listB.get(i11);
            if (i11 == listB.size() - 1 && TextUtils.isEmpty(eVar.i())) {
                customFallbackBuilderA.setSystemFallback(eVar.h());
                break;
            }
            Font fontJ = j(h(eVar.h()));
            if (fontJ == null) {
                Log.w("TypefaceCompat", "Unable identify the primary font for " + eVar.h() + ". Falling back to provider font.");
                return null;
            }
            if (TextUtils.isEmpty(eVar.i())) {
                try {
                    i.a();
                    j.a();
                    fontFamilyBuild = g.a(f.a(fontJ).setFontVariationSettings(eVar.i()).build()).build();
                } catch (IOException unused) {
                    Log.e("TypefaceCompat", "Failed to clone Font instance. Fall back to provider font.");
                    return null;
                }
            } else {
                fontFamilyBuild = g.a(fontJ).build();
            }
            if (customFallbackBuilderA == null) {
                customFallbackBuilderA = h.a(fontFamilyBuild);
            } else {
                customFallbackBuilderA.addCustomFallback(fontFamilyBuild);
            }
        }
        return customFallbackBuilderA.build();
    }

    public static Font j(Typeface typeface) {
        if (f1797c == null) {
            f1797c = new Paint();
        }
        f1797c.setTextSize(10.0f);
        f1797c.setTypeface(typeface);
        PositionedGlyphs positionedGlyphsShapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, f1797c);
        if (positionedGlyphsShapeTextRun.glyphCount() == 0) {
            return null;
        }
        return positionedGlyphsShapeTextRun.getFont(0);
    }
}
