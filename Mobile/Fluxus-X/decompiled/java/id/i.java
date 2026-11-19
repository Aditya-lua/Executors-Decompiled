package id;

import android.graphics.RectF;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class i implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f19425a;

    public i(float f10) {
        this.f19425a = f10;
    }

    public static float b(@NonNull RectF rectF) {
        return Math.min(rectF.width(), rectF.height());
    }

    @Override // id.c
    public float a(@NonNull RectF rectF) {
        return this.f19425a * b(rectF);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && this.f19425a == ((i) obj).f19425a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f19425a)});
    }
}
