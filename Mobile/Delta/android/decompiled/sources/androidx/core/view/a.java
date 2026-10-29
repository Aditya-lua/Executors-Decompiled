package androidx.core.view;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final View.AccessibilityDelegate f1812c = new View.AccessibilityDelegate();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View.AccessibilityDelegate f1813a;
    public final View.AccessibilityDelegate b;

    /* JADX INFO: renamed from: androidx.core.view.a$a, reason: collision with other inner class name */
    public static final class C0026a extends View.AccessibilityDelegate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f1814a;

        public C0026a(a aVar) {
            this.f1814a = aVar;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f1814a.a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            y2.q qVarB = this.f1814a.b(view);
            if (qVarB != null) {
                return (AccessibilityNodeProvider) qVarB.e();
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f1814a.f(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            y2.p pVarO0 = y2.p.O0(accessibilityNodeInfo);
            pVarO0.F0(o0.U(view));
            pVarO0.w0(o0.P(view));
            pVarO0.B0(o0.o(view));
            pVarO0.J0(o0.G(view));
            this.f1814a.g(view, pVarO0);
            pVarO0.d(accessibilityNodeInfo.getText(), view);
            List<y2.p.a> listC = a.c(view);
            for (int i10 = 0; i10 < listC.size(); i10++) {
                pVarO0.b(listC.get(i10));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f1814a.h(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f1814a.i(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            return this.f1814a.j(view, i10, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i10) {
            this.f1814a.l(view, i10);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f1814a.m(view, accessibilityEvent);
        }
    }

    public a() {
        this(f1812c);
    }

    public static List<y2.p.a> c(View view) {
        List<y2.p.a> list = (List) view.getTag(j2.e.H);
        return list == null ? Collections.EMPTY_LIST : list;
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f1813a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public y2.q b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f1813a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new y2.q(accessibilityNodeProvider);
        }
        return null;
    }

    public View.AccessibilityDelegate d() {
        return this.b;
    }

    public final boolean e(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] clickableSpanArrQ = y2.p.q(view.createAccessibilityNodeInfo().getText());
            for (int i10 = 0; clickableSpanArrQ != null && i10 < clickableSpanArrQ.length; i10++) {
                if (clickableSpan.equals(clickableSpanArrQ[i10])) {
                    return true;
                }
            }
        }
        return false;
    }

    public void f(View view, AccessibilityEvent accessibilityEvent) {
        this.f1813a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void g(View view, y2.p pVar) {
        this.f1813a.onInitializeAccessibilityNodeInfo(view, pVar.N0());
    }

    public void h(View view, AccessibilityEvent accessibilityEvent) {
        this.f1813a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f1813a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean j(View view, int i10, Bundle bundle) {
        List<y2.p.a> listC = c(view);
        boolean zPerformAccessibilityAction = false;
        for (int i11 = 0; i11 < listC.size(); i11++) {
            y2.p.a aVar = listC.get(i11);
            if (aVar.b() == i10) {
                zPerformAccessibilityAction = aVar.d(view, bundle);
                break;
            }
        }
        if (!zPerformAccessibilityAction) {
            zPerformAccessibilityAction = this.f1813a.performAccessibilityAction(view, i10, bundle);
        }
        return (zPerformAccessibilityAction || i10 != j2.e.f21033a || bundle == null) ? zPerformAccessibilityAction : k(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    public final boolean k(int i10, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(j2.e.I);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i10)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!e(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    public void l(View view, int i10) {
        this.f1813a.sendAccessibilityEvent(view, i10);
    }

    public void m(View view, AccessibilityEvent accessibilityEvent) {
        this.f1813a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f1813a = accessibilityDelegate;
        this.b = new C0026a(this);
    }
}
