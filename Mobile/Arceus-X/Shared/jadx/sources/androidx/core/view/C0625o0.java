package androidx.core.view;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import p206j2.C7023e;
import p564y2.C13017p;
import p564y2.InterfaceC13020s;

/* JADX INFO: renamed from: androidx.core.view.o0 */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"PrivateConstructorForUtilityClass"})
public class C0625o0 {

    /* JADX INFO: renamed from: a */
    public static WeakHashMap<View, C0645y0> f2453a;

    /* JADX INFO: renamed from: b */
    public static Field f2454b;

    /* JADX INFO: renamed from: c */
    public static boolean f2455c;

    /* JADX INFO: renamed from: d */
    public static final int[] f2456d = {C7023e.f27504b, C7023e.f27505c, C7023e.f27516n, C7023e.f27527y, C7023e.f27483B, C7023e.f27484C, C7023e.f27485D, C7023e.f27486E, C7023e.f27487F, C7023e.f27488G, C7023e.f27506d, C7023e.f27507e, C7023e.f27508f, C7023e.f27509g, C7023e.f27510h, C7023e.f27511i, C7023e.f27512j, C7023e.f27513k, C7023e.f27514l, C7023e.f27515m, C7023e.f27517o, C7023e.f27518p, C7023e.f27519q, C7023e.f27520r, C7023e.f27521s, C7023e.f27522t, C7023e.f27523u, C7023e.f27524v, C7023e.f27525w, C7023e.f27526x, C7023e.f27528z, C7023e.f27482A};

    /* JADX INFO: renamed from: e */
    public static final InterfaceC0583a0 f2457e = new InterfaceC0583a0() { // from class: androidx.core.view.n0
        @Override // androidx.core.view.InterfaceC0583a0
        /* JADX INFO: renamed from: a */
        public final C0591d mo2806a(C0591d c0591d) {
            return C0625o0.m3015a(c0591d);
        }
    };

    /* JADX INFO: renamed from: f */
    public static final e f2458f = new e();

    /* JADX INFO: renamed from: androidx.core.view.o0$a */
    public class a extends f<Boolean> {
        public a(int i10, Class cls, int i11) {
            super(i10, cls, i11);
        }

        /* JADX DEBUG: Method merged with bridge method: c(Landroid/view/View;)Ljava/lang/Object; */
        @Override // androidx.core.view.C0625o0.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Boolean mo3067c(View view) {
            return Boolean.valueOf(k.m3117c(view));
        }

