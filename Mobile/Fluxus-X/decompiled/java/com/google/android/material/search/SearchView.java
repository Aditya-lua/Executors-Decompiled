package com.google.android.material.search;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.o0;
import bd.p;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.TouchObserverFrameLayout;
import dd.f;
import e.BackEventCompat;
import id.h;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import jc.d;
import jc.e;
import jc.j;

/* JADX INFO: loaded from: classes2.dex */
public class SearchView extends FrameLayout implements CoordinatorLayout.b, dd.b {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f8003x = j.f20452m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClippableRoundedCornerLayout f8004a;
    public final View b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f8005c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FrameLayout f8006d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MaterialToolbar f8007e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f8008f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final EditText f8009g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TouchObserverFrameLayout f8010h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f8011i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final dd.c f8012j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f8013k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final yc.a f8014l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Set<b> f8015m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public SearchBar f8016n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f8017o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f8018p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f8019q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f8020r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f8021s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f8022t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f8023u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NonNull
    public c f8024v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Map<View, Integer> f8025w;

    public static class Behavior extends CoordinatorLayout.c<SearchView> {
        public Behavior() {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public boolean l(@NonNull CoordinatorLayout coordinatorLayout, @NonNull SearchView searchView, @NonNull View view) {
            if (searchView.g() || !(view instanceof SearchBar)) {
                return false;
            }
            searchView.setupWithSearchBar((SearchBar) view);
            return false;
        }

        public Behavior(@NonNull Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class a extends r3.a {
        public static final Parcelable.Creator<a> CREATOR = new C0129a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f8026c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f8027d;

        /* JADX INFO: renamed from: com.google.android.material.search.SearchView$a$a, reason: collision with other inner class name */
        public class C0129a implements Parcelable.ClassLoaderCreator<a> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public a createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new a(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public a[] newArray(int i10) {
                return new a[i10];
            }
        }

        public a(Parcel parcel) {
            this(parcel, null);
        }

        @Override // r3.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.f8026c);
            parcel.writeInt(this.f8027d);
        }

        public a(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f8026c = parcel.readString();
            this.f8027d = parcel.readInt();
        }

        public a(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public interface b {
        void a(@NonNull SearchView searchView, @NonNull c cVar, @NonNull c cVar2);
    }

    public enum c {
        HIDING,
        HIDDEN,
        SHOWING,
        SHOWN
    }

    private Window getActivityWindow() {
        Activity activityA = bd.b.a(getContext());
        if (activityA == null) {
            return null;
        }
        return activityA.getWindow();
    }

    private float getOverlayElevation() {
        SearchBar searchBar = this.f8016n;
        return searchBar != null ? searchBar.getCompatElevation() : getResources().getDimension(d.f20352u);
    }

    private int getStatusBarHeight() {
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private void setStatusBarSpacerEnabledInternal(boolean z10) {
        this.f8005c.setVisibility(z10 ? 0 : 8);
    }

    private void setUpBackgroundViewElevationOverlay(float f10) {
        yc.a aVar = this.f8014l;
        if (aVar == null || this.b == null) {
            return;
        }
        this.b.setBackgroundColor(aVar.c(this.f8021s, f10));
    }

    private void setUpHeaderLayout(int i10) {
        if (i10 != -1) {
            e(LayoutInflater.from(getContext()).inflate(i10, (ViewGroup) this.f8006d, false));
        }
    }

    private void setUpStatusBarSpacer(int i10) {
        if (this.f8005c.getLayoutParams().height != i10) {
            this.f8005c.getLayoutParams().height = i10;
            this.f8005c.requestLayout();
        }
    }

    @Override // dd.b
    public void a(@NonNull BackEventCompat backEventCompat) {
        if (!f() && this.f8016n != null && Build.VERSION.SDK_INT >= 34) {
            throw null;
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (this.f8011i) {
            this.f8010h.addView(view, i10, layoutParams);
        } else {
            super.addView(view, i10, layoutParams);
        }
    }

    @Override // dd.b
    public void b() {
        if (!f() && this.f8016n != null && Build.VERSION.SDK_INT >= 34) {
            throw null;
        }
    }

    @Override // dd.b
    public void c(@NonNull BackEventCompat backEventCompat) {
        if (!f() && this.f8016n != null) {
            throw null;
        }
    }

    @Override // dd.b
    public void d() {
        if (!f()) {
            throw null;
        }
    }

    public void e(@NonNull View view) {
        this.f8006d.addView(view);
        this.f8006d.setVisibility(0);
    }

    public final boolean f() {
        return this.f8024v.equals(c.HIDDEN) || this.f8024v.equals(c.HIDING);
    }

    public boolean g() {
        return this.f8016n != null;
    }

    public f getBackHelper() {
        throw null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    @NonNull
    public CoordinatorLayout.c<SearchView> getBehavior() {
        return new Behavior();
    }

    @NonNull
    public c getCurrentTransitionState() {
        return this.f8024v;
    }

    public int getDefaultNavigationIconResource() {
        return e.b;
    }

    @NonNull
    public EditText getEditText() {
        return this.f8009g;
    }

    public CharSequence getHint() {
        return this.f8009g.getHint();
    }

    @NonNull
    public TextView getSearchPrefix() {
        return this.f8008f;
    }

    public CharSequence getSearchPrefixText() {
        return this.f8008f.getText();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public int getSoftInputMode() {
        return this.f8017o;
    }

    @NonNull
    @SuppressLint({"KotlinPropertyAccess"})
    public Editable getText() {
        return this.f8009g.getText();
    }

    @NonNull
    public Toolbar getToolbar() {
        return this.f8007e;
    }

    public final void h(@NonNull c cVar, boolean z10) {
        if (this.f8024v.equals(cVar)) {
            return;
        }
        if (z10) {
            if (cVar == c.SHOWN) {
                setModalForAccessibility(true);
            } else if (cVar == c.HIDDEN) {
                setModalForAccessibility(false);
            }
        }
        c cVar2 = this.f8024v;
        this.f8024v = cVar;
        Iterator it = new LinkedHashSet(this.f8015m).iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(this, cVar2, cVar);
        }
        j(cVar);
    }

    @SuppressLint({"InlinedApi"})
    public final void i(ViewGroup viewGroup, boolean z10) {
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt != this) {
                if (childAt.findViewById(this.f8004a.getId()) != null) {
                    i((ViewGroup) childAt, z10);
                } else if (z10) {
                    this.f8025w.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    o0.w0(childAt, 4);
                } else {
                    Map<View, Integer> map = this.f8025w;
                    if (map != null && map.containsKey(childAt)) {
                        o0.w0(childAt, this.f8025w.get(childAt).intValue());
                    }
                }
            }
        }
    }

    public final void j(@NonNull c cVar) {
        if (this.f8016n == null || !this.f8013k) {
            return;
        }
        if (cVar.equals(c.SHOWN)) {
            this.f8012j.b();
        } else if (cVar.equals(c.HIDDEN)) {
            this.f8012j.d();
        }
    }

    public final void k() {
        ImageButton imageButtonD = p.d(this.f8007e);
        if (imageButtonD == null) {
            return;
        }
        int i10 = this.f8004a.getVisibility() == 0 ? 1 : 0;
        Drawable drawableQ = q2.a.q(imageButtonD.getDrawable());
        if (drawableQ instanceof l.b) {
            ((l.b) drawableQ).a(i10);
        }
        if (drawableQ instanceof bd.e) {
            ((bd.e) drawableQ).a(i10);
        }
    }

    public void l() {
        Window activityWindow = getActivityWindow();
        if (activityWindow != null) {
            this.f8017o = activityWindow.getAttributes().softInputMode;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.e(this);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        l();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.a());
        setText(aVar.f8026c);
        setVisible(aVar.f8027d == 0);
    }

    @Override // android.view.View
    @NonNull
    public Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        Editable text = getText();
        aVar.f8026c = text == null ? null : text.toString();
        aVar.f8027d = this.f8004a.getVisibility();
        return aVar;
    }

    public void setAnimatedNavigationIcon(boolean z10) {
        this.f8018p = z10;
    }

    public void setAutoShowKeyboard(boolean z10) {
        this.f8020r = z10;
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        setUpBackgroundViewElevationOverlay(f10);
    }

    public void setHint(CharSequence charSequence) {
        this.f8009g.setHint(charSequence);
    }

    public void setMenuItemsAnimated(boolean z10) {
        this.f8019q = z10;
    }

    public void setModalForAccessibility(boolean z10) {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        if (z10) {
            this.f8025w = new HashMap(viewGroup.getChildCount());
        }
        i(viewGroup, z10);
        if (z10) {
            return;
        }
        this.f8025w = null;
    }

    public void setOnMenuItemClickListener(Toolbar.h hVar) {
        this.f8007e.setOnMenuItemClickListener(hVar);
    }

    public void setSearchPrefixText(CharSequence charSequence) {
        this.f8008f.setText(charSequence);
        this.f8008f.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    public void setStatusBarSpacerEnabled(boolean z10) {
        this.f8023u = true;
        setStatusBarSpacerEnabledInternal(z10);
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public void setText(CharSequence charSequence) {
        this.f8009g.setText(charSequence);
    }

    public void setToolbarTouchscreenBlocksFocus(boolean z10) {
        this.f8007e.setTouchscreenBlocksFocus(z10);
    }

    public void setTransitionState(@NonNull c cVar) {
        h(cVar, true);
    }

    public void setUseWindowInsetsController(boolean z10) {
        this.f8022t = z10;
    }

    public void setVisible(boolean z10) {
        boolean z11 = this.f8004a.getVisibility() == 0;
        this.f8004a.setVisibility(z10 ? 0 : 8);
        k();
        h(z10 ? c.SHOWN : c.HIDDEN, z11 != z10);
    }

    public void setupWithSearchBar(SearchBar searchBar) {
        this.f8016n = searchBar;
        throw null;
    }

    public void setHint(int i10) {
        this.f8009g.setHint(i10);
    }

    public void setText(int i10) {
        this.f8009g.setText(i10);
    }
}
