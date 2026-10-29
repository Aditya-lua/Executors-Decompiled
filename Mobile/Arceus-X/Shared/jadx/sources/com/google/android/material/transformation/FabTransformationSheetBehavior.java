package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C0625o0;
import java.util.HashMap;
import java.util.Map;
import p194ic.C6737a;
import p216jc.C7144h;
import p216jc.C7146j;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* JADX INFO: renamed from: i */
    public Map<View, Integer> f10763i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FabTransformationSheetBehavior() {
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    /* JADX INFO: renamed from: L */
    public boolean mo13318L(@NonNull View view, @NonNull View view2, boolean z10, boolean z11) {
        m13344k0(view2, z10);
        return super.mo13318L(view, view2, z10, z11);
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    @NonNull
    /* JADX INFO: renamed from: i0 */
    public FabTransformationBehavior.C2886e mo13341i0(Context context, boolean z10) {
        int i10 = z10 ? C6737a.f25858d : C6737a.f25857c;
        FabTransformationBehavior.C2886e c2886e = new FabTransformationBehavior.C2886e();
        c2886e.f10756a = C7144h.m29933c(context, i10);
        c2886e.f10757b = new C7146j(17, 0.0f, 0.0f);
        return c2886e;
    }

    /* JADX INFO: renamed from: k0 */
    public final void m13344k0(@NonNull View view, boolean z10) {
        ViewParent parent = view.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z10) {
                this.f10763i = new HashMap(childCount);
            }
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                boolean z11 = (childAt.getLayoutParams() instanceof CoordinatorLayout.C0527f) && (((CoordinatorLayout.C0527f) childAt.getLayoutParams()).m2632f() instanceof FabTransformationScrimBehavior);
                if (childAt != view && !z11) {
                    if (z10) {
                        this.f10763i.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        C0625o0.m3060w0(childAt, 4);
                    } else {
                        Map<View, Integer> map = this.f10763i;
                        if (map != null && map.containsKey(childAt)) {
                            C0625o0.m3060w0(childAt, this.f10763i.get(childAt).intValue());
                        }
                    }
                }
            }
            if (z10) {
                return;
            }
            this.f10763i = null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
