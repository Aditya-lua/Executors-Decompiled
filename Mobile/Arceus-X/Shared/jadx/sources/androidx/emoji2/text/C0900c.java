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
import p504w1.C12278b;
import p533x2.C12637g;
import p593z3.AbstractC13694e;
import p593z3.C13693d;
import p593z3.C13698i;
import p593z3.C13699j;

/* JADX INFO: renamed from: androidx.emoji2.text.c */
/* JADX INFO: loaded from: classes.dex */
public class C0900c {

    /* JADX INFO: renamed from: o */
    public static final Object f3172o = new Object();

    /* JADX INFO: renamed from: p */
    public static final Object f3173p = new Object();

    /* JADX INFO: renamed from: q */
    public static volatile C0900c f3174q;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final Set<f> f3176b;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final b f3179e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final h f3180f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final j f3181g;

    /* JADX INFO: renamed from: h */
    public final boolean f3182h;

    /* JADX INFO: renamed from: i */
    public final boolean f3183i;

    /* JADX INFO: renamed from: j */
    public final int[] f3184j;

    /* JADX INFO: renamed from: k */
    public final boolean f3185k;

    /* JADX INFO: renamed from: l */
    public final int f3186l;

    /* JADX INFO: renamed from: m */
    public final int f3187m;

    /* JADX INFO: renamed from: n */
    public final e f3188n;

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ReadWriteLock f3175a = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: c */
    public volatile int f3177c = 3;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final Handler f3178d = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: androidx.emoji2.text.c$a */
    public static final class a extends b {

        /* JADX INFO: renamed from: b */
        public volatile C0901d f3189b;

        /* JADX INFO: renamed from: c */
        public volatile C0903f f3190c;

        /* JADX INFO: renamed from: androidx.emoji2.text.c$a$a, reason: collision with other inner class name */
        public class C14074a extends i {
            public C14074a() {
            }

            @Override // androidx.emoji2.text.C0900c.i
            /* JADX INFO: renamed from: a */
            public void mo4252a(Throwable th2) {
                a.this.f3192a.m4281n(th2);
            }

            @Override // androidx.emoji2.text.C0900c.i
            /* JADX INFO: renamed from: b */
            public void mo4253b(@NonNull C0903f c0903f) {
                a.this.m4293d(c0903f);
            }
        }

        public a(C0900c c0900c) {
            super(c0900c);
        }

        @Override // androidx.emoji2.text.C0900c.b
        /* JADX INFO: renamed from: a */
        public void mo4290a() {
            try {
                this.f3192a.f3180f.mo4250a(new C14074a());
            } catch (Throwable th2) {
                this.f3192a.m4281n(th2);
            }
        }

        @Override // androidx.emoji2.text.C0900c.b
        /* JADX INFO: renamed from: b */
        public CharSequence mo4291b(@NonNull CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
            return this.f3189b.m4304h(charSequence, i10, i11, i12, z10);
        }

        @Override // androidx.emoji2.text.C0900c.b
        /* JADX INFO: renamed from: c */
        public void mo4292c(@NonNull EditorInfo editorInfo) {
            editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.f3190c.m4333e());
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", this.f3192a.f3182h);
        }

