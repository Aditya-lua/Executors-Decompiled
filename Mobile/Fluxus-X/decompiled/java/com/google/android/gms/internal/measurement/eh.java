package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class eh extends k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f6497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f6498d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fh f6499e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eh(fh fhVar, boolean z10, boolean z11) {
        super("log");
        Objects.requireNonNull(fhVar);
        this.f6499e = fhVar;
        this.f6497c = z10;
        this.f6498d = z11;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x006e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0080  */
    /* JADX WARN: Code duplicated, block: B:25:0x008f A[LOOP:0: B:23:0x0085->B:25:0x008f, LOOP_END] */
    @Override // com.google.android.gms.internal.measurement.k
    public final q h(y4 y4Var, List list) {
        int i10;
        int i11;
        String strZzc;
        ArrayList arrayList;
        z5.b("log", 1, list);
        if (list.size() == 1) {
            fh fhVar = this.f6499e;
            fhVar.j().a(3, y4Var.a((q) list.get(0)).zzc(), Collections.EMPTY_LIST, this.f6497c, this.f6498d);
            return q.Co;
        }
        int iG = z5.g(y4Var.a((q) list.get(0)).zzd().doubleValue());
        if (iG != 2) {
            i10 = 3;
            if (iG == 3) {
                i11 = 1;
            } else if (iG == 5) {
                i11 = 5;
            } else if (iG == 6) {
                i11 = 2;
            }
            strZzc = y4Var.a((q) list.get(1)).zzc();
            if (list.size() == 2) {
                fh fhVar2 = this.f6499e;
                fhVar2.j().a(i11, strZzc, Collections.EMPTY_LIST, this.f6497c, this.f6498d);
                return q.Co;
            }
            arrayList = new ArrayList();
            for (int i12 = 2; i12 < Math.min(list.size(), 5); i12++) {
                arrayList.add(y4Var.a((q) list.get(i12)).zzc());
            }
            this.f6499e.j().a(i11, strZzc, arrayList, this.f6497c, this.f6498d);
            return q.Co;
        }
        i10 = 4;
        i11 = i10;
        strZzc = y4Var.a((q) list.get(1)).zzc();
        if (list.size() == 2) {
            fh fhVar3 = this.f6499e;
            fhVar3.j().a(i11, strZzc, Collections.EMPTY_LIST, this.f6497c, this.f6498d);
            return q.Co;
        }
        arrayList = new ArrayList();
        while (i12 < Math.min(list.size(), 5)) {
            arrayList.add(y4Var.a((q) list.get(i12)).zzc());
        }
        this.f6499e.j().a(i11, strZzc, arrayList, this.f6497c, this.f6498d);
        return q.Co;
    }
}
