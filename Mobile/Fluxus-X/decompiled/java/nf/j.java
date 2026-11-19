package nf;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.appindexing.internal.Thing;
import o9.q;
import wa.u;

/* JADX INFO: loaded from: classes2.dex */
public final class j extends p9.a {
    public static final Parcelable.Creator<j> CREATOR = new f();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f25518f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f25519g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f25520h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Bundle f25521i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Bundle f25522j;

    public j(boolean z10, int i10, String str, Bundle bundle, Bundle bundle2) {
        this.f25518f = z10;
        this.f25519g = i10;
        this.f25520h = str;
        this.f25521i = bundle == null ? new Bundle() : bundle;
        this.f25522j = bundle2;
        ClassLoader classLoader = j.class.getClassLoader();
        u.a(classLoader);
        bundle2.setClassLoader(classLoader);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return q.b(Boolean.valueOf(this.f25518f), Boolean.valueOf(jVar.f25518f)) && q.b(Integer.valueOf(this.f25519g), Integer.valueOf(jVar.f25519g)) && q.b(this.f25520h, jVar.f25520h) && Thing.E3(this.f25521i, jVar.f25521i) && Thing.E3(this.f25522j, jVar.f25522j);
    }

    public final int hashCode() {
        return q.c(Boolean.valueOf(this.f25518f), Integer.valueOf(this.f25519g), this.f25520h, Integer.valueOf(Thing.C3(this.f25521i)), Integer.valueOf(Thing.C3(this.f25522j)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("worksOffline: ");
        sb2.append(this.f25518f);
        sb2.append(", score: ");
        sb2.append(this.f25519g);
        if (!this.f25520h.isEmpty()) {
            sb2.append(", accountEmail: ");
            sb2.append(this.f25520h);
        }
        Bundle bundle = this.f25521i;
        if (bundle != null && !bundle.isEmpty()) {
            sb2.append(", Properties { ");
            Thing.D3(this.f25521i, sb2);
            sb2.append("}");
        }
        if (!this.f25522j.isEmpty()) {
            sb2.append(", embeddingProperties { ");
            Thing.D3(this.f25522j, sb2);
            sb2.append("}");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = p9.c.a(parcel);
        p9.c.c(parcel, 1, this.f25518f);
        p9.c.n(parcel, 2, this.f25519g);
        p9.c.v(parcel, 3, this.f25520h, false);
        p9.c.f(parcel, 4, this.f25521i, false);
        p9.c.f(parcel, 5, this.f25522j, false);
        p9.c.b(parcel, iA);
    }
}
