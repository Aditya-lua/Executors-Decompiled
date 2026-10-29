package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p242k9.C7513w;
import p305n9.C8953m;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public final class Scope extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<Scope> CREATOR = new C7513w();

    /* JADX INFO: renamed from: f */
    public final int f7402f;

    /* JADX INFO: renamed from: g */
    public final String f7403g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Scope(int i10, String str) {
        C8953m.m36042g(str, "scopeUri must not be null or empty");
        this.f7402f = i10;
        this.f7403g = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.f7403g.equals(((Scope) obj).f7403g);
        }
        return false;
    }

    public int hashCode() {
        return this.f7403g.hashCode();
    }

    @NonNull
    public String toString() {
        return this.f7403g;
    }

    @NonNull
    /* JADX INFO: renamed from: v3 */
    public String m9162v3() {
        return this.f7403g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int i11 = this.f7402f;
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38470n(parcel, 1, i11);
        C9718b.m38478v(parcel, 2, m9162v3(), false);
        C9718b.m38458b(parcel, iM38457a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public Scope(@NonNull String str) {
        this(1, str);
    }
}
