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
public class p extends RecyclerView.h<b> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final com.google.android.material.datepicker.a f7826d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d<?> f7827e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g f7828f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i.m f7829g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f7830h;

    public class a implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MaterialCalendarGridView f7831a;

        public a(MaterialCalendarGridView materialCalendarGridView) {
            this.f7831a = materialCalendarGridView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            if (this.f7831a.getAdapter().r(i10)) {
                p.this.f7829g.a(this.f7831a.getAdapter().getItem(i10).longValue());
            }
        }
    }

    public static class b extends RecyclerView.g0 {

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final TextView f7832u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final MaterialCalendarGridView f7833v;

        public b(@NonNull LinearLayout linearLayout, boolean z10) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(jc.f.f20391w);
            this.f7832u = textView;
            o0.n0(textView, true);
            this.f7833v = (MaterialCalendarGridView) linearLayout.findViewById(jc.f.f20387s);
            if (z10) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    public p(@NonNull Context context, d<?> dVar, @NonNull com.google.android.material.datepicker.a aVar, g gVar, i.m mVar) {
        n nVarR = aVar.r();
        n nVarN = aVar.n();
        n nVarQ = aVar.q();
        if (nVarR.compareTo(nVarQ) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (nVarQ.compareTo(nVarN) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f7830h = (o.f7819g * i.q2(context)) + (k.J2(context) ? i.q2(context) : 0);
        this.f7826d = aVar;
        this.f7827e = dVar;
        this.f7828f = gVar;
        this.f7829g = mVar;
        A(true);
    }

    @NonNull
    public n D(int i10) {
        return this.f7826d.r().w(i10);
    }

    @NonNull
    public CharSequence E(int i10) {
        return D(i10).u();
    }

    public int F(@NonNull n nVar) {
        return this.f7826d.r().x(nVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void r(@NonNull b bVar, int i10) {
        n nVarW = this.f7826d.r().w(i10);
        bVar.f7832u.setText(nVarW.u());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.f7833v.findViewById(jc.f.f20387s);
        if (materialCalendarGridView.getAdapter() == null || !nVarW.equals(materialCalendarGridView.getAdapter().f7821a)) {
            o oVar = new o(nVarW, this.f7827e, this.f7826d, this.f7828f);
            materialCalendarGridView.setNumColumns(nVarW.f7815d);
            materialCalendarGridView.setAdapter((ListAdapter) oVar);
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
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(jc.h.f20412q, viewGroup, false);
        if (!k.J2(viewGroup.getContext())) {
            return new b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.r(-1, this.f7830h));
        return new b(linearLayout, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        return this.f7826d.p();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long f(int i10) {
        return this.f7826d.r().w(i10).v();
    }
}
