package com.google.android.material.search;

import ad.C0130b;
import ad.C0133e;
import ad.C0144p;
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
import androidx.core.view.C0625o0;
import androidx.customview.view.AbsSavedState;
import cd.C1622c;
import cd.C1625f;
import cd.InterfaceC1621b;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.TouchObserverFrameLayout;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import p088e.BackEventCompat;
import p168hd.C6364h;
import p194ic.C6740d;
import p194ic.C6741e;
import p194ic.C6746j;
import p258l.C7954b;
import p368q2.C10425a;
import p542xc.C12779a;

/* JADX INFO: loaded from: classes2.dex */
public class SearchView extends FrameLayout implements CoordinatorLayout.InterfaceC0523b, InterfaceC1621b {

    /* JADX INFO: renamed from: x */
    public static final int f10381x = C6746j.f26121m;

    /* JADX INFO: renamed from: a */
    public final ClippableRoundedCornerLayout f10382a;

    /* JADX INFO: renamed from: b */
    public final View f10383b;

    /* JADX INFO: renamed from: c */
    public final View f10384c;

    /* JADX INFO: renamed from: d */
    public final FrameLayout f10385d;

    /* JADX INFO: renamed from: e */
    public final MaterialToolbar f10386e;

    /* JADX INFO: renamed from: f */
    public final TextView f10387f;

    /* JADX INFO: renamed from: g */
    public final EditText f10388g;

    /* JADX INFO: renamed from: h */
    public final TouchObserverFrameLayout f10389h;

    /* JADX INFO: renamed from: i */
    public final boolean f10390i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final C1622c f10391j;

    /* JADX INFO: renamed from: k */
    public final boolean f10392k;

    /* JADX INFO: renamed from: l */
    public final C12779a f10393l;

    /* JADX INFO: renamed from: m */
    public final Set<InterfaceC2823a> f10394m;

    /* JADX INFO: renamed from: n */
    public SearchBar f10395n;

    /* JADX INFO: renamed from: o */
    public int f10396o;

    /* JADX INFO: renamed from: p */
    public boolean f10397p;

    /* JADX INFO: renamed from: q */
    public boolean f10398q;

    /* JADX INFO: renamed from: r */
    public boolean f10399r;

    /* JADX INFO: renamed from: s */
    public final int f10400s;

    /* JADX INFO: renamed from: t */
    public boolean f10401t;

    /* JADX INFO: renamed from: u */
    public boolean f10402u;

    /* JADX INFO: renamed from: v */
    @NonNull
    public EnumC2824b f10403v;

    /* JADX INFO: renamed from: w */
    public Map<View, Integer> f10404w;

    public static class Behavior extends CoordinatorLayout.AbstractC0524c<SearchView> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Behavior() {
        }

