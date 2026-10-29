package com.roblox.client.components;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import gk.p;
import il.AndroidColorToken;
import sg.h0;
import sg.j0;
import sg.l0;
import sg.m0;

/* JADX INFO: loaded from: classes2.dex */
public class RobloxToolbar extends Toolbar implements dk.e.b {
    public TextView T;
    public TextView U;
    public ImageButton V;
    public ImageButton W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public Integer f8993a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public Integer f8994b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public e f8995c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public h f8996d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public i f8997e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public g f8998f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public e f8999g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public ol.a f9000h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public dk.c f9001i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public il.c f9002j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public eh.i f9003k0;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9004a;

        static {
            int[] iArr = new int[ol.a.values().length];
            f9004a = iArr;
            try {
                iArr[ol.a.DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9004a[ol.a.LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class b implements e {
        @Override // com.roblox.client.components.RobloxToolbar.e
        public int a(ol.a aVar) {
            int i10 = a.f9004a[aVar.ordinal()];
            if (i10 != 1) {
                return i10 != 2 ? l0.f30810n : l0.f30812p;
            }
            return l0.f30811o;
        }
    }

    public static class c implements e {
        @Override // com.roblox.client.components.RobloxToolbar.e
        public int a(ol.a aVar) {
            int i10 = a.f9004a[aVar.ordinal()];
            if (i10 != 1) {
                return i10 != 2 ? l0.f30813q : l0.f30815s;
            }
            return l0.f30814r;
        }
    }

    public static class d implements h {
        @Override // com.roblox.client.components.RobloxToolbar.h
        public int a(ol.a aVar) {
            return a.f9004a[aVar.ordinal()] != 1 ? j0.f30786o : j0.f30786o;
        }

        @Override // com.roblox.client.components.RobloxToolbar.h
        public int b(ol.a aVar) {
            return a.f9004a[aVar.ordinal()] != 1 ? j0.f30786o : j0.f30779h;
        }
    }

    public interface e {
        int a(ol.a aVar);
    }

    public static class f implements h {
        @Override // com.roblox.client.components.RobloxToolbar.h
        public int a(ol.a aVar) {
            return a.f9004a[aVar.ordinal()] != 1 ? j0.f30778g : j0.f30785n;
        }

        @Override // com.roblox.client.components.RobloxToolbar.h
        public int b(ol.a aVar) {
            return a.f9004a[aVar.ordinal()] != 1 ? j0.f30785n : j0.f30778g;
        }
    }

    public static class g {
        public String a(ol.a aVar) {
            int i10 = a.f9004a[aVar.ordinal()];
            return (i10 == 1 || i10 == 2) ? "BuilderSans-Medium.otf" : "SourceSansPro-Regular.ttf";
        }
    }

    public interface h {
        int a(ol.a aVar);

        int b(ol.a aVar);
    }

    public static class i {
        public String a(ol.a aVar) {
            int i10 = a.f9004a[aVar.ordinal()];
            if (i10 == 1 || i10 == 2) {
                return th.h.a().X0() ? "BuilderSans-Bold.otf" : "BuilderSans-Medium.otf";
            }
            return "SourceSansPro-Semibold.ttf";
        }
    }

    public static class j implements h {
        @Override // com.roblox.client.components.RobloxToolbar.h
        public int a(ol.a aVar) {
            return a.f9004a[aVar.ordinal()] != 2 ? j0.f30788q : j0.f30779h;
        }

        @Override // com.roblox.client.components.RobloxToolbar.h
        public int b(ol.a aVar) {
            int i10 = a.f9004a[aVar.ordinal()];
            if (i10 != 1) {
                return i10 != 2 ? j0.f30773a : j0.f30786o;
            }
            return j0.f30779h;
        }
    }

    public RobloxToolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8993a0 = null;
        this.f8994b0 = null;
        this.f9002j0 = il.b.tokens;
        Y();
    }

    private void Y() {
        this.f9001i0 = new dk.f();
        this.f8995c0 = new b();
        this.f8996d0 = new j();
        this.f8997e0 = new i();
        this.f8998f0 = new g();
        this.f8999g0 = new c();
    }

    private String getSubTitleFont() {
        return this.f8998f0.a(this.f9001i0.getTheme());
    }

    private String getTitleFont() {
        return this.f8997e0.a(this.f9001i0.getTheme());
    }

    public final void V() {
        ImageButton imageButton = new ImageButton(getContext(), null, h0.f30768a);
        this.V = imageButton;
        imageButton.setVisibility(8);
        Toolbar.g gVar = new Toolbar.g(-2, -2);
        gVar.f20874a = 8388613;
        addView(this.V, gVar);
    }

    public final int W(ol.a aVar) {
        if (aVar == null) {
            aVar = this.f9001i0.getTheme();
        }
        return this.f8999g0.a(aVar);
    }

    public final int X(ol.a aVar) {
        if (aVar == null) {
            aVar = this.f9001i0.getTheme();
        }
        return this.f8995c0.a(aVar);
    }

    public final void Z() {
        if (this.W == null) {
            this.W = (ImageButton) findViewById(m0.f30851n0);
        }
    }

    public final void a0() {
        if (this.V == null) {
            if (!th.h.a().X0()) {
                V();
                return;
            }
            ImageButton imageButton = (ImageButton) findViewById(m0.f30853o0);
            this.V = imageButton;
            if (imageButton == null) {
                V();
            }
        }
    }

    public final void b0() {
        if (this.U == null) {
            TextView textView = (TextView) findViewById(m0.f30855p0);
            this.U = textView;
            textView.setVisibility(0);
            Integer num = this.f8994b0;
            if (num != null) {
                this.U.setTextColor(num.intValue());
            }
            e0(this.U, getSubTitleFont());
        }
    }

    public final void c0() {
        if (this.T == null) {
            TextView textView = (TextView) findViewById(m0.f30857q0);
            this.T = textView;
            textView.setVisibility(0);
            Integer num = this.f8993a0;
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
        if (textView == null || eh.e.f(textView, str, getContext())) {
            return;
        }
        eh.e.d(textView, getContext(), str);
    }

    public final void f0(boolean z10) {
        this.V.setImageResource(W(this.f9000h0));
        this.V.setVisibility(z10 ? 0 : 8);
    }

    public final void g0(boolean z10) {
        if (!th.h.a().X0()) {
            if (z10) {
                setNavigationIcon(X(this.f9000h0));
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
                imageButton.setImageResource(X(this.f9000h0));
                this.W.setVisibility(0);
            }
        }
    }

    public int getBackgroundColor() {
        if (this.f9002j0.c()) {
            ol.a theme = this.f9001i0.getTheme();
            AndroidColorToken androidColorTokenB = this.f9002j0.b("Common.NavigationBar");
            if (androidColorTokenB != null) {
                int iC = androidColorTokenB.c(theme);
                p.h("rbx.theme", "RobloxToolbar: using token color for Common.NavigationBar theme=" + theme + " argb=" + Integer.toHexString(iC));
                return iC;
            }
            p.k("rbx.theme", "RobloxToolbar: token key not found: Common.NavigationBar, falling back to resource color");
        }
        return getResources().getColor(this.f8996d0.b(this.f9001i0.getTheme()));
    }

    public int getForegroundColor() {
        return getResources().getColor(this.f8996d0.a(this.f9001i0.getTheme()));
    }

    public void h0(View.OnClickListener onClickListener) {
        a0();
        if (this.V != null && th.h.a().X0()) {
            L(0, getContentInsetEnd());
            K(0, getContentInsetRight());
            setContentInsetStartWithNavigation(0);
        }
        f0(onClickListener != null);
        this.V.setOnClickListener(onClickListener);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        eh.i iVar = new eh.i(this.f9002j0, new Runnable() { // from class: eh.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f15554a.d0();
            }
        });
        this.f9003k0 = iVar;
        iVar.b();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        eh.i iVar = this.f9003k0;
        if (iVar != null) {
            iVar.c();
            this.f9003k0 = null;
        }
    }

    public void setCloseButtonGravity(int i10) {
        a0();
        ImageButton imageButton = this.V;
        if (imageButton != null) {
            Toolbar.g gVar = (Toolbar.g) imageButton.getLayoutParams();
            if (gVar != null) {
                gVar.f20874a = i10;
                this.V.setLayoutParams(gVar);
            } else {
                Toolbar.g gVar2 = new Toolbar.g(-2, -2);
                gVar2.f20874a = i10;
                this.V.setLayoutParams(gVar2);
            }
        }
    }

    public void setDesignFoundations(il.c cVar) {
        this.f9002j0 = cVar;
    }

    public void setIconDelegate(e eVar) {
        this.f8995c0 = eVar;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        if (!com.roblox.client.flags.b.f9037a.g() || !th.h.a().X0()) {
            super.setNavigationOnClickListener(onClickListener);
            g0(onClickListener != null);
            return;
        }
        Z();
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
        this.f8994b0 = Integer.valueOf(i10);
        TextView textView = this.U;
        if (textView != null) {
            textView.setTextColor(i10);
        }
    }

    public void setThemeChooser(dk.c cVar) {
        this.f9001i0 = cVar;
    }

    public void setThemeColorDelegate(h hVar) {
        this.f8996d0 = hVar;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(int i10) {
        c0();
        this.T.setText(i10);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitleTextColor(int i10) {
        this.f8993a0 = Integer.valueOf(i10);
        TextView textView = this.T;
        if (textView != null) {
            textView.setTextColor(i10);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    @Override // dk.e.b
    public void u(ol.a aVar) {
        if (aVar == this.f9000h0) {
            return;
        }
        this.f9000h0 = aVar;
        int backgroundColor = getBackgroundColor();
        int foregroundColor = getForegroundColor();
        setBackgroundColor(backgroundColor);
        setTitleTextColor(foregroundColor);
        setSubtitleTextColor(foregroundColor);
        e0(this.T, getTitleFont());
        e0(this.U, getSubTitleFont());
        boolean z10 = false;
        if (!th.h.a().X0()) {
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

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
        c0();
        this.T.setText(charSequence);
    }
}
