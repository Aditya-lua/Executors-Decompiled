package com.roblox.client.components;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import bh.h0;
import bh.j0;
import bh.l0;
import bh.m0;
import nh.i;
import ok.q;
import wl.AndroidColorToken;

/* JADX INFO: loaded from: classes2.dex */
public class RobloxToolbar extends Toolbar implements lk.e.b {
    public TextView T;
    public TextView U;
    public ImageButton V;
    public ImageButton W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public Integer f8884a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public Integer f8885b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public d f8886c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public f f8887d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public g f8888e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public e f8889f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public d f8890g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public cm.a f8891h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public lk.c f8892i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public wl.c f8893j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public i f8894k0;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8895a;

        static {
            int[] iArr = new int[cm.a.values().length];
            f8895a = iArr;
            try {
                iArr[cm.a.DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8895a[cm.a.LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class b implements d {
        @Override // com.roblox.client.components.RobloxToolbar.d
        public int a(cm.a aVar) {
            int i10 = a.f8895a[aVar.ordinal()];
            if (i10 != 1) {
                return i10 != 2 ? l0.f4114n : l0.f4116p;
            }
            return l0.f4115o;
        }
    }

    public static class c implements d {
        @Override // com.roblox.client.components.RobloxToolbar.d
        public int a(cm.a aVar) {
            int i10 = a.f8895a[aVar.ordinal()];
            if (i10 != 1) {
                return i10 != 2 ? l0.f4117q : l0.f4119s;
            }
            return l0.f4118r;
        }
    }

    public interface d {
        int a(cm.a aVar);
    }

    public static class e {
        public String a(cm.a aVar) {
            int i10 = a.f8895a[aVar.ordinal()];
            return (i10 == 1 || i10 == 2) ? "BuilderSans-Medium.otf" : "SourceSansPro-Regular.ttf";
        }
    }

    public interface f {
        int a(cm.a aVar);

        int b(cm.a aVar);
    }

    public static class g {
        public String a(cm.a aVar) {
            int i10 = a.f8895a[aVar.ordinal()];
            return (i10 == 1 || i10 == 2) ? "BuilderSans-Bold.otf" : "SourceSansPro-Semibold.ttf";
        }
    }

    public static class h implements f {
        @Override // com.roblox.client.components.RobloxToolbar.f
        public int a(cm.a aVar) {
            int i10 = a.f8895a[aVar.ordinal()];
            if (i10 != 1) {
                return i10 != 2 ? j0.f4079a : j0.f4090m;
            }
            return j0.f4084g;
        }

        @Override // com.roblox.client.components.RobloxToolbar.f
        public int b(cm.a aVar) {
            return a.f8895a[aVar.ordinal()] != 2 ? j0.f4092o : j0.f4084g;
        }
    }

    public RobloxToolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8884a0 = null;
        this.f8885b0 = null;
        this.f8893j0 = wl.b.tokens;
        X();
    }

    private void X() {
        this.f8892i0 = new lk.f();
        this.f8886c0 = new b();
        this.f8887d0 = new h();
        this.f8888e0 = new g();
        this.f8889f0 = new e();
        this.f8890g0 = new c();
    }

    private String getSubTitleFont() {
        return this.f8889f0.a(this.f8892i0.getTheme());
    }

    private String getTitleFont() {
        return this.f8888e0.a(this.f8892i0.getTheme());
    }

    public final void U() {
        ImageButton imageButton = new ImageButton(getContext(), null, h0.f4074a);
        this.V = imageButton;
        imageButton.setVisibility(8);
        Toolbar.g gVar = new Toolbar.g(-2, -2);
        gVar.f19839a = 8388613;
        addView(this.V, gVar);
    }

    public final int V(cm.a aVar) {
        if (aVar == null) {
            aVar = this.f8892i0.getTheme();
        }
        return this.f8890g0.a(aVar);
    }

    public final int W(cm.a aVar) {
        if (aVar == null) {
            aVar = this.f8892i0.getTheme();
        }
        return this.f8886c0.a(aVar);
    }

    public final void Y() {
        if (this.W == null) {
            this.W = (ImageButton) findViewById(m0.f4159p0);
        }
    }

    public final void Z() {
        if (this.V == null) {
            ImageButton imageButton = (ImageButton) findViewById(m0.f4161q0);
            this.V = imageButton;
            if (imageButton == null) {
                U();
            }
        }
    }

    public final void a0() {
        if (this.U == null) {
            TextView textView = (TextView) findViewById(m0.f4163r0);
            this.U = textView;
            textView.setVisibility(0);
            Integer num = this.f8885b0;
            if (num != null) {
                this.U.setTextColor(num.intValue());
            }
            d0(this.U, getSubTitleFont());
        }
    }

    public final void b0() {
        if (this.T == null) {
            TextView textView = (TextView) findViewById(m0.f4165s0);
            this.T = textView;
            textView.setVisibility(0);
            Integer num = this.f8884a0;
            if (num != null) {
                this.T.setTextColor(num.intValue());
            }
            d0(this.T, getTitleFont());
        }
    }

    public final /* synthetic */ void c0() {
        setBackgroundColor(getBackgroundColor());
    }

    public final void d0(TextView textView, String str) {
        if (textView == null || nh.e.f(textView, str, getContext())) {
            return;
        }
        nh.e.d(textView, getContext(), str);
    }

    public final void e0(boolean z10) {
        this.V.setImageResource(V(this.f8891h0));
        this.V.setVisibility(z10 ? 0 : 8);
    }

    public final void f0(boolean z10) {
        ImageButton imageButton = this.W;
        if (imageButton != null) {
            if (!z10) {
                imageButton.setVisibility(8);
            } else {
                imageButton.setImageResource(W(this.f8891h0));
                this.W.setVisibility(0);
            }
        }
    }

    @Override // lk.e.b
    public void g0(cm.a aVar) {
        if (aVar == this.f8891h0) {
            return;
        }
        this.f8891h0 = aVar;
        int backgroundColor = getBackgroundColor();
        int foregroundColor = getForegroundColor();
        setBackgroundColor(backgroundColor);
        setTitleTextColor(foregroundColor);
        setSubtitleTextColor(foregroundColor);
        d0(this.T, getTitleFont());
        d0(this.U, getSubTitleFont());
        ImageButton imageButton = this.W;
        f0(imageButton != null && imageButton.getVisibility() == 0);
        ImageButton imageButton2 = this.V;
        if (imageButton2 == null || imageButton2.getVisibility() != 0) {
            return;
        }
        e0(true);
    }

    public int getBackgroundColor() {
        if (this.f8893j0.c()) {
            cm.a theme = this.f8892i0.getTheme();
            AndroidColorToken androidColorTokenB = this.f8893j0.b("Common.NavigationBar");
            if (androidColorTokenB != null) {
                int iC = androidColorTokenB.c(theme);
                q.h("rbx.theme", "RobloxToolbar: using token color for Common.NavigationBar theme=" + theme + " argb=" + Integer.toHexString(iC));
                return iC;
            }
            q.k("rbx.theme", "RobloxToolbar: token key not found: Common.NavigationBar, falling back to resource color");
        }
        return getResources().getColor(this.f8887d0.a(this.f8892i0.getTheme()));
    }

    public int getForegroundColor() {
        return getResources().getColor(this.f8887d0.b(this.f8892i0.getTheme()));
    }

    public void h0(View.OnClickListener onClickListener) {
        Z();
        if (this.V != null) {
            K(0, getContentInsetEnd());
            J(0, getContentInsetRight());
            setContentInsetStartWithNavigation(0);
        }
        e0(onClickListener != null);
        this.V.setOnClickListener(onClickListener);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        i iVar = new i(this.f8893j0, new Runnable() { // from class: nh.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f25624a.c0();
            }
        });
        this.f8894k0 = iVar;
        iVar.b();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i iVar = this.f8894k0;
        if (iVar != null) {
            iVar.c();
            this.f8894k0 = null;
        }
    }

    public void setCloseButtonGravity(int i10) {
        Z();
        ImageButton imageButton = this.V;
        if (imageButton != null) {
            Toolbar.g gVar = (Toolbar.g) imageButton.getLayoutParams();
            if (gVar != null) {
                gVar.f19839a = i10;
                this.V.setLayoutParams(gVar);
            } else {
                Toolbar.g gVar2 = new Toolbar.g(-2, -2);
                gVar2.f19839a = i10;
                this.V.setLayoutParams(gVar2);
            }
        }
    }

    public void setDesignFoundations(wl.c cVar) {
        this.f8893j0 = cVar;
    }

    public void setIconDelegate(d dVar) {
        this.f8886c0 = dVar;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        Y();
        ImageButton imageButton = this.W;
        if (imageButton != null) {
            imageButton.setOnClickListener(onClickListener);
            f0(onClickListener != null);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
        a0();
        this.U.setText(charSequence);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitleTextColor(int i10) {
        this.f8885b0 = Integer.valueOf(i10);
        TextView textView = this.U;
        if (textView != null) {
            textView.setTextColor(i10);
        }
    }

    public void setThemeChooser(lk.c cVar) {
        this.f8892i0 = cVar;
    }

    public void setThemeColorDelegate(f fVar) {
        this.f8887d0 = fVar;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(int i10) {
        b0();
        this.T.setText(i10);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitleTextColor(int i10) {
        this.f8884a0 = Integer.valueOf(i10);
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
        b0();
        this.T.setText(charSequence);
    }
}
