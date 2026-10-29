package cn;

import android.view.View;
import kotlin.Metadata;
import p016an.AbstractC0376g0;
import p016an.C0378h0;
import p016an.C0384m;

/* JADX INFO: renamed from: cn.e */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\"\u001e\u0010\u0006\u001a\u00020\u0001*\u00020\u00008BX\u0083\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, m31665d2 = {"Landroid/view/View;", "", "b", "(Landroid/view/View;)Ljava/lang/String;", "getNamedKey$annotations", "(Landroid/view/View;)V", "namedKey", "wf1-container-android"}, m31666k = 2, m31667mv = {1, 6, 0}, m31669xi = 48)
public final class C1684e {
    /* JADX INFO: renamed from: b */
    public static final String m8401b(View view) {
        AbstractC0376g0<?> abstractC0376g0M1433d = C0378h0.m1433d(view);
        Object objMo1422c = abstractC0376g0M1433d == null ? null : abstractC0376g0M1433d.mo1422c();
        C0384m c0384m = objMo1422c == null ? null : (C0384m) objMo1422c;
        String compatibilityKey = c0384m != null ? c0384m.getCompatibilityKey() : null;
        if (compatibilityKey != null) {
            return compatibilityKey;
        }
        throw new IllegalStateException(("Expected " + view + " to be showing a " + ((Object) C0384m.class.getSimpleName()) + "<*> rendering, found " + c0384m).toString());
    }
}
