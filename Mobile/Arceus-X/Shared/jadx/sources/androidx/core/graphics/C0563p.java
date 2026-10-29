package androidx.core.graphics;

import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import p482v2.C12004g;

/* JADX INFO: renamed from: androidx.core.graphics.p */
/* JADX INFO: loaded from: classes.dex */
public class C0563p extends C0562o {
    /* JADX INFO: renamed from: n */
    public static Typeface m2776n(String str) {
        Typeface typefaceCreate = Typeface.create(str, 0);
        Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
        if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
            return null;
        }
        return typefaceCreate;
    }

    @Override // androidx.core.graphics.C0562o
    /* JADX INFO: renamed from: l */
    public Font mo2775l(C12004g.b bVar) {
        Typeface typefaceM2776n;
        Font fontM2744j;
        String strM44818c = bVar.m44818c();
        if (strM44818c == null || (typefaceM2776n = m2776n(strM44818c)) == null || (fontM2744j = C0558k.m2744j(typefaceM2776n)) == null) {
            return null;
        }
        if (TextUtils.isEmpty(bVar.m44821f())) {
            return fontM2744j;
        }
        try {
            return new Font.Builder(fontM2744j).setFontVariationSettings(bVar.m44821f()).build();
        } catch (IOException unused) {
            Log.e("TypefaceCompatApi31Impl", "Failed to clone Font instance. Fall back to provider font.");
            return null;
        }
    }
}
