package rg;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class x0 extends e4.k implements bk.e.b {
    public bk.e F0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final String f30679v0 = "dialogHeight";

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final String f30680w0 = "dialogWidth";

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final String f30681x0 = "dialogGravity";

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final String f30682y0 = "dialogOffsetY";

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public final String f30683z0 = "dialogOffsetX";
    public int A0 = 0;
    public int B0 = 0;
    public int C0 = 0;
    public int D0 = 0;
    public int E0 = 0;
    public ki.c G0 = w2();

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30684a;

        static {
            int[] iArr = new int[ml.a.values().length];
            f30684a = iArr;
            try {
                iArr[ml.a.LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30684a[ml.a.CLASSIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30684a[ml.a.DARK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // e4.k, androidx.fragment.app.c
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
        e4.q qVarP = p();
        if (qVarP instanceof com.roblox.client.b) {
            ((com.roblox.client.b) qVarP).T(i10);
        }
    }

    public void V(String str) {
        e4.q qVarP = p();
        if (qVarP instanceof com.roblox.client.b) {
            ((com.roblox.client.b) qVarP).V(str);
        }
    }

    public void a0(ml.a aVar) {
        int color;
        ek.q.b("rbx.theme", getClass().getSimpleName() + ".onThemeChanged() " + aVar);
        if (this.G0 != null) {
            int i10 = a.f30684a[aVar.ordinal()];
            if (i10 != 1) {
                color = i10 != 2 ? S().getColor(j0.f30382h) : S().getColor(j0.f30376a);
            } else {
                color = S().getColor(j0.f30389o);
            }
            this.G0.l(color);
        }
    }

    @Override // e4.k, androidx.fragment.app.c
    public void c1() {
        super.c1();
    }

    @Override // e4.k, androidx.fragment.app.c
    public void d1() {
        super.d1();
    }

    @Override // androidx.fragment.app.c
    public void e1(@NonNull View view, Bundle bundle) {
        super.e1(view, bundle);
        bk.e eVar = new bk.e(this);
        this.F0 = eVar;
        eVar.b(k0());
    }

    public boolean u2() {
        e4.q qVarP = p();
        if (qVarP instanceof com.roblox.client.a) {
            return ((com.roblox.client.a) qVarP).N1();
        }
        ek.q.k("roblox.app", "The activity containing this fragment must be of type RobloxActivity!");
        return false;
    }

    public synchronized void v2(CharSequence charSequence) {
        e4.q qVarP = p();
        if (qVarP == null) {
            return;
        }
        androidx.appcompat.app.a aVarA = new androidx.appcompat.app.a.C0009a(qVarP).a();
        TextView textView = new TextView(qVarP);
        String string = qVarP.getString(q0.W);
        int iIndexOf = charSequence.toString().indexOf(string);
        fk.b.b(textView, charSequence.toString(), new fk.c(qVarP, null, string, iIndexOf, iIndexOf + string.length()));
        textView.setTextSize(20.0f);
        textView.setEllipsize(null);
        aVarA.x(textView, 150, 100, 150, 100);
        aVarA.setCanceledOnTouchOutside(true);
        try {
            aVarA.show();
        } catch (WindowManager.BadTokenException unused) {
        }
    }

    public ki.c w2() {
        return null;
    }

    public View x2(LayoutInflater layoutInflater, View view) {
        ki.c cVar = this.G0;
        if (cVar == null) {
            return view;
        }
        View viewI = cVar.i(layoutInflater, this);
        this.G0.g().addView(view);
        return viewI;
    }

    public void y2(int i10, int i11) {
        e4.q qVarP = p();
        if (qVarP instanceof com.roblox.client.b) {
            ((com.roblox.client.b) qVarP).K1(i10, i11);
        }
    }

    @Override // e4.k, androidx.fragment.app.c
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
        e4.q qVarP = p();
        if (qVarP instanceof com.roblox.client.b) {
            ((com.roblox.client.b) qVarP).L1(str, i10);
        }
    }
}
