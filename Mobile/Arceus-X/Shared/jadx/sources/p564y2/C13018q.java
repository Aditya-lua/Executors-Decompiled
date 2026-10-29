package p564y2;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: y2.q */
/* JADX INFO: loaded from: classes.dex */
public class C13018q {

    /* JADX INFO: renamed from: a */
    public final Object f46091a;

    /* JADX INFO: renamed from: y2.q$a */
    public static class a extends AccessibilityNodeProvider {

        /* JADX INFO: renamed from: a */
        public final C13018q f46092a;

        public a(C13018q c13018q) {
            this.f46092a = c13018q;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
            C13017p c13017pMo41049b = this.f46092a.mo41049b(i10);
            if (c13017pMo41049b == null) {
                return null;
            }
            return c13017pMo41049b.m48376N0();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i10) {
            List<C13017p> listM48457c = this.f46092a.m48457c(str, i10);
            if (listM48457c == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = listM48457c.size();
            for (int i11 = 0; i11 < size; i11++) {
                arrayList.add(listM48457c.get(i11).m48376N0());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i10) {
            C13017p c13017pMo41050d = this.f46092a.mo41050d(i10);
            if (c13017pMo41050d == null) {
                return null;
            }
            return c13017pMo41050d.m48376N0();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i10, int i11, Bundle bundle) {
            return this.f46092a.mo41051f(i10, i11, bundle);
        }
    }

    /* JADX INFO: renamed from: y2.q$b */
    public static class b extends a {
        public b(C13018q c13018q) {
            super(c13018q);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i10, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f46092a.m48456a(i10, C13017p.m48342O0(accessibilityNodeInfo), str, bundle);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C13018q() {
        this.f46091a = new b(this);
    }

    /* JADX INFO: renamed from: a */
    public void m48456a(int i10, C13017p c13017p, String str, Bundle bundle) {
    }

    /* JADX INFO: renamed from: b */
    public C13017p mo41049b(int i10) {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public List<C13017p> m48457c(String str, int i10) {
        return null;
    }

    /* JADX INFO: renamed from: d */
    public C13017p mo41050d(int i10) {
        return null;
    }

    /* JADX INFO: renamed from: e */
    public Object m48458e() {
        return this.f46091a;
    }

    /* JADX INFO: renamed from: f */
    public boolean mo41051f(int i10, int i11, Bundle bundle) {
        return false;
    }

    public C13018q(Object obj) {
        this.f46091a = obj;
    }
}
