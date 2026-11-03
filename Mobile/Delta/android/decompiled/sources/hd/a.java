package hd;

import android.graphics.RectF;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f19278a;

    public a(float f10) {
        this.f19278a = f10;
    }

    @Override // hd.c
    public float a(@NonNull RectF rectF) {
        return this.f19278a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f19278a == ((a) obj).f19278a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f19278a)});
    }
}
