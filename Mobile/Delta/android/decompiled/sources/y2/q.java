package y2;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f35529a;

    public static class a extends AccessibilityNodeProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q f35530a;

        public a(q qVar) {
            this.f35530a = qVar;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
            p pVarB = this.f35530a.b(i10);
            if (pVarB == null) {
                return null;
            }
            return pVarB.N0();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i10) {
            List<p> listC = this.f35530a.c(str, i10);
            if (listC == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = listC.size();
            for (int i11 = 0; i11 < size; i11++) {
                arrayList.add(listC.get(i11).N0());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i10) {
            p pVarD = this.f35530a.d(i10);
            if (pVarD == null) {
                return null;
            }
            return pVarD.N0();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i10, int i11, Bundle bundle) {
            return this.f35530a.f(i10, i11, bundle);
        }
    }

    public static class b extends a {
        public b(q qVar) {
            super(qVar);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i10, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f35530a.a(i10, p.O0(accessibilityNodeInfo), str, bundle);
        }
    }

    public q() {
        this.f35529a = new b(this);
    }

    public void a(int i10, p pVar, String str, Bundle bundle) {
    }

    public p b(int i10) {
        return null;
    }

    public List<p> c(String str, int i10) {
        return null;
    }

    public p d(int i10) {
        return null;
    }

    public Object e() {
        return this.f35529a;
    }

    public boolean f(int i10, int i11, Bundle bundle) {
        return false;
    }

    public q(Object obj) {
        this.f35529a = obj;
    }
}
