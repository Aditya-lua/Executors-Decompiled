package p365q;

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
import androidx.appcompat.widget.C0483a;
import androidx.core.view.C0625o0;
import androidx.core.view.C0645y0;
import androidx.core.view.InterfaceC0647z0;
import androidx.core.view.inputmethod.EditorInfoCompat;
import p181i.C6589a;
import p181i.C6598j;

/* JADX INFO: renamed from: q.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10355a extends ViewGroup {

    /* JADX INFO: renamed from: a */
    public final a f37207a;

    /* JADX INFO: renamed from: b */
    public final Context f37208b;

    /* JADX INFO: renamed from: c */
    public ActionMenuView f37209c;

    /* JADX INFO: renamed from: d */
    public C0483a f37210d;

    /* JADX INFO: renamed from: e */
    public int f37211e;

    /* JADX INFO: renamed from: f */
    public C0645y0 f37212f;

    /* JADX INFO: renamed from: g */
    public boolean f37213g;

    /* JADX INFO: renamed from: h */
    public boolean f37214h;

    /* JADX INFO: renamed from: q.a$a */
    public class a implements InterfaceC0647z0 {

        /* JADX INFO: renamed from: a */
        public boolean f37215a = false;

        /* JADX INFO: renamed from: b */
        public int f37216b;

        public a() {
        }

        @Override // androidx.core.view.InterfaceC0647z0
        /* JADX INFO: renamed from: a */
        public void mo2027a(View view) {
            this.f37215a = true;
        }

        @Override // androidx.core.view.InterfaceC0647z0
        /* JADX INFO: renamed from: b */
        public void mo2028b(View view) {
            if (this.f37215a) {
                return;
            }
            AbstractC10355a abstractC10355a = AbstractC10355a.this;
            abstractC10355a.f37212f = null;
            AbstractC10355a.super.setVisibility(this.f37216b);
        }

        @Override // androidx.core.view.InterfaceC0647z0
        /* JADX INFO: renamed from: c */
        public void mo2029c(View view) {
            AbstractC10355a.super.setVisibility(0);
            this.f37215a = false;
        }

        /* JADX INFO: renamed from: d */
        public a m39689d(C0645y0 c0645y0, int i10) {
            AbstractC10355a.this.f37212f = c0645y0;
            this.f37216b = i10;
            return this;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC10355a(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: renamed from: d */
    public static int m39686d(int i10, int i11, boolean z10) {
        return z10 ? i10 - i11 : i10 + i11;
    }

    /* JADX INFO: renamed from: c */
    public int m39687c(View view, int i10, int i11, int i12) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, EditorInfoCompat.IME_FLAG_FORCE_ASCII), i11);
        return Math.max(0, (i10 - view.getMeasuredWidth()) - i12);
    }

    /* JADX INFO: renamed from: e */
    public int m39688e(View view, int i10, int i11, int i12, boolean z10) {
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

    /* JADX INFO: renamed from: f */
    public C0645y0 mo1709f(int i10, long j10) {
        C0645y0 c0645y0 = this.f37212f;
        if (c0645y0 != null) {
            c0645y0.m3226c();
        }
        if (i10 != 0) {
            C0645y0 c0645y0M3225b = C0625o0.m3023e(this).m3225b(0.0f);
            c0645y0M3225b.m3228e(j10);
            c0645y0M3225b.m3230g(this.f37207a.m39689d(c0645y0M3225b, i10));
            return c0645y0M3225b;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        C0645y0 c0645y0M3225b2 = C0625o0.m3023e(this).m3225b(1.0f);
        c0645y0M3225b2.m3228e(j10);
        c0645y0M3225b2.m3230g(this.f37207a.m39689d(c0645y0M3225b2, i10));
        return c0645y0M3225b2;
    }

    public int getAnimatedVisibility() {
        return this.f37212f != null ? this.f37207a.f37216b : getVisibility();
    }

    public int getContentHeight() {
        return this.f37211e;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, C6598j.f25326a, C6589a.f25024c, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(C6598j.f25371j, 0));
        typedArrayObtainStyledAttributes.recycle();
        C0483a c0483a = this.f37210d;
        if (c0483a != null) {
            c0483a.m1959G(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f37214h = false;
        }
        if (!this.f37214h) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f37214h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f37214h = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f37213g = false;
        }
        if (!this.f37213g) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f37213g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f37213g = false;
        }
        return true;
    }

    public void setContentHeight(int i10) {
        this.f37211e = i10;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        if (i10 != getVisibility()) {
            C0645y0 c0645y0 = this.f37212f;
            if (c0645y0 != null) {
                c0645y0.m3226c();
            }
            super.setVisibility(i10);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public AbstractC10355a(@NonNull Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f37207a = new a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(C6589a.f25022a, typedValue, true) || typedValue.resourceId == 0) {
            this.f37208b = context;
        } else {
            this.f37208b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }
}
