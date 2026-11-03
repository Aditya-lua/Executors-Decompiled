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
    public static final Object f2254o = new Object();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Object f2255p = new Object();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static volatile c f2256q;

    @NonNull
    public final Set<f> b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final b f2260e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final h f2261f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final j f2262g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f2263h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f2264i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int[] f2265j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f2266k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f2267l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f2268m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e f2269n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final ReadWriteLock f2257a = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f2258c = 3;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final Handler f2259d = new Handler(Looper.getMainLooper());

    public static final class a extends b {
        public volatile androidx.emoji2.text.d b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile androidx.emoji2.text.f f2270c;

        /* JADX INFO: renamed from: androidx.emoji2.text.c$a$a, reason: collision with other inner class name */
        public class C0031a extends i {
            public C0031a() {
            }

            @Override // androidx.emoji2.text.c.i
            public void a(Throwable th2) {
                a.this.f2272a.n(th2);
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
                this.f2272a.f2261f.a(new C0031a());
            } catch (Throwable th2) {
                this.f2272a.n(th2);
            }
        }

        @Override // androidx.emoji2.text.c.b
        public CharSequence b(@NonNull CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
            return this.b.h(charSequence, i10, i11, i12, z10);
        }

        @Override // androidx.emoji2.text.c.b
        public void c(@NonNull EditorInfo editorInfo) {
            editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.f2270c.e());
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", this.f2272a.f2263h);
        }

        public void d(@NonNull androidx.emoji2.text.f fVar) {
            if (fVar == null) {
                this.f2272a.n(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.f2270c = fVar;
            androidx.emoji2.text.f fVar2 = this.f2270c;
            j jVar = this.f2272a.f2262g;
            e eVar = this.f2272a.f2269n;
            c cVar = this.f2272a;
            this.b = new androidx.emoji2.text.d(fVar2, jVar, eVar, cVar.f2264i, cVar.f2265j, z3.d.a());
            this.f2272a.o();
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f2272a;

        public b(c cVar) {
            this.f2272a = cVar;
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
    public static abstract class AbstractC0032c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final h f2273a;
        public j b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f2274c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f2275d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int[] f2276e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Set<f> f2277f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f2278g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f2279h = -16711936;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f2280i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NonNull
        public e f2281j = new androidx.emoji2.text.b();

        public AbstractC0032c(@NonNull h hVar) {
            x2.g.h(hVar, "metadataLoader cannot be null.");
            this.f2273a = hVar;
        }

        @NonNull
        public final h a() {
            return this.f2273a;
        }

        @NonNull
        public AbstractC0032c b(int i10) {
            this.f2280i = i10;
            return this;
        }
    }

    public static class d implements j {
        @Override // androidx.emoji2.text.c.j
        @NonNull
        public z3.e a(@NonNull z3.i iVar) {
            return new z3.j(iVar);
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
        public final List<f> f2282a;
        public final Throwable b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f2283c;

        public g(@NonNull f fVar, int i10) {
            this(Arrays.asList((f) x2.g.h(fVar, "initCallback cannot be null")), i10, null);
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f2282a.size();
            int i10 = 0;
            if (this.f2283c != 1) {
                while (i10 < size) {
                    this.f2282a.get(i10).a(this.b);
                    i10++;
                }
            } else {
                while (i10 < size) {
                    this.f2282a.get(i10).b();
                    i10++;
                }
            }
        }

        public g(@NonNull Collection<f> collection, int i10) {
            this(collection, i10, null);
        }

        public g(@NonNull Collection<f> collection, int i10, Throwable th2) {
            x2.g.h(collection, "initCallbacks cannot be null");
            this.f2282a = new ArrayList(collection);
            this.f2283c = i10;
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
        z3.e a(@NonNull z3.i iVar);
    }

    public c(@NonNull AbstractC0032c abstractC0032c) {
        this.f2263h = abstractC0032c.f2274c;
        this.f2264i = abstractC0032c.f2275d;
        this.f2265j = abstractC0032c.f2276e;
        this.f2266k = abstractC0032c.f2278g;
        this.f2267l = abstractC0032c.f2279h;
        this.f2261f = abstractC0032c.f2273a;
        this.f2268m = abstractC0032c.f2280i;
        this.f2269n = abstractC0032c.f2281j;
        w1.b bVar = new w1.b();
        this.b = bVar;
        j jVar = abstractC0032c.b;
        this.f2262g = jVar == null ? new d() : jVar;
        Set<f> set = abstractC0032c.f2277f;
        if (set != null && !set.isEmpty()) {
            bVar.addAll(abstractC0032c.f2277f);
        }
        this.f2260e = new a(this);
        m();
    }

    @NonNull
    public static c c() {
        c cVar;
        synchronized (f2254o) {
            cVar = f2256q;
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
    public static c h(@NonNull AbstractC0032c abstractC0032c) {
        c cVar;
        c cVar2 = f2256q;
        if (cVar2 != null) {
            return cVar2;
        }
        synchronized (f2254o) {
            try {
                cVar = f2256q;
                if (cVar == null) {
                    cVar = new c(abstractC0032c);
                    f2256q = cVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }

    public static boolean i() {
        return f2256q != null;
    }

    public int d() {
        return this.f2267l;
    }

    public int e() {
        this.f2257a.readLock().lock();
        try {
            return this.f2258c;
        } finally {
            this.f2257a.readLock().unlock();
        }
    }

    public boolean j() {
        return this.f2266k;
    }

    public final boolean k() {
        return e() == 1;
    }

    public void l() {
        x2.g.j(this.f2268m == 1, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (k()) {
            return;
        }
        this.f2257a.writeLock().lock();
        try {
            if (this.f2258c == 0) {
                this.f2257a.writeLock().unlock();
                return;
            }
            this.f2258c = 0;
            this.f2257a.writeLock().unlock();
            this.f2260e.a();
        } catch (Throwable th2) {
            this.f2257a.writeLock().unlock();
            throw th2;
        }
    }

    public final void m() {
        this.f2257a.writeLock().lock();
        try {
            if (this.f2268m == 0) {
                this.f2258c = 0;
            }
            this.f2257a.writeLock().unlock();
            if (e() == 0) {
                this.f2260e.a();
            }
        } catch (Throwable th2) {
            this.f2257a.writeLock().unlock();
            throw th2;
        }
    }

    public void n(Throwable th2) {
        ArrayList arrayList = new ArrayList();
        this.f2257a.writeLock().lock();
        try {
            this.f2258c = 2;
            arrayList.addAll(this.b);
            this.b.clear();
            this.f2257a.writeLock().unlock();
            this.f2259d.post(new g(arrayList, this.f2258c, th2));
        } catch (Throwable th3) {
            this.f2257a.writeLock().unlock();
            throw th3;
        }
    }

    public void o() {
        ArrayList arrayList = new ArrayList();
        this.f2257a.writeLock().lock();
        try {
            this.f2258c = 1;
            arrayList.addAll(this.b);
            this.b.clear();
            this.f2257a.writeLock().unlock();
            this.f2259d.post(new g(arrayList, this.f2258c));
        } catch (Throwable th2) {
            this.f2257a.writeLock().unlock();
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
            z10 = i13 != 2 ? this.f2263h : false;
        } else {
            z10 = true;
        }
        return this.f2260e.b(charSequence, i10, i11, i12, z10);
    }

    public void t(@NonNull f fVar) {
        x2.g.h(fVar, "initCallback cannot be null");
        this.f2257a.writeLock().lock();
        try {
            if (this.f2258c == 1 || this.f2258c == 2) {
                this.f2259d.post(new g(fVar, this.f2258c));
            } else {
                this.b.add(fVar);
            }
        } finally {
            this.f2257a.writeLock().unlock();
        }
    }

    public void u(@NonNull f fVar) {
        x2.g.h(fVar, "initCallback cannot be null");
        this.f2257a.writeLock().lock();
        try {
            this.b.remove(fVar);
        } finally {
            this.f2257a.writeLock().unlock();
        }
    }

    public void v(@NonNull EditorInfo editorInfo) {
        if (!k() || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        this.f2260e.c(editorInfo);
    }
}
