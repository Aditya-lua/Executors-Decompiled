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
    @NonNull
    String J0(@NonNull Context context);

    boolean K2();

    @NonNull
    String L1(Context context);

    int P0(Context context);

    @NonNull
    Collection<x2.c<Long, Long>> Q1();

    @NonNull
    Collection<Long> R2();

    S Y2();

    void h3(long j10);

    @NonNull
    View w2(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, @NonNull CalendarConstraints calendarConstraints, @NonNull l<S> lVar);
}
