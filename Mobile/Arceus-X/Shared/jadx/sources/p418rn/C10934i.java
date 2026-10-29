package p418rn;

import java.util.Objects;
import p388qn.C10629y;

/* JADX INFO: renamed from: rn.i */
/* JADX INFO: loaded from: classes3.dex */
public class C10934i {

    /* JADX INFO: renamed from: a */
    public final CharSequence f38729a;

    /* JADX INFO: renamed from: b */
    public final C10629y f38730b;

    public C10934i(CharSequence charSequence, C10629y c10629y) {
        Objects.requireNonNull(charSequence, "content must not be null");
        this.f38729a = charSequence;
        this.f38730b = c10629y;
    }

    /* JADX INFO: renamed from: c */
    public static C10934i m41527c(CharSequence charSequence, C10629y c10629y) {
        return new C10934i(charSequence, c10629y);
    }

    /* JADX INFO: renamed from: a */
    public CharSequence m41528a() {
        return this.f38729a;
    }

    /* JADX INFO: renamed from: b */
    public C10629y m41529b() {
        return this.f38730b;
    }

    /* JADX INFO: renamed from: d */
    public C10934i m41530d(int i10, int i11) {
        int i12;
        CharSequence charSequenceSubSequence = this.f38729a.subSequence(i10, i11);
        C10629y c10629y = this.f38730b;
        return m41527c(charSequenceSubSequence, (c10629y == null || (i12 = i11 - i10) == 0) ? null : C10629y.m40715e(this.f38730b.m40719d(), c10629y.m40716a() + i10, this.f38730b.m40717b() + i10, i12));
    }
}
