package p564y2;

import android.view.View;
import android.view.accessibility.AccessibilityRecord;

/* JADX INFO: renamed from: y2.r */
/* JADX INFO: loaded from: classes.dex */
public class C13019r {
    @Deprecated
    /* JADX INFO: renamed from: a */
    public static void m48459a(AccessibilityRecord accessibilityRecord, int i10) {
        accessibilityRecord.setMaxScrollX(i10);
    }

    @Deprecated
    /* JADX INFO: renamed from: b */
    public static void m48460b(AccessibilityRecord accessibilityRecord, int i10) {
        accessibilityRecord.setMaxScrollY(i10);
    }

    @Deprecated
    /* JADX INFO: renamed from: c */
    public static void m48461c(AccessibilityRecord accessibilityRecord, View view, int i10) {
        accessibilityRecord.setSource(view, i10);
    }
}
