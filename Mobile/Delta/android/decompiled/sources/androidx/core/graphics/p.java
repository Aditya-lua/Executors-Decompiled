package androidx.core.graphics;

import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class p extends o {
    public static Typeface n(String str) {
        Typeface typefaceCreate = Typeface.create(str, 0);
        Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
        if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
            return null;
        }
        return typefaceCreate;
    }

    @Override // androidx.core.graphics.o
    public Font l(v2.g.b bVar) {
        Typeface typefaceN;
        Font fontJ;
        String strC = bVar.c();
        if (strC == null || (typefaceN = n(strC)) == null || (fontJ = k.j(typefaceN)) == null) {
            return null;
        }
        if (TextUtils.isEmpty(bVar.f())) {
            return fontJ;
        }
        try {
            return new Font.Builder(fontJ).setFontVariationSettings(bVar.f()).build();
        } catch (IOException unused) {
            Log.e("TypefaceCompatApi31Impl", "Failed to clone Font instance. Fall back to provider font.");
            return null;
        }
    }
}