        /* JADX DEBUG: Method merged with bridge method: d(Landroid/view/View;Ljava/lang/Object;)V */
        @Override // androidx.core.view.C0625o0.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void mo3068d(View view, Boolean bool) {
            k.m3120f(view, bool.booleanValue());
        }

        /* JADX DEBUG: Method merged with bridge method: g(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.core.view.C0625o0.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean mo3069g(Boolean bool, Boolean bool2) {
            return !m3087a(bool, bool2);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.o0$b */
    public class b extends f<CharSequence> {
        public b(int i10, Class cls, int i11, int i12) {
            super(i10, cls, i11, i12);
        }

        /* JADX DEBUG: Method merged with bridge method: c(Landroid/view/View;)Ljava/lang/Object; */
        @Override // androidx.core.view.C0625o0.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public CharSequence mo3067c(View view) {
            return k.m3115a(view);
        }

        /* JADX DEBUG: Method merged with bridge method: d(Landroid/view/View;Ljava/lang/Object;)V */
        @Override // androidx.core.view.C0625o0.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void mo3068d(View view, CharSequence charSequence) {
            k.m3119e(view, charSequence);
        }

        /* JADX DEBUG: Method merged with bridge method: g(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.core.view.C0625o0.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean mo3069g(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.o0$c */
    public class c extends f<CharSequence> {
        public c(int i10, Class cls, int i11, int i12) {
            super(i10, cls, i11, i12);
        }

        /* JADX DEBUG: Method merged with bridge method: c(Landroid/view/View;)Ljava/lang/Object; */
        @Override // androidx.core.view.C0625o0.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public CharSequence mo3067c(View view) {
            return m.m3124b(view);
        }

        /* JADX DEBUG: Method merged with bridge method: d(Landroid/view/View;Ljava/lang/Object;)V */
        @Override // androidx.core.view.C0625o0.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void mo3068d(View view, CharSequence charSequence) {
            m.m3126d(view, charSequence);
        }

        /* JADX DEBUG: Method merged with bridge method: g(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.core.view.C0625o0.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean mo3069g(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.o0$d */
    public class d extends f<Boolean> {
        public d(int i10, Class cls, int i11) {
            super(i10, cls, i11);
        }

        /* JADX DEBUG: Method merged with bridge method: c(Landroid/view/View;)Ljava/lang/Object; */
        @Override // androidx.core.view.C0625o0.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Boolean mo3067c(View view) {
            return Boolean.valueOf(k.m3116b(view));
        }

        /* JADX DEBUG: Method merged with bridge method: d(Landroid/view/View;Ljava/lang/Object;)V */
        @Override // androidx.core.view.C0625o0.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void mo3068d(View view, Boolean bool) {
            k.m3118d(view, bool.booleanValue());
        }

        /* JADX DEBUG: Method merged with bridge method: g(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.core.view.C0625o0.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean mo3069g(Boolean bool, Boolean bool2) {
            return !m3087a(bool, bool2);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.o0$e */
    public static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a */
        public final WeakHashMap<View, Boolean> f2459a = new WeakHashMap<>();

        /* JADX INFO: renamed from: a */
        public void m3082a(View view) {
            this.f2459a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (view.isAttachedToWindow()) {
                m3084c(view);
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m3083b(Map.Entry<View, Boolean> entry) {
            View key = entry.getKey();
            boolean zBooleanValue = entry.getValue().booleanValue();
            boolean z10 = key.isShown() && key.getWindowVisibility() == 0;
            if (zBooleanValue != z10) {
                C0625o0.m3010V(key, z10 ? 16 : 32);
                entry.setValue(Boolean.valueOf(z10));
            }
        }

        /* JADX INFO: renamed from: c */
        public final void m3084c(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        /* JADX INFO: renamed from: d */
        public void m3085d(View view) {
            this.f2459a.remove(view);
            view.removeOnAttachStateChangeListener(this);
            m3086e(view);
        }

        /* JADX INFO: renamed from: e */
        public final void m3086e(View view) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                Iterator<Map.Entry<View, Boolean>> it = this.f2459a.entrySet().iterator();
                while (it.hasNext()) {
                    m3083b(it.next());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            m3084c(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.o0$f */
    public static abstract class f<T> {

        /* JADX INFO: renamed from: a */
        public final int f2460a;

        /* JADX INFO: renamed from: b */
        public final Class<T> f2461b;

        /* JADX INFO: renamed from: c */
        public final int f2462c;

        /* JADX INFO: renamed from: d */
        public final int f2463d;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public f(int i10, Class<T> cls, int i11) {
            this(i10, cls, 0, i11);
        }

        /* JADX INFO: renamed from: a */
        public boolean m3087a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        /* JADX INFO: renamed from: b */
        public final boolean m3088b() {
            return Build.VERSION.SDK_INT >= this.f2462c;
        }

        /* JADX INFO: renamed from: c */
        public abstract T mo3067c(View view);

        /* JADX INFO: renamed from: d */
        public abstract void mo3068d(View view, T t8);

        /* JADX INFO: renamed from: e */
        public T m3089e(View view) {
            if (m3088b()) {
                return mo3067c(view);
            }
            T t8 = (T) view.getTag(this.f2460a);
            if (this.f2461b.isInstance(t8)) {
                return t8;
            }
            return null;
        }

        /* JADX INFO: renamed from: f */
        public void m3090f(View view, T t8) {
            if (m3088b()) {
                mo3068d(view, t8);
            } else if (mo3069g(m3089e(view), t8)) {
                C0625o0.m3033j(view);
                view.setTag(this.f2460a, t8);
                C0625o0.m3010V(view, this.f2463d);
            }
        }

        /* JADX INFO: renamed from: g */
        public abstract boolean mo3069g(T t8, T t10);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public f(int i10, Class<T> cls, int i11, int i12) {
            this.f2460a = i10;
            this.f2461b = cls;
            this.f2463d = i11;
            this.f2462c = i12;
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.o0$g */
    public static class g {
        /* JADX INFO: renamed from: a */
        public static WindowInsets m3091a(View view, WindowInsets windowInsets) {
            return C0635t0.f2481b ? C0635t0.m3177b(view, windowInsets) : view.dispatchApplyWindowInsets(windowInsets);
        }

        /* JADX INFO: renamed from: b */
        public static WindowInsets m3092b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        /* JADX INFO: renamed from: c */
        public static void m3093c(View view) {
            view.requestApplyInsets();
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.o0$h */
    public static class h {

        /* JADX INFO: renamed from: androidx.core.view.o0$h$a */
        public class a implements View.OnApplyWindowInsetsListener {

            /* JADX INFO: renamed from: a */
            public WindowInsetsCompat f2464a = null;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ View f2465b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ InterfaceC0644y f2466c;

            /* JADX DEBUG: Incorrect args count in method signature: ()V */
            public a(View view, InterfaceC0644y interfaceC0644y) {
                this.f2465b = view;
                this.f2466c = interfaceC0644y;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(windowInsets, view);
                int i10 = Build.VERSION.SDK_INT;
                if (i10 < 30) {
                    h.m3094a(windowInsets, this.f2465b);
                    if (windowInsetsCompat.equals(this.f2464a)) {
                        return this.f2466c.mo460K(view, windowInsetsCompat).toWindowInsets();
                    }
                }
                this.f2464a = windowInsetsCompat;
                WindowInsetsCompat windowInsetsCompatMo460K = this.f2466c.mo460K(view, windowInsetsCompat);
                if (i10 >= 30) {
                    return windowInsetsCompatMo460K.toWindowInsets();
                }
                C0625o0.m3034j0(view);
                return windowInsetsCompatMo460K.toWindowInsets();
            }
        }

        /* JADX INFO: renamed from: a */
        public static void m3094a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(C7023e.f27502U);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        /* JADX INFO: renamed from: b */
        public static WindowInsetsCompat m3095b(View view, WindowInsetsCompat windowInsetsCompat, Rect rect) {
            WindowInsets windowInsets = windowInsetsCompat.toWindowInsets();
            if (windowInsets != null) {
                return WindowInsetsCompat.toWindowInsetsCompat(view.computeSystemWindowInsets(windowInsets, rect), view);
            }
            rect.setEmpty();
            return windowInsetsCompat;
        }

        /* JADX INFO: renamed from: c */
        public static ColorStateList m3096c(View view) {
            return view.getBackgroundTintList();
        }

        /* JADX INFO: renamed from: d */
        public static PorterDuff.Mode m3097d(View view) {
            return view.getBackgroundTintMode();
        }

        /* JADX INFO: renamed from: e */
        public static float m3098e(View view) {
            return view.getElevation();
        }

        /* JADX INFO: renamed from: f */
        public static String m3099f(View view) {
            return view.getTransitionName();
        }

        /* JADX INFO: renamed from: g */
        public static float m3100g(View view) {
            return view.getTranslationZ();
        }

        /* JADX INFO: renamed from: h */
        public static float m3101h(View view) {
            return view.getZ();
        }

        /* JADX INFO: renamed from: i */
        public static boolean m3102i(View view) {
            return view.isNestedScrollingEnabled();
        }

        /* JADX INFO: renamed from: j */
        public static void m3103j(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        /* JADX INFO: renamed from: k */
        public static void m3104k(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        /* JADX INFO: renamed from: l */
        public static void m3105l(View view, float f10) {
            view.setElevation(f10);
        }

        /* JADX INFO: renamed from: m */
        public static void m3106m(View view, InterfaceC0644y interfaceC0644y) {
            a aVar = interfaceC0644y != null ? new a(view, interfaceC0644y) : null;
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(C7023e.f27494M, aVar);
            }
            if (view.getTag(C7023e.f27493L) != null) {
                return;
            }
            if (aVar != null) {
                view.setOnApplyWindowInsetsListener(aVar);
            } else {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(C7023e.f27502U));
            }
        }

        /* JADX INFO: renamed from: n */
        public static void m3107n(View view, String str) {
            view.setTransitionName(str);
        }

        /* JADX INFO: renamed from: o */
        public static void m3108o(View view, float f10) {
            view.setTranslationZ(f10);
        }

        /* JADX INFO: renamed from: p */
        public static void m3109p(View view, float f10) {
            view.setZ(f10);
        }

        /* JADX INFO: renamed from: q */
        public static void m3110q(View view) {
            view.stopNestedScroll();
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.o0$i */
    public static class i {
        /* JADX INFO: renamed from: a */
        public static WindowInsetsCompat m3111a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(rootWindowInsets);
            windowInsetsCompat.setRootWindowInsets(windowInsetsCompat);
            windowInsetsCompat.copyRootViewBounds(view.getRootView());
            return windowInsetsCompat;
        }

        /* JADX INFO: renamed from: b */
        public static void m3112b(View view, int i10, int i11) {
            view.setScrollIndicators(i10, i11);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.o0$j */
    public static class j {
        /* JADX INFO: renamed from: a */
        public static int m3113a(View view) {
            return view.getImportantForAutofill();
        }

        /* JADX INFO: renamed from: b */
        public static void m3114b(View view, int i10) {
            view.setImportantForAutofill(i10);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.o0$k */
    public static class k {
        /* JADX INFO: renamed from: a */
        public static CharSequence m3115a(View view) {
            return view.getAccessibilityPaneTitle();
        }

        /* JADX INFO: renamed from: b */
        public static boolean m3116b(View view) {
            return view.isAccessibilityHeading();
        }

        /* JADX INFO: renamed from: c */
        public static boolean m3117c(View view) {
            return view.isScreenReaderFocusable();
        }

        /* JADX INFO: renamed from: d */
        public static void m3118d(View view, boolean z10) {
            view.setAccessibilityHeading(z10);
        }

        /* JADX INFO: renamed from: e */
        public static void m3119e(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        /* JADX INFO: renamed from: f */
        public static void m3120f(View view, boolean z10) {
            view.setScreenReaderFocusable(z10);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.o0$l */
    public static class l {
        /* JADX INFO: renamed from: a */
        public static View.AccessibilityDelegate m3121a(View view) {
            return view.getAccessibilityDelegate();
        }

        /* JADX INFO: renamed from: b */
        public static void m3122b(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i10, i11);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.o0$m */
    public static class m {
        /* JADX INFO: renamed from: a */
        public static WindowInsets m3123a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        /* JADX INFO: renamed from: b */
        public static CharSequence m3124b(View view) {
            return view.getStateDescription();
        }

        /* JADX INFO: renamed from: c */
        public static C0619l1 m3125c(View view) {
            WindowInsetsController windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                return C0619l1.m2946g(windowInsetsController);
            }
            return null;
        }

        /* JADX INFO: renamed from: d */
        public static void m3126d(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.o0$n */
    public static final class n {
        /* JADX INFO: renamed from: a */
        public static String[] m3127a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        /* JADX INFO: renamed from: b */
        public static C0591d m3128b(View view, C0591d c0591d) {
            ContentInfo contentInfoM2831f = c0591d.m2831f();
            ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoM2831f);
            if (contentInfoPerformReceiveContent == null) {
                return null;
            }
            return contentInfoPerformReceiveContent == contentInfoM2831f ? c0591d : C0591d.m2827g(contentInfoPerformReceiveContent);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.o0$o */
    public interface o {
        boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent);
    }

    /* JADX INFO: renamed from: androidx.core.view.o0$p */
    public static class p {

        /* JADX INFO: renamed from: d */
        public static final ArrayList<WeakReference<View>> f2467d = new ArrayList<>();

        /* JADX INFO: renamed from: a */
        public WeakHashMap<View, Boolean> f2468a = null;

        /* JADX INFO: renamed from: b */
        public SparseArray<WeakReference<View>> f2469b = null;

        /* JADX INFO: renamed from: c */
        public WeakReference<KeyEvent> f2470c = null;

        /* JADX INFO: renamed from: a */
        public static p m3129a(View view) {
            int i10 = C7023e.f27500S;
            p pVar = (p) view.getTag(i10);
            if (pVar != null) {
                return pVar;
            }
            p pVar2 = new p();
            view.setTag(i10, pVar2);
            return pVar2;
        }

        /* JADX INFO: renamed from: b */
        public boolean m3130b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                m3135g();
            }
            View viewM3131c = m3131c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (viewM3131c != null && !KeyEvent.isModifierKey(keyCode)) {
                    m3132d().put(keyCode, new WeakReference<>(viewM3131c));
                }
            }
            return viewM3131c != null;
        }

        /* JADX INFO: renamed from: c */
        public final View m3131c(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f2468a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View viewM3131c = m3131c(viewGroup.getChildAt(childCount), keyEvent);
                        if (viewM3131c != null) {
                            return viewM3131c;
                        }
                    }
                }
                if (m3133e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: d */
        public final SparseArray<WeakReference<View>> m3132d() {
            if (this.f2469b == null) {
                this.f2469b = new SparseArray<>();
            }
            return this.f2469b;
        }

        /* JADX INFO: renamed from: e */
        public final boolean m3133e(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(C7023e.f27501T);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((o) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: f */
        public boolean m3134f(KeyEvent keyEvent) {
            WeakReference<View> weakReferenceValueAt;
            int iIndexOfKey;
            WeakReference<KeyEvent> weakReference = this.f2470c;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.f2470c = new WeakReference<>(keyEvent);
            SparseArray<WeakReference<View>> sparseArrayM3132d = m3132d();
            if (keyEvent.getAction() != 1 || (iIndexOfKey = sparseArrayM3132d.indexOfKey(keyEvent.getKeyCode())) < 0) {
                weakReferenceValueAt = null;
            } else {
                weakReferenceValueAt = sparseArrayM3132d.valueAt(iIndexOfKey);
                sparseArrayM3132d.removeAt(iIndexOfKey);
            }
            if (weakReferenceValueAt == null) {
                weakReferenceValueAt = sparseArrayM3132d.get(keyEvent.getKeyCode());
            }
            if (weakReferenceValueAt == null) {
                return false;
            }
            View view = weakReferenceValueAt.get();
            if (view != null && view.isAttachedToWindow()) {
                m3133e(view, keyEvent);
            }
            return true;
        }

        /* JADX INFO: renamed from: g */
        public final void m3135g() {
            WeakHashMap<View, Boolean> weakHashMap = this.f2468a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = f2467d;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                try {
                    if (this.f2468a == null) {
                        this.f2468a = new WeakHashMap<>();
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ArrayList<WeakReference<View>> arrayList2 = f2467d;
                        View view = arrayList2.get(size).get();
                        if (view == null) {
                            arrayList2.remove(size);
                        } else {
                            this.f2468a.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f2468a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: A */
    public static int m2978A(View view) {
        return view.getMinimumHeight();
    }

    /* JADX INFO: renamed from: A0 */
    public static void m2979A0(View view, InterfaceC0644y interfaceC0644y) {
        h.m3106m(view, interfaceC0644y);
    }

    @Deprecated
    /* JADX INFO: renamed from: B */
    public static int m2980B(View view) {
        return view.getMinimumWidth();
    }

    @Deprecated
    /* JADX INFO: renamed from: B0 */
    public static void m2981B0(View view, int i10, int i11, int i12, int i13) {
        view.setPaddingRelative(i10, i11, i12, i13);
    }

    /* JADX INFO: renamed from: C */
    public static String[] m2982C(View view) {
        return Build.VERSION.SDK_INT >= 31 ? n.m3127a(view) : (String[]) view.getTag(C7023e.f27496O);
    }

    /* JADX INFO: renamed from: C0 */
    public static void m2983C0(View view, boolean z10) {
        m3038l0().m3090f(view, Boolean.valueOf(z10));
    }

    @Deprecated
    /* JADX INFO: renamed from: D */
    public static int m2984D(View view) {
        return view.getPaddingEnd();
    }

    /* JADX INFO: renamed from: D0 */
    public static void m2985D0(View view, int i10, int i11) {
        i.m3112b(view, i10, i11);
    }

    @Deprecated
    /* JADX INFO: renamed from: E */
    public static int m2986E(View view) {
        return view.getPaddingStart();
    }

    /* JADX INFO: renamed from: E0 */
    public static void m2987E0(View view, CharSequence charSequence) {
        m2997J0().m3090f(view, charSequence);
    }

    /* JADX INFO: renamed from: F */
    public static WindowInsetsCompat m2988F(View view) {
        return i.m3111a(view);
    }

    /* JADX INFO: renamed from: F0 */
    public static void m2989F0(View view, String str) {
        h.m3107n(view, str);
    }

    /* JADX INFO: renamed from: G */
    public static CharSequence m2990G(View view) {
        return m2997J0().m3089e(view);
    }

    /* JADX INFO: renamed from: G0 */
    public static void m2991G0(View view, float f10) {
        h.m3108o(view, f10);
    }

    /* JADX INFO: renamed from: H */
    public static String m2992H(View view) {
        return h.m3099f(view);
    }

    /* JADX INFO: renamed from: H0 */
    public static void m2993H0(View view, C0593d1.b bVar) {
        C0593d1.m2842e(view, bVar);
    }

    /* JADX INFO: renamed from: I */
    public static float m2994I(View view) {
        return h.m3100g(view);
    }

    /* JADX INFO: renamed from: I0 */
    public static void m2995I0(View view, float f10) {
        h.m3109p(view, f10);
    }

    @Deprecated
    /* JADX INFO: renamed from: J */
    public static C0619l1 m2996J(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return m.m3125c(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return C0590c1.m2820a(window, view);
                }
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: J0 */
    public static f<CharSequence> m2997J0() {
        return new c(C7023e.f27498Q, CharSequence.class, 64, 30);
    }

    @Deprecated
    /* JADX INFO: renamed from: K */
    public static int m2998K(View view) {
        return view.getWindowSystemUiVisibility();
    }

    /* JADX INFO: renamed from: K0 */
    public static void m2999K0(View view) {
        h.m3110q(view);
    }

    /* JADX INFO: renamed from: L */
    public static float m3000L(View view) {
        return h.m3101h(view);
    }

    /* JADX INFO: renamed from: M */
    public static boolean m3001M(View view) {
        return m3039m(view) != null;
    }

    @Deprecated
    /* JADX INFO: renamed from: N */
    public static boolean m3002N(View view) {
        return view.hasOnClickListeners();
    }

    @Deprecated
    /* JADX INFO: renamed from: O */
    public static boolean m3003O(View view) {
        return view.hasTransientState();
    }

    /* JADX INFO: renamed from: P */
    public static boolean m3004P(View view) {
        Boolean boolM3089e = m3017b().m3089e(view);
        return boolM3089e != null && boolM3089e.booleanValue();
    }

    @Deprecated
    /* JADX INFO: renamed from: Q */
    public static boolean m3005Q(View view) {
        return view.isAttachedToWindow();
    }

    @Deprecated
    /* JADX INFO: renamed from: R */
    public static boolean m3006R(View view) {
        return view.isLaidOut();
    }

    /* JADX INFO: renamed from: S */
    public static boolean m3007S(View view) {
        return h.m3102i(view);
    }

    @Deprecated
    /* JADX INFO: renamed from: T */
    public static boolean m3008T(View view) {
        return view.isPaddingRelative();
    }

    /* JADX INFO: renamed from: U */
    public static boolean m3009U(View view) {
        Boolean boolM3089e = m3038l0().m3089e(view);
        return boolM3089e != null && boolM3089e.booleanValue();
    }

    /* JADX INFO: renamed from: V */
    public static void m3010V(View view, int i10) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z10 = m3043o(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z10) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z10 ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i10);
                if (z10) {
                    accessibilityEventObtain.getText().add(m3043o(view));
                    m3062x0(view);
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i10 == 32) {
                AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.setEventType(32);
                accessibilityEventObtain2.setContentChangeTypes(i10);
                accessibilityEventObtain2.setSource(view);
                view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.getText().add(m3043o(view));
                accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
                return;
            }
            if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i10);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e10);
                }
            }
        }
    }

    /* JADX INFO: renamed from: W */
    public static void m3011W(View view, int i10) {
        view.offsetLeftAndRight(i10);
    }

    /* JADX INFO: renamed from: X */
    public static void m3012X(View view, int i10) {
        view.offsetTopAndBottom(i10);
    }

    /* JADX INFO: renamed from: Y */
    public static WindowInsetsCompat m3013Y(View view, WindowInsetsCompat windowInsetsCompat) {
        WindowInsets windowInsets = windowInsetsCompat.toWindowInsets();
        if (windowInsets != null) {
            WindowInsets windowInsetsM3092b = g.m3092b(view, windowInsets);
            if (!windowInsetsM3092b.equals(windowInsets)) {
                return WindowInsetsCompat.toWindowInsetsCompat(windowInsetsM3092b, view);
            }
        }
        return windowInsetsCompat;
    }

    @Deprecated
    /* JADX INFO: renamed from: Z */
    public static void m3014Z(View view, C13017p c13017p) {
        view.onInitializeAccessibilityNodeInfo(c13017p.m48376N0());
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C0591d m3015a(C0591d c0591d) {
        return c0591d;
    }

    /* JADX INFO: renamed from: a0 */
    public static f<CharSequence> m3016a0() {
        return new b(C7023e.f27492K, CharSequence.class, 8, 28);
    }

    /* JADX INFO: renamed from: b */
    public static f<Boolean> m3017b() {
        return new d(C7023e.f27491J, Boolean.class, 28);
    }

    @Deprecated
    /* JADX INFO: renamed from: b0 */
    public static boolean m3018b0(View view, int i10, Bundle bundle) {
        return view.performAccessibilityAction(i10, bundle);
    }

    /* JADX INFO: renamed from: c */
    public static int m3019c(View view, CharSequence charSequence, InterfaceC13020s interfaceC13020s) {
        int iM3047q = m3047q(view, charSequence);
        if (iM3047q != -1) {
            m3021d(view, new C13017p.a(iM3047q, charSequence, interfaceC13020s));
        }
        return iM3047q;
    }

    /* JADX INFO: renamed from: c0 */
    public static C0591d m3020c0(View view, C0591d c0591d) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + c0591d + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return n.m3128b(view, c0591d);
        }
        InterfaceC0646z interfaceC0646z = (InterfaceC0646z) view.getTag(C7023e.f27495N);
        if (interfaceC0646z == null) {
            return m3057v(view).mo2806a(c0591d);
        }
        C0591d c0591dMo3236a = interfaceC0646z.mo3236a(view, c0591d);
        if (c0591dMo3236a == null) {
            return null;
        }
        return m3057v(view).mo2806a(c0591dMo3236a);
    }

    /* JADX INFO: renamed from: d */
    public static void m3021d(View view, C13017p.a aVar) {
        m3033j(view);
        m3030h0(aVar.m48436b(), view);
        m3045p(view).add(aVar);
        m3010V(view, 0);
    }

    @Deprecated
    /* JADX INFO: renamed from: d0 */
    public static void m3022d0(View view) {
        view.postInvalidateOnAnimation();
    }

    @Deprecated
    /* JADX INFO: renamed from: e */
    public static C0645y0 m3023e(View view) {
        if (f2453a == null) {
            f2453a = new WeakHashMap<>();
        }
        C0645y0 c0645y0 = f2453a.get(view);
        if (c0645y0 != null) {
            return c0645y0;
        }
        C0645y0 c0645y1 = new C0645y0(view);
        f2453a.put(view, c0645y1);
        return c0645y1;
    }

    @Deprecated
    /* JADX INFO: renamed from: e0 */
    public static void m3024e0(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    /* JADX INFO: renamed from: f */
    public static WindowInsetsCompat m3025f(View view, WindowInsetsCompat windowInsetsCompat, Rect rect) {
        return h.m3095b(view, windowInsetsCompat, rect);
    }

    @SuppressLint({"LambdaLast"})
    @Deprecated
    /* JADX INFO: renamed from: f0 */
    public static void m3026f0(View view, Runnable runnable, long j10) {
        view.postOnAnimationDelayed(runnable, j10);
    }

    /* JADX INFO: renamed from: g */
    public static WindowInsetsCompat m3027g(View view, WindowInsetsCompat windowInsetsCompat) {
        int i10 = Build.VERSION.SDK_INT;
        WindowInsets windowInsets = windowInsetsCompat.toWindowInsets();
        if (windowInsets != null) {
            WindowInsets windowInsetsM3123a = i10 >= 30 ? m.m3123a(view, windowInsets) : g.m3091a(view, windowInsets);
            if (!windowInsetsM3123a.equals(windowInsets)) {
                return WindowInsetsCompat.toWindowInsetsCompat(windowInsetsM3123a, view);
            }
        }
        return windowInsetsCompat;
    }

    /* JADX INFO: renamed from: g0 */
    public static void m3028g0(View view, int i10) {
        m3030h0(i10, view);
        m3010V(view, 0);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m3029h(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return p.m3129a(view).m3130b(view, keyEvent);
    }

    /* JADX INFO: renamed from: h0 */
    public static void m3030h0(int i10, View view) {
        List<C13017p.a> listM3045p = m3045p(view);
        for (int i11 = 0; i11 < listM3045p.size(); i11++) {
            if (listM3045p.get(i11).m48436b() == i10) {
                listM3045p.remove(i11);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static boolean m3031i(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return p.m3129a(view).m3134f(keyEvent);
    }

    /* JADX INFO: renamed from: i0 */
    public static void m3032i0(View view, C13017p.a aVar, CharSequence charSequence, InterfaceC13020s interfaceC13020s) {
        if (interfaceC13020s == null && charSequence == null) {
            m3028g0(view, aVar.m48436b());
        } else {
            m3021d(view, aVar.m48435a(charSequence, interfaceC13020s));
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m3033j(View view) {
        C0582a c0582aM3037l = m3037l(view);
        if (c0582aM3037l == null) {
            c0582aM3037l = new C0582a();
        }
        m3040m0(view, c0582aM3037l);
    }

    /* JADX INFO: renamed from: j0 */
    public static void m3034j0(View view) {
        g.m3093c(view);
    }

    @Deprecated
    /* JADX INFO: renamed from: k */
    public static int m3035k() {
        return View.generateViewId();
    }

    /* JADX INFO: renamed from: k0 */
    public static void m3036k0(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
        if (Build.VERSION.SDK_INT >= 29) {
            l.m3122b(view, context, iArr, attributeSet, typedArray, i10, i11);
        }
    }

    /* JADX INFO: renamed from: l */
    public static C0582a m3037l(View view) {
        View.AccessibilityDelegate accessibilityDelegateM3039m = m3039m(view);
        if (accessibilityDelegateM3039m == null) {
            return null;
        }
        return accessibilityDelegateM3039m instanceof C0582a.a ? ((C0582a.a) accessibilityDelegateM3039m).f2352a : new C0582a(accessibilityDelegateM3039m);
    }

    /* JADX INFO: renamed from: l0 */
    public static f<Boolean> m3038l0() {
        return new a(C7023e.f27497P, Boolean.class, 28);
    }

    /* JADX INFO: renamed from: m */
    public static View.AccessibilityDelegate m3039m(View view) {
        return Build.VERSION.SDK_INT >= 29 ? l.m3121a(view) : m3041n(view);
    }

    /* JADX INFO: renamed from: m0 */
    public static void m3040m0(View view, C0582a c0582a) {
        if (c0582a == null && (m3039m(view) instanceof C0582a.a)) {
            c0582a = new C0582a();
        }
        m3062x0(view);
        view.setAccessibilityDelegate(c0582a == null ? null : c0582a.m2796d());
    }

    /* JADX INFO: renamed from: n */
    public static View.AccessibilityDelegate m3041n(View view) {
        if (f2455c) {
            return null;
        }
        if (f2454b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f2454b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f2455c = true;
                return null;
            }
        }
        try {
            Object obj = f2454b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f2455c = true;
            return null;
        }
    }

    /* JADX INFO: renamed from: n0 */
    public static void m3042n0(View view, boolean z10) {
        m3017b().m3090f(view, Boolean.valueOf(z10));
    }

    /* JADX INFO: renamed from: o */
    public static CharSequence m3043o(View view) {
        return m3016a0().m3089e(view);
    }

    @Deprecated
    /* JADX INFO: renamed from: o0 */
    public static void m3044o0(View view, int i10) {
        view.setAccessibilityLiveRegion(i10);
    }

    /* JADX INFO: renamed from: p */
    public static List<C13017p.a> m3045p(View view) {
        int i10 = C7023e.f27489H;
        ArrayList arrayList = (ArrayList) view.getTag(i10);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(i10, arrayList2);
        return arrayList2;
    }

    /* JADX INFO: renamed from: p0 */
    public static void m3046p0(View view, CharSequence charSequence) {
        m3016a0().m3090f(view, charSequence);
        if (charSequence != null) {
            f2458f.m3082a(view);
        } else {
            f2458f.m3085d(view);
        }
    }

    /* JADX INFO: renamed from: q */
    public static int m3047q(View view, CharSequence charSequence) {
        List<C13017p.a> listM3045p = m3045p(view);
        for (int i10 = 0; i10 < listM3045p.size(); i10++) {
            if (TextUtils.equals(charSequence, listM3045p.get(i10).m48437c())) {
                return listM3045p.get(i10).m48436b();
            }
        }
        int i11 = -1;
        int i12 = 0;
        while (true) {
            int[] iArr = f2456d;
            if (i12 >= iArr.length || i11 != -1) {
                break;
            }
            int i13 = iArr[i12];
            boolean z10 = true;
            for (int i14 = 0; i14 < listM3045p.size(); i14++) {
                z10 &= listM3045p.get(i14).m48436b() != i13;
            }
            if (z10) {
                i11 = i13;
            }
            i12++;
        }
        return i11;
    }

    @Deprecated
    /* JADX INFO: renamed from: q0 */
    public static void m3048q0(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    /* JADX INFO: renamed from: r */
    public static ColorStateList m3049r(View view) {
        return h.m3096c(view);
    }

    /* JADX INFO: renamed from: r0 */
    public static void m3050r0(View view, ColorStateList colorStateList) {
        h.m3103j(view, colorStateList);
    }

    /* JADX INFO: renamed from: s */
    public static PorterDuff.Mode m3051s(View view) {
        return h.m3097d(view);
    }

    /* JADX INFO: renamed from: s0 */
    public static void m3052s0(View view, PorterDuff.Mode mode) {
        h.m3104k(view, mode);
    }

    @Deprecated
    /* JADX INFO: renamed from: t */
    public static Display m3053t(View view) {
        return view.getDisplay();
    }

    @Deprecated
    /* JADX INFO: renamed from: t0 */
    public static void m3054t0(View view, Rect rect) {
        view.setClipBounds(rect);
    }

    /* JADX INFO: renamed from: u */
    public static float m3055u(View view) {
        return h.m3098e(view);
    }

    /* JADX INFO: renamed from: u0 */
    public static void m3056u0(View view, float f10) {
        h.m3105l(view, f10);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: android.view.View */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v */
    public static InterfaceC0583a0 m3057v(View view) {
        return view instanceof InterfaceC0583a0 ? (InterfaceC0583a0) view : f2457e;
    }

    @Deprecated
    /* JADX INFO: renamed from: v0 */
    public static void m3058v0(View view, boolean z10) {
        view.setFitsSystemWindows(z10);
    }

    @Deprecated
    /* JADX INFO: renamed from: w */
    public static boolean m3059w(View view) {
        return view.getFitsSystemWindows();
    }

    @Deprecated
    /* JADX INFO: renamed from: w0 */
    public static void m3060w0(View view, int i10) {
        view.setImportantForAccessibility(i10);
    }

    @Deprecated
    /* JADX INFO: renamed from: x */
    public static int m3061x(View view) {
        return view.getImportantForAccessibility();
    }

    /* JADX INFO: renamed from: x0 */
    public static void m3062x0(View view) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    @SuppressLint({"InlinedApi"})
    /* JADX INFO: renamed from: y */
    public static int m3063y(View view) {
        return j.m3113a(view);
    }

    /* JADX INFO: renamed from: y0 */
    public static void m3064y0(View view, int i10) {
        j.m3114b(view, i10);
    }

    @Deprecated
    /* JADX INFO: renamed from: z */
    public static int m3065z(View view) {
        return view.getLayoutDirection();
    }

    @Deprecated
    /* JADX INFO: renamed from: z0 */
    public static void m3066z0(View view, int i10) {
        view.setLabelFor(i10);
    }
}
