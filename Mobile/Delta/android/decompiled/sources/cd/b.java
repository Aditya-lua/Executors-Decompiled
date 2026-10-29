package cd;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import hc.k;
import zc.o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4692a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public int[] f4693c = new int[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4694d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4695e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4696f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f4697g;

    public b(@NonNull Context context, AttributeSet attributeSet, int i10, int i11) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(hc.d.f18821f0);
        TypedArray typedArrayI = o.i(context, attributeSet, k.f19163x, i10, i11, new int[0]);
        this.f4692a = dd.c.c(context, typedArrayI, k.G, dimensionPixelSize);
        this.b = Math.min(dd.c.c(context, typedArrayI, k.F, 0), this.f4692a / 2);
        this.f4695e = typedArrayI.getInt(k.C, 0);
        this.f4696f = typedArrayI.getInt(k.f19172y, 0);
        this.f4697g = typedArrayI.getDimensionPixelSize(k.A, 0);
        c(context, typedArrayI);
        d(context, typedArrayI);
        typedArrayI.recycle();
    }

    public boolean a() {
        return this.f4696f != 0;
    }

    public boolean b() {
        return this.f4695e != 0;
    }

    public final void c(@NonNull Context context, @NonNull TypedArray typedArray) {
        int i10 = k.f19181z;
        if (!typedArray.hasValue(i10)) {
            this.f4693c = new int[]{tc.a.b(context, hc.b.f18787l, -1)};
            return;
        }
        if (typedArray.peekValue(i10).type != 1) {
            this.f4693c = new int[]{typedArray.getColor(i10, -1)};
            return;
        }
        int[] intArray = context.getResources().getIntArray(typedArray.getResourceId(i10, -1));
        this.f4693c = intArray;
        if (intArray.length == 0) {
            throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
        }
    }

    public final void d(@NonNull Context context, @NonNull TypedArray typedArray) {
        int i10 = k.E;
        if (typedArray.hasValue(i10)) {
            this.f4694d = typedArray.getColor(i10, -1);
            return;
        }
        this.f4694d = this.f4693c[0];
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.disabledAlpha});
        float f10 = typedArrayObtainStyledAttributes.getFloat(0, 0.2f);
        typedArrayObtainStyledAttributes.recycle();
        this.f4694d = tc.a.a(this.f4694d, (int) (f10 * 255.0f));
    }

    public void e() {
        if (this.f4697g < 0) {
            throw new IllegalArgumentException("indicatorTrackGapSize must be >= 0.");
        }
    }
}
