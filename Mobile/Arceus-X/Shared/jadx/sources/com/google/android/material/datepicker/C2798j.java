package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.util.Collection;
import java.util.Iterator;
import p194ic.C6744h;
import p533x2.C12633c;

/* JADX INFO: renamed from: com.google.android.material.datepicker.j */
/* JADX INFO: loaded from: classes2.dex */
public class C2798j extends BaseAdapter {

    /* JADX INFO: renamed from: g */
    public static final int f10142g = C2804p.m12712i().getMaximum(4);

    /* JADX INFO: renamed from: h */
    public static final int f10143h = (C2804p.m12712i().getMaximum(5) + C2804p.m12712i().getMaximum(7)) - 1;

    /* JADX INFO: renamed from: a */
    public final Month f10144a;

    /* JADX INFO: renamed from: b */
    public final DateSelector<?> f10145b;

    /* JADX INFO: renamed from: c */
    public Collection<Long> f10146c;

    /* JADX INFO: renamed from: d */
    public C2790b f10147d;

    /* JADX INFO: renamed from: e */
    public final CalendarConstraints f10148e;

    /* JADX INFO: renamed from: f */
    public final DayViewDecorator f10149f;

    public C2798j(Month month, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator) {
        this.f10144a = month;
        this.f10145b = dateSelector;
        this.f10148e = calendarConstraints;
        this.f10149f = dayViewDecorator;
        this.f10146c = dateSelector.m12576S2();
    }

    /* JADX INFO: renamed from: a */
    public int m12676a(int i10) {
        return m12677b() + (i10 - 1);
    }

    /* JADX INFO: renamed from: b */
    public int m12677b() {
        return this.f10144a.m12601q(this.f10148e.m12562o());
    }

    /* JADX INFO: renamed from: c */
    public final String m12678c(Context context, long j10) {
        return C2791c.m12615a(context, j10, m12687l(j10), m12686k(j10), m12682g(j10));
    }

    /* JADX DEBUG: Method merged with bridge method: getItem(I)Ljava/lang/Object; */
    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Long getItem(int i10) {
        if (i10 < m12677b() || i10 > m12688m()) {
            return null;
        }
        return Long.valueOf(this.f10144a.m12602r(m12689n(i10)));
    }

