package ed;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import bd.o;
import jc.k;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13321a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public int[] f13322c = new int[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13323d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13324e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f13325f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f13326g;

    public b(@NonNull Context context, AttributeSet attributeSet, int i10, int i11) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(jc.d.f20331f0);
        TypedArray typedArrayI = o.i(context, attributeSet, k.f20674x, i10, i11, new int[0]);
        this.f13321a = fd.c.c(context, typedArrayI, k.G, dimensionPixelSize);
        this.b = Math.min(fd.c.c(context, typedArrayI, k.F, 0), this.f13321a / 2);
        this.f13324e = typedArrayI.getInt(k.C, 0);
        this.f13325f = typedArrayI.getInt(k.f20682y, 0);
        this.f13326g = typedArrayI.getDimensionPixelSize(k.A, 0);
        c(context, typedArrayI);
        d(context, typedArrayI);
        typedArrayI.recycle();
    }

    public boolean a() {
        return this.f13325f != 0;
    }

    public boolean b() {
        return this.f13324e != 0;
    }

    public final void c(@NonNull Context context, @NonNull TypedArray typedArray) {
        if (!typedArray.hasValue(k.f20691z)) {
            this.f13322c = new int[]{vc.a.b(context, jc.b.f20297l, -1)};
            return;
        }
        if (typedArray.peekValue(k.f20691z).type != 1) {
            this.f13322c = new int[]{typedArray.getColor(k.f20691z, -1)};
            return;
        }
        int[] intArray = context.getResources().getIntArray(typedArray.getResourceId(k.f20691z, -1));
        this.f13322c = intArray;
        if (intArray.length == 0) {
            throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
        }
    }

    public final void d(@NonNull Context context, @NonNull TypedArray typedArray) {
        if (typedArray.hasValue(k.E)) {
            this.f13323d = typedArray.getColor(k.E, -1);
            return;
        }
        this.f13323d = this.f13322c[0];
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.disabledAlpha});
        float f10 = typedArrayObtainStyledAttributes.getFloat(0, 0.2f);
        typedArrayObtainStyledAttributes.recycle();
        this.f13323d = vc.a.a(this.f13323d, (int) (f10 * 255.0f));
    }

    public void e() {
        if (this.f13326g < 0) {
            throw new IllegalArgumentException("indicatorTrackGapSize must be >= 0.");
        }
    }
}
