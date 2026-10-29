package p352p5;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: p5.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10160b {

    /* JADX INFO: renamed from: a */
    public Animatable2.AnimationCallback f36547a;

    /* JADX INFO: renamed from: p5.b$a */
    public class a extends Animatable2.AnimationCallback {
        public a() {
        }

        @Override // android.graphics.drawable.Animatable2.AnimationCallback
        public void onAnimationEnd(Drawable drawable) {
            AbstractC10160b.this.mo12376b(drawable);
        }

        @Override // android.graphics.drawable.Animatable2.AnimationCallback
        public void onAnimationStart(Drawable drawable) {
            AbstractC10160b.this.mo12377c(drawable);
        }
    }

    /* JADX INFO: renamed from: a */
    public Animatable2.AnimationCallback m39109a() {
        if (this.f36547a == null) {
            this.f36547a = new a();
        }
        return this.f36547a;
    }

    /* JADX INFO: renamed from: b */
    public void mo12376b(Drawable drawable) {
    }

    /* JADX INFO: renamed from: c */
    public void mo12377c(Drawable drawable) {
    }
}
