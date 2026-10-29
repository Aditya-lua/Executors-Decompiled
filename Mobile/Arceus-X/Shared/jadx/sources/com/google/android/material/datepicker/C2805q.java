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
import p194ic.C6744h;

/* JADX INFO: renamed from: com.google.android.material.datepicker.q */
/* JADX INFO: loaded from: classes2.dex */
public class C2805q extends RecyclerView.AbstractC1025h<b> {

    /* JADX INFO: renamed from: d */
    public final C2793e<?> f10165d;

    /* JADX INFO: renamed from: com.google.android.material.datepicker.q$a */
    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f10166a;

        public a(int i10) {
            this.f10166a = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C2805q.this.f10165d.m12645v2(C2805q.this.f10165d.m12639m2().m12559k(Month.m12597j(this.f10166a, C2805q.this.f10165d.m12641o2().f10034b)));
            C2805q.this.f10165d.m12646w2(C2793e.l.DAY);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.q$b */
    public static class b extends RecyclerView.AbstractC1023f0 {

        /* JADX INFO: renamed from: u */
        public final TextView f10168u;

        public b(TextView textView) {
            super(textView);
            this.f10168u = textView;
        }
    }

    public C2805q(C2793e<?> c2793e) {
        this.f10165d = c2793e;
    }

    @NonNull
    /* JADX INFO: renamed from: D */
    public final View.OnClickListener m12717D(int i10) {
        return new a(i10);
    }

    /* JADX INFO: renamed from: E */
    public int m12718E(int i10) {
        return i10 - this.f10165d.m12639m2().m12565r().f10035c;
    }

    /* JADX INFO: renamed from: F */
    public int m12719F(int i10) {
        return this.f10165d.m12639m2().m12565r().f10035c + i10;
    }

    /* JADX DEBUG: Method merged with bridge method: r(Landroidx/recyclerview/widget/RecyclerView$f0;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1025h
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void mo5486r(@NonNull b bVar, int i10) {
        int iM12719F = m12719F(i10);
        bVar.f10168u.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(iM12719F)));
        TextView textView = bVar.f10168u;
        textView.setContentDescription(C2791c.m12619e(textView.getContext(), iM12719F));
        C2790b c2790bM12640n2 = this.f10165d.m12640n2();
        Calendar calendarM12710g = C2804p.m12710g();
        C2789a c2789a = calendarM12710g.get(1) == iM12719F ? c2790bM12640n2.f10051f : c2790bM12640n2.f10049d;
        Iterator<Long> it = this.f10165d.m12642p2().m12576S2().iterator();
        while (it.hasNext()) {
            calendarM12710g.setTimeInMillis(it.next().longValue());
            if (calendarM12710g.get(1) == iM12719F) {
                c2789a = c2790bM12640n2.f10050e;
            }
        }
        c2789a.m12613d(bVar.f10168u);
        bVar.f10168u.setOnClickListener(m12717D(iM12719F));
    }

    /* JADX DEBUG: Method merged with bridge method: t(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$f0; */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1025h
    @NonNull
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public b mo5488t(@NonNull ViewGroup viewGroup, int i10) {
        return new b((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C6744h.f26077s, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1025h
    /* JADX INFO: renamed from: e */
    public int mo5473e() {
        return this.f10165d.m12639m2().m12566s();
    }
}
