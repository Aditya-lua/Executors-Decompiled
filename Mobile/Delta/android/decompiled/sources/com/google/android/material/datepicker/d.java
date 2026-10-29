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
public class d extends BaseAdapter {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f7849d = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final Calendar f7850a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7851c;

    public d() {
        Calendar calendarI = p.i();
        this.f7850a = calendarI;
        this.b = calendarI.getMaximum(7);
        this.f7851c = calendarI.getFirstDayOfWeek();
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
        int i11 = i10 + this.f7851c;
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
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(hc.h.f18900o, viewGroup, false);
        }
        this.f7850a.set(7, b(i10));
        textView.setText(this.f7850a.getDisplayName(7, f7849d, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(hc.i.f18919l), this.f7850a.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public d(int i10) {
        Calendar calendarI = p.i();
        this.f7850a = calendarI;
        this.b = calendarI.getMaximum(7);
        this.f7851c = i10;
    }
}
