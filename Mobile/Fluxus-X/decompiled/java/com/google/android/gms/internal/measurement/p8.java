package com.google.android.gms.internal.measurement;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class p8 extends k9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f6770a;
    public final je.s b;

    public p8(Context context, je.s sVar) {
        this.f6770a = context;
        this.b = sVar;
    }

    @Override // com.google.android.gms.internal.measurement.k9
    public final Context a() {
        return this.f6770a;
    }

    @Override // com.google.android.gms.internal.measurement.k9
    public final je.s b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        je.s sVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof k9) {
            k9 k9Var = (k9) obj;
            if (this.f6770a.equals(k9Var.a()) && ((sVar = this.b) != null ? sVar.equals(k9Var.b()) : k9Var.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f6770a.hashCode() ^ 1000003;
        je.s sVar = this.b;
        return (iHashCode * 1000003) ^ (sVar == null ? 0 : sVar.hashCode());
    }

    public final String toString() {
        String string = this.f6770a.toString();
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
