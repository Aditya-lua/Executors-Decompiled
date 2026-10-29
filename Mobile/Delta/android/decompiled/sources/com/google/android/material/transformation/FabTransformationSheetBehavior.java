package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.o0;
import hc.a;
import ic.h;
import ic.j;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Map<View, Integer> f8375i;

    public FabTransformationSheetBehavior() {
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    public boolean L(@NonNull View view, @NonNull View view2, boolean z10, boolean z11) {
        k0(view2, z10);
        return super.L(view, view2, z10, z11);
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    @NonNull
    public FabTransformationBehavior.e i0(Context context, boolean z10) {
        int i10 = z10 ? a.f18767d : a.f18766c;
        FabTransformationBehavior.e eVar = new FabTransformationBehavior.e();
        eVar.f8370a = h.c(context, i10);
        eVar.b = new j(17, 0.0f, 0.0f);
        return eVar;
    }

    public final void k0(@NonNull View view, boolean z10) {
        ViewParent parent = view.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z10) {
                this.f8375i = new HashMap(childCount);
            }
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                boolean z11 = (childAt.getLayoutParams() instanceof CoordinatorLayout.f) && (((CoordinatorLayout.f) childAt.getLayoutParams()).f() instanceof FabTransformationScrimBehavior);
                if (childAt != view && !z11) {
                    if (z10) {
                        this.f8375i.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        o0.w0(childAt, 4);
                    } else {
                        Map<View, Integer> map = this.f8375i;
                        if (map != null && map.containsKey(childAt)) {
                            o0.w0(childAt, this.f8375i.get(childAt).intValue());
                        }
                    }
                }
            }
            if (z10) {
                return;
            }
            this.f8375i = null;
        }
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
