package com.google.android.material.datepicker;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.C1061l;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: com.google.android.material.datepicker.n */
/* JADX INFO: loaded from: classes2.dex */
public class C2802n extends LinearLayoutManager {

    /* JADX INFO: renamed from: com.google.android.material.datepicker.n$a */
    public class a extends C1061l {
        public a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.C1061l
        /* JADX INFO: renamed from: v */
        public float mo5993v(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }
    }

    public C2802n(Context context, int i10, boolean z10) {
        super(context, i10, z10);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: N1 */
    public void mo5163N1(RecyclerView recyclerView, RecyclerView.C1015b0 c1015b0, int i10) {
        a aVar = new a(recyclerView.getContext());
        aVar.m5383p(i10);
        m5575O1(aVar);
    }
}
