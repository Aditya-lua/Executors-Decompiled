package p5;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Animatable2.AnimationCallback f28447a;

    public class a extends Animatable2.AnimationCallback {
        public a() {
        }

        @Override // android.graphics.drawable.Animatable2.AnimationCallback
        public void onAnimationEnd(Drawable drawable) {
            b.this.b(drawable);
        }

        @Override // android.graphics.drawable.Animatable2.AnimationCallback
        public void onAnimationStart(Drawable drawable) {
            b.this.c(drawable);
        }
    }

    public Animatable2.AnimationCallback a() {
        if (this.f28447a == null) {
            this.f28447a = new a();
        }
        return this.f28447a;
    }

    public void b(Drawable drawable) {
    }

    public void c(Drawable drawable) {
    }
}
