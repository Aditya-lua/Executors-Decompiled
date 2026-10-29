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
import c2.i;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f1586a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f1587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public i f1588d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1589e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f1590f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f1591g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public View[] f1592h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public HashMap<Integer, String> f1593i;

    public b(Context context) {
        super(context);
        this.f1586a = new int[32];
        this.f1589e = false;
        this.f1592h = null;
        this.f1593i = new HashMap<>();
        this.f1587c = context;
        m(null);
    }

    public final void d(String str) {
        if (str == null || str.length() == 0 || this.f1587c == null) {
            return;
        }
        String strTrim = str.trim();
        int iK = k(strTrim);
        if (iK != 0) {
            this.f1593i.put(Integer.valueOf(iK), strTrim);
            e(iK);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + strTrim + "\"");
    }

    public final void e(int i10) {
        if (i10 == getId()) {
            return;
        }
        int i11 = this.b + 1;
        int[] iArr = this.f1586a;
        if (i11 > iArr.length) {
            this.f1586a = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f1586a;
        int i12 = this.b;
        iArr2[i12] = i10;
        this.b = i12 + 1;
    }

    public final void f(String str) {
        if (str == null || str.length() == 0 || this.f1587c == null) {
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
            if ((layoutParams instanceof ConstraintLayout.b) && strTrim.equals(((ConstraintLayout.b) layoutParams).f1518c0)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    e(childAt.getId());
                }
            }
        }
    }

    public void g() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        h((ConstraintLayout) parent);
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f1586a, this.b);
    }

    public void h(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i10 = 0; i10 < this.b; i10++) {
            View viewQ = constraintLayout.q(this.f1586a[i10]);
            if (viewQ != null) {
                viewQ.setVisibility(visibility);
                if (elevation > 0.0f) {
                    viewQ.setTranslationZ(viewQ.getTranslationZ() + elevation);
                }
            }
        }
    }

    public void i(ConstraintLayout constraintLayout) {
    }

    public final int j(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String resourceEntryName;
        if (str == null || constraintLayout == null || (resources = this.f1587c.getResources()) == null) {
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

    public final int k(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int iJ = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object objL = constraintLayout.l(0, str);
            if (objL instanceof Integer) {
                iJ = ((Integer) objL).intValue();
            }
        }
        if (iJ == 0 && constraintLayout != null) {
            iJ = j(constraintLayout, str);
        }
        if (iJ == 0) {
            try {
                iJ = g2.c.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        return iJ == 0 ? this.f1587c.getResources().getIdentifier(str, "id", this.f1587c.getPackageName()) : iJ;
    }

    public View[] l(ConstraintLayout constraintLayout) {
        View[] viewArr = this.f1592h;
        if (viewArr == null || viewArr.length != this.b) {
            this.f1592h = new View[this.b];
        }
        for (int i10 = 0; i10 < this.b; i10++) {
            this.f1592h[i10] = constraintLayout.q(this.f1586a[i10]);
        }
        return this.f1592h;
    }

    public void m(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, g2.d.V0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == g2.d.f17781o1) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f1590f = string;
                    setIds(string);
                } else if (index == g2.d.f17790p1) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.f1591g = string2;
                    setReferenceTags(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void n(c2.e eVar, boolean z10) {
    }

    public void o(ConstraintLayout constraintLayout) {
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f1590f;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f1591g;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        if (this.f1589e) {
            super.onMeasure(i10, i11);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void p(ConstraintLayout constraintLayout) {
    }

    public void q(ConstraintLayout constraintLayout) {
    }

    public void r(ConstraintLayout constraintLayout) {
        String str;
        int iJ;
        if (isInEditMode()) {
            setIds(this.f1590f);
        }
        i iVar = this.f1588d;
        if (iVar == null) {
            return;
        }
        iVar.c();
        for (int i10 = 0; i10 < this.b; i10++) {
            int i11 = this.f1586a[i10];
            View viewQ = constraintLayout.q(i11);
            if (viewQ == null && (iJ = j(constraintLayout, (str = this.f1593i.get(Integer.valueOf(i11))))) != 0) {
                this.f1586a[i10] = iJ;
                this.f1593i.put(Integer.valueOf(iJ), str);
                viewQ = constraintLayout.q(iJ);
            }
            if (viewQ != null) {
                this.f1588d.a(constraintLayout.r(viewQ));
            }
        }
        this.f1588d.b(constraintLayout.f1491c);
    }

    public void s() {
        if (this.f1588d == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            ((ConstraintLayout.b) layoutParams).f1556v0 = (c2.e) this.f1588d;
        }
    }

    public void setIds(String str) {
        this.f1590f = str;
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.b = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i10);
            if (iIndexOf == -1) {
                d(str.substring(i10));
                return;
            } else {
                d(str.substring(i10, iIndexOf));
                i10 = iIndexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f1591g = str;
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.b = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i10);
            if (iIndexOf == -1) {
                f(str.substring(i10));
                return;
            } else {
                f(str.substring(i10, iIndexOf));
                i10 = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f1590f = null;
        this.b = 0;
        for (int i10 : iArr) {
            e(i10);
        }
    }

    @Override // android.view.View
    public void setTag(int i10, Object obj) {
        super.setTag(i10, obj);
        if (obj == null && this.f1590f == null) {
            e(i10);
        }
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1586a = new int[32];
        this.f1589e = false;
        this.f1592h = null;
        this.f1593i = new HashMap<>();
        this.f1587c = context;
        m(attributeSet);
    }
}
