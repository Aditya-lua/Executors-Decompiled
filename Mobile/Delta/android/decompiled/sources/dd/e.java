package dd;

import ad.o;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import ic.k;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f14555h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f14556i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f14557j;

    public e(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ic.b.f20599f);
    }

    public e(@NonNull Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, CircularProgressIndicator.f8127p);
    }

    public e(@NonNull Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(ic.d.f20641e0);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(ic.d.f20639d0);
        TypedArray typedArrayI = o.i(context, attributeSet, k.f20818e1, i10, i11, new int[0]);
        this.f14555h = Math.max(ed.c.c(context, typedArrayI, k.f20845h1, dimensionPixelSize), this.f14530a * 2);
        this.f14556i = ed.c.c(context, typedArrayI, k.f20836g1, dimensionPixelSize2);
        this.f14557j = typedArrayI.getInt(k.f20827f1, 0);
        typedArrayI.recycle();
        e();
    }
}
