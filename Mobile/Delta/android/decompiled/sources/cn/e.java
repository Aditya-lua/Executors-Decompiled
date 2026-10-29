package cn;

import an.g0;
import an.h0;
import an.m;
import android.view.View;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\"\u001e\u0010\u0006\u001a\u00020\u0001*\u00020\u00008BX\u0083\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Landroid/view/View;", "", "b", "(Landroid/view/View;)Ljava/lang/String;", "getNamedKey$annotations", "(Landroid/view/View;)V", "namedKey", "wf1-container-android"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class e {
    public static final String b(View view) {
        g0<?> g0VarD = h0.d(view);
        Object objC = g0VarD == null ? null : g0VarD.c();
        m mVar = objC == null ? null : (m) objC;
        String compatibilityKey = mVar != null ? mVar.getCompatibilityKey() : null;
        if (compatibilityKey != null) {
            return compatibilityKey;
        }
        throw new IllegalStateException(("Expected " + view + " to be showing a " + ((Object) m.class.getSimpleName()) + "<*> rendering, found " + mVar).toString());
    }
}
