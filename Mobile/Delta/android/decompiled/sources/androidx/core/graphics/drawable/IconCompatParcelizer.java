package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import q5.a;

/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f1785a = aVar.p(iconCompat.f1785a, 1);
        iconCompat.f1786c = aVar.j(iconCompat.f1786c, 2);
        iconCompat.f1787d = aVar.r(iconCompat.f1787d, 3);
        iconCompat.f1788e = aVar.p(iconCompat.f1788e, 4);
        iconCompat.f1789f = aVar.p(iconCompat.f1789f, 5);
        iconCompat.f1790g = (ColorStateList) aVar.r(iconCompat.f1790g, 6);
        iconCompat.f1792i = aVar.t(iconCompat.f1792i, 7);
        iconCompat.f1793j = aVar.t(iconCompat.f1793j, 8);
        iconCompat.l();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.x(true, true);
        iconCompat.m(aVar.f());
        int i10 = iconCompat.f1785a;
        if (-1 != i10) {
            aVar.F(i10, 1);
        }
        byte[] bArr = iconCompat.f1786c;
        if (bArr != null) {
            aVar.B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f1787d;
        if (parcelable != null) {
            aVar.H(parcelable, 3);
        }
        int i11 = iconCompat.f1788e;
        if (i11 != 0) {
            aVar.F(i11, 4);
        }
        int i12 = iconCompat.f1789f;
        if (i12 != 0) {
            aVar.F(i12, 5);
        }
        ColorStateList colorStateList = iconCompat.f1790g;
        if (colorStateList != null) {
            aVar.H(colorStateList, 6);
        }
        String str = iconCompat.f1792i;
        if (str != null) {
            aVar.J(str, 7);
        }
        String str2 = iconCompat.f1793j;
        if (str2 != null) {
            aVar.J(str2, 8);
        }
    }
}