    /* JADX DEBUG: Method merged with bridge method: getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View; */
    /* JADX WARN: Code duplicated, block: B:11:0x0054  */
    @Override // android.widget.Adapter
    @NonNull
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public TextView getView(int i10, View view, @NonNull ViewGroup viewGroup) {
        int i11;
        m12681f(viewGroup.getContext());
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C6744h.f26072n, viewGroup, false);
        }
        int iM12677b = i10 - m12677b();
        if (iM12677b >= 0) {
            Month month = this.f10144a;
            if (iM12677b >= month.f10037e) {
                textView.setVisibility(8);
                textView.setEnabled(false);
                i11 = -1;
            } else {
                i11 = iM12677b + 1;
                textView.setTag(month);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(i11)));
                textView.setVisibility(0);
                textView.setEnabled(true);
            }
        } else {
            textView.setVisibility(8);
            textView.setEnabled(false);
            i11 = -1;
        }
        Long item = getItem(i10);
        if (item == null) {
            return textView;
        }
        m12690o(textView, item.longValue(), i11);
        return textView;
    }

    /* JADX INFO: renamed from: f */
    public final void m12681f(Context context) {
        if (this.f10147d == null) {
            this.f10147d = new C2790b(context);
        }
    }

    /* JADX INFO: renamed from: g */
    public boolean m12682g(long j10) {
        Iterator<C12633c<Long, Long>> it = this.f10145b.m12575R1().iterator();
        while (it.hasNext()) {
            Long l10 = it.next().f44956b;
            if (l10 != null && l10.longValue() == j10) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return f10143h;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10 / this.f10144a.f10036d;
    }

    /* JADX INFO: renamed from: h */
    public boolean m12683h(int i10) {
        return i10 % this.f10144a.f10036d == 0;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    /* JADX INFO: renamed from: i */
    public boolean m12684i(int i10) {
        return (i10 + 1) % this.f10144a.f10036d == 0;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m12685j(long j10) {
        Iterator<Long> it = this.f10145b.m12576S2().iterator();
        while (it.hasNext()) {
            if (C2804p.m12704a(j10) == C2804p.m12704a(it.next().longValue())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public boolean m12686k(long j10) {
        Iterator<C12633c<Long, Long>> it = this.f10145b.m12575R1().iterator();
        while (it.hasNext()) {
            Long l10 = it.next().f44955a;
            if (l10 != null && l10.longValue() == j10) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m12687l(long j10) {
        return C2804p.m12710g().getTimeInMillis() == j10;
    }

    /* JADX INFO: renamed from: m */
    public int m12688m() {
        return (m12677b() + this.f10144a.f10037e) - 1;
    }

    /* JADX INFO: renamed from: n */
    public int m12689n(int i10) {
        return (i10 - m12677b()) + 1;
    }

    /* JADX INFO: renamed from: o */
    public final void m12690o(TextView textView, long j10, int i10) {
        boolean zM12685j;
        C2789a c2789a;
        if (textView == null) {
            return;
        }
        Context context = textView.getContext();
        String strM12678c = m12678c(context, j10);
        textView.setContentDescription(strM12678c);
        boolean zMo12567X0 = this.f10148e.m12560m().mo12567X0(j10);
        if (zMo12567X0) {
            textView.setEnabled(true);
            zM12685j = m12685j(j10);
            textView.setSelected(zM12685j);
            if (zM12685j) {
                c2789a = this.f10147d.f10047b;
            } else {
                c2789a = m12687l(j10) ? this.f10147d.f10048c : this.f10147d.f10046a;
            }
        } else {
            zM12685j = false;
            textView.setEnabled(false);
            c2789a = this.f10147d.f10052g;
        }
        boolean z10 = zM12685j;
        DayViewDecorator dayViewDecorator = this.f10149f;
        if (dayViewDecorator == null || i10 == -1) {
            c2789a.m12613d(textView);
            return;
        }
        Month month = this.f10144a;
        int i11 = month.f10035c;
        int i12 = month.f10034b;
        c2789a.m12614e(textView, dayViewDecorator.m12584a(context, i11, i12, i10, zMo12567X0, z10), this.f10149f.m12590m(context, i11, i12, i10, zMo12567X0, z10));
        textView.setCompoundDrawables(this.f10149f.m12586g(context, i11, i12, i10, zMo12567X0, z10), this.f10149f.m12588j(context, i11, i12, i10, zMo12567X0, z10), this.f10149f.m12587i(context, i11, i12, i10, zMo12567X0, z10), this.f10149f.m12585f(context, i11, i12, i10, zMo12567X0, z10));
        textView.setContentDescription(this.f10149f.m12589k(context, i11, i12, i10, zMo12567X0, z10, strM12678c));
    }

    /* JADX INFO: renamed from: p */
    public final void m12691p(MaterialCalendarGridView materialCalendarGridView, long j10) {
        if (Month.m12598n(j10).equals(this.f10144a)) {
            int iM12603s = this.f10144a.m12603s(j10);
            m12690o((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().m12676a(iM12603s) - materialCalendarGridView.getFirstVisiblePosition()), j10, iM12603s);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m12692q(MaterialCalendarGridView materialCalendarGridView) {
        Iterator<Long> it = this.f10146c.iterator();
        while (it.hasNext()) {
            m12691p(materialCalendarGridView, it.next().longValue());
        }
        DateSelector<?> dateSelector = this.f10145b;
        if (dateSelector != null) {
            Iterator<Long> it2 = dateSelector.m12576S2().iterator();
            while (it2.hasNext()) {
                m12691p(materialCalendarGridView, it2.next().longValue());
            }
            this.f10146c = this.f10145b.m12576S2();
        }
    }

    /* JADX INFO: renamed from: r */
    public boolean m12693r(int i10) {
        return i10 >= m12677b() && i10 <= m12688m();
    }
}
