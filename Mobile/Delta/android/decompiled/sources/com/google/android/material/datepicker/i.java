package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class i<S> extends m<S> {

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f7897g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public DateSelector<S> f7898h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public CalendarConstraints f7899i0;

    public class a extends l<S> {
        public a() {
        }

        @Override // com.google.android.material.datepicker.l
        public void a(S s8) {
            Iterator<l<S>> it = i.this.f7916f0.iterator();
            while (it.hasNext()) {
                it.next().a(s8);
            }
        }
    }

    @NonNull
    public static <T> i<T> d2(DateSelector<T> dateSelector, int i10, @NonNull CalendarConstraints calendarConstraints) {
        i<T> iVar = new i<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i10);
        bundle.putParcelable("DATE_SELECTOR_KEY", dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        iVar.O1(bundle);
        return iVar;
    }

    @Override // androidx.fragment.app.c
    public void F0(Bundle bundle) {
        super.F0(bundle);
        if (bundle == null) {
            bundle = t();
        }
        this.f7897g0 = bundle.getInt("THEME_RES_ID_KEY");
        this.f7898h0 = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f7899i0 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.c
    @NonNull
    public View J0(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f7898h0.v2(layoutInflater.cloneInContext(new ContextThemeWrapper(x(), this.f7897g0)), viewGroup, bundle, this.f7899i0, new a());
    }

    @Override // androidx.fragment.app.c
    public void b1(@NonNull Bundle bundle) {
        super.b1(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f7897g0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f7898h0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f7899i0);
    }
}
