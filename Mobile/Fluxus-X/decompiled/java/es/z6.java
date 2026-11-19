package es;

import com.withpersona.sdk2.inquiry.ui.network.ComponentParam;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class z6 implements x6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y6 f14677a;

    public z6(y6 y6Var) {
        this.f14677a = y6Var;
    }

    public static wt.i<x6.a> b(y6 y6Var) {
        return wt.e.a(new z6(y6Var));
    }

    @Override // es.x6.a
    public x6 a(String str, String str2, String str3, String str4, Map<String, ? extends ComponentParam> map) {
        return this.f14677a.b(str, str2, str3, str4, map);
    }
}
