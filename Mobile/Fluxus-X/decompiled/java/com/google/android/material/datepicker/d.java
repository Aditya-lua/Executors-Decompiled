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
public interface d<S> extends Parcelable {
    @NonNull
    String O0(@NonNull Context context);

    @NonNull
    String O1(Context context);

    boolean O2();

    int U0(Context context);

    @NonNull
    Collection<x2.c<Long, Long>> U1();

    @NonNull
    Collection<Long> W2();

    S d3();

    void m3(long j10);

    @NonNull
    View y2(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, @NonNull a aVar, @NonNull q<S> qVar);
}
