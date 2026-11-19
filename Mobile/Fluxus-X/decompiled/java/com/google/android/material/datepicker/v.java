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
public class v extends RecyclerView.h<b> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i<?> f7839d;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f7840a;

        public a(int i10) {
            this.f7840a = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            v.this.f7839d.v2(v.this.f7839d.m2().k(n.k(this.f7840a, v.this.f7839d.o2().b)));
            v.this.f7839d.w2(i.l.DAY);
        }
    }

    public static class b extends RecyclerView.g0 {

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final TextView f7841u;

        public b(TextView textView) {
            super(textView);
            this.f7841u = textView;
        }
    }

    public v(i<?> iVar) {
        this.f7839d = iVar;
    }

    @NonNull
    public final View.OnClickListener D(int i10) {
        return new a(i10);
    }

    public int E(int i10) {
        return i10 - this.f7839d.m2().r().f7814c;
    }

    public int F(int i10) {
        return this.f7839d.m2().r().f7814c + i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void r(@NonNull b bVar, int i10) {
        int iF = F(i10);
        bVar.f7841u.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(iF)));
        TextView textView = bVar.f7841u;
        textView.setContentDescription(e.e(textView.getContext(), iF));
        c cVarN2 = this.f7839d.n2();
        Calendar calendarG = u.g();
        com.google.android.material.datepicker.b bVar2 = calendarG.get(1) == iF ? cVarN2.f7757f : cVarN2.f7755d;
        Iterator<Long> it = this.f7839d.p2().W2().iterator();
        while (it.hasNext()) {
            calendarG.setTimeInMillis(it.next().longValue());
            if (calendarG.get(1) == iF) {
                bVar2 = cVarN2.f7756e;
            }
        }
        bVar2.d(bVar.f7841u);
        bVar.f7841u.setOnClickListener(D(iF));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NonNull
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public b t(@NonNull ViewGroup viewGroup, int i10) {
        return new b((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(jc.h.f20414s, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        return this.f7839d.m2().s();
    }
}
