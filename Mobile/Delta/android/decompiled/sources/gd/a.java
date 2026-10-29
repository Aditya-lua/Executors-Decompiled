package gd;

import android.graphics.RectF;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f18024a;

    public a(float f10) {
        this.f18024a = f10;
    }

    @Override // gd.c
    public float a(@NonNull RectF rectF) {
        return this.f18024a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f18024a == ((a) obj).f18024a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f18024a)});
    }
}
