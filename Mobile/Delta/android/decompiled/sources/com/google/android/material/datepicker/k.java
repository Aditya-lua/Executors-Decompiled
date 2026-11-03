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
    public final CalendarConstraints f7982d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final DateSelector<?> f7983e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final DayViewDecorator f7984f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e.m f7985g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f7986h;

    public class a implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MaterialCalendarGridView f7987a;

        public a(MaterialCalendarGridView materialCalendarGridView) {
            this.f7987a = materialCalendarGridView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            if (this.f7987a.getAdapter().r(i10)) {
                k.this.f7985g.a(this.f7987a.getAdapter().getItem(i10).longValue());
            }
        }
    }

    public static class b extends RecyclerView.f0 {

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final TextView f7988u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final MaterialCalendarGridView f7989v;

        public b(@NonNull LinearLayout linearLayout, boolean z10) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(ic.f.f20703w);
            this.f7988u = textView;
            o0.n0(textView, true);
            this.f7989v = (MaterialCalendarGridView) linearLayout.findViewById(ic.f.f20699s);
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
        this.f7986h = (j.f7975g * e.q2(context)) + (g.J2(context) ? e.q2(context) : 0);
        this.f7982d = calendarConstraints;
        this.f7983e = dateSelector;
        this.f7984f = dayViewDecorator;
        this.f7985g = mVar;
        A(true);
    }

    @NonNull
    public Month D(int i10) {
        return this.f7982d.r().w(i10);
    }

    @NonNull
    public CharSequence E(int i10) {
        return D(i10).u();
    }

    public int F(@NonNull Month month) {
        return this.f7982d.r().y(month);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void r(@NonNull b bVar, int i10) {
        Month monthW = this.f7982d.r().w(i10);
        bVar.f7988u.setText(monthW.u());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.f7989v.findViewById(ic.f.f20699s);
        if (materialCalendarGridView.getAdapter() == null || !monthW.equals(materialCalendarGridView.getAdapter().f7977a)) {
            j jVar = new j(monthW, this.f7983e, this.f7982d, this.f7984f);
            materialCalendarGridView.setNumColumns(monthW.f7907d);
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
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(ic.h.f20724q, viewGroup, false);
        if (!g.J2(viewGroup.getContext())) {
            return new b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.r(-1, this.f7986h));
        return new b(linearLayout, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        return this.f7982d.p();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long f(int i10) {
        return this.f7982d.r().w(i10).v();
    }
}
