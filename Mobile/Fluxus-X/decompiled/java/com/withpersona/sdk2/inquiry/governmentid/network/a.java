package com.withpersona.sdk2.inquiry.governmentid.network;

import wt.d;
import wt.i;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements d<AutoClassifyWorker.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<b> f10055a;
    public final i<fr.a> b;

    public a(i<b> iVar, i<fr.a> iVar2) {
        this.f10055a = iVar;
        this.b = iVar2;
    }

    public static a a(i<b> iVar, i<fr.a> iVar2) {
        return new a(iVar, iVar2);
    }

    public static AutoClassifyWorker.b c(b bVar, fr.a aVar) {
        return new AutoClassifyWorker.b(bVar, aVar);
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public AutoClassifyWorker.b get() {
        return c(this.f10055a.get(), this.b.get());
    }
}
