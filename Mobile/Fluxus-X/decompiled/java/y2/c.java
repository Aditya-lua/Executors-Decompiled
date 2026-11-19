package y2;

import android.view.accessibility.AccessibilityManager;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    public interface a {
        void onTouchExplorationStateChanged(boolean z10);
    }

    public static final class b implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f37195a;

        public b(a aVar) {
            this.f37195a = aVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return this.f37195a.equals(((b) obj).f37195a);
            }
            return false;
        }

        public int hashCode() {
            return this.f37195a.hashCode();
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z10) {
            this.f37195a.onTouchExplorationStateChanged(z10);
        }
    }

    @Deprecated
    public static boolean a(AccessibilityManager accessibilityManager, a aVar) {
        return accessibilityManager.addTouchExplorationStateChangeListener(new b(aVar));
    }

    @Deprecated
    public static boolean b(AccessibilityManager accessibilityManager, a aVar) {
        return accessibilityManager.removeTouchExplorationStateChangeListener(new b(aVar));
    }
}
