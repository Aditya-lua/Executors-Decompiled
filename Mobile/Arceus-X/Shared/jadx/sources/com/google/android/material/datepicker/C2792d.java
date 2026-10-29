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
import p194ic.C6744h;
import p194ic.C6745i;

/* JADX INFO: renamed from: com.google.android.material.datepicker.d */
/* JADX INFO: loaded from: classes2.dex */
public class C2792d extends BaseAdapter {

    /* JADX INFO: renamed from: d */
    public static final int f10054d = 4;

    /* JADX INFO: renamed from: a */
    @NonNull
    public final Calendar f10055a;

    /* JADX INFO: renamed from: b */
    public final int f10056b;

    /* JADX INFO: renamed from: c */
    public final int f10057c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2792d() {
        Calendar calendarM12712i = C2804p.m12712i();
        this.f10055a = calendarM12712i;
        this.f10056b = calendarM12712i.getMaximum(7);
        this.f10057c = calendarM12712i.getFirstDayOfWeek();
    }

    /* JADX DEBUG: Method merged with bridge method: getItem(I)Ljava/lang/Object; */
    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer getItem(int i10) {
        if (i10 >= this.f10056b) {
            return null;
        }
        return Integer.valueOf(m12625b(i10));
    }

    /* JADX INFO: renamed from: b */
    public final int m12625b(int i10) {
        int i11 = i10 + this.f10057c;
        int i12 = this.f10056b;
        return i11 > i12 ? i11 - i12 : i11;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f10056b;
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
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C6744h.f26073o, viewGroup, false);
        }
        this.f10055a.set(7, m12625b(i10));
        textView.setText(this.f10055a.getDisplayName(7, f10054d, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(C6745i.f26093l), this.f10055a.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public C2792d(int i10) {
        Calendar calendarM12712i = C2804p.m12712i();
        this.f10055a = calendarM12712i;
        this.f10056b = calendarM12712i.getMaximum(7);
        this.f10057c = i10;
    }
}
