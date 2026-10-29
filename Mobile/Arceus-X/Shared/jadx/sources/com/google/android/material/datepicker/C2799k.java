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
import androidx.core.view.C0625o0;
import androidx.recyclerview.widget.RecyclerView;
import p194ic.C6742f;
import p194ic.C6744h;

/* JADX INFO: renamed from: com.google.android.material.datepicker.k */
/* JADX INFO: loaded from: classes2.dex */
public class C2799k extends RecyclerView.AbstractC1025h<b> {

    /* JADX INFO: renamed from: d */
    @NonNull
    public final CalendarConstraints f10150d;

    /* JADX INFO: renamed from: e */
    public final DateSelector<?> f10151e;

    /* JADX INFO: renamed from: f */
    public final DayViewDecorator f10152f;

    /* JADX INFO: renamed from: g */
    public final C2793e.m f10153g;

    /* JADX INFO: renamed from: h */
    public final int f10154h;

    /* JADX INFO: renamed from: com.google.android.material.datepicker.k$a */
    public class a implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MaterialCalendarGridView f10155a;

        public a(MaterialCalendarGridView materialCalendarGridView) {
            this.f10155a = materialCalendarGridView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            if (this.f10155a.getAdapter().m12693r(i10)) {
                C2799k.this.f10153g.mo12649a(this.f10155a.getAdapter().getItem(i10).longValue());
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.k$b */
    public static class b extends RecyclerView.AbstractC1023f0 {

        /* JADX INFO: renamed from: u */
        public final TextView f10157u;

        /* JADX INFO: renamed from: v */
        public final MaterialCalendarGridView f10158v;

        public b(@NonNull LinearLayout linearLayout, boolean z10) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(C6742f.f26052w);
            this.f10157u = textView;
            C0625o0.m3042n0(textView, true);
            this.f10158v = (MaterialCalendarGridView) linearLayout.findViewById(C6742f.f26048s);
            if (z10) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    public C2799k(@NonNull Context context, DateSelector<?> dateSelector, @NonNull CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator, C2793e.m mVar) {
        Month monthM12565r = calendarConstraints.m12565r();
        Month monthM12561n = calendarConstraints.m12561n();
        Month monthM12564q = calendarConstraints.m12564q();
        if (monthM12565r.compareTo(monthM12564q) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (monthM12564q.compareTo(monthM12561n) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f10154h = (C2798j.f10142g * C2793e.m12633q2(context)) + (C2795g.m12653J2(context) ? C2793e.m12633q2(context) : 0);
        this.f10150d = calendarConstraints;
        this.f10151e = dateSelector;
        this.f10152f = dayViewDecorator;
        this.f10153g = mVar;
        m5467A(true);
    }

    @NonNull
    /* JADX INFO: renamed from: D */
    public Month m12695D(int i10) {
        return this.f10150d.m12565r().m12606w(i10);
    }

    @NonNull
    /* JADX INFO: renamed from: E */
    public CharSequence m12696E(int i10) {
        return m12695D(i10).m12604u();
    }

    /* JADX INFO: renamed from: F */
    public int m12697F(@NonNull Month month) {
        return this.f10150d.m12565r().m12607x(month);
    }

    /* JADX DEBUG: Method merged with bridge method: r(Landroidx/recyclerview/widget/RecyclerView$f0;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1025h
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void mo5486r(@NonNull b bVar, int i10) {
        Month monthM12606w = this.f10150d.m12565r().m12606w(i10);
        bVar.f10157u.setText(monthM12606w.m12604u());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.f10158v.findViewById(C6742f.f26048s);
        if (materialCalendarGridView.getAdapter() == null || !monthM12606w.equals(materialCalendarGridView.getAdapter().f10144a)) {
            C2798j c2798j = new C2798j(monthM12606w, this.f10151e, this.f10150d, this.f10152f);
            materialCalendarGridView.setNumColumns(monthM12606w.f10036d);
            materialCalendarGridView.setAdapter((ListAdapter) c2798j);
        } else {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter().m12692q(materialCalendarGridView);
        }
        materialCalendarGridView.setOnItemClickListener(new a(materialCalendarGridView));
    }

    /* JADX DEBUG: Method merged with bridge method: t(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$f0; */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1025h
    @NonNull
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public b mo5488t(@NonNull ViewGroup viewGroup, int i10) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C6744h.f26075q, viewGroup, false);
        if (!C2795g.m12653J2(viewGroup.getContext())) {
            return new b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.C1035r(-1, this.f10154h));
        return new b(linearLayout, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1025h
    /* JADX INFO: renamed from: e */
    public int mo5473e() {
        return this.f10150d.m12563p();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1025h
    /* JADX INFO: renamed from: f */
    public long mo5474f(int i10) {
        return this.f10150d.m12565r().m12606w(i10).m12605v();
    }
}
