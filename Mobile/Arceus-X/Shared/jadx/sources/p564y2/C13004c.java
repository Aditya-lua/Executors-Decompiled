package p564y2;

import android.view.accessibility.AccessibilityManager;

/* JADX INFO: renamed from: y2.c */
/* JADX INFO: loaded from: classes.dex */
public final class C13004c {

    /* JADX INFO: renamed from: y2.c$a */
    public interface a {
        void onTouchExplorationStateChanged(boolean z10);
    }

    /* JADX INFO: renamed from: y2.c$b */
    public static final class b implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* JADX INFO: renamed from: a */
        public final a f46037a;

        public b(a aVar) {
            this.f46037a = aVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return this.f46037a.equals(((b) obj).f46037a);
            }
            return false;
        }

        public int hashCode() {
            return this.f46037a.hashCode();
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z10) {
            this.f46037a.onTouchExplorationStateChanged(z10);
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: a */
    public static boolean m48328a(AccessibilityManager accessibilityManager, a aVar) {
        return accessibilityManager.addTouchExplorationStateChangeListener(new b(aVar));
    }

    @Deprecated
    /* JADX INFO: renamed from: b */
    public static boolean m48329b(AccessibilityManager accessibilityManager, a aVar) {
        return accessibilityManager.removeTouchExplorationStateChangeListener(new b(aVar));
    }
}
