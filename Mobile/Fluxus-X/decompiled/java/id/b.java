package id;

import android.graphics.RectF;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f19376a;
    public final float b;

    public b(float f10, @NonNull c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f19376a;
            f10 += ((b) cVar).b;
        }
        this.f19376a = cVar;
        this.b = f10;
    }

    @Override // id.c
    public float a(@NonNull RectF rectF) {
        return Math.max(0.0f, this.f19376a.a(rectF) + this.b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f19376a.equals(bVar.f19376a) && this.b == bVar.b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f19376a, Float.valueOf(this.b)});
    }
}
