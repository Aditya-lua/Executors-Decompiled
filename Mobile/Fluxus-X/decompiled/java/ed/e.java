package ed;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import bd.o;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import jc.k;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f13346h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f13347i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f13348j;

    public e(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, jc.b.f20287f);
    }

    public e(@NonNull Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, CircularProgressIndicator.f7971p);
    }

    public e(@NonNull Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(jc.d.f20329e0);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(jc.d.f20327d0);
        TypedArray typedArrayI = o.i(context, attributeSet, k.f20506e1, i10, i11, new int[0]);
        this.f13346h = Math.max(fd.c.c(context, typedArrayI, k.f20533h1, dimensionPixelSize), this.f13321a * 2);
        this.f13347i = fd.c.c(context, typedArrayI, k.f20524g1, dimensionPixelSize2);
        this.f13348j = typedArrayI.getInt(k.f20515f1, 0);
        typedArrayI.recycle();
        e();
    }
}
