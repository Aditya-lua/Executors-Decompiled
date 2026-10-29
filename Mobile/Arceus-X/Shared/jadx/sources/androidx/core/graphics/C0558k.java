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
import p298n2.C8867e;
import p298n2.C8870h;
import p301n5.C8884a;
import p482v2.C12002e;
import p482v2.C12004g;
import p504w1.C12285i;

/* JADX INFO: renamed from: androidx.core.graphics.k */
/* JADX INFO: loaded from: classes.dex */
public class C0558k {

    /* JADX INFO: renamed from: a */
    public static final C0564q f2328a;

    /* JADX INFO: renamed from: b */
    public static final C12285i<String, Typeface> f2329b;

    /* JADX INFO: renamed from: c */
    public static Paint f2330c;

    /* JADX INFO: renamed from: androidx.core.graphics.k$a */
    public static class a extends C12004g.c {

        /* JADX INFO: renamed from: a */
        public C8870h.f f2331a;

        public a(C8870h.f fVar) {
            this.f2331a = fVar;
        }

        @Override // p482v2.C12004g.c
        /* JADX INFO: renamed from: a */
        public void mo2745a(int i10) {
            C8870h.f fVar = this.f2331a;
            if (fVar != null) {
                fVar.mo23760f(i10);
            }
        }

        @Override // p482v2.C12004g.c
        /* JADX INFO: renamed from: b */
        public void mo2746b(Typeface typeface) {
            C8870h.f fVar = this.f2331a;
            if (fVar != null) {
                fVar.mo23761g(typeface);
            }
        }
    }

