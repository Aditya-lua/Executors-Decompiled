package p322o5;

import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: o5.p0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9682p0 extends AbstractC9692z {

    /* JADX INFO: renamed from: a */
    public static final String[] f35140a = {"android:visibilityPropagation:visibility", "android:visibilityPropagation:center"};

    /* JADX INFO: renamed from: d */
    public static int m38243d(C9658d0 c9658d0, int i10) {
        int[] iArr;
        if (c9658d0 == null || (iArr = (int[]) c9658d0.f35044a.get("android:visibilityPropagation:center")) == null) {
            return -1;
        }
        return iArr[i10];
    }

    @Override // p322o5.AbstractC9692z
    /* JADX INFO: renamed from: a */
    public void mo38244a(@NonNull C9658d0 c9658d0) {
        View view = c9658d0.f35045b;
        Integer numValueOf = (Integer) c9658d0.f35044a.get("android:visibility:visibility");
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(view.getVisibility());
        }
        c9658d0.f35044a.put("android:visibilityPropagation:visibility", numValueOf);
        int[] iArr = {iRound, 0};
        view.getLocationOnScreen(iArr);
        int iRound = iArr[0] + Math.round(view.getTranslationX());
        iArr[0] = iRound + (view.getWidth() / 2);
        int iRound2 = iArr[1] + Math.round(view.getTranslationY());
        iArr[1] = iRound2;
        iArr[1] = iRound2 + (view.getHeight() / 2);
        c9658d0.f35044a.put("android:visibilityPropagation:center", iArr);
    }

    @Override // p322o5.AbstractC9692z
    /* JADX INFO: renamed from: b */
    public String[] mo38245b() {
        return f35140a;
    }

    /* JADX INFO: renamed from: e */
    public int m38246e(C9658d0 c9658d0) {
        Integer num;
        if (c9658d0 == null || (num = (Integer) c9658d0.f35044a.get("android:visibilityPropagation:visibility")) == null) {
            return 8;
        }
        return num.intValue();
    }

    /* JADX INFO: renamed from: f */
    public int m38247f(C9658d0 c9658d0) {
        return m38243d(c9658d0, 0);
    }

    /* JADX INFO: renamed from: g */
    public int m38248g(C9658d0 c9658d0) {
        return m38243d(c9658d0, 1);
    }
}
