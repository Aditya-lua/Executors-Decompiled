package dd;

import ad.o;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import ic.k;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14530a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public int[] f14531c = new int[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14532d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f14533e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f14534f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f14535g;

    public b(@NonNull Context context, AttributeSet attributeSet, int i10, int i11) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(ic.d.f20643f0);
        TypedArray typedArrayI = o.i(context, attributeSet, k.f20985x, i10, i11, new int[0]);
        this.f14530a = ed.c.c(context, typedArrayI, k.G, dimensionPixelSize);
        this.b = Math.min(ed.c.c(context, typedArrayI, k.F, 0), this.f14530a / 2);
        this.f14533e = typedArrayI.getInt(k.C, 0);
        this.f14534f = typedArrayI.getInt(k.f20994y, 0);
        this.f14535g = typedArrayI.getDimensionPixelSize(k.A, 0);
        c(context, typedArrayI);
        d(context, typedArrayI);
        typedArrayI.recycle();
    }

    public boolean a() {
        return this.f14534f != 0;
    }

    public boolean b() {
        return this.f14533e != 0;
    }

    public final void c(@NonNull Context context, @NonNull TypedArray typedArray) {
        int i10 = k.f21003z;
        if (!typedArray.hasValue(i10)) {
            this.f14531c = new int[]{uc.a.b(context, ic.b.f20609l, -1)};
            return;
        }
        if (typedArray.peekValue(i10).type != 1) {
            this.f14531c = new int[]{typedArray.getColor(i10, -1)};
            return;
        }
        int[] intArray = context.getResources().getIntArray(typedArray.getResourceId(i10, -1));
        this.f14531c = intArray;
        if (intArray.length == 0) {
            throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
        }
    }

    public final void d(@NonNull Context context, @NonNull TypedArray typedArray) {
        int i10 = k.E;
        if (typedArray.hasValue(i10)) {
            this.f14532d = typedArray.getColor(i10, -1);
            return;
        }
        this.f14532d = this.f14531c[0];
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.disabledAlpha});
        float f10 = typedArrayObtainStyledAttributes.getFloat(0, 0.2f);
        typedArrayObtainStyledAttributes.recycle();
        this.f14532d = uc.a.a(this.f14532d, (int) (f10 * 255.0f));
    }

    public void e() {
        if (this.f14535g < 0) {
            throw new IllegalArgumentException("indicatorTrackGapSize must be >= 0.");
        }
    }
}
