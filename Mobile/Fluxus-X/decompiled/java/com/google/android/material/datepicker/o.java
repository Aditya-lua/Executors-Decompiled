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
public class o extends BaseAdapter {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f7819g = u.i().getMaximum(4);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f7820h = (u.i().getMaximum(5) + u.i().getMaximum(7)) - 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f7821a;
    public final d<?> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Collection<Long> f7822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f7823d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f7824e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g f7825f;

    public o(n nVar, d<?> dVar, a aVar, g gVar) {
        this.f7821a = nVar;
        this.b = dVar;
        this.f7824e = aVar;
        this.f7825f = gVar;
        this.f7822c = dVar.W2();
    }

    public int a(int i10) {
        return b() + (i10 - 1);
    }

    public int b() {
        return this.f7821a.q(this.f7824e.o());
    }

    public final String c(Context context, long j10) {
        return e.a(context, j10, l(j10), k(j10), g(j10));
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Long getItem(int i10) {
        if (i10 < b() || i10 > m()) {
            return null;
        }
        return Long.valueOf(this.f7821a.r(n(i10)));
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
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(jc.h.f20409n, viewGroup, false);
        }
        int iB = i10 - b();
        if (iB >= 0) {
            n nVar = this.f7821a;
            if (iB >= nVar.f7816e) {
                textView.setVisibility(8);
                textView.setEnabled(false);
                i11 = -1;
            } else {
                i11 = iB + 1;
                textView.setTag(nVar);
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
        if (this.f7823d == null) {
            this.f7823d = new c(context);
        }
    }

    public boolean g(long j10) {
        Iterator<x2.c<Long, Long>> it = this.b.U1().iterator();
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
        return f7820h;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10 / this.f7821a.f7815d;
    }

    public boolean h(int i10) {
        return i10 % this.f7821a.f7815d == 0;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    public boolean i(int i10) {
        return (i10 + 1) % this.f7821a.f7815d == 0;
    }

    public final boolean j(long j10) {
        Iterator<Long> it = this.b.W2().iterator();
        while (it.hasNext()) {
            if (u.a(j10) == u.a(it.next().longValue())) {
                return true;
            }
        }
        return false;
    }

    public boolean k(long j10) {
        Iterator<x2.c<Long, Long>> it = this.b.U1().iterator();
        while (it.hasNext()) {
            Long l10 = it.next().f36145a;
            if (l10 != null && l10.longValue() == j10) {
                return true;
            }
        }
        return false;
    }

    public final boolean l(long j10) {
        return u.g().getTimeInMillis() == j10;
    }

    public int m() {
        return (b() + this.f7821a.f7816e) - 1;
    }

    public int n(int i10) {
        return (i10 - b()) + 1;
    }

    public final void o(TextView textView, long j10, int i10) {
        boolean zJ;
        b bVar;
        if (textView == null) {
            return;
        }
        Context context = textView.getContext();
        String strC = c(context, j10);
        textView.setContentDescription(strC);
        boolean zX0 = this.f7824e.l().X0(j10);
        if (zX0) {
            textView.setEnabled(true);
            zJ = j(j10);
            textView.setSelected(zJ);
            if (zJ) {
                bVar = this.f7823d.b;
            } else {
                bVar = l(j10) ? this.f7823d.f7754c : this.f7823d.f7753a;
            }
        } else {
            zJ = false;
            textView.setEnabled(false);
            bVar = this.f7823d.f7758g;
        }
        boolean z10 = zJ;
        g gVar = this.f7825f;
        if (gVar == null || i10 == -1) {
            bVar.d(textView);
            return;
        }
        n nVar = this.f7821a;
        int i11 = nVar.f7814c;
        int i12 = nVar.b;
        bVar.e(textView, gVar.a(context, i11, i12, i10, zX0, z10), this.f7825f.l(context, i11, i12, i10, zX0, z10));
        textView.setCompoundDrawables(this.f7825f.g(context, i11, i12, i10, zX0, z10), this.f7825f.j(context, i11, i12, i10, zX0, z10), this.f7825f.i(context, i11, i12, i10, zX0, z10), this.f7825f.f(context, i11, i12, i10, zX0, z10));
        textView.setContentDescription(this.f7825f.k(context, i11, i12, i10, zX0, z10, strC));
    }

    public final void p(MaterialCalendarGridView materialCalendarGridView, long j10) {
        if (n.o(j10).equals(this.f7821a)) {
            int iS = this.f7821a.s(j10);
            o((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().a(iS) - materialCalendarGridView.getFirstVisiblePosition()), j10, iS);
        }
    }

    public void q(MaterialCalendarGridView materialCalendarGridView) {
        Iterator<Long> it = this.f7822c.iterator();
        while (it.hasNext()) {
            p(materialCalendarGridView, it.next().longValue());
        }
        d<?> dVar = this.b;
        if (dVar != null) {
            Iterator<Long> it2 = dVar.W2().iterator();
            while (it2.hasNext()) {
                p(materialCalendarGridView, it2.next().longValue());
            }
            this.f7822c = this.b.W2();
        }
    }

    public boolean r(int i10) {
        return i10 >= b() && i10 <= m();
    }
}
