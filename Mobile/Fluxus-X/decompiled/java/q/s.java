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
    public boolean f29632a;

    public s(@NonNull Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        a(context, attributeSet, i10, i11);
    }

    public final void a(Context context, AttributeSet attributeSet, int i10, int i11) {
        b1 b1VarV = b1.v(context, attributeSet, i.j.f18864a2, i10, i11);
        if (b1VarV.s(i.j.f18873c2)) {
            b(b1VarV.a(i.j.f18873c2, false));
        }
        setBackgroundDrawable(b1VarV.g(i.j.f18868b2));
        b1VarV.x();
    }

    public final void b(boolean z10) {
        if (b) {
            this.f29632a = z10;
        } else {
            d3.h.a(this, z10);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i10, int i11) {
        if (b && this.f29632a) {
            i11 -= view.getHeight();
        }
        super.showAsDropDown(view, i10, i11);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i10, int i11, int i12, int i13) {
        if (b && this.f29632a) {
            i11 -= view.getHeight();
        }
        super.update(view, i10, i11, i12, i13);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i10, int i11, int i12) {
        if (b && this.f29632a) {
            i11 -= view.getHeight();
        }
        super.showAsDropDown(view, i10, i11, i12);
    }
}
