package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class x3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f6921a;
    public final y4 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y4 f6922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b8 f6923d;

    public x3() {
        y yVar = new y();
        this.f6921a = yVar;
        y4 y4Var = new y4(null, yVar);
        this.f6922c = y4Var;
        this.b = y4Var.c();
        b8 b8Var = new b8();
        this.f6923d = b8Var;
        y4Var.e("require", new ih(b8Var));
        b8Var.a("internal.platform", new Callable() { // from class: com.google.android.gms.internal.measurement.b3
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new kh();
            }
        });
        y4Var.e("runtime.counter", new j(Double.valueOf(0.0d)));
    }

    public final q a(y4 y4Var, g8... g8VarArr) {
        q qVarB = q.Co;
        for (g8 g8Var : g8VarArr) {
            qVarB = a7.b(g8Var);
            z5.l(this.f6922c);
            if ((qVarB instanceof r) || (qVarB instanceof p)) {
                qVarB = this.f6921a.b(y4Var, qVarB);
            }
        }
        return qVarB;
    }
}
