package p491vh;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.roblox.client.C3161c;
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
import vg.C12173c0;
import vi.C12217h;

/* JADX INFO: renamed from: vh.h */
/* JADX INFO: loaded from: classes2.dex */
public class C12204h extends C3161c {

    /* JADX INFO: renamed from: g1 */
    public boolean f43002g1 = false;

    /* JADX INFO: renamed from: h1 */
    public boolean f43003h1 = false;

    /* JADX INFO: renamed from: i1 */
    public TextView f43004i1;

    /* JADX INFO: renamed from: j1 */
    public FrameLayout f43005j1;

    /* JADX INFO: renamed from: k1 */
    public ImageView f43006k1;

    /* JADX INFO: renamed from: l1 */
    public InterfaceC4635d f43007l1;

    /* JADX INFO: renamed from: m1 */
    public InterfaceC4635d f43008m1;

    /* JADX INFO: renamed from: n1 */
    public InterfaceC4635d f43009n1;

    /* JADX INFO: renamed from: o1 */
    public RobloxToolbar.C3171c f43010o1;

    /* JADX INFO: renamed from: vh.h$a */
    public class a implements C12217h.d {
        public a() {
        }

        @Override // vi.C12217h.d
        /* JADX INFO: renamed from: a */
        public void mo15393a(boolean z10, int i10) {
            C12204h.this.m45182P3();
        }
    }

    /* JADX INFO: renamed from: vh.h$b */
    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f43012a;

        static {
            int[] iArr = new int[EnumC9799a.values().length];
            f43012a = iArr;
            try {
                iArr[EnumC9799a.DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f43012a[EnumC9799a.LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: vh.h$c */
    public static class c implements InterfaceC4635d {

        /* JADX INFO: renamed from: a */
        public final int f43013a;

        public c(Context context) {
            this.f43013a = context.getResources().getColor(C11326j0.f39721l);
        }

        @Override // dk.InterfaceC4635d
        /* JADX INFO: renamed from: a */
        public int mo22857a(EnumC9799a enumC9799a) {
            if (b.f43012a[enumC9799a.ordinal()] != 1) {
                return this.f43013a;
            }
            return -1;
        }
    }

    /* JADX INFO: renamed from: vh.h$d */
    public static class d implements InterfaceC4635d {

        /* JADX INFO: renamed from: a */
        public final int f43014a;

        /* JADX INFO: renamed from: b */
        public final int f43015b;

        public d(Context context) {
            this.f43014a = context.getResources().getColor(C11326j0.f39720k);
            this.f43015b = context.getResources().getColor(C11326j0.f39718i);
        }

        @Override // dk.InterfaceC4635d
        /* JADX INFO: renamed from: a */
        public int mo22857a(EnumC9799a enumC9799a) {
            return b.f43012a[enumC9799a.ordinal()] != 1 ? this.f43014a : this.f43015b;
        }
    }

    /* JADX INFO: renamed from: vh.h$e */
    public static class e implements InterfaceC4635d {

        /* JADX INFO: renamed from: a */
        public final int f43016a;

        /* JADX INFO: renamed from: b */
        public final int f43017b;

        public e(Context context) {
            this.f43016a = context.getResources().getColor(C11326j0.f39722m);
            this.f43017b = context.getResources().getColor(C11326j0.f39715f);
        }

        @Override // dk.InterfaceC4635d
        /* JADX INFO: renamed from: a */
        public int mo22857a(EnumC9799a enumC9799a) {
            return b.f43012a[enumC9799a.ordinal()] != 1 ? this.f43016a : this.f43017b;
        }
    }

    @Override // com.roblox.client.C3161c
    /* JADX INFO: renamed from: I3 */
    public C12173c0.b mo15001I3() {
        return C12173c0.b.ROBUX_PREMIUM_DIALOG_FRAGMENT;
    }

    @Override // com.roblox.client.C3161c, androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: J0 */
    public View mo1225J0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewMo1225J0 = super.mo1225J0(layoutInflater, viewGroup, bundle);
        this.f43007l1 = new e(mo4715x());
        this.f43008m1 = new d(mo4715x());
        this.f43009n1 = new c(mo4715x());
        this.f43010o1 = new RobloxToolbar.C3171c();
        m45181O3(layoutInflater);
        Bundle bundleM4704t = m4704t();
        if (bundleM4704t != null) {
            if (bundleM4704t.getBoolean("showRobux", false)) {
                this.f43002g1 = true;
                m45182P3();
                m45180N3();
            } else if (bundleM4704t.getBoolean("showPremium", false)) {
                this.f43003h1 = true;
                this.f43004i1.setText(C11347q0.f40028z);
            }
        }
        m45183Q3(C5654c.m25669c().m25675g());
        return viewMo1225J0;
    }

    /* JADX INFO: renamed from: L3 */
    public final /* synthetic */ void m45178L3(ActivityC4831q activityC4831q) {
        if (activityC4831q == null || activityC4831q.isFinishing() || activityC4831q.isDestroyed()) {
            return;
        }
        if (this.f43003h1) {
            mo12190e2();
        } else {
            m45180N3();
        }
    }

    /* JADX INFO: renamed from: M3 */
    public final /* synthetic */ void m45179M3(View view) {
        mo12190e2();
    }

    /* JADX INFO: renamed from: N3 */
    public final void m45180N3() {
        C12217h.m45288e().m45300m(new a(), new C5130h());
    }

    /* JADX INFO: renamed from: O3 */
    public final void m45181O3(LayoutInflater layoutInflater) {
        FrameLayout frameLayout = (FrameLayout) layoutInflater.inflate(C11338n0.f39853F, this.f11693Q0);
        frameLayout.setVisibility(0);
        ImageView imageView = (ImageView) frameLayout.findViewById(C11335m0.f39815k);
        this.f43006k1 = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: vh.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f42999a.m45179M3(view);
            }
        });
        this.f43004i1 = (TextView) frameLayout.findViewById(C11335m0.f39829r);
        this.f43005j1 = (FrameLayout) frameLayout.findViewById(C11335m0.f39831s);
    }

