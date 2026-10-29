package androidx.viewpager2.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.NonNull;
import androidx.core.view.C0625o0;
import androidx.recyclerview.widget.C1064o;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p429s5.C11174a;
import p442t5.InterfaceC11530a;
import p459u5.C11802b;
import p564y2.C13017p;
import p564y2.InterfaceC13020s;

/* JADX INFO: loaded from: classes.dex */
public final class ViewPager2 extends ViewGroup {

    /* JADX INFO: renamed from: u */
    public static boolean f4456u = true;

    /* JADX INFO: renamed from: a */
    public final Rect f4457a;

    /* JADX INFO: renamed from: b */
    public final Rect f4458b;

    /* JADX INFO: renamed from: c */
    public C1108a f4459c;

    /* JADX INFO: renamed from: d */
    public int f4460d;

    /* JADX INFO: renamed from: e */
    public boolean f4461e;

    /* JADX INFO: renamed from: f */
    public RecyclerView.AbstractC1027j f4462f;

    /* JADX INFO: renamed from: g */
    public LinearLayoutManager f4463g;

    /* JADX INFO: renamed from: h */
    public int f4464h;

    /* JADX INFO: renamed from: i */
    public Parcelable f4465i;

    /* JADX INFO: renamed from: j */
    public RecyclerView f4466j;

    /* JADX INFO: renamed from: k */
    public C1064o f4467k;

    /* JADX INFO: renamed from: l */
    public C1110c f4468l;

    /* JADX INFO: renamed from: m */
    public C1108a f4469m;

    /* JADX INFO: renamed from: n */
    public C11802b f4470n;

    /* JADX INFO: renamed from: o */
    public C1109b f4471o;

    /* JADX INFO: renamed from: p */
    public RecyclerView.AbstractC1031n f4472p;

    /* JADX INFO: renamed from: q */
    public boolean f4473q;

    /* JADX INFO: renamed from: r */
    public boolean f4474r;

    /* JADX INFO: renamed from: s */
    public int f4475s;

    /* JADX INFO: renamed from: t */
    public AbstractC1098e f4476t;

