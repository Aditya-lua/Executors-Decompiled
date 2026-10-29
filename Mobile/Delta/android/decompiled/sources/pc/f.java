package pc;

import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f28415a;
    public float b;

    public static int[] a(int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr2[i10] = iArr[i10] * 2;
        }
        return iArr2;
    }

    public static float b(float f10, float f11, float f12) {
        return 1.0f - ((f10 - f12) / (f11 - f12));
    }

    public float c() {
        return this.b;
    }

    public float d() {
        return this.f28415a;
    }

    public void e(Context context) {
        float fH = this.f28415a;
        if (fH <= 0.0f) {
            fH = com.google.android.material.carousel.a.h(context);
        }
        this.f28415a = fH;
        float fG = this.b;
        if (fG <= 0.0f) {
            fG = com.google.android.material.carousel.a.g(context);
        }
        this.b = fG;
    }

    public boolean f() {
        return true;
    }

    public abstract com.google.android.material.carousel.b g(@NonNull b bVar, @NonNull View view);

    public abstract boolean h(b bVar, int i10);
}
