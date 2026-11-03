package com.withpersona.sdk2.inquiry.ui;

import com.withpersona.sdk2.inquiry.ui.network.ComponentParam;
import java.util.Map;
import mr.k6;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements k.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k6 f14004a;

    public l(k6 k6Var) {
        this.f14004a = k6Var;
    }

    public static dt.i<k.a> b(k6 k6Var) {
        return dt.e.a(new l(k6Var));
    }

    @Override // com.withpersona.sdk2.inquiry.ui.k.a
    public k a(String str, String str2, String str3, String str4, Map<String, ? extends ComponentParam> map) {
        return this.f14004a.b(str, str2, str3, str4, map);
    }
}
