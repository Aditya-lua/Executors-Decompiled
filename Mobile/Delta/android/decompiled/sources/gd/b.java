package gd;

import android.graphics.RectF;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f18025a;
    public final float b;

    public b(float f10, @NonNull c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f18025a;
            f10 += ((b) cVar).b;
        }
        this.f18025a = cVar;
        this.b = f10;
    }

    @Override // gd.c
    public float a(@NonNull RectF rectF) {
        return Math.max(0.0f, this.f18025a.a(rectF) + this.b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f18025a.equals(bVar.f18025a) && this.b == bVar.b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18025a, Float.valueOf(this.b)});
    }
}
