package fd;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import hd.g;
import hd.k;
import hd.n;

/* JADX INFO: loaded from: classes2.dex */
public class a extends Drawable implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f17186a;

    @Override // android.graphics.drawable.Drawable
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public a mutate() {
        this.f17186a = new b(this.f17186a);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        b bVar = this.f17186a;
        if (bVar.b) {
            bVar.f17187a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f17186a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f17186a.f17187a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(@NonNull Rect rect) {
        super.onBoundsChange(rect);
        this.f17186a.f17187a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(@NonNull int[] iArr) {
        boolean zOnStateChange = super.onStateChange(iArr);
        if (this.f17186a.f17187a.setState(iArr)) {
            zOnStateChange = true;
        }
        boolean zB = fd.b.b(iArr);
        b bVar = this.f17186a;
        if (bVar.b == zB) {
            return zOnStateChange;
        }
        bVar.b = zB;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f17186a.f17187a.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f17186a.f17187a.setColorFilter(colorFilter);
    }

    @Override // hd.n
    public void setShapeAppearanceModel(@NonNull k kVar) {
        this.f17186a.f17187a.setShapeAppearanceModel(kVar);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        this.f17186a.f17187a.setTint(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f17186a.f17187a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f17186a.f17187a.setTintMode(mode);
    }

    public a(k kVar) {
        this(new b(new g(kVar)));
    }

    public static final class b extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public g f17187a;
        public boolean b;

        public b(g gVar) {
            this.f17187a = gVar;
            this.b = false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a newDrawable() {
            return new a(new b(this));
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        public b(@NonNull b bVar) {
            this.f17187a = (g) bVar.f17187a.getConstantState().newDrawable();
            this.b = bVar.b;
        }
    }

    public a(b bVar) {
        this.f17186a = bVar;
    }
}
