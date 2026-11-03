package mc;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.d1;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class a extends d1.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f24697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f24698d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f24699e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f24700f;

    public a(View view) {
        super(0);
        this.f24700f = new int[2];
        this.f24697c = view;
    }

    @Override // androidx.core.view.d1.b
    public void b(@NonNull d1 d1Var) {
        this.f24697c.setTranslationY(0.0f);
    }

    @Override // androidx.core.view.d1.b
    public void c(@NonNull d1 d1Var) {
        this.f24697c.getLocationOnScreen(this.f24700f);
        this.f24698d = this.f24700f[1];
    }

    @Override // androidx.core.view.d1.b
    @NonNull
    public WindowInsetsCompat d(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull List<d1> list) {
        for (d1 d1Var : list) {
            if ((d1Var.d() & WindowInsetsCompat.Type.ime()) != 0) {
                this.f24697c.setTranslationY(jc.a.c(this.f24699e, 0, d1Var.c()));
                break;
            }
        }
        return windowInsetsCompat;
    }

    @Override // androidx.core.view.d1.b
    @NonNull
    public d1.a e(@NonNull d1 d1Var, @NonNull d1.a aVar) {
        this.f24697c.getLocationOnScreen(this.f24700f);
        int i10 = this.f24698d - this.f24700f[1];
        this.f24699e = i10;
        this.f24697c.setTranslationY(i10);
        return aVar;
    }
}
