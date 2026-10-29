package rn;

import java.util.Objects;
import qn.y;

/* JADX INFO: loaded from: classes3.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f29934a;
    public final y b;

    public i(CharSequence charSequence, y yVar) {
        Objects.requireNonNull(charSequence, "content must not be null");
        this.f29934a = charSequence;
        this.b = yVar;
    }

    public static i c(CharSequence charSequence, y yVar) {
        return new i(charSequence, yVar);
    }

    public CharSequence a() {
        return this.f29934a;
    }

    public y b() {
        return this.b;
    }

    public i d(int i10, int i11) {
        int i12;
        CharSequence charSequenceSubSequence = this.f29934a.subSequence(i10, i11);
        y yVar = this.b;
        return c(charSequenceSubSequence, (yVar == null || (i12 = i11 - i10) == 0) ? null : y.e(this.b.d(), yVar.a() + i10, this.b.b() + i10, i12));
    }
}
