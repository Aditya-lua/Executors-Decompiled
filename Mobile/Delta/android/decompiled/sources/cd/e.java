package cd;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import hc.k;
import zc.o;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4717h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f4718i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f4719j;

    public e(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, hc.b.f18777f);
    }

    public e(@NonNull Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, CircularProgressIndicator.f8053p);
    }

    public e(@NonNull Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(hc.d.f18819e0);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(hc.d.f18817d0);
        TypedArray typedArrayI = o.i(context, attributeSet, k.f18996e1, i10, i11, new int[0]);
        this.f4717h = Math.max(dd.c.c(context, typedArrayI, k.f19023h1, dimensionPixelSize), this.f4692a * 2);
        this.f4718i = dd.c.c(context, typedArrayI, k.f19014g1, dimensionPixelSize2);
        this.f4719j = typedArrayI.getInt(k.f19005f1, 0);
        typedArrayI.recycle();
        e();
    }
}