    /* JADX INFO: renamed from: P3 */
    public void m45182P3() {
        if (this.f43002g1 && m4694p0()) {
            this.f43004i1.setText(m4669g0(C11347q0.f39988l1, C5154l.m23987a(C5654c.m25669c().m25674f())));
        }
    }

    /* JADX INFO: renamed from: Q3 */
    public final void m45183Q3(EnumC9799a enumC9799a) {
        this.f43005j1.setBackgroundColor(this.f43003h1 ? this.f43008m1.mo22857a(enumC9799a) : this.f43007l1.mo22857a(enumC9799a));
        this.f43004i1.setTextColor(this.f43009n1.mo22857a(enumC9799a));
        this.f43006k1.setImageResource(this.f43010o1.mo15079a(enumC9799a));
    }

    @Override // com.roblox.client.C3161c
    /* JADX INFO: renamed from: Y2 */
    public void mo15003Y2(AbstractC5153k abstractC5153k) {
        super.mo15003Y2(abstractC5153k);
        final ActivityC4831q activityC4831qM4693p = m4693p();
        if (activityC4831qM4693p != null) {
            activityC4831qM4693p.runOnUiThread(new Runnable() { // from class: vh.g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f43000a.m45178L3(activityC4831qM4693p);
                }
            });
        }
    }

    @Override // com.roblox.client.C3161c
    /* JADX INFO: renamed from: c3 */
    public String mo15007c3() {
        if (this.f43003h1) {
            return "buildersClub";
        }
        return this.f43002g1 ? "robux" : super.mo15007c3();
    }

    @Override // p093e4.DialogInterfaceOnCancelListenerC4819k, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (C12217h.m45288e().m45295f()) {
            return;
        }
        if (this.f43003h1 || this.f43002g1) {
            C11356t0.m42534d(mo15007c3(), "close");
        }
    }

    @Override // com.roblox.client.C3161c, sg.C11368x0, dk.C4636e.b
    /* JADX INFO: renamed from: u */
    public void mo14822u(EnumC9799a enumC9799a) {
        super.mo14822u(enumC9799a);
        m45183Q3(enumC9799a);
    }
}
