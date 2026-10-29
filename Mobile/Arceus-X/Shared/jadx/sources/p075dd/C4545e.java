package p075dd;

import ad.C0143o;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import p101ed.C5050c;
import p194ic.C6738b;
import p194ic.C6740d;
import p194ic.C6747k;

/* JADX INFO: renamed from: dd.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C4545e extends AbstractC4542b {

    /* JADX INFO: renamed from: h */
    public int f18612h;

    /* JADX INFO: renamed from: i */
    public int f18613i;

    /* JADX INFO: renamed from: j */
    public int f18614j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4545e(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6738b.f25895f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C4545e(@NonNull Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, CircularProgressIndicator.f10342p);
    }

    public C4545e(@NonNull Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C6740d.f25965e0);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(C6740d.f25963d0);
        TypedArray typedArrayM436i = C0143o.m436i(context, attributeSet, C6747k.f26410e1, i10, i11, new int[0]);
        this.f18612h = Math.max(C5050c.m23738c(context, typedArrayM436i, C6747k.f26437h1, dimensionPixelSize), this.f18585a * 2);
        this.f18613i = C5050c.m23738c(context, typedArrayM436i, C6747k.f26428g1, dimensionPixelSize2);
        this.f18614j = typedArrayM436i.getInt(C6747k.f26419f1, 0);
        typedArrayM436i.recycle();
        m22521e();
    }
}
