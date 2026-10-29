package com.google.android.material.button;

import ad.C0143o;
import ad.C0146r;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import androidx.annotation.NonNull;
import androidx.core.view.C0582a;
import androidx.core.view.C0622n;
import androidx.core.view.C0625o0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import md.C8485a;
import p168hd.C6357a;
import p168hd.C6367k;
import p168hd.InterfaceC6359c;
import p194ic.C6738b;
import p194ic.C6746j;
import p194ic.C6747k;
import p564y2.C13017p;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* JADX INFO: renamed from: k */
    public static final int f9820k = C6746j.f26132x;

    /* JADX INFO: renamed from: a */
    public final List<C2765c> f9821a;

    /* JADX INFO: renamed from: b */
    public final C2767e f9822b;

    /* JADX INFO: renamed from: c */
    public final LinkedHashSet<InterfaceC2766d> f9823c;

    /* JADX INFO: renamed from: d */
    public final Comparator<MaterialButton> f9824d;

    /* JADX INFO: renamed from: e */
    public Integer[] f9825e;

    /* JADX INFO: renamed from: f */
    public boolean f9826f;

    /* JADX INFO: renamed from: g */
    public boolean f9827g;

    /* JADX INFO: renamed from: h */
    public boolean f9828h;

    /* JADX INFO: renamed from: i */
    public final int f9829i;

    /* JADX INFO: renamed from: j */
    public Set<Integer> f9830j;

    /* JADX INFO: renamed from: com.google.android.material.button.MaterialButtonToggleGroup$a */
    public class C2763a implements Comparator<MaterialButton> {
        public C2763a() {
        }

        /* JADX DEBUG: Method merged with bridge method: compare(Ljava/lang/Object;Ljava/lang/Object;)I */
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            int iCompareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            int iCompareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
            return iCompareTo2 != 0 ? iCompareTo2 : Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton)).compareTo(Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton2)));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.button.MaterialButtonToggleGroup$b */
    public class C2764b extends C0582a {
        public C2764b() {
        }

        @Override // androidx.core.view.C0582a
        /* JADX INFO: renamed from: g */
        public void mo2799g(View view, @NonNull C13017p c13017p) {
            super.mo2799g(view, c13017p);
            c13017p.m48414o0(C13017p.g.m48455b(0, 1, MaterialButtonToggleGroup.this.m12218i(view), 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.button.MaterialButtonToggleGroup$c */
    public static class C2765c {

        /* JADX INFO: renamed from: e */
        public static final InterfaceC6359c f9833e = new C6357a(0.0f);

        /* JADX INFO: renamed from: a */
        public InterfaceC6359c f9834a;

        /* JADX INFO: renamed from: b */
        public InterfaceC6359c f9835b;

        /* JADX INFO: renamed from: c */
        public InterfaceC6359c f9836c;

        /* JADX INFO: renamed from: d */
        public InterfaceC6359c f9837d;

        public C2765c(InterfaceC6359c interfaceC6359c, InterfaceC6359c interfaceC6359c2, InterfaceC6359c interfaceC6359c3, InterfaceC6359c interfaceC6359c4) {
            this.f9834a = interfaceC6359c;
            this.f9835b = interfaceC6359c3;
            this.f9836c = interfaceC6359c4;
            this.f9837d = interfaceC6359c2;
        }

        /* JADX INFO: renamed from: a */
        public static C2765c m12230a(C2765c c2765c) {
            InterfaceC6359c interfaceC6359c = f9833e;
            return new C2765c(interfaceC6359c, c2765c.f9837d, interfaceC6359c, c2765c.f9836c);
        }

        /* JADX INFO: renamed from: b */
        public static C2765c m12231b(C2765c c2765c, View view) {
            return C0146r.m453h(view) ? m12232c(c2765c) : m12233d(c2765c);
        }

        /* JADX INFO: renamed from: c */
        public static C2765c m12232c(C2765c c2765c) {
            InterfaceC6359c interfaceC6359c = c2765c.f9834a;
            InterfaceC6359c interfaceC6359c2 = c2765c.f9837d;
            InterfaceC6359c interfaceC6359c3 = f9833e;
            return new C2765c(interfaceC6359c, interfaceC6359c2, interfaceC6359c3, interfaceC6359c3);
        }

        /* JADX INFO: renamed from: d */
        public static C2765c m12233d(C2765c c2765c) {
            InterfaceC6359c interfaceC6359c = f9833e;
            return new C2765c(interfaceC6359c, interfaceC6359c, c2765c.f9835b, c2765c.f9836c);
        }

        /* JADX INFO: renamed from: e */
        public static C2765c m12234e(C2765c c2765c, View view) {
            return C0146r.m453h(view) ? m12233d(c2765c) : m12232c(c2765c);
        }

        /* JADX INFO: renamed from: f */
        public static C2765c m12235f(C2765c c2765c) {
            InterfaceC6359c interfaceC6359c = c2765c.f9834a;
            InterfaceC6359c interfaceC6359c2 = f9833e;
            return new C2765c(interfaceC6359c, interfaceC6359c2, c2765c.f9835b, interfaceC6359c2);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.button.MaterialButtonToggleGroup$d */
    public interface InterfaceC2766d {
        /* JADX INFO: renamed from: a */
        void mo12236a(MaterialButtonToggleGroup materialButtonToggleGroup, int i10, boolean z10);
    }

    /* JADX INFO: renamed from: com.google.android.material.button.MaterialButtonToggleGroup$e */
    public class C2767e implements MaterialButton.InterfaceC2762b {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C2767e() {
        }

        @Override // com.google.android.material.button.MaterialButton.InterfaceC2762b
        /* JADX INFO: renamed from: a */
        public void mo12208a(@NonNull MaterialButton materialButton, boolean z10) {
            MaterialButtonToggleGroup.this.invalidate();
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 com.google.android.material.button.MaterialButtonToggleGroup) A[MD:(com.google.android.material.button.MaterialButtonToggleGroup):void (m)] (LINE:2) call: com.google.android.material.button.MaterialButtonToggleGroup.e.<init>(com.google.android.material.button.MaterialButtonToggleGroup):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public /* synthetic */ C2767e(MaterialButtonToggleGroup materialButtonToggleGroup, C2763a c2763a) {
            this();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MaterialButtonToggleGroup(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6738b.f25918y);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (m12220k(i10)) {
                return i10;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (m12220k(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if ((getChildAt(i11) instanceof MaterialButton) && m12220k(i11)) {
                i10++;
            }
        }
        return i10;
    }

    /* JADX INFO: renamed from: p */
    public static void m12210p(C6367k.b bVar, C2765c c2765c) {
        if (c2765c == null) {
            bVar.m27807o(0.0f);
        } else {
            bVar.m27801B(c2765c.f9834a).m27812t(c2765c.f9837d).m27805F(c2765c.f9835b).m27816x(c2765c.f9836c);
        }
    }

    private void setGeneratedIdIfNeeded(@NonNull MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(C0625o0.m3035k());
        }
    }

    private void setupButtonChild(@NonNull MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f9822b);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i10, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        m12214e(materialButton.getId(), materialButton.isChecked());
        C6367k shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f9821a.add(new C2765c(shapeAppearanceModel.m27779r(), shapeAppearanceModel.m27772j(), shapeAppearanceModel.m27781t(), shapeAppearanceModel.m27774l()));
        materialButton.setEnabled(isEnabled());
        C0625o0.m3040m0(materialButton, new C2764b());
    }

    /* JADX INFO: renamed from: b */
    public void m12211b(@NonNull InterfaceC2766d interfaceC2766d) {
        this.f9823c.add(interfaceC2766d);
    }

    /* JADX INFO: renamed from: c */
    public final void m12212c() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i10 = firstVisibleChildIndex + 1; i10 < getChildCount(); i10++) {
            MaterialButton materialButtonM12217h = m12217h(i10);
            int iMin = Math.min(materialButtonM12217h.getStrokeWidth(), m12217h(i10 - 1).getStrokeWidth());
            LinearLayout.LayoutParams layoutParamsM12213d = m12213d(materialButtonM12217h);
            if (getOrientation() == 0) {
                C0622n.m2976c(layoutParamsM12213d, 0);
                C0622n.m2977d(layoutParamsM12213d, -iMin);
                layoutParamsM12213d.topMargin = 0;
            } else {
                layoutParamsM12213d.bottomMargin = 0;
                layoutParamsM12213d.topMargin = -iMin;
                C0622n.m2977d(layoutParamsM12213d, 0);
            }
            materialButtonM12217h.setLayoutParams(layoutParamsM12213d);
        }
        m12223n(firstVisibleChildIndex);
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public final LinearLayout.LayoutParams m12213d(@NonNull View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NonNull Canvas canvas) {
        m12226r();
        super.dispatchDraw(canvas);
    }

    /* JADX INFO: renamed from: e */
    public final void m12214e(int i10, boolean z10) {
        if (i10 == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i10);
            return;
        }
        HashSet hashSet = new HashSet(this.f9830j);
        if (z10 && !hashSet.contains(Integer.valueOf(i10))) {
            if (this.f9827g && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i10));
        } else {
            if (z10 || !hashSet.contains(Integer.valueOf(i10))) {
                return;
            }
            if (!this.f9828h || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i10));
            }
        }
        m12225q(hashSet);
    }

    /* JADX INFO: renamed from: f */
    public void m12215f() {
        m12225q(new HashSet());
    }

    /* JADX INFO: renamed from: g */
    public final void m12216g(int i10, boolean z10) {
        Iterator<InterfaceC2766d> it = this.f9823c.iterator();
        while (it.hasNext()) {
            it.next().mo12236a(this, i10, z10);
        }
    }

    public int getCheckedButtonId() {
        if (!this.f9827g || this.f9830j.isEmpty()) {
            return -1;
        }
        return this.f9830j.iterator().next().intValue();
    }

    @NonNull
    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            int id2 = m12217h(i10).getId();
            if (this.f9830j.contains(Integer.valueOf(id2))) {
                arrayList.add(Integer.valueOf(id2));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i10, int i11) {
        Integer[] numArr = this.f9825e;
        if (numArr != null && i11 < numArr.length) {
            return numArr[i11].intValue();
        }
        Log.w("MButtonToggleGroup", "Child order wasn't updated");
        return i11;
    }

    /* JADX INFO: renamed from: h */
    public final MaterialButton m12217h(int i10) {
        return (MaterialButton) getChildAt(i10);
    }

    /* JADX INFO: renamed from: i */
    public final int m12218i(View view) {
        if (!(view instanceof MaterialButton)) {
            return -1;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11) == view) {
                return i10;
            }
            if ((getChildAt(i11) instanceof MaterialButton) && m12220k(i11)) {
                i10++;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: j */
    public final C2765c m12219j(int i10, int i11, int i12) {
        C2765c c2765c = this.f9821a.get(i10);
        if (i11 == i12) {
            return c2765c;
        }
        boolean z10 = getOrientation() == 0;
        if (i10 == i11) {
            return z10 ? C2765c.m12234e(c2765c, this) : C2765c.m12235f(c2765c);
        }
        if (i10 == i12) {
            return z10 ? C2765c.m12231b(c2765c, this) : C2765c.m12230a(c2765c);
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m12220k(int i10) {
        return getChildAt(i10).getVisibility() != 8;
    }

    /* JADX INFO: renamed from: l */
    public boolean m12221l() {
        return this.f9827g;
    }

    /* JADX INFO: renamed from: m */
    public void m12222m(@NonNull MaterialButton materialButton, boolean z10) {
        if (this.f9826f) {
            return;
        }
        m12214e(materialButton.getId(), z10);
    }

    /* JADX INFO: renamed from: n */
    public final void m12223n(int i10) {
        if (getChildCount() == 0 || i10 == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) m12217h(i10).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams.topMargin = 0;
            layoutParams.bottomMargin = 0;
        } else {
            C0622n.m2976c(layoutParams, 0);
            C0622n.m2977d(layoutParams, 0);
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m12224o(int i10, boolean z10) {
        View viewFindViewById = findViewById(i10);
        if (viewFindViewById instanceof MaterialButton) {
            this.f9826f = true;
            ((MaterialButton) viewFindViewById).setChecked(z10);
            this.f9826f = false;
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int i10 = this.f9829i;
        if (i10 != -1) {
            m12225q(Collections.singleton(Integer.valueOf(i10)));
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C13017p.m48342O0(accessibilityNodeInfo).m48412n0(C13017p.f.m48453b(1, getVisibleButtonCount(), false, m12221l() ? 1 : 2));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        m12227s();
        m12212c();
        super.onMeasure(i10, i11);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.f9821a.remove(iIndexOfChild);
        }
        m12227s();
        m12212c();
    }

    /* JADX INFO: renamed from: q */
    public final void m12225q(Set<Integer> set) {
        Set<Integer> set2 = this.f9830j;
        this.f9830j = new HashSet(set);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            int id2 = m12217h(i10).getId();
            m12224o(id2, set.contains(Integer.valueOf(id2)));
            if (set2.contains(Integer.valueOf(id2)) != set.contains(Integer.valueOf(id2))) {
                m12216g(id2, set.contains(Integer.valueOf(id2)));
            }
        }
        invalidate();
    }

    /* JADX INFO: renamed from: r */
    public final void m12226r() {
        TreeMap treeMap = new TreeMap(this.f9824d);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            treeMap.put(m12217h(i10), Integer.valueOf(i10));
        }
        this.f9825e = (Integer[]) treeMap.values().toArray(new Integer[0]);
    }

    /* JADX INFO: renamed from: s */
    public void m12227s() {
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i10 = 0; i10 < childCount; i10++) {
            MaterialButton materialButtonM12217h = m12217h(i10);
            if (materialButtonM12217h.getVisibility() != 8) {
                C6367k.b bVarM27783v = materialButtonM12217h.getShapeAppearanceModel().m27783v();
                m12210p(bVarM27783v, m12219j(i10, firstVisibleChildIndex, lastVisibleChildIndex));
                materialButtonM12217h.setShapeAppearanceModel(bVarM27783v.m27806m());
            }
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            m12217h(i10).setEnabled(z10);
        }
    }

    public void setSelectionRequired(boolean z10) {
        this.f9828h = z10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSingleSelection(boolean z10) {
        if (this.f9827g != z10) {
            this.f9827g = z10;
            m12215f();
        }
        m12228t();
    }

    /* JADX INFO: renamed from: t */
    public final void m12228t() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            m12217h(i10).setA11yClassName((this.f9827g ? RadioButton.class : ToggleButton.class).getName());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButtonToggleGroup(@NonNull Context context, AttributeSet attributeSet, int i10) {
        int i11 = f9820k;
        super(C8485a.m34268c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f9821a = new ArrayList();
        this.f9822b = new C2767e(this, null);
        this.f9823c = new LinkedHashSet<>();
        this.f9824d = new C2763a();
        this.f9826f = false;
        this.f9830j = new HashSet();
        TypedArray typedArrayM436i = C0143o.m436i(getContext(), attributeSet, C6747k.f26373a3, i10, i11, new int[0]);
        setSingleSelection(typedArrayM436i.getBoolean(C6747k.f26412e3, false));
        this.f9829i = typedArrayM436i.getResourceId(C6747k.f26393c3, -1);
        this.f9828h = typedArrayM436i.getBoolean(C6747k.f26403d3, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayM436i.getBoolean(C6747k.f26383b3, true));
        typedArrayM436i.recycle();
        C0625o0.m3060w0(this, 1);
    }

    public void setSingleSelection(int i10) {
        setSingleSelection(getResources().getBoolean(i10));
    }
}
