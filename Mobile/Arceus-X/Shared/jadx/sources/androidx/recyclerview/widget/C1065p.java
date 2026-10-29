package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.core.view.C0582a;
import androidx.core.view.C0625o0;
import java.util.Map;
import java.util.WeakHashMap;
import p564y2.C13017p;
import p564y2.C13018q;

/* JADX INFO: renamed from: androidx.recyclerview.widget.p */
/* JADX INFO: loaded from: classes.dex */
public class C1065p extends C0582a {

    /* JADX INFO: renamed from: d */
    public final RecyclerView f4319d;

    /* JADX INFO: renamed from: e */
    public final a f4320e;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.p$a */
    public static class a extends C0582a {

        /* JADX INFO: renamed from: d */
        public final C1065p f4321d;

        /* JADX INFO: renamed from: e */
        public Map<View, C0582a> f4322e = new WeakHashMap();

        public a(@NonNull C1065p c1065p) {
            this.f4321d = c1065p;
        }

        @Override // androidx.core.view.C0582a
        /* JADX INFO: renamed from: a */
        public boolean mo2794a(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            C0582a c0582a = this.f4322e.get(view);
            return c0582a != null ? c0582a.mo2794a(view, accessibilityEvent) : super.mo2794a(view, accessibilityEvent);
        }

        @Override // androidx.core.view.C0582a
        /* JADX INFO: renamed from: b */
        public C13018q mo2795b(@NonNull View view) {
            C0582a c0582a = this.f4322e.get(view);
            return c0582a != null ? c0582a.mo2795b(view) : super.mo2795b(view);
        }

        @Override // androidx.core.view.C0582a
        /* JADX INFO: renamed from: f */
        public void mo2798f(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            C0582a c0582a = this.f4322e.get(view);
            if (c0582a != null) {
                c0582a.mo2798f(view, accessibilityEvent);
            } else {
                super.mo2798f(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.C0582a
        /* JADX INFO: renamed from: g */
        public void mo2799g(@NonNull @SuppressLint({"InvalidNullabilityOverride"}) View view, @NonNull @SuppressLint({"InvalidNullabilityOverride"}) C13017p c13017p) {
            if (this.f4321d.m6035o() || this.f4321d.f4319d.getLayoutManager() == null) {
                super.mo2799g(view, c13017p);
                return;
            }
            this.f4321d.f4319d.getLayoutManager().m5582T0(view, c13017p);
            C0582a c0582a = this.f4322e.get(view);
            if (c0582a != null) {
                c0582a.mo2799g(view, c13017p);
            } else {
                super.mo2799g(view, c13017p);
            }
        }

        @Override // androidx.core.view.C0582a
        /* JADX INFO: renamed from: h */
        public void mo2800h(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            C0582a c0582a = this.f4322e.get(view);
            if (c0582a != null) {
                c0582a.mo2800h(view, accessibilityEvent);
            } else {
                super.mo2800h(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.C0582a
        /* JADX INFO: renamed from: i */
        public boolean mo2801i(@NonNull ViewGroup viewGroup, @NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            C0582a c0582a = this.f4322e.get(viewGroup);
            return c0582a != null ? c0582a.mo2801i(viewGroup, view, accessibilityEvent) : super.mo2801i(viewGroup, view, accessibilityEvent);
        }

        @Override // androidx.core.view.C0582a
        /* JADX INFO: renamed from: j */
        public boolean mo2802j(@NonNull @SuppressLint({"InvalidNullabilityOverride"}) View view, int i10, @SuppressLint({"InvalidNullabilityOverride"}) Bundle bundle) {
            if (this.f4321d.m6035o() || this.f4321d.f4319d.getLayoutManager() == null) {
                return super.mo2802j(view, i10, bundle);
            }
            C0582a c0582a = this.f4322e.get(view);
            if (c0582a != null) {
                if (c0582a.mo2802j(view, i10, bundle)) {
                    return true;
                }
            } else if (super.mo2802j(view, i10, bundle)) {
                return true;
            }
            return this.f4321d.f4319d.getLayoutManager().m5618n1(view, i10, bundle);
        }

        @Override // androidx.core.view.C0582a
        /* JADX INFO: renamed from: l */
        public void mo2804l(@NonNull View view, int i10) {
            C0582a c0582a = this.f4322e.get(view);
            if (c0582a != null) {
                c0582a.mo2804l(view, i10);
            } else {
                super.mo2804l(view, i10);
            }
        }

        @Override // androidx.core.view.C0582a
        /* JADX INFO: renamed from: m */
        public void mo2805m(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            C0582a c0582a = this.f4322e.get(view);
            if (c0582a != null) {
                c0582a.mo2805m(view, accessibilityEvent);
            } else {
                super.mo2805m(view, accessibilityEvent);
            }
        }

        /* JADX INFO: renamed from: n */
        public C0582a m6036n(View view) {
            return this.f4322e.remove(view);
        }

        /* JADX INFO: renamed from: o */
        public void m6037o(View view) {
            C0582a c0582aM3037l = C0625o0.m3037l(view);
            if (c0582aM3037l == null || c0582aM3037l == this) {
                return;
            }
            this.f4322e.put(view, c0582aM3037l);
        }
    }

    public C1065p(@NonNull RecyclerView recyclerView) {
        this.f4319d = recyclerView;
        C0582a c0582aM6034n = m6034n();
        if (c0582aM6034n == null || !(c0582aM6034n instanceof a)) {
            this.f4320e = new a(this);
        } else {
            this.f4320e = (a) c0582aM6034n;
        }
    }

    @Override // androidx.core.view.C0582a
    /* JADX INFO: renamed from: f */
    public void mo2798f(@NonNull @SuppressLint({"InvalidNullabilityOverride"}) View view, @NonNull @SuppressLint({"InvalidNullabilityOverride"}) AccessibilityEvent accessibilityEvent) {
        super.mo2798f(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || m6035o()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().mo5166P0(accessibilityEvent);
        }
    }

    @Override // androidx.core.view.C0582a
    /* JADX INFO: renamed from: g */
    public void mo2799g(@NonNull @SuppressLint({"InvalidNullabilityOverride"}) View view, @NonNull @SuppressLint({"InvalidNullabilityOverride"}) C13017p c13017p) {
        super.mo2799g(view, c13017p);
        if (m6035o() || this.f4319d.getLayoutManager() == null) {
            return;
        }
        this.f4319d.getLayoutManager().m5580S0(c13017p);
    }

    @Override // androidx.core.view.C0582a
    /* JADX INFO: renamed from: j */
    public boolean mo2802j(@NonNull @SuppressLint({"InvalidNullabilityOverride"}) View view, int i10, @SuppressLint({"InvalidNullabilityOverride"}) Bundle bundle) {
        if (super.mo2802j(view, i10, bundle)) {
            return true;
        }
        if (m6035o() || this.f4319d.getLayoutManager() == null) {
            return false;
        }
        return this.f4319d.getLayoutManager().mo5115l1(i10, bundle);
    }

    @NonNull
    /* JADX INFO: renamed from: n */
    public C0582a m6034n() {
        return this.f4320e;
    }

    /* JADX INFO: renamed from: o */
    public boolean m6035o() {
        return this.f4319d.m5350v0();
    }
}
