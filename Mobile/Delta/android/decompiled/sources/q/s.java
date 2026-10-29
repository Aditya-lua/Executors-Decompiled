package q;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class s extends PopupWindow {
    public static final boolean b = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f29101a;

    public s(@NonNull Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        a(context, attributeSet, i10, i11);
    }

    public final void a(Context context, AttributeSet attributeSet, int i10, int i11) {
        a1 a1VarV = a1.v(context, attributeSet, i.j.f20021a2, i10, i11);
        int i12 = i.j.f20030c2;
        if (a1VarV.s(i12)) {
            b(a1VarV.a(i12, false));
        }
        setBackgroundDrawable(a1VarV.g(i.j.f20025b2));
        a1VarV.x();
    }

    public final void b(boolean z10) {
        if (b) {
            this.f29101a = z10;
        } else {
            d3.h.a(this, z10);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i10, int i11) {
        if (b && this.f29101a) {
            i11 -= view.getHeight();
        }
        super.showAsDropDown(view, i10, i11);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i10, int i11, int i12, int i13) {
        if (b && this.f29101a) {
            i11 -= view.getHeight();
        }
        super.update(view, i10, i11, i12, i13);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i10, int i11, int i12) {
        if (b && this.f29101a) {
            i11 -= view.getHeight();
        }
        super.showAsDropDown(view, i10, i11, i12);
    }
}
