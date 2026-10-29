package p126fd;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import p168hd.C6363g;
import p168hd.C6367k;
import p168hd.InterfaceC6370n;

/* JADX INFO: renamed from: fd.a */
/* JADX INFO: loaded from: classes2.dex */
public class C5583a extends Drawable implements InterfaceC6370n {

    /* JADX INFO: renamed from: a */
    public b f21374a;

    /* JADX DEBUG: Method merged with bridge method: mutate()Landroid/graphics/drawable/Drawable; */
    @Override // android.graphics.drawable.Drawable
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C5583a mutate() {
        this.f21374a = new b(this.f21374a);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        b bVar = this.f21374a;
        if (bVar.f21376b) {
            bVar.f21375a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f21374a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f21374a.f21375a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(@NonNull Rect rect) {
        super.onBoundsChange(rect);
        this.f21374a.f21375a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(@NonNull int[] iArr) {
        boolean zOnStateChange = super.onStateChange(iArr);
        if (this.f21374a.f21375a.setState(iArr)) {
            zOnStateChange = true;
        }
        boolean zM25242b = C5584b.m25242b(iArr);
        b bVar = this.f21374a;
        if (bVar.f21376b == zM25242b) {
            return zOnStateChange;
        }
        bVar.f21376b = zM25242b;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f21374a.f21375a.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f21374a.f21375a.setColorFilter(colorFilter);
    }

    @Override // p168hd.InterfaceC6370n
    public void setShapeAppearanceModel(@NonNull C6367k c6367k) {
        this.f21374a.f21375a.setShapeAppearanceModel(c6367k);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        this.f21374a.f21375a.setTint(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f21374a.f21375a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f21374a.f21375a.setTintMode(mode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C5583a(C6367k c6367k) {
        this(new b(new C6363g(c6367k)));
    }

    /* JADX INFO: renamed from: fd.a$b */
    public static final class b extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a */
        @NonNull
        public C6363g f21375a;

        /* JADX INFO: renamed from: b */
        public boolean f21376b;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public b(C6363g c6363g) {
            this.f21375a = c6363g;
            this.f21376b = false;
        }

        /* JADX DEBUG: Method merged with bridge method: newDrawable()Landroid/graphics/drawable/Drawable; */
        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C5583a newDrawable() {
            return new C5583a(new b(this));
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        public b(@NonNull b bVar) {
            this.f21375a = (C6363g) bVar.f21375a.getConstantState().newDrawable();
            this.f21376b = bVar.f21376b;
        }
    }

    public C5583a(b bVar) {
        this.f21374a = bVar;
    }
}
