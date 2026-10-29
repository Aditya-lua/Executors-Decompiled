package p377qc;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.C2773a;
import com.google.android.material.carousel.C2774b;
import p426s2.C11162a;

/* JADX INFO: renamed from: qc.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C10502h extends AbstractC10500f {

    /* JADX INFO: renamed from: d */
    public static final int[] f37721d = {1};

    /* JADX INFO: renamed from: e */
    public static final int[] f37722e = {1, 0};

    /* JADX INFO: renamed from: c */
    public int f37723c = 0;

    @Override // p377qc.AbstractC10500f
    @NonNull
    /* JADX INFO: renamed from: g */
    public C2774b mo40328g(@NonNull InterfaceC10496b interfaceC10496b, @NonNull View view) {
        float fMo12280b = interfaceC10496b.mo12280b();
        if (interfaceC10496b.mo12286f()) {
            fMo12280b = interfaceC10496b.mo12278a();
        }
        float f10 = fMo12280b;
        RecyclerView.C1035r c1035r = (RecyclerView.C1035r) view.getLayoutParams();
        float f11 = ((ViewGroup.MarginLayoutParams) c1035r).topMargin + ((ViewGroup.MarginLayoutParams) c1035r).bottomMargin;
        float measuredHeight = view.getMeasuredHeight();
        if (interfaceC10496b.mo12286f()) {
            f11 = ((ViewGroup.MarginLayoutParams) c1035r).leftMargin + ((ViewGroup.MarginLayoutParams) c1035r).rightMargin;
            measuredHeight = view.getMeasuredWidth();
        }
        float f12 = f11;
        float fM40325d = m40325d() + f12;
        float fMax = Math.max(m40324c() + f12, fM40325d);
        float fMin = Math.min(measuredHeight + f12, f10);
        float fM42059b = C11162a.m42059b((measuredHeight / 3.0f) + f12, fM40325d + f12, fMax + f12);
        float f13 = (fMin + fM42059b) / 2.0f;
        int[] iArrM40322a = f37721d;
        if (f10 < 2.0f * fM40325d) {
            iArrM40322a = new int[]{0};
        }
        int[] iArrM40322a2 = f37722e;
        if (interfaceC10496b.mo12283d() == 1) {
            iArrM40322a = AbstractC10500f.m40322a(iArrM40322a);
            iArrM40322a2 = AbstractC10500f.m40322a(iArrM40322a2);
        }
        int[] iArr = iArrM40322a2;
        int[] iArr2 = iArrM40322a;
        int iMax = (int) Math.max(1.0d, Math.floor(((f10 - (C2773a.m12315i(iArr) * f13)) - (C2773a.m12315i(iArr2) * fMax)) / fMin));
        int iCeil = (int) Math.ceil(f10 / fMin);
        int i10 = (iCeil - iMax) + 1;
        int[] iArr3 = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr3[i11] = iCeil - i11;
        }
        C10495a c10495aM40297c = C10495a.m40297c(f10, fM42059b, fM40325d, fMax, iArr2, f13, iArr, fMin, iArr3);
        this.f37723c = c10495aM40297c.m40301e();
        if (m40331i(c10495aM40297c, interfaceC10496b.m40304e())) {
            c10495aM40297c = C10495a.m40297c(f10, fM42059b, fM40325d, fMax, new int[]{c10495aM40297c.f37708c}, f13, new int[]{c10495aM40297c.f37709d}, fMin, new int[]{c10495aM40297c.f37712g});
        }
        return C2773a.m12310d(view.getContext(), f12, f10, c10495aM40297c, interfaceC10496b.mo12283d());
    }

    @Override // p377qc.AbstractC10500f
    /* JADX INFO: renamed from: h */
    public boolean mo40329h(InterfaceC10496b interfaceC10496b, int i10) {
        if (i10 >= this.f37723c || interfaceC10496b.m40304e() < this.f37723c) {
            return i10 >= this.f37723c && interfaceC10496b.m40304e() < this.f37723c;
        }
        return true;
    }

    /* JADX INFO: renamed from: i */
    public boolean m40331i(C10495a c10495a, int i10) {
        int iM40301e = c10495a.m40301e() - i10;
        boolean z10 = iM40301e > 0 && (c10495a.f37708c > 0 || c10495a.f37709d > 1);
        while (iM40301e > 0) {
            int i11 = c10495a.f37708c;
            if (i11 > 0) {
                c10495a.f37708c = i11 - 1;
            } else {
                int i12 = c10495a.f37709d;
                if (i12 > 1) {
                    c10495a.f37709d = i12 - 1;
                }
            }
            iM40301e--;
        }
        return z10;
    }
}
