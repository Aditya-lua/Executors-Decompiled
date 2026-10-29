package com.roblox.client.components;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import com.roblox.client.flags.C3188b;
import dk.C4636e;
import dk.C4637f;
import dk.InterfaceC4634c;
import il.AndroidColorToken;
import il.C6817b;
import il.InterfaceC6818c;
import p103eh.C5117e;
import p103eh.C5121i;
import p151gk.C6124q;
import p337ol.EnumC9799a;
import sg.C11320h0;
import sg.C11326j0;
import sg.C11332l0;
import sg.C11335m0;
import th.C11659h;

/* JADX INFO: loaded from: classes2.dex */
public class RobloxToolbar extends Toolbar implements C4636e.b {

    /* JADX INFO: renamed from: T */
    public TextView f11745T;

    /* JADX INFO: renamed from: U */
    public TextView f11746U;

    /* JADX INFO: renamed from: V */
    public ImageButton f11747V;

    /* JADX INFO: renamed from: W */
    public ImageButton f11748W;

    /* JADX INFO: renamed from: a0 */
    public Integer f11749a0;

    /* JADX INFO: renamed from: b0 */
    public Integer f11750b0;

    /* JADX INFO: renamed from: c0 */
    public InterfaceC3173e f11751c0;

    /* JADX INFO: renamed from: d0 */
    public InterfaceC3176h f11752d0;

    /* JADX INFO: renamed from: e0 */
    public C3177i f11753e0;

    /* JADX INFO: renamed from: f0 */
    public C3175g f11754f0;

    /* JADX INFO: renamed from: g0 */
    public InterfaceC3173e f11755g0;

    /* JADX INFO: renamed from: h0 */
    public EnumC9799a f11756h0;

    /* JADX INFO: renamed from: i0 */
    public InterfaceC4634c f11757i0;

    /* JADX INFO: renamed from: j0 */
    public InterfaceC6818c f11758j0;

    /* JADX INFO: renamed from: k0 */
    public C5121i f11759k0;

    /* JADX INFO: renamed from: com.roblox.client.components.RobloxToolbar$a */
    public static /* synthetic */ class C3169a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f11760a;

