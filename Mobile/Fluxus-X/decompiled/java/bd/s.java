package bd;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"AppCompatCustomView"})
public class s extends ImageButton {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3959a;

    public s(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void b(int i10, boolean z10) {
        super.setVisibility(i10);
        if (z10) {
            this.f3959a = i10;
        }
    }

    public final int getUserSetVisibility() {
        return this.f3959a;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i10) {
        b(i10, true);
    }

    public s(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f3959a = getVisibility();
    }
}
