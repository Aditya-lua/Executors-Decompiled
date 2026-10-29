package p293mi;

import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.core.graphics.Insets;
import androidx.core.view.C0625o0;
import androidx.core.view.InterfaceC0644y;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.ComponentCallbacksC0929c;
import androidx.p616lifecycle.InterfaceC0952e0;
import androidx.p616lifecycle.InterfaceC0980s;
import com.roblox.client.AbstractActivityC3160b;
import com.roblox.client.startup.MainGameActivity;
import p093e4.ActivityC4831q;
import p151gk.C6124q;
import p517wh.EnumC12462t0;
import sg.C11335m0;
import sg.C11338n0;
import th.C11659h;

/* JADX INFO: renamed from: mi.c */
/* JADX INFO: loaded from: classes2.dex */
public class C8527c {

    /* JADX INFO: renamed from: g */
    public static final int f31323g = WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.displayCutout();

    /* JADX INFO: renamed from: a */
    public ViewGroup f31324a;

    /* JADX INFO: renamed from: b */
    public View f31325b;

    /* JADX INFO: renamed from: c */
    public View f31326c;

    /* JADX INFO: renamed from: d */
    public View f31327d;

    /* JADX INFO: renamed from: e */
    public EnumC12462t0 f31328e = EnumC12462t0.APP;

    /* JADX INFO: renamed from: f */
    public Rect f31329f;

    /* JADX INFO: renamed from: mi.c$a */
    public class a implements InterfaceC0952e0<Rect> {
        public a() {
        }

        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;)V */
        @Override // androidx.p616lifecycle.InterfaceC0952e0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo4884a(Rect rect) {
            if (rect != null) {
                C8527c.this.f31329f = rect;
                C8527c.this.m34397d();
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m34397d() {
        if (this.f31328e == EnumC12462t0.EXPERIENCE) {
            mo34398e(0, 0, 0, 0);
            return;
        }
        Rect rect = this.f31329f;
        if (rect != null) {
            mo34398e(rect.top, rect.left, rect.right, rect.bottom);
        }
    }

    /* JADX INFO: renamed from: e */
    public void mo34398e(int i10, int i11, int i12, int i13) {
        if (this.f31324a == null) {
            return;
        }
        C6124q.m27057b("AppInsetViewAdapter", "Insets: " + i10 + ", " + i11 + ", " + i12 + ", " + i13 + ", mode: " + this.f31328e);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f31324a.getLayoutParams();
        boolean z10 = layoutParams.topMargin != i10;
        boolean z11 = layoutParams.rightMargin != i12;
        boolean z12 = layoutParams.bottomMargin != i13;
        if (z10 || z11 || z12) {
            layoutParams.topMargin = i10;
            layoutParams.rightMargin = i12;
            layoutParams.bottomMargin = i13;
            this.f31324a.setLayoutParams(layoutParams);
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f31325b.getLayoutParams();
        if (z10) {
            layoutParams2.height = i10;
            this.f31325b.setLayoutParams(layoutParams2);
        }
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f31326c.getLayoutParams();
        if (z11) {
            layoutParams3.width = i12;
            this.f31326c.setLayoutParams(layoutParams3);
        }
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.f31327d.getLayoutParams();
        if (z12) {
            layoutParams4.height = i13;
            this.f31327d.setLayoutParams(layoutParams4);
        }
    }

    /* JADX INFO: renamed from: f */
    public Insets mo34399f(Insets insets) {
        return Insets.NONE;
    }

    /* JADX INFO: renamed from: g */
    public ViewGroup m34400g() {
        return this.f31324a;
    }

    /* JADX INFO: renamed from: h */
    public final View m34401h(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(C11338n0.f39869p, (ViewGroup) null);
        this.f31324a = (ViewGroup) viewInflate.findViewById(C11335m0.f39783O);
        this.f31325b = viewInflate.findViewById(C11335m0.f39785Q);
        this.f31326c = viewInflate.findViewById(C11335m0.f39784P);
        this.f31327d = viewInflate.findViewById(C11335m0.f39782N);
        return viewInflate;
    }

    /* JADX INFO: renamed from: i */
    public View m34402i(LayoutInflater layoutInflater, ComponentCallbacksC0929c componentCallbacksC0929c) {
        C6124q.m27057b("AppInsetViewAdapter", "inflate: Fragment = " + componentCallbacksC0929c);
        View viewM34401h = m34401h(layoutInflater);
        if (componentCallbacksC0929c != null) {
            ActivityC4831q activityC4831qM4693p = componentCallbacksC0929c.m4693p();
            if (activityC4831qM4693p instanceof AbstractActivityC3160b) {
                m34407n(componentCallbacksC0929c, ((AbstractActivityC3160b) activityC4831qM4693p).m14962G1());
                return viewM34401h;
            }
            if (activityC4831qM4693p instanceof MainGameActivity) {
                m34407n(componentCallbacksC0929c, ((MainGameActivity) activityC4831qM4693p).getAppInsetManager());
            }
        }
        return viewM34401h;
    }

    /* JADX INFO: renamed from: j */
    public View m34403j(LayoutInflater layoutInflater, AbstractActivityC3160b abstractActivityC3160b) {
        C6124q.m27057b("AppInsetViewAdapter", "inflate: Activity = " + abstractActivityC3160b);
        View viewM34401h = m34401h(layoutInflater);
        if (abstractActivityC3160b != null) {
            m34407n(abstractActivityC3160b, abstractActivityC3160b.m14962G1());
        }
        return viewM34401h;
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ WindowInsetsCompat m34404k(View view, WindowInsetsCompat windowInsetsCompat) {
        int i10 = f31323g;
        Insets insets = windowInsetsCompat.getInsets(i10);
        this.f31329f = new Rect(insets.left, insets.top, insets.right, insets.bottom);
        m34397d();
        if (this.f31328e != EnumC12462t0.EXPERIENCE) {
            insets = mo34399f(insets);
        }
        return new WindowInsetsCompat.Builder(windowInsetsCompat).setInsets(i10, insets).build();
    }

    /* JADX INFO: renamed from: l */
    public void m34405l(int i10) {
        View view = this.f31325b;
        if (view != null) {
            view.setBackgroundColor(i10);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m34406m() {
        ViewGroup viewGroup = this.f31324a;
        if (viewGroup == null) {
            return;
        }
        C0625o0.m2979A0(viewGroup, new InterfaceC0644y() { // from class: mi.b
            @Override // androidx.core.view.InterfaceC0644y
            /* JADX INFO: renamed from: K */
            public final WindowInsetsCompat mo460K(View view, WindowInsetsCompat windowInsetsCompat) {
                return this.f31322a.m34404k(view, windowInsetsCompat);
            }
        });
        C0625o0.m3034j0(this.f31324a);
    }

    /* JADX INFO: renamed from: n */
    public final void m34407n(InterfaceC0980s interfaceC0980s, @NonNull C8525a c8525a) {
        if (C11659h.m43403a().mo43728t5()) {
            m34406m();
        } else {
            c8525a.m34390b().m4857i(interfaceC0980s, new a());
        }
    }

    /* JADX INFO: renamed from: o */
    public void m34408o(EnumC12462t0 enumC12462t0) {
        ViewGroup viewGroup;
        this.f31328e = enumC12462t0;
        m34397d();
        if (!C11659h.m43403a().mo43728t5() || (viewGroup = this.f31324a) == null) {
            return;
        }
        C0625o0.m3034j0(viewGroup);
    }
}
