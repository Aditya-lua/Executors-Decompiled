package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class m<S> extends r<S> {

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f7809g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public d<S> f7810h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public com.google.android.material.datepicker.a f7811i0;

    public class a extends q<S> {
        public a() {
        }

        @Override // com.google.android.material.datepicker.q
        public void a(S s8) {
            Iterator<q<S>> it = m.this.f7834f0.iterator();
            while (it.hasNext()) {
                it.next().a(s8);
            }
        }
    }

    @NonNull
    public static <T> m<T> d2(d<T> dVar, int i10, @NonNull com.google.android.material.datepicker.a aVar) {
        m<T> mVar = new m<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i10);
        bundle.putParcelable("DATE_SELECTOR_KEY", dVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        mVar.O1(bundle);
        return mVar;
    }

    @Override // f4.q
    public void F0(Bundle bundle) {
        super.F0(bundle);
        if (bundle == null) {
            bundle = t();
        }
        this.f7809g0 = bundle.getInt("THEME_RES_ID_KEY");
        this.f7810h0 = (d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f7811i0 = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // f4.q
    @NonNull
    public View J0(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f7810h0.y2(layoutInflater.cloneInContext(new ContextThemeWrapper(v(), this.f7809g0)), viewGroup, bundle, this.f7811i0, new a());
    }

    @Override // f4.q
    public void b1(@NonNull Bundle bundle) {
        super.b1(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f7809g0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f7810h0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f7811i0);
    }
}
