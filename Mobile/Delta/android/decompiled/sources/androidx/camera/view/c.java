package androidx.camera.view;

import android.graphics.Bitmap;
import android.util.Size;
import android.view.View;
import android.widget.FrameLayout;
import g0.v2;
import me.x;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Size f1453a;
    public FrameLayout b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f1454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1455d = false;

    public interface a {
        void a();
    }

    public c(FrameLayout frameLayout, b bVar) {
        this.b = frameLayout;
        this.f1454c = bVar;
    }

    public Bitmap a() {
        Bitmap bitmapC = c();
        if (bitmapC == null) {
            return null;
        }
        return this.f1454c.a(bitmapC, new Size(this.b.getWidth(), this.b.getHeight()), this.b.getLayoutDirection());
    }

    public abstract View b();

    public abstract Bitmap c();

    public abstract void d();

    public abstract void e();

    public void f() {
        this.f1455d = true;
        h();
    }

    public abstract void g(v2 v2Var, a aVar);

    public void h() {
        View viewB = b();
        if (viewB == null || !this.f1455d) {
            return;
        }
        this.f1454c.s(new Size(this.b.getWidth(), this.b.getHeight()), this.b.getLayoutDirection(), viewB);
    }

    public abstract x<Void> i();
}
