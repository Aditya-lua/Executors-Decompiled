package p408rc;

import ad.C0134f;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.NonNull;
import com.google.android.material.chip.Chip;
import java.util.List;
import p194ic.C6746j;
import p564y2.C13017p;

/* JADX INFO: renamed from: rc.b */
/* JADX INFO: loaded from: classes2.dex */
public class C10814b extends C0134f {

    /* JADX INFO: renamed from: i */
    public static final int f38519i = C6746j.f26126r;

    /* JADX INFO: renamed from: e */
    public int f38520e;

    /* JADX INFO: renamed from: f */
    public int f38521f;

    /* JADX INFO: renamed from: g */
    public d f38522g;

    /* JADX INFO: renamed from: h */
    public final int f38523h;

    /* JADX INFO: renamed from: rc.b$a */
    public class a implements d {
        public a(c cVar) {
        }
    }

    /* JADX INFO: renamed from: rc.b$b */
    public static class b extends ViewGroup.MarginLayoutParams {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public b(int i10, int i11) {
            super(i10, i11);
        }
    }

    /* JADX INFO: renamed from: rc.b$c */
    @Deprecated
    public interface c {
    }

    /* JADX INFO: renamed from: rc.b$d */
    public interface d {
    }

    /* JADX INFO: renamed from: rc.b$e */
    public class e implements ViewGroup.OnHierarchyChangeListener {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0001: THROW (null java.lang.Throwable) */
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ ViewGroup.OnHierarchyChangeListener m41182a(e eVar, ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
            throw null;
        }
    }

    private int getVisibleChipCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if ((getChildAt(i11) instanceof Chip) && m41180e(i11)) {
                i10++;
            }
        }
        return i10;
    }

    @Override // ad.C0134f
    /* JADX INFO: renamed from: c */
    public boolean mo399c() {
        return super.mo399c();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof b);
    }

    /* JADX INFO: renamed from: d */
    public int m41179d(View view) {
        if (!(view instanceof Chip)) {
            return -1;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if ((childAt instanceof Chip) && m41180e(i11)) {
                if (((Chip) childAt) == view) {
                    return i10;
                }
                i10++;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m41180e(int i10) {
        return getChildAt(i10).getVisibility() == 0;
    }

    /* JADX INFO: renamed from: f */
    public boolean m41181f() {
        throw null;
    }

    @Override // android.view.ViewGroup
    @NonNull
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    @NonNull
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        throw null;
    }

    @NonNull
    public List<Integer> getCheckedChipIds() {
        throw null;
    }

    public int getChipSpacingHorizontal() {
        return this.f38520e;
    }

    public int getChipSpacingVertical() {
        return this.f38521f;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        if (this.f38523h != -1) {
            throw null;
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C13017p.m48342O0(accessibilityNodeInfo).m48412n0(C13017p.f.m48453b(getRowCount(), mo399c() ? getVisibleChipCount() : -1, false, m41181f() ? 1 : 2));
    }

    public void setChipSpacing(int i10) {
        setChipSpacingHorizontal(i10);
        setChipSpacingVertical(i10);
    }

    public void setChipSpacingHorizontal(int i10) {
        if (this.f38520e != i10) {
            this.f38520e = i10;
            setItemSpacing(i10);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i10) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i10));
    }

    public void setChipSpacingResource(int i10) {
        setChipSpacing(getResources().getDimensionPixelOffset(i10));
    }

    public void setChipSpacingVertical(int i10) {
        if (this.f38521f != i10) {
            this.f38521f = i10;
            setLineSpacing(i10);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i10) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i10));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i10) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(c cVar) {
        if (cVar == null) {
            setOnCheckedStateChangeListener(null);
        } else {
            setOnCheckedStateChangeListener(new a(cVar));
        }
    }

    public void setOnCheckedStateChangeListener(d dVar) {
        this.f38522g = dVar;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        e.m41182a(null, onHierarchyChangeListener);
    }

    public void setSelectionRequired(boolean z10) {
        throw null;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i10) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i10) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // ad.C0134f
    public void setSingleLine(boolean z10) {
        super.setSingleLine(z10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSingleSelection(boolean z10) {
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.ViewGroup
    @NonNull
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setSingleLine(int i10) {
        setSingleLine(getResources().getBoolean(i10));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setSingleSelection(int i10) {
        setSingleSelection(getResources().getBoolean(i10));
    }
}
