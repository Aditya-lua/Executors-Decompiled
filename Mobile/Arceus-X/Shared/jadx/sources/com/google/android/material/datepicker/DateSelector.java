package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import java.util.Collection;
import p533x2.C12633c;

/* JADX INFO: loaded from: classes2.dex */
public interface DateSelector<S> extends Parcelable {
    /* JADX INFO: renamed from: L2 */
    boolean m12572L2();

    @NonNull
    /* JADX INFO: renamed from: M1 */
    String m12573M1(Context context);

    @NonNull
    /* JADX INFO: renamed from: N0 */
    String m12574N0(@NonNull Context context);

    @NonNull
    /* JADX INFO: renamed from: R1 */
    Collection<C12633c<Long, Long>> m12575R1();

    @NonNull
    /* JADX INFO: renamed from: S2 */
    Collection<Long> m12576S2();

    /* JADX INFO: renamed from: T0 */
    int m12577T0(Context context);

    /* JADX INFO: renamed from: Z2 */
    S m12578Z2();

    /* JADX INFO: renamed from: f3 */
    void m12579f3(long j10);

    @NonNull
    /* JADX INFO: renamed from: v2 */
    View m12580v2(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, @NonNull CalendarConstraints calendarConstraints, @NonNull AbstractC2800l<S> abstractC2800l);
}
