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

/* JADX INFO: loaded from: classes2.dex */
public class j extends BaseAdapter {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f7901g = p.i().getMaximum(4);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f7902h = (p.i().getMaximum(5) + p.i().getMaximum(7)) - 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Month f7903a;
    public final DateSelector<?> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Collection<Long> f7904c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f7905d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CalendarConstraints f7906e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final DayViewDecorator f7907f;

    public j(Month month, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator) {
        this.f7903a = month;
        this.b = dateSelector;
        this.f7906e = calendarConstraints;
        this.f7907f = dayViewDecorator;
        this.f7904c = dateSelector.S2();
    }

    public int a(int i10) {
        return b() + (i10 - 1);
    }

    public int b() {
        return this.f7903a.q(this.f7906e.o());
    }

    public final String c(Context context, long j10) {
        return c.a(context, j10, l(j10), k(j10), g(j10));
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Long getItem(int i10) {
        if (i10 < b() || i10 > m()) {
            return null;
        }
        return Long.valueOf(this.f7903a.r(n(i10)));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0054  */
    @Override // android.widget.Adapter
    @NonNull
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public TextView getView(int i10, View view, @NonNull ViewGroup viewGroup) {
        int i11;
        f(viewGroup.getContext());
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(hc.h.f18899n, viewGroup, false);
        }
        int iB = i10 - b();
        if (iB >= 0) {
            Month month = this.f7903a;
            if (iB >= month.f7834e) {
                textView.setVisibility(8);
                textView.setEnabled(false);
                i11 = -1;
            } else {
                i11 = iB + 1;
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
        o(textView, item.longValue(), i11);
        return textView;
    }

    public final void f(Context context) {
        if (this.f7905d == null) {
            this.f7905d = new b(context);
        }
    }

    public boolean g(long j10) {
        Iterator<x2.c<Long, Long>> it = this.b.R1().iterator();
        while (it.hasNext()) {
            Long l10 = it.next().b;
            if (l10 != null && l10.longValue() == j10) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return f7902h;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10 / this.f7903a.f7833d;
    }

    public boolean h(int i10) {
        return i10 % this.f7903a.f7833d == 0;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    public boolean i(int i10) {
        return (i10 + 1) % this.f7903a.f7833d == 0;
    }

    public final boolean j(long j10) {
        Iterator<Long> it = this.b.S2().iterator();
        while (it.hasNext()) {
            if (p.a(j10) == p.a(it.next().longValue())) {
                return true;
            }
        }
        return false;
    }

    public boolean k(long j10) {
        Iterator<x2.c<Long, Long>> it = this.b.R1().iterator();
        while (it.hasNext()) {
            Long l10 = it.next().f34681a;
            if (l10 != null && l10.longValue() == j10) {
                return true;
            }
        }
        return false;
    }

    public final boolean l(long j10) {
        return p.g().getTimeInMillis() == j10;
    }

    public int m() {
        return (b() + this.f7903a.f7834e) - 1;
    }

    public int n(int i10) {
        return (i10 - b()) + 1;
    }

    public final void o(TextView textView, long j10, int i10) {
        boolean zJ;
        a aVar;
        if (textView == null) {
            return;
        }
        Context context = textView.getContext();
        String strC = c(context, j10);
        textView.setContentDescription(strC);
        boolean zX0 = this.f7906e.m().X0(j10);
        if (zX0) {
            textView.setEnabled(true);
            zJ = j(j10);
            textView.setSelected(zJ);
            if (zJ) {
                aVar = this.f7905d.b;
            } else {
                aVar = l(j10) ? this.f7905d.f7843c : this.f7905d.f7842a;
            }
        } else {
            zJ = false;
            textView.setEnabled(false);
            aVar = this.f7905d.f7847g;
        }
        boolean z10 = zJ;
        DayViewDecorator dayViewDecorator = this.f7907f;
        if (dayViewDecorator == null || i10 == -1) {
            aVar.d(textView);
            return;
        }
        Month month = this.f7903a;
        int i11 = month.f7832c;
        int i12 = month.b;
        aVar.e(textView, dayViewDecorator.a(context, i11, i12, i10, zX0, z10), this.f7907f.m(context, i11, i12, i10, zX0, z10));
        textView.setCompoundDrawables(this.f7907f.g(context, i11, i12, i10, zX0, z10), this.f7907f.j(context, i11, i12, i10, zX0, z10), this.f7907f.i(context, i11, i12, i10, zX0, z10), this.f7907f.f(context, i11, i12, i10, zX0, z10));
        textView.setContentDescription(this.f7907f.k(context, i11, i12, i10, zX0, z10, strC));
    }

    public final void p(MaterialCalendarGridView materialCalendarGridView, long j10) {
        if (Month.n(j10).equals(this.f7903a)) {
            int iS = this.f7903a.s(j10);
            o((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().a(iS) - materialCalendarGridView.getFirstVisiblePosition()), j10, iS);
        }
    }

    public void q(MaterialCalendarGridView materialCalendarGridView) {
        Iterator<Long> it = this.f7904c.iterator();
        while (it.hasNext()) {
            p(materialCalendarGridView, it.next().longValue());
        }
        DateSelector<?> dateSelector = this.b;
        if (dateSelector != null) {
            Iterator<Long> it2 = dateSelector.S2().iterator();
            while (it2.hasNext()) {
                p(materialCalendarGridView, it2.next().longValue());
            }
            this.f7904c = this.b.S2();
        }
    }

    public boolean r(int i10) {
        return i10 >= b() && i10 <= m();
    }
}
