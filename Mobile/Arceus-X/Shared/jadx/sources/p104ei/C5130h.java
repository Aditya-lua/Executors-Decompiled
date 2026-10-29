package p104ei;

import gi.InterfaceC6100a;
import p151gk.C6121n;
import sg.C11295a1;

/* JADX INFO: renamed from: ei.h */
/* JADX INFO: loaded from: classes2.dex */
public class C5130h implements InterfaceC5128f {
    @Override // p104ei.InterfaceC5128f
    /* JADX INFO: renamed from: a */
    public AsyncTaskC5126d mo23929a(String str, C5125c.a[] aVarArr, InterfaceC5134l interfaceC5134l) {
        return new AsyncTaskC5126d(str, interfaceC5134l, aVarArr);
    }

    @Override // p104ei.InterfaceC5128f
    /* JADX INFO: renamed from: b */
    public AsyncTaskC5127e mo23930b(String str, InterfaceC6100a interfaceC6100a, C5125c.a[] aVarArr, InterfaceC5134l interfaceC5134l) {
        return new AsyncTaskC5127e(str, C6121n.m27046c(interfaceC6100a), C11295a1.m42418S(), interfaceC5134l, aVarArr);
    }
}
