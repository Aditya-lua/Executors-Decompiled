package cd;

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
    public final d f4863a = a();

    @NonNull
    public final cd.b b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final View f4864c;

    public static class b implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public OnBackInvokedCallback f4865a;

        public b() {
        }

        @Override // cd.c.d
        public void a(@NonNull View view) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher();
            if (onBackInvokedDispatcherFindOnBackInvokedDispatcher == null) {
                return;
            }
            onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f4865a);
            this.f4865a = null;
        }

        @Override // cd.c.d
        public void b(@NonNull cd.b bVar, @NonNull View view, boolean z10) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
            if (this.f4865a == null && (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) != null) {
                OnBackInvokedCallback onBackInvokedCallbackC = c(bVar);
                this.f4865a = onBackInvokedCallbackC;
                onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(z10 ? 1000000 : 0, onBackInvokedCallbackC);
            }
        }

        public OnBackInvokedCallback c(@NonNull final cd.b bVar) {
            Objects.requireNonNull(bVar);
            return new OnBackInvokedCallback() { // from class: cd.d
                public final void onBackInvoked() {
                    bVar.d();
                }
            };
        }

        public boolean d() {
            return this.f4865a != null;
        }
    }

    /* JADX INFO: renamed from: cd.c$c, reason: collision with other inner class name */
    public static class C0103c extends b {

        /* JADX INFO: renamed from: cd.c$c$a */
        public class a implements OnBackAnimationCallback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ cd.b f4866a;

            public a(cd.b bVar) {
                this.f4866a = bVar;
            }

            public void onBackCancelled() {
                if (C0103c.this.d()) {
                    this.f4866a.b();
                }
            }

            public void onBackInvoked() {
                this.f4866a.d();
            }

            public void onBackProgressed(@NonNull BackEvent backEvent) {
                if (C0103c.this.d()) {
                    this.f4866a.a(new BackEventCompat(backEvent));
                }
            }

            public void onBackStarted(@NonNull BackEvent backEvent) {
                if (C0103c.this.d()) {
                    this.f4866a.c(new BackEventCompat(backEvent));
                }
            }
        }

        public C0103c() {
            super();
        }

        @Override // cd.c.b
        public OnBackInvokedCallback c(@NonNull cd.b bVar) {
            return new a(bVar);
        }
    }

    public interface d {
        void a(@NonNull View view);

        void b(@NonNull cd.b bVar, @NonNull View view, boolean z10);
    }

    public c(@NonNull cd.b bVar, @NonNull View view) {
        this.b = bVar;
        this.f4864c = view;
    }

    public static d a() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            return new C0103c();
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
        d dVar = this.f4863a;
        if (dVar != null) {
            dVar.b(this.b, this.f4864c, z10);
        }
    }

    public void d() {
        d dVar = this.f4863a;
        if (dVar != null) {
            dVar.a(this.f4864c);
        }
    }
}
