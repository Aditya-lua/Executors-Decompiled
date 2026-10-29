package p491vh;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.roblox.client.components.RobloxToolbar;
import dk.InterfaceC4635d;
import fk.C5654c;
import p093e4.ActivityC4831q;
import p104ei.C5130h;
import p105ej.AbstractC5153k;
import p105ej.C5154l;
import p337ol.EnumC9799a;
import sg.C11326j0;
import sg.C11335m0;
import sg.C11338n0;
import sg.C11347q0;
import sg.C11356t0;
import sg.C11372y1;
import th.C11659h;
import vg.C12173c0;
import vi.C12217h;

/* JADX INFO: renamed from: vh.k */
/* JADX INFO: loaded from: classes2.dex */
public class C12207k extends C11372y1 {

    /* JADX INFO: renamed from: C0 */
    public boolean f43021C0 = false;

    /* JADX INFO: renamed from: D0 */
    public boolean f43022D0 = false;

    /* JADX INFO: renamed from: E0 */
    public boolean f43023E0 = false;

    /* JADX INFO: renamed from: F0 */
    public TextView f43024F0;

    /* JADX INFO: renamed from: G0 */
    public FrameLayout f43025G0;

    /* JADX INFO: renamed from: H0 */
    public ImageView f43026H0;

    /* JADX INFO: renamed from: I0 */
    public InterfaceC4635d f43027I0;

    /* JADX INFO: renamed from: J0 */
    public InterfaceC4635d f43028J0;

    /* JADX INFO: renamed from: K0 */
    public InterfaceC4635d f43029K0;

    /* JADX INFO: renamed from: L0 */
    public RobloxToolbar.C3171c f43030L0;

    /* JADX INFO: renamed from: vh.k$a */
    public class a implements C12217h.d {
        public a() {
        }

        @Override // vi.C12217h.d
        /* JADX INFO: renamed from: a */
        public void mo15393a(boolean z10, int i10) {
            C12207k.this.m45192o3();
        }
    }

    /* JADX INFO: renamed from: vh.k$b */
    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f43032a;

        static {
            int[] iArr = new int[EnumC9799a.values().length];
            f43032a = iArr;
            try {
                iArr[EnumC9799a.DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f43032a[EnumC9799a.LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: vh.k$c */
    public static class c implements InterfaceC4635d {

        /* JADX INFO: renamed from: a */
        public final int f43033a;

        public c(Context context) {
            this.f43033a = context.getResources().getColor(C11326j0.f39721l);
        }

        @Override // dk.InterfaceC4635d
        /* JADX INFO: renamed from: a */
        public int mo22857a(EnumC9799a enumC9799a) {
            if (b.f43032a[enumC9799a.ordinal()] != 1) {
                return this.f43033a;
            }
            return -1;
        }
    }

    /* JADX INFO: renamed from: vh.k$d */
    public static class d implements InterfaceC4635d {

        /* JADX INFO: renamed from: a */
        public final int f43034a;

        /* JADX INFO: renamed from: b */
        public final int f43035b;

        public d(Context context) {
            this.f43034a = context.getResources().getColor(C11326j0.f39720k);
            this.f43035b = context.getResources().getColor(C11326j0.f39718i);
        }

        @Override // dk.InterfaceC4635d
        /* JADX INFO: renamed from: a */
        public int mo22857a(EnumC9799a enumC9799a) {
            return b.f43032a[enumC9799a.ordinal()] != 1 ? this.f43034a : this.f43035b;
        }
    }

    /* JADX INFO: renamed from: vh.k$e */
    public static class e implements InterfaceC4635d {

        /* JADX INFO: renamed from: a */
        public final int f43036a;

        /* JADX INFO: renamed from: b */
        public final int f43037b;

        public e(Context context) {
            this.f43036a = context.getResources().getColor(C11326j0.f39722m);
            this.f43037b = context.getResources().getColor(C11326j0.f39715f);
        }

        @Override // dk.InterfaceC4635d
        /* JADX INFO: renamed from: a */
        public int mo22857a(EnumC9799a enumC9799a) {
            return b.f43032a[enumC9799a.ordinal()] != 1 ? this.f43036a : this.f43037b;
        }
    }

    /* JADX INFO: renamed from: j3 */
    private void m45186j3() {
        m4693p().m23360l1().m4416a1();
    }

    /* JADX INFO: renamed from: m3 */
    private void m45187m3() {
        C12217h.m45288e().m45300m(new a(), new C5130h());
    }

    /* JADX INFO: renamed from: n3 */
    private void m45188n3(LayoutInflater layoutInflater) {
        FrameLayout frameLayout = (FrameLayout) layoutInflater.inflate(C11338n0.f39853F, this.f40211o0);
        frameLayout.setVisibility(0);
        ImageView imageView = (ImageView) frameLayout.findViewById(C11335m0.f39815k);
        this.f43026H0 = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: vh.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f43020a.m45191l3(view);
            }
        });
        this.f43024F0 = (TextView) frameLayout.findViewById(C11335m0.f39829r);
        this.f43025G0 = (FrameLayout) frameLayout.findViewById(C11335m0.f39831s);
    }

    /* JADX INFO: renamed from: p3 */
    private void m45189p3(EnumC9799a enumC9799a) {
        if (!C11659h.m43403a().mo43426D0()) {
            this.f43025G0.setBackgroundColor(this.f43022D0 ? this.f43028J0.mo22857a(enumC9799a) : this.f43027I0.mo22857a(enumC9799a));
            this.f43024F0.setTextColor(this.f43029K0.mo22857a(enumC9799a));
            this.f43026H0.setImageResource(this.f43030L0.mo15079a(enumC9799a));
            return;
        }
        FrameLayout frameLayout = this.f43025G0;
        if (frameLayout != null) {
            frameLayout.setBackgroundColor(this.f43022D0 ? this.f43028J0.mo22857a(enumC9799a) : this.f43027I0.mo22857a(enumC9799a));
        }
        TextView textView = this.f43024F0;
        if (textView != null) {
            textView.setTextColor(this.f43029K0.mo22857a(enumC9799a));
        }
        ImageView imageView = this.f43026H0;
        if (imageView != null) {
            imageView.setImageResource(this.f43030L0.mo15079a(enumC9799a));
        }
    }

    @Override // sg.C11372y1
    /* JADX INFO: renamed from: F2 */
    public String mo42641F2() {
        if (this.f43022D0) {
            return "buildersClub";
        }
        return this.f43021C0 ? "robux" : super.mo42641F2();
    }

    @Override // sg.C11372y1, androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: J0 */
    public View mo1225J0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TextView textView;
        View viewMo1225J0 = super.mo1225J0(layoutInflater, viewGroup, bundle);
        this.f43027I0 = new e(mo4715x());
        this.f43028J0 = new d(mo4715x());
        this.f43029K0 = new c(mo4715x());
        this.f43030L0 = new RobloxToolbar.C3171c();
        if (C11659h.m43403a().mo43426D0()) {
            Bundle bundleM4704t = m4704t();
            if (bundleM4704t != null) {
                this.f43021C0 = bundleM4704t.getBoolean("showRobux", false);
                this.f43022D0 = bundleM4704t.getBoolean("showPremium", false);
                this.f43023E0 = bundleM4704t.getBoolean("hideNativeHeader", false);
            }
            if (!this.f43023E0) {
                m45188n3(layoutInflater);
            }
            if (this.f43021C0) {
                m45192o3();
                m45187m3();
            } else if (this.f43022D0 && (textView = this.f43024F0) != null) {
                textView.setText(C11347q0.f40028z);
            }
        } else {
            m45188n3(layoutInflater);
            Bundle bundleM4704t2 = m4704t();
            if (bundleM4704t2 != null) {
                if (bundleM4704t2.getBoolean("showRobux", false)) {
                    this.f43021C0 = true;
                    m45192o3();
                    m45187m3();
                } else if (bundleM4704t2.getBoolean("showPremium", false)) {
                    this.f43022D0 = true;
                    this.f43024F0.setText(C11347q0.f40028z);
                }
            }
        }
        m45189p3(C5654c.m25669c().m25675g());
        return viewMo1225J0;
    }

