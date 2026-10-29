package ad;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* JADX INFO: renamed from: ad.s */
/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"AppCompatCustomView"})
public class C0147s extends ImageButton {

    /* JADX INFO: renamed from: a */
    public int f514a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0147s(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: renamed from: b */
    public final void m462b(int i10, boolean z10) {
        super.setVisibility(i10);
        if (z10) {
            this.f514a = i10;
        }
    }

    public final int getUserSetVisibility() {
        return this.f514a;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i10) {
        m462b(i10, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C0147s(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f514a = getVisibility();
    }
}
