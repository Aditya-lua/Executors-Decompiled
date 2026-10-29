package androidx.core.view;

import android.view.MotionEvent;

/* JADX INFO: renamed from: androidx.core.view.s */
/* JADX INFO: loaded from: classes.dex */
public final class C0632s {
    /* JADX INFO: renamed from: a */
    public static boolean m3175a(MotionEvent motionEvent, int i10) {
        return (motionEvent.getSource() & i10) == i10;
    }
}
