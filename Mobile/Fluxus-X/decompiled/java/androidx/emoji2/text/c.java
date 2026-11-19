package androidx.emoji2.text;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Object f2215o = new Object();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Object f2216p = new Object();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static volatile c f2217q;

    @NonNull
    public final Set<f> b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final b f2221e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final h f2222f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final j f2223g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f2224h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f2225i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int[] f2226j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f2227k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f2228l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f2229m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e f2230n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final ReadWriteLock f2218a = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f2219c = 3;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final Handler f2220d = new Handler(Looper.getMainLooper());

    public static final class a extends b {
        public volatile androidx.emoji2.text.d b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile androidx.emoji2.text.f f2231c;

        /* JADX INFO: renamed from: androidx.emoji2.text.c$a$a, reason: collision with other inner class name */
        public class C0043a extends i {
            public C0043a() {
            }

            @Override // androidx.emoji2.text.c.i
            public void a(Throwable th2) {
                a.this.f2233a.n(th2);
            }

            @Override // androidx.emoji2.text.c.i
            public void b(@NonNull androidx.emoji2.text.f fVar) {
                a.this.d(fVar);
            }
        }

        public a(c cVar) {
            super(cVar);
        }

        @Override // androidx.emoji2.text.c.b
        public void a() {
            try {
                this.f2233a.f2222f.a(new C0043a());
            } catch (Throwable th2) {
                this.f2233a.n(th2);
            }
        }

        @Override // androidx.emoji2.text.c.b
        public CharSequence b(@NonNull CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
            return this.b.h(charSequence, i10, i11, i12, z10);
        }

        @Override // androidx.emoji2.text.c.b
        public void c(@NonNull EditorInfo editorInfo) {
            editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.f2231c.e());
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", this.f2233a.f2224h);
        }

        public void d(@NonNull androidx.emoji2.text.f fVar) {
            if (fVar == null) {
                this.f2233a.n(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.f2231c = fVar;
            androidx.emoji2.text.f fVar2 = this.f2231c;
            j jVar = this.f2233a.f2223g;
            e eVar = this.f2233a.f2230n;
            c cVar = this.f2233a;
            this.b = new androidx.emoji2.text.d(fVar2, jVar, eVar, cVar.f2225i, cVar.f2226j, a4.d.a());
            this.f2233a.o();
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f2233a;

        public b(c cVar) {
            this.f2233a = cVar;
        }

        public void a() {
            throw null;
        }

        public CharSequence b(@NonNull CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
            throw null;
        }

        public void c(@NonNull EditorInfo editorInfo) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.c$c, reason: collision with other inner class name */
    public static abstract class AbstractC0044c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final h f2234a;
        public j b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f2235c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f2236d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int[] f2237e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Set<f> f2238f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f2239g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f2240h = -16711936;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f2241i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NonNull
        public e f2242j = new androidx.emoji2.text.b();

        public AbstractC0044c(@NonNull h hVar) {
            x2.g.h(hVar, "metadataLoader cannot be null.");
            this.f2234a = hVar;
        }

        @NonNull
        public final h a() {
            return this.f2234a;
        }

        @NonNull
        public AbstractC0044c b(int i10) {
            this.f2241i = i10;
            return this;
        }
    }

    public static class d implements j {
        @Override // androidx.emoji2.text.c.j
        @NonNull
        public a4.e a(@NonNull a4.i iVar) {
            return new a4.j(iVar);
        }
    }

    public interface e {
        boolean a(@NonNull CharSequence charSequence, int i10, int i11, int i12);
    }

    public static abstract class f {
        public void a(Throwable th2) {
        }

        public void b() {
        }
    }

    public static class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<f> f2243a;
        public final Throwable b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f2244c;

        public g(@NonNull f fVar, int i10) {
            this(Arrays.asList((f) x2.g.h(fVar, "initCallback cannot be null")), i10, null);
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f2243a.size();
            int i10 = 0;
            if (this.f2244c != 1) {
                while (i10 < size) {
                    this.f2243a.get(i10).a(this.b);
                    i10++;
                }
            } else {
                while (i10 < size) {
                    this.f2243a.get(i10).b();
                    i10++;
                }
            }
        }

        public g(@NonNull Collection<f> collection, int i10) {
            this(collection, i10, null);
        }

        public g(@NonNull Collection<f> collection, int i10, Throwable th2) {
            x2.g.h(collection, "initCallbacks cannot be null");
            this.f2243a = new ArrayList(collection);
            this.f2244c = i10;
            this.b = th2;
        }
    }

    public interface h {
        void a(@NonNull i iVar);
    }

    public static abstract class i {
        public abstract void a(Throwable th2);

        public abstract void b(@NonNull androidx.emoji2.text.f fVar);
    }

    public interface j {
        @NonNull
        a4.e a(@NonNull a4.i iVar);
    }

    public c(@NonNull AbstractC0044c abstractC0044c) {
        this.f2224h = abstractC0044c.f2235c;
        this.f2225i = abstractC0044c.f2236d;
        this.f2226j = abstractC0044c.f2237e;
        this.f2227k = abstractC0044c.f2239g;
        this.f2228l = abstractC0044c.f2240h;
        this.f2222f = abstractC0044c.f2234a;
        this.f2229m = abstractC0044c.f2241i;
        this.f2230n = abstractC0044c.f2242j;
        w1.b bVar = new w1.b();
        this.b = bVar;
        j jVar = abstractC0044c.b;
        this.f2223g = jVar == null ? new d() : jVar;
        Set<f> set = abstractC0044c.f2238f;
        if (set != null && !set.isEmpty()) {
            bVar.addAll(abstractC0044c.f2238f);
        }
        this.f2221e = new a(this);
        m();
    }

    @NonNull
    public static c c() {
        c cVar;
        synchronized (f2215o) {
            cVar = f2217q;
            x2.g.j(cVar != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return cVar;
    }

    public static boolean f(@NonNull InputConnection inputConnection, @NonNull Editable editable, int i10, int i11, boolean z10) {
        return androidx.emoji2.text.d.b(inputConnection, editable, i10, i11, z10);
    }

    public static boolean g(@NonNull Editable editable, int i10, @NonNull KeyEvent keyEvent) {
        return androidx.emoji2.text.d.c(editable, i10, keyEvent);
    }

    @NonNull
    public static c h(@NonNull AbstractC0044c abstractC0044c) {
        c cVar;
        c cVar2 = f2217q;
        if (cVar2 != null) {
            return cVar2;
        }
        synchronized (f2215o) {
            try {
                cVar = f2217q;
                if (cVar == null) {
                    cVar = new c(abstractC0044c);
                    f2217q = cVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }

    public static boolean i() {
        return f2217q != null;
    }

    public int d() {
        return this.f2228l;
    }

    public int e() {
        this.f2218a.readLock().lock();
        try {
            return this.f2219c;
        } finally {
            this.f2218a.readLock().unlock();
        }
    }

    public boolean j() {
        return this.f2227k;
    }

    public final boolean k() {
        return e() == 1;
    }

    public void l() {
        x2.g.j(this.f2229m == 1, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (k()) {
            return;
        }
        this.f2218a.writeLock().lock();
        try {
            if (this.f2219c == 0) {
                this.f2218a.writeLock().unlock();
                return;
            }
            this.f2219c = 0;
            this.f2218a.writeLock().unlock();
            this.f2221e.a();
        } catch (Throwable th2) {
            this.f2218a.writeLock().unlock();
            throw th2;
        }
    }

    public final void m() {
        this.f2218a.writeLock().lock();
        try {
            if (this.f2229m == 0) {
                this.f2219c = 0;
            }
            this.f2218a.writeLock().unlock();
            if (e() == 0) {
                this.f2221e.a();
            }
        } catch (Throwable th2) {
            this.f2218a.writeLock().unlock();
            throw th2;
        }
    }

    public void n(Throwable th2) {
        ArrayList arrayList = new ArrayList();
        this.f2218a.writeLock().lock();
        try {
            this.f2219c = 2;
            arrayList.addAll(this.b);
            this.b.clear();
            this.f2218a.writeLock().unlock();
            this.f2220d.post(new g(arrayList, this.f2219c, th2));
        } catch (Throwable th3) {
            this.f2218a.writeLock().unlock();
            throw th3;
        }
    }

    public void o() {
        ArrayList arrayList = new ArrayList();
        this.f2218a.writeLock().lock();
        try {
            this.f2219c = 1;
            arrayList.addAll(this.b);
            this.b.clear();
            this.f2218a.writeLock().unlock();
            this.f2220d.post(new g(arrayList, this.f2219c));
        } catch (Throwable th2) {
            this.f2218a.writeLock().unlock();
            throw th2;
        }
    }

    public CharSequence p(CharSequence charSequence) {
        return q(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    public CharSequence q(CharSequence charSequence, int i10, int i11) {
        return r(charSequence, i10, i11, Integer.MAX_VALUE);
    }

    public CharSequence r(CharSequence charSequence, int i10, int i11, int i12) {
        return s(charSequence, i10, i11, i12, 0);
    }

    public CharSequence s(CharSequence charSequence, int i10, int i11, int i12, int i13) {
        boolean z10;
        x2.g.j(k(), "Not initialized yet");
        x2.g.e(i10, "start cannot be negative");
        x2.g.e(i11, "end cannot be negative");
        x2.g.e(i12, "maxEmojiCount cannot be negative");
        x2.g.b(i10 <= i11, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        x2.g.b(i10 <= charSequence.length(), "start should be < than charSequence length");
        x2.g.b(i11 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i10 == i11) {
            return charSequence;
        }
        if (i13 != 1) {
            z10 = i13 != 2 ? this.f2224h : false;
        } else {
            z10 = true;
        }
        return this.f2221e.b(charSequence, i10, i11, i12, z10);
    }

    public void t(@NonNull f fVar) {
        x2.g.h(fVar, "initCallback cannot be null");
        this.f2218a.writeLock().lock();
        try {
            if (this.f2219c == 1 || this.f2219c == 2) {
                this.f2220d.post(new g(fVar, this.f2219c));
            } else {
                this.b.add(fVar);
            }
        } finally {
            this.f2218a.writeLock().unlock();
        }
    }

    public void u(@NonNull f fVar) {
        x2.g.h(fVar, "initCallback cannot be null");
        this.f2218a.writeLock().lock();
        try {
            this.b.remove(fVar);
        } finally {
            this.f2218a.writeLock().unlock();
        }
    }

    public void v(@NonNull EditorInfo editorInfo) {
        if (!k() || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        this.f2221e.c(editorInfo);
    }
}
