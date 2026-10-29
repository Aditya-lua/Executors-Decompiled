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
import p298n2.C8867e;
import p482v2.C12004g;

/* JADX INFO: renamed from: androidx.core.graphics.o */
/* JADX INFO: loaded from: classes.dex */
public class C0562o extends C0564q {
    /* JADX INFO: renamed from: m */
    public static int m2769m(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // androidx.core.graphics.C0564q
    /* JADX INFO: renamed from: a */
    public Typeface mo2751a(Context context, C8867e.c cVar, Resources resources, int i10) {
        try {
            FontFamily.Builder builder = null;
            for (C8867e.d dVar : cVar.m35640a()) {
                try {
                    Font fontBuild = new Font.Builder(resources, dVar.m35642b()).setWeight(dVar.m35645e()).setSlant(dVar.m35646f() ? 1 : 0).setTtcIndex(dVar.m35643c()).setFontVariationSettings(dVar.m35644d()).build();
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
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(m2771h(fontFamilyBuild, i10).getStyle()).build();
        } catch (Exception e10) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
            return null;
        }
    }

    @Override // androidx.core.graphics.C0564q
    /* JADX INFO: renamed from: b */
    public Typeface mo2752b(Context context, CancellationSignal cancellationSignal, C12004g.b[] bVarArr, int i10) {
        try {
            FontFamily fontFamilyM2773j = m2773j(cancellationSignal, bVarArr, context.getContentResolver());
            if (fontFamilyM2773j == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(fontFamilyM2773j).setStyle(m2771h(fontFamilyM2773j, i10).getStyle()).build();
        } catch (Exception e10) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
            return null;
        }
    }

    @Override // androidx.core.graphics.C0564q
    /* JADX INFO: renamed from: c */
    public Typeface mo2753c(Context context, CancellationSignal cancellationSignal, List<C12004g.b[]> list, int i10) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily fontFamilyM2773j = m2773j(cancellationSignal, list.get(0), contentResolver);
            if (fontFamilyM2773j == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyM2773j);
            for (int i11 = 1; i11 < list.size(); i11++) {
                FontFamily fontFamilyM2773j2 = m2773j(cancellationSignal, list.get(i11), contentResolver);
                if (fontFamilyM2773j2 != null) {
                    customFallbackBuilder.addCustomFallback(fontFamilyM2773j2);
                }
            }
            return customFallbackBuilder.setStyle(m2771h(fontFamilyM2773j, i10).getStyle()).build();
        } catch (Exception e10) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
            return null;
        }
    }

    @Override // androidx.core.graphics.C0564q
    /* JADX INFO: renamed from: d */
    public Typeface mo2754d(Context context, Resources resources, int i10, String str, int i11) {
        try {
            Font fontBuild = new Font.Builder(resources, i10).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception e10) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
            return null;
        }
    }

    @Override // androidx.core.graphics.C0564q
    /* JADX INFO: renamed from: g */
    public C12004g.b mo2770g(C12004g.b[] bVarArr, int i10) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    /* JADX INFO: renamed from: h */
    public final Font m2771h(FontFamily fontFamily, int i10) {
        FontStyle fontStyle = new FontStyle((i10 & 1) != 0 ? 700 : 400, (i10 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iM2769m = m2769m(fontStyle, font.getStyle());
        for (int i11 = 1; i11 < fontFamily.getSize(); i11++) {
            Font font2 = fontFamily.getFont(i11);
            int iM2769m2 = m2769m(fontStyle, font2.getStyle());
            if (iM2769m2 < iM2769m) {
                font = font2;
                iM2769m = iM2769m2;
            }
        }
        return font;
    }

    /* JADX INFO: renamed from: i */
    public final Font m2772i(CancellationSignal cancellationSignal, C12004g.b bVar, ContentResolver contentResolver) {
        return bVar.m44824i() ? mo2775l(bVar) : m2774k(cancellationSignal, bVar, contentResolver);
    }

    /* JADX INFO: renamed from: j */
    public FontFamily m2773j(CancellationSignal cancellationSignal, C12004g.b[] bVarArr, ContentResolver contentResolver) {
        FontFamily.Builder builder = null;
        for (C12004g.b bVar : bVarArr) {
            Font fontM2772i = m2772i(cancellationSignal, bVar, contentResolver);
            if (fontM2772i != null) {
                if (builder == null) {
                    builder = new FontFamily.Builder(fontM2772i);
                } else {
                    builder.addFont(fontM2772i);
                }
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    /* JADX INFO: renamed from: k */
    public final Font m2774k(CancellationSignal cancellationSignal, C12004g.b bVar, ContentResolver contentResolver) {
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(bVar.m44820e(), "r", cancellationSignal);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    return null;
                }
                parcelFileDescriptorOpenFileDescriptor.close();
                return null;
            }
            try {
                Font.Builder ttcIndex = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(bVar.m44822g()).setSlant(bVar.m44823h() ? 1 : 0).setTtcIndex(bVar.m44819d());
                if (!TextUtils.isEmpty(bVar.m44821f())) {
                    ttcIndex.setFontVariationSettings(bVar.m44821f());
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

    /* JADX INFO: renamed from: l */
    public Font mo2775l(C12004g.b bVar) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }
}
