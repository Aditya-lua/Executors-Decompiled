package bh;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class x0 extends f4.o implements lk.e.b {
    public lk.e F0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final String f4380v0 = "dialogHeight";

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final String f4381w0 = "dialogWidth";

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final String f4382x0 = "dialogGravity";

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final String f4383y0 = "dialogOffsetY";

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public final String f4384z0 = "dialogOffsetX";
    public int A0 = 0;
    public int B0 = 0;
    public int C0 = 0;
    public int D0 = 0;
    public int E0 = 0;
    public ui.c G0 = w2();

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4385a;

        static {
            int[] iArr = new int[cm.a.values().length];
            f4385a = iArr;
            try {
                iArr[cm.a.LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4385a[cm.a.CLASSIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4385a[cm.a.DARK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // f4.o, f4.q
    public void F0(Bundle bundle) {
        super.F0(bundle);
        Bundle bundleT = t();
        if (bundleT != null) {
            this.A0 = bundleT.getInt("dialogHeight", 0);
            this.B0 = bundleT.getInt("dialogWidth", 0);
            this.C0 = bundleT.getInt("dialogGravity", 0);
            this.D0 = bundleT.getInt("dialogOffsetY", 0);
            this.E0 = bundleT.getInt("dialogOffsetX", 0);
        }
    }

    public void T(int i10) {
        f4.v vVarP = p();
        if (vVarP instanceof com.roblox.client.b) {
            ((com.roblox.client.b) vVarP).T(i10);
        }
    }

    public void V(String str) {
        f4.v vVarP = p();
        if (vVarP instanceof com.roblox.client.b) {
            ((com.roblox.client.b) vVarP).V(str);
        }
    }

    @Override // f4.o, f4.q
    public void c1() {
        super.c1();
    }

    @Override // f4.o, f4.q
    public void d1() {
        super.d1();
    }

    @Override // f4.q
    public void e1(@NonNull View view, Bundle bundle) {
        super.e1(view, bundle);
        lk.e eVar = new lk.e(this);
        this.F0 = eVar;
        eVar.b(k0());
    }

    @Override // lk.e.b
    public void g0(cm.a aVar) {
        int color;
        ok.q.b("rbx.theme", getClass().getSimpleName() + ".onThemeChanged() " + aVar);
        if (this.G0 != null) {
            int i10 = a.f4385a[aVar.ordinal()];
            if (i10 != 1) {
                color = i10 != 2 ? S().getColor(j0.f4084g) : S().getColor(j0.f4079a);
            } else {
                color = S().getColor(j0.f4090m);
            }
            this.G0.l(color);
        }
    }

    public boolean u2() {
        f4.v vVarP = p();
        if (vVarP instanceof com.roblox.client.a) {
            return ((com.roblox.client.a) vVarP).N1();
        }
        ok.q.k("roblox.app", "The activity containing this fragment must be of type RobloxActivity!");
        return false;
    }

    public synchronized void v2(CharSequence charSequence) {
        f4.v vVarP = p();
        if (vVarP == null) {
            return;
        }
        androidx.appcompat.app.a aVarA = new androidx.appcompat.app.a.C0021a(vVarP).a();
        TextView textView = new TextView(vVarP);
        String string = vVarP.getString(q0.W);
        int iIndexOf = charSequence.toString().indexOf(string);
        pk.b.b(textView, charSequence.toString(), new pk.c(vVarP, null, string, iIndexOf, iIndexOf + string.length()));
        textView.setTextSize(20.0f);
        textView.setEllipsize(null);
        aVarA.w(textView, 150, 100, 150, 100);
        aVarA.setCanceledOnTouchOutside(true);
        try {
            aVarA.show();
        } catch (WindowManager.BadTokenException unused) {
        }
    }

    public ui.c w2() {
        return null;
    }

    public View x2(LayoutInflater layoutInflater, View view) {
        ui.c cVar = this.G0;
        if (cVar == null) {
            return view;
        }
        View viewJ = cVar.j(layoutInflater, this);
        this.G0.g().addView(view);
        return viewJ;
    }

    public void y2(int i10, int i11) {
        f4.v vVarP = p();
        if (vVarP instanceof com.roblox.client.b) {
            ((com.roblox.client.b) vVarP).K1(i10, i11);
        }
    }

    @Override // f4.o, f4.q
    public void z0(Bundle bundle) {
        super.z0(bundle);
        Dialog dialogH2 = h2();
        if (dialogH2 != null) {
            Window window = dialogH2.getWindow();
            if (window != null) {
                int i10 = this.A0;
                if (i10 != 0) {
                    int i11 = this.B0;
                    if (i11 == 0) {
                        i11 = -2;
                    }
                    window.setLayout(i11, i10);
                }
                window.setGravity(this.C0);
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.y = this.D0;
                attributes.x = this.E0;
                window.setAttributes(attributes);
            }
            dialogH2.setCanceledOnTouchOutside(true);
        }
    }

    public void z2(String str, int i10) {
        f4.v vVarP = p();
        if (vVarP instanceof com.roblox.client.b) {
            ((com.roblox.client.b) vVarP).L1(str, i10);
        }
    }
}
