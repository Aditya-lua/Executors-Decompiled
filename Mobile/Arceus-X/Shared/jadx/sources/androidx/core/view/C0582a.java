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
import p206j2.C7023e;
import p564y2.C13017p;
import p564y2.C13018q;

/* JADX INFO: renamed from: androidx.core.view.a */
/* JADX INFO: loaded from: classes.dex */
public class C0582a {

    /* JADX INFO: renamed from: c */
    public static final View.AccessibilityDelegate f2349c = new View.AccessibilityDelegate();

    /* JADX INFO: renamed from: a */
    public final View.AccessibilityDelegate f2350a;

    /* JADX INFO: renamed from: b */
    public final View.AccessibilityDelegate f2351b;

    /* JADX INFO: renamed from: androidx.core.view.a$a */
    public static final class a extends View.AccessibilityDelegate {

        /* JADX INFO: renamed from: a */
        public final C0582a f2352a;

        public a(C0582a c0582a) {
            this.f2352a = c0582a;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f2352a.mo2794a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            C13018q c13018qMo2795b = this.f2352a.mo2795b(view);
            if (c13018qMo2795b != null) {
                return (AccessibilityNodeProvider) c13018qMo2795b.m48458e();
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f2352a.mo2798f(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            C13017p c13017pM48342O0 = C13017p.m48342O0(accessibilityNodeInfo);
            c13017pM48342O0.m48360F0(C0625o0.m3009U(view));
            c13017pM48342O0.m48428w0(C0625o0.m3004P(view));
            c13017pM48342O0.m48352B0(C0625o0.m3043o(view));
            c13017pM48342O0.m48368J0(C0625o0.m2990G(view));
            this.f2352a.mo2799g(view, c13017pM48342O0);
            c13017pM48342O0.m48392d(accessibilityNodeInfo.getText(), view);
            List<C13017p.a> listM2793c = C0582a.m2793c(view);
            for (int i10 = 0; i10 < listM2793c.size(); i10++) {
                c13017pM48342O0.m48388b(listM2793c.get(i10));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f2352a.mo2800h(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f2352a.mo2801i(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            return this.f2352a.mo2802j(view, i10, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i10) {
            this.f2352a.mo2804l(view, i10);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f2352a.mo2805m(view, accessibilityEvent);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0582a() {
        this(f2349c);
    }

    /* JADX INFO: renamed from: c */
    public static List<C13017p.a> m2793c(View view) {
        List<C13017p.a> list = (List) view.getTag(C7023e.f27489H);
        return list == null ? Collections.EMPTY_LIST : list;
    }

    /* JADX INFO: renamed from: a */
    public boolean mo2794a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f2350a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: b */
    public C13018q mo2795b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f2350a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new C13018q(accessibilityNodeProvider);
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public View.AccessibilityDelegate m2796d() {
        return this.f2351b;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m2797e(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] clickableSpanArrM48347q = C13017p.m48347q(view.createAccessibilityNodeInfo().getText());
            for (int i10 = 0; clickableSpanArrM48347q != null && i10 < clickableSpanArrM48347q.length; i10++) {
                if (clickableSpan.equals(clickableSpanArrM48347q[i10])) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public void mo2798f(View view, AccessibilityEvent accessibilityEvent) {
        this.f2350a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: g */
    public void mo2799g(View view, C13017p c13017p) {
        this.f2350a.onInitializeAccessibilityNodeInfo(view, c13017p.m48376N0());
    }

    /* JADX INFO: renamed from: h */
    public void mo2800h(View view, AccessibilityEvent accessibilityEvent) {
        this.f2350a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: i */
    public boolean mo2801i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f2350a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: j */
    public boolean mo2802j(View view, int i10, Bundle bundle) {
        List<C13017p.a> listM2793c = m2793c(view);
        boolean zPerformAccessibilityAction = false;
        for (int i11 = 0; i11 < listM2793c.size(); i11++) {
            C13017p.a aVar = listM2793c.get(i11);
            if (aVar.m48436b() == i10) {
                zPerformAccessibilityAction = aVar.m48438d(view, bundle);
                break;
            }
        }
        if (!zPerformAccessibilityAction) {
            zPerformAccessibilityAction = this.f2350a.performAccessibilityAction(view, i10, bundle);
        }
        return (zPerformAccessibilityAction || i10 != C7023e.f27503a || bundle == null) ? zPerformAccessibilityAction : m2803k(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m2803k(int i10, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(C7023e.f27490I);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i10)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!m2797e(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    /* JADX INFO: renamed from: l */
    public void mo2804l(View view, int i10) {
        this.f2350a.sendAccessibilityEvent(view, i10);
    }

    /* JADX INFO: renamed from: m */
    public void mo2805m(View view, AccessibilityEvent accessibilityEvent) {
        this.f2350a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C0582a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f2350a = accessibilityDelegate;
        this.f2351b = new a(this);
    }
}
