package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import r5.a;

/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f1592a = aVar.p(iconCompat.f1592a, 1);
        iconCompat.f1593c = aVar.j(iconCompat.f1593c, 2);
        iconCompat.f1594d = aVar.r(iconCompat.f1594d, 3);
        iconCompat.f1595e = aVar.p(iconCompat.f1595e, 4);
        iconCompat.f1596f = aVar.p(iconCompat.f1596f, 5);
        iconCompat.f1597g = (ColorStateList) aVar.r(iconCompat.f1597g, 6);
        iconCompat.f1599i = aVar.t(iconCompat.f1599i, 7);
        iconCompat.f1600j = aVar.t(iconCompat.f1600j, 8);
        iconCompat.l();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.x(true, true);
        iconCompat.m(aVar.f());
        int i10 = iconCompat.f1592a;
        if (-1 != i10) {
            aVar.F(i10, 1);
        }
        byte[] bArr = iconCompat.f1593c;
        if (bArr != null) {
            aVar.B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f1594d;
        if (parcelable != null) {
            aVar.H(parcelable, 3);
        }
        int i11 = iconCompat.f1595e;
        if (i11 != 0) {
            aVar.F(i11, 4);
        }
        int i12 = iconCompat.f1596f;
        if (i12 != 0) {
            aVar.F(i12, 5);
        }
        ColorStateList colorStateList = iconCompat.f1597g;
        if (colorStateList != null) {
            aVar.H(colorStateList, 6);
        }
        String str = iconCompat.f1599i;
        if (str != null) {
            aVar.J(str, 7);
        }
        String str2 = iconCompat.f1600j;
        if (str2 != null) {
            aVar.J(str2, 8);
        }
    }
}
