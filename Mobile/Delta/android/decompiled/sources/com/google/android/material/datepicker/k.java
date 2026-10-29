package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.view.o0;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public class k extends RecyclerView.h<b> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final CalendarConstraints f7908d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final DateSelector<?> f7909e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final DayViewDecorator f7910f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e.m f7911g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f7912h;

    public class a implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MaterialCalendarGridView f7913a;

        public a(MaterialCalendarGridView materialCalendarGridView) {
            this.f7913a = materialCalendarGridView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            if (this.f7913a.getAdapter().r(i10)) {
                k.this.f7911g.a(this.f7913a.getAdapter().getItem(i10).longValue());
            }
        }
    }

    public static class b extends RecyclerView.f0 {

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final TextView f7914u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final MaterialCalendarGridView f7915v;

        public b(@NonNull LinearLayout linearLayout, boolean z10) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(hc.f.f18881w);
            this.f7914u = textView;
            o0.n0(textView, true);
            this.f7915v = (MaterialCalendarGridView) linearLayout.findViewById(hc.f.f18877s);
            if (z10) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    public k(@NonNull Context context, DateSelector<?> dateSelector, @NonNull CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator, e.m mVar) {
        Month monthR = calendarConstraints.r();
        Month monthN = calendarConstraints.n();
        Month monthQ = calendarConstraints.q();
        if (monthR.compareTo(monthQ) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (monthQ.compareTo(monthN) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f7912h = (j.f7901g * e.q2(context)) + (g.J2(context) ? e.q2(context) : 0);
        this.f7908d = calendarConstraints;
        this.f7909e = dateSelector;
        this.f7910f = dayViewDecorator;
        this.f7911g = mVar;
        A(true);
    }

    @NonNull
    public Month D(int i10) {
        return this.f7908d.r().w(i10);
    }

    @NonNull
    public CharSequence E(int i10) {
        return D(i10).u();
    }

    public int F(@NonNull Month month) {
        return this.f7908d.r().x(month);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void r(@NonNull b bVar, int i10) {
        Month monthW = this.f7908d.r().w(i10);
        bVar.f7914u.setText(monthW.u());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.f7915v.findViewById(hc.f.f18877s);
        if (materialCalendarGridView.getAdapter() == null || !monthW.equals(materialCalendarGridView.getAdapter().f7903a)) {
            j jVar = new j(monthW, this.f7909e, this.f7908d, this.f7910f);
            materialCalendarGridView.setNumColumns(monthW.f7833d);
            materialCalendarGridView.setAdapter((ListAdapter) jVar);
        } else {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter().q(materialCalendarGridView);
        }
        materialCalendarGridView.setOnItemClickListener(new a(materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NonNull
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public b t(@NonNull ViewGroup viewGroup, int i10) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(hc.h.f18902q, viewGroup, false);
        if (!g.J2(viewGroup.getContext())) {
            return new b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.r(-1, this.f7912h));
        return new b(linearLayout, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        return this.f7908d.p();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long f(int i10) {
        return this.f7908d.r().w(i10).v();
    }
}
