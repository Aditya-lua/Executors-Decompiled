package p168hd;

import ad.C0146r;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: hd.h */
/* JADX INFO: loaded from: classes2.dex */
public class C6364h {
    @NonNull
    /* JADX INFO: renamed from: a */
    public static C6360d m27755a(int i10) {
        if (i10 != 0) {
            return i10 != 1 ? m27756b() : new C6361e();
        }
        return new C6366j();
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static C6360d m27756b() {
        return new C6366j();
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C6362f m27757c() {
        return new C6362f();
    }

    /* JADX INFO: renamed from: d */
    public static void m27758d(@NonNull View view, float f10) {
        Drawable background = view.getBackground();
        if (background instanceof C6363g) {
            ((C6363g) background).m27718Z(f10);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m27759e(@NonNull View view) {
        Drawable background = view.getBackground();
        if (background instanceof C6363g) {
            m27760f(view, (C6363g) background);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m27760f(@NonNull View view, @NonNull C6363g c6363g) {
        if (c6363g.m27712S()) {
            c6363g.m27722d0(C0146r.m452g(view));
        }
    }
}
