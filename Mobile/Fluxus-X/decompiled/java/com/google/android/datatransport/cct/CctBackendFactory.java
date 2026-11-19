package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import d8.d;
import d8.h;
import d8.m;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class CctBackendFactory implements d {
    @Override // d8.d
    public m create(h hVar) {
        return new a8.d(hVar.b(), hVar.e(), hVar.d());
    }
}
