package mc;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.C0593d1;
import androidx.core.view.WindowInsetsCompat;
import java.util.List;
import p216jc.C7137a;

/* JADX INFO: renamed from: mc.a */
/* JADX INFO: loaded from: classes2.dex */
public class C8484a extends C0593d1.b {

    /* JADX INFO: renamed from: c */
    public final View f31191c;

    /* JADX INFO: renamed from: d */
    public int f31192d;

    /* JADX INFO: renamed from: e */
    public int f31193e;

    /* JADX INFO: renamed from: f */
    public final int[] f31194f;

    public C8484a(View view) {
        super(0);
        this.f31194f = new int[2];
        this.f31191c = view;
    }

    @Override // androidx.core.view.C0593d1.b
    /* JADX INFO: renamed from: b */
    public void mo2854b(@NonNull C0593d1 c0593d1) {
        this.f31191c.setTranslationY(0.0f);
    }

    @Override // androidx.core.view.C0593d1.b
    /* JADX INFO: renamed from: c */
    public void mo2855c(@NonNull C0593d1 c0593d1) {
        this.f31191c.getLocationOnScreen(this.f31194f);
        this.f31192d = this.f31194f[1];
    }

    @Override // androidx.core.view.C0593d1.b
    @NonNull
    /* JADX INFO: renamed from: d */
    public WindowInsetsCompat mo2856d(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull List<C0593d1> list) {
        for (C0593d1 c0593d1 : list) {
            if ((c0593d1.m2847d() & WindowInsetsCompat.Type.ime()) != 0) {
                this.f31191c.setTranslationY(C7137a.m29921c(this.f31193e, 0, c0593d1.m2846c()));
                break;
            }
        }
        return windowInsetsCompat;
    }

    @Override // androidx.core.view.C0593d1.b
    @NonNull
    /* JADX INFO: renamed from: e */
    public C0593d1.a mo2857e(@NonNull C0593d1 c0593d1, @NonNull C0593d1.a aVar) {
        this.f31191c.getLocationOnScreen(this.f31194f);
        int i10 = this.f31192d - this.f31194f[1];
        this.f31193e = i10;
        this.f31191c.setTranslationY(i10);
        return aVar;
    }
}
