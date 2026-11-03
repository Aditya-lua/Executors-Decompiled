package com.google.android.material.button;

import ad.o;
import ad.r;
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
import androidx.core.view.n;
import androidx.core.view.o0;
import hd.k;
import ic.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import y2.p;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f7752k = j.f20775x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<c> f7753a;
    public final e b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashSet<d> f7754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Comparator<MaterialButton> f7755d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Integer[] f7756e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f7757f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f7758g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f7759h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f7760i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Set<Integer> f7761j;

    public class a implements Comparator<MaterialButton> {
        public a() {
        }

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

    public class b extends androidx.core.view.a {
        public b() {
        }

        @Override // androidx.core.view.a
        public void g(View view, @NonNull p pVar) {
            super.g(view, pVar);
            pVar.o0(p.g.b(0, 1, MaterialButtonToggleGroup.this.i(view), 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    public static class c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final hd.c f7764e = new hd.a(0.0f);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public hd.c f7765a;
        public hd.c b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public hd.c f7766c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public hd.c f7767d;

        public c(hd.c cVar, hd.c cVar2, hd.c cVar3, hd.c cVar4) {
            this.f7765a = cVar;
            this.b = cVar3;
            this.f7766c = cVar4;
            this.f7767d = cVar2;
        }

        public static c a(c cVar) {
            hd.c cVar2 = f7764e;
            return new c(cVar2, cVar.f7767d, cVar2, cVar.f7766c);
        }

        public static c b(c cVar, View view) {
            return r.h(view) ? c(cVar) : d(cVar);
        }

        public static c c(c cVar) {
            hd.c cVar2 = cVar.f7765a;
            hd.c cVar3 = cVar.f7767d;
            hd.c cVar4 = f7764e;
            return new c(cVar2, cVar3, cVar4, cVar4);
        }

        public static c d(c cVar) {
            hd.c cVar2 = f7764e;
            return new c(cVar2, cVar2, cVar.b, cVar.f7766c);
        }

        public static c e(c cVar, View view) {
            return r.h(view) ? d(cVar) : c(cVar);
        }

        public static c f(c cVar) {
            hd.c cVar2 = cVar.f7765a;
            hd.c cVar3 = f7764e;
            return new c(cVar2, cVar3, cVar.b, cVar3);
        }
    }

    public interface d {
        void a(MaterialButtonToggleGroup materialButtonToggleGroup, int i10, boolean z10);
    }

    public class e implements MaterialButton.b {
        public e() {
        }

        @Override // com.google.android.material.button.MaterialButton.b
        public void a(@NonNull MaterialButton materialButton, boolean z10) {
            MaterialButtonToggleGroup.this.invalidate();
        }

        public /* synthetic */ e(MaterialButtonToggleGroup materialButtonToggleGroup, a aVar) {
            this();
        }
    }

    public MaterialButtonToggleGroup(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ic.b.f20622y);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (k(i10)) {
                return i10;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (k(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if ((getChildAt(i11) instanceof MaterialButton) && k(i11)) {
                i10++;
            }
        }
        return i10;
    }

    public static void p(k.b bVar, c cVar) {
        if (cVar == null) {
            bVar.o(0.0f);
        } else {
            bVar.B(cVar.f7765a).t(cVar.f7767d).F(cVar.b).x(cVar.f7766c);
        }
    }

    private void setGeneratedIdIfNeeded(@NonNull MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(o0.k());
        }
    }

    private void setupButtonChild(@NonNull MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.b);
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
        e(materialButton.getId(), materialButton.isChecked());
        k shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f7753a.add(new c(shapeAppearanceModel.r(), shapeAppearanceModel.j(), shapeAppearanceModel.t(), shapeAppearanceModel.l()));
        materialButton.setEnabled(isEnabled());
        o0.m0(materialButton, new b());
    }

    public void b(@NonNull d dVar) {
        this.f7754c.add(dVar);
    }

    public final void c() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i10 = firstVisibleChildIndex + 1; i10 < getChildCount(); i10++) {
            MaterialButton materialButtonH = h(i10);
            int iMin = Math.min(materialButtonH.getStrokeWidth(), h(i10 - 1).getStrokeWidth());
            LinearLayout.LayoutParams layoutParamsD = d(materialButtonH);
            if (getOrientation() == 0) {
                n.c(layoutParamsD, 0);
                n.d(layoutParamsD, -iMin);
                layoutParamsD.topMargin = 0;
            } else {
                layoutParamsD.bottomMargin = 0;
                layoutParamsD.topMargin = -iMin;
                n.d(layoutParamsD, 0);
            }
            materialButtonH.setLayoutParams(layoutParamsD);
        }
        n(firstVisibleChildIndex);
    }

    @NonNull
    public final LinearLayout.LayoutParams d(@NonNull View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NonNull Canvas canvas) {
        r();
        super.dispatchDraw(canvas);
    }

    public final void e(int i10, boolean z10) {
        if (i10 == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i10);
            return;
        }
        HashSet hashSet = new HashSet(this.f7761j);
        if (z10 && !hashSet.contains(Integer.valueOf(i10))) {
            if (this.f7758g && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i10));
        } else {
            if (z10 || !hashSet.contains(Integer.valueOf(i10))) {
                return;
            }
            if (!this.f7759h || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i10));
            }
        }
        q(hashSet);
    }

    public void f() {
        q(new HashSet());
    }

    public final void g(int i10, boolean z10) {
        Iterator<d> it = this.f7754c.iterator();
        while (it.hasNext()) {
            it.next().a(this, i10, z10);
        }
    }

    public int getCheckedButtonId() {
        if (!this.f7758g || this.f7761j.isEmpty()) {
            return -1;
        }
        return this.f7761j.iterator().next().intValue();
    }

    @NonNull
    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            int id2 = h(i10).getId();
            if (this.f7761j.contains(Integer.valueOf(id2))) {
                arrayList.add(Integer.valueOf(id2));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i10, int i11) {
        Integer[] numArr = this.f7756e;
        if (numArr != null && i11 < numArr.length) {
            return numArr[i11].intValue();
        }
        Log.w("MButtonToggleGroup", "Child order wasn't updated");
        return i11;
    }

    public final MaterialButton h(int i10) {
        return (MaterialButton) getChildAt(i10);
    }

    public final int i(View view) {
        if (!(view instanceof MaterialButton)) {
            return -1;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11) == view) {
                return i10;
            }
            if ((getChildAt(i11) instanceof MaterialButton) && k(i11)) {
                i10++;
            }
        }
        return -1;
    }

    public final c j(int i10, int i11, int i12) {
        c cVar = this.f7753a.get(i10);
        if (i11 == i12) {
            return cVar;
        }
        boolean z10 = getOrientation() == 0;
        if (i10 == i11) {
            return z10 ? c.e(cVar, this) : c.f(cVar);
        }
        if (i10 == i12) {
            return z10 ? c.b(cVar, this) : c.a(cVar);
        }
        return null;
    }

    public final boolean k(int i10) {
        return getChildAt(i10).getVisibility() != 8;
    }

    public boolean l() {
        return this.f7758g;
    }

    public void m(@NonNull MaterialButton materialButton, boolean z10) {
        if (this.f7757f) {
            return;
        }
        e(materialButton.getId(), z10);
    }

    public final void n(int i10) {
        if (getChildCount() == 0 || i10 == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) h(i10).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams.topMargin = 0;
            layoutParams.bottomMargin = 0;
        } else {
            n.c(layoutParams, 0);
            n.d(layoutParams, 0);
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
        }
    }

    public final void o(int i10, boolean z10) {
        View viewFindViewById = findViewById(i10);
        if (viewFindViewById instanceof MaterialButton) {
            this.f7757f = true;
            ((MaterialButton) viewFindViewById).setChecked(z10);
            this.f7757f = false;
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int i10 = this.f7760i;
        if (i10 != -1) {
            q(Collections.singleton(Integer.valueOf(i10)));
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        p.O0(accessibilityNodeInfo).n0(p.f.b(1, getVisibleButtonCount(), false, l() ? 1 : 2));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        s();
        c();
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
            this.f7753a.remove(iIndexOfChild);
        }
        s();
        c();
    }

    public final void q(Set<Integer> set) {
        Set<Integer> set2 = this.f7761j;
        this.f7761j = new HashSet(set);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            int id2 = h(i10).getId();
            o(id2, set.contains(Integer.valueOf(id2)));
            if (set2.contains(Integer.valueOf(id2)) != set.contains(Integer.valueOf(id2))) {
                g(id2, set.contains(Integer.valueOf(id2)));
            }
        }
        invalidate();
    }

    public final void r() {
        TreeMap treeMap = new TreeMap(this.f7755d);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            treeMap.put(h(i10), Integer.valueOf(i10));
        }
        this.f7756e = (Integer[]) treeMap.values().toArray(new Integer[0]);
    }

    public void s() {
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i10 = 0; i10 < childCount; i10++) {
            MaterialButton materialButtonH = h(i10);
            if (materialButtonH.getVisibility() != 8) {
                k.b bVarV = materialButtonH.getShapeAppearanceModel().v();
                p(bVarV, j(i10, firstVisibleChildIndex, lastVisibleChildIndex));
                materialButtonH.setShapeAppearanceModel(bVarV.m());
            }
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            h(i10).setEnabled(z10);
        }
    }

    public void setSelectionRequired(boolean z10) {
        this.f7759h = z10;
    }

    public void setSingleSelection(boolean z10) {
        if (this.f7758g != z10) {
            this.f7758g = z10;
            f();
        }
        t();
    }

    public final void t() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            h(i10).setA11yClassName((this.f7758g ? RadioButton.class : ToggleButton.class).getName());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButtonToggleGroup(@NonNull Context context, AttributeSet attributeSet, int i10) {
        int i11 = f7752k;
        super(md.a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f7753a = new ArrayList();
        this.b = new e(this, null);
        this.f7754c = new LinkedHashSet<>();
        this.f7755d = new a();
        this.f7757f = false;
        this.f7761j = new HashSet();
        TypedArray typedArrayI = o.i(getContext(), attributeSet, ic.k.f20782a3, i10, i11, new int[0]);
        setSingleSelection(typedArrayI.getBoolean(ic.k.f20820e3, false));
        this.f7760i = typedArrayI.getResourceId(ic.k.f20801c3, -1);
        this.f7759h = typedArrayI.getBoolean(ic.k.f20811d3, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayI.getBoolean(ic.k.f20791b3, true));
        typedArrayI.recycle();
        o0.w0(this, 1);
    }

    public void setSingleSelection(int i10) {
        setSingleSelection(getResources().getBoolean(i10));
    }
}