        /* JADX DEBUG: Method merged with bridge method: l(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;)Z */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0524c
        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public boolean mo2612l(@NonNull CoordinatorLayout coordinatorLayout, @NonNull SearchView searchView, @NonNull View view) {
            if (searchView.m12894g() || !(view instanceof SearchBar)) {
                return false;
            }
            searchView.setupWithSearchBar((SearchBar) view);
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Behavior(@NonNull Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C2822a();

        /* JADX INFO: renamed from: c */
        public String f10405c;

        /* JADX INFO: renamed from: d */
        public int f10406d;

        /* JADX INFO: renamed from: com.google.android.material.search.SearchView$SavedState$a */
        public class C2822a implements Parcelable.ClassLoaderCreator<SavedState> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public SavedState(Parcel parcel) {
            this(parcel, null);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.f10405c);
            parcel.writeInt(this.f10406d);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f10405c = parcel.readString();
            this.f10406d = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.search.SearchView$a */
    public interface InterfaceC2823a {
        /* JADX INFO: renamed from: a */
        void m12904a(@NonNull SearchView searchView, @NonNull EnumC2824b enumC2824b, @NonNull EnumC2824b enumC2824b2);
    }

    /* JADX INFO: renamed from: com.google.android.material.search.SearchView$b */
    public enum EnumC2824b {
        HIDING,
        HIDDEN,
        SHOWING,
        SHOWN
    }

    private Window getActivityWindow() {
        Activity activityM386a = C0130b.m386a(getContext());
        if (activityM386a == null) {
            return null;
        }
        return activityM386a.getWindow();
    }

    private float getOverlayElevation() {
        SearchBar searchBar = this.f10395n;
        return searchBar != null ? searchBar.getCompatElevation() : getResources().getDimension(C6740d.f25988u);
    }

    private int getStatusBarHeight() {
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private void setStatusBarSpacerEnabledInternal(boolean z10) {
        this.f10384c.setVisibility(z10 ? 0 : 8);
    }

    private void setUpBackgroundViewElevationOverlay(float f10) {
        C12779a c12779a = this.f10393l;
        if (c12779a == null || this.f10383b == null) {
            return;
        }
        this.f10383b.setBackgroundColor(c12779a.m47641c(this.f10400s, f10));
    }

    private void setUpHeaderLayout(int i10) {
        if (i10 != -1) {
            m12892e(LayoutInflater.from(getContext()).inflate(i10, (ViewGroup) this.f10385d, false));
        }
    }

    private void setUpStatusBarSpacer(int i10) {
        if (this.f10384c.getLayoutParams().height != i10) {
            this.f10384c.getLayoutParams().height = i10;
            this.f10384c.requestLayout();
        }
    }

    @Override // cd.InterfaceC1621b
    /* JADX INFO: renamed from: a */
    public void mo8192a(@NonNull BackEventCompat backEventCompat) {
        if (!m12893f() && this.f10395n != null && Build.VERSION.SDK_INT >= 34) {
            throw null;
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (this.f10390i) {
            this.f10389h.addView(view, i10, layoutParams);
        } else {
            super.addView(view, i10, layoutParams);
        }
    }

    @Override // cd.InterfaceC1621b
    /* JADX INFO: renamed from: b */
    public void mo8193b() {
        if (!m12893f() && this.f10395n != null && Build.VERSION.SDK_INT >= 34) {
            throw null;
        }
    }

    @Override // cd.InterfaceC1621b
    /* JADX INFO: renamed from: c */
    public void mo8194c(@NonNull BackEventCompat backEventCompat) {
        if (!m12893f() && this.f10395n != null) {
            throw null;
        }
    }

    @Override // cd.InterfaceC1621b
    /* JADX INFO: renamed from: d */
    public void mo8195d() {
        if (!m12893f()) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: e */
    public void m12892e(@NonNull View view) {
        this.f10385d.addView(view);
        this.f10385d.setVisibility(0);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m12893f() {
        return this.f10403v.equals(EnumC2824b.HIDDEN) || this.f10403v.equals(EnumC2824b.HIDING);
    }

    /* JADX INFO: renamed from: g */
    public boolean m12894g() {
        return this.f10395n != null;
    }

    public C1625f getBackHelper() {
        throw null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC0523b
    @NonNull
    public CoordinatorLayout.AbstractC0524c<SearchView> getBehavior() {
        return new Behavior();
    }

    @NonNull
    public EnumC2824b getCurrentTransitionState() {
        return this.f10403v;
    }

    public int getDefaultNavigationIconResource() {
        return C6741e.f25995b;
    }

    @NonNull
    public EditText getEditText() {
        return this.f10388g;
    }

    public CharSequence getHint() {
        return this.f10388g.getHint();
    }

    @NonNull
    public TextView getSearchPrefix() {
        return this.f10387f;
    }

    public CharSequence getSearchPrefixText() {
        return this.f10387f.getText();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public int getSoftInputMode() {
        return this.f10396o;
    }

    @NonNull
    @SuppressLint({"KotlinPropertyAccess"})
    public Editable getText() {
        return this.f10388g.getText();
    }

    @NonNull
    public Toolbar getToolbar() {
        return this.f10386e;
    }

    /* JADX INFO: renamed from: h */
    public final void m12895h(@NonNull EnumC2824b enumC2824b, boolean z10) {
        if (this.f10403v.equals(enumC2824b)) {
            return;
        }
        if (z10) {
            if (enumC2824b == EnumC2824b.SHOWN) {
                setModalForAccessibility(true);
            } else if (enumC2824b == EnumC2824b.HIDDEN) {
                setModalForAccessibility(false);
            }
        }
        EnumC2824b enumC2824b2 = this.f10403v;
        this.f10403v = enumC2824b;
        Iterator it = new LinkedHashSet(this.f10394m).iterator();
        while (it.hasNext()) {
            ((InterfaceC2823a) it.next()).m12904a(this, enumC2824b2, enumC2824b);
        }
        m12897j(enumC2824b);
    }

    @SuppressLint({"InlinedApi"})
    /* JADX INFO: renamed from: i */
    public final void m12896i(ViewGroup viewGroup, boolean z10) {
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt != this) {
                if (childAt.findViewById(this.f10382a.getId()) != null) {
                    m12896i((ViewGroup) childAt, z10);
                } else if (z10) {
                    this.f10404w.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    C0625o0.m3060w0(childAt, 4);
                } else {
                    Map<View, Integer> map = this.f10404w;
                    if (map != null && map.containsKey(childAt)) {
                        C0625o0.m3060w0(childAt, this.f10404w.get(childAt).intValue());
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m12897j(@NonNull EnumC2824b enumC2824b) {
        if (this.f10395n == null || !this.f10392k) {
            return;
        }
        if (enumC2824b.equals(EnumC2824b.SHOWN)) {
            this.f10391j.m8197b();
        } else if (enumC2824b.equals(EnumC2824b.HIDDEN)) {
            this.f10391j.m8199d();
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m12898k() {
        ImageButton imageButtonM441d = C0144p.m441d(this.f10386e);
        if (imageButtonM441d == null) {
            return;
        }
        int i10 = this.f10382a.getVisibility() == 0 ? 1 : 0;
        Drawable drawableM40120q = C10425a.m40120q(imageButtonM441d.getDrawable());
        if (drawableM40120q instanceof C7954b) {
            ((C7954b) drawableM40120q).m32951a(i10);
        }
        if (drawableM40120q instanceof C0133e) {
            ((C0133e) drawableM40120q).m396a(i10);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m12899l() {
        Window activityWindow = getActivityWindow();
        if (activityWindow != null) {
            this.f10396o = activityWindow.getAttributes().softInputMode;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C6364h.m27759e(this);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m12899l();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m3321a());
        setText(savedState.f10405c);
        setVisible(savedState.f10406d == 0);
    }

    @Override // android.view.View
    @NonNull
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Editable text = getText();
        savedState.f10405c = text == null ? null : text.toString();
        savedState.f10406d = this.f10382a.getVisibility();
        return savedState;
    }

    public void setAnimatedNavigationIcon(boolean z10) {
        this.f10397p = z10;
    }

    public void setAutoShowKeyboard(boolean z10) {
        this.f10399r = z10;
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        setUpBackgroundViewElevationOverlay(f10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setHint(CharSequence charSequence) {
        this.f10388g.setHint(charSequence);
    }

    public void setMenuItemsAnimated(boolean z10) {
        this.f10398q = z10;
    }

    public void setModalForAccessibility(boolean z10) {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        if (z10) {
            this.f10404w = new HashMap(viewGroup.getChildCount());
        }
        m12896i(viewGroup, z10);
        if (z10) {
            return;
        }
        this.f10404w = null;
    }

    public void setOnMenuItemClickListener(Toolbar.InterfaceC0481h interfaceC0481h) {
        this.f10386e.setOnMenuItemClickListener(interfaceC0481h);
    }

    public void setSearchPrefixText(CharSequence charSequence) {
        this.f10387f.setText(charSequence);
        this.f10387f.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    public void setStatusBarSpacerEnabled(boolean z10) {
        this.f10402u = true;
        setStatusBarSpacerEnabledInternal(z10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @SuppressLint({"KotlinPropertyAccess"})
    public void setText(CharSequence charSequence) {
        this.f10388g.setText(charSequence);
    }

    public void setToolbarTouchscreenBlocksFocus(boolean z10) {
        this.f10386e.setTouchscreenBlocksFocus(z10);
    }

    public void setTransitionState(@NonNull EnumC2824b enumC2824b) {
        m12895h(enumC2824b, true);
    }

    public void setUseWindowInsetsController(boolean z10) {
        this.f10401t = z10;
    }

    public void setVisible(boolean z10) {
        boolean z11 = this.f10382a.getVisibility() == 0;
        this.f10382a.setVisibility(z10 ? 0 : 8);
        m12898k();
        m12895h(z10 ? EnumC2824b.SHOWN : EnumC2824b.HIDDEN, z11 != z10);
    }

    public void setupWithSearchBar(SearchBar searchBar) {
        this.f10395n = searchBar;
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setHint(int i10) {
        this.f10388g.setHint(i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setText(int i10) {
        this.f10388g.setText(i10);
    }
}
