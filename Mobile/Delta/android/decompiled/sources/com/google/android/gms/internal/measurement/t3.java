package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class t3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f6800a;
    public final u4 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u4 f6801c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x7 f6802d;

    public t3() {
        y yVar = new y();
        this.f6800a = yVar;
        u4 u4Var = new u4(null, yVar);
        this.f6801c = u4Var;
        this.b = u4Var.c();
        x7 x7Var = new x7();
        this.f6802d = x7Var;
        u4Var.e("require", new eh(x7Var));
        x7Var.a("internal.platform", new Callable() { // from class: com.google.android.gms.internal.measurement.x2
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new gh();
            }
        });
        u4Var.e("runtime.counter", new j(Double.valueOf(0.0d)));
    }

    public final q a(u4 u4Var, c8... c8VarArr) {
        q qVarB = q.f6743zo;
        for (c8 c8Var : c8VarArr) {
            qVarB = w6.b(c8Var);
            v5.l(this.f6801c);
            if ((qVarB instanceof r) || (qVarB instanceof p)) {
                qVarB = this.f6800a.b(u4Var, qVarB);
            }
        }
        return qVarB;
    }
}
