package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class o5 {
    public static final v5 b = new m5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v5 f7199a;

    public o5() {
        o4 o4VarC = o4.c();
        int i10 = e3.f7032a;
        this.f7199a = new n5(o4VarC, b);
    }

    public final h6 a(Class cls) {
        t6 t6Var = i6.f7107a;
        if (!t4.class.isAssignableFrom(cls)) {
            int i10 = e3.f7032a;
        }
        u5 u5VarA = this.f7199a.a(cls);
        if (u5VarA.zzb()) {
            int i11 = e3.f7032a;
            return b6.g(i6.r(), i4.a(), u5VarA.zza());
        }
        int i12 = e3.f7032a;
        return a6.x(cls, u5VarA, d6.a(), j5.a(), i6.r(), u5VarA.zzc() + (-1) != 1 ? i4.a() : null, t5.a());
    }
}
