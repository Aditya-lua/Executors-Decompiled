package p5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f28870a;
    public int b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewGroup f28871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f28872d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Runnable f28873e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Runnable f28874f;

    public n(@NonNull ViewGroup viewGroup, @NonNull View view) {
        this.f28871c = viewGroup;
        this.f28872d = view;
    }

    public static n c(@NonNull ViewGroup viewGroup) {
        return (n) viewGroup.getTag(l.f28863c);
    }

    public static void f(@NonNull ViewGroup viewGroup, n nVar) {
        viewGroup.setTag(l.f28863c, nVar);
    }

    public void a() {
        if (this.b > 0 || this.f28872d != null) {
            d().removeAllViews();
            if (this.b > 0) {
                LayoutInflater.from(this.f28870a).inflate(this.b, this.f28871c);
            } else {
                this.f28871c.addView(this.f28872d);
            }
        }
        Runnable runnable = this.f28873e;
        if (runnable != null) {
            runnable.run();
        }
        f(this.f28871c, this);
    }

    public void b() {
        Runnable runnable;
        if (c(this.f28871c) != this || (runnable = this.f28874f) == null) {
            return;
        }
        runnable.run();
    }

    @NonNull
    public ViewGroup d() {
        return this.f28871c;
    }

    public boolean e() {
        return this.b > 0;
    }
}
