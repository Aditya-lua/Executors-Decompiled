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
import com.google.mlkit.vision.barcode.common.Barcode;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"PrivateConstructorForUtilityClass"})
public class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static WeakHashMap<View, y0> f1893a;
    public static Field b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f1894c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f1895d = {j2.e.b, j2.e.f21034c, j2.e.f21045n, j2.e.f21056y, j2.e.B, j2.e.C, j2.e.D, j2.e.E, j2.e.F, j2.e.G, j2.e.f21035d, j2.e.f21036e, j2.e.f21037f, j2.e.f21038g, j2.e.f21039h, j2.e.f21040i, j2.e.f21041j, j2.e.f21042k, j2.e.f21043l, j2.e.f21044m, j2.e.f21046o, j2.e.f21047p, j2.e.f21048q, j2.e.f21049r, j2.e.f21050s, j2.e.f21051t, j2.e.f21052u, j2.e.f21053v, j2.e.f21054w, j2.e.f21055x, j2.e.f21057z, j2.e.A};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a0 f1896e = new a0() { // from class: androidx.core.view.n0
        @Override // androidx.core.view.a0
        public final d a(d dVar) {
            return o0.a(dVar);
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e f1897f = new e();

    public class a extends f<Boolean> {
        public a(int i10, Class cls, int i11) {
            super(i10, cls, i11);
        }

        @Override // androidx.core.view.o0.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Boolean c(View view) {
            return Boolean.valueOf(k.c(view));
        }

        @Override // androidx.core.view.o0.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, Boolean bool) {
            k.f(view, bool.booleanValue());
        }

        @Override // androidx.core.view.o0.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    public class b extends f<CharSequence> {
        public b(int i10, Class cls, int i11, int i12) {
            super(i10, cls, i11, i12);
        }

        @Override // androidx.core.view.o0.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public CharSequence c(View view) {
            return k.a(view);
        }

        @Override // androidx.core.view.o0.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, CharSequence charSequence) {
            k.e(view, charSequence);
        }

        @Override // androidx.core.view.o0.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    public class c extends f<CharSequence> {
        public c(int i10, Class cls, int i11, int i12) {
            super(i10, cls, i11, i12);
        }

        @Override // androidx.core.view.o0.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public CharSequence c(View view) {
            return m.b(view);
        }

        @Override // androidx.core.view.o0.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, CharSequence charSequence) {
            m.d(view, charSequence);
        }

        @Override // androidx.core.view.o0.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    public class d extends f<Boolean> {
        public d(int i10, Class cls, int i11) {
            super(i10, cls, i11);
        }

        @Override // androidx.core.view.o0.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Boolean c(View view) {
            return Boolean.valueOf(k.b(view));
        }

        @Override // androidx.core.view.o0.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, Boolean bool) {
            k.d(view, bool.booleanValue());
        }

        @Override // androidx.core.view.o0.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    public static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakHashMap<View, Boolean> f1898a = new WeakHashMap<>();

        public void a(View view) {
            this.f1898a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (view.isAttachedToWindow()) {
                c(view);
            }
        }

        public final void b(Map.Entry<View, Boolean> entry) {
            View key = entry.getKey();
            boolean zBooleanValue = entry.getValue().booleanValue();
            boolean z10 = key.isShown() && key.getWindowVisibility() == 0;
            if (zBooleanValue != z10) {
                o0.V(key, z10 ? 16 : 32);
                entry.setValue(Boolean.valueOf(z10));
            }
        }

        public final void c(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        public void d(View view) {
            this.f1898a.remove(view);
            view.removeOnAttachStateChangeListener(this);
            e(view);
        }

        public final void e(View view) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                Iterator<Map.Entry<View, Boolean>> it = this.f1898a.entrySet().iterator();
                while (it.hasNext()) {
                    b(it.next());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            c(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public static abstract class f<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f1899a;
        public final Class<T> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f1900c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f1901d;

        public f(int i10, Class<T> cls, int i11) {
            this(i10, cls, 0, i11);
        }

        public boolean a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        public final boolean b() {
            return Build.VERSION.SDK_INT >= this.f1900c;
        }

        public abstract T c(View view);

        public abstract void d(View view, T t8);

        public T e(View view) {
            if (b()) {
                return c(view);
            }
            T t8 = (T) view.getTag(this.f1899a);
            if (this.b.isInstance(t8)) {
                return t8;
            }
            return null;
        }

        public void f(View view, T t8) {
            if (b()) {
                d(view, t8);
            } else if (g(e(view), t8)) {
                o0.j(view);
                view.setTag(this.f1899a, t8);
                o0.V(view, this.f1901d);
            }
        }

        public abstract boolean g(T t8, T t10);

        public f(int i10, Class<T> cls, int i11, int i12) {
            this.f1899a = i10;
            this.b = cls;
            this.f1901d = i11;
            this.f1900c = i12;
        }
    }

    public static class g {
        public static WindowInsets a(View view, WindowInsets windowInsets) {
            return t0.b ? t0.b(view, windowInsets) : view.dispatchApplyWindowInsets(windowInsets);
        }

        public static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        public static void c(View view) {
            view.requestApplyInsets();
        }
    }

    public static class h {

        public class a implements View.OnApplyWindowInsetsListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public WindowInsetsCompat f1902a = null;
            public final /* synthetic */ View b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ y f1903c;

            public a(View view, y yVar) {
                this.b = view;
                this.f1903c = yVar;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(windowInsets, view);
                int i10 = Build.VERSION.SDK_INT;
                if (i10 < 30) {
                    h.a(windowInsets, this.b);
                    if (windowInsetsCompat.equals(this.f1902a)) {
                        return this.f1903c.K(view, windowInsetsCompat).toWindowInsets();
                    }
                }
                this.f1902a = windowInsetsCompat;
                WindowInsetsCompat windowInsetsCompatK = this.f1903c.K(view, windowInsetsCompat);
                if (i10 >= 30) {
                    return windowInsetsCompatK.toWindowInsets();
                }
                o0.j0(view);
                return windowInsetsCompatK.toWindowInsets();
            }
        }

        public static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(j2.e.U);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        public static WindowInsetsCompat b(View view, WindowInsetsCompat windowInsetsCompat, Rect rect) {
            WindowInsets windowInsets = windowInsetsCompat.toWindowInsets();
            if (windowInsets != null) {
                return WindowInsetsCompat.toWindowInsetsCompat(view.computeSystemWindowInsets(windowInsets, rect), view);
            }
            rect.setEmpty();
            return windowInsetsCompat;
        }

        public static ColorStateList c(View view) {
            return view.getBackgroundTintList();
        }

        public static PorterDuff.Mode d(View view) {
            return view.getBackgroundTintMode();
        }

        public static float e(View view) {
            return view.getElevation();
        }

        public static String f(View view) {
            return view.getTransitionName();
        }

        public static float g(View view) {
            return view.getTranslationZ();
        }

        public static float h(View view) {
            return view.getZ();
        }

        public static boolean i(View view) {
            return view.isNestedScrollingEnabled();
        }

        public static void j(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        public static void k(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        public static void l(View view, float f10) {
            view.setElevation(f10);
        }

        public static void m(View view, y yVar) {
            a aVar = yVar != null ? new a(view, yVar) : null;
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(j2.e.M, aVar);
            }
            if (view.getTag(j2.e.L) != null) {
                return;
            }
            if (aVar != null) {
                view.setOnApplyWindowInsetsListener(aVar);
            } else {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(j2.e.U));
            }
        }

        public static void n(View view, String str) {
            view.setTransitionName(str);
        }

        public static void o(View view, float f10) {
            view.setTranslationZ(f10);
        }

        public static void p(View view, float f10) {
            view.setZ(f10);
        }

        public static void q(View view) {
            view.stopNestedScroll();
        }
    }

    public static class i {
        public static WindowInsetsCompat a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(rootWindowInsets);
            windowInsetsCompat.setRootWindowInsets(windowInsetsCompat);
            windowInsetsCompat.copyRootViewBounds(view.getRootView());
            return windowInsetsCompat;
        }

        public static void b(View view, int i10, int i11) {
            view.setScrollIndicators(i10, i11);
        }
    }

    public static class j {
        public static int a(View view) {
            return view.getImportantForAutofill();
        }

        public static void b(View view, int i10) {
            view.setImportantForAutofill(i10);
        }
    }

    public static class k {
        public static CharSequence a(View view) {
            return view.getAccessibilityPaneTitle();
        }

        public static boolean b(View view) {
            return view.isAccessibilityHeading();
        }

        public static boolean c(View view) {
            return view.isScreenReaderFocusable();
        }

        public static void d(View view, boolean z10) {
            view.setAccessibilityHeading(z10);
        }

        public static void e(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        public static void f(View view, boolean z10) {
            view.setScreenReaderFocusable(z10);
        }
    }

    public static class l {
        public static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        public static void b(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i10, i11);
        }
    }

    public static class m {
        public static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        public static CharSequence b(View view) {
            return view.getStateDescription();
        }

        public static l1 c(View view) {
            WindowInsetsController windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                return l1.g(windowInsetsController);
            }
            return null;
        }

        public static void d(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    public static final class n {
        public static String[] a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static androidx.core.view.d b(View view, androidx.core.view.d dVar) {
            ContentInfo contentInfoF = dVar.f();
            ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoF);
            if (contentInfoPerformReceiveContent == null) {
                return null;
            }
            return contentInfoPerformReceiveContent == contentInfoF ? dVar : androidx.core.view.d.g(contentInfoPerformReceiveContent);
        }
    }

    public interface o {
        boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent);
    }

    public static class p {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final ArrayList<WeakReference<View>> f1904d = new ArrayList<>();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakHashMap<View, Boolean> f1905a = null;
        public SparseArray<WeakReference<View>> b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public WeakReference<KeyEvent> f1906c = null;

        public static p a(View view) {
            int i10 = j2.e.S;
            p pVar = (p) view.getTag(i10);
            if (pVar != null) {
                return pVar;
            }
            p pVar2 = new p();
            view.setTag(i10, pVar2);
            return pVar2;
        }

        public boolean b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                g();
            }
            View viewC = c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (viewC != null && !KeyEvent.isModifierKey(keyCode)) {
                    d().put(keyCode, new WeakReference<>(viewC));
                }
            }
            return viewC != null;
        }

        public final View c(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f1905a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View viewC = c(viewGroup.getChildAt(childCount), keyEvent);
                        if (viewC != null) {
                            return viewC;
                        }
                    }
                }
                if (e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        public final SparseArray<WeakReference<View>> d() {
            if (this.b == null) {
                this.b = new SparseArray<>();
            }
            return this.b;
        }

        public final boolean e(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(j2.e.T);
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

        public boolean f(KeyEvent keyEvent) {
            WeakReference<View> weakReferenceValueAt;
            int iIndexOfKey;
            WeakReference<KeyEvent> weakReference = this.f1906c;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.f1906c = new WeakReference<>(keyEvent);
            SparseArray<WeakReference<View>> sparseArrayD = d();
            if (keyEvent.getAction() != 1 || (iIndexOfKey = sparseArrayD.indexOfKey(keyEvent.getKeyCode())) < 0) {
                weakReferenceValueAt = null;
            } else {
                weakReferenceValueAt = sparseArrayD.valueAt(iIndexOfKey);
                sparseArrayD.removeAt(iIndexOfKey);
            }
            if (weakReferenceValueAt == null) {
                weakReferenceValueAt = sparseArrayD.get(keyEvent.getKeyCode());
            }
            if (weakReferenceValueAt == null) {
                return false;
            }
            View view = weakReferenceValueAt.get();
            if (view != null && view.isAttachedToWindow()) {
                e(view, keyEvent);
            }
            return true;
        }

        public final void g() {
            WeakHashMap<View, Boolean> weakHashMap = this.f1905a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = f1904d;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                try {
                    if (this.f1905a == null) {
                        this.f1905a = new WeakHashMap<>();
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ArrayList<WeakReference<View>> arrayList2 = f1904d;
                        View view = arrayList2.get(size).get();
                        if (view == null) {
                            arrayList2.remove(size);
                        } else {
                            this.f1905a.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f1905a.put((View) parent, Boolean.TRUE);
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
    public static int A(View view) {
        return view.getMinimumHeight();
    }

    public static void A0(View view, y yVar) {
        h.m(view, yVar);
    }

    @Deprecated
    public static int B(View view) {
        return view.getMinimumWidth();
    }

    @Deprecated
    public static void B0(View view, int i10, int i11, int i12, int i13) {
        view.setPaddingRelative(i10, i11, i12, i13);
    }

    public static String[] C(View view) {
        return Build.VERSION.SDK_INT >= 31 ? n.a(view) : (String[]) view.getTag(j2.e.O);
    }

    public static void C0(View view, boolean z10) {
        l0().f(view, Boolean.valueOf(z10));
    }

    @Deprecated
    public static int D(View view) {
        return view.getPaddingEnd();
    }

    public static void D0(View view, int i10, int i11) {
        i.b(view, i10, i11);
    }

    @Deprecated
    public static int E(View view) {
        return view.getPaddingStart();
    }

    public static void E0(View view, CharSequence charSequence) {
        J0().f(view, charSequence);
    }

    public static WindowInsetsCompat F(View view) {
        return i.a(view);
    }

    public static void F0(View view, String str) {
        h.n(view, str);
    }

    public static CharSequence G(View view) {
        return J0().e(view);
    }

    public static void G0(View view, float f10) {
        h.o(view, f10);
    }

    public static String H(View view) {
        return h.f(view);
    }

    public static void H0(View view, d1.b bVar) {
        d1.e(view, bVar);
    }

    public static float I(View view) {
        return h.g(view);
    }

    public static void I0(View view, float f10) {
        h.p(view, f10);
    }

    @Deprecated
    public static l1 J(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return m.c(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return c1.a(window, view);
                }
                return null;
            }
        }
        return null;
    }

    public static f<CharSequence> J0() {
        return new c(j2.e.Q, CharSequence.class, 64, 30);
    }

    @Deprecated
    public static int K(View view) {
        return view.getWindowSystemUiVisibility();
    }

    public static void K0(View view) {
        h.q(view);
    }

    public static float L(View view) {
        return h.h(view);
    }

    public static boolean M(View view) {
        return m(view) != null;
    }

    @Deprecated
    public static boolean N(View view) {
        return view.hasOnClickListeners();
    }

    @Deprecated
    public static boolean O(View view) {
        return view.hasTransientState();
    }

    public static boolean P(View view) {
        Boolean boolE = b().e(view);
        return boolE != null && boolE.booleanValue();
    }

    @Deprecated
    public static boolean Q(View view) {
        return view.isAttachedToWindow();
    }

    @Deprecated
    public static boolean R(View view) {
        return view.isLaidOut();
    }

    public static boolean S(View view) {
        return h.i(view);
    }

    @Deprecated
    public static boolean T(View view) {
        return view.isPaddingRelative();
    }

    public static boolean U(View view) {
        Boolean boolE = l0().e(view);
        return boolE != null && boolE.booleanValue();
    }

    public static void V(View view, int i10) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z10 = o(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z10) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z10 ? 32 : Barcode.FORMAT_PDF417);
                accessibilityEventObtain.setContentChangeTypes(i10);
                if (z10) {
                    accessibilityEventObtain.getText().add(o(view));
                    x0(view);
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
                accessibilityEventObtain2.getText().add(o(view));
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

    public static void W(View view, int i10) {
        view.offsetLeftAndRight(i10);
    }

    public static void X(View view, int i10) {
        view.offsetTopAndBottom(i10);
    }

    public static WindowInsetsCompat Y(View view, WindowInsetsCompat windowInsetsCompat) {
        WindowInsets windowInsets = windowInsetsCompat.toWindowInsets();
        if (windowInsets != null) {
            WindowInsets windowInsetsB = g.b(view, windowInsets);
            if (!windowInsetsB.equals(windowInsets)) {
                return WindowInsetsCompat.toWindowInsetsCompat(windowInsetsB, view);
            }
        }
        return windowInsetsCompat;
    }

    @Deprecated
    public static void Z(View view, y2.p pVar) {
        view.onInitializeAccessibilityNodeInfo(pVar.N0());
    }

    public static /* synthetic */ androidx.core.view.d a(androidx.core.view.d dVar) {
        return dVar;
    }

    public static f<CharSequence> a0() {
        return new b(j2.e.K, CharSequence.class, 8, 28);
    }

    public static f<Boolean> b() {
        return new d(j2.e.J, Boolean.class, 28);
    }

    @Deprecated
    public static boolean b0(View view, int i10, Bundle bundle) {
        return view.performAccessibilityAction(i10, bundle);
    }

    public static int c(View view, CharSequence charSequence, y2.s sVar) {
        int iQ = q(view, charSequence);
        if (iQ != -1) {
            d(view, new y2.p.a(iQ, charSequence, sVar));
        }
        return iQ;
    }

    public static androidx.core.view.d c0(View view, androidx.core.view.d dVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + dVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return n.b(view, dVar);
        }
        z zVar = (z) view.getTag(j2.e.N);
        if (zVar == null) {
            return v(view).a(dVar);
        }
        androidx.core.view.d dVarA = zVar.a(view, dVar);
        if (dVarA == null) {
            return null;
        }
        return v(view).a(dVarA);
    }

    public static void d(View view, y2.p.a aVar) {
        j(view);
        h0(aVar.b(), view);
        p(view).add(aVar);
        V(view, 0);
    }

    @Deprecated
    public static void d0(View view) {
        view.postInvalidateOnAnimation();
    }

    @Deprecated
    public static y0 e(View view) {
        if (f1893a == null) {
            f1893a = new WeakHashMap<>();
        }
        y0 y0Var = f1893a.get(view);
        if (y0Var != null) {
            return y0Var;
        }
        y0 y0Var2 = new y0(view);
        f1893a.put(view, y0Var2);
        return y0Var2;
    }

    @Deprecated
    public static void e0(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    public static WindowInsetsCompat f(View view, WindowInsetsCompat windowInsetsCompat, Rect rect) {
        return h.b(view, windowInsetsCompat, rect);
    }

    @SuppressLint({"LambdaLast"})
    @Deprecated
    public static void f0(View view, Runnable runnable, long j10) {
        view.postOnAnimationDelayed(runnable, j10);
    }

    public static WindowInsetsCompat g(View view, WindowInsetsCompat windowInsetsCompat) {
        int i10 = Build.VERSION.SDK_INT;
        WindowInsets windowInsets = windowInsetsCompat.toWindowInsets();
        if (windowInsets != null) {
            WindowInsets windowInsetsA = i10 >= 30 ? m.a(view, windowInsets) : g.a(view, windowInsets);
            if (!windowInsetsA.equals(windowInsets)) {
                return WindowInsetsCompat.toWindowInsetsCompat(windowInsetsA, view);
            }
        }
        return windowInsetsCompat;
    }

    public static void g0(View view, int i10) {
        h0(i10, view);
        V(view, 0);
    }

    public static boolean h(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return p.a(view).b(view, keyEvent);
    }

    public static void h0(int i10, View view) {
        List<y2.p.a> listP = p(view);
        for (int i11 = 0; i11 < listP.size(); i11++) {
            if (listP.get(i11).b() == i10) {
                listP.remove(i11);
                return;
            }
        }
    }

    public static boolean i(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return p.a(view).f(keyEvent);
    }

    public static void i0(View view, y2.p.a aVar, CharSequence charSequence, y2.s sVar) {
        if (sVar == null && charSequence == null) {
            g0(view, aVar.b());
        } else {
            d(view, aVar.a(charSequence, sVar));
        }
    }

    public static void j(View view) {
        androidx.core.view.a aVarL = l(view);
        if (aVarL == null) {
            aVarL = new androidx.core.view.a();
        }
        m0(view, aVarL);
    }

    public static void j0(View view) {
        g.c(view);
    }

    @Deprecated
    public static int k() {
        return View.generateViewId();
    }

    public static void k0(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
        if (Build.VERSION.SDK_INT >= 29) {
            l.b(view, context, iArr, attributeSet, typedArray, i10, i11);
        }
    }

    public static androidx.core.view.a l(View view) {
        View.AccessibilityDelegate accessibilityDelegateM = m(view);
        if (accessibilityDelegateM == null) {
            return null;
        }
        return accessibilityDelegateM instanceof androidx.core.view.a.C0026a ? ((androidx.core.view.a.C0026a) accessibilityDelegateM).f1814a : new androidx.core.view.a(accessibilityDelegateM);
    }

    public static f<Boolean> l0() {
        return new a(j2.e.P, Boolean.class, 28);
    }

    public static View.AccessibilityDelegate m(View view) {
        return Build.VERSION.SDK_INT >= 29 ? l.a(view) : n(view);
    }

    public static void m0(View view, androidx.core.view.a aVar) {
        if (aVar == null && (m(view) instanceof androidx.core.view.a.C0026a)) {
            aVar = new androidx.core.view.a();
        }
        x0(view);
        view.setAccessibilityDelegate(aVar == null ? null : aVar.d());
    }

    public static View.AccessibilityDelegate n(View view) {
        if (f1894c) {
            return null;
        }
        if (b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f1894c = true;
                return null;
            }
        }
        try {
            Object obj = b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f1894c = true;
            return null;
        }
    }

    public static void n0(View view, boolean z10) {
        b().f(view, Boolean.valueOf(z10));
    }

    public static CharSequence o(View view) {
        return a0().e(view);
    }

    @Deprecated
    public static void o0(View view, int i10) {
        view.setAccessibilityLiveRegion(i10);
    }

    public static List<y2.p.a> p(View view) {
        int i10 = j2.e.H;
        ArrayList arrayList = (ArrayList) view.getTag(i10);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(i10, arrayList2);
        return arrayList2;
    }

    public static void p0(View view, CharSequence charSequence) {
        a0().f(view, charSequence);
        if (charSequence != null) {
            f1897f.a(view);
        } else {
            f1897f.d(view);
        }
    }

    public static int q(View view, CharSequence charSequence) {
        List<y2.p.a> listP = p(view);
        for (int i10 = 0; i10 < listP.size(); i10++) {
            if (TextUtils.equals(charSequence, listP.get(i10).c())) {
                return listP.get(i10).b();
            }
        }
        int i11 = -1;
        int i12 = 0;
        while (true) {
            int[] iArr = f1895d;
            if (i12 >= iArr.length || i11 != -1) {
                break;
            }
            int i13 = iArr[i12];
            boolean z10 = true;
            for (int i14 = 0; i14 < listP.size(); i14++) {
                z10 &= listP.get(i14).b() != i13;
            }
            if (z10) {
                i11 = i13;
            }
            i12++;
        }
        return i11;
    }

    @Deprecated
    public static void q0(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    public static ColorStateList r(View view) {
        return h.c(view);
    }

    public static void r0(View view, ColorStateList colorStateList) {
        h.j(view, colorStateList);
    }

    public static PorterDuff.Mode s(View view) {
        return h.d(view);
    }

    public static void s0(View view, PorterDuff.Mode mode) {
        h.k(view, mode);
    }

    @Deprecated
    public static Display t(View view) {
        return view.getDisplay();
    }

    @Deprecated
    public static void t0(View view, Rect rect) {
        view.setClipBounds(rect);
    }

    public static float u(View view) {
        return h.e(view);
    }

    public static void u0(View view, float f10) {
        h.l(view, f10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static a0 v(View view) {
        return view instanceof a0 ? (a0) view : f1896e;
    }

    @Deprecated
    public static void v0(View view, boolean z10) {
        view.setFitsSystemWindows(z10);
    }

    @Deprecated
    public static boolean w(View view) {
        return view.getFitsSystemWindows();
    }

    @Deprecated
    public static void w0(View view, int i10) {
        view.setImportantForAccessibility(i10);
    }

    @Deprecated
    public static int x(View view) {
        return view.getImportantForAccessibility();
    }

    public static void x0(View view) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    @SuppressLint({"InlinedApi"})
    public static int y(View view) {
        return j.a(view);
    }

    public static void y0(View view, int i10) {
        j.b(view, i10);
    }

    @Deprecated
    public static int z(View view) {
        return view.getLayoutDirection();
    }

    @Deprecated
    public static void z0(View view, int i10) {
        view.setLabelFor(i10);
    }
}
