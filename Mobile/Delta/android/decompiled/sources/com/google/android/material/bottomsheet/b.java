package com.google.android.material.bottomsheet;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import j.m;

/* JADX INFO: loaded from: classes2.dex */
public class b extends m {

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public boolean f7658v0;

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.b$b, reason: collision with other inner class name */
    public class C0117b extends BottomSheetBehavior.g {
        public C0117b() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void b(@NonNull View view, float f10) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void c(@NonNull View view, int i10) {
            if (i10 == 5) {
                b.this.v2();
            }
        }
    }

    @Override // e4.k
    public void e2() {
        if (x2(false)) {
            return;
        }
        super.e2();
    }

    @Override // j.m, e4.k
    @NonNull
    public Dialog k2(Bundle bundle) {
        return new com.google.android.material.bottomsheet.a(x(), j2());
    }

    public final void v2() {
        if (this.f7658v0) {
            super.f2();
        } else {
            super.e2();
        }
    }

    public final void w2(@NonNull BottomSheetBehavior<?> bottomSheetBehavior, boolean z10) {
        this.f7658v0 = z10;
        if (bottomSheetBehavior.v0() == 5) {
            v2();
            return;
        }
        if (h2() instanceof com.google.android.material.bottomsheet.a) {
            ((com.google.android.material.bottomsheet.a) h2()).y();
        }
        bottomSheetBehavior.c0(new C0117b());
        bottomSheetBehavior.X0(5);
    }

    public final boolean x2(boolean z10) {
        Dialog dialogH2 = h2();
        if (!(dialogH2 instanceof com.google.android.material.bottomsheet.a)) {
            return false;
        }
        com.google.android.material.bottomsheet.a aVar = (com.google.android.material.bottomsheet.a) dialogH2;
        BottomSheetBehavior<FrameLayout> bottomSheetBehaviorV = aVar.v();
        if (!bottomSheetBehaviorV.B0() || !aVar.w()) {
            return false;
        }
        w2(bottomSheetBehaviorV, z10);
        return true;
    }
}