    static {
        C8884a.m35746c("TypefaceCompat static init");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            f2328a = new C0563p();
        } else if (i10 >= 29) {
            f2328a = new C0562o();
        } else if (i10 >= 28) {
            f2328a = new C0561n();
        } else {
            f2328a = new C0560m();
        }
        f2329b = new C12285i<>(16);
        f2330c = null;
        C8884a.m35749f();
    }

    /* JADX INFO: renamed from: a */
    public static Typeface m2735a(Context context, Typeface typeface, int i10) {
        if (context != null) {
            return Typeface.create(typeface, i10);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    /* JADX INFO: renamed from: b */
    public static Typeface m2736b(Context context, CancellationSignal cancellationSignal, C12004g.b[] bVarArr, int i10) {
        C8884a.m35746c("TypefaceCompat.createFromFontInfo");
        try {
            return f2328a.mo2752b(context, cancellationSignal, bVarArr, i10);
        } finally {
            C8884a.m35749f();
        }
    }

    /* JADX INFO: renamed from: c */
    public static Typeface m2737c(Context context, CancellationSignal cancellationSignal, List<C12004g.b[]> list, int i10) {
        C8884a.m35746c("TypefaceCompat.createFromFontInfoWithFallback");
        try {
            return f2328a.mo2753c(context, cancellationSignal, list, i10);
        } finally {
            C8884a.m35749f();
        }
    }

    /* JADX INFO: renamed from: d */
    public static Typeface m2738d(Context context, C8867e.b bVar, Resources resources, int i10, String str, int i11, int i12, C8870h.f fVar, Handler handler, boolean z10) {
        Typeface typefaceMo2751a;
        if (bVar instanceof C8867e.e) {
            C8867e.e eVar = (C8867e.e) bVar;
            Typeface typefaceM2743i = m2743i(eVar);
            if (typefaceM2743i != null) {
                if (fVar != null) {
                    fVar.m35681d(typefaceM2743i, handler);
                }
                f2329b.m45613e(m2740f(resources, i10, str, i11, i12), typefaceM2743i);
                return typefaceM2743i;
            }
            typefaceMo2751a = C12004g.m44809c(context, eVar.m35648b(), i12, !z10 ? fVar != null : eVar.m35647a() != 0, z10 ? eVar.m35650d() : -1, C8870h.f.m35679e(handler), new a(fVar));
        } else {
            typefaceMo2751a = f2328a.mo2751a(context, (C8867e.c) bVar, resources, i12);
            if (fVar != null) {
                if (typefaceMo2751a != null) {
                    fVar.m35681d(typefaceMo2751a, handler);
                } else {
                    fVar.m35680c(-3, handler);
                }
            }
        }
        if (typefaceMo2751a != null) {
            f2329b.m45613e(m2740f(resources, i10, str, i11, i12), typefaceMo2751a);
        }
        return typefaceMo2751a;
    }

    /* JADX INFO: renamed from: e */
    public static Typeface m2739e(Context context, Resources resources, int i10, String str, int i11, int i12) {
        Typeface typefaceMo2754d = f2328a.mo2754d(context, resources, i10, str, i12);
        if (typefaceMo2754d != null) {
            f2329b.m45613e(m2740f(resources, i10, str, i11, i12), typefaceMo2754d);
        }
        return typefaceMo2754d;
    }

    /* JADX INFO: renamed from: f */
    public static String m2740f(Resources resources, int i10, String str, int i11, int i12) {
        return resources.getResourcePackageName(i10) + '-' + str + '-' + i11 + '-' + i10 + '-' + i12;
    }

    /* JADX INFO: renamed from: g */
    public static Typeface m2741g(Resources resources, int i10, String str, int i11, int i12) {
        return f2329b.m45612d(m2740f(resources, i10, str, i11, i12));
    }

    /* JADX INFO: renamed from: h */
    public static Typeface m2742h(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface typefaceCreate = Typeface.create(str, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate != null && !typefaceCreate.equals(typefaceCreate2)) {
                return typefaceCreate;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public static Typeface m2743i(C8867e.e eVar) {
        FontFamily fontFamilyBuild;
        Typeface typefaceM2742h;
        String strM35649c = eVar.m35649c();
        if (!TextUtils.isEmpty(strM35649c) && (typefaceM2742h = m2742h(strM35649c)) != null) {
            return typefaceM2742h;
        }
        List<C12002e> listM35648b = eVar.m35648b();
        if (listM35648b.size() == 1) {
            return m2742h(listM35648b.get(0).m44795h());
        }
        if (Build.VERSION.SDK_INT < 31) {
            return null;
        }
        for (int i10 = 0; i10 < listM35648b.size(); i10++) {
            if (m2742h(listM35648b.get(i10).m44795h()) == null) {
                return null;
            }
        }
        Typeface.CustomFallbackBuilder customFallbackBuilderM2732a = null;
        for (int i11 = 0; i11 < listM35648b.size(); i11++) {
            C12002e c12002e = listM35648b.get(i11);
            if (i11 == listM35648b.size() - 1 && TextUtils.isEmpty(c12002e.m44796i())) {
                customFallbackBuilderM2732a.setSystemFallback(c12002e.m44795h());
                break;
            }
            Font fontM2744j = m2744j(m2742h(c12002e.m44795h()));
            if (fontM2744j == null) {
                Log.w("TypefaceCompat", "Unable identify the primary font for " + c12002e.m44795h() + ". Falling back to provider font.");
                return null;
            }
            if (TextUtils.isEmpty(c12002e.m44796i())) {
                try {
                    C0556i.m2733a();
                    C0557j.m2734a();
                    fontFamilyBuild = C0554g.m2731a(C0553f.m2730a(fontM2744j).setFontVariationSettings(c12002e.m44796i()).build()).build();
                } catch (IOException unused) {
                    Log.e("TypefaceCompat", "Failed to clone Font instance. Fall back to provider font.");
                    return null;
                }
            } else {
                fontFamilyBuild = C0554g.m2731a(fontM2744j).build();
            }
            if (customFallbackBuilderM2732a == null) {
                customFallbackBuilderM2732a = C0555h.m2732a(fontFamilyBuild);
            } else {
                customFallbackBuilderM2732a.addCustomFallback(fontFamilyBuild);
            }
        }
        return customFallbackBuilderM2732a.build();
    }

    /* JADX INFO: renamed from: j */
    public static Font m2744j(Typeface typeface) {
        if (f2330c == null) {
            f2330c = new Paint();
        }
        f2330c.setTextSize(10.0f);
        f2330c.setTypeface(typeface);
        PositionedGlyphs positionedGlyphsShapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, f2330c);
        if (positionedGlyphsShapeTextRun.glyphCount() == 0) {
            return null;
        }
        return positionedGlyphsShapeTextRun.getFont(0);
    }
}
