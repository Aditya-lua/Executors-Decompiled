package p365q;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.annotation.NonNull;
import p066d3.C4430h;
import p181i.C6598j;

/* JADX INFO: renamed from: q.s */
/* JADX INFO: loaded from: classes.dex */
public class C10399s extends PopupWindow {

    /* JADX INFO: renamed from: b */
    public static final boolean f37461b = false;

    /* JADX INFO: renamed from: a */
    public boolean f37462a;

    public C10399s(@NonNull Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        m40022a(context, attributeSet, i10, i11);
    }

    /* JADX INFO: renamed from: a */
    public final void m40022a(Context context, AttributeSet attributeSet, int i10, int i11) {
        C10357a1 c10357a1M39728v = C10357a1.m39728v(context, attributeSet, C6598j.f25329a2, i10, i11);
        int i12 = C6598j.f25339c2;
        if (c10357a1M39728v.m39747s(i12)) {
            m40023b(c10357a1M39728v.m39729a(i12, false));
        }
        setBackgroundDrawable(c10357a1M39728v.m39735g(C6598j.f25334b2));
        c10357a1M39728v.m39749x();
    }

    /* JADX INFO: renamed from: b */
    public final void m40023b(boolean z10) {
        if (f37461b) {
            this.f37462a = z10;
        } else {
            C4430h.m22289a(this, z10);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i10, int i11) {
        if (f37461b && this.f37462a) {
            i11 -= view.getHeight();
        }
        super.showAsDropDown(view, i10, i11);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i10, int i11, int i12, int i13) {
        if (f37461b && this.f37462a) {
            i11 -= view.getHeight();
        }
        super.update(view, i10, i11, i12, i13);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i10, int i11, int i12) {
        if (f37461b && this.f37462a) {
            i11 -= view.getHeight();
        }
        super.showAsDropDown(view, i10, i11, i12);
    }
}
