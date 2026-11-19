package dd;

import android.os.Build;
import android.view.View;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.NonNull;
import e.BackEventCompat;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f12170a = a();

    @NonNull
    public final dd.b b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final View f12171c;

    public static class b implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public OnBackInvokedCallback f12172a;

        public b() {
        }

        @Override // dd.c.d
        public void a(@NonNull View view) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher();
            if (onBackInvokedDispatcherFindOnBackInvokedDispatcher == null) {
                return;
            }
            onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f12172a);
            this.f12172a = null;
        }

        @Override // dd.c.d
        public void b(@NonNull dd.b bVar, @NonNull View view, boolean z10) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
            if (this.f12172a == null && (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) != null) {
                OnBackInvokedCallback onBackInvokedCallbackC = c(bVar);
                this.f12172a = onBackInvokedCallbackC;
                onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(z10 ? 1000000 : 0, onBackInvokedCallbackC);
            }
        }

        public OnBackInvokedCallback c(@NonNull final dd.b bVar) {
            Objects.requireNonNull(bVar);
            return new OnBackInvokedCallback() { // from class: dd.d
                public final void onBackInvoked() {
                    bVar.d();
                }
            };
        }

        public boolean d() {
            return this.f12172a != null;
        }
    }

    /* JADX INFO: renamed from: dd.c$c, reason: collision with other inner class name */
    public static class C0219c extends b {

        /* JADX INFO: renamed from: dd.c$c$a */
        public class a implements OnBackAnimationCallback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ dd.b f12173a;

            public a(dd.b bVar) {
                this.f12173a = bVar;
            }

            public void onBackCancelled() {
                if (C0219c.this.d()) {
                    this.f12173a.b();
                }
            }

            public void onBackInvoked() {
                this.f12173a.d();
            }

            public void onBackProgressed(@NonNull BackEvent backEvent) {
                if (C0219c.this.d()) {
                    this.f12173a.a(new BackEventCompat(backEvent));
                }
            }

            public void onBackStarted(@NonNull BackEvent backEvent) {
                if (C0219c.this.d()) {
                    this.f12173a.c(new BackEventCompat(backEvent));
                }
            }
        }

        public C0219c() {
            super();
        }

        @Override // dd.c.b
        public OnBackInvokedCallback c(@NonNull dd.b bVar) {
            return new a(bVar);
        }
    }

    public interface d {
        void a(@NonNull View view);

        void b(@NonNull dd.b bVar, @NonNull View view, boolean z10);
    }

    public c(@NonNull dd.b bVar, @NonNull View view) {
        this.b = bVar;
        this.f12171c = view;
    }

    public static d a() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            return new C0219c();
        }
        if (i10 >= 33) {
            return new b();
        }
        return null;
    }

    public void b() {
        c(false);
    }

    public final void c(boolean z10) {
        d dVar = this.f12170a;
        if (dVar != null) {
            dVar.b(this.b, this.f12171c, z10);
        }
    }

    public void d() {
        d dVar = this.f12170a;
        if (dVar != null) {
            dVar.a(this.f12171c);
        }
    }
}
