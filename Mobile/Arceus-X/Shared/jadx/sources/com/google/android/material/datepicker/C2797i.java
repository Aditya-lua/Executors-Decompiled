package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.material.datepicker.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C2797i<S> extends AbstractC2801m<S> {

    /* JADX INFO: renamed from: g0 */
    public int f10138g0;

    /* JADX INFO: renamed from: h0 */
    public DateSelector<S> f10139h0;

    /* JADX INFO: renamed from: i0 */
    public CalendarConstraints f10140i0;

    /* JADX INFO: renamed from: com.google.android.material.datepicker.i$a */
    public class a extends AbstractC2800l<S> {
        public a() {
        }

        @Override // com.google.android.material.datepicker.AbstractC2800l
        /* JADX INFO: renamed from: a */
        public void mo12673a(S s8) {
            Iterator<AbstractC2800l<S>> it = C2797i.this.f10159f0.iterator();
            while (it.hasNext()) {
                it.next().mo12673a(s8);
            }
        }
    }

    @NonNull
    /* JADX INFO: renamed from: d2 */
    public static <T> C2797i<T> m12675d2(DateSelector<T> dateSelector, int i10, @NonNull CalendarConstraints calendarConstraints) {
        C2797i<T> c2797i = new C2797i<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i10);
        bundle.putParcelable("DATE_SELECTOR_KEY", dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        c2797i.m4625O1(bundle);
        return c2797i;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: F0 */
    public void mo4599F0(Bundle bundle) {
        super.mo4599F0(bundle);
        if (bundle == null) {
            bundle = m4704t();
        }
        this.f10138g0 = bundle.getInt("THEME_RES_ID_KEY");
        this.f10139h0 = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f10140i0 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0929c
    @NonNull
    /* JADX INFO: renamed from: J0 */
    public View mo1225J0(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f10139h0.m12580v2(layoutInflater.cloneInContext(new ContextThemeWrapper(mo4715x(), this.f10138g0)), viewGroup, bundle, this.f10140i0, new a());
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: b1 */
    public void mo4661b1(@NonNull Bundle bundle) {
        super.mo4661b1(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f10138g0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f10139h0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f10140i0);
    }
}
