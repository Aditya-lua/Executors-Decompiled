package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public TypedValue f1445a;

    /* JADX INFO: renamed from: b */
    public TypedValue f1446b;

    /* JADX INFO: renamed from: c */
    public TypedValue f1447c;

    /* JADX INFO: renamed from: d */
    public TypedValue f1448d;

    /* JADX INFO: renamed from: e */
    public TypedValue f1449e;

    /* JADX INFO: renamed from: f */
    public TypedValue f1450f;

    /* JADX INFO: renamed from: g */
    public final Rect f1451g;

    /* JADX INFO: renamed from: h */
    public InterfaceC0451a f1452h;

    /* JADX INFO: renamed from: androidx.appcompat.widget.ContentFrameLayout$a */
    public interface InterfaceC0451a {
        /* JADX INFO: renamed from: a */
        void mo1813a();

        void onDetachedFromWindow();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ContentFrameLayout(@NonNull Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    public void m1812a(int i10, int i11, int i12, int i13) {
        this.f1451g.set(i10, i11, i12, i13);
        if (isLaidOut()) {
            requestLayout();
        }
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f1449e == null) {
            this.f1449e = new TypedValue();
        }
        return this.f1449e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f1450f == null) {
            this.f1450f = new TypedValue();
        }
        return this.f1450f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f1447c == null) {
            this.f1447c = new TypedValue();
        }
        return this.f1447c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f1448d == null) {
            this.f1448d = new TypedValue();
        }
        return this.f1448d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f1445a == null) {
            this.f1445a = new TypedValue();
        }
        return this.f1445a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f1446b == null) {
            this.f1446b = new TypedValue();
        }
        return this.f1446b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC0451a interfaceC0451a = this.f1452h;
        if (interfaceC0451a != null) {
            interfaceC0451a.mo1813a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC0451a interfaceC0451a = this.f1452h;
        if (interfaceC0451a != null) {
            interfaceC0451a.onDetachedFromWindow();
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004a  */
    /* JADX WARN: Code duplicated, block: B:22:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0086  */
    /* JADX WARN: Code duplicated, block: B:54:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:57:0x00db  */
    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        boolean z10;
        int i12;
        int i13;
        float fraction;
        int i14;
        int i15;
        float fraction2;
        int i16;
        int i17;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z11 = true;
        boolean z12 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        if (mode != Integer.MIN_VALUE) {
            z10 = false;
        } else {
            TypedValue typedValue = z12 ? this.f1448d : this.f1447c;
            if (typedValue == null || (i16 = typedValue.type) == 0) {
                z10 = false;
            } else {
                if (i16 == 5) {
                    fraction3 = typedValue.getDimension(displayMetrics);
                } else {
                    if (i16 == 6) {
                        int i18 = displayMetrics.widthPixels;
                        fraction3 = typedValue.getFraction(i18, i18);
                    } else {
                        i17 = 0;
                    }
                    if (i17 > 0) {
                        Rect rect = this.f1451g;
                        i10 = View.MeasureSpec.makeMeasureSpec(Math.min(i17 - (rect.left + rect.right), View.MeasureSpec.getSize(i10)), 1073741824);
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                i17 = (int) fraction3;
                if (i17 > 0) {
                    Rect rect2 = this.f1451g;
                    i10 = View.MeasureSpec.makeMeasureSpec(Math.min(i17 - (rect2.left + rect2.right), View.MeasureSpec.getSize(i10)), 1073741824);
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
        }
        if (mode2 == Integer.MIN_VALUE) {
            TypedValue typedValue2 = z12 ? this.f1449e : this.f1450f;
            if (typedValue2 != null && (i14 = typedValue2.type) != 0) {
                if (i14 == 5) {
                    fraction2 = typedValue2.getDimension(displayMetrics);
                } else {
                    if (i14 == 6) {
                        int i19 = displayMetrics.heightPixels;
                        fraction2 = typedValue2.getFraction(i19, i19);
                    } else {
                        i15 = 0;
                    }
                    if (i15 > 0) {
                        Rect rect3 = this.f1451g;
                        i11 = View.MeasureSpec.makeMeasureSpec(Math.min(i15 - (rect3.top + rect3.bottom), View.MeasureSpec.getSize(i11)), 1073741824);
                    }
                }
                i15 = (int) fraction2;
                if (i15 > 0) {
                    Rect rect4 = this.f1451g;
                    i11 = View.MeasureSpec.makeMeasureSpec(Math.min(i15 - (rect4.top + rect4.bottom), View.MeasureSpec.getSize(i11)), 1073741824);
                }
            }
        }
        super.onMeasure(i10, i11);
        int measuredWidth = getMeasuredWidth();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (z10 || mode != Integer.MIN_VALUE) {
            z11 = false;
        } else {
            TypedValue typedValue3 = z12 ? this.f1446b : this.f1445a;
            if (typedValue3 == null || (i12 = typedValue3.type) == 0) {
                z11 = false;
            } else {
                if (i12 == 5) {
                    fraction = typedValue3.getDimension(displayMetrics);
                } else {
                    if (i12 == 6) {
                        int i20 = displayMetrics.widthPixels;
                        fraction = typedValue3.getFraction(i20, i20);
                    } else {
                        i13 = 0;
                    }
                    if (i13 > 0) {
                        Rect rect5 = this.f1451g;
                        i13 -= rect5.left + rect5.right;
                    }
                    if (measuredWidth < i13) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
                    } else {
                        z11 = false;
                    }
                }
                i13 = (int) fraction;
                if (i13 > 0) {
                    Rect rect6 = this.f1451g;
                    i13 -= rect6.left + rect6.right;
                }
                if (measuredWidth < i13) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
                } else {
                    z11 = false;
                }
            }
        }
        if (z11) {
            super.onMeasure(iMakeMeasureSpec, i11);
        }
    }

    public void setAttachListener(InterfaceC0451a interfaceC0451a) {
        this.f1452h = interfaceC0451a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public ContentFrameLayout(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(@NonNull Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1451g = new Rect();
    }
}