        /* JADX INFO: renamed from: d */
        public void m4293d(@NonNull C0903f c0903f) {
            if (c0903f == null) {
                this.f3192a.m4281n(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.f3190c = c0903f;
            C0903f c0903f2 = this.f3190c;
            j jVar = this.f3192a.f3181g;
            e eVar = this.f3192a.f3188n;
            C0900c c0900c = this.f3192a;
            this.f3189b = new C0901d(c0903f2, jVar, eVar, c0900c.f3183i, c0900c.f3184j, C13693d.m50015a());
            this.f3192a.m4282o();
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.c$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final C0900c f3192a;

        public b(C0900c c0900c) {
            this.f3192a = c0900c;
        }

        /* JADX INFO: renamed from: a */
        public void mo4290a() {
            throw null;
        }

        /* JADX INFO: renamed from: b */
        public CharSequence mo4291b(@NonNull CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
            throw null;
        }

        /* JADX INFO: renamed from: c */
        public void mo4292c(@NonNull EditorInfo editorInfo) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.c$c */
    public static abstract class c {

        /* JADX INFO: renamed from: a */
        @NonNull
        public final h f3193a;

        /* JADX INFO: renamed from: b */
        public j f3194b;

        /* JADX INFO: renamed from: c */
        public boolean f3195c;

        /* JADX INFO: renamed from: d */
        public boolean f3196d;

        /* JADX INFO: renamed from: e */
        public int[] f3197e;

        /* JADX INFO: renamed from: f */
        public Set<f> f3198f;

        /* JADX INFO: renamed from: g */
        public boolean f3199g;

        /* JADX INFO: renamed from: h */
        public int f3200h = -16711936;

        /* JADX INFO: renamed from: i */
        public int f3201i = 0;

        /* JADX INFO: renamed from: j */
        @NonNull
        public e f3202j = new C0899b();

        public c(@NonNull h hVar) {
            C12637g.m47076h(hVar, "metadataLoader cannot be null.");
            this.f3193a = hVar;
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public final h m4294a() {
            return this.f3193a;
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public c m4295b(int i10) {
            this.f3201i = i10;
            return this;
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.c$d */
    public static class d implements j {
        @Override // androidx.emoji2.text.C0900c.j
        @NonNull
        /* JADX INFO: renamed from: a */
        public AbstractC13694e mo4296a(@NonNull C13698i c13698i) {
            return new C13699j(c13698i);
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.c$e */
    public interface e {
        /* JADX INFO: renamed from: a */
        boolean mo4267a(@NonNull CharSequence charSequence, int i10, int i11, int i12);
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.c$f */
    public static abstract class f {
        /* JADX INFO: renamed from: a */
        public void mo1889a(Throwable th2) {
        }

        /* JADX INFO: renamed from: b */
        public void mo1890b() {
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.c$g */
    public static class g implements Runnable {

        /* JADX INFO: renamed from: a */
        public final List<f> f3203a;

        /* JADX INFO: renamed from: b */
        public final Throwable f3204b;

        /* JADX INFO: renamed from: c */
        public final int f3205c;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public g(@NonNull f fVar, int i10) {
            this(Arrays.asList((f) C12637g.m47076h(fVar, "initCallback cannot be null")), i10, null);
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f3203a.size();
            int i10 = 0;
            if (this.f3205c != 1) {
                while (i10 < size) {
                    this.f3203a.get(i10).mo1889a(this.f3204b);
                    i10++;
                }
            } else {
                while (i10 < size) {
                    this.f3203a.get(i10).mo1890b();
                    i10++;
                }
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public g(@NonNull Collection<f> collection, int i10) {
            this(collection, i10, null);
        }

        public g(@NonNull Collection<f> collection, int i10, Throwable th2) {
            C12637g.m47076h(collection, "initCallbacks cannot be null");
            this.f3203a = new ArrayList(collection);
            this.f3205c = i10;
            this.f3204b = th2;
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.c$h */
    public interface h {
        /* JADX INFO: renamed from: a */
        void mo4250a(@NonNull i iVar);
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.c$i */
    public static abstract class i {
        /* JADX INFO: renamed from: a */
        public abstract void mo4252a(Throwable th2);

        /* JADX INFO: renamed from: b */
        public abstract void mo4253b(@NonNull C0903f c0903f);
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.c$j */
    public interface j {
        @NonNull
        /* JADX INFO: renamed from: a */
        AbstractC13694e mo4296a(@NonNull C13698i c13698i);
    }

    public C0900c(@NonNull c cVar) {
        this.f3182h = cVar.f3195c;
        this.f3183i = cVar.f3196d;
        this.f3184j = cVar.f3197e;
        this.f3185k = cVar.f3199g;
        this.f3186l = cVar.f3200h;
        this.f3180f = cVar.f3193a;
        this.f3187m = cVar.f3201i;
        this.f3188n = cVar.f3202j;
        C12278b c12278b = new C12278b();
        this.f3176b = c12278b;
        j jVar = cVar.f3194b;
        this.f3181g = jVar == null ? new d() : jVar;
        Set<f> set = cVar.f3198f;
        if (set != null && !set.isEmpty()) {
            c12278b.addAll(cVar.f3198f);
        }
        this.f3179e = new a(this);
        m4280m();
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C0900c m4270c() {
        C0900c c0900c;
        synchronized (f3172o) {
            c0900c = f3174q;
            C12637g.m47078j(c0900c != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return c0900c;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m4271f(@NonNull InputConnection inputConnection, @NonNull Editable editable, int i10, int i11, boolean z10) {
        return C0901d.m4298b(inputConnection, editable, i10, i11, z10);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m4272g(@NonNull Editable editable, int i10, @NonNull KeyEvent keyEvent) {
        return C0901d.m4299c(editable, i10, keyEvent);
    }

    @NonNull
    /* JADX INFO: renamed from: h */
    public static C0900c m4273h(@NonNull c cVar) {
        C0900c c0900c;
        C0900c c0900c2 = f3174q;
        if (c0900c2 != null) {
            return c0900c2;
        }
        synchronized (f3172o) {
            try {
                c0900c = f3174q;
                if (c0900c == null) {
                    c0900c = new C0900c(cVar);
                    f3174q = c0900c;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c0900c;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m4274i() {
        return f3174q != null;
    }

    /* JADX INFO: renamed from: d */
    public int m4275d() {
        return this.f3186l;
    }

    /* JADX INFO: renamed from: e */
    public int m4276e() {
        this.f3175a.readLock().lock();
        try {
            return this.f3177c;
        } finally {
            this.f3175a.readLock().unlock();
        }
    }

    /* JADX INFO: renamed from: j */
    public boolean m4277j() {
        return this.f3185k;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m4278k() {
        return m4276e() == 1;
    }

    /* JADX INFO: renamed from: l */
    public void m4279l() {
        C12637g.m47078j(this.f3187m == 1, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (m4278k()) {
            return;
        }
        this.f3175a.writeLock().lock();
        try {
            if (this.f3177c == 0) {
                this.f3175a.writeLock().unlock();
                return;
            }
            this.f3177c = 0;
            this.f3175a.writeLock().unlock();
            this.f3179e.mo4290a();
        } catch (Throwable th2) {
            this.f3175a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m4280m() {
        this.f3175a.writeLock().lock();
        try {
            if (this.f3187m == 0) {
                this.f3177c = 0;
            }
            this.f3175a.writeLock().unlock();
            if (m4276e() == 0) {
                this.f3179e.mo4290a();
            }
        } catch (Throwable th2) {
            this.f3175a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: n */
    public void m4281n(Throwable th2) {
        ArrayList arrayList = new ArrayList();
        this.f3175a.writeLock().lock();
        try {
            this.f3177c = 2;
            arrayList.addAll(this.f3176b);
            this.f3176b.clear();
            this.f3175a.writeLock().unlock();
            this.f3178d.post(new g(arrayList, this.f3177c, th2));
        } catch (Throwable th3) {
            this.f3175a.writeLock().unlock();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: o */
    public void m4282o() {
        ArrayList arrayList = new ArrayList();
        this.f3175a.writeLock().lock();
        try {
            this.f3177c = 1;
            arrayList.addAll(this.f3176b);
            this.f3176b.clear();
            this.f3175a.writeLock().unlock();
            this.f3178d.post(new g(arrayList, this.f3177c));
        } catch (Throwable th2) {
            this.f3175a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: p */
    public CharSequence m4283p(CharSequence charSequence) {
        return m4284q(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    /* JADX INFO: renamed from: q */
    public CharSequence m4284q(CharSequence charSequence, int i10, int i11) {
        return m4285r(charSequence, i10, i11, Integer.MAX_VALUE);
    }

    /* JADX INFO: renamed from: r */
    public CharSequence m4285r(CharSequence charSequence, int i10, int i11, int i12) {
        return m4286s(charSequence, i10, i11, i12, 0);
    }

    /* JADX INFO: renamed from: s */
    public CharSequence m4286s(CharSequence charSequence, int i10, int i11, int i12, int i13) {
        boolean z10;
        C12637g.m47078j(m4278k(), "Not initialized yet");
        C12637g.m47073e(i10, "start cannot be negative");
        C12637g.m47073e(i11, "end cannot be negative");
        C12637g.m47073e(i12, "maxEmojiCount cannot be negative");
        C12637g.m47070b(i10 <= i11, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        C12637g.m47070b(i10 <= charSequence.length(), "start should be < than charSequence length");
        C12637g.m47070b(i11 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i10 == i11) {
            return charSequence;
        }
        if (i13 != 1) {
            z10 = i13 != 2 ? this.f3182h : false;
        } else {
            z10 = true;
        }
        return this.f3179e.mo4291b(charSequence, i10, i11, i12, z10);
    }

    /* JADX INFO: renamed from: t */
    public void m4287t(@NonNull f fVar) {
        C12637g.m47076h(fVar, "initCallback cannot be null");
        this.f3175a.writeLock().lock();
        try {
            if (this.f3177c == 1 || this.f3177c == 2) {
                this.f3178d.post(new g(fVar, this.f3177c));
            } else {
                this.f3176b.add(fVar);
            }
        } finally {
            this.f3175a.writeLock().unlock();
        }
    }

    /* JADX INFO: renamed from: u */
    public void m4288u(@NonNull f fVar) {
        C12637g.m47076h(fVar, "initCallback cannot be null");
        this.f3175a.writeLock().lock();
        try {
            this.f3176b.remove(fVar);
        } finally {
            this.f3175a.writeLock().unlock();
        }
    }

    /* JADX INFO: renamed from: v */
    public void m4289v(@NonNull EditorInfo editorInfo) {
        if (!m4278k() || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        this.f3179e.mo4292c(editorInfo);
    }
}
