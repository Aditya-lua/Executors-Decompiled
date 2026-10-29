package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.nio.ByteBuffer;
import u2.o;
import z3.g;
import z3.i;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final a4.b f2462a;

    @NonNull
    public final char[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final a f2463c = new a(Barcode.FORMAT_UPC_E);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final Typeface f2464d;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SparseArray<a> f2465a;
        public i b;

        public a() {
            this(1);
        }

        public a a(int i10) {
            SparseArray<a> sparseArray = this.f2465a;
            if (sparseArray == null) {
                return null;
            }
            return sparseArray.get(i10);
        }

        public final i b() {
            return this.b;
        }

        public void c(@NonNull i iVar, int i10, int i11) {
            a aVarA = a(iVar.b(i10));
            if (aVarA == null) {
                aVarA = new a();
                this.f2465a.put(iVar.b(i10), aVarA);
            }
            if (i11 > i10) {
                aVarA.c(iVar, i10 + 1, i11);
            } else {
                aVarA.b = iVar;
            }
        }

        public a(int i10) {
            this.f2465a = new SparseArray<>(i10);
        }
    }

    public f(@NonNull Typeface typeface, @NonNull a4.b bVar) {
        this.f2464d = typeface;
        this.f2462a = bVar;
        this.b = new char[bVar.k() * 2];
        a(bVar);
    }

    @NonNull
    public static f b(@NonNull Typeface typeface, @NonNull ByteBuffer byteBuffer) {
        try {
            o.a("EmojiCompat.MetadataRepo.create");
            return new f(typeface, g.b(byteBuffer));
        } finally {
            o.b();
        }
    }

    public final void a(a4.b bVar) {
        int iK = bVar.k();
        for (int i10 = 0; i10 < iK; i10++) {
            i iVar = new i(this, i10);
            Character.toChars(iVar.f(), this.b, i10 * 2);
            h(iVar);
        }
    }

    @NonNull
    public char[] c() {
        return this.b;
    }

    @NonNull
    public a4.b d() {
        return this.f2462a;
    }

    public int e() {
        return this.f2462a.l();
    }

    @NonNull
    public a f() {
        return this.f2463c;
    }

    @NonNull
    public Typeface g() {
        return this.f2464d;
    }

    public void h(@NonNull i iVar) {
        x2.g.h(iVar, "emoji metadata cannot be null");
        x2.g.b(iVar.c() > 0, "invalid metadata codepoint length");
        this.f2463c.c(iVar, 0, iVar.c() - 1);
    }
}
