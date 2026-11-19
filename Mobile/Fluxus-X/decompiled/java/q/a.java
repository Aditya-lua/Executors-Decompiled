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
    public final C0574a f29434a;
    public final Context b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ActionMenuView f29435c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public androidx.appcompat.widget.a f29436d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f29437e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public androidx.core.view.y0 f29438f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f29439g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f29440h;

    /* JADX INFO: renamed from: q.a$a, reason: collision with other inner class name */
    public class C0574a implements androidx.core.view.z0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f29441a = false;
        public int b;

        public C0574a() {
        }

        @Override // androidx.core.view.z0
        public void a(View view) {
            this.f29441a = true;
        }

        @Override // androidx.core.view.z0
        public void b(View view) {
            if (this.f29441a) {
                return;
            }
            a aVar = a.this;
            aVar.f29438f = null;
            a.super.setVisibility(this.b);
        }

        @Override // androidx.core.view.z0
        public void c(View view) {
            a.super.setVisibility(0);
            this.f29441a = false;
        }

        public C0574a d(androidx.core.view.y0 y0Var, int i10) {
            a.this.f29438f = y0Var;
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
        androidx.core.view.y0 y0Var = this.f29438f;
        if (y0Var != null) {
            y0Var.c();
        }
        if (i10 != 0) {
            androidx.core.view.y0 y0VarB = androidx.core.view.o0.e(this).b(0.0f);
            y0VarB.e(j10);
            y0VarB.g(this.f29434a.d(y0VarB, i10));
            return y0VarB;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        androidx.core.view.y0 y0VarB2 = androidx.core.view.o0.e(this).b(1.0f);
        y0VarB2.e(j10);
        y0VarB2.g(this.f29434a.d(y0VarB2, i10));
        return y0VarB2;
    }

    public int getAnimatedVisibility() {
        return this.f29438f != null ? this.f29434a.b : getVisibility();
    }

    public int getContentHeight() {
        return this.f29437e;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, i.j.f18861a, i.a.f18730c, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(i.j.f18905j, 0));
        typedArrayObtainStyledAttributes.recycle();
        androidx.appcompat.widget.a aVar = this.f29436d;
        if (aVar != null) {
            aVar.G(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f29440h = false;
        }
        if (!this.f29440h) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f29440h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f29440h = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f29439g = false;
        }
        if (!this.f29439g) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f29439g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f29439g = false;
        }
        return true;
    }

    public void setContentHeight(int i10) {
        this.f29437e = i10;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        if (i10 != getVisibility()) {
            androidx.core.view.y0 y0Var = this.f29438f;
            if (y0Var != null) {
                y0Var.c();
            }
            super.setVisibility(i10);
        }
    }

    public a(@NonNull Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f29434a = new C0574a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i.a.f18729a, typedValue, true) || typedValue.resourceId == 0) {
            this.b = context;
        } else {
            this.b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }
}