    @Override // sg.C11372y1, androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: M0 */
    public void mo4618M0() {
        if (!C12217h.m45288e().m45295f() && (this.f43022D0 || this.f43021C0)) {
            C11356t0.m42534d(mo42641F2(), "close");
        }
        super.mo4618M0();
    }

    @Override // sg.C11372y1
    /* JADX INFO: renamed from: g3 */
    public C12173c0.b mo42656g3() {
        return C12173c0.b.ROBUX_PREMIUM_FRAGMENT;
    }

    /* JADX INFO: renamed from: k3 */
    public final /* synthetic */ void m45190k3(ActivityC4831q activityC4831q) {
        if (activityC4831q == null || activityC4831q.isFinishing() || activityC4831q.isDestroyed()) {
            return;
        }
        if (this.f43022D0) {
            m45186j3();
        } else {
            m45187m3();
        }
    }

    /* JADX INFO: renamed from: l3 */
    public final /* synthetic */ void m45191l3(View view) {
        m45186j3();
    }

    /* JADX INFO: renamed from: o3 */
    public void m45192o3() {
        if (!C11659h.m43403a().mo43426D0()) {
            if (this.f43021C0 && m4694p0()) {
                this.f43024F0.setText(m4669g0(C11347q0.f39988l1, C5154l.m23987a(C5654c.m25669c().m25674f())));
                return;
            }
            return;
        }
        if (this.f43021C0 && m4694p0() && this.f43024F0 != null) {
            this.f43024F0.setText(m4669g0(C11347q0.f39988l1, C5154l.m23987a(C5654c.m25669c().m25674f())));
        }
    }

    @Override // sg.C11372y1
    /* JADX INFO: renamed from: x2 */
    public void mo42657x2(AbstractC5153k abstractC5153k) {
        super.mo42657x2(abstractC5153k);
        final ActivityC4831q activityC4831qM4693p = m4693p();
        if (activityC4831qM4693p != null) {
            activityC4831qM4693p.runOnUiThread(new Runnable() { // from class: vh.i
                @Override // java.lang.Runnable
                public final void run() {
                    this.f43018a.m45190k3(activityC4831qM4693p);
                }
            });
        }
    }
}
