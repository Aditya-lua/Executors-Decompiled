package p306nb;

import android.text.TextUtils;

/* JADX INFO: renamed from: nb.z2 */
/* JADX INFO: loaded from: classes.dex */
public final class C9393z2 {

    /* JADX INFO: renamed from: a */
    public final EnumC9207n8 f33703a;

    public C9393z2(EnumC9207n8 enumC9207n8) {
        this.f33703a = enumC9207n8;
    }

    /* JADX INFO: renamed from: c */
    public static C9393z2 m37089c(String str) {
        return new C9393z2((TextUtils.isEmpty(str) || str.length() > 1) ? EnumC9207n8.UNINITIALIZED : C9255q8.m36648j(str.charAt(0)));
    }

    /* JADX INFO: renamed from: a */
    public final EnumC9207n8 m37090a() {
        return this.f33703a;
    }

    /* JADX INFO: renamed from: b */
    public final String m37091b() {
        return String.valueOf(C9255q8.m36649m(this.f33703a));
    }
}
