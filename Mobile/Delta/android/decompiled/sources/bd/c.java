package bd;

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
    public final d f4092a = a();

    @NonNull
    public final bd.b b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final View f4093c;

    public static class b implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public OnBackInvokedCallback f4094a;

        public b() {
        }

        @Override // bd.c.d
        public void a(@NonNull bd.b bVar, @NonNull View view, boolean z10) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
            if (this.f4094a == null && (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) != null) {
                OnBackInvokedCallback onBackInvokedCallbackC = c(bVar);
                this.f4094a = onBackInvokedCallbackC;
                onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(z10 ? 1000000 : 0, onBackInvokedCallbackC);
            }
        }

        @Override // bd.c.d
        public void b(@NonNull View view) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher();
            if (onBackInvokedDispatcherFindOnBackInvokedDispatcher == null) {
                return;
            }
            onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f4094a);
            this.f4094a = null;
        }

        public OnBackInvokedCallback c(@NonNull final bd.b bVar) {
            Objects.requireNonNull(bVar);
            return new OnBackInvokedCallback() { // from class: bd.d
                public final void onBackInvoked() {
                    bVar.d();
                }
            };
        }

        public boolean d() {
            return this.f4094a != null;
        }
    }

    /* JADX INFO: renamed from: bd.c$c, reason: collision with other inner class name */
    public static class C0080c extends b {

        /* JADX INFO: renamed from: bd.c$c$a */
        public class a implements OnBackAnimationCallback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ bd.b f4095a;

            public a(bd.b bVar) {
                this.f4095a = bVar;
            }

            public void onBackCancelled() {
                if (C0080c.this.d()) {
                    this.f4095a.b();
                }
            }

            public void onBackInvoked() {
                this.f4095a.d();
            }

            public void onBackProgressed(@NonNull BackEvent backEvent) {
                if (C0080c.this.d()) {
                    this.f4095a.a(new BackEventCompat(backEvent));
                }
            }

            public void onBackStarted(@NonNull BackEvent backEvent) {
                if (C0080c.this.d()) {
                    this.f4095a.c(new BackEventCompat(backEvent));
                }
            }
        }

        public C0080c() {
            super();
        }

        @Override // bd.c.b
        public OnBackInvokedCallback c(@NonNull bd.b bVar) {
            return new a(bVar);
        }
    }

    public interface d {
        void a(@NonNull bd.b bVar, @NonNull View view, boolean z10);

        void b(@NonNull View view);
    }

    public c(@NonNull bd.b bVar, @NonNull View view) {
        this.b = bVar;
        this.f4093c = view;
    }

    public static d a() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            return new C0080c();
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
        d dVar = this.f4092a;
        if (dVar != null) {
            dVar.a(this.b, this.f4093c, z10);
        }
    }

    public void d() {
        d dVar = this.f4092a;
        if (dVar != null) {
            dVar.b(this.f4093c);
        }
    }
}
