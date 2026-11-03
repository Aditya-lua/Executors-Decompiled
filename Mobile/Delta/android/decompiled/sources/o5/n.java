package o5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f27699a;
    public int b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewGroup f27700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f27701d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Runnable f27702e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Runnable f27703f;

    public n(@NonNull ViewGroup viewGroup, @NonNull View view) {
        this.f27700c = viewGroup;
        this.f27701d = view;
    }

    public static n c(@NonNull ViewGroup viewGroup) {
        return (n) viewGroup.getTag(l.f27692c);
    }

    public static void f(@NonNull ViewGroup viewGroup, n nVar) {
        viewGroup.setTag(l.f27692c, nVar);
    }

    public void a() {
        if (this.b > 0 || this.f27701d != null) {
            d().removeAllViews();
            if (this.b > 0) {
                LayoutInflater.from(this.f27699a).inflate(this.b, this.f27700c);
            } else {
                this.f27700c.addView(this.f27701d);
            }
        }
        Runnable runnable = this.f27702e;
        if (runnable != null) {
            runnable.run();
        }
        f(this.f27700c, this);
    }

    public void b() {
        Runnable runnable;
        if (c(this.f27700c) != this || (runnable = this.f27703f) == null) {
            return;
        }
        runnable.run();
    }

    @NonNull
    public ViewGroup d() {
        return this.f27700c;
    }

    public boolean e() {
        return this.b > 0;
    }
}
