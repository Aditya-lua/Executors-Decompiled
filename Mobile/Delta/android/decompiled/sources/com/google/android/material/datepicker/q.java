package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class q extends RecyclerView.h<b> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e<?> f7995d;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f7996a;

        public a(int i10) {
            this.f7996a = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            q.this.f7995d.v2(q.this.f7995d.m2().k(Month.j(this.f7996a, q.this.f7995d.o2().b)));
            q.this.f7995d.w2(e.l.DAY);
        }
    }

    public static class b extends RecyclerView.f0 {

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final TextView f7997u;

        public b(TextView textView) {
            super(textView);
            this.f7997u = textView;
        }
    }

    public q(e<?> eVar) {
        this.f7995d = eVar;
    }

    @NonNull
    public final View.OnClickListener D(int i10) {
        return new a(i10);
    }

    public int E(int i10) {
        return i10 - this.f7995d.m2().r().f7906c;
    }

    public int F(int i10) {
        return this.f7995d.m2().r().f7906c + i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void r(@NonNull b bVar, int i10) {
        int iF = F(i10);
        bVar.f7997u.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(iF)));
        TextView textView = bVar.f7997u;
        textView.setContentDescription(c.e(textView.getContext(), iF));
        com.google.android.material.datepicker.b bVarN2 = this.f7995d.n2();
        Calendar calendarG = p.g();
        com.google.android.material.datepicker.a aVar = calendarG.get(1) == iF ? bVarN2.f7920f : bVarN2.f7918d;
        Iterator<Long> it = this.f7995d.p2().R2().iterator();
        while (it.hasNext()) {
            calendarG.setTimeInMillis(it.next().longValue());
            if (calendarG.get(1) == iF) {
                aVar = bVarN2.f7919e;
            }
        }
        aVar.d(bVar.f7997u);
        bVar.f7997u.setOnClickListener(D(iF));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NonNull
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public b t(@NonNull ViewGroup viewGroup, int i10) {
        return new b((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(ic.h.f20726s, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        return this.f7995d.m2().s();
    }
}
