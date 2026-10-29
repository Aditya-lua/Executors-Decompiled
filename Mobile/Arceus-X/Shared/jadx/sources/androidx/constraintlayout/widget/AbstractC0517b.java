package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.HashMap;
import p038c2.C1512e;
import p038c2.InterfaceC1516i;
import p142g2.C5968c;
import p142g2.C5969d;

/* JADX INFO: renamed from: androidx.constraintlayout.widget.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0517b extends View {

    /* JADX INFO: renamed from: a */
    public int[] f2058a;

    /* JADX INFO: renamed from: b */
    public int f2059b;

    /* JADX INFO: renamed from: c */
    public Context f2060c;

    /* JADX INFO: renamed from: d */
    public InterfaceC1516i f2061d;

    /* JADX INFO: renamed from: e */
    public boolean f2062e;

    /* JADX INFO: renamed from: f */
    public String f2063f;

    /* JADX INFO: renamed from: g */
    public String f2064g;

    /* JADX INFO: renamed from: h */
    public View[] f2065h;

    /* JADX INFO: renamed from: i */
    public HashMap<Integer, String> f2066i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC0517b(Context context) {
        super(context);
        this.f2058a = new int[32];
        this.f2062e = false;
        this.f2065h = null;
        this.f2066i = new HashMap<>();
        this.f2060c = context;
        mo2439m(null);
    }

    /* JADX INFO: renamed from: d */
    public final void m2478d(String str) {
        if (str == null || str.length() == 0 || this.f2060c == null) {
            return;
        }
        String strTrim = str.trim();
        int iM2485k = m2485k(strTrim);
        if (iM2485k != 0) {
            this.f2066i.put(Integer.valueOf(iM2485k), strTrim);
            m2479e(iM2485k);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + strTrim + "\"");
    }

    /* JADX INFO: renamed from: e */
    public final void m2479e(int i10) {
        if (i10 == getId()) {
            return;
        }
        int i11 = this.f2059b + 1;
        int[] iArr = this.f2058a;
        if (i11 > iArr.length) {
            this.f2058a = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f2058a;
        int i12 = this.f2059b;
        iArr2[i12] = i10;
        this.f2059b = i12 + 1;
    }

    /* JADX INFO: renamed from: f */
    public final void m2480f(String str) {
        if (str == null || str.length() == 0 || this.f2060c == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.C0513b) && strTrim.equals(((ConstraintLayout.C0513b) layoutParams).f1987c0)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    m2479e(childAt.getId());
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public void m2481g() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        m2482h((ConstraintLayout) parent);
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f2058a, this.f2059b);
    }

    /* JADX INFO: renamed from: h */
    public void m2482h(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i10 = 0; i10 < this.f2059b; i10++) {
            View viewM2456q = constraintLayout.m2456q(this.f2058a[i10]);
            if (viewM2456q != null) {
                viewM2456q.setVisibility(visibility);
                if (elevation > 0.0f) {
                    viewM2456q.setTranslationZ(viewM2456q.getTranslationZ() + elevation);
                }
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public void mo2483i(ConstraintLayout constraintLayout) {
    }

    /* JADX INFO: renamed from: j */
    public final int m2484j(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String resourceEntryName;
        if (str == null || constraintLayout == null || (resources = this.f2060c.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            if (childAt.getId() != -1) {
                try {
                    resourceEntryName = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    resourceEntryName = null;
                }
                if (str.equals(resourceEntryName)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: k */
    public final int m2485k(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int iM2484j = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object objM2454l = constraintLayout.m2454l(0, str);
            if (objM2454l instanceof Integer) {
                iM2484j = ((Integer) objM2454l).intValue();
            }
        }
        if (iM2484j == 0 && constraintLayout != null) {
            iM2484j = m2484j(constraintLayout, str);
        }
        if (iM2484j == 0) {
            try {
                iM2484j = C5968c.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        return iM2484j == 0 ? this.f2060c.getResources().getIdentifier(str, "id", this.f2060c.getPackageName()) : iM2484j;
    }

    /* JADX INFO: renamed from: l */
    public View[] m2486l(ConstraintLayout constraintLayout) {
        View[] viewArr = this.f2065h;
        if (viewArr == null || viewArr.length != this.f2059b) {
            this.f2065h = new View[this.f2059b];
        }
        for (int i10 = 0; i10 < this.f2059b; i10++) {
            this.f2065h[i10] = constraintLayout.m2456q(this.f2058a[i10]);
        }
        return this.f2065h;
    }

    /* JADX INFO: renamed from: m */
    public void mo2439m(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C5969d.f22955V0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == C5969d.f23122o1) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f2063f = string;
                    setIds(string);
                } else if (index == C5969d.f23131p1) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.f2064g = string2;
                    setReferenceTags(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: n */
    public void mo2440n(C1512e c1512e, boolean z10) {
    }

    /* JADX INFO: renamed from: o */
    public void m2487o(ConstraintLayout constraintLayout) {
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f2063f;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f2064g;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        if (this.f2062e) {
            super.onMeasure(i10, i11);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m2488p(ConstraintLayout constraintLayout) {
    }

    /* JADX INFO: renamed from: q */
    public void m2489q(ConstraintLayout constraintLayout) {
    }

    /* JADX INFO: renamed from: r */
    public void m2490r(ConstraintLayout constraintLayout) {
        String str;
        int iM2484j;
        if (isInEditMode()) {
            setIds(this.f2063f);
        }
        InterfaceC1516i interfaceC1516i = this.f2061d;
        if (interfaceC1516i == null) {
            return;
        }
        interfaceC1516i.mo7922c();
        for (int i10 = 0; i10 < this.f2059b; i10++) {
            int i11 = this.f2058a[i10];
            View viewM2456q = constraintLayout.m2456q(i11);
            if (viewM2456q == null && (iM2484j = m2484j(constraintLayout, (str = this.f2066i.get(Integer.valueOf(i11))))) != 0) {
                this.f2058a[i10] = iM2484j;
                this.f2066i.put(Integer.valueOf(iM2484j), str);
                viewM2456q = constraintLayout.m2456q(iM2484j);
            }
            if (viewM2456q != null) {
                this.f2061d.mo7920a(constraintLayout.m2457r(viewM2456q));
            }
        }
        this.f2061d.mo7921b(constraintLayout.f1933c);
    }

    /* JADX INFO: renamed from: s */
    public void m2491s() {
        if (this.f2061d == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.C0513b) {
            ((ConstraintLayout.C0513b) layoutParams).f2025v0 = (C1512e) this.f2061d;
        }
    }

    public void setIds(String str) {
        this.f2063f = str;
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.f2059b = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i10);
            if (iIndexOf == -1) {
                m2478d(str.substring(i10));
                return;
            } else {
                m2478d(str.substring(i10, iIndexOf));
                i10 = iIndexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f2064g = str;
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.f2059b = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i10);
            if (iIndexOf == -1) {
                m2480f(str.substring(i10));
                return;
            } else {
                m2480f(str.substring(i10, iIndexOf));
                i10 = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f2063f = null;
        this.f2059b = 0;
        for (int i10 : iArr) {
            m2479e(i10);
        }
    }

    @Override // android.view.View
    public void setTag(int i10, Object obj) {
        super.setTag(i10, obj);
        if (obj == null && this.f2063f == null) {
            m2479e(i10);
        }
    }

    public AbstractC0517b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2058a = new int[32];
        this.f2062e = false;
        this.f2065h = null;
        this.f2066i = new HashMap<>();
        this.f2060c = context;
        mo2439m(attributeSet);
    }
}
