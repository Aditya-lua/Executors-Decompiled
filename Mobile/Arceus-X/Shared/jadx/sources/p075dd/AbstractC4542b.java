package p075dd;

import ad.C0143o;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import p101ed.C5050c;
import p194ic.C6738b;
import p194ic.C6740d;
import p194ic.C6747k;
import p463uc.C11840a;

/* JADX INFO: renamed from: dd.b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4542b {

    /* JADX INFO: renamed from: a */
    public int f18585a;

    /* JADX INFO: renamed from: b */
    public int f18586b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public int[] f18587c = new int[0];

    /* JADX INFO: renamed from: d */
    public int f18588d;

    /* JADX INFO: renamed from: e */
    public int f18589e;

    /* JADX INFO: renamed from: f */
    public int f18590f;

    /* JADX INFO: renamed from: g */
    public int f18591g;

    public AbstractC4542b(@NonNull Context context, AttributeSet attributeSet, int i10, int i11) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C6740d.f25967f0);
        TypedArray typedArrayM436i = C0143o.m436i(context, attributeSet, C6747k.f26579x, i10, i11, new int[0]);
        this.f18585a = C5050c.m23738c(context, typedArrayM436i, C6747k.f26189G, dimensionPixelSize);
        this.f18586b = Math.min(C5050c.m23738c(context, typedArrayM436i, C6747k.f26180F, 0), this.f18585a / 2);
        this.f18589e = typedArrayM436i.getInt(C6747k.f26153C, 0);
        this.f18590f = typedArrayM436i.getInt(C6747k.f26588y, 0);
        this.f18591g = typedArrayM436i.getDimensionPixelSize(C6747k.f26135A, 0);
        m22519c(context, typedArrayM436i);
        m22520d(context, typedArrayM436i);
        typedArrayM436i.recycle();
    }

    /* JADX INFO: renamed from: a */
    public boolean m22517a() {
        return this.f18590f != 0;
    }

    /* JADX INFO: renamed from: b */
    public boolean m22518b() {
        return this.f18589e != 0;
    }

    /* JADX INFO: renamed from: c */
    public final void m22519c(@NonNull Context context, @NonNull TypedArray typedArray) {
        int i10 = C6747k.f26597z;
        if (!typedArray.hasValue(i10)) {
            this.f18587c = new int[]{C11840a.m44226b(context, C6738b.f25905l, -1)};
            return;
        }
        if (typedArray.peekValue(i10).type != 1) {
            this.f18587c = new int[]{typedArray.getColor(i10, -1)};
            return;
        }
        int[] intArray = context.getResources().getIntArray(typedArray.getResourceId(i10, -1));
        this.f18587c = intArray;
        if (intArray.length == 0) {
            throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m22520d(@NonNull Context context, @NonNull TypedArray typedArray) {
        int i10 = C6747k.f26171E;
        if (typedArray.hasValue(i10)) {
            this.f18588d = typedArray.getColor(i10, -1);
            return;
        }
        this.f18588d = this.f18587c[0];
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.disabledAlpha});
        float f10 = typedArrayObtainStyledAttributes.getFloat(0, 0.2f);
        typedArrayObtainStyledAttributes.recycle();
        this.f18588d = C11840a.m44225a(this.f18588d, (int) (f10 * 255.0f));
    }

    /* JADX INFO: renamed from: e */
    public void m22521e() {
        if (this.f18591g < 0) {
            throw new IllegalArgumentException("indicatorTrackGapSize must be >= 0.");
        }
    }
}
