package p161h6;

import java.util.concurrent.Executor;
import p256ku.AbstractC7888l0;
import p256ku.C7931v1;

/* JADX INFO: renamed from: h6.b */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC6292b {
    /* JADX INFO: renamed from: a */
    Executor mo27570a();

    /* JADX INFO: renamed from: b */
    default AbstractC7888l0 mo27571b() {
        return C7931v1.m32925b(mo27572c());
    }

    /* JADX INFO: renamed from: c */
    InterfaceExecutorC6291a mo27572c();

    /* JADX INFO: renamed from: d */
    default void m27573d(Runnable runnable) {
        mo27572c().execute(runnable);
    }
}
