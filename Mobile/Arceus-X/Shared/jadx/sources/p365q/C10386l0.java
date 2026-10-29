package p365q;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.core.view.C0645y0;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p066d3.C4429g;
import p181i.C6589a;
import p258l.C7953a;
import p368q2.C10425a;

/* JADX INFO: renamed from: q.l0 */
/* JADX INFO: loaded from: classes.dex */
public class C10386l0 extends ListView {

    /* JADX INFO: renamed from: a */
    public final Rect f37357a;

    /* JADX INFO: renamed from: b */
    public int f37358b;

    /* JADX INFO: renamed from: c */
    public int f37359c;

    /* JADX INFO: renamed from: d */
    public int f37360d;

    /* JADX INFO: renamed from: e */
    public int f37361e;

    /* JADX INFO: renamed from: f */
    public int f37362f;

    /* JADX INFO: renamed from: g */
    public d f37363g;

    /* JADX INFO: renamed from: h */
    public boolean f37364h;

    /* JADX INFO: renamed from: i */
    public boolean f37365i;

    /* JADX INFO: renamed from: j */
    public boolean f37366j;

    /* JADX INFO: renamed from: k */
    public C0645y0 f37367k;

    /* JADX INFO: renamed from: l */
    public C4429g f37368l;

    /* JADX INFO: renamed from: m */
    public f f37369m;

    /* JADX INFO: renamed from: q.l0$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static void m39908a(View view, float f10, float f11) {
            view.drawableHotspotChanged(f10, f11);
        }
    }

    /* JADX INFO: renamed from: q.l0$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public static Method f37370a;

        /* JADX INFO: renamed from: b */
        public static Method f37371b;

        /* JADX INFO: renamed from: c */
        public static Method f37372c;

        /* JADX INFO: renamed from: d */
        public static boolean f37373d;

