package p564y2;

import android.annotation.SuppressLint;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: renamed from: y2.b */
/* JADX INFO: loaded from: classes.dex */
public final class C13003b {
    @SuppressLint({"WrongConstant"})
    @Deprecated
    /* JADX INFO: renamed from: a */
    public static int m48326a(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getContentChangeTypes();
    }

    @Deprecated
    /* JADX INFO: renamed from: b */
    public static void m48327b(AccessibilityEvent accessibilityEvent, int i10) {
        accessibilityEvent.setContentChangeTypes(i10);
    }
}
