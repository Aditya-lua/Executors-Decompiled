package q;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.ActionMenuView;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0508a f28895a;
    public final Context b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ActionMenuView f28896c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public androidx.appcompat.widget.a f28897d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f28898e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public androidx.core.view.y0 f28899f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f28900g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f28901h;

    /* JADX INFO: renamed from: q.a$a, reason: collision with other inner class name */
    public class C0508a implements androidx.core.view.z0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f28902a = false;
        public int b;

        public C0508a() {
        }

        @Override // androidx.core.view.z0
        public void a(View view) {
            this.f28902a = true;
        }

        @Override // androidx.core.view.z0
        public void b(View view) {
            if (this.f28902a) {
                return;
            }
            a aVar = a.this;
            aVar.f28899f = null;
            a.super.setVisibility(this.b);
        }

        @Override // androidx.core.view.z0
        public void c(View view) {
            a.super.setVisibility(0);
            this.f28902a = false;
        }

        public C0508a d(androidx.core.view.y0 y0Var, int i10) {
            a.this.f28899f = y0Var;
            this.b = i10;
            return this;
        }
    }

    public a(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static int d(int i10, int i11, boolean z10) {
        return z10 ? i10 - i11 : i10 + i11;
    }

    public int c(View view, int i10, int i11, int i12) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE), i11);
        return Math.max(0, (i10 - view.getMeasuredWidth()) - i12);
    }

    public int e(View view, int i10, int i11, int i12, boolean z10) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i13 = i11 + ((i12 - measuredHeight) / 2);
        if (z10) {
            view.layout(i10 - measuredWidth, i13, i10, measuredHeight + i13);
        } else {
            view.layout(i10, i13, i10 + measuredWidth, measuredHeight + i13);
        }
        return z10 ? -measuredWidth : measuredWidth;
    }

    public androidx.core.view.y0 f(int i10, long j10) {
        androidx.core.view.y0 y0Var = this.f28899f;
        if (y0Var != null) {
            y0Var.c();
        }
        if (i10 != 0) {
            androidx.core.view.y0 y0VarB = androidx.core.view.o0.e(this).b(0.0f);
            y0VarB.e(j10);
            y0VarB.g(this.f28895a.d(y0VarB, i10));
            return y0VarB;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        androidx.core.view.y0 y0VarB2 = androidx.core.view.o0.e(this).b(1.0f);
        y0VarB2.e(j10);
        y0VarB2.g(this.f28895a.d(y0VarB2, i10));
        return y0VarB2;
    }

    public int getAnimatedVisibility() {
        return this.f28899f != null ? this.f28895a.b : getVisibility();
    }

    public int getContentHeight() {
        return this.f28898e;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, i.j.f20018a, i.a.f19887c, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(i.j.f20062j, 0));
        typedArrayObtainStyledAttributes.recycle();
        androidx.appcompat.widget.a aVar = this.f28897d;
        if (aVar != null) {
            aVar.G(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f28901h = false;
        }
        if (!this.f28901h) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f28901h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f28901h = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f28900g = false;
        }
        if (!this.f28900g) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f28900g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f28900g = false;
        }
        return true;
    }

    public void setContentHeight(int i10) {
        this.f28898e = i10;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        if (i10 != getVisibility()) {
            androidx.core.view.y0 y0Var = this.f28899f;
            if (y0Var != null) {
                y0Var.c();
            }
            super.setVisibility(i10);
        }
    }

    public a(@NonNull Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f28895a = new C0508a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i.a.f19886a, typedValue, true) || typedValue.resourceId == 0) {
            this.b = context;
        } else {
            this.b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }
}
