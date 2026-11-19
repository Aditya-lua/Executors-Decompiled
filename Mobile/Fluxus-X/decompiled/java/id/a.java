package id;

import android.graphics.RectF;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f19375a;

    public a(float f10) {
        this.f19375a = f10;
    }

    @Override // id.c
    public float a(@NonNull RectF rectF) {
        return this.f19375a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f19375a == ((a) obj).f19375a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f19375a)});
    }
}
