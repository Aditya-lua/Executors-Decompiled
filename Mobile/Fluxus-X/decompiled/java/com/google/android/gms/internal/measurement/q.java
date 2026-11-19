package com.google.android.gms.internal.measurement;

import com.github.luben.zstd.BuildConfig;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface q {
    public static final q Co = new v();
    public static final q Do = new o();
    public static final q Eo = new h("continue");
    public static final q Fo = new h("break");
    public static final q Go = new h("return");
    public static final q Ho = new g(Boolean.TRUE);
    public static final q Jo = new g(Boolean.FALSE);
    public static final q Ko = new u(BuildConfig.FLAVOR);

    q a();

    q e(String str, y4 y4Var, List list);

    String zzc();

    Double zzd();

    Boolean zze();

    Iterator zzf();
}
