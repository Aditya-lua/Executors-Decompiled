package com.google.android.material.datepicker;

import ad.C0146r;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.annotation.NonNull;
import androidx.core.view.C0582a;
import androidx.core.view.C0625o0;
import androidx.core.view.ViewCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.Calendar;
import p194ic.C6742f;
import p533x2.C12633c;
import p564y2.C13017p;

/* JADX INFO: loaded from: classes2.dex */
final class MaterialCalendarGridView extends GridView {

    /* JADX INFO: renamed from: a */
    public final Calendar f10030a;

    /* JADX INFO: renamed from: b */
    public final boolean f10031b;

    /* JADX INFO: renamed from: com.google.android.material.datepicker.MaterialCalendarGridView$a */
    public class C2787a extends C0582a {
        public C2787a() {
        }

        @Override // androidx.core.view.C0582a
        /* JADX INFO: renamed from: g */
        public void mo2799g(View view, @NonNull C13017p c13017p) {
            super.mo2799g(view, c13017p);
            c13017p.m48412n0(null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: renamed from: d */
    public static int m12592d(@NonNull View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m12593e(Long l10, Long l11, Long l12, Long l13) {
        return l10 == null || l11 == null || l12 == null || l13 == null || l12.longValue() > l11.longValue() || l13.longValue() < l10.longValue();
    }

    /* JADX INFO: renamed from: a */
    public final void m12594a(int i10, Rect rect) {
        if (i10 == 33) {
            setSelection(getAdapter().m12688m());
        } else if (i10 == 130) {
            setSelection(getAdapter().m12677b());
        } else {
            super.onFocusChanged(true, i10, rect);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: getAdapter()Landroid/widget/Adapter; */
    /* JADX DEBUG: Method merged with bridge method: getAdapter()Landroid/widget/ListAdapter; */
    @Override // android.widget.GridView, android.widget.AdapterView
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C2798j getAdapter() {
        return (C2798j) super.getAdapter();
    }

    /* JADX INFO: renamed from: c */
    public final View m12596c(int i10) {
        return getChildAt(i10 - getFirstVisiblePosition());
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(@NonNull Canvas canvas) {
        int iM12676a;
        int iM12592d;
        int iM12676a2;
        int iM12592d2;
        int width;
        int i10;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        C2798j adapter = materialCalendarGridView.getAdapter();
        DateSelector<?> dateSelector = adapter.f10145b;
        C2790b c2790b = adapter.f10147d;
        int iMax = Math.max(adapter.m12677b(), materialCalendarGridView.getFirstVisiblePosition());
        int iMin = Math.min(adapter.m12688m(), materialCalendarGridView.getLastVisiblePosition());
        Long item = adapter.getItem(iMax);
        Long item2 = adapter.getItem(iMin);
        for (C12633c<Long, Long> c12633c : dateSelector.m12575R1()) {
            Long l10 = c12633c.f44955a;
            if (l10 == null) {
                materialCalendarGridView = this;
            } else if (c12633c.f44956b != null) {
                Long l11 = l10;
                long jLongValue = l11.longValue();
                Long l12 = c12633c.f44956b;
                long jLongValue2 = l12.longValue();
                if (!m12593e(item, item2, l11, l12)) {
                    boolean zM453h = C0146r.m453h(materialCalendarGridView);
                    if (jLongValue < item.longValue()) {
                        iM12592d = adapter.m12683h(iMax) ? 0 : !zM453h ? materialCalendarGridView.m12596c(iMax - 1).getRight() : materialCalendarGridView.m12596c(iMax - 1).getLeft();
                        iM12676a = iMax;
                    } else {
                        materialCalendarGridView.f10030a.setTimeInMillis(jLongValue);
                        iM12676a = adapter.m12676a(materialCalendarGridView.f10030a.get(5));
                        iM12592d = m12592d(materialCalendarGridView.m12596c(iM12676a));
                    }
                    if (jLongValue2 > item2.longValue()) {
                        iM12592d2 = adapter.m12684i(iMin) ? materialCalendarGridView.getWidth() : !zM453h ? materialCalendarGridView.m12596c(iMin).getRight() : materialCalendarGridView.m12596c(iMin).getLeft();
                        iM12676a2 = iMin;
                    } else {
                        materialCalendarGridView.f10030a.setTimeInMillis(jLongValue2);
                        iM12676a2 = adapter.m12676a(materialCalendarGridView.f10030a.get(5));
                        iM12592d2 = m12592d(materialCalendarGridView.m12596c(iM12676a2));
                    }
                    int itemId = (int) adapter.getItemId(iM12676a);
                    int i11 = iMax;
                    int i12 = iMin;
                    int itemId2 = (int) adapter.getItemId(iM12676a2);
                    while (itemId <= itemId2) {
                        int numColumns = materialCalendarGridView.getNumColumns() * itemId;
                        int numColumns2 = (numColumns + materialCalendarGridView.getNumColumns()) - 1;
                        View viewM12596c = materialCalendarGridView.m12596c(numColumns);
                        int top = viewM12596c.getTop() + c2790b.f10046a.m12612c();
                        C2798j c2798j = adapter;
                        int bottom = viewM12596c.getBottom() - c2790b.f10046a.m12611b();
                        if (zM453h) {
                            int i13 = iM12676a2 > numColumns2 ? 0 : iM12592d2;
                            width = numColumns > iM12676a ? getWidth() : iM12592d;
                            i10 = i13;
                        } else {
                            i10 = numColumns > iM12676a ? 0 : iM12592d;
                            width = iM12676a2 > numColumns2 ? getWidth() : iM12592d2;
                        }
                        canvas.drawRect(i10, top, width, bottom, c2790b.f10053h);
                        itemId++;
                        materialCalendarGridView = this;
                        adapter = c2798j;
                    }
                    materialCalendarGridView = this;
                    iMax = i11;
                    iMin = i12;
                }
            }
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        if (z10) {
            m12594a(i10, rect);
        } else {
            super.onFocusChanged(false, i10, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (!super.onKeyDown(i10, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().m12677b()) {
            return true;
        }
        if (19 != i10) {
            return false;
        }
        setSelection(getAdapter().m12677b());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i10, int i11) {
        if (!this.f10031b) {
            super.onMeasure(i10, i11);
            return;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(ViewCompat.MEASURED_SIZE_MASK, EditorInfoCompat.IME_FLAG_FORCE_ASCII));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i10) {
        if (i10 < getAdapter().m12677b()) {
            super.setSelection(getAdapter().m12677b());
        } else {
            super.setSelection(i10);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f10030a = C2804p.m12712i();
        if (C2795g.m12653J2(getContext())) {
            setNextFocusLeftId(C6742f.f26030a);
            setNextFocusRightId(C6742f.f26033d);
        }
        this.f10031b = C2795g.m12654L2(getContext());
        C0625o0.m3040m0(this, new C2787a());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setAdapter(Landroid/widget/Adapter;)V */
    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof C2798j)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), C2798j.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }
}
