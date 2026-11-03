package com.roblox.client.components;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import ek.q;
import gl.AndroidColorToken;
import rg.h0;
import rg.j0;
import rg.l0;
import rg.m0;

/* JADX INFO: loaded from: classes2.dex */
public class RobloxToolbar extends Toolbar implements bk.e.b {
    public TextView T;
    public TextView U;
    public ImageButton V;
    public ImageButton W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public Integer f9067a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public Integer f9068b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public e f9069c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public h f9070d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public i f9071e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public g f9072f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public e f9073g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public ml.a f9074h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public bk.c f9075i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public gl.c f9076j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public dh.i f9077k0;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9078a;

        static {
            int[] iArr = new int[ml.a.values().length];
            f9078a = iArr;
            try {
                iArr[ml.a.DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9078a[ml.a.LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class b implements e {
        @Override // com.roblox.client.components.RobloxToolbar.e
        public int a(ml.a aVar) {
            int i10 = a.f9078a[aVar.ordinal()];
            if (i10 != 1) {
                return i10 != 2 ? l0.f30413n : l0.f30415p;
            }
            return l0.f30414o;
        }
    }

    public static class c implements e {
        @Override // com.roblox.client.components.RobloxToolbar.e
        public int a(ml.a aVar) {
            int i10 = a.f9078a[aVar.ordinal()];
            if (i10 != 1) {
                return i10 != 2 ? l0.f30416q : l0.f30418s;
            }
            return l0.f30417r;
        }
    }

    public static class d implements h {
        @Override // com.roblox.client.components.RobloxToolbar.h
        public int a(ml.a aVar) {
            return a.f9078a[aVar.ordinal()] != 1 ? j0.f30389o : j0.f30382h;
        }

        @Override // com.roblox.client.components.RobloxToolbar.h
        public int b(ml.a aVar) {
            return a.f9078a[aVar.ordinal()] != 1 ? j0.f30389o : j0.f30389o;
        }
    }

    public interface e {
        int a(ml.a aVar);
    }

    public static class f implements h {
        @Override // com.roblox.client.components.RobloxToolbar.h
        public int a(ml.a aVar) {
            return a.f9078a[aVar.ordinal()] != 1 ? j0.f30388n : j0.f30381g;
        }

        @Override // com.roblox.client.components.RobloxToolbar.h
        public int b(ml.a aVar) {
            return a.f9078a[aVar.ordinal()] != 1 ? j0.f30381g : j0.f30388n;
        }
    }

    public static class g {
        public String a(ml.a aVar) {
            int i10 = a.f9078a[aVar.ordinal()];
            return (i10 == 1 || i10 == 2) ? "BuilderSans-Medium.otf" : "SourceSansPro-Regular.ttf";
        }
    }

    public interface h {
        int a(ml.a aVar);

        int b(ml.a aVar);
    }

    public static class i {
        public String a(ml.a aVar) {
            int i10 = a.f9078a[aVar.ordinal()];
            if (i10 == 1 || i10 == 2) {
                return rh.h.a().e1() ? "BuilderSans-Bold.otf" : "BuilderSans-Medium.otf";
            }
            return "SourceSansPro-Semibold.ttf";
        }
    }

    public static class j implements h {
        @Override // com.roblox.client.components.RobloxToolbar.h
        public int a(ml.a aVar) {
            int i10 = a.f9078a[aVar.ordinal()];
            if (i10 != 1) {
                return i10 != 2 ? j0.f30376a : j0.f30389o;
            }
            return j0.f30382h;
        }

        @Override // com.roblox.client.components.RobloxToolbar.h
        public int b(ml.a aVar) {
            return a.f9078a[aVar.ordinal()] != 2 ? j0.f30391q : j0.f30382h;
        }
    }

    public RobloxToolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9067a0 = null;
        this.f9068b0 = null;
        this.f9076j0 = gl.b.tokens;
        X();
    }

    private void X() {
        this.f9075i0 = new bk.f();
        this.f9069c0 = new b();
        this.f9070d0 = new j();
        this.f9071e0 = new i();
        this.f9072f0 = new g();
        this.f9073g0 = new c();
    }

    private String getSubTitleFont() {
        return this.f9072f0.a(this.f9075i0.getTheme());
    }

    private String getTitleFont() {
        return this.f9071e0.a(this.f9075i0.getTheme());
    }

    public final void U() {
        ImageButton imageButton = new ImageButton(getContext(), null, h0.f30371a);
        this.V = imageButton;
        imageButton.setVisibility(8);
        Toolbar.g gVar = new Toolbar.g(-2, -2);
        gVar.f21447a = 8388613;
        addView(this.V, gVar);
    }

    public final int V(ml.a aVar) {
        if (aVar == null) {
            aVar = this.f9075i0.getTheme();
        }
        return this.f9073g0.a(aVar);
    }

    public final int W(ml.a aVar) {
        if (aVar == null) {
            aVar = this.f9075i0.getTheme();
        }
        return this.f9069c0.a(aVar);
    }

    public final void Y() {
        if (this.W == null) {
            this.W = (ImageButton) findViewById(m0.f30456o0);
        }
    }

    public final void Z() {
        if (this.V == null) {
            if (!rh.h.a().e1()) {
                U();
                return;
            }
            ImageButton imageButton = (ImageButton) findViewById(m0.f30458p0);
            this.V = imageButton;
            if (imageButton == null) {
                U();
            }
        }
    }

    @Override // bk.e.b
    public void a0(ml.a aVar) {
        if (aVar == this.f9074h0) {
            return;
        }
        this.f9074h0 = aVar;
        int backgroundColor = getBackgroundColor();
        int foregroundColor = getForegroundColor();
        setBackgroundColor(backgroundColor);
        setTitleTextColor(foregroundColor);
        setSubtitleTextColor(foregroundColor);
        e0(this.T, getTitleFont());
        e0(this.U, getSubTitleFont());
        boolean z10 = false;
        if (!rh.h.a().e1()) {
            g0(getNavigationIcon() != null);
            return;
        }
        ImageButton imageButton = this.W;
        if (imageButton != null && imageButton.getVisibility() == 0) {
            z10 = true;
        }
        g0(z10);
        ImageButton imageButton2 = this.V;
        if (imageButton2 == null || imageButton2.getVisibility() != 0) {
            return;
        }
        f0(true);
    }

    public final void b0() {
        if (this.U == null) {
            TextView textView = (TextView) findViewById(m0.f30460q0);
            this.U = textView;
            textView.setVisibility(0);
            Integer num = this.f9068b0;
            if (num != null) {
                this.U.setTextColor(num.intValue());
            }
            e0(this.U, getSubTitleFont());
        }
    }

    public final void c0() {
        if (this.T == null) {
            TextView textView = (TextView) findViewById(m0.f30462r0);
            this.T = textView;
            textView.setVisibility(0);
            Integer num = this.f9067a0;
            if (num != null) {
                this.T.setTextColor(num.intValue());
            }
            e0(this.T, getTitleFont());
        }
    }

    public final /* synthetic */ void d0() {
        setBackgroundColor(getBackgroundColor());
    }

    public final void e0(TextView textView, String str) {
        if (textView == null || dh.e.f(textView, str, getContext())) {
            return;
        }
        dh.e.d(textView, getContext(), str);
    }

    public final void f0(boolean z10) {
        this.V.setImageResource(V(this.f9074h0));
        this.V.setVisibility(z10 ? 0 : 8);
    }

    public final void g0(boolean z10) {
        if (!rh.h.a().e1()) {
            if (z10) {
                setNavigationIcon(W(this.f9074h0));
                return;
            } else {
                setNavigationIcon((Drawable) null);
                return;
            }
        }
        ImageButton imageButton = this.W;
        if (imageButton != null) {
            if (!z10) {
                imageButton.setVisibility(8);
            } else {
                imageButton.setImageResource(W(this.f9074h0));
                this.W.setVisibility(0);
            }
        }
    }

    public int getBackgroundColor() {
        if (this.f9076j0.c()) {
            ml.a theme = this.f9075i0.getTheme();
            AndroidColorToken androidColorTokenB = this.f9076j0.b("Common.NavigationBar");
            if (androidColorTokenB != null) {
                int iC = androidColorTokenB.c(theme);
                q.h("rbx.theme", "RobloxToolbar: using token color for Common.NavigationBar theme=" + theme + " argb=" + Integer.toHexString(iC));
                return iC;
            }
            q.k("rbx.theme", "RobloxToolbar: token key not found: Common.NavigationBar, falling back to resource color");
        }
        return getResources().getColor(this.f9070d0.a(this.f9075i0.getTheme()));
    }

    public int getForegroundColor() {
        return getResources().getColor(this.f9070d0.b(this.f9075i0.getTheme()));
    }

    public void h0(View.OnClickListener onClickListener) {
        Z();
        if (this.V != null && rh.h.a().e1()) {
            K(0, getContentInsetEnd());
            J(0, getContentInsetRight());
            setContentInsetStartWithNavigation(0);
        }
        f0(onClickListener != null);
        this.V.setOnClickListener(onClickListener);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        dh.i iVar = new dh.i(this.f9076j0, new Runnable() { // from class: dh.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f14808a.d0();
            }
        });
        this.f9077k0 = iVar;
        iVar.b();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        dh.i iVar = this.f9077k0;
        if (iVar != null) {
            iVar.c();
            this.f9077k0 = null;
        }
    }

    public void setCloseButtonGravity(int i10) {
        Z();
        ImageButton imageButton = this.V;
        if (imageButton != null) {
            Toolbar.g gVar = (Toolbar.g) imageButton.getLayoutParams();
            if (gVar != null) {
                gVar.f21447a = i10;
                this.V.setLayoutParams(gVar);
            } else {
                Toolbar.g gVar2 = new Toolbar.g(-2, -2);
                gVar2.f21447a = i10;
                this.V.setLayoutParams(gVar2);
            }
        }
    }

    public void setDesignFoundations(gl.c cVar) {
        this.f9076j0 = cVar;
    }

    public void setIconDelegate(e eVar) {
        this.f9069c0 = eVar;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        if (!com.roblox.client.flags.b.f9110a.g() || !rh.h.a().e1()) {
            super.setNavigationOnClickListener(onClickListener);
            g0(onClickListener != null);
            return;
        }
        Y();
        ImageButton imageButton = this.W;
        if (imageButton != null) {
            imageButton.setOnClickListener(onClickListener);
            g0(onClickListener != null);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
        b0();
        this.U.setText(charSequence);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitleTextColor(int i10) {
        this.f9068b0 = Integer.valueOf(i10);
        TextView textView = this.U;
        if (textView != null) {
            textView.setTextColor(i10);
        }
    }

    public void setThemeChooser(bk.c cVar) {
        this.f9075i0 = cVar;
    }

    public void setThemeColorDelegate(h hVar) {
        this.f9070d0 = hVar;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(int i10) {
        c0();
        this.T.setText(i10);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitleTextColor(int i10) {
        this.f9067a0 = Integer.valueOf(i10);
        TextView textView = this.T;
        if (textView != null) {
            textView.setTextColor(i10);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
        c0();
        this.T.setText(charSequence);
    }
}
