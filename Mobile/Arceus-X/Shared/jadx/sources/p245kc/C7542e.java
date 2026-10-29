package p245kc;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.view.View;
import androidx.annotation.NonNull;
import p194ic.C6738b;
import p194ic.C6743g;

/* JADX INFO: renamed from: kc.e */
/* JADX INFO: loaded from: classes2.dex */
public class C7542e {

    /* JADX INFO: renamed from: a */
    public static final int[] f28913a = {R.attr.stateListAnimator};

    /* JADX INFO: renamed from: a */
    public static void m31195a(@NonNull View view, float f10) {
        int integer = view.getResources().getInteger(C6743g.f26056a);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j10 = integer;
        stateListAnimator.addState(new int[]{R.attr.state_enabled, C6738b.f25890c0, -C6738b.f25892d0}, ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(j10));
        stateListAnimator.addState(new int[]{R.attr.state_enabled}, ObjectAnimator.ofFloat(view, "elevation", f10).setDuration(j10));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }
}
