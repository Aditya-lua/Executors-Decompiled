package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import p371q5.AbstractC10433a;

/* JADX WARN: Classes with same name are omitted, all sources:
  classes.dex
  classes4.dex
 */
/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(AbstractC10433a abstractC10433a) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f2314a = abstractC10433a.m40175p(iconCompat.f2314a, 1);
        iconCompat.f2316c = abstractC10433a.m40169j(iconCompat.f2316c, 2);
        iconCompat.f2317d = abstractC10433a.m40177r(iconCompat.f2317d, 3);
        iconCompat.f2318e = abstractC10433a.m40175p(iconCompat.f2318e, 4);
        iconCompat.f2319f = abstractC10433a.m40175p(iconCompat.f2319f, 5);
        iconCompat.f2320g = (ColorStateList) abstractC10433a.m40177r(iconCompat.f2320g, 6);
        iconCompat.f2322i = abstractC10433a.m40179t(iconCompat.f2322i, 7);
        iconCompat.f2323j = abstractC10433a.m40179t(iconCompat.f2323j, 8);
        iconCompat.m2695l();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, AbstractC10433a abstractC10433a) {
        abstractC10433a.m40183x(true, true);
        iconCompat.m2696m(abstractC10433a.m40165f());
        int i10 = iconCompat.f2314a;
        if (-1 != i10) {
            abstractC10433a.m40151F(i10, 1);
        }
        byte[] bArr = iconCompat.f2316c;
        if (bArr != null) {
            abstractC10433a.m40147B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f2317d;
        if (parcelable != null) {
            abstractC10433a.m40153H(parcelable, 3);
        }
        int i11 = iconCompat.f2318e;
        if (i11 != 0) {
            abstractC10433a.m40151F(i11, 4);
        }
        int i12 = iconCompat.f2319f;
        if (i12 != 0) {
            abstractC10433a.m40151F(i12, 5);
        }
        ColorStateList colorStateList = iconCompat.f2320g;
        if (colorStateList != null) {
            abstractC10433a.m40153H(colorStateList, 6);
        }
        String str = iconCompat.f2322i;
        if (str != null) {
            abstractC10433a.m40155J(str, 7);
        }
        String str2 = iconCompat.f2323j;
        if (str2 != null) {
            abstractC10433a.m40155J(str2, 8);
        }
    }
}
