package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import p044c8.AbstractC1562h;
import p044c8.InterfaceC1558d;
import p044c8.InterfaceC1567m;
import p597z7.C13735d;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class CctBackendFactory implements InterfaceC1558d {
    @Override // p044c8.InterfaceC1558d
    public InterfaceC1567m create(AbstractC1562h abstractC1562h) {
        return new C13735d(abstractC1562h.mo8155b(), abstractC1562h.mo8158e(), abstractC1562h.mo8157d());
    }
}
