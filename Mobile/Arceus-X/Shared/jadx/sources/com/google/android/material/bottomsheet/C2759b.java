package com.google.android.material.bottomsheet;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import p203j.C7003m;

/* JADX INFO: renamed from: com.google.android.material.bottomsheet.b */
/* JADX INFO: loaded from: classes2.dex */
public class C2759b extends C7003m {

    /* JADX INFO: renamed from: v0 */
    public boolean f9800v0;

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.b$b */
    public class b extends BottomSheetBehavior.AbstractC2756g {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public b() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC2756g
        /* JADX INFO: renamed from: b */
        public void mo12170b(@NonNull View view, float f10) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC2756g
        /* JADX INFO: renamed from: c */
        public void mo12171c(@NonNull View view, int i10) {
            if (i10 == 5) {
                C2759b.this.m12191v2();
            }
        }
    }

    @Override // p093e4.DialogInterfaceOnCancelListenerC4819k
    /* JADX INFO: renamed from: e2 */
    public void mo12190e2() {
        if (m12193x2(false)) {
            return;
        }
        super.mo12190e2();
    }

    @Override // p203j.C7003m, p093e4.DialogInterfaceOnCancelListenerC4819k
    @NonNull
    /* JADX INFO: renamed from: k2 */
    public Dialog mo6459k2(Bundle bundle) {
        return new DialogC2758a(mo4715x(), m23330j2());
    }

    /* JADX INFO: renamed from: v2 */
    public final void m12191v2() {
        if (this.f9800v0) {
            super.m23326f2();
        } else {
            super.mo12190e2();
        }
    }

    /* JADX INFO: renamed from: w2 */
    public final void m12192w2(@NonNull BottomSheetBehavior<?> bottomSheetBehavior, boolean z10) {
        this.f9800v0 = z10;
        if (bottomSheetBehavior.m12159v0() == 5) {
            m12191v2();
            return;
        }
        if (m23328h2() instanceof DialogC2758a) {
            ((DialogC2758a) m23328h2()).m12185y();
        }
        bottomSheetBehavior.m12131c0(new b());
        bottomSheetBehavior.m12125X0(5);
    }

    /* JADX INFO: renamed from: x2 */
    public final boolean m12193x2(boolean z10) {
        Dialog dialogM23328h2 = m23328h2();
        if (!(dialogM23328h2 instanceof DialogC2758a)) {
            return false;
        }
        DialogC2758a dialogC2758a = (DialogC2758a) dialogM23328h2;
        BottomSheetBehavior<FrameLayout> bottomSheetBehaviorM12183v = dialogC2758a.m12183v();
        if (!bottomSheetBehaviorM12183v.m12104B0() || !dialogC2758a.m12184w()) {
            return false;
        }
        m12192w2(bottomSheetBehaviorM12183v, z10);
        return true;
    }
}
