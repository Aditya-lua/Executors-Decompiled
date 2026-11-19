package androidx.core.graphics;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class o extends q {
    public static int m(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // androidx.core.graphics.q
    public Typeface a(Context context, n2.e.c cVar, Resources resources, int i10) {
        try {
            FontFamily.Builder builder = null;
            for (n2.e.d dVar : cVar.a()) {
                try {
                    Font fontBuild = new Font.Builder(resources, dVar.b()).setWeight(dVar.e()).setSlant(dVar.f() ? 1 : 0).setTtcIndex(dVar.c()).setFontVariationSettings(dVar.d()).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(h(fontFamilyBuild, i10).getStyle()).build();
        } catch (Exception e10) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
            return null;
        }
    }

    @Override // androidx.core.graphics.q
    public Typeface b(Context context, CancellationSignal cancellationSignal, v2.g.b[] bVarArr, int i10) {
        try {
            FontFamily fontFamilyJ = j(cancellationSignal, bVarArr, context.getContentResolver());
            if (fontFamilyJ == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(fontFamilyJ).setStyle(h(fontFamilyJ, i10).getStyle()).build();
        } catch (Exception e10) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
            return null;
        }
    }

    @Override // androidx.core.graphics.q
    public Typeface c(Context context, CancellationSignal cancellationSignal, List<v2.g.b[]> list, int i10) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily fontFamilyJ = j(cancellationSignal, list.get(0), contentResolver);
            if (fontFamilyJ == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyJ);
            for (int i11 = 1; i11 < list.size(); i11++) {
                FontFamily fontFamilyJ2 = j(cancellationSignal, list.get(i11), contentResolver);
                if (fontFamilyJ2 != null) {
                    customFallbackBuilder.addCustomFallback(fontFamilyJ2);
                }
            }
            return customFallbackBuilder.setStyle(h(fontFamilyJ, i10).getStyle()).build();
        } catch (Exception e10) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
            return null;
        }
    }

    @Override // androidx.core.graphics.q
    public Typeface d(Context context, Resources resources, int i10, String str, int i11) {
        try {
            Font fontBuild = new Font.Builder(resources, i10).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception e10) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
            return null;
        }
    }

    @Override // androidx.core.graphics.q
    public v2.g.b g(v2.g.b[] bVarArr, int i10) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    public final Font h(FontFamily fontFamily, int i10) {
        FontStyle fontStyle = new FontStyle((i10 & 1) != 0 ? 700 : 400, (i10 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iM = m(fontStyle, font.getStyle());
        for (int i11 = 1; i11 < fontFamily.getSize(); i11++) {
            Font font2 = fontFamily.getFont(i11);
            int iM2 = m(fontStyle, font2.getStyle());
            if (iM2 < iM) {
                font = font2;
                iM = iM2;
            }
        }
        return font;
    }

    public final Font i(CancellationSignal cancellationSignal, v2.g.b bVar, ContentResolver contentResolver) {
        return bVar.i() ? l(bVar) : k(cancellationSignal, bVar, contentResolver);
    }

    public FontFamily j(CancellationSignal cancellationSignal, v2.g.b[] bVarArr, ContentResolver contentResolver) {
        FontFamily.Builder builder = null;
        for (v2.g.b bVar : bVarArr) {
            Font fontI = i(cancellationSignal, bVar, contentResolver);
            if (fontI != null) {
                if (builder == null) {
                    builder = new FontFamily.Builder(fontI);
                } else {
                    builder.addFont(fontI);
                }
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    public final Font k(CancellationSignal cancellationSignal, v2.g.b bVar, ContentResolver contentResolver) {
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(bVar.e(), "r", cancellationSignal);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    return null;
                }
                parcelFileDescriptorOpenFileDescriptor.close();
                return null;
            }
            try {
                Font.Builder ttcIndex = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(bVar.g()).setSlant(bVar.h() ? 1 : 0).setTtcIndex(bVar.d());
                if (!TextUtils.isEmpty(bVar.f())) {
                    ttcIndex.setFontVariationSettings(bVar.f());
                }
                Font fontBuild = ttcIndex.build();
                parcelFileDescriptorOpenFileDescriptor.close();
                return fontBuild;
            } catch (Throwable th2) {
                try {
                    parcelFileDescriptorOpenFileDescriptor.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException e10) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
            return null;
        }
    }

    public Font l(v2.g.b bVar) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }
}
