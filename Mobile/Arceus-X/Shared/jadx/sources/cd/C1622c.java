package cd;

import android.os.Build;
import android.view.View;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.NonNull;
import java.util.Objects;
import p088e.BackEventCompat;

/* JADX INFO: renamed from: cd.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C1622c {

    /* JADX INFO: renamed from: a */
    public final d f6310a = m8196a();

    /* JADX INFO: renamed from: b */
    @NonNull
    public final InterfaceC1621b f6311b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final View f6312c;

    /* JADX INFO: renamed from: cd.c$b */
    public static class b implements d {

        /* JADX INFO: renamed from: a */
        public OnBackInvokedCallback f6313a;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public b() {
        }

        @Override // cd.C1622c.d
        /* JADX INFO: renamed from: a */
        public void mo8200a(@NonNull View view) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher();
            if (onBackInvokedDispatcherFindOnBackInvokedDispatcher == null) {
                return;
            }
            onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f6313a);
            this.f6313a = null;
        }

        @Override // cd.C1622c.d
        /* JADX INFO: renamed from: b */
        public void mo8201b(@NonNull InterfaceC1621b interfaceC1621b, @NonNull View view, boolean z10) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
            if (this.f6313a == null && (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) != null) {
                OnBackInvokedCallback onBackInvokedCallbackMo8202c = mo8202c(interfaceC1621b);
                this.f6313a = onBackInvokedCallbackMo8202c;
                onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(z10 ? 1000000 : 0, onBackInvokedCallbackMo8202c);
            }
        }

        /* JADX INFO: renamed from: c */
        public OnBackInvokedCallback mo8202c(@NonNull final InterfaceC1621b interfaceC1621b) {
            Objects.requireNonNull(interfaceC1621b);
            return new OnBackInvokedCallback() { // from class: cd.d
                public final void onBackInvoked() {
                    interfaceC1621b.mo8195d();
                }
            };
        }

        /* JADX INFO: renamed from: d */
        public boolean m8203d() {
            return this.f6313a != null;
        }
    }

    /* JADX INFO: renamed from: cd.c$c */
    public static class c extends b {

        /* JADX INFO: renamed from: cd.c$c$a */
        public class a implements OnBackAnimationCallback {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC1621b f6314a;

            public a(InterfaceC1621b interfaceC1621b) {
                this.f6314a = interfaceC1621b;
            }

            public void onBackCancelled() {
                if (c.this.m8203d()) {
                    this.f6314a.mo8193b();
                }
            }

            public void onBackInvoked() {
                this.f6314a.mo8195d();
            }

            public void onBackProgressed(@NonNull BackEvent backEvent) {
                if (c.this.m8203d()) {
                    this.f6314a.mo8192a(new BackEventCompat(backEvent));
                }
            }

            public void onBackStarted(@NonNull BackEvent backEvent) {
                if (c.this.m8203d()) {
                    this.f6314a.mo8194c(new BackEventCompat(backEvent));
                }
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public c() {
            super();
        }

        @Override // cd.C1622c.b
        /* JADX INFO: renamed from: c */
        public OnBackInvokedCallback mo8202c(@NonNull InterfaceC1621b interfaceC1621b) {
            return new a(interfaceC1621b);
        }
    }

    /* JADX INFO: renamed from: cd.c$d */
    public interface d {
        /* JADX INFO: renamed from: a */
        void mo8200a(@NonNull View view);

        /* JADX INFO: renamed from: b */
        void mo8201b(@NonNull InterfaceC1621b interfaceC1621b, @NonNull View view, boolean z10);
    }

    public C1622c(@NonNull InterfaceC1621b interfaceC1621b, @NonNull View view) {
        this.f6311b = interfaceC1621b;
        this.f6312c = view;
    }

    /* JADX INFO: renamed from: a */
    public static d m8196a() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            return new c();
        }
        if (i10 >= 33) {
            return new b();
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public void m8197b() {
        m8198c(false);
    }

    /* JADX INFO: renamed from: c */
    public final void m8198c(boolean z10) {
        d dVar = this.f6310a;
        if (dVar != null) {
            dVar.mo8201b(this.f6311b, this.f6312c, z10);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m8199d() {
        d dVar = this.f6310a;
        if (dVar != null) {
            dVar.mo8200a(this.f6312c);
        }
    }
}
