package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import java.util.Collection;

/* JADX INFO: loaded from: classes2.dex */
public interface DateSelector<S> extends Parcelable {
    boolean L2();

    @NonNull
    String M1(Context context);

    @NonNull
    String N0(@NonNull Context context);

    @NonNull
    Collection<x2.c<Long, Long>> R1();

    @NonNull
    Collection<Long> S2();

    int T0(Context context);

    S Z2();

    void f3(long j10);

    @NonNull
    View v2(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, @NonNull CalendarConstraints calendarConstraints, @NonNull l<S> lVar);
}
