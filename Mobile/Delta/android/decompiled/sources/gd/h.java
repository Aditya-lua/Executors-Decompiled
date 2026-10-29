package gd;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.NonNull;
import zc.r;

/* JADX INFO: loaded from: classes2.dex */
public class h {
    @NonNull
    public static d a(int i10) {
        if (i10 != 0) {
            return i10 != 1 ? b() : new e();
        }
        return new j();
    }

    @NonNull
    public static d b() {
        return new j();
    }

    @NonNull
    public static f c() {
        return new f();
    }

    public static void d(@NonNull View view, float f10) {
        Drawable background = view.getBackground();
        if (background instanceof g) {
            ((g) background).Z(f10);
        }
    }

    public static void e(@NonNull View view) {
        Drawable background = view.getBackground();
        if (background instanceof g) {
            f(view, (g) background);
        }
    }

    public static void f(@NonNull View view, @NonNull g gVar) {
        if (gVar.S()) {
            gVar.d0(r.g(view));
        }
    }
}
