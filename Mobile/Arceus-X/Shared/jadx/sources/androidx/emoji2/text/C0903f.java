package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import p005a4.C0067b;
import p456u2.C11786o;
import p533x2.C12637g;
import p593z3.C13696g;
import p593z3.C13698i;

/* JADX INFO: renamed from: androidx.emoji2.text.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0903f {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final C0067b f3233a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final char[] f3234b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final a f3235c = new a(1024);

    /* JADX INFO: renamed from: d */
    @NonNull
    public final Typeface f3236d;

    /* JADX INFO: renamed from: androidx.emoji2.text.f$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final SparseArray<a> f3237a;

        /* JADX INFO: renamed from: b */
        public C13698i f3238b;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public a() {
            this(1);
        }

        /* JADX INFO: renamed from: a */
        public a m4337a(int i10) {
            SparseArray<a> sparseArray = this.f3237a;
            if (sparseArray == null) {
                return null;
            }
            return sparseArray.get(i10);
        }

        /* JADX INFO: renamed from: b */
        public final C13698i m4338b() {
            return this.f3238b;
        }

        /* JADX INFO: renamed from: c */
        public void m4339c(@NonNull C13698i c13698i, int i10, int i11) {
            a aVarM4337a = m4337a(c13698i.m50041b(i10));
            if (aVarM4337a == null) {
                aVarM4337a = new a();
                this.f3237a.put(c13698i.m50041b(i10), aVarM4337a);
            }
            if (i11 > i10) {
                aVarM4337a.m4339c(c13698i, i10 + 1, i11);
            } else {
                aVarM4337a.f3238b = c13698i;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public a(int i10) {
            this.f3237a = new SparseArray<>(i10);
        }
    }

    public C0903f(@NonNull Typeface typeface, @NonNull C0067b c0067b) {
        this.f3236d = typeface;
        this.f3233a = c0067b;
        this.f3234b = new char[c0067b.m165k() * 2];
        m4330a(c0067b);
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static C0903f m4329b(@NonNull Typeface typeface, @NonNull ByteBuffer byteBuffer) {
        try {
            C11786o.m44081a("EmojiCompat.MetadataRepo.create");
            return new C0903f(typeface, C13696g.m50021b(byteBuffer));
        } finally {
            C11786o.m44082b();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m4330a(C0067b c0067b) {
        int iM165k = c0067b.m165k();
        for (int i10 = 0; i10 < iM165k; i10++) {
            C13698i c13698i = new C13698i(this, i10);
            Character.toChars(c13698i.m50045f(), this.f3234b, i10 * 2);
            m4336h(c13698i);
        }
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public char[] m4331c() {
        return this.f3234b;
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public C0067b m4332d() {
        return this.f3233a;
    }

    /* JADX INFO: renamed from: e */
    public int m4333e() {
        return this.f3233a.m166l();
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public a m4334f() {
        return this.f3235c;
    }

    @NonNull
    /* JADX INFO: renamed from: g */
    public Typeface m4335g() {
        return this.f3236d;
    }

    /* JADX INFO: renamed from: h */
    public void m4336h(@NonNull C13698i c13698i) {
        C12637g.m47076h(c13698i, "emoji metadata cannot be null");
        C12637g.m47070b(c13698i.m50042c() > 0, "invalid metadata codepoint length");
        this.f3235c.m4339c(c13698i, 0, c13698i.m50042c() - 1);
    }
}
