package com.google.android.material.datepicker;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class h extends BaseAdapter {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f7761d = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final Calendar f7762a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7763c;

    public h() {
        Calendar calendarI = u.i();
        this.f7762a = calendarI;
        this.b = calendarI.getMaximum(7);
        this.f7763c = calendarI.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer getItem(int i10) {
        if (i10 >= this.b) {
            return null;
        }
        return Integer.valueOf(b(i10));
    }

    public final int b(int i10) {
        int i11 = i10 + this.f7763c;
        int i12 = this.b;
        return i11 > i12 ? i11 - i12 : i11;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.b;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return 0L;
    }

    @Override // android.widget.Adapter
    @SuppressLint({"WrongConstant"})
    public View getView(int i10, View view, @NonNull ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(jc.h.f20410o, viewGroup, false);
        }
        this.f7762a.set(7, b(i10));
        textView.setText(this.f7762a.getDisplayName(7, f7761d, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(jc.i.f20429l), this.f7762a.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public h(int i10) {
        Calendar calendarI = u.i();
        this.f7762a = calendarI;
        this.b = calendarI.getMaximum(7);
        this.f7763c = i10;
    }
}
