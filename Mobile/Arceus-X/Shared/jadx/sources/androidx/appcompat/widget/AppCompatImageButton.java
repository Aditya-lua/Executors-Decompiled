package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import androidx.annotation.NonNull;
import p181i.C6589a;
import p365q.C10367e;
import p365q.C10393p;
import p365q.C10406v0;
import p365q.C10410x0;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatImageButton extends ImageButton {

    /* JADX INFO: renamed from: a */
    public final C10367e f1410a;

    /* JADX INFO: renamed from: b */
    public final C10393p f1411b;

    /* JADX INFO: renamed from: c */
    public boolean f1412c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AppCompatImageButton(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6589a.f25009E);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C10367e c10367e = this.f1410a;
        if (c10367e != null) {
            c10367e.m39824b();
        }
        C10393p c10393p = this.f1411b;
        if (c10393p != null) {
            c10393p.m39977c();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C10367e c10367e = this.f1410a;
        if (c10367e != null) {
            return c10367e.m39825c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C10367e c10367e = this.f1410a;
        if (c10367e != null) {
            return c10367e.m39826d();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C10393p c10393p = this.f1411b;
        if (c10393p != null) {
            return c10393p.m39978d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C10393p c10393p = this.f1411b;
        if (c10393p != null) {
            return c10393p.m39979e();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.f1411b.m39980f() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C10367e c10367e = this.f1410a;
        if (c10367e != null) {
            c10367e.m39828f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C10367e c10367e = this.f1410a;
        if (c10367e != null) {
            c10367e.m39829g(i10);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C10393p c10393p = this.f1411b;
        if (c10393p != null) {
            c10393p.m39977c();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C10393p c10393p = this.f1411b;
        if (c10393p != null && drawable != null && !this.f1412c) {
            c10393p.m39982h(drawable);
        }
        super.setImageDrawable(drawable);
        C10393p c10393p2 = this.f1411b;
        if (c10393p2 != null) {
            c10393p2.m39977c();
            if (this.f1412c) {
                return;
            }
            this.f1411b.m39976b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i10) {
        super.setImageLevel(i10);
        this.f1412c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        this.f1411b.m39983i(i10);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C10393p c10393p = this.f1411b;
        if (c10393p != null) {
            c10393p.m39977c();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C10367e c10367e = this.f1410a;
        if (c10367e != null) {
            c10367e.m39831i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C10367e c10367e = this.f1410a;
        if (c10367e != null) {
            c10367e.m39832j(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C10393p c10393p = this.f1411b;
        if (c10393p != null) {
            c10393p.m39984j(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C10393p c10393p = this.f1411b;
        if (c10393p != null) {
            c10393p.m39985k(mode);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public AppCompatImageButton(@NonNull Context context, AttributeSet attributeSet, int i10) {
        super(C10410x0.m40068b(context), attributeSet, i10);
        this.f1412c = false;
        C10406v0.m40056a(this, getContext());
        C10367e c10367e = new C10367e(this);
        this.f1410a = c10367e;
        c10367e.m39827e(attributeSet, i10);
        C10393p c10393p = new C10393p(this);
        this.f1411b = c10393p;
        c10393p.m39981g(attributeSet, i10);
    }
}
