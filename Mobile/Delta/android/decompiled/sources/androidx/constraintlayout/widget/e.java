package androidx.constraintlayout.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class e extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1699a;
    public View b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1700c;

    public void a(ConstraintLayout constraintLayout) {
        if (this.b == null) {
            return;
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        ConstraintLayout.b bVar2 = (ConstraintLayout.b) this.b.getLayoutParams();
        bVar2.f1556v0.k1(0);
        c2.e.b bVarA = bVar.f1556v0.A();
        c2.e.b bVar3 = c2.e.b.FIXED;
        if (bVarA != bVar3) {
            bVar.f1556v0.l1(bVar2.f1556v0.W());
        }
        if (bVar.f1556v0.T() != bVar3) {
            bVar.f1556v0.M0(bVar2.f1556v0.x());
        }
        bVar2.f1556v0.k1(8);
    }

    public void b(ConstraintLayout constraintLayout) {
        if (this.f1699a == -1 && !isInEditMode()) {
            setVisibility(this.f1700c);
        }
        View viewFindViewById = constraintLayout.findViewById(this.f1699a);
        this.b = viewFindViewById;
        if (viewFindViewById != null) {
            ((ConstraintLayout.b) viewFindViewById.getLayoutParams()).f1532j0 = true;
            this.b.setVisibility(0);
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.b;
    }

    public int getEmptyVisibility() {
        return this.f1700c;
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int iHeight = rect.height();
            int iWidth = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((iWidth / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((iHeight / 2.0f) + (rect.height() / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i10) {
        View viewFindViewById;
        if (this.f1699a == i10) {
            return;
        }
        View view = this.b;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.b) this.b.getLayoutParams()).f1532j0 = false;
            this.b = null;
        }
        this.f1699a = i10;
        if (i10 == -1 || (viewFindViewById = ((View) getParent()).findViewById(i10)) == null) {
            return;
        }
        viewFindViewById.setVisibility(8);
    }

    public void setEmptyVisibility(int i10) {
        this.f1700c = i10;
    }
}
