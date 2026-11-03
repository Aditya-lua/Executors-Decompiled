package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import q5.a;

/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f1630a = aVar.p(iconCompat.f1630a, 1);
        iconCompat.f1631c = aVar.j(iconCompat.f1631c, 2);
        iconCompat.f1632d = aVar.r(iconCompat.f1632d, 3);
        iconCompat.f1633e = aVar.p(iconCompat.f1633e, 4);
        iconCompat.f1634f = aVar.p(iconCompat.f1634f, 5);
        iconCompat.f1635g = (ColorStateList) aVar.r(iconCompat.f1635g, 6);
        iconCompat.f1637i = aVar.t(iconCompat.f1637i, 7);
        iconCompat.f1638j = aVar.t(iconCompat.f1638j, 8);
        iconCompat.l();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.x(true, true);
        iconCompat.m(aVar.f());
        int i10 = iconCompat.f1630a;
        if (-1 != i10) {
            aVar.F(i10, 1);
        }
        byte[] bArr = iconCompat.f1631c;
        if (bArr != null) {
            aVar.B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f1632d;
        if (parcelable != null) {
            aVar.H(parcelable, 3);
        }
        int i11 = iconCompat.f1633e;
        if (i11 != 0) {
            aVar.F(i11, 4);
        }
        int i12 = iconCompat.f1634f;
        if (i12 != 0) {
            aVar.F(i12, 5);
        }
        ColorStateList colorStateList = iconCompat.f1635g;
        if (colorStateList != null) {
            aVar.H(colorStateList, 6);
        }
        String str = iconCompat.f1637i;
        if (str != null) {
            aVar.J(str, 7);
        }
        String str2 = iconCompat.f1638j;
        if (str2 != null) {
            aVar.J(str2, 8);
        }
    }
}