        static {
            int[] iArr = new int[EnumC9799a.values().length];
            f11760a = iArr;
            try {
                iArr[EnumC9799a.DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11760a[EnumC9799a.LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.components.RobloxToolbar$b */
    public static class C3170b implements InterfaceC3173e {
        @Override // com.roblox.client.components.RobloxToolbar.InterfaceC3173e
        /* JADX INFO: renamed from: a */
        public int mo15079a(EnumC9799a enumC9799a) {
            int i10 = C3169a.f11760a[enumC9799a.ordinal()];
            if (i10 != 1) {
                return i10 != 2 ? C11332l0.f39754n : C11332l0.f39756p;
            }
            return C11332l0.f39755o;
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.components.RobloxToolbar$c */
    public static class C3171c implements InterfaceC3173e {
        @Override // com.roblox.client.components.RobloxToolbar.InterfaceC3173e
        /* JADX INFO: renamed from: a */
        public int mo15079a(EnumC9799a enumC9799a) {
            int i10 = C3169a.f11760a[enumC9799a.ordinal()];
            if (i10 != 1) {
                return i10 != 2 ? C11332l0.f39757q : C11332l0.f39759s;
            }
            return C11332l0.f39758r;
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.components.RobloxToolbar$d */
    public static class C3172d implements InterfaceC3176h {
        @Override // com.roblox.client.components.RobloxToolbar.InterfaceC3176h
        /* JADX INFO: renamed from: a */
        public int mo15080a(EnumC9799a enumC9799a) {
            return C3169a.f11760a[enumC9799a.ordinal()] != 1 ? C11326j0.f39724o : C11326j0.f39724o;
        }

        @Override // com.roblox.client.components.RobloxToolbar.InterfaceC3176h
        /* JADX INFO: renamed from: b */
        public int mo15081b(EnumC9799a enumC9799a) {
            return C3169a.f11760a[enumC9799a.ordinal()] != 1 ? C11326j0.f39724o : C11326j0.f39717h;
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.components.RobloxToolbar$e */
    public interface InterfaceC3173e {
        /* JADX INFO: renamed from: a */
        int mo15079a(EnumC9799a enumC9799a);
    }

    /* JADX INFO: renamed from: com.roblox.client.components.RobloxToolbar$f */
    public static class C3174f implements InterfaceC3176h {
        @Override // com.roblox.client.components.RobloxToolbar.InterfaceC3176h
        /* JADX INFO: renamed from: a */
        public int mo15080a(EnumC9799a enumC9799a) {
            return C3169a.f11760a[enumC9799a.ordinal()] != 1 ? C11326j0.f39716g : C11326j0.f39723n;
        }

        @Override // com.roblox.client.components.RobloxToolbar.InterfaceC3176h
        /* JADX INFO: renamed from: b */
        public int mo15081b(EnumC9799a enumC9799a) {
            return C3169a.f11760a[enumC9799a.ordinal()] != 1 ? C11326j0.f39723n : C11326j0.f39716g;
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.components.RobloxToolbar$g */
    public static class C3175g {
        /* JADX INFO: renamed from: a */
        public String m15082a(EnumC9799a enumC9799a) {
            int i10 = C3169a.f11760a[enumC9799a.ordinal()];
            return (i10 == 1 || i10 == 2) ? "BuilderSans-Medium.otf" : "SourceSansPro-Regular.ttf";
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.components.RobloxToolbar$h */
    public interface InterfaceC3176h {
        /* JADX INFO: renamed from: a */
        int mo15080a(EnumC9799a enumC9799a);

        /* JADX INFO: renamed from: b */
        int mo15081b(EnumC9799a enumC9799a);
    }

    /* JADX INFO: renamed from: com.roblox.client.components.RobloxToolbar$i */
    public static class C3177i {
        /* JADX INFO: renamed from: a */
        public String m15083a(EnumC9799a enumC9799a) {
            int i10 = C3169a.f11760a[enumC9799a.ordinal()];
            if (i10 == 1 || i10 == 2) {
                return C11659h.m43403a().mo43594b1() ? "BuilderSans-Bold.otf" : "BuilderSans-Medium.otf";
            }
            return "SourceSansPro-Semibold.ttf";
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.components.RobloxToolbar$j */
    public static class C3178j implements InterfaceC3176h {
        @Override // com.roblox.client.components.RobloxToolbar.InterfaceC3176h
        /* JADX INFO: renamed from: a */
        public int mo15080a(EnumC9799a enumC9799a) {
            return C3169a.f11760a[enumC9799a.ordinal()] != 2 ? C11326j0.f39726q : C11326j0.f39717h;
        }

        @Override // com.roblox.client.components.RobloxToolbar.InterfaceC3176h
        /* JADX INFO: renamed from: b */
        public int mo15081b(EnumC9799a enumC9799a) {
            int i10 = C3169a.f11760a[enumC9799a.ordinal()];
            if (i10 != 1) {
                return i10 != 2 ? C11326j0.f39710a : C11326j0.f39724o;
            }
            return C11326j0.f39717h;
        }
    }

    public RobloxToolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11749a0 = null;
        this.f11750b0 = null;
        this.f11758j0 = C6817b.tokens;
        m15066Y();
    }

    /* JADX INFO: renamed from: Y */
    private void m15066Y() {
        this.f11757i0 = new C4637f();
        this.f11751c0 = new C3170b();
        this.f11752d0 = new C3178j();
        this.f11753e0 = new C3177i();
        this.f11754f0 = new C3175g();
        this.f11755g0 = new C3171c();
    }

    private String getSubTitleFont() {
        return this.f11754f0.m15082a(this.f11757i0.getTheme());
    }

    private String getTitleFont() {
        return this.f11753e0.m15083a(this.f11757i0.getTheme());
    }

    /* JADX INFO: renamed from: V */
    public final void m15067V() {
        ImageButton imageButton = new ImageButton(getContext(), null, C11320h0.f39704a);
        this.f11747V = imageButton;
        imageButton.setVisibility(8);
        Toolbar.C0480g c0480g = new Toolbar.C0480g(-2, -2);
        c0480g.f27268a = GravityCompat.END;
        addView(this.f11747V, c0480g);
    }

    /* JADX INFO: renamed from: W */
    public final int m15068W(EnumC9799a enumC9799a) {
        if (enumC9799a == null) {
            enumC9799a = this.f11757i0.getTheme();
        }
        return this.f11755g0.mo15079a(enumC9799a);
    }

    /* JADX INFO: renamed from: X */
    public final int m15069X(EnumC9799a enumC9799a) {
        if (enumC9799a == null) {
            enumC9799a = this.f11757i0.getTheme();
        }
        return this.f11751c0.mo15079a(enumC9799a);
    }

    /* JADX INFO: renamed from: Z */
    public final void m15070Z() {
        if (this.f11748W == null) {
            this.f11748W = (ImageButton) findViewById(C11335m0.f39822n0);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final void m15071a0() {
        if (this.f11747V == null) {
            if (!C11659h.m43403a().mo43594b1()) {
                m15067V();
                return;
            }
            ImageButton imageButton = (ImageButton) findViewById(C11335m0.f39824o0);
            this.f11747V = imageButton;
            if (imageButton == null) {
                m15067V();
            }
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m15072b0() {
        if (this.f11746U == null) {
            TextView textView = (TextView) findViewById(C11335m0.f39826p0);
            this.f11746U = textView;
            textView.setVisibility(0);
            Integer num = this.f11750b0;
            if (num != null) {
                this.f11746U.setTextColor(num.intValue());
            }
            m15075e0(this.f11746U, getSubTitleFont());
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final void m15073c0() {
        if (this.f11745T == null) {
            TextView textView = (TextView) findViewById(C11335m0.f39828q0);
            this.f11745T = textView;
            textView.setVisibility(0);
            Integer num = this.f11749a0;
            if (num != null) {
                this.f11745T.setTextColor(num.intValue());
            }
            m15075e0(this.f11745T, getTitleFont());
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m15074d0() {
        setBackgroundColor(getBackgroundColor());
    }

    /* JADX INFO: renamed from: e0 */
    public final void m15075e0(TextView textView, String str) {
        if (textView == null || C5117e.m23882f(textView, str, getContext())) {
            return;
        }
        C5117e.m23880d(textView, getContext(), str);
    }

    /* JADX INFO: renamed from: f0 */
    public final void m15076f0(boolean z10) {
        this.f11747V.setImageResource(m15068W(this.f11756h0));
        this.f11747V.setVisibility(z10 ? 0 : 8);
    }

    /* JADX INFO: renamed from: g0 */
    public final void m15077g0(boolean z10) {
        if (!C11659h.m43403a().mo43594b1()) {
            if (z10) {
                setNavigationIcon(m15069X(this.f11756h0));
                return;
            } else {
                setNavigationIcon((Drawable) null);
                return;
            }
        }
        ImageButton imageButton = this.f11748W;
        if (imageButton != null) {
            if (!z10) {
                imageButton.setVisibility(8);
            } else {
                imageButton.setImageResource(m15069X(this.f11756h0));
                this.f11748W.setVisibility(0);
            }
        }
    }

    public int getBackgroundColor() {
        if (this.f11758j0.mo29192c()) {
            EnumC9799a theme = this.f11757i0.getTheme();
            AndroidColorToken androidColorTokenMo29191b = this.f11758j0.mo29191b("Common.NavigationBar");
            if (androidColorTokenMo29191b != null) {
                int iM29188c = androidColorTokenMo29191b.m29188c(theme);
                C6124q.m27063h("rbx.theme", "RobloxToolbar: using token color for Common.NavigationBar theme=" + theme + " argb=" + Integer.toHexString(iM29188c));
                return iM29188c;
            }
            C6124q.m27066k("rbx.theme", "RobloxToolbar: token key not found: Common.NavigationBar, falling back to resource color");
        }
        return getResources().getColor(this.f11752d0.mo15081b(this.f11757i0.getTheme()));
    }

    public int getForegroundColor() {
        return getResources().getColor(this.f11752d0.mo15080a(this.f11757i0.getTheme()));
    }

    /* JADX INFO: renamed from: h0 */
    public void m15078h0(View.OnClickListener onClickListener) {
        m15071a0();
        if (this.f11747V != null && C11659h.m43403a().mo43594b1()) {
            m1902L(0, getContentInsetEnd());
            m1901K(0, getContentInsetRight());
            setContentInsetStartWithNavigation(0);
        }
        m15076f0(onClickListener != null);
        this.f11747V.setOnClickListener(onClickListener);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C5121i c5121i = new C5121i(this.f11758j0, new Runnable() { // from class: eh.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f19978a.m15074d0();
            }
        });
        this.f11759k0 = c5121i;
        c5121i.m23901b();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C5121i c5121i = this.f11759k0;
        if (c5121i != null) {
            c5121i.m23902c();
            this.f11759k0 = null;
        }
    }

    public void setCloseButtonGravity(int i10) {
        m15071a0();
        ImageButton imageButton = this.f11747V;
        if (imageButton != null) {
            Toolbar.C0480g c0480g = (Toolbar.C0480g) imageButton.getLayoutParams();
            if (c0480g != null) {
                c0480g.f27268a = i10;
                this.f11747V.setLayoutParams(c0480g);
            } else {
                Toolbar.C0480g c0480g2 = new Toolbar.C0480g(-2, -2);
                c0480g2.f27268a = i10;
                this.f11747V.setLayoutParams(c0480g2);
            }
        }
    }

    public void setDesignFoundations(InterfaceC6818c interfaceC6818c) {
        this.f11758j0 = interfaceC6818c;
    }

    public void setIconDelegate(InterfaceC3173e interfaceC3173e) {
        this.f11751c0 = interfaceC3173e;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        if (!C3188b.f11801a.m15148g() || !C11659h.m43403a().mo43594b1()) {
            super.setNavigationOnClickListener(onClickListener);
            m15077g0(onClickListener != null);
            return;
        }
        m15070Z();
        ImageButton imageButton = this.f11748W;
        if (imageButton != null) {
            imageButton.setOnClickListener(onClickListener);
            m15077g0(onClickListener != null);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
        m15072b0();
        this.f11746U.setText(charSequence);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitleTextColor(int i10) {
        this.f11750b0 = Integer.valueOf(i10);
        TextView textView = this.f11746U;
        if (textView != null) {
            textView.setTextColor(i10);
        }
    }

    public void setThemeChooser(InterfaceC4634c interfaceC4634c) {
        this.f11757i0 = interfaceC4634c;
    }

    public void setThemeColorDelegate(InterfaceC3176h interfaceC3176h) {
        this.f11752d0 = interfaceC3176h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(int i10) {
        m15073c0();
        this.f11745T.setText(i10);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitleTextColor(int i10) {
        this.f11749a0 = Integer.valueOf(i10);
        TextView textView = this.f11745T;
        if (textView != null) {
            textView.setTextColor(i10);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    @Override // dk.C4636e.b
    /* JADX INFO: renamed from: u */
    public void mo14822u(EnumC9799a enumC9799a) {
        if (enumC9799a == this.f11756h0) {
            return;
        }
        this.f11756h0 = enumC9799a;
        int backgroundColor = getBackgroundColor();
        int foregroundColor = getForegroundColor();
        setBackgroundColor(backgroundColor);
        setTitleTextColor(foregroundColor);
        setSubtitleTextColor(foregroundColor);
        m15075e0(this.f11745T, getTitleFont());
        m15075e0(this.f11746U, getSubTitleFont());
        boolean z10 = false;
        if (!C11659h.m43403a().mo43594b1()) {
            m15077g0(getNavigationIcon() != null);
            return;
        }
        ImageButton imageButton = this.f11748W;
        if (imageButton != null && imageButton.getVisibility() == 0) {
            z10 = true;
        }
        m15077g0(z10);
        ImageButton imageButton2 = this.f11747V;
        if (imageButton2 == null || imageButton2.getVisibility() != 0) {
            return;
        }
        m15076f0(true);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
        m15073c0();
        this.f11745T.setText(charSequence);
    }
}
