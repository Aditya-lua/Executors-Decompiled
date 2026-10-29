package pc;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f28416d = {1};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f28417e = {1, 0};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f28418c = 0;

    @Override // pc.f
    @NonNull
    public com.google.android.material.carousel.b g(@NonNull b bVar, @NonNull View view) {
        float fB = bVar.b();
        if (bVar.f()) {
            fB = bVar.a();
        }
        float f10 = fB;
        RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
        float f11 = ((ViewGroup.MarginLayoutParams) rVar).topMargin + ((ViewGroup.MarginLayoutParams) rVar).bottomMargin;
        float measuredHeight = view.getMeasuredHeight();
        if (bVar.f()) {
            f11 = ((ViewGroup.MarginLayoutParams) rVar).leftMargin + ((ViewGroup.MarginLayoutParams) rVar).rightMargin;
            measuredHeight = view.getMeasuredWidth();
        }
        float f12 = f11;
        float fD = d() + f12;
        float fMax = Math.max(c() + f12, fD);
        float fMin = Math.min(measuredHeight + f12, f10);
        float fB2 = s2.a.b((measuredHeight / 3.0f) + f12, fD + f12, fMax + f12);
        float f13 = (fMin + fB2) / 2.0f;
        int[] iArrA = f28416d;
        if (f10 < 2.0f * fD) {
            iArrA = new int[]{0};
        }
        int[] iArrA2 = f28417e;
        if (bVar.d() == 1) {
            iArrA = f.a(iArrA);
            iArrA2 = f.a(iArrA2);
        }
        int[] iArr = iArrA2;
        int[] iArr2 = iArrA;
        int iMax = (int) Math.max(1.0d, Math.floor(((f10 - (com.google.android.material.carousel.a.i(iArr) * f13)) - (com.google.android.material.carousel.a.i(iArr2) * fMax)) / fMin));
        int iCeil = (int) Math.ceil(f10 / fMin);
        int i10 = (iCeil - iMax) + 1;
        int[] iArr3 = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr3[i11] = iCeil - i11;
        }
        a aVarC = a.c(f10, fB2, fD, fMax, iArr2, f13, iArr, fMin, iArr3);
        this.f28418c = aVarC.e();
        if (i(aVarC, bVar.e())) {
            aVarC = a.c(f10, fB2, fD, fMax, new int[]{aVarC.f28406c}, f13, new int[]{aVarC.f28407d}, fMin, new int[]{aVarC.f28410g});
        }
        return com.google.android.material.carousel.a.d(view.getContext(), f12, f10, aVarC, bVar.d());
    }

    @Override // pc.f
    public boolean h(b bVar, int i10) {
        if (i10 >= this.f28418c || bVar.e() < this.f28418c) {
            return i10 >= this.f28418c && bVar.e() < this.f28418c;
        }
        return true;
    }

    public boolean i(a aVar, int i10) {
        int iE = aVar.e() - i10;
        boolean z10 = iE > 0 && (aVar.f28406c > 0 || aVar.f28407d > 1);
        while (iE > 0) {
            int i11 = aVar.f28406c;
            if (i11 > 0) {
                aVar.f28406c = i11 - 1;
            } else {
                int i12 = aVar.f28407d;
                if (i12 > 1) {
                    aVar.f28407d = i12 - 1;
                }
            }
            iE--;
        }
        return z10;
    }
}