    /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$a */
    public class C1094a extends AbstractC1100g {
        public C1094a() {
            super(null);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1100g, androidx.recyclerview.widget.RecyclerView.AbstractC1027j
        /* JADX INFO: renamed from: a */
        public void mo5503a() {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.f4461e = true;
            viewPager2.f4468l.m6238l();
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$b */
    public class C1095b extends AbstractC1102i {
        public C1095b() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1102i
        /* JADX INFO: renamed from: a */
        public void mo6195a(int i10) {
            if (i10 == 0) {
                ViewPager2.this.m6190o();
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1102i
        /* JADX INFO: renamed from: c */
        public void mo6196c(int i10) {
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.f4460d != i10) {
                viewPager2.f4460d = i10;
                viewPager2.f4476t.mo6214r();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$c */
    public class C1096c extends AbstractC1102i {
        public C1096c() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1102i
        /* JADX INFO: renamed from: c */
        public void mo6196c(int i10) {
            ViewPager2.this.clearFocus();
            if (ViewPager2.this.hasFocus()) {
                ViewPager2.this.f4466j.requestFocus(2);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$d */
    public class C1097d implements RecyclerView.InterfaceC1036s {
        public C1097d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1036s
        /* JADX INFO: renamed from: a */
        public void mo5653a(@NonNull View view) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1036s
        /* JADX INFO: renamed from: b */
        public void mo5654b(@NonNull View view) {
            RecyclerView.C1035r c1035r = (RecyclerView.C1035r) view.getLayoutParams();
            if (((ViewGroup.MarginLayoutParams) c1035r).width != -1 || ((ViewGroup.MarginLayoutParams) c1035r).height != -1) {
                throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
            }
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$e */
    public abstract class AbstractC1098e {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public AbstractC1098e() {
        }

        /* JADX INFO: renamed from: a */
        public boolean mo6197a() {
            return false;
        }

        /* JADX INFO: renamed from: b */
        public boolean mo6198b(int i10) {
            return false;
        }

        /* JADX INFO: renamed from: c */
        public boolean mo6199c(int i10, Bundle bundle) {
            return false;
        }

        /* JADX INFO: renamed from: d */
        public boolean mo6200d() {
            return false;
        }

        /* JADX INFO: renamed from: e */
        public void mo6201e(RecyclerView.AbstractC1025h<?> abstractC1025h) {
        }

        /* JADX INFO: renamed from: f */
        public void mo6202f(RecyclerView.AbstractC1025h<?> abstractC1025h) {
        }

        /* JADX INFO: renamed from: g */
        public String mo6203g() {
            throw new IllegalStateException("Not implemented.");
        }

        /* JADX INFO: renamed from: h */
        public void mo6204h(@NonNull C1108a c1108a, @NonNull RecyclerView recyclerView) {
        }

        /* JADX INFO: renamed from: i */
        public void mo6205i(AccessibilityNodeInfo accessibilityNodeInfo) {
        }

        /* JADX INFO: renamed from: j */
        public void mo6206j(@NonNull C13017p c13017p) {
        }

        /* JADX INFO: renamed from: k */
        public void mo6207k(@NonNull View view, @NonNull C13017p c13017p) {
        }

        /* JADX INFO: renamed from: l */
        public boolean mo6208l(int i10) {
            throw new IllegalStateException("Not implemented.");
        }

        /* JADX INFO: renamed from: m */
        public boolean mo6209m(int i10, Bundle bundle) {
            throw new IllegalStateException("Not implemented.");
        }

        /* JADX INFO: renamed from: n */
        public void mo6210n() {
        }

        /* JADX INFO: renamed from: o */
        public CharSequence mo6211o() {
            throw new IllegalStateException("Not implemented.");
        }

        /* JADX INFO: renamed from: p */
        public void mo6212p(@NonNull AccessibilityEvent accessibilityEvent) {
        }

        /* JADX INFO: renamed from: q */
        public void mo6213q() {
        }

        /* JADX INFO: renamed from: r */
        public void mo6214r() {
        }

        /* JADX INFO: renamed from: s */
        public void mo6215s() {
        }

        /* JADX INFO: renamed from: t */
        public void mo6216t() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 androidx.viewpager2.widget.ViewPager2) A[MD:(androidx.viewpager2.widget.ViewPager2):void (m)] (LINE:2) call: androidx.viewpager2.widget.ViewPager2.e.<init>(androidx.viewpager2.widget.ViewPager2):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public /* synthetic */ AbstractC1098e(ViewPager2 viewPager2, C1094a c1094a) {
            this();
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$f */
    public class C1099f extends AbstractC1098e {
        public C1099f() {
            super(ViewPager2.this, null);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1098e
        /* JADX INFO: renamed from: b */
        public boolean mo6198b(int i10) {
            return (i10 == 8192 || i10 == 4096) && !ViewPager2.this.m6180e();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1098e
        /* JADX INFO: renamed from: d */
        public boolean mo6200d() {
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1098e
        /* JADX INFO: renamed from: j */
        public void mo6206j(@NonNull C13017p c13017p) {
            if (ViewPager2.this.m6180e()) {
                return;
            }
            c13017p.m48393d0(C13017p.a.f46076r);
            c13017p.m48393d0(C13017p.a.f46075q);
            c13017p.m48362G0(false);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1098e
        /* JADX INFO: renamed from: l */
        public boolean mo6208l(int i10) {
            if (mo6198b(i10)) {
                return false;
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1098e
        /* JADX INFO: renamed from: o */
        public CharSequence mo6211o() {
            if (mo6200d()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$g */
    public static abstract class AbstractC1100g extends RecyclerView.AbstractC1027j {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public AbstractC1100g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1027j
        /* JADX INFO: renamed from: a */
        public abstract void mo5503a();

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1027j
        /* JADX INFO: renamed from: b */
        public final void mo5504b(int i10, int i11) {
            mo5503a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1027j
        /* JADX INFO: renamed from: c */
        public final void mo5505c(int i10, int i11, Object obj) {
            mo5503a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1027j
        /* JADX INFO: renamed from: d */
        public final void mo5506d(int i10, int i11) {
            mo5503a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1027j
        /* JADX INFO: renamed from: e */
        public final void mo5507e(int i10, int i11, int i12) {
            mo5503a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1027j
        /* JADX INFO: renamed from: f */
        public final void mo5508f(int i10, int i11) {
            mo5503a();
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:2) call: androidx.viewpager2.widget.ViewPager2.g.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public /* synthetic */ AbstractC1100g(C1094a c1094a) {
            this();
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$h */
    public class C1101h extends LinearLayoutManager {
        public C1101h(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1034q
        /* JADX INFO: renamed from: R0 */
        public void mo5084R0(@NonNull RecyclerView.C1041x c1041x, @NonNull RecyclerView.C1015b0 c1015b0, @NonNull C13017p c13017p) {
            super.mo5084R0(c1041x, c1015b0, c13017p);
            ViewPager2.this.f4476t.mo6206j(c13017p);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        /* JADX INFO: renamed from: R1 */
        public void mo5167R1(@NonNull RecyclerView.C1015b0 c1015b0, @NonNull int[] iArr) {
            int offscreenPageLimit = ViewPager2.this.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.mo5167R1(c1015b0, iArr);
                return;
            }
            int pageSize = ViewPager2.this.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
        /* JADX INFO: renamed from: U0 */
        public void mo5089U0(@NonNull RecyclerView.C1041x c1041x, @NonNull RecyclerView.C1015b0 c1015b0, @NonNull View view, @NonNull C13017p c13017p) {
            ViewPager2.this.f4476t.mo6207k(view, c13017p);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
        /* JADX INFO: renamed from: m1 */
        public boolean mo5615m1(@NonNull RecyclerView.C1041x c1041x, @NonNull RecyclerView.C1015b0 c1015b0, int i10, Bundle bundle) {
            return ViewPager2.this.f4476t.mo6198b(i10) ? ViewPager2.this.f4476t.mo6208l(i10) : super.mo5615m1(c1041x, c1015b0, i10, bundle);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
        /* JADX INFO: renamed from: x1 */
        public boolean mo5637x1(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z10, boolean z11) {
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$i */
    public static abstract class AbstractC1102i {
        /* JADX INFO: renamed from: a */
        public void mo6195a(int i10) {
        }

        /* JADX INFO: renamed from: b */
        public void mo6217b(int i10, float f10, int i11) {
        }

        /* JADX INFO: renamed from: c */
        public void mo6196c(int i10) {
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$j */
    public class C1103j extends AbstractC1098e {

        /* JADX INFO: renamed from: b */
        public final InterfaceC13020s f4487b;

        /* JADX INFO: renamed from: c */
        public final InterfaceC13020s f4488c;

        /* JADX INFO: renamed from: d */
        public RecyclerView.AbstractC1027j f4489d;

        /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$j$a */
        public class a implements InterfaceC13020s {
            public a() {
            }

            @Override // p564y2.InterfaceC13020s
            /* JADX INFO: renamed from: a */
            public boolean mo6223a(@NonNull View view, InterfaceC13020s.a aVar) {
                C1103j.this.m6221x(((ViewPager2) view).getCurrentItem() + 1);
                return true;
            }
        }

        /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$j$b */
        public class b implements InterfaceC13020s {
            public b() {
            }

            @Override // p564y2.InterfaceC13020s
            /* JADX INFO: renamed from: a */
            public boolean mo6223a(@NonNull View view, InterfaceC13020s.a aVar) {
                C1103j.this.m6221x(((ViewPager2) view).getCurrentItem() - 1);
                return true;
            }
        }

        /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$j$c */
        public class c extends AbstractC1100g {
            public c() {
                super(null);
            }

            @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1100g, androidx.recyclerview.widget.RecyclerView.AbstractC1027j
            /* JADX INFO: renamed from: a */
            public void mo5503a() {
                C1103j.this.m6222y();
            }
        }

        public C1103j() {
            super(ViewPager2.this, null);
            this.f4487b = new a();
            this.f4488c = new b();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1098e
        /* JADX INFO: renamed from: a */
        public boolean mo6197a() {
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1098e
        /* JADX INFO: renamed from: c */
        public boolean mo6199c(int i10, Bundle bundle) {
            return i10 == 8192 || i10 == 4096;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1098e
        /* JADX INFO: renamed from: e */
        public void mo6201e(RecyclerView.AbstractC1025h<?> abstractC1025h) {
            m6222y();
            if (abstractC1025h != null) {
                abstractC1025h.m5494z(this.f4489d);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1098e
        /* JADX INFO: renamed from: f */
        public void mo6202f(RecyclerView.AbstractC1025h<?> abstractC1025h) {
            if (abstractC1025h != null) {
                abstractC1025h.m5468B(this.f4489d);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1098e
        /* JADX INFO: renamed from: g */
        public String mo6203g() {
            if (mo6197a()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1098e
        /* JADX INFO: renamed from: h */
        public void mo6204h(@NonNull C1108a c1108a, @NonNull RecyclerView recyclerView) {
            C0625o0.m3060w0(recyclerView, 2);
            this.f4489d = new c();
            if (C0625o0.m3061x(ViewPager2.this) == 0) {
                C0625o0.m3060w0(ViewPager2.this, 1);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1098e
        /* JADX INFO: renamed from: i */
        public void mo6205i(AccessibilityNodeInfo accessibilityNodeInfo) {
            C13017p c13017pM48342O0 = C13017p.m48342O0(accessibilityNodeInfo);
            m6218u(c13017pM48342O0);
            m6220w(c13017pM48342O0);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1098e
        /* JADX INFO: renamed from: k */
        public void mo6207k(@NonNull View view, @NonNull C13017p c13017p) {
            m6219v(view, c13017p);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1098e
        /* JADX INFO: renamed from: m */
        public boolean mo6209m(int i10, Bundle bundle) {
            if (!mo6199c(i10, bundle)) {
                throw new IllegalStateException();
            }
            m6221x(i10 == 8192 ? ViewPager2.this.getCurrentItem() - 1 : ViewPager2.this.getCurrentItem() + 1);
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1098e
        /* JADX INFO: renamed from: n */
        public void mo6210n() {
            m6222y();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1098e
        /* JADX INFO: renamed from: p */
        public void mo6212p(@NonNull AccessibilityEvent accessibilityEvent) {
            accessibilityEvent.setSource(ViewPager2.this);
            accessibilityEvent.setClassName(mo6203g());
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1098e
        /* JADX INFO: renamed from: q */
        public void mo6213q() {
            m6222y();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1098e
        /* JADX INFO: renamed from: r */
        public void mo6214r() {
            m6222y();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1098e
        /* JADX INFO: renamed from: s */
        public void mo6215s() {
            m6222y();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1098e
        /* JADX INFO: renamed from: t */
        public void mo6216t() {
            m6222y();
        }

        /* JADX INFO: renamed from: u */
        public final void m6218u(C13017p c13017p) {
            int iMo5473e;
            int iMo5473e2;
            if (ViewPager2.this.getAdapter() != null) {
                iMo5473e2 = 1;
                if (ViewPager2.this.getOrientation() == 1) {
                    iMo5473e2 = ViewPager2.this.getAdapter().mo5473e();
                    iMo5473e = 1;
                } else {
                    iMo5473e = ViewPager2.this.getAdapter().mo5473e();
                }
            } else {
                iMo5473e = 0;
                iMo5473e2 = 0;
            }
            c13017p.m48412n0(C13017p.f.m48453b(iMo5473e2, iMo5473e, false, 0));
        }

        /* JADX INFO: renamed from: v */
        public final void m6219v(View view, C13017p c13017p) {
            c13017p.m48414o0(C13017p.g.m48455b(ViewPager2.this.getOrientation() == 1 ? ViewPager2.this.f4463g.m5613l0(view) : 0, 1, ViewPager2.this.getOrientation() == 0 ? ViewPager2.this.f4463g.m5613l0(view) : 0, 1, false, false));
        }

        /* JADX INFO: renamed from: w */
        public final void m6220w(C13017p c13017p) {
            int iMo5473e;
            RecyclerView.AbstractC1025h adapter = ViewPager2.this.getAdapter();
            if (adapter == null || (iMo5473e = adapter.mo5473e()) == 0 || !ViewPager2.this.m6180e()) {
                return;
            }
            if (ViewPager2.this.f4460d > 0) {
                c13017p.m48387a(8192);
            }
            if (ViewPager2.this.f4460d < iMo5473e - 1) {
                c13017p.m48387a(4096);
            }
            c13017p.m48362G0(true);
        }

        /* JADX INFO: renamed from: x */
        public void m6221x(int i10) {
            if (ViewPager2.this.m6180e()) {
                ViewPager2.this.m6186k(i10, true);
            }
        }

        /* JADX INFO: renamed from: y */
        public void m6222y() {
            int iMo5473e;
            ViewPager2 viewPager2 = ViewPager2.this;
            int i10 = R.id.accessibilityActionPageLeft;
            C0625o0.m3028g0(viewPager2, R.id.accessibilityActionPageLeft);
            C0625o0.m3028g0(viewPager2, R.id.accessibilityActionPageRight);
            C0625o0.m3028g0(viewPager2, R.id.accessibilityActionPageUp);
            C0625o0.m3028g0(viewPager2, R.id.accessibilityActionPageDown);
            if (ViewPager2.this.getAdapter() == null || (iMo5473e = ViewPager2.this.getAdapter().mo5473e()) == 0 || !ViewPager2.this.m6180e()) {
                return;
            }
            if (ViewPager2.this.getOrientation() != 0) {
                if (ViewPager2.this.f4460d < iMo5473e - 1) {
                    C0625o0.m3032i0(viewPager2, new C13017p.a(R.id.accessibilityActionPageDown, null), null, this.f4487b);
                }
                if (ViewPager2.this.f4460d > 0) {
                    C0625o0.m3032i0(viewPager2, new C13017p.a(R.id.accessibilityActionPageUp, null), null, this.f4488c);
                    return;
                }
                return;
            }
            boolean zM6179d = ViewPager2.this.m6179d();
            int i11 = zM6179d ? 16908360 : 16908361;
            if (zM6179d) {
                i10 = 16908361;
            }
            if (ViewPager2.this.f4460d < iMo5473e - 1) {
                C0625o0.m3032i0(viewPager2, new C13017p.a(i11, null), null, this.f4487b);
            }
            if (ViewPager2.this.f4460d > 0) {
                C0625o0.m3032i0(viewPager2, new C13017p.a(i10, null), null, this.f4488c);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$k */
    public interface InterfaceC1104k {
    }

    /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$l */
    public class C1105l extends C1064o {
        public C1105l() {
        }

        @Override // androidx.recyclerview.widget.C1064o, androidx.recyclerview.widget.AbstractC1068s
        /* JADX INFO: renamed from: f */
        public View mo6025f(RecyclerView.AbstractC1034q abstractC1034q) {
            if (ViewPager2.this.m6178c()) {
                return null;
            }
            return super.mo6025f(abstractC1034q);
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$m */
    public class C1106m extends RecyclerView {
        public C1106m(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        public CharSequence getAccessibilityClassName() {
            return ViewPager2.this.f4476t.mo6200d() ? ViewPager2.this.f4476t.mo6211o() : super.getAccessibilityClassName();
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setFromIndex(ViewPager2.this.f4460d);
            accessibilityEvent.setToIndex(ViewPager2.this.f4460d);
            ViewPager2.this.f4476t.mo6212p(accessibilityEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.m6180e() && super.onInterceptTouchEvent(motionEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.m6180e() && super.onTouchEvent(motionEvent);
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$n */
    public static class RunnableC1107n implements Runnable {

        /* JADX INFO: renamed from: a */
        public final int f4496a;

        /* JADX INFO: renamed from: b */
        public final RecyclerView f4497b;

        public RunnableC1107n(int i10, RecyclerView recyclerView) {
            this.f4496a = i10;
            this.f4497b = recyclerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f4497b.m5244C1(this.f4496a);
        }
    }

    public ViewPager2(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4457a = new Rect();
        this.f4458b = new Rect();
        this.f4459c = new C1108a(3);
        this.f4461e = false;
        this.f4462f = new C1094a();
        this.f4464h = -1;
        this.f4472p = null;
        this.f4473q = false;
        this.f4474r = true;
        this.f4475s = -1;
        m6177b(context, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public final RecyclerView.InterfaceC1036s m6176a() {
        return new C1097d();
    }

    /* JADX INFO: renamed from: b */
    public final void m6177b(Context context, AttributeSet attributeSet) {
        this.f4476t = f4456u ? new C1103j() : new C1099f();
        C1106m c1106m = new C1106m(context);
        this.f4466j = c1106m;
        c1106m.setId(C0625o0.m3035k());
        this.f4466j.setDescendantFocusability(131072);
        C1101h c1101h = new C1101h(context);
        this.f4463g = c1101h;
        this.f4466j.setLayoutManager(c1101h);
        this.f4466j.setScrollingTouchSlop(1);
        m6187l(context, attributeSet);
        this.f4466j.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f4466j.m5323l(m6176a());
        C1110c c1110c = new C1110c(this);
        this.f4468l = c1110c;
        this.f4470n = new C11802b(this, c1110c, this.f4466j);
        C1105l c1105l = new C1105l();
        this.f4467k = c1105l;
        c1105l.m6057b(this.f4466j);
        this.f4466j.m5329n(this.f4468l);
        C1108a c1108a = new C1108a(3);
        this.f4469m = c1108a;
        this.f4468l.m6241o(c1108a);
        C1095b c1095b = new C1095b();
        C1096c c1096c = new C1096c();
        this.f4469m.m6224d(c1095b);
        this.f4469m.m6224d(c1096c);
        this.f4476t.mo6204h(this.f4469m, this.f4466j);
        this.f4469m.m6224d(this.f4459c);
        C1109b c1109b = new C1109b(this.f4463g);
        this.f4471o = c1109b;
        this.f4469m.m6224d(c1109b);
        RecyclerView recyclerView = this.f4466j;
        attachViewToParent(recyclerView, 0, recyclerView.getLayoutParams());
    }

    /* JADX INFO: renamed from: c */
    public boolean m6178c() {
        return this.f4470n.m44156a();
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i10) {
        return this.f4466j.canScrollHorizontally(i10);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i10) {
        return this.f4466j.canScrollVertically(i10);
    }

    /* JADX INFO: renamed from: d */
    public boolean m6179d() {
        return this.f4463g.m5594d0() == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof SavedState) {
            int i10 = ((SavedState) parcelable).f4477a;
            sparseArray.put(this.f4466j.getId(), sparseArray.get(i10));
            sparseArray.remove(i10);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        m6184i();
    }

    /* JADX INFO: renamed from: e */
    public boolean m6180e() {
        return this.f4474r;
    }

    /* JADX INFO: renamed from: f */
    public final void m6181f(RecyclerView.AbstractC1025h<?> abstractC1025h) {
        if (abstractC1025h != null) {
            abstractC1025h.m5494z(this.f4462f);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m6182g(@NonNull AbstractC1102i abstractC1102i) {
        this.f4459c.m6224d(abstractC1102i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return this.f4476t.mo6197a() ? this.f4476t.mo6203g() : super.getAccessibilityClassName();
    }

    public RecyclerView.AbstractC1025h getAdapter() {
        return this.f4466j.getAdapter();
    }

    public int getCurrentItem() {
        return this.f4460d;
    }

    public int getItemDecorationCount() {
        return this.f4466j.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.f4475s;
    }

    public int getOrientation() {
        return this.f4463g.m5194q2() == 1 ? 1 : 0;
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        RecyclerView recyclerView = this.f4466j;
        if (getOrientation() == 0) {
            height = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            paddingBottom = recyclerView.getPaddingRight();
        } else {
            height = recyclerView.getHeight() - recyclerView.getPaddingTop();
            paddingBottom = recyclerView.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.f4468l.m6234h();
    }

    /* JADX INFO: renamed from: h */
    public void m6183h() {
        this.f4471o.m6227d();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: androidx.recyclerview.widget.RecyclerView$h */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public final void m6184i() {
        RecyclerView.AbstractC1025h adapter;
        if (this.f4464h == -1 || (adapter = getAdapter()) == 0) {
            return;
        }
        Parcelable parcelable = this.f4465i;
        if (parcelable != null) {
            if (adapter instanceof InterfaceC11530a) {
                ((InterfaceC11530a) adapter).m43103b(parcelable);
            }
            this.f4465i = null;
        }
        int iMax = Math.max(0, Math.min(this.f4464h, adapter.mo5473e() - 1));
        this.f4460d = iMax;
        this.f4464h = -1;
        this.f4466j.m5346t1(iMax);
        this.f4476t.mo6210n();
    }

    /* JADX INFO: renamed from: j */
    public void m6185j(int i10, boolean z10) {
        if (m6178c()) {
            throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
        }
        m6186k(i10, z10);
    }

    /* JADX INFO: renamed from: k */
    public void m6186k(int i10, boolean z10) {
        RecyclerView.AbstractC1025h adapter = getAdapter();
        if (adapter == null) {
            if (this.f4464h != -1) {
                this.f4464h = Math.max(i10, 0);
                return;
            }
            return;
        }
        if (adapter.mo5473e() <= 0) {
            return;
        }
        int iMin = Math.min(Math.max(i10, 0), adapter.mo5473e() - 1);
        if (iMin == this.f4460d && this.f4468l.m6236j()) {
            return;
        }
        int i11 = this.f4460d;
        if (iMin == i11 && z10) {
            return;
        }
        double dM6233g = i11;
        this.f4460d = iMin;
        this.f4476t.mo6214r();
        if (!this.f4468l.m6236j()) {
            dM6233g = this.f4468l.m6233g();
        }
        this.f4468l.m6239m(iMin, z10);
        if (!z10) {
            this.f4466j.m5346t1(iMin);
            return;
        }
        double d10 = iMin;
        if (Math.abs(d10 - dM6233g) <= 3.0d) {
            this.f4466j.m5244C1(iMin);
            return;
        }
        this.f4466j.m5346t1(d10 > dM6233g ? iMin - 3 : iMin + 3);
        RecyclerView recyclerView = this.f4466j;
        recyclerView.post(new RunnableC1107n(iMin, recyclerView));
    }

    /* JADX INFO: renamed from: l */
    public final void m6187l(Context context, AttributeSet attributeSet) {
        int[] iArr = C11174a.f39420a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        C0625o0.m3036k0(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        try {
            setOrientation(typedArrayObtainStyledAttributes.getInt(C11174a.f39421b, 0));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m6188m(RecyclerView.AbstractC1025h<?> abstractC1025h) {
        if (abstractC1025h != null) {
            abstractC1025h.m5468B(this.f4462f);
        }
    }

    /* JADX INFO: renamed from: n */
    public void m6189n(@NonNull AbstractC1102i abstractC1102i) {
        this.f4459c.m6225e(abstractC1102i);
    }

    /* JADX INFO: renamed from: o */
    public void m6190o() {
        C1064o c1064o = this.f4467k;
        if (c1064o == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View viewMo6025f = c1064o.mo6025f(this.f4463g);
        if (viewMo6025f == null) {
            return;
        }
        int iM5613l0 = this.f4463g.m5613l0(viewMo6025f);
        if (iM5613l0 != this.f4460d && getScrollState() == 0) {
            this.f4469m.mo6196c(iM5613l0);
        }
        this.f4461e = false;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f4476t.mo6205i(accessibilityNodeInfo);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredWidth = this.f4466j.getMeasuredWidth();
        int measuredHeight = this.f4466j.getMeasuredHeight();
        this.f4457a.left = getPaddingLeft();
        this.f4457a.right = (i12 - i10) - getPaddingRight();
        this.f4457a.top = getPaddingTop();
        this.f4457a.bottom = (i13 - i11) - getPaddingBottom();
        Gravity.apply(8388659, measuredWidth, measuredHeight, this.f4457a, this.f4458b);
        RecyclerView recyclerView = this.f4466j;
        Rect rect = this.f4458b;
        recyclerView.layout(rect.left, rect.top, rect.right, rect.bottom);
        if (this.f4461e) {
            m6190o();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        measureChild(this.f4466j, i10, i11);
        int measuredWidth = this.f4466j.getMeasuredWidth();
        int measuredHeight = this.f4466j.getMeasuredHeight();
        int measuredState = this.f4466j.getMeasuredState();
        int paddingLeft = measuredWidth + getPaddingLeft() + getPaddingRight();
        int paddingTop = measuredHeight + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i10, measuredState), View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i11, measuredState << 16));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f4464h = savedState.f4478b;
        this.f4465i = savedState.f4479c;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f4477a = this.f4466j.getId();
        int i10 = this.f4464h;
        if (i10 == -1) {
            i10 = this.f4460d;
        }
        savedState.f4478b = i10;
        Parcelable parcelable = this.f4465i;
        if (parcelable != null) {
            savedState.f4479c = parcelable;
            return savedState;
        }
        Object adapter = this.f4466j.getAdapter();
        if (adapter instanceof InterfaceC11530a) {
            savedState.f4479c = ((InterfaceC11530a) adapter).m43102a();
        }
        return savedState;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        throw new IllegalStateException(ViewPager2.class.getSimpleName() + " does not support direct child views");
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i10, Bundle bundle) {
        return this.f4476t.mo6199c(i10, bundle) ? this.f4476t.mo6209m(i10, bundle) : super.performAccessibilityAction(i10, bundle);
    }

    public void setAdapter(RecyclerView.AbstractC1025h abstractC1025h) {
        RecyclerView.AbstractC1025h adapter = this.f4466j.getAdapter();
        this.f4476t.mo6202f(adapter);
        m6188m(adapter);
        this.f4466j.setAdapter(abstractC1025h);
        this.f4460d = 0;
        m6184i();
        this.f4476t.mo6201e(abstractC1025h);
        m6181f(abstractC1025h);
    }

    public void setCurrentItem(int i10) {
        m6185j(i10, true);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
        super.setLayoutDirection(i10);
        this.f4476t.mo6213q();
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 < 1 && i10 != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.f4475s = i10;
        this.f4466j.requestLayout();
    }

    public void setOrientation(int i10) {
        this.f4463g.m5152E2(i10);
        this.f4476t.mo6215s();
    }

    public void setPageTransformer(InterfaceC1104k interfaceC1104k) {
        if (interfaceC1104k != null) {
            if (!this.f4473q) {
                this.f4472p = this.f4466j.getItemAnimator();
                this.f4473q = true;
            }
            this.f4466j.setItemAnimator(null);
        } else if (this.f4473q) {
            this.f4466j.setItemAnimator(this.f4472p);
            this.f4472p = null;
            this.f4473q = false;
        }
        this.f4471o.m6227d();
        if (interfaceC1104k == null) {
            return;
        }
        this.f4471o.m6228e(interfaceC1104k);
        m6183h();
    }

    public void setUserInputEnabled(boolean z10) {
        this.f4474r = z10;
        this.f4476t.mo6216t();
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1093a();

        /* JADX INFO: renamed from: a */
        public int f4477a;

        /* JADX INFO: renamed from: b */
        public int f4478b;

        /* JADX INFO: renamed from: c */
        public Parcelable f4479c;

        /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$SavedState$a */
        public class C1093a implements Parcelable.ClassLoaderCreator<SavedState> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return createFromParcel(parcel, null);
            }

            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @SuppressLint({"ClassVerificationFailure"})
        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            m6191a(parcel, classLoader);
        }

        /* JADX INFO: renamed from: a */
        public final void m6191a(Parcel parcel, ClassLoader classLoader) {
            this.f4477a = parcel.readInt();
            this.f4478b = parcel.readInt();
            this.f4479c = parcel.readParcelable(classLoader);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f4477a);
            parcel.writeInt(this.f4478b);
            parcel.writeParcelable(this.f4479c, i10);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
