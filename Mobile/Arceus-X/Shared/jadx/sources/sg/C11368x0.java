package sg;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.DialogInterfaceC0408a;
import com.roblox.client.AbstractActivityC3152a;
import com.roblox.client.AbstractActivityC3160b;
import dk.C4636e;
import hk.C6413b;
import hk.C6414c;
import p093e4.ActivityC4831q;
import p093e4.DialogInterfaceOnCancelListenerC4819k;
import p151gk.C6124q;
import p293mi.C8527c;
import p337ol.EnumC9799a;

/* JADX INFO: renamed from: sg.x0 */
/* JADX INFO: loaded from: classes2.dex */
public class C11368x0 extends DialogInterfaceOnCancelListenerC4819k implements C4636e.b {

    /* JADX INFO: renamed from: F0 */
    public C4636e f40184F0;

    /* JADX INFO: renamed from: v0 */
    public final String f40186v0 = "dialogHeight";

    /* JADX INFO: renamed from: w0 */
    public final String f40187w0 = "dialogWidth";

    /* JADX INFO: renamed from: x0 */
    public final String f40188x0 = "dialogGravity";

    /* JADX INFO: renamed from: y0 */
    public final String f40189y0 = "dialogOffsetY";

    /* JADX INFO: renamed from: z0 */
    public final String f40190z0 = "dialogOffsetX";

    /* JADX INFO: renamed from: A0 */
    public int f40179A0 = 0;

    /* JADX INFO: renamed from: B0 */
    public int f40180B0 = 0;

    /* JADX INFO: renamed from: C0 */
    public int f40181C0 = 0;

    /* JADX INFO: renamed from: D0 */
    public int f40182D0 = 0;

    /* JADX INFO: renamed from: E0 */
    public int f40183E0 = 0;

    /* JADX INFO: renamed from: G0 */
    public C8527c f40185G0 = mo1227w2();

    /* JADX INFO: renamed from: sg.x0$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f40191a;

        static {
            int[] iArr = new int[EnumC9799a.values().length];
            f40191a = iArr;
            try {
                iArr[EnumC9799a.LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40191a[EnumC9799a.CLASSIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f40191a[EnumC9799a.DARK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // p093e4.DialogInterfaceOnCancelListenerC4819k, androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: F0 */
    public void mo4599F0(Bundle bundle) {
        super.mo4599F0(bundle);
        Bundle bundleM4704t = m4704t();
        if (bundleM4704t != null) {
            this.f40179A0 = bundleM4704t.getInt("dialogHeight", 0);
            this.f40180B0 = bundleM4704t.getInt("dialogWidth", 0);
            this.f40181C0 = bundleM4704t.getInt("dialogGravity", 0);
            this.f40182D0 = bundleM4704t.getInt("dialogOffsetY", 0);
            this.f40183E0 = bundleM4704t.getInt("dialogOffsetX", 0);
        }
    }

    /* JADX INFO: renamed from: U */
    public void mo15184U(int i10) {
        ActivityC4831q activityC4831qM4693p = m4693p();
        if (activityC4831qM4693p instanceof AbstractActivityC3160b) {
            ((AbstractActivityC3160b) activityC4831qM4693p).m14968U(i10);
        }
    }

    /* JADX INFO: renamed from: W */
    public void mo15185W(String str) {
        ActivityC4831q activityC4831qM4693p = m4693p();
        if (activityC4831qM4693p instanceof AbstractActivityC3160b) {
            ((AbstractActivityC3160b) activityC4831qM4693p).m14969W(str);
        }
    }

    @Override // p093e4.DialogInterfaceOnCancelListenerC4819k, androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: c1 */
    public void mo4663c1() {
        super.mo4663c1();
    }

