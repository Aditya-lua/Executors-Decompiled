package p322o5;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: o5.o */
/* JADX INFO: loaded from: classes.dex */
public class C9679o extends AbstractC9682p0 {

    /* JADX INFO: renamed from: b */
    public float f35109b = 3.0f;

    /* JADX INFO: renamed from: c */
    public int f35110c = 80;

    @Override // p322o5.AbstractC9692z
    /* JADX INFO: renamed from: c */
    public long mo38226c(@NonNull ViewGroup viewGroup, @NonNull AbstractC9683q abstractC9683q, C9658d0 c9658d0, C9658d0 c9658d1) {
        int i10;
        int i11;
        int iCenterY;
        int i12;
        C9658d0 c9658d2 = c9658d0;
        if (c9658d2 == null && c9658d1 == null) {
            return 0L;
        }
        Rect rectM38254A = abstractC9683q.m38254A();
        if (c9658d1 == null || m38246e(c9658d2) == 0) {
            i10 = -1;
        } else {
            c9658d2 = c9658d1;
            i10 = 1;
        }
        int iM38247f = m38247f(c9658d2);
        int iM38248g = m38248g(c9658d2);
        int[] iArr = new int[2];
        viewGroup.getLocationOnScreen(iArr);
        int iRound = iArr[0] + Math.round(viewGroup.getTranslationX());
        int iRound2 = iArr[1] + Math.round(viewGroup.getTranslationY());
        int width = viewGroup.getWidth() + iRound;
        int height = viewGroup.getHeight() + iRound2;
        if (rectM38254A != null) {
            int iCenterX = rectM38254A.centerX();
            i12 = iRound2;
            iCenterY = rectM38254A.centerY();
            i11 = iCenterX;
        } else {
            i11 = (iRound + width) / 2;
            iCenterY = (iRound2 + height) / 2;
            i12 = iRound2;
        }
        float fM38227h = m38227h(viewGroup, iM38247f, iM38248g, i11, iCenterY, iRound, i12, width, height) / m38228i(viewGroup);
        long jM38286z = abstractC9683q.m38286z();
        if (jM38286z < 0) {
            jM38286z = 300;
        }
        return Math.round(((jM38286z * ((long) i10)) / this.f35109b) * fM38227h);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0010  */
    /* JADX WARN: Code duplicated, block: B:7:0x0012  */
    /* JADX INFO: renamed from: h */
    public final int m38227h(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        int i18 = this.f35110c;
        if (i18 == 8388611) {
            if (view.getLayoutDirection() == 1) {
                i18 = 5;
            } else {
                i18 = 3;
            }
        } else if (i18 == 8388613) {
            if (view.getLayoutDirection() == 1) {
                i18 = 3;
            } else {
                i18 = 5;
            }
        }
        if (i18 == 3) {
            return (i16 - i10) + Math.abs(i13 - i11);
        }
        if (i18 == 5) {
            return (i10 - i14) + Math.abs(i13 - i11);
        }
        if (i18 == 48) {
            return (i17 - i11) + Math.abs(i12 - i10);
        }
        if (i18 != 80) {
            return 0;
        }
        return (i11 - i15) + Math.abs(i12 - i10);
    }

    /* JADX INFO: renamed from: i */
    public final int m38228i(ViewGroup viewGroup) {
        int i10 = this.f35110c;
        return (i10 == 3 || i10 == 5 || i10 == 8388611 || i10 == 8388613) ? viewGroup.getWidth() : viewGroup.getHeight();
    }

    /* JADX INFO: renamed from: j */
    public void m38229j(int i10) {
        this.f35110c = i10;
    }
}
