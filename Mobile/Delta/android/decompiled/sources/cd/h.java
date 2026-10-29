package cd;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import androidx.annotation.NonNull;
import cd.b;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h<S extends b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public S f4742a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f4743a;
        public float b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f4744c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f4745d;
    }

    public h(S s8) {
        this.f4742a = s8;
    }

    public abstract void a(@NonNull Canvas canvas, @NonNull Rect rect, float f10, boolean z10, boolean z11);

    public abstract void b(@NonNull Canvas canvas, @NonNull Paint paint, int i10, int i11);

    public abstract void c(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull a aVar, int i10);

    public abstract void d(@NonNull Canvas canvas, @NonNull Paint paint, float f10, float f11, int i10, int i11, int i12);

    public abstract int e();

    public abstract int f();

    public void g(@NonNull Canvas canvas, @NonNull Rect rect, float f10, boolean z10, boolean z11) {
        this.f4742a.e();
        a(canvas, rect, f10, z10, z11);
    }
}