        static {
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Boolean.TYPE;
                Class cls3 = Float.TYPE;
                Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
                f37370a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
                f37371b = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
                f37372c = declaredMethod3;
                declaredMethod3.setAccessible(true);
                f37373d = true;
            } catch (NoSuchMethodException e10) {
                e10.printStackTrace();
            }
        }

        /* JADX INFO: renamed from: a */
        public static boolean m39909a() {
            return f37373d;
        }

        @SuppressLint({"BanUncheckedReflection"})
        /* JADX INFO: renamed from: b */
        public static void m39910b(C10386l0 c10386l0, int i10, View view) {
            try {
                f37370a.invoke(c10386l0, Integer.valueOf(i10), view, Boolean.FALSE, -1, -1);
                f37371b.invoke(c10386l0, Integer.valueOf(i10));
                f37372c.invoke(c10386l0, Integer.valueOf(i10));
            } catch (IllegalAccessException e10) {
                e10.printStackTrace();
            } catch (InvocationTargetException e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: q.l0$c */
    public static class c {
        /* JADX INFO: renamed from: a */
        public static boolean m39911a(AbsListView absListView) {
            return absListView.isSelectedChildViewEnabled();
        }

        /* JADX INFO: renamed from: b */
        public static void m39912b(AbsListView absListView, boolean z10) {
            absListView.setSelectedChildViewEnabled(z10);
        }
    }

    /* JADX INFO: renamed from: q.l0$d */
    public static class d extends C7953a {

        /* JADX INFO: renamed from: b */
        public boolean f37374b;

        public d(Drawable drawable) {
            super(drawable);
            this.f37374b = true;
        }

        /* JADX INFO: renamed from: b */
        public void m39913b(boolean z10) {
            this.f37374b = z10;
        }

        @Override // p258l.C7953a, android.graphics.drawable.Drawable
        public void draw(@NonNull Canvas canvas) {
            if (this.f37374b) {
                super.draw(canvas);
            }
        }

        @Override // p258l.C7953a, android.graphics.drawable.Drawable
        public void setHotspot(float f10, float f11) {
            if (this.f37374b) {
                super.setHotspot(f10, f11);
            }
        }

        @Override // p258l.C7953a, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i10, int i11, int i12, int i13) {
            if (this.f37374b) {
                super.setHotspotBounds(i10, i11, i12, i13);
            }
        }

        @Override // p258l.C7953a, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f37374b) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // p258l.C7953a, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z10, boolean z11) {
            if (this.f37374b) {
                return super.setVisible(z10, z11);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: q.l0$e */
    public static class e {

        /* JADX INFO: renamed from: a */
        public static final Field f37375a;

        static {
            Field declaredField = null;
            try {
                declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                e10.printStackTrace();
            }
            f37375a = declaredField;
        }

        /* JADX INFO: renamed from: a */
        public static boolean m39914a(AbsListView absListView) {
            Field field = f37375a;
            if (field == null) {
                return false;
            }
            try {
                return field.getBoolean(absListView);
            } catch (IllegalAccessException e10) {
                e10.printStackTrace();
                return false;
            }
        }

        /* JADX INFO: renamed from: b */
        public static void m39915b(AbsListView absListView, boolean z10) {
            Field field = f37375a;
            if (field != null) {
                try {
                    field.set(absListView, Boolean.valueOf(z10));
                } catch (IllegalAccessException e10) {
                    e10.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: renamed from: q.l0$f */
    public class f implements Runnable {
        public f() {
        }

        /* JADX INFO: renamed from: a */
        public void m39916a() {
            C10386l0 c10386l0 = C10386l0.this;
            c10386l0.f37369m = null;
            c10386l0.removeCallbacks(this);
        }

        /* JADX INFO: renamed from: b */
        public void m39917b() {
            C10386l0.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            C10386l0 c10386l0 = C10386l0.this;
            c10386l0.f37369m = null;
            c10386l0.drawableStateChanged();
        }
    }

    public C10386l0(@NonNull Context context, boolean z10) {
        super(context, null, C6589a.f25007C);
        this.f37357a = new Rect();
        this.f37358b = 0;
        this.f37359c = 0;
        this.f37360d = 0;
        this.f37361e = 0;
        this.f37365i = z10;
        setCacheColorHint(0);
    }

    private void setSelectorEnabled(boolean z10) {
        d dVar = this.f37363g;
        if (dVar != null) {
            dVar.m39913b(z10);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m39895a() {
        this.f37366j = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f37362f - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        C0645y0 c0645y0 = this.f37367k;
        if (c0645y0 != null) {
            c0645y0.m3226c();
            this.f37367k = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m39896b(View view, int i10) {
        performItemClick(view, i10, getItemIdAtPosition(i10));
    }

    /* JADX INFO: renamed from: c */
    public final void m39897c(Canvas canvas) {
        Drawable selector;
        if (this.f37357a.isEmpty() || (selector = getSelector()) == null) {
            return;
        }
        selector.setBounds(this.f37357a);
        selector.draw(canvas);
    }

    /* JADX INFO: renamed from: d */
    public int mo39898d(int i10, int i11, int i12, int i13, int i14) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        View view = null;
        while (i15 < count) {
            int itemViewType = adapter.getItemViewType(i15);
            if (itemViewType != i16) {
                view = null;
                i16 = itemViewType;
            }
            view = adapter.getView(i15, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i18 = layoutParams.height;
            view.measure(i10, i18 > 0 ? View.MeasureSpec.makeMeasureSpec(i18, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i15 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i13) {
                return (i14 < 0 || i15 <= i14 || i17 <= 0 || measuredHeight == i13) ? i13 : i17;
            }
            if (i14 >= 0 && i15 >= i14) {
                i17 = measuredHeight;
            }
            i15++;
        }
        return measuredHeight;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        m39897c(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        if (this.f37369m != null) {
            return;
        }
        super.drawableStateChanged();
        setSelectorEnabled(true);
        m39907m();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004a  */
    /* JADX WARN: Code duplicated, block: B:25:0x004f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x0065  */
    /* JADX WARN: Code duplicated, block: B:32:0x0069  */
    /* JADX WARN: Code duplicated, block: B:9:0x0011  */
    /* JADX INFO: renamed from: e */
    public boolean mo39899e(MotionEvent motionEvent, int i10) {
        boolean z10;
        boolean z11;
        C4429g c4429g;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            z10 = false;
        } else {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    z10 = true;
                    z11 = false;
                } else {
                    z11 = false;
                    z10 = false;
                }
                if (z10 || z11) {
                    m39895a();
                }
                if (z10) {
                    c4429g = this.f37368l;
                    if (c4429g != null) {
                        c4429g.m22235m(false);
                    }
                    return z10;
                }
                if (this.f37368l == null) {
                    this.f37368l = new C4429g(this);
                }
                this.f37368l.m22235m(true);
                this.f37368l.onTouch(this, motionEvent);
                return z10;
            }
            z10 = true;
        }
        int iFindPointerIndex = motionEvent.findPointerIndex(i10);
        if (iFindPointerIndex < 0) {
            z11 = false;
            z10 = false;
        } else {
            int x10 = (int) motionEvent.getX(iFindPointerIndex);
            int y10 = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x10, y10);
            if (iPointToPosition == -1) {
                z11 = true;
            } else {
                View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                m39903i(childAt, iPointToPosition, x10, y10);
                if (actionMasked == 1) {
                    m39896b(childAt, iPointToPosition);
                }
                z10 = true;
                z11 = false;
            }
        }
        if (z10) {
            m39895a();
        } else {
            m39895a();
        }
        if (z10) {
            c4429g = this.f37368l;
            if (c4429g != null) {
                c4429g.m22235m(false);
            }
            return z10;
        }
        if (this.f37368l == null) {
            this.f37368l = new C4429g(this);
        }
        this.f37368l.m22235m(true);
        this.f37368l.onTouch(this, motionEvent);
        return z10;
    }

    /* JADX INFO: renamed from: f */
    public final void m39900f(int i10, View view) {
        Rect rect = this.f37357a;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f37358b;
        rect.top -= this.f37359c;
        rect.right += this.f37360d;
        rect.bottom += this.f37361e;
        boolean zM39904j = m39904j();
        if (view.isEnabled() != zM39904j) {
            m39905k(!zM39904j);
            if (i10 != -1) {
                refreshDrawableState();
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m39901g(int i10, View view) {
        Drawable selector = getSelector();
        boolean z10 = (selector == null || i10 == -1) ? false : true;
        if (z10) {
            selector.setVisible(false, false);
        }
        m39900f(i10, view);
        if (z10) {
            Rect rect = this.f37357a;
            float fExactCenterX = rect.exactCenterX();
            float fExactCenterY = rect.exactCenterY();
            selector.setVisible(getVisibility() == 0, false);
            C10425a.m40114k(selector, fExactCenterX, fExactCenterY);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m39902h(int i10, View view, float f10, float f11) {
        m39901g(i10, view);
        Drawable selector = getSelector();
        if (selector == null || i10 == -1) {
            return;
        }
        C10425a.m40114k(selector, f10, f11);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f37365i || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f37365i || super.hasWindowFocus();
    }

    /* JADX INFO: renamed from: i */
    public final void m39903i(View view, int i10, float f10, float f11) {
        View childAt;
        this.f37366j = true;
        a.m39908a(this, f10, f11);
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i11 = this.f37362f;
        if (i11 != -1 && (childAt = getChildAt(i11 - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.f37362f = i10;
        a.m39908a(view, f10 - view.getLeft(), f11 - view.getTop());
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        m39902h(i10, view, f10, f11);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f37365i || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f37365i && this.f37364h) || super.isInTouchMode();
    }

    /* JADX INFO: renamed from: j */
    public final boolean m39904j() {
        return Build.VERSION.SDK_INT >= 33 ? c.m39911a(this) : e.m39914a(this);
    }

    /* JADX INFO: renamed from: k */
    public final void m39905k(boolean z10) {
        if (Build.VERSION.SDK_INT >= 33) {
            c.m39912b(this, z10);
        } else {
            e.m39915b(this, z10);
        }
    }

    /* JADX INFO: renamed from: l */
    public final boolean m39906l() {
        return this.f37366j;
    }

    /* JADX INFO: renamed from: m */
    public final void m39907m() {
        Drawable selector = getSelector();
        if (selector != null && m39906l() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f37369m = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(@NonNull MotionEvent motionEvent) {
        int i10 = Build.VERSION.SDK_INT;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f37369m == null) {
            f fVar = new f();
            this.f37369m = fVar;
            fVar.m39917b();
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return zOnHoverEvent;
        }
        int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (i10 < 30 || !b.m39909a()) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                } else {
                    b.m39910b(this, iPointToPosition, childAt);
                }
            }
            m39907m();
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f37362f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        f fVar = this.f37369m;
        if (fVar != null) {
            fVar.m39916a();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z10) {
        this.f37364h = z10;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        d dVar = drawable != null ? new d(drawable) : null;
        this.f37363g = dVar;
        super.setSelector(dVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f37358b = rect.left;
        this.f37359c = rect.top;
        this.f37360d = rect.right;
        this.f37361e = rect.bottom;
    }
}
