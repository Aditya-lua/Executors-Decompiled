package com.google.android.gms.internal.measurement;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class l8 extends g9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f6602a;
    public final ge.s b;

    public l8(Context context, ge.s sVar) {
        this.f6602a = context;
        this.b = sVar;
    }

    @Override // com.google.android.gms.internal.measurement.g9
    public final Context a() {
        return this.f6602a;
    }

    @Override // com.google.android.gms.internal.measurement.g9
    public final ge.s b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        ge.s sVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof g9) {
            g9 g9Var = (g9) obj;
            if (this.f6602a.equals(g9Var.a()) && ((sVar = this.b) != null ? sVar.equals(g9Var.b()) : g9Var.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f6602a.hashCode() ^ 1000003;
        ge.s sVar = this.b;
        return (iHashCode * 1000003) ^ (sVar == null ? 0 : sVar.hashCode());
    }

    public final String toString() {
        String string = this.f6602a.toString();
        int length = string.length();
        String strValueOf = String.valueOf(this.b);
        StringBuilder sb2 = new StringBuilder(length + 45 + strValueOf.length() + 1);
        sb2.append("FlagsContext{context=");
        sb2.append(string);
        sb2.append(", hermeticFileOverrides=");
        sb2.append(strValueOf);
        sb2.append("}");
        return sb2.toString();
    }
}
