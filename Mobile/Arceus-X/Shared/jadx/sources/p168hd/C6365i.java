package p168hd;

import android.graphics.RectF;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* JADX INFO: renamed from: hd.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C6365i implements InterfaceC6359c {

    /* JADX INFO: renamed from: a */
    public final float f24171a;

    public C6365i(float f10) {
        this.f24171a = f10;
    }

    /* JADX INFO: renamed from: b */
    public static float m27761b(@NonNull RectF rectF) {
        return Math.min(rectF.width(), rectF.height());
    }

    @Override // p168hd.InterfaceC6359c
    /* JADX INFO: renamed from: a */
    public float mo27683a(@NonNull RectF rectF) {
        return this.f24171a * m27761b(rectF);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6365i) && this.f24171a == ((C6365i) obj).f24171a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f24171a)});
    }
}
