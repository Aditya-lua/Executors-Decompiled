package androidx.core.view;

import android.os.Build;
import android.view.ScrollFeedbackProvider;
import android.view.View;

/* JADX INFO: renamed from: androidx.core.view.f0 */
/* JADX INFO: loaded from: classes.dex */
public class C0598f0 {

    /* JADX INFO: renamed from: a */
    public final d f2413a;

    /* JADX INFO: renamed from: androidx.core.view.f0$b */
    public static class b implements d {

        /* JADX INFO: renamed from: a */
        public final ScrollFeedbackProvider f2414a;

        public b(View view) {
            this.f2414a = ScrollFeedbackProvider.createProvider(view);
        }

        @Override // androidx.core.view.C0598f0.d
        public void onScrollLimit(int i10, int i11, int i12, boolean z10) {
            this.f2414a.onScrollLimit(i10, i11, i12, z10);
        }

        @Override // androidx.core.view.C0598f0.d
        public void onScrollProgress(int i10, int i11, int i12, int i13) {
            this.f2414a.onScrollProgress(i10, i11, i12, i13);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.f0$c */
    public static class c implements d {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public c() {
        }

        @Override // androidx.core.view.C0598f0.d
        public void onScrollLimit(int i10, int i11, int i12, boolean z10) {
        }

        @Override // androidx.core.view.C0598f0.d
        public void onScrollProgress(int i10, int i11, int i12, int i13) {
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.f0$d */
    public interface d {
        void onScrollLimit(int i10, int i11, int i12, boolean z10);

        void onScrollProgress(int i10, int i11, int i12, int i13);
    }

    public C0598f0(View view) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f2413a = new b(view);
        } else {
            this.f2413a = new c();
        }
    }

    /* JADX INFO: renamed from: a */
    public static C0598f0 m2892a(View view) {
        return new C0598f0(view);
    }

    /* JADX INFO: renamed from: b */
    public void m2893b(int i10, int i11, int i12, boolean z10) {
        this.f2413a.onScrollLimit(i10, i11, i12, z10);
    }

    /* JADX INFO: renamed from: c */
    public void m2894c(int i10, int i11, int i12, int i13) {
        this.f2413a.onScrollProgress(i10, i11, i12, i13);
    }
}
