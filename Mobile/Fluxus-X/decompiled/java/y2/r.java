package y2;

import android.view.View;
import android.view.accessibility.AccessibilityRecord;

/* JADX INFO: loaded from: classes.dex */
public class r {
    @Deprecated
    public static void a(AccessibilityRecord accessibilityRecord, int i10) {
        accessibilityRecord.setMaxScrollX(i10);
    }

    @Deprecated
    public static void b(AccessibilityRecord accessibilityRecord, int i10) {
        accessibilityRecord.setMaxScrollY(i10);
    }

    @Deprecated
    public static void c(AccessibilityRecord accessibilityRecord, View view, int i10) {
        accessibilityRecord.setSource(view, i10);
    }
}
