package p377qc;

import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.material.carousel.C2773a;
import com.google.android.material.carousel.C2774b;

/* JADX INFO: renamed from: qc.f */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC10500f {

    /* JADX INFO: renamed from: a */
    public float f37719a;

    /* JADX INFO: renamed from: b */
    public float f37720b;

    /* JADX INFO: renamed from: a */
    public static int[] m40322a(int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr2[i10] = iArr[i10] * 2;
        }
        return iArr2;
    }

    /* JADX INFO: renamed from: b */
    public static float m40323b(float f10, float f11, float f12) {
        return 1.0f - ((f10 - f12) / (f11 - f12));
    }

    /* JADX INFO: renamed from: c */
    public float m40324c() {
        return this.f37720b;
    }

    /* JADX INFO: renamed from: d */
    public float m40325d() {
        return this.f37719a;
    }

    /* JADX INFO: renamed from: e */
    public void m40326e(Context context) {
        float fM12314h = this.f37719a;
        if (fM12314h <= 0.0f) {
            fM12314h = C2773a.m12314h(context);
        }
        this.f37719a = fM12314h;
        float fM12313g = this.f37720b;
        if (fM12313g <= 0.0f) {
            fM12313g = C2773a.m12313g(context);
        }
        this.f37720b = fM12313g;
    }

    /* JADX INFO: renamed from: f */
    public boolean m40327f() {
        return true;
    }

    /* JADX INFO: renamed from: g */
    public abstract C2774b mo40328g(@NonNull InterfaceC10496b interfaceC10496b, @NonNull View view);

    /* JADX INFO: renamed from: h */
    public abstract boolean mo40329h(InterfaceC10496b interfaceC10496b, int i10);
}