    @Override // p093e4.DialogInterfaceOnCancelListenerC4819k, androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: d1 */
    public void mo4665d1() {
        super.mo4665d1();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: e1 */
    public void mo4667e1(@NonNull View view, Bundle bundle) {
        super.mo4667e1(view, bundle);
        C4636e c4636e = new C4636e(this);
        this.f40184F0 = c4636e;
        c4636e.m22859b(m4680k0());
    }

    /* JADX INFO: renamed from: u */
    public void mo14822u(EnumC9799a enumC9799a) {
        int color;
        C6124q.m27057b("rbx.theme", getClass().getSimpleName() + ".onThemeChanged() " + enumC9799a);
        if (this.f40185G0 != null) {
            int i10 = a.f40191a[enumC9799a.ordinal()];
            if (i10 != 1) {
                color = i10 != 2 ? m4637T().getColor(C11326j0.f39717h) : m4637T().getColor(C11326j0.f39710a);
            } else {
                color = m4637T().getColor(C11326j0.f39724o);
            }
            this.f40185G0.m34405l(color);
        }
    }

    /* JADX INFO: renamed from: u2 */
    public boolean mo1226u2() {
        ActivityC4831q activityC4831qM4693p = m4693p();
        if (activityC4831qM4693p instanceof AbstractActivityC3152a) {
            return ((AbstractActivityC3152a) activityC4831qM4693p).m14844N1();
        }
        C6124q.m27066k("roblox.app", "The activity containing this fragment must be of type RobloxActivity!");
        return false;
    }

    /* JADX INFO: renamed from: v2 */
    public synchronized void m42577v2(CharSequence charSequence) {
        ActivityC4831q activityC4831qM4693p = m4693p();
        if (activityC4831qM4693p == null) {
            return;
        }
        DialogInterfaceC0408a dialogInterfaceC0408aM1517a = new DialogInterfaceC0408a.a(activityC4831qM4693p).m1517a();
        TextView textView = new TextView(activityC4831qM4693p);
        String string = activityC4831qM4693p.getString(C11347q0.f39945W);
        int iIndexOf = charSequence.toString().indexOf(string);
        C6413b.m28003b(textView, charSequence.toString(), new C6414c(activityC4831qM4693p, null, string, iIndexOf, iIndexOf + string.length()));
        textView.setTextSize(20.0f);
        textView.setEllipsize(null);
        dialogInterfaceC0408aM1517a.m1516w(textView, 150, 100, 150, 100);
        dialogInterfaceC0408aM1517a.setCanceledOnTouchOutside(true);
        try {
            dialogInterfaceC0408aM1517a.show();
        } catch (WindowManager.BadTokenException unused) {
        }
    }

    /* JADX INFO: renamed from: w2 */
    public C8527c mo1227w2() {
        return null;
    }

    /* JADX INFO: renamed from: x2 */
    public View m42578x2(LayoutInflater layoutInflater, View view) {
        C8527c c8527c = this.f40185G0;
        if (c8527c == null) {
            return view;
        }
        View viewM34402i = c8527c.m34402i(layoutInflater, this);
        this.f40185G0.m34400g().addView(view);
        return viewM34402i;
    }

    /* JADX INFO: renamed from: y2 */
    public void m42579y2(int i10, int i11) {
        ActivityC4831q activityC4831qM4693p = m4693p();
        if (activityC4831qM4693p instanceof AbstractActivityC3160b) {
            ((AbstractActivityC3160b) activityC4831qM4693p).m14966K1(i10, i11);
        }
    }

    @Override // p093e4.DialogInterfaceOnCancelListenerC4819k, androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: z0 */
    public void mo4722z0(Bundle bundle) {
        super.mo4722z0(bundle);
        Dialog dialogM23328h2 = m23328h2();
        if (dialogM23328h2 != null) {
            Window window = dialogM23328h2.getWindow();
            if (window != null) {
                int i10 = this.f40179A0;
                if (i10 != 0) {
                    int i11 = this.f40180B0;
                    if (i11 == 0) {
                        i11 = -2;
                    }
                    window.setLayout(i11, i10);
                }
                window.setGravity(this.f40181C0);
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.y = this.f40182D0;
                attributes.x = this.f40183E0;
                window.setAttributes(attributes);
            }
            dialogM23328h2.setCanceledOnTouchOutside(true);
        }
    }

    /* JADX INFO: renamed from: z2 */
    public void m42580z2(String str, int i10) {
        ActivityC4831q activityC4831qM4693p = m4693p();
        if (activityC4831qM4693p instanceof AbstractActivityC3160b) {
            ((AbstractActivityC3160b) activityC4831qM4693p).m14967L1(str, i10);
        }
    }
}
