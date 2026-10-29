package androidx.core.view;

import android.os.Build;
import android.view.ScrollFeedbackProvider;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f1860a;

    public static class b implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ScrollFeedbackProvider f1861a;

        public b(View view) {
            this.f1861a = ScrollFeedbackProvider.createProvider(view);
        }

        @Override // androidx.core.view.f0.d
        public void onScrollLimit(int i10, int i11, int i12, boolean z10) {
            this.f1861a.onScrollLimit(i10, i11, i12, z10);
        }

        @Override // androidx.core.view.f0.d
        public void onScrollProgress(int i10, int i11, int i12, int i13) {
            this.f1861a.onScrollProgress(i10, i11, i12, i13);
        }
    }

    public static class c implements d {
        public c() {
        }

        @Override // androidx.core.view.f0.d
        public void onScrollLimit(int i10, int i11, int i12, boolean z10) {
        }

        @Override // androidx.core.view.f0.d
        public void onScrollProgress(int i10, int i11, int i12, int i13) {
        }
    }

    public interface d {
        void onScrollLimit(int i10, int i11, int i12, boolean z10);

        void onScrollProgress(int i10, int i11, int i12, int i13);
    }

    public f0(View view) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f1860a = new b(view);
        } else {
            this.f1860a = new c();
        }
    }

    public static f0 a(View view) {
        return new f0(view);
    }

    public void b(int i10, int i11, int i12, boolean z10) {
        this.f1860a.onScrollLimit(i10, i11, i12, z10);
    }

    public void c(int i10, int i11, int i12, int i13) {
        this.f1860a.onScrollProgress(i10, i11, i12, i13);
    }
}
