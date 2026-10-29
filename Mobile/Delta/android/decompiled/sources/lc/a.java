package lc;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.d1;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class a extends d1.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f23123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23124d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f23125e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f23126f;

    public a(View view) {
        super(0);
        this.f23126f = new int[2];
        this.f23123c = view;
    }

    @Override // androidx.core.view.d1.b
    public void b(@NonNull d1 d1Var) {
        this.f23123c.setTranslationY(0.0f);
    }

    @Override // androidx.core.view.d1.b
    public void c(@NonNull d1 d1Var) {
        this.f23123c.getLocationOnScreen(this.f23126f);
        this.f23124d = this.f23126f[1];
    }

    @Override // androidx.core.view.d1.b
    @NonNull
    public WindowInsetsCompat d(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull List<d1> list) {
        for (d1 d1Var : list) {
            if ((d1Var.d() & WindowInsetsCompat.Type.ime()) != 0) {
                this.f23123c.setTranslationY(ic.a.c(this.f23125e, 0, d1Var.c()));
                break;
            }
        }
        return windowInsetsCompat;
    }

    @Override // androidx.core.view.d1.b
    @NonNull
    public d1.a e(@NonNull d1 d1Var, @NonNull d1.a aVar) {
        this.f23123c.getLocationOnScreen(this.f23126f);
        int i10 = this.f23124d - this.f23126f[1];
        this.f23125e = i10;
        this.f23123c.setTranslationY(i10);
        return aVar;
    }
}
